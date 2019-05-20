;;; packages.lisp
(in-package :cl-user)
(defpackage :ghost-trinity
  (:use :cl 
		:html-template 
		:hunchentoot
		:clsql :clsql-mysql)
  (:export :start-app
		   :stop-app))
;;; End of File