;;; copy-seq.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
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

(in-package "SYSTEM")

;; From CMUCL.

(defmacro vector-copy-seq (sequence type)
  `(let ((length (length ,sequence)))
     (do ((index 0 (1+ index))
	  (copy (make-sequence-of-type ,type length)))
       ((= index length) copy)
       (aset copy index (aref ,sequence index)))))

(defmacro list-copy-seq (list)
  `(if (atom ,list) '()
       (let ((result (cons (car ,list) '()) ))
	 (do ((x (cdr ,list) (cdr x))
	      (splice result
		      (cdr (rplacd splice (cons (car x) '() ))) ))
           ((atom x) (unless (null x)
                       (rplacd splice x))
            result)))))

(defun copy-seq (sequence)
  (if (listp sequence)
      (list-copy-seq sequence)
      (vector-copy-seq sequence (type-of sequence))))
