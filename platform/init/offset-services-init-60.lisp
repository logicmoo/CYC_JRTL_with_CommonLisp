;;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-

(in-package "CYC")

(cvs-id "$Id: offset-services-init-60.lisp 146227 2013-06-26 21:56:23Z tbrussea $")

(csetq *gc-reports* nil)

(load-from-cyc-home "init/cyc-init.lisp")

;; determine the amount to offset services
(progn
  (csetq *base-tcp-port* 3660)
  (format t "Will offset TCP services to port ~A~%" *base-tcp-port*))

(load-from-cyc-home "init/port-init.lisp")

