;;; sublis.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id$
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

;;; From CMUCL.

(defun sublis (alist tree &key key (test #'eql) (test-not nil notp))
  (labels ((s (subtree)
              (let* ((key-val (sys::apply-key key subtree))
                     (assoc (if notp
                                (assoc key-val alist :test-not test-not)
                                (assoc key-val alist :test test))))
                (cond (assoc (cdr assoc))
                      ((atom subtree) subtree)
                      (t (let ((car (s (car subtree)))
                               (cdr (s (cdr subtree))))
                           (if (and (eq car (car subtree))
                                    (eq cdr (cdr subtree)))
                               subtree
                               (cons car cdr))))))))
          (s tree)))

(defmacro nsublis-macro ()
  (let ((key-tmp (gensym)))
    `(let ((,key-tmp (sys::apply-key key subtree)))
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
