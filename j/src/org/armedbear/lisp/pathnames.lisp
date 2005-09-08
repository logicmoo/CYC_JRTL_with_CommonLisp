;;; pathnames.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: pathnames.lisp,v 1.10 2005-09-08 16:05:46 piso Exp $
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
  (%pathname-host pathname case))

(defun pathname-device (pathname &key (case :local))
  (%pathname-device pathname case))

(defun pathname-directory (pathname &key (case :local))
  (%pathname-directory pathname case))

(defun pathname-name (pathname &key (case :local))
  (%pathname-name pathname case))

(defun pathname-type (pathname &key (case :local))
  (%pathname-type pathname case))

(defun wild-pathname-p (pathname &optional field-key)
  (%wild-pathname-p pathname field-key))

(defun translate-pathname (&rest args)
  (declare (ignore args)) ; FIXME
  (error "TRANSLATE-PATHNAME is not implemented."))

(defun canonicalize-logical-hostname (host)
  (string-upcase host))

(defun logical-pathname-translations (host)
  (gethash-2op-1ret (canonicalize-logical-hostname host)
                    *logical-pathname-translations*))

(defun %set-logical-pathname-translations (host new-translations)
  (setf (gethash (canonicalize-logical-hostname host)
                 *logical-pathname-translations*)
        new-translations))

(defsetf logical-pathname-translations %set-logical-pathname-translations)

(defun translate-logical-pathname (pathname &key)
  (typecase pathname
    (logical-pathname
     ;; FIXME
     nil)
    (pathname pathname)
    (t (translate-logical-pathname (pathname pathname)))))

(defun load-logical-pathname-translations (host)
  (declare (type string host))
  (multiple-value-bind (ignore found)
      (gethash (canonicalize-logical-hostname host)
               *logical-pathname-translations*)
    (declare (ignore ignore))
    (unless found
      (error "The logical host ~S was not found." host))))

(defun logical-pathname (pathspec)
  (typecase pathspec
    (logical-pathname pathspec)
    (string
     (%make-logical-pathname pathspec))
    (stream
     (let ((result (pathname pathspec)))
       (if (typep result 'logical-pathname)
           result
           (error 'simple-type-error
                  :datum result
                  :expected-type 'logical-pathname))))
    (t
     (error 'type-error
            :datum pathspec
            :expected-type '(or logical-pathname string stream)))))

(defun parse-namestring (thing
                         &optional host default-pathname
                         &key (start 0) end junk-allowed)
  (declare (ignore host default-pathname junk-allowed)) ; FIXME
  (typecase thing
    (stream
     (values (pathname thing) start))
    (pathname
     (values thing start))
    (string
     (unless end
       (setf end (length thing)))
     (values (pathname (subseq thing start end))
             end))
    (t
     (error 'type-error
            :format-control "~S cannot be converted to a pathname."
            :format-arguments (list thing)))))
