;;; defstruct.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: defstruct.lisp,v 1.13 2003-07-13 13:43:19 piso Exp $
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

(defun define-constructor (slots)
  (let* ((constructor (intern (concatenate 'string "MAKE-" (symbol-name *ds-name*))))
         (slot-names (mapcar #'(lambda (x) (if (atom x) x (car x))) slots))
         (inits (mapcar #'(lambda (x) (if (atom x) nil (cadr x))) slots))
         (slot-descriptions (mapcar #'(lambda (x y) (list x y)) slot-names inits))
         (keys (cons '&key slot-descriptions)))
    `((defun ,constructor ,keys
        (%make-structure ',*ds-name* (list ,@slot-names))))))

(defun define-predicate ()
  (let ((pred (intern (concatenate 'string (symbol-name *ds-name*) "-P"))))
    `((defun ,pred (object)
        (typep object ',*ds-name*)))))

(defun define-access-function (slot-name index)
  (let ((accessor
         (if *ds-conc-name*
             (intern (concatenate 'string (symbol-name *ds-conc-name*) (symbol-name slot-name)))
             slot-name))
        (setf-expander (gensym)))
    `((defun ,accessor (instance)
        (%structure-ref instance ,index))
      (defun ,setf-expander (instance new-value)
        (%structure-set instance ,index new-value))
      (defsetf ,accessor ,setf-expander))))

(defun define-access-functions (slots)
  (let ((index 0)
        (result ()))
    (dolist (slot slots)
      (let ((slot-name (if (atom slot) slot (car slot))))
        (setq result (append result (define-access-function slot-name index))))
      (incf index))
    result))

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
       ,@(define-constructor slots)
       ,@(define-predicate)
       ,@(define-access-functions slots)
       ',*ds-name*)))
