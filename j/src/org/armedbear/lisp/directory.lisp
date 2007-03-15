;;; directory.lisp
;;;
;;; Copyright (C) 2004-2007 Peter Graves
;;; $Id: directory.lisp,v 1.7 2007-03-15 18:56:28 piso Exp $
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
;;; Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

(in-package "SYSTEM")

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
      (setq pathname (translate-logical-pathname pathname)))
    (if (wild-pathname-p pathname)
        (let ((namestring (directory-namestring pathname)))
          (when (and namestring (> (length namestring) 0))
            #+windows
            (let ((device (pathname-device pathname)))
              (when device
                (setq namestring (concatenate 'string device ":" namestring))))
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
