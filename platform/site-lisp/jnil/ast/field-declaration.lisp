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
;;; $Id: field-declaration.lisp,v 1.1.1.1 2006/04/23 17:11:39 tdias Exp $
;;;
;;; Description: Definition of a mapping for the FieldDeclaration class,
;;; defined in Eclipse's JDT.
;;;
;;; -- start of field-declaration.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (field-declaration "org.eclipse.jdt.core.dom.FieldDeclaration") (body-declaration)
  () () ())

;;; Java methods
(def-java-method (declaration-type "getType") (field-declaration))

(defmethod declaration-fragments ((field-decl field-declaration))
  (jlist2cons (jcall "fragments" field-decl)))

;;; Lisp extensions
(defun field-declaration-p (obj)
  (typep obj 'field-declaration))

(defmethod static-p ((decl field-declaration))
  (static-p (declaration-modifiers decl)))

(defmethod node-children ((node field-declaration))
  (append (list (declaration-type node))
			 (declaration-fragments node)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(field-declaration declaration-type declaration-fragments
				field-declaration-p static-p) 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of field-declaration.lisp --
