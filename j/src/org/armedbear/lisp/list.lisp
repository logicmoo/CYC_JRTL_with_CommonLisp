;;; list.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: list.lisp,v 1.40 2003-06-22 18:19:30 piso Exp $
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

(autoload 'list-length)

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

(autoload 'copy-list)

(defun copy-tree (object)
  (if (consp object)
      (cons (copy-tree (car object)) (copy-tree (cdr object)))
      object))

(autoload 'revappend)
(autoload '(butlast nbutlast) "butlast.lisp")
(autoload 'ldiff)

(defmacro apply-key (key element)
  `(if ,key
       (funcall ,key ,element)
       ,element))

(defun complement (f)
  #'(lambda (&rest x) (not (apply f x))))

(defun constantly (x)
  #'(lambda (&rest args) x))

(autoload '(subst subst-it subst-if-not nsubst nsubst-if nsubst-if-not)
          "subst.lisp")
(autoload '(sublis nsublis) "sublis.lisp")

(defun member (item list &key key test test-not)
  (%member item list key test test-not))

(autoload '(member-if member-if-not) "member-if.lisp")
(autoload 'tailp)
(autoload 'adjoin)

(autoload '(union nunion
            intersection nintersection
            set-difference nset-difference
            set-exclusive-or nset-exclusive-or
            subsetp)
          "sets.lisp")

(autoload '(assoc assoc-if assoc-if-not rassoc rassoc-if rassoc-if-not
            acons pairlis copy-alist)
          "assoc.lisp")

(autoload '(mapc mapcan mapl maplist mapcon) "map1.lisp")
