;;; boot.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: boot.lisp,v 1.145 2004-02-01 16:49:35 piso Exp $
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

(sys::%in-package "COMMON-LISP")

(setq ext:*autoload-verbose* nil)
(setq *load-verbose* nil)

(defmacro in-package (name)
  (list 'sys::%in-package (string name)))

(defmacro lambda (lambda-list &rest body)
  (list 'function (list* 'lambda lambda-list body)))

(defmacro when (pred &rest body)
  (list 'if pred (if (> (length body) 1)
                     (append '(progn) body)
                     (car body))))

(defmacro unless (pred &rest body)
  (list 'if (list 'not pred) (if (> (length body) 1)
                                 (append '(progn) body)
                                 (car body))))

(defmacro defun (name lambda-list &rest body)
  (list 'sys::%defun (list 'QUOTE name) (list 'QUOTE lambda-list) (list 'QUOTE body)))

(defmacro defconstant (name initial-value &optional docstring)
  (list 'sys::%defconstant (list 'QUOTE name) initial-value docstring))

(defmacro defparameter (name initial-value &optional docstring)
  (list 'sys::%defparameter (list 'QUOTE name) initial-value docstring))

;; CLASS-NAME is redefined as a generic function when CLOS is loaded.
(defun class-name (class)
  (sys::%class-name class))

(sys::%load "autoloads.lisp")
(sys::%load "early-defuns.lisp")
(sys::%load "backquote.lisp")
(sys::%load "setf.lisp")
(sys::%load "documentation.lisp")

(defmacro defvar (var &optional (val nil valp) (doc nil docp))
  `(progn
     (sys::%defvar ',var)
     ,@(when valp
	 `((unless (boundp ',var)
	     (setq ,var ,val))))
     ,@(when docp
         `((setf (documentation ',var 'variable) ',doc)))
     ',var))


(defvar *features*
  '(:armedbear))


(defun make-package (package-name &key nicknames use)
  (sys::%make-package package-name nicknames use))


;;; READ-CONDITIONAL (from OpenMCL)

(defconstant *keyword-package*
  (find-package "KEYWORD"))

(defun read-conditional (stream subchar int)
  (cond (*read-suppress*
         (read stream t nil t)
         (values))
        ((eql subchar (read-feature stream))
         (read stream t nil t))
        (t
         (let ((*read-suppress* t))
           (read stream t nil t)
           (values)))))

(defun read-feature (stream)
  (let* ((f (let* ((*package* *keyword-package*))
              (read stream t nil t))))
    (labels ((eval-feature (form)
                           (cond ((atom form)
                                  (ext:memql form *features*))
                                 ((eq (car form) :not)
                                  (not (eval-feature (cadr form))))
                                 ((eq (car form) :and)
                                  (dolist (subform (cdr form) t)
                                    (unless (eval-feature subform) (return))))
                                 ((eq (car form) :or)
                                  (dolist (subform (cdr form) nil)
                                    (when (eval-feature subform) (return t))))
                                 (t (error "READ-FEATURE")))))
            (if (eval-feature f) #\+ #\-))))

(set-dispatch-macro-character #\# #\+ #'read-conditional)
(set-dispatch-macro-character #\# #\- #'read-conditional)

(defvar jvm::*auto-compile* nil)
(export 'jvm::*auto-compile* "JVM")

(defun compile (name &optional definition)
  (values (if name name definition) nil nil))

(sys::%load "macros.lisp")
(sys::%load "fixme.lisp")
(sys::%load "destructuring-bind.lisp")
(sys::%load "arrays.lisp")
(sys::%load "compiler-macro.lisp")
(sys::%load "precompiler.lisp")

(sys::precompile-package "PRECOMPILER")
(sys::precompile-package "EXTENSIONS")
(sys::precompile-package "SYSTEM")
(sys::precompile-package "COMMON-LISP")

(sys::%load "signal.lisp")
(sys::%load "list.lisp")
(sys::%load "sequences.lisp")
(sys::%load "error.lisp")
(sys::%load "defpackage.lisp")
(sys::%load "define-modify-macro.lisp")

;;; PROVIDE, REQUIRE (from SBCL)
(defun provide (module-name)
  (pushnew (string module-name) *modules* :test #'string=)
  t)

(defun require (module-name &optional pathnames)
  (unless (member (string module-name) *modules* :test #'string=)
    (let ((saved-modules (copy-list *modules*)))
      (cond (pathnames
             (unless (listp pathnames) (setf pathnames (list pathnames)))
             (dolist (x pathnames)
               (load x)))
            (t
             (sys::%load (concatenate 'string (string-downcase (string module-name))
                                      ".lisp"))))
      (set-difference *modules* saved-modules))))

(defun read-from-string (string &optional eof-error-p eof-value
				&key (start 0) end preserve-whitespace)
  (sys::%read-from-string string eof-error-p eof-value start end preserve-whitespace))

(defconstant lambda-list-keywords
  '(&optional &rest &key &aux &body &whole &allow-other-keys &environment))

(defconstant call-arguments-limit 50)

(defconstant lambda-parameters-limit 50)

(defconstant multiple-values-limit 20)

(defconstant char-code-limit 128)

(defconstant internal-time-units-per-second 1000)

(defconstant boole-clr    0)
(defconstant boole-set    1)
(defconstant boole-1      2)
(defconstant boole-2      3)
(defconstant boole-c1     4)
(defconstant boole-c2     5)
(defconstant boole-and    6)
(defconstant boole-ior    7)
(defconstant boole-xor    8)
(defconstant boole-eqv    9)
(defconstant boole-nand  10)
(defconstant boole-nor   11)
(defconstant boole-andc1 12)
(defconstant boole-andc2 13)
(defconstant boole-orc1  14)
(defconstant boole-orc2  15)


;; AND, OR (from CMUCL)

(defmacro and (&rest forms)
  (cond ((endp forms) t)
	((endp (rest forms)) (first forms))
	(t
	 `(if ,(first forms)
	      (and ,@(rest forms))
	      nil))))

