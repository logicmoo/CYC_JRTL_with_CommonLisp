;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          clsql-db2.asd
;;;; Purpose:       ASDF definition file for CLSQL Db2 backend
;;;; Programmer:    Kevin M. Rosenberg
;;;; Date Started:  Aug 2002
;;;;
;;;; $Id$
;;;;
;;;; This file is part of CLSQL.
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(defpackage #:clsql-db2-system (:use #:asdf #:cl))
(in-package #:clsql-db2-system)

;;; System definition

(defsystem clsql-db2
  :name "clsql-db2"
  :author "Kevin M. Rosenberg <kmr@debian.org>"
  :maintainer "Kevin M. Rosenberg <kmr@debian.org>"
  :licence "Lessor Lisp General Public License"
  :description "Common Lisp SQL Db2 Driver"
  :long-description "cl-sql-db2 package provides a database driver to the Db2 database system."

  :depends-on (clsql-uffi)
  :components
    ((:module :db-db2
	      :components
	      ((:file "db2-package")
	       (:file "db2-loader" :depends-on ("db2-package"))
	       (:file "foreign-resources" :depends-on ("db2-package"))
	       (:file "db2-constants" :depends-on ("db2-package"))
	       (:file "db2-api" :depends-on ("db2-constants" "db2-loader"))
	       (:file "db2-sql" :depends-on ("db2-api" "foreign-resources"))
	       (:file "db2-objects" :depends-on ("db2-sql"))))))
