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
;;; $Id: caching-layer.lisp,v 1.1.1.1 2006/04/23 17:11:38 tdias Exp $
;;;
;;; Description: 
;;;
;;; -- start of caching-layer.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defvar *cache-list* (list))

(defun clear-ast-cache ()
  (dolist (cache *cache-list*) (clrhash cache)))

(defmacro memoize-method (method-name &optional def-java-method-p)
  (let ((hash-table-name (symb (format nil "*~a-~a*" method-name 'cache))))
    `(progn 
       (defvar ,hash-table-name (make-hash-table :test #'eq))
       (pushnew ,hash-table-name *cache-list*)
       (defmethod ,method-name :around ((node node) ,@(when def-java-method-p '(&rest args)))
         (declare (ignorable args))
         (or (gethash node ,hash-table-name)
             (setf (gethash node ,hash-table-name) (call-next-method)))))))

(defmacro memoize-methods (&rest method-specs)
  `(progn ,@(mapcar #'(lambda (method-spec) 
                        (if (consp method-spec)
                            `(memoize-method ,(car method-spec) ,(cdr method-spec))
                          `(memoize-method ,method-spec)))
                    method-specs)))

(memoize-methods 
 node-children (node-parent . t) (literal-value . t) (declaration-modifiers . t) 
 (declaration-type . t)
 (declaration-p . t) (statement-expression . t) (qualifier-is-type-p) (type-code)
 (expression-operand . t) (expression-operator) (parenthesized-expression . t) 
 (declaration-name . t) (literal-token . t) (node-type . t) (name-string . t)
 (name-binding . t) (abstract-p) (static-p) (public-p) (final-p) 
 (invocation-expression . t) (invocation-name . t) (invocation-method-binding . t)
 (declaration-body . t) (declaration-return-type . t) (constructor-p . t)
 (declaration-parameters) (declaration-throw-exceptions)
 (method-parameter-types) (method-overloaded-p) (statement-label . t) 
 (type-binding . t) (jblock-statements) (expression-left-operand . t) 
 (initializer-body . t) (expression-right-operand . t)
 (extended-operands-p . t) (expression-extended-operands) (on-demand-p . t)
 (ifstatement-test . t) (ifstatement-then . t) (ifstatement-else . t) 
 (statement-updaters) (statement-initializers) 
 (declaration-fragments) (field-access-expression . t) (field-access-name . t) (expression . t)
 (expression-type-binding . t) (statement-body . t)
 (expression-test . t) (expression-then . t) (expression-else . t) (unit-package . t) (unit-imports)
 (unit-types) (instance-creation-args) (instance-creation-anonymous-decl . t) 
 (instance-creation-expression . t) (instance-creation-name . t) (clause-body . t)
 (clause-exception . t) (cast-expression-expression . t) (cast-expression-type . t) (break-label . t)
 (binding-modifiers . t) (binding-kind . t)
 (binding-name . t) (assignment-left-hand-side . t) (assignment-operator) (assignment-right-hand-side . t)
 (element-type) (initializer-expressions) (array-creation-dimensions) (array-creation-initializer . t)
 (array-creation-type . t) (array-access-array . t) (array-access-index . t) (declaration-body-decls)
 (while-expression . t) (while-body . t) 
 (declaration-expression-type . t) (declaration-initializer . t)
 (declaration-extra-dimensions . t) (declaration-binding . t) (binding-field-p . t)
 (binding-identifier . t)
 (binding-type-binding . t) (literal-type . t) (declaration-fields) (declaration-methods) 
 (declaration-types) (declaration-superinterfaces) 
 (interfacep . t) (binding-declaring-class . t) 
 (binding-qualifier-name . t) (binding-array-p . t) (binding-superclass . t)
 (binding-methods) (try-body . t) (try-catch-clauses) (try-finally . t) (throw-expression . t)
 (expression-qualifier . t) (switch-expression . t) (switch-statements) (case-expression . t)
 (invocation-qualifier . t) (field-access-qualifier . t))

(defmethod parse-java-unit :before (project-name qualified-unit-name)
  (declare (ignore project-name qualified-unit-name))
  (clear-ast-cache)
  (clrhash *node-table*))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of caching-layer.lisp --
