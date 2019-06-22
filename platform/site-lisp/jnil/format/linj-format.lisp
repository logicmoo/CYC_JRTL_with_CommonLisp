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
;;; $Id: linj-format.lisp,v 1.1.1.1 2006/04/23 17:11:48 tdias Exp $
;;;
;;; Description: Definition of Jnil's pretty printing code generators for Linj-specific code.
;;;
;;; -- start of linj-format.linj --

(in-package :jnil.format)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defcode linj-package (name)
  :format ("(package ~a)" name))

(defcode linj-import (name)
  :format ("(import ~a)" name))

(defcode linj-source (package imports types)
  :format ("~@[~w~&~%~]~@[~{~&~w~}~&~%~]~{~w~&~^~%~}" package imports types))

(defcode linj-defclass (interfacep abstractp name supers slots body-decls)
  :format ((concatenate 'string
             "~:<~:[defclass~;defmixin~] ~a (~{~a~^ ~})~1I~:@_(~2I~{~w~^~:@_~})"
             "~1I~:[~;~:@_(:category :abstract)~]~:@_~@[~:<:body ~{~:@_~w~^~&~}~:>~]~:>")
           (list interfacep name supers slots abstractp (list body-decls))))

(defcode linj-in (body)
  :format ("(in~{ ~w~})" body)
  :constructor nil)

(defun make-linj-in (&rest args)
  (make-instance 'linj-in :body args))

(defcode linj-defnew (varlist ?documentation body)
  :format ("~:<defnew (~{~a~^ ~})~1I~:@_~@[~w~:@_~]~@[~w~]~:>"
           (list varlist documentation body)))

(defcode linj-new (type args)
  :format ("~:<new ~:[~;'~]~a~{ ~w~}~:>"
           (list (typep type 'lisp-name) type args)))

(defcode linj-send (receiver method-name args)
  :format ("(send ~w ~w~{ ~w~})" receiver method-name args))

(defcode linj-class (?name decls)
  :format ("~:<class ~a~6I~:@_~{~w~^~:@_~}~:>" (list name decls)))

(defcode linj-main (parameters body)
  :format ("~:<defmethod main (~{~a~^ ~})~1I~@:_:allocation :class :returns void~@[~:@_~w~]~:>"
           (list parameters body)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export
   '(linj-package make-linj-package linj-package-name linj-import make-linj-import linj-import-name
     linj-source make-linj-source linj-source-package linj-source-imports linj-source-types
     linj-defclass make-linj-defclass linj-defclass-interfacep linj-defclass-abstractp
     linj-defclass-name linj-defclass-supers linj-defclass-slots linj-defclass-body-decls
     linj-in make-linj-in linj-in-body linj-defnew make-linj-defnew linj-defnew-varlist
     linj-defnew-documentation linj-defnew-body linj-new make-linj-new linj-new-type linj-new-args
     linj-send make-linj-send linj-send-receiver linj-send-method-name
     linj-send-args linj-class make-linj-class linj-class-name linj-class-decls
     linj-main make-linj-main linj-main-parameters linj-main-body)
   'jnil.format))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of linj-format.linj --
