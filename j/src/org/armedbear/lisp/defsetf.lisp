;;; defsetf.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: defsetf.lisp,v 1.1 2003-10-23 13:16:36 piso Exp $
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

;;; CURRENTLY THIS FILE IS NOT USED! Oct 23 2003 6:16 AM

(in-package "SYSTEM")

(require :collect)

;; (defmacro defsetf (access-function update-function)
;;   `(%put ',access-function 'setf-inverse ',update-function))

(defun %define-setf-macro (name expander inverse doc)
;;   (cond ((not (fboundp `(setf ,name))))
;; 	((info function accessor-for name)
;; 	 (warn "Defining setf macro for destruct slot accessor; redefining as ~
;;          a normal function:~%  ~S"
;; 	       name)
;; 	 (c::define-function-name name))
;; 	((not (eq (symbol-package name) (symbol-package 'aref)))
;; 	 (warn "Defining setf macro for ~S, but ~S is fbound."
;; 	       name `(setf ,name))))
;;   (when (or inverse (info setf inverse name))
;;     (setf (info setf inverse name) inverse))
;;   (when (or expander (info setf expander name))
;;     (setf (info setf expander name) expander))
;;   (when doc
;;     (setf (documentation name 'setf) doc))
  (when inverse
    (setf (get name 'setf-inverse) inverse))
  (when expander
    (setf (get name 'setf-expander) expander))
  name)

(defun %defsetf (orig-access-form num-store-vars expander)
  (collect ((subforms) (subform-vars) (subform-exprs) (store-vars))
           (dolist (subform (cdr orig-access-form))
             (if (constantp subform)
                 (subforms subform)
                 (let ((var (gensym)))
                   (subforms var)
                   (subform-vars var)
                   (subform-exprs subform))))
           (dotimes (i num-store-vars)
             (store-vars (gensym)))
           (values (subform-vars)
                   (subform-exprs)
                   (store-vars)
                   (funcall expander (cons (subforms) (store-vars)))
                   `(,(car orig-access-form) ,@(subforms)))))

(defmacro defsetf (access-fn &rest rest)
  (cond ((not (listp (car rest)))
	 `(eval-when (load compile eval)
	    (%define-setf-macro ',access-fn nil ',(car rest)
				,(when (and (car rest) (stringp (cadr rest)))
				   `',(cadr rest)))))
	((and (cdr rest) (listp (cadr rest)))
	 (destructuring-bind
          (lambda-list (&rest store-variables) &body body)
          rest
          (let ((arglist-var (gensym "ARGS-"))
                (access-form-var (gensym "ACCESS-FORM-"))
                (env-var (gensym "ENVIRONMENT-")))
            (multiple-value-bind
              (body doc)
              (parse-defmacro `(,lambda-list ,@store-variables)
                              arglist-var body access-fn 'defsetf
                              :anonymousp t)
              `(eval-when (load compile eval)
                 (%define-setf-macro
                  ',access-fn
                  #'(lambda (,access-form-var ,env-var)
                     (declare (ignore ,env-var))
                     (%defsetf ,access-form-var ,(length store-variables)
                               #'(lambda (,arglist-var)
                                  (block ,access-fn
                                    ,body))))
                  nil
                  ',doc))))))
	(t
	 (error "ill-formed DEFSETF for ~S" access-fn))))
