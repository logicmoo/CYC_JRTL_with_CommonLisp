;;; defstruct.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: defstruct.lisp,v 1.9 2003-07-12 15:25:40 piso Exp $
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

(defvar *ds-name*)
(defvar *ds-conc-name*)
(defvar *ds-constructor*)
(defvar *ds-copier*)
(defvar *ds-named*)
(defvar *ds-predicate*)
(defvar *ds-print-function*)

(defun make-constructor (name slots)
  (let ((constructor-name (intern (concatenate 'string "MAKE-" (symbol-name name))))
        (keys (cons '&key slots)))
    (eval `(defun ,constructor-name ,keys
             (%make-structure ',name (list ,@slots))))))

(defun make-access-function (conc-name slot index)
  (let ((accessor
         (if conc-name
             (intern (concatenate 'string (symbol-name conc-name) (symbol-name slot)))
             slot))
        (setf-expander (gensym)))
    (eval `(progn
             (defun ,accessor (instance)
               (%structure-ref instance ,index))
             (defun ,setf-expander (instance new-value)
               (%structure-set instance ,index new-value))
             (defsetf ,accessor ,setf-expander)))))

(defun make-access-functions (name slots)
  (let ((index 0))
    (dolist (slot slots)
      (make-access-function name slot index)
      (incf index))))

(defun parse-1-option (option)
  (case (car option)
    (:conc-name
     (setf *ds-conc-name* (if (symbolp (cadr option))
                              (cadr option)
                              (make-symbol (string (cadr option))))))))

(defun parse-name-and-options (name-and-options)
  (setf *ds-name* (car name-and-options))
  (setf *ds-conc-name* (make-symbol (concatenate 'string (symbol-name *ds-name*) "-")))
  (let ((options (cdr name-and-options)))
    (dolist (option options)
      (cond ((consp option)
             (parse-1-option option))
            ((eq option :named)
             (setf *ds-named* t))
            ((member option '(:constructor :copier :predicate :named
                              :conc-name))
             (parse-1-option (list option)))
            (t
             (error "unrecognized DEFSTRUCT option: ~S" option))))))

(defmacro defstruct (name-and-options &rest slots)
  (let ((*ds-name* nil)
        (*ds-conc-name* nil)
        (*ds-constructor* nil)
        (*ds-copier* nil)
        (*ds-predicate* nil)
        (*ds-print-function* nil))
    (parse-name-and-options (if (atom name-and-options)
                                (list name-and-options)
                                name-and-options))
    `(progn
       (make-constructor ',*ds-name* ',slots)
       (make-access-functions ',*ds-conc-name* ',slots)
       ',*ds-name*)))
