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

;;; PREDICATES.LISP (TBOX)

(in-package "LOOM")

(export '( all-role-values the-role-value some-role-value
	  all-inverse-role-values
	  ))

;;; A "predicate" is a relation performing the role of an access function
;;;    or predicate.  This file contains functions for defining and
;;;    evaluating predicates.


  ;;
;;;;;; "generator-predicate-p"
  ;;

;;; These methods are called by retrieval routines when looking for
;;;    a generator in an query.
;;; Problem: Determining whether or not a :satisfies feature can generate
;;;    instances is non-trivial, and beyond the scope of 
;;;    "generator-predicate-p".  In the general case, testing whether or
;;;    not a :satisfies is a generator requires a recursive evaluation of
;;;    predicates referenced in the :satisfies (which may themselves 
;;;    contain :satisfies features).   In this case "generator-predicate-p"
;;;    is conservative, returning nil in some cases where generators exist.
;;;    Routines that call "generator-predicate-p" during sealing must include
;;;    separate tests for :satisfies features.


(defmethod generator-predicate-p ((self UNARY-CONCEPT))
  ;; Return t is "self" is capable of acting as a generator of instances;
  ;; "self" can generate instances if it has an auxiliary function, or
  ;;    if it has an ancestor that is a generator, or
  ;;    if it is a non-constant primitive and has no auxiliary predicate;
  ;; CAUTION: "generator-predicate-p" cannot account for the generative
  ;;    abilities of a :satisfies feature (when "self" is not sealed, it
  ;;    may return nil even though a :satisfies exists that can generate
  ;;    instances);
  (or (auxiliary-lambda-function self)
      (and (primitive-p self)
           (not (auxiliary-lambda-predicate self))
           (not (read-only-p self)))
      (and (eq (defined-as self) :set)
	   (let* ((setFtr (defined-set-feature self))
		  (cardinality (and setFtr (compute-set-cardinality setFtr))))
	     ;; Heuristic to eliminate truly inifinte sets (cardinality = NIL)
	     ;;   and also very large sets  (cardinality >= $CARDINALITY-INFINITE$)
	     ;;  - TAR 10/31/96
	     (and cardinality (< cardinality $CARDINALITY-INFINITE$))))
      ;; Tricky:  THING is primitive, but it doesn't show up on the list of 
      ;;    primitive concepts:
      (and (primitive-concepts self)
           (not (read-only-p self))
           (not (subconcept-p self (loom-constant CONSTANT)))
           (loop for super in (most-specific-concepts (all-super-concepts self))
                 thereis (generator-predicate-p super))) ))
  
(defmethod generator-predicate-p ((self UNARY-RELATION))
  ;; Return t is "self" is capable of acting as a generator of instances;
  nil )

(defmethod generator-predicate-p ((self N-ARY-RELATION))
  ;; Return t is "self" is capable of acting as a generator of range values;
  ;; CAUTION: "generator-predicate-p" cannot account for the generative
  ;;    abilities of a :satisfies feature (when "self" is not sealed, it
  ;;    may return nil even though a :satisfies exists that can generate
  ;;    instances);
  (or (auxiliary-lambda-function self)
      (and (primitive-p self)
           (not (auxiliary-lambda-predicate self))
           (not (read-only-p self)))) )

