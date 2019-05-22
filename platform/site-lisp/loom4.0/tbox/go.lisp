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

;;; GO.LISP (TBOX)

(in-package "LOOM")

;;; This file is loaded last.  It hand-builds a few concepts to
;;;    get things going

(export '(initialize-network use-loom call-use-loom))


  ;;
;;;;;; Initialization of the Loom network
  ;;

(defun initialize-network (&key destroy-contexts-p destroy-kbs-p)
  "Create the top level Loom context BUILT-IN-THEORY and define built-in
Loom concepts and relations, such as Thing, Set, etc.  `initialize-network' must
be called before any other Loom functions.  A subsequent call to
`initialize-network' destroys all user-defined concepts, relations, instances,
productions, etc.  User-defined contexts are preserved (except that they
are now empty) unless `destroy-contexts-p' is set."
  ;; Create THING, BINARY-TUPLE, SET-MEMBER, etc.
  ;; Reinitialize all global variables;
  (obsolete-argument initialize-network destroy-kbs-p destroy-contexts-p)
  (with-time-consuming-operation
    (without-redefinition-warnings
     (let ((savedCurrentCxt (unless destroy-contexts-p *context*))
	   ;; Don't record source files, since it is meaningless and
	   ;;   can REALLY slow down MCL over a network!
	   #+:Lucid (LCL:*record-source-files*      nil)        ; tar 7/23/97
	   #+:MCL   (CCL:*record-source-file*       nil)        ; tar 7/23/97
	   #+:EXCL  (EXCL:*record-source-file-info* nil)        ; tar 7/23/97
	   )
        (undefine-built-in-theory)
        (reset-global-variables)
        (reset-database-variables)
        (change-context 'BUILT-IN-THEORY)
        (disable-classifier)
        
        ;; clear BUILT-IN-THEORY, and either clear or destroy all
        ;;    contexts below BUILT-IN-THEORY
        (if destroy-contexts-p
          ;	(progn
          ;	  (loop for cxt in (list-contexts)
          ;	       unless (eq cxt (find-context 'BUILT-IN-THEORY))
          ;	       do (destroy-context-sublattice cxt :fast-p t))
          ;	  (clear-context-sublattice
          ;	    (find-context 'BUILT-IN-THEORY) nil :fast-p t)
          ;          (setq *knowledge-base-table* nil)
          ;          (setq *context-table*
          ;                (list (get-context 'BUILT-IN-THEORY)
          ;                      (get-context 'BOTTOM-THEORY))))
          (progn
            (setq *knowledge-base-table* nil)
            (destroy-all-contexts)
            (reset-ctxt-variables)        ;  TAR 11/22/93
            (defcontext BUILT-IN-THEORY :theory ()))
          (loop for (nil . cxt) in *context-table*
                ;; Note: "clear-context-sublattice" doesn't restore *context*!
                do (clear-context-sublattice cxt nil :fast-p t)))
        (change-context 'BUILT-IN-THEORY)
        
        ;; define the archetypical concept THING, the archetypical
        ;;    relation BINARY-TUPLE, the top-most min-1-restriction, ...
        (let* ((thing
	        (define-concept :name 'THING
	          :identifier 'Thing
	          :characteristics :clos-class
                  :mixin-classes '(CLOS-INSTANCE)
	          :classify-immediately 'no))
               (unaryTuple
                (define-property :name 'UNARY-TUPLE
	          :identifier 'UNARY-TUPLE
	          :classify-immediately 'no))
	       (binaryTuple
	        (define-relation :name 'BINARY-TUPLE
	          ;; NO COMPLETION LEAVES DOMAIN A LIST:
	          :range thing
	          :characteristics :symmetric
                  :predicate '((?x ?y) (declare (ignore ?x ?y)) t)
	          :classify-immediately 'no))
	       (nAryTuple
	        (define-relation :name 'N-ARY-TUPLE
	          :range thing
	          :arity 999			; must be an integer
	          :classify-immediately 'no))
	       (bootstrapConcepts
	        (list thing unaryTuple binaryTuple nAryTuple)))
          
          (bind-identifier&predicate-symbol thing)
          (setq *Thing* thing)
          (setq *binary-tuple* binaryTuple)
          (setq *list-of-thing* (list thing)) 
          (setf (top-of-hierarchy thing) thing)
          (setf (top-of-hierarchy unaryTuple) unaryTuple)
          (setf (top-of-hierarchy binaryTuple) binaryTuple)
          (change-class nAryTuple 'N-ARY-RELATION)
          (setf (top-of-hierarchy nAryTuple) nAryTuple)
          #+TI (setf (loom-concept nAryTuple) nil)	; Work around TI class slot bug.
          
          ;; TO DO: TRY TO CLEAN THIS UP, MOVING MORE INTO THE ORIGINAL
          ;;    DEFINITIONS OF N-ARY-TUPLE, ETC.:
          ;; simulate conditioning of concepts: 
          (loop for relation in bootstrapConcepts
	        do  (incorporate-parsed-expressions relation))
          
          ;; undo making "unary-tuple", "binary-tuple" and "n-ary-tuple" primitive:
          (setf (primitive-p unaryTuple) nil)
          (setf (primitive-p binaryTuple) nil)
          (setf (primitive-p nAryTuple) nil)
          
          ;; now simulate classification:
          (setf (arity binaryTuple) 2)
          (loop for concept in bootstrapConcepts
	        do (pseudo-classify-bootstrap-concept concept))
          
          ;; remove THING, BINARY-TUPLE, ... from the list of unclassified concepts
          (setq *top-level-unclassified-concepts* nil)
          (setq *count-of-unclassified-concepts* 0)
          
          ;; Define some additional built-in concepts, and then enable
          ;;   the classifier
	  (define-concept :name 'OKBC-INDIVIDUAL
	    :is-primitive 'THING
	    :identifier 'OKBC-Individual
	    :predicate '((x) (and (not (concept-p x))
				  (not (property-p x))))
	    :characteristics '(:perfect :backward-chaining))
          (initialize-set-features)
          (define-built-in-theory)
          (enable-classifier)
          
          ;; initialize the Loom ABox environment
          (initialize-tasks)			; create task queues
          (initialize-patterns)			; create top-level pattern
          (create-non-existent-instance)
          ;; erase nil, the previous value of *non-existent-*agent-time*-instance*:
          (setq *list-of-*agent-time*-histories* nil)
          (setq *the-unelaborated-instance* 
	        (make-instance 'UNELABORATED-INSTANCE))
          
          ;; create ABox context objects:
          (bind-identifier&predicate-symbol
	   (get-concept 'context) :identifier 'context)

          (seal-predicate-symbol binaryTuple)    ; TAR 10/19/93 ; Need to seal!
          (new-time-point)

	  ;; Add context instances back into concept extension;
	  ;; Clear any asserted values;
	  (let ((*dontSubstituteNamesP* t))
	    (declare (special *dontSubstituteNamesP*))
	    (loop for cxt in (list-of-assoc *context-table*)
	        do (add-to-local-instances
		    (get-concept 'context) cxt)
		   (loop for entry in (list-dynamic-slot-role-names&values cxt)
		       unless (read-only-p (first entry))
		       do (fclear-value cxt (first entry)))) )
          ;; Add KB instances back into BUILT-IN-THEORY;
          (loop for (name . kb) in *knowledge-base-table*   ; TAR 11/9/93
                do (coerce&initialize-clos-instance kb
                                                    (intern name "LOOM")
                                                    *context*))     ; = BUILT-IN-THEORY
	  (new-time-point)

	  ;; Hack to suppress the return of LOOM-THING to Users.  ; TAR 10/20/97
	  (pushnew :system-generated-name (system-attributes (loom-constant LOOM-THING)))

	  (loop for item in (reverse *initialize-network-functions*)
	      do (cond ((and (symbolp item) (fboundp item))
			(funcall (symbol-function item)))
		       ((functionp item)
			(funcall item))
		       (t (grumble "Bogus item ~S found in *initialize-network-functions* hook." item))))
	  (new-time-point)
          ;; restore current context (which is now empty):
          (when savedCurrentCxt
	    (change-context savedCurrentCxt))
          *context* ) ))) )

(defun reset-global-variables ()
  ;; Reinitialize LOOM global variables
  (setq *thing* nil)
  (setq *binary-tuple* nil)
  (setq *list-of-thing* nil)
  (setq *top-level-unclassified-concepts* nil)
  (setq *top-level-uncompleted-concepts* nil)
  (setq *top-level-unconditioned-defaults-concepts* nil)
  (setq *top-level-unsealed-concepts* nil)
  (setq *modified-inherit-fillers-relations* nil)       ; ALERT-PATCH
  (setq *list-of-discarded-by-merge-concepts* nil)
  (setq *system-defined-instances-table* (make-hash-table))
  (setq *network-is-sealed-p* nil)
  (setq *reseal-network-p* nil)
  (setq *list-of-uninterned-concepts* nil)
  (setq *list-of-reclassify-concepts* nil)
  (setq *concept-sequence-counter* 0)
  (setq *concept-name-counter* 0)
  (setq *partition-name-counter* 0)
  (setq *count-of-unclassified-concepts* 0)
  (setq *classify-concept-pass-counter* 0)
  (setq *concept-is-below-pass-counter* 0)
  (setq *revise-subgraph-pass-counter* 0)
  (setq *number-of-classifications* 0)
  (setq *number-of-unclassifications* 0)
  (setq *number-of-revisions* 0)
  (setq *number-of-revision-discards* 0)
  (setq *number-of-cancel-disjuncts-cutoff* 0)
  (setq *number-of-disjunctions-checked* 0)
  (setq *number-of-disjunctions-eliminated* 0)
  (setq *number-of-disjuncts-specialized* 0)
  (setq *number-of-merges* 0)
  (setq *recycled-local-restrictions* nil)
  ;; Context variables:
  (setq *context* (find-context 'BUILT-IN-THEORY))
  (setq *context-stack* (list *context*))
  ;; ABox variables:
  (setq *agent-time* 0)
  (setq *query-agent-time* 0)
  (setq *previously* -1)
  (setq *history-limit* nil)
  (setq *match-is-pending-p* nil)
  ;; rete variables:
  (setq *list-of-modified-rete-instances* nil)
  ;; production rule variables:
  (setq *activated-production-queue* nil)
  (setq *activated-cohort-queue* nil)
  (setq *list-of-uncompiled-productions* nil)
  (setq *suspended-by-transaction-queue* nil)
  ;; unbind the predicate symbols for all concepts & relations
  (let ((metaConcept (get-concept 'Meta-Thing :no-error-p t)))
    (when metaConcept
      (loop for concept in (generate-instances metaConcept :cached-p t)
	    do  (if (typep concept 'TBOX-CONCEPT)
                 (when (predicate-symbol concept)
		   (makunbound (predicate-symbol concept))
		   (unseal-predicate-symbol concept))
                 (grumble "Bad Meta-Thing ~A found." concept)))) )
  )

(defun pseudo-classify-bootstrap-concept (self)
  ;; Perform operations on "concept" sufficient to allow it to
  ;;    reside in the classification hierarchy masquerading as
  ;;    an already-classified concept;
  ;; Note:  Assumes that super-concept links have already been installed;
  (setf (classified-p self) 0)
  (post-classify-concept self nil)
  (setf (completed-p self) :conditioned-defaults)
  (push self *top-level-unsealed-concepts*) )


  ;;
;;;;;; Loom built-in concepts
  ;;

;;; Here we define the concepts that populate the upper-levels of a Loom
;;;    network.  Many of these concepts are referenced by code embedded
;;;    within the classifier.

(defun define-built-in-theory ()
  ;; Define built-in concepts in addition to those already
  ;;    hand-built (e.g., THING, BINARY-TUPLE, etc.);
  (flet ((hand-build-instance/concept-links (instance concept)
           (setq concept (get-concept concept))
           (setf (loom-concept instance) concept)
           ;; code copied from "seal-one-concept":
           (add-to-local-instances concept instance)
           (push concept (dynamically-asserted-conjuncts instance)) ))
    
    (let ((askForConceptNames
	   (member :ask-for-concept-names *loom-dialogue-features*)))
      ;; shut off dialogue until after the built-in is up
      (delf *loom-dialogue-features* :ask-for-concept-names)
      ;; build the built-in:
      (load-built-in-concepts)
      (bind-identifier&predicate-symbol (get-concept 'COLLECTION))
      (bind-identifier&predicate-symbol (get-concept 'INCOHERENT))
      (load-meta-things)
      ;; kludge: set value of "loom-concept" for the meta concepts:
      (hand-build-instance/concept-links *thing* 'CONCEPT)
      (hand-build-instance/concept-links 
       (get-relation 'UNARY-TUPLE :arity 1) 'PROPERTY)
      (hand-build-instance/concept-links *binary-tuple* 'RELATION)
      (hand-build-instance/concept-links (get-relation 'N-ARY-TUPLE) 'RELATION)
      (setf (loom-concept (make-instance 'ROLE)) (get-concept 'ROLE))
      (do-concepts (c)                  ; TAR 8/13/93
        (when (null (dynamically-asserted-conjuncts c))
          (push (loom-concept c) (dynamically-asserted-conjuncts c))))
      ;; KLUDGE UNTIL WE IMPLEMENT METACLASSES:
      (setf (loom-concept (make-instance 'LITE-INSTANCE)) (loom-constant THING))
      (setf (loom-concept (make-instance 'ISLAND-INSTANCE)) (loom-constant THING))
      (setf (loom-concept (make-instance 'CONTEXT)) (get-concept 'CONTEXT))   ; TAR 8/12/93
      #+:lispworks
      (setf				; BUG IN LISPWORKS CLASS SLOTS!
       (loom-concept (make-instance 'THEORY-CONTEXT)) (get-concept 'CONTEXT)
       (loom-concept (make-instance 'WORKSPACE-CONTEXT)) (get-concept 'CONTEXT)
       (loom-concept (make-instance 'ISLAND-CONTEXT)) (get-concept 'CONTEXT))
    (when (member :load-obsolete-concepts *loom-features*)
        (load-obsolete-concepts))
      (export-names-in-context 'BUILT-IN-THEORY)
      (when askForConceptNames
	(push :ask-for-concept-names *loom-dialogue-features*)) )))

(defun undefine-built-in-theory ()
  ;; Called by "initialize-network"
  ;; Kludge to eliminate pointers to built-in concepts that are being
  ;;    deleted because the net is being reinitialized;
  (when (or (null (get-relation 'N-ARY-TUPLE :no-error-p t))
            (null *thing*))
    (return-from undefine-built-in-theory nil))
  (setf (loom-concept *thing*) nil)
  (setf (loom-concept (get-relation 'UNARY-TUPLE :arity 1)) nil)
  (setf (loom-concept *binary-tuple*) nil)
  (setf (loom-concept (get-relation 'N-ARY-TUPLE)) nil)
  (setf (loom-concept (make-instance (CLOS::find-class 'ROLE)))	; was CLOS::class-prototype TAR 12/15/92
        nil)
  ;; KLUDGE UNTIL WE IMPLEMENT METACLASSES:
  (setf (loom-concept (make-instance 'LITE-INSTANCE)) nil)
  (setf (loom-concept (make-instance 'ISLAND-INSTANCE)) nil) )


  ;;
;;;;;; Exportation of KBCLASSES Symbols
  ;;

;;; Here we export those KbClasses symbols which are of general utility
(defun export-major-kbclasses-symbols ()
  ;; Export the most critical or most useful of the symbols in KbClasses;
  (export '( list-of defmethod
	    for in on by when do collect append always thereis never sum
	    show show-all
	    )) )

(export-major-kbclasses-symbols)


  ;;
;;;;;; Importation of the Loom Environment
  ;;

(defmacro use-loom (packageName &key
		    context-name dont-create-context-p
		    dont-create-knowledge-base-p  ; FOR BACKWARD COMPATIBILITY (DGB)
                    (type-of-context :theory) (creation-policy :lite-instance)
		    path-name
                    loom-imports)
  "Use the `LOOM' package inside of the package `packageName' and define a context
called `<packageName>-CXT'.  A shadowing import causes certain Loom symbols,
notably `defmethod', `trace', and `pi', to override their Common Lisp
counterparts.  A context is not created if `dont-create-context-p'
is set.  Setting `context-name' overrides the default choice for naming
the context.  `path-name' specifies the file used (by `save-kb') to store
copies of this context.  `loom-imports', a string or list of strings,
specifies shadowing symbols to be imported from the Loom package."
  (when (quoted-p packageName)
    (setq packageName (cadr packageName)))
  (when (packagep packageName)
    (setq packageName (package-name packageName)))
  (make-top-level-form
    `(use-loom ,packageName)
    '(compile load eval)
    `(call-use-loom
       ',packageName
       :dont-create-context-p
      ,(or dont-create-context-p dont-create-knowledge-base-p)
       :context-name ,context-name
       :type-of-context ,type-of-context :creation-policy ,creation-policy
       :path-name ,path-name             ; THIS IS FOR BACKWARD KB COMPATIBILITY
       :loom-imports ,loom-imports)) )

(defparameter *shadow-import-from-loom*
  '("DEFMETHOD" "COPY-INSTANCE"
	       "TRUE" "FALSE" "UNKNOWN" 
	       "FOR" "IN" "ON" "BY"
	       "COLLECT" "WHEN" "DO" "APPEND"
	       "ALWAYS" "THEREIS" "NEVER" 
	       "TRACE" "UNTRACE"
	       "FIND-METHOD"
	       "SUBSET" "PI"
	       "CONSTANT" "SET"
               "PATTERN" "ROLE"
    )
  "List of symbols that packages using LOOM should shadowing import")

(defun get-package-features (packageName)
  "Looks up or derives the :nicknames, :shadow, :shadowing-import-from,
:use, :import-from and :export features of packageName."
  ;; These are returned as multiple-values.  Each value is a list of strings
  ;; for symbols that are affected.  The shadowing-import-from and the
  ;; import-from returns are exceptions.  They return a list of the actual
  ;; forms for DEFPACKAGE.
  (macrolet ((add-to-package-alist (symbol aList)
	       ;; Adds SYMBOL to appropriate part of ALIST for its package.
	       ;; Note: SYMBOL or ALIST may be evaluated more than once!
               `(let ((symbolPackage (symbol-package ,symbol)))
;                  (unless (member (symbol-name ,symbol) *shadow-import-from-loom*
;                                  :test #'string=)
		    (if (assoc symbolPackage ,aList)
		      (pushnew ,symbol (cdr (assoc symbolPackage ,aList)))
		      (push (list symbolPackage ,symbol) ,aList))
;		    )
		  )) )
    (flet ((make-import-form (importList type)
	     ;; Makes strings of a list of (<package> <symbol> ...)
	    (when importList
	      (loop for (package . symbols) in importList
		    collect (cons type
				  (cons (package-name package)
					(mapcar #'symbol-name symbols)))))) )
			      
      (let ((thePackage (find-package packageName)))
	(if (null thePackage)
	    (values nil nil nil nil nil nil)
	    (let ((existingShadows (package-shadowing-symbols thePackage))
		  (existingUses (package-use-list thePackage))
		  (directShadows nil)
		  (existingImports nil)
		  (existingExports nil)
		  (existingShadowedImports nil))
	      (do-symbols (symbol thePackage)
		(multiple-value-bind (ignored accessibility)
		    (find-symbol (symbol-name symbol) thePackage)
		  (declare (ignore ignored))
		  (when (eql accessibility :external)
		    (push (symbol-name symbol) existingExports))    
		  (if (member symbol existingShadows)
		      (if (eql (symbol-package symbol) thePackage)
			  (pushnew symbol directShadows)
			  (add-to-package-alist symbol existingShadowedImports))
		      (unless (or (eql (symbol-package symbol) thePackage)
				  (eql accessibility :inherited)
				  (member (symbol-package symbol) existingUses))
			(add-to-package-alist symbol existingImports)))))
	      (values (package-nicknames thePackage)		; :NICKNAME
		      (mapcar #'symbol-name directShadows)	; :SHADOW
		      (make-import-form existingShadowedImports
					:shadowing-import-from)
		      (mapcar #'package-name existingUses)	; :USE
		      (make-import-form existingImports :import-from)
		      existingExports				; :EXPORT
		      ) )) ))))

(defun call-use-loom (packageName &key		
			          dont-create-context-p context-name 
                                  (type-of-context :theory)
                                  (creation-policy :lite-instance)
                                  path-name ; THIS IS FOR BWD KB COMPATIBILITY
                                  loom-imports)
  "Embeddable version of `use-loom'.  It can be called within a function,
and its parameters are not implicitly quoted.  See `use-loom'."
  ;; We carefully build up the parts of the new package in the correct order;
  (when (symbolp packageName)
    (setq packageName (symbol-name packageName)))
  (let* ((thePackage (find-package packageName))
	 (packageExistsP thePackage))
    (when (null thePackage)
      (setf thePackage (make-package packageName :use nil)))
    #+:EXCL (shadow '(INSTANCE) thePackage)
    #-EXCL  (shadow '("INSTANCE") thePackage)
    (loop for string in *shadow-import-from-loom*
          do (shadowing-import (find-symbol string "LOOM") thePackage))
    (loop for string in (list-of loom-imports)
          do (shadowing-import (find-symbol string "LOOM") thePackage))
    #+(and :Genera :rel8)
    (shadowing-import-from (find-symbol "SETF" "CLOS") thePackage)
    (use-package '("LOOM") thePackage)
    (unless packageExistsP
      #+TI(unuse-package '("LISP" "TICL") thePackage)
      (use-package '("COMMON-LISP") thePackage))
    (unless dont-create-context-p
      ;; Create Loom-compatible context
      (let ((contextName 
             (or context-name
                 (symbol-append ((string-upcase packageName) "-THEORY")
                                thePackage)))
            ;; for backward compatibility, also create a KB:
            (kbName
             (or context-name
                 (symbol-append ((string-upcase packageName) "-KB")
                                thePackage))))
        (or (find-context contextName)
            (progn
	      (define-context contextName type-of-context () 
                :creation-policy creation-policy)
	      (setf (kb-package-name (define-shadowing-kb kbName contextName
                                       :path-name path-name))
		    packageName)
	      (change-context contextName))))) ))

;; TO DO:
#|
|#
