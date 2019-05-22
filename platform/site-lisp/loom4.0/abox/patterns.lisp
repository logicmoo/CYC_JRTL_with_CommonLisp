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

;;; PATTERNS (ABOX)

(in-package "LOOM")


;;; A pattern is a query that has been allocated its own object;
;;; Patterns may be parameterized, i.e., some of the variables in the
;;;    query may be designated as "input variables".
;;; Patterns are classified by computing subsumption relations
;;;    between queries;

;; COPY OF WHAT'S IN CLASSDEFS:
;(defclass PATTERN (CLASSIFIABLE-OBJECT)
;  ((source-query :range S-EXPR)
;   (input-variables :range S-EXPR)
;   (normalized-query :range S-EXPR)
;   (pattern-variables :range PATTERN-VARIABLE :collection-p t)
;   (pattern-residue :range S-EXPR)
;   ))

;; COPY OF WHAT'S IN STRUCTURES:
;(defstruct (PATTERN-VARIABLE
;	     (:conc-name nil)
;	     (:print-function
;	       (lambda (self stream depth)
;		 (if (= depth 0)
;		     (format stream
;			 "|PV|~S(:type ~S :components ~S :maps-to ~S)"
;			 (variable-name self)
;			 (variable-type self)
;			 (variable-components self)
;			 (variable-maps-to self))
;		     (format stream
;			     "|PV|~S" (variable-name self))))))
;  (variable-name nil)
;  (variable-type nil)
;  (variable-components nil)
;  (constant-variable-p nil)
;  (variable-maps-to nil)
;  )


  ;;
;;;;;; Pattern creation and conditioning
  ;;

(defun create-pattern (query inputVariables)
  ;; Return a pattern object for the query "query";
  ;; TO DO: FIGURE OUT HOW DEPEND-ONS SHOULD BE GENERATED;
  (make-loom-instance 'PATTERN
		      :source-query query
		      :input-variables inputVariables) )

(defun create-pattern-variable (&key variable-name constant-variable-p)
  ;; Return a fresh pattern variable record;
  (let ((newPV (or (pop *recycled-pattern-variables*)
		   (make-PATTERN-VARIABLE))))
    (setf (variable-name newPV) variable-name)
    (setf (constant-variable-p newPV) constant-variable-p)
    newPV ))
  
(defun discard-pattern-variable (patternVariable)
  ;; Clear slots in "patternVariable" and push onto recycle list;
  (fill patternVariable nil)
  (push patternVariable *recycled-pattern-variables*) )

(defun condition-pattern (pattern &key query-picture)
  ;; Compute a normalized query from the source query in "pattern";
  ;; Construct a list of pattern variables records corresponding to the
  ;;    variables and constants found in the normalized query attached
  ;;    to "pattern";
  ;; Each pattern variable record points to the type of the variable,
  ;;    and to the n-ary components that it is an argument of;
  ;; Replace the list of input variables by a corresponding list of
  ;;    pattern variable records;
  (let (normalizedQuery patternVariables)
    (labels
      ((find-or-create-pattern-variable
	 (variableName &key initialize-type-p)
	 (or (loop for pv in patternVariables
		  when (eq (variable-name pv) variableName)
                  return pv)
	     (let ((newPV
		     (create-pattern-variable
		       :variable-name variableName
		       :constant-variable-p
		       (not (question-mark-variable-p variableName)))))
	       (when initialize-type-p
		 (setf (variable-type newPV) *thing*))
	       (push newPV patternVariables)
	       newPV)))
       (distribute-component
	 (component)
	 (let ((relation (car component))
	       variables)
	   (typecase relation
	     (UNARY-CONCEPT
	      (push relation
		    (variable-type 
		      (find-or-create-pattern-variable
			(second component)))))
	     (TBOX-RELATION
	      (setq variables
		    (loop for arg in (cdr component) collect
			 (find-or-create-pattern-variable arg)))
	      (setq component (cons relation variables))
	      (loop for vbl in variables
		   do
		   (push component (variable-components vbl))))
	     (otherwise (push component (pattern-residue pattern)))))))
      (setq normalizedQuery
	    (normalize&expand-pattern-query pattern query-picture))
      (when (null normalizedQuery)
	   (return-from condition-pattern nil))
      (if (eq (car normalizedQuery) :and)
	  (loop for comp in (cdr normalizedQuery)
	       do (distribute-component comp)) 
	  (distribute-component normalizedQuery))
      (setf (pattern-variables pattern) patternVariables)
      (normalize-pattern-components pattern)
      ;; create pattern variables for input parameters not found in the
      ;;    pattern (and initialize their types to Thing):
      (setf (input-variables pattern)
	    (loop for pv in (input-variables pattern)
		 collect 
		 (find-or-create-pattern-variable pv :initialize-type-p t)))
      pattern )))

