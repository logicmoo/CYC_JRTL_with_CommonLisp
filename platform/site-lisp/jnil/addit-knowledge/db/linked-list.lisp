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
;;; $Id: linked-list.lisp,v 1.2 2006/05/30 21:04:58 tdias Exp $
;;;
;;; Description: Special case code generators for library Java functions.
;;;
;;; -- start of linked-list.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(def-java-mapping ("java.util.LinkedList" "addFirst") (args)
  (make-lisp-unreadable
   (make-lisp-sexp (make-lisp-name "push") (list (second args) (first args)))))

(def-java-mapping ("java.util.LinkedList" "remove") (args)
  (make-lisp-unreadable
   (make-lisp-sexp (make-lisp-name "delete") (list (second args) (first args)))))

(def-java-lisp-equivalent "java.util.LinkedList.getFirst" "first")

(def-java-lisp-equivalent "java.util.LinkedList.clone" "copy-list")

(def-java-lisp-equivalent "java.util.LinkedList.size" "length")

(def-java-mapping ("java.util.LinkedList" "isEmpty") (args)
  (make-lisp-sexp (make-lisp-name "null") args))

(def-java-mapping ("java.util.LinkedList" "add") (args)
  (make-lisp-sexp (make-lisp-name "setf")
                  (list (first args)
                        (make-lisp-sexp (make-lisp-name "nconc")
                                        (list (first args)
                                              (make-lisp-sexp (make-lisp-name "list")
                                                              (second args)))))))

(def-java-mapping ("java.util.LinkedList" "removeFirst") (args)
  (make-lisp-sexp (make-lisp-name "pop") args))

(def-java-mapping ("java.util.LinkedList" "clear") (args)
  (make-lisp-sexp (make-lisp-name "setf") (list (first args) (make-lisp-name "nil"))))

(def-java-mapping ("java.util.LinkedList" "addAll(Collection)") (args)
  (make-lisp-sexp (make-lisp-name "setf")
                  (list (first args)
                        (make-lisp-sexp (make-lisp-name "append")
                                        args))))

(def-java-mapping ("java.util.LinkedList" "addAll(int Collection)") (args)
  (if (zerop (second args))
      (make-lisp-sexp (make-lisp-name "setf")
                      (list (first args)
                            (make-lisp-sexp (make-lisp-name "append")
                                            (list (third args)
                                                  (first args)))))
    (make-lisp-unreadable (make-lisp-sexp (make-lisp-name "add-all") args))))

(def-java-mapping ("java.util.LinkedList" "contains") (args)
  (make-lisp-sexp (make-lisp-name "member") (nreverse args)))

(def-java-mapping "java.util.LinkedList" (args)
  (let ((list-creation-code (make-lisp-sexp (make-lisp-name "list") '())))
    (when args
      (setf (lisp-sexp-rest list-creation-code) args)
      (setf list-creation-code (make-lisp-unreadable list-creation-code)))
    list-creation-code))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of linked-list.lisp --
