;;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-
;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;
;;;   THIS IS A LOOM PATCH FILE
;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;
;;;  Use of this file:
;;;       This file should replace your existing loom-patches.lisp
;;;       file in the patch directory of your loom source hierarchy.
;;;       You may need to rename this file to "loom-patches.lisp".
;;;       That will allow the load-loom.lisp and compile-loom.lisp
;;;       files to get the most current version.
;;;
;;;       Alternately, you can load this at startup into an existing
;;;       Loom application.
;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1999-2004 University of Southern California                  ;
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


(in-package "LOOM") 


#+TI(eval-when (eval load compile)
      (defparameter inhibitRedefinitionWarningsP TICL::inhibit-fdefine-warnings)
      (unless TICL::inhibit-fdefine-warnings 
	(setq TICL::inhibit-fdefine-warnings :just-warn)))

#+:LUCID(eval-when (eval load compile)
           (defparameter inhibitRedefinitionWarningsP USER::*redefinition-action*)
	   (setq USER::*redefinition-action* nil))

#+:EXCL(eval-when #-:allegro-v4.1(eval load compile)
                  #+:allegro-v4.1(:execute :load-toplevel :compile-toplevel)
	  (defparameter inhibitRedefinitionWarningsP EXCL::*redefinition-warnings*)
	  (setq EXCL::*redefinition-warnings* nil))

#+:MCL(eval-when (:execute :load-toplevel :compile-toplevel)
	(defparameter inhibitRedefinitionWarningsP CCL::*warn-if-redefine*)
	(setq CCL::*warn-if-redefine* nil))

