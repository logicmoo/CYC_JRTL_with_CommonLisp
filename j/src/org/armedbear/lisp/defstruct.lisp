;;; defstruct.lisp

(in-package "COMMON-LISP")

(export 'defstruct)

(defun make-access-function (name slot index)
  (let ((accessor
         (intern (concatenate 'string (symbol-name name) "-" (symbol-name slot)))))
    (setf (symbol-function accessor)
          #'(lambda (instance) (svref instance `,index)))
    (%put accessor *setf-expander*
          #'(lambda (instance new-value) (%svset instance `,index new-value)))))

(defmacro defstruct (name &rest slots)
  (let* ((dd (append (list name) slots))
         (n-slots (length slots))
         (constructor (intern (concatenate 'string "MAKE-" (symbol-name name))))
         (index 1))
    (eval `(defun ,constructor ()
       (let ((structure (make-array (1+ ,n-slots))))
         (setf (svref structure 0) ',name)
         structure)))
    (dolist (slot slots)
      (make-access-function name slot index)
      (incf index)))
  `',name)
