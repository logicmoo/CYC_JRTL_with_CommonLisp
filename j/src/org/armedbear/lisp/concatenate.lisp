;;; concatenate.lisp
;;;
;;; Copyright (C) 2003-2006 Peter Graves
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

(defun concatenate-to-string (sequences)
  (declare (optimize speed (safety 0)))
  (let ((length 0))
    (declare (type fixnum length))
    (dolist (seq sequences)
      (incf length (length seq)))
    (let ((result (make-string length))
          (i 0))
      (declare (type index i))
      (dolist (seq sequences result)
        (if (stringp seq)
            (dotimes (j (length seq))
              (declare (type index j))
              (setf (schar result i) (char (truly-the string seq) j))
              (incf i))
            (dotimes (j (length seq))
              (declare (type index j))
              (setf (schar result i) (elt seq j))
              (incf i)))))))

(defun concatenate (result-type &rest sequences)
  (case result-type
    (LIST
     (let ((result ()))
       (dolist (seq sequences (nreverse result))
         (dotimes (i (length seq))
           (push (elt seq i) result)))))
    ((STRING SIMPLE-STRING)
     (concatenate-to-string sequences))
    (t
     (let* ((length (apply '+ (mapcar 'length sequences)))
            (result (make-sequence result-type length))
            (i 0))
       (declare (type index i))
       (dolist (seq sequences result)
         (dotimes (j (length seq))
           (setf (elt result i) (elt seq j))
           (incf i)))))))
