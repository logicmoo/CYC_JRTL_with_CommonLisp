;;; -*- lisp -*-

;; ASDF system definition for loading the Cusp server independently
;; of Emacs.
;;
;; This is only useful if you want to start a Cusp server in a Lisp
;; processes that doesn't run under Emacs. Lisp processes created by
;; `M-x slime' automatically start the server.

;; Usage:
;;
;;   (require :cusp)
;;   (cusp:create-cusp-server PORT) => ACTUAL-PORT
;;
;; (PORT can be zero to mean "any available port".)
;; Then the Cusp server is running on localhost:ACTUAL-PORT. You can
;; use `M-x slime-connect' to connect Emacs to it.
;;
;; This code has been placed in the Public Domain.  All warranties
;; are disclaimed.

(defpackage :cusp-loader
  (:use :cl))

(in-package :cusp-loader)

(defclass cusp-loader-file (asdf:cl-source-file) ())

;;;; after loading run init

(defmethod asdf:perform ((o asdf:load-op) (f cusp-loader-file))
  (load (asdf::component-pathname f))
  (funcall (read-from-string "cusp-loader::init")
           :reload (asdf::operation-forced o)
           :delete (asdf::operation-forced o)))

(asdf:defsystem :cusp
  :default-component-class cusp-loader-file
  :components ((:file "cusp-loader")))
