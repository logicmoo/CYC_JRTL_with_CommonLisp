;;; -*- Mode:Common-Lisp; Package:LOOM; Syntax:COMMON-LISP; Base:10 -*-

;;; PERSIST.LISP (ABOX)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1999, 2003 University of Southern California                 ;
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
;;; Loom interface to the TI Open Object-Oriented Database (OODB) system;


(in-package "LOOM")
(use-package "PSILISP")
(export '(open-persistent-store close-persistent-store clear-persistent-store
	  list-persistent-instance-names INSTANCE-WITH-PERSISTENCE))

(eval-when (compile load eval)
  (CLOS::defclass INSTANCE-WITH-PERSISTENCE (INSTANCE-IN-KNOWLEDGE-BASE) ())
  )

(defparameter *oodb-storage-group* 2)
(defparameter *oodb-api* nil)
(defparameter *oodb-transaction* nil)
(defparameter *oodb-name-table* (make-hash-table :test 'equal))

(defmacro using-persistent-store-p ()
  ;; Return non-nil if an OODB connection is currently available;
  '*oodb-api*)

(defun open-persistent-store ()
  ;; Establish a connection to the Exodus storage manager, and mount the
  ;;    storage group in which persistent objects are to be saved;
  ;; Begin an OODB transaction;
  ;; Read the names of all currently-saved persistent instances and enter
  ;;    them into a lookup table;
  ;; NOTE:  OODB Version 0.2 allows only one connection per Lisp session;
  ;; TO DO: Parameterize this function for server address and storage group;
  (unless (using-persistent-store-p)
    #+:lucid
    (LCL::rehash ALIEN::*foreign-struct-accessors*) ; TEMPORARY
    (setq PSILISP::*handle-unsentriable-object* :decache)
    (setq *oodb-api*
	  (make-instance
	   'LISP-API
	   :asm-name "darkstar:8000"
	   :mutator-types '((UNARY-CONCEPT . #'form-accessor)
			    (TBOX-RELATION . #'form-accessor))))
    (mount-storage-group *oodb-api* *oodb-storage-group*)
    (setq *oodb-transaction*
	  (begin-transaction *oodb-api* :mark-modify-mode :manual))
    (loop for name in (list-names *oodb-api* :sgid *oodb-storage-group*)
	  do (setf (gethash name *oodb-name-table*) t))
    t) )

(defmethod form-accessor ((self UNARY-CONCEPT) parent root)
  ;; On output, translate "self" into a Loom concept-accessing expression
  ;;    that will be evaluated on input to recreate the original concept;
  (declare (ignore parent root))
  (when (user-defined-concept-p self)
    `(get-concept ',(name self))) )

(defmethod form-accessor ((self TBOX-RELATION) parent root)
  ;; On output, translate "self" into a Loom relation-accessing expression
  ;;    that will be evaluated on input to recreate the original relation;
  (declare (ignore parent root))
  (when (user-defined-concept-p self)
    `(get-relation ',(name self))) )

(defun close-persistent-store ()
  ;; Save any outstanding changes, and close the connection to Exodus;
  ;; NOTE: With OODB 0.2, a new Lisp must be started to re-establish
  ;;    the connection;
  (when (using-persistent-store-p)
    (checkpoint-transaction *oodb-transaction*)
    (shutdown *oodb-api*)
    t) )

(defun clear-persistent-store ()
  ;; Remove the name/object bindings for all persistent instances in the
  ;;    current storage group, and reinitialize the storage group;
  (when (using-persistent-store-p)
    (loop for name in (list-persistent-instance-names)
	  do (remove-name *oodb-api* name))
    (checkpoint-transaction *oodb-transaction*)
    (reinitialize-storage-group *oodb-api* *oodb-storage-group*)) )

(defun list-persistent-instance-names ()
  ;; Return a list of the names of all persistent instances in the storage
  ;;    group that is currently mounted;
  (when (using-persistent-store-p)
    (list-names *oodb-api* :sgid *oodb-storage-group*)) )

(defmethod initialize-clos-instance :AFTER
    ((self INSTANCE-WITH-PERSISTENCE) identifier knowledgeBase)
  ;; Mark a new CLOS instance as persistent, save it, and enter its global name
  ;;    in the Loom persistent object lookup table;
  ;; NOTE: An instance's global name is currently the same as its identifier;
  (declare (ignore knowledgeBase))
  (when (using-persistent-store-p)
    (let ((name (symbol-name identifier)))
      (persist *oodb-api* self :name name)
      (checkpoint-transaction *oodb-transaction*)
      (setf (gethash name *oodb-name-table*) t))) )

;;; From 2.0 UTILITY.LISP (add "*clearingInstancePartitionP*" special variable):
(defun detach-database-instances (instancesPartition &key destroy-tbox-constants-p)
  ;; Helping function for "clear-one-knowledge-base";
  ;; For each database instance in "instancesPartition", forget all about it;
  ;; We are careful to step outside of the current world to do our
  ;;    forgetting;
  (let ((saveCurrentWorld *world*)
	*clearingInstancePartitionP*)
    (declare (special *clearingInstancePartitionP*))
    (change-world nil)
    (do-kb-partition (nil self instancesPartition)
      (when (not (meta-thing-p self))
        (forget-instance&history
         self :destroy-tbox-constant-p destroy-tbox-constants-p)))    
    (when saveCurrentWorld
      (change-world saveCurrentWorld)) ))

;;; From 2.0 TELL.LISP:
(defmethod forget-all-about
    ((self SYMBOL) &key dont-unintern-p destroy-tbox-constant-p)
  ;; Retract all facts about the instance having identifier "self";
  ;; If "self" is an unmaterialized persistent instance, materialize it;
  (let ((instance (if *world*
		      (eval-instance-id-in-*world* self)
		      (eval-instance-id self)))
	(name (symbol-name self)))
    (when (and (null instance)
	       (using-persistent-store-p)
	       (gethash name *oodb-name-table*))
      (setq instance (get-object *oodb-api* name)))
    (when (and instance
	       (not (discarded-p instance)))
      (forget-all-about instance
                        :dont-unintern-p dont-unintern-p
                        :destroy-tbox-constant-p destroy-tbox-constant-p)) ))

(defmethod forget-all-about :AFTER
    ((self INSTANCE-WITH-PERSISTENCE) &key dont-unintern-p destroy-tbox-constant-p)
  ;; If "dont-unintern-p", mark the persistent instance "self" as modified;
  ;; Otherwise, dissociate "self" from its global name, and remove the name
  ;;    from the Loom persistent object lookup table;
  (declare (ignore destroy-tbox-constant-p)
	   (special *clearingInstancePartitionP*))
  (when (using-persistent-store-p)
    (unless (boundp '*clearingInstancePartitionP*)
      (if dont-unintern-p
	  (mark-modified *oodb-api* self)
	  (let ((name (symbol-name (identifier self))))
	    (remove-name *oodb-api* name)
	    (checkpoint-transaction *oodb-transaction*)
	    (remhash name *oodb-name-table*))))) )

(defmethod assert-conjunct :AFTER
    ((self INSTANCE-WITH-PERSISTENCE) conjunct justification)
  ;; Mark the persistent instance "self" as modified;
  (declare (ignore conjunct justification))
  (when (using-persistent-store-p)
    (mark-modified *oodb-api* self)) )

(defmethod retract-conjunct :AFTER
    ((self INSTANCE-WITH-PERSISTENCE) conjunct justification)
  ;; Mark the persistent instance "self" as modified;
  (declare (ignore conjunct justification))
  (when (using-persistent-store-p)
    (mark-modified *oodb-api* self)) )

(defmethod assert-role-filler :AFTER
    ((self INSTANCE-WITH-PERSISTENCE) role filler justification)
  ;; Mark the persistent instance "self" as modified;
  (declare (ignore role filler justification))
  (when (using-persistent-store-p)
    (mark-modified *oodb-api* self)) )

(defmethod retract-role-filler :AFTER
    ((self INSTANCE-WITH-PERSISTENCE) role filler justification
     &key dont-retract-domain-conjunct-p dont-modify-filler-p)
  ;; Mark the persistent instance "self" as modified;
  (declare (ignore role filler justification
		   dont-retract-domain-conjunct-p dont-modify-filler-p))
  (when (using-persistent-store-p)
    (mark-modified *oodb-api* self)) )

;;; From 2.0 EXPORT.LISP:
(defun new-time-point (&key label)
  ;; Advance agent time;
  ;; Checkpoint all persistent instances that were marked as modified
  ;;    during the previous time quantum;
  (when (not (or *match-is-pending-p* *list-of-modified-rete-instances*
		 *activated-cohort-queue*))
    ;; don't advance agent time if nothing has changed:
    (when *list-of-*agent-time*-histories*
      (advance-time-clock)
      (advance-history-queues))
    (return-from new-time-point *agent-time*))
  (let ((labelTimePointP label))
    (prog
	()
     :new-time-point-loop
     (seal-network)
     (let ((*insideMatch/FireLoopP* t))
       (declare (special *insideMatch/FireLoopP*))
       (loop
	   do (progn
		;; critical: advance time BEFORE matching, or recent updates
		;;    will be invisible:
		(when *match-is-pending-p*
		  (let ((*agent-time* (1+ *agent-time*)))
		    (rerecognize-instances))
		  (setq *match-is-pending-p* nil)
		  ;; generate side-effects for each modified TYPE:
		  (act-on-modified-types))
		;; advance time for real:
		(advance-time-clock)
		(when labelTimePointP
		  ;; set label to FIRST in series of time points:
		  (label-time-point label *agent-time*)
		  (setq labelTimePointP nil))
		(advance-history-queues)
		(when *list-of-modified-rete-instances*
		  ;; update LOOM and CLOS instances in rete network:
		  (update-rete-match-network))
		(when *activated-cohort-queue*
		  (let (*triggeringProductionsP*)
		    (declare (special *triggeringProductionsP*))
		    ;; ELIMINATE :recheck IF WE ELIMINATE RACE CONDITIONS
		    ;;    FROM RETE NETWORK:
		    (trigger-productions :recheck-concept-cohorts-p t))))
	   while (or *match-is-pending-p* *list-of-modified-rete-instances*
		     *activated-cohort-queue*))
       ;; if there are newly-modified instances, advance clock to obtain
       ;;    temporally current kb (no matching or triggers are pending):
       (when *list-of-*agent-time*-histories*
	 (advance-time-clock)
	 (advance-history-queues)))
     (when (boundp '*insideMatch/FireLoopP*)
       ;; if the call to "new-time-point" was recursive, avoid performing
       ;;    scheduled tasks -- instead, let top-level call perform them;
       (return-from new-time-point nil))
     ;; check for unfilled keys in newly-created instances:
     (loop for (instance . key) in *instances-with-unfilled-keys*
	   do (check-for-unfilled-keys instance key))
     (setq *instances-with-unfilled-keys* nil)
     (when *higher-priority-task-is-pending-p*
       ;; perform all tasks that have higher priority than the current
       ;;    task (which may not exist);
       (let (nextTask)
	 (loop
	     while (setq nextTask (select-next-task))
	     do (progn
		  (setq *higher-priority-task-is-pending-p* nil)
		  (perform-task nextTask :success-p) ; :success-p makes "perform-task" happy
		  (when *match-is-pending-p*
		    ;; set flag in case task queue is non-empty
		    (setq *higher-priority-task-is-pending-p* t)
		    (go :new-time-point-loop)))))))
    (when (using-persistent-store-p)
      (checkpoint-transaction *oodb-transaction*))
    *agent-time* ))

;;; From 2.0 WORLDS.LISP:
(defun get-instance (self &key kb error-p)
  ;; Return the instance with identifier "self" if
  ;;    "self" is a symbol; otherwise, return
  ;;    the NON-SHADOWED instance that corresponds to "self";
  ;; Retrieval is made relative to the current world or knowledge base;
  ;;    "get-instance" can be used to find an instance visible in the
  ;;    current world that shadows "self";
  ;; If local retrieval fails, determine whether "self" names a persistent
  ;;    instance, and if so, materialize and return that instance;
  ;; CAUTION: The cache variables MUST be cleared whenever the current
  ;;    symbol tables are swapped (when "change-kb" or "change-world" is
  ;;    called), or whenever the instances symbol table is updated
  ;;    by "intern-object", "unintern-object", "intern-instance-in-world"
  ;;    and "unintern-instance-in-world";
  ;;    The cache also MUST NOT be set if the kb argument is given;
  (labels ((signal-missing-instance ()
             (setq *get-instance-cached-instance* nil)
             (setq *get-instance-cached-value* nil)
             (if error-p
               (cerror "Return the value NIL."
                       "There is no instance named '~S'." self)
               nil))
           (help-get-instance ()
             (cond
              ((symbolp self)
               (or (if (null kb)
                     (eval-instance-id self)
                     (evaluate-identifier self :instances kb))
                   (when (extended-identifier-p self)
                     (evaluate-extended-identifier self :instances))
		   (when (using-persistent-store-p)
		     (get-persistent-instance self))
                   (signal-missing-instance)))
              ((quoted-p self)
               (second self))
              (t
               self))))
    (if (null kb)
      (if (eq self *get-instance-cached-instance*)
        *get-instance-cached-value*
        (progn
	  (setq *get-instance-cached-instance* self)
	  (setq *get-instance-cached-value* (help-get-instance))))
      (help-get-instance)) ))

;;; From 2.0 USERS.LISP:
(defun help-find-object (input partitionName noErrorP knowledgeBase)
  ;; Helping function for "find-or-evaluate-and-find";
  ;; Return two values: (1) the found object (or nil), and
  ;;    (2) the knowledge base it was found in;
  ;; If local retrieval fails, determine whether "input" names a persistent
  ;;    instance, and if so, materialize and return that instance;
  ;; NOTE: For now, this function always returns the current knowledge base
  ;;    when a persistent instance is retrieved;
  ;; TO DO: CONSIDER MAKING THE IGNORE PACKAGE PREFIX LOGIC WORK FOR WORLDS;
  (let (pattern wildcardPatternP positionOfStar substring substringLength 
	extendedIdKb kbsToSearch resultKb resultObject)
    (labels ((get-pattern-location
	       (kb)
	       (catch 'maphash-catcher
		 (do-kb-partition
 		   ( key self 
		    (find-partition 
		      partitionName (kb-partitions kb))
		    :skip-anonymous-instances-p t)
		   (when (key-matches-pattern-p key)
		     (throw 'maphash-catcher self)))
		 nil))
	     (key-matches-pattern-p
	       (key)
	       (if (and (symbolp key)
			(stringp pattern))
		   (let ((string (symbol-name key)))
		     (or (string-equal pattern string)
			 (and wildcardPatternP
			      (case positionOfStar
				(:start 
				 (string-suffix-p 
				   substring string substringLength))
				(:end
				 (string-prefix-p 
				   substring string substringLength))
				(:both
				 (search substring string))))))
		   (eql pattern key))))		; pattern is an integer
      (when (not (instance-identifier-p input))
	(return-from help-find-object 
	  (if (instance-p input)
	      (values input nil)
	      (values nil nil))))
      (when (symbolp knowledgeBase)
	(setq knowledgeBase (find-kb knowledgeBase)))
      (if (symbolp input)
	  (progn
	    (multiple-value-setq (input extendedIdKb)
	      (parse-extended-identifier input :no-error-p noErrorP))
	    (setq pattern (symbol-name input))
	    (setq wildcardPatternP (position #\* pattern))
	    (setq positionOfStar (string-position-of-star pattern))
	    (setq substring (remove #\* pattern))
	    (setq substringLength (length substring)))
	  (setq pattern input))			; pattern is an integer
      (if (and *world* 
	       (eq partitionName :instances))
	  (progn
	    (setq resultKb (knowledge-base-of-world *world*))
	    (setq resultObject (eval-instance-id-in-*world* input)))
	  (progn
	    (setq kbsToSearch
		  (for kb in (kb-precedence-list
			       (or knowledgeBase extendedIdKb *knowledge-base*))
		       when (find-partition
			      partitionName (kb-partitions kb))
		       collect kb))
	    (or (for kb in kbsToSearch
		     thereis
		     (setq resultKb kb)
		     (setq resultObject 
			   (evaluate-identifier-locally input partitionName kb)))
		(for kb in kbsToSearch
		     thereis
		     (setq resultKb kb)
		     (setq resultObject (get-pattern-location kb))))))
      (when (and (null resultObject)
		 (symbolp input)
		 (eq partitionName :instances)
		 (using-persistent-store-p))
	(setq resultKb *knowledge-base*)
	(setq resultObject (get-persistent-instance input)))
      (if (or (and (instance-p resultObject)
		   (not (deleted-instance-p resultObject)))
	      (typep resultObject 'ACTION))
	  (values resultObject resultKb)
	  (values nil nil)) )))

(defun get-persistent-instance (identifier)
  ;; Lookup "identifier" in the Loom persistent instance name table, and if
  ;;    an entry is found, materialize the saved instance;
  ;; TO DO:  As written, this function always interns the retrieved instance 
  ;;    in the current knowledge base; the instance should be restored to its 
  ;;    original knowledge base (or context) instead;
  (let ((name (symbol-name identifier)))
    (when (gethash name *oodb-name-table*)
      (let ((instance (get-object *oodb-api* name)))
	(intern-object identifier instance :instances nil)
	instance))) )

