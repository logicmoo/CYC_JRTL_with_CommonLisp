;;; swank-abcl.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: swank-abcl.lisp,v 1.4 2004-09-06 01:31:07 piso Exp $
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
  (multiple-value-bind (arglist known-p) (ext:arglist function-name)
    (if known-p
        arglist
        :not-available)))

(defun find-definitions (name)
  (when (ext:autoloadp name)
    (let ((*load-verbose* nil)
          (*load-print* nil)
          (ext:*autoload-verbose* nil))
      (ext:resolve name)))
  (when (ext:source name)
    `(((,name)
       (:location
        (:file ,(namestring (ext:source-pathname name)))
        (:position ,(or (ext:source-file-position name) 0) t)
        (:function-name ,(symbol-name name)))))))
