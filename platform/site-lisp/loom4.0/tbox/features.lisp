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

;;; FEATURES.LISP (TBOX)

;;; Functions and Methods that condition the various classes of
;;;    features


(in-package "LOOM")

(export '(implies about exists forall for-all))


  ;;
;;;;;; Restriction Conditioning
  ;;


;;; A "LOCAL-RESTRICTION" is a temporary structure formed to facilitate
;;;    conditioning of a concept's restrictions;
;;; One local restriction structure is allocated for each restricted
;;;    relation;
;;; After conditioning, one, two, or three restrictions are created
;;;    and classified corresponding to each local restriction -- the slots
;;; "classified-xxx" cache pointers to already-classified restrictions to
;;;    save time in the case that the relevant classified restrictions
;;;    have already been seen.

(defun create-local-restriction
       (localRelation localQualification
	&key local-lower-bound local-upper-bound
        local-value-restrictions local-non-role-fillers)
  ;; Produce a new or recycled modification summary;
  (let ((newLocalRestriction (pop *recycled-local-restrictions*)))
    (if newLocalRestriction
	(progn
	  (setf (local-relation newLocalRestriction) localRelation)
	  (setf (local-qualification newLocalRestriction) localQualification)
	  (setf (local-lower-bound newLocalRestriction) 
		(or local-lower-bound 0))
	  (setf (local-upper-bound newLocalRestriction) 
		(or local-upper-bound
		    (when (single-valued-p localRelation) 1)))
	  (setf (local-value-restrictions newLocalRestriction)
		local-value-restrictions)
          (setf (local-non-role-fillers newLocalRestriction)
                local-non-role-fillers)
	  newLocalRestriction)
	(make-LOCAL-RESTRICTION
	  :local-relation localRelation
	  :local-qualification localQualification
	  :local-lower-bound (or local-lower-bound 0)
	  :local-upper-bound local-upper-bound
	  :local-value-restrictions local-value-restrictions
          :local-non-role-fillers local-non-role-fillers)) ))

(defun create-local-restriction-safely
       (localRelation localQualification
	              &key local-lower-bound local-upper-bound
                      local-value-restrictions local-non-role-fillers)
  ;; Compute a relation with the defined range (if any) eliminated, and
  ;;    moved into the qualification.
  ;; Then use the new relation and qualification to create a local
  ;;    restriction.
  ;; Called by "add-asserted-xxx-restriction" and friends;
  (multiple-value-setq (localRelation localQualification)
    (compute-local-relation&qualification localRelation localQualification))
  (create-local-restriction 
   localRelation localQualification
   :local-lower-bound local-lower-bound
   :local-upper-bound local-upper-bound
   :local-value-restrictions local-value-restrictions
   :local-non-role-fillers local-non-role-fillers) )
  
(defun discard-local-restriction (localRestriction)
  ;; Clear slots in "localRestriction" and push onto recycle list;
  (progn
    (fill localRestriction nil)
    (push localRestriction *recycled-local-restrictions*)) )

(defun find-local-restriction (relation qualification)
  ;; Return a local restriction on relation "relation" with
  ;;    qualification "qualification" if one exists in the
  ;;    alist *relation/restrictionsTable*;
  (declare (special *relation/restrictionsTable*))
  (let ((tableEntry (assoc relation *relation/restrictionsTable*)))
    (and tableEntry
	 (loop for res in (rest tableEntry)
              when (eq (local-qualification res) qualification)
	      return res)) ))

(defun find-or-create-local-restriction (relation qualification)
  ;; Return a local restriction on relation "relation" with
  ;;    qualification "qualification";
  ;; If none existed previously, create on and add it to the
  ;;    alist *relation/restrictionsTable*;
  (declare (special *relation/restrictionsTable*))
  (let ((tableEntry (assoc relation *relation/restrictionsTable*))
	newLclRes)
    (if tableEntry
	(or (loop for res in (rest tableEntry)
		 when (eq (local-qualification res) qualification)
                 return res)
	    (progn
	      (setq newLclRes
		    (create-local-restriction relation qualification))
	      (push newLclRes (rest tableEntry))
	      newLclRes))
	(progn
	  (setq newLclRes
		(create-local-restriction relation qualification))
	  (push (list relation newLclRes) *relation/restrictionsTable*)
	  newLclRes)) ))

(defun find-or-create-local-restriction-safely (relation qualification)         ; RMM 8/27/93
  ;; Return a local restriction on relation "relation" with
  ;;    qualification "qualification";
  ;; Unlike "find-or-create-local-restriction", this routine insures that
  ;;    the relation installed into a new local restriction won't have
  ;;    a defined range;
  ;; Note: It should only be called by routines that don't care that "relation" may
  ;;    be swapped underneath them;
  ;; NOTE: WE HAVEN'T FIGURED OUT ALL OF THE PLACES WHERE THIS OUGHT TO BE
  ;;    CALLED (IN PLACE OF "find-or-create-local-restriction");
  (multiple-value-setq (relation qualification)
      (compute-local-relation&qualification relation qualification))
  (find-or-create-local-restriction relation qualification) )

(defmacro local-restriction-specializes-local-restriction-p
	  (res1 res2 &key equal-relation-test-p)
  ;; Expand to a test that a local restriction specializes another, based
  ;;    solely on the "restriction" and "qualification" slots;
  ;; If "equal-relation-test-p", we expand to a shorter test because we
  ;;    know that "(local-relation res1)" cannot strictly specialize
  ;;    "(local-relation res2)";
  ;; Called by "form-local-restriction-hierarchy" and
  ;;    "find-or-create-during-restriction-propagation"
  `(and
     ,(if equal-relation-test-p 
	  `(eq (local-relation ,res1) (local-relation ,res2))
	  `(subconcept-p (local-relation ,res1) (local-relation ,res2)))
     (or (null (local-qualification ,res2))
	 (and (local-qualification ,res1)
	      (subconcept-p (local-qualification ,res1)
			    (local-qualification ,res2))))) )

(defun find-or-create-during-restriction-propagation (relation qualification)
  ;; Situation: While creation of local restrictions normally precedes
  ;;    restriction propagation, this routine handles the situation wherein
  ;;    a new local restriction must be created during propagation -- the
  ;;    data structures are not tuned for this case, and hence the procedure
  ;;    is somewhat slow;
  ;; Return a local restriction on relation "relation" with
  ;;    qualification "qualification";
  ;; If none existed previously, create one, add it to the
  ;;    list *listOfLocalRestrictions*, AND update all "local-subrestrictions"
  ;;    slots;
  ;; Assumption: Whereas "form-local-restriction-hierarchy" tries to be efficient
  ;;    about computing the "local-subrestrictions" slots, we don't optimize
  ;;    to that extent here, on the assumption that this procedure will
  ;;    be invoked relatively infrequently;
  (declare (special *listOfLocalRestrictions*))
  (or (loop for lclRes in *listOfLocalRestrictions*
	   when (and (eq (local-relation lclRes) relation)
                     (eq (local-qualification lclRes) qualification))
           return lclRes)
      (let ((newLclRes (create-local-restriction relation qualification)))
	(loop for res2 in *listOfLocalRestrictions*
	     do
	     (when (local-restriction-specializes-local-restriction-p
		     newLclRes res2)
	       (push newLclRes (local-subrestrictions res2)))
	     (when (local-restriction-specializes-local-restriction-p
		     res2 newLclRes)
	       (push res2 (local-subrestrictions newLclRes))))
	(push newLclRes *listOfLocalRestrictions*)
	newLclRes)) )


(defun augment-local-value-restriction 
       (localRes valueRestriction &optional classifiedRes)
  (let ((oldValue (local-value-restrictions localRes)))
    (unless (or (member valueRestriction oldValue)
		(eq (first oldValue) (loom-constant INCOHERENT))
		(and (atom valueRestriction)
		     (loop for vr in oldValue
			 thereis (and (atom vr)
				      (subconcept-p vr valueRestriction))))
		(and (consp valueRestriction)           ; TAR 2/5/96
		     (eq (first valueRestriction) ':one-of)
		     (loop for vr in oldValue
			   thereis (and (typep vr 'set-feature)
					(set-equal-p (rest
						      valueRestriction)
						     (members vr)
						     :test #'filler-equal)))))
      (push valueRestriction (local-value-restrictions localRes))
      (setf (classified-value-restriction localRes)   ; TAR 2/5/96 (Order of last 2 statements)
	    (if (null oldValue) classifiedRes nil))
      (setf (local-augmented-p localRes) t)) ))


(defun augment-local-lower-bound (localRes lowerBound &optional classifiedRes)
  (when (> lowerBound (local-lower-bound localRes))
    (setf (local-lower-bound localRes) lowerBound)
    (setf (classified-min-restriction localRes) classifiedRes)
    (setf (local-augmented-p localRes) t)) )

(defun augment-local-upper-bound (localRes upperBound &optional classifiedRes)
  (when (or (not (integerp (local-upper-bound localRes)))
	    (< upperBound (local-upper-bound localRes)))
    (setf (local-upper-bound localRes) upperBound)
    (setf (classified-max-restriction localRes) classifiedRes)
    (setf (local-augmented-p localRes) t)) )

(defun augment-local-role-fillers (localRes filler &optional classifiedRes)
  (let ((oldFillers (local-role-fillers localRes)))
    (unless (member filler oldFillers :test #'filler-equal)
      (push filler (local-role-fillers localRes))
      (setf (classified-filled-by localRes)
	    (if (null oldFillers) classifiedRes nil))
      (setf (local-augmented-p localRes) t)) ))

(defun augment-local-non-role-fillers (localRes nonFiller &optional classifiedRes)
  (let ((oldNonFillers (local-non-role-fillers localRes)))
    (unless (member nonFiller oldNonFillers :test #'filler-equal)
      (push nonFiller (local-non-role-fillers localRes))
      (setf (classified-not-filled-by localRes)
	    (if (null oldNonFillers) classifiedRes nil))
      (setf (local-augmented-p localRes) t)) ))


  ;;
;;;;;; Initial local restriction conditioning
  ;;

;;; The functions below create local restrictions, and fill them
;;;    from information taken from source restrictions and inherited
;;;    restrictions.  Propagation other than simple inheritance happens
;;;    afterwards (when "propagate-restrictions" is called).

(defun condition-restrictions (concept comparisons tbox/cbox)
  ;; Return two values:
  ;;    (1) a list of classified restrictions
  ;;    (2) a list of (possibly augmented) classified comparisons;
  (let (*relation/restrictionsTable* *listOfLocalRestrictions*
	*restrictionEquivalenceSets* *newEquivalences*)
    (declare (special *relation/restrictionsTable* *listOfLocalRestrictions*
		      *restrictionEquivalenceSets* *newEquivalences*))
    ;; quick exit if no local restrictions and only one parent:
    (multiple-value-bind (cheapP result)
                         (condition-restrictions-cheaply-p
                          concept comparisons tbox/cbox)
      (when cheapP
        (return-from condition-restrictions result)))
    (form-restriction-equivalence-sets comparisons)
   (loop for sourceRes
	 in (ecase tbox/cbox 
	      ;; Tricky:  We need to save the source restrictions in the
	      ;;   implied-restrictions slot, because the process of conditioning
	      ;;   source restrictions differs between :tbox and :cbox settings.
	      ;;   TAR 2/10/98
	      (:tbox (setf (implied-restrictions concept) (restrictions concept)))
	      (:cbox (implied-restrictions concept)))
       when (consp sourceRes)		; Make sure it really is a source restrictions.
	    ;; Note:  In certain circumstances, the concept may have been completed by
	    ;;  a recursive call to the completion code.  Right now (3/2/98), the only
	    ;;  way that has been observed to have happened is by an attempt to get the
	    ;;  types of instances for checking against enumerated sets:  This can cause
	    ;;  the creation of a conjunctive concept for the type, which in turn forces
	    ;;  classifcation&conditioning of the network.  If this happens in the middle
	    ;;  of other processing, things may get completed already, making a call
	    ;;  here no longer necessary.
       do (condition-one-source-restriction sourceRes tbox/cbox)
       else do (form-local-restriction-from-classified-restriction sourceRes))
    ;; inherit classified restrictions from super concepts:
    (flet ((form-local-restrictions (restrictions)
	     ;; Note:  In certain circumstances, the super-concept may not have
	     ;;   been completely handled yet.  This can occur during disjointness
	     ;;   testing where new concepts have been created as a side effect of
	     ;;   the processing.
	     (loop for classifiedRes in restrictions
		 when (consp classifiedRes)  ;; Oops, not classified yet! ; TAR 6/7/99
		 do (condition-one-source-restriction classifiedRes tbox/cbox)
		 else do (form-local-restriction-from-classified-restriction
			  classifiedRes))))
      (ecase tbox/cbox
	(:tbox
	 (loop for super in (super-concepts concept)
	      do (form-local-restrictions (restrictions super))))
	(:cbox
	 (form-local-restrictions (restrictions concept))
	 (loop for super in (super-concepts concept)
	      do (form-local-restrictions (implied-restrictions super))))))
    (form-vaccuous-local-restrictions tbox/cbox)
    (form-linked-list-of-restrictions)
    (form-local-restriction-hierarchy)
    (propagate-restrictions tbox/cbox)
    (when *newEquivalences*
      (let ((newCmps (classify-comparisons *newEquivalences*)))
		 ;; new equivalences were induced by condition-restrictions
		 ;; replace the old equivalences in mostSpecificCMPs
	(setq comparisons
	      (most-specific-concepts
		(nconc newCmps comparisons)))))
    (values
     (structure-shared-most-specific-classified-restrictions concept tbox/cbox)
      comparisons) ))

(defun condition-restrictions-cheaply-p (concept comparisons tbox/cbox)
  ;; Helping function for "condition-restrictions";
  ;; If "concept" has no local restrictions and only one parent return
  ;;    two values:  "t" and the (already classified) inherited restrictions;
  ;; Actually, the test is more complicated than that (see below);
  (ecase tbox/cbox
    (:tbox
     (let ((parents (conjuncts concept)))
       (if (and (null (restrictions concept))
                (null (rest parents))
                (null comparisons)
                parents)
         (values t (restrictions (first parents)))
         (values nil nil))))
    (:cbox
     (let ((parents (super-concepts concept))
           tboxRestrictions inheritedRestrictions)
       (if (and (null (implied-restrictions concept))
                (null (rest parents))
                (null comparisons)
                parents)
         (progn
           (setq tboxRestrictions (restrictions concept))
           (setq inheritedRestrictions (implied-restrictions (first parents)))
           (cond
            ((or (null inheritedRestrictions)
                 (eq tboxRestrictions inheritedRestrictions)
                 (set-equal-p tboxRestrictions inheritedRestrictions))
             (values t tboxRestrictions))
            ((null tboxRestrictions)
             (values t inheritedRestrictions))
            (t (values nil nil))))
         (values nil nil))))) )

(defun form-restriction-equivalence-sets (comparisons)
  ;; Helping function for "condition-restrictions";
  ;; Add an equivalence relation into *restrictionEquivalenceSets* for
  ;;    each equivalence in the list "comparisons";
  (flet ((make-a-restriction (relation)
;	   (let ((qualification (defined-range relation)))  ; DGB 9/8/93
;	     (when qualification
;	       (setq relation (first (base-relations relation))))
;	     (find-or-create-local-restriction relation qualification))
	   (find-or-create-local-restriction-safely         ; DGB 9/8/93
	    relation (defined-range relation))))
    (loop for cmp in comparisons
	  when (eq (feature-type cmp) :same-as)
	  do (add-restriction-equivalence
	      (make-a-restriction (first (roles cmp)))
	      (make-a-restriction (second (roles cmp))))) ))

;;; Axioms:
;;;    RANGE=>ALL
;;;    ALL&RANGE--RANGE

(defun condition-one-source-restriction (sourceRes tbox/cbox/dbox )
  ;; Helping function for "form-local-restrictions-from-source-restrictions";
  ;; Find or create a local restriction, and fill in its slots based on "sourceRes";
  ;; Nothing gets filled in in the case of a null restriction;
  ;; A restriction is null if its a:
  ;;   Value restriction which is not more specific than
  ;;       the (defined) range of the relation it restricts;
  ;;   Min restriction with lower-bound zero;
  ;;   Non-zero max restriction on a single-valued relation;
  (declare (special *restrictionInducedConjuncts*))
  (let (lclRes relation qualification)
    (case (first sourceRes)
      ((:all :the)
       (setq relation (second sourceRes))
       (setq qualification (fourth sourceRes)))
      ((:at-least :at-most :exactly)
       (setq relation (third sourceRes))
       (setq qualification (fourth sourceRes)))
      (:some
       (setq relation (second sourceRes))
       (setq qualification (third sourceRes)))
      ((:filled-by :not-filled-by)
       (setq relation (second sourceRes))))
    (multiple-value-setq (relation qualification)
      (compute-local-relation&qualification relation qualification))
    (setq lclRes (find-or-create-local-restriction relation qualification))
    (case (first sourceRes)
      ((:all :the)
       (let* ((valueRestriction (third sourceRes))
	      (vrIsConceptP (typep valueRestriction 'UNARY-ENTITY))
	      (rangeOfRelation
		(case tbox/cbox/dbox
		  (:tbox (or (defined-range relation) *Thing*))
		  (otherwise (implied-range relation)))))
	 ;; test for null restriction on UNARY-ENTITY:
	 (if (and vrIsConceptP
		  (subconcept-p rangeOfRelation valueRestriction))
	     ;; ignore redundant value restriction except for default, when
	     ;;    we indicate overriding NULL default: 
	     (when (eq tbox/cbox/dbox :dbox)
	       (setf (classified-value-restriction lclRes) :redundant))
	     ;; add value restriction and test for non-redundant range restriction:
	     ;; tricky: because range doesn't specialize vr, vr /= Thing;
	     (progn
	       (augment-local-value-restriction lclRes valueRestriction)
	       (when (and vrIsConceptP
			  (not (subconcept-p valueRestriction rangeOfRelation)))
		 (augment-local-value-restriction lclRes rangeOfRelation)))))
       (when (eq (first sourceRes) :the)
	 (augment-local-lower-bound lclRes 1)
	 (augment-local-upper-bound lclRes 1)))
      (:some
       ;; BUG?: Should this use defined-range or implied-range to augment the
       ;;   local value restriction with the rangeOfRelation?  Would that catch
       ;;   the case where the range of the relation is in conflict with a SOME
       ;;   filler?  TAR 9/23/98
       (augment-local-lower-bound lclRes 1))
      (:at-least
       (let ((lowerBound (second sourceRes)))
	 (if (zerop lowerBound)			; test for null min restriction:
	     (when (eq tbox/cbox/dbox :dbox)
		 ;; indicate overriding NULL default:
		 (setf (classified-min-restriction lclRes) :redundant))
	     (augment-local-lower-bound lclRes lowerBound))))
      (:at-most
       (let ((upperBound (second sourceRes)))
	 (if (eq upperBound '+INFINITY)
	     (when (eq tbox/cbox/dbox :dbox)
	       ;; indicate overriding NULL default:
	       (setf (classified-max-restriction lclRes) :redundant))
	     (augment-local-upper-bound lclRes upperBound))))
      (:exactly
       (let ((bound (second sourceRes)))
	 (augment-local-lower-bound lclRes bound)
	 (augment-local-upper-bound lclRes bound)))
      ((:filled-by :not-filled-by)
       (when (and qualification
		  (eq (first sourceRes) :not-filled-by))
	 (conditioning-error 
          ":not-filled-by can only be applied to a non-qualified relation"))
       (if (null (cddr sourceRes))
	 (when (eq tbox/cbox/dbox :dbox)
           ;; indicate overriding NULL default:
           (setf (classified-filled-by lclRes) :redundant))
         (loop for f in (cddr sourceRes)
	      do 
	      (case (first sourceRes)
		(:filled-by (augment-local-role-fillers lclRes f))
		(:not-filled-by (augment-local-non-role-fillers lclRes f))))))) ))
   
(defun compute-local-relation&qualification (relation qualification)
  ;; Called primarily by "condition-one-source-restriction";
  ;; If "relation" is range restricted, replace it
  ;;    with a non-range-restricted relation, and conjoin the range restriction
  ;;    with "qualification";
  ;; Also, if "qualification" is a source term, convert it into a concept;
  ;; Return the possibly substituted relation and qualification;
  (let ((definedRange (more-restrictive-defined-range relation)))
    (when (consp qualification)
      (setq qualification
	    (touch-conjunction-concept
	      (list (or (implied-range relation)
			(defined-range relation)))
	      :source-terms (list qualification)
	      :requote-symbols-p t)))
    (if definedRange
	(values
	  (compute-unqualified-relation relation)
	  (if (and qualification
		   (neq qualification definedRange))
	      (touch-conjunction-concept (list qualification definedRange))
	      definedRange))
	(values relation qualification)) ))

(defun compute-unqualified-relation (relation)
  ;; Return a (classified) relation representing "relation" without its range
  ;;    restriction;
  ;; Called by "compute-local-relation&qualification";
  (let ((definedDomain (more-restrictive-defined-domain relation))
	(baseRelations (base-relations relation)))
   (when (null baseRelations)		; TAR 5/13/99
      (setq baseRelations (super-concepts relation)))
    (if (or (rest baseRelations)
	    definedDomain) 
	(define-relation
	  :is `(:and ,@(base-relations relation)
		     ,@(when definedDomain
			 `((:domain ,definedDomain))))
	  :characteristics (list :system-defined)
	  :classify-immediately 'yes)
	(first baseRelations)) ))

(defun form-local-restriction-from-classified-restriction (classifiedRes)
  ;; Merge "classifiedRes" into the table of local restrictions;
  ;; Save pointers to classified restrictions wherever the current
  ;;    restriction matches the classified restriction;
  (let ((lclRes (find-or-create-local-restriction 
		  (relation classifiedRes)
		  (qualification classifiedRes))))
    (case (feature-type classifiedRes)
      (:value-restriction
       (augment-local-value-restriction
	 lclRes (value-restriction classifiedRes) classifiedRes))
      (:min-restriction
       (augment-local-lower-bound
	 lclRes (lower-bound classifiedRes) classifiedRes))
      (:max-restriction
       (augment-local-upper-bound
	 lclRes (upper-bound classifiedRes) classifiedRes))
      (:filled-by
       (loop for f in (role-fillers classifiedRes)
	    do (augment-local-role-fillers lclRes f classifiedRes)))
      (:not-filled-by
       (loop for f in (non-role-fillers classifiedRes)
	    do (augment-local-non-role-fillers 
		 lclRes f classifiedRes))))) )

;;; Axioms:
;;;    MIN&DOMAIN=>AND

(defun form-vaccuous-local-restrictions (tbox/cbox)
  ;; Finish one-shot conditioning prior to destroying *relation/restrictionsTable*;
  ;; Infer new conjuncts for the conjunct being conditioned stemming from
  ;;    domain constraints for min-k restricted relations;
  ;; Create (vaccuous) restrictions on otherwise unrestricted relations to
  ;;    insure that later propagation will propagate to them (e.g.,
  ;;    propagating fillers up to an ancestor from multiple descendants
  ;;    is a by-product of this);
  (declare (special *relation/restrictionsTable* *restrictionInducedConjuncts*))
  ;; for each entry -- infer new conjunct, form vaccuous restrictions, and
  ;;    concatenate restrictions into simple linked list:
  (loop for entry in *relation/restrictionsTable*
       do
       (let* ((relation (first entry))
	      (inducedDomain (case tbox/cbox
			       (:tbox (defined-domain relation))
;; FOR NOW, WE DON'T PUSH ONTO *restrictionInducedConjuncts* DURING COMPLETION:
;			       (:cbox (implied-domain relation))
			       )))
	 ;; push domain-induced conjuncts onto *restrictionInducedConjuncts*
	 (when (and inducedDomain 
		    (loop for res in (rest entry)
			 thereis (plusp (local-lower-bound res)))
		    (pushnew inducedDomain *restrictionInducedConjuncts*)))
	 ;;  insure that an unqualified local restriction exists on
	 ;;    each restricted relation, and each of its super relations;
	 (unless (null (local-qualification (second entry)))
	   (find-or-create-local-restriction-safely relation nil))        ; DGB 10/20/93
	 (loop for superRel in (all-super-concepts relation)
	      unless (eq superRel *binary-tuple*)
	      do (find-or-create-local-restriction-safely superRel nil))  ; DGB 10/20/93
	 ;; insure that first restrictions on first components of composed
	 ;;    relations exist:
	 (when (eq (defined-as relation) :composition)
	   (find-or-create-local-restriction-safely    ; RMM 8/27/93
            (first (components relation)) nil)))) )

(defun form-linked-list-of-restrictions ()
  ;; Convert the *relation/restrictionsTable* into a linked list,
  ;;    and assign it to *listOfLocalRestrictions* ;
  (declare (special *relation/restrictionsTable* *listOfLocalRestrictions*))
  ;; initialize *listOfLocalRestrictions* (but its already nil);
  (setq *listOfLocalRestrictions* nil)
  ;; convert alist of restrictions into linked list:
  (loop for entry in *relation/restrictionsTable*
       do
       (setq *listOfLocalRestrictions*
	     (nconc (rest entry) *listOfLocalRestrictions*)))
  ;; discard *relation/restrictionsTable* (now invalidated by "nconcs")
  (setq *relation/restrictionsTable* nil) )
     
(defun form-local-restriction-hierarchy ()
  ;; Scan local restrictions in *listOfLocalRestrictions* and
  ;;    link each one to all local restrictions that classify below
  ;;    it, based on their respective relation and qualification slots;
  (declare (special *listOfLocalRestrictions*))
  (loop for tail on *listOfLocalRestrictions*
       do
       (let ((res1 (first tail)))
	 ;; look for restrictions above "res1":
	 (if (rest (all-super-concepts (local-relation res1)))
	     ;; full superrestriction test:
	     (loop for res2 in (rest tail)
		  when (local-restriction-specializes-local-restriction-p
			 res1 res2)
		  do (push res1 (local-subrestrictions res2)))
	     ;; abbreviated superrestriction test:
	     (loop for res2 in (rest tail)
		  when (local-restriction-specializes-local-restriction-p
			 res1 res2 :equal-relation-test-p t)
		  do (push res1 (local-subrestrictions res2))))
	 ;; rescan looking for restrictions below "res1":
	 (if (sub-concepts (local-relation res1))
	     ;; full subrestriction test:
	     (loop for res2 in (rest tail)
		  when (local-restriction-specializes-local-restriction-p
			 res2 res1)
		  do (push res2 (local-subrestrictions res1)))
	     ;; abbreviated subrestriction test:
	     (loop for res2 in (rest tail)
		  when (local-restriction-specializes-local-restriction-p
			 res2 res1 :equal-relation-test-p t)
		  do (push res2 (local-subrestrictions res1)))))) )


  ;;
;;;;;; Propagation between local restrictions
  ;;

;;; These functions propagate restrictions between local restrictions.
;;; We currently implement the following kinds of propagation:
;;;    Within-restriction propagation:
;;;       e.g., filled-by implies min k, singleton VR implies filled-by;
;;;    Role hierarchy propagation:
;;;       e.g., mins propagate up the role hierarchy, maxs propagate down;
;;;    Equivalent role propagation:
;;;       Pairs of restrictions on equivalent roles exchange information;
;;;    One-of-a-kind propagation:
;;;       e.g., :composition role propagates to its first component;

(defun propagate-restrictions (tbox/cbox)
  ;; Repeatedly propagate restrictions until deductive closure is
  ;;    achieved;
  ;; The restrictions in *listOfLocalRestrictions* represent the
  ;;    combination of local source restrictions and (already classified)
  ;;    inherited restrictions;
  ;; We defer computing the conjuction of all value-restrictions
  ;;    because we don't want to create a concept which may become
  ;;    obsolete when the additional conjunctions are inherited
  ;;    from super-restrictions -- instead we place in the slot
  ;;    "value-restrictions" a LIST of all value-restrictions seen so far;
  (declare (special *listOfLocalRestrictions*))
  (let (augmentedP)
    (loop
      (setq augmentedP nil)
      (propagate-within&between-restrictions)
      (propagate-between-equivalenced-restrictions)
      ;; turn lists of value restrictions into single concepts or set features:
      (loop for res in *listOfLocalRestrictions*
	   do (condition-value-restrictions res tbox/cbox))
      ;; propagate axioms that depend on value restrictions being coalesced:
      (propagate-using-value-restrictions)
      ;; check for new augmentations during this iteration:
      (loop for lclRes in *listOfLocalRestrictions*
	   when (local-augmented-p lclRes)
	   do (setf (local-augmented-p lclRes) nil)
	      (setq augmentedP t))
      ;; test for loop exit:
      (when (or (not augmentedP)
		(<= *power-level* 1))		; :low power level
	(return nil))
      ;; change local value restrictions from concepts to lists of concepts:
      (loop for res in *listOfLocalRestrictions*
	   when (local-value-restrictions res)
	   do (setf (local-value-restrictions res)
		    (list (local-value-restrictions res))))
      ) ;; end loop
    ;; Check for incoherence here, after all propagation, in order to eliminate
    ;;  duplicate warnings from multiple passes through the loop above.
    (loop for res in *listOfLocalRestrictions*    ; TAR 3/30/98
	do (detect-incoherent-restriction res))
    ))

;;; Axioms:
;;;    FILL=>MIN
;;;    FILL&MAX=>ONE-OF
;;;    COMP&MIN=>MIN

(defun propagate-within&between-restrictions ()
  ;; Perform propagation within individual restrictions and
  ;;    between them, and then
  ;;    propagate restrictions to supers and subs;
  (declare (special *listOfLocalRestrictions*))
  (loop for res in *listOfLocalRestrictions*
       do
       (when (local-role-fillers res)
	 (let ((fillers (local-role-fillers res)))
	   ;; propagate filler count to lower bound:
	   (augment-local-lower-bound
	     res (length (local-role-fillers res)))	 
	   ;; infer enumerated set if filler count matches upper bound:
	   (when (eql (local-upper-bound res) 
		      (length fillers))
	     (unless (loop for vr in (local-value-restrictions res)
			  thereis
			  (typecase vr
			    (CONS
			     (and (eq (first vr) :one-of)
				  (set-equal-p (rest vr) fillers
					       :test #'filler-equal)))
			    (SET-FEATURE
			     (and (eql (compute-set-cardinality vr)
				       (length fillers))
                                  (set-equal-p  (generate-decoded-set-members vr)
					       fillers
                                               :test #'filler-equal)))  ; RMM 11/21/94
			    (UNARY-ENTITY
			     (let ((setFeature (defined-set-feature vr)))
			       (and setFeature
				    (eql (compute-set-cardinality setFeature)
				       (length fillers))
				    (set-equal-p (generate-decoded-set-members
						   setFeature)
						 fillers
                                                 :test #'filler-equal))))))
	       (augment-local-value-restriction 
		 res `(:one-of ,@fillers))))))
       ;; for each min restriction on a composed relation, induce a min
       ;;    restriction on its first component:
       (let ((relation (local-relation res))
             resOnFirstComponent)
	 (when (and (eq (defined-as relation) :composition)
		    (null (local-qualification res))
		    (plusp (local-lower-bound res)))
           (multiple-value-bind (unqualifiedRelation qualification)          ; RMM 8/27/93
                                (compute-local-relation&qualification
                                 (first (components relation)) nil)
             (setq resOnFirstComponent
                   (loop for otherRes in *listOfLocalRestrictions*
                         when (and (eq (local-relation otherRes) unqualifiedRelation)
                                   (eq (local-qualification otherRes) qualification))
                         return otherRes))
             (when resOnFirstComponent
               (augment-local-lower-bound
                resOnFirstComponent
                1 nil)))))
       ;; propagate mins and fillers up, maxs, vrs, and non-fillers down:
       (loop for subRes in (local-subrestrictions res)
	    do (propagate-between-sub&super-restrictions subRes res))) )

