;;; byte-io.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: byte-io.lisp,v 1.3 2004-02-15 19:29:17 piso Exp $
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

(defun write-byte (byte stream)
  (let* ((element-type (stream-element-type stream))
         (width (cadr element-type)))
    (require-type byte element-type)
    (if (= width 8)
        (write-8-bits byte stream)
        (let ((bytes ()))
          (dotimes (i (/ width 8))
            (push (logand byte #xff) bytes)
            (setf byte (ash byte -8)))
          (dolist (b bytes)
            (write-8-bits b stream))))))

(defun read-byte (stream &optional (eof-error-p t) eof-value)
  (let* ((element-type (stream-element-type stream))
         (width (cadr element-type)))
    (unless element-type
      (if eof-error-p
          (error 'end-of-file :stream stream)
          (return-from read-byte eof-value)))
    (if (= width 8)
        (read-8-bits stream eof-error-p eof-value)
        (let ((result 0))
          (dotimes (i (/ width 8))
            (let ((byte (read-8-bits stream eof-error-p eof-value)))
              (setf result (ash result 8))
              (setf result (+ result byte))))
          (if (and (eq (car element-type) 'signed-byte)
                   (not (zerop (logand result (expt 2 (1- width))))))
              (- result (expt 2 width))
              result)))))
