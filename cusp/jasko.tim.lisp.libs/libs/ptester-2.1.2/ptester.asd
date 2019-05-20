;;;; -*- Mode: LISP; Syntax: ANSI-Common-Lisp; Base: 10 -*-
;;;; *************************************************************************
;;;; FILE IDENTIFICATION
;;;;
;;;; Name:          ptester.asd
;;;; Purpose:       ASDF definition file for ptester
;;;; Programmer:    Kevin M. Rosenberg
;;;; Date Started:  Sep 2002
;;;;
;;;; $Id: ptester.asd 7061 2003-09-07 06:34:45Z kevin $
;;;;
;;;; *************************************************************************

(defpackage #:ptester-system (:use #:asdf #:cl))
(in-package #:ptester-system)


(defsystem ptester
  :name "ptester"
  :author "Kevin Layer, Franz, Inc / Kevin Rosenberg"
  :maintainer "Kevin M. Rosenberg <kmr@debian.org>"
  :licence "LLGPL"
  :description "Portable test harness package"
  :long-description "ptester is a portable testing framework based on Franz's tester module"
  
  :components
  ((:file "src")))