;;; Axioms:
;;;    MIN-BELOW=>MIN  
;;;    MAX-ABOVE=>MAX
;;;    SOME&MAX=>ALL
;;;    MIN&MAX=>EQ
;;;    FILL-BELOW=>FILL
;;;    NON-FILL-ABOVE=>NON-FILL
;;;    ALL-ABOVE=>ALL

(defun propagate-between-sub&super-restrictions (subRes superRes)
  ;; Apply the upper-bound restriction on "superRes" to "subRes", apply
  ;;    the lower-bound restriction on "subRes" to "superRes", and
  ;;    append the value restrictions in "superRes" to those in "subRes";
  ;; Optimization:  If a restriction is specialized by another one, set
  ;;    the "classified-xxx" slot to :redundant, so that no classified
  ;;    restriction is generated later for it;
  ;; CAUTION: All propagation that occurs after this function must be
  ;;    careful to maintain validity of :redundant marks;
  (when (>= (local-lower-bound subRes) (local-lower-bound superRes))
    (augment-local-lower-bound superRes (local-lower-bound subRes))
    (setf (classified-min-restriction superRes) :redundant))
  ;; propagate upper bound down:
  (when (and (integerp (local-upper-bound superRes))
	     (or (not (integerp (local-upper-bound subRes)))
		 (< (local-upper-bound superRes) (local-upper-bound subRes))))
    (augment-local-upper-bound subRes (local-upper-bound superRes))
    (setf (classified-max-restriction subRes) :redundant))
  ;; check to see if we might have induced a new role equivalence relation:
  (when (eql (local-lower-bound subRes)
             (local-upper-bound superRes))
    (cond          ; RMM 11/9/92
     ((neq (local-relation subRes) (local-relation superRes))
      (add-restriction-equivalence subRes superRes))
     ((neq (local-qualification subRes) (local-qualification superRes))
      ;; propagate qualification UP into vr if equivalence between superRes
      ;;    and qualified subres:
      (augment-local-value-restriction          ; RMM 11/9/92
       superRes (local-qualification subRes)))))
  (when (and (eql (local-lower-bound subRes)
		  (local-upper-bound superRes))
	     (neq (local-relation subRes) (local-relation superRes)))
    (add-restriction-equivalence subRes superRes))
  ;; propagate role fillers up:
  (when (local-role-fillers subRes)
    (let ((noSuperFillersP (null (local-role-fillers superRes))))
      (loop for filler in (local-role-fillers subRes)
	   do (augment-local-role-fillers superRes filler))
      (when noSuperFillersP
	(setf (classified-filled-by superRes) :redundant))))
  ;; propagate non role fillers down:
  (when (local-non-role-fillers superRes)
    (let ((noSubFillersP (null (local-non-role-fillers subRes))))
      (loop for filler in (local-non-role-fillers superRes)
	   do (augment-local-non-role-fillers subRes filler))
      (when noSubFillersP
	(setf (classified-filled-by subRes) :redundant))))
  ;; propagate value restriction(s) down:
  (when (local-value-restrictions superRes)
    (when (and (classified-value-restriction subRes)
	       (neq (classified-value-restriction subRes) :redundant)
	       (classified-value-restriction superRes))
      (when (subconcept-p (car (local-value-restrictions superRes))
			  (car (local-value-restrictions subRes)))
	(setf (classified-value-restriction subRes) :redundant)
	(return-from propagate-between-sub&super-restrictions nil))
      (when (subconcept-p (car (local-value-restrictions subRes))
			  (car (local-value-restrictions superRes)))
	(return-from propagate-between-sub&super-restrictions nil)))
    (let ((noSubVrP (null (local-value-restrictions subRes))))
      (loop for vr in (local-value-restrictions superRes)
	   do (augment-local-value-restriction subRes vr))
      (when noSubVrP
	(setf (classified-value-restriction subRes) :redundant)))) )


  ;;
