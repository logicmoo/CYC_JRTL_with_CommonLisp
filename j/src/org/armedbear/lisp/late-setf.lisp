;;; late-setf.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: late-setf.lisp,v 1.3 2004-03-18 19:06:00 piso Exp $
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

;;; From CMUCL/SBCL.

(in-package "SYSTEM")

(defmacro define-setf-expander (access-fn lambda-list &body body)
  (require-type access-fn 'symbol)
  (let ((whole (gensym "WHOLE-"))
	(environment (gensym "ENV-")))
    (multiple-value-bind (body local-decs doc)
			 (parse-defmacro lambda-list whole body access-fn
					 'define-setf-expander
					 :environment environment)
      `(setf (get ',access-fn 'setf-expander)
             #'(lambda (,whole ,environment)
                ,@local-decs
                (block ,access-fn ,body))))))

(define-setf-expander values (&rest places &environment env)
  (let ((setters ())
        (getters ())
        (all-dummies ())
        (all-vals ())
        (newvals ()))
    (dolist (place places)
      (multiple-value-bind (dummies vals newval setter getter)
        (get-setf-expansion place env)
        (setq all-dummies (append all-dummies dummies)
              all-vals (append all-vals vals)
              newvals (append newvals newval))
        (push setter setters)
        (push getter getters)))
    (values all-dummies all-vals newvals
            `(values ,@(reverse setters)) `(values ,@(reverse getters)))))

(defun make-gensym-list (n)
  (let ((list ()))
    (dotimes (i n list)
      (push (gensym) list))))

(defun %putf (place property new-value)
  (do ((plist place (cddr plist)))
      ((endp plist) (list* property new-value place))
    (when (eq (car plist) property)
      (setf (cadr plist) new-value)
      (return place))))

(define-setf-expander getf (place prop &optional default &environment env)
  (multiple-value-bind (temps values stores set get)
    (get-setf-expansion place env)
    (let ((newval (gensym))
          (ptemp (gensym))
          (def-temp (if default (gensym))))
      (values `(,@temps ,ptemp ,@(if default `(,def-temp)))
              `(,@values ,prop ,@(if default `(,default)))
              `(,newval)
              `(let ((,(car stores) (%putf ,get ,ptemp ,newval)))
                 ,set
                 ,newval)
              `(getf ,get ,ptemp ,@(if default `(,def-temp)))))))

(define-setf-expander apply (functionoid &rest args)
  (unless (and (listp functionoid)
               (= (length functionoid) 2)
               (eq (first functionoid) 'function)
               (symbolp (second functionoid)))
    (error "SETF of APPLY is only defined for function arguments (e.g. #'AREF)."))
  (let ((function (second functionoid))
        (new-var (gensym))
        (vars (make-gensym-list (length args))))
    (values vars args (list new-var)
            `(apply #'(setf ,function) ,new-var ,@vars)
            `(apply #',function ,@vars))))
