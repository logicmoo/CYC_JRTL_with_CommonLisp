;;; swank.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: swank.lisp,v 1.1 2004-09-01 19:58:27 piso Exp $
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

;;; Adapted from SLIME.

#+abcl
(eval-when (:compile-toplevel :load-toplevel :execute)
  (require '#:swank-protocol)
  (sys:load-system-file "swank-package")
  (sys:load-system-file "swank-abcl"))

#+sbcl
(eval-when (:compile-toplevel :load-toplevel :execute)
  (load "swank-protocol")
  (load "swank-package")
  (load "swank-sbcl"))

(in-package #:swank)

(defvar *stream* nil)

(defvar *swank-format-function*
  #+abcl #'sys::%format
  #-abcl #'format)

(defun swank-format (destination control-string &rest args)
  (apply *swank-format-function* destination control-string args))

(defun server-loop ()
  (loop
    (let ((result (eval (swank-protocol:decode-message *stream*))))
      (swank-protocol:encode-message result *stream*))))

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
  (let ((package (find-package default-package-name))
        (string (string prefix))
        (result ()))
    (when package
      (do-symbols (symbol package)
        (when (compound-prefix-match string (symbol-name symbol))
          (push symbol result))))
    result))

;;; FIXME! FOO::BAR will intern FOO in BAR.
#+nil
(defun parse-symbol (string &optional (package *package*))
  "Find the symbol named STRING.
   Return the symbol and a flag indicating if the symbols was found."
  (multiple-value-bind (sym pos) (let ((*package* keyword-package))
                                   (ignore-errors (read-from-string string)))
    (if (and (symbolp sym) (eql (length string) pos))
        (if (find #\: string)
            (find-symbol (string sym) (symbol-package sym))
            (find-symbol (string sym) package))
        (values nil nil))))

#+nil
(defun valid-operator-name-p (string)
  "Test if STRING names a function, macro, or special-operator."
  (let ((symbol (parse-symbol string)))
    (or (fboundp symbol)
        (macro-function symbol)
        (special-operator-p symbol))))
#+nil
(defun arglist-for-echo-area (names)
  "Return the arglist for the first function, macro, or special-op in NAMES."
  (with-buffer-syntax ()
    (let ((name (find-if #'valid-operator-name-p names)))
      (if name (format-arglist-for-echo-area (parse-symbol name) name)))))
#+nil
(defun format-arglist-for-echo-area (symbol name)
  "Return SYMBOL's arglist as string for display in the echo area.
   Use the string NAME as operator name."
  (let ((arglist (arglist symbol)))
    (etypecase arglist
      ((member :not-available)
       nil)
      (list
       (arglist-to-string (cons name arglist)
                          (symbol-package symbol))))))
