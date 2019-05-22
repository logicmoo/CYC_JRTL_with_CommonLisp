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

;;; GENERATE.LISP (TBOX)

;;; This file contains code for generating defconcepts, defrelations, etc.,
;;;    from Loom objects

(in-package "LOOM")

;(export '())


  ;;
;;;;;; "generate-source-definition" and "generate-defining-expression"
  ;;

;;; This function just sticks the class's "def-name" on the front
;;;    of the original definition(s);  The remaining functions
;;;    generate the definition based on the current slot values
;;;    of "self":

(defmethod generate-source-definition ((self TBOX-CONCEPT) &key source-context list-p)
  ;; Return the original definition of "self", or a list of them, or
  ;;    compute a definition if "self" has no source definition;
  ;; Return only the definitions that belong to "source-context";
  ;; If "list-p" return a list of definitions;
  (let ((sourceDefinitions
         (loop for def in (source-definitions self)
               when (or (null source-context)
                        (defined-in-context-p (first def) self source-context))
               collect
               (let* ((defBody (copy-list (cdr def)))	; Copy for destructive operation; tar 8/3/92
                      (defn (or (get&remf defBody :is)
                                (get&remf defBody :is-primitive))))
                 (if (and (consp defn)
                          (eq (first defn) :reification))
                   `(,(first def)
                     ,(if (primitive-p self) :is-primitive :is)
                     ,(second defn) ,@defBody)
                   def))))
        generatedDefinition)
    (cond
     ((or (rest sourceDefinitions)
          list-p)
      (loop for def in sourceDefinitions
            collect (construct-concept-definition
                     self (first def) (rest def)
                     :include-documentation-p t)))
     (sourceDefinitions
      (construct-concept-definition
       self (first (first sourceDefinitions))
       (rest (first sourceDefinitions))
       :include-documentation-p t))
     (t (setq generatedDefinition (generate-concept-definition self))
        (when (defined-in-context-p (car generatedDefinition) self source-context)
          sourceDefinitions))) ))

(defmethod generate-source-definition ((self PROPOSITION) &key source-context list-p)
  ;; Return the original definition of "self", or a list of them, or
  ;;    compute a definition if "self" has no source definition;
  ;; Return only the definitions that belong to "source-context";
  ;; If "list-p" return a list of definitions;
  (declare (ignore source-context))
  (let ((defn `(,(proposition-operator self)
		,@(loop for arg in (proposition-arguments self)
		      collect (generate-external-reference arg)))))
    (cond ((null (proposition-operator self)) nil)
	  (list-p (list defn))
	  (t defn)) ))

(defun defined-in-context-p (name concept context)
  ;; Helping function for "generate-source-definition";
  ;; Return t if the definition of the concept with name "name" that
  ;;    is (or merged with) "concept" was defined in the context "context";
  (when (eq name (caar (source-definitions concept)))
    (return-from defined-in-context-p
      (eq (context concept) *context*)))
  (let ((metaType (if (concept-p concept) :concept :relation)))
    (flet ((visible-in-context-p (aContext)
             (case metaType
               (:concept (get-concept name :context aContext :no-error-p t))
               (otherwise (get-relation name :context aContext :no-error-p t)))))
      (and (visible-in-context-p context)
           (loop for parent in (parent-contexts context)
                 never (visible-in-context-p parent))) )))

(defun get-defining-expression (self)
  ;; Return a description representing the defining expression for "self";
  (let ((*dontSuppressNonLegalClausesP* nil)
	(*forceNamingOfUnnamedConcepts* nil)
	(*dontSubstituteNamesP* nil))
    (declare (special *dontSuppressNonLegalClausesP* 
		      *forceNamingOfUnnamedConcepts* *dontSubstituteNamesP*))
    (generate-defining-expression self) ))

(defmethod generate-defining-expression (self)
  ;; Return an expression that defines "self";
  ;; The default method assumes that the method
  ;;    "generate-definition-clauses" has been defined for "self";
  (declare (special *expandSystemDefinedConceptsP*))
  (let ((definingExpression
	  (if (or (classified-p self)
		  (member :being-classified (system-attributes self)))
	      (generate-conjoined-clauses
               (bag-append
		(generate-definition-clauses self)
                (generate-negated-clauses self)))
	      (generate-dereferenced-expression 
		(getf (parsed-expressions self) :definition)))))
    (if (boundp '*expandSystemDefinedConceptsP*)
	(simplify-defining-expression definingExpression)
	definingExpression) ))

(defun simplify-defining-expression (definingExpression)
  ;; Helping function for "generate-defining-expression";
  ;; Return a simplified "definingExpression" in which embedded 
  ;;    :ANDs and :ORs have been absorbed and duplicate concept 
  ;;    references have been removed; 
  (labels ((simplify-expression (expr)
             (cond
	      ((atom expr) expr)
	      ((member (first expr) '(:filled-by :not-filled-by))
	       expr)
	      (t
	       (let* ((operator (car expr))
		      (simplifiedExpr
		       `(,operator
		         ,@(loop for clause in (cdr expr) 
			         collect (simplify-expression clause)))))
	         (if (member operator '(:and :or))
		   (simplify-connective-expression simplifiedExpr)
		   simplifiedExpr)))))
           (simplify-connective-expression (expr)
             (let* ((operator (car expr))
	            (result (loop for clause in (cdr expr)
			          when (and (consp clause)
				            (eq (car clause) operator))
			          append (cdr clause)
			          else collect clause)))
	       (if (null (cdr result))
	         (car result)
	         `(,operator 
	           ,@(remove-duplicates result :test #'filler-equal))))))
    (simplify-expression definingExpression) ))


  ;;
;;;;;; Generate Concept Definitions
  ;;

(defmethod generate-object-definition ((self TBOX-CONCEPT) &key augment-p)
  ;; Generate a definition for the concept "self";
  (generate-concept-definition self :augment-p augment-p) )

(defun generate-concept-definition (self &key augment-p definition-only-p)
  ;; Generate a definition for the concept "self" which is LEGAL
  ;;    in the sense that it can be parsed successfully;
  (if definition-only-p
    (get-defining-expression self)
    (construct-concept-definition
     self (name self)
     (generate-definition-body self :augment-p augment-p)
     :include-documentation-p t)) )

(defun construct-concept-definition
       (self name definitionBody &key include-documentation-p )
  ;; Return a definition for "self" of the form 
  ;;    "(defxxx <name> <docstring> <body>)";
  (let ((defsymbol
          (etypecase self
            (UNARY-CONCEPT
             (cond
              ((member :base-set (attributes self)) 'defset)
              ((member :reified (attributes self)) 'defreified-relation)
              (t 'defconcept)))
            (UNARY-RELATION 'defproperty)
            (TBOX-RELATION 'defrelation)))
        (nonRedundantIdentifierClause
         (and (null (getf definitionBody :identifier))
              (generate-identifier-clause self))))
    `(,defsymbol
      ,name
      ,@(when include-documentation-p
          (list-of (case (concept-or-relation self)
                     (:concept (documentation name 'type))
                     (:relation (documentation name 'variable)))))
      ,@definitionBody
      ,@nonRedundantIdentifierClause) ))
      
(defun generate-definition-body (self &key augment-p name-depend-ons-p)
  ;; Generate the body of a definition for the concept "self" which is LEGAL
  ;;    in the sense that it can be parsed successfully;
  ;; Note: *dontSubstituteNamesP* is true if the generate places
  ;;    objects rather than names in expanded concept defintions;
  (let ((*dontSuppressNonLegalClausesP* augment-p)
	(*forceNamingOfUnnamedConcepts* name-depend-ons-p)
        (*expandSystemDefinedConceptsP* (not name-depend-ons-p))        ;  TAR 12/13/93
	(*dontSubstituteNamesP* nil))
    (declare (special *dontSuppressNonLegalClausesP* 
		      *forceNamingOfUnnamedConcepts* 
                      *expandSystemDefinedConceptsP*
                      *dontSubstituteNamesP*))
    (help-generate-concept-definition self)) )

(defun generate-expression (self context)
  ;; Return an expression representing either the constraint, default
  ;; or antecedent expression for "self", as indicated by "context";
  ;; TO DO: CONSIDER UPGRADING THIS TO WORK FOR DEFINITIONS AS WELL;
  (if (completed-p self)
      (generate-conjoined-clauses
	(case context
	  (:implies (generate-constraint-clauses self))
	  (:defaults (generate-default-clauses self))
	  (:antecedents (generate-antecedents-clause self))))
      (generate-dereferenced-expression 
	(getf (parsed-expressions self) context))) )

(defun generate-external-reference (self)
  ;; Return the name of "self", or its definition if it has a system-defined
  ;;    name;
  ;; Called by warning routines;
  (let ((*dontSubstituteNamesP* nil)
	(*forceNamingOfUnnamedConcepts* nil)
	(*expandSystemDefinedConceptsP* t))
    (declare (special *dontSubstituteNamesP* *forceNamingOfUnnamedConcepts* 
		      *expandSystemDefinedConceptsP*))
    (generate-reference-definition self) ))

;;; The remaining functions synthesize a concept definition from the
;;;    slot values of a concept, i.e., if it has been conditioned, then
;;;    the definition generated will reflect that conditioning

  ;;
;;;;;; Generator for Unary Concepts
  ;;

(defmethod help-generate-concept-definition ((self UNARY-CONCEPT))
  ;; Return an s-expression which defines the UNARY-CONCEPT "self";
  ;; Note:  If "self" is classified, we generate the :specializes elements
  ;;    from the slot "super-concepts" rather than "conjuncts"
    `(,(if (primitive-p self) :is-primitive :is)
      ,(generate-defining-expression self)
      ,@(generate-role-clauses self)
      ,@(generate-expression-clause self :implies)
      ,@(generate-expression-clause self :defaults)
      ,@(generate-common-clauses self)
      ,@(generate-keys&indices-clauses self)
      ,@(generate-mixin-clauses self)) )

(defmethod help-generate-concept-definition ((self UNARY-RELATION))
  ;; Return an s-expression which defines the UNARY-RELATION "self";
  ;; Note:  If "self" is classified, we generate the :specializes elements
  ;;    from the slot "super-concepts" rather than "conjuncts"
  `(,(if (primitive-p self) :is-primitive :is)
     ,(generate-defining-expression self)
     ,@(let ((domain (implied-domain self)))
         (when (and domain (atom domain)
		    (neq domain *Thing*))
           `(:domain ,(generate-reference-definition domain))))
     ,@(generate-expression-clause self :implies)
     ,@(generate-expression-clause self :defaults)
     ,@(generate-common-clauses self)) )

(defun generate-expression-clause (self context)
  ;; Called by "help-generate-concept-definition";
  ;; Generate a list containing a :implies or :defaults clause or
  ;;    :antecedents clause, or nil if there are none;
  (let ((expression (generate-expression self context)))
    (when expression
      `(,context ,expression)) )) 

(defun generate-common-clauses (self)
  ;; Called by "help-generate-concept-definition";
  ;; Generate features that concepts, properties, and relations have
  ;;    in common;
  (declare (special *dontSuppressNonLegalClausesP*))
  `(,@(generate-characteristics-clause self)
    ,@(generate-covering-clauses (disjoint-coverings self) :disjoint-covering)
    ,@(generate-partitions-clause (partitions self))
    ,@(generate-partitions-clause (partitions self) :exhaustive-p t)
    ,@(generate-partition-membership-clauses self (partition-memberships self))
    ,@(generate-annotations-clause self)
    ,@(generate-auxiliary-clauses self)
    ,@(when (and (system-attributes self) *dontSuppressNonLegalClausesP*)
        `(:system-characteristics ,(system-attributes self)))
    ,@(generate-identifier-clause self)
    ,@(when (and (neq (context self) *context*)
                 (context self))
        `(:context ,(name (context self))))) )

(defun generate-identifier-clause (self)
  ;; Return a list containing "(:identifier xxx)" or nil if "self" has
  ;;    none (other than one matching its name);
  (when (typep self 'REIFIED-RELATION)          ;  TAR 1/14/94 ; No identifiers
    (return-from generate-identifier-clause nil))       ; Éfor reified relations
  (let ((identifier
         (or (getf (cdar (source-definitions self)) :identifier)
             (and (neq (identifier self) (name self))
                  (identifier self)))))
    (when identifier
      `(:identifier ,identifier)) ))

(defmethod generate-definition-clauses ((self UNARY-ENTITY))
  ;; Return a list of concept and feature definitions comprising the TBox
  ;;    definition for "self";
  (declare (special *dontSuppressNonLegalClausesP*))
  (let ((superConceptNames
	  (generate-multiple-reference-definitions
	    (if (and (boundp '*dontSuppressNonLegalClausesP*)
		     *dontSuppressNonLegalClausesP* 
		     (classified-p self)
		     (not (primitive-p self)))
		(super-concepts self)
	      (conjuncts self))))
	setDefinition algebraic-definition)
    (when (defined-as self)
      (setq algebraic-definition (generate-algebraic-definition self))
      (if (equal algebraic-definition '(:one-of ':infinite-set))
	  (return-from generate-definition-clauses
	    superConceptNames)
	;; create a list to make "generate-defining-expression" happy:
	(return-from generate-definition-clauses
	  (bag-append
	   (when (neq (defined-as self) :disjunction)
	     superConceptNames)
	   (list algebraic-definition)))))
    (when (defined-set-feature self)
      (setq setDefinition (generate-set-definition (defined-set-feature self))))
    (append 
      superConceptNames
      (unless (or (null setDefinition)
		  (equal setDefinition '(:one-of ':infinite-set)))
	(list setDefinition))
      (generate-list-of-restrictions (restrictions self))
      ;; For properties:     ; TAR 7/6/99
      (generate-single-reference-clause (defined-domain self) :domain)
      (loop for cmp in (comparisons self)
	   collect (generate-comparison-clause cmp))
      (loop for ftr in (computed-features self)
	   collect (generate-computed-feature-clause ftr))) ))

(defun generate-algebraic-definition (self)
  ;; Return an expression equivalent to "expression" for which pointers to
  ;;    concepts have been replaced by equivalent expressions (e.g., the
  ;;    names of the concepts).
  (declare (special *dontSuppressNonLegalClausesP*))
  (case (defined-as self)
    (:disjunction
     `(:or ,@(generate-multiple-reference-definitions
	       (disjuncts self))))    
    (:set
       (when (defined-set-feature self) ;; guard against printing uncompleted concepts;
	 (generate-set-definition (defined-set-feature self))))
    (otherwise
     (complain "~&Warning: ~a defined as unknown type: ~a"
	     self (defined-as self)))))

(defun generate-negated-clauses (self)
  ;; Return a list of clauses representing negations to the definition
  ;;    of "self";
  (loop for neg in (negated-concepts self)
        collect `(:not ,(generate-reference-definition neg))) )

(defmethod generate-constraint-clauses ((self UNARY-ENTITY))
  ;; Return a list of concept and feature definitions representing
  ;;    the constraints on "concept";
  ;; TO DO: CONSIDER GENERATING "implies" STATEMENTS IN PLACE OF 
  ;;    LISTING IMPLIED CONCEPTS WITHIN THE :implies CLAUSE;
  (declare (special *dontSuppressNonLegalClausesP*))
  (let ((otherDefs (generate-multiple-reference-definitions
		    (or (when (and (more-specific-consequent self)
				   *dontSuppressNonLegalClausesP*)
			  (list (more-specific-consequent self)))
			(consequents self)))))
    (union (loop for def in otherDefs
	       when (and (consp def) (eq (first def) :and))
	       append (rest def)
	       else collect def)
	   (append
	    (when (implied-set-feature self)
	      (list (generate-set-definition (implied-set-feature self))))
	    (generate-list-of-restrictions (implied-restrictions self))
	    (loop for cmp in (implied-comparisons self)
		collect (generate-comparison-clause cmp))
	    (loop for ftr in (implied-computed-features self)
		collect (generate-computed-feature-clause ftr)))
	   :test #'filler-equal) ))

(defmethod generate-default-clauses ((self UNARY-ENTITY))
  ;; Return a list of concept and feature definitions representing
  ;;    defaults for the concept "concept";
  (let (relationRef qualificationRef features)
    (loop for f in (default-features self)
	 do
	 (push
	   (if (typep f 'COMPARISON-FEATURE)
	       (generate-comparison-clause f)
	       (progn
		 (setq relationRef (generate-reference-definition (relation f)))
		 (setq qualificationRef
		       (when (qualification f)
			 (list (generate-reference-definition (qualification f)))))
		 (ecase (feature-type f)
		   (:value-restriction
		    `(:all ,relationRef 
			   ,(generate-reference-definition (value-restriction f))
			   ,@qualificationRef)) 
		   (:min-restriction
		    `(:at-least ,(lower-bound f) ,relationRef ,@qualificationRef))
		   (:max-restriction
		    `(:at-most ,(upper-bound f) ,relationRef ,@qualificationRef))
		   (:filled-by
		    `(:filled-by ,relationRef
			    ;,@(generate-instance-references (role-fillers f))
			     ,@(loop for i in (role-fillers f) collect (generate-filler i))
				 ))
		   (:not-filled-by
		    `(:not-filled-by ,relationRef
			  ;,@(generate-instance-references (non-role-fillers f))
			  ,@(loop for i in (non-role-fillers f) collect (generate-filler i))
				     )))))
	   features))
    (append
      (generate-multiple-reference-definitions (default-concepts self))
      features) ))

(defun generate-list-of-restrictions (restrictions)
  ;; Helping function for "UNARY-ENTITY.help-generate-concept-definition";
  ;; Return a list of feature definitions representing the restrictions
  ;;    in "restrictions";
  ;; Note: We go to elaborate lengths here to combine restrictions into
  ;;    concise definitions;
  ;; Note: When called from instances, the features will not have been
  ;;    combined, so we need to do combinations;
  (when (consp (car restrictions))
    ;; situation: source restrictions have been incorporated, but not yet
    ;;    replaced by classified features;  Return the list of souce restrictions:
    (return-from generate-list-of-restrictions restrictions))
  (let ((restrictionTable (group-restrictions-by-relation restrictions))
	result min max vr vrRef fillers nonFillers)
    (flet ((role-filler-is-derivable-p
	     (roleFiller)
	     ;; Return t if the restrictions "min" and "vr" imply the
	     ;;    role fillers restriction "roleFiller";
	     ;; Duplicate the test applied in "condition-set-value-restriction"
	     ;;    and "condition-implied-filled-by-features":
	     (let (members)
	       (and min vr
		    (typep vr 'SET-FEATURE)
		    (has-instance-p vr roleFiller)
		    (consp (setq members (members vr)))	; not infinite set
		    (null (cdr members))	; exactly one member
		    (atom (car members))))))	;    (its not a segment)
      ;; each entry in "restrictionTable" is a list containing a relation
      ;;    followed by one or more features that restrict that relation
      (loop for entry in restrictionTable
	   do
	   (let* ((relation (first entry))
		  (relationRef (generate-reference-definition relation))
		  (qual (second entry))
		  (qualRef (and qual
				(list (generate-reference-definition qual)))))
	     (setq min nil) (setq max nil) (setq vr nil) 
	     (setq fillers nil) (setq nonFillers nil)
	     (loop for res in (cddr entry)
		  do
		  (ecase (feature-type res)
		    (:value-restriction (setq vr (value-restriction res)))
		    (:min-restriction (setq min (lower-bound res)))
		    (:max-restriction (setq max (upper-bound res)))
		    (:filled-by (setq fillers (role-fillers res)))
		    (:not-filled-by (setq nonFillers (non-role-fillers res)))))
	     (when (symbolp max)		; convert INFINITY to NIL
	       (setq max nil))
	     (when vr
	       (setq vrRef (generate-reference-definition vr)))
	     (cond
	       ((and (eql min 1) (eql max 1) vr)
		(push `(:the ,relationRef ,vrRef ,@qualRef) result))
	       ((and min (eql min max))
		(push `(:exactly ,min ,relationRef ,@qualRef) result)
		(when vr (push `(:all ,relationRef, vrRef ,@qualRef) result)))
	       (t
		(when max (push `(:at-most ,max ,relationRef ,@qualRef) result))
		(when vr (push `(:all ,relationRef ,vrRef ,@qualRef) result))
		(when (and min (/= min 0))
		  (if (and (= min 1) qual)
		      (push `(:some ,relationRef ,@qualRef) result)
		      (push `(:at-least ,min ,relationRef ,@qualRef) result)))))
	     (when (and fillers
			(or (cdr fillers)
			    (not (role-filler-is-derivable-p (car fillers)))))
	       (push `(:fillers ,relationRef
				;,@(generate-instance-references fillers)
				,@(loop for i in fillers collect (generate-filler i))
				)
		     result)) 
	     (when  nonFillers
	       (push `(:not-filled-by
			,relationRef
			;,@(generate-instance-references nonFillers)
			,@(loop for i in nonFillers collect (generate-filler i))
			)
		     result))))
      result )))

(defun group-restrictions-by-relation (restrictions)
  ;; Helping function for "generate-list-of-restrictions";
  ;; Return a list of triples of the form
  ;;    <relation, qualification, list of restrictions>;
  (let (table entry relation qualification)
    (loop for res in restrictions
	 when (typep res 'RESTRICTION-FEATURE)
	 do
	 (setq relation (relation res))
	 (setq qualification (qualification res))
	 (setq entry
	       (loop for e in table 
                    when (and (eq (first e) relation)
			 (eq (second e) qualification))
                    return e))
	 (if entry
	     (push res (cddr entry))
	     (push (list relation qualification res) table)))
    table ))

(defun generate-comparison-clause (comparison)
  ;; Return a clause representing the feature "comparison";
  ;; Helping function for "UNARY-ENTITY.help-generate-concept-definition";
  (let ((relationshipName (name (relationship comparison)))
	(dontAbbreviateP nil)
	roleNames)
    (case (feature-type comparison)
      (:exists
       `(:exists ,relationshipName
		 ,@(loop for coref in (co-references comparison)
			collect
			`(,(first coref)
			  ,(generate-reference-definition (second coref))
			  ,(generate-reference-definition (third coref))))))
      (otherwise 
       (case relationshipName
	 (same-as
	  (setq relationshipName :same-as))
	 (subset
	  (setq relationshipName :subset))
	 ((< <= > >= /=)
	  nil)
	 (otherwise
	  (setq dontAbbreviateP t)))
       (setq roleNames
	     (loop for role in (roles comparison)
		  collect
		  (if (relation-p role)
		      (generate-reference-definition role)
		      role)))
       (if dontAbbreviateP
	   `(:relates ,relationshipName ,@roleNames)
	   `(,relationshipName ,@roleNames)))) ))

(defun generate-computed-feature-clause (feature)
  ;; Return a clause representing the computed feature "feature";
  ;; Helping function for "help-generate-concept-definition";
  (let ((parameters&body (parameters&body feature))
	(featureType (feature-type feature)))
    (case featureType
      ((:predicate :function)
       `(,featureType ,@parameters&body))
      (otherwise
       `(,featureType
	 ,@(generate-dereferenced-expression parameters&body)))) ))

(defun generate-covering-clauses (coverings keyword)
  ;; Return a list containing covering declarations, each
  ;;    prefaced by the keyword "keyword";
  (loop for membership in coverings
       append
       `(,keyword
	 ,(generate-multiple-reference-definitions (cdr membership)))) )

(defun generate-partitions-clause (partitions &key exhaustive-p)
  ;; Return a partition declaration corresponding to "partitions";
  ;; The declaration consists of the keyword :partitions (or 
  ;;    :exhaustive-partitions), followed by an expression or a 
  ;;    list of expressions;  
  ;; Each expression has the form (<part> (<mem>+)) where <part>
  ;;    is a partition name and <mem> is the name of a
  ;;    partition member;
  (let ((partitionExprs 
	  (loop for p in partitions
	       when (if (exhaustive-partition-p p) exhaustive-p (not exhaustive-p))
	       collect
	       (if (partition-members p)
		   (list (partition-name p)
			 (loop for c in (partition-members p)
			      collect (name c)))
		   (partition-name p)))))
    (when partitionExprs
      `(,(if exhaustive-p :exhaustive-partitions :partitions)
	,partitionExprs)) ))

(defun generate-partition-membership-clauses (self memberships)
  ;; Return a list of partition membership declarations corresponding
  ;;    to "memberships";
  ;; Each declaration has the form {:in-partition partitionName};
  ;; We need to check super concepts, which are only valid for
  ;;    classified objects!
  (unless (classified-p self)           ; tar 6/29/93
    (return-from generate-partition-membership-clauses nil))
  (loop for m in memberships
        unless (loop for parent in (super-concepts self)
		    thereis (assoc (car m) (partition-memberships parent)))
        append 
        (let* ((partitionOrName (car m))
	       (partitionName
		(if (symbolp partitionOrName)
                  partitionOrName
                  (partition-name partitionOrName))))
	  `(:in-partition ,partitionName))) )

(defun generate-role-clauses (self)
  ;; Return clauses for the keyword :roles followed by the names
  ;;    of roles and any role modifiers;
  (let* ((sourceP (consp (first (role-cache self))))
         (clauses         
          (loop for role in (role-cache self)
                collect
                (if sourceP
                  `(,(generate-reference-definition (first role))
                    ,@(rest role))
                  `(,(generate-reference-definition (relation role))
                    ,@(role-specification role))))))
    (generate-keyword&values clauses :roles) ))

(defun generate-keys&indices-clauses (self)
  ;; Return a list of clauses for the keywords :keys and :indices
  ;;    for the concept "self";
  (labels ((generate-embedded-references (value)
             (if (atom value)
               (generate-reference-definition value)
               (loop for item in value
                     collect (generate-embedded-references item)))))
    (let ((keysClause
           (generate-keyword&values
            (generate-embedded-references (keys self)) :keys))
          (indicesClause
           (generate-keyword&values
            (generate-embedded-references (query-index-roles self)) :indices)))
      (cond
       ((null keysClause) indicesClause)
       ((null indicesClause) keysClause)
       (t `(,@keysClause ,@indicesClause))) )))

(defun generate-mixin-clauses (self)
  ;; Return clauses for the keyword :mixin-classes followed by
  ;;    the names of the CLOS mixin classes of "self" and for the
  ;;    keyword :mixin-slots followed by a list of slot definitions;
  (let ((classesClause
         (generate-keyword&values 
          (mixin-classes self) :mixin-classes :atomize-singleton-list t))
        (slotsClause
         (generate-keyword&values (mixin-slots self) :mixin-slots)))
    (cond
     ((null classesClause) slotsClause)
     ((null slotsClause) classesClause)
     (t `(,@classesClause ,@slotsClause))) ))    

(defun generate-characteristics-clause (self)
  ;; Return a clause containing the keyword :characteristics followed by
  ;;    the attributes of "self";
  (let ((characteristics (attributes self)))
    ;; make derived :backward-chaining property explicit:
    (when (and (concept-p self)
	       (backward-chaining-p self))
      (pushnew :backward-chaining characteristics))
    ;; make derived :closed-world property explicit:
    (cond
      ((concept-is-closed-p self)
       (pushnew :closed-world characteristics))
      ((not (test-bit-flags (context-flag *context*) :context-flag :open-world))
       ;;was *global-closed-world-p*  ;TAR 6/11/96
       (pushnew :open-world characteristics)))      
    (generate-keyword&values
     characteristics :characteristics :atomize-singleton-list t)) )

(defun generate-annotations-clause (self)
  ;; Return a clause containing the keyword :characteristics followed by
  ;;    the attributes of "self";
  (declare (special *dontSuppressNonLegalClausesP*))
  (let ((annotations (generate-annotations-clause-with-objects
		      self :augment-p *dontSuppressNonLegalClausesP*)))
    (when annotations
      (list (first annotations)
	    (substitute-names-or-identifiers (second annotations)))) ))

(defun generate-auxiliary-clauses (self)
  ;; Return a list of clauses containing auxiliary :function 
  ;;    and/or :predicate lambda expressions;
  (let (result)
    (when (auxiliary-lambda-function self)
      (setf result
	    (append `(:function ,(auxiliary-lambda-function self)) result)))
    (when (auxiliary-lambda-predicate self)
      (setf result
	    (append `(:predicate ,(auxiliary-lambda-predicate self)) result)))
    result ))

(defun generate-annotations-clause-with-objects (self &key augment-p)
  ;; Called by "generate-annotations-clause" and "generate-frame-definition";
  ;; Return a list containing an :annotations clause for "self" that contains
  ;;    concept objects rather than their names;
  (let ((assertedConjuncts nil)
        (assertedRoleClauses nil)
        (sourceClauses nil))
    (if augment-p
      ;; generate from currently asserted or matched roles and conjuncts:
      (progn
        (setq assertedConjuncts 
              (remove-members '(CONCEPT RELATION PROPERTY META-THING) ; TAR 7/6/99
			      (dynamically-asserted-conjuncts self)
			      :key #'name))
        (setq assertedRoleClauses
              (generate-asserted-role-names&values self)))
      ;; generate from original source definition:
      (setq sourceClauses (collect-source-annotations self)))
    (when (or assertedConjuncts assertedRoleClauses sourceClauses)
      `(:annotations (,@assertedConjuncts
		      ,@assertedRoleClauses
                      ,@sourceClauses))) ))

(defmethod collect-source-annotations ((self TBOX-CONCEPT))
  ;; Return a list of all annotations attached to "self";
  (loop for defn in (source-definitions self)
        append (list-of (getf (cdr defn) :annotations))) )

(defmethod collect-source-annotations ((self ROLE))
  ;; Return a list of the facets attached to "self";
  (getf (role-specification self) :facets) )


  ;;
;;;;;; Generator for Relations
  ;;

(defmethod help-generate-concept-definition ((self BINARY-RELATION))
  ;; Return an s-expression which defines the binary relation "self";
  ;; Note:  If "self" is classified, we generate the :specializes elements
  ;;    from the slot "super-concepts" rather than "conjuncts";
  (declare (special *dontSuppressNonLegalClausesP*))
  `(,(if (primitive-p self) :is-primitive :is)
     ,(generate-defining-expression self)
     ,@(generate-domain&range-constraints self)
     ,@(generate-expression-clause self :implies)
     ,@(generate-common-clauses self)
     ,@(generate-expression-clause self :antecedents)
     ,@(when *dontSuppressNonLegalClausesP* 
         (when (and (inverse self) (neq (defined-as self) :inverse))
           `(:inverse ,(generate-reference-definition (inverse self))))
         )) )

(defmethod generate-definition-clauses ((self BINARY-RELATION))
  ;; Return a list of relation expressions comprising the TBox definition
  ;;    for "self";
  (declare (special *dontSuppressNonLegalClausesP*))
  (append
    (when (or (not (defined-as self))
	      *dontSuppressNonLegalClausesP*)
      (generate-multiple-reference-definitions
	(if (and *dontSuppressNonLegalClausesP* 	; bk 5/19/89
		 (classified-p self)
		 (not (primitive-p self)))
	    (super-concepts self)
	    (conjuncts self))))
    (when (defined-as self) 
      (ecase (defined-as self)
	(:inverse
	 (generate-single-reference-clause (inverse self) :inverse))
	(:composition
	 (generate-multiple-references-clause (components self) :composition))))
    (loop for ftr in (computed-features self)
	 collect (generate-computed-feature-clause ftr))
    (generate-single-reference-clause (defined-domain self) :domain)
    (generate-single-reference-clause (defined-range self) :range)) )

(defmethod generate-constraint-clauses ((self TBOX-RELATION))
  ;; Return a list of relation expressions representing
  ;;    the constraints on "self";
  ;; Note: (Single-valued) domain and range constraints appear in their
  ;;     own clauses instead of inside of a :implies clause;	   
  (append
    (loop for ftr in (implied-computed-features self)
	 collect (generate-computed-feature-clause ftr))
    (when (consp (implied-domain self))
      (generate-multiple-references-clause (implied-domain self) :domain))
    (when (consp (implied-range self))
      (generate-multiple-references-clause (implied-range self) :range))) )

(defun generate-domain&range-constraints (self)
  ;; Return a list containing any (single-valued) non-trivial domain or range
  ;;    constraints for the relation "self";
  (let ((domain (implied-domain self))
	(range (implied-range self)))
    `(,@(when (and domain (atom domain)
		 (neq domain *Thing*))
	    `(:domain ,(generate-reference-definition domain)))
      ,@(when (and range (atom range)
		 (neq range *Thing*))
	    `(:range ,(generate-reference-definition range)))) ))

(defun generate-antecedents-clause (self)
  ;; Return a list of clauses containing expressions for antecedents of "self",
  ;;    bound into a single expression by an :or;
  (let ((antecedents
	  (loop for ant in (antecedents self)
	       collect
	       (typecase ant
		 (COMPUTED-FEATURE (generate-computed-feature-clause ant))
		 (LIST (generate-dereferenced-expression ant))
		 (otherwise (generate-reference-definition ant))))))
    (if (cdr antecedents)
	`((:or ,@antecedents))
	antecedents)) )

(defmethod help-generate-concept-definition ((self N-ARY-RELATION))
  ;; Return an s-expression which defines the computed relation "self";
  ;; Note:  If "self" is classified, we generate the :specializes elements
  ;;    from the slot "super-concepts" rather than "conjuncts";
  (declare (special *dontSuppressNonLegalClausesP*)) 
  `(,(if (primitive-p self) :is-primitive :is)
     ,(generate-defining-expression self)
     ,@(when (primitive-p self)
         `(:arity ,(arity self)))
     ,@(generate-domain&range-constraints self)
     ,@(generate-expression-clause self :implies)
     ,@(generate-characteristics-clause self)
     ,@(generate-expression-clause self :antecedents)
     ,@(generate-annotations-clause self)
     ,@(generate-auxiliary-clauses self)
     ,@(when *dontSuppressNonLegalClausesP* 
         (generate-keyword&values
          (system-attributes self) :system-characteristics))) )

(defmethod generate-definition-clauses ((self N-ARY-RELATION))
  ;; Called by "generate-defining-expression";
  ;; Return a list of relation expressions;
  (declare (special *dontSuppressNonLegalClausesP*))
  (append
    (generate-multiple-reference-definitions
      (if (and *dontSuppressNonLegalClausesP* 
	       (classified-p self)
	       (not (primitive-p self)))
	  (super-concepts self)
	  (conjuncts self)))
    (loop for ftr in (computed-features self)
	 collect (generate-computed-feature-clause ftr))) )


  ;;
;;;;;; Utility functions used in concept generation
  ;;

(defun generate-conjoined-clauses (clauses)
  ;; Return "(car clauses)" if "clause" is a singleton list;
  ;; Otherwise, return (:and ,@clauses);
  (if (cdr clauses) `(:and ,@clauses) (car clauses)) )

(defmethod generate-reference-definition (self)
  ;; "self" is an unevalutated concept expression, e.g., a symbol or
  ;;    other constant; Let it pass through unchanged;
  self )

(defmethod generate-reference-definition ((self LIST))
  ;; "self" is a list; Let it pass through unchanged;
  self )

(defun dont-substitute-names-p ()
  ;; Return true if a special directive to generate s-expressions
  ;;    containing objects rather than symbols (identifiers/names)
  ;;    is in effect;
  (declare (special *dontSubstituteNamesP*))
  (and (boundp '*dontSubstituteNamesP*)
       *dontSubstituteNamesP*) )

(defmethod generate-reference-definition ((self TBOX-CONCEPT))
  ;; If "self" has a non-nil name, return that; otherwise
  ;;    generate its definition and return that;
  (declare (special *forceNamingOfUnnamedConcepts* *expandSystemDefinedConceptsP*))
  (when (dont-substitute-names-p)
    (return-from generate-reference-definition self))
  (cond
    ((and (boundp '*forceNamingOfUnnamedConcepts*)	; RMM 2/26/92
	  *forceNamingOfUnnamedConcepts*)
     (prog1
       (or (generate-context-compatible-reference self)
	   (name&intern-unnamed-concept self nil :force-naming-p t))
       (when (member :system-generated-name (system-attributes self))
	 (pushnew :name-is-referenced (system-attributes self)))))
    ((and (name self)
	  (or (not (system-defined-name-p self))
	      (not (boundp '*expandSystemDefinedConceptsP*))))
     (generate-context-compatible-reference self))
    (t
     (generate-concept-definition self :definition-only-p t))) )

(defmethod generate-reference-definition ((self SET-FEATURE))
  ;; Generate the definition of the set "self";
  (when (dont-substitute-names-p)
    (return-from generate-reference-definition self))
  (generate-set-definition self) )

(defmethod generate-reference-definition ((self CONTEXT))
  ;; Generate a reference to "self";
  (when (dont-substitute-names-p)
    (return-from generate-reference-definition self))
  `(the-context ',(name self)))

(defmethod generate-reference-definition ((self COMPUTED-FEATURE))
  ;; Generate the definition of the set "self";
  (when (dont-substitute-names-p)
    (return-from generate-reference-definition self))
  (generate-computed-feature-clause self) )

(defmethod generate-reference-definition ((self DB-INSTANCE))
  ;; Generate the identifier of the instance "self";
  (when (dont-substitute-names-p)
    (return-from generate-reference-definition self))
  (identifier self) )

(defmethod generate-reference-definition ((self INSTANCE-IN-CONTEXT)) ; TAR 10/25/96
  ;; Generate the identifier of the instance "self";
  (when (dont-substitute-names-p)
    (return-from generate-reference-definition self))
  (identifier self) )

(defun generate-multiple-reference-definitions (listOfReferences)
  ;; "listOfReferences" contains a list of concept references;
  ;; Return a list of definitions for those references; 
  (when (dont-substitute-names-p)
    (return-from generate-multiple-reference-definitions listOfReferences))
  (loop for ref in listOfReferences
       collect (generate-reference-definition ref)) )

(defun generate-context-compatible-reference (self)
  ;; Return an extended identifier for "self" if "self" is not in the 
  ;;    current context;
  (if (or (eq (context self) *context*)
	  ;; shouldn't be null, but if "self" is in a very early stage of
	  ;;    parsing, maybe it is null:
	  (null (context self)))
      (name self)
      (generate-extended-identifier (name self) (context self))))

(defun generate-keyword&values (values keyword &key atomize-singleton-list)
  ;; Return a list containing a clause prefaced by "keyword", and having
  ;;    as arguments the list "values", or nil if "values" is nil;
  (when values
    (when (and (null (cdr values)) atomize-singleton-list)
	(setq values (car values)))
    `(,keyword ,values)) )

(defun generate-keyword (predicate keyword)
  ;; Return a list containing "keyword" if "predicate" is non-nil;
  (when predicate
      `(,keyword)) )

(defun generate-single-reference-clause (reference keyword)
  ;; Return a list containing a clause prefaced by "keyword", and
  ;;    having the argument "(generate-reference-definition reference)";
  ;; (or return nil if "reference" is nil)
  (when reference
      `((,keyword ,(generate-reference-definition reference)))) )

(defun generate-multiple-references-clause (references keyword)
  ;; Return a list containing a clause prefaced by "keyword", and
  ;;    having as arguments a list produced by applying
  ;;    "generate-reference-definition" to each member of "references"
  (when references
      `((,keyword ,@(loop for ref in references
			 collect (generate-reference-definition
				   ref))))) )

(defun generate-list-definition (self)
  ;; Self is a list.  If it contains Loom objects, then it
  ;;   needs to be built up using a (:the-list ...) form.
  ;;   Otherwise it should be quoted.
  ;; BUG:  IF "SELF" IS NOT A TRUE LIST, THEN THIS WILL BREAK.
  (if (no-loom-objects-p self)
      `',self
    (map-onto-cons #'generate-instance-reference self :the-list :the-list*)))


#+CLTL2 (declaim (inline generate-instance-reference))
#-CLTL2 (proclaim '(inline generate-instance-reference))
(defun generate-instance-reference (instance)
  (cond ((symbolp instance) `',instance)
	((listp instance) (generate-list-definition instance))
	(t (generate-reference-definition instance))))

(defun generate-instance-references (instances)
  ;; Return a list of instance references;
  ;; Quotes are wrapped around symbols;
  (loop for i in instances
       collect (generate-instance-reference i)) )


  ;;
;;;;;; Definition Pretty-Printing Functions
  ;;

(defun print-concept-definition (definition &key (outputStream t) newline)
  ;; Pretty-print the concept or relation definition specified in "definition";
  (when newline
    (fresh-line outputStream))
  (format outputStream "~A" (format-concept-definition definition))
  (values) )

(defun format-concept-definition (definition)
  ;; Return a string containing a concept or relation definition
  ;;    in pretty-print format;
  (let ((*controlString* (make-string-output-stream)))
    (declare (special *controlString*))
    (help-format-concept-definition definition)
    (get-output-stream-string *controlString*) ))

(defun help-format-concept-definition (definition)
  ;; Helping function for "format-concept-definition";
  ;; Convert the s-expression "definition" into a string containing 
  ;;    Lisp formatting directives;
  (labels ((format-concept-body (body extraIndent)
             (loop for tail on body by #'cddr
                   do
                   (let ((keyword (validate-keyword (first tail) :no-error-p t))	; RMM 6/11/92
	                 (clause (second tail)))
	             (case keyword
	               ((:is :is-primitive :implies :defaults :antecedents)
	                (format-clause keyword clause))
	               ((:characteristics :system-characteristics :arity :inheritance-method
                                          :predicate :function)
	                (format-keyword&values keyword clause))
	               ((:domain :domains :range
			 :disjoint-covering :partitions :exhaustive-partitions :in-partition
			 :existing-class-name
			 :mixin-classes :mixin-slots :context :identifier
			 :inheritance-link :case-roles)
	                (format-keyword&values keyword clause :capitalize-p t))
		       ((:roles :keys :indices :annotations)
			(format-keyword&valueList keyword clause :capitalize-p nil))
                       ((:reifies :inverse)
                        (if (and (consp clause) (cdr clause))
			    (if (eql (first definition) 'defrelation)
				(format-clause keyword clause)
			      (progn (format-expression keyword :indent 2)
				     (format-open-parenthesis :indent 1)
				     (format-expression (first clause)
							:capitalize-p t)
				     (format-linefeed :indent (+ extraIndent 11))
				     (format-concept-body (rest clause) (+ extraIndent 11))
				     (format-close-parenthesis)))
                            (format-keyword&values keyword clause :capitalize-p t)))
                       (otherwise 
                        (error "The keyword ~S is undefined" keyword))))
                   (when (cddr tail)
                     (format-linefeed :indent extraIndent))) ))
    (let ((defsymbol (first definition))
          (name (second definition))
          (docString nil)
          (body (cddr definition)))
      (format-open-parenthesis)
      (when (stringp (third definition))
        (setq docString (third definition))
        (setq body (rest body)))
      (format-expression defsymbol)
      (format-expression name
		         :indent 1 
		         :linefeed-p (cddr definition)
		         :capitalize-p t)
      (when docString
        (format-expression docString :indent 2 :linefeed-p t))
      (format-concept-body body 0)
      (format-close-parenthesis) )))

(defun format-clause (keyword clause)
  ;; Write a formatted :is, :implies, or :defaults clause into the
  ;;    pretty-print output buffer;
  ;; Feature definitions are written onto new lines and indented properly;
  (format-expression keyword :indent 2)
  (cond
    ((symbolp clause)
     (format-expression clause :indent 1 :capitalize-p t))
    ((member (car clause) '(:and :or))
     (let ((indentLength (+ 10 (length (symbol-name keyword)))))
       (format-open-parenthesis :indent 1)
       (format-expression (car clause))
       (loop for tail on (cdr clause)
	    do
	    (let ((term (car tail)))
	      (cond
		((keywordp term)
		 (format-expression term :indent 1))
		((symbolp term)
		 (format-expression term :indent 1 :capitalize-p t))
		(t
		 (format-feature 
		   term :indent (cond 
				  ((eq term (second clause)) 1)
				  (t indentLength))))))
	    (when (consp (second tail))
		(format-linefeed))))
     (format-close-parenthesis))
    (t
     (format-feature clause :indent 1))) )

(defun format-feature (feature &key indent)
  ;; Write a formatted restriction or comparison definition into 
  ;;    the pretty-print output buffer;
  ;; Capitalize concept and relation names;
  (let ((notInLambda (neq (car feature) :lambda))
	operator)
    (format-open-parenthesis :indent indent)
    (format-expression (car feature))
    (loop for term in (cdr feature)
	 do (cond
	      ((and (consp term)
		    (setq operator (car term))  ; avoid TI compiler bug
		    (keywordp operator))
	       (format-feature term :indent 1))
	      (t
	       (format-expression term :indent 1 :capitalize-p notInLambda))))
    (format-close-parenthesis) ))

(defun format-keyword&values (keyword values &key capitalize-p)
  ;; Write a keyword-and-value list into the pretty-print output buffer;
  (format-expression keyword :indent 2)
  (format-expression values :indent 1 :capitalize-p capitalize-p) )

(defun format-keyword&valueList (keyword valueList &key capitalize-p)
  ;; Write a keyword-and-value list with special handling of list values
  ;;   into the pretty-print output buffer	;
  (if (consp valueList)
      (let ((len (length valueList)))
	(format-expression keyword :indent 2)
	(format-open-parenthesis :indent 1)
	(loop for v in valueList
	    as count upfrom 1
	    do (format-expression v :indent (if (eql count 1) 0 5)
				  :linefeed-p (not (eql count len))
				  :capitalize-p capitalize-p))
	(format-close-parenthesis :linefeed-p t))
    (format-keyword&values keyword valueList :capitalize-p capitalize-p)))

(defun format-open-parenthesis (&key indent)
  ;; Write an open-parenthesis into the pretty-print output buffer;
  (format-expression #\( :indent indent) )	; TAR 10/28/91

(defun format-close-parenthesis (&key linefeed-p)
  ;; Write a close-parenthesis into the pretty-print output buffer;
  (format-expression #\) :linefeed-p linefeed-p) )	; TAR 10/28/91

(defun format-expression (expression &key indent linefeed-p capitalize-p)
  ;; Write the string or symbol "expression" into the pretty-print output
  ;;    buffer, spacing and capitalizing as indicated by "indent", 
  ;;    "linefeed-p", and "capitalize-p";
  (declare (special *controlString*))
  (flet ((dont-change-case-p (expr)
	   (or (extended-number-p expr)
	       (eq (readtable-case *readtable*) :preserve)
	       (let ((string (format nil "~S" expr)))
		 (find-if #'(lambda (x) (member x '(#\| #\\ #\"))) string)))))
    (when indent
      (format *controlString* "~vT" indent))
    (cond
      ((characterp expression)
       (format *controlString* "~C" expression))
      ((stringp expression) 
       (format *controlString* "~S" expression))
      ((quoted-p expression)
       (format *controlString* "'~S" (second expression)))
      ((dont-change-case-p expression)
       (format *controlString* "~S" expression))
      (capitalize-p 
       (format *controlString* "~:(~S~)" expression))
      (t 
       (format *controlString* "~(~S~)" expression)))
    (when linefeed-p 
      (format-linefeed)) ))

(defun format-linefeed (&key indent)
  ;; Write a linefeed into the pretty-print output buffer;
  (declare (special *controlString*))
  (format *controlString* "~%~@[~vT~]" indent) )


  ;;
;;;;;; Concept Definition File Translation Functions
  ;;

;;; SAVE IN CASE WE WRITE A NEW TRANSLATOR FOR THE KR STANDARD:

;(defun translate-concept-definition-file (inputFile &key (output-file inputFile))
;  ;; Translate each concept definition in "inputFile" from the old 
;  ;;    TBox syntax to the new syntax;
;  ;; Write the translated definitions to "output-file", which defaults
;  ;;    to a new version of "inputFile";
;  ;; Copy all non-definitional text directly to "output-file";
;  (let ((bufferStream (make-string-output-stream))
;	inComment)
;    (disable-classifier)
;    (with-open-file (outputStream output-file 
;				  :direction :output
;				  :if-exists :new-version
;				  :if-does-not-exist :create)
;      (with-open-file (inputStream inputFile :direction :input)
;	(loop 
;	  (let ((char (read-char inputStream nil :eof)))
;	    (cond
;	      ((eql char :eof) (return))
;	      ((and (eql char #\() 
;		    (not inComment))
;	       (write-char char bufferStream)
;	       (translate-list inputStream outputStream bufferStream))
;	      (t
;	       (case char
;		 (#\; (setq inComment t))
;		 (#\Newline (setq inComment nil)))
;	       (write-char char outputStream))))))) ))

;(defun translate-list (inputStream outputStream bufferStream)
;  ;; Helping function for "translate-concept-definition-file";
;  ;; Situation: A list is being read from "inputStream";
;  ;; Examine the list head to determine if the list is a concept definition;
;  ;;    if so, translate it; otherwise, copy the head out to "outputStream"; 
;  (let (buffer)
;    (loop for i from 0 to 10
;	 do
;	 (let ((char (read-char inputStream nil :eof)))
;	   (case char
;	     (:eof (return))
;	     (#\( 
;	      (unread-char char inputStream)
;	      (return))
;	     (otherwise (write-char char bufferStream)))))
;    (setq buffer (get-output-stream-string bufferStream))
;    (cond
;      ((or
;	 (string-equal buffer "defconcept"  :start1 1 :end1 11)
;	 (string-equal buffer "defrelation" :start1 1 :end1 12)
;	 (string-equal buffer "defset"      :start1 1 :end1  7)
;	 (string-equal buffer "definterval" :start1 1 :end1 12)
;	 (string-equal buffer "deffunction" :start1 1 :end1 12))
;       (write-string buffer bufferStream)
;       (translate-definition inputStream outputStream bufferStream))
;      (t
;       (write-string buffer outputStream))) ))

;(defun translate-definition (inputStream outputStream bufferStream)
;  ;; Helping function for "translate-concept-definition-file";
;  ;; Translate the concept definition being read on "inputStream" and
;  ;;    write the new definition to "outputStream";
;  (let ((parenCount 1)
;	definition objectName)
;    (loop while (plusp parenCount)
;	  do
;	  (let ((char (read-char inputStream nil :eof)))
;	    (case char
;	      (:eof (return))
;	      (#\( (incf parenCount))
;	      (#\) (decf parenCount)))
;	    (write-char char bufferStream)))
;    (setq definition (read-from-string (get-output-stream-string bufferStream)))
;    (setq objectName (second definition))
;    (eval definition)
;    (print-concept-definition
;      (generate-object-definition (case (car definition)
;				    ((defconcept defset definterval) 
;				     (get-concept objectName))
;				    ((defrelation deffunction) 
;				     (get-relation objectName))))
;      :output-stream outputStream) ))


