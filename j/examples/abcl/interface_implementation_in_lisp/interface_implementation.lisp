; first we define a class hierarchy. No slots defined,
; we don't need them in the example.
(defclass base ())

(defclass derived1 (base))

(defclass derived2 (base))

; then a couple of generic methods
(defgeneric invoke (param) (:documentation "Sample generic function"))

(defgeneric invoke2 (param) (:documentation "Sample generic function"))

; and their methods, for different classes
(defmethod invoke ((param derived1))
  (format t "in derived1 invoke~%"))

(defmethod invoke ((param derived2))
  (format t "in derived2 invoke~%"))

(defmethod invoke2 ((param derived1))
  (format t "in derived1 invoke2~%"))

(defmethod invoke2 ((param derived2))
  (format t "in derived2 invoke2~%"))

; closure for interface implementation, closes
; over a provided object and calls the invoke
; method with the object. Thus the firstFunction()
; in MyInterface will call the invoke method.
(defun make-first-function (object)
  (lambda () (invoke object)))

; closure for interface implementation, closes
; over a provided object and invokes the invoke2
; method with the object. Thus the secondFunction()
; in MyInterface will call the invoke2 method.
(defun make-second-function (object)
  (lambda () (invoke2 object)))

; gets an interface implementation, uses an instance of
; class derived1
(defun get-interface ()
  (let ((firstobject (make-instance 'derived1)))
    (jinterface-implementation "MyInterface"
			       "firstFunction" 
			       (make-first-function firstobject)
			       "secondFunction"
			       (make-second-function firstobject))))

; gets an interface implementation, uses an instance of
; class derived2
(defun get-another-interface ()
  (let ((secondobject (make-instance 'derived2)))
    (jinterface-implementation "MyInterface"
			       "firstFunction" 
			       (make-first-function secondobject)
			       "secondFunction"
			       (make-second-function secondobject))))
						
