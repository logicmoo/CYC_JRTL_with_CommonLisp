;;; documentation.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: documentation.lisp,v 1.7 2004-02-07 19:54:40 piso Exp $
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

(defun documentation (symbol type)
  (case type
    (FUNCTION
     (get symbol '%function-documentation))
    (VARIABLE
     (get symbol '%variable-documentation))
    (STRUCTURE
     (get symbol '%structure-documentation))))

(defun %set-documentation (symbol type docstring)
  (case type
    (FUNCTION
     (setf (get symbol '%function-documentation) docstring))
    (VARIABLE
     (setf (get symbol '%variable-documentation) docstring))
    (STRUCTURE
     (setf (get symbol '%structure-documentation) docstring))))
