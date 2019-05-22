;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

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


;;; CLASSIFY.LISP (TBOX)

(in-package "LOOM")

(export '())

;;; The LOOM CLASSIFIER


  ;;
;;;;;; A generic classification algorithm
  ;;

;;; The classification algorithm classifies concepts by invoking the
;;;    subsumption predicate "specializes-classified-concept-p".  This
;;;    function is generic, thus permitting multiple
;;;    specialization functions to be utilized.  Each subsumption
;;;    predicate is expected to apply within the domain of a specific
;;;    sub-lattice.  Thus, defining a new type of specialization involves
;;;    defining the class or classes of objects which will reside in its
;;;    sub-lattice, defining methods for "specializes-classified-concept-p"
;;;    which apply to those classes,and defining the concept which joins
;;;    the new sub-lattice and the original taxonomy.

;;; The entry "classify-one-concept" directs the search to the appropriate sub-lattice
;;;    within the TBox taxonomy.  Currently we support distinct specialization
;;;    predicates for unary concepts, role relations, computed relations,
;;;    sets, and intervals.

;;; The classifier is NOT recursive.  Therefore, the code is careful to
;;;    invoke it only in situations where we are not in the middle of
;;;    classifying.  Comments by Bob Kasper:

;;;    The call to "disjoint-concepts-p" from "check-disjunction" in
;;;    the tbox does not cause a recursive classification, because
;;;    it is always invoked during CONDITIONING, before the
;;;    classification flags get set.  As far as I know, CLASSIFYING
;;;    A CONCEPT never causes another concept to get classified
;;;    recursively.

;;;    The calls to "disjoint-concepts-p" from "detect-incoherence"
;;;    don't cause a recursive classification, because this happens
;;;    AFTER the instance has been classified.


  ;;
;;;;;; Top-level classification routines
  ;;

(defun classify-one-concept (self)
  ;; Classify the concept "self":
  ;; Pre-classify "self";
  ;; Classify "self";
  ;; Post-classify "self";
  #L:trace-build (trace-values "classify-one-concept" self)
  (let (result)
    (pre-classify-concept self)
    (setq result (classify-into-hierarchy self))
    (post-classify-concept result (neq result self))
    result ))

(defmethod classify-into-hierarchy (self)
  ;; Set-up classification flags, compute starting points,
  ;;     and classify "self" below them;
  (set-up-classification-flags self nil)
  (classify-below self (copy-list (super-concepts self))
                  (compute-starting-points self)) )

(defmethod classify-into-hierarchy ((self UNARY-ENTITY))
  ;; Set-up classification flags, compute starting points,
  ;;     and classify "self" below them;
  ;; This method handles the special case that "self" has no primitiveness;
  ;;    In that case, "self" gets placed right below the top of the hierarchy;
  (if (or (primitive-concepts self) (eq (defined-as self) :disjunction))
    (call-next-method)
    (let ((supers (super-concepts self)))
      (unless (system-defined-p self)
	(inform "~S has no `primitiveness', so it will not be classified.~%" self)) ; TAR 12/5/96
      ;; make "add-specializes-link" happy:
      (setf (super-concepts self) nil)
      ;; install super-concepts links:
      (install-parent-links self supers)
      ;; mark "self" as classified:
      (setf (classified-p self) 0)
      self)) )

;; THE SWITCH INSIDE OF THIS IS DISABLED, BUT CONSIDER ENABLING IT IF
;;    CLASSIFYING RELATIONS WITHOUT PRIMITIVENESS IS TOO SLOW.  HOWEVER,
;;    TBOX-RELATION.search-nodes MUST ALSO BE MODIFIED TO GET THE DESIRED
;;    SPEED-UP;
(defmethod classify-into-hierarchy ((self TBOX-RELATION))
  ;; Set-up classification flags, compute starting points,
  ;;     and classify "self" below them;
  ;; This method handles the special case that "self" has no primitiveness;
  ;;    In that case, "self" gets placed right below the top of the hierarchy;
  (if t ; (or (primitive-concepts self) (eq (defined-as self) :disjunction))
    (call-next-method)
    (let ((supers (super-concepts self)))
      (unless (system-defined-p self)
	(inform "~S has no `primitiveness', so it will not be classified.~%" self))
      ;; make "add-specializes-link" happy:
      (setf (super-concepts self) nil)
      ;; install super-concepts links:
      (install-parent-links self supers)
      ;; mark "self" as classified:
      (setf (classified-p self) 0)
      self)) )

(defmethod set-up-classification-flags ((self CLASSIFIABLE-OBJECT) parents)
  ;; Bump the pass counter *concept-is-below-pass-counter*;
  ;; Set "concept-is-below-counter"s for ancestors of "self"
  (declare (ignore parents))
  (integrity-check (super-concepts self))
  (incf *concept-is-below-pass-counter*)
  (loop for parent in (super-concepts self)
       do (set-concept-is-below-counters parent)) )

(defmethod set-up-classification-flags ((self UNARY-ENTITY) parents)
  ;; First, place "concept-is-below" flags on ancestors of "self";
  ;; Next, place "feature-is-below" flags on restrictions,
  ;;    comparisons, and computed features;
  (declare (ignore parents))
  (integrity-check (super-concepts self))
  (incf *concept-is-below-pass-counter*)
  (loop for parent in (super-concepts self)
       do (set-concept-is-below-counters parent))
  ;; set "feature-is-below" flags
  (let ((passCounter *concept-is-below-pass-counter*))
    (loop for res in (restrictions self)
	 do (map-ancestors
	      res (lambda (node)
		    (setf (feature-is-below-counter node) passCounter))
	      :reflexive-p t))
    (loop for cmp in (comparisons self)
	 do (map-ancestors
	      cmp (lambda (node)
		    (setf (feature-is-below-counter node) passCounter))
	      :reflexive-p t))
    (when (defined-set-feature self)
      (map-ancestors
	(defined-set-feature self)
	(lambda (node)
	  (setf (feature-is-below-counter node) passCounter))
	:reflexive-p t))
    (loop for feature in (computed-features self)
	 do (map-ancestors
	      feature (lambda (node)
			(setf (feature-is-below-counter node) passCounter))
	      :reflexive-p t)) ))

(defmethod set-up-classification-flags ((self TBOX-RELATION) parents)
  ;; First, place "concept-is-below" flags on ancestors of "self";
  ;; Next, place "feature-is-below" flags on computed features;
  (declare (ignore parents))
  (integrity-check (super-concepts self))
  (incf *concept-is-below-pass-counter*)
  (loop for parent in (super-concepts self)
       do (set-concept-is-below-counters parent))
  (let ((passCounter *concept-is-below-pass-counter*))
    (loop for feature in (computed-features self)
	 do (map-ancestors
	      feature (lambda (node)
			(setf (feature-is-below-counter node) passCounter))
	      :reflexive-p t)) ))


  ;;
;;;;;; The Lipkis Classifier
  ;;

;;; Object-oriented version of the Lipkis classification algorithm

;;; The classifier strategy is as follows:
;;;    Find the starting points for the subsumer search. If Concept is 
;;;    not THING, it either restricts some role or has inherited 
;;;    primitiveness. If S is a subsumer of Concept (other than THING) 
;;;    then its properties must be a subset of Concepts, so it must 
;;;    either be below the domain of at least one of Concept's roles, or be 
;;;    below one of Concept's primitive ancestors. 

;;; This reasoning assumes that role comparisons will 
;;;    not be put on concepts without restricting the 
;;;    constrained roles.

;;; The efficiency of the classifier depends fairly critically on producing
;;;    tight bounds on the role domains.  "complete-concept" is charged with
;;;    producing these bounds.

;;; Because of the search of a concept's descendants deliberately avoids
;;;    visiting primitive descendants, it is 
;;;    crucial that ALL of a concept's primitive ancestors be on 
;;;    startingPoints, not just the most general.

;;; Admirable cleverness is embedded in the "search-nodes" slot: Search
;;;    only traverses down links placed in this slot.  Primitive concepts
;;;    and unclassified concepts never get placed in this slot, so they
;;;    are never visited (unless they are in "startingPoints")

(defun classify-below (concept copyOfOldParents startingPoints
		       &key compute-msg-only-p)
  ;; Link "concept" into the taxonomy of classified concepts, i.e.,
  ;;    compute its immediate parents and children, as determined by
  ;;    subsumption tests, and (re)link concepts in below the parents
  ;;    and above the children;
  ;; If "compute-msg-only-p" don't install "concept" into the classified
  ;;    taxonomy, and return TWO values:
  ;;    (1) the would-have-been parents of "concept";
  ;;    (2) T iff "concept" would have merged if classified;
  ;; Note: Upon entry "super-concepts" was filled in by
  ;;    "condition-conjuncts" especially for use here -- its safe
  ;;    to clobber it;
  ;; CAUTION: Assumes its safe to destructively modify "copyOfOldParents";
 #L:trace-class (trace-values "classify-below" concept startingPoints)
  (let (identicalParent newParents)
    (integrity-check (not (and (typep concept 'CLASSIFIABLE-OBJECT) 
			       (classified-p concept))))
    (integrity-check copyOfOldParents) ; THIS COULD BE RE-EXAMINED
    (integrity-check (loop for parent in copyOfOldParents always (classified-p parent)))
    (when (or (cdr copyOfOldParents)
	      (not (setq identicalParent
			 (parent-is-identical-p concept (first copyOfOldParents) nil))))
      (if (and (typep concept 'TBOX-CONCEPT)
	       (eq (defined-as concept) :disjunction))
	  (setq newParents copyOfOldParents) 
	  (multiple-value-setq (newParents identicalParent)
	    (find-subsumers concept startingPoints copyOfOldParents))))
    (when compute-msg-only-p
#L:trace-class (trace-values "classify-below returns: " newParents)
	(return-from classify-below
	  (if identicalParent
	      (values (list identicalParent) t)
	      (values newParents nil))))
    ;; "concept" will be linked into net, or merged:
    (setf (super-concepts concept) nil)
    ;; CONSIDER ELIMINATING THE FOLLOWING CODE:
    ;; if identical to immediate parent just merge it in
    (when identicalParent
      (when (and (cdr copyOfOldParents)
		 (member identicalParent copyOfOldParents))
	(warn "BADNESS detected during classification: disabling DNF expansion.")
	(trace-values "a subsumption link is missing between" identicalParent "and" copyOfOldParents)
	(setq *dnf-limit* 0))
      (merge-with-classified-concept concept identicalParent)
      (return-from classify-below identicalParent))
    (install-parent-links concept newParents)
    ;; Note: "find-subsumees" relies on the correctness of concept's
    ;;     super-concept links
    (install-child-links concept (find-subsumees concept))
    (setf (classified-p concept) 0)
    concept ))


(defun find-subsumers (concept startingPoints copyOfOldParents)
  ;; Return two values, a list of the immediate subsumers of "concept"
  ;;    (its msg), and nil, if no merge occured, or the node that
  ;;    "concept" merged with.
  ;; Pass counters in the slots "already-visited-counter" and
  ;;    "concept-is-below-counter" indicate sub-lattices already searched,
  ;;    and nodes currently known to be above "concept", respectively.
  ;; (Assumes "concept-is-below-counter"s are already set for conjuncts,
  ;;    and "feature-is-below-counter"s are set for restrictions, and comparisons)
  (catch 'find-subsumers-catcher
    (let ((passCounter (incf *classify-concept-pass-counter*))
	  *newParents*)
      ;; *newParents* is filled in by "help-find-subsumers"
      (declare (special *newParents*))
      (loop for sp in startingPoints
	   when (and (not (eql (already-visited-counter sp) passCounter))
		     (neq sp concept))
	   do
	   (help-find-subsumers concept sp))
      (values
	(if *newParents*
	    (most-specific-concepts (revappend *newParents* copyOfOldParents)
				    :destructive-p t)
	    copyOfOldParents)
	nil) )))

(defun help-find-subsumers (concept node)
  ;; Visit "node" and its children, looking for most-specific
  ;;    subsumers of "concept";  Push any such nodes into *newParents*
  ;; Return true iff concept was found to specialize "node" or one of
  ;;    its descendants
  ;; The Lipkis algorithm has clever ways of abbreviating this search
  (declare (special *newParents*))
 #L:trace-class (trace-values "~%HELP-FIND-SUBSUMERS:" node concept)
 #L:trace-class (trace-values "   "(already-visited-counter node) *classify-concept-pass-counter*)

  (integrity-check (integerp (already-visited-counter node)))
  (when (= (already-visited-counter node) *classify-concept-pass-counter*)
      ;; return if we've already been here
      (return-from help-find-subsumers
	(eql (concept-is-below-counter node) *concept-is-below-pass-counter*)))

 #L:trace-class (trace-values "  not already visited --" node)
 #L:trace-class (trace-values "   "(concept-is-below-counter node) *concept-is-below-pass-counter*) 
  (let (testResult)
    (setf (already-visited-counter node) *classify-concept-pass-counter*)
    (cond 
      ((eql (concept-is-below-counter node) *concept-is-below-pass-counter*) 
       ;; visit descendants, and then return "t"
       (find-descendant-subsumers concept node)
       t)
      
      ;; if "node" is itself primitive, then we don't look below,
      ;;    although another (lower) startingPoint might initiate 
      ;;    a search below "node"
      ((primitive-p node) nil)
      
      ;; see if "node" subsumes Concept; two optimizations are made:
      ;;  (1) if we've already found a new parent, omit checks
      ;;      for equality during the subsumption test
      ;;  (2) if "node" has only one parent, there is no need 
      ;;      to compare primitiveness. (We never recurse to primitive 
      ;;      concepts (since they are starting points) so the only way 
      ;;      "node" could have new primitiveness is if it inherits 
      ;;      it through another path)	  
      ((prog1
	 (setq testResult
	       (specializes-classified-concept-p
		 concept node
		 (null *newParents*) (null (cdr (super-concepts node)))))
 #L:trace-spec (trace-values "specializes-classified-concept-p yields:" testResult)
 #L:trace-class (trace-values "subsumption test --" node testResult *newParents*)
	 )

       ;; "concept" specializes "node"
       (when (eq testResult :equal)
	   ;; we found a merge -- jump entirely out of "find-subsumers"
	   (throw 'find-subsumers-catcher (values (list node) node)))
       
       ;; its not a merge -- visit the descendants of "node"; "wentBelow"
       ;;    tells us if "concept" also specialized one of them 
       (let (wentBelow)
	 (loop for subNode in (search-nodes node)
	      when (help-find-subsumers concept subNode)
	      do (setq wentBelow t))
	 (unless wentBelow
	   (push node *newParents*)
	   (set-concept-is-below-counters node)))
       t)		; "node" or one of its descendants subsumed "concept"
      
      (t
 #L:trace-spec (trace-values "specializes-classified-concept-p yields:  nil")
       nil))		; no new parents found
    ))	    ; end "help-find-subsumers"

(defun set-concept-is-below-counters (node)
  ;; Recursively visit "node" and its ancestors
  ;;    and set the "concept-is-below-counter" slot in each one
  ;;    to the current value of *classify-concept-pass-counter*
  (let ((passCounter *concept-is-below-pass-counter*)) 
    (setf (concept-is-below-counter node) passCounter) 
    (loop for ancestor in (all-super-concepts node)
         do (setf (concept-is-below-counter ancestor) passCounter)) ))

(defmethod find-descendant-subsumers (self node)
  ;; Helping method for "help-find-subsumers";
  ;; Situation: "self" is known to specialize "node", but we have not
  ;;    yet visited "node";
  ;; In this, the default case, we just recursively search descendants of "node";
  ;; If "self" is a database instance, and "node" is a disjunctive
  ;;    concept, then an alternative mode of search is employed;
  (loop for subNode in (search-nodes node)
       do (help-find-subsumers self subNode)) )

(defmethod find-descendant-subsumers ((self TBOX-CONCEPT) node)
  ;; Helping method for "help-find-subsumers";
  ;; This method is needed only to override the method for DB-INSTANCE
  ;;    (which overrides the identical default method);
  ;; If "self" is a database instance, and "node" is a disjunctive
  ;;    concept, then an alternative mode of search is employed;
  (loop for subNode in (search-nodes node)
       do (help-find-subsumers self subNode)) )

(defun find-subsumees (concept)
  ;; Return a list of the most general descendants of "concept";
  ;; If "concept" is primitive, any children must already be explicitly 
  ;;    linked to it;
  (when (primitive-p concept)
    (return-from find-subsumees nil))
  (let ((listOfParents (super-concepts concept))
	(alreadyKnownChildren (compute-already-known-children concept))
	*newChildren*)
    (declare (special *newChildren*)) ; "help-find-subsumees" pushes onto this
    (incf *classify-concept-pass-counter*)
    (loop for d in alreadyKnownChildren
	 do
	 (push d *newChildren*)
	 (setf (already-visited-counter d) *classify-concept-pass-counter*))
    (cond
      ((cdr listOfParents)
       ;; there is more than one parent of concept; any new child of "concept" must
       ;;    be below all of these parents, so it suffices to look below a single
       ;;    parent; we heuristically choose the parent farthest down in the taxonomy
       (let ((maxAncestorCount -1)
	     currentAncestorCount lowestParent otherParents)
	 (loop for parent in listOfParents do
	      (cond
		((null (cdr (sub-concepts parent)))
		 ;; if some parent has no other children than "concept", then
		 ;;    "concept" cannot have any new children
		 (setq lowestParent nil)
		 (return nil))
		((> (setq currentAncestorCount
			  (length (all-super-concepts parent)))
		    maxAncestorCount)
		 (setq lowestParent parent)
		 (setq maxAncestorCount currentAncestorCount))))
	 (when lowestParent
	     (setq otherParents (remove lowestParent listOfParents))
	     (loop for child in (sub-concepts lowestParent)
		  when (classified-p child)
		  do (help-find-subsumees concept child otherParents)))))
      ((cdr (sub-concepts (car listOfParents)))
       ;; there is a single parent having at least two children; we look below it
       (loop for child in (sub-concepts (car listOfParents))
	    when (classified-p child)
	    do (help-find-subsumees concept child nil))))
    (most-general-concepts *newChildren*) ))


(defun help-find-subsumees (concept node necessaryAncestors)
  ;; Look at and below "node" for concepts which specialize "concept";
  ;;    Push such concepts into *newChildren*.
  ;; We only consider concepts which are subsumed by all members
  ;;    of "necessaryAncestors";
  ;; Because "concept" is known to be non-primitive, and candidates
  ;;    inherit all of "concept's" primitiveness from "necessaryAncestors",
  ;;    we tell "specializes-classified-concept-p" not to check primitiveness
  (declare (special *newChildren*)) 
  (integrity-check (numberp (already-visited-counter node)))
  (when (eql (already-visited-counter node) *classify-concept-pass-counter*)
      (return-from help-find-subsumees nil))

#L:trace-class (trace-values "help-find-subsumees:" node *classify-concept-pass-counter*)

#L:trace-class (trace-values necessaryAncestors)

  (setf (already-visited-counter node) *classify-concept-pass-counter*)
  (cond
    ((and (when
	    (loop for ancestor in necessaryAncestors
		  always (subconcept-p node ancestor)) 

	     ;; "node" specializes all necessary ancestors; in the event
	     ;;    that the "specializes-classified-concept-p" test fails,
	     ;;     we still know that the children of "node" also specialize
	     ;;     those ancestors
	     (setq necessaryAncestors nil)

#L:trace-class (format *trace-output* "node is below all necessary ancestors~%")	     

	     t) 
	  (specializes-unclassified-concept-p node concept))
#L:trace-class (format *trace-output* "node ~S specializes concept ~S~%" node concept)

     (push node *newChildren*))

    (t (loop for subNode in (sub-concepts node)
	    when (classified-p subNode)
	    do (help-find-subsumees concept subNode necessaryAncestors)))) )


(defun install-parent-links (concept newParents)
  ;; Helping function for "classify-below";
  ;; Assign superC links to "concept" for each parent in "newParents";
  (loop for parent in newParents
       do (add-specializes-link concept parent)) )

(defun install-child-links (concept newChildren)
  ;; Helping function for "classify-below";
  ;; Connect any new children of "concept" to it with superC links
  ;;    (during "reclassification" there may exist children which
  ;;     have already been linked up);
  ;; Uncomplete the new children (so that they can inherit
  ;;    from their new parent);
  (loop for child in newChildren
       when (not (member child (sub-concepts concept)))
       do
       (add-specializes-link child concept)
       (when (typep child 'TBOX-CONCEPT) ;; only CONCEPTs and RELATIONs get completed
	 ;; CORRECT?? OPTIMIZATTION -- DON'T UNCOMPLETE SUBLATTICE IF
	 ;;    CONCEPT IS :definition-only:
	 (unless  (and (member :definition-only (system-attributes concept))
		       (typep concept 'UNARY-CONCEPT)) 
	   (uncomplete-sublattice
	     child
	     :caused-by-definition-only-p
	     (member :definition-only (system-attributes concept)))))
       ;; now remove any specializes links which are now redundant:
       (loop for commonParent
	    in (intersection (super-concepts child) (super-concepts concept))
	    do
	    (del-link super-concepts child commonParent)
	    (delf (search-nodes commonParent) child))
       ;; now fix up "all-super-concepts" computations for descendants
       ;;    of "child";
       ;; WHEN CONCEPT IS DEFINED, IT MAY ALSO BE NECESSARY TO ADD
       ;;    concept TO defined-as-concepts OF SOME DESCENDANTS.
       (loop for sub in (sub-concepts child)
	    do (update-all-super-concepts-in-sublattice sub concept))) )

(defun add-specializes-link (subConcept superConcept)
  ;;  Place a super-concept link between"subConcept" and "superConcept";
  ;;    Compute or update "all-super-concepts" and "search-nodes";
  (integrity-check (not (member superConcept (all-super-concepts subConcept))))
  (integrity-check (not (member superConcept (super-concepts subConcept))))
  (push superConcept (super-concepts subConcept))
  (push subConcept (sub-concepts superConcept))
  (cond
    ((all-super-concepts subConcept)
     (loop for ancestor in (all-super-concepts superConcept)
	  do
          (pushnew ancestor (all-super-concepts subConcept)))
     (push superConcept (all-super-concepts subConcept)))
    (t
     (setf (all-super-concepts subConcept)
	   (cons superConcept (all-super-concepts superConcept)))))
  ;; fill in "search-nodes" slot for use in future classifications
  (add-to-search-nodes superConcept subConcept) )

(defun update-all-super-concepts-in-sublattice (concept new-super)
  ;; Helping function for "install-child-links";
  ;; Add "new-super" to the value of "all-super-concepts" for "concept"
  ;;    and its descendants;
  (pushnew new-super (all-super-concepts concept) :test #'eq)
  (loop for sub in (sub-concepts concept)
       do (update-all-super-concepts-in-sublattice sub new-super)) )

  ;;
;;;;;; Externally-used functions
  ;;

;;; Functions used elsewhere which rely heavily on the details of
;;;    the classifier code

(defun detach-one-concept (self)
  ;; Called by "detach-dependent-restrictions";
  ;; Detach "self" from the network, and fix up pointers between
  ;;    its parents and its children;
  (labels ((remove-self-from-all-super-concepts-slot
	     (child)
	     ;; delete "self" from the slot "all-super-concepts"
	     ;;    for nodes at and below "child"
	     (delf (all-super-concepts child) self :test #'eq)
	     (loop for sub in (sub-concepts child)
		  do (remove-self-from-all-super-concepts-slot sub)))
	   (subconcept-path-to-child-p
	     ;; return t if there is a subconcept path from "concept" to "child";
	     (concept child)
	     (or (eq concept child)
		 (loop for sub in (sub-concepts concept)
		      thereis (subconcept-path-to-child-p sub child)))))
	   
    (let ((parents (super-concepts self))
	  (children (sub-concepts self)))
      ;; remove pointers from children to "self", and fix
      ;;    up the "all-super-concepts" slots of its descendants
      (loop for child in children
	   do
	   (delf (super-concepts child) self)
	   (remove-self-from-all-super-concepts-slot child))
      ;; remove pointers from parents to "self", and link children
      ;;    to parents:
      (loop for parent in parents
	   do
	   ;; remove pointers from parent "parent" to self:
	   (delf (sub-concepts parent) self)
	   (delf (search-nodes parent) self)
	   ;; link up "parent" to each child that is not reachable
	   ;;    by some other sub-concepts path:
	   (loop for child in children
		unless (subconcept-path-to-child-p parent child)
		do 
		(integrity-check (null (intersection (super-concepts child)
						     (super-concepts parent))))
		;; selected code from "add-specializes-link":
                (push parent (super-concepts child))
                (push child (sub-concepts parent))
		(add-to-search-nodes parent child)
		;; now fix up "all-super-concepts" computations for "child" 
		;;    and its descendants: 
		))
      (setf (super-concepts self) nil)
      (setf (sub-concepts self) nil) )))

(defun remove-parent-links (self)
  ;; Remove super-concept links, delete it from any search nodes,
  ;;    and zero-out "all-super-concepts";
  ;; Caution:  "remove-parent-links" leaves the taxonomy in an
  ;;    inconsistent state, since children of "self" may still be classified;
  (loop for super in (super-concepts self)
       do
       (delf (search-nodes super) self)
       (del-link super-concepts self super))
  (setf (all-super-concepts self) nil)
  (setf (classified-p self) nil) )

;;; "install-concept" is used for installing starting restrictions:

(defun install-concept (self parents children &key dont-pre-classify)
  ;; Link "self" into the classification taxonomy immediately
  ;;    below "parents" and above "children";
  ;; Note: If parents of "self" were found using "compute-subsumers" (without copying)
  ;;    then "self" is already pre-classified, so calls to "install-concept"
  ;;    should then specify ":dont-pre-classify t";
  ;; Assumes that a concept representing the merge of "parents"
  ;;    does not already exist (else there would now be two of them);
  (unless dont-pre-classify
    (pre-classify-concept self))
  (setf (super-concepts self) nil)
  (install-parent-links self parents)
  (install-child-links self children)
  (setf (classified-p self) 0)
  (post-classify-concept self nil) )


;;; "most-specific-conjuncts" is used by the conditioning routines,
;;;     but it has a classification flavor to it, so we put it here

(defun most-specific-conjuncts (listOfConjuncts &key destructive-p)
  ;; Return a list of concepts such that any subset of "listOfConcepts"
  ;;    for which there is a concept equal to the conjunction of that subset
  ;;    has been replaced by that concept, recursively;
  ;; The original list is  not destroyed;
  ;; Note: This function assumes that no element of "listOfConjuncts" is
  ;;    subsumed by any other;
  ;; The algorithm relies on the fact that a classified "pure-conjunct"
  ;;    has at least two super-concepts
  (when (null (cdr listOfConjuncts))
    (return-from most-specific-conjuncts listOfConjuncts))
  (let ((specificConjuncts 
	  (if destructive-p listOfConjuncts (copy-list listOfConjuncts)))
	candidates candidate disjunctiveConjunctP)
    (prog ()
       loop (loop for originalConjunct in specificConjuncts
		 do
		 (setq candidates (sub-concepts originalConjunct))
		 (loop
		   (unless candidates
		     (return nil))
		   (setq candidate (pop candidates))
		   (setq disjunctiveConjunctP nil)
		   (cond
		     ((and (pure-conjunction-p candidate)
			   (not (member :being-reclassified-original (system-attributes candidate)))
			   (loop for conjuncts in (pure-conjunction-p candidate)
				thereis
				(loop for c in conjuncts
				     ;; We use the original listOfConjuncts,
				     ;; because the pure-conjunction-p slot
				     ;; contains unconditioned conjuncts.
				     always (or (member c listOfConjuncts)
						;; allow search for candidates below disjunction
						(and (eq (defined-as c) :disjunction)
						     (setq disjunctiveConjunctP t))))))
		      (if disjunctiveConjunctP
			  ;; candidate has a disjunctive conjunct,
			  ;; so we allow search for candidates below it;
			  (loop for c in (sub-concepts candidate)
			       do (push c candidates))
			  ;; we have found a better conjunct
			  ;; The length=2 condition no longer holds BK 2/16/90
			  ;; NOTE: must use "all-super-concepts" below,
			  ;; because there may be intervening concepts
			  ;; between "candidate" and some conjunct due to disjunction  BK 2/7/90
			  (let ((candidateSupers (all-super-concepts candidate)))
			    (loop for tail on specificConjuncts
				 when (member (car tail) candidateSupers)
				 do (setf (car tail) nil))
			    (push candidate specificConjuncts)
			    (setq specificConjuncts (delf specificConjuncts nil))
			    ;; enable lower down concepts to become candidates:
			    (push candidate listOfConjuncts)
			    ;; And restart processing from scratch:
			    (go loop))))
		     ((eq (defined-as candidate) :disjunction)
		      (loop for c in (sub-concepts candidate)
			do (push c candidates)))
		  ))))
    specificConjuncts) )

;;; "least-common-generalization" is used in the completion routines
;;;    to compute the effective domain of a relation, but it has a
;;;    classification flavor, so we  put it here

(defun least-common-generalization-member (conceptList)
  ;; Return a most-specific concept in the taxonomy which is 
  ;;    specialized by each concept in "conceptList"
  ;; Algorithmic note:  The lcg must be an ancestor of every concept
  ;;    in "conceptList", so we can pick any one of the conceptList as the
  ;;    starting point in our search

  ;; first, we remove any concepts which specialize other members of
  ;;    "conceptList"
  (setq conceptList
	(most-general-concepts conceptList))
  (when (null (cdr conceptList))
      (return-from least-common-generalization-member (car conceptList)))
  ;; pick the first concept as our starting point, and visit each
  ;;    of its ancestors
  (let ((startingPoint (car conceptList))
	bestLCG)
    (setq conceptList (cdr conceptList))
    (loop for candidate in (all-super-concepts startingPoint)
	 when (or (null bestLCG)
		  (subconcept-p candidate bestLCG))
	 do
	 (when (loop for concept in conceptList
		  always (subconcept-p concept candidate :cant-be-equal-p t))
	     (setq bestLCG candidate)))
    bestLCG ))		; guaranteed non-null, because Thing is always up there


;;; TO FIND THE MOST SPECIFIC SUPERCONCEPT FOR ANY n CONCEPTS:

;;; LEAST-COMMON-GENERALIZATION modified from
;;; "least-common-generalization-member" in classify.lisp
;;; to find all concepts, when the LCG may not be unique.
;
; Alternate implementation that may not be as efficient:
; (most-specific-concepts
;       (intersection (all-super-concepts C1)
;		      ...
;		      (all-super-concepts Cn)))

(defun least-common-generalization (conceptList)
  ;; Return a most-specific concept (or list of concepts)
  ;;    in the taxonomy which is specialized by every concept in "conceptList"
  ;; Algorithmic note:  The lcg must be an ancestor of every concept
  ;;    in "conceptList", so we can pick any one of the conceptList as the
  ;;    starting point in our search
  
  ;; first, we remove any concepts which specialize other members of
  ;;    "conceptList"
  (setq conceptList
	(most-general-concepts conceptList))
  (when (null (cdr conceptList))
    (return-from least-common-generalization (car conceptList)))
  ;; pick the first concept as our starting point, and visit each
  ;;    of its ancestors
  (let ((startingPoint (car conceptList))
	LCGList)
    (setq conceptList (cdr conceptList))
    (loop for candidate in (all-super-concepts startingPoint)
	 when (not (superc-of-member-p candidate LCGList))
	 do
	 (when (loop for concept in conceptList
		    always (subconcept-p concept candidate :cant-be-equal-p t))
	   (delf LCGList candidate
		 :test #'member :key #'all-super-concepts)
	   (push candidate LCGList)))
    (if (cdr LCGList) LCGList (car LCGList)) ))

(defun superc-of-member-p (concept list)
  (loop for member in list
       thereis (subconcept-p member concept)))

(defun compute-msg (self &key dont-copy-concept)
  ;; Compute the "most-specific-generalization" of "self", i.e., return
  ;;    a list of the most-specific among all concepts which subsume "self";
  ;; Return a second value -- a flag indicating t iff "self" would merge
  ;;    if classified;
  ;; Condition "self"; pre-classify "self"; find subsumers of "self";
  ;; CAUTION: We assume that all depend-ons of "self" have been classified;
  (when (classified-p self)
    (return-from compute-msg (values (list self) t)))
  (let ((copyOfSelf (if dont-copy-concept
			self
			(generate-copy-of-tbox-components self))))
    (let ((status (condition-one-concept copyOfSelf)))
      (cond
       ((eq status :already-classified)
	(integrity-check (member :discarded-by-merge (system-attributes copyOfSelf)))
	(return-from compute-msg
	  (values (list (follow-merge-concept-pointers copyOfSelf)) t)))
       ((classified-p copyOfSelf)       ; RMM 4/20/94
        (return-from compute-msg
	  (values (list copyOfSelf) t)))))
    (pre-classify-concept copyOfSelf)
    (set-up-classification-flags copyOfSelf nil)
    (multiple-value-prog1
      (classify-below copyOfSelf (copy-list (super-concepts copyOfSelf))
		      (compute-starting-points copyOfSelf) :compute-msg-only-p t)
      (unless dont-copy-concept
	(reclaim-classifiable-object copyOfSelf))) ))

(defmethod generate-copy-of-tbox-components ((self UNARY-ENTITY))
  ;; Helping method for "compute-subsumers";
  ;; Return a new concept with definitional components copied
  ;;    from "self"
  ;; CAUTION: No dependency links are created, because the copy
  ;;    is intended to be a transient entity;
  (let ((copyOfSelf 
	  (create-concept nil (concept-or-relation self) (context self))))
    (setf (conjuncts copyOfSelf) (conjuncts self))
    (setf (primitive-p copyOfSelf) (primitive-p self))
    (setf (restrictions copyOfSelf) (restrictions self))
    (setf (comparisons copyOfSelf) (comparisons self))
    (setf (computed-features copyOfSelf) (computed-features self))
    copyOfSelf ))

(defmethod generate-copy-of-tbox-components ((self BINARY-RELATION))
  ;; Helping method for "compute-subsumers";
  ;; Return a new concept with definitional components copied
  ;;    from "self"
  ;; CAUTION: No dependency links are created, because the copy
  ;;    is intended to be a transient entity;
  (let ((copyOfSelf 
	  (create-concept nil (concept-or-relation self) (context self))))
    (setf (conjuncts copyOfSelf) (conjuncts self))
    (setf (primitive-p copyOfSelf) (primitive-p self))
    (setf (defined-domain copyOfSelf) (defined-domain self))
    (setf (defined-range copyOfSelf) (defined-range self))
    (setf (defined-as copyOfSelf) (defined-as self))
    (case (defined-as self)
      (:inverse (setf (inverse copyOfSelf) (inverse self)))
      (:composition (setf (components copyOfSelf) (components self))))
    (setf (computed-features copyOfSelf) (computed-features self))
    copyOfSelf ))

(defun compute-subsumees (self &key copy-concept)
  ;; Compute the list of concepts that would be immediately subsumed by
  ;;    "self" if "self" were classified;
  ;; Side-effect: "self" is conditioned, and its "super-concepts" slot
  ;;    may get filled-in;
  (let ((copyOfSelf
	  (cond
	    (copy-concept (generate-copy-of-tbox-components self))
	    (t self))))
    (multiple-value-bind (parents mergeP)
	(compute-msg copyOfSelf :dont-copy-concept t)
      (cond
	(mergeP (sub-concepts (car parents)))
	(t
	 (loop for p in parents
	      do (addf (sub-concepts p) copyOfSelf))
	 (setf (super-concepts copyOfSelf) parents)
	 (prog1 
	   (find-subsumees copyOfSelf)
	   (loop for p in parents
		do (delf (sub-concepts p) copyOfSelf))))) )))


;TO DO:
#|
|#

;BUGS
#|
|#

