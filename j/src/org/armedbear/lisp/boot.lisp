;;; boot.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: boot.lisp,v 1.157 2004-03-31 03:05:38 piso Exp $
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

(format t "Low-level initialization completed in ~A seconds.~%"
        (float (/ (ext:uptime) 1000)))

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

(defmacro return (&optional result)
  (list 'return-from nil result))

(defmacro defun (name lambda-list &rest body)
  (list 'sys::%defun (list 'QUOTE name) (list 'QUOTE lambda-list) (list 'QUOTE body)))

(defmacro defconstant (name initial-value &optional docstring)
  (list 'sys::%defconstant (list 'QUOTE name) initial-value docstring))

(defmacro defparameter (name initial-value &optional docstring)
  (list 'sys::%defparameter (list 'QUOTE name) initial-value docstring))

;; CLASS-NAME is redefined as a generic function when CLOS is loaded.
(defun class-name (class)
  (sys::%class-name class))

(sys::load-system-file "autoloads")
(sys::load-system-file "early-defuns")
(sys::load-system-file "backquote")
(sys::load-system-file "setf")
(sys::load-system-file "documentation")

(defmacro defvar (var &optional (val nil valp) (doc nil docp))
  `(progn
     (sys::%defvar ',var)
     ,@(when valp
	 `((unless (boundp ',var)
	     (setq ,var ,val))))
     ,@(when docp
         `((sys::%set-documentation ',var 'variable ',doc)))
     ',var))

(defvar *features*
  '(:armedbear))

(defun make-package (package-name &key nicknames use)
  (sys::%make-package package-name nicknames use))

(defconstant *keyword-package*
  (find-package "KEYWORD"))

;;; READ-CONDITIONAL (from OpenMCL)
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

(sys::load-system-file "macros")
(sys::load-system-file "fixme")
(sys::load-system-file "destructuring-bind")
(sys::load-system-file "arrays")
(sys::load-system-file "compiler-macro")
(sys::load-system-file "subtypep")
(sys::load-system-file "typep")
(sys::load-system-file "precompiler")

(sys::precompile-package "PRECOMPILER")
(sys::precompile-package "EXTENSIONS")
(sys::precompile-package "SYSTEM")
(sys::precompile-package "COMMON-LISP")

(sys::load-system-file "signal")
(sys::load-system-file "list")
(sys::load-system-file "sequences")
(sys::load-system-file "error")
(sys::load-system-file "defpackage")
(sys::load-system-file "define-modify-macro")

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
             (sys::load-system-file (concatenate 'string (string-downcase (string module-name))
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

(sys::load-system-file "restart")
(sys::load-system-file "late-setf")
(sys::load-system-file "debug")

(format t "Startup completed in ~A seconds.~%" (float (/ (ext:uptime) 1000)))
