;;; list.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: list.lisp,v 1.28 2003-06-02 14:44:57 piso Exp $
;;;
;;; This program is free software; you can redistribute it and/or
;;; modify it under the terms of the GNU General Public License
;;; as published by the Free Software Foundation; either version 2
;;; of the License, or (at your option) any later version.
;;;
;;; This program is distributed in the hope that it will be useful,
;;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;;; GNU General Public License for more details.
;;;
;;; You should have received a copy of the GNU General Public License
;;; along with this program; if not, write to the Free Software
;;; Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

(in-package "COMMON-LISP")

(export '(list-length
          fifth sixth seventh eighth ninth tenth
          make-list
          copy-list copy-alist copy-tree
          revappend nconc
          butlast nbutlast
          ldiff
          complement constantly
          subst subst-if subst-if-not nsubst nsubst-if nsubst-if-not
          sublis nsublis
          member member-if member-if-not tailp adjoin
          union nunion intersection nintersection
          set-difference nset-difference
          set-exclusive-or nset-exclusive-or subsetp
          acons pairlis
          assoc assoc-if assoc-if-not rassoc rassoc-if rassoc-if-not
          mapc mapcan mapl maplist mapcon))

(defun list-length (list)
  (do ((n 0 (+ n 2))
       (y list (cddr y))
       (z list (cdr z)))
      (())
    (when (endp y) (return n))
    (when (endp (cdr y)) (return (+ n 1)))
    (when (and (eq y z) (> n 0)) (return nil))))

(defun fifth (list)
  (car (cddddr list)))
(defun sixth (list)
  (cadr (cddddr list)))
(defun seventh (list)
  (caddr (cddddr list)))
(defun eighth (list)
  (cadddr (cddddr list)))
(defun ninth (list)
  (car (cddddr (cddddr list))))
(defun tenth (list)
  (cadr (cddddr (cddddr list))))

(defun make-list (size &key initial-element)
  (%make-list size initial-element))

