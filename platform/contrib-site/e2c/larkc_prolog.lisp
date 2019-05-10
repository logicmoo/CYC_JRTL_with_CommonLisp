;;;{{{DOC
;;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-
;;
;; @module LARKC-PROLOG
;;
;; @owner dmiles
;; 
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; removal modules for
;;   #$prologCall
;;   #$prologAsserted
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;}}}EDOC

(in-package "CYC")

(cvs-id "$Id: larkc_prolog.lisp 0 2018-12-04 13:39:36Z dmiles $")

(defparameter *UVMt* (foc "UniversalVocabularyMt"))

(foc "prologAsserted")
(foc "prologCall")

'(load-ke-text-data "
  
constant: PrologPredFn.
isa: Function PredicateDenotingFunction.
artiy: 1.
resultIsa: Relation.
  
  
")

  (cyc-assert `(#$arity #$prologCall 2) *UVMt*) 
  (cyc-assert `(#$isa #$prologCall #$Predicate) *UVMt*) 
  (cyc-assert `(#$comment #$prologCall "(#$prologCall ?MT ((#$OperatorFn \"member\") ?WHAT (#$TheList 1 2 3)))") *UVMt*) 

  (cyc-assert `(#$arity #$prologAsserted 2) *UVMt*) 
  (cyc-assert `(#$isa #$prologAsserted #$Predicate) *UVMt*) 
  (cyc-assert `(#$comment #$prologAsserted "(#$prologAsserted ?MT (#$member ?WHAT (#$TheList 1 2 3)))") *UVMt*) 


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; #$prologCall literals
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(register-solely-specific-removal-module-predicate #$prologCall)

(inference-preference-module
 :prolog-mt-prop-pos
 '(
   :sense :pos
   :predicate #$prologCall
   :required-pattern (#$prologCall :not-fully-bound :variable)
 ;;  :preference-level :disallowed
        :preference-level :grossly-dispreferred    
   ))
;;   (let ((*PACKAGE* (find-package :CYC))) (sl:load "e2c/larkc_prolog.lisp"))
(inference-preference-module
 :prolog-in-what-mts-pos
 '(
   :sense :pos
   :predicate #$prologCall
   :required-pattern (#$prologCall :not-fully-bound (:not :variable))
;;   :preference-level  :disallowed ;; Was :grossly-dispreferred
       :preference-level :grossly-dispreferred
           ))

(define-private make-prolog-supports (mt sentence &optional recursive-justification)
  (cdestructuring-bind (support &rest more-supports)
      (make-prolog-justification mt sentence recursive-justification)
    (ret (values support more-supports))))

(define-public make-prolog-justification (mt sentence &optional recursive-justification)
  (ret (fif (cand *recursive-prolog-justifications?*
		  recursive-justification)
	    recursive-justification
	    (list (make-prolog-support mt sentence)))))

(define-public make-prolog-support (mt sentence)
  (clet ((prolog-sentence (make-binary-formula #$prologCall mt sentence)))
    ;; *prolog-mt* is used since the #$prologCall formula is considered decontextualized
    (ret (make-hl-support :query prolog-sentence *prolog-mt*))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-formula-check
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; modelled on :removal-true-sentence-check

(defparameter-private
    *default-prolog-formula-check-cost*
    0.75) ;; was 1.5

(define-private removal-prolog-formula-check-expand (asent &optional sense)
  (ignore sense)
  (clet ((mt (atomic-sentence-arg1 asent))
	 (sentence (atomic-sentence-arg2 asent)))
    (pwhen (removal-prolog-check-query mt sentence)
      (clet ((hl-support (make-prolog-support mt sentence)))
	(removal-add-node hl-support))))
  (ret nil))

(inference-removal-module
 :removal-prolog-formula-check
 '(
   :sense :pos
   :predicate #$prologCall
   :required-pattern
   (#$prologCall :fort
    (:and
     (:fully-bound . :fully-bound)
     ;; special case handled below
     (:not        ((:test inference-predicate-p) . :anything))
     ;; special case handled below
     (:not (#$not ((:test inference-predicate-p) . :anything)))))

   :cost-expression *default-prolog-formula-check-cost*
   :expand removal-prolog-formula-check-expand

   :documentation
   "(#$prologCall <mt> (<non-predicate> . <fully-bound>))
    by recursively querying sentence in <mt>
    and succeeding if the query succeeds"

   :example
   "(#$prologCall #$BaseKB
     (#$thereExists ?SPEC
      (#$genls ?SPEC #$BinaryRelation)))"
   ))

;; internals

(define-private removal-prolog-check-query (mt sentence)
  (ret (inference-known-sentence-recursive-query sentence mt 1)))

;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-pos-gaf
;;;;;;;;;;;;;;;;;;;;;;;

;; special case : positive gaf

;; modelled on :removal-true-sentence-pos-gaf

(define-private removal-prolog-pos-gaf-cost (asent &optional sense)
  (ignore sense)
  (clet ((mt (atomic-sentence-arg1 asent))
	 (gaf-sentence (atomic-sentence-arg2 asent))
	 cost)
    (with-inference-mt-relevance mt
      (csetq cost (literal-removal-cost gaf-sentence :pos)))
    (ret cost)))

(define-private removal-prolog-pos-gaf-expand (asent &optional sense)
  (ignore sense)
  (clet ((mt (atomic-sentence-arg1 asent))
	 (gaf-sentence (atomic-sentence-arg2 asent))
	 (results (removal-prolog-pos-gaf-query mt gaf-sentence)))
    (pwhen results
      (cdolist (bindings results)
	(clet ((substituted-gaf-sentence (subst-bindings bindings gaf-sentence))
	       (hl-support (make-prolog-support mt substituted-gaf-sentence)))
	  (removal-add-node hl-support bindings)))))
  (ret nil))

(inference-removal-module
 :removal-prolog-pos-gaf
 '(
   :sense :pos
   :predicate #$prologCall
   :required-pattern
   (#$prologCall :fort
    ((:test inference-predicate-p) . :anything))
   
   :cost   removal-prolog-pos-gaf-cost
   :expand removal-prolog-pos-gaf-expand

   :documentation
   "(#$prologCall <mt> (<predicate> . <whatever>))
    by recursively querying sentence (<predicate> . <whatever>)
    in <mt>"

   :example
   "(#$prologCall #$BaseKB
     (#$genls ?SPEC #$BinaryRelation))"
   ))

;; internals

(define-private removal-prolog-pos-gaf-query (mt gaf-sentence)
  (ret (inference-known-sentence-removal-query gaf-sentence mt :true)))

;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-neg-gaf
;;;;;;;;;;;;;;;;;;;;;;;

;; special case : closed negative gaf

;; modelled on :removal-true-sentence-neg-gaf

(define-private removal-prolog-neg-gaf-cost (asent &optional sense)
  (ignore sense)
  (clet ((mt (atomic-sentence-arg1 asent))
	 (negated-gaf-sentence (atomic-sentence-arg2 asent))
	 (gaf-sentence (sentence-arg1 negated-gaf-sentence))
	 cost)
    (with-inference-mt-relevance mt
      (csetq cost (literal-removal-cost gaf-sentence :neg)))
    (ret cost)))

(define-private removal-prolog-neg-gaf-expand (asent &optional sense)
  (ignore sense)
  (clet ((mt (atomic-sentence-arg1 asent))
	 (negated-gaf-sentence (atomic-sentence-arg2 asent))
	 (gaf-sentence (sentence-arg1 negated-gaf-sentence))
	 (results (removal-prolog-neg-gaf-query mt gaf-sentence)))
    (pwhen results
      (cdolist (bindings results)
	(clet ((substituted-gaf-sentence (subst-bindings bindings gaf-sentence))
	       (hl-support (make-prolog-support mt (negate substituted-gaf-sentence))))
	  (removal-add-node hl-support bindings)))))
  (ret nil))

(inference-removal-module
 :removal-prolog-neg-gaf
 '(
   :sense :pos
   :predicate #$prologCall
   :required-pattern
   (#$prologCall :fort
    (#$not ((:test inference-predicate-p) . :fully-bound)))
   
   :cost   removal-prolog-neg-gaf-cost
   :expand removal-prolog-neg-gaf-expand

   :documentation
   "(#$prologCall <mt> (#$not (<predicate> . <fully-bound>)))
    by recursively querying sentence (#$not (<predicate> . <fully-bound>))
    in <mt>"

   :example
   "(#$prologCall #$BaseKB
     (#$not (#$genls #$Microtheory #$BinaryPredicate)))"
   ))

;; internals

(define-private removal-prolog-neg-gaf-query (mt gaf-sentence)
  ;; @note maybe disable minimization here?
  (ret (inference-known-sentence-removal-query gaf-sentence mt :false)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-pos-gaf-mt-lookup
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defparameter-private
    *estimated-prolog-mts-per-formula*
    2
  "Estimated number of Prolog MTs in which a true formula is computed to reside.")

(defparameter-private *default-prolog-pos-gaf-mt-lookup-cost* *estimated-prolog-mts-per-formula*)

(define-private removal-prolog-pos-gaf-mt-lookup-expand (asent &optional sense)
  (ignore sense)
  (clet ((arg1 (atomic-sentence-arg1 asent))
	 (gaf-sentence (atomic-sentence-arg2 asent)))
    (clet ((mt-support-combinations (inference-mts-where-gaf-sentence-true-justified-memoized gaf-sentence)))
      (cdolist (mt-support-combination mt-support-combinations)
	(cdestructuring-bind (mts justification) mt-support-combination
	  (cdolist (mt mts)
	    (clet ((bindings (genl-mt-unify arg1 mt)))
	      (pwhen bindings
		(cmultiple-value-bind (support more-supports)
		    (make-prolog-supports mt gaf-sentence justification)
		  (removal-add-node support bindings more-supports)))))))))
  (ret nil))

(inference-removal-module
 :removal-prolog-pos-gaf-mt-lookup
 '(
   :sense :pos
   :predicate #$prologCall
   :required-pattern
   (#$prologCall :not-fully-bound
    ((:test inference-predicate-p) . :fully-bound))
   
   :cost-expression *default-prolog-pos-gaf-mt-lookup-cost*
   :completeness    :grossly-incomplete
   :expand removal-prolog-pos-gaf-mt-lookup-expand

   :documentation
   "(#$prologCall <not fully-bound> (<predicate> . <fully-bound>)))
    by recursively querying formula in #$InferencePSC
    and computing appropriate mts from the justification."

   :example 
   "(#$prologCall ?MT (#$genls #$BinaryPredicate #$Relation))"
   ))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-unbound-mt-gaf-lookup-pos
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(define-protected removal-prolog-unbound-mt-gaf-lookup-pos-cost (asent &optional sense)
  (ignore sense)
  (clet (cost)
    (with-all-mts
      (clet ((prolog-formula  (atomic-sentence-arg2 asent))
	     (binding-cost (literal-removal-cost prolog-formula :pos))
	     (mt-cost      *estimated-prolog-mts-per-formula*))
	(csetq cost (* binding-cost mt-cost))))
    (ret cost)))

(define-protected removal-prolog-unbound-mt-gaf-lookup-pos-expand (asent &optional sense)
  (ignore sense)
  (clet ((prolog-mt        (atomic-sentence-arg1 asent))
	 (prolog-formula   (atomic-sentence-arg2 asent))
	 (bindings-list (removal-prolog-pos-gaf-query #$InferencePSC prolog-formula)))
    (cdolist (formula-bindings bindings-list)
      ;;@todo simplify to use :query hl-module
      (clet ((new-formula             (sublis formula-bindings prolog-formula #'eq))
	     (mt-support-combinations (inference-mts-where-gaf-sentence-true-justified-memoized new-formula)))
	(cdolist (mt-support-combination mt-support-combinations)
	  (cdestructuring-bind (mts justification) mt-support-combination
	    (cdolist (mt mts)
	      (clet ((mt-bindings (genl-mt-unify prolog-mt mt)))
		(pwhen (cand mt-bindings
			     formula-bindings)
		  (clet ((bindings (append mt-bindings formula-bindings)))
		    (cmultiple-value-bind (support more-supports)
			(make-prolog-supports mt new-formula justification)
		      (removal-add-node support bindings more-supports)))))))))))
  (ret nil))

(inference-removal-module
 :removal-prolog-unbound-mt-gaf-lookup-pos
 '(
   :sense            :pos
   :predicate        #$prologCall
   :required-pattern
   (#$prologCall :not-fully-bound
    ((:test inference-predicate-p) . :not-fully-bound))
   :cost             removal-prolog-unbound-mt-gaf-lookup-pos-cost
   :completeness     :grossly-incomplete

   :expand           removal-prolog-unbound-mt-gaf-lookup-pos-expand
   
   :documentation
   "(#$prologCall <not-fully-bound> <not-fully-bound>)"
   
   :example
   "(#$prologCall ?MT (#$acquaintedWith #$ThomasPynchon ?WHO))"
   ))


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; #$prologAsserted literals
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(register-solely-specific-removal-module-predicate #$prologAsserted)

(define-public make-prolog-asserted-justification (assertion)
  (ret (fif *recursive-prolog-justifications?*
	    (list assertion)
	    (list (make-prolog-asserted-support assertion)))))

(define-public make-prolog-asserted-support (assertion)
  (clet ((mt                    (assertion-mt assertion))
	 (sentence              (assertion-el-formula assertion))
	 (prolog-asserted-sentence (make-binary-formula #$prologAsserted mt sentence)))
    ;; *prolog-mt* is used since the #$prologAsserted formula is considered decontextualized
    (ret (make-hl-support :query prolog-asserted-sentence *prolog-mt*))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-asserted-gaf-lookup-pos
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; modelled after
;;  :removal-prolog-pos-gaf
;;  :removal-asserted-formula-lookup-pos
;;  :removal-gaf-lookup-pos

(define-private removal-prolog-asserted-gaf-lookup-pos-cost (asent &optional sense)
  (ignore sense)
  (ret (removal-prolog-asserted-gaf-lookup-cost asent)))

(define-private removal-prolog-asserted-gaf-iterator (mt formula)
  (clet (result)
    ;; only use assertions from MT
    (clet ((sub-literal (literal-atomic-sentence formula))
	   (sub-sense  (literal-sense formula)))
      (with-just-mt mt
	(do-formula-canonical-commutative-permutations (permuted-literal sub-literal :penetrate-args? t)
	  (do-inference-gaf-lookup-index (assertion permuted-literal sub-sense)
	    (pwhen (direction-is-relevant assertion)
	      (pwhen (eq (truth-sense (assertion-truth assertion)) sub-sense)
		(cmultiple-value-bind (bindings gaf-asent unify-justification)
		    (gaf-asent-unify permuted-literal (gaf-formula assertion) t t)
		  (ignore gaf-asent unify-justification) ;; @todo handle unify-justification
		  (pwhen bindings
		    (cpush (list bindings assertion) result)))))))))
    (pwhen result
      (ret (new-list-iterator result)))))

(define-private removal-prolog-asserted-pred-fort (object)
  (ret (cand (cnot (eq object #$not))
	     (fort-p object))))

(inference-removal-module
 :removal-prolog-asserted-gaf-lookup-pos
 '(
   :sense    :pos
   :predicate #$prologAsserted
   :required-pattern
   (#$prologAsserted :fort
    (:or
     ((:test removal-prolog-asserted-pred-fort) . :anything)
     (#$not (:fort . :anything))))
   :cost     removal-prolog-asserted-gaf-lookup-pos-cost
   :completeness :complete
   
   :input-extract-pattern
   (:template (#$prologAsserted (:bind mt) (:bind formula))
    ((:value mt) (:value formula)))
   :output-generate-pattern
   (:call removal-prolog-asserted-gaf-iterator (:value mt) (:value formula))
   :output-decode-pattern
   (:template ((:bind bindings) (:bind assertion))
    ((:value bindings) (:value assertion)))
   :output-construct-pattern
   (#$prologAsserted (:value mt) (:call subst-bindings (:value bindings) (:value formula)))
   
   :support-pattern
   (:call make-prolog-asserted-justification (:value assertion))
   
   :documentation
   "(#$prologAsserted <mt> (<predicate> . <whatever>))
using only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"

   :example
   "(#$prologAsserted #$LogicalTruthMt (#$genls #$Predicate ?WHAT))"
   ))

;; internals

(define-private removal-prolog-asserted-gaf-lookup-cost (asent)
  (clet ((mt          (atomic-sentence-arg1 asent))
	 (gaf-formula (atomic-sentence-arg2 asent))
	 (sub-literal (literal-atomic-sentence gaf-formula))
	 (sub-sense   (literal-sense gaf-formula))
	 (total 0))
    (with-just-mt mt
      (do-formula-canonical-commutative-permutations (permuted-literal sub-literal :penetrate-args? t)
	(cinc total (inference-relevant-num-gaf-lookup-index mt permuted-literal sub-sense))))
    (ret total)))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-asserted-unbound-lookup-pos
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; modelled after
;;  :removal-asserted-formula-unbound-lookup-pos

(define-private removal-prolog-asserted-unbound-lookup-pos-required (asent &optional sense)
  (ignore sense)
  (clet ((formula (literal-atomic-sentence (atomic-sentence-arg2 asent))))
    (ret (find-if #'fort-p (atomic-sentence-args formula)))))

(define-private removal-prolog-asserted-unbound-lookup-pos-cost (asent &optional sense)
  (ignore sense)
  (ret (removal-prolog-asserted-gaf-lookup-cost asent)))

(define-private removal-prolog-asserted-unbound-lookup-iterator (mt formula)
  (ret (removal-prolog-asserted-gaf-iterator mt formula)))

(inference-removal-module
 :removal-prolog-asserted-unbound-lookup-pos
 '(
   :sense    :pos
   :predicate #$prologAsserted
   :required-pattern
   (#$prologAsserted :fort
    (:or
     ((:not :fort) . :anything)
     (#$not ((:not :fort) . :anything))))
   :required removal-prolog-asserted-unbound-lookup-pos-required
   
   :cost     removal-prolog-asserted-unbound-lookup-pos-cost
   :completeness :complete

   :input-extract-pattern
   (:template (#$prologAsserted (:bind mt) (:bind formula))
    ((:value mt) (:value formula)))
   :output-generate-pattern
   (:call removal-prolog-asserted-unbound-lookup-iterator (:value mt) (:value formula))
   :output-decode-pattern
   (:template ((:bind bindings) (:bind assertion))
    ((:value bindings) (:value assertion)))
   :output-construct-pattern
   (#$prologAsserted (:value mt) (:call subst-bindings (:value bindings) (:value formula)))
   
   :support-pattern
   (:call make-prolog-asserted-justification (:value assertion))

   :documentation
   "(#$prologAsserted <mt> (<not fully-bound> ... <fort> ...))
where <mt> is a chlmt-p
using only the KB GAF indexing and explicit assertions involving <fort>"

   :example
   "(#$prologAsserted #$LogicalTruthMt (?PRED #$Predicate ?WHAT))"
   ))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-asserted-mt-contents
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(define-private removal-prolog-asserted-mt-contents-required (asent &optional sense)
  (ignore sense)
  (clet ((hlmt    (atomic-sentence-arg1 asent))
	 (formula (literal-atomic-sentence (atomic-sentence-arg2 asent))))
    (ret (cand (cnot (broad-mt? (hlmt-monad-mt hlmt)))
	       (cnot (tree-find-if #'fort-p formula))))))

(define-private removal-prolog-asserted-mt-contents-cost (asent &optional sense)
  (ignore sense)
  (clet ((mt (atomic-sentence-arg1 asent)))
    (ret (num-mt-index mt))))

(define-private removal-prolog-asserted-mt-contents-iterator (mt formula)
  (clet (result)
    (do-mt-contents (assertion mt :type :gaf)
      (pwhen (direction-is-relevant assertion)
	(clet ((gaf-formula (gaf-el-formula assertion)))
	  (cmultiple-value-bind (bindings unify-justification)
	      (term-unify formula gaf-formula)
	    (ignore unify-justification)
	    (pwhen bindings
	      (cpush assertion result))))))
    (pwhen result
      (ret (new-list-iterator result)))))
  
(inference-removal-module
 :removal-prolog-asserted-mt-contents
 '(
   :sense    :pos
   :predicate #$prologAsserted
   :required-pattern
   (#$prologAsserted :fort :not-fully-bound)
   :required removal-prolog-asserted-mt-contents-required
   
   :cost     removal-prolog-asserted-mt-contents-cost
   :completeness :complete
   
   :input-extract-pattern
   (:template (#$prologAsserted (:bind mt) (:bind formula))
    ((:value mt) (:value formula)))
   :output-generate-pattern
   (:call removal-prolog-asserted-mt-contents-iterator
    (:value mt) (:value formula))
   :output-decode-pattern
   (:template (:bind assertion)
    (:value assertion))
   :output-construct-pattern
   (#$prologAsserted (:value mt) (:call gaf-el-formula :input))
   
   :support-pattern
   (:call make-prolog-asserted-justification (:value assertion))
   
   :documentation
   "(#$prologAsserted <fort> <variable>)
using only the KB MT indexing and explicit GAF assertions in ARG1 MT"

   :example
   "(#$prologAsserted #$ChristmasMythologyMt ?FORMULA)"
   ))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-asserted-gaf-lookup-neg
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; modelled after
;;  :removal-prolog-asserted-gaf-lookup-pos
;;  :removal-asserted-formula-lookup-neg

(define-private removal-prolog-asserted-gaf-lookup-neg-cost (asent &optional sense)
  (ignore sense)
  (ret (- 1 (min 1 (removal-prolog-asserted-gaf-lookup-cost asent)))))

(define-private removal-prolog-asserted-gaf-lookup-neg-expand (asent &optional sense)
  (ignore sense)
  (clet ((mt          (atomic-sentence-arg1 asent))
	 (formula     (atomic-sentence-arg2 asent))
	 (sub-literal (literal-atomic-sentence formula))
	 (sub-sense   (literal-sense formula))
	 found)
    ;; only use assertions from MT
    (with-just-mt mt
      (do-formula-canonical-commutative-permutations (permuted-literal sub-literal :penetrate-args? t)
	(do-inference-gaf-lookup-index (assertion permuted-literal sub-sense :done found)
	  ;; negation by failure used here
	  (csetq found (removal-prolog-asserted-gaf-lookup-neg-expand-internal
			assertion permuted-literal)))))
    (punless found
      (removal-add-node
       (make-hl-support :minimize (negate asent)))))
  (ret nil))

(inference-removal-module
 :removal-prolog-asserted-gaf-lookup-neg
 '(
   :sense    :neg
   :predicate #$prologAsserted
   :required-pattern
   (#$prologAsserted :fort
    (:or
     ((:test removal-prolog-asserted-pred-fort) . :fully-bound)
     (#$not (:fort . :fully-bound))))

   :cost     removal-prolog-asserted-gaf-lookup-neg-cost
   :completeness :complete
   :expand   removal-prolog-asserted-gaf-lookup-neg-expand
    
   :documentation
   "(#$not (#$prologAsserted <fort> (<predicate> . <fully-bound>)))
using only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"
   
   :example
   "(#$not (#$prologAsserted #$LogicalTruthMt (#$genls #$Predicate #$Thing)))"
   ))

;; internal

(define-private removal-prolog-asserted-gaf-lookup-neg-expand-internal (assertion formula)
  (pwhen (direction-is-relevant assertion)
    (cmultiple-value-bind (bindings gaf-asent unify-justification)
	(gaf-asent-unify formula (gaf-formula assertion))
      (ignore gaf-asent unify-justification)
      (ret (boolean bindings)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-asserted-unbound-mt-gaf-lookup-pos
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; modelled after
;;;  :removal-prolog-asserted-gaf-lookup-pos
;;; @owner karen
;;; This module has "gaf-lookup" in the name because it uses GAF assertions 
;;; during lookup. 

(define-private removal-prolog-asserted-unbound-mt-gaf-lookup-pos-required (asent &optional sense)
  (ignore sense)
  (clet ((prolog-formula (literal-atomic-sentence (atomic-sentence-arg2 asent)))
	 (predicate (formula-arg0 prolog-formula)))
    (ret (predicate? predicate))))

(define-private removal-prolog-asserted-unbound-mt-gaf-lookup-pos-cost (asent &optional sense)
  (ignore sense)
  (ret (removal-prolog-asserted-unbound-mt-gaf-lookup-cost asent)))

(define-private removal-prolog-asserted-unbound-mt-gaf-lookup-iterator (asent)
  (clet (result)
    (clet ((prolog-formula (atomic-sentence-arg2 asent))
	   (mt          (atomic-sentence-arg1 asent))
	   (mt-overlap-cost (estimated-num-overlap-index-for-mt mt))
	   (sub-literal (literal-atomic-sentence prolog-formula))
	   (sub-sense   (literal-sense prolog-formula)))
      ;; use assertions from all MTs
      (with-all-mts
	(do-formula-canonical-commutative-permutations (permuted-literal sub-literal :penetrate-args? t)
	  (clet ((gaf-cost (inference-num-gaf-lookup-index permuted-literal sub-sense)))
	    (pcond
	     ((< mt-overlap-cost gaf-cost)
	      ;; map over overlap index from mt
	      (cdolist (assertion (gather-overlap-index-for-mt mt))
		(clet ((bindings (removal-prolog-asserted-unify assertion permuted-literal mt)))
		  (pwhen bindings
		    (cpush (list bindings assertion) result)))))
	     (t
	      (do-inference-gaf-lookup-index (assertion permuted-literal sub-sense)
		;; map over formula index
		(clet ((bindings (removal-prolog-asserted-unify assertion permuted-literal mt)))
		  (pwhen bindings
		    (cpush (list bindings assertion) result))))))))))
    (pwhen result
      (ret (new-list-iterator result)))))
    
(inference-removal-module
 :removal-prolog-asserted-unbound-mt-gaf-lookup-pos
 ;; @todo generalize & merge with :removal-prolog-asserted-pos-gaf-mt-lookup
 '(
   :sense    :pos
   :predicate #$prologAsserted
   :required-pattern
   (#$prologAsserted :not-fully-bound
    (:or
     ((:test removal-prolog-asserted-pred-fort) . :anything)
     (#$not (:fort . :anything))))
   :required removal-prolog-asserted-unbound-mt-gaf-lookup-pos-required
   
   :cost     removal-prolog-asserted-unbound-mt-gaf-lookup-pos-cost
   :completeness :complete
   
   :input-extract-pattern
   (:template (:bind asent)
    (:value asent))
   :output-generate-pattern
   (:call removal-prolog-asserted-unbound-mt-gaf-lookup-iterator
    (:value asent))
   :output-decode-pattern
   (:template ((:bind bindings) (:bind assertion))
    ((:value bindings) (:value assertion)))
   :output-construct-pattern
   (#$prologAsserted (:call assertion-mt (:value assertion)) 
    (:call subst-bindings (:value bindings) (:call atomic-sentence-arg2 (:value asent))))
   
   :support-pattern
   (:call make-prolog-asserted-justification (:value assertion))
    
   :documentation
   "(#$prologAsserted <not fully-bound> (<predicate> . <anything>))
using only the KB GAF indexing and explicit assertions in ARG1 MT involving <predicate>"

   :example
   "(#$prologAsserted ?MT (#$genls #$Dog #$CanineAnimal))
    (#$prologAsserted ?MT (#$genls #$Dog ?WHAT))"
   ))

(define-private removal-prolog-asserted-unbound-mt-gaf-lookup-cost (asent)
  (clet ((mt          (atomic-sentence-arg1 asent))
	 (prolog-formula (atomic-sentence-arg2 asent))
	 (sub-literal (literal-atomic-sentence prolog-formula))
	 (sub-sense   (literal-sense prolog-formula))
	 (mt-overlap-cost (estimated-num-overlap-index-for-mt mt))
	 (total 0))
    (with-all-mts
      (do-formula-canonical-commutative-permutations (permuted-literal sub-literal :penetrate-args? t)
	(clet ((gaf-cost  (inference-num-gaf-lookup-index permuted-literal sub-sense))
	       (best-cost (min mt-overlap-cost gaf-cost)))
	  (cinc total best-cost))))
    (ret total)))

(define-private removal-prolog-asserted-unify (assertion inference-literal mt)
  ;; @todo handle gaf-asent-unify justifications
  (pwhen (direction-is-relevant assertion)
    (clet ((gaf-formula (gaf-formula assertion))
	   (gaf-mt      (assertion-mt assertion))
	   (gaf-asent   (make-binary-formula #$prologAsserted gaf-mt gaf-formula))
	   (inf-asent   (make-binary-formula #$prologAsserted mt inference-literal))
	   (bindings    (gaf-asent-unify inf-asent gaf-asent)))
      (ret bindings))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; :removal-prolog-asserted-unbound-mt-unbound-pred-lookup-pos
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; modelled after 
;;;   :removal-prolog-asserted-unbound-lookup-pos
;;; @owner karen

(define-private removal-prolog-asserted-unbound-mt-unbound-pred-lookup-pos-required (asent &optional sense)
  (ignore sense)
  (clet ((prolog-formula (literal-atomic-sentence (atomic-sentence-arg2 asent))))
    (ret (find-if #'fort-p (atomic-sentence-args prolog-formula)))))

(define-private removal-prolog-asserted-unbound-mt-unbound-pred-lookup-pos-cost (asent &optional sense)
  (ignore sense)
  (ret (removal-prolog-asserted-unbound-mt-gaf-lookup-cost asent)))

(define-private removal-prolog-asserted-unbound-mt-unbound-pred-lookup-pos-iterator (asent)
  (ret (removal-prolog-asserted-unbound-mt-gaf-lookup-iterator asent)))

(inference-removal-module
 :removal-prolog-asserted-unbound-mt-unbound-pred-lookup-pos
 '(
   :sense    :pos
   :predicate #$prologAsserted
   :required-pattern
   (#$prologAsserted :not-fully-bound
    (:or
     (:not-fully-bound . :anything)
     (#$not (:not-fully-bound . :anything))))
   :required removal-prolog-asserted-unbound-mt-unbound-pred-lookup-pos-required
   
   :cost     removal-prolog-asserted-unbound-mt-unbound-pred-lookup-pos-cost
   :completeness :complete
   
   :input-extract-pattern
   (:template (:bind asent)
    (:value asent))
   :output-generate-pattern
   (:call removal-prolog-asserted-unbound-mt-unbound-pred-lookup-pos-iterator
    (:value asent))
   :output-decode-pattern
   (:template ((:bind bindings) (:bind assertion))
    ((:value bindings) (:value assertion)))
   :output-construct-pattern
   (#$prologAsserted (:call assertion-mt (:value assertion)) 
    (:call subst-bindings (:value bindings) (:call atomic-sentence-arg2 (:value asent))))
   
   :support-pattern
   (:call make-prolog-asserted-justification (:value assertion))
    
   :documentation
   "(#$prologAsserted <not fully-bound> (<not fully-bound> ... <fort> ...))
using only the KB GAF indexing and explicit assertions in ARG1 MT with <fort> in its arg position."

   :example
   "(#$prologAsserted ?MT (?PRED #$Madonna ?WHAT))"
   ))


#|

  
(csetq *prolog-call* (foc "prolog:call"))
(csetq *prolog-member* (foc "prologMember")) 

  (DEFINE-EVALUATION-DEFN prolog-call-unify (&rest body)
    (ret (prolog-unify body)))

  (cyc-assert `(#$arity ,*prolog-call* 1) *UVMt*) 
  (cyc-assert `(#$isa ,*prolog-call* #$Predicate) *UVMt*) 
  (cyc-assert `(#$arity ,*prolog-member* 2) *UVMt*) 
  (cyc-assert `(#$isa ,*prolog-member* #$Predicate) *UVMt*) 
  (cyc-assert `(#$comment ,*prolog-call* "(#$prolog:call (#$prologMember ?WHAT (#$TheList 1 2 3)))") *UVMt*) 
		   
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
    	:example "(*#$prolog:call (#$prologMember ?WHAT (#$TheList 1 2 3))"))
    
       
    (register-solely-specific-removal-module-predicate *prolog-call*)


(csetq *prolog-prologCall* (foc "prologCall"))
  (DEFINE-EVALUATION-DEFN prolog-prolog-unify (&rest body)
    (ret (prolog-unify body)))

  (cyc-assert `(#$arity #$prologCall 2) *UVMt*) 
  (cyc-assert `(#$isa #$prologCall #$Predicate) *UVMt*) 
  (cyc-assert `(#$comment #$prologCall "(#$prologCall (#$prologMember ?WHAT (#$TheList 1 2 3)) ?OUT)") *UVMt*) 

  (inference-removal-module :removal-prolog-prolog-unify
     `(:sense :pos 
    	:predicate #$prologCall 
    	:required-pattern (#$prologCall :not-fully-bound :not-fully-bound) 
    	:cost-expression 0 :completeness :complete 
        :input-extract-pattern (:template  (#$prologCall (:bind the-value) :anything) ((:value the-value)))
    	:input-verify-pattern :anything
    	:output-generate-pattern (:call prolog-prolog-unify :input)
    	:output-construct-pattern  (#$prologCall (:value the-value) :input)
    	:documentation "(#$prologCall <not-fully-bound> <not-fully-bound>)"
    	:example "(#$prologCall (#$prologMember ?WHAT (#$TheList 1 2 3)) ?OUT)"))
    
       
 (register-solely-specific-removal-module-predicate *prolog-prologCall*)
 
(csetq *callT* (foc "callT"))

(cyc-assert `(#$arity #$callT  1) *UVMt*) 
(cyc-assert `(#$isa #$callT #$Predicate) *UVMt*)
(cyc-assert `(#$implies (#$prologCall ?X ?X) (#$callT ?X)) #$BaseKB) 

(print (list (define u::tqqq  () 
   (ret (cyc-query
      `(,*prolog-call* (,*prolog-member* ?WHAT (#$TheList 1 2 3))) #$EverythingPSC)))))


(print 
 (list (define u::tqqu () 
 (ret 
 (query-template '(?WHAT ?TWO ?BIGLIST) 
 `(,*prolog-prologCall* 
   (,*prolog-member* ?WHAT (#$TheList 1 ?TWO 3)) 
   (,*prolog-member* ?WHAT ?BIGLIST)) #$EverythingPSC)))))


(print 
 (list (define u::tqqt () 
 (ret 
 (cyc-query 
 `(#$callT 
   (,*prolog-member* ?WHAT (#$TheList 1 ?TWO 3)) ) #$EverythingPSC )))))

|#
