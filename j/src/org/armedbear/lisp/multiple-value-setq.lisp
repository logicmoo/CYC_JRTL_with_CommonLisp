;;; multiple-value-setq.lisp
;;;
;;; Copyright (C) 2004-2007 Peter Graves
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

;; Adapted from CMUCL.

(in-package "SYSTEM")

(defmacro multiple-value-setq (varlist value-form)
  (unless (and (listp varlist) (every #'symbolp varlist))
    (error "~S is not a list of symbols." varlist))
  ;; MULTIPLE-VALUE-SETQ is required always to return the primary value of the
  ;; value-form, even if varlist is empty.
  (if varlist
    `(values (setf (values ,@varlist) ,value-form))
    `(values ,value-form)))