(defun normalize&expand-pattern-query (pattern queryPicture)
  ;; Helping function for "condition-pattern";
  ;; Normalize the source query in pattern, and store the result
  ;;     in the slot "(normalized-query pattern)";
  ;; Establish dependency links between "pattern" and concepts and
  ;;    relations that it references;
  ;; Expand role chains in the normalized query, and return the result;
  (multiple-value-bind (normalizedQuery predicateRefs)
      (normalize-query (source-query pattern) 
		       :query-picture (or queryPicture pattern))
    (setf (normalized-query pattern) normalizedQuery)
    (loop for ref in predicateRefs
	 do
         (when (not (member ref (concept-references pattern)))
           (addf (concept-references pattern) ref)
           (addf (dependents ref) pattern)))  ; RMM 1/15/93 WAS "non-tbox-dep"
    (when (null normalizedQuery)
      (return-from normalize&expand-pattern-query nil))
    (expand-role-chains normalizedQuery) ))

(defun normalize-pattern-components (pattern)
  ;; Helping function for "condition-pattern";
  ;; Situation: "pattern" has been partially conditioned;
  ;; Augment types to reflect implied domains and implied ranges;
  ;; Replace domain- and range-restricted relations by their base
  ;;    relations;
  ;; Replicate relations with inverses, and commutative relations;
  ;; Replace groups of relations having identical components
  ;;    with a conjunction of those relations;
  ;; For each variable pattern in "pattern", replace the list of
  ;;    type concepts by a single concept;
  (flet ((push-type
	   (concept patternVariable)
	   (pushnew concept (variable-type patternVariable)))
	 (push-component
	   (component patternVariable)
	   (pushnew component
		    (variable-components patternVariable) :test #'filler-equal)))
    (let (component relation arguments newComponent)
      (loop for pv in (pattern-variables pattern)
	   do
	   (loop for tail on (variable-components pv)
		do
		(setq component (car tail))
		(setq relation (car component))
		(setq arguments (cdr component))
		(typecase relation
		  (BINARY-RELATION
		   (push-type (implied-domain relation) (first arguments))
		   (push-type (implied-range relation) (second arguments)))
		  (otherwise
		   (loop for domain in (implied-domains relation)
			as pv in arguments
			do (push-type domain pv))
		   (push-type (implied-range relation)
			      (car (last arguments)))))
		(when (base-relations relation)
		  (setf (car tail) nil)
		  (loop for r in (base-relations relation)
		       do (push-component (cons r arguments) pv))))
	   (delf (variable-components pv) nil))
      (loop for pv in (pattern-variables pattern)
	   do
	   (loop for component in (variable-components pv)
		do
		(setq relation (car component))
		(setq arguments (cdr component))
		(typecase relation
		  (BINARY-RELATION
		   (when (inverse relation)
		     (setq newComponent
			   (list (inverse relation)
				 (second arguments) (first arguments)))))		     
		  (otherwise
		   (when (member :commutative (attributes relation))
		      (setq newComponent
			    (list relation
				  (cadr arguments)
				  (car arguments)
				  (cddr arguments))))))
		(when newComponent
		  (loop for pv in arguments
			   do (push-component newComponent pv)))))
      (loop for pv in (pattern-variables pattern)
	   do
	   (setf (variable-components pv)
		 (combine-component-groups (variable-components pv))))
      (normalize-variable-types pattern) )))

(defun combine-component-groups (listOfComponents)
  ;; Helping function for "normalize-pattern-components";
  ;; If there exist groups of components within "listOfComponents" that
  ;;    share common variables, combine each such group into a single
  ;;    component;
  ;; Return the list of possibly modified components;
  ;; Note: This code is uncommonly ugly;
  (let (matchingComponents currentComponent newComponent)
    (flet ((collect-matching-components
	     (theComponent otherComponents)
	     (let ((arguments (cdr theComponent))) 
	       (loop for comp in (cdr otherComponents)
		    when (filler-equal (cdr comp) arguments)
		    collect comp))))
      (loop
	(setq matchingComponents nil)
	(loop for tail on listOfComponents
	     when (setq matchingComponents
			(collect-matching-components
			  (car tail) (cdr tail)))
	     do
	     (setq currentComponent (car tail))
	     (setq matchingComponents
		   (cons currentComponent matchingComponents))
	     (setq newComponent
		   (cons
		     (touch-conjunction-concept
		       (loop for comp in matchingComponents
			    collect (car comp)))
		     (cdr currentComponent)))
	     ;; delete group members from list, and add in new component:
	     (setq listOfComponents
		   (cons newComponent 
			 (loop for comp in listOfComponents
			      unless (member comp matchingComponents)
			      collect comp)))
	     (return nil) ;; early exit from for loop
	     ) ;; end for loop
	(when (null matchingComponents)
	  (return))) ;; exit loop loop
      listOfComponents )))

(defun normalize-variable-types (pattern)
  ;; Propagate value restrictions across components;
  ;; Replace multiple concepts in a type by a single conjunction
  ;;    concept;
  ;; TO DO: HANDLE VRDIFFS;
  ;; TO DO: HANDLE MIN 1's;
  ;; TO DO: HANDLE BACKWARD PROPAGATION OVER FUNCTIONAL ROLES;
  (labels
    ((push-type-p (concept patternVariable)
       (when (loop for conjunct in (variable-type patternVariable)
		  never (subconcept-p conjunct concept)) 
	 (pushnew concept (variable-type patternVariable))
	 t))
     (reduce-compound-types ()
       (loop for pv in (pattern-variables pattern)
	    do 
	    (setf (variable-type pv)
		  (most-specific-conjuncts (variable-type pv)))))
     (propagate-value-restrictions-p ()
       (let ((queue (pattern-variables pattern))
	     pv moreSpecificRestrictionP)
	 (declare (ignore moreSpecificRestrictionP))
	 (loop
	   (setq pv (pop queue))
	   (when (null queue)
	     (return nil))			; exit loop
	   (loop for concept in (variable-type pv)
		 do
		 (loop for res in (implied-restrictions concept)
		       when (eq (feature-type res) :value-restriction)
		       do
		       (loop for comp in (variable-components pv)
			     when (and (binary-p (first comp))
				       (eq (second comp) pv)
				       (subconcept-p (first comp)
						     (value-restriction res)))
			     do
			     (when (push-type-p (value-restriction res)
						(third comp))
			       ; (setq moreSpecificRestrictionP t)
			       (pushnew (third comp) queue)))))))))
    (loop
      ;; replace concepts in each variable type with possibly shorter list
      ;;    of concepts that collectively imply the same type:
      (reduce-compound-types)
      ;; augment types by value restrictions implied across roles:
      (unless (propagate-value-restrictions-p)
	;; exit loop when no more specific value restrictions found:
	(return nil)))
    ;; replace lists of concepts in types by single concept:
    (loop for pv in (pattern-variables pattern)
	  do 
	  (setf (variable-type pv)
		(touch-conjunction-concept (variable-type pv)))) ))

  ;;
;;;;;; Classification methods for patterns (except for the big one)
  ;;

(defmethod compute-starting-points ((self PATTERN))
  ;; Return a starting point for classifying the pattern "self";
  (let ((variableCount (length (input-variables self))))
    (case variableCount
      (1 (list *unary-pattern*))
      (2 (list *binary-pattern*))
      (otherwise (list *n-ary-pattern*))) ))

;;; "add-to-search-nodes" calls the default method for patterns;

;;; "specializes-unclassified-concept-p" calls the default method for patterns;

(defmethod parent-is-identical-p ((self PATTERN) parent dontExpandP)
  ;; Return t iff the pattern query of "self" is equivalent
  ;;    to the pattern query of "parent";
  ;; Note: We don't try very hard to find this match here;
  (declare (ignore dontExpandP))
  (filler-equal (normalized-query self)
		(normalized-query parent)) )

;; THIS MAY BE REVISED:
(defmethod merge-with-classified-concept ((mergingPattern PATTERN)
					  intoPattern)
  ;; Merge "mergingPattern" into (the already-classified) pattern
  ;;    "intoPattern";
  ;; For patterns, no actual merge occurs -- we just return
  ;;    "intoPattern";
  (integrity-check (null (dependents mergingPattern)))
  intoPattern )


  ;;
;;;;;; Subsumption tests for patterns
  ;;

;;; Strategy for subsumption test:
;;;    To determine if "pattern1" specializes "pattern2", try to construct
;;;    a mapping of variables in "pattern2" to variables in "pattern1"
;;;    such that all relationships satisfied in "pattern2" are also
;;;    satisfied by the corresponding variables in "pattern1".
;;; Note: A feasible mapping need not be either one-one or onto
;;;    (partial exception: a one-one/onto mapping exists between the input
;;;    variables of patterns 1 and 2).

(defmethod specializes-classified-concept-p
	   ((pattern1 PATTERN) pattern2 checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on patterns "pattern1" and "pattern2";
  ;; Returns t or :equal if "pattern1" specializes or is equivalent to
  ;;    "pattern2";
  (declare (ignore dontCheckPrimsFlag))
  (flet ((erase-mapping (pattern)
			(loop for pv in (pattern-variables pattern)
			     do (setf (variable-maps-to pv) nil))))
    (let ((specializesP
	    (and (= (length (input-variables pattern1))
		    (length (input-variables pattern2)))
		 (prog1
		   (construct-mapping-p pattern2 pattern1)
		   (erase-mapping pattern2))))
	  equalP)
      (when specializesP
	(if checkForEqualityFlag
	    (progn
	      (setq equalP (construct-mapping-p pattern1 pattern2))
	      (erase-mapping pattern1)
	      (if equalP :equal t))
	    t)) )))

(defun construct-mapping-p (pattern2 pattern1)
  ;; Search for a feasible mapping from "pattern2" to "pattern1";
  ;; If one is found, return t;
  ;; The mapping itself is represented by "maps-to" links from "pattern2"
  ;;    to "pattern1";
  ;; Note: These links should be deleted after each call to "construct-mapping-p";
  (labels
    ((map-variable 
       (pv2 pv1)
       ;; map variable "pv2" to "pv1";
       (setf (variable-maps-to pv2) pv1))
     (unmap-variable
       (pv2)
       ;; delete mapping from variable "pv2" to "pv1";
       (setf (variable-maps-to pv2) nil))
     (compute-maps-to-choices
       (adjacentPV2)
       ;; If an already-mapped variable adjacent to "nextPV2" exists,
       ;;    return variables adjacent to whatever it maps to;
       ;; Otherwise, return all variables;
       (if adjacentPV2
	   (let (listOfAdjacent1s)
	     (loop for comp in (variable-components (variable-maps-to adjacentPV2))
		  do (loop for arg in (cdr comp)
			  do (pushnew arg listOfAdjacent1s)))
	     listOfAdjacent1s)
	   (pattern-variables pattern1)))
     (search-for-complete-mapping
       ()
       ;; Using a depth-first search, try to find a feasible mapping
       ;;    from "pattern2" to "pattern1" (proving that "pattern1"
       ;;    specializes "pattern2");
       (multiple-value-bind (nextPV2 adjacentPV2)
	   (select-next-pattern-variable pattern2)
	 (when (null nextPV2)
	   ;; all variables mapped, return total success:
	   (return-from construct-mapping-p t))
	 (loop for pv1 in (compute-maps-to-choices adjacentPV2)
	      do
	      (map-variable nextPV2 pv1)
	      (when (test-partial-mapping-p nextPV2)
		(search-for-complete-mapping))
	      (unmap-variable nextPV2)))
       ;;  normal exit indicates that the search failed:
       nil))
    (when (and (pattern-residue pattern2)
	       (not (filler-equal (pattern-residue pattern1)
				  (pattern-residue pattern2))))
      (return-from construct-mapping-p nil))
    (when (loop for pv2 in (input-variables pattern2)
	       as pv1 in (input-variables pattern1)
	       always
	       (progn
		 (map-variable pv2 pv1)
		 (test-partial-mapping-p pv2)))
      (search-for-complete-mapping)) ))

;(setq pattern1 (create-pattern '(A ?x) '(?x))) zzz
;(show-all pattern1)
;(condition&classify-pattern pattern1)

;(construct-mapping-p pattern2 pattern1)
;(progn
;(erase-mapping pattern1)
;(erase-mapping pattern2)
;)

(defun select-next-pattern-variable (pattern2)
  ;; Helping function for "construct-mapping-p";
  ;; Return two values, an unmapped pattern variable, and
  ;;    an already-mapped pattern variable adjacent to the first
  ;;    value;
  ;; For the first value, prefer an unmapped PV with a maximal number
  ;;    of components containing already-mapped arguments;
  ;; Note: A null first value indicates that all variables have been mapped;
  ;; Note: The second value may also be null;
  (let ((bestCount -1)
	bestPV adjacentPV count firstAdjacentPV)
    (loop for pv in (pattern-variables pattern2)
	 unless (variable-maps-to pv)
	 do
	 (setq count 0)
	 (loop for comp in (variable-components pv)
	      when (setq firstAdjacentPV
			 (loop for arg in (cdr comp)
			      when (variable-maps-to arg)
                              return arg))
	      do (incf count))
	 (when (> count bestCount)
	   (setq bestPV pv)
	   (setq bestCount count)
	   (setq adjacentPV firstAdjacentPV)))
    (values bestPV adjacentPV) ))

(defun test-partial-mapping-p (pv2)
  ;; Helping function for "construct-mapping-p";
  ;; Situation: A partial mapping exists from the pattern attached to
  ;;    the pattern variable "pv2" to the pattern attached to "(variable-maps-to pv2)";
  ;; All mapped variables except for "pv2" have already been tested;
  ;; Return t if each of the components attached to "pv2" whose
  ;;    arguments are fully mapped is specialized by a corresponding
  ;;    component;
  (let ((pv1 (variable-maps-to pv2)))
    (flet
      ((found-specializing-component-p
	 (component2)
	 ;; If all arguments to "component2" are mapped, then return t iff
	 ;;    there exists a component that specializes "component2" whose
	 ;;    arguments are mapped to by the arguments of "component2";
	 ;; Otherwise, return failure (nil) if "pv2" is the first argument of
	 ;;    "component2", and if no component attached to "pv1" specializes
	 ;;    "component2" (ignoring the remaining arguments);
	 ;; Otherwise, return success (t), meaning that there MIGHT exist a
	 ;;    specializing component (but until the mapping is more complete,
	 ;;    we aren't sure);
	 (let ((relation2 (car component2))
	       (arguments2 (cdr component2))
	       mapsToArguments)
	   (cond
	     ((loop for arg in arguments2 always (variable-maps-to arg))
	      (setq mapsToArguments
		    (loop for arg in arguments2 collect (variable-maps-to arg)))
	      ;; trick: if a specializing component exists, then ONE of the
	      ;;    variables it is attached to must be "pv1":
	      (loop for component1 in (variable-components pv1)
		   thereis
		   (and (filler-equal (cdr component1) mapsToArguments)
			(subconcept-p (car component1) relation2))))
	     ((eq (first arguments2) pv2)
	      (loop for component1 in (variable-components pv1)
		   thereis
		   (subconcept-p (car component1) relation2)))
	     (t t)))))    
      (and
	(subconcept-p (variable-type pv1) (variable-type pv2))
	(or (not (constant-variable-p pv2))
	    (filler-equal (variable-name pv1) (variable-name pv2)))
	(loop for component2 in (variable-components pv2)
	     always
	     (found-specializing-component-p component2))) )))


  ;;
;;;;;; "condition&classify-pattern"
  ;;

;;; REWRITE THIS:
(defun condition&classify-pattern (pattern &key query-picture)
  ;; Return a classified pattern;
  ;; Generate a normalized query from the source query in "pattern";
  ;; Classify "pattern" based on the normalized query;
  ;; Note: Code generation occurs during sealing;
  ;; TO DO: CONSIDER ADDING CODE THAT FORCES CREATION OF CONCEPTS, OR
  ;;    DEFERS THE COMPILATION OF THE PATTERN;
  (condition-pattern pattern :query-picture query-picture)
  (let ((copyOfOldParents (compute-starting-points pattern)))
    (incf *concept-is-below-pass-counter*)      ;  TAR 4/8/94
    (classify-below pattern copyOfOldParents copyOfOldParents) ))

;(setq pattern1 (condition-pattern (create-pattern '(A ?x) '(?x)))) zzz
;(show pattern1)
;(condition&classify-pattern pattern1)
;(initialize-patterns)
;(setq p (condition-pattern (create-pattern '(Thing ?x) '(?x))))
;(seal-pattern p)


(defun seal-pattern (pattern)
  ;; Generate compiled code that tests the satisfaction of the pattern
  ;;    query when its input parameters are bound;
  ;; Store the code in "(compiled-query pattern)";
  (let ((inputVariables (loop for v in (input-variables pattern)
			     collect (variable-name v)))
	queryCode ignoredInputVariables)
    (when (null (compiled-query pattern))
      (setq ignoredInputVariables
	    (set-difference inputVariables 
			    (collect-free-variables (normalized-query pattern))))
      (setq queryCode
	    `(lambda ,inputVariables
	       ,@(when ignoredInputVariables
		   `((declare (ignore ,@ignoredInputVariables))))
	       ,(if (normalized-query pattern)
		    (wrap-with-query-clean-up-instances-code 
		      (form-query-code 
			nil (normalized-query pattern) inputVariables
			:query-picture (car (dependents pattern))))
		    t)))
      (setf (compiled-query pattern)
	    (compile nil queryCode))) ))

(defun unclassify-pattern (pattern)
  ;;
  (setf (compiled-query pattern) nil)
  (loop for ref in (concept-references pattern)
       do 
       (delf (dependents ref) pattern)   ; RMM 1/15/93 WAS "non-tbox-dep"
       (delf (concept-references pattern) ref)) )

(defmethod unclassify-feature ((self PATTERN))
  ;; Called by "revise-subgraph";
  ;; Unlink the pattern "self" from the classification hierarchy;
  ;; Recursively unclassify patterns below "self";
  (labels ((unclassify-pattern-sublattice
	     (self)
	     (unclassify-pattern self)
	     (loop for sub in (sub-concepts self)
		  when (classified-p sub)
		  do (unclassify-pattern-sublattice sub))))
    (unclassify-pattern-sublattice self) ))

;; THIS CODE WAS PULLED DOWN FROM HIGHER IN UP IN THE FILE.  WE'LL KEEP
;;    IT UNTIL WE FIGURE OUT WHAT ITS DOES DIFFERENTLY AND WHY:   RMM 5/29/92
;(defmethod unclassify-feature ((self PATTERN))
;  ;; Called by "revise-subgraph";
;  ;; Unlink the pattern "self" from the classification hierarchy and
;  ;;    post it somewhere;
;  ;; Recursively unclassify features below "self";
;  ;; TO DO: FIGURE OUT WHAT TO DO HERE;
;  ;; COMMENT: IF PATTERNS BECOME FEATURES, LOOK AT WHAT HAPPENS TO 
;  ;;    ORDINARY FEATURES TO SEE IF WE CAN SHARE THE LOGIC;
;  (labels ((unclassify-pattern-sublattice
;	     (pattern)
;	     (setf (classified-p pattern) nil)
;	     (loop for sub in (sub-concepts pattern)
;		  when (classified-p sub)
;		  do (unclassify-pattern-sublattice sub))
;	     (remove-parent-links pattern)
;	     (inform "UNCLASSIFYING PATTERN ~S" pattern)))
;    (unclassify-pattern-sublattice self) ))


  ;;
;;;;;;
  ;;

(defun initialize-patterns ()
  ;; Bind the global variables *unary-pattern*, *binary-pattern*, and
  ;;    *n-ary-pattern* to the most general unary and binary
  ;;    patterns;
  ;; Note: *binary-pattern* is used as the starting pattern for
  ;;    n-ary patterns;
  ;; TO DO: ADD CODE THAT SWITCHES TO THE CORRECT KB BEFORE COMPILING EACH PATTERN;
  (setq *unary-pattern* (create-pattern '(Thing ?x) '(?x)))
  (setq *binary-pattern* (create-pattern '(:and (Thing ?x) (Thing ?y)) '(?x ?y)))
  (setq *n-ary-pattern* (create-pattern '(:and (Thing ?x) (Thing ?y) (Thing ?z))
					'(?x ?y ?z)))
  (loop for p in (list *unary-pattern* *binary-pattern* *n-ary-pattern*)
       do
       (condition-pattern p)
       (setf (classified-p p) 0)
       (seal-pattern p)
       (setf (compiled-query p) #'null-pattern-test-p)) )

(defun null-pattern-test-p (&rest arguments)
  ;; Called by "initialize-patterns" and "compile-method";
  ;; Return t;
  ;; Placed in null patterns, and in methods which have null situations;
  (declare (ignore arguments))
  t )


;(initialize-patterns)

;(compiled-query *unary-pattern*)

  ;;
;;;;;; Parameterized Goals
  ;;

;;; THE FOLLOWING FUNCTION MAY BE COMPLETE HOGWASH, IT WAS
;;;    WRITTEN BEFORE GOALS BECAME REAL:
;(defun define-parameterized-goal (sourcePattern parameters)
;  ;; Create a parameterized goal from "sourcePattern" and
;  ;;    "parameters";
;  ;; Classify the goal into the pattern hierarchy;
;  ;; Compile a goal-satisfaction test for it;
;  (when sourcePattern
;    (let ((pGoal (make-loom-instance 
;		   'PARAMETERIZED-GOAL
;		   :source-query sourcePattern
;		   :parameters parameters)))
;      (evaluate&classify-pattern pGoal)
;      (setf (compiled-goal-test pGoal)
;	    (compute-query-satisfaction-test pGoal)))) )

