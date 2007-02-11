;;; swank-abcl.lisp
;;;
;;; Copyright (C) 2004-2007 Peter Graves
;;; $Id: swank-abcl.lisp,v 1.11 2007-02-11 15:47:46 piso Exp $
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

(eval-when (:compile-toplevel :load-toplevel :execute)
  (sys:load-system-file "swank-package"))

(in-package #:swank)

(defun create-socket (host port)
  (declare (ignore host))
  (ext:make-server-socket port))

(defun local-port (socket)
  (java:jcall (java:jmethod "java.net.ServerSocket" "getLocalPort") socket))

(defun close-socket (socket)
  (ext:server-socket-close socket))

(defun accept-connection (socket)
  (ext:get-socket-stream (ext:socket-accept socket)))

(defun make-thread (function)
  (ext:make-thread function))

(defun arglist (function-name)
  (if (ext:autoloadp function-name)
      :not-available
      (multiple-value-bind (arglist known-p) (ext:arglist function-name)
        (if known-p
            arglist
            :not-available))))

(defun find-definitions (name)
  (when (ext:autoloadp name)
    (let ((*load-verbose* nil)
          (*load-print* nil)
          (ext:*autoload-verbose* nil))
      (ext:resolve name)))
  (let ((source (ext:source name)))
    (cond ((and source (not (eq source :top-level)))
           `((,(princ-to-string name)
              (:location
               (:file ,(namestring (ext:source-pathname name)))
               (:position ,(or (ext:source-file-position name) 0) t)
               (:function-name ,(symbol-name name))))))
          ((not (null ext:*lisp-home*))
           (let ((tagfile (merge-pathnames "tags" ext:*lisp-home*)))
             (when (and tagfile (probe-file tagfile))
               (with-open-file (s tagfile)
                 (loop
                   (let ((text (read-line s nil s)))
                     (cond ((eq text s)
                            (return))
                           ((string-equal name (string (read-from-string text nil nil)))
                            ;; Found it!
                            (with-input-from-string (string-stream text)
                              (let* ((symbol (read string-stream text nil nil)) ; Ignored.
                                     (file (read string-stream text nil nil)))
                                (declare (ignore symbol))
                                (return `((,(princ-to-string name)
                                           (:location
                                            (:file ,(namestring file))))))))))))))))
          (t
           nil))))

(defun swank-interrupt-lisp ()
  (ext:interrupt-lisp))
