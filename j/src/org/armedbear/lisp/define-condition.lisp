;;; define-condition.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: define-condition.lisp,v 1.5 2003-11-03 18:50:04 piso Exp $
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

(require 'clos)

(defmacro define-condition (name (&rest parent-types) (&rest slot-specs)
				 &body options)
  (let ((parent-types (or parent-types '(condition))))
    `(progn (defclass ,name ,parent-types ,slot-specs ,@options)
       ',name)))

(defun make-condition (type &rest initargs)
  (or (%make-condition type initargs)
      (apply #'make-instance (find-class type) initargs)))
