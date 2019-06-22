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
;;; $Id: class-instance-creation.lisp,v 1.2 2006/05/30 21:28:32 tdias Exp $
;;;
;;; Description: Definition of a mapping for the ClassInstanceCreation class,
;;; defined in Eclipse's JDT.
;;;
;;; -- start of class-instance-creation.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (class-instance-creation "org.eclipse.jdt.core.dom.ClassInstanceCreation")
    (expression)
  () () ())

;;; Java methods
(defmethod instance-creation-args ((instance-creation class-instance-creation))
  (jlist2cons (jcall "arguments" instance-creation)))

(def-java-method (instance-creation-anonymous-decl "getAnonymousClassDeclaration")
    (class-instance-creation))

(def-java-method (instance-creation-expression "getExpression") (class-instance-creation))

(def-java-method (instance-creation-name "getName") (class-instance-creation))

(def-java-method (instance-creation-binding "resolveConstructorBinding") (class-instance-creation))

;;; Lisp extensions
(defun class-instance-creation-p (obj)
  (typep obj 'class-instance-creation))

(defmethod initializer-parameter-types ((node class-instance-creation)) 
  (mapcar #'(lambda (arg) (binding-name arg))
          (method-parameter-types (instance-creation-binding node))))

(defmethod instance-creation-with-default-constructor-p ((node class-instance-creation))
  (binding-default-constructor-p (instance-creation-binding node)))

(defmethod node-children ((node class-instance-creation))
  (append (list (instance-creation-expression node))
          (list (instance-creation-name node))
          (instance-creation-args node)
          (list (instance-creation-anonymous-decl node))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(class-instance-creation instance-creation-args
            instance-creation-anonymous-decl instance-creation-name
            instance-creation-expression class-instance-creation-p
            initializer-parameter-types instance-creation-with-default-constructor-p) 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of class-instance-creation.lisp --
