;;; byte-io.lisp
;;;
;;; Copyright (C) 2004-2005 Peter Graves
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

(defun write-byte (byte stream)
  (declare (type stream stream))
  (let ((element-type (stream-element-type stream)))
    (require-type byte element-type)
    (let ((width (cadr element-type)))
      (if (= width 8)
          (write-8-bits (the (unsigned-byte 8) byte) stream)
          (let ((bytes ()))
            (dotimes (i (/ width 8))
              (push (logand byte #xff) bytes)
              (setf byte (ash byte -8)))
            (dolist (b bytes)
              (write-8-bits (the (unsigned-byte 8) b) stream)))))
    byte))

(defun read-byte (stream &optional (eof-error-p t) eof-value)
  (declare (type stream stream))
  (let* ((element-type (stream-element-type stream)))
    (unless element-type
      (if eof-error-p
          (error 'end-of-file :stream stream)
          (return-from read-byte eof-value)))
    (unless (consp element-type)
      (error 'simple-type-error
             :format-control "READ-BYTE: unsupported element type ~S."
             :format-arguments (list element-type)))
    (let ((width (cadr element-type)))
      (if (= width 8)
          (read-8-bits stream eof-error-p eof-value)
          (let ((result 0))
            (dotimes (i (/ width 8))
              (let ((byte (read-8-bits stream eof-error-p eof-value)))
                (when (eq byte eof-value)
                  (return-from read-byte eof-value))
                (setf result (ash result 8))
                (setf result (+ result byte))))
            (if (and (eq (car element-type) 'signed-byte)
                     (not (zerop (logand result (expt 2 (1- width))))))
                (- result (expt 2 width))
                result))))))