(defmacro or (&rest forms)
  (cond ((endp forms) nil)
	((endp (rest forms)) (first forms))
	(t
	 (let ((n-result (gensym)))
	   `(let ((,n-result ,(first forms)))
	      (if ,n-result
		  ,n-result
		  (or ,@(rest forms))))))))

(sys::%load "case.lisp")

(defmacro cond (&rest clauses)
  (if (endp clauses)
      nil
      (let ((clause (first clauses)))
	(when (atom clause)
	  (error "COND clause is not a list: ~S" clause))
	(let ((test (first clause))
	      (forms (rest clause)))
	  (if (endp forms)
	      (let ((n-result (gensym)))
		`(let ((,n-result ,test))
		   (if ,n-result
		       ,n-result
		       (cond ,@(rest clauses)))))
	      `(if ,test
		   (progn ,@forms)
		   (cond ,@(rest clauses))))))))

(defmacro dotimes ((var count &optional (result nil)) &body body)
  (if (numberp count)
      (let ((tag (gensym)))
        `(block nil
           (let ((,var 0))
             (tagbody
              ,tag
              (if (>= ,var ,count)
                  (return-from nil (progn ,result)))
              ,@body
              (setq ,var (1+ ,var))
              (go ,tag)))))
      (let ((limit (gensym))
            (tag (gensym)))
        `(block nil
           (let ((,limit ,count)
                 (,var 0))
             (tagbody
              ,tag
              (if (>= ,var ,limit)
                  (return-from nil (progn ,result)))
              ,@body
              (setq ,var (1+ ,var))
              (go ,tag)))))))

;;; DOLIST (from CMUCL)

;;; We repeatedly bind the var instead of setting it so that we never give the
;;; var a random value such as NIL (which might conflict with a declaration).
;;; If there is a result form, we introduce a gratitous binding of the variable
;;; to NIL w/o the declarations, then evaluate the result form in that
;;; environment.  We spuriously reference the gratuitous variable, since we
;;; don't want to use IGNORABLE on what might be a special var.
;;;
(defmacro dolist ((var list &optional (result nil)) &body body)
  (multiple-value-bind (forms decls)
    (sys::parse-body body nil nil)
    (let ((n-list (gensym)))
      `(do* ((,n-list ,list (cdr ,n-list)))
	    ((endp ,n-list)
	     ,@(if (constantp result)
		   `(,result)
		   `((let ((,var nil))
		       ,@decls
		       ,var
		       ,result))))
         (let ((,var (car ,n-list)))
           ,@decls
           (tagbody
            ,@forms))))))

(defmacro do-symbols ((var &optional (package '*package*) (result nil)) &body body)
  `(dolist (,var
            (append (sys::package-symbols ,package)
                    (sys::package-inherited-symbols ,package))
            ,result)
     ,@body))

(defmacro do-external-symbols ((var &optional (package '*package*) (result nil)) &body body)
  `(dolist (,var (sys::package-external-symbols ,package) ,result) ,@body))

;;; MULTIPLE-VALUE-BIND (from CLISP)
(defmacro multiple-value-bind (varlist form &body body)
  (let ((g (gensym))
        (poplist nil))
    (dolist (var varlist) (setq poplist (cons `(,var (pop ,g)) poplist)))
    `(let* ((,g (multiple-value-list ,form)) ,@(nreverse poplist))
           ,@body)))

(sys::%load "late-setf.lisp")

;; MULTIPLE-VALUE-SETQ (from CMUCL)
(defmacro multiple-value-setq (varlist value-form)
  (unless (and (listp varlist) (every #'symbolp varlist))
    (error "~S is not a list of symbols" varlist))
  `(values (setf (values ,@varlist) ,value-form)))

(sys::%load "restart.lisp")
(sys::%load "debug.lisp")
