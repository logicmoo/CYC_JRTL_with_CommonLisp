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

;;; TYPES.LISP (ABOX)

;;; Contains the logic which responds to ABox assertions and retraction by
;;;    recomputing affected TYPEs.

(in-package "LOOM")

;(export '())


  ;;
;;;;;; Low-level support functions for TYPEs:
  ;;

#+CLTL2 (declaim (inline typelist-specializes-concept-p))
#-CLTL2 (proclaim '(inline typelist-specializes-concept-p))
(defun typelist-specializes-concept-p (listOfConcepts concept)
  ;; Return true if at least one concept in "listOfConcepts"
  ;;    specializes "concept";
  (if (null (cdr listOfConcepts))
      (subconcept-p (car listOfConcepts) concept)
      (or (member concept listOfConcepts)
	  (loop for c in listOfConcepts
	       thereis (subconcept-p c concept)))) )

(defun disjoint-set-of-concepts-p (concepts)
  ;; Return t if a pair of concepts in "concepts" is disjoint; 
  (and (rest concepts)
       (loop for (concept1 . rest) on concepts
             thereis
             (loop for concept2 in rest
                   thereis (disjoint-concepts-p concept1 concept2))) ))


  ;;
;;;;;; Recomputation of instance TYPES
  ;;

(defun compute-never-before-matched-instance-type (instance)
  ;; Situation: "instance" has not yet been through its first match
  ;;    cycle;  Compute its type, short-circuiting some of the
  ;;    logic found in "recompute-retracted-instance-type-p";
  (let ((newType (compute-rock-bottom-type instance)))
    (setf (strict-db-type instance) newType)
    (setf (db-type instance) newType) 
    ;; check for :reclassify indicator, and reclassify if necessary:
    (reclassify-instance-features instance :asserted)
    (reclassify-instance-features instance :violated)
    ;; if "revise-one-instance" caused this computation, there may be
    ;;    cumulative value restrictions that need retracting:
    (integrity-check (null (cumulative-value-restrictions instance)))
    (multiple-value-bind (incoherentP deltaRestrictions)
                         (detect-incoherence-p instance (loom-constant THING))
      (if incoherentP
        (propagate-max-restrictions instance deltaRestrictions)
        (propagate-forward-inferences instance deltaRestrictions))) ))

(defun reclassify-instance-features (instance asserted/violated)
  ;; Situation:  "features" are a list of instance features that may or
  ;;    may not be classified;
  ;; Return a list of classified features unless the network is not sealed,
  ;;    in which case return nil;
  ;; Side-effect: Update the slots "asserted-features" (or "violated-features");
  ;; This function is wrapped around locations where "asserted-features"
  ;;    is called and we aren't sure if they are classified or not;
  ;; IF THIS WRAPPER GETS TOO FREQUENT, RETHINK THIS STRATEGY;
  (flet ((all-restriction-references-classified-p (lclRes)
           (and (local-relation lclRes)	; TAR 2/17/95
		(classified-p (local-relation lclRes))
                (or (null (local-qualification lclRes))
                    (classified-p (local-qualification lclRes)))
                (or (null (local-value-restrictions lclRes))
                    (classified-p (local-value-restrictions lclRes))))))
    (let ((features (ecase asserted/violated
                      (:asserted (asserted-features instance))
                      (:violated (violated-features instance)))))
      (cond
       ((neq (first features) :reclassify)          ; "features" are already classified
        features)
       ((or *network-is-sealed-p*
            (loop for ftr in features   ; RMM 11/22/94
                  always
                  (or (typep ftr 'FEATURE)  ; TAR 2/17/95
                      (all-restriction-references-classified-p ftr))))
        (setq features
              (loop for f in (rest features)	; skip over :reclassify
                    append (classify-instance-feature f instance)))
        (ecase asserted/violated
          (:asserted (setf (asserted-features instance) features))
          (:violated (setf (violated-features instance) features))))
       (t ;; return nil to avoid breaking (as in looking at an instance)
        nil)) )))

(defun recompute-retracted-instance-type (instance)
  ;; Replace the TYPE of "instance" with a rock-bottom type;
  ;; If this causes the type to change (i.e., to become more general),
  ;;    withdraw any forward inferences that are now unsupported,
  ;;    detonate any type bombs affected by the change, and recompute
  ;;    any strict role fillers inferred for "instance";
  ;;    Finally, check for incoherence;
  ;; Note: "post-incoherent-instance" and (indirectly)
  ;;    "propagate-forward-inferences-to-filler" and "propagate-forward-inferences",
  ;;    set the slot "retraction-message" to :detect-incoherence.  Also,
  ;;    "compute-rock-bottom-type" sets it.  This forces a check for incoherence
  ;;    even when the type remains constant (i.e., by checking for feature conflicts);
  ;; Note: The value of "(residue-features instance)" is recomputed either by
  ;;    "detect-incoherence-p" (where it aids the incoherence checking) or here
  ;;    in the case that incoherence detection is skipped;
 #L:trace-types (trace-values "recompute-retracted-instance-type" instance)
  (let* ((oldType (db-type instance))
	 ;; This call can set (retraction-message modificationSummary):
	 (newType (compute-rock-bottom-type instance))
	 (modificationSummary (modification-summary instance))
	 (checkForIncoherenceP
	   (eq (retraction-message modificationSummary) :detect-incoherence)))
    (if (or (neq oldType newType)
	    checkForIncoherenceP)
	(progn
	  (setf (strict-db-type instance) newType)
	  (setf (db-type instance) newType)
	  (detonate-type&conflict-bombs instance newType :retraction nil)
	  (withdraw-all-strict-role-fillers instance)
	  ;; nullify asserted features before they get recomputed by "detect-incoherence-p":
	  (setf (residue-features instance) nil)
	  (detect-incoherence-p instance oldType)
	  (withdraw-unsupported-forward-inferences instance))
	;; set initial value for "residue-features"
	;; ELMINATE M-V-BIND WHEN WE ELIMINATE INTEGRITY CHECK:
	(multiple-value-bind (residue incoherentP)
	    (compute-residue-features-p instance)
	  (integrity-check (not incoherentP))
	  (setf (residue-features instance) residue)
          (when (test-bit-flags (db-attributes instance) :db-instance :recompute-features)
            (withdraw-unsupported-forward-inferences instance)
            (clear-bit-flags (db-attributes instance) :db-instance :recompute-features))))
    ;; note: no forward propagation is needed at this point, i.e., things
    ;;    are already up to date in this regard.
    ))

(defun recompute-asserted-instance-type-p (instance)
  ;; Recompute the TYPE of "instance";
  ;; Mode may be strict or default;
  ;; Note: The new type is guaranteed to be the same or more specific
  ;;    than the old type;
  ;; Note: "withdraw-defaults" guarantees that the old type is strict
  ;;    if we are not in default mode;
  (let* ((oldType (db-type instance)) 
	 (modificationSummary (modification-summary instance))
	 newType newlyAssertedFeatures)
    ;; clear misses cache before its gets filled by "test&mark-feature":
    (if (default-mode-p)
	(setf (default-feature-misses modificationSummary) nil)
	(setf (strict-feature-misses modificationSummary) nil))
    ;; compute new type:
    (setq newType (compute-more-specific-type instance))
    (emit-classify-string "r" :emit-match-stars)
    ;; detect any newly-asserted features:
    (when (setq newlyAssertedFeatures
		(newly-asserted-features modificationSummary))
      (setf (newly-asserted-features modificationSummary) nil))
    (when (and (eq  oldType  newType)
	       (not newlyAssertedFeatures)
               (not (newly-negated-conjuncts modificationSummary)))
      ;; return, with repostToSameQueueP = nil, except in the (rare) case that
      ;;    the type doesn't change, but there are new restrictions:
      (return-from recompute-asserted-instance-type-p nil))
    (setf (newly-negated-conjuncts modificationSummary) nil)
    (setf (rock-bottom-p modificationSummary) nil)
    (setf (db-type instance) newType)
    (unless (default-mode-p)
      (setf (strict-db-type instance) newType))
    (multiple-value-bind (incoherentP deltaRestrictions)
	(detect-incoherence-p instance oldType)
      (when newlyAssertedFeatures
	;; "deltaRestrictions" misses any newly asserted features:
	(loop for f in newlyAssertedFeatures
	     do (pushnew f deltaRestrictions)))
      (if incoherentP
        (progn
          ;; compute strict max restrictions:
          (propagate-max-restrictions instance deltaRestrictions)
          nil					; repostToSameQueueP = nil
          )
	  (progn
	    (propagate-forward-inferences instance deltaRestrictions)
	    t)))				; repostToSameQueueP = t
    ))


  ;;
;;;;;; Second-level type computation functions
  ;; 

;; OBSOLETE:
;(defmethod compute-more-specific-type
;	   ((instance TBOX-CONCEPT) &key backward-chaining-p)
;  ;; Compute the "most-specific-generalization" of "instance", i.e.,
;  ;;    return a list of the most-specific among all concepts which
;  ;;    subsume "instance";
;  ;; Situation: "instance" is a meta-thing that resides both in the
;  ;;    TBox and the ABox;
;  ;; Strategy:
;  ;;    Copy the slots of "instance" into a dummy instance;
;  ;;    Call "compute-type-of-db-instance" on the dummy;
;  ;;    Copy dummy's "db-type" back into "instance";
;  (let ((dummy (make-loom-instance 'DUMMY-META-INSTANCE
;				   :real-meta-instance instance)))
;    (copy-db-instance-slots instance dummy)
;    (compute-more-specific-type dummy :backward-chaining-p backward-chaining-p) ))

(defun compute-more-specific-type (instance &key backward-chaining-p)
  ;; Compute the concept representing the "most-specific-generalization" 
  ;;    of "instance";
  ;; If there are multiple concepts in the MSG, return a new concept defined as
  ;;    the intersection of those concepts (unless "backward-chaining-p" is set);
  ;; Side-effect: During the type computation, any calls to a disjointness
  ;;    computation that would require recursive invocation of the classifier
  ;;    are abbreviated;  Pairs of concepts representing untried disjointness
  ;;    tests are pushed onto *untriedDisjointnessTests*;  The tests are
  ;;    queried at the end of this function and the results are cached, insuring
  ;;    that the tests will be valid the next time through the matcher;
  ;; Note:  The starting type is computed by combining both the current type and
  ;;     the conjuncts (forward-propagation could have created conjuncts not
  ;;     specialized by the current type);  "conjuncts" appear at the end of the
  ;;     list to exploit the possibility that they will all be marked as "visited"
  ;;     when they are encountered inside of "set-up-classification-flags";
  (let* ((oldType (db-type instance))
	 (copyOfParents (list oldType))
	 consequent newTypeList)
    (loop for entry in (conjuncts-table instance)
	 unless (subconcept-p oldType
			      (setq consequent (consequent-concept (car entry))))
	 do (push consequent copyOfParents))
    (set-up-classification-flags instance copyOfParents)
    (let ((*matchBackwardChainingConceptsP* backward-chaining-p)
	  (*untriedDisjointnessTests* nil))
      (declare (special *matchBackwardChainingConceptsP*
			*untriedDisjointnessTests*))
      (setq newTypeList (classify-below instance copyOfParents
					(compute-starting-points instance)
					:compute-msg-only-p t))
      ;; replace concepts by their consequents:
      (loop for tail on newTypeList
	   do (setf (car tail) (consequent-concept (car tail))))
      (setq newTypeList (most-specific-concepts newTypeList :destructive-p t))
      (loop for pair in *untriedDisjointnessTests*
	   do (disjoint-concepts-p (car pair) (cdr pair)))
      (when (and (modification-summary instance)
		 (retry-search-for-disjuncts (modification-summary instance)))
	(setq newTypeList (fold-in-unique-disjuncts instance newTypeList)))
      (if backward-chaining-p
	  newTypeList
	  (compute-unified-type newTypeList (intrinsic-concept instance)))) ))

(defun fold-in-unique-disjuncts (instance typeList)
  ;; Helping function for "compute-more-specific-type";
  ;; Retry any searches for unique disjuncts that were aborted the middle of
  ;;    classifying "instance" (because the search would have been recursive);
  ;; If new disjuncts are found, add them to "typeList", and return the most
  ;;    specific among the augmentted set of concepts;
  (let ((retrySearchForDisjunctsNodes 
	  (retry-search-for-disjuncts (modification-summary instance)))
	newDisjunct foundUniqueDisjunctP)
    ;; Empty "retry-search-for-disjuncts", so we don't retry again later;
    (setf (retry-search-for-disjuncts (modification-summary instance)) nil)
    (loop for node in retrySearchForDisjunctsNodes
	 when (and
		;; If we already went below some disjunct,
		;;    we don't need to search any further
		(loop for disjunct in (disjuncts node)
		     never (typelist-specializes-concept-p typeList disjunct))
		(setq newDisjunct (find-unique-disjunct instance node)))
	 do 
	 (push (consequent-concept newDisjunct) typeList)
	 (setq foundUniqueDisjunctP t))
    (when foundUniqueDisjunctP
      ;; QUESTION: For complete matching,
      ;;    don't we need to do a classification search below "newDisjunct"?
      ;; According to RMM: No.
      ;; You already get "absolutely complete matching",
      ;; because if you have a new disjunct, the matcher will repost
      ;; the instance and rematch all over again from top to bottom.
      (setq typeList (most-specific-conjuncts 
		       (most-specific-concepts typeList :destructive-p t)
		       :destructive-p t)))
    typeList ))

(defun compute-unified-type (conjuncts intrinsicConcept &key temporary-p)
  ;; Return a concept representing the unification of the concepts in
  ;;    "conjuncts" unless two of the conjuncts are disjoint, in which
  ;;    case return the list of conjuncts unchanged;
    (cond 
      ((null (rest conjuncts))
       (first conjuncts))
      ((disjoint-set-of-concepts-p conjuncts)
       ;; incoherent!  Return a list of concepts specialized by every conjunct:
       (compute-coherent-types conjuncts intrinsicConcept))
      ;; short-circuit call to "define-concept" for case of bc conjunct:
      ((and  (loop for c in conjuncts thereis (backward-chaining-p c))
	     (null (rest (setq conjuncts (most-specific-conjuncts conjuncts)))))
       (first conjuncts))
      (t
       (emit-classify-string "T")
       (let ((concept (create-conjunction-concept conjuncts temporary-p)))
	 (if (incoherent-p concept)
	     (list concept)
	     concept)))) )

(defun compute-coherent-types (conjuncts intrinsicConcept)
  ;; Situation: "conjuncts" contains one or more disjoint concepts;
  ;; Return a most specific list of concepts all of whom are specialized by 
  ;;    all concepts in "conjuncts" or by "intrinsicConcept";
  (most-specific-concepts          ; RMM 7/1/94
   (adjoin (or intrinsicConcept *thing*)
           (loop for super in (all-super-concepts (first conjuncts))
                 when (loop for c in conjuncts always (subconcept-p c super))
                 collect super))) )

(defun create-conjunction-concept (conjuncts temporaryP)
  (let ((conjunctionConcept
         (define-concept
           :type :concept
           :is `(:and ,@conjuncts)
           :characteristics '(:system-defined)
           :system-characteristics 
           (if temporaryP 
             '(:temporary :definition-only) 
             '(:definition-only))))
	(*dontReviseInstancesP* t)             ; TAR 8/5/97
	)
    (declare (special *dontReviseInstancesP*)) ; TAR 8/5/97
    (when (boundp '*insideMatch/FireLoopP*)
      ;; if we are in the middle of a match seal immediately:
      ;; PREVIOUS VERSION TEMPORARILY DISABLED DEFAULT MODE, BUT WE
      ;;    CAN'T DO THAT IN THIS VERSION.  IS THAT A PROBLEM???:
      (seal-unsealed-concepts))
    conjunctionConcept ))

(defun compute-rock-bottom-type (instance &key side-effect-free-p)
  ;; Called by "recompute-retracted-instance-type-p",
  ;;    "compute-never-before-matched-instance-type", and
  ;;    "find-type&residue-features";
  ;; Return the rock-bottom TYPE of "instance";
  ;; If the rock-bottom TYPE is equivalent to "(db-type instance)",
  ;;    return the latter, so an "eq" test can determine equivalence;
  ;; Cache the result in the modification summary for "instance";
  ;; Also, withdraw ALL implied role fillers (survivors get recomputed
  ;;    later on in "recompute-individual-type");
  ;; CONSIDER DOING EVEN MORE COMPUTING HERE, CLASSIFYING USING FEATURES
  ;;    AS WELL AS CONJUNCTS (NOTE: WE ALREADY USE ASSERTED FEATURES -- DO
  ;;    THE OTHERS CONTRIBUTE INITIALLY??);
  (let ((modificationSummary (modification-summary instance))
        rockBottomTypeList)
    ;; compute conjuncts contributing to "rockBottomTypeList":
    (loop for entry in (conjuncts-table instance)
	 do
	 (let ((supportRecord (cdr entry)))
	   (when (or (assertion-p supportRecord)
		     (plusp (domain/range-count supportRecord)))
	     (push (consequent-concept (car entry)) rockBottomTypeList)))) 
    (when (test-bit-flags (db-attributes instance) :db-instance :incoherent)
;;; WE NO LONGER POST TO THE RETRACTION QUEUE A SECOND TIME:  RMM 3/4/94
;      (when (and modificationSummary		; null if recognizer is disabled
;		 (eq (retraction-message modificationSummary) :detect-incoherence))
;	;; if incoherent for the second time, make quick exit
;	(return-from compute-rock-bottom-type rockBottomTypeList))
      (setq rockBottomTypeList
	    (delete (loom-constant INCOHERENT) rockBottomTypeList))
      (unless side-effect-free-p
	(clear-bit-flags (db-attributes instance) :db-instance :incoherent)
	(retract-conjunct instance (loom-constant INCOHERENT) :retraction)
	(when (get-slot-values instance (loom-constant INCOHERENCE-REASON))
	  (set-slot-values instance (loom-constant INCOHERENCE-REASON) nil))
	;; force call to "detect-incoherence" even if type doesn't change:
	(setf (retraction-message modificationSummary) :detect-incoherence)))
    (when (null rockBottomTypeList)
      (setq rockBottomTypeList (list *Thing*)))
    (setq rockBottomTypeList 
	  (most-specific-conjuncts 
	    (most-specific-concepts rockBottomTypeList :destructive-p t)
	    :destructive-p t))
    (loop for tail on rockBottomTypeList
	 do (setf (car tail) (consequent-concept (car tail))))
    (unless side-effect-free-p
      (setf (rock-bottom-p modificationSummary) t))
    (compute-unified-type rockBottomTypeList (intrinsic-concept instance)) ))

(defun withdraw-all-strict-role-fillers (instance)
  ;; Helping function for "recompute-retracted-instance-type";
  ;; Delete ALL strict role fillers from "instance";
  ;; Post strict fillers on strict retraction queue unless they are
  ;;    still supported;
  ;; TO DO: CONSIDER SHORT-CIRCUITING CALL TO "retract-role-filler"
  ;;    IN THE CASE THAT "filler" IS A CONSTANT;
  (loop for (role . fillersRecord) in (role-fillers-table instance)
       do
       (loop for filler in (strict-fillers fillersRecord)
	      do
	      (retract-role-filler instance role filler :strict))) )

(defun apply-strict-role-fillers (instance newtype residueFeatures)
  ;; Find all strict role fillers implied by "newType", and apply
  ;;    them to "instance";
  ;; Comment: Duplicate assertions are no-ops because "assert-role-filler"
  ;;    ignores them;  Thus, rather than trying to filter out
  ;;    duplicate restrictions, we just reapply them;
  ;; Tricky: In default mode, all strict fillers get recorded
  ;;    as default fillers;
  ;; TO DO: FIGURE OUT IF ITS *SAFE* TO ELIMINATE DUPLICATES; 
  ;;    POSSIBLY THE STRICT ROLE FILLERS INHERITED FROM "oldType"
  ;;    GOT OBLITERATED AND MUST BE REASSERTED HERE;
  (if (consp newType) ;; "instance" is incoherent
      (progn (loop for c in newType
		 do (apply-filled-bys instance (implied-restrictions c)))
	     (apply-filled-bys instance residueFeatures))
      (progn 
	(apply-filled-bys instance (implied-restrictions newType))
	(apply-filled-bys instance residueFeatures))) )

(defun apply-filled-bys (instance features)
  ;; Helping function for "apply-strict-role-fillers";
  ;; Assert role fillers for filled-by features;
  (loop for f in features
       when (eq (feature-type f) :filled-by)
       do (loop for filler in (role-fillers f)
	       do (assert-role-filler 
		   instance (relation f) filler :strict))) )

(defun apply-strict-comparisons (instance)
  ;; Include fillers implied by role equivalences and relations
  ;;    implied by :relates and :exists;
  ;; Called by "detect-incoherence-p";
  ;; TO DO: if an equivalence contains subsuming roles,
  ;;        then move all fillers to the most specific roles,
  ;;        leaving support of super-roles unchanged;
  (flet ((apply-one-comparison
	     (cmp)
	   (case (feature-type cmp)
	     (:same-as (apply-one-equivalence instance cmp))
	     (:relates (apply-one-relationship instance cmp))
	     (:exists (apply-one-reified-relationship instance cmp)))))
    (let ((newType (db-type instance)))
      ;; first remove all equivalence-bombs from instance, since a completely new
      ;;    set will be regenerated;
      (remove-equivalence-bombs instance)
      (if (consp newType) ;; "instance" is incoherent
        (loop for c in newType
              do (loop for cmp in (implied-comparisons c)
		       do (apply-one-comparison cmp)))
        (loop for cmp in (implied-comparisons newType)
              do (apply-one-comparison cmp)))
      (loop for ftr in (residue-features instance)
	    do (apply-one-comparison ftr)) )))

(defun remove-equivalence-bombs (instance)
  ;; Helping function for "apply-strict-comparisons";
  ;; Remove the record of each equivalence from role fillers;
  ;; Discard the bombs for recycling;
  (when (equivalence-bombs instance)
    (let (filler preserveBombP)
      (loop for bomb in (equivalence-bombs instance)
	   do
	   (setq filler (first (collect-all-role-fillers
				 instance
				 ;; NOTE: this may be wrong for composed relations:
				 (first (roles (originator bomb))))))
	   (setq preserveBombP nil)
	   (when (classified-instance-p filler)
	     (if (eq (home-ctxt filler) *current-ctxt*)        ; RMM 6/7/94
		 (removef (equivalence-memberships filler) bomb)
		 (setq preserveBombP t)))
	   (unless preserveBombP
	     ;; delete bombs only if all fillers belong to *context*:
	     (discard-equivalence-bomb bomb))))
    (setf (equivalence-bombs instance) nil)) )

(defun apply-one-equivalence (instance eqv)
  ;; Helping function for "apply-strict-comparisons";
  ;; Derive role fillers on "instance" induced by the
  ;;    equivalence feature "eqv";
  (let* ((eqvRoles (roles eqv))
	 (singleValuedP
	   (or (loop for role in eqvRoles thereis (role-is-single-valued-p role))
	       (loop for role in eqvRoles thereis
                     (role-has-upper-bound-restriction-p instance role 1))))
	 eqvFillers) 
    (loop for role in eqvRoles
	 do
	 (if singleValuedP
	     (let ((filler (guardedly-collect-role-filler instance role)))
	       (when filler
		 (pushnew filler eqvFillers))) 
	     (loop for filler in (guardedly-collect-all-role-fillers instance role)
		  do (pushnew filler eqvFillers))))
    ;; TO DO: Detect incoherence if fillers are inconsistent
    ;; with restrictions on roles; SHOULD PROBABLY BE DONE IN detect-incoherence-p
    (if singleValuedP
	(apply-one-single-valued-equivalence instance eqv eqvFillers)
	;; potentially multi-valued role equivalence class:
	;; just assert any known fillers for all roles
	(loop for filler in eqvFillers
             do (loop for role in (roles eqv) 
		     do (assert-role-filler instance role filler :strict))))) )

(defun apply-one-single-valued-equivalence (instance eqv eqvFillers)
  ;; Helping function for "apply-strict-comparisons";
  ;; Create a unified instance for the role eqvalence class,
  ;;    and assert it for all roles
  (let (unifiedFiller constantFiller)
    (declare (special *exitIncoherentWorldP*))
    (setq unifiedFiller
	  (cond
           ((null eqvFillers)  ;; create a skolem instance
            (create-skolem-instance nil))
           ((rest eqvFillers)  ;; merge all existing fillers
            (setq constantFiller (when (not (instance-p (first eqvFillers)))
                                   (first eqvFillers)))
            (let ((firstId (or constantFiller
                               (identifier (first eqvFillers))))
                  rigidIds result fillerId newConstantP)
              (when (not (skolem-instance-p (first eqvFillers)))
                (push firstId rigidIds))
              (loop for filler in (rest eqvFillers)
                    do
		    (setq newConstantP (not (instance-p filler)))
		    (setq fillerId (if newConstantP
                                     filler
                                     (identifier filler)))
		    (when (not (skolem-instance-p filler))
		      (pushnew fillerId rigidIds))
		    (cond
                     ((and constantFiller newConstantP)
                      (throw-if-incoherent-world rigidIds)
                      (warn "~&Two Constants (~{~s ~}) merged in role ~
                             equivalence class ~s~%" rigidIds eqv)
                      ;; Let incoherence be detected normally
                      (assert-role-filler
                       instance (first (roles eqv)) filler :strict))
                     (constantFiller
                      ;; QUESTION: should we check whether "filler" is a skolem?
                      (replace-skolem-by-constant filler constantFiller))
                     (newConstantP
                      (replace-skolem-by-constant (get-instance firstID) filler)
                      (setq constantFiller filler))
                     (t
                      (setq result (merge-instances fillerId firstId :strict)))))
              (when (rest rigidIds)
                (warn "~&Multiple rigid designators (~{~s ~}) merged in role ~
                       equivalence class ~s~%"
                      rigidIds eqv))
              (or constantFiller result)))
           (t
            (first eqvFillers))))
    (loop for role in (roles eqv)
          do (assert-role-filler instance role unifiedFiller :strict))
    ;; plant equivalence-bomb on instance
    ;; REMOVED 4/3/91:
    ;; equivalence-bombs were only used in two situations:
    ;;    1. assertion of single-valued roles with clipping;
    ;;    2. retraction of equivalent roles;
    ;; TO DO: generate intermediate role-fillers for composition relations
    ;; (setq bomb (plant-equivalence-bomb instance eqv))
    ;; add record of equivalence class to unifiedFiller
    ;; (when (instance-p unifiedFiller)
    ;;   (push bomb (equivalence-memberships unifiedFiller)))
    ))

(defun apply-one-relationship (instance feature)
  ;; Helping function for "apply-strict-comparisons";
  ;; Assert a relation between role chain fillers as indicated by
  ;;    "feature", except when the indicated relationship is not
  ;;    primitive or when one or more role chains are not single-valued;
  (flet ((collect-filler
	   (role)
	   (let ((fillers (collect-all-role-fillers instance role)))
	     (when (rest fillers)
	       (return-from apply-one-relationship nil))
	     (first fillers))))
    (let ((relationship (relationship feature))
	  (roles (roles feature)))
      (unless (primitive-p relationship)
	(return-from apply-one-relationship nil))
      (if (binary-p relationship)
	  (assert-role-filler
	    (collect-filler (first roles))
	    relationship
	    (collect-filler (second roles))
	    :strict)
	  (assert-tuple
	    (loop for r in roles collect (collect-filler r))
	    relationship)) )))

(defun apply-one-reified-relationship (instance feature)
  ;; Helping function for "apply-strict-comparisons";
  ;; NOT YET IMPLEMENTED;
  (declare (ignore instance feature))		; Stop compiler warnings --tar
  (print "apply-one-reified-relationship NEEDS TO BE IMPLEMENTED!") )


  ;;
;;;;;; Detecting incoherence
  ;;

(defun mark-instance-incoherent (instance reason)
  (let ((Incoherent (loom-constant INCOHERENT))
        (dbType (db-type instance)))
    (set-slot-value instance (loom-constant INCOHERENCE-REASON) reason)
    (when (and (incoherent-instance-p instance)
               (member Incoherent dbType))
      (return-from mark-instance-incoherent nil))
    (set-bit-flags (db-attributes instance) :db-instance :incoherent)
    (assert-conjunct instance Incoherent :assertion)
    (setq dbType (cond ((eq dbType *thing*) nil)
                       ((atom dbType) (list dbType))
                       (t dbType)))
    (setf (db-type instance) (adjoin Incoherent dbType))
    (grumble "Instance ~S is incoherent:~%  ~A~%" instance reason) ))

(defun detect-incoherence-p (instance oldType)
  ;; Issue a warning if concepts in the db-type of "instance" are found
  ;;    to be disjoint;
  ;; Return two values:
  ;;    (1) t if "instance" is found to be incoherent, and
  ;;    (2) "deltaRestrictions" -- a list of newly inherited restrictions;
  ;; Side-effect: Recompute the slot "residue-features";
  ;; Note: Retraction of incoherence takes place inside of
  ;;   "recompute-retracted-instance-type-p" and "recompute-asserted-instance-type-p";
  ;; TO DO: CONSIDER ADDING EXTRA SLOT TO COMPUTED-FEATURE TO HOLD NEGATION OF
  ;;    :satisfies, SO THAT WE CAN LOOK FOR A DISPROOF OF A :satisfies CONSTRAINT;
  ;; TO DO: EXAMINE INITIAL DETECTION OF INCOHERENCE TO SEE WHAT RESTRICTIONS WERE
  ;;    INHERITED AND WHICH (IF ANY) WERE NOT;
  (let ((newType (db-type instance))
	(modificationSummary (modification-summary instance))
	incoherentP residueFeatures oldResidue
	deltaRestrictions incoherenceReason)
    (setq incoherentP (or (consp newType)
			  (incoherent-p newType)))
    (if incoherentP
	(progn
	  (throw-if-incoherent-world instance)
	  (when (and (not (default-mode-p))
		     (newly-asserted-conjuncts modificationSummary)
		     (member :clip-types *loom-match-features*)
		     (clip-previously-asserted-conjuncts-p instance))
	    ;; tell "process-strict-assertion-queue" to exit back to the
	    ;;    retraction queue:
	    (setf (retraction-message modificationSummary) :conjunct-clipped)
	    (setf (starting-queue-level modificationSummary) $STRICT-RETRACTION-Q$)
	    (return-from detect-incoherence-p (values t nil)))
	  ;; skip residue features computation, but propagate role fillers, etc.
	  )
	(progn
	  (setq oldResidue (residue-features instance))
	  (multiple-value-setq (residueFeatures incoherentP)
	    (compute-residue-features-p instance))
	  (setf (residue-features instance) residueFeatures)
	  ;; check for unsatisfied computed features, unless instance is a
	  ;;    skolem (for skolems, a test like "integerp" might be valid,
	  ;;    but would return the wrong answer):
	  (when (not (skolem-instance-p instance))
	    (loop for f in (implied-computed-features newType)
		when (and ; (not (eq (feature-type f) :satisfies))  ;; TAR 11/13/97
			  (not (feature-is-satisfied-p f instance)))
		do (setq incoherentP t)
		   (setq incoherenceReason 
		     (format nil "The computed feature ~A is not satisfied." f))
		   (return)))
	  (when incoherentP
	    (throw-if-incoherent-world instance))))
    ;; apply strict features even if "instance" is incoherent
    (apply-strict-role-fillers instance newType residueFeatures)
    (when *monotonic-mode-p*
      (apply-strict-comparisons instance))
    (unless incoherentP
      (setq deltaRestrictions
	    (set-difference (implied-restrictions newType)
			    (if (consp oldType)
				(loop for c in oldType append (implied-restrictions c))
				(implied-restrictions oldType))))
      (loop for f in residueFeatures
	   when (and (not (member f oldResidue))
		     (typep f 'RESTRICTION-FEATURE))
	   do (push f deltaRestrictions))
      #L:trace-types (trace-values "detect-incoherence-p" deltaRestrictions (default-mode-p))
      (loop for f in deltaRestrictions
	  when (monitor-feature/fillers-conflict-p f instance)
	  do (setq incoherentP t)
	     (setq incoherenceReason 
	       (format nil "There is a conflict with restriction ~A" f))
	     (return)))
    (when (and (not incoherentP)
	       (violated-features instance))
      ;; check for continued violation of specific features:
      (unless (loop for f in (violated-features instance)
		  when (and (monitor-feature/fillers-conflict-p f instance)
			    (feature-is-really-violated-p f instance))
		  do (setq incoherentP t)
		     (setq incoherenceReason
		       (format nil "There is a conflict with restriction ~A" f))
		     (return t))
	;; If no longer violated, clear violated features
	;; (except in strict mode, when we leave them):
	(when (default-mode-p)
	    (setf (violated-features instance) nil))))
    (unless incoherentP
      (loop for c in (asserted-negations instance)
            when (subconcept-p newType c)
	  do (setq incoherentP t)
	     (setq incoherenceReason (format nil "The new type of the instance -- ~A -- is a subconcept of ~A, which is one of the concepts the instance is asserted NOT to be." newType c))
	     (return)))
    (when incoherentP
      (throw-if-incoherent-world instance)
      (progn
        (setf (db-type instance) newType)
        (mark-instance-incoherent instance incoherenceReason)))
    (values incoherentP deltaRestrictions) ))

(defun feature-is-really-violated-p (feature instance)
  ;; The slot violated features was created to detect "implicit" 
  ;;    features missed by regular incoherence checking;
  ;; Currently, we only log max-1 violations and value restrictions;
  ;; Here, we double check that the implicit max-1 restriction is 
  ;;    still in force, or that the violated feature hasn't disappeared
  ;;    from the instance's type;
  (ecase (feature-type feature)
    (:max-restriction
     (or (role-is-single-valued-p (relation feature))
         (role-has-upper-bound-restriction-p
          instance (relation feature) (upper-bound feature))))
    (:value-restriction
     (multiple-value-bind (type residueFeatures)
                          (find-type&residue-features instance)
       (or (member feature (implied-restrictions type))
           (member feature residueFeatures))))) )

(defun role-has-upper-bound-restriction-p (instance role bound)
  ;; Situation: We look for an upper bound restriction in the middle of
  ;;    conditioning, when we cannot trust the slot "strict-max-restrictions";
  ;; Determine whether an upper bound on restriction on "role" at
  ;;    most "bound" exists;
  (or (loop for res in (implied-restrictions (strict-db-type instance))
	   thereis (and (eq (feature-type res) :max-restriction)
			(subconcept-p role (relation res))
			(<= (upper-bound res) bound)))
      (loop for res in (residue-features instance)
	   thereis (and (eq (feature-type res) :max-restriction)
			(subconcept-p role (relation res))
			(<= (upper-bound res) bound)))) )


(defun monitor-feature/fillers-conflict-p (feature instance)
  ;; Return t if "feature" if role fillers on "instance" conflict with
  ;;    the feature "feature";
  ;; Side-effect: Plant twin role bombs to detect updates to the
  ;;    restricted role that should trigger a rematch (so that the
  ;;    incoherence may be reevaluated);
  ;; Note: One of the bombs is probably unnecessary, but we don't try
  ;;    to deterimine which one;
  (let ((*collectedTriggerInstances* nil)  ;; Mirror monitor-features ;TAR 10/20/98
	(*collectedRoleGenerators* nil)
	(*collectedConceptTests* nil)
	(*collectedConceptGenerators* nil)
	resultP)
    (declare (special *collectedTriggerInstances* *collectedRoleGenerators* 
		      *collectedConceptTests* *collectedConceptGenerators*))
    (setq resultP
      (detect-feature/fillers-conflict-p feature instance))
    (when resultP
	(if (instrument-p feature)
	    (when (or *collectedRoleGenerators*
		      *collectedConceptTests*
		      *collectedConceptGenerators*)
	      (monitor-instrumented-feature 
	       feature instance :conflict (default-mode-p) *collectedRoleGenerators*
	       *collectedConceptTests* *collectedConceptGenerators*))
	  (when *collectedTriggerInstances*
	     ;; plant type bomb (and possibly plant role bomb):
	    (monitor-simple-feature 
	     feature instance :conflict (default-mode-p) *collectedTriggerInstances*)))
      ;; "monitor-simple-feature" may be too smart to plant a role bomb,
      ;;    so we insure that it gets planted:
      (plant-trigger-role-bomb 
	instance (relation feature) feature t nil :if-removed-p t))
    resultP ))


;;; POSSIBLE MISSED INFERENCE: CUMULATIVE VALUE RESTRICTIONS DO NOT INCLUDE
;;;    RESTRICTIONS WHOSE VR'S ARE SET-FEATURES.  THIS IS BECAUSE ONLY THIS
;;;    KIND CAN BE ASSERTED AS A CONJUNCT.  THUS, THERE IS NO STRICT INCOHERENCE
;;;    CHECK FOR SET-FEATURE VR RESTRICTIONS.  THERE IS, HOWEVER, A DEFAULT
;;;    INCOHERENCE CHECK IN "detect-feature/fillers-conflict-p".

(defmethod detect-feature/fillers-conflict-p ((self VALUE-RESTRICTION) instance
					      &key backward-chaining-p)
  ;; Helping method for "detect-incoherence-p";
  ;; Return t if "self" conflicts with the fillers of the corresponding role
  ;;    and we're in default or backward-chaining mode, or if the bad
  ;;    filler is a constant (in which case blame for the inconsistency must
  ;;    be assigned to "self");
  ;; Justification: In :strict mode we assume that its the filler(s) rather
  ;;    than "self" that should be marked as incoherent;
  ;; Bind *collectedTriggerInstances* to a list of (the) bad filler;
  (declare (special *collectedTriggerInstances*))
  (let* ((valueRestriction (value-restriction self))
	 (badFiller
	   (loop for filler in (collect-all-role-fillers
				instance (relation self) (qualification self))  ; RMM 2/18/94
 		when (and (not (has-instance-p valueRestriction filler))
			  ;; Don't do the next test in default mode, even if
			  ;;  we are normally reasoning in default mode.  ;; SAFE??
			  (let ((*defaultModeP* nil))               ; TAR 10/20/98
			    (not-has-instance-p valueRestriction filler)))
                return filler))
	 loomInstanceP)
    (when badFiller
      ;; collect conflicting filler if its a Loom instance:
      (when (setq loomInstanceP (individual-p badFiller))
	(setq *collectedTriggerInstances* (list badFiller)))
      ;; return t if any of these possibilities is in effect:
      (or (default-mode-p)
	  backward-chaining-p
	  (not loomInstanceP))) ))

(defmethod detect-feature/fillers-conflict-p ((self MIN-RESTRICTION) instance
					      &key backward-chaining-p)
  ;; Helping method for "detect-incoherence-p";
  ;; Return nil -- lower bounds don't generate conflicts with role fillers;
  (declare (ignore instance backward-chaining-p))
  nil )

(defmethod detect-feature/fillers-conflict-p ((self MAX-RESTRICTION) instance
					      &key backward-chaining-p)
  ;; Helping method for "detect-incoherence-p";
  ;; Return t if "self" conflicts with the number of fillers
  ;;    on the corresponding role;
  (declare (ignore backward-chaining-p))
  (> (length (collect-all-role-fillers
              instance (relation self) (qualification self)))  ; RMM 2/18/94
     (upper-bound self)) )

(defmethod detect-feature/fillers-conflict-p ((self FILLED-BY-FEATURE) instance 
					      &key backward-chaining-p)
  ;; Helping method for "detect-incoherence-p";
  ;; Situation: The role fillers for "self" will have been asserted into 
  ;;    the corresponding role of "instance" -- this violates a
  ;;    single-valuedness constraint if other fillers also exist;
  ;; Return t if the role of "self" is single valued and there exists
  ;;    more than one filler;
  (declare (ignore backward-chaining-p))
  (let ((role (relation self)))
    (and (role-is-single-valued-p role)
	 (cdr (get-slot-values instance role))) ))

(defmethod detect-feature/fillers-conflict-p ((self NOT-FILLED-BY-FEATURE) instance 
					      &key backward-chaining-p)
  ;; Helping method for "detect-incoherence-p";
  ;; Return t if the role for the feature "self" on instance is filled by
  ;;    instances that also belong to the list of non-fillers;
  ;; QUESTION: SHOULD WE BE PROBING ALL ROLE FILLERS INSTEAD OF JUST LOCAL ONES?
  (declare (ignore backward-chaining-p))
  (let ((fillers (get-slot-values instance (relation self))))
    (loop for nf in (non-role-fillers self)
	 thereis (member nf fillers :test #'filler-equal)) ))

(defun clip-previously-asserted-conjuncts-p (instance)
  ;; Situation: "detect-incoherence" has found that "instance" is
  ;;    incoherent;
  ;; Search for old conjunct assertions that conflict with newly-asserted
  ;;    conjuncts -- if any are found, clip them and return t;
  (let ((newConjuncts (newly-asserted-conjuncts (modification-summary instance)))
	oldConjunct clippedP)
    (loop for newC in newConjuncts
	 do
	 (loop for entry in (conjuncts-table instance)
	      when (and (assertion-p (cdr entry))
			(disjoint-concepts-p newC (setq oldConjunct (car entry)))
			;; no clip in case of two conflicting new conjuncts:
			(not (member oldConjunct newConjuncts)))
	      do
	      (retract-conjunct instance (car entry) :retraction)
	      (setq clippedP t)))
    clippedP ))


  ;;
;;;;;; Feature conditioning
  ;;

(defun compute-residue-features-p (instance)
  ;; Condition all locally-asserted and inherited restrictions of "instance";
  ;; Return two values:
  ;;    (1) a list of all features not implied by the type of "instance";
  ;;    (2) t if "instance" is determined to be incoherent because of the residue
  ;;        features;
  ;; TO DO: ELIMINATE CHECK FOR "modification-summary" IF WE DETERMINE
  ;;    THAT ITS ALWAYS THERE (BUT "instance-contradicts-features"
  ;;    MIGHT NOT HAVE IT);
  (let* ((type (if (default-mode-p)
		   (db-type instance)
		   (strict-db-type instance)))
	 (modificationSummary (modification-summary instance))
	 (assertedFeatures (reclassify-instance-features instance :asserted))
	 (defaultFeatures (and modificationSummary 
			       (active-default-features modificationSummary))))
    (if (and (null assertedFeatures)
	     (null defaultFeatures))
	(values nil nil)
	(unify-instance-features instance type assertedFeatures defaultFeatures)) ))

(defun unify-instance-features (instance type assertedFeatures defaultFeatures)
  ;; Helping function for "compute-residue-features-p";
  ;; Return two values:
  ;;    (1) a list of all features not implied by the type of "instance";
  ;;    (2) t if "instance" is determined to be incoherent because of the residue
  ;;        features;
  ;; Note: *conceptBeingConditioned* is referenced by 
  ;;    "detect-incoherent-restriction", and *detectedIncoherenceP* is
  ;;    referenced by "mark-incoherent-concept";
  ;; Note: The binding of *insideComputeConditionedRestrictionsP* signals
  ;;    "warn-of-incoherent-restriction" not to print a warning message
  ;;    (and thats all it does);
  ;; BUG: classifying restrictions or comparisons resets *CONCEPT-IS-BELOW-PASS-COUNTER*
  ;;      We must make sure that classification is not recursive.
  (let ((*conceptBeingConditioned* instance)
	(*insideComputeConditionedRestrictionsP* t)
	(inheritedEquivalences (loop for cmp in (implied-comparisons type)
				      when (equivalence-feature-p cmp)
				      collect cmp))
	assertedRestrictions assertedEquivalences conditionedEquivalences
	residueFeatures
	*detectedIncoherenceP*)
    (declare (special *conceptBeingConditioned* *detectedIncoherenceP*
		      *insideComputeConditionedRestrictionsP* ))
    (flet ((unify-restrictions (restrictions comparisons)
	     ;; return a list of classified restrictions
	     (let (*relation/restrictionsTable* *listOfLocalRestrictions*
		   *restrictionEquivalenceSets* *newEquivalences*)
	       (declare (special *relation/restrictionsTable* *listOfLocalRestrictions*
				 *restrictionEquivalenceSets* *newEquivalences*))
	       (form-restriction-equivalence-sets comparisons)
	       (loop for res in restrictions
		    do (form-local-restriction-from-classified-restriction res))
	       (form-linked-list-of-restrictions)
	       (form-local-restriction-hierarchy)
	       (propagate-restrictions :cbox)
	       ;; note: we ignore new equivalences formed during propagation;
	       (classify-restrictions nil nil) )))
      ;; compute conditioned equivalences
      ;; ASSUMPTION: only role equivalences are stored in "conditioned-comparisons";
      ;;    This may become invalid when a more complete treatment of inequalities
      ;;    is implemented;
      (when assertedFeatures
	(multiple-value-setq (assertedRestrictions assertedEquivalences)
	  (separate-asserted-features assertedFeatures instance)))
      (if assertedEquivalences
	  (progn
	    (setq conditionedEquivalences
		  (classify-comparisons
		    (generate-most-restrictive-comparisons
		      (append assertedEquivalences inheritedEquivalences))))
	    (loop for eqv in conditionedEquivalences
		 unless (member eqv inheritedEquivalences)
		 do (push eqv residueFeatures)))
	  (setq conditionedEquivalences inheritedEquivalences))
      (when (or assertedRestrictions defaultFeatures assertedEquivalences)
	(let* ((inheritedRestrictions (implied-restrictions type))
	       (combinedRestrictions
		 (unify-restrictions
		   (append assertedRestrictions defaultFeatures inheritedRestrictions)
		   assertedEquivalences)))
	  (loop for res in combinedRestrictions
	       unless (member res inheritedRestrictions)
	       do (push res residueFeatures))))
      ;; if any concepts were newly classified, seal them before the matcher
      ;;    gets restarted:
;; CONCEPTS CLASSIFY AND COMPLETE AUTOMATICALLY, SO WE JUST DISABLE THIS:
;      (seal-network)   RMM 11/22/94
      (values  residueFeatures *detectedIncoherenceP*) )))

(defun separate-asserted-features (assertedFeatures instance)
  ;; Helping function for "unify-instance-features";
  ;; From "assertedFeatures" return two lists:
  ;;    (1) a list of asserted restrictions,
  ;;    (2) a list of asserted equivalences.
  ;; Side-effect: If asserted features need reclassification, then reclassify them
  ;;    and store the result in "(asserted-features instance)";
  (declare (ignore instance))
  (let (assertedRestrictions assertedEquivalences) 
    (if (loop for f in assertedFeatures
	     thereis (member (feature-type f)
			   '(:same-as :relates :exists)))
      (loop for f in assertedFeatures
            do
            (case (feature-type f)
              (:same-as
               (push f assertedEquivalences))
              ((:relates :exists)
               nil)	; DROP THESE ON THE FLOOR!! 
              (otherwise
               (push f assertedRestrictions))))
	(setq assertedRestrictions assertedFeatures))
    (values
      assertedRestrictions 
      assertedEquivalences) ))


  ;;
;;;;;; Forward inference computation
  ;;

;;; Note: Propagation of value restrictions can occur
;;;    (1) When a new role filler is asserted or inferred;
;;;    (2) When a new type is inferred.
;;; The function below handles case (2); the method
;;;    "propagate-forward-inferences-to-filler" in file "modify.lisp"
;;;    handles case (1);
;;; CAUTION: CODE MODIFICATIONS MUST BE MADE TO *BOTH* PROPAGATION ROUTINES

;;; Note: By caching the slot "strict-max-restrictions", we significantly speed
;;;    up the upper bound test in "assert-half-role-filler" needed to
;;;    determine whether or not to clip.

(defun propagate-forward-inferences (instance deltaRestrictions)
  ;; Apply any value restrictions found in "deltaRestrictions" to fillers
  ;;    of the corresponding roles of "instance";
  ;; Record the value restrictions propagated in
  ;;    "(cumulative-value-restrictions instance)", and possibly in
  ;;    "(strict-cumulative-value-restrictions instance)";
  ;; Update the max restrictions in "(strict-max-restrictions instance)";
  ;; Called by "recompute-asserted-instance-type-p" and "apply-defaults";
  (let (concept deltaValueRestrictions deltaMaxRestrictions cumulativeRestrictions
		*constantFillerConflictsWithConjunctP*)
    (declare (special *constantFillerConflictsWithConjunctP*))
    (loop for res in deltaRestrictions
	  do
	  (case (feature-type res)
	    (:value-restriction
	     (setq concept (value-restriction res))
	     (when (typep concept 'UNARY-CONCEPT)
	       ;; note: we don't propagate set features
	       (loop for filler 
                     in (collect-all-role-fillers       ; RMM 2/17/94
                         instance (relation res) (qualification res))
		     do  ;;; BUG: TO DO: DON'T PROPAGATE TO CLOS-INSTANCES!
		     (setq *constantFillerConflictsWithConjunctP* nil)
		     (assert-conjunct filler concept :strict)
		     (when *constantFillerConflictsWithConjunctP*
		       (post-incoherent-instance 
			instance
			(format nil "Filler ~A conflicts with value restriction ~A on relation ~A"
				filler concept (relation res))))
		     (when (and (default-mode-p)
				(classified-instance-p filler))
		       ;; TO DO: DO WE KNOW IF CONFLICT EXISTS HERE???
		       (plant-conflict-bomb
			instance res :type-propagation t concept nil filler)))
	       ;; accumulate only concept-valued value restrictions:
	       (push res deltaValueRestrictions)))
	    (:max-restriction
	     (unless (default-mode-p)
	       (push res deltaMaxRestrictions)))))
    (setq cumulativeRestrictions
	  (append deltaValueRestrictions
		  (cumulative-value-restrictions instance)))
    (setf (cumulative-value-restrictions instance) cumulativeRestrictions)
    (unless (default-mode-p)
      (setf (strict-cumulative-value-restrictions instance)
	    cumulativeRestrictions)
      (when deltaMaxRestrictions
	(setf (strict-max-restrictions instance)
	      (append deltaMaxRestrictions (strict-max-restrictions instance))))) ))

(defun propagate-max-restrictions (instance deltaRestrictions)
  ;; Situation: "instance" is incoherent;
  ;; We don't propagate value restrictions, but we must update the
  ;;    "strict-max-restrictions" slot to insure that clipping works:
  (loop for res in deltaRestrictions
                when (eq (feature-type res) :max-restriction)
                do (push res (strict-max-restrictions instance))) )

(defun withdraw-unsupported-forward-inferences (instance &key all-p)
  ;; Withdraw forward inferences that no longer apply now that the
  ;;    the type of "instance" has been down graded;
  ;; "cumulative-value-restrictions" contains all value restrictions
  ;;    that previously applied to "instance";  Note: Default restrictions
  ;;    may already have been withdrawn, in which case we are only retracting
  ;;    strict propagations here;
  ;; Strategy: Withdraw any value restrictions not specialized by some
  ;;    asserted or inherited feature, and
  ;;    revise the "cumulative-value-restrictions" slot;
  ;; Revise the value of "(strict-max-restrictions instance)";
  ;; If "all-p", withdraw all value restrictions instead of just those
  ;;    that no longer apply;
  ;; Comment: This process is complicated because inherited features
  ;;    only contains MOST-SPECIFIC value restrictions, while
  ;;    "cumulative-value-restrictions" contains ALL value restrictions;
  (let ((cumulativeValueRestrictions 
         (copy-list (cumulative-value-restrictions instance)))
        (strictDBType (strict-db-type instance))
	*survivingValueRestrictions* *survivingMaxRestrictions* concept)
    (declare (special *survivingValueRestrictions* *survivingMaxRestrictions*))
    (unless all-p
      (if (consp strictDBType)     ; For incoherent instances, get them all.
        (progn                          ;  TAR 1/3/94
          (loop for DBType in strictDBType
                do (collect-surviving-restrictions
	            (implied-restrictions DBType) cumulativeValueRestrictions))
          (setq *survivingValueRestrictions* 
                (remove-duplicates *survivingValueRestrictions*))
          (setq *survivingMaxRestrictions* 
                (remove-duplicates *survivingMaxRestrictions*)))
        (collect-surviving-restrictions
         (implied-restrictions strictDBType) cumulativeValueRestrictions))
      (collect-surviving-restrictions 
	(asserted-features instance) cumulativeValueRestrictions))
    (when (incoherent-instance-p instance)
      ;; if incoherent, leave max restrictions, but eliminate value restrictions,
      ;;   unless they are the incoherent value restrictions from Max 0 restrictions!
      (setq *survivingValueRestrictions*
	(loop for valueRestriction in  *survivingValueRestrictions*   ; TAR 3/3/98
	    when (loop for maxRestriction in *survivingMaxRestrictions*
		     thereis (and (eql (upper-bound maxRestriction) 0)
				  (eq (relation valueRestriction) 
				      (relation maxRestriction))))
	      collect valueRestriction)))
    (loop for res in cumulativeValueRestrictions
	 when res
	 do
	 (setq concept (value-restriction res))
	 (loop for filler in (collect-all-role-fillers instance (relation res))
	     when (classified-instance-p filler)   ; TAR 8/21/97
	      do (retract-conjunct filler concept :strict)))
    (setf (cumulative-value-restrictions instance)
	  *survivingValueRestrictions*)
    (setf (strict-cumulative-value-restrictions instance)
	  *survivingValueRestrictions*)
    (setf (strict-max-restrictions instance)
	  *survivingMaxRestrictions*) ))

(defun collect-surviving-restrictions (restrictions cumulativeValueRestrictions)
  ;; Helping function for "withdraw-unsupported-forward-inferences";
  ;; Note: "cumulativeValueRestrictions" gets modified destructively here;
  (declare (special *survivingValueRestrictions* *survivingMaxRestrictions*))
  (loop for res in restrictions
        do
        (case (feature-type res)
	  (:value-restriction
	   (loop for tail on cumulativeValueRestrictions
                 as vr = (first tail)
	         when (and vr
			   (subconcept-p res vr))
	         do
	         (push vr *survivingValueRestrictions*)
	         (setf (car tail) nil)))
	  (:max-restriction (push res *survivingMaxRestrictions*)))) )


  ;;
;;;;;; Side-effect functions
  ;;

;; OBSOLETE:
;(defun modify-class-indices (instance oldType newType)
;  ;; For each concept in "newType", add an index which points its
;  ;;    corresponding class to "instance";
;  (declare (ignore oldType))
;  (if (consp newType)
;    (loop for c in newType
;          do (add-to-local-instances c instance))
;    (add-to-local-instances newType instance)) )


  ;;
;;;;;; Initialization of Instance TYPEs
  ;;


;;; OBSOLETE???:
;;; THIS IS NOT CALLED BY ANY OTHER FUNCTION:
(defun initialize-database-instances ()
  ;; Called the first time the database is matched;
  ;; THIS IS PROBABLY OBSOLETE:
  (when (member :types-not-yet-initialized *loom-match-features*)
    (reinitialize-all-db-types)
    (delf *loom-match-features* :types-not-yet-initialized)) )

;;; OBSOLETE???:
;;; "reinitialize-all-db-types" is called by "seal-unsealed-concept" (via xxx)
;;;     if the matcher has never been invoked;  This causes the control logic
;;;     to short-circuit (this one time) the process of analyzing the HITs and
;;;     MISSES lists; this is done under the assumption that a lengthly process
;;;     of loading db-instances may preceed the first enabling of the pattern
;;;     matcher;
;;; If the TMS structures get messed up, things can be restored by
;;;     calling evaluating "(reinitialize-all-db-types)" and "(match-all)".

;;; OBSOLETE???:
;;; THIS IS NOT CALLED BY ANY OTHER FUNCTION EXCEPT THE OBSOLETE
;;;    "initialize-database-instances":
(defun reinitialize-all-db-types (&optional contexts)
  ;; Compute starting values for the TYPE of each instance in
  ;;    "contexts";
  ;; First, fill in the TYPE slot of each instance with the 
  ;;    most-specific concepts found in its "conjuncts-table" slot,
  ;;    nullify the "hits" and "misses" slots, and discard all attached
  ;;    dependency-bombs;
  ;; Place each initialized-instance on the indeterminate-type queue;
  ;; Save the old TYPE values in *modified-type-queue* -- when the
  ;;    instantiation links are recomputed, this will cause them to
  ;;    be removed from the extensions of classes exiting the TYPE of an
  ;;    instance.
  (labels ((initialize-db-types-in-context
	     (context)
	     (declare (special *listOfInitializedContexts*))
	     ;; Initialize the types of all instances in "context"
	     ;;    AND in the child-contexts of "context";
	     (when (not (member context *listOfInitializedContexts*))
	       (do-context (i context :partitions :instances)
		 (initialize-one-instance i))
	       ;; record that "context" has been initialized:
	       (push context *listOfInitializedContexts*)
	       (loop for childContext in (child-contexts context)
		    do (initialize-db-types-in-context childContext))) ))
    (let ((*listOfInitializedContexts* nil))
      (declare (special *listOfInitializedContexts*))
      (reset-database-queues)
      (loop for context in (or (list-of contexts)
		     (list (find-context 'BUILT-IN-THEORY)))
	   do (initialize-db-types-in-context context)) )))

(defun reset-database-queues ()
  ;; Set all database queues to NIL;
  (loop for i from 0 to $ACT-ON-Q$
       do (setf (aref *match-queues* i) nil)) )

(defmethod initialize-one-instance (instance &key monotonic-p)
  ;; Helping method  for "initialize-db-types-in-context" and
  ;;    "rematch-instances-after-concept-edit";
  ;; Non-LOOM instances do nothing;
  (declare (ignore instance monotonic-p))
  nil )

(defmethod initialize-one-instance ((instance DB-INSTANCE) &key monotonic-p)
  ;; Helping method for "initialize-db-types-in-context" -- do everything
  ;;    described in "reinitialize-all-db-types" to "instance";
  (when (discarded-instance-with-histories-p instance)
    (return-from initialize-one-instance nil))
  (let ((modificationSummary (find-or-create-modification-summary instance)))
    ;; don't reinitialize if "instance" is already on a match queue;
    (when (queue-level modificationSummary)
      (return-from initialize-one-instance nil))
    (if monotonic-p
	;; note: if default matching is in progress, this posts to the
	;;    DEFAULT assertion queue:
	(post-non-analyzable-modified-instance instance :assertion (default-mode-p))
	(unless (never-before-matched-p modificationSummary)
	  (remove-all-role-bombs instance)
	  (deactivate-all-bombs-at-originator instance)
	  (post-non-analyzable-modified-instance instance :retraction (default-mode-p))
          ;; withdraw explicitly because we mark it "never-before-matched-p":
	  (withdraw-all-strict-role-fillers instance)          ; TAR 3/24/95
          (withdraw-defaults instance)
	  ;; eliminate features that might reference redefined concepts:
	  (setf (residue-features instance) nil)
	  (withdraw-unsupported-forward-inferences instance :all-p t)
	  (setf (never-before-matched-p modificationSummary) t))) ))


  ;;
;;;;;; "disjoint-concepts-p"
  ;;

(defmethod disjoint-concepts-p (concept1 concept2)
  ;; Return true if "concept1" and "concept2" are disjoint;
  ;; Strategy:  Define their conjunction, and see if it is incoherent;
  ;; If there are exactly two "concepts", try to avoid classification
  ;;    by checking caches;  if classification is necessary, update
  ;;    one cache afterward;
  ;; "dont-classify-meet-concept-p" indicates that we can't reenter the
  ;;    classifier, so completion on the meet concept cannot be performed;
  ;; Note: "complete-one-concept" avoids sealing concepts marked as
  ;;    :temporary;
  ;; Note: The special variable *disjointnessDepth*  is tested within
  ;;    "condition-consequents";
  (let ((completeP nil)
        (incoherentP nil)
        commonSub)
    (declare (special *disjointnessDepth*))
    (cond
     ((or (eq concept1 concept2)
          (member concept1 (non-disjoint-concepts-cache concept2)))
      (return-from disjoint-concepts-p nil))
     ((member concept1 (disjoint-concepts-cache concept2))
      (return-from disjoint-concepts-p t)))
    (setq concept1 (consequent-concept concept1))       ;  RMM 12/21/93
    (setq concept2 (consequent-concept concept2))       ;  RMM 12/21/93
    (cond
     ((or (subconcept-p concept1 concept2)
          (subconcept-p concept2 concept1))
      (setq completeP t))			; incoherentP = nil
     ((setq commonSub (find-shallow-common-subconcept concept1 concept2))
      (setq incoherentP (incoherent-p commonSub))
      (setq completeP t))
     ((or (loop for nc1 in (negated-concepts concept1)
                thereis (subconcept-p concept2 nc1))
          (loop for nc2 in (negated-concepts concept2)
                thereis (subconcept-p concept1 nc2)))
      (setq incoherentP t)
      (setq completeP t))
     (t
      (if (boundp '*disjointnessDepth*)
        ;; compute disjointness unless we exceed the depth bound:
        (when  (< *disjointnessDepth* *disjoint-concepts-p-max-depth*)
          (incf *disjointnessDepth*)
          (multiple-value-setq (incoherentP completeP)
            (compute-disjointness-p concept1 concept2)))
        ;; top-level computation of disjointness:
        (let ((*disjointnessDepth* 0))
          (declare (special *disjointnessDepth*))
          (multiple-value-setq (incoherentP completeP)
            (compute-disjointness-p concept1 concept2))))))
    (cond
     (incoherentP 
      (addf (disjoint-concepts-cache concept1) concept2)
      (addf (disjoint-concepts-cache concept2) concept1))
     (completeP
      (addf (non-disjoint-concepts-cache concept1) concept2)
      (addf (non-disjoint-concepts-cache concept2) concept1)))
    #L:trace-types (trace-values "disjoint-concepts-p" concept1 concept2 incoherentP completeP)
    (when incoherentP t) ))

(defun find-shallow-common-subconcept (concept1 concept2)
  ;; Very specialized helping function for "disjoint-concepts-p";
  ;; Search two layers down for a common subconcept of "concept1" and
  ;;    "concept2";
  ;; If one is found, return it if either
  ;;    (1) it is coherent, OR
  ;;    (2) it is an incoherent pure conjunction of "concept1" and "concept2";
  ;; Note: Finding an arbitrary incoherent common subconcept does not
  ;;    have any bearing on detection of disjointness, which is why
  ;;    we decline to return such concepts; 
  (flet ((satisficing-concept-p (sub)
	   (let (conjunctLists)
	     (or (not (incoherent-p sub))
		 (and (setq conjunctLists (pure-conjunction-p sub))
		      (loop for cl in conjunctLists
			    thereis 
			    (and (null (cddr cl))
				 (member concept1 cl)
				 (member concept2 cl))))))))
    (or (loop for sub1 in (sub-concepts concept1)
	      when (and (subconcept-p sub1 concept2)
                        (satisficing-concept-p sub1))
              return sub1)
	(loop for sub1 in (sub-concepts concept1)
	      when (loop for subOfSub1 in (sub-concepts sub1)
                        thereis (and (subconcept-p subOfSub1 concept2)
                                     (satisficing-concept-p subOfSub1)))
              return sub1)) ))

(defun compute-disjointness-p (concept1 concept2)
  ;; Helping function for "disjoint-concepts-p";
  ;; Return two values:
  ;;    (1) t iff the concepts are proved to be disjoint;
  ;;    (2) t iff the concepts both are complete, or if disjointness
  ;;        can be proved even though they aren't complete;
  ;; Performs the actual work of searching for disjointness;
  ;; Note: This code goes to great lengths NOT to classify the concept
  ;;    representing the meet of "concept1" and "concept2";
  (when (<= *power-level* 1)
    ;; low power level, perform cheap test and exit
    (return-from compute-disjointness-p
      (compute-cheap-disjointness-p concept1 concept2)))
  (let ((noConstraintsP
         (and (member :definition-only (system-attributes concept1))
              (member :definition-only (system-attributes concept2))))
	conjunction incoherentP)
    (setq conjunction
	  (define-concept :type (concept-or-relation concept1)
	    :is-primitive `(:and ,concept1 ,concept2)
	    :characteristics '(:system-defined)
	    :system-characteristics '(:definition-only :temporary)
	    :classify-immediately 'no))
    (condition-one-concept conjunction)
    (when (null (rest (conjuncts conjunction)))
      ;; return when "conjunction" merges with an existing concept:
      (return-from compute-disjointness-p 
        (values (incoherent-p (first (conjuncts conjunction))) 
                t)))
    ;; inherit disjointness (logic borrowed from "post-classify"):
    (install-partition-memberships conjunction)
    (setq incoherentP (incoherent-p conjunction))
    ;; note: can't exit yet, because must clean up the temporary concept;
    (unless (or incoherentP 
                noConstraintsP
                (<= *power-level* 2)    ; medium or lower power level
                (or (not (completed-p concept1))
                    (not (completed-p concept2))))
      ;; apply completion to inherited constraints:
      ;; note: logic borrowed from "complete-one-concept":
      (incorporate-non-tbox-expressions conjunction)
      ;; make "condition-consequents" happy (it expects that "conjunction"
      ;;    is classified below Thing):
      (setf (all-super-concepts conjunction) (all-super-concepts concept1))
      (let ((*conceptBeingConditioned* conjunction))
        (declare (special *conceptBeingConditioned*))
        (condition-implied-features conjunction))
      (let ((consequent (more-specific-consequent conjunction)))
	;; the consequent may not have been completed,
	;; so we check for incoherence of "conjunction" and "consequent"
	;; before completing "consequent";
	(setq incoherentP
              (or (incoherent-p conjunction)
                  (and consequent
                       (or (incoherent-p consequent)
                           (and (nonforcing-complete-one-concept consequent)
                                (incoherent-p consequent))))))))
    ;; Tests to check if there is disjointness when one or both of the
    ;;  constituent concepts has disjunctive features.  This is necessary
    ;;  because the CONDITION-CONCEPT code doesn't process disjuncts for
    ;;  temporary concepts.   - TAR 1/11/99
    (unless incoherentP
      (setq incoherentP 
	(or (loop for disjFtr in (disjunctive-features concept1)
		thereis (loop for disj in (disjuncts disjFtr)
			    always (disjoint-concepts-p disj concept2)))
	    (loop for disjFtr in (disjunctive-features concept2)
		thereis (loop for disj in (disjuncts disjFtr)
			    always (disjoint-concepts-p disj concept1))))))
    ;; clear super-concept links to speed up clean-up:
    (setf (super-concepts conjunction) nil)
    ;; eliminate temporary concept:
    (eliminate-temporary-concept conjunction)
    (values incoherentP
            (and (completed-p concept1) (completed-p concept2))) ))

(defun compute-cheap-disjointness-p (concept1 concept2)
  ;; Return t if "concept1" and "concept2" inherit disjoint members
  ;;    of the same partition;
  ;; Return a second value t indicating the completeness of the cheap test;
  ;; This test is a *power-level* :low test that avoids creating a
  ;;    meet concept and conditioning it;
  (values
   (and (partition-memberships concept1)
        (partition-memberships concept2)
        (loop for (partition1 . members1) in (partition-memberships concept1)
              thereis
              (loop for (partition2 . members2) in (partition-memberships concept2)
                    thereis
                    (and (eq partition1 partition2)
                         (rest (union members1 members2))))))
   t) )

(defmethod disjoint-concepts-p ((set1 SET-FEATURE) (set2 SET-FEATURE))
  ;; Return true if "set1" and "set2" are disjoint;
  (and (eq (base-set set1) (base-set set2))
       (compute-intersection-of-lists
	 (base-set set1) (members set1) (members set2))) )

(defmethod disjoint-concepts-p (concept1 (set2 SET-FEATURE))
  ;; Return true if "concept1" and "set2" are disjoint;
  (let ((set1 (defined-set-feature concept1)))
    (and set1
	 (eq (base-set set1) (base-set set2))
	 (compute-intersection-of-lists
	   (base-set set1) (members set1) (members set2))) ))

(defmethod disjoint-concepts-p ((set1 SET-FEATURE) concept2)
  ;; Return true if "set1" and "concept2" are disjoint;
  (let ((set2 (defined-set-feature concept2)))
    (and set2
	 (eq (base-set set1) (base-set set2))
	 (compute-intersection-of-lists
	   (base-set set1) (members set1) (members set2))) ))

(defmethod disjoint-concepts-p ((relation1 BINARY-RELATION) concept2)
  (declare (ignore concept2))
  (warn "Disjointness test not yet implemented for relations.") )

(defun clear-disjointness-caches (self)
  ;; Empty the disjoint-concepts and non-disjoint-concepts caches;
  (loop for concept in (disjoint-concepts-cache self)
       do (delf (disjoint-concepts-cache concept) self))
  (setf (disjoint-concepts-cache self) nil)
  (loop for concept in (non-disjoint-concepts-cache self)
       do (delf (non-disjoint-concepts-cache concept) self))
  (setf (non-disjoint-concepts-cache self) nil) )

(defun eliminate-temporary-concept (self)
  ;; Short-cut (instead of zeroing out source definition and then
  ;;    calling "revise-subgraph"):
  ;; First eliminate any subconcepts (which were created in completion of self)
  (integrity-check (member :temporary (system-attributes self)))
  (loop for subc in (sub-concepts self)
       do (eliminate-temporary-concept subc))
  (delf *top-level-uncompleted-concepts* self)
  (remove-parent-links self)
  (reclaim-classifiable-object self) )


  ;;
;;;;;; Type computations
  ;;

(defun types-specialize-type (types type)
  ;; Return t if "types" contains a concept that specializes "type";
  (loop for c in types thereis (subconcept-p c type)) )

(defun types-conflict-with-type (types type)
  ;; Return t if "types" contains a concept that is disjoint with "type";
  (loop for c in types thereis (disjoint-concepts-p c type)) )


;;; Type and Residue Features for Non-Loom Things

(defmethod find-type&residue-features ((self LIST))
  ;; Return two values for "self":
  ;;    (1) our best guess as to the correct Loom Concept, ie LIST;
  ;;    (2) nil (Non-Loom Things don't have attached features);
  (loom-constant LIST) )

(defmethod find-type&residue-features ((self T))
  ;; Return two values for "self":
  ;;    (1) our best guess as to the correct Loom Concept;
  ;;    (2) nil (Non-Loom Things don't have attached features);
  ;; Default Method;
  (intrinsic-concept self) )

(defmethod get-cached-types ((self LIST))
  ;; Return a list of all asserted or inferred types of "self";
  (list (loom-constant LIST)) )

(defmethod get-cached-types ((self T))
  ;; Return a list of all asserted or inferred types of "self";
  ;; Default method.
  (list (intrinsic-concept self)) )


;; Handle the Built-In Types:

(defmethod intrinsic-concept ((self t))
  ;; Everything is a Non-Loom Thing by default;
  #+:MCL (declare (ignore self))
  (loom-constant NON-LOOM-THING) )
(defmethod intrinsic-concept ((self LIST))
  ;; Note: This is higher in the hierarchy than what the find-type&residue returns!
  #+:MCL (declare (ignore self))
  (loom-constant CONS-OR-NULL) )
(defmethod intrinsic-concept ((self SYMBOL))
  #+:MCL (declare (ignore self))
  (loom-constant SYMBOL) )
(defmethod intrinsic-concept ((self STRING))
  #+:MCL (declare (ignore self))
  (loom-constant STRING) )
(defmethod intrinsic-concept ((self CHARACTER))
  #+:MCL (declare (ignore self))
  (loom-constant CHARACTER) )
(defmethod intrinsic-concept ((self NUMBER))
  #+:MCL (declare (ignore self))
  (loom-constant NUMBER) )
(defmethod intrinsic-concept ((self FLOAT))
  #+:MCL (declare (ignore self))
  (loom-constant FLOATING-POINT-NUMBER) )
(defmethod intrinsic-concept ((self RATIONAL))
  #+:MCL (declare (ignore self))
  (loom-constant RATIONAL-NUMBER) )
#+:measures
(defmethod intrinsic-concept ((self MS:DIM-NUMBER))
  #+:MCL (declare (ignore self))
  (loom-constant MEASURE) )
(defmethod intrinsic-concept ((self INTEGER))
  #+:MCL (declare (ignore self))
  (loom-constant INTEGER) )


  ;;
;;;;;; Incoherence test
  ;;

(defmethod incoherent-instance-p ((self T))
  ;; Return t if the instance "self" is incoherent.
  ;; Non-classified instances don't get checked for incoherence.
  nil )

(defmethod incoherent-instance-p ((self BASIC-INSTANCE))
  ;; Return t if the instance "self" is incoherent.
  (if (consp (db-type self))
      (member (loom-constant INCOHERENT) (db-type self))
      (eq (loom-constant INCOHERENT) (db-type self))) )


;; Possible Bug:
#|

CHECK TO SEE IF INCOHERENT INSTANCE REPAIRS ITS ROLE HITS AND MISSES

|#

;; To Do:
#|
|#
