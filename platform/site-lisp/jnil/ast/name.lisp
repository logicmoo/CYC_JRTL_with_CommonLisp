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
;;; $Id: name.lisp,v 1.1.1.1 2006/04/23 17:11:41 tdias Exp $
;;;
;;; Description: Definition of a mapping for the Name class, defined
;;; in Eclipse's JDT.
;;;
;;; -- start of name.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (name "org.eclipse.jdt.core.dom.Name") (expression)
  () () ())

;;; Java methods
(def-java-method (name-string "getFullyQualifiedName") (name))

(def-java-method (name-binding "resolveBinding") (name))

;;; Lisp extensions
(defun name-p (obj)
  (typep obj 'name))

(defmethod bound-p ((name name))
  (name-binding name))

(defmethod variable-p ((name name))
  (variable-p (name-binding name)))

(defmethod final-p ((name name))
  (final-p (binding-modifiers (name-binding name))))

(defmethod static-p ((name name))
  (static-p (binding-modifiers (name-binding name))))

(defmethod field-p ((name name))
  (binding-field-p (name-binding name)))

(defmethod array-bound-p ((name name))
  (array-bound-p (name-binding name)))

(defmethod method-bound-p ((name name))
  (method-binding-p (name-binding name)))

(defmethod method-parameter-types ((name name))
  (method-parameter-types (name-binding name)))

(defmethod method-parameter-type-names ((name name))
  (mapcar #'binding-name (method-parameter-types name)))

(defmethod method-overloaded-p ((name name))
  (method-overloaded-p (name-binding name)))

(defmethod constructor-bound-p ((name name))
  (binding-constructor-p (name-binding name)))

(defmethod from-source-p ((name name))
  (from-source-p (name-binding name)))

(defmethod name-type ((name name))
  (binding-name (name-binding name)))

(defmethod name-qualified-type ((name name))
  (binding-qualified-name (binding-type-binding (name-binding name))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(name name-string name-p bound-p variable-p final-p method-parameter-types array-bound-p
            method-bound-p method-parameter-type-names method-overloaded-p constructor-bound-p
            from-source-p name-type name-qualified-type)
          'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of name.lisp --
