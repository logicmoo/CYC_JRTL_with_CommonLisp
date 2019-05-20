;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          postgresql-package.cl
;;;; Purpose:       Package definition for low-level PostgreSQL interface
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

(defpackage #:pgsql
    #-(and :lispworks (not :lispworks4))
    (:nicknames #:postgresql)
    (:use #:cl #:clsql-uffi)
    (:export
     #:pgsql-oid
     #:pgsql-conn-status-type
     #:pgsql-conn-status-type#connection-ok
     #:pgsql-conn-status-type#connection-bad
     #:pgsql-exec-status-type
     #:pgsql-exec-status-type#empty-query
     #:pgsql-exec-status-type#command-ok
     #:pgsql-exec-status-type#tuples-ok
     #:pgsql-exec-status-type#copy-out
     #:pgsql-exec-status-type#copy-in
     #:pgsql-exec-status-type#bad-response
     #:pgsql-exec-status-type#nonfatal-error
     #:pgsql-exec-status-type#fatal-error
     #:pgsql-conn
     #:pgsql-result

     #:pgsql-ftype#bytea
     #:pgsql-ftype#int2
     #:pgsql-ftype#int4
     #:pgsql-ftype#int8
     #:pgsql-ftype#float4
     #:pgsql-ftype#float8

     ;; Used by PQresultErrorField to get the sql error code
     #:+PG-DIAG-SQLSTATE+


     ;; Functions
     #:PQsetdbLogin
     #:PQlogin
     #:PQfinish
     #:PQstatus
     #:PQerrorMessage
     #:PQexec
     #:PQresultStatus
     #:PQresultErrorField ; used to grab the SQLSTATE code from an error
     #:PQresultErrorMessage
     #:PQntuples
     #:PQnfields
     #:PQfname
     #:PQfnumber
     #:PQftype
     #:PQfsize
     #:PQcmdStatus
     #:PQoidStatus
     #:PQcmdTuples
     #:PQgetvalue
     #:PQgetlength
     #:PQgetisnull
     #:PQclear
     #:PQisBusy

     ;;Large Objects (Marc B)
     #:lo-create
     #:lo-open
     #:lo-write
     #:lo-read
     #:lo-lseek
     #:lo-close
     #:lo-unlink
     )
    (:documentation "This is the low-level interface to PostgreSQL."))


