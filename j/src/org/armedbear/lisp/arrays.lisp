;;; arrays.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: arrays.lisp,v 1.1 2003-03-17 18:20:08 piso Exp $
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

(in-package "COMMON-LISP")

(export '(make-array
          array-total-size
          array-row-major-index))


(defun make-array (dimensions &key
                              (element-type t)
                              (initial-element nil initial-element-p)
                              initial-contents adjustable fill-pointer
                              displaced-to displaced-index-offset)
  (%make-array dimensions element-type initial-element initial-element-p
               initial-contents adjustable fill-pointer displaced-to
               displaced-index-offset))


(defun array-total-size (array)
  (apply #'* (array-dimensions array)))


;;; ARRAY-ROW-MAJOR-INDEX (from OpenMCL)

(defun array-row-major-index (array &rest subscripts)
  (let ((rank  (array-rank array))
        (nsubs (length subscripts))
        (sum 0))
    (declare (fixnum sum rank))
    (unless (eql rank nsubs)
      (error 'program-error))
    (if (eql 0 rank)
        0
        (do* ((i (1- rank) (1- i))
              (dim (array-dimension array i) (array-dimension array i))
              (last-size 1 size)
              (size dim (* dim size)))
          (nil)
          (declare (fixnum i last-size size))
          (let ((s (elt subscripts i)))
            (unless (fixnump s)
              (setq s (require-type s 'fixnum)))
            (when (or (< s 0) (>= s dim))
              (error 'program-error))
            (incf sum (the fixnum (* s last-size)))
            (when (eql i 0) (return sum)))))))