;;;;;; Propagation stemming from equivalence relations between roles
  ;;

(defun propagate-between-equivalenced-restrictions ()
  ;; Propagate information between equivalenced local restrictions;
  (declare (special *restrictionEquivalenceSets*))
  (loop for equivSet in *restrictionEquivalenceSets*
       do
       (loop for res1 in equivSet
	    do
	    (loop for res2 in equivSet
		 unless (eq res1 res2)
		 do (merge-local-restrictions res1 res2)))) )

;;; Axioms:
;;;    EQ&ALL=>ALL
;;;    EQ&MIN=>MIN
;;;    EQ&MAX=>MAX
;;;    EQ&FILL=>FILL
;;;    EQ&NON-FILL=>NON-FILL

(defun merge-local-restrictions (fromRes intoRes)
  ;; Called by "generate-combined-local-restrictions" and
  ;;    "merge-restrictions-on-equivalent-roles";
  ;; Situation: "fromRes" and "intoRes" are local restrictions that belong
  ;;    to the same equivalence set;
  ;; Merge information in "fromRes" into "intoRes";
  ;; In the process, reset or nullify pointers to already classified restrictions
  ;;    that become invalidated by the merged data;
  (loop for vr in (local-value-restrictions fromRes)
       do (augment-local-value-restriction
	    intoRes vr))
  (when (plusp (local-lower-bound fromRes))
    (augment-local-lower-bound
      intoRes (local-lower-bound fromRes)))
  (when (integerp (local-upper-bound fromRes))
    (augment-local-upper-bound
      intoRes (local-upper-bound fromRes)))
  (loop for f in (local-role-fillers fromRes)
       do (augment-local-role-fillers intoRes f))
  (loop for f in (local-non-role-fillers fromRes)
       do (augment-local-non-role-fillers intoRes f)) )

