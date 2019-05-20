;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:     mysql-objects.lisp
;;;; Purpose:  CLSQL Object layer for MySQL
;;;; Created:  May 2004
;;;;
;;;; $Id$
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; *************************************************************************

(in-package #:clsql-mysql)

(defmethod database-get-type-specifier ((type (eql 'wall-time)) args database
                                        (db-type (eql :mysql)))
  (declare (ignore args database))
  "DATETIME")

(defmethod database-get-type-specifier ((type (eql 'smallint)) args database
                                        (db-type (eql :mysql)))
  (declare (ignore args database))
  "SMALLINT")

(defmethod database-get-type-specifier ((type (eql 'mediumint)) args database
                                        (db-type (eql :mysql)))
  (declare (ignore args database))
  "MEDIUMINT")

(defmethod database-get-type-specifier ((type (eql 'tinyint)) args database
                                        (db-type (eql :mysql)))
  (declare (ignore args database))
  "TINYINT")

(defmethod database-output-sql-as-type ((type (eql 'boolean)) val database
                                        (db-type (eql :mysql)))
  (declare (ignore database))
  (if val 1 0))

(defmethod database-output-sql-as-type ((type (eql 'generalized-boolean)) val database
                                        (db-type (eql :mysql)))
  (declare (ignore database))
  (if val 1 0))

(defmethod read-sql-value (val (type (eql 'boolean)) database
                           (db-type (eql :mysql)))
  (declare (ignore database))
  (etypecase val
    (string (if (string= "0" val) nil t))
    (integer (if (zerop val) nil t))))

(defmethod read-sql-value (val (type (eql 'generalized-boolean)) database
                           (db-type (eql :mysql)))
  (declare (ignore database))
  (etypecase val
    (string (if (string= "0" val) nil t))
    (integer (if (zerop val) nil t))))
