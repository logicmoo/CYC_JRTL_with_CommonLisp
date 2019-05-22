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

;;; HISTORIES.LISP (ABOX)

;;; Contains code for maintaining histories of instances and indices.

(in-package "LOOM")

(export '( label-time-point label-time-interval get-time-point 
	  set-history-limit unset-history-limit get-history-limit
	  ))


  ;;
;;;;;; Time labels
  ;;

(defun label-time-point (label timePoint)
  "Assign the time point `timePoint' to the label `label'."
  (let ((oldLabelValue (get-time-point label)))
    (when oldLabelValue				; eliminate old mapping
      (setf (gethash timePoint *inverse-time-point-table*) nil))
    (setf (gethash label *time-point-table*) timePoint)
    (setf (gethash timePoint *inverse-time-point-table*) label) ))

(defun label-time-interval (label timeInterval)
  "Assign the time interval `timeInterval' to the label `label'."
  (declare (ignore label timeInterval))
  "NOT YET IMPLEMENTED" )

(defun get-time-point (timeLabel &key no-error-p)
  "Return the integer representation of a time point."
  (if (integerp timeLabel)
      timeLabel
      (or (gethash timeLabel *time-point-table*)
	  (progn
	    (unless no-error-p
	      (complain "~%Error: ~S is not a defined label for a time point"
			timeLabel))
	    nil))) )

(defun generate-time-point-expression (timePoint)
  ;; Return the label for "timePoint" if one exists; Otherwise return
  ;;    "timePoint";
  (or (gethash *inverse-time-point-table* timePoint)
      timePoint) )


  ;;
;;;;;; History limits
  ;;

