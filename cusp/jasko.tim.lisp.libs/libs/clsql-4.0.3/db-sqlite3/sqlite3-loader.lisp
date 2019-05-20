;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          sqlite3-loader.lisp
;;;; Purpose:       Sqlite3 library loader using UFFI
;;;; Programmer:    Aurelio Bignoli
;;;; Date Started:  Oct 2004
;;;;
;;;; $Id$
;;;;
;;;; This file, part of CLSQL, is Copyright (c) 2004 by Aurelio Bignoli
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(in-package #:clsql-sqlite3)

(defvar *sqlite3-supporting-libraries* '("c")
  "Used only by CMU. List of library flags needed to be passed to ld
to load the Sqlite3 library succesfully.  If this differs at your site,
set to the right path before compiling or loading the system.")

(defvar *sqlite3-library-loaded* nil
  "T if foreign library was able to be loaded successfully")

(defmethod database-type-library-loaded ((database-type (eql :sqlite3)))
  "T if foreign library was able to be loaded successfully. "
  *sqlite3-library-loaded*)

(defmethod database-type-load-foreign ((database-type (eql :sqlite3)))
  (clsql-uffi:find-and-load-foreign-library '("libsqlite3" "sqlite3")
                                            :module "sqlite3"
                                            :supporting-libraries *sqlite3-supporting-libraries*)
  (setq *sqlite3-library-loaded* t))

(clsql-sys:database-type-load-foreign :sqlite3)
