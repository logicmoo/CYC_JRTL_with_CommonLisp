;;; -*- mode: lisp; package: jnil -*-
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
;;; $Id: linj-coder.lisp,v 1.1.1.1 2006/04/23 17:11:47 tdias Exp $
;;;
;;; Description: Visitor for additional AST annotation.
;;;
;;; -- start of linj-coder.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

;;; local utility functions
(defun safe-initializer-linj (node)
  (aif code (node-code (declaration-initializer node))
       code
    (case* (type-name node)
      ("byte" (make-lisp-the "byte" 0))
      ("short" (make-lisp-the "short" 0))
      ("int" 0)
      ("long" (make-lisp-name "0L"))
      ("float" 0.0)
      ("double" 0.0d0)
      ("char" #\null)
      ("boolean" (make-lisp-name "nil"))
      (t (make-lisp-name "null")))))

;;; visitor definition
(defvisitor linj-coder 20 (:linj))

(defcoder linj-coder (node name)
  (make-lisp-name (cond ((or (not (bound-p node)) (method-bound-p node)) (java-to-lisp-name node))
                        ((variable-p node) (java-to-lisp-name node (final-p node)))
                        (t (java-to-lisp-type (name-type node))))))

(defcoder linj-coder (node package-declaration)
  (msg "Generating Linj specific code for package declaration")
  (make-linj-package (name-string (declaration-name node))))

(defcoder linj-coder (node import-declaration)
  (msg "Generating Linj specific code for import declaration")
  (let ((name (name-string (declaration-name node))))
    (make-linj-import (make-lisp-name name (if (on-demand-p node) ".*" "")))))

(defcoder linj-coder (node null-literal)
  (make-lisp-name "null"))

(defcoder linj-coder (node field-access)
  (make-lisp-slot-value (node-code (field-access-expression node))
			(java-to-lisp-name (field-access-name node))))

(defcoder linj-coder (node break-statement)
  (msg "Generating Linj specific code for break statement")
  (aif label (statement-label node)
       (make-lisp-return-from (node-code label) nil)
    (make-lisp-sexp "return" nil)))

(defcoder linj-coder (node continue-statement)
  (msg "Generating Linj specific code for continue statement")
  (make-lisp-sexp "continue" (node-code (statement-label node))))

(defcoder linj-coder (node super-constructor-invocation)
;;;;- Sun May  8 13:13:29 2005 by tiago - We must be careful not to write
;;;;(CALL-NEXT-METHOD) when we find a super() statement in Java.

  (msg "Generating Linj specific code for super constructor invocation")
  (if (or (longer (invocation-args node) 0)
	  (not (declaration-parameters (find-context node 'method-declaration))))
      (make-lisp-sexp "call-next-method" (collect-code (invocation-args node)))
    (make-linj-send (make-lisp-name "super") (make-lisp-name ":initialize-instance") nil)))

(defcoder linj-coder (node super-method-invocation)
;;;;- Sun May  8 13:24:57 2005 by tiago - We can only use CALL-NEXT-METHOD
;;;;when the super method is the same as the current method. Otherwise we must
;;;;depend on the Linj specific specific syntax.

  (msg "Generating Linj specific code for super method invocation")
  (let* ((method-decl (find-context node 'method-declaration))
	 (invocation-name (node-code (invocation-name node)))
	 (declaration-name (node-code (declaration-name method-decl)))
	 (args (collect-code (invocation-args node))))
    (cond ((and (lisp-name= invocation-name declaration-name)
		(or (rest (invocation-args node)) (not (declaration-parameters method-decl))))
	   (when (not (or (constructor-p method-decl) (static-p method-decl)))
	     (push (make-lisp-name "this") args))
	   (make-lisp-sexp "call-next-method" args))
	  (t (make-linj-send (make-lisp-name "super") (node-code (invocation-name node)) args)))))

(defcoder linj-coder (node method-invocation)
  (msg "Generating Linj specific code for method invocation")
  (let ((params (collect-code (invocation-args node)))
	(declaring-class-qualified-name (method-declaring-class node))
	(invocation-name (node-code (invocation-name node)))
	(invocation-expr (node-code (invocation-expression node))))
    (cond ((linj-keyword-p (lisp-name-name invocation-name))
	   (make-linj-send (or invocation-expr (make-lisp-name "this")) invocation-name params))
	  ((class-or-super-p (find-context node 'type-declaration) declaring-class-qualified-name)
	   (make-lisp-sexp invocation-name
			   (if (not (static-invocation-p node))
			       (cons (or invocation-expr (make-lisp-name "this")) params)
			     params)))
	  ((and (not (static-invocation-p node)) (invocation-expression node))
	   (make-lisp-sexp invocation-name (cons invocation-expr params)))
	  (t (make-linj-in (make-lisp-the (java-to-lisp-type declaring-class-qualified-name) nil)
			   (make-lisp-sexp invocation-name params))))))

(defcoder linj-coder (node postfix-expression)
  (let ((operand-name (node-code (expression-operand node))))
    (make-lisp-sexp
     (case* (expression-operator node) ("++" "post-incf") ("--" "post-decf"))
     operand-name)))

(defcoder linj-coder (node variable-declaration-fragment)
;;;;- Sun May  8 22:55:58 2005 by tiago - Array initializations don't work in
;;;;the general case.

  (msg "Generating Linj specific code for variable declaration fragment")
  (let ((name (node-code (declaration-name node)))
	(initializer (safe-initializer-linj node)))
    (cond ((not (field-p node)) 
           (make-lisp-sexp name initializer))
	  ((static-p node) 
	   (make-lisp-sexp (if (final-p node) "defconstant" "defvar") (list name initializer)))
	  (t (let ((slot-code (make-lisp-slot name)))
	       (when (declaration-initializer node)
		 (setf (lisp-slot-initform slot-code) initializer))
	       slot-code)))))

(defcoder linj-coder (node variable-declaration-expression)
  (mapcar #'(lambda (fragm)
	      (make-lisp-for-init (node-code (declaration-name fragm))
				  (safe-initializer-linj fragm)))
	  (declaration-fragments node)))

(defcoder linj-coder (node class-instance-creation)
;;;;- Sun May  8 22:59:11 2005 by tiago - Keep in mind that, in Linj, the NEW
;;;;form also works for anonymous class declarations.

  (let* ((creation-name-code (node-code (instance-creation-name node))))
    (aif anonymous-decl (instance-creation-anonymous-decl node)
         (make-linj-new (let ((class-code (node-code anonymous-decl)))
                          (setf (linj-class-name class-code) creation-name-code)
                          class-code) nil)
      (make-linj-new creation-name-code (collect-code (instance-creation-args node))))))

(defcoder linj-coder (node qualified-name)
  (cond ((type-specifier-p node) 
         (make-lisp-name (java-to-lisp-type node)))
        ((qualifier-is-type-p node)
         (make-linj-in (make-lisp-the (java-to-lisp-type (type-qualified-name
                                                          (qualified-name-qualifier node))) nil)
                       (node-code (qualified-name-name node))))
        (t (make-lisp-slot-value (node-code (qualified-name-qualifier node))
                                 (node-code (qualified-name-name node))))))

(defcoder linj-coder (node this-expression)
  (make-lisp-name "this"))

(defcoder linj-coder (node method-declaration)
;;;;- Sun May  8 23:05:54 2005 by tiago - Return type is now set by the type
;;;;declarer.

  (msg "Generating Linj specific code for method declaration")
  (let* ((involving-type (find-context node 'type-declaration))
	 (declaring-class (node-code (declaration-name involving-type)))
	 (parameters (collect-code (declaration-parameters node)))
	 (body (node-code (declaration-body node)))
	 (declares (make-lisp-declare nil))
	 (name (node-code (declaration-name node))))
    (when (or (abstract-p node) (interface-p involving-type))
      (push-declare (make-lisp-sexp "modifiers"
				    (list (make-lisp-name ":abstract")))
		    declares))
    (cond ((constructor-p node) (make-linj-defnew parameters body))
	  ((main-declaration-p node) (make-linj-main parameters body))
	  (t (make-lisp-defmethod name
				  (and (not (static-p node)) declaring-class)
				  parameters
				  declares
				  body)))))

(defcoder linj-coder (node anonymous-class-declaration)
  (msg "Generating Linj specific code for anonymous class declaration")
  (make-linj-class (collect-code (declaration-body-decls node))))

(defcoder linj-coder (node type-declaration)
  (msg "Generating Linj specific code for type declaration")
  (letv (((slots other-decls) (slots-and-others (declaration-fields node)))
	 (superinterfaces (declaration-superinterfaces node))
         ((getters setters others) (declaration-methods* node)))
    (make-linj-defclass (interface-p node)
                        (when (abstract-p node) (notany #'abstract-p others))
                        (node-code (declaration-name node))
                        (append (collect-code superinterfaces)
                                (mklist (cond ((declaration-superclass node) 
                                               (node-code (declaration-superclass node)))
                                              ((and superinterfaces (not (interface-p node)))
                                               "object"))))
                        (push-readers-and-writers (apply #'append (collect-code slots))
                                                  getters setters)
                        (append (apply #'append (collect-code other-decls))
                                (collect-code (declaration-types node))
                                (collect-code others)))))

(defcoder linj-coder (node compilation-unit)
  (msg "Generating Linj specific code for compilation unit")
  (make-linj-source (node-code (unit-package node))
                    (collect-code (unit-imports node))
                    (collect-code (unit-types node))))

(defcoder linj-coder (node array-initializer)
  (let* ((exprs (collect-code (initializer-expressions node)))
         (dimensions (array-dimensions-from-list exprs)))
    (typecase (node-parent node)
      ((or array-initializer array-creation) exprs)
      (t (if (singleton-p dimensions)
             (make-lisp-sexp "vector" exprs)
           (make-lisp-array t dimensions (list-to-array-initializer exprs)))))))

(defcoder linj-coder (node array-creation)
  (let* ((initializer (node-code (array-creation-initializer node)))
         (dimensions (if initializer
                         (array-dimensions-from-list initializer)
                       (collect-code (array-creation-dimensions node)))))
    (make-lisp-array (literal-tree-p dimensions) dimensions (list-to-array-initializer initializer))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of linj-coder.lisp --
