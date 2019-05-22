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

;;; FRAMES.LISP (TBOX)

(in-package "LOOM")

(export '( defframe define-frame pf
	  get-facets get-role-facets
	  find-named-superconcepts-of-supers find-named-subconcepts-of-subs 
	  ))

(defmacro pf (conceptName &key dont-substitute-names-p)
  "Print the frame definition of the concept `conceptName'";
  (let ((concept (find-or-evaluate-and-find conceptName :concepts)))
    (when concept
      `(print-frame-definition
	 (generate-frame-definition
	   ,(form-constant-form concept :very-slow-p t)
	   :substitute-names-p ,(not dont-substitute-names-p))
	 :newline-p t)) ))

(defun print-frame-definition (definition &key (output-stream t) newline-p)
  ;; Pretty-print the concept or relation definition specified in "definition";
  (when newline-p
      (fresh-line output-stream))
  (pprint definition)
;  (format output-stream "~A" (format-frame-definition definition))
  (values) )

(defun generate-frame-definition (concept &key augment-p substitute-names-p)
  ;; Generate a frame definition for the concept "concept";
  (flet ((generate-role-definition
	   (relation)
	   `(,(generate-reference-definition relation)
	     ,@(generate-facet-clauses
		 concept relation))))    
    (let* ((restrictedRelations (find-restricted-relations concept))
	   (makesSenseForRelations (find-makes-sense-for-relations concept))
	   (*dontSubstituteNamesP* (not substitute-names-p))
	   (*forceNamingOfUnnamedConcepts* nil))
      (declare (special *dontSubstituteNamesP* *forceNamingOfUnnamedConcepts*))
      `(defframe ,(name concept)
		 :supers ,(substitute-names-or-identifiers 
			    (find-named-superconcepts-of-supers
			      (super-concepts concept)))
	 :slots ,(append
		   (loop for r in restrictedRelations
			collect (generate-role-definition r))
		   (loop for r in makesSenseForRelations
			unless (member r restrictedRelations)
			collect (list r)))
	 ,@(generate-meta-clause concept :augment-p augment-p)
	 ,@(generate-annotations-clause-with-objects concept :augment-p augment-p)
	 ,@(generate-frame-definition-clause concept :augment-p augment-p)
	 ,@(generate-frame-constraints-clause concept :augment-p augment-p)
	 :subs ,(substitute-names-or-identifiers 
		  (find-named-subconcepts-of-subs
		    (sub-concepts concept)))
	 ) )))

(defun generate-facet-clauses (concept relation)
  ;; Return a keyword/argument list of clauses corresponding to non-nil
  ;;    facets of the role represented by the pair "concept" and "relation";
  (let ((restrictions (loop for res in (implied-restrictions concept)
			   when (eq (relation res) relation)
			   collect res))
	(defaultRestrictions
	  (loop for res in (default-features concept)
			   when (eq (relation res) relation)
			   collect res))
	(facetClauses nil))
    (flet ((generate-one-facet-p (keyword)
	     ;; Add to backwards list of keywords and values;
	     (let ((value (help-get-facets
			    relation keyword
			    restrictions defaultRestrictions)))
	       (when value
		 (push value facetClauses)
		 (push keyword facetClauses)
		 t))))
      (generate-one-facet-p :default-filled-by)
      (generate-one-facet-p :not-filled-by)
      (generate-one-facet-p :filled-by)
      (or (generate-one-facet-p :exactly)
	  (progn
	    (generate-one-facet-p :at-least)
	    (generate-one-facet-p :at-most)))
      (generate-one-facet-p :all)
      facetClauses )))

(defun help-get-facets (relation keywords restrictions defaultRestrictions)
  ;; Helping function for "generate-facet-clauses" and "get-role-facets";
  ;; Return a list of values corresponding to the frame keywords
  ;;    "keywords" for the role indicated by the pair "concept"
  ;;    and "relation";
  (labels ((get-facet-value
	     (keyword)
	     (case keyword
	       ((or :all :type)
		(let (type)
		  (loop for res in restrictions
		       when (and (eq (feature-type res) :value-restriction)
				 (subconcept-p (relation res) relation))
		       do (when (or (null type)
				    (subconcept-p (value-restriction res) type))
			    (setq type (value-restriction res))))
		  (substitute-names-or-identifiers type)))
	       (:at-least
		(let (minimum)
		  (loop for res in restrictions
		       when (and (eq (feature-type res) :min-restriction)
				 (subconcept-p (relation res) relation))
		       do (setq minimum 
			     (if minimum 
				 (max minimum (lower-bound res))
				 (lower-bound res))))
		  minimum))
	       (:at-most
		(let (maximum)
		  (loop for res in restrictions
		       when (and (eq (feature-type res) :max-restriction)
				 (subconcept-p relation (relation res)))
		       do (setq maximum 
			     (if maximum (min maximum (upper-bound res))
				 (upper-bound res))))
		  maximum)
		(loop for res in restrictions
		     when (eq (feature-type res) :max-restriction)
		     do (return (upper-bound res))))
	       (:filled-by
		(loop for res in restrictions
		     when (and (eq (feature-type res) :filled-by)
			       (eq (relation res) relation))
		     do (return (substitute-names-or-identifiers 
				  (role-fillers res)))))
	       (:not-filled-by
		(loop for res in restrictions
		     when (and (eq (feature-type res) :not-filled-by)
			       (eq (relation res) relation))
		     do (return (substitute-names-or-identifiers 
				  (non-role-fillers res)))))
	       (:default-filled-by
		(loop for res in defaultRestrictions
		     when (and (eq (feature-type res) :role-fillers)
			       (eq (relation res) relation))
		     do (return (substitute-names-or-identifiers 
				  (role-fillers res)))))
	       (:exactly
		(let ((lowerBound (get-facet-value :at-least)))
		  (when (and lowerBound
			     (eql lowerBound (get-facet-value :at-most)))
		    lowerBound))))))
    (if (consp keywords)
	(loop for key in keywords
	     collect (get-facet-value key))
	(get-facet-value keywords)) ))

(defun generate-frame-definition-clause (self &key augment-p)
  ;; Helping function for "generate-frame-definition";
  ;; Return a list containing the definition clause for "self",
  ;;    or nil if there is none;
  ;; Note: Code here borrows from code in "generate-defining-expression";
  (declare (special *dontSubstituteNamesP*))
  (let ((definition
	  (if (and augment-p
		   (or (classified-p self)
		       (member :being-classified (system-attributes self))))
	      (generate-conjoined-clauses
		(generate-definition-clauses self))
	      (getf (parsed-expressions self) :definition))))
    (unless *dontSubstituteNamesP*
      (setq definition
	    (generate-dereferenced-expression definition)))
    (when definition
      (when (eq definition :primitive)
	(setq definition 'Thing))
      `(,(if (primitive-p self) :primitive-definition :definition)
	,definition)) ))

