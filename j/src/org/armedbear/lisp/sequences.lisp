;;; sequences.lisp

(in-package "COMMON-LISP")

(defun signal-index-too-large-error (sequence index)
  (error 'type-error))

(defun %setelt (sequence index newval)
  "Store NEWVAL as the element of SEQUENCE specified by INDEX."
  (cond ((listp sequence)
         (do ((count index (1- count))
              (seq sequence))
           ((= count 0) (rplaca seq newval) newval)
           (if (atom (cdr seq))
               (signal-index-too-large-error sequence index)
               (setq seq (cdr seq)))))
        ((vectorp sequence)
         (when (>= index (length sequence))
           (signal-index-too-large-error sequence index))
         (setf (aref sequence index) newval))))

(defsetf elt %setelt)
