;;;; 2019-06-14 22:53:40
;;;; tests for your lisp code

(in-package :jnil)

(define-test main-test
  (assert-equal 0 (main)) ;should pass
  (assert-equal 1 (main)) ;should fail
)
