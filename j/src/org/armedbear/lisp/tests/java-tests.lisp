;;; java-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: java-tests.lisp,v 1.2 2005-10-22 14:10:22 piso Exp $
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
#+allegro
(load "jl-config.cl")
#+allegro
(or (jlinker-query) (jlinker-init))

#+abcl
(deftest java-object.1
  (class-name (find-class 'java-object nil))
  java-object)

(deftest jclass-name.1
  (jclass-name (jclass "java.lang.Object"))
  "java.lang.Object")

(deftest jclass-name.2
  (jclass-name (jclass "java.lang.Object") "java.lang.Object")
  t
  "java.lang.Object")

(deftest jclass-name.3
  (jclass-name (jclass "java.lang.Object") "foo")
  nil
  "java.lang.Object")

(deftest jcall.1
  (let ((method (jmethod "java.lang.String" "length")))
    (jcall method "test"))
  4)

(deftest jfield.1
  (type-of (jfield "java.lang.Integer" "TYPE"))
  #+abcl    java-object
  #+allegro tran-struct)

(do-tests)

;;#+allegro
;;(jlinker-end)
