;;; -*- mode: lisp; package: jnil.lib -*-
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
;;; Description: General utility utils. Used when the switch :support-utils is active.
;;;
;;; -- start of utils.lisp --

(defpackage :jnil.lib)

(in-package :jnil.lib)

(defmacro >>> (form shift) 
  `(mask-field (byte (- 32 ,shift) 0) (ash ,form (- ,shift))))

(defmacro post-incf (form)
  `(prog1 ,form (incf ,form)))

(defmacro post-decf (form)
  `(prog1 ,form (decf ,form)))

(defun make-initialized-instance (class &optional initializer &rest args)
  (let ((inst (make-instance class)))
    (when initializer (apply initializer inst args))
    inst))

(defun make-vector-matrix (dimensions &rest args)
  (if (and (listp dimensions) (rest dimensions))
      (make-array (first dimensions) 
                  :initial-contents (loop for i from 1 upto (first dimensions)
                                        collect (apply #'make-vector-matrix 
                                                       (rest dimensions)
                                                       args)))
    (apply #'make-array dimensions args)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(>>> post-incf post-decf make-initialized-instance make-vector-matrix) 'jnil.lib))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; --- end of utils.lisp --
