;;; macros.lisp

(in-package "COMMON-LISP")

(export '(prog1 prog2 push pop loop the declare declaim locally time))

(defmacro prog1 (first-form &rest forms)
  (let ((result (gensym)))
    `(let ((,result ,first-form))
       ,@forms
       ,result)))

(defmacro prog2 (first-form second-form &rest forms)
  `(prog1 (progn ,first-form ,second-form) ,@forms))

(defmacro push (item place)
  `(setf ,place (cons ,item ,place)))

(defmacro pop (place)
  `(prog1 (car ,place) (setf ,place (cdr ,place))))

(defmacro loop (&rest exps)
  (if (and exps (symbolp (car exps)))
      (error "loop keywords are not supported"))
  (let ((tag (gensym)))
    `(block nil (tagbody ,tag ,@exps (go ,tag)))))

(defmacro the (type form) form)

(defmacro declare (&rest ignored) nil) ; FIXME
(defmacro declaim (&rest ignored) nil) ; FIXME

(defmacro locally (&rest forms) ; FIXME Should be a special operator.
  `(progn ,@forms))

(defmacro time (form)
  `(%time #'(lambda () ,form)))
