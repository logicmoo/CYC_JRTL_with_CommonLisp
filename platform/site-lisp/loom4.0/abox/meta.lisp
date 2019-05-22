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

;;; META.LISP (ABOX)

;;; Library of functions for creating and inquiring about meta-instances --
;;;    ABox instances which represent concepts, relations, roles, etc.

(in-package "LOOM")

(export '(find-user-defined-superconcepts-of-supers
          find-user-defined-subconcepts-of-subs
          find-restriction find-constraint
	  compute-value-restriction compute-conjunction-concept
	  list-role-names&values list-inverse-role-names&values
	  specializes-p subsumes-p implies-p disjoint-concepts-p
	  concept-p property-p relation-p set-p meta-thing-p instance-p
	  fetch-role))


;;; The function "load-meta-things" in file "built-in.lisp"
;;;    contains definitions of all meta-thing objects.


  ;;
;;;;;; "show" methods for concepts and contexts
  ;;

(defmethod show ((self TBOX-CONCEPT) &key (stream t))
  ;; Print the most important slots of "self"
  (KBCLASSES::show-visible-slots self :stream stream) 
  (loop for pair in (dynamic-variables self)
       do
       (let ((slotName (car pair)))
	 (format stream ":~S~20,5T~S~%" 
		 slotName (get-slot-values self (get-relation slotName))))) )

