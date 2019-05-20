;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          clsql-aodbc.asd
;;;; Purpose:       ASDF definition file for CLSQL AODBC backend
;;;; Programmer:    Kevin M. Rosenberg
;;;; Date Started:  Aug 2002
;;;;
;;;; $Id$
;;;;
;;;; This file, part of CLSQL, is Copyright (c) 2002 by Kevin M. Rosenberg
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(defpackage #:clsql-aodbc-system (:use #:asdf #:cl))
(in-package #:clsql-aodbc-system)

#+(and allegro (not allegro-cl-trial))
(defsystem clsql-aodbc
  :name "cl-sql-aodbc"
  :author "Kevin M. Rosenberg <kmr@debian.org>"
  :maintainer "Kevin M. Rosenberg <kmr@debian.org>"
  :licence "Lessor Lisp General Public License"
  :description "Common Lisp SQL AODBC Driver"
  :long-description "cl-sql-aodbc package provides a database driver to AllegroCL's AODBC database interface."

  :depends-on (clsql)
  :components
    ((:module :db-aodbc
	      :components
	      ((:file "aodbc-package")
	       (:file "aodbc-sql" :depends-on ("aodbc-package"))))))

#-(and allegro (not allegro-cl-trial))
(defsystem clsql-aodbc)
