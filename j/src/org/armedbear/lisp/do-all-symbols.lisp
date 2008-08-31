;;; do-all-symbols.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
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

;;; Adapted from SBCL.

(in-package #:system)

(defmacro do-all-symbols ((var &optional result-form) &body body)
  (multiple-value-bind (forms decls) (parse-body body nil)
    (let ((flet-name (gensym "DO-SYMBOLS-")))
      `(block nil
         (flet ((,flet-name (,var)
                 ,@decls
                 (tagbody ,@forms)))
           (dolist (package (list-all-packages))
             (flet ((iterate-over-symbols (symbols)
                      (dolist (symbol symbols)
                        (,flet-name symbol))))
               (iterate-over-symbols (package-internal-symbols package))
               (iterate-over-symbols (package-external-symbols package)))))
         (let ((,var nil))
           (declare (ignorable ,var))
           ,@decls
           ,result-form)))))
