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

;;; DEFAULTS.LISP (ABOX)

;;; This file contains TBox code for parsing and conditioning default
;;;    statements, and also ABox code for assuming and withdrawing
;;;    defaults

(in-package "LOOM")

;(export '())

(defun condition-all-defaults ()
  ;; Condition defaults for all concepts in the list
  ;;   *top-level-unconditioned-defaults-concepts* and their subconcepts;
  ;; Called by "classify&complete-all-concepts";
  ;; Note: Default conditioning must take place AFTER all concept
  ;;    completion because it makes calls to "disjoint-concepts-p",
  ;;    which can't run until all concepts are completed;
  (labels ((already-default-conditioned-p (concept)
	     (test-bit-flags (tbox-flag concept) :tbox-flag
			     :or :conditioned-defaults :sealed))
	   (condition-default-sublattice (self)
	     ;; Situation: "self" has been completed, but its defaults have
	     ;;    not been conditioned;
	     ;; Condition the defaults for "self" and all of its subconcepts;
	     (condition-defaults self)
	     (setf (completed-p self) :conditioned-defaults)
	     ;; condition defaults in sub-concepts of "self":
	     (loop for sub in (sub-concepts self)
		  unless (already-default-conditioned-p sub)
		  do 
		  (let ((supers (super-concepts sub)))
		    (when (or (null (rest supers))
			      (loop for s in supers
				   always (already-default-conditioned-p s)))
		      (condition-default-sublattice sub))))))
    ;; note: loop is designed to permit new concepts to enter the
    ;;    queue in the middle of default conditioning:
    (loop while *top-level-unconditioned-defaults-concepts*
	as c = (pop *top-level-unconditioned-defaults-concepts*)
	when (and (not (already-default-conditioned-p c))
		   (loop for s in (super-concepts c)
		       always (already-default-conditioned-p s)))
	do (condition-default-sublattice c)) ))


;;; Strategy for computing local defaults:
;;;
;;;    (1) Start with source-defined local defaults:
;;;        Decompose them into primitive features;
;;;        Condition and classify them, intersecting them with colliding
;;;           strict features;
;;;        Eliminate incoherent survivors;
;;;        Preserve null defaults (e.g., "(:all R Thing)");
;;;        Keep most-specific survivors;
;;;    (2) Compute which inherited defaults will survive:
;;;        Pick one;
;;;        Eliminate if it collides with local default;
;;;        Eliminate it if search for existence of colliding strict 
;;;           features succeeds;
;;;        Intersect it with parallel inherited defaults;
;;;        Keep it if we reach this point;
;;;        Repeat (2) until no more inherited defaults;

;;; The slot "default-concepts" is filled by "incorporate-expression";  The
;;;    slot "default-features" is filled by "incorporate-feature".
;;; Initially, "default-concepts" contains concept objects, while
;;;    "default-features" contains source restrictions.

(defun condition-defaults (self)
  ;; Compute a list of defaults for the concept "self";
  ;; First condition the defaults directly attached to "self";
  ;; Next, determine the set of inherited defaults that are
  ;;    not overriden by locally-defined defaults, and condition those;
  ;; Finally, merge the two sets together to form the complete list of defaults;
  (when (member :temporary (system-attributes self))
    (return-from condition-defaults nil))
  (when (condition-defaults-cheaply-p self)
    (return-from condition-defaults nil))
  (let ((strictConjunct (consequent-concept self))
	strictRestrictions localClassifiedRestrictions survivingRestrictions)
    (multiple-value-bind (localLocalRestrictions localComparisons localPrimitives)
	                 (extract-local-defaults self)
      (multiple-value-bind (inheritedRestrictions
                            inheritedPrimitives inheritedComparisons)
                           (extract-inherited-defaults
                            self localLocalRestrictions localPrimitives)
	;; classify the local local restrictions:
	(let ((*listOfLocalRestrictions* localLocalRestrictions))
	  (declare (special *listOfLocalRestrictions*))
	  (setq localClassifiedRestrictions (classify-restrictions nil :dbox)))
        (setq strictRestrictions
              (possibly-colliding-strict-restrictions
               self localClassifiedRestrictions inheritedRestrictions))
	;; clip out any default features that conflict with strict features
	(setq survivingRestrictions
	      (loop for defaultRes
		    in (append
			;; BUG: local local restrictions marked as :redundant
			;;    get eliminated during the classification
			localClassifiedRestrictions
			inheritedRestrictions
			)
		    unless (default-feature-collides-with-strict-feature-p
			     defaultRes strictRestrictions)
		    collect
                    (progn
		      (addf (non-tbox-dependents defaultRes) self)
		      defaultRes)))
	(setf (default-features self)
	      (bag-append
               survivingRestrictions
               (compute-surviving-comparisons localComparisons inheritedComparisons)))
	(setf (default-concepts self)
	      (most-specific-concepts
               (loop for prim in (append localPrimitives inheritedPrimitives)
                    unless (or (disjoint-concepts-p strictConjunct prim)
                               (subconcept-p strictConjunct prim))
                    collect prim))) ))))

(defun condition-defaults-cheaply-p (self)
  ;; If "self" has no local defaults and no local restrictions and only one
  ;;    parent, then just inherit defaults from that parent and return t;
  (let ((parent (first (super-concepts self))))
    (when (and (null (default-features self))
               (null (default-concepts self))
               (null (rest (super-concepts self)))
               parent
               (set-equal-p (implied-restrictions self)
                            (implied-restrictions parent))
               (set-equal-p (consequents self)          ; RMM 8/11/93
                            (consequents parent)))
      (setf (default-features self) (default-features parent))
      (setf (default-concepts self) (default-concepts parent))
      t) ))    

(defun possibly-colliding-strict-restrictions 
       (self localDefaults inheritedDefaults)
  ;; Helping function for "condition-defaults";
  ;; Return only those implied restrictions of "self" that might
  ;;    interact with "localDefaults" or "inheritedDefaults";
  (let ((strictRestrictions (implied-restrictions self)))
    (cond
     (localDefaults strictRestrictions)
     (inheritedDefaults
      (if (rest (super-concepts self))
        strictRestrictions
        (let ((inheritedStrictRestrictions
               (implied-restrictions (first (super-concepts self)))))
          (if (or (eq strictRestrictions inheritedStrictRestrictions)
                  (set-equal-p strictRestrictions inheritedStrictRestrictions))
            nil
            (set-difference strictRestrictions inheritedStrictRestrictions)))))
     (t nil)) ))

(defun extract-local-defaults (concept)
  ;; Extract features and primitive concepts from the source definitions
  ;;    in "(default-concepts concept)" and "(default-features concept)";
  ;; Return two values:
  ;;    (1) a list of local local restrictions;
  ;;    (2) a list of local primitive concepts;
  ;; A primitive concept in the list contributes both itself and
  ;;    its TBox restrictions;
  ;; A defined concept in the list contributes its local TBox restrictions
  ;;    and any features defined for its super concepts (recursively);
  ;; Note: "form-local-restrictions-from-source-restrictions" marks
  ;;    null lower bounds, null upper bounds, and null value restrictions
  ;;    by placing :redundant in the slot "classified-xxx";
  ;; TO DO: FIGURE OUT IF WE SHOULD BE USING "cmpInducedRestrictions"
  ;;    PRODUCED WHILE CONDITIONING COMPARISONS;
  ;; TO DO: FIGURE OUT DEFAULT COMPARISONS IN GENERAL;
  (when (and (null (default-features concept))
             (null (default-concepts concept)))
    (return-from extract-local-defaults (values nil nil nil)))
  (let ((sourceFeatures (default-features concept))
	(*conceptBeingConditioned* concept)
	(primitives nil)
        (classifiedComparisons nil)
	localRestrictions)
    (declare (special *conceptBeingConditioned*))
    (labels ((extract-defaults-from-concept (concept)
               (when (comparisons concept)
	         (setq classifiedComparisons
		       (bag-append (comparisons concept)
                                   classifiedComparisons)))
	       (if (primitive-p concept)
		   (push concept primitives)
		   (loop for s in (super-concepts concept)
			do (extract-defaults-from-concept s)))))
      (loop for item in (default-concepts concept)
	   do (extract-defaults-from-concept item))
      (when (or classifiedComparisons
		(member :relates sourceFeatures :key #'car))
	;; condition and classify source comparisons, and combine them
	;;    with any extracted classified comparisons:
	(setq classifiedComparisons
	      (condition-comparisons
		concept :dbox
		:default-comparisons (loop for f in sourceFeatures
					  when (eq (car f) :relates)
					  collect f)))
	(delf sourceFeatures :relates :key #'car))
      ;; at this point "sourceFeatures" contains only restrictions
      (setq localRestrictions
	;; Tricky: :redundant markings for null restrictions originating
	;;    in "form-local-restrictions-from-source-restrictions"
	;;    survive the passage through "condition-restrictions":
	(condition-default-restrictions sourceFeatures))
      (values
	localRestrictions
	classifiedComparisons
	(most-specific-concepts primitives)) )))

(defun condition-default-restrictions (sourceRestrictions)
  ;; Helping function for "extract-local-defaults";
  ;; Translate default source restrictions into a list of local restictions;
  (when (null sourceRestrictions)
    (return-from condition-default-restrictions nil))
  (let (*relation/restrictionsTable* *listOfLocalRestrictions*)
    (declare (special *relation/restrictionsTable* *listOfLocalRestrictions*))
    (loop for sourceRes in sourceRestrictions
	 do (condition-one-source-restriction sourceRes :dbox))
    (form-linked-list-of-restrictions)
    ;; split multiple default value restrictions on same relation 
    ;;   into separate restrictions:
    (loop for res in *listOfLocalRestrictions*
	 when (cdr (local-value-restrictions res))
	 do
	 (loop for vr in (cdr (local-value-restrictions res))
	      do
	      (push
		(create-local-restriction
		  (local-relation res) (local-qualification res)
		  :local-value-restrictions (list vr))
		*listOfLocalRestrictions*))
	 ;; truncate all but the first value restriction:
	 (setf (cdr (local-value-restrictions res)) nil))
    (loop for res in *listOfLocalRestrictions*
	 do (condition-value-restrictions res :dbox))
    *listOfLocalRestrictions* ))

(defun extract-inherited-defaults
       (concept localLocalRestrictions localPrimitives)
  ;; Return three values:
  ;;    (1) a list of (already-classified) inherited default restrictions;
  ;;    (2) a list of inherited primitive defaults;
  ;;    (3) a list of inherited comparisons;
  ;; Collect all inherited defaults, and eliminate those that are
  ;;    overridden by a local default found in "localLocalRestrictions"
  ;;    or "localPrimitives";
  ;; Note: role fillers restrictions are handled later, and DONT get
  ;;    overridden here;
  (let (survivingInheritedPrimitives inheritedComparisons
	valueRestrictions minRestrictions maxRestrictions roleFillersRestrictions)
    (flet ((value-restrictions-collide-p
	     (valueRestriction matchingLocalRestriction)
	     ;; return t if "matchingLocalRestriction" has a value restriction
	     ;;    that overlaps with that of "valueRestriction";
	     (let ((resVr (value-restriction valueRestriction))
		   (localVr (local-value-restrictions matchingLocalRestriction)))
	       (or (subconcept-p resVr localVr)
		   (subconcept-p localVr resVr)
		   (disjoint-concepts-p resVr localVr))))
	   (inherit-default-features-with-comparisons-subtracted-out
	     ()
	     ;; Return a list of inherited default restrictions;
	     ;; Side-effect: Push any inherited default comparisons onto
	     ;;    the list "inheritedComparisons";
	     (let ((inheritedFeatures
		     (union-superc-slot-values concept default-features)))
	       (loop for f in inheritedFeatures
		    when (typep f 'COMPARISON-FEATURE)
		    do (push f inheritedComparisons))
	       (when inheritedComparisons
		 (setq inheritedFeatures
		       (loop for f in inheritedFeatures
			    unless (member f inheritedComparisons)
			    collect f)))
	       inheritedFeatures)))
      ;; first collect and partition inherited defaults into
      ;;    inherited restrictions and inherited primitives --
      ;;    overriding of inherited primitives occurs at the same time:
      (setq survivingInheritedPrimitives
	    (extract-inherited-primitives concept localPrimitives))
      (loop for res in (inherit-default-features-with-comparisons-subtracted-out)
	   unless
	   (let ((relation (relation res)))
	     (loop for localRes in localLocalRestrictions
		  thereis
		  (and (eq relation (local-relation localRes))
		       (case (feature-type res)
			 (:value-restriction
			  (or (value-restrictions-collide-p res localRes) 
			      (classified-value-restriction localRes)))	; :redundant
			 (:min-restriction
			  (or (not (zerop (local-lower-bound localRes)))
			      (classified-min-restriction localRes)))	; :redundant
			 (:max-restriction
			  (or (local-upper-bound localRes)
			      (classified-max-restriction localRes)))	; :redundant
			 (:filled-by
                          (or (local-role-fillers localRes)         ; RMM 7/17/92
                              (classified-filled-by localRes)))	; :redundant
                          ))))
	   do
	   (case (feature-type res)
	     (:value-restriction (push res valueRestrictions))
	     (:min-restriction (push res minRestrictions))
	     (:max-restriction (push res maxRestrictions))
	     (:filled-by (push res roleFillersRestrictions)))) 
      (values
	(append 
	  (most-specific-concepts maxRestrictions)
	  (most-specific-concepts minRestrictions)
	  ;; note: DON'T combine value restrictions on same relation:
	  (most-specific-concepts valueRestrictions)
          (most-specific-concepts roleFillersRestrictions))
	survivingInheritedPrimitives
        ;; NO COMPARISONS YET:
        nil
	) )))

(defun extract-inherited-primitives (concept localPrimitives)
  ;; Helping function for "extract-inherited-defaults";
  ;; Return a list of inherited default primitive concepts, omitting
  ;;    any that are overriden either by a local default primitive 
  ;;    or by a more specific inherited default primitive;
  (flet ((overrides-p
	   (concept1 concept2)
	   (and (neq concept1 concept2)
		(or (subconcept-p concept2 concept1)
		    (disjoint-concepts-p concept1 concept2))))
	 (originating-concepts
	   (default)
	   (most-specific-concepts
	     (loop for a in (all-super-concepts concept)
		  when (and (member default (default-concepts a))
			    (loop for s in (super-concepts a)
				 never (member default (default-concepts s))))
		  collect a))))	   
    (let ((candidates
	    (loop for d in (union-superc-slot-values concept default-concepts)
		 unless (loop for prim in localPrimitives
			     thereis (overrides-p prim d))
		 collect d)))
      (loop for d1 in candidates
	   unless (loop for d2 in candidates
		       thereis
		       (and (overrides-p d2 d1)
			    (loop for o1 in (originating-concepts d1)
				 always
				 (loop for o2 in (originating-concepts d2)
				      thereis
				      (subconcept-p o2 o1)))))
	   collect d1) )))

;(defun extract-inherited-role-fillers
;       (inheritedRoleFillers localLocalRestrictions strictRestrictions)
;  ;; "inheritedRoleFillers" is a list of inherited default role fillers
;  ;;    restrictions;
;  ;; Return a list of inherited restrictions that don't get overridden by
;  ;;    local role fillers restrictions from "localLocalRestrictions";
;  ;; Note: The case of two or more default role fillers trying to fit into
;  ;;    a multiple-valued role may cause incoherence, i.e., we don't try to
;  ;;    resolve it;
;  (flet ((cancelled-or-merged-p 
;	   (iRes)
;	   (let* ((iRelation (relation iRes))
;		  (matchingRes
;		    (loop for res in localLocalRestrictions
;			 thereis (and (eq (local-relation res) iRelation)
;				      (local-role-fillers res)))))
;	     (if matchingRes
;		 t ;; return cancelled or merged
;		 nil)))) ;; return survived
;    (loop for tail on inheritedRoleFillers
;	 when (cancelled-or-merged-p (car tail))
;	 do (setf (car tail) nil))
;    (delf inheritedRoleFillers nil :test #'eq) ))

(defun compute-surviving-comparisons (localComparisons inheritedComparisons)
  ;; Called by "condition-defaults";
  ;; Combine local and inherited default comparisons, eliminating duplicate and
  ;;    illegal comparisons;
  ;; Note: currently there is no override semantics for comparisons;
  (let (survivingComparisons)
    (loop for cmp in (bag-append inheritedComparisons localComparisons)
	 do
	 (if (neq (feature-type cmp) :same-as)
	     (complain "~%Eliminated illegal default comparison: `~S';~%   ~
                       Only :same-as comparisons can be used as defaults" cmp)
	     (pushnew cmp survivingComparisons)))
    survivingComparisons ))


  ;;
;;;;;; "default-feature-collides-with-strict-feature-p" methods
  ;;

;;; The "default-feature-collides-with-strict-feature-p" methods are called
;;;    by "condition-defaults" to detect default features that conflict with
;;;    strict features;
;;; Note "detect-feature/fillers-conflict-p" looks for conflicts between features
;;;    and fillers, "default-feature-collides-with-strict-feature-p" looks
;;;    for conflicts between features and features, and "detect-default-conflict-p"
;;;    looks for both kinds of conflicts, but has side-effects not found
;;;    in the others.  Hence, we seem to need three classes of methods to
;;;    somewhat similar but distinct kinds things.  Too bad.
;;; Comment: The call to "disjoint-concepts-p" may only test for disjointness
;;;    found during post-classification of the two concepts;  If this test
;;;    isn't strong enough, we may have to make compiling defaults a
;;;    separate pass AFTER completion;

(defmethod default-feature-collides-with-strict-feature-p
	   ((self VALUE-RESTRICTION) strictFeatures)
  ;; Return t if the feature "self" is incompatible with some feature in
  ;;    "strictFeatures";
  (let ((role (relation self))
	(valueRestriction (value-restriction self)))
    (loop for res in strictFeatures
	 thereis
	 (and (eq (feature-type res) :value-restriction)
	      (let ((relation (relation res)))
		(or (subconcept-p role relation)
		    (subconcept-p relation role)))
	      (disjoint-concepts-p
		valueRestriction (value-restriction res)))) ))

(defmethod default-feature-collides-with-strict-feature-p
	   ((self MIN-RESTRICTION) strictFeatures)
  ;; Return t if the feature "self" is incompatible with some feature in
  ;;    "strictFeatures";
  (let ((role (relation self))
	(lowerBound (lower-bound self)))
    (loop for res in strictFeatures
	     thereis
	     (and (eq (feature-type res) :max-restriction)
		  (subconcept-p role (relation res))
		  (< (upper-bound res) lowerBound))) ))

(defmethod default-feature-collides-with-strict-feature-p
	   ((self MAX-RESTRICTION) strictFeatures)
  ;; Return t if the feature "self" is incompatible with some feature in
  ;;    "strictFeatures";
  (let ((role (relation self))
	(upperBound (upper-bound self)))
    (loop for res in strictFeatures
	 thereis
	 (and (eq (feature-type res) :min-restriction)
	      (subconcept-p (relation res) role)
	      (> (lower-bound res) upperBound))) ))

(defmethod default-feature-collides-with-strict-feature-p
	   ((self FILLED-BY-FEATURE) strictFeatures)
  ;; Return t if the feature "self" is incompatible with some feature in
  ;;    "strictFeatures";
  ;; A conflict will occur if
  ;;    (i)  asserting the filler would violate an upper bound constraint, OR
  ;;    (ii) a filler's type conflicts with an implied value restriction;
  ;;    (iii) filler conflicts with a not-filled-by restriction.
  (let* ((role (relation self))
	 (defaultFillers (role-fillers self))
	 (fillerCount (length defaultFillers)))
    (if (role-is-single-valued-p role)
      (or (rest defaultFillers)
          (filler-conflicts-with-restriction-p
           (first defaultFillers) role strictFeatures))
      (or (loop for res in strictFeatures
                thereis (and (eq (feature-type res) :max-restriction)
                             (subconcept-p role (relation res))
                             (< (upper-bound res) fillerCount)))
          (loop for filler in defaultFillers
                thereis
                (or (filler-conflicts-with-restriction-p
                     filler role strictFeatures))))) ))


  ;;
;;;;;; Processing default queues
  ;;

;;; The special variable (default-mode-p) is bound while the default
;;;    assertion queue is being processed.  This causes all truth
;;;    maintainance to record further inferences with :default justification.
;;;     When defaults are withdrawn, anything marked as :default on an
;;;    instance is eliminated:  This includes :default conjuncts, :default
;;;    role fillers, :default role hits and misses (entries look like
;;;    "(role . :default)"), and bomb removal entries (which look like
;;;    "(:default bomb)".
;;; In default mode, the probe functions allow the closed role assumption
;;;    to apply to testing for satisfaction of :at-most and :all predicates.

(defun process-default-retraction-queue (listOfInstances)
  ;; Situation: "listOfInstances" contains a list of all instances for
  ;;    which defaults may have to be withdrawn, if they haven't been already;
  ;; Call "analyze-features" to withdraw defaults, and otherwise prepare
  ;;    each instance for default matching;
  ;; Note: This queue exists to insure that defaults are withdrawn on ALL
  ;;    instances before the first one gets default-matched;
  ;; Side-effect: Additional instances are placed on the $DEFAULT-RETRACTION-Q$
  ;;    if (1) support (a default forward inference) is withdrawn from them
  ;;    or (2) they support a default inference in a member of "listOfInstances";
  (let (modificationSummary)
    (loop for instance in listOfInstances
	 when (setq modificationSummary (modification-summary instance))
	 do
	 (unless (features-analyzed-p modificationSummary)
	   ;; note: we unconditionally move to the default assertion queue --
	   ;;    the effect of calling "analyze-features-p" is to withdraw defaults
	   ;;    or to reestablish feature bombs:
	   (analyze-features-p instance $DEFAULT-RETRACTION-Q$))
	 (repost-instance
	  instance $DEFAULT-ASSERTION-Q$ modificationSummary)) ))


(defun process-closed-world-queue (queue)
  ;; Called by "rerecognize-instances";
  ;; Process instances in "queue" with closed world semantics enabled
  ;;    BEFORE applying default rules;
  (let (modificationSummary)
    (loop for instance in queue
          when
          (and (setq modificationSummary (modification-summary instance))
               (eql (queue-level modificationSummary) $DEFAULT-ASSERTION-Q$))
          do
          (cond
	   ((incoherent-instance-p instance)
	    (abandon-recognizing-incoherent-instance instance))
	   ((not (or (features-analyzed-p modificationSummary)
		     (analyze-features-p instance $DEFAULT-ASSERTION-Q$)))
	    ;; "instance" is skipping rematch at all queue levels:
	    (unpost-instance instance))
           (t
            (recompute-asserted-instance-type-p instance)
            (when (incoherent-instance-p instance)
              (abandon-recognizing-incoherent-instance instance))))) ))

(defun process-default-assertion-queue (queue)
  ;; Situation: "queue" contains a list of all instances which
  ;;    MAY have defaults that can be activated;
  ;; Activate defaults attached to instances in "queue" which
  ;;    don't conflict with existing truth values;
  ;; Note: The slots "active-default-concepts" and "inactive-defaults"
  ;;    are used only within this function;  The slot "active-default-features"
  ;;    is also used by "compute-residue-features-p";
  (let (modificationSummary repostToSameQueueP defaults)
    (flet ((collect-default-rules (instance)
	     (let ((type (db-type instance))
		   newDefaults)
	       (integrity-check (atom type))                ; TAR 2/7/95
	       (loop for default in (default-features type)
		    unless
		    (or (member default (active-default-features modificationSummary))
			(member default (inactive-defaults modificationSummary)))
		    do
		    (if (detect-default-conflict-p default instance)
			(push default (inactive-defaults modificationSummary))
			(progn
			  (push default (active-default-features modificationSummary))
			  (push default newDefaults))))
	       (loop for default in (default-concepts type)
		    unless
		    (or (member default (active-default-concepts modificationSummary))
			(member default (inactive-defaults modificationSummary)))
		    do
		    (if (detect-default-conflict-p default instance)
			(push default (inactive-defaults modificationSummary))
			(progn
			  (push default (active-default-concepts modificationSummary))
			  (push default newDefaults))))
	       newDefaults)))
    (loop for instance in queue
	 when
	 (and (setq modificationSummary (modification-summary instance))
	      (eql (queue-level modificationSummary) $DEFAULT-ASSERTION-Q$))
	 do
	 (cond
	   ((incoherent-instance-p instance)
	    (abandon-recognizing-incoherent-instance instance))
	   ((not (or (features-analyzed-p modificationSummary)
		     (analyze-features-p instance $DEFAULT-ASSERTION-Q$)))
	    ;; "instance" is skipping rematch at all queue levels:
	    (unpost-instance instance))
	   (t (when (setq defaults (collect-default-rules instance))
		(loop for default in defaults
		     do (apply-default default instance)))
	      (setq repostToSameQueueP
		    (recompute-asserted-instance-type-p instance))
	       ;; Could have become incoherent during recomputation of type.
	      (when (incoherent-instance-p instance)
		(abandon-recognizing-incoherent-instance instance)
		(return-from process-default-assertion-queue nil))
	      (when (null repostToSameQueueP)
		;; we are leaving the default assertion queue -- replant
		;;    bombs on default hits and misses;
		(loop for f in (default-feature-hits modificationSummary)
		     do (monitor-feature instance f t))
		(loop for f in (default-feature-misses modificationSummary)
		     do (monitor-feature instance f t))
		(setf (default-feature-hits modificationSummary) nil)
		(setf (default-feature-misses modificationSummary) nil))		 
	      (cond
		(repostToSameQueueP
		 (repost-instance
		   instance $DEFAULT-ASSERTION-Q$ modificationSummary))
		((incoherent-instance-p instance)
		 (abandon-recognizing-incoherent-instance instance))
		((neq (original-type modificationSummary) (db-type instance))
		 (detonate-type-bombs-on-new-conjuncts
		   instance (db-type instance) (strict-db-type instance))
		 (repost-instance instance $ACT-ON-Q$ modificationSummary))
		(t
		 ;; for checking detonation, catch possibility that type of "instance" has
		 ;;    not changed, but probe made by another instance failed, and hence
		 ;;    bomb was attached to "instance" in the middle of the match cycle:
		 (detonate-type-bombs-on-new-conjuncts
		   instance (db-type instance) (strict-db-type instance))
		 (unpost-instance instance)))))) )))


  ;;
;;;;;; Support functions for retracting defaults
  ;;

;;; These methods take short-cuts not available in ordinary retraction,
;;;    so several of the general purpose retraction functions get
;;;    redefined here.

(defun withdraw-defaults (instance)
  ;; Withdraw all default inferences that apply to "instance":
  ;;    Remove conjuncts having (only) default support;
  ;;    Set the slot "db-type" to "strict-db-type";
  ;;    Withdraw forward inferences;
  ;;    Detonate conflict dependency bombs;
  ;; Recursively withdraw defaults from other instances receiving default
  ;;    support from "instance";
  ;; TO DO: "recompute-retracted-instance-type" CALLS "withdraw-defaults"
  ;;    and ALSO CALLS "detonate-type&conflict-bombs" DIRECTLY. TRY
  ;;    TO OPTIMIZE THIS TO ONLY ONE CALL;
  ;; TO DO: SEE IF WE CAN SPEED UP DETONATION OF DEFAULT BOMBS;
  (flet ((withdraw-default-conjuncts ()
	   ;; Eliminate default entries from the conjuncts table for "instance";
	   (let (strictEntries conjunctRecord)
	     (loop for entry in (conjuncts-table instance)
		  do
		  (setq conjunctRecord (cdr entry))
		  (if (default-p conjunctRecord)
		      ; (setf (default-p conjunctRecord) nil)  ; CTXXX
		      (discard-conjunct-support-record conjunctRecord)
		      (push entry strictEntries)))
	     (setf (conjuncts-table instance) strictEntries) ; CTXXX
	     )))
    ;; remove all default bombs that originate at "instance":
    (deactivate-all-bombs-at-originator instance :defaults-only-p t)
    (withdraw-default-role-fillers instance)
    (withdraw-default-forward-inferences instance)
    (let ((oldType (db-type instance))
	  ;; note: "recompute-asserted-instance-type" sets the slot "strict-db-type":
	  (strictType (strict-db-type instance)))
      (when (neq strictType oldType)
	(when (loop for entry in (conjuncts-table instance)
		   thereis (default-p (cdr entry)))
	  (withdraw-default-conjuncts))
	(setf (db-type instance) strictType) 
	;; detonate any type-bombs created during default mode:
	(detonate-type&conflict-bombs instance strictType :retraction t))) ))

(defun withdraw-default-role-fillers (instance)
  ;; Helping function for "withdraw-defaults";
  ;; Delete all default role fillers from "instance";
  ;; Post default fillers on default retraction queue unless they are
  ;;    still supported;
  ;; Comment: Role fillers applied by "apply-strict-role-fillers" while
  ;;    in default mode get withdrawn here;
  (loop for entry in (role-fillers-table instance)
       do
       (let ((fillersRecord (cdr entry)))
	 (loop for filler in (default-fillers fillersRecord)
	      do (retract-role-filler instance (car entry) filler :default)))) )

(defun withdraw-default-forward-inferences (instance)
  ;; Withdraw forward inferences that no longer apply now that the
  ;;    the type of "instance" has been down graded;
  ;; "cumulative-value-restrictions" contains all value restrictions
  ;;    that previously applied to "instance";
  ;; Strategy: Withdraw any cumulative value restrictions not also
  ;;    found in the strict cumulative value restrictions;
  (let ((strictCumulativeValueRestrictions
	  (strict-cumulative-value-restrictions instance))
	concept)
    (loop for res in (cumulative-value-restrictions instance)
	when (and (not (discarded-p res))   ;; How does this happen?? ; TAR 4/21/98
		  (not (member res strictCumulativeValueRestrictions)))
	do (setq concept (value-restriction res))
	   (loop for filler in (collect-all-role-fillers instance (relation res))
	       do (retract-default-conjunct filler concept)))
    (setf (cumulative-value-restrictions instance)
	  strictCumulativeValueRestrictions) ))

(defmethod retract-default-conjunct ((instance DB-INSTANCE) conjunct)
  ;; Record the default retraction, and test for posting on the queue of
  ;;    modified loom instances;
  (when (delete-from-conjuncts-table-p instance conjunct :default)
    (post-non-analyzable-modified-instance instance :retraction t)) )

(defmethod retract-default-conjunct (instance conjunct)
  ;; Nothing happens when we retract a default conjunct from a
  ;;    non db-instance;
  (declare (ignore instance conjunct))
  nil )


  ;;
;;;;;; Support methods for asserting defaults
  ;;

;;; Apply the default "default" to the instance "instance", i.e.,
;;;    assert (in default mode) its logical equivalent;
;;; Side-effect: Propagate value restriction defaults to role fillers;
;;;    Note: we propagate here because regular propagation only happens
;;;    if the type of "instance" changes;

(defmethod apply-default ((default UNARY-ENTITY) instance)
  ;; Helping method  for "process-default-assertion-queue";
  ;; Note: (default-mode-p) overrides :default justification:
  (assert-conjunct instance default :default) )


(defmethod apply-default ((default FILLED-BY-FEATURE) instance)
  ;; Helping method  for "process-default-assertion-queue";
  (loop for filler in (role-fillers default)
       do
       (assert-role-filler
	 instance (relation default) filler :default)) )

(defmethod apply-default ((default RESTRICTION-FEATURE) instance)
  ;; Helping method  for "process-default-assertion-queue";
  ;; TO DO: CONSIDER ADDING RECORD OF DEFAULT HIT SOMEWHERE;
  (grumble "Loom doesn't know how to reason with default ~A~%   ~
            of type ~A. The problem was detected on instance ~S.~%   ~
  Loom will ignore this restriction in its reasoning.~%      ~
  Most likely cause: some concept to which the instance belongs specifies~%   ~
 this default.  The restriction could also be implicit in a default :some~%   ~
 or :the restriction.  You can eliminate this warning by changing the~%   ~
  concept definition." default (feature-type default) instance)
 ; (push default (default-feature-hits (modification-summary instance)))
  )

(defmethod apply-default ((default VALUE-RESTRICTION) instance)
  ;; Helping method  for "process-default-assertion-queue";
  (push default (default-feature-hits (modification-summary instance)))
  (propagate-forward-inferences instance (list default)) )



  ;;
;;;;;; "detect-default-conflict-p" methods
  ;;

(defmethod detect-default-conflict-p ((default UNARY-ENTITY) instance)
  ;; Helping method for "process-default-assertion-queue";
  ;; Return t if "default" is inconsistent with "instance";
  ;; We test:
  ;;    (1) If "default" is disjoint from concepts in "(db-type instance)", OR
  ;;    (2) If the implied restrictions attached to "default" conflict
  ;;        with asserted or strictly inherited restrictions on "instance";
  ;;    (3) If a value restriction attached to "default" conflicts with
  ;;        a filler of the corresponding role;
  ;;    (4) If "default" is a subtype of an asserted Negation concept of "instance";
  (or (disjoint-concepts-p (strict-db-type instance) default)
      (loop for feature in (implied-restrictions default)
	  thereis (detect-default-conflict-p feature instance))
      (loop for concept in (asserted-negations instance) ; TAR 9/9/97
	  thereis (subconcept-p default concept))) )

(defmethod detect-default-conflict-p ((self VALUE-RESTRICTION) instance)
  ;; Helping method for "process-default-assertion-queue";
  ;; Return t if "self" conflicts with some asserted or strictly inherited
  ;;    restriction of "instance", or with the fillers of the corresponding role;
  (let ((role (relation self))
	(valueRestriction (value-restriction self)))
    (flet ((conflicting-value-restriction-p
	     (restrictions)
	     (loop for res in restrictions
		  thereis (and (eq (feature-type res) :VALUE-RESTRICTION)
			       (let ((relation (relation res)))
				 (or (subconcept-p role relation)
				     (subconcept-p relation role)))
			       (disjoint-concepts-p
				valueRestriction (value-restriction res))))))
      (or (conflicting-value-restriction-p 
	   (implied-restrictions (strict-db-type instance)))
	  (conflicting-value-restriction-p (asserted-features instance))
	  (loop for filler in (collect-all-role-fillers instance role)
	       when (and (not-has-instance-p valueRestriction filler)
			 (classified-instance-p filler))
	       do (plant-conflict-bomb
		   instance self :type-propagation t valueRestriction t filler)
		  (return t))) )))

(defmethod detect-default-conflict-p ((self MIN-RESTRICTION) instance)
  ;; Return t if "self" conflicts with an asserted or strictly inherited
  ;;    upper bound restriction;
  (let ((role (relation self))
	(lowerBound (lower-bound self)))
    (flet ((conflicting-max-restriction-p
	     (restrictions)
	     (loop for res in restrictions
		  thereis
		  (and (eq (feature-type res) :max-restriction)
		       (subconcept-p role (relation res))
		       (< (upper-bound res) lowerBound)))))
      (conflicting-max-restriction-p
	(implied-restrictions (strict-db-type instance)))
      (conflicting-max-restriction-p (asserted-features instance)) )))

(defmethod detect-default-conflict-p ((self MAX-RESTRICTION) instance)
  ;; Helping method for "process-default-assertion-queue";
  ;; Return t if "self" conflicts with an asserted or strictly inherited
  ;;    lower bound restriction, or
  ;;    with the number of fillers on the corresponding role;
  ;; Side-effect: If too many fillers detected, monitor feature "self"
  ;;    to catch later role retractions;
  (let ((role (relation self))
	(upperBound (upper-bound self)))
    (flet ((conflicting-min-restriction-p
	     (restrictions)
	     (loop for res in restrictions
		  thereis
		  (and (eq (feature-type res) :min-restriction)
		       (subconcept-p (relation res) role)
		       (> (lower-bound res) upperBound)))))
      (or (conflicting-min-restriction-p
	    (implied-restrictions (strict-db-type instance)))
	  (conflicting-min-restriction-p (asserted-features instance))
	  (when (> (length (collect-all-role-fillers instance role)) upperBound)
	    (plant-trigger-role-bomb 
	      instance (relation self) self t t :if-removed-p t)
	    t)) )))

(defmethod detect-default-conflict-p ((self FILLED-BY-FEATURE) instance)
  ;; Determine whether assuming the default fillers specified by "self"
  ;;    on "instance" would cause a contradiction;
  ;; A conflict will occur if
  ;;    (i)  asserting the fillers would violate an upper bound constraint, OR
  ;;    (ii) a filler's type conflicts with an implied value restriction;
  ;; Side-effect: If too many fillers detected, monitor feature "self"
  ;;    to catch later role retractions;
  ;; TO DO: FIGURE OUT IF WE NEED QUALIFIED FILLED BY'S;
  (let ((role (relation self))
	(defaultFillers (role-fillers self))
	(strictRestrictions
	  (bag-append
	    (asserted-features instance)
	    (implied-restrictions (strict-db-type instance))))
	existingFillers)
    ; (when (more-restrictive-defined-range self)		; TAR 10/31/91
    ;   (error "LOOM BUG: RANGE RESTRICTION ON FILLED-BY FEATURE NOT ELIMINATED"))
    (setq existingFillers (collect-all-role-fillers instance role))
    (cond
      ((role-is-single-valued-p role)
       (if existingFillers
	   (progn
	     (plant-trigger-role-bomb 
	       instance (relation self) self t t :if-removed-p t)
	     t)
	   (progn 
	     (integrity-check (null (rest defaultFillers)))
	     (filler-conflicts-with-restriction-p
	       (first defaultFillers) role strictRestrictions))))
      ((prove-at-most-k-p
	 instance role
	 (1- (+ (length existingFillers) (length defaultFillers)))
	 existingFillers nil)
       ;; the existing and default fillers don't all fit:
       (plant-trigger-role-bomb 
	 instance (relation self) self t t :if-removed-p t)
       t)
      (t
       ;; there's enough room, so check types of fillers:
       (loop for filler in defaultFillers
	    thereis (filler-conflicts-with-restriction-p
		      filler role strictRestrictions)))) ))

(defmethod detect-default-conflict-p ((self COMPARISON-FEATURE) instance)
  ;; Helping method for "process-default-assertion-queue";
  ;; Situation: "self" is a default :same-as comparison that is being
  ;;    tested to see if its application to "instance" would generate a conflict;
  ;; Return t if both role-chains of "self" are filled, and the fillers
  ;;    are not identical (i.e., the values conflict);
  ;; Note: The default fails if the fillers are two skolems, or a skolem
  ;;    and an instance, because we must avoid merging the skolem (because
  ;;    we don't know how to unmerge it);
  ;; Note: We borrowed code form "probe-comparison-p";
  ;; Side-effect: If too many fillers detected, monitor feature "self"
  ;;    to catch later role retractions (WHERE DOES THIS HAPPEN??!!)
  ;; BUG: WE DON'T YET GENERATE ANY TMS STRUCTURES TO RECOGNIZE WHEN
  ;;    CONFLICT GOES AWAY;
  (multiple-value-bind (closedSetP fillers1)
      (apply-rolechain-role-to-instance (first (roles self)) instance)
    (declare (ignore closedSetP))
    (multiple-value-bind (closedSetP fillers2)
	(apply-rolechain-role-to-instance (second (roles self)) instance)
      (declare (ignore closedSetP))
      (or (null fillers1)
	  (null fillers2)
	  (eq fillers1 fillers2)) )))

(defun filler-conflicts-with-restriction-p
       (filler role listOfRestrictions)
  ;; Helping function for "FILLED-BY-FEATURE.detect-default-conflict-p" and
  ;;    "FILLED-BY-FEATURE.default-feature-collides-with-strict-feature-p";
  ;; Return t if the type of "filler" conflicts with one of the implied
  ;;    value restrictions or not-filled-by restrictions attached to "instance";
  
  (loop for res in listOfRestrictions
        thereis
        (and (subconcept-p role (relation res))
             (case (feature-type res)
               (:value-restriction
                (not-has-instance-p
                 (value-restriction res) filler))
               (:not-filled-by
                (member filler (non-role-fillers res) :test #'filler-equal))
               (otherwise nil)))) )


;;; REVISION IN SEMANTICS:

#|

IMPLEMENT THE FOLLOWING OPTIONS:

UPON DETECTING CONFLICT BETWEEN TWO DEFAULTS:
   PICK SHORTEST PATH, OR
   ASK USER, OR
   CALL USER-DEFINED PROCEDURE, OR
   DON'T APPY EITHER (SKEPTICAL), OR
   PICK ONE AT RANDOM, OR
   GENERATE A CONFLICT

GENERATE A WARNING MESSAGE WHEN DEFAULTS ARE CHOSEN USING SHORTEST PATH!!!

|#

;;; TO DO:

#|

WHEN STRICT INFERENCE CAUSES INCOHERENT ROLE FILLER
(POSSIBLY SELF GETS MARKED INCOHERENT INSTEAD), FIGURE OUT HOW
TO FIND OFFENDING FILLER, AND WITHDRAW ITS DEFAULTS.

OPTIMIZATION: IN "withdraw-defaults" SEE IF WE CAN SPEED UP DETONATION
OF DEFAULT BOMBS, LOOKING FOR A SPECIAL MARK ON THE BOMB INSTEAD OF
TESTING THE BOMBS' TYPES; POSSIBLY THIS ISN'T FEASIBLE, SINCE THE
INSTANCE'S "rock-bottom-type" MAY HAVE CHANGED.

|#
