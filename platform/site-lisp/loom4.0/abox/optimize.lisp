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

;;; OPTIMIZE.LISP (ABOX)

(in-package "LOOM")

;(export '())

;;; Query Optimizer

;;; "compute-optimal-generator-sequence" is the top level entry to the
;;;    query optimizer.  It is called by "form-retrieval-query"
;;;    "form-existential-query" and "form-universal-query".  It computes an optimal
;;;    sequence of generators for a query or subquery, returns the result in
;;;    an assoc list pairing variables and generator entries, and as a side-effect
;;;    stores the same list in the special variable *finalGenerators*;;;    
;;;    "compute-optimal-generator-sequence" places all records used during the
;;;    optimization onto recycle lists, except for those stored in *finalGenerators*.
;;;    "form-query-code" is responsible for recycling those records.

(defun compute-optimal-generator-sequence 
       (query freeVariables outputVariables &key closed-generators-p)
  ;; Return a list of variable/generator records that specifies an
  ;;    optimal sequence for generating variable bindings for
  ;;    variables in "outputVariables";
  ;; Variables in "freeVariables" but not in "outputVariables" are
  ;;    existentially quantified variables whose use is optional (they
  ;;    may be needed to "bridge" from one output variable to another);
  ;; Generate query error if no ordering of generators exists that
  ;;    causes all variables to be bound;
  ;; If "closed-generators-p" is set, then only allow closed-world
  ;;    predicates to be generators, except when "closed-generators-p"
  ;;    equals :permit-open-roles, in which case we also permit roles
  ;;    to be generators;
  ;; Note: "compute-optimal-generator-sequence" must be applied to
  ;;	subqueries of "query" to optimize internally-quantified
  ;;	variables, i.e., those quantified by :forall, or embedded
  ;;	within :fail, :or etc.
  ;; Strategy:
  ;;    For each variable, compute a set of generator terms for it;
  ;;    Search for an optimal ordering of generator terms that causes all
  ;;       free variables to be bound;
  ;;    Truncate the final generator sequence to the shortest
  ;;       sequence that binds all output variables (thus permitting
  ;;       the code generator to generate filter code rather than
  ;;       nested loops to process the remaining free variables);
  (declare (special *finalGenerators* *queryPicture* *codeObjectBeingSealed*))
  (let ((agentTimeExpression (current-agent-time-expression))
	vGR badVariables
	(*freeVariables* freeVariables)
	(*closedGeneratorsOnlyP* closed-generators-p)
	*variable/generatorsTable* *bestGeneratorSequence* *bestCost*)
    (declare (special *freeVariables* *closedGeneratorsOnlyP* 
		      *variable/generatorsTable* *bestGeneratorSequence* *bestCost*
		      *newExistentialNames*))
    (loop for var in freeVariables
	  do
	  (setq vGR (collect-generators-for-variable
		     var query agentTimeExpression))
	 (when (and (null (generator-entries vGR))
		    (null (domain-generator vGR)))
	   ;; return failure:
	   (discard-VGRs&unused-generator-entries
	    *variable/generatorsTable* nil)
	   (if (and closed-generators-p
		    (neq closed-generators-p :permit-open-roles))
	       ;; avoid error, because we may retry with after
	       ;; relaxing the closure restriction:
	       (return-from compute-optimal-generator-sequence nil)
	     (let ((prettyVar (if (boundp '*newExistentialNames*)
				  (or (cdr (assoc var *newExistentialNames*)) var)
				  var)))
	       (form-query-error "Can't generate bindings for the variable ~S.~%~
                                  Possible causes are~% ~
                    o  ~S is universally quantified and all generator expressions~%    ~
                       for ~S are open world~% ~
                    o  All generators found for ~S are constant concepts denoting infinte~%    ~
                       sets like NUMBER or STRING, which cannot be used.~:[~*~;~% ~
                    o  ~S occurs inside a :within-theory or :within-world binding~%    ~
                       and the only generator is THING.  THING is only used at top level.~]"
				 prettyVar prettyVar prettyVar prettyVar 
                                 (search-tree-list-p 
                                  '(:within-theory :within-world) query)
                                 prettyVar))))
	 (push vGR *variable/generatorsTable*))
    (search-for-best-generator-sequence nil nil 0 1)
    ;; truncate by eliminating trailing (leading before reversal)
    ;; non-output variables.
    ;; TRICKY:  SCANNED-TUPLE-GENERATORS CAN BIND OUTPUT VARIABLES IN
    ;;    ADDITION TO A NON-OUTPUT VARIABLE THAT THEY ARE INDEXED UNDER
    ;;    IN *bestGeneratorSequence*:
    (loop for tail on *bestGeneratorSequence*
	  when (or (member (caar tail) outputVariables)
                   (and (eq (generator-type (cdar tail)) :scanned-tuple-relation)       ;  TAR 12/8/94
                        (loop for var in (cdr (generator-term (cdar tail)))
                              thereis (member var outputVariables)))) 
	  do (setq *bestGeneratorSequence* tail)
	     (return nil))
    ;; reverse so first generators appear at the head of the list:
    (setq *bestGeneratorSequence*
	  (nreverse *bestGeneratorSequence*))
    (when (setq badVariables
		(loop for pair in *bestGeneratorSequence*
		      when (eq (car (generator-term (cdr pair))) *thing*)
		      collect (car pair)))
      (complain "~&Performance Warning: Query scans the entire top level context to ~
                 generate~%   bindings for the variable~P~{ ~S~^,~} found ~
                 in the query~%~3@T~S~%"
		(length badVariables) badVariables *queryPicture*)
      (when (boundp '*codeObjectBeingSealed*)
	(complain "Warning occurred while sealing the relation ~S~%."
		  *codeObjectBeingSealed*)))
    ;; record best generator sequence so that it can be used to eliminate:
    ;;    terms from filter code: 
    (setq *finalGenerators* *bestGeneratorSequence*)
    (discard-VGRs&unused-generator-entries
      *variable/generatorsTable* *bestGeneratorSequence*)
    ;; return best generator sequence:
    (when (null *bestGeneratorSequence*)
      (form-query-error
	"Can't find a way to generate bindings for all query variables."))
    *bestGeneratorSequence*))

(defun search-for-best-generator-sequence
       (boundVariables generatorSequence costEstimate sizeEstimate)
  ;; Complete a search for complete sequences of bindings, among those
  ;;    prefixed by "generatorSequence ";
  ;; "costEstimate" stores the cost of the current set of bindings;
  ;; "sizeEstimate" stores the cardinality of the intermediate cross product;
  ;; Test to see if all output variables have been bound.  If so,
  ;;    then "generatorSequence" binds all output variables, and
  ;;    possibly some of the existential variables.  Its cost is less
  ;;    than the current best, so save the sequence and the cost in
  ;;    *bestGeneratorSequence* and *bestCost*;
  ;; Otherwise, scan *variable/generatorsTable* for unmarked variables;
  ;;    Prepend to *bestGeneratorSequence* the (heuristically estimated)
  ;;    best generators for each of the unmarked variables with a generator;
  ;; Note: The final positioning of generators in *bestGeneratorSequence* is
  ;;    the reverse of the order in which they should be executed;
  (declare (special *variable/generatorsTable* *freeVariables*
		    *bestGeneratorSequence* *bestCost*))
  (flet ((sort-by-cardinality (candidatePairs)
	   ;; Return list with cheaper generators preceeding more expensive;
	   (sort candidatePairs
		 #'(lambda (pair1 pair2)
		     (< (generator-cardinality (car pair1))
			(generator-cardinality (car pair2)))))))
    (let (candidatePairs generatorEntry )
      ;; exit with generator sequence if all output variables are bound:
      (when (loop for var in *freeVariables*
		  always (member var boundVariables))
	;; save current best sequence and exit:
	(setq *bestGeneratorSequence* generatorSequence)
	(setq *bestCost* costEstimate)
 #L:trace-optimize (say "Sequence:"
			(nreverse (loop for s in *bestGeneratorSequence*
					collect (car s)))
			"  Cost:" *bestCost*)
	(return-from search-for-best-generator-sequence nil))
      ;; if we didn't exit, then there is at least one unbound
      ;; variable in the table:
      (loop for vGR in *variable/generatorsTable*
	   unless (member (generator-variable vGR) boundVariables)
	   do (when (setq generatorEntry
			  (select-current-best-generator-for-variable
			   vGR boundVariables))
		(push (cons generatorEntry vGR) candidatePairs)))
      ;; if a "zero cost" candidate exists, eliminate the other candidates:
      (loop for pair in candidatePairs
            when (= (generator-cardinality (car pair)) 1)
            do (setq candidatePairs (list pair))
               (return nil))
      ;; backtrack search over all bindable free variables:
      (loop for (generatorEntry . vGR) in (sort-by-cardinality candidatePairs)
            as variable = (generator-variable vGR)
            as newBoundVariables = (cons variable boundVariables)
	    do
	    ;; if generator is a set of tuples, look for additional variables
	    ;;    that get bound "for free" by this generator:
	    (when (eq (generator-type generatorEntry) :scanned-tuple-relation)
	      (loop for var in (cdr (generator-term generatorEntry))
		    do (pushnew var newBoundVariables)))
	   ;; compute cost, test against current best cost, and then
	   ;; search next level down;
	   (multiple-value-bind (newCost newSize)
	      (compute-cost-of-bindings 
	       generatorEntry vGR costEstimate sizeEstimate newBoundVariables)
	     (when (or (null *bestCost*)
		       (< newCost *bestCost*))
	       (search-for-best-generator-sequence 
		 newBoundVariables
		 `((,variable . ,generatorEntry) ,@generatorSequence)
		 newCost newSize)))))))

(defun compute-cost-of-bindings (generatorEntry vGR cost size boundVariables)
  ;; Return two values:
  ;;    (1) an estimate of the cost of the partial query;
  ;;    (2) the estimated size of the intermediate cross product;
  ;; "cost" is the estimated cost so far,
  ;; "size" is the estimated size of the intermediate cross product so far;
  ;; "generatorEntry" indicates the next generator to be applied;
  ;; "vGR" contains additional terms that may filter the intermediate
  ;;     cross product (and hence reduce its size);
  ;; New cost estimate:
  ;;    Use the generator cardinality inside of "generatorEntry" multiplied by
  ;;    "size" to estimate the cost of evaluating the generator;
  ;;    Add this product to "cost" to get the new cost estimate;
  ;; New size estimate:
  ;;    Multiply "size" by the generator cardinality, and divide that by
  ;;    two to the power equal to the number of filter terms fully-bound
  ;;    inside of "vGR";
  (flet ((fully-bound-term-p (term)
	   (loop for arg in (cdr term)
		 always (member arg boundVariables))))
    (let* ((newSize (* size (generator-cardinality generatorEntry)))
	   (newCost (+ cost newSize)))
      (loop for otherGenEntry in (generator-entries vGR)
	    when (and (neq otherGenEntry generatorEntry)
		      (fully-bound-term-p (generator-term otherGenEntry)))
	    do (setq newSize (/ newSize 2)))
      (values newCost newSize) )))

(defun select-current-best-generator-for-variable (vGR boundVariables)
  ;; Helping function for "select-k-best-generators";
  ;; Using "vGR", scan the set of generators for the corresponding
  ;;    variable;  Return the (heuristically-selected) best, among the subset
  ;;    of those generators that could currently generate the variable, based on
  ;;    the bindings represented by the list "boundVariables";
  (declare (special *freeVariables*))
  (labels ((bound-term-p (variable extraBoundVars)
	     (cond ((question-mark-variable-p variable)
		    (or (member variable boundVariables)	  ; bound variable
			(member variable extraBoundVars)          ; parallel bound var
			(not (member variable *freeVariables*)))) ; external var
		   ((atom variable) t)
		   (t			                          ; formula
		    (loop for arg in variable
			  always (bound-term-p arg extraBoundVars)))))
	   (bound-second-term-p (variable extraBoundVars)
	     ;; Specialization of "bound-term-p" to only check the second item of lists;
	     (if (question-mark-variable-p variable)
		 (or (member variable boundVariables)	; bound variable
		     (member variable extraBoundVars)	; parallel bound variable
		     (not (member variable *freeVariables*)))	; external variable
		 (or (atom variable)		; constant
		     (if (keywordp (first variable))
			 (loop for arg in (rest variable)
			       always (bound-second-term-p arg extraBoundVars))
			 (bound-second-term-p (second variable) extraBoundVars)))))
	   (lower-cardinality-p (entry1 entry2)
	     (< (generator-cardinality entry1)
		(generator-cardinality entry2)))
	   (more-recent-entry-p (entry1 entry2)
	     (and (neq (generator-agent-time-expression entry2) '*agent-time*)
		  (eq (generator-agent-time-expression entry1) '*agent-time*)))
	   (better-generator-p (genEntry1 genEntry2)
	     ;; Return t if the generator entry "genEntry1" is heuristically
	     ;;    determined to be preferable to the entry "genEntry2";
	     ;; This test is context free except for the case of comparing
	     ;;    two tuple relations;
	     (or (user-designated-generator-p (generator-term genEntry1))
		 (lower-cardinality-p genEntry1 genEntry2)
		 (and (not (lower-cardinality-p genEntry2 genEntry1))
		      (or (more-recent-entry-p genEntry1 genEntry2)
			  (and (not (more-recent-entry-p genEntry2 genEntry1))
			       (and
				 (eq (generator-type genEntry1) :hashed-tuple-relation)
				 (eq (generator-type genEntry2) :scanned-tuple-relation)
				 (loop for arg in (butlast (cdr (generator-term genEntry1)))
				     always (bound-term-p arg nil)))))))) )
    (let (bestEntry generatorTerm newGeneratorEntry)
      (loop for entry in (generator-entries vGR)
	   when (and (or (null bestEntry)
			 (better-generator-p entry bestEntry)) 
		     (setq generatorTerm (generator-term entry))
                     (bound-term-p (car (generator-context entry)) nil)
		     (bound-term-p (generator-agent-time-expression entry) nil)	; TAR 12/28/92
		     (bound-term-p (generator-world-time-expression entry) nil)	; TAR 12/28/92
		     (ecase (generator-type entry)
		       (:concept 
                        (bound-term-p (first generatorTerm) nil))        ;  TAR 8/9/94
		       (:role
                        (and (bound-term-p (first generatorTerm) nil)   ;  TAR 8/9/94
			     (if (inverse-generator-p entry)
			       (bound-term-p (third generatorTerm) nil)
			       (bound-term-p (second generatorTerm) nil))))
		       (:computed-relation
                        (and (bound-term-p (first generatorTerm) nil)   ;  TAR 8/9/94
			     (loop for arg in (butlast (rest generatorTerm))
			           always (bound-term-p arg nil))))
		       ((:scanned-tuple-relation :hashed-tuple-relation)
                        (and (bound-term-p (first generatorTerm) nil)   ;  TAR 8/9/94
			     (loop for arg in (rest generatorTerm)
			           always
			           (or (not (consp arg))
				       (bound-term-p arg 
                                                     (rest generatorTerm))))))
		       (:equivalence
			(or (bound-term-p (second generatorTerm) nil)
			    (bound-term-p (third generatorTerm) nil)))
		       ((:world-transition) 	; world temporal generators TAR 12/17/92.
			;; TO DO: VERIFY THAT THIS TEST IS APPROPRIATE FOR AGENT TIME OPERATORS:
			;;        ALSO EXTEND FOR N-ARY RELATIONS?
			;; We can generate the other values, although relation names are difficult.
			(bound-second-term-p  generatorTerm nil))
		       ((:becomes :ceases :detects :undetects)	; agent temporal generators TAR 12/29/92.
			;; Require all variables to be bound for agent time queries (BUT SEE ABOVE).
			(loop for arg in (rest generatorTerm)
			      always (bound-term-p arg nil)))))
	   do (setq bestEntry entry))
      (if (and bestEntry
	       (or (<= (generator-cardinality bestEntry) $CARDINALITY-MEDIUM$)
                   (null (domain-generator vGR)) ; RMM 9/24/92
		   ))
	  bestEntry
          ;; use the better of "bestEntry" and the domain generator:
	  (and
	    (domain-generator vGR)
	    (progn
	      (setq newGeneratorEntry 
		    (create-generator-entry
		      :generator-term (list (domain-generator vGR)
					    (generator-variable vGR))
		      :generator-agent-time-expression '*agent-time*))
	      (compute-concept-generator newGeneratorEntry)
	      (if (and bestEntry
                       (if (eq (generator-type bestEntry) :concept)     ; TAR 8/12/93
                         ;; better-generator-p doesn't consider subconcept relations, so...
			   (or (lower-cardinality-p bestEntry newGeneratorEntry)  ; TAR 7/24/97
			       (better-concept-generator-p (first (generator-term bestEntry))
							   (domain-generator vGR)
							   (generator-agent-time-expression bestEntry)
							   '*agent-time*))
                         (better-generator-p bestEntry newGeneratorEntry)))
		  bestEntry
		  newGeneratorEntry)))) )))

(defun discard-VGRs&unused-generator-entries
       (variable/generatorRecords bestGeneratorSequence)
  ;; Called by "compute-optimal-generator-sequence";
  ;; Recycle all VARIABLE/GENERATORS-RECORDs and GENERATOR-ENTRYs except
  ;;    these generator entries contained in the assoc list "bestGeneratorSequence";
  (let (bestGenEntries)
    ;; collect list of best generator entries:
    (loop for pair in bestGeneratorSequence
	 do (push (cdr pair) bestGenEntries))
    (loop for vGR in variable/generatorRecords
	 do
	 (loop for genEntry in (generator-entries vGR)
	      unless (member genEntry bestGenEntries)
	      do (discard-generator-entry genEntry))
	 (discard-variable/generators-record vGR)) ))


  ;;
;;;;;; "collect-generators-for-variable"
  ;;

;;; This set of functions scans a subquery and collects the set of generators
;;;    for that variable into a VARIABLE/GENERATORS-RECORD

(defun collect-generators-for-variable (variable subQuery agentTimeExpression)
  ;; Return a VARIABLE/GENERATORS-RECORD for "variable" containing all
  ;;    possible generator terms for that variable in the query "subQuery";
  ;; "agentTimeExpression" indicates the temporal context of "subQuery", if there
  ;;    is one;
  (flet ((filter-generator-entries (generatorEntries)
	   (let (filteredEntries bestConceptEntry)
	     (loop for genEntry in generatorEntries
		  do
		  (case (generator-type genEntry)
		    (:concept
		     (when (or (null bestConceptEntry)
			       (user-designated-generator-p (generator-term genEntry))
			       (< (generator-cardinality genEntry)
				  (generator-cardinality bestConceptEntry))	; TAR 12/16/92
			       ;; The preceding test overrides the results of the following test.
			       (better-concept-generator-p
				 (first (generator-term genEntry))
				 (first (generator-term bestConceptEntry))
				 (generator-agent-time-expression genEntry)
				 (generator-agent-time-expression bestConceptEntry)))
		       (setq bestConceptEntry genEntry)))
		    (:non-existent
		     (discard-generator-entry genEntry))
		    (otherwise
		     (push genEntry filteredEntries))))
	     (when bestConceptEntry
	       (push bestConceptEntry filteredEntries))
	     filteredEntries )))
    (let ((vGR (create-variable/generators-record :generator-variable variable))
	  *variable* *generatorEntries* *domainGenerators*)
      (declare (special *variable* *generatorEntries* *domainGenerators*))
      (setq *variable* variable)
      (help-collect-generators-for-variable subQuery agentTimeExpression nil nil nil)
      ;; if there are no candidate generators, let THING be a generator:
      ;; tricky: a :non-existent generator like NUMBER is intended to inhibit the use
      ;;    of THING as a default generator;
      (when (and (null *domainGenerators*) 
                 (null *generatorEntries*))
        (collect-domain-generator *thing* agentTimeExpression nil))
      (setf (domain-generator vGR) (select-best-domain-generator *domainGenerators*))
      (setf (generator-entries vGR)
	    (filter-generator-entries *generatorEntries*))
      vGR )))

(defun select-best-domain-generator (domainGenerators)
  ;; Helping function for "collect-generators-for-variable";
  ;; Estimate which among "domainGenerators" has the smallest cardinality
  ;;    and assign that to the slot "(domain-generator vGR)";
  ;; Heuristic: We choose the most specific, and among them, we favor
  ;;    concepts having no subconcepts;
  (declare (special *closedGeneratorsOnlyP*))
  (let ((bestDomain *thing*))
    (setq domainGenerators (most-specific-concepts
                            (loop for domain in domainGenerators
                                  when (generator-predicate-p domain)
                                  collect domain)))
    (when (null domainGenerators)
      ;; exit with failure if the variable is a constant not scoped by a
      ;;    finite set:
      (return-from select-best-domain-generator nil))
    (loop for domain in domainGenerators
	  when (better-concept-generator-p domain bestDomain
					   '*agent-time* '*agent-time*)
	  do (setq bestDomain domain))
    (if (and *closedGeneratorsOnlyP*
	     (eq bestDomain *thing*))
      nil
      bestDomain) ))

(defun better-concept-generator-p (concept1 concept2 time1 time2)
  ;; Heuristically estimate whether or not "concept1" contains fewer
  ;;    instances than "concept2";
  ;; Prefer bound (non question-mark variable) concepts;
  ;; Prefer more specialized concepts;
  ;; After that, prefer *agent-time* concepts to temporally offset concepts;
  ;; After that, prefer concepts with fewer subconcepts;
  (flet ((more-recent-p (t1 t2)
	   (and (neq t2 '*agent-time*) (eq t1 '*agent-time*))))
    (and (not (question-mark-variable-p concept1))   ; TAR 2/17/95
	 (or (question-mark-variable-p concept2)     ; TAR 2/17/95
	     (subconcept-p concept1 concept2)
	     (and (not (subconcept-p concept2 concept1))
		  (or (more-recent-p time1 time2)
		      (and (not (more-recent-p time2 time1))
			   (< (length (sub-concepts concept1))
			      (length (sub-concepts concept2)))))))) ))

(defun help-collect-generators-for-variable
  (subQuery agentTimeExpression worldTimeExpression contextExpression functionP)
  ;; Helping function for "collect-generators-for-variable";
  ;; Recursively scan the terms in "subQuery", and collect into
  ;;    *generatorEntries* a list of generator entries for the variable
  ;;    *variable*;
  ;; Also, collect into *domainGenerators* a list of concepts that *variable*
  ;;    necessarily belongs to;
  ;; If *closedGeneratorsOnlyP*, only consider generator predicates for which
  ;;    the closed world assumption applies, unless "closed-generators-p"
  ;;    equals :permit-open-roles, in which case we also permit role generators
  ;;    (but not concept or n-ary relation generators);
  ;; If "functionP", then the subQuery is used as a functional form, ie it
  ;;    is a relation without having its last argument specified;
  ;; TO DO: FIGURE OUT HOW TO COLLECT DISJUNCTIVE GENERATOR;
  (declare (special *variable* *generatorEntries* *closedGeneratorsOnlyP*
		    *worldTimeSuffix* *freeVariables*))
  (when (atom subQuery)
    (return-from help-collect-generators-for-variable nil))
  (let (generatorEntry)
    (flet ((create-new-generator-entry ()
	     (setq generatorEntry
		   (create-generator-entry
		     :generator-term subQuery
		     :generator-agent-time-expression
		     (or agentTimeExpression '*agent-time*)
		     :generator-world-time-expression
		     (when worldTimeExpression
		       (list *worldTimeSuffix* worldTimeExpression))
                     :generator-context contextExpression))
	     (push generatorEntry *generatorEntries*)))
      (if (keywordp (car subQuery))
	  (case (first subQuery)
	    (:and
	     (loop for term in (cdr subQuery)
		   do (help-collect-generators-for-variable
		       term agentTimeExpression worldTimeExpression 
                       contextExpression nil)))
	    (:exists
	     ;; FIGURE OUT WHY THIS TERM WASN'T EXPANDED AWAY!!!
	     (help-collect-generators-for-variable
	      (third subQuery) agentTimeExpression worldTimeExpression
              contextExpression nil))
	    (:now
	     (help-collect-generators-for-variable
	      (second subQuery) '*agent-time* worldTimeExpression
              contextExpression nil))
	    (:previously
	     (help-collect-generators-for-variable
	      (second subQuery) '*previously* worldTimeExpression
              contextExpression nil))
	    (:at-agent-time
	     (if (eq (second subQuery) *variable*)
		 (collect-temporal-generators-for-variable
		  (third subQuery) nil worldTimeExpression contextExpression)
		 (help-collect-generators-for-variable
		  (third subQuery) (second subQuery) worldTimeExpression
                  contextExpression nil)))
	    ((:at-world-time :at-world-time- :at-world-time+)	; Need to set world temporal context?
	     (if (eq (second subQuery) *variable*)
		 (collect-temporal-generators-for-variable
		  (third subQuery) agentTimeExpression nil contextExpression)
		 (let ((*worldTimeSuffix* (case (first subQuery)
					    (:at-world-time 'none)
					    (:at-world-time- '-)
					    (:at-world-time+ '+))))
		   (declare (special *worldTimeSuffix*))	; 12/29/92 TAR
		   (help-collect-generators-for-variable
		    (third subQuery) agentTimeExpression (second subQuery)
                    contextExpression nil) )))
	    (:becomes
	     (unless worldTimeExpression
	       (grumble ":BECOMES in a generator that is not in the scope of an :AT-WORLD-TIME"))
	     (let ((*worldTimeSuffix* '+))	; Fix up for generating values at a particular time.  Filtered later.
	       (declare (special *worldTimeSuffix*))
	       (help-collect-generators-for-variable 
                (second subQuery) agentTimeExpression worldTimeExpression
                contextExpression nil) ))
	    (:ceases
	     (unless worldTimeExpression
	       (grumble ":CEASES in a generator that is not in the scope of an :AT-WORLD-TIME"))
	     (let ((*worldTimeSuffix* '-))	; Fix up for generating values at a particular time.  Filtered later.
	       (declare (special *worldTimeSuffix*))
	       (help-collect-generators-for-variable 
                (second subQuery) agentTimeExpression worldTimeExpression
                contextExpression nil) ))
	    ((:the :some)
	     (when (eq (second subQuery) *variable*)
	       (collect-domain-generator
		 (implied-domain (third subQuery)) agentTimeExpression contextExpression)))
	    ((:at-least :exactly)
             (when (and (eq (second subQuery) *variable*)
                        (not (or (question-mark-variable-p (third subQuery))
                                 (zerop (third subQuery))))    ; TAR 8/11/93
			(not (question-mark-variable-p (fourth subQuery)))) ; TAR 3/20/97
               (collect-domain-generator
                (implied-domain (fourth subQuery)) agentTimeExpression contextExpression)))
            (:same-as
	     (when (or (eq (second subQuery) *variable*)
		       (eq (third subQuery) *variable*))
	       (create-new-generator-entry)
	       (compute-equivalence-generator generatorEntry))
             (when (search-tree-p *variable* (rest subQuery))
               (loop for subSubQuery in (rest subQuery)
                     when (and (consp subSubQuery)
			       (neq (car subSubQuery) 'quote))
                     do (help-collect-generators-for-variable
                         subSubQuery agentTimeExpression worldTimeExpression
                         contextExpression t))))
            (:within-world
             (when (eq (second subQuery) *variable*)
                (collect-domain-generator
                 (loom-constant CONTEXT) agentTimeExpression contextExpression))
             (help-collect-generators-for-variable 
              (third subQuery) agentTimeExpression worldTimeExpression 
              (cons (second subQuery) nil) nil))
            (:within-theory
              (when (eq (second subQuery) *variable*)
                (collect-domain-generator
                 (loom-constant CONTEXT) agentTimeExpression contextExpression))
              ;; LET BINDING HERE for *DOMAINGENERATORS*?
              (if (question-mark-variable-p (second subQuery))
                (help-collect-generators-for-variable 
                 (third subQuery) agentTimeExpression worldTimeExpression 
                 (cons (second subQuery) t) nil)
                (if (quoted-p (second subQuery))
                  (within-context (second (second subQuery))
                    (help-collect-generators-for-variable 
                     (third subQuery) agentTimeExpression worldTimeExpression 
                     (cons (second subQuery) t) nil))
                  (within-context (second subQuery)
                    (help-collect-generators-for-variable 
                     (third subQuery) agentTimeExpression worldTimeExpression 
                     (cons (second subQuery) t) nil)))))
;;  Removed 10/2/96  -- Allows generators to appear outside scope of the 
;;                      :collect / :set-of variables.  (oops!)
;            ((:collect :set-of)         ;  TAR 4/7/95
;             (unless (if (consp (second SubQuery))
;                       (member *variable* (second subQuery))
;                       (eq (second subQuery) *variable*))
;	       (if (consp (second SubQuery))
;		   (loop for v in (second subQuery) do (pushnew v *freeVariables*))
;		   (pushnew (second subQuery) *freeVariables*))
;               (help-collect-generators-for-variable
;                (third subQuery) agentTimeExpression worldTimeExpression
;                contextExpression nil)))

	    (otherwise
	     ;;don't collect generators or domains inside of :or, :forall, :fail,
	     ;;   :all, :at-most, or :not:
	     ;; TO DO: FIGURE OUT HOW TO COLLECT DISJUNCTIVE GENERATOR FOR :or:
	     nil))
	  ;; atomic predicate:
	  (let ((predicate (first subQuery)))
            (when (eq predicate *variable*)     ;  TAR 8/9/94
              (collect-domain-generator (case (if functionP 
                                                (1+ (length subQuery))
                                                (length subQuery))
                                          (2 (loom-constant CONCEPT))
                                          (3 (loom-constant BINARY-RELATION))
                                          (t (loom-constant RELATION)))
                                        agentTimeExpression 
                                        contextExpression))
	    (cond
;;           ((question-mark-variable-p predicate) nil)      ;  TAR 2/13/95 ;17
	     ((property-p predicate)	; TAR 8/12/93
               (when (and (eq *variable* (second subQuery))
                          (implied-domain predicate))   ;  TAR 3/11/96
                 (collect-domain-generator (implied-domain predicate)
                                           agentTimeExpression
                                           contextExpression)))
	      ((and (member *variable* (rest subQuery))
;; THIS TEST WITH THE CALL TO "generator-predicate-p" BUT WITHOUT THE GARBAGE BELOW
;;    IT IS TOO CONSERVATIVE.  I HAVE COMMENTED IT OUT UNTIL SUCH TIME AS WE 
;;    (RE)DISCOVER WHAT FUNCTION THE TEST ACTUALLY PROVIDES:  RMM 5/21/93
;		    (or (question-mark-variable-p predicate)
;			(generator-predicate-p predicate)
;                        ;; KLUDGE: "compute-binary-relation-generator" KNOWS
;                        ;;    HOW TO DEAL WITH PARTIALLY SEALED RELATIONS:  RMM 5/20/93
;                        (and (binary-p predicate)
;                             (loop for ftr in (computed-features predicate)
;                                   thereis (eq (feature-type ftr) :satisfies))
;                             (boundp '*unsealedRelationPredicates*)
;	                     (not (get (predicate-symbol predicate)
;                                       :loom-compiled-predicate))))
		    (or (not *closedGeneratorsOnlyP*)
			(and (not (question-mark-variable-p predicate))
			     (concept-is-closed-p predicate))
			(and (eq *closedGeneratorsOnlyP* :permit-open-roles)
			     (= (length subQuery) 3))))
	       (create-new-generator-entry)
	       (cond
		 ((question-mark-variable-p predicate)
		  (compute-run-time-generator generatorEntry)
		  (collect-domain-generator *thing*              ; TAR 3/20/97
					    agentTimeExpression
					    contextExpression))
		 ((concept-p predicate)
		  (compute-concept-generator generatorEntry))
		 ((binary-p predicate)
		  (compute-binary-relation-generator generatorEntry)
		  (unless (temporal-p predicate)
		    (setf (generator-world-time-expression generatorEntry) nil)))
		 (t
		  (compute-n-ary-relation-generator generatorEntry)))
               ;; When the form is functional, then we can't use it as a 
               ;;   generator because some arguments are missing.  We still
               ;;   run the code above in order to get possible domain 
               ;;   generators, but then we disable any non-domain generator:
               (when functionP          ;  TAR 8/22/94
                 (setf (generator-type generatorEntry) :non-existent)))
	      ;; "predicate" is not a generator, but perhaps we can find a
	      ;;     domain generator from a functional form:
              ((search-tree-p *variable* (rest subQuery))       ;  TAR 8/9/94
               (loop for subSubQuery in (rest subQuery)
                     when (and (consp subSubQuery)
			       (neq (car subSubQuery) 'quote))
                     do (help-collect-generators-for-variable
                         subSubQuery agentTimeExpression worldTimeExpression
                         contextExpression t)))
	      (t nil)))) )))

(defun collect-temporal-generators-for-variable
           (subQuery agentTimeExpression worldTimeExpression contextExpression)
  ;; Helping function for "help-collect-generators-for-variable";
  ;; Recursively scan the terms in "subQuery", and collect into
  ;;    *generatorEntries* a list of generator entries for the variable
  ;;    *variable*;
  ;; These generators are marked by having :becomes or :ceases as their
  ;;    head operator or at the top level of an :and construction.  They
  ;;    may also include forms that include :and or :or inside the :becomes.
  ;;    These forms are more complicated and need additional scanning;
  ;; These generators are marked by having :detects or :undetects as their
  ;;    head operator or at the top level of an :and construction;
  ;; Also add a domain generator of (loom-constant NUMBER) in order to 
  ;;    pre-empt using *THING* as a generator concept!
  ;; TO DO: FIGURE OUT HOW TO MAKE USE OF A ROLE GENERATOR FOR TIMES!
  (declare (special *variable* *generatorEntries* *worldTimeSuffix*))
  (when (atom subQuery)
    (return-from collect-temporal-generators-for-variable nil))
  (let (generatorEntry)
    (labels ((create-new-generator-entry () 
                (setq generatorEntry
		      (create-generator-entry
			:generator-term (second subQuery)
			:generator-agent-time-expression agentTimeExpression
			:generator-world-time-expression  (when worldTimeExpression
							    (list *worldTimeSuffix*
								  worldTimeExpression))
                        :generator-context contextExpression))
		(setf (generator-type generatorEntry) (first subQuery))
		(push generatorEntry *generatorEntries*)) 
	     (contains-free-variable-p (queryTerm)
                (declare (special *freeVariables*))
		(loop for variable in (collect-free-variables queryTerm)
		      thereis (member variable *freeVariables*)))
	     (compute-temporal-generator ()
                ;; Situation: The generator is a temporal transition;
                ;; Compute values for the slot "(generator-cardinality generatorEntry)";
                ;; TO DO:  FIGURE OUT IF THIS IS ALREADY ACCOUNTED FOR HIGHER UP IN THE OPTIMIZE
		;;         CODE.  WHAT THIS TRIES TO DO IS BIAS AWAY FROM TEMPORAL GENERATORS THAT
		;;         HAVE UNBOUND VARIABLES IN THEM!
		;; IT ALSO ADDS A NEW GENERATOR WHICH DOESN'T NEED THE VARIABLE!
                (let ((generatorTerm (generator-term generatorEntry)))
		  (cond ((user-designated-generator-p generatorTerm)
			 (setf (generator-cardinality generatorEntry)
			       $CARDINALITY-MEDIUM$))
			((keywordp (first generatorTerm))	; A complicated query
			 (setf (generator-cardinality generatorEntry)
			       $CARDINALITY-HUGE$)
			 (create-new-generator-entry)
			 (setf (generator-cardinality generatorEntry)
			       $CARDINALITY-HUGE$
			       (generator-type generatorEntry)	; type change! TAR 3/29/93
			       :world-transition))
			;; CHECK: DOES THIS REALLY APPLY?  SINCE WE NEED TO BACK-CHAIN, THIS SHOULD
			;; MAYBE BE CHANGED TO MAKING SURE THAT THE CONCEPT OR RELATION IS NOT A
			;; VARIABLE?
			((contains-free-variable-p generatorTerm)	; Prefer non-variable generator
			 (setf (generator-cardinality generatorEntry)
			       $CARDINALITY-X-LARGE$)
			 ;; When a free variable exists, it must either be bound when a :becomes
			 ;; or :ceases generator is used, or we must fall back on using a generic
			 ;; and less efficient :world-transitions generator.  This code sets up the
			 ;; second option.  The generator sequencer determines which case applies.
			 ;; Flexiblity is added by also including generators for the inverse relation
			 ;; in this case.
			 (create-new-generator-entry)
			 (setf (generator-cardinality generatorEntry)
			       (+ $CARDINALITY-X-LARGE$ 1)
			       (generator-type generatorEntry)	; type change! TAR 10/29/92
			       :world-transition)
			 (when (and (= (length generatorTerm) 3)	; TAR 5/6/93
				    (typep (first generatorTerm) 'binary-relation)
				    (inverse (first generatorTerm))
				    (question-mark-variable-p (second generatorTerm))
				    (not (question-mark-variable-p (third generatorTerm))))
			   (let ((inverseTerm `(,(inverse (first generatorTerm))
						,(third generatorTerm)
						,(second generatorTerm))))
			     (create-new-generator-entry)
			     (setf (generator-cardinality generatorEntry)
				   $CARDINALITY-LARGE$
				   (generator-term generatorEntry)
				   inverseTerm)
			     (create-new-generator-entry)
			     (setf (generator-cardinality generatorEntry)
				   (+ $CARDINALITY-X-LARGE$ 2)
				   (generator-term generatorEntry)
				   inverseTerm
				   (generator-type generatorEntry)	; type change!
				   :world-transition) )))
			 (t (if (and (= (length generatorTerm) 2)    ; Check for "Widow-like" generator
                                     (typep (first generatorTerm) 'unary-concept)
                                     (loop for d in (temporal-depend-ons (first generatorTerm))
                                           thereis (consp d)))
			      (setf (generator-cardinality generatorEntry)
				    (+ $CARDINALITY-LARGE$ 2))
                              (setf (generator-cardinality generatorEntry)
                                    $CARDINALITY-LARGE$)))) )))
      (collect-domain-generator
       (loom-constant NUMBER) '*agent-time* nil)
      (if (keywordp (car subQuery))
	  (case (first subQuery)
	    (:and
	     (loop for term in (cdr subQuery)
		  do
		  (collect-temporal-generators-for-variable
                   term agentTimeExpression worldTimeExpression contextExpression)))
	    ((:detects :undetects)
	     (when (null agentTimeExpression)
	       (create-new-generator-entry)
	       (compute-temporal-generator)))
	    ((:becomes :ceases)
	     (when (null worldTimeExpression)
	       (create-new-generator-entry)
	       (compute-temporal-generator)))
	    (otherwise
	     ;;don't collect generators or domains inside of anything else
	     nil))
	  ;; atomic predicate:
	  nil) )))


