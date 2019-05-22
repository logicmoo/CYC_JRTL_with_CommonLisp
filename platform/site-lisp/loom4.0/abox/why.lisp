;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1988, 1995, 1999, 2003 University of Southern California     ;
;  All rights reserved.                                                       ;
;                                                                             ;
;                               LICENSE                                       ;
;                                                                             ;
;  1) The "SOFTWARE", below, refers to the LOOM software (in either           ;
;     source-code, or binary form) and a "work based on the SOFTWARE"         ;
;     means a work based on either the SOFTWARE, on part of the SOFTWARE,     ;
;     or on any derivative work of the SOFTWARE under copyright law:          ;
;     that is, a work containing all or a portion of the SOFTWARE             ;
;     either verbatim or with modifications.  Each licensee is                ;
;     addressed as "you" or "LICENSEE".                                       ;
;                                                                             ;
;  2) The University of Southern California on behalf of its Information      ;
;     Sciences Institute having an address of 4676 Admiralty Way, Suite       ;
;     1001, Marina del Rey, CA 90292 is the copyright holder in the           ;
;     SOFTWARE.  The copyright holder reserve all rights except those         ;
;     expressly granted to the LICENSEE herein and U.S. Government            ;
;     license rights.                                                         ;
;                                                                             ;
;  3) A copy or copies of the SOFTWARE may be given to others, if you         ;
;     meet the following conditions:                                          ;
;                                                                             ;
;     a) Copies in source code must include the copyright notice and this     ;
;        license.                                                             ;
;                                                                             ;
;     b) Copies in binary form must include the copyright notice and          ;
;        this license in the documentation and/or other materials             ;
;        provided with the copy.                                              ;
;                                                                             ;
;  4) All advertising materials, journal articles and documentation           ;
;     mentioning features derived from or use of the SOFTWARE must            ;
;     display the following acknowledgement:                                  ;
;                                                                             ;
;     "This product includes software developed by and/or derived from        ;
;     the LOOM project (http://www.isi.edu/isd/LOOM/LOOM-HOME.html)."         ;
;                                                                             ;
;     In the event that the product being advertised includes an intact       ;
;     distribution (with copyright and license included) then this            ;
;     clause is waived.                                                       ;
;                                                                             ;
;  5) You are encouraged to package modifications to the SOFTWARE             ;
;     separately, as patches to the SOFTWARE.                                 ;
;                                                                             ;
;  6) If you modify a copy or copies of the SOFTWARE or any portion of        ;
;     it, thus forming a work based on the SOFTWARE, and give a copy or       ;
;     copies of such work to others, either in source code or binary          ;
;     form, you must meet the following conditions:                           ;
;                                                                             ;
;     a) The SOFTWARE must carry prominent notices stating that you           ;
;        changed specified portions of the SOFTWARE.                          ;
;                                                                             ;
;     b) The SOFTWARE must display the following acknowledgement:             ;
;                                                                             ;
;        "This product includes software developed by and/or derived from     ;
;        the LOOM Project (http://www.isi.edu/isd/LOOM/LOOM-HOME.html) to     ;
;        which the U.S. Government retains certain rights."                   ;
;                                                                             ;
;  7) LICENSEE AGREES THAT THE EXPORT OF GOODS AND/OR TECHNICAL DATA FROM     ;
;     THE UNITED STATES MAY REQUIRE SOME FORM OF EXPORT CONTROL LICENSE       ;
;     FROM THE U.S. GOVERNMENT AND THAT FAILURE TO OBTAIN SUCH EXPORT         ;
;     CONTROL LICENSE MAY RESULT IN CRIMINAL LIABILITY UNDER U.S. LAW.        ;
;                                                                             ;
;  8) Portions of the SOFTWARE resulted from work developed under a           ;
;     U.S. Government contract and are subject to the following license:      ;
;     the Government is granted for itself and others acting on its           ;
;     behalf a paid-up, nonexclusive, irrevocable worldwide license in        ;
;     this SOFTWARE to reproduce, prepare derivative works, and perform       ;
;     publicly and display publicly.                                          ;
;                                                                             ;
;  9) The SOFTWARE was prepared, in part, as an account of work sponsored     ;
;     by an agency of the United States Government.  Neither the United       ;
;     States, nor the University of Southern California, nor any of their     ;
;     employees, makes any warranty express or implied, or assumes any        ;
;     legal liability or responsibility for the accuracy, completeness,       ;
;     or usefulness of any information, apparatus, product, or process        ;
;     disclosed, or represents that its use would not infringe privately      ;
;     owned rights.                                                           ;
;                                                                             ;
;  10) IN NO EVENT WILL THE UNITED STATES OR THE UNIVERSITY OF SOUTHERN       ;
;      CALIFORNIA BE LIABLE FOR ANY DAMAGES, INCLUDING DIRECT, INCIDENTAL,    ;
;      SPECIAL, OR CONSEQUENTIAL DAMAGES RESULTING FROM EXERCISE OF THIS      ;
;      LICENSE AGREEMENT OR THE USE OF THE SOFTWARE.                          ;
;                                                                             ;
;  11) THIS SOFTWARE IS PROVIDED BY THE UNIVERSITY OF SOUTHERN CALIFORNIA     ;
;      "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT      ;
;      LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY, AND FITNESS     ;
;      FOR A PARTICULAR PURPOSE OR USE ARE DISCLAIMED.  THE UNIVERSITY OF     ;
;      SOUTHERN CALIFORNIA MAKES NO REPRESENTATION THAT THE SOFTWARE,         ;
;      MODIFICATIONS, ENHANCEMENTS OR DERIVATIVE WORKS THEREOF, WILL NOT      ;
;      INFRINGE ANY PATENT, COPYRIGHT, TRADE SECRET OR OTHER PROPRIETARY      ;
;      RIGHT.                                                                 ;
;                                                                             ;
;                                END OF LICENSE                               ;
;                                                                             ;
;                                                                             ;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; WHY.LISP (ABOX)

;;; Contains routines for expaining LOOM inferences

(in-package "LOOM")

(export '(why))


(defparameter *premise-table*
  '((:isa :instance :concept)
    (:satisfies-role :relation :instance :instance)
    (:specializes :concept :concept)
    (:incoherent :instance)
    (:incoherent-concept :concept)) )

