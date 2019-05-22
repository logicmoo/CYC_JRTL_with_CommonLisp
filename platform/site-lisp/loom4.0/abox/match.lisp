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

;;; MATCH.LISP (ABOX)

;;; Contains methods and functions which support computation of
;;;    TYPEs for database instances (DB-INSTANCEs)

(in-package "LOOM")

;(export '())


  ;;
;;;;;; Conditioning method
  ;;

(defmethod mark-as-incoherent ((self DB-INSTANCE) &key incoherent-restriction)
  ;; Record incoherence of the instance "self" in the special variable
  ;;    *detectedIncoherenceP* (but don't actually mark "self");
  ;; "unify-instance-features" checks that variable;
  ;; Called by "detect-incoherent-restriction" when an incoherent restriction
  ;;    is detected;
  (declare (ignore incoherent-restriction)
	   (special *detectedIncoherenceP*))
  (setq *detectedIncoherenceP* t) )


  ;;
;;;;;; Pre-classification methods for db-instances
  ;;

(defmethod set-up-classification-flags ((self DB-INSTANCE) parents)
  ;; Place "concept-is-below" flags on ancestors of "self",
  ;;    and place "feature-is-below" flags on asserted and inherited
  ;;    restrictions, comparisons, and computed-features of "self";
  ;; Note: We rely on "compute-rock-bottom-type" and "detect-incoherence-p"
  ;;    to insure current values for the slot "residue-features", which contains
  ;;    asserted and default features not implied by the type of "self";
  ;; Note: This code is somewhat similar to code in
  ;;    "UNARY-CONCEPT.set-up-classification-flags";
  (let ((passCounter (incf *concept-is-below-pass-counter*)))
    (loop for parent in parents
	 unless (eql (concept-is-below-counter parent) passCounter)
	 do
	 (set-concept-is-below-counters parent)
	 (flag-list-of-features (implied-restrictions parent))
	 (flag-list-of-features (implied-computed-features parent))
	 (flag-list-of-features (implied-comparisons parent)))
    (flag-list-of-features (residue-features self)) ))

(defun flag-list-of-features (listOfFeatures)
  ;; Helping function for "set-up-classification-flags";
  ;; Set "feature-is-below" flags on features in "listOfFeatures";
  (loop for feature in listOfFeatures
       when (not (eql (feature-is-below-counter feature) *concept-is-below-pass-counter*))
       do (map-ancestors
	    feature
	    (lambda (node)
	      (setf (feature-is-below-counter node) *concept-is-below-pass-counter*))
	    :reflexive-p t)) )

(defmethod compute-starting-points ((self DB-INSTANCE))
  ;; Return a set of (unary) concept nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  (let ((type (db-type self))
	(startingPoints nil)
	consequent)
    (loop for entry in (conjuncts-table self)
	 unless (subconcept-p type (setq consequent (consequent-concept (car entry))))
	 do (loop for prim in (primitive-concepts consequent)
		 do (pushnew prim startingPoints)))
    (if (null startingPoints)
	(setq startingPoints
	      (cons *thing* (primitive-concepts type)))
	(progn
	  (push *thing* startingPoints)
	  (loop for prim in (primitive-concepts type)
	       do (pushnew prim startingPoints))))
    startingPoints ))

;; Note: We don't call "pre-classify-concept" for db-instances


  ;;
;;;;;; Subsumption tests for loom-instances
  ;;

(defmethod specializes-classified-concept-p 
	   ((self DB-INSTANCE) concept checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test between the loom instance "self" and the
  ;;    unary-concept "concept";
  ;; Returns t if "self" is an instance of "concept";
  ;; The algorithm depends on prior placement of "feature-is-below" flags 
  ;;    on restrictions inherited by "self";
  ;; CAUTION: If this logic changes, update "CLOS-INSTANCE.s-c-c-p" as well;
  (declare (special *matchBackwardChainingConceptsP*)
	   (ignore checkForEqualityFlag))
 #L:trace-match (trace-values "specializes-classified-concept-p:" self concept) 
 (let ((passCounter *concept-is-below-pass-counter*)
       (*testConcept* concept))		; LITEBUG
   (declare (special *testConcept*))	; LITEBUG
    ;; Test to see if each of the primitive concepts, restrictions and
    ;;    computed-features inherited by "concept" is flagged, indicating it
    ;;    is also inherited by "self";
    (when (and (backward-chaining-p concept)
	       (not *matchBackwardChainingConceptsP*))
      (return-from specializes-classified-concept-p nil))
    (catch :mixed-instances		; LITEBUG
      (and
       ;; first match primitiveness
       (or dontCheckPrimsFlag 
	   (subconcept-wrt-primitiveness-p concept))
       ;; return nil if we find a feature of "concept" which is not
       ;;    specialized by a feature of "self":
       (loop for feature in (restrictions concept)
	   always (or (eql (feature-is-below-counter feature) passCounter)
		      (test&mark-feature-p self feature passCounter)))
       (loop for feature in (comparisons concept)
	   always (or (eql (feature-is-below-counter feature) passCounter)
		      (test&mark-feature-p self feature passCounter)))
       (loop for feature in (computed-features concept)
	   always (or (eql (feature-is-below-counter feature) passCounter)
		      (test&mark-feature-p self feature passCounter)))
       (loop for nc in (negated-concepts concept)
	   always (not-has-instance-p nc self))
       (or (null (defined-set-feature concept))
	   (test&mark-feature-p self (defined-set-feature concept) passCounter))
       (subconcept-wrt-defined-concepts-p self concept))) ))

(defmethod satisfies-disjunction-p (self concept)
  ;; Determine whether "self" satisfies "concept",
  ;;    which is known to be defined as a disjunction;
  ;; Assumption: "self" is a loom instance or CLOS instance
  ;;    (rather than a concept);
  ;; Called by "subconcept-wrt-defined-concepts-p", which itself was
  ;;    called by "xxx.specializes-classified-concept-p";
  (loop for d2 in (disjuncts concept)
       thereis (specializes-classified-concept-p self d2 nil nil)))

(defmethod parent-is-identical-p ((self DB-INSTANCE) parent dontExpandP)
  ;; Helping function for "classify-below";
  ;; Return "parent" iff "self", which is known to specialize "parent", is
  ;;    identical to it;
  ;; In the case of db-instances, we always return nil (false);
  (declare (ignore parent dontExpandP))
  nil )

(defmethod find-descendant-subsumers ((self DB-INSTANCE) node)
  ;; Helping method for "help-find-subsumers";
  ;; Situation: "self" is known to be an instance of "node", but we
  ;;    have not yet visited "node";
  ;; If "node" is not a disjunctive concept, then employ the ordinary
  ;;    recursive search over the descendants of "self";
  ;; If "node" is a disjunction,
  ;;    1) If "node" represents a disjoint-covering,
  ;;       then terminate the recursive search over descendants after
  ;;       finding the first subsumer that is also a disjunct of "node";
  ;;    2) If no subsumers can be found directly,
  ;;       then try to prove disjointness in all but one disjunct;
  (declare (special *newParents*))
#L:trace-class (trace-values "~%FIND-DESCENDANT-SUBSUMERS:" self node)
  (case (defined-as node)
    (:disjunction
     (let ((belowMoreSpecificDisjunctionP nil))
       (loop for subNode in (search-nodes node)
	    when (help-find-subsumers self subNode)
	    do
	    (when (eq (defined-as subNode) :disjunction)
	      (setq belowMoreSpecificDisjunctionP t))
	    (when (and (member :disjoint-cover (attributes node))
		       (member subNode (disjuncts node)))
	      (return nil)))
       (when (not (or belowMoreSpecificDisjunctionP
		      ;; this test is needed to avoid disjointness tests
		      ;; when self already belongs to a primitive disjunct,
		      ;; since primitive concepts are not kept in search-nodes
		      (loop for disjunct in (disjuncts node)
			   thereis (eql (concept-is-below-counter disjunct)
					*concept-is-below-pass-counter*))))
	 (let (forcedDisjuncts                 ; RMM 6/1/94
               *catchingRecursiveClassificationsP*)
	   (declare (special *catchingRecursiveClassificationsP*))
	   ;; special variable *catchingRecursiveClassificationsP* tells
	   ;;    inner code that its safe throw to :recursive-classification-catcher
	   (catch :recursive-classification-catcher
             (setq forcedDisjuncts (find-forced-disjuncts self node))
             (when forcedDisjuncts
	       (loop for fd in forcedDisjuncts
                     do
	             (push fd *newParents*)
	             (set-concept-is-below-counters fd))
	       (return-from find-descendant-subsumers nil))))
	 ;; if we reach here, we aborted during the search for a forced
	 ;;    disjunct (to avoid recursively invoking the classifier)
	 (push node 
	       (retry-search-for-disjuncts (modification-summary self))))))
    (otherwise
     (loop for subNode in (search-nodes node)
	  do (help-find-subsumers self subNode)))) )

(defun find-forced-disjuncts (instance node)
  ;; Called by "find-descendant-subsumers";
  ;; Situation: "instance" is a DB-INSTANCE that satisfies "node";
  ;;    "node" is a disjunction concept;
  ;; Return a list of disjuncts d such that "instance" provably does
  ;;    not belong to all disjuncts except d;
  ;; A list of length greater than one is possible only if we are
  ;;    performing non-monotonic inference;
  (let* ((disjuncts (disjuncts node))
         (notInDisjuncts (loop for d in disjuncts
	                       when (not-has-instance-p d instance)
	                       collect d)))
    (case (- (length disjuncts) (length notInDisjuncts))
      ;; if zero, return all disjuncts such that "instance" is provably
      ;;    not an instance only using the closed world assumption:
      (0 (loop for d in disjuncts
               unless (let ((*defaultModeP* nil))
                        (declare (special *defaultModeP*))
                        (not-has-instance-p d instance))
               collect d))
      (1 (set-difference disjuncts notInDisjuncts))
      (otherwise nil)) ))

(defun find-unique-disjunct (instance node)
  ;; Called by "compute-more-specific-type";
  ;; Situation: "instance" is a DB-INSTANCE that satisfies "node";
  ;;    "node" is a disjunction concept;
  ;; If "instance" satisfies one-and-only-one subconcept (disjunct)
  ;;    of "node", then return that disjunct;
  (let ((possibleDisjunct nil))
    (loop for disjunct in (disjuncts node)     ; RMM 6/1/94
	 unless (not-has-instance-p disjunct instance)
	 do
	 (if possibleDisjunct
	     (return-from find-unique-disjunct nil)  ;; two possible disjuncts found
	     (setq possibleDisjunct disjunct)))
    possibleDisjunct) )


  ;;
;;;;;; Feature matching during classification of instances
  ;;

;;; During a match we never test a feature more than once during a
;;;    single pass of the match cycle: If the test succeeds, then the
;;;    feature gets "marked", and won't be tested again.  If the test
;;;    fails, the feature is pushed onto "one-pass-feature-misses".  The
;;;    rationale here is that a test can fail and later succeed only if
;;;    in betwee the two tests, the instance matches a new concept -- in
;;;    that event, the instance will necessarily repeat the match cycle,
;;;    and hence the test will be retried during the next cycle.

(defun test&mark-feature-p (instance feature passCounter)
  ;; Helping function for "DB-INSTANCE.specializes-classified-concept-p";
  ;; Return true if "instance" matches the feature "feature";
  ;; Side-effect: Mark all features above the newly-matched feature;
  ;; Note: Default role hits and misses get saved in the slots
  ;;    "default-if-removed-bombs" and "default-if-added-bombs", and are
  ;;    installed on the instance by "install-default-role-bombs";
  ;; Note: "recompute-asserted-instance-type-p" takes care of clearing
  ;;    the slots "strict-feature-misses" and "default-feature-misses";
  ;; Note: During backchaining, "modificationSummary" will be nil;
  (let ((modificationSummary (and (classified-instance-p instance)
				  (modification-summary instance)))
	(satisfiedP nil))
    #L:trace-match (trace-values "feature-is-satisfied-p" feature instance (default-mode-p))
    (unless (and modificationSummary 
		 (member feature 
			 (if (default-mode-p)
			     (default-feature-misses modificationSummary)
			     (strict-feature-misses modificationSummary))))
      (setq satisfiedP (feature-is-satisfied-p feature instance))
      (if satisfiedP
	  ;; mark feature flags and cache feature hit:
	  (progn
	    (map-ancestors
	      feature (lambda (node)
			(setf (feature-is-below-counter node) passCounter))
	      :reflexive-p t)
	    (when modificationSummary
	      (if (default-mode-p)
		  (push feature (default-feature-hits modificationSummary))
		  (push feature (strict-feature-hits modificationSummary)))))
	  ;; cache feature miss for remainder of this pass:
	  (when modificationSummary
	    (if (default-mode-p)
		(push feature (default-feature-misses modificationSummary))
		(push feature (strict-feature-misses modificationSummary))))))
    #L:trace-match (say "satisfiedP = " satisfiedP)
    satisfiedP ))

;;; These "feature-is-satisfied-p" methods provide side-effect-free
;;;    predicates for testing the satisfaction of a feature by an instance.
;;; They are called by feature-analyzing functions and backward-chaining
;;;     functions;

(defmethod feature-is-satisfied-p ((restriction MIN-RESTRICTION) instance)
  ;; Return t iff the attributes of "instance" satisfy "restriction";
  (probe-at-least-p 
    instance (relation restriction) 
    (lower-bound restriction) (qualification restriction)) )

(defmethod feature-is-satisfied-p ((restriction MAX-RESTRICTION) instance)
  ;; Return t iff the attributes of "instance" satisfy "restriction";
  (probe-at-most-p 
    instance (relation restriction) 
    (upper-bound restriction) (qualification restriction)) )

(defmethod feature-is-satisfied-p ((restriction VALUE-RESTRICTION) instance)
  ;; Return t iff the attributes of "instance" satisfy "restriction";
  (probe-all-p 
    instance (relation restriction) 
    (value-restriction restriction) (qualification restriction)) )

(defmethod feature-is-satisfied-p ((feature FILLED-BY-FEATURE) instance)
  ;; Return t if the role of "instance" indicated in "feature" has fillers
  ;;    that match each of the fillers present in "feature";
  (probe-filled-by-p 
    instance (relation feature) (role-fillers feature)) )

(defmethod feature-is-satisfied-p ((feature NOT-FILLED-BY-FEATURE) instance)
  ;; Return t if the role of "instance" indicated in "feature" has cannot
  ;;    have fillers that match any of the fillers present in "feature";
  (probe-not-filled-by-p 
    instance (relation feature)
    (non-role-fillers feature) (qualification feature)) )

(defmethod feature-is-satisfied-p ((feature COMPARISON-FEATURE) instance)
  ;; Return t iff the attributes of "instance" satisfy the comparison "feature";
  (let ((roles (roles feature)))
    (cond
      ((null (cddr roles))
       (probe-binary-tuple-p
	 instance (relationship feature) (first roles) (second roles)))
      ((eq (feature-type feature) :same-as)
       ;; WHY AREN'T THESE ELIMINATED DURING NORMALIZATION???
       (let ((firstRole (first roles)))
	 (loop for otherRole in (rest roles)
	      always
	      (probe-binary-tuple-p
		instance (relationship feature)
		firstRole otherRole))))
      (t
       (probe-n-ary-tuple-p
	 instance (relationship feature) roles))) ))

(defmethod feature-is-satisfied-p ((feature REIFIED-COMPARISON-FEATURE) instance)
  ;; Return t iff the attributes of "instance" satisfy the comparison "feature";
  (probe-exists-p instance (relationship feature) (co-references feature)) )

(defmethod feature-is-satisfied-p ((feature COMPUTED-FEATURE) instance)
  ;; Return t iff the attributes of "instance" satisfy the computed
  ;;    feature "feature";
  (when (null (compiled-predicate feature))
    (seal-computed-feature feature))
  (execute-query
    (funcall (compiled-predicate feature) instance)) )

(defmethod feature-is-satisfied-p ((feature SET-FEATURE) instance)
  ;; Return t iff the attributes of "instance" satisfy the set
  ;;    feature "feature";
  (has-instance-p feature instance) )


;;; These "feature-is-contradicted-p" methods provide side-effect-free
;;;    predicates for testing the violation of a feature by an instance.
;;; They are called by feature-analyzing functions and backward-chaining
;;;     functions;

(defmethod feature-is-contradicted-p ((restriction MIN-RESTRICTION) instance)
  ;; Return t iff the attributes of "instance" violate "restriction";
  (probe-at-most-p 
    instance (relation restriction)
    (- (lower-bound restriction) 1) (qualification restriction)) )

(defmethod feature-is-contradicted-p ((restriction MAX-RESTRICTION) instance)
  ;; Return t iff the attributes of "instance" violate "restriction";
  (probe-at-least-p
    instance (relation restriction) 
    (+ (upper-bound restriction) 1) (qualification restriction)) )

(defmethod feature-is-contradicted-p ((restriction VALUE-RESTRICTION) instance)
  ;; Return t iff the attributes of "instance" violate "restriction";
  ;; ALTERNATIVE METHOD: Try to prove (:not (:all r c)) = (:some r (:not c))
  ;;                     by two incomplete methods:
  ;; (:or (:and (:at-least 1 r)
  ;;            (:all r (:not c)))
  ;;      (:satisfies ?x
  ;;            (:exists ?f (:and (r ?x ?f)
  ;;                                ((:not c) ?f)))))
  ;; ALTERNATIVE METHOD: (examine whether it always terminates)
  ;;                     invoke "not-has-instance-p" recursively with each filler
  ;;                     of the restricted relation;
  ;; ALTERNATIVE METHOD: temporarily assert feature and detect incoherence of "instance";
  (loop for filler in (collect-all-role-fillers instance (relation restriction))
       thereis (not-has-instance-p (value-restriction restriction) filler)) )

(defmethod feature-is-contradicted-p ((cmp COMPARISON-FEATURE) instance)
  ;; Return t iff the attributes of "instance" violate the comparison "cmp";
  ;; Simplifications: currently only handles :same-as comparisons
  ;;                  some role must be single-valued to clash
  ;;                  two rigid designators are incompatible
  ;;                  only check type incompatibility of fillers;
  ;; TO DO: detect clashes when some role has a (MAX 1) restriction,
  ;;        exhaustive incompatibility requires a "temporary" merge of fillers
  ;;        take :not-same-as constraints into account when they are implemented;
  (let ((roles (roles cmp))
	result)
    (when (and (equivalence-feature-p cmp)
	       (loop for role in roles
		    thereis (role-is-single-valued-p role)))
      (let (allFillers rigidFillers)
	(loop for role in roles
	     do  ;; TO DO: EXAMINE WHETHER CLOSEDSETP TESTS ARE NEEDED;
	     (multiple-value-bind (closedSetP fillers)
		 (apply-rolechain-role-to-instance role instance)
	       (declare (ignore closedSetP))
	       (setq allFillers (bag-append allFillers fillers))))
	(when (and (cdr allFillers)
		   (cdr (setq allFillers (remove-duplicates allFillers))))
	  (loop for f in allFillers
	       when (not (skolem-instance-p f))
	       do
	       (pushnew f rigidFillers))
	  (setq result
		(or (cdr rigidFillers)
		    (let (combinedType)
		      (loop for f in allFillers
			   when (instance-p f)
			   do (pushnew (db-type f) combinedType))
		      (disjoint-set-of-concepts-p combinedType)))))))
    #L:trace-match (trace-values "feature-is-contradicted-p" cmp instance result)
    result ))

(defmethod feature-is-contradicted-p ((feature COMPUTED-FEATURE) instance)
  ;; Return t iff the attributes of "instance" violate the computed
  ;;    feature "feature";
  (let ((*openRoleThrow* nil)
	positiveTestResult)
    (declare (special *openRoleThrow*))
    (setq positiveTestResult 
      (feature-is-satisfied-p feature instance))
    ;; If this happens we can't tell if the feature is truly contradicted or not
    (if *openRoleThrow*
	nil
      (not positiveTestResult)) ))

(defmethod feature-is-contradicted-p ((feature SET-FEATURE) instance)
  ;; Return t iff the attributes of "instance" violate the set
  ;;    feature "feature";
  (not-has-instance-p feature instance) )

(defmethod feature-is-contradicted-p ((feature FILLED-BY-FEATURE) instance)
  ;; Called during incoherence checking -- return nil;
  (declare (ignore instance))
  nil )


  ;;
;;;;;; Post-classification methods for db-instances
  ;;

;; At present, we don't do anything after the type computation
;;    that resembles post-classification;

