;;; compiler.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: compiler.lisp,v 1.44 2003-10-15 17:20:01 piso Exp $
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

(unless (find-package "COMPILER")
  (make-package "COMPILER" :nicknames '("C") :use '("COMMON-LISP")))

(in-package "COMMON-LISP")

(export 'compile)

(in-package "COMPILER")

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
      (setq result (nconc result (list (compile-cond-clause clause)))))
    result))

(defun compile-cond-clause (clause)
  (let ((test (car clause))
        (forms (cdr clause)))
    (nconc (list (compile-sexp test)) (compile-progn forms))))

(defun compile-case (keyform clauses)
  (let ((result (list (compile-sexp keyform))))
    (dolist (clause clauses)
      (setq result (nconc result (list (compile-case-clause clause)))))
    result))

(defun compile-case-clause (clause)
  (let ((keys (car clause))
        (forms (cdr clause)))
    (nconc (list keys) (compile-progn forms))))

(defun compile-tagbody (body)
  (let ((rest body)
        (result ()))
    (do () ((null rest) result)
      (if (atom (car rest))
          (setq result (nconc result (list (car rest))))
          (setq result (append result (list (compile-sexp (car rest))))))
      (setq rest (cdr rest)))))

(defun compile-locals (locals)
  (let ((result nil))
    (dolist (local locals)
      (setq result (append result (list (compile-local-def local)))))
    result))

(defun compile-local-def (def)
  (let ((name (car def))
        (arglist (cadr def))
        (body (cddr def)))
    (list* name arglist (compile-progn body))))

