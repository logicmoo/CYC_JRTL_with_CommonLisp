;;; -*- mode: lisp; package: jnil.ast -*-
;;; Copyright (c) 2004-2005 Tiago Maduro-Dias. All Rights Reserved.
;;;
;;; This code is free software; you can redistribute it and/or
;;; modify it under the terms of the version 2.1 of
;;; the GNU Lesser General Public License as published by 
;;; the Free Software Foundation, as clarified by the preamble
;;; found in license-llgpl.txt.
;;;
;;; This code is distributed in the hope that it will be useful,
;;; but without any warranty; without even the implied warranty of
;;; merchantability or fitness for a particular purpose. See the GNU
;;; Lesser General Public License for more details.
;;;
;;; Version 2.1 of the GNU Lesser General Public License is in the file 
;;; license-lgpl.txt that was distributed with this file.
;;; If it is not present, you can access it from
;;; http://www.gnu.org/copyleft/lesser.txt (until superseded by a newer
;;; version) or write to the Free Software Foundation, Inc., 59 Temple Place, 
;;; Suite 330, Boston, MA  02111-1307  USA
;;;
;;; $Id: type-declaration.lisp,v 1.2 2006/05/30 21:37:57 tdias Exp $
;;;
;;; Description: Definition of a mapping for the TypeDeclaration class, defined
;;; in Eclipse's JDT.
;;;
;;; -- start of type-declaration.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (type-declaration "org.eclipse.jdt.core.dom.TypeDeclaration")
    (abstract-type-declaration)
  () () ())

;;; Java methods
(def-java-method (declaration-name "getName") (type-declaration))

(defmethod declaration-fields ((type-decl type-declaration))
  (jvector2cons (jcall "getFields" type-decl)))

(defmethod declaration-methods ((type-decl type-declaration))
  (jvector2cons (jcall "getMethods" type-decl)))

(def-java-method (declaration-superclass "getSuperclass") (type-declaration))

(defmethod declaration-types ((type-decl type-declaration))
  (jvector2cons (jcall "getTypes" type-decl)))

(defmethod declaration-superinterfaces ((type-decl type-declaration))
  (jlist2cons (jcall "superInterfaces" type-decl)))

(def-java-method (interface-p "isInterface") (type-declaration))

(def-java-method (declaration-binding "resolveBinding") (type-declaration))

;;; Lisp extensions
(defun type-declaration-p (obj)
  (typep obj 'type-declaration))

(defmethod make-signature ((type type-declaration))
  "Returns the signature of TYPE.
All instances of TYPE have unique signatures in the context of a Java Project."
  (make-signature (declaration-binding type)))

(defmethod abstract-p ((type type-declaration))
  (abstract-p (declaration-binding type)))

(defmethod class-or-super-p ((type type-declaration) class-fully-qualified-name)
  (member class-fully-qualified-name
          (cons (binding-qualified-name (declaration-binding type)) (class-supers type))
          :test #'string=))

(defmethod class-supers ((type-decl type-declaration))
  (class-supers (declaration-binding type-decl)))

(defmethod declaration-methods* ((type type-declaration))
  (let ((methods (declaration-methods type))
        (getters (list))
        (setters (list))
        (others (list)))
    (dolist (m methods)
      (aif res (getter-p m)
           (push (cons res m) getters)
        (aif res nil ; (setter-p m) see bug 1
             (push (cons res m) setters)
          (push m others))))
    (values getters setters (nreverse others))))

(defmethod node-children ((node type-declaration))
  (append (list (declaration-name node))
          (list (declaration-superclass node))
          (declaration-superinterfaces node)
          (declaration-fields node)
          (declaration-types node)
          (declaration-methods node)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(type-declaration declaration-fields declaration-name declaration-methods
            declaration-superclass declaration-types declaration-superinterfaces type-declaration-p
            class-or-super-p interface-p abstract-p declaration-methods*) 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of type-declaration.lisp --
