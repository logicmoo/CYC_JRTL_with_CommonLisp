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

;;; CONSTANTS.LISP (ABOX)

;;; Contains routines for asserting and retracting to/from the database
;;; for constants.
;;; The code is partitioned to account for assertion/retraction of
;;;    (1) roles,
;;;    (2) features (i.e., restrictions and comparisons)
;;;    (3) conjuncts (i.e., unary predicates).

(in-package "LOOM")


;;;
;;;  These are hashtables that use the context sensitive accessors
;;;   in order to maintain information about constants for various
;;;   contexts.
;;;  OOPS:  THESE HASH TABLES WON'T WORK FOR MEASURES!
;;;


(defvar *constant-role-filler-table* (make-hash-table))
(defvar *constant-asserted-conjunct-table* (make-hash-table))

(defmacro constant-slot-value (constant slotName)
  `(assoc ,slotName 
	  (gethash ,constant *constant-role-filler-table*)))


(defun update-constant-slot-in-ctxt (constant slotName newValue copyToChildrenP)
  (update-in-ctxt 
   #'(lambda (o v)
       (let ((oldValue (get-slotName-value constant slotName)))
	 (if oldValue
	     (setf (cdr oldValue) v)
	     (push (cons slotName v)
		   (gethash constant *constant-role-filler-table*)))))
   constant
   (get-slotName-value constant slotName)
   newValue
   copyToChildrenP))

  ;;
;;;;;; Modification of Constants
  ;;

(defmethod forget-all-about ((self T) &key &allow-other-keys)
  ;; For constants, forget all Loom recorded information.;
  
  ;; Clear Concept Assertions;
  ;; Clear Role Assertions;
  )

(defmethod get-slot-value ((self T) role)
  ;; Read slot value for constants;
  (access-in-ctxt (constant-slot-value self (name role)) nil nil) )

(defmethod get-slotName-value ((self T) roleName)
  ;; Read slot value for constants.  More efficient
  ;;   than GET-SLOT-VALUE because we avoid the NAME call;
  ;; This is used internally to allow normal and context sensitive
  ;;   access to slot values through accessor functions.
  (access-in-ctxt (constant-slot-value self roleName) nil nil) )

(defmethod set-slot-value ((self T) role newValue)
  ;; Standard write slot accessor function for constants;
  (update-constant-slot-in-ctxt self (name role) newValue t) )

(defmethod set-slotName-value ((self T) roleName newValue)
  ;; Write slot accessor function for contants.  More efficient
  ;;   than GET-SLOT-VALUE because we avoid the NAME call;
  ;; This is used internally to allow normal and context sensitive
  ;;   access to slot values through accessor functions.
  (update-contant-slot-in-ctxt self roleName newValue t) )

(defmethod get-slot-values ((self T) role)
  ;; Standard read slot accessor function;
  (slot-value-to-values 
   (access-in-ctxt (constant-slot-value self (name role)) nil nil)
   role) )

(defmethod set-slot-values ((self CONTEXT-SENSITIVE-INSTANCE) role newValues)
  ;; Standard write slot accessor function;
  (update-constant-slot-in-ctxt self
				(name role)
				(slot-values-to-value newValues role)
				t) )


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(defmethod assert-half-role-filler ((instance T) role filler oldFillers justification)
  ;; Trap attempt to assert to a constant; 
;  (declare (ignore filler oldFillers))
;  (when (eq justification :assertion)
;    (grumble "Attempted to assert a filler to a non-existent slot named ~A ~
; on the object ~S in context ~A." (name role) instance *context*))
  (declare (ignore justification)
           (inline update-query-indices))
  ;; Tricky:  Uses set-slot-value and get-slot-value in both single and multiple
  ;;     valued cases for extra speed.  Relies on the fact that multiple values
  ;;     are stored as lists and single values aren't!
  (unless (filler-matches-old-filler-p role filler oldValue)
    (if (role-is-single-valued-p role)
      (progn
	;; TO DO:  SHOULD THIS BE "retract-half-role-filler" INSTEAD?
        (retract-role-filler instance role oldValue :retraction)
        (set-slot-value instance role filler))
      (set-slot-values instance role (cons filler oldValue)))
    (update-query-indices instance role filler :assertion))
  )


(defmethod assert-inverse-half-role-filler ((filler T) role instance justification)
;  ;; No inverses on Constants;
;  (declare (ignore role instance justification))
;  nil
  (when (eq justification :assertion)
    (let ((inverseRole (inverse role)))
      (if inverseRole
        (assert-half-role-filler filler inverseRole instance 
                                 (get-slot-value filler inverseRole)
                                 :assertion)
        (when (and (classified-instance-p filler)
                   (neq (implied-range role) *Thing*))
          (assert-conjunct filler (implied-range role) :domain/range))) ))
  )

(defmethod retract-half-role-filler ((instance T) role filler oldValue justification)
  ;; Trap erroneous attempt to remove a slot filler from a constant;
  ;; Generate a warning if role retraction is made to null or non-Loom
  ;;    instance;
;  (declare (ignore role filler oldValue))
;  (when (eq justification :assertion)
;    (grumble "Can't retract a role filler from ~:[the non-Loom instance ~A~;~
;              a null instance~*~] in context ~A"
;	     (null instance) instance *context*))
  (declare (ignore justification)
           (inline update-query-indices))
  (when (filler-matches-old-filler-p role filler oldValue)
    (set-slot-value instance role
                    (if (or (atom oldValue)
                            (role-is-single-valued-p role)
                            (null (rest oldValue)))
	              nil
	              (remove filler oldValue :test #'filler-equal)))
    (update-query-indices instance role filler :retraction))
  )


(defmethod retract-inverse-half-role-filler ((filler T) role instance justification)
;  ;; No inverses on Constants; 
;  (declare (ignore role instance justification))
;  nil
  (when (eq justification :retraction)
    (let ((inverseRole (inverse role)))
      (if inverseRole
        (retract-half-role-filler filler inverseRole instance 
                                  (get-slot-value filler inverseRole)
                                  :retraction)
        (when (and (classified-instance-p filler)         ;  TAR 5/11/95
                   (implied-range role)
                   (neq (implied-range role) *Thing*)   ;; can be null within revision operation
                   (not (discarded-p filler)))
          (retract-conjunct filler (implied-range role) :domain/range))) ))
  )

;; DO ME:
(defmethod local-assert-conjunct (self conjunct justification)
  ;; Situation:  "self" is not a LOOM object, so we can't modify it, or
  ;;    record truth maintenance dependencies for it;
  ;; If "justification" is :assertion, add "self" to the list
  ;;    of local instances recorded for "conjunct";
  ;; If "self" clashes with "conjunct" signal an error unless
  ;;    "set-value" or "add-value" has bound the special variable
  ;;    *typeClashDetectedP* or incoherence is being trapped;
  ;; If the special variable *constantFillerConflictsWithConjunctP* is bound
  ;;    (by "propagate-forward-inferences") then check for incoherence
  ;;    and set the variable accordingly;
  (declare (special *constantFillerConflictsWithConjunctP*))
  (flet ((warn-of-type-clash ()
	   (warn "Type clash: The constant ~S cannot be an instance of the concept ~S."
		 self (generate-external-reference conjunct))))
    (when (not (subconcept-p conjunct (loom-constant NON-LOOM-THING)))
      (warn "The concept ~S cannot be asserted to contain non loom objects~%   ~
             such as the ~S ~S in context ~A."
            (generate-external-reference conjunct) (type-of self) self *context*)
      (return-from local-assert-conjunct nil))
    (case justification
      (:assertion
       (add-to-local-instances conjunct self))
      (:domain/range
       (when (and (not (boundp '*dontDetectTypeClashP*))
                  (not-has-instance-p conjunct self))
         (warn-of-type-clash)))) ))

;; DO ME:
(defmethod local-retract-conjunct (self conjunct justification)
  ;; Situation:  "self" is not a LOOM object, so we can't modify it, or
  ;;    record truth maintenance dependencies for it;
  ;; If :justification is :retraction, delete "self" from the list of
  ;;    local instances recorded for "conjunct";
  (declare (ignore justification))
  (grumble "The assertion that ~A is an instance of ~A is not retractable."
           self (name conjunct)) )  

;; DO ME:
(defmethod local-assert-feature (self features)
  ;; Non Loom instances don't have features;
  (declare (ignore features))
  (grumble "Can't assert a descriptive proposition to the instance ~S because
it does not inherit the mixin INSTANCE-WITH-NEGATION."
           self) )

;; DO ME:
(defmethod local-retract-feature (self features)
  ;; Non Loom instances don't have features;
  (declare (ignore features))
  (grumble "Can't retract a descriptive proposition from the instance ~S because
it does not inherit the mixin INSTANCE-WITH-NEGATION."
           self) )

;; DO ME:
(defmethod local-assert-not-in (self concept)
  ;; Warn that negation is not supported for the instance "self";
  (declare (ignore concept))
  (grumble "Can't assert a negated proposition from the instance ~S because it
does not inherit the mixin INSTANCE-WITH-NEGATION"
           self) )

;; DO ME:
(defmethod local-retract-not-in (self concept)
  ;; Warn that negation is not supported for the instance "self";
  (declare (ignore concept))
  (grumble "Can't retract a negated proposition from the instance ~S because it
does not inherit the mixin INSTANCE-WITH-NEGATION"
           self) )


  ;;
;;;;;; Modification of Printing via PI, etc.
  ;;


  ;;
;;;;;; Modification of Contexts needed to properly clear information.
  ;;


  ;;
;;;;;; Modification of Save Context needed to properly save assertions.
  ;;
