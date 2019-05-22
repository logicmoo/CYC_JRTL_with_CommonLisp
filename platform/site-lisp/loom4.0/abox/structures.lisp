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

;;; STRUCTURES.LISP (ABOX)

;;; Defines the structure of database instances;
;;; First ABox File.  Contains:
;;;    "reset-database-variables" and "show-variables";
;;;    Definitions of structures used to build instances;
;;;    Macros for accessing db-instance slots;
;;;    "show" for instances.

(in-package "LOOM")

(export '( show-variables))



  ;;
;;;;;;  Initialization of ABox Variables
  ;;

(defun reset-database-variables ()
  ;; Clear database queues, etc.;
  (unpost-all-instances)
  (fill *match-queues* nil)
  (setq *instance-identifier-counter* 0)
  (setq *recycled-equivalence-bombs* nil)
  (setq *recycled-loom-instances* nil)
  (setq *list-of-*agent-time*-histories* nil)
  (setq *list-of-*agent-time-1*-histories* nil)
  (setq *list-of-oldest-histories* nil)
  (setq *list-of-*agent-time*-indices* nil)
  (setq *list-of-*agent-time-1*-indices* nil)
  (setq *list-of-oldest-indices* nil)
  (setq *match-is-pending-p* nil)
  (setq *recycled-partitions* nil)
  (clrhash *partition-table*)
  )


  ;;
;;;;;; 
  ;;

(defun show-variables ()
  ;; Debugging aid: Display current values of all global variables;
  ;; TO DO:  REMOVE VARIABLES WHICH ARE NOT OF GENERAL INTEREST;
  ;; "macros.lisp":
  (trace-values KBCLASSES::*kbclasses-dialogue-features*)
  (trace-values *current-name-spaces*)
  (trace-values *current-evaluate-id-fns*)
  (trace-values *knowledge-base-table*)
  (trace-values *context-table*)
  (trace-values *context*)
  (trace-values *context-stack*)
  (trace-values *loom-features*)
  (trace-values *loom-dialogue-features*)
  (trace-values *loom-match-features*)
  
  ;; "classdefs.lisp":
  (trace-values *top-level-unclassified-concepts*)
  (trace-values *top-level-uncompleted-concepts*)
  (trace-values *top-level-unconditioned-defaults-concepts*)
  (trace-values *top-level-unsealed-concepts*)
  (trace-values *list-of-recomplete-value-restrictions-concepts*)
  (trace-values *list-of-recomplete-implies-concepts*)
  (trace-values *list-of-recomplete-range-relations*)
  (trace-values *list-of-uninterned-concepts*)
  (trace-values *count-of-unclassified-concepts*)
  (trace-values *concept-is-below-pass-counter*)
  (trace-values *revise-subgraph-pass-counter*)
  (trace-values *number-of-classifications*)
  (trace-values *number-of-unclassifications*)
  (trace-values *number-of-revisions*)
  (trace-values *number-of-merges*)
  (trace-values *network-is-sealed-p*)
  (trace-values *reseal-network-p*)
  (trace-values *global-closed-world-p*)
  (trace-values *unimplemented-concepts-exist*)
  (trace-values *Thing*)
  (trace-values *list-of-Thing*)
  
;;; SUPPRESS BECAUSE ITS TOO BIG:
;  (trace-values *empty-concept-forms*)
  
;;; THESE GENERATE TOO MUCH OUTPUT:
;  (trace-values *loom-keyword-lookup-table*)
;  (trace-values *loom-parse-graph*)
;  (trace-values *loom-non-terminals*)
   
  (trace-values *operator/option-table*)
  (trace-values *operator/default-option-table*)
  (trace-values *random-method-position*)

  (trace-values (aref *match-queues* $STRICT-RETRACTION-Q$))
  (trace-values (aref *match-queues* $STRICT-ASSERTION-Q$))
  (trace-values (aref *match-queues* $DEFAULT-RETRACTION-Q$))
  (trace-values (aref *match-queues* $DEFAULT-ASSERTION-Q$))
  (trace-values (aref *match-queues* $ACT-ON-Q$))
  
  (trace-values *recycled-partitions*)
  (trace-values *match-is-pending-p*)
  (trace-values *higher-priority-task-is-pending-p*)
  (trace-values *instance-identifier-counter*)
  (trace-values *current-instance-space-list*)

  (trace-values *task-priorities*)
  (trace-values *default-task-priority*)
  (trace-values *task-queue-table*)
  (trace-values *current-task*)
  (trace-values *task-log*)

  ) ;; end "show-variables"


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;  STRUCTURE DEFINITIONS FOR INSTANCES
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

  ;;
;;;;;; Modification Summaries
  ;;

;;; When an instance is first placed on a queue,
;;;    a MODIFICATION-SUMMARY record is attached to it;
;;; The slot "queue-level" takes one of the values
;;;   $STRICT-RETRACTION-Q$   strict retractions made;
;;;   $STRICT-ASSERTION-Q$    strict assertions but no strict retractions made;
;;;   $DEFAULT-RETRACTION-Q$  waiting for defaults to be withdrawn;
;;;   $DEFAULT-ASSERTION-Q$   waiting for defaults to be activated;
;;;   $ACT-ON-Q$              TYPE has changed;
;;;   NIL                     TYPE unaffected by modifications, officially not on queue;

(defstruct (MODIFICATION-SUMMARY (:conc-name nil))
           queue-level
	   original-type
	   original-residue-features
	   never-before-matched-p
	   to-be-probed-feature-hits
	   to-be-probed-feature-misses
	   to-be-probed-default-hits
	   to-be-probed-default-misses
	   features-analyzed-p
	   starting-queue-level
	   ;; SEE IF HAVING HISTORIES MAKES THESE TWO SLOTS OBSOLETE:
	   newly-asserted-conjuncts
           newly-asserted-features
	   rock-bottom-p
	   retraction-message
	   strict-feature-hits
	   strict-feature-misses
	   default-feature-hits
	   default-feature-misses
	   active-default-features
	   active-default-concepts
	   inactive-defaults
	   newly-negated-conjuncts
	   retry-search-for-disjuncts
	   )

#+CLTL2 (declaim (inline create-modification-summary
			 discard-modification-summary))
