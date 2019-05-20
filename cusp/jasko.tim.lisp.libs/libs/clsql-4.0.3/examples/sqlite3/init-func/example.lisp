;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:     example.lisp
;;;; Purpose:  Sample code for SQLite 3 initialization functions
;;;; Authors:  Aurelio Bignoli
;;;; Created:  Oct 2004
;;;;
;;;; $Id$
;;;;
;;;; This file, part of CLSQL, is Copyright (c) 2004 by Aurelio Bignoli
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

;;;; Load CLSQL.
(asdf:oos 'asdf:load-op :clsql-sqlite3)

;;;; Load sqlite3-utils.so library. See Makefile for library creation.
(unless (uffi:load-foreign-library "/usr/lib/clsql/sqlite3-utils.so"
                                   :module "sqlite3-utils"
                                   :supporting-libraries '("c"))
  (error "Unable to load foreign library"))

;;;; Define the foreign function to be used as init function.
(uffi:def-function
    ("create_iso_8859_15_ci_collation" create-coll)
    ((db sqlite3:sqlite3-db))
  :returning :int
  :module "sqlite3-utils")

;;;; Create the DB using create-coll as init function.
(defparameter db-name "init-func-test.db")
(clsql:destroy-database (list db-name) :database-type :sqlite3)
(clsql:connect (list db-name #'create-coll) :database-type :sqlite3)

;;;; Create a table. Field f2 uses the newly defined collating
;;;; sequence.
(clsql:execute-command
 "CREATE TABLE t1 (f1 CHAR(1), f2 CHAR(1) COLLATE ISO_8859_15_CI)")

;;;; Populate the table.
(clsql:execute-command "INSERT INTO t1 VALUES ('à', 'à')")
(clsql:execute-command "INSERT INTO t1 VALUES ('a', 'a')")
(clsql:execute-command "INSERT INTO t1 VALUES ('A', 'A')")
(clsql:execute-command "INSERT INTO t1 VALUES ('é', 'é')")
(clsql:execute-command "INSERT INTO t1 VALUES ('e', 'e')")
(clsql:execute-command "INSERT INTO t1 VALUES ('E', 'E')")
(clsql:execute-command "INSERT INTO t1 VALUES ('ì', 'ì')")
(clsql:execute-command "INSERT INTO t1 VALUES ('i', 'i')")
(clsql:execute-command "INSERT INTO t1 VALUES ('I', 'I')")
(clsql:execute-command "INSERT INTO t1 VALUES ('ò', 'ò')")
(clsql:execute-command "INSERT INTO t1 VALUES ('o', 'o')")
(clsql:execute-command "INSERT INTO t1 VALUES ('O', 'O')")
(clsql:execute-command "INSERT INTO t1 VALUES ('ù', 'ù')")
(clsql:execute-command "INSERT INTO t1 VALUES ('u', 'u')")
(clsql:execute-command "INSERT INTO t1 VALUES ('U', 'U')")

;;;; Perform some SELECTs.
(format t "~&SELECT * FROM t1 ==> ~A~%"(clsql:query "SELECT * FROM t1"))
(format t "~&SELECT * FROM t1 ORDER BY f1 ==> ~A~%"
        (clsql:query "SELECT * FROM t1 ORDER BY f1"))
(format t "~&SELECT * FROM t1 ORDER BY f2 ==> ~A~%"
        (clsql:query "SELECT * FROM t1 ORDER BY f2"))

;;;; Disconnect from database.
(clsql:disconnect)