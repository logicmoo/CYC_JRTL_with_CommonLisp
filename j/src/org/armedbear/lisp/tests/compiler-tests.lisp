;;; compiler-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: compiler-tests.lisp,v 1.1 2005-11-13 14:44:29 piso Exp $
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
     (multiple-value-list (compile 'unused.2))
     (unused.2)))
  #+(or abcl allegro) (unused.2 t   nil)
  #+clisp             (unused.2 1   nil)
  #+(or cmu sbcl)     (unused.2 nil nil)
  17)

(deftest plus.1
  (progn
    (defun plus.1 (x y)
      (declare (optimize speed))
      (declare (type fixnum x y))
      (+ x y))
    (compile 'plus.1)
    (plus.1 most-positive-fixnum most-positive-fixnum))
  #.(+ most-positive-fixnum most-positive-fixnum))

(deftest plus.2
  (progn
    (defun plus.2 (x y)
      (declare (optimize speed (safety 0)))
      (declare (type fixnum x y))
      (+ x y))
    (compile 'plus.2)
    (plus.2 most-positive-fixnum most-positive-fixnum))
  #.(+ most-positive-fixnum most-positive-fixnum))
#+allegro (pushnew 'plus.2 *expected-failures*)

(deftest times.1
  (progn
    (defun times.1 (x y)
      (declare (optimize speed))
      (declare (type fixnum x y))
      (* x y))
    (compile 'times.1)
    (times.1 most-positive-fixnum most-positive-fixnum))
  #.(* most-positive-fixnum most-positive-fixnum))

(deftest times.2
  (progn
    (defun times.2 (x y)
      (declare (optimize speed (safety 0)))
      (declare (type fixnum x y))
      (* x y))
    (compile 'times.2)
    (times.2 most-positive-fixnum most-positive-fixnum))
  #.(* most-positive-fixnum most-positive-fixnum))

(do-tests)
