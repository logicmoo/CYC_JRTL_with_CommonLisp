;;; bit-array-ops.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: bit-array-ops.lisp,v 1.2 2003-10-09 16:51:08 piso Exp $
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

;;; Adapted from CMUCL.

(in-package "SYSTEM")

(defun bit-array-same-dimensions-p (array1 array2)
  (declare (type (array bit) array1 array2))
  (and (= (array-rank array1)
	  (array-rank array2))
       (dotimes (index (array-rank array1) t)
	 (when (/= (array-dimension array1 index)
		   (array-dimension array2 index))
	   (return nil)))))

(defun pick-result-array (result-bit-array bit-array-1)
  (case result-bit-array
    ((t) bit-array-1)
    ((nil) (make-array (array-dimensions bit-array-1)
		       :element-type 'bit
		       :initial-element 0))
    (t
     (unless (bit-array-same-dimensions-p bit-array-1
					  result-bit-array)
       (error 'program-error "~S and ~S do not have the same dimensions"
              bit-array-1 result-bit-array))
     result-bit-array)))

(defmacro def-bit-array-op (name function)
  `(defun ,name (bit-array-1 bit-array-2 &optional result-bit-array)
     ,(format nil
	      "Perform a bit-wise ~A on the elements of BIT-ARRAY-1 and ~
               BIT-ARRAY-2,~%  putting the results in RESULT-BIT-ARRAY.  ~
               If RESULT-BIT-ARRAY is T,~%  BIT-ARRAY-1 is used.  If ~
               RESULT-BIT-ARRAY is NIL or omitted, a new array is~%  created.  ~
               All the arrays must have the same rank and dimensions."
	      (symbol-name function))
     (unless (bit-array-same-dimensions-p bit-array-1 bit-array-2)
       (error 'program-error "~S and ~S do not have the same dimensions"
              bit-array-1 bit-array-2))
     (let ((result-bit-array (pick-result-array result-bit-array bit-array-1)))
       (dotimes (i (array-total-size result-bit-array) result-bit-array)
         (setf (row-major-aref result-bit-array i)
               (logand (,function (row-major-aref bit-array-1 i)
                                  (row-major-aref bit-array-2 i))
                       1))))))

(def-bit-array-op bit-and   logand)
(def-bit-array-op bit-ior   logior)
(def-bit-array-op bit-xor   logxor)
(def-bit-array-op bit-eqv   logeqv)
(def-bit-array-op bit-nand  lognand)
(def-bit-array-op bit-nor   lognor)
(def-bit-array-op bit-andc1 logandc1)
(def-bit-array-op bit-andc2 logandc2)
(def-bit-array-op bit-orc1  logorc1)
(def-bit-array-op bit-orc2  logorc2)

(defun bit-not (bit-array &optional result-bit-array)
  "Performs a bit-wise logical NOT on the elements of BIT-ARRAY,
   putting the results in RESULT-BIT-ARRAY.  If RESULT-BIT-ARRAY is T,
   BIT-ARRAY is used.  If RESULT-BIT-ARRAY is NIL or omitted, a new array is
   created.  Both arrays must have the same rank and dimensions."
  (let ((result-bit-array (pick-result-array result-bit-array bit-array)))
    (dotimes (i (array-total-size result-bit-array) result-bit-array)
      (setf (row-major-aref result-bit-array i)
            (logxor (row-major-aref bit-array i) 1)))))
