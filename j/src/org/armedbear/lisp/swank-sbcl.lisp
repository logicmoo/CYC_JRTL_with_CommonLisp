;;; swank-sbcl.lisp

;;; From SLIME.

(eval-when (:compile-toplevel :load-toplevel :execute)
  (require '#:sb-bsd-sockets)
  (require '#:sb-introspect))

(in-package #:swank)

(defun resolve-hostname (name)
  (car (sb-bsd-sockets:host-ent-addresses
        (sb-bsd-sockets:get-host-by-name name))))

(defun socket-fd (socket)
  (etypecase socket
    (fixnum socket)
    (sb-bsd-sockets:socket (sb-bsd-sockets:socket-file-descriptor socket))
    (file-stream (sb-sys:fd-stream-fd socket))))

(defun make-socket-io-stream (socket)
  (sb-bsd-sockets:socket-make-stream socket
                                     :output t
                                     :input t
                                     :element-type 'base-char))

(defun accept (socket)
  "Like socket-accept, but retry on EAGAIN."
  (loop (handler-case
            (return (sb-bsd-sockets:socket-accept socket))
          (sb-bsd-sockets:interrupted-error ()))))

(defun create-socket (host port)
  (let ((socket (make-instance 'sb-bsd-sockets:inet-socket
			       :type :stream
			       :protocol :tcp)))
    (setf (sb-bsd-sockets:sockopt-reuse-address socket) t)
    (sb-bsd-sockets:socket-bind socket (resolve-hostname host) port)
    (sb-bsd-sockets:socket-listen socket 5)
    socket))

(defun local-port (socket)
  (nth-value 1 (sb-bsd-sockets:socket-name socket)))

(defun close-socket (socket)
  (sb-sys:invalidate-descriptor (socket-fd socket))
  (sb-bsd-sockets:socket-close socket))

(defun accept-connection (socket)
  (make-socket-io-stream (accept socket)))

(defun make-thread (function)
  (sb-thread:make-thread function))

(defun arglist (function-name)
  (sb-introspect:function-arglist function-name))
