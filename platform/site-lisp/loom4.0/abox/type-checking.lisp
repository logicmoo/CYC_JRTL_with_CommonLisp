;;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1999, 2003 University of Southern California                 ;
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


(defun compatible-type&instance-p (instance type justification)
  ;; Situation: "instance" is being asserted or inferred to belong to the
  ;;    concept "type";
  ;; Return t if the creation type of "instance" is compatible with "type";
  ;; `compabible' is defined to mean that either 
  ;; Otherwise, generate a warning message and return nil;
  ;; CONSIDER ADDING WARNING WHEN ASSERTING :perfect CONJUNCT;
  (when (neq justification :assertion)
    (return-from compatible-type&instance-p t))
  (let ((creationType (get-creation-type instance))
        (concept (if (property-p type) (implied-domain type) type)))
    (when (read-only-p concept)
      (grumble "Illegal attempt to assert an instance of the read only~%~
                concept ~S." (generate-external-reference concept))
      (return-from compatible-type&instance-p nil))
    (or (subconcept-p creationType concept)
        (subconcept-p concept creationType)
        (progn
          (grumble "Cannot assert that instance ~S with creation type ~S belongs~%~
                    to the concept ~S because two types are not compatible."
                   (generate-external-reference instance)
                   (generate-external-reference creationType)
                   (generate-external-reference type))
          nil)) ))

(defun compatible-domain&range-p (role instance filler justification)
  ;; Return t if the creation types of "instance" and "filler" are 
  ;;    compatible with the domain and range of "role";
  ;; Otherwise generate a warning and return nil;
  (and (compatible-type&instance-p
        instance (or (implied-domain role) *thing*) justification)
       (compatible-type&instance-p
        filler (implied-range role) justification)) )
       

;; IN "clos-instances":
(defmethod assert-conjunct ((instance INSTANCE-WITH-CONCEPTS) conjunct justification)
  ;; Add "instance" to the index of local instances for the LOOM concept
  ;;    "conjunct" and push "conjunct" onto the list of dynamically asserted 
  ;;    conjuncts attached to "instance";
  ;; Clear the cache containing the type of "instance";
  (when *safe-mode-p*
    (when (not (compatible-type&instance-p instance conjunct justification))
      (return-from assert-conjunct nil)))
  (unless (member conjunct (dynamically-asserted-conjuncts instance))
    (push conjunct (dynamically-asserted-conjuncts instance))
    (add-to-local-instances conjunct instance)
    (setf (cached-types instance) nil)) )

;; IN "modify":

(defmethod assert-conjunct ((instance DB-INSTANCE) conjunct justification)
  ;; The assertion of a unary predicate translates into the entry 
  ;;    of the concept "conjunct" into "(conjuncts-table instance)";
  ;; Record the assertion, and test for posting on the queue of
  ;;    modified db-instances;
  (let ((originalInstance instance))
    (setq instance (womp&coerce-to-*world* instance :mergeable-instance-p-test t))
    (when (and (neq originalInstance instance)
	       (not (mergeable-instance-p instance)))
      ;; a constant was substituted for "instance":
      (assert-conjunct instance conjunct justification)
      (return-from assert-conjunct nil))
    (ensure-sealed-concept conjunct)
    (when *safe-mode-p*
      (when (not (compatible-type&instance-p instance conjunct justification))
        (return-from assert-conjunct nil)))
    (when (add-to-conjuncts-table-p instance conjunct justification)
      (post-non-analyzable-modified-instance
       instance :assertion (default-mode-p))
      ;; SEE IF WE CAN ELIMINATE THIS NOW THAT WE HAVE HISTORY INSTANCES:
      (push conjunct
            (newly-asserted-conjuncts (modification-summary instance)))) ))

(defmethod assert-conjunct (self conjunct justification)
  ;; Situation:  "self" is not a classified instance or clos instance, so
  ;;    we can't modify it, or record truth maintenance dependencies for it;
  ;; If "justification" is :assertion, add "self" to the list
  ;;    of local instances recorded for "conjunct";
  ;; If "self" clashes with "conjunct" signal an error unless
  ;;    "set-value" or "add-value" has bound the special variable
  ;;    *typeClashDetectedP* or incoherence is being trapped;
  ;; If the special variable *constantFillerConflictsWithConjunctP* is bound
  ;;    (by "propagate-forward-inferences") then check for incoherence
  ;;    and set the variable accordingly;
  (declare (special *constantFillerConflictsWithConjunctP*))
  (ensure-sealed-concept conjunct)
  (when *safe-mode-p*
    (when (not (compatible-type&instance-p conjunct self justification))
      (return-from assert-conjunct nil)))
  (case justification
    (:assertion
     (add-to-local-instances conjunct self))
    ;; OOPS: THIS "not-has-instance-p" TEST LOOKS TOO HARSH??:
    (:domain/range
     (when (and *world*
                (boundp '*constantFillerConflictsWithConjunctP*))
       (setq *constantFillerConflictsWithConjunctP*
             (not-has-instance-p conjunct self))))) )

(defmethod assert-role-filler ((instance CLOS-INSTANCE) role filler justification)
  ;; Assert to the database that "filler" is a filler of "role" of "instance";
  (when *safe-mode-p*
    (when (not (compatible-domain&range-p role instance filler justification))
      (return-from assert-role-filler nil)))
  (let ((oldValue (get-slot-value instance role)))
    (unless (filler-matches-old-filler-p role filler oldValue)
      (assert-half-role-filler instance role filler oldValue :assertion))
    t))                                ; return success TAR 8/11/93

(defmethod assert-role-filler ((instance INSTANCE-WITH-INVERSES) role filler justification)
  ;; Assert to the database that "filler" is a filler of "role" of
  ;;    "instance";  Also assert the inverse relationship, if one exists;
  ;; CAUTION: Asserting to a CLOS-INSTANCE is not symmetric with asserting
  ;;    to its inverse if "filler" is a LOOM instance!!!
  (when *safe-mode-p*
    (when (not (compatible-domain&range-p role instance filler justification))
      (return-from assert-role-filler nil)))
  (let ((oldValue (get-slot-value instance role))
        (inverseRole (inverse role)))
    (unless (filler-matches-old-filler-p role filler oldValue)
      (assert-half-role-filler instance role filler oldValue :assertion)
      (when inverseRole
        (assert-half-role-filler filler inverseRole instance 
			         (get-slot-value filler inverseRole)
			         :assertion)))
    t))

(defmethod assert-role-filler ((instance DB-INSTANCE) role filler justification)
  ;; Assert to the database that "filler" is a filler of "role" of
  ;;    "instance";
  ;; If "role" has an inverse, assert the inverse role relation as well;
  ;; Notify the TMS of changes that it needs to know about;
  (let ((fillerIsMergeableP (mergeable-instance-p filler))
	(originalFiller filler)
	fillerIsModifiableP oldValue inverseRole oldInverseFillers)
    ;; coerce instance and filler to *world*
    (setq instance (womp&coerce-to-*world* instance :mergeable-instance-p-test t))
    (when fillerIsMergeableP
      (setq filler (womp&coerce-to-*world* filler :mergeable-instance-p-test t)))
    (setq fillerIsModifiableP fillerIsMergeableP)
    (ensure-sealed-relation role)
    (when *safe-mode-p*
      (when (not (compatible-domain&range-p role instance filler justification))
        (return-from assert-role-filler nil)))
    (setq oldValue (get-slot-values instance role))
    ;; if filler is already present, insure that assertion is recorded,
    ;;    and exit
    (when (member filler oldValue :test #'FILLER-EQUAL)
      (when (eq justification :assertion)
	(insure-asserted-role-filler instance role filler)
	(when (and fillerIsModifiableP (inverse role))
	  (insure-asserted-role-filler filler inverseRole instance)))
      (return-from assert-role-filler t))
    ;; assert links for "role" and "inverseRole":
    (setq filler
	  (assert-half-role-filler instance role filler oldValue justification))
    ;; filler could have merged with a constant:
    (when (neq filler originalFiller)
      (setq fillerIsModifiableP (mergeable-instance-p filler)))
    (when fillerIsModifiableP
      (if (setq inverseRole (inverse role))
	  (progn
            (setq oldInverseFillers
		  (get-slot-values filler inverseRole)) ;; AVOIDED WORLDS COERSION
	    (setq instance
		  (assert-half-role-filler
		    filler inverseRole instance oldInverseFillers justification)))
	  (assert-phantom-inverse-role-filler role filler instance)))
    ;; infer skolem fillers along the role-chain of compositions:
    (when (and *monotonic-mode-p*
	       (eq (defined-as role) :composition)
	       (role-is-single-valued-p role))
      (infer-component-fillers instance role filler justification))
    ;; assert support for implied domain to be a conjunct of "instance",
    ;;    and implied range to be a conjunct of "filler".
    ;; Very tricky: If value got clipped, we avoided retracting domain-
    ;;    induced conjunct, and the now invalid "oldValue" blocks
    ;;    an attempt to reassert the same domain-induced conjunct;
    (when (and (null oldValue)
	       (neq (implied-domain role) *Thing*))
      (assert-conjunct instance (implied-domain role) :domain/range))
    ;; same trickiness here:
    (when (and fillerIsModifiableP
	       (null oldInverseFillers)
	       (neq (implied-range role) *Thing*))
      (assert-conjunct filler (implied-range role) :domain/range))
    t						; return success  ; DGB 6/13/91 
    ))
