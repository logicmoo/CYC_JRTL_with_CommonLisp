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
;;; $Id: foreigns.lisp,v 1.1.1.1 2006/04/23 17:11:48 tdias Exp $
;;;
;;; Description: Sendable method interface definition.
;;;
;;; -- start of foreigns.lisp --

(in-package :jnil.lib)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defpackage :jnil.foreigns
  (:use))

(defun send (object-or-class method-name &rest args)
  (apply (find-symbol (string method-name) 'jnil.foreigns) object-or-class args))

(flet ((parse-sendable-args (obj args)
         (values (typecase (first args)
                   (keyword (ecase (pop args)
                              (:static `(eql ,(intern (string obj) 'keyword)))
                              (:method obj)))
                   (t obj))
                 (first args)
                 (rest args))))
  (defmacro defsend (obj name &rest args)
    (multiple-value-bind (obj-spec args body) (parse-sendable-args obj args)
      (let ((sym (gensym)))
        `(defmethod ,(intern name :jnil.foreigns)
             ((this ,obj-spec) &rest ,sym)
           (block ,name
             (destructuring-bind ,args ,sym
               ,@body)))))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(send defsend) 'jnil.lib))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of foreigns.lisp --
