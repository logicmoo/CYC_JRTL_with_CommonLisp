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

;;; TUPLES.LISP (ABOX)

;;; Functions that implement indexing for n-ary relations and tuples.

(in-package "LOOM")

(export '( list-tuples))


  ;;
;;;;;; "list-tuples"
  ;;

(defun list-tuples (relation &key asserted-p)
  ;; Return a list of tuples in "relation";
  ;; Note: Code partially copied from "get-local&removed-instances";
  (if (eql (arity relation) 2)
      (list-binary-tuples relation asserted-p)
    (progn 
      (update-tuple-index-for-merges relation)
      (let ((tupleIndex (tuple-index relation)))
	(typecase tupleIndex
	  (LIST tupleIndex)
	  (otherwise
	   (KBCLASSES::coerce-hash-table-to-value-list tupleIndex))) ))) )

(defun list-binary-tuples (relation asserted-p)
  ;; Return a list of tuples in the binary relation "relation";
  ;; Note: Code partially copied from "get-matching-instances";
  (let ((result nil)
	(domain (implied-domain relation))
	index)
    (unless (member :illegal-role-index (system-attributes relation))
      (loop for idx in (query-indices relation)
	  when (and (null (rest (index-roles idx)))
		    (subconcept-p domain (indexed-concept idx)))  ;; Normally EQL
	  do (setq index idx)
	     (return t)))
    (cond ((null index)
	   (loop for x in (get-instances domain)
	       initially (when (eq domain *thing*)
			   (complain "~&Performance Warning: `List-Tuples' scans entire
context to generate instances while generating tuples for ~A~%" relation))
	       unless (constant-p x)
	       do (loop for y in (get-values x relation 
					     :no-error-p t
					     :asserted-p asserted-p)
		      do (push (list x y) result)))
	   (fast-remove-equal-duplicates result))
	  ;; Index entries are duplicate free:
	  ((unique-key-p index)
	   (maphash #'(lambda (k v) (push (list v k) result))
		    (index-hash-table index))
	   result)
	  (t (maphash #'(lambda (k v) 
			  (loop for i in v
			      do (push (list i k) result)))
		      (index-hash-table index))
	     result)) ))

  ;;
;;;;;; assert and retract tuples
  ;;

(defun assert-tuple (tuple relation)
  (execute-in-contexts-depth-first
   (local-assert-tuple tuple relation)))

(defun retract-tuple (tuple relation)
  (execute-in-contexts-depth-first
   (local-retract-tuple tuple relation)))

(defun local-assert-tuple (tuple relation)
  ;; Add the tuple "tuple" to the relation "relation";
  ;; TO DO: UPGRADE WITH A TEST THAT AVOIDS MAKING A HISTORY INDEX IF
  ;;    WE AREN'T GENERATING HISTORIES;
  (update-tuple-index-for-merges relation)
  (let* ((singleValuedP (single-valued-p relation))
	 (key (if singleValuedP (butlast tuple) tuple))
	 (matchingTuple (find-matching-tuple relation key))
	 (tupleIndex (tuple-index relation))
	 historyIndex)
    (when (and matchingTuple
	       (or (not singleValuedP)
		   (filler-equal tuple matchingTuple)))
      ;; exit if tuple has already been asserted
      (return-from local-assert-tuple nil))
    (when singleValuedP
      (when (not (member :clip-roles *loom-match-features*))
	(warn "Clipping tuple ~S from the relation ~S" matchingTuple relation))
      ;; clip old tuple:
      (local-retract-tuple matchingTuple relation :guaranteed-p t))
    (setq historyIndex (find-or-create-history-index relation))
    (if (member tuple (removed-next-time-quantum historyIndex) :test #'filler-equal)
	(delf (removed-next-time-quantum historyIndex) tuple)
	(addf (added-next-time-quantum historyIndex) tuple))
    (setq *match-is-pending-p* t)   ; TAR 2/13/96
    (typecase tupleIndex
      (LIST (push tuple (tuple-index relation)))
      (otherwise (setf (gethash key tupleIndex) tuple))) ))

(defun local-retract-tuple (tuple relation &key guaranteed-p)
  ;; Remove the tuple "tuple" from the relation "relation";
  ;; "guaranteed-p" indicates that "tuple" is guaranteed to exist
  ;;    in the extension of "relation";
  ;; TO DO: UPGRADE WITH A TEST THAT AVOIDS MAKING A HISTORY INDEX IF
  ;;    WE AREN'T GENERATING HISTORIES;
  (update-tuple-index-for-merges relation)
  (let* ((singleValuedP (single-valued-p relation)) 
	 (tupleIndex (tuple-index relation))
	 historyIndex key)
    (setq historyIndex (find-or-create-history-index relation))
    (if (member tuple (added-next-time-quantum historyIndex) :test #'filler-equal)
	(delf (added-next-time-quantum historyIndex) tuple)
	(addf (removed-next-time-quantum historyIndex) tuple))
    (setq *match-is-pending-p* t)   ; TAR 2/13/96
    (typecase tupleIndex
      (LIST
	(setf (tuple-index relation)  ;Can't be destructive w/contexts ;TAR 8/25/97 
	  (remove tuple (tuple-index relation) :test #'filler-equal :count 1)))
      (otherwise
       (setq key (if singleValuedP (butlast tuple) tuple))
       ;; note: if "relation" is single-valued, the "gethash" makes sure that
       ;;    the tuple we are deleting really exists
       (unless (and singleValuedP
		    (not guaranteed-p)
		    (not (tuple-satisfies-relation-p tuple relation)))
	 ;; SHOULD WE BE CALLING "remhash" OR SETTING THE ENTRY TO NIL???:
	 (remhash key tupleIndex)))) ))


  ;;
;;;;;; Commutivity Support Functions
  ;;

(defun permute-one-tuple (tuple)
  (let ((last (last tuple)))
    (loop for permutation in (permute (butlast tuple))
	collect (append permutation last))) )

(defun permute-tuples (tupleList)
  (loop for tuple in tupleList
      nconc (permute-one-tuple tuple)))

  ;;
;;;;;; Tuple Merged Instance Maintenance Functions
  ;;

(defun update-list-for-merged-instances (list)
  ;; Update all top-level elements of list by following merge pointers;
  ;; Tricky: optimized to eliminate unnecessary consing;
  (loop for element in list
        when (and (classified-instance-p element)
                  (merged-into-instance element))
        return (loop for item in list 
                     when (and (classified-instance-p item)
                               (merged-into-instance item)) 
                        collect (follow-merge-pointers item)
                     else collect item)
        finally (return list)) )

(defun update-tuple-index-for-merges (relation)
  ;; Destructively update the tuple index of n-ary "relation" by following
  ;;    merge pointers;
  (when (if (merge-updated relation)
          (>= *last-merged-instance-agent-time* (merge-updated relation))
          (< *last-merged-instance-agent-time* 0))
    (return-from update-tuple-index-for-merges nil))
  (let ((tupleIndex (tuple-index relation))
        (reindexList nil))
    (flet ((update-a-tuple-for-merges (tuple)
             (let ((changedTupleP nil))
               (loop for item on tuple
                     when (and (classified-instance-p (car item))
                               (merged-into-instance (car item)))
                     do (setf (car item) (follow-merge-pointers (car item)))
                        (setq changedTupleP t))
               changedTupleP )))
      (typecase tupleIndex
        ;; For LIST case, consider doing a remove duplicates if any tuples
        ;;   are changed.
	(LIST (loop for tuple in tupleIndex
                    do (update-a-tuple-for-merges tuple)))
	(otherwise				; hash table
	 (maphash #'(lambda (k v)
                     (when (update-a-tuple-for-merges v)
                       (push (cons k v) reindexList)) )
		  tupleIndex)
         ;; Must be done outside the "maphash" call:
         (loop for (k . v) in reindexList
               do (setf (gethash k tupleIndex) nil)
                  (setf (gethash v tupleIndex) v)))) ))
  (setf (merge-updated relation) *agent-time*) )

  ;;
;;;;;; Tuple Query Functions
  ;;

;;; Note on computing temporally-indexed tuples of a relation:
;;;    If a tuple is both added and removed during the next time quantum,
;;;    the "assert-tuple" and "retract-tuple" routines are careful to
;;;    insure that at most one amond the "added-next-time-quantum" and
;;;    "removed-next-time-quantum" indices contains that tuple.  The
;;;    "generate-tuples-in-query" algorithm depends on this assumption.

;;; ADDED FOLLOWING SIX FUNCTIONS  ; DGB 2/25/94
(defun generate-tuples-in-query (relation &rest args)
  ;; Return a list of tuples that satisfy the n-ary relation "relation";
  ;; Compute the tuples from the compiled generation function attached to
  ;;    "relation"s predicate symbol;
  ;; If no such function can be found, create and attach a new generation function;
  (declare (dynamic-extent args))
  (let ((fn (or (get (predicate-symbol relation) :loom-compiled-tuples-function)
             (compile-generate-tuples-code-p relation))))
    (when fn 
      (apply fn args)) ))


(defun compile-generate-tuples-code-p (relation)
  ;; Ensure that the generation function for "relation" has been formed, compiled,
  ;;    and stored on the property list of "relation";
  ;; Return t if that attempt was successful;
  (let ((symbol (predicate-symbol relation))
	(generateCode
	 (if (primitive-p relation)
	     (form-primitive-generate-tuples-code relation)
	     (form-non-primitive-generate-tuples-code relation))))
    (when generateCode
      (setf (get symbol :loom-source-tuples-function) generateCode)
      (setf (get symbol :loom-compiled-tuples-function)
	    (compile nil generateCode))) ))


(defun form-primitive-generate-tuples-code (relation)
  ;; Return a lambda expression of "args" which collects tuples that have been asserted
  ;;    for roles at and below the primitive n-ary role "relation";
  ;; If antecedent functions exist, add code which appends their computations
  ;;    to the fundamental computation;
  (let ((inputParameters (form-input-parameters relation :function))
	(outputParameter '?instanceN)
	directAssertionQueryBody queryBody *ignoredParameters*)
    (declare (special *ignoredParameters*))
    (multiple-value-bind (role&subRoles impliedBys inverseImpliedBys)
	(collect-subroles&antecedents relation)
      (declare (ignore inverseImpliedBys))
      (if (cdr role&subRoles)
	  (setq directAssertionQueryBody
	    `(append
	      ,@(loop for rel in role&subRoles
		    collect `(collect-directly-asserted-tuples
			      ,(predicate-symbol rel)))))
	(setq directAssertionQueryBody `(collect-directly-asserted-tuples
					 ,(predicate-symbol relation))))
      (setq queryBody
	    (form-query-for-antecedents-function
	     inputParameters outputParameter impliedBys))
      (when (member :commutative (attributes relation))
	(setq directAssertionQueryBody
	  `(permute-tuples ,directAssertionQueryBody))
	(when queryBody
	  (setq queryBody
	    `(permute-tuples ,queryBody))))
      (form-completed-predicate-code
       directAssertionQueryBody 
       queryBody
       (and (member :directly-recursive (system-attributes relation))
	    (append inputParameters '(?instanceN)))
       relation)) ))

(defun form-query-for-antecedents-function
    (inputParameters outputParameter impliedBys)
  ;; Helping function for "form-primitive-generate-tuples-code";
  ;; Situation: "impliedBys" contains relations and/or computed features
  ;;    that can be used to generate derived tuples;
  ;; Return a form that generates all such tuples; 
  (let* ((parameters `(,@inputParameters ,outputParameter))
	 (queryClauses
	  (loop for imp in impliedBys
		collect
		(typecase imp
		  (TBOX-RELATION
		   `(,(name imp) ,@parameters))
		  (otherwise
		   (reparameterize-parameters&body
		    (parameters&body imp) parameters))))))
    (when queryClauses
      (form-query
       parameters
       `(:or ,@(generate-dereferenced-expression queryClauses))
       :dont-seal-network-p t :embedded-p t)) ))
		    

(defun form-non-primitive-generate-tuples-code (relation)
  ;; The role "relation" is a non-primitive, n-ary relation;
  ;; Return a lambda expression of "args" that collects tuples from either a parent role
  ;;    of "relation" or a local :satisfies generator, intersects the tuples
  ;;    with those from other parent roles, and applies domain and range 
  ;;    restrictions and :satisfies tests to the tuples;
  (let ((inputParameters (form-input-parameters relation :function))
	(outputParameter '?instanceN)
	(satisfiesFeatures (compute-local-satisfies-features relation))
	directAssertionQueryBody queryBody *ignoredParameters*)
    (declare (special *ignoredParameters*))
    (setq queryBody
	  (form-query-for-generate-tuples-function
	   relation inputParameters outputParameter satisfiesFeatures))
    (when (null queryBody)
      (return-from form-non-primitive-generate-tuples-code nil))
    (unless (read-only-p relation)
      (setq directAssertionQueryBody
	    `(collect-directly-asserted-tuples
	      ,(predicate-symbol relation))))
    (when (member :commutative (attributes relation))
      (when directAssertionQueryBody
	(setq directAssertionQueryBody
	  `(permute-tuples ,directAssertionQueryBody)))
	(when queryBody
	  (setq queryBody
	    `(permute-tuples ,queryBody))))
    (form-completed-predicate-code
     directAssertionQueryBody 
     queryBody
     (and (member :directly-recursive (system-attributes relation))
	  (append inputParameters '(?instanceN)))
     relation) ))


(defun form-query-for-generate-tuples-function
    (relation inputParameters outputParameter satisfiesFeatures)
  ;; Helping function for "form-non-primitive-generate-tuples-code";
  ;; Return a generator form that finds a generator (either a parent or a 
  ;;    local :satisfies feature), and then applies remaining features 
  ;;    (domain and range restrictions or :satisfies features) as filters 
  ;;    on the result;
  (let* ((parameters `(,@inputParameters ,outputParameter))
	 (supers
	  (loop for sup in (super-concepts relation)
		unless (eq sup (loom-constant N-Ary-Tuple))
		collect sup))
	 (satisfiesClause
	  (loop for feat in satisfiesFeatures
		collect (reparameterize-parameters&body
			 (parameters&body feat) parameters)))
	 (queryBody
	  (if supers
	      `(:and ,@(loop for sup in supers
			     collect `(,(name sup) ,@parameters))
		     ,@satisfiesClause)
	      (let ((domains (implied-domain relation))
		    (range (implied-range relation)))
		`(:and ,@(loop for dom in domains
			       as param in inputParameters
			       unless (eq dom (loom-constant Thing))
			       collect `(,(name dom) ,param))
		       ,@(when range
			   (unless (eq range (loom-constant Thing))
			     `((,(name range) ,outputParameter))))
		       ,@satisfiesClause))))
	 (antecedentsQuery
	  (multiple-value-bind (role&subRoles impliedBys inverseImpliedBys)
	      (collect-subroles&antecedents relation)
	    (declare (ignore role&subRoles inverseImpliedBys))
	    (form-query-for-antecedents-function
	     inputParameters outputParameter impliedBys))) )
    (if antecedentsQuery
	`(bag-append ,antecedentsQuery
		     ,(form-query
		       parameters
		       (generate-dereferenced-expression queryBody)
		       :embedded-p t) )
      (form-query
       parameters
       (generate-dereferenced-expression queryBody)
       :embedded-p t)) ))

;;; RENAMED FOLLOWING FUNCTION  ; DGB 2/25/94
(defun collect-directly-asserted-tuples (relation)  
  ;; Return a list of tuples for the n-ary relation "relation" that
  ;;    belonged to it at time *query-agent-time*;
  ;; At time *agent-time*, just return the current list;
  ;; Otherwise, run backwards in time adding and removing tuples from the
  ;;    current set to correspond with updates made since *query-agent-time*;
  ;; Note: Code partially copied from "get-local&removed-instances";
  (update-tuple-index-for-merges relation)
  (let ((tuples (list-of (tuple-index relation) :also-coerce-hash-table t))
	(timePoint *query-agent-time*)
	(copiedP nil)
	(historyIndex (previous-index relation))
	tuplesAddedNext)
    (when (and historyIndex
	       (>= (time-point historyIndex) timePoint))
      (loop until (or (null (setq historyIndex (previous-index historyIndex)))
		      (< (time-point historyIndex) timePoint))
	  do (loop for i in (removed-next-time-quantum historyIndex)
		 do (push i tuples))
	     (when (setq tuplesAddedNext (added-next-time-quantum historyIndex))
	       (unless copiedP
		 ;; copy tuples so that we can perform destructive deletion:
		 (setq tuples (copy-list tuples))
		 (setq copiedP t))
	       (loop for j in tuplesAddedNext
		   do (loop for tail on tuples
			  when (filler-equal j (car tail))
			  do (setf (car tail) nil))))))
    (if copiedP
	(delete nil tuples)
	tuples) ))

(defun find-matching-tuple (relation key)
  ;; Scan the tuples for "relation" and return a tuple that matches
  ;;    "key";
  ;; TO DO: UPGRADE TO HANDLE TEMPORAL QUERIES;
  (update-tuple-index-for-merges relation)
  (let ((tupleIndex (tuple-index relation)))
    (typecase tupleIndex
      (LIST (find key tupleIndex
                  :test (key-matches-tuple-p-fn relation)))
      (otherwise				; hash table
       (gethash key tupleIndex))) ))

(defun relation-includes-tuple-p (relation &rest tuple)
  ;; Helper for next function.  Allows use of parameter passing mechanism
  ;;  rather than consing up a list.
  (declare (dynamic-extent tuple))
  (tuple-satisfies-relation-p tuple relation))

(defun tuple-satisfies-relation-p (tuple relation)
  ;; Called by "form-n-ary-test" and "run-time-apply-predicate";
  ;; Return t if "tuple" is found in the extension of the
  ;;    primitive n-ary relation "relation";
  ;; TO DO: UPGRADE TO HANDLE TEMPORAL QUERIES;
  (flet ((test-tuple-p (testTuple)
           (if (single-valued-p relation)
             (filler-equal (car (last testTuple))
			   (car (last (find-matching-tuple
				       relation (butlast testTuple)))))
             (find-matching-tuple relation testTuple))))
    (or (test-tuple-p tuple)
	(and (member :commutative (attributes relation))
	     (loop for tpl in (permute-one-tuple tuple)
		   thereis (test-tuple-p tpl)))
	(loop for sub in (sub-concepts relation)
	      thereis (tuple-satisfies-relation-p tuple sub))) ))


  ;;
;;;;;; "form-tuple-scan-layer"
  ;;


(defun form-tuple-scan-layer 
       (generatorEntry candidateGeneratorVars filterQuery bodyOfIteration)
  ;; Called by "form-collection-query";
  ;; Return Lisp code that iterates over a tuple relation;
  ;; The main body of code is generated by "help-form-tuple-scan-layer";
  ;; This function borrows logic from "translate-relational-formula"
  ;;    to handle code that wraps layers around the inner code;
  (let (*outerCodeLayers* innerCode)
    (declare (special *outerCodeLayers*))
    (setq innerCode
	  (help-form-tuple-scan-layer 
	    generatorEntry candidateGeneratorVars filterQuery 'do bodyOfIteration))
    (if (null *outerCodeLayers*)
        innerCode
	(subst innerCode 'DUMMYBODY *outerCodeLayers*)) ))




(defun help-form-tuple-scan-layer 
     (generatorEntry candidateGeneratorVars filterQuery iterationType bodyOfIteration)
  ;; Called by "form-collection-query";
  ;; Return Lisp code that iterates over the tuple relation indicated
  ;;    in "generatorEntry", generating a filter that combines
  ;;    the bindings to domains in each tuple with the constraints
  ;;    in "filterQuery".  If "iterationType" is 'collect collect the
  ;;    "bodyOfIteration".  If "iterationType" is 'do inputs the results
  ;;    of the binding into the inner query form "bodyOfIteration";
  ;; Note: This logic mimics that in "form-layer-of-iteration";
  ;; Slightly tricky: "fillerQuery" may yield empty "filterCode";
  ;; Very tricky: The "dummyValue" is used to allow recursive generators to generate one
  ;;    level of unconstrained tuples in the body of the predicate code.  That requires
  ;;    the first call to the predicate code to have arguments that are not possible
  ;;    legal tuple members.
  (let* ((filterCode (when filterQuery (form-boolean-query filterQuery)))
	 (generatorTerm (generator-term generatorEntry))
	 (relation (first generatorTerm)) 
	 (tupleVars (rest generatorTerm))
	 (dummyValue '#.(gensym))
	 (generatorVars (intersection (remove-duplicates tupleVars)    ;  TAR 12/6/94
                                      candidateGeneratorVars))
	 (remainingGeneratorVars (copy-list generatorVars))
	 simpleDomainArgs simpleRangeArg tupleBindingCode tupleGeneratorCode
	 ignoredGeneratorVars)
    (flet ((form-ith-tuple-argument (i)
	     (if (< i (length simpleDomainArgs))
		 (nth i simpleDomainArgs)
		 simpleRangeArg)))
      ;; compute lisp code for each tuple argument:
      (multiple-value-setq (simpleDomainArgs simpleRangeArg)
	(translate-formula-arguments generatorTerm t))
      (setq tupleGeneratorCode
	(form-tuple-generator relation 
			      (and (member :directly-recursive
					   (system-attributes relation))
				   (append simpleDomainArgs 
					   (list simpleRangeArg)))
			       remainingGeneratorVars))
      (setq ignoredGeneratorVars
	(loop for v in generatorVars
	    unless (or (search-tree-p v filterCode)
		       (search-tree-p v bodyOfIteration)
		       (search-tree-p v tupleGeneratorCode))
	    collect v))
      (setq tupleBindingCode
	    (reorder-tuple-bindings
	      (loop for tVar in tupleVars
		  as i from 0
		  unless (member tVar ignoredGeneratorVars)
		  collect
		    (if (member tVar remainingGeneratorVars)
			(prog1
			    `(setq ,tVar (,@(form-nth-operator i) tuple)) 
			     (delf remainingGeneratorVars tVar))
		       `(filler-equal ,(form-ith-tuple-argument i)
			       (,@(form-nth-operator i) tuple))))))
      `(let ,(loop for gVar in generatorVars
		 unless (member gVar ignoredGeneratorVars)
		 collect `(,gVar ',dummyValue))
	 (loop for tuple in ,tupleGeneratorCode
	      when (and
		     ,@tupleBindingCode
		     ,@(when filterCode `(,filterCode)))
		   ,iterationType ,bodyOfIteration)) )))


(defun reorder-tuple-bindings (forms)
  ;; Very specific helping function for "form-tuple-scan-layer";
  ;; Reorder forms in "forms", placing "equal" forms middle or
  ;;    last, depending on whether or not they equate simple
  ;;    variables or formuli to the tuple arguments;
  ;; Tricky: This looks like a performance optimization, but it also insures
  ;;    that formuli aren't evaluated before their arguments are bound by
  ;;    placing all setq operations up front;
  (let (front middle back)
    (loop for f in forms
	 do (if (eq (first f) 'filler-equal)
		(if (consp (second f))
		    (push f back)
		    (push f middle))                  ;  TAR 12/6/94
		(push f front)))                      ;  TAR 12/6/94
    (append front middle back) ))

(defun form-tuple-generator (relation tupleVars remainingGeneratorVars)
  ;; Return a form that generates a list of tuples belonging
  ;;    to "relation";
  (let ((predicateSymbol (predicate-symbol relation)))
    `(generate-tuples-in-query ,predicateSymbol
                               ,@(loop for tVar in tupleVars
		                       as i from 0
		                       collect
		                       (if (member tVar remainingGeneratorVars)
                                         nil    ; No value for generators
                                         tVar))) ))

(defun form-nth-operator (i)
  ;; Specialized helping function called by "form-tuple-scan-layer";
  ;; Return a list containing a Lisp form that computes the ith member of
  ;;    a list (starting from 0);
  (case i
    (0 '(first))
    (1 '(second))
    (2 '(third))
    (otherwise
     `(nth ,i))) )


  ;;
;;;;;; support functions for "N-ARY-RELATION.seal-relation"
  ;;

;;; Note: Extra generalization is built-in in a few places below in
;;;    case we ever decide to remove the restriction that keys
;;;    must always denote the first k places of a relation.

(defun equal-places-1&2-p (tuple1 tuple2)
  ;; Return t if "tuple1" matches "tuple2" on the first two places;
  (and (filler-equal (first tuple1) (first tuple2))
       (filler-equal (second tuple1) (second tuple2))) )

(defun equal-places-1&2&3-p (tuple1 tuple2)
  ;; Return t if "tuple1" matches "tuple2" on the first three places;
  (and (filler-equal (first tuple1) (first tuple2))
       (filler-equal (second tuple1) (second tuple2))
       (filler-equal (third tuple1) (third tuple2))) )

(defun find-or-create-key-matches-tuple-fn (keyLength)
  ;; Return the name of a function that tests for matches on the first
  ;;    "keyLength" places of a pair of tuples;
  ;; If a new function is created, store it in the table 
  ;;    *key-matches-tuple-fn-table*;
  (flet ((form-equal-for-first-k-places-p-fn (k)
	   (integrity-check (> k 3))
	   `(lambda (tuple1 tuple2)
	      (declare (optimize (speed 3)))
	      (and (equal-places-1&2&3-p tuple1 tuple2)
		   (loop for i from 4 to ,k
			as v1 in (cdddr tuple1)
			as v2 in (cdddr tuple2)
			always (filler-equal v1 v2))))))	 
    (let ((positions (loop for i from 1 to keyLength collect i)))
      (or (gethash positions *key-matches-tuple-fn-table*)
	  (setf (gethash positions *key-matches-tuple-fn-table*)
                (without-redefinition-warnings
	          (compile nil
		           (form-equal-for-first-k-places-p-fn keyLength))))) )))

;;; THIS FUNCTION IS NOT USED YET (AND MAY NEVER BE)
#|
(defun form-equal-for-places-test (positions)
  ;; Return a function that tests whether two tuples agree over the
  ;;    positions indicated by "positions";
  (if (loop for p in positions
	    as i from 1
	    always (= p i))
      (form-equal-for-first-k-places-p-fn (length positions))
      `(lambda (tuple1 tuple2)
	 (loop for p in ,positions
	      always (filler-equal (nth p tuple1) (nth p tuple2))))) )
|#


  ;;
;;;;;; support functions for queries
  ;;

(defmethod primitive-n-ary-relation-p ((self N-ARY-RELATION))
  ;; Return t if "self" is a primitive n-ary relation that is evaluted
  ;;    by scanning for asserted tuples;
  (and (primitive-p self)
       (not (auxiliary-lambda-function self))
       (not (auxiliary-lambda-predicate self))) )

(defmethod primitive-n-ary-relation-p (self)
  ;; Return nil because "self" is not a primitive n-ary relation;
  (declare (ignore self))
  nil )

(defun project-range-of-n-ary-relation (relation &rest butLastPlaces)
  ;; Called by "form-n-ary-generator" and "run-time-apply-function";
  ;; Situation: The range (last place) of "relation" is not single-valued
  ;;    wrt the preceeding places;
  ;; Scan all tuples in "relation" and for those that match "butLastPlaces"
  ;;    on all but the last place, project out the value of the last place;
  (update-tuple-index-for-merges relation)
  (let ((tupleIndex (tuple-index relation))
	result)
    (flet ((collect-from-matching-tuples (dummy tuple)
	     (declare (ignore dummy))
	     (when (loop for v1 in butLastPlaces
			 as v2 in tuple
			 always (filler-equal v1 v2))
	       (push (car (last tuple)) result))))
      (typecase tupleIndex
	(LIST (if (member :commutative (attributes relation))
		  (loop for basetuple in tupleIndex
		      do (loop for tuple in (permute-one-tuple basetuple)
			     do (collect-from-matching-tuples nil tuple)))
		(loop for tuple in tupleIndex
		    do (collect-from-matching-tuples nil tuple))))
	(otherwise				; hash table
	 (if (member :commutative (attributes relation))
	     (maphash #'(lambda (k v) (loop for tuple in (permute-one-tuple v)
					  do (collect-from-matching-tuples k tuple)))
		      tupleIndex)
	     (maphash #'collect-from-matching-tuples tupleIndex))))
      result )))


#|
;--------------------------------------------------------------------------
;; TESTING N-ARY RELATIONS:

;; TESTS COMPLETED FOR NON-HASH IMPLEMENTATIONS:

(clear-context)
(defrelation distance :arity 3 :properties :single-valued)
(defrelation between :arity 3)
;; BUG IN SEALING -- TRIES TO GENERATE FUNCTION:
(tellm)
(tell (distance Fred Joe 4))
(tellm)
(tellm (distance Fred Joe 3))

(ask (distance Fred Joe 4))
(ask (distance Fred Joe 3))
(retrieve ?x (distance Fred Joe ?x))

(tell (between Fred Joe Mary))
(tell (between Fred Joe Sue))
(forget (between Fred Joe Mary))

(ask (between Fred Joe sue))
(ask (between Fred Joe Fred))
(retrieve ?x (between Fred Joe ?x))

(LOOM::project-range-of-n-ary-relation (fr between) (list (fi fred) (fi joe)))

(LOOM::find-matching-tuple  (fr distance) (list (fi fred) (fi joe)))
(LOOM::tuple-index (fr between))

(LOOM::tuple-index (fr distance))
(forget (distance fred joe 3))



(clear-context)
(defrelation distance :arity 3 :properties :single-valued)
(tellm)
(tell (distance SF NY 5))
(tellm)
(tellm (distance SF LA 1))
(tellm (distance SF SF 0))

(LOOM::tuple-index (fr distance))
(retrieve (?x ?y ?z) (distance ?x ?y ?z))
(retrieve (?x ?z) (distance ?x ?x ?z))
(retrieve (?x ?z) (distance ?x ?y ?z))
(retrieve (?x ?z) (for-some ?y (distance ?x ?y ?z)))
(retrieve (?x ?y) (distance ?x ?y 5))
(retrieve (?x ?y) (for-some ?z (and (distance ?x ?y ?z) (> ?z 0)))))
(retrieve (?x ?z) (distance ?x (+ ?x ?z) ?z))
(retrieve (?x ?y) (for-some ?z (distance ?x ?y (+ ?x ?z))))
|#
