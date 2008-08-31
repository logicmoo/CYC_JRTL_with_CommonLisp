;;; deftype.lisp
;;;
;;; Copyright (C) 2004-2005 Peter Graves
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

(defmacro deftype (name lambda-list &rest body)
  (when (eq (symbol-package name) +cl-package+)
    (error :format-control "Attempt to define ~S, a symbol in the COMMON-LISP package, as a type specifier."
           :format-arguments (list name)))
  (check-declaration-type name)
  ;; Optional and keyword parameters default to * rather than NIL.
  (when (or (memq '&optional lambda-list)
            (memq '&key lambda-list))
    (let ((new-lambda-list ())
          (state nil))
      (dolist (thing lambda-list)
        (cond ((eq thing '&optional)
               (setf state '&optional))
              ((eq thing '&key)
               (setf state '&key))
              ((memq thing lambda-list-keywords)
               (setf state nil))
              ((eq state '&optional)
               (when (symbolp thing)
                 (setf thing (list thing ''*))))
              ((eq state '&key)
               (when (symbolp thing)
                 (setf thing (list thing ''*)))))
        (push thing new-lambda-list))
      (setf lambda-list (nreverse new-lambda-list))))
  `(progn
     (setf (get ',name 'deftype-definition)
           #'(lambda ,lambda-list (block ,name ,@body)))
     ',name))

(defun expand-deftype (type)
  (let (tp i)
    (loop
      (if (consp type)
          (setf tp (%car type) i (%cdr type))
          (setf tp type
                i nil))
      (if (and (symbolp tp) (get tp 'deftype-definition))
          (setf type (apply (get tp 'deftype-definition) i))
          (return))))
  type)
