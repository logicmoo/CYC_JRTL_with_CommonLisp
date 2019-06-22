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
;;; $Id: super-method-invocation.lisp,v 1.1.1.1 2006/04/23 17:11:43 tdias Exp $
;;;
;;; Description: Definition of a mapping for the SuperMethodInvocation class,
;;; defined in Eclipse's JDT.
;;;
;;; -- start of super-method-invocation.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (super-method-invocation "org.eclipse.jdt.core.dom.SuperMethodInvocation")
    (expression)
  () () ())

;;; Java methods
(defmethod invocation-args ((invocation super-method-invocation))
  (jlist2cons (jcall "arguments" invocation)))

(def-java-method (invocation-qualifier "getQualifier") 
    (super-method-invocation))

(def-java-method (invocation-name "getName") (super-method-invocation))

;;; Lisp extensions
(defun super-method-invocation-p (obj)
  (typep obj 'super-method-invocation))

(defmethod node-children ((node super-method-invocation))
  (append (list (invocation-qualifier node))
			 (list (invocation-name node))
			 (invocation-args node)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(super-method-invocation invocation-qualifier
				invocation-name invocation-args super-method-invocation-p)
			 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of super-method-invocation.lisp --
