;;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1999, 2003 University of Southern California                 ;
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

;;; NEGATION.LISP (TBOX)

(in-package "LOOM")

;(export '())

;;; Routines for handling negation expressions.
;;; Some functions are redefined here temporarily
;;; until the negation code is stable.


;;; We will rename the "relative-complement" slot to "negative-features".
;;; The contents of this slot is currently just a list of concepts that
;;; are negated, but it is planned to contain classified features in the future.

(defun negative-features (self)
  (relative-complement self))
(defsetf negative-features (self) (setting)
  `(setf (relative-complement ,self) ,setting))

;;; TO DO: change definition of this slot in classdefs.lisp,
;;; so that it has no inverse.
;;; The following temporarily hacks around this problem:

(defun help-reinit-CONCEPT (self)
  ;; Locally, remove links before things get zero'd out;
  ;; (Assumes that "super-concept" links have been removed by "unclassify-one-concept",
  ;;    i.e., "reinitialize-classifiable-object" can't be used to unclassify a concept);
  (empty-concept self :primitive
		 :depend-ons :non-tbox-depend-ons :conjuncts
		 :parsed-expressions
		 :disjuncts :defined-as
		 ;; REMOVED: :relative-complement 
		 :computed-features :implied-computed-features
		 :characteristics :system-characteristics
		 :disjoint-coverings :disjoint-covering-memberships
		 :partitions :partition-memberships :covering-concepts)
  (setf (defined-as-concepts self) nil)
  (setf (primitive-concepts self) nil)
  (setf (backward-chaining-p self) nil)
  (setf (pure-conjunction-p self) nil)
  (setf (relative-complement self) nil)  ;ADDED
  (help-reinit-CLASSIFIABLE-OBJECT self) )


;;; NORMALIZATION

(defun invert-concept (concept)
  ;; "concept" is a TBOX-CONCEPT;
  ;; Return an expression representing the complement of "concept";
  ;; REWRITE THIS IF RESTRICTIONS GET PASSED INTO HERE;
  ;; NOTE: Assumes that if *expandNonprimitiveNegationsP* is bound,
  ;; then "concept" is a concept object, and we are conditioning some concept,
  ;; all of the concepts it depends on have been classified,
  ;; and we can get a valid definition for them.
  (declare (special *expandNonprimitiveNegationsP*))
  (cond
    ((eq concept :primitive)
     (progn
       (parsing-warning "Attempt to negate :primitive")
       nil))
    ((and (boundp '*expandNonprimitiveNegationsP*)
	  (not (primitive-p concept)))
     ;; "concept" is not primitive: expand and normalize its definition:
     (let ((*parserContextStack* (list *loom-parse-graph*))
	   (*conceptBeingParsed* concept)
	   conceptExpr)
       (declare (special *parserContextStack* *conceptBeingParsed*))
       (setq conceptExpr (initiate-parse-expression
			  (generate-concept-definition concept :definition-only-p t)
			  (concept-or-relation concept)))
       (normalize-algebraic-expression conceptExpr :invert-p t)))
    (t
     `(:not ,concept))))


;;; INCORPORATION

