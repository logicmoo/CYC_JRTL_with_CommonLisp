;;; open.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: open.lisp,v 1.12 2004-01-29 00:48:01 piso Exp $
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

(in-package "SYSTEM")

(defun open (filename
	     &key
	     (direction :input)
	     (element-type 'character)
	     (if-exists nil if-exists-given)
	     (if-does-not-exist nil if-does-not-exist-given)
	     (external-format :default))
  (let ((pathname (merge-pathnames filename)))
    (when (memq direction '(:output :io))
      (unless if-exists-given
        (setf if-exists
              (if (eq (pathname-version pathname) :newest)
                  :new-version
                  :error))))
    (unless if-does-not-exist-given
      (setf if-does-not-exist
            (cond ((eq direction :input) :error)
                  ((and (memq direction '(:output :io))
                        (memq if-exists '(:overwrite :append)))
                   :error)
                  ((eq direction :probe)
                   nil)
                  (t
                   :create))))
    (case direction
      (:input
       (case if-does-not-exist
         (:error
          (unless (probe-file pathname)
            (error 'file-error
                   :format-control "The file ~S does not exist."
                   :format-arguments (list (namestring pathname))))))
       (make-file-stream pathname element-type :input nil))
      (:probe
       (case if-does-not-exist
         (:error
          (unless (probe-file pathname)
            (error 'file-error
                   :format-control "The file ~S does not exist."
                   :format-arguments (list (namestring pathname))))))
       (let ((stream (make-file-stream pathname element-type :input nil)))
         (when stream
           (close stream))
         stream))
      ((:output :io)
       (case if-does-not-exist
         (:error
          (unless (probe-file pathname)
            (error 'file-error
                   :format-control "The file ~S does not exist."
                   :format-arguments (list (namestring pathname))))))
       (case if-exists
         (:error
          (when (probe-file pathname)
            (error 'file-error
                   :format-control "The file ~S already exists."
                   :format-arguments (list (namestring pathname)))))
         ((nil)
          (when (probe-file pathname)
            (return-from open nil)))
         ((:new-version :supersede :overwrite :append)) ; OK to proceed.
         (t
          (error 'simple-error
                 :format-control "Option not supported: ~S."
                 :format-arguments (list if-exists))))
       (make-file-stream pathname element-type direction (eq if-exists :append)))
      (t
       (error 'simple-error
              :format-control ":DIRECTION ~S not supported."
              :format-arguments (list direction))))))
