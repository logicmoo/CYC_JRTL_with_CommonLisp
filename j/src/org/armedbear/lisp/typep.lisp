;;; typep.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: typep.lisp,v 1.3 2003-09-14 12:25:27 piso Exp $
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

(defun match-dimensions (dim pat)
  (if (null dim)
      (null pat)
      (and (or (eq (car pat) '*)
	       (eql (car dim) (car pat)))
	   (match-dimensions (cdr dim) (cdr pat)))))

(defun typep (object type)
  (when (atom type)
    (return-from typep (simple-typep object type)))
  (let ((tp (car type))
        (i (cdr type)))
    (case tp
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
      (t
       nil))))
