;;; boot.lisp

(dolist (name '("documentation"
                "backquote"
                "setf"
                "macros"
                "list"
                "sequences"
                "symbol"))
  (cl::%load (concatenate 'string name ".lisp")))
