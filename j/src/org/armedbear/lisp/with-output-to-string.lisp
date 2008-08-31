;;; with-output-to-string.lisp
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

(in-package #:system)

;;; From SBCL.
(defmacro with-output-to-string ((var &optional string &key (element-type ''character))
				 &body body)
  "If STRING is specified, it must be a string with a fill pointer;
   the output is incrementally appended to the string (as if by use of
   VECTOR-PUSH-EXTEND)."
  (multiple-value-bind (forms decls) (parse-body body)
    (if string
        (let ((ignored (gensym)))
          `(let ((,var (make-fill-pointer-output-stream ,string))
                 (,ignored ,element-type))
             (declare (ignore ,ignored))
             ,@decls
             (unwind-protect
                 (progn ,@forms)
               (close ,var))))
        `(let ((,var (make-string-output-stream :element-type ,element-type)))
           ,@decls
           (unwind-protect
               (progn ,@forms)
             (close ,var))
           (get-output-stream-string ,var)))))
