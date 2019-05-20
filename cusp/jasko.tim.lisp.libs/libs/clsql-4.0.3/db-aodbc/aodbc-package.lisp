;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          aodbc-package.cl
;;;; Purpose:       Package definition for CLSQL AODBC backend
;;;; Programmer:    Kevin M. Rosenberg
;;;; Date Started:  Feb 2002
;;;;
;;;; $Id$
;;;;
;;;; This file, part of CLSQL, is Copyright (c) 2002 by Kevin M. Rosenberg
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(in-package #:cl-user)

#+allegro
(eval-when (:compile-toplevel :load-toplevel :execute)
  (require :aodbc-v2))
#-allegro (warn "This system requires Allegro's AODBC library to operate")

(defpackage #:clsql-aodbc
    (:nicknames #:aodbc)
    (:use #:common-lisp #:clsql-sys)
    (:export #:aodbc-database)
    (:documentation "This is the CLSQL interface to Allegro's AODBC"))
