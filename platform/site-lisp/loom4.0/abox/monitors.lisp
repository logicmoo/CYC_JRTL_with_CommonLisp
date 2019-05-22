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

;;; MONITORS.LISP (ABOX)

;;; Contains code for defining and triggering monitors;

(in-package "LOOM")

(export '( defmonitor delete-monitor
	  find-monitor get-monitor list-monitors
	  monitor-instance unmonitor-instance clear-instance-monitors
	  ))


  ;;
;;;;;; Exported monitor functions
  ;;

(defmacro defmonitor (name &key when perform schedule do achieve priority)
  "Define or redefine a monitor with name `name'"
  (cond
    ((more-than-one-true-value perform schedule do achieve)
     (error "Monitor ~S can have at most one of :perform, :schedule, ~%   ~
              do, and :achieve clauses" name))
    ((not (or perform schedule do achieve))
     (error "Monitor ~S has no :perform, :schedule, :do, or :achieve clause" name))
    (t
     `(redefine-production :monitor ',name ',when
			   ,@(when perform `(:perform ',perform))
			   ,@(when schedule `(:schedule ',schedule))
			   ,@(when do `(:do ',do))
			   ,@(when achieve `(:achieve ',achieve))
			   :priority ',priority))) )

(defun delete-monitor (monitorOrName &key error-p)
  "Delete the monitor `monitorOrName'"
  (delete-production monitorOrName :error-p error-p) )

(defun get-monitor (monitorOrName &key no-error-p)
  "Return the monitor named `monitorOrName', or the object itself
   if `monitorOrName' is not a symbol"
  ;; If there is none, return nil if "no-error-p" is set, or else
  ;;    generate an error;
  (get-production monitorOrName :no-error-p no-error-p) )

(defun find-monitor (monitorOrName &key no-warning-p)
  "Get monitor `monitorOrName' and verify its type"
  (find-behavior monitorOrName 'MONITOR :no-warning-p no-warning-p) )

(defun list-monitors (&key context kb)
  "Return a list of the monitors in all contexts,
   or in the context `context'"
  (obsolete-argument list-monitors kb context #'get-context-from-kb)
  (loop for k in (or (list-of context)
		(list-contexts))
       append
       (loop for p in (list-context k :partitions :behaviors)
	    when (typep p 'MONITOR)
	    collect p)) )

(defun monitor-instance (monitorOrName instanceOrIdentifier)
  "Attach the monitor `monitorOrName' to the instance `instanceOrIdentifier'"
  ;; Note: Logic is borrowed from "assert-rete-full-support";
  (seal-network)      ; insure that rete node has been created   ; RMM 12/8/92
  (let ((node (rete-node (get-monitor monitorOrName)))
	(instance (get-instance instanceOrIdentifier)))
    (unless (get-rete-node-support instance node)
      (set-rete-node-support instance node :direct)
      (loop for n in (rete-subsequent-output-nodes node)
	   do (assert-rete-prior-support instance n node))) ))

(defun unmonitor-instance (monitorOrName instanceOrIdentifier)
  "Detach the monitor `monitorOrName' from the instance `instanceOrIdentifier'"
  ;; Note: Logic is borrowed from "retract-rete-full-support";
  (seal-network)     ; insure that rete node has been created   ; RMM 12/8/92
  (let* ((monitor (get-monitor monitorOrName))
	 (node (rete-node monitor))
	 (instance (get-instance instanceOrIdentifier)))
    (flet ((monitored-bomb-p
	       (bomb)
	     (let ((definedObject 
		     (rete-defined-concept 
                      (rete-bomb-dependent-node bomb))))
	       (and (typep definedObject 'PRODUCTION-COHORT)
		    (eq (primary-production definedObject) monitor)))))
      (set-rete-node-support instance node nil)
      (loop for n in (rete-subsequent-output-nodes node)
	    when (and (rete-instance/support-table n)
		      (get-rete-node-support instance n))
	    do (retract-rete-full-support instance n))
      (removef-members
       (rete-concept-bombs instance)
       (loop for bomb in (rete-concept-bombs instance)
	     when (monitored-bomb-p bomb)
	     collect bomb))
      (removef-members
       (rete-role-bombs instance)
       (loop for bomb in (rete-role-bombs instance)
	     when (monitored-bomb-p bomb)
	     collect bomb)) )))

(defun clear-instance-monitors (instanceOrIdentifier)
  "Detach all monitors from the instance `instanceOrIdentifier'"
  (let ((instance (get-instance instanceOrIdentifier))
	(monitors nil))
    (flet ((collect-monitor (bomb)
	     (let ((definedObject 
		     (rete-defined-concept (rete-bomb-dependent-node bomb))))
	       (when (typep definedObject 'PRODUCTION-COHORT)
		 (pushnew (primary-production definedObject) monitors)))))
      (loop for bomb in (rete-concept-bombs instance)
	    do (collect-monitor bomb))
      (loop for bomb in (rete-role-bombs instance)
	    do (collect-monitor bomb))	 
      (loop for m in monitors
	    do (unmonitor-instance m instance)) )))


  ;;
;;;;;; Monitor-specific variations on production rule functions
  ;;

#|
The trigger indexing stategies for monitors are different than
for productions.  Instead of a global strategy of attaching trigger
links from concepts or relations to production cohorts, a local
strategy is used, where instances point to transition bombs, each
of which points to a cohort.  Also, each rete cascade for a
monitor is anchored by a monitor node rather than by a concept
node.  Unlike with ordinary cascades, there is no structure sharing
across monitor cascades.  Monitor cascades can monitor role
instantiations as well as concept instantiations.

The structure of a monitor cascade differs from a rete cascade in
several ways.  First, the anchor node table contains the set of
instances attached to the corresponding monitor, rather than a set
of instances satisfying a primitive concept.  Second, the
"defined-concept" recognized by the final node in the cascade points
to a cohort rather than to a concept that has attached if-added and
if-removed cohorts.  In the case of role transition nodes, because
the transition relationship relates two instances rather than a single
one, the relationship is transitory, and hence the memory within
a role transition node is not used.

Transition bombs are placed in the same list as rete feature bombs,
but the trigger-feature slot contains the symbol :transition rather
than a feature.  Transition bombs do not use the slot
"assertion/retraction".

|#

(defmethod install-cohort-trigger-code ((self MONITOR) cohort transitionClause)
  ;; Helping method for "generate-one-cohort";
  ;; Insert code at appropriate places that monitors the transition
  ;;    predicate for "cohort", and activates the cohort whenever
  ;;    the transition is satisfied;
  ;; Return an insurance clause for cases when the activation
  ;;    of a cohort occurs before the end of an agent time quantum;
  ;; Comment: "self" is a monitor rather than a production -- rather
  ;;    than employing a global indexing strategy (i.e., attaching
  ;;    "cohort" to a concept or relation) we employ a localized
  ;;    index that attaches "cohort" directly to each monitored instance;
  ;; TO DO: WE DON'T HANDLE TRANSITIONS ON N-ARY RELATIONS YET;
  (let ((transitionIndicator (transition-indicator cohort))
	(relation (cohort-predicate cohort))
	(insuranceClause nil))
    (when (typep relation 'N-ARY-RELATION)
      (behavior-parsing-error "Monitoring of n-ary relations is not yet implemented"))
    (if (and (eq (length transitionClause) 2)
	     (neq transitionIndicator :changes))
	;; create rete cascade to recognize changes to the instantiation
	;;    relationship for the concept "relation":
	(find-or-create-rete-cascade relation cohort)
	(progn ;; create monitor cascade and insurance clause:
	  (create-monitor-cascade-for-role cohort)
	  ;; form predicate to test whether intermediary changes instantiation
	  ;;    relationship for relation resulted in changes at the end
	  ;;    of the agent time quantum:
	  (setq insuranceClause
		(case transitionIndicator
		  (:detects `(:detects ,transitionClause)) 
		  (:undetects `(:undetects ,transitionClause))
		  (:changes
		   `(:not (:same-as ,transitionClause
				     (:previously ,transitionClause))))))))
    insuranceClause ))

(defun create-monitor-cascade-for-role (monitorCohort)
  ;; Called by "MONITOR.install-cohort-trigger-code";
  ;; Create a monitor cascade for "monitorCohort" that recognizes
  ;;    the transition for the role associated with that cohort;
  ;; First, find or create an anchor node that recognizes the monitor for
  ;;    "monitorCohort";
  ;; Next, create a successor combinator node that tests for
  ;;    the transition and points to "monitorCohort";
  ;; Kludge: Because "create-rete-combinator-node" can trigger before returning,
  ;;    it points "rete-defined-concept" to "monitorCohort";
  (let* ((monitor (primary-production monitorCohort))
	 (anchorNode (or (rete-node monitor)
			 (create-rete-anchor-node monitor)))
	 (transitionTestNode
	   (create-rete-combinator-node
	     monitorCohort                     ; RMM 12/8/92
	     (list anchorNode))))              ; RMM 12/8/92
    ;; transition nodes have no memory:
    (setf (rete-instance/support-table transitionTestNode) nil) ))

(defun recognize&monitor-transition (instance node)
  ;; Called by "assert-rete-prior-support";
  ;; Situation: "instance" newly satisfies the prior of "node" (the prior
  ;;    is a monitor's anchor node);
  ;; Test to see if it satisfies the transition test at "node" -- if
  ;;    so, activate the corresponding cohort;
  ;; Also, attach a transition bomb to "instance" to further monitor
  ;;    this transition;
  (recognize&act-on-transition instance node)
  ;; create new bomb:
  (push (create-rete-bomb 
	  :transition node (cohort-predicate (rete-defined-concept node)) nil)
	(rete-role-bombs instance)) )

(defun recognize&act-on-transition (instance node)
  ;; Called by "recognize&monitor-transition" and "detonate-rete-feature-bombs";
  ;; Activate the cohort "(rete-defined-concept node)" if the
  ;;    transition "transitionIndicator" occurred for the role
  ;;    "role" on instance "instance";
  (let* ((cohort (rete-defined-concept node))
	 (role (cohort-predicate cohort))
	 (oldFillers (collect-previous-role-fillers instance role))
	 (newFillers (collect-all-role-fillers instance role)))
    (case (transition-indicator cohort)
      (:detects
       (loop for f in newFillers
	    when (not (member f oldFillers :test #'filler-equal))
	    do (distribute-binding-set-to-one-cohort 
		 (cons instance f) cohort)))
      (:undetects
       (loop for f in oldFillers
	    when (not (member f newFillers :test #'filler-equal))
	    do (distribute-binding-set-to-one-cohort
		 (cons instance f) cohort)))
      (:changes
       (when (not (same-as-p newFillers oldFillers))
	 (distribute-binding-set-to-one-cohort instance cohort)))) ) )

(defmethod uncompile-production ((self MONITOR))
  ;; Called by "redefine-production" and "delete-production";
  ;; Uncompile production (e.g., remove cohorts);
  ;; Also, eliminate successors of anchor node in corresponding
  ;;    monitor cascade, since all of them are tied to "self";
  ;; Note: Because we assume that monitor redefinition is rare,
  ;;    we do NOT recycle the discarded rete nodes;
  (let ((anchorNode (rete-node self)))
    (setf (rete-subsequent-output-nodes anchorNode) nil)
    (call-next-method) ))

; RMM 12/8/92: NEW:
(defmethod compute-concept-expansion ((self MONITOR))
  ;; Return the monitor "self";
  ;; Called by "generate-rete-pattern";
  (list self) )

; RMM 12/8/92: NEW:
(defmethod compute-concept-expansion ((self PRODUCTION-COHORT))
  ;; Return the cohort "self";
  ;; Called by "generate-rete-pattern";
  (list self) )




