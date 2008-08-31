;;; make-load-form-saving-slots.lisp
;;;
;;; Copyright (C) 2004-2005 Peter Graves
;;; $Id$
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

(resolve 'defstruct)

(defun make-load-form-saving-slots (object &key slot-names environment)
  (declare (ignore environment))
  (let ((class (class-of object))
        (inits ())
        (instance (gensym "INSTANCE-")))
    (cond ((typep object 'structure-object)
           (let ((index 0))
             (dolist (slot (%class-slots class))
               (let ((slot-name (dsd-name slot)))
                 (when (or (memq slot-name slot-names)
                           (null slot-names))
                   (let ((value (structure-ref object index)))
                     (push `(structure-set ,instance ,index ',value) inits))))
               (incf index))))
          ((typep object 'standard-object)
           (dolist (slot (%class-slots class))
             (let ((slot-name (%slot-definition-name slot)))
               (when (or (memq slot-name slot-names)
                         (null slot-names))
                 (when (slot-boundp object slot-name)
                   (let ((value (slot-value object slot-name)))
                     (push `(setf (slot-value ,instance ',slot-name) ',value) inits))))))))
    (values `(let ((,instance (allocate-instance (find-class ',(%class-name class)))))
               (progn ,@inits)
               ,instance)
            nil)))
