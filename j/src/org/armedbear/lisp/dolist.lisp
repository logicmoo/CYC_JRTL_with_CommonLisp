;;; dolist.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: dolist.lisp,v 1.1 2004-03-31 02:45:06 piso Exp $
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

;;; Adapted from CMUCL.

(in-package "SYSTEM")

;;; We repeatedly bind the var instead of setting it so that we never give the
;;; var a random value such as NIL (which might conflict with a declaration).
;;; If there is a result form, we introduce a gratitous binding of the variable
;;; to NIL w/o the declarations, then evaluate the result form in that
;;; environment.  We spuriously reference the gratuitous variable, since we
;;; don't want to use IGNORABLE on what might be a special var.
(defmacro dolist ((var list &optional (result nil)) &body body)
  (multiple-value-bind (forms decls) (parse-body body nil)
    (let ((n-list (gensym)))
      `(do* ((,n-list ,list (cdr ,n-list)))
	    ((endp ,n-list)
	     ,@(if (constantp result)
		   `(,result)
		   `((let ((,var nil))
		       ,@decls
		       ,var
		       ,result))))
         (let ((,var (car ,n-list)))
           ,@decls
           (tagbody
            ,@forms))))))
