;;; macros.lisp

(in-package "COMMON-LISP")

(export '(push prog1 pop loop the declare declaim locally time))

(defmacro push (x place)
  `(setf ,place (cons ,x ,place)))

(defmacro prog1 (result &rest body)
  (let ((n-result (gensym)))
    `(let ((,n-result ,result))
       ,@body
       ,n-result)))

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

(defmacro locally (&rest forms) ; FIXME
  `(progn ,@forms))

(defmacro time (form)
  `(%time #'(lambda () ,form)))
