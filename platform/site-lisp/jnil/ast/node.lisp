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
;;; $Id: node.lisp,v 1.2 2006/05/30 21:36:51 tdias Exp $
;;;
;;; Description: Definition of the fundamental class in the Abstract Syntax
;;; Tree (AST) . All AST nodes inherit from this class.
;;;
;;; -- start of node.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defvar *node-table* (make-hash-table))

(def-java-class (node "org.eclipse.jdt.core.dom.ASTNode") ()
  () () ())

;;; Java methods
(def-java-method (node-type "getNodeType") (node))

(def-java-method (node-parent "getParent") (node))

(defmethod an ((node node) (indicator symbol))
  (jcall "getProperty" node (string indicator)))

(defmethod (setf an) (value (node node) (indicator symbol))
  (jcall "setProperty" node (string indicator) value)
  value)

;;; Lisp extensions
(defun node-p (obj)
  (typep obj 'node))

(defun compute-code (code)
  (if (functionp code)
      (force code)
    code))

(defmethod node-code ((node node) &optional (compute t))
  (let ((code (an node :code)))
    (if compute
	(compute-code code)
      code)))

(defmethod node-code (node &optional (compute t))
  (declare (ignore compute))
  node)

(defmethod (setf node-code) (value (node node))
  (setf (an node :code) value))

(defmacro node-push-coder (node fcn)
  ;; Make sure not to call jnil.ast:node-code with node for argument in fcn,
  ;; or the process will go into an infinite loop. Fcn receives an argument
  ;; which is the result of successively applying the dependent coders.
  ;; -- TMD, 15 December 2004
  (with-gensyms (sym)
    `(let ((,sym (node-code ,node nil)))
       (setf (node-code ,node)
	 (delay (funcall ,fcn (compute-code ,sym)))))))

(defmethod find-context ((node node) parent-type)
  (if (typep (node-parent node) parent-type)
      (node-parent node)
    (find-context (node-parent node) parent-type)))

(defmethod find-context ((dummy null) parent-type)
  (declare (ignore parent-type))
  nil)

(defmethod node-children ((dummy tran-struct))
  ;; FIXME: Remove this method as soon as all AST nodes have Lisp mappings.
  ;; -- TMD, 26 October 2004
  nil)

(defmethod node-children ((node node))
  nil)

(defmethod make-signature (dummy)
  "Returns the signature of a NODE.
By definition, a NODE's signature is unique in the context of a Java Project."
  (declare (ignore dummy))
  nil)

(defmethod find-declaration (obj node)
  "Searches for OBJ in the children of NODE.
OBJ is any NODE or BINDING for which a MAKE-SIGNATURE method has been defined."
  (find (make-signature obj) (node-children node)
        :key #'make-signature
        :test #'string=))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(node node-parent an rem-an node-p node-code find-context)
	  'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of node.lisp --
