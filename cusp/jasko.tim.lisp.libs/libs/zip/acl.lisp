;;; native implementation of the portable functions in gray.lisp

(in-package :zip)

(defun default-external-format ()
  (excl:find-external-format :default))

(defun octets-to-string (octets ef)
  (excl:octets-to-string octets :external-format ef))

(defun string-to-octets (string ef)
  (excl:string-to-octets string
			 :external-format ef
			 :null-terminate nil))

(defun make-buffer-output-stream (outbuf)
  (excl:make-buffer-output-stream outbuf))

(excl:def-stream-class truncating-stream (excl:single-channel-simple-stream)
    ((size :initarg :size)
     (pos :initform 0)))

(defun make-octets (length)
  (make-array length :element-type '(unsigned-byte 8) :initial-element 0)) 

(defmethod excl:device-open ((stream truncating-stream)
                             #+(version>= 7 0) slots
                             options)
  (declare (ignore options #+(version>= 7 0) slots))
  (excl:with-stream-class (truncating-stream stream)
    (setf (slot-value stream 'excl::buffer)
          (make-octets (excl:device-buffer-length stream)))
    (excl:add-stream-instance-flags stream :simple :input)
    (setf (stream-external-format stream) :utf8))
  t)

(defmethod excl:device-read
    ((stream truncating-stream) buffer start end blocking)
  (unless buffer
    (setf buffer (slot-value stream 'excl::buffer))) 
  (unless end (setf end (length buffer)))
  (with-slots (size pos) stream
    (cond
      ((eql size pos)
        -1)
      (t
        (setf end (+ start (min (- end start) (- size pos))))
        (let ((result (call-next-method stream buffer start end blocking)))
          (unless (minusp result)
            (incf pos result))
          result)))))