(defun compile-let-vars (vars)
  (let ((result nil))
    (dolist (var vars)
      (if (consp var)
          (let* ((v (car var))
                 (expr (cadr var)))
            (unless (symbolp v)
              (error 'type-error))
            (setq result (append result (list (list v (compile-sexp expr))))))
          (setq result (append result (list var)))))
    result))

(defun compile-special (form)
  (let ((first (car form)))
    (case first
      (BLOCK
       (unless (>= (length form) 2)
         (error "wrong number of arguments for BLOCK"))
       (unless (symbolp (cadr form))
         (error 'type-error))
       (list* 'block (cadr form) (mapcar #'compile-sexp (cddr form))))
      (COND
       (cons 'cond (compile-cond (cdr form))))
      (QUOTE
       form)
      ((AND OR)
       (cons first
             (mapcar #'compile-sexp (cdr form))))
      (FUNCTION
       (if (and (consp (cadr form)) (eq (caadr form) 'setf))
           form
           (cons 'function (list (compile-sexp (cadr form))))))
      (WHEN
       (cons 'when (mapcar #'compile-sexp (cdr form))))
      ((LET LET*)
       (list* first (compile-let-vars (cadr form)) (mapcar #'compile-sexp (cddr form))))
      (SETQ
       (compile-setq (cdr form)))
      (PROGN
       (cons 'progn (mapcar #'compile-sexp (cdr form))))
      (IF
       (unless (<= 2 (length (cdr form)) 3)
         (error "wrong number of arguments for IF"))
       (cons 'if (mapcar #'compile-sexp (cdr form))))
      ('CASE
       (cons 'case (compile-case (cadr form) (cddr form))))
      (DOLIST
       (let ((args (cadr form))
             (body (cddr form)))
         (cons first (cons args (compile-progn body)))))
      ((DO DO* MULTIPLE-VALUE-BIND)
       (let ((second (second form))
             (third (third form))
             (body (cdddr form)))
         (list* first second third (mapcar #'compile-sexp body))))
      (DOTIMES
       (let ((args (cadr form))
             (body (cddr form)))
         (list* first args (compile-progn body))))
      (TAGBODY
       (let ((body (cdr form)))
         (cons 'tagbody (compile-tagbody body))))
      (LABELS
       (let ((locals (cadr form))
             (body (cddr form)))
          (append '(labels) (list (compile-locals locals)) (compile-progn body))))
      (RETURN
       (if (cdr form)
           (cons 'return (list (compile-sexp (cadr form))))
           form))
      (UNLESS
       (cons 'unless (mapcar #'compile-sexp (cdr form))))
      (t
;;        (format t "    skipping ~S~%" first)
       form))))

;; EXPAND-MACRO is like MACROEXPAND, but EXPAND-MACRO quits if it encounters a
;; macro that's also implemented as a special operator, so interpreted code can
;; use the (faster) special operator implementation.
(defun expand-macro (form)
  (do () ()
    (multiple-value-bind (result expanded) (macroexpand-1 form)
      (unless expanded (return-from expand-macro result))
      (when (and (consp result)
                 (symbolp (car result))
                 (special-operator-p (car result)))
        (return-from expand-macro result))
      (setq form result))))

(defun compile-sexp (form)
  (if (atom form) form
      (let ((first (car form)))
        (unless (and (symbolp first) (fboundp first))
          (return-from compile-sexp form))
        (cond ((eq first 'LAMBDA)
               (list* 'LAMBDA (second form)
                      (mapcar #'compile-sexp (cddr form))))
              ((special-operator-p first)
               (compile-special form))
              ((macro-function first)
               (compile-sexp (expand-macro form)))
              (t
               (let ((args (mapcar #'compile-sexp (cdr form))))
                 (cons first args)))))))

(defun %compile (name &optional definition)
  (unless definition
    (setq definition (or (and (symbolp name) (macro-function name))
                         (fdefinition name))))
  (let (expr result)
    (cond ((functionp definition)
           (multiple-value-bind (form closure-p)
             (function-lambda-expression definition)
             (unless form
               (format t "; No lambda expression available for ~S.~%" name)
               (return-from %compile (values nil t t)))
             (when closure-p
               (format t "; Unable to compile function ~S defined in non-null lexical environment.~%" name)
               (finish-output)
               (return-from %compile (values nil t t)))
             (setq expr form)))
          ((and (consp definition) (eq (car definition) 'lambda))
           (setq expr definition))
          (t
           (error 'type-error)))
    (setq result (sys::coerce-to-function (compile-sexp expr)))
    (when (and name (functionp result))
      (sys::%set-lambda-name result name)
      (sys::%set-call-count result (sys::%call-count definition))
      (sys::%set-arglist result (sys::arglist definition))
      (if (and (symbolp name) (macro-function name))
          (setf (fdefinition name) (sys::make-macro result))
          (setf (fdefinition name) result)))
    (values (or name result) nil nil)))

(defun compile-package (pkg &key verbose)
  (dolist (sym (sys::package-symbols pkg))
    (when (fboundp sym)
      ;;       (unless (or (special-operator-p sym) (macro-function sym))
      (unless (special-operator-p sym)
        (let ((f (fdefinition sym)))
          (unless (compiled-function-p f)
            (when verbose
              (format t "compiling ~S~%" sym)
              (finish-output))
            (%compile sym))))))
  t)

(compile-package :compiler)
(compile-package :sys)
(compile-package :cl)

(in-package :cl)

(defun compile (name &optional definition)
  (if (and name (fboundp name) (typep (symbol-function name) 'generic-function))
      (values name nil nil)
      (c::%compile name definition)))

;; Redefine DEFUN to compile the definition on the fly.
(defmacro defun (name lambda-list &rest body)
  `(progn
     (sys::%defun ',name ',lambda-list ',body)
     (compiler::%compile ',name)
     ',name))

;; Redefine DEFMACRO to compile the expansion function on the fly.
(defmacro defmacro (name lambda-list &rest body)
  (let* ((form (gensym))
         (env (gensym))
         (body (sys::parse-defmacro lambda-list form body name 'defmacro
                                    :environment env))
         (expander `(lambda (,form ,env) (block ,name ,body))))
    `(progn
       (if (special-operator-p ',name)
         (sys::%put ',name
                    'sys::macroexpand-macro
                    (sys::make-macro (or (c::%compile nil ,expander) ,expander)))
         (sys::fset ',name
                    (sys::make-macro (or (c::%compile nil ,expander) ,expander))))
       ',name)))

;; Make an exception just this one time...
(sys::fset 'defmacro (get 'defmacro 'sys::macroexpand-macro))
