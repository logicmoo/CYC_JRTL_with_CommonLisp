;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; $Id$
;;;;
;;;; This file is part of CLSQL.
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(in-package #:clsql-oracle)

(defparameter *foreign-resource-hash* (make-hash-table :test #'equal))

(defstruct (foreign-resource)
  (type (error "Missing TYPE.")
        :read-only t)
  (sizeof (error "Missing SIZEOF.")
          :read-only t)
  (buffer (error "Missing BUFFER.")
          :read-only t)
  (in-use nil :type boolean))


(defun %get-resource (type sizeof)
  (let ((resources (gethash type *foreign-resource-hash*)))
    (car (member-if
          #'(lambda (res)
              (and (= (foreign-resource-sizeof res) sizeof)
                   (not (foreign-resource-in-use res))))
          resources))))

(defun %insert-foreign-resource (type res)
  (let ((resource (gethash type *foreign-resource-hash*)))
    (setf (gethash type *foreign-resource-hash*)
          (cons res resource))))

(defmacro acquire-foreign-resource (type &optional size)
  `(let ((res (%get-resource ,type ,size)))
     (unless res
       (setf res (make-foreign-resource
                  :type ,type :sizeof ,size
                  :buffer (uffi:allocate-foreign-object ,type ,size)))
       (%insert-foreign-resource ',type res))
     (claim-foreign-resource res)))

(defun free-foreign-resource (ares)
  (setf (foreign-resource-in-use ares) nil)
  ares)

(defun claim-foreign-resource (ares)
  (setf (foreign-resource-in-use ares) t)
  ares)



