;;; assert.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: assert.lisp,v 1.1 2003-12-19 03:04:16 piso Exp $
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

;;; Adapted from CMUCL.

(in-package "SYSTEM")

(defmacro assert (test-form &optional places datum &rest arguments)
  "Signals an error if the value of test-form is nil.  Continuing from this
   error using the CONTINUE restart will allow the user to alter the value of
   some locations known to SETF and start over with test-form.  Returns nil."
  `(loop
     (when ,test-form (return nil))
     (assert-error ',test-form ',places ,datum ,@arguments)
     ,@(mapcar #'(lambda (place)
                  `(setf ,place (assert-prompt ',place ,place)))
	       places)))

(defun assert-error (assertion places datum &rest arguments)
  (let ((c (if datum
               (coerce-to-condition
                datum arguments
                'simple-error 'error)
               (make-condition 'simple-error
                               :format-control "The assertion ~S failed."
                               :format-arguments (list assertion)))))
    (restart-case (error c)
                  (continue ()
                            :report (lambda (stream) (format stream "Retry assertion."))
                            nil))))


(defun assert-prompt (name value)
  (cond ((y-or-n-p "The old value of ~S is ~S.~%Do you want to supply a new value? "
		   name value)
         (fresh-line *query-io*)
	 (format *query-io* "Type a form to be evaluated:~%")
	 (flet ((read-it () (eval (read *query-io*))))
	   (if (symbolp name) ;help user debug lexical variables
	       (progv (list name) (list value) (read-it))
	       (read-it))))
	(t value)))
