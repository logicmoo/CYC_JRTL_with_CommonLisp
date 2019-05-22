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

;;; QUEUES.LISP (ABOX)

;;; Contains the logic which moves modified database instances through
;;;    a sequence of queues, so that their TYPEs can be recomputed;

(in-package "LOOM")

;(export '())


  ;;
;;;;;; Control and Management of Queues
  ;;

#+CLTL2 (declaim (inline repost-instance))
#-CLTL2 (proclaim '(inline repost-instance))
(defun repost-instance (instance newQueueLevel modificationSummary)
  ;; Situation: "instance" has just been processed at some queue
  ;;    level, and now is being reposted to a higher queue;
  ;; Set its queue level to nil, and then call "post-instance";
  ;; We save a micro-second by passing "modificationSummary" to this macro;
  ;; Note: Logic borrowed from "post-instance";
  (setf (queue-level modificationSummary) newQueueLevel)
  (push instance (aref *match-queues* newQueueLevel)) )

#+CLTL2 (declaim (inline unpost-instance))
#-CLTL2 (proclaim '(inline unpost-instance))
(defun unpost-instance (instance)
  ;; Remove "instance" from whatever queue it is on;
  ;; This is accomplished by discarding its modification summary,
  ;;    which indicates that it is no longer considered to be a member
  ;;    of any queue;
  (discard-modification-summary (modification-summary instance))
  (setf (modification-summary instance) nil) )





(defun rerecognize-instances ()
  ;; Recompute the TYPEs of all db-instances whose TYPEs have become
  ;;    invalid, and generate any appropriate side-effects;
  ;; Nothing happens if *retraction-queue* is empty;
  ;; First, down-grade (make-more-general) the TYPEs of instances for
  ;;    which propositions have been retracted, and withdraw support from
  ;;    adjacent instances;
  ;; Next, upgrade the TYPEs of instances which have been downgraded, or
  ;;    for which propositions have been asserted -- upgrading calls
  ;;    the pattern matcher;
  ;; Note: The initial entries onto the queues spring only from the functions
  ;;    "post-modified-instance" and "post-non-analyzable-modified-instance";
  ;; Comment: A goto :restart at the end of a cycle can happen for lots of
  ;;    different reasons: During matching
  ;;    - a skolem instance was generated;
  ;;    - a new tbox concept was generated;
  ;;    - something got marked incoherent, either because of an asserted conjunct,
  ;;         or because of propagating a strict conjunct, and we want to recompute
  ;;         its type (to make the type computation more deterministic);
  ;;    - a new concept was generated, and instances of its parent
  ;;         concepts were reinitialized;
  (prog ()
    :restart
    (repeatedly-process-queue
     $STRICT-RETRACTION-Q$ #'process-strict-retraction-queue)
    (repeatedly-process-queue
     $STRICT-ASSERTION-Q$ #'process-strict-assertion-queue)
    (when (aref *match-queues* $STRICT-RETRACTION-Q$) (go :restart))
    (let ((*defaultModeP* t))
      (repeatedly-process-queue
       $DEFAULT-RETRACTION-Q$ #'process-default-retraction-queue)
      (process-closed-world-queue         ; RMM 3/18/94
       (aref *match-queues* $DEFAULT-ASSERTION-Q$))
      (repeatedly-process-queue
       $DEFAULT-ASSERTION-Q$ #'process-default-assertion-queue) )
    (when (or (aref *match-queues* $STRICT-RETRACTION-Q$)
	      (aref *match-queues* $DEFAULT-RETRACTION-Q$))
	      (go :restart))
    ) )

(defun repeatedly-process-queue (queueLevel queueProcessingFunction)
  ;; Helping function for "rerecognize-instances";
  ;; Find the queue indicated by "queueLevel", and repeatedly apply
  ;;    "queueProcessingFunction" to it until it is empty;
  ;; The indicated queue is scanned repeatedly because "queueProcessingFunction"
  ;;    may refill it during its own execution;
 #L:trace-queues
  (let ((shortQueue (aref *match-queues* queueLevel)))
    (when (> (length shortQueue) 3)
      (setq shortQueue (copy-list shortQueue))
      (setf (cdddr shortQueue) :more))
    (trace-values "repeatedly-process-queue" queueLevel shortQueue))
  (let (queue)
    (loop
      (setq queue (aref *match-queues* queueLevel))
      (when (null queue)			; exit loop when no more new instances
	(return nil))
      (when (find-if #'discarded-instance-with-histories-p queue)
        (setq queue (remove-if #'discarded-instance-with-histories-p queue)))
      (setf (aref *match-queues* queueLevel) nil)
      (funcall queueProcessingFunction queue)) ))

(defun process-strict-retraction-queue (queue)
  ;; Situation "queue" represents the current contents of $STRICT-RETRACTION-Q$;
  ;; For each member of the retraction queue, analyze changes to its
  ;;    roles, and if necessary, replace its type with a rock bottom type
  ;;    (one guaranteed not to include circular support);
  ;; Instances that have not previously been matched also appear on this queue;
  ;; Stop when the queue is empty (withdrawing inferences can refill it during
  ;;    this process)
  ;; We process the queue in phases, so that instances
  ;;    entering a queue in the middle of a processing phase wait
  ;;    for rematching until the previous phase is completed;
  ;; Note: "never-before-matched-p" slot is set in "create-loom-instance";
  (let (modificationSummary)
    (loop for instance in queue
	  do
	  (when (and (setq modificationSummary (modification-summary instance))
		     (eql (queue-level modificationSummary)
			  $STRICT-RETRACTION-Q$))
	    (integrity-check (not (rock-bottom-p modificationSummary)))
	    (if (never-before-matched-p modificationSummary)
		(progn
		  (compute-never-before-matched-instance-type instance)
		  (setf (never-before-matched-p modificationSummary) nil)
		  ;; set these because we didn't call "analyze-features":
		  (setf (starting-queue-level modificationSummary)
			$STRICT-ASSERTION-Q$)
		  (finish-retraction-processing instance modificationSummary))
		(progn
		  ;; reset "features-analyzed-p" in case "instance" was
		  ;;     reposted from higher queue:
		  (setf (features-analyzed-p modificationSummary) nil)
		  (if (analyze-features-p instance $STRICT-RETRACTION-Q$)
		      (progn
			(recompute-retracted-instance-type instance)
			(finish-retraction-processing instance
						      modificationSummary))
		      (repost-instance 
		       instance $STRICT-ASSERTION-Q$ modificationSummary))))))
    ))

(defun finish-retraction-processing (instance modificationSummary)
  ;; Helping function for "process-strict-retraction-queue";
  ;; Post "instance" to a new queue, or unpost it;
  (if (incoherent-instance-p instance)
      ;; if incoherent, abandon matching "instance", but see if it
      ;;    needs to be posted to $ACT-ON-Q$:
      (abandon-recognizing-incoherent-instance instance)
      ;; remove from all points in retraction queue
      (repost-instance instance $STRICT-ASSERTION-Q$ modificationSummary)) )

(defun process-strict-assertion-queue (queue)
  ;; Situation "queue" represents the current contents of
  ;;    $STRICT-ASSERTION-Q$;
  ;; Analyze assertions to members of the strict assertion queue,
  ;;    and recompute their types if necessary;
  ;; Repost to default queue or act-on queue if warranted;
  ;; Stop when the queue is empty (forward inferences can refill it during
  ;;    this process)
  ;; We process the queue in phases, so that instances
  ;;    entering a queue in the middle of a processing phase wait
  ;;    for rematching until the previous phase is completed;
  (let (modificationSummary regressToRetractionQueue)
    (loop for instance in queue
	  do
	  (when (and (setq modificationSummary (modification-summary instance))
		     (eql (queue-level modificationSummary)
			  $STRICT-ASSERTION-Q$)
		     (neq :abandoned-by-merge (db-type instance)))
	    (if (or (features-analyzed-p modificationSummary)
		    (analyze-features-p instance $STRICT-ASSERTION-Q$))
		(progn
		  (setq regressToRetractionQueue
			(continue-assertion-processing instance
						       modificationSummary))
		  (when (eq regressToRetractionQueue :retraction)
		    (return-from process-strict-assertion-queue nil)))
		(repost-instance 
		 instance $DEFAULT-RETRACTION-Q$ modificationSummary))
	    )) ))


(defun continue-assertion-processing (instance modificationSummary)
  ;; Helping function for "process-strict-assertion-queue";
  ;; Post "instance" to a the same or higher queue, or unpost it; or return
  ;;    :retraction indicating that we have to start matching instances all
  ;;    over again;
  (let ((repostToSameQueueP (recompute-asserted-instance-type-p instance)))
    (when (null repostToSameQueueP)
      ;; we are leaving the strict assertion queue -- replant bombs on
      ;;    strict hits and misses;
      (loop for f in (strict-feature-hits modificationSummary)
	    do (monitor-feature instance f nil))
      (loop for f in (strict-feature-misses modificationSummary)
	    do (monitor-feature instance f nil))
      (setf (strict-feature-hits modificationSummary) nil)
      (setf (strict-feature-misses modificationSummary) nil))
    (cond
      ((or (eq (retraction-message modificationSummary) :conjunct-clipped)
	   ;; Can this cause infinite loops?  It is used to handle the situation
	   ;;   where a retraction requeueing is done because of strict assertions
	   ;;   made during processing of relations that are referenced in
	   ;;   computed restrictions.
	   (eql (queue-level modificationSummary) $STRICT-RETRACTION-Q$))
       ;; discard :conjunct-clipped indicator:
       (setf (retraction-message modificationSummary) nil)
       ;; then exit back to the strict retraction queue:
       :retraction)
      ((incoherent-instance-p instance)
       ;; if incoherent, abandon matching "instance", but see if it
       ;;    needs to be posted to $ACT-ON-Q$:
       (abandon-recognizing-incoherent-instance instance))
      (repostToSameQueueP
       (repost-instance instance $STRICT-ASSERTION-Q$ modificationSummary))
      (t
       ;; look for bomb detonation on any conjuncts that were not present
       ;;    in the original type:
       (detonate-type-bombs-on-new-conjuncts
	 instance (db-type instance) (original-type modificationSummary))
       (repost-instance instance $DEFAULT-ASSERTION-Q$ modificationSummary)))) )

(defun abandon-recognizing-incoherent-instance (instance)
  ;; if "instance" is incoherent, abandon recognizing "instance",
  ;;     but see if it needs to be posted to $ACT-ON-Q$:
  (let ((modificationSummary (modification-summary instance)))
    (if (and modificationSummary 
	     (neq (original-type modificationSummary)
		  (db-type instance)))
	(repost-instance instance $ACT-ON-Q$ modificationSummary) 
	(unpost-instance instance)) ))

(defun act-on-modified-types ()
  ;; For each instance on the modified-type queue:
  ;;   Transfer features stored on "default-if-added-bombs" and
  ;;       "default-if-removed-bombs" in the modification summary onto the slots
  ;;       "if-added-bombs" and "if-removed-bombs";
  ;; Tricky: For all other recognition queues, an instance is guaranteed
  ;;    not to reside on a queue lower than the one being processed.  For
  ;;    this queue, production rule firing may cause instances to get
  ;;    placed on a lower queue than this.  Hence, we include a special
  ;;    check that the queue level of an instance
  ;; BUG???: INSTANCES WITH TYPE THING AND NOTHING ELSE DON'T GET PLACED
  ;;    ONTO THIS QUEUE;
  (let (oldType newType)
    (loop for instance in (aref *match-queues* $ACT-ON-Q$)
	  do 
	  (let ((modificationSummary (modification-summary instance))
		(previousInstance (previous-instance instance)))
	    (when (and modificationSummary
                       (eql (queue-level modificationSummary) $ACT-ON-Q$))
	      (emit-classify-string  "*" :emit-match-stars)
	      (setq oldType (original-type modificationSummary))
	      (when (or (null previousInstance)
			(not (eql (time-point previousInstance)
                                  *agent-time*)))
		;; insure that "oldType" is recorded in a history instance:
		(create-before-recognition-history-instance instance))
	      (setq newType (db-type instance))
	      (integrity-check (neq oldType newType)) 
	      ;; place on execution queue:	      
	      (when (display-match-changes-p instance)
		(display-classifier-match-changes instance oldType newType))
	      (post-modified-rete-instance instance)))
	  (unpost-instance instance))
    (setf (aref *match-queues* $ACT-ON-Q$) nil) ))

(defun display-match-changes-p (instance)
  ;; Return t if a match carat should be emitted for "instance";
  (declare (ignore instance))
  (and (member :display-match-changes *loom-match-features*)
       (not (member :suppress-diehard-output *loom-dialogue-features*))
       ;;(not (typep instance 'TBOX-CONCEPT))  ; These aren't DB-INSTANCES anymore.
       ;;(not (typep instance 'CONTEXT))
       )
  )

(defun display-classifier-match-changes (instance oldType newType)
  ;; Print the concepts that have entered and exited the type of "instance";
  (let ((visibleContexts (context-precedence-list *context*)))
    (flet ((collect-ancestors (type)
	     (let (result)
	       (if (consp type)
		   (loop for c in type
		       do (unless (or (system-defined-name-p c)
				      (null (name c))
				      (not (member (context c) visibleContexts)))
			    (pushnew c result))
			  (loop for super in (all-super-concepts c)
			      unless (or (system-defined-name-p super)
					 (null (name c))
					 (not (member (context super) visibleContexts)))
			      do (pushnew super result)))
		 (progn
		   (unless (or (system-defined-name-p type)
			       (not (member (context type) visibleContexts)))
		     (pushnew type result))
		   (loop for super in (all-super-concepts type)
		       unless (or (system-defined-name-p super)
				  (not (member (context super) visibleContexts)))
		       do (pushnew super result))))
	       result)))
      (let* ((oldConcepts (collect-ancestors oldType))
	     (newConcepts (collect-ancestors newType))
	     (exitConcepts (set-difference oldConcepts newConcepts))
	     (entryConcepts (set-difference newConcepts oldConcepts)))
	(when (or exitConcepts entryConcepts)
	  (reset-dot-counter)
	  (inform "~%Recognition changes for state ~D in context ~A:~%"
		  *agent-time* (name *context*))
	  (loop for exitConcept in exitConcepts
	      as firstTimeP = t then nil
	      do (inform "   ~:[     ~;exit:~]  ~S~20,5T~S~%"
			 firstTimeP (identifier instance) exitConcept))
	  (loop for entryConcept in entryConcepts
	      as firstTimeP = t then nil
	      do (inform "   ~:[      ~;entry:~]  ~S~20,5T~S~%"
			 firstTimeP (identifier instance) entryConcept))) ))))


  ;;
;;;;;; Queue Posting Functions
  ;;

;;; Posting of modified db-instances

;;; The two routines below are producers of entries posted on the list
;;;    *retraction-queue*.  Entries are consumed by the
;;;    function "analyze-modified-instances", and used by
;;;    "detect-bad-hits" and "detect-bad-misses".

(defun find-or-create-modification-summary (instance)
  ;; Helping function for "post-non-analyzable-modified-instance", and
  ;;    "post-modified-instance";
  ;; If "instance" already has a modification summary, return it;
  ;; Otherwise, create one, assign it to "instance", and return it;
  ;; Side-effect: set the global variable *match-is-pending-p*, which informs
  ;;    the function "match&perform-all" that something has been posted;
  (setq *match-is-pending-p* t)
  (or (modification-summary instance)
      (create-modification-summary instance)) )

(defun not-yet-recognized-p (instance)
  ;; Return t if "instance" is not yet posted to a recognition queue,
  ;;    or if its posted hasn't yet been processed;
  (let ((modificationSummary (modification-summary instance)))
    (or (null modificationSummary)
        (null (queue-level modificationSummary))
        (and (= (queue-level modificationSummary) $STRICT-RETRACTION-Q$)
             (not (rock-bottom-p modificationSummary)))) ))

(defun post-non-analyzable-modified-instance 
       (instance assertion/retraction defaultModeP)
  ;; Called by "assert-conjunct", "retract-conjunct", "assert-feature",
  ;;    "retract-feature", "propagate-forward-inferences-to-filler", and
  ;;    others;
  ;; Post "instance" to assertion or retraction queue, or if "defaultModeP"
  ;;    to the default retraction queue;
  ;; Set "recompute-retracted-type-p" or "recompute-asserted-type-p" in the
  ;;    modification summary of "instance", which forces a recomputation of
  ;;    the type of "instance";
  #L:trace-queues (trace-values "post-non-ana-mod-inst" instance assertion/retraction defaultModeP)
  (macrolet ((set-starting-level
	         (queueIndicator)
	       `(when (or (null (starting-queue-level modificationSummary))
			  (< ,queueIndicator (starting-queue-level modificationSummary)))
		  (setf (starting-queue-level modificationSummary) ,queueIndicator))))
    (let* ((modificationSummary
            (find-or-create-modification-summary instance))
	   (queueLevel
            (if defaultModeP
              (progn
                ;; THIS INTEGRITY CHECK IS NOW INVALID, BUT MAY BECOME SO AGAIN IF
                ;;    WE DECIDE WE CAN'T ANALYZE DEFAULT MISSES:
                ;		   (integrity-check (eq assertion/retraction :retraction))
                (case assertion/retraction
                  (:assertion
                   (set-starting-level $DEFAULT-ASSERTION-Q$)
                   $DEFAULT-ASSERTION-Q$)
                  (:retraction
                   (set-starting-level $DEFAULT-RETRACTION-Q$)
                   $DEFAULT-RETRACTION-Q$)))
              (case assertion/retraction
                (:assertion
                 (cond
                  ((default-mode-p)
                   ;; TO DO: FIGURE OUT WHAT WE SHOULD REALLY DO HERE:
                   (set-starting-level $DEFAULT-RETRACTION-Q$)
                   $DEFAULT-ASSERTION-Q$)
                  ((incoherent-instance-p instance)
                   ;; exit if "instance" has undergone at least some recognition:
                   (when (not (not-yet-recognized-p instance))
                     (return-from post-non-analyzable-modified-instance nil))
                   (setf (rock-bottom-p modificationSummary) nil)
                   (set-starting-level $STRICT-RETRACTION-Q$)
                   $STRICT-RETRACTION-Q$)
                  (t
                   (set-starting-level $STRICT-ASSERTION-Q$)
                   $STRICT-ASSERTION-Q$)))
                (:retraction
                 ;; don't post again if "instance" was already retracted:
                 (when (rock-bottom-p modificationSummary)
                   (return-from post-non-analyzable-modified-instance nil))
                 (set-starting-level $STRICT-RETRACTION-Q$)
                 $STRICT-RETRACTION-Q$)))))
      (emit-classify-string  "Q" :emit-match-stars)
      (post-instance instance queueLevel) )))

(defun post-modified-instance (instance features wasSatisfiedP defaultP)
  ;; Called by the macro "scan-role-bombs" inside of "assert-half-role-filler"
  ;;    and "retract-half-role-filler";  Also called by
  ;;    "propagate-forward-inferences-to-filler";
  ;; If "defaultP" or in default mode, post "instance" to the default
  ;;    retraction or default assertion queue; Otherwise, post to :retraction 
  ;;    queue if "wasSatisfiedP", and otherwise post to :assertion queue;
  ;; Post "features" (which might be null or a single feature) to the
  ;;    appropriate queue of to-be-probed features;
 #L:trace-queues (trace-values "post-modified-instance" instance features wasSatisfiedP)
  (macrolet ((push-features
	         (queue)
	       `(if (atom features)
                  (push features (,queue modificationSummary))
                  (setf (,queue modificationSummary)
                        (bag-append features
                                    (,queue modificationSummary))))))
    
    (let ((modificationSummary
           (find-or-create-modification-summary instance)))
      (emit-classify-string  "q" :emit-match-stars)
      (cond
       ((or defaultP (default-mode-p))
        (when features 
          (if wasSatisfiedP
            (progn
              (push-features to-be-probed-default-hits)
              (post-instance instance $DEFAULT-RETRACTION-Q$))
            (let ((queueLevel (queue-level modificationSummary)))
              (push-features to-be-probed-default-misses)
              ;; if "instance" is already at or beyond the default assertion
              ;;    queue, post to that queue.  Otherwise, be sure to withdraw
              ;;    defaults before posting to default assertion queue (because
              ;;    closed world processing could contradict existing defaults):
              (if (or (null queueLevel)         ; RMM 3/18/94
                      (< queueLevel $DEFAULT-ASSERTION-Q$))
                (post-instance instance $DEFAULT-RETRACTION-Q$)
                (post-instance instance $DEFAULT-ASSERTION-Q$))))))
       (wasSatisfiedP				; :retraction
        (unless (rock-bottom-p modificationSummary)
          (push-features to-be-probed-feature-hits)
          (post-instance instance $STRICT-RETRACTION-Q$)))
       (t					; :assertion
        (push-features to-be-probed-feature-misses)
        (post-instance instance $STRICT-ASSERTION-Q$)
        (when (and (incoherent-instance-p instance)
                   (not (rock-bottom-p modificationSummary)))
          ;; if incoherent, compute rock bottom before analyzing assertion:
          (post-instance instance $STRICT-RETRACTION-Q$)))) )))

(defun post-incoherent-instance (instance reason)
  ;; Situation:  A constraint violation was detected on "instance" during
  ;;    the assertion of a role filler BUT we don't know where we are
  ;;    in the recognition process;
  ;; If "instance" is on an advanced queue, unpost it;
  ;; Otherwise, post "instance" on the retraction queue, and mark it so that
  ;;    the matcher is forced to check for incoherence;
  (throw-if-incoherent-world instance)
  (if (not-yet-recognized-p instance)
    (progn
      (post-non-analyzable-modified-instance instance :retraction nil)
      (setf (retraction-message (modification-summary instance))
            :detect-incoherence) )
    (progn
      (mark-instance-incoherent instance reason)
      (abandon-recognizing-incoherent-instance instance))) )

(defun post-instance (instance proposedQueueLevel)
  ;; Post "instance" on the modification-queue indicated by
  ;;    "queueLevel" unless its already on a lower queue;
  ;; Also, set the flags "analyze-assertions-p" and "analyze-defaults-p"
  ;;    to retain memory of posting to strict-assertion or default queues;
  ;; Note: Assumes that a modification summary already exists for "instance";
  (integrity-check (classified-instance-p instance))
  (let* ((modificationSummary (modification-summary instance))
	 (currentQueueLevel (queue-level modificationSummary)))
 #L:trace-queues (trace-values "post-instance" instance proposedQueueLevel currentQueueLevel)
    (when
      (or (null currentQueueLevel)
	  (< proposedQueueLevel currentQueueLevel))
      (setf (queue-level modificationSummary) proposedQueueLevel)
      (push instance (aref *match-queues* proposedQueueLevel))) ))

(defun unpost-all-instances ()
  ;; Called by "reset-database-variables";
  ;; Unpost all instances in all match queues;
  (loop for index from $STRICT-RETRACTION-Q$ to $ACT-ON-Q$
	do (loop for i in (aref *match-queues* index)
		 when (modification-summary i)
		 do (unpost-instance i))) )


  ;;
;;;;;; Analysis of Role Retractions and Assertions
  ;;

;;; Functions for analyzing the currency of feature-hits and feature-misses
;;;    lists after modification of a LOOM instance.
;;; Tricky: The probe functions invoked by calling "feature-is-satisfied-p"
;;;    don't check to see if the feature being tested might be inherited
;;;    (and hence satisfied) by the instance.  During instance classification,
;;;    the classifier makes the inheritance check (via marker propagation)
;;;    prior to calling the probe functions.  During feature analysis (below)
;;;    we deliberately do NOT check for inheritance of features.  This
;;;    allows us to ignore the type of the instance, and hence avoids the
;;;    possibility of circular support for a feature.  The feature analysis
;;;    is therefore conservative -- it may return false positives, requiring
;;;    rematching when in fact none is required.
;;; Also tricky: Probe functions called by "feature-is-satisfied-p" cannot be
;;;    allowed to see derived role fillers during feature analysis.  We solve
;;;    this by pointing the (unique) instance of type UNELABORATED-INSTANCE
;;;    to the instance being analyzed, and asking the unelaborated instance
;;;    for its slot fillers.



(defun prepare-for-recompute-retracted-type (instance)
  ;; Helping function for "analyze-features";
  ;; Withdraw strict and default information in preparation for retracting
  ;;    the type of "instance";
  ;; Set the starting level to the strict retraction queue;
  (withdraw-defaults instance)
  (remove-all-local-role-bombs instance t t)
  ;; remove all type and conflict bombs, since the upcoming
  ;;    rock-bottom type won't depend on any dependency bombs;
  (deactivate-all-bombs-at-originator instance) )

(defun prepare-for-recompute-asserted-type (instance)
  ;; Helping function for "analyze-features";
  ;; Withdraw default information (and some strict information) in preparation
  ;;    for recomputing the strict type of "instance";
  ;; Set the starting level to the strict assertion queue;
  (withdraw-defaults instance)
  ;; clear strict if-added features, since they may or may not still be valid:
  (remove-all-local-role-bombs instance t nil) )

(defun prepare-for-recompute-default-type (instance)
  ;; Helping function for "analyze-features";
  ;; Withdraw default information (and some strict information) in preparation
  ;;    for asserting the type of "instance";  Set recompute flags;
  ;; Set the starting level to the default assertion queue;
  ;; Note: We don't bother placing "instance" on the default retraction
  ;;    queue, since that queue exists only to hold unanalyzed instances;
  (withdraw-defaults instance) )

(defun analyze-features-p (instance queueLevel)
  ;; Analyze features:
  ;;    If retraction queue -- "to-be-probed-feature-hits"
  ;;       assertion queue -- "to-be-probed-feature-misses"
  ;;       default retraction -- "to-be-probed-default-hits"
  ;;       default assertion -- "to-be-probed-default-misses"
  ;; Return t if analysis indicates rematch needed at the current level;
  ;; Before returning t, withdraw any derived propositions for "instance"
  ;;    that pertain to levels above "queueLevel", e.g., if the queue level
  ;;    is at or below $DEFAULT-RETRACTION-Q$, withdraw defaults attached
  ;;    to "instance";
  ;; The value of "starting-queue-level" (set by
  ;;    "post-non-analyzable-modified-instance") overrides the analysis if
  ;;    it is not higher than "queueLevel";
  ;; Nullify "(starting-queue-level modificationSummary)" (it may be reset
  ;;    later in the match cycle if incoherence is detected);
  ;; Note: Binding the special variable *analysisModeP* can cause
  ;;    "find-type&residue-features" to return a rock bottom or strict
  ;;    type rather than the full type;
  ;; TO DO: CACHE CALLS TO "compute-rock-bottom-type" MADE DURING ANALYSIS;
  ;; TO DO: SLOT READS TO OTHER THAN "instance" CAN RETURN DERIVED FILLERS,
  ;;    POSSIBLY YIELDING AN UNSOUND ANALYSIS -- FIX THIS!!!
  (let* ((modificationSummary (modification-summary instance))
	 (startingQueueLevel (starting-queue-level modificationSummary))
	 (*analysisModeP* queueLevel)
	 (resultP nil))
    (declare (special *analysisModeP*)
	     (inline prepare-for-recompute-retracted-type
		     prepare-for-recompute-asserted-type
		     prepare-for-recompute-default-type))
    (integrity-check (null (features-analyzed-p modificationSummary)))
    (setf (starting-queue-level modificationSummary) nil)
    (setf (parent-instance *the-unelaborated-instance*) instance)
    (case queueLevel
      (0 (let ((hits (to-be-probed-feature-hits modificationSummary)))
	   (setq resultP
		 (or (eql startingQueueLevel queueLevel)
		     (loop for feature in hits
			  thereis (not (feature-is-satisfied-p 
					 feature *the-unelaborated-instance*)))))
	   (when (incoherent-instance-p instance)
	     (setq resultP t))
	   (if resultP
	       (prepare-for-recompute-retracted-type instance) 
	       ;; not retracting, reestablish bombs that monitor the feature hits:
	       (loop for feature in hits
		     do (monitor-feature instance feature nil)))))
      (1 (let ((misses (to-be-probed-feature-misses modificationSummary)))
	   (setq resultP
		 (or (eql startingQueueLevel queueLevel)
		     (loop for feature in misses
			  thereis (feature-is-satisfied-p 
				    feature *the-unelaborated-instance*))))
	   (if resultP
	       (prepare-for-recompute-asserted-type instance) 
	       ;; not asserting, reestablish bombs that monitor the feature misses:
	       (loop for feature in misses
		     do (monitor-feature instance feature nil)))))
      (2 (let ((hits (to-be-probed-default-hits modificationSummary)))
	   (integrity-check (default-mode-p))
;; CLOSED-WORLD PROCESSING INVALIDATES THIS TEST:
	   (setq resultP
;		 (or (eql startingQueueLevel queueLevel)
;		     (loop for feature in hits
;			  thereis (not (feature-is-satisfied-p 
;					 feature *the-unelaborated-instance*))))
                 t) ;; RMM 3/18/93
	   (if resultP
	       (prepare-for-recompute-default-type instance) 
	       ;; not retracting, reestablish bombs that monitor the default hits:
	       (loop for feature in hits
		     do (monitor-feature instance feature t)))))
      (3 (let ((misses (to-be-probed-default-misses modificationSummary)))
	   (integrity-check (default-mode-p))
	   (setq resultP
		 (or (eql startingQueueLevel queueLevel)
		     (loop for feature in misses
			  thereis (feature-is-satisfied-p 
					 feature *the-unelaborated-instance*))))
	   (if resultP
	       nil				; no-op
	       ;; not asserting, reestablish bombs that monitor the default misses:
	       (loop for feature in misses
		     do (monitor-feature instance feature t))))))
    (when resultP
      (setf (features-analyzed-p modificationSummary) t)
      t) ))

(defmethod get-slot-value ((self UNELABORATED-INSTANCE) role)
  ;; Depending on the value of *analysisModeP*, return only the 
  ;;    asserted fillers, asserted plus strict, or all
  ;;    fillers of the role with predicate symbol "slotName";
  ;; Note: "extendedSlotName" has the form <foo-cxt>^<name>;
  ;; TO DO: DURING FEATURE ANALYSIS SLOT READS TO OTHER THAN "instance" CAN
  ;;    RETURN DERIVED FILLERS, POSSIBLY YIELDING AN UNSOUND ANALYSIS -- FIX THIS!!!
  (slot-values-to-value
   (get-unelaborated-instance-slot-values self role)
   role) )

(defmethod get-slot-values ((self UNELABORATED-INSTANCE) role)
  ;; Do what it says in the comment for "UNELABORATED-INSTANCE.get-slot-value",
  ;;    but return a list of values even when "role" is single-valued;
  (get-unelaborated-instance-slot-values self role) )

(defun get-unelaborated-instance-slot-values (self role)
  ;; Called by "UNELABORATED-INSTANCE.get-slot-value(s)";
  ;; Do what it says in the comment for that method;
  (declare (special *analysisModeP*))
  (let* ((realInstance (parent-instance self))
         (roleName (name role))
         (roleFillersRecord 
          (cdr (assoc role (role-fillers-table realInstance)))))
    (if roleFillersRecord
      (case *analysisModeP*
        (0					; $STRICT-RETRACTION-Q$
         (asserted-fillers roleFillersRecord))
        (3					; $DEFAULT-ASSERTION-Q$
         (access-in-ctxt (dynamic-slot-value realInstance roleName)         ;  TAR 9/12/94
                         nil (home-ctxt realInstance)))         ;  TAR 10/11/94
        (otherwise				; $STRICT-ASSERTION-Q$ or $DEFAULT-RETRACTION-Q$
         (bag-append
          (asserted-fillers roleFillersRecord)
          (strict-fillers roleFillersRecord))))
      (access-in-ctxt 
       (dynamic-slot-value realInstance roleName) nil (home-ctxt realInstance))) ))

(defmethod find-type&residue-features ((self UNELABORATED-INSTANCE))
  ;; Called by "has-instance-p" during backchaining and by probe functions
  ;;    during backchaining or classification or by way of "analyze-features";
  ;; We are in the middle of feature analysis ("analyze-features" is
  ;;    on the stack) -- return either a rock bottom type or the strict
  ;;    type;
  (find-type&residue-features (parent-instance self)) )

(defmethod get-cached-types ((self UNELABORATED-INSTANCE))
  ;; Called by "has-instance-p" during backchaining and by probe functions
  ;;    during backchaining or classification or by way of "analyze-features";
  ;; We are in the middle of feature analyzis ("analyze-features" is
  ;;    on the stack) -- return either a rock bottom type or the strict
  ;;    type;
  (get-cached-types (parent-instance self)) )


;;; TO DO:

#|

|#
