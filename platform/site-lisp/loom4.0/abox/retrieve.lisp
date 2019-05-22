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

;;; RETRIEVE.LISP (ABOX)

(in-package "LOOM")

(export '( retrieve ask find-all find-the fretrieve fask do-retrieve
           get-matching-instances query))


  ;;
;;;;;; Database Query Interface
  ;;

;;; TO DO: ADD TEST TO DETERMINE WHEN *query-clean-up-instances* CODE
;;;    IS UNNECESSARY.

(defmacro retrieve (outputVariables query &key context kb generators)
   "Create a Lisp form corresponding to the logical expression `query',
      and evaluate it against the current context;
      Return the relation indicated by `outputVariables'"
  (obsolete-argument retrieve kb context #'make-get-context-from-kb)
  (wrap-with-query-clean-up-instances-code
    (form-query outputVariables query :context context :generators generators)
    :context context) )

(defmacro ask (query &key context kb generators 3-valued-p)
  "Create a Lisp predicate corresponding to the logical expression `query',
       and evaluate it against the current knowledge base;
       Return T or NIL"
  (obsolete-argument ask kb context #'make-get-context-from-kb)
  (let ((formedQuery (form-query nil query :context context
				 :generators generators))
	(formedNegativeQuery (when 3-valued-p
			       (form-query nil `(:not ,query)
					   :context context
					   :generators generators))))
    (wrap-with-query-clean-up-instances-code
     (if 3-valued-p			; Constant Optimizations ; tar 6/7/93
	 (cond ((eql formedQuery t) :true)
	       ((eql formedNegativeQuery t) :false)
	       (t `(cond (,formedQuery :true)
		         (,formedNegativeQuery :false)
		         (t :unknown))))
	 (cond ((eql formedQuery t) t)
	       ((eql formedQuery nil) nil)
	       (t `(when ,formedQuery t))))
     :context context) ))

(defmacro find-all (term &key context kb)
  "Create a Lisp form corresponding to the logical term `term', and
     evaluate it against the current context;
     Return a list of  values of `term'."
  (obsolete-argument find-all kb context #'make-get-context-from-kb)
  (wrap-with-query-clean-up-instances-code
    `(retrieve ?x (:same-as ?x ,term):context ,context)
    :context context) )

(defmacro find-the (term &key context kb)
  "Create a Lisp form corresponding to the logical term `term', and
     evaluate it against the current context;
     Return the unique value for `term'."
  (obsolete-argument find-the kb context #'make-get-context-from-kb)
  (flet ((single-valued-term-p
	   ()
	   (let ((relation (get-sealed-relation (first term) :context context)))
	     (and relation
		  (relation-is-single-valued-p relation)
		  (loop for arg in (cdr term)
		       always (atom arg))))))
  (wrap-with-query-clean-up-instances-code
    `(,(if (single-valued-term-p)
	   'car
	   'check-the-role-value )
       (retrieve ?x (:same-as ?x ,term) :context ,context))
    :context context) ))

;;; "fretrieve" AND "fask" ARE OBSOLETE (UNLESS WE THINK OF A *FAST* BUT
;;      UNSAFE MEANS FOR EVALUATING QUERIES)
(defmacro fretrieve (outputVariables query &key context kb generators)
   "Create a Lisp form corresponding to the logical expression `query',
      and evaluate it against the current context;
      Return the relation indicated by `outputVariables'"
  (obsolete-argument fretrieve kb context #'make-get-context-from-kb)
  (wrap-with-query-clean-up-instances-code
    (form-query outputVariables query :context context :generators generators)
    :dont-seal-or-revise-p t
    :context context) )

(defmacro fask (query &key context kb generators 3-valued-p)
  "Create a Lisp predicate corresponding to the logical expression `query',
       and evaluate it against the current context;
       Return T or NIL"
  (obsolete-argument fask kb context #'make-get-context-from-kb)
  (wrap-with-query-clean-up-instances-code
    (if 3-valued-p
	`(cond
	   (,(form-query nil query :context context :generators generators)
	    :true)
	   (,(form-query nil `(:not ,query) :context context :generators generators)
	    :false)
	   (t :unknown))
	`(when ,(form-query nil query :context context :generators generators)
	   t))
    :dont-seal-or-revise-p t
    :context context) )

(defmacro execute-query (&rest lispQueryForms)
  ;; Expand to code that wraps query declarations around "query";
  (wrap-with-query-clean-up-instances-code
    `(progn ,@lispQueryForms)
    :dont-seal-or-revise-p t) )

(defmacro execute-strict-query (&rest lispQueryForms)
  ;; Expand to code that wraps query declarations around "query";
  (wrap-with-query-clean-up-instances-code
    `(progn ,@lispQueryForms)
    :dont-seal-or-revise-p t
    :default-mode-p nil) )

(defun wrap-with-query-clean-up-instances-code (query &key context dont-seal-or-revise-p (default-mode-p t))
  ;; Helping function for "retrieve", "ask", "fretrieve", and "fask";
  ;; Wrap code around "query" that declares special variables needed during
  ;;    the query, and calls a clean-up function afterwards to discard any
  ;;    backchaining summaries generated during the query;
  ;; If "dont-seal-or-revise-p", leave out code that triggers recognition and/or
  ;;    sealing to ensure an up-to-date consistent KB;
  ;; If "default-mode-p", then make call in default mode (the normal situation),
  ;;    otherwise make it in strict mode.  Note that this value is evaluated at
  ;;    macroexpansion time!
  ;; Slightly tricky: Placing the call to "clean-up-after-query" outside of
  
  ;;    test for nested queries;
  ;; TO DO: ADD LOGIC TO DETERMINE SITUATIONS WHEN A CLEAN-UP WRAPPER
  ;;    IS NOT NEEDED (E.G., WHEN NO :at-least, :all, ETC. FORMS ARE
  ;;    PRESENT (RECURSIVELY));
  ;; tar 6/7/93  Add constant optimizations.
  (let ((code (if dont-seal-or-revise-p
		  `(let ((*defaultModeP* ,(if default-mode-p t nil)))
		     (declare (special *defaultModeP*))
		     ,query)
		  `(progn (ensure-visibility-of-updates)
			  (let ((*defaultModeP* ,(if default-mode-p t nil)))
			    (declare (special *defaultModeP*))
			    ,query )))))
		  
    (cond ((null query) nil)		
	  ((eql query t) t)
	  ;; BUG: ASSUMES THAT "context" CAN BE EVALUATED AT RUN-TIME TOO:
	  (context `(within-context ,context ,code))
	  (t code)) ))

(defmacro do-retrieve (iterationVariables query &body body)
  ;; Retrieve into the local variables "iterationVariables", using
  ;;    "query" as a generator;
  ;; Evaluate "body" once for each set of variable bindings;
  ;; TO DO: REWRITE THIS SO THAT EVALUATION IS *LAZY*, I.E., SO
  ;;    THAT A RETURN IN THE MIDDLE AVOIDS GENERATING THE REMAINDER
  ;;    OF THE TUPLES;
  (let ()
    (if (listp iterationVariables)
	`(let (,@iterationVariables)
	   (loop for tuple in (retrieve ,iterationVariables ,query)
		do
		,@(loop for v in iterationVariables
		       as i from 0
		       collect `(setq ,v (nth ,i tuple)))
		,@body))
	`(loop for ,iterationVariables in (retrieve ,iterationVariables ,query)
	      do
	      ,@body)) ))

;; OBSOLETE:
;#+CLTL2 (declaim (inline within-top-level-query-p))
;#-CLTL2 (proclaim '(inline within-top-level-query-p))
;(defun within-top-level-query-p ()
;  ;; Return t if at the time of this call we are inside of a top-level
;  ;;    query;
;  ;; Note: Only called by "new-time-stamp", inside of integrity check;
;  (boundp '*query-clean-up-instances*) )


  ;;
;;;;;; Query Formation
  ;;

(defun form-query (outputVariables query 
		   &key context generators dont-seal-network-p 
		   embedded-p starting-tuples)
  ;; Return three values:
  ;;    (1) Either a Lisp form which evaluates the semantics of "query", or
  ;;        the normalized form of "query"; and
  ;;    (2) If normalize-only-p, a list of top-level existential variables; and
  ;;    (3) A list of concepts and relations referenced within "query";
  ;; Normalize the relational query "query"; 
  ;; Find optimal generator sequence, and generate query code;
  ;; Note: "form-query" code generates either a list of objects or a list of
  ;;    tuples depending on whether or not "outputVariables" is an atom or a list;
  ;; Caution: "form-query" interprets all unbound variables in "query" not
  ;;    belonging to "outputVariables" to be constants (input variables);
  (let ((queryPicture (if outputVariables
			  `(retrieve ,outputVariables ,query)
			  `(ask ,query)))
	(*dontSealNetworkP* dont-seal-network-p)
	*predicateReferences*
        freeVariables inputVariables normalizedQuery unusedVars)
    (declare (special *queryPicture* *dontSealNetworkP* *predicateReferences*))
    (within-context (coerce-to-context context)
      (setq freeVariables (collect-free-variables query :validate-keyword-p t))
      ;; compute "inputVariables" BEFORE normalization generates additional
      ;;    unbound existential variables:
      (setq inputVariables
	    (set-difference freeVariables (list-of outputVariables)))
      (when (setq unusedVars              ;  TAR 6/13/95
                  (loop for var in (list-of outputVariables)
	                when (and (symbolp var) (not (member var freeVariables)))
                        collect var))
        (warn "The output variable~P ~{~S~^, ~} not referenced within this ~
               query:~%   ~S" (length unusedVars) unusedVars queryPicture)
        (return-from form-query nil))
      (setq normalizedQuery (normalize-query query :query-picture queryPicture))
      (when normalizedQuery
        (form-query-code outputVariables normalizedQuery inputVariables
                         :generators generators :query-picture queryPicture
                         :embedded-p embedded-p :starting-tuples starting-tuples))) ))

(defun normalize-query (query &key expand-agent-time-transitions-p query-picture)
  ;; Return two values:
  ;;    (1) A normalized version of "query";
  ;;    (2) A list of concepts and relations referenced within "query";
  ;; Note: The special variable *predicateReferences* is filled inside of
  ;;    "forcing-get-predicate" (during validation);
  (let ((*expandAgentTimeTransitionsP* expand-agent-time-transitions-p)
	(*queryPicture* query-picture)
	*predicateReferences*)
    (declare (special *expandAgentTimeTransitionsP* *queryPicture* *predicateReferences*))
    (catch 'form-query-catcher
      (setq query (validate-query query))
      (setq query (simplify-wff query nil))
      (setq query (eliminate-top-level-existentials query))
      (return-from normalize-query 
	(values query *predicateReferences*)))
    nil ))

(defun form-query-code (outputVariables normalizedQuery inputVariables
			&key generators query-picture embedded-p starting-tuples)
  ;; Generate Lisp form representing optimized code for evaluating the
  ;;    query "normalizedQuery";
  ;; "embedded-p" indicates that the query is embedded inside of another, and
  ;;    hence outer-most declaration should not be wrapped around it;
  (labels ((recursive-query-p (expression)
	     ;; return t if "expression" references a recursive concept;
	     ;;    (not being used as an individual); 
	     (when (consp expression)
	       (or (and (typep (first expression) 'TBOX-CONCEPT)
			(recursive-p (first expression)))
		   (loop for item in (rest expression)
			thereis (recursive-query-p item))))))
    (let ((*userDesignatedGenerators* (loop for g in generators     ; TAR 12/17/96
					    collect (normalize-query g)))
	  (*queryPicture* query-picture) (*worldTimeSuffix* nil)
	  *letVariables* *queryContext* query)
      (declare (special *userDesignatedGenerators* *queryPicture* 
			*letVariables* *worldTimeSuffix* *queryContext*))
      (catch 'form-query-catcher
	(setq normalizedQuery
	      (expand-detects-clauses normalizedQuery))
 	(setq query 
	      (if (null outputVariables)
		  (form-ask-query normalizedQuery inputVariables)
		  (form-retrieve-query 
                   outputVariables normalizedQuery inputVariables 
                    starting-tuples nil)))
	(setq query (form-completed-query
		     query
		     :recursive-p (recursive-query-p normalizedQuery)
		     :embedded-p embedded-p))
	(return-from form-query-code query))
      nil )))


(defun form-completed-query (query &key recursive-p embedded-p)
  ;; Helping function for "form-query-code";
  ;; Return Lisp code representing a finalized version of "query";
  ;; If needed, wrap let bindings around "query", and add code to declare
  ;;    a goal table iff query is recursive;
  (declare (special *letVariables*))
  (let ((bindings (unless embedded-p (list '(*insideQueryP* t)))))
    (loop for entry in *letVariables*
	when (search-tree-p (third entry) query) ;RMM 4/7/92
	do (push (form-query-let-binding-clause entry t) bindings))
    (when (and recursive-p (not embedded-p))
      (push '(*queryGoalTable* (create-query-goal-table)) bindings)
      (push '(*memoizationTable* (make-hash-table :test #'equal)) bindings)
      (push '(*memoDependencies* (make-hash-table :test #'equal)) bindings)
      (push '(*pendingMemos* nil) bindings))
    (if bindings
	`(let ,bindings
	   ,@(when recursive-p
	       '((declare (special *queryGoalTable* *memoizationTable* 
				   *memoDependencies* *pendingMemos*))))
	   ,query)
	query) ))


;; The following macro and function declare the special variable *finalGenerators*,
;;    which is used by the query optimizer to find an optimal generator order.
(eval-when (compile load eval)
  (defmacro wrap-with-final-generators-declaration (body)
    ;; Declare *finalGenerators*, execute "body", discard generators, and
    ;;    return the value returned by "body";
    `(let (*finalGenerators*)
       (declare (special *finalGenerators*))
       (prog1
	 ,body
	 (discard-query-generators))) )
  ) ;; end "eval-when"

(defun discard-query-generators ()
  ;; Called by "form-ask-query" and "form-retrieve-query";
  ;; Recycle generator entries;
  (declare (special *finalGenerators*))
  (loop for generator in *finalGenerators*
       do (discard-generator-entry (cdr generator))))

(defun form-ask-query (normalizedQuery inputVariables)
  ;; Called by "form-query";
  ;; Return a form that evaluates "normalizedQuery" as a boolean formula;
  (let ((freeVariables
	  (set-difference (collect-free-variables normalizedQuery)
			  inputVariables))
        (*inputVariables* inputVariables))
    (declare (special *inputVariables*))
    (form-boolean-query 
      (if freeVariables
	  `(:exists , freeVariables ,normalizedQuery)
	  normalizedQuery)) ))

(defun form-retrieve-query (outputVariables normalizedQuery inputVariables 
                                            startingTuples allowDuplicatesP)
  ;; Called by "form-query-code" and "help-translate-collection-formula";
  ;; Return a Lisp form that generates bindings for the variables in "outputVariables"
  ;;    as specified in "normalizedQuery";
  ;; "inputVariables" are variables bound externally to the query;
  ;; "startingTuples" are used to initialize the tuple variable for the query.
  ;;     This feature is used by "form-non-primitive-generator-code" to add
  ;;     additional tuples that the query might miss.  Other callers should
  ;;     pass NIL;
  (declare (special *QueryPicture*))
  (flet ((help-form-retrieve-query (query)
	   (wrap-with-final-generators-declaration
	     (form-retrieve-conjunctive-query
	       outputVariables query inputVariables startingTuples allowDuplicatesP)))
         (test-disjunct-for-use-of-output-variables (disjunct)          ;  TAR 6/13/95
           (let* ((freeVars (collect-free-variables disjunct))
                  (unreferencedVars (loop for var in (list-of outputVariables)
                                          when (and (symbolp var)
                                                    (not (member var freeVars)))
                                          collect var)))
             (when unreferencedVars
	       (warn "The output variable~P ~{~S~^, ~} not referenced within ~
                      disjunct:~%   ~S~%inside query:~%   ~S"
                     (length unreferencedVars) unreferencedVars disjunct
                     *QueryPicture*)
	       (return-from form-retrieve-query nil)))) )
    (if (eq (first normalizedQuery) :or)
      (if allowDuplicatesP
        `(append ,@(loop for disjunct in (rest normalizedQuery)
                         do (test-disjunct-for-use-of-output-variables disjunct)
                         collect (help-form-retrieve-query 
                                  (eliminate-top-level-existentials disjunct))))
	`(fast-remove-duplicates 
          (append ,@(loop for disjunct in (rest normalizedQuery)
                          do (test-disjunct-for-use-of-output-variables disjunct)
			  collect (help-form-retrieve-query 
                                   (eliminate-top-level-existentials disjunct))))))
      (help-form-retrieve-query normalizedQuery)) ))

