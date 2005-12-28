;;; coerce.lisp
;;;
;;; Copyright (C) 2004-2005 Peter Graves
;;; $Id: coerce.lisp,v 1.10 2005-12-28 10:58:19 piso Exp $
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

(declaim (ftype (function (t t) t) coerce-list-to-vector))
(defun coerce-list-to-vector (list result-type)
  (let* ((length (length list))
         (result (make-sequence result-type length)))
    (dotimes (i length)
      (declare (type index i))
      (setf (aref result i) (pop list)))
    result))

(defun coerce-error (object result-type)
  (error 'simple-type-error
         :datum object
         :format-control "~S cannot be converted to type ~S."
         :format-arguments (list object result-type)))

;; FIXME This is a special case for LOOP code, which does things like
;; (AND SINGLE-FLOAT REAL) and (AND SINGLE-FLOAT (REAL (0))).
(declaim (ftype (function (t t) t) coerce-object-to-and-type))
(defun coerce-object-to-and-type (object result-type)
  (when (and (consp result-type)
             (eq (%car result-type) 'AND)
             (= (length result-type) 3))
    (let* ((type1 (%cadr result-type))
           (type2 (%caddr result-type))
           (result (coerce object type1)))
      (when (typep object type2)
        (return-from coerce-object-to-and-type result))))
  (coerce-error object result-type))

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
        ((memq result-type '(float single-float short-float))
         (coerce-to-single-float object))
        ((memq result-type '(double-float long-float))
         (coerce-to-double-float object))
        ((eq result-type 'complex)
         (cond ((floatp object)
                (complex object 0.0))
               ((numberp object)
                object)
               (t
                (coerce-error object result-type))))
        ((eq result-type 'function)
         (coerce-to-function object))
        ((and (consp result-type)
              (eq (%car result-type) 'complex))
         (if (memq (%cadr result-type)
                   '(float single-float double-float short-float long-float))
             (complex object 0.0)
             object))
        ((and (consp result-type)
              (eq (%car result-type) 'AND))
         (coerce-object-to-and-type object result-type))
        ((and (listp object)
              (eq result-type 'vector))
         (coerce-list-to-vector object result-type))
        ((and (simple-typep object 'sequence)
              (%subtypep result-type 'sequence))
         (concatenate result-type object))
        (t
         (let ((expanded-type (expand-deftype result-type)))
           (unless (eq expanded-type result-type)
             (return-from coerce (coerce object expanded-type))))
         (coerce-error object result-type))))
