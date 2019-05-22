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

;;; MODIFY.LISP (ABOX)

;;; Contains routines for asserting and retracting to/from the database;
;;; The code is partitioned to account for assertion/retraction of
;;;    (1) roles,
;;;    (2) features (i.e., restrictions and comparisons)
;;;    (3) conjuncts (i.e., unary predicates).


(in-package "LOOM")

;(export '())


  ;;
;;;;;; "assert-role-filler" and "retract-role-filler"
  ;;

;;; "assert-role-filler" is the top-level entry that adds a new role filler to
;;;    an instance.  In order to allow for the possibility of inverse links,
;;;    the actual workhorse method is "assert-half-role-filler".

(defun assert-role-filler (instance role filler justification)
  ;; Assert to the database that "filler" is a filler of "role" of "instance";
  (when (null role)
    (complain "~%Attempt to assert ~A to NIL role on ~A" filler instance)
    (return-from assert-role-filler nil))
  #L:trace-modify (trace-values "assert-role-filler" instance role filler justification)
    (if (eq justification :assertion)
      (execute-in-contexts-depth-first
       ;; get context sensitive old value:
       (assert-half-role-filler
            instance role filler (get-slot-value instance role) justification)
       (assert-inverse-half-role-filler filler role instance justification))
      ;; derived fillers happen in a single context:
      (progn
        (assert-half-role-filler
            instance role filler (get-slot-value instance role) justification)
        (assert-inverse-half-role-filler filler role instance justification))) )

(defun retract-role-filler
       (instance role filler justification &key dont-retract-domain-conjunct-p)
  ;; Retract from the database that "filler" is a filler of "role" of "instance";
  ;; "dont-retract-domain-conjunct-p" indicates that retraction of a domain
  ;;    membership inference should be blocked.
  (when (null role)
    (complain "~%Attempt to retract ~A from NIL role on ~A" filler instance)
    (return-from retract-role-filler nil))
  #L:trace-modify (trace-values "retract-role-filler" instance role filler justification)
  (if (eq justification :retraction)
    (execute-in-contexts-depth-first
     ;; get context sensitive old value:
     (let ((*dontRetractDomainConjunctP* dont-retract-domain-conjunct-p))
       (declare (special *dontRetractDomainConjunctP*))
       (retract-half-role-filler 
        instance role filler (get-slot-value instance role) justification))
     (retract-inverse-half-role-filler filler role instance justification))
    ;; derived fillers happen in a single context:
    (progn
      (let ((*dontRetractDomainConjunctP* dont-retract-domain-conjunct-p))
        (declare (special *dontRetractDomainConjunctP*))
        (retract-half-role-filler 
         instance role filler (get-slot-value instance role) justification))
      (retract-inverse-half-role-filler filler role instance justification))) )


  ;;
;;;;;; Role bomb scanning 
  ;;

;;; Each LOOM  instance keeps two lists called "if-added-bombs" and
;;; "if-removed-bombs" which are association lists matching relations
;;; (roles) with trigger-role records;

(defun scan-trigger-role-bombs (instance role assertion/retraction)
  ;; Scan the lists of if-added-bombs and if-removed-bombs and call
  ;;    "post-role-modified-instance" on any role bombs that match
  ;;    "role";
  ;; Delete all entries that are triggered -- these role bombs
  ;;    are reestablished by "analyze-features" or during the match, EXCEPT
  ;;    don't delete strict bombs in default mode;
  (let ((topMostRoleP (eq (first (super-concepts role)) *binary-tuple*))
        (entriesToBeDeleted nil)
	triggerRecord)
    (loop for entry in (case assertion/retraction
		         (:assertion (if-added-bombs instance))
		         (:retraction (if-removed-bombs instance)))
          as triggerRole = (car entry)
	  do
	  (when (if topMostRoleP
                  (eq role triggerRole)
                  (subconcept-p role triggerRole))
	    (setq triggerRecord (cdr entry))
	    (when (trigger-record-strict-features triggerRecord)
	      (post-modified-instance
	       instance (trigger-record-strict-features triggerRecord)
	       t     ;  "wasSatisfiedP" can't be inferred, so be conservative
	       nil))				; "defaultP"
	    (when (trigger-record-default-hits triggerRecord)
	      (post-modified-instance
	       instance (trigger-record-default-hits triggerRecord)
	       t t)				; "wasSatisfiedP" "defaultP"
              (setf (trigger-record-default-hits triggerRecord) nil))
	    (when (trigger-record-default-misses triggerRecord)
	      (post-modified-instance
	       instance (trigger-record-default-misses triggerRecord)
	       nil t)				; "wasSatisfiedP" "defaultP"
              (setf (trigger-record-default-misses triggerRecord) nil))
	    (loop for bomb in (trigger-record-remote-bombs triggerRecord)
		  do (detonate-remote-role-bomb bomb))
            ;; discard default-only bombs, but if we are in default mode,
            ;;    then preserve bombs containing strict triggers:
            (when (or (not (default-mode-p))     ; RMM 3/3/94
                      (and (null (trigger-record-strict-features triggerRecord))
                           (null (trigger-record-remote-bombs triggerRecord))))
	      (push entry entriesToBeDeleted ))))
    (case assertion/retraction
      (:assertion
       (removef-members (if-added-bombs instance) entriesToBeDeleted))
      (:retraction 
       (removef-members (if-removed-bombs instance) entriesToBeDeleted))) ))

;;; Specialized function and macro called inline inside of "assert-half-role" and
;;;    "retract-half-role";

(defun update-query-indices (instance role filler assertion/retraction)
  ;; Helping function for "assert-half-role-filler" and "retract-half-role-filler";
  ;; Piggy back this on this particular bottleneck.  Ensures that time
  ;;   will advance after changes to role values:
  (setq *match-is-pending-p* t)   ; Make sure we advance time. ; TAR 2/2/98

  ;; Update any query indices attached to "role";
  (loop for index in (query-indices role)
        when (or (blanket-index-p index)
                 (subconcept-p 
                  (intrinsic-concept instance) (indexed-concept index)))
        do (update-query-index
            index instance role filler assertion/retraction)) )

(defmacro filler-matches-old-filler-p (role filler oldValue &key force-list-test-p)
  ;; Specialized macro for use inside of "assert-role-filler" and friends;
  ;; Return t if "filler" equals or is a member of the role fillers represented
  ;;    in "oldValue";
  (if force-list-test-p
      #-:measures
      `(member ,filler ,oldValue :test #'EQUAL)
      #+:measures
      `(member ,filler ,oldValue :test #'MS:DIM-EQUAL)
    #-:measures
    `(if (or (atom ,oldValue)
	     (role-is-single-valued-p ,role))
	 (equal ,filler ,oldValue)
       (member ,filler ,oldValue :test #'EQUAL))
    #+:measures
    `(if (or (atom ,oldValue)
	     (role-is-single-valued-p ,role))
	 (ms:dim-equal ,filler ,oldValue)
       (member ,filler ,oldValue :test #'MS:DIM-EQUAL))))


  ;;
;;;;;; Role Assertion
  ;;

(defmethod assert-inverse-half-role-filler
           ((filler DB-INSTANCE) role instance justification)
  ;; Assert the inverse role relationship, if one exists, that "instance" is
  ;;    a filler of the inverse of "role" in the instance "filler".
  (let ((inverseRole (inverse role)))
    (if (inverse role)
      (assert-half-role-filler
       filler inverseRole instance
       (get-slot-value filler inverseRole) justification)
      (progn
        (assert-phantom-inverse-role-filler filler role instance)
        ;;  If there is no inverse role, assert implied range to be a conjunct of
        ;;     "filler":
	(cond ((eq (implied-range role) *Thing*) nil)
	      ((eq (implied-range role) (loom-constant INCOHERENT))
	       (mark-instance-incoherent filler
		   (format nil "~S was asserted to be the filler of ~S on ~S and the range of ~S is INCOHERENT." filler role instance role)))
	      (t (assert-conjunct filler (implied-range role) :domain/range))))) ))

(defmethod assert-half-role-filler
           ((instance DB-INSTANCE) role filler oldValue justification)
  ;; Assert to the database that "filler" is a filler of "role" of "instance".
  ;; "assert-role-filler" is responsible for asserting the inverse link,
  ;;    if there is one;
  ;; Notify the TMS of changes which it needs to know about;
  (let ((mergedInstance (womp-merge-pointers instance)))
    (when (neq mergedInstance instance)
      (setq instance mergedInstance)
      (when (not (classified-instance-p instance))
        (assert-half-role-filler instance role filler oldValue justification)
        (return-from assert-half-role-filler nil))))
  ;; Tricky:  Need to use a low-level slot-value access because single-valued
  ;;   roles could have multiple-values if the instance is incoherent;
  (setq oldValue (access-in-ctxt (dynamic-slot-value instance (name role))
				 nil
				 (home-ctxt instance)))
  (setq filler (womp-merge-pointers filler))
  (when (member filler oldValue :test #'filler-equal)
    (when (eq justification :assertion)
      (insure-asserted-role-filler instance role filler))
    (return-from assert-half-role-filler nil))
  (help-assert-half-role-filler instance role filler oldValue justification)
  ;; infer skolem fillers along the role-chain of compositions:
  (when (and *monotonic-mode-p*
             (eq (defined-as role) :composition)
             (role-is-single-valued-p role))
    (infer-component-fillers instance role filler justification))
  ;; assert support for implied domain to be a conjunct of "instance",
  ;; Tricky: If value got clipped, we avoided retracting domain-
  ;;    induced conjunct, and the now invalid "oldValue" blocks
  ;;    an attempt to reassert the same domain-induced conjunct;
  (when (and (null oldValue)
             (neq (implied-domain role) *Thing*))
    (if (eq (implied-domain role) (loom-constant INCOHERENT))
	(post-incoherent-instance
	 instance
	 (format nil "~S was asserted to have a value for the role ~S~%and the domain of ~S is INCOHERENT." instance role role))
      (assert-conjunct instance (implied-domain role) :domain/range)))
  ;; propagate forward constraints implied by value-restrictions:
  (when (role-is-value-restricted-p role)
    (propagate-forward-inferences-to-filler filler instance role))
  ;; post role-modified instance if a role-bomb needs to be analyzed:
  (scan-trigger-role-bombs instance role :assertion) 
  ;; update query indices attached to "role":
  (update-query-indices instance role filler :assertion)
  ;; react within cohort queues and rete network:
  (when (eq justification :assertion)
    (save-now-role-fillers instance role (slot-values-to-value oldValue role))
    ;; react within cohort queues and rete network:
    (react-to-role-modification-on-rete-instance 
     instance role filler :assertion))
  ;; clip any not-filled-by features that clash with "filler" and
  ;;  recognize if needed:   ;  TAR 4/1/94
  (let ((negatedFeatures (clip-not-filled-by-features instance role filler)))
    (when negatedFeatures
      (loop for ftr in negatedFeatures
            do (push ftr (violated-features instance)))
      (post-incoherent-instance 
       instance 
       (format nil "Filler ~A of relation ~A violates restriction~P ~{~A~^, ~}"
	       filler role (length negatedFeatures) negatedFeatures))))

  (when (test-bit-flags (tbox-flag role) :tbox-flag 
			:or :equivalence-restriction :computed-restriction)
    ;; If either of these conditions is true, then it is possible that
    ;; "instance" may need to be reclassified.  Do that and check it for
    ;; incoherence.
;    (revise-one-instance instance)
   (setf (retraction-message (find-or-create-modification-summary instance))
     :detect-incoherence)
   (post-non-analyzable-modified-instance instance :retraction (default-mode-p))
    ;(set-bit-flags (db-attributes instance) :db-instance :recompute-features)
    )
  )

(defun help-assert-half-role-filler (instance role filler oldValue justification)
  ;; Helping function for DB-INSTANCE.assert-role-filler.
  ;; Possibly clip old filler, i.e., if "role" is single-valued, retract the
  ;;    old filler;
  ;; Note: Caching the slot "strict-max-restrictions" enables clipping
  ;;    computations to be reasonably fast;
  ;; TO DO: WE CONJECTURE THAT WHEN "filler" REPRESENTS THE ORIGINAL
  ;;    INSTANCE IN "assert-role-filler" THAT SKOLEM TESTS CAN BE ELIMINATED;
  (declare (inline update-query-indices))
  (let ((singleValuedP (role-is-single-valued-p role))
        upperBound clippedOldFiller bomb)
    (when (strict-max-restrictions instance)
      ;; see if there is an inferred upper bound on "role":
      (loop for maxRes in (strict-max-restrictions instance)
            when (subconcept-p role (relation maxRes))
            do (setq upperBound
                     (if upperBound
                       (min upperBound (upper-bound maxRes))
                       (upper-bound maxRes)))))
    (cond
     ((not singleValuedP)
      (if (and (eql upperBound 1)
	       oldValue
	       (or (skolem-instance-p filler)
		   (skolem-instance-p (first oldValue))))
	  (setq filler (replace-or-merge-skolem-filler
			instance role filler (first oldValue) justification))
	(progn (add-to-role-fillers-table instance role filler oldValue justification)
	       (when (and upperBound
			  (>= (length oldValue) upperBound))
		 (pushnew (loop for maxRes in (strict-max-restrictions instance)
			      when (and (eql upperBound upperBound)
					(subconcept-p role (relation maxRes)))
			      return maxRes) ; RMM 9/21/93
			  (violated-features instance))
		 (post-incoherent-instance 
		  instance
		  (format nil
		     "Adding filler ~A to relation ~A caused the upper bound of ~D to be violated"
		     filler role upperBound))))))
      ;; "role" is single-valued:
      ((null oldValue)
       (add-to-role-fillers-table instance role filler nil justification)
       (when (and upperBound (zerop upperBound))
	 (post-incoherent-instance 
	  instance
	  (format nil "Adding filler ~A to relation ~A caused the upper bound of ~D to be violated"
		  filler role upperBound))))
      ((or (skolem-instance-p filler)
	   (skolem-instance-p (first oldValue)))
       ;; one of filler or oldValue is a skolem
       (setq filler (replace-or-merge-skolem-filler
		      instance role filler (first oldValue) justification)))
      ((not (and (eq justification :assertion)
                 (clipping-enabled-p role)
		 (not (test-bit-flags (db-attributes instance) :db-instance 
				     :instance-being-merged))
		 (let ((roleFillersRecord (rest (assoc role (role-fillers-table instance)))))
		   (or (null roleFillersRecord)
                       (loop for value in oldValue
                             never (member value
				           (strict-fillers roleFillersRecord)
                                           :test #'filler-equal))))))
       ;; "role" is single-valued, but we allow clipping only if justification
       ;;    is :assertion and there is no strict support for the old filler.  
       ;;    Since thats not the case, we MAY permit multiple fillers (which
       ;;    causes "instance" to become incoherent):
       (add-to-role-fillers-table instance role filler oldValue justification)
       ;; record constraint violation:
       (pushnew (max-1-restriction role) (violated-features instance))
       (pushnew instance (dependent-instances role))
       (post-incoherent-instance 
	instance
	(format nil "Adding filler ~A to relation ~A caused the upper bound of 1 to be violated, ~
                    and value clipping could not be performed because ~
                    ~:[role clipping is disabled~;there is other strict support for the value~]"
		filler role (clipping-enabled-p role))))
      (t  ;; clip old filler
       (setq clippedOldFiller (first oldValue))
 #L:trace-modify (trace-values "clipping" instance role clippedOldFiller filler)
       (retract-role-filler instance role clippedOldFiller :retraction
			    :dont-retract-domain-conjunct-p t)
       ;; harmless bug??: a default filler may still exist in the role table, but
       ;;    it gets eliminated from the dynamic variables table here:
       (add-to-role-fillers-table instance role filler nil justification)
       ;; check if there is an equivalence class for this (instance.role)
       (when (setq bomb (find-equivalence-bomb instance role))
	 (assert/retract-fillers-of-equivalent-roles
	   :assertion instance role filler justification bomb))))
   )) ;; end "help-assert-half-role-filler"

(defun assert/retract-fillers-of-equivalent-roles
       (assertion/retraction instance role filler justification bomb)
  ;; Called by "assert-half-role-filler" and "retract-role-filler";
  ;; Situation: "filler" is being asserted or retracted from "role" on
  ;;    "instance" and "bomb" indicates that other roles are equivalent to
  ;;     "role";
  ;; Assert or retract the fillers of equivalent roles that depended on
  ;;    "filler".
 #L:trace-modify (trace-values "retract-role-filler: equivalence-bomb")
  ;; temporarily deactivate equivalence-bomb so equivalence class is handled
  ;;    only once:
  (deactivate-equivalence-bomb bomb)
  ;; retract equivalent roles
  (loop for rc in (equivalence-bomb-role-chains bomb)
       when (or (neq (second rc) role)
		(neq (first rc) instance))
       do
       (case assertion/retraction
	 (:assertion
	  (assert-role-filler
	    (first rc) (second rc) filler justification))
	 (otherwise
	  (retract-role-filler
	    (first rc) (second rc) filler justification))))
  (reactivate-equivalence-bomb bomb)
  ;; remove bomb from filler
  (when (classified-instance-p filler)
    (removef (equivalence-memberships filler) bomb))
  ;; instance must be rematched to recompute the filler of the equivalence class
  (post-non-analyzable-modified-instance 
   instance :retraction (default-mode-p)) )

(defun  replace-or-merge-skolem-filler (instance role filler oldFiller justification)
  ;; Helping function for "assert-half-role-filler";
  ;; One of filler or oldValue is a skolem;
  ;; Merge or replace the skolem with another filler;
  ;; Return the possibly new filler;
  (let ((fillerIsMergeableP (classified-instance-p filler)))
    (if (and fillerIsMergeableP
	     (test-bit-flags (db-attributes filler) :db-instance :instance-being-merged))
	;; Just substitute "filler" for "oldFiller"
	(progn
	  ;; note: setting justification to :all eliminates all derived role fillers:
	  (retract-role-filler instance role oldFiller :all
			       :dont-retract-domain-conjunct-p t)
	  (add-to-role-fillers-table instance role filler nil justification))
	;; Filler is not being merged:
	(cond
	  ((not fillerIsMergeableP)
	   (unless (replace-skolem-by-constant oldFiller filler)
	     ;; Remove oldFiller, if it is already being replaced
	     (retract-role-filler instance role oldFiller :all
				  :dont-retract-domain-conjunct-p t))
	   ;; Make sure proper support is recorded
	   (add-to-role-fillers-table instance role filler nil justification))
	  ((not (classified-instance-p oldFiller))
	   (replace-skolem-by-constant filler oldFiller)
	   (setq filler oldFiller))
	  (t  ;; if both are instances, merge the role-fillers
	   (setq filler (merge-instances
			  (identifier filler)
			  (identifier oldFiller)
			  justification))
	   ;; Make sure proper support is recorded
	   (add-to-role-fillers-table instance role filler nil justification))))
    filler ))

(defun local-replace-or-merge-skolem-filler
    (instance role filler oldFiller justification)
  ;; Helping function for "assert-half-role-filler";
  ;; One of filler or oldValue is a skolem;
  ;; Merge or replace the skolem with another filler;
  ;; Return the possibly new filler;
  (let ((fillerIsMergeableP (classified-instance-p filler)))
    (if (and fillerIsMergeableP
	     (test-bit-flags (db-attributes filler) :db-instance :instance-being-merged))
	;; Just substitute "filler" for "oldFiller"
	(progn
	  ;; note: setting justification to :all eliminates all derived role fillers:
	  (let ((*do-in-subcontexts-p* nil))
	    (retract-half-role-filler instance role oldFiller :all
				      :dont-retract-domain-conjunct-p t))
	  (add-to-role-fillers-table instance role filler nil justification))
	;; Filler is not being merged:
	(cond
	  ((not fillerIsMergeableP)
	   (unless (replace-skolem-by-constant oldFiller filler)
	     ;; Remove oldFiller, if it is already being replaced
	     (retract-role-filler instance role oldFiller :all
				  :dont-retract-domain-conjunct-p t))
	   ;; Make sure proper support is recorded
	   (add-to-role-fillers-table instance role filler nil justification))
	  ((not (classified-instance-p oldFiller))
	   (replace-skolem-by-constant filler oldFiller)
	   (setq filler oldFiller))
	  (t  ;; if both are instances, merge the role-fillers
	   (setq filler (merge-instances
			  (identifier filler)
			  (identifier oldFiller)
			  justification))
	   ;; Make sure proper support is recorded
	   (add-to-role-fillers-table instance role filler nil justification))))
    filler ))

;;; Note: Propagation of value restrictions can occur
;;;    (1) When a new role filler is asserted or inferred;
;;;    (2) When a new type is inferred.
;;; The methods below handle case (1); the method "propagate-forward-inferences"
;;;    in file "types.lisp" handles case (2);
;;; CAUTION: CODE MODIFICATIONS MUST BE MADE TO *BOTH* PROPAGATION ROUTINES

(defmethod propagate-forward-inferences-to-filler ((filler DB-INSTANCE) instance role)
  ;; Look for value-restrictions on "instance" whose relations
  ;;    specialize or are specialized-by "role";
  ;; For each such restriction, add support for the value-restriction
  ;;    to the conjuncts of "filler";
  ;; If default support, post modified instance (don't bother to assert
  ;;    conjunct, since withdrawal of defaults will just eliminate it);
  (let (concept)
    (flet ((assert-value-restriction-concept (concept mode)
	     (if (eq concept (loom-constant INCOHERENT))
		 (post-incoherent-instance filler
		  (format nil "~S was asserted to be a filler of the role ~S on ~S~%and all ~S's on ~S are INCOHERENT." filler role instance role instance))
	       (assert-conjunct filler concept mode))))
      (if (eq (strict-cumulative-value-restrictions instance)
	      (cumulative-value-restrictions instance))
	  (loop for res in (cumulative-value-restrictions instance)
	      when (subconcept-p role (relation res))
	      do  (assert-value-restriction-concept (value-restriction res) :strict))
	(loop for res in (cumulative-value-restrictions instance)
	    when (subconcept-p role (relation res))
	    do
	      (setq concept (value-restriction res))
	      (cond
	       ((member res (strict-cumulative-value-restrictions instance))
		(assert-value-restriction-concept (value-restriction res) :strict))
	       ((default-mode-p)
		;; "filler" is a default value:  ;; Was marked :strict - TAR 3/3/98
		(assert-value-restriction-concept (value-restriction res) :default)
		(plant-conflict-bomb
		 instance res :type-propagation t concept nil filler))
	       (t
		;; if propagation is based on a default value restriction, and
		;;    we're not currently in default mode, then both "instance"
		;;    and "filler" have to have their defaults withdrawn and
		;;    recomputed:
		(post-non-analyzable-modified-instance instance :retraction t)
		(post-non-analyzable-modified-instance filler :retraction t))))) )))

(defmethod propagate-forward-inferences-to-filler (filler instance role)
  ;; Don't propagate inferences, since "filler" is not a DB-INSTANCE;
  ;; However, we test that "filler" satisfies forward constraints attached to
  ;;    "instance";
  ;; If not, post "instance", so that it will be flagged as incoherent;
  ;; Clumsy:  "cumulative-value-restrictions" eliminates restrictions on
  ;;    set features to simplify forward propogation, but this means that
  ;;    we need an extra loop here to test for incoherence;
  (let* ((cumulativeValueRestrictions (cumulative-value-restrictions instance))
         (violatedRes
          (or (loop for res in cumulativeValueRestrictions
                    when (and (subconcept-p role (relation res))
                              (not-has-instance-p (value-restriction res)
                                                  filler))
                    return res)
              (and (not (incoherent-instance-p instance))
                   (loop for res in (implied-restrictions
                                     (find-type&residue-features instance))
                         when (and (subconcept-p role (relation res))
                                   (eq (feature-type res) :value-restriction)
                                   (not (member res cumulativeValueRestrictions))
                                   (not-has-instance-p (value-restriction res)
                                                       filler))
                         return res)))))
    (when violatedRes
      (pushnew violatedRes (violated-features instance))
      (post-incoherent-instance 
       instance
       (format nil "Filler ~A of relation ~A conflicts with restriction ~A"
	       filler role violatedRes))) ))

(defmethod assert-phantom-inverse-role-filler ((filler T) realRole instance)
  ;; Default method does nothing;
  (declare (ignore realRole instance))
  nil )

(defmethod assert-phantom-inverse-role-filler 
           ((filler DB-INSTANCE) realRole instance)
  ;; Assert that "instance" is a filler of the phantom role on "filler";
  ;; TO DO: FIGURE OUT IF WE *ALWAYS* RECORD HISTORY OF PHANTOMS, OR JUST
  ;;    RECORD IF "justification" = :assertion;
  (let* ((phantomInverseRole (phantom-inverse-relation realRole))
	 (oldInstances (get-slot-values filler phantomInverseRole)))
    ;; record value of old phantom inverse fillers: 
    ;; add new phantom role filler:
    (unless (member instance oldInstances)        ;  TAR 11/28/94
      (set-slot-values 
       filler phantomInverseRole (cons instance oldInstances))) ))

(defun infer-component-fillers (instance role filler justification)
  ;; Situation: "role" is a single-valued composition;
  ;; Place skolem fillers for the intermediate roles of "role" wherever
  ;;    they do not already exist;
  ;; POSSIBLE BUG: LOOM MAY NOT BE ABLE TO FIGURE OUT THE LOGICAL SUPPORT
  ;;    FOR THE INCOHERENCE MARK DETECTED BELOW (AND WILL DO WHAT???);
  (let ((left instance)
	(weakJustification (if (eq justification :assertion)
			       :strict
			       justification))
	nextComponent right)
    (loop for tail on (components role)
	 do
	 (setq nextComponent (first tail))
	 (when (not-has-instance-p (implied-domain nextComponent) left)
	   ;; detect incoherence, if type clash is encountered in middle of chain
	   #L:trace-modify (trace-values
			     "infer-component-fillers: type clash in role-chain"
			     left instance role filler)
	   (post-incoherent-instance 
	    instance
	    (format nil "A type clash between ~A and the domain (~A) of relation ~A has been found.  Relation ~A occurs in the role chain ~A of ~A"
		    left (implied-domain NextComponent) nextComponent 
		    nextComponent (components role) role))
	   (return-from infer-component-fillers nil))
	 (if (rest tail)
	     ;; not the last element of the chain
	     (progn
	       (setq right (coerce-unique-role-value left nextComponent))
	       (unless right
		 (setq right (create-skolem-instance nil))
		 (assert-role-filler
                  left nextComponent right weakJustification))
	       (setq left right))
	     ;; last element
	     (assert-role-filler left nextComponent filler weakJustification))) ))

(defun coerce-unique-role-value (instance componentRole)
  ;; Helping function for "infer-component-fillers";
  ;; Find all role values, and coerces them to the current world;
  ;; Return a unique role value, or signal error if the result is not unique;
  (let ((fillers (collect-all-role-fillers instance componentRole)))
    (integrity-check (not (rest fillers)))
    (first fillers)))


  ;;
;;;;;; "assert-nth-role-filler" and "assert-list-of-role-fillers"
  ;;

(defun assert-nth-role-filler (role instance filler n)
  ;; Assert that the "n"th position of the sequence role
  ;;    "role" of "instance" has the filler "filler";
  (declare (ignore role instance filler n))
  "NOT YET IMPLEMENTED" )

(defun assert-list-of-role-fillers (instance role fillers)
  ;; Assert to the database that "fillers" are fillers of "role" of
  ;;    "instance";
  ;; If the role was initially empty and we aren't in a world,
  ;;    then make make the role value 'EQ to "fillers", i.e.,
  ;;    preserve the original ordering (and then some);
  (ensure-sealed-relation role)
  ;; we let "assert-role-filler" do all of the work;
  ;; "reverse" preserves the original order:
  (loop for f in (reverse fillers)
        do (assert-role-filler instance role f :assertion)) )


  ;;
;;;;;; Role Retraction
  ;;

(defmethod retract-inverse-half-role-filler
           ((filler DB-INSTANCE) role instance justification)
  ;; Retract the inverse role relationship, if one exists, that "instance" is
  ;;    a filler of the inverse of "role" in the instance "filler".
  (let ((inverseRole (inverse role)))
    (if (inverse role)
      (retract-half-role-filler 
       filler inverseRole instance
       (get-slot-value filler inverseRole) justification)
      (progn
        (retract-phantom-inverse-role-filler filler role instance)
	;; TO DO: HANDLE INCOHERENT RANGE? zzz
        (when (and (neq (implied-range role) *Thing*)
	           (implied-range role)) ;; can be null within revision operation
          (retract-conjunct filler (implied-range role) :domain/range)))) ))

;;; In certain cases, the object representing the filler of a retracted role
;;;    does not get modified.  These cases include (1) replacing a skolem
;;;    filler by a real filler, (2) a constant filler, (3) a CLOS-INSTANCE filler.
;;;    The code below combines these cases, setting a flag dontModifyFillerP
;;;    if any of these three situations holds.  The effect of setting the flag
;;;    is to (i) avoid setting an inverse link (phantom or otherwise), (ii) avoid
;;;    removing a range-implied conjunct from the filler, and (iii) avoid
;;;    withdrawing propagated value restrictions from the filler.  If in the
;;;    future we create new kinds of objects that support (i) but not (ii) and
;;;    (iii),or vice-versa, then we will have to uncombine these cases.
;;; FURTHERMORE, at present, all non-mergeable instances are non-modifiable
;;;    (constants, CLOS-INSTANCEs, HISTORY-INSTANCEs).  Hence the code below
;;;    assumes that "not-mergeable" implies "not-modifiable".

(defmethod retract-half-role-filler
           ((instance BASIC-INSTANCE) role filler oldValue justification)
  ;; Retract from the database that "filler" is a filler of "role" of
  ;;    "instance";
  ;; Notify the TMS of changes which it needs to know about;
  ;; Nothing happens if "filler" was not a filler after all;
  ;; If the special variable *dontRetractDomainConjunctP* is set, we are in
  ;;    the middle of a clip of a slot value, so avoid retracting a conjunct
  ;;    that would just get put back;
  (declare (special *dontRetractDomainConjunctP*)
           (inline update-query-indices))
  (let ((mergedInstance (womp-merge-pointers instance)))
    ;; Tricky:  Need to use a low-level slot-value access because single-valued
    ;;   roles could have multiple-values if the instance is incoherent;
    (setq oldValue (access-in-ctxt (dynamic-slot-value instance (name role))
                                   nil
                                   (home-ctxt instance)))
    (when (neq mergedInstance instance)
      (setq instance mergedInstance)
      (setq oldValue (access-in-ctxt (dynamic-slot-value instance (name role))
                                     nil
                                     (home-ctxt instance)))
      (when (not (classified-instance-p instance))
        (retract-half-role-filler instance role filler oldValue justification)
        (return-from retract-half-role-filler nil))))
  (setq filler (womp-merge-pointers filler))
  (when (not (member filler oldValue :test #'filler-equal))
    (return-from retract-half-role-filler t))
  ;; check if this is a retraction for a role equivalence class
  (let ((bomb (find-equivalence-bomb instance role)))
    (when bomb
      (assert/retract-fillers-of-equivalent-roles
       :retraction instance role filler justification bomb)))
  ;; do the actual retraction:
  (when (not (delete-from-role-fillers-table-p 
              instance role filler oldValue justification))
    ;; quick exit if support for "filler" still exists;
    (return-from retract-half-role-filler nil))
  ;; retract support for implied domain as a conjunct of "instance", and
  ;;    implied range as a conjunct of "filler"
  (when (and (not (and (boundp '*dontRetractDomainConjunctP*)
                       *dontRetractDomainConjunctP*))
             (neq (implied-domain role) *Thing*)
             (or ; Why is this here: (relation-is-single-valued-p role)     ;  TAR 6/22/94
                 (null (rest oldValue))))
    (retract-conjunct instance (implied-domain role) :domain/range))
  ;; retract forward constraints implied by value-restrictions
  (when (and (role-is-value-restricted-p role)
	     (not (test-bit-flags (db-attributes instance) :db-instance :abandoned-by-merge)))
    (withdraw-forward-inferences-from-filler filler instance role))
  ;; post role-modified instance if a role-bomb needs to be analyzed:
  (when (and (if-removed-bombs instance)
	     (not (and (classified-instance-p filler)
		       (test-bit-flags (db-attributes filler) :db-instance 
				      :abandoned-by-merge))))
    (scan-trigger-role-bombs instance role :retraction))
  ;; update query indices attached to "role":
  (update-query-indices instance role filler :retraction)
  ;; record value of old fillers:
  (when (eq justification :retraction)
    (when (incoherent-instance-p instance)      ; RMM 3/4/94
      (post-non-analyzable-modified-instance instance :retraction nil))
    (save-now-role-fillers instance role (slot-values-to-value oldValue role))
    ;; react within cohort queues and rete network:
    (react-to-role-modification-on-rete-instance 
     instance role filler :retraction))
  (when (test-bit-flags (tbox-flag role) :tbox-flag 
			:or :equivalence-restriction :computed-restriction)
    ;; If either of these conditions is true, then it is possible that
    ;; "instance" may need to be reclassified.  Do that and check it for
    ;; incoherence.
    (post-non-analyzable-modified-instance instance :retraction (default-mode-p))
    (setf (retraction-message (find-or-create-modification-summary instance))
      :detect-incoherence)
    ;(set-bit-flags (db-attributes instance) :db-instance :recompute-features)
    )
  )

(defmethod withdraw-forward-inferences-from-filler ((filler DB-INSTANCE) instance role)
  ;; Look for value-restrictions on "instance" whose relations
  ;;    specialize or are specialized-by "role";
  ;; For each such restriction, remove support for the value-restriction
  ;;    from the conjuncts of "filler";
  (let (concept)
    (if (eq (strict-cumulative-value-restrictions instance)
	    (cumulative-value-restrictions instance))
	(loop for res in (cumulative-value-restrictions instance)
	     when (subconcept-p role (relation res))
	     do
	     (retract-conjunct filler (value-restriction res) :strict)) 
	(loop for res in (cumulative-value-restrictions instance)
	     when (subconcept-p role (relation res))
	     do
	     (setq concept (value-restriction res))
	     (if (member res (strict-cumulative-value-restrictions instance))
		 (retract-conjunct filler concept :strict)
		 (progn
		   ;; TO DO: RECONSIDER THIS CHANGE, BECAUSE IT DOESN'T PARALLEL
		   ;;   THE CODE IN PROPAGATE-FORWARD-INFERENCES-TO-FILLER!
		   ;; Removed bogus NOT TAR 8/8/96 -- Changed back TAR 4/9/98
                   ; (integrity-check (default-mode-p))
		   ;; if propagation is based on a default value restriction,
		   ;;    then both "instance" and "filler" have to have their
		   ;;    defaults reprocessed:
		   (post-non-analyzable-modified-instance instance :retraction t)
		   (post-non-analyzable-modified-instance filler :retraction t))))) ))

(defmethod withdraw-forward-inferences-from-filler (filler instance role)
  ;; Don't withdraw forward constraints from filler which is not a DB-INSTANCE;
  (declare (ignore filler instance role))
   nil )

(defmethod retract-phantom-inverse-role-filler ((filler T) realRole instance)
  ;; Default method does nothing;
  (declare (ignore realRole instance))
  nil )

(defmethod retract-phantom-inverse-role-filler 
           ((filler DB-INSTANCE) realRole instance)
  ;; Retract that "instance" is a filler of the phantom role on "filler";
  ;; TO DO: FIGURE OUT IF WE *ALWAYS* RECORD HISTORY OF PHANTOMS, OR JUST
  ;;    RECORD IF "justification" = :assertion;
  (let ((oldInstances (get-slot-values filler (phantom-inverse-relation realRole))))
    ;; record value of old phantom inverse fillers:
    ;; add new phantom role filler:
    (set-slot-values filler (phantom-inverse-relation realRole)
      (if (cdr oldInstances)
	  (remove instance oldInstances :test #'filler-equal)
	  nil)) ))


  ;;
;;;;;; "retract-list-of-role-fillers"
  ;;

(defun retract-list-of-role-fillers (instance role fillers)
  ;; Retract from the database that "fillers" are fillers of 
  ;;    "role" of "instance";
  (loop for f in fillers
       do (retract-role-filler instance role f :retraction)) )


  ;;
;;;;;; Role fillers assertions and justifications
  ;;

(defun add-to-role-fillers-table (instance role filler oldFillers justification)
  ;; Add the filler "filler" to the role "role" for instance "instance";
  ;; If "justification" is :assertion and an entry for "role" exists in
  ;;    the role fillers table for "instance", then add "filler" to the
  ;;    table entry and update the computed role fillers;
  ;; Otherwise, if "justification" is not :assertion, find or create a
  ;;    table entry, record the filler, and update the computed role fillers;
  ;; Values for "justification" are :assertion, :strict, and :default;
  (let ((roleFillersRecord (cdr (assoc role (role-fillers-table instance)))))
    (set-slot-values instance role
                     (cons filler oldFillers))
    (when (and (eq justification :assertion)
	       (null roleFillersRecord))
      (return-from add-to-role-fillers-table nil))
    ;; create a fillers record if none exists:
    (when (null roleFillersRecord)
      (setq roleFillersRecord (make-ROLE-FILLERS-SUPPORT-RECORD))
      (setf (asserted-fillers roleFillersRecord) oldFillers)
      (push (cons role roleFillersRecord)
	    (role-fillers-table instance)))
    (when (default-mode-p)              ; RMM 3/18/94
      (setq justification :default))
    (ecase justification
      (:assertion
       (push filler (asserted-fillers roleFillersRecord)))
      (:default
        (push filler (default-fillers roleFillersRecord)))
      (:strict
       (push filler (strict-fillers roleFillersRecord)))) ))

(defun delete-from-role-fillers-table-p (instance role filler oldFillers justification)
  ;; Delete the filler "filler" from the role "role" for instance "instance";
  ;; Return t if no other support for that filler exists;
  ;; If an entry for "role" exists in the role fillers table for "instance",
  ;;    then remove "filler" from the appropriate slot in the table entry and
  ;;    update the computed role fillers;
  ;; Values for "justification" are :retraction, :strict, and :default
  ;;    (and :assertion, which means :retraction here);
  ;; Note: We do NOT remove a role fillers table entry when the last filler
  ;;    is deleted;
  ;; Note: "assert-half-role-filler" sets "justification" to :all during clipping;
  ;; Note: We use non-destructive deletion to avoid messing up copies in world-instances;
  ;; TO DO: CONSIDER ELIMINATING EMPTY ROLE FILLERS RECORDS IF ASSERTION CLIPS DERIVED
  ;;    FILLER (BUT ONLY IF WE ARE ABLE TO RELIABLY DETECT THIS CASE);
  ;; TO DO: UPGRADE TO HANDLE COMPUTED ROLE FILLERS;
  (let ((roleFillersRecord (cdr (assoc role (role-fillers-table instance))))
     ;; WHY WAS THIS HERE?:
     ;   (oldFillers (slot-value-to-values oldValue role))  RMM 10/10/94
	assertedFillers strictFillers defaultFillers)
    (when roleFillersRecord
      (setq assertedFillers (asserted-fillers roleFillersRecord))
      (setq strictFillers (strict-fillers roleFillersRecord))
      (setq defaultFillers (default-fillers roleFillersRecord))
      (when (default-mode-p)              ; RMM 3/18/94
        (setq justification :default))
      (ecase justification
	((:retraction :assertion)
	 (setq assertedFillers 
	   (remove filler assertedFillers :test #'filler-equal))
	 (setf (asserted-fillers roleFillersRecord) assertedFillers))
	(:strict
	 (setq strictFillers (remove filler strictFillers :test #'filler-equal)) 
	 (setf (strict-fillers roleFillersRecord) strictFillers))
	(:default 
	    (setq defaultFillers
	      (remove filler defaultFillers :test #'filler-equal) )
	  (setf (default-fillers roleFillersRecord) defaultFillers))
	(:all 
	 (setq assertedFillers
	   (remove filler assertedFillers :test #'filler-equal))
	 (setf (asserted-fillers roleFillersRecord) assertedFillers) 
	 (setq strictFillers (remove filler strictFillers :test #'filler-equal)) 
	 (setf (strict-fillers roleFillersRecord) strictFillers) 
	 (setq defaultFillers 
	   (remove filler defaultFillers :test #'filler-equal) ) 
	 (setf (default-fillers roleFillersRecord) defaultFillers)))
      ;; if "filler" had multiple support, then leave "filler" in the
      ;;    computed role cache;
      (when (or (member filler assertedFillers :test #'filler-equal)
		(member filler strictFillers :test #'filler-equal)
		(member filler defaultFillers :test #'filler-equal))
	(return-from delete-from-role-fillers-table-p nil)))	; return yes other support
    (set-slot-values
     instance role
     (cond
      ((cdr oldFillers)
       (remove filler oldFillers :test #'filler-equal))
      ;; Tricky: At this point, either the role is single-valued, or it is
      ;;    multiple-valued with no derived fillers.
      (roleFillersRecord                ; RMM 6/21/93
       ;; continuing the trickiness: role is single-valued, so an "or" rather
       ;;    than an "append" suffices:
       (or assertedFillers
           defaultFillers))
      (t nil)))
    t						; return no other support
    ))

(defun insure-asserted-role-filler (instance role filler)
  ;; Situation: "filler" has been asserted to belong to role "role" of
  ;;    instance "instance", but it is already present;
  ;; See if "filler" has been asserted already, and if not, record the
  ;;    assertion;
  ;; If "inverseRole", also record an inverse assertion;
  ;; Called by "assert-role-filler";
  (let ((roleFillersRecord (cdr (assoc role (role-fillers-table instance)))))
    (when (and roleFillersRecord
	       (not (member filler (asserted-fillers roleFillersRecord))))
      (push filler (asserted-fillers roleFillersRecord))) ))


  ;;
;;;;;; Modifications to Features
  ;;

;;; Functions for asserting and retracting features of an instance;
;;; Note: These could be optimized slightly by testing to see if
;;;    the new feature is more- or less-specific than any/some feature in
;;;    the lists of implied-features attached to the TYPE of the
;;;    instance; Execution of these two routines is probably a rare event,
;;;    so for the moment we have omitted this optimization.

(defun assert-feature (self feature)
  (let ((newFeatures (classify-instance-feature feature self)))
    (execute-in-contexts-depth-first
     (local-assert-feature self newFeatures)) ))

(defun retract-feature (self feature)
  (let ((newFeatures (classify-instance-feature feature self)))
    (execute-in-contexts-depth-first
     (local-retract-feature self newFeatures)) ))

(defmethod local-assert-feature ((self NEGATION-MIXIN) features)
  ;; Assert the proposition that the instance "self" satisfies the feature
  ;;   "feature";
  ;; The assertion of the feature "feature" to "self" causes it to be
  ;;    classified, and then added to the slot
  ;;    "(asserted-features self)";
  (loop for ftr in features
        unless (null ftr)
        do
        (pushnew ftr (asserted-features self))
        (when (eq (feature-type ftr) :not-filled-by)
          (let* ((role (relation ftr))
                 (fillers (get-slot-values self role)))
            (when (clipping-enabled-p role)
              (loop for f in (non-role-fillers ftr)
                    when (member f fillers)
                    do (retract-role-filler self role f :retraction)))))))

(defmethod local-assert-feature ((self DB-INSTANCE) features)
  ;; Assert the proposition that the instance "self" satisfies the feature
  ;;    "feature";
  ;; Post "self" to the modified-instance queue;
  #+(or :MCL :ALLEGRO) (declare (ignore features))
  (let ((oldFeatures (asserted-features self)))
    (setq self (womp-merge-pointers self))
    (call-next-method)
    (post-non-analyzable-modified-instance self :assertion (default-mode-p))
    (loop for ftr in (asserted-features self)			
	  unless (member ftr oldFeatures)
	  do
	  ;; OPTIMIZE THIS IF OPAQUE ASSERTIONS BECOME FREQUENT:
	  (pushnew ftr (newly-asserted-features (modification-summary self)))
	  (when (and (eq (feature-type ftr) :min-restriction)
		     (> (lower-bound ftr) 0))
	    (if (eq (implied-domain (relation ftr)) (loom-constant INCOHERENT))
		(post-incoherent-instance self
		  (format nil "~S was asserted to have at least ~D value~:P for the role ~S~%and the domain of ~:*~S is INCOHERENT." self (lower-bound ftr) (relation ftr)))
	      (assert-conjunct self (implied-domain (relation ftr)) :domain/range)))) ))

(defmethod local-retract-feature ((self NEGATION-MIXIN) features)
  ;; Retract the proposition that the instance "self" satisfies the feature
  ;;    "feature";
  ;; The retraction of the feature "feature" from "self" causes it to be
  ;;    classified (so that the local restriction can be matched to a
  ;;    classified restriction), and then removed from the slot
  ;;    "(asserted-features self)";
  (loop for ftr in features
        when (member ftr (asserted-features self))
        do
        (setf (asserted-features self)        ; note non-destructive deletion
              (remove ftr (asserted-features self)))) )

(defmethod local-retract-feature ((self DB-INSTANCE) features)
  ;; Retract the proposition that the instance "self" satisfies the feature
  ;;    "feature";
  ;; Post "self" to the modified-instance queue;
  #+(or :MCL :ALLEGRO) (declare (ignore features))
  (let ((oldFeatures (asserted-features self)))
    (setq self (womp-merge-pointers self))
    (call-next-method)
    (post-non-analyzable-modified-instance self :retraction (default-mode-p))
    (loop for ftr in oldFeatures			
	  when (not (member ftr (asserted-features self)))
	  do
	  (when (and (eq (feature-type ftr) :min-restriction)
		     (> (lower-bound ftr) 0))
	    (retract-conjunct 
             self (implied-domain (relation ftr)) :domain/range)))
    ;; signal that feature computations should be recomputed (this
    ;;    roughly is the dual of the "newly-asserted-assertions" slot):
    (set-bit-flags (db-attributes self) :db-instance :recompute-features) ))

(defmethod classify-instance-feature ((self RESTRICTION-FEATURE) instance)
  ;; Helping method for "assert-feature" and "retract-feature";
  ;; The feature "self" is already classified -- return a singleton list;
  (declare (ignore instance))
  (list self) )

(defmethod classify-instance-feature (self instance)
  ;; Helping method for "assert-feature" and "retract-feature";
  ;; Return a classified version of the feature "self";
  ;; Situation: "self" must be a local restriction;
  ;; Side-effect: record the dependency of "instance" on relations
  ;;    referenced in each "feature" (so if the relation is redefined,
  ;;    the instance will reclassify its features);
  ;; Note: Null restrictions result in returning a nil value;
  ;; BUG: WE DON'T YET RECORD DEPENDENCIES BETWEEN A VALUE RESTRICTION
  ;;    AND A CONCEPT;
  ;; TO FIX THIS REQUIRES ADDING THE SLOT "dependent-instances" TO CONCEPTS;
  (let* ((*listOfLocalRestrictions* (list self))
	 (classifiedFeatures (classify-restrictions nil nil)))
    (declare (special *listOfLocalRestrictions*))
    (loop for ftr in classifiedFeatures
	 do (pushnew instance (dependent-instances (relation ftr))))
    classifiedFeatures ))

(defmethod classify-instance-feature ((self COMPARISON-FEATURE) instance)
  ;; Helping method for "assert-feature" and "retract-feature";
  ;; Return a classified version of the feature "self";
  ;; Situation: "self" is an unclassified comparison feature;
  ;; Side-effect: record the dependency of "instance" on relations
  ;;    referenced in each "feature" (so if the relation is redefined,
  ;;    the instance will reclassify its features); 
  (let ((classifiedFeatures (classify-comparisons (list self))))
    (loop for ftr in classifiedFeatures
	 do (loop for role in (roles ftr)
		 do (pushnew instance (dependent-instances role))))
    classifiedFeatures ))

(defun assert-not-in (instance feature)
  (execute-in-contexts-depth-first (local-assert-not-in instance feature)) )

(defun retract-not-in (instance feature)
  (execute-in-contexts-depth-first (local-retract-not-in instance feature)) )

(defmethod local-assert-not-in ((self NEGATION-MIXIN) concept)
  ;; Assert that the instance "self" does not satisfy the concept "concept";
  (unless (member concept (asserted-negations self))
    (push concept (asserted-negations self))) )

(defmethod local-assert-not-in ((self DB-INSTANCE) concept)
  ;; Assert that the instance "self" does not satisfy the concept "concept";
  (unless (member concept (asserted-negations self))
    (when (member :clip-types *loom-match-features*)    ;  TAR 3/30/94
      (retract-conjunct self concept :retraction))
    (pushnew concept (newly-negated-conjuncts
                      (find-or-create-modification-summary self)))
    (call-next-method)
    ;; TO DO: FIGURE OUT IF CHECK FOR CONFLICT BOMBS GOES HERE:
    (post-non-analyzable-modified-instance self :assertion (default-mode-p))) )

(defmethod local-retract-not-in ((self NEGATION-MIXIN) concept)
  ;; Remove assertion that the instance "self" does not satisfy the concept
  ;;    "concept";
  (when (member concept (asserted-negations self))
    (removef (asserted-negations self) concept)) )

(defmethod local-retract-not-in ((self DB-INSTANCE) concept)
  ;; Remove assertion that the instance "self" does not satisfy the concept
  ;;    "concept";
  (when (member concept (asserted-negations self))
    (call-next-method)
    ;; TO DO: FIGURE OUT IF CHECK FOR CONFLICT BOMBS GOES HERE:
    (post-non-analyzable-modified-instance self :retraction (default-mode-p))) )


  ;;
;;;;;; Modifications to Conjuncts
  ;;


(defun assert-conjunct (instance conjunct justification)
  ;; Assert to the database that "instance" belongs to "conjunct";
  (cond ((null conjunct) 
	 (grumble "Trying to assert ~S is a NIL concept.  Possibly the concept ~
                   to which ~:*~A should be asserted could not be sealed because it is ~
                   undefined or has a bad definition."
		  instance))
	((eq justification :assertion)
	 (execute-in-contexts-depth-first
	  ;; get context sensitive old value:
	  (local-assert-conjunct instance conjunct justification)))
	(T
	 ;; derived fillers happen in a single context:
	 (local-assert-conjunct instance conjunct justification))) )

(defun retract-conjunct (instance conjunct justification)
  ;; Assert to the database that "instance" belongs to "conjunct";
  (cond ((null conjunct) 
	 (grumble "Trying to retract ~S from a NIL concept.  Possibly the concept ~
                   from which ~:*~A should be retracted could not be sealed because it is ~
                   undefined or has a bad definition."
		  instance))
	((eq justification :retraction)
	 (execute-in-contexts-depth-first
	  ;; get context sensitive old value:
	  (local-retract-conjunct instance conjunct justification)))
	(T
	 ;; derived fillers happen in a single context:
	 (local-retract-conjunct instance conjunct justification))) )

;;; The functions below are responsible for maintaining for a
;;;    db-instance the unary predicates which either have been asserted
;;;    for it (and not retracted) or are implied by a forward inference
;;;    (from a forward vr or a domain or range constraint on a relation).

(defmethod local-assert-conjunct ((instance DB-INSTANCE) conjunct justification)
  ;; The assertion of a unary predicate translates into the entry 
  ;;    of the concept "conjunct" into "(conjuncts-table instance)";
  ;; Record the assertion, and test for posting on the queue of
  ;;    modified db-instances;
  ;; TO DO: ADD INCOHERENCE DETECTION CODE;
  (let ((mergedInstance (womp-merge-pointers instance)))
    (when (neq mergedInstance instance)
      (setq instance mergedInstance)
      (when (not (classified-instance-p instance))
        (assert-conjunct instance conjunct justification)
        (return-from local-assert-conjunct nil))))
  (when (add-to-conjuncts-table-p instance conjunct justification)
;    (when (member justification '(:assertion :domain/range))
;      (add-to-local-instances conjunct instance))
    (add-to-local-instances conjunct instance)          ;  TAR 2/14/95
    (when (member :clip-types *loom-match-features*)
      (retract-not-in instance conjunct))    ;  TAR 3/29/94
    (post-non-analyzable-modified-instance instance :assertion (default-mode-p))
    ;; SEE IF WE CAN ELIMINATE THIS NOW THAT WE HAVE HISTORY INSTANCES:
    (push conjunct
          (newly-asserted-conjuncts (modification-summary instance)))) )

(defmethod local-retract-conjunct ((instance DB-INSTANCE) conjunct justification)
  ;; The assertion of a unary predicate translates into the entry 
  ;;    of the concept "conjunct" into "(conjuncts-table instance)";
  ;; Record the retraction, and test for posting on the queue of
  ;;    modified db-instances;
  (let ((mergedInstance (womp-merge-pointers instance)))
    (when (neq mergedInstance instance)
      (setq instance mergedInstance)
      (when (not (classified-instance-p instance))
        (retract-conjunct instance conjunct justification)
        (return-from local-retract-conjunct nil))))
  (when (delete-from-conjuncts-table-p instance conjunct justification)
    (post-non-analyzable-modified-instance 
     instance :retraction (default-mode-p))) )


  ;;
;;;;;; Conjunct assertions and justifications
  ;;

(defun add-to-conjuncts-table-p (instance conjunct justification)
  ;; Make an entry (or modify an existing entry) in
  ;;    "(conjuncts-table instance)" reflecting the assertion or
  ;;    inference that "instance" satisfies the concept "conjunct";
  ;; Return t if it is necessary to post "instance" on an assertion
  ;;    or default-assertion queue;
  ;; The values for "justification" are
  ;;    :assertion    indicating the assertion of a unary predicate "conjunct";
  ;;    :domain/range   indicating that a domain or range restriction on
  ;;                       a role induced this deduction, or that a backward
  ;;                       chaining conjunct induced it;
  ;;    :strict        indicating that a strict forward inference from a
  ;;                       value restriction is responsible for the inference;
  ;; *defaultModeP* overrides all other justifications;
  (let ((conjunctRecord (cdr (assoc conjunct (conjuncts-table instance))))
	conjunctIsNew)
    (when (or (and (default-mode-p)
		   (or conjunctRecord ;(conjunct-supported-p conjunctRecord) ; CTXXX
                       (and (not (incoherent-instance-p instance))
                            (if (consp (db-type instance))
                              (loop for type in (db-type instance)
                                    thereis (subconcept-p type conjunct))
		              (subconcept-p (db-type instance) conjunct)))))
	      (and (backward-chaining-p conjunct)	; RMM 4/30/92
		   (eq justification :domain/range)))
      (return-from add-to-conjuncts-table-p nil))
    (when (null conjunctRecord)
      (setq conjunctRecord (create-conjunct-support-record))
      (push (cons conjunct conjunctRecord)
	    (conjuncts-table instance))
      (setq conjunctIsNew t))
    (cond
      ((default-mode-p)
       ;; Tricky: We only set "default-p" if the new conjunct further specializes
       ;;    "instance".  If "conjunct" is later withdrawn, "delete-from-conjuncts-table-p"
       ;;    makes the heuristic assumption that the type of "instance" should be
       ;;    withdrawn back to "strict-db-type":
       (setf (default-p conjunctRecord) t)
       t)
      (t
       (ecase justification
	 (:assertion 
          (setf (assertion-p conjunctRecord) t))
	 (:domain/range
	  (incf (domain/range-count conjunctRecord))
	  (when (monotonic-p conjunct)
	    (setf (assertion-p conjunctRecord) t)))
	 (:strict
	  (incf (strict-count conjunctRecord))
	  (when (monotonic-p conjunct)
	    (setf (assertion-p conjunctRecord) t))))
       (and conjunctIsNew
	    (or (incoherent-instance-p instance)
                (if (consp (db-type instance))
                  (loop for type in (db-type instance)
                        never (subconcept-p type conjunct))
                  (not (subconcept-p (db-type instance) conjunct))))))) ))

(defun delete-from-conjuncts-table-p (instance conjunct justification)
  ;; Modify or remove the entry in "(conjuncts-table instance)"
  ;;    reflecting the assertion or inference that "instance" satisfies
  ;;    the concept "conjunct";
  ;; Return t if it is necessary to post "instance" on a retraction
  ;;    queue;
  ;; See "add-to-conjuncts-table-p" for explanation of "justification",
  ;;     except that :assertion indicates retraction of a conjunct;
  (let ((conjunctRecord (cdr (assoc conjunct (conjuncts-table instance)))))
    (when (null conjunctRecord)
      (return-from delete-from-conjuncts-table-p nil))
    (when (eq conjunct (intrinsic-concept instance))
      (when (eq justification :retraction)      ; RMM 2/15/94
        (grumble "Can't retract concept ~S from instance ~S because the concept
   is intrinsic to ~S (because it was asserted during instance creation)."
                 (name conjunct) instance instance))
      (return-from delete-from-conjuncts-table-p nil))
    (ecase justification
      (:retraction
       (when (monotonic-p conjunct)
	 (warn "Retracted instance ~S from the monotonic concept ~S"
	       instance conjunct))
       (setf (assertion-p conjunctRecord) nil))
      (:domain/range (when (plusp (domain/range-count conjunctRecord))
		       (decf (domain/range-count conjunctRecord))))
      (:strict (when (plusp (strict-count conjunctRecord))
		 (decf (strict-count conjunctRecord))))
      (:default
       ;; if the conjunct support indicates default support, then necessarily
       ;;    it has no strict support (see comment in "add-to-conjuncts-table-p");
       ;;    hence, we remove the entry and return t:
       (return-from delete-from-conjuncts-table-p
	 (when (default-p conjunctRecord)
	   ; (setf (default-p conjunctRecord) nil) ; CTXXX
           (removef-assoc (conjuncts-table instance) conjunct)
	   t))))
    (when (and (null (assertion-p conjunctRecord))
	       (zerop (domain/range-count conjunctRecord)))
      ;; if "conjunct" no longer holds on "instance" -- remove table entry:
      (when (zerop (strict-count conjunctRecord)) ; CTXXX
	(removef-assoc (conjuncts-table instance) conjunct))
      ;; indicate that "instance" should be placed on strict retraction queue
      ;;   (forward inferences omitted from consideration to avoid being
      ;;   fooled by circular support):
      t ) ))


  ;;
;;;;;; Modification of Second-class Instances 
  ;;

(defmethod assert-half-role-filler ((instance T) role filler oldFillers justification)
  ;; Trap attempt to assert to a constant; 
  (declare (ignore filler oldFillers))
  (when (eq justification :assertion)
    (grumble "Attempted to assert a filler to a non-existent slot named ~A
on the object ~S in context ~A." (name role) instance *context*)) )

(defmethod assert-inverse-half-role-filler ((filler T) role instance justification)
  ;; No inverses on Constants;
  (declare (ignore role instance justification))
  nil)

(defmethod retract-half-role-filler ((instance T) role filler oldValue justification)
  ;; Trap erroneous attempt to remove a slot filler from a constant;
  ;; Generate a warning if role retraction is made to null or non-Loom
  ;;    instance;
  (declare (ignore role filler oldValue))
  (when (eq justification :assertion)
    (grumble "Can't retract a role filler from ~:[the non-Loom instance ~S~;~
              a null instance~*~] in context ~A"
	     (null instance) instance *context*)) )

(defmethod retract-inverse-half-role-filler ((filler T) role instance justification)
  ;; No inverses on Constants; 
  (declare (ignore role instance justification))
  nil)

(defmethod local-assert-conjunct (self conjunct justification)
  ;; Situation:  "self" is not a LOOM object, so we can't modify it, or
  ;;    record truth maintenance dependencies for it;
  ;; If "justification" is :assertion, add "self" to the list
  ;;    of local instances recorded for "conjunct";
  ;; If "self" clashes with "conjunct" signal an error unless
  ;;    "set-value" or "add-value" has bound the special variable
  ;;    *typeClashDetectedP* or incoherence is being trapped;
  ;; If the special variable *constantFillerConflictsWithConjunctP* is bound
  ;;    (by "propagate-forward-inferences") then check for incoherence
  ;;    and set the variable accordingly;
  (declare (special *constantFillerConflictsWithConjunctP*))
  (flet ((warn-of-type-clash ()
	   (warn "Type clash: The constant ~S cannot be an instance of the concept ~S."
		 self (generate-external-reference conjunct))))
    (when (not (subconcept-p conjunct (loom-constant NON-LOOM-THING)))
      (warn "The concept ~S cannot be asserted to contain non loom objects~%   ~
             such as the ~S ~S in context ~A."
            (generate-external-reference conjunct) (type-of self) self *context*)
      (return-from local-assert-conjunct nil))
    (case justification
      (:assertion
       (add-to-local-instances conjunct self))
      (:domain/range
       (when (and (not (boundp '*dontDetectTypeClashP*))
                  (not-has-instance-p conjunct self))
         (warn-of-type-clash)))) ))

(defmethod local-retract-conjunct (self conjunct justification)
  ;; Situation:  "self" is not a LOOM object, so we can't modify it, or
  ;;    record truth maintenance dependencies for it;
  ;; If :justification is :retraction, then complain.  Just silently ignore
  ;;    retractions from derived information.
  (when (eq justification :retraction)
    (grumble "The assertion that ~S is an instance of ~A is not retractable."
	     self (name conjunct))) )  

(defmethod local-assert-feature (self features)
  ;; Non Loom instances don't have features;
  (declare (ignore features))
  (grumble "Can't assert a descriptive proposition to the instance ~S because
it does not inherit the mixin INSTANCE-WITH-NEGATION."
           self) )

(defmethod local-retract-feature (self features)
  ;; Non Loom instances don't have features;
  (declare (ignore features))
  (grumble "Can't retract a descriptive proposition from the instance ~S because
it does not inherit the mixin INSTANCE-WITH-NEGATION."
           self) )

(defmethod local-assert-not-in (self concept)
  ;; Warn that negation is not supported for the instance "self";
  (declare (ignore concept))
  (grumble "Can't assert a negated proposition from the instance ~S because it
does not inherit the mixin INSTANCE-WITH-NEGATION"
           self) )

(defmethod local-retract-not-in (self concept)
  ;; Warn that negation is not supported for the instance "self";
  (declare (ignore concept))
  (grumble "Can't retract a negated proposition from the instance ~S because it
does not inherit the mixin INSTANCE-WITH-NEGATION"
           self) )


  ;;
;;;;;; Equivalence Bombs
  ;;

(defun plant-equivalence-bomb (instance equivalence)
  ;; TO DO: handle cases where:
  ;;    1) role chains do not have a common originating instance
  ;;    2) composed relations require planting bomb on intermediate instances
  (let ((bomb (or (pop *recycled-equivalence-bombs*)
		  (make-EQUIVALENCE-BOMB)))
	roleChains decomposedRoles)
    (setf (originator bomb) equivalence)
    (loop for role in (roles equivalence)
          do
	 (push (list instance role) roleChains)
	 (when (eq (defined-as role) :composition)
	   ;; add all roles of composition to decomposedRoles
	   (loop for component in (components role)
                 do
		(pushnew component decomposedRoles)))
	 (pushnew role decomposedRoles))
    (setf (equivalence-bomb-role-chains bomb) roleChains)
    (setf (equivalence-bomb-decomposed-roles bomb) decomposedRoles)
    (push bomb (equivalence-bombs instance))
    bomb))

(defun deactivate-equivalence-bomb (bomb)
  ;; We store the originator in (bomb-world bomb)
  ;; so that it can be later reactivated
  (setf (equivalence-bomb-saved-originator bomb) (originator bomb))
  (setf (originator bomb) nil) )

(defun reactivate-equivalence-bomb (bomb)
  (setf (originator bomb) (or (equivalence-bomb-saved-originator bomb) t)) )

(defun find-equivalence-bomb (instance role)
  ;; Return an equivalence-bomb, if one matches this instance and role
  (when (multiple-definitions instance)
    (loop for bomb in (equivalence-bombs instance)
	  when (and (not (deactivated-p bomb))
	            ;; only look further if role is contained in the bomb
	            (member role (equivalence-bomb-decomposed-roles bomb))
	            ;; TO DO: make this test work for composed relations
	            (loop for rc in (equivalence-bomb-role-chains bomb)
		         thereis
		         (and (instance-id-eq instance (first rc))
		              (eq role (second rc)))))
         return bomb)) )

(defun instance-id-eq (instance id)
  (eq instance (get-instance id)))


  ;;
;;;;;; Merging of Instances
  ;;

(defun merge-instances (fromId intoId justification)
  ;; Merge (or unify) all knowledge about fromInstance with intoInstance;
  ;; This may require recursively merging other instances,
  ;;    so a queue is kept of merges that remain to be performed;
  (let ((fromInstance (get-instance fromId))
	(intoInstance (get-instance intoId)))
    (unless (and (classified-instance-p fromInstance)         ; RMM 4/7/93
                 (classified-instance-p intoInstance))
      (when (or (skolem-instance-p fromInstance)              ; TAR 5/26/99
		(skolem-instance-p intoInstance))
	(return-from merge-instances
	  (if (skolem-instance-p fromInstance)
	      (if (eq justification :assertion)
		  (execute-in-contexts-breadth-first
		   (replace-skolem-by-constant fromInstance (or intoInstance intoId)))
		(replace-skolem-by-constant fromInstance (or intoInstance intoId)))
	    (if (eq justification :assertion)
		(execute-in-contexts-breadth-first
		 (replace-skolem-by-constant intoInstance (or fromInstance fromId)))
	      (replace-skolem-by-constant intoInstance (or fromInstance fromId))))))
      (grumble "Instance ~@[~*un~]merging is not supported for non-classified instances
such as ~S and ~S." (eq justification :retraction) fromInstance intoInstance)
      (return-from merge-instances nil))
    (if (eq justification :assertion)
	(execute-in-contexts-breadth-first
	 (local-merge-instances fromID fromInstance intoID intoInstance justification))
      (local-merge-instances fromID fromInstance intoID intoInstance justification))
    intoInstance ))

(defun local-merge-instances (fromID fromInstance intoID intoInstance justification)
  ;; Merge (or unify) all knowledge about fromInstance with intoInstance;
  ;; This may require recursively merging other instances,
  ;;    so a queue is kept of merges that remain to be performed;
  (let ((*do-in-subcontexts-p* nil))
    (declare (special *exitIncoherentWorldP*))
    (cond
     ((eq justification :retraction)
      (warn "Retraction of :same-as is not supported."))
     ((not (and fromInstance intoInstance)) ; at least one of the instances does not exist
      (when (not intoInstance)
	(cond
	 (fromInstance			; swap variables
	  (let ((tempId intoId))
	    (setq intoId fromId)
	    (setq intoInstance fromInstance)
	    (setq fromId tempId)))
	 (t				; must create a new instance
	  (setq intoInstance (create-classified-instance intoId nil nil))
	  (setf (multiple-identifiers intoInstance) (list intoID)))))
      ;; Now, there is an instance for intoInstance, but none for fromInstance
      ;; Save source definitions of instances before anything is merged
      (push fromId (multiple-identifiers intoInstance))
      ;; Result cannot be a skolem, since a new designator has been introduced
      (when (skolem-instance-p intoInstance)
	(clear-bit-flags (db-attributes intoInstance) :db-instance :skolem)
	(setf (identifier intoInstance) fromId))
      ;; Change symbol table entries for fromInstance
      (intern-object fromid intoInstance :instances nil))
     ((eq fromInstance intoInstance)) ;; no action needed
     (t
;      #L:trace-modify (trace-values "merge-instances" fromInstance "into" intoInstance)
      
      ;; Look for conflicting types before actually merging:
      (when (and (boundp '*exitIncoherentWorldP*)
		 ;; one of the instances may not have been matched yet:
		 (and (strict-db-type fromInstance)
		      (strict-db-type intoInstance))
		 (disjoint-concepts-p (strict-db-type fromInstance)
				      (strict-db-type intoInstance)))
;	#L:trace-merge (trace-values "merge instances: type conflict" fromInstance intoInstance)
					;	   #L:trace-merge (break "merge-instances")
	(setq *exitIncoherentWorldP* (list fromInstance intoInstance))
	(throw 'incoherent-world-catcher :incoherent))
      ;; Save multiple-definitions of fromInstances before anything is discarded
      (merge-multiple-definitions fromInstance intoInstance)
      ;; Very Tricky: we deactivate any equivalence-bombs that point
      ;;              at either instance (now all merged into intoInstance)
      ;; so that equivalence classes will not be seen while role fillers
      ;; are redirected from fromInstance to intoInstance
      (loop for bomb in (equivalence-memberships intoInstance) do
	    (deactivate-equivalence-bomb bomb))
      (loop for bomb in (equivalence-bombs intoInstance) do
	    (deactivate-equivalence-bomb bomb))
      ;; Merge asserted knowledge:
      (set-bit-flags (db-attributes intoInstance) :db-instance :instance-being-merged)
      (copy-role-fillers fromInstance intoInstance t :inverses-of-phantoms)
      ;; Conjuncts
      (loop for conjunct-support in (conjuncts-table fromInstance) do
	    (when (assertion-p (cdr conjunct-support))
	      (assert-conjunct intoInstance (car conjunct-support) :assertion)))
      ;; Features
      (loop for feature in (asserted-features fromInstance) do
	    (assert-feature intoInstance feature))
      (clear-bit-flags (db-attributes intoInstance) :db-instance :instance-being-merged)
      ;; Reactivate bombs that point at intoInstance
      (loop for bomb in (equivalence-memberships intoInstance) do
	    (reactivate-equivalence-bomb bomb))
      (loop for bomb in (equivalence-bombs intoInstance) do
	    (reactivate-equivalence-bomb bomb))
      ;; Redirect all pointers to fromInstance
      (eliminate-merging-instance fromInstance intoInstance)
      ;; Change symbol table entries for fromInstance:
      (let ((ids (or (multiple-identifiers fromInstance)
		     (list-of (identifier fromInstance)))))
	(loop for id in ids do
	      (intern-object id intoInstance :instances nil)))
      ;; Result should not be a skolem, if a rigid designator has been introduced
      (when (and (skolem-instance-p intoInstance)
		 (not (skolem-instance-p fromInstance)))
	(clear-bit-flags (db-attributes intoInstance) :db-instance :skolem)
	(setf (identifier intoInstance) fromId))
      ;; tell matcher to recompute derived knowledge for this instance
      (post-non-analyzable-modified-instance intoInstance :assertion (default-mode-p))
      (setf *last-merged-instance-agent-time* *agent-time*))) ;  TAR 1/3/94
    ))

;;; In the case that a skolem is equivalenced with a constant, and
;;;    worlds is on, the skolem gets lifted and then merges into the constant.
;;;    Then we must bind the identifier of the skolem to that constant
;;;    in the world, so that pointers to the skolem from ancestor worlds
;;;    will get coerced to the constant whenever they are accessed.  This
;;;    is how constants find their way into the symbol tables.  For the
;;;    case when worlds are not in effect, LOOM replaces all pointers to
;;;    the merging instance (skolem, in this case), and hence no constants
;;;    find their way into symbol tables.

(defun replace-skolem-by-constant (skolem constant)
  ;; Merge skolem instance into "constant":
  ;; 1. Detect incoherence if either
  ;;    the skolem has any role-fillers;
  ;;    the constant cannot be an instance of the type(s) of the skolem;
  ;; 2. Redirect all phantom-inverse roles of skolem to constant;
  ;; 3. Eliminate the skolem in the normal way;
  ;; Called by: ASSERT-HALF-ROLE-FILLER and APPLY-STRICT-EQUIVALENCES.
  ;; Assumes "skolem" has already been coerced to current world by either calling function;
  ;; (setq skolem (womp-merge-pointers skolem))

  (let ((*do-in-subcontexts-p* nil))
    (declare (special *exitIncoherentWorldP*))
;    #L:trace-merge (trace-values "replace-skolem-by-constant" skolem constant)
					; #L:trace-merge (break "replace-skolem-by-constant")
    (when (test-bit-flags (db-attributes skolem) :db-instance :instance-being-replaced)
      (return-from replace-skolem-by-constant nil))
    (when (and (boundp '*exitIncoherentWorldP*)
	       *exitIncoherentWorldP*
	       ;; Look for conflicting types before actually merging
	       (or (dynamic-variables skolem)  ;; skolem has role fillers
		   (loop for c in (db-type skolem)  ;; constant conflicts with type of skolem
		       thereis
			 (not-has-instance-p c constant))))
;      #L:trace-merge (trace-values "replace-skolem-by-constant: type conflict" skolem constant)
      (setq *exitIncoherentWorldP* (list skolem constant))
      (throw 'incoherent-world-catcher :incoherent))
    ;; Very Tricky: we deactivate any equivalence-bombs that point at skolem
    ;; so that equivalence classes will not be seen while role fillers
    ;; are redirected from skolem to constant
    (loop for bomb in (equivalence-memberships skolem) do
	  (deactivate-equivalence-bomb bomb))
    ;; Guard against cycles!
    (set-bit-flags (db-attributes skolem) :db-instance :instance-being-replaced)
    ;; 2. Redirect all phantom-inverse role fillers from skolem to constant;
    (copy-inverses-of-phantom-fillers 
     (collect-phantom-roles&fillers skolem) skolem constant)
    ;; Reactivate bombs that point at skolem
    (loop for bomb in (equivalence-memberships skolem) do
	  (reactivate-equivalence-bomb bomb))
    ;; Clean Up!
    (clear-bit-flags (db-attributes skolem) :db-instance :instance-being-replaced)
    (eliminate-merging-instance skolem constant)
    ;; Redirect symbol table entries from skolem to constant
    (let ((ids (or (multiple-identifiers skolem)
		   (list-of (identifier skolem)))))
      (loop for id in ids
	  do (intern-object id constant :instances nil)))
    constant ))

#|
(defun replace-skolem-by-constant (skolem constant)
  ;; Merge skolem instance into "constant":
  ;; 1. Detect incoherence if either
  ;;    the skolem has any role-fillers;
  ;;    the constant cannot be an instance of the type(s) of the skolem;
  ;; 2. Redirect all phantom-inverse roles of skolem to constant;
  ;; 3. Eliminate the skolem in the normal way;
  ;; Called by: ASSERT-HALF-ROLE-FILLER and APPLY-STRICT-EQUIVALENCES.
  ;; Assumes "skolem" has already been coerced to current world by either calling function;
  ;; (setq skolem (womp-merge-pointers skolem))
  (declare (special *exitIncoherentWorldP*))
  #L:trace-merge (trace-values "replace-skolem-by-constant" skolem constant)
; #L:trace-merge (break "replace-skolem-by-constant")
  (when (test-bit-flags (db-attributes skolem) :db-instance :instance-being-replaced)
    (return-from replace-skolem-by-constant nil))
  (when (and (boundp '*exitIncoherentWorldP*)
	      *exitIncoherentWorldP*
	     ;; Look for conflicting types before actually merging
	     (or (dynamic-variables skolem)  ;; skolem has role fillers
		 (loop for c in (db-type skolem)  ;; constant conflicts with type of skolem
		       thereis
		       (not-has-instance-p c constant))))
    #L:trace-merge (trace-values "replace-skolem-by-constant: type conflict"
				 skolem constant)
    (setq *exitIncoherentWorldP* (list skolem constant))
    (throw 'incoherent-world-catcher :incoherent))
  ;; Very Tricky: we deactivate any equivalence-bombs that point at skolem
  ;; so that equivalence classes will not be seen while role fillers
  ;; are redirected from skolem to constant
  (loop for bomb in (equivalence-memberships skolem) do
       (deactivate-equivalence-bomb bomb))
  ;; Guard against cycles!
  (set-bit-flags (db-attributes skolem) :db-instance :instance-being-replaced)
  ;; 2. Redirect all phantom-inverse role fillers from skolem to constant;
  (copy-inverses-of-phantom-fillers 
    (collect-phantom-roles&fillers skolem) skolem constant)
  ;; Reactivate bombs that point at skolem
  (loop for bomb in (equivalence-memberships skolem) do
       (reactivate-equivalence-bomb bomb))
  ;; Clean Up!
  (clear-bit-flags (db-attributes skolem) :db-instance :instance-being-replaced)
  (eliminate-merging-instance skolem constant)
  ;; Redirect symbol table entries from skolem to constant
  (let ((ids (or (multiple-identifiers skolem)
		 (list-of (identifier skolem)))))
    (loop for id in ids
	 do (intern-object id constant :instances nil)))
  constant
  |#

(defun set-equal-p-fn (set1 set2)
  ;; Needed just because set-equal-p is a macro!
  (set-equal-p set1 set2))

(defun merge-multiple-definitions (fromInstance intoInstance)
  ;; It shouldn't be necessary to check whether the identifiers
  ;;    of fromInstance already appear in the defs of intoInstance,
  ;;    because in that case the two instances would already be merged.
  (setf (multiple-identifiers intoInstance)
	(append (or (multiple-identifiers intoInstance)
		    (list-of (identifier intoInstance)))
		(or (multiple-identifiers fromInstance)
		    (list-of (identifier fromInstance)))))
  ;; Merge in any equivalence-memberships from fromInstance
  (loop for bomb in (equivalence-memberships fromInstance) do
       (push bomb (equivalence-memberships intoInstance)))
  ;; equivalence-bombs should be recomputed when intoInstance is matched
  )

(defun eliminate-merging-instance (fromInstance intoInstance)
  ;; Helping function for "merge-instances";
  ;; Eliminate all traces of "fromInstance" -- pointers to it
  ;;    from other instances are deleted;
  ;; mark as discarded, and save pointer to where it merged:
  (set-bit-flags (db-attributes fromInstance) :db-instance :abandoned-by-merge)
  ;; Remove all pointers to fromInstance
  (forget-all-about fromInstance)
  ;; save pointer to where it merged:
  (setf (merged-into-instance fromInstance) intoInstance)
  ;; NOTE: merged instances can never be reclaimed,
  ;; because the application might have a variable pointing at them.
  ;; However, they are marked so that if Loom will break
  ;; if it tries to do anything with them other than
  ;; follow the merged-into-instance pointer
  ;; NOTE: fromInstance may be either skolem or rigid;
  ;;       this may need to be changed if rigid instances get recycled.
  (setf (db-type fromInstance) :abandoned-by-merge) )

(defun follow-merge-pointers (instance)
  ;; Return the instance at the end of a chain of "merged-into-instance" pointers;
  ;; Also, set the "merged-into-instance" slot to point at the end of the chain.
  (let ((pointer (merged-into-instance instance)))
    (cond
      ((null pointer)
       instance)
      ((eq pointer :deleted)			; SHOULD THIS BE RECOVERABLE?
       (error "Deleted instance ~S passed as argument to `tell' or `forget'."
	      instance))
      ((classified-instance-p pointer)
       (setf (merged-into-instance instance)
	     (follow-merge-pointers pointer)))
      (t pointer))) )



;;TO DO:
#|

RECYCLE SKOLEM INSTANCE ID'S, SO THAT THE ATOMIC SYMBOLS DON'T PROLIFERATE

|#

