;;; swank-loader.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: swank-loader.lisp,v 1.4 2004-09-15 17:50:41 piso Exp $
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

(in-package #:cl-user)

#+abcl
(sys:load-system-file "swank-package")

#+sbcl
(load (merge-pathnames "swank-package.lisp" *load-truename*))

#+abcl
(dolist (file '("swank-protocol.lisp"
                "swank-abcl.lisp"
                "swank.lisp"))
  (let ((device (pathname-device *load-truename*)))
    (cond ((and (pathnamep device)
                (equalp (pathname-type device) "jar"))
           (sys:load-system-file (pathname-name file)))
          (t
           (let* ((source-file (merge-pathnames file *load-truename*))
                  (binary-file (compile-file-pathname source-file)))
             (if (and (probe-file binary-file)
                      (> (file-write-date binary-file) (file-write-date source-file)))
                 (sys:load-system-file (file-namestring binary-file))
                 (sys:load-system-file (file-namestring (compile-file source-file)))))))))

#+sbcl
(dolist (file '("swank-protocol.lisp"
                "swank-sbcl.lisp"
                "swank.lisp"))
  (let* ((source-file (merge-pathnames file *load-truename*))
         (binary-file (compile-file-pathname source-file)))
    (if (and (probe-file binary-file)
             (> (file-write-date binary-file) (file-write-date source-file)))
        (load binary-file)
        (load (compile-file source-file)))))

#-j
(funcall (intern (string '#:start-server) '#:swank))