(defun incorporate-negation-or-disjunction (self not/orExpression primitiveConjuncts)
  ;; Situation: "not/orExpression" is a disjunction or negation that defines "self";
  ;;    "relativeConjuncts" lists concepts that "self" specializes;
  ;; Incorporate the negation or disjunction definition into "self";
  ;; The primitive component(s) of the relative conjuncts get anded into
  ;;    each of the disjuncts of a disjunction, or are used as the complement
  ;;    of a negation;
  (let ((disjunctionP (eq (first not/orExpression) :or)))
    (if (or disjunctionP
	    (primitive-p (second not/orExpression)))
	;; Disjunction, or negation of primitive concept:
	(let (relativeConjunct arguments)
	  (setq relativeConjunct 
		(touch-conjunction-concept 
		 (most-specific-conjuncts
		  (most-specific-concepts primitiveConjuncts))))
	  ;; recursively evaluate each argument, conjoining in the relative 
	  ;;   conjunct in the case of a disjunction:
	  (setq arguments
		(loop for arg in (rest not/orExpression)
		     collect (evaluate-expression
			      (if disjunctionP
				  `(:and ,arg ,relativeConjunct)
				  arg)
			      (concept-or-relation self)
			      :disjunct-p disjunctionP)))
	  (ecase (first not/orExpression)
	    (:or
	     (setf (defined-as self) :disjunction)
	     (setf (disjuncts self) arguments))
	    (:not
	     ;; NOTE: we temporarily define "self" as :negation,
	     ;; but conditioning will remove this value after partitions
	     ;; and/or negative features have been installed.
	     (setf (defined-as self) :negation)
	     (setf (negative-features self) (first arguments))
	     (setf (conjuncts self) (list relativeConjunct)))))
	;; For nonprimitive negations, renormalize expression:
	;; NOTE: we bind *expandNonprimitiveNegationsP*, so that normalization
	;; will expand the definitions of all nonprimitive concepts this time.
	(let ((*expandNonprimitiveNegationsP* t)
	      newExpression)
	  (declare (special *expandNonprimitiveNegationsP*))
	  (setq newExpression (normalize-algebraic-expression
			       `(:and
				 ,@primitiveConjuncts
				 (:not ,(second not/orExpression)))))
	  (incorporate-expression self newExpression :context :definition))
	)))


;;; CONDITIONING

(defun condition-negation (self)
  ;; Situation: "self" is a concept that is defined as negation.
  ;; Helping function, only called by "condition-concept".
  ;; Assumes: "self" has a single negative feature, and a single conjunct.
  ;; Locate any exhaustive partitions of the conjunct (or its super-concepts)
  ;;    that include the negative feature.
  ;; If such a partition is found, "self" should be defined as
  ;;    a disjunction of other members of the partition;
  ;; If no such partition is found, then define a new partition
  ;;    that includes the negated concept and "self",
  ;;    and reset the defined-as slot to nil, since the negation is
  ;;    only represented explicitly by features.
  (integrity-check (not (listp (negative-features self))))
  (integrity-check (not (cdr (conjuncts self))))
  (let* ((negatedConcept (negative-features self))
	 (relativeConjunct (car (conjuncts self)))
	 partition)
    ;; remove the :negation definition:
    (setf (defined-as self) nil)
    ;; detect incoherence if relativeConjunct specializes negatedConcept:
    (when (subconcept-p relativeConjunct negatedConcept)
      (mark-as-incoherent self)
      (setf (negative-features self) (list negatedConcept))
      (return-from condition-negation))
    (setq partition
	  (or (find-exhaustive-partition relativeConjunct negatedConcept)
	      (find-inherited-exhaustive-partition relativeConjunct negatedConcept)))
    (if partition
	(let ((otherMembers (remove negatedConcept (partition-members partition)))
	      (ownerIsrelativeConjunctP (eq relativeConjunct (partition-owner partition))))
	  (setf (negative-features self) nil)
	  (if (rest otherMembers)
	      ;; redefine self as the disjunction of otherMembers:
	      (progn
		(setf (defined-as self) :disjunction)
		(if ownerIsRelativeConjunctP
		    (setf (disjuncts self) otherMembers)
		    ;; conjoin relativeConjunct with each disjunct:
		    (setf (disjuncts self)
			  (loop for arg in otherMembers
			       collect (evaluate-expression
					`(:and ,arg ,relativeConjunct)
					(concept-or-relation self)
					:disjunct-p t))))
		(condition-disjuncts self))
	      ;; self should be merged with the only other member of the partition,
	      ;; this is handled by making that member the unique conjunct of self:
	      (progn
		(setf (conjuncts self) (list (first otherMembers)))
		(unless ownerIsrelativeConjunctP
		  (push relativeConjunct (conjuncts self))))))
	;; no partition was found:
	(if (subconcept-p negatedConcept relativeConjunct)
	    ;; negatedConcept specializes relativeConjunct, so we can create a partition:
	    (let ((partitionName (symbol-append-using-concept
				  self
				  (or (name relativeConjunct) (gensym))
				  "-NOT-"
				  (or (name negatedConcept) (gensym))
				  "-PARTITION")))
	      (setq partition (define-partition relativeConjunct partitionName :exhaustive-p t))
	      ;; install the members of the partition:
	      ;; NOTE: this requires re-installing the partition-memberships of "negatedConcept":
	      (define-partition-membership negatedConcept partitionName)
	      (reinstall-partition-memberships negatedConcept)
	      (define-partition-membership self partitionName)
	      (setf (negative-features self) (list negatedConcept)))
	    ;; negatedConcept does not specialize relativeConjunct,
	    ;; so we need to create their conjunction:
	    (let ((conj (touch-conjunction-concept (list negatedConcept relativeConjunct))))
	      (if (incoherent-p conj)
		  ;; conjunction is incoherent, so self is equivalent to relativeConjunct:
		  (progn
		    (setf (negative-features self) nil))
		  ;; recondition with negated conjunction:
		  (progn
		    (setf (negative-features self) conj)
		    (condition-negation self)
		    ;; if negative features remain on self, replace them
		    ;; with the original negatedConcept
		    (when (negative-features self)
		      (setf (negative-features self) (list negatedConcept)))))))) ))

(defun find-exhaustive-partition (owner member)
  ;; Find an exhaustive partition of "owner" that contains "member";
  ;; Called by: condition-negation.
  ;; TO DO: also call when installing partition members,
  ;;        to check for overlapping partitions.
  (let ((partitions (loop for p in (partitions owner)
			 when (and (exhaustive-partition-p p)
				   (member member (partition-members p)))
			 collect p)))
    (when partitions
      ;; ASSUMPTION: a concept may only be a member of one exhaustive partition
      ;; with the same owner:
      (integrity-check (not (cdr partitions)))
      (car partitions))))

(defun find-inherited-exhaustive-partition (conjunct member)
  ;; Find the most specific exhaustive partition such that
  ;;    the partition contains "member" and its owner subsumes "conjunct";
  ;; Called by: condition-negation.
  ;; ASSUMPTION: "conjunct" and "member" are both classified concepts;
  (let (partition mostSpecificPartition)
    (loop for pm in (partition-memberships member)
	 do
	 (setq partition (car pm))
	 (when (and (exhaustive-partition-p partition)
		    (member member (partition-members partition))
		    (subconcept-p conjunct (partition-owner partition)))
	   ;; "partition" is applicable, determine if it is most specific:
	   (if mostSpecificPartition
	       (cond
		 ((subconcept-p (partition-owner partition)
				(partition-owner mostSpecificPartition))
		  ;; partition is more specific:
		  (setq mostSpecificPartition partition))
		 ((subconcept-p (partition-owner mostSpecificPartition)
				(partition-owner partition))
		  ;; partition is less specific: do nothing
		  )
		 (t  ;; Is this an error?
		  (trace-values member "belongs to two partitions with incomparable owners:"
				partition mostSpecificPartition)))
	       (setq mostSpecificPartition partition))))
    mostSpecificPartition))


(defmethod concept-is-a-pure-conjunction ((self UNARY-ENTITY))
  ;; Helping function for "condition-conjuncts";
  ;; Return t iff "self" is defined solely as the conjunctions of
  ;;    some other concepts;
  ;; Note: This only works before "self" has been conditioned;
  ;; Note: *hasLocallyDefinedSetFeatureP* bound by UNARY-ENTITY.condition-concept; 
  (declare (special *hasLocallyDefinedSetFeatureP*))
  (not (or (primitive-p self) (restrictions self) (comparisons self)
	   *hasLocallyDefinedSetFeatureP* (computed-features self)
	   (negative-features self)
	   (and (defined-as self)
		(neq (defined-as self) :set)))) )


;;; PRE-CLASSIFICATION

(defmethod pre-classify-concept ((self TBOX-CONCEPT))
  ;; If "self" has no conjuncts, add the conjunct at the top
  ;;    of its sublattice (e.g., Things, Relates, etc.)
  ;; Compute the list of local and inherited primitive concepts;
  (when (null (conjuncts self))
      (let ((topOfHierarchy (top-of-hierarchy self)))
	(addf (conjuncts self) topOfHierarchy)
	(setf (super-concepts self)
	      (list topOfHierarchy))))
  (compute-primitive-concepts self)
  (compute-negative-features self) )

(defun compute-negative-features (self)
  ;; Fill in the slot "negative-features";
  ;; Note: This functions assumes that the corresponding slot
  ;;    values for all parent concepts have already been computed;
  ;; QUESTION: Should we only store the most restrictive
  ;;    negative features (i.e. the most general negated concepts)?
  ;;    If so, then this should probably be handled during conditioning.
  (let ((inheritedNegs (union-superc-slot-values
			self negative-features)))
    (when inheritedNegs
      (setf (negative-features self)
	    (append (negative-features self) inheritedNegs))) ))


;;; CLASSIFICATION
;;; add negative-features to subsumption and equality tests

(defmethod specializes-classified-concept-p
	   ((concept1 UNARY-ENTITY) concept2 checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on the reified concepts "concept1" and "concept2";
  ;; Returns t or :equal if "concept1" specializes or is equivalent to
  ;;    "concept2";
  ;; The algorithm depends on prior placement of "feature-is-below" flags 
  ;;    on restrictions and structure-predicates inherited by "concept1"
  ;; REDUNDANCY: CODE HERE AND IN "parent-is-identical-p"
 #L:trace-spec (trace-values "specializes-classified-concept-p:" concept1 concept2)
  (let ((passCounter *concept-is-below-pass-counter*)
	definedSetFeature1)
    ;; Test to see if each of the primitive concepts, restrictions and
    ;;    comparisons inherited by "concept2" is flagged, indicating it
    ;;    is also inherited by "concept1"
    (integrity-check (cond
		       ((eq dontCheckPrimsFlag 'unclassified)
			(not (classified-p concept2)))
		       (t (not (classified-p concept1)))))
    (when (and (or dontCheckPrimsFlag 
		   (subconcept-wrt-primitiveness-p concept2))
;	       (loop for res2 in (restrictions concept2)
;		    always (= (feature-is-below-counter res2) passCounter))
	       (restrictions-specialize-restrictions-p concept1 concept2 passCounter)	; RMM 8/8/90
	       (loop for cmp2 in (comparisons concept2)
		    always (= (feature-is-below-counter cmp2) passCounter))
	       (loop for ftr2 in (computed-features concept2)
		    always
		    (or (= (feature-is-below-counter ftr2) passCounter)
			(and (setq definedSetFeature1 (defined-set-feature concept1))
			     (consp definedSetFeature1)	; not :infinite-set
			     (loop for m in (members definedSetFeature1)
				  always (feature-is-satisfied-p ftr2 m)))))
	       (or (null (defined-set-feature concept2))
		   (= (feature-is-below-counter
			(defined-set-feature concept2))
		      passCounter))
	       (subconcept-wrt-negative-features-p concept1 concept2)  ; BK 7/22/91
	       (cond
		 ((defined-as-concepts concept2)
		  (or (subconcept-wrt-defined-concepts-p concept1 concept2)
		      ;; Check whether expansion to DNF is necessary
		      ;; (when (neq dontCheckPrimsFlag 'unclassified) ...)
		      ;; Don't expand if this is really a "specializes-unclassified-concept-p" test
		      (expanded-specializes-concept-p
			concept1 concept2
			:unclassified (eq dontCheckPrimsFlag 'unclassified))))
		 ((defined-as concept1)
		  (ecase (defined-as concept1)
		    (:disjunction
		     (loop for d1 in (disjuncts concept1)
			  always (subconcept-p d1 concept2)))
		    (:set t)))
		 (t t)))
      
      ;; "concept1" specializes "concept2"; now, check for equivalence
      ;; TO DO: DETERMINE WHETHER EXPANSION TO DNF IS EVER NECESSARY TO FIND EQUIVALENCE.
      ;;        IT SEEMS THAT CONDITIONING ALWAYS FINDS A UNIQUE PARENT WHEN
      ;;        THERE MIGHT BE AN EQUIVALENT CONCEPT, AND THAT CASE IS HANDLED
      ;;        BY "parent-is-identical-p"
      (or (not checkForEqualityFlag)
	  (case (defined-as concept1)
	    (:disjunction
	     (return-t-or-equal
	       (set-equal-p (disjuncts concept1) (disjuncts concept2))))
	    (otherwise
	     (return-t-or-equal
	       (= (length (primitive-concepts concept1))
		  (length (primitive-concepts concept2))) 
	       (set-equal-p (restrictions concept1) (restrictions concept2))
	       (set-equal-p (comparisons concept1) (comparisons concept2))
	       (set-equal-p (computed-features concept1)
			    (computed-features concept2))
	       (eql (defined-set-feature concept1) (defined-set-feature concept2))
	       (set-equal-p (defined-as-concepts concept1)
			    (defined-as-concepts concept2))
	       (set-equal-p (negative-features concept1)
			    (negative-features concept2))))))) ))

(defmethod subconcept-wrt-negative-features-p ((self UNARY-ENTITY) concept)
  ;; Perform a subsumption test on the negative-features belonging
  ;;    to "self" and "concept";
  ;; Returns t if "self" specializes or is equivalent to
  ;;    "concept" with respect to negative features;
  ;; ASSUMPTION: each member of negative-features is just a concept,
  ;;    representing a primitive concept which is negated;
  ;; INCOMPLETENESS: it is also possible to satisfy a negative feature
  ;;    by proving disjointness with the negated concept,
  ;;    but we can't invoke a disjointness test in the middle of classification,
  ;;    because it might result in a recursive classification.
  ;;    We could handle this by keeping a list of negations to be tested,
  ;;    and delaying the disjointness tests until after the current classification,
  ;;    similar to the treatment of "fold-in-unique-disjunct" in the ABOX.
  ;;    This case should be rather rare, since normalization forces all negations
  ;;    to primitive concepts, and the only way to negate primitiveness is
  ;;    through partitions/disjoint-coverings.
  ;; See if each of the negative-features inherited by "concept"
  ;;    subsumes some negative-feature of "self":
  (loop for neg2 in (negative-features concept)
       always
       (or (member neg2 (negative-features self))
	   (loop for neg1 in (negative-features self)
		thereis (subconcept-p neg2 neg1))
	   (negative-partition-membership-p self neg2))))

(defun negative-partition-membership-p (self negatedConcept)
  ;; Predicate succeeds if "self" is known to specialize a concept
  ;;    which belongs to a common partition with "negatedConcept";
  ;; ASSUMPTION: "negatedConcept" is primitive and is classified;
  ;; For each partition that negatedConcept belongs to (including inherited memberships),
  ;;    there are two ways to succeed:
  ;;    1. self has disjoint membership in the partition;
  ;;    2. self is being classified, and some disjoint member of the partition
  ;;       is marked as a subsumer of self;
  ;; The algorithm depends on prior placement of "concept-is-below-counter" flags 
  ;;    on primitive concepts inherited by "self";
  ;; NOTE: if "self" is being classified, then it will not yet
  ;;      be installed as a member of the partitions to which it belongs,
  ;;      since that happens in post-classification.
  (let ((passCounter *concept-is-below-pass-counter*)
	(selfBeingClassifiedP (member :being-classified (system-attributes self))))
    ;; Can't succeed if "self" is below negatedConcept
    (unless (if selfBeingClassifiedP
		(eql (concept-is-below-counter negatedConcept) passCounter)
		(subconcept-p self negatedConcept))
      (let (partition negatedMembers selfMembers)
	(loop for pm in (partition-memberships negatedConcept)
	     thereis
	     (progn
	       (setq partition (car pm))
	       (setq negatedMembers (cdr pm))
	       (setq selfMembers
		     (if selfBeingClassifiedP
			 (cdr (assoc (partition-name partition) (partition-memberships self)))
			 (cdr (assoc partition (partition-memberships self)))))
	       (or (and selfMembers
			(loop for m in selfMembers
			     thereis (not (member m negatedMembers))))
		   (and selfBeingClassifiedP
			(loop for member in (partition-members partition)
			     unless (member member negatedMembers)
			     thereis
			     ;; INCOMPLETENESS: if "member" is not primitive,
			     ;; since only primitive concepts are marked before classification:
			     (eql (concept-is-below-counter member) passCounter)))))))) ))


(defmethod parent-is-identical-p ((self UNARY-ENTITY) parent &key dont-expand)
  ;; Helping function for "classify-below";
  ;; Return "parent" iff "self", which is known to specialize "parent", is
  ;;    identical to it;
  (let ((result
	  (case (defined-as self)
	    (:disjunction
	     (or (set-equal-p (disjuncts self) (disjuncts parent))
		 ;; does a throw or returns nil:
		 (and (not dont-expand)
		      (expanded-parent-is-identical-p self parent))))
	    (otherwise
	     (and
	       (= (length (primitive-concepts self))
		  (length (primitive-concepts parent)))
	       (set-equal-p (restrictions self) (restrictions parent))
	       (set-equal-p (comparisons self) (comparisons parent))
	       (set-equal-p (computed-features self) (computed-features parent))
	       (eql (defined-set-feature self) (defined-set-feature parent))
	       (set-equal-p (defined-as-concepts self)
			    (defined-as-concepts parent))
	       (set-equal-p (negative-features self)
			    (negative-features parent)))))))
 #L:trace-spec (trace-values "parent-is-identical-p" self parent result)
    (when result
      parent) ))


;;; POST-CLASSIFICATION
;;; Allow re-installation of partition-memberships of a sublattice
;;; when a new partition is added:

(defun reinstall-partition-memberships (self)
  ;; Recompute partition memberships of "self",
  ;;    and then for all concepts which specialize "self".
  ;; QUESTION: does this require recompletion of "self"?
  (install-partition-memberships self)
  (loop for c in (sub-concepts self)
       do (reinstall-partition-memberships c)))


;;; GENERATION

(defmethod generate-definition-clauses ((self UNARY-ENTITY))
  ;; Return a list of concept and feature definitions comprising the
  ;;    TBox definition for "self" (except for possible primitiveness);
  (declare (special *dont-suppress-non-legal-clauses*))
  (let* ((superConceptNames
	   (generate-multiple-reference-definitions
	     (cond ((and *dont-suppress-non-legal-clauses*
			 (classified-p self)
			 (not (primitive-p self))
			 (not (negative-features self)))
		    (super-concepts self))
		   (t (conjuncts self)))))
	 (otherClauses
	   (if (null (defined-as self))
	       (append
		 (when (defined-set-feature self)
		   (list (generate-set-definition (defined-set-feature self))))
		 (generate-list-of-restrictions (restrictions self))
		 (loop for cmp in (comparisons self)
		      collect (generate-comparison-clause cmp))
		 (loop for ftr in (computed-features self)
		      collect (generate-computed-feature-clause ftr))
		 (loop for neg in (negative-features self)
		      collect (generate-negative-feature-clause neg)))
	       (progn
		 (when (eq (defined-as self) :disjunction)
		   ;; eliminate super concept names from disjunctive definition:
		   (setq superConceptNames nil))
		 (list (generate-algebraic-definition self))))))
    (if (and otherClauses 
	     (eq (first superConceptNames) 'THING)
	     (null (rest superConceptNames)))
	otherClauses
	(append superConceptNames otherClauses)) ))

(defun generate-negative-feature-clause (negation)
  ;; Return a clause representing the negated feature "negation";
  ;; Helping function for "UNARY-ENTITY.help-generate-concept-definition";
  ;; ASSUMPTION: "negation" is currently just a concept;
  `(:not ,(generate-reference-definition negation)))


;;; INSTANCE MATCHING

(defun instance-specializes-classified-concept-p (self concept dontCheckPrimsFlag)
  ;; Perform a subsumption test between the instance "self" and the unary-concept
  ;;    "concept";
  ;; Returns t if "self" is an instance of "concept";
  ;; The algorithm depends on prior placement of "feature-is-below" flags 
  ;;    on restrictions inherited by "self";
  (declare (special *matchBackwardChainingConceptsP*))
  (let ((passCounter *concept-is-below-pass-counter*))
    ;; Test to see if each of the primitive concepts, restrictions and
    ;;    computed-features inherited by "concept" is flagged, indicating it
    ;;    is also inherited by "self";
    (when (and (backward-chaining-p concept)
	       (not *matchBackwardChainingConceptsP*))
      (return-from instance-specializes-classified-concept-p nil))
    (and
      ;; first match primitiveness
      (or dontCheckPrimsFlag 
	  (subconcept-wrt-primitiveness-p concept))
      ;; return nil if we find a feature of "concept" which is not
      ;;    specialized by a feature of "self":
      (loop for feature in (restrictions concept)
	   when (not (eql (feature-is-below-counter feature) passCounter))
	   always (test&mark-feature-p self feature passCounter))
      (loop for feature in (comparisons concept)
	   when (not (eql (feature-is-below-counter feature) passCounter))
	   always (test&mark-feature-p self feature passCounter))
      (loop for feature in (computed-features concept)
	   when (not (eql (feature-is-below-counter feature) passCounter))
	   always (test&mark-feature-p self feature passCounter))
      (or (null (defined-set-feature concept))
	  (test&mark-feature-p self (defined-set-feature concept) passCounter))
      (subconcept-wrt-negative-features-p self concept)  ; BK 7/23/91
      (or (subconcept-wrt-defined-concepts-p self concept)
	  ;; Check whether expansion to DNF is necessary
	  ; (expanded-specializes-classified-concept-p self concept)
	  nil)) ))

(defmethod subconcept-wrt-negative-features-p ((self DB-INSTANCE) concept)
  ;; Perform a subsumption test on the negative-features belonging
  ;;    to "self" and "concept";
  ;; Returns t if "self" specializes or is equivalent to
  ;;    "concept" with respect to negative features;
  ;; ASSUMPTION: each member of negative-features is just a concept,
  ;;    representing a primitive concept which is negated;
  ;;    For instances, this means that we presently never satisfy negative-features
  ;;    directly, but only by eliminating the other member of its partition.
  ;; TO DO: reimplement with full-fledged negative features,
  ;;    so that they can be marked like other features;
  (not (negative-features concept)) )
