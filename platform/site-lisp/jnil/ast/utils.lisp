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
;;; $Id: utils.lisp,v 1.2 2006/05/30 21:39:20 tdias Exp $
;;;
;;; Description: 
;;;
;;; -- start of utils.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(definline start-jlinker ()
  (or (javatools.jlinker:jlinker-query) 
      (javatools.jlinker:jlinker-init :java :java-file "~/JavaToLisp.trp")))

;;;;- Sun May 28 18:52:20 2006 by tiago - this is defined as a method and not a function so
;;;;that the caching layer can easily be (de)activated by defining a "before method".
(defmethod parse-java-unit (project-name qualified-unit-name)
  (start-jlinker)
  (jstatic "parseProjectUnit" "eclisp.EclispServer" project-name qualified-unit-name))

(defun java-project-unit-names (project-name)
  (start-jlinker)
  (jlist2cons (jstatic "getProjectUnitNames" "eclisp.EclispServer" project-name)))


(defun jlist2cons (jlist)
  (let ((acc ())
	(iterator (jcall "listIterator" jlist)))
    (loop (if (not (jcall "hasNext" iterator))
              (return (nreverse acc))
            (push (jcall "next" iterator) acc)))))

(defun jvector2cons (jvector)
  (let ((acc ()))
    (dotimes (i (jarrayp jvector 0) (nreverse acc))
      (push (jarray-ref jvector i) acc))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(parse-java-unit recycle-java-unit java-project-unit-names) 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of utils.lisp --
