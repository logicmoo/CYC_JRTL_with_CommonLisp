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
;;; $Id: method-declaration.lisp,v 1.2 2006/05/30 21:30:52 tdias Exp $
;;;
;;; Description: Definition of a mapping for the MethodDeclaration class,
;;; defined in Eclipse's JDT.
;;;
;;; -- start of method-declaration.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (method-declaration "org.eclipse.jdt.core.dom.MethodDeclaration") (body-declaration)
  () () ())

;;; Java methods
(def-java-method (declaration-body "getBody") (method-declaration))

(def-java-method (declaration-name "getName") (method-declaration))

(def-java-method (declaration-return-type "getReturnType") (method-declaration))

(def-java-method (constructor-p "isConstructor") (method-declaration))

(def-java-method (declaration-binding "resolveBinding") (method-declaration))

(defmethod declaration-parameters ((decl method-declaration))
  (jlist2cons (jcall "parameters" decl)))

(defmethod declaration-thrown-exceptions ((decl method-declaration))
  (jlist2cons (jcall "thrownExceptions" decl)))

;;; Lisp extensions
(defun method-declaration-p (obj)
  (typep obj 'method-declaration))


;;;;- Sun May 28 20:00:45 2006 by tiago - Behaviour is delegated on the signature construction
;;;;of the binding. This is the safest way and the pattern that should normally be followed to
;;;;ensure the bindings and the original methods have the same signature.
(defmethod make-signature ((method method-declaration))
    "Returns the signature of METHOD.
All instances of METHOD have unique signatures in the context of a Java Project."
  (make-signature (declaration-binding method)))

(defmethod abstract-p ((decl method-declaration))
  (abstract-p (declaration-modifiers decl)))

(defmethod static-p ((decl method-declaration))
  (static-p (declaration-modifiers decl)))

(defmethod public-p ((decl method-declaration))
  (public-p (declaration-modifiers decl)))

(defmethod return-type-qualified-name ((decl method-declaration))
  (jcall "getName" (jcall "resolveBinding" (jcall "getReturnType" decl))))

(defmethod main-declaration-p ((decl method-declaration))
  (let ((parameters (declaration-parameters decl)))
    (and (string-equal (jcall "getName" (jcall "resolveBinding" decl)) "main")
	 (string-equal (return-type-qualified-name decl) "void")
	 (static-p decl) (public-p decl) (= (length parameters) 1)
	 (string-equal (jcall "getName" (jcall "resolveBinding" 
					       (declaration-type (first parameters))))
		       "String[]"))))

(defmethod getter-p ((decl method-declaration))
  (let ((statement (unique-statement-or-nil decl)))
    (and (return-statement-p statement)
	 (let ((expression (statement-expression statement)))
	   (and expression
		(field-of-class-declaration-p expression decl))))))

(defmethod setter-p ((decl method-declaration))
  (let ((statement (unique-statement-or-nil decl)))
    (and (not (constructor-p decl))
         (expression-statement-p statement)
	 (let ((expression (expression statement)))
	   (and expression (assignment-p expression) (slot-setter-p expression decl t))))))

(defmethod unique-statement-or-nil ((decl method-declaration))
  (let ((body (declaration-body decl)))
    (and body
	 (let ((statements (jblock-statements body)))
	   (and (not (endp statements))
		(endp (rest statements))
		(first statements))))))

(defmethod from-source-p ((decl method-declaration))
  (from-source-p (declaration-binding decl)))

(defmethod node-children ((node method-declaration))
  (append (list (declaration-return-type node))
	  (list (declaration-name node))
	  (declaration-parameters node)
	  (declaration-thrown-exceptions node)
	  (list (declaration-body node))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(method-declaration declaration-body declaration-name declaration-return-type
	    constructor-p declaration-parameters declaration-thrown-exceptions method-declaration-p
	    abstract-p static-p public-p return-type-qualified-name main-declaration-p getter-p
	    setter-p from-source-p)
	  'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of method-declaration.lisp --
