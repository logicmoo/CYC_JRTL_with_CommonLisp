;;; symbol.lisp

(in-package "COMMON-LISP")

(export '(remprop copy-symbol))

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

(defun copy-symbol (symbol &optional (copy-props nil) &aux new-symbol)
  "Make and return a new uninterned symbol with the same print name
   as SYMBOL.  If COPY-PROPS is false, the new symbol is neither bound
   nor fbound and has no properties, else it has a copy of SYMBOL's
   function, value and property list."
  (declare (type symbol symbol))
  (setq new-symbol (make-symbol (symbol-name symbol)))
  (when copy-props
    (set new-symbol (symbol-value symbol))
    (setf (symbol-plist new-symbol) (copy-list (symbol-plist symbol)))
    (when (fboundp symbol)
      (setf (symbol-function new-symbol) (symbol-function symbol))))
  new-symbol)
