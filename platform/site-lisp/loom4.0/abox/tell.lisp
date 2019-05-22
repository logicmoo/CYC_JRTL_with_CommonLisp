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
							      
;;; TELL.LISP (ABOX)


(in-package "LOOM")

(export '( tell forget tellm forgetm forget-all-about forget-all-about-m
           destroy destroym
	  skolem ok))


  ;;
;;;;;; Top-level calls to make database assertions and retractions
  ;;

(defmacro tell (&rest propositions)
  "Assert each proposition in `propositions' to the current context."
  `(prog1
     ,(form-sequence-of-propositions propositions :assertion)
     (when *automatically-advance-state-p*
       (new-time-point))) )

(defmacro forget (&rest propositions)
  "Retract each proposition in `propositions' from the current context."
  `(prog1
     ,(form-sequence-of-propositions propositions :retraction)
     (when *automatically-advance-state-p*
       (new-time-point))) ) 

(defmacro tellm (&rest propositions)
  "Assert each proposition in `propositions' to the current context and
then run the recognizer (advancing agent time in the process)."
  `(progn
     (tell ,@propositions)
     (new-time-point)) )

(defmacro forgetm (&rest propositions)
  "Retract each proposition in `propositions' from the current context and
then run the recognizer (advancing agent time in the process)."
  `(progn
     (forget ,@propositions)
     (new-time-point)) )

(defmacro destroym (instanceOrSymbol &key dont-unintern-p)
  "Retract all facts about the instance `instanceOrSymbol', and run the
recognizer (advancing agent time in the process).  Destroy the instance
unless `dont-unintern-p' is set."
  `(progn
     (forget-all-about ,instanceOrSymbol :dont-unintern-p ,dont-unintern-p)
     (new-time-point)) )

(defun destroy (instanceOrSymbol &key dont-unintern-p)
  "Retract all facts about the instance `instanceOrSymbol', and then destroy
the instance (unless `dont-unintern-p' is set)."
  (forget-all-about instanceOrSymbol :dont-unintern-p dont-unintern-p) )
                    
(defmacro forget-all-about-m (instanceOrSymbol &key dont-unintern-p)
  "Retract all facts about the instance `instanceOrSymbol', and run the
recognizer (advancing agent time in the process)."
  `(progn
     (forget-all-about ,instanceOrSymbol :dont-unintern-p ,dont-unintern-p)
     (new-time-point)) )

(defmethod forget-all-about ((self SYMBOL) &key dont-unintern-p 
                             destroy-tbox-constant-p)
  ;; Retract all facts about the instance `instanceOrSymbol';
  (let ((instance (eval-instance-id self)))
    (when (and instance
	       (not (discarded-p instance)))
      (forget-all-about instance
                        :dont-unintern-p dont-unintern-p
                        :destroy-tbox-constant-p destroy-tbox-constant-p)) ))

(defmethod forget-all-about ((self DB-INSTANCE)
                             &key dont-unintern-p destroy-tbox-constant-p)
  "Retract all facts about the instance `self'."
  ;; Retract all binary propositions that relate other instances
  ;;    to "instanceOrSymbol";
  ;; Remove "instanceOrSymbol" from the extensions of all concepts in its type;
  ;; If "dont-unintern-p", void the type and slot fillers of "instanceOrSymbol",
  ;;    otherwise unintern "instanceOrSymbol";
  (let (tboxDependOnsP)
    ;; THIS SHOULD BREAK IF SKOLEM CAME IN AND WAS COERCED TO A CONSTANT!:
    (when (null (db-type self))     ; "instance" is not-yet-asserted concept
      (return-from forget-all-about nil))
    (if (eq (previous-instance self) :disabled)
      (let ((*disable-history-generation-p* t))
        (declare (special *disable-history-generation-p*))
        ;; don't create a new history instance AND 
        ;;    tell "find-or-create-non-current-now-instance"
        ;;    not to create new history instances:
        (forget-all-inverse-roles self))
      (forget-all-inverse-roles self))
    (setf (db-type self) *thing*)		; tar 9/18/92
    ;; deactivate all bombs in the bomb removal index:
    (loop for entry in (bomb-removal-index self)
	 do (deactivate-bomb (cdr entry)))
    (setq tboxDependOnsP
	  (and (not destroy-tbox-constant-p)
	       ;; NEED TO UPGRADE:
;	       (member :tbox-constant (db-attributes self))
	       nil			; SHORT CIRCUIT.  REMOVE WHEN UPGRADED.
	       (loop for entry in (conjuncts-table self)
		    thereis
		    (not (member :garbage-concept
                                 (system-attributes (car entry)))))))
    (when (modification-summary self)
      (unpost-instance self))
    (if (or dont-unintern-p tboxDependOnsP (neq *current-ctxt* (home-ctxt self)))
      (progn ;; "self" does not get destroyed -- make it virgin:
       (setf (db-type self) *thing*)
       (setf (strict-db-type self) *thing*)
       (if tboxDependOnsP
	   (progn
;; CONSIDER ADDING THE FOLLOWING:
;	     (setf (conjuncts-table self)
;		   (loop for entry in (conjuncts-table self)
;			unless (member :garbage-concept (system-attributes (car entry)))
;			collect entry))
	     (post-non-analyzable-modified-instance self :retraction nil)
	     (setf (never-before-matched-p (modification-summary self)) t))
	   (setf (conjuncts-table self) nil))  ; CTXXX
       ;; QUESTION: DO ANY DEPEND-ON RELATIONS POINT AT THIS INSTANCE?
       (setf (asserted-features self) nil)
       (loop for (name . nil) in (list-role-names&values self)
	   as role = (get-relation name)
	   when role
	   do (fclear-value self role))
       ; (setf (dynamic-variables self) nil)
       )
      (progn ;; unintern and discard "self":
       (unless (test-bit-flags (db-attributes self) :db-instance :abandoned-by-merge)
	 ;; make "womp-merge-pointers" break if deleted instance gets passed in:
	 (setf (merged-into-instance self) :deleted))
       (destroy-object self)
       (discard-instance self)))
    t ))

(defmethod destroy-object ((self BASIC-INSTANCE))
  ;; Catch "call-next-method" sent from DB-INSTANCE.forget-all-about;
  ;; Perform action equivalent to that in INSTANCE-IN-CONTEXT.destroy-object;
  ;; TO DO: INTERN NON-EXISTENT INSTANCE IN PLACE OF "instance";
  (unless (boundp '*dontUninternP*)
    (unintern-object self :instances nil)) )  

(defun forget-instance&history (self &key destroy-tbox-constant-p)
  ;; Called by "detach-database-instances" and "destroy-one-knowledge-base";
  ;; Situation: Destroy "self" and its histories without spawning any new
  ;;    history structures;
  (when (discarded-p self)
    (return-from forget-instance&history self))
  (delete-history (previous-instance self))
  (let ((*disable-history-generation-p* t))
    (declare (special *disable-history-generation-p*))
    (forget-all-about 
     self :destroy-tbox-constant-p destroy-tbox-constant-p)) )

(defmethod unintern-instance ((self DB-INSTANCE))
  ;; Helping method for "forget-all-about";
  ;; Unintern "instance", with special care if instance represents the
  ;;    merge of several instances;
  (let ((multipleIds (multiple-identifiers self)))
	(if multipleIds
	    (loop for id in multipleIds
		 do (unintern-object id :instances nil))
	    (unintern-object self :instances nil))) )

(defmethod unintern-instance ((self INSTANCE-WITH-HISTORIES))
  ;; Helping method for "forget-all-about";
  ;; Unintern the instance "self";
  (unintern-object self :instances nil) )

(defmethod delete-history (self)
  ;; Helping function for "forget-all-about";
  ;; Discard previous instances of "self" and then discard "self";
  (when self
    (when (discarded-p self)
      (complain "~%~%BUG: TRIED TO DELETE ALREADY-DISCARDED HISTORY INSTANCE ~S"
	      self)
      (return-from delete-history nil))
    ;; REMOVE THIS CONDITIONAL WHEN WE ARE SATISFIED THAT THE INFINITE LOOP
    ;;    WON'T COME BACK:
    (if (eq self (previous-instance self))
      (complain "~%BUG: FOUND AN INSTANCE WITH ITSELF AS A PREVIOUS INSTANCE ~A" self)
      (delete-history (previous-instance self)))
    (discard-instance self)) )

(defmethod delete-history ((self NON-EXISTENT-INSTANCE))
  ;; We don't discard non-existent instances here;
  nil )


  ;;
;;;;;; Supporting routines for "tell" and "forget"
  ;;

(defun form-sequence-of-propositions (propositions assertion/retraction)
  ;; Return a form which, when evaluated, asserts each of the
  ;;    propositions in "propositions";
  ;; First, condition each proposition in "propositions";
  ;; Then expand each conditioned-proposition into an assertion form;
  ;; TO DO: CONSIDER ADDING MORE MACRO-EXPAND-TIME TYPE CHECKING ON CONSTANTS
  (let ((*queryPicture*
         (case assertion/retraction
           (:assertion `(tell ,@propositions))
           (:retraction `(forget ,@propositions))))
	*letVariables* *subject*)
    (declare (special *queryPicture* *letVariables* *subject*))
    ;; expand complex propositions and substitute concept/reation objects
    ;;    for concept/relation references;
    ;; TRY TO REWRITE SO THAT ALL ERRORS ARE CAUGHT DURING NORMALIZATION --
    ;;    THEN THIS CATCH CAN WRAP ONLY AROUND "normalize-propositions":
    (catch 'form-query-catcher
      (setq propositions (normalize-propositions propositions))
      ;; insure that role-computations are current, and that 
      ;;    concept-implementations have been completed
      (multiple-value-bind (bindings conditionedPropositions)
	                   (condition-propositions propositions)
        (let* ((bodyCode (case assertion/retraction
                           (:assertion
                            (form-assertion-code conditionedPropositions))
                           (:retraction
                            (loop for clause in conditionedPropositions
		                  collect (form-one-retraction clause)))))
               (boundVariables (loop for binding in bindings
                                            when (atom binding) collect binding
                                            else collect (car binding)))
               (ignoreVariables #+:MCL boundVariables
                                #-:MCL (loop for var in boundVariables
					   unless (search-tree-p var bodyCode)
					   collect var)))
	  `(let* ,bindings
             ,@(when ignoreVariables
                 `((declare (#+:MCL ignorable #-:MCL ignore
                             ,@ignoreVariables))))
 	     ,@bodyCode ) ))) ))

