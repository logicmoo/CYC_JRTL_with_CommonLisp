;;; list.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: list.lisp,v 1.33 2003-06-10 17:38:23 piso Exp $
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
          sublis nsublis
          member member-if member-if-not tailp adjoin
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

(autoload 'subst "subst.lisp")
(autoload 'subst-if "subst.lisp")
(autoload 'subst-if-not "subst.lisp")
(autoload 'nsubst "subst.lisp")
(autoload 'nsubst-if "subst.lisp")
(autoload 'nsubst-if-not "subst.lisp")

(autoload 'sublis "sublis.lisp")
(autoload 'nsublist "nsublis.lisp")

(defun member (item list &key key test test-not)
  (%member item list key test test-not))

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


(autoload 'union "sets.lisp")
(autoload 'nunion "sets.lisp")
(autoload 'intersection "sets.lisp")
(autoload 'nintersection "sets.lisp")
(autoload 'set-difference "sets.lisp")
(autoload 'nset-difference "sets.lisp")
(autoload 'set-exclusive-or "sets.lisp")
(autoload 'nset-exclusive-or "sets.lisp")
(autoload 'subsetp "sets.lisp")


(defun acons (key datum alist)
  (cons (cons key datum) alist))

(defun pairlis (keys data &optional (alist '()))
  (do ((x keys (cdr x))
       (y data (cdr y)))
      ((and (endp x) (endp y)) alist)
    (if (or (endp x) (endp y))
	(error "the lists of keys and data are of unequal length"))
    (setq alist (acons (car x) (car y) alist))))

(autoload 'assoc "assoc.lisp")
(autoload 'assoc-if "assoc.lisp")
(autoload 'assoc-if-not "assoc.lisp")
(autoload 'rassoc "assoc.lisp")
(autoload 'rassoc-if "assoc.lisp")
(autoload 'rassoc-if-not "assoc.lisp")

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

