;;; boot.lisp

(dolist (name '("documentation"
                "backquote"
                "setf"
                "macros"
                "list"
                "symbol"))
  (cl::%load (concatenate 'string name ".lisp")))
