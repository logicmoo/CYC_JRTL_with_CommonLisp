
;;; DO NOT DELETE!!!
;;; IDEAS TO BE TRIED OUT WHEN HORN LOGIC IS REWRITTEN/FINISHED

(defstruct (MODIFICATION-SUMMARY (:conc-name nil) #-ti (:type VECTOR))
           queue-level
	   to-be-probed-feature-hits
	   to-be-probed-feature-misses
	   newly-detected-feature-hits
	   original-type
	   real-conditioned-restrictions
	   default-role-hits
	   default-role-misses
	   active-default-features
	   active-default-concepts
	   inactive-defaults
	   never-before-matched-p
	   rock-bottom-p
	   recompute-retracted-type-p
	   recompute-asserted-type-p
	   analyze-defaults-p
	   recompute-default-type-p
	   real-conditioned-comparisons		; MOVE UNDER "real-conditioned-restrictions"
	   old-conditioned-restrictions		; MOVE UNDER           ''
	   current-goal-concepts
	   processed-goal-concepts
	   )






(defun exhaustive-proof-of-concept-membership-p (concept instance)
  ;; Return t if "instance" can be proved to belong to "concept",
  ;;    using a speading activation search;
  ;; DISCLAIMER: Currently the search is limited by disallowing type
  ;;    computations on instances other than "instance";
  ;; DISCLAIMER:  Cut-off via a disproof has not yet been implemented;
  ;; TO DO: FIX DISCLAIMERS; OR ELSE ADD OPTION THAT AVOIDS CALLING
  ;;    "set-up-classification-flags" TWICE, HERE AND IN
  ;;    "quick-proof-of-concept-membership-p";
  ;; BUG: THIS WON'T MATCH CORRECTLY IF "concept" has :datatype ATTRIBUTE, OR
  ;;    IS BELOW A :datatype CONCEPT;

  ;; EXIT RETURNING FALSE: INFINITE LOOP GENERATED BECAUSE "instance" SHOULD
  ;;    MARK ONLY THOSE BC CONCEPTS THAT IT IS SURE IT WANTS MATCHED, AND
  ;;    "concept" SHOULD NOT BE AMONG THOSE MARKED -- RIGHT
  ;;    NOW IT RECURSIVELY TRIES TO MATCH AGAINST "concept";
  (return-from exhaustive-proof-of-concept-membership-p nil)
  ;; ADD QUICK EXIT IF :computed CONCEPT WITH NO ANTECEDENTS;

  (let ((modificationSummary
	 (find-or-create-modification-summary instance)))
    (post-instance instance $STRICT-ASSERTION-Q$)
    (push concept (current-goal-concepts modificationSummary))

    "now what?"

    (let ((wasInDefaultModeP *default-mode-p*)
	  bcType)
      (setq *default-mode-p* t)
      (setq bcType (compute-more-specific-type instance))
      (prog1
	  (type-specializes-concept-p bcType concept)
	(setq *default-mode-p* wasInDefaultModeP)) )))



;; types.lisp:
(defmethod compute-more-specific-type 
	   ((instance DB-INSTANCE))
  ;; Compute the "most-specific-generalization" of "instance", i.e.,
  ;;    return a list of the most-specific among all concepts which
  ;;    subsume "instance";
  ;; If "backward-chaining-p", match against concepts marked "backward-chaining-p"
  ;;    as well as forward-chaining concepts;
  ;; Note:  The starting type is computed by combining both the current type and
  ;;     the conjuncts (forward-propagation could have created conjuncts not
  ;;     specialized by the current type);  "conjuncts" appear at the end of the
  ;;     list to exploit the possibility that they will all be marked as "visited"
  ;;;    when they are encountered inside of "set-up-classification-flags";
  (let ((startingType
	  (append (db-type instance) 
		  (for entry in (conjuncts-table instance)
		       collect (implied-concept (car entry))))))
    (when (null (conditioned-restrictions instance))
      ;; establish initial value for "(conditioned-restrictions instance)":
      ;; (happens only if we did not check for incoherence during retraction)
      ;; TO DO: what should we do if incoherence is detected here?
      (multiple-value-bind (newRestrictions newEquivalences incoherentP)
	  (compute-conditioned-restrictions-p instance)
	(setf (conditioned-restrictions instance) newRestrictions)
	(setf (conditioned-comparisons instance) newEquivalences)))
    (set-up-classification-flags instance :parents startingType)
    (let ((*matchBackwardChainingConceptsP*
	    (current-goal-concepts (modification-summary instance))))
      (declare (special *matchBackwardChainingConceptsP*))
      (most-specific-concepts
	(for c in (classify-below
		    instance
		    startingType
		    (compute-starting-points instance)
		    :compute-msg-only t)
	     collect (implied-concept c)))) ))

;; metabox.lisp:
(defmethod compute-more-specific-type
	   ((instance TBOX-CONCEPT))
  ;; Compute the "most-specific-generalization" of "instance", i.e.,
  ;;    return a list of the most-specific among all concepts which
  ;;    subsume "instance";
  ;; Situation: "instance" is a meta-thing that resides both in the
  ;;    TBox and the ABox;
  ;; Strategy:
  ;;    Copy the slots of "instance" into a dummy instance;
  ;;    Call "compute-type-of-db-instance" on the dummy;
  ;;    Copy dummy's "db-type" back into "instance";
  (let ((dummy (make-instance 'DUMMY-META-INSTANCE
				    :real-meta-instance instance)))
    (copy-db-instance-slots instance dummy)
    ))
