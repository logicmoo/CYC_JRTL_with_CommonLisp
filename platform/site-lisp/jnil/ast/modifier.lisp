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
;;; $Id: modifier.lisp,v 1.1.1.1 2006/04/23 17:11:41 tdias Exp $
;;;
;;; Description: Definition of a mapping for the Modifier class,
;;; defined in Eclipse's JDT.
;;;
;;; -- start of modifier.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

;;; Java methods
(defmethod abstract-p ((modifier fixnum))
  (jstatic "isAbstract" "org.eclipse.jdt.core.dom.Modifier" modifier))

(defmethod static-p ((modifier fixnum))
  (jstatic "isStatic" "org.eclipse.jdt.core.dom.Modifier" modifier))

(defmethod public-p ((modifier fixnum))
  (jstatic "isPublic" "org.eclipse.jdt.core.dom.Modifier" modifier))

(defmethod final-p ((modifier fixnum))
  (jstatic "isFinal" "org.eclipse.jdt.core.dom.Modifier" modifier))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(abstract-p static-p public-p final-p) 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of modifier.lisp --
