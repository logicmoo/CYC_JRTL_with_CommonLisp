;;; java.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
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

(in-package "JAVA")

(defun jregister-handler (object event handler &key data count)
  (%jregister-handler object event handler data count))

(defun jclass-name (class)
  "Returns the name of CLASS as a Lisp string"
  (jcall (jmethod "java.lang.Class" "getName") class))

(defun jobject-class (obj)
  "Returns the Java class that OBJ belongs to"
  (jcall (jmethod "java.lang.Object" "getClass") obj))

(defun jclass-constructors (class)
  "Returns a vector of constructors for CLASS"
  (jcall (jmethod "java.lang.Class" "getConstructors") class))

(defun jconstructor-params (constructor)
  "Returns a vector of parameter types (Java classes) for CONSTRUCTOR"
  (jcall (jmethod "java.lang.reflect.Constructor" "getParameterTypes") constructor))

(defun jclass-fields (class)
  "Returns a vector of all accessible fields of CLASS (and its supeorclasses)"
  (jcall (jmethod "java.lang.Class" "getFields") class))

(defun jfield-type (field)
  "Returns the type (Java class) of FIELD"
  (jcall (jmethod "java.lang.reflect.Field" "getType") field))

(defun jclass-methods (class)
  "Return a vector of all accessible methods of CLASS (and its superclasses)"
  (jcall (jmethod "java.lang.Class" "getMethods") class))

(defun jinstance-of-p (obj class)
  "OBJ is an instance of CLASS (or one of its subclasses)"
  (jcall (jmethod "java.lang.Class" "isInstance" "java.lang.Object") class obj))