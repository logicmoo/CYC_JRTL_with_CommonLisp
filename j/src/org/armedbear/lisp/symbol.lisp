;;; symbol.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: symbol.lisp,v 1.9 2003-12-19 17:25:40 piso Exp $
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

(defun %putf (place property new-value)
  (do ((plist place (cddr plist)))
      ((endp plist) (list* property new-value place))
    (when (eq (car plist) property)
      (setf (cadr plist) new-value)
      (return place))))

(defsetf getf %putf)

(defun get-properties (place indicator-list)
  (do ((plist place (cddr plist)))
      ((null plist) (values nil nil nil))
    (cond ((atom (cdr plist))
	   (error 'simple-type-error
                  :format-control "Malformed property list: ~S."
                  :format-arguments (list place)))
	  ((memq (car plist) indicator-list)
	   (return (values (car plist) (cadr plist) plist))))))

(defun copy-symbol (symbol &optional (copy-props nil) &aux new-symbol)
  (setq new-symbol (make-symbol (symbol-name symbol)))
  (when copy-props
    (when (boundp symbol)
      (set new-symbol (symbol-value symbol)))
    (setf (symbol-plist new-symbol) (copy-list (symbol-plist symbol)))
    (when (fboundp symbol)
      (setf (symbol-function new-symbol) (symbol-function symbol))))
  new-symbol)
