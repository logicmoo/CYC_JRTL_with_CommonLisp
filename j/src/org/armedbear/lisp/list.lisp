;;; list.lisp

(in-package "COMMON-LISP")

(export '(cdddr list-length make-list
          copy-list copy-alist copy-tree
          revappend nconc nreconc
          complement constantly
          subst subst-if subst-if-not nsubst nsubst-if nsubst-if-not
          sublis nsublis
          acons pairlis
          assoc assoc-if assoc-if-not rassoc rassoc-if rassoc-if-not))

(defun cdddr (list)
  (cdr (cdr (cdr list))))

(defun list-length (list)
  "Returns the length of the list, or NIL if the list is circular."
  (do ((n 0 (+ n 2))
       (y list (cddr y))
       (z list (cdr z)))
    (())
    (when (endp y) (return n))
    (when (endp (cdr y)) (return (+ n 1)))
    (when (and (eq y z) (> n 0)) (return nil))))

(defun make-list (size &key initial-element)
  (do ((count size (1- count))
       (result '() (cons initial-element result)))
    ((zerop count) result)))

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

(defun copy-alist (alist)
  (if (atom alist)
      alist
      (let ((result
	     (cons (if (atom (car alist))
		       (car alist)
		       (cons (caar alist) (cdar alist)) )
		   nil)))
	(do ((x (cdr alist) (cdr x))
	     (splice result
		     (cdr (rplacd splice
				  (cons
				   (if (atom (car x))
				       (car x)
				       (cons (caar x) (cdar x)))
				   nil)))))
          ;; Non-null terminated alist done here.
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

(defun complement (function)
  "Builds a new function that returns T whenever FUNCTION returns NIL and
  NIL whenever FUNCTION returns T."
  #'(lambda (&optional (arg0 nil arg0-p) (arg1 nil arg1-p) (arg2 nil arg2-p)
		       &rest more-args)
     (not (cond (more-args (apply function arg0 arg1 arg2 more-args))
                (arg2-p (funcall function arg0 arg1 arg2))
                (arg1-p (funcall function arg0 arg1))
                (arg0-p (funcall function arg0))
                (t (funcall function))))))

(defun constantly (value &optional (val1 nil val1-p) (val2 nil val2-p)
			 &rest more-values)
  "Builds a function that always returns VALUE, and posisbly MORE-VALUES."
  (cond (more-values
	 (let ((list (list* value val1 val2 more-values)))
	   #'(lambda ()
              (values-list list))))
	(val2-p
	 #'(lambda ()
            (values value val1 val2)))
	(val1-p
	 #'(lambda ()
            (values value val1)))
	(t
	 #'(lambda ()
            value))))

(defmacro satisfies-the-test (item elt)
  (let ((key-tmp (gensym)))
    `(let ((,key-tmp (apply-key key ,elt)))
       (cond (testp (funcall test ,item ,key-tmp))
             (notp (not (funcall test-not ,item ,key-tmp)))
             (t (funcall test ,item ,key-tmp))))))


;;; Substitution of expressions



(defun subst (new old tree &key key (test #'eql testp) (test-not nil notp))
  "Substitutes new for subtrees matching old."
  (labels ((s (subtree)
	      (cond ((satisfies-the-test old subtree) new)
		    ((atom subtree) subtree)
		    (t (let ((car (s (car subtree)))
			     (cdr (s (cdr subtree))))
			 (if (and (eq car (car subtree))
				  (eq cdr (cdr subtree)))
			     subtree
			     (cons car cdr)))))))
          (s tree)))

(defun subst-if (new test tree &key key)
  "Substitutes new for subtrees for which test is true."
  (labels ((s (subtree)
	      (cond ((funcall test (apply-key key subtree)) new)
		    ((atom subtree) subtree)
		    (t (let ((car (s (car subtree)))
			     (cdr (s (cdr subtree))))
			 (if (and (eq car (car subtree))
				  (eq cdr (cdr subtree)))
			     subtree
			     (cons car cdr)))))))
          (s tree)))

(defun subst-if-not (new test tree &key key)
  "Substitutes new for subtrees for which test is false."
  (labels ((s (subtree)
	      (cond ((not (funcall test (apply-key key subtree))) new)
		    ((atom subtree) subtree)
		    (t (let ((car (s (car subtree)))
			     (cdr (s (cdr subtree))))
			 (if (and (eq car (car subtree))
				  (eq cdr (cdr subtree)))
			     subtree
			     (cons car cdr)))))))
          (s tree)))

(defun nsubst (new old tree &key key (test #'eql testp) (test-not nil notp))
  "Substitutes new for subtrees matching old."
  (labels ((s (subtree)
	      (cond ((satisfies-the-test old subtree) new)
		    ((atom subtree) subtree)
		    (t (do* ((last nil subtree)
			     (subtree subtree (Cdr subtree)))
                         ((atom subtree)
                          (if (satisfies-the-test old subtree)
                              (setf (cdr last) new)))
			 (if (satisfies-the-test old subtree)
			     (return (setf (cdr last) new))
			     (setf (car subtree) (s (car subtree)))))
		       subtree))))
          (s tree)))

(defun nsubst-if (new test tree &key key)
  "Substitutes new for subtrees of tree for which test is true."
  (labels ((s (subtree)
	      (cond ((funcall test (apply-key key subtree)) new)
		    ((atom subtree) subtree)
		    (t (do* ((last nil subtree)
			     (subtree subtree (Cdr subtree)))
                         ((atom subtree)
                          (if (funcall test (apply-key key subtree))
                              (setf (cdr last) new)))
			 (if (funcall test (apply-key key subtree))
			     (return (setf (cdr last) new))
			     (setf (car subtree) (s (car subtree)))))
		       subtree))))
          (s tree)))

(defun nsubst-if-not (new test tree &key key)
  "Substitutes new for subtrees of tree for which test is false."
  (labels ((s (subtree)
	      (cond ((not (funcall test (apply-key key subtree))) new)
		    ((atom subtree) subtree)
		    (t (do* ((last nil subtree)
			     (subtree subtree (Cdr subtree)))
                         ((atom subtree)
                          (if (not (funcall test (apply-key key subtree)))
                              (setf (cdr last) new)))
			 (if (not (funcall test (apply-key key subtree)))
			     (return (setf (cdr last) new))
			     (setf (car subtree) (s (car subtree)))))
		       subtree))))
          (s tree)))




(defun sublis (alist tree &key key (test #'eql) (test-not nil notp))
  "Substitutes from alist into tree nondestructively."
  (declare (inline assoc))
  (labels ((s (subtree)
              (let* ((key-val (apply-key key subtree))
                     (assoc (if notp
                                (assoc key-val alist :test-not test-not)
                                (assoc key-val alist :test test))))
                (cond (assoc (cdr assoc))
                      ((atom subtree) subtree)
                      (t (let ((car (s (car subtree)))
                               (cdr (s (cdr subtree))))
                           (if (and (eq car (car subtreE))
                                    (eq cdr (cdr subtree)))
                               subtree
                               (cons car cdr))))))))
          (s tree)))

;;; In run-time env, since can be referenced in line expansions.
(defmacro nsublis-macro ()
  (let ((key-tmp (gensym)))
    `(let ((,key-tmp (apply-key key subtree)))
       (if notp
           (assoc ,key-tmp alist :test-not test-not)
           (assoc ,key-tmp alist :test test)))))

