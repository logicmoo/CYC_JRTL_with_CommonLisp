;;; numbers.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: numbers.lisp,v 1.6 2003-08-24 13:30:43 piso Exp $
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

(in-package "SYSTEM")

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
    (values (float tru) rem)))


(defun ffloor (number &optional (divisor 1))
  "Same as FLOOR, but returns first value as a float."
  (multiple-value-bind (tru rem) (ftruncate number divisor)
    (if (and (not (zerop rem))
	     (if (minusp divisor)
		 (plusp number)
		 (minusp number)))
	(values (1- tru) (+ rem divisor))
	(values tru rem))))


(defun fceiling (number &optional (divisor 1))
  "Same as CEILING, but returns first value as a float."
  (multiple-value-bind (tru rem) (ftruncate number divisor)
    (if (and (not (zerop rem))
	     (if (minusp divisor)
		 (minusp number)
		 (plusp number)))
	(values (+ tru 1) (- rem divisor))
	(values tru rem))))


(defun fround (number &optional (divisor 1))
  "Same as ROUND, but returns first value as a float."
  (multiple-value-bind (res rem)
    (round number divisor)
    (values (float res (if (floatp rem) rem 1.0)) rem)))


(defun rational (x)
  "RATIONAL produces a rational number for any real numeric argument.  This is
   more efficient than RATIONALIZE, but it assumes that floating-point is
   completely accurate, giving a result that isn't as pretty."
  (cond ((floatp x)
         (multiple-value-bind (bits exp)
           (integer-decode-float x)
           (if (eql bits 0)
               0
               (let* ((int (if (minusp x) (- bits) bits))
                      (digits (float-digits x))
                      (ex (+ exp digits)))
                 (if (minusp ex)
                     (/ int (ash 1 (+ digits (- ex))))
                     (/ (ash int ex) (ash 1 digits)))))))
        ((rationalp x)
         x)
        (t
         (error 'type-error "wrong type: ~S is not a real number" x))))

;;; FIXME
(defun rationalize (x)
  (rational x))
