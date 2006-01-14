;;; macros.lisp
;;;
;;; Copyright (C) 2003-2006 Peter Graves
;;; $Id: macros.lisp,v 1.32 2006-01-14 12:56:13 piso Exp $
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

(in-package #:system)

(defmacro in-package (name)
  `(%in-package ,(string name)))

(defmacro when (test-form &rest body)
  (if (cdr body)
      `(if ,test-form (progn ,@body))
      `(if ,test-form ,(car body))))

(defmacro unless (test-form &rest body)
  (if (cdr body)
      `(if (not ,test-form) (progn ,@body))
      `(if (not ,test-form) ,(car body))))

(defmacro return (&optional result)
  `(return-from nil ,result))

(defmacro defconstant (name initial-value &optional docstring)
  `(%defconstant ',name ,initial-value ,docstring))

(defmacro defparameter (name initial-value &optional docstring)
  `(%defparameter ',name ,initial-value ,docstring))

(defmacro %car (x)
  `(car (truly-the cons ,x)))

(defmacro %cdr (x)
  `(cdr (truly-the cons ,x)))

(defmacro %cadr (x)
  `(%car (%cdr ,x)))

(defmacro %caddr (x)
  `(%car (%cdr (%cdr ,x))))

(defmacro prog1 (first-form &rest forms)
  (let ((result (gensym)))
    `(let ((,result ,first-form))
       ,@forms
       ,result)))

(defmacro prog2 (first-form second-form &rest forms)
  `(prog1 (progn ,first-form ,second-form) ,@forms))

;; Adapted from SBCL.
(defmacro push (item place)
  (if (and (symbolp place)
	   (eq place (macroexpand place)))
      `(setq ,place (cons ,item ,place))
      (multiple-value-bind (dummies vals newval setter getter)
        (get-setf-expansion place)
        (let ((g (gensym)))
          `(let* ((,g ,item)
                  ,@(mapcar #'list dummies vals)
                  (,(car newval) (cons ,g ,getter)))
             ,setter)))))

;; Adapted from SBCL.
(defmacro pushnew (item place &rest keys)
  (if (and (symbolp place)
	   (eq place (macroexpand place)))
      `(setq ,place (adjoin ,item ,place ,@keys))
      (multiple-value-bind (dummies vals newval setter getter)
        (get-setf-expansion place)
        (let ((g (gensym)))
          `(let* ((,g ,item)
                  ,@(mapcar #'list dummies vals)
                  (,(car newval) (adjoin ,g ,getter ,@keys)))
             ,setter)))))

;; Adapted from SBCL.
(defmacro pop (place)
  (if (and (symbolp place)
	   (eq place (macroexpand place)))
      `(prog1 (car ,place)
	      (setq ,place (cdr ,place)))
      (multiple-value-bind (dummies vals newval setter getter)
        (get-setf-expansion place)
        (do* ((d dummies (cdr d))
              (v vals (cdr v))
              (let-list nil))
             ((null d)
              (push (list (car newval) getter) let-list)
              `(let* ,(nreverse let-list)
                 (prog1 (car ,(car newval))
                        (setq ,(car newval) (cdr ,(car newval)))
                        ,setter)))
          (push (list (car d) (car v)) let-list)))))

(defmacro psetq (&rest args)
  (do ((l args (cddr l))
       (forms nil)
       (bindings nil))
    ((endp l) (list* 'let* (reverse bindings) (reverse (cons nil forms))))
    (let ((sym (gensym)))
      (push (list sym (cadr l)) bindings)
      (push (list 'setq (car l) sym) forms))))

(defmacro time (form)
  `(%time #'(lambda () ,form)))

(defmacro with-open-stream (&rest args)
  (let ((var (caar args))
        (stream (cadar args))
        (forms (cdr args))
        (abortp (gensym)))
    `(let ((,var ,stream)
	   (,abortp t))
       (unwind-protect
        (multiple-value-prog1
         (progn ,@forms)
         (setq ,abortp nil))
        (when ,var
          (close ,var :abort ,abortp))))))

(defun ansi-loop (exps)
  (let ((*warn-on-redefinition* nil))
    (require 'loop))
  (fmakunbound 'ansi-loop)
  `(loop ,@exps))

(defmacro loop (&rest exps)
  (dolist (exp exps)
    (when (atom exp)
      (return-from loop (ansi-loop exps))))
  (let ((tag (gensym)))
    `(block nil (tagbody ,tag ,@exps (go ,tag)))))

(defmacro defvar (var &optional (val nil valp) (doc nil docp))
  `(progn
     (%defvar ',var)
     ,@(when valp
         `((unless (boundp ',var)
             (setq ,var ,val))))
     ,@(when docp
         `((%set-documentation ',var 'variable ',doc)))
     ',var))

(defmacro defconst (name value)
  `(defconstant ,name
     (if (boundp ',name)
         (symbol-value ',name)
         ,value)))
