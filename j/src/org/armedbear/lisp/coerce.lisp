;;; coerce.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: coerce.lisp,v 1.5 2004-03-16 00:57:48 piso Exp $
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

(defun coerce-list-to-vector (list result-type)
  (let* ((length (length list))
         (result (make-sequence result-type length)))
    (dotimes (i length)
      (setf (aref result i) (pop list)))
    result))

(defun coerce-error (object result-type)
  (error 'simple-type-error
         :datum object
         :format-control "~S cannot be converted to type ~S."
         :format-arguments (list object result-type)))

(defun coerce (object result-type)
  (cond ((eq result-type t)
         object)
        ((typep object result-type)
         object)
        ((eq result-type 'character)
         (cond ((and (stringp object)
                     (= (length object) 1))
                (char object 0))
               ((and (symbolp object)
                     (= (length (symbol-name object)) 1))
                (char (symbol-name object) 0))
               (t
                (coerce-error object result-type))))
        ((memq result-type '(float single-float double-float short-float long-float))
         (coerce-to-float object))
        ((eq result-type 'complex)
         (cond ((floatp object)
                (complex object 0.0))
               ((numberp object)
                object)
               (t
                (coerce-error object result-type))))
        ((and (consp result-type)
              (eq (car result-type) 'complex))
         (if (memq (cadr result-type)
                   '(float single-float double-float short-float long-float))
             (complex object 0.0)
             object))
        ((eq result-type 'function)
         (coerce-to-function object))
        ((and (listp object)
              (eq result-type 'vector))
         (coerce-list-to-vector object result-type))
        ((and (simple-typep object 'sequence)
              (%subtypep result-type 'sequence))
         (concatenate result-type object))
        (t
         (coerce-error object result-type))))
