;;; sets.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: sets.lisp,v 1.3 2003-08-25 19:18:00 piso Exp $
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

(in-package "SYSTEM")

;;; From CMUCL.

(defmacro with-set-keys (funcall)
  `(cond (notp ,(append funcall '(:key key :test-not test-not)))
	 (t ,(append funcall '(:key key :test test)))))

(defun union (list1 list2 &key key (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (when key
    (setq key (coerce-to-function key)))
  (let ((res list2))
    (dolist (elt list1)
      (unless (with-set-keys (member (funcall-key key elt) list2))
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
  (when key
    (setq key (coerce-to-function key)))
  (let ((res list2)
	(list1 list1))
    (do ()
        ((endp list1))
      (if (not (with-set-keys (member (funcall-key key (car list1)) list2)))
	  (steve-splice list1 res)
	  (setf list1 (cdr list1))))
    res))


(defun intersection (list1 list2 &key key
			   (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (when key
    (setq key (coerce-to-function key)))
  (let ((res nil))
    (dolist (elt list1)
      (if (with-set-keys (member (funcall-key key elt) list2))
	  (push elt res)))
    res))

(defun nintersection (list1 list2 &key key
			    (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (when key
    (setq key (coerce-to-function key)))
  (let ((res nil)
	(list1 list1))
    (do () ((endp list1))
      (if (with-set-keys (member (funcall-key key (car list1)) list2))
	  (steve-splice list1 res)
	  (setq list1 (cdr list1))))
    res))

(defun set-difference (list1 list2 &key key
			     (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (when key
    (setq key (coerce-to-function key)))
  (if (null list2)
      list1
      (let ((res nil))
	(dolist (elt list1)
	  (if (not (with-set-keys (member (funcall-key key elt) list2)))
	      (push elt res)))
	res)))


(defun nset-difference (list1 list2 &key key
			      (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (when key
    (setq key (coerce-to-function key)))
  (let ((res nil)
	(list1 list1))
    (do () ((endp list1))
      (if (not (with-set-keys (member (funcall-key key (car list1)) list2)))
	  (steve-splice list1 res)
	  (setq list1 (cdr list1))))
    res))


(defun set-exclusive-or (list1 list2 &key key
                               (test #'eql testp) (test-not nil notp))
  (when (and testp notp)
    (error "test and test-not both supplied"))
  (when key
    (setq key (coerce-to-function key)))
  (let ((result nil)
        (key (when key (coerce key 'function)))
        (test (coerce test 'function))
        (test-not (if test-not (coerce test-not 'function) #'eql)))
    (dolist (elt list1)
      (unless (with-set-keys (member (funcall-key key elt) list2))
	(setq result (cons elt result))))
    (let ((test (if testp
                    (lambda (x y) (funcall test y x))
                    test))
          (test-not (if notp
                        (lambda (x y) (funcall test-not y x))
                        test-not)))
      (dolist (elt list2)
        (unless (with-set-keys (member (funcall-key key elt) list1))
          (setq result (cons elt result)))))
    result))


(defun nset-exclusive-or (list1 list2 &key (test #'eql) (test-not nil notp)
				key)
  (when key
    (setq key (coerce-to-function key)))
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
      (cond ((let ((key-val-x (funcall-key key (car x)))
		   (key-val-y (funcall-key key (car y))))
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
  (when key
    (setq key (coerce-to-function key)))
  (dolist (elt list1)
    (unless (with-set-keys (member (funcall-key key elt) list2))
      (return-from subsetp nil)))
  T)
