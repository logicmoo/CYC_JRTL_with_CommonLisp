;;; ed.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: ed.lisp,v 1.1 2004-10-17 12:09:16 piso Exp $
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

;;; Adapted from SBCL.

(in-package #:system)

(setf *ed-functions* (adjoin 'default-ed-function *ed-functions*))

(defun ed (&optional x)
  "Starts the editor (on a file or a function if named).  Functions
from the list *ED-FUNCTIONS* are called in order with X as an argument
until one of them returns non-NIL; these functions are responsible for
signalling a FILE-ERROR to indicate failure to perform an operation on
the file system."
  (dolist (fun *ed-functions*
	   (error 'simple-error
		  :format-control "Don't know how to ~S ~A"
		  :format-arguments (list 'ed x)))
    (when (funcall fun x)
      (return)))
  (values))

(defun default-ed-function (what)
  (let ((portfile (merge-pathnames ".j/port" (user-homedir-pathname)))
        stream)
    (when (probe-file portfile)
      (let* ((port (with-open-file (s portfile) (read s nil nil)))
             (socket (and (integerp port) (make-socket "127.0.0.1" port))))
        (setf stream (and socket (get-socket-stream socket)))))
    (unwind-protect
     (cond ((stringp what)
            (if stream
                (progn
                  (write-string (namestring (user-homedir-pathname)) stream)
                  (terpri stream)
                  (write-string (format nil "~S~%" what) stream))
                (run-shell-command (format nil "j ~S" what))))
           ((and what (symbolp what))
            (when (autoloadp what)
              (let ((*load-verbose* nil)
                    (*load-print* nil)
                    (*autoload-verbose* nil))
                (resolve what)))
            (if (source what)
                (let ((file (namestring (source-pathname what)))
                      (position (source-file-position what))
                      (line-number 1)
                      (pattern (string what)))
                  (with-open-file (s file)
                    (dotimes (i position)
                      (let ((c (read-char s nil s)))
                        (cond ((eq c s)
                               (return))
                              ((eql c #\newline)
                               (incf line-number)))))
                    (dotimes (i 10)
                      (let ((text (read-line s nil s)))
                        (cond ((eq text s)
                               (return))
                              ((search pattern text :test 'string-equal)
                               (return))
                              (t
                               (incf line-number))))))
                  (if stream
                      (progn
                        (write-string (namestring (user-homedir-pathname)) stream)
                        (terpri stream)
                        (write-string (format nil "+~D~%~S~%" line-number file) stream))
                      (run-shell-command (format nil "j +~D ~S" line-number file)))))))
     (when stream
       (close stream))))
  t)
