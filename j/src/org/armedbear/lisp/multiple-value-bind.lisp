;;; multiple-value-bind.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: multiple-value-bind.lisp,v 1.2 2004-08-02 15:07:38 piso Exp $
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

;; The traditional implementation of M-V-B in terms of M-V-C. ABCL implements
;; M-V-B as a special form in the interpreter, and ABCL's compiler handles it
;; specifically too, so this code is only here to support code walkers and the
;; like, as required by ANSI.
(defmacro multiple-value-bind (varlist value-form &body body)
  (unless (and (listp varlist) (every #'symbolp varlist))
    (error 'program-error
           :format-control "Variable list is not a list of symbols: ~S."
           :format-arguments (list varlist)))
  (if (= (length varlist) 1)
      `(let ((,(car varlist) ,value-form))
	 ,@body)
      (let ((ignore (gensym)))
	`(multiple-value-call #'(lambda (&optional ,@(mapcar #'list varlist) &rest ,ignore)
                                 (declare (ignore ,ignore))
                                 ,@body)
                              ,value-form))))
