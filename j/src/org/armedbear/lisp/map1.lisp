;;; map1.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: map1.lisp,v 1.2 2004-03-24 01:32:41 piso Exp $
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
