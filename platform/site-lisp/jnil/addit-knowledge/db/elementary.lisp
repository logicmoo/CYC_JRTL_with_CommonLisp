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
;;; $Id: elementary.lisp,v 1.2 2006/05/30 21:03:58 tdias Exp $
;;;
;;; Description: Several special case code generators for library Java functions.
;;;
;;; -- start of elementary.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-mapping ("java.io.PrintStream" "println") (args)
  (make-lisp-sexp (make-lisp-name "format")
                  (append (list (first args)
                                "~a~%")
                          (rest args))))

(def-java-mapping ("java.io.PrintStream" "println()") ()
  (make-lisp-princ (make-lisp-name "#\\newline") nil))

(def-java-mapping ("System.out" "print") (args)
  (let ((arg (first args)))
    (make-format-code (if (string-concatenation-p arg)
                          (infix-operator-args arg)
                        (collect-code args))
                      (make-lisp-name "t"))))

(def-java-mapping ("System.out" "println") (args)
  (let ((arg (first args)))
    (if (string-concatenation-p arg)
        (make-format-code (infix-operator-args arg) (make-lisp-name "t") t)
      (make-lisp-princ (or (node-code arg) (make-lisp-name "#\\newline")) nil))))

(def-java-mapping ("System.err" "print") (args)
  (let ((arg (first args)))
    (make-format-code (if (string-concatenation-p arg)
                          (infix-operator-args arg)
                        (collect-code args))
                      (make-lisp-name "*error-output*"))))

(def-java-mapping ("System.err" "println") (args)
  (let ((arg (first args))
        (out (make-lisp-name "*error-output*")))
    (if (string-concatenation-p arg)
        (make-format-code (infix-operator-args arg) out t)
      (make-lisp-princ (or (node-code arg) (make-lisp-name "#\\newline")) out))))

(def-java-lisp-equivalent "System.exit" "exit")

(def-java-lisp-equivalent "java.lang.Integer.parseInt" "parse-integer")

(def-java-lisp-equivalent "java.lang.Math.abs" "abs")

(def-java-lisp-equivalent "java.lang.Math.round" "round")

(def-java-lisp-equivalent "java.lang.Math.floor" "floor")

(def-java-mapping "String" (args)
  (let* ((arg (first args))
         (code (node-code arg)))
    (cond ((null arg) 
           (make-lisp-name "nil"))
          ((not (singleton-p args))
           (make-lisp-unreadable (make-lisp-sexp "string" (collect-code args))))
          ((string= (type-name arg) "String") 
           code)
          (t (make-lisp-sexp "concatenate 'string" code)))))

(def-java-mapping ("java.lang.String" "charAt") (args)
  (make-lisp-sexp (make-lisp-name "char")
                  args))

(def-java-mapping "java.lang.Integer" (args)
  (first args))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of elementary.lisp --
