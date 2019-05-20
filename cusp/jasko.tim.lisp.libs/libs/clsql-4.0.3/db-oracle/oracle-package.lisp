;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          oracle-package.cl
;;;; Purpose:       Package definition for CLSQL Oracle interface
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

(defpackage #:clsql-oracle
  (:use #:common-lisp #:clsql-sys #:clsql-uffi)
  (:export #:oracle-database
           #:*oracle-server-version*
           #:*oracle-so-load-path*
           #:*oracle-so-libraries*)
  (:documentation "This is the CLSQL interface to Oracle."))