(defun form-assertion-code (propositions)
  ;; Return a list of code that executes the propositions in "propositions";
  ;; Special care is needed to process :create clauses, since the scope of
  ;;    a :create variable extends only from the clause forward.  This means
  ;;    that code for the :create must include code generated for all succeeding
  ;;    propositions;
  (if propositions
      (let ((prop (first propositions)))
	(if (eq (first prop) :create)
	    (form-list-of-create-assertion prop (rest propositions))
	  `(,(form-one-assertion prop)
	    ,@(form-assertion-code (rest propositions)))))
      (form-sequence-coda)	;Moved here from form-sequence-of-propositions TAR 3/26/93
      ))

(defun form-sequence-coda ()
  ;; Return a list of s-expressions to be executed after all
  ;;    propositions in an assertion or retraction sequence;
  ;; If "invokeMatcher", include a conditional call to the pattern
  ;;    matcher;
  ;; If a subject has been specified in an :about clause, return the
  ;;    variable containing the evaluated value of the subject;
  ;;    otherwise, return OK;
  ;; TO DO: PUT IN LOGIC TO DETECT FAILURE OF ASSERTIONS;
  (declare (special *letVariables* *subject*))
  `(,(if (and *subject* 
	      (symbolp *subject*))
	 (or (third (assoc *subject* *letVariables*))
	     *subject*)
	 ''OK)) )

  ;;
;;;;;; "normalize-propositions"
  ;;

(defun normalize-propositions (propositions)
  ;; Return a validated list of propositions for which all instance,
  ;;    concept, and relation references have been replaced by objects;
  ;; Also, possibly bind the variable *subject*;
  ;; Note: The special variable *predicateReferences* is filled inside of
  ;;    "forcing-get-predicate" (during validation);
  ;; TO DO: INSTANCE REFS DON'T ALWAYS GET TURNED INTO OBJECTS;
  (let ((*validatingAssertionP* t)              ; DGB 12/9/93
	*predicateReferences* validatedProps)
    (declare (special *validatingAssertionP* *predicateReferences*))
    (loop for prop in propositions
	 append
	 (progn
	   (search-for-subject prop)
	   (setq validatedProps (simplify-wff	; tar 8/10/92
				  (validate-query
				    (expand-temporal-clauses prop nil)) nil))
	   (cond
	     ((null validatedProps)
	      nil)
	     ((and (consp validatedProps)
		   (eq (first validatedProps) :and))
	      (rest validatedProps))
	     (t
	      (list validatedProps))))) ))

(defun expand-temporal-clauses (proposition queryP)
  ;; Return a proposition list in which all :AT-xxx-TIMEx forms have been
  ;;    expanded so as to contain only one proposition;
  (if (search-tree-list-p '(:at-world-time	; tar 5/25/93
			    :holds-after :holds-before :holds-at
			    :begins-at :ends-at
			    :at-world-time+ :at-world-time-
			    :at-agent-time)
			  proposition)
      (multiple-value-bind (expansion spliceInP)
	  (help-expand-temporal-clauses proposition queryP)
	(if spliceInP
	    (if (> (length expansion) 1)
		(push :and expansion)
		(car expansion))
	    expansion) )
      proposition) )

(defun help-expand-temporal-clauses (proposition queryP)
  ;; Helping function for "expand-temporal-clauses."   Recursively expands all
  ;;    :AT-xxx-TIMEx forms are expanded (each contains only one clause).
  ;; Returns two values:
  ;;   (1)  The expansion
  ;;   (2)  A flag, which is t if the results need to be spliced in.
  (flet ((expand-propositions (propositionList)
	  (let (expandedSubProp spliceInP)
	    (loop for subProp in propositionList
		  do (multiple-value-setq (expandedSubProp spliceInP)
		       (help-expand-temporal-clauses subProp queryP))
		  when spliceInP append expandedSubProp
		  else collect expandedSubProp) ))
	 (translate-temporal-operator (operator)	; tar 5/25/93
	   (cdr (assoc operator
		       '((:begins-at . :becomes)
			 (:ends-at . :ceases)
			 (:holds-after . :persists-forward)
			 (:holds-before . :persists-backward)))) )
	 (translate-temporal-binding (operator)	; tar 5/25/93
	   (cdr (assoc operator
		       '((:holds-at . :at-world-time)
			 (:holds-after . :at-world-time+)
			 (:holds-before . :at-world-time-)))) ))
    (cond ((atom proposition) (values proposition nil))
	  ((member (car proposition)		; tar 5/25/93
		   '(:holds-at :begins-at :ends-at :holds-after :holds-before))
	   (let ((operator (car proposition))
		 (timeForm (second proposition)))
	     (if queryP
		 (values
		   (loop for expandedProp in (expand-propositions
					       (cddr proposition))
			 when (member operator '(:begins-at :ends-at))
			 collect `(:at-world-time ,timeForm
				   (,(translate-temporal-operator operator)
				    ,expandedProp))
			 else collect `(,(translate-temporal-binding operator)
					 ,timeForm
					 ,expandedProp))
		   t)
		 (values
		   (loop for expandedProp in (expand-propositions
					       (cddr proposition))
			 when (eql operator :holds-at)
			 collect `(:at-world-time ,timeForm
				   (:persists-forward ,expandedProp))
			 and collect `(:at-world-time ,timeForm
				       (:persists-backward ,expandedProp))
			 else collect `(:at-world-time ,timeForm
					(,(translate-temporal-operator operator)
					 ,expandedProp)))
		   t)) ))
	  ((member (car proposition)
		   '(:at-world-time :at-world-time+ :at-world-time-
				    :at-agent-time))
	   (let ((operator (car proposition))
		 (timeForm (second proposition)))
	     (values
	       (loop for expandedProp in (expand-propositions (cddr proposition))
		     collect `(,operator ,timeForm ,expandedProp))
	       t) ))
	  (t (values (expand-propositions proposition)
		     nil))) ))

(defun search-for-subject (proposition)
  ;; Look inside of "proposition" for a recent binding to the *subject* of the
  ;;    current propositions;
  (declare (special *subject*))
  (cond 
    ((symbolp proposition)
     ;; REWRITE TO DO A RETRIEVE OF THE INSTANCE IDENTIFIED
     ;;    BY THE SYMBOL:
     (if (or (question-mark-variable-p proposition)
             (dollar-variable-p proposition))
	 (setq *subject* proposition)
	 (grumble "Deleting illegal proposition in tell or forget: ~S."
	       proposition))
     nil)
    ((member (first proposition) '(:create create))       ;  TAR 4/20/94
     ;; Need to do this before :about or else we get in trouble with
     ;;   multiple creation of instances, since about processing forces
     ;;   a find-or-create-instance.
     (when (and (second proposition)
		(not (question-mark-variable-p (second proposition))))
       (form-query-let-variable (second proposition) :create-instance)))
    ((member (first proposition) '(:about about))
     (setq *subject*
	   (form-conditioned-instance (second proposition)
		   :create-p (and (consp (third proposition)) ; tar 6/10/93
				  (member (car (third proposition))
					  '(:create create))))))) )


  ;;
;;;;;; formation of proposition code
  ;;

(defun condition-propositions (propositions)
  ;; Condition each proposition in "propositions", and return two values:
  ;;    (1) a list of binding forms which assign ABox instances to
  ;;        system-generated variable names,
  ;;    (2) a list of clauses which can be expanded into result forms that
  ;;        actually execute the propositions;
  ;; Conditioning performs the following functions:
  ;;    (1) Symbols representing concepts, relations, and instances are 
  ;;        replaced by system-generated variables which evaluate to the 
  ;;        corresponding objects at run-time;
  ;;    (2) These system-generated "let" variables and their associated 
  ;;        lookup functions are placed on a list of binding forms;
  ;;    (3) Formulas are translated;
  (declare (special *letVariables*))
  (let (clauses *predicateReferences*) 
    ;; not used by "condition-propositions"
    (declare (special *predicateReferences*))	; makes "forcing-get-predicate" happy:
    (setq clauses (loop for prop in propositions
			collect (condition-one-proposition prop nil)))
    (values
      (loop for entry in (reverse *letVariables*)
	    collect (form-tell-let-binding-clause entry))
      clauses) ))

(defun insert-subject-into-proposition (proposition subject)
  ;; Return a proposition in which "subject" has been inserted
  ;;    into "proposition" in the appropriate place;
  (setq proposition (list-of proposition))
  `(,(car proposition) ,subject ,@(cdr proposition)) )

(defun condition-one-proposition (proposition temporalCheckP)
  ;; Helping function for "condition-propositions";
  (cond
    ((keywordp (car proposition))
     (setq proposition (normalize-keyword-proposition proposition))
     (case (car proposition)
       (:filled-by (condition-filled-by-proposition proposition))
       (:filled-by-list (condition-filled-by-list-proposition proposition))
       (:filled-by-expression (condition-filled-by-expression-proposition proposition))
       ((:at-least :at-most :exactly)
	(condition-existential-proposition proposition))
       ((:all :some) (condition-quantified-proposition proposition))
       (:same-as (condition-equivalence-proposition proposition))
       (:equivalent-roles (condition-equivalent-roles-proposition proposition))   ; DGB 12/9/93
     ;  (:at-agent-time (condition-agent-time-proposition proposition)) ; No agent time in TELL
       ((:at-world-time :at-world-time+ :at-world-time-) 
	(condition-world-time-proposition proposition))
       (:create
        (condition-create-proposition proposition))
       (:not
        (condition-negated-proposition proposition))
       (otherwise 
	(form-query-error "The keyword ~S is undefined" (car proposition)))))
    ((indexed-expression-p (second proposition))
     (condition-sequence-proposition proposition))
    (t
     (case (length proposition)
       (2 (condition-unary-proposition proposition temporalCheckP))
       (3 (condition-binary-proposition proposition temporalCheckP))
       (otherwise (condition-n-ary-proposition proposition temporalCheckP))))) )

;;; Question: Should this cause an error or just return the initial
;;; keyword if "validate-keyword" does not find the keyword?
(defun normalize-keyword-proposition (proposition)	
  ;; Return a normalized version of "proposition" in which the initial keyword
  ;;    may have been replaced by a canonical keyword;
  `(,(validate-keyword (first proposition) :query-p t)
    ,@(rest proposition)) )

(defun condition-unary-proposition (proposition temporalCheckP)
  ;; Condition "proposition" of the form (<concept> <instance>);
  (let ((concept (first proposition))
	(instance (second proposition)))
    (when (and temporalCheckP (not (temporal-p concept)))
      (form-query-error "Non temporal Concept ~S appears in a temporal transition"
			(name concept)))
    `(,(form-conditioned-predicate concept) 
      ,(form-conditioned-instance instance)) ))

(defun condition-binary-proposition (proposition temporalCheckP)
  ;; Condition "proposition" of the form (<relation> <instance> <value>);
  (let* ((relation (first proposition))
	 (instance (second proposition))
	 (value (third proposition)))
    (when (and temporalCheckP (not (temporal-p relation)))
      (form-query-error "Non temporal Relation ~S appears in a temporal transition"
			(name relation)))
    `(,(form-conditioned-predicate relation)
      ,(form-conditioned-instance instance)
      ,(form-conditioned-value
	 value 
	 (when (and relation (not (symbolp relation)))
	   (implied-range relation))
	 relation)) ))

(defun condition-n-ary-proposition (proposition temporalCheckP)
  ;; Condition "proposition" of the form (<relation> <value1> ... <valuek>);
  (let ((relation (first proposition))) 
    (when (and temporalCheckP (not (temporal-p relation)))
      (form-query-error "Non temporal Relation ~S appears in a temporal transition"
			(name relation)))
    `(,(form-conditioned-predicate relation)
      ;; IS PASSING "relation" IN HERE IS CORRECT???:
      ,@(loop for term in (cdr (butlast proposition))
	     as i from 0
	     collect 
	     (form-conditioned-value
	       term
	       (when (not (symbolp relation))
		 (nth i (implied-domains relation)))
	       relation))
      ,(form-conditioned-value
	 (car (last proposition))
	 (when (and relation (not (symbolp relation)))
	   (implied-range relation))
	 relation)) ))

(defun condition-sequence-proposition (proposition)
  ;; Condition "proposition" of the form (<relation> [<index>] <instance> <value>);
  ;; If <relation> is a constant, check that it is a sequence relation;
  ;; TO DO: If <relation> is an external variable, a run-time check is needed
  ;;    to determine if it is a sequence relation;
  (let ((relation (first proposition))
        (index (extract-subscript-index (second proposition)))
        (instance (third proposition))
        (value (fourth proposition)))
    ;; SEQUENCES HAVE BEEN DISABLED -- RMM 5/7/93:
    ;    (when (and (relation-p relation)
    ;	     (not (member :sequence (attributes relation))))
    ;	(form-query-error "~S is not a sequence relation" relation))
    `((:index ,(form-conditioned-predicate relation) ,index)
      ,(form-conditioned-instance instance)
      ,(form-conditioned-value
        value
        (when (and relation (not (symbolp relation)))
          (implied-domain relation)) 
        relation)) ))

;; KEEP FOR IDEAS:
;(defun condition-filled-by-proposition (proposition)
;  ;; Condition "proposition" of the form (:filled-by <instance> <relation> {<value>}+);
;  (let ((instance (second proposition))
;	(relation (third proposition))
;	(fillers (cdddr proposition)))
;    (loop for f in fillers
;	 collect
;	 (condition-binary-proposition `(,relation ,instance ,f))) ))

(defun condition-filled-by-proposition (proposition)
  ;; Condition "proposition" of the form (:filled-by <instance> <relation> {<value>}+);
  (let ((relation (third proposition))
        (instance (second proposition)))
    `(,(car proposition)
      ,(form-conditioned-predicate relation)
      ,(form-conditioned-instance instance)
      ,(if (eq (fourth proposition) '*)
	   :star
	   (loop for value in (cdddr proposition)
		collect
		(form-conditioned-value
		  value 
		  (when relation (implied-domain relation)) 
		  relation)))) ))

(defun condition-filled-by-list-proposition (proposition)
  ;; Condition "proposition" of the form 
  ;;    (:filled-by-list <instance> <relation> <variable>), where <variable>
  ;;    is an external variable whose value is a list of slot fillers;
  (let ((relation (third proposition))
        (instance (second proposition)))
    `(,(car proposition)
      ,(form-conditioned-predicate relation)
      ,(form-conditioned-instance instance)
      ,(fourth proposition)) ))

(defun condition-filled-by-expression-proposition (proposition)
  ;; Condition "proposition" of the form 
  ;;    (:filled-by-expression <instance> <relation> <expression>), where <expression>
  ;;    is an arbitrary Lisp expression;
  (let ((relation (third proposition))
	 (instance (second proposition)))
    `(,(form-conditioned-predicate relation)
      ,(form-conditioned-instance instance)
      ,(fourth proposition)) ))

(defun condition-existential-proposition (proposition)
  ;; Condition "proposition" of the form 
  ;;    (<keyword> <instance> <number> <relation> [<concept>]),
  ;;    where <keyword> is :at-least, :at-most, or :exactly;
  (let ((relation (fourth proposition))
	(instance (second proposition))
	(concept (fifth proposition)))
    `(,(car proposition) 
      ,(form-conditioned-instance instance)
      ,(third proposition) 
      ,(form-conditioned-predicate relation)
      ,(when concept
	 (form-conditioned-predicate concept))) ))

(defun condition-quantified-proposition (proposition)
  ;; Condition "proposition" of the form 
  ;;    ([:all||:some] <instance> <relation> <concept>);
  (let ((instance (second proposition))
        (relation (third proposition))
        (concept (fourth proposition)))
    `(,(car proposition) 
      ,(form-conditioned-instance instance)
      ,(form-conditioned-predicate relation)
      ,(form-conditioned-predicate concept)) ))

(defun condition-create-proposition (proposition)
  ;; Condition "proposition" of the form (:create <variable> <concept> <closP>)
  ;; Return a clause of the form (:create <variable> <concept> <closP> <identifier>)
  ;;    where <identifier> is an optional identifier of the instance to be created;
  ;; Tricky: If "<variable>" is an identifier, the gensym of that variable must be
  ;;    placed into the top-most let variables, so that subsequent propositions will
  ;;    substitute the variable for the identifier;
  ;;    Otherwise, "<variable>" will be declared in an inner "let" clause, and treated
  ;;    by subsequent clauses as if it were an external variable;
  (let ((variable (second proposition))
        (concept (third proposition))
        (identifier nil))
    (when (or (dollar-variable-p variable)  ; TAR 12/2/98
	      (identifier-reference-p variable))
      (setq identifier variable)
      (setq variable (form-conditioned-instance variable :create-p t)))      
    `(:create
      ,variable
      ,(and concept (form-conditioned-predicate concept)) ;TAR 4/30/97 Allow NIL
      ,(fourth proposition)             ; :clos or nil
      ;; append a fourth value if an identifier for the created instance
      ;;    is provided:
      ,@(when identifier
          (list identifier))) ))

(defun condition-negated-proposition (proposition)
  ;; Condition "proposition" of the form (:not (concept instance)) or
  ;;    (:not (relation instance filler));
  ;; Return a form (:not-in instance concept) or
  ;;    (:not-filled-by instance relation filler);
  (let* ((predication (second proposition))
         (relation (form-conditioned-predicate (first predication)))
         (instance (form-conditioned-instance (second predication)))
         (filler (and (third predication)
                      (form-conditioned-instance (third predication)))))
    (case (length (rest predication))
      (1 `(:not-in ,instance ,relation))
      (2 `(:not-filled-by ,instance ,relation ,filler))
      (otherwise
       (grumble
        "Wrong number of arguments to a negated predicate in an assertion or retraction.
Only unary and binary predicates and be negated.  Illegal expression:  ~S."
        proposition))) ))

(defun condition-equivalence-proposition (proposition)
  ;; Condition "proposition" of the form (:same-as <instance> <instance>);
  `(:same-as 
     ,(form-conditioned-instance (second proposition))
     ,(form-conditioned-instance (third proposition))) )

(defun condition-equivalent-roles-proposition (proposition)    ; DGB 12/9/93
  ;; Condition "proposition" of the form (:equivalent-roles <instance> <role1> <role2>);
  `(:equivalent-roles
    ,(form-conditioned-instance (second proposition))
    ,(form-conditioned-predicate (third proposition))
    ,(form-conditioned-predicate (fourth proposition))) )

(defun condition-agent-time-proposition (proposition)
  ;; Condition "proposition" of the form (:at-agent-time <agent-time>
  ;;                                        <proposition>...);
  ;;   where <agent-time> is an agent time for binding in subqueries.
  ;; TO DO:  IMPLEMENT TRANSFORMATION AND *AGENT-TIME* BINDING.  CURRENTLY A STUB.
  `(:at-agent-time ,(second proposition)
     ,@(loop for subProposition in (cddr proposition)
	     collect (condition-one-proposition subProposition nil))) )

(defun condition-world-time-proposition (proposition)
  ;; Condition "proposition" of the form (:at-world-time <world-time>
  ;;                                        <time-proposition>);
  ;;   where <world-time> is an world time for binding in the time proposition.
  (condition-one-world-time-proposition
    (form-query-let-variable (second proposition) :world-time)
    (third proposition)) )

(defun condition-one-world-time-proposition (timeForm proposition)
  ;; Condition "proposition" of the form (<transition> <proposition>)
  ;;   where <transition> is one of :BECOMES, :CEASES, :PERSISTS-FORWARD
  ;;         or  :persists-backward
  ;;   "timeForm" is an internal representation for the world time.
  (if (world-time-transition-p (car proposition))
      `(,(car proposition) ,timeForm
	,(condition-one-proposition (second proposition) t))
      (form-query-error "~A needs a :becomes, :ceases, :persists-forward or :persists-backward: inside :at-world-time"
			proposition)))

(defun form-conditioned-predicate (predicate)
  ;; If "predicate" references a concept or relation, return a system-generated
  ;;    variable which will evaluate to that object at run-time;
  ;; If "predicate" is an external variable of the form ?<var>, return it directly;
  (if (question-mark-variable-p predicate)
      predicate
      (form-concept-referent predicate t)) )

(defun form-conditioned-instance (instance &key create-p)
  ;; If "instance" is a formula, translate it;
  ;; If it is an instance-creating variable of the form $<var>, return a 
  ;;    system-generated variable which will evaluate to a new instance;
  ;; If it is a reference to a (non-constant) instance,
  ;;    return a system-generated variable that will evaluate to that object;
  ;; If it is an external variable, return it directly;
  (cond
   (create-p
    ;; "instance" is an identifier whose gensym variable will be bound by
    ;;     a subsequent :create statement.  Add a gensym variables to the top-level
    ;;     let variables, but bind it initially to nil;
    (if (question-mark-variable-p instance)     ;  TAR 6/1/95
      instance
      (form-query-let-variable instance :create-instance)))
   ((consp instance)
    (cond ((quoted-p instance) instance)
	  ((member (first instance) '(:the-list :the-list*))
	     `(,(if (eq (first instance) :the-list)
		    'list
		  'list*)
		  ,@(loop for v in (rest instance)
			collect (form-conditioned-instance v))))
	  (t (validate&translate-term instance))))
   ((dollar-variable-p instance)
    (form-query-let-variable instance :dollar-instance))
   ((identifier-reference-p instance)
    (form-query-let-variable instance :instance))
   (t instance)) )

(defun form-conditioned-value (value domain relation)
  ;; If "value" is a formula, translate it;
  ;; If it is an instance-creating variable or an instance identifier, return a 
  ;;    system-generated variable that will evaluate to an instance object;
  ;; If it is a symbol which might be either an instance identifier or a constant
  ;;    (because "relation" is a variable), return a system-generated variable;
  ;; If it is a symbolic constant, quote it;
  ;; If it is a quoted symbol or numeric or string constant, return it directly;
  (let ((valueIsIdentifierP (identifier-reference-p value)))
    (cond 
     ((consp value)
      (cond ((quoted-p value) value)
	    ((member (first value) '(:the-list :the-list*))
	     `(,(if (eq (first value) :the-list)
		    'list
		  'list*)
		  ,@(loop for v in (rest value)
			collect (form-conditioned-value v *thing* nil))))
	    (t (validate&translate-term value))))
      ((eq value '*) :star)
      ((dollar-variable-p value)
       (form-query-let-variable value :dollar-instance))
      ((and valueIsIdentifierP
	    domain
	    (not (constant-concept-p domain)))
       (form-query-let-variable value :instance))
      ((and valueIsIdentifierP
	    (question-mark-variable-p relation))
       (form-query-let-variable value :instance-or-constant :relation relation))
      ((or valueIsIdentifierP
	   (member value '(-INFINITY +INFINITY)))
       `',value)
      (t value)) ))

(defun validate&translate-term (term)
  ;; Verify that the operators in "term" are defined functions, and that
  ;;    "term" contains the right number of arguments;
  ;; Return a lambda-expression equivalent to "term";
  ;; Note: In all cases, "term" is a non-boolean function;
  (wrap-with-query-clean-up-instances-code
    `(car ,(translate-relational-formula term :function))) )

(defun form-tell-let-binding-clause (letVariablesEntry)
  ;; Each "letVariablesEntry" is built by "form-query-let-variable" and has the form 
  ;;    (<expression> <expression-type> <variable> <relation>);
  ;; Return a "let" clause that binds <variable> to the concept, relation, or
  ;;    instance indicated by <expression>;
  ;; The value of the variable <relation> is used at run-time to determine
  ;;    whether <expression> is an instance identifier or a constant;
  (let ((expression (car letVariablesEntry))
	(exprType (second letVariablesEntry))
	(variable (third letVariablesEntry))
	(relation (fourth letVariablesEntry)))
    (when (and (member exprType '(:instance :instance-or-constant))
	       (identifier-reference-p expression))
      (setq expression `',expression))
    (ecase exprType
      ((:concept :relation)
       `(,variable
	 ,(if (symbolp expression)
	      (case exprType
		(:relation (create-predicate-symbol expression *context*))
		;; THIS DOESN'T ALWAYS GET THE CONTEXT REFERENCE RIGHT:
		(:concept `(get-concept ',expression)))
	      (form-concept-referent expression t))))
      (:dollar-instance
       ;; Was  (create-classified-instance nil nil nil)  ; TAR 12/2/98
       `(,variable (create nil nil)))
      (:create-instance                 ; a create statements binds "variable" later
       `(,variable nil))
      (:instance
       `(,variable (find-or-create-instance ,expression nil)))
      (:instance-or-constant
       `(,variable (coerce-to-instance-or-constant ,expression ,relation)))
      (:world-time
       `(,variable ,(compute-world-time-form expression)))) ))

  ;;
;;;;;; "form-one-assertion" and friends
  ;;

(defun form-one-assertion (clause)
  ;; Return a result form corresponding to "clause" which will execute
  ;;    an assertion;
  (if (keywordp (car clause))
      (case (car clause)
	((:filled-by :filled-by-list)
	 (form-list-assertion clause))
	((:at-least :at-most :exactly :all :some :equivalent-roles :same-as    ; DGB 12/9/93
		    :not-in :not-filled-by)
	 (form-descriptive-assertion clause))
	((:becomes :ceases :persists-forward :persists-backward)
	 (form-world-time-assertion clause))
	; This is an internal error.  Should it call FORM-QUERY-ERROR?  tar 8/10/92:
	; For now, make it just complain, so that other results are returned for testing.
	(otherwise			
	 (complain "~2%Unrecognized leading keyword in clause:~%   ~S~2%"
		   clause)
	 nil))
      (case (length clause)
	(2 (form-unary-assertion clause))
	(3 (form-binary-assertion clause))
	(otherwise (form-n-ary-assertion clause)))) )

(defun form-unary-assertion (clause)
  ;; Expand a clause containing a unary predicate into a form which will
  ;;    assert the corresponding proposition;
  (let ((conceptForm (first clause)))   ;  TAR 3/13/96
    (if (and (symbolp conceptForm)
             (boundp conceptForm) 
             (member :read-only (attributes (symbol-value conceptForm))))
      (progn (complain "~%Error: Attempt to assert to read-only concept ~A." conceptForm)
             nil)
      `(assert-conjunct ,(second clause) ,conceptForm :assertion)) ))

(defun form-binary-assertion (clause)
  ;; Expand a clause containing a binary predicate into a form which will
  ;;    assert the corresponding proposition;   
  ;; TO DO: CREATE EXPRESSION TO PASS AS THE FIRST ARG TO "assert-role-filler";
  ;; TO DO: OPTIMIZE THIS TO CALL "form-assert-role-filler";
  (let ((relationForm (first clause)))   ;  TAR 3/13/96
    (if (and (symbolp relationForm) 
             (boundp relationForm) 
             (member :read-only (attributes (symbol-value relationForm))))
      (progn (complain "~%Error: Attempt to assert to read-only relation ~A." relationForm)
             nil)
      (if (and (consp (car clause))
               (eq (caar clause) :index))
        `(assert-nth-role-filler 
          ,(caar clause) ,(second clause) ,(third clause) ,(cadar clause))
        `(assert-role-filler ,(second clause) ,relationForm
                             ,(third clause) :assertion))) ))

(defun form-n-ary-assertion (clause)
  ;; Expand a clause containing an n-ary predicate into a form which will
  ;;    assert the corresponding proposition;
  (let ((relationForm (first clause)))   ;  TAR 3/13/96
    (if (and (symbolp relationForm) 
             (boundp relationForm) 
             (member :read-only (attributes (symbol-value relationForm))))
      (progn (complain "~%Error: Attempt to assert to read-only relation ~A." relationForm)
             nil)
      `(assert-tuple (list ,@(cdr clause)) ,relationForm)) ))

(defun form-list-assertion (clause)
  ;; Expand a clause containing a list of fillers into  a form which will
  ;;    assert the corresponding proposition;   
  (let ((keyword (car clause)))
    (case keyword
      (:filled-by 
       `(assert-list-of-role-fillers 
	    ,(third clause) ,(second clause) (list ,@(fourth clause))))
      (:filled-by-list
       `(assert-list-of-role-fillers 
	    ,(third clause) ,(second clause) ,(fourth clause)))) ))

(defun form-descriptive-assertion (clause)
  ;; Form code that evaluates a clause containing a descriptive (non grounded)
  ;;    a assertion (except that :not-filled-by is grounded);
  ;; BUG: QUALIFIED "relation" REFERENCES DON'T GET EXPANDED!!!;
  (let ((keyword (car clause)))
    (case keyword
      (:all
       `(add-asserted-value-restriction 
	  ,(second clause) ,(third clause) ,(fourth clause)))
      (:some
       `(add-asserted-number-restriction
	  ,(second clause) ,(third clause) 1 'INFINITY ,(fourth clause)))
      (:at-least
       `(add-asserted-number-restriction
	  ,(second clause) ,(fourth clause) ,(third clause) 'INFINITY
	  ,(fifth clause)))
      (:at-most
       `(add-asserted-number-restriction
	  ,(second clause) ,(fourth clause) 0 ,(third clause) ,(fifth clause)))
      (:exactly
       `(add-asserted-number-restriction
	  ,(second clause) ,(fourth clause) ,(third clause) ,(third clause)
	  ,(fifth clause)))
      (:not-in
       `(assert-not-in ,(second clause) ,(third clause)))
      (:not-filled-by
       `(add-asserted-not-filled-by-restriction
         ,(second clause) ,(third clause) ,(fourth clause)))
      (:equivalent-roles                       ; DGB 12/9/93
       `(add-asserted-equivalence-restriction
	 ,(second clause) ,(third clause) ,(fourth clause)))
      (:same-as
       `(merge-instances ,(second clause) ,(third clause) :assertion))) ))

(defun form-world-time-assertion (clause)
  ;; Expand a clause containing a :becomes or :ceases and a world time
  ;;   into a call to the appropriate queueing function.
  ;; TO DO: EXTEND FOR N-ARY RELATIONS
  ;; SHOULD THIS SIGNAL AN ERROR FOR ASSERTIONS TO NON-TEMPORAL
  ;; RELATIONS OR CONCEPTS?
  (let ((form (third clause)))			; Form to be asserted
    (if (= (length form) 2)			; Concept
	`(add-time-concept ,(second form) ,(first form)
			   ,(first clause) ,(second clause))
	`(add-time-relation ,(second form) ,(first form) ,(third form)
			    ,(first clause) ,(second clause)))))

#+CLTL2 (declaim (inline add-time-concept add-time-relation))
#-CLTL2 (proclaim '(inline add-time-concept add-time-relation))

(defun add-time-concept (instance concept change worldTime)
  ;; Calls function to add the "change" (:becomes or :ceases) to the
  ;;   temporal database at "worldTime";
  (add-to-local-instances concept instance)	; More sophisticated?
  (loop for c in (most-specific-atemporal-monotonic-super-concepts concept)
	do (assert-conjunct instance c :assertion))
  (add-time-value instance :type concept change worldTime))

(defun add-time-relation (instance relation value change worldTime)
  ;; Calls function to add the "change" (:becomes or :ceases) to the
  ;;   temporal database at "worldTime";
  (loop for r in (most-specific-atemporal-monotonic-super-concepts relation)
	do (assert-role-filler instance r value :assertion))
  (add-time-value instance relation value change worldTime)
  (when (inverse relation) 		; Test "value" as well?
    (add-time-value value (inverse relation) instance change worldTime)))



(defun form-list-of-create-assertion (clause remainingPropositions)
  ;; Expand to a clause which binds a let variable to a newly created
  ;;    instance;
  ;; "clause" has the form "(:create <variable> <concept> <closP> <identifier>)";
  ;; Code for "remainingPropositions" is placed within the scope of the 
  ;;    locally-generated "let" expression;
  ;; Note: Successive creates to the same variable cause the variable to be
  ;;    (re) bound to distinct instances;
  (let* ((variable (second clause))
         (identifier (fifth clause))
         (createClosInstanceCode
          ;; BUG:  WHEN THIS IS "NIL", THE CODE FOR "create-instance-safely"
          ;;   WILL TRY TO ALLOCATE AN INSTANCE THAT IS EITHER THE DEFAULT
          ;;   FOR THE CONTEXT, OR (WHICH IS LIKELY) IF THERE IS NO SUCH
          ;;   DEFAULT, IT WILL ALLOCATE A :clos-instance IF A CLOS CLASS
          ;;   EXISTS.  SHOULD THIS BE CHANGED TO AN "if" STATEMENT THAT
          ;;   ESTABLISHES A THE CREATION OF CLASSIFIED INSTANCES?  THAT
          ;;   WOULD PRESERVE EXISTING SEMANTICS.
          (if (eq (fourth clause) :clos)
	      :clos-instance
	    (fourth clause)))
         (createCode
	  (if (eq createClosInstanceCode :skolem-instance)
	      `(create-skolem-instance
		',identifier :type ,(third clause))
	      `(create-instance-safely
		',identifier ,(third clause) nil ,createClosInstanceCode)))
         (remainingCode
          (form-assertion-code remainingPropositions)))
    (if identifier
      `((setq ,variable ,createCode)
        ,@remainingCode)
      `((let ((,variable ,createCode))
          ,@remainingCode))) ))


  ;;
;;;;;; "form-one-retraction" and friends
  ;;

(defun form-one-retraction (clause)
  ;; Return a result form corresponding to "clause" which will execute
  ;;    a retraction;
  (cond 
    ((keywordp (car clause))
     (case (car clause)
       ((:filled-by :filled-by-list)
	(form-list-retraction clause))
       ((:at-least :at-most :exactly :all :some :not-in :not-filled-by :same-as)
	(form-descriptive-retraction clause))
       ((:becomes :ceases :persists-forward :persists-backward)
	(form-world-time-retraction clause))))
    (t
     (case (length clause)
       (2 (form-unary-retraction clause))
       (3 (form-binary-retraction clause))
       (otherwise (form-n-ary-retraction clause))))) )

(defun form-unary-retraction (clause)
  ;; Expand a clause containing a unary predicate into a form which will
  ;;    retract the corresponding proposition;
  (let ((conceptForm (first clause)))   ;  TAR 3/13/96
    (if (and (symbolp conceptForm)
             (boundp conceptForm) 
             (member :read-only (attributes (symbol-value conceptForm))))
      (progn (complain "~%Error: Attempt to retract from read-only concept ~A." conceptForm)
             nil)
      `(retract-conjunct ,(second clause) ,conceptForm :retraction)) ))

(defun form-binary-retraction (clause)
  ;; Expand a clause containing a binary predicate into a form which will
  ;;    retract the corresponding proposition;   
  ;; TO DO: CREATE EXPRESSION TO PASS AS THE FIRST ARG TO "retract-role-filler";
  ;; TO DO: OPTIMIZE THIS TO CALL "form-retract-role-filler";
  (let ((role (car clause))
	(instance (second clause))
	(value (third clause))
	attributes)
    (cond 
      ((consp role)
       `(retract-nth-role-filler ,(car role) ,instance ,value ,(cadr role)))
      ((and (symbolp role)           ;  TAR 3/13/96
            (boundp role)
            (member :read-only (setq attributes (attributes (symbol-value role))))
	    (not (member :cache-computation attributes)))
       (complain "~%Error: Attempt to retract from read-only relation ~A." role)
       nil)
      ((eq value :star)
       `(retract-list-of-role-fillers 
	  ,instance ,role 
	  (get-slot-values ,instance ,role)))
      (t
       `(retract-role-filler ,instance ,role ,value :retraction))) ))

(defun form-n-ary-retraction (clause)
  ;; Expand a clause containing an n-ary predicate into a form which will
  ;;    retract the corresponding proposition;
  (let ((relationForm (first clause)))   ;  TAR 3/13/96
    (if (and (symbolp relationForm) 
             (boundp relationForm) 
             (member :read-only (attributes (symbol-value relationForm))))
      (progn (complain "~%Error: Attempt to retract from read-only relation ~A." relationForm)
             nil)
      `(retract-tuple (list ,@(cdr clause)) ,relationForm)) ))

(defun form-list-retraction (clause)
  ;; Expand a clause containing a list of fillers into a form which will
  ;;    retract the corresponding proposition;   
  (let ((keyword (car clause))
	(role (second clause))
	(instance (third clause))
	(value (fourth clause)))
    (case keyword
      (:filled-by 
       (if (eq value :star)
	   `(retract-list-of-role-fillers 
	      ,role ,instance (get-slot-values ,instance ,role))
	   `(retract-list-of-role-fillers ,role ,instance (list ,@value))))
      (:filled-by-list
       `(retract-list-of-role-fillers ,role ,instance ,value))) ))

(defun form-descriptive-retraction (clause)
  ;; Expand a clause containing an existential or universal quantifier into 
  ;;    a form which will retract the corresponding proposition;   
  (let ((keyword (car clause)))
    (case keyword
      (:all
       `(remove-asserted-value-restriction 
	  ,(second clause) ,(third clause) ,(fourth clause)))
      (:some
       `(remove-asserted-number-restriction
	  ,(second clause) ,(third clause)  1 'INFINITY ,(fourth clause)))
      (:at-least
       `(remove-asserted-number-restriction
	  ,(second clause) ,(fourth clause) ,(third clause) 'INFINITY
	  ,(fifth clause)))
      (:at-most
       `(remove-asserted-number-restriction
	  ,(second clause) ,(fourth clause) 0 ,(third clause) ,(fifth clause)))
      (:exactly
       `(remove-asserted-number-restriction
	  ,(second clause) ,(fourth clause) ,(third clause) ,(third clause)
	  ,(fifth clause)))
      (:not-in
       `(retract-not-in ,(second clause) ,(third clause)))
      (:not-filled-by 
       `(remove-asserted-not-filled-by-restriction
         ,(second clause) ,(third clause) ,(fourth clause)))
      (:same-as
       `(merge-instances ,(second clause) ',(third clause) :retraction))
      ) ))

(defun form-world-time-retraction (clause)
  ;; Expand a clause containing a :becomes or :ceases and a world time
  ;;   into a call to the appropriate queueing function.
  ;; TO DO: EXTEND FOR N-ARY RELATIONS
  (let ((form (third clause)))			; Form to be asserted
    (if (= (length form) 2)			; Concept
	`(delete-time-concept ,(second form) ,(first form)
			      ,(first clause)  ,(second clause))
	`(delete-time-relation ,(second form) ,(first form) ,(third form)
			       ,(first clause)  ,(second clause))) ))

#+CLTL2 (declaim (inline delete-time-concept delete-time-relation))
#-CLTL2 (proclaim '(inline delete-time-concept delete-time-relation))

(defun delete-time-concept (instance concept change worldTime)
  ;; Calls function to delete the "change" (:becomes or :ceases) from the
  ;;   temporal database at "worldTime";
  (delete-time-value instance :type concept change worldTime))

(defun delete-time-relation (instance relation value change worldTime)
  ;; Calls function to delete the "change" (:becomes or :ceases) from the
  ;;   temporal database at "worldTime";
  (delete-time-value instance relation value change worldTime)
  (when (inverse relation) 		; Test "value" as well?
    (delete-time-value value (inverse relation) instance change worldTime)))

(defun extract-subscript-index (subscript)
  ;; Extract and return the discrete scalar quantity used in "subscript";
  (read-from-string (string-trim "[]" subscript)) )

(defun indexed-expression-p (expression)
  ;; Return t iff "expression" is a symbol prefixed by "[";
  (and (symbolp expression)
       (eql (aref (symbol-name expression) 0) #\[)) )

(defun predicate-formula-p (expression)
  ;; Return t iff "expression" is a formula which is to be computed
  ;;    as a predicate;
  (let ((relation (eval-relation-id (car expression))))
    (and relation
	 (get (name relation) :loom-source-function)) ))


  ;;
;;;;;; Run-time functions
  ;;  

;;;  Functions that execute at run-time to perform assertions, and retractions


(defun add-asserted-number-restriction
       (instance relation lowerBound upperBound qualification)
  ;; Create a number restriction on "relation", and add the restriction to the
  ;;    asserted restrictions of "instance" and add "qualification" to the
  ;;    qualifications;
  (assert-feature
    instance
    (create-local-restriction-safely 
      relation qualification
      :local-lower-bound lowerBound :local-upper-bound upperBound)) )

(defun add-asserted-value-restriction (instance relation concept)
  ;; Create a value restriction on "relation", and add the restriction to the
  ;;    asserted restrictions of "instance";
  (assert-feature
    instance
    (create-local-restriction-safely 
      relation nil
      :local-value-restrictions concept :local-lower-bound 0)) )

(defun add-asserted-not-filled-by-restriction (instance relation filler)
  ;; Create a not-filled-by restriction on "relation", and add the restriction
  ;;    to the asserted restrictions of "instance";
  (assert-feature
    instance
    (create-local-restriction-safely  
      relation nil
      :local-non-role-fillers (list filler))) )

(defun add-asserted-equivalence-restriction (instance role1 role2)    ; DGB 12/9/93
  ;; Create a comparison feature equating "role1" and "role2", and add the
  ;;    comparison to the asserted features of "instance";
  (assert-feature
   instance
   (make-loom-instance 
    'COMPARISON-FEATURE
    :feature-type :same-as
    :relationship (get-relation 'same-as)
    :roles (list role1 role2))) )

(defun remove-asserted-number-restriction
       (instance relation lowerBound upperBound qualification)
  ;; Create a (possibly qualified) number restriction on "relation", and
  ;;   remove the restriction from the asserted restrictions of "instance";
  (retract-feature
    instance
    (create-local-restriction-safely 
      relation qualification
      :local-lower-bound lowerBound :local-upper-bound upperBound)) )

(defun remove-asserted-value-restriction (instance relation concept)
  ;; Create a value restriction on "relation", and remove the restriction from the
  ;;    asserted restrictions of "instance";
  (retract-feature
    instance
    (create-local-restriction-safely 
      relation nil
      :local-value-restrictions concept :local-lower-bound 0)) )

(defun remove-asserted-not-filled-by-restriction (instance relation filler)
  ;; Remove a not-filled-by restriction on "relation" from the instance
  ;;    "instance" for the filler "filler";
  (retract-feature
    instance
    (create-local-restriction-safely  
      relation nil
      :local-non-role-fillers (list filler))) )

(defun coerce-to-instance-or-constant (identifier relation)
  ;; Coerce "identifier" to a member of the base set of the range 
  ;;    of "relation";
  ;; Return nil if the range of "relation" is not a set;
  (let ((range (implied-range relation)))
    (if (and range
	     (not (constant-concept-p range)))
	(find-or-create-instance identifier nil)
	identifier) ))



  ;;
;;;;;; "forget-all-inverse-roles"
  ;;

(defun forget-all-inverse-roles (instance)
  ;; Helping function for "forget-all-about";
  ;; Retract inverse & phantom-inverse role fillers that point
  ;;   to "instance":
  (multiple-value-bind (realFillerPairs phantomFillerPairs)
      (collect-roles&fillers instance :asserted-only-p t)
    (loop for pair in realFillerPairs
	 do
	 (let* ((role (car pair))
		(inverseRole (inverse role))
		newFiller)
	   (declare (ignore newFiller))
	   (loop for filler in (list-of (cdr pair))
                 unless (discarded-p filler)
		 do
		 (cond
		   (inverseRole
		    (unless (constant-p filler)
		      (retract-role-filler filler inverseRole instance :all)))
		   ((classified-instance-p filler)
		    (retract-phantom-inverse-role-filler
		     role filler instance))))))
    ;; retract non-inverse role fillers that point to "instance":
    (loop for pair in phantomFillerPairs
	  do
	  (loop for filler in (cdr pair)
                unless (discarded-p filler)
		do
		(cond
		 ((constant-p filler)
		  (grumble "Found constant ~S in phantom inverse list on ~S"
			   filler instance))
		  ((eq (asserted-features filler) :deleted)
		   (grumble "Found deleted instance in phantom inverse list"))
		  (t
		   (retract-role-filler 
		    filler (inverse-of-phantom(car pair)) instance :all)))))) )


  ;;
;;;;;; "skolem"
  ;;

;;; Create one or more new skolem instances.

(eval-when (load eval compile) ;(:compile-toplevel :load-toplevel :execute)
  (defun form-sequence-of-skolems (ids)
    ;; Helping function for skolem macro;
    `(progn
       ,@(loop for id in ids
	       collect `(create-skolem-instance ',id))) ))

(defmacro skolem (&rest ids)
  ;; Create skolem instances for each id in "ids";
  (form-sequence-of-skolems ids) )



#|

FOR DAVE:

(tell-table
  :about-each (PERSON ALIVE (:at-least 1 spouse) (hobby music))
  :roles (age height weight spouse :about)
  :entries
  ((fred    5    3    100    mary (BIG UNEMPLOYED (child Sue)))
   (mary    3    5    80     nil  (SMALL))))

(let ((fred (find-or-create-instance 'Fred))
      (mary (find-or-create-instance 'Mary)))
  (flet ((foo
	   (?self ?age ?height ?weight ?spouse)
	   (tell (age ?self ?age)
		 (height ?self ?height)
		 (weight ?self ?weight)
		 (spouse ?self ?spouse))))
    (loop for ?self in (fred mary)
	 as row in (list (list  5    3    100    mary)
			 (list  3    5    80     nil))
	 do 
	 (tell-about ?self (PERSON ALIVE (:at-least 1 spouse) (hobby music)))
	 (apply (function foo) (list ?self row)))
    (tell (:about fred BIG UNEMPLOYED (child Sue))
	  (:about mary SMALL))))


TO DO: CONSIDER ADDING MORE MACRO-EXPAND-TIME TYPE CHECKING ON CONSTANTS

TO DO: IMPLEMENT DELETION OF INSTANCES FROM WORLDS
   AND CALL FROM "forget-all-about";

TO DO:  PUT IN LOGIC TO DETECT FAILURE OF ASSERTIONS;

|#
