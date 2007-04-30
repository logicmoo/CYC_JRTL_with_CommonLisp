;;; swank.lisp
;;;
;;; Copyright (C) 2004-2007 Peter Graves <peter@armedbear.org>
;;; $Id: swank.lisp,v 1.21 2007-04-30 23:57:34 piso Exp $
;;;
;;; This program is free software; you can redistribute it and/or
;;; modify it under the terms of the GNU General Public License
;;; as published by the Free Software Foundation; either version 2
;;; of the License, or (at your option) any later version.
;;;
;;; This program is distributed in the hope that it will be useful,
;;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;;; GNU General Public License for more details.
;;;
;;; You should have received a copy of the GNU General Public License
;;; along with this program; if not, write to the Free Software
;;; Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

;;; Adapted from SLIME, the "Superior Lisp Interaction Mode for Emacs",
;;; originally written by Eric Marsden, Luke Gorrie and Helmut Eller.

(in-package "SWANK")

(defvar *stream* nil)

(defvar *swank-format-function*
  #+abcl #'sys:simple-format
  #-abcl #'format)

(defun swank-format (destination control-string &rest args)
  (apply *swank-format-function* destination control-string args))

(defun server-loop ()
  (loop
    (let ((message (swank-protocol:decode-message *stream*)))
      (assert (listp message))
      (let ((kind (first message))
            (form (second message))
            (id (third message)))
        (case kind
          (:eval
           (let ((result (eval form)))
             (swank-protocol:encode-message `(:return (:ok ,result)) *stream*)))
          (:eval-async
           (cond ((eq (car form) 'arglist-for-echo-area)
                  (make-thread
                   (lambda ()
                     (let ((result (eval form)))
                       (swank-protocol:encode-message `(:return
                                                        (:ok ,result)
                                                        ,id)
                                                      *stream*)))))
                 (t
                  ;; These forms get evaluated (in the end) by EVAL-STRING,
                  ;; which returns either a list of values or an error object.
                  (make-thread
                   (lambda ()
                     (let ((values (eval form))
                           result ok)
                       (setf result (format-values-for-echo-area values))
                       (when (listp values) ;; No error.
                         (setf ok t))
                       (swank-protocol:encode-message `(:return
                                                        ,(if ok `(:ok ,result) `(:abort ,result))
                                                        ,id)
                                                      *stream*)))))))
          (t
           (error "SERVER-LOOP: unhandled case: ~S" message)))))))

(defun serve-connection (server-socket)
  (let* ((stream (accept-connection server-socket)))
    (setf *stream* stream)
    (server-loop)))

(defun start-server ()
  (when (probe-file (swank-protocol:port-file))
    (delete-file (swank-protocol:port-file)))
  (let* ((server-socket (create-socket "127.0.0.1" 0))
         (port (local-port server-socket)))
    (make-thread (lambda () (serve-connection server-socket)))
    (with-open-file (s (swank-protocol:port-file)
                       :direction :output
                       :if-exists :supersede
                       :if-does-not-exist :create)
        (swank-format s "~S~%" port))
    (swank-format t "Swank server started on port ~S.~%" port))
  (values))

(defun compound-prefix-match (prefix target)
  (let ((tlen (length target))
        (tpos 0))
    (dotimes (i (length prefix))
      (when (>= tpos tlen)
        (return-from compound-prefix-match nil))
      (let ((c (schar prefix i)))
        (if (eql c #\-)
            (unless (setf tpos (position #\- target :start tpos))
              (return-from compound-prefix-match nil))
            (unless (char-equal c (schar target tpos))
              (return-from compound-prefix-match nil)))
        (incf tpos)))
    t))

(defun prefix-match-p (prefix string)
  "Return true if PREFIX is a prefix of STRING."
  (let ((prefix-length (length prefix)))
    (and (<= prefix-length (length string))
         (dotimes (i prefix-length t)
           (unless (char-equal (schar prefix i) (schar string i))
             (return nil))))))

(defun completion-set (prefix default-package-name)
  (let ((first-colon (position #\: prefix))
        result)
    (cond (first-colon
           ;; Qualified.
           (let* ((last-colon (position #\: prefix :from-end t))
                  (package-prefix (subseq prefix 0 (1+ last-colon)))
                  (package (find-package (string-upcase (subseq prefix 0 first-colon)))))
             (when package
               (let ((internal-p (search "::" prefix)))
                 (setf prefix (subseq prefix (1+ last-colon)))
                 (do-symbols (symbol package)
                   (when (eq (symbol-package symbol) package)
                     (when (compound-prefix-match prefix (symbol-name symbol))
                       (when (or internal-p
                                 (eq (nth-value 1 (find-symbol (symbol-name symbol) package))
                                     :external))
                         (push (concatenate 'string
                                            package-prefix
                                            (symbol-name symbol))
                               result)))))))))
          (t
           ;; Not qualified.
           (let ((package (find-package default-package-name)))
             (when package
               (do-symbols (symbol package)
                 (when (compound-prefix-match prefix (symbol-name symbol))
                   (push (symbol-name symbol) result)))))))
    result))

(defvar keyword-package (find-package "KEYWORD"))

(defun tokenize-symbol (string)
  (let ((package (let ((pos (position #\: string)))
                   (if pos (subseq string 0 pos) nil)))
        (symbol (let ((pos (position #\: string :from-end t)))
                  (if pos (subseq string (1+ pos)) string)))
        (internp (search "::" string)))
    (values symbol package internp)))

(defun parse-symbol (string &optional (package *package*))
  "Find the symbol named STRING.
Return the symbol and a flag indicating whether the symbols was found."
  (multiple-value-bind (sname pname) (tokenize-symbol string)
    (let ((package (cond ((and pname
                               (string= pname ""))
                          keyword-package)
                         (pname
                          (find-package pname))
                         (t
                          package))))
      (if package
          (find-symbol sname package)
          (values nil nil)))))

(defun valid-operator-name-p (string)
  "Test if STRING names a function, macro, or special-operator."
  (let ((symbol (parse-symbol string)))
    (or (fboundp symbol)
        (macro-function symbol)
        (special-operator-p symbol))))

(defun write-arglist (obj stream)
  (cond ((stringp obj)
         (write-string obj stream))
        ((symbolp obj)
         (write-string (symbol-name obj) stream))
        ((listp obj)
         (cond ((and (= (length obj) 2)
                     (eq (car obj) 'FUNCTION))
                (write-char #\# stream)
                (write-char #\' stream)
                (write-arglist (cadr obj) stream))
               (t
                (write-char #\( stream)
                (do* ((list obj (cdr list))
                      (item (car list) (car list)))
                     ((null list))
                  (write-arglist item stream)
                  (when (cdr list)
                    (write-char #\space stream)))
                (write-char #\) stream))))
        (t
         (write obj :stream stream))))

(defun arglist-to-string (arglist package)
  (declare (ignorable package))
  (let ((result
         (with-output-to-string (s)
           (write-arglist arglist s))))
    (swank-format nil "~A" (string-downcase result))))

(defun format-arglist-for-echo-area (symbol name)
  "Return SYMBOL's arglist as a string for display in the echo area.
   Use the string NAME as operator name."
  (let ((arglist (arglist symbol)))
    (etypecase arglist
      ((member :not-available)
       nil)
      (list
       (arglist-to-string (cons name arglist)
                          (symbol-package symbol))))))

(defun arglist-for-echo-area (names)
  "Return the arglist for the first function, macro, or special operator in NAMES."
  (let ((name (find-if #'valid-operator-name-p names)))
    (when name
      (format-arglist-for-echo-area (parse-symbol name) name))))

(defun find-definitions-for-function-name (function-name package-name)
  (let ((package (if package-name (find-package package-name) *package*)))
    (when package
      (let ((symbol (parse-symbol function-name package)))
        (find-definitions symbol)))))

(defun format-values-for-echo-area (values)
  (let ((*print-readably* nil))
    (cond ((typep values 'error)
           (or (ignore-errors (with-output-to-string (s)
                                (swank-format s "; Error [\"~A\"]" values)))
               "; Error"))
          (values
           (with-output-to-string (s)
             (do* ((values values (cdr values))
                   (value (car values) (car values)))
                  ((null values))
               (prin1 value s)
               (when (cdr values)
                 (princ ", " s)))))
          (t
           "; No value"))))

;; Returns either a (possibly empty) list of values or an error object.
(defun eval-string (string)
  (let (values)
    (handler-case
        (with-input-from-string (stream string)
          (loop
            (let ((form (read stream nil stream)))
              (when (eq form stream)
                (return values))
              (setf values (multiple-value-list (eval form))))))
      (error (e) (return-from eval-string e)))))

(defun eval-region (string package-name)
  (let ((package (if package-name (find-package package-name) *package*)))
    (let* ((*package* (or package *package*))
           (values (eval-string string)))
      (force-output)
      values)))

(defun shorten-string-for-transcript (string)
  (let ((s (string-trim '(#\space #\newline #\return) string)))
    (when (> (length s) 60)
      (setq s (subseq s 0 60)))
    (setq s (substitute #\space #\newline s))
    #+windows
    (setq s (substitute #\space #\return s))
    s))

(defun eval-string-async (string package-name)
  (let ((s (concatenate 'string ";;;; " (shorten-string-for-transcript string) " ...")))
    (write-string s))
  (force-output)
  (let ((package (if package-name (find-package package-name) *package*)))
    (let* ((*package* (or package *package*))
           (values (eval-string string)))
      (force-output)
      values)))

(defun swank-load-file (pathname)
  (force-output)
  (write-string ";;;; Load file ")
  (write-string (namestring pathname))
  (write-string " ...")
  (terpri)
  (force-output)
  (let ((result (load pathname)))
    (list result)))

(defun swank-compile-file (pathname load-p)
  (force-output)
  (write-string ";;;; Compile file ")
  (write-string (namestring pathname))
  (write-string " ...")
  (terpri)
  (force-output)
  (let ((result (let ((output-file (compile-file pathname)))
                  (when (and load-p output-file)
                    (load output-file)))))
    (list result)))

(defun swank-compile-string (string package-name source-pathname source-position)
  (let ((package (if package-name (find-package package-name) *package*)))
    (let* ((*package* (or package *package*))
           values)
      (handler-case
          (setf values (multiple-value-list
                        (funcall
                         (compile nil (read-from-string
                                       (format nil "(~S () ~A)" 'lambda string))))))
        (error (e) (setf values e)))
      (force-output)
      #+abcl
      (unless (typep values 'error)
        (let ((form (read-from-string string)))
          (when (and (consp form) (member (first form) '(defun defmacro)))
            (sys:record-source-information (second form) source-pathname source-position))))
      values)))

(defun swank-describe-symbol (symbol-name package-name)
  (let* ((package (if package-name
                      (find-package package-name)
                      *package*))
         (symbol (and package (find-symbol (string-upcase symbol-name) package))))
  (with-output-to-string (s)
    (if symbol
        (describe symbol s)
        (format s "Can't find symbol ~A in package ~A" symbol-name package-name)))))

(provide '#:swank)