(defun set-history-limit (timePoint)
  "Maintain histories as far back as `timePoint' (and no further).  Return the
   new limit point, or null if an error occurred."
  (let ((newLimitPoint (get-time-point timePoint))	; convert to integer
	(earliestRecordedHistory (or *history-limit* (1- *agent-time*))))
    (when (null newLimitPoint)
      (complain "~%Invalid time point ~S, not resetting history limit." timePoint)
      (return-from set-history-limit nil))
    (when (and (eql *generating-histories-p* t)	; TAR 5/24/93
	       (eql newLimitPoint *history-limit*))	; no change
      (return-from set-history-limit newLimitPoint))
    (cond
      ((< newLimitPoint earliestRecordedHistory)
       (complain "~%Histories aren't recorded as far back as ~S.  Resetting
                  history limit to ~S" newLimitPoint earliestRecordedHistory)
       (setq newLimitPoint earliestRecordedHistory))
      ((> newLimitPoint *agent-time*)
       (complain "~%Cannot set history limit to future time point.  Setting history~%   ~
                 limit to *agent-time* = ~S." *agent-time*)
       (setq newLimitPoint *agent-time*))
      ((and (inside-of-transaction-p)
	    (> newLimitPoint *history-limit*))
       (complain "~%Can't reset history limit inside of a transaction")
       (return-from set-history-limit nil)))
    (recompute-list-of-oldest-histories newLimitPoint)
    (recompute-list-of-oldest-indices newLimitPoint)
    (setq *history-limit* newLimitPoint)
    (setq *generating-histories-p* t)
    newLimitPoint ))

(defun unset-history-limit ()
  "Turn off history maintenance."
  ;; For each history instance, either place it in one of the lists
  ;;    *list-of-*agent-time-1*-histories* or *list-of-*agent-time*-histories*
  ;;    or else discard it;
  (when (null *generating-histories-p*)
    (return-from unset-history-limit nil))
  (let ((now *agent-time*)
	(now-1 (1- *agent-time*))
	timePoint)
    (loop for h in *list-of-oldest-histories*
	 do
	 (setq timePoint (time-point h))
	 (cond
	   ((= timePoint now)
	    (push h *list-of-*agent-time*-histories*))
	   ((= timePoint now-1)
	    (push h *list-of-*agent-time-1*-histories*))
	   (t
	    (discard-instance h))))
    (loop for ix in *list-of-oldest-indices*
	 do
	 (setq timePoint (time-point ix))
	 (cond
	   ((= timePoint now)
	    (push ix *list-of-*agent-time*-indices*))
	   ((= timePoint now-1)
	    (push ix *list-of-*agent-time-1*-indices*))
	   (t
	    (discard-index ix))))
    (setq *generating-histories-p* nil) ))

(defun get-history-limit ()
  "If maintaining histories, return the earliest time point.  Otherwise
   return nil (indicating that histories are not being maintained)."
  ;; Note: The transaction mechanism uses *history-limit*, and sets
  ;;    *generating-histories-p* to :transaction;
  (when (eq *generating-histories-p* t)
    *history-limit*) )

(defun recompute-list-of-oldest-histories (limitPoint)
  ;; Called by "set-history-limit";
  ;; If histories are already turned on, then, starting from
  ;;    *list-of-oldest-histories*, calculate a new list by running
  ;;    forwards in time from members of the old list;
  ;; Otherwise, combine members of *list-of-*agent-time*-histories* and
  ;;    *list-of-*agent-time-1*-histories* to generate a new list;
  (let (newHistoryList)
    (labels ((push-newer-history (history)
	       (let (nextHistory)
		 (loop
		   (when (>= (time-point history) limitPoint)
		     (when (typep history 'HISTORY-INSTANCE)
		       (push history newHistoryList))
		     (return nil))		; exit loop
		   (setq nextHistory (next-instance history))
		   (discard-instance history)
		   (when (consp nextHistory)
		     (loop for h in nextHistory 
			  do (push-newer-history h))
		     (return nil))		; exit loop
		   (setq history nextHistory)))))
      (cond
	(*list-of-oldest-histories*
	 (loop for h in *list-of-oldest-histories*
	      do (push-newer-history h)))
	((= limitPoint *agent-time*)
	 (loop for h in *list-of-oldest-histories*
	      when (< (time-point h) limitPoint)
	      do (discard-instance h))
	 (setq newHistoryList *list-of-*agent-time*-histories*))
	(t					; limitPoint <= *agent-time* - 1
	 (setq newHistoryList *list-of-*agent-time-1*-histories*)
	 (loop for h in *list-of-*agent-time*-histories*
	      unless (previous-instance h)
	      do (push h newHistoryList))))
      (setq *list-of-*agent-time*-histories* nil)
      (setq *list-of-*agent-time-1*-histories* nil)
      (setq *list-of-oldest-histories* newHistoryList) )))

(defun compute-now-1-histories-from-oldest-histories ()
  ;; Called by "close-outermost-transaction";
  ;; Situation: A transaction is ending, and members of *list-of-oldest-histories*
  ;;    are either moved to *list-of-*agent-time-1*-histories* or discarded;
  ;; Assumes that all instances are temporally current;
  (let ((now-1 (1- *agent-time*))
	historyList)
    (loop for h in *list-of-oldest-histories*
	 do
	 (if (= (time-point h) now-1)
	     (push h historyList)
	     (discard-instance h)))
    (setq *list-of-*agent-time-1*-histories* historyList) ))


  ;;
;;;;;; Advancing forward in time
  ;;

(defun advance-time-clock ()
  ;; If not within a transaction, bump the *previously* counter;
  ;; If not maintaining histories (past depth two), bump the *history-limit* counter;
  ;; Increment the time counter *agent-time*;
  ;; Called by "new-time-point" at the beginning of a match cycle;
  (if *generating-histories-p*
      (unless (inside-of-transaction-p)
	(setq *previously* *agent-time*))
      (progn
	(setq *previously* *agent-time*)
	(setq *history-limit* *agent-time*)))
  (incf *agent-time*)
  (setf *query-agent-time* *agent-time*)
  (show-agent-time)				; User interface hook
  *agent-time*)

(defun advance-history-queues ()
  ;; Discard previous instances that are now two time quanta removed from
  ;;    *agent-time*;
  ;; Reset the lists that record previous and about-to-be previous instances.
  ;; Called by "new-time-point" at the end of a match cycle;
  ;; All of this logic except for creation of non-existent instances could
  ;;    have happend simultaneously with "advance-time-clock".  However,
  ;;    creation of a new non existent instance must be deferred until after
  ;;    the recognition phase to allow newly created instances to link to
  ;;    the old non existent instance;
  (create-non-existent-instance)		; <= create before advancing queues
  (when (not *generating-histories-p*)
    ;; discard histories more than two quata old: 
    (loop for i in *list-of-*agent-time-1*-histories*
	 do (discard-instance i))
    ;; save list of histories that are one quantum old:
    (setq *list-of-*agent-time-1*-histories* *list-of-*agent-time*-histories*)
    ;; same thing for indices:
    (loop for ix in *list-of-*agent-time-1*-indices*
	 do (discard-index ix))
    (setq *list-of-*agent-time-1*-indices* *list-of-*agent-time*-indices*)
    (setq *list-of-*agent-time*-indices* nil))
      ;; prepare to record histories that are zero quanta old:
  (setq *list-of-*agent-time*-histories* nil) )

(defun first-update-p ()
  (and (null *list-of-*agent-time*-histories*)
       (eql (time-point *non-existent-*agent-time*-instance*) *agent-time*)) )


  ;;
;;;;;; Retrieval of now and previously instances
  ;;

(defun get-instance-with-histories-at-time-point (self timePoint)
  ;; Return "self" or a history version of it that corresponds to time
  ;;    "timePoint";
  ;; Called by "DB-INSTANCE.get-instance-at-time-point" and
  ;;    "INSTANCE-WITH-HISTORIES.get-instance-at-time-point";
  (let ((laterInstance self)
	earlierInstance tp)
    (loop
      (when (null (setq earlierInstance (previous-instance laterInstance)))
	(return laterInstance))
      (when (<= (setq tp (time-point earlierInstance))
		timePoint)
	(return (if (= tp timePoint)
		    earlierInstance
		    laterInstance)))
      ;; continue looking for time point match:
      (setq laterInstance earlierInstance))	; goto top of loop
    ))

(defmethod get-instance-at-time-point ((self DB-INSTANCE) timePoint)
  ;; Return "self" or a history version of it that corresponds to time
  ;;    "timePoint";
  (declare (inline get-instance-with-histories-at-time-point))
  (get-instance-with-histories-at-time-point self timePoint) )

(defmethod get-instance-at-time-point (self timePoint)
  ;; Return the version of "self" with time point "timePoint";
  ;; "self" is a constant, so its temporally invariant;
  (declare (ignore timePoint))
  self )

(defun get-set-of-instances-at-time-point (set timePoint)
  ;; From set, compute a set of instances at time "timePoint";
  ;; Scan "set" to see if some of its members are instances
  ;;    that have a previous instance;
  ;; If so, return a new list of the history instances;
  ;; If not, return the original set (to save CONSes);
  ;; CAUTION: Assumes db-instances and literals do not both occur in "set";
  (when set
    (if (null (cdr set))			; singleton set
	(let ((historyInstance (get-instance-at-time-point (car set) timePoint)))
	  (when (neq historyInstance (car set))
	    (setq set (list historyInstance))))
	(when (and (typep (car set) 'DB-INSTANCE) 
		   (loop for member in set thereis 
			(and (previous-instance member)
			     (>= (time-point (previous-instance member)) timePoint))))
	  ;; compute set of previous fillers:
	  (setq set
		(loop for member in set
		     collect
		     (get-instance-at-time-point member timePoint))))))
  set )


  ;;
;;;;;; History instance creation, destruction, and updating
  ;;

#|
The first time that an instance is modified, a previous instance
is created, and the two are doubly-linked.

Copying data into a previous instance:

   The slots "db-type", and "residue-features" are eagerly copied into the
   previous instance.  Jointly, these slots account for all knowledge about
   conjuncts and features -- "db-type" subsumes knowledge in the slot
   "conjuncts-table", while the "residue-features" slot subsumes 
   the slots "asserted-features" and "active-default-features" (the latter 
   from the modification summary).

   The slot "dynamic-variables" contains all asserted and derived knowledge
   about role fillers.  However, its entries are destructively modified.
   Therefore, we can't just copy it.  Instead, we adopt a lazy, differential
   copying strategy:  The previous instance keeps original values of role 
   fillers only for roles that have been modified.  Retrieval of role fillers
   of a previous instance checks first at the previous instance, and if no 
   entry exists, then at the now instance.

   Instances that contain temporal indices (e.g., a previous pointer) are
   not destroyed by "forget-all-about".  Destruction causes them to be
   detached from all concepts, including THING, (i.e., the value of
   "db-type" is NIL) to indicate that they do not exist.

|#

(defun find-or-create-history-instance (self)
  ;; Situation: "self" is a LOOM or CLOS instance, and may or
  ;;    may not have been modified since the last time point;
  ;; Return a previous instance (creating one if necessary) that
  ;;    records that state of "self" at time *agent-time*;
  ;; Called by "save-now-role-fillers", and "CLOS-INSTANCE.xxx-conjunct";
  ;; Note: Currently, "forget-all-about" is the only place where
  ;;    history generation is disabled;
  (let* ((previousInstance (previous-instance self))
	 (previousInstanceTimePoint (and previousInstance
					 (time-point previousInstance))))
    (when (first-update-p)
      (advance-time-clock))
    (cond
     ((eql previousInstanceTimePoint (1- *agent-time*))
      previousInstance)
     ((not (boundp '*disable-history-generation-p*))
      (create-history-instance self))
     (t nil)) ))

(defun make-real-history-instance ()
  ;; Create a fresh real history instance;
  (make-instance 'REAL-HISTORY-INSTANCE))

(defun link-in-new-history-instance (self newHistory oldHistory)
  ;; Do the link and time setup for new history instances;
  (setf (time-point newHistory) (1- *agent-time*))
  (when oldHistory
    (cond ((consp (next-instance oldHistory))
	   ;; remove "self" from "(next-instance oldHistory)"
	   ;;   and put  "newHistory" in its place:
	   ;; Note: CAN'T BE DESTRUCTIVE with contexts!
	   (setf (next-instance oldHistory) ;  TAR 2/9/94
	     (cons newHistory (remove self 
				      (next-instance oldHistory)))))
	  ((typep oldHistory 'NON-EXISTENT-INSTANCE) ;  TAR 6/4/99
	   (setf (next-instance oldHistory) (list newHistory)))
	  (t 
	   (setf (next-instance oldHistory) newHistory)))
    (setf (previous-instance newHistory) oldHistory))
  (setf (next-instance newHistory) self)
  (setf (previous-instance self) newHistory)
  (push newHistory *list-of-*agent-time*-histories*) )

(defun create-history-instance (self)
  ;; Create a history instance, copy type, residue, and identifier
  ;;    values from "self" into it, and return it;
  ;; Note: "advance-history-queues" takes care of discarding
  ;;    history instances once they get too old (at time *agent-time* + 2);
  (declare (inline make-real-history-instance))
  (let ((newPreviousInstance (make-real-history-instance))
	(oldPreviousInstance (previous-instance self)))
    (setf (identifier newPreviousInstance) 
	  (context-identifier self))	; useful for debugging
    (setf (home-ctxt newPreviousInstance) ; TAR 2/10/98
      *current-ctxt*)		;; Safe since previous-instance is context-sensitive
    (multiple-value-bind (type residueFeatures)
	(find-type&residue-features self)
      (setf (db-type newPreviousInstance) type)
      (setf (residue-features newPreviousInstance) residueFeatures))
    (link-in-new-history-instance self newPreviousInstance oldPreviousInstance)
    newPreviousInstance ))

(defun create-before-recognition-history-instance (instance)
  ;; Called by "act-on-modified-types";
  ;; Situation: No history instance was created for "instance"
  ;;    at time *agent-time*, but we need one to record the type
  ;;    and residue features for that time quantum;
  ;;  Substitute old values of type and residue into "instance", then create
  ;;    the history instance, and then fix things back up;
  (let ((modificationSummary (modification-summary instance))
	(type (db-type instance))
	(residueFeatures (residue-features instance)))
    ;; if "instance" is already on the modification queues, install previous
    ;;    values before they are copied into the history instance:
    (when modificationSummary
      (setf (db-type instance) (original-type modificationSummary))
      (setf (residue-features instance)
	    (original-residue-features modificationSummary)))
    (find-or-create-history-instance instance)
    (setf (db-type instance) type)
    (setf (residue-features instance) residueFeatures) ))

(defun link-to-non-existent-instance (instance)
  ;; Link "instance" to the non existent instance for the current time
  ;;    quantum, or for the previous time quantum if we are in the
  ;;    middle of a recognition cycle;
  (when (first-update-p)
    (advance-time-clock))
  (unless (boundp '*disable-history-generation-p*)
    (setf (previous-instance instance) *non-existent-*agent-time*-instance*)
    (push instance (next-instance *non-existent-*agent-time*-instance*))) )

(defun make-non-existent-history-instance ()
  ;; Create a fresh real history instance;
  (let ((newInstance (make-instance 'NON-EXISTENT-INSTANCE)))
    (setf (identifier newInstance) :non-existent)            
    newInstance ))
	  
(defun create-non-existent-instance ()
  ;; Called by "advance-history-queues" and "initialize-network";
  ;; Create a non-existent instance at time *agent-time*;
  ;; We limit the generation of nonexistent instances by caching one
  ;;    per time quantum in the variable *non-existent-*agent-time*-instance*;
  (let ((nonExistentInstance (make-non-existent-history-instance)))
    (setf (time-point nonExistentInstance) *agent-time*)
    ;; push previous non-existent instance so that it can eventually
    ;;    be recycled:
    (push *non-existent-*agent-time*-instance* *list-of-*agent-time*-histories*)
    (setq *non-existent-*agent-time*-instance* nonExistentInstance) ))

(defun discard-history-instance (self)
  ;; Unlink "self" from its successor in the history list;
  (unless (discarded-p self)
    ;; unlink "self" from history queue (note: usually, the time differential
    ;;    is 2 rather than 1):
    (when (eql (time-point self) (1- *agent-time*))
      (delf *list-of-*agent-time-1*-histories* self))) )

(defmethod discard-instance ((self REAL-HISTORY-INSTANCE))
  ;; Unlink "self" from its successor in the history list;
  ;; Clear slots in "self" and recycle it;
  ;; Tricky: We need to read the previous instance slot of
  ;;   (next-instance self) because the read could trigger an instance
  ;;   update due to a changed CLOS class. That update could change the
  ;;   value of the slot next-instance;
  (declare (inline discard-history-instance))
  (let ((nextInstance (next-instance self)))
    (when (and nextInstance (eq (previous-instance nextInstance) self)); TAR 10/20/93 fix pathologic case;
      (setf (previous-instance nextInstance) nil))
    (setf (next-instance self) nil)
    (discard-history-instance self)
    (call-next-method)                    ; mark "self" :discarded
    ))

(defun save-now-role-fillers (instance role oldValue)
  ;; Record the value of "oldValue" as a slot in the
  ;;    non-current now instance of "instance";
  ;; Called by "assert-role-filler" and "retract-role-filler";
;;; ELIMINATED 5/4/93:
;  (when (not (symbolp slotName))
;    ;; ignore phantom roles:
;    (return-from save-now-role-fillers nil))
  (let* ((nowInstance
	  (find-or-create-history-instance instance)))
    ;; save "oldValue" if no entry exists (i.e., if it hasn't already
    ;;    been saved):
    (when (and nowInstance ;; <= fails if "instance" was never-before-matched
	       (null (assoc (name role) (dynamic-variables nowInstance)))
	       ;; this prevents storing null role values in a non 
	       ;;    existent instance:
	       (neq nowInstance *non-existent-*agent-time*-instance*))
      (set-slot-value nowInstance role oldValue)) ))

;(defun clear-discards-from-history-queues ()
;  ;; Eliminate discarded history instances and indices from the history
;  ;;    queues;
;  ;; Called by "clear-context-sublattice";
;  (delf *list-of-*agent-time*-histories* :discarded :key #'time-point)
;  (delf *list-of-*agent-time-1*-histories* :discarded :key #'time-point)
;  (delf *list-of-oldest-histories* :discarded :key #'time-point)
;  (delf *list-of-*agent-time*-indices* :discarded :key #'time-point)
;  (delf *list-of-*agent-time-1*-indices* :discarded :key #'time-point)
;  (delf *list-of-oldest-indices* :discarded :key #'time-point) )

(defun clear-discards-from-history-queues ()
  ;; Eliminate discarded history instances and indices from the history
  ;;    queues;
  ;; Called by "clear-context-sublattice";
  (setf *list-of-*agent-time*-histories* nil)
  (setf *list-of-*agent-time-1*-histories* nil)
  (setf *list-of-oldest-histories* nil)
  (setf *list-of-*agent-time*-indices* nil)
  (setf *list-of-*agent-time-1*-indices* nil)
  (setf *list-of-oldest-indices* nil) )
  ;;
;;;;;; Non-existent instances
  ;;

;;; Going backwards in time, a history of an instance terminates either in
;;;    a pointer to NIL, indicating that the instance was unchanged from that
;;;    point back to the history limit point, or in a pointer of an object of
;;;    type "NON-EXISTENT-INSTANCE", indicating that the instance did not yet
;;;    exist at that point in time.  Only one NON-EXISTENT-INSTANCE is
;;;    generated at each time point -- multiple instances may point back to
;;;    it, and its "next-instance" slot is a list that can point to many
;;;    instances.

(defmethod has-instance-p ((concept UNARY-ENTITY) (instance NON-EXISTENT-INSTANCE))
  ;; Situation: "instance" did not exist at the reference time point;
  ;; Return nil, since it is not an instance of any concept;
  nil )

(defmethod not-has-instance-p ((concept UNARY-ENTITY) (instance NON-EXISTENT-INSTANCE))
  ;; Situation: "instance" did not exist at the reference time point;
  ;; Return t, since it was not an instance of "concept";
  t )

(defmethod get-slot-value ((self NON-EXISTENT-INSTANCE) role)
  ;; Read slot accessor function for instance at a time that it did
  ;;    not yet exist;
  ;; Always returns nil;
  (declare (ignore role))
  nil )

(defmethod get-slot-values ((self NON-EXISTENT-INSTANCE) role)
  ;; Read slot accessor function for instance at a time that it did
  ;;    not yet exist;
  ;; Always returns nil;
  (declare (ignore role))
  nil )

(defmethod discard-instance ((self NON-EXISTENT-INSTANCE))
  ;; Unlink "self" from next instances and recycle it;
  ;; Tricky: We need to read the previous instance slot of
  ;;   (next-instance self) because the read could trigger an instance
  ;;   update due to a changed CLOS class. That update could change the
  ;;   value of the slot next-instance;
  (declare (inline discard-history-instance))
  (loop for nextInstance in (next-instance self)
        when (eq (previous-instance nextInstance) self); TAR 10/20/93 fix pathologic case;
        do (setf (previous-instance nextInstance) nil))
  (setf (next-instance self) nil)
  (discard-history-instance self)
  (call-next-method) )


  ;;
;;;;;; History Indices
  ;;

;;; Code below for indices borrows a great deal from the history
;;;    instance logic.

(defun recompute-list-of-oldest-indices (limitPoint)
  ;; Called by "set-history-limit";
  ;; If histories are already turned on, then, starting from
  ;;    *list-of-oldest-histories*, calculate a new list by running
  ;;    forwards in time from members of the old list;
  ;; Otherwise, combine members of *list-of-*agent-time*-histories* and
  ;;    *list-of-*agent-time-1*-histories* to generate a new list;
  (let (newIndexList)
    (flet ((push-newer-index
	     (index)
	     (loop
	       (when (>= (time-point index) limitPoint)
		 ;; This type doesn't exist.  Should it be HISTORY-INDEX?
;		 (when (typep index 'INDEX-INSTANCE)
;		   (push index newIndexList))
		 (return nil))			; exit loop
	       (discard-index index)
	       (setq index (next-index index)))))
      (cond
	(*list-of-oldest-indices*
	 (loop for ix in *list-of-oldest-indices*
	      do (push-newer-index ix)))
	((= limitPoint *agent-time*)
	 (loop for ix in *list-of-oldest-indices*
	      when (< (time-point ix) limitPoint)
	      do (discard-index ix))
	 (setq newIndexList *list-of-*agent-time*-indices*))
	(t					; limitPoint <= *agent-time* - 1
	 (setq newIndexList *list-of-*agent-time-1*-indices*)
	 (loop for ix in *list-of-*agent-time*-indices*
	      unless (previous-index ix)
	      do (push ix newIndexList))))
      (setq *list-of-*agent-time*-indices* nil)
      (setq *list-of-*agent-time-1*-indices* nil)
      (setq *list-of-oldest-indices* newIndexList) )))

;; THIS MAY BE OBSOLETE.  CONCEPTS DON'T USE HISTORY INDICES ANY MORE,
;;    AND TUPLES MAY NOT EVER:
(defun find-or-create-history-index (relation)
  ;; Situation: "relation" may or may not have been modified since the last
  ;;    time point;
  ;; Return a previous index (creating one if necessary) that
  ;;    records the tuples in "relation" at time *agent-time*;
  ;; Note: Currently, "forget-all-about" is the only place where
  ;;    history generation is disabled;
  (let ((previousIndex (previous-index relation)))
    (if (and previousIndex
	     (eql (time-point previousIndex) *agent-time*))
	previousIndex
	(unless (boundp '*disable-history-generation-p*)
	  (create-history-index relation))) ))

(defun create-history-index (relation)
  ;; Create a history index, copy slot values from "relation"
  ;;    into it, and return it;
  ;; Note: "advance-one-time-quantum" takes care of discarding
  ;;    history indices once they get too old (at time *agent-time* + 2);
  (let ((newHistoryIndex (make-instance 'HISTORY-INDEX))
	(oldHistoryIndex (previous-index relation)))
    (setf (time-point newHistoryIndex) (1- *agent-time*))
    (when oldHistoryIndex
      (setf (next-index oldHistoryIndex) newHistoryIndex)
      (setf (previous-index newHistoryIndex) oldHistoryIndex))
    (setf (next-index newHistoryIndex) relation)
    (setf (previous-index relation) newHistoryIndex)
    (push newHistoryIndex *list-of-*agent-time*-indices*)
    newHistoryIndex ))

(defmethod discard-index ((self HISTORY-INDEX))
  ;; Clear slots in "self" and recycle it;
  ;; Assumes that "(previous-index self)" is nil;
  (setf (previous-index (next-index self)) nil)
  (setf (next-index self) nil)
;  (setf (added-next-time-quantum self) nil)   ; TAR 4/15/94 - contexts!
;  (setf (removed-next-time-quantum self) nil)
;  (setf (time-point self) :discarded)
  (when (eql (time-point self) (1- *agent-time*))
    (delf *list-of-*agent-time-1*-indices* self))
  )

(defmethod root-concept-of-index ((index HISTORY-INDEX))
  ;; Return the temporally most-recent index chained to "index";
  ;; Called by "HISTORY-INDEX.print-object";
  (root-concept-of-index (next-index index)) )

(defmethod root-concept-of-index (index)
  ;; Return the temporally most-recent index chained to "index";
  ;; Called by "HISTORY-INDEX.print-object";
  index )


;;; TO DO:
#|

ADD TEMPORAL TUPLE INDICES USING SAME STRUCTURES AS
   CONCEPT INDICES

|#
