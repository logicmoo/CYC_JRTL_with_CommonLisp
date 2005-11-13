;;; compiler-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: compiler-tests.lisp,v 1.2 2005-11-13 21:20:54 piso Exp $
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

(load (merge-pathnames "test-utilities.lisp" *load-truename*))

(in-package #:test)

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

(do-tests)
