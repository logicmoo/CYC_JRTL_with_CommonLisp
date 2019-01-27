

(defparameter *UVMt* (foc "UniversalVocabularyMt"))
  
(csetq *prolog-call* (foc "prolog:call"))
(csetq *prolog-member* (foc "prolog:member")) 

  (DEFINE-EVALUATION-DEFN prolog-call-unify (&rest body)
    (ret (prolog-unify body)))

  (cyc-assert `(#$arity ,*prolog-call* 1) *UVMt*) 
  (cyc-assert `(#$isa ,*prolog-call* #$Predicate) *UVMt*) 
  (cyc-assert `(#$arity ,*prolog-member* 2) *UVMt*) 
  (cyc-assert `(#$isa ,*prolog-member* #$Predicate) *UVMt*) 
  (cyc-assert `(#$comment ,*prolog-call* "(#$prolog:call (#$prolog:member ?WHAT (#$TheList 1 2 3)))") *UVMt*) 
		   
  (inference-removal-module :removal-prolog-call-unify
     `(:sense :pos 
    	:predicate ,*prolog-call* 
    	:required-pattern (,*prolog-call* :not-fully-bound) 
    	:cost-expression 0 :completeness :complete 
        :input-extract-pattern (:template  (,*prolog-call* (:bind the-value)) (:value the-value))
    	:input-verify-pattern :anything
    	:output-generate-pattern (:call prolog-call-unify :input)
    	:output-construct-pattern  (,*prolog-call* (:value the-value))
    	:documentation "(#$prolog:call <not-fully-bound>)"
    	:example "(*#$prolog:call (#$prolog:member ?WHAT (#$TheList 1 2 3))"))
    
       
    (register-solely-specific-removal-module-predicate *prolog-call*)
 


