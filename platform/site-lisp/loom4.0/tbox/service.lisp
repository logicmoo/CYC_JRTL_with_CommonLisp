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

;;; SERVICE.LISP (TBOX)

(in-package "LOOM")

(export '( concept relation
	  subconcept-p
	  create-concept
	  most-general-concepts most-specific-concepts
	  map-reified-concepts 
	  source-definition add-to-definition remove-from-definition
	  concept-names relation-names
	  ))

;;; Let functionality of the common-lisp set through in LOOM:

(defun SET (symbol value)		; TAR 3/23/93
  (COMMON-LISP:set symbol value))

;;; Contains low-level "service" functions used by higher-level LOOM code

;;; "who-calls" for system debuggers:
#+:TI
(progn
  (shadow '(who-calls))
  (defmacro who-calls (symbol)
    `(TICL:who-calls
       ,(if (quoted-p symbol) symbol `',symbol)
       'loom nil nil)))


#+CLTL2 (declaim (inline filler-equal))
#-CLTL2 (proclaim '(inline filler-equal))
(defun filler-equal (x y)
  ;; Equality test for fillers.  Defined mainly to allow easy changes
  ;;   to the equality test.
  #-:measures (equal x y)
  #+:measures (ms:dim-equal x y))

#+CLTL2 (declaim (inline filler-equal))
#-CLTL2 (proclaim '(inline filler-equal))
(defun filler-eql (x y)
  ;; Eql test for fillers.  Defined mainly to allow easy changes
  ;;   to the equality test.
  #-:measures (eql x y)
  #+:measures (ms:dim-eql x y))


  ;;
;;;;;; Support for concept creation
  ;;

;;; These routines are used when creating or defining concepts to help find the
;;;    proper context, to find already existing concepts with the
;;;    same name, and for creating concept objects;

(defun validate-options-list-p (list)
  ;; Complain an return nil if "list" is not an alternating list of
  ;;    keywords and values;
  (let ((keywordP t))
    (when (not (evenp (length list)))
      (complain "~%Odd number of items in options (keyword-value) list:~%~S   ~
                ~&Probably a value is missing."
               list)
      (return-from validate-options-list-p nil))
    (loop for item in list
          do
          (progn
            (when (and keywordP
                       (not (keywordp item)))
              (complain 
               "~%Possible missing keyword.  Expected a keyword and got:~%   ~
                ~S" item)
              (return-from validate-options-list-p nil))
            (setq keywordP (not keywordP))))
    t ))

;;; BUG???: WHEN A CONCEPT IS CREATED IN A CONTEXT *BELOW* A CONTEXT THAT HAS
;;;    A CONCEPT WITH THE SAME NAME, THEN "evaluate-concept-name" FINDS
;;;    THE HIGHER CONCEPT, SO A NEW CONCEPT DOESN'T GET CREATED; IF
;;;    A :context OPTION IS ATTACHED TO THE LOWER DEFINITION, THIS SEMANTICS
;;;    MAY BE A POOR CHOICE.

#+CLTL2 (declaim (inline compute-context-from-source-options))
#-CLTL2 (proclaim '(inline compute-context-from-source-options))
(defun compute-context-from-source-options (sourceOptions)
  ;; Return the context indicated by the :context option in
  ;;    sourceOptions, or else the current context *context*;
  ;; Called by "redefine-concept" and "define-concept--internal";
  (if (getf sourceOptions :context)
      (coerce-to-context (getf sourceOptions :context))
      *context*) )

;; THIS WILL BE OBSOLETE WHEN WE ELIMINATE THE "s" FROM PARTITION IDS:
#+CLTL2 (declaim (inline concept-or-relation-to-partition-id))
#-CLTL2 (proclaim '(inline concept-or-relation-to-partition-id))
(defun concept-or-relation-to-partition-id (concept/relation)
  ;; Return the partition id corresponding to ":concept/:relation";
  (ecase concept/relation
      (:concept :concepts)
      (:relation :relations)
      (:property :concepts)) )

#+CLTL2 (declaim (inline concepts-or-relations))
#-CLTL2 (proclaim '(inline concepts-or-relations))
(defun concepts-or-relations (metaConcept)
  ;; Return the partition id of the concept or relation "metaConcept";
  (concept-or-relation-to-partition-id
    (concept-or-relation metaConcept)) )

(defun find-concept-or-relation (name conceptOrRelation context)
  ;; Return the concept whose name matches "name", in the name
  ;;    space indicated by "conceptOrRelation";
  (evaluate-identifier 
    name
    (concept-or-relation-to-partition-id conceptOrRelation)
    context) )

(defun find-concept-or-relation-in-context-sublattice (name conceptOrRelation context)
  ;; Search all contexts at or below "context" for a concept or 
  ;;    relation having the name "name";
  (let ((partitionName 
         (concept-or-relation-to-partition-id conceptOrRelation))
	alreadyVisitedContexts)
    (labels 
      ((search-lower-contexts (context)
         (loop for cxt in (child-contexts context)
               unless (member cxt alreadyVisitedContexts)
               do
               (let ((result
                      (evaluate-identifier-locally name partitionName cxt)))
                 (when result
                   (return-from find-concept-or-relation-in-context-sublattice
                     result)))
               (push cxt alreadyVisitedContexts)
               (search-lower-contexts cxt))))
      (or (evaluate-identifier name partitionName context)
	  (search-lower-contexts context)) )))

(defun create-concept (name concept/relation contextOrNil &key dont-list-as-uninterned)
  ;; Create a new concept or relation;
  ;; If "name" is non-nil, assign it the name "name", and key it into the
  ;;    appropriate name space;
  ;; If "name" is nil, then push the new concept onto the list of uninterned
  ;;    concepts, unless "dont-list-as-uninterned" is set;
  (let* ((class (ecase concept/relation
		  (:concept (CLOS::find-class 'UNARY-CONCEPT))
                  (:relation (CLOS::find-class 'BINARY-RELATION))
		  (:property (CLOS::find-class 'UNARY-RELATION))))
	 (newConcept (make-instance class)))
    (if name
	(intern-concept newConcept name contextOrNil)
        (unless dont-list-as-uninterned
	  (push newConcept *list-of-uninterned-concepts*)))
    (when (loom-concept newConcept)     ; help bootstrap avoid this code
      (setf (cached-types newConcept) (list (loom-concept newConcept))))
    newConcept ))

(defun remove-system-named-concepts (listOfConcepts)
  ;; Remove concepts with system-defined names from "listOfConcepts";
  (loop for c in listOfConcepts
       unless (system-defined-name-p c)
       collect c) )


  ;;
;;;;;; Interning and uninterning concepts
  ;;

;;; Internment Strategy:
;;;    Named concepts and relations get interned immediately into the
;;;    :concepts or :relations partitions so that they can be referenced
;;;    elsewhere during the parsing phase.
;;;
;;;    Internment of concepts or relations as instances is deferred until
;;;    sealing to avoid unnecessary activity if merging or revising occurs.
;;;
;;;    Internment as an instance occurs automatically for all relations, and
;;;    for concepts with explicitly-specified identifiers.  Also, it occurs
;;;    whenever there is a demand for a predicate symbol, or if "retrieve"
;;;    or "tell" decides that a constant should reference a concept or relation.

(defun intern-concept (self name context
		       &key dont-update-list-of-uninterned-concepts-p)
  ;; Set "(name self)" to "name", add "name" to the
  ;;    context "context", and set
  ;;    "(context self)" to "context";
  ;; Side-effect: Bump the counter *count-of-unclassified-concepts* if
  ;;    "self" is not classified;
  ;; Caution: No check is made to see if "self" has already
  ;;    been interned (i.e., we don't remove it from the list of "unidentified
  ;;    objects" if it was placed there previously);
  ;; TO DO: KEEP TEMPORARY CONCEPTS OFF OF LIST OF UNINTERNED CONCEPTS;
  (setf (name self) name)
  (when (null context)
    (setq context
	  (if (system-defined-concept-p self)
	      (determine-context-of-system-defined-concept self)
	      *context*)))
  (setf (context self) context)
  (when (not (classified-p self))
    (incf *count-of-unclassified-concepts*))
  ;; intern into :concepts or :relations partition:
  (intern-object name self (concepts-or-relations self) context)
  (unless dont-update-list-of-uninterned-concepts-p
    (delf *list-of-uninterned-concepts* self)) )

(defun unintern-concept (self &key name-rebound-by-merge-p being-discarded-p)
  ;; Unintern "self" from its context;
  ;; Also, unbind identifier and predicate symbol (if they exist), and possibly
  ;;    decrement count of unclassified concepts;
  (integrity-check (typep self 'TBOX-CONCEPT))
  (when (null (context self))
    (when being-discarded-p
      ;; insure that its not on the list of uninterned concepts:
      (delf *list-of-uninterned-concepts* self))
    (return-from unintern-concept nil))
  (when (not (classified-p self))
    (decf *count-of-unclassified-concepts*))
  (unless name-rebound-by-merge-p
    ;; unintern unless the name of "self" has been rebound to another
    ;;    concept during a merge operation:
    (unintern-object (name self) (concepts-or-relations self) (context self)))
  (when (identifier self)
    ;; unintern from :instances partition:
    (when (get-instance (identifier self))
      ;; "self" may have already been erased from the :instances partition:
      (unintern-object (identifier self) :INSTANCES (context self)))
    (setf (identifier self) nil)
    (unbind-predicate-symbol self))
  ;; mark "self" as uninterned:
  (setf (context self) nil)
  (unless being-discarded-p
    (push self *list-of-uninterned-concepts*)) )

(defun determine-context-of-system-defined-concept (self)
  ;; Called by "intern-concept";
  ;; Situation: "self" is being interned, and doesn't have an assigned
  ;;    context;
  ;; Determine a context for "self" by locating other concepts
  ;;    that "self" depends on that have been assigned a context, and
  ;;    choosing a context that inherits all of them;
  ;; TO DO: CONSIDER ADDING LOGIC THAT AVOIDS RETURNING "BUILT-IN-THEORY"
  ;;    (POSSIBLY IT COULD RETURN *context* INSTEAD);
  (flet ((help-determine-context (self)
	   (or (context self)
	       (determine-context-of-system-defined-concept self)) ))
    (let ((contexts (loop for dep in (depend-ons self)
		      when (and (typep dep 'TBOX-CONCEPT)     ;  TAR 6/27/95
                                (neq dep (loom-constant THING)))
		      collect (help-determine-context dep))))
      ;; note: concepts and relations can't directly depend on depend-ons
      ;;    of computed features (because of cycles)
      (loop for f in (implied-computed-features self)
            as cxt = (context-of-feature f)
	    when cxt do (pushnew cxt contexts))
      ;; Add in contexts of the instances that participate in the set relation.
      (when (and (typep self 'UNARY-ENTITY)
                 (defined-set-feature self)          ;  TAR 6/27/95
                 (consp (members (defined-set-feature self))))          ;  TAR 3/11/96
        (loop for m in (members (defined-set-feature self))
              for cxt = (context m)
              when cxt do (pushnew cxt contexts)))
      (highest-encompassing-context contexts) )))

(defun sub-context-p (context1 context2)
  ;; Return t if "context1" is a descendent of "context2";
  (member context2 (context-precedence-list context1)) )

(defun most-specific-contexts (contextList)
  ;; Return the most specific contexts in "contextList";
  (when (null (cdr contextList))
    (return-from most-specific-contexts contextList))
  (setq contextList (copy-list contextList))
  (loop for tail1 on contextList
       when (car tail1)
       do (loop for tail2 on (cdr tail1)
	       when (car tail2)
	       do (if (sub-context-p (car tail1) (car tail2))
		      (setf (car tail2) nil)
		      (when (sub-context-p (car tail2) (car tail1))
			(setf (car tail1) nil)
			(return nil)))))
  (delete nil contextList) )

(defun highest-encompassing-context (contextList)
  ;; Helping function for "determine-context-of-system-defined-concept";
  ;; Return the highest context which is a descendent of all the
  ;;    contexts in "cxtList";
  (let ((rootContexts (most-specific-contexts contextList)))
    (labels ((find-encompassing-context 
	       (context)
	       (let ((childContexts (child-contexts context)))
		 ;; breadth-first search gets highest context
		 (when childContexts
		   (loop for child in childContexts
			when (loop for root in rootContexts
				  always (sub-context-p child root))
			do (return-from highest-encompassing-context child))
		   (loop for child in childContexts
			do (find-encompassing-context child))))))
      (if (null (rest rootContexts))
	  (return-from highest-encompassing-context (first rootContexts))
	  (loop for cxt in rootContexts
	       do (find-encompassing-context cxt))) )))

(defun bind-identifier&predicate-symbol (self &key identifier symbol)
  ;; Intern "self" into the :instances partition, and assign it
  ;;    a predicate symbol;
  ;; Called by "seal-one-concept" and "find-or-create-concept-identifier";
  ;; Note: Currently both kinds of binding happen in lock step -- this
  ;;    decision could be reversed (i.e., the bindings could happen
  ;;    independently) if future circumstances indicate such a need;
  ;; Caution: If "self" already has an identifier, then the new identifier
  ;;    gets dropped on the floor unless it happens to be the same as
  ;;    one of the definition names;
  (if (identifier self)
      ;; we don't intern "self" as instance more than once:
      (when (and identifier
		 (neq identifier (identifier self))
		 (loop for defn in (source-definitions self)
		       never (eq (car defn) identifier)))
	  (complain "~&Warning -- When merging into concept or relation ~S~%   ~
                  Identifier ~S discarded because ~S already ~%   ~
                  has an identifier ~S" self identifier self (identifier self)))
      (intern-concept-as-instance self identifier))
  (when (cdr (source-definitions self))         ; DGB 6/18/93
    (loop for defn in (source-definitions self)
	  when (neq (car defn) (identifier self))
	  do (intern-concept-as-instance self (car defn))))
  (bind-predicate-symbol self symbol) )

(defun intern-concept-as-instance (self identifier)
  ;; Helping function for "intern-concept";
  ;; Generate an identifier for the concept or relation "self", and
  ;;    attach it to "self";
  ;; Intern "self" into the :instances partition;
  ;; The identifier of "self" matches its name unless either there is a
  ;;    previously interned instance with the same identifier or there
  ;;    is an as yet uninterned relation with the same name;
  (let* ((name (name self))
	 (context (context self))
         (thePackage (package-of-symbol name)))
    (flet ((name-is-taken-p (name conceptP)
	     (let ((matchingRelation (get-relation name :context context
						   :no-error-p t))
		   (existingInstance (get-instance name :context context)))
	       (or (and existingInstance
			(not (system-defined-instance-p existingInstance)))
		   (and conceptP
			matchingRelation
			(eq name (identifier matchingRelation)))))))
      (when (null identifier)
	(setq identifier
	      (typecase self
		(REIFIED-RELATION
		 (symbol-append ("REIFIED-" name) thePackage))
		(UNARY-CONCEPT
		 (if (name-is-taken-p name t)
		     (symbol-append (name "-CONCEPT") thePackage)
		     name))
		(otherwise
		 (if (name-is-taken-p name nil)
		     (symbol-append (name "-RELATION") thePackage)
		     name)))))
      (setf (identifier self) identifier)
      (intern-object identifier self :INSTANCES context) )))

(defun bind-predicate-symbol (self symbol)
  ;; Generate a unique symbol "context"^"(identifier self)" for the
  ;;    concept or relation "self";
  ;; Point the symbol at "self";
  ;; We attach predicate and access functions to this symbol;
  ;; If "symbol" is non-nil, use that instead of generating a new one;
  ;; Note: If "self" already has a predicate symbol, we don't generate
  ;;    another one;
  (when (predicate-symbol self)
    (return-from bind-predicate-symbol nil))
  (let* ((context (context self)))
    (if (null symbol)
	 (setq symbol
	       (create-predicate-symbol (identifier self) context))
	 (proclaim `(special ,symbol)))      ; <== THIS MAY NOT BE NECESSARY???
    (setf (predicate-symbol self) symbol)
    (setf (symbol-value symbol) self) ))

(defun create-predicate-symbol (name context)
  ;; Return a symbol that combines "name" and the name of "context"
  ;;    into a predicate symbol;
  ;; Declare the symbol special, so that LOOM code can reference them without
  ;;    causing compiler warnings;
  ;; Intern the new symbol in the same package as "name" unless "name"
  ;;    is in the LISP package, in which case the symbol should be interned 
  ;;    in the LOOM package;
  ;; Called by "bind-predicate-symbol" and "form-let-binding-clause";
  (let ((symbol
         (intern 
          (string-append 
           (name context) "^" name)
          (package-of-symbol name))))
    (proclaim `(special ,symbol))
    symbol ))

(defun package-of-symbol (symbol)
  ;; Return the package belonging to "symbol" unless it names the Lisp
  ;;    package, in which case return the "LOOM" package;
  (if (common-lisp-symbol-p symbol)
    (symbol-package 'Thing)
    (symbol-package symbol)) )

(defun common-lisp-symbol-p (symbol)
  ;; Return true if "symbol" is interned in the CommonLisp package;
  (eq (symbol-package symbol) (symbol-package 'CONS)) )

(defun unbind-predicate-symbol (self)
  ;; Delink pointer from "self" to its predicate symbol, and pointer from that
  ;;    symbol to "self"
  ;; We check to make sure it is bound, just in case of an interrupt or crash
  ;;    in the middle of doing this the first time;
  ;; We do this carefully in case the predicate symbol attached to "self"
  ;     has already been rebound to another concept;
  (let ((symbol (predicate-symbol self)))
    (when (and (boundp symbol) (eq (symbol-value symbol) self))
      (makunbound symbol))
    (clear-loom-predicate-property-list symbol)
    (setf (predicate-symbol self) nil) ))

(defun transfer-internment-to-into-concept (mergingConcept intoConcept)
  ;; Called by "merge-merging-components-into-into-concept";
  ;; Situation: "mergingConcept" was interned prior to the current merge
  ;;    operation, and its symbol table entry should be rebound to "intoConcept";
  ;; Transfer information bound to "mergingConcept" over to the (possibly
  ;;    uninterned) concept "intoConcept";
  ;; If "mergingConcept" is interned, but "intoConcept" is not, then
  ;;    intern "intoConcept";
  ;; Unintern "mergingConcept";
  (let ((mergingName (name mergingConcept))
	(mergingContext (context mergingConcept))
	(intoContext (context intoConcept)))
    (integrity-check mergingName)
    (if intoContext
	;; when "intoConcept" is already interned we transfer internment
	;;     information by calling "intern-object" because "intern-concept"
	;;     has unwanted side-effects:
	(intern-object mergingName intoConcept
			 (concepts-or-relations mergingConcept) mergingContext)
	(intern-concept intoConcept mergingName mergingContext))
    (when (identifier mergingConcept)
      (bind-identifier&predicate-symbol
	intoConcept
	:identifier (identifier mergingConcept)
	:symbol (predicate-symbol mergingConcept))
      ;; finish uninterning "mergingConcept" from :instances partition
      ;;    (prevents call to "unintern-concept" below from messing up things):
      (setf (identifier mergingConcept) nil))
    ;; because "mergingConcept" will be discarded, eliminate it
    ;;    from list of uninterned concepts:
    (unintern-concept mergingConcept
		      :name-rebound-by-merge-p t
		      :being-discarded-p t) ))

(defun find-or-create-concept-identifier (self)
  ;; Return an identifier for the concept or relation "self";
  ;; Side-effect: "self" is interned into the :instances partition;
  (or (identifier self)
      (progn
	(bind-identifier&predicate-symbol self)
	(identifier self))) )


  ;;
;;;;;; "subconcept-p" (subsumption test for classified concepts)
  ;;

(defmacro subconcept-p (concept1 concept2 &key cant-be-equal-p)
  ;; Expand to a fast search of all super-concepts of "concept1";
  ;; Assumes both concepts are classified;
  ;; If "cant-be-equal-p", a test to see if the two concepts are the
  ;;    same is eliminated;
  (once-only (concept1 concept2)
    (if cant-be-equal-p
	`(and (sub-concepts ,concept2)
	      (member ,concept2 (all-super-concepts ,concept1)))
	`(or (eq ,concept1 ,concept2)
	     (and (sub-concepts ,concept2)
		  (member ,concept2 (all-super-concepts ,concept1))))) ))



  ;;
;;;;;; Most-General and Most-Specific Evaluators
  ;;

(defun most-general-concepts (conceptList &key destructive-p)
  ;; Return the most general concepts in "conceptList";
  ;; Note:  We assume that all concepts in "conceptList" reside in the
  ;;    classification taxonomy.
  (when (null (cdr conceptList))		; avoid unnecessary list copying
    (return-from most-general-concepts conceptList))
  (unless destructive-p
    (setq conceptList (copy-list conceptList)))
  (loop for tail1 on conceptList
       when (car tail1)
       do (loop for tail2 on (cdr tail1)
	       when (car tail2)
	       do (if (subconcept-p (car tail2) (car tail1))
		      (setf (car tail2) nil)
		      (when (subconcept-p  (car tail1) (car tail2))
			(setf (car tail1) nil)
			(return nil)))))
  (delete nil conceptList) )

(defun most-specific-concepts (conceptList &key destructive-p)
  ;; Return the most specific concepts in "conceptList";
  ;; Note:  We assume that all concepts in "conceptList" reside in the
  ;;    taxonomy;
  (when (null (cdr conceptList))		; avoid unnecessary list copying
    (return-from most-specific-concepts conceptList))
  (unless destructive-p
    (setq conceptList (copy-list conceptList)))
  (loop for tail1 on conceptList
       when (car tail1)
       do (loop for tail2 on (cdr tail1)
	       when (car tail2)
	       do (if (subconcept-p (car tail1) (car tail2))
		      (setf (car tail2) nil)
		      (when (subconcept-p  (car tail2) (car tail1))
			(setf (car tail1) nil)
			(return nil)))))
  (delete nil conceptList) )

;; PROBABLY OBSOLETE REPLACEMENT:
;(defun most-specific-concepts (conceptList)
;  ;; Return the most specific concepts in "conceptList";
;  ;; Note:  We assume that all concepts in "conceptList" reside in the
;  ;;    taxonomy;
;  (cond
;    ((null (cdr conceptList))			; avoid unnecessary list copying
;     (return-from most-specific-concepts conceptList))
;    ((null (cddr conceptList))			; avoid unnecessary list copying
;     (let ((concept1 (first conceptList))
;	   (concept2 (second conceptList)))
;       (cond
;	 ((subconcept-p concept1 concept2) (list concept1))
;	 ((subconcept-p concept2 concept1) (list concept2))
;	 (t conceptList))))
;    (t
;     (setq conceptList (copy-list conceptList))
;     (loop for tail1 on conceptList
;	  when (car tail1)
;	  do (loop for tail2 on (cdr tail1)
;		  when (car tail2)
;		  do (if (subconcept-p (car tail1) (car tail2))
;			 (setf (car tail2) nil)
;			 (when (subconcept-p  (car tail2) (car tail1))
;			   (setf (car tail1) nil)
;			   (return nil)))))
;     (delete nil conceptList))) )

  ;;
;;;;;; "reparameterize-lambda-expression"
  ;;

(defun reparameterize-lambda-expression (lambdaExpr newParameters &key body-p)
  ;; Substitute "newParameters" for the parameters in "lambdaExpr"
  ;;    and return the result;
  ;; Rename any variables which might collide with names in
  ;;    "newParameters";
  ;; If "body-p", just return the body of the reparameterized expression;
  (setq lambdaExpr
	(rename-symbols-in-form lambdaExpr newParameters))
  (let* ((oldParameters (cadr lambdaExpr))
	 (body (destructively-substitute-variable-name 
		 (copy-tree (cddr lambdaExpr))
		 (pop newParameters)
		 (pop oldParameters))))
    (loop for parameter in newParameters
	 do (destructively-substitute-variable-name
	      body parameter (pop oldParameters)))
    (when (and (consp (car body))
	       (eq (caar body) 'declare) 
	       (boundp '*ignoredParameters*))
      (let (survivingDeclareClauses)
	(declare (special *ignoredParameters*))
	(loop for clause in (cdar body)
	     do
	     (if (eq (car clause) 'ignore)
		 (loop for var in (cdr clause)
		      do (push var *ignoredParameters*))
		 (push clause survivingDeclareClauses)))
	(if survivingDeclareClauses
	    (setf (car body)
		  `(declare ,@ survivingDeclareClauses))
	    (setq body (cdr body)))))
    (cond
      ((not body-p)
       `(lambda ,newParameters ,@body))
      ((null (cdr body))
       (car body))
      ((eq (caar body) 'declare)
       `(let () ,@body))
      (t
       `(progn ,@body))) ))

(defun rename-symbols-in-form (form symbols &key destructive-p)
  ;; Return a form wherein all symbols that match an element of
  ;;    "symbols" have been renamed;
  ;; If "destructive-p", destructively modify "form";
  ;; Caution: Correct semantics dictates that only parameters and
  ;;    local variables get renamed;  However, we don't check for
  ;;    the possibility that, for example, a function might be
  ;;    named "?instance";
  (let ((resultForm form))
    (labels ((find-symbol-in-form-p (symbol expression)
	       (if (atom expression)
		   (eq symbol expression)
		   (loop for elt in expression
			thereis (find-symbol-in-form-p symbol elt))))
	     (generate-unique-symbol (badSymbol)
	       (let ((counter 0)
                     (thePackage
                      (package-of-symbol badSymbol))
		     newSymbol)
		 (loop
		   (setq newSymbol
			 (symbol-append 
			   (badSymbol "-" (format nil "~S" (incf counter)))
			   thePackage))
		   (when (not (find-symbol-in-form-p newSymbol resultForm))
		     (return newSymbol)))))	; exit loop
	     (rename-one-symbol (badSymbol)
	       (let ((newSymbol (generate-unique-symbol badSymbol)))
		 (when (and (eq resultForm form)
			    (not destructive-p))
		   (setq resultForm (copy-tree form))
		   (setq destructive-p t)) 
		 (destructively-substitute-variable-name
		   resultForm newSymbol badSymbol :form-p t))))
      (loop for s in symbols
	   when (find-symbol-in-form-p s resultForm)
	   do (rename-one-symbol s))
      resultForm )))

(defun destructively-substitute-variable-name
       (expression newParameter oldParameter &key form-p)
  ;; Called by "reparameterize-lambda-expression" and "rename-symbols-in-form";
  ;; Destructively substitute for any symbol "oldParameter" used as a
  ;;    variable in "expression" the symbol "newParameter";
  ;; "form-p" is true if "expression" is a form; otherwise it is assumed
  ;;    to be a list of forms;
  ;; TO DO: REWRITE THIS USING A REAL CODE WALKER;
  ;; UPGRADE: PUT IN CODE FOR macrolet AND ...;
  (let (item)
    (cond
      (form-p
       (case (car expression)
	 ((let prog let*)
	  (integrity-check (not (member newParameter (second expression))))
	  (loop for tail on (cadr expression)
	       do
	       (let ((varAssign (car tail)))
		 (cond
		   ((consp varAssign) 
		    (destructively-substitute-variable-name
		      varAssign newParameter oldParameter))
		   ((eq varAssign oldParameter)
		    (setf (car tail) newParameter)))))	       
	  (destructively-substitute-variable-name
	    (cddr expression) newParameter oldParameter))
	 (lambda
	   (integrity-check (not (member newParameter (second expression))))
	   (destructively-substitute-variable-name
	     (cadr expression) newParameter oldParameter)
	   (destructively-substitute-variable-name
	     (cddr expression) newParameter oldParameter))
	 ((flet labels)
	  (loop for fdef in (cadr expression)
	       do
	       (integrity-check (not (member newParameter (second fdef))))
	       (destructively-substitute-variable-name
		 (cadr fdef) newParameter oldParameter)
	       (destructively-substitute-variable-name
		 (cddr fdef) newParameter oldParameter))
	  (destructively-substitute-variable-name
	    (cddr expression) newParameter oldParameter))
	 (cond
	  (loop for condition in (cdr expression)
	       do (destructively-substitute-variable-name
		    condition newParameter oldParameter)))
	 (quote nil)
	 (otherwise
	  (destructively-substitute-variable-name
	   expression  ; (cdr expression)  ; (?c ?i) is legal now! TAR 7/24/97
	   newParameter oldParameter))))
      (t
       (loop for tail on expression
	    do
	    (setq item (car tail))
	    (cond
	      ((consp item)
	       (destructively-substitute-variable-name
		 item newParameter oldParameter :form-p t))
	      ((eq item oldParameter)
	       (setf (car tail) newParameter)))))))
  expression )


  ;;
;;;;;; Generally-useful functions
  ;;

(defun permute (list)
  ;; Returns permutations of "list" without accounting for duplicate values;
  (if (cdr list)
    (if (cddr list)
      (let ((first (first list))
	    (result nil))
	(loop for sl in (permute (rest list))
              do (loop for i from 0 below (length list)
	               as tail on sl by #'cdr
	               do (push (append (subseq sl 0 i) (cons first tail))
				result)
		       finally (push (append sl (list first)) result)))
	result)
      ;; Special case for length 2 lists:
      (list list (reverse list)))
    (list list)) )

(defmacro union-superc-slot-values (self slotName)
  ;; Produce a form which visits all super-concepts of "self" and concatenates
  ;;    the values of the slot "slotName", removing duplicates in the
  ;;    process;
  ;; This code is optimized for the case when "self" has a single parent
  `(let ((parents (super-concepts ,self))
	 result)
     (when parents
       (setq result (,slotName (car parents)))
       (loop for p in (cdr parents)
	    do (loop for slotValue in (,slotName p)
		    do (pushnew slotValue result :test #'eq))))
     result) )

;;; The macros below are useful for visiting or searching ancestors
;;;    or descendants of a node;
;;; Note: the "ancestors" macros expand into simple for loops which
;;;    rely on the presence of the "all-super-concepts" slot; Use of
;;;    these macros (as opposed to for-loops) is encouraged, in case
;;;    we ever decide to do-away-with the "all-super-concepts" slot
;;; QUESTIONS: WHERE is the name of a helping function provided?
;;;            WHEN can "already-visited-counter" be used safely (do we need a new flag?)

(defmacro map-ancestors (self lambdaExpr &key reflexive-p)
  ;; Fast application of "lambdaExpr" to all members
  ;;   of "(all-super-concepts self)"
  `(progn
     ,@(when reflexive-p
	 `(,@(cddr (reparameterize-lambda-expression
		     lambdaExpr `(,self)))))
     (loop for ancestor in (all-super-concepts ,self)
	  do ,@(cddr (reparameterize-lambda-expression
		       lambdaExpr '(ancestor))))) )

  ;;
;;;;;; "make-loom-instance"
  ;;

(defmacro make-loom-instance (type &rest options)
  ;;
  (if options
      `(let ((newInstance (make-instance ,type)))
	 ,@(loop for tail on options by #'cddr
		collect
		`(setf (,(intern (symbol-name (car tail)) 'LOOM)
		       newInstance)
		      ,(cadr tail)))
	 newInstance)
      `(make-instance ,type)) )


  ;;
;;;;;; Ridiculously-specialized macros
  ;;

(defmacro install-starting-restriction (relation slotName)
  ;; Helping macro for "BINARY-RELATION.post-classify-concept";
  ;; Expand to code which creates or re-uses a null, min-1, and max-1
  ;;    restriction, classifies it into the appropriate
  ;;    restriction taxonomies; and links it to "relation"
  ;;    using the slot "slotName";
  `(let ((startingRestriction (,slotName ,relation)))
     (integrity-check (or (null startingRestriction)
			  (not (classified-p startingRestriction))))
     (when (null startingRestriction)
      (setq startingRestriction
	     ,(case slotName
		(min-1-restriction
		 '(make-loom-instance 'MIN-RESTRICTION
				      :lower-bound 1))
		(max-1-restriction
		 '(make-loom-instance 'MAX-RESTRICTION
				      :upper-bound 1))
		(null-max-restriction
		 '(make-loom-instance 'MAX-RESTRICTION
				      :upper-bound '+INFINITY))
		(null-value-restriction
		 '(make-loom-instance 'VALUE-RESTRICTION
				      :value-restriction *Thing*))
		(null-filled-by-restriction
		 '(make-loom-instance 'FILLED-BY-FEATURE))))
       (setf (feature-type startingRestriction)
	     ,(case slotName
		(min-1-restriction :min-restriction)
		(max-1-restriction :max-restriction)
		(null-max-restriction :max-restriction)
		(null-value-restriction :value-restriction)
		(null-filled-by-restriction :filled-by)))
       (addf (dependents ,relation) startingRestriction)
       (setf (relation startingRestriction) ,relation)
       (setf (,slotName ,relation) startingRestriction))
     ,(case slotName
	((min-1-restriction null-filled-by-restriction)
	 `(install-concept startingRestriction
			   (loop for super in (super-concepts ,relation)
                                 when (,slotName super)         ; RMM 10/8/93
				 collect (,slotName super))
			   (loop for sub in (sub-concepts ,relation)
				 ;; this when check is here because inverse relations
				 ;;    generate funny classification dependencies:
				 when (,slotName sub)
				 collect (,slotName sub))))
	((null-max-restriction null-value-restriction)
	 `(install-concept startingRestriction
			   (loop for sub in (sub-concepts ,relation)
				 ;; see comment above
				 when (,slotName sub)
				 collect (,slotName sub))
			   (loop for super in (super-concepts ,relation)
                                 when (,slotName super)         ; RMM 10/8/93
				 collect (,slotName super))))
	(otherwise				; max-1-restriction
	 '(classify-one-concept startingRestriction)))
     (setf (instrument-p startingRestriction)
	   (compute-instrument-p startingRestriction))
     startingRestriction) )

(defmacro return-t-or-equal (&rest listOfEqualityTests)
  ;; Helping macro for the methods named "specializes-classified-concept-p"
  ;; Returns :equal if the equality tests in "listOfEqualityTests" all
  ;;    succeed; Otherwise returns T;
  ;; Note:  This macro is designed to function only within these methods;
  `(if (and checkForEqualityFlag
	    ,@listOfEqualityTests)
       :equal
       t) )


  ;;
;;;;;; String matching functions
  ;;

(defun wildcard-string-equal-p (pattern string)
  ;; Return t if "pattern" matches "string";
  ;; This match permits wildcard patterns of the form:
  ;;    "*abc", "abc*" and "*abc*" to appear within "pattern";
  ;; Assumes "pattern" and "string" are both strings;
  (or (string-equal pattern string)
      (and (position #\* pattern)
	   (let ((substring (remove #\* pattern)))
	     (case (string-position-of-star pattern)
	       (:start 
		(string-suffix-p substring string (length substring)))
	       (:end
		(string-prefix-p substring string (length substring)))
	       (:both
		(search substring string)))))) )

(defun string-position-of-star (pattern)
  ;; Helping function for "wildcard-string-equal-p", plus anything else
  ;;    that wants to use wildcards, but wants to bypass
  ;;    "wildcard-string-equal-p";
  ;; Return :start if "pattern" begins with the character "*", :end
  ;;    if "pattern" ends with the character "*", :both if it begins
  ;;    and ends with a "*", and nil otherwise;
  (let ((startP (eql (aref pattern 0) #\*))
	(endP (eql (aref pattern (1- (length pattern))) #\*)))
    (cond
      ((and startP endP) :both)
      (startP :start)
      (endP :end)) ))

(defun string-prefix-p (prefix string lengthOfPrefix)
  ;; Return t if "prefix" is a prefix of "string";
  (and (<= lengthOfPrefix (length string))
       (null (mismatch prefix string :end2 lengthOfPrefix))) )

(defun string-suffix-p (suffix string lengthOfSuffix)
  ;; Return t if "suffix" is a suffix of "string";
  (let ((lengthOfString (length string)))
    (and (<= lengthOfSuffix lengthOfString)
	 (null (mismatch suffix string
			:start2 (- lengthOfString lengthOfSuffix))) ) ))


  ;;
;;;;;; Utility functions (not specific to Loom)
  ;;

(defun stable-union (tail newItems)
  ;; Returns a list consisting of the elements of "newItems" not
  ;;    in "tail", followed by "tail" itself;
  ;; Assumes that "tail" has no duplicates;
  (if (null tail)
      newItems
      (progn
	(loop for item in newItems
	     unless (find item tail)
	     do (push item tail))
	tail)) )

(defun sparse-append (&rest lists)
  ;; Return a single lists containing the members of "lists";
  ;; Optimized to avoid consing when some of the lists are empty
  ;;    ("append" is stupid in that way);
  ;; CAUTION: "sparse-append" appends lists in reverse order;
  (let (result)
    (loop for tail on lists
	 when (car tail)
	 do
	 ;; initially, set "result" to first non-empty list:
	 (setq result (car tail))
	 (setq lists (cdr tail))
	 (return))
    (if (null lists)
	result
      	(progn
	  (loop for l in lists
	       when l
	       do (setq result (revappend l result)))
	  result)) ))

#+CLTL2 (declaim (inline bag-append))
#-CLTL2 (proclaim '(inline bag-append))
(defun bag-append (list1 list2)
  ;; Return a list containing elements from "list1" and "list2";
  ;; Optimized to minimize consing;
  (if (null list2)
      list1
      (revappend list1 list2)) )

(defmacro prependf (longList shortList)
  ;; Set the place "longList" to its old value with members
  ;;    of "shortList" prepended;
  (once-only (shortList)
    `(if ,shortList
	 (setf ,longList (bag-append ,shortList ,longList))
	 ,longList) ))

(defun search-tree-p (item tree)
  ;; Return true if "item" can be found within "tree";
  (cond
   ((eql item tree) t)
   ((and (consp tree)
         (neq (car tree) 'QUOTE))
    (loop for clause in tree
	  thereis (search-tree-p item clause))) ))

(defun search-tree-list-p (itemList tree)
  ;; Return true if any item in "itemlist" can be found within "tree";
  ;; Uses and EQL test for membership!
  (cond
   ((member tree itemList) t)
   ((and (consp tree)
         (neq (car tree) 'QUOTE))
    (loop for clause in tree
	  thereis (search-tree-list-p itemList clause))) ))

(defun copy-hash-table (oldTable)
  ;; Return a copy of "oldTable";
  (let ((newTable (make-hash-table
                   :test (hash-table-test oldTable)
                   :size (hash-table-size oldTable)
                   :rehash-size (hash-table-rehash-size oldTable)
                   :rehash-threshold (hash-table-rehash-threshold oldTable))))
    (maphash #'(lambda (key value)
                 (setf (gethash key newTable) value))
             oldTable)
    newTable ))

;;; DEFPRODUCTION CALLS THIS, AND NOTHING ELSE DOES.
(defun more-than-one-true-value (&rest arguments)
  ;; Return t if more than one of the values of "arguments"
  ;;    are non-nil;
  (< 1
     (loop for arg in arguments
	   when arg
	   count arg)) )


(defun current-year ()
  ;; Returns the current year.
  (multiple-value-bind (s m h dd mm yy)
      (get-decoded-time)
    (declare (ignore s m h dd mm))
    yy))

(defun format-time (universalTime &optional (stream t)
		    &key (smallest-unit *format-time-smallest-unit*) 
		         (include-date-p *format-time-include-date-p*)
			 (long-date-p *format-time-long-date-p*)
			 (style *format-time-style*))
  ;; Formats "universalTime" on the stream "stream";
  ;; ":smallest-unit" is one of :second, :minute, :hour, :day, :month, :year
  ;;    and controls the smallest unit used in the formated time;
  ;; ":include-date-p" if non-nil means the date is included in the time
  ;;    representation.
  ;; ":long-date-p" if non-nil means to use the long form of the date;
  ;; ":style" is :string for string format, :krsl for KRSL list format, nil
  ;;    for no formatting.
  (unless (and (numberp universalTime)
	       (plusp universalTime)	; Safety valve.
	       (member style '(:string :krsl)))
    (format stream "~S" universalTime)
    (return-from format-time universalTime))
  (labels ((month-name (month)
	     (aref '#("January" "February" "March" "April" "May" "June" "July"
		      "August" "September" "October" "November" "December")
		   (1- month)))
	   (short-month-name (month)
	     (aref '#("Jan" "Feb" "Mar" "Apr" "May" "Jun" "Jul"
		      "Aug" "Sep" "Oct" "Nov" "Dec")
		   (1- month)))
	   (year-not-close-enough-p (year)
	     ;; "year" is not close enough to the current year to abbreviate!
	     (> (abs (- year (current-year))) 45))
	   (format-string-time (second minute hour date month year)
	     (cond ((null long-date-p)
		    (ecase smallest-unit
		      (:second (format stream
				       "~:[~3*~;~2,'0D/~2,'0D/~2,'0D ~]~2,'0D:~2,'0D:~2,'0D"
				       include-date-p month date year hour minute second))
		      (:minute (format stream
				       "~:[~3*~;~2,'0D/~2,'0D/~2,'0D ~]~2,'0D:~2,'0D"
				       include-date-p month date year hour minute))
		      (:hour (format stream "~:[~3*~;~2,'0D/~2,'0D/~2,'0D ~]~2,'0D"
				     include-date-p month date year hour))
		      (:day (format stream "~:[~3*~;~2,'0D/~2,'0D/~2,'0D~]"
				    include-date-p month date year))
		      (:month (format stream "~:[~2*~;~2,'0D/~2,'0D~]"
				      include-date-p month year))
		      (:year (format stream "~:[~*~;~D~]" include-date-p year))))
		   ((eq long-date-p :medium)
		    (ecase smallest-unit
		      (:second (format stream "~:[~3*~;~D-~A-~D ~]~2,'0D:~2,'0D:~2,'0D"
				       include-date-p date (short-month-name month) year
				       hour minute second))
		      (:minute (format stream "~:[~3*~;~D-~A-~D ~]~2,'0D:~2,'0D"
				       include-date-p date (short-month-name month) year
				       hour minute))
		      (:hour (format stream "~:[~3*~;~D-~A-~D ~]~2,'0D"
				     include-date-p date (short-month-name month) year hour))
		      (:day (format stream "~:[~3*~;~D-~A-~D~]"
				    include-date-p date (short-month-name month) year))
		      (:month (format stream "~:[~2*~;~A-~D~]"
				      include-date-p (short-month-name month) year))
		      (:year (format stream "~:[~*~;~D~]" include-date-p year))))
		    (t 
		     (ecase smallest-unit
		       (:second (format stream "~:[~3*~;~A ~D, ~D ~]~2,'0D:~2,'0D:~2,'0D"
					include-date-p (month-name month) date year
					hour minute second))
		       (:minute (format stream "~:[~3*~;~A ~D, ~D ~]~2,'0D:~2,'0D"
					include-date-p (month-name month) date year
					hour minute))
		       (:hour (format stream "~:[~3*~;~A ~D, ~D ~]~2,'0D"
				      include-date-p (month-name month) date year hour))
		       (:day (format stream "~:[~3*~;~A ~D, ~D~]"
				     include-date-p (month-name month) date year))
		       (:month (format stream "~:[~2*~;~A ~D~]"
				       include-date-p (month-name month) year))
		       (:year (format stream "~:[~*~;~D~]" include-date-p year)))
		     )))
	   (format-krsl-date (second minute hour date month year)
	     (format stream "~S"
		     (ecase smallest-unit
		       (:second (if include-date-p
				    `(:year ,year :month ,month :day ,date
					    :hour ,hour :minute ,minute :second ,second)
				  `(:hour ,hour :minute ,minute :second ,second)))
		       (:minute (if include-date-p
				    `(:year ,year :month ,month :day ,date
					    :hour ,hour :minute ,minute)
				  `(:hour ,hour :minute ,minute)))
		       (:hour (if include-date-p
				  `(:year ,year :month ,month :day ,date :hour ,hour)
				`(:hour ,hour)))
		       (:day (if include-date-p
				 `(:year ,year :month ,month :day ,date)
			       nil))
		       (:month (if include-date-p
				   `(:year ,year :month ,month)
				 nil))
		       (:year (if include-date-p
				  `(:year ,year)
				nil))))))
	   
    (multiple-value-bind (second minute hour date month year)
	(decode-universal-time universalTime)
      (unless (or long-date-p
		  *format-time-4-digit-year-p*
		  (eq smallest-unit :year)
		  (year-not-close-enough-p year))
	(setq year (mod year 100)))
      (case style
	(:string (format-string-time second minute hour date month year))
	(:krsl (format-krsl-date second minute hour date month year))
	(t (format stream "~S" universalTime))) )))

(defun current-time-string ()
  ;; Returns string containing current date and time;
  (format-time (get-universal-time) nil))


(defmacro xor (value1 value2)
  ;; Return t if exactly one of "value1" and "value2" is true;
  `(neq (and ,value1 t) (and ,value2 t)) )

(defmacro logically-equal-p (value1 value2)
  ;; Return t if "value1" and "value2" are both true or both false;
  `(eq (and ,value1 t) (and ,value2 t)) )

#-:CLTL2 (proclaim '(inline extended-number-p))
#+:CLTL2 (declaim (inline extended-number-p))
#+:measures
(defun extended-number-p (x)
  (or (numberp x)
      (ms:dim-number-p x)))
#-:measures
(defun extended-number-p (x)
  (numberp x))


  ;;
;;;;;; Network Mapping Functions
  ;;

;;; "map-transitively", "collect-transitively", and "append-transitively"
;;;    traverse a graph, mapping, collecting, or appending;
;;; The pass counter *revise-subgraph-pass-counter* along with the slot
;;;    "already-revised-counter" is utilized to avoid visiting a node more than
;;;    once;
;;; For traversing nodes that don't have the "already-revised-counter" slot, the
;;;    key :dont-use-pass-counter causes them to maintain a list of already
;;;    visited nodes;

(defmacro map-transitively
	  (startNode edgeName mappingFn &key pruning-test end-order use-pass-counter)
  ;; Expand to a form which will traverse a graph starting from 
  ;;    "startNode", following arcs indicated by "edgeName" (names
  ;;    a function which must return a list when applied to a node),
  ;;    applying "mappingFn" to each noded visited;
  ;; Use :pruning-test, if it is present, to avoid expanding specified
  ;;    nodes;
  ;; If :use-pass-counter, keep track of nodes visited using pass counter instead
  ;;    of a list of already-visited nodes;
  (let (recordVisitForm dontVisitTest walkForm mapForm)
    (when pruning-test
      (setq pruning-test
	    (cddr (reparameterize-lambda-expression pruning-test '(neighbor)))))
    (setq recordVisitForm
	  (if use-pass-counter
	      '(setf (already-revised-counter self) passCounter)
	      '(push self alreadyVisitedNodes)))
    (setq dontVisitTest
	  (if use-pass-counter
	      '(eql (already-revised-counter neighbor) passCounter)
	      '(member neighbor alreadyVisitedNodes)))
    (when pruning-test
      (setq dontVisitTest
	    `(or ,dontVisitTest
		 (not ,@pruning-test))))
    (setq mapForm
	  (cond ((symbolp mappingFn)
		 `(,mappingFn self))
		((and (consp mappingFn)
		      (eq (car mappingFn) 'lambda))
		 '(mapFn self))
		(t '(funcall mapFn self))))
    (setq walkForm 
	  `(loop for neighbor in (,edgeName self)
		unless ,dontVisitTest
		do (walkFn neighbor)))
    `(let (,@(if (or (symbolp mappingFn)
		     (and (consp mappingFn)
			  (eq (car mappingFn) 'lambda)))
		 nil
		 `((mapFn ,mappingFn)))
	   ,(if use-pass-counter
		'(passCounter (decf *revise-subgraph-pass-counter*))
		'alreadyVisitedNodes))
       (labels (,@(when (and (consp mappingFn)
			     (eq (car mappingFn) 'lambda))
		    `((mapFn ,@(cdr mappingFn))))

		  (walkFn (self)
			,@(if end-order 
			      `(,recordVisitForm
				,walkForm
				,mapForm) 
			      `(,recordVisitForm 
				,mapForm
				,walkForm))))
	 (walkFn ,startNode))) ))

(defmacro collect-transitively
	  (startNode edgeName collectionFn &key pruning-test use-pass-counter)
  ;; Expand to a form which will traverse a graph starting from 
  ;;    "startNode", following arcs indicated by "edgeName" (names
  ;;    a function which must return a list when applied to a node),
  ;;    applying "collectionFn" to each noded visited;
  ;; Use :pruning-test, if it is present, to avoid expanding specified
  ;;    nodes;
  ;; If :use-pass-counter, keep track of nodes visited using pass counter instead
  ;;    of a list of already-visited nodes;
  (let (recordVisitForm dontVisitTest)
    (when (and (consp collectionFn)
	       (eq (car collectionFn) 'lambda))
      (setq collectionFn `(function ,collectionFn)))
    (when pruning-test
      (setq pruning-test
	    (cddr (reparameterize-lambda-expression pruning-test '(neighbor)))))
    (setq recordVisitForm
	  (cond
	    (use-pass-counter
	     '(setf (already-revised-counter self) passCounter))
	    (t
	     '(push self alreadyVisitedNodes))))
    (setq dontVisitTest
	  (cond
	    (use-pass-counter
	     '(eql (already-revised-counter neighbor) passCounter))
	    (t
	     '(member neighbor alreadyVisitedNodes))))
    (when pruning-test
      (setq dontVisitTest
	    `(or ,dontVisitTest
		 (not ,@pruning-test))))
    `(let (,@(cond
	       ((symbolp collectionFn) nil)
	       (t `((colFn ,collectionFn))))
	   ,(cond
	      (use-pass-counter
	       '(passCounter (decf *revise-subgraph-pass-counter*)))
	      (t
	       'alreadyVisitedNodes))
	   result)
       (labels ((walkFn (self)
			,recordVisitForm
			,(let ((collectionForm
				 (cond
				   ((symbolp collectionFn) `(,collectionFn self))
				   (t '(funcall colFn self)))))
			   `(let ((item ,collectionForm))
			      (when item
				(push item result))))
			(loop for neighbor in (,edgeName self)
			     unless ,dontVisitTest
			     do (walkFn neighbor))))
	 (walkFn ,startNode)
	 result)) ))

(defmacro append-transitively
	  (startNode edgeName collectionFn &key pruning-test use-pass-counter)
  ;; Expand to a form which will traverse a graph starting from 
  ;;    "startNode", following arcs indicated by "edgeName" (names
  ;;    a function which must return a list when applied to a node),
  ;;    applying "collectionFn" to each noded visited;
  ;; Use :pruning-test, if it is present, to avoid expanding specified
  ;;    nodes;
  ;; If :use-pass-counter, keep track of nodes visited using pass counter instead
  ;;    of a list of already-visited nodes;
  (let (recordVisitForm dontVisitTest)
    (when (and (consp collectionFn)
	       (eq (car collectionFn) 'lambda))
      (setq collectionFn `(function ,collectionFn)))
    (when pruning-test
      (setq pruning-test
	    (cddr (reparameterize-lambda-expression pruning-test '(neighbor)))))
    (setq recordVisitForm
	  (cond
	    (use-pass-counter
	     '(setf (already-revised-counter self) passCounter))
	    (t
	     '(push self alreadyVisitedNodes))))
    (setq dontVisitTest
	  (if use-pass-counter
	      '(eql (already-revised-counter neighbor) passCounter) 
	      '(member neighbor alreadyVisitedNodes)))
    (when pruning-test
      (setq dontVisitTest
	    `(or ,dontVisitTest
		 (not ,@pruning-test))))
    `(let (,@(if (symbolp collectionFn) 
		 nil
		 `((colFn ,collectionFn)))
	   ,(if use-pass-counter
		'(passCounter (decf *revise-subgraph-pass-counter*))
		'alreadyVisitedNodes)
	   unorderedResult)
       (labels ((walkFn (self)
			,recordVisitForm
			(setq unorderedResult
			      (bag-append
				,(if (symbolp collectionFn)
				     `(,collectionFn self)
				     '(funcall colFn self))
				unorderedResult))
			(loop for neighbor in (,edgeName self)
			     unless ,dontVisitTest
			     do (walkFn neighbor))))
	 (walkFn ,startNode)
	 unorderedResult)) ))


(defun record-definition-file (name conceptOrRelation)
  ;; Call implementation specific code to record source file for the
  ;;   definition of "name" of type "conceptOrRelation";
  #+(or :CMU :Lispworks) (declare (ignore name conceptOrRelation))
  #+:TI 
  (SI:record-source-file-name name 'concept t)
  #+:Lucid 
  (when LCL:*record-source-files*		; tar 7/29/92
    (LCL:record-source-file name (if (eq conceptOrRelation :concept)
                                   'concept 'relation)))
  #+:MCL
  (when CCL:*record-source-file*      ; tar 9/28/93
    (CCL:record-source-file name (if (eq conceptOrRelation :concept)
                                   'concept 'relation)))
  #+:EXCL
  (when EXCL:*record-source-file-info*
    (EXCL::record-source-file 
     name :type (if (eq conceptOrRelation :concept)
		    :concept :relation)))
  )

  ;;
;;;;;; "do-concepts"
  ;;

(defmacro do-concepts ((variable) &body body) 
  ;; Iterate over all concepts, and evaluate "body" with "variable"
  ;;    bound to each concept in turn;
  `(map-transitively
    *Thing* sub-concepts
    (lambda (,variable)
      ,@body)
    :use-pass-counter t) )

(defmacro do-subconcepts ((variable concept) &body body) 
  ;; Iterate over all concepts, and evaluate "body" with "variable"     
  ;;    bound to each concept in turn;
  `(map-transitively
     ,concept sub-concepts
     (lambda (,variable)
       ,@body)
     :use-pass-counter t) )

(defmacro parents-first-do-subconcepts ((variable concept) &body body)
  ;; Iterate over all concepts in parents-first order, and evaluate "body" 
  ;;    with "variable" bound to each concept in turn;
  ;; Tricky:  We first mark everyone we need to visit with a distinguished value
  ;;    so we can identify superconcepts of subconcepts that are not in the
  ;;    tree being walked.  We then ignore them.
  `(let ((passCounter (decf *revise-subgraph-pass-counter*))
	 (passCounter-1 (decf *revise-subgraph-pass-counter*)))
     (labels ((prepfn (c)
		(unless (eql (already-revised-counter c) passcounter-1)
		  (setf (already-revised-counter c) passcounter-1)
		  (loop for sub in (sub-concepts c) do (prepfn sub))))
	      (walkfn (,variable)
		(setf (already-revised-counter ,variable) passcounter)
		,@body
		(loop for neighbor in (sub-concepts ,variable)
                      when (and (not (eql (already-revised-counter neighbor)
					  passcounter))
				(loop for super in (super-concepts neighbor)
				      ;; Either already visited or doesn't need to
				      ;;  be visited, since only unvisited children
				      ;;  have a counter = passcounter-1
				      always (not 
					      (eql (already-revised-counter super)
						   passcounter-1))))
		      do (walkfn neighbor))))
       (prepfn ,concept)
       (walkfn ,concept))))

(defmacro do-relations ((variable) &body body) 
  ;; Iterate over all concepts, and evaluate "body" with "variable"
  ;;    bound to each concept in turn;
  (let ((fname (gensym "F-")))
    `(flet ((,fname (,variable) ,@body))
       (map-transitively
	*binary-tuple* sub-concepts ,fname
	:use-pass-counter t)
       (map-transitively
	(loom-constant N-ARY-TUPLE) sub-concepts ,fname
	:use-pass-counter t)) ))

(defmacro do-binary-relations ((variable) &body body) 
  ;; Iterate over all concepts, and evaluate "body" with "variable"
  ;;    bound to each concept in turn;
  `(map-transitively
    *binary-tuple* sub-concepts
    (lambda (,variable) ,@body)
    :use-pass-counter t) )

(defmacro do-n-ary-relations ((variable) &body body) 
  ;; Iterate over all concepts, and evaluate "body" with "variable"
  ;;    bound to each concept in turn;
  `(map-transitively
    (loom-constant N-ARY-TUPLE) sub-concepts
    (lambda (,variable) ,@body)
    :use-pass-counter t) )

  ;;
;;;;;; "add-depend-ons-link"
  ;;

(defun add-depend-ons-link (dependent dependOn)
  (when (not (member dependon (depend-ons dependent)))
    (push dependOn (depend-ons dependent))
    (push dependent (dependents dependOn))) )

(defun add-non-tbox-depend-ons-link (dependent dependOn)
  (when (not (member dependon (non-tbox-depend-ons dependent)))
    (push dependOn (non-tbox-depend-ons dependent))
    (push dependent (non-tbox-dependents dependOn))) )


  ;;
;;;;;; Utility Routines to Help Save Variables in Contexts
  ;;

(defmacro create-save-vector (&rest variableNames)
  `(make-array ,(length variableNames)))

(defmacro save-to-vector (vector &rest variableNames)
  (let ((v (gensym "V-")))
    `(let ((,v ,vector))
       ,@(loop for name in variableNames
               as index upfrom 0
               collect `(setf (svref ,v ,index) ,name)) ) ))

(defmacro restore-from-vector (vector &rest variableNames)
  (let ((v (gensym "V-")))
    `(let ((,v ,vector))
       ,@(loop for name in variableNames
               as index upfrom 0
               collect `(setf ,name (svref ,v ,index))) ) ))



;;;; Utility Routines to Help in Debugging Loom:


(defun j-edgar (item &key (package "LOOM") (external-p nil)
		          (match "*") (stream t))
  ;; Searches special variables of "package" whose names literally
  ;;   contain "match" which contain "item" and prints the name of
  ;;   that variable;
  ;; If "external-p" is T, only external symbols are searched, otherwise
  ;;   all symbols of the package are searched.  If "item" is NIL, then
  ;;   all symbols matching the match string are printed;
  (labels ((has-value-p (item storage-form)
	     ;; Determines if "item" is in "storage-form":
	     (or (equal item storage-form)
		 (typecase storage-form
		   (hash-table (maphash #'(lambda (k v)
				             (when (or (has-value-p item k)
					               (has-value-p item v))
				               (return-from has-value-p t)))
                                         storage-form)
			       nil)
		   (string (and (stringp item)
				(string-equal item storage-form)))
		   (vector (map nil #'(lambda (x)
					(when (has-value-p item x)
					  (return-from has-value-p t)))
				storage-form)
			   nil)
		   (atom (eql item storage-form))
		   (cons (or (has-value-p item (car storage-form))
			     (has-value-p item (cdr storage-form))))
		   (t nil))))
	   (find-it (item symbol match)
	       ;; Prints the "symbol"'s name if "item" can be found
	       ;;   in "symbol"'s value;
	       (when (and (boundp symbol)
			  (or (string= match "")
			      (search match (symbol-name symbol)))
			  (or (null item)
			      (has-value-p item (symbol-value symbol))))
		 (format stream "~%~A" symbol))))
       (if external-p
	 (do-external-symbols (s package)
	   (find-it item s match))
	 (do-symbols (s package)
	   (find-it item s match))) ))

    ;;;
    ;;;
;;;;;;;;;;;      Additional functions for accessing and manipulating Loom
;;;;;;;;;;;      definitions.
    ;;;
    ;;;

#| TO DO:

Characteristics
:domain/:range for relations

Satisfies clauses with variable renaming
Disjunctions
Reasoning about :exactly vs :at-most & :at-least
Reasoning about :filled-by
Reasoning about :one-of

Defaults
Implications
|#


(defun source-definition (conceptOrName &optional (name (when (symbolp conceptOrName) conceptOrName)))
  "Returns the source definition for `conceptOrName', using optional `name' to choose
between merged concepts.  Returns :is or :is-primitive as a second value."
  (setq conceptOrName (get-concept conceptOrName))
  (let* ((defns (source-definitions conceptOrName))
	 (nonPrimDef (if name
			 (getf (cdr (find name defns :key #'car)) :is)
		         (getf (cdar defns) :is))))
    (if nonPrimDef
	(values nonPrimDef 
		(if (search-tree-p :primitive nonPrimDef) :is-primitive :is))
        (values (if name
		    (getf (cdr (find name defns :key #'car)) :is-primitive)
		    (getf (cdar defns) :is-primitive))
		:is-primitive)) ))

(defun conjunction-p (clause)
  ;; Returns T if "clause" is a top-level conjunction;
  (and (consp clause)
       (or (eq (car clause) :and)
	   (and (member :dont-dwimmify-keywords *loom-features*)
		(eq (car clause) 'and)))))

(defun clause-in-definition-p (clause defn)
  ;; Returns NIL if "clause" is not in "defn", non-NIL otherwise;
  (cond ((null defn) nil)
	((conjunction-p defn)
	    (if (conjunction-p clause)
		(loop for subclause in (cdr clause)
		    always (member subclause defn :test #'equal))
	        (member clause defn :test #'equal)))
	(t (if (conjunction-p clause)
	       (and (null (cddr clause)) (equal (cadr clause) defn))
	       (equal defn clause)))) )
  

(defun add-to-definition (conceptOrName newClause &optional name)
  "Adds NEWCLAUSE to CONCEPTORNAME's source definition, using the optional NAME to
choose between merged concept's definitions to modify.  Returns new definition
or NIL if the definition was not changed."
  (setq conceptOrName (get-concept conceptOrName))
  (let* ((definitionKeyword (if (primitive-p conceptOrName) :is-primitive :is))
	 (sources (if name
		      (find name (source-definitions conceptOrName) :key #'car)
		    (car (source-definitions conceptOrName))))
	 (defn (getf (cdr sources) definitionKeyword)))
    (when (and name (null sources))
      (error "No definition with name ~S found on concept ~S" name conceptOrName))
    (when (clause-in-definition-p newClause defn)
      (return-from add-to-definition nil))
    (cond ((null defn)
	      (setq defn newClause))
	  ((conjunction-p defn)
	      (if (conjunction-p newClause)
		  (setq defn `(:and ,@(union (cdr defn) (cdr newClause) :test #'equal)))
		  (setq defn `(:and ,@(cdr defn) ,newClause))))
	  (t (if (conjunction-p newClause)
		 (setq defn `(:and ,defn ,@(cdr newClause)))
	         (setq defn `(:and ,defn ,newClause)))))
    (setq sources (copy-list sources))
    (setf (getf (cdr sources) definitionKeyword) defn)
    (redefine-concept sources 
		      (if (typep conceptOrName 'TBOX-RELATION) :relation :concept))
    defn ))


(defun remove-from-definition (conceptOrName oldClause &optional name)
  "Removes OLDCLAUSE from CONCEPTORNAME's source definition, using the optional NAME to
choose between merged concept's definitions to modify.  Returns new definition
or NIL if the definition was not changed."
  (setq conceptOrName (get-concept conceptOrName))
  (let* ((definitionKeyword (if (primitive-p conceptOrName) :is-primitive :is))
	 (sources (if name
		      (find name (source-definitions conceptOrName) :key #'car)
		      (car (source-definitions conceptOrName))))
	 (defn (getf (cdr sources) definitionKeyword)))
    (when (and name (null sources))
      (error "No definition with name ~S found on concept ~S" name conceptOrName))
    (unless (clause-in-definition-p oldClause defn)
      (return-from remove-from-definition nil))
    (cond ((null defn))			; Shouldn't occur
	  ((conjunction-p defn)
	      (if (conjunction-p oldClause)
		  (setq defn `(:and ,@(set-difference (cdr defn) (cdr oldClause)
						      :test #'equal)))
		  (setq defn (remove oldClause defn))))
	  ;; Tricky:  If the definition is not a conjunction and oldClause is part
	  ;;    of it, then the entire defintion is removed.
	  (t (setq defn nil)))
    (when (and (conjunction-p defn) (null (cddr defn)))  ; Singleton or Null conjunction
      (setq defn (cadr defn)))
    (setq sources (copy-list sources))
    (setf (getf (cdr sources) definitionKeyword) defn)
    (when (and (eq definitionKeyword :is) (null defn))
      (inform "~A will become primitive because it has an empty definition." conceptOrName))
    (redefine-concept sources
		      (if (typep conceptOrName 'TBOX-RELATION) :relation :concept))
    defn ))



(defun concept-names (conceptOrName)
  "Return a list of symbols that are the names including synonyms of
'conceptOrName'"
  (mapcar #'car (source-definitions (get-concept conceptOrName))))

(defun relation-names (relationOrName)
  "Return a list of symbols that are the names including synonyms of
'relationOrName'"
  (mapcar #'car (source-definitions (get-relation relationOrName))))




;; To Do:
#|
TEST PERFORMANCE OF "slot-value" INSIDE OF "subconcept-p"

|#

;; BUGS:
#|
"destructively-substitute-variable-name" SHOULD BE REWRITTEN
USING A REAL CODE WALKER
|#

