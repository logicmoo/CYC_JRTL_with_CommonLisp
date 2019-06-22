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
;;; $Id: method-invocation.lisp,v 1.3 2006/05/30 21:56:39 tdias Exp $
;;;
;;; Description: Definition of a mapping for the MethodInvocation class, defined
;;; in Eclipse's JDT.
;;;
;;; -- start of method-invocation.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (method-invocation "org.eclipse.jdt.core.dom.MethodInvocation") (expression)
  () () ())

;;; Java methods
(defmethod invocation-args ((invocation method-invocation))
  (jlist2cons (jcall "arguments" invocation)))

(def-java-method (invocation-expression "getExpression") (method-invocation))

(def-java-method (invocation-name "getName") (method-invocation))

(def-java-method (invocation-method-binding "resolveMethodBinding") (method-invocation))

;;; Lisp extensions
(defun method-invocation-p (obj)
  (typep obj 'method-invocation))

(defmethod static-invocation-p ((expr method-invocation))
  (static-p (binding-modifiers (invocation-method-binding expr))))

(defmethod method-declaring-class ((expr method-invocation))
  (let ((declaring-class-binding (binding-declaring-class (invocation-method-binding expr))))
    (values (binding-qualified-name declaring-class-binding)
            (binding-name declaring-class-binding))))

(defmethod method-declaration ((expr method-invocation))
  "Returns the declaration NODE of the method being invoked."
  (find-binding-declaration (invocation-method-binding expr)))

(defmethod from-source-p ((expr method-invocation))
  (from-source-p (invocation-method-binding expr)))

(defmethod node-children ((node method-invocation))
  (append (list (invocation-expression node))
          (list (invocation-name node))
          (invocation-args node)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(method-invocation invocation-expression
            invocation-name method-invocation-p invocation-args
            static-invocation-p method-declaring-class
            method-declaration) 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of method-invocation.lisp --
