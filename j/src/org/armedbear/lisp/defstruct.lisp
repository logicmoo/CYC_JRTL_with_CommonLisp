;;; defstruct.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: defstruct.lisp,v 1.6 2003-07-10 17:50:10 piso Exp $
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

(defun make-constructor (name slots)
  (let ((constructor (intern (concatenate 'string "MAKE-" (symbol-name name))))
        (keys (cons '&key slots)))
    (eval `(defun ,constructor ,keys
             (vector ',name ,@slots)))))

(defun make-access-function (name slot index)
  (let ((accessor
         (intern (concatenate 'string (symbol-name name) "-" (symbol-name slot))))
        (setf-expander (gensym)))
    (eval `(progn
             (defun ,accessor (instance)
               (%instance-ref instance ,index))
             (defun ,setf-expander (instance new-value)
               (%instance-set instance ,index new-value))
             (defsetf ,accessor ,setf-expander)))))

(defun make-access-functions (name slots)
  (let ((index 1))
    (dolist (slot slots)
      (make-access-function name slot index)
      (incf index))))

(defmacro defstruct (name-and-options &rest slots)
  (let ((name (if (atom name-and-options)
                  name-and-options (car name-and-options))))
    `(progn
       (make-constructor ',name ',slots)
       (make-access-functions ',name ',slots)
       ',name)))
