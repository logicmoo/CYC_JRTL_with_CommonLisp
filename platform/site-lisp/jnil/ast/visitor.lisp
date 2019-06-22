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
;;; $Id: visitor.lisp,v 1.1.1.1 2006/04/23 17:11:44 tdias Exp $
;;;
;;; Description: Definition of the AST node visiting facility. The defcoder
;;; macro should normally be used to define functions which will be evaluated in
;;; a lazy fashion when a given node's code is required.
;;;
;;; -- start of visitor.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defvar *registered-visitors* (make-hash-table :test #'eq))

(defstruct (tuple (:constructor make-tuple (rank name switches))) 
  rank name switches)

(defclass visitor () ((switches :initarg :switches :allocation :class)))
;;;;- Wed May 11 16:25:14 2005 by tiago - Using :ALLOCATION :CLASS is equivalent
;;;;to resorting to a global variable.


(defmacro make-visitor (name switches)
  `(make-instance ,name :switches ,switches))

(defmethod switchp ((visitor-or-list visitor) switch-name)
  (switchp (slot-value visitor-or-list 'switches) switch-name))

(defmethod switchp ((visitor-or-list list) switch-name)
  (member switch-name visitor-or-list))

(defmethod switchp ((visitor-or-list visitor) (switches list))
  (every #'(lambda (switch) (switchp visitor-or-list switch)) switches))

(defun dialect-visitors (dialect switches)
  (loop for tuple in (gethash dialect *registered-visitors*) 
      when (subsetp (tuple-switches tuple) switches)
      collect (make-visitor (tuple-name tuple) (cons dialect switches))))

(defmacro defvisitor (name rank dialects &optional switches)
  `(progn
     (defclass ,name (visitor) ())
     ,@(mapcar #'(lambda (dialect)
                   `(let ((dialect-visitors (remove-if #'(lambda (tuple)
                                                           (eql ',name (tuple-name tuple)))
                                                       (gethash ,dialect *registered-visitors*)
                                                       :count 1)))
                      (push (make-tuple ,rank ',name (list ,@switches)) dialect-visitors)
                      (setf (gethash ,dialect *registered-visitors*)
                        (sort dialect-visitors 
                              #'(lambda (tuple1 tuple2)
                                  (< (tuple-rank tuple1) (tuple-rank tuple2)))))))
               dialects)))

(defmethod visit :before ((vis visitor) node)
  ;; This method draws from the fact that it is the most general 'before method'
  ;; possibly defined and so is the last to be executed, before any unqualified
  ;; visit method is invoked. -- TMD, 30 October 2004
  (dolist (child (node-children node))
    (when child (visit vis child))))

(defmethod visit (dummy (node tran-struct))
  (declare (ignore dummy))
  nil)

(defmacro defvisit (vis-spec (node node-type &key (visit-children t) descending) &body body)
  (let ((qualifier (cond ((not visit-children) (list :around)) 
                         (descending (list :before))
                         (t (list)))))
    (with-gensyms (sym)
      `(defmethod visit ,@qualifier (,(if (listp vis-spec) vis-spec `(,sym ,vis-spec))
                                        (,node ,node-type))
         ,@body
         (values)))))

(defmacro defcoder (vis-spec (node-bindings node-type) &body body)
  ;; See jnil.ast::node-push-coder to understand why it is necessary to have
  ;; separate bindings for the node's current code. Note that coders work in a
  ;; compositional way, so by the time they are executed, only the children of
  ;; the associated node can be safely assumed to have been updated.
  ;; -- TMD, 17 December 2004
  (multiple-value-bind (node current-code-binding)
      (if (listp node-bindings) 
          (values (first node-bindings) (second node-bindings))
        node-bindings)
    (multiple-value-bind (vis-type vis-name)
        (if (listp vis-spec)
            (values (second vis-spec) (first vis-spec))
          vis-spec)
      (let* ((sym (gensym))
             (coder-fn `#'(lambda ,(when current-code-binding `(,current-code-binding))
                            (funcall #'coder ,(or vis-name `',vis-type) ,node ,current-code-binding))))
        `(progn
           (defmethod coder (,(if vis-name
                                  `(,vis-name ,vis-type)
                                `(,(gensym) (eql ',vis-type)))
                             (,node ,node-type)
                             &optional ,(or current-code-binding sym))
             ,@(unless current-code-binding `((declare (ignore ,sym))))
             ,@body)
           (defvisit ,vis-spec (,node ,node-type)
             ,(if current-code-binding
                  `(node-push-coder ,node ,coder-fn)
                `(setf (node-code ,node) ,coder-fn))))))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(dialect-visitors defvisitor visit defvisit defcoder switchp) 
          'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of visitor.lisp --
