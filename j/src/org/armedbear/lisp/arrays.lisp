;;; arrays.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: arrays.lisp,v 1.3 2003-03-19 00:37:15 piso Exp $
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
          array-row-major-index
          aref))

(defun make-array (dimensions &key
                              (element-type t)
                              (initial-element nil initial-element-p)
                              initial-contents adjustable fill-pointer
                              displaced-to displaced-index-offset)
  (%make-array dimensions element-type initial-element initial-element-p
               initial-contents adjustable fill-pointer displaced-to
               displaced-index-offset))

(defun %array-row-major-index (array subscripts)
  (let ((rank  (array-rank array))
        (nsubs (length subscripts))
        (sum 0))
    (unless (eql rank nsubs)
      (error 'program-error))
    (if (eql 0 rank)
        0
        (do* ((i (1- rank) (1- i))
              (dim (array-dimension array i) (array-dimension array i))
              (last-size 1 size)
              (size dim (* dim size)))
          (nil)
          (let ((s (elt subscripts i)))
            (require-type s 'fixnum)
            (when (or (< s 0) (>= s dim))
              (error 'program-error))
            (incf sum (* s last-size))
            (when (eql i 0) (return sum)))))))

(defun array-row-major-index (array &rest subscripts)
  (%array-row-major-index array subscripts))

(defun aref (array &rest subscripts)
  (cond ((null subscripts)
         (row-major-aref array 0))
        ((null (cdr subscripts))
         (row-major-aref array (car subscripts)))
        (t
         (row-major-aref array (%array-row-major-index array subscripts)))))

(defun %aset (array &rest stuff)
  (if (= (length stuff) 2)
      (%set-row-major-aref array (car stuff) (cadr stuff))
      (let ((subscripts (butlast stuff))
            (new-value (car (last stuff))))
        (%set-row-major-aref array (%array-row-major-index array subscripts)
                             new-value))))

(defsetf aref %aset)
