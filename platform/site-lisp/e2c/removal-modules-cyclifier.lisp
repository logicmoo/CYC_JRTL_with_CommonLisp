;;;{{{DOC
;;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-
;;;
;;; Copyright (c) 2004 - 2006 Cycorp, Inc.  All rights reserved.
;;;
;;; @module REMOVAL-MODULES-CYCLIFIER
;;; @features (and :Cyc-NL :Cyc-SubLOOP)
;;;
;;; @owner daves
;;; @owner aldag
;;;
;;; @created 2005/08/16
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; provide easy access to the Cyclifier (NL -> CycL Parser)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; External interface:
;;;
;;; (#$cyclificationOfStringFromParser STRING ?CYCL PARSER)
;;; (#$parserRunToSpecificationWithInputStringReturnsCyclification PARSER PARAMS STRING ?CYCL)
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; File organization:
;;; 
;;; <outline of file contents>
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;}}}EDOC

(in-package "CYC")

(cvs-id "$Id: removal-modules-cyclifier.lisp 126640 2008-12-04 13:39:36Z builder $")

(register-solely-specific-removal-module-predicate #$cyclificationOfStringFromParser)

(inference-removal-module
 :cyclify-pos-unify-arg2
 '(
   :sense :pos				
   :predicate #$cyclificationOfStringFromParser
   :required-pattern
   (#$cyclificationOfStringFromParser :fully-bound :not-fully-bound :fully-bound)

   :cost-expression 1
   :completeness :complete
   
   :input-extract-pattern
   (:template
    (#$cyclificationOfStringFromParser (:bind string) :not-fully-bound (:bind parser-type))
    ((:value string) (:value parser-type)))
   :output-generate-pattern
   (:call cyclify-iterator (:value string) (:value parser-type))
   :output-construct-pattern	
   (:tuple (formula weight)
    (#$cyclificationOfStringFromParser (:value string) (:value formula) (:value parser-type)))

   :support-module :cyclify
     
   :documentation
   "(#$cyclificationOfStringFromParser <string> <not-fully-bound> <fully-bound>)"
   :example
   "(#$cyclificationOfStringFromParser \"every person like cheese\" ?QUERY #$CharniakParserCyclifier)"
   ))



(register-solely-specific-removal-module-predicate #$parserRunToSpecificationWithInputStringReturnsCyclification)

(inference-removal-module
 :parser-run-with-spec-unify-arg4
 '(
   :sense :pos				
   :predicate #$parserRunToSpecificationWithInputStringReturnsCyclification
   :required-pattern
   (#$parserRunToSpecificationWithInputStringReturnsCyclification :fully-bound :fully-bound :fully-bound :not-fully-bound)

   :cost-expression 1
   :completeness :complete
   
   :input-extract-pattern
   (:template
    (#$parserRunToSpecificationWithInputStringReturnsCyclification (:bind parser-type) (:bind parameters) (:bind string) :not-fully-bound)
    ((:value string) (:value parser-type) (:value parameters)))
   :output-generate-pattern
   (:call cyclify-iterator (:value string) (:value parser-type) (:value parameters))
   :output-construct-pattern	
   (:tuple (formula weight)
    (#$parserRunToSpecificationWithInputStringReturnsCyclification  (:value parser-type) (:value parameters) (:value string) (:value formula)))

   :support-module :cyclify
     
   :documentation
   "(#$parserRunToSpecificationWithInputStringReturnsCyclification <fully-bound> <fully-bound> <string> <not-fully-bound>)"
   :example
   "(#$parserRunToSpecificationWithInputStringReturnsCyclification #$CharniakParserCyclifier (#$DefaultParameterSpecificationForParserFn #$CharniakParserCyclifier) \"every person likes cheese\" ?CYCL)"
   ))


(define-private cyclify-iterator (string parser-type &optional parameters)
  "@return iterator; the iterator returns (formula score) pairs"
  (ignore parameters)
  (clet (parses
	 results)
    (pcase parser-type
      ((#$CharniakParserCyclifier #$CharniakParser
	#$StanfordParserCyclifier #$LinkParserCyclifier)
       (csetq parses (cyclify string (unpack-parser-parameters-for-parser parser-type parameters)))
       (cdolist (parse parses)
	 (cpush (list (car parse) (cdr parse)) results)))
      #+Cyc-QUIRK
      (#$EBMTCyclifier
       (ignore parameters)
       (cdolist (parse-cycl (ebmt-parse string))
	 (cpush (list parse-cycl 0) results)))
      (#$CycPhraseStructureParser
       (pwhen (fort-p parameters)
	 (csetq results (psp-cyclifier-results string parameters))))
      #+Cyc-Date
      (#$CycDateParser
       (clet ((plist (parsing-parameter-plist parameters))
	      (max-time (get-parsing-parameter-value :max-time plist parser-type))
	      (timed-out? nil)
	      (parses ()))
	 (possibly-with-parsing-timeout (max-time timed-out?)
	   (csetq parses (parse-date-from-string string)))
	 (pwhen parses
	   (clet ((ambiguity-factor (length parses))
		  (weight (/ 1 ambiguity-factor)))
	     (cdolist (parse parses)
	       (cpush (list parse weight) results))))
	 (ignore timed-out?))))       
    (ret (new-list-iterator (nreverse results)))))

(define-private unpack-parser-parameters-for-parser (parser-type parameters)
  (pcase parser-type 
    ((#$CharniakParserCyclifier #$CharniakParser
      #$StanfordParserCyclifier #$LinkParserCyclifier) 
     (ignore parameters)
     (clet ((parser (new-parser-of-type parser-type)))
       (ret `(:output :verbose :parser ,parser :score-function cyclification-coverage))))
    (#$CycPhraseStructureParser
     (clet ((plist (parsing-parameter-plist parameters))
	    (category (get-parsing-parameter-value :category plist parser-type))
	    (pos-pred (get-parsing-parameter-value :pos-pred plist parser-type))
	    (max-time (get-parsing-parameter-value :max-time plist parser-type))
	    (non-trivial? nil)
	    (mt (get-parsing-parameter-value :lexicon-lookup-mt plist parser-type)))
       (ret (list max-time category pos-pred non-trivial? mt))))
    (otherwise
     (ret nil))))

(define-private psp-cyclifier-results (string parameters)
  (clet ((unpacked (unpack-parser-parameters-for-parser
		    #$CycPhraseStructureParser parameters))
	 (max-time (first unpacked))
	 (timed-out? nil)
	 (parses ())
	 (results ()))
    (possibly-with-parsing-timeout (max-time timed-out?)
      (csetq parses (apply 'ps-get-cycls-for-phrase (cons string (rest unpacked)))))
    (ignore timed-out?)
    (cdolist (parse parses)
      (punless (expression-find-if 'keywordp parse)
	(cpush (list (strip-nl-tags parse) 0) results)))
    (ret results)))


(define-private new-parser-of-type (parser-type)
  (pcase parser-type 
    ((#$CharniakParserCyclifier #$CharniakParser)
     (ret (new-charniak-parser)))
    (#$StanfordParserCyclifier 
     (ret (new-stanford-parser)))
    (#$LinkParserCyclifier 
     (ret (new-link-parser)))))

(define-private get-parsing-parameter-value (parameter plist parser)
  (clet ((value (getf plist parameter :not-specified)))
    (pwhen (eq :not-specified value)
      (clet ((cycl-parameter (parsing-parameter-from-keyword parameter)))
	(csetq value (software-parameter-default-value
		      cycl-parameter parser (inference-relevant-mt)))))
    (ret value)))

(define-private parsing-parameter-plist (parsing-parameter-spec)
  (clet ((parameter-value-tuples (parameter-specification-tuples parsing-parameter-spec))
	 (parsing-parameter-plist
	  (parsing-parameter-plist-from-tuples parameter-value-tuples)))
    (ret parsing-parameter-plist)))

(define-private parsing-parameter-plist-from-tuples (parameter-value-tuples)
  (clet ((result ()))
    (cdolist (tuple parameter-value-tuples)
      (cdestructuring-bind (parameter kb-value) tuple
	(clet ((keyword (keyword-from-parsing-parameter parameter)) 
	       (value   (parse-kb-parsing-parameter-value kb-value keyword)))
	  (csetq result (putf result keyword value)))))
    (ret result)))

(define-private parsing-parameter-from-keyword (keyword)
  (ret (parameter-from-keyword keyword #$NLParsingParameter)))

(define-private keyword-from-parsing-parameter (parameter)
  (ret (keyword-from-parameter parameter)))

(define-private parse-kb-parsing-parameter-value (value keyword)
  (pcase keyword
    (:max-time (ret (kbq-convert-time-to-seconds value)))
    (otherwise
     (ret (parse-standard-parameter-value value)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; generation of hl-supports
;;;;;;;;;;;;;;;;;;;;;;;;;;;;


(define-private cyclify-sentence-string-input-arg (asent)
  (pcase (formula-arg0 asent)
    (#$cyclificationOfStringFromParser
     (ret (formula-arg1 asent)))
    (#$parserRunToSpecificationWithInputStringReturnsCyclification
      (ret (formula-arg3 asent)))
    (otherwise (ret nil))))

(define-private cyclify-sentence-cycl-arg (asent)
  (pcase (formula-arg0 asent)
    (#$cyclificationOfStringFromParser
     (ret (formula-arg2 asent)))
    (#$parserRunToSpecificationWithInputStringReturnsCyclification
      (ret (formula-arg4 asent)))
    (otherwise (ret nil))))


(define-private cyclify-sentence-parser-arg (asent)
  (pcase (formula-arg0 asent)
    (#$cyclificationOfStringFromParser
     (ret (formula-arg3 asent)))
    (#$parserRunToSpecificationWithInputStringReturnsCyclification
      (ret (formula-arg1 asent)))
    (otherwise (ret nil))))

(define-protected cyclify-verify-general (asent mt)
  (ignore mt)
  (pcond #+Cyc-QUIRK
	 ((eq (cyclify-sentence-parser-arg asent) #$EBMTCyclifier)
	  (clet ((cycls (ebmt-parse (cyclify-sentence-string-input-arg asent)))) ;;this should probably just do the fully-bound query instead
	    (ret (member (cyclify-sentence-cycl-arg asent) cycls 'equal))))
	 (t (ret t))))

(define-protected cyclify-justify-general (asent mt)
  (clet ((supports))
    (pcond #+Cyc-QUIRK
	   ((eq (cyclify-sentence-parser-arg asent) #$EBMTCyclifier)
	    (ret (ebmt-supports asent mt)))
	   (t (ret nil)))
    (ret supports)))

(define-private ebmt-supports (asent mt)
  (clet ((supports)
	 (target-cycl (cyclify-sentence-cycl-arg asent)))
    #+Cyc-QUIRK
    (cmultiple-value-bind (cycls justifications weight)
	(ebmt-parse (cyclify-sentence-string-input-arg asent))
      (ignore weight)
      (cdolist-multiple ((cycl cycls)
			 (justification justifications))
	(pwhen (equal cycl target-cycl)
	  (cdolist (support justification)
	    (cpush (make-hl-support :opaque (ebmt-template-justification-sentence support) mt) supports)))))
    (ret supports)))

(define-private ebmt-template-justification-sentence (ebmt-template)
  (ret (fwhen-feature :Cyc-QUIRK
         `(#$eBMTLinksMapToCycL ,(make-el-list (ebmt-template-links ebmt-template)) ,(ebmt-template-cycl ebmt-template)))))

;;;{{{TEST
;;; 
;;; @section Unit Tests

(pwhen-feature :Cyc-Testing
  
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;  
;; Non-SUnit test definitions
  

(pwhen-feature :Cyc-SUnit-Full 
    
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;  
;; SUnit testing code    

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; SUnit Test Helpers

(pwhen-feature :Cyc-SUnit

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Helper constants

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; Helper functions
  
) ;; close (pwhen-feature :Cyc-SUnit

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Define needed test categories

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Define test cases 

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Define test suites


) ;; close (pwhen-feature :Cyc-SUnit-Full
) ;; close (pwhen-feature :Cyc-Testing

;;; 
;;;}}}ETEST

