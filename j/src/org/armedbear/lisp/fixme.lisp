;;; fixme.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: fixme.lisp,v 1.4 2003-08-16 13:24:35 piso Exp $
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

;; Should be a special operator.
(defmacro the (type form)
  form)

;; Should be a special operator.
(defmacro declare (&rest ignored)
  nil)

(defmacro declaim (&rest ignored)
  nil)

;; Should be a special operator.
(defmacro locally (&rest forms)
  `(progn ,@forms))

;; Should be a special operator.
(defmacro eval-when (situation &rest forms)
  `(progn ,@forms))

(defun proclaim (decl)
  nil)

(defun compute-restarts (&optional condition)
  nil)

(defun restart-name (restart)
  nil)

(defmacro check-type (place typespec &optional string)
  nil)

(defun warn (&rest args)
  nil)

(defmacro assert (form &rest stuff)
  `(if (not ,form) (error "assertion failed: ~S" ',form)))

(defun compile-file (&rest args)
  (values nil nil nil))

(defun compile-file-pathname (pathname)
  (concatenate 'string (namestring pathname) ".compiled"))

(defvar *readtable* nil)

(defun copy-readtable (&rest ignored)
  nil)

(defmacro defgeneric (function-name lambda-list &rest options)
  `(prog1
    (sys::%defun ',function-name ',lambda-list nil)))
