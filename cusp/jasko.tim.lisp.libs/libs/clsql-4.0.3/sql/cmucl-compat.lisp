;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          cmucl-compat.lisp
;;;; Purpose:       Compatiblity library for CMUCL functions
;;;; Programmer:    Kevin M. Rosenberg
;;;; Date Started:  Feb 2002
;;;;
;;;; $Id$
;;;;
;;;; This file, part of CLSQL, is Copyright (c) 2002-2006 by Kevin M. Rosenberg
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(in-package #:cl-user)

(defpackage #:cmucl-compat
  (:use #:common-lisp)
  (:export
   #:shrink-vector
   #:make-sequence-of-type
   #:result-type-or-lose
   #:required-argument
   ))
(in-package #:cmucl-compat)

#+(or cmu scl)
(defmacro required-argument ()
  `(ext:required-argument))

#-(or cmu scl)
(defun required-argument ()
  (error "~&A required keyword argument was not supplied"))

#+(or cmu scl)
(defmacro shrink-vector (vec len)
  `(lisp::shrink-vector ,vec ,len))

#+sbcl
(defmacro shrink-vector (vec len)
  `(sb-kernel::shrink-vector ,vec ,len))

#-(or cmu sbcl scl)
(defmacro shrink-vector (vec len)
  "Shrinks a vector. Optimized if vector has a fill pointer.
Needs to be a macro to overwrite value of VEC."
  (let ((new-vec (gensym)))
    `(cond
      ((adjustable-array-p ,vec)
       (adjust-array ,vec ,len))
      ((typep ,vec 'simple-array)
       (let ((,new-vec (make-array ,len :element-type
                                   (array-element-type ,vec))))
         (check-type ,len fixnum)
         (locally (declare (optimize (speed 3) (safety 0) (space 0)) )
           (dotimes (i ,len)
             (declare (fixnum i))
             (setf (aref ,new-vec i) (aref ,vec i))))
         (setq ,vec ,new-vec)))
      ((typep ,vec 'vector)
        (setf (fill-pointer ,vec) ,len)
        ,vec)
      (t
       (error "Unable to shrink vector ~S which is type-of ~S" ,vec (type-of ,vec)))
       )))


#-(or cmu scl)
(defun make-sequence-of-type (type length)
  "Returns a sequence of the given TYPE and LENGTH."
  (make-sequence type length))

#+(or cmu scl)
(if (fboundp 'lisp::make-sequence-of-type)
    (defun make-sequence-of-type (type len)
      (lisp::make-sequence-of-type type len))
  (defun make-sequence-of-type (type len)
    (common-lisp::make-sequence-of-type type len)))

#-(or cmu scl)
(defun result-type-or-lose (type nil-ok)
  (unless (or type nil-ok)
    (error "NIL output type invalid for this sequence function"))
  (case type
    ((list cons)
     'list)
    ((string simple-string base-string simple-base-string)
     'string)
    (simple-vector
     'simple-vector)
    (vector
     'vector)
    (t
     (error "~S is a bad type specifier for sequence functions." type))
    ))

#+(or cmu scl)
(defun result-type-or-lose (type nil-ok)
  (lisp::result-type-or-lose type nil-ok))
