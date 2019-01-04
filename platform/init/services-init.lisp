;;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-

(in-package "CYC")

(cvs-id "$Id: services-init.lisp 146227 2013-06-26 21:56:23Z tbrussea $")

(csetq *gc-reports* nil)

(load-from-cyc-home "init/cyc-init.lisp")

(print '(load-from-cyc-home "init/port-init.lisp"))
