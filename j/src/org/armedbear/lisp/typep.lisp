;;; typep.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: typep.lisp,v 1.14 2003-12-15 01:53:24 piso Exp $
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

;;; Adapted from GCL.

(in-package "SYSTEM")

(resolve 'subtypep)

(defun simple-array-p (object)
  (and (arrayp object)
       (not (array-has-fill-pointer-p object))
       (multiple-value-bind (displaced-to offset) (array-displacement object)
         (and (null displaced-to) (zerop offset)))))

(defun in-interval-p (x interval)
  (let (low high)
    (if (endp interval)
        (setq low '* high '*)
        (if (endp (cdr interval))
            (setq low (car interval) high '*)
            (setq low (car interval) high (cadr interval))))
    (cond ((eq low '*))
          ((consp low)
           (when (<= x (car low)) (return-from in-interval-p nil)))
          ((when (< x low) (return-from in-interval-p nil))))
    (cond ((eq high '*))
          ((consp high)
           (when (>= x (car high)) (return-from in-interval-p nil)))
          ((when (> x high) (return-from in-interval-p nil))))
    (return-from in-interval-p t)))

(defun match-dimensions (dim pat)
  (if (null dim)
      (null pat)
      (and (or (eq (car pat) '*)
	       (eql (car dim) (car pat)))
	   (match-dimensions (cdr dim) (cdr pat)))))

(defun typep (object type)
  (when (atom type)
    (unless (and (symbolp type) (get type 'deftype-definition))
      (return-from typep (simple-typep object type)))
    (setf type (subtypep-normalize-type type))
    (when (atom type)
      (return-from typep (simple-typep object type))))
  (let ((tp (car type))
        (i (cdr type)))
    (case tp
      (AND
       (dolist (type i)
         (unless (typep object type)
           (return-from typep nil)))
       t)
      (OR
       (dolist (type i)
         (when (typep object type)
           (return-from typep t)))
       nil)
      (NOT (not (typep object (car i))))
      (MEMBER (member object i))
      (CONS
       (and (consp object)
            (or (null (car i)) (eq (car i) '*) (typep (car object) (car i)))
            (or (null (cadr i)) (eq (cadr i) '*) (typep (cdr object) (cadr i)))))
      (FLOAT
       (and (floatp object) (in-interval-p object i)))
      (INTEGER
       (and (integerp object) (in-interval-p object i)))
      (RATIONAL
       (and (rationalp object) (in-interval-p object i)))
      (REAL
       (and (realp object) (in-interval-p object i)))
      (SIMPLE-BIT-VECTOR
       (and (simple-bit-vector-p object)
            (or (endp i) (match-dimensions (array-dimensions object) i))))
      (BIT-VECTOR
       (and (bit-vector-p object)
            (or (endp i) (match-dimensions (array-dimensions object) i))))
      (SIMPLE-VECTOR
       (and (simple-vector-p object)
            (or (endp i) (eq (car i) '*)
                (= (length object) (car i)))))
      (VECTOR
       (and (vectorp object)
            (or (endp i)
                (eq (car i) '*)
                (and (eq (car i) t) (not (stringp object)) (not (bit-vector-p object)))
                (and (stringp object) (subtypep (car i) 'character))
                (equal (array-element-type object) (car i)))
            (or (endp (cdr i)) (match-dimensions (array-dimensions object) (cdr i)))))
      (SIMPLE-ARRAY
       (and (simple-array-p object)
            (or (endp i) (eq (car i) '*)
                (equal (array-element-type object) (upgraded-array-element-type (car i))))
            (or (endp (cdr i)) (eq (cadr i) '*)
                (if (listp (cadr i))
                    (match-dimensions (array-dimensions object) (cadr i))
                    (eql (array-rank object) (cadr i))))))
      (ARRAY
       (and (arrayp object)
            (or (null i) (eq (car i) '*)
                (equal (array-element-type object) (upgraded-array-element-type (car i))))
            (or (null (cdr i)) (eq (cadr i) '*)
                (if (listp (cadr i))
                    (match-dimensions (array-dimensions object) (cadr i))
                    (eql (array-rank object) (cadr i))))))
      (EQL
       (eql object (car i)))
      (SATISFIES
       (funcall (car i) object))
      (t
       nil))))
