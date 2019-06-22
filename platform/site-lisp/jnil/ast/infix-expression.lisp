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
;;; $Id: infix-expression.lisp,v 1.1.1.1 2006/04/23 17:11:40 tdias Exp $
;;;
;;; Description: Definition of a mapping for the InfixExpression class,
;;; defined in Eclipse's JDT.
;;;
;;; -- start of infix-expression.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (infix-expression "org.eclipse.jdt.core.dom.InfixExpression") (expression)
  () () ())

;;; Java methods
(def-java-method
    (expression-left-operand "getLeftOperand") (infix-expression))

(defmethod expression-operator ((expr infix-expression))
  (jcall "toString" (jcall "getOperator" expr)))

(def-java-method (expression-right-operand "getRightOperand") 
    (infix-expression))

(def-java-method (extended-operands-p "hasExtendedOperands")
    (infix-expression))

(defmethod expression-extended-operands ((expr infix-expression))
  (jlist2cons (jcall "extendedOperands" expr)))

;;; Lisp extensions
(defun infix-expression-p (obj)
  (typep obj 'infix-expression))

(defmethod infix-operator-args ((node infix-expression))
  (let* ((right-operand (expression-right-operand node))
	 (left-operand (expression-left-operand node)))
    (append (list left-operand right-operand)
	    (if (extended-operands-p node)
                (expression-extended-operands node)
	      (list)))))

(defmethod node-children ((node infix-expression))
  (append (list (expression-left-operand node))
          (list (expression-right-operand node))
          ;; Be careful not to trigger lazy creation of list.
          ;; -- TMD, 09 November 2004
          (if* (extended-operands-p node) 
             then (expression-extended-operands node))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(infix-expression expression-left-operand expression-operator expression-right-operand
            extended-operands-p expression-extended-operands infix-expression-p infix-operator-args)
          'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of infix-expression.lisp --
