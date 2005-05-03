;;; documentation.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: documentation.lisp,v 1.9 2005-05-03 04:29:27 piso Exp $
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

(export '(function-documentation
          set-function-documentation
          variable-documentation
          set-variable-documentation
          structure-documentation
          set-structure-documentation))

(defun function-documentation (symbol)
  (get symbol 'function-documentation))

(defun set-function-documentation (symbol docstring)
  (setf (get symbol 'function-documentation) docstring))

(defun variable-documentation (symbol)
  (get symbol 'variable-documentation))

(defun set-variable-documentation (symbol docstring)
  (setf (get symbol 'variable-documentation) docstring))

(defun structure-documentation (symbol)
  (get symbol 'structure-documentation))

(defun set-structure-documentation (symbol docstring)
  (setf (get symbol 'structure-documentation) docstring))
