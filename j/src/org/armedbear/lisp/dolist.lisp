;;; dolist.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: dolist.lisp,v 1.3 2004-12-11 15:37:40 piso Exp $
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

(defmacro dolist ((var list-form &optional (result-form nil)) &body body)
  (multiple-value-bind (forms decls) (parse-body body nil)
    (let ((rest (gensym "REST-"))
          (top (gensym "TOP-"))
          (test (gensym "TEST-")))
      `(block nil
         (let ((,rest ,list-form)
               (,var nil))
           ,@decls
           (tagbody
            (go ,test)
            ,top
            (setq ,var (car ,rest))
            ,@forms
            (setq ,rest (cdr ,rest))
            ,test
            (unless (endp ,rest)
              (go ,top))))
         ,(if (constantp result-form)
              `,result-form
              `(let ((,var nil))
                 ,var
                 ,result-form))))))
