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
;;; $Id: labeled-statement.lisp,v 1.1.1.1 2006/04/23 17:11:40 tdias Exp $
;;;
;;; Description: Definition of a mapping for the LabeledStatement class, defined
;;; in Eclipse's JDT.
;;;
;;; -- start of labeled-statement.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (labeled-statement "org.eclipse.jdt.core.dom.LabeledStatement") (statement)
  () () ())

;;; Java methods
(def-java-method (statement-label "getLabel") (labeled-statement))

(def-java-method (statement-body "getBody") (labeled-statement))

;;; Lisp extensions
(defun labeled-statement-p (obj)
  (typep obj 'labeled-statement))

(defmethod node-children ((node labeled-statement))
  (list (statement-label node)
        (statement-body node)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(labeled-statement statement-label statement-body labeled-statement-p)
			 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of labeled-statement.lisp --
