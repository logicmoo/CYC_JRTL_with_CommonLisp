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

;;; COMPLETE.LISP (TBOX)

;;; Contains functions and methods concerned with
;;;    Pre-classifying and post-classifying;
;;;    CBox conditioning, including conditioning of restrictions
;;;       and equations, and closure of implications.

(in-package "LOOM")


  ;;
;;;;;;  Pre-Classifying 
  ;;

(defun follow-super-concept-pointers (self)
  ;; Fix any concept pointers in "(super-concepts self)" that
  ;;    have been merged;
  (loop for tail on (super-concepts self)
      when (member :discarded-by-merge (system-attributes (car tail)))
      do (setf (car tail) (follow-merge-concept-pointers (car tail)))) )

(defmethod pre-classify-concept ((self TBOX-CONCEPT))
  ;; If "self" has no conjuncts, add the conjunct at the top
  ;;    of its sublattice (e.g., Things, Relates, etc.)
  ;; Compute the list of local and inherited primitive concepts;
  (if (null (conjuncts self))
      (let ((listOfTop (list (follow-merge-concept-pointers 
			      (top-of-hierarchy self)))))
	(setf (conjuncts self) listOfTop)
	(setf (super-concepts self) listOfTop))
      (follow-super-concept-pointers self))
  (compute-primitive-concepts self) )

(defun compute-primitive-concepts (self)
  ;; Fill in the slot "primitive-concepts", and sort it
  ;; Note: This functions assumes that the corresponding slot
  ;;    values for all parent concepts have already been computed;
  ;; Note: We copy the list, because sorting would disturb the
  ;;    parent list
  (let ((inheritedPrims (copy-list (union-superc-slot-values
				     self primitive-concepts))))
    (setf (primitive-concepts self)
	  (if (primitive-p self)
	      (cons self inheritedPrims)
	      inheritedPrims)) ))

;; NEGATION DOESN'T WORK THIS WAY:
;(defmethod pre-classify-concept ((self UNARY-ENTITY))
;  ;; Pre-classify "self" in the usual way, and also:
;  ;; Fill in the slot "defined-as-concepts", and sort it;
;  (call-next-method)
;  (when (and (eq (defined-as self) :negation)
;	     (primitive-p (negative-features self)))
;    (push self (primitive-concepts self))) )

(defmethod pre-classify-concept ((self BINARY-RELATION))
  ;; Pre-classify "self" in the usual way, and also:
  ;; Push inverse relations into the list of primitive concepts;
  ;; Insure that "super-concepts" is non-nil (otherwise the classifier
  ;;    is unhappy)
  (integrity-check (and (neq (defined-domain self) *Thing*)
			(neq (defined-range self) *Thing*)))
  (call-next-method)
  (case (defined-as self)
    (:inverse
     (when (primitive-p (inverse self))
       (push self (primitive-concepts self)))))
  (when (null (super-concepts self))
    (setf (super-concepts self)
	  (conjuncts self))) )

(defmethod pre-classify-concept ((self MIN-RESTRICTION))
  ;; Initialize the slot "super-concepts" (this makes the classifier
  ;;    happy);
  (setf (super-concepts self)
	(list (min-1-restriction (relation self)))) )

(defmethod pre-classify-concept ((self MAX-RESTRICTION))
  ;; Initialize the slot "super-concepts" (this makes the classifier
  ;;    happy);
  (setf (super-concepts self)
	(list (null-max-restriction (relation self)))) )

(defmethod pre-classify-concept ((self VALUE-RESTRICTION))
  ;; Initialize the slot "super-concepts" (this makes the classifier
  ;;    happy);
  (setf (super-concepts self)
	(list (null-value-restriction (relation self)))) )

(defmethod pre-classify-concept ((self FILLED-BY-FEATURE))
  ;; Initialize the slot "super-concepts" (this makes the classifier
  ;;    happy);
  (setf (super-concepts self)
	(list (null-filled-by-restriction (relation self)))) )

(defmethod pre-classify-concept ((self NOT-FILLED-BY-FEATURE))
  ;; Initialize the slot "super-concepts" (this makes the classifier
  ;;    happy);
  (setf (super-concepts self)
	(list (null-not-filled-by-restriction (relation self)))) )

(defmethod pre-classify-concept ((self COMPARISON-FEATURE))
  ;; Initialize the slot "super-concepts" (this makes the classifier
  ;;    happy);
  (setf (super-concepts self)
	(list (null-comparison (relationship self)))) )

(defmethod pre-classify-concept ((self REIFIED-COMPARISON-FEATURE))
  ;; Initialize the slot "super-concepts" (this makes the classifier
  ;;    happy);
  (setf (super-concepts self)
	(list (null-reified-comparison (relationship self)))) )


  ;;
;;;;;;  Post-Classifying
  ;;

;;; "post-classify-concept" gets called immediately after
;;;     a classifiable object has been classified

(defmethod post-classify-concept ((self CLASSIFIABLE-OBJECT) selfWasMerged)
  ;; Default method does nothing after a concept has been classified;
  (declare (ignore selfWasMerged))
  self )