#-CLTL2 (proclaim '(inline create-modification-summary
			   discard-modification-summary))

(defun create-modification-summary (instance)
  ;; Produce a new or recycled modification summary;
  ;; FUTURE: WHEN WE HAVE VIEWS, THE META-THING CODE MUST BE REDESIGNED:
  (let ((newModificationSummary (make-MODIFICATION-SUMMARY)))
    (setf (original-type newModificationSummary) (db-type instance))
    (setf (original-residue-features newModificationSummary)
	  (residue-features instance))
    (setf (modification-summary instance) newModificationSummary)
    newModificationSummary) )
  
;; OBSOLETE (BUT STILL CALLED):
(defun discard-modification-summary (modificationSummary)
  ;; Clear slots in "modificationSummary" and push onto recycle list;
  (declare (ignore modificationSummary))
  nil )


  ;;
;;;;;; ROLE-FILLERS-SUPPORT-RECORD
  ;;

;;; These records are attached to roles that have inferred, default, or
;;;    computed fillers.
;;; Comment: Once allocated, they don't get removed, so that recycling of
;;;    these records is unnecessary.

(def-cs-struct (ROLE-FILLERS-SUPPORT-RECORD (:conc-name nil))
	   (asserted-fillers nil :context-sensitive-p t)
	   (strict-fillers nil :context-sensitive-p t)
	   (default-fillers nil :context-sensitive-p t)
	   )


  ;;
;;;;;; CONJUNCT-SUPPORT-RECORD
  ;;

;;; Each instance keeps record of asserted and deduced conjuncts in its
;;;    "conjucts-table" slot, which is an association-list pairing
;;;    a conjunct (a concept) with a "CONJUNCT-SUPPORT-RECORD" indicating
;;;    what types of assertions/justifications, and how many, have been made
;;;    for that conjunct;

#|
(def-cs-struct (CONJUNCT-SUPPORT-RECORD (:conc-name nil))
	   (assertion-p nil :context-sensitive-p t)
	   (domain/range-count 0 :context-sensitive-p t)
	   (strict-count 0 :context-sensitive-p t)
	   (default-p nil :context-sensitive-p t)
	   )
|#

(def-bit-flags :conjunct-support
    :assertion :default)

(def-cs-struct (CONJUNCT-SUPPORT-RECORD (:conc-name nil))
	   (csr-flags 0 :context-sensitive-p t)
	   (domain/range-count 0 :context-sensitive-p t)
	   (strict-count 0 :context-sensitive-p t))

(def-bit-accessor assertion-p csr-flags :conjunct-support :assertion)
(def-bit-accessor default-p csr-flags :conjunct-support :default)

