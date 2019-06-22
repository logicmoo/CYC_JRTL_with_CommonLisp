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
;;; $Id: array-creation.lisp,v 1.1.1.1 2006/04/23 17:11:37 tdias Exp $
;;;
;;; Description: Definition of a mapping for the ArrayCreation class, defined
;;; in Eclipse's JDT.
;;;
;;; -- start of array-creation.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (array-creation "org.eclipse.jdt.core.dom.ArrayCreation") (expression)
  () () ())

;;; Java methods
(defmethod array-creation-dimensions ((array-creation array-creation))
  (jlist2cons (jcall "dimensions" array-creation)))

(def-java-method (array-creation-initializer "getInitializer") (array-creation))

(def-java-method (array-creation-type "getType") (array-creation))

;;; Lisp extensions
(defun array-creation-p (obj)
  (typep obj 'array-creation))

(defmethod type-name ((node array-creation))
  (element-type (array-creation-type node)))

(defmethod node-children ((node array-creation))
  (append (list (array-creation-type node))
			 (array-creation-dimensions node)
			 (list (array-creation-initializer node))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(array-creation array-creation-array array-creation-index
				array-creation-p array-creation-initializer type-name
				array-creation-dimensions) 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of array-creation.lisp --
