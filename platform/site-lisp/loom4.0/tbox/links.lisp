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

;;; LINKS.LISP (TBOX)

(in-package "LOOM")

(export '(empty-concept))


;;; This file contains low-level functions for adding and removing links
;;;    between Loom classifiable-objects, and for reinitializing and reclaiming
;;;    network objects


  ;;
;;;;;; Filling-in of concepts
  ;;

(defun fill-conjuncts (self conjuncts)
  ;; Helping function for "convert-to-primitive-conjunction-concept";
  (setf (conjuncts self) conjuncts)
  (loop for c in conjuncts
        do (add-depend-ons-link self c)) )
              
(defun fill-components (self components)
  ;; Helping function for "condition-non-defined-relation" and
  ;;    "condition-compute-expression";
  ;; Fill slots indicating that "self" is defined as a composition
  ;;of "components";
  (setf (defined-as self) :composition)
  (setf (components self) components)
  (loop for comp in components
        do (add-depend-ons-link self comp)) )


  ;;
;;;;;; Empty-concept Functions
  ;;

(eval-when (compile load eval)
  (setq *empty-concept-forms*
      '(
	(:super-concepts (empty-slot super-concepts self))

	;; keywords specific to concepts:
	((:specializes :conjuncts) (setf (conjuncts self) nil))
	(:primitive (setf (primitive-p self) nil)) 
	(:depend-ons (empty-slot depend-ons self))
	(:characteristics (setf (attributes self) nil))
	(:non-tbox-depend-ons (empty-slot non-tbox-depend-ons self))
	(:disjoint-coverings
	  (loop for covering in (disjoint-coverings self)
	       do (undefine-disjoint-covering self (car covering))))
;	(:disjoint-covering-memberships
;	  (delete-inherited-covering-membership-components self))
	(:partitions (undefine-partitions self)
	             (clear-partition-memberships self))    ; TAR 8/8/95
;	(:covering-concepts (setf (covering-concepts self) nil))
	(:system-characteristics (setf (system-attributes self) nil))
        (:closed-world (delf (system-attributes self) :closed-world))
	
	;; keywords specific to relations:
	(:defined-range (setf (defined-range self) nil))
	(:defined-domain (setf (defined-domain self) nil))
	(:implied-domains (setf (implied-domains self) nil))
	(:implied-domain (setf (implied-domain self) nil))
	(:implied-range (setf (implied-range self) nil))
	(:antecedents (setf (antecedents self) nil))
	(:arity (setf (arity self) nil))
	(:inheritance-link (setf (inheritance-link self) nil))
	(:inheritance-method (setf (inheritance-method self) nil))
	(:inverse
	  (progn
	    (empty-slot inverse self)
	    (when (eq (defined-as self) :inverse)
		    (setf (defined-as self) nil))))
	(:components
	  (progn 
	    (setf (components self) nil)
	    (when (eq (defined-as self) :composition)
		    (setf (defined-as self) nil))))
	(:symmetric (empty-slot inverse self))
;	(:transitive (empty-slot trans-closure self)) 
;	(:reflexive (empty-slot is-reflexive self))
	
	;; keywords (usually) specific to unary-concepts:
	(:restrictions
	 (progn
	   (remove-dependency-links self (restrictions self) :tbox)
	   (setf (restrictions self) nil)))
	(:comparisons
	 (progn
	   (remove-dependency-links self (comparisons self) :tbox)
	   (setf (comparisons self) nil)))
	(:computed-features
	 (progn
	   (remove-dependency-links self (computed-features self) :tbox)
	   (setf (computed-features self) nil)))
	(:parsed-expressions (empty-slot parsed-expressions self))
	(:disjuncts (setf (disjuncts self) nil))
	(:negated-concepts (setf (negated-concepts self) nil))
	(:set-feature (setf (defined-set-feature self) nil))
	(:defined-as (setf (defined-as self) nil))
	(:relation-of (setf (relation-of self) nil))
	(:consequents
         (progn     
           (loop for value in (consequents self)
                 do (delf (antecedents value) self))
           (setf (consequents self) nil)
           (setf (more-specific-consequent self) nil)))
	(:most-general-antecedents 
	  (setf (most-general-antecedents self) nil))
	(:implied-restrictions
	  (progn
	   (remove-dependency-links self (implied-restrictions self) :non-tbox)
	   (setf (implied-restrictions self) nil)))
	(:implied-comparisons
	  (progn
	   (remove-dependency-links self (implied-comparisons self) :non-tbox)
	   (setf (implied-comparisons self) nil)))
	(:implied-computed-features
	  (progn
	   (remove-dependency-links self (implied-computed-features self) :non-tbox)
	   (setf (implied-computed-features self) nil)))
	(:individual (empty-slot inverse self))
	(:default-concepts (setf (default-concepts self) nil))
	(:default-features
	  (progn
	   (remove-dependency-links self (default-features self) :non-tbox)
	   (setf (default-features self) nil)))

	;; keys specific to features:
	(:relation
         (let ((value (relation self)))
           (when value
             (delf (dependents value) self)
             (setf (relation self) nil))))
	(:qualification (empty-slot qualification self))
	(:value-restriction
         (let ((value (compute-defining-concept (value-restriction self))))
           (delf (dependents value) self)
           (setf (value-restriction self) nil)))
	((:min :lower-bound) (empty-slot lower-bound self))
	((:max :upper-bound) (empty-slot upper-bound self))
	(:relationship
	  (progn				; DGB 11/27/91
	    (delf (dependents (relationship self)) self)
	    (setf (relationship self) nil)))
	(:roles
	  (progn
	    (loop for role in (roles self)
		 when (relation-p role)
		 do (delf (dependents role) self))
	    (setf (roles self) nil)))
	(:co-references
	  (progn
	    (loop for coref in (co-references self)
		 when (relation-p coref)
		 do (delf (dependents coref) self))
	    (setf (co-references self) nil)))
	(:concept-references
	  (progn
	    (loop for ref in (concept-references self)
		 do (delf (dependents ref) self))
	    (setf (concept-references self) nil)))
	(:defining-concept
	  (empty-slot defining-concept self))
        (:mixin-classes (setf (mixin-classes self) nil))
        (:mixin-slots (setf (mixin-slots self) nil))
        (:role-cache (setf (role-cache self) nil))
	(otherwise (error "form-empty-concept-code:  Bad key= ~S" key))
	))

  (defun form-empty-concept-code (self key)
    ;; Return a piece of code which (typically) deletes links from
    ;;    the classifiable-object "self" according to the value of "key";
    (let ((entry (loop for row in *empty-concept-forms*
		      when (member key (list-of (car row)))
                      return row)))
      (when (null entry)
	(warn "Bad empty-concept form -- no such key: ~S~%" key)
	(return-from form-empty-concept-code nil))
      (subst self `self (cadr entry)) ))

  ) ; END EVAL-WHEN						
  

(defmacro empty-concept (self &rest listOfKeys)
  ;; Empty-out (nullify) slots of "self" based on the keys and values
  ;;    in "keys&values";
  ;; Typically, a key entry is interpreted as an
  ;;    instruction to delete link(s) between network objects;
  ;; This macro is used chiefly by "reinitialize-classifiable-object";
  (let ((forms (loop for key in listOfKeys
		     when (form-empty-concept-code self key)
		     collect it)))
    (if (cdr forms)
	`(progn ,@forms)
	(car forms)) ))




  ;;
;;;;;; Low-level support for Fill and Empty
  ;;

(defmacro fill-slot (slotName self valueOrList &key single-valued-value)
  ;; Expand into a form which places links between "self" and
  ;;    each of the members of "valueOrList";
  ;; Assumes that if the slot indicated by "slotName" is
  ;;    collection-valued, then (1) "valueOrList" is a list, and
  ;;    (2) it must have an inverse;
  ;; "single-valued-value" indicates that "valueOrList" is a single value;
  ;; NOT FOR BEGINNERS: Assumes that there are no dangling pointers;
  (once-only (valueOrList)
    (let ((slot (KBCLASSES::get-slot slotName)))
      (cond
	((and (KBCLASSES::collection-p slot)
	      (KBCLASSES::one-way-inverse slot))
	 (cond
	   (single-valued-value
	    `(when ,valueOrList
		 (add-link ,slotName ,self ,valueOrList :old-value-is-null t)))
	   (t
	    `(loop for item in ,valueOrList
		  do (add-link ,slotName ,self item :old-value-is-null t)))))
	((KBCLASSES::collection-p slot)			; collection-slot without an inverse
	 (cond
	   (single-valued-value
	    `(addf (,slotName ,self) ,valueOrList))
	   (t
	    `(cond
	       ((null (,slotName ,self))
		(setf (,slotName ,self) ,valueOrList)) 
	       (t
		(loop for item in ,valueOrList
		     do (addf (,slotName ,self) item)))))))
	((KBCLASSES::one-way-inverse slot)			; single-valued with inverse, check for nil
	 `(when ,valueOrList
	      (add-link ,slotName ,self ,valueOrList :old-value-is-null t)))
	(t					; single-valued, no inverse
	 `(setf (,slotName ,self) ,valueOrList))) )))

(defmacro empty-slot (slotName self)
  ;; Expand into a form which deletes all links between "self" and
  ;;    each of the members of "(slotName self)";
  ;; Assumes that if the slot indicated by "slotName" is
  ;;    collection-valued, then it must have an inverse;
  ;; NOT FOR BEGINNERS: Assumes that there are no dangling pointers;
  (let* ((slot (KBCLASSES::get-slot slotName))
	 inverseSlot)
    (cond
      ((KBCLASSES::collection-p slot)
       (setq inverseSlot (KBCLASSES::forcing-one-way-inverse slot))
       (cond ((KBCLASSES::collection-p inverseSlot)                               
	      `(progn                                                   
		 (loop for value in (,slotName ,self)                    
		      do (delf (,(KBCLASSES::name inverseSlot) value) ,self))  
		 (setf (,slotName ,self) nil)))                     
	     (t                                                         
	      `(progn                                                   
		 (loop for value in (,slotName ,self)                    
		      do (setf (,(KBCLASSES::name inverseSlot) value) nil))    
		 (setf (,slotName ,self) nil)))))                   
      ((KBCLASSES::one-way-inverse slot)			; single-valued with inverse
       `(let ((value (,slotName ,self)))
	  (when value
	      (del-link ,slotName ,self value))))
      (t					; single-valued, no inverse
       `(setf (,slotName ,self) nil))) ))

;;; These macros fill in restrictions and computed-features slots;

(defmacro single-value-fill-restrictions (slotName self value)
  ;; Expand into a form which fills-in a restrictions, implied-restrictions,
  ;;    or default-features slot;
  (let ((dependOnName
	  (case slotName
	    (restrictions 'depend-ons)
	    ((implied-restrictions default-features)
	     'non-tbox-depend-ons))))
    `(progn
       (addf (,slotName ,self) ,value)
       (fill-slot ,dependOnName
		  ,self (relation ,value) :single-valued-value t)
       (fill-slot ,dependOnName
		  ,self (collect-embedded-concepts 
			  (value-restriction ,value)))) ))

(defun collect-embedded-concepts (expression)
  ;; Called by "single-value-fill-restrictions" to scan source descriptions
  ;;    of features;
  ;; Return a list of concepts found in "expression";
  (let (result)
    (labels ((help-collect-concepts
	       (expression) 
	       (cond
		 ((consp expression)
		  (loop for item in expression
		       do (collect-embedded-concepts item)))
		 ((typep expression 'TBOX-CONCEPT)
		  (pushnew expression result))
		 (t nil))))
      (help-collect-concepts expression)
      result )))

;;; The functions "fill-implied-domain" and "fill-implied-range"
;;;    are special because they must handle the case of multiple
;;;    assignments to a single-valued slot (this may occur during a merge
;;;    of two concepts

(defun fill-implied-domain (self value)
  ;; To permit merging of implied-domains, we create a list
  ;;    if more than one domain is specified;
  (let ((oldValue (implied-domain self)))
    (cond
     ((null oldValue)
      (setf (implied-domain self) value)
      (when value
        (add-non-tbox-depend-ons-link self value)))
     ((consp oldValue)
      (unless (member value oldValue)
        (setf (implied-domain self) (cons value oldValue))
        (when value
          (add-non-tbox-depend-ons-link self value))))
     ((neq oldValue value)
      (empty-slot implied-domain self)
      (setf (implied-domain self) (list value oldValue))
      (add-non-tbox-depend-ons-link self oldValue)
      (when value
        (add-non-tbox-depend-ons-link self value)))) ))

(defun fill-implied-range (self value)
  ;; To permit merging of implied-ranges, we create a list
  ;;    if more than one range is specified;
  (let ((oldValue (implied-range self)))
    (cond
     ((null oldValue)
      (setf (implied-range self) value)
      (when value
        (add-non-tbox-depend-ons-link self value)))
     ((consp oldValue)
      (unless (member value oldValue)
        (setf (implied-range self) (cons value oldValue))
        (when value
          (add-non-tbox-depend-ons-link self value))))
     ((neq oldValue value)
      (empty-slot implied-range self)
      (setf (implied-range self) (list value oldValue))
      (add-non-tbox-depend-ons-link self oldValue)
      (when value
        (add-non-tbox-depend-ons-link self value)))) ))

(defun remove-dependency-links (concept features tbox/non-tbox)
  ;; "features" are attached to "concept";
  ;; If the features are classified, then concept must have been
  ;;    conditioned, in which case the features have back-links to
  ;;    "concept", which we now remove;
  (let ((firstFeature (car features)))
    (when (and firstFeature
	       (not (consp firstFeature))
	       (classified-p firstFeature))
      (case tbox/non-tbox
	(:tbox (loop for p in features
		    do (delf (dependents p) concept)))
	(:non-tbox (loop for p in features
			do (delf (non-tbox-dependents p) concept))))) ))


  ;;
;;;;;; Reinitialization and Reclaimation Methods
  ;;


;;; Here we factor out the bodies of the reinitialization methods so
;;;    that we avoid the overhead of "call-next-method":

#+CLTL2 (declaim (inline help-reinit-CLASSIFIABLE-OBJECT))
#-CLTL2 (proclaim '(inline help-reinit-CLASSIFIABLE-OBJECT))
(defun help-reinit-CLASSIFIABLE-OBJECT (self)
  ;; For classifiable objects, we zero out all slots but
  ;;    "dependents", "non-tbox-dependents", "source-definitions",
  ;;     and "name";
  ;; Note, we assume that certain slots ("super-concepts", "sub-concepts",
  ;;    non-defined "inverse" links) have already
  ;;    been cleared during unclassification;
  (setf (search-nodes self) nil)
  (verify-empty-slot-values self))

(defun help-reinit-CONCEPT (self)
  ;; Locally, remove links before things get zero'd out;
  ;; (Assumes that "super-concept" links have been removed by "unclassify-one-concept",
  ;;    i.e., "reinitialize-classifiable-object" can't be used to unclassify a concept);
  (empty-concept self :primitive
		 :depend-ons :non-tbox-depend-ons :conjuncts
		 :parsed-expressions
		 :disjuncts :negated-concepts :defined-as
		 :computed-features :implied-computed-features
		 :characteristics :system-characteristics
		 :partitions)
  (setf (auxiliary-lambda-predicate self) nil)
  (setf (auxiliary-lambda-function self) nil)
  (setf (disjunctive-features self) nil)
  (setf (primitive-concepts self) nil)
  (when (concept-p self)
    (setf (backward-chaining-p self) nil))
  (setf (pure-conjunction-p self) nil)
  (when (boundp 'LOOM::BUILT-IN-THEORY^INCOHERENCE-REASON)
    (fclear-value self (loom-constant INCOHERENCE-REASON)))
  (help-reinit-CLASSIFIABLE-OBJECT self) )

(defmethod reinitialize-classifiable-object ((self CLASSIFIABLE-OBJECT))
  ;; Reinitialization clears out most of the slots values in an object;
  (help-reinit-CLASSIFIABLE-OBJECT self) )
 
(defmethod reinitialize-classifiable-object ((self UNARY-ENTITY))
  ;; Reinitialize any computed-features and restrictions which
  ;;    are unclassified;
  ;; Remove links between "self" and other network objects;
  ;; TO DO: MAKE SURE THAT FEATURES WITH NO DEPENDENTS GET
  ;;    RECLAIMED;

  ;; reinitialize any unclassified features with less than
  ;;    two dependents (since all features found have "self"
  ;;    for a dependent):
  (map-slots-macro
    self
    (restrictions comparisons
		  computed-features implied-computed-features
		  implied-restrictions implied-comparisons 
		  default-features)
    (lambda (feature)
      (when (and (not (consp feature))
		 (not (classified-p feature))
		 (loop for dep in (dependents feature)                    
		      always (eq dep self))                          
		 (loop for dep in (non-tbox-dependents feature)           
		      always (eq dep self)))                         
	(reinitialize-classifiable-object feature))))
  (empty-concept self
		 :restrictions :comparisons :set-feature
		 :implied-restrictions :implied-comparisons 
		 :default-concepts :default-features
		 :consequents)
  (clear-disjointness-caches self)
  (help-reinit-CONCEPT self) )

(defmethod reinitialize-classifiable-object ((self UNARY-CONCEPT))
  (empty-concept self :mixin-classes :mixin-slots :role-cache)
  (call-next-method) )

(defmethod reinitialize-classifiable-object ((self UNARY-RELATION))
  (empty-concept self :implied-domain)
  (call-next-method) )

(defmethod reinitialize-classifiable-object ((self REIFIED-RELATION))
  (empty-concept self :relation-of)
  (call-next-method) )

(defmethod reinitialize-classifiable-object ((self BINARY-RELATION))
  ;; Remove links between "self" and other network objects;
  ;; Note: The slots "strict-fllers-table" and "default-fillers-table"
  ;;    are deliberately left untouched;
  (empty-concept self
		 :defined-domain :defined-range
		 :inverse :components
		 :implied-domain :implied-range :arity :antecedents
		 :inheritance-link :inheritance-method)
  (setf (base-relations self) nil)
  (setf (auxiliary-lambda-function self) nil)
  (setf (auxiliary-lambda-predicate self) nil)
  (setf (more-restrictive-defined-domain self) nil)
  (setf (more-restrictive-defined-range self) nil)
  (help-reinit-CONCEPT self) )

(defmethod reinitialize-classifiable-object ((self N-ARY-RELATION))
  ;; Remove links between "self" and other network objects;
  (empty-concept self :implied-domains :implied-range :arity)
  (change-class self 'BINARY-RELATION)
  (help-reinit-CONCEPT self) )

(defmethod reinitialize-classifiable-object ((self RESTRICTION-FEATURE))
  ;; Remove links between "self" and other network objects;
  ;; Detach from (tbox) dependents (who will soon be revising themselves);
  ;; Note: We assume that 
  (empty-concept self :relation :qualification)
  (when (eq (feature-type self) :value-restriction)
    (empty-concept self :value-restriction))
  (setf (feature-type self) nil)
  (loop for dep in (dependents self)
       do (delf (restrictions dep) self))
  (setf (dependents self) nil) 
  (help-reinit-CLASSIFIABLE-OBJECT self) )

(defmethod reinitialize-classifiable-object ((self COMPARISON-FEATURE))
  ;; Remove links between "self" and other network objects;
  (empty-concept self :relationship :roles)
  (setf (feature-type self) nil)
  (loop for dep in (dependents self)
       do (delf (comparisons dep) self))
  (setf (dependents self) nil)
  (help-reinit-CLASSIFIABLE-OBJECT self) )

(defmethod reinitialize-classifiable-object ((self REIFIED-COMPARISON-FEATURE))
  ;; Remove links between "self" and other network objects;
  (empty-concept self :relationship :co-references)
  (setf (feature-type self) nil)
  (loop for dep in (dependents self)
       do (delf (comparisons dep) self))
  (setf (dependents self) nil)
  (help-reinit-CLASSIFIABLE-OBJECT self) )

(defmethod reinitialize-classifiable-object ((self COMPUTED-FEATURE))
  ;; Remove links between "self" and other network objects;
  (empty-concept self :concept-references)
  (setf (source-predicate self) nil)
  (setf (source-function self) nil)
  (setf (compiled-predicate self) nil)
  (setf (parameters&body self) nil)
  (setf (context-of-feature self) nil)
  (loop for dep in (dependents self)
       do (delf (computed-features dep) self))
  (setf (dependents self) nil)
  ;; because non-tbox dependents don't depend on references inside
  ;;    of a :satisfies (i.e., because they don't redundantly depend
  ;;    on the depend-ons of a computed feature), we clear out
  ;;    non-tbox dependents here:
  (loop for dep in (non-tbox-dependents self)	; RMM 5/1/90
       do (delf (implied-computed-features dep) self))
  (setf (non-tbox-dependents self) nil)
  (help-reinit-CLASSIFIABLE-OBJECT self) )

(defmethod reinitialize-classifiable-object ((self SET-FEATURE))
  ;; Remove links between "self" and other network objects;
  (declare (inline help-reinit-CLASSIFIABLE-OBJECT))
  (empty-concept self :defining-concept)
  (setf (base-set self) nil)
  (help-reinit-CLASSIFIABLE-OBJECT self) )

(defun verify-empty-slot-values (self)
  ;; Called by "reinitialize-classifiable-object";
  ;; Verify that all object-valued slots of "self" are empty;
  ;; If not, print a warning message;
  (let (badSlots slotValue)
    (setq badSlots
	  (loop for slot in (KBCLASSES::slots (KBCLASSES::class-of self))
	        when (and (and (member (KBCLASSES::allocation slot)
                                       '(instance dynamic))
                               (not (KBCLASSES::do-not-reinitialize slot))
                               (setq slotValue 
                                     (slot-value self (KBCLASSES::name slot)))
                               (or (typep slotValue 'LOOM-OBJECT)
                                   (and (consp slotValue)
                                        (typep (first slotValue) 'LOOM-OBJECT)))
                               (not (member (KBCLASSES::name slot)
					    '( dependents non-tbox-dependents
					       previous-instance previous-index)))
                               (not (member (KBCLASSES::domain slot)
					    (list (KBCLASSES::get-class 'BASIC-INSTANCE)
						  (KBCLASSES::get-class 'DB-INSTANCE)))))
                          (slot-value self (KBCLASSES::name slot)))
               collect slot))
    (when badSlots
      (trace-values "verify-empty-slot-values: non-zero'd values"
		    badSlots self)) ))

(defmethod reclaim-classifiable-object (self)
  ;; Unlink "self" from all other objects, and clear out all slots, so
  ;;    that "self" can be recycled;
  (reinitialize-classifiable-object self)
  (unlink-classifiable-object self) )

(defmethod reclaim-classifiable-object ((self TBOX-CONCEPT))
  ;; Unlink "self" from all other objects, and clear out all slots, so
  ;;    that "self" can be recycled;
  ;; Add :garbage-concept to "(system-attributes self)";
  ;; CAUTION: If "self" is marked :discarded-by-merge, we must preserve
  ;;    the merged-into pointer, and cannot safely reclaim "self" until after
  ;;    all concepts have been classified;
  (let ((discardedByMergeP (member :discarded-by-merge (system-attributes self)))
	(mergedIntoPointer (merged-into-concept self)))	; aliases "primitive-concepts"
    (reinitialize-classifiable-object self)
    (unlink-classifiable-object self)
    (clear-partition-memberships self)
    ;; mark as garbage AFTER clearing out attributes
    (push :garbage-concept (system-attributes self))
    (when (and discardedByMergeP mergedIntoPointer)
      (push :discarded-by-merge (system-attributes self))
      (setf (primitive-concepts self) mergedIntoPointer)
      ;; help concepts pointing to "self" know when its time to classify:
      (setf (classified-p self) (classified-p mergedIntoPointer))
      (push self *list-of-discarded-by-merge-concepts*)) ))

(defmethod reclaim-classifiable-object((self UNARY-CONCEPT))
  ;; Destroy index to CLOS instances, and then do other reclaimation
  ;;     common to concepts and relations;
  (unlink-clos-class-from-concept self)
  (setf (local-instances self) nil)
  (call-next-method) )

(defun unlink-classifiable-object (self)
  ;; Called by "reclaim-classifiable-object";
  ;; Remove all links between "self" and other network objects, so
  ;;    that "self" can be garbage-collected;
  ;; Strategy:
  ;;    "reinitialize-classifiable-object" eliminates all references except
  ;;    those in slots marked "do-not-reinitialize"; we remove all
  ;;    links except for "dependents" and "non-tbox-dependents", which we assume
  ;;    get removed when reclaimation deletes links "at the other end";
  ;; Additional work when "self" is a concept:
  ;;    Clear source definitions and disjoint convering memberships;
  ;;    Destroy dependent productions;
  ;;    Unintern "self" from the :concepts or :relations partition;
  ;;    Unintern "self" from the :instances partition;    
  ;; Note: The only members of the slots "covering-memberships" and
  ;;    "disjoint-covering-memberships" are those which were directly
  ;;    defined, rather than inherited;
  (loop for sub in (sub-concepts self)
        do (del-link super-concepts sub self))
  (when (typep self 'TBOX-CONCEPT)
    (setf (source-definitions self) nil)
    ;; REVIEW THIS SOMETIME:
    (setf (disjoint-covering-memberships self) nil)
    (when (context self)
      (unintern-concept self :being-discarded-p t))
    ;; make sure the concept-as-instance is deleted, but don't discard
    ;;    it because it might have dependents:
    (forget-all-about self :dont-unintern-p t)
    (unintern-object self :instances nil))
   (when (null (dependents self))
    (discard-instance self)) )

(defmethod discard-instance ((self CLASSIFIABLE-OBJECT))
  ;; Mark "self" as :discarded;
  (integrity-check (null (dependents self)))
  (set-bit-flags (tbox-flag self) :tbox-flag :discarded) )

(defmethod discard-instance ((self TBOX-CONCEPT))
  ;; Called by "unlink-classifiable-object", "classify&complete-all-concepts",
  ;;    and "define-concept--internal";
  ;; Note: the "merged-into-concepts" slot is only used while a concept is being
  ;;   classified.  By the time a concept reaches the exit point of "redefine-concept"
  ;;    or "define-concept--internal", the slot is no longer needed;
  (declare (special *conceptBeingDefined*))
  (call-next-method)
  ;; nullify slots that can't get cleared sooner:
  (unless (and (boundp '*conceptBeingDefined*)
               (eq self *conceptBeingDefined*))
    (setf (merged-into-concept self) nil)) )

(defmethod discarded-p ((self CLASSIFIABLE-OBJECT))
  (test-bit-flags (tbox-flag self) :tbox-flag :discarded) )
