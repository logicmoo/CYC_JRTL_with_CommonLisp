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
;;; $Id: type-binding.lisp,v 1.2 2006/05/30 21:37:29 tdias Exp $
;;;
;;; Description: Definition of the mapping for the TypeBinding class,
;;; defined in Eclipse's JDT.
;;;
;;; -- start of type-binding.lisp --

(in-package :jnil.ast)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-class (type-binding "org.eclipse.jdt.core.dom.TypeBinding") (binding)
  () () ())

;;; Java methods
(def-java-method (binding-declaring-class "getDeclaringClass") (type-binding))

(def-java-method (binding-name "getName") (type-binding))

(def-java-method (binding-qualified-name "getQualifiedName") (type-binding))

(def-java-method (binding-array-p "isArray") (type-binding))

(def-java-method (binding-superclass "getSuperclass") (type-binding))

(defmethod binding-interfaces ((bind type-binding))
  (jvector2cons (jcall "getInterfaces" bind)))

(defmethod binding-methods ((bind type-binding))
  (jvector2cons (jcall "getDeclaredMethods" bind)))

(defmethod from-source-p ((binding type-binding))
  (jcall "isFromSource" binding))

(defmethod binding-type-binding ((bind type-binding) &key &allow-other-keys)
  (declare (ignore args))
  bind)

;;; Lisp extensions
(defmethod class-supers (dummy)
  (declare (ignore dummy))
  nil)

(defmethod make-signature ((type type-binding))
  "Returns the signature of TYPE.
All instances of TYPE have unique signatures in the context of a Java Project."
  (binding-qualified-name type))

(defmethod class-supers ((binding type-binding))
  (let ((class-supers (list)))
    (dolist (class (cons (binding-superclass binding) (binding-interfaces binding)) class-supers)
      (when class
        (setf class-supers
          (nconc class-supers (cons (binding-qualified-name class) (class-supers class))))))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(class-supers) 'jnil.ast))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of type-binding.lisp --