;;; Axioms:
;;;    EQ&EQ=>EQ  (transitivity)

(defun add-restriction-equivalence (lclRes1 lclRes2)
  ;; *restrictionEquivalenceSets* contains a list of sets of equivalenced
  ;;    local restrictions;
  ;; If "lclRes1" and "lclRes2" are already both members of equivalence
  ;;    sets, combine the two sets into one bigger equivalence set;
  ;; Otherwise, add one to the equivalence set of the other;
  (declare (special *restrictionEquivalenceSets*))
  (let ((equiv1 (loop for tail on *restrictionEquivalenceSets*
		     when (member lclRes1 (car tail))
                     return tail))
	(equiv2 (loop for tail on *restrictionEquivalenceSets*
		     when (member lclRes2 (car tail))
                     return tail))
	(oldNewsP nil))    
    (if equiv1
	(if equiv2
	    (if (eq equiv1 equiv2)
		(setq oldNewsP t)
		(progn
		  (loop for res in (car equiv2)
		       do (push res (car equiv1)))
		  (delf *restrictionEquivalenceSets* equiv2)))
	    (push lclRes2 (car equiv1)))
	(if equiv2
	    (push lclRes1 (car equiv2))
	    (push (list lclRes1 lclRes2) *restrictionEquivalenceSets*)))
    (unless oldNewsP
      (convert-restrictions-to-equivalence lclRes1 lclRes2)) ))

