;;; pathnames.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: pathnames.lisp,v 1.6 2005-05-06 17:21:35 piso Exp $
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

(defun pathname-host (pathname &key (case :local))
  (require-type-pathname-designator pathname)
  (%pathname-host pathname case))

(defun pathname-device (pathname &key (case :local))
  (require-type-pathname-designator pathname)
  (%pathname-device pathname case))

(defun pathname-directory (pathname &key (case :local))
  (require-type-pathname-designator pathname)
  (%pathname-directory pathname case))

(defun pathname-name (pathname &key (case :local))
  (require-type-pathname-designator pathname)
  (%pathname-name pathname case))

(defun pathname-type (pathname &key (case :local))
  (require-type-pathname-designator pathname)
  (%pathname-type pathname case))

(defun wild-pathname-p (pathname &optional field-key)
  (require-type-pathname-designator pathname)
  (%wild-pathname-p pathname field-key))

(defun require-type-pathname-designator (pathname)
  (require-type pathname '(or pathname string file-stream)))
