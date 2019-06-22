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
;;; $Id: lisp-guru.lisp,v 1.1.1.1 2006/04/23 17:11:47 tdias Exp $
;;;
;;; Description: Visitor for generation of advanced pieces of code. These
;;; are typically syntactic revisions that, in principle, should not depend on node-code. Arguments
;;; should be tested before running the optimizer.
;;;
;;; -- start of lisp-guru.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

;;; local utility functions
(defun fill-let-bodies (statements)
  (when (not (endp statements))
    (let ((current (first statements)))
      (cond ((not current) (fill-let-bodies (rest statements)))
            ((typep current 'lisp-let*)
	     (let ((body (fill-let-bodies (rest statements))))
	       (if (and body (endp (rest body)) (typep (first body) 'lisp-let*))
		   (setf (lisp-let*-bindings current)
		     (append (lisp-let*-bindings current)
			     (lisp-let*-bindings (first body)))
		     (lisp-let*-body current)
		     (lisp-let*-body (first body)))
		 (setf (lisp-let*-body current)
		   (make-lisp-block body))))
	     (list current))
	    (t (cons current (fill-let-bodies (rest statements))))))))

(defun remove-avoidable-returns (name form)
  (typecase form
    (lisp-block 
     (setf (first (last (lisp-block-body form)))
       (remove-avoidable-returns name (first (last (lisp-block-body form))))))
    (lisp-let*
     (remove-avoidable-returns name (lisp-let*-body form)))
    (lisp-if
     (setf (lisp-if-then form)
       (remove-avoidable-returns name (lisp-if-then form)))
     (setf (lisp-if-else form)
       (remove-avoidable-returns name (lisp-if-else form))))
    (lisp-cond
     (setf (lisp-cond-clauses form)
       (mapcar #'(lambda (clause)
                   (setf (lisp-cond-clause-body clause)
                     (remove-avoidable-returns name (lisp-cond-clause-body clause)))
                   clause)
               (lisp-cond-clauses form))))
    (lisp-simple-cond
     (setf (lisp-simple-cond-then form)
       (remove-avoidable-returns name (lisp-simple-cond-then form)))
     (setf (lisp-simple-cond-else form)
       (remove-avoidable-returns name (lisp-simple-cond-else form))))
    (lisp-case
     (dolist (case-statement (lisp-case-statements form))
       (remove-avoidable-returns name (lisp-case-statement-body case-statement))))
    (lisp-return-from
     (when (lisp-name= name (lisp-return-from-name form))
       (setf form (lisp-return-from-result form)))))
  form)

(defmethod refactor-conditionals ((form lisp-simple-cond))
  (labels ((refactor-rec (form)
             (typecase form
               (lisp-if 
                (cons (make-lisp-cond-clause (lisp-if-test form) (lisp-if-then form))
                      (refactor-rec (lisp-if-else form))))
               (lisp-when
		(list (make-lisp-cond-clause (lisp-when-test form)
					     (or (lisp-when-then form) (make-lisp-block nil)))))
               (lisp-simple-cond
                (cons (make-lisp-cond-clause (lisp-simple-cond-test form)
                                             (lisp-simple-cond-then form))
                      (refactor-rec (lisp-simple-cond-else form))))
               (lisp-cond
                (lisp-cond-clauses form))
               (null nil)
               (t (list (make-lisp-cond-otherwise form))))))
    (make-lisp-cond (cons (make-lisp-cond-clause (lisp-simple-cond-test form)
                                                 (lisp-simple-cond-then form))
                          (refactor-rec (lisp-simple-cond-else form))))))

;;; visitor specific code
(defvisitor lisp-guru 99 (:linj :common-lisp))

(defcoder lisp-guru ((node code) jblock)
  (when (and code (typep code 'lisp-block))
    (msg "Rewriting block")
    (setf (lisp-block-body code)
      (fill-let-bodies (lisp-block-body code))))
  code)

(defcoder lisp-guru ((node code) switch-statement)
  (when (typep code 'lisp-case)
    (msg "Rewriting case expression")
    (mapcar #'(lambda (clause)
		(aif body (lisp-case-statement-body clause)
		     (setf (lisp-block-body body) (fill-let-bodies (lisp-block-body body)))))
	    (lisp-case-statements code)))
  code)

(defcoder lisp-guru ((node code) ifstatement)
  (if (typep code 'lisp-simple-cond)
      (let ((test (lisp-simple-cond-test code))
	    (then (lisp-simple-cond-then code))
	    (else (lisp-simple-cond-else code)))
	(cond ((typep else 'lisp-conditional)
               (msg "Refactoring conditionals")
               (refactor-conditionals code))
              ((not else)
               (msg "Rewriting cond expression as when")
               (make-lisp-when test then))
	      ((and (not (typep then 'lisp-block)) (not (typep else 'lisp-block)))
               (msg "Rewriting cond expression as if")
               (make-lisp-if test then else))
              (t code)))
    code))

(defcoder lisp-guru ((node code) method-declaration)
  (cond ((and (typep code 'lisp-defmethod) (not (string= (return-type-qualified-name node) "void")))
         (msg "Removing avoidable return statements")
         (setf (lisp-defmethod-body code)
           (remove-avoidable-returns (lisp-defmethod-name code) (lisp-defmethod-body code))))
        ((typep code 'lisp-defsend)
         (msg "Removing avoidable return statements")
         (setf (lisp-defsend-body code)
           (remove-avoidable-returns (lisp-defsend-name code) (lisp-defsend-body code)))))
  code)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of lisp-guru.lisp --
