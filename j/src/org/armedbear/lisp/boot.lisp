;;; boot.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: boot.lisp,v 1.20 2003-03-09 02:35:40 piso Exp $
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

(in-package "COMMON-LISP")

(defmacro lambda (lambda-list &rest body)
  (list 'FUNCTION (append (list 'LAMBDA lambda-list) body)))

(dolist (name '("documentation.lisp"
                "backquote.lisp"
                "setf.lisp"
                "macros.lisp"
                "list.lisp"
                "sequences.lisp"
                "symbol.lisp"
                "error.lisp"
                "defstruct.lisp"
                "chars.lisp"
                "strings.lisp"
                "sort.lisp"
                "compiler.lisp"))
  (cl::%load name))


;; Miscellany.

(export '(plusp minusp integerp
          character
          open
          read-from-string
          call-arguments-limit
          lambda-parameters-limit
          multiple-values-limit
          char-code-limit))

(defun plusp (n)
  (> n 0))

(defun minusp (n)
  (< n 0))

;; FIXME
(defun integerp (n)
  (numberp n))

;; FIXME
(defun fixnump (n)
  (numberp n))

(defun character (x)
  (coerce x 'character))

(defun open (filename
	     &key
	     (direction :input)
	     (element-type 'base-char)
	     (if-exists nil if-exists-given)
	     (if-does-not-exist nil if-does-not-exist-given)
	     (external-format :default))
  (if (eq direction :output)
      (%open-output-file filename)
      (error "operation not supported")))

(defun read-from-string (string &optional eof-error-p eof-value
				&key (start 0) end preserve-whitespace)
  (%read-from-string string eof-error-p eof-value start end preserve-whitespace))

(defconstant call-arguments-limit 50)

(defconstant lambda-parameters-limit 50)

(defconstant multiple-values-limit 20)

(defconstant char-code-limit 96)


(format t "; Compiling ... ")
(finish-output)
(c::compile-package :cl)
(format t "done~%")
(finish-output)
