;;; numbers.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: numbers.lisp,v 1.33 2004-08-15 11:18:36 piso Exp $
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

;;; FIXME
(defun rationalize (number)
  (rational number))

(defun gcd (&rest integers)
  "Returns the greatest common divisor of the arguments, which must be
   integers.  Gcd with no arguments is defined to be 0."
  (unless (every #'integerp integers)
    (error 'type-error :datum (find-if-not #'integerp integers) :expected-type 'integer))
  (cond ((null integers) 0)
	((null (cdr integers)) (abs (car integers)))
	(t
	 (do ((gcd (car integers)
		   (gcd-2 gcd (car rest)))
	      (rest (cdr integers) (cdr rest)))
	     ((null rest) gcd)))))

;;; From discussion on comp.lang.lisp and Akira Kurihara.
(defun isqrt (natural)
  "Returns the root of the nearest integer less than natural which is a perfect
   square."
  (unless (and (integerp natural) (not (minusp natural)))
    (error 'simple-type-error
           :format-control "The value ~A is not a non-negative real number."
           :format-arguments (list natural)))
  (if (and (fixnump natural) (<= natural 24))
      (cond ((> natural 15) 4)
	    ((> natural  8) 3)
	    ((> natural  3) 2)
	    ((> natural  0) 1)
	    (t 0))
      (let* ((n-len-quarter (ash (integer-length natural) -2))
	     (n-half (ash natural (- (ash n-len-quarter 1))))
	     (n-half-isqrt (isqrt n-half))
	     (init-value (ash (1+ n-half-isqrt) n-len-quarter)))
	(loop
	  (let ((iterated-value
		 (ash (+ init-value (truncate natural init-value)) -1)))
	    (unless (< iterated-value init-value)
	      (return init-value))
	    (setq init-value iterated-value))))))

(defun float-precision (float)
  (if (floatp float)
      (if (zerop float) 0 53)
      (error 'simple-type-error
             :format-control "~S is not of type FLOAT."
             :format-arguments (list float))))

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

(defun cis (radians)
  "Return cos(Theta) + i sin(Theta), AKA exp(i Theta)."
  (if (complexp radians)
      (error "argument to CIS is complex: ~S" radians)
      (complex (cos radians) (sin radians))))

(eval-when (:execute)
  (when (and (fboundp 'jvm::jvm-compile) (not (autoloadp 'jvm::jvm-compile)))
    (mapcar #'jvm::jvm-compile '(ceiling
                                 round
                                 ftruncate
                                 ffloor
                                 fceiling
                                 fround
                                 rational
                                 rationalize))))
