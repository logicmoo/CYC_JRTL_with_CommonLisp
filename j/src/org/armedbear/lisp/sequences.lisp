;;; sequences.lisp
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

(defmacro type-specifier-atom (type)
  `(if (atom ,type) ,type (car ,type)))

(defun make-sequence-of-type (type length)
  (case (type-specifier-atom type)
    (list
     (make-list length))
    ((bit-vector simple-bit-vector)
     (make-array length :element-type 'bit))
    ((simple-base-string simple-string string)
     (make-string length))
    ((simple-vector vector)
     (if (cadr type)
         (make-array length :element-type (cadr type))
         (make-array length)))
    (nil-vector
     (make-array length :element-type nil))
    (simple-array
     (if (cadr type)
         (make-array length :element-type (cadr type))
         (make-array length)))
    (t
     (error "MAKE-SEQUENCE-OF-TYPE: unsupported case ~S" type))))

(defmacro make-sequence-like (sequence length)
  `(make-sequence-of-type (type-of ,sequence) ,length))
