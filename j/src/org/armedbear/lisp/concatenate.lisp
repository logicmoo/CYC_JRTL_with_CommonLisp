;;; concatenate.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: concatenate.lisp,v 1.2 2004-02-22 18:47:26 piso Exp $
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

;;; From GCL.

(in-package "SYSTEM")

(defun concatenate (result-type &rest sequences)
  (do ((x (make-sequence result-type
			 (apply #'+ (mapcar #'length sequences))))
       (s sequences (cdr s))
       (i 0))
      ((null s) x)
    (do ((j 0 (1+ j))
         (n (length (car s))))
        ((>= j n))
      (setf (elt x i) (elt (car s) j))
      (incf i))))
