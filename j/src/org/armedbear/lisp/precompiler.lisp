;;; precompiler.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: precompiler.lisp,v 1.76 2004-08-15 11:26:20 piso Exp $
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
        ((= (length args) 2)
         `(assql ,(first args) ,(second args)))
        (t form)))

(define-compiler-macro member (&whole form &rest args)
  (cond ((and (= (length args) 4)
              (eq (third args) :test)
              (or (equal (fourth args) '(quote eq))
                  (equal (fourth args) '(function eq))))
         `(memq ,(first args) ,(second args)))
        ((and (= (length args) 4)
              (eq (third args) :test)
              (or (equal (fourth args) '(quote eql))
                  (equal (fourth args) '(function eql))))
         `(memql ,(first args) ,(second args)))
        ((= (length args) 2)
         `(memql ,(first args) ,(second args)))
        (t form)))

(define-compiler-macro search (&whole form &rest args)
  (if (= (length args) 2)
      `(simple-search ,@args)
      form))

(define-compiler-macro %aset (&whole form &rest args)
  (if (= (length args) 3)
      `(%set-row-major-aref ,(first args) ,(second args) ,(third args))
      form))

(define-compiler-macro identity (&whole form &rest args)
  (if (= (length args) 1)
      `(progn ,(car args))
      form))

(defun quoted-form-p (form)
  (and (consp form) (eq (car form) 'quote) (= (length form) 2)))

(define-compiler-macro eql (&whole form &rest args)
  (let ((first (car args))
        (second (cadr args)))
    (if (or (and (sys::quoted-form-p first) (symbolp (cadr first)))
            (and (sys::quoted-form-p second) (symbolp (cadr second))))
        `(eq ,(car args) ,(cadr args))
        form)))

(define-compiler-macro not (&whole form arg)
  (if (atom arg)
      form
      (let ((op (case (car arg)
                  (>= '<)
                  (<  '>=)
                  (<= '>)
                  (>  '<=)
                  (t  nil))))
        (if (and op (= (length arg) 3))
            (cons op (cdr arg))
            form))))

(define-compiler-macro typep (&whole form &rest args)
  (if (= (length args) 2)
      `(%typep ,@args)
      form))

(define-compiler-macro subtypep (&whole form &rest args)
  (if (= (length args) 2)
      `(%subtypep ,@args)
      form))

(define-compiler-macro funcall (&whole form &rest args)
  (let ((callee (car args)))
    (if (and (consp callee)
             (eq (car callee) 'function)
             (symbolp (cadr callee))
             (memq (symbol-package (cadr callee))
                   (list (find-package "CL") (find-package "SYS"))))
        `(,(cadr callee) ,@(cdr args))
        form)))

(define-compiler-macro byte (size position)
  `(cons ,size ,position))

(define-compiler-macro byte-size (bytespec)
  `(car ,bytespec))

(define-compiler-macro byte-position (bytespec)
  `(cdr ,bytespec))

(define-compiler-macro ldb (&whole form bytespec integer)
  (if (and (consp bytespec)
           (eq (car bytespec) 'byte)
           (= (length bytespec) 3))
      (let ((size (second bytespec))
            (position (third bytespec)))
        `(sys::%ldb ,size ,position ,integer))
      form))

(define-compiler-macro catch (&whole form tag &rest args)
  (if (and (null (cdr args))
           (constantp (car args)))
      (car args)
      form))

(define-compiler-macro string= (&whole form &rest args)
  (if (= (length args) 2)
      `(sys::%%string= ,@args)
      form))

(in-package "EXTENSIONS")

(export '(precompile-form precompile))

(unless (find-package "PRECOMPILER")
  (make-package "PRECOMPILER"
                :nicknames '("PRE")
                :use '("COMMON-LISP" "EXTENSIONS")))

(in-package "PRECOMPILER")

(defvar *in-jvm-compile* nil)

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

(defun compiler-macroexpand (form &optional env)
  (let ((expanded-p nil))
    (loop
      (multiple-value-bind (expansion exp-p) (compiler-macroexpand-1 form env)
        (if exp-p
            (setf form expansion expanded-p t)
            (return))))
    (values form expanded-p)))

(defvar *local-variables* ())

(defun find-varspec (sym)
  (dolist (varspec *local-variables*)
    (when (eq sym (car varspec))
      (return varspec))))

(defun precompile1 (form)
  (cond ((symbolp form)
         (let ((varspec (find-varspec form)))
           (if (and varspec (eq (second varspec) :symbol-macro))
               (third varspec)
               form)))
        ((atom form)
         form)
        (t
         (let ((op (car form))
               handler)
           (when (symbolp op)
             (cond ((local-macro-function op)
                    (let ((result (expand-local-macro (precompile-cons form))))
                      (return-from precompile1
                                   (if (equal result form)
                                       result
                                       (precompile1 result)))))
                   ((compiler-macro-function op)
                    (let ((result (compiler-macroexpand form)))
                      ;; Fall through if no change...
                      (unless (equal result form)
                        (return-from precompile1 (precompile1 result)))))
                   ((setf handler (get op 'precompile-handler))
                    (return-from precompile1 (funcall handler form)))
                   ((macro-function op)
                    (return-from precompile1 (precompile1 (expand-macro form))))
                   ((special-operator-p op)
                    (error "PRECOMPILE1: unsupported special operator ~S." op))))
           (precompile-cons form)))))

(defun precompile-identity (form)
  (declare (optimize speed (safety 0)))
  form)

(defun precompile-cons (form)
  (cons (car form) (mapcar #'precompile1 (cdr form))))

(defun precompile-block (form)
  (let ((args (cdr form)))
    (if (null (cdr args))
        nil
        (list* 'BLOCK (car args) (mapcar #'precompile1 (cdr args))))))

(defun precompile-dolist (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      (cons 'DOLIST (cons (cadr form) (mapcar #'precompile1 (cddr form))))))

(defun precompile-dotimes (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      (cons 'DOTIMES (cons (cadr form) (mapcar #'precompile1 (cddr form))))))

(defun precompile-do/do*-vars (varlist)
  (let ((result nil))
    (dolist (varspec varlist)
      (if (atom varspec)
          (push varspec result)
          (case (length varspec)
            (1
             (push (car varspec) result))
            (2
             (let* ((var (car varspec))
                    (init-form (cadr varspec)))
               (unless (symbolp var)
                 (error 'type-error))
               (push (list var (precompile1 init-form))
                     result)))
            (3
             (let* ((var (car varspec))
                    (init-form (cadr varspec))
                    (step-form (caddr varspec)))
               (unless (symbolp var)
                 (error 'type-error))
               (push (list var (precompile1 init-form) (precompile1 step-form))
                     result))))))
    (nreverse result)))

(defun precompile-do/do*-end-form (end-form)
  (let ((end-test-form (car end-form))
        (result-forms (cdr end-form)))
    (list* end-test-form (mapcar #'precompile1 result-forms))))

(defun precompile-do/do* (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      (list* (car form)
             (precompile-do/do*-vars (cadr form))
             (precompile-do/do*-end-form (caddr form))
             (mapcar #'precompile1 (cdddr form)))))

(defun precompile-do-symbols (form)
  (list* (car form) (cadr form) (mapcar #'precompile1 (cddr form))))

(defun precompile-load-time-value (form)
  form)

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

(defun precompile-setf (form)
  (let ((place (second form)))
    (cond ((and (consp place)
                (local-macro-function (car place)))
           (let ((expansion (expand-local-macro place)))
             (precompile1 (list* 'SETF expansion (cddr form)))))
          ((and (consp place)
                (eq (car place) 'VALUES))
           (setf form
                 (list* 'SETF
                        (list* 'VALUES
                               (mapcar #'precompile1 (cdr place)))
                        (cddr form)))
           (precompile1 (expand-macro form)))
          ((symbolp place)
           (let ((varspec (find-varspec place)))
             (if (and varspec (eq (second varspec) :symbol-macro))
                 (precompile1 (list* 'SETF (third varspec) (cddr form)))
                 (precompile1 (expand-macro form)))))
          (t
           (precompile1 (expand-macro form))))))

(defun precompile-setq (form)
  (let* ((args (cdr form))
         (len (length args)))
    (when (oddp len)
      (error 'simple-program-error
             :format-control "Odd number of arguments to SETQ."))
    (if (= len 2)
        (let* ((sym (car args))
               (val (cadr args))
               (varspec (find-varspec sym)))
          (if (and varspec (eq (second varspec) :symbol-macro))
              (precompile1 (list 'SETF (third varspec) val))
              (list 'SETQ sym (precompile1 val))))
        (let ((result ()))
          (loop
            (when (null args)
              (return))
            (push (precompile-setq (list 'SETQ (car args) (cadr args))) result)
            (setq args (cddr args)))
          (setq result (nreverse result))
          (push 'PROGN result)
          result))))

(defun precompile-psetf (form)
  (setf form
        (list* 'PSETF
               (mapcar #'precompile1 (cdr form))))
  (precompile1 (expand-macro form)))

(defun precompile-psetq (form)
  ;; Make sure all the vars are symbols.
  (do* ((rest (cdr form) (cddr rest))
        (var (car rest)))
       ((null rest))
    (unless (symbolp var)
      (error 'simple-error
             :format-control "~S is not a symbol."
             :format-arguments (list var))))
  ;; Delegate to PRECOMPILE-PSETF so symbol macros are handled correctly.
  (precompile-psetf form))

(defun maybe-rewrite-lambda (form)
  (let* ((args (cdr form))
         (lambda-list (car args))
         (body (cdr args))
         (auxvars (memq '&AUX lambda-list)))
    (when auxvars
      (setf lambda-list (subseq lambda-list 0 (position '&AUX lambda-list)))
      (setf body (list (append (list 'LET* (cdr auxvars)) body))))
    (let ((specials ()))
      (dolist (var lambda-list)
        (when (consp var)
          (if (consp (first var))
              (setf var (second (first var)))   ;; e.g. "&key ((:x *x*) 42)"
              (setf var (first var))))          ;; e.g. "&optional (*x* 42)"
        (when (special-variable-p var)
          (push var specials)))
      (when specials
        (dolist (special specials)
          (let ((sym (gensym)))
            (let ((res ()))
              (dolist (var lambda-list)
                (cond ((and (consp var) (consp (first var))
                            (eq special (second (first var))))
                       (push (list (list (first (first var)) sym) (second var)) res))
                      ((and (consp var) (eq special (first var)))
                       (push (cons sym (cdr var)) res))
                      ((eq var special)
                       (push sym res))
                      (t
                       (push var res))))
              (setf lambda-list (nreverse res)))
            (setf body (list (append (list 'LET* (list (list special sym))) body)))))))
    (list* 'LAMBDA lambda-list (mapcar #'precompile1 body))))

(defun precompile-lambda (form)
  (maybe-rewrite-lambda form))

(defun define-local-macro (name lambda-list body)
  (let* ((form (gensym))
         (env (gensym))
         (body (sys::parse-defmacro lambda-list form body name 'macrolet
                                    :environment env))
         (expander `(lambda (,form ,env) (block ,name ,body)))
         (compiled-expander (sys::%compile nil expander)))
    (sys::coerce-to-function (or compiled-expander expander))))

(defvar *local-functions-and-macros* ())

(defun local-macro-function (name)
  (getf *local-functions-and-macros* name))

(defun expand-local-macro (form)
  (let ((expansion (funcall (local-macro-function (car form)) form nil)))
    ;; If the expansion turns out to be a bare symbol, wrap it with PROGN so it
    ;; won't be mistaken for a tag in an enclosing TAGBODY.
    (if (symbolp expansion)
        (list 'progn expansion)
        expansion)))

(defun precompile-macrolet (form)
  (let ((*local-functions-and-macros* *local-functions-and-macros*)
        (macros (cadr form)))
    (dolist (macro macros)
      (let ((name (car macro))
            (lambda-list (cadr macro))
            (forms (cddr macro)))
        (push (define-local-macro name lambda-list forms) *local-functions-and-macros*)
        (push name *local-functions-and-macros*)))
    ;; FIXME Process declarations!
    (let ((body (sys::parse-body (cddr form) nil)))
      (list* 'PROGN (mapcar #'precompile1 body)))))

;; "If the restartable-form is a list whose car is any of the symbols SIGNAL,
;; ERROR, CERROR, or WARN (or is a macro form which macroexpands into such a
;; list), then WITH-CONDITION-RESTARTS is used implicitly to associate the
;; indicated restarts with the condition to be signaled." So we need to
;; precompile the restartable form before macroexpanding RESTART-CASE.
(defun precompile-restart-case (form)
  (let ((new-form (list* 'RESTART-CASE (precompile1 (cadr form)) (cddr form))))
    (precompile1 (macroexpand new-form))))

(defun precompile-symbol-macrolet (form)
  (let ((*local-variables* *local-variables*)
        (defs (cadr form)))
    (dolist (def defs)
      (let ((sym (car def))
            (expansion (cadr def)))
        (when (special-variable-p sym)
          (error 'program-error
                 :format-control "Attempt to bind the special variable ~S with SYMBOL-MACROLET."
                 :format-arguments (list sym)))
        (push (list sym :symbol-macro expansion) *local-variables*)))
    (multiple-value-bind (body decls) (sys::parse-body (cddr form) nil)
      (when decls
        (let ((specials ()))
          (dolist (decl decls)
            (when (eq (car decl) 'DECLARE)
              (dolist (declspec (cdr decl))
                (when (eq (car declspec) 'SPECIAL)
                  (setf specials (append specials (cdr declspec)))))))
          (when specials
            (let ((syms (mapcar #'car (cadr form))))
              (dolist (special specials)
                (when (memq special syms)
                  (error 'program-error
                         :format-control "~S is a symbol-macro and may not be declared special."
                         :format-arguments (list special))))))))
      (list* 'PROGN (mapcar #'precompile1 body)))))

(defun precompile-let/let*-vars (vars)
  (let ((result nil))
    (dolist (var vars)
      (cond ((consp var)
             (let ((v (car var))
                   (expr (cadr var)))
               (unless (symbolp v)
                 (error 'simple-type-error
                        :format-control "The variable ~S is not a symbol."
                        :format-arguments (list v)))
               (push (list v (precompile1 expr)) result)
               (push (list v :variable) *local-variables*)))
            (t
             (push var result)
             (push (list var :variable) *local-variables*))))
    (nreverse result)))

(defun precompile-let (form)
  (let ((*local-variables* *local-variables*))
    (list* 'LET
           (precompile-let/let*-vars (cadr form))
           (mapcar #'precompile1 (cddr form)))))

;; (LET* ((X 1)) (LET* ((Y 2)) (LET* ((Z 3)) (+ X Y Z)))) =>
;; (LET* ((X 1) (Y 2) (Z 3)) (+ X Y Z))
(defun maybe-fold-let* (form)
  (if (and (= (length form) 3)
           (consp (third form))
           (eq (car (third form)) 'let*))
      (let ((third (maybe-fold-let* (third form))))
        (list* 'LET* (append (second form) (second third)) (cddr third)))
      form))

(defun precompile-let* (form)
  (setf form (maybe-fold-let* form))
  (let ((*local-variables* *local-variables*))
    (list* 'LET*
           (precompile-let/let*-vars (cadr form))
           (mapcar #'precompile1 (cddr form)))))

(defun precompile-case (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      (let* ((keyform (cadr form))
             (clauses (cddr form))
             (result (list (precompile1 keyform))))
        (dolist (clause clauses)
          (push (precompile-case-clause clause) result))
        (cons (car form) (nreverse result)))))

(defun precompile-case-clause (clause)
  (let ((keys (car clause))
        (forms (cdr clause)))
    (cons keys (mapcar #'precompile1 forms))))

(defun precompile-cond (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      (let ((clauses (cdr form))
            (result nil))
        (dolist (clause clauses)
          (push (precompile-cond-clause clause) result))
        (cons 'COND (nreverse result)))))

(defun precompile-cond-clause (clause)
  (let ((test (car clause))
        (forms (cdr clause)))
    (cons (precompile1 test) (mapcar #'precompile1 forms))))

(defun precompile-local-function-def (def)
  (let ((name (car def))
        (arglist (cadr def))
        (body (cddr def)))
    ;; Macro names are shadowed by local functions.
    (push nil *local-functions-and-macros*)
    (push name *local-functions-and-macros*)
    (list* name arglist (mapcar #'precompile1 body))))

(defun precompile-local-functions (defs)
  (let ((result nil))
    (dolist (def defs (nreverse result))
      (push (precompile-local-function-def def) result))))

(defun find-use (name expression)
  (cond ((atom expression)
         nil)
        ((eq (car expression) name)
         t)
        ((consp name)
         t) ;; FIXME Recognize use of SETF functions!
        (t
         (or (find-use name (car expression))
             (find-use name (cdr expression))))))

(defun precompile-flet/labels (form)
  (let ((*local-functions-and-macros* *local-functions-and-macros*)
        (operator (car form))
        (locals (cadr form))
        (body (cddr form)))
    (dolist (local locals)
      (let* ((name (car local))
             (used-p (find-use name body)))
        (unless used-p
          (when (eq operator 'LABELS)
            (dolist (local locals)
              (when (neq name (car local))
                (when (find-use name (cddr local))
                  (setf used-p t)
                  (return))
                ;; Scope of defined function names includes &AUX parameters (LABELS.7B).
                (let ((aux-vars (cdr (memq '&aux (cadr local)))))
                  (when (and aux-vars (find-use name aux-vars)
                             (setf used-p t)
                             (return))))))))
        (unless used-p
          (format t "; Note: deleting unused local function ~A ~S~%" operator name)
          (let* ((new-locals (remove local locals :test 'eq))
                 (new-form
                  (if new-locals
                      (list* operator new-locals body)
                      (list* 'PROGN body))))
            (return-from precompile-flet/labels (precompile1 new-form))))))
    (list* (car form)
           (precompile-local-functions locals)
           (mapcar #'precompile1 body))))

(defun precompile-function (form)
  (if (and (consp (cadr form)) (eq (caadr form) 'LAMBDA))
      (list 'FUNCTION (maybe-rewrite-lambda (cadr form)))
      form))

(defun precompile-if (form)
  (let ((args (cdr form)))
    (case (length args)
      (2
       (let ((test (precompile1 (car args))))
         (cond ((null test)
                nil)
               ((constantp test)
                (precompile1 (cadr args)))
               (t
                (list 'IF
                      test
                      (precompile1 (cadr args)))))))
      (3
       (let ((test (precompile1 (car args))))
         (cond ((null test)
                (precompile1 (caddr args)))
               ((constantp test)
                (precompile1 (cadr args)))
               (t
                (list 'IF
                      test
                      (precompile1 (cadr args))
                      (precompile1 (caddr args)))))))
      (t
       (error "wrong number of arguments for IF")))))

(defun precompile-when (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      (precompile-cons form)))

(defun precompile-unless (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      (precompile-cons form)))

(defun precompile-and (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      (precompile-cons form)))

(defun precompile-or (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      (precompile-cons form)))

;; MULTIPLE-VALUE-BIND is handled explicitly by the JVM compiler.
(defun precompile-multiple-value-bind (form)
  (let ((vars (cadr form))
        (values-form (caddr form))
        (body (cdddr form)))
    (list* 'MULTIPLE-VALUE-BIND
           vars
           (precompile1 values-form)
           (mapcar #'precompile1 body))))

;; MULTIPLE-VALUE-LIST is handled explicitly by the JVM compiler.
(defun precompile-multiple-value-list (form)
  (list 'MULTIPLE-VALUE-LIST (precompile1 (cadr form))))

(defun precompile-nth-value (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      form))

(defun precompile-return (form)
  (if *in-jvm-compile*
      (precompile1 (macroexpand form))
      (list 'RETURN (precompile1 (cadr form)))))

(defun precompile-return-from (form)
  (list 'RETURN-FROM (cadr form) (precompile1 (caddr form))))

(defun precompile-tagbody (form)
  (do ((body (cdr form) (cdr body))
       (result ()))
      ((null body) (cons 'TAGBODY (nreverse result)))
    (if (atom (car body))
        (push (car body) result)
        (push (precompile1 (car body)) result))))

(defun precompile-eval-when (form)
  (list* 'EVAL-WHEN (cadr form) (mapcar #'precompile1 (cddr form))))

(defun precompile-the (form)
  (precompile1 (caddr form)))

(defun precompile-unwind-protect (form)
  (list* 'UNWIND-PROTECT
         (precompile1 (cadr form))
         (mapcar #'precompile1 (cddr form))))

;; EXPAND-MACRO is like MACROEXPAND, but EXPAND-MACRO quits if *IN-JVM-COMPILE*
;; is false and a macro is encountered that is also implemented as a special
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

(defun precompile-form (form in-jvm-compile)
  (let ((*in-jvm-compile* in-jvm-compile)
        (*local-functions-and-macros* ()))
    (precompile1 form)))

(defun install-handler (fun &optional handler)
  (let ((handler (or handler
                     (find-symbol (sys::%format nil "PRECOMPILE-~A" (symbol-name fun))
                                  'precompiler))))
    (unless (and handler (fboundp handler))
      (error "No handler for ~S." fun))
    (setf (get fun 'precompile-handler) handler)))

(mapcar #'install-handler '(and
                            block
                            case
                            cond
                            dolist
                            dotimes
                            eval-when
                            function
                            if
                            lambda
                            macrolet
                            multiple-value-bind
                            multiple-value-list
                            nth-value
                            or
                            progn
                            progv
                            psetf
                            psetq
                            restart-case
                            return
                            return-from
                            setf
                            setq
                            symbol-macrolet
                            tagbody
                            the
                            unwind-protect
                            unless
                            when))

(install-handler 'ecase                'precompile-case)

(install-handler 'catch                'precompile-cons)
(install-handler 'locally              'precompile-cons)
(install-handler 'multiple-value-call  'precompile-cons)
(install-handler 'multiple-value-prog1 'precompile-cons)

(install-handler 'do                   'precompile-do/do*)
(install-handler 'do*                  'precompile-do/do*)

(install-handler 'let                  'precompile-let)
(install-handler 'let*                 'precompile-let*)

(install-handler 'flet                 'precompile-flet/labels)
(install-handler 'labels               'precompile-flet/labels)

(install-handler 'load-time-value      'precompile-load-time-value)

(install-handler 'declare              'precompile-identity)
(install-handler 'defmethod            'precompile-identity)
(install-handler 'defun                'precompile-identity)
(install-handler 'go                   'precompile-identity)
(install-handler 'quote                'precompile-identity)
(install-handler 'throw                'precompile-cons)

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
;;                (format t "; No lambda expression available for ~S.~%" name)
               (return-from precompile (values nil t t)))
             (when closure-p
               (format t "; Unable to compile function ~S defined in non-null lexical environment.~%" name)
               (finish-output)
               (return-from precompile (values nil t t)))
             (setq expr form)))
          ((and (consp definition) (eq (car definition) 'lambda))
           (setq expr definition))
          (t
;;            (error 'type-error)))
           (format t "Unable to precompile ~S.~%" name)
           (return-from precompile (values nil t t))))
    (setf result (coerce-to-function (precompile-form expr nil)))
    (when (and name (functionp result))
      (%set-lambda-name result name)
      (%set-call-count result (%call-count definition))
      (if (and (symbolp name) (macro-function name))
          (let ((mac (make-macro result)))
            (%set-arglist mac (arglist (symbol-function name)))
            (setf (fdefinition name) mac))
          (progn
            (setf (fdefinition name) result)
            (%set-arglist result (arglist definition)))))
    (values (or name result) nil nil)))

(defun precompile-package (pkg &key verbose)
  (dolist (sym (package-symbols pkg))
    (when (fboundp sym)
      (unless (special-operator-p sym)
        (let ((f (fdefinition sym)))
          (unless (compiled-function-p f)
            (when verbose
              (format t "Precompiling ~S~%" sym)
              (finish-output))
            (precompile sym))))))
  t)

(defun %compile (name definition)
  (if (and name (fboundp name) (%typep (symbol-function name) 'generic-function))
      (values name nil nil)
      (precompile name definition)))

;; Redefine EVAL to precompile its argument.
(defun eval (form)
  (%eval (precompile-form form nil)))

;; Redefine DEFMACRO to precompile the expansion function on the fly.
(defmacro defmacro (name lambda-list &rest body)
  (let* ((form (gensym))
         (env (gensym))
         (body (parse-defmacro lambda-list form body name 'defmacro
                               :environment env))
         (expander `(lambda (,form ,env) (block ,name ,body))))
    `(progn
       (let ((macro (make-macro (or (precompile nil ,expander) ,expander))))
         (if (special-operator-p ',name)
             (%put ',name 'macroexpand-macro macro)
             (fset ',name macro))
         (%set-arglist macro ',lambda-list)
         ',name))))

;; Make an exception just this one time...
(when (get 'defmacro 'macroexpand-macro)
  (fset 'defmacro (get 'defmacro 'macroexpand-macro))
  (remprop 'defmacro 'macroexpand-macro))

;; Redefine DEFUN to precompile the definition on the fly.
(defmacro defun (name lambda-list &rest body &environment env)
  (when (and env (empty-environment-p env))
    (setf env nil))
  `(progn
     (%defun ',name ',lambda-list ',body ,env)
     (precompile ',name)
     ',name))
