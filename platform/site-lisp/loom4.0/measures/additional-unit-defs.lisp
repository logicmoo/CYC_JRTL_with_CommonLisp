(in-package "MEASURES")

(defun f-to-c (x) (* 5/9 (- x 32)))
(defun c-to-f (x) (+ 32 (* 9/5 x)))
(defun k-to-c (x) (- x 27316/100))
(defun c-to-k (x) (+ x 27316/100))


(defspecial-measure temperature "C"
  :units (("F" f-to-c c-to-f)
	  ("K" k-to-c c-to-k)
	  ("oC" identity identity)
	  ("oF" f-to-c c-to-f)
	  ("oK" k-to-c c-to-k)))

#|
(loop for m in (list-all-measures)
    do (loom:define-concept (intern (format nil "~A-MEASURE" (ms-name m)) "LOOM")
	   :is-primitive 'loom::measure
	   :predicate `((x) (and (dim-number-p x)
				 (eql (dim-prim-id x)
				      ,(ms-prim-id m)))))
       (export (intern (format nil "~A-MEASURE" (ms-name m)) "LOOM") "LOOM")
       )
|#
