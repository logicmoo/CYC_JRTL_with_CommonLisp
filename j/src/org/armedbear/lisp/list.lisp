;;; list.lisp

(in-package "COMMON-LISP")

(export '(cdddr list-length copy-list copy-tree revappend nconc nreconc))

(defun cdddr (list)
  (cdr (cdr (cdr list))))

(defun list-length (list)
  "Returns the length of the given List, or Nil if the List is circular."
  (do ((n 0 (+ n 2))
       (y list (cddr y))
       (z list (cdr z)))
    (())
    (declare (fixnum n) (list y z))
    (when (endp y) (return n))
    (when (endp (cdr y)) (return (+ n 1)))
    (when (and (eq y z) (> n 0)) (return nil))))

(defun copy-list (list)
  (if (atom list)
      list
      (let ((result (list (car list))))
	(do ((x (cdr list) (cdr x))
	     (splice result
		     (cdr (rplacd splice (cons (car x) '() ))) ))
          ((atom x)
           (unless (null x)
             (rplacd splice x))))
	result)))

(defun copy-tree (object)
  (if (consp object)
      (cons (copy-tree (car object)) (copy-tree (cdr object)))
      object))

(defun revappend (x y)
  (do ((top x (cdr top))
       (result y (cons (car top) result)))
    ((endp top) result)))

(defun nconc (&optional list &rest rest)
  (if rest
      (let ((rest-conc (apply #'nconc rest)))
        (if (consp list)
            (progn (setf (cdr (last list)) rest-conc)
              list)
            rest-conc))
      list))

(defun nreconc (x y)
  (do ((1st (cdr x) (if (atom 1st) 1st (cdr 1st)))
       (2nd x 1st)		;2nd follows first down the list.
       (3rd y 2nd))		;3rd follows 2nd down the list.
    ((atom 2nd) 3rd)
    (rplacd 2nd 3rd)))

(provide "list")
