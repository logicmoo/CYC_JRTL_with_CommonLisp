;;-*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

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
 

;;; BUILD.LISP (TBOX)

(in-package "LOOM")

(export '( rename-concept delete-concept destroy-concept
	  ))

  ;;
;;;;;; "redefine-concept", "rename-concept", "delete-concept", etc.
  ;;    

(defun bump-dot-counter ()
  ;; Emit a newline every so many characters to prevent buffer overload.
  (declare (fixnum *emit-dot-counter* *dot-counter-line-length*))
  (setq *emit-dot-counter* (mod (the fixnum (+ *emit-dot-counter* 1)) *dot-counter-line-length*))
  (when (zerop *emit-dot-counter*) (inform "~&")))

(defun reset-dot-counter ()
  ;; Reset the dot counter to zero.  Should be called when other Loom
  ;;   output is performed;
  (setq *emit-dot-counter* 0) )

(defmacro emit-classify-string (string &optional (keyword :emit-classify-dots))
  ;; Send the string "string" to the trace output if "keyword" belongs to
  ;;    *loom-dialogue-features*;
  (let ((progressType (if (eql keyword :emit-match-stars) :match :classify)))
    `(when (member ,keyword *loom-dialogue-features*)
       (show-progress ,progressType)
       (bump-dot-counter)
       (inform ,string)) ))

;;; Top-level functions for creating, modifying and deleting Loom
;;;     network objects


(defun redefine-concept (newDefinition conceptOrRelation &key restoring-previous-defn)
  ;; Create a new concept, or redefine an old one;
  ;; If the classifier is enabled, classify it as well.
  ;; If the parse was bad and an old definition of the concept
  ;;    exists, restore that definition.
  ;; Note: We push the symbol "CHOKE-ON-THIS" onto the list of unclassified
  ;;    concepts to disable completion;
  (setq newDefinition
	(extract-documentation-string newDefinition conceptOrRelation))
  (let (oldConcept)  ; DGB 6/15/94
    (when (and (get&remf (rest newDefinition) :only-if-no-preexisting-definition-p)
	       (setq oldConcept
		     (case conceptOrRelation
		       ((:concept :property)
			(find-concept (first newDefinition) :no-warning-p t
				      :context (getf (rest newDefinition) :context)))
		       (:relation
			(find-relation (first newDefinition) :no-warning-p t
				       :context (getf (rest newDefinition) :context))))))
      (return-from redefine-concept oldConcept)))
  (unless (validate-options-list-p (rest newDefinition))
    (complain "~&Skipping definition of the ~(~A~) ~S."
	      conceptOrRelation
	      (first newDefinition))
    (return-from redefine-concept nil))
  (let* ((context
	   (compute-context-from-source-options (rest newDefinition)))
	 (concept (find-concept-or-relation-in-context-sublattice
		    (validate-concept-name (car newDefinition))
		    conceptOrRelation
		    context)))
    (push 'CHOKE-ON-THIS *top-level-unclassified-concepts*)
    (cond
      ((null concept)				; new concept 
       (setq concept
	     (create&parse-concept newDefinition conceptOrRelation context))
       (when (bad-definition-p concept)
         (delf *top-level-unclassified-concepts* 'CHOKE-ON-THIS :count 1)
	 (return-from redefine-concept nil)))
      ((cdr (source-definitions concept))	; concept with multiple definitions
       (let* ((wasClassified (classified-p concept))
	      (unmergedConcepts (unmerge-concepts concept)))
	 (when (null unmergedConcepts)
	   (return-from redefine-concept nil))
	 ;; recursively apply "redefine-concept" to unmerged version of concept
	 (setq concept (redefine-concept newDefinition conceptOrRelation))
	 (when wasClassified
	   ;; reclassify other unmerged concepts AFTER
	   ;;    concept has been redefined 
	   (loop for c in unmergedConcepts
		unless (or (eq (name c) (car newDefinition))
			   (member :discarded-by-merge (system-attributes c))
			   (member :garbage-concept (system-attributes c)))
		do (condition&classify-subgraph c)
		   (complete-all-concepts)))
	 (return-from redefine-concept concept)))
      (t					; old definition already exists 
       (setq context
	     (or context *context*))
       (when (neq (context concept) context)
	 (redefining-in-different-context-error
	   concept (context concept) context newDefinition)
         (delf *top-level-unclassified-concepts* 'CHOKE-ON-THIS :count 1)
	 (return-from redefine-concept nil))
       (if (and (undefined-p concept)
		(not (classified-p concept)))
	   (progn
	     (empty-concept concept :conjuncts :primitive
			    :characteristics :system-characteristics)
	     (when (and (eq conceptOrRelation :property)  ; TAR 6/28/99
			(not (property-p concept)))
	       ;; We encountered a forward reference and incorrectly guessed that
	       ;;  this should have been a concept.  Change it to a property:
	       (change-class concept 'UNARY-RELATION))
	     (setf (source-definitions concept) (list newDefinition))
	     (setf (parsed-expressions concept) nil)
	     (parse-source-definitions concept)) 
	   (setq concept
		 (redefine-concept-with-old-definition
		   concept newDefinition conceptOrRelation restoring-previous-defn)))))
       ;; record source file:                   ; moved from above DGB 11/9/92
       (let ((name (name concept)))
	 (when name
           (record-definition-file name conceptOrRelation)))
    (delf *top-level-unclassified-concepts* 'CHOKE-ON-THIS)
    (when concept
      (post-unclassified-concept concept)
      (when (and (not (undefined-p concept))
                 (not (member :disable-classifier *loom-features*)))
        (let ((*conceptBeingDefined* concept))
          ;; prevent "discard-instance" from wiping out merge-into-concept
          ;;    pointer:
          (declare (special *conceptBeingDefined*))
	  (classify&complete-all-concepts))))
    ;; cause "new-time-stamp" to call "seal-network" when its called:
    (setq *match-is-pending-p* t)
    (if (and concept
	     (member :discarded-by-merge (system-attributes concept)))
	(prog1 
	  (follow-merge-concept-pointers concept)
	  (discard-instance concept))	; RMM 3/1/91
	concept)) )


(defun redefine-concept-with-old-definition
       (concept newDefinition conceptOrRelation restoringPreviousDefnP)
  ;; Helping function for "redefine-concept";
  ;; "concept" already has an old definition, which is being replaced by
  ;;    "newDefinition";
  (when (eq concept *thing*)            ;  intercept redefinition of "Thing":
    (redefine-thing newDefinition)
    (return-from redefine-concept-with-old-definition nil))
  (when (member :warn-on-redefinition *loom-dialogue-features*)
    (grumble "Redefining ~(~A~) ~S" conceptOrRelation (or (name concept) concept)))
  (let (oldDefinition)
    ;; save old definition in case of bad parse, unless that
    ;;    one is also bad
    (unless (bad-definition-p concept)
      (setq oldDefinition (car (source-definitions concept))))
    (setf (source-definitions concept) (list newDefinition))
    ;; :newly-redefined attribute will be detected and removed by "revise-one-concept"
    (pushnew :newly-redefined (system-attributes concept))
    ;; "concept" gets posted later, so we avoid doing it now:
    (initiate-revise-subgraph concept :dont-post-concept-p t)
    (when (bad-definition-p concept)
      ;; restore old definition by recursively applying "redefine-concept"
      ;;    to old definition
      (when restoringPreviousDefnP
	;; previous definition was bad too!!
	(complain "That one is also bad!!~%")
	(return-from redefine-concept-with-old-definition nil))
      (when oldDefinition
	(complain "Restoring old definition of ~S~%" (name concept))
	(redefine-concept oldDefinition conceptOrRelation
			  :restoring-previous-defn t))
      ;; indicate bad parse
      (complain "Skipping to next definition ...~%")
      (return-from redefine-concept-with-old-definition nil))
    concept ))

(defun redefining-in-different-context-error (concept oldCxt newCxt newDefinition)
  ;; Generate warning about redefining concept in different context;
  (cerror "Continue without redefining ~S."
	  "Concept ~S is already interned into context ~S and~%~
           you are attempting to redefine ~S in context ~S.~%~
           Old definition: ~S~%~
           New definition: ~S~%~
           First destroy ~S if you wish to move its definition to another context.~%~
           ~S was not redefined."
	  concept oldCxt concept newCxt 
	  (or (getf (cdar (source-definitions concept)) :is)
	      (getf (cdar (source-definitions concept)) :is-primitive)
	      (getf (parsed-expressions concept) :definition)
	      (when (undefined-p concept) :undefined)
	      '???)
	  (or (getf (cdr newDefinition) :is)
	      (getf (cdr newDefinition) :is-primitive))
	  concept concept concept) )

(defun redefine-thing (newDefinition)
  ;; Called by "redefine-concept-with-old-definition";
  ;; Intercept redefinition of THING;
  ;; Merge in all information except the TBox definition (if there is one);
  ;; Generate warning if there is a new TBox definition;
  ;; Return nil, causing "redefine-concept" do avoid trying to reclassify
  ;;    THING;
  (setq newDefinition (rest newDefinition))     ; drop the name THING
  (let ((tboxDefinition
         (or (getf newDefinition :is)
             (getf newDefinition :is-primitive))))
    (when (and tboxDefinition (neq tboxDefinition 'THING))
      (grumble "THING cannot be redefined -- discarding the definition ~A.  The
remaining portions of the new definition for THING will be incorporated."))
    (setq newDefinition `(nil :is Thing ,@newDefinition))
    (redefine-concept newDefinition :concept)
    nil ))

;; DGB 12/28/92 removed default value of "type";
(defun rename-concept (newName conceptOrOldName &key type)  
  ;; Rename the concept indicated by "conceptOrOldName" with the name
  ;;    "newName";  Also rename any references to the old concept name
  (let (concept context tuples)
    (setq concept
	  (coerce-to-concept conceptOrOldName
			     :concept-or-relation type
			     :unmerge-concept-p t
			     :revise-concept-p t))
    (unless concept
      (warn "Can't rename concept `~S` because it can't be found.~%" conceptOrOldName)
      (return-from rename-concept nil))
    (setq context (context concept))
    (when (eq type :relation)
      (if (= (arity concept) 2)
	  (loop for (i v) in (setq tuples (list-tuples concept))
	      do (fremove-value i concept v))
	(loop for tuple in (setq tuples (list-tuples concept))
	    do (fremove-tuple concept tuple))))
    (when context
      (setq newName (validate-concept-name newName)) 
      (unintern-concept concept)
      (intern-concept concept newName context))
    (loop for dependent in (dependents concept)
	 do (change-source-definition dependent))
    (loop for dependent in (non-tbox-dependents concept)
	 do (change-source-definition dependent))
    (change-source-definition concept)
    (post-unclassified-concept concept)
    (unless (member :disable-classifier *loom-features*)
      (classify&complete-all-concepts)) 
    (when (eq type :relation)
      (if (= (arity concept) 2)
	  (loop for (i v) in tuples
	      do (fadd-value i concept v))
	(loop for tuple in tuples
	    do (fremove-tuple concept tuple))))
    concept ))


