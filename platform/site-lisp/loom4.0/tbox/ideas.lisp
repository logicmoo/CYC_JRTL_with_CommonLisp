

;;; IDEAS.LISP



;;; Below is a version of "is-sub-concept" which utilizes a cache to
;;;    speed its operation.
;;; Status Note: The cache has not yet been implemented, and thus we
;;;    continue to use the original KB-CLASSES definition of "is-sub-concept"

;(defun is-sub-concept (concept1 concept2)
;  ;; Look up concept1 and concept2 in the appropriate cache.  If their
;  ;;    subsumption relation has not been cached there, do a walk up
;  ;;    the taxonomy to see if "concept2" is an ancestor of "concept1"
;  (case (cached-specializes-relations concept1 concept2)
;	(yes t)
;	(no nil)
;	(otherwise
;	  (let ((result (is-sub-concept-slowly concept1 concept2)))
;	    (setf (cached-specializes-relations concept1 concept2)
;		  (cond (result 'yes)
;			(t 'no)))))) )

