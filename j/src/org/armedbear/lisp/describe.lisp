;;; describe.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: describe.lisp,v 1.1 2005-02-11 22:08:02 piso Exp $
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

(require 'format)

(defun describe-arglist (object stream)
  (multiple-value-bind
      (arglist known-p)
      (arglist object)
    (when known-p
      (if arglist
          (format stream "~&The function's arguments are:~%  ~A~%" arglist)
          (format stream "~&The function takes no arguments.")))))

(defun describe (object &optional stream)
  (let ((stream (out-synonym-of stream))
        (*print-pretty* t))
    (typecase object
      (SYMBOL
       (let ((package (symbol-package object)))
         (if package
             (multiple-value-bind
                 (sym status)
                 (find-symbol (symbol-name object) package)
               (format stream "~S is an ~A symbol in the ~A package.~%"
                       object
                       (if (eq status :internal) "internal" "external")
                       (package-name package)))
             (format stream "~S is an uninterned symbol.~%" object))
         (cond ((special-variable-p object)
                (format stream "It is a ~A; "
                        (if (constantp object) "constant" "special variable"))
                (if (boundp object)
                    (format stream "its value is ~S.~%" (symbol-value object))
                    (format stream "it is unbound.~%")))
               ((boundp object)
                (format stream "It is an undefined variable; its value is ~S.~%"
                        (symbol-value object)))))
       (when (autoloadp object)
         (resolve object))
       (let ((function (and (fboundp object) (symbol-function object))))
         (when function
           (format stream "Its function binding is ~S.~%" function)
           (describe-arglist function stream)))
       (let ((plist (symbol-plist object)))
         (when plist
           (format stream "The symbol's property list has these indicator/value pairs:~%")
           (loop
             (when (null plist) (return))
             (format stream "  ~S ~S~%" (car plist) (cadr plist))
             (setf plist (cddr plist))))))
      (FUNCTION
       (format stream "~S is an object of type ~S.~%" object (type-of object))
       (describe-arglist object stream))
      (t
       (%describe object stream))))
  (values))
