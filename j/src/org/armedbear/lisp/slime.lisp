;;; slime.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: slime.lisp,v 1.16 2004-09-11 19:18:01 piso Exp $
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
;;; Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

;;; Adapted from SLIME, the "Superior Lisp Interaction Mode for Emacs",
;;; originally written by Eric Marsden, Luke Gorrie and Helmut Eller.

(in-package #:system)

(eval-when (:compile-toplevel :load-toplevel :execute)
  (resolve 'with-mutex)
  (require '#:swank-protocol)
  (sys:load-system-file "swank-package"))

(defpackage #:j
  (:use #:cl #:ext #:java))

(defpackage #:slime
  (:use #:cl #:ext #:j)
  (:export #:complete-symbol
           #:slime-space
           #:edit-definition
           #:eval-region
           #:eval-last-expression
           #:slime-compile-file
           #:slime-compile-and-load-file))

(in-package #:slime)

(defvar *stream* nil)

(defvar *repl-buffer-name* nil)

(defun slime-local-p ()
  (let ((name (buffer-name)))
    (and name
         (search name "jlisp"))))

(defun slime-connected-p ()
  (or (not (null *stream*))
      (slime-local-p)))

(defun connect (host port)
  (when *stream*
    (disconnect))
  (ignore-errors
   (let* ((socket (sys::make-socket host port))
          (stream (and socket (get-socket-stream socket))))
     (when stream
       (setf *stream* stream)
       (return-from connect t)))))

(defun disconnect ()
  (when *stream*
    (ignore-errors
     (close *stream*))
    (setf *stream* nil)))

(defvar *continuation-counter* 0)

(defvar *continuations* '())

(defvar *continuations-lock* (make-mutex))

(defun slime-busy-p ()
  (not (null *continuations*)))

(defun dispatch-return (message)
  (assert (eq (first message) :return))
  (let* ((value (second message))
         (id (third message))
         rec)
    (with-mutex (*continuations-lock*)
      (setf rec (and id (assoc id *continuations*)))
      (when rec
        (setf *continuations* (remove rec *continuations*))))
    (cond (rec
           (cond ((eq (first value) :ok)
                  (funcall (cdr rec) (second value)))
                 ((eq (first value) :abort)
                  (if (second value)
                      (funcall (cdr rec) (second value))
                      (status "Evaluation aborted.")))))
          (t
           (error "Unexpected message: ~S" message)))))

(defun dispatch-loop ()
  (loop
    (let ((message (swank-protocol:decode-message *stream*)))
      (sys::%format t "message = ~S~%" message)
      (when (eq (first message) :return)
        (dispatch-return message)))
    (with-mutex (*continuations-lock*)
      (unless *continuations*
        (return))))
  (sys::%format t "leaving dispatch-loop~%"))

(defun slime-eval (form)
  (if (slime-local-p)
      (eval form)
      (handler-case
          (progn
            (swank-protocol:encode-message `(:eval ,form) *stream*)
            (let* ((message (swank-protocol:decode-message *stream*))
                   (kind (first message)))
              (case kind
                (:return
                 (let ((result (second message)))
                   (when (eq (first result) :ok)
                     (second result)))))))
        (stream-error () (disconnect)))))

(defun slime-eval-async (form continuation)
  (if (slime-local-p)
      nil ;; FIXME
      (handler-case
          (with-mutex (*continuations-lock*)
            (let ((continuations *continuations*)
                  (id (incf *continuation-counter*)))
              (push (cons id 'display-eval-result) *continuations*)
              (swank-protocol:encode-message `(:eval-async ,form ,id) *stream*)
              (unless continuations
                (make-thread #'(lambda () (dispatch-loop))))))
        (stream-error () (disconnect)))))

(defun read-port-and-connect (retries)
  (status "Slime polling for connection...")
  (dotimes (i retries (status "Slime timed out"))
    (when (probe-file (swank-protocol:port-file))
      (with-open-file (s (swank-protocol:port-file)
                         :direction :input)
        (let ((port (read s)))
          (when (connect "127.0.0.1" port)
            (status "Slime connected!")
            (return)))))
    (sleep 1)))

(defun slime ()
  (when *stream*
    (disconnect))
  (unless (slime-local-p)
    (make-thread #'(lambda () (read-port-and-connect 60)))))

(defvar *prefix* nil)
(defvar *completions* ())
(defvar *completion-index* 0)

(defun completions (prefix)
  (slime-eval `(swank:completion-set ,prefix ,(package-name *package*))))

(defun delimiter-p (c)
  (member c '(#\space #\( #\) #\')))

(defun completion-prefix ()
  (let* ((string (line-chars (current-line)))
         (end (mark-charpos (current-point))))
    (do ((start (1- end) (1- start)))
        ((< start 0) (when (> end 0) (subseq string 0 end)))
      (let ((c (schar string start)))
        (when (delimiter-p c)
          (incf start)
          (return (when (> end start) (subseq string start end))))))))

(defun complete-symbol ()
  (when (slime-busy-p)
    (return-from complete-symbol))
  (unless (slime-connected-p)
    (status "Slime not connected")
    (return-from complete-symbol))
  (cond ((eq *last-command* 'complete)
         (unless (> (length *completions*) 1)
           (return-from complete-symbol))
         (undo)
         (incf *completion-index*)
         (when (> *completion-index* (1- (length *completions*)))
           (setf *completion-index* 0)))
        (t
         (setf *prefix* (completion-prefix)
               *completions* nil
               *completion-index* 0)
         (when *prefix*
           (setf *completions* (completions *prefix*)))))
  (when *completions*
    (let* ((completion (string-downcase (nth *completion-index* *completions*)))
           (point (current-point))
           (flags (line-flags (mark-line point))))
      (with-single-undo
        (goto-char (make-mark (mark-line point)
                              (- (mark-charpos point) (length *prefix*))))
        (set-mark point)
        (delete-region)
        (insert completion)
        (setf (line-flags (mark-line point)) flags)))
    (setf *current-command* 'complete))
  (values))

(defun symbol-name-at-point ()
  (let ((string (line-chars (current-line)))
        (point-charpos (mark-charpos (current-point)))
        (begin 0)
        end)
    (when (= point-charpos (length string))
      (decf point-charpos))
    (loop
      (aver (< point-charpos (length string)))
      (cond ((not (delimiter-p (schar string point-charpos)))
             (return))
            ((zerop point-charpos)
             (return-from symbol-name-at-point nil))
            (t
             (decf point-charpos))))
    (dotimes (i point-charpos)
      (let ((c (schar string i)))
        (when (delimiter-p c)
          (setf begin (1+ i)))))
    (do ((i point-charpos (1+ i)))
        ((= i (length string)) (setf end i))
      (when (delimiter-p (schar string i))
        (setf end i)
        (return)))
    (subseq string begin end)))

(defun enclosing-operator-names ()
  "Return the list of operator names of the forms containing point."
  (let ((result ()))
    (save-excursion
      (loop
        (let ((point1 (current-point))
              (point2 (progn (backward-up-list) (current-point))))
          (when (and (equal (mark-line point1) (mark-line point2))
                     (eql (mark-charpos point1) (mark-charpos point2)))
            (return)))
        (unless (looking-at "(")
          (return))
        (when (looking-at "(")
          (forward-char)
          (let ((name (symbol-name-at-point)))
            (cond ((string-equal name "defun")
                   (return))
                  ((null name)
                   (return))
                  (t
                   (push name result))))
          (backward-up-list))))
    (nreverse result)))

(defun slime-space ()
  (unwind-protect
   (when (and (slime-connected-p)
              (not (slime-busy-p)))
     (let ((names (enclosing-operator-names)))
       (when names
         (let ((message (slime-eval `(swank:arglist-for-echo-area (quote ,names)))))
           (when message
             (status message))))))
   (insert #\space)))

(defun find-buffer-package ()
;;   (save-excursion
;;    (when (let ((case-fold-search t)
;;                (regexp "^(\\(cl:\\|common-lisp:\\)?in-package\\>"))
;;            (or (re-search-backward regexp nil t)
;;                (re-search-forward regexp nil t)))
;;      (goto-char (match-end 0))
;;      (skip-chars-forward " \n\t\f\r#")
;;      (let ((pkg (ignore-errors (read (current-buffer)))))
;;        (if pkg (format "%s" pkg))))))
  (let (mark (current-point))
     (loop
        (setf mark (search-backward "(in-package"
                                      :start mark
                                      :ignore-case t
                                      :whole-words-only t))
        (cond ((null mark)
               (return))
              ((eql (mark-charpos mark) 0)
               (return))
              (t
               (move-to-position mark (1- (mark-charpos mark))))))
    (when mark
      (let* ((line-chars (line-chars (mark-line mark)))
             (package-name
              (ignore-errors
               (read-from-string (subseq line-chars
                                         (+ (mark-charpos mark)
                                            (length "(in-package")))))))
        (when package-name
          (string package-name))))))

(defstruct (slime-definition (:type list))
  spec location)

(defun goto-source-location (name location)
  (when (eq (car location) :location)
    (let (file position function-name)
      (dolist (item (cdr location))
        (case (car item)
          (:file
           (setf file (cadr item)))
          (:position
           (setf position (cadr item)))))
      (when file
        (let ((buffer (find-file-buffer file)))
          (when buffer
            (let* ((short-name
                    (let ((index (position #\: name :from-end t)))
                      (if index (subseq name (1+ index)) name))))
              (switch-to-buffer buffer)
              (with-single-undo
                (goto-char (or position 0))
                (let* ((pattern (format nil "^\\s*\\(def\\S*\\s+~A" short-name))
                       (pos (re-search-forward pattern
                                               :ignore-case t
                                               :whole-words-only t)))
                  (when pos
                    (goto-char pos))
                  (setf pos (search-forward short-name :ignore-case t))
                  (when pos
                    (goto-char pos))))
              (update-display))))))))

;; FIXME
(defun find-tag-at-point ()
  (j::%execute-command "findTagAtDot"))

;; FIXME
(defun push-position ()
  (j::%execute-command "pushPosition"))

(defun edit-definition (&optional function-name package-name)
  (unless (slime-connected-p)
    (find-tag-at-point)
    (return-from edit-definition))
  (let ((pathname (buffer-pathname (current-buffer))))
    (when (and pathname
               (string-equal (pathname-type pathname) "el"))
      (find-tag-at-point)
      (return-from edit-definition)))
  (unless function-name
    (setf function-name (string-upcase (symbol-name-at-point))))
  (when function-name
    (setf function-name (string function-name))
    (let ((definitions
            (slime-eval `(swank:find-definitions-for-function-name ,function-name
                                                                   ,package-name))))
      (cond (definitions
              (push-position)
              (goto-source-location function-name
                                    (slime-definition-location (car definitions))))
            (t
             (find-tag-at-point))))))

(defun eval-region ()
  (let ((mark (current-mark)))
    (when mark
      (let* ((string (buffer-substring (current-point) mark))
             (package (find-buffer-package)))
        (slime-eval-async
         `(swank:eval-region ,string ,package) 'display-eval-result)))))

(defun last-expression ()
  (let (start end)
    (backward-sexp)
    (setf start (current-point))
    (undo)
    (setf end (current-point))
    (buffer-substring start end)))

(defun display-eval-result (value)
  (status value))

(defun eval-last-expression ()
  (let* ((string (last-expression))
         (package (find-buffer-package)))
    (slime-eval-async
     `(swank:eval-string-async ,string ,package) 'display-eval-result)))

(defun slime-compile-file ()
  (let ((pathname (buffer-pathname)))
    (sys::%format t "pathname = ~S~%" pathname)
    (slime-eval-async
     `(swank:swank-compile-file ,pathname nil) 'display-eval-result)))

(defun slime-compile-and-load-file ()
  (let ((pathname (buffer-pathname)))
    (sys::%format t "pathname = ~S~%" pathname)
    (slime-eval-async
     `(swank:swank-compile-file ,pathname t) 'display-eval-result)))

(map-key-for-mode "Tab" "(slime:complete-symbol)" "Lisp Shell")
(map-key-for-mode "Ctrl Alt I" "(slime:complete-symbol)" "Lisp")
(map-key-for-mode "Space" "(slime:slime-space)" "Lisp Shell")
(map-key-for-mode "Space" "(slime:slime-space)" "Lisp")
(map-key-for-mode "Alt ." "(slime:edit-definition)" "Lisp Shell")
(map-key-for-mode "Alt ." "(slime:edit-definition)" "Lisp")
(map-key-for-mode "Ctrl Alt R" "(slime:eval-region)" "Lisp")
(map-key-for-mode "Ctrl Alt E" "(slime:eval-last-expression)" "Lisp")
(map-key-for-mode "Ctrl Alt K" "(slime:slime-compile-and-load-file)" "Lisp")
