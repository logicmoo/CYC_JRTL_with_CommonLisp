;;; compiler.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: compiler.lisp,v 1.1 2003-03-05 17:46:13 piso Exp $
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

(unless (find-package "C")
  (make-package "C" :nicknames '("COMPILER")))

(in-package "C")

(defun compile-progn (forms)
  (mapcar #'compile-sexp forms))

(defun compile-setq (exprs)
  (when (oddp (length exprs))
    (error "odd number of arguments to SETQ"))
  (do* ((result '(setq))
        (sym (car exprs) (car exprs))
        (val (cadr exprs) (cadr exprs)))
    ((null exprs) result)
    (setq result (append result (list sym) (list (compile-sexp val))))
    (setq exprs (cddr exprs))))

(defun compile-cond (clauses)
  (let ((result nil))
    (dolist (clause clauses)
      (setq result (append result (list (compile-cond-clause clause)))))
    result))

(defun compile-cond-clause (clause)
  (let ((test (car clause))
        (forms (cdr clause)))
    (append (list (compile-sexp test)) (compile-progn forms))))

(defun compile-case (keyform clauses)
  (let ((result (list (compile-sexp keyform))))
    (dolist (clause clauses)
      (setq result (append result (list (compile-case-clause clause)))))
    result))

(defun compile-case-clause (clause)
  (let ((keys (car clause))
        (forms (cdr clause)))
    (append (list keys) (compile-progn forms))))

(defun compile-tagbody (body)
  (let ((rest body)
        (result ()))
    (while rest
      (if (atom (car rest))
          (setq result (append result (list (car rest))))
          (setq result (append result (list (compile-sexp (car rest))))))
      (setq rest (cdr rest)))
    result))

(defun compile-locals (locals)
  (let ((result nil))
    (dolist (local locals)
      (setq result (append result (list (compile-local-def local)))))
    result))

(defun compile-local-def (def)
  (let ((name (car def))
        (arglist (cadr def))
        (body (cddr def)))
    (append (list name arglist) (compile-progn body))))

(defun compile-special (form)
  (let ((first (car form)))
    (case first
      (SETQ
       (compile-setq (cdr form)))
      ((LAMBDA BLOCK)
       (append (list first (second form))
               (mapcar #'compile-sexp (cddr form))))
      (PROGN
       (append '(progn) (mapcar #'compile-sexp (cdr form))))
      (IF
       (append '(if) (mapcar #'compile-sexp (cdr form))))
      ((WHEN UNLESS)
       (append (list first)
               (list (compile-sexp (second form)))
               (compile-progn (cddr form))))
      (COND
       (append '(cond) (compile-cond (cdr form))))
      (CASE
       (append '(case) (compile-case (cadr form) (cddr form))))
      ((AND OR)
       (append (list first)
               (mapcar #'compile-sexp (cdr form))))
      (QUOTE
       (append '(quote) (list (compile-sexp (cadr form)))))
      (FUNCTION
       (append '(function) (list (compile-sexp (cadr form)))))
      ((LET LET* DOLIST)
       (let ((args (cadr form))
             (body (cddr form)))
         (append (list first) (list args) (compile-progn body))))
      ((DO DO*)
       (let ((second (second form))
             (third (third form))
             (body (cdddr form)))
         (append (list first second third) (compile-progn body))))
      (DOTIMES
       (let ((args (cadr form))
             (body (cddr form)))
         (append (list first args) (compile-progn body))))
      (TAGBODY
       (let ((body (cdr form)))
         (append '(tagbody) (compile-tagbody body))))
      (LABELS
       (let ((locals (cadr form))
             (body (cddr form)))
          (append '(labels) (list (compile-locals locals)) (compile-progn body))))
      (RETURN
       (if (cdr form)
           (append '(return) (list (compile-sexp (cadr form))))
           (append '(return))))
      (t
;;        (format t "    skipping ~S~%" first)
       form))))

(defun compile-list (form)
  (let ((first (car form)))
    (cond ((macro-function first)
           (compile-sexp (macroexpand form)))
          ((special-operator-p first)
           (compile-special form))
          (t
           (append (list first) (mapcar #'compile-sexp (cdr form)))))))

(defun compile-sexp (form)
  (if (atom form) form (compile-list form)))

(in-package "COMMON-LISP")

(export 'compile)

(defun compile (name &optional (definition (fdefinition name)))
  (let (expr result)
    (cond ((functionp definition)
           (setq expr (function-lambda-expression definition)))
          ((and (consp definition) (eq (car definition) 'lambda))
           (setq expr definition))
          (t
           (error 'type-error)))
    (setq result (coerce (c::compile-sexp expr) 'function))
    (when (and name (functionp result))
      (setf (fdefinition name) result))
    (values (or name result) nil nil)))
