;;; print-object.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: print-object.lisp,v 1.2 2003-12-17 18:39:07 piso Exp $
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

;;; Adapted from Closette.

(in-package "SYSTEM")

(require 'clos)

(when (autoloadp 'print-object)
  (fmakunbound 'print-object))

(defgeneric print-object (instance stream))

(defmethod print-object ((x t) stream)
  (print-unreadable-object (x stream :type t :identity t)))

(defmethod print-object ((instance standard-object) stream)
  (print-unreadable-object (instance stream :identity t)
                           (format stream "~S"
                                   (class-name (class-of instance))))
  instance)

(defmethod print-object ((class standard-class) stream)
  (print-unreadable-object (class stream :identity t)
                           (format stream "~S ~S"
                                   (class-name (class-of class))
                                   (class-name class)))
  class)

(defmethod print-object ((gf standard-generic-function) stream)
  (print-unreadable-object (gf stream :identity t)
                           (format stream "~S ~S"
                                   (class-name (class-of gf))
                                   (generic-function-name gf)))
  gf)

(defmethod print-object ((method standard-method) stream)
  (print-unreadable-object (method stream :identity t)
                           (format stream "~S ~S~{ ~S~} ~S"
                                   (class-name (class-of method))
                                   (generic-function-name
                                    (method-generic-function method))
                                   (method-qualifiers method)
                                   (mapcar #'class-name
                                           (method-specializers method))))
  method)

(defmethod print-object ((restart restart) stream)
  (if *print-escape*
      (print-unreadable-object (restart stream :type t :identity t)
                               (prin1 (restart-name restart) stream))
      (restart-report restart stream)))
