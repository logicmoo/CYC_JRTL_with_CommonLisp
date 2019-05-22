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

;;; PRODUCTIONS.LISP (ABOX)

;;; Contains code for defining and triggering production rules;

(in-package "LOOM")

(export '( defproduction delete-production
	  find-production get-production fp list-productions
	  transaction exit-transaction without-productions
	  ))


  ;;
;;;;;; High and medium-level entries to production rules
  ;;

(defmacro defproduction 
	  (name &key when provided perform schedule do achieve priority)
  "Define or redefine a production rule with name `name'"
  (cond
    ((more-than-one-true-value perform schedule do achieve)
     (error "Production ~S can have at most one of :perform, :schedule, ~%   ~
              do, and :achieve clauses" name))
    ((not (or perform schedule do achieve))
     (error "Production ~S has no :perform, :schedule, :do, or :achieve clause" name))
    (t
     `(redefine-production :production ',name ',when
			   ,@ (when provided `(:provided ',provided))
			   ,@(when perform `(:perform ',perform))
			   ,@(when schedule `(:schedule ',schedule))
			   ,@(when do `(:do ',do))
			   ,@(when achieve `(:achieve ',achieve))
			   :priority ',priority))) )

(defmacro define-production
	  (name &key when perform schedule do achieve priority)
  "Define or redefine a production rule.  The pattern in the `when'
   clause can reference predicates either as objects or by name."
  ;; TO DO: OBJECT REFS MAY CAUSE PATTERNS TO BREAK;
  `(redefine-production :production ,name ,when
			,@(when perform `(:perform ,perform))
			,@(when schedule `(:schedule ,schedule))
			,@(when do `(:do ,do))
			,@(when achieve `(:achieve ,achieve))
			:priority ,priority) )


(defun delete-production (productionOrName &key error-p)
  "Delete the production rule `productionOrName'"
  (let ((production (get-production productionOrName :no-error-p t)))
    (cond
      (production
       (case (action-verb production)
	 ((:perform :schedule)
          (when (action production)
	    (delf (dependent-productions (action production)) production)))
	 (otherwise nil))
       ;; delete "production" from *activated-production-queue*:
       (uncompile-production production)
       (delf *list-of-uncompiled-productions* production)
       ;; CAN'T FIGURE OUT IF THIS LINE WAS DETERMINED TO BE BAD:  RMM 12/8/92:
       (unintern-object production :behaviors (context production))
       production)
      (error-p
       (error "Can't delete non-existent production or monitor: ~S~%"
	      productionOrName))) ))

(defun get-production (productionOrName &key no-error-p)
  "Return the production rule named `productionOrName', or the object itself
   if `productionOrName' is not a symbol"
  ;; If there is none, return nil if "no-error-p" is set, or else
  ;;    generate an error;
  (if (symbolp productionOrName)
      (or (eval-behavior-id productionOrName)
	  (unless no-error-p
	    (error "There is no production rule or monitor named '~S'"
		   productionOrName)))
      productionOrName) )

(defun find-production (productionOrName &key no-warning-p)
  "Get production rule `productionOrName' and verify its type"
  (find-behavior productionOrName 'PRODUCTION :no-warning-p no-warning-p) )

(defun list-productions (&key context kb)
  "Return a list of the production rules in all contexts,
   or in the context `context'"
  (obsolete-argument list-productions kb context #'get-context-from-kb)
  (loop for k in (or (list-of context)
		(list-contexts))
       append
       (loop for p in (list-context k :partitions :behaviors)
	    when (typep p 'PRODUCTION)
	    collect p)) )

(defmethod generate-object-definition ((self PRODUCTION) &key augment)
  ;; Generate a definition of the production rule "self";
  (declare (ignore augment))
  `(,(typecase self
       (MONITOR 'defmonitor)
       (otherwise 'defproduction))
     ,(name self)
     :when ,(source-query self)
     ,(action-verb self)
     ,(case (action-verb self)
;	(:achieve
;	 (source-query (goal-pattern self)))
	(:do
	 (action self))
	((:perform :schedule)
	 `(,(name (action self)) ,@(action-parameters self))))
     ,@(when (eq (action-verb self) :schedule)
	 `(:priority ,(priority self)))) )

(defmacro fp (productionName &key context kb)
  "Return the production rule named `productionName'"
  (obsolete-argument fp kb context #'make-get-context-from-kb)
  `(find-or-evaluate-and-find ',productionName :behaviors :context ',context))


  ;;
;;;;;; "redefine-production"
  ;;

;;; These functions are employed to define and redefine production objects.

(defun redefine-production (productionOrMonitor name query
			                        &key provided perform schedule do achieve priority)
  ;; Redefine an old production or create a new one;
  ;; Assumption: At most one of "perform", "schedule", "do", and "achieve" is non-nil;
  (flet ((transition-operator-p (operator)
           (and (symbolp operator)
                (member (symbol-name operator)
                        '("DETECTS" "UNDETECTS" "CHANGES")      ; RMM 12/8/92
                        :test #'equal))))
    (let ((newProduction (eval-behavior-id name))
	  (actionExpr (or perform schedule do achieve))
	  (actionVerb
	   (cond
	    (perform :perform)
	    (schedule :schedule)
	    (do :do)
	    (t :achieve)))
          *behaviorBeingParsed*)
      (declare (special *behaviorBeingParsed*))
      (catch 'parse-behavior-catcher
        (setq *behaviorBeingParsed* `(:type PRODUCTION :name ,name))
        (cond
         ((find-new-behavior-conflict name)
          (behavior-parsing-error
	   "The name ~A is visible as the name of a production or monitor~%~
            in a subcontext of ~A"
           name *context*))
	 ((null newProduction)
	  (setq newProduction
	        (case productionOrMonitor
		  (:production (make-loom-instance 'PRODUCTION :name name))
		  (:monitor (make-loom-instance 'MONITOR :name name))))
	  (intern-behavior name newProduction))
	 ((not (typep newProduction 'PRODUCTION))
	  (behavior-parsing-error
	   "Another object of type ~S already has the name ~S"
	   (name (class-of newProduction)) name))
	 (t
	  (uncompile-production newProduction)))
        ;; accommodate obsolete syntax:
        (when (and (consp query)	; :when (FOO ?x)
		   (= (length query) 2)
                   (not (transition-operator-p (first query))))
	  (inform "~%Production rule syntax ~S is obsolete (in ~S).~%  ~
                   Transformed into (:DETECTS ~S) by Loom.~%"
		  query newProduction query)
	  (setq query `(:detects ,query)))
        (when (and (consp query)	; :when (:fail (FOO ?x))
		   (eq (first query) :fail)
		   (= (length (second query)) 2)
                   (not (transition-operator-p (first (second query)))))
	  (inform "~%Production rule syntax ~S is obsolete (in ~S).~%  ~
                   Transformed into (:UNDETECTS ~S) by Loom.~%"
		  query newProduction (second query))
	  (setq query `(:undetects ,(second query))))		 
        (when provided ;; accomodate obsolete :provided clause:
	  (inform "~%Production rule argument :PROVIDED ~S is obsolete (in ~S).~%  ~
                   Combined with :WHEN clause (:AND ~S ~S) by Loom.~%"
		  provided newProduction query provided)
	  (setq query `(:and ,query ,provided)))
        (setf (source-query newProduction) query)
        (setf (action-verb newProduction) actionVerb)
        (validate-production-variables query actionVerb actionExpr)
        ;; fill in slots for goal or action expression:
        (case actionVerb
	  ((:perform :schedule)
	   (let ((action 
		  (find-or-create-action (car actionExpr) nil)))
	     (setf (action newProduction) action)
	     (pushnew newProduction (dependent-productions action))
	     (setf (action-parameters newProduction) (cdr actionExpr))))
	  (:do
	    ;; compute parameter list (in arbitrary order):
	    (setf (action-parameters newProduction)
	          (collect-free-variables actionExpr))
	    ;; attach uncompiled lisp s-expr to "action" slot:
	    (setf (action newProduction) do))
	  (otherwise				; :achieve
	   (progn
             ;	     (setf (goal-pattern newProduction)
             ;	           (define-parameterized-goal achieve nil))
	     )))
        (setf (priority newProduction) priority)
        ;; now that "newProduction" has been initialized, set special variable
        (setq *behaviorBeingParsed* newProduction)
        (when (and priority
		   (not (member priority *task-priorities*)))
	  (behavior-parsing-error
	   "Illegal priority specified.  Priority must belong to ~S"
	   *task-priorities*))
        (compile-production newProduction)      ; RMM 11/22/94
        (return-from redefine-production newProduction))	; successful parse
      nil						; bad parse
      )))						; end "redefine-production"

(defun validate-production-variables (query actionVerb actionExpr)
  ;; Verify that the free variables from "query" coincide with
  ;;    the list of parameters from "actionExpr";
  ;; Also, partially validate syntax of "actionExpr";
  (case actionVerb
    ((:perform :schedule)
     (when (not (and (consp actionExpr)
                     (symbolp (first actionExpr))))
       (behavior-parsing-error
        "Argument to :perform or :schedule must be a list that begins~%   ~
         with the name of an action"))
     (let* ((parameters (collect-free-variables actionExpr))
           (badParameters
            (loop for p in parameters
                 when (not (member p (collect-free-variables query)))
                 collect p)))
       (when badParameters
         (behavior-parsing-error
          "Could not find free variable~P~{ ~S~^,~} in :when expression"
          (length badParameters)
          (nreverse badParameters)))))
    (otherwise ;; no validate of :do or :achieve (yet)
     nil)) )


  ;;
;;;;;; production compilation
  ;;

;;; Procedure for compiling productions:
;;;    Normalize the source query;
;;;    From the normalized query, determine the set of free variables;
;;;    From the action determine the set of output variables;
;;;    Set difference yields existentially-quantified variables;
;;;    Call "generate-cohorts" to generate partial queries corresponding
;;;       either to disjuncts within the query, or to multiple conjuncts
;;;       within a transition clause;
;;;    Compute and compile function that applies the production action
;;;       to a binding set.
;;;    Generate initial binding sets (POSSIBLY THIS IS A MISTAKE);

(defun compile-production (production)
  ;; Compile start up query and generate cohorts;
  ;; TO DO: ADD DEPENDENCY LINKS BETWEEN PRODUCTIONS AND CONCEPT REFS;
  (let (normalizedQuery unusedVariables)
    (within-context (context production)
      (setq normalizedQuery 
            (normalize-query (source-query production)
                             :expand-agent-time-transitions-p
                             (typecase production
                               (MONITOR :monitor)
                               (otherwise :production))
                             :query-picture production))
      (when (null normalizedQuery)      ; RMM 11/22/94
        (when (not *network-is-sealed-p*)
          ;; guess that the problem is that a concept wasn't sealed yet:
          (push production *list-of-uncompiled-productions*))
        (return-from compile-production nil))
      (case (action-verb production)
        (:do
          ;; TO DO: ADD ENVIRONMENT MESSAGE TO CATCH SITUATIONS
          ;;     WHEN COMPILER COMPLAINS:
          (when (setf unusedVariables           ; tar 6/9/93
                      (collect-unused-variables
                       (action-parameters production)
                       (action production)))
            (complain "~A's :do clause doesn't reference ~
                       variable~P~%~{ ~A~^,~} from the :when clause"
                      production (length unusedVariables) unusedVariables))
          (setf (compiled-do-action production)
                (compile nil `(lambda ,(action-parameters production)
                                ,@(when unusedVariables         ; tar 6/9/93
                                    `((declare (ignore ,@unusedVariables))))
                                ,@(action production)))))
        (otherwise
         nil)) ;; no other cases compile any code here
      (generate-cohorts production normalizedQuery)) ))

(defmethod uncompile-production ((self PRODUCTION))
  ;; Called by "redefine-production" and "delete-production";
  ;; Unlink cohorts from "self" and discard;
  ;; Clear out slots filled during compilation;
  ;; Note: We don't know whether each cohort is in an if-added or
  ;;    if-removed queue, so we remove them from both queues;
  ;; TO DO: REMOVE DEPENDENCY LINKS BETWEEN PRODUCTIONS AND CONCEPT REFS;
  (loop for cohort in (production-cohorts self)
       do
       (typecase (cohort-predicate cohort)
	 (UNARY-CONCEPT
	  (let ((reteNode (rete-node (cohort-predicate cohort))))
            (when reteNode
              (execute-in-contexts-depth-first 
	       (delf (rete-if-added-cohorts reteNode) cohort)
	       (delf (rete-if-removed-cohorts reteNode) cohort)))))
	 (otherwise
          (execute-in-contexts-depth-first 
	   (delf (if-added-cohorts (cohort-predicate cohort)) cohort)
	   (delf (if-removed-cohorts (cohort-predicate cohort)) cohort))))
       (delf *activated-cohort-queue* cohort)
       (discard-cohort cohort))
  (setf (production-cohorts self) nil)
  (setf (output-binding-sets self) nil)
  (setf (compiled-do-action self) nil)
  (delf *activated-production-queue* self) )

(defun discard-cohort (cohort)
  ;; Clear slots of "cohort" and recycle;
  ;; WE DON'T RECYCLE THESE YET;
  (delf *activated-cohort-queue* cohort)
  nil )

(defun compile-productions-after-sealing ()
  ;; Called by "seal-network";
  ;; Compile all productions that were not compiled immediately
  ;;    after they were defined;
  ;  (let ((*behaviorBeingParsed* (list :type 'PRODUCTION :name nil))) ;)
  (let (*behaviorBeingParsed*)
    (declare (special *behaviorBeingParsed*))
    (catch 'parse-behavior-catcher
      (loop for p in *list-of-uncompiled-productions*
	    do
            ;; THIS LOOKS RIDICULOUS???:
            ;           (setf (getf *behaviorBeingParsed* :name) (name p))
	    (setq *behaviorBeingParsed* p)
	    (compile-production p))
      (setq *list-of-uncompiled-productions* nil)) ))

(defmethod uncompile-predicate-cohorts ((self UNARY-CONCEPT))
  ;; Called by "uncomplete-one-concept" because "self" is being
  ;;    revised;
  ;; Eliminate all cohorts attached to the rete node for "self",
  ;;    and uncompile and all associated productions and post them
  ;;    on *list-of-uncompiled-productions*;
  ;; Unlink the rete node defined for "self";
  (let ((reteNode (rete-node self)))
    (when reteNode
      (loop for cohort in (rete-if-added-cohorts reteNode)
	   do (uncompile-one-cohort cohort))
      (loop for cohort in (rete-if-removed-cohorts reteNode)
	   do (uncompile-one-cohort cohort))
      ;; unlink rete node from rete network and from "self";
      (when (combinator-node-p reteNode)
        (loop for prior in (rete-prior-input-nodes reteNode)
             do (delf (rete-subsequent-output-nodes prior) reteNode)))
      (discard-instance reteNode)
      (setf (rete-node self) nil)) ))

(defun uncompile-all-predicate-cohorts (self)
  (execute-in-contexts-depth-first 
   (uncompile-predicate-cohorts self)))

(defmethod uncompile-predicate-cohorts ((self TBOX-RELATION))
  ;; Called by "uncomplete-one-concept" because "self" is being
  ;;    revised;
  ;; Eliminate all cohorts attached to "self", uncompile associated
  ;;    productions, and post them on *list-of-uncompiled-productions*;
  (loop for cohort in (if-added-cohorts self)
       do (uncompile-one-cohort cohort))
  (loop for cohort in (if-removed-cohorts self)
       do (uncompile-one-cohort cohort)) )

(defmethod uncompile-predicate-cohorts ((self UNARY-RELATION))
  ;; Called by "uncomplete-one-concept" because "self" is being
  ;;    revised;
  ;; WE DON'T KNOW IF PROPERTIES SHOULD HAVE ATTACHED COHORTS OR NOT;
  ;;    CURRENTLY WE ASSUME NOT;
  nil )

(defun uncompile-one-cohort (cohort)
  ;; Eliminate "cohort" and post its corresponding production on the
  ;;    list of uncompiled productions;
  (when (primary-production cohort)
    (uncompile-production (primary-production cohort))) )


  ;;
;;;;;; production cohort compilation
  ;;


(defun generate-cohorts (production normalizedQuery &key recursive-p)
  (execute-in-contexts-depth-first
   (help-generate-cohorts production normalizedQuery recursive-p)))

(defun help-generate-cohorts (production normalizedQuery recursive-p)
  ;; Find a simple agent time transition clause within "normalizedQuery";
  ;; Split "normalizedQuery" into partial queries, one for each clause in
  ;;    the agent time transition subquery, and generate a cohort for each one;
  ;; Assumes that "normalizedQuery" contains no nested :and's, no top-level
  ;;    :exists's, etc.;
  ;; If agent time change clauses don't exist at top level, tries convering
  ;;    the normalized query to disjunctive normal form (at top level);
  (flet ((remove-query-clause (clause query previouslyP)
	   ;; Logically delete "clause" from "query"; return
	   ;;    normalized result;
	   (if (eq clause query)		; query = <literal>
	       nil
	       (let* ((otherConjuncts (remove clause (rest query)))
                      (returnForm (if (rest otherConjuncts)
		                    `(:and ,@otherConjuncts)
		                    (first otherConjuncts))))
                 (if previouslyP
                   `(:previously ,returnForm)
                   returnForm)))))
    (let (changeClause changeBody residualQuery)
      (cond
	((and (consp normalizedQuery)
	      (eq (first normalizedQuery) :or))
	 (loop for disjunct in (rest normalizedQuery)
	      do (help-generate-cohorts production disjunct recursive-p)))
	((setq changeClause
	       (find-simple-change-clause normalizedQuery
					  :error-p recursive-p))
	 (setq changeBody (second changeClause))
	 (setq residualQuery
	       (remove-query-clause changeClause normalizedQuery nil))
	 (if (keywordp (first changeBody))	; :and clause
	     (loop for changeConjunct in (rest changeBody)
		  do (generate-one-cohort
		       production (first changeClause) changeConjunct
		       (conjoin-normalized-queries
			 residualQuery
			 (remove-query-clause changeConjunct 
                                              changeBody
                                              (eq (first changeClause) :undetects)))))
	     (generate-one-cohort
	       production (first changeClause) changeBody residualQuery)))
	(t ;; could not find a agent time change clause:
	 (unless recursive-p
	   ;; try again after elevating any embedded disjuncts
	   (setq normalizedQuery
		 (convert-to-top-level-dnf-query normalizedQuery))
	   (help-generate-cohorts production normalizedQuery t)))) )))

(defun generate-one-cohort 
       (production transitionIndicator transitionClause residualQuery)
  ;; Helping function for "generate-cohorts";
  ;; Create a production cohort, install agent time triggers based on
  ;;    "transitionIndicator" and "transitionClause", and compile
  ;;    "residualQuery" into a generator of binding sets for "production";
  ;; If we are monitoring a relation, conjoin "transitionClause" with
  ;;    "residualQuery" to insure that the bindings are valid across
  ;;    multiple updates (concept triggers make this check inside of
  ;;    "distribute-instance-to-concept-cohorts", "assert-rete-total-support"
  ;;    and "retract-rete-total-support");
  ;; BUG: ROLE TRIGGERS DON'T INSURE THAT THE VALUE THEY TRIGGER ON
  ;;    DOES NOT EQUAL THE PREVIOUS VALUE OF A PRODUCTION;
  (let ((cohort (make-instance 'PRODUCTION-COHORT))
	(relation (first transitionClause))
	inputVariables dummyVariables unusedVariables warnAboutVariables
        insurancePredicate queryBody)
    ;; link the new cohort to its primary production:
    (setf (primary-production cohort) production)
    (push cohort (production-cohorts production))
    ;; fill in cohort specification:
    (setf (transition-indicator cohort) transitionIndicator)
    (setf (cohort-predicate cohort) relation)
    (setq insurancePredicate 
	  (install-cohort-trigger-code production cohort transitionClause))
    (when insurancePredicate
      (setq residualQuery
	      (if residualQuery
		  `(:and ,insurancePredicate,residualQuery)
		  insurancePredicate)))
    (loop for arg in (reverse (rest transitionClause))          ; RMM 6/15/93
          do
          (if (question-mark-variable-p arg)
            (push arg inputVariables)
            (let ((dummy (form-gensym-variable "?V")))
              (push dummy inputVariables)
              (push dummy dummyVariables))))
    (setq queryBody
	  (if residualQuery 
            (if (action-parameters production)     ; RMM 1/25/93
	      (form-query-code 
               (action-parameters production) residualQuery inputVariables
               :query-picture production)
              `(when ,(form-query-code nil residualQuery inputVariables
                                       :query-picture production)
                 (list nil)))
	      `(list (list ,@(action-parameters production)))))
    (when (null queryBody)
      ;; exit if bad query syntax encountered:
      (return-from generate-one-cohort nil))
    (setf unusedVariables           ; tar 6/9/93
	  (collect-unused-variables inputVariables queryBody))
    (when (setq warnAboutVariables (set-difference unusedVariables 
                                                   dummyVariables))
      (complain "~%~A's action clause doesn't reference ~
                              variable~P~%~{ ~A~^,~} from the :when clause"
		production (length warnAboutVariables) warnAboutVariables))
    (setf (cohort-query cohort)
	  (case (length inputVariables)
	    (1 `(lambda ,inputVariables
                  ,@(when unusedVariables           ; tar 6/9/93
                        `((declare (ignore ,@unusedVariables))))
		  ,queryBody))
	    (2 `(lambda (pair)
		  (let ((,(first inputVariables) (car pair))
			(,(second inputVariables) (cdr pair)))
                    ,@(when unusedVariables           ; tar 6/9/93
                        `((declare (ignore ,@unusedVariables))))
		    ,queryBody)))
	    (otherwise
	     `(lambda (tuple)
		(let ((,(first inputVariables) (first tuple))
		      (,(second inputVariables) (second tuple))
		      (,(third inputVariables) (third tuple))
		      ,@(loop for var in (cdddr inputVariables)
			     as i from 3
			     collect `(,var (nth ,i inputVariables))))
                  ,@(when unusedVariables           ; tar 6/9/93
		     `((declare (ignore ,@unusedVariables))))
		  ,queryBody)))))		
    (setf (compiled-cohort-query cohort)
	  (compile nil (cohort-query cohort))) ))
    
(defun find-simple-change-clause (query &key error-p)
  ;; Helping function for "generate-cohorts";
  ;; Search for a top-level clause in "query" headed by :detects, :undetects,
  ;;    or :changes;
  ;; Pick the first one that is "simple", i.e., that contains a non-negated
  ;;    predication, or a conjunction of non-negated literals;
  (declare (special *behaviorBeingParsed*))
  (let ((nonPrimitiveGenerator nil)
	(temporalGenerator nil)
        transitionClauses simpleTransitionClause)
    (labels ((simple-clause-p (clause)
	       (and (consp clause)
		    (or (and (not (keywordp (first clause)))	; simple predication
                             (or (primitive-concepts (first clause))
                                 ; FOO
                                 (progn
                                   (push (generate-external-reference
					  (first clause))
					 nonPrimitiveGenerator)
                                   nil))
			     (or (not (temporal-p (first clause)))
				 (progn
				   (push (generate-external-reference
					  (first clause))
					 temporalGenerator)
                                   nil)))
		        (and (eq (first clause) :and)
			     (loop for subClause in (rest clause)
				   always (simple-clause-p subClause))))))
	     (transition-clause-p (clause)
	       (and (consp clause)
		    (member (first clause) '(:detects :undetects :changes))))
	     (find-all-transition-clauses (subQuery)
	       (and (consp subQuery)
		    (cond
		     ((transition-clause-p subQuery)
		      (list subQuery))
		     ((eq (first subQuery) :and)
		      (loop for conjunct in (rest subQuery)
			    append (find-all-transition-clauses conjunct)))))))
    (setq transitionClauses (find-all-transition-clauses query))
    (setq simpleTransitionClause (loop for clause in transitionClauses
                                       when (simple-clause-p (second clause))
                                       return clause))
    (when (and (null simpleTransitionClause)
               error-p)
      ;; remove bad production from queue (before the upcoming throw):
      (when (typep *behaviorBeingParsed* 'PRODUCTION)
        (delf *list-of-uncompiled-productions* *behaviorBeingParsed*))
      ;; then generate error message:
      (cond
       ((null transitionClauses)
        (if (loop for op in '(:detects :undetects :changes)
                   never (search-tree-p op (source-query *behaviorBeingParsed*)))
          (behavior-parsing-error 
           "Production query does not contain any top-level :detects,~%   ~
            :undetects, or :changes clauses")
          (behavior-parsing-error
           "Production query contains an illegal :detects, :undetects,~%   ~
            or :changes clause.  Probably the predicate within it is~%   ~
            marked :perfect or :monotonic.")))
       (nonPrimitiveGenerator
        (behavior-parsing-error 
         "Production rules cannot trigger on concepts or relations~%   ~
          (such as ~{~S~^, ~})~%   ~
          that contain no primitiveness."  nonPrimitiveGenerator))
       (temporalGenerator
        (behavior-parsing-error 
       "Production rules cannot trigger on temporal concepts or relations~%   ~
          (such as ~{~S~^, ~})."  temporalGenerator))
       (t
        (behavior-parsing-error
         "Can't find :detects, :undetects, or :changes clause containing~%   ~
           only a non-negated literal or a conjunction of non-negated~%   ~
           literals"))))
      simpleTransitionClause )))

(defun conjoin-normalized-queries (query1 query2)
  ;; Called by "generate-cohorts";
  ;; Return a normalized (conjunctive normal form) query representing the 
  ;;    conjunction of "query1" and "query2";
  ;; Assumes that both queries are normalized;
  (flet ((conjunctive-p
	   (query)
	   (and (consp query)
		(eq (first query) :and))))
    (cond
      ((null query1) query2)
      ((null query2) query1)
      (t
       `(:and
	  ,@(if (conjunctive-p query1) 
		(if (conjunctive-p query2)
		    (append (rest query2) (rest query1))
		    (cons query2 (rest query1)))
		(if (conjunctive-p query2)
		    (cons query1 (rest query2))
		    (list query1 query2)))))) ))

(defun convert-to-top-level-dnf-query (query)
  ;; Helping function for "generate-cohorts";
  ;; Situation: "query" is conjunctive and has no agent time change clauses at
  ;;    top-level, but may have them within embedded disjuncts;
  ;; Convert "query" to DNF at top level in an effort to find any such disjuncts,
  ;;    and return the result;
  (let ((*expandAgentTimeTransitionsP* nil)
	disjunction otherConjuncts)
    (declare (special *expandAgentTimeTransitionsP*)) ;; make "simplify-wff" happy
    (if (and (consp query)
	     (eq (first query) :and)
	     (cdr (rest query))			; two or more conjuncts
	     (setq disjunction
		   (loop for conjunct in (rest query)
			when (and (consp conjunct)
				     (eq (first conjunct) :or))
                        return conjunct)))
	(progn
	  (setq otherConjuncts
		(remove disjunction (rest query)))
	  (simplify-wff
	    `(:or
	       ,@(loop for disjunct in (rest disjunction)
		      collect
		      (convert-to-top-level-dnf-query
			`(:and ,disjunct ,@otherConjuncts))))
	    nil))
	query) ))

(defmethod install-cohort-trigger-code ((self PRODUCTION) cohort transitionClause)
  ;; Helping method for "generate-one-cohort";
  ;; Insert code at appropriate places that monitors the transition
  ;;    predicate for "cohort", and activates the cohort whenever
  ;;    the transition is satisfied;
  ;; Return an insurance clause for cases when the activation
  ;;    of a cohort occurs before the end of a time quantum;
  (let ((transitionIndicator (transition-indicator cohort))
	(relation (cohort-predicate cohort))
	(insuranceClause nil))
    (if (= (length transitionClause) 2)		; "relation" is a concept
	;; create rete cascade to recognize changes to the instantiation
	;;    relationship for the concept "relation":
	(let ((reteNode (find-or-create-rete-cascade relation nil)))
	  ;; install trigger link from rete node to "cohort";
	  (ecase transitionIndicator
	    (:detects
	     (push cohort (rete-if-added-cohorts reteNode)))
	    (:undetects
	     (push cohort (rete-if-removed-cohorts reteNode)))))
	;; form predicate to test whether intermediary changes instantiation
	;;    relationship for relation resulted in changes at the end
	;;    of the time quantum:
	;;    also install trigger link from "relation" to "cohort":
	(ecase transitionIndicator
	  (:detects (setq insuranceClause `(:detects ,transitionClause))
		    (push cohort (if-added-cohorts relation)))
	  (:undetects (setq insuranceClause `(:undetects ,transitionClause))
		      (push cohort (if-removed-cohorts relation)))))
    insuranceClause ))


  ;;
;;;;;; Normalization of agent time transition clauses
  ;;

(defun normalize-agent-time-transition-clause (operator argument)
  ;; Called by "simplify-agent-time-wff";
  ;; '("operator" "argument") is a :detects or :undetects predication;
  ;; Expand role chains embedded in "arguments";
  ;; Expand backward-chaining concepts and relations into equivalent queries
  ;;    composed only of forward-chaining concepts and relations;
  ;; Lift top-level :or, :exists, or :forall outside of transition
  ;;    clauses;
  ;; Lift :perfect predicates outside of transition clauses, and
  ;;    :monotonic predicates outside of :undetects clauses;
  ;; TO DO: NORMALIZATION OF EMBEDDED :forall NOT YET IMPLEMENTED;
  (declare (special *expandAgentTimeTransitionsP*))
  (let (invariantClauses liftedExistentialVariables normalizedClause)
    (labels ((invariant-predicate-p (predicate)
	       (and (typep predicate 'TBOX-CONCEPT)
		    (or (perfect-p predicate)
			(and (eq operator :undetects)
			     (monotonic-p predicate)))))
             (contains-invariant-predicate-p (term)
	       (and (consp term)
		    (if (eq (first term) :and)
			(loop for arg in (rest term) 
			     thereis (contains-invariant-predicate-p arg))
			(invariant-predicate-p (first term)))))
	     (extract-time-invariant-predicates (term)
	       (cond
		 ((atom term) term)
		 ((invariant-predicate-p (first term))
		  (push term invariantClauses)
		  nil)
		 ((eq (first term) :and)
		  (let ((residueTerms nil)
			residueConjunct)
		    (setq residueTerms
			  (loop for conjunct in (rest term)
			       when (setq residueConjunct 
					  (extract-time-invariant-predicates
					    conjunct))
			       collect residueConjunct))
		    (when residueTerms
		      `(:and ,@residueTerms))))
		 (t term)))
	    (wrap-with-existentials&invariants (query)
	      (when invariantClauses
		(setq query `(:and ,@invariantClauses 
				   ,@(when query (list query)))))
	      (if liftedExistentialVariables
		  `(:exists ,liftedExistentialVariables ,query)
		  query)))
      (setq *expandAgentTimeTransitionsP* nil)	; avoid recursively expanding
      (when (contains-role-chain-p argument)
	(setq argument (expand-role-chains argument)))
      (when (search-tree-p :exists argument)
	(multiple-value-setq (argument liftedExistentialVariables)
	  (remove-buried-existentials argument)))
;; THIS HAS TO BE REDONE, WHEN WE FIGURE OUT WHAT IT MEANS NOW THAT ALMOST
;;    EVERYTHING GETS TRUTH MAINTAINED:
      (when (references-compound-relation-p argument)
	(setq argument (expand-compound-relations argument)))
      (setq argument (introduce-holds-true-relations argument))         ; RMM 7/21/94
      ;; BUG: CAN'T WORK HERE:
      ;; TRY RETURNING TWO VALUES, THE INVARIANTS AND THE RESIDUE:
      (when (contains-invariant-predicate-p argument)
	(setq argument
	      (extract-time-invariant-predicates argument))
	(when (null argument)
	  (return-from normalize-agent-time-transition-clause
	    (simplify-wff (wrap-with-existentials&invariants nil)
			  nil))))
      (setq normalizedClause
	    (wrap-with-existentials&invariants
	      (if (member (first argument) '(:or :exists))
		  (normalize-detects-or-undetects-clause operator argument)
		  `(,operator ,argument))))
      (prog1
	(simplify-wff normalizedClause nil)
	(setq *expandAgentTimeTransitionsP* t)) )))

(defun expand-role-chains (query)
  ;; Situation:  A role chain exists somewhere within "query"
  ;; Return a query such that all role chains in "query" have
  ;;    been replaced by equivalent forms using additional existential
  ;;    variables;
  ;; Called by "normalize-AgentTime-transition-clause" and ???
  ;; This expansion happens inside of agent time transition clauses
  ;;    embedded in production rule queries, and when queries need to
  ;;    be classified;
  (cond
    ((atom query)
     query)
    ((keywordp (first query))
     `(,(first query)
       ,@(loop for arg in (rest query)
	      collect
	      (if (contains-role-chain-p arg)
		  (expand-role-chains arg)
		  arg))))
    ;; "query" is a relational clause
    ((contains-role-chain-p query)
     (help-expand-role-chains-in-relational-clause query))
    (t
     query)) )

(defun help-expand-role-chains-in-relational-clause (clause)
  ;; Input: "clause" is a relational clause that contains one or more
  ;;     role chains as terms;
  ;; Return an existential clause containing a conjunction of
  ;;    predications all of which contain atomic, constant, or indexed
  ;;    arguments;
  (let ((toDoClauses (list clause))
	newVariables expandedClauses
	workingClause newArguments)
    (flet ((expand-role-chains-in-term
	     (term)
	     ;; If "term" is a function all of whose domains are
	     ;;    single-valued, generate new variable, and
	     ;;    push it and expansion of term onto "newVariables" and
	     ;;    "expandedClauses";
	     (if (or (atom term)
		     (member (car term) '(quote :one-of :index))
		     (typecase (first term)
		       (BINARY-RELATION
			(collection-concept-p
			  (implied-domain (first term))))
		       (N-ARY-RELATION
			(loop for dom in (implied-domains (first term))
			     thereis (collection-concept-p dom)))
		       (otherwise nil)))
		 term
		 (let ((variable (form-gensym-variable "?E")))
		   (push variable newVariables)
		   (push `(,@term ,variable) toDoClauses)	; <= mildly tricky
		   variable))))
      (loop
	(when (null toDoClauses) (return nil))	; test for loop exit
	(setq workingClause (pop toDoClauses))
	(setq newArguments
	      (loop for term in (cdr workingClause)
		   collect (expand-role-chains-in-term term)))
	(push `(,(car workingClause) ,@newArguments)
	      expandedClauses))
      (if newVariables
	  `(:exists ,newVariables
		      (:and ,@expandedClauses))
	  clause) )))

(defun contains-role-chain-p (query)
  ;; Return t if "query" contains a role chain;
  ;; Called by "expand-role-chains" and "normalize-AgentTime-transition-clause";
  (cond
    ((atom query)
     nil)
    ((keywordp (first query))
     (loop for arg in (rest query)
	  thereis (contains-role-chain-p arg)))
    (t ;; relational query
     (loop for arg in (rest query)
	  thereis (and (consp arg)
		       (not (keywordp (first arg))))))) )

(defun remove-buried-existentials (query)
  ;; Helping function for "normalize-agent-time-transition-clause" 
  ;; If "query" has existential quantifiers nested inside of an :and,
  ;;    remove them;
  ;; Return two values:
  ;;    (1) The query with existential quantifiers removed;
  ;;    (2) A list of removed existentially-quantified variables;
  ;; QUESTION: IS MORE POWERFUL LIFTING NEEDED HERE?
  (if (and (eq (first query) :and)
	   (loop for conjunct in (rest query)
		thereis (and (consp conjunct)
			     (eq (first conjunct) :exists))))
      (let* ((existentialVariables nil)
	     (newTerms
	       (loop for term in (rest query)
		     collect
		     (if (and (consp term)
			      (eq (first term) :exists))
			 (progn
			   (prependf existentialVariables (second term))
			   (third term))
			 term))))
	(values
	  (simplify-wff `(:and ,@newTerms) nil)
	  existentialVariables))
      (values query nil)) )

(defun expand-compound-relations (query)
  ;; Return a query equivalent to "query" in which backward chaining
  ;;    concepts and relations have been expanded into equivalent
  ;;    subqueries;
  ;; Punt if a recursive concept or relation is encountered;
  ;; TO DO: FIGURE OUT HOW TO HANDLE FEATURES;
  (cond
    ((atom query)
     query)
    ((keywordp (first query))
     `(,(first query)
       ,@(loop for arg in (rest query)
	      collect
	      (if (references-compound-relation-p arg)
		  (expand-compound-relations arg)
		  arg))))
    ;; "query" is a relational clause
    ((references-compound-relation-p query)
 (grumble "Bad news!  The query ~S references a relation whose definition is too
complicated to be handled by the current implementation of production rules.  You
will have to rephrase the production to avoid referencing that relation." query)
 (cerror """NOT YET IMPLEMENTED")
;; FIX THIS -- THE FUNCTION HAS NEVER BEEN DEFINED:
;     (expand-backward-chaining-predication (first query) (rest query))
     )
    (t
     query)) )

(defun introduce-holds-true-relations (query)
  ;; Called by "normalize-agent-time-transition-clause";
  ;; Return a query equivalent to "query" in which a "holds-true" relation
  ;;    is inserted into each predication headed by a predicate variable.
  ;; Works only at the top-levels.
  (labels ((contains-variable-predicate-p (term)
             ;; Called by "normalize-agent-time-transition-clause";
             ;; Return t if "term" contains a predication headed by a variable.
             (and (consp term)
                  (if (eq (first term) :and)
                    (loop for arg in (rest term) 
                          thereis (contains-variable-predicate-p arg))
                    (question-mark-variable-p (first term)))) ))
    (cond
     ((atom query)
      query)
     ((not (contains-variable-predicate-p query))
      query)
     ((question-mark-variable-p (first query))
      (case (length query)
        (2 `(,(get-relation 'HOLDS-TRUE-2) ,@query))
        (3 `(,(get-relation 'HOLDS-TRUE-3) ,@query))
        (4 `(,(get-relation 'HOLDS-TRUE-4) ,@query))
        ;; if we are in a production, we will break later on (but not
        ;;    if we are in an ordinary query):
        (otherwise query)))
     ((eq (first query) :and)
      `(:and ,@(loop for term in (rest query)
                     collect (introduce-holds-true-relations term))))
     (t
      query)) ))
    
;(defmethod expand-compound-predication ((self UNARY-CONCEPT) arguments)
;  ;; Situation: "self" is a backward chaining concept applied as a predicate
;  ;;    to "arguments"; This isn't suppose to happen, so generate a warning.
;  (warn "The backward chaining concept ~S occurs in the agent time
;            transition clause of a production" self)
;  `(,self ,@arguments) )

(defmethod expand-compound-predication ((self BINARY-RELATION) arguments)
  ;; Situation: "self" is a backward chaining role relation applied as
  ;;   a predicate to "arguments"; Return an equivalent expression
  ;;   containing only references to forward chaining concepts and
  ;;   relations; TO DO: DOESN'T HANDLE COMPUTED FEATURES OR
  ;;   IMPLICATIONS (BUT THEY SHOULD PROBABLY BE HANDLED ELSEWHERE);
  (flet ((form-composition-clause ()
	   (let* ((components (components self))
		  (newVariables
		    (loop for i from 1 to (1- (length components))
			 collect (form-gensym-variable "?V")))
		  (variables 
		    `(, (first arguments) 
		      ,@newVariables
		      ,(second arguments))))
	     `(:exists ,newVariables
			 (:and ,@(loop for comp in components
				      as tail on variables
				      collect
				      `(,comp ,(first tail) ,(second tail))))))))
    (let* ((expandedQuery
	     (if (defined-as self)
		 (case (defined-as self)
		   (:composition
		    (form-composition-clause))
		   (otherwise
		    "SHOULDN'T HAPPEN"))
		 `(:and
		    ,@(loop for br in (base-relations self)
			   collect `(,br ,@arguments))
		    ,@(when (more-restrictive-defined-domain self)
			`((,(more-restrictive-defined-domain self)
			   ,(first arguments))))
		    ,@(when (more-restrictive-defined-range self)
			`((,(more-restrictive-defined-range self)
			   ,(second arguments))))))))
      (if (references-compound-relation-p expandedQuery)
	  (expand-compound-relations expandedQuery)
	  expandedQuery) )))

(defmethod expand-compound-predication ((self N-ARY-RELATION) arguments)
  ;; Situation: "self" is a backward chaining n-ary relation applied as a predicate
  ;;    to "arguments";
  ;; Return an equivalent expression containing only references to effectively
  ;;    primitive relations;
  "NOT YET IMPLEMENTED"
  `(,self ,@arguments) )

(defun references-compound-relation-p (query)
  ;; Return t if "query" contains a reference to a compound relation that
  ;;    needs to be expanded;
  ;; Called by "normalize-agent-time-transition-clause";
  (when (consp query)
    (let ((head (first query)))
  (cond
    ((keywordp head)
     (case head
       ((:exists :forall)
	(references-compound-relation-p (third query)))
       (otherwise 
	(loop for arg in (rest query)
	     thereis (references-compound-relation-p arg)))))
    ((typep head 'TBOX-RELATION)
     (or (more-restrictive-defined-domain head)
	 (more-restrictive-defined-range head)
	 (loop for arg in (rest query)
	      thereis (references-compound-relation-p arg))))
    (t ;; "query" is headed by a concept reference:
     (loop for arg in (rest query)
	  thereis (references-compound-relation-p arg)))))) )

;;; agent time transformations that preserve agent time transition clauses:
;;;    detects(P or Q) ==> [detects(P) or detects(Q)] and 
;;;                        previously(not(P or Q))
;;;    undetects(P or Q) ==> [undetects(P) or undetects(Q)] and not(P or Q)
;;;    detects(forsome y P(y)) ==> [forsome y detects(P(y))] and
;;;                                previously(not(forsome y P(y)))
;;;    undetects(forsome y P(y)) ==>  [forsome y undetects(P(y))] and
;;;                                not(forsome y P(y))

(defun normalize-detects-or-undetects-clause (detectsOrUndetects argument)
  ;; Called by "normalize-agent-time-transition-clause";
  ;; "argument" is a disjunction or existential -- return a transformed version
  ;;    that eliminates the disjunction or existential, while preserving
  ;;    an agent time transition clause;
  ;; Note: Simpler tranformations that eliminate the :detects or :undetects entirely
  ;;    aren't used because we want to assist the production rule facility in
  ;;    detecting agent time transition clauses;
  `(:and
     ,(ecase (first argument)
	(:or
	 `(:or ,@(loop for disjunct in (rest argument)
		      collect `(,detectsOrUndetects ,disjunct))))
	(:exists
	 `(:exists ,(second argument)
		     (,detectsOrUndetects ,(third argument)))))
     ,(ecase detectsOrUndetects
	(:detects `(:previously (:fail ,argument)))
	(:undetects `(:fail ,argument)))) )

(defun normalize-changes-clause (operator argument monitorP)
  ;; Called by "simplify-agent-time-wff";
  ;; '("operator" "argument") is a :changes predication;
  ;; If not "monitorP" (i.e., within a production) or if "argument"
  ;;    is not a single-argument primitive relation, then replace the
  ;;    :changes clause with a ;;    disjunction of :detects and
  ;;    :undetects clauses (and normalize those);
  ;; Detect cases of invariant terms appearing within a :changes clause;
  (when (atom argument)
    (return-from normalize-changes-clause :false))
  (let ((role (first argument))
	(variable (form-gensym-variable "?V")))
    (unless (and monitorP
		 (consp argument)
		 (primitive-p role)
		 (atom (second argument)))
      ;; append implicitly existentially quantified variable to term
      ;;    expression;
      (return-from normalize-changes-clause
	(simplify-wff
	  `(:or (:detects ,`(,@argument ,variable))
		(:undetects ,`(,@argument ,variable)))
	  nil)))
    (cond
      ((perfect-p role)
       :false)
      ((monotonic-p role)
       (simplify-wff
	  `(:detects ,`(,@argument ,variable))
	  nil))
      (t
       `(,operator ,argument))) ))


	   
  ;;
;;;;;; Suspension of agent time triggering
  ;;

(defmacro transaction (tag &body body)
  "Open a new transaction, with tag `tag', and generate a new time point.
   While the transaction is open suspend all productions that fire within the scope
      of this transaction.
   At the close of this transaction fire all suspended production instantiations,
      and generate (another) new time point.      
   `tag' is used solely as an aid to tracing"
  ;; Note: This code uses a `bound-p' on *transactionTag* to determine
  ;;    whether or not this is a nested transaction;
  ;; Note: "generate-production-instantiations" uses a `bound-p' test on
  ;;    the special variable *transactionTag* to determine whether
  ;;    or not productions should be fired;
  ;; TO DO: FIGURE OUT HOW TO STORE CONCEPT TRIGGERS;
  `(let (savedPreviously)
     (when (inside-of-transaction-p)
       (setq savedPreviously *previously*))
     (open-transaction-internal ,tag)	; call matcher OUTSIDE of transaction
     (let ((*transactionTag* ,tag)
	   (*generating-histories-p* :transaction))
       (declare (special *transactionTag*))
       (prog1
	 (catch *transactionTag* 
	   ,@body)
	 (close-transaction-internal)))	; call matcher INSIDE of transaction
     (when savedPreviously
       (setq *previously* savedPreviously))
     (close-outermost-transaction)) )

(defmacro without-productions (&body body)
  "Execute the forms in `body' with production firing suspended.  After exiting
this form, suspended production rules will fire."
  `(transaction ',(gentemp "TRANS-")
     ,@body))


(defmacro exit-transaction (&optional tag result)
  "Exit out of the transaction with tag `tag';
      If `tag' represents the top-most transaction, fire production
      rules before completing the exit.
      If `tag' is nil, exit from the inner-most transaction."
  `(throw (or ,tag *transactionTag*) ,result) )

(defun open-transaction-internal (transactionTag)
  ;; Helping function for "transaction";
  ;; Generate a new time point (if necessary) to insure that the state prior to the
  ;;    beginning of the transaction is consistent;
  ;; Set *previously* to the time point at the beginning of the transaction;
  ;; QUESTION: SHOULD WE LOOP, CALLING "new-time-point" UNTIL *list-of-*agent-time*-histories*
  ;;    IS NULL???
  (when (first-update-p)	  ;; Do before entering transaction! ; TAR 2/2/98
    (advance-time-clock))
  (when (null *generating-histories-p*)
    (setq *history-limit* *previously*))
  (when *trace-all-p*
    (inform "~&Opening trans ~S" transactionTag)) )

(defun close-transaction-internal ()
  ;; Helping function for "transaction";
  ;; Generate a new time point (if necessary), and possibly emit trace information
  ;; QUESTION: SHOULD WE LOOP, CALLING "new-time-point" UNTIL *list-of-*agent-time*-histories*
  ;;    IS NULL???
  (declare (special *transactionTag*))
  (when *list-of-*agent-time*-histories* 
    (new-time-point))
  (when *trace-all-p*
    (inform "~&Closing trans ~S" *transactionTag*)) )


;;; Triggering productions at the end of a transaction:
;;;    Finally, call "trigger-productions".

(defun close-outermost-transaction ()
  ;; Helping function for "transaction";
  ;; Fire productions;
  ;; If histories are turned of, then clean up by discarding all history instances
  ;;    between *agent-time* and *previously*;
  ;; Update *previously* to mark time point at end of transaction (unless production
  ;;    firing caused time to advance);
  (when (inside-of-transaction-p)
    (return-from close-outermost-transaction nil))
  (let ((endOfTransactionTime *agent-time*))
    (trigger-productions :recheck-concept-cohorts-p t)
    (if (eq *generating-histories-p* t)	; TAR 2/2/98
	;; ??? DO WE NEED TO DO THIS:
	(if (eql endOfTransactionTime *agent-time*)
	    (setq *previously* (1- endOfTransactionTime))
	    (setq *previously* endOfTransactionTime))
      (progn
	(compute-now-1-histories-from-oldest-histories)
	(setq *previously* (1- *agent-time*)))) ))


  ;;
;;;;;; Production triggering functions
  ;;

(defun trigger-productions (&key recheck-concept-cohorts-p)
  ;; First apply each activated cohort to its stored binding sets,
  ;;    causing primary productions to be posted with new binding sets;
  ;; Then for each activated primary production, apply its action to each
  ;;    of its new binding sets;
  ;; Application of production actions to binding sets is deferred until
  ;;    all binding sets have been generated, to avoid the possibility of
  ;;    side-effects in the actions influencing binding set generation;
  ;; "recheck-concept-cohorts-p" is set by "close-outermost-transaction" to
  ;;    indicate that type transitions for concept cohorts may be invalid, and
  ;;    hence must be rechecked before the cohort query is applied;
  ;; Note: We copy the queues before scanning them to avoid recursing on
  ;;    entries in the queues;
  (let ((recheckConceptCohortsP recheck-concept-cohorts-p)
        activatedCohortQueue activatedProductionQueue)
    (when (inside-of-transaction-p)
      (return-from trigger-productions nil))
    (setq activatedCohortQueue *activated-cohort-queue*)
    (setq *activated-cohort-queue* nil)
    (loop for cohort in activatedCohortQueue
	 do (apply-cohort-to-binding-sets cohort recheckConceptCohortsP))
    (setq activatedProductionQueue *activated-production-queue*)
    (setq *activated-production-queue* nil)
    (when activatedProductionQueue
      (without-productions              ;  TAR 9/13/96 ; Needed for chaining!
        (loop for production in activatedProductionQueue
	      do (apply-production-to-binding-sets production))))) )

(defun apply-cohort-to-binding-sets (cohort recheckConceptCohortsP)
  ;; Apply the partial query for "cohort" to each of its stored input
  ;;    bindings
  ;; Store the outputBindings in the primary production for "cohort";
  ;; Post the primary production on *activated-production-queue*;
  ;; The encoding of members of "inputBindingSets" depends on the type
  ;;    of bindingSet generator:
  ;;       Concept -> list of instances;
  ;;       Role -> list of CONS pairs;
  ;;       Relation -> list of tuples (LISTs);
  ;; "recheckConceptCohortsP" is true if we are exiting an outermost
  ;;    transaction -- it indicates that some of the instances in "bindingSet"
  ;;    may have entered or exited a type more than once, and hence the validity
  ;;    of their membership or non-membership in "(cohort-predicate cohort)" must
  ;;    be rechecked;
  ;;    This test is only needed for concepts, because "generate-one-cohort"
  ;;    generates insurance clauses for non-concept cohorts;
  (let* ((cohortQuery (compiled-cohort-query cohort))
	 (primaryProduction (primary-production cohort))
	 (alreadyPostedP (output-binding-sets primaryProduction))
	 (?recheckingConcept
	   (when (and recheckConceptCohortsP
		      (typep (cohort-predicate cohort) 'UNARY-CONCEPT))
	     (cohort-predicate cohort)))
	 (transitionIndicator (transition-indicator cohort)))
    (flet ((insure-concept-transition-p (?instance)
	     (case transitionIndicator
	       (:detects 
                (detects-instance-of-p ?instance ?recheckingConcept))
	       (:undetects
                (undetects-instance-of-p ?instance ?recheckingConcept))))
           (binding-set-discarded-p (bindingSet)
             (cond
              ((atom bindingSet)        ; concept instance:
               (discarded-instance-with-histories-p bindingSet))
              ((atom (cdr bindingSet))          ; role pair:
               (or (discarded-instance-with-histories-p (car bindingSet))
                   (discarded-p (cdr bindingSet))))
              (t                        ; relation tuple:
               (loop for item in bindingSet
                     thereis (discarded-p item))))))
      (execute-query
	(loop for bindingSet in (stored-input-binding-sets cohort)
	     when (and (not (binding-set-discarded-p bindingSet))
                       (or (null ?recheckingConcept)
		           (insure-concept-transition-p bindingSet)))
	     do
	     (loop for outputBindingSet in (funcall cohortQuery bindingSet)
		  do (pushnew outputBindingSet
			      (output-binding-sets primaryProduction)
			      :test #'filler-equal))))
      (setf (stored-input-binding-sets cohort) nil)
      (unless alreadyPostedP
	(push primaryProduction *activated-production-queue*)) )))

(defun apply-production-to-binding-sets (production)
  ;; Apply the action for "production" to each of its new binding sets,
  ;;    i.e., instantiate a task for each binding set;
  ;; Afterwards, clear the list of new binding sets;
  (let ((verb (action-verb production))
	(priority (priority production))
        (currentBindingSets (output-binding-sets production)))
    (setf (output-binding-sets production) nil)
    (loop for b in currentBindingSets
	 do
	 (when *trace-all-p*
	   (inform "~&Fire: ~S ~S~%" (name production) b))
	 (case verb
	   (:do
	    (apply (compiled-do-action production) b))
	   (:perform
	    (apply-action (action production) b))
	   (:schedule
	    (schedule-task
	      (create-task b (action production) nil priority)))
	   (:achieve
	    "NOT YET IMPLEMENTED"))) ))


  ;;
;;;;;; Cohort activation
  ;;

;;; Each production cohort is attached to a specific concept or relation.
;;; Relation triggers:
;;;    Upon adding or removing a role filler or relation tuple, a scan is
;;;    made for cohorts located at or above the relevant relation.  A
;;;    binding set is stored in each cohort found.  The activation of cohorts
;;;    is delayed until the end of the current time quantum or transaction.
;;;    Upon activation, each binding set must be checked for currency, since 
;;;    the update could have been cancelled by a subsequent update.
;;; Concept triggers:
;;;    Detection occurs at the end of the current time quantum or transaction,
;;;    during the final computation of db-types of instances.  To detect newly
;;;    matched concepts, all concepts at or above the original type (at the
;;;    beginning of the current quantum or transaction) are marked, and a search
;;;    is made for all unmarked concepts at or above each final db-type (another 
;;;    search for newly unmatched concepts must also take place).  Cohorts are
;;;    activated immediately during this phase.

(defun distribute-binding-set-to-one-cohort (bindingSet cohort)
  ;; Situation: "bindingSet" was asserted or retracted to/from a concept
  ;;    or relation or rete node to which "cohort" is attached;
  ;; Store the binding set in "cohort", and insure it is posted;
  ;; Same as above, but for one cohort;
  (unless (stored-input-binding-sets cohort)
    (push cohort *activated-cohort-queue*))
  (push bindingSet (stored-input-binding-sets cohort)) )

(defun distribute-binding-set-to-cohorts (bindingSet cohorts)
  ;; Called by "scan-role-cohorts" and "act-on-rete-monitored-instance";
  ;; Situation: "bindingSet" was asserted or retracted to/from a concept
  ;;    or relation or rete node to which "cohorts" are attached;
  ;; Store the binding set in each of the cohorts, and insure that each
  ;;    cohort is posted;
  (declare (inline distribute-binding-set-to-one-cohort))
  (loop for c in cohorts
        do (distribute-binding-set-to-one-cohort bindingSet C)) )

;; THIS SHOULD BE OBSOLETE NOW THAT DISCARD POLICY HAS CHANGED:
;(defun erase-instance-from-activated-cohorts (instance)
;  ;; Situation: "instance" has been deleted, and might still reside in
;  ;;    a stored binding set;
;  ;; Remove it from any binding sets its in;
;  (flet ((instance-occurs-in-binding-set
;	   (bindingSet)
;	   (if (consp bindingSet)
;	       (or (eq instance (first bindingSet))
;		   (if (atom (rest bindingSet))
;		       (eq instance (rest bindingSet))
;		       (member instance (rest bindingSet))))
;	       (eq instance bindingSet))))
;    (loop for cohort in *activated-cohort-queue*
;	  do
;	  (setf (stored-input-binding-sets cohort)
;	        (delete-if
;		 #'instance-occurs-in-binding-set
;		 (stored-input-binding-sets cohort)))) ))


;; BUGS:
#|

COMPUTED FUNCTIONS LIKE < SHOULD BREAK INSIDE OF A :detects.
COMPUTED FUNCTIONS LIKE + WILL BREAK WHEN WE FINISH N-ARY RELATIONS.

THE FIX IS TOO AVOID USING :perfect RELATIONS AS GENERATORS INSIDE
OF A TRANSITION CLAUSE.

|#
