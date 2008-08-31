;;; slime-loader.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
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

(in-package #:system)

(dolist (file '("swank-protocol.lisp"
                "slime.lisp"))
  (let ((device (pathname-device *load-truename*)))
    (cond ((and (pathnamep device)
                (equalp (pathname-type device) "jar"))
           (load-system-file (pathname-name file)))
          (t
           (let* ((source-file (merge-pathnames file *load-truename*))
                  (binary-file (compile-file-pathname source-file)))
             (unless (and (probe-file binary-file)
                          (> (file-write-date binary-file)
                             (file-write-date source-file)))
               (j:status
                (simple-format nil "Compiling ~A ..." (namestring source-file)))
               (setf binary-file (compile-file source-file)))
             (load-system-file (file-namestring binary-file)))))))

#+j
(unless (fboundp 'swank:start-server)
  (load-system-file "swank-loader"))
