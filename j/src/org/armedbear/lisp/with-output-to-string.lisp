;;; with-output-to-string.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: with-output-to-string.lisp,v 1.1 2004-02-01 16:48:13 piso Exp $
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

;;; From CMUCL.
(defmacro with-output-to-string ((var &optional string &key element-type)
				 &body body)
  "If STRING is specified, it must be a string with a fill pointer;
   the output is incrementally appended to the string (as if by use of
   VECTOR-PUSH-EXTEND)."
  (declare (ignore element-type))
  (multiple-value-bind (forms decls) (parse-body body)
    (if string
        `(let ((,var (make-fill-pointer-output-stream ,string)))
           ,@decls
           (unwind-protect
            (progn ,@forms)
            (close ,var)))
        `(let ((,var (make-string-output-stream)))
           ,@decls
           (unwind-protect
            (progn ,@forms)
            (close ,var))
           (get-output-stream-string ,var)))))
