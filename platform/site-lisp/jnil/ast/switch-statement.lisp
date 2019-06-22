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
;;; $Id: switch-statement.lisp,v 1.1.1.1 2006/04/23 17:11:43 tdias Exp $
;;;
;;; Description: Definition of a mapping for the SwitchStatement class, defined
;;; in Eclipse's JDT.
;;;
;;; -- start of switch-statement.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (switch-statement "org.eclipse.jdt.core.dom.SwitchStatement") (statement)
  () () ())

;;; Java methods
(def-java-method (switch-expression "getExpression") (switch-statement))

(defmethod switch-statements ((statement switch-statement))
  (jlist2cons (jcall "statements" statement)))

;;; Lisp extensions
(defun switch-statement-p (obj)
  (typep obj 'switch-statement))

(defmethod switch-case-statements ((statement switch-statement))
  (labels ((switch-case-statements-rec (statements acc)
				 (if (endp statements)
					  (nreverse acc)
					(let ((cases (collect-leading-cases statements)))
					  (switch-case-statements-rec 
						(member-if #'(lambda (statement) 
											(and (switch-case-p statement) (not (member statement cases))))
									  (rest statements))
						(cons (cons cases	(case-statements (rest statements) (list))) acc))))))
    (let ((statements (switch-statements statement)))
      (switch-case-statements-rec statements (list)))))

(defun collect-leading-cases (statements)
  (labels ((collect-leading-cases-rec (statements acc)
				 (if (endp statements)
					  (nreverse acc)
					(let ((statement (first statements)))
					  (typecase statement
						 (empty-statement (collect-leading-cases-rec (rest statements) acc))
						 (switch-case (collect-leading-cases-rec (rest statements) (cons statement acc)))
						 (t (nreverse acc)))))))
	 (collect-leading-cases-rec statements (list))))

(defun case-statements (statements acc)
  (let ((statement (first statements)))
	 (cond ((or (endp statements) (case-end-statement-p statement))
			  (nreverse acc))
			 ((or (empty-statement-p statement) (switch-case-p statement))
			  (case-statements (rest statements) acc))
			 ((fall-through-statement-p statement)
			  (case-statements (rest statements) (cons statement acc)))
			 (t (nreverse (cons statement acc))))))

(defun case-end-statement-p (statement)
  (typecase statement
	 ((or break-statement continue-statement) (not (statement-label statement)))
	 (t nil)))

(defun fall-through-statement-p (statement)
  (typecase statement
    ((or return-statement continue-statement break-statement) nil)
    (jblock (every #'fall-through-statement-p (jblock-statements statement)))
    (ifstatement (or (fall-through-statement-p (ifstatement-then statement))
							(fall-through-statement-p (ifstatement-else statement))))
	 ;;etc
    (t t)))

(defmethod node-children ((node switch-statement))
  (cons (switch-expression node)
		  (switch-statements node)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(switch-statement switch-expression switch-statements
				switch-statement-p switch-case-statements)
			 'jnil.ast)) 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of switch-statement.lisp --
