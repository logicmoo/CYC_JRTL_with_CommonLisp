;;; fixme.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: fixme.lisp,v 1.25 2004-08-10 03:26:03 piso Exp $
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

;; Should be a special operator.
(defmacro the (type form)
  form)

(defmacro declaim (&rest decls)
`(eval-when (:compile-toplevel :load-toplevel :execute)
   ,@(mapcar (lambda (decl) `(proclaim ',decl))
             decls)))

(defun proclaim (declaration-specifier)
  (case (car declaration-specifier)
    (SPECIAL
     (dolist (name (cdr declaration-specifier))
       (%defvar name)))
    (OPTIMIZE
     (dolist (spec (cdr declaration-specifier))
       (let ((val 3)
             (quantity spec))
         (when (consp spec)
           (setf quantity (car spec)
                 val (cadr spec)))
         (when (and (fixnump val)
                    (<= 0 val 3))
           (case quantity
             (SPEED
              (setf jvm::*speed* val))
             (SAFETY
              (setf jvm::*safety* val))
             (DEBUG
              (setf jvm::*debug* val)))))))
    ((INLINE NOTINLINE)
     (dolist (name (cdr declaration-specifier))
       (when (symbolp name) ; FIXME Need to support non-symbol function names.
         (setf (get name 'jvm::%inline) (car declaration-specifier)))))))

(defun disassemble (fn)
  (%format t "; DISASSEMBLE is not implemented.")
  (values))

(defmacro with-compilation-unit (options &body body)
  `(progn ,@body))

(defun translate-pathname (&rest args)
  (error "TRANSLATE-PATHNAME is not implemented."))
