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
;;; $Id: variable-declaration.lisp,v 1.1.1.1 2006/04/23 17:11:44 tdias Exp $
;;;
;;; Description: Definition of a mapping for the VariableDeclaration class,
;;; defined in Eclipse's JDT.
;;;
;;; -- start of variable-declaration.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (variable-declaration "org.eclipse.jdt.core.dom.VariableDeclaration") (node)
  () () ())

;;; Java methods
(def-java-method (declaration-initializer "getInitializer") (variable-declaration))

(def-java-method (declaration-name "getName") (variable-declaration))

(def-java-method (declaration-extra-dimensions "getExtraDimensions") (variable-declaration))

(def-java-method (declaration-binding "resolveBinding") (variable-declaration))

;;; Lisp extensions
(defun variable-declaration-p (obj)
  (typep obj 'variable-declaration))

(defmethod field-p ((decl variable-declaration))
  (binding-field-p (declaration-binding decl)))

(defmethod static-p ((decl variable-declaration))
  (static-p (binding-modifiers (declaration-binding decl))))

(defmethod final-p ((decl variable-declaration))
  (final-p (binding-modifiers (declaration-binding decl))))

(defmethod array-p ((decl variable-declaration))
  (array-p (binding-type-binding (declaration-binding decl))))

(defmethod type-name ((decl variable-declaration))
  (binding-name (binding-type-binding (declaration-binding decl))))

(defmethod type-qualified-name ((decl variable-declaration))
  (binding-qualified-name (binding-type-binding (declaration-binding decl))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(variable-declaration declaration-initializer declaration-name
				declaration-extra-dimensions field-p static-p final-p array-p
				type-name type-qualified-name variable-declaration-p) 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of variable-declaration.lisp --
