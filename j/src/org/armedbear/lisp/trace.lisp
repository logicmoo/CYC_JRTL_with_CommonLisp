;;; trace.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: trace.lisp,v 1.6 2004-07-25 23:43:21 piso Exp $
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

(in-package "SYSTEM")

(defconstant *untraced-function* (make-symbol "untraced-function"))

(defvar *traced-functions* nil)

(defvar *trace-depth* 0)

(defun list-traced-functions ()
  *traced-functions*)

(defmacro trace (&rest args)
  (setf *trace-depth* 0)
  (if args
      (expand-trace args)
      '(list-traced-functions)))

(defun expand-trace (args)
  (let ((results ()))
    (dolist (arg args)
      (if (trace-1 arg)
          (push arg results)))
    `',results))

(defun trace-1 (symbol)
  (unless (fboundp symbol)
    (error "~S is not the name of a function" symbol))
  (if (member symbol *traced-functions*)
      (%format t "~S is already being traced." symbol)
      (let* ((untraced-function (symbol-function symbol))
             (trace-function
              (lambda (&rest args)
                (%format t (indent "~D: ~S~%") *trace-depth*
                         (append (list symbol) args))
                (incf *trace-depth*)
                (let ((r (multiple-value-list (apply untraced-function args))))
                  (decf *trace-depth*)
                  (%format t (indent "~D: ~A returned") *trace-depth* symbol)
                  (dolist (val r)
                    (%format t " ~S" val))
                  (%format t "~%")
                  (values-list r)))))
        (setf (symbol-function symbol) trace-function)
        (setf (get symbol *untraced-function*) untraced-function)
        (push symbol *traced-functions*)
        symbol)))

(defun indent (string)
  (concatenate 'string
               (make-string (* (1+ *trace-depth*) 2) :initial-element #\space)
               string))

(defmacro untrace (&rest args)
  (setf *trace-depth* 0)
  (if (null args)
      (untrace-all)
      (dolist (arg args)
        (if (member arg *traced-functions*)
            (untrace-1 arg)
            (%format t "~S is not being traced.~%" arg)))))

(defun untrace-all ()
  (dolist (arg *traced-functions*)
    (untrace-1 arg)))

(defun untrace-1 (symbol)
  (let ((untraced-function (get symbol *untraced-function*)))
    (setf (symbol-function symbol) untraced-function)
    (remprop symbol *untraced-function*)
    (setf *traced-functions* (remove symbol *traced-functions*))))
