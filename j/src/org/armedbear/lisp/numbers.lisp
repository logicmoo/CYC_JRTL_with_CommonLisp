;;; numbers.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: numbers.lisp,v 1.25 2004-03-14 00:26:02 piso Exp $
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

(defun signum (number)
  "If NUMBER is zero, return NUMBER, else return (/ NUMBER (ABS NUMBER))."
  (if (zerop number)
      number
      (if (rationalp number)
	  (if (plusp number) 1 -1)
	  (/ number (abs number)))))

;;; If the numbers do not divide exactly and the result of (/ number divisor)
;;; would be positive then increment the quotient and decrement the remainder by
;;; the divisor.
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

(defun gcd (&rest numbers)
  "Returns the greatest common divisor of the arguments, which must be
   integers.  Gcd with no arguments is defined to be 0."
  (unless (every #'integerp numbers)
    (error 'type-error))
  (cond ((null numbers) 0)
	((null (cdr numbers)) (abs (car numbers)))
	(t
	 (do ((gcd (car numbers)
		   (gcd-2 gcd (car rest)))
	      (rest (cdr numbers) (cdr rest)))
	     ((null rest) gcd)))))

;;; From discussion on comp.lang.lisp and Akira Kurihara.
(defun isqrt (n)
  "Returns the root of the nearest integer less than n which is a perfect
   square."
  (declare (type unsigned-byte n) (values unsigned-byte))
  (unless (and (numberp n) (not (minusp n)))
    (error 'type-error "wrong type: ~A is not a non-negative real number" n))
  ;; theoretically (> n 7) ,i.e., n-len-quarter > 0
  (if (and (fixnump n) (<= n 24))
      (cond ((> n 15) 4)
	    ((> n  8) 3)
	    ((> n  3) 2)
	    ((> n  0) 1)
	    (t 0))
      (let* ((n-len-quarter (ash (integer-length n) -2))
	     (n-half (ash n (- (ash n-len-quarter 1))))
	     (n-half-isqrt (isqrt n-half))
	     (init-value (ash (1+ n-half-isqrt) n-len-quarter)))
	(loop
	  (let ((iterated-value
		 (ash (+ init-value (truncate n init-value)) -1)))
	    (unless (< iterated-value init-value)
	      (return init-value))
	    (setq init-value iterated-value))))))

(defun float-precision (float)
  (if (floatp float)
      (if (zerop float) 0 53)
      (error 'simple-type-error
             :format-control "~S is not of type FLOAT."
             :format-arguments (list float))))

(defun float-sign (float1 &optional (float2 (float 1 float1)))
  "Returns a floating-point number that has the same sign as
   float1 and, if float2 is given, has the same absolute value
   as float2."
  (* (if (minusp float1)
	 (float -1 float1)
	 (float 1 float1))
     (abs float2)))

(defun decode-float (float)
  (multiple-value-bind (significand exponent sign) (integer-decode-float float)
    (values (coerce (/ significand (expt 2 53)) 'float)
            (+ exponent 53)
            (if (minusp sign) -1.0 1.0))))

(defun conjugate (number)
  (etypecase number
    (complex
     (complex (realpart number) (- (imagpart number))))
    (number
     number)))

(defun phase (number)
  "Returns the angle part of the polar representation of a complex number.
   For complex numbers, this is (atan (imagpart number) (realpart number)).
   For non-complex positive numbers, this is 0.  For non-complex negative
   numbers this is PI."
  (etypecase number
             (rational
              (if (minusp number)
                  (coerce pi 'single-float)
                  0.0f0))
             (single-float
              (if (minusp (float-sign number))
                  (coerce pi 'single-float)
                  0.0f0))
             (double-float
              (if (minusp (float-sign number))
                  (coerce pi 'double-float)
                  0.0d0))
             (complex
              (if (zerop (realpart number))
                  (* (/ pi 2) (signum (imagpart number)))
                  (atan (imagpart number) (realpart number))))))

(defun cis (theta)
  "Return cos(Theta) + i sin(Theta), AKA exp(i Theta)."
  (if (complexp theta)
      (error "argument to CIS is complex: ~S" theta)
      (complex (cos theta) (sin theta))))

(when (and (fboundp 'jvm::jvm-compile) (not (autoloadp 'jvm::jvm-compile)))
  (mapcar #'jvm::jvm-compile '(ceiling
                               round
                               ftruncate
                               ffloor
                               fceiling
                               fround
                               rational
                               rationalize)))
