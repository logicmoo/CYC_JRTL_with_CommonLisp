;;; precompiler.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: precompiler.lisp,v 1.3 2003-11-14 00:06:05 piso Exp $
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

(define-compiler-macro assoc (&whole form &rest args)
  (cond ((and (= (length args) 4)
              (eq (third args) :test)
              (or (equal (fourth args) '(quote eq))
                  (equal (fourth args) '(function eq))))
         `(assq ,(first args) ,(second args)))
        (t form)))

(in-package "EXTENSIONS")

(export '(precompile-form precompile))

(unless (find-package "PRECOMPILER")
  (make-package "PRECOMPILER"
                :nicknames '("PRE")
                :use '("COMMON-LISP" "EXTENSIONS")))

(in-package "PRECOMPILER")

(defvar *in-jvm-compile* nil)

(defun precompile-identity (form)
  form)

(defun precompile-cons (form)
  (cons (car form) (mapcar #'precompile1 (cdr form))))

(defun precompile-block (form)
  (let ((args (cdr form)))
    (if (null (cdr args))
        nil
        (list* 'BLOCK (car args) (mapcar #'precompile1 (cdr args))))))

(defun precompile-dolist (form)
  (cons 'DOLIST (cons (cadr form) (mapcar #'precompile1 (cddr form)))))

(defun precompile-dotimes (form)
  (cons 'DOTIMES (cons (cadr form) (mapcar #'precompile1 (cddr form)))))

(defun precompile-do/do* (form)
  (list* (car form) (cadr form) (caddr form)
         (mapcar #'precompile1 (cdddr form))))

(defun precompile-do-symbols (form)
   (list* (car form) (cadr form) (mapcar #'precompile1 (cddr form))))

(defun precompile-progn (form)
   (let ((body (cdr form)))
     (if (= (length body) 1)
         (let ((res (precompile1 (car body))))
           ;; If the result turns out to be a bare symbol, leave it wrapped
           ;; with PROGN so it won't be mistaken for a tag in an enclosing
           ;; TAGBODY.
           (if (symbolp res)
               (list 'progn res)
               res))
         (cons 'PROGN (mapcar #'precompile1 body)))))

(defun precompile-progv (form)
   (list* 'PROGV (cadr form) (caddr form) (mapcar #'precompile1 (cdddr form))))

(defun precompile-setq (form)
  (let* ((args (cdr form))
        (len (length args)))
    (when (oddp len)
      (error "odd number of arguments to SETQ"))
    (if (= len 2)
        (list 'SETQ (car args) (precompile1 (cadr args)))
        (let ((result ()))
          (loop
            (when (null args)
              (return))
            (push (list 'SETQ (car args) (precompile1 (cadr args))) result)
            (setq args (cddr args)))
          (setq result (nreverse result))
          (push 'PROGN result)
          result))))

(defun precompile-lambda (form)
  (let* ((args (cdr form))
         (lambda-list (car args))
         (auxvars (memq '&AUX lambda-list)))
    (if auxvars
        (append (list 'LAMBDA (subseq lambda-list 0 (position '&AUX lambda-list))
                      (append (list 'LET*
                                    (cdr auxvars))
                              (mapcar #'precompile1 (cdr args)))))
        (list* 'LAMBDA lambda-list (mapcar #'precompile1 (cdr args))))))

(defun define-local-macro (name lambda-list body)
  (let* ((form (gensym))
         (env (gensym))
         (body (sys::parse-defmacro lambda-list form body name 'macrolet
                                    :environment env))
         (expander `(lambda (,form ,env) (block ,name ,body)))
         (compiled-expander (compile nil expander)))
    (sys::coerce-to-function (or compiled-expander expander))))

(defvar *local-macros* ())

(defun local-macro-function (name)
  (getf *local-macros* name))

(defun expand-local-macro (form)
  (let ((expansion (funcall (local-macro-function (car form)) form nil)))
    ;; If the expansion turns out to be a bare symbol, wrap it with PROGN so it
    ;; won't be mistaken for a tag in an enclosing TAGBODY.
    (if (symbolp expansion)
        (list 'progn expansion)
        expansion)))

(defun precompile-macrolet (form)
  (let ((*local-macros* *local-macros*)
        (macros (cadr form))
        (body (cddr form))
        (res ())
        compiled-body)
    (dolist (macro macros)
      (let ((name (car macro))
            (lambda-list (cadr macro))
            (forms (cddr macro)))
        (push (define-local-macro name lambda-list forms) *local-macros*)
        (push name *local-macros*)
        (push (list* name lambda-list (mapcar #'precompile1 forms)) res)))
    (setf compiled-body (mapcar #'precompile1 body))
    (setf res (list* 'PROGN compiled-body))
    res))

(defun precompile-let/let*-vars (vars)
  (let ((result nil))
    (dolist (var vars)
      (if (consp var)
          (let* ((v (car var))
                 (expr (cadr var)))
            (unless (symbolp v)
              (error 'type-error))
            (push (list v (precompile1 expr)) result))
          (push var result)))
    (nreverse result)))

(defun precompile-let/let* (form)
  (list* (car form)
         (precompile-let/let*-vars (cadr form))
         (mapcar #'precompile1 (cddr form))))

(defun precompile-case (form)
  (let* ((keyform (cadr form))
         (clauses (cddr form))
         (result (list (precompile1 keyform))))
    (dolist (clause clauses)
      (setq result (nconc result (list (precompile-case-clause clause)))))
    (cons (car form) result)))

(defun precompile-case-clause (clause)
  (let ((keys (car clause))
        (forms (cdr clause)))
    (cons keys (mapcar #'precompile1 forms))))

(defun precompile-cond (form)
  (let ((clauses (cdr form))
        (result nil))
    (dolist (clause clauses)
      (setq result (nconc result (list (precompile-cond-clause clause)))))
    (cons 'COND result)))

(defun precompile-cond-clause (clause)
  (let ((test (car clause))
        (forms (cdr clause)))
    (cons (precompile1 test) (mapcar #'precompile1 forms))))

(defun precompile-local-function-def (def)
  (let ((name (car def))
        (arglist (cadr def))
        (body (cddr def)))
    (list* name arglist (mapcar #'precompile1 body))))

(defun precompile-local-functions (defs)
  (let ((result nil))
    (dolist (def defs)
      (setq result (append result (list (precompile-local-function-def def)))))
    result))

(defun precompile-flet/labels (form)
  (let ((locals (cadr form))
        (body (cddr form)))
    (list* (car form)
           (precompile-local-functions locals)
           (mapcar #'precompile1 body))))

(defun precompile-function (form)
  (if (and (consp (cadr form)) (eq (caadr form) 'LAMBDA))
      (list 'FUNCTION (precompile-lambda (cadr form)))
      form))

(defun precompile-if (form)
  (let ((args (cdr form)))
    (case (length args)
      (2
       (list 'IF
             (precompile1 (car args))
             (precompile1 (cadr args))))
      (3
       (list 'IF
             (precompile1 (car args))
             (precompile1 (cadr args))
             (precompile1 (caddr args))))
      (t
       (error "wrong number of arguments for IF")))))

(defun precompile-multiple-value-bind (form)
  (let ((vars (cadr form))
        (values-form (caddr form))
        (body (cdddr form)))
    (list* 'MULTIPLE-VALUE-BIND
           vars
           (precompile1 values-form)
           (mapcar #'precompile1 body))))

(defun precompile-multiple-value-list (form)
   (list 'MULTIPLE-VALUE-LIST (precompile1 (cadr form))))

(defun precompile-return (form)
   (list 'RETURN (precompile1 (cadr form))))

(defun precompile-return-from (form)
  (list 'RETURN-FROM (cadr form) (precompile1 (caddr form))))

(defun precompile-tagbody (form)
  (do ((body (cdr form) (cdr body))
       (result ()))
      ((null body) (cons 'TAGBODY (nreverse result)))
    (if (atom (car body))
        (push (car body) result)
        (push (precompile1 (car body)) result))))

(defun precompile-the (form)
  (precompile1 (caddr form)))

(defun precompile-unwind-protect (form)
   (list* 'UNWIND-PROTECT
          (precompile1 (cadr form))
          (mapcar #'precompile1 (cddr form))))

;; EXPAND-MACRO is like MACROEXPAND, but EXPAND-MACRO quits if *in-jvm-compile*
;; is false and a macro is encountered that's also implemented as a special
;; operator, so interpreted code can use the special operator implementation.
(defun expand-macro (form)
  (loop
    (unless *in-jvm-compile*
      (when (and (consp form)
                 (symbolp (car form))
                 (special-operator-p (car form)))
        (return-from expand-macro form)))
    (multiple-value-bind (result expanded) (macroexpand-1 form)
      (unless expanded
        (return-from expand-macro result))
      (setf form result))))

;;; From OpenMCL.
(defun compiler-macroexpand-1 (form &optional env)
  (let ((expander nil)
        (newdef nil))
    (if (and (consp form)
             (symbolp (car form))
             (setq expander (compiler-macro-function (car form) env)))
        (values (setq newdef (funcall expander form env))
                (not (eq newdef form)))
        (values form
                nil))))

;;; From OpenMCL.
(defun compiler-macroexpand (form &optional env)
  (multiple-value-bind (new win) (compiler-macroexpand-1 form env)
    (do* ((won-at-least-once win))
         ((null win) (values new won-at-least-once))
      (multiple-value-setq (new win) (compiler-macroexpand-1 new env)))))

(defun precompile1 (form)
  (when (atom form)
    (return-from precompile1 form))
  ;; Form is a cons.
  (let ((op (car form)))
    (when (symbolp op)
      (cond ((local-macro-function op)
             (let ((result (expand-local-macro form)))
               (if (equal result form)
                   (return-from precompile1 result)
                   (return-from precompile1 (precompile1 result)))))
            ((compiler-macro-function op)
             (let ((result (compiler-macroexpand form)))
               (if (equal result form)
                   (return-from precompile1 result)
                   (return-from precompile1 (precompile1 result)))))
            ((and (not (eq op 'LAMBDA))
                  (macro-function op))
             ;; It's a macro...
             (unless (and (special-operator-p op) (not *in-jvm-compile*))
               (let ((result (expand-macro form)))
                 (return-from precompile1 (precompile1 result))))))
    (let ((handler (get op 'precompile-handler)))
      (when handler
        (return-from precompile1 (funcall handler form)))))
    (when (and (symbolp op) (fboundp op))
      (when (special-operator-p op)
        (format t "PRECOMPILE1: unsupported special operator ~S~%" op))))
  (precompile-cons form))

(defun precompile-form (form in-jvm-compile)
  (let ((*in-jvm-compile* in-jvm-compile))
    (precompile1 form)))

(defun install-handler (fun &optional handler)
  (let ((handler (or handler
                     (find-symbol (concatenate 'string "PRECOMPILE-"
                                               (symbol-name fun))
                                  'precompiler))))
    (unless (and handler (fboundp handler))
      (error "no handler for ~S" fun))
    (setf (get fun 'precompile-handler) handler)))

(mapcar #'install-handler '(block
                            case
                            cond
                            dolist
                            dotimes
                            function
                            if
                            lambda
                            macrolet
                            multiple-value-bind
                            multiple-value-list
                            progn
                            progv
                            return
                            return-from
                            setq
                            tagbody
                            the
                            unwind-protect))

(install-handler 'ecase                'precompile-case)

(install-handler 'and                  'precompile-cons)
(install-handler 'locally              'precompile-cons)
(install-handler 'multiple-value-call  'precompile-cons)
(install-handler 'multiple-value-prog1 'precompile-cons)
(install-handler 'or                   'precompile-cons)
(install-handler 'unless               'precompile-cons)
(install-handler 'when                 'precompile-cons)

(install-handler 'do                   'precompile-do/do*)
(install-handler 'do*                  'precompile-do/do*)

(install-handler 'flet                 'precompile-flet/labels)
(install-handler 'labels               'precompile-flet/labels)

(install-handler 'do-symbols           'precompile-do-symbols)
(install-handler 'do-external-symbols  'precompile-do-symbols)

(install-handler 'let                  'precompile-let/let*)
(install-handler 'let*                 'precompile-let/let*)

(install-handler 'catch                'precompile-identity)
(install-handler 'declare              'precompile-identity)
(install-handler 'go                   'precompile-identity)
(install-handler 'handler-bind         'precompile-identity)
(install-handler 'handler-case         'precompile-identity)
(install-handler 'nth-value            'precompile-identity)
(install-handler 'quote                'precompile-identity)
(install-handler 'throw                'precompile-identity)

(in-package "SYSTEM")

(defun precompile (name &optional definition)
  (unless definition
    (setq definition (or (and (symbolp name) (macro-function name))
                         (fdefinition name))))
  (let (expr result)
    (cond ((functionp definition)
           (multiple-value-bind (form closure-p)
             (function-lambda-expression definition)
             (unless form
               (format t "; No lambda expression available for ~S.~%" name)
               (return-from precompile (values nil t t)))
             (when closure-p
               (format t "; Unable to compile function ~S defined in non-null lexical environment.~%" name)
               (finish-output)
               (return-from precompile (values nil t t)))
             (setq expr form)))
          ((and (consp definition) (eq (car definition) 'lambda))
           (setq expr definition))
          (t
           (error 'type-error)))
    (setf result (coerce-to-function (precompile-form expr nil)))
    (when (and name (functionp result))
      (%set-lambda-name result name)
      (%set-call-count result (%call-count definition))
      (%set-arglist result (arglist definition))
      (if (and (symbolp name) (macro-function name))
          (setf (fdefinition name) (make-macro result))
          (setf (fdefinition name) result)))
    (values (or name result) nil nil)))

(defun precompile-package (pkg &key verbose)
  (dolist (sym (package-symbols pkg))
    (when (fboundp sym)
      (unless (special-operator-p sym)
        (let ((f (fdefinition sym)))
          (unless (compiled-function-p f)
            (when verbose
              (format t "compiling ~S~%" sym)
              (finish-output))
            (precompile sym))))))
  t)

(precompile-package "PRECOMPILER")
(precompile-package "EXTENSIONS")
(precompile-package "SYSTEM")
(precompile-package "COMMON-LISP")

(defun compile (name &optional definition)
  (if (and name (fboundp name) (typep (symbol-function name) 'generic-function))
      (values name nil nil)
      (precompile name definition)))

;; Redefine DEFMACRO to compile the expansion function on the fly.
(defmacro defmacro (name lambda-list &rest body)
  (let* ((form (gensym))
         (env (gensym))
         (body (parse-defmacro lambda-list form body name 'defmacro
                               :environment env))
         (expander `(lambda (,form ,env) (block ,name ,body))))
    `(progn
       (if (special-operator-p ',name)
           (%put ',name
                 'macroexpand-macro
                 (make-macro (or (precompile nil ,expander) ,expander)))
           (fset ',name
                 (make-macro (or (precompile nil ,expander) ,expander))))
       ',name)))

;; Make an exception just this one time...
(fset 'defmacro (get 'defmacro 'macroexpand-macro))

;; Redefine DEFUN to compile the definition on the fly.
(defmacro defun (name lambda-list &rest body &environment env)
  `(progn
     (%defun ',name ',lambda-list ',body ,env)
     (precompile ',name)
     ',name))
