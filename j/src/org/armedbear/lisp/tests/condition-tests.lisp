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

(load "test-utilities.lisp")

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

(do-tests)
