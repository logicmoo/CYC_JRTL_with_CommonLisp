;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          sqlite-loader.lisp
;;;; Purpose:       SQLite library loader using UFFI
;;;; Programmer:    Aurelio Bignoli
;;;; Date Started:  Nov 2003
;;;;
;;;; $Id$
;;;;
;;;; This file, part of CLSQL, is Copyright (c) 2003 by Aurelio Bignoli
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(in-package #:clsql-sqlite)

(defvar *sqlite-supporting-libraries* '("c")
  "Used only by CMU. List of library flags needed to be passed to ld
to load the SQLite library succesfully.  If this differs at your site,
set to the right path before compiling or loading the system.")

(defvar *sqlite-library-loaded* nil
  "T if foreign library was able to be loaded successfully")

(defmethod database-type-library-loaded ((database-type (eql :sqlite)))
  "T if foreign library was able to be loaded successfully. "
  *sqlite-library-loaded*)

(defmethod database-type-load-foreign ((database-type (eql :sqlite)))
  (clsql-uffi:find-and-load-foreign-library '("libsqlite" "sqlite")
                                            :module "sqlite"
                                            :supporting-libraries *sqlite-supporting-libraries*)
  (setq *sqlite-library-loaded* t))

(clsql-sys:database-type-load-foreign :sqlite)



