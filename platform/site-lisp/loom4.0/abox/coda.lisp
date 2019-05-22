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

;;; CODA.LISP (ABOX)

;;; Bring up the network.  Also define more meta functions.

;;; Functions in this file must be (some of them) defined AFTER the LOOM network
;;;    is up, i.e., after the call to "initialize-network".
;;; The existential dependency on the LOOM network happens because calls to
;;;    "retrieve" are embedded within some of the function definitions.

(in-package "LOOM")

(export '( find-roles-of-instance find-roles-of-concept find-role-with-facet
	  accelerate-matching decelerate-matching))

(eval-when (compile load eval)  

;;; Wipe out contexts to avoid redefining them:
;;;    Side-effect: Reloading this file has the
;;;    effect of erasing any pre-existing LOOM contexts;

  (destroy-all-contexts)
  (undefine-built-in-theory)

;;; Create core contexts for Loom.
;;; BUILT-IN-THEORY contains top-level concept and relation definitions;
;;; BOTTOM-THEORY is always linked below all other theories  This
;;;    makes it easy to find "background" objects even when you don't know where
;;;    they are located.

  (defcontext BUILT-IN-THEORY :theory ())
;;; THIS HAPPENED ALREADY:
;  (find-or-create-BOTTOM-THEORY)

;;; Ensure that a network exists before compiling or loading
;;;    meta-instance function, i.e., make sure that the meta-box
;;;    definitions in the built-in context exist.

  (when (null (eval-concept-id 'META-THING BUILT-IN-THEORY))
    (change-context 'BUILT-IN-THEORY)
    (reset-features)
    (initialize-network)
    (seal-network))

  )  ;; END EVAL-WHEN (LOAD EVAL COMPILE)


  ;;
;;;;;; Temporal functions that can't compile before the net is up
  ;;

;;; This function is called from code in "probe.lisp":
(defun collect-previous-role-fillers (?instance ?role)
  ;; Retrieve the fillers of "?role" for "?instance" at time
  ;;    *previously*;
  (retrieve ?f (:previously (?role ?instance ?f))) )

;;; These two functions are called from code in "productions.lisp":
(defun detects-instance-of-p (?instance ?concept)
  ;; Helping function for "apply-cohort-to-binding-sets";
  ;; Return t if ?instance has just begun satisfing ?concept;
  (ask (:detects (?concept ?instance))) )

(defun undetects-instance-of-p (?instance ?concept)
  ;; Helping function for "apply-cohort-to-binding-sets";
  ;; Return t if ?instance has just ceased to satisfy ?concept;
  (ask (:undetects (?concept ?instance))) )



  ;;
;;;;;; Set member functions
  ;;

(defmethod compute-members-of-collection-instance ((self DB-INSTANCE))
  ;; Return a list of instances that are members of the instance "self";
  ;; THIS CODE PERMITS THE "members" RELATION TO BE PRIMITIVE AND POLYMORPHIC
  ;;    AT THE SAME TIME.  A BETTER SOLUTION SHOULD BE WORKED OUT;
  (macrolet ((db-instance--members
	       (instance)
	       (let (*ignoredParameters*)
		 (declare (special *ignoredParameters*))
		 (reparameterize-parameters&body
		   (cdr (form-primitive-generator-code 
			  (get-relation 'MEMBERS)))
		   `(,instance)))))
    (db-instance--members self)) )

(defmethod compute-members-of-collection-instance ((self CLOS-INSTANCE))
  ;; Return a list of instances that are members of the instance "self";
  (macrolet ((db-instance--members
	       (instance)
	       (let (*ignoredParameters*)
		 (declare (special *ignoredParameters*))
		 (reparameterize-parameters&body
		   (cdr (form-primitive-generator-code 
			  (loom-constant MEMBERS)))
		   `(,instance)))))
    (db-instance--members self)) )

(defmethod compute-members-of-collection-instance (self)
  ;; Return a list of instances that are members of the instance "self",
  ;;    where "self" is a non-LOOM object; 
  (error "Can't compute `members' of an instance of type ~S.~%   ~
          Call your local LOOM representative" (type-of self)))

(defmethod compute-cardinality-of-collection ((self CONS))
  ;; "self" is a list;
  (length self) )

(defmethod compute-cardinality-of-collection ((self DB-INSTANCE))
  ;; "self" is a collection, set, etc;
  "NOT YET IMPLEMENTED")



  ;;
;;;;;; Meta-Box Retrieval Functions
  ;;

#|
;;; Obsolete functions that reference obsolete relations --  TAR 5/18/95

(defun fetch-role (conceptOrName relationOrName)
  ;; Return the instance representing the role associated with
  ;;    concept "conceptOrName" and relation "relationOrName";
  ;; Create one if none exists;
  (let* ((?concept (get-concept conceptOrName))
	 (?relation (get-relation relationOrName))
 	 (?role (car
		  (retrieve ?r (:and (has-role ?relation ?r)
				     (role--concept ?r ?concept))))))
    (when ?role
      (return-from fetch-role ?role))
    (setq ?role
	  (tell (:about $r
			Role
			(role--concept ?concept)
			(role--relation ?relation))
		(has-role ?concept $r)
		(has-role ?relation $r)
;		$r				; DGB 4/14/92 removed
		))
    ?role ))


  ;;
;;;;;; Search routines
  ;;

;;; These routines look for meta-instances having particular properties

;;; REWRITE THIS USING RETRIEVE:
(defun find-roles-of-instance (instance &key most-specific-p)
  ;; Return for both local and inherited roles attached to the
  ;;    instance "instance";
  ;; If :most-specific-p, return only the most-specific roles;
  (let ((roles (loop for c in (db-type instance)
		    append (find-roles-of-concept c))))
    (if most-specific-p
	(most-specific-roles roles)
	roles) ))

(defun find-roles-of-concept (?conceptOrName &key most-specific-p)
  ;; Look for both local and inherited roles attached to the
  ;;    concept referred to by "conceptOrName";
  ;; If :most-specific-p is set, then only the most
  ;;    specific roles are returned;
  (let ((roles
	  (retrieve ?r (has-role (superrelations (name--concept ?conceptOrName)) ?r))))
    (if most-specific-p
	(most-specific-roles roles)
	roles) ))

(defun find-role-with-facet (?instance ?relationOrName ?facetOrName)
  ;; Look for the most-specific role of "?instance" with relation
  ;;    "relationOrName" with a value for the facet "facetOrName";
  ;; If more than one is found, pick any one;
  ;; "relationOrName" and "facetOrName" can be relations or names
  ;;    of relations;
  (let ((roles
	  (retrieve ?r (:and (has-role (name--relation ?relationOrName) ?r)
			     (:exists ?v (role-values
					     ?r (name--relation ?facetOrName) ?v))
			     (instance-of ?instance (role--concept ?r))))))
    ;; "roles" contains all roles with a value for the facet "?facetName"
    ;;    which belong to "?instance";
    (car (most-specific-roles roles)) ))


  ;;
;;;;;; "check-instance"
  ;;

(defun check-instance (instance &key classify-p)
  "Return two values
      (1) t if `instance' is coherent;
      (2) if `instance' is incoherent, a list of features 
          violated by instance.
   If `classify-p' is set, temporarily classify `instance'
      so that constraints attached to derived concepts are
      also checked."
;;; TEMPORARILY DISABLED -- CODE IS INCOMPLETE:
   (declare (ignore instance classify-p))
 (values t nil)
;   (let (type residue violatedFeatures incoherentP)
;     (flet ((check-feature
;	      (ftr)
;	      (when (detect-feature/fillers-conflict-p ftr instance)
;		(push ftr violatedFeatures))))
;       (multiple-value-setq (type residue)
;	 (find-type&residue-features instance))
;       (loop for ftr in (implied-restrictions type)
;	    do (check-feature ftr))
;       (loop for ftr in (implied-comparisons type)
;	    do (check-feature ftr))
;       (loop for ftr in (implied-computed-features type)
;	    do (check-feature ftr))
;       (setq incoherentP (incoherent-p instance))
;       (loop for ?role in (find-role-relations-of-instance instance)
;	    do
;	    (loop for ?f in (fget-value instance ?role)
;		 when (ask (and (non-loom-thing ?f)
;				(for-some ?c
;					  (and (relation--range ?f ?c)
;					       (not (?c ?f))))))
;		 do
;		 (setq incoherentP t)))
;       (values
;	 (not (or incoherentP
;		  violatedFeatures))
;	 violatedFeatures) ))
   )

;;; TEMPORARILY DISABLED -- CODE IS INCOMPLETE:
;(defun find-role-relations-of-instance 
;       (instance &key all-roles-p filled-roles-p most-specific-p)
;  ;;
;  (if filled-roles-p
;      (if (classified-instance-p instance)
;	  (loop for entry in (dynamic-variables instance)
;	       when (and (rest entry)
;			 ;; skip past phantoms:
;			 (relation-p (first entry)))
;	       collect (first entry))
;	  ;; CLOS insatnce:
;	  (loop for role in (find-roles-of-concept 
;			 (find-type&residue-features instance))
;	       when (fget-value instance role)
;	       collect role))
;      (find-roles-of-concept
;	(find-type&residue-features instance)
;	:all-roles-p all-roles-p)) )

;;; FASTER: COLLECT IMPLIED-DEPENDENTS OF "concept" AND ITS SUPERS:
;;;    BUT: THIS FASTER STRATEGY HAS PROBLEMS WITH INVERSE RELATIONS;
(defun find-role-relations-of-concept 
       (concept &key all-roles-p most-specific-p)
  ;; Return a list of binary relations referenced by roles of "concept";
  ;; If "all-roles-p", include roles whose domain is Thing;
  (let (result)
    (do-retrieve ?r (relation ?r)
      (when (and (binary-p ?r)
                 (or all-roles-p
                     (neq (implied-domain ?r) *thing*))
                 (subconcept-p concept (implied-domain ?r)))
        (push ?r result)))
    (if most-specific-p
      (most-specific-concepts result)
      result) ))


  ;;
;;;;;; Most-specific Computations
  ;;

(defun most-specific-roles (?listOfRoles)
  ;; "roleList" is a list of roles;
  ;; Eliminate any role such that there exists another
  ;;    role in the list that specializes the same relation, and whose
  ;;    concept is more specific;
  (retrieve ?r (:and (members ?listOfRoles ?r)
		     (:fail (:exists ?otherR
				      (:and (members ?listOfRoles ?otherR)
					    (same-as (role--relation ?otherR)
						     (role--relation ?r))
					    (subrelations (role--concept ?r)
							 (role--concept ?otherR))))))) )

;;; End of obsolete functions
|#

  ;;
;;;;;; HOLDS-TRUE functions
  ;;

(defun concept-holds-true-p (?c ?i)
  (ask (?c ?i)) )

(defun binary-relation-holds-true-p (?r ?i ?f)
  (ask (?r ?i ?f)) )

(defun ternary-relation-holds-true-p (?r ?v1 ?v2 ?v3)
  (ask (?r ?v1 ?v2 ?v3)) )

  ;;
;;;;;; Optimization Functions
  ;;

(defparameter *forcibly-backchained-concepts* nil)

(defun accelerate-matching ()
  ;; Optimize ABox performance by forcing selected forward-chaining 
  ;;    concepts to run backward-chaining;
  (let ((continueP t))
    (when *forcibly-backchained-concepts*
      (decelerate-matching))
    (loop for c in (retrieve ?c (Concept ?c))
	 unless (or (primitive-p c)
		    (backward-chaining-p c)
		    (default-concepts c)
		    (default-features c))
	 do (mark-backward&post c))
    (seal-unsealed-concepts)
    (loop while continueP
	do (setq continueP nil)
	   (loop for c in (find-forward-concepts-with-backward-antecedents)
	       do (mark-backward&post c)
		  (setq continueP t)))	
    (seal-unsealed-concepts) ))

(defun find-forward-concepts-with-backward-antecedents ()
  ;; Find forward-chaining concepts that have backward-chaining 
  ;;    antecedents;
  (loop for c in (retrieve ?c (Concept ?c))
       when (and (not (backward-chaining-p c))
		 (loop for a in (antecedents c)
		      thereis (backward-chaining-p a)))
       collect c) )

(defun mark-backward&post (concept)
  ;; Unless "concept" is marked :forward-chaining, mark it 
  ;;    :backward-chaining and post it for sealing;
  (unless (member :forward-chaining (attributes concept))
    (addf (attributes concept) :backward-chaining)
    (setf (backward-chaining-p concept) t)  ; Was :undecided  ;; TAR 2/17/98
    (setf (completed-p concept) t)
    (post-unsealed-concept concept :sealable-p t) 
    (push concept *forcibly-backchained-concepts*)) )

(defun decelerate-matching ()
  ;; Restore forward-chainingness to concepts which have been
  ;;    made backward-chaining;
  (loop for c in *forcibly-backchained-concepts*
       do (delf (attributes c) :backward-chaining)
	  (setf (backward-chaining-p c) nil))
  (setq *forcibly-backchained-concepts* nil))

  ;;
;;;;;; Reification Concept Retrieval Functions
  ;;

(defun lookup-link (?relation ?source ?sink)
  ;; look for an existing link and verify that it is still valid
  (let* ((?reification (fget-value ?relation 'reified-by))
	 (?targetCase (fget-value ?relation 'target-role)))
    (first (retrieve ?link (:and (link-object ?source ?link)
				 (?targetCase ?link ?sink)
				 (?reification ?link)))) ))

(defun get-link (relation source sink)
  (declare (special *InsideQueryP*))
  (let ((?reification (get-value relation 'reified-by)))
    (flet ((create-link (relation ?source ?sink)
	     (let* ((?sourceCase (fget-value relation 'source-role))
		    (?targetCase (fget-value relation 'target-role))
		    (?aLink (create nil ?reification)))
	       (tell (?targetCase ?aLink ?sink)
		     (?sourceCase ?aLink ?source))
	       (store-link relation ?source ?sink ?aLink)
	       ?aLink)))
      (let ((theLink (lookup-link relation source sink)))
	(if *InsideQueryP*
	  theLink			; Queries don't create links!
	   (or theLink (create-link relation source sink))) ) )))