(defmethod show ((self CONTEXT) &key (stream t))
  ;; Print the context slots of "self";
  ;; Do not print the slots inherited from DB-INSTANCE;
  (format stream "~%")
  (loop for slotName in 
       (get-names-of-slots 'CONTEXT)
       do 
       (format stream ":~S~20,5T~S~%" slotName (funcall slotName self))) )

(defmethod show ((self SYMBOL) &key (stream t))
  ;; Look for an object named "self" and print it;
  (let ((object (or (get-instance self)
		    (get-concept self)
		    (get-relation self))))
    (if object
	(show object)
	(format stream "Can't find object named ~S" self)) ))

(defmethod show-all ((self SYMBOL) &key (stream t))
  ;; Look for an object named "self" and print it;
  (let ((object (or (get-instance self)
		    (get-concept self)
		    (get-relation self))))
    (if object
	(show-all object)
	(format stream "Can't find object named ~S" self)) ))


  ;;
;;;;;; "find-user-defined-superconcepts-of-supers"
  ;;

(defun find-user-defined-superconcepts-of-supers (listOfSupers)
  "Return a list of the most specific superconcepts at or above
      those in `listOfSupers' that are user defined."
  (let (allUserDefinedSupers computeMostSpecificP)
    (loop for sup in listOfSupers
	 do (if (system-defined-concept-p sup)
		(push sup allUserDefinedSupers)
	        (progn
		  (loop for supOfSup in (all-super-concepts sup)
			unless (system-defined-concept-p supOfSup)
			do (pushnew supOfSup allUserDefinedSupers))
		  (setq computeMostSpecificP t))))
    (if computeMostSpecificP
	(most-specific-concepts allUserDefinedSupers)
	allUserDefinedSupers) ))

(defun find-user-defined-subconcepts-of-subs (listOfSubs)
  "Return a list of the most general subconcepts at or below
      those in `listOfSubs' that have user-defined names"
  (let (userDefinedSubConcepts)
    (labels ((help-find-user-defined-subconcepts (subConcept)
	       (if (system-defined-concept-p subConcept)
		   (push subConcept userDefinedSubConcepts)
		 (loop for sub in (sub-concepts subConcept)
		       do (help-find-user-defined-subconcepts sub)))))
      (loop for sub in listOfSubs
	    do (help-find-user-defined-subconcepts sub))
      (most-general-concepts userDefinedSubConcepts) )))


  ;;
;;;;;; Find-<feature>
  ;;


;;; CAUTION: Unlike "find-concept" the current implementations of "find-restriction",
;;;    "find-constraint", and "find-value-restriction" do not coerce their
;;;    arguments (in order to be more efficient);

;;; REWRITE: THIS MAKES NO SENSE IN THE NEW IMPLEMENTATION:
(defmacro find-restriction (concept relation &key defined-restriction implied-restriction)
  ;; Return the restriction of "concept" which restricts "relation";
  (cond
    (defined-restriction
     `(loop for res in (restrictions ,concept)
	   when (eq (relation res) ,relation)
           return res))
    (implied-restriction
     `(loop for res in (implied-restrictions ,concept)
	   when (eq (relation res) ,relation)
           return res))
    (t
     (once-only (concept relation)
       `(or (find-restriction ,concept ,relation :implied-restriction t)
	    (find-restriction ,concept ,relation :defined-restriction t))))) )

;; OBSOLETE??:
;(defmacro find-constraint (concept relation)
;  ;; Return the constraint of "concept" which restricts "relation";
;  `(key-find ,relation (implied-constraints ,concept)) )



  ;;
;;;;;; Computation of role attributes
  ;;

(defun compute-value-restriction (concept relation &key return-a-list-p)
  ;; Return the value-restriction of "concept" on "relation";
  ;; If "return-a-list-p", return a list of concepts, rather than
  ;;    joining them to form a single concept;
  ;; Note: Assumes that "concept" and "relation" have been classified;
  (let (baseRelation qualification restriction valueRestrictions)
    (multiple-value-setq (baseRelation qualification)
      (compute-local-relation&qualification relation nil))
    (setq restriction
          (loop for res in (implied-restrictions concept)
                when (and (eq (feature-type res) :value-restriction)
                          (eq (relation res) baseRelation)
                          (eq (qualification res) qualification))
                return res))
    (when restriction
      (return-from compute-value-restriction 
        (let ((result (consequent-concept
                       (compute-defining-concept
                        (or (value-restriction restriction) 
                            (implied-range relation))))))
          (if return-a-list-p
            (list result)
            result))))                            
    (setq valueRestrictions			
          (loop for res in (implied-restrictions concept)
               when (and (subconcept-p baseRelation (relation res))
                         (eq (feature-type res) :value-restriction)
                         (value-restriction res))
               collect (consequent-concept 
                        (compute-defining-concept
                         (value-restriction res)))))
    (cond
     (return-a-list-p
      (let ((impliedRange (consequent-concept (implied-range relation))))
        (if valueRestrictions
          (cons impliedRange valueRestrictions)
          (list impliedRange))))
     (valueRestrictions
      (consequent-concept
       (compute-conjunction-concept 
        (cons (implied-range relation) valueRestrictions))))
     (t
      (consequent-concept (implied-range relation)))) ))

(defun compute-conjunction-concept (conjuncts)
  ;; Return a concept representing the conjunction of the list "conjuncts";
  ;; This is like "touch-conjunction-concept", except that it
  ;;    also tries to complete the result;
  (let* ((noPreviouslyUncompletedConceptsP (null *top-level-uncompleted-concepts*))
	 (concept (touch-conjunction-concept conjuncts)))
    (when (and (not (completed-p concept))
	       noPreviouslyUncompletedConceptsP
	       (null *top-level-unclassified-concepts*))	; better safe than sorry
      (complete-sublattice concept)
      (intern-uninterned-concepts))
    concept ))


  ;;
;;;;;; "list-role-names&values"
  ;;


(CLOS::defgeneric list-role-names&values (instance &key include-computed-p)
  (:documentation
   "Return a list of the roles and values of the instance `instance'.  If 
`include-computed-p' and `instance' has an intrinsic concept (declared within a
create or :create), then include computed roles in the list."))


(defmethod list-role-names&values ((self CLOS-INSTANCE) &key include-computed-p)
  ;; Return a list of the roles and values of the CLOS instance "instance";
  (let ((computedRoles
         (and (intrinsic-concept self)
              (loop for role
                    in (get-explicitly-declared-roles (intrinsic-concept self))
                    when (compiled-accessor-function role)
                    collect role)))
         (result nil)
         (dontSubstituteNamesP (dont-substitute-names-p))
         fillers)
    (loop for slotName 
          in (get-names-of-slots (CLOS::class-of self))
          as relation = (get-relation slotName :no-error-p t)
          when (and relation
                    (not (find slotName computedRoles   ; not a computed role
                               :key #'(lambda (role) (name (relation role)))))
                    (setq fillers (get-slot-values self relation)))
          do (push (cons (if dontSubstituteNamesP relation slotName)
                         fillers) 
                   result))
    (if include-computed-p
      (append (list-computed-role-names&values self) result)
      result) ))

(defmethod list-role-names&values
           ((self INSTANCE-WITH-DYNAMIC-SLOTS) &key include-computed-p)
  ;; Return a list of the roles and values of the CLOS instance "instance";
  ;; Combine dynamically and statically allocated slots;
  #+(or :MCL :ALLEGRO :CMU) (declare (ignore include-computed-p))
  (let ((staticEntries (call-next-method))
        (dynamicEntries (list-dynamic-slot-role-names&values self)))
    (append dynamicEntries staticEntries) ))

(defmethod list-role-names&values ((self DB-INSTANCE) &key include-computed-p)
  ;; Return a list of the roles and values of the CLOS instance "instance";
  (if include-computed-p
    (append (list-computed-role-names&values self)
            (list-dynamic-slot-role-names&values self))
    (list-dynamic-slot-role-names&values self)) )

;; helping functions for "list-role-names&values":

(defun list-dynamic-slot-role-names&values (self)
  ;; Called by "DB-INSTANCE.list-role-names&values" and
  ;;    "INSTANCE-WITH-DYNAMIC-SLOTS.list-role-names&values";
  ;; Return a list of pairs of role names and fillers retrieved from
  ;;    dynamically allocated slots of "self";
  ;; Tricky:  Use the "get-slot-values" call to allow easier changes to
  ;;     the storage of slot fillers;
  (let ((dontSubstituteNamesP (dont-substitute-names-p))
        contextValues
	(*defaultModeP* t))	; Now needed because of get-slot-values! ; TAR 3/3/98
    (loop for (slotName . nil) in (dynamic-variables self)
          as role = (get-relation slotName :no-error-p t)
          when (and role
                    (setq contextValues (get-slot-values self role))
                    (symbolp slotName))         ; avoid phantom inverse
          collect 
          (cons (if dontSubstituteNamesP role slotName) contextValues)) ))


(defun list-computed-role-names&values (self)
  ;; Called by "DB-INSTANCE.list-role-names&values" and
  ;;    "CLOS-INSTANCE.list-role-names&values";
  ;; Return a list of pairs of role names and values retrieved from
  ;;    computed roles of "self";
  (let ((dontSubstituteNamesP (dont-substitute-names-p)))
    (when (intrinsic-concept self)
      (loop for role in (get-explicitly-declared-roles (intrinsic-concept self))
	  when (compiled-accessor-function role) ; computed role
	  collect
	    (cons (if dontSubstituteNamesP (relation role) (name role))
		  (if (single-valued-p (relation role))
		      (list (funcall (compiled-accessor-function role) self))
		    (funcall (compiled-accessor-function role) self))))) ))

(defun list-inverse-role-names&values (instance)
  ;; Return a list of the inverse roles and values of "instance";
  (let (role inverseRole)
    (loop for (slotName . slotFillers) in (dynamic-variables instance)
          when (setq inverseRole 
                     (if (symbolp slotName)
                       (and (setq role (get-relation slotName :no-error-p t))
                            (inverse role))
                       ;; phantom inverse: 
                       (inverse-of-phantom slotName)))
          collect (cons (name inverseRole) slotFillers)) ))


  ;;
;;;;;; Accessing attributes of instances
  ;;



;; BUGS:

#|
"find-restriction" MAKES NO SENSE !!!
|#

;; TO DO:
#|
Generate identifiers for meta-things
|#
