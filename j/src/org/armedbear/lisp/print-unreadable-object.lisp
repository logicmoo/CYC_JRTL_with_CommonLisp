;;; print-unreadable-object.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: print-unreadable-object.lisp,v 1.1 2003-11-03 03:00:21 piso Exp $
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

(defmacro print-unreadable-object ((object stream &key type identity) &body body)
  `(let ((s ,stream)
         (obj ,object))
     (format s "#<")
     ,(when type
        '(format s "~S" (type-of obj)))
     ,(when (and type (or body identity))
        '(format s " "))
     ,@body
     ,(when (and identity body)
        '(format s " "))
     ,(when identity
        '(format s "@ #x~A" (sys::hashcode-to-string obj)))
     (format s ">")
     nil))