(defun convert-restrictions-to-equivalence (res1 res2)
  ;; Construct an (unclassified) equivalence object that equates
  ;;    the two role represented by the local restrictions
  ;;    "res1" and "res2";
  ;; Push the new equivalence onto *newEquivalences*;
  (declare (special *newEquivalences*))
  (flet ((make-a-relation
	   (res)
	   (if (local-qualification res)
	       (define-relation :is `(:and ,(local-relation res)
					   (:range ,(local-qualification res)))
		 :characteristics '(:system-defined)
		 :system-characteristics '(:definition-only)
		 :classify-immediately :yes)
	       (local-relation res))))
    (push
      (make-loom-instance 
	'COMPARISON-FEATURE
	:feature-type :same-as
	:relationship (get-relation 'same-as)
	:roles (list (make-a-relation res1) (make-a-relation res2)))
      *newEquivalences*) ))


  ;;
;;;;;; Value Restriction Processing
  ;;

;;; We do a lot of coersion of value restrictions, so the code to handle it
;;;    is particularly convoluted:

;;; Axioms:
;;;    ALL&ALL--ALL
;;;    ALL-INC=>MAX0
;;;    MAX0&ALL--MAX0

(defun condition-value-restrictions (localRestriction tbox/cbox/dbox)
  ;; "(local-value-restrictions localRestriction)" contains a list of concepts
  ;;    whose conjunction represents its proper value.  Generate
  ;;    the conjoined concept, and place it into that slot;
  ;; If were are conditioning an implied (CBOX) restriction,
  ;;    add-in implication-induced value restrictions;
  ;; If the value restriction is incoherent, set the upper-bound
  ;;    of the restriction to zero;
  ;; If the restriction has max zero, set the value restriction to nil;
  ;; Note: "combine-restrictions-on-same-relation" folds the implied
  ;;    range into the vr, so we don't need to do it here;
  ;; TO DO: SPEED THIS UP BY AVOIDING CLASSIFICATION WHENEVER CONDITIONING
  ;;    OF VALUE RESTRICTIONS RESULTS IN INCOHERENCE:
  (let ((concepts (local-value-restrictions localRestriction))
	setExpressionP unevaluatedExpressionP newValueRestriction)
    (when (or (null concepts)
	      (and 
		(classified-value-restriction localRestriction)
		(neq (classified-value-restriction localRestriction) :redundant)))
      ;; do nothing if null value restriction, or if it is already
      ;;    classified, except convert list to object, and possibly
      ;;    delete role fillers features from list of TBox restrictions,
      ;;    or create CBox role fillers feature:
      (setf (local-value-restrictions localRestriction)
	    (first concepts))
      (when (eql (local-upper-bound localRestriction) 0)
        (setf (local-value-restrictions localRestriction) (loom-constant INCOHERENT)))
      (return-from condition-value-restrictions nil))
    ;; determine if an unevaluated expression exists, and if all concepts
    ;;    are pure set definitions:
    (loop for c in concepts
	 do
	 (typecase c
	   (CONS
	    (setq unevaluatedExpressionP t)
	    (when (set-expression-p c)
	      (setq setExpressionP t)))
	   (SET-FEATURE
	    (setq setExpressionP t))))
    (setq newValueRestriction
	  (cond
	    (setExpressionP			; conjunction of set definitions
	     (condition-set-value-restriction concepts localRestriction))
	    (unevaluatedExpressionP
	     (condition-unevaluated-value-restriction
              (cons (implied-range (local-relation localRestriction))
                    concepts)
              :complete-immediately-p (eq tbox/cbox/dbox :dbox)))
	    ((cdr concepts)
             ;; try to avoid creating conjunction concept:
	     (cond ((and (local-lower-bound localRestriction)        ; RMM 7/11/94
			 (local-upper-bound localRestriction)
			 (> (local-lower-bound localRestriction)
			    (local-upper-bound localRestriction)))
		    (setf (local-value-restrictions localRestriction) 
		      (loom-constant INCOHERENT))
		    (return-from condition-value-restrictions nil))
		   ((disjoint-concepts-p (first concepts) (second concepts))
		    (setf (local-value-restrictions localRestriction) 
		      (loom-constant INCOHERENT))
		    (setf (local-upper-bound localRestriction) 0)    ; TAR 3/6/98
		    (return-from condition-value-restrictions nil))
		   (t ;; conjunction of unary concepts
		    (touch-conjunction-concept concepts))))
	    (t
	     ;; singleton unary concept
	     (car concepts))))
    ;; add in implication-induced value-restrictions
    (when (and (eq  tbox/cbox/dbox :cbox)
	       (not setExpressionP))
      (setf newValueRestriction (consequent-concept newValueRestriction)))
    ;; test for incoherence:
    (when (or (eq newValueRestriction :incoherent)
	      (incoherent-p newValueRestriction))
      (setf (local-upper-bound localRestriction) 0))
    (when (eql (local-upper-bound localRestriction) 0)
      (setf newValueRestriction (loom-constant INCOHERENT)))
    (setf (local-value-restrictions localRestriction) newValueRestriction) ))

(defun condition-unevaluated-value-restriction (terms &key complete-immediately-p)
  ;; Helping function for "condition-value-restrictions";
  ;; Situation: "terms" contains concept expressions which must be parsed;
  ;; Return a classified concept representing the conjunction of "terms";
  (declare (special *conceptBeingConditioned*))
  (let ((*parserContextStack* (list *loom-parse-graph*))
	(*conceptBeingParsed* *conceptBeingConditioned*)
	newConcept)
    (declare (special *parserContextStack* *conceptBeingParsed*))
    ;; Don't do this after all!
    ;; It causes problems with :FILLED-BY in embedded restrictions in :SOME
    ;;   or :ALL clauses.  Question:  Does this still need to be done for :ONE-OF or
    ;;   :INTERVAL clauses?
;    (setq terms (loop for item in terms      ; TAR 11/3/98
;                      collect (requote-symbolic-set-constants item)))
    (setq newConcept (condition&classify-subgraph 
		       (evaluate-expression `(:and ,@terms) :concept)))
    (unless (bad-definition-p newConcept)
      (if complete-immediately-p
	(nonforcing-complete-one-concept newConcept)
	(post-uncompleted-concept newConcept)))
    newConcept ))

(defun requote-symbolic-set-constants (term)
  ;; Helping function for "condition-unevaluated-value-restriction" and
  ;;   "touch-conjunction-concept";
  ;; Situation: "term" is about to pass through the parser a second
  ;;    time, and quotes that were stripped off previously must
  ;;    be replaced;
  ;; Return an expression with quotes replaced;
  (if (atom term)
    term
    (case (first term)
      ((:one-of :the-ordered-set)
       `(,(first term) ,@(generate-instance-references (rest term))))
      ((:through :interval++ :interval-+ :interval+- :interval--)
       `(,(first term)
         ,@(generate-instance-references (list (second term)))
         ,@(generate-instance-references (list (third term)))))
      ((:filled-by :not-filled-by)
       `(,(first term) ,(second term)
		       ,@(generate-instance-references (rest (rest term)))))
      (otherwise
       (loop for clause in term
	   collect (requote-symbolic-set-constants clause))))) )


;;; Axioms:
;;;    EMPTY-ONE-OF=>INC

(defun condition-set-value-restriction (concepts localRestriction)
  ;; Helping function for "condition-value-restrictions";
  ;; Return a classified set-feature OR concept representing the conjunction
  ;;    of "concepts";
  ;; Set-features are capable only of representing the restriction of
  ;;    a primitive concept by a set;  If the value restriction represents
  ;;    the restriction of a non-primitive concept by a set, then a new concept
  ;;    must be generated to capture the full definition;
  (declare (special *conceptBeingConditioned*))
  ;; add in a relation range restriction (when one exists)
  ;; note: we cheat here, allowing an implied-range to enter into a tbox restriction:
  (let* ((relation (local-relation localRestriction))
	 range sourceSetFeatures classifiedSetFeatures unaryConcepts
	 newSet members definingConcept)
     (labels ((distribute-concepts (conceptList)	; TAR 10/30/96
              ;; Distributes components of conceptList into the appropriate
              ;; sublists;
              (loop for c in conceptList
                    do (typecase c
                         (CONS (if (eq (first c) :and)
                                   (distribute-concepts (cdr c))
                                   (push c sourceSetFeatures)))
                         (SET-FEATURE (push c classifiedSetFeatures))
                         (otherwise
                          (push (defined-set-feature c) classifiedSetFeatures)
                          (push c unaryConcepts))))))

    (setq range (non-forcing-compute-range-of-relation relation))
    (distribute-concepts concepts)	; TAR 10/30/96
    (when (and range (neq range *Thing*))
      (pushnew (defined-set-feature range) classifiedSetFeatures)
      (push range unaryConcepts))
    (setq newSet
	  (compute-set-feature classifiedSetFeatures sourceSetFeatures nil))
    (setq members (members newSet))
    (when (null members)
      (return-from condition-set-value-restriction :incoherent))
    ;; return either "newSet" or a concept conjoining "newSet" and
    ;;    the unary concepts
    (setq definingConcept (defining-concept (base-set newSet)))
    (pushnew definingConcept unaryConcepts)
    ;; insure that *conceptBeingConditioned* depends on the defining concept
    ;;    for the base set
    (when (typep *conceptBeingConditioned* 'TBOX-CONCEPT)
      (add-link depend-ons *conceptBeingConditioned* definingConcept))
    ;; QUESTION: SHOULD WE JUST ALWAYS GENERATE A CONCEPT HERE???:
    (if nil ;(loop for c in unaryConcepts always (subconcept-p definingConcept c))
	newSet
	(define-concept
	  :is `(:and ,@unaryConcepts
		     ,(generate-set-definition newSet))
	  :characteristics (list :system-defined) 
	  :system-characteristics '(:definition-only)
	  :classify-immediately 'yes))
    )))


  ;;
;;;;;; More restriction propagation routines
  ;;

(defun propagate-using-value-restrictions ()
  ;; Now that value restrictions have coalesced into objects, we apply
  ;;    elaborations that particularly use them within their computations:
  ;;    (1) Propagate set restrictions to filled-bys and upper bounds;
  ;;    (2) Inherit lower bounds upwards based on disjoint mins;
  ;;    (3) Propagate qualification-induced value restrictions (NYI);
  ;; Also, we detect incoherent local restrictions here;
  (declare (special *listOfLocalRestrictions*))
  (let (setFeature localValueRes)
    (loop for res in *listOfLocalRestrictions*
	 do
	 ;; check for qualification that doesn't specialize value restriction
	 ;;    (unless the restricted relation is single-valued):
	 ;; CAUTION: When we skip the ALL&MIN=>SOME rule for the
	 ;;    single-valued case, we must also apply the ALL&SOME--ALL
	 ;;    reduction rule for the single-valued case;
	 (when (and (>= *power-level* 3)
		    (not (single-valued-p (local-relation res)))
		    (local-value-restrictions res)
		    (or (plusp (local-lower-bound res))
			(local-non-role-fillers res))
		    (or (null (local-qualification res))
			(and (local-qualification res) 
			     (not (subconcept-p (local-qualification res)
						(local-value-restrictions res))))))
	   (propagate-value-restriction-to-qualification res))
	 ;; if value restriction is a set, possibly infer new fillers:
	 (when (and (setq localValueRes (local-value-restrictions res))
		    (setq setFeature
			  (typecase localValueRes
			    (SET-FEATURE
			     localValueRes)
			    (otherwise
			     (defined-set-feature (local-value-restrictions res))))))
	   (propagate-set-restriction-to-fillers&upper-bound setFeature res))
	 (when (and (rest (local-subrestrictions res)) ;; if 2 or more subrestrictions,
                    (>= *power-level* 3))
	   ;; compute lower bound based on disjoint mins computation:
	   (augment-local-lower-bound
	     res
	     (compute-lower-bound-from-disjoint-mins 
	       (local-subrestrictions res) (local-value-restrictions res)))
	   ;; propagate implications between qualified value restrictions
	   (propagate-qualification-induced-value-restrictions
	     (local-subrestrictions res)))
	 ;; take this opportunity to check for incoherence:
	 ;(detect-incoherent-restriction res)  ; Moved up to reduce redundant warnings. TAR 3/30/98
	 ) ))

;;; Axioms:
;;;    ALL&MIN=>SOME
;;;    ALL&NON-FILL=>NON-FILL-SOME

(defun propagate-value-restriction-to-qualification (localRestriction)
  ;; Called by "propagate-using-value-restrictions";
  ;; The qualification on "localRestriction" is null, or does not specialize
  ;;    its value restriction;
  ;; Find or create a new restriction with a more specific qualification,
  ;;    and propagate the lower bound and non-fillers to the more
  ;;    specific local restriction;
  ;; Optimization: Qualifications must be concepts, not set features.  If
  ;;    we generate a new concept for a set feature, replace the value
  ;;    restriction with the new concept (otherwise LOOM thrashes for a while);
  (let* ((qualification (local-qualification localRestriction))
	 (vR (local-value-restrictions localRestriction))
	 newQualification otherRestriction)
    (when (typep vR 'SET-FEATURE)
      (setq vR (touch-set-concept vR))
      (setf (local-value-restrictions localRestriction) vR))
    ;; If the value restriction is incoherent, just set the qualification to
    ;;   be the same, instead of creating a new subconcept of INCOHERENT. ; TAR 7/6/99
    (setq newQualification
	  (if (and qualification (neq vR (loom-constant INCOHERENT))) ; TAR 7/6/99
	      (touch-conjunction-concept 
		(list qualification vR))
	      vR))
    (setq otherRestriction
	  (find-or-create-during-restriction-propagation
	    (local-relation localRestriction) newQualification))
    (augment-local-lower-bound
      otherRestriction
      (local-lower-bound localRestriction))
    (loop for f in (local-non-role-fillers localRestriction)
	 do (augment-local-non-role-fillers
	      otherRestriction f)) ))

(defun touch-set-concept (setFeature)
  ;; Called by "propagate-value-restriction-to-qualification";
  ;; Return a concept representing "setFeature";
  ;; QUESTION: DO INTEGERS FAIL TO FIND "integer" AS THEIR DEFINING CONCEPT???;
  (let ((definingConcept (defining-concept (base-set setFeature))))
    (define-concept
	  :is `(:and ,definingConcept
		     ,(generate-set-definition setFeature))
	  :characteristics (list :system-defined) 
	  :system-characteristics '(:definition-only)
	  :classify-immediately 'yes) ))

;;; Axioms:
;;;    ONE-OF=>MAX
;;;    MAX&ONE-OF=>FILL

(defun propagate-set-restriction-to-fillers&upper-bound (setFeature localRestriction)
  ;; Called by "propagate-using-value-restrictions" ;
  ;; If the cardinality of the members of "setFeature" is less than the
  ;;    upper bound, then reduce the upper bound;
  ;; If the cardinality equals the lower bound, then insure that all
  ;;    set members are also role fillers;
  (declare (special *conceptBeingConditioned*))
  (let ((cardinality (compute-set-cardinality setFeature))
	(upperBound (local-upper-bound localRestriction))
	(lowerBound (local-lower-bound localRestriction))
	oldFillers newFillers)
    (when (or (null cardinality)	        ;; exit unless set cardinality
	      (and upperBound			;;    is at most the upper bound
		   (< upperBound cardinality)))
      (return-from propagate-set-restriction-to-fillers&upper-bound nil))
    ;; make upper bound at most the cardinality of the set:
    (augment-local-upper-bound localRestriction cardinality)
    (when (and (eql cardinality lowerBound)
	       (< cardinality 11))		; don't get too ridiculous
      ;; push list of set members into set of role fillers;
      (setq oldFillers (local-role-fillers localRestriction))
      (when (= cardinality (length oldFillers))
	(return-from propagate-set-restriction-to-fillers&upper-bound))
      (setq newFillers (generate-decoded-set-members setFeature))
;      (setq definingConcept (non-forcing-compute-range-of-relation
;			      (local-relation localRestriction)))
;; THIS APPEARS TO BE A REMNANT INHERITED FROM 1.4 THAT IS NO LONGER APPLICABLE: RMM 9/30/92
;      (when (not (or (typep *conceptBeingConditioned* 'TBOX-CONCEPT)
;		     (subconcept-p definingConcept (loom-constant CONSTANT)))) 
;	;; situation: we are conditioning an instance, so we must convert
;	;;    "newFillers" to instances immediately (instead of at sealing time)
;	(setq newFillers
;	      (loop for f in newFillers
;		   collect
;		   (or (get-instance f)
;		       (create f definingConcept)))))
      (loop for f in newFillers
	   do (augment-local-role-fillers localRestriction f))) ))


(defun non-forcing-compute-range-of-relation (relation)
  ;; Rather specialized funtion called by "condition-set-value-restriction",
  ;;    "propagate-set-restriction-to-fillers&upper-bound", and
  ;;    "evaluate-restriction-subexpressions";
  ;; Return the implied or defined range of "relation";
  ;; If relation is not completed, try to complete it (or its last component
  ;;    if its a :composition) before computing its range;

  (when (member :being-completed (system-attributes relation)) ; TAR 10/6/97
    ;; When being invoked recursively (possibly via a convoluted chain of other
    ;;  classifier actions), return just the defined-range, since the value of
    ;;  the implied-range slot might not be valid, since it can be in the middle
    ;;  of transforming the value.
    (if (listp (implied-range relation))  ; Includes NIL!
	(return-from non-forcing-compute-range-of-relation (defined-range relation))
        (return-from non-forcing-compute-range-of-relation (implied-range relation))))

  (when (not (completed-p relation))
    (if (eq (defined-as relation) :composition)
	;; try to complete last component, because completing a composition
	;;    before its components might produce wrong result:
	(progn
	  (setq relation (first (last (components relation))))
	  (when (not (completed-p relation))
	    (nonforcing-complete-one-concept relation)))
	(nonforcing-complete-one-concept relation)))
  (or (implied-range relation)
      (defined-range relation)) )

;;; Axioms:
;;;    DISJOINT-SOMES=>MIN

(defun compute-lower-bound-from-disjoint-mins 
       (localRestrictions commonValueRestriction)
  ;; Situation: each restriction in "localRestrictions" restricts a common
  ;;    relation whose value restriction is "commonValueRestriction";
  ;; Determine a lower bound for that relation by looking for maximimally
  ;;    disjoint subsets;
  (labels ((compute-best-lower-bound (set)
             (if (null set)
               0
               (loop for (firstRes . rest) on set
                     maximize
                     ;; compute max over all cliques containing "firstRes":
                     (+ (local-lower-bound firstRes)
                        (compute-best-lower-bound
                         (loop for otherRes in rest
                               when
                               (disjoint-concepts-p
                                (or (local-value-restrictions otherRes)
                                    (local-qualification otherRes))
                                (or (local-value-restrictions firstRes)
                                    (local-qualification firstRes)))
                               collect otherRes)))))))
    (let ((usefulRestrictions
	   (loop for res in localRestrictions
	         when (and (or (local-qualification res)
			       (and (local-value-restrictions res)
				    (neq (local-value-restrictions res)
				         commonValueRestriction)))
			   (plusp (local-lower-bound res)))
	         collect res)))
      (compute-best-lower-bound usefulRestrictions) )))


;;; Axioms:
;;;    ALL&ALL-RANGE=>ALL (modus ponens for qualified value restrictions)

;; REWRITE THIS:
(defun propagate-qualification-induced-value-restrictions (localRestrictions)
  ;;
  (return-from propagate-qualification-induced-value-restrictions nil)
  ;; "famous cousins" -- propagate implications between qualified value
  ;;    restrictions:
  (let ((entry nil))				; Stop warning message -- tar
    (loop for res1 in localRestrictions
	 when (and (local-qualification res1)
		   (local-value-restrictions res1))
	 do
	 (loop for res2 in (cdr entry)
	      when (and (neq res1 res2)
			(loop for vr2 in (local-value-restrictions res2) 
			     thereis 
			     (and (atom vr2)
				  (vr-specializes-vr-p
				    (local-qualification res1) vr2))))
	      do
	      (loop for vr1 in res1
		   do (push vr1 (local-value-restrictions res2))))) )
  )


  ;;
;;;;;; Detection of incoherent local restriction
  ;;

;;; Axioms:
;;;    MIN&MAX=>INC
;;;    FILL&ONE-OF=>INC
;;;    FILL&NON-FILL=>INC

(defun detect-incoherent-restriction (localRestriction)
  ;; Called by "finalize-value-restrictions";
  ;; Test to see if the lower bound of "localRestriction"
  ;;    exceeds its upper bound, or if the value-restriction
  ;;    is incoherent, or if the number of role fillers exceeds
  ;;    the upper bound;
  ;; Note: Incoherent value restriction yields max 0 number restriction
  ;;    during conditioning of value restrictions.
  ;; Note: called by "propagate-restrictions";
  ;; Note: This test happens for instances as well as concepts,
  ;;    and hence limiting the "not-has-instance-p" test to only value
  ;;    restrictions that specialize CONSTANT is not correct;
  ;; Note: Failure of the "completed-p" test below could cause us to miss an
  ;;    incoherence in the concept taxonomy;
  (declare (special *conceptBeingConditioned*))
  (let ((lowerBound (local-lower-bound localRestriction)))
    (when (or (and (integerp (local-upper-bound localRestriction))
		   (> lowerBound (local-upper-bound localRestriction)))
	      (and (local-role-fillers localRestriction)
		   (bad-filler-in-local-restriction-p localRestriction))
	      (loop for nf in (local-non-role-fillers localRestriction)
		   thereis (member nf (local-role-fillers localRestriction))))
      (mark-as-incoherent *conceptBeingConditioned*
			  :incoherent-restriction localRestriction)) ))

(defun bad-filler-in-local-restriction-p (localRestriction)
  ;; Helping function for "detect-incoherent-restriction" and "mark-as-incoherent";
  ;; Return t iff "localRestriction" has a :filled-by filler that violates a set
  ;;    restriction;
  ;; Note: This check only succeeds if "setRestriction" is or points to
  ;;    a set feature;
  (let* ((setRestriction (local-value-restrictions localRestriction)))
    (when (and setRestriction
	       (local-role-fillers localRestriction)
	       (or (typep setRestriction 'SET-FEATURE)
		   (and (completed-p setRestriction)
			(setq setRestriction 
			      (defined-set-feature setRestriction)))))
      (loop for filler in (local-role-fillers localRestriction)
	   thereis (not-has-instance-p setRestriction filler))) ))

(defmethod mark-as-incoherent ((self UNARY-ENTITY) &key incoherent-restriction)
  ;; Mark "self" as incoherent, and possibly broadcast a message
  ;;    indicating that "incoherentRestriction" is the source of
  ;;    the inconsistency;
  (setf (incoherent-p self) t)
  ;; TO DO: If self is implied by a disjunct, post that disjunction to be reclassified
  ;; DO WE WANT NON-TBOX KNOWLEDGE (incoherence) TO AFFECT NORMALIZATION OF DISJUNCTS?
  (loop for sup in (super-concepts self)
       when (and (member self (disjuncts sup))
		 (eq (defined-as sup) :disjunction))
       do (pushnew sup *list-of-reclassify-concepts*))
  (unless (null incoherent-restriction)
    (let ((incoherenceReason
	   (generate-incoherent-restriction-message 
	    incoherent-restriction 
	    self
	    (cond
	     ((and (local-value-restrictions incoherent-restriction)
		   (incoherent-p
		    (local-value-restrictions incoherent-restriction)))
	      'VALUE)
	     ((bad-filler-in-local-restriction-p incoherent-restriction)
	      'FILLER)
	     ((loop for nf in (local-non-role-fillers incoherent-restriction)
		  thereis (member nf (local-role-fillers incoherent-restriction)))
	      'NON-FILLER)
	     (t
	      'NUMBER))))
	  (*automatically-advance-state-p* nil))
      (when incoherenceReason
	(fadd-value self (loom-constant INCOHERENCE-REASON) incoherenceReason)
	(complain "~&Warning: ~A" incoherenceReason)) )) )


  ;;
;;;;;; Conversion of comparisons to restrictions
  ;;

(defun convert-comparisons-to-restrictions (self tbox/cbox)
  ;; Look for comparisons between a role and a constant;
  ;; Convert these into restrictions, add new restrictions, and
  ;;    remove the now redundant comparisons;
  (labels ((can-be-converted-p (comparisonOperator FirstRole SecondRole)
             (when (and (relation-p FirstRole)
                        (relation-p SecondRole))
               (return-from can-be-converted-p nil))
             (case comparisonOperator
               ((same-as =)
                t)
               ((<= >=)
                (or (extended-number-p FirstRole)
                    (extended-number-p SecondRole)))
               ((< > /=)
                (or (extended-number-p FirstRole)
		    (extended-number-p SecondRole)))) ))
    (let ((comparisons (ecase tbox/cbox
			 (:tbox (comparisons self))
			 (:cbox (implied-comparisons self))))
	  sourceCmp)
      (loop for tail on comparisons
	    do
	    (setq sourceCmp (car tail))
	    (when (can-be-converted-p (name (second sourceCmp))
                                      (third sourceCmp)
                                      (fourth sourceCmp))
	      ;; create new source restriction
	      (ecase tbox/cbox
	        (:tbox
		 (push
		  (convert-one-comparison-to-restriction self (cdr sourceCmp))
		  (restrictions self)))
	        (:cbox
		 (push
		  (convert-one-comparison-to-restriction self (cdr sourceCmp))
		  (implied-restrictions self))))
	      ;; eliminate source comparison:
	      (setf (car tail) nil)))
      (ecase tbox/cbox
	(:tbox (delf (comparisons self) nil))
	(:cbox (delf (implied-comparisons self) nil))) )))

;;; Axioms:
;;;    EQ-CONST--ALL
;;;    EQ-CONST--MIN
;;;    EQ-CONST--MAX

(defun convert-one-comparison-to-restriction (self CMPbody)
  ;; Helping function for "condition-one-comparison";
  ;; Situation: "CMPbody" represents a source comparison which
  ;;    can be converted into an equivalent restriction;
  ;; Return a local restriction that corresponds to the CMP;
  (declare (ignore self))
  (multiple-value-bind (predicateName role constant)
      (move-constant-to-second-place (first CMPbody)
				     (second CMPbody)
				     (third CMPbody))
    (when (consp constant)
      (if (member (car constant) `(:the-constant :one-of))
	  (setq constant (second constant))
	  (conditioning-error "Illegal comparison argument")))
    (if (eq role :self)
	(error ":SELF is not implemented yet in CONVERT-ONE-COMPARISON-TO-RESTRICTION")
      `(:the ,role
	 ,(compute-value-restriction-from-comparator
	   predicateName
	   (or (implied-range role)
	       (defined-range role))
	   constant))) ))

(defun move-constant-to-second-place (predicate firstPlace secondPlace)
  ;; Helping function for "convert-comparison-to-restriction";
  ;; Situation:  Either "firstPlace" or "secondPlace" represents a constant
  ;;    value;
  ;; If the constant is in second place, return the values in the order
  ;;    they originally appeared;
  ;; Otherwise, return an inverted predicate name, and its arguments
  ;;    in reverse order;
  (let ((predicateName (name predicate)))
    (cond ((typep firstPlace 'TBOX-RELATION)
	   (when (typep secondPlace 'TBOX-RELATION)
	     (conditioning-error "Expected to find a constant in (~A ~A ~A)"
				 predicateName firstPlace secondPlace))
	   (values predicateName firstPlace secondPlace))
	  ((eq firstPlace :self)
	   (values predicateName firstPlace secondPlace))
	  (t (values
	      (case predicateName
		(> '<) (< '>) (>= '<=) (<= '>=)
		(otherwise predicateName))
	      secondPlace
	      firstPlace))) ))

(defun compute-value-restriction-from-comparator (predicateName range constant)
  ;; Helping function for "convert-comparison-to-local-restriction";
  ;; Compute the value restriction corresponding to "predicateName"
  ;;    and "constant";
  ;; "range" is used to locate the base set that defines the meaning of
  ;;    "constant".  Note that if this is QUANTITY or THING, then we need to 
  ;;    move down to either NUMBER or MEASURE in order to have a proper
  ;;    arithmetic comparison!
  (when (or (null range)
	    (eq range *Thing*)
	    (not (or (subconcept-p range (loom-constant NUMBER))
		     (subconcept-p range (loom-constant MEASURE)))))
    (setq range 
      (if (numberp constant) 
	  (loom-constant NUMBER)
	  (loom-constant MEASURE))))
  (when (and (not (defined-set-feature range))
	     (neq predicateName '=))
    (conditioning-error "The predicate ~S can only be applied to members of ~
                           sets or intervals,~%   while ~S has type ~S"
			predicateName constant (name range)))
  (let ((baseSet (base-set (defined-set-feature range))))
;    (ecase predicateName
;      (= `(:one-of ,constant))
;      (>= `(:and ,(name range)
;		 (:interval++ ,constant
;			     ,(compute-interval-maximum baseSet nil))))
;      (> `(:and ,(name range)
;		(:interval-+ ,constant
;			    ,(compute-interval-maximum baseSet nil))))
;      (<= `(:and ,(name range)
;		 (:interval++ ,(compute-interval-minimum baseSet nil)
;			     ,constant)))
;      (< `(:and ,(name range)
;		(:interval+- ,(compute-interval-minimum baseSet nil)
;			    ,constant)))
;      (/= `(:or ,(compute-value-restriction-from-comparator
;		   '< range constant)
;		,(compute-value-restriction-from-comparator
;                  '> range constant))))
    (ecase predicateName
      (= `(:one-of ,constant))
      (>= `(:interval++ ,constant
		       ,(compute-interval-maximum baseSet nil)))
      (> `(:interval-+ ,constant
		      ,(compute-interval-maximum baseSet nil)))
      (<= `(:interval++ ,(compute-interval-minimum baseSet nil)
		       ,constant))
      (< `(:interval+- ,(compute-interval-minimum baseSet nil)
		      ,constant))
      (/= `(:or ,(compute-value-restriction-from-comparator
		   '< range constant)
		,(compute-value-restriction-from-comparator
                  '> range constant))))))

;;; THIS DOESN'T GET CALLED ANYMORE -- IT SHOULD BE REWRITTEN AND REINSTATED:
;(defun compute-comparison-induced-restrictions (comparisons inducedRestrictions)
;  ;; Return a list of min and value restrictions inferred from
;  ;;    the semantics of "comparisons";
;  ;; For each comparison:
;  ;;    The types of its arguments induce value restrictions on the
;  ;;       first role in each role chain;
;  ;;    A min 1 restriction is placed on the first role of each role chain;
;  ;; CURRENTLY, WE HANDLE ONLY THE CASE OF 2-PLACE RELATIONS;
;  ;; TO DO: REWRITE THIS TO UNDERSTAND COMPOSITE RELATIONS;
;;  (return-from compute-comparison-induced-restrictions inducedRestrictions)
;  
;  (flet ((create-restriction
;	   (role valueRestriction lowerBound)
;	   (let ((newLocalRes (create-local-restriction
;				role nil
;				:local-value-restriction valueRestriction
;				:local-lower-bound lowerBound)))
;	     (compute-local-qualification newLocalRes))))
;    (loop for cmp in comparisons
;	 do
;	 ;; THIS IS WRONG -- MIN 1 RESTRICTIONS ARE NOT *ALWAYS* IMPLIED
;	 ;;    BY COMPARISONS, E.G., :same-as DOESN'T IMPLY
;	 ;;    MIN 1;
;	 (let* ((predicate (relationship cmp))
;		(place1 (or (implied-domain predicate)
;			    (defined-domain predicate)))
;		(place2 (or (implied-range predicate)
;			    (defined-range predicate))))
;;; THERE'S A BUG IN HERE SOMEWHERE???:
;	   (when place1
;	     (push (create-restriction
;		     (first (roles cmp)) (list place1) nil)
;		   inducedRestrictions))
;	   (when place2
;	     (push (create-restriction 
;		     (second (roles cmp)) (list place2) nil)
;		   inducedRestrictions))
;	   ))
;    inducedRestrictions ))


  ;;
;;;;;; Comparison conditioning
  ;;

(defun condition-comparisons (self tbox/cbox/dbox &key default-comparisons)
  ;; Return the most specific comparisons that apply to "self";
  ;; Classify the comparisons;
  ;; TO DO: PROPAGATE TRANSITIVE BINARY-TUPLE
  (let (localComparisons inheritedComparisons
	*comparisonFeatures*)
    (declare (special *comparisonFeatures*))
    ;; fill *comparisonFeatures* with comparison objects
    (case tbox/cbox/dbox
      (:tbox
       (setq localComparisons (comparisons self))
       (setq inheritedComparisons
	     (union-superc-slot-values self comparisons)))
      (:cbox
       (setq localComparisons (implied-comparisons self))
       (setq inheritedComparisons
	     (bag-append
	       (comparisons self)
	       (union-superc-slot-values self implied-comparisons))))
      (:dbox			   
       (setq localComparisons default-comparisons)
       ;; eliminate this catch if we decide to implement default :same-as:
       (when localComparisons
	 (catch 'condition-concept-catcher
	   (conditioning-error "Default comparisons such as ~S are not supported"
			       (first localComparisons)))
	 (return-from condition-comparisons nil))
       (setq inheritedComparisons nil)))
    ;; fill *comparisonFeatures* with classifiable objects;
    (loop for cmp in localComparisons
	 do (condition-source-comparison cmp))
    (classify-comparisons
      (generate-most-restrictive-comparisons
	(bag-append *comparisonFeatures* inheritedComparisons))) ))

(defun condition-source-comparison (sourceComparison)
  ;; Helping function for "condition-comparisons";
  ;; Create a comparison object corresponding to "sourceComparison" and
  ;;    push into onto *comparisonFeatures*;
  ;; TO DO: HANDLE CASE WHEN :same-as EQUATES A ROLE AND A CONSTANT;
  ;; BUG: WE DON'T HANDLE CASES LIKE (= 3 R S);
  (declare (special *comparisonFeatures*))
  (push
    (case (first sourceComparison)
      (:relates (condition-relates-source (rest sourceComparison)))
      (:exists (condition-exists-source (rest sourceComparison))))
    *comparisonFeatures*) )

(defun condition-relates-source (relatesSource)
  ;; Helping function for "condition-source-comparison";
  ;; Create a :relates comparison object;
  ;; If the relationship is :same-as or '=', mark it as
  ;;    and equivalence feature;
  (let* ((relationship (first relatesSource))
	 (roles (rest relatesSource))
	 (cmp (make-loom-instance 
		   'COMPARISON-FEATURE
		   :feature-type :relates
		   :relationship relationship
		   :roles roles)))
    (when (member (name relationShip) '(same-as =))
      (setf (feature-type cmp) :same-as)
      (setf (relationship cmp) (get-relation 'same-as)))
    cmp ))

(defun condition-exists-source (relatesSource)
  ;; Helping function for "condition-source-comparison";
  ;; Create an :exists comparison object;
  (let* ((relationship (first relatesSource))
	 (coreferences (rest relatesSource))
	 (cmp (make-loom-instance 
		   'REIFIED-COMPARISON-FEATURE
		   :feature-type :exists
		   :relationship relationship
		   :co-references coreferences)))
    cmp ))

;; NOBODY CALLS THIS:
(defun condition-induced-comparisons (newCmps classifiedCmps)
  ;; Return the most specific comparisons which result from
  ;;    classifying and adding newCmps into classifiedCmps;
  (let (*comparisonFeatures* *CMPinducedRestrictions* mostSpecificCMPs)
    (declare (special *comparisonFeatures* *CMPinducedRestrictions*))
    ;; fill *comparisonFeatures* with comparison objects;
    (loop for cmp in newCmps
	 do (condition-source-comparison cmp))
    (setq mostSpecificCMPs
	  (classify-comparisons
	    (generate-most-restrictive-comparisons
	      (bag-append *comparisonFeatures* classifiedCmps))))
    mostSpecificCMPs) )


;;; EQUIVALENCE-CLASS structures build up a set of role equivalence classes
;;; for all inherited equivalence-features.
;;;     members is a list of relations
;;;     comparison is the original comparison feature corresponding to a class,
;;;         if the class has not acquired any new elements

;;; Note: This struct appears to be used only by "generate-most-restrictive-comparisons"
(defstruct equivalence-class
  members
  comparison)

;;; Axioms:
;;;    ???

(defun generate-most-restrictive-comparisons (comparisons)
  ;; Condition (unclassified) members of "comparisons":
  ;; Return the most-specific of the comparisons (NOT YET DONE);
  ;; COMPARISON-CONDITIONING IS ONLY PARTIALLY-IMPLEMENTED, E.G., WE
  ;;    DON'T DO "ROLE-BALANCING";
  (flet ((equivalence-class-member 
	   (role class)
	   (member role (equivalence-class-members class))))
    (let (equivalenceCmps otherCmps equivalenceClasses)
      (loop for cmp in comparisons do
	   (if (eq (feature-type cmp) :same-as)
	       (let (class classes newRoles)
		 (loop for role in (roles cmp) do
		      (setq class (find role equivalenceClasses
					:test #'equivalence-class-member))
		      (if class
			  (pushnew class classes)
			  (pushnew role newRoles)))
		 (if (null classes)
		     (when (rest newRoles)
		       (push (make-equivalence-class
			       :members newRoles
			       :comparison cmp)
			     equivalenceClasses))
		     (progn
		       (setq class (first classes))
		       (when (rest classes)	; classes need to be merged into a single class
			 (loop for oldClass in (rest classes) do
			      (setf (equivalence-class-members class)
				    (nconc (equivalence-class-members oldClass)
					   (equivalence-class-members class)))
			      (delf equivalenceClasses oldClass))
			 (setf (equivalence-class-comparison class) nil))
		       (when newRoles
			 (setf (equivalence-class-members class)
			       (nconc newRoles (equivalence-class-members class)))
			 (setf (equivalence-class-comparison class) nil)))))
	       ;; else not a :same-as comparison:
	       (push cmp otherCmps)))
      ;; Build new list of equivalence comparisons from equivalenceClasses
      (setq equivalenceCmps
	    (loop for class in equivalenceClasses
		 collect (or (equivalence-class-comparison class)
			     (let ((cmp (make-loom-instance
					  'COMPARISON-FEATURE
					  :feature-type :same-as
					  :relationship (eval-relation-id 'same-as)
					  :roles (equivalence-class-members class))))
			       cmp))))
      (bag-append equivalenceCmps otherCmps) )))


  ;;
;;;;;; Classification of Restrictions and Comparisons
  ;;

;;; Axioms:
;;;    ALL&SOME&SV--ALL&SV (redundant qualification)

(defun classify-restrictions (dependentConcept tbox/cbox/dbox)
  ;; Return a list of classified restrictions derived from restrictions
  ;;    in *listOfLocalRestrictions*;
  ;; Create dependency links from newly-classified restrictions
  ;;    to their relations and value restrictions;
  ;; Recycle local restrictions;
  ;; Note: Assumes that the non-nil "local-value-restrictions" slot for
  ;;    each local restriction contains an atom rather than a list;
  ;; Note: The the :redundant mark exists to insure that only the
  ;;    most specific restrictions get classified;
  (declare (special *listOfLocalRestrictions*))
  (let (classifiedRestrictions)
    (loop for res in *listOfLocalRestrictions*
	 do
	 (integrity-check (null (more-restrictive-defined-range (local-relation res))))
	 ;; apply ALL&SOME&SV--ALL&SV reduction for single valued relations:
	 (when (and (eq (local-qualification res)
			(local-value-restrictions res))
		    (single-valued-p (local-relation res)))
	   (setf (local-qualification res) nil))
	 (when (and (not (zerop (local-lower-bound res)))
		    (neq (classified-min-restriction res) :redundant))
	   (push
	     (or (classified-min-restriction res)
		 (classify-local-restriction res :min-restriction nil tbox/cbox/dbox))
	     classifiedRestrictions))
	 (when (and (integerp (local-upper-bound res))
		    (or (zerop (local-upper-bound res))
		        (not (single-valued-p (local-relation res))))
		    (neq (classified-max-restriction res) :redundant))
	   (push
	     (or (classified-max-restriction res)
		 (classify-local-restriction res :max-restriction nil tbox/cbox/dbox))
	     classifiedRestrictions))
	 (when (and (local-value-restrictions res)
		    (neq (classified-value-restriction res) :redundant))
	   (push
	     (or (classified-value-restriction res)
		 (classify-local-restriction 
		   res :value-restriction dependentConcept tbox/cbox/dbox))
	     classifiedRestrictions))
	 (when (and (local-role-fillers res)
		    (neq (classified-filled-by res) :redundant))
	   (push
	     (or (classified-filled-by res)
		 (classify-local-restriction res :filled-by nil tbox/cbox/dbox))
	     classifiedRestrictions))
	 (when (and (local-non-role-fillers res)
		    (neq (classified-not-filled-by res) :redundant))
	   (push
	     (or (classified-not-filled-by res)
		 (classify-local-restriction res :not-filled-by nil tbox/cbox/dbox))
	     classifiedRestrictions))
	 (discard-local-restriction res))
    (fast-remove-duplicates classifiedRestrictions) ))

(defun propagate-role-is-value-restricted-p (relation)
  ;; Helping function for "classify-local-restriction".
  ;; Set the "role-is-value-restricted-p" attribute on "relation" and
  ;;    all of its subrelations.
  (setf (role-is-value-restricted-p relation) t)
  (loop for sub in (sub-concepts relation)
        do (propagate-role-is-value-restricted-p sub)) )

(defun classify-local-restriction 
       (localRestriction featureType dependentConcept tbox/cbox/dbox)
  ;; Helping function for "classify-restrictions";
  ;; Return a classified restriction representing a min, max, or
  ;;    value restriction indicated within "localRestriction";
  ;; Add dependency links from newly-classified restrictions
  ;;    to their relations and value restrictions;
  ;; Note: We eliminate qualfication from :filled-by and :not-filled-by;
;; THIS HAS BEEN ELIMINATED:
  ;; Tricky: Value restriction on a min-restriction or filled-by gets
  ;;    and'ed into the qualification to make classified restriction
  ;;    as specific as possible;
  ;; TO DO: QUALIFICATIONS ARE ALWAYS CONCEPTS -- CONSIDER DOING THE SAME
  ;;    FOR VALUE RESTRICTIONS;
  (let (newFtr classifiedFtr valueRestrictionConcept)
    (ecase featureType
      (:value-restriction
       (setq newFtr (make-instance 'VALUE-RESTRICTION))
       (setf (value-restriction newFtr)
	     (local-value-restrictions localRestriction))
       (setq valueRestrictionConcept
	     (compute-defining-concept (local-value-restrictions localRestriction)))
       ;; update sealing attribute on relation:
       ;; RMM 5/16/95:
       (propagate-role-is-value-restricted-p (local-relation localRestriction)))
      (:min-restriction
       (setq newFtr (make-instance 'MIN-RESTRICTION))
       (setf (lower-bound newFtr)
	     (local-lower-bound localRestriction)))
      (:max-restriction
       (setq newFtr (make-instance 'MAX-RESTRICTION))
       (setf (upper-bound newFtr)
	     (local-upper-bound localRestriction)))
      (:filled-by 
       (setq newFtr (make-instance 'FILLED-BY-FEATURE))
       (setf (role-fillers newFtr) (local-role-fillers localRestriction)))
      (:not-filled-by 
       (setq newFtr (make-instance 'NOT-FILLED-BY-FEATURE))
       (setf (non-role-fillers newFtr) (local-non-role-fillers localRestriction))))
    (setf (feature-type newFtr) featureType)
    (setf (relation newFtr) (local-relation localRestriction))
    (setf (qualification newFtr) 
	  (case featureType
	    ((:filled-by :not-filled-by) nil)
	    (otherwise (local-qualification localRestriction))))
    (setq classifiedFtr (classify-one-restriction newFtr featureType))
    (when (eq newFtr classifiedFtr)		; no merge occurred:
      ;; add dependency pointer from relation to new feature:
      (addf (dependents (relation newFtr)) newFtr)
      ;; add dependency pointer from value restriction to new feature:
      (when valueRestrictionConcept
	(addf (dependents valueRestrictionConcept) newFtr))
      ;; compute value for "instrument-p"
      (setf (instrument-p newFtr) (compute-instrument-p newFtr)))
    (when dependentConcept			;(eq (feature-type newFtr) :value-restriction)
      ;; UNCONDITIONALLY place dependency link between "dependentConcept" and computed
      ;;    value restriction (link may be redundant):
      (case tbox/cbox/dbox
	(:tbox (add-link depend-ons dependentConcept valueRestrictionConcept))
	(otherwise (add-link non-tbox-depend-ons dependentConcept valueRestrictionConcept))))
    classifiedFtr ))

(defun classify-one-restriction (self featureType)
  ;; Called by "classify-local-restriction";
  ;; Classify the restriction "self";
  ;; If "featureType" is :min-restriction or :max-restriction,
  ;;    try to short-cut the classification;
  (case featureType
    (:min-restriction
     (if (and (eq (lower-bound self) 1)
	      (null (qualification self)))
	 (min-1-restriction (relation self))
	 (classify-one-concept self)))
    (:max-restriction
     (if (and (eq (upper-bound self) 1)
	      (null (qualification self)))
	 (max-1-restriction (relation self)) 
	 (classify-one-concept self)))
    (:not-filled-by
     (when (null (null-not-filled-by-restriction (relation self)))
       (install-null-not-filled-by-restriction (relation self)))
     (classify-one-concept self))
    (otherwise
     (classify-one-concept self))) )

(defun structure-shared-most-specific-classified-restrictions (concept tbox/cbox)
  ;; Helping function for "condition-restrictions";
  ;; Classify the currently conditioned restrictions, and filter out all but the
  ;;    most specific of them;
  ;; If the result equals the set of restrictions inherited from the first
  ;;    parent of "concept", return the inherited set;
  ;; Otherwise, return the newly formed set;
  (let* ((result (most-specific-concepts
	          (classify-restrictions concept tbox/cbox)))
         (parents
          (ecase tbox/cbox
            (:tbox (conjuncts concept))
            (:cbox (super-concepts concept))))
         (inheritedRestrictions
          (and parents
               (ecase tbox/cbox
                 (:tbox (restrictions (first parents)))
                 (:cbox (implied-restrictions (first parents)))))))
    (if (set-equal-p result inheritedRestrictions :test #'filler-equal)
	inheritedRestrictions
        result) ))

(defun classify-comparisons (comparisons)
  ;; Classify any comparisons which are not already classified;
  ;; Create dependency links from newly classified comparisons
  ;;    to their relations and role-chain referents;
  ;; BUG: THIS BLOWS UP ON CONSTANT-VALUED ROLE CHAINS:
  (flet ((link-from-depend-on-role
	   (role cmp)
	   (when (typep role 'TBOX-RELATION)
	     (push (dependents role) cmp))))
    (let (result)
      (loop for cmp in comparisons
	   do
	   (when (not (classified-p cmp))
	     (let ((classifiedCmp (classify-one-comparison cmp)))
	       (if (eq cmp classifiedCmp)
		   ; "cmp" is new to the classification hierarchy:
		   (progn
		     (unless (member (name (relationship cmp))
				   '(same-as < <= > >= /=))
		       (addf (dependents (relationship cmp)) cmp))
		     (case (feature-type cmp)
		       (:exists
			(loop for coref in (co-references cmp)
			     do
			     (link-from-depend-on-role (second coref) cmp)
			     (link-from-depend-on-role (third coref) cmp)))
		       (otherwise
			(loop for role in (roles cmp)
			     do (link-from-depend-on-role role cmp))))
		     ;; compute value for "instrument-p"
		     (setf (instrument-p cmp) (compute-instrument-p cmp)))
		   ; "cmp" merged with already classified comparison:
		   (setq cmp classifiedCmp))))
	   (push cmp result)) 
      result )))

(defun classify-one-comparison (self)
  ;; Classify the comparison "self";
  ;; Side-effect: Install a null comparison on the comparison operator
  ;;    for "self" if none exists;
  (if (eq (feature-type self) :exists)
      (when (null (null-reified-comparison (relationship self)))
	(install-null-comparison (relationship self) :reified-p t))
      (when (null (null-comparison (relationship self)))
	(install-null-comparison (relationship self))))
  (classify-one-concept self) )

  ;;
;;;;;; Conditioning of negations
  ;;

(defun condition-negations (self)       ;  RMM 12/21/93
  ;; Inherit negated concepts from parents of "self";
  (loop for super in (super-concepts self)
        do
        (loop for nc in (negated-concepts super)
              do (pushnew nc (negated-concepts self)))) )


  ;;
;;;;;; Conditioning of Computed Features
  ;;

(defun condition-computed-features (self)
  ;; Convert source features into computed feature objects;
  ;; Optimization1 : If "self" is primitive then don inherit computed features,
  ;;    since a match cannot succeed unless either an instance
  ;;    is directly asserted to match "self" (or one of its children),
  ;;    or if an antecedent at or below "self" is satisfied;
  ;; Optimization 2: If "self" has the attribute :predicate-specializes-parents
  ;;    then classify local features below inherited features, (and 
  ;;    therefore don't inherit computed features);
  ;; CAUTION: The primitive optimization necessitates that the classifier
  ;;    ignore computed features when "self" is being matched against
  ;;    other concepts that inherit features that "self";
  ;; TO DO: WHEN WE ARE ABLE TO CLASSIFY QUERY FEATURES, CLASSIFY THEM
  ;; TO DO: CONSIDER REWRITING :predicate-specializes-parents SEMANTICS
  ;;    TO PREVENT SPECIALIZATIONS BETWEEN :satisfies AND EITHER
  ;;    :predicate OR :function FEATURES;
  (let ((localFeatures (loop for feature in (computed-features self)
	                     collect
	                     (condition-one-computed-feature
		              feature (context self))))
	(allFeatures nil))
    ;; to insure that higher up computed features precede lower ones,
    ;;    we first collect a list with the higher ones at the end, and
    ;;    then reverse the list:
    (loop for super in (super-concepts self)
          do
          (loop for f in (computed-features super)
                unless (member f allFeatures)
                do (push f allFeatures)))
    (setq allFeatures (most-specific-concepts (nreverse allFeatures)
					      :destructive-p t))
    (when localFeatures
      (setq allFeatures
            (bag-append allFeatures localFeatures)))
    (when allFeatures
      (setf (computed-features self) allFeatures)
      ;; TO DO: CLASSIFY :satisfies FEATURES
      (loop for feature in allFeatures
	   do
	   ;; CLASSIFICATION WOULD HAVE TAKEN CARE OF THIS:
	   (setf (instrument-p feature) (compute-instrument-p feature))
	   (addf (dependents feature) self))) ))

(defun validate-arity (self arity) 
  ;; If "self" doen't have an arity assigned yet, assign it one;
  ;; Otherwise, check the agreement between arities of computed
  ;;    features and of conjuncts;
  ;; If "self" should be n-ary instead of binary, change its CLOS class;
  (flet ((compute-arity-of-feature (feature)
	   ;; Compute the arity implicit in the computed feature "feature";
	   (let ((arity (length (car (parameters&body feature)))))
	     (case (feature-type feature)
	       (:function (1+ arity))
	       (otherwise arity)) ))
         (compute-arity-of-auxiliary-code ()
           (cond
            ((auxiliary-lambda-function self)
             (and (consp (auxiliary-lambda-function self))
                  (1+ (length (first (auxiliary-lambda-function self))))))
            ((auxiliary-lambda-predicate self)
             (and (consp (auxiliary-lambda-predicate self))
                  (length (first (auxiliary-lambda-predicate self))))))))
    (setq arity (or arity
                    (compute-arity-of-auxiliary-code)
                    (and (computed-features self)
                         (compute-arity-of-feature 
                          (first (computed-features self))))
                    (and (conjuncts self)
                         (arity (first (conjuncts self))))                         
                    2))
    (setf (arity self) arity)
    (when (> arity 2)
      (coerce-binary-relation-to-n-ary-relation self))
    (loop for f in (computed-features self)
         when (/= arity (compute-arity-of-feature f))
         do (conditioning-error
             "Feature ~S has wrong number of arguments -- arity of
concept/relation is ~D" f arity))
    ;; check that arities of conjuncts match the arity of "self":
    (loop for super in (conjuncts self)
         when (not (or (eql (arity super) (arity self))
                       (and (eq super (loom-constant N-ARY-TUPLE))
                            (>= (arity self) 3))))
         do
         (conditioning-error
          "Relation ~A's arity is ~A, which conflicts 
with that of the inheriting relation ~A, which 
has arity ~A"
          (generate-external-reference self) (arity self)
          (generate-external-reference super) (arity super))) ))

(defun condition-one-computed-feature (sourceFeature context)
  ;; Helping function for "condition-computed-features";
  ;; Perform validation on the definition in "sourceFeature";
  ;; Return an object representing the computed feature "sourceFeature";
  ;; Note: Creation of a compilable query must be deferred until the
  ;;    network is sealed, so that relations referenced within the
  ;;    query will already have been sealed;
  ;; I DON'T THINK THIS NEXT NOTE IS TRUE:
  ;; Note: The slots "source-function" and "source-predicate" are used
  ;;    only for features attached to unary concepts;
  ;; TO DO: WE DON'T YET LINK THE SLOT "consequent-concept" TO ANYTHING;
  (when (atom sourceFeature)            ; must be a :satisfies feature  RMM 1/28/94
    (return-from condition-one-computed-feature sourceFeature))
  (let* ((featureType (car sourceFeature))
	 (parameters&body (cdr sourceFeature))
	 (newFeature
	   (make-loom-instance
	     'COMPUTED-FEATURE
	     :parameters&body (if (listp (car parameters&body))
				  parameters&body
				  `((,(car parameters&body))
				    ,@(cdr parameters&body)))
	     :context-of-feature (or context *context*))))
    (setf (feature-type newFeature) featureType)
    (case featureType
      (:satisfies 
       (multiple-value-bind (conceptReferences predicateVariableP)
	   (collect-concepts-referenced-in-query 
	    (cadr parameters&body)
	    (context-of-feature newFeature)
	    :predicate-p t
	    )
	 ;; note: the new feature is a TBox 
	 (setf (concept-references newFeature) conceptReferences)
	 (setf (predicate-variable-p newFeature) predicateVariableP)
	 (loop for ref in conceptReferences
	     do (addf (dependents ref) newFeature))))
      (:function
       (when (null (cdr (first parameters&body)))
	 (setf (source-function newFeature) `(lambda ,@parameters&body))))
      (:predicate
       (when (null (cddr (first parameters&body)))
	 (setf (source-predicate newFeature) `(lambda ,@parameters&body)))))
    newFeature ))

