;;; list.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
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

(in-package #:system)

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

(defmacro apply-key (key element)
  `(if ,key
       (funcall ,key ,element)
       ,element))

(defun complement (f)
  #'(lambda (&rest x) (not (apply f x))))

(defun constantly (x)
  #'(lambda (&rest args) (declare (ignore args)) x))

(defun member (item list &key key test test-not)
  (%member item list key test test-not))
