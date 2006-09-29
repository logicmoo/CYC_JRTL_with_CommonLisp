;;; swank-protocol.lisp
;;;
;;; Copyright (C) 2004-2006 Peter Graves
;;; $Id: swank-protocol.lisp,v 1.7 2006-09-29 11:38:53 piso Exp $
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

;;; Adapted from SLIME, the "Superior Lisp Interaction Mode for Emacs",
;;; originally written by Eric Marsden, Luke Gorrie and Helmut Eller.

(defpackage #:swank-protocol (:use #:cl))

(in-package #:swank-protocol)

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(encode-message decode-message port-file)))

(defvar *swank-io-package*
  (let ((package (make-package :swank-io-package :use '())))
    (import '(nil t quote) package)
    package))

(defun prin1-to-string-for-emacs (object)
  (with-standard-io-syntax
    (let ((*print-case* :upcase)
          (*print-readably* nil)
          (*print-pretty* nil)
          (*package* *swank-io-package*))
      (prin1-to-string object))))

(defun encode-message (message stream)
  (let* ((string (prin1-to-string-for-emacs message))
         (length (1+ (length string))))
    (write-char (code-char (ldb (byte 8 16) length)) stream)
    (write-char (code-char (ldb (byte 8  8) length)) stream)
    (write-char (code-char (ldb (byte 8  0) length)) stream)
    (write-string string stream)
    (terpri stream)
    (force-output stream)))

(defun read-form (string)
  (with-standard-io-syntax
    (read-from-string string)))

(defun next-byte (stream)
  (char-code (read-char stream t)))

(defun decode-message (stream)
  (let* ((length (logior (ash (next-byte stream) 16)
                         (ash (next-byte stream) 8)
                         (next-byte stream)))
         (string (make-string length))
         (pos (read-sequence string stream)))
    (unless (= pos length)
      (format t "Short read: length=~D  pos=~D~%" length pos))
    (let ((form (read-form string)))
      form)))

#+(or abcl xcl)
(defun port-file ()
  (merge-pathnames ".j/swank"
                   (if (ext:featurep :windows) "C:\\" (user-homedir-pathname))))

#-(or abcl xcl)
(defun port-file ()
  (merge-pathnames ".j/swank" (user-homedir-pathname)))

(provide '#:swank-protocol)
