;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; ======================================================================
;;;; File:     package.lisp
;;;; Authors:  Marcus Pearce <m.t.pearce@city.ac.uk> and Kevin Rosenberg
;;;; Created:  30/03/2004
;;;; Updated:  $Id$
;;;;
;;;; Package definition for CLSQL test suite.
;;;;
;;;; This file is part of CLSQL.
;;;;
;;;; CLSQL users are granted the rights to distribute and use this software
;;;; as governed by the terms of the Lisp Lesser GNU Public License
;;;; (http://opensource.franz.com/preamble.html), also known as the LLGPL.
;;;; ======================================================================

(in-package #:cl-user)

(defpackage #:clsql-tests
  (:use #:clsql #:common-lisp #:rtest)
  (:export
   #:run-tests
   #:run-tests-append-report-file
   #:run-benchmarks
   #:run-benchmarks-append-report-file
   #:summarize-test-report
   #:test-initialise-database
   #:test-connect-to-database
   )
  (:documentation "Regression tests for CLSQL."))

