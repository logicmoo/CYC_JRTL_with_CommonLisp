;;; print-unreadable-object.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: print-unreadable-object.lisp,v 1.3 2004-05-22 17:23:07 piso Exp $
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

(defun %print-unreadable-object (object stream type identity body)
  (when *print-readably*
    (error 'print-not-readable :object object))
  (%format stream "#<")
  (when type
    (%format stream "~S" (type-of object))
    (when (or body identity)
      (%format stream " ")))
  (when body
    (funcall body))
  (when identity
    (when body
      (%format stream " "))
    (%format stream "@ #x~X" (identity-hash-code object)))
  (%format stream ">")
  nil)

(defmacro print-unreadable-object ((object stream &key type identity) &body body)
  `(%print-unreadable-object ,object ,stream ,type ,identity
			     ,(if body
				  `(lambda () ,@body)
				  nil)))
