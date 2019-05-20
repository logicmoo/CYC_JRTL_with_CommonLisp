;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          db2-constants.lisp
;;;; Purpose:       Constants for CLSQL Db2 interface
;;;;
;;;; $Id$
;;;;
;;;; This file is part of CLSQL.
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(in-package #:clsql-db2)

(defconstant SQL_NULL_HANDLE nil)
(defconstant SQL_HANDLE_ENV 1)
(defconstant SQL_HANDLE_DBC 2)
(defconstant SQL_HANDLE_STMT 3)
(defconstant SQL_NTS -3)

(defconstant SQL_ERROR -1)
(defconstant SQL_SUCCESS 0)
(defconstant SQL_SUCCESS_WITH_INFO 1)

