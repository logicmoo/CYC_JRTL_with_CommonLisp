;;; multiple-value-bind.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: multiple-value-bind.lisp,v 1.1 2004-03-31 03:03:38 piso Exp $
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

;;; Adapted from CLISP.

(in-package "SYSTEM")

(defmacro multiple-value-bind (varlist form &body body)
  (let ((g (gensym))
        (poplist nil))
    (dolist (var varlist) (setq poplist (cons `(,var (pop ,g)) poplist)))
    `(let* ((,g (multiple-value-list ,form)) ,@(nreverse poplist))
       ,@body)))
