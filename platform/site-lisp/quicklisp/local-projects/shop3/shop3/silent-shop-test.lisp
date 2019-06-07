
(defmethod asdf:perform :around ((op asdf:test-op)
                                 (component shop3-asd::shop-tester-mixin))
  (let ((shop::*silent* t))
    (declare (special shop::*silent*))
    (call-next-method)))