(defun nsublis (alist tree &key key (test #'eql) (test-not nil notp))
  "Substitutes new for subtrees matching old."
  (declare (inline assoc))
  (let (temp)
    (labels ((s (subtree)
		(cond ((setq temp (nsublis-macro))
		       (cdr temp))
		      ((atom subtree) subtree)
		      (t (do* ((last nil subtree)
			       (subtree subtree (Cdr subtree)))
                           ((atom subtree)
                            (if (setq temp (nsublis-macro))
                                (setf (cdr last) (cdr temp))))
			   (if (setq temp (nsublis-macro))
			       (return (setf (Cdr last) (Cdr temp)))
			       (setf (car subtree) (s (car subtree)))))
			 subtree))))
            (s tree))))

(defun acons (key datum alist)
  "Construct a new alist by adding the pair (key . datum) to alist"
  (cons (cons key datum) alist))

(defun pairlis (keys data &optional (alist '()))
  "Construct an association list from keys and data (adding to alist)"
  (do ((x keys (cdr x))
       (y data (cdr y)))
    ((and (endp x) (endp y)) alist)
    (if (or (endp x) (endp y))
	(error "The lists of keys and data are of unequal length."))
    (setq alist (acons (car x) (car y) alist))))

(defmacro assoc-guts (test-guy)
  `(do ((alist alist (cdr alist)))
     ((endp alist))
     (if (car alist)
	 (if ,test-guy (return (car alist))))))

(defun assoc (item alist &key key test test-not)
  (cond (test
	 (if key
	     (assoc-guts (funcall test item (funcall key (caar alist))))
	     (assoc-guts (funcall test item (caar alist)))))
	(test-not
	 (if key
	     (assoc-guts (not (funcall test-not item
				       (funcall key (caar alist)))))
	     (assoc-guts (not (funcall test-not item (caar alist))))))
	(t
	 (if key
	     (assoc-guts (eql item (funcall key (caar alist))))
	     (assoc-guts (eql item (caar alist)))))))

(defun assoc-if (predicate alist &key key)
  (if key
      (assoc-guts (funcall predicate (funcall key (caar alist))))
      (assoc-guts (funcall predicate (caar alist)))))

(defun assoc-if-not (predicate alist &key key)
  (if key
      (assoc-guts (not (funcall predicate (funcall key (caar alist)))))
      (assoc-guts (not (funcall predicate (caar alist))))))


(defun rassoc (item alist &key key test test-not)
  (cond (test
	 (if key
	     (assoc-guts (funcall test item (funcall key (cdar alist))))
	     (assoc-guts (funcall test item (cdar alist)))))
	(test-not
	 (if key
	     (assoc-guts (not (funcall test-not item
				       (funcall key (cdar alist)))))
	     (assoc-guts (not (funcall test-not item (cdar alist))))))
	(t
	 (if key
	     (assoc-guts (eql item (funcall key (cdar alist))))
	     (assoc-guts (eql item (cdar alist)))))))

(defun rassoc-if (predicate alist &key key)
  (if key
      (assoc-guts (funcall predicate (funcall key (cdar alist))))
      (assoc-guts (funcall predicate (cdar alist)))))

(defun rassoc-if-not (predicate alist &key key)
  (if key
      (assoc-guts (not (funcall predicate (funcall key (cdar alist)))))
      (assoc-guts (not (funcall predicate (cdar alist))))))
