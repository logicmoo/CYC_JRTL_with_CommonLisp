;;; numbers.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: numbers.lisp,v 1.4 2003-08-23 01:35:58 piso Exp $
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

;;; From CMUCL.

;;; If the numbers do not divide exactly and the result of (/ number divisor)
;;; would be negative then decrement the quotient and augment the remainder by
;;; the divisor.
;;;
(defun floor (number &optional (divisor 1))
  "Returns the greatest integer not greater than number, or number/divisor.
  The second returned value is (mod number divisor)."
  (multiple-value-bind (tru rem) (truncate number divisor)
    (if (and (not (zerop rem))
	     (if (minusp divisor)
		 (plusp number)
		 (minusp number)))
	(values (1- tru) (+ rem divisor))
	(values tru rem))))


;;; If the numbers do not divide exactly and the result of (/ number divisor)
;;; would be positive then increment the quotient and decrement the remainder by
;;; the divisor.
;;;
(defun ceiling (number &optional (divisor 1))
  "Returns the smallest integer not less than number, or number/divisor.
  The second returned value is the remainder."
  (multiple-value-bind (tru rem) (truncate number divisor)
    (if (and (not (zerop rem))
	     (if (minusp divisor)
		 (minusp number)
		 (plusp number)))
	(values (+ tru 1) (- rem divisor))
	(values tru rem))))


(defun round (number &optional (divisor 1))
  "Rounds number (or number/divisor) to nearest integer.
   The second returned value is the remainder."
  (multiple-value-bind (tru rem) (truncate number divisor)
    (if (zerop rem)
        (values tru rem)
        (let ((thresh (/ (abs divisor) 2)))
          (cond ((or (> rem thresh)
                     (and (= rem thresh) (oddp tru)))
                 (if (minusp divisor)
                     (values (- tru 1) (+ rem divisor))
                     (values (+ tru 1) (- rem divisor))))
                ((let ((-thresh (- thresh)))
                   (or (< rem -thresh)
                       (and (= rem -thresh) (oddp tru))))
                 (if (minusp divisor)
                     (values (+ tru 1) (- rem divisor))
                     (values (- tru 1) (+ rem divisor))))
                (t (values tru rem)))))))


(defun rem (number divisor)
  "Returns second result of TRUNCATE."
  (multiple-value-bind (tru rem) (truncate number divisor)
    (declare (ignore tru))
    rem))


(defun ftruncate (number &optional (divisor 1))
  (multiple-value-bind (tru rem) (truncate number divisor)
    (values (coerce tru 'float) rem)))
