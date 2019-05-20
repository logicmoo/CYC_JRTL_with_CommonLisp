;;;; ${time}


(in-package :common-lisp-user)

(defpackage :${package}
  (:nicknames :${package})
  (:use :cl ${lisp-unit}
   ;; Packages you want to import go here
   )
  (:export
  
   ;; Exported symbols go here
   ${example-export}
  
   ))

