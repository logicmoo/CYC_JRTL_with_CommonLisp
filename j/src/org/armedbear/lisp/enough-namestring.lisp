;;; enough-namestring.lisp
;;;
;;; Copyright (C) 2004-2005 Peter Graves
;;; $Id: enough-namestring.lisp,v 1.5 2005-10-03 13:33:34 piso Exp $
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

(defun equal-components-p (this that)
  #+win32 (equalp this that)
  #-win32 (equal this that))

(defun enough-namestring (pathname
                          &optional
                          (defaults *default-pathname-defaults*))
  (unless (equal (pathname-host pathname) (pathname-host defaults))
    (return-from enough-namestring (namestring pathname)))
  (let ((pathname-directory (pathname-directory pathname)))
    (if pathname-directory
        (let* ((defaults-directory (pathname-directory defaults))
               (prefix-len (length defaults-directory))
               (result-directory
                (cond ((and (>= prefix-len 1)
                            (>= (length pathname-directory) prefix-len)
                            (equal-components-p (subseq pathname-directory 0 prefix-len)
                                                defaults-directory))
                       (cons :relative (nthcdr prefix-len pathname-directory)))
                      ((eq (car pathname-directory) :absolute)
                       pathname-directory)
                      (t
                       (return-from enough-namestring (namestring pathname))))))
          (concatenate 'simple-string
                       (directory-namestring (make-pathname :directory result-directory))
                       (file-namestring pathname)))
        (file-namestring pathname))))
