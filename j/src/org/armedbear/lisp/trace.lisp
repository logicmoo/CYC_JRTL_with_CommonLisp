;;; trace.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: trace.lisp,v 1.11 2005-02-12 03:30:32 piso Exp $
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

(in-package #:system)

(defconstant *untraced-function* (make-symbol "untraced-function"))

(defvar *traced-functions* nil)

(defvar *trace-depth* 0)

(defun list-traced-functions ()
  *traced-functions*)

(defmacro trace (&rest args)
  (if args
      `(progn
        (setf *trace-depth* 0)
        (expand-trace ',args))
      `(list-traced-functions)))

(defun expand-trace (args)
  (let ((results ())
        (breakp nil))
    (let ((index (position :break args)))
      (when index
        (setf breakp (nth (1+ index) args))
        (setf args (append (subseq args 0 index) (subseq args (+ index 2))))))
    (dolist (arg args)
      (if (trace-1 arg breakp)
          (push arg results)))
    results))

(defun trace-1 (name breakp)
  (unless (fboundp name)
    (error "~S is not the name of a function." name))
  (if (member name *traced-functions*)
      (%format t "~S is already being traced." name)
      (let* ((untraced-function (fdefinition name))
             (trace-function
              (lambda (&rest args)
                (with-standard-io-syntax
                    (%format *trace-output* (indent "~D: ~S~%") *trace-depth*
                             (cons name args)))
                (when breakp
                  (break))
                (incf *trace-depth*)
                (let ((r (multiple-value-list (apply untraced-function args))))
                  (decf *trace-depth*)
                  (with-standard-io-syntax
                    (%format *trace-output* (indent "~D: ~A returned") *trace-depth* name)
                      (dolist (val r)
                        (%format *trace-output* " ~S" val))
                    (terpri *trace-output*))
                  (values-list r)))))
        (let ((*warn-on-redefinition* nil))
          (setf (symbol-function name) trace-function))
        (setf (get name *untraced-function*) untraced-function)
        (push name *traced-functions*)
        name)))

(defun indent (string)
  (concatenate 'string
               (make-string (* (1+ *trace-depth*) 2) :initial-element #\space)
               string))

(defmacro untrace (&rest args)
  (cond ((null args)
         `(progn
            (untrace-all)
            (setf *trace-depth* 0)
            t))
        (t
         `(progn
            (untrace-n ',args)
            (setf *trace-depth* 0)
            t))))

(defun untrace-all ()
  (dolist (arg *traced-functions*)
    (untrace-1 arg)))

(defun untrace-n (args)
  (dolist (arg args)
    (if (member arg *traced-functions*)
        (untrace-1 arg)
        (%format t "~S is not being traced.~%" arg))))

(defun untrace-1 (symbol)
  (let ((untraced-function (get symbol *untraced-function*))
        (*warn-on-redefinition* nil))
    (setf (symbol-function symbol) untraced-function)
    (remprop symbol *untraced-function*)
    (setf *traced-functions* (remove symbol *traced-functions*))))
