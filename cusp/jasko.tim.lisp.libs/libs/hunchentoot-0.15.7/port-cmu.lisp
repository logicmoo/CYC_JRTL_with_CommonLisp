;;; -*- Mode: LISP; Syntax: COMMON-LISP; Package: HUNCHENTOOT; Base: 10 -*-
;;; $Header: /usr/local/cvsrep/hunchentoot/port-cmu.lisp,v 1.12 2008/04/08 14:39:18 edi Exp $

;;; Copyright (c) 2004-2008, Dr. Edmund Weitz. All rights reserved.

;;; Redistribution and use in source and binary forms, with or without
;;; modification, are permitted provided that the following conditions
;;; are met:

;;;   * Redistributions of source code must retain the above copyright
;;;     notice, this list of conditions and the following disclaimer.

;;;   * Redistributions in binary form must reproduce the above
;;;     copyright notice, this list of conditions and the following
;;;     disclaimer in the documentation and/or other materials
;;;     provided with the distribution.

;;; THIS SOFTWARE IS PROVIDED BY THE AUTHOR 'AS IS' AND ANY EXPRESSED
;;; OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
;;; WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
;;; ARE DISCLAIMED.  IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
;;; DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
;;; DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
;;; GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
;;; INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
;;; WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
;;; NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
;;; SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.

(in-package :hunchentoot)

(defun make-lock (name)
  "See CMUCL documentation for MP:MAKE-LOCK."
  #+:mp
  (mp:make-lock name)
  #-:mp
  name)

(defmacro with-lock ((lock) &body body)
  "See CMUCL documentation for MP:WITH-LOCK-HELD."
  #+:mp
  `(mp:with-lock-held (,lock) ,@body)
  #-:mp
  (declare (ignore lock))
  #-:mp
  `(progn ,@body))

(defmacro atomic-incf (place &optional (delta 1))
  "Like INCF but wrapped with MP:WITHOUT-SCHEDULING so other
threads can't interfer."
  `(#+:mp mp:without-scheduling #-:mp progn (incf ,place ,delta)))

#+:mp
(defun process-run-function (name function &rest args)
  "See CMUCL documentation for MP:MAKE-PROCESS."
  (mp:make-process (lambda ()
                     (apply function args))
                   :name name))

#-:mp
(defun process-run-function (name function &rest args)
  "Apply FUNCTION to ARGS - MP compatibility function"
  (declare (ignore name))
  (apply function args))

(defun process-kill (process)
  "See CMUCL documentation for MP:DESTROY-PROCESS."
  #+:mp
  (mp:destroy-process process)
  #-:mp
  (declare (ignore process)))

#+:mp
(define-symbol-macro *current-process*
    mp:*current-process*)

#-:mp
(defvar *current-process* "*CURRENT-PROCESS*"
  "Dummy stub variable for MP-less CMUCL.")

(defun process-allow-scheduling ()
  "See CMUCL documentation for MP:PROCESS-YIELD."
  #+:mp
  (mp:process-yield))

(defun %run-server (&key service address announce startup-done function &allow-other-keys)
  "Starts a TCP/IP server listening on the port SERVICE and calling
FUNCTION with the file descriptor for each incoming connection.  If
ADDRESS is not NIL, the server only receives connections for this
address.  Calls ANNOUNCE with the newly created socket, then calls
STARTUP-DONE with that socket if STARTUP-DONE is not NIL."
  (let (socket)
    (unwind-protect
         (progn
           (setq socket (ext:create-inet-listener service :stream
                                                  :reuse-address t
                                                  :backlog 5
                                                  :host (or address 0)))
           (funcall announce socket)
           (when startup-done
             (funcall startup-done socket))
           (loop (funcall function (ext:accept-tcp-connection socket))))
      (when socket
        (cl:ignore-errors
          (ext:close-socket socket))))))

#+:mp
(defun start-up-server (&rest args &key process-name announce &allow-other-keys)
  "Tries to \(partly) emulate LispWorks' COMM:START-UP-SERVER.  See
<http://www.lispworks.com/documentation/lw50/LWRM/html/lwref-56.htm>
for more info."
  (let (done)
    (labels ((startup-done (socket)
               (setf done socket))
             (open-socket-and-accept ()
               (handler-bind ((error (lambda (condition)
                                       (funcall announce nil condition)
                                       (setq done condition)
                                       (return-from open-socket-and-accept))))
                 (apply '%run-server :startup-done #'startup-done args))))
      (let ((listener-thread (process-run-function process-name #'open-socket-and-accept)))
        (mp:process-wait "Waiting for server to start" (lambda () done))
        (typecase done
          (condition (values nil done))
          (t listener-thread))))))

#-:mp
(defun start-up-server (&rest args &key &allow-other-keys)
  "Replacement for START-UP-SERVER for MP-less CMUCL."
  (apply '%run-server args))

(defun format-address (address)
  "Converts an integer in network byte order denoting an IP
address into the corresponding string representation."
  (format nil "~A.~A.~A.~A"
          (ash address -24)
          (logand (ash address -16) #xFF)
          (logand (ash address -8) #xFF)
          (logand address #xFF)))

(defun make-socket-stream (handle read-timeout write-timeout)
  "Accepts a socket `handle' HANDLE and creates and returns a
corresponding stream, setting its read and write timeout if
applicable.  Returns three other values - the address the request
arrived at, and the address and port of the remote host."
  (declare (ignore write-timeout))
  (let ((local-host (ext:get-socket-host-and-port handle)))
    (multiple-value-bind (remote-host remote-port)
        (ext:get-peer-host-and-port handle)
      (values (sys:make-fd-stream handle
                                  :input t :output t
                                  :element-type 'octet
                                  :auto-close t
                                  :buffering :full
                                  :timeout read-timeout
                                  :name (format nil "~A:~A" (format-address remote-host) remote-port))
              (format-address local-host)
              (format-address remote-host)
              remote-port))))

(defun get-backtrace (error)
  "This is the function that is used internally by Hunchentoot to
show or log backtraces.  It accepts a condition object ERROR and
returns a string with the corresponding backtrace."
  (declare (ignore error))
  (with-output-to-string (s)
    (let ((debug:*debug-print-level* nil)
          (debug:*debug-print-length* nil))
      (debug:backtrace most-positive-fixnum s))))

