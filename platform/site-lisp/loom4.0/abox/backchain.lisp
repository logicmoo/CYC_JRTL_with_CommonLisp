;;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

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

;;; BACKCHAIN.LISP (ABOX)

;;; Functions that perform backward-chaining inferences in LOOM -- these
;;;    include LOOM's analogue of a theorem prover.

(in-package "LOOM")

(export '( instance-of-p not-instance-of-p 
	  ))


  ;;
;;;;;; Unary Generator function -- "generate-instances"
  ;;

(defun generate-instances (concept &key cached-p unfiltered-p)
  ;; Generate instances of the concept "concept" in the temporal
  ;;    context *agent-time*;
  ;; If "cached-p", generate only instances already inferred to belong to
  ;;    "concept";
  ;; If "unfiltered-p", generate all potential instances, but don't check
  ;;    to see if they are actual instances of "concept" at this time or
  ;;    in this context.  This is useful when revising concepts, since we
  ;;    don't want to do a lot of work in generating instances which are
  ;;    just going to be matched from scratch anyway.
  ;; Tricky: "cached-p" causes Loom to avoid calling "compute-unified-type",
  ;;    which is critical during concept revision;
  (declare (special *collectedConceptGenerators*))
  (when (and (boundp '*collectedConceptGenerators*)
	     (primitive-p concept))
    (pushnew concept *collectedConceptGenerators*))
  (if (recursive-p concept)		; TAR 5/2/96
    (wrap-with-recursion
     (execute-query
      (generate-instances-in-query concept :cached-p cached-p :unfiltered-p unfiltered-p)))
    (execute-query
     (generate-instances-in-query concept :cached-p cached-p :unfiltered-p unfiltered-p))) )

(defun generate-instances-in-query
       (concept &key cached-p dont-remove-duplicates-p unfiltered-p)
  ;; Return a list containing all instances that match "concept";
  ;; Note: The keyword :cached-p is set by rete routines and unsealing
  ;;    routines that scan for cached instances and don't want to see derived
  ;;    instances;
  (cond
   ((and (compiled-generator-p concept)
         (not cached-p))
    (funcall (predicate-symbol concept)))
   ((property-p concept)
    (let ((generatorConcept (or (implied-domain concept) *thing*)))
      (when (eq generatorConcept *thing*)
	(complain 
	 "~&Performance Warning: Get-Instances scans the entire top level context ~
           to generate~%   instances with property ~S.~%   Redefining the ~
           property with a more specific domain will fix this.~%" concept))
      (if unfiltered-p
	  (generate-instances-in-query generatorConcept)
	(delete-if #'(lambda (i) (not (has-instance-p concept i)))
		   (generate-instances-in-query generatorConcept)))))
   ((eq (defined-as concept) :set)
    (if (primitive-p concept)
      (list-current-local-instances concept)
      (let* ((setFtr (defined-set-feature concept))
	     (cardinality (and setFtr (compute-set-cardinality setFtr))))
	;; Heuristic to eliminate truly inifinte sets (cardinality = NIL)
	;;   and also very large sets  (cardinality >= $CARDINALITY-INFINITE$)
	;;  - TAR 10/31/96
        (and cardinality
	     (< cardinality $CARDINALITY-INFINITE$)
             (generate-decoded-set-members setFtr)))))
   (t
    (let ((instances
           (help-generate-instances-in-query 
	    concept :cached-p cached-p :unfiltered-p unfiltered-p)))
      (unless dont-remove-duplicates-p
        (setq instances (fast-remove-duplicates instances)))
      instances))) )

;; TO DO: ADD STUFF FOR GENERATING EXTENSIONS OF SETS, AND SEE IF BC
;;    CODE NEEDS TO BE IMPORTED:
(defun help-generate-instances-in-query (concept &key cached-p unfiltered-p)
  ;; Called by "generate-instances-in-query";
  ;; Return a list containing all CLOS instances that match "concept";
  ;; If "cached-p", retrieve only CLOS instances whose asserted or cached
  ;;    types specialize concept;
  ;; Strategy: Examine subtrees rooted at (1) the most specific primitive
  ;;    ancestors of "concept", and (2) primitive antecedents of those
  ;;    ancestors (recursively);
  ;; Note:  Unless "concept" is temporal, we don't want to use any temporal
  ;;    sub-concepts for generation.  This is because we can't guarantee that
  ;;    that we will be in an appropriate world time environment.  It also
  ;;    causes problems with semantics since all possible times would need to
  ;;    be searched;
  ;; Comment: This logic is an abbreviated version of that found in
  ;;    "generate-instances-in-query";
  (let ((startingConcepts nil)
        (result nil)
        (alreadyVisitedConcepts nil)
	(dontUseTemporalConceptsP (not (temporal-p concept))))
    (labels
      ((compute-a-starting-concept-p (c)
         (cond
          ((or cached-p (compiled-generator-p c))
           (push c startingConcepts)
           t)
	  ((read-only-p c) nil)   ; TAR 12/23/96
	  ((property-p c)		; TAR 9/23/98
	   (when (implied-domain c)
	     (compute-a-starting-concept-p (implied-domain c))))
	  ((primitive-p c)
	   (unless (member c startingConcepts) ; TAR 10/22/98
	     (push c startingConcepts)
	     ;; insure computation of "most-general-antecedents":
	     (loop for ant in (compute-most-general-antecedents c)
		 unless (or (member ant startingConcepts)
			    (and dontUseTemporalConceptsP (temporal-p ant)))
                 do (compute-starting-concepts ant)))
           t)
          (t nil)))
       (compute-starting-concepts (c)
         (or (compute-a-starting-concept-p c)
             (loop for super in (all-super-concepts c)
                   until (compute-a-starting-concept-p super))))
       (compute&filter-local-instances (c)
	 (cond
	  ((property-p c) nil)
	  (unfiltered-p 
	   (do-local-instances (i c) (push i c)))
          ((subconcept-p c concept)
           (do-time-sensitive-local-instances (i c)
             (push i result)))
          (t
           (do-time-sensitive-local-instances (i c) 
             (when (has-instance-p
                    concept (get-temporally-offset-instance i))
               (push i result))))))
       (compute-instances-of-subtree (c)
         (push c alreadyVisitedConcepts)
         (if (and (compiled-generator-p c)
                  (not cached-p))
           (if (or unfiltered-p (subconcept-p c concept))     ; Check for filtering ; TAR 8/18/93
             (prependf result (funcall (predicate-symbol c))) ; RMM 8/13/93
             (loop for i in (funcall (predicate-symbol c))
                   when (has-instance-p
                         concept (get-temporally-offset-instance i))
                   do (push i result)))
           (progn
	     (compute&filter-local-instances c)
	     (loop for sub in (sub-concepts c)
	           unless (or (member sub alreadyVisitedConcepts)
			      (and dontUseTemporalConceptsP (temporal-p sub)))
	           do (compute-instances-of-subtree sub)))))
       (compute-instances-of-thing (self)       ; tar 6/3/93 2.0; 2.1 8/12/93
         ;; note: assumes thing does not have a compiled generator predicate;
	 (push self alreadyVisitedConcepts)
	 (compute&filter-local-instances self)
	 (loop for sub in (sub-concepts self)
	       unless (or (eq sub (loom-constant "NON-LOOM-THING"))
			  (member sub alreadyVisitedConcepts)
                          (and dontUseTemporalConceptsP (temporal-p sub)))
	       do (compute-instances-of-subtree sub))))
      ;; instance generation starts here:
      (if (eq concept (loom-constant THING))    ; TAR 8/12/93
        (compute-instances-of-thing concept)
        (progn (compute-starting-concepts concept)
               (loop for sc in startingConcepts
	             unless (member sc alreadyVisitedConcepts)
	             do (compute-instances-of-subtree sc))))
      result )))
		      
;;; Strategy for computing loom instances of "concept":
;;; If "concept is forward-chaining, just collect the local instances
;;;    stored at "concept" and at sub-concepts of "concept";
;;; If "concept" is backward-chaining:
;;;    Locate a forward-chaining ancestor A of "concept";
;;;    Collect local instances stored at "A" and at sub-concepts of
;;;       "A".  Filter all collected instances by matching against
;;;       "concept";
;;;    Optimizations:
;;;       (1) Avoid filtering local instances at or below "concept";
;;;       (2) Mark visited concepts, to avoid cycles;
;;;    Tricky: If "concept" has a backward chaining antecedent, then
;;;       the forward-chaining ancestor is guaranteed to subsume it
;;;       (otherwise, that ancestor would have been marked backward
;;;       chaining).
;;; NOT YET IMPLEMENTED:
;;;    WE MISS THE EFFECTS OF IMPLICATIONS IMPLIED VIA VRDIFFS;
;;;    WE DON'T TRY TO BC-MATCH ADJACENT INSTANCES THAT MIGHT
;;;       PROPAGATE A VALUE RESTRICTION TO AN INSTANCE;

  ;;
;;;;;; "has-instance-p", "instance-of-p", "not-has-instance-p", "not-instance-of-p"
  ;;

;;; These functions perform an exhaustive test looking for a proof or
;;;    disproof of membership by an instance in a concept;

(defun instance-of-p (instance concept)
  ;; Return t iff "instance" is an instance of "concept";
  (ensure-visibility-of-updates)        ;  TAR 12/22/93
  (execute-query (has-instance-p concept instance)) )

(defun not-instance-of-p (instance concept)
  ;; Return t iff "instance" is provably not an instance of "concept";
  (ensure-visibility-of-updates)        ;  TAR 12/22/93
  (execute-query (not-has-instance-p concept instance)) )

(defmethod safe-has-instance-p (concept instance)
  ;; Situation: "instance" is being matched against "concept";
  ;; This situation can occur in retrieves where we are not always
  ;;    sure that the call is safe.  In particular, properties may
  ;;    be called on instances not in their domain, for example
  ;;    in a retrieve:  (retrieve ?c (?c i));
  (has-instance-p concept instance))

(defmethod safe-has-instance-p ((concept UNARY-RELATION) instance)
  ;; Situation: "instance" is being matched against property "concept";
  ;; This situation can occur in retrieves where we are not always
  ;;    sure that the call is safe.  In particular, properties may
  ;;    be called on instances not in their domain, for example
  ;;    in a retrieve:  (retrieve ?c (?c i));
  (when (or (null (implied-domain concept))
            (types-specialize-type
             (get-cached-types instance) (implied-domain concept))
	    (safe-has-instance-p (implied-domain concept) instance))
    (has-instance-p concept instance)) )

(defmethod has-instance-p (concept instance)
  ;; Situation: "instance" is being matched against a non-LOOM object "concept";
  ;; This situation can occur when there is no generator for a variable
  ;;    used in the concept position in a retrieve:  (retrieve ?c (?c i));
  ;;    However, domain generator for concepts should insure this doesn't happen;
  (declare (ignore concept instance))
  nil )

(defmethod has-instance-p ((concept UNARY-ENTITY) instance)
  ;; Situation: "instance" is a non-LOOM object which is being matched
  ;;    against the concept "concept";
  ;; Instance is "built-in", i.e., it does not have an explicit type
  ;;    that can be used in a subconcept computation -- instead, its
  ;;    satisfaction of a concept can only be evaluated by probing
  ;;    the features of the concept, or by checking to see if it
  ;;    has been explicitly placed in the "local-instances" slot of a concept;
  ;; Return t iff "instance" is an instance of the concept "concept";
  (when (read-only-p concept)
    (return-from has-instance-p (has-bc-instance-p concept instance nil nil)))
  (when (eq concept *thing*) (return-from has-instance-p t))    ;  TAR 12/22/93
  (let ((assertedTypes nil))
    (labels ((has-local-instance-p (c)
               (let ((compiledTest 
                      (get (predicate-symbol c) :loom-compiled-predicate)))
                 (if compiledTest
                   (funcall compiledTest instance)
                   ;; BUG: THIS IS NOT CONTEXT SENSITIVE:
                   (in-local-instances-p instance c))))
             (scan-for-types (c)
               (when (has-local-instance-p c)
                 (when (subconcept-p c concept)
                   (return-from has-instance-p t))
                 (pushnew c assertedTypes))
               (loop for sub in (sub-concepts c) 
                     do (scan-for-types sub))))
      (loop for prim in (most-specific-concepts (primitive-concepts concept))
            do (scan-for-types prim))
      (if (primitive-p concept)
        nil
        (progn
          (setq assertedTypes (most-specific-conjuncts
                               (most-specific-concepts assertedTypes)
                               :destructive-p t))
          (loop for type in assertedTypes
                thereis
                (satisfies-concept-definition-p instance concept type)))) )))


  ;;
;;;;;; Primary "has-instance-p" test
  ;;

;;; These routines perform a backchaining test to determine whether a LOOM
;;;    instance satisfies a concept;  The test may or may not recurse;   If
;;;    it does, a goal stack is maintained to insure against infinite
;;;    regress;
;;; The search is required to be analytic in the sense that constraints acquired 
;;;    during the search cannot be used in subsequent parts of the search tree
;;;    -- doing so would makes the results dependent on the order in which the 
;;;    tree was search (i.e., it would effectively be non-deterministic).
;;; Therefore, attached features of an instance are computed prior to the actual
;;;    search, based only a type derived only from asserted and forward-chaining
;;;    conjuncts (in the case of CLOS instances, the only kind of forward-chaining
;;;    concepts that participate in the type are pure conjunctions of asserted
;;;    concepts;

;;; TO DO:
#|
CYCLE CHECK FOR not-has-instance-p ???
|#

(defmethod get-cached-types ((self BASIC-INSTANCE))
  ;; Return a list of all asserted or inferred types of "self";
  (declare (special *analysisModeP*))
  (if (boundp '*analysisModeP*)
    (list (case *analysisModeP*
            (0					; $STRICT-RETRACTION-Q$
             (compute-rock-bottom-type self :side-effect-free-p t))
            (3					; $DEFAULT-ASSERTION-Q$
             (db-type self))
            (otherwise				; $STRICT-ASSERTION-Q$ or $DEFAULT-RETRACTION-Q$
             (strict-db-type self))))
    
     (let ((type (db-type self)))
       (if (listp type) type (list type)) )) )

(defmethod find-type&residue-features ((self BASIC-INSTANCE))
  ;; Called by "has-instance-p" during backchaining and by probe functions
  ;;    during backchaining or classification or by way of "analyze-features";
  ;; Return two values for "self":
  ;;    (1) the type of "self" (including concepts inferred by default)
  ;;    (2) a list of features not inherited from the type;
  ;; If we are in the middle of feature analysis ("analyze-features" is
  ;;    on the stack), then we return the rock bottom type, the strict
  ;;    type or the full type;
  ;; TO DO: CACHE THE ROCK BOTTOM TYPE COMPUTATION IF "self" HAS A
  ;;    MODIFICATION SUMMARY;
  (declare (special *analysisModeP*))
  (let ((types (if (boundp '*analysisModeP*)
                 (case *analysisModeP*
	           (0                          ; $STRICT-RETRACTION-Q$
	            (compute-rock-bottom-type self :side-effect-free-p t))
	           (3                          ; $DEFAULT-ASSERTION-Q$
	            (db-type self))
	           (otherwise                  ; $STRICT-ASSERTION-Q$ or $DEFAULT-RETRACTION-Q$
	            (strict-db-type self)))
                 (db-type self))))
    (values (or types (intrinsic-concept self) *thing*)
            (and (not (boundp '*analysisModeP*)) (residue-features self))) ))

(defmethod find-strict-type ((self T))
  ;; Return the strictly-derived type of "self";
  (find-type&residue-features self) )

(defmethod find-strict-type ((self BASIC-INSTANCE))
  ;; Return the strictly-derived type of "self";
  ;; "self" must be a history instance;
  ;; BUG: WE DON'T RECORD THE STRICT TYPE OF A HISTORY INSTANCE:
  (db-type self) )

(defmethod find-strict-type ((self DB-INSTANCE))
  ;; Return the strictly-derived type of "self";
  (strict-db-type self) )


;; OBSOLETE?:
;(defmacro use-rete-cache-p (concept instance &key type-test)
;  ;; Macro for use only inside of a "has-instance-p" method;
;  ;; The rete caches cannot be safely used during recognition, AND MORE WORK
;  ;;    IS NEEDED BEFORE THEY CAN BE USED DURING THE RETE MATCH;
;  ;; Called by "BASIC-INSTANCE.has-instance-p" and
;  ;;     "INSTANCE-IN-MATCH-NETWORK.has-instance-p";
; (declare (ignore concept instance type-test))
;  nil )

#+CLTL2 (declaim (inline totally-primitive-p))
#-CLTL2 (proclaim '(inline totally-primitive-p))
(defun totally-primitive-p (concept)
  ;; Return t if "concept" is primitive and has no antecedents;
  (and (primitive-p concept)
       (null (most-general-antecedents concept))) )

;; TO DO: ADD GLOBAL CACHING TO "has-instance-p":
(defmethod has-instance-p ((concept UNARY-ENTITY) (instance BASIC-INSTANCE))
  ;; Return t iff "instance" is an instance of the concept "concept";
  (has-bc-instance-p concept instance nil nil) )

(defmethod has-instance-p ((concept UNARY-ENTITY) (instance DB-INSTANCE))
  ;; Return t iff "instance" is an instance of the concept "concept";
  (has-bc-instance-p
   concept
   instance
   (and (not (backward-chaining-p concept))
	(loop for a in (antecedents concept) never (backward-chaining-p a)))
   nil) )


;;; TO DO: REWRITE THIS AND CALLED FUNCTIONS TO USE A LIST OF TYPES
;;;    INSTEAD OF A SINGLE TYPE.

(defun has-bc-instance-p (concept instance forwardP strictP)
  ;; Return t iff "instance" is an instance of the concept "concept";
  ;; Possibly collect <instance, concept> pair if within an instrumented
  ;;    query;
  ;; "instance" may be a Loom instance or a CLOS instance;
  ;; "forwardP" indicates that "instance" is or will be classified, and that
  ;;     the computation should fail if the type of "instance" does not
  ;;     specialize "concept";
  (declare (special *collectedConceptTests*))
  (let ((compiledTest 
         (get (predicate-symbol concept) :loom-compiled-predicate)))
    (when compiledTest
      (return-from has-bc-instance-p (funcall compiledTest instance))))
  (let ((currentType 
         (if (temporal-p concept)    ;  TAR 12/14/93
           (if (time-map instance)
             (find-type&residue-features (time-map instance))
             (return-from has-bc-instance-p nil))
           (if strictP                  ; RMM 2/7/94
             (find-strict-type instance)
             (find-type&residue-features instance))))
        resultP)
    (setq resultP
          (cond
           ((consp currentType)
            ;; incoherent instance returns t iff some member of its
            ;;    type specializes "concept":
            (loop for c in currentType thereis (subconcept-p c concept)))
           ((subconcept-p currentType concept))
           (forwardP ;; fail if both "concept" and "instance" are forward chaining
            nil)
           ((and (primitive-p concept)
                 (null (most-general-antecedents concept)))
            nil)
           (t
            (case (backward-chaining-complexity concept)
              (:standard            ; non-recursive proof
               (standard-has-instance-p concept instance currentType))
              (:backtrack ;; duplicate subgoals detected during proof
	       (wrap-with-recursion	; TAR 7/18/97
		(backtracking-has-instance-p concept instance currentType)))
              (otherwise                ; "concept" is not yet sealed
               (integrity-check (null (backward-chaining-complexity concept)))
	       ;; If we're not sure, assume we need to handle recursion:
	       (wrap-with-recursion
		(backtracking-has-instance-p concept instance currentType))
	       )))))
    (when (and (boundp '*collectedConceptTests*)
               (or (typep instance 'DB-INSTANCE)      ;  TAR 12/22/93
                   (typep instance 'INSTANCE-IN-MATCH-NETWORK)))
      (push (list* instance concept resultP)
            *collectedConceptTests*))
    resultP ))

(defun standard-has-instance-p (concept instance currentType)
  ;; Return t if a proof can be found that "instance" satisfies "concept";
  (if (default-mode-p)
    (satisfies-concept-definition-p instance concept currentType)
    ;; if we are not already inside of a query, then wrap query a environment
    ;;    around the call to prove concept membership:
    (execute-query
     (satisfies-concept-definition-p instance concept currentType))))

(defun backtracking-has-instance-p (concept instance currentType)
  ;; Called by "has-bc-instance-p";
  ;; Return t if a proof can be found that "instance" satisfies "concept";
  ;; Because "concept" is directly recursive, the goal `(concept instance)'
  ;;    is pushed onto query goal stack to guard agains infinite loops; 
  ;; TO DO: EXTEND MEMOIZATION TO THIS, LIKE IN form-completed-predicate-code.
  (let ((goal `(,concept ,instance))
	returnValue)
    (declare (special *queryGoalTable* *memoizationTable* *pendingMemos* *memoDependencies*))
    (multiple-value-bind (value foundP) (gethash goal *memoizationTable*)
      (cond (foundP
	     (report-memoization-value goal t nil value)
	     value)
	    ((gethash goal *queryGoalTable*)
	     (report-duplicate-subgoal goal t)
	     nil ;; duplicate goal, return failure
	     )
	    (t (setf (gethash goal *queryGoalTable*) t)
	       ;; Record and return value.
	       (setq returnValue 
		 (if (boundp '*depthOfTrace*)
		       (trace-unary-predicate-goal&answer-p
			concept instance currentType goal)
		   (standard-has-instance-p concept instance currentType)))
	       (report-memoization-value goal t t returnValue)
	       (setf (gethash goal *memoizationTable*) returnValue)
	       ;; CONSIDER CALLING "remhash" INSTEAD:
	       (setf (gethash goal *queryGoalTable*) nil)))) ))



(defun trace-unary-predicate-goal&answer-p (concept instance currentType goal)
  ;; Trace the execution of a recursive has-instance-p call;
  ;; Return t if "instance" satisfies "concept";
  (let (answerP)
    (declare (special *depthOfTrace*))
    (inform "~&~v@T~:*~A TEST: ~S~%" *depthOfTrace* (format-goal goal))
    (incf *depthOfTrace*)
    (setq answerP 
      (standard-has-instance-p concept instance currentType))
    (decf *depthOfTrace*)
    (inform "~&~v@T~:*~A ANSWER: ~:[FAIL~;TRUE~]~%" *depthOfTrace* answerP)
    answerP) )


  ;;
;;;;;; "satisfies-concept-definition-p"
  ;;

(defun instrumented-subconcept-p (type testConcept instance)
  ;; Return t if "type" specializes "testConcept", and if
  ;;    instrumentation is in effect, record the test;
  (declare (special *collectedConceptTests*))
  (let ((resultP (subconcept-p type testConcept)))
    (when (and (boundp '*collectedConceptTests*)
               (or (typep instance 'DB-INSTANCE)        ;  TAR 12/22/93
                   (typep instance 'INSTANCE-IN-MATCH-NETWORK)))
      (push (list* instance testConcept resultP)
            *collectedConceptTests*))
    resultP ))

(defun satisfies-concept-definition-p (instance concept currentType)
  ;; Test if the instance "instance" satisfies all components of the definition
  ;;    of the concept "concept";
  ;; If "concept" is temporal, coerce instance to its time-map before proceeding;
  ;; ^^^ THIS MAY BREAK IF WE ARE NOT IN A QUERY!!!
  (flet ((primitives-satisfied-p (instance concept currenttype)
	 ;; Tests whether "instance" satisfies all primitive concepts
	 ;; of "concept";
	 (if (subconcept-p currenttype (loom-constant CONSTANT))
	     (loop for prim in (most-specific-concepts (primitive-concepts concept))
		 always 
		 (or (has-instance-p prim instance)
		     (loop for ant in (most-general-antecedents prim)
			 thereis (has-instance-p ant instance))))
	     (loop for prim in (most-specific-concepts (primitive-concepts concept))
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


  ;;
;;;;;; "not-has-instance-p"
  ;;

(defmethod not-has-instance-p ((concept UNARY-ENTITY) (instance BASIC-INSTANCE))
  ;; Return t iff "instance" is provably not an instance of "concept";
  ;; TO DO: ADD CYCLE CHECK IN BC MODE???
  ;; Semantic Assumption: Skolems represent UNKNOWN values, and hence
  ;;    whether a skolem belongs to a concept is independent of whether
  ;;    or not that concept is closed;
  (declare (special *collectedConceptTests*))
  (let* ((currentType (db-type instance))
	 (testType (consequent-concept concept))
	 resultP)
    (when (consp currentType)
      ;; disproof succeeds only if "concept" is disjoint from all
      ;;    members of the incoherent type:
      (return-from not-has-instance-p
	(loop for c in currentType
	      always (disjoint-concepts-p c concept))))
    (setq resultP
	  (or (disjoint-concepts-p currentType testType)
	      (and (probe-closed-concept-p testType)
		   (not (skolem-instance-p instance))
		   (not (has-instance-p testType instance)))
              (and (partitions concept)         ; RMM 7/21/95
                   (not-has-instance-in-exhaustive-partition-p concept instance))
	      (and (not (instrumented-subconcept-p currentType testType instance))
		   (instance-contradicts-features-p 
		     instance testType currentType (residue-features instance)))))
    (when (and (boundp '*collectedConceptTests*)
	       (primitive-p concept))
      (push (list* instance `(:conflict ,concept) resultP)
	    *collectedConceptTests*))
    resultP ))

(defun not-has-instance-in-exhaustive-partition-p (concept instance)
  ;; Helping function for "UNARY-ENTITY.not-has-instance-p";
  ;; 'concept' has one or more exhaustive partitions;
  ;; Return t if there exists a partition such that 'instance' 
  ;;    provably does not belong to any member of the partition.
  (loop for p in (partitions concept)
        thereis
        (and (exhaustive-partition-p p)
             (loop for member in (partition-members p)
                   always (not-has-instance-p member instance)))) )
  
(defmethod not-has-instance-p
           ((concept UNARY-ENTITY) (instance INSTANCE-WITH-NEGATION))
  ;; Return t iff "instance" is provably not an instance of "concept";
  (or (loop for nc in (asserted-negations instance)
            thereis (subconcept-p concept nc))
      (call-next-method)) )

;; WE NEED THIS BECAUSE NEITHER "instance-with-negation" NOR "negation-mixin"
;;    SPECIALIZES "basic-instance":
(defmethod not-has-instance-p ((concept UNARY-ENTITY) (instance DB-INSTANCE))
  ;; Return t iff "instance" is provably not an instance of "concept";
  (or (loop for nc in (asserted-negations instance)
            thereis (subconcept-p concept nc))
      (call-next-method)) )


;(defmethod not-has-instance-p (concept instance)
;  ;; Situation: "instance" is a non-LOOM object;
;  ;; Return t iff "instance" is provably not an instance of "concept";
;  (and (not (has-instance-p concept instance))
;       (neq concept (loom-constant Thing))) )

(defmethod not-has-instance-p (concept instance)          ; TAR 10/2/96
  ;; Situation: "instance" is a non-LOOM object;
  ;; Return t iff "instance" is provably not an instance of "concept";
  (let ((alreadyVisitedConcepts nil)
	(currentType (find-type&residue-features instance))
        (allTypes nil))
    (labels ((collect-satisfied-concepts-in-subtree (rootConcept)
	       (unless (member rootConcept alreadyVisitedConcepts)
		 (push rootConcept alreadyVisitedConcepts)
		 (when (has-instance-p rootConcept instance)
		   (push rootConcept allTypes)
                   (loop for subConcept in (sub-concepts rootConcept)
                         do (collect-satisfied-concepts-in-subtree 
			     subConcept))))))
      (and (not (has-instance-p concept instance))
	   (or (probe-closed-concept-p concept)
	       (perfect-p concept)
	       (and (not (subconcept-p currentType concept))
		    (instance-contradicts-features-p 
		     instance concept currentType nil))
	       (progn (collect-satisfied-concepts-in-subtree *thing*)
		      (loop for c in allTypes
			    thereis (disjoint-concepts-p c concept))))) )))

(defun not-has-filler-p (relation instance nonFiller)
  ;; Called by "form-binary-test-not";
  ;; Return t if the role "relation" on "instance" provably does not
  ;;    contain the filler "nonFiller";
  (flet ((features-imply-non-filler-p (features)
           (loop for ftr in features
                 thereis
                 (and (subconcept-p relation (relation ftr))
                      (or
                       (and (eq (feature-type ftr) :not-filled-by)
                            (eq nonFiller (first (non-role-fillers ftr))))
                       ;RMM 5/9/95:
                       (and (eq (feature-type ftr) :value-restriction)
                            (not-has-instance-p 
                             (value-restriction ftr) nonFiller)))))))
    (multiple-value-bind (type assertedFeatures)
                         (find-type&residue-features instance)
      (or (if (consp type)              ; incoherent
            (loop for concept in type
                  thereis (and (not (eql concept (loom-constant INCOHERENT)))
                               (features-imply-non-filler-p (implied-restrictions concept))))
            (features-imply-non-filler-p (implied-restrictions type)))
          (features-imply-non-filler-p assertedFeatures)
          (multiple-value-bind (closedRoleP fillers)
                               (collect-closed-set-of-fillers-p
                                instance relation)
            (and closedRoleP
                 (not (member nonFiller fillers :test #'filler-equal)))))) ))

(defun instance-contradicts-features-p (instance testType currentType residueFeatures)
  ;; Helping function for "not-has-instance-p" methods;
  ;; Situation: "concept" and "currentType" are compatible types, but
  ;;    features attached to "concept" may conflict with "concept";
  ;; Return t if "instance" is incompatible with some feature
  ;;    attached to "concept" or its consequent;
  ;; STRATEGY: condition restrictions on "instance" as if it belonged to "concept",
  ;;           in order to detect incoherence (but don't modify slots on "instance");
  ;; TO DO: 1. SPEED UP by not checking features of concepts that instance
  ;;           is known to instantiate;
  ;;        2. EXPLORE ALTERNATIVE METHODS OF DISPROOF:
  ;;           - add exhaustive disproof, by spawning a world and asserting
  ;;             that "instance" belongs to "concept"
  ;;           - add quick disproof methods, e.g. checking features of "concept"
  ;;             independently for a contradiction by "instance"
  ;;             using "feature-is-contradicted-p"
  (let ((currentRestrictions (implied-restrictions currentType))
	(currentEquivalences (implied-comparisons currentType))
	(currentComputedFeatures (computed-features currentType))
	incoherentP deltaRestrictions deltaEquivalences)
    (loop for f in residueFeatures
	 do (case (feature-type f)
	      ((:same-as :relates :exists) (pushnew f currentEquivalences))
	      (otherwise (pushnew f currentRestrictions))))
    (loop for f in (implied-restrictions testType)
	unless (member f currentRestrictions)
	do (push f deltaRestrictions))
    (loop for f in (implied-comparisons testType)
	unless (member f currentEquivalences)
	do (push f deltaEquivalences))
    (loop for f in (computed-features testType)
	 unless (member f currentComputedFeatures)
	 do (push f deltaRestrictions))
    #L:trace-match (trace-values "instance-contradicts-features-p"
				 instance testType deltaRestrictions) 
    (setq incoherentP
      (or (loop for f in deltaRestrictions
	      when (feature-is-contradicted-p f instance)
	      return f )
	      ;; detect equivalence/fillers conflicts
	  (loop for e in deltaEquivalences
	      when (feature-is-contradicted-p e instance)
	      return e)))
    #L:trace-match (trace-values "instance-contradicts-features-p" instance testType incoherentP)
    incoherentP) )


;;; IDEAS FOR IMPROVING SEARCH COMPLETENESS AND PERFORMANCE:
#|
-- ADD SLOT "backward-chaining-type" THAT RECORDS TEMPORARY TYPES
   GENERATED DURING BACKWARD-CHAINING CLASSIFICATIONS

-- REWRITE "probe-all" TO LOOK IN "backward-chaining-type" SLOT INSTEAD
   OF COMPUTING B-C CONCEPT MEMBERSHIP BY ITSELF

-- USE NEW (SMALL, NON-TMS) LOOM OBJECTS TO CACHE KNOWLEDGE LEARED ABOUT
   NON-LOOM INSTANCES DURING SEARCH
|#


  ;;
;;;;;; Classification Functions for non-LOOM objects
  ;;

(defmethod set-up-classification-flags (self parents)
  ;; Situation: "self" is a non-LOOM instance that is about to be classified;
  ;; No flags get set for non-LOOM instances;
  (declare (ignore self parents))
  nil )

(defmethod compute-starting-points (self)
  ;; Situation: "self" is a non-LOOM instance that is about to be classified;
  ;; Return a set of (unary) concept nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  (declare (ignore self))
  (list *Thing*) )


(defmethod parent-is-identical-p (self parent dontExpandP)
  ;; Situation: We are classifying the non-LOOM instance "self";
  ;; Helping function for "classify-below"; 
  ;; In the case of non-LOOM instances, we always return nil (false);
  (declare (ignore self parent dontExpandP))
  nil )
  

  ;;
;;;;; Backward chaining test for incoherence
  ;;

;; THIS IS BOGUS CODE -- REWRITE:
(defun prove-incoherent-p (instance)
  ;; Return t if "instance" is provably incoherent, either because
  ;;    it is asserted to be incoherent, or because an exhaustive
  ;;    classification finds an inconsistency;
  ;; The incoherence check logic is borrowed from "detect-incoherence-p";
  ;; TO DO: A FEW POSSIBILITIES AREN'T YET COVERED BY THIS TEST -- LOOK
  ;;    FOR THEM IN "detect-incoherence-p";
  (when (test-bit-flags (db-attributes instance) :db-instance :incoherent)
    (return-from prove-incoherent-p t))
  (let (currentTypeList incoherentP originalType
	newRestrictions newEquivalences)	; not used
    (declare (ignore newRestrictions newEquivalences))
;; FIX THIS:
;	(maybe-substitute-dummy-meta-thing)
    (setq currentTypeList
	  (execute-query
	    (compute-more-specific-type instance :backward-chaining-p t)))
    (when (cdr currentTypeList)
      (loop for tail on currentTypeList
	   do
	   (let ((concept1 (car tail)))
	     (loop for concept2 in (cdr tail)
		  when (disjoint-concepts-p concept1 concept2)
		  do (setq incoherentP t)))))
    (when incoherentP
      (return-from prove-incoherent-p t))
    (setq originalType (db-type instance))
    (setq incoherentP nil)  ; Replaces multiple-value-setq  tar 6/30/93
;    (multiple-value-setq (newRestrictions newEquivalences incoherentP)
;	(values nil nil nil)
;; THIS IS NOT DEFINED:
;      (update-conditioned-features-p instance)
;      )
    (setf (db-type instance) originalType)
    ;; TO DO: ADD REMAINING TESTS FOUND IN "detect-incoherence-p" HERE:
    incoherentP ))
      


#|

|#
