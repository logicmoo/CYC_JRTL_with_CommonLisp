;;; list.lisp

(in-package "COMMON-LISP")

(export '(nconc nreconc))

(defun nconc (&optional list &rest rest)
  (if rest
      (let ((rest-conc (apply #'nconc rest)))
        (if (consp list)
            (progn (setf (cdr (last list)) rest-conc)
              list)
            rest-conc))
      list))

;; From CMUCL.
(defun nreconc (x y)
  "Returns (nconc (nreverse x) y)"
  (do ((1st (cdr x) (if (atom 1st) 1st (cdr 1st)))
       (2nd x 1st)		;2nd follows first down the list.
       (3rd y 2nd))		;3rd follows 2nd down the list.
    ((atom 2nd) 3rd)
    (rplacd 2nd 3rd)))

(provide "list")
