;;; 
;;; gzip.lisp
;;; 
;;; Created: 2005-03-14 by Zach Beane <xach@xach.com>
;;; 
;;; An example use of the salza DEFLATE interface functions.
;;; 
;;; 
;;; $Id: gzip.lisp,v 1.4 2005/03/18 21:45:40 xach Exp $

(defpackage :gzip
  (:use :cl :salza-deflate)
  (:export :gzip))

(in-package :gzip)

(eval-when (:compile-toplevel :load-toplevel :execute)
  (defconstant +gzip-signature+
    (if (boundp '+gzip-signature+)
        (symbol-value '+gzip-signature+)
        #(#x1F #x8B))))

(defconstant +gzip-deflate-compression+ 8)
(defconstant +gzip-flags+ 0)

(defconstant +gzip-fast-compression+ 4)
(defconstant +gzip-unix-os+ 3)

(defun write-gzip-header (stream)
  (write-sequence +gzip-signature+ stream)
  (write-byte +gzip-deflate-compression+ stream)
  (write-byte +gzip-flags+ stream)
  ;; mtime
  (write-sequence #(0 0 0 0) stream)
  (write-byte +gzip-fast-compression+ stream)
  (write-byte +gzip-unix-os+ stream))

(defun write-gzip-data (input output)
  (let* ((input-buffer (make-array 8192 :element-type '(unsigned-byte 8)))
         (compress-buffer (make-array 8192
                                      :element-type '(unsigned-byte 8)))
         (callback (lambda (deflate-stream)
                     (write-sequence compress-buffer output
                                     :end (deflate-stream-pos deflate-stream))
                     (setf (deflate-stream-pos deflate-stream) 0)))
         (deflate-stream (make-deflate-stream compress-buffer
                                              :callback callback))
         (crc-high #xFFFF)
         (crc-low #xFFFF)
         (size 0))
    (flet ((write-uint32 (value)
             (write-byte (ldb (byte 8 0) value) output)
             (write-byte (ldb (byte 8 8) value) output)
             (write-byte (ldb (byte 8 16) value) output)
             (write-byte (ldb (byte 8 24) value) output)))
      (start-deflate-stream deflate-stream)
      (loop
       (let ((end (read-sequence input-buffer input)))
           (incf size end)
           (deflate-write-sequence input-buffer deflate-stream :end end)
           (unless (zerop end)
             (multiple-value-setq (crc-high crc-low)
               (crc32 crc-high crc-low input-buffer end)))
           (when (zerop end)
             (finish-deflate-stream deflate-stream)
             (setf crc-high (logxor crc-high #xFFFF)
                   crc-low (logxor crc-low #xFFFF))
             (write-uint32 (logior (ash crc-high 16) crc-low))
             (write-uint32 size)
             (return)))))))

(defun gzip (input-file output-file)
  (with-open-file (input input-file
                   :direction :input
                   :element-type '(unsigned-byte 8))
    (with-open-file (output output-file
                     :direction :output
                     :if-exists :supersede
                     :element-type '(unsigned-byte 8))
      (write-gzip-header output)
      (write-gzip-data input output)
      (truename output))))