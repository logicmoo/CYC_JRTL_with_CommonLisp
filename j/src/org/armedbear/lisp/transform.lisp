;;; transform.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: transform.lisp,v 1.4 2003-11-04 19:13:51 piso Exp $
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

(defun compiler-macro-function (name &optional environment)
  (get name 'compiler-macro-expander))

(defun (setf compiler-macro-function) (new-function name &optional environment)
  (%put name 'compiler-macro-expander new-function))

(defmacro define-compiler-macro (name lambda-list &rest body)
  (let* ((form (gensym))
         (env (gensym))
         (body (sys::parse-defmacro lambda-list form body name 'defmacro
                                    :environment env))
         (expander `(lambda (,form ,env) (block ,name ,body))))
    `(progn
       (sys::%put ',name 'compiler-macro-expander
                  (c::%compile nil ,expander))
       ',name)))

(define-compiler-macro assoc (&whole form &rest args)
  (cond ((and (= (length args) 4)
              (eq (third args) :test)
              (or (equal (fourth args) '(quote eq))
                  (equal (fourth args) '(function eq))))
         `(assq ,(first args) ,(second args)))
        (t form)))

(defpackage "JVM" (:use "COMMON-LISP"))

(in-package "JVM")

(defun transform-lambda (args)
  (let* ((lambda-list (car args))
         (auxvars (memq '&AUX lambda-list))
         (body (cdr args)))
    (if auxvars
        (append (list 'LAMBDA (subseq lambda-list 0 (position '&AUX lambda-list))
                      (append (list 'LET*
                                    (cdr auxvars))
                              (mapcar #'transform1 body))))
        (append (list 'LAMBDA lambda-list) (mapcar #'transform1 body)))))

(defun transform1 (form)
  (when (atom form)
    (return-from transform1 form))
  (when (symbolp (car form))
    (let ((expander (compiler-macro-function (car form))))
      (when expander
        (return-from transform1 (funcall expander form nil)))))
  (let ((fun (car form))
        (args (cdr form)))
    (when (and (symbolp fun)
               (not (eq fun 'LAMBDA))
               (macro-function fun))
      (setq form (macroexpand form))
      (return-from transform1 (transform1 form)))
    (cond ((eq fun 'COND)
           (assert false)
           (transform-cond args))
          ((eq fun 'AND)
           (assert false)
           (transform-and args))
          ((eq fun 'OR)
           (error "transform-or called")
           (transform-or args))
          ((eq fun 'NOT)
           (if (consp args)
               (if (eq (first args) 'NOT)
                   (transform (second args))
                   (list 'NOT (transform (car args))))
               (list 'NOT (transform (car args)))))
          ((eq fun 'TAGBODY)
           (append (list 'TAGBODY) (mapcar #'transform1 args)))
          ((eq fun 'PROGN)
           (append (list 'PROGN) (mapcar #'transform1 args)))
          ((eq fun 'RETURN-FROM)
           (append (list 'RETURN-FROM) (list (car args))
                   (list (transform1 (cadr args)))))
          ((eq fun 'IF)
           (cond ((= (length args) 2)
                  (list 'IF
                        (transform1 (first args))
                        (transform1 (second args))))
                 ((= (length args) 3)
                  (list 'IF
                        (transform1 (first args))
                        (transform1 (second args))
                        (transform1 (third args))))
                 (t
                  (error "wrong number of arguments for IF"))))
          ((eq fun 'LET)
           (append (list 'LET (car args)) (mapcar #'transform1 (cdr args))))
          ((eq fun 'LET*)
           (append (list 'LET* (car args)) (mapcar #'transform1 (cdr args))))
          ((eq fun 'LAMBDA)
           (transform-lambda args))
          ((eq fun 'BLOCK)
           (append (list 'BLOCK (car args)) (mapcar #'transform1 (cdr args))))
          ((eq fun 'SETQ)
           (when (= 2 (length args))
               (return-from transform1 (list 'SETQ (first args) (transform1 (second args)))))
           (let ((result ()))
             (loop
               (when (zerop (length args))
                 (return))
               (when (= 1 (length args))
                 (error "odd number of args to SETQ"))
               (push (transform1 (list 'SETQ (first args) (second args))) result)
               (setq args (cddr args)))
             (setq result (nreverse result))
             (push 'PROGN result)
             result))
          ((eq fun 'QUOTE)
           form)
          ((eq fun 'FUNCTION)
           form)
          ((and (symbolp fun) (fboundp fun))
           (cons fun (mapcar #'transform1 args)))
          (t
           form))))

(defun transform (form)
  (do* ((form1 form)
        (form2 (transform1 form1)))
       ((equal form1 form2) form1)
    (setq form1 form2 form2 (transform1 form1))))

(provide 'transform)
