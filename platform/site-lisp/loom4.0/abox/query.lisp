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

;;; QUERY.LISP (ABOX)

(in-package "LOOM")

(export '(all-inverse-role-values))

;;; Contains low-level functions for querying the database.

#+CLTL2 (declaim (inline compiled-generator-p))
#-CLTL2 (proclaim '(inline compiled-generator-p))

(defun compiled-generator-p (relation)
  ;; Return t if a compiled procedure exists for generating tuples
  ;;    or instances in "relation";
  ;; Note: Typically, concepts and n-ary relations generate their tuples
  ;;    by calling an interpreter, whereas most binary relations access
  ;;    compiled procedures;
  (and (fboundp (predicate-symbol relation))
       (neq (symbol-function (predicate-symbol relation))
	    *dont-call-function*)) )


  ;;
;;;;;; Form Atomic Query functions
  ;;

;;; The following routines implement the the lowest level of query formation;

;;; Each of the is passed a concept or role form that at run-time will
;;;    evaluate to a concept or relation, instance/filler forms, and
;;;    optionally, a concept/role keyword containing the concept or relation
;;;    object (this occurs when the concept/relation is known at compile
;;;    time -- the normal case).
;;; The (very specialized) function "form-concept-evaluation-form" is used
;;;    be these routines to produce (at macro expand time) the form that 
;;;    evaluates to a concept/relation at run time.

(defun form-unary-test (conceptForm instanceForm &key concept)
  ;; Generate a query that returns t if "instanceForm" is an instance of the
  ;;    concept "conceptForm";
  `(safe-has-instance-p                 ; TAR 9/27/93
     ,(or conceptForm (form-query-concept concept))
     ,instanceForm) )

(defun form-unary-test-not (conceptForm instanceForm &key concept)
  ;; Generate a query that returns t if "instanceForm" is provably NOT an instance
  ;;    of the concept "conceptForm";
  ;;  TO DO:  DOES THIS NEED A SAFE FORM AS WELL??
  `(not-has-instance-p
     ,(or conceptForm (form-query-concept concept))
     ,instanceForm) )

(defun form-unary-generator (conceptForm &key concept)
  ;; Return a form that generates instances of the concept "conceptForm";
  ;; TO DO: ADD CODE TO OPTIONALLY REMOVE DUPLICATES;
  `(generate-instances-in-query 
     ,(or conceptForm (form-query-concept concept))) )

(defun form-n-ary-test (relationForm tupleForm &key relation)
  ;; Generate a query that returns t if "tupleForm" satisfies the
  ;;    relation "relationForm";
  (when relation
    (ensure-sealed-predicate relation))
  (let* ((predicateSymbol
          (when relation
            (predicate-symbol relation)))
	 (useCompiledPredicateP
          (and predicateSymbol
               (or (get predicateSymbol :loom-compiled-predicate)
                   (and (justify-predicate-test-p relation)
                        (compile-predicate-test-code-p relation)))))
         (shortCircuitGenerator
          (and predicateSymbol
               (get predicateSymbol :loom-source-function)
               (symbolp (get predicateSymbol :loom-source-function))
               (get predicateSymbol :loom-source-function)))
         (shortCircuitTest
          (and predicateSymbol
               (get predicateSymbol :loom-source-predicate)
               (symbolp (get predicateSymbol :loom-source-predicate))
               (get predicateSymbol :loom-source-predicate))))
    (when (null relationForm)
      (setq relationForm (form-query-relation relation)))
    (flet ((form-apply-predicate ()
	     (let (applyPredicateForm)
	       (if useCompiledPredicateP
                 ;; apply compiled predicate to arguments:
                 (if shortCircuitTest
                   `(,shortCircuitTest ,@tupleForm)
                   `(funcall (or (get ',predicateSymbol :loom-compiled-predicate)
				 (compile-predicate-test-code-p ,predicateSymbol))
                             ,@tupleForm))
                 (progn
                   ;; generate value(s) of compiled function and test for equality:
                   (setq applyPredicateForm
                         `(,(or shortCircuitGenerator                                
                                predicateSymbol)
                           ,@(butlast tupleForm)))
                   ;; It is possible that "applyPredicateForm" does not have
                   ;;   a valid function call (if "relation" has a bad 
                   ;;   definition).
                   (unless (fboundp (car applyPredicateForm))   ; TAR 7/18/94
                     (grumble "Relation ~A doesn't have a usable definition!~%  ~
                               ~:*~A needs to be redefined to have a definition ~%  ~
                               that is computationally useful to Loom.  (Some ~
                               possible~%  problems are universal quantification ~
                               over open-world~%  relations or infinite sets)~%" 
                              relation)
                     (return-from form-apply-predicate nil))
                   (setq applyPredicateForm
                         (wrap-with-run-time-open-role-throw
                          applyPredicateForm
                          relation (first tupleForm)))
                   (if (relation-is-single-valued-p (symbol-value predicateSymbol))
                     `(filler-equal
                       ,(first (last tupleForm)) 
                       ,applyPredicateForm)
                     `(member ,(first (last tupleForm))
                              ,applyPredicateForm :test #'filler-equal))))))
	   (form-search-for-matching-tuple ()
	     ;; QUESTION: IS IT WORTH COMPILING OUT THE :single-valued TEST HERE???:
	     `(tuple-satisfies-relation-p
               (list ,@tupleForm) ,relationForm)))
      (if (and relation (sealed-p relation))
        ;; ELIMINATE THIS LET WHEN INTEGRITY CHECK IS ELIMINATED
        (let ((predicateSymbol (predicate-symbol relation)))
          (declare (special *undecidedRolePTable* *predicatesBeingCompiled*
                            *unsealedRelationPredicates* *codeObjectBeingSealed*))
          (unless (or (not (binary-p relation))
                      (compiled-generator-p relation)
                      (get predicateSymbol :loom-compiled-predicate)
                      (and (boundp '*predicatesBeingCompiled*)
                           (member relation *predicatesBeingCompiled*))
                      (and (boundp '*undecidedRolePTable*)
                           (assoc relation *undecidedRolePTable*)))
            (emit-classify-string "x")
            (throw :too-early :too-early))
          (if (and (primitive-n-ary-relation-p relation)
		   (null (antecedents relation)))
            (form-search-for-matching-tuple)
            (form-apply-predicate)))
	(if (= (length tupleForm) 2)
	  `(run-time-apply-role-predicate ,relationForm ,@tupleForm)
	  `(run-time-apply-predicate ,relationForm (list ,@tupleForm)))) )))

(defun check-argument-type (argument concept)
  ;; Make sure "argument" is a subconcept of "concept";
  (or (eql concept *thing*)
      (and (intrinsic-concept argument)
           (subconcept-p (intrinsic-concept argument) concept))   ; Quicker 
      (let ((types (find-type&residue-features argument)))
        (if (consp types)      ; NB Incoherent
          (loop for type in types thereis (subconcept-p type concept))
          (subconcept-p types concept)))) )

(defun run-time-apply-predicate (relation arguments)
  ;; Referenced by "form-n-ary-test";
  ;; Apply the predicate for "relation" to "arguments" after checking for
  ;;   valid domain and range;
  ;; Designed to evaluate everything at run-time;
  ;; TO DO: FIRST CHECK CAN BE ELIMINATED IF QUERIES USE DOMAIN GENERATORS
  ;;        FOR RELATION!
  (unless (typep relation 'TBOX-RELATION)
    (return-from run-time-apply-predicate nil))
  (when (and (temporal-p relation)      ; TAR 10/8/93
             (not (boundp '*query-world-time-suffix*)))
    (inform "Temporal relation ~S called outside a temporal context" relation)
    (return-from run-time-apply-predicate nil))
  (let ((symbol (predicate-symbol relation))
        (nArgs (length arguments))
        compiledPredicate)
    (flet ((help-check-argument-type ()        ; TAR 9/27/93
             ;; KLUDGE:  Domain and range tests screw up with equality
             ;;    predicates, so disable them until we fix built-in ontology;
             (or (eq relation (loom-constant same-as))    ; KLUDGE ; TAR 11/3/93
                 (eq relation (loom-constant =))          ; KLUDGE ; TAR 11/3/93
                 (not (computed-p relation))
                 (and (check-argument-type (car (last arguments))
                                           (implied-range relation))
                      (if (= nArgs 2)
                        (check-argument-type (first arguments)
                                             (implied-domain relation))
                        (loop for arg in (butlast arguments)
                              as domain in (implied-domain relation)
                              always (check-argument-type arg domain)))))))
      (ensure-sealed-predicate relation)
      (unless (and (= (arity relation) nArgs)
                   (help-check-argument-type))
        (return-from run-time-apply-predicate nil))
      (cond
       ((primitive-n-ary-relation-p relation)
        (tuple-satisfies-relation-p arguments relation))
       ((setq compiledPredicate (get symbol :loom-compiled-predicate))
        (apply compiledPredicate arguments))
       ((relation-is-single-valued-p relation)      ; TAR 9/27/93.  Removed
        (filler-equal (car (last arguments))           ; list-of below.
               (apply symbol (butlast arguments))))
       (t					; use function
        (member (car (last arguments))
                (apply symbol (butlast arguments)) :test #'filler-equal))) )))

(defun run-time-apply-role-predicate (relation argument1 argument2)
  ;; Called by "probe-binary-tuple-p";
  ;; Apply the predicate for "relation" to "argument1" and "argument2";
  ;; Designed to evaluate everything at run-time;
  (let ((symbol (predicate-symbol relation))
	compiledPredicate)
    (flet ((help-check-argument-type ()        ; TAR 9/27/93
             ;; KLUDGE:  Domain and range tests screw up with equality
             ;;    predicates, so disable them until we fix built-in ontology;
             (or (eq relation (loom-constant same-as))    ; KLUDGE ; TAR 11/3/93
                 (eq relation (loom-constant =))          ; KLUDGE ; TAR 11/3/93
                 (and (check-argument-type argument2
                                           (implied-range relation))
                      (check-argument-type argument1
                                           (implied-domain relation))))))
    (unless (help-check-argument-type)          ;TAR 9/27/93
      (return-from run-time-apply-role-predicate nil))
    (cond ((setq compiledPredicate (get symbol :loom-compiled-predicate))
	   (funcall compiledPredicate argument1 argument2))
          ((role-is-single-valued-p relation)   ; TAR 9/27/93.  Removed
           (filler-equal argument2 (funcall symbol argument1)))  ; list-of below.
          (t 
	   (member argument2	; use function
		   (funcall symbol argument1) :test #'filler-equal))) )))

(defun form-binary-test-not (relationForm tupleForm &key relation)
  ;; Generate a query that returns t if "tupleForm" provably does NOT satisfy the
  ;;    relation "relationForm";
  ;; Note: "form-n-ary-predicate-query" does not call routines that pass
  ;;    n-ary relations down to this level;
  (integrity-check (and (binary-p relation)
                        (not (computed-p relation))))
  (when (null relationForm)
    (setq relationForm (form-query-relation relation)))
  `(not-has-filler-p ,relationForm ,@tupleForm) )

(defun form-n-ary-generator (relationForm argumentForms 
			                  &key relation dont-remove-duplicates-p
			                  dont-listify-atomic-result-p)
  ;; Return a form that generates range fillers of tuples that satisfy
  ;;    the relation "relationForm";  "argumentForms" supplies the first
  ;;    k-1 values for the satisfying k-tuples;
  ;; If "relation" is one of the list-forming operators, hand off to
  ;;    special purpose code;
  ;; If "relation" is non-nil, use it to compile-out some testing that
  ;;    would otherwise have to be performed at run-time;
  ;; If "dont-listify-atomic-result-p", permit atomic valued results --
  ;;    otherwise, insure that they become lists;
  (when (member relation '(:the-list :the-list*))
    (return-from form-n-ary-generator
      (form-apply-list-operator 
       (if (eq relation :the-list) 'list 'list*)
       argumentForms
       dont-listify-atomic-result-p)))
  (when (null relationForm)
    (setq relationForm 
	  ;; Tricky (kludgy?) -- avoids creating local let variable:
	  (if (question-mark-variable-p relation)
            relation
            (form-query-relation relation))))
  (if (and relation
           (not (question-mark-variable-p relation))
           (sealed-p relation))
    ;; generate code for compile-time evaluation of relation:
    (form-compile-time-apply-function
     relationForm argumentForms relation
     dont-remove-duplicates-p dont-listify-atomic-result-p)
    ;; generate code for run-time evaluation of relation:
    (form-run-time-apply-function
     relationForm argumentForms
     dont-remove-duplicates-p dont-listify-atomic-result-p)) )

(defun form-apply-list-operator 
    (listFn argumentForms dont-listify-atomic-result-p)
  (if dont-listify-atomic-result-p
      `(,listFn ,@argumentForms)
    (let ((temporaryVariable (gensym "LIST")))
      `(let ((,temporaryVariable (,listFn ,@argumentForms)))
	 (when ,temporaryVariable	; Make list only if non-nil
	   (list ,temporaryVariable))))))

(defun form-compile-time-apply-function
       (relationForm argumentForms relation removeDuplicatesP dontListifyP)
  ;; Helping function for "form-n-ary-generator";
  (let* ((predicateSymbol (predicate-symbol relation))
         (temporaryVariable (gensym "TEMP"))
         shortCircuitGenerator generatorForm)
    (flet ((form-apply-function ()
	     (setq generatorForm
                   (if removeDuplicatesP
                     `(funcall (get ',predicateSymbol
                                    :loom-no-duplicates-compiled-function)
                               ,@argumentForms)
                     `(,(or shortCircuitGenerator 
                            predicateSymbol)
                       ,@argumentForms)))
	     (if (and (relation-is-single-valued-p relation)
		      (not dontListifyP))
               `(let ((,temporaryVariable ,generatorForm))      ; TAR 8/18/93
                  (when ,temporaryVariable        ; Make list only if non-nil
                     (list ,temporaryVariable)))
               generatorForm))
           (form-project-from-tuples ()
             (cond
              ((compiled-generator-p relation)
               (let ((form
                      `(,(or shortCircuitGenerator 
                             predicateSymbol)
                        ,@argumentForms)))
              ;; TO DO: INSURE THAT SINGLE-VALUED N-ARY RELATION RETURNS AN ATOM:
                 (if (and (relation-is-single-valued-p relation)
                          (not dontListifyP))
                   `(let ((,temporaryVariable ,form))      ; TAR 8/18/93
                      (when ,temporaryVariable        ; Make list only if non-nil
                          (list ,temporaryVariable)))
                   form)))
              ((single-valued-p relation)
               `(last (find-matching-tuple ,relationForm (list ,@argumentForms))))
              (t
               `(project-range-of-n-ary-relation ,relationForm ,@argumentForms)))))
      ;; figure out what kind of generator 'relation' provides:
      (ensure-sealed-predicate relation)
      (setq shortCircuitGenerator
            (and predicateSymbol
                 (get predicateSymbol :loom-source-function)
                 (symbolp (get predicateSymbol :loom-source-function))
                 (get predicateSymbol :loom-source-function)))
      ;; generate code for compile-time evaluation of relation:
      (if (primitive-n-ary-relation-p relation)
        (form-project-from-tuples)
        (wrap-with-run-time-open-role-throw
         (form-apply-function)
         relation (first argumentForms))) )))
	
(defun form-run-time-apply-function 
       (relationForm argumentForms removeDuplicatesP dontListifyP)
  ;; Helping function for "form-n-ary-generator";
  ;; Generate either a call to "run-time-apply-function" or the more
  ;;    streamlined "run-time-call-role";
  (let ((removeDuplicatesForm (unless removeDuplicatesP
				`(:remove-duplicates-p t)))
	(dontListifyForm (unless dontListifyP
			   `(:dont-listify-atomic-result-p t))))
    (if (and (null (rest argumentForms))
	     (not dontListifyP))
	`(run-time-call-role ,relationForm ,(first argumentForms) t)
	`(run-time-apply-function
	   ,relationForm (list ,@argumentForms)
	   ,@dontListifyForm
	   ,@removeDuplicatesForm)) ))

(defun wrap-with-run-time-open-role-throw (generatorCode relation firstArgument)
  ;; Helping function for "form-n-ary-generator";
  ;; If *runTimeClosedRoleGeneratorP* is bound and "relation" is binary, then
  ;;    wrap a conditional throw around a run-time evaluation of the
  ;;    set of role fillers;
  ;; Note: The special variable *runTimeClosedRoleGeneratorP* is bound by
  ;;    "form-generator-code" and "form-n-ary-predicate-query" and "form-n-ary-test";
  (declare (special *runTimeClosedRoleGeneratorP*))
  (if (and (boundp '*runTimeClosedRoleGeneratorP*)
           (eq *runTimeClosedRoleGeneratorP* t)
	   (binary-p relation)
	   (not (concept-is-closed-p relation)))
    `(multiple-value-bind (closedRoleP fillers)
	                  (collect-closed-set-of-fillers-p
	                   ,firstArgument
	                   ,(form-query-relation relation))
       (when (not closedRoleP)
         (warn-and-throw-to-run-time-open-role-catcher
          ',(name relation) ,firstArgument))
       fillers)
    generatorCode) )

(defun warn-and-throw-to-run-time-open-role-catcher (relationName instance)
  ;; Helping function for "wrap-with-run-time-open-role-throw";
  ;; Generate a runtime warning during a query;
  ;; If *openRoleThrow* is bound, then set the value to T.  This is
  ;;   used to signal to higher level code that the reason the query
  ;;   failed was because of an open role issue.  This is used in figuring
  ;;   out if a negated query should be answered T or NIL.  Currently used
  ;;   for computed features only.
  (declare (special *openRoleThrow*))
  ;; TO DO: WE CAN'T RECALL WHY WE TURNED OFF THE WARNING HERE -- IF WE
  ;;    CAN RECONSTRUCT THE REASON, THEN WE CAN CONSIDER REINSTALLING
  ;;    THE SWITCH ON THE WARNING;
  (unless nil; (typep instance 'NEGATION-MIXIN)   ;RMM 8/16/93
    (grumble "Couldn't find a closed set of fillers for the role ~S on instance ~S"
	  relationName instance))
  (when (boundp '*openRoleThrow*)
    (setq *openRoleThrow* t))
  (throw :run-time-open-role-catcher nil) )

(eval-when (load eval compile)			; Used in the next macro
  (defun wrap-with-recursion-declaration (applyRoleForm &key role-form)
    ;; Return a form that wraps declarations and clean-up code
    ;;    to support recursive queries around "applyRoleForm";
    (let ((testRecursionForm (if role-form
				 `(and (recursive-p ,role-form)
				       (not (boundp '*queryGoalTable*)))
				 `(not (boundp '*queryGoalTable*)))))
      `(if ,testRecursionForm
	   (let ((*queryGoalTable* (create-query-goal-table))
		 (*memoizationTable* (make-hash-table :test #'equal))
		 (*memoDependencies* (make-hash-table :test #'equal))
		 (*pendingMemos* nil))
	     (declare (special *queryGoalTable* *memoizationTable*
			       *memoDependencies* *pendingMemos*))
	     ,applyRoleForm)
	   ,applyRoleForm) ))
  )

;; Moved this macro to top level to avoid TI macrolet compilation bug.
;; tar 8/26/92
(defmacro wrap-with-conditional-recursion (applyForm)
  (wrap-with-recursion-declaration applyForm :role-form 'relation))
(defmacro wrap-with-recursion (applyForm)
  (wrap-with-recursion-declaration applyForm))


(defun run-time-apply-function (relation arguments
			                 &key dont-listify-atomic-result-p
				         remove-duplicates-p)
  ;; Referenced by "form-n-ary-generator";
  ;; Apply the function for "relation" to "arguments";
  ;; Designed to evaluate everything at run-time;
  (ensure-sealed-predicate relation)
  (unless (and (typep relation 'tbox-relation)          ;  TAR 8/18/94
               (eql (arity relation) (1+ (length arguments)))
               (generator-predicate-p relation)         ; Suppress warning?
               (or (not (computed-p relation))
                   (loop for argument in arguments
                         as domain in (list-of (implied-domain relation))
                         always (check-argument-type argument domain))))
    (return-from run-time-apply-function nil))
  (let ((symbol (predicate-symbol relation)))
    (cond
     ((primitive-n-ary-relation-p relation)
      ;; scan for tuples in "relation" that match "key", and return
      ;;    a list of the last place values;
      (cond
       ((compiled-generator-p relation)
        (list-of (apply symbol arguments)))
       ((single-valued-p relation)
        (last (find-matching-tuple relation arguments)))
       (t
        (apply #'project-range-of-n-ary-relation relation arguments))))
     ((not (compiled-generator-p relation))
      (warn-of-missing-access-function relation))
     (remove-duplicates-p
      (if (get symbol :loom-no-duplicates-compiled-function)
        (list-of 
         (wrap-with-conditional-recursion
          (apply (get symbol :loom-no-duplicates-compiled-function)
                 arguments)))
        (remove-duplicates
         (list-of 
          (wrap-with-conditional-recursion
           (apply symbol arguments))))))
     (t
      (if dont-listify-atomic-result-p
        (wrap-with-conditional-recursion
         (apply symbol arguments))
        (list-of
         (wrap-with-conditional-recursion
          (apply symbol arguments)))))) ))

(defun run-time-call-role (relation argument removeDuplicatesP)
  ;; Streamlined version of "run-time-apply-function" that applies a role
  ;;    relation to its argument;
  ;; Designed to evaluate everything at run-time;
  ;; CAUTION: Assumes that "execute-query" or its equivalent is wrapped
  ;;    around this call, to insure that query environment variables get bound;
  (ensure-sealed-predicate relation)
  (unless (and (typep relation 'tbox-relation)          ;  TAR 8/18/94
               (generator-predicate-p relation)         ; Suppress warning?
               (or (not (computed-p relation))
                   (check-argument-type argument (implied-domain relation))))
    (return-from run-time-call-role nil))
  (let ((symbol (predicate-symbol relation)))
    (if (compiled-generator-p relation)
      (if removeDuplicatesP
        (if (get symbol :loom-no-duplicates-compiled-function)
	  (slot-value-to-values
           (wrap-with-conditional-recursion
            (funcall (get symbol :loom-no-duplicates-compiled-function)
                     argument))
           relation)
	  (remove-duplicates
           (slot-value-to-values 
	    (wrap-with-conditional-recursion
             (funcall symbol argument))
            relation)))
        (slot-value-to-values
         (wrap-with-conditional-recursion
          (funcall symbol argument))
         relation))
      (warn-of-missing-access-function relation)) ))

(defun warn-of-missing-access-function (relation)
  ;; Warn of run-time call to a relation that hasn't been sealed;
  (grumble "Loom attempted to use the relation ~A as a generator of variable~%~
            bindings, but there is no generator code for this relation.~%~
           ~:[This is because it has been defined as a predicate that can be~%~
              applied only when all of its arguments are bound.~
             ~;Possibly the relation not been sealed.~]~%"
           (generate-external-reference relation)
           (generator-predicate-p relation)) )


  ;;
;;;;;; Helping functions for "form-generator-code"
  ;;

(defun form-role-generator-function (variable generatorTerm)
  ;; Called by "form-generator-code";
  ;; Return a form that generates bindings for "variable" using the
  ;;    generator term in "generatorTerm";
  ;; If "closed-role-test-p" and the generator predicate is not closed, then
  ;;    include a conditional throw to :run-time-open-role-catcher (only for roles);
  (let ((relation (first generatorTerm))
	(firstArg (second generatorTerm))
	(secondArg (third generatorTerm)))
    (cond
      ((eq variable secondArg)
       (translate-relational-formula
	 `(,relation ,firstArg)
	 :function))
      ((inverse relation)
       (translate-relational-formula
	 `(,(inverse relation) ,secondArg)
	 :function))
      ((total-p relation)               ; PROLOG
       "NOT YET IMPLEMENTED")
      (t
       (warn "Unable to create generator function for ~A using ~A"
	     variable generatorTerm))) ))

(defun form-temporal-generator-function (variable generatorTerm transition topLevelP)
  ;; Called by "form-generator-code";
  ;; Return a form that generates bindings for "variable" using the
  ;;    generator term in "generatorTerm" and the temporal operator "transition";
  ;; Note:  "variable" should not be in the generatorTerm;
  (if (keywordp (car generatorTerm))
      (case (car generatorTerm)
	((:and :or)                            ; TAR 9/2/93
         (let ((innerlayer (loop for term in (rest generatorTerm)
                                 collect (form-temporal-generator-function
                                          variable term transition nil))))
           (if topLevelP
             `(fast-remove-duplicates (append ,@innerlayer))
             `(append ,@innerlayer)) ))
        (:not (form-temporal-generator-function variable 
                                                (cadr generatorTerm)
                                                transition
                                                nil))
        ((:some :all)                   ; TAR 9/2/93
         (form-simple-temporal-generator-function variable
                                                  `(,(third generatorTerm)
                                                    ,(second generatorTerm)
                                                    ,(fourth generatorTerm))
                                                  :world-transition))
	(t
	 (grumble "Can't generate ~S bindings for ~A from the form~%~S"
		  transition variable generatorTerm)
         nil))
      (form-simple-temporal-generator-function variable
					       generatorTerm
					       transition)) )


(defun form-simple-temporal-generator-function (variable generatorTerm transition)
  ;; Called by "form-temporal-generator-code";
  ;; Return a form that generates bindings for "variable" using the
  ;;    generator term in "generatorTerm" and the temporal operator "transition";
  ;; Note:  "variable" should not be in the generatorTerm;
  ;; TO DO:  ADD PERFORMANCE ADVISORY FOR GENERATING "WIDOW-LIKE" TIME P0INTS
  (declare (ignore variable))
  (let* ((length (length generatorTerm))
	 (instance (form-query-instance (second generatorTerm))))
    (case length	; Changed reference to the (find...) form  TAR 5/24/93
      (2					; A concept generator
       (ecase transition
	 (:world-transition `(generate-all-world-transitions
                              (time-map ,instance) *query-agent-time*))
	 (:becomes `(generate-becomes-concept (time-map ,instance)
					      ,(form-query-concept (first generatorTerm))
					      *query-agent-time*))
	 (:ceases `(generate-ceases-concept (time-map ,instance)
					      ,(form-query-concept (first generatorTerm))
					      *query-agent-time*))
	 (:detects `(generate-detects (time-map ,instance)
				      :type
				      ,(form-query-concept (first generatorTerm))
				      *query-world-time*))
	 (:undetects `(generate-undetects (time-map ,instance)
					:type
					,(form-query-concept (first generatorTerm))
					*query-world-time*))))
      (3					; Binary relation
       (ecase transition
	 (:world-transition `(generate-plausible-world-role-transitions
			       (time-map ,instance)
			       ,(form-query-relation (first generatorTerm))
			       *query-agent-time*))
	 (:becomes `(generate-becomes-relation (time-map ,instance)
					       ,(form-query-relation (first generatorTerm))
					       *query-agent-time*))
	 (:ceases `(generate-ceases-relation (time-map ,instance)
					     ,(form-query-relation (first generatorTerm))
					     *query-agent-time*))
	 (:detects `(generate-detects (time-map ,instance)
				      ,(form-query-relation (first generatorTerm))
				      ,(if (atom (third generatorTerm))
					   (form-query-instance (third generatorTerm))
					   (third generatorTerm))
				      *query-world-time*))
	 (:undetects `(generate-undetects (time-map ,instance)
					:type
					,(form-query-relation (first generatorTerm))
					,(if (atom (third generatorTerm))
					     (form-query-instance (third generatorTerm))
					     (third generatorTerm))
					*query-world-time*))))
      (t (grumble "Don't know how to generate N-ARY RELATION time transitions")
         nil)) ))

  ;;
;;;;;; "translate-relational-formula"
  ;;

(defun translate-relational-formula (formula predicate/function 
                                             &key inverted-p dont-listify-p)
  ;; Return a Lisp form equivalent to the logical expression "formula";
  ;; "formula" applies a concept or relation to a list of arguments, either
  ;;     as a predicate or as a function (indicated by "predicate/function");
  (let ((predicateP (eq predicate/function :predicate))
	*outerCodeLayers* innerCode)
    (declare (special *outerCodeLayers*))
    (setq innerCode (help-translate-formula 
		      formula nil :predicate-p predicateP
                      :dont-listify-p dont-listify-p
		      :inverted-p inverted-p))
    (if (null *outerCodeLayers*)
	;; assumes generator produces a list-valued result:
        innerCode
	;; assumes generator produces an atomic value, or a set intended as
	;;    a value:
	`(let (queryResult)
	   ,(subst
	      (if predicateP
		  `(when ,innerCode
		     (setq queryResult t))
		  `(let ((innerResult ,innerCode))
		     (when innerResult
		       ,(if dont-listify-p      ;  TAR 1/5/94
                          '(setq queryResult innerResult)
		          '(push innerResult queryResult)))))
	      'DUMMYBODY
	      *outerCodeLayers*)
	   queryResult)) ))

(defun translate-context-formula (formula)
  ;; Helping function for "form-generator-code" and "form-context-query";
  ;; Generate Lisp code representing "formula" with special handling for
  ;;    coming up with a context valued result;
  (cond ((identifier-reference-p formula) 
         `(quote ,formula))
        ((or (atom formula)
             (quoted-p formula)
             (function-p formula))
         formula)
        (t (help-translate-formula formula nil))) )


(defun help-translate-formula (formula resultDomain
			       &key predicate-p inverted-p dont-listify-p
			       agentTime-offset dont-coerce-agent-time-p)
  ;; Helping function for "translate-formula";
  ;; Generate Lisp code representing "formula", and either return it, or
  ;;    substitute it into *outerCodeLayers*;
  ;; If "resultDomain" is set, "formula" is an argument to another predicate;
  ;; If "agentTime-offset", pass the agent time offset into
  ;;    the generation routines.  Note: Because code may be generated as an outer
  ;;    layer, or as a code body, the placement of wrap code is tricky;
  ;; If "resultDomain" is non-nil, then an agent time coersion wrapper will be
  ;;    wrapped around the result, unless "formula" represents a constant, or
  ;;    unless "dont-coerce-agent-time-p" is set
  ;;    (by "help-translate-non-constant-formula");
  ;; If "dont-listify-p", then produce a formula that leaves single-valued results
  ;;    alone.  Passed through.
  (let ((singleValuedResultDomainP 
	  (and resultDomain
	       (not (collection-concept-p resultDomain))))
	resultForm)
    (setq resultForm
	  (cond
	    ((identifier-reference-p formula)
	     (form-query-instance formula)) ; side-effect: push onto *letVariables*
	    ((or (atom formula)
		 (quoted-p formula)
		 (function-p formula))
	     (unless (question-mark-variable-p formula)
	       (setq dont-coerce-agent-time-p t))
	     formula)
	    (t
	     (case (car formula)
	       (:index
		(when predicate-p
		  (error "Indexing not yet implemented for predicates"))
		`(nth ,(third formula)
		      ,(help-translate-non-constant-formula
			(second formula) resultDomain)))
	       (:one-of ;; BUG?  DOES THIS NEED TO BE CALLED RECURSIVELY?
		`(list ,@(cdr formula)))
	       (:previously
		(integrity-check (not predicate-p))	; "formula" is a term
		;; avoid double wrapping of agent time declarations and coersion:
		(setq agentTime-offset nil)
		(setq dont-coerce-agent-time-p t)
		(help-translate-formula
		  (second formula) resultDomain :agentTime-offset '*previously*
                  :dont-listify-p dont-listify-p))      ; TAR 9/1/93
	       ((:set-of :collect)
		(help-translate-collection-formula formula))
	       (:predcall		; TAR 5/8/98
		(if (or predicate-p dont-listify-p)
		    (form-predicate-call-query formula)
		  (let ((temporaryVariable (gensym "TEMP")))
		    `(let ((,temporaryVariable ,(form-predicate-call-query formula)))
		       (when ,temporaryVariable ; Make list only if non-nil
			 (list ,temporaryVariable))))))
;	       ((:the-list :the-list*)  ;; Now in lowerlevel functions -TAR 4/2/99
;		`(,(if (eq (car formula) :the-list)
;		       'list
;		     'list*)
;		     ,@(loop for f in (rest formula)
;			   collect (translate-relational-formula f :function))))
	       (otherwise
		(let (outerLayeragentTimeOffset)
		  (when (and agentTime-offset singleValuedResultDomainP)
		    ;; agent time wrapper goes in outer layer(s), instead of here
		    (setq outerLayeragentTimeOffset agentTime-offset)
		    (setq agentTime-offset nil))
		  (help-translate-non-constant-formula
		    formula resultDomain
		    :predicate-p predicate-p
		    :inverted-p inverted-p
                    :agentTime-offset outerLayeragentTimeOffset
		    :dont-listify-p dont-listify-p)))))))     ; TAR 9/1/93
    (when (and resultDomain
	       (not (subconcept-p resultDomain (loom-constant CONSTANT)))
	       (not dont-coerce-agent-time-p))
      (setq resultForm
	    (if singleValuedResultDomainP
		`(get-temporally-offset-instance ,resultForm)
		`(get-temporally-offset-set-of-instances ,resultForm))))
    (wrap-with-agent-time-offset resultForm agentTime-offset) ))

(defun help-translate-non-constant-formula
       (formula resultDomain &key predicate-p inverted-p agentTime-offset
                dont-listify-p)
  ;; "formula" contains a relation applied to some arguments;
  ;; Translate each of the arguments, and then translate the
  ;;    top-level formula;
  ;; If "resultDomain", then the result will be substituted into
  ;;    *outerCodeLayers* (and the value returned will name a
  ;;    variable bound to the result of the query) UNLESS
  ;;    "resultDomain" specializes COLLECTION, in which case a subquery
  ;;    is returned (i.e., no outer code layers are generated);
  ;; If "agentTime-offset", then "resultDomain" must be non-nil, and the agent time
  ;;    wrapper it to be placed into an outer code layer;
  ;; If "dont-listify-p", then don't wrap a list form around single-valued
  ;;    relation generators.  Passed through.
  ;; Tricky: If a generator function is produced, it generates atomic values
  ;;    if *outerCodeLayers* exist, and list values otherwise;
  (declare (special *outerCodeLayers*))
 #L:trace-query  (trace-values "help-t-n-c-formula" formula resultDomain agentTime-offset)
  (when (and resultDomain
	     (collection-concept-p resultDomain))
    ;; QUESTION: ARE WE MISSING OUT ON AGENTTIME COERSION HERE???:
    (let ((subQuery (translate-relational-formula formula :function
                                                  :dont-listify-p dont-listify-p)))     ; TAR 9/1/93
      ;; TRY TO MAKE THIS DUPLICATE REMOVAL LOGIC MORE ELEGANT:
      (when (and (subconcept-p resultDomain (loom-constant Set))
		 (not (duplicate-free-generator-p formula)))
	(setq subQuery `(fast-remove-duplicates ,subQuery)))
      (return-from help-translate-non-constant-formula
	subQuery)))
  (let ((relation (car formula)) 
	simpleDomainArgs simpleRangeArg)
    (multiple-value-setq (simpleDomainArgs simpleRangeArg)
      (translate-formula-arguments formula predicate-p))
    (integrity-check (or (null agentTime-offset) resultDomain))
    (cond
      (predicate-p				; top level predicate
       (translate-top-level-predicate 
	 relation simpleDomainArgs simpleRangeArg
	 :inverted-p inverted-p))
      (resultDomain
       ;; must be a function used as an argument -- translate it into an
       ;;    outer layer of code:
       (translate-into-outer-layer
	     relation simpleDomainArgs resultDomain
	     :agentTime-offset agentTime-offset))
      ((null simpleDomainArgs)
       (form-unary-generator
	 nil :concept relation))
      ((and *outerCodeLayers*
            (or (question-mark-variable-p relation)
		(not (member relation '(:the-list :the-list*)))
	        (not (relation-is-single-valued-p relation))))
       ;; multiple-valued top level function form with outer layers  --
       ;;    "translate-relational-formula" requires that it also be an outer layer:
       (translate-into-outer-layer
	     relation simpleDomainArgs (loom-constant THING)
	     :agentTime-offset agentTime-offset))
      (t ;; single-valued top level function form
       (let ((resultForm
	       (form-n-ary-generator
		 nil simpleDomainArgs
		 :relation relation
		 :dont-listify-atomic-result-p (or dont-listify-p     ; TAR 9/1/93
                                                   *outerCodeLayers*)
		 :dont-remove-duplicates-p t)))
	 (if *outerCodeLayers*
	     ;; insure atomic-valued result:
	     (if (relation-is-single-valued-p relation)        ;  TAR 1/5/94
		 resultForm
		 `(first ,resultForm))
	     ;; generator insures list-valued result:
	     resultForm)))) ))

(defun translate-formula-arguments (formula predicateP)
  ;; Helping function for "help-translate-non-constant-formula";
  ;; Translate the arguments in "formula", possibly generating code that
  ;;    is placed in *outerCodeLayers*;
  ;; Return two values:
  ;;    (1 & 2) Code for evaluating the domain and range arguments;
  ;; If the head of "formula" is a variable, use THING as the result domain
  ;;    for each argument;
  (let* ((relation (first formula))
	 simpleDomainArgs simpleRangeArg)
    (if (or (question-mark-variable-p relation)
	    (member relation '(:the-list :the-list*)))
	(progn ;; "formula" either contains a question mark variable
	       ;; or a list forming operator applied to some arguments
	  (setq simpleDomainArgs
		(loop for arg in (cdr (if predicateP (butlast formula) formula))
		      collect (help-translate-formula arg *thing*)))
	  (when predicateP
	    (setq simpleRangeArg
		  (help-translate-formula (car (last formula)) *thing*))))
	(progn
	  (setq simpleDomainArgs
		(loop for domain in (etypecase relation
				      (UNARY-ENTITY nil)
				      (BINARY-RELATION (list (implied-domain relation)))
				      (N-ARY-RELATION (implied-domains relation)))
		      as arg in (cdr formula)
		      collect (help-translate-formula arg domain)))
	  (when predicateP
	    ;; tricky: if "relation" will be applied as a function (outputting
	    ;;    agentTime-current instances), then we disable agent time
	    ;;    coersion of the range argument:
	    (setq simpleRangeArg
		  (let ((conceptP (typep relation 'UNARY-ENTITY)))
		    (help-translate-formula 
		      (car (last formula))
		      (if conceptP relation (implied-range relation))
		      :dont-coerce-agent-time-p
		      (and (not conceptP)
                           (progn (ensure-sealed-predicate relation)
                                  t)
			   (null (get (predicate-symbol relation) 
				      :loom-compiled-predicate)))))))))
    (values simpleDomainArgs simpleRangeArg) ))

;;; IDEA: PUT CLOSED ROLE INDICATOR ON SET-VALUED ARGUMENTS, *NOT* ON :set-of.
;;;  BUT THEN, :collect WILL HAVE TO OVERRIDE THE INCOMING CLOSED ROLE INDICATOR:
(defun help-translate-collection-formula (formula)
  ;; Helping function for "help-translate-formula";
  ;; Generate Lisp code representing the collection expression "formula";
  (let* ((outputVariables (second formula))
	 (collectionBody (third formula))
         (inputVariables (set-difference   ; Must be done before existential call
                          (collect-free-variables collectionBody) 
                          (list-of outputVariables))))
    (setq collectionBody (eliminate-top-level-existentials collectionBody))     ;  TAR 10/20/94
    (if (eq (first formula) :set-of)
      ;; BUG: THIS WORKS FOR SIMPLE CASES, *EXCEPT* THAT IT RETURNS THE
      ;;    EMPTY SET ON FAILURE -- NOT RIGHT!!!  THE CATCH NEEDS TO BE
      ;;    PLACED INSIDE OF A PREDICATE THAT HAS SET-VALUED ARGUMENTS:
      (let* ((*runTimeClosedRoleGeneratorP* t)
             (queryCode
              (form-retrieve-query 
               outputVariables collectionBody inputVariables nil nil)))
        (declare (special *runTimeClosedRoleGeneratorP*))
        (wrap-with-run-time-open-role-catcher queryCode t))
      (form-retrieve-query outputVariables collectionBody inputVariables nil t)) ))

(defun translate-top-level-predicate
       (predicate simpleDomainArgs simpleRangeArg &key inverted-p)
  ;; Called by "help-translate-non-constant-formula";
  ;; Return a Lisp form that evaluates the predicate "predicate" applied to
  ;;    arguments "simpleDomainArgs" and "simpleRangeArg";
  ;; Note: "predicate" can be a unary concept, in which case "simpleDomainArgs"
  ;;    is null;
  (let (predicateForm)
    (when (question-mark-variable-p predicate)
      (setq predicateForm predicate)
      (setq predicate nil))
    (if (null simpleDomainArgs)
	(funcall (if inverted-p #'form-unary-test-not #'form-unary-test)
		 predicateForm simpleRangeArg :concept predicate)
	(funcall (if inverted-p #'form-binary-test-not #'form-n-ary-test)
		 predicateForm
		 (append simpleDomainArgs (list simpleRangeArg))
		 :relation predicate)) ))

(defun translate-into-outer-layer (relation arguments resultDomain &key agentTime-offset)
  ;; Situation: The formula being translated is a function "relation"
  ;;    applied to k-1 arguments "arguments" -- all arguments are constants;
  ;; Generate a for-loop, and substitute it into *outerCodeLayers*;
  ;; Return the iteration variable generated for that loop;
  ;; Note: All arguments have been coerced to return lists if so indicated
  ;;    by their result domains;
  (declare (special *outerCodeLayers* *runTimeClosedRoleGeneratorP*))
  (let* ((variable (form-gensym-variable "V"))
	 (generateForm
	   (wrap-with-agent-time-offset 
	     (form-n-ary-generator
	       nil
	       arguments
	       :relation relation
	       :dont-listify-atomic-result-p
	       (not (boundp '*runTimeClosedRoleGeneratorP*))
	       :dont-remove-duplicates-p t)
	     agentTime-offset))
	 (newLayer
	   (cond
	     ((collection-concept-p resultDomain)
	       `(let ((,variable
		       ,(cond
			 ;; BUG??: DOESN'T THIS BREAK ON NON-BINARY RELATIONS?
			  ((role-is-single-valued-p relation)
			   `(compute-members-of-instance ,generateForm))
			  ((relation-is-single-valued-p relation)
			   `(compute-members-of-instance (car ,generateForm)))
			  (t
			   generateForm))))
		  DUMMYBODY))
	     ((and (not (question-mark-variable-p relation))
                   (relation-is-single-valued-p relation)
		   (not (boundp '*runTimeClosedRoleGeneratorP*)))  ; TAR 9/16/98
              ;; TO DO: INSURE THAT SINGLE-VALUED N-ARY RELATION RETURNS AN ATOM:
	      `(let ((,variable ,generateForm))
		 ;; insure that we don't break on a null argument:
		 (and ,variable
		      DUMMYBODY)))
	     (t
	      `(loop for ,variable in ,generateForm
		    do DUMMYBODY)))))
    (setq *outerCodeLayers*
	  (if (null *outerCodeLayers*)
	      newLayer
	      (subst newLayer 'DUMMYBODY *outerCodeLayers*)))
    (values variable nil) ))


(defmethod relation-is-single-valued-p ((self BINARY-RELATION))
  ;; Return t if the relation "self", applied as a function,
  ;;    always returns a single value (or nil);
  (role-is-single-valued-p self) )

(defmethod relation-is-single-valued-p ((self N-ARY-RELATION))
  ;; Return t if the relation "self", applied as a function,
  ;;    always returns a single value (or nil);
  (or (single-valued-p self)
      (total-p self)                    ; PROLOG
      (and (or (computed-p self)
	       (member :role-with-method (system-attributes self))) ; TAR 10/27/93
           (not (member :multiple-valued (attributes self))))) )

(defmethod relation-is-single-valued-p ((self SYMBOL))    ; TAR 4/2/99
  (if (or (eq self :the-list)
	  (eq self :the-list*))
      t
    (error "Symbol ~S is not a valid relation." self)))

(defun collect-unused-variables (boundVariables expression)
  ;; Return a list of the free variables in "expression" that are
  ;;    not in the list "boundVariables";
  ;; The unused variables list that is returned is suitable for use
  ;;    in a (declare (ignore ...)) clause to silence compiler warnings;
  (let ((unusedVariables (set-difference boundVariables
					 (collect-free-variables expression))))
    #+:MCL (delete-if #'ccl:proclaimed-special-p unusedVariables)
    #-:MCL unusedVariables
    ))
  

(defun collect-free-variables (queryOrExpression &key validate-keyword-p)
  ;; Return a list of the free variables occurring in "queryOrExpression";
  (let (freeVariables)
    (labels ((walk-expression (queryOrExpression boundVariables)
	       (loop for expr in queryOrExpression
		    do
		    (cond
		      ((and (question-mark-variable-p expr)
			    (not (member expr boundVariables)))
		       (push expr freeVariables))
		      ((consp expr)
		       (let ((operator (if validate-keyword-p
					   (validate-keyword
					     (first expr) :query-p t :no-error-p t)
					   (first expr))))
			 (if (member operator '(:exists :forall :collect :set-of))  ; TAR 4/20/95
			     (walk-expression 
			       (cddr expr)           ; added! TAR 3/13/96
			       (append (list-of (second expr)) boundVariables))
			     (walk-expression expr boundVariables))))))))
      (walk-expression (list queryOrExpression) nil)
      (remove-duplicates freeVariables)) ))

(defun dollar-variable-p (expression)
  ;; Return t iff "expression" is a database-language variable which
  ;;    evaluates to a newly-created instance;
  (and (symbolp expression)
       (eql (aref (symbol-name expression) 0) #\$)) )

(defun identifier-reference-p (expression)
  ;; Return t iff "expression" is a legal identifier for a LOOM
  ;;    instance;
  (and (symbolp expression)
       (not (or (null expression)
                (keywordp expression)
                (member expression '(-INFINITY +INFINITY))
                (question-mark-variable-p expression)
                (dollar-variable-p expression)))) )

(defun question-mark-variable-p (expression)
  ;; Return t iff "expression" is a symbol prefixed by "?"
  (and (symbolp expression)
       (eql (aref (symbol-name expression) 0) #\?)) )


  ;;
;;;;;; "all-role-values", "the-role-value", "some-role-value"
  ;;

(defmacro all-role-values (instance roleOrName
			   &key dont-remove-duplicates-p 
			   role-name role-is-object-p)
  ;; Return a list of the fillers of the role "roleOrName" of "instance";
  ;; "role-name", if non-null, contains a symbol which names the role
  ;;    to be used -- in this case the parameter "roleOrName" gets ignored;
  ;; TO DO: REWRITE TO CALL "top-level-query" THAT AUTO WRAPS GOAL TABLE
  ;;    CODE AROUND RETRIEVE;
  (let ((*queryContext* *context*))
    (declare (special *queryContext*))
    (once-only (instance roleOrName)
      (let (fixedRoleName fixedRole roleForm applyForm)
        ;; "fixedRoleName" is set if "roleOrName" is quoted or if "role-name":
        (setq fixedRoleName
	      (or role-name
		  (when (and (quoted-p roleOrname)
			     (symbolp (second roleOrName)))
		    (second roleOrName))))
        (if fixedRoleName
	  (setq fixedRole (eval-relation-id fixedRoleName)) 
	  (setq roleForm
		(if role-is-object-p
                  `,roleOrName
                  `(get-sealed-relation ,roleOrName))))
        (setq applyForm
	      (form-n-ary-generator
	       roleForm
	       (list `(get-temporally-offset-instance ,instance))
	       :relation fixedRole
	       :dont-remove-duplicates-p dont-remove-duplicates-p))
        ;; wrap query declaration and goal table code around apply form:
        `(execute-query
	  ,(cond
	    ((not fixedRole)
	     (wrap-with-recursion-declaration applyForm :role-form roleForm))
	    ((recursive-p fixedRole)
	     (wrap-with-recursion-declaration applyForm))
	    (t
	     applyForm))) ))))

(defmacro some-role-value (instance roleOrName &key role-is-object-p) 
  ;; Return zero or one (possibly decoded) role filler;
  `(first (all-role-values
	    ,instance ,roleOrName
	    :role-is-object-p ,role-is-object-p )) )

(defmacro the-role-value (instance roleOrName &key no-error-p role-is-object-p)
  ;; Return a single value for the filler of the role "roleOrName"
  ;;    of "instance";
  (once-only (instance roleOrName)
    `(check-the-role-value
       (all-role-values
	 ,instance ,roleOrName
	 :role-is-object-p ,role-is-object-p)
       ,instance ,roleOrName ,no-error-p) ))

(defun check-the-role-value (fillers instance roleOrName no-error-p)
  ;; Helping function for "the-role-value";
 (cond
   ((atom fillers) fillers)
   ((cdr fillers)
    (unless no-error-p
      (error "Multiple fillers returned for the role ~S of instance ~S"
	     roleOrName instance)))
   (t (first fillers))) )

;; THIS IS INCLUDED FOR BACKWARD COMPATIBILITY:
(defun all-inverse-role-values (instanceOrName roleOrName)
  (obsolete all-inverse-role-values get-inverse-values)
  (get-inverse-values instanceOrName roleOrName) )


  ;;
;;;;;; Run-time query test functions 
  ;;

(defun same-as-p (set1 set2)
  ;; Version of "set-equal-p" that handles atomic as well as list arguments;
  ;; Return T iff lists "set1" and "set2" contain the same members;
  ;; Note:  Assumes that the sets do not contain duplicates;
  (if (atom set1)
      (if (atom set2)
	  (filler-equal set1 set2)			; atom and atom
	  (and (filler-equal set1 (first set2))	; atom and list
	       (null (rest set2))))
      (if (atom set2)
	  (and (filler-equal (first set1) set2)	; list and atom
	       (null (rest set1)))
	  (if (null (cdr set1))			; list and list
	      (and (filler-equal (car set1) (car set2))
		   (null (cdr set2)))
	      (and (= (length set1) (length set2))
		   (loop for item in set1
			 always (find item set2 :test #'filler-equal)))))) )

(defun fast-remove-duplicates (list)
  ;; Accelerated version of "remove-duplicates";
  ;; CAUTION: Assumes that if the first element of "list" is not a string, then
  ;;    there are no strings in "list";
  (cond
   ((null (rest list))
    list)
   ((stringp (first list))
    (fast-remove-equal-duplicates list))
   (t
    (fast-remove-eql-duplicates list))) )

(defun fast-remove-eql-duplicates (list)
  ;; Accelerated version of "remove-duplicates" that utilizes variable-sized
  ;;    hash tables to eliminate duplicates from very long lists;
  (let ((duplicatesP nil)
	length table result #+:measures hashkey)
    (cond
      ((< (setq length (length list)) 100)
       ;; CONSIDER USING "delete-duplicates" HERE:
       (remove-duplicates list :test #'filler-eql))
      (t
       (setq table (cond
		     ((< length 200) *remove-duplicates-table-200*)
		     ((< length 600) *remove-duplicates-table-600*)
		     ((< length 2000) *remove-duplicates-table-2000*)
                     ((< length 8000) *remove-duplicates-table-8000*)
		     (t *remove-duplicates-table-unlimited*)))
       (clrhash table)
       #+:measures
       (clrhash *remove-dim-duplicates-table*)
       (loop for item in list
	   do #-:measures
	      (if (gethash item table)
		  (setq duplicatesP t)
		  (setf (gethash item table) item))
	      #+:measures
	      (if (ms:dim-number-p item)
		  (if (gethash (setq hashkey (list (ms::dim-value0 item)
						   (ms::dim-prim-id item)))
			       *remove-dim-duplicates-table*)
		      (setq duplicatesP t)
		      (setf (gethash hashkey *remove-dim-duplicates-table*)
			item))
		 (if (gethash item table)
		     (setq duplicatesP t)
		     (setf (gethash item table) item))))
       (if duplicatesP
	   (progn
	     (maphash #'(lambda (key value) (declare (ignore key)) 
				(push value result))
		      table)
	     #+:measures
	     (maphash #'(lambda (key value) (declare (ignore key)) 
				(push value result))
		      *remove-dim-duplicates-table*)
	     result)
	 list))) ))



; (defun fast-remove-equal-duplicates (list)
;   ;; Accelerated version of "remove-duplicates" with equal test;
;  ;; TO DO: ACCELERATE IT: THIS CODE IS STILL THE UNOPTIMIZED QUADRATIC:
;  (remove-duplicates list :test #'filler-equal) )

(defun fast-remove-equal-duplicates (list)
  ;; Accelerated version of "remove-duplicates" with equal test that utilizes
  ;;    variable-sized hash tables to eliminate duplicates from very long lists;
  ;; TRICKY:  For conses, we hash on the first item in the cons and store the
  ;;          entire item in a list as the hash value.  This means adding a
  ;;          a test for membership in the resulting hash value.
  (labels ((firstAtom (x) 
	     ;; Returns the first atom in the list X
	     (let ((a (first x)))
	       (cond #+:measures
		     ((ms:dim-number-p a)
		      (ms::dim-value0 a))
		     ((atom a)
		      a)
		     (t 
		      (firstAtom (first a)))))))
    (let ((duplicatesP nil)
	  length table result hashkey)
      (cond
       ((< (setq length (length list)) 100)
	;; CONSIDER USING "delete-duplicates" HERE:
	(remove-duplicates list :test #'filler-equal))
       (t
	(setq table (cond
		     ((< length 200) *remove-duplicates-table-200*)
		     ((< length 600) *remove-duplicates-table-600*)
		     ((< length 2000) *remove-duplicates-table-2000*)
                     ((< length 8000) *remove-duplicates-table-8000*)
		     (t *remove-duplicates-table-unlimited*)))
	(clrhash table)
	(clrhash *remove-list-duplicates-table*)
	#+:measures
	(clrhash *remove-dim-duplicates-table*)
	(loop for item in list
	    do (cond ((consp item)
		      (setq hashkey (firstAtom item))
		      (if (member item (gethash hashkey *remove-list-duplicates-table*)
				  :test #'filler-equal)
			  (setq duplicatesP t)
			(push item (gethash hashkey *remove-list-duplicates-table*))))
		     #+:measures
		     ((ms:dim-number-p item)
		      (if (gethash (setq hashkey (list (ms::dim-value0 item)
						       (ms::dim-prim-id item)))
				   *remove-dim-duplicates-table*)
			  (setq duplicatesP t)
			(setf (gethash hashkey *remove-dim-duplicates-table*)
			  item)))
		     (t (if (gethash item table)
			    (setq duplicatesP t)
			  (setf (gethash item table) item)))) )
	(if duplicatesP
	    (progn
	      (maphash #'(lambda (key value) (declare (ignore key)) 
				 (push value result))
		       table)
	      #+:measures
	      (maphash #'(lambda (key value) (declare (ignore key)) 
				 (push value result))
		       *remove-dim-duplicates-table*)
	      (maphash #'(lambda (key value) (declare (ignore key))
				 (dolist (v value) (push v result)))
		       *remove-list-duplicates-table*)
	      result)
	  list))) )))


;;; BUGS:
#|
"all-role-values" DOESN'T CALL "insure-visibility-of-updates".

"(retrieve ?f (?r ?i ?f))" DOESN'T WRAP WITH 
|#
;;; TO DO:
#|
:set-of  IS NOT YET IMPLEMENTED

WE STILL HAVE A COUPLE OF "(list-of ...)" CONSTRUCTS IN RUN-TIME TESTS:
   NOW THAT "atomic-valued-p" IS FAST WE SHOULD BE ABLE TO ELIMINATE
   THESE CALLS.

|#
