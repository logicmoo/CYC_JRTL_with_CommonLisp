;;; condition-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
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

(deftest print-not-readable-object.1
  (signals-error (slot-boundp (make-condition 'print-not-readable)
                              #+abcl    'system::object
                              #+allegro 'excl::object
                              #+clisp   'system::$object
                              #+sbcl    'sb-kernel::object)
                 'error)
  nil)

(deftest print-not-readable-object.2
  (slot-boundp (make-condition 'print-not-readable)
               #+abcl    'system::object
               #+allegro 'excl::object
               #+clisp   'system::$object
               #+sbcl    'sb-kernel::object)
  nil)

(deftest simple-type-error.1
  (slot-boundp (make-condition 'simple-type-error)
               #+abcl    'system::datum
               #+allegro 'excl::datum
               #+sbcl    'sb-kernel::datum)
  nil)

(deftest simple-type-error.2
  (slot-boundp (make-condition 'simple-type-error)
               #+abcl    'system::expected-type
               #+allegro 'excl::expected-type
               #+sbcl    'sb-kernel::expected-type)
  nil)

(deftest simple-type-error.3
  (slot-boundp (make-condition 'simple-type-error)
               #+abcl    'system::format-control
               #+allegro 'excl::format-control
               #+sbcl    'sb-kernel:format-control)
  nil)

(deftest simple-type-error.4
  (slot-boundp (make-condition 'simple-type-error)
               #+abcl    'system::format-arguments
               #+allegro 'excl::format-arguments
               #+sbcl    'sb-kernel::format-arguments)
  t)

(deftest simple-type-error.5
  (slot-value (make-condition 'simple-type-error)
              #+abcl    'system::format-arguments
              #+allegro 'excl::format-arguments
              #+sbcl    'sb-kernel::format-arguments)
  nil)

(deftest simple-type-error.6
  (slot-boundp (make-instance 'simple-type-error)
               #+abcl    'system::datum
               #+allegro 'excl::datum
               #+sbcl    'sb-kernel::datum)
  nil)

(deftest simple-type-error.7
  (slot-boundp (make-instance 'simple-type-error)
               #+abcl    'system::expected-type
               #+allegro 'excl::expected-type
               #+sbcl    'sb-kernel::expected-type)
  nil)

(deftest simple-type-error.8
  (slot-boundp (make-instance 'simple-type-error)
               #+abcl    'system::format-control
               #+allegro 'excl::format-control
               #+sbcl    'sb-kernel:format-control)
  nil)

(deftest simple-type-error.9
  (slot-boundp (make-instance 'simple-type-error)
               #+abcl    'system::format-arguments
               #+allegro 'excl::format-arguments
               #+sbcl    'sb-kernel::format-arguments)
  t)

(deftest simple-type-error.10
  (slot-value (make-instance 'simple-type-error)
              #+abcl    'system::format-arguments
              #+allegro 'excl::format-arguments
              #+sbcl    'sb-kernel::format-arguments)
  nil)

(do-tests)