(defmethod generator-predicate-p ((self BINARY-RELATION))
  ;; Return t is "self" is capable of acting as a generator of
  ;;    role fillers or function values;
  ;; CAUTION: "generator-predicate-p" cannot account for the generative
  ;;    abilities of a :satisfies feature (when "self" is not sealed, it
  ;;    may return nil even though a :satisfies exists that can generate
  ;;    instances);
  (flet ((relation-sealed-p (relation)
	   (declare (special *unsealedRelationPredicates*))
	   (or (not (boundp '*unsealedRelationPredicates*))
               (not (member :unsealed-predicate 
                            (system-attributes relation))))))
    (if (relation-sealed-p self) 
      (get (predicate-symbol self) :loom-source-function)
      (or (auxiliary-lambda-function self)
          (and (primitive-p self)
               (not (auxiliary-lambda-predicate self))
               (not (read-only-p self)))
          (case (defined-as self)
            (:inverse
             (and (primitive-p (inverse self))
                  (generator-predicate-p (inverse self))))
            (:composition
             (loop for c in (components self)
                   always (generator-predicate-p c)))
            (otherwise
             (loop for super
                   in (most-specific-concepts (all-super-concepts self))
                   thereis (generator-predicate-p super)))))) ))

  ;;
;;;;;; Top-level predicate sealing
  ;;

(defun seal-predicates-immediately-p ()
  (not (member :compile-predicates-on-demand *loom-features*)) )

(defun predicate-is-sealed-p (relation)
  ;; Return t if "relation" has already been sealed.
  ;; Called by "ensure-sealed-predicate".
  (let ((symbol (predicate-symbol relation)))
    (or (get symbol :loom-source-function)
        (get symbol :loom-source-predicate)
	(get symbol :loom-source-tuples-function) ; TAR 5/13/98
	) ))

(defun immediately-seal-predicate-symbol (self)
  ;; Called during sealing of 'self'.
  ;; If sealing of predicates is supposed to be immediate, then
  ;;     seal the predicate for the relation 'self'.
  ;; Otherwise, insure that the predicate for 'self' is NOT sealed.
  (if (seal-predicates-immediately-p)
    (seal-predicate-symbol self)
    (unseal-predicate-symbol self)) )

(defun post-unsealed-predicate (relation)
  ;; Post relation on *unsealedRelationPredicates* unless it is already
  ;;   there.  Mark it appropriately.
  (declare (special *unsealedRelationPredicates*))
  (unless (member :unsealed-predicate (system-attributes relation))
    (push :unsealed-predicate (system-attributes relation))
    (push relation *unsealedRelationPredicates*)))

(defun ensure-sealed-predicate (relation)
  ;; Ensure that query code for "relation" has been generated and
  ;;    compiled.
  ;; Assumption: If "relation" is not sealed, then "on-demand" sealing
  ;;    is in effect, and relations it references may also need to be
  ;;    sealed.
  ;; Caveat: If *sealingUnsealedPredicatesP* is bound, then we are already
  ;;    inside of a recursive sealing operation, so we push "relation"
  ;;    on a queue of relation predicates to be sealed.
  (declare (special *sealingUnsealedPredicatesP* 
		    *collectedTriggerInstances*))
  (when (not (predicate-is-sealed-p relation))
    (if (boundp '*sealingUnsealedPredicatesP*)
	(post-unsealed-predicate relation)
      ;; If *collectedTriggerInstances* is bound, then we are in the middle
      ;; of setting up bombs for monitoring features.  We therefore rebind
      ;; *collectedTriggerInstances* so as not to have spurious entries added
      ;; to it during the sealing process.
      (if (boundp '*collectedTriggerInstances*)  ; TAR 7/3/97
	  (let ((*collectedTriggerInstances* nil))
	    (declare (special *collectedTriggerInstances*))
	    (seal-cluster-of-predicates relation))
	  (seal-cluster-of-predicates relation)))) )

(defun seal-cluster-of-predicates (relation)
  ;; Generate and compile query code for "relation" and for any relations
  ;;    it references (recursively) that don't yet have query code.
  (let ((savedContext *context*)
        (*codeObjectBeingSealed* relation)
        (*unsealedRelationPredicates* (list relation))
        (*undecidedRolePTable* nil))
    (declare (special *codeObjectBeingSealed*
                      *unsealedRelationPredicates* *undecidedRolePTable*))
    (unwind-protect
      (seal-unsealed-predicates)
      (change-context savedContext)) ))


  ;;
;;;;;; Computation of relation predicate functions
  ;;

;;; The routines below modify a relation's predicate symbol by either
;;;    (1) placing a compiled access function in its function slot which
;;;        computes the fillers for the relation when applied to an
;;;        instance, and possibly
;;;    (2) placing a compiled predicate function on the property
;;;        :loom-compiled-predicate which serves to evaluate that predicate;

(defun seal-predicate-symbol (self)
  ;; Called by "seal-relation" -- "self" is a concept or relation;
  ;; Compile the compute function or access function or predicate
  ;;    function for "self", and assign it to its predicate symbol;
  ;; Note: "intern-concept" allocates the predicate symbol;
  ;; CAUTION: Caller of "seal-predicate-symbol" must insure that the
  ;;    *context* is restored to its original value after
  ;;    predicate access function is computed;
  ;; Tricky: We record whether or not "self" already has a predicate
  ;;    before regenerating access functions to catch the case when another
  ;;    relation has caused "self" to generate a predicate while it was
  ;;    still unsealed;
  (when (neq (context self) *context*)
    (change-context (context self)))
  (when (and (typep self 'BINARY-RELATION)
	     (inheritance-link self)
	     (null (predicate-symbol (inheritance-link self))))
    ;; Need to have sealed the predicate-symbol of the inheritance relation
    ;;  before we can generate code for any users of it.  ; TAR 11/24/97
    (throw :too-early :too-early))
  (when (and (> (arity self) 2) ;; CONSIDER REDOING TEST WHEN WE HAVE 2-ARY TUPLES
	     (primitive-p self)
             (not (total-p self))       ; PROLOG
             (null (auxiliary-lambda-function self))
             (null (auxiliary-lambda-predicate self))
	     (null (antecedents self)))
    ;; THIS IS A KLUDGE:
    ;; don't seal n-ary relations with explicit extensions:
    (clear-loom-predicate-property-list (predicate-symbol self))    ; DGB 2/23/94
    (return-from seal-predicate-symbol self))
  ;; clear out any functions generated by previous sealing (better late than
  ;;    never):
  (emit-classify-string "^" :emit-classify-dots)
  (let* ((symbol (predicate-symbol self))
	 (*codeObjectBeingSealed* self)
	 (generatorForm (form-predicate-generator-code self))
	 (hadPredicateP (get symbol :loom-compiled-predicate))
	 (hadTupleGeneratorP (get symbol :loom-compiled-tuples-function))
	 predicateForm)
    (declare (special *codeObjectBeingSealed*))
    (clear-loom-predicate-property-list symbol :leave-fbound-p generatorForm)   ; RMM 5/20/93
    (when generatorForm
      ;; first form equality test, in case the computed definition of "self"
      ;;    is recursive, and needs it (e.g., if it calls "all-role-values"):
      (compile-predicate-code self generatorForm)
      ;; save function form for use in inspecting predicates
      (setf (get symbol :loom-source-function) generatorForm)
      (setf (get symbol :loom-no-duplicates-compiled-function)
	    (form-no-duplicates-compiled-function self)))
    (when (or (null generatorForm)
              (auxiliary-lambda-predicate self)
              (and hadPredicateP
                   (justify-predicate-test-p self)))
      (setq predicateForm (form-predicate-test-code self))
      (when (null predicateForm)
        (when (null generatorForm)
          ;; warn of bad predicate and generate dummy predicate:
          (warn-of-bad-predicate self))
        (return-from seal-predicate-symbol nil))
      (compile-predicate-code self predicateForm :predicate-p t)
      ;; save function form for use in inspecting predicates
      (setf (get symbol :loom-source-predicate) predicateForm))
    (when hadTupleGeneratorP
      (compile-generate-tuples-code-p self))
    ))

(defmethod warn-of-bad-predicate ((self t))
  ;; No warning for concepts or n-ary relations;
  nil )

(defmethod warn-of-bad-predicate ((self BINARY-RELATION))
  ;; Called by "seal-predicate-symbol";
  ;; Warn of a bad predicate, and insert code that warns if the predicate
  ;;    is accessed;
  ;; If "self" is referenced by a role, then do nothing, since the role
  ;;    code is supposed to set things up properly with a generic function;
  (let ((id (generate-external-reference self))
	(parameters (form-input-parameters self :predicate)))
    (unless (referenced-by-role-p self)	; TAR 10/26/93
      (complain "~&Loom can't compute a generator function or filter ~
                 predicate for the~%relation ~S.  " id)
      (when (read-only-p self)
        (complain "Possibly ~S should not be marked as ~%:read-only.~%" id))
      (without-redefinition-warnings
        (compile (predicate-symbol self)
	         `(lambda ,parameters (declare (ignore ,@parameters))
		          (inform "OOPS -- The predicate ~S cannot be evaluated." ',id)
		          nil)))) ))

(defun clear-loom-predicate-property-list (symbol &key leave-fbound-p)
  ;; Eliminate properties on the property list for "symbol" entered
  ;;    by LOOM;
  (unless leave-fbound-p
    (when (fboundp symbol)
      (fmakunbound symbol)))
  (when (symbol-plist symbol)
    (remprop symbol :loom-source-function)
    (remprop symbol :loom-source-tuples-function)    ; DGB 2/23/94
    (remprop symbol :loom-source-predicate)
    (remprop symbol :loom-compiled-tuples-function)  ; DGB 2/23/94 
    (remprop symbol :loom-compiled-predicate)
    (remprop symbol :loom-no-duplicates-compiled-function)) )

(defun unseal-predicate-symbol (relation)
  ;; Called by "destroy-concept" and "clear-one-context";
  ;; Remove LOOM properties from "relation"'s predicate symbol;
  ;; CAUTION: Not called by "uncomplete-sublattice" because we currently do
  ;;    an imperfect job of detecting which instances should be rematched;
  (unless (or (eql relation *binary-tuple*)           ; exclude "Binary-tuple"
              (eql relation (get-relation 'n-ary-tuple :no-error-p t)))  ; and "N-ARY-TUPLE"
    (clear-loom-predicate-property-list (predicate-symbol relation))) )

(defun compile-predicate-code (relation lambdaCode &key predicate-p)
  ;; Called by "seal-predicate-symbol";
  ;; Compile the lambda expression "lambdaCode" and store the result;
  (let ((functionSymbol (predicate-symbol relation))
	(compilerNote nil)
        arguments)
    (when (symbolp lambdaCode)
      ;; if "lambdaCode" is the NAME of a function, construct a lambda expression
      ;;    that invokes that function by name:
      (setq arguments (form-predicate-lambda-arguments relation predicate-p))
      (setq lambdaCode
            `(lambda ,arguments (,lambdaCode ,@arguments))))
    ;; compile the lambda code, check for compile errors, and point at the
    ;;    compiled code:
   (multiple-value-bind (compiledFunction diagnosticsP seriousDiagnosticsP)
       #+:allegro-v4.3 
       (handler-bind ((comp:compiler-note #'(lambda (c)
					      (declare (ignore c))
					      (setq compilerNote t))))
	 (without-redefinition-warnings
	  (compile (and (not predicate-p) functionSymbol)
		   lambdaCode)))
       #-:allegro-v4.3
       (without-redefinition-warnings
	  (compile (and (not predicate-p) functionSymbol)
		   lambdaCode))
     (print-message-if-bad-function
        diagnosticsP
	(and seriousDiagnosticsP (not compilerNote))
	relation lambdaCode)
      ;; if "predicate-p", then the compiled code gets stored in
      ;;    a property list, rather than in the "symbol-function" slot:
      (when predicate-p
        (setf (get functionSymbol :loom-compiled-predicate) compiledFunction))) ))

(defun form-predicate-lambda-arguments (relation predicateP)    ; PROLOG
  ;; Return a list of lambda variables for use in a generator or test
  ;;    predicate;
  ;; If "predicateP" return a number of variables equal to the arity
  ;;    of "relation";
  ;; Otherwise, return one fewer variables;
  (loop for i from 1
        to (if predicateP (arity relation) (1- (arity relation)))
        collect (form-gensym-variable "INSTANCE-")) )
 
(defun print-message-if-bad-function
       (diagnosticsP seriousDiagnosticsP concept functionForm)
  ;; If "seriousDiagnosticsP" indicates a less than perfect compile, 
  ;;    print out the name of the relation and the offending
  ;;    lambda expression;
  ;; In CLtL2 Lisps, "diagnosticsP" is T for any diagnostics, 
  ;;     "seriousDiagnosticsP" is T for non-STYLE-WARNINGS;
  ;; On the TI, "diagnosticsP" is a number which is 0 for no problems and
  ;;     a code number for warnings (10) or errors (20);
  ;; TO DO: MAKE THIS WORK FOR 3600 AND LUCID;
  (declare (ignore #-TI diagnosticsP #+TI seriousDiagnosticsP))
  (flet ((form-definition ()
           (typecase concept
             (TBOX-CONCEPT (generate-object-definition concept))
             (FEATURE (generate-computed-feature-clause concept)))))
    (when #-TI seriousDiagnosticsP #+TI(eql diagnosticsP compiler:errors)
      (complain "~&Questionable definition for concept or relation ~S.~%"
		(key concept))
      (complain "Source definition:")
      (pprint (form-definition) *error-output*)
      (complain "~%Lisp translation:")
      (pprint functionForm *error-output*)
      (complain "~%")) ))


  ;;
;;;;;; "form-predicate-generator-code"
  ;;

(defun form-predicate-generator-code (self)
  ;; Return a lambda expression which computes the fillers of the
  ;;    slot "(name self)" when applied to a list of arguments;
  (let ((auxiliaryFunction (auxiliary-lambda-function self)))
    (cond
     (auxiliaryFunction
      (if (and (member :cache-computation (attributes self)) ; TAR 7/18/97
	       (eql (arity self) 2))
	  (if (symbolP auxiliaryFunction)
	      (let ((arg (gensym "ARG")))
		`(lambda (,arg)
		   ,(form-cache-computation-function
		     self `(,auxiliaryFunction ,arg)
		     (list arg))))
	      `(lambda ,(first auxiliaryFunction)
		 ,(form-cache-computation-function 
		   self (if (cddr auxiliaryFunction)
			    `(progn ,@(rest auxiliaryFunction))
			  (second auxiliaryFunction))
		   (first auxiliaryFunction))))
	   (if (symbolp auxiliaryFunction)
	       auxiliaryFunction
	     `(lambda ,@auxiliaryFunction))))
     ((and (total-p self)               ; PROLOG
           (primitive-p self))
      (form-term-creating-generator-code self))
     (t
      (help-form-predicate-generator-code self))) ))

(defmethod help-form-predicate-generator-code ((self UNARY-ENTITY))
  ;; Return nil, since at the moment we don't generate compiled code
  ;;    for generating concept instances, except when "auxiliary-lambda-function"
  ;;    is specified;
  (let (*ignoredParameters*)
    (declare (special *ignoredParameters*))
    nil ))

(defmethod help-form-predicate-generator-code ((self N-ARY-RELATION))
  ;; Return a lambda expression which computes the fillers of the
  ;;    slot "(name self)" when applied to a list of arguments;
  (let (*ignoredParameters*)
    (declare (special *ignoredParameters*))
    (if (or (eq self (loom-constant N-ARY-TUPLE))
            (primitive-p self))         ; RMM 7/21/94
      nil
      (form-non-primitive-generator-code self)) ))

(defmethod help-form-predicate-generator-code ((relation BINARY-RELATION))
  ;; Return a lambda expression which evaluates the fillers of the
  ;;    role "(name relation)" when applied to a database instance;
  (let (*ignoredParameters*)
    (declare (special *ignoredParameters*))
    (cond
     ((or (primitive-p relation)
          (and (eq (defined-as relation) :inverse)
               (primitive-p (inverse relation))))
      ;; a :read-only primitive relations can't generate instances unless
      ;;    an  auxiliary function was defined for it
      (if (read-only-p relation)
        nil
        (form-primitive-generator-code relation)))
     ((eq (defined-as relation) :composition)
      (form-composition-generator-code relation))
;; RUNS INTO A PROBLEM WITH RIGHT RECURSION:
     ((and (eq (defined-as relation) :inverse)
           (computed-features (inverse relation))
           (not (recursive-p (inverse relation)))
           ;; try to get lucky:
           (form-inverse-of-non-primitive-generator-code relation)))
     ((eq (defined-as relation) :inverse)
      ;; returning NIL should cause inverse to be used for retrieval:
      (integrity-check (computed-features (inverse relation)))
      nil)
     (t
      (form-non-primitive-generator-code relation))) ))

(defun form-primitive-generator-code (relation &key alternate-generator-code)
  ;; Helping function for "form-predicate-generator-code";
  ;; Return a lambda expression which evaluates the fillers of the
  ;;    role "relation" by collecting fillers of roles at and below
  ;;    "relation";
  ;; If antecedent functions exist, add code which appends their
  ;;    computations to the fundamental computation;
  ;; "alternate-generator", if non-null, contains Lisp code that should be
  ;;    folded in to the code for primitive generator relations;
  ;; Note: "relation" is binary;
  ;; Bug in default fillers: Ideally, default inheritance code should wrap
  ;;    around all other types of inheritance, instead of just around
  ;;    asserted filler and inherited strict filler code;
  ;; TO DO: INSTRUMENT ONLY PREDICATES FOUND IN SUFFICIENTLY COMPLEX
  ;;    DEFINITIONS OR PRODUCTIONS, RATHER THAN INSTRUMENTING ALL OF THE
  ;;    TIME;
  (integrity-check (= (arity relation) 2))
  (let (directAssertionQueryBody recursiveQueryBody)
    (multiple-value-bind (role&subRoles impliedBys inverseImpliedBys)
	(collect-subroles&antecedents relation)
      (setq directAssertionQueryBody
	    (form-role&subrole-fillers-query role&subRoles '?instance relation))
      ;; see bug comment above:
      (setq directAssertionQueryBody
	    (wrap-with-inherited-fillers-query
	      role&subRoles '?instance directAssertionQueryBody relation))
      (setq recursiveQueryBody
	    (form-antecedents-query-code
	      '(?instance) '?filler impliedBys inverseImpliedBys))
      (when alternate-generator-code
	(setq recursiveQueryBody
	      `(bag-append
		 ,recursiveQueryBody ,alternate-generator-code)))
      (when (and recursiveQueryBody
                 (relation-is-single-valued-p relation))      ;  TAR 12/8/93
        (setq recursiveQueryBody `(first ,recursiveQueryBody)))
      (form-completed-predicate-code 
	directAssertionQueryBody recursiveQueryBody '(?instance) relation
	:instrument-query-p t) )))

(defvar *temp-var* (gensym))
(defun form-role&subrole-fillers-query (listOfRelations inputParameter topRelation)
  ;; Helping function for "form-primitive-generator-function";
  ;; Return a form that computes the set of asserted fillers of the
  ;;    relations in "listOfRelations" applied to "inputParameter";
  ;; BUG:  WHEN ONE OF THE ListOfRelations IS COMPUTED, IT IS NECESSARY TO CALL
  ;;       THE FUNCTION AS WELL AS JUST DOING THE get-slot-value CALL. tar 5/17/93
  ;; Fixed: TAR 4/25/96
  (let ((predicateSymbols (loop for role in listOfRelations
			      when (predicate-symbol role)
			      collect it
			      else do (throw :too-early :too-early))))
    (cond
     ((null (rest listOfRelations))
      `(get-slot-value ,inputParameter ,(first predicateSymbols)))
     ;; if multiple relations combine to generate fillers, some form of 
     ;;    dynamic append must be inserted into the code:
     ((> (length listOfRelations) 10)
      `(let ((fillers nil))
	 (loop for pred in ',predicateSymbols
	     do
	       (setq fillers
		 (bag-append
		  (if (computed-p (symbol-value pred)) ; TAR 4/25/96
		      (funcall (symbol-function pred) ,inputParameter)
		    (get-slot-values ,inputParameter (symbol-value pred)))
		  fillers)))
	 ,(if (role-is-single-valued-p topRelation)
	      '(first fillers)
	    'fillers)))
     ((role-is-single-valued-p topRelation)
      `(or ,@(loop for role in listOfRelations
		 as predSym in predicateSymbols
		 when (computed-p role)	; TAR 4/25/96
		 collect `(funcall ',predSym ,inputParameter)
		 else collect
		      `(get-slot-value ,inputParameter ,predSym))))
     (t
      `(sparse-append
	,@(loop for role in listOfRelations
	      as predSym in predicateSymbols
	      when (computed-p role)	; TAR 4/25/96
	      collect (if (role-is-single-valued-p role)
			  `(let ((,*temp-var* (funcall ',predSym ,inputParameter)))
			     (when ,*temp-var* (list ,*temp-var*)))
			`(funcall ',predSym ,inputParameter))
	      else collect
		   `(get-slot-values ,inputParameter ,predSym))))) )) ;  TAR 1/5/94


(defun form-antecedents-query-code
       (inputParameters outputParameter impliedBys inverseImpliedBys
	&key predicate-p)
  ;; Situation: "impliedBys" contains relations and/or computed features
  ;;    that generate derived fillers;
  ;; When not "predicate-p", return a form that generates all 
  ;;    implied fillers (from "impliedBys");
  ;; Otherwise, return a form that tests membership in a relation using both
  ;;    definitional and implied predicates;
  ;; Note: Unless "predicate-p", :predicate features belonging to
  ;;     "impliedBys" don't contribute to the generation of fillers;
  ;; TO DO: HANDLE CASE WHEN INVERSE SATISFIES GENERATES A DISJUNCT
  ;;    THAT HAS NO GENERATOR;
  ;; PERFORMANCE BUG: REMOVES DUPLICATES FROM CODE GENERATED BY "form-query";
  ;; BUG: IT LOOKS LIKE THE CODE GENERATED HERE RETURNS A LIST OF VALUES
  ;;    FOR THE SINGLE-VALUED CASE!!!:
  (when (and (null impliedBys)
	     (null inverseImpliedBys))
    (return-from form-antecedents-query-code nil))
  (let (queryClauses functions predicates listWithEmbeddedQuery) 
    (flet ((process-antecedent (imp notInverseP)
	     (typecase imp
	       (TBOX-RELATION
		(cond
		  (notInverseP
		   (push `(,(name imp) ,@inputParameters ,outputParameter)
			 queryClauses))
                  ((name imp)                   ; flip arguments to inverse antecedent:
                   (push `(,(name imp) ,outputParameter ,@inputParameters)
			 queryClauses))))
	       (otherwise			; COMPUTED-FEATURE
		(case (feature-type imp)
		  (:satisfies
		   (push
		     (reparameterize-parameters&body
		       (parameters&body imp)
		       (if notInverseP
			   `(,@inputParameters ,outputParameter)
			   `(,outputParameter ,@inputParameters)))
		     queryClauses))
		  (:function
		   (if (not predicate-p)
		       (when notInverseP
			 (push
			   (reparameterize-parameters&body
				 (parameters&body imp) inputParameters)
			   functions))
		       (push			; make inverse predicate
			 `(member
			    ,(if notInverseP
				 outputParameter
				 (first inputParameters))
			    (reparameterize-parameters&body
				 (parameters&body imp)
				 (if notInverseP
				     inputParameters
				     (list outputParameter))))
			 predicates)))
		  (:predicate
		   (when predicate-p
		     (push
		       (reparameterize-parameters&body
			 (parameters&body imp)
			 (if notInverseP
			     `(,@inputParameters ,outputParameter)
			     `(,outputParameter ,@inputParameters)))
		       predicates)))))))
	   (get-all-antecedent-contexts ()
	     (remove-duplicates
	       (loop for antecedent in (append impliedBys inverseImpliedBys)
		    collect
		    (etypecase antecedent
		      (TBOX-RELATION (context antecedent))
		      (COMPUTED-FEATURE (context-of-feature antecedent)))))))
      (loop for imp in impliedBys
	   do (process-antecedent imp t))
      (loop for imp in inverseImpliedBys
	   do (process-antecedent imp nil))
      (when queryClauses
	(setq listWithEmbeddedQuery
	      `(,(form-query
		   (unless predicate-p outputParameter)
		   `(:or ,@(generate-dereferenced-expression queryClauses))
		   :dont-seal-network-p t
		   :embedded-p t
		   :context (highest-encompassing-context
			     (get-all-antecedent-contexts))))))
      (if predicate-p
	  `(or ,@predicates ,@listWithEmbeddedQuery)
	  (let ((lists (append functions listWithEmbeddedQuery)))
	    (if (cdr lists)
		`(append ,@lists)
		(first lists)))) )))

(defun form-completed-predicate-code
       (localQueryCode recursiveQueryCode parameters relation 
	&key predicate-p instrument-query-p)
  ;; Wrap a lambda expression around a query combined from "localQueryCode"
  ;;    and "recursiveQueryCode";
  ;; If necessary, wrap code that blocks infinite recursion around "recursiveQueryCode";
  ;; Called by "form-primitive-generator-function" and "form-predicate-test-code";
  (declare (special *ignoredParameters*))
  (when (and (null localQueryCode)
             (null recursiveQueryCode))
    (return-from form-completed-predicate-code nil))
  (let ((recursiveCodeP (and (member :directly-recursive (system-attributes relation))
			     recursiveQueryCode))
	combinedQueryCode resultCode)
    (when recursiveCodeP
      (setq recursiveQueryCode
	`(cond ((gethash goal *queryGoalTable*)
		(report-duplicate-subgoal goal ,predicate-p)
		(unless (<= *power-level* 1)      ;; New
		  (loop with secondP = nil 
		      for dep in *pendingMemos*
		      when (equal dep goal)
		      do (if secondP
			     (return nil)
			   (setq secondP t))
			;; unless (equal dep goal)
		      else
		      do (multiple-value-bind (dummy foundP)     
			     (gethash dep *memoizationTable*)
			   (declare (ignore dummy))
			   (unless foundP
			     (report-memoization-dependency goal ,predicate-p dep)
			     (push dep (gethash goal *memoDependencies*))))
			 ))
		nil ;; duplicate goal, return failure
		)
	       (t (prog2 (setf (gethash goal *queryGoalTable*) t)
		      ;; Record and return answer:
		      ,recursiveQueryCode
		    ;; CONSIDER CALLING "remhash" INSTEAD:
		    (setf (gethash goal *queryGoalTable*) nil))))
	))
    (setq combinedQueryCode
          (combine-query-code relation localQueryCode recursiveQueryCode
                              :predicate-p predicate-p))
    (when (and (binary-p relation)
	       (inheritance-link relation))
      (setq combinedQueryCode
	(form-inherited-fillers-function 
	 (inheritance-link relation) (inheritance-method relation) 
	 relation combinedQueryCode (first parameters))))
    ;; Wrap recursive Code with bindings & memoization:
    (when recursiveCodeP
      (setq combinedQueryCode
	`(let ((goal (list ',(predicate-symbol relation) ,@parameters))
	       ) 
	   (declare (special *queryGoalTable* *memoizationTable* *memoDependencies* *pendingMemos*)) ; New
	   (multiple-value-bind (value foundP) (gethash goal *memoizationTable*)
	     (cond (foundP (report-memoization-value goal ,predicate-p nil value)
			   value)
		   (t (unless (<= *power-level* 1)	 ;; New
			(push goal *pendingMemos*))
		      ,(if predicate-p
			   `(setq value ,combinedQueryCode)
			 `(setq value (fast-remove-equal-duplicates ,combinedQueryCode)))
		      (unless (<= *power-level* 1)	 ;; New
			(pop *pendingMemos*))	
		      (report-memoization-value goal ,predicate-p t value)
		      (setf (gethash goal *memoizationTable*) value)
		      (unless (or (<= *power-level* 1)     ;; New
				  (gethash goal *queryGoalTable*))
			(loop for dep in (gethash goal *memoDependencies*) ;; New
			    do (multiple-value-bind (val fp) (gethash dep *memoizationTable*)
				 (when fp
				   (report-memoization-retraction goal ,predicate-p dep val)
				   (remhash dep *memoizationTable*)))
			    finally (remhash goal *memoDependencies*)))
		      value))))
	))
    (setq resultCode
	  `(lambda ,parameters
	     ,@(when *ignoredParameters*
		 `((declare (ignore ,@(truly-ignored-parameters 
					combinedQueryCode *ignoredParameters*)))))
	     ,@(if (and instrument-query-p
			(not (perfect-p relation)))                 ; DGB 12/17/92
		 `((declare (special *collectedRoleGenerators*))
		   (when (boundp '*collectedRoleGenerators*)
		     (push (cons ,(first parameters) ,(predicate-symbol relation))
			   *collectedRoleGenerators*))
		   ,combinedQueryCode)
		 `(,combinedQueryCode))))
    (when (and predicate-p
	       (member :commutative (attributes relation)))
      (setq resultCode
	`(lambda ,parameters
	   (loop for tuple in (permute-one-tuple (list ,@parameters))
	       thereis (apply (function ,resultCode) tuple)))))
    (if (boundp '*tracePredicateP*)
	(trace-predicate-goal&answer
	  relation parameters resultCode predicate-p)
      resultCode) ))

(defun form-inherited-fillers-function (link method relation queryBody parameter)
  ;; Wrap code around "queryBody" that inherits fillers over "link"
  ;;    in the manner specified by "method" using parameter "parameter";
  ;; The inheritance "method" may be :nearest-neighbor or :union, where
  ;;    :union is the default;
  (let* ((singleValuedP (role-is-single-valued-p relation))
         (var (gensym))
         (inverseLink
	  (if (inverse link)
	      (predicate-symbol (inverse link))
	      (error "The inheritance link ~S does not have an inverse" link)))
	 (collectFn
	  `(function (lambda (,parameter)
                       ,(if singleValuedP       ;  TAR 8/22/95
                          `(let ((,var ,queryBody))
                             (when ,var (list ,var)))
                          queryBody))))
         (functionBody (if (eq method :nearest-neighbor)
	                 (form-nearest-inherited-fillers-function
                          inverseLink collectFn parameter)
	                 (form-unioned-inherited-fillers-function 
                          inverseLink collectFn parameter)) ))
    (if singleValuedP                   ;  TAR 8/22/95
      (progn (unless (eq method :nearest-neighbor)
               (inform "Using :union inheritance on single-valued relation ~S~%~
                        This is an unusual thing to do." relation))
             `(let ((fillers ,functionBody))
                (if (null (rest fillers))
	          (first fillers)
	          (warn "Multiple inherited fillers of single-valued role: ~S"
	                ',(name relation)))))
      functionBody) ))

(defun form-nearest-inherited-fillers-function (inverseLink collectFn parameter)
  ;; Helping function for "form-inherited-fillers-function";
  ;; Form code that uses "collectFn" to return either local fillers or 
  ;;    fillers inherited across "inverseLink" from nearest neighbors;
  `(let (alreadyVisitedNodes fillers)
     (labels ((collect-fillers (self)
	        (let ((localFillers (funcall ,collectFn self)))
		  (push self alreadyVisitedNodes)
		  (if localFillers
                    (setq fillers (bag-append localFillers fillers))
                    (loop for neighbor in (all-role-values self ,inverselink)
			  unless (member neighbor alreadyVisitedNodes)
			  do (collect-fillers neighbor))))))
       (collect-fillers ,parameter)
       fillers )))
	
(defun form-unioned-inherited-fillers-function (inverseLink collectFn parameter)
  ;; Helping function for "form-inherited-fillers-function";
  ;; Form code that uses "collectFn" to return the union of local fillers 
  ;;    and fillers inherited recursively across "inverseLink";
  `(let ((collectFn ,collectFn))
     (append-transitively
       ,parameter
       (lambda (self) (all-role-values self ,inverseLink))
       (lambda (self) (funcall collectFn self))) ))

(defun combine-query-code (relation code1 code2 &key predicate-p)
  ;; Called by "form-completed-predicate-code" and ???
  ;; Produce a query representing the union of the query code "code1" and
  ;;    "code2";
  (if (and code1 code2)
    (if (or predicate-p
            ;; single valued "or" avoids recursion if asserted
            ;;    filler is located:
	    (and (binary-p relation)      ; DGB 2/23/94
		 (role-is-single-valued-p relation)))
      `(or ,code1 ,code2)
      `(bag-append ,code1 ,code2))
    (or code1 code2)) )

#+CLTL2 (declaim (inline report-duplicate-subgoal))
#-CLTL2 (proclaim '(inline report-duplicate-subgoal))
(defun report-duplicate-subgoal (goal testP)
  ;; If predicate tracing is on, trace duplicate subgoal;
  (declare (special *depthOfTrace*))
  (when (boundp '*depthOfTrace*)
    (inform "~&~v@T~:*~A DUPLICATE ~:[GENERATE~;TEST~] FAILS: ~S~%"
	    *depthOfTrace* testP (format-goal goal))) )


#+CLTL2 (declaim (inline report-memoization-dependency))
#-CLTL2 (proclaim '(inline report-memoization-dependency))
(defun report-memoization-dependency (goal testP dep)
  ;; If predicate tracing is on, trace duplicate subgoal;
  (declare (special *depthOfTrace*))
  (when (boundp '*depthOfTrace*)
    (inform "~&~v@T~:*~A RECORDING MEMOIZATION DEPENDENCY ~:[GENERATE~;TEST~] ~S on ~S~%"
	    (1- *depthOfTrace*) testP (format-goal dep) (format-goal goal))) )

#+CLTL2 (declaim (inline report-memoization-retraction))
#-CLTL2 (proclaim '(inline report-memoization-retraction))
(defun report-memoization-retraction (goal testP dep value)
  ;; If predicate tracing is on, trace duplicate subgoal;
  (declare (special *depthOfTrace*))
  (when (boundp '*depthOfTrace*)
    (inform "~&~v@T~:*~A UNMEMOIZED ~:[GENERATE~;TEST~] ~S => ~S  [because of ~S]~%"
	    (1- *depthOfTrace*) testP (format-goal dep) value (format-goal goal))) )

#+CLTL2 (declaim (inline report-memoization-value))
#-CLTL2 (proclaim '(inline report-memoization-value))
(defun report-memoization-value (goal testP setP value)
  ;; If predicate tracing is on, trace duplicate subgoal;
  (declare (special *depthOfTrace*))
  (when (boundp '*depthOfTrace*)
    (inform "~&~v@T~:*~A ~:[RETURN~;SET~] MEMOIZED ~:[GENERATE~;TEST~] ~S => ~S~%"
	    (1- *depthOfTrace*) setP testP (format-goal goal) value)) )


(defun trace-predicate-goal&answer (relation inputParameters queryCode predicate-p)
  ;; Trace the execution of calls to "relation";
  ;; Return t if "queryCode" did;
  (let ((predicate (predicate-symbol relation)))
    `(lambda ,inputParameters 
       (labels ((do-it ()
		  (let (answer)
		    (declare (special *depthOfTrace*))
		    (inform "~&~v@T~:*~A ~:[GENERATE~;TEST~]: ~S~%"
			    *depthOfTrace*
			    ,predicate-p
			    (format-goal `(,,predicate ,,@inputParameters)))
		    (incf *depthOfTrace*)
		    (setq answer (funcall (function ,queryCode) ,@inputParameters))
		    (decf *depthOfTrace*)
		    (inform "~&~v@T~:*~A ANSWER: ~S~%"
			    *depthOfTrace* (format-goal answer))
		    answer)))
	 (if (boundp '*depthOfTrace*)
	     (do-it)
	     (let ((*depthOfTrace* 0))
	       (declare (special *depthOfTrace*))
	       (do-it))))) ))

(defun format-goal (goal)
  ;; Return a form of "goal" with objects replaced by names or
  ;;    identifiers;
  (if (consp goal)
      (loop for term in goal collect (generate-external-reference term))
    (generate-external-reference goal)))

;;; Slightly clever strategy for processing non-primitive relations:
;;;    If the relation has a computed feature that will be used as a
;;;    generator, then all other features are used as filters applied to
;;;    that generator.  In this case, we must ALSO append in any directly
;;;    asserted roles/tuples.  Otherwise (when is no computed generator)
;;;    we construct a query out of the various definitional components,
;;;    and assume that some higher up relation will serve as the
;;;    generator.  If no computed features exist, then that is sufficient
;;;    (this assumes that domain and range constraints will necessarily
;;;    succeed wrt all directly asserted roles/tuples.  Otherwise, we
;;;    again have to append in directly asserted roles/tuples, since the
;;;    computed feature might have filtered out a valid answer.
;;; More trickiness: we assume that the computed generator is the only
;;;    possible source of recursion attributable directly to this 
;;;    relation; directly asserted role/tuples don't recurse, and any
;;;    other generator will be a higher up relation that implements
;;;    its own cycle check.

(defun form-non-primitive-generator-code (relation)
  ;; "relation" is non-primitive, not a :composition, and
  ;;    not the inverse of a computed relation;
  ;; Return a lambda expression that collects fillers from either a parent
  ;;    role of "relation" or a local :satisfies generator, intersects the
  ;;    fillers with other parent roles, applies domain and range restrictions
  ;;    to those fillers, and applies :satisfies tests to those fillers;
  ;; If antecedent functions exist, add code which appends their
  ;;    computations to the fundamental computation;
  ;; Return nil if no generator is found;
  ;; "form-query-for-predicate" performs the search for a generator;
  (let* ((inputParameters (form-input-parameters relation :function))
         (startingTuples (form-asserted-tuples-code relation inputParameters))
	 localSatisfiesFeatures
	 queryBody directAssertionQueryBody)
    (setq localSatisfiesFeatures
          (compute-local-satisfies-features relation))
    ;; INSERT CODE THAT STIMULATED GENERATION OF SINGLE-VALUED "OR"
    ;;    HERE:
    (flet ((make-single-valued-relations-single-valued (queryCode) ; RMM 12/7/93
             (if (relation-is-single-valued-p relation)
		 `(first ,queryCode)
		 queryCode)))
      (setq queryBody
            (make-single-valued-relations-single-valued	; RMM 12/7/93
	     (form-query-for-predicate
              relation inputParameters '?filler localSatisfiesFeatures
              :starting-tuples startingTuples)))
      (when (null queryBody)
	(return-from form-non-primitive-generator-code nil))
      (when (and localSatisfiesFeatures
		 (not (read-only-p relation)))
	(setq directAssertionQueryBody 
	      (make-single-valued-relations-single-valued      ; RMM 12/7/93
	       (form-collect-directly-asserted-role-fillers 
	        relation inputParameters))))
      (multiple-value-bind (dummy impliedBys inverseImpliedBys)
	  (collect-subroles&antecedents relation)
	(declare (ignore dummy))
	(when (or impliedBys inverseImpliedBys)
	  (setq queryBody 
	    (combine-query-code relation 
				queryBody
				(make-single-valued-relations-single-valued
				 (form-antecedents-query-code
				  inputParameters '?filler impliedBys inverseImpliedBys))))) )
      (when (member :cache-computation (attributes relation))
	;; combine into a single query before wrapping caching code:
	(when directAssertionQueryBody
	  (setq queryBody              ; RMM 12/7/93
		(combine-query-code relation directAssertionQueryBody queryBody))
	  (setq directAssertionQueryBody nil))
	(setq queryBody (form-cache-computation-function
			 relation queryBody inputParameters)))
      (form-completed-predicate-code 
       directAssertionQueryBody queryBody inputParameters relation)) ))

(defun last-car (list)
  (car (last list)))

(defun form-asserted-tuples-code (relation inputParameters)
  ;; Helping function for "form-non-primitive-generator-code";
  ;; Produces code that returns the asserted tuples for "relation";
  (let ((role&subRoles (collect-subroles&antecedents relation))
        (temporaryVariable (gensym "TEMP"))
        (code nil))
    (if (binary-p relation)
	(setq code (wrap-with-inherited-fillers-query ;  TAR 3/29/94
		    role&subRoles
		    (first inputParameters)
		    (form-role&subrole-fillers-query role&subRoles
						     (first inputParameters)
						     relation)
		    relation))
      (setq code
	(if (cdr role&subRoles)
	    `(sparse-append 
	      ,@(loop for rel in role&subRoles
		    collect `(project-range-of-n-ary-relation
			      ,(predicate-symbol rel)
			      ,@inputParameters)))
	  `(project-range-of-n-ary-relation
			      ,(predicate-symbol relation)
			      ,@inputParameters))))
    (when (relation-is-single-valued-p relation)
      (setq code
	`(let ((,temporaryVariable ,code))
	   (when ,temporaryVariable	; Make list only if non-nil
	     (list ,temporaryVariable)))))
    code ))
    


(defun form-query-for-predicate (self inputParameters outputParameter satisfiesFeatures
                                      &key predicate-p starting-tuples
                                      inverse-p)
  ;; Helping function for "form-non-primitive-generator-code" and
  ;;    "form-predicate-test-code";
  ;; If not "predicate-p" return a generator form that finds a generator
  ;;    (either a parent or a local :satisfies feature), and then applies
  ;;    remaining features (domain and range restrictions or satisfies
  ;;    features) as filters on the result;
  ;; Otherwise, return a predicate form that returns true iff the
  ;;    parameters satify domain, range, and satisfies tests;
  ;; A nil return value indicates that no generator or predicate was found;
  ;; TO DO: GENERATE NEW COMPUTED FEATURE FOR USE AS A PERSISTENT QUERY;
  ;; PERFORMANCE BUG: REMOVES DUPLICATES FROM CODE GENERATED BY "form-query";
  (flet ((top-most-relation-p (relation)
	   ;; Return t if "relation" is one of Binary-Tuple or N-Ary-Tuple;
	   (null (super-concepts relation))))
    (let ((parents (remove-if #'top-most-relation-p (super-concepts self)))
          domain range queryBody) 
      ;; note: query includes references to parents (implicitly inheriting the
      ;;    satisfiesFeatures attached to the parents):
      (when (typep self 'BINARY-RELATION)
	(setq domain (more-restrictive-defined-domain self))
	(setq range (more-restrictive-defined-range self)))
      (when (or (null (or parents domain range 
                          satisfiesFeatures (negated-concepts self)))
                ;; reduce possibility of generator predicates that are
                ;;    unreasonably inefficient (e.g., that use a concept
                ;;    generator derived from a domain or range):
                (and (not predicate-p)
                     (loop for super in (all-super-concepts self)
                           never (or (generator-predicate-p super)
                                     (computed-features super)))
                     (null (computed-features self))))
	(return-from form-query-for-predicate nil))
      (setq queryBody
	    `(:and
	       ,@(when domain
		   `((,(name domain) ,@inputParameters)))
	       ,@(loop for p in parents
		      collect `(,(name p) ,@inputParameters ,outputParameter))
	       ,@(when range
		   `((,(name range) ,outputParameter)))
               ,@(loop for nr in (negated-concepts self)
                       collect
                       `(not ,(name nr) ,@inputParameters ,outputParameter))
	       ,@(loop for f in satisfiesFeatures
		      collect
		      (reparameterize-parameters&body
			(parameters&body f)
			`(,@inputParameters ,outputParameter)))))
      (unless (cddr queryBody)
	;; Promote singleton :AND
	(setq queryBody (second queryBody)))
      (when inverse-p
        ;; flip positions of parameters within "queryBody":
        (setq queryBody (reparameterize-parameters&body
                         `((,@inputParameters ,outputParameter)
                           ,queryBody)
                         `(,outputParameter ,@inputParameters))))
       (form-query
	(unless predicate-p
          outputParameter)
	(generate-dereferenced-expression queryBody)
	:embedded-p t :starting-tuples starting-tuples) )))

(defmethod form-collect-directly-asserted-role-fillers
	   ((relation N-ARY-RELATION) inputParameters &key predicate-p)
  ;; Called by "form-non-primitive-generator-code";
  ;; Wrap code around "queryBody" that collects directly-asserted tuples
  ;;    and appends them to the result generated by "queryBody";
  (if predicate-p 
      `(relation-includes-tuple-p ,(predicate-symbol relation) ,@inputParameters)
    nil ))

(defmethod form-collect-directly-asserted-role-fillers
	   ((relation BINARY-RELATION) inputParameters &key predicate-p)
  ;; Called by "form-non-primitive-generator-code";
  ;; Generate code that collects directly-asserted local fillers
  ;;    for the role "relation" applied to the instance referenced in
  ;;    "inputParameters";
  ;; If "predicate-p", "inputParameters" also contains the output parameter,
  ;;    and the code tests whether the output parameter is equal to some
  ;;    role filler;
  (let ((generatorCode
	  `(collect-directly-asserted-role-fillers
	     ,(first inputParameters) ,(predicate-symbol relation))))
    (if predicate-p
	`(member ,@(last inputParameters) ,generatorCode :test #'filler-equal)
	generatorCode) ))

(defun collect-directly-asserted-role-fillers (self relation)
  ;; Helping function for "BINARY-RELATION.form-collect-directly-asserted-role-fillers";
  ;; Append a list of all fillers directly asserted for the role
  ;;    <self relation> or its subroles to the list "generatedFillers";
  ;; Remove duplicates and return concatenated list of fillers;
  (when (constant-p self)
    (return-from collect-directly-asserted-role-fillers nil))
  (let (localFillers)
    (labels
      ((help-collect-fillers (subRelation)
	 (prependf localFillers
		   (get-slot-values self subRelation))
	 (loop for subOfSub in (sub-concepts subRelation)
	       do (help-collect-fillers subOfSub))))
      (if (sub-concepts relation)
        (help-collect-fillers relation)
        (setq localFillers (get-slot-values self relation)))
      (when localFillers
	(fast-remove-duplicates
         localFillers 
;; UNCOMMENT WHEN WE GET VERSION OF "fast-remove" THAT HANDLES "equal" TEST:
;	    :test #'filler-equal
         )) )))

(defun form-cache-computation-function (relation queryBody inputParameters)
  ;; Wrap code around "queryBody" that caches the result of the computed
  ;;    computation, and returns the cached value upon future accesses to
  ;;    the same role;
  ;; Called by "form-non-primitive-generator-code";
  (when (rest inputParameters)
    (complain "~%Warning: Can't cache computation of relation ~S because its not~%   ~
               a binary relation." (name relation))
    (return-from form-cache-computation-function queryBody))
  `(or (get-slot-value ,@inputParameters ,(predicate-symbol relation))
       (let ((result ,queryBody))
         (set-slot-value ,@inputParameters ,(predicate-symbol relation) result)
         result)) )

(defun form-inverse-of-non-primitive-generator-code (relation)
  ;; "relation" is an inverse of a non-recursive relation defined by a
  ;;    :satisfies clause;
  ;; Return a lambda expression that collects fillers from either a parent
  ;;    role of "relation" or a local :satisfies generator, intersects the
  ;;    fillers with other parent roles, applies domain and range restrictions
  ;;    to those fillers, and applies :satisfies tests to those fillers;
  ;; Return nil if no generator is found;
  ;; "form-query-for-predicate" performs the search for a generator;
  ;; Note: The result of swapping arguments to compute the inverse of
  ;;    a recursive relation is likely to be inefficient, so we don't
  ;;    do it.
  (let* ((inputParameters (form-input-parameters relation :function))
         (startingTuples (form-asserted-tuples-code relation inputParameters))
         (inverseRelation (inverse relation))
	 inverseSatisfiesFeatures
	 queryBody directAssertionQueryBody)
    (setq inverseSatisfiesFeatures
          (compute-local-satisfies-features inverseRelation))
    ;; INSERT CODE THAT STIMULATED GENERATION OF SINGLE-VALUED "OR"
    ;;    HERE:
    (flet ((make-single-valued-relations-single-valued (queryCode) ; RMM 12/7/93
             (if (relation-is-single-valued-p relation)
		 `(first ,queryCode)
		 queryCode)))
      (setq queryBody
            (make-single-valued-relations-single-valued	; RMM 12/7/93
	     (form-query-for-predicate
              inverseRelation inputParameters '?filler inverseSatisfiesFeatures
              :starting-tuples startingTuples
              :inverse-p t)))
      (when (null queryBody)
	(return-from form-inverse-of-non-primitive-generator-code nil))
      ;; Why are these here?? vv  ; TAR wonders 4/10/97
      (pushnew :directly-recursive (system-attributes relation))
      (setf (recursive-p relation) t)
      (when (and inverseSatisfiesFeatures
		 (not (read-only-p relation)))
	(setq directAssertionQueryBody 
	      (make-single-valued-relations-single-valued      ; RMM 12/7/93
	       (form-collect-directly-asserted-role-fillers 
	        relation inputParameters))))
      (when (member :cache-computation (attributes relation))
	;; combine into a single query before wrapping caching code:
	(when directAssertionQueryBody
	  (setq queryBody              ; RMM 12/7/93
		(combine-query-code relation directAssertionQueryBody queryBody))
	  (setq directAssertionQueryBody nil))
	(setq queryBody (form-cache-computation-function
			 relation queryBody inputParameters)))
      (form-completed-predicate-code 
       directAssertionQueryBody queryBody inputParameters relation)) ))

(defun form-composition-generator-code (relation)
  ;; Helping function for "BINARY-RELATION.form-predicate-generator-code";
  ;; Return Lisp code which computes this relation;
  ;; First, generate the corresponding formula;
  ;; Then translate the formula into Lisp;
  ;; CAUTION: Assumes that " form-primitive-generator-code" uses the lambda
  ;;    argument "?instance";
  ;; PERFORMANCE BUG: REMOVES DUPLICATES FROM CODE GENERATED BY "form-query";
  (let ((listOfComponents (components relation))
	(formula '?instance))
    (loop for component in (butlast listOfComponents)
	 do (setf formula `(,(name component) ,formula)))
    (form-primitive-generator-code
      relation
      :alternate-generator-code
      (form-query '?filler 
		  `(,(name (first (last listOfComponents)))
		    ,formula ?filler)
		  :embedded-p t)) ))


  ;;
;;;;;; Strict and default inheritance code
  ;;

(defun wrap-with-inherited-fillers-query
       (listOfRelations inputParameter roleFillersQuery topRelation)
  ;; Called by "form-primitive-generator-code";
  ;; If some of the relations in "listOfRelations" can inherit strict or default
  ;;    fillers, wrap "roleFillersQuery" with code to perform the inheritance;
  ;; The code is designed so that all inherited strict fillers get pushed onto
  ;;    the list of fillers, but for the case of single-valued roles, inherited
  ;;    default fillers are added only if there were no strict fillers;
  ;; Tricky:  "roleFillersQuery" is code that produces a single value for
  ;;    single-valued roles, but the inheritance code requires a list of
  ;;    values to work correctly.  In this case, the value is converted to
  ;;    a list and then converted back at the end, possibly generating a
  ;;    a warning message;
  (labels ((form-push-fillers (relation collectorFunction)
	     `(setq fillers
		    (,collectorFunction 
                     ,inputParameter
                     ,(predicate-symbol relation)
		     fillers))))
    (multiple-value-bind (pushStrictFillersForms pushDefaultFillersForms)
            (loop for relation in listOfRelations
                  when (strict-fillers-table relation)
                  collect (form-push-fillers relation 'append-strict-fillers)
                      into strictForms
                  when (default-fillers-table relation)
                  collect (form-push-fillers relation
                                             'append-most-specific-default-fillers)
                      into defaultForms
                  finally (return (values strictForms defaultForms)))
      (unless (or pushStrictFillersForms pushDefaultFillersForms)
	(return-from wrap-with-inherited-fillers-query roleFillersQuery))
      `(let ((fillers ,roleFillersQuery))
         ,@(when (role-is-single-valued-p topRelation)          ; TAR 8/10/93
             '((when fillers            ; Don't make a list of NIL!!
                 (setq fillers (list fillers)))))
	 ;; first inherit strict fillers
	 ,@pushStrictFillersForms
	 ;; next, optionally inherit default role fillers:
	 ,@(when pushDefaultFillersForms
	     `((when (and (default-mode-p)
                          (not (instance-caches-default-fillers-p ,inputParameter)))
		 ,(if (role-is-single-valued-p topRelation)
		      `(when (null fillers)
			 ,@pushDefaultFillersForms)
		      `(progn
			 ,@pushDefaultFillersForms)))))
         ,(if (role-is-single-valued-p topRelation)     ; TAR 8/10/93
            `(progn
               (when (rest fillers)
                 (complain-about-too-many-fillers       ; RMM 2/7/94
                  ,inputParameter ',(name topRelation) fillers))
              (first fillers))
	    'fillers) ) )))

(defun complain-about-too-many-fillers (instance roleName fillers)
  ;; Called by code generated by "wrap-with-inherited-fillers-query";
  (setq fillers (remove-duplicates fillers :test #'filler-equal))
  (when (rest fillers)
    (complain "~&Single-valued role ~A on instance ~A gets multiple values via inheritance: ~A."
              roleName instance fillers)) )

(defmethod instance-caches-default-fillers-p ((self DB-INSTANCE))
  t)

(defmethod instance-caches-default-fillers-p ((self T))
  nil)

(defun inherit-non-blocked-fillers (fillers inheritedFillers relation features)
  ;; If any item in "inheritedFillers" of "relation" is blocked by a
  ;;   :not-filled-by restriction in "features", don't inherit any fillers.
  ;;   Otherwise return the union of "fillers" and "inheritedFillers";
  (if (and features                     ; Short circuit loop test
           (loop for i in inheritedFillers
                thereis (loop for ftr in features
                              thereis (and (eq (feature-type ftr) :not-filled-by)
                                           (eq (relation ftr) relation)
                                           (member i (non-role-fillers ftr) 
                                                   :test #'filler-equal)))))
    fillers
    (union fillers inheritedFillers :test #'filler-equal)) )



(defun append-strict-fillers (instance relation fillers)
  ;; Run-time helping function for "wrap-with-inherited-fillers-query";
  ;; Append strict fillers on the role "relation" inherited by "instance"
  ;;    with "fillers" and return the result;
  ;; Special care is needed not to inherit strict fillers from concepts
  ;;    that "instance" satisfies by default;
  ;; More special care is needed because this function could be called by 
  ;;    code that is asking if "instance" satisfies a feature on "relation" 
  ;;    and therefore asks what "relation"'s fillers are.  This means we
  ;;    need to wrap recursion code and use "backtracking-has-instance-p";
  (let ((type (find-strict-type instance))      ; RMM 2/7/94
	(fillersTable (strict-fillers-table relation)))
    (flet ((check-entries () 
	     (declare (special *appendFillersRecursionTable*))
	     (let ((recursiveEntries (gethash instance *appendFillersRecursionTable*)))
	       (loop for entry in fillersTable
		     as testConcept = (inherit-fillers-test-concept entry)
		     when (if (inherit-fillers-assertion-only-test-p entry)
			      (or (subconcept-p type testConcept)
				  ;; If ...assertion-only-test-p, then antecedents need
				  ;;   to be checked against the instance.
				  (loop for ant in (most-general-antecedents testConcept)
					; thereis (has-instance-p ant instance)
					; thereis (backtracking-has-instance-p ant instance type)  ; TAR 12/9/96
					thereis (if (member ant recursiveEntries)
						    nil
						    (progn 
						      (push ant (gethash instance
									 *appendFillersRecursionTable*))
						      (has-instance-p ant instance)))
					))
			    ; (has-bc-instance-p testConcept instance nil t)  ; RMM 2/7/94
			    ; (backtracking-has-instance-p testConcept instance type)  ; TAR 12/9/96
			    (if (member testConcept recursiveEntries)
				nil
			      (progn 
				(push testConcept (gethash instance
							   *appendFillersRecursionTable*))
				(has-bc-instance-p testConcept instance nil t)))
			    )
		   do (setq fillers (union fillers (inherit-fillers-fillers entry)
					   :test #'filler-equal))) )))
    (when (consp type)                  ; downgrade type to coherent level:
      (setq type (intrinsic-concept instance)))       ; RMM 2/7/94
    (when (null type)                   ;  TAR 3/28/96
      ;; Occurs when the instance is incoherent without an intrinsic-concept
      (return-from append-strict-fillers nil))
    (or (fast-append-fillers fillersTable type relation fillers nil)
	(progn 
	  (if (boundp '*appendFillersRecursionTable*)
	      (check-entries)
	    (let ((*appendFillersRecursionTable* (make-hash-table)))
	      (declare (special *appendFillersRecursionTable*))
	      (check-entries)))
	  fillers)) )))

(defun fast-append-fillers (fillersTable type relation fillers features)
  ;; Helping function for "append-xxx-fillers";
  ;; If "type" matches one of the test concepts in "fillersTable", inherit
  ;;    all fillers from that single entry;
  (when (most-general-antecedents type)
    (return-from fast-append-fillers nil))
  (let ((matchingEntry nil))
    (loop for entry in fillersTable
	 do
	 (when (eq (inherit-fillers-test-concept entry) type)
	   (setq matchingEntry entry))
	 (when (not (inherit-fillers-assertion-only-test-p entry))
	   (setq matchingEntry nil)
	   (return nil)))
    ;; "matchingEntry" is non-nil if "type" matches a test concept and
    ;;     there are no "derived" test concepts;
    (when matchingEntry
      ;; we got lucky -- we inherit from a single entry
      (inherit-non-blocked-fillers fillers 
                                   (inherit-fillers-fillers matchingEntry)
                                   relation
                                   features)) ))

;(defun append-most-specific-default-fillers (instance relation fillers)
;  ;; Run-time helping function for "wrap-with-inherited-fillers-query";
;  ;; Append the most specific default fillers on the role "relation" 
;  ;;    inherited by "instance" to "allFillers";
;  (let ((type (find-type&residue-features instance)) 
;        (fillersTable (default-fillers-table relation))
;        (satisfiedConcepts nil)
;        (unsatisfiedConcepts nil))
;    (flet ((satisfies-concept-p
;             (concept entry)
;             (when entry
;               (setq concept (inherit-fillers-test-concept entry)))
;             (or (member concept satisfiedConcepts)
;                 (and (not (member concept unsatisfiedConcepts))
;                      (let ((resultP
;                              (if (and entry
;                                       (inherit-fillers-assertion-only-test-p entry))
;                                  (subconcept-p type concept)
;                                  (has-instance-p concept instance))))
;                        (if resultP
;                            (push concept satisfiedConcepts)
;                            (push concept unsatisfiedConcepts))
;                        resultP)))))
;      (when (consp type)                                       ; DGB 6/5/92
;        (return-from append-most-specific-default-fillers nil)) 
;      (or (fast-append-fillers fillersTable type fillers)
;          ;; look for satisfied concepts with no satisfied subconcepts:
;          (progn
;            (loop for entry in fillersTable
;                 do
;                 (if (satisfies-concept-p nil entry)
;                     (when (loop for sub in (inherit-fillers-subconcepts entry)
;                                never (satisfies-concept-p sub nil))
;                       ;; found most specific concept -- push fillers:
;                       (setq fillers (append-instances-in-world 
;                                       fillers (inherit-fillers-fillers entry))))
;                     ;; avoid testing subconcepts of failed concept:
;                     (loop for sub in (inherit-fillers-subconcepts entry)
;                          do (pushnew sub unsatisfiedConcepts))))
;            ;; return possibly augmented set of fillers:
;            fillers)) )))

(defun append-most-specific-default-fillers (instance relation fillers)
  ;; Run-time helping function for "wrap-with-inherited-fillers-query";
  ;; Append the most specific default fillers on the role "relation" 
  ;;    inherited by "instance" to "allFillers";
  (multiple-value-bind (type residueFeatures) 
                       (find-type&residue-features instance)
    (let ((fillersTable (default-fillers-table relation)))
      (when (consp type)                                       ; DGB 6/5/92
        (return-from append-most-specific-default-fillers nil))	
      (or (fast-append-fillers fillersTable type relation fillers residueFeatures)
       ;; look for satisfied concepts with no satisfied subconcepts:
          (inherit-non-blocked-fillers
           fillers
           (loop for entry in fillersTable
                 when (and (subconcept-p type (inherit-fillers-test-concept entry))
                           (loop for subC in (inherit-fillers-subconcepts entry)
                                 never (subconcept-p type subC)))
                 append (inherit-fillers-fillers entry))
           relation
           residueFeatures)) )))


  ;;
;;;;;; "form-predicate-test-code" and its helpers
  ;;

(defun compile-predicate-test-code-p (relation)
  ;; Try to ensure that a predicate test for "relation" has been formed, compiled,
  ;;    and stored in the property list for "relation";
  ;; Return t if that attempt was successful;
  ;; Special variable *predicateBeingCompiled* is employed to prevent
  ;;    recursive invocation of this function;
  (declare (special *predicatesBeingCompiled*))
  (flet ((compile-the-predicate ()
           ;; Make this function work for both code coming in and for
           ;;   function names being passed.
           (let ((testCode (form-predicate-test-code relation)))
             (cond ((null testCode) nil)
                   ((symbolp testCode)
                    (when (fboundp testCode)
                      (or (compiled-function-p (symbol-function testCode))
                          (compile testCode))
                      (setf (get (predicate-symbol relation) :loom-compiled-predicate)
                            (symbol-function testCode))))
                   (t
                    (setf (get (predicate-symbol relation) :loom-compiled-predicate)
                          (compile nil testCode)))) )))
    (if (boundp '*predicatesBeingCompiled*)
      (if (member relation *predicatesBeingCompiled*)
        t
        (progn
          (push relation *predicatesBeingCompiled*)
          (compile-the-predicate)))
      (let ((*predicatesBeingCompiled* (list relation)))
        (declare (special *predicatesBeingCompiled*))
        (compile-the-predicate))) ))

(defun justify-predicate-test-p (relation)
  ;; Return t if it makes sense to generate test code for the predicate "relation";
  ;; This is true if
  ;;    (1) no generator code exists, or
  ;;    (2) the predicate test code is more efficient than just generating all
  ;;        fillers and doing a membership test;
  ;;    (3) the relation has antecedents that need to be computed or checked.
  (or (not (generator-predicate-p relation))
      (auxiliary-lambda-predicate  relation)
      ;; test for existence of :satisfies feature:
      (and (not (primitive-p relation))
           (computed-features relation))
      ;; test for existence of antecedents:
      (antecedents relation)) )

(defun form-predicate-test-code (self)
  ;; Called by "seal-predicate-symbol";
  ;; Return a lambda expression representing a computed predicate
  ;;    for "self";
  (let ((auxiliaryPredicate (auxiliary-lambda-predicate self)))
    (if auxiliaryPredicate
      (if (symbolp auxiliaryPredicate)
        auxiliaryPredicate
        `(lambda ,@auxiliaryPredicate))
      (help-form-predicate-test-code self)) ))

(defmethod help-form-predicate-test-code ((self UNARY-ENTITY))
  ;; Return nil, since at the moment we don't generate compiled code
  ;;    for testing concept instances, except when "auxiliary-lambda-function"
  ;;    is specified;
  nil )

(defmethod help-form-predicate-test-code (relation)
  ;; Return a lambda expression representing a computed predicate
  ;;    for "relation";
  ;; Called when a function could not be produced for "relation", or
  ;;    when generating a compiled predicate for "form-n-ary test";
  ;; Note: test predicates are guaranteed not be be primitive (unless read-only)
  ;;    and not to have :function features:
  ;; TO DO: FIGURE OUT HOW TO EXTRACT DIRECTLY ASSERTED QUERY BODY;
  (integrity-check (or (read-only-p relation)
		       (antecedents relation); TAR 7/10/98
                       (not (or (primitive-p relation)
                                (eq (defined-as relation) :composition)))))
  (when (and (typep relation 'BINARY-RELATION)
	     (eq (defined-as relation) :inverse))
    ;; return test based on inverse definition:
        (return-from help-form-predicate-test-code
          `(lambda (?arg1 ?arg2)
             ,(form-n-ary-test nil '(?arg2 ?arg1) :relation (inverse relation)))))
  (let* ((parameters (form-input-parameters relation :predicate))
	 coreQueryBody antecedentQueryBody directAssertionQueryBody
	 *ignoredParameters*)
    (declare (special *ignoredParameters*))
    (when (or (read-only-p relation)
	      (not (or (primitive-p relation)
		       (eq (defined-as relation) :composition))))
      (setq coreQueryBody
	(form-query-for-predicate
	 relation (butlast parameters) 
	 (first (last parameters))
	 (compute-local-satisfies-features relation)
	 :predicate-p t)))
    (multiple-value-bind (dummy impliedBys inverseImpliedBys)
	(collect-subroles&antecedents relation)
      (declare (ignore dummy)) 
      (setq antecedentQueryBody (form-antecedents-query-code
				  (butlast parameters) (first (last parameters))
				  impliedBys inverseImpliedBys :predicate-p t)))
    (unless (or (read-only-p relation)
		(etypecase relation
		  (BINARY-RELATION (collection-concept-p (implied-domain relation)))
		  (N-ARY-RELATION (loop for domain in (implied-domains relation)
				      thereis (collection-concept-p domain)))))
      (setq directAssertionQueryBody 
	    (form-collect-directly-asserted-role-fillers 
	      relation  parameters :predicate-p t)))
    (form-completed-predicate-code
      directAssertionQueryBody
      (cond                             ; RMM 9/23/92
       ((null antecedentQueryBody) coreQueryBody)
       ((null coreQueryBody) antecedentQueryBody)
       (t `(or ,coreQueryBody ,antecedentQueryBody)))
      parameters relation
      :predicate-p t :instrument-query-p t) ))



  ;;
;;;;;; Low-level helping functions for constructing predicates
  ;;

(defun compute-local-satisfies-features (relation)
  ;; Return a list of strictly local (non-inherited) computed features;
  (let ((passCounter (incf *concept-is-below-pass-counter*)))
    ;; mark all inherited features:
    (loop for parent in (super-concepts relation)
	 do
	 (loop for f in (computed-features parent)
	      do (setf (feature-is-below-counter f) passCounter)))
    ;; collect each unmarked local feature, unless its specializes a marked
    ;;    feature, in which case we exit because we have detected a feature
    ;;    that strictly overrides an inherited feature:
    (loop for feature in (computed-features relation)
	 when (neq (feature-is-below-counter feature) passCounter)
	 collect feature) ))


(defun collect-subroles&antecedents (relation)
  ;; Called by for "form-primitive-generator-function" and "form-predicate-test-code";
  ;; Return three values:
  ;;    (1) a list containing "relation" and its subrelations;
  ;;    (2) a list containing expressions that imply "relation" or its
  ;;           subrelations;
  ;;    (3) a list containing expressions that imply the inverse of "relation"
  ;;           or imply subrelations of the inverse relation;
  (let (role&subRoles antecedents inverseAntecedents)
    (labels ((help-collect-subroles&antecedents
	       (relation)
;;; THIS OPTIMIZATION IS INVALID UNLESS WE CAN SUPPRESS LOOM-INITIATED
;;;    ASSERTIONS TO SYSTEM-DEFINED RELATIONS:
;	       (unless (system-defined-concept-p relation)	; RMM 8/28/90
;		 (pushnew relation role&subRoles))
	       (pushnew relation role&subRoles)	        ; RMM 10/1/90
	       (loop for ant in (antecedents relation)
		    do (pushnew ant antecedents))
	       (when (and (binary-p relation)
			  (inverse relation))	
		 (loop for ant in (antecedents (inverse relation))
		      do (pushnew ant inverseAntecedents)))
	       (unless (computed-p relation)  ; TAR 4/25/96
		 ;; Computed relations have FULL functions, so there is no
		 ;;   need to collect and process their sub-relations;
		 (loop for sub in (sub-concepts relation)
		       do (help-collect-subroles&antecedents sub)))))
      (help-collect-subroles&antecedents relation)
      (values role&subRoles antecedents inverseAntecedents) )))
  

(defun form-input-parameters (relation functionOrPredicate)
  ;; Return a list of input parameters suitable for use in
  ;;    constructing a function or predicate from "relation";
  (cond
    ((eq functionOrPredicate :predicate)
     (loop for i from 1 to (arity relation)
	  collect (symbol-append 
		    ('?place (format nil "~S" i)) "LOOM")))
    ((binary-p relation) 
     '(?instance))
    (t
     (loop for i from 1 to (1- (arity relation))
	  collect 
	  (symbol-append 
	    ('?instance (format nil "~S" i)) "LOOM")))) )

(defun reparameterize-parameters&body (parameters&body newParameters)
  ;; Substitute "newParameters" for parameters in the form
  ;;    "parameters&body";
  ;; Return ONLY THE BODY of "parameters&body";
  ;; Note: "reparameterize-lambda-expression" may push parameters onto
  ;;    the special variable *ignoredParameters*;
  (reparameterize-lambda-expression
    `(lambda ,@parameters&body) newParameters :body-p t) )

(defun truly-ignored-parameters (expression ignoredParameters)
  ;; Return the subset of parameters in "ignoredParameters" that do not
  ;;    appear within "expression";
  ;; Note: This is an imperfect test, since it doesn't understand
  ;;    special forms;
  (labels ((found-variable-p (variable subExpression)
	     (if (consp subExpression)
               (loop for clause in (cdr subExpression)
                     thereis (found-variable-p variable clause))
               (eq variable subExpression))))
    (loop for parameter in ignoredParameters
	  unless (found-variable-p parameter expression)
	  collect parameter) ))

(defun form-predicate-equality-test (relation)
  ;; Return the appropriate test for arguments to the predicate for "relation";
  (let ((range (implied-range relation)))
    (cond
      ((subconcept-p range (loom-constant NUMBER))
       '=)
      ((subconcept-p (loom-constant STRING) range)
       'equal)
      ((subconcept-p (loom-constant NUMBER) range)
       'eql)
      #+:measures
      ((subconcept-p (loom-constant QUANTITY) range)
       'ms:dim-eql)
      (t
       'equal)) ))

;; REWRITE THIS AFTER CONCEPTS GET STORED INSIDE OF VARIABLES
;;    (IS THIS ALREADY TRUE?)
(defun form-constant-form (object &key raw-pointer-p very-slow-p context)
  ;; Return a form that at run-time returns a pointer to "object";
  ;; If "raw-pointer-p", we just return a raw pointer unless the Lisp
  ;;    compiler can't compile pointers into its code;
  ;; Otherwise, we return a slower-running form;
  (flet ((compute-slow-form
	   ()
	   (etypecase object
	     (TBOX-RELATION
	      (if very-slow-p
		  `(eval-relation-id ',(name object)
				     ,(name (context object))) 
		  `(symbol-value ',(predicate-symbol object))))
	     (UNARY-ENTITY
	      `(eval-concept-id ',(name object)
				,(name (context object))))
	     ((or DB-INSTANCE INSTANCE-IN-CONTEXT)
	      (when (null context)
		(error "`form-constant-form' needs :context value to generate constant~%   ~
		       representing a database instance"))
	      `(get-instance ',(identifier object) :context ',(name context))) )))
    (cond
      (raw-pointer-p
       #-:coral object
       #+:coral (compute-slow-form)
       )
      (t
       (compute-slow-form))) ))

(defmethod show-predicate (relationOrName)
  ;; Print out useful information thats hard to find to help debug "relation"; 
  (let* ((relation (get-sealed-relation relationOrName :no-error-p t))
	 symbol)
    (cond
     (relation
      (when (setq symbol (predicate-symbol relation))
        (loop for function-type in '(:loom-source-function 
                                     :loom-source-tuples-function
                                     :loom-source-predicate)
              do 
              (format t "~2&~S =~%" function-type)
              (pprint (get symbol function-type)))))
     ((and (setq relation (get-sealed-concept relationOrName))
           (setq symbol (predicate-symbol relation)))
      (loop for ftr in (computed-features relation)
            do
            (when (source-function ftr)
              (format t "~2&:FUNCTION =~%")
              (pprint (source-predicate ftr)))
            (when (source-predicate ftr)
              (format t "~2&:PREDICATE =~%")
              (pprint (source-predicate ftr)))))
     (t nil)) ))


  ;;
;;;;;; "form-no-duplicates-compiled-function"
  ;;

(defun form-no-duplicates-compiled-function (relation)
  ;; Called by "seal-predicate-symbol";
  ;; Return a compiled function that computes fillers of the role
  ;;    "relation" and guarantees that there are no duplicates;
  ;; QUESTION: WHAT IF ITS PRIMITIVE WITH AN ANTECEDENT???
  (let* ((predicateSymbol (predicate-symbol relation))
	 (inputParameters (form-input-parameters relation :function)))
    (if (duplicate-free-predicate-p relation)
	(symbol-function predicateSymbol)
	(compile nil
		 `(lambda ,inputParameters
		    (fast-remove-duplicates
		      (funcall ',predicateSymbol ,@inputParameters))))) ))

(defmethod duplicate-free-predicate-p ((self TBOX-RELATION))
  ;; Return t if a retrieve of fillers of the predicate "self"
  ;;    is guaranteed to be free of duplicates (without the necessity
  ;;    of applying "remove-duplicates" anywhere inside of the call);
  (or (relation-is-single-valued-p self)
      (and (or (primitive-p self)
	       (eq (defined-as self) :inverse))	; RMM 12/12/91
	   (null (sub-concepts self))
	   (null (antecedents self))
	   (not (recursive-p self)))) )


(defmethod duplicate-free-predicate-p ((self UNARY-ENTITY))
  ;; Return t if a retrieve of instances of "self" is guaranteed
  ;;    to be free of duplicates;
  (and (primitive-p self)
       (null (sub-concepts self))
       (null (antecedents self))
       (not (recursive-p self))) )

(defmethod duplicate-free-predicate-p ((self SYMBOL))
  ;; Situation: "self" is a variable used as a generator;
  ;; Return nil, since we can't know about duplicate-freeness;
  (integrity-check (question-mark-variable-p self))
  nil )


  ;;
;;;;;; Code to generate skolem terms
  ;;

;; PROLOG -- EVERYTHING BELOW

(defun form-term-creating-generator-code (self)
  ;; Called by "form-predicate-generator-code";
  ;; Return a lambda expression which computes the fillers of the
  ;;    slot "(name self)" when applied to a list of arguments;
  ;; Assumes that "self" is total, primitive, and has no auxiliary
  ;;    function defined for it;
  (let ((variables (form-predicate-lambda-arguments self nil)))
    `(lambda ,variables
       (create-term ,(predicate-symbol self) ,@variables)) ))

(defun create-term (relation &rest arguments)
  ;; Return a term composed of the function "relation" applied to
  ;;    arguments "arguments";
  `(,(name relation) ,@arguments) )


;; BUGS:

#|

COMPUTES THE INVERSE OF A COMPUTED FUNCTION??, WHICH IS
IMPOSSIBLE.

|#

;; TO DO:

#|

UPGRADE "form-constant-form" FOR CONCEPTS

FIGURE OUT HOW TO GENERATE COMPUTED CONCEPT PREDICATES
   FOR USE IN QUERIES

|#