;; OLDER VERSION OF *premise-table*:
;(defparameter *premise-table*
;  '((:isa instance/concept concept)
;    (:specializes concept concept)
;    (:fills-range instance relation)
;    (:fills-domain instance relation)
;    (:has-range relation concept)
;    (:has-domain relation concept)
;    (:has-value-restriction concept relation concept)
;    (:has-lower-bound concept relation integer)
;    (:has-upper-bound concept relation integer)
;    (:relates relation instance instance)))

;; THIS IS NOT USED YET:
(defstruct (PREMISE-RECORD (:conc-name premise))
  (tag nil)
  (justification nil)	;;  :assertion, :strict, :default
  (emphasis)	        ;;  :domain, :range
  (keyword nil)
  (arguments nil)
  )


;; Functions that print out explanations:

(defun explain-support (premise supportingPremises)
  ;; Generate an explanation of "premise" based on the
  ;;    "supportingPremises";
  (format t "~&~%")
  (say-one-premise premise)
  (format t " because:~%~%")
  (say-premises supportingPremises) )

(defun say-premises (premises)
  ;; Generate canned text explaining the meaning of each premise
  ;;    in "premises";
  (let ((indentLevel 3)
	(firstP t))
    (loop for premise in premises
	  when (eq (first premise) :indent)
	  do (incf indentLevel (second premise))
	  else do (unless firstP (format t "; and~%"))
	          (format t "~v@T" indentLevel)
	          (say-one-premise premise)
	          (setq firstP nil)
	  finally (format t ".~%")) ))

