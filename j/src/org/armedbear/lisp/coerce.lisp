;;; coerce.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: coerce.lisp,v 1.3 2004-02-12 13:02:52 piso Exp $
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

(defun coerce (object result-type)
  (cond ((eq result-type t)
         (return-from coerce object))
        ((typep object result-type)
         (return-from coerce object))
        ((eq result-type 'character)
         (cond ((and (stringp object)
                     (= (length object) 1))
                (return-from coerce (char object 0)))
               ((and (symbolp object)
                     (= (length (symbol-name object)) 1))
                (return-from coerce (char (symbol-name object) 0)))))
        ((memq result-type '(float single-float double-float short-float long-float))
         (return-from coerce (coerce-to-float object)))
        ((eq result-type 'complex)
         (cond ((floatp object)
                (return-from coerce (complex object 0.0)))
               ((numberp object)
                (return-from coerce object))))
        ((and (consp result-type)
              (eq (car result-type) 'complex))
         (if (memq (cadr result-type)
                   '(float single-float double-float short-float long-float))
             (return-from coerce (complex object 0.0))
             (return-from coerce object)))
        ((eq result-type 'function)
         (return-from coerce (coerce-to-function object)))
        ((and (%typep object 'sequence)
              (%subtypep result-type 'sequence))
         (return-from coerce (concatenate result-type object)))
        (t
         (error 'simple-type-error
                :format-control "~S cannot be converted to type ~S."
                :format-arguments (list object result-type)))))
