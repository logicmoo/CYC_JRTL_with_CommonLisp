;;; with-package-iterator.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id$
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

(defun package-iterator-function (package-list symbol-types)
  (unless (consp package-list)
    (setq package-list (list package-list)))
  (let ((results ()))
    (dolist (pkg package-list)
      (unless (packagep pkg)
        (setq pkg (find-package pkg))
        (unless pkg
          (error 'package-error "not a package")))
      (when (memq :internal symbol-types)
        (dolist (sym (package-internal-symbols pkg))
          (push (list sym :internal pkg) results)))
      (when (memq :external symbol-types)
        (dolist (sym (package-external-symbols pkg))
          (push (list sym :external pkg) results)))
      (when (memq :inherited symbol-types)
        (dolist (sym (package-inherited-symbols pkg))
          (push (list sym :inherited pkg) results))))
    #'(lambda () (let ((item (car results)))
                   (setq results (cdr results))
                   (if item
                       (values t (first item) (second item) (third item))
                       nil)))))

(defmacro with-package-iterator ((name package-list &rest symbol-types)
                                 &body body)
  (unless symbol-types
    (error 'program-error
           "WITH-PACKAGE-ITERATOR: no symbol types specified"))
  (dolist (symbol-type symbol-types)
    (unless (memq symbol-type '(:internal :external :inherited))
      (error 'program-error
             "WITH-PACKAGE-ITERATOR: invalid symbol type: %S" symbol-type)))
  (let ((iter (gensym)))
    `(let ((,iter (package-iterator-function ,package-list ',(remove-duplicates symbol-types))))
       (macrolet ((,name () '(funcall ,iter)))
                 ,@body))))
