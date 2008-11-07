; param comes from java, so accessing it require
; calling jobject-lisp-value on it
(defun void-function (param)
  (format t "in void-function, param: ~a~%" (jobject-lisp-value param)))

; params come from java, so accessing them require
; calling jobject-lisp-value on them
(defun int-function (jparam1 jparam2)
  (let* ((param1 (jobject-lisp-value jparam1))
	 (param2 (jobject-lisp-value jparam2))
	 (result (+ param1 param2)))
    (format t "in int-function, params: ~a ~a~%result: ~a~%" 
	    param1 param2 result) 
    result))