(defun say-one-premise (premise)
  ;; Generate canned text explaining the meaning of each premise
  ;;    in "premises";
  (let ((*forceNamingOfUnnamedConcepts* nil)	; DGB 4/24/90
	second third fourth)
    ;; needed by "TBOX-CONCEPT.generate-reference-definition";
    (declare (special *forceNamingOfUnnamedConcepts*))
    (setq second (second premise))
    (setq third (third premise))
    (setq fourth (fourth premise))
    (ecase (car premise)
      (:isa
       (say-words second "is an instance of the concept"
		  third))
      (:isnta
       (typecase third
	 (SET-FEATURE (say-words second "is not in the set"
				 (generate-set-definition-string third nil)))
	 (TBOX-CONCEPT (say-words second "is provably NOT an instance of the concept"
				  third))
	 (otherwise (say-words second "is provably NOT an instance of" third))))
      (:specializes
       (let ((conceptOrRelation
	       (typecase second
		 (UNARY-ENTITY "concept")
		 (t "relation"))))
	 (say-words conceptOrRelation second "specializes"
		  conceptOrRelation third)))
      (:inverse-of
       (say-words second "is the inverse of" third))
      (:asserted-fills-role
       (let ((aOrThe (if (role-is-single-valued-p second) 
			 "the" "a")))
	(say-words fourth "is asserted to be" aOrThe "filler of role"
		   second "of" third )))
      (:satisfies-role
       (let ((aOrThe (if (role-is-single-valued-p second) 
			 "the" "a")))
	 (say-words fourth "is" aOrThe "filler of the role" second "of" third)))
      ;; these next two are similar to :satisfies-role, but the English
      ;;    has a different emphasis:
      (:fills-role-domain
       (say-words second "has a role" third "containing a filler" fourth))
      (:fills-role-range
       (say-words  second "fills the role" third
		   "attached to the instance" fourth))
      ((:has-feature :has-default-feature)
       (let ((restrictionOrFeature
	       (typecase third
		 (RESTRICTION-FEATURE "restriction")
		 (otherwise "feature")))
	     (strictOrDefault (if (eq (car premise) :has-default-feature)
				"has the default"
				"has the")))
	 (typecase second
	   (UNARY-ENTITY
	    (say-words "concept" second strictOrDefault restrictionOrFeature
		       (feature-to-source-clause third)))
	   (otherwise
	    (say-words second strictOrDefault restrictionOrFeature
		       (feature-to-source-clause third))))))
      (:satisfies-feature
       (let ((restrictionOrFeature
	      (typecase third
		(RESTRICTION-FEATURE "restriction")
		(otherwise "feature"))))
	 (typecase second
	   (UNARY-ENTITY
	    (say-words "concept" second "satisfies the"
		       restrictionOrFeature (feature-to-source-clause third)))
	   (otherwise
	    (say-words second "satisfies the" restrictionOrFeature
		       (feature-to-source-clause third))))))
      (:contradicts-feature 
       (let ((restrictionOrFeature
	      (typecase third
		(RESTRICTION-FEATURE "restriction")
		(otherwise "feature"))))
	 (typecase second
	   (UNARY-ENTITY
	    (say-words "concept" second "is incompatible with the"
		       restrictionOrFeature (feature-to-source-clause third)))
	   (otherwise
	    (say-words second "contradicts the" restrictionOrFeature
		       (feature-to-source-clause third))))))

      (:has-domain
       (say-words "the domain of relation" second "is"
		third))
      (:has-range
       (say-words "the range of relation" second "is"
		third))
      (:not-satisfied
       (say-words second "is not satisfied"))
      (:incoherent
       (say-words "Instance" second "is incoherent"))
      (:incoherent-concept
       (say-words "Concept" second "is incoherent"))
      (:not-incoherent
       (say-words "Instance" second "is not incoherent"))
      (:disjoint
       (say-words "Concepts" second "and" third "are disjoint"))
      (:asserted-instance-of
       (say-words second "is asserted to be an instance of"
		  third))
      (:created-instance-of
       (say-words second "was created as an instance of"
		  third))
      (:asserted-non-instance-of
       (say-words second "is asserted NOT to be an instance of"
		third))
      (:asserted-instance-has-feature
       (say-words second "was asserted to have the feature" third))
      (:implies
       (say-words  second "implies" third))
      (:default
       (say-words  second "implies" third "by default"))
      (:contradicts-feature-of
       (say-words second "contradicts some feature of" third))
      (:satisfies-definition
       (say-words second "satisfies the definition of" third))
      (:has-primitive-concepts
       )
      (:unknown-isa
       (say-words second "is not known to be a" third))
      (:sorry
       (say-words "Sorry, I should know but I don't"))
      (:defined-as-disjunction
	  (say-words second "is defined as a disjunction of" (first third))
	  (loop for c in (rest third)
	      do (say-words "or" c)))
      (:string
       (apply #'say-words (cdr premise))))) )

(defun say-words (&rest sentence)
  ;; Specialized function that says "sentence";
  (declare (dynamic-extent sentence))
  (let (formatstring forms)
    (when (stringp (car sentence))
      (setf (car sentence)
	(string-upcase (car sentence) :end 1)))
    (setq formatstring
      (with-output-to-string (ss)
	(setq forms
	  (loop for item in sentence
	      when (stringp item)
	      do (princ item ss)
		 (princ " " ss)
	      else do (princ "~S " ss) 
	      and collect (if (dont-substitute-names-p)
			      item
			    (key item))))))
    (apply #'format t formatstring forms) ))


  ;;
;;;;;; Explanation generator
  ;;

(defmacro why (premise &key triples-p)
  ;; Generate a top-level explanation (in English) of the support for the
  ;;    truth of the premise "premise";
  ;; If "triples-p", return instead a list of supporting premises;
  (let ((semiQuotedPremise
	  (if (consp premise)
	      ;; leave ? variables unquoted:
	      (cons
		'list
		(loop for item in premise
		     collect
		     (if (question-mark-variable-p item)
			 item
			 `(quote ,item))))
	      premise)))	; bad premise
    `(why-premise ,semiQuotedPremise ,triples-p) ))

(defun why-premise (premise triples-p)
  ;; Generate a top-level explanation (in English) of the support for the
  ;;    truth of the premise "premise";
  ;; If "triples-p", return instead a list of supporting premises;
  (let (supportingPremises
	;; TO DO:  Change to T & make HTML printing work better
	; (*dontSubstituteNamesP* nil)
	)  
;    (declare (special *dontSubstituteNamesP*))
    (setq premise (evaluate&normalize-premise premise))
    (unless premise
      (return-from why-premise nil))
    (setq supportingPremises
	  (or (case (first premise)
		(:isa
		 (why-isa (second premise) (third premise)))
		(:satisfies-role
		 (why-satisfies-role (second premise) (third premise) (fourth premise)))
;; NOT YET IMPLEMENTED:
;		(:specializes
;		 (why-specializes (second premise) (third premise)))
		(:incoherent
		 (why-incoherent (second premise) :default :as-concept-p nil))
		(:incoherent-concept
		 (why-incoherent (second premise) :default :as-concept-p t)))
	      `((:sorry))))
    (if triples-p
	supportingPremises
	(explain-support
	  premise
	  supportingPremises)) ))

(defun evaluate&normalize-premise (premise)
  ;; Evaluate the arguments in "premise" (e.g., turn names
  ;;    and identifiers into concepts and instances);
  ;; Convert "premise" into triples and quadriples headed
  ;;    with keywords such as :isa and :satisfies-role;
  ;; Return the transformed premise;
  ;; Called by "why-premise";
  (let (premiseKeyword)
    (flet
      ((normalize-premise ()
	 ;; See if the first element of "premise" is a valid keyword;
	 ;; If its an ordinary symbol, determine if its and :isa or
	 ;;    a :satisfies-role;
	 ;; Return a normalized premise;
	 (let ((head (first premise))
	       matchingHead)
	   (setq premise
		 (cond
		   ((keywordp premise)
		    (when (not (assoc head *premise-table*))
		      (warn "Unrecognized premise keyword ~S")
		      (return-from evaluate&normalize-premise nil))
		    premise)
		   ((not (symbolp head))
		    (warn "Bad head of premise -- must be symbol or keyword symbol ~S"
			  head)
		    (return-from evaluate&normalize-premise nil))
		   ;; look for non-keyword that matches a legal premise keyword
		   ((setq matchingHead
			  (car (assoc (symbol-name head)
				     *premise-table*
				     :key #'symbol-name :test #'equal)))
		    (setq premise `(,matchingHead ,@(cdr premise))))
		   ((null (cddr premise))
		    `(:isa ,(second premise) ,(first premise)))
		   ((null (cdddr premise))
		    (push :satisfies-role premise))
		   (t
		    (warn "Too many arguments in premise ~S" premise)
		    (return-from evaluate&normalize-premise nil))))))
       (evaluate-arguments ()
	 (let ((premiseTemplate 
		 (assoc premiseKeyword *premise-table*)))
	   (when (not (= (length premise) (length premiseTemplate)))
	     (warn "Number of arguments in premise fails to match ~
                      premise template:~%   premise = ~S~%   template = ~S"
		   premise premiseTemplate)
	     (return-from evaluate&normalize-premise nil))
	   (loop for arg in (cdr premise)
		as argType in (cdr premiseTemplate)
		collect
		(or (case argType
		      (:instance (get-instance arg))
		      (:concept (get-concept arg :no-error-p t))
		      (:relation (get-relation arg :no-error-p t)))
		    (progn
		      (warn "Can't evaluate argument ~S" arg)
		      (return-from evaluate&normalize-premise nil)))))))
      (unless (and (consp premise)
		   (cdr premise))
	(warn "Bad syntax to `why' -- should be `(<premise> <arg>+)'~%   ~
           Input is: ~S" premise)
	(return-from evaluate&normalize-premise nil))
      (normalize-premise)
      (setq premiseKeyword (first premise))
      `(,premiseKeyword ,@(evaluate-arguments)) )))


  ;;
;;;;;; "why-isa"
  ;;

(defun why-isa (instance concept)
  ;; Return a list of premises that explains why "instance"
  ;;    isa "concept" (or that it isn't);
  ;; The code is designed to look for the simplest, most direct
  ;;    line of support that it can find;
  (let (premises)
    (declare (ignore premises))
    (unless
      (and
	(setq instance (get-instance instance))
	(setq concept (get-concept concept :no-error-p t)))
      (return-from why-isa
	(format t "Null ~S argument.~%"
		(if (null instance) "instance" "concept"))))
    (cond
     ((eql concept (loom-constant THING))
      `((:string "All objects are instances of THING")))
     ((eql concept (intrinsic-concept instance))
      `((:created-instance-of ,instance ,concept )))
     ((member concept (dynamically-asserted-conjuncts instance))
      `((:asserted-instance-of ,instance ,concept)))
     ((loop for c in (get-subconcepts concept)
	    when (member c (dynamically-asserted-conjuncts instance))
	    return `((:asserted-instance-of ,instance ,c)
		     (:specializes ,c ,concept))))
     (t (if (classified-instance-p instance)
	  (cond ((not (forward-chaining-isa-p instance concept :default))
		 `((:unknown-isa ,instance ,concept)))
		((why-conjuncts-table-implies-instance-isa-concept instance concept
								   :strict))
		((why-instance-classifies-as-concept instance concept :strict))
		((why-conjuncts-table-implies-instance-isa-concept instance concept
								   :default-only))
		((why-instance-classifies-as-concept instance concept :default-only))
		(t '((:sorry))))
	  (cond ((why-instance-classifies-as-concept instance concept :strict))
		((why-instance-classifies-as-concept instance concept :default-only))
		(t '((:sorry))))))) ))

(defun why-conjuncts-table-implies-instance-isa-concept
  (instance concept strict/default)
  ;; Called by "why-isa-concept";
  ;; Return a list of premises that indicate top level
  ;;    support for the premise that "instance" isa "concept";
  ;; This function limits its search for support by looking
  ;;    only in the conjuncts table of "instance";
  ;; Returning a nil value indicates lack of support for the original premise;
  ;; The value of "strict/default" indicates whether we or looking
  ;;    for strict support or default support;
  (let ((entries (loop for entry in (conjuncts-table instance)
		      when (subconcept-p (car entry) concept)
		      collect entry))
	conjunctRecord
	assertedEntries domain/rangeEntries valueRestrictionEntries)
    (when (null entries)
      (return-from why-conjuncts-table-implies-instance-isa-concept nil))
    (loop for e in entries
	 do
	 (setq conjunctRecord (cdr e))
	 (ecase strict/default
	   (:strict
	    (cond
	      ((assertion-p conjunctRecord)
	       (push e assertedEntries))
	      ((plusp (domain/range-count conjunctRecord))
	       (push e domain/rangeEntries))
	      ((plusp (strict-count conjunctRecord))
	       (push e valueRestrictionEntries))))
	   (:default-only
	    (when (default-p conjunctRecord)
	      (push e valueRestrictionEntries)))))
    (cond
      (assertedEntries
       (if (assoc concept assertedEntries)
	   `((:asserted-instance-of ,instance ,concept))
	   `((:asserted-instance-of ,instance ,(caar assertedEntries))
	     (:specializes ,(caar assertedEntries) ,concept))))
      (domain/rangeEntries
       (why-filling-domain/range-implies-instance-isa-concept
	 instance concept (caar domain/rangeEntries)))
      (valueRestrictionEntries
       ;; Note: we don't investigate multiple lines of support
       ;;    here (but we may wish to later if circular
       ;;    support becomes a problem):
       (why-value-restriction-implies-instance-isa-concept
	 instance concept (caar valueRestrictionEntries) strict/default))) ))

(defun why-filling-domain/range-implies-instance-isa-concept (instance concept conjunct)
  ;; Called by "why-conjuncts-table-implies-instance-isa-concept";
  ;; Return a list of premises that explain the existence of
  ;;    a role of "instance" such that a domain or range constraint
  ;;    on that role implies that "instance" isa "concept";
  ;; "conjunct" names a concept known to be the domain or range of
  ;;    a role that originates a constraint such as just described;
  (let (role roleFiller domain/range)
    (labels ((find-simple-filler-of-range-of-role
	       ;; Find a filler of "role" of "instance" whose support is as
	       ;;    direct as possible;
	       ()
	       (let ((roleRecord
		       (assoc role (role-fillers-table instance))))
		 (cond
		   (roleRecord
		    (setq roleRecord (cdr roleRecord))
		    (or (car (asserted-fillers roleRecord))
			(car (strict-fillers roleRecord))
			(car (default-fillers roleRecord))))	    
		   (t
		    (car (get-slot-values instance role))))))
	     (find-role-filled-by-instance-with-domain/range
	       ()
	       (loop for entry in (dynamic-variables instance)
		    do
		    (if (symbolp (car entry))
			(progn			; ordinary role
			  (setq role (symbol-value (car entry)))
			  (when (eq (implied-domain role) conjunct)
			    (setq roleFiller
				  (find-simple-filler-of-range-of-role))
			    (return-from find-role-filled-by-instance-with-domain/range
			      :domain)))
			(progn			; phantom inverse
			  (setq role (inverse-of-phantom (car entry)))
			  (setq roleFiller (cadr entry))
			  (return-from find-role-filled-by-instance-with-domain/range
			    :range))))))
      (setq domain/range
	    (find-role-filled-by-instance-with-domain/range))
      `((,(case domain/range
	    (:domain :fills-role-domain)
	    (:range :fills-role-range))
	 ,instance ,role ,roleFiller)
	(,(case domain/range
	    (:domain :has-domain)
	    (:range :has-range))
	 ,role ,conjunct)
	,@(when (neq concept conjunct)
	    `((:specializes ,conjunct ,concept)))) )))

(defun why-value-restriction-implies-instance-isa-concept
       (instance concept conjunct strict/default)
  ;; Called by "why-conjuncts-table-implies-instance-isa-concept";
  ;; Return a list of premises that explain why a value restriction
  ;;    on a neighboring instance implies that "instance"
  ;;    isa "concept";
  ;; "conjunct" is a concept that is a value restriction propagated
  ;;    to "instance" across some inverse role attached to some
  ;;    neighboring instance;
  ;; The value of "strict/default" indicates whether we or looking
  ;;    for strict support or default support;
  (let (role inverseRole neighbor valueRestriction)
    (flet ((find-constraining-value-restriction-p
	     (filler)
	     (loop for vr
		  in (ecase strict/default
		       (:strict (strict-cumulative-value-restrictions filler))
		       ((:default :default-only)
			(cumulative-value-restrictions filler)))
		  when (and (subconcept-p inverseRole (relation vr))
			    (eq (value-restriction vr) conjunct))
		  do
		  (setq valueRestriction vr)
		  (setq neighbor filler)
		  (return-from find-constraining-value-restriction-p t))))
      (when
	(multiple-value-bind (roleEntries phantomEntries)
	    (collect-roles&fillers instance)
	  (or (loop for entry in roleEntries
		   thereis
		   (and (setq role (get-relation (car entry)))
			(setq inverseRole (inverse role))
			(loop for filler in (get-slot-values instance role)
			     thereis (find-constraining-value-restriction-p filler))))
	      
	      (loop for entry in phantomEntries
		   thereis
		   (progn
		     (setq inverseRole (inverse-of-phantom (car entry)))
		     (loop for filler in (cdr entry)
			  thereis (find-constraining-value-restriction-p filler))))))
	`(,@(why-has-value-restriction neighbor valueRestriction strict/default)
	  (:fills-role-range ,instance ,inverseRole ,neighbor)
	  ,@(when (neq concept conjunct)
	      `((:specializes ,conjunct ,concept)))
	  ,@(when (neq inverseRole (relation valueRestriction))
	      `((:specializes ,inverseRole ,(relation valueRestriction)))))) )))

(defmethod why-has-value-restriction (self valueRestriction strict/default)
  ;; Return a list of premises that explains why the value restriction
  ;;    "valueRestriction" applies to the instance "self";
  (let ((types (ecase strict/default
	       (:strict (strict-db-type self))
	       ((:default :default-only) (db-type self)))))
    (cond
     ((and (eq strict/default :strict)
	   (member valueRestriction (asserted-features self)))
      `(:asserted-instance-has-feature ,self ,valueRestriction))
     ((consp types)
      (loop for concept in types
	  when (has-feature-p concept valueRestriction strict/default)
	  do (return-from why-has-value-restriction
	       `((:isa ,self ,concept)
		 (:has-feature ,concept ,valueRestriction)))))
     ((has-feature-p types valueRestriction strict/default)
      `((:isa ,self ,types)
	(:has-feature ,types ,valueRestriction)))
     (t nil))) )


#||
;; Code from backchain.lisp that can be adopted...

(defun satisfies-concept-definition-p (instance concept currentType)
  ;; Test if the instance "instance" satisfies all components of the definition
  ;;    of the concept "concept";
  ;; If "concept" is temporal, coerce instance to its time-map before proceeding;
  ;; ^^^ THIS MAY BREAK IF WE ARE NOT IN A QUERY!!!
  (flet ((primitives-satisfied-p (instance concept currenttype)
	 ;; Tests whether "instance" satisfies all primitive concepts
	 ;; of "concept";
	 (if (subconcept-p currenttype (loom-constant CONSTANT))
	     (loop for prim in (primitive-concepts concept)
		 always 
		 (or (has-instance-p prim instance)
		     (loop for ant in (most-general-antecedents prim)
			 thereis (has-instance-p ant instance))))
	     (loop for prim in (primitive-concepts concept)
		 always 
		 (or (instrumented-subconcept-p currentType prim instance)
		     (loop for ant in (most-general-antecedents prim)
			 thereis (has-instance-p ant instance)))))))
  (when (temporal-p concept)
    (setq instance (time-map instance))
    (when (null instance)
      (return-from satisfies-concept-definition-p nil)))
  (or 
   ;; test definition components:
   (and
    (primitives-satisfied-p instance concept currentType)         
    (instance-satisfies-concept-features-p concept instance currentType)
    (or (null (defined-set-feature concept))
        (feature-is-satisfied-p (defined-set-feature concept) instance))
    (loop for neg in (negated-concepts concept)
          always (not-has-instance-p neg instance))
    ;; test disjuncts
    (loop for disjunction in (disjunctive-features concept)
          always
          (loop for d in (disjuncts disjunction)        ; RMM 2/19/93
                thereis (has-instance-p d instance))))
   ;; test antecedents:
   (loop for ant in (most-general-antecedents concept)
        thereis (has-instance-p ant instance))) ))

(defun instance-satisfies-concept-features-p (concept instance currentType)
  ;; Return t if all features in the definition of "concept" are
  ;;    satisfied by "instance", either because they are implied by
  ;;    "currentType" or because they survived a feature probe;
  (let ((nonInheritedFeatures nil)
         assertedFeatures)
    (loop for ftr in (restrictions concept)
          unless (member ftr (restrictions currentType))
          do (push ftr nonInheritedFeatures))
    (loop for ftr in (comparisons concept)
          unless (member ftr (comparisons currentType))
          do (push ftr nonInheritedFeatures))
    (loop for ftr in (computed-features concept)
          unless (member ftr (computed-features currentType))
          do (push ftr nonInheritedFeatures))
    (or (null nonInheritedFeatures)
        (progn
          (multiple-value-setq (currentType assertedFeatures)
            (find-type&residue-features instance))
          ;; Tricky: The test function uses a lambda expression because
          ;;   SUBCONCEPT-P is a Macro.  Also, the order of the arguments
          ;;   is reversed!
          (loop for f in nonInheritedFeatures
                always
                (or (member f assertedFeatures 
                            :test #'(lambda (x y) (subconcept-p y x))) ;  TAR 9/12/94
                    (feature-is-satisfied-p f instance))))) ))

||#

(defun why-instance-classifies-as-concept (instance concept strict/default)
  ;; Called by "why-isa-concept";
  ;; Return a list of premises that indicate top level
  ;;    support for the premise that "instance" isa "concept";
  ;; Situation: Support for this premise was not available form
  ;;    inspecting the conjuncts table of instance, so we must
  ;;    determine how the classifier made this inference;
  ;; The value of "strict/default" indicates whether we or looking
  ;;    for strict support or default support;
  (let ((assertedTypes (get-types instance :asserted-p t))
	(currentType (cond ((lite-instance-p instance)
			    (find-type&residue-features instance))
			   ((clos-instance-p instance)
			    ;; Bail out:
			    (return-from why-instance-classifies-as-concept nil))
			   ;; Now a classified-instance:
			   ((eq strict/default :strict)
			    (strict-db-type instance))
			   (t (db-type instance)))))
    (cond ((member concept assertedTypes)
	   `((:asserted-instance-of ,instance ,concept)))
	  ((loop for c in assertedTypes
	       when (subconcept-p c concept)
	       return `((:asserted-instance-of ,instance ,c)
			(:specializes ,c ,concept))))
	  ((loop for ant in (antecedents concept)
	       when (member ant assertedTypes)
	       return `((:asserted-instance-of ,instance ,ant)
			(:implies ,ant ,concept))
	       when (loop for c in assertedTypes
			when (subconcept-p c ant)
			return `((:asserted-instance-of ,instance ,c)
				 (:specializes ,c ,ant)
				 (:implies ,ant ,concept)))
	       return it))
	  ((and (neq strict/default :strict)
		(loop for c in assertedTypes
		    when (member concept (default-concepts c))
		    return `((:asserted-instance-of ,instance ,c)
			     (:default ,c ,concept)))))
	  (nil (instance-satisfies-concept-p  ;; Not defined yet!
	    instance concept currentType)
	   (why-instance-satisfies-concept-p instance concept currentType))
	  (t nil)) ))

#|
;; FIX NEXT 2 FUNCTIONS.
(defun why-instance-satisfies-concept-p (instance concept currentType)
  ;; Test if the instance "instance" satisfies all components of the definition
  ;;    of the concept "concept";
  ;; Assumes that the antecedents test has already been done.
  ;; If "concept" is temporal, coerce instance to its time-map before proceeding;
  ;; ^^^ THIS MAY BREAK IF WE ARE NOT IN A QUERY!!!
  (flet ((primitives-satisfied-p (instance concept currenttype)
	 ;; Tests whether "instance" satisfies all primitive concepts
	 ;; of "concept";
	 (if (subconcept-p currenttype (loom-constant CONSTANT))
	     (loop for prim in (primitive-concepts concept)
		 always 
		 (or (has-instance-p prim instance)
		     (loop for ant in (most-general-antecedents prim)
			 thereis (has-instance-p ant instance))))
	     (loop for prim in (primitive-concepts concept)
		 always 
		 (or (instrumented-subconcept-p currentType prim instance)
		     (loop for ant in (most-general-antecedents prim)
			 thereis (has-instance-p ant instance)))))))
  (when (temporal-p concept)
    (setq instance (time-map instance))
    (when (null instance)
      (return-from why-instance-satisfies-concept-p nil)))
  ;; test definition components:
   (and
    (primitives-satisfied-p instance concept currentType)         
    (instance-satisfies-concept-features-p concept instance currentType)
    (or (null (defined-set-feature concept))
        (feature-is-satisfied-p (defined-set-feature concept) instance))
    (loop for neg in (negated-concepts concept)
          always (not-has-instance-p neg instance))
    ;; test disjuncts
    (loop for disjunction in (disjunctive-features concept)
          always
          (loop for d in (disjuncts disjunction)        ; RMM 2/19/93
                thereis (has-instance-p d instance))))
   ))

(defun why-instance-satisfies-concept-features-p (concept instance currentType)
  ;; Return t if all features in the definition of "concept" are
  ;;    satisfied by "instance", either because they are implied by
  ;;    "currentType" or because they survived a feature probe;
  (let ((nonInheritedFeatures nil)
         assertedFeatures)
    (loop for ftr in (restrictions concept)
          unless (member ftr (restrictions currentType))
          do (push ftr nonInheritedFeatures))
    (loop for ftr in (comparisons concept)
          unless (member ftr (comparisons currentType))
          do (push ftr nonInheritedFeatures))
    (loop for ftr in (computed-features concept)
          unless (member ftr (computed-features currentType))
          do (push ftr nonInheritedFeatures))
    (or (null nonInheritedFeatures)
        (progn
          (multiple-value-setq (currentType assertedFeatures)
            (find-type&residue-features instance))
          ;; Tricky: The test function uses a lambda expression because
          ;;   SUBCONCEPT-P is a Macro.  Also, the order of the arguments
          ;;   is reversed!
          (loop for f in nonInheritedFeatures
                always
                (or (member f assertedFeatures 
                            :test #'(lambda (x y) (subconcept-p y x))) ;  TAR 9/12/94
                    (feature-is-satisfied-p f instance))))) ))
|#


(defun explain-feature-match (instance concept feature)
  ;; TO DO: Add test for asserted features!
  ;;        Add test for feature implied by asserted concept
  (let ((reasons nil)
	(relation (relation feature))
	(qualification (qualification feature))
	valueRestriction)
    (multiple-value-bind (closedSetP queryFillers)
	(collect-subsuming-set-of-fillers-p instance relation qualification)
      (typecase feature
	(VALUE-RESTRICTION
	 (setq valueRestriction (value-restriction feature))
	 (if (loop for f in queryFillers 
		     always (has-instance-p valueRestriction f))
	   (loop for f in queryFillers 
		 initially (push '(:indent -3) reasons)
		           (when closedSetP
			     (push `(:closed-set-of-fillers ,relation) reasons))
		 do (push `(:fills-role-domain ,instance ,relation ,f) reasons)
		    (push `(:isa ,f ,(generate-reference-definition 
				      valueRestriction))
			  reasons)
	         finally (push '(:indent 3) reasons))
	   (setq reasons `((:satisfies-feature ,instance ,feature)))))
	(MIN-RESTRICTION
	 (if (>= (length queryFillers) (lower-bound feature))
	   (loop for f in queryFillers
		 initially (push '(:indent -3) reasons)
		 when qualification
		 do (if (has-instance-p qualification f)
		      (push `(:isa ,f ,qualification) reasons)
		      (warn "Filler ~S should be a ~S" f qualification))
		 do (push `(:fills-role-domain ,instance ,relation ,f) reasons)
	         finally (push '(:indent 3) reasons))
	   (setq reasons `((:satisfies-feature ,instance ,feature)))))
	(MAX-RESTRICTION
	 (if (<= (length queryFillers) (upper-bound feature))
	   (loop for f in queryFillers
		 initially (push '(:indent -3) reasons) 
		           (when closedSetP
			     (push `(:closed-set-of-fillers ,relation) reasons))
		 when qualification
		 do (if (has-instance-p qualification f)
		      (push `(:isa ,f ,qualification) reasons)
		      (warn "Filler ~S should be a ~S" f qualification))
		  do (push `(:fills-role-domain ,instance ,relation ,f) reasons)
		  finally (push '(:indent 3) reasons))
	   (setq reasons `((:satisfies-feature ,instance ,feature)))))
	(SET-FEATURE
	 (setq reasons `((:isa ,instance ,feature))))
	(COMPUTED-FEATURE
	 (setq reasons `((:satisfies-feature ,feature))))
	(FILLED-BY-FEATURE
	 (if (loop for f in (role-fillers feature)
		   always (member f queryFillers :test #'filler-equal))
	   (loop for f in (role-fillers feature)
		 initially (push '(:indent -3) reasons) 
		 do (push `(:fills-role-domain ,instance ,relation ,f) reasons)
		 finally (push '(:indent 3) reasons))
	   (setq reasons `((:satisfies-feature ,instance ,feature)))))
	(otherwise
	 (setq reasons `((:satisfies-feature ,instance ,feature)))))

      (cons `(:has-feature ,concept ,feature) reasons))))





  ;;
;;;;;; "why-incoherent"
  ;;

(defun explain-feature-contradiction (instance concept feature)
  (multiple-value-bind (closedSetP queryFillers)
      (collect-subsuming-set-of-fillers-p instance
					  (relation feature)
					  (qualification feature))
    (declare (ignore closedSetP))
    (cons `(:has-feature ,concept ,feature)
	  (typecase feature
	    (VALUE-RESTRICTION
	     (loop for f in queryFillers
		 when (not-has-instance-p (value-restriction feature) f)
		 return `((:fills-role-domain ,instance ,(relation feature) ,f)
			  (:isnta ,f ,(generate-reference-definition
				       (value-restriction feature))))))
	    (MIN-RESTRICTION
	     (if (< (length queryFillers) (upper-bound feature))
		 (loop for f in queryFillers
		     collect `(:fills-role-domain ,instance ,(relation feature) ,f))
	       '((:sorry))))
	    (MAX-RESTRICTION
	     (if (> (length queryFillers) (upper-bound feature))
		 (loop for f in queryFillers
		     collect `(:fills-role-domain ,instance ,(relation feature) ,f))
	       '((:sorry))))
	    (SET-FEATURE
	     `((:isnta ,instance ,feature)))
	    (COMPUTED-FEATURE
	     `((:not-satisfied ,feature)))
	    (NOT-FILLED-BY-FEATURE
	     `(:fills-role-domain
	       ,instance
	       ,(relation feature)
	       ,(first (intersection queryFillers (non-role-fillers feature)))))
	    (otherwise `((:contradicts-feature ,instance ,feature))))) ))


(defun why-incoherent (instance strict/default &key as-concept-p)
  ;; Return a list of premises that indicate why "instance"
  ;;    is incoherent;
  ;; If "as-concept-p", then explain why the CBox definition
  ;;    of "instance" is incoherent;
  (let ((conjuncts (find-most-specific-named-super-concepts
		    (union (list-of (case strict/default
				      (:strict (strict-db-type instance))
				      (otherwise (db-type instance))))
			   (get-asserted-types instance)))))
    (flet ((belongs-to-incoherent-concept-p ()
             (loop for c1 in conjuncts
		 when (incoherent-p c1)
		 do (return-from belongs-to-incoherent-concept-p
		      `((,(if (asserted-instance-of-concept-p instance c1)
			      :asserted-instance-of :isa)
			    ,instance ,c1)
			   (:incoherent-concept ,c1)))))
	   (why-conjuncts-are-disjoint ()
	     (loop for c1 in conjuncts
		 do (loop for c2 in conjuncts
			when (and (neq c1 c2)
				  (disjoint-concepts-p c1 c2))
			do (return-from why-conjuncts-are-disjoint
			     `((,(if (asserted-instance-of-concept-p instance c1)
				     :asserted-instance-of :isa)
				   ,instance ,c1)
				  (,(if (asserted-instance-of-concept-p instance c2)
					:asserted-instance-of :isa)
				      ,instance ,c2)
				  (:disjoint ,c1 ,c2))))))
	   (why-asserted-conjunct-is-violated ()
	     (loop with disjunctiveViolations = nil
		 for c1 in (get-asserted-types instance)
		 as f = (instance-contradicts-features-p instance c1 *THING* nil)
		 when f
		 do (return-from why-asserted-conjunct-is-violated
		      `((:asserted-instance-of ,instance ,c1)
			,@(explain-feature-contradiction instance c1 f)))
		 else if (disjuncts c1)  ;; Defined as a disjunction, must check them!
		 when (loop for c2 in (disjuncts c1)
			  as f2 = (instance-contradicts-features-p 
				   instance c2 *THING* nil)
			  initially (setq disjunctiveViolations nil)
			  unless f2 return nil
			  else do (push (cons c2 f2) disjunctiveViolations)
			  finally (return t))
		      ;; NEED BETTER DISJUNCTIVE EXPLANATION:
		 do (return-from why-asserted-conjunct-is-violated
		      `((:asserted-instance-of ,instance ,c1)
			(:defined-as-disjunction ,c1 ,(disjuncts c1))
			,@(loop for (c2 . f2) in disjunctiveViolations 
			      collect `(:isnta ,instance ,c2)
			      append (explain-feature-contradiction instance c2 f2))))))

	   (why-asserted-negation-is-violated ()
	     ;; TO DO:  Loop through assered-negations and check against
	     ;;         asserted concepts, and the type of the instance.
	     ;; Look for conflicts.
	     (loop for cneg in (asserted-negations instance)
		 do (loop for cpos in (get-asserted-types instance)
			when (eq cneg cpos)
			do (return-from why-asserted-negation-is-violated
			     `((:asserted-instance-of ,instance ,cpos)
			       (:asserted-non-instance-of ,instance ,cneg)))
			when (subconcept-p cneg cpos)
			do (return-from why-asserted-negation-is-violated
			     `((:asserted-instance-of ,instance ,cpos)
			       (:asserted-non-instance-of ,instance ,cneg)
			       (:specializes ,cneg ,cpos)))
			when (subconcept-p cneg cpos)
			do (return-from why-asserted-negation-is-violated
			     `((:asserted-instance-of ,instance ,cpos)
			       (:asserted-non-instance-of ,instance ,cneg)
			       (:specializes ,cpos ,cneg))))))
	   )
      (if as-concept-p
	  (cond
	   ((not (concept-p instance))
	    (error "~A Needs to be a concept" instance))
	   ((not (incoherent-p instance))
	    `((:not-incoherent ,instance)))
	   ((loop for explanation in 
		  (get-slot-values instance (loom-constant INCOHERENCE-REASON))
		collect `(:string ,explanation)))
	   (t
	    "NOT YET IMPLEMENTED"
	    nil
	    '((:sorry))))
	(cond
	 ((not (incoherent-instance-p instance))
	  `((:not-incoherent ,instance)))
	 ((belongs-to-incoherent-concept-p))
	 ((why-conjuncts-are-disjoint))
	 ((why-asserted-conjunct-is-violated))
	 ((why-asserted-negation-is-violated))
	 ((loop for explanation in 
		(get-slot-values instance (loom-constant INCOHERENCE-REASON))
	      collect `(:string ,explanation)))
	 (t '((:sorry)))
	 )) )))



  ;;
;;;;;; "why-satisfies-role"
  ;;

(defun why-satisfies-role (role instance filler)
  (let ((inverseRole (inverse role))
	localRelation qualification)
    (flet ((find-feature (restrictionList)
	      (first (specializing-restrictions (or localRelation role)
						qualification
						restrictionList
						:filled-by))))
      (multiple-value-setq (localRelation qualification)
	(compute-local-relation&qualification role nil))
      (cond ((member filler (get-values instance role :asserted-p t)
		     :test #'filler-equal)
	     `((:asserted-fills-role ,role ,instance ,filler)))
	    ((loop for r in (get-subrelations role)
		   when (member filler (get-values instance r :asserted-p t)
				:test #'filler-equal)
		   return `((:asserted-fills-role ,r ,instance ,filler)
			    (:specializes ,r ,role))))
	    ;; Inverse role tests here:
	    ((and inverseRole 
		  (member instance (get-values filler inverseRole :asserted-p t)
			  :test #'filler-equal))
	     `((:asserted-fills-role ,inverseRole ,filler ,instance)
	       (:inverse-of ,inverseRole ,role)))
	    ((and inverseRole 
		  (loop for r in (get-subrelations inverseRole)
			when (member filler (get-values instance r :asserted-p t)
				     :test #'filler-equal)
			return `((:asserted-fills-role ,r ,instance ,filler)
				 (:specializes ,r ,inverseRole)
				 (:inverse-of ,inverseRole ,role)))))
	    ((why-satisfies-role-definition role instance filler))
	    ((loop for ant in (antecedents role)
		   when (member filler (get-values instance ant :asserted-p t)
				:test #'filler-equal)
		   return `((:asserted-fills-role ,ant ,instance ,filler)
			    (:implies ,ant ,role))
		   when (member filler (get-values instance ant :asserted-p nil)
				:test #'filler-equal)
		   return `((:satisfies-role ,ant ,instance ,filler)
			    (:implies ,ant ,role))))
	    ;; Following doesn't use MORE-SPECIFIC-CONSEQUENT.
	    ((loop with default-reason = nil
		   for c in (get-types instance)
		   when (member filler (get-role-strict-values c role) 
				:test #'filler-equal)
		   return `((:isa ,instance ,c)
			    (:has-feature
			     ,c ,(find-feature (implied-restrictions c))))
		   when (and (null default-reason)
			     (member filler (get-role-default-values c role) 
				     :test #'filler-equal))
		   do (setq default-reason 
			    `((:isa ,instance ,c)
			      (:has-default-feature
			       ,c ,(find-feature (default-features c)))))
		   finally (return default-reason)))
	    (t 
	     '((:sorry)))) )))

(defun why-satisfies-role-definition (role instance filler)
  (let ((conjuncts (conjuncts role))
	(domainRestriction (more-restrictive-defined-domain role))
	(rangeRestriction (more-restrictive-defined-range role))
	(reasons nil))
    (loop for r in conjuncts
	  when (member filler (get-values instance r :asserted-p t)
		       :test #'filler-equal)
	  do (push `(:specializes ,role ,r) reasons)
	     (push `(:asserted-fills-role ,r ,instance ,filler) reasons)
	  else when (member filler (get-values instance r :asserted-p nil)
			    :test #'filler-equal)
	  do (push `(:specializes ,role ,r) reasons)
	     (push `(:satisfies-role ,r ,instance ,filler) reasons)
	  else do (return-from why-satisfies-role-definition nil))
    (when domainRestriction
      (unless (has-instance-p domainRestriction instance)
	(return-from why-satisfies-role-definition nil))
      (push `(:has-domain ,role ,domainRestriction) reasons)
      (push `(:isa ,instance ,domainRestriction) reasons))
    (when rangeRestriction
      (unless (has-instance-p rangeRestriction filler)
	(return-from why-satisfies-role-definition nil))
      (push `(:has-range ,role ,rangeRestriction) reasons)
      (push `(:isa ,filler ,rangeRestriction) reasons))
    (nreverse reasons)))



  ;;
;;;;;; Low-level predicates used by explanation routines
  ;;


(defun forward-chaining-isa-p (instance concept strict/default)
  ;; Helping function for some of the explanation (why) routines;
  ;; Return t if "instance" LOOM has proved via forward-chaining
  ;;    that "instance" is an instance of "concept";
  ;; The value of "strict/default" indicates whether we or looking
  ;;    for strict support or default support;
  (ecase strict/default
    (:strict
     (if (consp (strict-db-type instance))
	 (loop for c in (strict-db-type instance)
	     thereis (subconcept-p c concept))
       (subconcept-p (strict-db-type instance) concept)))
     ((:default :default-only)
      (if (consp (db-type instance))
	  (loop for c in (db-type instance)
	      thereis (subconcept-p c concept))
	(subconcept-p (db-type instance) concept)))) )

(defun has-feature-p (concept feature strict/default)
  ;; Return t if "concept" has the feature "feature";
  ;; The value of "strict/default" indicates whether we or looking
  ;;    for strict support or default support;
  (or (member feature
	    (ecase (feature-type feature)
	      (( :value-restriction :min-restriction :max-restriction
		:filled-by :not-filled-by)
	       (implied-restrictions concept))
	      ((:same-as :relates :exists)
	       (implied-comparisons concept))
	      (:computed-feature
	       (computed-features concept))))
      (and (member strict/default '(:default-only :default))
	   (member feature (default-features concept)))) )

(defmethod feature-to-source-clause ((feature SET-FEATURE))
  ;; Return an expression describing the "feature";
  (generate-set-definition-string feature nil) )

(defmethod feature-to-source-clause ((feature RESTRICTION-FEATURE))
  ;; Return an expression describing the "feature";
  ;; Borrows code from "generate-list-of-restrictions";
  (let* ((relation (relation feature))
	 (relationRef (generate-reference-definition relation))
	 (qual (qualification feature))
	 (qualRef (and qual
		       (list (generate-reference-definition qual))))
	 (*expandSystemDefinedConceptsP* t))
    (declare (special *expandSystemDefinedConceptsP*))
    (ecase (feature-type feature)
      (:value-restriction 
       `(:all ,relationRef 
	      ,(generate-reference-definition (value-restriction feature))
	      ,@qualRef))
      (:min-restriction 
       `(:at-least ,(lower-bound feature) ,relationRef ,@qualRef))
      (:max-restriction 
       `(:at-most ,(upper-bound feature) ,relationRef ,@qualRef))
      (:filled-by
       `(:fillers ,relationRef
		  ,@(loop for i in (role-fillers feature)
			collect (generate-filler i))))
      (:not-filled-by 
       `(:not-filled-by ,relationRef
			,@(loop for i in (non-role-fillers feature)
			      collect (generate-filler i))))) ))

(defmethod feature-to-source-clause ((feature COMPARISON-FEATURE))
  ;; Return an expression describing the "feature";
  (generate-comparison-clause feature) )

(defmethod feature-to-source-clause ((feature COMPUTED-FEATURE))
  ;; Return an expression describing the "feature";
  (generate-computed-feature-clause feature) )
