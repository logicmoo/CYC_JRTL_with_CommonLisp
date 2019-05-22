;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10.  -*-

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

;;; CONDITION.LISP (TBOX)

;;; Functions and Methods that perform conditioning on Loom concepts

(in-package "LOOM")


  ;;
;;;;;;  Conditioning
  ;;


;;; "Conditioning" a concept means modifying its definition to be
;;;    consistent with the properties it inherits.  Two products of
;;;    emerge from conditioning:  First, a concept definition may
;;;    have been changed -- in this case the slot "source-definitions"
;;;    should be updated to reflect this change.  Second, the process
;;;    of scanning inherited properties generates lists of such properties
;;;    which can be used later by the subsumption-test routines -- hence,
;;;    we will save these lists.
;;;    
;;; For example, modifications to a reified concept's restrictions causes the
;;;    slot "restrictions" to be altered.  After checking to see if the
;;;    user wishes to reflect the altered "restrictions" and "computed-features"
;;;    slots in the original concept definition, the slots are modified
;;;    a second time, to reflect the most specific restrictions or
;;;    computed-features found, including both inherited as well as local
;;;    restrictions/computed-features.

(defun conditioning-warning (message &rest arguments)
  ;; Broadcast a warning message, and then resume parsing;
  (declare (special *conceptBeingConditioned*))
  (when (member :warn-about-syntax-corrections *loom-dialogue-features*)
    (complain "~%Conditioning Warning:   ~?." message arguments)
    (complain "~%Warning occurred in the definition:~%   ~S~%"
	      (or (generate-source-definition *conceptBeingConditioned*)
		  *conceptBeingConditioned*))
;    (setq arguments					; Simplified, 7/2/92 tar
;	  (loop for arg in arguments append `(',arg)))	; quote incoming arguments
;    (eval `(format t ,message ,@arguments))
;    (format t ".~%Warning occurred in the definition:~%   ~S~%"
;	    (generate-source-definition *conceptBeingConditioned*))
    ) )

(defun conditioning-error (message &rest arguments)
  ;; Send an error message, and pop out of "condition-concept"
  (declare (special *conceptBeingConditioned*))
  (complain "~%Conditioning Error:   ~?." message arguments)
  (complain ".~%Error occurred in the definition:~%   ~S~%"
	    (or (generate-source-definition *conceptBeingConditioned*)
		*conceptBeingConditioned*))
  (throw 'condition-concept-catcher nil))

(defmethod condition-concept ((self CLASSIFIABLE-OBJECT))
  ;; Restructure a concept to make it conform with a canonical
  ;;    representation;  this may involve a dialogue with the user;
  ;; Fill in any slots needed by the classifier ("all-super-classes"
  ;;    is the only-one)
  ;; As a side-effect, other concepts or relations may be created
  ;; This is the default method, which was a NO-OP.
  self )

  ;;
;;;;;; Conditioning and pre-classifying of UNARY-ENTITYS
  ;;

(defmethod condition-concept ((self UNARY-ENTITY))
  ;; Achieve a canonical form for "self" in which redundant information
  ;;    has been removed, forward inferences which further restrict
  ;;    the definition have been deduced, and incoherence has been
  ;;    detected;
  ;; A dialogue with the user will ensue before the more significant
  ;;    types of modifications are applied
 #L:trace-cond (trace-values "condition-concept:" self (restrictions self))
  (let ((*hasLocallyDefinedSetFeatureP* (defined-set-feature self))
	*restrictionInducedConjuncts*
	mostSpecificRestrictions mostSpecificCMPs)
    (declare (special *hasLocallyDefinedSetFeatureP* *restrictionInducedConjuncts*))
    ;; NOTE: Nested labels are required here because of a Lucid compiler bug  ; DGB 2/20/91
    (labels ((condition-conjuncts&features ()
	       (condition-conjuncts self)
               (condition-negations self)       ;  RMM 12/21/93
	       (condition-computed-features self)
	       ;; comparisons are conditioned before restrictions so that
	       ;;    :same-as equivalences can cause merging of restrictions:
	       (setq mostSpecificCMPs (condition-comparisons self :tbox)) 
	       (multiple-value-setq (mostSpecificRestrictions mostSpecificCMPs)
		 (condition-restrictions self mostSpecificCMPs :tbox))))
      (labels ((fold-in-restriction-induced-conjuncts ()
		 ;; Note: "propagate-within-restrictions" fills the
		 ;;    special variable *restrictionInducedConjuncts*;
		 (let (foundMoreSpecificConjunctP)
		   (loop for c in *restrictionInducedConjuncts*
			when (or (null (conjuncts self))
				 (not (typelist-specializes-concept-p (conjuncts self) c)))
			do 
			(pushnew c (conjuncts self))
			(setq foundMoreSpecificConjunctP t))
		   (setq *restrictionInducedConjuncts* nil)
		   (when foundMoreSpecificConjunctP
		     (condition-conjuncts&features)
		     (when *restrictionInducedConjuncts*
		       (fold-in-restriction-induced-conjuncts))))))
	(when (and (pure-set-definition-p self) 
		   (neq (defined-as self) :set))
	  (integrity-check (null (defined-as self)))
	  (setf (defined-as self) :set))
	(case (defined-as self)
	  (:disjunction (condition-disjuncts self)))
	;; possible side-effect -- set-conditioning may create a new conjunct:
	(condition-set-features self :tbox)
	(convert-comparisons-to-restrictions self :tbox)
	(condition-conjuncts&features)
	(when *restrictionInducedConjuncts*
	  (fold-in-restriction-induced-conjuncts))
	;; now we install the completed restrictions and comparisons
	(setf (restrictions self) mostSpecificRestrictions)
	(setf (comparisons self) mostSpecificCMPs)
;	(attempt-to-change-source-definition self)
	(loop for feature in (bag-append mostSpecificCMPs mostSpecificRestrictions)
	     do (addf (dependents feature) self))
	#L:trace-cond (trace-values "end condition-concept:" (restrictions self))
	self ))))

(defun pure-set-definition-p (concept)
  ;; Helping predicate for "condition-concept";
  ;; Return t if all components of the definition of "concept"
  ;;    define set concepts;
  (and
   (neq (defined-as concept) :disjunction) ; TAR 6/17/96
   (null (restrictions concept))
   (or (defined-set-feature concept)
       (and (conjuncts concept)
	    (loop for c in (conjuncts concept)
		  always (eq (defined-as c) :set))))
   (null (comparisons concept))
   (null (computed-features concept))) )

(defun condition-disjuncts (self)
  ;; Assumes that "(defined-as self)" is :disjunction.
  ;; Replace "(disjuncts self)" by only the most general of them;
  ;; Next, set "(super-concepts self)" to the most-specific
  ;;    generalization of disjuncts that we can find in the network
  ;;    (this represents a "pre-classify" step)
  (declare (special *definitionHasChanged*))
  (let* ((newDisjuncts (disjuncts self))
	 (oldLength (length newDisjuncts)))
    #L:trace-cond (trace-values "condition-disjuncts:" (disjuncts self) (conjuncts self))
    ;; Eliminate incoherent disjuncts
    ;; TO DO: try to complete disjuncts, in order to detect incoherence
    (setq newDisjuncts
	  (loop for disjunct in newDisjuncts
	       unless (incoherent-p disjunct)
	       collect disjunct))
    (when (null newDisjuncts)
      ;; All disjuncts are incoherent:
      ;; Make (the most general) one of them a single conjunct,
      ;; so that condition-conjuncts will merge "self" with it
      (setf (conjuncts self) (list (first (most-general-concepts (disjuncts self)))))
      (setf (defined-as self) nil)
      (setf (disjuncts self) nil)
      (return-from condition-disjuncts))
    (setq newDisjuncts
	  (most-general-concepts (flatten-disjuncts newDisjuncts)))
    ;; Eliminate any disjunct that contains a disjunction subsuming some subset of newDisjuncts
    (setq newDisjuncts
	  (eliminate-subsumed-disjuncts newDisjuncts))
    (integrity-check newDisjuncts)
    (if (cdr newDisjuncts)
	(progn
	  (setf (disjuncts self) newDisjuncts)
	  (setf (conjuncts self)
		  (list-of (least-common-generalization newDisjuncts))))
	(progn  ;; Only one disjunct remains, make it a conjunct:
	  (setf (defined-as self) nil)
	  (setf (disjuncts self) nil)
	  (setf (conjuncts self) newDisjuncts)))
    #L:trace-cond (trace-values "condition-disjuncts:" (disjuncts self) (conjuncts self))
    ;; CONSIDER OMITTING THIS:
    (when (not (= (length newDisjuncts) oldLength))	; this is a heuristic detection
      (setq *definitionHasChanged* t))
    ;; add dependency links for more general disjuncts:
    (loop for subc in newDisjuncts
	 do (add-link depend-ons self subc))) )

(defun flatten-disjuncts (disjuncts)
  (let (newDisjuncts)
    (loop for concept in disjuncts
	 do (case (defined-as concept)
	      (:disjunction
	       (setq newDisjuncts
		     (bag-append (flatten-disjuncts (disjuncts concept))
			     newDisjuncts)))
	      (otherwise
	       (pushnew concept newDisjuncts))))
    newDisjuncts))

(defun eliminate-subsumed-disjuncts (disjuncts)
  ;; Eliminate any disjunct that inherits a disjunction that is
  ;; subsumed by some subset of "disjuncts"
  (loop for d in disjuncts
       unless (let ((inheritedDisjunctions
		      (loop for dc in (disjunctive-features d)
			   when (eq (defined-as dc) :disjunction)
			   collect dc)))
		(when inheritedDisjunctions
		  (loop for inheritedDisjunction in inheritedDisjunctions
		       thereis (loop for inheritedDisjunct in (disjuncts inheritedDisjunction)
				    ;; NOTE: every inheritedDisjunct must specialize one of "disjuncts"
				    always (loop for dd in disjuncts
						thereis (subconcept-p inheritedDisjunct dd))))))
       collect d) )


 ;;
;;;; Procedures for eliminating disjuncts
 ;;

(defmethod cancel-disjuncts ((self UNARY-ENTITY) listOfConjuncts)
  ;; Return a subset of the disjuncts belonging to "self" that do not
  ;;    conflict with members of "listOfConjuncts";
  (let ((restrictions (restrictions self))
	(features nil)
	disjunctions otherIndefinites
	*incompleteCancellation*)
    (declare (special *incompleteCancellation*))
    (cond ((null restrictions) nil)
	  ((consp (first restrictions)) ; See if we have source features!
	   (loop for ftr in (restrictions self)
	       do (push (requote-symbolic-set-constants ftr) features)))
	  (t
	   (loop for ftr in (generate-list-of-restrictions (restrictions self))
	       do (push (requote-symbolic-set-constants ftr) features))))
    (loop for cmp in (comparisons self)
	do (push (cdr cmp) features))
    (loop for d in (disjunctive-features self)
	 do
	 (if (eq (defined-as d) :disjunction)
	     (push d disjunctions)
	     (push d otherIndefinites)))
    (multiple-value-bind (newConjuncts newDisjunctions)
	(cancel-disjuncts-unless-depth-exceeded disjunctions listOfConjuncts features
						(member :temporary (system-attributes self)))
      (setf (disjunctive-features self)
	    (nconc newDisjunctions otherIndefinites))
      #L:trace-cond (trace-values "cancel-disjuncts" self listOfConjuncts
				  newConjuncts newDisjunctions *incompleteCancellation*)
      (when *incompleteCancellation*
	(pushnew self *list-of-reclassify-concepts*))
      newConjuncts)) )

(defmethod cancel-disjuncts ((self TBOX-CONCEPT) listOfConjuncts)
  ;; Return a subset of the disjuncts belonging to "self" that do not
  ;;    conflict with members of "listOfConjuncts";
  ;; For relations, we just punt by returning "listOfConjuncts";
  listOfConjuncts )

(defun cancel-disjuncts-unless-depth-exceeded (initialDisjunctions listOfConjuncts features temporaryP)
  ;; Increment the special variable *cancelDisjunctsDepth*, if it is bound,
  ;; otherwise bind it to the initial value: 1
  ;; Invoke "help-cancel-disjuncts", unless *cancelDisjunctsDepth* exceeds *cancel-disjuncts-max-depth*
  (declare (special *cancelDisjunctsDepth*))
  (if (boundp '*cancelDisjunctsDepth*)
      (progn
	(incf *cancelDisjunctsDepth*)
	(if (> *cancelDisjunctsDepth* *cancel-disjuncts-max-depth*)
	    (progn
	      #L:trace-cond (trace-values "cancel-disjuncts-depth-exceeded-p" *number-of-cancel-disjuncts-cutoff*)
	      (incf *number-of-cancel-disjuncts-cutoff*)
	      (return-from cancel-disjuncts-unless-depth-exceeded
		(values listOfConjuncts initialDisjunctions)))
	    (help-cancel-disjuncts initialDisjunctions listOfConjuncts features temporaryP)))
      (let ((*cancelDisjunctsDepth* 1))
	(declare (special *cancelDisjunctsDepth*))
	(help-cancel-disjuncts initialDisjunctions listOfConjuncts features temporaryP))) )

(defun help-cancel-disjuncts (initialDisjunctions listOfConjuncts features temporaryP)
  ;; Helping function for "cancel-disjuncts-unless-depth-exceeded";
  ;; TO DO: consider whether embedded disjunctions should be checked;
  ;;        i.e. disjunctions on (disjunctive-features conjunct) for some conjunct
  (declare (special *conceptBeingConditioned*))
  (if initialDisjunctions
      (let (definiteConjuncts indefiniteConjuncts newFeatures
	     definiteConcept temporaryConcepts)
	(multiple-value-setq (definiteConjuncts indefiniteConjuncts newFeatures)
	  (factor-conjuncts listOfConjuncts initialDisjunctions))
	;; Moved the following forward.  TAR 12/17/98
	(when newFeatures		; RMM 6/14/93
          ;; turn feature objects into source code (is this slow or what!):
	  (loop for restr in (generate-list-of-restrictions newFeatures)
	      do (push (requote-symbolic-set-constants restr) features)))
	;; if no indefiniteConjuncts are returned by factor-conjuncts,
	;;    then definiteConcept must be temporary in order not to create
	;;    a cycle of concepts identical to the concept being conditioned;
	(setq temporaryConcepts (or temporaryP (null indefiniteConjuncts)) )
	;; initialDisjunctions is now used instead of the indefiniteConjuncts
	;;    returned by factor-conjuncts
	(setq indefiniteConjuncts initialDisjunctions)
	#L:trace-cond (trace-values "help-cancel-disjuncts" initialDisjunctions
			     definiteConjuncts indefiniteConjuncts features)
	
	(setq definiteConcept
	  (if (or features (rest definiteConjuncts))
	      (touch-conjunction-concept definiteConjuncts
					     :source-terms (if temporaryConcepts
							       (cons :primitive features)
							       features)
					     :temporary-p temporaryConcepts)
	    (first definiteConjuncts)))
	(when temporaryConcepts
	  (setq temporaryConcepts (list definiteConcept)))
	(if (and definiteConcept
		 (not (incoherent-p definiteConcept)))
	    (let (definiteResults indefiniteResults disjunction compatibleDisjuncts)
	      ;; Check repeatedly until no more disjuncts can be cancelled
	      (loop
		(when (null indefiniteConjuncts)
		  (return))
		(setq disjunction (pop indefiniteConjuncts))
		(setq compatibleDisjuncts (check-disjunction disjunction definiteConcept))
		(cond
		  ((rest compatibleDisjuncts) ;; result is still a disjunction
		   (when (< (length compatibleDisjuncts)
			    (length (disjuncts disjunction)))
		     ;; make a new disjunction
		     (setq disjunction
			   (define-concept
			     :type (concept-or-relation (car compatibleDisjuncts))
			     :is `(:or ,@compatibleDisjuncts)
			     :characteristics '(:system-defined)
			     :system-characteristics '(:definition-only)
			     :classify-immediately 'yes)))
		   (push disjunction indefiniteResults))
		  (compatibleDisjuncts ;; only one disjunct remains
   #L:trace-cond (trace-values disjunction compatibleDisjuncts)
		   (let ((newDefiniteConjuncts
			   (most-specific-conjuncts (most-specific-concepts
						      (cons definiteConcept compatibleDisjuncts)))))
		     (when (or (cdr newDefiniteConjuncts)
			       (neq (car newDefiniteConjuncts) definiteConcept))
		       ;; Incorporating this disjunct added some information to "definiteConcept"
		       (when indefiniteResults
			 (setq indefiniteConjuncts
			       (bag-append indefiniteConjuncts indefiniteResults))
			 (setq indefiniteResults nil))
		       (when (null indefiniteConjuncts)
			 ;; no more work to be done
			 (setq definiteResults compatibleDisjuncts)
			 (return))
		       ;; unify the only compatible disjunct with definiteConcept:
		       ;; TO DO: factor out any disjunctions inherited by the compatible disjunct;
		       (if (cdr newDefiniteConjuncts)
			   (progn
			     (setq definiteConcept
				   (touch-conjunction-concept
				     newDefiniteConjuncts
				     :source-terms (when temporaryConcepts '(:primitive))
				     :temporary-p temporaryConcepts))
			     (when temporaryConcepts
			       (push definiteConcept temporaryConcepts)))
			   (setq definiteConcept (car newDefiniteConjuncts))))))
		  (t ;; no disjuncts are compatible: result is incoherent
		   ;; TO DO: eliminate the incoherent disjunct
		   (mark-as-incoherent *conceptBeingConditioned*)
		   (setq indefiniteResults
			 `(,disjunction ,@indefiniteResults ,@indefiniteConjuncts))
		   (return))))
	      ;; store in "definiteConjuncts" the resulting set of conjuncts, and clean-up
	      (if (member :temporary (system-attributes definiteConcept))
		  (let ((oldConjuncts (super-concepts definiteConcept))
			newConjuncts conjunct)
		    ;; gather nontemporary superconcepts of definite-concept;
		    (loop
		      (when (null oldConjuncts)
			(return nil))
		      (setq conjunct (pop oldConjuncts))
		      (if (member :temporary (system-attributes conjunct))
			  (setq oldConjuncts
				(bag-append oldConjuncts (super-concepts conjunct)))
			  (pushnew conjunct newConjuncts)))
		    (setq definiteConjuncts
			  (bag-append newConjuncts indefiniteResults))
		    ;; BUG: the following is often wrong:
		    ;; IS IT EVER NECESSARY TO ADD ANY INDEFINITE-CONCEPTS IN "newConjuncts"
		    ;;    TO "indefiniteResults"?
;		    (loop for c in newConjuncts
;			 do
;			 (loop for indef in (disjunctive-features c)
;			      unless (member indef initialDisjunctions)
;			      do (push indef indefiniteResults)))
		    (loop for c in temporaryConcepts
			 when (member :temporary (system-attributes c))
			 do (eliminate-temporary-concept c)))
		  (setq definiteConjuncts (cons definiteConcept indefiniteResults)))
	      ;; add any definiteResults that were not included in definiteConcept
	      (when definiteResults
		(setq definiteConjuncts
		      (nconc definiteConjuncts definiteResults)))
	      (values (most-specific-concepts definiteConjuncts)
		      (most-specific-concepts indefiniteResults)))
	    ;; There was an error creating "definiteConcept", or "definiteConcept" is incoherent
	    ;; just return the initial values
	    (values listOfConjuncts initialDisjunctions)))
      ;; There are no disjunctions to be checked
      listOfConjuncts) )

(defun factor-conjuncts (listOfConjuncts disjunctions)
  (let (definiteConjuncts indefiniteConjuncts features)
    (loop for conjunct in listOfConjuncts do
	  (case (defined-as conjunct)
	    (:disjunction
	     (when (member conjunct disjunctions)
	       (push conjunct indefiniteConjuncts)))
	    (otherwise
	     (if (primitive-p conjunct)
		 (if (disjunctive-features conjunct)
		     ;; The primitive concept includes a disjunction that
		     ;; cannot be factored out;
		     (return-from factor-conjuncts
		       (values listOfConjuncts nil nil))
		   ;; The primitive concept is definite WRT to disjunctions
		   (push conjunct definiteConjuncts))
               (if (loop for c in (disjunctive-features conjunct)
		       thereis (eq (defined-as c) :disjunction))
		   (multiple-value-bind (newDef newIndef newFeatures)
		       (factor-conjuncts (super-concepts conjunct) disjunctions)
		     (when (null newIndef)
		       ;; some disjunction could not be factored out
		       (return-from factor-conjuncts
			 (values listOfConjuncts nil nil)))
		     (setq definiteConjuncts
		       (stable-union definiteConjuncts newDef)) ; RMM 9/7/93
		     (setq indefiniteConjuncts
		       (stable-union indefiniteConjuncts newIndef)) ; RMM 9/7/93
		     (setq features (stable-union features newFeatures)) ; RMM 9/7/93
		     (unless (pure-conjunction-p conjunct)
		       ;; TO DO: determine whether the "pure-conjunction-p" test
		       ;;        improves performance
		       (setq features
			 (sparse-append (comparisons conjunct)
					(restrictions conjunct)
					features))))
                 (push conjunct definiteConjuncts))))))
    (setq definiteConjuncts
      (most-specific-conjuncts (most-specific-concepts definiteConjuncts)))
    #L:trace-cond (trace-values "factor-conjuncts" listOfConjuncts
				definiteConjuncts indefiniteConjuncts features)
    (values definiteConjuncts indefiniteConjuncts features)) )

(defun check-disjunction (disjunction definiteConcept)
  ;; Return a list of disjuncts in disjunction that are
  ;;    compatible with definiteConcept;
  (declare (special *incompleteCancellation*))
  (incf *number-of-disjunctions-checked*)
  (let (goodDisjuncts)
    (loop for disjunct in (disjuncts disjunction)
	 do
	 (cond
	   ((subconcept-p definiteConcept disjunct)
	    (incf *number-of-disjuncts-specialized*)
	    (return-from check-disjunction (list disjunct)))
	   ((not (disjoint-concepts-p disjunct definiteConcept))
	    (when (not (member disjunct (non-disjoint-concepts-cache definiteConcept)))
	      ;; disjointness test was incomplete (if result was not cached)
	      (setq *incompleteCancellation* disjunct)
	      #L:trace-cond (trace-values *incompleteCancellation*))
	    (push disjunct goodDisjuncts))))
    (unless (cdr goodDisjuncts)  ;; incompleteness only matters if the disjunction remains
      (incf *number-of-disjunctions-eliminated*)
      (setq *incompleteCancellation* nil))
    #L:trace-cond (trace-values "check-disjunction" disjunction definiteConcept
				goodDisjuncts *incompleteCancellation*)
    goodDisjuncts) )


(defun condition-conjuncts (self)
  ;; Replace "(conjuncts self)" by only the most specific
  ;;    of them;
  ;; Next, set "(super-concepts self)" to the most-specific
  ;;    conjuncts that we can find in the network (this represents
  ;;    a "pre-classify" step)
  ;; This also conditions disjunctive-features of "self",
  ;;    which may result in replacing some conjuncts by more specific concepts;
  ;; Also, detect presence of a purely conjunctive concept (to be used by
  ;;    "most-specific-conjuncts")
  ;; TO DO: CONSIDER REMOVING THE REMARKED-ABOUT CODE;
  (declare (special *definitionHasChanged*))
  (let* ((newConjuncts (conjuncts self))
	 (oldLength (length newConjuncts))
	 invokedCancellationP)
    (setq newConjuncts
	  (most-specific-concepts newConjuncts))
    (setf (conjuncts self) newConjuncts)
    ;; CONSIDER OMITTING THIS:
    (when (not (= (length newConjuncts) oldLength))	; this is a heuristic detection
      (setq *definitionHasChanged* t))
    (setq newConjuncts (most-specific-conjuncts newConjuncts))
    ;; inherit disjunctive-features
    (setf (disjunctive-features self)
          (compute-disjunctive-features self newConjuncts))
    (when (and (cdr newConjuncts)
	       (disjunctive-features self)
	       (not (defined-as self))
	       ; (not (member :temporary (system-attributes self)))
	       )
      ;; cancel-disjuncts may not be necessary,
      ;; and is not reliable when self is a disjunction
      ;; cancel-disjuncts may modify (disjunctive-features self)
      (setq newConjuncts (cancel-disjuncts self newConjuncts))
      (setq invokedCancellationP t))
    #L:trace-cond (trace-values "condition-conjuncts" self newConjuncts)
    (setf (super-concepts self) newConjuncts)
    ;; add dependency links for more specific conjuncts:
    (loop for super in newConjuncts
	 do (add-link depend-ons self super))
    ;; take this opportunity to inherit negated concepts:
    (inherit-negated-concepts self)
    ;; follow merge pointers for any previous pure-conjunction-p values:
    (when (pure-conjunction-p self)
      (follow-pure-conjunction-pointers self))
    (when (concept-is-a-pure-conjunction self)
      (when (and (null (cdr newConjuncts))
		 (not (member :being-reclassified-copy (system-attributes self))))
	;; self should merge with single conjunct,
	;; bypassing the remainder of conditioning and classification
	(when invokedCancellationP
	  ;; tricky: "most-specific-conjuncts" failed to find a unique conjunction, but
	  ;;    "cancel-disjuncts" DID find a unique conjunction, so we need to update
	  ;;    the "pure-conjunction-p" index before merging:
	  (pushnew (conjuncts self) (pure-conjunction-p self) :test #'set-equal-p))
	(merge-with-classified-concept self (car newConjuncts))
	(post-classify-concept (car newConjuncts) t)
	(throw 'condition-concept-catcher :already-classified))
      (pushnew (conjuncts self) (pure-conjunction-p self) :test #'set-equal-p)) ))


(defmethod concept-is-a-pure-conjunction ((self UNARY-ENTITY))
  ;; Helping function for "condition-conjuncts";
  ;; Return t iff "self" is defined solely as the conjunctions of
  ;;    some other concepts;
  ;; Note: This only works before "self" has been conditioned;
  ;; Note: *hasLocallyDefinedSetFeatureP* bound by UNARY-ENTITY.condition-concept; 
  (declare (special *hasLocallyDefinedSetFeatureP*))
  (not (or (primitive-p self)
	   (restrictions self)
	   (comparisons self)
           (negated-concepts self)
	   *hasLocallyDefinedSetFeatureP*
	   (computed-features self)
	   (and (defined-as self)
		(neq (defined-as self) :set)))) )

(defmethod concept-is-a-pure-conjunction ((self UNARY-RELATION))
  (and (call-next-method)
       (null (defined-domain self))))


(defmethod concept-is-a-pure-conjunction ((self REIFIED-RELATION))
  nil)

(defmethod compute-disjunctive-features ((self UNARY-ENTITY) conjuncts)
  ;; Inherit the disjunctive-features of conjuncts;
  ;; Note: This functions assumes that the corresponding slot
  ;;    values for all parent concepts have already been computed;
  ;; NOTE THAT DISJUNCTIONS DO NOT GET INHERITED
  ;;    INTO THE disjunctive-features OF THEIR DISJUNCTS
  ;;    (the disjuncts are classified before the disjunction);
  ;; Note: This function also works for relations that inherit
  ;;    compositions, except that the top-level filling in of a
  ;;    "disjunctive-features" slot occurs in "condition-composite-relation";
  ;;    NO, IT DOESN'T WORK FOR COMPOSITIONS -- RMM;
  (let ((selfType (defined-as self)))
    (if (eq selfType :disjunction)		
	(list self)
	(let (definedConcepts)
	  (loop for c in conjuncts
	       do (loop for dc in (disjunctive-features c)
		       do (pushnew dc definedConcepts)))
	  (most-specific-concepts definedConcepts)))) )

(defmethod compute-disjunctive-features ((self TBOX-RELATION) conjuncts)
  ;; Inherit the disjunctive-features of conjuncts;
  ;; Note: This function also works for relations that inherit
  ;;    compositions, except that the top-level filling in of a
  ;;    "disjunctive-features" slot occurs in "condition-composite-relation";
  (declare (ignore conjuncts))
  ;; DISABLED, BECAUSE CODE BREAKS LATER ON OTHERWISE;
  nil )

(defun inherit-negated-concepts (self)
  ;; Inherit negated concepts from conjuncts of "self" to "self";
  (let ((result (negated-concepts self)))
    (loop for super in (conjuncts self)
          do
          (loop for nc in (negated-concepts super)
                do (pushnew nc result)))
    (when result
      (setq result (most-general-concepts result))) ))

(defun follow-pure-conjunction-pointers (self)
  ;; Fix any concept pointers in "(pure-conjunction-p self)" that
  ;;    have been merged;
  (loop for pc in (pure-conjunction-p self)
       do
       (loop for tail on pc
	    when (member :discarded-by-merge (system-attributes (car tail)))
	    do (setf (car tail) (follow-merge-concept-pointers (car tail))))) )


  ;;
;;;;;; Conditioning of BINARY-RELATIONS
  ;;

;;; During conditioning of binary relations, we perform some very 
;;;    specialized transformations based on the semantics of inverse
;;;    relations, and composite relations, as
;;;    well as domain- and range-constrained relations.  Here
;;;    are some simplifications we perform:
;;;       ((R +)+) => (R +)
;;;       (inv (inv R)) => R
;;;       (rngRes R Thing) => R
;;;       (domRes R Thing) => R
;;;    The classifier takes care of these:
;;;       (rngRes (rngRes R A) A) => (rngRes R A)
;;;       (domRes (domRes R A) A) => (domRes R A)
;;; The competent handling of inverses depends chiefly on our ability
;;;    to generate a canonical form.  The following transformations
;;;    are applied recursively until inverse operators are attached
;;;    only to primitive relations:
;;;       (inv (R +)) => ((inv R) +)
;;;       (inv R . S) => (inv S) . (inv R)
;;;       (inv (and R S)) => (and (inv R) (inv S))
;;;       (inv (rngRes R A)) => (domRes (inv R) A)
;;;       (inv (domRes R A)) => (rngRes (inv R) A)
;;; Conditioning of composite relations relies on the following
;;;    transformations:
;;;       R . (rngRes S A) => (rngRes (R . (rngRes S A)) A)
;;;       (rngRes (R . S) A) => (rngRes (R . (rngRes S A)) A)
;;;       (domRes R A) . A => (domRes ((domRes R A) . S) A)
;;;       (domRes (R . S) A) => (domRes ((domRes R A) . S) A)
;;;       (R1 . (S1 . S2) . R2) => (R1 . S1 . S2 . R2)

;;; Note: "BINARY-RELATION.condition-concept" depends on the
;;;    following invariants:
;;;       (1)  If "self" is primitive, then the "defined-as",
;;;            "defined-domain", and "defined-range" slots are nil
;;;       (2)  If "defined-as" is filled in, then "conjuncts" is nil

(defmethod condition-concept ((self BINARY-RELATION))
  ;; Achieve a canonical form for "self" in which forward inferences
  ;;    which further restricts the definition have been deduced,
  ;;    and for which incoherence has been detected;
  ;; After a canonical form has been achieved, look for the possibility
  ;;    of linking to an inverse relation;
  ;; A dialogue with the user will ensue before the more significant
  ;;    types of modifications are applied;
  (let (*definitionHasChanged*)
    (declare (special *definitionHasChanged*))
    ;; CHECK THAT MY UNDERSTANDING OF THE PARSED FORM IS CORRECT:
    (integrity-check (not (and (defined-as self)
			       (or (defined-range self)
				   (defined-domain self)))))
    (loop
      (when (neq (case (defined-as self) 
		   (:inverse
		    (condition-inverse-relation self))
		   (:composition 
		    (condition-composite-relation self))
		   (otherwise
		    (condition-non-defined-relation self)))
		 'CONTINUE-CONDITIONING)
	(return nil)))				; end loop
    (condition-computed-features self)
    (validate-arity self (arity self))		; may convert to N-ARY here
    (when (and (implied-domains self)
	       (/= (length (list-of (implied-domains self))) (1- (arity self))))
      (conditioning-error "Wrong number of domains specified for relation~%   ~
                           with arity ~I" (arity self)))
    (when (not (primitive-p self))
	;; change source IF definition has changed:
;	(attempt-to-change-source-definition self)
	;; check for illegal definition:
	(when (and (not (defined-as self))
		   (null (conjuncts self))
		   (null (computed-features self)))
	  (conditioning-error
	    "The top-level relation cannot be domain- or range-restricted")))
    self ))

(defun condition-inverse-relation (relation)
  ;; "relation" is defined as the inverse of some other base relation, and
  ;;    "relation" has no definitional domain or range constraints;
  ;; Convert to canonical form (pushing the inverse operator in recursively
  ;;    until it is attached only to primitive concepts);
  ;; Establish an inverse link between "relation" and its inverse;
  ;; If the changes result in a relation which needs further conditioning,
  ;;    return 'CONTINUE-CONDITIONING;
  (declare (special *definitionHasChanged*))
  (let ((inverseRelation (inverse relation)))
    (flet ((exchange-inverse-domain&range ()
	     ;; (inv (rngRes R A)) => (domRes (inv R) A)
	     ;; (inv (domRes R A)) => (rngRes (inv R) A)
	     (let ((definedRange (defined-range inverseRelation))
		   (definedDomain (defined-domain inverseRelation)))
	       (when definedRange
		 (setf (defined-domain relation) definedRange)
		 (add-link depend-ons relation definedRange))
	       (when definedDomain
		 (setf (defined-range relation) definedDomain)
		 (add-link depend-ons relation definedDomain)))))
    (when (primitive-or-computed-p inverseRelation)
      ;; make the classifier happy -- filling conjuncts results in the
      ;;    correct computation of the initial parents of "relation":
      (setf (conjuncts relation)
	    (loop for c in (super-concepts inverseRelation)
		 when (inverse c)
		 collect (inverse c)))
      (exchange-inverse-domain&range)		; RMM 2/14/91
      (return-from condition-inverse-relation nil))
    ;; If the inverse relation is not primitive, "relation" will be
    ;;    converted into a form other than an inverse relation, so we
    ;;    wipe out its inverse definition:
    (setf (defined-as relation) nil)
    (setf (inverse relation) nil)
    (cond
      ((defined-as inverseRelation)
       (case (defined-as inverseRelation)
	 (:inverse				; (inv (inv R)) => R
	  (addf (conjuncts relation)
		(inverse inverseRelation))
	  (setq *definitionHasChanged* t))
	 (:composition				; (inv R . S) => (inv S) . (inv R)
	  (fill-components
	    relation
	    (reverse
	      (loop for baseComponent in (components inverseRelation)
		   collect
		   (touch-inverse-relation baseComponent)))))))
      (t
       ;; "relation" is an inverse of a conjunction relation -- convert it
       ;;     into an "ordinary" relation
       (integrity-check (or (defined-range inverseRelation)
			    (cdr (conjuncts inverseRelation))
			    (defined-domain inverseRelation)))
       ;; (inv (rngRes R A)) => (domRes (inv R) A)
       ;; (inv (domRes R A)) => (rngRes (inv R) A)
       (exchange-inverse-domain&range)
       ;; (inv (and R S)) => (and (inv R) (inv S))
       (setf (conjuncts relation)
	     (loop for baseConjunct in (conjuncts inverseRelation)
		  collect
		  (touch-inverse-relation baseConjunct :dependent relation)))))
    (return-from condition-inverse-relation 'CONTINUE-CONDITIONING) )))

(defun condition-composite-relation (relation)
  ;; "relation" is defined as the composition of other component relations;
  ;; Convert to canonical form;
  ;;    Expand components which are themselves compositions until all components
  ;;       are not compositions;
  ;;    Copy domain and range restrictions on first and last components to "relation"
  ;;    Copy domain and range restrictions on "relation" to first and last components;
  ;; TO DO: Move domain restriction on component to be range restriction on predecessor
  ;;    of component;
  (flet ((conjoin-terms
	   (term1 term2)
	   (cond
	     ((null term1) term2)
	     ((null term2) term1)
	     ((eq term1 term2) term1)
	     (t
	      (touch-conjunction-concept (list term1 term2))))))
    (let ((components (components relation))
	  domain range listOfLast)
      (when (loop for comp in components
		 thereis (eq (defined-as comp) :composition))
	(setq components
	      (loop for comp in (components relation)
		   append
		   (if (eq (defined-as comp) :composition)
		       (components comp) 
		       (list comp)))))
      (setq domain (conjoin-terms (defined-domain relation)
				  (defined-domain (first components))))
      (setq range (conjoin-terms (defined-range relation)
				 (defined-range (car (last components)))))
      (when domain
	(setf (defined-domain relation)	  ; (domRes R A) . A => (domRes (R . S) A)
	      domain)
	(when (neq domain (defined-domain (car components)))
	  (setq components  ;; (domRes (R . S) A) => (domRes ((domRes R A) . S) A) 
		(cons (touch-domain-restricted-relation 
			(car components) domain :dependent relation)
		      (cdr components)))))
      (when range
	(setf (defined-range relation)	  ; R . (rngRes S A) => (rngRes (R . S) A)
	      range)
	(setq components (copy-list components))  ; permit destructive modification
	(setq listOfLast (last components))
	(when (neq range (defined-range (car listOfLast)))
	  (setq components (copy-list components))
	  (setf (car listOfLast)  ;; (rngRes (R . S) A) => (rngRes (R . (rngRes S A)) A)
		(touch-range-restricted-relation
		  (car listOfLast) range :dependent relation))
	  (setf (defined-range relation) nil)))
      (setf (components relation) components)
      ;; "relation" is its own defined-as concept:
      (setf (disjunctive-features relation) (list relation))
      ;; don't continue conditioning:
      nil )))

(defun condition-non-defined-relation (relation)
  ;; "relation" is not an inverse or composite relation;
  ;; If "relation" is a conjunction of composite relations,
  ;;    then normalize it to be a composition of conjunctions;
  ;; Condition the conjuncts of "relation";
  ;; Condition the tbox domain and range slots;
  ;; Condition a restricted conjunct, which means, expand its list
  ;;    of conjuncts;
  (let ((conjuncts (conjuncts relation))
        (nonBinaryArity nil))
    (condition-conjuncts relation)
    (loop for c in conjuncts
          when (not (eql (arity c) 2))
          do
          (setq nonBinaryArity (arity c))
          (return nil))
    (if nonBinaryArity
      (if (eql nonBinaryArity 1)
        (coerce-binary-relation-to-unary-relation relation)
	(coerce-binary-relation-to-n-ary-relation relation))
      (progn
        ;; note: "(defined-domain relation)" must contain source
        (when (and (consp (defined-domain relation))
                   (cdr (defined-domain relation))
                   (neq (car (defined-domain relation)) :and))	; RMM 2/14/91
          (conditioning-error
           "Can't assign multiple domains to a binary relation"))
        (condition-defined-domain relation)
        (condition-defined-range relation)
        ))
    nil )) ;; no more conditioning

(defmethod concept-is-a-pure-conjunction ((self BINARY-RELATION))
  ;; Helping function for "condition-conjuncts";
  ;; Return t iff "self" is defined solely as the conjunctions of
  ;;    some other concepts;
  ;; Note: This only works before "self" has been conditioned;
  (not (or (primitive-p self)
	   (defined-range self)
	   (defined-as self)
           (negated-concepts self)
	   (computed-features self)
	   (defined-domain self))) )

(defmethod concept-is-a-pure-conjunction ((self N-ARY-RELATION))
  ;; Helping function for "condition-conjuncts";
  ;; Return t iff "self" is defined solely as the conjunctions of
  ;;    some other concepts;
  ;; Note: This only works before "self" has been conditioned;
  (not (or (primitive-p self) 
	   (negated-concepts self) 
           (computed-features self))) )

(defun primitive-or-computed-p (relation)
  ;; Return t iff "relation" is primitive or its definition
  ;;    contains a locally-defined computed feature;
  (or (primitive-p relation)
      (loop for f in (computed-features relation)
	   thereis
	   (loop for super in (conjuncts relation)
		never (member f (computed-features super))))) )

(defun condition-defined-domain (relation)
  ;; Conjoin all local and inherited defined-domain constraints
  ;;     to produce the defined-domain implied by all of them;
  ;; Also, inherit a defined-domain from the basis of a trans-closure,
  ;;    and inherit the defined-range from an inverse;
  ;; If the result is a new concept, ask the user to name it; 
  ;; If the domain equals THING, eliminate it;
  ;; Test to see if this defined-domain is incoherent;
  ;; Assign the new defined-domain to "(defined-domain relation)"
  (declare (special *definitionHasChanged*))
  (let ((definedDomain (defined-domain relation))
	domainConcepts sourceConcepts conjunctionConcept) 
    (setq domainConcepts
	  (loop for super in (conjuncts relation)
	       when (defined-domain super)
	       collect (defined-domain super)))
    (cond
      ((consp definedDomain)
       (setq sourceConcepts (list definedDomain))
       (setq definedDomain nil))			; avoid triggering *definitionHasChanged*
      ((neq definedDomain *Thing*)
       (pushnew definedDomain domainConcepts)))
    (when (inverse relation)
      (pushnew (defined-range (inverse relation))
	       domainConcepts))
    (delf domainConcepts nil)
    (when (or domainConcepts sourceConcepts)
      (setq conjunctionConcept
	    (touch-conjunction-concept
	      domainConcepts
	      :source-terms sourceConcepts))
      (when (and definedDomain
		 (neq conjunctionConcept definedDomain))
	(setq *definitionHasChanged* t)))
    (setf (defined-domain relation) conjunctionConcept) ))

(defun condition-defined-range (relation)
  ;; Conjoin all local and inherited defined-range constraints
  ;;     to produce the defined-range implied by all of them;
  ;; Also, inherit a defined-range from the basis of a trans-closure,
  ;;    and inherit the defined-domain from an inverse;
  ;; If the result is a new concept, ask the user to name it; 
  ;; If the range equals THING, eliminate it;
  ;; Test to see if this defined-range is incoherent;
  ;; Assign the new defined-range to "(defined-range relation)"
  (declare (special *definitionHasChanged*)) 
  (let ((definedRange (defined-range relation))
	rangeConcepts sourceConcepts conjunctionConcept impliedRange) 
    (setq rangeConcepts
	  (loop for super in (conjuncts relation)
	       when (defined-range super)
	       collect (defined-range super)))
    (cond
      ((consp definedRange)
       (setq sourceConcepts (list definedRange))
       (setq definedRange nil))			; avoid triggering *definitionHasChanged*
      ((neq definedRange *Thing*)
       (pushnew definedRange rangeConcepts)))
    (when (inverse relation)
      (pushnew (defined-domain (inverse relation))
	       rangeConcepts))
    (delf rangeConcepts nil)
    (when sourceConcepts				; probably a set concept
      ;; REPLACE THIS BY THE COMMENTED-OUT CODE BELOW WHEN FEATURES ARE ALLOWED
      ;;    TO BE RANGES OF RELATIONS:
      (loop for r in (cons relation (super-concepts relation))
	   when (and (setq impliedRange (implied-range r))
		     (typep impliedRange 'UNARY-ENTITY) 
		     (eq (defined-as impliedRange ) :set))
	   do (push impliedRange rangeConcepts)))
    (when (or rangeConcepts sourceConcepts)
      (setq conjunctionConcept
	    (touch-conjunction-concept 
	      rangeConcepts :source-terms  sourceConcepts))
      (when (and definedRange
		 (neq conjunctionConcept definedRange))
	(setq *definitionHasChanged* t)))
    (setf (defined-range relation) conjunctionConcept) ))

(defun coerce-binary-relation-to-unary-relation (self)
  ;; "self" has been discovered (late in the game) to be a unary relation;
  ;; Make it so!
  (when (and (typep self 'BINARY-RELATION)
             (defined-range self))
    (complain "~%Can't coerce ~S to a property (unary relation) because it
has a range attached" self)
    (return-from coerce-binary-relation-to-unary-relation nil))
  (unintern-object self :relations (context self))
  (intern-object (name self) self :concepts (context self))
  (change-class self 'UNARY-RELATION) )

(defun coerce-binary-relation-to-n-ary-relation (self)
  ;; "relation" is defined as the inverse, composition, or conjunction
  ;;    of other computed relation(s), and must be coerced into
  ;;    a computed relation;
  ;; Change its class, and compute its domains and range;
  (when (typep self 'BINARY-RELATION)
    (when (and (defined-domain self)
	       (null (implied-domain self)))
      (setf (implied-domain self)
	    (defined-domain self)))
    (when (and (defined-range self)
	       (null (implied-range self)))
      (setf (implied-range self)
	    (defined-range self)))
    (change-class self 'N-ARY-RELATION)) )


  ;;
;;;;;; Specialized Concept-defining Functions
  ;;

;;; "touch-undefined-concept", and "touch-conjunction-concept"
;;;    are specialized routines called while parsing or conditioning
;;;    which create new concepts or relations for the system

(defun touch-undefined-concept
       (name conceptOrRelation &key specialize-this-concept)
  ;; Look for a concept with name "name";  If none is found,
  ;;    create a new concept with name "name" of type "conceptOrRelation", and
  ;;    mark as :system-defined and :undefined
  ;; Specify that the new concept specializes "specialize-this-concept"
  ;;    (which will normally be nil);
  (or (find-concept-or-relation name conceptOrRelation *context*)
      (define-concept
	:type conceptOrRelation
	:name name
	:is (when specialize-this-concept
	      `(:and ,specialize-this-concept :primitive))
	:characteristics (list :system-defined :undefined)
	:system-characteristics (list :definition-only)
	:classify-immediately 'no)) )

(defun touch-conjunction-concept (conjuncts &key source-terms temporary-p 
						 requote-symbols-p)
  ;; Find or create a concept which represents the conjunction
  ;;    of the concepts "conjuncts"; Return the result;
  ;; If :log-system-generated-concepts is set, add an entry to
  ;;    *system-generated-concept-log* indicating which concept
  ;;    definition was responsible for this new concept;
  ;; Called by "condition-value-restrictions", "condition-xxx-domain",
  ;;    "condition-xxx-range" and "condition-implication";
  ;; If a new concept is created the user may be asked to name it,
  ;;    and a test for incoherence is made;
  ;; Note: "touch-conjunction-concept" is destructive;
  ;; CAUTION: This function can't handle recursive classification, and hence
  ;;    should not be passed complex conjuncts;
  (declare (special *conceptBeingConditioned*))
  (when (not (or conjuncts source-terms))
    (return-from touch-conjunction-concept *Thing*))
  (when source-terms			; RMM 3/30/92
    ;; try to move concepts in the source into the list of conjuncts
    (let ((sourceTerms source-terms))
      (setq source-terms nil)
      (loop for term in sourceTerms
	  do
	    (if (and (consp term)
		     (eq (first term) :and))
		(loop for c in (rest term)
		    do
		      (if (concept-p c)
			  (pushnew c conjuncts)
			(push c source-terms)))
	      (push term source-terms)))))
  (setq conjuncts
    (most-specific-conjuncts (most-specific-concepts conjuncts)))
  ;; At this point "conjuncts" contains the most specific
  ;;    concepts existing in the classified taxonomy
  (if (or (cdr conjuncts) source-terms)
      (let (conjunctionConcept)
	;; put quotes back on symbols inside of :one-of and :filled-by:
	;; No. TAR 7/16/97
	;; Yes, in some circumstances.  TAR 2/10/98
	(when requote-symbols-p
	  (setq source-terms 
	    (loop for term in source-terms
		collect (requote-symbolic-set-constants term))))
	(setq conjunctionConcept
	  (define-concept
	      :type (if source-terms
			:concept
		      (concept-or-relation (car conjuncts)))
	    :is `(:and ,@conjuncts ,@source-terms)
	    :characteristics '(:system-defined)
	    :system-characteristics (if temporary-p
					'(:definition-only :temporary)
				      '(:definition-only))
	    :classify-immediately 'yes))
	(when (not temporary-p)
	  (acquire-concept-name-immediately conjunctionConcept))
	(when (and (boundp '*insideMatch/FireLoopP*)
		   (not (boundp '*completionMode*)))
	  ;; if we are in the middle of a match, complete and seal immediately:
	  (complete-all-concepts))
	conjunctionConcept)
    ;; else just return single conjunct:
    (car conjuncts)) )

(defun touch-inverse-relation (relation &key dependent dont-set-inverse-link)
  ;; Look for an inverse relation of "relation";
  ;; If none is found, create one;
  ;; Note: "dont-set-inverse-link" is checked by "install-inverse-of-relation";
  (let ((inverseRelation 
	  (or (inverse relation) 
	      (define-relation
		:is `(:inverse ,relation)
		:characteristics (list :system-defined) 
		:system-characteristics
		(if dont-set-inverse-link
		    '(:dont-set-inverse-link :definition-only)
		    '(:definition-only))
		:classify-immediately 'yes))))
    (when dependent
	(add-link depend-ons dependent inverseRelation))
    inverseRelation ))

(defun touch-domain-restricted-relation
       (relation domain &key dependent dont-set-inverse-link)
  ;; Look for a relation equivalent to "relation" restricted to have domain "domain";
  ;; If none is found, create one;
  (let ((newRelation
	  (define-relation
	    :is `(:and ,relation (:domain ,domain))
	    :characteristics (list :system-defined) 
	    :system-characteristics (when dont-set-inverse-link '(:dont-set-inverse-link))
	    :classify-immediately 'yes)))
    (when dependent
	(add-link depend-ons dependent newRelation)) 
    newRelation ))

(defun touch-range-restricted-relation (relation range &key dependent dont-set-inverse-link)
  ;; Look for a relation equivalent to "relation" restricted to have range "range";
  ;; If none is found, create one;
  (let ((newRelation
	  (define-relation
	    :is `(:and ,relation (:range ,range))
	    :characteristics (list :system-defined) 
	    :system-characteristics 
	    (cond
	      (dont-set-inverse-link
	       '(:dont-set-inverse-link :definition-only))
	      (t '(:definition-only)))
	    :classify-immediately 'yes)))
    (when dependent
	(add-link depend-ons dependent newRelation)) 
    newRelation ))

(defun touch-composite-relation (components &key dependent dont-set-inverse-link)
  ;; Look for a relation which is the composition of the relations "components";
  ;; If none is found, create one;
  (let ((newRelation
	  (if (null (cdr components))
	      (car components)
	      (define-relation
		:is `(:composition ,@components)
		:characteristics (list :system-defined) 
		:system-characteristics
		(if dont-set-inverse-link
		    '(:dont-set-inverse-link :definition-only)
		    '(:definition-only))
		:classify-immediately 'yes))))
    (when dependent
      (add-link depend-ons dependent newRelation))
    newRelation ))

;(defun touch-classified-concept (concept)
;  ;; "concept" contains a parsed but unclassified concept definition;
;  ;; Compute its msg:
;  ;;    If a merge occurred, return the already classified equivalent concept;
;  ;;    Otherwise, install "concept" in the classification hierarchy, i.e.,
;  ;;       finish classifying it, and return it;
;  (multiple-value-bind (msg mergeOccurred)
;      (compute-msg concept :dont-copy-concept t)
;    (cond
;      (mergeOccurred (car msg))
;      (t
;       (install-concept concept msg :dont-pre-classify t)
;       (post-uncompleted-concept concept)
;       (acquire-concept-name-immediately concept)
;       concept)) ))


  ;;
;;;;;; Machine-User Mediation Functions
  ;;

;;; The functions below mediate between the conditioning routines
;;;    and the user whenever Loom wishes to ask for user input

;;; "attempt-to-change-source-definition " is called by conditioning routines
;;;    to ask permission from the user to change a concept's definition

;; NOT USED ANY MORE:              RMM 11/8/91
;(defun attempt-to-change-source-definition (self)
;  ;; If no permission is needed, or if the user says its OK,
;  ;;    generate the current definition of "self" and store
;  ;;    it in "(source-definitions self)"
;  (declare (special *definitionHasChanged*))
;  (when (and *definitionHasChanged*
;	   (not (member :temporary (system-attributes self)))
;	   (or (member :auto-redefine *loom-features*)
;	       (member :system-defined (attributes self))
;	       (ask-if-can-redefine-concept self)))
;      (change-source-definition self)) )

;(defun ask-if-can-redefine-concept (self)
;  ;; Print out the old and new definitions of "self" and
;  ;;    see if user will go along with the change
;  (when (and (member :ask-about-redefinitions *loom-dialogue-features*)
;	     (not (typep self 'REIFIED-RELATION)))
;    (format t "Conditioning of concept ~A resulted in the following change --~%~
;             Old definition of ~A:~%~% ~S~%~%~
;             New definition of ~A:~%~% ~S~%~%~
;             Do you wish to make the change? (Y/N)  "
;	    (name self)
;	    (name self) (generate-source-definition self)
;	    (name self) (generate-concept-definition self))
;    (y-or-n-p)) )


;;; concept-naming functions:

(defun acquire-concept-name-immediately (newConcept)
  ;; Remove "newConcept" from the list of uninterned concepts
  ;; Ask the user whether or not the wish to name "newConcept";
  ;; If not, provide a system-generated name;
  (unless (member :ask-for-names-immediately *loom-dialogue-features*) 
    (return-from acquire-concept-name-immediately nil))
  (delf *list-of-uninterned-concepts* newConcept)
  (when (and (member :dont-name-system-defined-concepts *loom-dialogue-features*)
	     (typep newConcept 'UNARY-ENTITY))
    (intern-concept newConcept nil nil)
    (return-from acquire-concept-name-immediately nil))
  (format *query-io* "The Loom system has just defined a concept with the following~%   ~
               definition:~%   ~S~%Do you wish to give it a name? (Y/N)  "
	  (generate-concept-definition newConcept))
  (generate-name&intern-concept
    newConcept
    (and (y-or-n-p)
	 (ask-user-for-concept-name))) )

(defun ask-user-for-concept-name ()
  ;; Ask the user for a concept name;
  (let (newName)
    (format *query-io* "New name:  ")
    (loop 
;      #-Lucid (setq newName (read *query-io*))   ; tar 7/1/92
;      #+Lucid (setq newName (read *query-io*))
      (setq newName (read *query-io*))
      (when (or (symbolp newName)
		(null newName))
	(return-from ask-user-for-concept-name newName))
      (format *query-io* "The name must be a symbol or nil~%~
                          Please type in a new name:  ")) ))

(defun generate-name&intern-concept
       (concept name &key dont-name-p dont-update-list-of-uninterned-concepts-p)
  ;; Called principally by "name&intern-unnamed-concept";
  ;; Attach a name to "concept", using either "name" or a system-generated
  ;;    name;
  ;; Intern "concept";
  ;; Return the concept's (possibly system generated) name;
  ;; Note: Calls itself recursively when trying to attach a name
  ;;    to an unnamed conjunction concept;
  (let ((context (or (context concept)
		     (determine-context-of-system-defined-concept
		      concept)
		     *context*)))
    ;; attach context to "concept" so that it can be found by
    ;;    "generate-unique-concept-name":
    (setf (context concept) context)
    (when (and (null name)
	       (not dont-name-p))
      (setq name (generate-system-defined-name concept))
      (addf (system-attributes concept) :system-generated-name))
    (intern-concept
      concept name context
      :dont-update-list-of-uninterned-concepts-p
      dont-update-list-of-uninterned-concepts-p)
    name ))

(defmethod generate-system-defined-name ((self UNARY-CONCEPT))
  ;; Create a name for the concept "self";
  (case (defined-as self)
    (:disjunction
     (concatenate-concept-names (disjuncts self) "-OR-"))    
    (otherwise					; nil defined-as slot
     (cond ((cdr (conjuncts self))
	    (concatenate-concept-names (conjuncts self) "&"))
	   ((system-defined-name-p self)
	    (generate-unique-concept-name 
	     (strip-suffix (name (car (conjuncts self)))) self))
	   (t
	    (generate-unique-concept-name (name (car (conjuncts self))) self))))) )

(defmethod generate-system-defined-name ((self BINARY-RELATION))
  ;; Create a name for the relation "self";
  (case (defined-as self)
    (:inverse
     (symbol-append-using-concept self "INVERSE-OF-" (name (inverse self))))
    (:composition
     (concatenate-concept-names (components self) "."))
    (otherwise					; nil defined-as slot
     (cond
       ((cdr (conjuncts self))
	(concatenate-concept-names (conjuncts self) "&"))
       ((and (inverse self)
	     (name (inverse self)))
	(symbol-append-using-concept self "INVERSE-OF-" (name (inverse self))))
       ((system-defined-name-p self)
	(generate-unique-concept-name (strip-suffix (name (car (conjuncts self)))) self))
       (t
	(generate-unique-concept-name (name (car (conjuncts self))) self))))) )

(defun concatenate-concept-names (listOfConcepts separatorString)
  ;; Return a symbol which is the concatenation of the names of concepts 
  ;;    in "listOfConcepts" each separated by "separatorString";
  (let* ((listOfNames
	   (loop for c in listOfConcepts
		collect
		(or (name c)
		    (generate-name&intern-concept c nil))))
	 (firstConcept (first listOfConcepts))
	 (baseString (format nil (format nil "~~{~~A~~^~A~~}" separatorString)
			     listOfNames))
	 baseName)
    (if (> (length baseString) 30)
	(generate-unique-concept-name
	 (case (concept-or-relation firstConcept)
	   (:concept "CONCEPT")
	   (:relation "RELATION"))
	 firstConcept)
      (progn
	(setq baseName
	  (symbol-append-using-concept firstConcept baseString))
	(if (case (concept-or-relation firstConcept)
	      (:concept (eval-concept-id baseName))
	      (:relation (eval-relation-id baseName)))
	    (generate-unique-concept-name baseName firstConcept)
	  baseName))) ))

(defun strip-suffix (name)
  (let ((namestring (string-right-trim "_0123456789" (string name))))
    (if (string= namestring "")
	name
      namestring)))

(defun generate-unique-concept-name (prefix concept)
  ;; Generate a name prefixed by "prefix" and suffixed by an integer
  ;;    which is unique in the partition that "concept" belongs to;
  (let ((context (or (context concept) *context*)))
    (loop for uniqueName = (symbol-append-using-concept
			    concept
			    (or prefix "CONCEPT")
			    (format nil "_~v,'0D"
				    *minimum-digits-for-concept-suffix*
				    (incf *concept-name-counter*)))
	  unless (evaluate-identifier
		  uniqueName (concepts-or-relations concept) context)
	    return uniqueName) ))

(defun symbol-append-using-concept (concept &rest strings&symbols)
  ;; Return a symbol which is the concatenation of the atoms in
  ;;    "strings&symbols";
  ;; The appropriate package to intern into is the package referenced
  ;;    by one of "strings&symbols", or if all are strings then the current
  ;;    package;
  (let ((thePackage (loop for s in strings&symbols
			  when (symbolp s)
			  do (return (package-of-symbol s)))))
    (symbol-append
      ((apply #'string-append strings&symbols))
      (or thePackage
          (and (name concept)
               (package-of-symbol (name concept)))
          *package*)) ))


  ;;
;;;;;; Warning Functions
  ;;

(defun warn-of-incoherent-concept (incoherentConcept badMembership)
  ;; Warn the user of an incoherent conjunction concept
  (unless (or (member :temporary (system-attributes incoherentConcept))
	      (member :disjunct (system-attributes incoherentConcept)))
    (let ((message (format nil "Concept ~S is a member of two or more disjoint partition classes,~
                                ~%  i.e., it is incoherent.  Partition: ~S, Disjoint classes: ~S~%"
			   incoherentConcept 
			   (if (symbolp (car badMembership))
			       (car badMembership)
			     (partition-name (car badMembership)))
			   (cdr badMembership))))
      (fadd-value incoherentConcept 'incoherence-reason message)
      (when (user-defined-p incoherentConcept)
	(warn message)))) )

(defun generate-incoherent-restriction-message (incoherentRestriction concept typeOfIncoherence) 
  ;; Generate message about a restriction whose effective lower-bound
  ;;    exceeds its effective upper-bound, or which has an incoherent
  ;;    value-restriction or bad filler.
  (unless (or (boundp '*insideComputeConditionedRestrictionsP*)
	      ;; BUG: ALSO INCLUDE :system-defined?   TAR 9/28/98 ZZZ;
	      (member :temporary (system-attributes concept)))

    (with-output-to-string (s)
      (with-feature-changes (:set '(:long-print-names))
	(format s "The process of conditioning the Concept ~S derived ~%~
             a restriction " (or (name concept) concept)))
      (ecase typeOfIncoherence
	(number (format s "whose lower bounds exceed its upper bounds.~%"))
	(value  (format s "whose value-restriction is incoherent,~% while it has a ~
                       non-zero lower-bound.~%"))
	(filler (format s "containing an illegal role filler.~%"))
	(non-filler (format s "containing a filler that's not a filler.~%")))
      (format s "   Role = ~S; Value Restriction = ~S;~%   Fillers = ~S;~%   ~
               Min = ~S; Max = ~S; Non-Fillers = ~S~%"
		(generate-external-reference (local-relation incoherentRestriction))
		(generate-external-reference (local-value-restrictions incoherentRestriction))
		(local-role-fillers incoherentRestriction)
		(local-lower-bound incoherentRestriction)
		(local-upper-bound incoherentRestriction)
		(local-non-role-fillers incoherentRestriction))) ))


(defun warn-of-incoherent-domain-or-range (incoherentConcept relation domainOrRange)
  ;; Warn the user that the effective domain or range of "relation"
  ;;    is incoherent
  (let ((message (with-output-to-string (s)
		   (format s "The process of conditioning the ~(~A~) ~S derived a ~%"
			   (concept-or-relation relation)
			   (name relation))
		   (ecase domainOrRange
		     ((defined-domain implied-domain) (format s "domain")) 
		     ((defined-range implied-range) (format s "range")))
		   (format s " concept ~S which was incoherent~%" incoherentConcept) )))
    (fadd-value incoherentConcept 'incoherence-reason message)
    (complain "~&Warning:  ~A" message) ))
    

(defun warn-of-incoherent-implication (incoherentConcept)
  ;; Warn the user of an incoherent implication;
  (let ((message (format nil "The implication attached to concept '~S' is incoherent."
			 incoherentConcept)))
    (fadd-value incoherentConcept 'incoherence-reason message)
    (complain "~&Warning:  ~A~%" message) ))



;;; TO DO:

#|

RECYCLE EQUIVALENCE CLASS STRUCTS

WRITE "help-condition-atomic-vr", AND CALL IT IN "condition-value-restrictions";
  MEANWHILE STRINGS CAN'T BE USED AS VALUE RESTRICTIONS;

INVENT "MINI-CONCEPTS", AND USE THEM AS VALUE RESTRICTIONS AND RELATION
RANGES;

;OPTIMIZATION:  Add "dont-merge-concept" option to "fill-from-list" so that
;   we don't do a merge if all we're doing is searching for a concept

Consider eliminating the keyword parameter "context" from
   "generate-unique-concept-name".

|#
