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
;;; $Id: for-statement.lisp,v 1.1.1.1 2006/04/23 17:11:39 tdias Exp $
;;;
;;; Description: Definition of a mapping for the ForStatement class, defined
;;; in Eclipse's JDT.
;;;
;;; -- start of for-statement.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (for-statement "org.eclipse.jdt.core.dom.ForStatement") (statement)
  () () ())

;;; Java methods
(def-java-method (statement-body "getBody") (for-statement))

(def-java-method (statement-expression "getExpression") (for-statement))

(defmethod statement-updaters ((stmt for-statement)) 
  (jlist2cons (jcall "updaters" stmt)))

(defmethod statement-initializers ((stmt for-statement))
  (jlist2cons (jcall "initializers" stmt)))

;;; Lisp extensions
(defun for-statement-p (obj)
  (typep obj 'for-statement))

(defmethod assignment-initializer-p ((stmt for-statement))
  (assignment-p (first (statement-initializers stmt))))

(defmethod node-children ((node for-statement))
  (append (statement-initializers node)
			 (list (statement-expression node))
			 (statement-updaters node)
			 (list (statement-body node))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(for-statement statement-body statement-expression statement-updaters
				statement-initializers for-statement-p assignment-initializer-p)
			 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of for-statement.lisp --
