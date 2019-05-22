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

;;; SEAL.LISP (TBOX)

(in-package "LOOM")

(export 'finalize-definitions)

  ;;
;;;;;; Network Sealing Functions
  ;;

;;; Before the first ABox assertion, the concepts and relations in a network
;;;    are "sealed".  Sealing refers to the compilation of structures which
;;;    aid the performance of ABox reasoning.
;;; Sealing a unary concept includes initializing disjointness caches and
;;;    initializing any "implementation" specification.
;;; Sealing a relation includes computing and compiling predicates and/or
;;;    access functions for the relation, and for binary relations,
;;;    computing values for the slots "role-is-single-valued-p", and
;;;    "role-is-valued-restricted-p".  These computations facilitate the
;;;    performance of both the matcher and the classifier.

;;; When a new concept or relation is defined, or an existing concept or
;;;    relation is modified, the network is unsealed.  While unsealed, the
;;;    global variable *top-level-unsealed-concepts* keeps track of unsealed
;;;    concepts.  Sealing takes place upon the next ABox operation.
;;; Note: The function "initiate-uncomplete-subgraph" is responsible for unsealing
;;;    the network -- it sets *network-is-sealed-p* to nil;
;;; Parsing and completion routines set *reseal-network-p* to t;

#+CLTL2 (declaim (inline seal-network finalize-definitions))
#-CLTL2 (proclaim '(inline seal-network finalize-definitions))
(defun seal-network ()
  ;; Seal all completed concepts and relations;
  (when *reseal-network-p* (seal-unsealed-concepts)) )

(defun finalize-definitions ()
  "Performs LOOM internal actions needed to bring all definitions up to date."
  ;; User interface for a call to "seal-network";
  (seal-network) )

(defun seal-unsealed-concepts ()
  ;; Seal all concepts in *top-level-unsealed-concepts*, together with their
  ;;    subconcepts;
  ;; Reseal predicates for all relations ABOVE relations in
  ;;    *top-level-unsealed-concepts*;
  ;; Called by "seal-network";
  (when (boundp '*unsealedRelationPredicates*)	; prevent-recursive sealing
    (return-from seal-unsealed-concepts nil))
  (classify-undefined-concepts)		; RMM 12/20/94 ; Moved up TAR 3/17/98
  (let ((savedContext *context*)
	resealSupersP
	*uncompiledComputedFeatures* *unsealedRelationPredicates* 
	*unannotatedMetaObjects* *undecidedNonMaintainablePConcepts* 
	*undecidedRecursivePConcepts* *undecidedRolePTable*
	(*reviseInstancesOfParentConcepts* nil)
	(*conceptsWithClosClasses* nil)
	(sealCount 0))
    (declare (special
              *uncompiledComputedFeatures* *unsealedRelationPredicates*
              *unannotatedMetaObjects* *undecidedNonMaintainablePConcepts* 
              *undecidedRecursivePConcepts* *undecidedRolePTable*
	      *reviseInstancesOfParentConcepts*
	      *conceptsWithClosClasses*))
    (labels ((seal-sublattice (self)
	       ;; Situation: "self" has been completed and default conditioned,
	       ;;    but it has not been sealed;
	       ;; Seal "self" and all of its subconcepts;
	       (unless (member :temporary (system-attributes self))
		 (seal-one-concept self resealSupersP)
		 (incf sealCount))
	       (clear-bit-flags (tbox-flag self) :tbox-flag :about-to-seal)
	       (setf (completed-p self) :sealed)
	       ;; seal sub-concepts of "self":
	       (loop for sub in (sub-concepts self)
		   ;; Optimization for tangled hierarchies to prevent unnecessary
                   ;; duplication of sealing effort.  - TAR 3/16/98
		   do (set-bit-flags (tbox-flag sub) :tbox-flag :about-to-seal))
	       (loop for sub in (sub-concepts self)
		   when (completed-p sub) ; RMM 11/22/94
			;; Tricky:  If there is only one super
			;;   concept, then it was sealed in this
			;;   set of sealing, so it means that we
			;;   do not need to reseal Supers.
			;; Otherwise, we do resealSupers.
		   do (when (or (null (setq resealSupersP
					(cdr (super-concepts sub))))
				(loop for s in (all-super-concepts sub)
				    always (and (sealed-p s)
						(not (test-bit-flags 
						      (tbox-flag s) 
						      :tbox-flag :about-to-seal)))))
			(seal-sublattice sub))
		   else do (clear-bit-flags (tbox-flag self) :tbox-flag :about-to-seal))))
      (unwind-protect
	  (progn
;      (when (and (plusp *count-of-unclassified-concepts*)  ; RMM 11/22/94
;		 (list-unclassified-concepts))
;	(warn-of-unclassified-concepts-during-sealing))
	    (intern-uninterned-concepts)
	    (let ((*sealingInProgressP* t))
	      (declare (special *sealingInProgressP*))
	      (loop for concept in *top-level-unsealed-concepts*
		  when (and (not (member :garbage-concept (system-attributes concept)))
			    (completed-p concept) ; RMM 5/19/94
			    (not (sealed-p concept))
			    (loop for s in (all-super-concepts concept)
				always (sealed-p s))) ; Was (super-concepts concept)
		  do 
		    (setq resealSupersP t)
		    (seal-sublattice concept))
	      (when (and (plusp sealCount)
			 (member :emit-classify-dots *loom-dialogue-features*))
		(inform "~%#sealing operations = ~D~%" sealCount))
	      (setq *top-level-unsealed-concepts* nil) )
	    (reoptimize-invalid-query-code *undecidedRolePTable*)
	    (setq *undecidedRolePTable* nil) ;  TAR 4/28/94
	    ;; note: "*undecidedRecursivePConcepts*" filled by "compute&set-backward-chaining-p":
	    (when *undecidedRecursivePConcepts*
	      (compute-closure-of-recursive-concepts))
	    ;; recompute non-current inherited role fillers tables:
	    (recompute-inherit-fillers-tables) ; RMM 3/30/95   ALERT-PATCH
	    (setq *reseal-network-p* nil)
	    (when (zerop *count-of-unclassified-concepts*) ; RMM 5/19/94
	      (setq *network-is-sealed-p* t))

	    ;; This next operation can be very time consuming, so we only do it if
	    ;;  classified instances exist.  Otherwise it isn't necessary.
	    (when (loop for cxt in (context-precedence-list *context*)
		      thereis (do-context-partition 
				  (nil i (loop for p in (context-partitions cxt)
					     when (eq (key p) :instances)
					     return p))
				(when (classified-instance-p i)
				  (return t))))
	      (loop for concept in *reviseInstancesOfParentConcepts*
		  do (revise-instances-of-parent-concepts concept)))
	    (when (seal-predicates-immediately-p)
	      (seal-unsealed-predicates))
	    ;; AFTER the network is sealed, compile query features:
	    (loop for feature in *uncompiledComputedFeatures*
                do (seal-computed-feature feature))
	    ;; compile any uncompiled productions:
	    (compile-productions-after-sealing)
	    ;; assert any unasserted meta concepts
	    (loop for c in *unannotatedMetaObjects*
                do (assert-annotations c))
	    (reoptimize-invalid-query-code *undecidedRolePTable*) ;  TAR 4/28/94
	    ;; Concepts with pre-existing CLOS classes which may need redefinition:
	    (loop for (concept . computedRoles) in (nreverse *conceptsWithClosClasses*) ; TAR 9/24/93
                do (redefine&relink-clos-class concept)
		   (loop for role in computedRoles
		       do (define-role-accessor-function role))))
        (change-context savedContext))
      ))
  (when *top-level-unsealed-concepts*
    ;; New unsealed concepts have been added in processing, most likely by the
    ;;   code that causes instance revision (conjunction concepts can be formed
    ;;   then).  That means we should recursively invoke the sealing code.
    ;; NOTE:  This recursive call must be outside the scope of the variables
    ;;    introduced by the LET block, because otherwise the early exit will
    ;;    be triggered.
    (seal-unsealed-concepts)) )

(defun seal-unsealed-predicates ()
  ;; Helping function for "seal-unsealed-concepts" and "seal-cluster-of-predicats".
  ;; Generate and compile query code for relations in
  ;;    *unsealedRelationPredicates*.
  ;; bind all unsealed predicate symbols to avoid unbound function
  ;;    warnings during compilation of recursively dependent predicates:
  (declare (special *unsealedRelationPredicates*))
  (let ((computedPredicateP t)
        (*sealingUnsealedPredicatesP* t)
        unsealedRelations)
    (declare (special *sealingUnsealedPredicatesP*))
    (loop for relation in *unsealedRelationPredicates*
          when (super-concepts relation)	; exclude "Binary-tuple" and "N-ARY-TUPLE"
          do 
	  ;; Do this here, because not all calls come through "seal-unsealed-concepts";
	  (bind-identifier&predicate-symbol relation)   ; TAR 5/19/95
          (setf (symbol-function (predicate-symbol relation))
                *dont-call-function*))
    ;; AFTER network is sealed, compile relation predicates:
    (loop while computedPredicateP
          do 
          (setq computedPredicateP nil)
          (setq unsealedRelations *unsealedRelationPredicates*)
          (setq *unsealedRelationPredicates* nil)
          (loop for relation in unsealedRelations
                do 
		;(delf (system-attributes relation) :unsealed-predicate)
                (when (super-concepts relation)	; exclude "Binary-tuple" and "N-ARY-TUPLE"
                  (if (eq (catch :too-early
                            (seal-predicate-symbol relation))
                          :too-early)
		      (progn   ;; Must delete it in order to repost!
			(delf (system-attributes relation) :unsealed-predicate)
			(post-unsealed-predicate relation))
		    (progn 
		      (delf (system-attributes relation) :unsealed-predicate)
                      (setq computedPredicateP t))))))
    (when *unsealedRelationPredicates*
      (cerror "Continue" "Unable to compute predicates for relations ~A"
              *unsealedRelationPredicates*))
    ))
  




;; OLD TEST FROM ABOVE:
;(and (loop for super in (super-concepts relation)          ;  TAR 8/26/94
;                                     never (member super
;                                                   *unsealedRelationPredicates*))
;                                  (or (neq (defined-as relation) :inverse)
;                                      (not (member (inverse relation) 
;                                                   *unsealedRelationPredicates*))))

(defun warn-of-unclassified-concepts ()
  ;; Called by "to-seal-or-not-to-seal";
  ;; Generate error message if undefined or unclassified concepts existed
  ;;    when LOOM tried to seal the network;
  (unless (and (plusp *count-of-unclassified-concepts*)  ; RMM 11/22/94
               (list-unclassified-concepts))
    (return-from warn-of-unclassified-concepts nil))
  (let ((undefinedConcepts (list-undefined-concepts)))
    (when undefinedConcepts
      ;; try to fix things by destroying any undefined concepts that
      ;; have no dependents (because the dependent(s) were subsequently
      ;; redefined):
      (loop for c in undefinedConcepts
            when (null (list-dependents c :all-p t))
            do (destroy-concept c))
      (setq undefinedConcepts (list-undefined-concepts))
      (when (and (null undefinedConcepts)
                 (null (list-unclassified-concepts)))
        ;; we fixed the net!!
        (return-from warn-of-unclassified-concepts nil)))
    (cond
     (undefinedConcepts
      (let* ((firstConcept (first undefinedConcepts))
             (dependentConcepts
              (loop for i from 1 to 4
                    as c in (list-dependents firstConcept :all-p t)
                    collect c)))
        (format *error-output*
                "~&The concept or relation ``~S'' is undefined.~%" (name firstConcept))
        (when dependentConcepts
          (format *error-output*
                  "   `list-dependents' indicates that the following concepts and/or relations~%   ~
                   reference ~S:   ~S ."
                  (name firstConcept) dependentConcepts)))
      (warn ;cerror "Resume running LOOM." 
              "Undefined concepts exist.~%~
               Execute `(LIST-UNDEFINED-CONCEPTS)' to retrieve all undefined concepts.~%~
               Redefining all concept(s) that reference an undefined concept *may* fix~%~
               the problem.  Otherwise, call `DESTROY-CONCEPT' to eliminate an unwanted ~%~
               undefined concept or call `(DESTROY-UNCLASSIFIED-CONCEPTS)' to eliminate~%~
               all undefined and/or unclassified concepts.~%~
               Note:  You must abort from the break stack before the network can be~%~
               resealed."))
     ((and (list-unclassified-concepts)
	   (bad-definition-p (first (list-unclassified-concepts))))
      (warn  ; cerror "Resume running LOOM"
              "Unclassified concepts exist.~%   ~
               For example, ~S is unclassified because it has an illegal definition.~%   ~
               Redefining ~S with a legal definition may fix the problem."
              (first (list-unclassified-concepts)) (first (list-unclassified-concepts))))
     (t
      (warn ; cerror "Resume running LOOM"
              "Unclassified concepts exist.~%   ~
               For example, ~S is unclassified.~%   ~
               Execute `(find-tbox-cycles)' to check for circularly-defined concepts.~%"
              (first (list-unclassified-concepts))))) ))

(defun reoptimize-invalid-query-code (undecidedRoleTable)
  ;; Situation: "undecidedRoleTable" pairs relations that were not sealed
  ;;    before being referenced with referencing relations or features that assumed
  ;;    the referenced relation was capable of generating role fillers;
  ;; Reoptimize any query code that made an invalid assumption;
  (let ((newlyUndecidedRoleTable nil)
	reoptimizedObjects )
    (labels ((reseal-relation (relation)
	       (let ((wasGeneratorRoleP (compiled-generator-p relation)))
		 (immediately-seal-predicate-symbol relation)
		 (push relation reoptimizedObjects)
		 (when (and wasGeneratorRoleP
			    (not (compiled-generator-p relation))
			    (assoc relation undecidedRoleTable))
		   (push (cons relation
			       (cdr (assoc relation undecidedRoleTable)))
			 newlyUndecidedRoleTable))))
	     (reseal-computed-feature (feature)
	       (setf (source-predicate feature) nil) ; signal recompilation
	       (seal-computed-feature feature))
	     (help-reoptimize-invalid-relations ()
               (loop for (key . codeObjects) in undecidedRoleTable
                     when (not (compiled-generator-p key))
                     do (loop for codeBearingObject in codeObjects
                              unless (member codeBearingObject reoptimizedObjects)
                              do (etypecase codeBearingObject
                                   (TBOX-RELATION
                                    (reseal-relation codeBearingObject))
                                   (COMPUTED-FEATURE 
                                    (reseal-computed-feature codeBearingObject)))))))
      (loop
	(setq reoptimizedObjects nil)
	(help-reoptimize-invalid-relations)
	(when (null newlyUndecidedRoleTable)
	  (return nil))				; exit loop
	(setq undecidedRoleTable newlyUndecidedRoleTable 
              newlyUndecidedRoleTable nil)) )))


  ;;
;;;;;; "seal-one-concept"
  ;;

(defun seal-one-concept (self resealSupersP)
  ;; Called by "seal-unsealed-concepts";
  ;; Compute non-maintainable flag;
  ;; Insure that "self" has been asserted to be an instance of
  ;;    either the meta-thing Concept or the meta-thing Relation;
  ;; Post any instances affected by the change in the definition of "self"
  ;;    on the retraction queue;
  ;; Call "help-seal-one-concept" to perform additional sealing functions specific
  ;;    to unary concepts or relations;
  ;; "resealSupersP" indicates that the parents of "self" were sealed during a
  ;;    previous call to "seal-network", and might have to be resealed;
  #L:trace-seal (trace-values "seal-one-concept:" self)
  (when (garbage-concept-p self)
    (emit-classify-string "f")
    (return-from seal-one-concept nil))
  (let ((identifier (getf (cdar (source-definitions self)) :identifier)))
    ;; because we use non-standard indexing of contexts to concepts and relations,
    ;;    hand-build context index:
    (when (or identifier 
              (relation-p self)
              (not (member :system-generated-name (system-attributes self))))
      (bind-identifier&predicate-symbol self :identifier identifier))
    ;; because we can't call "initialize-clos-instance", we hand build
    ;;    concept/instances indices:
    (unless (null (loom-concept self))     ; this happens too soon in the bootstrap
      (add-to-local-instances (loom-concept self) self)
      (pushnew (loom-concept self) (dynamically-asserted-conjuncts self)))
    ;; insure that the predicate for "self" is not sealed:
    (unseal-predicate-symbol self)
    ;; push "self" on queue to check for recursion:
    (post-recursive-p-computation self)
    ;; insure that annotations are evaluated in the right context:
    (change-context (context self))
    (assert-annotations self)
    (help-seal-one-concept self resealSupersP)
    (compute-concept-is-closed-p self)
    (emit-classify-string  "!") ))

(defun unseal-one-concept (self)
  ;; Undo effects of sealing the concept or relation "self";
  ;; Called by "post-supers-of-consequent-for-resealing" and
  ;;    "help-uncomplete-indirect-dependents", which itself is called by
  ;;    "uncomplete-sublattice";
  ;; Called only on concepts that must be unsealed but don't need to be
  ;;    uncompleted, since the latter operation sumbsumes
  ;;    this one (wipes out these slots plus more);
  ;; Tricky: We DON'T unseal predicate symbols, because the OLD compiled access
  ;;    functions are used when revising dependent instances;
  (when (not (sealed-p self))
    (return-from unseal-one-concept nil))
  (when (concept-p self)
    (when (not (backward-chaining-p self))
      ;; Context sensitive and more efficient code:           ; TAR 11/21/96  
      ;;  DOES THIS NEED TO DO ALL SUPER or SUBCONCEPTS AS WELL?
      (execute-in-contexts-depth-first
;        (do-local-instances (i self)
;	  (when (and (typep i 'DB-INSTANCE) (has-instance-p self i))
;	    (revise-one-instance i)))
       (loop for i in (generate-instances self :cached-p t :unfiltered-p t)
	   as ctxt = (home-ctxt i)
	   when (and ctxt (subctxt-p *current-ctxt* ctxt))
	   do (revise-one-instance i))
       	)
      (setf (backward-chaining-p self) nil))
    (setf (backward-chaining-complexity self) nil))
  (delf (system-attributes self) :posted-on-recursive-p-queue)
  (when (recursive-p self)
    (setf (recursive-p self) nil)
    (delf (system-attributes self) :directly-recursive))
  (setf (completed-p self) :conditioned-defaults)       ; RMM 3/29/95
  (setf (concept-is-closed-p self) nil)
  (post-unsealed-concept self) )


  ;;
;;;;;; Sealing of Concepts
  ;;

(defmethod help-seal-one-concept ((self UNARY-ENTITY) resealSupersP)
  ;; Called by "seal-one-concept";
  ;; Situation: "self" is a concept which has been defined or redefined
  ;;    after the network was sealed;
  ;; Place any uncompiled query features on the list *uncompiledComputedFeatures*;
  ;; Replace symbols in role fillers features that represent instance identifiers
  ;;    by the corresponding instances;
  ;; Post instances of parents of "self" for rematching;
  ;; TO DO: ESTABLISH LOCAL INSTANCES FOR NON-SYMBOLIC FINITE SETS;
  ;; TO DO: DETERMINE WHETHER WE SHOULD NULLIFY "local-instances" DURING UNSEALING;
  (declare (special *uncompiledComputedFeatures*)
	   (ignore resealSupersP))
  (loop for feature in (union (computed-features self) 
			 (implied-computed-features self))
       when (case (feature-type feature)
	      (:satisfies (null (source-predicate feature)))
	      (:predicate (null (compiled-predicate feature))))
       do (push feature *uncompiledComputedFeatures*))

  ;; for each relation restricted by an implied restriction, see if "self"
  ;;    is the domain of that restriction; if so, check if the role was single
  ;;    valued and now isn't;
  ;; comment: The call to "compute-role-is-single-valued-p" can generate
  ;;    a warning message, but it doesn't affect the slot value;
  ;; comment: If "self" previously had a max 1 restriction on a relation
  ;;    but now has no restriction at all, we fail to call
  ;;    "compute-role-is-single-valued-p";
  (loop for res in (implied-restrictions self)
       when (eq (implied-domain (relation res)) self)
       do (compute-role-is-single-valued-p 
	    (relation res) :dont-update-slot-p t))
  (alert-relation-of-strict-or-default-fillers self)
  (add-set-members-to-concept-index self)
  (immediately-seal-predicate-symbol self)
  (compute-backward-chaining-p self)
  (compute-backward-chaining-complexity self) )

(defmethod help-seal-one-concept ((self UNARY-CONCEPT) resealSupersP)
  ;; Called by "seal-one-concept";
  ;; Situation: "self" is a concept which has been defined or redefined;
  ;; Do sealing common to both properties and concepts;
  ;; Then:
  ;;    Revise instances;
  ;;    Turn role specifications into role objects;
  ;;    Redefine already-existing CLOS class;
  ;; Semi-tricky: We do NOT necessarily create a CLOS class during sealing,
  ;;    but if one already exists, then we ensure that its up-to-date by 
  ;;    redefining it during sealing;
  ;; Also, we create a class if roles with computed accessors are attached
  ;;    to "self";
  (declare (special *conceptsWithClosClasses*
		    *reviseInstancesOfParentConcepts*))
  (call-next-method)
  (when resealSupersP
    (push self *reviseInstancesOfParentConcepts*))
  ;; validate keys, inherit :keyed characteristic, create query indices:
  (seal-keys&indices self)
  ;; seal roles:
  (convert-roles-to-objects self)
  (let ((computedRoles 
         (loop for role in (role-cache self)
               when (getf (role-specification role) :function)
               collect role)))
    ;; if a CLOS class with a name matching the concept name exists,
    ;;    and if "self" is shadowed by a CLOS class, then ensure that
    ;;    the definition of the CLOS class matches that of the concept:
    (when (or (CLOS::find-class (name self) nil)
              (member :clos-class (attributes self))    ; RMM 8/2/93
              computedRoles)
      (pushnew (cons self computedRoles) *conceptsWithClosClasses*
               :test #'equal)) )) ; TAR 9/24/93

(defun add-set-members-to-concept-index (self)
  ;; Helping function for "help-seal-one-concept";
  ;; Push set members for "self" onto its local instances slot unless
  ;;    the members are numeric or the concept is system defined;
  ;; QUESTION: DOES THIS FILL TOO MANY CONCEPTS (I.E., NOT JUST BASE SETS)?
  (let ((setFeature (defined-set-feature self))
	(constantP (subconcept-p self (loom-constant CONSTANT))))
    (when (and (eq (defined-as self) :set)
               (neq (members setFeature) :INFINITE-SET)       ; RMM 11/30/94
	       (user-defined-p self)	                      ; TAR 11/8/96
	       (not (subconcept-p self (loom-constant NUMBER))))
      (loop for m in (typecase setFeature
		       (SYMBOLIC-INTERVAL (symbols setFeature))
		       (otherwise (members setFeature)))
	    do
	    (cond
             (constantP
              (add-to-local-instances self m))
             ((classified-instance-p m)     ; RMM 3/12/93
              (when (null (conjuncts-table  m))	; RMM 4/27/92
                (post-non-analyzable-modified-instance m :retraction nil))
              (assert-conjunct m self :assertion))
             ((typep m 'INSTANCE-WITH-CONCEPTS)         ;  TAR 3/29/95
              (assert-conjunct m self :assertion))))) ))

(defmethod compute-concept-is-closed-p ((self UNARY-ENTITY))
  ;; Mark "self" as closed world if:
  ;;    (1) "self" has the property :closed-world or :perfect; OR
  ;;    (2) all of its definitional referents are closed, OR
  ;;    (3) "self" defines a finite set, OR
  ;;    (4) "self" is computed, OR
  ;;    (5) (open-closed-mode *context*) is :closed and "self"
  ;;          is primitive;
  (when (sealed-p self)
    ;; quick exit if another concept or role is being sealed:
    (return-from compute-concept-is-closed-p (concept-is-closed-p self)))
  (setf (concept-is-closed-p self)
        (or (member :closed-world (attributes self))
	    (perfect-p self)
	    (and (eq (defined-as self) :set)
		 (ignore-errors  ;; To catch possible unbound variable from
		                 ;; loom-constant!  Can happen during bootstrap.
		   (subconcept-p self (loom-constant SYMBOL))))
            (and (or (and (not (primitive-p self))
		          (loop for dep in (depend-ons self)
		                always (compute-concept-is-closed-p dep)))
                     (computed-p self)
	             (and (not (test-bit-flags (context-flag *context*) 
					       :context-flag :open-world))
			  ;; was *global-closed-world-p* ; TAR 6/11/96
		          (primitive-p self)))
                 (not (member :open-world (attributes self)))))) )


  ;;
;;;;;; sealing keys and indices
  ;;

(defun seal-keys&indices (concept)
  ;; Validate the roles in an concept keys, inherit the :keyed characteristic,
  ;;    and create a query index for each index attached to "concept";
  (validate-keys concept)
  ;; inherit the :keyed characteristic:
  (when (or (keys concept)
            (loop for super in (super-concepts concept) 
                  thereis (keyed-concept-p super)))
    (pushnew :keyed (system-attributes concept)))
  (seal-query-indices concept) )

(defun validate-keys (concept)
  ;; Verify that role components of keys are single-valued, and that "concept"
  ;;    is primitive;
  (when (null (keys concept))
    (return-from validate-keys nil))
  (when (not (primitive-p concept))
    (complain "~&Illegal key: Only primitive concepts can have keys, and ~S
is not primitive." concept))
  ;; normalize keys into a list of lists:
  (setf (keys concept)
        (loop for key in (list-of (keys concept))
              collect (list-of key)))
  (loop for key in (keys concept)
        do (loop for role in key
                 when (not (compute-role-is-single-valued-p role))
                 do (complain "~&Illegal key: The role ~S in a key on concept ~S
is not single-valued." role concept))) )

;;; A roles index is a "blanket index" if the indexed concept equals the 
;;;    implied domain of one or more of the roles.  Otherwise, a membership
;;;    test must be applied before an instance is added to the roles index.
;;; It is an error if one of the roles in an index is not primitive or not
;;;    single-valued, or has subroles, or has antecedents.
;;; It is an error if the implied domain of one of the index roles
;;;    specializes the indexed concept.

(defun seal-query-indices (concept)
  ;; Create a query index for each entry in "query-index-roles", and attached
  ;;    each index to the referenced roles (binary relations);
  (setf (query-index-roles concept)     ; normalize roles into a list of lists
        (loop for role in (list-of (query-index-roles concept))
              collect (list-of role)))
  (loop for roles in (query-index-roles concept)
        do
        (let ((blanketIndexP nil))
          (loop for r in roles
                do
                (cond
                 ((not (and (primitive-p r)
                            (compute-role-is-single-valued-p r)
                            (null (sub-concepts r))
                            (null (antecedents r))))
                  (complain "~&Illegal index: The role ~S in an index on concept ~S
is not a primitive, single-valued role with no subroles or antecedents."
                            r concept)
		  (push :illegal-role-index (system-attributes r))  ; DGB 7/30/93
                  (setq roles nil))
                 ((eq (implied-domain r) concept)
                  (setq blanketIndexP t))
                 ((subconcept-p (implied-domain r) concept)
                  (complain "~&Illegal index: The domain of the role ~S in an index
on concept ~S properly specializes that concept" r concept)
                  (setq roles nil))))
          (unless (null roles)
            (create-query-index 
             concept roles blanketIndexP
             (loop for key in (keys concept)
                   thereis (set-equal-p key roles)))))) )

(defun create-query-index (concept roles blanketIndexP uniqueP)
  ;; Create a roles index on "roles" for "concept", and add it to
  ;;    the list of query indexes on that concept;
  (let ((newIndex (make-QUERY-INDEX))
        (eqlTestP
         ;; TO DO: FIX UP THIS TEST:
         (and (null (rest roles))
              (loop for c in (list (loom-constant Number)
                                   (loom-constant Symbol))
                    thereis (subconcept-p 
                             (implied-range (first roles))
                             c)))))
    (setf (indexed-concept newIndex) concept)
    (setf (blanket-index-p newIndex) blanketIndexP)
    (setf (index-roles newIndex) roles)
    (setf (unique-key-p newIndex) uniqueP)
    (setf (index-hash-table newIndex)
          (make-hash-table :test (if eqlTestP #'eql #'equal)))
    (loop for role in roles
          do (push newIndex (query-indices role))) ))


  ;;
;;;;;; Computing role filler inheritance tables
  ;;

(defun alert-relation-of-strict-or-default-fillers  (self)      ; ALERT-PATCH
  ;; Helping function for "help-seal-one-concept";
  ;; For each relation for which "self" has strict or default fillers,
  ;;    save the relation in *modified-inherit-fillers-relations* and 
  ;;    post the relation for resealing;
  (declare (special *unsealedRelationPredicates*)) 
  (flet ((discard-inherit-fillers-records (fillersTable)
	   (loop for record in fillersTable
		 do (discard-inherit-fillers-record record))))
    (loop for ftr in (implied-restrictions self)
	  when (eq (feature-type ftr) :filled-by)
	  do
	  (let ((relation (relation ftr)))
	    (discard-inherit-fillers-records (strict-fillers-table relation))
	    (setf (strict-fillers-table relation) nil)
	    (pushnew (relation ftr) *modified-inherit-fillers-relations*)
	    (when (sealed-p relation)
              (if (boundp '*unsealedRelationPredicates*)
		  ;; we are somewhere inside of "seal-network"
		  (post-unsealed-predicate relation)
		;; we are outside of "seal-network"
		(unseal-one-concept relation)))))
    (loop for ftr in (default-features self)
	  when (eq (feature-type ftr) :filled-by)
	  do
	  (let ((relation (relation ftr)))
	    (discard-inherit-fillers-records (default-fillers-table relation))
	    (setf (default-fillers-table relation) nil)
	    (pushnew relation *modified-inherit-fillers-relations*)
	    (when (sealed-p relation)
              (if (boundp '*unsealedRelationPredicates*)
		  ;; we are somewhere inside of "seal-network"
		  (post-unsealed-predicate relation)
		;; we are outside of "seal-network"
		(unseal-one-concept relation))))) ))

(defun recompute-inherit-fillers-tables ()      ; RMM 3/30/95  ALERT-PATCH
  ;; Called by "seal-unsealed-concepts";
  ;; Recompute the strict and default fillers indices for the relations
  ;;    in "relations", and post the relations for resealing;
  (loop for rel in *modified-inherit-fillers-relations*
      do (compute-strict&default-fillers-tables rel)
	 (post-unsealed-predicate rel))
  (setq *modified-inherit-fillers-relations* nil) )

(defun compute-strict&default-fillers-tables (relation)
  ;; Called by "recompute-inherit-fillers-tables";
  ;; Recompute the indices for "relation" used in inheriting
  ;;    strict and default role fillers;
  (parents-first-do-subconcepts (concept (implied-domain relation))
          ;; Safety test:  There could be unprocessed concepts that get
	  ;;   picked up by the subconcept walk.  This skips them.  If they
          ;;   are relevant, then they will cause this function to be invoked
          ;;   again once they seal.
	  (when (completed-p concept)
	    (loop for ftr in (implied-restrictions concept)
	       when (and (eq (feature-type ftr) :filled-by)
			  (eq (relation ftr) relation))
	       do (augment-strict-fillers-table relation concept (role-fillers ftr)))
	    (loop for ftr in (default-features concept)
	       when (and (eq (feature-type ftr) :filled-by)
			  (eq (relation ftr) relation))
	       do (augment-default-fillers-table relation concept (role-fillers ftr))))) )

(defun augment-strict-fillers-table (relation concept fillers)
  ;; Helping function for "compute-strict&default-fillers-tables";
  ;; Forall x, membership of x in "concept" implies that the role `"relation"
  ;;   of x' contains each filler in "fillers";  Augment the strict fillers
  ;;   index to record this inference, unless it's redundant;
  ;; Slightly tricky: Relies on the fact that superconcepts of "concept"
  ;;    have already been visited, and their strict fillers are already
  ;;    in the table;
  ;; More trickiness: We allow primitive concepts to map to redundant
  ;;    fillers, since "append-strict-fillers" looks for a single
  ;;    concept from which to inherit fillers;
  (when (loop for f in fillers
	     thereis
	     (loop for entry in (strict-fillers-table relation)
		 never (and (subconcept-p concept
					  (inherit-fillers-test-concept entry))
			    (member f (inherit-fillers-fillers entry) 
				    :test #'filler-equal))))
    (push (create-inherit-fillers-record concept fillers relation)
	  (strict-fillers-table relation))) )

(defun augment-default-fillers-table (relation concept fillers)
  ;; Helping function for "compute-strict&default-fillers-tables";
  ;; Forall x, membership of x in "concept" implies that the role `"relation"
  ;;   of x' inherits each default filler in "fillers";  Augment the default
  ;;   fillers index to record this inference, unless its redundant;
  ;; Relies on the fact that "compute-strict&default-fillers-tables" visits 
  ;;   each concept only once;
  (let ((localFillers
	 (loop for ftr in (default-features concept)
	      when (and (eq (feature-type ftr) :filled-by)
			(eq (relation ftr) relation))
	      append (role-fillers ftr)))
	(inheritedFillers
	 (loop for super in (super-concepts concept)
	      append
	      (loop for ftr in (default-features super)
		   when (and (eq (feature-type ftr) :filled-by)
			     (eq (relation ftr) relation))
		   append (role-fillers ftr)))))
    ;; build a table of all sets of default fillers for the role "relation"
    ;;    that inherit down to "concept":
    (when (not (set-equal-p localFillers inheritedFillers :test #'filler-equal))
      ;; point entries above the entry for "concept" at it:
      (loop for entry in (default-fillers-table relation)
	   when (subconcept-p concept (inherit-fillers-test-concept entry))
	   do (push concept (inherit-fillers-subconcepts entry)))
      ;; create new table entry:
      (push (create-inherit-fillers-record concept fillers relation)
	    (default-fillers-table relation))) ))

(defun create-inherit-fillers-record (testConcept fillers relation)
  ;; Create a new inherit fillers record;
  ;; Fill in the slot "assertion-only-test-p" which is true
  ;;    if role filler inheritance can only derived from instances
  ;;    ASSERTED to belong to the test concept;
  (let ((newRecord
	  (or (pop *recycled-inherit-fillers-records*)
	      (make-INHERIT-FILLERS-RECORD)) ))
    (setf (inherit-fillers-test-concept newRecord) testConcept)
    (setf (inherit-fillers-fillers newRecord) fillers)
       ;; The following used to also require 
       ;;       (null (most-general-antecedents testConcept)),
       ;; but we now test the antecedents separately to avoid
       ;; infinite recursion when the testConcept depends on the 
       ;; fillers of relation.  If ...assertion-only-test-p is T, then
       ;; it is NOT safe to do backward-chaining on "testConcept".
    (setf (inherit-fillers-assertion-only-test-p newRecord)
          (or (primitive-p testConcept)
              (loop for ftr in (restrictions testConcept)
                    thereis
                    (and (eq (feature-type ftr) :filled-by)
                         (eq (relation ftr) relation)
                         (set-equal-p (role-fillers ftr) fillers
				      :test #'filler-equal)))))
    newRecord ))

(defun discard-inherit-fillers-record (record)
  (setf (inherit-fillers-test-concept record) nil)
  (setf (inherit-fillers-fillers record) nil)
  (setf (inherit-fillers-assertion-only-test-p record) nil)
  (setf (inherit-fillers-subconcepts record) nil)
  (push record *recycled-inherit-fillers-records*) )

      
  ;;
;;;;;; backward-chaining-p computation
  ;;

(defun compute-backward-chaining-p (self)
  ;; If Loom instances don't get classified under "self", then mark
  ;;    "self" as backward chaining;
  ;; SEE BUGS FILE FOR AN EXAMPLE RELATED TO THIS FUNCTION;
  ;; TO DO: FIGURE OUT IF COMPUTED FEATURES ARE *ALWAYS* BC;
  (let ((alreadyVisitedConcepts nil))
    (labels
	(
;; Used in commented out code below:
;	 (backward-chaining-concept-p (concept)
;	 (and (concept-p concept)
;              (or (backward-chaining-p concept)
;                  (and (not (sealed-p concept))
;                       (help-compute-backward-chaining-p concept)))))
       (help-compute-backward-chaining-p (concept)
         (when (member concept alreadyVisitedConcepts)
           (return-from help-compute-backward-chaining-p nil))
         (when (backward-chaining-p concept)
           (return-from help-compute-backward-chaining-p t))
         (push concept alreadyVisitedConcepts)
         (when 
           (or (member :backward-chaining (attributes concept)) ; TAR 6/16/98
	       (subconcept-p concept (loom-constant CONSTANT))
               (pure-set-definition-p concept)
               (and (null (primitive-concepts concept))
                    (conjuncts concept)) ;; not Thing or Relates
;; NEW THEORY OF BACKWARDCHAINING SAYS THAT ONLY CONSTANTS AND
;;    CONCEPTS WITH NO PRIMITIVENESS ARE BC.    RMM 1/25/94
;               (and (not (primitive-p concept))
;                    (loop for dep in (conjuncts concept)
;                          thereis
;                          (backward-chaining-concept-p dep)))
;               (loop for ant in (antecedents concept)
;                         thereis (backward-chaining-concept-p ant))
               ;; THIS SHOULD NEVER HAPPEN:
;               (loop for f in (computed-features concept)
;                     thereis (member (feature-type f) '(:function :predicate)))

	       (loop for f in (computed-features concept) ; TAR 2/13/96
		     thereis (and (eq (feature-type f) :satisfies)
				  (loop for c in (concept-references f)
					thereis (and (typep c 'N-ARY-RELATION)
						     (> (arity c) 2)))))
               )
           (setf (backward-chaining-p concept) t))))
      (help-compute-backward-chaining-p self) )))
      

  ;;
;;;;;; Sealing of Relations
  ;;

(defmethod help-seal-one-concept ((self TBOX-RELATION) resealSupersP)
  ;; Called by "seal-one-concept";
  ;; Situation: "self" is a relation which has been defined or redefined;
  ;; Recompute its role slots;
  ;; Note: Computed features of relations don't get sealed;
  ;; call method which does different things for binary relations than
  ;;    for n-ary relations:
  (seal-relation self) 
  ;; Insure that slot-lookup computations are still valid:
  (when resealSupersP
    (loop for super in (all-super-concepts self)
	do (post-unsealed-predicate super))) )


;;; Sealing a Relation -- Role Computations:

;;; We use the term "role" to refer to the use of a relation as
;;;    an property of a concept.  The facets
;;;    "role-is-single-valued-p" and "concept-is-closed-p" of each relation
;;;    relate to its use as a role, and are computed by "sealing"
;;;    the relations in a context;

;;; "Sealing" a relation has the following effects:
;;;
;;;   (1) The "role-is-single-valued-p" computation commits the database
;;;       to a particular
;;;       implementation for each instance variable;  It can be changed
;;;       only by calling "seal-network", followed by a call to
;;;       "initialize-instances" or "initialize-network" to rebuild
;;;       the ABox, because each instance variable must be recomputed;

(defmethod seal-relation ((self N-ARY-RELATION))
  ;; Called by "help-seal-one-concept";
  ;; "self" is a non-binary computed relation;
  ;; Insure that its predicate function gets sealed;
  ;; Create tuple index if necessary;
  (post-unsealed-predicate self)
  (if (hashed-relation-p self)
      (progn
	(when (null (tuple-index self))
	  (setf (tuple-index self) (make-hash-table :test #'equal)))
	(setf (key-matches-tuple-p-fn self) #'filler-equal))
       (setf (key-matches-tuple-p-fn self)
	 (if (and (single-valued-p self)
		  (not (hashed-relation-p self)))
	     (let ((keyLength (1- (arity self))))
	       (case keyLength
		 (2 #'equal-places-1&2-p)
		 (3 #'equal-places-1&2&3-p)
		 (otherwise (find-or-create-key-matches-tuple-fn keyLength))))
	     #'filler-equal))) )

(defmethod seal-relation ((self BINARY-RELATION))
  ;; Called by "help-seal-one-concept";
  ;; Define slot accessors for the binary relation "self", compute
  ;;    whether "self" is single- or set-valued, compute
  ;;    whether or not "self" is referenced within the TBox;
  ;; Comment: The slot "role-is-value-restricted-p" is computed inside of
  ;;    "classify-local-restriction", and is only inherited here.
  (compute-role-is-single-valued-p self)
  (compute-role-assertion-triggers-rematching self)
  (when (loop for super in (super-concepts self)     ; RMM 5/16/95
             thereis (role-is-value-restricted-p super))
    (setf (role-is-value-restricted-p self) t))

;; THIS IS SPECULATIVE CODE STILL:
;  ;; TO DO: UPGRADE TO wrap BLOCKING FUNCTION AROUND PRE-EXISTING add-fillers-fn:
;  (when (read-only-p self)
;    (setf (add-fillers-fn self) #'block-writes-to-read-only-role))

  (if (and (not (computed-p self))
	   (or (primitive-p self)
	       (and (eq (defined-as self) :inverse)
		    (primitive-p (inverse self))))
	   (multiple-value-bind (subroles antecedents inverseAntecedents)
	       (collect-subroles&antecedents self)
	     (declare (ignore dummy))
	     (and (null antecedents)
		  (null inverseAntecedents)
		  (loop for subrole in subroles
		      always (predicate-symbol subrole)))))
      (when (eq (progn (delf (system-attributes self) :unsealed-predicate)
		       (catch :too-early (immediately-seal-predicate-symbol self)))
		:too-early)
	(post-unsealed-predicate self))
      
      ;; defer compilation of predicates that might generate
      ;;    calls to "form-query":
      (post-unsealed-predicate self)) )

;;; "compute-role-is-single-valued-p" determine whether storage for
;;;    and instance role is allocated for a single value or for a list
;;;    of values:
;;; If "relation" is marked as single-valued, check to see if that
;;;    status still holds;  If not, generate a warning message;
;;; Note: We never try to change the "single-valued" status of a
;;;    sealed relation, since doing so requires rebuilding the
;;;    entire database (in order to reimplement the corresponding slots);
;;; Note: if "relation" was collection-valued before, but is now
;;;    single-valued, we do nothing, because we don't want to change the
;;;    implementation of db-instances mid-stream.  The penalty is that
;;;    only that the role isn't optimized.  

(defun compute-role-is-single-valued-p (role &key dont-update-slot-p)
  ;; Set "(role-is-single-valued-p role)" to t if a max 1 number restriction
  ;;    is attached to the implied domain of "role";
  ;; Return the new status of "role";
  ;; BUG: If "role" is marked as "collection-valued" during sealing
  ;;    and later becomes "single-valued", we can't detect the earlier sealed
  ;;    computation; hence, the database can get screwed up;
  ;; Note: "check-single-valued-status-of-relation" deliberately avoids 
  ;;    tranforming a single-valued role into a collection-valued role to
  ;;    minimize the impact of the above-mentioned bug;
  (let (singleValuedP)
    (cond
     ((or (single-valued-p role)
          (total-p role)               ; PROLOG
          (and (or (auxiliary-lambda-function role)
		   (member :role-with-method (system-attributes role)))	;TAR 10/27/93
               (not (member :multiple-valued (attributes role)))))
      (setf singleValuedP t))
     ((implied-domain role)            ; guard against null domain
      (loop for res in (implied-restrictions (implied-domain role))
            when  (and (eq (feature-type res) :max-restriction)
                       ;; TAR 8/1/95: (eq (relation res) role) replaced by:
                       (subconcept-p role (relation res))
                       (or (null (qualification res))
                           ;; Use MORE-RESTRICTIVE-DEFINED-RANGE instead?
                           (subconcept-p (implied-range role)
                                         (qualification res))))
            do (when (eql (upper-bound res) 1)
                 (setf singleValuedP t)))))

    (when (and (not singleValuedP)
	       (eq (defined-as role) :composition))
      ;; A composition is single valued if all members of the chain
      ;;   are single valued
      ;; OR there is an element which takes a collection and returns a
      ;;    single value.  This role can be extended by a further chain
      ;;    of single-valued relations
      ;; TRICKY:  We check this by going backwards down the chain until
      ;;    we either find a COLLECTION => single-valued role in which
      ;;    case T is returned, or we find a non-single-valued role in
      ;;    which case NIL is returned.  If the Loop ends, then it means
      ;;    all relations were single-valued, so T is returned.
      (setq singleValuedP
	(loop for comp in (reverse (components role))
	    unless (role-is-single-valued-p comp)
	    return nil
	    when (subconcept-p (implied-domain comp) (loom-constant COLLECTION))
	    return t
	    finally (return t))))
    
    (when (and (role-is-single-valued-p role)
	       (not singleValuedP))
      (warn "Bad news:  The relation '~S' was previously determined to
              be single-valued, but now it's not.~%   ~
             If values have already been stored in corresponding roles of ~
             database instances,~%   ~
             the database must be reinitialized and rebuilt~%"
	    (name role)))
    (unless dont-update-slot-p
      (setf (role-is-single-valued-p role) singleValuedP))
    ;; Comment: Should this return (role-is-single-valued-p role) instead?
    singleValuedP ))

(defun compute-role-assertion-triggers-rematching (relation)
  ;; Situation:  "relation" is being sealed;
  ;; Compute and set the flags "relation-in-equivalence-restriction-p" and 
  ;;   "relation-in-computed-restriction-p" if the relation is referenced
  ;;   in an equivalence relation or appears in a computed restriction.
  ;;   This information is used to trigger rematching for assertions to
  ;;   these relations on classified instances;
  (setf (relation-in-computed-restriction-p relation) nil)
  (setf (relation-in-equivalence-restriction-p relation) nil)
  (loop for dep in (dependents relation)
	do (typecase dep
	     (COMPUTED-FEATURE
	      (setf (relation-in-computed-restriction-p relation) t))
	     (UNARY-ENTITY
	      (when (loop for comp in (implied-comparisons dep)
			  thereis (member relation (roles comp)))
		(setf (relation-in-equivalence-restriction-p relation) t))))) )


(defmethod compute-concept-is-closed-p ((self BINARY-RELATION))
  ;; Set "(concept-is-closed-p self)" to t if
  ;;    (1) it has the property :closed-world, OR
  ;;    (2) all of its definitional referents are closed, OR
  ;;    (3) its non-definitional inverse is closed, OR
  ;;    (4) it does NOT have the property :open-world and either
  ;;    (4a)  (open-closed-mode *context*) is :closed and "self"
  ;;          is effectively primitive, OR
  ;;    (4b)  "self" is a persistent computed relation defined only
  ;;          by other closed relations;
  ;; NOTE: (4b) IS NOT YET IMPLEMENTED;
  (when (sealed-p self)
    ;; quick exit if another concept or role is being sealed:
    (return-from compute-concept-is-closed-p (concept-is-closed-p self)))
  (setf (concept-is-closed-p self) 
	(or (member :closed-world (attributes self))
	    (and (inverse self)
		 (neq (defined-as self) :inverse)
		 ;; we are careful here to avoid infinite recursion:
		 (concept-is-closed-p (inverse self)))
	    (and (not (primitive-p self))
		 (loop for dep in (depend-ons self)
		       always (compute-concept-is-closed-p dep)))	    
	    (and (not (member :open-world (attributes self)))
		 (or (computed-p self)
                     (and (not (test-bit-flags (context-flag *context*) 
					       :context-flag :open-world))
			  ;; was *global-closed-world-p* TAR 6/11/96
                          (or (primitive-p self)
                              (defined-as self))))))) )

(defmethod compute-concept-is-closed-p ((self N-ARY-RELATION))
  ;; N-ary relations are either explicitly closed or not;
  ;; Set "(concept-is-closed-p self)" and return the result;
  (when (sealed-p self)
    ;; quick exit if another concept or role is being sealed:
    (return-from compute-concept-is-closed-p (concept-is-closed-p self)))
  (setf (concept-is-closed-p self)
        (or (member :closed-world (attributes self))
            (and (not (member :open-world (attributes self)))
                 (or (computed-p self)
                       ;; was *global-closed-world-p* TAR 6/11/96
                     (not (test-bit-flags (context-flag *context*) 
					  :context-flag :open-world)))))) )


;;; The methods and functions below are called by "seal-one-concept" to
;;;   perform various sealing activities which are common to both concepts
;;;   and relations.

  ;;
;;;;;; "seal-computed-feature"
  ;;

(defun seal-computed-feature (feature)
  ;; Situation: The network has been sealed, and its now safe to compile
  ;;    the query embedded in "feature";
  ;; For :satisfies feature:
  ;;    Generate source for both a predicate and a function, but compile
  ;;       only the predicate, and only if its attached to a concept;
  ;; For :predicate feature:
  ;;    Compile the predicate if its attached to a concept;
  ;; For :function feature: Do nothing;
  ;; CAUTION: Caller of "seal-computed-feature" must insure that the
  ;;    *context* is restored to its original value after
  ;;    computed features are sealed;
  ;; TO DO: MAKE SURE "form-query" CAN RECOVER FROM BAD QUERY BY
  ;;    RETURNING NIL;
  (let ((savedContext *context*))
    (when (neq (context-of-feature feature) savedContext)
      (change-context (context-of-feature feature)))
    (case (feature-type feature)
      (:satisfies
       (when (source-predicate feature)		; exit if feature is already sealed
	 (return-from seal-computed-feature nil))
       (let* ((parameters&body (parameters&body feature))
	      (parameters (car parameters&body))
	      (body (generate-dereferenced-expression (cadr parameters&body)))
	      (*codeObjectBeingSealed* feature)
	      query)
	 (declare (special *codeObjectBeingSealed*))
	 (integrity-check (null (cdr parameters)))
	 ;; generate source predicate, and possibly compile:
         (setq query (form-query nil body))
         (unless query              ; Check for successful code generation
           (setq query
                 `(complain "~%Feature ~A~%  cannot be computed. ~
                             Consider revising the definition of concept~P~%  ~
                             ~{~A~^, ~}.~%" ',feature
                            ,(length (dependents feature))
                            ',(dependents feature))))
         (setq query `(lambda ,parameters
                        (declare (optimize (speed 3)))
                        ,query))
         (setf (source-predicate feature) query)
         (setf (compiled-predicate feature) 
               (compile nil query))
;;; OBSOLETE UNLESS WE DECIDE TO SEAL FEATURES ATTACHED TO RELATIONS:
;       ;; generate source function:
;       (setq query
;	     `(lambda ,(butlast parameters)
;		,(form-query (last parameters) body)))
;       (when query
;	 (setf (source-function feature) query))
	 ))
      (:predicate
       (let ((sourceQuery (source-predicate feature)))
	 (integrity-check (null (cdr (second sourceQuery))))
	 (when (null (compiled-predicate feature))	; not already sealed
	   (let ((compilerNote nil))
	     (multiple-value-bind (compiledQuery diagnosticP seriousDiagnosticP)
		 #+:allegro-v4.3
		 (handler-bind ((comp:compiler-note #'(lambda (c)
							(declare (ignore c))
							(setq compilerNote t))))
		   (compile nil sourceQuery))
		 #-:allegro-v4.3
		 (compile nil sourceQuery)
	       (print-message-if-bad-function 
		  diagnosticP 
		  (and seriousDiagnosticP (not compilerNote))
		  feature
		  sourceQuery)
	       (setf (compiled-predicate feature) compiledQuery)) )))))

    (when (neq (context-of-feature feature) savedContext)
      (change-context savedContext)) ))


  ;;
;;;;;; Lowest-level functions for computing non-maintainableness
  ;;

;;; The backward chaining complexity computations are used by "has-instance-p"
;;;    in choosing an efficient backward chaining scheme.  The current set of
;;;    schemes includes a :standard scheme that runs a standard subsumption
;;;    test to match an instance, and a :backtrack scheme that invokes
;;;    recursive backtracking in the case that the concept is directly
;;;    recursive.

(defmethod compute-backward-chaining-complexity ((self UNARY-ENTITY))
  ;; Called by "compute-backward-chaining-p";
  ;; Assist the functions "has-instance-p" and "generate-instances" by determining
  ;;    whether a simple or moderate set of tests is sufficient
  ;;    to determine concept membership, or if full backtracking
  ;;    is indicated;
  ;; Side-effect: The slot "most-general-antecendents" gets filled in;
  ;; BUG: IF CONCEPTS BELOW "self" ARE DEFINED LATER ON, THIS COMPUTATION
  ;;    MUST BE RERUN TO CATCH POSSIBLE ANTECEDENTS OF THOSE CONCEPTS, BUT IT
  ;;    ISN'T!!!
  (flet ((locally-compute-most-general-antecedents
	     ()
	   ;; Compute the set of most general antecedents;
	   ;; Try to preserve the original order of antecedents;
	   (setf (most-general-antecedents self)
		 (most-general-concepts 
                  (nreverse 
                   (collect-direct-antecedents self))
                  :destructive-p t))))
    (locally-compute-most-general-antecedents)
    (setf (backward-chaining-complexity self)
          (if (member :directly-recursive (system-attributes self))
            :backtrack :standard)) ))

;; TO DO:  THIS FUNCTION IS OBSOLETE, BUT WE AREN'T ELIMINATING IT UNTIL
;;    WE OBSERVED THAT THE WARNING INSIDE OF IT NEVER HAPPENS:
;; NOTE:  THIS FUNCTION STILL GETS CALLED, SO WE CAN'T ELIMINATE IT!
;;    WARNING MESSAGE DISABLED:  TAR 5/15/96
#+CLTL2 (declaim (inline compute-most-general-antecedents))
#-CLTL2 (proclaim '(inline compute-most-general-antecedents))
(defun compute-most-general-antecedents (self)
  ;; Compute the set of most general antecedents of the concept
  ;;    "self" and cache the result;
  ;; Side-effect: Also compute the backward chaining complexity of "self";
  ;; If "(backward-chaining-complexity self)" is non-nil, we assume
  ;;    that both values have already been computed and cached;
  ;; Called by functions that can't be sure whether or not the
  ;;    most general antecedents have already been computed;
  (when (not (backward-chaining-complexity self))
    ; (warn "OOPS! FAILED TO PRECOMPUTE BC COMPLEXITY")
    (compute-backward-chaining-complexity self))
  (most-general-antecedents self) )

;; THIS IS PROBABLY OBSOLETE:
(defun warn-of-constraints-on-non-classifying-concept (self)
  ;; Helping function for "compute-backward-chaining-complexity";
  ;; Situation: Instances do not classify under "self";
  ;; Generate a warning if any locally-defined constraints or defaults
  ;;    are attached to "self";
  (macrolet ((locally-defined-features
	       (slotExpression)
	       `(loop for f in ,slotExpression
		     unless (loop for c in (super-concepts self)
				 thereis (member f (,(first slotExpression) c)))
		     collect f))
	     (local&not-definitional-p
	       (slotExpression1 slotExpression2)
	       `(loop for f in (locally-defined-features ,slotExpression1)
		     thereis (and (not (eq (feature-type f) :filled-by))
				  (not (member f ,slotExpression2))))))
    (when (or (local&not-definitional-p (implied-restrictions self) 
					(restrictions self))
	      (local&not-definitional-p (implied-comparisons self) 
					(comparisons self))
	      (local&not-definitional-p (implied-computed-features self) 
					(computed-features self)))
      (warn "Concept ~S has attached constraints, but instances do not classify~%   ~
                      under it, and hence the constraints cannot be checked."
	    (generate-external-reference self)))
    (when (or (locally-defined-features (default-features self))
	      (loop for defaultC in (default-concepts self)
		   thereis (not (loop for super in (super-concepts self)
				     always (member defaultC (default-concepts super))))))
      (warn "Concept ~S has attached defaults, but instances do not classify~%   ~
                      under it, and hence the defaults cannot be applied."
	    (generate-external-reference self))) ))

(defmethod compute-backward-chaining-complexity ((self TBOX-RELATION))
  ;; Currently, we don't discriminate various kinds of complexity
  ;;    for non-concept relations;
  nil )

(defun collect-direct-antecedents (self)
  ;; Return a list of concepts that are direct antecedents of "self"
  ;;    or of subconcepts of "self";
  ;; Exclude subconcepts of "self" from the result;
  ;; Called by "compute&set-non-maintainable", "collect-logical-depend-ons",
  ;;    and "compute-backward-chaining-complexity";
  (declare (special *directAntecedentsCache*))
  (when (boundp '*directAntecedentsCache*)      ; DGB 3/5/93
    (multiple-value-bind (result cachedP)
	(gethash self *directAntecedentsCache*)
      (when cachedP
	(return-from collect-direct-antecedents result))))
  (let ((passCounter (decf *revise-subgraph-pass-counter*))
	antecedents)
    (labels ((help-collect-antecedents
		 (sub)
	       (setf (already-revised-counter sub) passCounter)
	       (loop for ant in (antecedents sub)
		    unless (subconcept-p ant self)
		    do (pushnew ant antecedents))
	       (loop for subOfSub in (sub-concepts sub)
		    unless (eql (already-revised-counter subOfSub) passCounter)
		    do (help-collect-antecedents subOfSub))))
      (help-collect-antecedents self)
      (when (boundp '*directAntecedentsCache*)
	(setf (gethash self *directAntecedentsCache*) antecedents))
      antecedents )))

(defmethod primitive-or-inverse-primitive-p ((self TBOX-CONCEPT))
  ;; Return t if "self" is primitive;
  (primitive-p self) )

(defmethod primitive-or-inverse-primitive-p ((self BINARY-RELATION))
  ;; Return t if "self" or its inverse is primitive;
  (or (primitive-p self)
      (and (eq (defined-as self) :inverse)
	   (primitive-p (inverse self)))) )


  ;;
;;;;;; "recursive-p" computations
  ;;

(defun post-recursive-p-computation (concept)
  ;; Push "concept" onto the queue *undecidedRecursivePConcepts* unless its already
  ;;    there;
  ;; Note:  A marker scheme is needed to avoid duplicate entries while avoiding
  ;;    superlinear performance;
  (declare (special *undecidedRecursivePConcepts*))
  (unless (member :posted-on-recursive-p-queue (system-attributes concept))
    (push :posted-on-recursive-p-queue (system-attributes concept))
    (push concept *undecidedRecursivePConcepts*)) )

(defun pop-recursive-p-computation ()
  ;; Pop a concept from the *undecidedRecursivePConcepts* queue, and remove the
  ;;    :posted-on-recursive-p-queue mark that prevents duplicate entries;
  (declare (special *undecidedRecursivePConcepts*))
  (let ((concept (pop *undecidedRecursivePConcepts*)))
    (when concept
      (delf (system-attributes concept) :posted-on-recursive-p-queue)
      concept) ))

(defun compute-closure-of-recursive-concepts ()
  ;; Called by "seal-unsealed-concepts";
  ;; Note: The initial list of possibly recursive concepts was populated
  ;;    by "seal-one-concept" can contains all concepts affected by
  ;;    the current sealing phase;
  (declare (special *undecidedRecursivePConcepts*))
  (let* ((recursiveConceptCount (length *undecidedRecursivePConcepts*))
	 (*logicalDependOnsCache* (make-hash-table :size recursiveConceptCount))
	 (*directAntecedentsCache* (make-hash-table :size recursiveConceptCount))
	 concept)
    (declare (special *logicalDependOnsCache* *directAntecedentsCache*))
    (loop
      (setq concept (pop-recursive-p-computation))
      (when (null concept)
	(clrhash *logicalDependOnsCache*)
	(clrhash *directAntecedentsCache*)
	(return-from compute-closure-of-recursive-concepts nil))
      (compute-directly-recursive-p concept)
      (when (or (member :directly-recursive (system-attributes concept))
		(loop for dep in (collect-logical-depend-ons concept)
		    thereis (recursive-p dep)))
	(setf (recursive-p concept) t)
	(loop for dep in (collect-bc-nonrecursive-logical-dependents concept)
	     do (post-recursive-p-computation dep)))) ))

(defun compute-directly-recursive-p (self)
  ;; Return t if "self" depends on itself in some manner that
  ;;    can affect recognizing instantiations of "self" as a
  ;;    predicate;
  (labels ((check-for-predicate-variable-in-computed-features (object)
	     ;; Checks to see if there is a computed feature with
	     ;;  a variable in predicate position.  If so, be conservative
	     ;;  and assume that this might bind recursively, and therefore
	     ;;  mark "self" directly recursive.
	     (loop for ftr in (computed-features object)
		 when (predicate-variable-p ftr)
		 do (pushnew :directly-recursive (system-attributes self))
		    (compute-backward-chaining-complexity self)
		    (return-from compute-directly-recursive-p t)))
	   (search-generalized-depend-ons (dep)
	     (cond
	      ((gethash dep *recursive-p-hash-table*) nil) ; skip over "dep"
	      ((eq dep self)
	       ;; "self" is directly recursive, return t:
	       (pushnew :directly-recursive (system-attributes self))
	       (compute-backward-chaining-complexity self)
	       (return-from compute-directly-recursive-p t))
	      (t
	       (check-for-predicate-variable-in-computed-features dep)
	       (setf (gethash dep *recursive-p-hash-table*) t)
	       (loop for depOfDep in (collect-logical-depend-ons dep)
		   do (search-generalized-depend-ons depOfDep))))))
    (clrhash *recursive-p-hash-table*)
    (check-for-predicate-variable-in-computed-features self)
    (loop for dep in (collect-logical-depend-ons self)
	do (search-generalized-depend-ons dep))
    nil ))

(defun collect-logical-depend-ons (self)
  ;; Specialized helping function for "compute-directly-recursive-p"
  ;;    and "compute-closure-of-recursive-concepts";
  ;; Return a list representing the union of "(depend-ons self)",
  ;;    concepts in antecedents of "self", concepts referenced
  ;;    in :satisfies features within the definition of "self",
  ;;    and (if "self" is a relation) dependent implied :filled-by
  ;;    features that imply "self";
  ;; However, if "self" is primitive, collect only concepts in
  ;;    antecedents of "self";
  (declare (special *logicalDependOnsCache*))
  (multiple-value-bind (result cachedP)
      (gethash self *logicalDependOnsCache*)
    (when cachedP
      (return-from collect-logical-depend-ons result)))
  (let ((dependOns
         (loop for ant in (collect-direct-antecedents self)
	     when (typep ant 'TBOX-CONCEPT)
	     collect ant
	     else when (eq (feature-type ant) :satisfies)
	     append (concept-references ant))))
    (unless (primitive-p self)
      (setq dependOns
	    (sparse-append
             dependOns
             (depend-ons self)
             (loop for f in (computed-features self)
		   when (eq (feature-type f) :satisfies)
		   append (concept-references f)))))
    (when (typep self 'TBOX-RELATION)
      (loop for dep in (non-tbox-dependents self)
	  when (and (concept-p dep)
		    ;; This can be called before all defaults are conditioned!
		    (or (and (test-bit-flags (tbox-flag dep) :tbox-flag  ; Assure defaults are conditioned!
					    :or :conditioned-defaults :sealed)
			     (loop for f in (default-features dep)
				 thereis (and (eq (feature-type f) :filled-by)
					      (eq (relation f) self)
					      (not (member f (restrictions dep))))))
			;; And under rare circumstances, apparently even when
			;;   some dependents are not completed!;
			;; Speculation: This may be when there are some concepts with
			;;   bad definitions in the network;
			(and (test-bit-flags (tbox-flag dep) :tbox-flag :completed)
			     (loop for f in (implied-restrictions dep)
				 thereis (and (eq (feature-type f) :filled-by)
					      (eq (relation f) self)
					      (not (member f (restrictions dep))))))))
	    do (push dep dependOns)))
    (setq dependOns (fast-remove-duplicates dependOns))
    (setf (gethash self *logicalDependOnsCache*) dependOns) ))

(defun collect-bc-nonrecursive-logical-dependents (self)
  ;; Specialized helping function for "compute-closure-of-recursive-concepts";
  ;; Return a list of non-maintainable, non-recursive concepts selected
  ;;    from the union of non-primitive dependents of
  ;;    "self", non-primitive concepts that reference "self" within
  ;;    a :satisfies feature included in their definition,
  ;;    :satisfies features that have a concept/relation as a consequent,
  ;;    and concepts at or above consequents of "self";
  ;; Explanation: "self" has just been marked as recursive, and
  ;;    this search looks for dependents or consequents of "self" that
  ;;    might now be computed as recursive as well;
  (let (dependents)
    (flet ((push-dependent (dep)
	     (when (not (recursive-p dep))
	       (pushnew dep dependents))))
      (loop for dep in (dependents self)
	  do (typecase dep
	       (TBOX-CONCEPT
		(when (not (primitive-or-inverse-primitive-p dep))
		  (push-dependent dep)))
	       (COMPUTED-FEATURE
		(loop for c in (dependents dep)
		    unless (primitive-or-inverse-primitive-p c)
		    do (push-dependent c))
		(loop for c in (consequents-of-feature dep)
		    do (push-dependent c)))))
      (loop for dep in (conjuncts self)	;  TAR 9/21/94
	  when (super-concepts dep)	; Don't collect BINARY-TUPLE or THING!
	  do (push-dependent dep))
      (loop for con in (consequents self)
	  do (push-dependent con)
	     (loop for superOfCon in (super-concepts con)
		 unless (subconcept-p self superOfCon)
		 do (push-dependent superOfCon)))
      dependents )))


  ;;
;;;;;; Revision of Instances
  ;;

;;; "revise-dependent-instances" is called when the network is undergoing
;;;    unclassification; It causes dependent instances to
;;;    be "revised", meaning that their features get unclassified;
;;;    The features are reclassified when the depend-on relations
;;;    are (re)classified;

(defmethod revise-dependent-instances ((relation BINARY-RELATION))
  ;; Called by "unclassify-one-concept";
  ;; Situation: "relation" is a role relation which is being unclassified;
  ;; All instances containing features that reference "relation"
  ;;    must unclassify their features;
  ;; After "relation" is reclassified, the features of each are
  ;;    reclassified;
  ;; Dependent instances are posted for rematching here;
  (flet ((unclassify-features
	     (features instance)
           (let ((unclassifiedFeatures
                  (loop for f in features
                        collect (if (and (typep f 'FEATURE)
                                         (eq (relation f) relation))
                                  (unclassify-instance-feature f instance)
                                  f))))
             (when unclassifiedFeatures
               (cons :reclassify unclassifiedFeatures)))))
    (loop for i in (dependent-instances relation)
          unless (discarded-instance-with-histories-p i) 
          do
          (setf (asserted-features i)
	        (unclassify-features (asserted-features i) i))
          (setf (violated-features i)
	        (unclassify-features (violated-features i) i))
          (revise-one-instance i)) ))

(defmethod unclassify-instance-feature ((self RESTRICTION-FEATURE) instance)
  ;; Helping method for "revise-dependent-instances";
  ;; Return an unclassified version of the restriction-feature "self";
  (delf (dependent-instances (relation self)) instance)
  (let ((localRestriction
	  (create-local-restriction (relation self) nil)))
    (ecase (feature-type self)
      (:value-restriction 
       (setf (local-value-restrictions localRestriction)
	     (value-restriction self)))
      (:min-restriction
       (setf (local-lower-bound localRestriction)
	     (lower-bound self)))
      (:max-restriction
       (setf (local-upper-bound localRestriction)
	     (upper-bound self)))
      (:not-filled-by
       (setf (local-non-role-fillers localRestriction)
	     (non-role-fillers self))))
    localRestriction) )

(defmethod unclassify-instance-feature ((self COMPARISON-FEATURE) instance)
  ;; Helping method for "revise-dependent-instances";
  ;; Return an unclassified version of the comparison-feature "self";
  (loop for r in (roles self)
       do (delf (dependent-instances r) instance))
  (let ((comparisonFeature (make-instance 'COMPARISON-FEATURE)))
    (setf (relationship comparisonFeature) (relationship self))
    (setf (roles comparisonFeature) (roles self))
    comparisonFeature ))

(defmethod unclassify-instance-feature 
           ((self REIFIED-COMPARISON-FEATURE) instance)
  ;; Helping method for "revise-dependent-instances";
  ;; Return an unclassified version of the comparison-feature "self";
  (declare (ignore instance))
  (let ((comparisonFeature (make-instance 'COMPARISON-FEATURE)))
    (setf (relationship comparisonFeature) (relationship self))
    (setf (co-references comparisonFeature) (co-references self))
    comparisonFeature ))

(defmethod revise-dependent-instances ((relation N-ARY-RELATION))
  ;; Called by "unclassify-one-concept";
  ;; Computed relations don't have dependent instances, so do nothing;
  nil )

(defun reclassify-asserted-features-of-dependents (self)
  ;; Called by "post-classify-concept";
  ;; Reclassify any asserted features or violated features attached to 
  ;;   instances that reference "self";
  ;; Note: Extra logic needed to skip over null restrictions;
  (flet ((classify-features (features)
	   (let (classifiedFeatures)
	     (loop for f in features
		  when (setq classifiedFeatures
			     (if (and (not (typep f 'FEATURE))
				      (eq (local-relation f) self))
				 (classify-instance-feature f self)
				 (list f)))
		  append classifiedFeatures))))
    (loop for i in (dependent-instances self)
	 do
	 (setf (asserted-features i)
	       (classify-features (asserted-features i))) 
	 (setf (violated-features i)
	       (classify-features (violated-features i)))) )) 


  ;;
;;;;;; Recomputation of Instance Types
  ;;

(defun revise-one-instance (instance &key monotonic-p)
  ;; Situation: "instance" depends on a concept or relation that has been editted;
  ;; Retract all derived inferences for "instance", and post it on the
  ;;    retraction match queue;
  ;; Called by "unseal-one-concept", "revise-dependent-instances", and
  ;;    "revise-instances-of-parent-concepts";
  ;; BUG: RELATION EDITS DON'T ALWAYS CALL THIS FUNCTION (BECAUSE WE DON'T
  ;;    HAVE INDICES FROM RELATIONS TO ALL INSTANCES THAT REFERENCE THEM);
  (initialize-one-instance instance :monotonic-p monotonic-p) )

(defun revise-instances-of-parent-concepts (self)
  ;; Called by "UNARY-CONCEPT.help-seal-one-concept";
  ;; Push instances of parents of "self" onto the queue for rematching, since
  ;;    they may now match the new definition of "self", even though they
  ;;    didn't match it previously;
  (declare (special *dontReviseInstancesP*))   ; TAR 8/5/97
  (when (boundp '*dontReviseInstancesP*)
    (return-from revise-instances-of-parent-concepts nil))
  (let ((definitionOnlyP (member :definition-only (system-attributes self)))
	startingConcept ersatzStartingConcept)
    (when (not (backward-chaining-p self))
      ;; Can't use this test in anc because the previous definition might
      ;;  have been non-primitive.  --  TAR 2/16/99 
      ;;(not (primitive-p self))
      ;;
      ;; Try to find a non backward-chaining generator concept with primitiveness,
      ;;    if possible.
      ;; TO DO:  SEE IF SOME IDEAS FROM THE QUERY OPTIMIZER CAN BE USED TO
      ;;         FIND A GOOD CONCEPT GENERATOR.
      (setq startingConcept
	(or (loop for c in (super-concepts self)
		when (primitive-concepts c)
		do (cond ((not (backward-chaining-p c))
			  (return c))
			 (ersatzStartingConcept nil)
			 (t (setq ersatzStartingConcept c))))
	    ersatzStartingConcept
	    (first (super-concepts self))))

      (execute-in-contexts-depth-first
       (loop for i in (generate-instances startingConcept)
             do (revise-one-instance i :monotonic-p definitionOnlyP))
       ;; This is more efficient:                       ; TAR 11/21/96
      ;;  DOES THIS NEED TO DO ALL SUBCONCEPTS AS WELL?
;       (loop for c in (all-super-concepts self)
;	   do (do-local-instances (i c)
;		(when (and (typep i 'DB-INSTANCE)
;			   (subctxt-p *current-ctxt* (home-ctxt i))
;			   (has-instance-p c i))
;		  (revise-one-instance i :monotonic-p definitionOnlyP))))
	      ))) )




  ;;
;;;;;; Assertion of annotations and facets
  ;;

(defun assert-annotations (self)
  ;; If "self" is a concept or relation, assert any attached annotations;
  ;; If "self" is a role, assert any attached facets;
  (let ((annotations (collect-source-annotations self))
        (facetsP (typep self 'ROLE)))
    (declare (special *unannotatedMetaObjects*))
    (labels ((annotations-reference-unsealed-relation-p ()
	       (let (relation)
	         (loop for term in annotations
		       thereis
		       (and (consp term)
		            (setq relation (get-relation (car term) :no-error-p t))
		            (null (predicate-symbol relation))))))
             (help-get-concept (conceptName type)
	       (let ((concept
                      (case type
                        (:concept (get-concept conceptName :no-error-p t))
                        (:relation (get-relation conceptName :no-error-p t)))))
	         (when (null concept)
		   (warn "Error in asserting ~:[annotations~;facets~] for ~S:~%  Can't find ~A ~S."
		         facetsP self type conceptName)
		   (throw :no-concept nil))
	         concept))
	     (tell-conjunct (conceptName)
	       (assert-conjunct
                self (help-get-concept conceptName :concept) :assertion))
	     (tell-role (relationName fillers)
	       (let* ((relation (help-get-concept relationName :relation))
		      (*domainOfInstances* (implied-domain relation)))
		 (declare (special *domainOfInstances*))
	         (loop for f in (evaluate-instance-references fillers)
		       do (assert-role-filler
			   self relation f :assertion)))))
      (change-context (context (if facetsP (concept self) self)))
      (when (annotations-reference-unsealed-relation-p)
        ;; if the annotations or facets reference an unsealed concept or relation,
        ;;    place "self" on a queue and retry asserting annotations at the end of
        ;;    the sealing phase:
        (push self *unannotatedMetaObjects*)
        (return-from assert-annotations nil))
      (loop for term in annotations
	  do (catch :no-concept
	       (cond ((atom term) (tell-conjunct term))
		     ((cdr term) (tell-role (car term) (cdr term)))
		     (t (tell-conjunct (car term))))))
      (when annotations
	(setq *match-is-pending-p* t)) )))


  ;;
;;;;;; Lazy sealing
  ;;

(defun to-seal-or-not-to-seal (concept &key no-error-p)
  ;; Called by "get-sealed-xxx" and "ensure-sealed-xxx";
  ;; Seal the network unless the dont-seal variable is set, in which
  ;;    case we generate an error;
  (declare (special *dontSealNetworkP*))
  (when (and (boundp '*dontSealNetworkP*)
	     *dontSealNetworkP*)
    (error "Wedged: Must seal concept ~S but I'm in a no-sealing mode"
	    concept))
  (seal-network)
  (when (not (sealed-p concept))
    (unless no-error-p
      (warn "Tried to use concept ~S before it is sealed. ~:[Probably it~%~
            references (directly or indirectly) an as yet undefined concept.~;~
            It could not be sealed because it has a bad definition.~]"
	    concept (bad-definition-p concept))
      (warn-of-unclassified-concepts)
      (throw :couldnt-seal nil))) )

(defun get-sealed-concept (conceptOrName &key no-error-p context)
  ;; Return a sealed concept, or nil if the concept cannot be found;
  (catch :couldnt-seal			; TAR 1/14/98
    (let ((concept 
	   (if no-error-p 
	       (get-concept conceptOrName :no-error-p t :context context)
	       (get-concept conceptOrName :context context))))
      (when (and concept
		 (not (sealed-p concept)))
	(to-seal-or-not-to-seal concept :no-error-p no-error-p))
      concept )))

(defun get-sealed-relation (relationOrName &key no-error-p context)
  ;; Return a sealed relation, or nil if the relation cannot be found;
  (catch :couldnt-seal			; TAR 1/14/98
    (let ((relation
	   (if no-error-p 
	       (get-relation relationOrName :no-error-p t :context context)
	       (get-relation relationOrName :context context))))
      (when (and relation
		 (not (sealed-p relation)))
	(to-seal-or-not-to-seal relation :no-error-p no-error-p))
      relation )))


;;; TO DO:
#|

CHECK OUT WHETHER :identifier OPTION WORKS UNDER TRUTH MAINTENANCE

;; THIS CAN'T FIND A PLACE TO SAVE 'BB:
(initialize-network)
(defconcept A :identifier AA)
(defconcept B :is (:and A) :identifier BB)
(seal-network)
(pi aa)

|#

;;; BUGS:
#|

;;; TO DO:

AVOID SEALING "relates"

ZERO-OUT PASS COUNTERS INSIDE OF "seal-network".

EXAMINE POSSIBILITY OF REVISING INSTANCES IN RESPONSE TO A RELATION
REDEFINITION -- THIS REQUIRES THE EQUIVALENT OF RETRACTING AND
REASSERTING ALL FILLERS OF THAT RELATION (AND RETRACTING BEFO


|#
