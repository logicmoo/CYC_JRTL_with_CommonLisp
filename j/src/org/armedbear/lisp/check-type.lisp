;;; check-type.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: check-type.lisp,v 1.1 2003-09-22 17:19:20 piso Exp $
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

;;; CHECK-TYPE (from CMUCL)
(defmacro check-type (place type &optional type-string)
  (let ((place-value (gensym)))
    `(let ((,place-value ,place))
       (unless (typep ,place-value ',type)
         (check-type-error ',place ,place-value ',type ,type-string)))))

(defun check-type-error (place place-value type type-string)
  (let ((cond (if type-string
                  (make-condition 'simple-type-error
                                  :datum place :expected-type type
                                  :format-control
                                  "the value of ~S is ~S, which is not ~A"
                                  :format-arguments
                                  (list place place-value type-string))
		  (make-condition 'simple-type-error
				  :datum place :expected-type type
				  :format-control
                                  "the value of ~S is ~S, which is not of type ~S"
				  :format-arguments
				  (list place place-value type)))))
    (error cond)))
