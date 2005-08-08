;;; compiler-types.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: compiler-types.lisp,v 1.2 2005-08-08 02:57:58 piso Exp $
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

;;; Type information that matters to the compiler.

(in-package #:system)

(export '(integer-type-low
          integer-type-high
          make-integer-type
          fixnum-type-p
          constant-fixnum-value
          make-compiler-type
          function-result-type
          defknown))

(defstruct (integer-type (:constructor %make-integer-type (low high)))
  low
  high)

(declaim (ftype (function (t) t) make-integer-type))
(defun make-integer-type (type)
  (setf type (normalize-type type))
  (when (and (consp type) (eq (%car type) 'INTEGER))
    (let ((low (second type))
          (high (third type)))
      (when (and (consp low) (integerp (%car low)))
        (setq low (1+ (%car low))))
      (when (and (consp high) (integerp (%car high)))
        (setq high (1- (%car high))))
      (%make-integer-type low high))))

(declaim (ftype (function (t) t) fixnum-type-p))
(defun fixnum-type-p (integer-type)
  (when integer-type
    (aver (integer-type-p integer-type)) ;; FIXME
    (and (fixnump (integer-type-low integer-type))
         (fixnump (integer-type-high integer-type)))))

(declaim (ftype (function (t) t) constant-fixnum-value))
(defun constant-fixnum-value (integer-type)
  (when integer-type
    (aver (integer-type-p integer-type)) ;; FIXME
    (let ((low (integer-type-low integer-type))
          high)
      (when (fixnump low)
        (setf high (integer-type-high integer-type))
        (when (and (fixnump high) (= high low))
          high)))))

(defun make-compiler-type (typespec)
  (let ((type (normalize-type typespec)))
    (cond ((consp type)
           (case (%car type)
             (INTEGER
              (make-integer-type type))))
          ((memq type '(SYMBOL))
           type)
          (t
           t))))

(defvar *function-result-types* (make-hash-table :test 'equal))

(defun function-result-type (name)
  (if (symbolp name)
      (get name 'function-result-type)
      (gethash-2op-1ret name (the hash-table *function-result-types*))))

(defun set-function-result-type (name result-type)
  (setf (gethash name (the hash-table *function-result-types*)) result-type))

(defsetf function-result-type set-function-result-type)

(defun %defknown (name argument-types result-type)
  (declare (ignore argument-types))
  (setf (function-result-type name) (make-compiler-type result-type)))

(defmacro defknown (name argument-types result-type)
  `(eval-when (:compile-toplevel :load-toplevel :execute)
     (%defknown ',name ',argument-types ',result-type)))

(provide '#:compiler-types)
