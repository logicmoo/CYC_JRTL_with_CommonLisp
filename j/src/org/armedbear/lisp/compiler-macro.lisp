;;; compiler-macro.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: compiler-macro.lisp,v 1.4 2005-05-16 17:35:47 piso Exp $
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

(defvar *compiler-macros* (make-hash-table :test #'equal))

(defun compiler-macro-function (name &optional environment)
  (gethash name *compiler-macros*))

(defun (setf compiler-macro-function) (new-function name &optional environment)
  (setf (gethash name *compiler-macros*) new-function))

(defmacro define-compiler-macro (name lambda-list &rest body)
  (let* ((form (gensym))
         (env (gensym)))
    (multiple-value-bind (body decls)
        (parse-defmacro lambda-list form body name 'defmacro :environment env)
      (let ((expander `(lambda (,form ,env) (block ,(block-name name) ,body))))
        `(progn
           (setf (compiler-macro-function ',name) (function ,expander))
           ',name)))))
