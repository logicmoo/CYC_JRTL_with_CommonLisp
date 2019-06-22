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
;;; $Id: addit-knowledge-framework.lisp,v 1.1 2006/05/23 22:07:13 tdias Exp $
;;;
;;; Description: Definition of the the framework that supports special case code
;;; generators for library Java functions. These should be called during the coding
;;; phase by the coders.
;;;
;;; These coders are allowed to return nil, which means "not applicable" and should have
;;; the same effect as if no coder had been initially found.
;;;
;;; -- start of addit-knowledge-framework.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defparameter *java-mapping* (make-hash-table :test #'equalp))
(defparameter *java-exception-name-mapping* (make-hash-table :test #'equalp))

(defun make-unreadable-if (condition code)
  (if condition
      (make-lisp-unreadable code)
    code))

(defun make-addit-knowledge-coder (fn)
  #'(lambda (&rest call-args &key visitor node args) ; mandatory addit-knowledge coder arguments
      (declare (ignore node args))
      (letv (((code readability-conditions) (apply fn call-args)))
        (when code
          (if (every #'(lambda (switch)
                         (switchp visitor switch))
                     (cons :translate-sdk-calls-without-unreadable readability-conditions))
              code
            (make-lisp-unreadable code))))))

(defmacro def-java-mapping (qualified-name keys &body body)
  (destructuring-bind (class &optional method)
      (mklist qualified-name)
    `(setf (gethash ,class *java-mapping*)
       (cons (list ,method (make-addit-knowledge-coder 
                            #'(lambda (&key ,@keys &allow-other-keys)
                                ,@body)))
             (delete ,method (gethash ,class *java-mapping*) :key #'first :test #'string=)))))

(defun find-java-mapping (class &optional method-name-string)
  (or (second (assoc method-name-string (gethash class *java-mapping*) :test #'string=))
      (and method-name-string           ; supports default methods
           (second (assoc (subseq method-name-string 0 (position #\( method-name-string))
                          (gethash class *java-mapping*) :test #'string=)))))

;;;;- Mon May 22 00:32:01 2006 by tiago - by definition, there are no
;;;;addit-knowledge coders for anonymous classes
(defmethod find-addit-knowledge-coder ((node class-instance-creation))  
  (unless (instance-creation-anonymous-decl node)
    (find-java-mapping (name-qualified-type (instance-creation-name node)))))

(defmethod find-addit-knowledge-coder ((node method-invocation))
  (let* ((invocation-expr (invocation-expression node))
         (invocation-qualifier-string (and invocation-expr 
                                           (name-p invocation-expr)
                                           (name-qualified-type invocation-expr))))
    (find-java-mapping (or invocation-qualifier-string (method-declaring-class node))
                       (name-string-with-appended-parameter-types (invocation-name node)
                                                                  :java-syntax-p t))))

(defmethod find-addit-knowledge-coder ((node throw-statement))
  (find-java-mapping (type-qualified-name (throw-expression node))))

(defmacro def-java-lisp-equivalent (fully-qualified-name lisp-method)
  (let* ((separator-position (position #\. fully-qualified-name :from-end t))
         (class (subseq fully-qualified-name 0 separator-position))
         (java-method (subseq fully-qualified-name (1+ separator-position))))
    `(def-java-mapping (,class ,java-method) (args)
       (make-lisp-sexp ,lisp-method args))))

;;(eval-when (:load-toplevel)
;; (print (map-over-directory #'(lambda (file) 
 ;;                         (print file) 
  ;;                        (load (compile-file-if-needed file))) 
   ;;                   (merge-pathnames "db/" #.*compile-file-truename*))))


(eval-when (:load-toplevel)
  (load (compile-file-if-needed  (merge-pathnames "db/elementary.lisp" #.*compile-file-truename*)))
  (load (compile-file-if-needed  (merge-pathnames "db/linked-list.lisp" #.*compile-file-truename*)))) 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of addit-knowledge-framework.lisp --
