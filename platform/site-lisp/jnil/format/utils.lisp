;;; -*- mode: lisp; package: jnil.format -*-
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
;;; $Id: utils.lisp,v 1.1.1.1 2006/04/23 17:11:48 tdias Exp $
;;;
;;; Description: Definition of Jnil's pretty printing facility for code generation.
;;;
;;; -- start of utils.lisp --

(in-package :jnil.format)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defclass code () ())

(defmethod print-object :around ((obj code) stream)
  (if (not *print-pretty*)
      (print-unreadable-object (obj stream :type t :identity t))
    (call-next-method obj stream)))

(defun parse-slot (slot)
  (if (char= #\? (char (string slot) 0))
      (values (symb (subseq (string slot) 1)) nil)
    (values slot t)))

(defun parse-direct-slots (slots)
  (let (parsed-slots constructor-slots)
    (dolist (slot slots)
      (multiple-value-bind (slot constructor-slot-p) (parse-slot slot)
	(when constructor-slot-p (push slot constructor-slots))
	(push slot parsed-slots)))
    (values (nreverse parsed-slots) (nreverse constructor-slots))))

(defmacro defcode (name &optional direct-slots
                   &key format default-initargs (constructor t) (group 'code) extra-accessors)
;;;;- Sun Sep 11 10:48:37 2005 by tiago - At this point, only one extra-accessor per slot is accepted.
  
  (with-gensyms (sym1 sym2)
    (multiple-value-bind (slots constructor-slots) (parse-direct-slots direct-slots)
      `(progn
	 (defclass ,name (,group)
	   ,(mapcar #'(lambda (obj)
			`(,obj :initarg ,(keywrd obj)
			       :initform nil
			       :accessor ,(symb name "-" obj)
                               ,@(aif accessor (getf extra-accessors obj) 
                                      `(:accessor ,accessor))))
                    slots)
	   ,@(when default-initargs `((:default-initargs ,@default-initargs))))
	 ,(when constructor
	    `(defun ,(symb 'make- name) ,constructor-slots
	       (apply #'make-instance
		      (append (list ',name)
			      ,@(mapcar #'(lambda (slot) `(list ,(keywrd slot) ,slot))
					constructor-slots)))))
	 ,(when format
	    `(defmethod print-object ((,sym1 ,name) ,sym2)
	       (with-slots ,slots ,sym1
		 (format ,sym2 ,(first format) ,@(rest format)))))))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(code) 'jnil.format))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of utils.lisp --
