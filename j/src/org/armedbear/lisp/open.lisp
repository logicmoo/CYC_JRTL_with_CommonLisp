;;; open.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: open.lisp,v 1.9 2004-01-26 20:34:36 piso Exp $
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

(defun open (filename
	     &key
	     (direction :input)
	     (element-type 'character)
	     (if-exists nil if-exists-given)
	     (if-does-not-exist nil if-does-not-exist-given)
	     (external-format :default))
  (let ((pathname (merge-pathnames filename)))
    (case direction
      (:input
       (make-file-input-stream pathname element-type))
      (:probe
       (let ((stream (make-file-input-stream pathname element-type)))
         (when stream
           (close stream))
         stream))
      ((:output :io)
       (unless if-exists-given
         (setf if-exists
               (if (eq (pathname-version pathname) :newest)
                   :new-version
                   :error)))
       (case if-exists
         ((:error :new-version)
          (when (probe-file pathname)
            (error 'file-error
                   :format-control "The file ~S already exists."
                   :format-arguments (list (namestring pathname)))))
         ((nil)
          (when (probe-file pathname)
            (return-from open nil)))
         (:supersede) ; OK to proceed.
         (t
          (error 'simple-error
                 :format-control "Option not supported: ~S."
                 :format-arguments (list if-exists))))
       (let ((output-stream (make-file-output-stream pathname element-type)))
         (if (eq direction :output)
             output-stream
             (let ((input-stream (make-file-input-stream pathname element-type)))
               (make-two-way-stream input-stream output-stream)))))
      (t
       (error 'simple-error
              :format-control ":DIRECTION ~S not supported."
              :format-arguments (list direction))))))
