;;; dolist.lisp
;;;
;;; Copyright (C) 2004-2005 Peter Graves
;;; $Id: dolist.lisp,v 1.8 2005-12-23 16:56:38 piso Exp $
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

;;; Adapted from SBCL.

(in-package #:system)

(defmacro dolist ((var list-form &optional (result-form nil)) &body body)
  ;; We repeatedly bind the var instead of setting it so that we never
  ;; have to give the var an arbitrary value such as NIL (which might
  ;; conflict with a declaration). If there is a result form, we
  ;; introduce a gratuitous binding of the variable to NIL without the
  ;; declarations, then evaluate the result form in that
  ;; environment. We spuriously reference the gratuitous variable,
  ;; since we don't want to use IGNORABLE on what might be a special
  ;; var.
  (multiple-value-bind (forms decls)
      (parse-body body nil)
    (let ((list (gensym "LIST-"))
          (top (gensym "TOP-")))
      `(block nil
         (let ((,list ,list-form))
           (tagbody
            ,top
            (unless (endp ,list)
              (let ((,var (%car ,list)))
                ,@decls
                (setq ,list (%cdr ,list))
                (tagbody ,@forms))
              (go ,top))))
         ,(if (constantp result-form)
              `,result-form
              `(let ((,var nil))
                 ,@decls
                 ,var
                 ,result-form))))))
