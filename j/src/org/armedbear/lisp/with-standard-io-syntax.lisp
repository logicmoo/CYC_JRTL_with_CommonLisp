;;; with-standard-io-syntax.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: with-standard-io-syntax.lisp,v 1.3 2004-06-07 01:56:45 piso Exp $
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

(defun %with-standard-io-syntax (function)
  (let ((*package* (find-package "CL-USER"))
        (*print-array* t)
        (*print-base* 10)
        (*print-case* :upcase)
        (*print-circle* nil)
        (*print-escape* t)
        (*print-gensym* t)
        (*print-length* nil)
        (*print-level* nil)
        (*print-lines* nil)
        (*print-miser-width* nil)
        (*print-pretty* nil)
        (*print-radix* nil)
        (*print-readably* t)
        (*print-right-margin* nil)
        (*read-base* 10)
        (*read-default-float-format* 'single-float)
        (*read-eval* t)
        (*read-suppress* nil)
        (*readtable* (copy-readtable nil)))
    (funcall function)))

(defmacro with-standard-io-syntax (&body body)
  `(%with-standard-io-syntax #'(lambda () ,@body)))
