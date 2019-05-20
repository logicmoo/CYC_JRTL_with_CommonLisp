;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          db2-package.cl
;;;; Purpose:       Package definition for CLSQL Db2 interface
;;;;
;;;; $Id$
;;;;
;;;; This file is part of CLSQL.
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(in-package #:cl-user)

(defpackage #:clsql-db2
  (:use #:common-lisp #:clsql-sys #:clsql-uffi)
  (:export #:db2-database
           #:*db2-server-version*
           #:*db2-so-load-path*
           #:*db2-so-libraries*)
  (:documentation "This is the CLSQL interface to Db2."))
