;;; compiler-macro.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: compiler-macro.lisp,v 1.1 2003-11-10 00:11:44 piso Exp $
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

(defun compiler-macro-function (name &optional environment)
  (get name 'compiler-macro-expander))

(defun (setf compiler-macro-function) (new-function name &optional environment)
  (%put name 'compiler-macro-expander new-function))

(defmacro define-compiler-macro (name lambda-list &rest body)
  (let* ((form (gensym))
         (env (gensym))
         (body (sys::parse-defmacro lambda-list form body name 'defmacro
                                    :environment env))
         (expander `(lambda (,form ,env) (block ,name ,body))))
    `(progn
       (sys::%put ',name 'compiler-macro-expander ,expander)
       ',name)))
