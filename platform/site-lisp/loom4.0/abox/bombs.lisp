; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

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

;;; BOMBS.LISP (ABOX)

;;; Contains the low-level logic which manufactures and operates on
;;;    dependency-bombs;

(in-package "LOOM")

;(export '())


;;; The code below defines the dependency-bombs that instantiate the
;;;    truth-maintenance mechanism; Additional code manages the HITs
;;;    and MISSes lists, which are tightly-coupled to the bomb
;;;    mechanism;

;;; There are three major classes of dependency bombs: role bombs, type
;;;    bombs, and conflict bombs.  Role bombs trigger when the value
;;;    of a role changes, while type and compatability bombs trigger when
;;;    an instance's type changes.

;;; Role Bombs:
;;;    Role/Feature bomb:  Records (un)matched feature -- no special class is
;;;       needed for feature bombs, we just attach the feature to the instance.
;;;       Saved as <role, feature> in either an "if-added" or "if-removed"
;;;       queue.
;;;    Role/Default bomb: Records that changing a role on an instance may
;;;       affect a cached default computation.
;;;       Saved as <role, :default> in either an "if-added" or "if-removed"
;;;       queue.
;;;    Remote Role change bomb: Monitors changes to fillers of a role on a
;;;       "trigger instance" that may affect the satisfaction of some 
;;;       feature on the "originator instance".
;;;       Saved as <role, <originator, feature, role, trigger-instance>> in both
;;;       the "if-added" and "if-removed" queues.
;;; Type Bomb:
;;;    Remote Type bomb: Records match of a trigger instance to some concept
;;;       invoked as a unary predicate, supporting a probe of a feature
;;;       for the originator instance;
;;;       Saved as <originator, feature, trigger-concept, trigger-instance>.
;;; Conflict Bomb:
;;;    Remote Type Conflict Bomb: Records conflict (or lack of conflict) between
;;;       the type of a trigger instance and some concept, with a feature
;;;       attached to the originator instance depending on that relationship.
;;;       Saved as <originator, trigger-instance, trigger-concept , originator>

  ;;    Forward definitions for
;;;;;;  Deactivating and discarding bombs
  ;; 

#+CLTL2 (declaim (inline deactivated-p deactivate-bomb discard-remote-bomb))
#-CLTL2 (proclaim '(inline deactivated-p deactivate-bomb discard-remote-bomb))

(defun deactivated-p (bomb)
  (null (originator bomb)))

(defun deactivate-bomb (bomb)
  ;; Called by "deactivate-bombs-on-feature" and "delete-all-misses";
  ;; Nullify the slot "(originator bomb)", which signals that
  ;;    "bomb" is no longer operational;
  ;; CAUTION1: "bomb" is still present in the bomb removal index of
  ;;    its originator, because the routines that call "deactivate-bomb"
  ;;    all do the removal themselves;
  ;; CAUTION2: "bomb" is still present in the "type-bombs"
  ;;    list attached to its trigger instances -- the bomb will be
  ;;    discarded by the next application of
  ;;    "detonate-type-bombs" to the supporting instance;
  (setf (originator bomb) nil) )

(defun discard-remote-bomb (bomb)
  (when (zerop (decf (trigger-instances-counter bomb)))
    ; (push bomb *recycled-remote-bombs*)
    ) )

  ;;
;;;;;; Planting remote bombs
  ;;

(defun plant-type-bomb (originator monitoredFeature featureIsSatisfiedP defaultP 
			triggerConcept conceptIsSatisfiedP triggerInstances)
  ;; Create a REMOTE-BOMB to monitor the satisfaction of the predicate
  ;;    "triggerConcept" applied to members of "triggerInstances", which
  ;;    support or fail to support "monitoredFeature", which is tied to
  ;;    "originator".
  ;; The bomb detonates when "triggerConcept" matches or fails to match
  ;;     (depending on "featureIsSatisfiedP") the types of "triggerInstances";
 #L:trace-bombs 
  (progn (trace-values "plant-type-bomb" originator triggerInstances)
	 (trace-values "               " monitoredFeature featureIsSatisfiedP defaultP))
  (plant-type-or-conflict-bomb
    :type originator monitoredFeature featureIsSatisfiedP defaultP
    triggerConcept conceptIsSatisfiedP triggerInstances) )

(defun plant-conflict-bomb (originator monitoredFeature featureIsSatisfiedP defaultP
			    triggerConcept conflictExistsP triggerInstance)
  ;; Create a bomb indicating a conflict between "originator" and
  ;;    "triggerInstance";  Bomb will detonate (indicating possible
  ;;    end of conflict) if "conflictExistsP" is T and the type of
  ;;    "triggerInstance" is no longer disjoint with "triggerConcept" OR
  ;;    if "conflictExistsP" is NIL and the type of "triggerInstance" becomes
  ;;    disjoint with "triggerConcept";
  ;; Use a REMOTE-BOMB with "bombType" set to :conflict;
 #L:trace-bombs (trace-values "plant-conflict-bomb" originator triggerInstance)
 #L:trace-bombs (trace-values "               " monitoredFeature featureIsSatisfiedP)
  (plant-type-or-conflict-bomb
    :conflict originator monitoredFeature featureIsSatisfiedP defaultP
    triggerConcept conflictExistsP (list triggerInstance)) )

(defun plant-type-or-conflict-bomb
       (bombType originator monitoredFeature featureIsSatisfiedP defaultP
	triggerConcept conceptIsSatisfiedP triggerInstances)
  ;; Create a remote type or conflict bomb and install it on each
  ;;    member of "triggerInstances";
  (let (bomb)
    (flet ((check-for-matching-bomb ()
	     ;; look for duplicate bomb -- if found, attach it to any trigger
	     ;;    instances that don't already point to that bomb, and then exit;
	     (let (matchingBomb)
	       (loop for entry in (bomb-removal-index originator)
		    when (and (eq (car entry) monitoredFeature)
			      (setq matchingBomb (cdr entry))
                              (eq (trigger-concept matchingBomb) triggerConcept)
			      (eq (feature-was-satisfied-p matchingBomb) featureIsSatisfiedP)
			      (eq (concept-was-satisfied-p matchingBomb) conceptIsSatisfiedP)
			      (eq (bomb-type matchingBomb) bombType))
		    do
		    (loop for i in triggerInstances
			 when (not (member matchingBomb (remote-type-bombs i))) 
			 do
			 (push matchingBomb (remote-type-bombs i))
			 (incf (trigger-instances-counter matchingBomb))) 
		    (return-from plant-type-or-conflict-bomb nil)))))
      (integrity-check triggerConcept)	; TAR 7/9/97
      (check-for-matching-bomb)
      ;; have to create new bomb; first, we do some housekeeping:
      (loop for instance in triggerInstances
	   do
	   ;; dispose of top-most deactivated type bombs on trigger instance
	   ;;    (we're too lazy to dispose of ALL deactivated bombs):
	   (loop for tail on (remote-type-bombs instance)
		when (car tail)			; skip already deleted bombs
		do
		(when (not (deactivated-p (car tail)))
		  (return nil))
		(discard-remote-bomb (car tail))
		(setf (remote-type-bombs instance)
		      (cdr tail))))
      
      (setq bomb (or ; (pop *recycled-remote-bombs*)
		     (make-REMOTE-BOMB)))
      (setf (bomb-type bomb) bombType)	; 
      (setf (originator bomb) originator)
      (setf (trigger-instances-counter bomb)
	    (length triggerInstances))
      (setf (trigger-concept bomb) triggerConcept)
      (setf (monitored-feature bomb) monitoredFeature)
      (setf (feature-was-satisfied-p bomb) featureIsSatisfiedP)
      (setf (tested-in-default-mode-p bomb) defaultP)
      (setf (concept-was-satisfied-p bomb) conceptIsSatisfiedP)
      ;; install bomb in "originator"'s bomb index, and in the "type-bombs"
      ;;    slot for each trigger instance;
      (push (cons monitoredFeature bomb)
	    (bomb-removal-index originator))
      (loop for i in triggerInstances
	   do (push bomb (remote-type-bombs i)))
      bomb )))

(defun plant-concept-generator-bomb (instance type feature satisfiedP)
  (declare (ignore instance type feature satisfiedP))
  (cerror """NOT YET IMPLEMENTED")
  )

(defun create-remote-bomb
       (originator monitoredFeature featureIsSatisfiedP defaultP)
  ;; Create a REMOTE-BOMB to monitor any change to the role "triggerRole"
  ;;    on "triggerInstance", which supports or fails to support
  ;;    "monitoredFeature", which is tied to "originator".
  ;; The bomb detonates whenever fillers are added or withdrawn from
  ;;    "triggerRole" -- this necessitates placing the remote bomb in
  ;;    both the "if-added" and "if-removed" slots on "triggerInstance";
  ;; Note: "bomb-removal-index" is useful primarily to clean things up
  ;;    when an instance is deleted and needs to eliminate all of its
  ;;    remote bombs;
  #L:trace-bombs (trace-values "create-remote-role-bomb" originator)
  #L:trace-bombs (trace-values "               " monitoredFeature featureIsSatisfiedP)
  (let ((bomb (or ; (pop *recycled-remote-bombs*)
		  (make-REMOTE-BOMB))))
    (setf (bomb-type bomb) :role)
    (setf (originator bomb) originator)
    (setf (trigger-instances-counter bomb) 0)
    (setf (trigger-concept bomb) :unused)	; integrity check
    (setf (monitored-feature bomb) monitoredFeature)
    (setf (feature-was-satisfied-p bomb) featureIsSatisfiedP)
    (setf (tested-in-default-mode-p bomb) defaultP)
    ;; install bomb in "originator"'s bomb index:
    (push (cons monitoredFeature bomb)
	  (bomb-removal-index originator))
    bomb ))


  ;;
;;;;;; Planting and removing if-added and if-removed bombs
  ;;

(defmacro plant-trigger-role-bomb 
	  (triggerInstance triggerRole feature wasSatisfiedP defaultP
	   &key if-added-p if-removed-p)
  ;; Expand to code that pushes the feature or remote bomb "bomb" onto
  ;;    if-added and if-removed tables for "triggerInstance";
  (flet ((form-push-code ()
	   `(if ,defaultP
		(if ,wasSatisfiedP
		    (pushnew ,feature (trigger-record-default-hits record))
		    (pushnew ,feature (trigger-record-default-misses record)))
		(pushnew ,feature (trigger-record-strict-features record)))))
    (once-only (triggerRole)
      `(progn
	 ,@(when if-added-p
	     `((unless (perfect-p ,triggerRole)
		 (let ((record (find-or-create-trigger-role/bomb-record
				 ,triggerInstance ,triggerRole :if-added)))
		   ,(form-push-code)))))
	 ,@(when if-removed-p
	     `((unless (monotonic-p ,triggerRole)
		 (let ((record (find-or-create-trigger-role/bomb-record
				 ,triggerInstance ,triggerRole :if-removed)))
		   ,(form-push-code))))))) ))

(defmacro plant-remote-role-bomb 
	  (triggerInstance triggerRole bomb &key if-added-p if-removed-p)
  ;; Expand to code that pushes the feature or remote bomb "bomb" onto
  ;;    if-added and if-removed tables for "triggerInstance";
  (once-only (triggerRole)
    `(progn
       ,@(when if-added-p
	   `((unless (perfect-p ,triggerRole)
	       (let ((record (find-or-create-trigger-role/bomb-record
			       ,triggerInstance ,triggerRole :if-added)))
		 (incf (trigger-instances-counter ,bomb))
		 (pushnew ,bomb (trigger-record-remote-bombs record))))))
       ,@(when if-removed-p
	   `((unless (monotonic-p ,triggerRole)
	       (let ((record (find-or-create-trigger-role/bomb-record
			       ,triggerInstance ,triggerRole :if-removed)))
		 (incf (trigger-instances-counter ,bomb))
		 (pushnew ,bomb (trigger-record-remote-bombs record)))))))) )

(defmacro find-or-create-trigger-role/bomb-record
	  (triggerInstance triggerRole if-added/if-removed)
  ;; Find or create a trigger role record for the role "triggerRole"
  ;;    on instance "triggerInstance" and return the record;
  (let ((slotName (ecase if-added/if-removed
		    (:if-added 'if-added-bombs)
		    (:if-removed 'if-removed-bombs))))
    (once-only (triggerInstance triggerRole)
      `(or (cdr (assoc ,triggerRole (,slotName ,triggerInstance)))
	   (let ((newRecord (or (pop *recycled-trigger-role-records*)
				(make-TRIGGER-ROLE-RECORD))))
	     (push (cons ,triggerRole newRecord)
		   (,slotName ,triggerInstance))
	     newRecord))) ))

(defun remove-all-local-role-bombs (instance ifAddedP ifRemovedP)
  ;; Remove all features in "(if-removed-bombs instance)" or
  ;;    in "(if-added-bombs instance)" representing local role bombs;
  ;; Called by "analyze-features" and "process-strict-assertion-queue";
  ;; Assumes that default features have already been withdrawn;
  (when ifAddedP
    (let ((remoteBombEntries nil))
      (loop for entry in (if-added-bombs instance)
	  when (typep (cdr entry) 'REMOTE-BOMB)
	   do (push entry remoteBombEntries))
      (setf (if-added-bombs instance) remoteBombEntries)))
  (when ifRemovedP
    (let ((remoteBombEntries nil))
      (loop for entry in (if-removed-bombs instance)
	  when (typep (cdr entry) 'REMOTE-BOMB)
	   do (push entry remoteBombEntries))
      (setf (if-removed-bombs instance) remoteBombEntries))) )

(defun remove-all-role-bombs (instance)
  ;; Remove all features in "(if-removed-bombs instance)" and
  ;;    in "(if-added-bombs instance)";
  ;; Called by "initialize-one-instance";
  (setf (if-added-bombs instance) nil)
  (setf (if-removed-bombs instance) nil) )


  ;;
;;;;;;  Deactivating and discarding bombs
  ;; 
  
(defun remove-bomb-from-originator (originator indicator)
  ;; Called by "detonate-type&conflict-bombs";
  ;; Remove the entry in "(bomb-removal-index originator)" that
  ;;    matches "indicator";
  ;; Deactivate the associated bomb;
  #L:trace-bombs (trace-values "remove-bomb-from-originator" originator indicator)
  (let* ((bombIndex (bomb-removal-index originator))
         (entry (assoc indicator bombIndex)))
    (when entry
      (deactivate-bomb (cdr entry))
      (removef (bomb-removal-index originator) entry)) ))

(defun deactivate-all-bombs-at-originator (originator &key defaults-only-p)
  ;; Deactivate and remove all bombs in "(bomb-removal-index originator)";
  ;; If "defaults-only-p", remove only those bombs marked as
  ;;    "tested-in-default-mode-p";
  (let ((bombIndex (bomb-removal-index originator))
	(deletedEntries nil))
    (when (null bombIndex)
      (return-from deactivate-all-bombs-at-originator nil))
    (loop for entry in bombIndex
	  when (or (tested-in-default-mode-p (cdr entry))
                   (not defaults-only-p))
	  do
	  (deactivate-bomb (cdr entry))
          (when defaults-only-p
            (push entry deletedEntries)))
    (if defaults-only-p
      (removef-members (bomb-removal-index originator) deletedEntries)
      (setf (bomb-removal-index originator) nil)) ))

  
  ;;
;;;;;; Detonating dependency bombs
  ;;

;; THIS FUNCTION USED TO CHECK IF "newType" SPECIALIZED "oldType", BUT THAT DIDN'T
;;    WORK FOR CONFLICT BOMBS:
(defun detonate-type-bombs-on-new-conjuncts (triggerInstance newType oldType)
  ;; Called by "process-strict-assertion-queue" and "process-default-assertion-queue";
  ;; Look for type and conflict bombs to detonate on these new conjuncts;
  (declare (ignore oldType))
  (when (remote-type-bombs triggerInstance)
    (detonate-type&conflict-bombs triggerInstance newType :assertion (default-mode-p)) ))

(defun detonate-type&conflict-bombs 
       (triggerInstance newType assertion/retraction defaultModeP)
  ;; Situation: The TYPE of "triggerInstance" has changed to "newType";
  ;; Examine each of the bombs in "(remote-type-bombs triggerInstance)"
  ;;    to see if any of them should detonate;
  ;; Discard all detonated bombs;
  ;; Note: For the :retraction case, "newType" may not strictly specialize the
  ;;    old type -- this is deliberately ignored, since the assertion phase is
  ;;    supposed to detect any newly-added conjuncts; 
  (let ((expectingSatisfiedTypeP (eq assertion/retraction :assertion))
	(deletedBombs nil))
    (when (consp newType)			; if "newType" is incoherent, arbitrarily
      (setq newType (first newType)))		;    use the first conjunct as the new type;
    (loop for bomb in (remote-type-bombs triggerInstance)
	  do
	  (when (cond
                 ((deactivated-p bomb)
                  t)
                 ((xor expectingSatisfiedTypeP (concept-was-satisfied-p bomb))
                  (case (bomb-type bomb)
                    (:type
                     (when (logically-equal-p
                            expectingSatisfiedTypeP
                            (subconcept-p newType (trigger-concept bomb)))
                       (detonate-type-bomb bomb defaultModeP)
                       t))
                    (:conflict
                     (when (logically-equal-p
                            expectingSatisfiedTypeP
                            (disjoint-concepts-p newType (trigger-concept bomb)))
                       (detonate-conflict-bomb bomb defaultModeP)
                       t)))))
	    ;; discard bomb except in a few cases:
	    (discard-remote-bomb bomb)		; decrement counter on bomb
            (unless (deactivated-p bomb) 
              (remove-bomb-from-originator
               (originator bomb) (monitored-feature bomb)))
            ;; enqueue "bomb" for deletion from "(remote-type-bombs triggerInstance)":
            (push bomb deletedBombs)))
    (removef-members (remote-type-bombs triggerInstance) deletedBombs) ))

(defun detonate-type-bomb (bomb defaultModeP)
  ;; Detonate the :type bomb "bomb";
  ;; Post the originator instance on the appropriate queue,
  ;;    and in non-default case, eliminate all role bombs;
  ;; "bomb" is discarded unconditionally after detonation;
  ;; The logic assumes that any new bombs will be planted during rematch;
  (let ((originator (originator bomb))
	(feature (monitored-feature bomb))
	(satisfiedWhenPlantedP (feature-was-satisfied-p bomb)))
 #L:trace-bombs (progn (trace-values "detonate-type-bomb" originator feature)
		       (trace-values "                  " satisfiedWhenPlantedP))
    (post-modified-instance 
      originator feature satisfiedWhenPlantedP 
      (or defaultModeP
	  (tested-in-default-mode-p bomb))) ))

(defun detonate-conflict-bomb (bomb defaultModeP)
  ;; Detonate the :conflict bomb "bomb";
  ;; If "feature-was-satisfied" equals :type-propagation, then the bomb
  ;;    is monitoring the propagation of a value restricted role to its
  ;;    role fillers -- rematch at the appropriate queue level;
  ;; Otherwise, the bomb is monitoring an instrumented feature whose 
  ;;    satisfaction (or lack of it) depended on the result of a
  ;;   "not-has-instance-p" test -- post originator for later analysis.
  (let ((originator (originator bomb))
	(feature (monitored-feature bomb))
	(wasSatisfiedP (feature-was-satisfied-p bomb)))
 #L:trace-bombs (trace-values "detonate-conflict-bomb" originator (feature-was-satisfied-p bomb))
    (when (tested-in-default-mode-p bomb)
      (setq defaultModeP t))
    (if (eq wasSatisfiedP :type-propagation)
	(post-non-analyzable-modified-instance
	  originator :retraction defaultModeP)
	(post-modified-instance
	  originator (list feature) wasSatisfiedP defaultModeP)) ))

(defun detonate-remote-role-bomb (bomb)
  ;; Detonate the :role bomb "bomb", i.e., post the indicated originator
  ;;    instance for rematching; 
  ;;    Discard "bomb";
  ;; Tricky: Although "bomb" indicates which (instrumented) feature on the
  ;;    originator was or was not previously satisfied, the analysis
  ;;    routines cannot reliably evaluate its current satifiability,
  ;;    owing to the fact that during evaluation we cannot distinguish 
  ;;    between asserted, strict, and default role fillers (for instances
  ;;    other than the originator).  Therefore, we must be conservative
  ;;    and call "post-non-analyzable-modified-instance" rather than
  ;;    "post-modified-instance";
  ;; Note: "scan-role-bombs" takes care of eliminating
  ;;    "bomb" from the if-added and if-removed indices;
  (unless (deactivated-p bomb)
    (post-non-analyzable-modified-instance
      (originator bomb)
      (if (feature-was-satisfied-p bomb) :retraction :assertion)
      (or (tested-in-default-mode-p bomb)
	  (default-mode-p)))
    (discard-remote-bomb bomb)			; decrement counter on bomb
    (remove-bomb-from-originator
      (originator bomb) (monitored-feature bomb))) )


  ;;
;;;;;; Modifications to "if-added-bombs" and "if-removed-bombs"
  ;;


;;; If-removed bombs are scanned only during RETRACTION of role fillers;
;;; If-added bombs are scanned only during ASSERTION of role fillers;

;;;   FEATURE-TYPE                   ROLE BOMB PLACEMENT

;;; Min Restriction:
;;;    Hit                           if-removed (unless role is monotonic)
;;;    Miss                          if-added

;;; Max Restriction: (scans fillers only if role is closed-world:)
;;;    Hit, strict                   none
;;;    Miss, strict                  none
;;;    Hit, default, open-world      none
;;;    Hit, default, closed-world    if-added
;;;    Miss, default, open-world     none
;;;    Miss, default, closed-world   if-removed (unless role is monotonic)

;;; Value Restriction
;;;    Hit, strict                   if-removed (unless role is monotonic)
;;;    Miss, strict, no closure      if-added, unless no strict upper bound
;;;    Miss, strict, closure (strict)if-added (to catch retraction followed by assertion)
;;;    Hit, default, default-closure if-added
;;;    Hit, default, strict-closure  if-removed (unless role is monotonic)
;;;    Hit, default, strict & default closure  if-added (to catch retraction followed by assertion)
;;;    Miss, default, default-closure if-removed (unless role is monotonic)
;;;    Miss, default, strict-closure if-added (to catch retraction followed by assertion)
;;;    Miss, default, no closure     if-added, unless no strict upper bound
;;;    Miss, default, strict AND default closure  if-removed (unless role is monotonic)

;;; Filled-by Feature
;;;    Hit                           if-removed (unless role is monotonic)
;;;    Miss                          if-added

;;; Assumptions:

;;;    (1) Check for new incoherence from exceeding max restriction is checked
;;;        inside of "assert-role-filler".
;;;    (2) Bombs to check for disappearance of incoherence are placed somewhere else (WHERE??).


;;; These "determine-role-bomb-queues" methods implement the decision logic in the above
;;;    table.  They are helping methods for "RESTRICTION-FEATURE.monitor-simple-feature".

(defmethod determine-role-bomb-queue ((feature MIN-RESTRICTION) satisfiedP)
  (if satisfiedP :if-removed :if-added) )

(defmethod determine-role-bomb-queue ((feature MAX-RESTRICTION) satisfiedP)
  (when (and (default-mode-p)
	     (concept-is-closed-p (relation feature)))
    (if satisfiedP :if-added :if-removed)) )

(defmethod determine-role-bomb-queue ((feature VALUE-RESTRICTION) satisfiedP)
  (if (and (default-mode-p)
	   (concept-is-closed-p (relation feature)))
      (if satisfiedP :if-added :if-removed)
      (if satisfiedP :if-removed :if-added)) )

(defmethod determine-role-bomb-queue ((feature FILLED-BY-FEATURE) satisfiedP)
  (if satisfiedP :if-removed :if-added) )

(defmethod monitor-simple-feature 
	   ((feature RESTRICTION-FEATURE) instance satisfiedP defaultP triggerInstances)
  ;; Attach role bombs to "instance" which will trigger on the relation of
  ;;    "feature" (or its base relations) if the support for "feature" changes;
  ;; Possibly plant TYPE-bombs on members of "triggerInstances"
  ;;    which will detonate if a trigger instance no longer
  ;;    supports the truth of "feature" applied to "instance";
  ;; "satisfiedP" indicates whether "feature" is or is not satisfied by "instance";
  ;; Called by "monitor-feature" during feature analysis,
  ;;    during instance classification, and during processing of defaults;
  (case (determine-role-bomb-queue feature satisfiedP)
    (:if-added 
     (plant-trigger-role-bomb 
       instance (relation feature) feature satisfiedP defaultP :if-added-p t))
    (:if-removed
     (plant-trigger-role-bomb 
       instance (relation feature) feature satisfiedP defaultP :if-removed-p t))
    (otherwise ;; don't plant any role bombs
     nil))   
  (when triggerInstances
    (let ((triggerConcept (case (feature-type feature)
			    (:value-restriction 
			     (integrity-check (null (qualification feature)))
			     (value-restriction feature))
			    ;; qualified :min-restriction:
			    (otherwise (qualification feature)))))
      ;; tricky: for :all and :some-k, "feature" is satisfied iff each of the
      ;;    trigger instances satisfy "triggerConcept"
      (plant-type-bomb
	instance feature satisfiedP defaultP
	triggerConcept satisfiedP triggerInstances))) )

(CLOS::defmethod monitor-simple-feature 
	   ((feature COMPARISON-FEATURE) instance satisfiedP defaultP triggerInstances)
  ;; Plant role bombs to monitor support for the comparison "feature" on "instance";
  (declare (ignore triggerInstances))
  (let ((relationship (relationship feature))
	bomb)
    (if satisfiedP
	(progn
	  ;; place bombs on roles:
	  (loop for r in (roles feature)
	       when (relation-p r)
	       do (plant-trigger-role-bomb 
		    instance r feature satisfiedP defaultP :if-removed-p t))
	  ;; place bomb(s) on relationship:
	  (when (not (monotonic-p relationship))	; implies not :perfect
	    (multiple-value-bind (dummy fillers)
		(apply-rolechain-role-to-instance (first (roles feature)) instance)
	      (declare (ignore dummy))
	      (setq bomb (create-remote-bomb
			  instance feature satisfiedP defaultP))
	      (loop for f in fillers
		   do (plant-remote-role-bomb f relationship bomb :if-removed-p t)) )))
	(progn
	  ;; place bombs on roles:
	  (loop for r in (roles feature)
	       when (relation-p r)
	       do (plant-trigger-role-bomb 
		    instance r feature satisfiedP defaultP :if-added-p t))
	  ;; place bomb(s) on relationship:
	  (when (not (perfect-p relationship))
	    (multiple-value-bind (dummy fillers)
		(apply-rolechain-role-to-instance (first (roles feature)) instance)
	      (declare (ignore dummy))
	      (setq bomb (create-remote-bomb
			  instance feature satisfiedP defaultP))
	      (loop for f in fillers
		   do (plant-remote-role-bomb f relationship bomb :if-added-p t)) )))) ))

(defmethod monitor-simple-feature 
	   ((feature SET-FEATURE) instance satisfiedP defaultP triggerInstances)
  ;; Don't monitor set features;
  (declare (ignore instance satisfiedP defaultP triggerInstances))
  nil )

(defun monitor-instrumented-feature (feature instance satisfiedP defaultP
                                             roleGenerators conceptTests conceptGenerators)
  ;; Situation: The outcome "satisfiedP" of evaluating "feature" on
  ;;    "instance" depends on tests collected into the three lists
  ;;    "roleGenerators", "conceptTests" and "conceptGenerators";
  ;; Plant local and/or remote bombs on appropriate instances to detect
  ;;    possible changes in support for this computation;
  ;; Note: Because we can't reliably evaulate the satisfiability of
  ;;    instrumented features within "analyze-features-p", we must be
  (when roleGenerators
    (let ((localRoles nil)
          (remoteEntries nil))
      (loop for entry in roleGenerators	      ; role generators     
	  do (cond ((eq (car entry) instance) ; trigger instance = "instance"
		    (push (cdr entry) localRoles)) ; push trigger role
		   ((constant-p (car entry))  ; Won't change  ; TAR 7/17/98
		    nil)
		   ((classified-instance-p (car entry)) ; Can monitor.
		    (push entry remoteEntries))
		   (t (grumble "Mixed classified (~S) and other instance (~S)~%~
                                Can't maintain inference ~S" 
			       instance (car entry) feature))))
      (when localRoles
        (loop for role in localRoles
              do (plant-trigger-role-bomb 
                  instance role feature satisfiedP defaultP
                  :if-added-p t :if-removed-p t)))
      (when remoteEntries
        (let ((bomb 
               (create-remote-bomb
                instance feature satisfiedP defaultP)))
          (loop for entry in remoteEntries
                do
                (plant-remote-role-bomb 
                 (car entry) (cdr entry) bomb
                 :if-added-p t :if-removed-p t))))))
  (loop for (triggerInstance concept . conceptWasSatisfiedP) in conceptTests
        do
        (if (consp concept)
          (plant-conflict-bomb
           instance feature satisfiedP defaultP
           (second concept) conceptWasSatisfiedP triggerInstance)
          (plant-type-bomb
           instance feature satisfiedP defaultP
           concept conceptWasSatisfiedP (list triggerInstance))))
  (loop for type in conceptGenerators
        do (plant-concept-generator-bomb instance type feature satisfiedP)) )

(defun monitor-feature (instance feature defaultP)
  ;; Called by "analyze-features-p" and "test&mark-feature-p";
  ;; Plant local and remote role bombs and remote type and conflict
  ;;    bombs to monitor changes in support that could affect
  ;;    this computation;
;;; IT APPEARS THAT ALL CALLS TO "monitor-feature" EMANATE FROM WITHIN THE
;;; CLASSIFIER, SO THIS CODE IS UNNECESSARY:
;  (when (query-mode-p)
;    ;; avoid planting bombs during a query:
;    (return-from monitor-feature nil))
  (let (satisfiedP)
    (if (instrument-p feature)
	(let ((*collectedRoleGenerators* nil)
	      (*collectedConceptTests* nil)
	      (*collectedConceptGenerators* nil))		       
	  (declare (special *collectedRoleGenerators* *collectedConceptTests*
			    *collectedConceptGenerators*))
	  (setq satisfiedP (feature-is-satisfied-p feature instance))
	  (monitor-instrumented-feature 
	    feature instance satisfiedP defaultP *collectedRoleGenerators*
            *collectedConceptTests* *collectedConceptGenerators*))
	(let ((*collectedTriggerInstances* nil))
	  (declare (special *collectedTriggerInstances*))
	  (setq satisfiedP (feature-is-satisfied-p feature instance))
	  (monitor-simple-feature feature instance satisfiedP defaultP
			   *collectedTriggerInstances*))) ))

  ;;
;;;;;; "compute-instrument-p" methods
  ;;

;;; These methods determine whether a feature can be monitored solely
;;;    by local role/feature bombs and easily-computed type bombs, or
;;;    if full-power instrumentation is needed (wherein the bombs
;;;    are determined as predicates are evaluating during a probe).
;;; The results of these computations are cached in the "instrument-p"
;;;    slot on each classified feature.

(defmethod compute-instrument-p ((self RESTRICTION-FEATURE))
  ;; max, value, or filled-by restriction
  (or (instrumented-role-p (relation self))
      (qualification self)) )

(defmethod compute-instrument-p ((self MIN-RESTRICTION))
  (instrumented-role-p (relation self)) )

(defmethod compute-instrument-p ((self NOT-FILLED-BY-FEATURE))
  t )

(defmethod compute-instrument-p ((self COMPARISON-FEATURE))
  (or (instrumented-role-p (relationship self))
      (loop for r in (roles self)
	   thereis (and (typep r 'TBOX-RELATION)
			(instrumented-role-p r)))) )

(defmethod compute-instrument-p ((self REIFIED-COMPARISON-FEATURE))
  ;; Assumes that we don't know how to easily monitor an :exists feature;
  t )

(defmethod compute-instrument-p ((self COMPUTED-FEATURE))
  ;; TO DO: CONSIDER SEARCHING FOR THE ABSENCE OF CALLS TO LOOM
  ;;    PREDICATE ACCESSORS INSIDE OF THE LISP CODE;
  (case (feature-type self)
    (:satisfies
     (loop for dep in (concept-references self)
	  thereis (not (read-only-p dep))))
    (otherwise
     t)) )

(defun instrumented-role-p (role)
  ;; Helping function for "compute-instrument-p";
  ;; Return t if monitoring the generation of role fillers
  ;;    for the relation "role" requires instrumentation;
  (not (or (and (or (primitive-p role)
	            (eq (defined-as role) :inverse))
                (null (antecedents role)))      ; RMM 1/25/94
	   (perfect-p role))) )


#|

TO DO:

FINISH WRITING "detonate-conflict-bomb"

ADD LOGIC FOR CONCEPT GENERATOR BOMBS

ADD SOMETHING TO MONITOR ADDING AND DELETING TUPLES

FIGURE OUT WHETHER WE CAN INVENT PERMANENT BOMBS -- THEY
DON'T GET REMOVED AND REPLANTED OVER AND OVER;

CONSIDER ELIMINATING THE CODE THAT CHECKS FOR DUPLICATE
TYPE BOMBS -- IT MAY JUST BE SLOWING THINGS DOWN.

|#
