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
