;;; defstruct.lisp

(in-package "COMMON-LISP")

(export 'defstruct)

(defun make-constructor (name slots)
  (let ((nslots (length slots))
        (constructor (intern (concatenate 'string "MAKE-" (symbol-name name)))))
    (setf (symbol-function constructor)
          #'(lambda ()
             (let ((structure (make-array (1+ nslots))))
               (setf (svref structure 0) name)
               structure)))))

(defun make-access-function (name slot index)
  (let ((accessor
         (intern (concatenate 'string (symbol-name name) "-" (symbol-name slot)))))
    (setf (symbol-function accessor)
          #'(lambda (instance) (svref instance `,index)))
    (%put accessor *setf-expander*
          #'(lambda (instance new-value) (%svset instance `,index new-value)))))

(defun make-access-functions (name slots)
  (let ((index 1))
    (dolist (slot slots)
      (make-access-function name slot index)
      (incf index))))

(defmacro defstruct (name &rest slots)
  (make-constructor name slots)
  (make-access-functions name slots)
  `',name)