(defun collect-concepts-referenced-in-query (query context &key predicate-p)
  ;; Helping function for "condition-one-computed-feature";
  ;; Find or create a concept or relation for each symbolic reference
  ;;    within "query";
  ;; Return (1) a list of concepts and relations referenced in "query"
  ;;        (2) a flag which is T if a variable was found in the predicate position
  ;; TO DO: FIX :all, :some, :the, :at-least, ... SO THAT THEY ALLOW ARBITRARY
  ;;    EXPRESSIONS AS ARGUMENTS INSTEAD OF JUST SYMBOLIC REFS;
  (let ((savedContext *context*)		; DGB 4/26/91
	result predicateVariableP)
    (labels 
      ((collect-concepts-in-subqueries (subQueries predicateP)
	 (loop for subQ in subQueries
	       do (help-collect-concepts-in-query subQ predicateP)))
       (collect-concepts-in-about-clause (subQueries predicateP)
	 (loop for subQ in subQueries
	       do
	       (setq subQ (list-of subQ))
	       (if (keywordp (first subQ))
                 (help-collect-concepts-in-query subQ predicateP)
                 (pushnew 
                  (evaluate-symbolic-reference
                   (first subQ)
                   (if (rest subQ) :relation :concept))
                  result))))		 
       (help-collect-concepts-in-query (expression predicateP)
	 (when (or (atom expression)
		   (quoted-p expression))
	   (return-from help-collect-concepts-in-query nil))
	 (let* ((operator (first expression))
	        (operands (rest expression))
                (keywordOperator (validate-keyword operator :no-error-p t))) ; RMM 5/21/93
	   (cond
            ((keywordp keywordOperator)
	     (case keywordOperator
	       ((:and :or :not :fail :implies)
		(collect-concepts-in-subqueries operands t))
	       ((:exists :forall :collect :set-of)
		(help-collect-concepts-in-query (second operands) t))
	       (:about
		(let (*insideAboutP*)
		  (declare (special *insideAboutP*))
		  (collect-concepts-in-about-clause (cdr operands) t)))
	       ;; FIX HERE:
	       ((:at-least :at-most :exactly)
		(pushnew
		 (evaluate-symbolic-reference (second operands) :relation)
		 result))
	       ;; FIX HERE ALSO:
	       ((:all :some :the)
		(pushnew
		 (evaluate-symbolic-reference (first operands) :relation)
		 result)
		(pushnew
		 (evaluate-symbolic-reference (second operands) :concept)
		 result))
	       ((:filled-by :not-filled-by)
		(pushnew
		 (evaluate-symbolic-reference (first operands) :relation)
		 result))
	       ;; FIX HERE ALSO
	       (:same-as
		(if (boundp '*insideAboutP*)
		    (progn
		      (pushnew
		       (evaluate-symbolic-reference (first operands) :relation)
		       result)
		      (pushnew
		       (evaluate-symbolic-reference (second operands) :relation)
		       result))
		  ;; top-level :same-as
		  (collect-concepts-in-subqueries operands nil)))
	       ((:at-world-time :at-world-time+ :at-world-time- ; TAR 4/16/93
		 :holds-at :holds-after :holds-before :begins-at :ends-at) ; TAR 5/26/93
		(collect-concepts-in-subqueries (cdr operands) t)) ; Skip time argument
	       ((:becomes :ceases :persists-forward :persists-backward) ; TAR 5/5/93
		(collect-concepts-in-subqueries operands t))
	       ((:one-of :the-list :the-list*) nil)
	       (otherwise
		(conditioning-error "Illegal keyword ~S in query" keywordOperator))))
            ((symbolp operator)
	     (if (question-mark-variable-p operator)
		 (setq predicateVariableP t)
		 (pushnew
		  (evaluate-symbolic-reference
		   operator
		   (if (and predicateP (null (cdr operands)))
		       :concept
		     :relation))
		  result))
             (collect-concepts-in-subqueries operands nil))
            (t
             (conditioning-error "Illegal symbol ~S in query" operator))))))
      (when (neq context savedContext)
	(change-context context))
      (help-collect-concepts-in-query query predicate-p)
      (when (neq context savedContext)
	(change-context savedContext))
      (values result predicateVariableP) )))


;; TO DO:

#|

ADD Axioms:
   NON-FILL=>NOT-ONE-OF

QUALIFICATIONS ARE ALWAYS CONCEPTS -- CONSIDER DOING THE SAME
   FOR VALUE RESTRICTIONS;

ELIMINATE RANGE RESTRICTIONS ON FILLED-BY FEATURES
  (SUBSTITUTE BASE RELATION)

ELIMINATE MULTIPLE BASE RELATIONS ON RANGE-RESTRICTED
  RELATIONS
|#

#|

TOUGH NUT:

;; FAILS TO CLASSIFY "bb" BELOW "aa": RMM 10/11/90
(defconcept a)
(defrelation r)
(defconcept aa :is (:all r a))
(defconcept bb :is (:at-most 0 r))

;; MISSED CLASSIFICATION:

;; FAILS TO INFER "(:all r a)" FOR "cc", AND HENCE FAILS TO
;;    CLASSIFY "cc" BELOW "aa" (ACTUALLY, THEY SHOULD MERGE):
(defrelation ra :is (:and r (:range a)))
(defconcept cc :is (:and (:at-least 1 ra) (:at-most 1 r)))

|#


