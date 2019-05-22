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

;;; EXPORT.LISP (ABOX)

;;; These functions (along with "tell", "forget", etc.) define a
;;;    portion of the procedural interface to the database system, pattern
;;;    matcher and TMS.
 
(in-package "LOOM")

(export '(get-instance find-instance fi pi
	  find-context-of-instance
	  new-time-point world-time agent-time
	  match-instance
	  do-instances list-instances
	  initialize-instances reset-matcher
	  ))

  ;;
;;;;;; "find-instance", "fi", and "pi"
  ;;

;;;  Find database instances, given an instance identifier or instance;
;;;     In the normal case "get-instance" does the real work
;;;     -- "find-instance" adds some extra integrity checks and keywords,
;;;     making it slower but friendlier.

(defun find-instance (instanceOrName &key no-warning-p context kb ignore-package-p 
					  (match (if (symbolp instanceOrName)
						     :exact :case-insensitive)))
  ;; Return the instance corresponding to "instanceOrName";
  ;; Return NIL if no instance is found, a single instance if unique, otherwise a list of instances
  (obsolete-argument find-instance kb context #'get-context-from-kb)
  (let ((objects (find-objects instanceOrName :type :instances
			       :no-warning-p no-warning-p
			       :ignore-package-p ignore-package-p
			       :context context
			       :match match)))
    (cond ((atom objects) objects)
	  ((null (cdr objects)) (first objects))
	  (t objects))))

;;; Analogues of "fc", "pc", etc., for instances:

(defmacro fi (instanceSymbol &key context kb)
  (obsolete-argument fi kb context #'make-get-context-from-kb)
  `(find-or-evaluate-and-find ',instanceSymbol :instances :context ',context) )

(defmacro pi (instanceName &key assertions-only-p)
  ;; Print instance definition;
  ;; Print elaborated version of the instance unless "assertions-only-p" is set;
  (multiple-value-bind (instance context)
      (find-or-evaluate-and-find instanceName :instances)
    (when (null context)
      ;; when a pointer to an instance is passed in, we make our best guess:
      (setq context *context*))
    (when instance
      (if (instance-p instance)
	  `(let ((*expandSystemDefinedConceptsP* t))
	     (declare (special *expandSystemDefinedConceptsP*))
	     (pprint (generate-object-definition 
		      ,(if (object-name instance)
			   (form-constant-form instance :context context)
			 instanceName)
		      :augment-p ,(if assertions-only-p nil t))))
	;; Tricky:  This branch is only taken when skolems have merged
	;;          with constants, and are being printed:
	`(pprint ,instance))) ))

(defun find-context-of-instance (instance)
  ;; Return the context which contains "instance";
  (find-context-of-object instance :instances) )



  ;;
;;;;;; User-invoked Matching
  ;;

(defun update-derived-facts ()
  ;; Called by "ensure-visibility-of-updates" and "new-time-point-helper";
  ;; Run the recognizer and world time processor.  Update concept indices.
  ;; This ensures that all derived inferences are up-to-date;
  (process-queued-world-time-changes)
  (rerecognize-instances)
  (setq *match-is-pending-p* nil)
  ;; generate side-effects for each modified TYPE:
  (act-on-modified-types) )

;; COMMENT OUT INLINING UNTIL WE ARE DONE REVISING THIS:
;#+CLTL2 (declaim (inline ensure-visibility-of-updates))
;#-CLTL2 (proclaim '(inline ensure-visibility-of-updates))
(defun ensure-visibility-of-updates ()
  ;; If necessary, seal the network
  ;; If necessary, run the recognizer to insure that recent updates are
  ;;    visible to the query facility;
  ;; Strategy: Check for updates that either created a history (e.g., a role
  ;;    update) or posted an instance for rerecognition (e.g., a conjunct
  ;;    update);
  (seal-network)
  (when (or *match-is-pending-p* *queued-world-time-instance-list*)
    (update-derived-facts))
   )

(defun new-time-point (&key label)
  "Advance one time quantum.  If `label' is supplied, assign it the value
   of the new current time.  Update match queues, and trigger production
   firing (unless a transaction is in progress).  Production side-effects
   may further advance the time clock (generate more ticks).  Return the
   time of the last tick."
  (execute-in-contexts-breadth-first (new-time-point-helper label)) )

(defun new-time-point-helper (label)
  ;; Insure that all instances that need rerecognizing get rerecognized, and
  ;;    that all scheduled tasks get performed;
  ;; The match cycle has the highest priority, followed by the production
  ;;    rule firing cycle, followed by the task-performing cycle;
  (flet ((items-to-process-p ()  ;; Test function for continuing Loop
           (or *match-is-pending-p* 
               *list-of-modified-rete-instances*
               (and *activated-cohort-queue* (not (inside-of-transaction-p)))
               *queued-world-time-instance-list*)))
    (when label
      (label-time-point label *agent-time*))
    (unless (items-to-process-p)
      (return-from new-time-point-helper *agent-time*))
    (tagbody
     :new-time-point-loop
      (seal-network)
      (let ((*insideMatch/FireLoopP* t)
            (*do-in-subcontexts-p* nil)) ; Derived calculations done separately!
        (declare (special *insideMatch/FireLoopP*))
        (loop
	    do (progn
		 (ensure-visibility-of-updates)
		 (advance-history-queues)
		 (when *list-of-modified-rete-instances* 
		   (update-rete-match-network))
		 (when *activated-cohort-queue*
		   (let (*triggeringProductionsP*)
		     (declare (special *triggeringProductionsP*))
		     ;; ELIMINATE :recheck IF WE ELIMINATE RACE CONDITIONS
		     ;;    FROM RETE NETWORK:
		     (trigger-productions :recheck-concept-cohorts-p t))))
	    while (items-to-process-p)))
      (when (boundp '*insideMatch/FireLoopP*)
	;; if the call to "new-time-point-helper" was recursive, avoid performing
	;;    scheduled tasks -- instead, let top-level call perform them;
        (return-from new-time-point-helper nil))
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
    *agent-time* ))

(defun agent-time ()
  "Returns the value of the current agent time"
  *agent-time*)

(defun world-time (&optional (time nil time-p) (suffix 'none))
  "Sets, clears or queries the default global world time"
  (when time-p
    (if time
	(setf *query-world-time* (parse-time-expression time)
	      *query-world-time-suffix* suffix)
	(progn (makunbound '*query-world-time*)
	       (makunbound '*query-world-time-suffix*))))
  (if (boundp '*query-world-time*) *query-world-time* :unbound))


(defun match-instance (instance &key more-specific-p)
  ;; Recompute the TYPE of "instance";
  ;; "more-specific-p" indicates that its current TYPE
  ;;    is valid, but may become more specific;
  (setq instance (get-instance instance))
  (when (not more-specific-p)
    (initialize-one-instance instance)) 
  (rerecognize-instances) )

(defun reset-instance (instance)
  ;; Insure that "instance" is current, reinitialize
  ;;    it, and post it to a match queue;
  (setq instance (get-instance instance))
  (initialize-one-instance instance) )


  ;;
;;;;;; "copy-instance"
  ;;

(defmethod copy-instance ((instance DB-INSTANCE) &key identifier copy-into join-worlds-p context kb add-suffix-p)
  "Create an instance containing assertions equivalent to those
   found in the instance `instance'.  The identifier of the new instance
   will be system-generated unless it is indicated by `identifier'."
  ;; "join-worlds-p" indicates that the "join-worlds" function is performing
  ;;    a copy into, and that special parameters are to be passed to
  ;;    "copy-role-fillers";
  ;; TO DO:  MAKE THIS WORK FOR LITE AND CLOS INSTANCES AS WELL;
  (obsolete-argument copy-instance kb context #'get-context-from-kb)
  (when (and copy-into (not (classified-instance-p copy-into))) ; TAR 9/9/93
    (grumble "Copy-instance must copy into the same type of instance, in this ~%~
              case another CLASSIFIED-INSTANCE.~%~
              The target instance ~A is not of that type." copy-into)
    (return-from copy-instance nil))
  (let* ((copy (or copy-into
		   (create identifier (intrinsic-concept)
                           :creation-policy :classified-instance ; TAR 9/9/93
			   :context context :add-suffix-p add-suffix-p))))
    (loop for entry in (conjuncts-table instance)
	when (assertion-p (cdr entry))
	do (assert-conjunct copy (car entry) :assertion))
    
    (if join-worlds-p
	(copy-role-fillers instance copy t :phantoms)
	(copy-role-fillers instance copy nil nil))
    ;; DOES THIS CODE WORK BOTH FOR COPYING CLASSIFIED AND LOCAL RESTRICTIONS???:
    (loop for f in (asserted-features instance)
	do (push f (asserted-features copy)))
    (loop for n in (asserted-negations instance)
	do (push n (asserted-negations copy)))

    (post-non-analyzable-modified-instance copy :assertion (default-mode-p))
    (when *automatically-advance-state-p*
      (new-time-point))
    copy ))

(defmethod copy-instance ((instance LITE-INSTANCE) &key identifier copy-into join-worlds-p context kb add-suffix-p)
  "Create an instance containing assertions equivalent to those
   found in the instance `instance'.  The identifier of the new instance
   will be system-generated unless it is indicated by `identifier'."
  ;; "join-worlds-p" indicates that the "join-worlds" function is performing
  ;;    a copy into, and that special parameters are to be passed to
  ;;    "copy-role-fillers";
  ;; TO DO:  MAKE THIS WORK FOR LITE AND CLOS INSTANCES AS WELL;
  (declare (ignore join-worlds-p))
  (obsolete-argument copy-instance kb context #'get-context-from-kb)
  (when (and copy-into (not (lite-instance-p copy-into))) ; TAR 9/9/93
    (grumble "Copy-instance must copy into the same type of instance, in this ~%~
              case another LITE-INSTANCE.~%~
              The target instance ~A is not of that type." copy-into)
    (return-from copy-instance nil))
  (let* ((copy (or copy-into
		   (create identifier (intrinsic-concept)
                           :creation-policy :lite-instance        ; TAR 9/9/93
			   :context context :add-suffix-p add-suffix-p))))
    (loop for c in (dynamically-asserted-conjuncts instance)
	 do (assert-conjunct copy c :assertion))
    
    (copy-role-fillers instance copy nil nil)
    ;; DOES THIS CODE WORK BOTH FOR COPYING CLASSIFIED AND LOCAL RESTRICTIONS???:
    (loop for f in (asserted-features instance)
	 do (push f (asserted-features copy)))
    (loop for n in (asserted-negations instance)
	do (push n (asserted-negations copy)))

    (when *automatically-advance-state-p*
      (new-time-point))
    copy ))


	     

  ;;
;;;;;; Generate Instance Definitions
  ;;

(defmethod generate-object-definition ((self DB-INSTANCE) &key augment-p)
  ;; Generate a definition of "self" which can be saved and restored;
  ;; The description is based on the type, slot fillers, and asserted
  ;;    restrictions of "self";
  (declare (ignore augment-p))
  (generate-instance-definition self t) )

(defmethod generate-object-definition ((self CLOS-INSTANCE) &key augment-p)
  ;; Generate a definition of "self" which can be saved and restored;
  ;; The description is based on the type, slot fillers, and asserted
  ;;    restrictions of "self";
  (declare (ignore augment-p))
  (generate-instance-definition self t) )

(defmethod generate-object-definition ((self T) &key augment-p)
  ;; Generate a definition of "self" which can be saved and restored;
  ;; The description is based on the type, slot fillers, and asserted
  ;;    restrictions of "self";
  (declare (ignore augment-p))
  self )

(defun generate-named-clos-instances ()
  ;; Returns a list of forms to create and globally name CLOS instances from
  ;;   "*namedClosInstances*" taking the creation policy of "context"
  ;;   into account;
  (declare (special *namedClosInstances*))
  (let ((creationPolicy (creation-policy))) ; Using *context*
    (loop for (instance . id) in *namedClosInstances*
	as instancePolicy = (compute-instantiation-policy (type-of instance))
	when (skolem-instance-p instance)
	collect `(create-skolem-instance ',id 
					 :type ',(name (intrinsic-concept instance)))
	else collect `(create ',id ',(name (intrinsic-concept instance))
			      ,@(unless (eq creationPolicy instancePolicy)
				  `(:creation-policy ,instancePolicy)))) ))

(defun generate-anonymous-clos-instances ()
  ;; Returns a set of bindings for the creation of CLOS instances from
  ;;   "*anonymousClosIdentifierAlist*" taking the creation policy of "context"
  ;;   into account;
  (declare (special *anonymousClosIdentifierAlist*))
  (let ((creationPolicy (creation-policy))) ; Using *context*
    (loop for (instance . id) in *anonymousClosIdentifierAlist*
	  as instancePolicy = (compute-instantiation-policy (type-of instance))
	  collect `(,id (create nil ',(name (intrinsic-concept instance))
			 ,@(unless (eq creationPolicy instancePolicy)
			     `(:creation-policy ,instancePolicy))))) ))

(defun generate-reference-name (instance)
  (when (dont-substitute-names-p)
    (return-from generate-reference-name instance))
  (let* ((name (name instance))
         (accessibleP (eq instance
                          (typecase instance
                            (UNARY-CONCEPT (get-concept name :no-error-p t))
		            (TBOX-RELATION (get-relation name :no-error-p t))
			    (CONTEXT (find-context name)) ; TAR 7/11/96
		            (otherwise (get-instance name :error-p nil))))))
    (if accessibleP
      name
      (generate-extended-identifier 
       name
       (typecase instance
         (UNARY-CONCEPT (context instance))
         (TBOX-RELATION (context instance))
         (otherwise (grumble "Oops.  Generating a name for ~A that we can't parse again!" instance)
                    (find-context-of-instance instance))))) ))

(defun map-onto-cons (function cons &optional (trueListMaker 'list)
					      (consListMaker 'list*)) ;  TAR 7/29/94
  ;; Maps function onto each top-level item in the CONS chain "cons", 
  ;;  recursing down the CDRs only!
  ;; To get recursion on the CARs, the "function" must recursively invoke
  ;;   the "map-onto-cons" function.
  ;; This function is used to create proper structures when Loom objects are
  ;;   embedded in conses and lists.
  (let ((trueListP t)
        (results nil))
    (labels ((map-onto-one-cons (function cons)
               (push (funcall function (car cons)) results)
               (cond ((null (cdr cons))
                      nil)
                     ((atom (cdr cons))
                      (setq trueListP nil)
                      (push (funcall function (cdr cons)) results))
                     (t (map-onto-one-cons function (cdr cons))))))
      (map-onto-one-cons function cons)
      (if trueListP                     ;  TAR 3/8/95 nreverse!
        `(,trueListMaker ,@(nreverse results))
        `(,consListMaker ,@(nreverse results))) )))

(defun no-loom-objects-p (form)
  ;; Test FORM to verify that it does NOT contains Loom objects.  It can either
  ;;   an atom or a CONS.
  (if (consp form)
      (and (no-loom-objects-p (car form))
	   (no-loom-objects-p (cdr form)))
    (constant-p form)) )

(defun generate-filler (filler)
  ;; Called by "generate-asserted-clos-role-names&values", 
  ;;   "generate-asserted-role-names&values" and
  ;;   "generate-asserted-temporal-information";
  ;; Generates the appropriate form for "filler" base on its type;
  (declare (special *saving-to-a-file*))
  (cond ((boundp '*saving-to-a-file*)  
	 (typecase filler
	   (UNARY-ENTITY `(the-relation ',(generate-reference-name filler) 1))
	   (TBOX-RELATION `(the-relation ',(generate-reference-name filler)
					 ,(arity filler)))
	   (CONTEXT `(the-context ',(generate-reference-name filler))) ;TAR 7/11/96
	   (ROLE `(the-role ',(generate-reference-name (concept filler))
			    ',(generate-reference-name (relation filler))))
	   ((or CLOS-INSTANCE DB-INSTANCE) 
	    (if t ; (consp (identifier filler))
                (generate-instance-identifier filler t)
	      `(get-instance ',(generate-instance-identifier filler t))))
	   ((or #+:measures MEASURES:DIM-NUMBER NUMBER STRING) filler)
	   (CONS (if (no-loom-objects-p filler) ;  TAR 3/8/95        ;; SAVE-CONTEXT
                     `',filler
		   (map-onto-cons #'generate-filler filler :the-list :the-list*)))
	   (otherwise `',filler)))
	((dont-substitute-names-p) filler)
	(t (typecase filler
	     (UNARY-ENTITY `(the-relation ',(generate-reference-name filler) 1))
	     (TBOX-RELATION 
	      `(the-relation ',(generate-reference-name filler) ,(arity filler)))
	     (CONTEXT 
	      `(the-context ',(generate-reference-name filler))) ; TAR 7/11/96
	     (ROLE `(the-role ',(generate-reference-name (concept filler))
			      ',(generate-reference-name (relation filler))))
	     ((or CLOS-INSTANCE DB-INSTANCE)
	      (generate-instance-identifier filler t))
	     ((or #+:measures MEASURES:DIM-NUMBER NUMBER STRING) filler)
	     (CONS (if (no-loom-objects-p filler) ;  TAR 4/14/98
		       `',filler
		     (map-onto-cons #'generate-filler filler :the-list :the-list*)))
	     (otherwise `',filler)))) )

(defun generate-instance-identifier (instance referenceP)
  ;; Returns an identifier to use when referencing "instance";
  ;; "referenceP" indicates that "instance" is being referred to when
  ;;     generating a description of some other instance; Otherwise,
  ;;     we are generating a description of "instance";
  ;; If "instance" has a user-supplied identifier, then return it,
  ;; When "instance" is anonymous, we:
  ;;    - return a synthetic identifier if we are saving to a file, otherwise
  ;;    - return nil if "referenceP" is nil, otherwise
  ;;    - return "instance" so that users see something unique to "instance";
  ;; When saving an anonymous instance:
  ;;    Check to see if this instance has already been referenced
  ;;    (it will then be on the "*anonymousClosIdentifierAlist*").  If so,
  ;;    then return the appropriate identifier.
  ;;    If it is not on this list, then create a new identifier to use.
  (declare (special *anonymousClosIdentifierAlist* *namedClosInstances*))
  (let ((id (identifier instance)))
    (cond
     ((dont-substitute-names-p) instance)       ;  TAR 3/8/96
     ((boundp '*namedClosInstances*)	; Saving to a file.
      (if (consp id)				; its anonymous
        (let ((bindingId (assoc instance *anonymousClosIdentifierAlist*)))
          (if bindingId
            (cdr bindingId)
            (let ((newId (gentemp "?CLOS-")))
              (push (cons instance newId) *anonymousClosIdentifierAlist*)
              newId)))
        (if (eq instance (evaluate-identifier-locally id :INSTANCES *context*)) ; Local
          (progn
            (pushnew (cons instance id) *namedClosInstances* :key #'car)
            id)
          (generate-reference-name instance))))
     ((listp id)                        ; its anonymous
      ;; "(identifier instance)" is nil or a list of anonymous instances
      (if referenceP instance (gentemp "?CLOS-")))  ; TAR 3/24/93
     ((eq instance (evaluate-identifier-locally id :INSTANCES *context*))   ; Local
      id)
     (t (generate-reference-name instance))) ))

(defmethod generate-instance-definition (self selfContainedP)
  ;; Return a form which defines "instance";
  ;; "selfContainedP" indicates that the entire definition of "self" is
  ;;    wanted; otherwise, a "create" has been generated for "self" elsewhere,
  ;;    and we only want the remaining attributes generated here;
  (let ((identifier (generate-instance-identifier self nil)))
    `(tell
       ,@(generate-instance-attributes self identifier selfContainedP)) ))

(defmethod generate-instance-definition ((self DB-INSTANCE) selfContainedP)
  ;; Return a form which defines "self";
  (declare (ignore selfContainedP))
  (if (discarded-p self)
    `((object-name ,self) :discarded)
    (call-next-method)) )

(defun generate-create-body (self)
  ;; Return a body form that creates an instance equivalent to "self"
  ;;  for use inside of a :create statement.  This does not include
  ;;  the identifier!;
  `(,(if (dont-substitute-names-p)
       (intrinsic-concept self)
       (name (intrinsic-concept self)))
    ,(etypecase self
       (LITE-INSTANCE :lite-instance)
       (CLOS-INSTANCE :clos-instance)
       (DB-INSTANCE (if (skolem-instance-p self)
			:skolem-instance
		      :classified-instance)))))

(defun generate-create-instance (self identifier)
  ;; Return a form that creates an instance equivalent to "self", for
  ;;    use inside of a "tell" (at top level);
  `(:create ,identifier
	    ,@(generate-create-body self)) )

(defun generate-instance-attributes (self identifier createP)
  ;; Return a form that defines (within a "tell" statement) a list of attributes
  ;;    of "self" other than its intrinsic concept;
  ;; If "createP" then include a :create statement;
  (let ((*forceNamingOfUnnamedConcepts* nil)
	(*dontSubstituteNamesP* nil))
    (declare (special *forceNamingOfUnnamedConcepts* *dontSubstituteNamesP*))
    (generate-instance-attributes-helper self identifier createP) ))

(defun generate-instance-attributes-helper (self identifier createP)
  ;; Return a form that defines (within a "tell" statement) a list of attributes
  ;;    of "self" other than its intrinsic concept;
  ;; If "createP" then include a :create statement;
  (declare (special *saving-to-a-file*))
  (let ((conjuncts (generate-asserted-conjuncts self))
        (descriptions (generate-asserted-descriptions self))
;        (roleNames&Values (unless (boundp '*saving-to-a-file*)  ;; SAVE-CONTEXT
;                            (generate-asserted-role-names&values self)))
        (roleNames&Values (generate-asserted-role-names&values self))
        (temporalInformation (generate-asserted-temporal-information
                              (time-map self))))
    (if (or conjuncts roleNames&Values descriptions temporalInformation)
      `((:about ,identifier
	        ,@(when createP `((:create ,@(generate-create-body self))))
	        ,@conjuncts
                ,@roleNames&Values
	        ,@descriptions
	        ,@temporalInformation)
        ,@(generate-asserted-negations self identifier))
      `(,@(when createP
            (list (generate-create-instance self identifier)))
        ,@(generate-asserted-negations self identifier))) ))

(defmethod generate-asserted-conjuncts ((self T))
  ;; The default method assumes an instance with no asserted conjuncts;
  nil )



(defmethod generate-asserted-conjuncts ((self INSTANCE-WITH-CONCEPTS))
  ;; Return a list of conjuncts asserted for "instance";
;  (loop for concept in (dynamically-asserted-conjuncts self)
;        collect (name concept))
  ;; THIS IS A KLUDGE:
  (declare (special *saving-to-a-file*))
  (let ((intrinsicConcept (intrinsic-concept self))
	(DontShowSystemDefinedP (boundp '*saving-to-a-file*))) ; TAR 6/14/96
    (if (dont-substitute-names-p)
      (loop for concept in (dynamically-asserted-conjuncts self)
	    unless (or (eq concept intrinsicConcept)
		       (eq concept *thing*)
		       (and DontShowSystemDefinedP 
			    (system-defined-concept-p concept)))
	    collect concept)
      (loop for concept in (dynamically-asserted-conjuncts self)
	    unless (or (eq concept intrinsicConcept)
		       (eq concept *thing*)
		       (and DontShowSystemDefinedP
			    (system-defined-concept-p concept)))
	    collect (name concept))) ))

(defmethod generate-asserted-conjuncts ((self DB-INSTANCE))
  ;; Return a list of conjuncts asserted for "instance";
  (declare (special *expandSystemDefinedConceptsP* *saving-to-a-file*))
  (let ((showSystemDefinedP (not (boundp '*saving-to-a-file*)))) ; TAR 6/14/96
    (if (dont-substitute-names-p)
      (loop for (concept . flag) in (conjuncts-table self)
	    when (and (assertion-p flag)
		      (neq concept (intrinsic-concept self))
		      (neq concept *thing*)
		      (or showSystemDefinedP (user-defined-concept-p concept)))
	    collect concept)
      (loop for (concept . flag) in (conjuncts-table self)
	    when (and (assertion-p flag)
		      (neq concept (intrinsic-concept self))
		      (neq concept *thing*)
		      (or showSystemDefinedP (user-defined-concept-p concept)))
	    collect (name concept))) ))



;; ASSERTED CONJUNCTS MUST HAVE NAMES, SO WE SHOULDN'T NEED THIS MUCH
;;    MACHINERY:
;(defmethod generate-asserted-conjuncts ((self DB-INSTANCE))
;  ;; Return a list of conjuncts asserted for "instance";
;  (declare (special *expandSystemDefinedConceptsP*))
;  (let ((typeList (loop for entry in (conjuncts-table self)
;                        when (assertion-p (cdr entry))
;                        collect (car entry))))
;    (loop for concept 
;          in (if (boundp '*expandSystemDefinedConceptsP*)
;               (find-named-superconcepts-of-supers typeList)
;               typeList)
;	  collect (name concept))) )

(defmacro make-role-name&value-loop (argument singleValueCode multipleValueCode)
  ;; Macro called by "generate-asserted-role-names&values" and
  ;;   "generate-role-filler-forms" that creates the basic
  ;;   loop for iterating over role names;
  ;; InnerCode represents the specific action taken for each 
  ;;    "name", "role" and "value";
  ;; KLUDGE: "censoredRoleNameList" contains a list of role names that we do
  ;;     not want to generate, ever!
  `(let ((result nil)
	 (censoredRoleNameList '(name arity restrictions concept relation)))
     (loop for (name . nil) in (sort (list-role-names&values ,argument )
				     #'string-greaterp   ; We push down below!
		                     ;; We call name to handle cases
		                     ;; where we don't substitute
		                     ;; names for relation objects
				     :key #'(lambda (x)
					      (symbol-name (name (car x)))))
           as role = (find-relation name)
	   unless (or (and (system-defined-concept-p role)          ;  TAR 9/28/94
                           (not (member :referenced-by-role 
                                        (system-attributes role))))
                      (if (dont-substitute-names-p)
                        (member (name name) censoredRoleNameList)
                        (member name censoredRoleNameList)))
           do ,(if (equal singleValueCode multipleValueCode)
                  `(loop for value in (get-asserted-role-fillers ,argument role)
                         do (push ,singleValueCode result))
                  `(loop for value in (get-asserted-role-fillers ,argument role)
                         when (relation-is-single-valued-p role)
                           do (push ,singleValueCode result)
                         else do (push ,multipleValueCode result))))
     result ))

(defun generate-asserted-role-names&values (self)
  ;; Return a list pairing role names and values for non-empty
  ;;    roles asserted to "instance";
  ;; Note: We generate a list of lists rather than a list of conses because
  ;;    the output is meant for viewing by humans;
  (make-role-name&value-loop self
                              (list name (generate-filler value))
                              (list name (generate-filler value))) )

(defun generate-role-filler-forms (instance)
  ;; Return a list pairing role names and values for non-empty
  ;;    roles asserted to "instance";
  ;; Roles are processed to be used by an add-value or set-value function;
  (let ((instanceReference 
	 (typecase instance
	   (CONTEXT (generate-filler instance))
	   (ROLE (generate-filler instance))
	   (otherwise 
	    `(get-instance ',(generate-instance-identifier instance t))))))
      (make-role-name&value-loop instance
      		                 `(fset-value ,instanceReference
                                              ',name
                                             ,(generate-filler value))
                                 `(fadd-value ,instanceReference
                                              ',name
					      ,(generate-filler value))) ))


(defun generate-asserted-temporal-information (timeMap)
  ;; Returns a representation of the information in "timeMap" (for the
  ;;   current agent time only);
  ;; Processes a returned list in the form
  ;;    (TIME (CHANGE SLOT VALUE ...) ...)
  ;;    where each TIME should appear only once.  SLOT is a relation object for
  ;; relations, and :TYPE for concepts.  The value is the relation range
  ;; object for relations and the concept object for concepts;
  ;;    Appropriate formatting is done for output;
  ;; TO DO:  CONSOLIDATE SOME OF THE ENTRIES AND RECOGNIZE :holds-at;
  (labels ((translate-change (change)		; tar 5/25/93
	    (cdr (assoc change '((:persists-forward . :holds-after)
				 (:persists-backward . :holds-before)
				 (:becomes . :begins-at)
				 (:ceases . :ends-at)))))
	   (form-concept-change (time change data)
	    (loop for concept in data
		  collect `(,(translate-change change) ,(format-time time nil)
			    ,(name concept))))
	   (form-relation-change (time change relation data)
	    (loop for datum in data
		  collect `(,(translate-change change) ,(format-time time nil)
			    (,(name relation) ,(generate-filler datum))))))
    (unless timeMap
      (return-from generate-asserted-temporal-information nil))
    (loop for (time . changes) in (generate-asserted-temporal-slots timeMap)
	  as changeForms =
	     (loop for (change (key . data)) in changes
		   when (eq key :type)	
		   append (form-concept-change time change data)
		   else append (form-relation-change time change key data))
	  when (and (numberp time) changeForms)		; Exclude +/-INFINITY
	  append changeForms) ))

(defmethod generate-asserted-descriptions ((self T))
  ;; The instance "self" has no asserted descriptions (features);
  nil )

(defmethod generate-asserted-descriptions ((self NEGATION-MIXIN))
  ;; Return a list of descriptions asserted for "self";
  (loop for ftr in (reclassify-instance-features self :asserted)
      collect (feature-to-source-clause ftr)) )

(defmethod generate-asserted-negations ((self T) identifier)
  ;; The instance "self" has no negated assertions;
  (declare (ignore identifier))
  nil )

(defmethod generate-asserted-negations  ((self NEGATION-MIXIN) identifier)
  ;; Return a list of :not-in assertions (:not-filled-by assertions
  ;;    are generated by "generate-asserted-descriptions");
  (loop for neg in (asserted-negations self)
        collect `(not (,(name neg) ,identifier))) )

(defmethod generate-asserted-equivalences ((self T)) ; DGB 12/10/93
  ;; Helping function for "generate-instance-attributes";
  nil)

(defmethod generate-asserted-equivalences ((self NEGATION-MIXIN))   ; DGB 12/10/93
  ;; Helping function for "generate-instance-attributes";
  ;; Return a list of definitions representing the equivalences in the 
  ;;    asserted restrictions of "self";
  (loop for feat in (asserted-features self)
       when (typep feat 'COMPARISON-FEATURE)
       collect (generate-comparison-clause feat)) )


  ;;
;;;;;; "do-instances" and "list-instances"
  ;;

;; QUESTION 1: SHOULD THIS TAKE A CONTEXT AS AN ARGUMENT?:
;; QUESTION 2: SHOULD THIS SKIP OVER CONCEPTS?:
(defmacro do-instances ((iterationVar) &body body)
  ;; Iterate over all instances in all contexts and
  ;;    evaluate "body" with "iterationVar" bound to each instance;
  `(loop for cxt in (list-contexts)
	do
	(do-context-partition
	  (nil ,iterationVar
               (loop for p in (context-partitions cxt)
                     when (eq (key p) :instances)
                     return p))
	  ,@body)) )

(defun list-instances ()
  ;; Return a list of all database instances;
  (loop for cxt in (list-contexts)
       append (list-context cxt :partitions :instances)) )


  ;;
;;;;;; (Re)initialization of ABox Instances
  ;;

(defun initialize-instances ()
  ;; Reset the database global variables, and wipe out instances;
  ;; Clear concept extensions, unconvert instances in role fillers features;
  (reset-database-variables)
  ;; wipe-out instances in all contexts;
  (within-context *context*
    (loop for cxt in (list-contexts)
          when (and (null (parent-contexts cxt)) ; Only clear from top!
                    (ctxt cxt)) 
	  do (clear-context-sublattice cxt '(:instances))))
  ;; eliminate all rete net caches:
  (clear-rete-network)
;; PHASING OUT WORLDS CODE:
;  (change-world nil)
  *context* )

(defun reset-matchers ()
  ;; Reset global variables used by the LOOM and RETE matchers;
  ;; Called when something gets screwed up in the ABox, and
  ;;    we hope to recover without reinitializeing all instances;
  ;; Note: Borrows code from "reset-database-variables";
  ;; TO DO: SEE IF OTHER THINGS SHOULD ALSO BE RESET;
  (when (loop for i from $STRICT-RETRACTION-Q$ to $ACT-ON-Q$	; RMM 12/12/89
	      thereis (aref *match-queues* i))
    (inform "Warning: Clearing out match queues in ~A" *context*)) ; tar 7/2/92 INFORM?
  (fill *match-queues* nil)
  (setq *list-of-modified-rete-instances* nil) )

