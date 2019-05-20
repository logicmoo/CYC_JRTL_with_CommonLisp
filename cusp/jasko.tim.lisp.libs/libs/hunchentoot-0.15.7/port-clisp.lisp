;;; -*- Mode: LISP; Syntax: COMMON-LISP; Package: HUNCHENTOOT; Base: 10; -*-
;;; $Header: /usr/local/cvsrep/hunchentoot/port-clisp.lisp,v 1.5 2008/04/08 14:39:17 edi Exp $

;;; Copyright (c) 2006, Luis Oliveira <loliveira@common-lisp.net>.
;;; Copyright (c) 2007, Anton Vodonosov <avodonosov@yandex.ru>.
;;; Copyright (c) 2007-2008, Dr. Edmund Weitz.
;;; All rights reserved.

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

(defmacro with-lock ((lock) &body body)
  "Executes the BODY.  LOCK is ignored because CLISP doesn't support
threads."
  (declare (ignore lock))
  `(progn ,@body))

(defmacro atomic-incf (place &optional (delta 1))
  "Expands to INCF.  No special semantics because CLISP doesn't support threads."
  `(incf ,place ,delta))

(defun make-lock (lock)
  "CLISP doesn't support threads, so the function just returns its
argument LOCK."
  lock)

(defvar *current-process* "*CURRENT-PROCESS*"
  "CLISP doesn't support threads, so this value is just a dummy stub.")

(defun process-run-function (name function &rest args)
  "In a multithreaded environment, this would run FUNCTION in a new
thread, but in CLISP we just apply FUNCTION to ARGS."
  (declare (ignore name))
  (apply function args))

(defun process-allow-scheduling ()
  "Does nothing because CLISP doesn't support threads."
  )

(defun process-kill (process)
  "Does nothing because CLISP doesn't support threads."
  (declare (ignore process))
  )

(defun start-up-server (&key service address process-name announce function &allow-other-keys)
  "Tries to \(partly) emulate LispWorks' COMM:START-UP-SERVER.  See
<http://www.lispworks.com/documentation/lw50/LWRM/html/lwref-56.htm>
for more info."
  (declare (ignore process-name))
  (cl:ignore-errors
   (let ((socket (socket:socket-server service :interface address :backlog 5)))
      (funcall announce socket)
      (unwind-protect
           (loop (funcall function 
                          (socket:socket-accept socket 
                                                :buffered t 
                                                :element-type 'octet)))
        (cl:ignore-errors
          (socket:socket-server-close socket))))))

(defun make-socket-stream (socket read-timeout write-timeout)
  "Accepts a socket `handle' HANDLE and creates and returns a
corresponding stream, setting its read and write timeout if
applicable.  Returns three other values - the address the request
arrived at, and the address and port of the remote host."
  (socket:socket-options socket
                         :SO-RCVTIMEO read-timeout
                         :SO-SNDTIMEO write-timeout)
  (multiple-value-bind (remote-host remote-port)
      (socket:socket-stream-peer socket)
    (values socket
            (nth-value 1 (socket:socket-stream-local socket))
            remote-host
            remote-port)))

;;; the following code is from cusp-clisp.lisp (SLIME):

(defun format-frame (frame)
  "Returns a string describing the call stack frame object FRAME."
  (string-trim #(#\Newline #\Space #\Tab)
               (with-output-to-string (out)
                 (sys::describe-frame out frame))))

(defun function-frame-p (formatted-frame)
  "Determines whether the frame described by FORMATTED-FRAME 
is a function frame."
  (char= #\< (aref formatted-frame 0)))

(defun get-backtrace (error)
  "This is the function that is used internally by Hunchentoot to
show or log backtraces."
  (declare (ignore error))
  (with-output-to-string (stream)
    (do ((last nil frame)
         (frame (sys::the-frame) (sys::frame-up-1 frame 1)))
        ((eq frame last))
      (let ((formatted-frame (format-frame frame)))
        (when (function-frame-p formatted-frame)
          (write-line (subseq formatted-frame (+ (position #\> formatted-frame) 2)
                              (position #\Newline formatted-frame))
                      stream))))))