(defmethod post-classify-concept ((self TBOX-CONCEPT) selfWasMerged)
  ;; Inherit partitions from superconcepts of "self";
  ;; QUESTION: DO FUNNY THINGS HAPPEN IF MERGING CONCEPT BRINGS
  ;;    IN COVERING KNOWLEDGE???
  (declare (ignore selfWasMerged))
  (loop for c in (negated-concepts self)
        when (subconcept-p self c)
	do (with-feature-changes (:set '(:long-print-names))
	     (grumble "Concept ~S is incoherent because it is a subconcept of~%~
                       both ~S and its negation." self c))
	(mark-as-incoherent self))
  (catch 'parse-concept-definition-catcher  ; DGB 1/26/94
    (install-partition-memberships self)) )

(defmethod post-classify-concept ((self UNARY-RELATION) selfWasMerged); TAR 7/6/99
  ;; Call next method
  ;; Compute slot that notes the existence of more restrictive 
  ;;   domain definitions;
  (call-next-method)
  (when (not (or (primitive-p self)
		 (defined-as self)))
    (complete-restricted-unary-relation self)))

(defmethod post-classify-concept ((self BINARY-RELATION) selfWasMerged)
  ;; Inherit partitions from superconcepts of "self";
  ;; Inherit :single-valued attribute;
  ;; Install additional relation links (e.g., inverse links);
  ;; Establish null, min1-, and max-1 restrictions;
  ;; Compute slots that cache the list of base relations
  ;;    and that note the existence of more restrictive domain or 
  ;;    range definitions;
  ;; Install a preliminary value for "(implied-range self)"
  ;;    (this makes "convert-comparison-to-local-restriction" happy
  ;;     when the relation its looking at hasn't completed yet);
  ;; Note: Null comparisons are created on demand (by the creation of a
  ;;    comparison object), so we don't create them here;
  ;; Compute starting points for restrictions on "self";
  ;; Note: The inheritance of the :single-valued attribute from
  ;;    super concepts other than those in the relation's definition
  ;;    is debatable -- we could change this by inheriting from
  ;;    "conjuncts" rather than "super-concepts";
  (call-next-method)
  (when selfWasMerged
    (return-from post-classify-concept self))
  ;; inherit single-valuedness:
  (when (case (defined-as self)
	  (:composition
	   (loop for comp in (components self)
		always (single-valued-p comp))) 
	  (otherwise
	   (loop for super in (super-concepts self)
		thereis (single-valued-p super))))
    (pushnew :single-valued (attributes self)))
  ;; compute values for "base-relations", "more-restrictive-domain",
  ;;    and "more-restrictive-range";
  (when (not (or (primitive-p self)
		 (defined-as self)))
    (complete-restricted-relation self))
  (when (null (more-restrictive-defined-range self))
    ;; install null restrictions unless "relation" is range restricted, in
    ;;    which case it has no null restrictions;
    (install-starting-restriction self min-1-restriction)
    (install-starting-restriction self null-max-restriction)
    (install-starting-restriction self max-1-restriction)
    (install-starting-restriction self null-value-restriction)
    (install-starting-restriction self null-filled-by-restriction))
  ;; install inverse links after null restrictions are in place:
  (install-inverse-links self)
  ;; install a preliminary value for the implied range of "self":
  (when (null (implied-range self))
    (setf (implied-range self)
	  (case (defined-as self)
	    (:inverse (implied-domain (inverse self)))
	    (:composition
	     (implied-range (car (last (components self)))))
	    (otherwise
	     (or (defined-range self)
		 (loop for super in (super-concepts self)
		      when (neq (implied-range super) *Thing*)
		      do (return (implied-range super)))
		 *Thing*)))))
  ;; Insure a non-nil value for "(implied-domain self)"
  (when (null (implied-domain self))
    (setf (implied-domain self)
	  (or (defined-domain self) *Thing*)))
  ;; reclassify any asserted features attached to instances that reference "self":
  (reclassify-asserted-features-of-dependents self)
  self )

(defun complete-restricted-unary-relation (self)                ; TAR 7/6/99
  ;; Situation: "self" is a unary-relation that is either a pure
  ;;    conjunction, or a relation with a defined domain
  ;;    restriction more specific than any inherited domain
  ;;    restrictions;
  ;; Condition slot that notes the existence of more restrictive
  ;;     domain definition;
  (let ((baseRelations (most-specific-concepts
			 (loop for super in (all-super-concepts self)
			     when (and (property-p super)
				       (or (primitive-p super)
					   (defined-as super)
					   (computed-features super) ; TAR 5/27/99
					   ))
			     collect super)))
	(definedDomain (defined-domain self))
	(mostSpecificInheritedDomain *Thing*)
	baseRelDomain)
    ;; compute most specific inherited defined domain and defined range:
    (loop for baseRel in baseRelations
	 do
	 (when (and definedDomain
		    (setq baseRelDomain (defined-domain baseRel))
		    (subconcept-p baseRelDomain mostSpecificInheritedDomain))
	   (setq mostSpecificInheritedDomain baseRelDomain)))
    (when (and definedDomain
	       (neq definedDomain mostSpecificInheritedDomain))
      (setf (more-restrictive-defined-domain self) definedDomain)) ))

(defun complete-restricted-relation (self)
  ;; Situation: "self" is a binary-relation that is either a pure
  ;;    conjunction, or a relation with a defined domain or range
  ;;    restriction more specific than any inherited domain or range
  ;;    restrictions;
  ;; Condition slots that cache the list of base relations
  ;;    and that note the existence of more restrictive domain or 
  ;;    range definitions;
  (let ((baseRelations (most-specific-concepts
			 (loop for super in (all-super-concepts self)
			     when (or (primitive-p super)
				      (defined-as super)
				      (computed-features super); TAR 5/27/99
				      )
			      collect super)))
	(definedDomain (defined-domain self))
	(definedRange (defined-range self))
	(mostSpecificInheritedDomain *Thing*)
	(mostSpecificInheritedRange *Thing*)
	baseRelDomain baseRelRange)
    (setf (base-relations self) baseRelations)
    ;; compute most specific inherited defined domain and defined range:
    (loop for baseRel in baseRelations
	 do
	 (when (and definedDomain
		    (setq baseRelDomain (defined-domain baseRel))
		    (subconcept-p baseRelDomain mostSpecificInheritedDomain))
	   (setq mostSpecificInheritedDomain baseRelDomain))
	 (when (and definedRange
		    (setq baseRelRange (defined-range baseRel))
		    (subconcept-p baseRelRange mostSpecificInheritedRange))
	   (setq mostSpecificInheritedRange baseRelRange)))
    (when (and definedDomain
	       (neq definedDomain mostSpecificInheritedDomain))
      (setf (more-restrictive-defined-domain self) definedDomain))
    (when (and definedRange
	       (neq definedRange mostSpecificInheritedRange))
      (setf (more-restrictive-defined-range self) definedRange)
      ;; THIS IS A FUNNY PLACE TO PUT THIS CODE.  TRY PUTTING IT INTO
      ;;    "BINARY-RELATION.help-seal-one-concept":
      (when (and (member :closed-world (attributes self))
		 (not (or (concept-is-closed-p definedRange)
			  (compute-concept-is-closed-p definedRange))))
	(delf (attributes self) :closed-world)
	(complain "~%Warning -- removing :closed-world attribute from relation ~S~%   ~
                   because its defined range ~S is an open world concept."
		(generate-external-reference self)
		(generate-external-reference definedRange)))) ))

(defun install-inverse-links (relation)
  ;; If "relation" has no inverse link, try to establish an inverse relation,
  ;;    and set up an inverse link between it and "relation";
  ;; Note: Nothing happens if the system attribute :dont-set-inverse-link is
  ;;    placed on the relation "inverseRelation" -- the attribute
  ;;    indicates that we are somewhere in the middle of trying to establish
  ;;    this link (and don't want an infinite recursion);
  (let ((inverseRelation (inverse relation))
	installInverseP)
    (when (or inverseRelation
	      (member :dont-set-inverse-link (system-attributes relation)))
      (cond
	((eq (defined-as relation) :inverse)
	 (setf (inverse relation) inverseRelation)
	 (setf (inverse inverseRelation) relation)
	 ;; install inverses of subrelations of "inverseRelation"
	 (install-inverses-of-subrelations inverseRelation))
	((member :symmetric (attributes relation))
	 (setf (inverse relation) relation)))
      (delf (system-attributes relation) :dont-set-inverse-link)
      (return-from install-inverse-links nil))
    ;; if we reach here, there is no inverse link --see if an inverse
    ;;    link needs to be constructed:
    #L:trace-complete (trace-values "install-inverse-links:" relation)
    (when (member :symmetric (attributes relation))
      (setf (inverse relation) relation)
      (return-from install-inverse-links nil))
    (setq installInverseP
	  (if (primitive-or-computed-p relation)
	      (let ((parents (conjuncts relation)))
		(and (not (equal parents (list (loom-constant BINARY-TUPLE))))
		     (all-relations-have-inverses-p parents)))
	      (case (defined-as relation)
		(:composition
		 (all-relations-have-inverses-p (components relation)))
		(otherwise
		 (integrity-check (conjuncts relation))
		 (all-relations-have-inverses-p (conjuncts relation))))))
    (cond
      (installInverseP
       (install-inverse-of-relation relation))
      ((non-definitional-inverse relation)
       ;; install non definitional inverse links:
       (setq inverseRelation (non-definitional-inverse relation))
       (setf (inverse relation) inverseRelation)
       (setf (inverse inverseRelation) relation)))
    (check-for-phantom-inverse relation) ))

(defun all-relations-have-inverses-p (relations)
  ;; Helping function for "install-inverse-links";
  ;; Return true if each relation in "relations" has an inverse
  ;;    (other than the top-level relation BINARY-TUPLE;
  ;; Comment: We placed an inverse on BINARY-TUPLE
  ;;    to make "(:inverse (:range a))" work properly;  If this
  ;;    results in the creation of too many other inverse relations,
  ;;    this decision should be re-engineered;
  (loop for r in relations always (inverse r)) )

(defun install-inverse-of-relation (relation)
  ;; "relation" is assumed to be defined as a non-primitive
  ;;    conjunction of relations OR as a composite of relations
  ;;    all of which have inverses;
  ;; Define a relation which is the inverse of the relation "relation",
  ;;    (classify it,) and establish an inverse link between the two;
  (let ((inverseRelation
	  (touch-inverse-relation relation :dont-set-inverse-link t)))
    ;; create pair of inverse links (note: don't use "add-link" because
    ;;    it is too slow (makes unnecessary tests)      
    (setf (inverse relation) inverseRelation)
    (setf (inverse inverseRelation) relation) ))

(defun install-inverses-of-subrelations (relation)
  ;; Helping function for "install-inverse-links";
  ;; We have just classified the inverse of "relation";  Now
  ;;    visit subrelations of "relation", and create an inverse
  ;;    for each one;
  (loop for sub in (sub-concepts relation)
       unless (inverse sub)
       do
       (install-inverse-of-relation sub)
       (install-inverses-of-subrelations sub)) )

(defun install-null-not-filled-by-restriction (relation)
  ;; Attach a null not-filled-by feature to the relation "relation";
  ;; Unlike other null restrictions, null not-filled-bys are created in
  ;;    lazy fashion, rather than during post classification;
  ;; Insure that ancestors of "relation" also have null not-filled-bys;
  (loop for super in (super-concepts relation)
       when (null (null-not-filled-by-restriction super))
       do (install-null-not-filled-by-restriction super))
  (let ((nullFtr (make-loom-instance
		   'NOT-FILLED-BY-FEATURE
		   :relation relation
		   :non-role-fillers :infinite-set)))
    (setf (null-not-filled-by-restriction relation) nullFtr)
    (setf (primitive-p nullFtr) t)
    (install-concept nullFtr
		     (loop for super in (super-concepts relation)
			  when (null-not-filled-by-restriction super)
			  collect (null-not-filled-by-restriction super))
		     nil)
    nullFtr ))

(defun install-null-comparison (relationship &key reified-p)
  ;; Attach a null comparison feature to the relation "relationship";
  ;; Unlike null restrictions, null comparisons are created in lazy fashion,
  ;;    rather than during post classification;
  ;; Insure that ancestors of "relationship" also have null comparisons;
  (flet ((get-null-comparison
	   (concept)
	   (if reified-p 
	       (null-reified-comparison concept)
	       (null-comparison concept))))
    (loop for super in (super-concepts relationship)
	 when (null (get-null-comparison super))
	 do (install-null-comparison super :reified-p reified-p))
    (let (nullCmp)
      (if reified-p
	  (progn
	    (setq nullCmp
		  (make-loom-instance
		    'REIFIED-COMPARISON-FEATURE
		    :relationship relationship
		    :co-references nil))
	    (setf (null-reified-comparison relationship) nullCmp))
	  (progn
	    (setq nullCmp
		  (make-loom-instance
		    'COMPARISON-FEATURE
		    :relationship relationship
		    :roles (when (neq relationship (get-relation 'SAME-AS))
			     ;; add dummy roles
			     (if (binary-p relationship)
				 (list *binary-tuple* *binary-tuple*)
				 (loop for i from 1 to (arity relationship)
				      collect *binary-tuple*)))))
	    (setf (null-comparison relationship) nullCmp)))
      (setf (primitive-p nullCmp) t)
      (install-concept nullCmp
		       (loop for super in (super-concepts relationship)
			    when (get-null-comparison super)
			    collect (get-null-comparison super))
		       nil)
      nullCmp )))
	 
;;; "remove-relation-links"  is called by "unclassify-relation-links"
;;;    to remove inverse links created during the "post-classify" stage:

(defun remove-relation-links (self)
  ;; Locally, we remove non-definitional inverse links and
  ;;    empty the null restriction and "null-comparison" slots;
  (let ((inverseRelation (inverse self)))
    (when inverseRelation 
      ;; we are very careful here not to wipe out the definition of
      ;;    the inverse if IT is "defined" and "self" isn't:
      (if (eq (defined-as self) :inverse)
	  (setf (inverse inverseRelation) nil)
	  (progn
	    (setf (inverse self) nil)
	    (unless (eq (defined-as inverseRelation) :inverse)
	      (setf (inverse inverseRelation) nil))))) 
    (setf (min-1-restriction self) nil)
    (setf (max-1-restriction self) nil)
    (setf (null-max-restriction self) nil)
    (setf (null-value-restriction self) nil)
    (setf (null-filled-by-restriction self) nil)
    (setf (null-not-filled-by-restriction self) nil)
    (setf (null-comparison self) nil)
    ))

;; QUESTION: WHY IS THIS HERE FOR RELATIONS BUT NOT CONCEPTS???
(defun detach-dependent-restrictions (relation)
  ;; Called by "unclassify-one-concept";
  ;; Situation: "relation" is being unclassified;
  ;; Detach all restrictions whose relation is "relation"
  ;;    from the network of classified restrictions;
  ;; CAUTION: Each restriction is still marked as classified, so
  ;;    that "empty-feature-sublattice" can be applied to it in order
  ;;    to revise concepts dependent on it;
  ;; Note: "empty-feature-sublattice" will look for sub-concepts of
  ;;    the restrictions that won't be there -- this appears
  ;;    to be harmless;
  (loop for dep in (dependents relation)
       do (detach-one-concept dep))
  (loop for dep in (non-tbox-dependents relation)
       when (typep dep 'FEATURE)		; RMM 6/10/92
       do (detach-one-concept dep)) )


  ;;
;;;;;; Phantom Inverse Relations
  ;;

(defun check-for-phantom-inverse (relation)
  ;; Called by "install-inverse-links";
  ;; If "relation" has an inverse, then make sure that a phantom is not
  ;;    still attached;
  ;; Otherwise, insure that it has a phantom;
  (let ((phantomInverse (phantom-inverse-relation relation)))
    (if (null (inverse relation))
	;; if there is no inverse, insure presence of phantom inverse:
	(when (null phantomInverse)
	  (setq phantomInverse (create-phantom-inverse-relation))
;	  (add-link phantom-inverse-relation relation phantomInverse :link-is-new t)
	  (setf (phantom-inverse-relation relation) phantomInverse)
	  (setf (inverse-of-phantom phantomInverse) relation))
	;; if there is an inverse, make sure that there is no phantom inverse;
	(when phantomInverse
;	  (del-link phantom-inverse-relation relation phantomInverse)
	  (setf (phantom-inverse-relation relation) nil)
	  (discard-phantom-inverse-relation phantomInverse))) ))

(defun create-phantom-inverse-relation ()
  ;; Return an unused phantom inverse relation;
  (or (pop *recycled-phantom-inverse-relations*)
      (make-PHANTOM-INVERSE-RELATION)) )

(defun discard-phantom-inverse-relation (phantom)
  ;; Recycle "phantom";
  (setf (inverse-of-phantom phantom) nil)
  (push phantom *recycled-phantom-inverse-relations*) )


  ;;
;;;;;; Completion 
  ;;

(defun complete-one-concept (self)
  ;; Inherit knowledge from parents;
  ;; Condition comparison and default knowledge;
  ;; *completionMode* is bound so that the classifier can recognize
  ;;    that a completion is in progress;
  ;;    it has the following possible values:
  ;;    T = normal value during completion;
  ;;    :RECLASSIFY = some concept has been reclassified,
  ;;                  so the current completion must be aborted
  ;;                  after classification is finished by throwing
  ;;                  back to complete-one-concept-catcher with a value of NIL
  ;;    NIL = completion was in progress, but it has been aborted;
  (let ((*conceptBeingConditioned* self)
	(*completionMode* t))
    (declare (special *conceptBeingConditioned* *completionMode*))
    ;; don't waste any work completing incoherent concepts:
    (when (incoherent-p self)
      (setf (implied-restrictions self) nil) ;; Clean this up; TAR 3/30/98
      (return-from complete-one-concept t))
    (addf (system-attributes self) :being-completed)
    (setq *completionMode*
	  (catch 'complete-one-concept-catcher
	    (incorporate-non-tbox-expressions self)
	    (condition-implied-features self)
	    (complete-state-transition-characteristics self)
	    ;; remain in *completionMode*
	    t))
    (delf (system-attributes self) :being-completed)
    (if *completionMode*
	;; return success:
	self
	;; abnormal exit from complete-one-concept-catcher --
        ;;    something needs to be reclassified:
	(progn
	  (when (classified-p self)
	    (post-uncompleted-concept self))
	  (classify&complete-all-concepts)
	  ;; return t if self eventually got completed (a throw might have
	  ;;    aborted this particular completion process)
	  (completed-p self)))) )

(defun nonforcing-complete-one-concept (self)
  ;; Complete self if:
  ;;    1) it has no unclassified non-tbox-depend-ons, AND
  ;;    2) its parents can be completed
  ;; Called recursively on parents;
  (labels ((nonforcing-complete-super-concepts
	     (self)
	     (loop for super in (super-concepts self)
		  always
		  (or (completed-p super)
		      (when (nonforcing-complete-one-concept super)
			(return (nonforcing-complete-super-concepts self)))))))
 #L:trace-complete (trace-values "nonforcing-complete" self)
    (when (completed-p self)
      #L:trace-complete (trace-values "nonforcing-complete: SUCCESS (ALREADY COMPLETED)" self)
      (return-from nonforcing-complete-one-concept self))
    (when (member :being-completed (system-attributes self))
      ;; We return failure here, because the results of completion
      ;; may be invalid when a super-concept is still :being-completed;
      #L:trace-complete (trace-values "nonforcing-complete: FAILURE (ALREADY BEING COMPLETED)" self)
      (return-from nonforcing-complete-one-concept nil))
    (when (and (loop for dep in (non-tbox-depend-ons self)
		    always
		    (classified-p dep))
	       (nonforcing-complete-super-concepts self))
      #L:trace-complete (trace-values "nonforcing-complete: ATTEMPTING COMPLETION" self)
      (when (null (catch 'condition-concept-catcher
		    (complete-one-concept self)))
	(delf (system-attributes self) :being-completed)
	(disengage-badly-conditioned-concept self)
	(return-from nonforcing-complete-one-concept nil))
      (setf (completed-p self) t)
      (emit-classify-string  "+")
      (post-unsealed-concept self)
      ;; post subconcepts of self for later completion
      (loop for sub in (sub-concepts self)
	   when (not (member :temporary (system-attributes sub)))
	   do (post-uncompleted-concept sub))
      self) ))

(defun complete-state-transition-characteristics (self)
  ;; Helping function for "complete-one-concept";
  ;; Inherit :monotonic, :perfect and :temporal characteristics;
  ;; Also, compute :read-only characteristic.
  (let ((allDependOns (list-depend-ons self)))
    (when (and (not (primitive-p self))
	       (or (subconcept-p self (loom-constant CONSTANT))
		   (and allDependOns
			(loop for dep in allDependOns
			    always
			      (or (perfect-p dep)
				  (when (not (completed-p dep))
				    (and (not (primitive-p dep))
					 (subconcept-p
					  dep (loom-constant CONSTANT)))))))))
      (setf (perfect-p self) t))
    (when (or (perfect-p self) 
	      (and (not (primitive-p self))
		   allDependOns
		   (loop for dep in allDependOns
		         always (or (monotonic-p dep)
				    (when (not (completed-p dep))
				      (and (not (primitive-p dep))
					   (subconcept-p 
					    dep (loom-constant CONSTANT))))))))
      (setf (monotonic-p self) t))
    ;; inherit :temporal attribute and have it imply :backward-chaining
    (when (or (temporal-p self)				; TAR 2/11/93
	      (loop for dep in allDependOns
		    thereis (temporal-p dep)))
      (pushnew :temporal (attributes self))
      (complete-temporal-characteristics self)
      )
    ;; inherit :read-only attribute:
    (when
      ;; BUG: CONCEPT WITH NO PRIMITIVENESS AND NOT COMPUTED
      ;;    SHOULD BE READ-ONLY ALSO!!!???
      (and (not (or (member :read-write (attributes self))
                    (and (typep self 'BINARY-RELATION) 
                         (inverse self)
                         (member :read-write (attributes (inverse self))))))
           (or (computed-p self)
               (and (not (primitive-p self))
                    (or (loop for super in (super-concepts self)
                              thereis (member :read-only (attributes super)))
                        (and (depend-ons self)   ; this test is suspect
                             (loop for dep in (depend-ons self)
                                   always (member :read-only (attributes dep))))
                        (and (typep self 'BINARY-RELATION)
                             (inverse self)
                             (member :read-only 
                                     (attributes (inverse self))))))))
      (pushnew :read-only (attributes self))) ))

(defun complete-temporal-characteristics (self)
  ;; Do special completion processing for temporal concepts and relations;
  ;; (1) Have temporal imply :backward-chaining and closed-world
  ;; (2) Set up the list of most specific monotonic non-temporal supers.
  ;; SHOULD THIS USE A PASSCOUNTER?
  (let ((mostSpecificAtemporalMonotonicSupers nil)
	(temporalDependOns nil)
        (alreadyVisited nil))
    (labels ((compute-most-specific-atemporal-monotonic-supers (entity)
               (loop for super in (super-concepts entity)
		     do (if (and (monotonic-p super) (not (temporal-p super)))
			    (pushnew super
				     mostSpecificAtemporalMonotonicSupers)
			    (compute-most-specific-atemporal-monotonic-supers
			     super))) )
             (compute-relation-depend-on (relation restrictions)
               (pushnew relation temporalDependOns)
               (loop for r in restrictions
                     when (and (typep r 'restriction-feature)
                               (qualification r)
                               (neq (qualification r) *thing*))
                     do (pushnew (list relation (qualification r)) 
                                 temporalDependOns
                                 :test #'equal)) )
	     (compute-all-temporal-depend-ons (conceptOrRelation restrictions)
       ;; Recursive collect all temporal depend-ons for "conceptOrRelation";
               (when (and (temporal-p conceptOrRelation)
                          (not (member conceptOrRelation alreadyVisited)))
                 (push conceptOrRelation alreadyVisited)
                 (if (concept-p conceptOrRelation)
                   (progn 
                     (pushnew :type temporalDependOns)
                     (loop for d in (depend-ons conceptOrRelation)
                           do (compute-all-temporal-depend-ons 
                               d (implied-restrictions conceptOrRelation))))
                   (progn 
                     (compute-relation-depend-on conceptOrRelation restrictions)
		     (loop for d in (depend-ons conceptOrRelation)
		           do (compute-all-temporal-depend-ons d nil))))) ) )
      (typecase self
	(TBOX-RELATION (setf (concept-is-closed-p self) t))
	(UNARY-CONCEPT (setf (backward-chaining-p self) t)
		       (setf (concept-is-closed-p self) t))
	(TBOX-CONCEPT  (setf (concept-is-closed-p self) t)))
      (compute-most-specific-atemporal-monotonic-supers self)
      (setf (most-specific-atemporal-monotonic-super-concepts self)
	    mostSpecificAtemporalMonotonicSupers)
      (compute-all-temporal-depend-ons self nil)
      (setf (temporal-depend-ons self) temporalDependOns)
      )))


  ;;
;;;;;; CBOX conditioning
  ;;

;;; CBOX knowledge is conditioned during the completion phase,
;;;    at the same time as the inheritance of non-TBox knowledge;

(defmethod condition-implied-features ((self UNARY-RELATION))
  ;; Consition the implied domain plus all concept slots for "self";
  (call-next-method)
  (condition-implied-property-domain self) )

(defmethod condition-implied-features ((self UNARY-ENTITY))
  ;; Condition the slots containing CBOX knowledge
  ;; The conditioning process does the following:
  ;;    Condition implications;
  ;;    Condition restrictions;
  ;;    Condition comparisons;
  ;; Note: "condition-consequents" is called BEFORE
  ;;    "condition-implied-restrictions" so that induced-value-restrictions
  ;;    pointing at "self" are valid;
  (let (mostSpecificRestrictions mostSpecificCMPs)
    (condition-implied-computed-features self)
    (condition-consequents self)
    (convert-comparisons-to-restrictions self :cbox)
    (setq mostSpecificCMPs (condition-comparisons self :cbox))
    (multiple-value-setq (mostSpecificRestrictions mostSpecificCMPs)
      (condition-restrictions self mostSpecificCMPs :cbox))
    ;; now we install the completed restrictions and comparisons
    (setf (implied-restrictions self) mostSpecificRestrictions)
    (loop for feature in mostSpecificRestrictions
	do (addf (non-tbox-dependents feature) self))
    (setf (implied-comparisons self) mostSpecificCMPs)
    (loop for feature in mostSpecificCMPs
	do (addf (non-tbox-dependents feature) self)))) 

(defun recondition-implied-value-restrictions (concept)
  ;; RE-Condition the implied restrictions belonging to concept; This
  ;;    replaces the value-restrictions in "(implied-restrictions concept)"
  ;;    with possibly more-restricted value restrictions;
  ;; Note: "recondition-implied-value-restrictions" is called when the
  ;;    "more-specific-consequent" slot
  ;;    changes for a concept used as a value restriction;
  ;; Note: We don't attempt to infer additional equivalences here;
  (let (newLocalValueRestrictions)
    (loop for res in (implied-restrictions concept)
	 when (eq (feature-type res) :value-restriction)
	 do
	 (let ((value (value-restriction res)))
	   (when (and (typep value 'UNARY-ENTITY)
		      (more-specific-consequent value)
		      (completed-p value))
	     (push
;              (create-LOCAL-RESTRICTION (relation res) (qualification res)
;		 :local-lower-bound 0 
;		 :local-value-restrictions
;		 (more-specific-consequent value))	       
              `(:all ,(relation res)    ;  TAR 5/15/95
                     ,(more-specific-consequent value)
		     ,(qualification res))
	       newLocalValueRestrictions))))
    (when newLocalValueRestrictions
      (let ((savedRestrictions (implied-restrictions concept)))         ;  TAR 5/15/95
        ;; Careful:  We need to save the old "implied-restrictions" and set
        ;;    the "implied-restrictions" slot to hold the new value 
        ;;    restrictions, since that is where the "condition-restrictions"
        ;;    function looks;
        (setf (implied-restrictions concept) newLocalValueRestrictions)
        (setf (implied-restrictions concept)
	      (most-specific-concepts
	       (nconc
		(condition-restrictions
                 concept (implied-comparisons concept) :cbox)
		savedRestrictions))) )) ))

(defmethod condition-implied-features ((self BINARY-RELATION))
  ;; Condition the slots containing constraint knowledge;
  ;; Comment:  We play around with the domain and range values of
  ;;    "self" to create starting conditions for the function
  ;;    "propagate-domain-and-range-constraints"; 
  (let* ((*conceptBeingConditioned* self)
	 (domain (condition-implied-domain self))
	 (range (condition-implied-range self)))
    (declare (special *conceptBeingConditioned*))
    (setf (implied-domain self) *Thing*)
    (setf (implied-range self) *Thing*)
    (propagate-domain-and-range-constraints self domain range)
    (condition-antecedents self)
    (setf (completed-p self) t) ))

(defun condition-implied-domain (relation)
  ;; Conjoin all local and inherited implied-domain constraints
  ;;     to produce the implied-domain implied by all of them;
  ;; Also, inherit the implied-range from an inverse;
  ;; If the result is a new concept, ask the user to name it;
  ;; Test to see if this implied-domain is incoherent;
  ;; Assign the new implied-domain to "(implied-domain relation)"
  (declare (special *definitionHasChanged*))
  (let ((impliedDomain (implied-domain relation))
	domainConcepts sourceConcepts conjunctionConcept inverseRelation)
    (setq domainConcepts
	  (loop for super in (conjuncts relation)
	       collect (implied-domain super)))
    (pushnew (defined-domain relation) domainConcepts)
    (if (consp impliedDomain)
	(push impliedDomain sourceConcepts)
	(pushnew impliedDomain domainConcepts))
    (when (and (setq inverseRelation (inverse relation))
	       (neq relation inverseRelation))
      (if (consp (implied-range inverseRelation))
	  (push (implied-range inverseRelation) sourceConcepts)
	  (pushnew (implied-range inverseRelation) domainConcepts)))
    (when (eq (defined-as relation) :composition)
      (let ((firstComponent (first (components relation))))
	(when (not (completed-p firstComponent))
	  (nonforcing-complete-one-concept firstComponent))
	(pushnew (implied-domain firstComponent) domainConcepts)))
    (delf domainConcepts nil) 
    (setq conjunctionConcept
	  (touch-conjunction-concept
	    domainConcepts :source-terms sourceConcepts))
    ;; point implied-domain at conjunctionConcept, or the concept it implies
    (let ((newDomain (consequent-concept conjunctionConcept)))
      (setf (implied-domain relation) newDomain)
      (when (neq newDomain impliedDomain)
	(addf (non-tbox-dependents newDomain) relation))
      newDomain) ))

(defun condition-implied-range (relation)
  ;; Conjoin all local and inherited implied-range constraints,
  ;;    to produce the implied-range implied by all of them;
  ;; Also, inherit the implied-domain from an inverse;
  ;; If the result is a new concept, ask the user to name it;
  ;; Test to see if this implied-range is incoherent;
  ;; Assign concept implied by the (possibly new) implied-range
  ;;    to "(implied-range relation)";
  (declare (special *definitionHasChanged*))   
  (let ((impliedRange (implied-range relation))
	rangeConcepts sourceConcepts conjunctionConcept inverseRelation)
    (setq rangeConcepts
	  (loop for super in (conjuncts relation)
	       collect (implied-range super)))
    (if (consp impliedRange)
	(setq sourceConcepts (list impliedRange))
	(pushnew (implied-range relation) rangeConcepts))
    (when (binary-p relation)
      (pushnew (defined-range relation) rangeConcepts)
      (when (and (setq inverseRelation (inverse relation))
		 (neq relation inverseRelation))
	(if (consp (implied-domain inverseRelation))
	    (push (implied-domain inverseRelation) sourceConcepts)
	    (pushnew (implied-domain inverseRelation) rangeConcepts))))
    (when (eq (defined-as relation) :composition)
      (let ((lastComponent (first (last (components relation)))))
	(when (not (completed-p lastComponent))
	  (nonforcing-complete-one-concept lastComponent))
	(pushnew (implied-range lastComponent) rangeConcepts)))
    (delf rangeConcepts nil)
    (setq conjunctionConcept (touch-conjunction-concept
			       rangeConcepts :source-terms sourceConcepts))
    ;; point implied-range at conjunctionConcept, or the concept it implies
    (let ((newRange (consequent-concept conjunctionConcept)))
      (setf (implied-range relation) newRange)
      (when (neq newRange impliedRange)
	(addf (non-tbox-dependents newRange) relation))
      newRange) ))

(defun propagate-domain-and-range-constraints (relation domain range)
  ;; If (the implied restrictions) "domain" or "range" are not
  ;;    generalizations of their local counter-parts, incorporate them
  ;;    into "relation" and then attempt to propagate them to the
  ;;    already completed inverse relation, if it exists;
  (let (becameMoreConstrained inverseRelation)
    (when (not (subconcept-p (implied-domain relation) domain))
      (when (not (subconcept-p domain (implied-domain relation)))
	(setq domain
	      (touch-conjunction-concept
		(list domain (implied-domain relation)))))
      (setf (implied-domain relation) domain)
      (setq becameMoreConstrained t))
    (when (not (subconcept-p (implied-range relation) range))
      (when (not (subconcept-p range (implied-range relation)))
	(setq range
	      (touch-conjunction-concept
		(list range (implied-range relation)))))
      (setf (implied-range relation) range)
      (setq becameMoreConstrained t))
    (when (and becameMoreConstrained
	       (setq inverseRelation (inverse relation))
	       (completed-p inverseRelation))
      ;; Note: we switch domain and range across the inverse link:
      (propagate-domain-and-range-constraints inverseRelation range domain)) ))

(defun condition-implied-property-domain (property)
  ;; Conjoin all local and inherited implied-domain constraints
  ;;     to produce the implied-domain implied by all of them;
  ;; Assign the new implied-domain to "(implied-domain property)"
  (declare (special *definitionHasChanged*))
  (let ((impliedDomain (implied-domain property))
	domainConcepts sourceConcepts conjunctionConcept)
    (setq domainConcepts
	  (loop for super in (conjuncts property)
	      when (property-p super)	; TAR 6/21/99
	      collect (implied-domain super)))
    (if (consp impliedDomain)
	(push impliedDomain sourceConcepts)
	(pushnew impliedDomain domainConcepts))
    (delf domainConcepts nil) 
    (setq conjunctionConcept
	  (touch-conjunction-concept
	    domainConcepts :source-terms sourceConcepts))
    ;; point implied-domain at conjunctionConcept, or the concept it implies
    (let ((newDomain (consequent-concept conjunctionConcept)))
      (setf (implied-domain property) newDomain)
      (when (neq newDomain impliedDomain)
	(addf (non-tbox-dependents newDomain) property))
      newDomain) ))

(defmethod condition-implied-features ((self N-ARY-RELATION))
  ;; Condition the slots containing constraint knowledge;
  ;; Produce default domains and range if none are specified;
  ;; If "self" is not a function, inherit constraints on domains
  ;;    from parents;
  ;; Note: Currently we are too lazy to code up another version of
  ;;    "propagate-domain-and-range-constraints";
  (let ((*conceptBeingConditioned* self)
	(numberOfDomains (1- (arity self))))
    (declare (special *conceptBeingConditioned*))
    ;; if there are no domains, then make some:
    (when (null (implied-domains self))
      (loop repeat numberOfDomains
	   do (push *Thing* (implied-domains self))))
    (when (< (length (implied-domains self)) numberOfDomains)
      (complain "~%Conditioning Error:  ~D-ary relation ~S should have ~D domains~%~
                  specified, but only has ~D: ~S~%Filling extra place~P with THING."
		(arity self) self numberOfDomains (length (implied-domains self))
		(implied-domains self) 
		(- numberOfDomains (length (implied-domains self))))
      (setf (implied-domains self)
	(append (implied-domains self)
		(loop repeat (- numberOfDomains (length (implied-domains self)))
			     collect *thing*))))
    (when (> (length (implied-domains self)) numberOfDomains)
      (complain
       "~%Conditioning Error: ~D-ary relation ~S should only have ~D domains~%~
        specified, but ~D were specified: ~S~%Truncating excess domain~P."
       (arity self) self numberOfDomains (length (implied-domains self))
       (implied-domains self)
       (- (length (implied-domains self)) numberOfDomains))
      (setf (implied-domains self)
	(butlast (implied-domains self)
		 (- (length (implied-domains self)) numberOfDomains))))
    (loop for i from 0 to (1- numberOfDomains)
	 do (condition-nth-domain self i))
    (condition-implied-range self)
    (condition-antecedents self)        ; RMM 2/10/94
    (setf (completed-p self) t) ))

(defun condition-nth-domain (relation position)
  ;; Conjoin all local and inherited constraints on the "position"th domain
  ;;     to produce the domain implied by all of them;
  ;; Also, inherit the range from an inverse;
  ;; If the result is a new concept, ask the user to name it;
  ;; Test to see if the new domain is incoherent;
  ;; Assign the new domain to "(nth position (domains relation))"
  (declare (special *definitionHasChanged*))
  (let ((impliedDomain (nth position (implied-domains relation)))
	domainConcepts sourceConcepts conjunctionConcept)
    (setq domainConcepts
	  (loop for super in (conjuncts relation)
	       collect (nth position (implied-domains super))))
    (if (consp impliedDomain)
	(setq sourceConcepts (list impliedDomain))
	(pushnew impliedDomain domainConcepts))
    (delf domainConcepts nil) 
    (setq conjunctionConcept
	  (touch-conjunction-concept domainConcepts :source-terms sourceConcepts))
    ;; point nth domain at "conjunctionConcept", or the concept it implies
    (setf (nth position (implied-domains relation))
	  (consequent-concept conjunctionConcept)) ))

  ;;
;;;;;; "condition-implied-computed-features"
  ;;

(defmethod condition-implied-computed-features (self)
  ;; Condition implied computed features for the concept "self";
  ;; Side-effect: Install depend-on links to the referents
  ;;    inside of the locally-defined computed features;
  (labels ((add-satisfies-referents-links
	     (concept feature expr)
	     (if (atom expr)
		 (when (typep expr 'TBOX-CONCEPT)
		   (add-link non-tbox-depend-ons concept feature)
		   (addf (non-tbox-dependents expr) feature))
		 (loop for term in expr
		      do 
		      (add-satisfies-referents-links concept feature term))) ))
    (let* ((localFeatures
	    (loop for feature in (implied-computed-features self)
		collect (condition-one-computed-feature feature (context self))))
	   (inheritedFeatures
	     (union-superc-slot-values self implied-computed-features))
	   (allFeatures
	     (most-specific-concepts
	       (sparse-append
		 localFeatures
		 (computed-features self)
		 inheritedFeatures))))
      (when allFeatures
	;; subtract out inherited features from all features, and establish
	;;    "non-tbox-depend-ons" links to referents in those new features:
	(loop for f in allFeatures
	     when (and (not (member f inheritedFeatures))
		       (eq (feature-type f) :satisfies))
	     do 
	     (add-satisfies-referents-links self f (cadr (parameters&body f))))
	;; TO DO: CLASSIFY :satisfies FEATURES
	(setf (implied-computed-features self) allFeatures)
	(loop for feature in allFeatures
	     do (addf (non-tbox-dependents feature) self))) )))
				    

  ;;
;;;;;; Implications
  ;;

(defun condition-consequents (concept)
  ;; Compute the closure of all consequents of "concept"
  ;;    (concepts implied by "concept"):
  ;; First, add in domain-induced consequents (only for
  ;;    locally-restricted at-least-1 relations);
  ;; Next, compute the closure of the "more-specific-consequent" links;
  ;; Next, add in all inherited consequents;
  ;; Finally, compute the conjunction of all consequents
  ;;    (unless "concept" is the only consequent), and
  ;;    create a (double) more-specific-consequent link between
  ;;    "concept" and the conjunction consequent;
  (let ((consequents (list concept))
	newConsequent)
    (flet ((is-min-restriction-p (restriction)
	     (if (listp restriction)
		 (eq (first restriction) :at-least)
	       (eq (feature-type restriction) :min-restriction)))
	   (process-min-1-restriction (relation)
	     (let ((impliedDomain (implied-domain relation)))
	       (when (not (subconcept-p concept impliedDomain ))
		 (when (subconcept-p impliedDomain concept)
		   (with-feature-changes (:set '(:long-print-names))
		     (inform "~&Concept ~S will imply subconcept ~S because~%  ~
                         the domain of relation ~S is more specific and~%  ~
                         concept ~S must have at least one relation ~S.~%"
			     concept impliedDomain relation concept relation)))
		 (pushnew impliedDomain consequents)))))
      ;; These will always be feature objects:
      (loop for res in (restrictions concept)
	  when (is-min-restriction-p res)
	  do (process-min-1-restriction (relation res)))
      ;; These will usually be source features, but may be feature objects
      ;;   in some circumstances:
      (loop for res in (implied-restrictions concept)
	  when (is-min-restriction-p res)
	  do (if (listp res)
		 (process-min-1-restriction (third res))
	       (process-min-1-restriction (relation res))))
	     
      ;; construct any covering concepts:
      (loop for c in (find-or-create-covering-concepts concept)	
	  do (pushnew c consequents))
      ;; compute closure of locally-defined consequents:
      (setq consequents
	(collect-closure-of-consequents consequents))
      ;; inherit consequents:
      (loop for super in (super-concepts concept)
	  do
	    (let ((consequentOfSuper (more-specific-consequent super)))
	      (when consequentOfSuper
		(unless (subconcept-p concept consequentOfSuper)
		  (pushnew consequentOfSuper consequents)))))
      (setq newConsequent
	(if (and (rest consequents)
		 (not (boundp '*disjointnessDepth*)))
	    ;; create conjunction unless in the middle of a disjointness test:
	    (touch-conjunction-concept
	     consequents
	     :temporary-p (member :temporary (system-attributes concept)))
	  (first consequents)))
      (when (neq newConsequent concept)
	(setf (more-specific-consequent concept) newConsequent)
	;; add inverse link to named concept or named supers
	(push concept (antecedents newConsequent)) ; RMM 8/4/93
	(add-non-tbox-depend-ons-link concept newConsequent)
	(post-supers-of-consequent-for-resealing newConsequent concept)
	(post-dependents-for-recompletion concept)) )))

(defun find-or-create-covering-concepts (self)
  ;; Called by "condition-consequents" and "recondition-consequents";
  ;; Generate a list of covering concepts, one for each exhaustive partition
  ;;    owned by "self";
  ;; Tricky: Creates a cover only if there are at least two members.  Otherwise,
  ;;    assumes that a member added later on will call "recondition-consequents"
  ;;    to trigger this computation;
  (let (coverConcepts)
    (loop for p in (partitions self)
	 when (and (exhaustive-partition-p p)
		   (cdr (partition-members p)))
	 do
	 (push
	   (define-concept :is `(:or ,@(partition-members p))
             :characteristics '(:system-defined)         ;  TAR 1/18/96
	     :classify-immediately 'yes)
	   coverConcepts))
    coverConcepts ))

(defun recondition-consequents (concept)
  ;; RE-Compute the closure of all consequents of "concept":
  ;; Compute the closure of the "more-specific-consequent" links;
  ;; Next, add in all inherited consequents;
  ;; Finally, compute the conjunction of all consequents
  ;;    (unless "concept" is the only consequent), and
  ;;    create a (double) more-specific-consequent link between
  ;;    "concept" and the conjunction consequent;
  (let* ((oldConsequent (more-specific-consequent concept))
	 (consequents (list-of oldConsequent))
	 newConsequent)
    (loop for c in (find-or-create-covering-concepts concept)
          do (pushnew c consequents))
    (when consequents
      ;; nullify "more-specific-consequent" slot, thus forcing recomputation
      ;;    of the closure:
      (setf (more-specific-consequent concept) nil)
      (setq consequents
	    (collect-closure-of-consequents consequents)))
    ;; inherit consequents:
    (loop for super in (super-concepts concept)
	 do
	 (let ((consequentOfSuper (more-specific-consequent super)))
	   (when consequentOfSuper
	     (unless (subconcept-p consequentOfSuper concept)
	       (pushnew consequentOfSuper consequents)))))
    (setq newConsequent
	  (if (cdr consequents)
	      (touch-conjunction-concept
		consequents
		:temporary-p (member :temporary (system-attributes concept)))
	      (first consequents)))
    (if (eq newConsequent oldConsequent)
	;; patch old link back in:
	(setf (more-specific-consequent concept) oldConsequent)
	(progn
	  (setf (more-specific-consequent concept) newConsequent)
	  (post-dependents-for-recompletion concept))) ))

(defun collect-closure-of-consequents (listOfConcepts)
  ;; Compute the reflexive, transitive closure of the
  ;;    "more-specific-consequent" relation over "listOfConcepts";
  ;; Return the most-specific of these consequents;
  (let (allConsequents)
    (labels ((help-collect-consequents 
	       (concept)
	       ;; Add "concept" to the list allConsequents;
	       ;; If the consequent of "concept" has already been computed, add
	       ;;    it to allConsequents;
	       ;; Otherwise, recursively follow "more-specific-consequent" links to collect 
	       ;;    further consequents;
	       (pushnew concept allConsequents)
	       (if (more-specific-consequent concept)
		   (pushnew (more-specific-consequent concept) allConsequents) 
		   (loop for imp in (consequents concept)
			when (not (member imp allConsequents))
			do (help-collect-consequents imp)))))
      (loop for concept in listOfConcepts
	   do (help-collect-consequents concept))
      (most-specific-conjuncts
	(most-specific-concepts allConsequents)) )))


  ;;
;;;;;; Antecedent conditioning
  ;;

(defun condition-antecedents (relation)
  ;; Situation: Members of the slot "(antecedents relation)" are either
  ;;    relations or source versions of computed features;
  ;; Convert the latter to objects;
  (when (antecedents relation)
    (setf (antecedents relation)
	  (loop with context = (context relation)
	      for r in (antecedents relation)
	      when (consp r)
	      collect (let ((conditionedFeature 
			     (condition-one-computed-feature r context)))
			(addf (consequents-of-feature conditionedFeature)
			      relation)
			conditionedFeature )
	      else unless (discarded-p r)
	      collect r))) )


  ;;
;;;;;; Recompletion
  ;;

;;; These routines are used to recomplete  (i.e., recondition a CBOX
;;;    component of) a concept or relation when an implication that it
;;;    depends on has become more specific.


(defun post-dependents-for-recompletion (self)
  ;; "self" is a concept whose "more-specific-consequent" slot has
  ;;     become more specific;
  ;; Find all concepts or relations affected by this change, and place
  ;;    them on appropriate recompletion queues;
  (loop for dep in (collect-implication-dependents self)
       when (completed-p dep)
      do (etypecase dep			; TAR 3/29/95
	   (UNARY-ENTITY
	    (setq *list-of-recomplete-value-restrictions-concepts* 
	      (enqueue-for-recompletion
	       dep
	       *list-of-recomplete-value-restrictions-concepts*)))
	   (TBOX-RELATION
	    (setq *list-of-recomplete-range-relations* 
	      (enqueue-for-recompletion
	       dep
	       *list-of-recomplete-range-relations*))))) )


(defun enqueue-for-recompletion (self recompleteList)
  ;; Push "self" onto "recompleteList" unless one of its ancestors
  ;;    is already on the list, and remove descendants from the list;
  ;; Return the (possibly-modified) list;
  ;; If "self" is already there, move self to the front of the list
  ;;    (this MAY be an optimization, but I don't remember why--RMM);
  (loop for tail on recompleteList
       do
       (let ((element (car tail)))
	 (cond
	   ((subconcept-p element self)
	    (setf (car tail) nil))
	   ((subconcept-p self element)
	    (return-from enqueue-for-recompletion recompleteList)))))
  (cons self (delete nil recompleteList)) )

(defun process-recompletion-queues ()
  ;; Recomplete members of the three recompletion queues until
  ;;    all queues are empty;
  ;; First, we empty the implies-queue; that is the only queue which
  ;;    can refill itself during this process;
  ;; Then we empty the value-restriction and range queues; The former
  ;;    of these may fill the CBOX-classification queue;
  (loop
    (when (null *list-of-recomplete-implies-concepts*)
	(return nil))
    (recomplete-sublattice--implications (pop *list-of-recomplete-implies-concepts*)))
  (loop for c in *list-of-recomplete-value-restrictions-concepts*
       do (recomplete-sublattice--value-restrictions c))
  (setq *list-of-recomplete-value-restrictions-concepts* nil)
  (loop for r in *list-of-recomplete-range-relations*
       do (recondition-implied-range
	    r (more-specific-consequent (implied-range r))))
  (setq *list-of-recomplete-range-relations* nil) 
  (integrity-check
    (not *list-of-recomplete-implies-concepts*)) )

(defun recomplete-sublattice--value-restrictions (concept)
  ;; Recompute the implied value-restrictions for "concept"
  ;;    and its descendants;
  ;; TO DO: CALL "post-for-cbox-classification";
  (let ((*conceptBeingConditioned* concept))
    (declare (special *conceptBeingConditioned*))
    (recondition-implied-value-restrictions concept))
  (loop for subConcept in (sub-concepts concept)
       do (recomplete-sublattice--value-restrictions subConcept)) )

(defun recomplete-sublattice--implications (concept)
  ;; Recompute the "more-specific-consequent" slot for
  ;;    "concept" and its descendants;
  ;; If the value changes, post dependents for recompletion;
  (let ((*conceptBeingConditioned* concept))
    (declare (special *conceptBeingConditioned*))
    (recondition-consequents concept))
  (loop for subConcept in (sub-concepts concept)
       do (recomplete-sublattice--implications subConcept)) )

(defun recondition-implied-range (relation newRange)
  ;; Recompute the implied-range of "relation";
  ;; Then do the same for all subrelations of "relation"
  ;; Note: We assume (possibly incorrectly?) that dependents
  ;;    of "relation" will get recompleted by virtue of their
  ;;    restricting the range of "relation" directly;
  ;; TO DO: THIS DOES NOT PROPERLY HANDLE CHANGES TO SUBRELATIONS
  ;;    OR SUBRELATIONS OF AN INVERSE
  (let ((*conceptBeingConditioned* relation))
    (declare (special *conceptBeingConditioned*))
    (propagate-domain-and-range-constraints
     relation
     (implied-domain relation)
    newRange))
  (loop for subRelation in (sub-concepts relation)
       do (recondition-implied-range subRelation newRange)) )
    


;;; TO DO:
#|

|#

;;; POSSIBLE BUGS: 
#|

|#

