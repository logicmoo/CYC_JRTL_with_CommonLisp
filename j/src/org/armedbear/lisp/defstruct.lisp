;;; defstruct.lisp

(in-package "COMMON-LISP")

(export 'defstruct)

(defun make-constructor (name slots)
  (let ((constructor (intern (concatenate 'string "MAKE-" (symbol-name name))))
        (keys (cons '&key slots)))
    (eval `(defun ,constructor ,keys
             (vector ',name ,@slots)))))

(defun make-access-function (name slot index)
  (let ((accessor
         (intern (concatenate 'string (symbol-name name) "-" (symbol-name slot))))
        (setf-expander (gensym)))
    (eval `(progn
             (defun ,accessor (instance)
               (svref instance ,index))
             (defun ,setf-expander (instance new-value)
               (setf (svref instance ,index) new-value))
             (defsetf ,accessor ,setf-expander)))))

(defun make-access-functions (name slots)
  (let ((index 1))
    (dolist (slot slots)
      (make-access-function name slot index)
      (incf index))))

(defmacro defstruct (name &rest slots)
  `(progn
     (make-constructor ',name ',slots)
     (make-access-functions ',name ',slots)
     ',name))
