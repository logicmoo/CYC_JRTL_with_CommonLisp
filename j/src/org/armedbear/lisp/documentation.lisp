;;; documentation.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: documentation.lisp,v 1.2 2003-06-20 16:40:34 piso Exp $
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

(export '(documentation))

(defvar *documentation* (make-hash-table))

(defun documentation (symbol type)
  (cdr (assoc type (gethash symbol *documentation*))))

(defun %set-documentation (symbol type string)
  (let* ((alist (gethash symbol *documentation*))
	 (pair (assoc type alist)))
    (if pair
        (setf (cdr pair) string)
        (progn
          (puthash symbol *documentation* (cons (cons type string) alist))
          string))))

(defsetf documentation %set-documentation)
