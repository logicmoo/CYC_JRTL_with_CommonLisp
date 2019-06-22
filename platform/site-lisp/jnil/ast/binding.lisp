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
;;; $Id: binding.lisp,v 1.2 2006/05/30 21:27:15 tdias Exp $
;;;
;;; Description: Definition of the mapping for the IBinding class,
;;; defined in Eclipse's JDT.
;;;
;;; -- start of binding.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (binding "org.eclipse.jdt.core.dom.IBinding") ()
  () (((binding-variable-value "VARIABLE"))) ())

;;; Java methods
(def-java-method (binding-modifiers "getModifiers") (binding))

(def-java-method (binding-kind "getKind") (binding))

(def-java-method (binding-name "getName") (binding))

(defmethod binding-project-name-string ((binding binding))
  "Returns the name of the Java Project where BINDING is declared."
  (jcall "getName" (jcall "getProject" (jcall "getJavaProject" (jcall "getJavaElement" binding)))))

;;; Lisp extensions
(defmethod variable-p ((binding binding))
  (= (binding-kind binding) (binding-variable-value binding)))

(defmethod abstract-p ((binding binding))
  (abstract-p (binding-modifiers binding)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil.ast))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of binding.lisp --
