;;; check-type.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: check-type.lisp,v 1.2 2004-01-02 01:48:10 piso Exp $
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
    `(loop
       (let ((,place-value ,place))
         (when (typep ,place-value ',type)
           (return nil))
         (setf ,place
               (check-type-error ',place ,place-value ',type ,type-string))))))

(defun check-type-error (place place-value type type-string)
  (let ((cond (if type-string
                  (make-condition 'simple-type-error
                                  :datum place :expected-type type
                                  :format-control
                                  "The value of ~S is ~S, which is not ~A."
                                  :format-arguments
                                  (list place place-value type-string))
		  (make-condition 'simple-type-error
				  :datum place :expected-type type
				  :format-control
                                  "The value of ~S is ~S, which is not of type ~S."
				  :format-arguments
				  (list place place-value type)))))
    (restart-case (error cond)
                  (store-value (value)
                               :report (lambda (stream)
                                         (format stream "Supply a new value for ~S."
                                                 place))
                               :interactive read-evaluated-form
                               value))))
