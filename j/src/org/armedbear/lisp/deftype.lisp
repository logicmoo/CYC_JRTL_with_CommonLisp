;;; deftype.lisp
;;;
;;; Copyright (C) 2004-2005 Peter Graves
;;; $Id: deftype.lisp,v 1.4 2005-02-26 17:36:19 piso Exp $
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

(defmacro deftype (name lambda-list &rest body)
  ;; Optional parameters default to * rather than NIL.
  ;; FIXME Extend this code to handle keyword parameters too!
  (when (memq '&optional lambda-list)
    (let ((new-lambda-list ())
          (optionalp nil))
      (dolist (thing lambda-list)
        (cond (optionalp
               (when (symbolp thing)
                 (setf thing (list thing ''*))))
              ((eq thing '&optional)
               (setf optionalp t))
              ((memq thing lambda-list-keywords)
               (setf optionalp nil)))
        (push thing new-lambda-list))
      (setf lambda-list (nreverse new-lambda-list))))
  `(progn
     (setf (get ',name 'deftype-definition) #'(lambda ,lambda-list ,@body))
     ',name))

(defun expand-deftype (type)
  (let (tp i)
    (loop
      (if (consp type)
          (setf tp (car type) i (cdr type))
          (setf tp type i nil))
      (if (and (symbolp tp) (get tp 'deftype-definition))
          (setf type (apply (get tp 'deftype-definition) i))
          (return))))
  type)
