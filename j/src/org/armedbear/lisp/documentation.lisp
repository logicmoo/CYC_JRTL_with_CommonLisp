;;; documentation.lisp

(in-package "COMMON-LISP")

(export '(documentation))

(defvar *documentation* (make-hash-table))

(defun documentation (symbol type)
  (cdr (assoc type (gethash symbol *documentation*))))

(defun %set-documentation (symbol type string)
  (let* ((alist (gethash symbol *documentation*))
	 (pair (assoc type alist)))
    (if pair
        (setf (cdr pair) string)
        (progn
          (puthash symbol *documentation* (cons (cons type string) alist))
          string))))

(provide "documentation")
