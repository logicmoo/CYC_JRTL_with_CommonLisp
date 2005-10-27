;;; java-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: java-tests.lisp,v 1.7 2005-10-27 18:34:07 piso Exp $
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

(unless (member "RT" *modules* :test #'string=)
  (load "rt-package.lisp")
  (load #+abcl (compile-file-if-needed "rt.lisp")
        ;; Force compilation to avoid fasl name conflict between SBCL and
        ;; Allegro.
        #-abcl (compile-file "rt.lisp"))
  (provide "RT"))

;; FIXME
(load "test-utilities.lisp")

(regression-test:rem-all-tests)

(setf regression-test:*expected-failures* nil)

(unless (find-package '#:test)
  (defpackage #:test (:use #:cl #:regression-test)))

(in-package #:test)

#+abcl
(use-package '#:java)

#+allegro
(require :jlinker)
#+allegro
(use-package '#:javatools.jlinker)
#+allegro
(use-package '#:javatools.jlinker '#:cl-user) ;; For convenience only.
#+(and allegro mswindows)
(use-package '#:javatools.jlinker '#:cg-user) ;; For convenience only.
#+allegro
(load "jl-config.cl")
#+allegro
(or (jlinker-query) (jlinker-init))

#+abcl
(deftest java-object.1
  (class-name (find-class 'java-object nil))
  java-object)

(deftest jclass.1
  (jcall (jmethod "java.lang.Object" "toString") (jclass "java.lang.String"))
  "class java.lang.String")

(deftest jclass.2
  (equal (jcall (jmethod "java.lang.Object" "getClass") "foo")
         (jclass "java.lang.String"))
  #+abcl    t
  #+allegro nil)

(deftest jclass.3
  (equal (jclass '|java.lang.String|) (jclass "java.lang.String"))
  t)

(deftest jclass.4
  (let ((class1 (jcall (jmethod "java.lang.Object" "getClass") "foo"))
        (class2 (jclass "java.lang.String")))
    (jcall (jmethod "java.lang.Object" "equals" "java.lang.Object")
           class1 class2))
  t)

(deftest jclass-of.1
  (jclass-of "foo")
  "java.lang.String"
  "java.lang.String")

(deftest jclass-of.2
  (jclass-of "foo" "java.lang.String")
  t
  "java.lang.String")

(deftest jclass-of.3
  (jclass-of "foo" "bar")
  nil
  "java.lang.String")

(deftest jclass-of.4
  (jclass-of 42)
  nil
  nil)

(deftest jclass-of.5
  (jclass-of 'foo)
  nil
  nil)

(deftest jclass-name.1
  (jclass-name "java.lang.String")
  "java.lang.String")

(deftest jclass-name.2
  (signals-error (jclass-name "foo") 'error)
  t)

(deftest jclass-name.3
  (signals-error (jclass-name 42) 'error)
  t)

(deftest jclass-name.4
  (jclass-name (jclass "java.lang.String"))
  "java.lang.String")

(deftest jclass-name.5
  (jclass-name (jclass "java.lang.String") "java.lang.String")
  t
  "java.lang.String")

(deftest jclass-name.6
  (jclass-name (jclass "java.lang.String") "java.lang.Object")
  nil
  "java.lang.String")

(deftest jclass-name.7
  (jclass-name (jclass "java.lang.String") "foo")
  nil
  "java.lang.String")

(deftest jconstructor.1
  (jclass-of (jconstructor "java.lang.String" "java.lang.String"))
  "java.lang.reflect.Constructor"
  "java.lang.reflect.Constructor")

(deftest jnew.1
  (let ((constructor (jconstructor "java.lang.String" "java.lang.String")))
    (jclass-of (jnew constructor "foo")))
  "java.lang.String"
  "java.lang.String")

(deftest jnew.2
  (jclass-of (jnew (jconstructor "java.awt.Point")))
  "java.awt.Point"
  "java.awt.Point")

#-abcl
(deftest jnew.3
  (jclass-of (jnew "java.awt.Point") "java.awt.Point")
  t
  "java.awt.Point")

(deftest jcall.1
  (let ((method (jmethod "java.lang.String" "length")))
    (jcall method "test"))
  4)

(deftest jcall.2
  (jcall "length" "test")
  4)

(deftest jcall.3
  (let ((method (jmethod "java.lang.String" "regionMatches" 4)))
    (jcall method "test" 0 "this is a test" 10 4))
  t)

(deftest jcall.4
  (let ((method (jmethod "java.lang.String" "regionMatches" 5)))
    (jcall method "test" (make-immediate-object nil :boolean) 0 "this is a test" 10 4))
  t)

(deftest jfield.1
  (type-of (jfield "java.lang.Integer" "TYPE"))
  #+abcl    java-object
  #+allegro tran-struct)

(do-tests)

;;#+allegro
;;(jlinker-end)
