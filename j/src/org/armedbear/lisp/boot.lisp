;;; boot.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: boot.lisp,v 1.106 2003-09-10 18:46:29 piso Exp $
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


(defmacro in-package (name)
  (list 'sys::%in-package (string name)))


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
  (cond (*read-suppress* (read stream t nil t) (values))
        ((eql subchar (read-feature stream)) (read stream t nil t))
        (t (let* ((*read-suppress* t))
             (read stream t nil t)
             (values)))))

(defun read-feature (stream)
  (let* ((f (let* ((*package* *keyword-package*))
              (read stream t nil t))))
    (labels ((eval-feature (form)
                           (cond ((atom form)
                                  (member form *features*))
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


(sys::%load "macros.lisp")
(sys::%load "fixme.lisp")
(sys::%load "destructuring-bind.lisp")
(sys::%load "arrays.lisp")
(sys::%load "compiler.lisp")
(sys::%load "list.lisp")
(sys::%load "sequences.lisp")
(sys::%load "error.lisp")
(sys::%load "defpackage.lisp")
(sys::%load "with-hash-table-iterator.lisp")
(sys::%load "with-package-iterator.lisp")
(sys::%load "debug.lisp")


(defpackage "JVM" (:use "COMMON-LISP" "EXTENSIONS"))


;;; PROVIDE, REQUIRE (from SBCL)
(defun provide (module-name)
  (pushnew (string module-name) *modules* :test #'string=)
  t)

(defun require (module-name &optional pathnames)
  (finish-output)
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


;; CASE (from CLISP)

(defun case-expand (form-name test keyform clauses)
  (let ((var (gensym)))
    `(let ((,var ,keyform))
       (cond
        ,@(maplist
           #'(lambda (remaining-clauses)
              (let ((clause (first remaining-clauses))
                    (remaining-clauses (rest remaining-clauses)))
                (unless (consp clause)
                  (error 'program-error "~S: missing key list" form-name))
                (let ((keys (first clause)))
                  `(,(cond ((or (eq keys 'T) (eq keys 'OTHERWISE))
                            (if remaining-clauses
                                (error 'program-error
                                       "~S: the ~S clause must be the last one"
                                       form-name keys)
                                't))
                           ((listp keys)
                            `(or ,@(mapcar #'(lambda (key)
                                              `(,test ,var ',key))
                                           keys)))
                           (t `(,test ,var ',keys)))
                     ,@(rest clause)))))
           clauses)))))

(defmacro case (keyform &rest clauses)
  (case-expand 'case 'eql keyform clauses))


;; CCASE (from CLISP)

(defun parenthesize-keys (clauses)
  ;; PARENTHESIZE-KEYS is necessary to avoid confusing
  ;; the symbols OTHERWISE and T used as keys, with the same
  ;; symbols used in the syntax of the non exhaustive CASE.
  (mapcar #'(lambda (c)
             (cond ((or (eq (car c) 't)
                        (eq (car c) 'otherwise))
                    (cons (list (car c)) (cdr c)))
                   (t c)))
          clauses))

(defmacro ccase (keyplace &rest clauses)
  (let ((g (gensym))
        (h (gensym)))
    `(block ,g
            (tagbody
             ,h
             (return-from ,g
                          (case ,keyplace
                            ,@(parenthesize-keys clauses)
                            (otherwise
                             (error 'type-error "CCASE error") ;; FIXME
                             (go ,h))))))))


;;; TYPECASE (from CLISP)

(defmacro typecase (keyform &rest typeclauselist)
  (let* ((tempvar (gensym))
         (condclauselist nil))
    (do ((typeclauselistr typeclauselist (cdr typeclauselistr)))
        ((atom typeclauselistr))
      (cond ((atom (car typeclauselistr))
             (error 'program-error
                    "invalid clause in ~S: ~S"
                    'typecase (car typeclauselistr)))
            ((let ((type (caar typeclauselistr)))
               (or (eq type T) (eq type 'OTHERWISE)))
             (push `(T ,@(or (cdar typeclauselistr) '(NIL))) condclauselist)
             (return))
            (t (push `((TYPEP ,tempvar (QUOTE ,(caar typeclauselistr)))
                       ,@(or (cdar typeclauselistr) '(NIL)))
                     condclauselist))))
    `(LET ((,tempvar ,keyform)) (COND ,@(nreverse condclauselist)))))


(defmacro etypecase (keyform &rest clauses)
  (let ((var (gensym)))
    `(let ((,var ,keyform))
       (typecase ,var
         ,@clauses
         (otherwise
          (error 'type-error "~S fell through ETYPECASE expression" ,var))))))


(defmacro ctypecase (keyplace &rest clauses)
  (let ((g (gensym))
        (h (gensym)))
    `(block ,g
            (tagbody
             ,h
             (return-from ,g
                          (typecase ,keyplace
                            ,@clauses
                            (otherwise
                             (error 'type-error "CTYPECASE error") ;; FIXME
                             (go ,h))))))))


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


;;; PROG, PROG* (from GCL)

(defmacro prog (vl &rest body &aux (decl nil))
  (do ()
      ((or (endp body)
           (not (consp (car body)))
           (not (eq (caar body) 'declare)))
       `(block nil (let ,vl ,@decl (tagbody ,@body))))
      (push (car body) decl)
      (pop body)))

(defmacro prog* (vl &rest body &aux (decl nil))
  (do ()
      ((or (endp body)
           (not (consp (car body)))
           (not (eq (caar body) 'declare)))
       `(block nil (let* ,vl ,@decl (tagbody ,@body))))
      (push (car body) decl)
      (pop body)))


;;; DOTIMES (from CMUCL)
(defmacro dotimes ((var count &optional (result nil)) &body body)
  (cond ((numberp count)
         `(do ((,var 0 (1+ ,var)))
              ((>= ,var ,count) ,result)
            ,@body))
        (t (let ((v1 (gensym)))
             `(do ((,var 0 (1+ ,var)) (,v1 ,count))
                  ((>= ,var ,v1) ,result)
                ,@body)))))


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
    (parse-body body nil nil)
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


;;; From CMUCL.

(defmacro with-output-to-string ((var &optional string &key element-type)
				 &body forms)
  "If STRING is specified, it must be a string with a fill pointer;
   the output is incrementally appended to the string (as if by use of
   VECTOR-PUSH-EXTEND)."
  (declare (ignore element-type))
  (if string
      `(let ((,var (sys::make-fill-pointer-output-stream ,string)))
	 (unwind-protect
          (progn ,@forms)
          (close ,var)))
      `(let ((,var (make-string-output-stream)))
	 (unwind-protect
          (progn ,@forms)
          (close ,var))
	 (get-output-stream-string ,var))))


(defmacro print-unreadable-object ((object stream &key type identity) &body body)
  `(let ((s ,stream)
         (obj ,object))
     (format s "#<")
     ,(when type
        '(format s "~S" (type-of obj)))
     ,(when (and type (or body identity))
        '(format s " "))
     ,@body
     ,(when (and identity body)
        '(format s " "))
     ,(when identity
        '(format s "@ ~A" (sys::hashcode-to-string obj)))
     (format s ">")
     nil))


;;; MULTIPLE-VALUE-BIND (from CLISP)

(defmacro multiple-value-bind (varlist form &body body)
  (let ((g (gensym))
        (poplist nil))
    (dolist (var varlist) (setq poplist (cons `(,var (pop ,g)) poplist)))
    `(let* ((,g (multiple-value-list ,form)) ,@(nreverse poplist))
           ,@body)))
