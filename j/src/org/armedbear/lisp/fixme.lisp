;;; fixme.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: fixme.lisp,v 1.18 2004-02-27 01:12:41 piso Exp $
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

;; Should be a special operator.
(defmacro the (type form)
  form)

(defmacro declaim (&rest decls)
  (let ((res ()))
    (dolist (decl decls)
      (when (eq (car decl) 'special)
        (dolist (var (cdr decl))
          (push `(defvar ,var) res))))
    (when res
      `(progn ,@(nreverse res)))))

(defun proclaim (declaration-specifier)
  (when (eq (car declaration-specifier) 'special)
    (dolist (var (cdr declaration-specifier))
      (%defvar var))))

(defun compile-file-pathname (pathname)
  (concatenate 'string (namestring pathname) ".compiled"))

(defun disassemble (fn)
  (%format t "; DISASSEMBLE is not implemented."))
