;;; compile-file.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: compile-file.lisp,v 1.10 2004-04-19 17:56:42 piso Exp $
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

(require 'jvm)

(defvar *fbound-names*)

(defvar *class-number*)

(defun next-classfile-name ()
  (let ((name (format nil "~A-~D"
                      (pathname-name *compile-file-pathname*)
                      (incf *class-number*))))
    (namestring (merge-pathnames (make-pathname :name name :type "cls")
                                 *compile-file-pathname*))))

;; Dummy function. Should never be called.
(defun dummy () (assert nil))

(defun process-toplevel-form (form stream compile-time-too)
  (cond ((atom form)
         (when compile-time-too
           (eval form)))
        (t
         (case (car form)
           ((IN-PACKAGE DEFPACKAGE)
            (eval form))
           ((DEFVAR DEFPARAMETER)
            (if compile-time-too
                (eval form)
                ;; "If a DEFVAR or DEFPARAMETER form appears as a top level form,
                ;; the compiler must recognize that the name has been proclaimed
                ;; special. However, it must neither evaluate the initial-value
                ;; form nor assign the dynamic variable named NAME at compile
                ;; time."
                (let ((name (second form)))
                  (%defvar name))))
           (DEFUN
            (let ((name (second form)))
              (%format t "; Processing function ~A~%" name)
              (let* ((lambda-list (third form))
                     (body (nthcdr 3 form))
                     (expr (list 'lambda lambda-list (list* 'block name body)) nil)
                     (classfile-name (next-classfile-name))
                     (classfile (ignore-errors
                                 (jvm:compile-defun nil expr nil classfile-name)))
                     (compiled-function (and classfile
                                             (ignore-errors
                                              (load-compiled-function classfile)))))
                (if compiled-function
                    (progn
                      (%format t ";  ~A => ~A.cls~%" name
                               (pathname-name (pathname classfile-name)))
                      (setf form
                            `(fset ',name (load-compiled-function ,classfile)))
                      (when compile-time-too
                        (fset name compiled-function)))
                    (progn
                      (%format t ";  Unable to compile function ~A~%" name)
                      (when compile-time-too
                        (eval form))))
                (push name jvm::*toplevel-defuns*)
                ;; If NAME is not fbound, provide a dummy definition so that
                ;; getSymbolFunctionOrDie() will succeed when we try to verify that
                ;; functions defined later in the same file can be loaded correctly.
                (unless (fboundp name)
                  (%format t "; Installing dummy function for ~A~%" name)
                  (setf (symbol-function name) #'dummy)
                  (push name *fbound-names*)))))
           (DEFMACRO
            (let ((name (second form)))
              (%format t "; Processing macro ~A~%" name)
              (eval form)
              (let* ((expr (function-lambda-expression (macro-function name)))
                     (classfile-name (next-classfile-name))
                     (classfile
                      (ignore-errors
                       (jvm:compile-defun nil expr nil classfile-name))))
                (if (and classfile
                         (ignore-errors (load-compiled-function classfile)))
                    (progn
                      (%format t ";  Macro ~A => ~A.cls~%" name
                               (pathname-name (pathname classfile-name)))
                      (setf form
                            (if (special-operator-p name)
                                `(%put ',name 'macroexpand-macro
                                       (make-macro (load-compiled-function
                                                    ,classfile)))
                                `(fset ',name
                                       (make-macro (load-compiled-function
                                                    ,classfile))))))
                    (%format t ";  Unable to compile macro ~A~%" name)))))
           (EVAL-WHEN
            (multiple-value-bind (ct lt e) (parse-eval-when-situations (cadr form))
              (%format t "; Processing EVAL-WHEN ~S~%" (cadr form))
              (let ((new-compile-time-too (or ct
                                              (and compile-time-too e)))
                    (body (cddr form)))
                (cond (lt
                       (process-toplevel-progn body stream new-compile-time-too))
                      (new-compile-time-too
                       (eval `(progn ,@body)))))
              (%format t "; Finished processing EVAL-WHEN ~S~%" (cadr form))
              (return-from process-toplevel-form)))
           (PROGN
            (process-toplevel-progn (cdr form) stream compile-time-too)
            (return-from process-toplevel-form))
           (t
            (when (macro-function (car form))
              (process-toplevel-form (macroexpand-1 form) stream compile-time-too)
              (return-from process-toplevel-form))
            (when compile-time-too
              (eval form))))))
  (when (and (consp form) (neq (car form) 'QUOTE))
    (let ((*print-level* nil)
          (*print-length* nil))
      (write form :stream stream))
    (terpri stream)))

(defun process-toplevel-progn (forms stream compile-time-too)
  (dolist (form forms)
    (process-toplevel-form form stream compile-time-too)))

;;; Adapted from SBCL.
;;; Parse an EVAL-WHEN situations list, returning three flags,
;;; (VALUES COMPILE-TOPLEVEL LOAD-TOPLEVEL EXECUTE), indicating
;;; the types of situations present in the list.
(defun parse-eval-when-situations (situations)
  (when (or (not (listp situations))
	    (set-difference situations
			    '(:compile-toplevel
			      compile
			      :load-toplevel
			      load
			      :execute
			      eval)))
    (error "Bad EVAL-WHEN situation list: ~S." situations))
  (values (intersection '(:compile-toplevel compile) situations)
	  (intersection '(:load-toplevel load) situations)
	  (intersection '(:execute eval) situations)))

;; Adapted from SBCL.
(defun cfp-output-file-default (input-file)
  (let* ((defaults (merge-pathnames input-file *default-pathname-defaults*))
	 (retyped (make-pathname :type *compile-file-type* :defaults defaults)))
    retyped))

(defun compile-file-pathname (input-file
                              &key
                              (output-file (cfp-output-file-default
                                            input-file))
                              &allow-other-keys)
  (merge-pathnames output-file (merge-pathnames input-file)))

(defun compile-file (input-file &key output-file verbose print external-format)
  (unless output-file
    (setf output-file (compile-file-pathname input-file)))
  (with-open-file (in input-file :direction :input)
    (let ((*compile-file-pathname* (pathname in))
          (*compile-file-truename* (truename in))
          (*class-number* 0)
          (namestring (namestring *compile-file-truename*))
          (start (get-internal-real-time))
          elapsed)
      (%format t "; Compiling ~A ...~%" namestring)
      (with-open-file (out output-file :direction :output :if-exists :supersede)
        (let ((*readtable* *readtable*)
              (*package* *package*)
              (jvm::*toplevel-defuns* ())
              (*fbound-names* ()))
          (write (list 'init-fasl :version *fasl-version*) :stream out)
          (terpri out)
          (loop
            (let ((form (read in nil in)))
              (when (eq form in)
                (return))
              (process-toplevel-form form out nil)))
          (dolist (name *fbound-names*)
            (%format t "; Removing dummy function for ~A~%" name)
            (fmakunbound name))))
      (setf elapsed (/ (- (get-internal-real-time) start) 1000.0))
      (%format t "; Compiled ~A (~A seconds)~%" namestring elapsed)))
  (values (truename output-file) nil nil))
