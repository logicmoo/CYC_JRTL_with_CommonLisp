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
;;; $Id: method-binding.lisp,v 1.2 2006/05/30 21:30:05 tdias Exp $
;;;
;;; Description: Definition of the mapping for the MethodBinding class,
;;; defined in Eclipse's JDT.
;;;
;;; -- start of method-binding.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (method-binding "org.eclipse.jdt.core.dom.MethodBinding") (binding)
  () () ())

(def-java-method (binding-declaring-class "getDeclaringClass") (method-binding))

(def-java-method (binding-default-constructor-p "isDefaultConstructor") (method-binding))

(def-java-method (binding-constructor-p "isConstructor") (method-binding))

(defmethod method-parameter-types ((binding method-binding))
  (jvector2cons (jcall "getParameterTypes" binding)))

(defmethod method-overloaded-p ((binding method-binding))
  (let ((name (binding-name binding)))
    (longer (collect-if #'(lambda (method-binding) (string= (binding-name method-binding) name))
                        (binding-methods (binding-declaring-class binding)))
            1)))

(defun method-binding-p (obj)
  (typep obj 'method-binding))

(defmethod from-source-p ((binding method-binding))
  (from-source-p (binding-declaring-class binding)))

(defmethod make-signature ((binding method-binding))
  (format nil "~a(~{~a~^, ~})"
          (binding-name binding)
          (mapcar #'binding-name (method-parameter-types binding))))

(defmethod find-binding-declaration ((binding method-binding))
  "Returns the declaration NODE that the method BINDING refers to.
It is capable of opening and parsing files in order to return the actual original AST Node.
This framework is still under development. It currently doesn't support finding in inner
  classes."
  (let ((declaring-class (binding-declaring-class binding)))
    (find-declaration
     binding
     (find-declaration
      declaring-class
      (parse-java-unit (binding-project-name-string binding)
                       (binding-qualified-name declaring-class))))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil.ast))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of method-binding.lisp --
