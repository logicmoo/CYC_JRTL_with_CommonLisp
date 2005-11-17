;;; swank-sbcl.lisp

;;; Adapted from SLIME.

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
                                     :element-type 'base-char
                                     :external-format :ISO-8859-1))

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

;;;; Definitions

(defvar *debug-definition-finding* nil
  "When true don't handle errors while looking for definitions.
   This is useful when debugging the definition-finding code.")

(defun make-location (buffer position)
  (list :location buffer position))

(defun function-source-location (function &optional name)
  "Try to find the canonical source location of FUNCTION."
  (let* ((def (sb-introspect:find-definition-source function))
         (pathname (sb-introspect:definition-source-pathname def))
         (path (sb-introspect:definition-source-form-path def))
         (position (sb-introspect:definition-source-character-offset def)))
    (unless pathname
      (return-from function-source-location
                   (list :error (format nil "No filename for: ~S" function))))
    (multiple-value-bind (truename condition)
      (ignore-errors (truename pathname))
      (when condition
        (return-from function-source-location
                     (list :error (format nil "~A" condition))))
      (make-location
       (list :file (namestring truename))
       ;; source-paths depend on the file having been compiled with
       ;; lotsa debugging.  If not present, return the function name
       ;; for emacs to attempt to find with a regex
       (cond (path (list :source-path path position))
             (t (list :function-name
                      (or (and name (string name))
                          (string (sb-kernel:%fun-name function))))))))))

(defun safe-function-source-location (fun name)
  (if *debug-definition-finding*
      (function-source-location fun name)
      (handler-case (function-source-location fun name)
        (error (e)
               (list (list :error (format nil "Error: ~A" e)))))))

(defun method-definitions (gf)
  (let ((methods (sb-mop:generic-function-methods gf))
        (name (sb-mop:generic-function-name gf)))
    (loop for method in methods
      collect (list `("method"
                      ,(princ-to-string name)
                      ,(princ-to-string (sb-pcl::unparse-specializers method)))
                    (safe-function-source-location method name)))))

(defun function-definitions (name)
    (cond ((and (symbolp name) (macro-function name))
           (list (list `("defmacro"
                         ,(princ-to-string name))
                       (safe-function-source-location (macro-function name) name))))
          ((fboundp name)
           (let ((fn (fdefinition name)))
             (typecase fn
               (generic-function
                (cons (list `("defgeneric"
                              ,(princ-to-string name))
                            (safe-function-source-location fn name))
                      (method-definitions fn)))
               (t
                (list (list `("function"
                              ,(princ-to-string name))
                            (safe-function-source-location fn name)))))))))

(defun find-definitions (name)
  (function-definitions name))
