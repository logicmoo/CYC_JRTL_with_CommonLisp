;;; directory.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: directory.lisp,v 1.2 2004-02-02 01:06:33 piso Exp $
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

(in-package "SYSTEM")

(defun directory (pathname &key)
  (let ((merged-pathname (merge-pathnames pathname)))
    (if (wild-pathname-p merged-pathname)
        (let ((namestring (directory-namestring merged-pathname)))
          (when (and namestring (length namestring))
            (let ((all-files (list-directory namestring))
                  (matching-files ()))
              (dolist (file all-files)
                (when (pathname-match-p file merged-pathname)
                  (push file matching-files)))
              matching-files)))
        ;; Not wild.
        (let ((truename (probe-file merged-pathname)))
          (if truename
              (list (pathname truename))
              nil)))))
