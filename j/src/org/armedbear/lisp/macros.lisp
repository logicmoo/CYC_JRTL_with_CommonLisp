;;; macros.lisp

(in-package "COMMON-LISP")

(export '(push prog1 pop the declare))

(defmacro push (x place)
  `(setf ,place (cons ,x ,place)))

(defmacro prog1 (result &rest body)
  (let ((n-result (gensym)))
    `(let ((,n-result ,result))
       ,@body
       ,n-result)))

(defmacro pop (place)
  `(prog1 (car ,place) (setf ,place (cdr ,place))))

(defmacro the (type form) form)

(defmacro declare (expr) nil)

(provide "macros")
