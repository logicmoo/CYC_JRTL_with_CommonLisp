;;; transform.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: transform.lisp,v 1.7 2003-11-09 14:50:30 piso Exp $
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
        (list* 'LAMBDA (subseq lambda-list 0 (position '&AUX lambda-list))
               (list* 'LET*
                      (cdr auxvars))
               (mapcar #'transform1 body))
        (list* 'LAMBDA lambda-list (mapcar #'transform1 body)))))

(defun transform1 (form)
  (when (atom form)
    (return-from transform1 form))
  (let ((op (car form))
        (args (cdr form)))
    (when (symbolp op)
      (let ((expander (compiler-macro-function op)))
        (when expander
          (return-from transform1 (funcall expander form nil)))))
    (when (and (symbolp op)
               (not (eq op 'LAMBDA))
               (macro-function op))
      (setq form (macroexpand form))
      (return-from transform1 (transform1 form)))
    (cond ((eq op 'TAGBODY)
           (list* 'TAGBODY (mapcar #'transform1 args)))
          ((eq op 'PROGN)
           (list* 'PROGN (mapcar #'transform1 args)))
          ((eq op 'RETURN-FROM)
           (append (list 'RETURN-FROM) (list (car args))
                   (list (transform1 (cadr args)))))
          ((eq op 'IF)
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
          ((eq op 'LET)
           (list* 'LET (car args) (mapcar #'transform1 (cdr args))))
          ((eq op 'LET*)
           (list* 'LET* (car args) (mapcar #'transform1 (cdr args))))
          ((eq op 'LAMBDA)
           (transform-lambda args))
          ((eq op 'BLOCK)
           (if (null (cdr args))
               nil
               (list* 'BLOCK (car args) (mapcar #'transform1 (cdr args)))))
          ((eq op 'SETQ)
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
          ((eq op 'QUOTE)
           form)
          ((eq op 'FUNCTION)
           form)
          ((and (symbolp op) (fboundp op))
           (cons op (mapcar #'transform1 args)))
          (t
           form))))

(defun transform (form)
  (do* ((form1 form)
        (form2 (transform1 form1)))
       ((equal form1 form2) form1)
    (setq form1 form2 form2 (transform1 form1))))

(provide 'transform)