(defun copy-list (list)
  (if (atom list)
      list
      (let ((result (list (car list))))
	(do ((x (cdr list) (cdr x))
	     (splice result
		     (cdr (rplacd splice (cons (car x) '())))))
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

(defun require-type (arg type)
  (unless (typep arg type)
    (error 'type-error)))

(defun butlast (list &optional (n 1))
  (require-type list 'list)
  (unless (null list)
    (let ((length (do ((list list (cdr list))
		       (i 0 (1+ i)))
                      ((atom list) (1- i)))))
      (unless (< length n)
	(do* ((top (cdr list) (cdr top))
	      (result (list (car list)))
	      (splice result)
	      (count length (1- count)))
             ((= count n) result)
	  (setq splice (cdr (rplacd splice (list (car top))))))))))

(defun nbutlast (list &optional (n 1))
  (require-type list 'list)
  (unless (null list)
    (let ((length (do ((list list (cdr list))
		       (i 0 (1+ i)))
                      ((atom list) (1- i)))))
      (unless (< length n)
	(do ((1st (cdr list) (cdr 1st))
	     (2nd list 1st)
	     (count length (1- count)))
            ((= count n)
             (rplacd 2nd ())
             list))))))


;;; LDIFF (from SBCL)

(defun ldiff (list object)
  (require-type list 'list)
  (do* ((list list (cdr list))
	(result (list ()))
	(splice result))
       ((atom list)
        (if (eql list object)
            (cdr result)
            (progn (rplacd splice list) (cdr result))))
    (if (eql list object)
	(return (cdr result))
	(setq splice (cdr (rplacd splice (list (car list))))))))


(defmacro apply-key (key element)
  `(if ,key
       (funcall ,key ,element)
       ,element))

(defun complement (function)
  #'(lambda (&optional (arg0 nil arg0-p) (arg1 nil arg1-p) (arg2 nil arg2-p)
		       &rest more-args)
     (not (cond (more-args (apply function arg0 arg1 arg2 more-args))
                (arg2-p (funcall function arg0 arg1 arg2))
                (arg1-p (funcall function arg0 arg1))
                (arg0-p (funcall function arg0))
                (t (funcall function))))))


(defun constantly (x)
  #'(lambda (&rest args) x))


(defmacro satisfies-the-test (item elt)
  (let ((key-tmp (gensym)))
    `(let ((,key-tmp (apply-key key ,elt)))
       (cond (testp (funcall test ,item ,key-tmp))
             (notp (not (funcall test-not ,item ,key-tmp)))
             (t (funcall test ,item ,key-tmp))))))

(defun subst (new old tree &key key (test #'eql testp) (test-not nil notp))
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
  (labels ((s (subtree)
	      (cond ((satisfies-the-test old subtree) new)
		    ((atom subtree) subtree)
		    (t (do* ((last nil subtree)
			     (subtree subtree (cdr subtree)))
                            ((atom subtree)
                             (if (satisfies-the-test old subtree)
                                 (setf (cdr last) new)))
			 (if (satisfies-the-test old subtree)
			     (return (setf (cdr last) new))
			     (setf (car subtree) (s (car subtree)))))
		       subtree))))
          (s tree)))

(defun nsubst-if (new test tree &key key)
  (labels ((s (subtree)
	      (cond ((funcall test (apply-key key subtree)) new)
		    ((atom subtree) subtree)
		    (t (do* ((last nil subtree)
			     (subtree subtree (cdr subtree)))
                            ((atom subtree)
                             (if (funcall test (apply-key key subtree))
                                 (setf (cdr last) new)))
			 (if (funcall test (apply-key key subtree))
			     (return (setf (cdr last) new))
			     (setf (car subtree) (s (car subtree)))))
		       subtree))))
          (s tree)))

(defun nsubst-if-not (new test tree &key key)
  (labels ((s (subtree)
	      (cond ((not (funcall test (apply-key key subtree))) new)
		    ((atom subtree) subtree)
		    (t (do* ((last nil subtree)
			     (subtree subtree (cdr subtree)))
                            ((atom subtree)
                             (if (not (funcall test (apply-key key subtree)))
                                 (setf (cdr last) new)))
			 (if (not (funcall test (apply-key key subtree)))
			     (return (setf (cdr last) new))
			     (setf (car subtree) (s (car subtree)))))
		       subtree))))
          (s tree)))

(defun sublis (alist tree &key key (test #'eql) (test-not nil notp))
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

(defmacro nsublis-macro ()
  (let ((key-tmp (gensym)))
    `(let ((,key-tmp (apply-key key subtree)))
       (if notp
           (assoc ,key-tmp alist :test-not test-not)
           (assoc ,key-tmp alist :test test)))))

(defun nsublis (alist tree &key key (test #'eql) (test-not nil notp))
  (let (temp)
    (labels ((s (subtree)
		(cond ((setq temp (nsublis-macro))
		       (cdr temp))
		      ((atom subtree) subtree)
		      (t (do* ((last nil subtree)
			       (subtree subtree (cdr subtree)))
                              ((atom subtree)
                               (if (setq temp (nsublis-macro))
                                   (setf (cdr last) (cdr temp))))
			   (if (setq temp (nsublis-macro))
			       (return (setf (cdr last) (cdr temp)))
			       (setf (car subtree) (s (car subtree)))))
			 subtree))))
            (s tree))))


(defun member (item list &key key (test #'eql testp) (test-not nil notp))
  (do ((list list (cdr list)))
      ((null list) nil)
    (let ((car (car list)))
      (if (satisfies-the-test item car)
	  (return list)))))

(defun member-if (test list &key key)
  (do ((list list (cdr list)))
      ((endp list) nil)
    (if (funcall test (apply-key key (car list)))
	(return list))))

(defun member-if-not (test list &key key)
  (do ((list list (cdr list)))
      ((endp list) ())
    (if (not (funcall test (apply-key key (car list))))
	(return list))))

(defun tailp (object list)
  (do ((list list (cdr list)))
      ((atom list) (eql list object))
    (if (eql object list)
	(return t))))

(defun adjoin (item list &key key (test #'eql) (test-not nil notp))
  (if (let ((key-val (apply-key key item)))
	(if notp
	    (member key-val list :test-not test-not :key key)
	    (member key-val list :test test :key key)))
      list
      (cons item list)))

(defmacro with-set-keys (funcall)
  `(cond (notp ,(append funcall '(:key key :test-not test-not)))
	 (t ,(append funcall '(:key key :test test)))))

(defun union (list1 list2 &key key (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (let ((res list2))
    (dolist (elt list1)
      (unless (with-set-keys (member (apply-key key elt) list2))
	(push elt res)))
    res))

(defmacro steve-splice (source destination)
  `(let ((temp ,source))
     (setf ,source (cdr ,source)
	   (cdr temp) ,destination
	   ,destination temp)))

(defun nunion (list1 list2 &key key (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (let ((res list2)
	(list1 list1))
    (do ()
        ((endp list1))
      (if (not (with-set-keys (member (apply-key key (car list1)) list2)))
	  (steve-splice list1 res)
	  (setf list1 (cdr list1))))
    res))


(defun intersection (list1 list2 &key key
			   (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (let ((res nil))
    (dolist (elt list1)
      (if (with-set-keys (member (apply-key key elt) list2))
	  (push elt res)))
    res))

(defun nintersection (list1 list2 &key key
			    (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (let ((res nil)
	(list1 list1))
    (do () ((endp list1))
      (if (with-set-keys (member (apply-key key (car list1)) list2))
	  (steve-splice list1 res)
	  (setq list1 (cdr list1))))
    res))

(defun set-difference (list1 list2 &key key
			     (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (if (null list2)
      list1
      (let ((res nil))
	(dolist (elt list1)
	  (if (not (with-set-keys (member (apply-key key elt) list2)))
	      (push elt res)))
	res)))


(defun nset-difference (list1 list2 &key key
			      (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (let ((res nil)
	(list1 list1))
    (do () ((endp list1))
      (if (not (with-set-keys (member (apply-key key (car list1)) list2)))
	  (steve-splice list1 res)
	  (setq list1 (cdr list1))))
    res))


(defun set-exclusive-or (list1 list2 &key key
                               (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (let ((result nil)
        (key (when key (coerce key 'function)))
        (test (coerce test 'function))
        (test-not (if test-not (coerce test-not 'function) #'eql)))
    (dolist (elt list1)
      (unless (with-set-keys (member (apply-key key elt) list2))
	(setq result (cons elt result))))
    (let ((test (if testp
                    (lambda (x y) (funcall test y x))
                    test))
          (test-not (if notp
                        (lambda (x y) (funcall test-not y x))
                        test-not)))
      (dolist (elt list2)
        (unless (with-set-keys (member (apply-key key elt) list1))
          (setq result (cons elt result)))))
    result))


(defun nset-exclusive-or (list1 list2 &key (test #'eql) (test-not nil notp)
				key)
  (do ((list1 list1)
       (list2 list2)
       (x list1 (cdr x))
       (splicex ()))
      ((endp x)
       (if (null splicex)
           (setq list1 list2)
           (rplacd splicex list2))
       list1)
    (do ((y list2 (cdr y))
	 (splicey ()))
        ((endp y) (setq splicex x))
      (cond ((let ((key-val-x (apply-key key (car x)))
		   (key-val-y (apply-key key (car y))))
	       (if notp
		   (not (funcall test-not key-val-x key-val-y))
		   (funcall test key-val-x key-val-y)))
	     (if (null splicex)
		 (setq list1 (cdr x))
		 (rplacd splicex (cdr x)))
	     (if (null splicey)
		 (setq list2 (cdr y))
		 (rplacd splicey (cdr y)))
	     (return ()))
	    (t (setq splicey y))))))

(defun subsetp (list1 list2 &key key (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (dolist (elt list1)
    (unless (with-set-keys (member (apply-key key elt) list2))
      (return-from subsetp nil)))
  T)

(defun acons (key datum alist)
  (cons (cons key datum) alist))

(defun pairlis (keys data &optional (alist '()))
  (do ((x keys (cdr x))
       (y data (cdr y)))
      ((and (endp x) (endp y)) alist)
    (if (or (endp x) (endp y))
	(error "the lists of keys and data are of unequal length"))
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


;;; Mapping functions (from CMUCL)

(defun map1 (function original-arglists accumulate take-car)
  (let* ((arglists (copy-list original-arglists))
	 (ret-list (list nil))
	 (temp ret-list))
    (do ((res nil)
	 (args '() '()))
        ((dolist (x arglists nil) (if (null x) (return t)))
         (if accumulate
             (cdr ret-list)
             (car original-arglists)))
      (do ((l arglists (cdr l)))
          ((null l))
	(push (if take-car (caar l) (car l)) args)
	(setf (car l) (cdar l)))
      (setq res (apply function (nreverse args)))
      (case accumulate
	(:nconc (setq temp (last (nconc temp res))))
	(:list (rplacd temp (list res))
	       (setq temp (cdr temp)))))))


(defun mapc (function list &rest more-lists)
  (map1 function (cons list more-lists) nil t))

(defun mapcan (function list &rest more-lists)
  (map1 function (cons list more-lists) :nconc t))

(defun mapl (function list &rest more-lists)
  (map1 function (cons list more-lists) nil nil))

(defun maplist (function list &rest more-lists)
  (map1 function (cons list more-lists) :list nil))

(defun mapcon (function list &rest more-lists)
  (map1 function (cons list more-lists) :nconc nil))

