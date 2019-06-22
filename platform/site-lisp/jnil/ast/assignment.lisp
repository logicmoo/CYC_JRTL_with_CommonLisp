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
;;; $Id: assignment.lisp,v 1.1.1.1 2006/04/23 17:11:38 tdias Exp $
;;;
;;; Description: Definition of a mapping for the Assignment class, defined
;;; in Eclipse's JDT.
;;;
;;; -- start of assignment.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (assignment "org.eclipse.jdt.core.dom.Assignment")
    (expression) () () ())

;;; Java methods
(def-java-method (assignment-left-hand-side "getLeftHandSide") (assignment))

(defmethod assignment-operator ((ass assignment))
  (jcall "toString" (jcall "getOperator" ass)))

(def-java-method (assignment-right-hand-side "getRightHandSide") (assignment))

;;; Lisp extensions
(defun assignment-p (obj)
  (typep obj 'assignment))

(defun field-of-class-declaration-p (expression decl)
  (let ((name (or (and (field-access-p expression)
		       (this-expression-p (field-access-expression expression))
		       (field-access-name expression))
		  (and (simple-name-p expression)
		       expression))))
    (and name
	 (let ((binding (name-binding name)))
	   (and binding
		(typep binding 'variable-binding)
		(binding-field-p binding)
		(not (static-p (jcall "getModifiers" binding)))
		(string= (jcall "getName" (binding-declaring-class binding))
			 (jcall "getName" (binding-declaring-class (jcall "resolveBinding" decl))))
		(jcall "getIdentifier" name))))))

(defun parameter-of-method-declaration-p (expression decl &optional single)
  (let ((name (and (simple-name-p expression) expression)))
    (and name
	 (let ((binding (name-binding name)))
	   (and binding
		(typep binding 'variable-binding)
		(let ((params (declaration-parameters decl)))
		  (and (or (not single) (singleton-p params))
		       (find-if #'(lambda (param)
                                    (string= (jcall "getIdentifier" (jcall "getName" param))
                                             (jcall "getName" binding)))
                                params))))))))


(defmethod slot-setter-p ((node assignment) (decl method-declaration) &optional single)
  (and (string= (assignment-operator node) "=")
       (parameter-of-method-declaration-p (assignment-right-hand-side node) decl single)
       (field-of-class-declaration-p (assignment-left-hand-side node) decl)))

(defmethod node-children ((node assignment))
  (list (assignment-left-hand-side node)
        (assignment-right-hand-side node)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(assignment assignment-left-hand-side assignment-right-hand-side
            assignment-operator assignment-p) 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of assignment.lisp --