(defun collect-domain-generator (domainConcept temporalExpression contextExpression)
  ;; Helping function for "help-collect-generators-for-variable";
  ;; Push "domainConcept" onto the list of domain concepts being
  ;;    collected for *variable*;
  ;; TO DO: ALLOW DOMAIN GENERATOR THAT IS IN A DIFFERENT CONTEXT (ie, WHEN
  ;;     "contextExpression" IS NOT NIL.)
  (declare (special *domainGenerators* *closedGeneratorsOnlyP*))
  (when (and (eq temporalExpression '*agent-time*)
             (null contextExpression)
	     (or (not *closedGeneratorsOnlyP*) ; tar 6/9/93
		 (concept-is-closed-p domainConcept)))
    (if (temporal-p domainConcept)	; tar 2/4/99
	(pushnew *thing* *domainGenerators*)
      (pushnew domainConcept *domainGenerators*))) )


(defun compute-concept-generator (generatorEntry)
  ;; Called by "help-collect-generators-for-variable";
  ;; Situation: The generator is a concept;
  ;; Compute values for the slots "(generator-type generatorEntry)" and
  ;;    "(generator-cardinality generatorEntry)";
  (let* ((generatorTerm (generator-term generatorEntry))
         (concept (first generatorTerm)))
    (setf (generator-type generatorEntry)
          ;; BUG:??? THIS LOOKS LIKE IT WILL IMPROPERLY PROHIBIT RECURSIVELY
          ;;    DEFINED CONCEPTS.  SEE "compute-binary-relation-generator" FOR
          ;;    HOW THOSE CASES CAN BE HANDLED (ITS MESSY):
          (if (generator-predicate-p concept)
            :concept
            :non-existent))
    (when (or (and (eq (generator-type generatorEntry) :non-existent) ;; RMM 2/11/94
                   (not (subconcept-p concept (loom-constant NON-LOOM-THING))))
              ;; Last resort generator for temporal concepts -- 3/22/93 tar
              ;;    This allows generation in the absence of a bound world
              ;;    time variable;
              (temporal-p concept))
      (collect-domain-generator
       *thing* '*agent-time* (generator-context generatorEntry)))
    (when (not (temporal-p concept))
      (setf (generator-world-time-expression generatorEntry) nil))
    (setf (generator-cardinality generatorEntry)
	  (cond
           ((user-designated-generator-p generatorTerm)
            $CARDINALITY-MEDIUM$)
	   ((question-mark-variable-p concept)
	    $CARDINALITY-LARGE$)
           ((temporal-p concept)	; Prefer non-temporal TAR 12/16/92
            $CARDINALITY-X-LARGE$)
           ((eq concept *thing*)
            $CARDINALITY-HUGE$)
	   ((eq (name (context concept)) 'built-in-theory)
	    $CARDINALITY-X-LARGE$)      ; Prefer lower context concepts TAR 7/24/97
	   ((eq (defined-as concept) :set)
	    ;; This should always return a computed set cardinality because
	    ;;   of the call to 'generator-predicate-p' above, but we include
	    ;;   the default of infinity cardinality just to be safe. TAR 10/31/96
	    (or (and (defined-set-feature concept)
		     (compute-set-cardinality (defined-set-feature concept)))
		$CARDINALITY-INFINITE$))
           (t
            $CARDINALITY-LARGE$))) ))


(defun compute-binary-relation-generator (generatorEntry)
  ;; Called by "help-collect-generators-for-variable";
  ;; Situation: The generator is a binary relation;
  ;; Compute values for the slots "(generator-type generatorEntry)" and
  ;;    "(generator-cardinality generatorEntry)";
  ;; Semi-tricky: If we cannot determine whether a particular referenced
  ;;    relation can be a role generator, we post it and the relation being
  ;;    sealed to *undecidedRolePTable*, and assume it can be a role generator.
  ;;    At the end of sealing, this decision is reviewed -- if the assumption
  ;;    is not correct, the access function or predicate is reoptimized;
  (declare (special *variable* *undecidedRolePTable* *codeObjectBeingSealed*))
  (let* ((generatorTerm (generator-term generatorEntry))
	 (relation (first generatorTerm))
	 (domain (implied-domain relation))
	 (range (implied-range relation))
	 (inverseRelation (and (third generatorTerm) (inverse relation))) ; Can't use inverse of functional terms!
	 usedInverseIndexP generatorRelation otherArgument)
    (labels
      ((generator-relation-p (relation)
	 (let ((predicateSymbol (predicate-symbol relation)))
           (ensure-sealed-predicate relation)
	   (cond
	    ((compiled-generator-p relation))
	    ((get predicateSymbol :loom-compiled-predicate)
	     nil)
	    ((boundp '*undecidedRolePTable*)
             (integrity-check (boundp '*codeObjectBeingSealed*))
             ;; we are in the middle of sealing -- guess that there is a
             ;;    generator, and recheck that guess later on:
	     (let ((oldCons (assoc relation *undecidedRolePTable*)))
               (if oldCons
                 (pushnew *codeObjectBeingSealed* (cdr oldCons))
                 (push (list relation *codeObjectBeingSealed*)
                       *undecidedRolePTable*)))
             t)
            ((member :unsealed-predicate (system-attributes relation))
             (warn "Unable to compile a predicate for the relation ~S"
                   relation)
             nil)
            (t nil))))
       (compute-place2-generator-type ()
	 ;; Based  on the indexing for "relation", set "generator-type" to the
	 ;;    appropriate  value, and indicate whether or not we indexed on the
	 ;;    inverse of "relation";
	 (setf (generator-type generatorEntry)
               ;; TO DO: ELIMINATE THE (tuple-index relation) TEST -- ITS UNRELIABLE:
	       (or (cond
		     ((tuple-index relation)
		      (if (hashed-relation-p relation)
			  :hashed-tuple-relation
			  :scanned-tuple-relation))
		     ((generator-relation-p relation)
		      :role))
		   (and inverseRelation
			(tuple-index inverseRelation)
			(progn
			  (setq usedInverseIndexP t)
			  :scanned-tuple-relation))
		   :non-existent)))
       (compute-place1-generator-type ()
	 ;; Based  on the indexing for "relation", set "generator-type" to the
	 ;;    appropriate  value, and indicate whether or not we indexed on the
	 ;;    inverse of "inverseRelation";
	 (setf (generator-type generatorEntry)
	       (or (and inverseRelation
			(cond
			  ((tuple-index inverseRelation)
			   (if (hashed-relation-p relation)
			       :hashed-tuple-relation
			       :scanned-tuple-relation))
			  ((generator-relation-p inverseRelation)
			   (setq usedInverseIndexP t)
			   :role)))
		   (when (tuple-index relation) 
		     (setq usedInverseIndexP t)
		     :scanned-tuple-relation)
		   :non-existent))))
      (if (eq (third generatorTerm) *variable*) 
	  (progn
	    (compute-place2-generator-type)
	    (setq generatorRelation relation)
	    (when usedInverseIndexP
	      (setf (inverse-generator-p generatorEntry) t)
	      (setq generatorRelation inverseRelation))
	    (collect-domain-generator
	      range 
              (generator-agent-time-expression generatorEntry)
              (generator-context generatorEntry))
	    (setq otherArgument (second generatorTerm))
	    (when (eq otherArgument *variable*) ;  TAR 12/6/94
	      ;; We have an (R ?x ?x) form
	      (collect-domain-generator
	       domain 
	       (generator-agent-time-expression generatorEntry)
	       (generator-context generatorEntry))))
	  (progn  ;; (eq (second generatorTerm) *variable*)
	    (compute-place1-generator-type)
	    (setq generatorRelation inverseRelation)
	    (when usedInverseIndexP
	      (setf (inverse-generator-p generatorEntry) t)
	      (setq generatorRelation relation))
	    (collect-domain-generator
	      domain 
              (generator-agent-time-expression generatorEntry)
              (generator-context generatorEntry))
	    (setq otherArgument (third generatorTerm))))
      ;; now compute the expected cardinality:
      (setf (generator-cardinality generatorEntry)
	    (case (generator-type generatorEntry)
	      (:role
	       (cond
		 ((temporal-p generatorRelation)  ; Prefer non-temporal TAR 12/16/92
		  $CARDINALITY-MEDIUM$)
		 ((and (relation-is-single-valued-p generatorRelation)
		       (functional-role-chain-p otherArgument))
		  $CARDINALITY-ONE$)
                 ((recursive-p generatorRelation)
                  ;; prefer a non-recursive generator to a recursive one, but
                  ;; prefer a role generator to a concept generator
                  (1- $CARDINALITY-LARGE$))
		 (t
		  $CARDINALITY-SMALL$)))
	      ((:scanned-tuple-relation :hashed-tuple-relation)
	       (if (and (relation-is-single-valued-p generatorRelation)
			(functional-role-chain-p otherArgument))
		   $CARDINALITY-ONE$
		   $CARDINALITY-MEDIUM$)))) )))


(defun compute-n-ary-relation-generator (generatorEntry)
  ;; Called by "help-collect-generators-for-variable";
  ;; Situation: The generator is an n-ary relation;
  ;; Computed values for the slots "(generator-type generatorEntry)" and
  ;;    "(generator-cardinality generatorEntry)";
  (declare (special *variable* *undecidedRolePTable* *codeObjectBeingSealed*))
  (let* ((generatorTerm (generator-term generatorEntry))
	 (relation (first generatorTerm))
	 (generatesLastArgumentP (eq (car (last generatorTerm)) *variable*)))
    (flet ((generates-single-value-p ()
	     (and generatesLastArgumentP
		  (relation-is-single-valued-p relation)
		  (loop for arg in (butlast (cdr generatorTerm))
		       always (functional-role-chain-p arg)))))
      (cond
	((and (fboundp (predicate-symbol relation)) ; was (compiled-generator-p relation)
	      generatesLastArgumentP)
	    ;; Need to split the code in "compiled-generator-p" into two parts;
	 (setf (generator-type generatorEntry) :computed-relation)
	 (when (eq (symbol-function (predicate-symbol relation))
		   *dont-call-function*)
	    (integrity-check (and (boundp '*undecidedRolePTable*)
				  (boundp '*codeObjectBeingSealed*)))
            (let ((oldCons (assoc relation *undecidedRolePTable*)))
              (if oldCons
                (pushnew *codeObjectBeingSealed* (cdr oldCons))
                (push (list relation *codeObjectBeingSealed*)
                      *undecidedRolePTable*)) ))
	 (setf (generator-cardinality generatorEntry)
	       (if (generates-single-value-p)
		   $CARDINALITY-ONE$
		   $CARDINALITY-SMALL$)))
     ;; REPLACE (null (tuple-index relation)) BY CHECK FOR :hashed ATTRIBUTE:	
	((and (null (tuple-index relation))    ; not a :hashed-tuple-relation
              (read-only-p relation))
	 (setf (generator-type generatorEntry) :non-existent)
	 (return-from compute-n-ary-relation-generator nil))
	(t
	 (setf (generator-type generatorEntry)
	       (if (and generatesLastArgumentP
			(hashed-relation-p relation))
		   :hashed-tuple-relation
		   :scanned-tuple-relation))
	 (setf (generator-cardinality generatorEntry)
	   (cond ((generates-single-value-p)
		  $CARDINALITY-ONE$)
		 ((recursive-p relation)
		  (1- $CARDINALITY-LARGE$))
		 (t
		   $CARDINALITY-MEDIUM$)))))
        (loop for domain in (implied-domain relation)   ;  TAR 8/22/94
              as form in (cdr generatorTerm)
              when (eq form *variable*)
              do (collect-domain-generator 
                  domain
                  (generator-agent-time-expression generatorEntry)
                  (generator-context generatorEntry)))
        (when generatesLastArgumentP
          (collect-domain-generator 
                  (implied-range relation)
                  (generator-agent-time-expression generatorEntry)
                  (generator-context generatorEntry))) )))

(defun compute-run-time-generator (generatorEntry)
  ;; Situation: We have encountered a variable in place of a reference
  ;;    to a predicate object;
  ;; Guess at values for the slots "(generator-type generatorEntry)" and
  ;;    "(generator-cardinality generatorEntry)";
  (case (length (generator-term generatorEntry))
    (2
     (setf (generator-type generatorEntry) :concept)
     (setf (generator-cardinality generatorEntry) $CARDINALITY-SMALL$))
    (3 
     (setf (generator-type generatorEntry) :role)
     (setf (generator-cardinality generatorEntry) $CARDINALITY-SMALL$))
    (otherwise
     ;; kludge:  marking this as a :computed-relation forces call to
     ;;    "form-generator-code" (avoiding tuple scan) which eventually expands
     ;;    to call to "run-time-apply-function":
     (setf (generator-type generatorEntry) :computed-relation)
     (setf (generator-cardinality generatorEntry) $CARDINALITY-SMALL$))) )
	    
(defun compute-equivalence-generator (generatorEntry)
  ;; Called by "help-collect-generators-for-variable";
  ;; Finish computing the slots for the equivalence generator term
  ;;    "generatorEntry" for *variable*;
  (declare (special *variable*))
  (let* ((generatorTerm (generator-term generatorEntry))
	 (otherArgument
	   (if (eq (second generatorTerm) *variable*)
	       (third generatorTerm)
	       (second generatorTerm))))
    (setf (generator-type generatorEntry) :equivalence)
    (setf (generator-cardinality generatorEntry)
	  (if (or (atom otherArgument)
		  (functional-role-chain-p otherArgument))
	      $CARDINALITY-ONE$
	      $CARDINALITY-SMALL$)) ))

(defun functional-role-chain-p (term)
  ;; Return t if "term" is a role chain composed of functional predicates;
  ;; Called by "compute-equivalence-generator", "compute-binary-relation-generator"
  ;;    and "compute-n-ary-relation-generator";
  ;; Assumes syntactically that "term" is an atom or a role chain;
  (or (atom term)
      (and (relation-p (first term))
	   (relation-is-single-valued-p (first term))
	   (functional-role-chain-p (second term)))) )

(defun user-designated-generator-p (term)
  ;; Return t if "term" was specified in the :generators option for the
  ;;    current query;
  (declare (special *userDesignatedGenerators*))
  (member term *userDesignatedGenerators* :test #'equal) )

;;; TO DO:

#|

==> ADD CODE TO DISCARD GENERATOR STRUCTS

|#
