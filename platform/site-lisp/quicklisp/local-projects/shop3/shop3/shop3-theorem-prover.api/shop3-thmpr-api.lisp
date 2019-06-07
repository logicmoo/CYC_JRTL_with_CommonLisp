
(in-package :shop3-thmpr-api)

(defparameter *just-one* t)

(defun init-thmpr-api (domain-name)
  (setf shop3::*domain* 
	(make-instance 'shop3::domain
	  :name domain-name
	  :axioms (make-hash-table))))

(defun find-satisfiers (pre state 
			&key (just-one *just-one*))
  (shop3::find-satisfiers pre state just-one
			  :domain shop3::*domain*))

