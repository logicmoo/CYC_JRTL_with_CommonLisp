;;; symbol.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: symbol.lisp,v 1.3 2003-04-24 15:54:25 piso Exp $
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

(export '(remprop get-properties copy-symbol))

;;; REMPROP (from CMUCL)
(defun remprop (symbol indicator)
  (do ((pl (symbol-plist symbol) (cddr pl))
       (prev nil pl))
    ((atom pl) nil)
    (cond ((atom (cdr pl))
	   (error "~S has an odd number of items in its property list" symbol))
	  ((eq (car pl) indicator)
	   (cond (prev (rplacd (cdr prev) (cddr pl)))
		 (t
		  (setf (symbol-plist symbol) (cddr pl))))
	   (return t)))))

;;; GET-PROPERTIES (from CMUCL)
(defun get-properties (place indicator-list)
  (do ((plist place (cddr plist)))
      ((null plist) (values nil nil nil))
    (cond ((atom (cdr plist))
	   (error 'type-error
                  "malformed property list: ~S" (list place)))
	  ((memq (car plist) indicator-list)
	   (return (values (car plist) (cadr plist) plist))))))

;;; COPY-SYMBOL (from CMUCL)
(defun copy-symbol (symbol &optional (copy-props nil) &aux new-symbol)
  (setq new-symbol (make-symbol (symbol-name symbol)))
  (when copy-props
    (set new-symbol (symbol-value symbol))
    (setf (symbol-plist new-symbol) (copy-list (symbol-plist symbol)))
    (when (fboundp symbol)
      (setf (symbol-function new-symbol) (symbol-function symbol))))
  new-symbol)
