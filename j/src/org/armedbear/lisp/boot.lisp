;;; boot.lisp

(dolist (name '("documentation"
                "backquote"
                "setf"
                "macros"
                "list"
                "sequences"
                "symbol"
                "defstruct"))
  (cl::%load (concatenate 'string name ".lisp")))
