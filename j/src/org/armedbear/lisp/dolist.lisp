;;; dolist.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: dolist.lisp,v 1.2 2004-05-06 11:06:12 piso Exp $
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

(in-package "SYSTEM")

(defmacro dolist ((var list &optional (result nil)) &body body)
  (multiple-value-bind (forms decls) (parse-body body nil)
    (let ((rest (gensym "REST"))
          (start (gensym "START")))
      `(block nil
         (let ((,rest ,list))
           (tagbody
            ,start
            (unless (endp ,rest)
              (let ((,var (car ,rest)))
                ,@decls
                (setq ,rest (cdr ,rest))
                (tagbody ,@forms))
              (go ,start))))
         ,(if result
              `(let ((,var nil))
                 ,var
                 ,result)
              nil)))))
