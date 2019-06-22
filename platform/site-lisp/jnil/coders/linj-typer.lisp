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
;;; $Id: linj-typer.lisp,v 1.1.1.1 2006/04/23 17:11:47 tdias Exp $
;;;
;;; Description: Visitor for generation of type declarations.
;;;
;;; -- start of linj-typer.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defvisitor linj-typer 50 (:linj))

(defcoder linj-typer ((node code) cast-expression)
  (msg "Adding Java type cast")
  (make-lisp-the (java-to-lisp-type (type-qualified-name node)) code))

(defcoder linj-typer ((node code) method-declaration)
  (msg "Adding Java returns declaration")
  (unless (or (constructor-p node) (main-declaration-p node))
    (push-declare (make-lisp-sexp "returns"
                                  (make-lisp-name (java-to-lisp-type
                                                   (return-type-qualified-name node))))
                  (lisp-defmethod-declares code))
    (aif exceptions (declaration-thrown-exceptions node)
         (push-declare (make-lisp-sexp "throws"
                                       (collect-code exceptions))
                       (lisp-defmethod-declares code))))
  code)

(defcoder linj-typer ((node code) variable-declaration-fragment)
  (msg "Adding Java type declaration to variable declaration fragment")
  (let ((declaration-type (java-to-lisp-type (type-qualified-name node))))
    (cond ((not (field-p node)) (setf (lisp-sexp-head code)
                                  (format nil "~a/~a" (lisp-sexp-head code) declaration-type)))
          ((static-p node) (setf (first (lisp-sexp-rest code))
                             (make-lisp-name (first (lisp-sexp-rest code)) "/"
                                             declaration-type)))
          (t (setf (lisp-slot-type code) (make-lisp-name declaration-type)))))
  code)

(defcoder linj-typer ((node code) single-variable-declaration)
  (msg "Adding Java type declaration to single variable declaration")
  (make-lisp-name code "/" (java-to-lisp-type (type-qualified-name node))))

(defcoder linj-typer ((node code) variable-declaration-expression)
  (msg "Adding Java type declarations to variable declaration expression")
  (mapcar #'(lambda (fragm)
              (setf (lisp-for-init-name fragm)
                (make-lisp-name
                 (lisp-for-init-name fragm) "/"
                 (java-to-lisp-type (type-qualified-name node)))))
          code)
  code)

(defcoder linj-typer ((node code) array-creation)
  (setf (lisp-array-type code) (java-to-lisp-name (type-name node)))
  code)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of linj-typer.lisp --