(defun form-retrieve-conjunctive-query 
       (outputVariables normalizedQuery inputVariables startingTuples
                        allowDuplicatesP)
  ;; Called by "form-retrieve-query";
  ;; Return a form which corresponds to "normalizedQuery", and contains 
  ;;    nested generator functions and restrictions;
  ;; The original order of the variables is preserved in "outputVariables";
  ;; Note: "freeVariables" combines output variables with any existential
  ;;    variables found during "lifting";
  (let* ((freeVariables
	   (set-difference (collect-free-variables normalizedQuery)
			   inputVariables))
	 (outputTupleForm (if (listp outputVariables)
			      `(list ,@outputVariables)
			      outputVariables))
	 (collectTuplesForm
	   `(push ,outputTupleForm resultTuples))
         (*inputVariables* inputVariables)
	 queryCode didntUseCollectTuplesFormP duplicateFreeP filterCode)
    (declare (special *inputVariables*))
    (flet
      ((maybe-wrap-with-duplicate-removal-code (code)
	 (cond
	   ((or allowDuplicatesP (and duplicateFreeP (not startingTuples)))
	    code)
	   ((consp outputVariables)
	    `(fast-remove-equal-duplicates ,code))
	   (t
	    `(fast-remove-duplicates ,code)))))
      ;; separate out fully-grounded terms:
      (multiple-value-bind (filterQuery residueQuery)
	  (extract-filter-query normalizedQuery freeVariables nil)
	(when filterQuery
	  (setq filterCode (form-boolean-query filterQuery))
	  (setq normalizedQuery residueQuery)))
      (multiple-value-setq (queryCode didntUseCollectTuplesFormP duplicateFreeP)
	(if normalizedQuery
	    (form-collection-query 
	      normalizedQuery outputVariables freeVariables collectTuplesForm)
	    (values `(list ,outputTupleForm) t t)))
      (when filterCode			; wrap with fully-grounded test
	(setq queryCode
	      `(when ,filterCode ,queryCode)))
      (maybe-wrap-with-duplicate-removal-code
       (if didntUseCollectTuplesFormP
	 (if startingTuples		; TAR 4/18/96
	   `(bag-append ,startingTuples ,queryCode)
	   queryCode)
         `(let ((resultTuples ,startingTuples))
            ,queryCode
            resultTuples))) )))

   
  ;;
;;;;;; Validation of Query Expressions
  ;;

(defun validate-query (expression)
  ;; Apply simple semantic checks to "expression";
  ;; Return a query for which concept or relation objects have
  ;;    been substituted in place of symbolic references;
  (when (atom expression)
    (return-from validate-query expression))
  (let ((operator (validate-keyword (first expression) :query-p t :no-error-p t)))
    (flet ((error-if-too-many-arguments (maxArgs)
	     (when (nth maxArgs expression)
	       (form-query-error "Too many arguments to ~S operator"
				 operator)))
	   (translate-temporal-binding (operator)
	     (or (cdr (assoc operator
			     '((:holds-at . :at-world-time)
			       (:begins-at . :at-world-time)
			       (:ends-at . :at-world-time)
			       (:holds-after . :at-world-time+)
			       (:holds-before . :at-world-time-))))
		 operator) ))
      (if (keywordp operator)
	  (case operator
	    ((:and :or :implies)
	     `(,operator
	       ,@(loop for term in (rest expression)
		      collect (validate-query term))))
	    ((:not :fail :previously :detects :undetects
		   :becomes :ceases :persists-forward :persists-backward)
	     (error-if-too-many-arguments 2)
	     `(,operator ,(validate-query (second expression))))
	    ((:exists :forall)
	     (error-if-too-many-arguments 3)
	     (validate-quantified-clause `(,operator ,@(rest expression))))
	    (:about
	     (validate&expand-about-clause (expand-temporal-clauses expression t)))
	    ((:same-as :subset :not-same-as)
	     (error-if-too-many-arguments 3)
	     `(,operator 
	       ,(validate-formula (second expression) :function)
	       ,(validate-formula (third expression) :function)))
	    ((:begins-at :ends-at)		; tar 5/25/93
	     ;; TO DO:  MAKE THIS MORE PRECISE, SINCE THIS ALLOWS MULTIPLE ITEMS!
	     (validate-query (expand-temporal-clauses expression t)))
	    ((:holds-at :holds-after :holds-before	; tar 5/25/93
	      :at-world-time :at-world-time+ :at-world-time- :at-agent-time)	;tar 8/10/92
	     ;; Is this vvvv needed?  Time expansion preprocessing should guarantee correctness.
             ;; ITS NICER IF THINGS GET CAUGHT EARLIER RATHER THAN LATER;
	     (error-if-too-many-arguments 3)
	     ;; TO DO:  SETUP VALIDATION FOR TEMPORAL ATTRIBUTE ON CONCEPTS AND RELATIONS:
	     `(,(translate-temporal-binding operator)
	                 ,(validate-formula (second expression) :function)
	           ,@(loop for term in (cddr expression)
			  collect (validate-query term))))
            (:within-world
	      (error-if-too-many-arguments 3)
              `(,operator ,(validate-formula (second expression) :function)
                 ,(validate-query (third expression))))
            (:within-theory
	      (error-if-too-many-arguments 3)
              (let* ((contextForm (validate-formula (second expression)
                                                    :function)))
                (if (question-mark-variable-p contextForm)
                  (let* ((*validateQueryBindings* nil)
                         (innerQuery (validate-query (third expression))))
                    (declare (special *validateQueryBindings*))
                    (if *validateQueryBindings*
                      `(,operator ,contextForm
                                  (:exists ,(mapcar #'fourth *validateQueryBindings*)
                                           (:and ,@*validateQueryBindings*
                                                 ,innerQuery)))
                      `(,operator ,contextForm ,innerQuery)) )
                  (if (quoted-p contextForm)
                    `(,operator ,contextForm
                                ,(within-context (second contextForm)
                                   (validate-query (third expression))))
                    `(,operator ,contextForm
                                ,(within-context contextForm
                                   (validate-query (third expression)))))) ))
	    (:changes
	     (error-if-too-many-arguments 2)
	     `(:changes ,(validate-formula (second expression) :function)))
	    (:predcall
	     `(:predcall ,@(loop for arg in (rest expression)
				collect (validate-formula arg :function))))
            (:create
             (error-if-too-many-arguments 4)
             (validate-create-clause expression))
	    (:within-context
	     (form-query-error "The keyword :WITHIN-CONTEXT has been replaced by
the keywords :WITHIN-THEORY and :WITHIN-WORLD.  You will need to choose an appropriate
replacement.  For details, see the release notes."))
	    (otherwise
	     (if (keywordp (car expression))
		 (form-query-error "Illegal keyword ~S in query" operator)
		 (validate-formula expression :predicate))))
	  (validate-formula expression :predicate)) )))

(defun validate-formula (expression predicate/function)
  ;; Called by "validate-query";
  ;; Apply simple semantic checks to "expression", and substitute
  ;;    concept or relation objects in place of symbolic references;
  ;; Verify that each operator is defined;
  ;; Verify that each operator is a function unless "predicate-p";
  ;; Verify that the number of arguments to each operator matches the
  ;;    number of domains of that operator;
  ;; NOT YET IMPLEMENTED:
  ;; For each operator that has an argument which evaluates to a set,
  ;;    verify that either
  ;;       (1) the corresponding domain specializes SET, or
  ;;       (2) the operator is a binary-relation used as a function, or
  ;;       (3) the operator is a linear formula;
  (when (or (atom expression)
	    (eq (first expression) ':one-of)
	    (quoted-p expression)
	    (function-p expression))
    (return-from validate-formula expression))
  (when (indexed-relation-p (car expression))
    (return-from validate-formula
      (multiple-value-bind (relation index)                                    
	  (parse-indexed-relation (car expression))
	;; BUG: THIS NEEDS CODE TO HANDLE ?VARIABLES IN INDEXED EXPRESSIONS
	`(:index ,(validate-formula `(,relation ,@(cdr expression)) :function)
		 ,index))))
  (when (keywordp (car expression))
    (case (car expression)
      (:previously 
       (when (not (= (length expression) 2))
	 (form-query-error "~S operator expects exactly one argument" (car expression)))
       (return-from validate-formula
	 `(:previously
	    ,(validate-formula (cadr expression) :function))))
      ((:set-of :collect)
       (return-from validate-formula 
	 (validate-collection-clause expression)))
      ((:the-list :the-list*)
       (return-from validate-formula
	 `(,(car expression)
	   ,@(loop for e in (rest expression)
		 collect (validate-formula e :function)))))
      (:predcall			; TAR 5/8/98
       (return-from validate-formula
	 `(:predcall
	   ,@(loop for e in (rest expression)
		 collect (validate-formula e :function)))))
      (otherwise
       (form-query-error "Illegal keyword ~S" (car expression)))))
  (let* ((predicateP (eq predicate/function :predicate))
	 (operatorName (car expression))
	 (parsedOperator (parse-indexed-relation operatorName))
	 (arguments (cdr expression))
	 (operatorIsConceptP (or (null arguments)
				 (and predicateP
				      (null (cdr arguments)))))
	 (operator (validate-predicate 
		     parsedOperator
		     (if operatorIsConceptP :concept :relation)
                     (if predicateP
                       (length arguments)
                       (1+ (length arguments))))))
    (when (and (not predicateP)
	       (not operatorIsConceptP)
	       (not (question-mark-variable-p operator))
               ;; if "operator" is unsealed, post it for sealing:
               (progn (ensure-sealed-predicate operator) t)
	       (not (generator-predicate-p operator))	; RMM 4/7/92
               ;; KLUDGE: WE CAN'T PREDICT IF :satisfies CAN ACT AS A GENERATOR HERE:
               (null (computed-features operator))
               ;; no error if "operator" MIGHT be a generator after it is sealed:
               (predicate-is-sealed-p operator))
      (form-query-error "The operator ~S cannot be used as a function" operatorName))
    `(,operator
      ,@(loop for arg in arguments
	     collect (validate-formula arg :function))) ))

(defun validate-quantified-clause (clause)
  ;; Called by "validate-query";
  ;; Perform syntactic checks on the existentially or universally
  ;;    quantified expression "clause";
  (let ((quantifier (first clause))
	(variables (second clause))
	(body (third clause)))
    (when (atom variables)
      (setq variables (list variables)))
    (loop for vbl in variables
	 when (not (question-mark-variable-p vbl))
	 do (form-query-error "Illegal quantified variable ~S" vbl))
    (when (fourth clause)
      (form-query-error "Too many arguments to quantifier.~%   ~
                            Offending clause: ~S.~%   Possibly an :AND ~
                            is missing." clause))
    `(,quantifier				; :exists or :forall
      ,variables
      ,(validate-query body)) ))

(defun validate-create-clause (clause)
  ;; Called by "validate-query";
  ;; Perform syntactic checks on the create clause "clause";
  (let ((variable (second clause))
        (concept (third clause))
	(legalCreationPolicies '(:clos :clos-instance :lite-instance
				 :classified-instance :skolem-instance)))
    `(:create
      ,(progn
         (unless (or (null variable)
		     (question-mark-variable-p variable)
                     (dollar-variable-p variable)  ; TAR 12/2/98
		     (identifier-reference-p variable))
           (form-query-error "The first argument to :create must be a ~
                question mark variable or an instance identifier, not ~S."
                             variable))
         variable)
      ,(progn
         (unless (or (question-mark-variable-p concept)
                     (identifier-reference-p concept)
		     (null concept)  ; TAR 7/9/99
		     )
           (form-query-error "The second argument to :create must be a ~
             question mark variable or a concept identifier, not ~S."
                             concept))
	 (if concept
	     (validate-predicate concept :concept 1)
	   nil))
      ,(cond
        ((member (fourth clause) legalCreationPolicies)
	 (fourth clause))
        ((null (fourth clause)) nil)
        (t
         (form-query-error
	  "The third argument to :create must be omitted or be one of~% ~{~S~^ ~}."
	  legalCreationPolicies)))) ))

(defun validate-collection-clause (clause)
  ;; Called by "validate-query";
  ;; Perform syntactic checks on the collection expression "clause";
  (let ((variable (second clause))
	(body (third clause)))
;    (when (consp variable)
;      (when (rest variable)
;	(form-query-error "Too many collection variables: ~S" variable))
;      (setq variable (first variable)))
    (when (if (consp variable)
	      (loop for v in variable
		  thereis (not (question-mark-variable-p v)))
	      (not (question-mark-variable-p variable)))
      (form-query-error "Illegal collection variable ~S" variable))
	    
    (when (fourth clause)
      (form-query-error "Too many arguments to :set-of or :collect.~%   ~
                            Offending clause: ~S.~%   Possibly an :AND ~
                            is missing." clause))
    
    `(,(first clause)				; :set-of or :collect
      ,variable
      ,(validate-query body)) ))


#+CLTL2 (declaim (inline world-time-transition-p))
#-CLTL2 (proclaim '(inline world-time-transition-p))
(defun world-time-transition-p (transition)
  (member transition
	  '(:becomes :ceases :persists-forward :persists-backward)) )

(defun validate&expand-about-clause (clause)
  ;; Called by "validate-query";
  ;; "clause" is an expression beginning with the keyword :about;
  ;; Return a list of predicates representing the expansion of all the 
  ;;    :about clauses in "clause";
  ;; Expansion of an :about clause entails removal of the :about keyword
  ;;    and insertion of the subject into each predicate in the clause;
  ;; Non-lists (representing unary predicates) are converted into 
  ;;    singleton lists;
  ;; TO DO: UPGRADE TO PERMIT ARBITRARY CONCEPT EXPRESSIONS INSIDE OF
  ;;    :about INSTEAD OF JUST PREDICATE NAMES;
  (declare (special *validatingAssertionP*))    ; DGB 12/9/93
  (let ((subject (second clause))
	(subClauses (cddr clause)))
    (labels
      ((expand-about-description (description)
	 (let ((operator (validate-keyword (first description) :query-p t :no-error-p t)))
	   (if (keywordp operator)
	       (case operator
		 (:filled-by
		  (expand-filled-by-clause description))
		 (:not-filled-by
		  ;; TO DO: WE DON'T VALIDATE NON-FILLERS YET:
		  `(:not-filled-by
		     ,(second description)
		     ,@(cddr description)))
		 ((:at-least :at-most :exactly)
		  `(,operator ,subject
		    ,(second description)
		    ,(validate-predicate (third description) :relation 2)
		    ,@(when (fourth description)
			`(,(validate-predicate (fourth description) :concept 1)))))
		 ((:all :some)  ; :the handled as special case
		  `(,operator ,subject
		    ,(validate-predicate (second description) :relation 2)
		    ,(validate-predicate (third description) :concept 1)))
		 ((:same-as)  ;  :not-same-as
		  (if (boundp '*validatingAssertionP*)    ; DGB 12/9/93
		      `(:equivalent-roles
			,subject
			,(validate-predicate (second description) :relation 2)
			,(validate-predicate (third description) :relation 2))
		      `(,operator
			(,(validate-predicate (second description) :relation 2) ,subject)
			(,(validate-predicate (third description) :relation 2) ,subject))))
		 ((:and :or)
		  (form-query-error
		    "Use of ~S inside :bout clause is not supported"
		    operator))
		 (:filled-by-list
		  (validate-filled-by-list description subject))
		 (:create
		  `(,operator ,subject
                              ,(when (second description) ; TAR 7/9/99
				 (validate-predicate (second description) :concept 1))
                              ,@(cddr description)))
		 ((:at-world-time :at-world-time+ :at-world-time- :at-agent-time
                                  :within-theory :within-world)
		  ;; TO DO: WE DON'T VALIDATE (OR SUBSTITUTE) FOR TEMPORAL ARGUMENT YET:
		  `(,operator ,(second description)
		    ,@(loop for desc in (cddr description)
			    when (world-time-transition-p (car desc))
			      collect `(,(car desc)
					,(expand-about-description (list-of (cadr desc))))
			    else 
			      collect (expand-about-description (list-of desc)))))
		 (:within-context
		  (form-query-error "The keyword :WITHIN-CONTEXT has been replaced by
the keywords :WITHIN-THEORY and :WITHIN-WORLD.  You will need to choose an appropriate
replacement.  For details, see the release notes."))
		 (otherwise
		  (form-query-error
		   "Illegal description inside of :about clause: ~S~
                    ~:[~%   ~S mapped to keyword ~S~;~2*~]"
		   description
		   (eq operator (first description))
		   (first description)
		   operator)))
               ;; not a keyword, so it must be a predicate:
	       (validate-formula
                `(,operator ,subject ,@(rest description)) :predicate))))
       (expand-filled-by-clause (clause)
	 ;; Return a list of predicates representing the expansion of "clause";
	 ;; Expansion entails removal of the :filled-by keyword and creation of a new
	 ;;    predicate for each role appearing in "clause";
	 (let ((role (second clause)))
	   `(:and ,@(loop for value in (cddr clause)
			 collect 
			 (validate-formula 
			   `(,role ,subject ,value) :predicate))))))
      (when (and (not (atom subject))
		 (cdr subClauses))
	;; warn if code replicates compound subject:
	(grumble "Generating non-optimal code for :about clause because query~%~
                  optimizer is not yet completed--Compound subject replicated."))
      (when subClauses				; DGB 3/6/92
	`(:and ,@(loop for desc = (list-of (pop subClauses))
                       while desc
                       when (eql (car desc) :the)
                         do (push `(:some ,@(cdr desc)) subClauses)
                            (push `(:all ,@(cdr desc)) subClauses)
                            (push `(:at-most 1 ,(second desc)) subClauses)
                       else collect (expand-about-description desc)))) )))

(defun validate-filled-by-list (proposition subject)
  ;; "proposition" has the form 
  ;;    (:filled-by-list <instance> <relation> <listExpression>) ;
  (let ((role (validate-predicate (second proposition) :relation 2)))
    `(,(first proposition) ,subject ,role ,(third proposition)) ))

(defun validate-predicate (predicate concept/relation arity)
  ;; Verify that "predicate" is defined, classified, and sealed, and
  ;;    return the object;
  ;; TO DO: UPGRADE THIS TO HANDLE CONCEPT AND RELATION EXPRESSIONS, E.G.,
  ;;    (:and A B) SHOULD GET CLASSIFIED AND SEALED HERE;
 (declare (special *validateQueryBindings*))
 (if (atom predicate)
     (cond ((question-mark-variable-p predicate)
	    predicate)
	   ((extended-identifier-p predicate)
	    (forcing-get-predicate predicate concept/relation arity))
	   ((boundp '*validateQueryBindings*)
	    (get-query-bound-variable predicate arity))
	   (t 
	    (forcing-get-predicate predicate concept/relation arity)))
   (cond ((eq (first predicate) 'the-relation)  ; TAR 1/21/99
	  (or (funcall #'the-relation 
		       (eval (second predicate))
		       (eval (third predicate)))
	      (form-query-error "No ~A found matching ~S" concept/relation predicate)))
	 (t
	  (form-query-error
	   "~As in assertions must be named.  They cannot be~%~
            created on the fly as in ~S"
	   concept/relation predicate)))) )

  ;;
;;;;;; Normalization of Well-Formed-Formulae
  ;;

#|

Normalization moves the :not operator inwards, the :previously operator
outwards, eliminates the :provably operator, and combines other operators
in various ways.  Depending on context, :detects and :undetects operators may
or may not get expanded.  Extra transformations are needed to handle the
case when they are not expanded.

The following are NOT valid transformations:   fail(not(P)) ==> P
                                               fail(detects(P)) ==> th-undetects(P)
                                               fail(undetects(P)) ==> th-detects(P)

Valid transformations:

not(P and Q) ==> not(P) or not(Q)
not(P or Q) ==> not(P) and not(Q)
not(for-some(x) P(x)) ==> for-all(x)not(P(x))
not(for-all(x)P(x)) ==> for-some(x)not(P(x))

not(not(P)) ==> P
fail(fail(P))  ==> P
not(fail(P)) ==> P

not(previously(P)) ==> previously(not(P))
fail(previously(P)) ==> previously(fail(P))

detects(P) ==> P and previously(not(P))
undetects(P) ==> not(P) and previously(P)
th-detects(P) ==> P and previously(fail(P))
th-undetects(P) ==> fail(P) and previously(P)
changes(P) ==> detects(P) or undetects(P)
th-changes(P) ==> th-detects(P) or th-undetects(P)

not(provable(P)) ==> fail(P)
fail(provable(P)) ==> fail(P)
detects(provable(P)) ==> th-detects(P)
undetects(provable(P)) ==> th-undetects(P)
th-detects(provable(P)) ==> th-detects(P)
th-undetects(provable(P)) ==> th-undetects(P)
previously(provable(P)) ==> provable(previously(P))    ;; only inverted-p reacts to this one

|#

(defun simplify-wff (wff inverted-p)
  ;; Return a wff for which logical inversions have been pushed down,
  ;;    and ANDs and ORs have been simplified;
  (flet ((invert-operator
	   (operator inverted-p)
	   ;; Return the "dual" of "operator" if "inverted-p" is true;
	   (if inverted-p 
	       (ecase operator
		 (:and :or)
		 (:or :and)
		 (:exists :forall)
		 (:forall :exists))
	       operator) ))
    (when (atom wff) 
      (return-from simplify-wff
	(if inverted-p
	    (case wff
	      (:true :false)
	      (:false :true)
	      (otherwise
	       (form-query-error "Can't logically invert the expression ~S" wff)))
	    wff)))
    (let ((operator (car wff)))
      (case operator
	(:not 
	 (simplify-wff (second wff) (not inverted-p)))	; not(not(P)) ==> P
	((:and :or)
	 (simplify-connective-wff 
	   `(,(invert-operator operator inverted-p)
	     ,@(loop for clause in (cdr wff) 
		    collect (simplify-wff clause inverted-p)))))
	((:exists :forall)
	 `(,(invert-operator operator inverted-p)
	   ,(second wff)
	   ,(simplify-wff (third wff) inverted-p)))
	(:implies				; P implies Q ==> not(P) or Q
	 (simplify-connective-wff
	   `(:or ,(simplify-wff (second wff) (not inverted-p))
		 ,(simplify-wff (third wff) inverted-p))))
	(:fail
	 (simplify-fail-wff wff inverted-p))
	(:provable
	 (if inverted-p
	     (simplify-wff `(:fail (second wff)) nil)	; not(provable(P)) ==> fail(P)
	     ;; the following transformation is valid only assuming that we are simplifying
	     ;;    from the outside in:
	     (simplify-wff (second wff) nil)))	; provable(P) ==> P
	((:previously :detects :undetects :changes   )
	 (simplify-agent-time-wff wff inverted-p))
	((:at-agent-time :at-world-time :at-world-time+ :at-world-time- 
                         :within-theory :within-world)
	 ;; TO DO: DEAL WITH inverted-p ARGUMENT.  SIGNAL ERROR!?
	 ;; QUESTION:  SHOULD WE EXPAND THE TEMPORAL MODAL HERE?
	 (let ((*expandAgentTimeTransitionsP* nil))
	   ;; Make simplify-wff happy.  QUESTION:  SHOULD THIS BE IN TELL NOW?
	   (declare (special *expandAgentTimeTransitionsP*))
	   `(,operator ,(simplify-time-wff (second wff))
	     ,@(loop for clause in (cddr wff)
		     collect (simplify-wff clause inverted-p))) ))
        (QUOTE
         (when inverted-p
           (form-query-error "Can't logically invert the expression ~S" wff))
         wff)         
	(otherwise
	 (let ((simplifiedWff 
		 `(,operator
		   ,@(loop for clause in (cdr wff) 
			  collect (simplify-wff clause nil)))))
	   (if inverted-p 
	       `(:not ,simplifiedWff)
	       simplifiedWff))))) ))

(defun simplify-connective-wff (wff)
  ;; Return a simplified "wff" in which ANDs and ORs are absorbed
  ;;    when they match the first operator;
  ;; Situation: "wff" is assumed to begin with :and or :or, and its
  ;;    arguments have already been simplified;
  ;; If the connective has a single argument, return only the argument;
  (let ((operator (car wff))			; operator = :and or :or
	arguments)
    (loop for clause in (cdr wff) 
	 do
	 (case clause
	   (:true
	    (case operator
	      (:and nil)			; eliminate redundant :true
	      (:or
	       (return-from simplify-connective-wff :true))))
	   (:false
	    (case operator
	      (:or nil)				; eliminate redundant :false
	      (:and
	       (return-from simplify-connective-wff :false))))
	   (otherwise
	    (cond
	      ((atom clause)
	       (form-query-error "Illegal argument ~S in ~S clause"
				 clause operator))
	      ((eq (car clause) operator)	; unnest embedded connective
	       (loop for subClause in (cdr clause)
		    do (push subClause arguments)))
	      (t
	       (push clause arguments))))))
    ;; recreate original order of terms, and collect together temporal clauses:
    (setq arguments (consolidate-agent-time-clauses arguments))
    (cond
      ((null arguments)				; DGB 6/20/90
       (case operator
	 (:and :true)
	 (:or :false)))
      ((null (cdr arguments))
       (car arguments))
      (t
       `(,operator ,@arguments))) ))

(defun simplify-fail-wff (wff inverted-p)
  ;; Return a wff equivalent to "(:fail wff)";
  (cond
    (inverted-p
     (simplify-wff (second wff) nil))		; not(fail(P)) ==> P
    ((member (first (second wff)) 
	   '(:fail :detects :undetects :previously :provable))
     (let* ((outerArgument (second wff))
	    (innerArgument (second outerArgument)))
       (simplify-wff
	 (ecase (first outerArgument)
	   (:fail innerArgument)			; fail(fail(P)) ==> P
	   (:detects `(:undetects ,innerArgument))
	   (:undetects `(:detects ,innerArgument))
	   (:previously `(:previously (:fail ,innerArgument)))
	   (:provable `(:fail ,innerArgument)))	; fail(provable(P)) ==> fail(P)
	 nil) ))
    (t
     `(:fail ,(simplify-wff (second wff) nil)))) )

(defun simplify-time-wff (wff)
  ;; Situation: "wff" is an expression denoting a world time.
  ;; Apply time and date parsing if appropriate.
  ;; TO DO:  IMPLEMENT THE TIME AND DATE PARSING STRATEGY.
  ;; CURRENTLY A STUB. - tar
  wff)

(defun simplify-agent-time-wff (wff inverted-p)
  ;; Situation: "wff" begins with one of the agentTime operators
  ;;    :previously :detects :undetects :changes   ;
  ;; Apply transformations to simplify "wff";
  ;; Effects:
  ;;    Second-level :provable operator is absorbed into agentTime operator;
  ;;    Second-level operator is eliminated when it matches the top-level
  ;;       operator;
  (let ((operator (first wff))
	(argument (second wff)))
    (cond
      (inverted-p
       (ecase operator
	 ((:detects :undetects :changes   )
	  (simplify-wff
	    (expand-agent-time-transition-wff wff)
	    t))
	 (:previously	; not(previously(P)) ==> previously(not(P))
	  (simplify-agent-time-wff 
	    `(:previously ,(simplify-wff argument t)) nil))))
      ((atom argument)
       (ecase operator
	 (:previously wff)
	 ;; REVISE THIS IF WE WISH TO DETECT CHANGE IN EXISTENTIAL STATUS
	 ;;    OF INDIVIDUAL:
	 ((:detects :undetects  ) :false)))
      ((eq (first argument) :provable)
       (simplify-agent-time-wff `(,operator ,(second argument)) nil))
      ((eq operator (first argument))	; eliminate nesting of same operator
       (simplify-agent-time-wff argument nil))
      (t
       (help-simplify-agent-time-wff wff))) ))

(defun expand-agent-time-transition-wff (wff)
  ;; Helping function for "simplify-agent-time-wff";
  ;; Expand :detects, :undetects, etc. into terms using :previously;
  (when (atom wff)                      ;  TAR 2/2/94
    (return-from expand-agent-time-transition-wff wff))
  (let ((argument (second wff)))
    (case (first wff)
;      (:detects      ; tar 8/24/92
;       (simplify-wff `(:and ,argument (:not (:previously ,argument))) nil))
;      (:undetects
;       (simplify-wff `(:and (:not ,argument) (:previously ,argument)) nil))
      (:detects
       (simplify-wff `(:and ,argument (:fail (:previously ,argument))) nil))
      (:undetects
       (simplify-wff `(:and (:fail ,argument) (:previously ,argument)) nil))
      (:changes
       ;; append existentially quantified variable to term expression:
       (let ((variable (form-gensym-variable "?V")))
	 (simplify-wff
	   `(:or (:exists ,variable (:detects ,`(,@argument ,variable)))
		 (:exists ,variable (:undetects ,`(,@argument ,variable))))
	   nil)))
;      (:th-changes  ; tar 8/24/92
;       ;; append existentially quantified variable to term expression:
;       (let ((variable (form-gensym-variable "?V")))
;	 (simplify-wff
;	   `(:or (:exists ,variable (:th-becomes ,`(,@argument ,variable)))
;		 (:exists ,variable (:th-ceases ,`(,@argument ,variable))))
;	   nil)))
      (otherwise                        ;  TAR 2/2/94
       (loop for element in wff
             collect (expand-agent-time-transition-wff element)))
      ) ))       

(defun help-simplify-agent-time-wff (wff)
  ;; Helping function for "simplify-agent-time-wff";
  ;; Possibly expand either transition operators in "wff", or
  ;;    structures (e.g., role chains) embedded inside of agentTime
  ;;    transition clauses;
  ;; Effects:
  ;;    Expand :changes clause into disjunction of :detects and :undetects;
  ;;    If *expandAgentTimeTransitionsP*, then apply transformations to
  ;;       simplify the arguments to a :detects or :undetects clause, and
  ;;       expand :changes clause to non-quantified :detects and :undetects;
  (let ((operator (first wff))
	(argument (second wff)))
    (declare (special *expandAgentTimeTransitionsP*))
    (case operator
      (:changes
       (if *expandAgentTimeTransitionsP*
	   (normalize-changes-clause
	     operator argument (eq *expandAgentTimeTransitionsP* :monitor))
	   (expand-agent-time-transition-wff wff)))
      ((:detects :undetects)
       (if *expandAgentTimeTransitionsP*
	   (normalize-agent-time-transition-clause operator argument)
	   wff))
      (otherwise
       wff)) ))

(defun consolidate-agent-time-clauses (listOfClauses)
  ;; Called by "simplify-connective-wff";
  ;; Situation terms in "listOfClauses" are AND'ed or OR'ed together;
  ;; Combine any terms that share the same :previously operator;
  ;; Side-effect: The order of terms is reversed (which in this case
  ;;    is helpful);
  (let (previouslyArguments detectsTerms otherTerms)
    (loop for term in listOfClauses
	 do
	 (case (first term)
	   (:previously (push (second term) previouslyArguments))
	   ((:detects :undetects  ) (push term detectsTerms))
	   (otherwise (push term otherTerms)))) 
    (setq previouslyArguments
	  (if (cdr previouslyArguments)
	      `(:and ,@previouslyArguments)
	      (car previouslyArguments)))
    `(,@otherTerms
      ,@detectsTerms
      ,@(when previouslyArguments `((:previously ,previouslyArguments)))) ))

(defun expand-detects-clauses (query)
  ;; Return a query for which each :detects or :undetects predication has
  ;;    been expanded into a clause that employs :previously and :fail;
  ;; Called by "form-query-code";
  ;; Strategy: First expand :detects and :undetects clauses, and then resimplify to
  ;;    eliminate possible nested :and's;
  (let ((*expandAgentTimeTransitionsP* nil))
    (declare (special *expandAgentTimeTransitionsP*)) 
    (labels
      ((contains-agent-time-clauses-p
	 (subQuery)
	 (or (search-tree-p :detects subQuery)
	     (search-tree-p :undetects subQuery)))
       (help-expand-detects
	 (subQuery)
	 (cond
	   ((or (atom subQuery) 
		(not (contains-agent-time-clauses-p subQuery)))
	    subQuery)
	   (t
	    (expand-agent-time-transition-wff subQuery)	; RMM 4/6/92
;; RMM 4/6/92
;	    (case (first subQuery)
;	      (:detects
;	       `(:and ,(second subQuery) (:previously (:fail ,(second subQuery)))))
;	      (:undetects
;	       `(:and (:not ,(second subQuery)) (:previously ,(second subQuery))))
;	      (otherwise
;	       (loop for clause in subQuery
;		    collect (help-expand-detects clause))))
	    ))))
      (if (contains-agent-time-clauses-p query)
	  (simplify-wff (help-expand-detects query) nil)
	  query) )))

(defun eliminate-top-level-existentials (query &key collect-new-names-p)
  ;; Called by "normalize-query";
  ;; Eliminate all existentials not inside of disjunctions or universals:
  ;; Return a transformation of "query" in which top-level :exists
  ;;    clauses have been replaced by simple conjunctions;
  ;; Note: This causes some of the variables in "query" to be unquantified;
  ;; Note: Some small effort is made to preserve the original order of
  ;;    clauses;
  (when (or (atom query)
	    (not (member (car query)			
		       '(:and :exists :now :previously :at-agent-time
			 :at-world-time :at-world-time+ :at-world-time-
                         :within-theory :within-world))))
    (return-from eliminate-top-level-existentials query))
  (let (topLevelClauses)
    (labels ((collect-term
	       (term agentTimeOperator)
	       (push
		 (if agentTimeOperator `(,agentTimeOperator ,term) term)
		 topLevelClauses))
	     (collect-conjunctive-clauses (subQuery agentTimeOperator)
	       (when (atom subQuery)
		 (collect-term subQuery agentTimeOperator)
		 (return-from collect-conjunctive-clauses nil))
	       (case (first subQuery)
		 (:exists
		  (let ((renamedSubQuery
			  (rename-existential-variables subQuery
                                                        collect-new-names-p)))
		    (collect-conjunctive-clauses (third renamedSubQuery)
						 agentTimeOperator)))
		 (:and
		  (loop for term in (rest subQuery)
			do (collect-conjunctive-clauses term
							agentTimeOperator)))
		 ((:now :previously)
		  (collect-conjunctive-clauses (second subQuery)
					       (first subQuery)))
		 ((:at-world-time :at-world-time+ :at-world-time- ; TAR 3/11/93
				  :at-agent-time :within-theory :within-world)
		  (collect-term `(,(first subQuery) ,(second subQuery)
				  ,(eliminate-top-level-existentials
				    (third subQuery)))
				agentTimeOperator))
		 (otherwise
		  (collect-term subQuery agentTimeOperator)))))
      (collect-conjunctive-clauses query nil)
      `(:and ,@(nreverse topLevelClauses)) )))

(defun rename-existential-variables (existentialClause collectNewNamesP)
  ;; Return a transformation of "existentialClause" in which all the
  ;;    existential variables have been given unique names;
  (declare (special *newExistentialNames*))     ; TAR 12/31/96
  (let ((namePairs 
	  (loop for var in (list-of (second existentialClause))
	      as newVar = (form-gensym-variable (symbol-name var))
	      as pair = (cons var newVar)
	      collect pair
	      when collectNewNamesP do (push pair *newExistentialNames*))))
    (sublis namePairs existentialClause) ))


  ;;
;;;;;; Compilation of Generator Terms
  ;;

(defun form-collection-query 
       (normalizedQuery outputVariables freeVariables collectTuplesForm)
  ;; Helping function for "form-retrieve-query";
  ;; Return three values:
  ;;    (1) Lisp code for evaluating "normalizedQuery";
  ;;    (2) whether or not the code includes "collectTuplesForm";
  ;;    (3) whether or not the result of "normalizedQuery" is guaranteed to be
  ;;        free of duplicates;
  ;; This function makes recursive calls for each of the entries in 
  ;;    "generatorSequence",
  ;; On every call:
  ;;    (i)  a generator function is built for one or more free variables;
  ;;    (ii) terms containing bound variables are assembled into a restriction
  ;;         which will filter the instances produced by the generator;
  ;; Note: "outputVariables" may be an atom, indicating objects rather than
  ;;    tuples are to be collected;
  ;; Note: "remainingNonGenExistentials" contains variables that aren't in the
  ;;    list of generator variables produced "compute-optimal-generator-sequence"
  ;;     -- these are either (1) existentially-quantified non-output variables,
  ;;     or (2) output variables that get bound by tuple scans as a side-effect
  ;;     of generating some other variable.  Generator code for the former 
  ;;     type of variable appears as a filter query rather than as a main iteration
  ;;    loop.  Generator code for the latter occurs within a tuple scan.
  ;; TO DO: DETERMINE IF SINGLE-GENERATOR CASE EVER FAILS TO REMOVE
  ;;    DUPLICATES;
  (let* ((generatorSequence
	   (compute-optimal-generator-sequence 
	     normalizedQuery freeVariables (list-of outputVariables)))
	 (singleIterationLayerP (eq (length generatorSequence) 1))
	 (singleGeneratorNoTuplesP (and singleIterationLayerP (atom outputVariables)))
	 remainingGeneratorVars remainingNonGenExistentials 
	 duplicateFreeGeneratorP)
    (labels ((form-tuple-scan-query-body
	       (iterationVariable generatorEntry subQuery)
	       (let ((candidateGeneratorVars 
		       (cons iterationVariable remainingNonGenExistentials))
		     (tupleVars (rest (generator-term generatorEntry)))
		     filterQuery residueQuery)
		 (setq remainingNonGenExistentials
		       (set-difference remainingNonGenExistentials tupleVars))
		 (multiple-value-setq (filterQuery residueQuery remainingNonGenExistentials)
		   (extract-filter-query 
		     subQuery remainingGeneratorVars remainingNonGenExistentials))
		 (form-tuple-scan-layer 
		   generatorEntry candidateGeneratorVars filterQuery
		   (if residueQuery
		       (form-collection-query-body residueQuery)
		       collectTuplesForm))))
	     (form-collection-query-body (subQuery)
	       (let ((iterationVariable (pop remainingGeneratorVars))
		     (generatorEntry (cdr (pop generatorSequence)))
		     generatorCode filterQuery residueQuery singleValueGeneratorP)
		 (when (eq (generator-type generatorEntry) :scanned-tuple-relation)
		   (return-from form-collection-query-body
		     (form-tuple-scan-query-body iterationVariable generatorEntry subQuery)))
		 (multiple-value-setq (generatorCode duplicateFreeGeneratorP singleValueGeneratorP)
		   (form-generator-code iterationVariable generatorEntry))
		 (multiple-value-setq (filterQuery residueQuery remainingNonGenExistentials)
		   (extract-filter-query 
		     subQuery remainingGeneratorVars remainingNonGenExistentials))
		 (form-layer-of-iteration
		   iterationVariable generatorCode filterQuery
		   (if residueQuery
		       (form-collection-query-body residueQuery)
		       collectTuplesForm)
		   :body-just-collects-output-variables-p singleGeneratorNoTuplesP
		   :single-value-generator-p singleValueGeneratorP))))
      (setq remainingGeneratorVars
	    (loop for pair in generatorSequence collect (car pair)))
      (setq remainingNonGenExistentials
	    (set-difference freeVariables remainingGeneratorVars))
      (multiple-value-bind (queryCode didntUseCollectTuplesFormP)
	  (form-collection-query-body normalizedQuery)
	(values
	  queryCode didntUseCollectTuplesFormP
	  (and singleIterationLayerP
	       duplicateFreeGeneratorP))) )))

(defun form-layer-of-iteration
       (iterationVariable generatorCode filterQuery bodyOfIteration
	&key body-just-collects-output-variables-p single-value-generator-p)
  ;; Helping function for "form-collection-query";
  ;; Return two values:
  ;;    (1) a form that iterates over the list generated by "generatorCode"
  ;;        (using the variable "iterationVariable"), filtering using the
  ;;        query "filterQuery", and calling "bodyOfIteration" during each
  ;;        successful iteration;
  ;;    (2) whether or not "iterationVariable" was not used within the query form;
  ;; Slightly tricky: "body-just-collects-output-variables-p" indicates that the body of the
  ;;    iteration just collects values of the iteration variable; If it is
  ;;    set AND "filterForm" below is empty, then skip generating the outer layer,
  ;;    and return `t' as the second value;
  ;; Slightly tricky: "fillerQuery" may yield empty "filterCode";
  ;; Slightly tricky: If "single-value-generator-p" is non-nil, then the
  ;;    "generatorCode" returns a single value, not a list.
  (let* ((filterCode (when filterQuery (form-boolean-query filterQuery)))
	 (dontUseIterationVariableP 
	   (and body-just-collects-output-variables-p (null filterCode))))
    (values	; TAR 3/26/93
      (cond (dontUseIterationVariableP
             (if single-value-generator-p `(list ,generatorCode) generatorCode))        ; TAR 9/1/93
	    (single-value-generator-p
	       `(let ((,iterationVariable ,generatorCode))
		  ,(if filterCode
		       `(when ,filtercode ,bodyOfIteration)
		       bodyOfIteration)))
	    (t `(loop for ,iterationVariable in ,generatorCode
		      ,@(when filterCode `(when ,filterCode))
		      do ,bodyOfIteration)))
      dontUseIterationVariableP) ))


(defun extract-filter-query (clause nonBindableVariables existentialVariables 
			     &key closed-predicates-p)
  ;; Return three values:
  ;;    (1) a conjunction of terms in "clause" which contain only externally bound
  ;;        variables, (non-generative) existential variables, and constants;
  ;;    (2) a conjunction of terms in "clause" which contain non-bindable variables;
  ;;        (these terms are called the "residue");
  ;;    (3) a list of existential variables that remain unquantified;
  ;; Extract out terms in "clause" that do not contain members of
  ;;    "nonBindableVariables", and combine them into a query that will
  ;;    be used as a filter;
  ;; The residue (made of the remaining terms) will be converted into an inner
  ;;    query layer, to be executed whenever the filter returns :true;
  ;; For each variable in "existentialVariables" that appears in a generative term,
  ;;    we migrate any filter terms containing that variable over to the generative 
  ;;    side, and remove the variable from "existentialVariables";
  ;; If members of "existentialVariables" remain in the filter query after the migration,
  ;;    we wrap a :exists around the filter query, quantifying over those variables;
  ;; If :closed-predicates-p is set, then "extract out" only terms for which the
  ;;    closed world assumption applies (i.e., open world terms go into the residue);
  ;; Note: "existentialVariables" that get bound by a tuple scan may appear no
  ;;    where else, in ... zzz
  (let ((filterTerms nil)
        generativeTerms openWorldTerms unquantifiedExistentials noMigrationsP fTerm)
    (labels ((generative-term-p (term nonBindableVars)
	       ;; Return t iff "term" contains one or more nonBindable variables;
	       (when (member (car term) '(:exists :forall))
		 (setq nonBindableVars 
		       (set-difference nonBindableVars (list-of (second term)))))
	       (loop for expr in term
		    thereis
		    (if (atom expr)
			(member expr nonBindableVars) 
			(generative-term-p expr nonBindableVars))))
	     (open-world-term-p (term)
	       ;; Return t iff "term" contains an open world atomic predication;
	       (let (operator)
		 (and (consp term) 
		      (if (keywordp (setq operator (first term)))
			  (loop for arg in (rest term) thereis (open-world-term-p arg))
			  (and (not (question-mark-variable-p operator))
			       (not (concept-is-closed-p operator)))))))
	     (existentially-quantify-non-constant-terms 
                 (filterTerms existentialVariables) 
	       (conjoin-multiple-terms
		 (if (null existentialVariables)
		     filterTerms
		     (let (constantTerms quantifiedTerms)
		       (loop for term in filterTerms
			    do (if (loop for v in existentialVariables
					thereis (search-tree-p v term))
				   (push term quantifiedTerms)
				   (push term constantTerms)))
		       (integrity-check quantifiedTerms)
		       (cons
			 `(:exists ,existentialVariables
				     ,(conjoin-multiple-terms quantifiedTerms))
			 constantTerms)))))
	     (conjoin-multiple-terms (terms)
	       (if (cdr terms) 
		   `(:and ,@terms)
		   (car terms))))
      (loop for term in (if (eq (car clause) :and) (cdr clause) (list clause))
	   do
	   (cond
	     ((generative-term-p term nonBindableVariables)
	      (push term generativeTerms) )
	     ((and closed-predicates-p
		   (open-world-term-p term))
	      (push term openWorldTerms))
	     (t	      
	       (push term filterTerms))))
      ;; flip terms to preserve their initial order:
      (setq filterTerms (nreverse filterTerms))
      ;; possibly migrate filter terms into generative terms list; Also,
      ;;    collect existentials that remain unquantified:
      (when generativeTerms 
	(loop
	  (setq noMigrationsP t)
	  (loop for v in existentialVariables
	       when (search-tree-p v generativeTerms)
	       do
	       (setq existentialVariables (remove v existentialVariables))
	       (push v unquantifiedExistentials)
	       (loop for tail on filterTerms
		    when (and (setq fTerm (car tail))
			      (search-tree-p v fTerm))
		    do
		    (push fTerm generativeTerms)
		    (setf (car tail) nil)
		    (setq noMigrationsP nil)))
	  (when noMigrationsP
	    (return)))) ;; exit loop
      (values
	(existentially-quantify-non-constant-terms filterTerms existentialVariables)
	(conjoin-multiple-terms (bag-append generativeTerms openWorldTerms))
	unquantifiedExistentials) )))

(defun single-valued-functional-term-p (term)
  ;; Called by "form-generator-code";
  ;; Return T if TERM is a functional term that will always have a single
  ;;   value;
  ;; Used to decide if an equivalence generator is single valued or if
  ;;  it has an implicit loop in it caused by multiple-valued relations;
  (or (atom term)
      (and (relation-p (first term))
	   (relation-is-single-valued-p (first term))
	   (loop for arg in (rest term)
	       always (single-valued-functional-term-p arg)))
      (member (first term) '(:predcall :the-list :the-list*))))


(defun form-generator-code (variable generatorEntry &key closed-role-test-p)
  ;; Return three values:
  ;;    (1) Lisp code which computes the value of the generator term;
  ;;    (2) t iff values generated are necessarily free of duplicates;
  ;;    (3) t iff only a single value is generated (not in a list!);
  ;; Note: The return form generally contains LOOM-generated global variables;
  ;; Note: Binding the special variable *runTimeClosedRoleGeneratorP*
  ;;    signals "wrap-with-run-time-open-role-throw" inside of "form-n-ary-generator"
  ;;    that a run-time conditional throw must be inserted into the code;
  ;; TO DO: FIGURE OUT MORE PRECISELY WHEN THE WORLDTIME WRAPPER IS NEEDED!
  (let* ((generatorTerm (generator-term generatorEntry))
	 (agentTimeExpression (generator-agent-time-expression generatorEntry))
	 (worldTimeExpression (generator-world-time-expression generatorEntry))
         (contextExpression (generator-context generatorEntry))
	 (singleValueGeneratorP nil)
	 query bindings generatorForm)
    (flet ((compute-generator-query ()
            (case (generator-type generatorEntry)
	      (:role
	       (if closed-role-test-p
                 (let ((*runTimeClosedRoleGeneratorP* t))
                   (declare (special *runTimeClosedRoleGeneratorP*))
                   (form-role-generator-function variable generatorTerm))
                 (form-role-generator-function variable generatorTerm)))
	      ((:concept :computed-relation)
	       (translate-relational-formula (butlast generatorTerm) :function))
	      (:equivalence
	       ;; Equivalence generators can produce multiple values if
	       ;;  they are used to bind variables to the output of
	       ;;  multiple-valued relational forms.
	       (setq generatorForm 
		     (if (eq variable (first (rest generatorTerm)))
			 (second (cdr generatorTerm))
		       (first (cdr generatorTerm))))
	       (setq singleValueGeneratorP
		     (single-valued-functional-term-p generatorForm))
	       (translate-relational-formula 
		generatorForm :function
		:dont-listify-p singleValueGeneratorP))         ; TAR 1/29/97
	      ((:scanned-tuple-relation :hashed-tuple-relation)
	       (if (eq variable (first (last generatorTerm)))
                 (translate-relational-formula
                  (butlast generatorTerm)
                  :function)
                 (help-form-tuple-scan-layer 
                  generatorEntry (list variable) nil 'collect variable)))
	      ((:world-transition :becomes :ceases :detects :undetects)
	       ;; :WORLD-TRANSITION is TEMPORARY UNTIL MULTIPLE GENERATORS WORK!
	       (form-temporal-generator-function variable
                                                 generatorTerm
						 (generator-type generatorEntry)
                                                 t)))))          ; TAR 9/2/93
      (if (cdr contextExpression)
        (let ((*queryContext* (car contextExpression)) *letVariables*)
          (declare (special *queryContext* *letVariables*))
          (setq query (compute-generator-query))
          (loop for entry in *letVariables*
            when (search-tree-p (third entry) query) ;RMM 4/7/92
            do (push (form-query-let-binding-clause entry nil) bindings)))
        (setq query (compute-generator-query)))
    (when worldTimeExpression
      (setq query (wrap-with-worldTime-offset query worldTimeExpression)))
    (when contextExpression
      (if bindings
        (setq query `(within-context 
                       ,(translate-context-formula (car contextExpression))
                       (let ,bindings (and ,@(mapcar #'first bindings) ,query))))
        (setq query `(within-context
                       ,(translate-context-formula (car contextExpression))
                       ,query))))
    (values
      (case agentTimeExpression
	(*agent-time* query)
	(otherwise (wrap-with-agent-time-offset query agentTimeExpression)))
      (or (member (generator-type generatorEntry)	
		  '(:world-transition :becomes :ceases))	; Always duplicate free!
	  (duplicate-free-generator-p generatorTerm))
      singleValueGeneratorP) )))

(defun duplicate-free-generator-p (generatorTerm)
  ;; Return t if "generatorTerm" generates lists that are guaranteed to
  ;;    be free of duplicate values;
  ;; Note: The logic assumes that "generatorTerm" is a legal generator (otherwise,
  ;;    it will break if atoms appear in the wrong places);
  ;; TO DO: DETECTING CHAINS OF SINGLE-VALUED, DUPLICATE-FREE PREDICATES
  ;;    WOULD MAKE THIS EVEN SMARTER;
  (case (first generatorTerm)
    ((:previously :detects :undetects  )
     (setq generatorTerm (second generatorTerm)))
    (:same-as
     (setq generatorTerm
	   (if (question-mark-variable-p (second generatorTerm))
             (third generatorTerm)
             (second generatorTerm)))
     (when (or (atom generatorTerm)	; equivalence between two variables, or
               (quoted-p generatorTerm))   ;    between a variable and a constant
       (return-from duplicate-free-generator-p t))))
  (let ((relation (first generatorTerm)))
    (cond
     ((question-mark-variable-p relation) nil)
     ((member relation '(:collect :set-of)) nil)        ;  TAR 12/5/94
     ((member relation '(:the-list :the-list*)) t)      ;  TAR 4/2/99
     ((atom (second generatorTerm))
      (duplicate-free-predicate-p relation))
     (t
      (and (binary-p relation)
           (subconcept-p (implied-domain relation) (loom-constant COLLECTION))
           (role-is-single-valued-p relation)))) ))

  ;;
;;;;;; Existentially and Universally Quantified Queries
  ;;

(defun form-layer-of-query (iterationVariable generatorCode singleValueGeneratorP
                            bodyCode queryType)
  ;; Forms a layer of query, adjusting for generator Type
  ;; Called by "form-existential-query" and "form-antecedent-query";
  (if singleValueGeneratorP
    `(let ((,iterationVariable ,generatorCode))
       ,bodyCode)
    `(loop for ,iterationVariable in ,generatorCode
           ,queryType ,bodyCode)) )

(defun form-existential-query (existentialVariables existentialClause)
  ;; Return a form corresponding to "existentialClause", which is a
  ;;    clause headed by an :exists operator;
  ;; This function builds nested generators and filters in the same
  ;;    manner as "form-collection-query";
  (let ((*newExistentialNames* nil))    ; TAR 12/31/96
    (declare (special *newExistentialNames*))
    ;; We need to handle potentially nested existential clauses here:
    (setq existentialClause
          (eliminate-top-level-existentials existentialClause
                                            :collect-new-names-p t))
    (loop for item in *newExistentialNames*
	do (push (first item) existentialVariables))
    (let* ((generatorSequence
	    (compute-optimal-generator-sequence 
	     existentialClause existentialVariables existentialVariables))
	   (remainingGeneratorVars 
	    (loop for pair in generatorSequence collect (car pair)))
	   (remainingNonGenExistentials
	    (set-difference existentialVariables remainingGeneratorVars)))
      (labels ((form-tuple-scan-query-body (iterationVariable generatorEntry subQuery)
		 (let ((candidateGeneratorVars 
			(cons iterationVariable remainingNonGenExistentials))
		       (tupleVars (rest (generator-term generatorEntry)))
		       filterQuery residueQuery)
		   (setq remainingNonGenExistentials
		     (set-difference remainingNonGenExistentials tupleVars))
		   (multiple-value-setq (filterQuery residueQuery remainingNonGenExistentials)
		     (extract-filter-query 
		      subQuery remainingGeneratorVars remainingNonGenExistentials))
		   (if residueQuery
		       (form-tuple-scan-layer 
			generatorEntry candidateGeneratorVars filterQuery
			(help-form-existential-query residueQuery))
		     (help-form-tuple-scan-layer generatorEntry
						 candidateGeneratorVars
						 filterQuery
						 'return t)))) ; was 'collect iterationVariable ; TAR 2/13/96
	       (help-form-existential-query (subQuery)
		 (let* ((iterationVariable (pop remainingGeneratorVars))
			(generatorEntry (cdr (pop generatorSequence)))
			filterCode) 
		   (when (eq (generator-type generatorEntry) :scanned-tuple-relation)
		     (return-from help-form-existential-query
		       (form-tuple-scan-query-body
			iterationVariable generatorEntry subQuery)))
		   (multiple-value-bind (generatorCode duplicateFreeP singleValueP)
		       (form-generator-code iterationVariable generatorEntry)
		     (declare (ignore duplicateFreeP))
		     (multiple-value-bind (filterQuery residueQuery)
			 (extract-filter-query subQuery remainingGeneratorVars nil)
		       (when filterQuery 
			 (setq filterCode (form-boolean-query filterQuery)))
		       (cond 
			(residueQuery
			 (form-layer-of-query
			  iterationVariable
			  generatorCode
			  singleValueP
			  (if filterCode ; tar 9/22/92
			      `(and ,filterCode
				    ,(help-form-existential-query residueQuery))
			    (help-form-existential-query residueQuery))
			  'thereis))
			(filterCode
			 (form-layer-of-query iterationVariable generatorCode
					      singleValueP filterCode 'thereis))
			(t 
			 generatorCode)))))))
	(multiple-value-bind (filterQuery residueQuery) ;  TAR 6/20/95
	    (extract-filter-query existentialClause
				  remainingGeneratorVars
				  remainingNonGenExistentials) ; TAR 2/13/96
	  (if filterQuery 
	      (let ((filterCode (form-boolean-query filterQuery)))
		(if filterCode		; tar 9/22/92
		    `(and ,filterCode
			  ,(help-form-existential-query residueQuery))
		  (help-form-existential-query residueQuery)) )
	    (help-form-existential-query existentialClause)) ) ))))

(defun form-universal-query (universalVariables universalClause)
  ;; Return a form corresponding to "universalClause", which is a
  ;;    clause headed by a :forall operator;
  ;; This function builds nested generators and restrictions in the same
  ;;    manner as "form-collection-query";
  (when (and (consp universalClause)    ; RMM 7/13/94
             (eq (first universalClause) :and))
    (return-from form-universal-query
      (form-multiple-universal-queries universalVariables universalClause)))
  (let ((normalizedUniversalClause
         (normalize-universally-quantified-subquery universalClause))
	antecedent consequents consequentCode)
    (when (null normalizedUniversalClause)
      (form-query-error "To successfully evaluate a universally quantified clause, the clause ~%   ~
                         must contain at least one negated term.  In this case, the clause~%   ~S~%   ~
                         does not.  Universally quantified queries usually take the form~%      ~
                         `(for-all (?x) (implies (P ?x) (Q ?x)))' which is equivalent to~%      ~
                         `(for-all (?x) (or (not (P ?x)) (Q ?x)))'"
			universalClause))
    ;; "normalizedUniversalClause" has been normalized to have the form
    ;;    (:or (:not <antecedent>) <consequent1> ... <consequent k>), where 
    ;;    k may be zero;
    (setq antecedent (second (second normalizedUniversalClause)))
    (setq consequents (cddr normalizedUniversalClause))
    (when (null consequents)		; Tautology
      (return-from form-universal-query t))
    (multiple-value-bind (antecedentCode runTimeClosedRoleTestP antecedentResidue)
	                 (form-antecedent-query antecedent universalVariables)
      ;; generate query for consequent(s), and substitute it for the symbol
      ;;    'DUMMY-CONSEQUENT-CODE in "antecedentCode";
      (when antecedentResidue		; tar 6/9/93
	  (setq antecedentResidue (simplify-wff antecedentResidue t))
	  (if (eql (car antecedentResidue) :or)
	      (loop for residue in (cdr antecedentResidue)
		    do (push residue consequents))
	      (push antecedentResidue consequents)))
      (setq consequentCode
            (form-boolean-query
             (if (rest consequents) `(:or ,@consequents) (first consequents))))
      (if (or consequentCode (null consequents)) ;  TAR 6/12/95
	  (wrap-with-run-time-open-role-catcher
	   ;; If "consequentCode" is NIL, then the implication is a tautology
	   ;; unless the normalization step rolled the consequent into the
	   ;; antecedent code.
	   (subst consequentCode 'DUMMY-CONSEQUENT-CODE antecedentCode)
	   runTimeClosedRoleTestP)
	t)) ))

(defun wrap-with-run-time-open-role-catcher (queryCode closedRoleTestP)
  ;; Helping function for "form-universal-query" and "form-equivalence-query";
  ;; If "closedRoleTestP", wrap code around "queryCode" that catches
  ;;    failures in a closed role test, and returns nil in those cases;
  (if closedRoleTestP
    `(catch :run-time-open-role-catcher ,queryCode)
    queryCode) )

(defun form-antecedent-query (antecedent universalVariables)
  ;; Helping function for "form-universal-query";
  ;; Return three values:
  ;;    (1) Query code that evaluates that portion of "antecedent"
  ;;        based on closed or run-time closable predicates;
  ;;    (2) An indicator of whether or not a run-time closed role test
  ;;        is used within the antecedent code;
  ;;    (3) A list of non-closable terms that must be folded into
  ;;        the consequent of the universal query;
  (let ((inputVariables
	  (set-difference (collect-free-variables antecedent)
			  universalVariables))
	freeVariables generatorSequence runTimeClosedRoleTestP nonClosableResidue
	remainingGeneratorVars)
    (labels ((help-form-antecedent-query (subQuery)
	       (let* ((iterationVariable (pop remainingGeneratorVars))
		      filterCode bodyCode)
                 (multiple-value-bind (generatorCode duplicateFreeP singleValueP)
                                      (form-generator-code   
                                       iterationVariable 
                                       (cdr (pop generatorSequence))
                                       :closed-role-test-p t)
                   (declare (ignore duplicateFreeP))
		   (multiple-value-bind (filterQuery residueQuery)
		                        (extract-filter-query
                                         subQuery remainingGeneratorVars nil
                                         :closed-predicates-p t)
		     (setq filterCode (form-boolean-query filterQuery))
		     (setq bodyCode
			   (if remainingGeneratorVars
                             (help-form-antecedent-query residueQuery)
                             (progn
                               (setq nonClosableResidue residueQuery)
                               'DUMMY-CONSEQUENT-CODE)))
                     (form-layer-of-query iterationVariable
                                          generatorCode
                                          singleValueP
                                          (if filterCode      ; tar 9/22/92
                                            `(or (not ,filterCode)
                                                 ,bodyCode)
                                            bodyCode)
                                          'always) )))) )
      (setq antecedent
	    (eliminate-top-level-existentials antecedent))
      (setq freeVariables (set-difference (collect-free-variables antecedent)
					  inputVariables))
      (setq generatorSequence
	    (compute-optimal-generator-sequence 
	      antecedent freeVariables universalVariables
	      :closed-generators-p t))
      (when (null generatorSequence)
	(setq generatorSequence
	      (compute-optimal-generator-sequence 
		antecedent freeVariables universalVariables
		:closed-generators-p :permit-open-roles))
	(setq runTimeClosedRoleTestP t))
      (when (null generatorSequence)
	(form-query-error
	 "Can't find a generator for the universally quantified variable~P~{ ~A~^,~}."
	 (length universalVariables)  universalVariables))
      (setq remainingGeneratorVars
	    (loop for pair in generatorSequence collect (car pair)))
; NO ONE KNOWS WHY THIS IS HERE:
;      (setq remainingNonGenExistentials
;	    (set-difference freeVariables remainingGeneratorVars))
      (values
	(help-form-antecedent-query antecedent)
	runTimeClosedRoleTestP 
	nonClosableResidue) )))
	       
(defun normalize-universally-quantified-subquery (queryBody)
  ;; Situation: "queryBody" is the body of a universal quantification;
  ;; Return a disjuction whose first term is a negated clause, and whose
  ;;    remaining terms are positive, or return nil if this form cannot
  ;;    be achieved;
  ;; Strategy:
  ;;    Apply the following transformations to lift negations to top level:
  ;;       (:and (:not P) (:not Q)) ==> (:not (:or P Q))
  ;;       (:or (:not P) (:not Q)) ==> (:not (:and P Q))
  ;;    If the result is a disjunction, collect negative terms into one term
  ;;       and return the form (:or (:not (:and P1 ... PN)) Q1 ... QN).
  ;;    In the last stage, renormalize, i.e., push any negations the haven't reached the
  ;;       top level back down to where they were before;
  (labels ((negated-term-p 
	     (term)
	     (and (consp term) (eq (first term) :not)))
	   (lift-negations (query)
             (cond ((atom query) query)
                   ((member (first query) '(:and :or))
                    (setq query
		          `(,(first query)
		            ,@(loop for term in (rest query)
                                    collect (lift-negations term))))
                    (if (loop for term in (rest query)
                              always (negated-term-p term))
                      (let ((positiveTerms
                             (loop for term in (rest query) collect (second term))))
                        `(:not
                          ,(ecase (first query)
                             (:and `(:or ,@positiveTerms))
                             (:or `(:and ,@positiveTerms)))))
		      query))
                   ((member (first query) 
                            '(:at-world-time :at-world-time+ :at-world-time-))
                    (setq query
		          `(,(first query) ,(second query) 
                            ,(lift-negations (third query))))
                    (if (negated-term-p (third query))
                      `(:not (,(first query) ,(second query)
                              ,(second (third query))))
                      query))
                   (t query))
	     ))
    (let ((normalizedQuery (lift-negations queryBody))
	  negativeTerms positiveTerms negationBody)
      (if (atom normalizedQuery)
	  nil
	  (case (first normalizedQuery)
	    (:not `(:or ,normalizedQuery))
	    (:or 
	     (when
	       (progn
		 (loop for term in (rest normalizedQuery)
		      do
		      (if (negated-term-p term)
			  (push (second term) negativeTerms)
			  (push (simplify-wff term nil) positiveTerms)))
		 negativeTerms))
	     (setq negationBody
		   (simplify-wff
		     (if (cdr negativeTerms)
			 `(:and ,@negativeTerms)
			 (first negativeTerms))
		     nil))
	     ;; Simple optimization based on subsumption.
	     (when (and (consp negationBody) 
			(typep (first negationBody) 'TBOX-CONCEPT))
	       (setq positiveTerms
		 (remove-if #'(lambda (term)
				(and (consp term)
				     (typep (first term) 'TBOX-CONCEPT)
				     (subconcept-p (first negationBody) (first term))
				     (equal (rest negationBody) (rest term))))
			    positiveTerms)))
	     `(:or (:not ,negationBody) ,@(reverse positiveTerms)))
	    (otherwise nil))) )))

(defun form-multiple-universal-queries (universalVariables universalClause)
  ;; Helping function for "form-universal-query";
  ;; "universalClause" begins with an :and;
  ;; Return an and'ed list of universal queries.
  `(and
    ,@(loop for clause in (rest universalClause)
            collect
            (or (form-universal-query universalVariables clause)
                (return-from form-multiple-universal-queries nil)))) )


  ;;
;;;;;; Compilation of Filter Terms
  ;;

(defun form-boolean-query (clause &key force-query-p)
  ;; Return a form which computes the value of the predicate "clause";
  ;; It is assumed that "clause" is either (1) a unary or nary term, 
  ;;    or (2) a clause containing an operator and one or more terms
  ;;    or other clauses;
  (when (atom clause)
    (return-from form-boolean-query clause))
  (let ((operator (car clause)))
    (if (keywordp operator)
	(ecase operator
	  ((:and :or :not)
	   (form-logical-query clause :force-query-p force-query-p))
	  (:fail
	   (form-fail-query clause :force-query-p force-query-p))
	  (:exists
	   (wrap-with-final-generators-declaration
	     (form-existential-query (list-of (second clause)) (third clause))))
	  (:forall
	   (wrap-with-final-generators-declaration
	     (form-universal-query (list-of (second clause)) (third clause))))
	  ((:previously :detects :undetects :at-agent-time)
	   (form-agent-time-offset-query clause :force-query-p force-query-p))
          ((:within-theory :within-world)
	   (form-context-query clause :force-query-p force-query-p))
	  (:at-world-time
	   (let ((*worldTimeSuffix* 'NONE))	; Different from NIL !!
	     (declare (special *worldTimeSuffix*))
	     (form-temporal-query clause :force-query-p force-query-p)))
	  (:at-world-time-
	   (let ((*worldTimeSuffix* '-))
	     (declare (special *worldTimeSuffix*))
	     (form-temporal-query clause :force-query-p force-query-p)))
	  (:at-world-time+
	   (let ((*worldTimeSuffix* '+))
	     (declare (special *worldTimeSuffix*))
	     (form-temporal-query clause :force-query-p force-query-p)))
	  ((:becomes :ceases :persists-forward :persists-backward)
	   (form-temporal-transition-query clause :force-query-p force-query-p))
	  ((:at-least :at-most :exactly)
	   (form-numeric-existential-query clause))
	  ((:all :some :the)
	   (form-restricted-universal-query clause))
	  (:same-as
	   (form-equivalence-query clause))
          (:not-same-as
           (form-equivalence-query clause :inverted-p t))
	  (:subset
	   (form-subset-query clause))
	  (:predcall
	   (form-predicate-call-query clause)))
	;; "operator" is not a keyword -- assume its is a predicate:
	(form-predicate-query clause :force-query-p force-query-p)) ))

(defun form-logical-query (logicalClause &key force-query-p)
  ;; Return a form corresponding to "logicalClause", which is a
  ;;    clause headed by an :AND, :OR, or :NOT operator;
  (let ((operator (car logicalClause))
	listOfTerms resultForm)
    (case operator
      (:not
       (form-predicate-query (second logicalClause) :inverted-p t
			     :force-query-p force-query-p))
      (otherwise				; :and or :or
       (setq listOfTerms
	     (loop for term in (cdr logicalClause)
		  when (setq term (form-boolean-query term
						      :force-query-p force-query-p))
		  collect term))
       (when (null (cdr listOfTerms))
	 (return-from form-logical-query (car listOfTerms)))
       (setq resultForm
	     `(,(ecase operator (:and 'and) (:or 'or))
	       ,@listOfTerms))
       resultForm)) ))

(defun form-fail-query (failClause &key force-query-p)
  ;; Return a form corresponding to "failClause", which is a
  ;;    clause headed by the :FAIL operator;
  `(not ,(form-boolean-query (second failClause) :force-query-p force-query-p)) )
	  	  
(defun form-numeric-existential-query (existentialClause)
  ;; Return a form corresponding to "existentialClause", which is a
  ;;    clause headed by an :AT-LEAST, :AT-MOST, or :EXACTLY operator;
  (let* ((instance (form-query-instance (second existentialClause)))
	 (integer (third existentialClause))
	 (relationRef (form-query-relation (fourth existentialClause)))
	 (qualification (and (fifth existentialClause)
			     (form-query-concept 
			       (fifth existentialClause)))))
    (ecase (car existentialClause)
      (:at-least
       `(query-at-least-p (get-temporally-offset-instance ,instance)
	                  ,relationRef ,integer ,qualification))
      (:at-most
       `(query-at-most-p (get-temporally-offset-instance ,instance)
	                 ,relationRef ,integer ,qualification))
      (:exactly
       `(query-exactly-p (get-temporally-offset-instance ,instance)
	                 ,relationRef ,integer ,qualification))) ))

(defun form-restricted-universal-query (universalClause)
  ;; Return a form corresponding to "universalClause", which is a
  ;;    clause headed by an :ALL, :SOME, or :THE operator;
  (let* ((instance (form-query-instance (second universalClause))) 
	 (relationRef (form-query-relation (third universalClause)))
	 (conceptRef (form-query-concept (fourth universalClause))))
    (ecase (car universalClause)
      (:all
       `(query-all-p (get-temporally-offset-instance ,instance)
	             ,relationRef ,conceptRef nil))
      (:some
       `(query-some-p (get-temporally-offset-instance ,instance)
	              ,relationRef ,conceptRef))
      (:the
       `(query-the-p (get-temporally-offset-instance ,instance)
	             ,relationRef ,conceptRef nil))) ))

(defun constant-form-p (expr)
  ;; Return t if "expr" is an variable or a constant;
  ;; Used to determine if we can avoid wrapping "expr" with a 
  ;;   closed role wrapper (i.e., to simplify the query code);
  (or (question-mark-variable-p expr)
      (constantp expr)))

(defun translate-closed-formula (term)
  ;; Return a formula for evaluating "term" that includes (if necessary) a run-time
  ;;    test for closure of role filler sets;
  (if (constant-form-p term)
    (translate-relational-formula term :function)
    (let* ((*runTimeClosedRoleGeneratorP* t)
           (termCode (translate-relational-formula term :function)))
      (declare (special *runTimeClosedRoleGeneratorP*))
      termCode)))

;; I assume that the following don't need get-temporally-offset-instance
;;   - TAR 3/9/93

(defun form-equivalence-query (equivalenceClause &key inverted-p)
  ;; Return a form corresponding to "equivalenceClause", which is headed
  ;;    by :same-as;
  (declare (special *finalGenerators*))
  (when (and (boundp '*finalGenerators*)
	     (loop for pair in *finalGenerators*
		   thereis (eq equivalenceClause (generator-term (cdr pair)))))
    ;; "equivalenceClause" was used as a generator, avoid duplicate predicate:
    (return-from form-equivalence-query nil))
  (let ((instance1 (translate-closed-formula (second equivalenceClause)))
        (instance2 (translate-closed-formula (third equivalenceClause))))
    (if (and (constant-form-p instance1)
             (constant-form-p instance2))
      (if inverted-p
        `(not (filler-equal ,instance1 ,instance2))
        `(filler-equal ,instance1 ,instance2))
      (wrap-with-run-time-open-role-catcher
       (if inverted-p
         `(not (same-as-p ,instance1 ,instance2))
         `(same-as-p ,instance1 ,instance2))
       t)) ))

(defun form-subset-query (subsetClause)
  ;; Return a form corresponding to "subsetClause", which is headed
  ;;    by :subset;
  ;; Note: We special-case this clause because "subset" must avoid
  ;;    temporally coercing the results of evaluating its arguments;
  (let ((instance1 (translate-closed-formula (second subsetClause)))
	(instance2 (translate-closed-formula (third subsetClause))))
    (wrap-with-run-time-open-role-catcher
     `(subset-of-set-p ,instance1 ,instance2)
     t) ))

(defun form-predicate-call-query (predCallClause)
  ;; Return a form corresponding to "predCallClause", which is headed
  ;;    by :predcall;
  (let ((arguments (loop for arg in (rest predCallClause)
			collect (translate-relational-formula arg :function))))
    `(funcall ,@arguments) ))
   
(defun form-predicate-query (term &key inverted-p force-query-p)
  ;; Return a form which computes the value of the unary or nary,
  ;;    inverted or non-inverted, term "term";
  ;; The form generally contains gensymed variables introduced in the
  ;;    let-bindings of the query;
  (when (and inverted-p 
	     (keywordp (first term)))
    (case (first term)
      (:same-as (return-from form-predicate-query
		  (form-equivalence-query term :inverted-p t)))
      ((:becomes :ceases :at-world-time :at-world-time+ :at-world-time-)
         (return-from form-predicate-query
	   `(not ,(form-boolean-query term))))
      (t (form-query-error "Can't compute the negation of the term~%~3@T~S" term))))
  (if (eq (length term) 2)
      (form-unary-predicate-query term :inverted-p inverted-p
				  :force-query-p force-query-p) 
      (form-n-ary-predicate-query term :inverted-p inverted-p
				  :force-query-p force-query-p)) )

(defun form-unary-predicate-query (term &key inverted-p force-query-p)
  ;; Return a form which computes the value of the unary predicate "term";
  ;; If the term is inverted, i.e., it appeared in a :NOT clause, use
  ;;    open-or-closed-world information to generate the query;
  ;; If "force-query-p" is non-NIL, then always generate the query.  In particular
  ;;    do not do the following optimization:
  ;; Return NIL if the effect of the predicate has already been achieved by
  ;;    a generator term;  this generator may be the predicate itself or a
  ;;    term that implies the predicate;
  ;; Generators used in the query are stored in the list *finalGenerators*,
  ;;    where each entry has the form (<variable> <generator-entry>);
  (let* ((concept (car term)))
    (flet ((generator-subsumes-term-p ()
	     (declare (special *finalGenerators*))
	     (let ((generatorEntry (and (boundp '*finalGenerators* )
					(cdr (assoc (second term) *finalGenerators*)))))
	       (and generatorEntry
		    (not inverted-p)
		    (case (generator-type generatorEntry)
		      (:concept (if (question-mark-variable-p concept) ;TAR 2/17/95
				    (eq (first (generator-term generatorEntry))
					concept)
				  (and (not (question-mark-variable-p 
					     (first (generator-term generatorEntry))))
				       (subconcept-p 
					(first (generator-term generatorEntry))
					concept))))
		      (:role (and (not (question-mark-variable-p concept)) ;TAR 2/17/95
				  (not (question-mark-variable-p
					(first (generator-term generatorEntry))))
				  (subconcept-p 
				   (implied-range 
				    (first (generator-term generatorEntry)))
				   concept)))
		      (otherwise nil))
		    (equal (generator-agent-time-expression generatorEntry)
			   (current-agent-time-expression))))))
      ;; return nil form if the generator makes the test unnecessary:
      (when (or force-query-p           ; TAR 2/23/93
		(not (generator-subsumes-term-p))
		inverted-p)
	(translate-relational-formula term :predicate :inverted-p inverted-p)) )))

(defun form-n-ary-predicate-query (term &key inverted-p force-query-p)
  ;; Return a form which computes the value of the n-ary (binary or greater)
  ;;    predicate "term";
  ;; If the term is inverted, i.e., it appears within a :NOT clause, use
  ;;    open-or-closed-role information to generate the query;
  ;; If "force-query-p" is non-NIL, then always generate the query.  In particular
  ;;    do not do the following optimization:
  ;; Return NIL if the effect of the predicate has already been achieved by
  ;;    a generator term;  this generator may be the predicate itself or the
  ;;    the inverse of the predicate;
  ;; Generators used in the query are stored in the list *finalGenerators*,
  ;;    where each entry has the form (<variable> <generator-entry>);
  (declare (special *finalGenerators*))
  (let ((relation (first term)))
    (flet 
      ((generator-subsumes-term-p
	 (generatorEntry)
	 (when (null generatorEntry)
	   (return-from generator-subsumes-term-p nil))
	 (when (question-mark-variable-p relation)
	   (return-from generator-subsumes-term-p
	     (and (equal (generator-agent-time-expression generatorEntry)
			 (current-agent-time-expression))
		  (eq term (generator-term generatorEntry)))))
	 (let ((generatorTerm (generator-term generatorEntry))
	       (inverseRelation 
		 (when (binary-p relation) (inverse relation))))
	   (and (not inverted-p)
		(equal (generator-agent-time-expression generatorEntry)
		       (current-agent-time-expression))
		(or (eq term (generator-term generatorEntry))
		    (and (binary-p relation)
			 (or (and (filler-equal (rest term) generatorTerm)
				  (subconcept-p (first generatorTerm) relation))
			     (and inverseRelation
				  (subconcept-p (first generatorTerm) inverseRelation)
				  (eq (second term) (third generatorTerm))
				  (eq (third term) (second generatorTerm))))))))))
      (unless (and (not force-query-p)	; TAR 2/23/93
		   (boundp '*finalGenerators*)	; unbound if there are no generators
		   (loop for var in (rest term)
			thereis (generator-subsumes-term-p
                                 (cdr (assoc var *finalGenerators*)))))
	(if inverted-p
          (cond
           ((computed-p relation)
            `(not ,(translate-relational-formula term :predicate)))
           ((and (binary-p relation)    ; RMM 7/8/94
                 (inverse relation)
                 (computed-p (inverse relation)))
            `(not ,(translate-relational-formula
                    `(,(inverse relation)
                      ,(third term)
                      ,(second term))
                    :predicate)))
           ((binary-p relation)
            (translate-relational-formula term :predicate :inverted-p t))
           ((concept-is-closed-p relation)
            ;; "generatorRelation" is a closed n-ary relation:
            `(not ,(translate-relational-formula term :predicate)))
           (t
            (form-query-error "Can't generate test for negation of term:~%   ~
                               ~S~%   ~
                               A possible fix is to make a closed world assumption for relation ~S"
                              term (name relation))))
          (translate-relational-formula term :predicate))) )))

(defun current-agent-time-expression ()
  ;; Return a temporal expression representing the temporal offset for
  ;;    the current subquery, or *agent-time* if there is no offset;
  (declare (special *agentTimeOffset*))
  (if (boundp '*agentTimeOffset*)
      *agentTimeOffset*
      '*agent-time*) )


  ;;
;;;;;; AgentTime Offset queries
  ;;

;;; Note: The logic applies worlds coersion and temporal offsetting
;;;    at the same decision point.

(defun form-agent-time-offset-query (temporalClause &key force-query-p)
  ;; Return a form that evaluates the body of "clause" in a temporally
  ;;    offset context;
  ;; Generate code that modifies the special query variable *query-agent-time*
  ;;    to indicate a specific temporal context;
  ;; Bind the variable *agentTimeOffset* to indicate a special
  ;;    temporal context for code generated inside of this clause;
  ;; Note: At this point, a :detects or :undetects operator should have been eliminated,
  (when (member (first temporalClause) '(:detects :undetects  ))
    (error ":detects or :undetects clause didn't get converted"))
  (let (nonTemporalQuery nonTemporalCode *agentTimeOffset*)
    (declare (special *agentTimeOffset*))
    (multiple-value-setq (*agentTimeOffset* nonTemporalQuery)
      (ecase (first temporalClause)
	(:previously
	 (values '*previously* (second temporalClause)))
	(:at-agent-time
	 (values (second temporalClause) (third temporalClause)))))
    ;; return temporal query iff "nonTemporalCode" is not nil:
    (when (setq nonTemporalCode (form-boolean-query nonTemporalQuery
						    :force-query-p force-query-p))
      (wrap-with-agent-time-offset nonTemporalCode *agentTimeOffset*)) ))

(defun wrap-with-agent-time-offset (query agentTimeExpression)
  ;; Rebind the special query variable *query-agent-time* to indicate
  ;;    the time indicated by "agentTimeExpression";
  (if agentTimeExpression
      `(let ((*query-agent-time* ,agentTimeExpression))
	 ,(if (member agentTimeExpression `(*agent-time* *previously*))
	      query
	      `(if (< *query-agent-time* *history-limit*)
		   (warn-time-point-out-of-bounds *query-agent-time*)
		   ,query)))
      query ))

(defun compute-world-time-form (worldTimeExpression)
  ;; Turn "worldTimeExpression" into a proper time form, accounting for time
  ;;   shifts due to transition offsets;
  (declare (special *worldTimeSuffix*))
  (cond ((and (consp worldTimeExpression)	; Is this still needed? zzz
	      (eq (first worldTimeExpression) '1-))
	 (grumble "Shouldn't be here in COMPUTE-WORLD-TIME-FORM")
	 `(1- (parse-time-expression ,(second worldTimeExpression))))
	;; Do constant folding:
	((integerp worldTimeExpression)
	 worldTimeExpression)
	((stringp worldTimeExpression)
	 (parse-time-expression worldTimeExpression))
	(t
	 `(parse-time-expression ,worldTimeExpression))))

(defun wrap-with-worldTime-offset (query worldTimeExpression)
  ;; Rebind the special query variable *query-world-time* to indicate
  ;;    the time indicated by "worldTimeExpression";
  ;; "worldTimeExpression" has the format of (<suffix> <timeExpression>);
  (if worldTimeExpression
      `(let ((*query-world-time* ,(compute-world-time-form
				   (second worldTimeExpression)))
	     (*query-world-time-suffix* ',(first worldTimeExpression)))
	 ,query)
      query ))

(defun warn-time-point-out-of-bounds (queryAgentTime)
  ;; Helping function for "wrap-with-agent-time-offset";
  ;; Emit a run-time warning, and return nil (indicating failure
  ;;    of the temporally offset subquery);
  (complain "~%Warning: Attempt to query at time point ~S, which is
         earlier than the history limit ~S"
	  queryAgentTime *history-limit*)
  nil )

;;; CONSIDER ELIMINATING THESE TWO, REPLACING EACH WITH
;;;    A MORE GENERAL VERSION THAT EXPANDS THE LOGIC
;;;    OF "get-now-xxx" and "get-previously-xxx" IN LINE,
;;;    THEREBY AVOIDING A FUNCTION CALL.

(defun get-agent-time-offset-instance (instance)
  ;; Situation:  We know world time is not involved.
  ;; During a query, map "instance" into an instance that matches the
  ;;    active agent time context;
  ;;  EASY WAY TO GET COERSION FOR WORLDS -- IF WE DECIDE TO IMPLEMENT
  ;;    WORLD COERSION AT A LOWER LEVEL THEN ELIMINATE THIS (FOR WORLDS,
  ;;    ITS NOW PARTIALLY REDUNDANT IN COMBINATION WITH "get-instance"):
  ;; THIS CODE MISSES OUT ON THE CACHING -- FIGURE OUT WHERE WORLDS
  ;;    COERSION BELONGS, AND THEN PUT IN CACHING!!!
;  (when *world*
;    (setq instance (get-instance-in-*world* instance)))
  (if (= *query-agent-time* *agent-time*)
      instance
      (or (get-instance-at-time-point instance *query-agent-time*)
	  (error "Can't evalutate query at time ~S." *query-agent-time*))) )

(defun get-temporally-offset-instance (instance)
  ;; Situation:  We know that world time might be involved.
  ;; During a query, map "instance" into an instance that can handle the
  ;;    active temporal (agent + world) environment;
  ;; That means that if *query-world-time* is bound, we need to go to a time
  ;;    map (if the instance has one!);
  (declare (inline get-agent-time-offset-instance))
  (if (boundp '*query-world-time*)
    (or (time-map instance)
        (get-agent-time-offset-instance instance))
    (get-agent-time-offset-instance instance)))
  
(defun get-temporally-offset-set-of-instances (setOfInstances)
  ;; During a query, map "setOfInstances" into the set of instances that
  ;;    matches the active temporal context;
  ;; SEE ABOVE COMMENT ABOUT REDUNDANCY:
  (when (null setOfInstances)
    (return-from get-temporally-offset-set-of-instances nil))
  (when (not (listp setOfInstances))
    (setq setOfInstances 
	  (compute-members-of-collection-instance setOfInstances)))
  ;  (when *world*
  ;    (setq setOfInstances (get-set-in-*world* setOfInstances)))
  (if (= *query-agent-time* *agent-time*)
    setOfInstances 
    (or (get-set-of-instances-at-time-point setOfInstances *query-agent-time*)
        (error "Can't evalutate query at time ~S." *query-agent-time*))) )

  ;;
;;;;;; Temporal queries
  ;;

;; These queries use world time as well as agent time.
;;

(defun form-context-query (contextClause &key force-query-p)
  ;; Return a form that evaluates the body of "clause" within the specified
  ;;    context;
  ;; Generate a call to within-context around the query code;
  (let ((contextForm (translate-context-formula (second contextClause)))
	innerQuery bindings)
    (ecase (first contextClause)
      (:within-world
       (when (setq innerQuery (form-boolean-query (third contextClause)
						  :force-query-p force-query-p))
	 `(within-context ,contextForm ,innerQuery)))
      (:within-theory
       (let ((*queryContext* contextForm) *letVariables*)
	 (declare (special *letVariables* *queryContext*))
         (if (question-mark-variable-p contextForm)
           (setq innerQuery (form-boolean-query (third contextClause)
                                                :force-query-p force-query-p))
           (if (quoted-p contextForm)
             (setq innerQuery
                   (within-context (second contextForm)
                     (form-boolean-query (third contextClause)
                                         :force-query-p force-query-p)))
             (setq innerQuery 
                   (within-context contextForm
                     (form-boolean-query (third contextClause)
                                         :force-query-p force-query-p)))))
	 (when innerQuery
	   (loop for entry in *letVariables*
	       when (search-tree-p (third entry) innerQuery) ;RMM 4/7/92
	         do (push (form-query-let-binding-clause entry nil) bindings))
	   (if bindings
	       `(within-context ,contextForm
		  (let ,bindings
		    (and ,@(mapcar #'first bindings)  ; Make sure bindings exist!
			 ,innerQuery)))
	       `(within-context ,contextForm ,innerQuery))) ))) ))
      

(defun form-temporal-query (temporalClause &key force-query-p)
  ;; Return a form that evaluates the body of "clause" in a temporal
  ;;    context;
  ;; Generate code that modifies the special query variable *query-world-time*
  ;;    to indicate a specific temporal context;
  ;; Bind the variable *agentTimeOffset* to indicate a special
  ;;    temporal context for code generated inside of this clause;
  ;; Inside the temporalClause a :becomes or :ceases can appear, although they
  ;;    don't have to.
  (declare (special *worldTimeSuffix*))
  (let ((innerQuery (form-boolean-query (third temporalClause)
					:force-query-p force-query-p)))
    (when innerQuery
      `(let ((*query-world-time* ,(compute-world-time-form
				   (second temporalClause)))
	     (*query-world-time-suffix* ',*worldTimeSuffix*))
	 ,innerQuery)) ))

(defun form-temporal-transition-query (temporalClause &key force-query-p)
 ;; Situation:  temporalClause starts with a :becomes or :ceases;
 ;; Sets force-query-p to T in sub-calls because transitions are not checked by
 ;;    generator code.
 ;; NOTE:  The + side is always checked first because that supports
 ;; the best use of the temporal caching mechanism.
  (declare (ignore force-query-p))
  (let ((innerClause (form-boolean-query (second temporalClause)
					 :force-query-p t)))
    (ecase (car temporalClause)
      (:becomes `(and (let ((*query-world-time-suffix* '+))
			,innerClause)
		      (let ((*query-world-time-suffix* '-))
			(not ,innerClause))))
      (:ceases `(and (let ((*query-world-time-suffix* '+))
			(not ,innerClause))
		      (let ((*query-world-time-suffix* '-))
			,innerClause)))) ))


  ;;
;;;;;; Support Functions
  ;;

(defun form-query-warning (message &rest arguments)
  ;; Broadcast a warning message, and then resume query-processing;
  (declare (special *queryPicture*))
  (when (member :warn-about-syntax-corrections *loom-dialogue-features*)
    (complain "~%Warning:   ~?." message arguments)
    (if (consp *queryPicture*) 
	(complain "~%Warning occurred in the query:~%   ~S~%" *queryPicture*)
	(complain "~%Warning occurred inside of the object:~%   ~S~%"
		  (generate-object-definition *queryPicture*)))) )

(defun form-query-error (message &rest arguments)
  ;; Send an error message, and pop out of "form-query";
  (declare (special *queryPicture* *codeObjectBeingSealed*
                    *predicatesBeingCompiled*))
  (labels ((mark-bad-definition (conceptOrFeature)
             (typecase conceptOrFeature
               (TBOX-CONCEPT (mark-as-bad-definition conceptOrFeature))
               (FEATURE (loop for dep in (dependents conceptOrFeature)
                              do (mark-bad-definition dep))))))
    (let ((queryOrProposition
	   (if (and (consp *queryPicture*)
		    (member (first *queryPicture*) '(tell forget)))
             "proposition"
             "query"))
          (inRelation (or (and (boundp '*codeObjectBeingSealed*)  ; TAR 7/18/94
                               *codeObjectBeingSealed*)
                          (and (boundp '*predicatesBeingCompiled*) 
                               (car *predicatesBeingCompiled*))))) ; reliable?
      (when (member :suppress-diehard-output LOOM::*loom-dialogue-features*)
	;; Early exit to avoid pprint statements;
	(when (and inRelation
		   (neq inRelation *queryPicture*))
	  (mark-bad-definition inRelation))
	(throw 'form-query-catcher nil))
      (complain "~%~:(~A~) formation error:~%   ~?" queryOrProposition
	        message arguments)
      (if (consp *queryPicture*) 
        (progn (complain "~%Error occurred in the ~A:" queryOrProposition)
               (pprint *queryPicture* *error-output*))
        (progn (complain "~%Error occurred inside of the object:")
               (pprint (generate-object-definition *queryPicture*)
                       *error-output*)))
      (when (and inRelation
                 (neq inRelation *queryPicture*))
        (complain "~%while ~:[compiling a function for~;sealing~] ~S.~%"
                  (boundp '*codeObjectBeingSealed*)
                  inRelation)
        (mark-bad-definition inRelation))
      (throw 'form-query-catcher nil) )))

(defun forcing-get-predicate (name concept/relation arity)
  ;; Find the concept or relation with name "name";
  ;; Generate an error if predicate cannot be found;
  (declare (special *predicateReferences*))
  (let ((predicate
	  (case concept/relation
	    (:concept (get-sealed-concept name :no-error-p t))
	    (:relation (get-sealed-relation name :no-error-p t)))))
    (when (or (null predicate) (undefined-concept-p predicate))
      (form-query-error "The ~(~A~) ~S is not defined"
			(symbol-name concept/relation) name))
    (when (/= arity (arity predicate))
      (form-query-error "Wrong number of arguments to ~A ~S."
			concept/relation name))
    (pushnew predicate *predicateReferences*)
    predicate ))

(defun get-query-bound-variable (predicate arity)
  (declare (special *validateQueryBindings*))
  (let* ((testItem `(',predicate ,arity))
         (found (find testItem *validateQueryBindings*
                      :test #'(lambda (x y) (and (eq (cadar x) (cadadr y))
                                                 (eq (second x) (third y))))))
         newVar)
    (if found
      (fourth found)
      (progn (setq newVar (gensym "?PRED-"))
             (push `(,(loom-constant THE-RELATION) ,@testItem ,newVar)
                   *validateQueryBindings*)
             newVar)) ))

;; NOTHING CALLS THIS FUNCTION!!!:
;(defun find-predicate-in-formula (formula variable)
;  ;; Walk "formula" searching for an expression of the
;  ;;    form (predicate "variable");
;  ;; Return the predicate if such an expression is found;
;  ;; BUG???: APPEARS IT CAN RETURN A CONCEPT, BUT CALLER ALWAYS EXPECTS
;  ;;    A RELATION;
;  (let (predicate)
;    (cond
;      ((atom formula) nil)
;      ((and (unary-term-p formula)
;	    (eq (second formula) variable))
;       (car formula))
;      (t
;       (loop for arg in (cdr formula)
;	    when (setq predicate (find-predicate-in-formula arg variable))
;	    return predicate))) ))

(defun indexed-relation-p (identifier)
  ;; Return t iff "identifier" is an indexed-relation name
  ;;    of the form <relation[scalar]>;
  (find #\[ (symbol-name identifier)) )

(defun parse-indexed-relation (relationOrIdentifier)
  ;; Return 2 values: the relation and index components of the
  ;;    indexed-relation named "identifier";
  ;; TO DO: validate index;
  (let* ((idString (symbol-name relationOrIdentifier))
	 (\[position (position #\[ idString)))
    (if \[position
	(values
	  (read-from-string (subseq idString 0 \[position))
	  (read-from-string 
	    (string-trim "[]" (subseq idString \[position)))) 
	(values relationOrIdentifier nil)) ))

(defun form-query-concept (concept)
  ;; Return a system-generated variable which evaluates to "concept" 
  ;;    at run-time;
  (declare (special *inputVariables* *queryContext*))
  (cond ((and (boundp '*queryContext*)
	      (question-mark-variable-p *queryContext*))
	 (form-query-let-variable concept :concept))
	((question-mark-variable-p concept)
	 (if (and (boundp '*inputVariables*)
		  (member concept *inputVariables*)) ;  TAR 8/18/94
	     (form-query-let-variable concept :concept)
	     concept))
	 (t (form-concept-referent concept t))) )

(defun form-query-relation (relation)
  ;; Return a system-generated variable which evaluates to "relation" 
  ;;    at run-time;
  (declare (special *queryContext*))
  (if (or (question-mark-variable-p relation)
	  (and (boundp '*queryContext*)
	       (question-mark-variable-p *queryContext*)))
      (form-query-let-variable relation :relation)
      (form-concept-referent relation t)) )

(defun form-query-instance (instance)
  ;; If it is a symbol identifying an instance object,
  ;;    return a system-generated variable that will evaluate to that object;
  ;; If it is an variable (internal or external), just return it;
  (integrity-check (atom instance))
  (if (identifier-reference-p instance)
      (form-query-let-variable instance :instance)
      ;; "instance" is a variable:
      instance) )

(defun form-query-let-variable (expression exprType &key relation)
  ;; Return a local variable which is bound at run-time to a LOOM object;
  ;; If this is the first occurrence of "expression" in the current tell,
  ;;    push an entry headed by "expression" onto a list of let-variables that 
  ;;    will be used to construct let-binding clauses;
  ;; The entry contains three or four elements: 
  ;;    (1) "expression", which may be a concept, relation, or instance name;
  ;;    (2) the type of "expression", e.g., :concept;
  ;;    (3) the local variable associated with "expression";
  ;;    (4) "tell" and "forget" sometimes place "relation" here;
  ;; TO DO: BECAUSE WE NOW GENERATE GLOBAL VARIBLES TO HOLD POINTERS TO
  ;;    CONCEPTS AND RELATIONS, WE CAN ELIMINATE ALL BUT REFERENCES TO
  ;;    INSTANCES FROM LET-BINDING CLAUSES;
  (declare (special *letVariables* *queryContext*))
  (let ((entry (assoc expression *letVariables*))
        name variable)
    (if entry
      (third entry)
      (progn
        (setq name (case exprType
                     ((:concept :relation) (name expression))
                     (:world-time "WTIME")
                     (otherwise expression)))
        (setq variable (form-gensym-variable name))
        (push
         (if relation
           (list expression exprtype variable relation)
           (list expression exprtype variable))
         *letVariables*)
        variable)) ))

(defun form-gensym-variable (prefix)
  ;; Form a unique variable name having the prefix "prefix";
  ;; Reset the Lisp gensym prefix to its default value;
  (prog1
    (gensym (string-append prefix "-"))
    (gensym "G")) )

(defun form-query-let-binding-clause (letVariablesEntry errorIfNotFoundP)
  ;; EaCh "letVariablesEntry" is built by "form-query-let-variable" and has the form 
  ;;    (<expression> <expression-type> <expression-variable>);
  ;; Return a "let" clause that binds <expression-variable> to the concept,
  ;;    relation, or instance indicated by <expression>;
  ;; TO DO: BECAUSE WE NOW GENERATE GLOBAL VARIBLES TO HOLD POINTERS TO
  ;;    CONCEPTS AND RELATIONS, WE CAN ELIMINATE ALL BUT REFERENCES TO
  ;;    INSTANCES FROM LET-BINDING CLAUSES;
  (flet ((form-instance-referent (expression)
	   (let ((evaluableExpression
		   (if (identifier-reference-p expression)
		       `',expression
		       expression)))
	     (if errorIfNotFoundP
		 `(get-instance-or-signal-error ,evaluableExpression)
	         `(or (get-instance ,evaluableExpression)
		      (get-sealed-concept ,evaluableExpression :no-error-p t)
		      (get-sealed-relation ,evaluableExpression :no-error-p t))))))
    (let ((expression (car letVariablesEntry))
	  (exprType (second letVariablesEntry))
	  (variable (third letVariablesEntry))
	  referenceCode tboxObject)
      (setq referenceCode 
	    (if (question-mark-variable-p expression)
		(ecase exprType
		  (:concept `(get-sealed-concept ,expression))
		  (:relation `(get-sealed-relation ,expression)))
		(ecase exprType
		  ((:concept :relation)
		   (form-concept-referent expression errorIfNotFoundP))
		  (:instance
		   (cond
		    ((null errorIfNotFoundP)
		     (form-instance-referent expression))
		    ((get-instance expression)
		     (form-instance-referent expression))
		    ((setq tboxObject (or (get-sealed-relation expression :no-error-p t)
					  (get-sealed-concept expression :no-error-p t)))
		     (form-concept-referent tboxObject nil))
		    (t
		     (form-instance-referent expression)))))))
      `(,variable ,referenceCode) )))

(defun get-instance-or-signal-error (instanceOrSymbol)
  ;; Helping function for "form-query-let-binding-clause";
  ;; Situation: An instance reference is being evaluated inside of
  ;;    a query;
  ;; Return an instance or signal an error indicating that
  ;;    for some query, no instance could not be found;
  (declare (inline get-instance))
  (or (get-instance instanceOrSymbol)
      (error "Can't find instance ~S while evaluating query."
	     instanceOrSymbol)) )

(defun get-instance-let-variable (identifier)
  ;; Return the system-generated let-variable associated with the instance 
  ;;    named "identifier";
  (declare (special *letVariables*))
  (let ((letVariable (third (assoc identifier *letVariables*))))
    (or letVariable identifier) ))

;; OBSOLETE: RMM 2/24/92
(defun quote-constant-references (formula)
  ;; Condition "formula" such that constants that identify instances are
  ;;    replaced by system-generated variables that will evaluate to those
  ;;    instances at run-time;
  ;; This includes placing quotes in front of symbolic constants;
  ;; Called by "help-translate-formula";
  ;; Tricky: "formula" may be a generator rather than a predicate, in which
  ;;    case the last argument (the range) is missing;
  (flet ((maybe-quote-argument
	   (argument domain)
	   (if (and domain
		    (constant-concept-p domain)
		    (identifier-reference-p argument))
	       `',argument
	       argument)))
    (when (atom formula)
      (return-from quote-constant-references formula))
    (let (predicate lastArgument)
      (setq predicate (car formula))	
      (cond
	((concept-p predicate) 
	 (when (and (setq lastArgument (second formula))
		    (constant-concept-p predicate)
		    (identifier-reference-p lastArgument))
	   (setq formula `(,predicate ',lastArgument))))
	((relation-p predicate)
	 (setq formula
	       `(,predicate ,@(loop for domain
				    in (etypecase predicate 
					 (BINARY-RELATION (list (implied-domain predicate)
								(implied-range predicate)))
					 (N-ARY-RELATION (append (implied-domains predicate)
								 (list (implied-range predicate)))))
				    as arg in (cdr formula)
				    collect (maybe-quote-argument arg domain))))))
      formula )))


(defun form-concept-referent (concept errorIfNotFoundP)
  ;; Return an expression that evaluates to a pointer to "concept";
  ;; QUESTION: WHY ISN'T THE CONTEXT :context ARGUMENT INSERTED HERE???:
  ;; ANSWER: BECAUSE RUNTIME CONTEXT LOOKUP IS TOO SLOW???
  (if errorIfNotFoundP
      (or (predicate-symbol concept)
	  `(,(if (concept-p concept) 'get-sealed-concept 'get-sealed-relation)
	       ',(name concept)))
    `(,(if (concept-p concept) 'get-sealed-concept 'get-sealed-relation)
	 ',(name concept) :no-error-p t)) )

(defun role-is-filled-up-p (instance role)
  ;; Performs a cardinality test on "role" of "instance" to determine
  ;;    whether the context contains as many fillers of that role
  ;;    as are possible;
  ;; Used for open-world queries containing negation;
  (let ((fillers (collect-all-role-fillers instance role))
	(max (smallest-asserted-max role nil (asserted-features instance))))
    (if (role-is-single-valued-p role)
	(or fillers
	    (and (integerp max)			; not +Infinity
		 (zerop max)))
	(and (integerp max) 
	     (= (length fillers) max))) ))

(defun create-query-goal-table ()
  ;; Return an empty hash table for storing query goals;
  (make-hash-table :test #'equal) )

  ;;
;;;;;; "get-matching-instances"
  ;;

(defun get-matching-instances (conceptList role/fillersPairs)
  "Return a list of all instances that satisfy each of the concepts in `conceptList'
and have role fillers matching each of the fillers in `role/fillersPairs'.  When
none of the roles has an generator on its inverse, the first concept in
the list is used as the generator of instances (so be careful how you order
that list)."
  (let (relationList)
    (setq conceptList (loop for concept in conceptList
	                    collect (get-concept concept)))
    ;; translate role pairs into conses, one filler per cons:
    (setq role/fillersPairs
	  (loop for (role . fillers) in role/fillersPairs
                as relation = (get-sealed-relation role)
                do (push relation relationList)         ;  TAR 8/9/95
	        nconc (loop for filler in fillers
                            as instance = (get-instance filler)
                            when instance         ;  TAR 7/7/95
		              collect (cons relation instance)
                              else do (grumble "Couldn't find instance ~A in GET-MATCHING-INSTANCES" 
                                               filler)
                                       (return-from get-matching-instances nil))))
  (ensure-visibility-of-updates)
  (multiple-value-bind 
    (generatorRoleOrIndex indexP)
    (select-inverse-role-generator relationList conceptList)
    (cond
     (indexP
      (get-matching-instances-using-index-generator
       generatorRoleOrIndex conceptList role/fillersPairs))
     (generatorRoleOrIndex
      (get-matching-instances-using-inverse-of-role-generator
       generatorRoleOrIndex conceptList role/fillersPairs))
     (t
      (get-matching-instances-using-concept-generator
       conceptList role/fillersPairs))) )))
       
(defun select-inverse-role-generator (roles concepts)
  ;; Helping function for "get-matching-instances";
  ;; Return two values:
  ;;    (1) a role or index that can serve as a generator of instances
  ;;        with values determined by roles in "roles";
  ;;    (2) t if an index was returned;
  ;; Instead of trying for an optimal generator, we pick the first one we find;
  (loop for r in roles
        do
	(when (member :illegal-role-index (system-attributes r))
	  (complain "~&Illegal index: The role ~S is not a primitive, single-valued role
with no subroles or antecedents." r))  ; DGB 7/30/93
        (loop for index in (query-indices r)
              when (and (or (null (rest (index-roles index)))
                            (subset-p (index-roles index) roles))
                        (member (indexed-concept index) concepts          ;  TAR 8/9/95
                                :test #'(lambda (x y) (subconcept-p y x))))
              do (return-from select-inverse-role-generator (values index t)))
        (when (and (inverse r)
                   (generator-predicate-p (inverse r)))
          (return-from select-inverse-role-generator (values r nil))))
  (values nil nil) )

(defun get-matching-instances-using-index-generator (index concepts role/fillerPairs)
  ;; Called by get-matching-instances;
  ;; Return a list of instances retrieved from "index" by keying on role values
  ;;    in  "role/fillerPairs";
  ;; Filter the instances with "concept" and roles not belonging to the index;
  ;; CAUTION: Assumes that roles in an index are single-valued;
  (let* ((indexRoles (index-roles index))
         (key (loop for role in indexRoles
                    collect (cdr (assoc role role/fillerPairs))))
         otherPairs instances)
    (when (null (rest indexRoles))
      (setq key (first key)))
    ;; remove index roles from role/filler pairs:
    (setq otherPairs (loop for pair in role/fillerPairs
                           unless (member (car pair) indexRoles)
                           collect pair))
    (setq instances (gethash key (index-hash-table index)))
    (when (and (unique-key-p index)
               instances)
      (setq instances (list instances)))
    (filter-matched-instances instances concepts otherPairs) ))

(defun get-matching-instances-using-inverse-of-role-generator
       (role concepts role/fillerPairs)
  ;; Called by get-matching-instances;
  ;; Return a list of instances produced by appying the inverse of "role"
  ;;    to the appropriate filler(s?) in "role/fillerPairs";
  ;; Filter the instances with "concept" and roles other than "role";
  ;; Tricky: "role" might not be single-valued, and might have more
  ;;    than one filler, so we remove only one role entry from "role/fillerPairs";
  (let ((roleEntry (assoc role role/fillerPairs)))
    (filter-matched-instances
     (get-values (cdr roleEntry) (inverse role))
     concepts
     (remove roleEntry role/fillerPairs)) ))


(defun get-matching-instances-using-concept-generator (concepts role/fillerPairs)
  ;; Called by get-matching-instances;
  ;; Return a list of instances that satisfy all concepts in "concepts"
  ;;    and have role values that match "role/fillerPairs";
  (let ((generatorConcept
         (or (loop for c in concepts
                   when (generator-predicate-p c)
                   return c)
             *thing*)))
    (loop for (role . nil) in role/fillerPairs          ; RMM 6/28/93
          when (subconcept-p (implied-domain role) generatorConcept)
          do (setq generatorConcept (implied-domain role)))
    (when (eq generatorConcept *thing*)
      (complain "~&Performance Warning: `Get-Matching-Instances' scans entire
context to generate instances prior to filtering.~%"))
    (filter-matched-instances
     (generate-instances generatorConcept)
     (remove generatorConcept concepts)
     role/fillerPairs) ))

(defun filter-matched-instances (instances conceptList role/fillerPairs)
  ;; Helping function for "get-matching-instances" helpers;
  ;; Return a subset of "instances" that satisfied concepts in
  ;;    "concepts" and matches role values in "role/fillerPairs";
  (let (compiledPredicate)
    (loop for i in instances
          when (and (loop for concept in conceptList
		          always (has-instance-p concept i))
	            (loop for (role . filler) in role/fillerPairs
                          as symbol = (predicate-symbol role)   ;  TAR 8/25/95
		          always (cond ((setq compiledPredicate 
                                              (get symbol :loom-compiled-predicate))
	                                (funcall compiledPredicate i filler))
                                       ((role-is-single-valued-p role)   ; TAR 9/27/93.  Removed
                                        (filler-equal filler (funcall symbol i)))
                                       (t       ; use function
	                                (member filler (funcall symbol i)
                                                :test #'filler-equal)))))
          collect i) ))


  ;;
;;;;;; "query"
  ;;

;; Option 1:  No special handling of free variables.  They are not allowed.
;(defun compile-query-function (variableList expression)
;  ;; Create and compile a function to execute
;  ;;      "(retrieve ,variableList ,expression)";
;  (let ((freeVariables (set-difference (collect-free-variables expression)
;				       (list-of variableList))))
;    (if freeVariables
;	(progn (cerror "Skip the query and return NIL."
;		       "Variable~P ~{~S~^, ~} appear~:[s~;~] free in~%   ~S~
;                        ~%This will fail."
;		       (length freeVariables) freeVariables (cdr freeVariables)
;		       expression)
;	       #'(lambda () nil))
;	(compile nil `(lambda ()
;                       (declare (optimize (compilation-speed 3)))
;			(retrieve ,variableList ,expression)))) ))

;; Option 2:  Free variables are declared special.
;;            They must also be declared special globally or when bound.
(defun compile-query-function (variableList expression)
  ;; Create and compile a function to execute
  ;;      "(retrieve ,variableList ,expression)";
  ;; Declare any free variables in "expression" not bound in "variableList"
  ;;   to be special variables;
  ;; If "*queryPicture*" is bound, then make sure all free variables are bound.
  ;;    If all free variables are not bound generate a query formation error.
  ;;    The caller is then responsible for catching the throw.
  (declare (special *queryPicture*))
  (let ((freeVariables (set-difference (collect-free-variables expression
                                                        :validate-keyword-p t)
				       (list-of variableList))))
    (if freeVariables
	(progn
	  (when (boundp '*queryPicture*)
	    (loop for variable in freeVariables
		  unless (boundp variable)
		  collect variable into unboundVariables
		  finally (when unboundVariables
			    (form-query-error
			      "~%Variable~P~{ ~S~^,~} ~:[is~;are~] ~
                                     unbound or not declared special"
			      (length unboundVariables)
			      unboundVariables
			      (cdr unboundVariables)))))
	  (compile nil `(lambda ()
			  (declare (special ,@freeVariables)
				   (optimize (compilation-speed 3)))
			  (retrieve ,variableList ,expression))))
	(compile nil `(lambda ()
			(declare (optimize (compilation-speed 3)))
			(retrieve ,variableList ,expression)))) ))


;; Option A:  Generalize COMPILE-QUERY-FUNCTION to take a lambdaList and return
;;            a function with that lambda List.  This can obviate the need to
;;            use special variables.
;(defun compile-query-function (lambdaList queryVariableList expression)
;  ;; Create and compile a function to execute
;  ;;      "(retrieve ,queryVariableList ,expression)";
;  (let ((freeVariables (set-difference (collect-free-variables expression)
;				        (append lambdaList (list-of queryVariableList)))))
;    (if freeVariables
;	(progn (when lambdaList
;		 (inform "~%Making query function with both a lambda list ~S~%~
;                            and free variables ~S" lambdaList freeVariables))
;	       (compile nil `(lambda lambdaList
;			       (declare (special ,@freeVariables)
;                                       (optimize (compilation-speed 3)))
;			       (retrieve ,queryVariableList ,expression))))
;	(compile nil `(lambda lambdaList
;                       (declare (optimize (compilation-speed 3)))
;			(retrieve ,queryVariableList ,expression)))) ))

(defun query (variableList expression)
  "Functional interface for running arbitrary queries.  Supports the
same query language as RETRIEVE.  `variableList' is either a single
variable or a list of query variables.  It may be empty.  `expression'
is a query expression suitable for RETRIEVE."
  ;; First analyze the variable list and expression to determine whether a 
  ;;   simpler query form such as "ask" or "get-matching-instances" can be used.
  ;;   If not, then create and compile a call to retrieve.
  (declare (inline compile-query-function)
	   (special *queryPicture*))
  (let ((conceptList nil)
	(role/fillersPairs nil))
    (labels ((basic-form-p (variable form)
	       (and (consp form)
		    (symbolp (first form))
		    (not (keywordp (first form)))
		    (eql (second form) variable)))
	     (concept-form-p (variable form)
	      (and (basic-form-p variable form)
                   (not (property-p (find-concept (first form) :no-warning-p t)))       ;  TAR 3/8/96
		   (null (cddr form))))
	     (binary-relation-form-p (variable form)
	      ;; NOTE: This must follow concept-form-p in tests because
	      ;;   it only tests for length <= 3, instead of = 3.
	      (and (basic-form-p variable form)
		   (not (question-mark-variable-p (third form)))
		   (null (cdddr form))))
	     (check-for-simple-query-p ()
	      ;; Determine whether the "variableList" and "expression" are
	      ;;   simple enough to be handled by "get-matching-instances";
	      ;; It is simple enough if all of the following hold:
              ;;   (1)  only a single variable
              ;;   (2)  at least one concept argument
	      ;;   (3)  either the concept alone at top-level or a single
	      ;;        top-level :and construct
	      ;;   (4)  nothing but concept and binary relation forms.
	      ;; If so, generate the arguments;
	     (let (variable)
	       (when (and variableList
			  (or (symbolp (setq variable variableList))
			      (and (consp variableList)
				   (null (cdr variableList))
				   (symbolp (setq variable
						  (car variableList))))))
		 (cond ((not (consp expression)) nil)
		       ((member (first expression) '(:and and))
			(loop for form in (rest expression)
			      do (cond ((concept-form-p variable form)
					(push (first form) conceptList))
				       ((binary-relation-form-p variable form)
					(push `(,(first form) ,(third form))
					      role/fillersPairs))
				       (t (return-from
					    check-for-simple-query-p nil))))
			(setq conceptList (nreverse conceptList))) ; Make sure at least 1 concept
		       ((concept-form-p variable expression)
			(push (first expression) conceptList)
			t)
		       (t nil))) )))
      (if (check-for-simple-query-p)
	  (if (consp variableList)
	      (mapcar #'list (get-matching-instances conceptList role/fillersPairs))
	      (get-matching-instances conceptList role/fillersPairs))
	  (progn (setq *queryPicture* `(query ',variableList ',expression))
		 (catch 'form-query-catcher
		   (funcall (compile-query-function variableList expression))))) )))
#||

(defconcept c)
(defconcept d)
(defrelation r)
(defrelation s)

(tellm (:about bill c d (r 3) (r 4) (s 3) (s 4))
       (:about bob  c   (r 6) (r 4)       (s 4)))

(trace get-matching-instances)			;* = get-matching-instances used
(query '(?x) '(C ?x))				;*=> ((Bill) (Bob))
(query '?x   '(C ?x))				;*=> (Bill Bob)
(query '(?x) '(D ?x))				;*=> ((Bill))
(query nil '(C bill))				; => t  [(|C|C |C|THING)]
(query nil '(D bob))				; => nil
(query '(?x) '(:and (c ?x) (d ?x)))		;*=> ((Bill))
(query '?x   '(:and (c ?x) (d ?x)))		;*=> (Bill)
(query '(?x) '(:and (c ?x) (r ?x 4) (s ?x 4)))	;*=> ((Bill) (Bob))
(query '?x   '(:and (c ?x) (r ?x 4) (s ?x 4)))	;*=> (Bill Bob)
(query '?x   '(:and (c ?x) (:exists (?a)
			     (:and (r ?x ?a)
				   (s ?x ?a))))) ; => (Bill Bob)
(query '(?x) '(:and (c ?x) (r ?x 4) (r ?x 3)))	;*=> ((Bill))
(query '(?x ?y) '(:and (c ?x) (s ?x ?y)))	; => ((Bill 3) (Bill 4) (Bob 4))
(query '?x '(:about ?x c (r 4)))		; => (Bill Bob)
(query '?x '(:about ?x c (s 3)))		; => (Bill)
(query '?x '(:about ?x c (:at-least 2 s)))	; => (Bill)

(let ((?rv 4) (?sv 4))
  (declare (special ?rv ?sv))
  (query '?x   '(:and (c ?x) (r ?x ?rv) (s ?x ?sv))))  ; => (Bob Bill)

(let ((?rv 4) (?sv 3))
  (declare (special ?rv ?sv))
  (query '?x   '(:and (c ?x) (r ?x ?rv) (s ?x ?sv))))  ; => (Bill)
||#


;;; BUGS:

#|

WE CAN'T USE VARIABLES INSIDE OF A NON-TOP-LEVEL DISJUNCTION
AS GENERATOR VARIABLES

CONCEPT AND RELATION REFERENCES IN A QUERY SHOULD INCLUDE
   A :context INDICATOR IN THE CORRESPONDING CALL TO "get-instance"

|#

;;; TO DO:

#|

ADD TEST TO DETERMINE WHEN *query-clean-up-instances*
   CODE IS UNNECESSARY INSIDE OF "retrieve" and "ask"

SEE IF "role-is-filled-up-p" IS REDUNDANT, OR
SHOULD EXPORT BEHAVIOR TO "probe.lisp" OR ELSEWHERE.

UPGRADE "form-universal-query" TO LOOK FOR EXHAUSTIVELY-ENUMERATED
SETS

|#