#+CLTL2 (declaim (inline create-conjunct-support-record))
#-CLTL2 (proclaim '(inline create-conjunct-support-record))

(defun create-conjunct-support-record ()
  ;; Produce a new or recycled conjunct support record;
  (make-CONJUNCT-SUPPORT-RECORD))

;; OBSOLETE (BUT STILL CALLED):
(defun discard-conjunct-support-record (supportRecord)
  (declare (ignore supportRecord))
  nil )

(defun conjunct-supported-p (supportRecord)  ; CTXXX  New function.
  (or (test-bit-flags (csr-flags supportRecord) :conjunct-support :assertion :default)
      (plusp (domain/range-count supportRecord))
      (plusp (strict-count supportRecord))))

  ;;
;;;;;; MERGE-SUPPORT-RECORD
  ;;

(defmethod merged-into-instance ((instance T))
  ;; The default method returns nil, indicating that "instance" didn't
  ;;    merge with another instance.
  nil )

(defmacro womp-merge-pointers (instance)
  ;; Takes a variable whose value is a instance and replaces its value
  ;;    with the instance at the end of the trail of merged-into-instance pointers;
  `(if (merged-into-instance ,instance)
       (follow-merge-pointers ,instance)
       ,instance) )

;;; Each instance that has been merged
;;;    keeps record of asserted and deduced merges in its
;;;    "merge-table" slot, which is an association-list pairing
;;;    a list of instances with a "MERGE-SUPPORT-RECORD" indicating
;;;    what types of assertions/justifications, and how many, have been made
;;;    for the equivalence of those instances;

;(defstruct (MERGE-SUPPORT-RECORD (:conc-name nil))
;	   (asserted-merge-p nil)
;	   (strict-merge-count 0)
;	   (default-merge-p nil)
;	   )

;(defun merge-merge-support-records (fromRecord intoRecord)
;  (when (asserted-merge-p fromRecord)
;    (setf (asserted-merge-p intoRecord) t))
;  (incf (strict-merge-count intoRecord)
;	(strict-merge-count fromRecord))
;  (when (default-merge-p fromRecord)
;    (setf (default-merge-p intoRecord) t)) )

  ;;
;;;;;; MULTIPLE-DEFINITION-RECORD
  ;;

;;; Each instance that has been merged
;;;    keeps record of all instances that have been merged into it
;;;    in its "multiple-definitions" slot, which is an association-list pairing
;;;    an instance name with a " MULTIPLE-DEFINITION-RECORD" indicating
;;;    what asserted knowledge must be restored if the instances are unmerged;

;(defstruct (MULTIPLE-DEFINITION-RECORD (:conc-name nil))
;	   (assert-conjuncts nil)
;	   (assert-role-fillers nil)
;	   (assert-features nil)
;	   (assert-attributes nil)
;	   )

(defstruct MULTIPLE-DEFINITION-RECORD
  identifiers   ;; list of ids that refer to a merged instance
  bombs         ;; list of role-chain equivalences that depend on this instance
  memberships)  ;; alist of (instance-identifier . comparison) pairs
                ;;   for equivalent role-chains having this instance as a value

;;; Make it look like the slot "multiple-identifiers" is attached
;;;    to "instance", when it really isn't:
;; #+CLTL2 (declaim (inline multiple-identifiers setf-multiple-identifiers))
;; #-CLTL2 (proclaim '(inline multiple-identifiers setf-multiple-identifiers))
(defun multiple-identifiers (instance)
  (let ((record (multiple-definitions instance)))
    (when record
      (multiple-definition-record-identifiers record)) ))
(defun setf-multiple-identifiers (instance newValue)
  (let ((record (or (multiple-definitions instance)
		    (setf (multiple-definitions instance)
			  (make-MULTIPLE-DEFINITION-RECORD)))))
    (setf (multiple-definition-record-identifiers record) newValue) ))

(defsetf multiple-identifiers setf-multiple-identifiers)

;;; Make it look like the slot "equivalence-memberships" is attached
;;;    to "instance", when it really isn't:
;; #+CLTL2 (declaim (inline equivalence-memberships setf-equivalence-memberships))
;; #-CLTL2 (proclaim '(inline equivalence-memberships setf-equivalence-memberships))
(defun equivalence-memberships (instance)
  (let ((record (multiple-definitions instance)))
    (when record
      (multiple-definition-record-memberships record)) ))
(defun setf-equivalence-memberships (instance newValue)
  (let ((record (or (multiple-definitions instance)
		    (setf (multiple-definitions instance)
			  (make-MULTIPLE-DEFINITION-RECORD)))))
    (setf (multiple-definition-record-memberships record) newValue) ))
(defsetf equivalence-memberships setf-equivalence-memberships)

;;; Make it look like the slot "equivalence-bombs" is attached
;;;    to "instance", when it really isn't:
;; #+CLTL2 (declaim (inline equivalence-bombs setf-equivalence-bombs))
;; #-CLTL2 (proclaim '(inline equivalence-bombs setf-equivalence-bombs))
(defun equivalence-bombs (instance)
  (let ((record (multiple-definitions instance)))
    (when record
      (multiple-definition-record-bombs record)) ))
(defun setf-equivalence-bombs (instance newValue)
  (let ((record (or (multiple-definitions instance)
		    (setf (multiple-definitions instance)
			  (make-MULTIPLE-DEFINITION-RECORD)))))
    (setf (multiple-definition-record-bombs record) newValue) ))
(defsetf equivalence-bombs setf-equivalence-bombs)

  ;;
;;;;;;  Bomb Structure Definitions
  ;;

(def-cs-struct (TRIGGER-ROLE-RECORD (:conc-name trigger-record-))
  (strict-features nil :context-sensitive-p t)
  (default-hits nil :context-sensitive-p t)
  (default-misses nil :context-sensitive-p t)
  (remote-bombs nil :context-sensitive-p t)
  )

(def-cs-struct (DEPENDENCY-BOMB (:conc-name nil))
  (bomb-type nil :context-sensitive-p t)
  (originator nil :context-sensitive-p t)
  )


#|
(def-cs-struct (REMOTE-BOMB (:include DEPENDENCY-BOMB ) (:conc-name nil))
  (monitored-feature nil)
  (feature-was-satisfied-p nil :context-sensitive-p t)
  (tested-in-default-mode-p nil :context-sensitive-p t)
  (trigger-concept nil)
  (concept-was-satisfied-p nil :context-sensitive-p t)
  (trigger-instances-counter nil :context-sensitive-p t)
  )
|#


(def-bit-flags :remote-bomb
    :feature-satisfied :default-mode :concept-satisfied)

(def-cs-struct (REMOTE-BOMB (:include DEPENDENCY-BOMB ) (:conc-name nil))
  (monitored-feature nil)
  (bomb-flags 0 :context-sensitive-p t)
  (trigger-concept nil)
  (trigger-instances-counter nil :context-sensitive-p t)
  )

(def-bit-accessor feature-was-satisfied-p bomb-flags :remote-bomb :feature-satisfied)
(def-bit-accessor tested-in-default-mode-p bomb-flags :remote-bomb :default-mode)
(def-bit-accessor concept-was-satisfied-p bomb-flags :remote-bomb :concept-satisfied)

(defstruct (EQUIVALENCE-BOMB (:include DEPENDENCY-BOMB ))
  role-chains       ;; list-of: (instance-id relation+)+
  decomposed-roles  ;; list of: all relations implicit in the role-chains
  saved-originator
  )

;; OBSOLETE (BUT ITS STILL CALLED):
(defun discard-equivalence-bomb (bomb)
  (declare (ignore bomb))
  nil )


  ;;
;;;;;; Strict and default fillers record
  ;;

;; TO DO: FIGURE OUT WHAT IS CONTEXT SENSITIVE AND WHAT ISN'T HERE:
(defstruct (INHERIT-FILLERS-RECORD (:conc-name nil))
  (inherit-fillers-test-concept nil)
  (inherit-fillers-fillers nil)
  (inherit-fillers-assertion-only-test-p nil)
  (inherit-fillers-subconcepts nil)
  )


  ;;
;;;;;; Rete bomb structure definitions and create/discard functions
  ;; 

#|
(def-cs-struct (RETE-BOMB (:conc-name rete-bomb-))
  (type nil) ;;  :local :remote :transition
  (dependent-node nil)
  (test-object-was-satisfied-p nil :context-sensitive-p t)
  (trigger-object nil)
  )

(def-cs-struct (RETE-REMOTE-BOMB (:include RETE-BOMB) (:conc-name rete-bomb-))
  ;; remote slots:
  (dependent-instance nil)
  (trigger-concept-was-satisfied-p nil :context-sensitive-p t)
  )
|#

;; Include flags for the type field, but can't really use them because
;;  the type field is NOT context-sensitive, but the others are.

(def-bit-flags :rete-bomb
    :local :remote :transition :test-satisfied :trigger-satisfied)

(def-cs-struct (RETE-BOMB (:conc-name rete-bomb-))
    (type nil) ;;  :local :remote :transition
  (flags 0 :context-sensitive-p t)
  (dependent-node nil)
  (trigger-object nil)
  )

(def-cs-struct (RETE-REMOTE-BOMB (:include RETE-BOMB) (:conc-name rete-bomb-))
  ;; remote slots:
  (dependent-instance nil)
  )

(def-bit-accessor rete-bomb-test-object-was-satisfied-p
    rete-bomb-flags :rete-bomb :test-satisfied)
(def-bit-accessor rete-bomb-trigger-concept-was-satisfied-p
    rete-bomb-flags :rete-bomb :trigger-satisfied)

;; avoid passing all those arguments:
#+CLTL2 (declaim (inline create-RETE-BOMB create-RETE-REMOTE-BOMB))
#-CLTL2 (proclaim '(inline create-RETE-BOMB create-RETE-REMOTE-BOMB))

(defun create-RETE-BOMB (type node triggerObject wasSatisfiedP)
  (let ((bomb (make-RETE-BOMB)))
    (setf (rete-bomb-type bomb) type)
    (setf (rete-bomb-dependent-node bomb) node)
    (setf (rete-bomb-trigger-object bomb) triggerObject)
    (setf (rete-bomb-test-object-was-satisfied-p bomb) wasSatisfiedP)
    bomb ))

(defun create-RETE-REMOTE-BOMB (type node triggerObject wasSatisfiedP 
				dependentInstance conceptWasSatisfiedP)
  (let ((bomb (make-RETE-REMOTE-BOMB)))
    (setf (rete-bomb-type bomb) type)
    (setf (rete-bomb-dependent-node bomb) node)
    (setf (rete-bomb-trigger-object bomb) triggerObject)
    (setf (rete-bomb-test-object-was-satisfied-p bomb) wasSatisfiedP)
    (setf (rete-bomb-dependent-instance bomb) dependentInstance)
    (setf (rete-bomb-trigger-concept-was-satisfied-p bomb) conceptWasSatisfiedP)
    bomb ))


  ;;
;;;;;; Structure definitions for query optimizer:
  ;;

(defstruct (VARIABLE/GENERATORS-RECORD (:conc-name nil))
  (generator-variable nil)
  (domain-generator nil)
  (generator-entries nil)
  )

(defstruct (GENERATOR-ENTRY (:conc-name nil))
  (generator-term nil)
  (generator-type nil)
  (inverse-generator-p nil)
  (generator-cardinality nil)
  (generator-agent-time-expression nil)
  (generator-world-time-expression nil)
  (generator-context nil)               ; (<contextForm> <bindingFlag>
  )
;;; legal values for "GENERATOR-ENTRY.generator-type":
;;;    :concept :role :computed-relation 
;;;    :scanned-tuple-relation :hashed-tuple-relation
;;;    :equivalence
;;; <bindingFlag> is T if the context form occurred in a query form
;;;    that requires setting up separate name lookup bindings
;;;    (ie, :within-theory) for generated query code.

(defun create-variable/generators-record (&key generator-variable)
  ;; Produce a new or recycled variable/generators record;
  (let ((newVGR (or (pop *recycled-variable/generators-records*)
		    (make-VARIABLE/GENERATORS-RECORD))))
    (setf (generator-variable newVGR) generator-variable)
    newVGR ))
  
(defun discard-variable/generators-record (vGR)
  ;; Clear slots in "vGR" and push onto recycle list;
  (progn
    (setf (generator-variable vGR) nil)
    (setf (domain-generator vGR) nil)
    (setf (generator-entries vGR) nil)
    (push vGR *recycled-variable/generators-records*)) )

(defun create-generator-entry (&key generator-term
				    generator-agent-time-expression
				    generator-world-time-expression
                                    generator-context)
  ;; Produce a new or recycled variable/generators record;
  (let ((newGenEntry (or (pop *recycled-generator-entries*)
			 (make-GENERATOR-ENTRY))))
    (setf (generator-term newGenEntry) generator-term)
    (setf (generator-agent-time-expression newGenEntry) generator-agent-time-expression)
    (setf (generator-world-time-expression newGenEntry) generator-world-time-expression)
    (setf (generator-context newGenEntry) generator-context)
    newGenEntry ))
  
(defun discard-generator-entry (generatorEntry)
  ;; Clear slots in "generatorEntry" and push onto recycle list;
  (progn
    (setf (generator-term generatorEntry) nil)
    (setf (generator-type generatorEntry) nil)
    (setf (inverse-generator-p generatorEntry) nil)
    (setf (generator-cardinality generatorEntry) nil)
    (setf (generator-agent-time-expression generatorEntry) nil)
    (setf (generator-world-time-expression generatorEntry) nil)
    (setf (generator-context generatorEntry) nil)
    (push generatorEntry *recycled-generator-entries*)) )


  ;;
;;;;;; Structure definitions for patterns
  ;;

(defstruct (PATTERN-VARIABLE
	     (:conc-name nil)
	     (:print-function print-pattern-variable))
  (variable-name nil)
  (variable-type nil)
  (variable-components nil)
  (constant-variable-p nil)
  (variable-maps-to nil)
  )

;; Separate function because of TI lossage in processing lambdas in the
;;  :print-function options that use structure accessors.

(defun print-pattern-variable (self stream depth)
  (if (= depth 0)
      (format stream
	      "|PV|~S(:type ~S :components ~S :maps-to ~S)"
	      (variable-name self)
	      (variable-type self)
	      (variable-components self)
	      (variable-maps-to self))
      (format stream "|PV|~S" (variable-name self))))


  ;;
;;;;;; Structure definitions for indices
  ;;

;;; The roles in a query index each point to a shared QUERY-INDEX:
#|
(defstruct (QUERY-INDEX (:conc-name nil))
  (indexed-concept nil)
  (blanket-index-p nil)
  (index-roles nil)
  (unique-key-p nil)
  (index-hash-table nil) )
|#


(def-bit-flags :query-index
    :blanket-index :unique-key)

(defstruct (QUERY-INDEX (:conc-name nil))
  (qi-flags 0)
  (indexed-concept nil)
  (index-roles nil)
  (index-hash-table nil) )

(def-bit-accessor blanket-index-p qi-flags :query-index :blanket-index)
(def-bit-accessor unique-key-p qi-flags :query-index :unique-key)

  ;;
;;;;;; "show" for database instances
  ;;

(defmethod show ((self DB-INSTANCE) &key (stream t))
  ;; CAUTION: This method actually doesn't work for instances
  ;;    of DB-INSTANCE, but it does work for instances of THING,
  ;;    which is all we care about;
  (labels ((find-real-slot-name (slot)
	     (if (KBCLASSES::aliases slot)
               (find-real-slot-name (KBCLASSES::aliases slot))
               (KBCLASSES::name slot))))
    (format stream "~%")
    (loop for slotName
	  in (append
	      (loop for selector in `(db-type conjuncts-table asserted-features)
		   collect selector)
	      (when (if-added-bombs self) (list 'if-added-bombs))
	      (when (if-removed-bombs self) (list 'if-removed-bombs)))
	  do
	  (format stream ":~S~20,5T~S~%"
		  slotName
		  (if (eq (KBCLASSES::allocation (KBCLASSES::get-slot slotName)) :dynamic)
                    (KBCLASSES::get-dynamic-clos-slot self slotName)
                    (CLOS::slot-value
                     self (find-real-slot-name (KBCLASSES::get-slot slotName))))))
    (loop for pair in (dynamic-variables self)
	  do (let ((slotName (car pair)))
	       (format stream ":~S~20,5T~S~%"
                       slotName (get-slot-values self slotName)))) ))


;;; THIS FUNCTION IS VERY SIMILAR TO "list-role-names&values"; UNFORTUNATELY,
;;;    BOTH FUNCTIONS ARE BEING CALLED BY EXTERNAL APPLICATIONS;
;;; IT IS ALSO SIMILAR TO "collect-asserted-roles&fillers", WHICH IS USED
;;;    INTERNALLY BY LOOM:
(defun list-roles-and-values (instance)
  ;; Return a list of the roles and values of "instance";
  (loop for (slotName . slotValue) in (dynamic-variables instance)
      when (and slotName slotValue)
      collect (cons slotName slotValue))
  )


  ;;
;;;;;; Macros that are needed in the ABox.
  ;;


(defmacro default-mode-p ()
  ;; Test to see if we are in default mode;
  ;; This variable is only rebound within a "let" statement-- this insures that
  ;;    its binding are always popped off of the stack when the default mode
  ;;    context is exited;
  `*defaultModeP* )


;;; BUGS:
#|
|#

;;; TO DO:
#|
|#