(defun delete-concept (conceptOrName &key type delete-merged-concepts-p)
  ;; Look for a concept with type "type";
  ;; If multiple concepts were found, they are all deleted iff
  ;;    "delete-merged-concepts-p" is set;
  ;; If dependent concepts exist, ask the user whether each one should be deleted;
  ;; Remove the concept's name from the symbol table and return the deleted concept;
  ;; CAUTION: SUBCONCEPTS OF "concept" DON'T GET RECLASSIFIED;
  (let ((concept
	  (coerce-to-concept conceptOrName
			     :concept-or-relation type
			     :unmerge-concept-p (not delete-merged-concepts-p)
			     :revise-concept-p t))
        (alreadyVisited nil))
    (labels ((delete-dependents (c dependentList)
	       (loop for dep in dependentList
	           when (and (typep dep 'TBOX-CONCEPT)
			     (not (member :garbage-concept (system-attributes dep)))
                             (neq dep c)
			     (not (member dep alreadyVisited)))
                   do (if (y-or-n-p "Delete dependent ~S? " dep)
	                (help-delete-concept dep)
			(progn (inform "Aborting destruction of ~A.~%" concept)
			       (delf *top-level-unclassified-concepts* concept)
			       (condition&classify-subgraph concept)
			       (return-from delete-concept nil)))))
	     (help-delete-concept (c)
	       (when (member c alreadyVisited)
		 (return-from help-delete-concept nil))
	       (push c alreadyVisited)
	       (delete-dependents c (dependents c))
	       (delete-dependents c (non-tbox-dependents c))
	       ;; eliminate "depend-ons" links in one direction:
	       (loop for dep in (depend-ons c)
	           do (delf (dependents dep) c))
	       (loop for dep in (non-tbox-depend-ons c)
	           do (delf (non-tbox-dependents dep) c))
	       (when (typep c 'BINARY-RELATION)
		 (loop for i in (dependent-instances c)
	             do (forget-all-about i)))
	       ;; since we've already reinitialized "c", we call "unlink..."
	       ;;    to finish reclaiming it:
	       (when (classified-p c)
		 (initiate-revise-subgraph c :dont-post-concept-p t))
	       (unlink-classifiable-object c)
	       (delf *top-level-unclassified-concepts* c)
	       (delf *top-level-unsealed-concepts* c)
	       ))

      (cond ((null concept)
             nil)
            ((consp concept) 
             (loop for c in concept
                   collect (delete-concept c :type type)))
            (t
             (help-delete-concept concept)
             (setq *top-level-uncompleted-concepts*
                   (delete-if #'discarded-p *top-level-uncompleted-concepts*))
             ;; possibly we have eliminated undefined concept, and can now classify:
             (classify&complete-all-concepts)
	     (list concept) )) )))

(defun destroy-concept (self &key name)
   "Eliminate all traces of `self' and its dependents.
    Return two values: (1) a list of the names of concepts which were
       destroyed, and  (2) a list of the identifiers of dependent instances
       which were destroyed.
    If `name' is specified and `self' represents the merge of several
       concepts, the merged concept not named `name' are left alone."
  ;; Used to clear out a context without triggering
  ;;    revision of dependents;
  ;; Caution: WE HAVE NOT DETERMINED HOW EXTENSIVE THE
  ;;    DESTRUCTION IS TO NON-DEPENDENT CONCEPTS;
  ;; BUG: WE DON'T RETRACT CONJUNCTS OF INSTANCES THAT POINT TO "self";
  (let ((saveUnclassifiedConcepts *top-level-unclassified-concepts*)
	conceptNames instanceIdentifiers)
    (labels ((destroy-dependent-instance (instance)
	       (when (classified-instance-p instance)
		 (unless (discarded-p instance)
		   (push (identifier instance) instanceIdentifiers)
		   (forget-all-about instance))) )
	     (help-destroy-concept (self name)
	       (when (typep self 'TBOX-CONCEPT)
		 (when (member :garbage-concept (system-attributes self))
		   (return-from help-destroy-concept nil))
		 (when (and name
			    (cdr (source-definitions self)))
		   (setq self (loop for c in (unmerge-concepts self)
                                    when (eq (name c) name)
				    return c)))
		 (when (name self)
		   (pushnew (name self) conceptNames))
		 (when (classified-p self)
		   (initiate-revise-subgraph self :dont-post-concept-p t))
		 ;; eliminate dependent instances:
		 (typecase self
		   (UNARY-CONCEPT
		    ;; TO DO: REMOVE "self" AS A CONJUNCT FROM ALL INSTANCES THAT
		    ;;    CLASSIFY UNDER IT AND POST THE INSTANCES FOR REMATCHING:
		    (loop for i in (list-current-local-instances self)
			 do (destroy-dependent-instance i)))
		   (otherwise
		    ;; TO DO: REWRITE THIS TO RETRACT THE OFFENDING ASSERTED FEATURE,
		    ;;    AND POST THE INSTANCE FOR REMATCHING: 
		    (when (typep self 'BINARY-RELATION)
		      (loop for i in (dependent-instances self)
			   do (destroy-dependent-instance i)))
		    (unseal-predicate-symbol self)))
		 (delf *top-level-unclassified-concepts* self)
		 (delf *top-level-unsealed-concepts* self)
		 (when (relation-p self)
		   (delf *traced-relation-specs* name)))
	       (reclaim-classifiable-object self)
	       ;; now wipe out dependents
	       ;; TO DO: NEEDS TO BE REFINED IF DEPENDENT IS ALSO MERGED;
	       (loop for dep in (bag-append (dependents self)
				       (non-tbox-dependents self))
		    do (help-destroy-concept dep nil)) ))
      (help-destroy-concept
       (or (get-concept self :no-error-p t)
           (get-relation self :no-error-p t)
           (get-concept self))          ; generate error message
       name)
      ;; wipe out any (unnamed) concepts generated during revision:
      (when (neq saveUnclassifiedConcepts *top-level-unclassified-concepts*)
	(loop for c in (set-difference *top-level-unclassified-concepts*
                                       saveUnclassifiedConcepts)
              unless (name c)
	      do (help-destroy-concept c nil)))
      ;; possibly we have eliminated an undefined concept, and can now classify:
      (classify&complete-all-concepts)
      (values conceptNames instanceIdentifiers) )))

(defun detach-tbox-concepts (partition)
  ;; Helping function for "clear-one-context";
  ;; "partition" contains unary concepts or n-ary relations;
  ;; Detach objects in the name space and uninterned objects belonging
  ;;    to "partition" from the network;
  ;; TRICKY:  Create a list of items from "partition."  That is because
  ;;   "destroy-concept" manipulates partition, which is a hash table.  That
  ;;   means we can't call "destroy-concept" inside "do-context-partition",
  ;;   because the latter expands into a maphash.  In the presence of merged
  ;;   concepts, the destruction of a concepts adds and deletes other items
  ;;   from the hash table, which is not allowed inside a maphash.
  ;; TO DO: REWRITE SO THAT CONCEPT IS DESTROYED ONLY IF *ALL* OF
  ;;    ITS REFERENCES ARE GONE -- OTHERWISE, IT IS JUST UNINTERNED;
  (let (destroyedAtLeastOneConceptP destroyList)
    (loop do (setq destroyedAtLeastOneConceptP nil      ; tar 5/25/93
                   destroyList nil)
             (do-context-partition (key self partition) ;create list to destroy
               (push (cons key self) destroyList))
             (loop for (key . self) in destroyList
                   when (destroy-concept self :name key)
                     do (setq destroyedAtLeastOneConceptP t))
          while destroyedAtLeastOneConceptP) ))

(defun follow-merge-concept-pointers (concept)
  ;; Return the concept at the end of a chain of "merged-into-concept" pointers;
  ;; Also, set the "merged-into-concept" slot to point at the end of the chain.
  (if (member :discarded-by-merge (system-attributes concept))
      (let ((pointer (merged-into-concept concept)))
	(if pointer
	    (setf (merged-into-concept concept)
		  (follow-merge-concept-pointers pointer))
	    (progn
	      (warn "~&Concept ~S is marked :discarded-by-merge,~
                     but there is no merged-into-concept pointer.~%"
		    concept)
	      concept)))
      concept) )


  ;;
;;;;;; "extract-documentation-string"
  ;;

(defun extract-documentation-string (newDefinition conceptOrRelation)
  ;; Set the documentation field on the name in "newDefinition" to
  ;;    a documentation string, if one is present;
  ;; Return a definition with the documentation string removed;
  (let (documentationString)
    (when (stringp (second newDefinition))              
      (setq documentationString (second newDefinition))
      (when (first newDefinition)		
	(setf (documentation 
		(first newDefinition)
		;; Lucid is strict about documentation types:
		(if (eq conceptOrRelation :concept) 'type 'variable))
	      documentationString))
      (setq newDefinition
	    (cons (first newDefinition)
		  (rest (rest newDefinition)))))
    newDefinition ))


  ;;
;;;;;; "define-implication"
  ;;

(defun define-implication (antecedent consequent)
  ;; Create concepts for "antecedent" and "consequent";
  ;; If they represent unary concepts, record the implication
  ;;    "antecedent"implies "consequent" as a constraint on the
  ;;    antecedent;
  ;; Otherwise, if they represent relations, record the implication
  ;;    either in:
  ;;      - the consequent relation
  ;;        (if the consequent classified as a user-defined relation)
  ;;      - the antecedent relation (otherwise);
  (let (topLevelReferences relationExpressionP conceptExpressionP)
    (labels ((scan-expression (expression)
	       ;; Collect top level references to concepts and relations,
	       ;;    and note if embedded keywords imply a concept
	       ;;    or relation rule;
	       (if (atom expression)
                 (when (symbolp expression)
                   (push expression topLevelReferences))
                 (progn
                   (case (car expression)
                     ((:satisfies :predicate)
                      (if (cdr (second expression))
                        (setq relationExpressionP t)
                        (setq conceptExpressionP t)))
                     (:function
                      (when (second expression)
                        (setq relationExpressionP t)))
                     ((:domain :range :inverse :composition)
                      (setq relationExpressionP t))
                     ((:at-least :at-most :all :same-as)
                      (setq conceptExpressionP t))
                     ((:and :or :not)
                      (loop for item in (cdr expression)
                            do (scan-expression item)))))))
	     (implication-error (message &rest arguments)
	       ;; Generate error message for bad rule:
	       (apply #'format *error-output* message arguments)	;tar 7/2/92
	       (complain ".~%Error occurred in the rule:~%   ~
                          (implies ~S ~S)~%"
		         antecedent consequent)))
      (scan-expression antecedent)
      (scan-expression consequent)
      (when (and conceptExpressionP relationExpressionP)
        (implication-error "Mixed concept and relation expressions")
        (return-from define-implication nil))
      (unless (or conceptExpressionP relationExpressionP)
	;; scan references to see whether they indicate a concept, relation,
	;;    or ambiguous rule:
	(loop for ref in topLevelReferences
            do
	      (multiple-value-bind (conceptP relationP)
		  (evaluate-reference-in-implication ref)
		(when conceptP
		  (setq conceptExpressionP t))
		(when relationP
		  (setq relationExpressionP t)))))
      (check-implication-for-context-compatibility antecedent consequent 'implies)
      ;; decide what kind of rule we have:
      (cond
       ((and conceptExpressionP relationExpressionP)
        (implication-error "Mixed concept and relation references"))
       ((and (not relationExpressionP)
             (not conceptExpressionP))
        (implication-error 
	 "LOOM can't tell if its parsing an implication between ~%   ~
         concepts or relations"))
       (t
        (help-define-implication
         antecedent consequent (not relationExpressionP)))) )))

(defun help-define-implication (antecedent consequent conceptP)
  ;; Called by "define-implication";
  ;; 
  (flet ((define-argument-object (definition)
           (cond
            ((and (consp definition)
                  (member (first definition) '(satisfies :satisfies)))
             ;; return "satisfies" feature:
             (condition-one-computed-feature definition *context*))
            (conceptP                   ; return a concept:
             (define-concept
               :is definition :characteristics :system-defined))
            (t                          ; return a relation:
             (define-relation
               :is definition :characteristics :system-defined)))))
    (let ((antecedentObject (define-argument-object antecedent))
          (consequentObject (define-argument-object consequent)))
      (when (and (typep antecedentObject 'FEATURE)
                 (typep consequentObject 'FEATURE))
        (complain "~%An `implies' may not contain a :satisfies feature 
                 in both its antecedent and its~%   ~
                   consequent.~%Error occurred in the rule:~%   ~
                   (implies ~S ~S)~%"
	          antecedent consequent))
      (create-proposition
       nil
       :operator 'IMPLIES
       :arguments (list antecedentObject consequentObject)
       :truth-value 'TRUE) )))

(defun evaluate-reference-in-implication (reference)
  ;; Helping function for "define-implication";
  ;; Note: code borrowed from "evaluate-symbolic-reference";
  (multiple-value-bind (identifier context)
      (parse-extended-identifier reference)
    (if (and context
	     (neq context *context*)) 
	(values
	  (evaluate-identifier identifier :concepts context)
	  (evaluate-identifier identifier :relations context))
	(values
	  (eval-concept-id identifier)
	  (eval-relation-id identifier))) )) 

(defun check-implication-for-context-compatibility (antecedent consequent type)
  (flet ((check-argument-for-context-compatibility (argument)
	   (multiple-value-bind (concept relation)
	       (evaluate-reference-in-implication argument)
	     (when (and concept (neq (context concept) *context*))
	       (complain "~%Warning:  Defining an implication for ~S (defined in ~S)~%  in a lower context ~S.~%This may fail if there are references in the implication~%   (~S ~S ~S)~%that are not visible from ~S."
			 argument (context concept) *context*
			 type antecedent consequent *context*))
	     (when (and relation (neq (context relation) *context*))
	       (complain "~%Warning:  Defining an implication for ~S (defined in ~S)~%  in a lower context ~S.~%This may fail if there are references in the implication~%   (~S ~S ~S)~%that are not visible from ~S."
			 argument (context relation) *context*
			 type antecedent consequent *context*)))))
    (when (atom antecedent)
      (check-argument-for-context-compatibility antecedent))
    (when (atom consequent)
      (check-argument-for-context-compatibility consequent)) ))

  ;;
;;;;;; "define-default-implication"
  ;;

(defun define-default-implication (antecedent consequent)
  ;; Find or create a concept for "antecedent" and add to it
  ;;    the default "consequent";
  ;; Top code is copied from "define-implication".  First scan 
  ;;   and make sure that the default form is really a concept
  ;;   defining form:
  (let (topLevelReferences relationExpressionP conceptExpressionP)
    (labels ((scan-expression (expression)
	       ;; Collect top level references to concepts and relations,
	       ;;    and note if embedded keywords imply a concept
	       ;;    or relation rule;
	       (if (atom expression)
		   (when (symbolp expression)
		     (push expression topLevelReferences))
                 (progn
                   (case (car expression)
                     ((:satisfies :predicate)
                      (if (cdr (second expression))
			  (setq relationExpressionP t)
                        (setq conceptExpressionP t)))
                     (:function
                      (when (second expression)
                        (setq relationExpressionP t)))
                     ((:domain :range :inverse :composition)
                      (setq relationExpressionP t))
                     ((:at-least :at-most :all :same-as)
                      (setq conceptExpressionP t))
                     ((:and :or :not)
                      (loop for item in (cdr expression)
			  do (scan-expression item)))))))
	     (default-error (message &rest arguments)
	       ;; Generate error message for bad rule:
	       (apply #'format *error-output* message arguments) ;tar 7/2/92
	       (complain ".~%Error occurred in the default rule:~%   ~
                          (default ~S ~S)~%"
		         antecedent consequent)))
      (scan-expression antecedent)
      (scan-expression consequent)
      (when (and conceptExpressionP relationExpressionP)
        (default-error "Mixed concept and relation expressions.~
                       ~%Note that Loom does not support defaults for relations.")
        (return-from define-default-implication nil))
      (unless (or conceptExpressionP relationExpressionP)
	;; scan references to see whether they indicate a concept, relation,
	;;    or ambiguous rule:
        (loop for ref in topLevelReferences
	    do
	      (multiple-value-bind (conceptP relationP)
		  (evaluate-reference-in-implication ref)
		(when conceptP
		  (setq conceptExpressionP t))
		(when relationP
		  (setq relationExpressionP t)))))
      (check-implication-for-context-compatibility antecedent consequent 'default)
      ;; decide what kind of rule we have:
      (cond
       ((and conceptExpressionP relationExpressionP)
        (default-error "Mixed concept and relation expressions.~
                       ~%Note that Loom does not support defaults for relations."))
       (relationExpressionP
	(default-error "Loom does not support defaults for relations."))
       (t
        (define-concept :is antecedent :defaults consequent
			:characteristics :system-defined)))
      )))


  ;;
;;;;;; Helping functions for "redefine-concept", "rename-concept", etc.
  ;;

(defun validate-concept-name (name)
  ;; Verify that "definition" contains a legal concept name;
  ;; If "name" is a string, intern it into the current package;
  ;; Return the (possible-modified) definition
  (cond 
    ((or (symbolp name)
	 (null name))
     name)					; legal name (may be nil)
    ((stringp name)
     (intern (string-upcase name)))
    (t 
     (parsing-error "Concept name ~S is not a symbol or string" name))) )

;;; Robust search for a concept or relation (user-friendly)

(defun coerce-to-concept
       (conceptOrName &key concept-or-relation unmerge-concept-p revise-concept-p)
  ;; Return a concept corresponding to "conceptOrName":
  ;; If concept is a symbol, look for a concept in the partition indicated
  ;;    by "concept-or-relation";  If "concept-or-relation" is nil, see if one or the
  ;;    other of the partitions CONCEPT and RELATION (but not both) have such
  ;;    a concept;
  ;; If "unmerge-concept-p" is set, unmerge the concept found, and return the
  ;;    now unmerged version which matches the symbol in "conceptOrName";
  ;; If "revise-concept-p" is set, revise the result;
  (let (concept)
    (cond
      ((null conceptOrName)
       (warn "Can't find a concept or relation named NIL~%")
       (return-from coerce-to-concept nil))
      ((symbolp conceptOrName)
       (cond
        (concept-or-relation
         (setq concept (find-concept-or-relation 
                        conceptOrName concept-or-relation *context*))
         (when (null concept)
           (warn "No ~S with the name ~S exists in the current context~%"
                 concept-or-relation conceptOrName)))
        (t
         (let ((searchConcept (eval-concept-id conceptOrName))
               (searchRelation (eval-relation-id conceptOrName)))
           (cond
            ((and searchConcept searchRelation)
             (warn "Can't unambiguously process '~S' because~%~
                    it is both a concept and a relation" conceptOrName))
            (searchConcept (setq concept searchConcept))
            (searchRelation (setq concept searchRelation))
            (t
             (warn "Can't find a concept or relation named '~S'"
                   conceptOrName))))))
       (when (and concept unmerge-concept-p (cdr (source-definitions concept)))
	 (setq concept
	       (loop for c in (unmerge-concepts concept
					        :reclassify-except conceptOrName)
		     when (eq (name c) conceptOrName)
                     return c))))
      ((typep conceptOrName 'TBOX-CONCEPT)
       (setq concept conceptOrName)
       (when (and (cdr (source-definitions concept))
		  unmerge-concept-p)
	 (warn "The concept '~S' contains multiple-definitions~%" concept)
	 (setq concept nil)))
      (t (warn "'~S' is not a concept" conceptOrName)))
    (when (and concept revise-concept-p (classified-p concept))
      (revise&relink-dependents concept)
      (setq concept (initiate-revise-subgraph concept)))
    concept ))

(defun change-source-definition (self &key force-a-change context)
  ;; Generate the current definition of "self", and place that
  ;;    definition into (source-definitions self);
  ;; If "context" is set, temporarily switch to that context
  ;;    so that references to objects not visible from "context" will
  ;;    be prefixed by extended identifiers;
  (flet ((help-change-source-definition (self force-a-change)
           (if (and (cdr (source-definitions self))
		   (not force-a-change))
	      (complain "~%Can't change the original definition of ~A because ~A ~%~
                    has multiple definitions.  They must be unmerged first."
		      (name self) (name self))
	      (if (incoherent-p self)
		  ;; conditioned slots are unreliable for incoherent concepts
		  (install-source-definition self)
		  (setf (source-definitions self)
                        `((,(name self)
                          ,@(generate-definition-body
                             self :name-depend-ons-p nil))))))))
    (if context
      (within-context context 
        (help-change-source-definition self force-a-change))
      (help-change-source-definition self force-a-change)) ))

(defun install-source-definition (self)
  ;; Helping function for "define-concept--internal";
  ;; Situation: "(parsed-expressions self)" is filled, but "self"
  ;;    has no source definition;
  ;; Create one, and fill the slot "(source-definitions self)";
  (let ((*dontSubstituteNamesP* nil)
	sourceDefinition)
    (declare (special *dontSubstituteNamesP*))
    (when (attributes self)
      (setq sourceDefinition
	    `(:characteristics ,(attributes self))))
    (loop for tail on (parsed-expressions self) by #'cddr
	 do
	 (setq sourceDefinition
	       (append sourceDefinition
		       (list
			 (case (first tail)
			   (:definition
			    (if (primitive-p self) :is-primitive :is))
			   (otherwise (first tail)))
			 (generate-dereferenced-expression
			   (second tail) :name-unnamed-concepts-p t)))))
    (setf (source-definitions self)
	  `((,(name self) ,@sourceDefinition))) ))

(defun generate-dereferenced-expression (expression &key name-unnamed-concepts-p)
  ;; Return a copy of "expression" for which all concept objects have
  ;;    been replaced by symbolic references;
  ;; TO DO:  DECIDE IF WE SHOULD RETURN (name expression) FOR ALL NAMED OBJECTS?
  (typecase expression
    (CONS (if (eq (car expression) :relates)
	      (loop for e in (cdr expression)
		    collect (generate-dereferenced-expression e) into result
		    finally (if (member (car result) '(< > <= >= = <> /=))
				(return result)
			        (return (cons :relates result))))
	    (loop for e in expression
		  collect (generate-dereferenced-expression e))))
    (TBOX-CONCEPT (cond
                   (name-unnamed-concepts-p
	            (let ((*forceNamingOfUnnamedConcepts* t))
	              (declare (special *forceNamingOfUnnamedConcepts*))
	              (generate-reference-definition expression)))
                   ((name expression)
	            (generate-context-compatible-reference expression))
                   (t
	            (generate-dereferenced-expression
	             (getf (parsed-expressions expression) :definition)))))
    (COMPUTED-FEATURE (generate-computed-feature-clause expression))
   ; (CONTEXT (name expression))         ;  TAR 12/13/93
    (otherwise (or (name expression) expression))) )


  ;;
;;;;;; Middle-level concept-creation functions
  ;;

(defun create&parse-concept (definition concept/relation context)
  ;; Create a concept, using the name found in "definition",
  ;;    add "definition" to the slot "source-definitions",
  ;;    and parse the definition;
  ;; Note: We avoid placing unnamed concepts onto the uninterned list until
  ;;    after the definition is parsed, so that it won't get named BEFORE
  ;;    it is parsed;
  (let* ((instanceWithMatchingId 
	  (get-instance (getf (rest definition) :identifier)))
	 (conceptName (car definition))
	 (instanceWithMatchingName (get-instance conceptName))
	 newConcept)
    (setq newConcept
	  (cond ((and instanceWithMatchingId
		      (not (meta-thing-p instanceWithMatchingId)))
		 (mark-instance-as-system-defined instanceWithMatchingId nil)
		 (change-class
		  ;; BUG HERE:
		  instanceWithMatchingId
		  (ecase concept/relation
		    (:concept (CLOS::find-class 'UNARY-CONCEPT))
		    (:relation (CLOS::find-class 'BINARY-RELATION))
		    (:property (CLOS::find-class 'UNARY-RELATION))))
		 (setf (name instanceWithMatchingId) conceptName)
		 (intern-concept instanceWithMatchingId conceptName context)
		 instanceWithMatchingId)
		((and instanceWithMatchingName
		      (not (meta-thing-p instanceWithMatchingName))
		      (system-defined-instance-p instanceWithMatchingName))
		 (mark-instance-as-system-defined instanceWithMatchingName nil)
		 ;; DO WE NEED TO COPY OVER ASSERTIONS/ROLE FILLERS???
		 (change-class
		  instanceWithMatchingName
		  (ecase concept/relation
		    (:concept (CLOS::find-class 'UNARY-CONCEPT))
		    (:relation (CLOS::find-class 'BINARY-RELATION))
		    (:property (CLOS::find-class 'UNARY-RELATION))))
		 (setf (name instanceWithMatchingName) conceptName)
		 (intern-concept instanceWithMatchingName conceptName context)
		 instanceWithMatchingName)
		(t (create-concept (first definition) concept/relation context
				   :dont-list-as-uninterned t))))
    ; (setf (sequence-number newConcept) (incf *concept-sequence-counter*))
    (setf (source-definitions newConcept)
	  (list definition))
    (parse-source-definitions newConcept)
    (when (null (name newConcept))
      (push newConcept *list-of-uninterned-concepts*))
    (setq *reseal-network-p* t)
    newConcept ))

  ;;
;;;;;; Merging and Unmerging
  ;;

(defun merge-concepts (mergingConcept intoConcept)
  ;; Merge "mergingConcept" into (the already-classified) concept
  ;;    "intoConcept";
  ;; This is accomplished by a laborious merging of all of the
  ;;    non-TBox knowledge into "intoConcept";
  ;; If "mergingConcept" has no name, but has constraint data:
  ;;    If "intoConcept" has only one definition, then fuse
  ;;    the definitions;  Otherwise, signal an error;
  ;; If "intoConcept" has no name, then fuse the definitions;
  ;; Garbage-collect "mergingConcept";
  ;; Note: merging is very fast if "mergingConcept" is marked :definition-only;
  (when (and (null (name mergingConcept)) 
	     (cdr (source-definitions intoConcept))
	     (non-tbox-depend-ons mergingConcept))
    (complain "~%Warning:  Can't merge the following concept with concept ~S~%~
             because concept ~S has multiple definitions, while the merging~%~
             concept has no name:~%   ~S~%"
	   intoConcept intoConcept (generate-source-definition mergingConcept))
    (throw 'classify-concept-catcher nil))
  ;; Sometimes this gets invoked via (implies ...) before all classification is
  ;; done, so there may be some intermediate concepts that need to be skipped
  ;; over.
  (setq intoConcept (follow-merge-concept-pointers intoConcept))  ; TAR 1/28/99
  (cond
    ((and (member :definition-only (system-attributes mergingConcept))
	  (null (dependents mergingConcept))
          (null (non-tbox-dependents mergingConcept)))          ;  TAR 7/12/94
     ;; note :definition-only concepts with (system-defined) names CAN
     ;;    have dependents (and hence can't use this shortcut);
     ;; take care of uninternment that would otherwise happen inside of
     ;;    "merge-merging-components-into-into-concept":
     (unintern-concept mergingConcept :being-discarded-p t))
    (t
     (when (and (or (eq intoConcept (loom-constant THING))
	            (eq intoConcept (loom-constant BINARY-TUPLE)))
                (name mergingConcept))
       (unless (yes-or-no-p "Concept ~S is about to merge with the concept ~
                             ~S.~%     This operation is NOT undoable.  ~
                             Do you wish to proceed?  (Yes/No) "
			     mergingConcept intoConcept)
	 (throw 'classify-concept-catcher nil)))
     (emit-classify-string "M") 
     (incf *number-of-merges*)
     (merge-merging-components-into-into-concept mergingConcept intoConcept)))
  ;; some system-defined attributes/slots should be propagated to "intoConcept"
  ;;    in all cases:
  (merge-system-defined-components mergingConcept intoConcept)
  (eliminate-merging-concept mergingConcept intoConcept)
  intoConcept )

(defun merge-merging-components-into-into-concept (mergingConcept intoConcept)
  ;; Helping function for "merge-concepts";
  ;; Copy or move components of "mergingConcept" over to "intoConcept";
  ;; Remove possible :definition-only mark from "intoConcept";
  ;; If "mergingConcept" has no name, we discard its definition,
  ;;    and fuse constraints, etc. directy into "intoConcept";
  ;; TO DO: FIGURE OUT HOW TO ELIMINATE NO-LONGER-USED SYSTEM-GENERATED NAMES;
  (let ((mergingName (name mergingConcept))
	(oldIntoName (name intoConcept))
	(oldIntoAttributes (attributes intoConcept)))
    (cond
      ((and mergingName oldIntoName) 
       ;; if one of the names is system-generated, set it to nil, with the
       ;;    ultimate result that the definitions will be fused:
       (cond
	 ((system-defined-name-p mergingConcept)
	  (unless (member :name-is-referenced (system-attributes mergingConcept))
	    (setq mergingName nil)))
	 ((system-defined-name-p  intoConcept)
	  ;; the transferred name is not system-generated:
	  (setf (name intoConcept) mergingName)
	  (setf (sequence-number intoConcept) (sequence-number mergingConcept))
	  (unless (member :name-is-referenced (system-attributes intoConcept))
	    (setf oldIntoName nil))		; so that definitions will fuse
	  (delf (system-attributes intoConcept) :system-generated-name))))
      (mergingName				; "oldIntoName" is nil
       (setf (name intoConcept) mergingName)
       (setf (sequence-number intoConcept) (sequence-number mergingConcept))
       ;; remember if the transferred name is system-generated
       (when (system-defined-name-p  mergingConcept)
	 (addf (system-attributes intoConcept) :system-generated-name))))
    ;; unintern "mergingConcept":
    (if (context mergingConcept)
	(progn
	  ;; modify symbol table so that "mergingName" points to "into-concept":
	  ;;    (later, dependents of merging concepts will relink to into-concept);
	  (transfer-internment-to-into-concept mergingConcept intoConcept)
	  ;; record dependencies of the merging concept's TBox references
	  ;;    (note: "mergingConcept" is guaranteed to have a name):
	  (loop for dependOn in (depend-ons mergingConcept)
	       when (not (or (eq dependOn intoConcept)
		     ;; TO DO: examine whether TBOX dependency cycles should be avoided here
		     ;; vs. not unmerging in all cases where a depend-on of "mergingConcept" changes
			     (member intoConcept (depend-ons dependOn))))
	       do (add-link depend-ons intoConcept dependOn)))
	(delf *list-of-uninterned-concepts* mergingConcept))
    ;; if mergingConcept has no source-definitions, we need to generate them here:
    (when (null (source-definitions mergingConcept))
      (change-source-definition 
	mergingConcept :context (context intoConcept)))
    ;; into concept gets all source definitions:
    (setf (source-definitions intoConcept)
	  (append (source-definitions intoConcept)
		  (source-definitions mergingConcept)))
    ;; uncomplete "intoConcept" so that non-tbox-knowledge will get
    ;;    merged by the call to "parse&incorporate-non-tbox-knowledge"
    (initiate-uncomplete-sublattice intoConcept)
    ;; fix up system-generated attributes:
    (loop for attrib in '(:system-defined :undefined)
	 when (and (member attrib (attributes intoConcept))
		   (or (not (member attrib oldIntoAttributes))
		       (not (member attrib (attributes mergingConcept)))))
	 do (delf (attributes intoConcept) attrib))
    (loop for attrib in (attributes mergingConcept) do
	 (case attrib
	   (:reified
	    (pushnew attrib (attributes intoConcept))
	    (push :merge-target (system-attributes intoConcept)))
	   ((:system-defined :undefined))
	   (otherwise
	    (pushnew attrib (attributes intoConcept)))))
    (merge-abox-knowledge-into-into-concept mergingConcept intoConcept)
    (delf (system-attributes intoConcept) :definition-only)
    ;; fuse the two definitions unless they each had names:
    (when (or (null mergingName)
	      (null oldIntoName))
      (change-source-definition intoConcept :force-a-change t))
    (post-uncompleted-concept intoConcept) ))

(defmethod merge-abox-knowledge-into-into-concept
           ((mergingConcept UNARY-CONCEPT) intoConcept)
  ;; Helping method for "merge-merging-components-into-into-concept";
  ;; Copy knowledge used by the retrieval facility, production rule facility, etc.
  ;;    from "mergingConcept" to "intoConcept";
  ;; BUG???: WE DONT KNOW HOW TO MERGE "previous-index" SLOT;
  (when (rete-node mergingConcept)
    (warn "Rete network node for concept ~S broken by merge operation" mergingConcept))
  (when (and (null-reified-comparison mergingConcept)
	     (null (null-reified-comparison intoConcept)))
    (setf (null-reified-comparison intoConcept) (null-reified-comparison mergingConcept)))
  (loop for i in (list-all-local-instances mergingConcept)
        do (add-to-local-instances intoConcept i))
  nil )

(defmethod merge-abox-knowledge-into-into-concept
           ((mergingConcept UNARY-RELATION) intoConcept)
  ;; Helping method for "merge-merging-components-into-into-concept";
  ;; DO NOTHING, BUT CHANGE THIS IF PROPERTIES CAN HAVE SD'S;
  (declare (ignore intoConcept))
  nil )

(defmethod merge-abox-knowledge-into-into-concept
	   ((mergingConcept TBOX-RELATION) intoConcept)
  ;; Helping method for "merge-merging-components-into-into-concept";
  ;; Copy knowledge used by the retrieval facility, production rule facility, etc.
  ;;    from "mergingConcept" to "intoConcept";
  ;; We also take this opportunity to copy a TBOX slot ("null-comparison") that relates only
  ;;    to relations;
  (setf (if-added-cohorts intoConcept)
	(append (if-added-cohorts mergingConcept) (if-added-cohorts intoConcept)))
  (setf (if-removed-cohorts intoConcept)
	(append (if-removed-cohorts mergingConcept) (if-removed-cohorts intoConcept)))
  (when (null (predicate-symbol intoConcept))
    (setf (predicate-symbol intoConcept)
	  (predicate-symbol mergingConcept)))
  (when (and (null-not-filled-by-restriction mergingConcept)
	     (null (null-not-filled-by-restriction intoConcept)))
    (setf (null-comparison intoConcept) (null-comparison mergingConcept)))
  (when (and (null-comparison mergingConcept)
	     (null (null-comparison intoConcept)))
    (setf (null-comparison intoConcept) (null-comparison mergingConcept))) )

(defun merge-system-defined-components (mergingConcept intoConcept)
  ;; Helping function for "merge-concepts";
  ;; Transfer certain of the system-defined knowledge about
  ;;    "mergingConcept" to "intoConcept";
  ;; Note: The division of responsibility between this function and
  ;;    "merge-merging-components-into-into-concept" occurs because the latter
  ;;    function is not called in all cases;
  (loop for conjuncts in (pure-conjunction-p mergingConcept)
       do (pushnew conjuncts (pure-conjunction-p intoConcept)
		   :test #'set-equal-p))
  (merge-partition-components mergingConcept intoConcept)  ; DGB 3/5/93
  ;; NOTE: :dnf attribute takes precedence over :not-dnf attribute
  (loop for attribute in (system-attributes mergingConcept)
       do (case attribute
	    (:dnf
	     (delf (system-attributes intoConcept) :not-dnf)
	     (pushnew attribute (system-attributes intoConcept)))
	    (:not-dnf
	     (unless (member :dnf (system-attributes intoConcept))
	       (pushnew attribute (system-attributes intoConcept)))))) )

;;; Tricky: The slot "merged-into-concept" enables a localized invisible pointers
;;;    strategy to be used when a concept merges into another.  Instead of (1) placing
;;;    indirection all over the parsing and conditioning code, or (2) fixing up
;;;    pointers to a merged concept, the strategy is to (3) revise all dependents
;;;    after a concept merge.  This causes all of their pointers to point to the
;;;    merged into concept.  However, during revision, invisible pointers placed
;;;    in the "dependents" slot must be followed.  Also, the "pure-conjunction-p"
;;;    slot can contain invisible pointers, since it is not subject to ordinary
;;;    revision.  Therefore, the code uses the "merged-into-concept" slot for a
;;;    concept Foo after Foo merges into something, and until Foo has ceased
;;;    being classified (at which point the slot is nullified).

(defun eliminate-merging-concept (mergingConcept intoConcept)
  ;; Helping function for "merge-concepts";
  ;; Eliminate all traces of "mergingConcept" -- its dependent
  ;;    and depend-on links get reset, and it gets reclaimed; 
  ;; Optimization: If "mergingConcept" has no dependents, or if it has
  ;;    one dependent which is marked :being-classified, then we don't
  ;;    have to worry about redefining dependents;
  (let* ((dependents (dependents mergingConcept))
	 (nonTBoxDependents (non-tbox-dependents mergingConcept))
	 (firstDependent (car dependents)))
    ;; mark "mergingConcept" as being discarded by a merge;
    ;; The merged-into-concept pointer gets preserved during revision:
    (addf (system-attributes mergingConcept) :discarded-by-merge)
    ;; save pointer to where it merged inside of "mergingConcept":
    (setf (merged-into-concept mergingConcept) intoConcept)
    ;; help concepts pointing to "mergingConcept" know when its time to classify:
    (setf (classified-p mergingConcept) t)
    (cond
      ((or nonTBoxDependents
	   (and dependents
		(or (cdr dependents)
		    (not (member :being-classified (system-attributes firstDependent))))))
       ;; setting merging concept's source definitions to nil, followed by
       ;;    an "initiate-revise-subgraph" call, effectively removes that object
       ;;    from all dependency links
       (setf (source-definitions mergingConcept) nil)
       (setf (name mergingConcept) nil)
       (when (typep mergingConcept 'BINARY-RELATION)	; avoid unclassifying the
	 (setf (inverse mergingConcept) nil))	;    inverse relation
       ;; force revision of all dependents of "mergingConcept", and then
       ;;    revise "mergingConcept" to eliminate all pointers to it
       (unclassify-one-concept mergingConcept)
       (initiate-revise-subgraph mergingConcept)
       ;; force revision of any stragglers not caught by "initiate-revise-subgraph"
       ;;    (only happens if they were previously unclassified);
       (loop for dep in dependents
	    when (typep dep 'TBOX-CONCEPT)	; TAR 6/8/99
	    do (revise-one-concept dep))
       ;; force revision of any stragglers not caught by "initiate-uncomplete-subgraph"
       ;;    (happens if they were previously uncompleted):
       (loop for dep in nonTBoxDependents
	    when (typep dep 'TBOX-CONCEPT)	; DGB 8/10/90
	    do (uncomplete-sublattice dep))
       (reclaim-classifiable-object mergingConcept))
      (t
       ;; REWRITE THIS TO COMPLETELY GARBAGE COLLECT THE DISCARDED CONCEPT:
       ;;    BEFORE CALLING "reclaim-classifiable-object", WE HAVE TO INSURE THAT
       ;;    ALL POINTERS TO "mergingConcept" HAVE BEEN ELIMINATED, SINCE WE DIDN'T
       ;;    DO ANY REVISION;
       ;; QUESTION: I FORGET WHY WE DON'T CALL RECLAIM HERE???:
       ;; remove dependent pointers of depend-ons of mergingConcept
       (loop for dep in (depend-ons mergingConcept)
	    do (delf (dependents dep) mergingConcept))
       ;; ELIMINATE THESE CALLS WHEN THIS GETS REWRITTEN:
       (delf *top-level-unclassified-concepts* mergingConcept)
       (delf *top-level-uncompleted-concepts* mergingConcept)
       (delf *top-level-unsealed-concepts* mergingConcept)    
       ))
    ;; pull "mergingConcept" off before it merges with THING:
    (delf (system-attributes intoConcept) :merge-target)) )

(defun unmerge-concepts (concept &key reclassify-except)
  ;; Unmerge the multiple concept definitions for the concept "concept";
  ;; All of the resulting concepts are revised;
  ;; If "reclassify-except" is non-nil, all of them are reclassified
  ;;    (only if they were classified before) except the one whose name
  ;;    is "reclassify-except"
  ;; Note: In the case that "concept" has only a single source
  ;;    definition (which must match "reclassify-except"), "unmerge-concepts"
  ;;    just revises "concept";
  ;; TO DO: ADD CODE TO UNMERGE MULTIPLY-INTERNED CONCEPTS!!!
  ;;    (TEST: IF "predicate-symbols" IS A LIST)
  (when (member concept (list *Thing* (loom-constant BINARY-TUPLE)
			    (loom-constant N-ARY-TUPLE)))
    (warn "You may not unmerge concepts which have merged with ~S~%"
	  concept)
    (return-from unmerge-concepts nil))
  (let* ((wasClassified (classified-p concept))
	 (*normalForm* (when (member :dnf (system-attributes concept))
			 :dnf))
	 otherConcepts
	 unmergedConcepts)
    (declare (special *normalForm*))
    (setq otherConcepts
	  (loop for defn in (cdr (source-definitions concept))
		as context = (if (getf (cdr defn) :context)
			         (coerce-to-context (getf (cdr defn) :context))
			         *context*)
		and id = (or (getf (cdr defn) :identifier) (car defn))
	        collect
		(let (c)
		  (within-context context
		    (setq c (create&parse-concept
			     defn (concept-or-relation concept)
			     context))
		     ;; TRICKY: The following test MUST use "concept", not "c";
		    (when (eq (find-instance id :no-warning-p t) concept)  ; tar 6/28/93
		      (unintern-object id :instances context)))
		  ;; force other concepts to use :dnf normal form
		  (when (eq *normalForm* :dnf)
		    (addf (system-attributes c) :dnf))
		  c)))
    (setq *normalForm* nil)
    ;; eliminate all but the first definition from "concept"
    (setf (cdr (source-definitions concept)) nil)
    (setq unmergedConcepts
	  (cons (initiate-revise-subgraph concept) otherConcepts))
    ;; force revision of any stragglers not caught by "initiate-revise-subgraph"
    ;;    (only happens if they were previously unclassified);
    (loop for dep in (dependents concept)
	 do (revise-one-concept dep))
    ;; force revision of any stragglers not caught by "initiate-uncomplete-subgraph"
    ;;    (happens if they were previously uncompleted):
    (loop for dep in (non-tbox-dependents concept)
	 do (uncomplete-sublattice dep))
    (when (and reclassify-except
	       wasClassified)
      ;; reclassify unmerged concepts except the one with
      ;; name = "reclassify-except"
      (loop for c in unmergedConcepts
	   when (neq (name c) reclassify-except)
	   do (condition&classify-subgraph c)))
    (emit-classify-string "U") 
    unmergedConcepts )) 


  ;;
;;;;;; Building Up and Revising a Concept
  ;;

(defun classify&complete-all-concepts ()
  ;; If the classifier is enabled, classify all concepts on the list
  ;;    *top-level-unclassified-concepts*;
  ;; If that was successful, then if completion is enabled, complete
  ;;    all concepts on the list *top-level-uncompleted-concepts*;
  ;; Finally, intern all uninterned concepts;
  (classify-all-concepts)
  (when (and ; (zerop *count-of-unclassified-concepts*)  ; sometimes wrong!
	     ; (null *top-level-unclassified-concepts*)	; this test might be redundant
	     (not (member :disable-completion *loom-features*)))
    (complete-all-concepts)
    ;; Reclassify any concepts whose first classification might be incomplete,
    ;; boundp test insures that we only do this when at top level
    (when (not (boundp '*reclassify-concept*))
      (process-reclassification-queue)))
  (when (not (boundp '*reclassify-concept*))
    (intern-uninterned-concepts)
    ;; discard concepts kept around so solely for the sake of their
    ;;    merge-into pointers:
    (loop for c in *list-of-discarded-by-merge-concepts*
	 do 
         (setf (dependents c) nil) ;; make "discard-instance" happy
         (discard-instance c))
    (setq *list-of-discarded-by-merge-concepts* nil)) )
      
(defun classify-all-concepts ()
  ;; Classify all concepts, together with their sub-concepts, listed in
  ;;    *top-level-unclassified-concepts*;
  ;; Because concepts may be created in the middle of this process, we
  ;;    are careful to pull things off of the TOP of the stack of
  ;;    unclassified concepts (rather than just iterating through
  ;;    a LIST of unclassified concepts);
  (let (undefinedConcepts)
    (loop while *top-level-unclassified-concepts*
	as concept = (pop *top-level-unclassified-concepts*)
	do (unless (or (member :garbage-concept (system-attributes concept))
		       (member :discarded-by-merge (system-attributes concept)))
	     (if (and (undefined-p concept)
		      (not (referenced-by-role-p concept)))                 
		 (push concept undefinedConcepts) 
	       (condition&classify-subgraph concept))))
    (setq *top-level-unclassified-concepts* undefinedConcepts)))


  ;;
;;;;;;  Reclassification
  ;;

;; TO DO: move defvar to classdefs.lisp when stable
;; concepts are put on this queue when:
;;    normalization of an inherited disjunction is incomplete due to uncompleted concepts;
;;    TO DO: a disjunct becomes incoherent after completion;
(defvar *list-of-reclassify-concepts* nil)


(defun process-reclassification-queue ()
  (when (and *list-of-reclassify-concepts*
	     (not (member :disable-hyper-classifier  *loom-features*)))
    (let (*reclassify-concept*)
      (declare (special *reclassify-concept*))
      #L:trace-build (terpri *trace-output*)
      #L:trace-build (trace-values "entering reclassify-mode" *list-of-reclassify-concepts*)
      (loop
	(when (null *list-of-reclassify-concepts*)
	  (return nil))
	(setq *reclassify-concept* (pop *list-of-reclassify-concepts*))
	;; Reclassify concept, if it has not been discarded
	(when (classified-p *reclassify-concept*)
	  (reclassify-one-concept *reclassify-concept*)))
      ;; When something was reclassified (or even just reconditioned)
      ;; we must recomplete any concepts that got uncompleted
      (when *reclassify-concept*
	(complete-all-concepts)))) )
    
(defun reclassify-one-concept (concept)
  ;; Situation: the first classification of "concept" was known to be incomplete.
  ;; Condition a copy of "concept" without revising "concept" first;
  ;; If the copy is not "identical" with "concept" (it would classify differently),
  ;;    then revise the subgraph of "concept",
  ;;         move the conditioned slots of the copy into "concept",
  ;;         classify "concept" and then classify&complete all concepts posted during revision;

  ;; EXIT TO AVOID A BUG:
  (declare (ignore concept))
  (return-from reclassify-one-concept nil)
 #|
  ;; Quick exit if "concept" is a disjunction with no incoherent disjuncts
  (when (and (eq (defined-as concept) :disjunction)
	     (loop for d in (disjuncts concept)
		  never (incoherent-p d)))
    (return-from reclassify-one-concept))
  ;; We don't know what to do yet, if "concept" has multiple definitions:
  (integrity-check (not (cdr (source-definitions concept))))
  (when (null (source-definitions concept))
    (change-source-definition concept))
  ;; "newConcept" must not use the name of "concept", because that would force revision
  (let ((copyOfConcept (create&parse-concept (cons nil (cdar (source-definitions concept)))
					     (concept-or-relation concept)
					     (context concept)))
	status)
    ;; condition "copyOfConcept"
    (integrity-check (loop for dep in (depend-ons copyOfConcept)
			  always (classified-p dep)))
    #L:trace-build (terpri *trace-output*)
    #L:trace-build (trace-values "reclassify-one-concept:" concept)
    ;; Mark "copyOfConcept" as :being-reclassified-copy so it won't merge during conditioning,
    ;; and mark "concept" as :being-reclassified-original
    ;;     so it won't be included in conditioned slots of "copyOfConcept";
    (addf (system-attributes copyOfconcept) :being-reclassified-copy)
    (addf (system-attributes copyOfConcept) :being-classified)
    (addf (system-attributes concept) :being-reclassified-original)
    (setq status (condition-one-concept copyOfConcept))
    (delf (system-attributes copyOfconcept) :being-reclassified-copy)
    (delf (system-attributes concept) :being-reclassified-original)
    (integrity-check (eq status copyOfConcept))
    (pre-classify-concept copyOfConcept)
    (if (parent-is-identical-p copyOfConcept concept t)
	;; no change
	(progn
	  (emit-classify-string  "N")
	  (unintern-concept copyOfConcept :being-discarded-p t)
	  (reclaim-classifiable-object copyOfConcept))
	;; "copyOfConcept" would classify differently than "concept"
	(progn
	  (emit-classify-string  "R")
	  #L:trace-build (trace-values "reclassify-one-concept: CHANGED" concept)
	  ;; revise dependents and subconcepts of "concept"
	  ;; TO DO: examine whether revision has bad side effects here;
	  ;; possible problems are:
	  ;;    revising sub-concepts of "concept" that "concept" depends on;
	  ;;    cycles of revisions;
	  ;;    inefficiency of revison;
	  (setq status (length *list-of-reclassify-concepts*))  ;; only for integrity-check below
	  (initiate-revise-subgraph concept :dont-post-concept-p t)
	  ;; move the conditioned slots of "copyOfConcept" into "concept"
	  (copy-conditioned-slots copyOfConcept concept)
	  (unintern-concept copyOfConcept :being-discarded-p t)
	  (reclaim-classifiable-object copyOfConcept)
	  ;; classify "concept" and then all concepts posted during revision:
	  (condition&classify-subgraph concept :classify-only-p t)
	  (integrity-check (eql status (length *list-of-reclassify-concepts*)))
	  (classify&complete-all-concepts))))
	  |#
 )

(defmethod copy-conditioned-slots ((fromConcept UNARY-ENTITY) intoConcept)
  ;; Copy the slots that store the result of conditioning;
  ;; Helping function for "reclassify-one-concept"
  (setf (restrictions intoConcept) (restrictions fromConcept))
  (setf (comparisons intoConcept) (comparisons fromConcept))
  (setf (defined-set-feature intoConcept) (defined-set-feature fromConcept))
  (setf (conjuncts intoConcept) (conjuncts fromConcept))
  (setf (defined-as intoConcept) (defined-as fromConcept))
  (setf (computed-features intoConcept) (computed-features fromConcept))
  (setf (disjuncts intoConcept) (disjuncts fromConcept))
  (setf (negated-concepts intoConcept) (negated-concepts fromConcept))
  (integrity-check (equal (attributes intoConcept) (attributes fromConcept)))
  (setf (attributes intoConcept) (attributes fromConcept))
  ;; (setf (system-attributes intoConcept) (system-attributes fromConcept))
  (setf (pure-conjunction-p intoConcept) (pure-conjunction-p fromConcept))
  (loop for dep in (depend-ons fromConcept)
       do (add-link depend-ons intoConcept dep))
  (setf (super-concepts intoConcept) (super-concepts fromConcept))
  (setf (primitive-p intoConcept) (primitive-p fromConcept)) )


;;; Building up a concept means conditioning, classifying, and completing
;;;    it;  Revising a concept undoes what building up did

(defun condition&classify-subgraph (self &key classify-only-p)
  ;; If the concepts that "self" depends on have been classified,
  ;;    then condition, and classify "self";
  ;; Nothing happens if some concept which "self" depends on is still
  ;;    unclassified -- we presume that "self" will be revisited later
  ;;    on and built-up then;
  ;; If "self" gets classified, build-up dependents of "self";
  (declare (special *completionMode* *conceptBeingConditioned*))
  (when (or (classified-p self)
	    (member :being-classified (system-attributes self)))
    (return-from condition&classify-subgraph self))
  (when (member :discarded-by-merge (system-attributes self))
    (return-from condition&classify-subgraph (follow-merge-concept-pointers self)))
  (unless (loop for dep in (depend-ons self)
	      always (classified-p dep))
    (return-from condition&classify-subgraph self))
  (let (resultConcept status stackContext abortCompletionP)
    (when (and (boundp '*conceptBeingConditioned*)
	       (typep *conceptBeingConditioned* 'TBOX-CONCEPT))
      ;; remember whether *conceptBeingConditioned* represents a conditioning
      ;; context or a completion context, because this attribute might be wiped 
      ;; out later by revision;
      (setq stackContext
	    (cond
	     ((member :being-classified 
		      (system-attributes *conceptBeingConditioned*))
	      :being-classified)
	     ((member :being-completed
		      (system-attributes *conceptBeingConditioned*))
	      :being-completed))))
    (addf (system-attributes self) :being-classified)
    #L:trace-build (trace-values "~%condition&classify-subgraph:" self stackContext)
    (unless classify-only-p
      (setq status (condition-one-concept self)))
    (cond
      ((null status)				; failure during conditioning
       (disengage-badly-conditioned-concept self)
       (return-from condition&classify-subgraph self)) ; Return concept w/ bad def'n: TAR 3/30/98
      ((eq status :already-classified)
	(setq resultConcept
	      (and (member :discarded-by-merge (system-attributes self))
		   (follow-merge-concept-pointers self))))
      (t
	(setq status (catch 'classify-concept-catcher
		       (setq resultConcept (classify-one-concept self))))))
    ;; Take care of any reification here:
    (when (concept-is-new-style-reification-p resultConcept)
      (define-associated-reified-relations resultConcept))
    (when (not (keywordp status))
      ;; "status" is neither :reclassify nor :already-classified
      ;; if "self" is interned, decrement counter;
      (when (and (typep self 'TBOX-CONCEPT)
		 (context self))
	(decf *count-of-unclassified-concepts*)))
    ;; :being-classified must be removed before classifying dependents,
    ;;    in case a revision of "self" occurs while classifying them
    (delf (system-attributes self) :being-classified)	; DGB 9/16/91
    
    (cond
      (resultConcept  ;; "self" was actually classified
       (post-uncompleted-concept resultConcept)
       ;; gather statistics, and possibly output a dot:
       (emit-classify-string  ".")
       (incf *number-of-classifications*)
       ;; build-up dependents, except for features:
       (loop for dep in (dependents resultConcept)
	    when (and (typep dep 'TBOX-CONCEPT)
		      (not (undefined-p dep))
		      (not (member :temporary (system-attributes dep))))   ; TAR 3/5/96
	    do (condition&classify-subgraph dep)))
      (status  ;; "self" was not classified, because of abnormal exit
       (integrity-check (member status '(:reclassify :already-classified)))
       #L:trace-build (trace-values "condition&classify-subgraph:" status self)
       (setq abortCompletionP (and (boundp '*completionMode*)
				   (eq *completionMode* :reclassify)))
       (if (member :discarded-by-merge (system-attributes self))
	   ;; must return a concept, even if not classified
	   (setq resultConcept (follow-merge-concept-pointers self))
	   (when (eq status :reclassify)
	     ;; reclassify any concepts that were revised
	     #L:trace-build (trace-values "revisiting classification queue")
	     (classify-all-concepts))))
      (t  ;; Error during conditioning or classification
       (disengage-badly-conditioned-concept self)
       (setq resultConcept self)  ;; must return bad concept
       ))

    ;; Determine whether there is a conditioning context that must be aborted,
    ;; i.e., *conceptBeingConditioned* was already revised and classified;
    ;; Note that this must be checked after all concepts classify,
    ;; because revision of *conceptBeingConditioned* may not force revision
    ;; of all of its nested sub-expressions
    (when (and stackContext
	       (eq stackContext :being-classified)
	       (or abortCompletionP
		   (classified-p *conceptBeingConditioned*)
		   (member :discarded-by-merge
			 (system-attributes *conceptBeingConditioned*))))
      (when (not (classified-p self))
	;; eliminate "self" since a copy of it has already been classified
	#L:trace-build (trace-values "reclaiming sub-expression:" self)
	(unintern-concept self :being-discarded-p t)
	(reclaim-classifiable-object self))
      (throw 'condition-concept-catcher :already-classified))

    ;; Clean up, if reclassification has occurred:
    (when (not resultConcept)
      ;; abort completion if some classified concept had to be revised;
      (when abortCompletionP
	(when (not (classified-p self))
	  #L:trace-build (trace-values "reclaiming aborted consequent:" self)
	  (unintern-concept self :being-discarded-p t)
	  (reclaim-classifiable-object self))
	(throw 'complete-one-concept-catcher nil))
      (if (eq status :reclassify)
	  (progn
	    ;; restart classification of "self" (does nothing if "self" has already classified):
	    #L:trace-build (trace-values "reclassifying subgraph:" self)
	    (setq resultConcept (condition&classify-subgraph self)))
	(setq resultConcept (follow-merge-concept-pointers self))))
    resultConcept) )

(defun condition-one-concept (self &key dont-incorporate-p)
  ;; If self is marked to be expanded to DNF,
  ;;    then replace (in the parsed definition of self)
  ;;    any concepts that are defined as disjunctions
  ;;    with their definitions, and renormalize the definition of self.
  ;; Incorporate expressions into slots of "self";
  ;; Validate the expressions;
  ;; Condition "self";
  #L:trace-build (trace-values "condition-one-concept" self)
  (let ((*conceptBeingConditioned* self)
	(*normalForm* (when (member :dnf (system-attributes self))
			:dnf)))
    (declare (special *conceptBeingConditioned* *normalForm*))
    (when *normalForm*
      (renormalize-disjunctive-definition self)
      ;; don't cause other concepts (sub-expressions) to be expanded to DNF! BK 4/12/90
      (setq *normalForm* nil))
    (or (catch 'condition-concept-catcher
	  (when (not dont-incorporate-p)
	    ;; We only incorporate tbox expressions here, since non-tbox expression
	    ;; may not yet be classifiable, they get incorporated in complete-one-concept.
	    (incorporate-parsed-expressions self :context :definition))
	  (catch 'classify-concept-catcher
	    (condition-concept self)))
	(progn (disengage-badly-conditioned-concept self) ;; TAR 10/6/97
	       nil)) ))


(defun post-unclassified-concept (self)
  ;; If "self" has no unclassified depend-ons, add it to the list
  ;;    of unclassified concepts;
  (when (loop for dep in (depend-ons self)
		  always (classified-p dep))
        #L:trace-build (trace-values "post-unclassified-concept:" self)
    (push self *top-level-unclassified-concepts*)) )

(defun intern-uninterned-concepts ()
  ;; The concepts in *list-of-uninterned-concepts* have not yet been
  ;;    entered into a context;
  ;; Give each one a name (which may be NIL), and intern them;
  (when *list-of-uninterned-concepts* 
    (let (askForUserNameP)
      (when (member :ask-for-concept-names *loom-dialogue-features*)
	(setq askForUserNameP
	      (y-or-n-p "~%Loom generated ~S new concept~:P.  ~
                           Do you wish to name ~:[them~;it~]? "
			(length *list-of-uninterned-concepts*)
			(= 1 (length *list-of-uninterned-concepts*)))))
      (loop for uninternedConcept in *list-of-uninterned-concepts*
	   when (not (name uninternedConcept))
	   do
	   (name&intern-unnamed-concept 
	     uninternedConcept
	     askForUserNameP
	     :dont-update-list-of-uninterned-concepts-p t)))
    (setq *list-of-uninterned-concepts* nil)) )

(defun name&intern-unnamed-concept (concept askForUserNameP &key force-naming-p
				    dont-update-list-of-uninterned-concepts-p)
  ;; Choose a name for "concept" (unless naming is disabled) and intern it;
  ;; Return the new name of "concept" (for use by
  ;;    "TBOX-CONCEPT.generate-reference-definition");
  (let (name dontNameP (*print-pretty* t))	; tar 2/13/92 *print-pretty*
    (setq name
	  (if askForUserNameP
	      (progn
		(format *query-io* "~&Concept definition:~%   ~S~%"
			(generate-concept-definition concept))
		(ask-user-for-concept-name))
	      (progn
		(setq dontNameP
		      (and (not force-naming-p)
			   (member :dont-name-concepts *loom-dialogue-features*)))
		nil)))
    (setq name
	  (generate-name&intern-concept
	    concept name
	    :dont-name-p dontNameP
	    :dont-update-list-of-uninterned-concepts-p
	    dont-update-list-of-uninterned-concepts-p))
    name ))

;;; Revising a subgraph of concepts:

(defun initiate-revise-subgraph (self &key dont-post-concept-p)
  ;; Revise "self", and recursively revise dependents and sub-concepts;
  ;; Revision for concepts consists of uncompleting, unclassifying,
  ;;    reinitialization, and reparsing;
  ;; Decrement *revise-subgraph-pass-counter* and then call "revise-subgraph";
  ;; Note, we use the same slot as does *classify-concept-pass-counter*, but
  ;;    all values are negative, so the counters can't be confused;
  (declare (special *reviseSubgraphConcepts*))
 #L:trace-build (trace-values "initiate-revise-subgraph:" self)
  (flet ((initiate-revise-subgraph-internal (self dont-post-concept-p)
	   (let (result)
	     (initiate-uncomplete-subgraph self)
	     (setq result (revise-subgraph self :dont-post-concept-p dont-post-concept-p))
	     (unless dont-post-concept-p 
	       (if (consp result)
		   (loop for c in result
		       do (post-unclassified-concept c))
		 (post-unclassified-concept self)))
	     result )))
    (if (boundp '*reviseSubgraphConcepts*)
	(initiate-revise-subgraph-internal self dont-post-concept-p)
      (let ((*reviseSubgraphConcepts* nil))
	(declare (special *reviseSubgraphConcepts*))
	(initiate-revise-subgraph-internal self dont-post-concept-p))) ))

(defun revise-subgraph (self &key dont-post-concept-p)
  ;; Called by "initiate-revise-subgraph" (and no one else);
  ;; Revise "self", and recursively revise dependents and sub-concepts;
  ;; Revision for concepts consists of uncompleting, unclassifying,
  ;;    reinitialization, and reparsing;
  ;; Note: If "self" contains multiple source definitions, we return
  ;;    a LIST of concepts;
 (declare (special *reviseSubgraphConcepts*))
 #L:trace-build (trace-values "revise-subgraph:" self)
  (when (or (garbage-concept-p self) (member self *reviseSubgraphConcepts*))
    (return-from revise-subgraph nil))
  (when (rest (source-definitions self))
      (let ((multipleConcepts (unmerge-concepts self)))
	(loop for concept in multipleConcepts
	     do
	     (revise-subgraph concept)
	     (unless dont-post-concept-p
	       (post-unclassified-concept concept)))
	(return-from revise-subgraph multipleConcepts)))
  ;; else, revise "self" and its dependents -- first eliminate
  ;;    possibility of looping by unclassifying right away:
  (push self *reviseSubgraphConcepts*)
  (when (classified-p self)
    (when (completed-p self)
      (uncomplete-one-concept self :about-to-unclassify-p t))
    (unclassify-one-concept self))
  (loop for dep in (dependents self)
       do (unclassify-feature dep))
  ;; note: all features have now been removed from "(dependents self)"
  (loop for dep in (dependents self)
       when (or (classified-p dep) 
		(member :being-classified (system-attributes dep)))
       do 
       (revise-subgraph dep)
       (when (not (member self (depend-ons dep)))
	 (post-unclassified-concept dep)))
  (loop for sub in (sub-concepts self)
       when (classified-p sub)
       do 
       (revise-subgraph sub)
       (post-unclassified-concept sub))
  (revise-one-concept self) 
  self )

(defun revise&relink-dependents (self)
  ;; "self" has been merged, or otherwise moved so that pointers
  ;;    to "self" are now invalid;
  ;; Force revision of dependents of self (even if they have already been
  ;;    revised), and uncomplete non-tbox dependents;
  ;; Note: unclassifying here insures that dependents won't get
  ;;    posted along with "self"
  (when (classified-p self) 
    (unclassify-one-concept self))
  (post-unclassified-concept self)  ;; Why is it posted? BK 4/5/90
  (loop for dep in (non-tbox-dependents self)
       do (uncomplete-sublattice dep))
  (loop for dep in (dependents self)
       when (typep dep 'TBOX-CONCEPT)
       do (revise-subgraph dep)) )

(defmethod destroy-object ((self TBOX-CONCEPT))
  ;; Unintern instance;
  ;; Do nothing for TBOX-CONCEPTS since they aren't indexed.
  ;; TO DO:  DO WE NEED TO DO SOMETHING ELSE WHEN/IF THESE BECOME
  ;;   CONTEXT-SENSITIVE?
  nil)

(defmethod unclassify-feature ((self TBOX-CONCEPT))
  ;; Called by "revise-subgraph";
  ;; "self" is not a feature, so do nothing;
  nil )

(defmethod unclassify-feature ((self FEATURE))
  ;; Called by "revise-subgraph";
  ;; Unlink the feature "self" from the classification hierarchy and
  ;;    discard it;
  ;; Recursively unclassify features below "self";
  (when (classified-p self)
    (empty-feature-sublattice self)) )

;;; Features that don't get classified need special treatment
;;;    when they get unclassified.  If and when we do classify
;;;    them, then eliminate the corresponding methods:

(defmethod unclassify-feature ((self COMPUTED-FEATURE))
  ;; Called by "revise-subgraph";
  ;; Unlink the feature "self" from the classification hierarchy and
  ;;    discard it;
  ;; DANGER: IF "self" HAS SUBFEATURES, THEN THIS CODE FAILS TO REVISE
  ;;    THEIR DEPENDENTS (BUT "self" DOESN'T, YET);
  (integrity-check (null (sub-concepts self)))	; REMOVE THIS WHEN WE CLASSIFY :satisfies
  (let ((dependents (dependents self))
	(nonTBoxDependents (non-tbox-dependents self))
	(consequents (consequents-of-feature self)))
    (empty-feature-sublattice self)
    (loop for dep in dependents
	 do (revise-subgraph dep)
	    (post-unclassified-concept dep))
    (loop for con in consequents
	do (revise-subgraph con)
	   (post-unclassified-concept con))
    (loop for dep in nonTBoxDependents
	 do (uncomplete-sublattice dep)) ))

(defun empty-feature-sublattice (self)
  ;; Called at top-level by "unclassify-feature";
  ;; Unclassify and empty self and all sub-features of "self",
  ;;    and reclaim "self";
  ;; All pointers to depend-ons and dependents are removed;
 ;#L:trace-build (trace-values "empty-feature-sublattice:" self (dependents self))
  (when (and (typep self 'MAX-RESTRICTION)
	     (relation self)
	     (eq (name (relation self)) 'binary-tuple))
    (break "Discarding Binary-Tuple MAX"))
  (setf (classified-p self) nil)
  (loop for sub in (sub-concepts self)
       when (classified-p sub)
       do (empty-feature-sublattice sub))
  (when (typep self 'SET-FEATURE)
    ;; recursively call "empty-feature-sublattice" on any features
    ;;    that depend on "self":
    (loop for dep in (dependents self)
	 when (typep dep 'FEATURE)
	 do (empty-feature-sublattice dep)))
  (when (and (typep self 'VALUE-RESTRICTION)
             (eq (value-restriction self) (loom-constant INCOHERENT)))
    (loop for dep in (dependents self)
          do
          (revise-subgraph dep)
          (post-unclassified-concept dep))
    (loop for dep in (non-tbox-dependents self)
          do
          (uncomplete-sublattice dep)))
  (remove-parent-links self)
  (reclaim-classifiable-object self)
  self )

(defun revise-one-concept (self)
  ;; Helping function for "CONCEPT.revise-subgraph";
  ;; Also called by "eliminate-merging-concept";
  ;; Reinitialize "self" and then re-parse "(source-definitions self)",
  ;;    leaving an unconditioned version of the concept;
  ;; Note: If "self" has multiple source definitions, we do NOT unmerge first;
  ;;       unmerging is done by revise-subgraph
  ;; MODIFIED TO DETECT PRESENCE OF :dnf ON SYSTEM-ATTRIBUTES:
  ;; when :dnf is present,
  ;;   (1) the normal form used to reparse will be DNF,
  ;;   (2) :dnf will be preserved as a system-attribute after reinitialization,
  ;;   (3) the pure-conjunction-p slot will be preserved after reinitialization; BK 3/25/90
 #L:trace-build (trace-values "revise-one-concept:" self)
  (integrity-check (not (classified-p self)))
  (let (*normalForm* systemAttributes pureConjunction DNFDependOns mergePointer
	(newlyRedefinedP (member :newly-redefined (system-attributes self))))
    (declare (special *normalForm*))
    (unless newlyRedefinedP
      ;; :newly-redefined attribute is added by redefined-concept-with-old-definition
      ;; it prevents saving slots that must otherwise be preserved,  BK 4/6/90
      ;; LIST OF PRESERVED SLOTS: merged-into-concept, pure-conjunction-p,
      ;;                          some system-attributes, depend-ons with :dnf system-attribute
      (setq systemAttributes
	    (loop for a in (system-attributes self)
		 when (member a '(:dnf :not-dnf :definition-only :temporary :discarded-by-merge
				       :system-generated-name))
		 collect a))
      (when (member :dnf systemAttributes)
	(setq *normalForm* :dnf))
      (when (member :discarded-by-merge systemAttributes)
	(setq mergePointer (merged-into-concept self)))
      ;; preserve record of pure-conjunctions that are equivalent to "self"
      (setq pureConjunction (pure-conjunction-p self))
      (when (and (null (source-definitions self))
		 (not mergePointer))
	;; "self" has no source-definition, and it is not being merged:
	;; decide whether to generate one, or to discard it
	;; TO DO: consider discarding some system-defined concepts that have source-definitions
	(if (or *normalForm*  ;; expanded to DNF
		(and (name self)
		     (or (dependents self)
			 (non-tbox-dependents self)))  ; BK 4/27/90
		;; condition could be refined to exclude cases where it is safe to discard "self":
		;; e.g. all dependents of "self" are not system-defined (therefore
		;;    can't refer to "self" by name)
		(not (system-defined-concept-p self))
		(member :being-classified (system-attributes self))
		(cdr pureConjunction))
	    ;; NOTE: we use change-source-definition here,
	    ;; because install-source-definition sometimes generates too much for unnamed subexpressions
	    (change-source-definition self)
	    (progn ;; discard self
	      #L:trace-build (trace-values "discarding system-defined concept during revision:" self)
	      (incf *number-of-revision-discards*)
	      ;; NOTE: How much do we really need to do here to fix up dependents?
	      ;; NOTE: duplication of code with eliminate-merging-concept and unmerge-concepts
	      ;;       Should the revision of stragglers be moved into "reclaim-classifiable-object"?
	      ;; force revision of any stragglers not caught by "initiate-revise-subgraph"
	      ;;    (only happens if they were previously unclassified);
	      (loop for dep in (dependents self)
		   do (revise-one-concept dep))
	      ;; force revision of any stragglers not caught by "initiate-uncomplete-subgraph"
	      ;;    (happens if they were previously uncompleted):
	      (loop for dep in (non-tbox-dependents self)
		   do (uncomplete-sublattice dep))
	      (unintern-concept self :being-discarded-p t)
	      (reclaim-classifiable-object self)
	      (return-from revise-one-concept))))
      ;; preserve depend-ons which have been expanded to DNF,
      ;; so that an equivalent sub-expression will not classify first, and then be forced to expand;
      ;; we must follow merged-into-concept pointers to avoid preserving depend-ons that are :discarded-by-merge
      ;;    BK 4/4/90
      (setq DNFDependOns
	    (loop for dep in (depend-ons self)
		 when (and (typep dep 'TBOX-CONCEPT)
			   (member :dnf (system-attributes dep)))
		 collect (follow-merge-concept-pointers dep)))
      ;; if estimated size of dnf expansion is too large,
      ;; and definition is not already a disjunction,
      ;; then replace :dnf attribute by :not-dnf BK 4/12/90
      (when *normalForm*
	(let* ((def (or (getf (cdar (source-definitions self)) :is)
			(getf (cdar (source-definitions self)) :is-primitive)))
	       (size (unless (and (consp def)
				  (eq (car def) :or))
		       (dnf-size def))))
	  (when (and size
		     (> size *dnf-limit*))
		(warn "Concept ~S inhibited from expanding to DNF,~%~
                      because it would have ~S disjuncts." self size)
		(setq *normalForm* nil)
		(delf systemAttributes :dnf)
		(addf systemAttributes :not-dnf)))))
    (reinitialize-classifiable-object self)
    ;; We mark "self" as :being-revised, so that "distribute-reified-relation"
    ;;    will not revise the relation component of a reified relation
    ;;    when the concept component is revised (we have to break a cycle of revisions)
    (addf (system-attributes self)
	  (if newlyRedefinedP :newly-redefined :being-revised))
    (parse-source-definitions self :revising-p t)
    (delf (system-attributes self)
	  (if newlyRedefinedP :newly-redefined :being-revised))
    ;; restore slots that need to be preserved
    (loop for dep in DNFDependOns
	 do (add-link depend-ons self dep))
    (when pureConjunction
      (setf (pure-conjunction-p self) pureConjunction))
    (when systemAttributes
      (setf (system-attributes self)
	    (nconc (system-attributes self) systemAttributes))
      (when mergePointer
	(setf (merged-into-concept self) mergePointer)))
    (incf *number-of-revisions*)
    self ))


(defun unclassify-one-concept (self)
  ;; Unclassify self;
  ;; Note: "self" may or may not be classified upon entry;
  ;;    (It is classified unless called by "eliminate-merging-concept");
  (integrity-check (null (cdr (source-definitions self))))
  (setf (classified-p self) nil)
  (detach-classify-links self)
  (when (typep self 'TBOX-RELATION)
    (detach-dependent-restrictions self)
    (revise-dependent-instances self))
  (empty-concept self :partitions)
  (remove-parent-links self)
  (emit-classify-string  "-")
  ;; if "self" is interned, increment counter;
  (when (context self)
    (incf *count-of-unclassified-concepts*))
  (incf *number-of-unclassifications*) )

(defmethod detach-classify-links ((self UNARY-ENTITY))
  ;; Eliminate null reified comparison;
  (setf (null-reified-comparison self) nil) )

(defmethod detach-classify-links ((self BINARY-RELATION))
  ;; Unclassify references at the other end of inverse links,
  ;;    and then remove inverse, transitive-closure,
  ;;    and null-feature links;
  ;; Note: Infinite recursion is avoided because "self"
  ;;    has already been marked unclassified; 
  (loop for dep in (list-of (inverse self))
       do 
       (when (classified-p dep)
	 (initiate-revise-subgraph dep)
         (unseal-predicate-symbol dep)))
  (remove-relation-links self) )

(defmethod detach-classify-links ((self N-ARY-RELATION))
  ;; Computed relations don't have relation links, so do nothing;
  nil )


  ;;
;;;;;; Completion
  ;;

;;; "completion" refers in this case to processing done to a concept
;;;     after it has been classified;

(defun complete-all-concepts (&key dont-condition-defaults)
  ;; Complete all concepts, together with their sub-concepts, listed in
  ;;    *top-level-uncompleted-concepts*;
  ;; Relations must be completed before concepts, so that their range
  ;;    restrictions are completed before implied value restrictions
  ;;    get completed;
  ;; After completing all sublattices, condition all defaults;
  ;; Push top-level uncompleted concepts onto
  ;;    *top-level-unconditioned-defaults-concepts* and
  ;;    *top-level-unsealed-concepts*;
  (when *top-level-unclassified-concepts*
    (return-from complete-all-concepts nil))
  (flet ((completable-p (c)
	   ;; Return t if "c" is not completed, but all of c's
	   ;;    parents have been completed;
	   (and (not (completed-p c))
		(loop for super in (super-concepts c)
		     always (completed-p super)))))	   
    ;; first, complete all relations:
    (let (compositionRelations)
      (loop for c in *top-level-uncompleted-concepts*
	   unless (member :garbage-concept (system-attributes c))
	   do
	   (when (and (typep c 'TBOX-RELATION)
		      (completable-p c))
	     (if (eq (defined-as c) :composition)
		 (push c compositionRelations)
		 (progn
		   (complete-sublattice c)
		   (post-unsealed-concept c :sealable-p t)))))
      ;; composite relations get deferred so that the domains and ranges
      ;;    of components will be known at completion time:
      (loop for r in compositionRelations
	   do
	   (complete-sublattice r)
	   (post-unsealed-concept r :sealable-p t)))
    (loop
      (when (null *top-level-uncompleted-concepts*)
	(return nil))	; exit loop
      ;; next, complete all concepts:
      (let ((c (pop *top-level-uncompleted-concepts*)))
	(when (and (not (member :garbage-concept (system-attributes c)))
		   (completable-p c))
	  (complete-sublattice c)
	  (when (not (member :temporary (system-attributes c)))
	    (post-unsealed-concept c :sealable-p t)))))
    ;; recomplete any concepts whose completion computations became invalid
    ;;    during completion of other concepts:
    (process-recompletion-queues)
    ;; note: additional defaults may creep in while conditioning defaults,
    ;;    because "complete-all-concepts" is called (recursively) by
    ;;    "disjoint-concepts-p"
    (unless dont-condition-defaults
      (condition-all-defaults)) ))

(defun complete-sublattice (self)
  ;; Complete "self" and all of its sub-concepts, recursively;
  ;; Concept completion involves:
  ;;    Inheriting non-TBox knowledge from parents (e.g., implied-restrictions);
  ;;    Conditioning constraint knowledge;
  ;; (integrity-check (not (completed-p self)))  BK 2/16/90
  ;; integrity-check is wrong when something gets reclassified during completion,
  ;; since both self and its parent will already be completed by revisiting
  ;; the *top-level-uncompleted-concepts* queue;
  ;; TO DO: determine whether this situation would be better handled
  ;;        by having complete-one-concept return a signal that the sublattice
  ;;        has already been completed;
  ;; NOTE: "complete-one-concept" also called by "nonforcing-complete-one-concept"
  (when (not (completed-p self))
    (when (null (catch 'condition-concept-catcher
		  (complete-one-concept self)))
      (disengage-badly-conditioned-concept self)
      (return-from complete-sublattice nil))
    (setf (completed-p self) t)
    (emit-classify-string  "+")
    ;; complete sub-concepts of "self":
    (loop for sub in (sub-concepts self)
	 do 
	 (let ((supers (super-concepts sub)))
	   (when (or (null (cdr supers))
		     (loop for s in supers always (completed-p s)))
	     (complete-sublattice sub)))) ))

(defun disengage-badly-conditioned-concept (self)
  ;; Situation: An error occurred while conditioning or completing
  ;;    "self";
  ;; Possibly emit the character "F", and insure that queues are
  ;;    cleaned up;
  (mark-as-bad-definition self)
  (setf (completed-p self) nil)		; TAR 10/6/97
  (emit-classify-string  "F")
  (delf *top-level-unclassified-concepts* self)
  (delf *top-level-uncompleted-concepts* self)
  (delf *top-level-unconditioned-defaults-concepts* self)
  (delf *top-level-unsealed-concepts* self) )

(defun initiate-uncomplete-subgraph (self)
  ;; Decrement *revise-subgraph-pass-counter* and then call "revise-subgraph";
  ;; Note, we use the same slot as does *classify-concept-pass-counter*, but
  ;;    all values are negative, so the counters can't be confused;
 #L:trace-build (trace-values "initiate-uncomplete-subgraph:" self)
 (let ((*uncompletingP* t))
   ;; Set this variable to allow suppression of some error messages.
   (declare (special *uncompletingP*))
   (setq *network-is-sealed-p* nil)
   (decf *revise-subgraph-pass-counter*)
   (uncomplete-subgraph self)))

(defun uncomplete-subgraph (self)
  ;; Apply "initiate-uncomplete-sublattice" to "self" and
  ;;    all of its dependents and subconcepts, recursively;
  ;; Called by "initiate-uncomplete-subgraph" (and no one else);
  ;; revise "self" and its dependents:
  (setf (already-revised-counter self) *revise-subgraph-pass-counter*)
  (when (completed-p self)
    (uncomplete-sublattice self))
  (loop for dep in (dependents self)
       when (and (typep dep 'TBOX-CONCEPT)
		 (neq (already-revised-counter dep) *revise-subgraph-pass-counter*))
       do (uncomplete-subgraph dep))
  (loop for sub in (sub-concepts self)
       do
       (when (neq (already-revised-counter sub) *revise-subgraph-pass-counter*) 
	 (uncomplete-subgraph sub)))
  ;; non-tbox dependents get uncompleted, but don't recursively
  ;;    uncomplete their dependents (this is because "self" may have become
  ;;    unCLASSIFIED or reCLASSIFIED, but dependents are merely being unCOMPLETED):
  (loop for dep in (non-tbox-dependents self)
       when (completed-p dep)
       ;; note: features are always dependents, not non-tbox-dependents, of concepts
       do (initiate-uncomplete-sublattice dep))
  self )

(defun initiate-uncomplete-sublattice (self)
  ;; Uncomplete self and all of its sub-concepts, recursively;
  ;; Post "self" if it's dependents are all classified;
  ;; Also, if "self" is a concept, uncomplete "more-specific-consequent"
  ;;    and "antecedents" concepts;
  (integrity-check (typep self 'TBOX-CONCEPT))
  (uncomplete-sublattice self)
  (post-uncompleted-concept self) )

(defun uncomplete-sublattice (self &key caused-by-definition-only-p)
  ;; Undo completion for "self" and all of its sub-concepts, recursively;
  ;; :caused-by-definition-only-p indicates that the uncompletion was caused
  ;;    by the addition of a new concept definition -- we can exploit this
  ;;    fact by only generating monotonic rematching of instances;
  ;; Note: We get a miniscule speed-up by assuming upon entry that "self"
  ;;    is completed; HOWEVER, "eliminate-merging-concept" cheats and
  ;;    calls "uncomplete-sublattice" to force an extra revision of the
  ;;    non-tbox-knowledge;
  ;; preserve non-tbox-depend-ons that are expanded to DNF,
  ;; so that we don't create an infinite cycle of equivalent concepts
  (help-uncomplete-indirect-dependents self caused-by-definition-only-p)
  (uncomplete-one-concept self)
  (loop for sub in (sub-concepts self)
       do
       (when (completed-p sub)
	 (uncomplete-sublattice
	   sub
	   :caused-by-definition-only-p caused-by-definition-only-p))) )

(defun uncomplete-one-concept (self &key about-to-unclassify-p)
  ;; Undo completion for "self";
  ;; Note: We are careful to re-parse AFTER we have traversed the
  ;;    "more-specific-consequent" links
  ;;    (which get clobbered by reinitialization);
 #L:trace-build (trace-values "uncomplete-one-concept:" self)
  (when about-to-unclassify-p
    ;; skip most of the uncompletion if unclassification will redo it anyway:
    (setf (completed-p self) nil)
    (return-from uncomplete-one-concept nil))
  (when (and (concept-p self)       ; RMM 3/30/95   ALERT-PATCH
	     (not (consp (first (implied-restrictions self)))) ; TAR 9/30/97
	     (not (consp (first (default-features self)))))    ; TAR 9/30/97
    (alert-relation-of-strict-or-default-fillers self))
  (let ((DNFDependOns
	  (loop for dep in (non-tbox-depend-ons self)
	       when (and (typep dep 'TBOX-CONCEPT)
			 (member :dnf (system-attributes dep)))
	       collect (follow-merge-concept-pointers dep))))
    ;; install source-definitions, if necessary, before emptying
    ;;    non-tbox knowledge (otherwise constraints may get lost):
    (when (and (null (source-definitions self))
	       (getf (parsed-expressions self) :implies))
      (change-source-definition self))
    (empty-non-tbox-knowledge self)
    (setf (completed-p self) nil)
    (parse-non-tbox-knowledge self)
    ;; restore non-tbox-depend-ons that are expanded to DNF
    (loop for dep in DNFDependOns
	 do (add-link non-tbox-depend-ons self dep))
    ;; patch in implied-domain and implied-range, which were first filled in by
    ;;    "BINARY-RELATION.pre-classify-concept":
    (when (typep self 'BINARY-RELATION)
     (when (null (implied-domain self))
      (setf (implied-domain self)
	    (or (defined-domain self) *Thing*)))
     (when (null (implied-range self))
      (setf (implied-range self)
	    (or (defined-range self) *Thing*))))
    (uncompile-all-predicate-cohorts self) ))

(defmethod help-uncomplete-indirect-dependents
	   ((self UNARY-ENTITY) causedByDefinitionOnlyP)
  ;; Helping method for "uncomplete-sublattice";
  ;; Unseal, revise, or whatever, various sorts of dependents of "self"
  ;;    to eliminate computations that depended on the completion of "self";
  (when (more-specific-consequent self)
    ;; uncomplete concepts affected by the value of
    ;;    "(more-specific-consequent self)",
    ;;    i.e., uncomplete antecedents of "self", relations with ranges
    ;;    pointing to "self", and values-restrictions referencing "self":
    (loop for dep in (collect-implication-dependents self)
	 do (uncomplete-sublattice 
	      dep
	      :caused-by-definition-only-p causedByDefinitionOnlyP)
	    (post-uncompleted-concept dep)))    ;  TAR 9/10/98
  (when (more-specific-consequent self)         ;  TAR  4/5/95
    ;; Tricky:  We need to test this condition again, because the call to
    ;;   "uncomplete-sublattice" may have called (via an indirect route)
    ;;   "help-uncomplete-indirect-dependents" on the same argument as this
    ;;   call.  If that is so, "most-specific-consequent" is NIL and the
    ;;   following code would break:
    (post-supers-of-consequent-for-resealing
      (more-specific-consequent self) self)
    (empty-concept self :consequents)) )

(defun post-supers-of-consequent-for-resealing (consequent antecedent)
  ;; Situation: "consequent" has just become, or is no longer, implied
  ;;    by "antecedent"
  ;; Unseal superconcepts of "consequent" that are not also superconcepts
  ;;    of "antecedent" (because their backwardchainingness may be affected);
  ;; Called by "help-uncomplete-indirect-dependents" and "condition-consequents";
  (loop for super in (all-super-concepts consequent)
       when (and (sealed-p super)
		 (not (subconcept-p antecedent super))
		 (not (eq consequent (more-specific-consequent super))))
       do (unseal-one-concept super)) )

(defmethod help-uncomplete-indirect-dependents
           ((self UNARY-CONCEPT) causedByDefinitionOnlyP)
  ;; Revise instances of the concept "self", and also uncomplete, 
  ;;    revise, or whatever, various sorts of dependents of "self";
  (when (and (sealed-p self)
	     (not (backward-chaining-p self)))	; TAR 3/15/93
    (loop for i in (generate-instances self :cached-p t) ; removed :cached-p t ; TAR 2/12/99
	 do (revise-one-instance i :monotonic-p causedByDefinitionOnlyP)))
  (call-next-method) )

(defmethod help-uncomplete-indirect-dependents
	   ((self TBOX-RELATION) causedByDefinitionOnlyP)
  ;; Helping method for "uncomplete-sublattice";
  ;; Unseal, revise, or whatever, various sorts of dependents of "self"
  ;;    to eliminate computations that depended on the completion of "self";
  ;; Because "self" is (being) uncompleted, all (transitive) dependents also get
  ;;    uncompleted, and there are no indirect dependents, so we do nothing here;
   (declare (ignore causedByDefinitionOnlyP))
;  (loop for ftr in (dependents self)
;       when (and (typep ftr 'COMPUTED-FEATURE)
;		 (eq (feature-type ftr) :satisfies))
;       do (loop for dep in (dependents ftr)
;	       do (unseal-one-concept dep)))
  nil )

(defun collect-implication-dependents (self)
  ;; Helping function for "uncomplete-sublattice" and
  ;;   "post-dependents-for-recompletion";
  ;; Return a list of concepts and relations who must be recompleted
  ;;    because they have an implication, implied-range (of relation),
  ;;    or implied value restriction that depends on a deductive
  ;;    closure that referenced "(more-specific-consequent self)";
  (let (dependents)
    (loop for dep in (non-tbox-dependents self)
	 when (and (typep dep 'TBOX-CONCEPT)
		   (completed-p dep))
	 do
	 (typecase dep
	   (UNARY-ENTITY
	    (when (or (loop for res in (implied-restrictions dep)
			   thereis (and (eq (feature-type res) :value-restriction)
					(eq (value-restriction res) self)))
		      (and (more-specific-consequent dep)
			   (subconcept-p
			     (more-specific-consequent dep)
			     self)))
	      (pushnew dep dependents)))
	   (TBOX-RELATION
	    (when (eq (implied-range dep) self)
	      (pushnew dep dependents)))))
    dependents))

(defmethod empty-non-tbox-knowledge ((self UNARY-ENTITY))
  ;; Unlink all slots associated with non-TBox knowledge;
  ;; Exception: "more-specific-consequent" and "antecedents" links
  ;;    are excluded here;
  (setf (backward-chaining-complexity self) nil)
  (empty-concept self :non-tbox-depend-ons :closed-world)
  (empty-concept self :implied-restrictions 
		 :implied-comparisons :implied-computed-features
		 :default-concepts :default-features
		 :most-general-antecedents) )

(defmethod empty-non-tbox-knowledge ((self N-ARY-RELATION))
  ;; Unlink all slots associated with non-TBox knowledge;
  (empty-concept self :non-tbox-depend-ons :closed-world)
  (empty-concept self :implied-domains :implied-range)
  (empty-concept self :antecedents))

(defmethod empty-non-tbox-knowledge ((self BINARY-RELATION))
  ;; Unlink all slots associated with non-TBox knowledge;
  (empty-concept self :non-tbox-depend-ons :closed-world)
  (empty-concept self :implied-domain :implied-range)
  (empty-concept self :antecedents))

(defun post-uncompleted-concept (self)
  ;; If all super-concepts of "concept" are completed, add it to the list
  ;;    of uncompleted concepts;
  (when (and (not (completed-p self))
	     ;; The following test is an efficiency hack, since sometimes
	     ;;  (often?) concepts are posted in succession.
	     (not (eq self (first *top-level-uncompleted-concepts*)))
	     (loop for super in (super-concepts self)
		  always (completed-p super)))
    (push self *top-level-uncompleted-concepts*)) )

(defun post-unsealed-concept (self &key sealable-p)
  ;; If all super-concepts of "concept" are sealed, add it to the list
  ;;    of unsealed concepts;
  ;; "sealable-p" is true if the above check is guaranteed to succeed;
  ;; Called by "complete-all-concepts", "nonforcing-complete-one-concept"
  ;;    and "find-or-create-clos-class";
  (integrity-check (not (boundp '*sealingInProgressP*))
   :message "Trying to add new concepts to seal while processing existing ones.")
  (when (or sealable-p
	    (and (not (member :temporary (system-attributes self)))
		 (loop for super in (super-concepts self)
		      always (test-bit-flags (tbox-flag super) :tbox-flag :sealed))))
    (when (typep self 'UNARY-ENTITY)
      (push self *top-level-unconditioned-defaults-concepts*))
    (push self *top-level-unsealed-concepts*)
    (setq *reseal-network-p* t)) )


  ;;
;;;;;; classifying undefined concepts
  ;;

(defun classify-one-undefined-concept (self)
  ;; Install a primitive definition into "self", classify it and
  ;;     its dependents, and possibly complete it.
  (setf (parsed-expressions self) '(:definition :primitive))
  (setf (primitive-p self) t)
  (setf (attributes self) '(:system-defined))   ; eliminate :undefined
  (post-unclassified-concept self)
  (classify&complete-all-concepts)
  (push :undefined (attributes self))   ; put :undefined back AFTER classification
  )

(defun classify-undefined-concepts ()
  ;; Make all undefined concepts artificially defined, so that the
  ;;    network can be completed and sealed (unless there are
  ;;    cyclic definitions).
  (loop for c in *top-level-unclassified-concepts*
        when (undefined-p c)
        do (classify-one-undefined-concept c)) )

;; BUGS:

#|

"destroy-concept" DOESN'T RETRACT CONJUNCTS OF INSTANCES THAT POINT TO "self"

We don't yet UNMERGE ABox knowledge when unmerge-concepts is called.

|#
;; To Do:

#|

"unmerge-concepts":
   ADD CODE TO UNMERGE MULTIPLY-INTERNED CONCEPTS!!!
      (TEST: IF "predicate-symbols" IS A LIST)

   ALSO, CONSIDER ADDING :system-defined-identifier ATTRIBUTE

MERGING CONCEPTS:
  (0) SPEED THINGS UP BY CALLING "recomplete-..." INSTEAD OF UNCOMPLETE/COMPLETE;
  (1) SPLICE SOURCE DEFINITIONS TO FUSE DEFINITIONS;


|#
