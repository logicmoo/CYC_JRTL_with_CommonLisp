;;;; ${time}
;;;;
;;;; Think of this as your project file.
;;;; Keep it up to date, and you can reload your project easily
;;;;  by right-clicking on it and selecting "Load Project"

(defpackage #:${package}-asd
  (:use :cl :asdf))

(in-package :${package}-asd)

(defsystem ${package}
  :name "${package}"
  :version "0.1"
  :serial t
  :components ((:file "defpackage")
               (:file "main" :depends-on ("defpackage"))
               ${with-tests}
               
               ; As you add files to your project,
               ; make sure to add them here as well
               
               )
  :depends-on ())