(defun generate-frame-constraints-clause (self &key augment-p)
  ;; Return a constraints clause for the concept "self";
  ;; If "augment-p", show inherited as well as local constraints;
  (declare (special *dontSubstituteNamesP*))
  `(:implies
     ,(if (and augment-p
	       (or (classified-p self)
		   (member :being-classified (system-attributes self))))
	  (generate-conjoined-clauses
	    (generate-constraint-clauses self))
	  (if *dontSubstituteNamesP*
	      (getf (parsed-expressions self) :implies)
	      (generate-dereferenced-expression
		(getf (parsed-expressions self) :implies))))) )

(defun generate-meta-clause (concept &key augment-p)
  ;; Helping function for "generate-frame-definition";
  ;; Return a list containing a :meta clause for "concept";
  (declare (ignore augment-p))
  (let ((attributes
	  (remove nil
		  `(,(when (incoherent-p concept) 'INCOHERENT-P)
		    ,(when (monotonic-p concept) 'MONOTONIC-P)
		    ,(when (recursive-p concept) 'RECURSIVE-P)))))
    (when attributes
      `(:meta ,attributes)) ))

(defun substitute-names-or-identifiers (listOfObjects)
  ;; Return a list of names or identifiers of objects in
  ;;    "listOfObjects" (unless *dontSubstituteNamesP* is set);
  ;; Otherwise, just return "listOfObjects";
  ;; Note: Works for single objects as well as lists;
  (when listOfObjects
    (if (atom listOfObjects)
	(generate-reference-definition listOfObjects) 
	(generate-multiple-reference-definitions listOfObjects))) )


  ;;
;;;;;;; "get-role-facets" and "get-facets"
  ;;

(defun get-role-facets (conceptId relationId keywords)
  ;; Return a list of values corresponding to the frame keywords
  ;;    "keywords" for the role indicated by the pair "concept"
  ;;    and "relation";
  (let* ((*dontSubstituteNamesP* t)
	 (concept (get-concept conceptId))
	 (relation (get-relation relationId))
	 (restrictions (loop for res in (implied-restrictions concept)
			    when (eq (relation res) relation)
			    collect res))
	 (defaultRestrictions
	   (loop for res in (default-features concept)
		when (eq (relation res) relation)
		collect res)))
    (declare (special *dontSubstituteNamesP*))
    (help-get-facets relation keywords restrictions defaultRestrictions) ))


  ;;
;;;;;; Retrieving role relations for a concept
  ;;

(defun find-legal-relations (concept)
  ;; Retrieve a list of relations that make sense for a concept;
  ;; TO DO: REWRITE THIS WHEN "role" OBJECTS BECOME FULLY IMPLEMENTED;
  (seal-network)
  (let ((relations (list-current-local-instances (loom-constant RELATION)))
	result)
    (loop for r in relations
	 when
	 (let ((domain (implied-domain r)))
	   (or (eq domain *thing*)
	       (subconcept-p concept domain)
	       (not (disjoint-concepts-p domain concept))))
	 do (push r result))
    result ))

(defun find-makes-sense-for-relations (concept)
  ;; Retrieve a list of relations that make sense for a concept;
  ;; TO DO: REWRITE THIS WHEN "role" OBJECTS BECOME FULLY IMPLEMENTED;
  (seal-network)
  (let ((relations (list-current-local-instances (loom-constant RELATION)))
	result)
    (loop for r in relations
	 when
	 (let ((domain (implied-domain r)))
	   (or (eq domain *thing*)
	       (subconcept-p concept domain)))
	 do (push r result))
    result ))

(defun find-restricted-relations (concept)
  ;; Retrieve a list of relations that are restricted by "concept",
  ;;    or by one of its super concepts;
  (let (result)
    (loop for res in (implied-restrictions concept)
	 do (pushnew (relation res) result))
    result))

(defun find-locally-restricted-relations (concept)
  ;; Retrieve a list of relations that are restricted by "concept",
  ;;    but not by any of its super concepts;
  (let (inheritedRelations result)
    (loop for super in (super-concepts concept)
	 do
	 (loop for res in (implied-restrictions super)
	      do
	      (pushnew (relation res) inheritedRelations)))
    (loop for res in (implied-restrictions concept)
	 unless (member (relation res) inheritedRelations)
	 do (pushnew (relation res) result)) ))


  ;;
;;;;;; "find-named-superconcepts" and "find-named-subconcepts"
  ;;

;; TAR 11/4/96  Replaced "system-defined-concept-p" with "system-defined-name-p"

(defun find-named-superconcepts-of-supers (listOfSupers)
  "Return a list of the most specific superconcepts at or above
      those in `listOfSupers' that have user-defined names"
  (let ((visibleContexts (context-precedence-list *context*))
	allNamedSupers computeMostSpecificP)
    (loop for sup in listOfSupers
	 do
	 (if (or (system-defined-name-p sup) (null (name sup)))  
	     (progn
	       (loop for supOfSup in (all-super-concepts sup)
		   unless (or (and (system-defined-p supOfSup)
				   (system-defined-name-p supOfSup))
			       (null (name supOfSup))		  ; TAR 12/13/96
			       (not (member (context supOfSup) visibleContexts)))
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
	(visibleContexts (context-precedence-list *context*))
        (systemDefinedConcepts nil)
        (alternativeConcepts nil))
    (labels ((help-find-named-subconcepts (subConcept)
	       (if (or (and (system-defined-p subConcept)
			    (system-defined-name-p subConcept))	  ; TAR 11/7/96
		       (null (name subConcept))			  ; TAR 12/13/96
		       (not (member (context subConcept) visibleContexts)))
		   (loop for sub in (sub-concepts subConcept)
                       do (help-find-named-subconcepts sub))
                 (pushnew subConcept alternativeConcepts))))
      (loop for tail on namedConcepts
	  when (or (and (system-defined-name-p (car tail))
			(not (undefined-p (car tail))))		  ; TAR 11/7/96
		   (null (name (car tail)))			  ; TAR 12/13/96
		   (not (member (context (car tail)) visibleContexts)))
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

(defun find-most-specific-named-super-concepts (listOfConcepts)
  ;; Return a list of the most specific named concepts that are
  ;;    ancestors (inclusive) of concepts in "listOfConcepts";
  (find-named-superconcepts-of-supers
       (most-specific-conjuncts
        (most-specific-concepts listOfConcepts))) )


;;; TO DO:
#|

PLACE RESTRICTION OBJECTS INTO THE CONSTRAINT EXPRESSIONS
INSTEAD OF PRETTY-PRINTING THEM

|#

;---------------------------------------------------

#|

(initialize-network)
(defconcept a :properties :monotonic)
(defconcept b :is-primitive a :implies (:at-most 1 r))
(defrelation r)
(defrelation s)
(defconcept c :is (:and b (:at-least 1 r) (:at-most 1 s) ))
(seal-network)
(defconcept c :is (:and b (:at-least 1 r) (:at-most 1 s) (:all r b)))

(find-makes-sense-for-relations (fc c))

(tell (r c 3))

;(find-definition (fc b))

(pf a)
(pf b)
(pf c)

(pf c :dont-substitute-names-p t)

(get-role-facets 'c 'r :all)
(get-role-facets 'c 's '(:at-least :at-most))

|#