(eval-when (eval compile load) 
  (set-dispatch-macro-character #\# #\L #'trace-char-reader)
  ) ;; end eval-when

;;; BEGINNING OF LOOM 4.0 PATCHES ----------------------------------------- ;


;;; Patch Loom4-0-1  7/13/99
;;; Function calls to INTRINSIC-CONCEPT missing argument.

(defmethod copy-instance ((instance DB-INSTANCE) &key identifier copy-into join-worlds-p context kb add-suffix-p)
  "Create an instance containing assertions equivalent to those
   found in the instance `instance'.  The identifier of the new instance
   will be system-generated unless it is indicated by `identifier'."
  ;; "join-worlds-p" indicates that the "join-worlds" function is performing
  ;;    a copy into, and that special parameters are to be passed to
  ;;    "copy-role-fillers";
  ;; TO DO:  MAKE THIS WORK FOR LITE AND CLOS INSTANCES AS WELL;
  (obsolete-argument copy-instance kb context #'get-context-from-kb)
  (when (and copy-into (not (classified-instance-p copy-into))) ; TAR 9/9/93
    (grumble "Copy-instance must copy into the same type of instance, in this ~%~
              case another CLASSIFIED-INSTANCE.~%~
              The target instance ~A is not of that type." copy-into)
    (return-from copy-instance nil))
  (let* ((copy (or copy-into
		   (create identifier (intrinsic-concept instance)
                           :creation-policy :classified-instance ; TAR 9/9/93
			   :context context :add-suffix-p add-suffix-p))))
    (loop for entry in (conjuncts-table instance)
	when (assertion-p (cdr entry))
	do (assert-conjunct copy (car entry) :assertion))
    
    (if join-worlds-p
	(copy-role-fillers instance copy t :phantoms)
	(copy-role-fillers instance copy nil nil))
    ;; DOES THIS CODE WORK BOTH FOR COPYING CLASSIFIED AND LOCAL RESTRICTIONS???:
    (loop for f in (asserted-features instance)
	do (push f (asserted-features copy)))
    (loop for n in (asserted-negations instance)
	do (push n (asserted-negations copy)))

    (post-non-analyzable-modified-instance copy :assertion (default-mode-p))
    (when *automatically-advance-state-p*
      (new-time-point))
    copy ))

(defmethod copy-instance ((instance LITE-INSTANCE) &key identifier copy-into join-worlds-p context kb add-suffix-p)
  "Create an instance containing assertions equivalent to those
   found in the instance `instance'.  The identifier of the new instance
   will be system-generated unless it is indicated by `identifier'."
  ;; "join-worlds-p" indicates that the "join-worlds" function is performing
  ;;    a copy into, and that special parameters are to be passed to
  ;;    "copy-role-fillers";
  ;; TO DO:  MAKE THIS WORK FOR LITE AND CLOS INSTANCES AS WELL;
  (declare (ignore join-worlds-p))
  (obsolete-argument copy-instance kb context #'get-context-from-kb)
  (when (and copy-into (not (lite-instance-p copy-into))) ; TAR 9/9/93
    (grumble "Copy-instance must copy into the same type of instance, in this ~%~
              case another LITE-INSTANCE.~%~
              The target instance ~A is not of that type." copy-into)
    (return-from copy-instance nil))
  (let* ((copy (or copy-into
		   (create identifier (intrinsic-concept instance)
                           :creation-policy :lite-instance        ; TAR 9/9/93
			   :context context :add-suffix-p add-suffix-p))))
    (loop for c in (dynamically-asserted-conjuncts instance)
	 do (assert-conjunct copy c :assertion))
    
    (copy-role-fillers instance copy nil nil)
    ;; DOES THIS CODE WORK BOTH FOR COPYING CLASSIFIED AND LOCAL RESTRICTIONS???:
    (loop for f in (asserted-features instance)
	 do (push f (asserted-features copy)))
    (loop for n in (asserted-negations instance)
	do (push n (asserted-negations copy)))

    (when *automatically-advance-state-p*
      (new-time-point))
    copy ))

;;; Patch Loom4-0-2  7/13/99
;;; Function calls to INTRINSIC-CONCEPT was mistakenly to INTRINSIC-TYPE
;;; Function calls to SETF CHARACTERISTICS should be ATTRIBUTES

(defun create-skolem-instance (identifier &key type)
  ;; Create a new classified instance (or find an existing one),
  ;;  and give it the :skolem attribute;
  (let ((skolem (when identifier (get-instance identifier))))
    (when (and skolem (not (classified-instance-p skolem)))
      (grumble "An instance with identifier ~S already exists, but it is
not a classified instance, so Loom cannot turn it into a skolem.")
      (return-from create-skolem-instance nil))
    (unless skolem
      (setq skolem (create-classified-instance identifier type nil))
      (when type 
	(setf (intrinsic-concept skolem) (get-sealed-concept type))))
    (when type
      (assert-conjunct skolem (get-sealed-concept type) :assertion))
    (execute-in-ctxts-depth-first
     (set-bit-flags (db-attributes skolem) :db-instance :skolem))
    skolem) )


(defmethod convert-roles-to-objects ((self UNARY-CONCEPT))
  ;; Called by "UNARY-ENTITY.help-seal-one-concept";
  ;; Create a role object for each entry in "(role-cache self)" if a previous
  ;;    call has not already done so;
  ;; If the entry contains a :facets attribute, assert the facets
  ;;    on the new role object;
  ;; If the entry contains a :function attribute, store the source
  ;;    for the function on the role object;
  (when (or (null (role-cache self))
            ;; exit if roles have already been converted to objects
            (not (consp (first (role-cache self)))))
    (return-from convert-roles-to-objects nil))
  (let ((roles nil))
    (loop for entry in (role-cache self)
          as newRole = (create-role)
          do
          (setf (concept newRole) self)
          (setf (relation newRole) (first entry))
          (setf (role-specification newRole) (rest entry))
          (loop for tail on (rest entry) by #'cddr
                do
                (case (first tail)
                  (:facets              ; make actual facet assertions:
                   (assert-annotations newRole))
                  (:characteristics
                   (setf (attributes newRole)
                         (second tail)))
                  (otherwise            ; do nothing here
                   nil)))
          (push newRole roles))
    (setf (role-cache self) roles) ))


(defun parse-role-declarations (option roles self)
  ;; Turn singleton role or property declarations into lists, validate attached
  ;;    function declarations, verify that "self" is binary,
  ;;    replace symbolic references by relation objects;
  (when (not (concept-p self))
    (parsing-error "The :roles option applies only to concepts.~%   ~
                    ~S is not a concept" (generate-external-reference self)))
  (let ((roleEntries (loop for entry in roles
                           collect 
                           (parse-one-role-declaration
                            option (copy-list (list-of entry)) self))))
    (ecase option
      (:roles (setf (role-cache self) roleEntries))
      (:properties ;; (setf (properties self) roleEntries)
       (parsing-error "The :properties option is not implemented."))) ))

;;; Patch Loom4-0-3  7/13/99
;;; Add :domain inferences for PROPERTIES on Classified instances

(defmethod local-assert-conjunct ((instance DB-INSTANCE) conjunct justification)
  ;; The assertion of a unary predicate translates into the entry 
  ;;    of the concept "conjunct" into "(conjuncts-table instance)";
  ;; Record the assertion, and test for posting on the queue of
  ;;    modified db-instances;
  ;; TO DO: ADD INCOHERENCE DETECTION CODE;
  (let ((mergedInstance (womp-merge-pointers instance)))
    (when (neq mergedInstance instance)
      (setq instance mergedInstance)
      (when (not (classified-instance-p instance))
        (assert-conjunct instance conjunct justification)
        (return-from local-assert-conjunct nil))))
  (when (add-to-conjuncts-table-p instance conjunct justification)
;    (when (member justification '(:assertion :domain/range))
;      (add-to-local-instances conjunct instance))
    (add-to-local-instances conjunct instance)          ;  TAR 2/14/95
    (when (member :clip-types *loom-match-features*)
      (retract-not-in instance conjunct))    ;  TAR 3/29/94
    (post-non-analyzable-modified-instance instance :assertion (default-mode-p))
    ;; SEE IF WE CAN ELIMINATE THIS NOW THAT WE HAVE HISTORY INSTANCES:
    (push conjunct
          (newly-asserted-conjuncts (modification-summary instance)))
    (when (and (property-p conjunct)	; TAR 7/13/99
	       (neq (implied-domain conjunct) *Thing*))
      (if (eq (implied-domain conjunct) (loom-constant INCOHERENT))
	  (post-incoherent-instance
	   instance
	   (format nil 
		   "~S was asserted to have a property ~S~%and the domain of ~S is INCOHERENT."
		   instance conjunct conjunct))
	(local-assert-conjunct instance (implied-domain conjunct) :domain/range)))
    ))

(defmethod local-retract-conjunct ((instance DB-INSTANCE) conjunct justification)
  ;; The assertion of a unary predicate translates into the entry 
  ;;    of the concept "conjunct" into "(conjuncts-table instance)";
  ;; Record the retraction, and test for posting on the queue of
  ;;    modified db-instances;
  (let ((mergedInstance (womp-merge-pointers instance)))
    (when (neq mergedInstance instance)
      (setq instance mergedInstance)
      (when (not (classified-instance-p instance))
        (retract-conjunct instance conjunct justification)
        (return-from local-retract-conjunct nil))))
  (when (delete-from-conjuncts-table-p instance conjunct justification)
    (post-non-analyzable-modified-instance 
     instance :retraction (default-mode-p))
    (when (and (property-p conjunct)	; TAR 7/13/99
	       (neq (implied-domain conjunct) *Thing*))
      (if (eq (implied-domain conjunct) (loom-constant INCOHERENT))
	  (post-incoherent-instance
	   instance
	   (format nil 
		   "~S was asserted to have a property ~S~%and the domain of ~S is INCOHERENT."
		   instance conjunct conjunct))
	(local-retract-conjunct instance (implied-domain conjunct) :domain/range))))
  )


;;; Patch Loom4-0-4  7/14/99
;;; More properties patches.

(defmethod post-classify-concept ((self UNARY-RELATION) selfWasMerged); TAR 7/6/99
  ;; Call next method
  ;; Compute slot that notes the existence of more restrictive 
  ;;   domain definitions;
  (declare (ignorable selfWasMerged))
  (call-next-method)
  (when (not (or (primitive-p self)
		 (defined-as self)))
    (complete-restricted-unary-relation self))
  ;; Insure a non-nil value for "(implied-domain self)"
  (when (null (implied-domain self))				; TAR 7/14/99
    (setf (implied-domain self)
      (or (defined-domain self) *Thing*))))


(defun display-classifier-match-changes (instance oldType newType)
  ;; Print the concepts that have entered and exited the type of "instance";
  (let ((visibleContexts (context-precedence-list *context*)))
    (labels ((suppress-concept-printing-p (c)
	       (or (system-defined-name-p c)
		   (null (name c))
		   (eq c (loom-constant UNARY-TUPLE))
		   (not (member (context c) visibleContexts))))
	     (collect-ancestors (type)
	       (let (result)
		 (if (consp type)
		     (loop for c in type
			 do (unless (suppress-concept-printing-p c)
			      (pushnew c result))
			    (loop for super in (all-super-concepts c)
				unless (suppress-concept-printing-p super)
				do (pushnew super result)))
		   (progn
		     (unless (suppress-concept-printing-p type)
		       (pushnew type result))
		     (loop for super in (all-super-concepts type)
			 unless (suppress-concept-printing-p super)
			 do (pushnew super result))))
		 result)))
      (let* ((oldConcepts (collect-ancestors oldType))
	     (newConcepts (collect-ancestors newType))
	     (exitConcepts (set-difference oldConcepts newConcepts))
	     (entryConcepts (set-difference newConcepts oldConcepts)))
	(when (or exitConcepts entryConcepts)
	  (reset-dot-counter)
	  (inform "~%Recognition changes for state ~D in context ~A:~%"
		  *agent-time* (name *context*))
	  (loop for exitConcept in exitConcepts
	      as firstTimeP = t then nil
	      do (inform "   ~:[     ~;exit:~]  ~S~20,5T~S~%"
			 firstTimeP (identifier instance) exitConcept))
	  (loop for entryConcept in entryConcepts
	      as firstTimeP = t then nil
	      do (inform "   ~:[      ~;entry:~]  ~S~20,5T~S~%"
			 firstTimeP (identifier instance) entryConcept))) ))))


;;; Patch Loom4-0-4  8/12/99
;;; Concepts merging between sibling contexts and related filtering.

(in-package "LOOM")

;; tbox/contexts.lisp:

(defmethod visible-object-p ((object UNARY-ENTITY))
  ;; Returns T if this object is visible from the current context;
  ;; Checks multiple names, since cross-context merges can mean that the
  ;;   name under which the concept is visible can be different.  Check
  (loop for n in (concept-names object) 
      thereis (eq object (get-concept n :no-error-p t))) )

(defmethod visible-object-p ((object TBOX-RELATION))
  ;; Returns T if this object is visible from the current context.
  (loop for n in (relation-names object) 
      thereis (eq object (get-relation n :no-error-p t))) )

(defmethod visible-object-p ((object CLOS-INSTANCE))
  (eq object (get-instance (identifier object))))

(defmethod visible-object-p ((object BASIC-INSTANCE))
  (eq object (get-instance (identifier object))))

(defmethod visible-object-p ((object T))
  t)

(defmethod visible-object-p ((object LOOM-OBJECT))
  ;; Warning here for PRODUCTIONS, ACTIONS, etc?
  (warn "Function VISIBLE-OBJECT-P not implmemented for objects of type ~S" (type-of object))
  t)


(defmethod context-visible-name ((object UNARY-ENTITY))
  (loop for n in (concept-names object) 
      when (eq object (get-concept n :no-error-p t))
      return n) )

(defmethod context-visible-name ((object TBOX-RELATION))
  (loop for n in (relation-names object) 
      when (eq object (get-relation n :no-error-p t))
      return n) )

(defmethod context-visible-name ((object T))
  (name object))



;; tbox/frames.lisp


(defun find-named-superconcepts-of-supers (listOfSupers)
  "Return a list of the most specific superconcepts at or above
      those in `listOfSupers' that have user-defined names"
  (let (allNamedSupers computeMostSpecificP)
    (loop for sup in listOfSupers
	 do
	 (if (or (system-defined-name-p sup) (null (name sup)))  
	     (progn
	       (loop for supOfSup in (all-super-concepts sup)
		   unless (or (and (system-defined-p supOfSup)
				   (system-defined-name-p supOfSup))
			       (null (name supOfSup))		  ; TAR 12/13/96
			       (not (visible-object-p supOfSup)))
		    do (pushnew supOfSup allNamedSupers))
	       (setq computeMostSpecificP t))
	     (push sup allNamedSupers)))
    (if computeMostSpecificP
	(most-specific-concepts allNamedSupers)
      allNamedSupers) ))


(defun find-named-subconcepts-of-subs (listOfSubs)
  "Return a list of the most general subconcepts at or below
      those in `listOfSubs' that are user-defined";
  ;; Assumption: concepts in "listOfSubs" do not subsume one another;
  ;; We optimize for the case when most of the subconcepts are user defined;
  (let ((namedConcepts (copy-list listOfSubs))
        (systemDefinedConcepts nil)
        (alternativeConcepts nil))
    (labels ((help-find-named-subconcepts (subConcept)
	       (if (or (and (system-defined-p subConcept)
			    (system-defined-name-p subConcept))	  ; TAR 11/7/96
		       (null (name subConcept))			  ; TAR 12/13/96
		       (not (visible-object-p subConcept)))
		   (loop for sub in (sub-concepts subConcept)
                       do (help-find-named-subconcepts sub))
                 (pushnew subConcept alternativeConcepts))))
      (loop for tail on namedConcepts
	  when (or (and (system-defined-name-p (car tail))
			(not (undefined-p (car tail))))		  ; TAR 11/7/96
		   (null (name (car tail)))			  ; TAR 12/13/96
		   (not (visible-object-p (car tail))))
	  do (push (car tail) systemDefinedConcepts)
	     (setf (car tail) nil))
      (when systemDefinedConcepts
        (setq namedConcepts
              (delete nil namedConcepts))
        ;; collect subconcepts of system-defined concepts:
        (loop for sub in systemDefinedConcepts
	    do (help-find-named-subconcepts  sub))
	;; eliminate alternative concepts that are not most general:
        (loop for alt in  alternativeConcepts
	    unless (or (loop for nc in namedConcepts
			   thereis (subconcept-p alt nc))
		       (loop for ac in alternativeConcepts
			   thereis (subconcept-p alt ac :cant-be-equal-p t)))
	    do  (push alt namedConcepts)))
      namedConcepts )))

;; tbox/generate.lisp


(defun generate-concept-definition (self &key augment-p definition-only-p)
  ;; Generate a definition for the concept "self" which is LEGAL
  ;;    in the sense that it can be parsed successfully;
  (if definition-only-p
    (get-defining-expression self)
    (construct-concept-definition
     self (or (context-visible-name self) (name self))
     (generate-definition-body self :augment-p augment-p)
     :include-documentation-p t)) )


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
      (etypecase self
	(UNARY-ENTITY
	 (when (get-concept identifier :no-error-p t)
	   `(:identifier ,identifier)))
	(TBOX-RELATION
	 (when (get-relation identifier :no-error-p t)
	   `(:identifier ,identifier))))) ))

;; abox/get.lisp


(defun get-all-satisfied-concepts (self userDefinedOnlyP)
  ;; Return all user-defined concepts satisfied by "self";
  ;; Note: Because concepts that are both primitive and computed
  ;;    don't appear in the "search-nodes" slot, we are forced to
  ;;    search the entire tree (top-down);
  (let ((alreadyVisitedConcepts nil)
        (result nil))
    (labels ((collect-satisfied-concepts-in-subtree (rootConcept)
               (unless (member rootConcept alreadyVisitedConcepts)
                 (push rootConcept alreadyVisitedConcepts)
		 ;; Tricky code:  If "userDefinedOnlyP", then if we encounter
		 ;;   a system-defined concept, we automatically recurse to the
		 ;;   sub-concepts without collecting "rootConcept";
		 ;;   Similarly if the concept is not visible in this context;
		 ;; Otherwise, we only collect "rootConcept" and recurse if
		 ;;   "self" is an instance of "rootConcept";
                 (when (or (and userDefinedOnlyP (system-defined-name-p rootConcept))
			   (not (visible-object-p rootConcept))
                           (and (has-instance-p rootConcept self)
                                (push rootConcept result)))
                   (loop for subConcept
                         in (sub-concepts rootConcept)
                         do (collect-satisfied-concepts-in-subtree
                             subConcept))))))
      (collect-satisfied-concepts-in-subtree *thing*)
      result )))


;; abox/queues.lisp

(defun display-classifier-match-changes (instance oldType newType)
  ;; Print the concepts that have entered and exited the type of "instance";
  (labels ((suppress-concept-printing-p (c)
	     (or (system-defined-name-p c)
		 (null (name c))
		 (eq c (loom-constant UNARY-TUPLE))
		 (not (visible-object-p c))))
	   (collect-ancestors (type)
	     (let (result)
	       (if (consp type)
		   (loop for c in type
		       do (unless (suppress-concept-printing-p c)
			    (pushnew c result))
			  (loop for super in (all-super-concepts c)
			      unless (suppress-concept-printing-p super)
			      do (pushnew super result)))
		 (progn
		   (unless (suppress-concept-printing-p type)
		     (pushnew type result))
		   (loop for super in (all-super-concepts type)
		       unless (suppress-concept-printing-p super)
		       do (pushnew super result))))
	       result)))
    (let* ((oldConcepts (collect-ancestors oldType))
	   (newConcepts (collect-ancestors newType))
	   (exitConcepts (set-difference oldConcepts newConcepts))
	   (entryConcepts (set-difference newConcepts oldConcepts)))
      (when (or exitConcepts entryConcepts)
	(reset-dot-counter)
	(inform "~%Recognition changes for state ~D in context ~A:~%"
		*agent-time* (name *context*))
	(loop for exitConcept in exitConcepts
	    as firstTimeP = t then nil
	    do (inform "   ~:[     ~;exit:~]  ~S~20,5T~S~%"
		       firstTimeP (identifier instance) exitConcept))
	(loop for entryConcept in entryConcepts
	    as firstTimeP = t then nil
	    do (inform "   ~:[      ~;entry:~]  ~S~20,5T~S~%"
		       firstTimeP (identifier instance) entryConcept))) )))


;; tbox/built-in.lisp


(eval-when #+(or :CLTL2 :ANSI-CL)(:load-toplevel :execute :compile-toplevel)
	   #-(or :CLTL2 :ANSI-CL)(load eval compile)
  (let ((savedCxt (current-context))
	(*error-output* (make-string-output-stream)))
    (export '(role-members restriction--qualification))
    (change-context (find-context "BUILT-IN-THEORY"))

    (defrelation proper-subrelations
	:characteristics (:multiple-valued :read-only)
	:domain Meta-Thing :range Meta-Thing
	:function ((?self) (append-transitively 
			    ?self sub-concepts 
			    (lambda (sub) 
			      (unless (or (eq sub ?self)
					  (system-defined-name-p sub)
					  (not (visible-object-p sub)))
				(list sub)))
			    :use-pass-counter t))
	:predicate ((super sub) (member super (all-super-concepts sub))))
  
    (defrelation reification-relation :characteristics :single-valued) ; TAR 10/11/2000
    (defproperty reification-holds :domain reification ; TAR 10/11/2000
		 :predicate reification-holds)

    (finalize-definitions)
    (close *error-output*)
    (change-context savedCxt) ))


(defun load-built-in-concepts ()
  ;; Define set concepts and operators that populate the Loom built-in
  ;;    context;
  (change-context 'BUILT-IN-THEORY)

  (load-arithmetic)

  (defrelation name :domain Thing
    :characteristics (:non-exported :single-valued :read-only))
  (defrelation okbc-pretty-name :range string
	       :characteristics (:single-valued))
  (defrelation concept-name :domain Meta-Thing
    :characteristics (:non-exported :single-valued :read-only))
  (defrelation relation-name :domain Meta-Thing
     :characteristics (:non-exported :single-valued :read-only))
  (defrelation background-package-name :domain context :range string
	       :characteristics (:single-valued))
  (defrelation background-file-name :domain context :range string
	       :characteristics (:single-valued))
  (defrelation parents :characteristics (:non-exported :multiple-valued))
  (defrelation arity :characteristics (:single-valued :read-only)
	       :function arity)
  (defrelation roles :characteristics (:multiple-valued :read-only))
  (defrelation characteristics :characteristics (:multiple-valued :read-only))
  (defrelation documentation "Documentation string for Loom objects."
	       :domain Thing
	       :range string)
  (defrelation built-in-documentation "Lisp built-in documentation"
	       :is-primitive documentation
	       :domain Meta-Thing
	       :function ((c) (typecase c
				(SYMBOL (documentation c 'variable))
				(TBOX-RELATION (documentation (name c) 'variable))
				(TBOX-CONCEPT (documentation (name c) 'type))
				(t nil))))
	       

  (defconcept CONS-OR-NULL
    :is-primitive Constant
    :predicate listp)

  ;; Knowledge Bases and Contexts:

  (defconcept Knowledge-Base
    :roles ((name :function name)
            (parents :function parent-kbs))
    :implies (:and (:the name Symbol)
                       (:all parents Knowledge-Base))
    :existing-class-name Knowledge-Base)

  (defconcept Context
    :roles ((name :function name)
            (parents :function parent-contexts))
    :implies (:and (:the name Symbol)
                       (:all parents Context))
    :existing-class-name Context
    :function list-contexts)

  (defrelation parent-context :domain context :range context
               :function parent-contexts
	       :characteristics :multiple-valued)
  (defrelation child-context :domain context :range context
               :function ((context) (loop for c in (child-contexts context)
                                          when (ctxt c)         ; Don't return BOTTOM-THEORY!
					collect c))
	       :characteristics :multiple-valued)
  (defrelation ancestor-context :domain context :range context
               :function ((context) (cdr (context-precedence-list context)))
	       :characteristics :multiple-valued)
  (defrelation descendant-context :domain context :range context
               :function generate-context-subtree
	       :characteristics :multiple-valued)
  (defrelation home-context :range Context :function context)

  ;; Collections, and Sets:

  (defrelation members
    :domain Collection
    :characteristics (:multiple-valued :read-write :closed-on-constants))

  (defconcept Collection
    :roles (members 
            count))

  (defconcept Set
    :is-primitive Collection
    :roles (members
            member-type
            (cardinality :function ((?self) (length (members ?self))))
;; CAN'T GENERATE ROLE ACCESSOR HERE:
;            (count :function ((?self) (length (members ?self))))
            )
    :mixin-classes CLOS-INSTANCE )

  (defconcept List
    :is (:and Cons-Or-Null Collection)
    :roles (members
;; CAN'T GENERATE ROLE ACCESSOR HERE:
;            (count :function length)
;            (length :function length) ; Can't make this a method!!
            ;; this is for Loom's use only:
	    (cardinality :function length))
    :existing-class-name LIST
    :predicate listp)

  (defrelation list-members 
      :domain list
      :is (:and members (:domain list))
      :function ((x) (when (listp x) (identity x)))
      :characteristics (:non-exported :multiple-valued))

  (defrelation member-of
    :is (:inverse members)
    :range Collection
    :predicate ((?item ?collection)
                (member ?item (compute-members-of-instance ?collection)
                        :test #'filler-equal)))

  (defrelation cardinality
    :domain (:or Collection Role) :range Integer
    :characteristics (:read-only :single-valued :closed-on-constants)) ; TAR 10/26/93

  (defrelation subset
    :domain Set :range Set
    :predicate ((set1 set2) (subset-of-set-p set1 set2)))
  (defrelation same-as
    :is-primitive subset
    :characteristics (:symmetric :perfect :read-only)
    :function ((arg1) arg1)
    :predicate ((arg1 arg2) (same-as-p arg1 arg2)))

  ;; Asserted within "detect-incoherence-p":
  ;; TO DO: MAKE THIS A PROPERTY:
  (defconcept Incoherent
    :function (() (list-current-local-instances (loom-constant Incoherent)))    ; TAR 8/13/93
    :predicate ((?self) (let ((types (find-type&residue-features ?self)))
                          (and (consp types)
			       (member (loom-constant INCOHERENT) types)) )) )
  ;; Asserted within "update-time-line":
  (defconcept Temporal-Incoherent	; TAR 8/18/93
      :characteristics (:temporal :read-only)) ;Does :read-only do anything here?
  (defrelation incoherence-reason "This relation is used to hold strings describing why a concept or classified instance became incoherent.")
  
  (defproperty Badly-Defined            ;  TAR 7/19/94
    :function (() (remove :bad-definition 
                          (generate-instances (loom-constant Meta-Thing))
                          :key #'system-attributes :test-not #'member))
    :predicate bad-definition-p
    :domain Meta-Thing)

  ;; Old Style Reified Relations

  (defconcept A-Reified-Relation
     :implies (:and (:at-least 1 domain)
                    (:at-least 1 range)))
  (defrelation domain)
  (defrelation range)

  ;; New Style Reified Relations
  
  (defconcept reification)
  
  (defrelation target-role :characteristics :single-valued)
  (defrelation source-role :characteristics :single-valued)
  (defrelation reification-relation :characteristics :single-valued)  ;; TAR 10/11/2000
  (defrelation target-case :characteristics (:single-valued :perfect))
  (defrelation source-case :characteristics (:single-valued :perfect))
  
  (defrelation reifies)
  (defrelation reified-by :is (:inverse reifies)
	       :characteristics :single-valued)
  (defrelation link-object :characteristics :non-exported)
  
  (defrelation link :arity 4 :function get-link)
  (defproperty reification-holds :domain reification   ; TAR 10/11/2000
	       :predicate reification-holds)

  )

(defun load-meta-things ()
  ;; Define meta-things that populate the Loom built-in context; 
  (change-context 'BUILT-IN-THEORY)

  ;; THIS SHOULD BE A PROPERTY, BUT PROPERTIES CAN'T HAVE ROLES!!!
  ;; BUG: COMPUTED ROLES DON'T WORK IF THERE IS NO SHADOW CLASS:
  (defconcept Loom-Thing
    :roles ((xidentifier :function identifier)
            (xtype :function find-type&residue-features)
;; REDEFINE "types", "asserted-concepts", and "cached-concepts" AS RELATIONS,
;;    NOT AS ROLES!!!:
;            (types
;             :function ((?self) (find-named-superconcepts-of-supers
;                                 (execute-query
;                                  (compute-more-specific-type ?self :backward-chaining-p t)))))
;            (asserted-concepts 
;             :function ((?self) (find-named-superconcepts-of-supers
;			         (loop for entry in (conjuncts-table ?self)
;			              when (assertion-p (cdr entry))
;			              collect (car entry)))))
;            (cached-concepts :function ((?self) (find-named-superconcepts-of-supers 
;			                         (db-type ?self))))
            )
    :implies (:and (:the xidentifier Symbol)
                       (:the xtype Concept)
;                       (:all types Concept)
;                       (:all asserted-concepts Concept)
;                       (:all cached-concepts Concept)
                       )
    :characteristics :system-defined
    :predicate ((?self) (typep ?self '(or BASIC-INSTANCE CLOS-INSTANCE))) )

  ;; THIS REDEFINES A CONCEPT DEFINED IN "sets.lisp" AND CAUSES EVERYTHING TO BREAK:
;  (defproperty Non-Loom-Thing :is (not Loom-Thing))
  
  ;; the-relation

  (defrelation the-relation
    :arity 3
    :domains (THING INTEGER) :range Meta-Thing
    :function the-relation )
  
  (defrelation the-context
    :domain THING :range Context
    :function the-context )

  (defrelation the-instance
    :domain THING
    :function the-instance )

  ;; TO DO: REDEFINE THIS TO INCLUDE ROLES (BUT THEN THERE WOULD BE NO ASSOCIATED CLOS
  ;;    CLASS, AND THE ROLES DEFINED BELOW WOULD NOT BE APPROPRIATE):
  ;; VERY BAD: DEFINING "name" WITH :function OPTION EFFECTIVELY BARS
  ;;    OTHER CONCEPTS FROM USING THAT ROLE NAME:
  (defconcept Meta-Thing
    :roles (;(name :function name)  ;; RMM 5/2/95
            (concept-name :function name)
            (relation-name :function name)
            (arity :function arity)
            (characteristics :function ((?self) (attributes ?self))))
    :implies (:and (:all roles Role)
                   (:the name Symbol)
                   (:all properties Symbol))
    :predicate ((x) (typep x 'TBOX-CONCEPT))
    :function (() (let ((result nil))
		    (loop for ctxt in (context-precedence-list *context*)
			do (do-context (c ctxt :partitions (:concepts :relations))
			     (push c result)))
		    result))
    :existing-class-name TBOX-CONCEPT
    :partitions $META-PARTITION$ )
  
  (defconcept Concept-or-Property
    :is (:or Concept Property)
    :roles (properties
;            (restrictions :function restrictions)
;            (components :function ((?self) 
;                                   (append (restrictions ?self)
;                                           (comparisons ?self)
;                                           (computed-features ?self))))
            )
;    :implies (:all restrictions Restriction)
    )

  (defconcept Concept
    :is-primitive Meta-Thing
    :roles ((roles :function get-roles)
	    (restrictions :function restrictions)
            (instances :function
	               ((?self)
	                (let ((set (defined-set-feature ?self)))
	                  (if set
		            (typecase set
		              (SYMBOLIC-INTERVAL (symbols set))
		              (SET-FEATURE (members set)))
		            (generate-instances ?self))))))
    :annotations ((archetype THING))
    :existing-class-name UNARY-CONCEPT
    :predicate concept-p
    :function (() (let ((result nil))
		    (loop for ctxt in (context-precedence-list *context*)
			do (do-context (c ctxt :partitions :concepts)
			     (unless (property-p c)
			       (push c result))))
		    result))
    :in-partition $META-PARTITION$)
  
    (defrelation instances :characteristics :multiple-valued) ;; override :single-valued inference

    (defrelation restrictions :domain thing
		 :function restrictions
		 :characteristics :multiple-valued)

    (defconcept Restriction
      :roles ((relation :function relation)
	      (qualification :function qualification)
              (value-type :function ((?self) (when (typep ?self 'VALUE-RESTRICTION)
					       (value-restriction ?self))))
              (min-cardinality :function ((?self) (when (typep ?self 'MIN-RESTRICTION)
						    (lower-bound ?self))))
              (max-cardinality :function ((?self) (when (typep ?self 'MAX-RESTRICTION)
						    (upper-bound ?self))))
              (direct-dependents
	       :function ((?self) 
			  (let ((result nil))
			    (loop for dep in (dependents ?self)
				when (concept-p dep) do (push dep result))
			    (loop for dep in (non-tbox-dependents ?self)
				when (concept-p dep) do (push dep result))
			    result))) )
      :implies (:and (:the relation Relation)
                         (:the value-type Concept)
                         (:the min-cardinality Integer)
                         (:the max-cardinality Integer)
                         (:all direct-dependents Concept))
      :existing-class-name RESTRICTION-FEATURE
      :predicate ((?self) (typep ?self 'RESTRICTION-FEATURE)) )
    
      (defrelation min-cardinality 
	  :characteristics (:single-valued))
      (defrelation max-cardinality
	  :characteristics (:single-valued))
      (defrelation qualification
	  :characteristics (:non-exported :single-valued))

    (defrelation direct-dependents :characteristics :multiple-valued) ;; override :single-valued inference


  (defconcept value-restriction
    :is-primitive restriction
    :characteristics :perfect
    :existing-class-name Value-Restriction
    :predicate ((?r) (typep ?r 'VALUE-RESTRICTION)) )
  (defconcept min-restriction
    :is-primitive restriction
    :characteristics :perfect
    :existing-class-name Min-Restriction
    :predicate ((?r) (typep ?r 'MIN-RESTRICTION)) )
  (defconcept max-restriction
    :is-primitive restriction
    :characteristics :perfect
    :existing-class-name Max-Restriction
    :predicate ((?r) (typep ?r 'MAX-RESTRICTION)) )



  #+:measures
  (defconcept measurement-concept :is-primitive concept
    :constraints (:exactly 1 measure-object))

  (defconcept Meta-Concept
    :roles ((archetype :type CONCEPT)))

  (defrelation archetype :domain Meta-Concept :range Concept)

  ;; BUG: (ask (Property Non-Loom-Thing)) RETURNS NIL:
  (defconcept Property
    :is-primitive Meta-Thing
    :roles ((domain :function implied-domain))
    :implies (:the domain Concept)
    :existing-class-name UNARY-RELATION
    :predicate property-p
    :function (() (let ((result nil))
		    (loop for ctxt in (context-precedence-list *context*)
			do (do-context (c ctxt :partitions :concepts)
			     (when (property-p c)
			       (push c result))))
		    result))
    :in-partition $META-PARTITION$)

  (defconcept Relation
    :is-primitive Meta-Thing
    :roles ((domain :function implied-domain)
            (range :function implied-range)
            (inverse :function ((?self) (when (typep ?self 'BINARY-RELATION)
                                          (inverse ?self)))))
    :implies (:and (:the domain Concept)
		   (:the range Concept))
    :existing-class-name TBOX-RELATION
    :predicate relation-p
    :function (() (let ((result nil))
		    (loop for ctxt in (context-precedence-list *context*)
			do (do-context (c ctxt :partitions :relations)
			     (push c result)))
		    result))
    :in-partition $META-PARTITION$)

   ;; Note:  The direct-{sub/super}relations do not have a predicate form because
   ;;    we would need to check for the named attribute anyway.  Otherwise the predicate
   ;;    would exclude items returned by the function.  For the non-direct cases, the
   ;;    predicate allows more in than would be returned by the function, but that is
   ;;    considered acceptable behavior.
 (defrelation direct-subrelations
    :characteristics (:multiple-valued :read-only)
    :domain Meta-Thing :range Meta-Thing
    :function ((?self)
	       (find-named-subconcepts-of-subs (sub-concepts ?self))))
  (defrelation direct-superrelations
    :is (:inverse direct-subrelations)
    :characteristics (:multiple-valued :read-only)
    :function ((?self)
	       (find-named-superconcepts-of-supers (super-concepts ?self))))
  (defrelation subrelations
      :characteristics (:multiple-valued :read-only)
      :domain Meta-Thing :range Meta-Thing
      :function get-subrelations)
  
  (defrelation superrelations
      :is (:inverse subrelations)
      :characteristics (:multiple-valued :read-only)
      :domain Meta-Thing :range Meta-Thing
      :function get-superrelations)

  (defrelation proper-subrelations
    :characteristics (:multiple-valued :read-only)
    :domain Meta-Thing :range Meta-Thing
    :function  ((?self) (append-transitively 
			  ?self sub-concepts 
			  (lambda (sub) 
			    (unless (or (eq sub ?self)
					(system-defined-name-p sub)
                                        (not (visible-object-p sub)))
			      (list sub)))
			  :use-pass-counter t))
    :predicate ((super sub) (member super (all-super-concepts sub))))    
  (defrelation proper-superrelations
    :is (:inverse proper-subrelations)
    :characteristics (:multiple-valued :read-only)
    :function ((?self) (remove-system-named-concepts (all-super-concepts ?self)))
    :predicate ((sub super) (member super (all-super-concepts sub))))

  (defrelation most-specific-concepts
    :domain Set
    :characteristics :multiple-valued
    :function ((?self) (most-specific-concepts ?self)) )

;  (defrelation supers--named-super-concepts
;    :domain Set :range Concept
;    :characteristics :multiple-valued
;    :function ((?supers) (find-named-superconcepts-of-supers ?supers)) )
; 
; (defrelation subs--named-sub-concepts
;    :domain Set :range Concept
;    :characteristics :multiple-valued
;    :function ((?subs) (find-named-subconcepts-of-subs ?subs)) )

  (defrelation instance-of
    :is (:inverse instances)
    :range Concept
    :predicate ((?instance ?concept) (has-instance-p ?concept ?instance))
 ;; ADD THIS?
 ;  :function  get-types
 ;;   but why does instance--concepts do it this way:
 ;      :function ((?i) (if (symbolp ?i)
 ;			    (get-types `',?i)                    ; TAR 12/22/93
 ;			    (get-types ?i)))
    :characteristics :multiple-valued
    )

  (defrelation isa
    :range Concept
    :predicate ((?object ?concept) 
                (typecase ?object
                  (TBOX-CONCEPT 
                   (subconcept-p ?object ?concept))
                  ((OR DB-INSTANCE CLOS-INSTANCE)       ; TAR 8/12/93
                   (has-instance-p ?concept ?object)))) )

  (defproperty user-defined
    :domain Thing
    :predicate ((?c) (not (system-defined-p ?c))) )
  (defproperty primitive
    :domain Meta-Thing
    :predicate ((?self) (primitive-p ?self)) )
  (defproperty incoherent-concept
    :domain Meta-Thing
    :predicate ((?self) (member :incoherent (attributes ?self))) )
  (defproperty single-valued
    :domain Relation
    :predicate relation-is-single-valued-p
    ;; Was: ((?self) (member :single-valued (attributes ?self)))
    )
  (defrelation okbc-slot-collection-type
    :domain Relation
    :function ((x) (if (relation-is-single-valued-p x) nil :set)))
  (defproperty closed
    :domain Meta-Thing
    :predicate ((?r) (concept-is-closed-p ?r)) )
  ;; Temporal properties of numbers:
  (defproperty temporal
      :domain Meta-Thing
      :predicate ((x) (member :temporal (attributes x))))
  (defproperty past
    :domain Number
    :predicate ((?self) (if (eql *query-world-time-suffix* '+)
                          (<= ?self *query-world-time*)
                          (< ?self *query-world-time*))))
  (defproperty future
    :domain Number
    :predicate ((?self) (if (eql *query-world-time-suffix* '-)
                          (>= ?self *query-world-time*)
                          (> ?self *query-world-time*))))
    
  (defconcept Binary-Relation
      :roles ((min-cardinality :function ((?self) (get-role-min-cardinality
						   (domain ?self) ?self)))
	      (max-cardinality :function ((?self) (get-role-max-cardinality
						   (domain ?self) ?self)))
	      (min-value :function ((?self) (get-role-min-value
					     (domain ?self) ?self)))
	      (max-value :function ((?self) (get-role-max-value
					     (domain ?self) ?self)))
	      (cardinality :function ((?self) (get-role-cardinality
					       (domain ?self) ?self)))
	      (all-values :function ((?self) (get-role-values
					      (domain ?self) ?self)))
	      (strict-values :function ((?self) (get-role-strict-values
						 (domain ?self) ?self)))
	      (default-values :function ((?self) (get-role-default-values
						  (domain ?self) ?self))))
    :is (:and Relation (:the arity 2)))
  (defconcept Unary-Function
    :is-primitive Binary-Relation
    :predicate ((?r) (and (typep ?r 'BINARY-RELATION)   ; TAR 9/28/93
                          (role-is-single-valued-p ?r))) )

  (defrelation holds-true-2
    :domain Meta-Thing :range Thing
    :predicate concept-holds-true-p)

  (defrelation holds-true-3
    :arity 3
    :domains (Relation Thing) :range Thing
    :predicate binary-relation-holds-true-p)

  (defrelation holds-true-4
    :arity 4
    :domains (Relation Thing Thing) :range Thing
    :predicate ternary-relation-holds-true-p)

  (defrelation implies
    :function ((?c) (remove-system-named-concepts 
			  (let ((consequentConcept (consequent-concept ?c)))
			    (cons consequentConcept
				  (all-super-concepts consequentConcept)))))
    :domain Concept :range Concept
    :characteristics :multiple-valued)
  
  (defrelation disjoint
      "This relation holds if concepts are disjoint."
    :predicate disjoint-concepts-p
    :domain Concept :range Concept
    :characteristics :multiple-valued)

  (defrelation term-implies
    :characteristics :multiple-valued
    :function ((?self)
               (remove-system-named-concepts
                (remove-duplicates
                 (typecase ?self
                   (UNARY-CONCEPT
                    (let ((consequentConcept (consequent-concept ?self)))
                      (cons consequentConcept
                            (all-super-concepts consequentConcept))))
                   (CLASSIFIABLE-OBJECT ; was otherwise ; TAR 10/18/93
                    (let ((consequentRelations
                           (loop for dep in (non-tbox-dependents ?self)
                                when (and (meta-thing-p dep)
                                          (member ?self (antecedents dep)))
                                collect dep)))
                      (cons ?self
                            (append (all-super-concepts ?self)
                                    consequentRelations
                                    (loop for rel in consequentRelations
                                         append (all-super-concepts rel)))))))))) )


  ;;
;;;;;; Propositions
  ;;

  (defconcept Proposition
      :existing-class-name Proposition)
  (defrelation proposition-operator :domain proposition
    :function proposition-operator)
  (defrelation proposition-truth-value :domain proposition 
	       :function proposition-truth-value)
  (defrelation proposition-arguments 
      :domain proposition :function proposition-arguments)


  ;;
;;;;;; Roles
  ;;

  (defconcept Role
    :roles ((concept :function concept)
            (relation :function relation)
            (name :function ((?self) (name (relation ?self))))
            (types 
	     :function ((?self) (get-role-types
				 (concept ?self) (relation ?self) :raw-p t)))
            (min-cardinality 
	     :function ((?self) (get-role-min-cardinality
				 (concept ?self) (relation ?self))))
            (max-cardinality 
	     :function ((?self) (get-role-max-cardinality
				 (concept ?self) (relation ?self))))
	    (min-value 
	     :function ((?self) (get-role-min-value
				 (concept ?self) (relation ?self))))
	    (max-value 
	     :function ((?self) (get-role-max-value
				 (concept ?self) (relation ?self))))
            (cardinality 
	     :function ((?self) (get-role-cardinality
				 (concept ?self) (relation ?self))))
	    (all-values 
	     :function ((?self) (get-role-values
				 (concept ?self) (relation ?self))))
	    (strict-values 
	     :function ((?self) (get-role-strict-values
				 (concept ?self) (relation ?self))))
	    (default-values
		:function ((?self) (get-role-default-values
				    (concept ?self) (relation ?self))))
	    (characteristics :function ((?self) (attributes ?self))))
    :implies (:and (:the concept Concept)
		   (:the relation Relation)
		   (:the min-cardinality Integer)
		   (:the cardinality Integer))
    :existing-class-name Role)

  (defrelation the-role
      :arity 3
      :range Role
      :function ((?concept ?relation) (get-role ?concept ?relation)) )
  
  (defrelation the-instance-role
      :arity 3
      :range Role
      :function ((?concept ?relation) (get-instance-role ?concept ?relation)) )

  (defrelation types :characteristics :multiple-valued) ;; override :single-valued inference
  (defrelation all-values :characteristics :multiple-valued)
  (defrelation strict-values :is-primitive all-values
	       :characteristics :multiple-valued)
  (defrelation default-values :is-primitive all-values
	       :characteristics :multiple-valued)



  ;;
;;;;;; relations that have ONTOLINGUA counterparts with similar names:
  ;;

  (defrelation role-values
    "Given an instance or concept and a relation, return the fillers of the
     corresponding role."
    :domains (Thing Relation)
    :characteristics :multiple-valued
    :function ((?concept ?relation) (get-role-values ?concept ?relation)) )
  (defrelation strict-role-values
    "Given a concept and a relation, return the strict fillers of the
     corresponding role."
    :domains (Concept Relation)
    :characteristics :multiple-valued
    :function ((?concept ?relation) (get-role-strict-values ?concept ?relation)))
  (defrelation default-role-values
    "Given a concept and a relation, return the default fillers of the
     corresponding role."
    :domains (Concept Relation)
    :characteristics :multiple-valued
    :function ((?concept ?relation) (get-role-default-values ?concept ?relation)))
  (defrelation role-types
      "Given a concept and a relation, return the type restriction(s) for that relation.
If multiple values are returned, then the true type restriction is the conjunctions of
the returned types."
    :domains (Concept Relation) :range Concept
    :characteristics :multiple-valued
    :function ((?concept ?relation) (get-role-types ?concept ?relation :raw-p t)))
  (defrelation role-cardinality
    "Given a concept and a relation, return the cardinality of the corresponding role.
     Note that cardinality only exists if the min and max are the same."
    :domains (Concept Relation) :range Integer
    :is (:and role-min-cardinality role-max-cardinality)
    :function ((?concept ?relation)
               (let ((min (get-role-min-cardinality ?concept ?relation)))
                 (when (eql min (get-role-max-cardinality ?concept ?relation))
                   min))))
  (defrelation role-min-cardinality
    "Given a concept and a relation, return the minimum cardinality of the corresponding role."
    :domains (Concept Relation) :range Integer
    :function ((?concept ?relation) (get-role-min-cardinality ?concept ?relation)) )
  (defrelation role-max-cardinality
    "Given a concept and a relation, return the maximum cardinality of the corresponding role."
    :domains (Concept Relation) :range Integer
    :function ((?concept ?relation) (get-role-max-cardinality ?concept ?relation)) )
  (defrelation role-min-value
    "Given a concept and a relation, return the minimum numeric value of the corresponding role."
    :domains (Concept Relation) :range QUANTITY
    :function ((?concept ?relation) (get-role-min-value ?concept ?relation)) )
  (defrelation role-max-value
    "Given a concept and a relation, return the maximum numeric value of the corresponding role."
    :domains (Concept Relation) :range QUANTITY
    :function ((?concept ?relation) (get-role-max-value ?concept ?relation)) )

  
  ;;
;;;;;; versions of above with qualified relations
  ;;

  (defrelation qualified-role-values
      "Given an instance or concept, a relation and a qualifier,
 return the fillers of the corresponding role."
    :domains (Thing Relation Concept)
    :characteristics :multiple-valued
    :function ((?concept ?relation ?qualification)
	       (get-role-values ?concept ?relation :qualification ?qualification)) )
  (defrelation strict-qualified-role-values
      "Given a concept, a relation and a qualifier,
 return the strict fillers of the corresponding role."
    :domains (Concept Relation Concept)
    :characteristics :multiple-valued
    :function ((?concept ?relation ?qualification)
	       (get-role-strict-values ?concept ?relation :qualification ?qualification)))
  (defrelation default-qualified-role-values
      "Given a concept, a relation and a qualifier,
 return the default fillers of the corresponding role."
    :domains (Concept Relation Concept)
    :characteristics :multiple-valued
    :function ((?concept ?relation ?qualification)
	       (get-role-default-values ?concept ?relation :qualification ?qualification)))
  (defrelation qualified-role-types
      "Given a concept, a relation and a qualifier,
 return the type restriction for that relation."
    :domains (Concept Relation Concept) :range Concept
    :characteristics :multiple-valued
    :function ((?concept ?relation ?qualification)
	       (get-role-types ?concept ?relation :qualification ?qualification :raw-p t)))
  (defrelation qualified-role-cardinality
      "Given a concept, a relation and a qualifier,
 return the cardinality of the corresponding role.
 Note that cardinality only exists if the min and max are the same."
    :domains (Concept Relation Concept) :range Integer
    :is (:and qualified-role-min-cardinality qualified-role-max-cardinality)
    :function ((?concept ?relation ?qualification)
	       (get-role-cardinality ?concept ?relation :qualification ?qualification)))
  (defrelation qualified-role-min-cardinality
      "Given a concept, a relation and a qualifier,
 return the minimum cardinality of the corresponding role."
    :domains (Concept Relation Concept) :range Integer
    :function ((?concept ?relation ?qualification) 
	       (get-role-min-cardinality ?concept ?relation :qualification ?qualification)) )
  (defrelation qualified-role-max-cardinality
      "Given a concept, a relation and a qualifier,
 return the maximum cardinality of the corresponding role."
    :domains (Concept Relation Concept) :range Integer
    :function ((?concept ?relation ?qualification) 
	       (get-role-max-cardinality ?concept ?relation :qualification ?qualification)) )
  (defrelation qualified-role-min-value
      "Given a concept, a relation and a qualifier,
 return the minimum numeric value of the corresponding role."
    :domains (Concept Relation Concept) :range QUANTITY
    :function ((?concept ?relation ?qualification)
	       (get-role-min-value ?concept ?relation :qualification ?qualification)) )
  (defrelation qualified-role-max-value
      "Given a concept, a relation and a qualifier,
 return the maximum numeric value of the corresponding role."
    :domains (Concept Relation Concept) :range QUANTITY
    :function ((?concept ?relation ?qualification)
	       (get-role-max-value ?concept ?relation :qualification ?qualification)) )


  ;;
;;;;;; Other non-Ontolingua relations
  ;;
  
  (defrelation predecessor
    :domains (Concept Constant) :range Constant
    :function ((set member)
               (let ((feature (defined-set-feature (get-concept set))))
	         (when feature 
	           (compute-predecessor-in-interval feature member)))) )

  (defrelation successor
    :domains (Concept Constant) :range Constant
    :function ((set member)
               (let ((feature (defined-set-feature (get-concept set))))
	         (when feature 
	           (compute-successor-in-interval feature member)))) )

  (defrelation identity 
   :function ((self) self)
   :characteristics (:symmetric :single-valued))
  ) ;; end "load-meta-things"


;;  tbox/classdefs.lisp

(defmethod print-object ((self TBOX-RELATION) stream)
           #+:CLTL2(when *print-readably* (print-readably-error 'TBOX-RELATION self))
           (let ((name (if (system-defined-name-p self)
	                 (let ((*expandSystemDefinedConceptsP* t))
		           (declare (special *expandSystemDefinedConceptsP*))
		           (generate-concept-definition self :definition-only-p t))
	                 (or (context-visible-name self)
			     (name self)
		             (getf (cdar (source-definitions self)) :is)
		             (getf (cdar (source-definitions self)) :is-primitive)
		             (let ((relationRef (getf (parsed-expressions self) :definition)))  ; DGB 9/17/91
		               (when relationRef
		                 (if (relation-p relationRef) (name relationRef) relationRef)))
		             :UNNAMED))))
             (if *html-print-p*
               (if (name self)
                 (format stream "~A" (html-reference self))
                 (format stream "~S" name))
	       #+:CLTL2
	       (if (eq name :unnamed)
		   (print-unreadable-object (self stream :identity t)
		     (format stream "|R|~S" name))
		   (format stream "|R|~S" name))
	       #-:CLTL2
               (format stream "|R|~S" name)) ))



(defmethod print-object ((self UNARY-CONCEPT) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'UNARY-CONCEPT self))
  (let* ((definedSetP (and (eq (defined-as self) :set)
			   (defined-set-feature self)))
	 (contextAppropriateName (context-visible-name self))
	 (name
	   (cond
	     ((not (member :long-print-names *loom-dialogue-features*))
	      (or contextAppropriateName (name self) :UNNAMED)) 
	     ((and (system-defined-name-p self)
		   (not definedSetP))
	      (let ((*expandSystemDefinedConceptsP* t))
		(declare (special *expandSystemDefinedConceptsP*))
		(generate-concept-definition self :definition-only-p t)))
	     (t
	      (or contextAppropriateName
		  (name self)
		  (getf (cdar (source-definitions self)) :is)
		  (getf (cdar (source-definitions self)) :is-primitive)
		  (let ((conceptRef (getf (parsed-expressions self) :definition)))
		    (when conceptRef
		      (if (concept-p conceptRef) (name conceptRef) conceptRef)))
		  :UNNAMED))))
	 (shortDef
	   (when (and (symbolp name) definedSetP)
	     (generate-set-definition-string (defined-set-feature self) t))))
    (if *html-print-p*
      (if (name self)
	  (format stream "~A~@[~A~]"
		  (html-reference self)
		  (and (system-defined-name-p self) shortDef))
        (format stream "~S~@[~A~]" name shortDef))
      #+:CLTL2
      (if (eq name :unnamed)
	  (print-unreadable-object (self stream :identity t)
	    (format stream "|C|~S~@[~A~]" name shortDef))
	(format stream "|C|~S~@[~A~]" name shortDef))
      #-:CLTL2
      (format stream "|C|~S~@[~A~]" name shortDef)) ))

(defmethod print-object ((self UNARY-RELATION) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'UNARY-RELATION self))
  (if *html-print-p*
      (format stream "~A" (html-reference self))
    (format stream "|P|~S" 
	    (or (context-visible-name self)
		(name self)))) )


;;; Patch Loom4-0-6  8/13/99
;;; More property-related patches

(defmethod generate-system-defined-name ((self UNARY-ENTITY))
  ;; Create a name for the concept "self";
  (case (defined-as self)
    (:disjunction
     (concatenate-concept-names (disjuncts self) "-OR-"))    
    (otherwise					; nil defined-as slot
     (cond ((cdr (conjuncts self))
	    (concatenate-concept-names (conjuncts self) "&"))
	   ((system-defined-name-p self)
	    (generate-unique-concept-name 
	     (strip-suffix (name (car (conjuncts self)))) self))
	   (t
	    (generate-unique-concept-name (name (car (conjuncts self))) self))))) )


(defun evaluate-symbolic-reference (reference type &key specialize-this-concept)
  ;; Evaluate "reference" and check that the result matches the type
  ;;    specified by "type";
  ;; An ordinary symbol is interpreted as some type of Loom concept --
  ;;    a search is made for a concept matching that name;  if the
  ;;    search fails, a concept of the appropriate type is created;
  (declare (special *conceptBeingParsed*))
  (let (object)
    (cond
     ((null reference)
      (parsing-error "Illegal expression NIL"))
     ;; insure that reference is a symbol:
     ((not (symbolp reference))
      (parsing-error "Illegal expression ~S where symbol expected" reference))
     ;; Find existing object matching "reference"
     ((ecase type
	((:concept :property) (get-concept reference :no-error-p t))
	(:relation (get-relation reference :no-error-p t))))
     ((extended-identifier-p reference)
      (parsing-error "Can't find concept named ~S" reference))
     ((setq object (find-concept-or-relation-in-context-sublattice reference
								   type
								   *context*))
      (cerror "Continue using reference to ~:(~A~) ~S in context ~S."
	      "There is no ~:(~A~) ~S visible in context ~A,~%~
               but there is one in lower context ~S.~%~
               Error occurred in the definition:~%   ~S~%"
	      type reference *context* (context object) 
	      (generate-source-definition *conceptBeingParsed*)
	      type reference (context object))
      object)
      ;; or create a new one
      (t
       ;; create a new undefined concept or relation
       (touch-undefined-concept
	reference type :specialize-this-concept specialize-this-concept))) ))

(defun compute-class-slots (concept)
  ;;  Return a set of relations that correspond to locally defined roles for
  ;;     the concept "concept";
  ;; Rules 1,2,4 above define the semantics of this computation;
  (let ((localRelations (compute-locally-inferrable-slot-relations concept))
        (aboveRelations
         (loop for super in (clos-shadowed-super-concepts concept)
               append (compute-locally-inferrable-slot-relations super)))
        (belowRelations nil)
        (alreadyVisitedSubs nil))
    (labels ((visit-subconcepts (sub)
               (when (or (shadowed-by-clos-class-p sub)
                         (property-p sub)
			 (member sub alreadyVisitedSubs))
                 (return-from visit-subconcepts nil))
               (when (user-defined-concept-p sub)
                 (loop for r in (compute-locally-inferrable-slot-relations sub)
                       unless (or (member r localRelations)
                                  (member r aboveRelations))
                       do (pushnew r belowRelations)))
               (push sub alreadyVisitedSubs)
               (loop for subOfSub in (sub-concepts sub)
                     do (visit-subconcepts subOfSub)))
	     (dont-use-relation-p (relation)		; Disqualifiers TAR 2/8/93
		  ;; Reasons not to use this particular slot:
		 (or (read-only-p relation)
		     (temporal-p relation))))
      (when (virtual-p concept)         ; apply Rule 0:
        (return-from compute-class-slots nil))
      ;; first compute local and inherited relations, and apply Rule 1:
      (setq localRelations 
            (loop for r in localRelations
                  when (or (not (member r aboveRelations))
                           (loop for ftr in (default-features concept) ;RMM 4/26/94
                                 thereis (eq (relation ftr) r)))
                  collect r))
      ;; next compute descendant relations that are not also inherited and
      ;;    meet Rule 4:
      (loop for sub in (sub-concepts concept) do (visit-subconcepts sub))
      ;; apply the other part of Rule 1:
      (setq localRelations
            (remove-if #'dont-use-relation-p
                       (append belowRelations localRelations)))
      localRelations )))


;;; Patch Loom4-0-7  8/16/99
;;; Changed integrity-check to return NIL instead.

(defun help-find-subsumers (concept node)
  ;; Visit "node" and its children, looking for most-specific
  ;;    subsumers of "concept";  Push any such nodes into *newParents*
  ;; Return true iff concept was found to specialize "node" or one of
  ;;    its descendants
  ;; The Lipkis algorithm has clever ways of abbreviating this search
  (declare (special *newParents*))
 #L:trace-class (trace-values "~%HELP-FIND-SUBSUMERS:" node concept)
 #L:trace-class (trace-values "   "(already-visited-counter node) *classify-concept-pass-counter*)

 ;; Was: (integrity-check (integerp (already-visited-counter node)))  ; TAR 8/16/99
 (unless (integerp (already-visited-counter node))
   #+:isi (grumble "(already-visited-counter ~S) is not an integer in help-find-subsumers"
		   node)
   (return-from help-find-subsumers nil))
  (when (= (already-visited-counter node) *classify-concept-pass-counter*)
      ;; return if we've already been here
      (return-from help-find-subsumers
	(eql (concept-is-below-counter node) *concept-is-below-pass-counter*)))

 #L:trace-class (trace-values "  not already visited --" node)
 #L:trace-class (trace-values "   "(concept-is-below-counter node) *concept-is-below-pass-counter*) 
  (let (testResult)
    (setf (already-visited-counter node) *classify-concept-pass-counter*)
    (cond 
      ((eql (concept-is-below-counter node) *concept-is-below-pass-counter*) 
       ;; visit descendants, and then return "t"
       (find-descendant-subsumers concept node)
       t)
      
      ;; if "node" is itself primitive, then we don't look below,
      ;;    although another (lower) startingPoint might initiate 
      ;;    a search below "node"
      ((primitive-p node) nil)
      
      ;; see if "node" subsumes Concept; two optimizations are made:
      ;;  (1) if we've already found a new parent, omit checks
      ;;      for equality during the subsumption test
      ;;  (2) if "node" has only one parent, there is no need 
      ;;      to compare primitiveness. (We never recurse to primitive 
      ;;      concepts (since they are starting points) so the only way 
      ;;      "node" could have new primitiveness is if it inherits 
      ;;      it through another path)	  
      ((prog1
	 (setq testResult
	       (specializes-classified-concept-p
		 concept node
		 (null *newParents*) (null (cdr (super-concepts node)))))
 #L:trace-spec (trace-values "specializes-classified-concept-p yields:" testResult)
 #L:trace-class (trace-values "subsumption test --" node testResult *newParents*)
	 )

       ;; "concept" specializes "node"
       (when (eq testResult :equal)
	   ;; we found a merge -- jump entirely out of "find-subsumers"
	   (throw 'find-subsumers-catcher (values (list node) node)))
       
       ;; its not a merge -- visit the descendants of "node"; "wentBelow"
       ;;    tells us if "concept" also specialized one of them 
       (let (wentBelow)
	 (loop for subNode in (search-nodes node)
	      when (help-find-subsumers concept subNode)
	      do (setq wentBelow t))
	 (unless wentBelow
	   (push node *newParents*)
	   (set-concept-is-below-counters node)))
       t)		; "node" or one of its descendants subsumed "concept"
      
      (t
 #L:trace-spec (trace-values "specializes-classified-concept-p yields:  nil")
       nil))		; no new parents found
    ))	    ; end "help-find-subsumers"


;;; Patch Loom4-0-8  8/20/99
;;; Remove left-over Loom 2.0 code that can break under odd circumstances.
;;; Add features to wildcard searching to make it more intuitive.

(defun forget-all-inverse-roles (instance)
  ;; Helping function for "forget-all-about";
  ;; Retract inverse & phantom-inverse role fillers that point
  ;;   to "instance":
  (multiple-value-bind (realFillerPairs phantomFillerPairs)
      (collect-roles&fillers instance :asserted-only-p t)
    (loop for pair in realFillerPairs
	 do
	 (let* ((role (car pair))
		(inverseRole (inverse role))
		newFiller)
	   (declare (ignore newFiller))
	   (loop for filler in (list-of (cdr pair))
                 unless (discarded-p filler)
		 do
		 (cond
		   (inverseRole
		    (unless (constant-p filler)
		      (retract-role-filler filler inverseRole instance :all)))
		   ((classified-instance-p filler)
		    (retract-phantom-inverse-role-filler
		     role filler instance))))))
    ;; retract non-inverse role fillers that point to "instance":
    (loop for pair in phantomFillerPairs
	  do
	  (loop for filler in (cdr pair)
                unless (discarded-p filler)
		do (if (constant-p filler)
		       (grumble "Found constant ~S in phantom inverse list on ~S"
				filler instance)
		     (retract-role-filler 
		      filler (inverse-of-phantom(car pair)) instance :all))))) )

(in-package "REGEX")

(defun wildcard-compile (source &key (anchored t))
  "Usage: (wildcard-compile <expression> [ :anchored (t/nil) ])
       This function take a wildcard expression (supplied as source) and
       compiles this into a lambda list that a string argument can then
       be applied to.  It is also possible to compile this lambda list
       for better performance or to save it as a named function for later
       use.  If :ANCHORED, then the wildcard expression must span the entire
       string."
  #+:lucid (declare (optimize (speed 0) (safety 2) (compilation-speed 0)))  ;; Lucid compiler bug
  (info "Now entering wildcard-compile with \"~A\"~%" source)
  ;;
  ;; This routine works in two parts.
  ;; The first pass take the regular expression and produces a list of 
  ;; operators and lisp expressions for the entire regular expression.  
  ;; The second pass takes this list and produces the lambda expression.
  (let ((expression '())		; holder for expressions
	(endanchor (when anchored
		     '((if (not (= index length))
			   (return-from compare nil)))))
	(group 1)			; Current group index
	(result nil)			; holder for built expression.
	(fast-first nil)		; holder for quick unanchored scan
	(source-length (length source))); input length
    ;;
    ;; If the expression was an empty string then it alway
    ;; matches (so lets leave early)
    ;;
    (if (= source-length 0)
	(return-from wildcard-compile
		     '(lambda (&rest args)
			(declare (ignore args))
			t)))
    ;;
    ;; If the first sequence is * then also set the anchored flags.
    ;; (This is purely for optimization, it will work without this).
    ;;
    (if (char= (char source 0) #\*)
	(setf anchored t))
    ;;
    ;; Also, If this is not an anchored search and the first character is
    ;; a literal, then do a quick scan to see if it is even in the string.
    ;; If not then we can issue a quick nil, 
    ;; otherwise we can start the search at the matching character to skip
    ;; the checks of the non-matching characters anyway.
    ;;
    ;; If I really wanted to speed up this section of code it would be 
    ;; easy to recognize the case of a fairly long multi-character literal
    ;; and generate a Boyer-Moore search for the entire literal. 
    ;;
    ;; I generate the code to do a loop because on CMU Lisp this is about
    ;; twice as fast a calling position.
    ;;
    (if (and (not anchored)
	     (not (position (char source 0) *wildcard-special-chars*))
	     (not (and (> source-length 1)
		       (position (char source 1) *wildcard-special-chars*))))
	(setf fast-first `((if (not (dotimes (i length nil)
				       ;; TAR:  ",(if ...)" was "eql"  5/30/97
				     (if (,(if *regex-case-sensitive-p*
						'char=
					        'char-equal)
					      (char string i)
					      ,(char source 0))
					 (return (setf start i)))))
			      (return-from final-return nil)))))
    ;;
    ;; Generate the very first expression to save the starting index
    ;; so that group 0 will be the entire string matched always
    ;;
    (add-exp '((setf (aref *regex-groups* 0)
		     (list index nil))))
    ;;
    ;; Loop over each character in the regular expression building the
    ;; expression list as we go.
    ;;
    (do ((eindex 0 (1+ eindex)))
	((= eindex source-length))
      (let ((current (char source eindex)))
	(info "Now processing character ~A index = ~A~%" current eindex)
	(case current
	  ((#\?)
	   ;;
	   ;; Generate code for a single wild character
	   ;;
	   (add-exp '((if (>= index length)
			  (return-from compare nil)
			(incf index)))))

	  ((#\*)
	   (add-exp '((if (>= index length)
			  (return-from compare nil)
			(incf index))))
	   (add-exp '(ASTRISK)))
	  ((#\\ )
	   ;;
	   ;; Intreprete the next character as just the character itself.
	   ;;
	   (if (= eindex (- source-length 1))
	       (format *error-output* "Quote character `\\' at the end of the string isn't followed by any~%  other character!  Ignoring it.")
	     (progn 
	       (add-exp `((if (not (and (< index length)
					(eql (char string index) 
					     ,(char source (+ eindex 1)))))
			      (return-from compare nil)
			    (incf index))))
	       (incf eindex))))
	  (t
	   ;;
	   ;; We have a literal character.  
	   ;; Scan to see how many we have and if it is more than one
	   ;; generate a string= verses as single eql.
	   ;;
	   (let* ((lit "")
		  (term (dotimes (litindex (- source-length eindex) nil)
			  (let ((litchar (char source (+ eindex litindex))))
			    (if (position litchar *wildcard-special-chars*)
				(return litchar)
			      (progn
				(info "Now adding ~A index ~A to lit~%" litchar 
				      litindex)
				(setf lit (concatenate 'string lit 
						       (string litchar)))))))))
	     (if (= (length lit) 1)
		 (add-exp `((if (not (and (< index length)
					  ;; TAR:  ",(if ...)" was "eql"  11/1/96
					  (,(if *regex-case-sensitive-p*
						'char=
					        'char-equal)
					   (char string index) ,current)))
				(return-from compare nil)
			      (incf index))))
	       ;;
	       ;; If we have a multi-character literal then we must
	       ;; check to see if the next character (if there is one)
	       ;; is an astrisk or a plus.  If so then we must not use this
	       ;; character in the big literal.
	       (progn 
		 (if (or (eql term #\*) (eql term #\+))
		     (setf lit (subseq lit 0 (1- (length lit)))))
		 (add-exp `((if (< length (+ index ,(length lit)))
				(return-from compare nil))
			    ;; TAR:  ",(if ...)" was "string="   11/1/96
			    (if (not (,(if *regex-case-sensitive-p*
					   'string= 
					   'string-equal)
				      string ,lit :start1 index
					      :end1 (+ index ,(length lit))))
				(return-from compare nil)
			      (incf index ,(length lit)))))))
	     (incf eindex (1- (length lit))))))))
    ;; If anchored, then anchor both ends!
    (when endanchor
      (add-exp endanchor))
    ;;
    ;; Plug end of list to return t.  If we made it this far then
    ;; We have matched!
    (add-exp '((setf (cadr (aref *regex-groups* 0))
		     index)))
    (add-exp '((return-from final-return t)))
    ;;
;;;    (print expression)
    ;;
    ;; Now take the expression list and turn it into a lambda expression
    ;; replacing the special flags with lisp code.
    ;; For example:  A BEGIN needs to be replace by an expression that
    ;; saves the current index, then evaluates everything till it gets to
    ;; the END then save the new index if it didn't fail.
    ;; On an ASTRISK I need to take the previous expression and wrap
    ;; it in a do that will evaluate the expression till an error
    ;; occurs and then another do that encompases the remainder of the
    ;; regular expression and iterates decrementing the index by one
    ;; of the matched expression sizes and then returns nil.  After
    ;; the last expression insert a form that does a return t so that
    ;; if the entire nested sub-expression succeeds then the loop
    ;; is broken manually.
    ;; 
    (setf result (copy-tree nil))
    ;;
    ;; Reversing the current expression makes building up the 
    ;; lambda list easier due to the nexting of expressions when 
    ;; and astrisk has been encountered.
    (setf expression (reverse expression))
    (do ((elt 0 (1+ elt)))
	((>= elt (length expression)))
      (let ((piece (nth elt expression)))
	(cond ((listp piece)		;Just append the list
	       (setf result (append (list piece) result)))
	      ((eql piece 'ASTRISK) ; Do the wild thing!
	       (cond ((listp (nth (1+ elt) expression))
		      ;;
		      ;; This is a single character wild card so
		      ;; do the simple form.
		      ;;
		      (setf result 
			    `((let ((oindex index))
				(block compare
				       (do ()
					   (nil)
					 ,(nth (1+ elt) expression)))
				(do ((start index (1- start)))
				    ((< start oindex) nil)
				  (let ((index start))
				    (block compare
					   ,@result))))))
		      (incf elt))
		     (t
		      ;;
		      ;; This is a subgroup repeated so I must build
		      ;; the loop using several values.
		      ;;
		      ))
	       )
	      (t t))))			; Just ignore everything else.
    ;;
    ;; Now wrap the result in a lambda list that can then be 
    ;; invoked or compiled, however the user wishes.
    ;;
    (if anchored
	(setf result
	      `(lambda (string &key (start 0) (end (length string)))
		 (setf *regex-groupings* ,group)
		 (block final-return
			(block compare
			       (let ((index start)
				     (length end))
				 ,@result)))))
      (setf result
	    `(lambda (string &key (start 0) (end (length string)))
	       (setf *regex-groupings* ,group)
	       (block final-return
		      (let ((length end))
			,@fast-first
			(do ((marker start (1+ marker)))
			    ((> marker end) nil)
			  (let ((index marker))
			    (if (block compare
				       ,@result)
				(return t))))))))) ))

(in-package "LOOM")

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
       do (initiate-revise-subgraph dep)) )


;;; Patch Loom4-0-9  10/1/99
;;; Patches to make Loom handle redefinition of concepts and instances better.

;; We can't truly reinitialize this object because that process can happen
;;  as a result of concept redefinition, but subsequent instance revision
;;  needs the values (stored in cumulative-value-restrictions et al.)
;; TAR 10/1/1999
(defmethod reinitialize-classifiable-object ((self RESTRICTION-FEATURE))
  ;; Remove links between "self" and other network objects;
  ;; Detach from (tbox) dependents (who will soon be revising themselves);
  ;; Note: We assume that 
  (let (value)
   ;(empty-concept self :relation :qualification)
    (when (setq value (relation self))
      (delf (dependents value) self))
    (when (setq value (qualification self))
      (delf (dependents value) self))
    
    (when (eq (feature-type self) :value-restriction)
     ;(empty-concept self :value-restriction)
      (when (setq value (compute-defining-concept (value-restriction self)))
	(delf (dependents value) self))
      )
  ;(setf (feature-type self) nil)
    (loop for dep in (dependents self)
	do (delf (restrictions dep) self))
    (setf (dependents self) nil) 
   ;(help-reinit-CLASSIFIABLE-OBJECT self)
    ;; Only use the following one item:
    (setf (search-nodes self) nil)
    ))


(defun collect-surviving-restrictions (restrictions cumulativeValueRestrictions)
  ;; Helping function for "withdraw-unsupported-forward-inferences";
  ;; Note: "cumulativeValueRestrictions" gets modified destructively here;
  (declare (special *survivingValueRestrictions* *survivingMaxRestrictions*))
  (loop for res in restrictions
      unless (discarded-p res)		; TAR 10/1/1999
      do (case (feature-type res)
	   (:value-restriction
	    (loop for tail on cumulativeValueRestrictions
		as vr = (first tail)
		when (and vr
			  (subconcept-p res vr))
		do
		  (push vr *survivingValueRestrictions*)
		  (setf (car tail) nil)))
	   (:max-restriction (push res *survivingMaxRestrictions*)))) )


(defmethod CLOS::update-instance-for-different-class :after
	   ((previous DB-INSTANCE) current &rest init-args)
  ;; When an instance gets changed from DB-INSTANCE, we need to clear
  ;;   it from the match queues or else it can cause processing to break.
  ;; This will normally only occur when a system-defined instance (such as
  ;;   those introduced by set-constructing operators) is redefined as a
  ;;   different type of object (ie, by a subsequent defconcept)
  (declare (ignore init-args))
  (unless (typep current 'DB-INSTANCE)	; TAR 10/1/1999
    (let ((*do-in-subcontexts-p* t))
      (execute-in-contexts-depth-first
       (when (modification-summary previous)
	 (loop for i from 0 to $ACT-ON-Q$
	     do (setf (aref *match-queues* i)
		  ;; I think just deleting CURRENT will work, but this is safer:
		  (delete-if #'(lambda (x) (or (eq x current)
					       (eq x previous)))
			     (aref *match-queues* i)))))) )) )

(defmethod CLOS::update-instance-for-different-class :after
	   (previous (current DB-INSTANCE) &rest init-args)
  ;; When an instance gets changed to DB-INSTANCE, we need to make sure
  ;;   that DB-TYPE is properly initialized, as well as marking the it
  ;;   as having an identifier.
  ;; This will normally only occur when a system-defined instance (such as
  ;;   those introduced by set-constructing operators) is redefined as a
  ;;   different type of object (ie, by a create)
  (declare (ignore init-args))
  (unless (typep previous 'DB-INSTANCE)	; TAR 10/1/1999; 5/15/01
    (let ((*do-in-subcontexts-p* t))	; Force even during production rules!  ;  TAR 6/19/96
      (execute-in-contexts-depth-first
       (setf (db-type current) *thing*)
       (set-bit-flags (db-attributes current) :db-instance :user-defined-name)
       ;; post "current" for classification in multiple contexts:
       (post-non-analyzable-modified-instance current :retraction nil)
       (setf (never-before-matched-p (modification-summary current)) t)) )) )

;;; Patch Loom4-0-10  10/7/99
;;; Make this robust in the face of errors.


;;; Patch Loom4-0-11  10/27/99
;;; Patch that never made it from 3.0 into 4.0

(defmethod has-instance-p ((concept UNARY-ENTITY) instance)
  ;; Situation: "instance" is a non-LOOM object which is being matched
  ;;    against the concept "concept";
  ;; Instance is "built-in", i.e., it does not have an explicit type
  ;;    that can be used in a subconcept computation -- instead, its
  ;;    satisfaction of a concept can only be evaluated by probing
  ;;    the features of the concept, or by checking to see if it
  ;;    has been explicitly placed in the "local-instances" slot of a concept;
  ;; Return t iff "instance" is an instance of the concept "concept";
  (when (read-only-p concept)
    (return-from has-instance-p (has-bc-instance-p concept instance nil nil)))
  (when (eq concept *thing*) (return-from has-instance-p t))    ;  TAR 12/22/93
  (let ((assertedTypes nil))
    (labels ((has-local-instance-p (c)
               (let ((compiledTest 
                      (get (predicate-symbol c) :loom-compiled-predicate)))
                 (if compiledTest
                   (funcall compiledTest instance)
                   ;; BUG: THIS IS NOT CONTEXT SENSITIVE:
		   ;;(in-local-instances-p instance c)
		   (current-local-instance-of-p instance c)
		   )))
             (scan-for-types (c)
               (when (has-local-instance-p c)
                 (when (subconcept-p c concept)
                   (return-from has-instance-p t))
                 (pushnew c assertedTypes))
               (loop for sub in (sub-concepts c) 
                     do (scan-for-types sub))))
      (loop for prim in (most-specific-concepts (primitive-concepts concept))
            do (scan-for-types prim))
      (if (primitive-p concept)
        nil
        (progn
          (setq assertedTypes (most-specific-conjuncts
                               (most-specific-concepts assertedTypes)
                               :destructive-p t))
          (loop for type in assertedTypes
                thereis
                (satisfies-concept-definition-p instance concept type)))) )))

;;; Patch Loom4-0-12  10/28/99
;;; Suppress error meassage for temporary concepts.

(defun define-concept--internal (type name options)
  ;; Helping function for "define-concept" and "define-relation";
  ;; ??? BUG: CAN'T CLASSIFY IMMEDIATELY IF THERE IS AN EMBEDDED EXPRESSION:
  (let* ((classifyImmediatelyP (get&remf options :classify-immediately))
	 (sourceOptions options)
	 (*parserContextStack* (list *loom-parse-graph*))
	 *conceptBeingParsed* newConcept)
    (declare (special *parserContextStack* *conceptBeingParsed*))
    (when name
      (setq name (validate-concept-name name))
;; This is redundant code and never gets executed.  An earlier error aborts
;;  the processing:
;      (when (ecase type
;              ((:concept :property) (find-new-concept-conflict name))
;              (:relation (find-new-relation-conflict name)))
;        (warn "Cannot create a new ~(~A~) named ~A because that name~%~
;               is used for a ~(~A~) in some context below ~A." 
;              type name *context* type)
;        (return-from define-concept--internal nil))
      (when (not classifyImmediatelyP) 
	(return-from define-concept--internal
	  ;; BUG: need to replace objects in "sourceOptions" with names or expressions
          ;;   Fixed by the "generate-dereferenced-expression" call?  TAR 12/13/93
	  (redefine-concept
           `(,name ,@(generate-dereferenced-expression sourceOptions)) ;  TAR 12/13/93
           type))))
    ;; if name is nil, or "classify-immediately", we assume we are creating
    ;;    a new concept, so we skip some of the checks
    (setq newConcept
	  (create-concept
	    name type (compute-context-from-source-options sourceOptions)
	    :dont-list-as-uninterned
	    (member :temporary (getf options :system-characteristics))))
    (setq *network-is-sealed-p* nil)
    (setq *reseal-network-p* t)
    (setq *conceptBeingParsed* newConcept)
    (catch 'parse-concept-definition-catcher
      (parse-source-clauses newConcept sourceOptions)
      ;; NOTE: For unnamed concepts, we delay installation of source until
      ;;    revision is necessary, because the source may be big for unnamed concepts:
      (when (name newConcept)
	(install-source-definition newConcept))
      (case (normalized-3-valued-truth-value classifyImmediatelyP)
	(true
	 (setq newConcept (condition&classify-subgraph newConcept))
	 (cond
	   ((classified-p newConcept)
	    (post-uncompleted-concept newConcept))
	   ((not (bad-definition-p newConcept))
	    (unless #-:isi(member :temporary (getf options :system-characteristics))
		    #+:isi nil
	      (parsing-error "Can't immediately classify concept ~S" newConcept)))))
	(false
	 (post-unclassified-concept newConcept))
	(otherwise
	 (post-unclassified-concept newConcept)
	 (when (not (member :disable-classifier *loom-features*))
	   (classify&complete-all-concepts)
	   (when (member :discarded-by-merge (system-attributes newConcept))
	     (setq newConcept
		   (prog1 
		     (merged-into-concept newConcept) 
		     (setf (merged-into-concept newConcept) nil))))))))
    newConcept ))

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
        (when (defined-in-context-p (second generatedDefinition) self source-context)
          generatedDefinition))) ))	; TAR 10/28/1999



;;; Patch Loom4-0-13  11/8/99
;;; Make this work for properties as well:
  
(defmethod probe-all-fillers-in-concept-p ((self UNARY-RELATION) instance role setOfFillers) ;LITEBUG
  ;; Helping method for "probe-all-p";
  ;; Return t if all members of "fillers" are instances of "self";
  ;; If *collectedTriggerInstances* is bound, then set it to
  ;;     IF t result THEN all fillers (or NIL if "self" is :monotonic)
  ;;     ELSEIF nil result THEN one filler whose type does not include concept
  ;;        (unless that filler is a constant);
  (declare (special *collectedTriggerInstances* *testConcept*))
  (let (badFiller nonClassifiedFillers)
    (loop for filler in setOfFillers
	unless (classified-instance-p filler)
	do (push filler nonClassifiedFillers)
	when (not (probe-instance-of-p filler self))
	     do (setq badFiller filler) and return nil)
    (cond (badFiller
	   (cond ((perfect-p self) nil)
		 (;(boundp '*collectedTriggerInstances*)
		  (boundp '*testConcept*)
		  (unless (classified-instance-p badFiller)
		    (inform "~%Possible Missed Inference:~%  ~
                     ~@[While testing for membership in concept ~A,~%  ~]~
                     ~A does not have all ~A fillers of type ~A,~%  ~
              but Loom cannot monitor this condition because filler ~A~%  ~
              is not a classified instance.~%"
			(and (boundp '*testConcept*) *testConcept*)
			instance role self badFiller)
		    (throw :mixed-instances nil))
		  (when (boundp '*collectedTriggerInstances*)
		    (setq *collectedTriggerInstances* (list badFiller)))
		  nil)
		 (t (when (boundp '*collectedTriggerInstances*)
		      (setq *collectedTriggerInstances* (list badFiller)))
		    nil)))
	  ((monotonic-p self)
	   t)				; hit, no trigger instances
	  (t
	   (when (and (boundp '*testConcept*) nonClassifiedFillers)
	     ;(boundp '*collectedTriggerInstances*)
	     (inform "~%Missed Inference:~%  ~
                     ~@[While testing for membership in concept ~A,~%  ~]~
                     ~A has all ~A fillers of type ~A,~%  ~
             but Loom cannot monitor this condition because filler~P ~{~A~^, ~}~%  ~
              ~:[is not a classified instance~;are not classified instances~], ~
              so Loom must disregard the match.~%"
		     (and (boundp '*testConcept*) *testConcept*)
		     instance role self
		     (length nonClassifiedFillers) nonClassifiedFillers
		     (rest nonClassifiedFillers))
	     (throw :mixed-instances nil))
	   ;; hit, set of trigger instances
	   (when (boundp '*collectedTriggerInstances*)
	     (setq *collectedTriggerInstances* setOfFillers))
	   t)) ))

;;; Patch Loom4-0-14  11/*/99
;;; Make this do the right thing with :abandoned-by-merge instances

;; merge-instances patched in #66 below.
;; local-merge-instances patched in #66 below.


(defmethod current-local-instance-of-p
           ((instance DB-INSTANCE) concept)    ; TAR 11/22/99
  ;; Helping function for "do-time-sensitive-local-instances" tests
  ;;    *agent-time* membership of "instance" in "concept";
  ;; TO DO: IF WE DECIDE TO KEEP THIS LOGIC, DEFINE "in-current-context-p"
  ;;    REPLACE THE CODE BELOW WITH A CALL TO THAT TEST FUNCTION:
  (when (subctxt-p (ctxt *context*) (home-ctxt instance))
    (setq instance (get-agent-time-offset-instance instance))
    (and (not (discarded-p instance))
	 (not (test-bit-flags (db-attributes instance) :db-instance 
			      :abandoned-by-merge))
	 (loop for c in (get-cached-types instance)
	     thereis (subconcept-p c concept)))) )

;;; Patch Loom4-0-15  11/22/99
;;; Make this work properly with qualified restrictions.

(defmethod propagate-forward-inferences-to-filler (filler instance role)
  ;; Don't propagate inferences, since "filler" is not a DB-INSTANCE;
  ;; However, we test that "filler" satisfies forward constraints attached to
  ;;    "instance";
  ;; If not, post "instance", so that it will be flagged as incoherent;
  ;; Clumsy:  "cumulative-value-restrictions" eliminates restrictions on
  ;;    set features to simplify forward propogation, but this means that
  ;;    we need an extra loop here to test for incoherence;
  (let* ((relevantCumulativeValueRestrictions 
	  (specializing-restrictions	; TAR 11/22/99
	   role nil (cumulative-value-restrictions instance) :value-restriction))
         (violatedRes
          (or (loop for res in relevantCumulativeValueRestrictions
		  when (not-has-instance-p (value-restriction res) filler)
		  return res)
              (and (not (incoherent-instance-p instance))
                   (loop for res in (specializing-restrictions  ; TAR 11/22/99
				     role 
				     nil
				     (implied-restrictions
				      (find-type&residue-features instance))
				     :value-restriction)
		       when (and (not (member res relevantCumulativeValueRestrictions))
				 (not-has-instance-p (value-restriction res)
						     filler))
		       return res)))))
    (when violatedRes
      (pushnew violatedRes (violated-features instance))
      (post-incoherent-instance 
       instance
       (format nil "Filler ~A of relation ~A conflicts with restriction ~A"
	       filler role violatedRes))) ))

;;; Patch Loom4-0-16  11/30/99
;;; Improve error message.

(defun incorporate-non-tbox-expressions (concept)
  ;; Called by "complete-one-concept";
  ;; Incorporate constraints, attributes, defaults, etc.;
  (cond
    ((loop for dep in (non-tbox-depend-ons concept)
	   always (classified-p dep))
     (loop for tail on (parsed-expressions concept) by #'cddr
	   do
	  (let ((context (first tail))
		(expression (second tail)))
	    (case context
	      (:definition nil)			; definition is already incorporated
	      (:antecedents
	       (incorporate-antecedents-expression concept expression))
	      (otherwise
	       (incorporate-expression concept expression :context context)))))
     (delf (system-attributes concept) :non-tbox-unincorporated))
    (t
     (warn "~&incorporate-non-tbox-expressions (~s):~%~
             some expression not classified:~%~{   ~S~%~}"
	   concept (loop for dep in (non-tbox-depend-ons concept)
		       unless (classified-p dep) collect dep))
     (pushnew :non-tbox-unincorporated (system-attributes concept)))) )

;;; Patch Loom4-0-17  1/3/00
;;; Fix bug when used with non-classified instances.

(defun why-isa (instance concept)
  ;; Return a list of premises that explains why "instance"
  ;;    isa "concept" (or that it isn't);
  ;; The code is designed to look for the simplest, most direct
  ;;    line of support that it can find;
  (let (premises)
    (declare (ignore premises))
    (unless
      (and
	(setq instance (get-instance instance))
	(setq concept (get-concept concept :no-error-p t)))
      (return-from why-isa
	(format t "Null ~S argument.~%"
		(if (null instance) "instance" "concept"))))
    (cond
     ((eql concept (loom-constant THING))
      `((:string "All objects are instances of THING")))
     ((eql concept (intrinsic-concept instance))
      `((:created-instance-of ,instance ,concept )))
     (t (if (classified-instance-p instance)
	  (cond ((not (forward-chaining-isa-p instance concept :default))
		 `((:unknown-isa ,instance ,concept)))
		((why-conjuncts-table-implies-instance-isa-concept instance concept
								   :strict))
		((why-instance-classifies-as-concept instance concept :strict))
		((why-conjuncts-table-implies-instance-isa-concept instance concept
								   :default-only))
		((why-instance-classifies-as-concept instance concept :default-only))
		(t '((:sorry))))
	  (cond ((member concept (dynamically-asserted-conjuncts instance))
		 `((:asserted-instance-of ,instance ,concept)))
		((loop for c in (get-subconcepts concept)
		 when (member c (dynamically-asserted-conjuncts instance))
		 return `((:asserted-instance-of ,instance ,c)
			  (:specializes ,c ,concept))))
		((why-instance-classifies-as-concept instance concept :strict))
		((why-instance-classifies-as-concept instance concept :default-only))
		(t '((:sorry))))))) ))

;;; Patch Loom4-0-18  1/4/00
;;; Update for changed storage of role information in dynamic variables.

(defun why-filling-domain/range-implies-instance-isa-concept (instance concept conjunct)
  ;; Called by "why-conjuncts-table-implies-instance-isa-concept";
  ;; Return a list of premises that explain the existence of
  ;;    a role of "instance" such that a domain or range constraint
  ;;    on that role implies that "instance" isa "concept";
  ;; "conjunct" names a concept known to be the domain or range of
  ;;    a role that originates a constraint such as just described;
  (let (role roleFiller domain/range)
    (labels ((find-simple-filler-of-range-of-role
	       ;; Find a filler of "role" of "instance" whose support is as
	       ;;    direct as possible;
	       ()
	       (let ((roleRecord
		       (assoc role (role-fillers-table instance))))
		 (cond
		   (roleRecord
		    (setq roleRecord (cdr roleRecord))
		    (or (car (asserted-fillers roleRecord))
			(car (strict-fillers roleRecord))
			(car (default-fillers roleRecord))))	    
		   (t
		    (car (get-slot-values instance role))))))
	     (find-role-filled-by-instance-with-domain/range
	       ()
	       (loop for entry in (dynamic-variables instance)
		    do
		    (if (symbolp (car entry))
			(progn			; ordinary role
			  (setq role (get-relation (car entry) :no-error-p t))
			  (when (and role (eq (implied-domain role) conjunct))
			    (setq roleFiller
				  (find-simple-filler-of-range-of-role))
			    (return-from find-role-filled-by-instance-with-domain/range
			      :domain)))
			(progn			; phantom inverse
			  (setq role (inverse-of-phantom (car entry)))
			  (setq roleFiller (cadr entry))
			  (return-from find-role-filled-by-instance-with-domain/range
			    :range))))))
      (setq domain/range
	    (find-role-filled-by-instance-with-domain/range))
      `((,(case domain/range
	    (:domain :fills-role-domain)
	    (:range :fills-role-range))
	 ,instance ,role ,roleFiller)
	(,(case domain/range
	    (:domain :has-domain)
	    (:range :has-range))
	 ,role ,conjunct)
	,@(when (neq concept conjunct)
	    `((:specializes ,conjunct ,concept)))) )))

;;; Patch Loom4-0-19  1/24/00
;;; Add additional special variable binding for error messages.

(defun assert-annotations (self)
  ;; If "self" is a concept or relation, assert any attached annotations;
  ;; If "self" is a role, assert any attached facets;
  (let ((annotations (collect-source-annotations self))
        (facetsP (typep self 'ROLE))
	;; Two variables For evaluate-instance-references error messages
	(*conceptBeingConditioned* (if (typep self 'ROLE)
				       (concept self)
				     self))
	(*conceptBeingParsed* (if (typep self 'ROLE)
				  (concept self)
				self)))
    (declare (special *unannotatedMetaObjects*
		      *conceptBeingConditioned*
		      *conceptBeingParsed*))
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
		 (when (> (arity relation) 2)
		   (warn "Only concepts, properties and BINARY relations are allowed in :annotations.~%~
                          Annotation ~A on ~A has arity ~D.~%Skipping assertion."
			 relation self (arity relation))
		   (return-from tell-role nil))
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

;;; Patch Loom4-0-20  1/17/00
;;; Fix overzealous tautology code that was fixed before!

(defun form-universal-query (universalVariables universalClause)
  ;; Return a form corresponding to "universalClause", which is a
  ;;    clause headed by a :forall operator;
  ;; This function builds nested generators and restrictions in the same
  ;;    manner as "form-collection-query";
  (when (and (consp universalClause)	; RMM 7/13/94
             (eq (first universalClause) :and))
    (return-from form-universal-query
      (form-multiple-universal-queries universalVariables universalClause)))
  (let ((normalizedUniversalClause
	 (normalize-universally-quantified-subquery universalClause))
	antecedent consequents consequentCode)
    (when (null normalizedUniversalClause)
      (form-query-error "To successfully evaluate a universally quantified clause, the clause ~%   ~
                         must contain at least one negated term.  In this case, the clause~%   ~S~%   ~
                         does not.  Universally quantified queries usually take the form~%      ~
                         `(for-all (?x) (implies (P ?x) (Q ?x)))' which is equivalent to~%      ~
                         `(for-all (?x) (or (not (P ?x)) (Q ?x)))'"
			universalClause))
    ;; "normalizedUniversalClause" has been normalized to have the form
    ;;    (:or (:not <antecedent>) <consequent1> ... <consequent k>), where 
    ;;    k may be zero;
    (setq antecedent (second (second normalizedUniversalClause)))
    (setq consequents (cddr normalizedUniversalClause))
    (when (and (null consequents)
	       (not (and (consp antecedent) (eq (first antecedent) :AND))))
      ;; A tautology, since there is only one negated term and it is
      ;;  term which is negated subsumed the consequent.  If the antecedent
      ;;  is a conjunction, then may include a consequent that was rolled
      ;;  into the antecedent during normalization, so we can't short circuit.
      ;;  TAR 1/27/00
      (return-from form-universal-query t))
    (multiple-value-bind (antecedentCode runTimeClosedRoleTestP antecedentResidue)
	(form-antecedent-query antecedent universalVariables)
      ;; generate query for consequent(s), and substitute it for the symbol
      ;;    'DUMMY-CONSEQUENT-CODE in "antecedentCode";
      (when antecedentResidue		; tar 6/9/93
	(setq antecedentResidue (simplify-wff antecedentResidue t))
	(if (eql (car antecedentResidue) :or)
	    (loop for residue in (cdr antecedentResidue)
		do (push residue consequents))
	  (push antecedentResidue consequents)))
      (setq consequentCode
	(form-boolean-query
	 (if (rest consequents) `(:or ,@consequents) (first consequents))))
      (if (or consequentCode (null consequents)) ;  TAR 6/12/95
	  (wrap-with-run-time-open-role-catcher
	   ;; If "consequentCode" is NIL, then the implication is a tautology
	   ;; unless the normalization step rolled the consequent into the
	   ;; antecedent code.
	   (subst consequentCode 'DUMMY-CONSEQUENT-CODE antecedentCode)
	   runTimeClosedRoleTestP)
	t)) ))


;;; Patch Loom4-0-21  2/16/00
;;; Make multiple default fillers respect cardinality restrictions.

;; abox/predicates.lisp

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
			 ,@pushDefaultFillersForms
			 ;; If more than one default filler is inherited
			 ;;  for a SV-Relation, don't inherit any!
			 (when (rest fillers)           ; TAR 2/16/00
			   (setq fillers nil)))
		      `(progn
			 ,@pushDefaultFillersForms)))))
         ,(if (role-is-single-valued-p topRelation)     ; TAR 8/10/93
            `(progn
               (when (rest fillers)
                 (complain-about-too-many-fillers       ; RMM 2/7/94
                  ,inputParameter ',(name topRelation) fillers))
              (first fillers))
	    'fillers) ) )))



;; abox/defaults.lisp

(defun filter-default-fillers-for-number-restrictions 
    (concept defaults maxCardinalityFunction strictFillersFunction)
  (let ((role-fillers-alist nil))
    (flet ((add-filler-to-alist (role filler)
	     (let ((entry (assoc role role-fillers-alist)))
	       (cond ((null entry)
		      (push (list role filler) role-fillers-alist))
		     ((member filler (cdr entry) :test #'filler-equal)
		      nil)
		     (t
		      (setf (cdr entry) (cons filler (cdr entry))))))))
      (loop for default in defaults
	  when (typep default 'FILLED-BY-FEATURE)
	  do (loop for filler in (role-fillers default)
		 do (add-filler-to-alist (relation default) filler)))
      (when role-fillers-alist
	(loop for (role . fillers) in role-fillers-alist
	    as max-fillers = (funcall maxCardinalityFunction concept role)
	    as strict-fillers = (funcall strictFillersFunction concept role)
	    when (and max-fillers
		      (> (length (union fillers strict-fillers :test #'filler-equal))
			 max-fillers))
	    do (setq defaults (delete-if #'(lambda (def)
					     (and (typep def 'FILLED-BY-FEATURE)
						  (eq role (relation def))))
					 defaults))))
      defaults )))

(defun filter-concept-default-fillers-for-number-restrictions (concept defaults)
  (flet ((fillers-function (concept role)
	   (compute-strict-role-members-for-concept concept role nil))
	 (role-max-fillers (concept role)
	   ;; Need to add this SINGLE-VALUED-P test because ROLES are not
	   ;;   relations are not necessarily sealed when this code is
	   ;;   run, so compute-maximum-role-cardinality-for-concept
	   ;;   will not reflect that source of restrictions.
	   (let ((computedMax (compute-maximum-role-cardinality-for-concept 
			       concept role nil)))
	     (cond ((not (single-valued-p role))
		    computedMax)
		   ((null computedMax)
		    1)
		   (t (min 1 computedMax))) )) )
    (filter-default-fillers-for-number-restrictions 
     concept defaults #'role-max-fillers #'fillers-function) ))

(defun filter-instance-default-fillers-for-number-restrictions (instance defaults)
  (let ((supers (list-of (db-type instance))))
    (flet ((fillers-function (instance role)
	     (collect-all-role-fillers instance role))
	   (role-max-fillers (instance role)
	     (compute-maximum-role-cardinality-for-instance 
	      instance role nil :super-concepts supers)) )
      (filter-default-fillers-for-number-restrictions 
       instance defaults #'role-max-fillers #'fillers-function) )))

(defun process-default-assertion-queue (queue)
  ;; Situation: "queue" contains a list of all instances which
  ;;    MAY have defaults that can be activated;
  ;; Activate defaults attached to instances in "queue" which
  ;;    don't conflict with existing truth values;
  ;; Note: The slots "active-default-concepts" and "inactive-defaults"
  ;;    are used only within this function;  The slot "active-default-features"
  ;;    is also used by "compute-residue-features-p";
  (let (modificationSummary repostToSameQueueP defaults)
    (flet ((collect-default-rules (instance)
	     (let ((type (db-type instance))
		   newDefaults)
	       (integrity-check (atom type))                ; TAR 2/7/95
	       (loop for default in (default-features type)
		    unless
		    (or (member default (active-default-features modificationSummary))
			(member default (inactive-defaults modificationSummary)))
		    do
		    (if (detect-default-conflict-p default instance)
			(push default (inactive-defaults modificationSummary))
			(progn
			  (push default (active-default-features modificationSummary))
			  (push default newDefaults))))
	       (loop for default in (default-concepts type)
		    unless
		    (or (member default (active-default-concepts modificationSummary))
			(member default (inactive-defaults modificationSummary)))
		    do
		    (if (detect-default-conflict-p default instance)
			(push default (inactive-defaults modificationSummary))
			(progn
			  (push default (active-default-concepts modificationSummary))
			  (push default newDefaults))))
	       newDefaults)))
    (loop for instance in queue
	 when
	 (and (setq modificationSummary (modification-summary instance))
	      (eql (queue-level modificationSummary) $DEFAULT-ASSERTION-Q$))
	 do
	 (cond
	   ((incoherent-instance-p instance)
	    (abandon-recognizing-incoherent-instance instance))
	   ((not (or (features-analyzed-p modificationSummary)
		     (analyze-features-p instance $DEFAULT-ASSERTION-Q$)))
	    ;; "instance" is skipping rematch at all queue levels:
	    (unpost-instance instance))
	   (t (when (setq defaults (collect-default-rules instance))
		(setq defaults (filter-instance-default-fillers-for-number-restrictions 
				instance defaults))
		(loop for default in defaults
		     do (apply-default default instance)))
	      (setq repostToSameQueueP
		    (recompute-asserted-instance-type-p instance))
	       ;; Could have become incoherent during recomputation of type.
	      (when (incoherent-instance-p instance)
		(abandon-recognizing-incoherent-instance instance)
		(return-from process-default-assertion-queue nil))
	      (when (null repostToSameQueueP)
		;; we are leaving the default assertion queue -- replant
		;;    bombs on default hits and misses;
		(loop for f in (default-feature-hits modificationSummary)
		     do (monitor-feature instance f t))
		(loop for f in (default-feature-misses modificationSummary)
		     do (monitor-feature instance f t))
		(setf (default-feature-hits modificationSummary) nil)
		(setf (default-feature-misses modificationSummary) nil))		 
	      (cond
		(repostToSameQueueP
		 (repost-instance
		   instance $DEFAULT-ASSERTION-Q$ modificationSummary))
		((incoherent-instance-p instance)
		 (abandon-recognizing-incoherent-instance instance))
		((neq (original-type modificationSummary) (db-type instance))
		 (detonate-type-bombs-on-new-conjuncts
		   instance (db-type instance) (strict-db-type instance))
		 (repost-instance instance $ACT-ON-Q$ modificationSummary))
		(t
		 ;; for checking detonation, catch possibility that type of "instance" has
		 ;;    not changed, but probe made by another instance failed, and hence
		 ;;    bomb was attached to "instance" in the middle of the match cycle:
		 (detonate-type-bombs-on-new-conjuncts
		   instance (db-type instance) (strict-db-type instance))
		 (unpost-instance instance)))))) )))

(defun condition-defaults (self)
  ;; Compute a list of defaults for the concept "self";
  ;; First condition the defaults directly attached to "self";
  ;; Next, determine the set of inherited defaults that are
  ;;    not overriden by locally-defined defaults, and condition those;
  ;; Finally, merge the two sets together to form the complete list of defaults;
  (when (member :temporary (system-attributes self))
    (return-from condition-defaults nil))
  (when (condition-defaults-cheaply-p self)
    (return-from condition-defaults nil))
  (let ((strictConjunct (consequent-concept self))
	strictRestrictions localClassifiedRestrictions survivingRestrictions)
    (multiple-value-bind (localLocalRestrictions localComparisons localPrimitives)
	                 (extract-local-defaults self)
      (multiple-value-bind (inheritedRestrictions
                            inheritedPrimitives inheritedComparisons)
                           (extract-inherited-defaults
                            self localLocalRestrictions localPrimitives)
	;; classify the local local restrictions:
	(let ((*listOfLocalRestrictions* localLocalRestrictions))
	  (declare (special *listOfLocalRestrictions*))
	  (setq localClassifiedRestrictions (classify-restrictions nil :dbox)))
        (setq strictRestrictions
              (possibly-colliding-strict-restrictions
               self localClassifiedRestrictions inheritedRestrictions))
	;; clip out any default :FILLED-BY features that are known to violate
	;;  number restrictions:
	(setq survivingRestrictions
	  (filter-concept-default-fillers-for-number-restrictions 
	   self (append ;; BUG: local local restrictions marked as :redundant
		           ;;    get eliminated during the classification
		        localClassifiedRestrictions
			inheritedRestrictions
			)))
	;; clip out any default features that conflict with strict features
	(setq survivingRestrictions	; TAR 2/17/00
	      (loop for defaultRes in survivingRestrictions
		  unless (default-feature-collides-with-strict-feature-p
			     defaultRes strictRestrictions)
		  do (addf (non-tbox-dependents defaultRes) self)
		  and collect defaultRes))
	(setf (default-features self)
	      (bag-append
               survivingRestrictions
               (compute-surviving-comparisons localComparisons inheritedComparisons)))
	(setf (default-concepts self)
	      (most-specific-concepts
               (loop for prim in (append localPrimitives inheritedPrimitives)
                    unless (or (disjoint-concepts-p strictConjunct prim)
                               (subconcept-p strictConjunct prim))
		   collect prim))) ))))


;;; Patch Loom4-0-22  3/21/00
;;; Enhancement.  Expose this behavior to users.

(defun get-applicable-methods (action arguments &key (filter-p t))
  "Returns all methods of `action' that are applicable to `arguments'.  If `:filter-p' is non-NIL,
then the action's filtering rules will be applied.  If NIL, then all methods whose situation matches
will be returned without regard to the filtering rules."
  (declare (inline get-action))
  (setq action (get-action action :no-error-p nil))
  (let* ((parameters (parameters action))
	 (numberOfOrdinaryParameters (position '&key parameters))
	 (ordinaryArguments
	  (if numberOfOrdinaryParameters
	      (subseq arguments 0 numberOfOrdinaryParameters)
	    arguments))
	 (methods
	  ;; find all methods which satisfy their situation conditions 
	  (loop for m in (methods action)
	      when (apply (compiled-situation-test m) ordinaryArguments)
	      collect m)))
    (if (and filter-p (rest methods))
	;; situation: two or more candidate methods found; apply filters
	(filter-methods action methods ordinaryArguments)
      methods) ))

(export 'get-applicable-methods)

;;; Patch Loom4-0-23  3/28/00
;;; Make this reject :not for relations

(defun parse-clause (keyword arguments metaType)
  ;; Validate the arguments to the option "keyword";
  ;; Return an expression in which all concept references have been
  ;;    replaced by pointers to concept objects;
  (declare (special *algebraicP*))
    (case keyword
      ((:and :or)
       (when (eq keyword :or)
         (setq *algebraicP* t)
         (when (eq metaType :relation)    ; RMM 4/5/93
           (parsing-error
            "Disjunction is supported for concepts but not for relations.")))
       (when (null arguments)
	   (parsing-error "Keyword ~S must have at least one argument" keyword))
       `(,keyword
	  ,@(loop for term in arguments
		 collect (parse-expression term metaType))))
      (:not
       (setq *algebraicP* t)
       (when (eq metaType :relation)	; TAR 3/28/00
           (parsing-error
            "Negation is supported for concepts but not for relations."))
       (when (/= (length arguments) 1)
	 (parsing-error "Wrong number of arguments to :not keyword"))
       `(:not ,(parse-expression (first arguments) metaType)))

      ;; (unary) concept-specific clauses:
      ((:at-least :at-most :exactly)
       (parse-restriction keyword arguments t))
      ((:all :the :some)
       (parse-restriction keyword arguments nil))
      ((:filled-by :not-filled-by)
       (parse-filled-by-restriction keyword arguments))
      
      ;; relation-specific clauses:
      ((:domain :range)
       `(,keyword ,(parse-list-with-one-expression arguments :concept)))
      (:domains
       `(:domains ,@(parse-list-of-expressions arguments :concept)))
      (:inverse					; INVERSES MAY BE REDONE 
       `(:inverse ,(parse-list-with-one-expression arguments :relation)))
      (:satisfies
       (parse-satisfies-feature arguments))
      ((:predicate :function)
       (convert-computed-feature-to-auxiliary-lambda-expression 
        keyword arguments))
      (:composition
       `(:composition ,@(parse-list-of-expressions arguments :relation))) 
      
      ;; set-specific clauses:
      (:through
       (parsing-warning 
	"The keyword :THROUGH is now deprecated.  Use :INTERVAL++ instead.")
       (parse-enumerated-set keyword arguments))
      ((:one-of  :the-ordered-set
	:interval++ :interval+- :interval-+ :interval--)
       (parse-enumerated-set keyword arguments))
      
      ;; other clauses:
      ((:relates :not-relates)
       (parse-relates keyword (first arguments) (rest arguments)))
      ((:same-as :subset)
       (parse-relates
	 :relates
	 (case keyword
	   (:same-as 'same-as)
	   (:subset 'subset))
	 arguments))
      ((:exists :not-exists)
       (parse-exists keyword (first arguments) (rest arguments)))
      (QUOTE
       (when (or (cdr arguments)
		 (not (constant-p (car arguments))))
	 (parsing-error "Illegal quoted expression"))
       (when (symbolp (car arguments))
	 (setq arguments `(',@arguments)))
       (parse-enumerated-set :one-of arguments))
      (otherwise
       ;; must be a comparison
       (integrity-check (not (keywordp keyword)))	; >,<,=, etc.
       (parse-relates :relates keyword arguments))) )

;;; Patch Loom4-0-24  4/24/00
;;; Improved error message for lack of primitiveness

(defmethod classify-into-hierarchy ((self UNARY-ENTITY))
  ;; Set-up classification flags, compute starting points,
  ;;     and classify "self" below them;
  ;; This method handles the special case that "self" has no primitiveness;
  ;;    In that case, "self" gets placed right below the top of the hierarchy;
  (if (or (primitive-concepts self) (eq (defined-as self) :disjunction))
    (call-next-method)
    (let ((supers (super-concepts self)))
      (unless (system-defined-p self)
	(inform "~S has no primitive parent other than THING,~%   so it will not be classified.~%" self)) ; TAR 12/5/96
      ;; make "add-specializes-link" happy:
      (setf (super-concepts self) nil)
      ;; install super-concepts links:
      (install-parent-links self supers)
      ;; mark "self" as classified:
      (setf (classified-p self) 0)
      self)) )

;;; Patch Loom4-0-25  4/24/00
;;; Suppress message for temporary concepts: they can come from disjointness testing.

(defmethod post-classify-concept ((self TBOX-CONCEPT) selfWasMerged)
  ;; Inherit partitions from superconcepts of "self";
  ;; QUESTION: DO FUNNY THINGS HAPPEN IF MERGING CONCEPT BRINGS
  ;;    IN COVERING KNOWLEDGE???
  (declare (ignore selfWasMerged))
  (loop for c in (negated-concepts self)
        when (subconcept-p self c)
	do (unless (member :temporary (system-attributes self))
	     (with-feature-changes (:set '(:long-print-names))
	       (grumble "Concept ~S is incoherent because it is a subconcept of~%~
                       both ~S and its negation." self c)))
	(mark-as-incoherent self))
  (catch 'parse-concept-definition-catcher  ; DGB 1/26/94
    (install-partition-memberships self)) )

;;; Patch Loom4-0-26  5/26/00
;;; Make this clear the context first, to reclaim some storage of instances in
;;; concepts defined in parent contexts.

(defun destroy-all-contexts ()
  ;; Wipe out top-level access to contexts;
  ;; Note: This is only called during reloading of the "coda.lisp" file;
  (let ((*destroyAllContexts* t))
    (declare (special *destroyAllContexts*))
    (loop for entry in *context-table*
        do (destroy-context (cdr entry))))
  ;; eliminate BUILT-IN-THEORY, which is hard to kill:
  (setq *context-table* nil) )

(defmacro remove-if-from-mutable-heap-index (testfunction heapPlace)
  ;; Expand to a form that removes items satisfying "testfunction" from the heap index
  ;;    stored at "heapPlace";
  `(let ((heap ,heapPlace))
     (if (listp heap)
	 (setf ,heapPlace (delete-if ,testfunction heap))
       (maphash #'(lambda (k v)
		    (declare (ignore v))
		    (when (funcall ,testfunction k)
		      (remhash k heap)))
		heap)) ))

(defun clean-up-context-storage ()
  ;; Helping function that reclaims storage that would otherwise be
  ;;   held onto because of live pointers to items in discarded contexts
  ;; UNDER DEVELOPMENT.
  ;; Step 1.  Map down all concepts (ugh) and remove instances defined in
  ;;     discarded contexts from local instances slot.  Needs to do this
  ;;     globally because we don't maintain backpointers to all the places
  ;;     the information is kept in.
  (flet ((instance-in-discarded-context-p (i)
	   (let ((home-ctxt (home-ctxt i)))
	     (and home-ctxt (ctxt-discarded-p home-ctxt)))))
    (do-concepts (c)
      (remove-if-from-mutable-heap-index
       #'instance-in-discarded-context-p (local-instances c)))))

(defun destroy-context (contextOrName)
  "Destroy the context `context' and all contexts below it."
  (labels ((destroy-recursively (c)
	     (loop for child in (child-contexts c)
		 do (destroy-recursively child))
	     (destroy-one-context c))) ;  TAR 5/17/96
    (let ((context (find-context contextOrName)))
      (when (null context)
	(complain "~%Can't destroy non-existent context ~S" contextOrName)
	(return-from destroy-context nil))
      (when (eq (name context) 'BUILT-IN-THEORY)
	(return-from destroy-context nil))
      (destroy-recursively context)
      (unless (boundp '*destroyAllContexts*)
	(clean-up-context-storage))
      (relink-bottom-theory)
      context )))

;;; Patch Loom4-0-27  6/20/00
;;; Make this handle merged instances properly.

(defmethod get-instance-at-time-point ((self DB-INSTANCE) timePoint)
  ;; Return "self" or a history version of it that corresponds to time
  ;;    "timePoint";
  (declare (inline get-instance-with-histories-at-time-point))
  (setq self (womp-merge-pointers self))  ; TAR 6/20/2000
  (get-instance-with-histories-at-time-point self timePoint) )

;;; Patch Loom4-0-28  6/22/00
;;; Make this detect too many filler errors for single-valued roles.

;; Patched again below in #71

;;; Patch Loom4-0-29  6/27/00
;;; Improve coherence detection & reason for certain merged instance cases.

(defmethod propagate-forward-inferences-to-filler (filler instance role)
  ;; Don't propagate inferences, since "filler" is not a DB-INSTANCE;
  ;; However, we test that "filler" satisfies forward constraints attached to
  ;;    "instance";
  ;; If not, post "instance", so that it will be flagged as incoherent;
  ;; Clumsy:  "cumulative-value-restrictions" eliminates restrictions on
  ;;    set features to simplify forward propogation, but this means that
  ;;    we need an extra loop here to test for incoherence;
  (let* ((cumulativeValueRestrictions (cumulative-value-restrictions instance))
         (violatedRes
          (or (loop for res in cumulativeValueRestrictions
                    when (and (subconcept-p role (relation res))
                              (not-has-instance-p (value-restriction res)
                                                  filler))
                    return res)
              (and (not (consp (db-type instance)))  ; TAR 6/27/00
                   (loop for res in (implied-restrictions
                                     (find-type&residue-features instance))
                         when (and (subconcept-p role (relation res))
                                   (eq (feature-type res) :value-restriction)
                                   (not (member res cumulativeValueRestrictions))
                                   (not-has-instance-p (value-restriction res)
                                                       filler))
                         return res)))))
    (when violatedRes
      (pushnew violatedRes (violated-features instance))
      (post-incoherent-instance 
       instance
       (format nil "Filler ~A of relation ~A conflicts with restriction ~A"
	       filler role violatedRes))) ))

;; detect-incoherence-p patched in #66 below

;;; Patch Loom4-0-30  6/27/00
;;; Make merging of two skolems work correctly with inverse relations.

(defun  replace-or-merge-skolem-filler (instance role filler oldFiller justification)
  ;; Helping function for "assert-half-role-filler";
  ;; One of filler or oldValue is a skolem;
  ;; Merge or replace the skolem with another filler;
  ;; Return the possibly new filler;
  (let ((fillerIsMergeableP (classified-instance-p filler)))
    (if (and fillerIsMergeableP
	     (test-bit-flags (db-attributes filler) :db-instance :instance-being-merged))
	;; Just substitute "filler" for "oldFiller"
	(progn
	  ;; note: setting justification to :all eliminates all derived role fillers:
	  (retract-role-filler instance role oldFiller :all
			       :dont-retract-domain-conjunct-p t)
	  (add-to-role-fillers-table instance role filler nil justification))
	;; Filler is not being merged:
	(cond
	  ((not fillerIsMergeableP)
	   (unless (replace-skolem-by-constant oldFiller filler)
	     ;; Remove oldFiller, if it is already being replaced
	     (retract-role-filler instance role oldFiller :all
				  :dont-retract-domain-conjunct-p t))
	   ;; Make sure proper support is recorded
	   (add-to-role-fillers-table instance role filler nil justification))
	  ((not (classified-instance-p oldFiller))
	   (replace-skolem-by-constant filler oldFiller)
	   (setq filler oldFiller))
	  ;; If oldFiller is being merged, then do nothing.  ; TAR 6/27/00
	  ((test-bit-flags (db-attributes oldFiller) :db-instance :instance-being-merged)
	   nil)
	  (t  ;; if both are instances, merge the role-fillers
	   (setq filler (merge-instances
			  (identifier filler)
			  (identifier oldFiller)
			  justification))
	   ;; Make sure proper support is recorded
	   (add-to-role-fillers-table instance role filler nil justification))))
    filler ))

;;; Patch Loom4-0-31  7/12/00
;;; Make handle merged instances in the rete net.

(defun update-rete-match-network ()
  ;; *list-of-modified-rete-instances* lists instances that need to be
  ;;    rematched within the rete network, because their types
  ;;    have changed, and/or because the a slot update triggered
  ;;    a rete role bomb;
  ;; Note: When displaying changes to the rete match network, we defer
  ;;    printing a header until we are sure that at least one match has changed;
  ;; Kludge: We punt in the case that instances are incoherent -- they
  ;;    become unmatched everywhere in the net;
  (let ((*displayReteChangesP*
         (and (member :display-match-changes *loom-match-features*)
              (not (member :suppress-diehard-output *loom-dialogue-features*))
              :needs-header))
	previousInstance oldTypes newTypes)
    (declare (special *displayReteChangesP*))
    (loop for i in *list-of-modified-rete-instances*
	when (discarded-p i)  ; RMM 1/20/95
	do  (retract-discard-from-rete-network i t)
	else do
	     (when (classified-instance-p i)
	       (setq i (womp-merge-pointers i)))
	     (when (setq previousInstance (previous-instance i)) ; Do pathological case via change-class
	       (setq oldTypes (list-of (db-type previousInstance)))
	       ;; DOES THIS ALREADY FIND THE CONSEQUENT CONCEPT:???
	       (setq newTypes (values (get-cached-types i)))
	       (when (not (set-equal-p oldTypes newTypes))
		 (update-type-modified-rete-instance i oldTypes newTypes t))
	       (when (rete-role-bombs i)
		 (detonate-rete-role-bombs i previousInstance))))
    (setq *list-of-modified-rete-instances* nil) ))

;;; Patch Loom4-0-32  7/25/00
;;; Make the inheritance relation test also check the inverse.

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
	     (or (null (predicate-symbol (inheritance-link self)))
		 (null (inverse (inheritance-link self)))
		 (null (predicate-symbol (inverse (inheritance-link self))))))
    ;; Need to have sealed the predicate-symbol of the inheritance relation
    ;;  and its inverse                                   ; added TAR 7/25/00
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

;;; Patch Loom4-0-33  7/27/00
;;; Add missing method, make these methods actually do something.
;;; Make parsing more robust.

(defmethod feature-is-contradicted-p ((feature FILLED-BY-FEATURE) instance)
  ;; Return T if instance cannot have fillers of the type requested.
  (probe-not-filled-by-p 
   instance (relation feature)
   (role-fillers feature) (qualification feature)) )

(defmethod feature-is-contradicted-p ((feature NOT-FILLED-BY-FEATURE) instance)
  ;; Return T is instance has fillers in prohibited set.
  (probe-filled-by-p 
   instance (relation feature) (non-role-fillers feature)) )

(defun parse-expression (expression metaType)
  ;; Parse "expression" and return an expression wherein concept references
  ;;    have been replaced by classifiable objects;
  ;; Validate the syntax of "expression", and de-alias keywords;
  ;; Abort parsing if "expression" is found to be illegal;
  (declare (special *conceptBeingParsed*))
  (let (keyword)
    (cond
     ((consp expression)
      (if (quoted-p expression)        ; RMM 3/12/93
	  (if (eq metaType :concept)
	      `(:one-of ,expression)	; quoted constant
	    (parsing-error "Illegal relation expression: ~S" expression))
        (progn
          (setq keyword (validate-keyword (car expression)
                                          :non-keywords '(= < <= > >= /=)))
          (push-parser-context keyword)
          (setq expression (parse-clause keyword (cdr expression) metaType))
          (pop-parser-context)
          expression)))
     ((keywordp expression)
      (validate-keyword expression))
     ((symbolp expression)			; assumed to be a conjunct
      (evaluate-symbolic-reference expression metaType))
     ((or (typep expression 'TBOX-CONCEPT)
          (typep expression 'FEATURE))          ; RMM 1/28/94
      expression)
     (t					; constant, e.g., integer
      (if (eq metaType :concept)
	  `(:one-of ,expression)
	(parsing-error "Illegal relation expression: ~S" expression)))) ))

;;; Patch Loom4-0-34  7/28/00
;;; Fix confusion between interval arrays and strings.

(defun lower-bnd (segment)
  ;; Compute the lower-bound of the segment "segment";
  ;; Note:  We use a function here because a method is too slow;
   (cond
     ((extended-number-p segment) segment)
     ((stringp segment) segment)
     ((intervalp segment) (lower-open segment))
     ((symbolp segment) segment)
     (t (break) (car segment))) )

(defun upper-bnd (segment)
  ;; Compute the lower-bound of the segment "segment";
  ;; Note:  We use a function here because a method is too slow;
   (cond
     ((extended-number-p segment) segment)
     ((stringp segment) segment)
     ((intervalp segment) (upper-open segment))
     ((symbolp segment) segment)
     (t (break) (cdr segment))) )



(defun compute-intermediate-base-set (initialBaseSet members definingConcept)
  ;; Helping function for "create-set-feature";
  ;; Return two values:
  ;;    (1) The final value of the base set, or nil if the about-to-be-
  ;;        created set feature is its own base set;
  ;;    (2) The name of the class of the about-to-be-created set feature;
  ;; Side-effect: If not returning a nil base set, then remove :base-set
  ;;    attribute from "definingConcept", since it is not
  ;;    defining a pseudo-primitive set;
  ;; Note: Because the set of "members" has now been computed, this computation
  ;;    of a base set may determine a more specific base set than that
  ;;    computed by "compute-initial-base-set";
  ;; Note: The determination of the CLASS of the about-to-be-created
  ;;    set feature happens to be a by-product of the base set computations;
  ;;    otherwise we wouldn't do that here;
  (let (baseSetP orderedP constantP 
	quantitiesOnlyP numbersOnlyP integersOnlyP measuresOnlyP 
	symbolsOnlyP stringsOnlyP intermediateBaseSet)
    (flet ((compute-class-name ()
	     (cond (quantitiesOnlyP
		    'INTERVAL-FEATURE)
	           (orderedP			; must be symbolic interval
                    ;		(when (not symbolsOnlyP)
                    ;		  (conditioning-error "Illegal symbols in ordered set"))
		    'SYMBOLIC-INTERVAL)
	           (t				; only symbols or mixed set
		    'SET-FEATURE)))
	   (add-more-specific-conjunct

	     (concept conjunct)
	     (unless (loop for c in (conjuncts concept)
			  thereis (subconcept-p c conjunct))
	       (push conjunct (conjuncts concept))))	     )
      (when (and initialBaseSet
		 ;; set base-set equal to "initialBaseSet" if that one is
		 ;;    not a system-defined base set
		 (not (system-base-set-p initialBaseSet)))
	;; remove unwanted :base-set attributes from "definingConcept":
	(when (and definingConcept
		   (member :base-set (attributes definingConcept)))
	  (delf (attributes definingConcept) :base-set))
	(return-from compute-intermediate-base-set
	  (values
	    initialBaseSet
	    (CLOS::class-name (CLOS::class-of initialBaseSet))
	    nil)))
      (when (null members)
	(setq initialBaseSet (or initialBaseSet
				 (defined-set-feature (loom-constant CONSTANT))))
	(return-from compute-intermediate-base-set 
	  (values
	    initialBaseSet
	    (CLOS::class-name (CLOS::class-of initialBaseSet))
	    nil)))
      (cond
	((atom members))			; skip analysis if :infinite set
	((loop for m in members 
	     always (or (extended-number-p m)
			(and (intervalp m)
			     (not (stringp m)); intervalp test confuses strings & intervals (efficiency hack)

			     (or (extended-number-p (lower-open m))
				 (eq (lower-open m) '-INFINITY))
			     (or (extended-number-p (upper-open m))
				 (eq (upper-open m) '+INFINITY)))))
	 (setq quantitiesOnlyP t)
	 (setq numbersOnlyP t)   ; Temporary, may change in loop below
	 (setq measuresOnlyP t)  ; Temporary, may change in loop below
	 (loop for m in members
	     when (intervalp m)
	     do (cond ((eq (lower-open m) '-INFINITY) nil)
		      ((numberp (lower-open m)) (setq measuresOnlyP nil))
		      (t (setq numbersOnlyP nil)))
		(cond ((eq (upper-open m) 'INFINITY) nil)
		      ((numberp (upper-open m)) (setq measuresOnlyP nil))
		      (t (setq numbersOnlyP nil)))
	     else do (if (numberp m)
			 (setq measuresOnlyP nil)
		         (setq numbersOnlyP nil)))

	 (setq constantP t)
	 (setq orderedP t)
	 (when (loop for m in members always (integerP m))
	   (setq integersOnlyP t)))
	((loop for m in members always (or (symbolp m)
				      ;; MATCHES SYMBOLIC INTERVAL???:
					   (and (intervalp m)
						(not (stringp m)) ; intervalp test confuses strings & intervals (efficiency hack)
						(symbolp (lower-bnd m))
						(symbolp (upper-bnd m)))))
	 (setq constantP t)
	 (setq symbolsOnlyP t))
	((loop for m in members always (stringp m))
	 (setq constantP t)
	 (setq stringsOnlyP t)))
      (when definingConcept
	(setq baseSetP (member :base-set (attributes definingConcept)))
	(unless orderedP
	  (setq orderedP (member :ordered (attributes definingConcept))))
	(unless constantP
	  (setq constantP
	    (or baseSetP 
		orderedP
		(loop for c in (conjuncts definingConcept)
		    thereis (subconcept-p c (loom-constant CONSTANT))))))
	(cond
	  (constantP
	   (cond
	     (symbolsOnlyP
	      (add-more-specific-conjunct definingConcept (loom-constant SYMBOL)))
             (integersOnlyP             ;  TAR 3/21/96
              (add-more-specific-conjunct definingConcept (loom-constant INTEGER)))
	     (numbersOnlyP
	      (add-more-specific-conjunct definingConcept (loom-constant NUMBER)))
	     (measuresOnlyP
	      (add-more-specific-conjunct definingConcept (loom-constant MEASURE)))
	     (quantitiesOnlyP
	      (add-more-specific-conjunct definingConcept (loom-constant QUANTITY)))
	     (stringsOnlyP
	      (add-more-specific-conjunct definingConcept (loom-constant STRING)))))
	  ((atom members) )		       ; skip analysis if :infinite set
	  ((loop for m in members always (constant-p m))
	   (add-more-specific-conjunct definingConcept (loom-constant CONSTANT))))
	(when baseSetP
	  (return-from compute-intermediate-base-set
	    (values
	      nil
	      (compute-class-name)))))
      ;; compute the intermediate base set:
      (setq intermediateBaseSet
            (cond
	     (integersOnlyP (defined-set-feature (loom-constant INTEGER)))
	     (numbersOnlyP (defined-set-feature (loom-constant NUMBER)))
	     (measuresOnlyP (defined-set-feature (loom-constant MEASURE)))
	     (quantitiesOnlyP (defined-set-feature (loom-constant QUANTITY)))
	     (symbolsOnlyP (defined-set-feature (loom-constant SYMBOL)))
	     (stringsOnlyP (defined-set-feature (loom-constant STRING)))
	     (constantP (defined-set-feature (loom-constant CONSTANT)))
	     (t *allThings*)))
      (values
	(if (and initialBaseSet 
                 (subconcept-p initialBaseSet intermediateBaseSet))
          initialBaseSet
          intermediateBaseSet)
	(compute-class-name)) )))

;;; Patch Loom4-0-35  7/31/00
;;; Fix typo in error message.

(defun validate&expand-about-clause (clause)
  ;; Called by "validate-query";
  ;; "clause" is an expression beginning with the keyword :about;
  ;; Return a list of predicates representing the expansion of all the 
  ;;    :about clauses in "clause";
  ;; Expansion of an :about clause entails removal of the :about keyword
  ;;    and insertion of the subject into each predicate in the clause;
  ;; Non-lists (representing unary predicates) are converted into 
  ;;    singleton lists;
  ;; TO DO: UPGRADE TO PERMIT ARBITRARY CONCEPT EXPRESSIONS INSIDE OF
  ;;    :about INSTEAD OF JUST PREDICATE NAMES;
  (declare (special *validatingAssertionP*))    ; DGB 12/9/93
  (let ((subject (second clause))
	(subClauses (cddr clause)))
    (labels
      ((expand-about-description (description)
	 (let ((operator (validate-keyword (first description) :query-p t :no-error-p t)))
	   (if (keywordp operator)
	       (case operator
		 (:filled-by
		  (expand-filled-by-clause description))
		 (:not-filled-by
		  ;; TO DO: WE DON'T VALIDATE NON-FILLERS YET:
		  `(:not-filled-by
		     ,(second description)
		     ,@(cddr description)))
		 ((:at-least :at-most :exactly)
		  `(,operator ,subject
		    ,(second description)
		    ,(validate-predicate (third description) :relation 2)
		    ,@(when (fourth description)
			`(,(validate-predicate (fourth description) :concept 1)))))
		 ((:all :some)  ; :the handled as special case
		  `(,operator ,subject
		    ,(validate-predicate (second description) :relation 2)
		    ,(validate-predicate (third description) :concept 1)))
		 ((:same-as)  ;  :not-same-as
		  (if (boundp '*validatingAssertionP*)    ; DGB 12/9/93
		      `(:equivalent-roles
			,subject
			,(validate-predicate (second description) :relation 2)
			,(validate-predicate (third description) :relation 2))
		      `(,operator
			(,(validate-predicate (second description) :relation 2) ,subject)
			(,(validate-predicate (third description) :relation 2) ,subject))))
		 ((:and :or)
		  (form-query-error
		    "Use of ~S inside :about clause is not supported"
		    operator))
		 (:filled-by-list
		  (validate-filled-by-list description subject))
		 (:create
		  `(,operator ,subject
                              ,(when (second description) ; TAR 7/9/99
				 (validate-predicate (second description) :concept 1))
                              ,@(cddr description)))
		 ((:at-world-time :at-world-time+ :at-world-time- :at-agent-time
                                  :within-theory :within-world)
		  ;; TO DO: WE DON'T VALIDATE (OR SUBSTITUTE) FOR TEMPORAL ARGUMENT YET:
		  `(,operator ,(second description)
		    ,@(loop for desc in (cddr description)
			    when (world-time-transition-p (car desc))
			      collect `(,(car desc)
					,(expand-about-description (list-of (cadr desc))))
			    else 
			      collect (expand-about-description (list-of desc)))))
		 (:within-context
		  (form-query-error "The keyword :WITHIN-CONTEXT has been replaced by
the keywords :WITHIN-THEORY and :WITHIN-WORLD.  You will need to choose an appropriate
replacement.  For details, see the release notes."))
		 (otherwise
		  (form-query-error
		   "Illegal description inside of :about clause: ~S~
                    ~:[~%   ~S mapped to keyword ~S~;~2*~]"
		   description
		   (eq operator (first description))
		   (first description)
		   operator)))
               ;; not a keyword, so it must be a predicate:
	       (validate-formula
                `(,operator ,subject ,@(rest description)) :predicate))))
       (expand-filled-by-clause (clause)
	 ;; Return a list of predicates representing the expansion of "clause";
	 ;; Expansion entails removal of the :filled-by keyword and creation of a new
	 ;;    predicate for each role appearing in "clause";
	 (let ((role (second clause)))
	   `(:and ,@(loop for value in (cddr clause)
			 collect 
			 (validate-formula 
			   `(,role ,subject ,value) :predicate))))))
      (when (and (not (atom subject))
		 (cdr subClauses))
	;; warn if code replicates compound subject:
	(grumble "Generating non-optimal code for :about clause because query~%~
                  optimizer is not yet completed--Compound subject replicated."))
      (when subClauses				; DGB 3/6/92
	`(:and ,@(loop for desc = (list-of (pop subClauses))
                       while desc
                       when (eql (car desc) :the)
                         do (push `(:some ,@(cdr desc)) subClauses)
                            (push `(:all ,@(cdr desc)) subClauses)
                            (push `(:at-most 1 ,(second desc)) subClauses)
		     else collect (expand-about-description desc)))) )))

;;; Patch Loom4-0-36  9/6/00
;;; Make this work when an N-ary tuple has a functional term as an argument.

(defun form-existential-query (existentialVariables existentialClause)
  ;; Return a form corresponding to "existentialClause", which is a
  ;;    clause headed by an :exists operator;
  ;; This function builds nested generators and filters in the same
  ;;    manner as "form-collection-query";
  (let ((*newExistentialNames* nil))    ; TAR 12/31/96
    (declare (special *newExistentialNames*))
    ;; We need to handle potentially nested existential clauses here:
    (setq existentialClause
          (eliminate-top-level-existentials existentialClause
                                            :collect-new-names-p t))
    (loop for item in *newExistentialNames*
	do (push (first item) existentialVariables))
    (let* ((generatorSequence
	    (compute-optimal-generator-sequence 
	     existentialClause existentialVariables existentialVariables))
	   (remainingGeneratorVars 
	    (loop for pair in generatorSequence collect (car pair)))
	   (remainingNonGenExistentials
	    (set-difference existentialVariables remainingGeneratorVars)))
      (labels ((form-tuple-scan-query-body (iterationVariable generatorEntry subQuery)
		 (let ((candidateGeneratorVars 
			(cons iterationVariable remainingNonGenExistentials))
		       (tupleVars (rest (generator-term generatorEntry)))
		       filterQuery residueQuery)
		   (setq remainingNonGenExistentials
		     (set-difference remainingNonGenExistentials tupleVars))
		   (multiple-value-setq (filterQuery residueQuery remainingNonGenExistentials)
		     (extract-filter-query 
		      subQuery remainingGeneratorVars remainingNonGenExistentials))
		   (if residueQuery
		       (form-tuple-scan-layer 
			generatorEntry candidateGeneratorVars filterQuery
			(help-form-existential-query residueQuery))
		     (let (*outerCodeLayers* innerCode)
		       (declare (special *outerCodeLayers*))
		       (setq innerCode
			 (help-form-tuple-scan-layer generatorEntry
						     candidateGeneratorVars
						     filterQuery
						     'return t)) ; was 'collect iterationVariable ; TAR 2/13/96
		       (if (null *outerCodeLayers*)
			   innerCode
			 (subst innerCode 'DUMMYBODY *outerCodeLayers*)) )
		     )))
	       (help-form-existential-query (subQuery)
		 (let* ((iterationVariable (pop remainingGeneratorVars))
			(generatorEntry (cdr (pop generatorSequence)))
			filterCode) 
		   (when (eq (generator-type generatorEntry) :scanned-tuple-relation)
		     (return-from help-form-existential-query
		       (form-tuple-scan-query-body
			iterationVariable generatorEntry subQuery)))
		   (multiple-value-bind (generatorCode duplicateFreeP singleValueP)
		       (form-generator-code iterationVariable generatorEntry)
		     (declare (ignore duplicateFreeP))
		     (multiple-value-bind (filterQuery residueQuery)
			 (extract-filter-query subQuery remainingGeneratorVars nil)
		       (when filterQuery 
			 (setq filterCode (form-boolean-query filterQuery)))
		       (cond 
			(residueQuery
			 (form-layer-of-query
			  iterationVariable
			  generatorCode
			  singleValueP
			  (if filterCode ; tar 9/22/92
			      `(and ,filterCode
				    ,(help-form-existential-query residueQuery))
			    (help-form-existential-query residueQuery))
			  'thereis))
			(filterCode
			 (form-layer-of-query iterationVariable generatorCode
					      singleValueP filterCode 'thereis))
			(t 
			 generatorCode)))))))
	(multiple-value-bind (filterQuery residueQuery) ;  TAR 6/20/95
	    (extract-filter-query existentialClause
				  remainingGeneratorVars
				  remainingNonGenExistentials) ; TAR 2/13/96
	  (if filterQuery 
	      (let ((filterCode (form-boolean-query filterQuery)))
		(if filterCode		; tar 9/22/92
		    `(and ,filterCode
			  ,(help-form-existential-query residueQuery))
		  (help-form-existential-query residueQuery)) )
	    (help-form-existential-query existentialClause)) ) ))))

;;; Patch Loom4-0-37  9/26/00
;;; Improve efficiency of this routine.

(defun permute (list)
  ;; Returns permutations of "list" without accounting for duplicate values;
  (if (cdr list)
    (if (cddr list)
      (let ((first (first list))
	    (result nil)
	    (len (length list)))
	(loop for sl in (permute (rest list))
              do (loop for i from 0 below len
	               as tail on sl by #'cdr
	               do (push (nconc (subseq sl 0 i) (cons first tail))
				result)
		       finally (push (append sl (list first)) result)))
	result)
      ;; Special case for length 2 lists:
      (list list (reverse list)))
    (list list)) )

;;; Patch Loom4-0-38  10/6/00
;;; Fix some problems handling incoherent (skolem) instances in merges

(defun compute-more-specific-type (instance &key backward-chaining-p)
  ;; Compute the concept representing the "most-specific-generalization" 
  ;;    of "instance";
  ;; If there are multiple concepts in the MSG, return a new concept defined as
  ;;    the intersection of those concepts (unless "backward-chaining-p" is set);
  ;; Side-effect: During the type computation, any calls to a disjointness
  ;;    computation that would require recursive invocation of the classifier
  ;;    are abbreviated;  Pairs of concepts representing untried disjointness
  ;;    tests are pushed onto *untriedDisjointnessTests*;  The tests are
  ;;    queried at the end of this function and the results are cached, insuring
  ;;    that the tests will be valid the next time through the matcher;
  ;; Note:  The starting type is computed by combining both the current type and
  ;;     the conjuncts (forward-propagation could have created conjuncts not
  ;;     specialized by the current type);  "conjuncts" appear at the end of the
  ;;     list to exploit the possibility that they will all be marked as "visited"
  ;;     when they are encountered inside of "set-up-classification-flags";
  (let* ((oldType (db-type instance))
	 (copyOfParents (list oldType))
	 newTypeList)
    (when (test-bit-flags (db-attributes instance) :db-instance :incoherent)  ;; TAR 10/6/00
      (return-from compute-more-specific-type (list-of oldType)))
    (integrity-check (atom oldType))  ;; TAR 10/6/00
    (loop for entry in (conjuncts-table instance)
	as consequent = (consequent-concept (car entry))
	unless (subconcept-p oldType consequent)
	do (push consequent copyOfParents))
    (set-up-classification-flags instance copyOfParents)
    (let ((*matchBackwardChainingConceptsP* backward-chaining-p)
	  (*untriedDisjointnessTests* nil))
      (declare (special *matchBackwardChainingConceptsP*
			*untriedDisjointnessTests*))
      (setq newTypeList (classify-below instance copyOfParents
					(compute-starting-points instance)
					:compute-msg-only-p t))
      ;; replace concepts by their consequents:
      (loop for tail on newTypeList
	   do (setf (car tail) (consequent-concept (car tail))))
      (setq newTypeList (most-specific-concepts newTypeList :destructive-p t))
      (loop for pair in *untriedDisjointnessTests*
	   do (disjoint-concepts-p (car pair) (cdr pair)))
      (when (and (modification-summary instance)
		 (retry-search-for-disjuncts (modification-summary instance)))
	(setq newTypeList (fold-in-unique-disjuncts instance newTypeList)))
      (if backward-chaining-p
	  newTypeList
	(compute-unified-type newTypeList (intrinsic-concept instance)))) ))


(defun compute-rock-bottom-type (instance &key side-effect-free-p)
  ;; Called by "recompute-retracted-instance-type-p",
  ;;    "compute-never-before-matched-instance-type", and
  ;;    "find-type&residue-features";
  ;; Return the rock-bottom TYPE of "instance";
  ;; If the rock-bottom TYPE is equivalent to "(db-type instance)",
  ;;    return the latter, so an "eq" test can determine equivalence;
  ;; Cache the result in the modification summary for "instance";
  ;; Also, withdraw ALL implied role fillers (survivors get recomputed
  ;;    later on in "recompute-individual-type");
  ;; CONSIDER DOING EVEN MORE COMPUTING HERE, CLASSIFYING USING FEATURES
  ;;    AS WELL AS CONJUNCTS (NOTE: WE ALREADY USE ASSERTED FEATURES -- DO
  ;;    THE OTHERS CONTRIBUTE INITIALLY??);
  (let ((modificationSummary (modification-summary instance))
        rockBottomTypeList)
    ;; compute conjuncts contributing to "rockBottomTypeList":
    (loop for entry in (conjuncts-table instance)
	 do
	 (let ((supportRecord (cdr entry)))
	   (when (or (assertion-p supportRecord)
		     (plusp (domain/range-count supportRecord)))
	     (push (consequent-concept (car entry)) rockBottomTypeList)))) 
    (when (test-bit-flags (db-attributes instance) :db-instance :incoherent)
;;; WE NO LONGER POST TO THE RETRACTION QUEUE A SECOND TIME:  RMM 3/4/94
;      (when (and modificationSummary		; null if recognizer is disabled
;		 (eq (retraction-message modificationSummary) :detect-incoherence))
;	;; if incoherent for the second time, make quick exit
;	(return-from compute-rock-bottom-type rockBottomTypeList))
      (setq rockBottomTypeList
	    (delete (loom-constant INCOHERENT) rockBottomTypeList))
      (unless side-effect-free-p
	(clear-bit-flags (db-attributes instance) :db-instance :incoherent)
	(retract-conjunct instance (loom-constant INCOHERENT) :retraction)
	(when (get-slot-values instance (loom-constant INCOHERENCE-REASON))
	  (set-slot-values instance (loom-constant INCOHERENCE-REASON) nil))
	;; force call to "detect-incoherence" even if type doesn't change:
	(unless side-effect-free-p	;; TAR 10/6/00
	  (setf (retraction-message modificationSummary) :detect-incoherence))))
    (when (null rockBottomTypeList)
      (setq rockBottomTypeList (list *Thing*)))
    (setq rockBottomTypeList 
	  (most-specific-conjuncts 
	    (most-specific-concepts rockBottomTypeList :destructive-p t)
	    :destructive-p t))
    (loop for tail on rockBottomTypeList
	 do (setf (car tail) (consequent-concept (car tail))))
    (unless side-effect-free-p
      (setf (rock-bottom-p modificationSummary) t))
    (setq rockBottomTypeList
      (compute-unified-type rockBottomTypeList (intrinsic-concept instance)))
    rockBottomTypeList ))

(defun process-default-assertion-queue (queue)
  ;; Situation: "queue" contains a list of all instances which
  ;;    MAY have defaults that can be activated;
  ;; Activate defaults attached to instances in "queue" which
  ;;    don't conflict with existing truth values;
  ;; Note: The slots "active-default-concepts" and "inactive-defaults"
  ;;    are used only within this function;  The slot "active-default-features"
  ;;    is also used by "compute-residue-features-p";
  (let (modificationSummary repostToSameQueueP defaults)
    (flet ((collect-default-rules (instance)
	     (let ((type (db-type instance))
		   newDefaults)
	       (integrity-check (atom type))                ; TAR 2/7/95
	       (loop for default in (default-features type)
		    unless
		    (or (member default (active-default-features modificationSummary))
			(member default (inactive-defaults modificationSummary)))
		    do
		    (if (detect-default-conflict-p default instance)
			(push default (inactive-defaults modificationSummary))
			(progn
			  (push default (active-default-features modificationSummary))
			  (push default newDefaults))))
	       (loop for default in (default-concepts type)
		    unless
		    (or (member default (active-default-concepts modificationSummary))
			(member default (inactive-defaults modificationSummary)))
		    do
		    (if (detect-default-conflict-p default instance)
			(push default (inactive-defaults modificationSummary))
			(progn
			  (push default (active-default-concepts modificationSummary))
			  (push default newDefaults))))
	       newDefaults)))
    (loop for instance in queue
	 when
	 (and (setq modificationSummary (modification-summary instance))
	      (eql (queue-level modificationSummary) $DEFAULT-ASSERTION-Q$))
	 do
	 (cond
	   ((or (test-bit-flags (db-attributes instance) :db-instance :incoherent) ;; TAR 10/6/00
		(incoherent-instance-p instance))
	    (abandon-recognizing-incoherent-instance instance))
	   ((not (or (features-analyzed-p modificationSummary)
		     (analyze-features-p instance $DEFAULT-ASSERTION-Q$)))
	    ;; "instance" is skipping rematch at all queue levels:
	    (unpost-instance instance))
	   (t (when (setq defaults (collect-default-rules instance))
		(setq defaults (filter-instance-default-fillers-for-number-restrictions 
				instance defaults))   ; TAR 2/16/00
		(loop for default in defaults
		     do (apply-default default instance)))
	      (setq repostToSameQueueP
		    (recompute-asserted-instance-type-p instance))
	       ;; Could have become incoherent during recomputation of type.
	      (when (incoherent-instance-p instance)
		(abandon-recognizing-incoherent-instance instance)
		(return-from process-default-assertion-queue nil))
	      (when (null repostToSameQueueP)
		;; we are leaving the default assertion queue -- replant
		;;    bombs on default hits and misses;
		(loop for f in (default-feature-hits modificationSummary)
		     do (monitor-feature instance f t))
		(loop for f in (default-feature-misses modificationSummary)
		     do (monitor-feature instance f t))
		(setf (default-feature-hits modificationSummary) nil)
		(setf (default-feature-misses modificationSummary) nil))		 
	      (cond
		(repostToSameQueueP
		 (repost-instance
		   instance $DEFAULT-ASSERTION-Q$ modificationSummary))
		((incoherent-instance-p instance)
		 (abandon-recognizing-incoherent-instance instance))
		((neq (original-type modificationSummary) (db-type instance))
		 (detonate-type-bombs-on-new-conjuncts
		   instance (db-type instance) (strict-db-type instance))
		 (repost-instance instance $ACT-ON-Q$ modificationSummary))
		(t
		 ;; for checking detonation, catch possibility that type of "instance" has
		 ;;    not changed, but probe made by another instance failed, and hence
		 ;;    bomb was attached to "instance" in the middle of the match cycle:
		 (detonate-type-bombs-on-new-conjuncts
		   instance (db-type instance) (strict-db-type instance))
		 (unpost-instance instance)))))) )))

;;; Patch Loom4-0-39  10/11/00
;;;  Added quotes to names of relations in THE-RELATION forms

(defun generate-relation-reification-annotations (reificationConcept)
  ;; Returns: (1) Annotations for the relation clause
  ;;          (2) Annotations for the inverse relation clause
  ;; TO DO:  SHOULD CASE-ROLE NAMES INHERIT FROM SUPERS?
  (let* ((reifiesClause (getf (rest (first (source-definitions reificationConcept)))
                              :reifies))
         (caseRoles (or (and (consp reifiesClause)
                             (getf (rest reifiesClause) :case-roles))
                        '(source-case target-case)))
         (inverseClause (and (consp reifiesClause) 
                             (getf (rest reifiesClause) :inverse)))
         (inverseCaseRoles (and inverseClause
                                (or (and (consp inverseClause)
                                         (getf (rest inverseClause) :case-roles))
                                    '(target-case source-case))))
         (*conceptBeingParsed* reificationConcept))
    (declare (special *conceptBeingParsed*))

    (when (and inverseClause
               (or (neq (first caseRoles) (second inverseCaseRoles))
                   (neq (second caseRoles) (first inverseCaseRoles))))
      (parsing-error   ;; ZZZ IS THIS A DIFFERENT KIND OF ERROR?
       "Inverse :CASE-ROLES must be the opposite of forward relation :CASE-ROLES"))
    (values `((reified-by (the-relation ',(name reificationConcept) 1))
              (source-role (the-relation ',(first caseRoles) 2))
              (target-role (the-relation ',(second caseRoles) 2)))
            (and inverseClause
                 `((reified-by (the-relation ',(name reificationConcept) 1))
                   (source-role (the-relation ',(first inverseCaseRoles) 2))
                   (target-role (the-relation ',(second inverseCaseRoles) 2))))
            ) ))

;;; Patch Loom4-0-40  10/11/00
;;; Extend Reification Support

;; New relation & property definition added in patch #4 above


(defun condition-conjuncts (self)
  ;; Replace "(conjuncts self)" by only the most specific
  ;;    of them;
  ;; Next, set "(super-concepts self)" to the most-specific
  ;;    conjuncts that we can find in the network (this represents
  ;;    a "pre-classify" step)
  ;; This also conditions disjunctive-features of "self",
  ;;    which may result in replacing some conjuncts by more specific concepts;
  ;; Also, detect presence of a purely conjunctive concept (to be used by
  ;;    "most-specific-conjuncts")
  ;; TO DO: CONSIDER REMOVING THE REMARKED-ABOUT CODE;
  (declare (special *definitionHasChanged*))
  (let* ((newConjuncts (conjuncts self))
	 (oldLength (length newConjuncts))
	 invokedCancellationP)
    (when (concept-is-new-style-reification-p self)   ;  TAR 10/11/2000
      (pushnew (loom-constant REIFICATION) newConjuncts))
    (setq newConjuncts
	  (most-specific-concepts newConjuncts))
    (setf (conjuncts self) newConjuncts)
    ;; CONSIDER OMITTING THIS:
    (when (not (= (length newConjuncts) oldLength))	; this is a heuristic detection
      (setq *definitionHasChanged* t))
    (setq newConjuncts (most-specific-conjuncts newConjuncts))
    ;; inherit disjunctive-features
    (setf (disjunctive-features self)
          (compute-disjunctive-features self newConjuncts))
    (when (and (cdr newConjuncts)
	       (disjunctive-features self)
	       (not (defined-as self))
	       ; (not (member :temporary (system-attributes self)))
	       )
      ;; cancel-disjuncts may not be necessary,
      ;; and is not reliable when self is a disjunction
      ;; cancel-disjuncts may modify (disjunctive-features self)
      (setq newConjuncts (cancel-disjuncts self newConjuncts))
      (setq invokedCancellationP t))
    #L:trace-cond (trace-values "condition-conjuncts" self newConjuncts)
    (setf (super-concepts self) newConjuncts)
    ;; add dependency links for more specific conjuncts:
    (loop for super in newConjuncts
	 do (add-link depend-ons self super))
    ;; take this opportunity to inherit negated concepts:
    (inherit-negated-concepts self)
    ;; follow merge pointers for any previous pure-conjunction-p values:
    (when (pure-conjunction-p self)
      (follow-pure-conjunction-pointers self))
    (when (concept-is-a-pure-conjunction self)
      (when (and (null (cdr newConjuncts))
		 (not (member :being-reclassified-copy (system-attributes self))))
	;; self should merge with single conjunct,
	;; bypassing the remainder of conditioning and classification
	(when invokedCancellationP
	  ;; tricky: "most-specific-conjuncts" failed to find a unique conjunction, but
	  ;;    "cancel-disjuncts" DID find a unique conjunction, so we need to update
	  ;;    the "pure-conjunction-p" index before merging:
	  (pushnew (conjuncts self) (pure-conjunction-p self) :test #'set-equal-p))
	(merge-with-classified-concept self (car newConjuncts))
	(post-classify-concept (car newConjuncts) t)
	(throw 'condition-concept-catcher :already-classified))
      (pushnew (conjuncts self) (pure-conjunction-p self) :test #'set-equal-p)) ))


(defun find-reification-relation (concept inverseP)
  ;; Returns the name of the reification relation on "concept".
  ;; If "inverseP" is non-NIL, then the inverse relation is returned.
  ;; Helping function for 'filter-new-reified-expression' and
  ;;   'condition-restrictions'.
  (if (eq concept :primitive)
      nil
    (let ((reifiesClause (getf (rest (first (source-definitions concept)))
			       :reifies))
	  inverseClause)
      (if inverseP
	  (progn 
	    (setq inverseClause (and (consp reifiesClause)
				     (getf (rest reifiesClause) :inverse)))
	    (if (atom inverseClause)
		inverseClause		; NIL or a name
	      (first inverseClause)))                     
	(if (atom reifiesClause)
	    reifiesClause
	  (first reifiesClause)))) ))

(defun condition-restrictions (concept comparisons tbox/cbox)
  ;; Return two values:
  ;;    (1) a list of classified restrictions
  ;;    (2) a list of (possibly augmented) classified comparisons;
  (let (*relation/restrictionsTable* *listOfLocalRestrictions*
	*restrictionEquivalenceSets* *newEquivalences*)
    (declare (special *relation/restrictionsTable* *listOfLocalRestrictions*
		      *restrictionEquivalenceSets* *newEquivalences*))
    (when (and (eq tbox/cbox :tbox)	;  TAR 10/11/2000
	       (concept-is-new-style-reification-p concept))
      (pushnew `(:filled-by ,(loom-constant REIFICATION-RELATION)
			    ,(evaluate-symbolic-reference 
			      (find-reification-relation concept nil)
			      :relation))
		 (restrictions concept)))

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

(defun create-reification (relation source target)
  "Returns a reification for (RELATION SOURCE TARGET) if a reification concept
has been defined for RELATION.  If such a reification already exists, it is returned,
otherwise a new one is created."
  (let ((?reification (get-value relation 'reified-by)))
    (flet ((create-link (?relation ?source ?target)
	     (let* ((?sourceCase (fget-value ?relation 'source-role))
		    (?targetCase (fget-value ?relation 'target-role))
		    (?aLink (create nil ?reification :creation-policy :lite-instance)))
	       (tell (?targetCase ?aLink ?target)
		     (?sourceCase ?aLink ?source)
		     (reification-relation ?aLink ?relation)  ;; TAR 10/11/2000
		     )
	       (store-link ?relation ?source ?target ?aLink)
	       ?aLink)))
      (when ?reification
	(or (lookup-link relation source target)
	    (create-link relation source target))) )))

(export 'create-reification)

(defun get-link (relation source sink)
  (declare (special *InsideQueryP*))
  (if *InsideQueryP*
      (lookup-link relation source sink)    ; Queries don't create links!
    (create-reification relation source sink)) )

(defun reification-holds (?link-object)	; TAR 10/11/2000
  (let* ((?relation (runtime-fget-value ?link-object 'reification-relation))
	 (?source   (runtime-fget-value ?relation 'source-role))
	 (?sink     (runtime-fget-value ?relation 'target-role)))
    (and ?relation
	 ?source
	 ?sink
	 (ask (?relation (?source ?link-object) (?sink ?link-object)))) ))



;;; Patch Loom4-0-41  11/1/00
;;; Make save-context work for n-ary relations.

(defun help-save-one-context (context rename rename-package outputStream
			      listOfRelations listOfConcepts
			      listOfBehaviors listOfInstances)
  ;; Write out the specified objects in "context" to "outputStream";
  (let ((conceptCount 0))               ; Limit size of eval-when to 100 items
    (labels ((write-source-definition (concept)
               #+:CLTL2(let ((*print-readably* nil))
                         (inform "~%~S" concept))
               #-:CLTL2(inform "~%~S" concept)
               (loop for def in (generate-source-definition
                                 concept :list-p t :source-context *context*)
                     do (print-concept-definition 
                         def :outputStream outputStream :newline t))
               (incf conceptCount)
               (when (zerop (mod conceptCount 100))     ;  TAR 12/20/93
                 #+:ISI (inform " \\")
                 (write-eval-when-ending (floor conceptCount 100))
                 (write-eval-when-beginning (1+ (floor conceptCount 100)))))
             (write-eval-when-beginning (n)     ;  TAR 12/20/93
               (format outputStream "~&(~(~S~) #+:CLTL2 ~S  ; EVAL-WHEN ~D~%~10T#-:CLTL2~S~%"
                       'eval-when
                       '(:execute :load-toplevel :compile-toplevel)
                       n
                       '(load eval compile)))
             (write-eval-when-ending (n)        ;  TAR 12/20/93
               (format outputStream "~%)    ; END EVAL-WHEN ~D~2%" n)))
      (change-context context) ;TAR 3/10/93  Original value preserved by caller
      (write-eval-when-beginning 0)
      (format outputStream "(~(~S~) '~:[~S~;~:*~A~*~])~%"
	      'change-context rename (name context))
      (format outputStream "(~(~S~) savedCreationPolicy ~(~S~))~%"
              'setf '(creation-policy))
      (format outputStream "(~(~S~) ~S)~2%" 'creation-policy (creation-policy))
      (write-eval-when-ending 0)
      (when (or listOfConcepts listOfRelations)
	(format outputStream ";;; Terminological Definitions:~2%")
        (write-eval-when-beginning 1)
	(loop for concept in listOfRelations
	    do (write-source-definition concept))
        (loop for concept in listOfConcepts
	    do (write-source-definition concept))
	(loop with defn
	    for instance in listOfInstances
	    when (typep instance 'proposition)
	    do (when (setq defn (generate-source-definition instance))
		 (pprint defn outputStream)))


        (format outputStream "~2%(~(~S~))"
                'finalize-definitions)
        (write-eval-when-ending (1+ (floor conceptCount 100))))
      (when listOfBehaviors
	(format outputStream ";;; Behaviors (Productions, Actions, Methods):~2%")
	(loop for behavior in listOfBehaviors
            do #+:CLTL2(let ((*print-readably* nil))
                         (inform "~%~S" behavior))
            #-:CLTL2(inform "~%~S" behavior)
            (pprint (generate-object-definition behavior) outputStream))
        (format outputStream "~2%"))
      (let ((*anonymousClosIdentifierAlist* nil)
            (*namedClosInstances* nil))
        (declare (special *anonymousClosIdentifierAlist*
                          *namedClosInstances*))
        (let ((tellForms (loop for instance in listOfInstances
			     unless (or (discarded-p instance)
					(typep instance 'proposition))
                               do #+:CLTL2(let ((*print-readably* nil))
                                            (inform "~%~S" instance))
                               #-:CLTL2(inform "~%~S" instance)
                               and collect (generate-instance-definition
                                            instance nil)
			     ;; and append (generate-role-filler-forms instance)
				 )))
	  (setq *namedClosInstances*
		(sort *namedClosInstances* #'string-lessp
		      :key #'(lambda (x) (symbol-name (cdr x)))))
	  (setq *anonymousClosIdentifierAlist*
		(sort *anonymousClosIdentifierAlist* #'string-lessp
		      :key #'(lambda (x) (symbol-name (cdr x)))))
	  (format outputStream ";;; Instance Creation:~2%")
          (loop for form in (generate-named-clos-instances)
                do (pprint form outputStream))
          (format outputStream "~2&;;; Instance Assertions:~%")
          (if *anonymousClosIdentifierAlist*
            (pprint `(let ,(generate-anonymous-clos-instances)
                       ,@(delete-if-not #'cdr tellForms)) ; Suppress empty TELLs
                    outputStream)
            (loop for form in tellForms
                  when (cdr form)       ; Suppress empty TELLs
                  do (pprint form outputStream))) )
        (when listOfInstances
          (format outputStream "~2%"))
        ;; Save concept and relation annotations:
        (loop for concept in listOfRelations
              as attributes = (generate-instance-attributes
                               concept
                               (generate-instance-identifier concept nil)
                               nil)
              when attributes
              do #+:CLTL2(let ((*print-readably* nil))
                           (inform "~%~S" concept))
              #-:CLTL2(inform "~%~S" concept)
              (pprint `(tell ,@attributes) outputStream))
	(loop for concept in listOfConcepts
              as attributes = (generate-instance-attributes
                               concept
                               (generate-instance-identifier concept nil)
                               nil)
              when attributes
              do #+:CLTL2(let ((*print-readably* nil))
                           (inform "~%~S" concept))
              #-:CLTL2(inform "~%~S" concept)
              (pprint `(tell ,@attributes) outputStream))
        ;; Save N-Ary relation values:
        (loop for relation in listOfRelations   ;  TAR 4/18/96
              when (> (arity relation) 2)
              do #+:CLTL2(let ((*print-readably* nil))
                           (inform "~%~S" relation))
                 #-:CLTL2(inform "~%~S" relation)
                 (loop for tuple in (list-tuples relation)
		     do (pprint `(tell (,(name relation)
					,@(mapcar #'generate-filler tuple)))
				outputStream)
			))

	;; Save Role Facet Information:
	;;; TO DO: POSSIBLY ELIMINATE REDUNDANT FACETS
	
	;; Sometimes concepts and relations are listed together in
	;;  "listOfRelations", e.g., when sorted in :as-defined order!
	(format outputStream "~2%;;; Facet Assertions:~%")
	(loop for concept in listOfRelations
	    do (loop for role in (roles concept)
		   do (loop for form in (generate-role-filler-forms role)
			  do (pprint form outputStream))))
	
	(loop for concept in listOfConcepts
	    do (loop for role in (roles concept)
		   do (loop for form in (generate-role-filler-forms role)
			  do (pprint form outputStream))))
	

	;; Save this context annotations:  ; TAR 7/11/96
	#||  ;; THIS IS CODE TO USE IF CONTEXTS BECOME CONTEXT SENSITIVE:
	(loop for c in (list-contexts)
	      as cRef = (generate-filler c)
	      as dynamicConcepts = (dynamically-asserted-conjuncts c)
	      as roleFillers = (generate-role-filler-forms c)
	      when (or dynamicConcepts roleFillers)
	        do #+:CLTL2(let ((*print-readably* nil))
                              (inform "~%~S" c))
                   #-:CLTL2(inform "~%~S" c)
		   (loop for concept in dynamicConcepts
		         do (pprint `(add-type ,cRef ,(generate-filler concept))
			  	    outputStream))
	           (loop for f in roleFillers
			 do (pprint f outputStream)))
	||#
	;; ... in the meantime just save this context's annotations:
	#+:CLTL2(let ((*print-readably* nil)) (inform "~%~S" context))
	#-:CLTL2(inform "~%~S" context)
	(format outputStream "~2&;;; Context Assertions:~2%")
	(let ((cRef (generate-filler context)))
	  (when rename
	    (setq cRef (subst rename (name context) cRef)))
	  (loop for concept in (dynamically-asserted-conjuncts context)
	        do (pprint `(add-type ,cRef ,(generate-filler concept))
			   outputStream))
	  (loop for f in (generate-role-filler-forms context)
	      when rename
	      do (if (and rename-package 
			  (equal (third f) ''background-package-name))
		     (pprint `(set-value
			       ,cRef 'background-package-name ,rename-package)
			     outputStream)
		   (pprint `(,(first f) ,cRef ,@(cddr f)) outputStream))
	      else do (pprint f outputStream)) )
	  )
      (format outputStream "~2%;;;  END OF DATA~2%(~(~S~) savedCreationPolicy)~%"
              'creation-policy) )))

;;; Patch Loom4-0-42  1/4/01
;;; Fixed this to be able to find consequents of relations

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
	       (pushnew dep dependents)))
	   (get-consequents (self)
	     ;; Consequents are not stored for Relations, but
	     ;;   we can find them by looking at non-tbox dependents
	     ;;   and checking to see if self is in their antecedents
	     ;;   list:
	     (typecase self
	       (TBOX-RELATION
		(loop for dep in (non-tbox-dependents self)
		    when (member self (antecedents dep))
		    collect dep))
	       (t (consequents self)))))
      
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
      (loop for con in (get-consequents self)
	  do (push-dependent con)
	     (loop for superOfCon in (super-concepts con)
		 unless (subconcept-p self superOfCon)
		 do (push-dependent superOfCon)))
      dependents )))

;;; Patch Loom4-0-43  2/16/01
;;; Fix obscure problem with incoherence detection when :clip-roles is
;;;   disabled and :single-valued roles are used

(defun collect-all-role-fillers (instance role &optional qualification)
  ;; Return the set of fillers of "role" and its "subOrSuper" roles
  ;;    in "instance", with duplicates removed;
  ;; TO DO: TRY TO PLACE THE "list-of" CALL INSIDE OF "form-n-ary-generator";
  ;; QUESTION: SHOULD THIS FUNCTION CALL "get-set-in-*world*"???;
  (let ((fillers (if (default-mode-p)                  ; RMM 3/9/93
                   (get-temporally-offset-set-of-instances
                    (run-time-call-role role instance t))
                   (execute-query
                    (run-time-call-role role instance t))))
	slotFillers)
    ;; Icky, but necessary to handle the pathological case of
    ;;  :single-valued roles with role clipping disabled which
    ;;  have multiple asserted fillers.
    (when (and (role-is-single-valued-p role)  ; TAR 2/16/01
	       (rest (setq slotFillers (get-slot-values instance role))))
      (loop for direct-filler in slotFillers
	  do (pushnew direct-filler fillers :test #'filler-equal)))
    (if qualification
      (loop for f in fillers
            when (has-instance-p qualification f)
            collect f)
      fillers) ))

(defun collect-all-role-fillers-with-duplicates (instance role)
  ;; Return the set of fillers of "role" and its "subOrSuper" roles
  ;;    in "instance", WITHOUT removing duplicates;
  ;; QUESTION: SHOULD THIS FUNCTION CALL "get-set-in-*world*"???
  (let ((fillers (if (default-mode-p)	; RMM 3/9/93
		     (get-temporally-offset-set-of-instances
		      (run-time-call-role role instance nil))
		   (execute-query
		    (run-time-call-role role instance nil))))
	slotFillers)
    (if (and (role-is-single-valued-p role) ; TAR 2/16/01
	       (rest (setq slotFillers (get-slot-values instance role))))
	(append slotFillers fillers)
      fillers) ))

(defun feature-is-really-violated-p (feature instance)
  ;; The slot violated features was created to detect "implicit" 
  ;;    features missed by regular incoherence checking;
  ;; Currently, we only log max-1 violations and value restrictions;
  ;; Here, we double check that the implicit max-1 restriction is 
  ;;    still in force, or that the violated feature hasn't disappeared
  ;;    from the instance's type;
  (ecase (feature-type feature)
    (:max-restriction
     (or (role-is-single-valued-p (relation feature))
         (role-has-upper-bound-restriction-p
          instance (relation feature) (upper-bound feature))))
    (:value-restriction
     (multiple-value-bind (type residueFeatures)
                          (find-type&residue-features instance)

       (or (if (consp type)		; TAR 2/16/01
	       (loop for c in type
		   thereis (member feature (implied-restrictions c)))
	     (member feature (implied-restrictions type)))
           (member feature residueFeatures))))) )

;;; Patch Loom4-0-44  2/20/01
;;; This broke when given a feature that didn't have a relation slot
;;;   (like :same-as ...)

(defun explain-feature-contradiction (instance concept feature)
  (let (closedSetP queryFillers)
    #-:MCL(declare (ignore  closedSetP))
    #+:MCL(declare (ignorable  closedSetP))
    (cons `(:has-feature ,concept ,feature)
	  (typecase feature
	    (VALUE-RESTRICTION
	     (multiple-value-setq (closedSetP queryFillers)
	       (collect-subsuming-set-of-fillers-p instance
						   (relation feature)
						   (qualification feature)))
	     (loop for f in queryFillers
		 when (not-has-instance-p (value-restriction feature) f)
		 return `((:fills-role-domain ,instance ,(relation feature) ,f)
			  (:isnta ,f ,(generate-reference-definition
				       (value-restriction feature))))))
	    (MIN-RESTRICTION
	     (multiple-value-setq (closedSetP queryFillers)
	       (collect-subsuming-set-of-fillers-p instance
						   (relation feature)
						   (qualification feature)))
	     (if (< (length queryFillers) (upper-bound feature))
		 (loop for f in queryFillers
		     collect `(:fills-role-domain ,instance ,(relation feature) ,f))
	       '((:sorry))))
	    (MAX-RESTRICTION
	     (multiple-value-setq (closedSetP queryFillers)
	       (collect-subsuming-set-of-fillers-p instance
						   (relation feature)
						   (qualification feature)))
	     (if (> (length queryFillers) (upper-bound feature))
		 (loop for f in queryFillers
		     collect `(:fills-role-domain ,instance ,(relation feature) ,f))
	       '((:sorry))))
	    (SET-FEATURE
	     `((:isnta ,instance ,feature)))
	    (COMPUTED-FEATURE
	     `((:not-satisfied ,feature)))
	    (NOT-FILLED-BY-FEATURE
	     `(:fills-role-domain
	       ,instance
	       ,(relation feature)
	       ,(first (intersection queryFillers (non-role-fillers feature)))))
	    (otherwise `((:contradicts-feature ,instance ,feature))))) ))

;;; Patch Loom4-0-45  3/20/01
;;; Remove unused and misspelled feature

(defparameter *possible-features*
    (sort (list :open-world :closed-world
		:prefer-clos-instances
		:disable-classifier :disable-completion
		:automatically-advance-state
	     ;; *loom-dialogue-features*:
		:emit-classify-dots
		:long-print-names :allow-duplicate-creates
		:ask-for-concept-names :ask-for-names-immediately
		:dont-name-system-defined-concepts :warn-about-syntax-corrections
		:warn-on-nonprimitive-clos-classes :warn-on-redefinition
		:suppress-diehard-output
		:emit-match-stars :warn-on-slot-overflow
	    ;; *loom-features*:
		:automatic-clos-classes
		:push-down-primitive-restrictions
		:domain-implies-role :load-obsolete-concepts
		:dont-dwimmify-keywords :compile-predicates-on-demand
            ;; *loom-match-features*
		:clip-roles :clip-types :display-match-changes
		)
	  #'string< :key #'symbol-name))

;;; Patch Loom4-0-46  3/27/01
;;; Make this be resizable.

(defvar *default-relation-hashtable-size* 5000 
  "Default size for n-ary relation hashtables created in response to :hash-on-domains")

(export '(loom::*default-relation-hashtable-size*))

(defmethod seal-relation ((self N-ARY-RELATION))
  ;; Called by "help-seal-one-concept";
  ;; "self" is a non-binary computed relation;
  ;; Insure that its predicate function gets sealed;
  ;; Create tuple index if necessary;
  (post-unsealed-predicate self)
  (if (hashed-relation-p self)
      (progn
	(when (null (tuple-index self))
	  (setf (tuple-index self)
             (make-hash-table :test #'equal
			      :size *default-relation-hashtable-size*)))
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

;;; Patch Loom4-0-47  3/28/01
;;; Performance tuning for large systems.

;; Redefined to take a different set of arguments:
(eval-when (:load-toplevel :compile-toplevel :execute)
  (when (fboundp 'discard-index)
    (fmakunbound 'discard-index)))
(CLOS::defgeneric discard-index (self delete-p))

(defmethod discard-index ((self HISTORY-INDEX) delete-p)
  ;; Clear slots in "self" and recycle it;
  ;; Assumes that "(previous-index self)" is nil;
  ;; The 'delete-p' flag is set to NIL in the most common case
  ;;   where discard-index is called from advance-history-queues
  ;;   and the *list-of-*agent-time-1*-indices* is about to be
  ;;   reset anyway.
  (setf (previous-index (next-index self)) nil)
  (setf (next-index self) nil)
;  (setf (added-next-time-quantum self) nil)   ; TAR 4/15/94 - contexts!
;  (setf (removed-next-time-quantum self) nil)
;  (setf (time-point self) :discarded)
  (when (and delete-p
	     (eql (time-point self) (1- *agent-time*)))
    (delf *list-of-*agent-time-1*-indices* self))
  )

(defun unset-history-limit ()
  "Turn off history maintenance."
  ;; For each history instance, either place it in one of the lists
  ;;    *list-of-*agent-time-1*-histories* or *list-of-*agent-time*-histories*
  ;;    or else discard it;
  (when (null *generating-histories-p*)
    (return-from unset-history-limit nil))
  (let ((now *agent-time*)
	(now-1 (1- *agent-time*))
	timePoint)
    (loop for h in *list-of-oldest-histories*
	 do
	 (setq timePoint (time-point h))
	 (cond
	   ((= timePoint now)
	    (push h *list-of-*agent-time*-histories*))
	   ((= timePoint now-1)
	    (push h *list-of-*agent-time-1*-histories*))
	   (t
	    (discard-instance h))))
    (loop for ix in *list-of-oldest-indices*
	 do
	 (setq timePoint (time-point ix))
	 (cond
	   ((= timePoint now)
	    (push ix *list-of-*agent-time*-indices*))
	   ((= timePoint now-1)
	    (push ix *list-of-*agent-time-1*-indices*))
	   (t
	    (discard-index ix t))))
    (setq *generating-histories-p* nil) ))


(defun advance-history-queues ()
  ;; Discard previous instances that are now two time quanta removed from
  ;;    *agent-time*;
  ;; Reset the lists that record previous and about-to-be previous instances.
  ;; Called by "new-time-point" at the end of a match cycle;
  ;; All of this logic except for creation of non-existent instances could
  ;;    have happend simultaneously with "advance-time-clock".  However,
  ;;    creation of a new non existent instance must be deferred until after
  ;;    the recognition phase to allow newly created instances to link to
  ;;    the old non existent instance;
  (create-non-existent-instance)		; <= create before advancing queues
  (when (not *generating-histories-p*)
    ;; discard histories more than two quata old: 
    (loop for i in *list-of-*agent-time-1*-histories*
	 do (discard-instance i))
    ;; save list of histories that are one quantum old:
    (setq *list-of-*agent-time-1*-histories* *list-of-*agent-time*-histories*)
    ;; same thing for indices:
    (loop for ix in *list-of-*agent-time-1*-indices*
	 do (discard-index ix nil))
    (setq *list-of-*agent-time-1*-indices* *list-of-*agent-time*-indices*)
    (setq *list-of-*agent-time*-indices* nil))
      ;; prepare to record histories that are zero quanta old:
  (setq *list-of-*agent-time*-histories* nil) )


(defun recompute-list-of-oldest-indices (limitPoint)
  ;; Called by "set-history-limit";
  ;; If histories are already turned on, then, starting from
  ;;    *list-of-oldest-histories*, calculate a new list by running
  ;;    forwards in time from members of the old list;
  ;; Otherwise, combine members of *list-of-*agent-time*-histories* and
  ;;    *list-of-*agent-time-1*-histories* to generate a new list;
  (let (newIndexList)
    (flet ((push-newer-index (index)
	     (loop
	       (when (>= (time-point index) limitPoint)
		 (when (typep index 'HISTORY-INDEX)
		   (push index newIndexList))
		 (return nil))			; exit loop
	       (discard-index index t)
	       (setq index (next-index index)))))
      (cond
	(*list-of-oldest-indices*
	 (loop for ix in *list-of-oldest-indices*
	      do (push-newer-index ix)))
	((= limitPoint *agent-time*)
	 (loop for ix in *list-of-oldest-indices*
	      when (< (time-point ix) limitPoint)
	      do (discard-index ix t))
	 (setq newIndexList *list-of-*agent-time*-indices*))
	(t					; limitPoint <= *agent-time* - 1
	 (setq newIndexList *list-of-*agent-time-1*-indices*)
	 (loop for ix in *list-of-*agent-time*-indices*
	      unless (previous-index ix)
	      do (push ix newIndexList))))
      (setq *list-of-*agent-time*-indices* nil)
      (setq *list-of-*agent-time-1*-indices* nil)
      (setq *list-of-oldest-indices* newIndexList) )))

;;; Patch Loom4-0-48  4/30/01
;;; Fix misnamed function make-reification (inside get-link) in patch 40


;;; Patch Loom4-0-49  5/15/01
;;; Prettier output.  Also, fixed bug in patch 9.

(defun generate-role-filler-forms (instance)
  ;; Return a list pairing role names and values for non-empty
  ;;    roles asserted to "instance";
  ;; Roles are processed to be used by an add-value or set-value function;
  (let ((instanceReference 
	 (typecase instance
	   (CONTEXT (generate-filler instance))
	   (ROLE (generate-filler instance))
	   (otherwise (generate-reference-name instance)))))
    (make-role-name&value-loop
     instance
     `(tell (,name ,instanceReference ,(generate-filler value)))
     `(tell (,name ,instanceReference ,(generate-filler value)))) ))

;;; Patch Loom4-0-50  5/17/01
;;; Added more error checking to assert-annotations (Patch #19)

;;; Patch Loom4-0-51  5/22/01
;;; Fix bug with single-valued code.

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
		      ,(if (or predicate-p
			       (and (binary-p relation)   ; tar 5/22/01
				    (role-is-single-valued-p relation)))
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


;;; Patch Loom4-0-52  10/8/01
;;; Make the reader changes be preserved over dumplisp calls:

#+:measures
(defun ms::install-dim-number-reader (&key permanent dispatch
					   (readtable ms::*dim-number-readtable* rt-p)
					   (dispatch-char #\#))
  (when permanent 
    (unless rt-p (setq readtable *readtable*))
    ;; Below was (copy-readtable *readtable*), but that causes infinite recursion
    ;;  problems if this function is called more than once!
    (unless (boundp 'ms::*standard-readtable*)
      (setq ms::*standard-readtable* (copy-readtable nil))))
  (dolist (digit '(#\0 #\1 #\2 #\3 #\4 #\5 #\6 #\7 #\8 #\9))
    (set-macro-character digit #'ms::dim-number-reader
			 t readtable))
  (dolist (digit '(#\+ #\-))
    (set-macro-character digit #'ms::signed-dim-number-reader
			 t readtable))
  (when dispatch
    (set-dispatch-macro-character
     dispatch-char dispatch #'ms::dispatch-dim-number-reader
     *readtable*)))

#+(and :measures :excl (not :allegro-v4.2) (not :allegro-v4.1))
(push #'(lambda () (ms:install-dim-number-reader :permanent t))
      excl::*restart-actions*)

;;; Patch Loom4-0-53  10/10/01
;;; Make this find :RELATES feature dependencies as well

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
		(setf (relation-in-equivalence-restriction-p relation) t)))))
  (loop for dep in (non-tbox-dependents relation)
	do (typecase dep
	     (UNARY-ENTITY
	      (when (loop for comp in (implied-comparisons dep)
			  thereis (member relation (roles comp)))
		(setf (relation-in-equivalence-restriction-p relation) t))))))

;;; Patch Loom4-0-54  10/11/01
;;; Apply the relationship only if all fillers are present

(defun apply-one-relationship (instance feature)
  ;; Helping function for "apply-strict-comparisons";
  ;; Assert a relation between role chain fillers as indicated by
  ;;    "feature", except when the indicated relationship is not
  ;;    primitive or when one or more role chains are not single-valued;
  (flet ((collect-filler (role)
	   (let ((fillers (collect-all-role-fillers instance role)))
	     (when (or (null fillers) (rest fillers))
	       (return-from apply-one-relationship nil))
	     (first fillers))))
    (let ((relationship (relationship feature))
	  (roles (roles feature)))
      (unless (primitive-p relationship)
	(return-from apply-one-relationship nil))
      (if (binary-p relationship)
	  (assert-role-filler
	    (collect-filler (first roles))
	    relationship
	    (collect-filler (second roles))
	    :strict)
	  (assert-tuple
	    (loop for r in roles collect (collect-filler r))
	    relationship)) )))

;;; Patch Loom4-0-55  11/15/01
;;; Fix false error detection with merged concepts

(defun find-all-visible-items (startContext alreadyVisited)
  (let ((visibleInstances nil)
        (visibleConcepts nil)
        (visibleRelations nil)
        (visibleBehaviors nil))
    (labels ((visible-item-p (item) (declare (ignore item)) t) ;; <== ** FIX THIS **
             (find-all-visible-items-helper (c)
               (when (member c alreadyVisited)
                 (return-from find-all-visible-items-helper nil))
               (push c alreadyVisited)
               (do-context-partition (nil instance (find-partition 
                                                    :instances
                                                    (context-partitions c)))
                 (when (and (not (meta-thing-p instance))
                            (visible-item-p instance))
                   (push instance visibleInstances)))
               (do-context-partition (nil concept (find-partition
                                                    :concepts
                                                    (context-partitions c)))
                 (when (and (user-defined-concept-p concept)
                            (visible-item-p concept))
                   (push concept visibleConcepts)))
               (do-context-partition (nil relation (find-partition
                                                    :relations
                                                    (context-partitions c)))
                 (when (and (user-defined-concept-p relation)
                            (visible-item-p relation))
                   (push relation visibleRelations)))
               (do-context-partition (nil behavior (find-partition
                                                    :behaviors
                                                    (context-partitions c)))
                 (when (visible-item-p behavior)
                   (push behavior visibleBehaviors)))
               (loop for parent in (parent-contexts c)
                     do (find-all-visible-items-helper parent))))
      (find-all-visible-items-helper startContext)
      ;; TO DO: FIGURE OUT IF THE ANSWERS ARE GUARANTEED TO BE DUPLICATE FREE!
      (values  visibleInstances
               visibleConcepts 
               visibleRelations
               visibleBehaviors
               alreadyVisited) )))

;;; Patch Loom4-0-56  11/16/01
;;; Fix bug in rewrite of FIND-NAME-CONFLICTS

(defun find-name-conflicts (rawList)
  ;; Situation: "rawList" is an assumed DUPLICATE-FREE list of objects;
  ;; Detects multiple items in the "rawList" with the same name and returns
  ;;   a list of the names of the duplicates;
  ;; Tricky:  Since non-named objects get NIL as the value of the 
  ;;     unique-identifier function, we need to make sure ID is non-NIL
  ;;     before storing into the hash table;
  (flet ((unique-identifier (object)
           ;; The unique identifier is a name for named objects, otherwise
           ;;   NIL.
           (typecase object
             (BASIC-INSTANCE (identifier object))
	     (LOOM-OBJECT (name object))
             (CLOS-INSTANCE (let ((id (identifier object)))
                              (if (listp id)
                                nil
                                id) ))
             (T (name object))) ))
    (let ((ht (make-hash-table :size (length rawList)))
	  (result nil))
      (loop for item in rawList
	  as id = (unique-identifier item)
	  as seen = (gethash id ht)
	  when (and seen (not (eq seen item)))
	  do (pushnew id result)
	  else when id
	  do (setf (gethash id ht) item))
      result)))

;;; Patch Loom4-0-57  11/26/01
;;; Make this work for multi-context merged definitions.

(defun defined-in-context-p (name concept context)
  ;; Helping function for "generate-source-definition";
  ;; Return t if the definition of the concept with name "name" that
  ;;    is (or merged with) "concept" was defined in the context "context";
  (unless (rest (source-definitions concept))
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

;;; Patch Loom4-0-58  12/19/01
;;; Fixed up Allegro specific problems with startup and readtables

;; See #52

;;; Patch Loom4-0-59  1/16/02
;;; Fix up problem with incoherent instances.

(defmethod get-cached-types ((self BASIC-INSTANCE))
  ;; Return a list of all asserted or inferred types of "self";
  (declare (special *analysisModeP*))
  (let (type)
    (if (boundp '*analysisModeP*)
      (case *analysisModeP*
	(0				; $STRICT-RETRACTION-Q$
	 (setq type (compute-rock-bottom-type self :side-effect-free-p t)))
	(3				; $DEFAULT-ASSERTION-Q$
	 (setq type (db-type self)))
	(otherwise			; $STRICT-ASSERTION-Q$ or $DEFAULT-RETRACTION-Q$
	 (setq type (strict-db-type self))))
      (setq type (db-type self)))
    (if (listp type) type (list type)) ))

;;; Patch Loom4-0-60  1/30/02
;;; Missing methods

(defun non-filler-conflicts-with-restriction-p
       (nonFiller role listOfRestrictions)
  ;; Helping function for "NOT-FILLED-BY-FEATURE.detect-default-conflict-p" and
  ;;    "NOT-FILLED-BY-FEATURE.default-feature-collides-with-strict-feature-p";
  ;; Return t if "nonFiller" conflicts with one of the implied
  ;;    filled-by restrictions attached to "instance";
  (loop for res in listOfRestrictions
        thereis (and (eq role (relation res))
		     (case (feature-type res)
		       (:filled-by
			(member nonFiller (role-fillers res) :test #'filler-equal))
		       (otherwise nil)))) )

(defmethod default-feature-collides-with-strict-feature-p
	   ((self NOT-FILLED-BY-FEATURE) strictFeatures)
  ;; Return t if the feature "self" is incompatible with some feature in
  ;;    "strictFeatures";
  ;; A conflict will occur if
  ;;    (i) filler conflicts with a filled-by restriction.
  (let ((role (relation self)))
    (loop for nonFiller in (non-role-fillers self)
	thereis (non-filler-conflicts-with-restriction-p 
		 nonFiller role strictFeatures)) ))

(defmethod detect-default-conflict-p ((self NOT-FILLED-BY-FEATURE) instance)
  ;; Determine whether removing the default fillers specified by "self"
  ;;    on "instance" would cause a contradiction;
  ;; A conflict will occur if
  ;;    (i)  there is a strict filled-by assertion
  ;;    (ii) the fillers were strictly asserted to the instance
  (let ((role (relation self))
	(defaultNonFillers (non-role-fillers self))
	(strictRestrictions
	  (bag-append
	    (asserted-features instance)
	    (implied-restrictions (strict-db-type instance))))
	assertedFillers)
    (setq assertedFillers (get-asserted-role-fillers instance role))
    (loop for nonFiller in defaultNonFillers
	thereis (or (non-filler-conflicts-with-restriction-p
		     nonFiller role strictRestrictions)
		    (member nonFiller assertedFillers :test #'filler-equal))) ))

;; Fix oversight
(defun compute-strict&default-fillers-tables (relation)
  ;; Called by "recompute-inherit-fillers-tables";
  ;; Recompute the indices for "relation" used in inheriting
  ;;    strict and default role fillers;
  (flet ((get-default-fillers (concept relation)
	   (loop for ftr in (default-features concept)
	       when (and (eq (feature-type ftr) :filled-by)
			 (eq (relation ftr) relation))
	       return (role-fillers ftr))))
    (parents-first-do-subconcepts (concept (implied-domain relation))
       ;; Safety test:  There could be unprocessed concepts that get
       ;;   picked up by the subconcept walk.  This skips them.  If they
       ;;   are relevant, then they will cause this function to be invoked
       ;;   again once they seal.
       (when (completed-p concept)
	 (loop for ftr in (implied-restrictions concept)
	     do (when (eq (relation ftr) relation)
		  (case (feature-type ftr)
		    (:filled-by 
		     (augment-strict-fillers-table
		      relation concept (role-fillers ftr)))
		    (:not-filled-by
		     (augment-default-fillers-table
		      relation concept (get-default-fillers concept relation))))))
	 (loop for ftr in (default-features concept)
	     when (and (eq (feature-type ftr) :filled-by)
		       (eq (relation ftr) relation))
	     do (augment-default-fillers-table
		 relation concept (role-fillers ftr))))) ))


;;; Patch Loom4-0-61  2/19/02
;;; Fix bug with feature monitoring when fillers are not classified instances.

(defun destroy-one-context (context)
  ;; Called by "destroy-context";
  ;; Destroy all links to "context";
  (loop for parent in (parent-contexts context)
        do (delf (child-contexts parent) context))
  ;; delete the entry for "context" from *context-table*:
  ;; Note: For speed, we avoid using "delete", which would always scan the 
  ;;   entire list.  Tricky: assumes BUILT-IN-THEORY is at the tail end of the 
  ;;   list.
  (loop for tail on *context-table*
        as entry = (first tail)
        when (eq (cdr entry) context)
        do
        (setf (first tail) (first (rest tail)))
        (setf (rest tail) (rest (rest tail))))
  ;; remove "context" from kb-to-context index:
  (when (theory-p context)
    (loop for kb in (list-knowledge-bases)
          when (member context (contexts kb))
          do (delf (contexts kb) context)))
  ;; remove "context" from all positions within the stack:
  (setq *context-stack*
        (delete context *context-stack*))
  ;; if "context" was the current context, push it on the stack
  ;;    just long enough to pop it off:
  (when (eq *context* context)
    (push context *context-stack*)
    (if (rest *context-stack*)
      (pop-context)
      (change-context
       (let ((parentContext (first (parent-contexts context))))
         (if (and parentContext
                  (not (discarded-p parentContext)))
           parentContext
           (get-context 'BUILT-IN-THEORY)))))
    (inform "~&Destroying current context, resetting current context to ~A.~%"
            (name *context*)))
  (when (ctxt context)
    (destroy-ctxt (ctxt context))) )


(CLOS::defmethod monitor-simple-feature 
	   ((feature COMPARISON-FEATURE) instance satisfiedP defaultP triggerInstances)
  ;; Plant role bombs to monitor support for the comparison "feature" on "instance";
  (declare (ignore triggerInstances))
  (let ((relationship (relationship feature))
	bomb)
    (if satisfiedP
	(progn
	  ;; place bombs on roles:
	  (loop for r in (roles feature)
	       when (relation-p r)
	       do (plant-trigger-role-bomb 
		    instance r feature satisfiedP defaultP :if-removed-p t))
	  ;; place bomb(s) on relationship:
	  (when (not (monotonic-p relationship))	; implies not :perfect
	    (multiple-value-bind (dummy fillers)
		(apply-rolechain-role-to-instance (first (roles feature)) instance)
	      (declare (ignore dummy))
	      (setq bomb (create-remote-bomb
			  instance feature satisfiedP defaultP))
	      (loop for f in fillers
		  when (classified-instance-p f)
		   do (plant-remote-role-bomb f relationship bomb :if-removed-p t)) )))
	(progn
	  ;; place bombs on roles:
	  (loop for r in (roles feature)
	       when (relation-p r)
	       do (plant-trigger-role-bomb 
		    instance r feature satisfiedP defaultP :if-added-p t))
	  ;; place bomb(s) on relationship:
	  (when (not (perfect-p relationship))
	    (multiple-value-bind (dummy fillers)
		(apply-rolechain-role-to-instance (first (roles feature)) instance)
	      (declare (ignore dummy))
	      (setq bomb (create-remote-bomb
			  instance feature satisfiedP defaultP))
	      (loop for f in fillers
		  when (classified-instance-p f)
		  do (plant-remote-role-bomb f relationship bomb :if-added-p t)) )))) ))

;;; Patch Loom4-0-62  2/19/02
;;; Fix more error conditions in conditioning.

(defun evaluate-expression (expression type &key disjunct-p)
  ;; Return a concept or relation (indicated by "type") defined by
  ;;    "expression";
  ;; "type" belongs to '(:concept :relation);
  ;; TO DO: TRY TO AVOID REPARSING ALREADY-PARSED EXPRESSIONS;
  (declare (special *conceptBeingConditioned*))
  (cond
    ((symbolp expression)
     (evaluate-symbolic-reference expression type))
    ((atom expression)                  ; literal or object blows through
     expression)
    ((let ((conjuncts (rest expression)))       ; RMM 6/24/94
       (and (eq (first expression) :and)
            (member *thing* conjuncts)
            (= (length conjuncts) 2)
            (evaluate-expression 
             (if (eq (second conjuncts) *thing*)
               (first conjuncts)
               (second conjuncts))
             type))))
    (t
 #L:trace-parse (trace-values "evaluate-expression" expression type)
     (let* ((newConcept (create-concept nil type nil))
	    (*parserContextStack* (list *loom-parse-graph*))
	    (*conceptBeingParsed*
	      (if (boundp '*conceptBeingConditioned*)
		  *conceptBeingConditioned*
		  newConcept)))
       (declare (special *parserContextStack* *conceptBeingParsed*))
       (parse-top-level-expression newConcept expression :definition)
       (setf (attributes newConcept) '(:system-defined))
       (setf (system-attributes newConcept) '(:definition-only))
       (when disjunct-p
	 (push :disjunct (system-attributes newConcept)))
       ;; Need to fill in "(source-definitions newConcept)"
       ;;    pin case it gets revised during classification
       (setq newConcept (condition&classify-subgraph newConcept))
       (unless (classified-p newConcept)
	 (if (boundp '*conceptBeingConditioned*)
	   (conditioning-error "Couldn't condition and classify concept ~A"
			       expression)
	   (integrity-check (classified-p newConcept))))
       (post-uncompleted-concept newConcept)
       newConcept))) )


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
		 (completed-p self) 	             ; TAR 2/19/2002
                 (consp (members (defined-set-feature self))))          ;  TAR 3/11/96
        (loop for m in (members (defined-set-feature self))
              for cxt = (context m)
              when cxt do (pushnew cxt contexts)))
      (highest-encompassing-context contexts) )))

;;; Patch Loom4-0-63  9/11/02
;;; Make this record productions for reintroduction.

(defun uncompile-one-cohort (cohort)
  ;; Eliminate "cohort" and post its corresponding production on the
  ;;    list of uncompiled productions;
  (when (primary-production cohort)
    (uncompile-production (primary-production cohort))
    (pushnew (primary-production cohort) *list-of-uncompiled-productions*)) )

;;; Patch Loom4-0-64  10/21/02
;;; Fix this to detect conflicts that occur with non-classified fillers.

(defmethod detect-default-conflict-p ((self VALUE-RESTRICTION) instance)
  ;; Helping method for "process-default-assertion-queue";
  ;; Return t if "self" conflicts with some asserted or strictly inherited
  ;;    restriction of "instance", or with the fillers of the corresponding role;
  (let ((role (relation self))
	(valueRestriction (value-restriction self)))
    (flet ((conflicting-value-restriction-p
	     (restrictions)
	     (loop for res in restrictions
		  thereis (and (eq (feature-type res) :VALUE-RESTRICTION)
			       (let ((relation (relation res)))
				 (or (subconcept-p role relation)
				     (subconcept-p relation role)))
			       (disjoint-concepts-p
				valueRestriction (value-restriction res))))))
      (or (conflicting-value-restriction-p 
	   (implied-restrictions (strict-db-type instance)))
	  (conflicting-value-restriction-p (asserted-features instance))
	  (loop for filler in (collect-all-role-fillers instance role)
	       when (not-has-instance-p valueRestriction filler)
	       do (when (classified-instance-p filler)
		    (plant-conflict-bomb
		     instance self :type-propagation t valueRestriction t filler))
		  (return t))) )))

;;; Patch Loom4-0-65  2/5/03
;;; Fix compile time conditionalizations in patch 4.


;;; Patch Loom4-0-66  3/5/03
;;; Fix error in skolem-instance-p macro.

;; Redefined from a macro to a method:
(eval-when (:load-toplevel :compile-toplevel :execute)
  (when (fboundp 'skolem-instance-p)
    (fmakunbound 'skolem-instance-p)))
(CLOS::defgeneric skolem-instance-p (instance))


#+(or :CLTL2 :ANSI :ANSI-CL) (declaim (inline skolem-test-p))
#-(or :CLTL2 :ANSI :ANSI-CL) (proclaim '(inline skolem-test-p))
(defun skolem-test-p (instance)
  (test-bit-flags (or (db-attributes instance)
		      ;; The following uses this low-level accessor
		      ;; because if we are printing outside the context
		      ;; hierarchy, so we take the value from the
		      ;; home-ctxt of the instance.
		      (let ((*current-ctxt* (home-ctxt instance)))
			(db-attributes instance)))
		  :db-instance
		  :skolem))

(defmethod skolem-instance-p ((instance T)) nil)
(defmethod skolem-instance-p ((instance DB-INSTANCE))
  (skolem-test-p instance))

(defmethod print-object ((self DB-INSTANCE) stream)
  (cond #+:CLTL2
	(*print-readably* (print-readably-error 'DB-INSTANCE self))
	(*html-print-p* (format stream "~A" (html-reference self)))
	(t (let* ((dbType (db-type self))
		  (printedType
		   (cond
		    ((not (member :long-print-names *loom-dialogue-features*))
		     nil)
		    ((or (discarded-p self)
			 (eq dbType :abandoned-by-merge))
		     `(,(object-name self) :discarded))
		    (dbType
		     (loop for conjunct in (find-named-superconcepts-of-supers
					    (list-of dbType))
			 collect (name conjunct)))
		    (t
		     '(:UNTYPED)))))
	     (format stream "|~:[I~;SK~]|~A~@[~A~]"
		     (skolem-instance-p self)
		     (identifier self)
		     printedType) )) ))

(defun merge-instances (fromId intoId justification)
  ;; Merge (or unify) all knowledge about fromInstance with intoInstance;
  ;; This may require recursively merging other instances,
  ;;    so a queue is kept of merges that remain to be performed;
  (let ((fromInstance (get-instance fromId))
	(intoInstance (get-instance intoId)))
    (unless (and (classified-instance-p fromInstance)         ; RMM 4/7/93
                 (classified-instance-p intoInstance))
      (when (or (test-bit-flags (db-attributes fromInstance)
				:db-instance
				:skolem)
		(test-bit-flags (db-attributes intoInstance)
				:db-instance
				:skolem)) ; TAR 5/26/99
	(return-from merge-instances
	  (if (test-bit-flags (db-attributes fromInstance)
				:db-instance
				:skolem)
	      (if (eq justification :assertion)
		  (execute-in-contexts-breadth-first
		   (replace-skolem-by-constant (womp-merge-pointers fromInstance)
					       (or intoInstance intoId)))
		(replace-skolem-by-constant (womp-merge-pointers fromInstance)
					    (or intoInstance intoId)))
	    (if (eq justification :assertion)
		(execute-in-contexts-breadth-first
		 (replace-skolem-by-constant (womp-merge-pointers intoInstance)
					     (or fromInstance fromId)))
	      (replace-skolem-by-constant (womp-merge-pointers intoInstance)
					  (or fromInstance fromId))))))
      (grumble "Instance ~@[~*un~]merging is not supported for non-classified instances
such as ~S and ~S." (eq justification :retraction) fromInstance intoInstance)
      (return-from merge-instances nil))
    (if (eq justification :assertion)
	(execute-in-contexts-breadth-first
	 (local-merge-instances fromID fromInstance intoID intoInstance justification))
      (local-merge-instances fromID fromInstance intoID intoInstance justification))
    intoInstance ))

(defun local-merge-instances (fromID fromInstance intoID intoInstance justification)
  ;; Merge (or unify) all knowledge about fromInstance with intoInstance;
  ;; This may require recursively merging other instances,
  ;;    so a queue is kept of merges that remain to be performed;
  (let ((*do-in-subcontexts-p* nil))
    (declare (special *exitIncoherentWorldP*))
    (cond
     ((eq justification :retraction)
      (warn "Retraction of :same-as is not supported."))
     ((not (and fromInstance intoInstance)) ; at least one of the instances does not exist
      (when (not intoInstance)
	(cond
	 (fromInstance			; swap variables
	  (let ((tempId intoId))
	    (setq intoId fromId)
	    (setq intoInstance (womp-merge-pointers fromInstance))
	    (setq fromId tempId)))
	 (t				; must create a new instance
	  (setq intoInstance (create-classified-instance intoId nil nil))
	  (setf (multiple-identifiers intoInstance) (list intoID)))))
      ;; Now, there is an instance for intoInstance, but none for fromInstance
      ;; Save source definitions of instances before anything is merged
      (push fromId (multiple-identifiers intoInstance))
      ;; Result cannot be a skolem, since a new designator has been introduced
      (when (test-bit-flags (db-attributes intoInstance) :db-instance :skolem)
	(clear-bit-flags (db-attributes intoInstance) :db-instance :skolem)
	(setf (identifier intoInstance) fromId))
      ;; Change symbol table entries for fromInstance
      (intern-object fromid intoInstance :instances nil))
     ((eq fromInstance intoInstance)) ;; no action needed
     (t
;      #L:trace-modify (trace-values "merge-instances" fromInstance "into" intoInstance)
      
      (setq fromInstance (womp-merge-pointers fromInstance))
      (setq intoInstance (womp-merge-pointers intoInstance))
      ;; Look for conflicting types before actually merging:
      (when (and (boundp '*exitIncoherentWorldP*)
		 ;; one of the instances may not have been matched yet:
		 (and (strict-db-type fromInstance)
		      (strict-db-type intoInstance))
		 (disjoint-concepts-p (strict-db-type fromInstance)
				      (strict-db-type intoInstance)))
;	#L:trace-merge (trace-values "merge instances: type conflict" fromInstance intoInstance)
					;	   #L:trace-merge (break "merge-instances")
	(setq *exitIncoherentWorldP* (list fromInstance intoInstance))
	(throw 'incoherent-world-catcher :incoherent))
      ;; Save multiple-definitions of fromInstances before anything is discarded
      (merge-multiple-definitions fromInstance intoInstance)
      ;; Very Tricky: we deactivate any equivalence-bombs that point
      ;;              at either instance (now all merged into intoInstance)
      ;; so that equivalence classes will not be seen while role fillers
      ;; are redirected from fromInstance to intoInstance
      (loop for bomb in (equivalence-memberships intoInstance) do
	    (deactivate-equivalence-bomb bomb))
      (loop for bomb in (equivalence-bombs intoInstance) do
	    (deactivate-equivalence-bomb bomb))
      ;; Merge asserted knowledge:
      (set-bit-flags (db-attributes intoInstance) :db-instance :instance-being-merged)
      (setf (merged-into-instance fromInstance) intoInstance)   ; TAR 03/17/2003
      (copy-role-fillers fromInstance intoInstance t :inverses-of-phantoms)
      ;; Conjuncts
      (loop for conjunct-support in (conjuncts-table fromInstance) do
	    (when (assertion-p (cdr conjunct-support))
	      (assert-conjunct intoInstance (car conjunct-support) :assertion)))
      ;; Features
      (loop for feature in (asserted-features fromInstance) do
	    (assert-feature intoInstance feature))
      (setf (merged-into-instance fromInstance) nil)    ; TAR 03/17/2003
      (clear-bit-flags (db-attributes intoInstance) :db-instance :instance-being-merged)
      ;; Reactivate bombs that point at intoInstance
      (loop for bomb in (equivalence-memberships intoInstance) do
	    (reactivate-equivalence-bomb bomb))
      (loop for bomb in (equivalence-bombs intoInstance) do
	    (reactivate-equivalence-bomb bomb))
      ;; Redirect all pointers to fromInstance
      (eliminate-merging-instance fromInstance intoInstance)
      ;; Change symbol table entries for fromInstance:
      (let ((ids (or (multiple-identifiers fromInstance)
		     (list-of (identifier fromInstance)))))
	(loop for id in ids do
	      (intern-object id intoInstance :instances nil)))
      ;; Result should not be a skolem, if a rigid designator has been introduced
      (when (and (test-bit-flags (db-attributes intoInstance) :db-instance :skolem)
		 (not (test-bit-flags (db-attributes fromInstance) :db-instance :skolem)))
	(clear-bit-flags (db-attributes intoInstance) :db-instance :skolem)
	(setf (identifier intoInstance) fromId))
      ;; tell matcher to recompute derived knowledge for this instance
      (post-non-analyzable-modified-instance intoInstance :assertion (default-mode-p))
      (setf *last-merged-instance-agent-time* *agent-time*))) ;  TAR 1/3/94
    ))

(defun detect-incoherence-p (instance oldType)
  ;; Issue a warning if concepts in the db-type of "instance" are found
  ;;    to be disjoint;
  ;; Return two values:
  ;;    (1) t if "instance" is found to be incoherent, and
  ;;    (2) "deltaRestrictions" -- a list of newly inherited restrictions;
  ;; Side-effect: Recompute the slot "residue-features";
  ;; Note: Retraction of incoherence takes place inside of
  ;;   "recompute-retracted-instance-type-p" and "recompute-asserted-instance-type-p";
  ;; TO DO: CONSIDER ADDING EXTRA SLOT TO COMPUTED-FEATURE TO HOLD NEGATION OF
  ;;    :satisfies, SO THAT WE CAN LOOK FOR A DISPROOF OF A :satisfies CONSTRAINT;
  ;; TO DO: EXAMINE INITIAL DETECTION OF INCOHERENCE TO SEE WHAT RESTRICTIONS WERE
  ;;    INHERITED AND WHICH (IF ANY) WERE NOT;
  (let ((newType (db-type instance))
	(modificationSummary (modification-summary instance))
	(*expandSystemDefinedConceptsP* t)
	incoherentP residueFeatures oldResidue
	deltaRestrictions incoherenceReason)
    (declare (special *expandSystemDefinedConceptsP*))
    
    (setq incoherentP (or (consp newType)
			  (incoherent-p newType)))
    (if incoherentP
	(progn
	  (throw-if-incoherent-world instance)
	  (when (and (not (default-mode-p))
		     (newly-asserted-conjuncts modificationSummary)
		     (member :clip-types *loom-match-features*)
		     (clip-previously-asserted-conjuncts-p instance))
	    ;; tell "process-strict-assertion-queue" to exit back to the
	    ;;    retraction queue:
	    (setf (retraction-message modificationSummary) :conjunct-clipped)
	    (setf (starting-queue-level modificationSummary) $STRICT-RETRACTION-Q$)
	    (return-from detect-incoherence-p (values t nil)))
	  ;; Try to figure out why this instance is incoherent.  ; TAR 6/27/00
	  (if (consp newType)
	      (if (disjoint-set-of-concepts-p (get-asserted-types instance))
		  (setq incoherenceReason
		    (format nil "Asserted to belong to disjoint set of concepts ~{~S~^, ~}"
			    (get-asserted-types instance)))
		(setq incoherenceReason "I don't know"))
	    (if (incoherent-p newType)
		(setq incoherenceReason
		  (format nil "Belongs to incoherent type ~S" newType))
	      (setq incoherenceReason "I don't know")))
	  ;; skip residue features computation, but propagate role fillers, etc.
	  )
	(progn
	  (setq oldResidue (residue-features instance))
	  (multiple-value-setq (residueFeatures incoherentP)
	    (compute-residue-features-p instance))
	  (setf (residue-features instance) residueFeatures)
	  ;; check for unsatisfied computed features, unless instance is a
	  ;;    skolem (for skolems, a test like "integerp" might be valid,
	  ;;    but would return the wrong answer):
	  (when (not (test-bit-flags (db-attributes instance) :db-instance :skolem))
	    (loop for f in (implied-computed-features newType)
		when (and ; (not (eq (feature-type f) :satisfies))  ;; TAR 11/13/97
			  (not (feature-is-satisfied-p f instance)))
		do (setq incoherentP t)
		   (setq incoherenceReason 
		     (format nil "The computed feature ~A is not satisfied." f))
		   (return)))
	  (when incoherentP
	    (throw-if-incoherent-world instance))))
    ;; apply strict features even if "instance" is incoherent
    (apply-strict-role-fillers instance newType residueFeatures)
    (when *monotonic-mode-p*
      (apply-strict-comparisons instance))
    (unless incoherentP
      (setq deltaRestrictions
	    (set-difference (implied-restrictions newType)
			    (if (consp oldType)
				(loop for c in oldType append (implied-restrictions c))
				(implied-restrictions oldType))))
      (loop for f in residueFeatures
	   when (and (not (member f oldResidue))
		     (typep f 'RESTRICTION-FEATURE))
	   do (push f deltaRestrictions))
      #L:trace-types (trace-values "detect-incoherence-p" deltaRestrictions (default-mode-p))
      (loop for f in deltaRestrictions
	  when (monitor-feature/fillers-conflict-p f instance)
	  do (setq incoherentP t)
	     (setq incoherenceReason 
	       (format nil "There is a conflict with restriction ~A" f))
	     (return)))
    (when (and (not incoherentP)
	       (violated-features instance))
      ;; check for continued violation of specific features:
      (unless (loop for f in (violated-features instance)
		  when (and (monitor-feature/fillers-conflict-p f instance)
			    (feature-is-really-violated-p f instance))
		  do (setq incoherentP t)
		     (setq incoherenceReason
		       (format nil "There is a conflict with restriction ~A" f))
		     (return t))
	;; If no longer violated, clear violated features
	;; (except in strict mode, when we leave them):
	(when (default-mode-p)
	    (setf (violated-features instance) nil))))
    (unless incoherentP
      (loop for c in (asserted-negations instance)
            when (subconcept-p newType c)
	  do (setq incoherentP t)
	     (setq incoherenceReason (format nil "The new type of the instance -- ~A -- is a subconcept of ~A, which is one of the concepts the instance is asserted NOT to be." newType c))
	     (return)))
    (when incoherentP
      (throw-if-incoherent-world instance)
      (progn
        (setf (db-type instance) newType)
        (mark-instance-incoherent instance incoherenceReason)))
    (values incoherentP deltaRestrictions) ))

(defmethod not-has-instance-p ((concept UNARY-ENTITY) (instance BASIC-INSTANCE))
  ;; Return t iff "instance" is provably not an instance of "concept";
  ;; TO DO: ADD CYCLE CHECK IN BC MODE???
  ;; Semantic Assumption: Skolems represent UNKNOWN values, and hence
  ;;    whether a skolem belongs to a concept is independent of whether
  ;;    or not that concept is closed;
  (declare (special *collectedConceptTests*))
  (let* ((currentType (db-type instance))
	 (testType (consequent-concept concept))
	 resultP)
    (when (consp currentType)
      ;; disproof succeeds only if "concept" is disjoint from all
      ;;    members of the incoherent type:
      (return-from not-has-instance-p
	(loop for c in currentType
	      always (disjoint-concepts-p c concept))))
    (setq resultP
	  (or (disjoint-concepts-p currentType testType)
	      (and (probe-closed-concept-p testType)
		   (not (skolem-instance-p instance))
		   (not (has-instance-p testType instance)))
              (and (partitions concept)         ; RMM 7/21/95
                   (not-has-instance-in-exhaustive-partition-p concept instance))
	      (and (not (instrumented-subconcept-p currentType testType instance))
		   (instance-contradicts-features-p 
		     instance testType currentType (residue-features instance)))))
    (when (and (boundp '*collectedConceptTests*)
	       (primitive-p concept))
      (push (list* instance `(:conflict ,concept) resultP)
	    *collectedConceptTests*))
    resultP ))


(defmethod feature-is-contradicted-p ((cmp COMPARISON-FEATURE) instance)
  ;; Return t iff the attributes of "instance" violate the comparison "cmp";
  ;; Simplifications: currently only handles :same-as comparisons
  ;;                  some role must be single-valued to clash
  ;;                  two rigid designators are incompatible
  ;;                  only check type incompatibility of fillers;
  ;; TO DO: detect clashes when some role has a (MAX 1) restriction,
  ;;        exhaustive incompatibility requires a "temporary" merge of fillers
  ;;        take :not-same-as constraints into account when they are implemented;
  (let ((roles (roles cmp))
	result)
    (when (and (equivalence-feature-p cmp)
	       (loop for role in roles
		    thereis (role-is-single-valued-p role)))
      (let (allFillers rigidFillers)
	(loop for role in roles
	     do  ;; TO DO: EXAMINE WHETHER CLOSEDSETP TESTS ARE NEEDED;
	     (multiple-value-bind (closedSetP fillers)
		 (apply-rolechain-role-to-instance role instance)
	       (declare (ignore closedSetP))
	       (setq allFillers (bag-append allFillers fillers))))
	(when (and (cdr allFillers)
		   (cdr (setq allFillers (remove-duplicates allFillers))))
	  (loop for f in allFillers
	       when (not (skolem-instance-p f))
	       do
	       (pushnew f rigidFillers))
	  (setq result
		(or (cdr rigidFillers)
		    (let (combinedType)
		      (loop for f in allFillers
			   when (instance-p f)
			   do (pushnew (db-type f) combinedType))
		      (disjoint-set-of-concepts-p combinedType)))))))
    #L:trace-match (trace-values "feature-is-contradicted-p" cmp instance result)
    result ))

(defun help-assert-half-role-filler (instance role filler oldValue justification)
  ;; Helping function for DB-INSTANCE.assert-role-filler.
  ;; Possibly clip old filler, i.e., if "role" is single-valued, retract the
  ;;    old filler;
  ;; Note: Caching the slot "strict-max-restrictions" enables clipping
  ;;    computations to be reasonably fast;
  ;; TO DO: WE CONJECTURE THAT WHEN "filler" REPRESENTS THE ORIGINAL
  ;;    INSTANCE IN "assert-role-filler" THAT SKOLEM TESTS CAN BE ELIMINATED;
  (declare (inline update-query-indices))
  (let ((singleValuedP (role-is-single-valued-p role))
        upperBound clippedOldFiller bomb)
    (when (strict-max-restrictions instance)
      ;; see if there is an inferred upper bound on "role":
      (loop for maxRes in (strict-max-restrictions instance)
            when (subconcept-p role (relation maxRes))
            do (setq upperBound
                     (if upperBound
                       (min upperBound (upper-bound maxRes))
                       (upper-bound maxRes)))))
    (cond
     ((not singleValuedP)
      (if (and (eql upperBound 1)
	       oldValue
	       (or (skolem-instance-p filler)
		   (skolem-instance-p (first oldValue))))
	  (setq filler (replace-or-merge-skolem-filler
			instance role filler (first oldValue) justification))
	(progn (add-to-role-fillers-table instance role filler oldValue justification)
	       (when (and upperBound
			  (>= (length oldValue) upperBound))
		 (pushnew (loop for maxRes in (strict-max-restrictions instance)
			      when (and (eql upperBound upperBound)
					(subconcept-p role (relation maxRes)))
			      return maxRes) ; RMM 9/21/93
			  (violated-features instance))
		 (post-incoherent-instance 
		  instance
		  (format nil
		     "Adding filler ~A to relation ~A caused the upper bound of ~D to be violated"
		     filler role upperBound))))))
      ;; "role" is single-valued:
      ((null oldValue)
       (add-to-role-fillers-table instance role filler nil justification)
       (when (and upperBound (zerop upperBound))
	 (post-incoherent-instance 
	  instance
	  (format nil "Adding filler ~A to relation ~A caused the upper bound of ~D to be violated"
		  filler role upperBound))))
      ((or (skolem-instance-p filler)
	   (skolem-instance-p (first oldValue)))
       ;; one of filler or oldValue is a skolem
       (setq filler (replace-or-merge-skolem-filler
		      instance role filler (first oldValue) justification)))
      ((not (and (eq justification :assertion)
                 (clipping-enabled-p role)
		 (not (test-bit-flags (db-attributes instance) :db-instance 
				     :instance-being-merged))
		 (let ((roleFillersRecord (rest (assoc role (role-fillers-table instance)))))
		   (or (null roleFillersRecord)
                       (loop for value in oldValue
                             never (member value
				           (strict-fillers roleFillersRecord)
                                           :test #'filler-equal))))))
       ;; "role" is single-valued, but we allow clipping only if justification
       ;;    is :assertion and there is no strict support for the old filler.  
       ;;    Since thats not the case, we MAY permit multiple fillers (which
       ;;    causes "instance" to become incoherent):
       (add-to-role-fillers-table instance role filler oldValue justification)
       ;; record constraint violation:
       (pushnew (max-1-restriction role) (violated-features instance))
       (pushnew instance (dependent-instances role))
       (post-incoherent-instance 
	instance
	(format nil "Adding filler ~A to relation ~A caused the upper bound of 1 to be violated, ~
                    and value clipping could not be performed because ~
                    ~:[role clipping is disabled~;there is other strict support for the value~]"
		filler role (clipping-enabled-p role))))
      (t  ;; clip old filler
       (setq clippedOldFiller (first oldValue))
 #L:trace-modify (trace-values "clipping" instance role clippedOldFiller filler)
       (retract-role-filler instance role clippedOldFiller :retraction
			    :dont-retract-domain-conjunct-p t)
       ;; harmless bug??: a default filler may still exist in the role table, but
       ;;    it gets eliminated from the dynamic variables table here:
       (add-to-role-fillers-table instance role filler nil justification)
       ;; check if there is an equivalence class for this (instance.role)
       (when (setq bomb (find-equivalence-bomb instance role))
	 (assert/retract-fillers-of-equivalent-roles
	   :assertion instance role filler justification bomb))))
    ))

(defun apply-one-single-valued-equivalence (instance eqv eqvFillers)
  ;; Helping function for "apply-strict-comparisons";
  ;; Create a unified instance for the role eqvalence class,
  ;;    and assert it for all roles
  (let (unifiedFiller constantFiller)
    (declare (special *exitIncoherentWorldP*))
    (setq unifiedFiller
	  (cond
           ((null eqvFillers)  ;; create a skolem instance
            (create-skolem-instance nil))
           ((rest eqvFillers)  ;; merge all existing fillers
            (setq constantFiller (when (not (instance-p (first eqvFillers)))
                                   (first eqvFillers)))
            (let ((firstId (or constantFiller
                               (identifier (first eqvFillers))))
                  rigidIds result fillerId newConstantP)
              (when (not (skolem-instance-p (first eqvFillers)))
                (push firstId rigidIds))
              (loop for filler in (rest eqvFillers)
                    do
		    (setq newConstantP (not (instance-p filler)))
		    (setq fillerId (if newConstantP
                                     filler
                                     (identifier filler)))
		    (when (not (skolem-instance-p filler))
		      (pushnew fillerId rigidIds))
		    (cond
                     ((and constantFiller newConstantP)
                      (throw-if-incoherent-world rigidIds)
                      (warn "~&Two Constants (~{~s ~}) merged in role ~
                             equivalence class ~s~%" rigidIds eqv)
                      ;; Let incoherence be detected normally
                      (assert-role-filler
                       instance (first (roles eqv)) filler :strict))
                     (constantFiller
                      ;; QUESTION: should we check whether "filler" is a skolem?
                      (replace-skolem-by-constant filler constantFiller))
                     (newConstantP
                      (replace-skolem-by-constant (get-instance firstID) filler)
                      (setq constantFiller filler))
                     (t
                      (setq result (merge-instances fillerId firstId :strict)))))
              (when (rest rigidIds)
                (warn "~&Multiple rigid designators (~{~s ~}) merged in role ~
                       equivalence class ~s~%"
                      rigidIds eqv))
              (or constantFiller result)))
           (t
            (first eqvFillers))))
    (loop for role in (roles eqv)
          do (assert-role-filler instance role unifiedFiller :strict))
    ;; plant equivalence-bomb on instance
    ;; REMOVED 4/3/91:
    ;; equivalence-bombs were only used in two situations:
    ;;    1. assertion of single-valued roles with clipping;
    ;;    2. retraction of equivalent roles;
    ;; TO DO: generate intermediate role-fillers for composition relations
    ;; (setq bomb (plant-equivalence-bomb instance eqv))
    ;; add record of equivalence class to unifiedFiller
    ;; (when (instance-p unifiedFiller)
    ;;   (push bomb (equivalence-memberships unifiedFiller)))
    ))


;;; Patch Loom4-0-67  3/6/03
;;; Made print a bit more efficient, especially for html printing.

;;; Patch Loom4-0-68  3/7/03
;;; Nicer printing of context names.

(defun generate-context-compatible-reference (self)
 ;; Return an extended identifier for "self" if "self" is not in the
 ;;    current context;
  (let ((my-context (context self)))
    (if (or (eq my-context *context*)
	    ;; shouldn't be null, but if "self" is in a very early stage of
	    ;;    parsing, maybe it is null:
	    (null my-context)
	    (member my-context (context-precedence-list *context*)))
      (name self)
      (generate-extended-identifier (name self) my-context))))

;;; Patch Loom4-0-69  3/11/03
;;; More merge related patches.  Interactions with production rules.

(defun collect-previous-role-fillers (?instance ?role)
  ;; Retrieve the fillers of "?role" for "?instance" at time
  ;;    *previously*;
  (setq ?instance (womp-merge-pointers ?instance))
  (retrieve ?f (:previously (?role ?instance ?f))) )

;;; These two functions are called from code in "productions.lisp":
(defun detects-instance-of-p (?instance ?concept)
  ;; Helping function for "apply-cohort-to-binding-sets";
  ;; Return t if ?instance has just begun satisfing ?concept;
  (setq ?instance (womp-merge-pointers ?instance))
  (ask (:detects (?concept ?instance))) )

(defun undetects-instance-of-p (?instance ?concept)
  ;; Helping function for "apply-cohort-to-binding-sets";
  ;; Return t if ?instance has just ceased to satisfy ?concept;
  (setq ?instance (womp-merge-pointers ?instance))
  (ask (:undetects (?concept ?instance))) )

(defmethod has-instance-p ((concept UNARY-ENTITY) (instance DB-INSTANCE))
  ;; Return t iff "instance" is an instance of the concept "concept";
  (has-bc-instance-p
   concept
   (womp-merge-pointers instance)
   (and (not (backward-chaining-p concept))
	(loop for a in (antecedents concept) never (backward-chaining-p a)))
   nil) )

(defun get-instance (self &key context kb error-p)
  "Return the instance with identifier `self' if `self' is a symbol.  Otherwise,
return `self', or a surrogate instance (if one exists) local to the 
current context or to `context' that shadows `self'."
  ;; TO DO: MAKE THIS TIME-SENSITIVE!!!
  ;; Retrieval is made relative to the current world or context;
  ;; "get-instance" can be used to find an instance visible in the
  ;;    current world that shadows "self";
  ;; CAUTION: The cache variables MUST be cleared whenever the current
  ;;    symbol tables are swapped (when "change-context" or "change-world" is
  ;;    called), or whenever the instances symbol table is updated
  ;;    by "intern-object", "unintern-object", "intern-instance-in-world"
  ;;    and "unintern-instance-in-world";
  ;;    The cache also MUST NOT be set if the context argument is given;
  ;; TO DO: FIGURE OUT IF WE CAN AVOID INTEGER IDENTIFIERS IN WORLDS CODE --
  ;;    THE CODE BELOW ELIMINATES SPECIAL CASING FOR INTEGERS;
  (obsolete-argument get-instance kb context #'get-context-from-kb)
  (labels ((signal-missing-instance ()
             (setq *get-instance-cached-instance* nil)
             (setq *get-instance-cached-value* nil)
             (if error-p
               (cerror "Return the value NIL."
                       "There is no instance named '~S'." self)
               nil))
           (help-get-instance ()
             (cond
               ((symbolp self)
                (or (if (null context)
                      (eval-instance-id self)
                      (evaluate-identifier self :instances context))
                    (when (extended-identifier-p self)
                      (evaluate-extended-identifier self :instances))
                    (signal-missing-instance)))
               ((quoted-p self)         ; RMM 5/12/93
                (second self))
               (t self))))
    (if (null context)
      (if (eq self *get-instance-cached-instance*)
	(womp-merge-pointers *get-instance-cached-value*)
        (progn
          (setq *get-instance-cached-instance* self)
          (setq *get-instance-cached-value* (womp-merge-pointers (help-get-instance)))))
      (womp-merge-pointers (help-get-instance))) ))


;;; Patch Loom4-0-70  3/17/03
;;; More merge changes.  Handle case of reflexive relations.

(defmethod assert-phantom-inverse-role-filler 
           ((filler DB-INSTANCE) realRole instance)
  ;; Assert that "instance" is a filler of the phantom role on "filler";
  ;; TO DO: FIGURE OUT IF WE *ALWAYS* RECORD HISTORY OF PHANTOMS, OR JUST
  ;;    RECORD IF "justification" = :assertion;
  (let* ((phantomInverseRole (phantom-inverse-relation realRole))
	 (oldInstances (get-slot-values filler phantomInverseRole)))
    ;; record value of old phantom inverse fillers: 
    ;; add new phantom role filler:
    (setq instance (womp-merge-pointers instance))
    (unless (member instance oldInstances)        ;  TAR 11/28/94
      (set-slot-values 
       filler phantomInverseRole (cons instance oldInstances))) ))

(defmethod assert-inverse-half-role-filler
           ((filler DB-INSTANCE) role instance justification)
  ;; Assert the inverse role relationship, if one exists, that "instance" is
  ;;    a filler of the inverse of "role" in the instance "filler".
  (let ((inverseRole (inverse role)))
    (if (inverse role)
      (assert-half-role-filler
       filler inverseRole instance
       (get-slot-value filler inverseRole) justification)
      (progn
        (setq filler (womp-merge-pointers filler))
        (assert-phantom-inverse-role-filler filler role instance)
        ;;  If there is no inverse role, assert implied range to be a conjunct of
        ;;     "filler":
	(cond ((eq (implied-range role) *Thing*) nil)
	      ((eq (implied-range role) (loom-constant INCOHERENT))
	       (mark-instance-incoherent filler
		   (format nil "~S was asserted to be the filler of ~S on ~S and the range of ~S is INCOHERENT." filler role instance role)))
	      (t (assert-conjunct filler (implied-range role) :domain/range))))) ))



;;; Patch Loom4-0-71  3/31/03
;;; More merge-related fixes.

(defmacro evaluate-tweak-value-filler (tweakFn &key skip-type-check-p)
  ;; Specialized macro called by "set-value", etc. to detect a reference
  ;;    to a non-existent filler, or to a filler that clashs with the range of
  ;;    the role being filled.  Also, a symbol or quoted symbol may be
  ;;    coerced to an instance;
  `(progn
     (setq filler
           (cond
            ((and (symbolp fillerOrId)
                  (not (constant-concept-p (implied-range role))))
             (or (get-instance fillerOrId)
                 (return-from ,tweakFn
                   (signal-tweak-value-error
                    :missing-instance no-error-p
                    fillerOrId role ',tweakFn))))
            ((and (quoted-p fillerOrId)
                  (symbolp (second fillerOrId)))
             (second fillerOrId))
            (t (womp-merge-pointers fillerOrId))))
     (when (and (not ,skip-type-check-p)
                (not-has-instance-p (implied-range role) filler))
       (return-from ,tweakFn
         (signal-tweak-value-error
          :type-clash no-error-p fillerOrId role ',tweakFn)))
     (when (member :read-only (attributes role))
       (return-from ,tweakFn
         (signal-tweak-value-error
          :read-only-assertion no-error-p instance role ',tweakFn)))
     ) )

(defun set-value (instanceOrId roleOrName fillerOrId &key context kb no-error-p)
  "Replace the current value of the single-valued role `roleOrName' on the
instance `instanceOrId' by `fillerOrId'.  If the new value clashes with the
role's type (range), abort the update and signal an error."
  (obsolete-argument set-value kb)
  (obsolete-argument set-value context)
  (let (instance role filler)
    (evaluate-tweak-value-inputs set-value)
    (when (null fillerOrId)              ; fast exit if just clearing the role
      (fclear-value instance role)
      (return-from set-value nil))
    (evaluate-tweak-value-filler set-value)
    (if (or (atom filler)
            (role-is-single-valued-p role))
      (progn
        (fclear-value instance role)
        (help-add-value instance role filler))
      (cerror "Skip this assignment operation."
              "Illegal use of `set-value' on the multiple-valued role ~S~%  on instance ~S.
To assign multiple values to this role use `set-values' instead.
To assign a single additional value to this role use `add-value'."
              (generate-external-reference role)
              (or (identifier instance) instance))) ))

(defun set-values (instanceOrId roleOrName fillersOrIds &key context kb no-error-p)
  "Replace the current value of the role `roleOrName' on the instance
`instanceOrId' by the list `fillersOrIds'.  If a new value clashes with the
role's type (range), or maximum cardinality restirctions, abort the update and signal an error
unless :no-error-p is non-NIL."
  (obsolete-argument set-values kb)
  (obsolete-argument set-values context)
  (let (instance role fillers max-cardinality)
    (evaluate-tweak-value-inputs set-values)
    (when (null fillersOrIds)              ; fast exit if just clearing the role
      (fclear-value instance role)
      (return-from set-values nil))
    (when (atom fillersOrIds)
      (cerror "Skip this assignment operation."
              "Illegal attempt to assign an atomic value ~S to the role ~S on
  instance ~S using the function `set-values'.
Try calling ~:[enclosing ~S in parentheses or calling `add-value'~;~*`set-value'~]."
              fillersOrIds
              (generate-external-reference role)
              (or (identifier instance) instance)
              (role-is-single-valued-p role)
              fillersOrIds)
      (return-from set-values nil))
    (loop for fillerOrId in fillersOrIds
          do 
          (let (filler)
            (evaluate-tweak-value-filler set-values)
            (pushnew filler fillers :test #'filler-equal)))
    (setq max-cardinality
      (compute-maximum-role-cardinality-for-instance instance role nil))
    (when (and max-cardinality (< max-cardinality (length fillers)))
      (return-from set-values
	(signal-tweak-value-error
	 :too-many-fillers no-error-p 
	 fillers
	 role 'set-values)))
    (fclear-value instance role)
    (loop for f in fillers
          do (help-add-value instance role f))
    fillers ))        

(defun add-value (instanceOrId roleOrName fillerOrId &key context kb no-error-p)
  "Add the filler `fillerOrId' to the role `roleOrName' on the instance
`instanceOrId'.  If the role is single-valued and already has a filler,
or if the new value clashes with the role's type (range), abort the update
and signal an error."
  (obsolete-argument add-value kb)
  (obsolete-argument add-value context)
  (let (instance role filler)
    (evaluate-tweak-value-inputs add-value)
    (evaluate-tweak-value-filler add-value)
    (when (and (role-is-single-valued-p role)
	       (get-slot-value instance role)
	       (not (filler-equal (get-slot-value instance role) filler)))
      (return-from add-value 
	(signal-tweak-value-error
	 :too-many-fillers no-error-p 
	 (list (get-slot-value instance role) filler)
	 role 'add-value)))
    (help-add-value instance role filler)
    filler ))

(defun remove-value (instanceOrId roleOrName fillerOrId &key context kb no-error-p)
  "Remove the filler `fillerOrId' from the role `roleOrName' on the instance
`instanceOrId'."
  (obsolete-argument remove-value kb)
  (obsolete-argument remove-value context)
  (let (instance role filler)
    (evaluate-tweak-value-inputs remove-value)
    (evaluate-tweak-value-filler remove-value :skip-type-check-p t)
    (retract-role-filler instance role filler :retraction)
    filler ))


;;; Patch Loom4-0-72  3/31/03
;;; Added (tm) notice.

(defun get-version-string ()
  "Returns a string identifying the current LOOM implementation."
  (flet ((return-only-one-line (string)
	   (subseq string 0 (or (position #\Return string :test #'char=)
				(position #\Newline string :test #'char=)))))
    (let ((softwareVersion (return-only-one-line
			     (software-version #+TI nil)))
          (softwareType (software-type))
	  (lispVersion (return-only-one-line
			 (lisp-implementation-version #+TI nil))))
      (when (string= softwareVersion "") (setq softwareVersion "??"))
      (when (string= lispVersion "") (setq lispVersion "??"))
      (when (string= softwareType softwareVersion) (setq softwareType "")) ; Mac
      (format nil "LOOM(tm) ~A (~A), patch ~D (~A) [~A]  ~D ~A~:[~; Safe~]~:[~; Units~]~%~
                ~A ~:[version ~;~]~A~%~A ~:[version ~;~]~A~%~A~%~
                Loom is a trademark of the University of Southern California."
	      *release-version*
	      *release-date*
	      *patch-level*
	      *patch-date*
	      *release-status*
              (vectorize-features)
              (power-level)
              (safe-mode)
	      #+:measures t #-:measures nil
	      (lisp-implementation-type)
	      (search "version" lispVersion :test #'char-equal)
	      lispVersion
	      softwareType
	      (search "version" softwareVersion :test #'char-equal)
	      softwareVersion
	      *copyright-notice*
	      ) )))

;;; Patch Loom4-0-73  7/23/03
;;; Fix this up to handle odd characters.

#-:lucid
(defun htmlify-string (string)
  ;; Do appropriate substitution of escape characters for HTML!
  (if (or (position #\< string)
          (position #\> string)
          (position #\& string)
          (position #\" string))
    (coerce (loop for char across string
                  when (eql char #\<)
                  append '(#\& #\l #\t #\;)
                  else when (eql char #\>)
                  append '(#\& #\g #\t #\;)
                  else when (eql char #\&)
                  append '(#\& #\a #\m #\p #\;)
                  else when (eql char #\")
                  append '(#\& #\q #\u #\o #\t #\;)
                  else collect char)
            'string)
    string))

;; Lucid's loop doesn't support "across"
#+:lucid
(defun htmlify-string (string)
  ;; Do appropriate substitution of escape characters for HTML!
  (if (or (position #\< string)
          (position #\> string)
          (position #\& string)
          (position #\" string))
    (coerce (loop for char in (coerce string 'list)
                  when (eql char #\<)
                  append '(#\& #\l #\t #\;)
                  else when (eql char #\>)
                  append '(#\& #\g #\t #\;)
                  else when (eql char #\&)
                  append '(#\& #\a #\m #\p #\;)
                  else when (eql char #\")
                  append '(#\& #\q #\u #\o #\t #\;)
                  else collect char)
            'string)
    string))

(defmethod html-print-object ((self T) stream)
  (format stream "~A<P>" (htmlify-string (prin1-to-string self))))

(defmethod html-print-object ((self TBOX-CONCEPT) stream)
  (labels ((html-format-object (object stream breakP indent)
	     (format stream "~:[~*~;~%~vT~]" breakP indent)
	     (typecase object
	       ((or CLOS-INSTANCE BASIC-INSTANCE)
		(prin1 object stream))
	       (CONS
		(format-list? object stream :breakP breakP :indent indent))
	       (otherwise 
		(write-string (htmlify-string (prin1-to-string object)) stream))))
	   (format-list? (list stream &key breakP (indent 10))
             (if (consp list)
		 (cond ((eq (first list) 'quote)
			(format stream "~:[~*~;~%~vT~]'"  breakP indent)
			(format-list? (second list) stream :indent (+ indent 1)))
		       ((member (first list)
			    '(:satisfies :exists :for-all :for-some :collect :set-of))
			(format stream "~:[~*~;~%~vT~](~S ~S" 
				breakP indent (first list) (second list))
			(format-list? (if (eq (first list) :satisfies)  ; :collect, etc. as well?
					  (normalize-query (third list))
					(third list))
				      stream :breakp t :indent (+ indent 2))
			(format stream ")"))
		       ((member (first list) '(:at-least :at-most :exactly))
			(format stream "~:[~*~;~%~vT~](~9S ~D " 
				breakP indent (first list) (second list))
			(format-list? (third list) stream :indent (+ indent 12))
			(format stream ")"))
		       ((and (eq (first list) :relates)
			     (member (name (second list)) '(< > <> /= >= <= =)))
			(format stream "~:[~*~;~%~vT~](~{~2S ~S ~S~})" 
				breakP indent (rest list)))
		       ((member (first list)
				'(:through :through++ :through+- :through-+ :through--
				  :interval++ :interval+- :interval-+ :interval--))
			(format stream "~:[~*~;~%~vT~](~{~S ~A ~A~})" 
				breakP indent list))
		       (t (let* ((firstItem (first list))
				 (firstAtomP (atom firstItem))
				 (subIndent 
				  (if firstAtomP
				      (+ indent 
					 (min (+ 2 (length (format nil "~S"
							      (or (name firstItem) 
								  firstItem))))
					      12))
				    (+ indent 1))))
			    (loop for item in (if firstAtomP (rest list) list)
				 as break? = nil then t
				 initially (format stream "~:[~*~;~%~vT~](" breakP indent)
					   (when firstAtomP
					     (html-format-object firstItem stream nil indent)
					     (write-char #\Space stream))
				 do (format-list? item stream :breakp break?
						  :indent subIndent)
				 finally (format stream ")")))))
	       ;; CHANGE THIS: ??  USE BREAKP TO DETERMINE LINE BREAKS?
  	       ;(format stream "~<~%~20T~:;~S ~>" list)
		 (html-format-object list stream breakP indent)))
           (format-roles-clause (rolesClause stream)
             (format-list? 
              (loop for item in rolesClause
                    when (atom item)
                    collect (let ((role (get-relation item)))
                              (if (system-defined-concept-p role) item role))
                    else 
                    collect (cons (let ((role (get-relation (first item))))
                                    (if (system-defined-concept-p role) (first item) role))
				  ;; DO WE NEED TO WORRY ABOUT INSTANCES IN :value?
                                  (loop for (key value) on (rest item) by #'cddr
                                        collect key
                                        collect (if (eq key :type)
                                                  (get-concept value)
                                                  value))))
              stream))
           (dwim-filled-by-instances (definition)
             (cond ((atom definition)
                    definition)
                   ((not (search-tree-list-p '(:filled-by :one-of) definition))
                    definition)
                   ((eql (first definition) :filled-by)
                    `(:filled-by ,(second definition)
                         ,@(loop for i in (cddr definition)
                                 when (symbolp i)
                                 collect (or (get-instance i :error-p nil) i)
                                 else collect (dwim-filled-by-instances i))))
                   ((eql (first definition) :one-of)
                    `(:one-of
                      ,@(loop for i in (cdr definition)
                              when (symbolp i)
                              collect (or (get-instance i :error-p nil) i)
                              else collect (dwim-filled-by-instances i))))
                   (t (loop for form in definition
                            collect (dwim-filled-by-instances form))))) )
    (let (print-value)
      (loop for (defName . clauses) in (source-definitions self)
            do (format stream "(~A ~A" 
                       (typecase self 
                         (UNARY-CONCEPT "defconcept")
                         (TBOX-RELATION "defrelation")
                         (UNARY-RELATION "defproperty")
                         (t "defSOMETHING**"))
                       (if (eq defName (name self))       ;  TAR 3/8/96
                         (html-label self)
                         (html-label defName)))
	       (loop for (keywd value) on clauses by #'cddr
		 do (case keywd
		      ((:is :is-primitive) ;  TAR 3/11/96
		       (cond ((and (symbolp value)
				   (eql self
					(setq print-value
					  (typecase self
					    (UNARY-CONCEPT
					     (find-concept value
							   :no-warning-p t))
					    (TBOX-RELATION
					     (find-relation value
							    :no-warning-p t))
					    (UNARY-RELATION
					     (find-concept value
							   :no-warning-p t))))))
			      (format stream " ~S ~S" keywd
				      (or print-value value)))
			     ((and (consp value)
				   (member (first value) '(and :and or :or))
				   (symbolp (second value))
				   (null (cddr value))
				   (eql self
					(setq print-value
					  (typecase self
					    (UNARY-CONCEPT
					     (find-concept (second value)
							   :no-warning-p t))
					    (TBOX-RELATION
					     (find-relation (second value)
							    :no-warning-p t))
					    (UNARY-RELATION
					     (find-concept (second value)
							   :no-warning-p t))))))
			      (format stream " ~S (~S ~S)"
				      keywd (first value)
				      (or print-value (second value))))
			     (t (format stream "~%   ~:[:IS~;:IS-PRIMITIVE~] "
					(primitive-p self))
				(format-list?
				 (dwim-filled-by-instances
				  (getf (parsed-expressions self)
					:definition))
				 stream
				 :indent (if (primitive-p self) 17 7)))))
		      ((:antecedents :constraints :implies :defaults)
		       (format stream "~%   ~S " keywd)
		       (format-list? (dwim-filled-by-instances
				      (getf (parsed-expressions self)
					    (if (eql keywd :constraints)
						:implies
					      keywd)))
				     stream :indent (+ (length (symbol-name keywd)) 5)))
		      (:roles
		       (format stream "~%   ~S " keywd)
		       (format-roles-clause value stream))
		      ((:domain :range)
		       (format stream "~%   ~S " keywd)
		       (cond ((setq print-value (find-concept value :no-warning-p t))
			      (format stream "~A" print-value))
			     ((consp value)
			      (format-list? (mapcar #'(lambda (x) (or (find-concept x :no-warning-p t) x))
						    value)
					    stream 
					    :breakP nil
					    :indent (if (eq keywd :domain) 11 10)))
			     (t (format stream "~A" value))))
		      ((:domains)
		       (format stream "~%   ~S " keywd)
		       (format-list?
			(mapcar #'(lambda (x) (or (find-concept x :no-warning-p t) x))
				value)
			stream))
		      ((:function :predicate)
		       (format stream "~%   ~S " keywd)
		       (format stream "~A"
			       (with-output-to-string (s)
				 (format-list? value s
					       :indent (if (eq keywd :function) 13 14)))))
		      (:annotations
		       (format stream "~%   ~S " keywd)
		       (format-list? 
			(loop for v in value
			    when (atom v)
			    collect (or (find-concept v :no-warning-p t) v)
			    else collect (cons (or (find-relation
						    (first v) :no-warning-p t) 
						   (first v))
					       (mapcar #'(lambda (x) 
							   (or (find-instance 
								x :no-warning-p t)
							       x))
						       (rest v))))
			stream :indent 16))
		      (t (format stream "~%   ~S " keywd)
			 (format-list? value stream))))
	     (format stream ")<P>~%")) )))

;;; Patch Loom4-0-74  05/05/04
;;; Fix bug in unit reader;  Fix bug in rete match code.

(in-package "MEASURES")

(defun unit-to-dim-number (unit &key (value 1) (error-p t))
  (when (and (or (stringp unit) (symbolp unit))  ;; Handle Scalar!
	     (zerop (length (string unit))))
    (return-from unit-to-dim-number value))
  (unless (and (or (stringp unit) (symbolp unit))
	       (unit-char-p (char (string unit) 0) t))
    (error "Not a proper unit: ~A." unit))
  (let ((us (string unit))
	(slash-found 1))
    (when (stringp unit) (setq unit (intern unit *ms-package*)))     ; tar
    (labels
       ((unit-to-dn-1 (from)
	  (when (member (char us from) '(#\. #\/) :test #'char=)
	    (cond ((>= (1+ from) (length us))
		   (error "Invalid unit syntax: ~A." us))
		  ((char= (char us from) #\.)
		   (incf from))
		  ((eql slash-found -1)
		   (error "Invalid unit syntax: ~A." us))
		  (t (setq slash-found -1) (incf from))))
	  (let ((end-of-unit
		 (or (position-if-not #'constituent-unit-char-p us :start from)   ; tar
		     (length us))))
	    (if (or (zerop end-of-unit) (= end-of-unit from))
		(error "Invalid unit syntax: ~A." us)
		(let* ((us1 (subseq us from end-of-unit))
		       (unit1 (find-symbol us1
					; (symbol-package unit) ; <-- rm
					   *ms-package*  ; <-- tar
					   ))
		       (measure1 (measure-of unit1)))
		  (if measure1
		      (multiple-value-bind (exp end-of-exp)
			   (parse-integer us :start end-of-unit
					  :junk-allowed t)
			(let ((real-exp (* slash-found (or exp 1)))
			      (expv (ms-prim-id measure1))
			      (scale (cdr (assoc unit1 (ms-scale measure1)))))
			  (cons (%make-dim-number
				 :value (expt scale real-exp)
				 :prim-id (expt expv real-exp))
				(if (< end-of-exp (length us))
				    (unit-to-dn-1 end-of-exp)
				    nil))))
		      (if error-p
			  (error "Undefined unit ~A in unit specification: ~A."
				 us1 us)
			  (return-from unit-to-dim-number nil))))))))
      (let* ((unit0 (find-symbol us *ms-package*)) ; tar
	     (measure0 (measure-of unit0)))
	(if measure0
	    (%make-xdim-number
	     :value (rationalize
		     (* value (cdr (assoc unit0 (ms-scale measure0)))))
	     :prim-id (ms-prim-id measure0)
	     :pref-unit unit0)
	    (apply #'dim* value (unit-to-dn-1 0)))))))

(in-package "LOOM")

(defun retract-rete-full-support (instance node)
  ;; Situation: "instance" is now unsupported at rete node "node";
  ;; Mark it as unsupported, inform concept cohorts, and recursively retract
  ;;    full support from successors;
  ;; Tricky: If a successor of "node" only has :indirect support, then
  ;;    we can retract its support without looking for alternate support;
  (when (null (get-rete-node-support instance node))
    (return-from retract-rete-full-support nil))
  (set-rete-node-support instance node nil)
  (act-on-rete-monitored-instance instance node t)
  (loop for n in (rete-subsequent-output-nodes node)
       do
       ;; retract support from successors unless they have :direct
       ;;    support or no support:
       (when (eq (get-rete-node-support instance n) :indirect)
         (retract-rete-prior-support instance n)))
;  (loop for n in (rete-consequent-nodes node)   ;  TAR 3/2/94
;       do (retract-rete-antecedent-support instance n))
 )


;;; Patch Loom4-0-75  10/*/04
;;; 


;;; END OF LOOM 4.0 PATCHES ----------------------------------------------- ;

(in-package "LOOM")

(setf *patch-level* 74)
(setf *patch-date* "05-May-2004")


#+:TI(eval-when (load eval compile)
        (setq TICL::inhibit-fdefine-warnings inhibitRedefinitionWarningsP))
#+:LUCID(eval-when (load eval compile)
           (setq USER::*redefinition-action* inhibitRedefinitionWarningsP))
#+:EXCL(eval-when #-:allegro-v4.1(eval load compile)
                  #+:allegro-v4.1(:execute :load-toplevel :compile-toplevel)
          (setq EXCL::*redefinition-warnings* inhibitRedefinitionWarningsP))
#+:MCL(eval-when (:execute :load-toplevel :compile-toplevel)
	(setq CCL::*warn-if-redefine*  inhibitRedefinitionWarningsP))


