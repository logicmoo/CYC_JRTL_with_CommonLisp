;;; symbol.lisp

(in-package "COMMON-LISP")

(export '(remprop))

;; From CMUCL.
(defun remprop (symbol indicator)
  "Look on property list of SYMBOL for property with specified
   INDICATOR.  If found, splice this indicator and its value out of
   the plist, and return T.  If not found, return NIL with no side effects."
  (do ((pl (symbol-plist symbol) (cddr pl))
       (prev nil pl))
    ((atom pl) nil)
    (cond ((atom (cdr pl))
	   (error "~S has an odd number of items in its property list." symbol))
	  ((eq (car pl) indicator)
	   (cond (prev (rplacd (cdr prev) (cddr pl)))
		 (t
		  (setf (symbol-plist symbol) (cddr pl))))
	   (return t)))))

(provide "symbol")
