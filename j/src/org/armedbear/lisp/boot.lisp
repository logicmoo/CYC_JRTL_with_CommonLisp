;;; boot.lisp

(dolist (name '("documentation"
                "backquote"
                "setf"
                "macros"
                "list"
                "sequences"
                "symbol"
                "error"
                "defstruct"))
  (cl::%load (concatenate 'string name ".lisp")))

(in-package "COMMON-LISP")

(export '(open call-arguments-limit))

(defun open (filename
	     &key
	     (direction :input)
	     (element-type 'base-char)
	     (if-exists nil if-exists-given)
	     (if-does-not-exist nil if-does-not-exist-given)
	     (external-format :default))
  (if (eq direction :output)
      (%open-output-file filename)
      (error "operation not supported")))

(defconstant call-arguments-limit 50)
