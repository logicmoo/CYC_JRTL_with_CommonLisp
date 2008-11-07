; we need to get the
; 1) class (Main)
; 2) classes of the parameters (int)
; 3) method reference (getting that requires the class
; of our object and the classes of the parameters

; After that we can invoke the function with jcall,
; giving the method reference, the object and the parameters.
; The result is a lisp object (no need to do jobject-lisp-value), 
; unless we invoke the method
; with jcall-raw. 
(defun void-function (param)
  (let* ((class (jclass "Main"))
	 (intclass (jclass "int"))
	 (method (jmethod class "addTwoNumbers" intclass intclass))
	 (result (jcall method param 2 4)))
    (format t "in void-function, result of calling addTwoNumbers(2, 4): ~a~%" result)))

