;;; directory.lisp
;;;
;;; Copyright (C) 2004-2005 Peter Graves
;;; $Id: directory.lisp,v 1.5 2005-10-04 16:17:06 piso Exp $
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

(defun pathname-as-file (pathname)
  (let ((directory (pathname-directory pathname)))
    (make-pathname :host nil
                   :device (pathname-device pathname)
                   :directory (butlast directory)
                   :name (car (last directory))
                   :type nil
                   :version nil)))

(defun directory (pathspec &key)
  (let ((pathname (merge-pathnames pathspec)))
    (when (logical-pathname-p pathname)
      (setf pathname (translate-logical-pathname pathname)))
    (if (wild-pathname-p pathname)
        (let ((namestring (directory-namestring pathname)))
          (when (and namestring (length namestring))
            (let ((entries (list-directory namestring))
                  (matching-entries ()))
              (dolist (entry entries)
                (cond ((file-directory-p entry)
                       (when (pathname-match-p (pathname-as-file entry) pathname)
                         (push entry matching-entries)))
                      ((pathname-match-p entry pathname)
                       (push entry matching-entries))))
              matching-entries)))
        ;; Not wild.
        (let ((truename (probe-file pathname)))
          (if truename
              (list (pathname truename))
              nil)))))
