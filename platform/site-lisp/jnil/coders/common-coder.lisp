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
;;; $Id: common-coder.lisp,v 1.2 2006/05/30 21:21:09 tdias Exp $
;;;
;;; Description: Visitor for additional AST annotation.
;;;
;;; -- start of common-coder.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defun list-with (elt n)
  (if (<= n 0) 
      nil
    (cons elt (list-with elt (1- n)))))

(defun vector-from-array-dimensions (dimensions)
  (make-lisp-sexp "vector" 
                  (if (singleton-p dimensions)
                      (list-with (make-lisp-name "nil") (first dimensions))
                    (list-with (vector-from-array-dimensions (rest dimensions)) (first dimensions)))))

;;; local utility functions
(defun safe-initializer-cl (node)
;;;;- Sat Sep  3 23:13:03 2005 by tiago - it is assumed that this function will only be called in
;;;;the context of variable declarations.
  
  (aif code (node-code (declaration-initializer node))
       code
    (case* (type-name node)
      ("byte" 0)
      ("short" 0)
      ("int" 0)
      ("long" 0)
      ("float" 0.0)
      ("double" 0.0d0)
      ("char" #\null)
      ("boolean" (make-lisp-name "nil"))
      (t (make-lisp-name "nil")))))

(defun infer-extended-method-name (bound-method-name)
  (let ((name (pragma-review (java-to-lisp-name bound-method-name))))
    (if (or (constructor-bound-p bound-method-name) (method-overloaded-p bound-method-name))
        (append-parameter-types name (method-parameter-type-names bound-method-name))
      name)))

(defun pragma-review (name)
  (cond ((match-re "is-.*" name) (concatenate 'string (subseq name 3) "-p"))
        (t name)))

;;; visitor definition
(defvisitor common-coder 20 (:common-lisp))

(defcoder common-coder (node name)
  (cond ((not (bound-p node)) (make-lisp-name (java-to-lisp-name node)))
        ((variable-p node) (let ((lisp-name (java-to-lisp-name node (final-p node))))
                             (if (and (field-p node) (not (static-p node)))
                                 (make-lisp-slot-value "this" lisp-name)
                               (make-lisp-name lisp-name))))
        (t (make-lisp-name (if (and (from-source-p node) (method-bound-p node))
                               (infer-extended-method-name node)
                             (java-to-lisp-type node))))))

(defcoder (vis common-coder) (node package-declaration)
  (msg "Generating Lisp code for package declaration")
  (make-lisp-package (name-string (declaration-name node))
                     (or (an node :jnil-lib-required-p) (switchp vis :support-utils))))

(defcoder common-coder (node import-declaration)
  (msg "Generating Linj code for import declaration")
  (let ((name (name-string (declaration-name node))))
    (make-linj-import (make-lisp-name name (if (on-demand-p node) ".*" "")))))

(defcoder common-coder (node null-literal)
  (make-lisp-name "nil"))

(defcoder common-coder (node field-access)
  (let ((access-expression (node-code (field-access-expression node)))
        (access-name (field-access-name node)))
    (if (array-p (field-access-expression node))
        (if (string= (name-string access-name) "length")
              (make-lisp-sexp "length" access-expression)
            (make-lisp-slot-value (node-code access-expression)
                                  (java-to-lisp-name access-name)))
      (make-lisp-slot-value (node-code access-expression)
                            (java-to-lisp-name access-name)))))

(defcoder common-coder (node break-statement)
  (msg "Generating Common lisp specific code for break statement")
  (aif label (statement-label node)
       (make-lisp-return-from (node-code label) nil)
    (make-lisp-sexp "return" nil)))

(defcoder common-coder (node continue-statement)
  (msg "Generating Common Lisp specific code for continue statement")
  (let* ((labeled-stmt (find-context node 'labeled-statement))
         (iteration-stmt (find-context node '(or while-statement for-statement do-statement)))
         (label (cond ((an iteration-stmt :continue-label)
                       (an iteration-stmt :continue-label))
                      ((and labeled-stmt (an labeled-stmt :break-in-body-p)
                       (setf (an iteration-stmt :continue-label) (gensym))))
                      (t (setf (an iteration-stmt :continue-label)
                           (or (and (statement-label node) (java-to-lisp-name (statement-label node)))
                               (gensym)))))))
    (make-lisp-sexp "return-from" (list (make-lisp-name label)))))

(defcoder common-coder (node super-constructor-invocation)
  (msg "Can't handle super contructor invocations in Common Lisp" t)
  (make-lisp-unreadable (make-lisp-sexp "call-next-method" (collect-code (invocation-args node)))))

(defcoder common-coder (node super-method-invocation)
;;;;- Sun May  8 13:24:57 2005 by tiago - We can only use CALL-NEXT-METHOD
;;;;when the super method is the same as the current method. Otherwise we must
;;;;depend on the Linj specific specific syntax.

  (msg "Can't handle super method invocations" t)
  (let* ((method-decl (find-context node 'method-declaration))
	 (invocation-name (node-code (invocation-name node)))
	 (declaration-name (node-code (declaration-name method-decl)))
	 (args (collect-code (invocation-args node))))
    (make-lisp-unreadable
     (cond ((and (lisp-name= invocation-name declaration-name)
                 (or (rest (invocation-args node)) (not (declaration-parameters method-decl))))
            (when (not (or (constructor-p method-decl) (static-p method-decl)))
              (push (make-lisp-name "this") args))
            (make-lisp-sexp "call-next-method" args))
           (t (make-lisp-send (make-lisp-name "super") (node-code (invocation-name node)) args))))))

(defcoder (vis common-coder) ((node addit-knowledge-code) method-invocation)
  (or addit-knowledge-code
      (let* ((params (collect-code (invocation-args node)))
             (declaring-class-qualified-name (method-declaring-class node))
             (declaring-class-lisp-type (java-to-lisp-type declaring-class-qualified-name))
             (invocation-name (invocation-name node))
             (invocation-name-code (node-code invocation-name))
             (invocation-expr (node-code (invocation-expression node))))
        (msg "Generating Common Lisp specific code for method invocation")
        (cond ((not (from-source-p node))
               (make-lisp-unreadable (make-lisp-sexp invocation-name-code 
                                                     (append (mklist invocation-expr) 
                                                             params))))
              ((common-lisp-function-p (lisp-name-name invocation-name-code))
               (let* ((class-or-expr (if (static-invocation-p node) 
                                         (make-lisp-keyword declaring-class-lisp-type)
                                       (or invocation-expr (make-lisp-name "this"))))
                      (send (make-lisp-send class-or-expr invocation-name-code params)))
                 (if (and (switchp vis :sendable-methods)
                          (or (not invocation-expr) (from-source-p node)))
                     send
                   (make-lisp-unreadable send))))
              ((class-or-super-p (find-context node 'type-declaration) declaring-class-qualified-name)
               (make-lisp-sexp invocation-name-code
                               (if (not (static-invocation-p node))
                                   (cons (or invocation-expr (make-lisp-name "this")) params)
                                 params)))
              ((and (not (static-invocation-p node)) (invocation-expression node))
               (make-lisp-sexp invocation-name-code (cons invocation-expr params)))
              (t (make-lisp-sexp invocation-name-code params))))))

(defcoder common-coder (node variable-declaration-fragment)
;;;;- Sun May  8 22:55:58 2005 by tiago - Array initializations don't work in
;;;;the general case.

  (msg "Generating Common Lisp specific code for variable declaration fragment")
  (let ((name (make-lisp-name (java-to-lisp-name (declaration-name node) (final-p node))))
        (initializer (safe-initializer-cl node)))
    (cond ((not (field-p node))
           (make-lisp-sexp name initializer))
          ((static-p node) 
           (make-lisp-sexp (if (final-p node) "defconstant" "defvar")
                           (list name initializer)))
          (t (let ((slot-code (make-lisp-slot name)))
               (setf (lisp-slot-initform slot-code) initializer)
               slot-code)))))

(defcoder common-coder (node variable-declaration-expression)
  (mapcar #'(lambda (fragm)
              (make-lisp-for-init (node-code (declaration-name fragm))
                                  (safe-initializer-cl fragm)))
          (declaration-fragments node)))

(defcoder (vis common-coder) ((node addit-knowledge-code) class-instance-creation)
  (or addit-knowledge-code
      (let* ((creation-name (node-code (instance-creation-name node)))
             (anonymous-decl (instance-creation-anonymous-decl node)))
        (cond (anonymous-decl
               (make-lisp-unreadable (make-linj-new (let ((class-code (node-code anonymous-decl)))
                                                      (setf (linj-class-name class-code) creation-name)
                                                      class-code)
                                                    nil)))
              ((instance-creation-with-default-constructor-p node)
               (let ((lisp-default-new (make-lisp-default-new creation-name)))
                 (if (from-source-p node)
                     lisp-default-new
                   (make-lisp-unreadable lisp-default-new))))
              (t (let* ((initializer (append-parameter-types (make-lisp-name "initialize-" creation-name)
                                                             (initializer-parameter-types node)))
                        (args (collect-code (instance-creation-args node)))
                        (lisp-new (make-lisp-new creation-name initializer args)))
                   (if (and (switchp vis :initialize-methods)
                            (switchp vis :initialized-instances)
                            (from-source-p node))
                       lisp-new
                     (make-lisp-unreadable lisp-new))))))))

(defcoder common-coder (node qualified-name)
;;;;- Sun Jun 12 21:49:39 2005 by tiago - The common case of qualified-name for accessing array
;;;;dimensions is treated as a special case.

  (if (type-specifier-p node)
      (make-lisp-unreadable (make-lisp-name (java-to-lisp-type node)))
    (let ((slot-name (java-to-lisp-name (qualified-name-name node)))
          (qualifier (qualified-name-qualifier node))
          (type (type-qualified-name (qualified-name-qualifier node))))
      (cond ((qualifier-is-type-p node)
             (make-lisp-unreadable (make-linj-in (make-lisp-the (java-to-lisp-type type) nil)
                                                 (node-code (qualified-name-name node)))))
            ((and (array-bound-p qualifier) (string= slot-name "length"))
             (make-lisp-sexp "length" (node-code qualifier)))
            (t (make-lisp-slot-value (java-to-lisp-name qualifier) slot-name))))))

(defcoder common-coder (node this-expression)
  (make-lisp-name "this"))

(defcoder (vis common-coder) (node method-declaration)
  (msg "Generating Common Lisp specific code for method declaration")
  (let* ((involving-type (find-context node 'type-declaration))
         (declaring-class (java-to-lisp-type (declaration-name involving-type)))
         (parameters (collect-code (declaration-parameters node)))
         (body (node-code (declaration-body node)))
         (declares (make-lisp-declare nil))
         (name (node-code (declaration-name node))))
    (cond ((constructor-p node)
           (if (switchp vis :initialize-methods)
               (make-lisp-defmethod (make-lisp-name "initialize-" name)
                                    nil
                                    (cons (make-lisp-name "this") parameters)
                                    declares
                                    body)
             (make-lisp-unreadable (make-linj-defnew parameters body))))
          ((an node :sendable-method-p)
           (let ((code (make-lisp-defsend declaring-class name (static-p node) parameters declares body)))
             (if (switchp vis :sendable-methods)
                 code
               (make-lisp-unreadable code))))
          (t (make-lisp-defmethod name
                                  (and (not (static-p node)) declaring-class)
                                  parameters
                                  declares
                                  body)))))

(defcoder common-coder (node anonymous-class-declaration)
  (msg "Can't handle anonymous class declarations" t)
  (make-lisp-unreadable (make-linj-class (collect-code (declaration-body-decls node)))))

(defcoder common-coder (node type-declaration)
  (msg "Generating Common Lisp specific code for type declaration")
  (letv (((slots other-decls) (slots-and-others (declaration-fields node)))
         (superinterfaces (declaration-superinterfaces node))
         ((getters setters others) (declaration-methods* node)))
    (make-lisp-defclass (java-to-lisp-type (declaration-name node))
                        (append (collect-code superinterfaces)
                                (mklist (aif superclass (declaration-superclass node)
                                             (node-code superclass)
                                          (when (and superinterfaces (not (interface-p node))) 
                                            "object"))))
                        (push-readers-and-writers (apply #'append (collect-code slots))
                                                  getters nil) ; removed 'setters' (see bug 1)
                        (append (apply #'append (collect-code other-decls))
                                (collect-code (declaration-types node))
                                (collect-code others)))))

(defcoder common-coder (node compilation-unit)
  (msg "Generating Common Lisp specific code for compilation unit")
  (make-lisp-source
   (node-code (unit-package node))
   (collect-code (unit-imports node))
   (collect-code (unit-types node))))

(defcoder common-coder (node array-initializer)
  (make-lisp-sexp "vector" (collect-code (initializer-expressions node))))

(defcoder (vis common-coder) (node array-creation)
  (let ((initializer (node-code (array-creation-initializer node)))
        (dimensions (collect-code (array-creation-dimensions node))))
    (or initializer
        (if (literal-tree-p dimensions)
            (if (singleton-p dimensions) 
                (make-lisp-array t (first dimensions) nil)
              (vector-from-array-dimensions dimensions))
          (if (switchp vis :support-utils)
              (make-lisp-vector-matrix nil dimensions nil)
            (make-lisp-unreadable (make-lisp-array nil dimensions nil)))))))
        
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of common-coder.lisp --
