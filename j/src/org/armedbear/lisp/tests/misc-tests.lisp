;;; misc-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: misc-tests.lisp,v 1.2 2005-11-09 18:10:58 piso Exp $
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

(load (merge-pathnames "test-utilities.lisp" *load-truename*))

(in-package #:test)

(deftest dotimes.1
  (progn
    (fmakunbound 'dotimes.1)
    (defun dotimes.1 ()
      (let ((sum 0)) (dotimes (i 10) (setq i 42) (incf sum i)) sum))
    (dotimes.1))
  420)

(deftest dotimes.1.compiled
  (progn
    (fmakunbound 'dotimes.1.compiled)
    (defun dotimes.1.compiled ()
      (let ((sum 0)) (dotimes (i 10) (setq i 42) (incf sum i)) sum))
    (compile 'dotimes.1.compiled)
    (dotimes.1.compiled))
  420)

(deftest dotimes.2
  (progn
    (fmakunbound 'dotimes.2)
    (defun dotimes.2 (count)
      (let ((sum 0)) (dotimes (i count) (setq i 42) (incf sum i)) sum))
    (dotimes.2 10))
  420)

(deftest dotimes.2.compiled
  (progn
    (fmakunbound 'dotimes.2.compiled)
    (defun dotimes.2.compiled (count)
      (let ((sum 0)) (dotimes (i count) (setq i 42) (incf sum i)) sum))
    (compile 'dotimes.2.compiled)
    (dotimes.2.compiled 10))
  420)

(do-tests)
