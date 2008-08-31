;;; apropos.lisp
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

;;; Adapted from SBCL.

(in-package #:system)

(resolve 'write-string)

(defun apropos-list (string-designator &optional package-designator)
  (if package-designator
      (let ((package (find-package package-designator))
            (string (string string-designator))
            (result nil))
        (dolist (symbol (package-external-symbols package))
          (declare (type symbol symbol))
          (when (search string (symbol-name symbol) :test #'char-equal)
            (push symbol result)))
        (dolist (symbol (package-internal-symbols package))
          (declare (type symbol symbol))
          (when (search string (symbol-name symbol) :test #'char-equal)
            (push symbol result)))
        result)
      (mapcan (lambda (package)
		(apropos-list string-designator package))
	      (list-all-packages))))

(defun apropos (string-designator &optional package-designator)
  (dolist (symbol (apropos-list string-designator package-designator))
    (fresh-line)
    (prin1 symbol)
    (when (boundp symbol)
      (write-string " (bound)"))
    (when (fboundp symbol)
      (write-string " (fbound)")))
    (values))
