;;; compiler-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: compiler-tests.lisp,v 1.5 2005-12-03 11:36:24 piso Exp $
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

#+abcl
(require '#:jvm)

(load (merge-pathnames "test-utilities.lisp" *load-truename*))

(in-package #:test)

(defconstant most-positive-java-long 9223372036854775807)
(defconstant most-negative-java-long -9223372036854775808)

#+abcl
(assert (eql most-positive-java-long ext:most-positive-java-long))
#+abcl
(assert (eql most-negative-java-long ext:most-negative-java-long))

#+abcl
(deftest unused.1
  (let ((output (with-output-to-string (*error-output*)
                  (compile nil '(lambda () (let ((x 42)) 17))))))
    (integerp (search "The variable X is defined but never used." output)))
  t)

(deftest unused.2
  (progn
    (fmakunbound 'unused.2)
    (defun unused.2 () (let ((x 42)) 17))
    (values
     #-lispworks
     (multiple-value-list (compile 'unused.2))
     #+lispworks
     (let ((list (multiple-value-list (compile 'unused.2))))
       (list (first list)
             (not (null (second list)))
             (third list)))
     (unused.2)))
  #+(or abcl allegro) (unused.2 t   nil)
  #+clisp             (unused.2 1   nil)
  #+(or cmu sbcl)     (unused.2 nil nil)
  #+lispworks         (unused.2 t   nil)
  17)

(deftest plus.1
  (progn
    (fmakunbound 'plus.1)
    (defun plus.1 (x y)
      (+ x y))
    (compile 'plus.1)
    (plus.1 most-positive-fixnum most-positive-fixnum))
  #.(+ most-positive-fixnum most-positive-fixnum))

(deftest plus.2
  (progn
    (fmakunbound 'plus.2)
    (defun plus.2 (x y)
      (declare (optimize speed))
      (declare (type fixnum x y))
      (+ x y))
    (compile 'plus.2)
    (plus.2 most-positive-fixnum most-positive-fixnum))
  #.(+ most-positive-fixnum most-positive-fixnum))

(deftest plus.3
  (progn
    (fmakunbound 'plus.3)
    (defun plus.3 (x y)
      (declare (optimize speed (safety 0)))
      (declare (type fixnum x y))
      (+ x y))
    (compile 'plus.3)
    (plus.3 most-positive-fixnum most-positive-fixnum))
  #.(+ most-positive-fixnum most-positive-fixnum))
#+allegro (pushnew 'plus.3 *expected-failures*)

(deftest times.1
  (progn
    (fmakunbound 'times.1)
    (defun times.1 (x y)
      (* x y))
    (compile 'times.1)
    (times.1 most-positive-fixnum most-positive-fixnum))
  #.(* most-positive-fixnum most-positive-fixnum))

(deftest times.2
  (progn
    (fmakunbound 'times.2)
    (defun times.2 (x y)
      (declare (optimize speed))
      (declare (type fixnum x y))
      (* x y))
    (compile 'times.2)
    (times.2 most-positive-fixnum most-positive-fixnum))
  #.(* most-positive-fixnum most-positive-fixnum))

(deftest times.3
  (progn
    (fmakunbound 'times.3)
    (defun times.3 (x y)
      (declare (optimize speed (safety 0)))
      (declare (type fixnum x y))
      (* x y))
    (compile 'times.3)
    (times.3 most-positive-fixnum most-positive-fixnum))
  #.(* most-positive-fixnum most-positive-fixnum))

(deftest dotimes.1
  (progn
    (fmakunbound 'dotimes.1)
    (defun dotimes.1 ()
      (declare (optimize speed (safety 0)))
      (let ((result 0))
        (dotimes (i 10)
          (incf result))
        result))
    (compile 'dotimes.1)
    (dotimes.1))
  10)

(deftest dotimes.2
  (progn
    (fmakunbound 'dotimes.2)
    (defun dotimes.2 ()
      (declare (optimize speed (safety 0)))
      (let ((result 0))
        (declare (type fixnum result))
        (dotimes (i 10)
          (incf result))
        result))
    (compile 'dotimes.2)
    (dotimes.2))
  10)

#+abcl
(deftest derive-type-logxor.1
  (let ((type
         (jvm:derive-compiler-type `(logxor (the (unsigned-byte 8) x)
                                            (the (unsigned-byte 8) y)))))
    (and (sys:integer-type-p type)
         (values
          (sys:integer-type-low type)
          (sys:integer-type-high type))))
  0 255)

#+abcl
(deftest derive-type-logxor.2
  (let ((type
         (jvm:derive-compiler-type `(logxor 441516657
                                            (the (integer 0 8589934588) x)))))
    (and (sys:integer-type-p type)
         (values
          (sys:integer-type-low type)
          (sys:integer-type-high type))))
  0 8589934588)

#+abcl
(deftest derive-type-logxor.3
  (let ((type
         (jvm:derive-compiler-type `(logxor 441516657
                                            (the (integer 0 8589934588) x)
                                            (ash (the (integer 0 8589934588) x) -5)))))
    (and (sys:integer-type-p type)
         (values
          (sys:integer-type-low type)
          (sys:integer-type-high type))))
  0 8589934588)

(deftest ash.1
  (progn
    (fmakunbound 'ash.1)
    (defun ash.1 (n shift)
      (declare (type (integer 0 8589934588) n))
      (declare (type (integer -31 -1) shift))
      (ash n shift))
    (compile 'ash.1)
    (values
     (ash.1 8589934588 -1)
     (ash.1 8589934588 -2)
     (ash.1 8589934588 -3)
     (ash.1 8589934588 -4)
     (ash.1 8589934588 -5)
     (ash.1 8589934588 -6)
     (ash.1 8589934588 -31)))
  4294967294
  2147483647
  1073741823
  536870911
  268435455
  134217727
  3)

(deftest bignum-constant.1
  (progn
    (fmakunbound 'bignum-constant.1)
    (defun bignum-constant.1 () #.most-positive-java-long)
    (values (funcall 'bignum-constant.1)
            (multiple-value-list (compile 'bignum-constant.1))
            (compiled-function-p #'bignum-constant.1)
            (funcall 'bignum-constant.1)))
  #.most-positive-java-long
  (bignum-constant.1 nil nil)
  t
  #.most-positive-java-long)

(deftest bignum-constant.2
  (progn
    (fmakunbound 'bignum-constant.2)
    (defun bignum-constant.2 () #.(1+ most-positive-java-long))
    (values (funcall 'bignum-constant.2)
            (multiple-value-list (compile 'bignum-constant.2))
            (compiled-function-p #'bignum-constant.2)
            (funcall 'bignum-constant.2)))
  #.(1+ most-positive-java-long)
  (bignum-constant.2 nil nil)
  t
  #.(1+ most-positive-java-long))

(deftest bignum-constant.3
  (progn
    (fmakunbound 'bignum-constant.3)
    (defun bignum-constant.3 () #.most-negative-java-long)
    (values (funcall 'bignum-constant.3)
            (multiple-value-list (compile 'bignum-constant.3))
            (compiled-function-p #'bignum-constant.3)
            (funcall 'bignum-constant.3)))
  #.most-negative-java-long
  (bignum-constant.3 nil nil)
  t
  #.most-negative-java-long)

(deftest bignum-constant.4
  (progn
    (fmakunbound 'bignum-constant.4)
    (defun bignum-constant.4 () #.(1- most-negative-java-long))
    (values (funcall 'bignum-constant.4)
            (multiple-value-list (compile 'bignum-constant.4))
            (compiled-function-p #'bignum-constant.4)
            (funcall 'bignum-constant.4)))
  #.(1- most-negative-java-long)
  (bignum-constant.4 nil nil)
  t
  #.(1- most-negative-java-long))

(do-tests)
