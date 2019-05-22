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

;;; GET.LISP (ABOX)

(in-package "LOOM")

(export '(get-name
          get-value get-values set-value set-values
          add-value remove-value get-inverse-values
	  fget-value fget-values
          fset-value fset-values fadd-value fremove-value
          fadd-tuple fremove-tuple
	  get-types add-type remove-type
          get-instances
          get-superrelations get-superconcepts
          get-subrelations get-subconcepts
          get-name
	  test-type-p
          ))


;;; get-xxx functions that provide much of the frame-related part
;;;   of the Loom API.

;;; get-instance, get-concept, get-relation  (defined elsewhere)

(defun get-name (object)
  "Return the name of the Loom object `object'."
  (declare (inline object-name))
  (object-name object) )


  ;;
;;;;;; "get-value", "set-value", etc.
  ;;

(defmacro evaluate-tweak-value-inputs (tweakFn)
  ;; Specialized macro called by "get-value", "set-value", etc. to
  ;;    evaluate and validate the references "instanceOrId" and "roleOrName";
  `(progn
     (setq instance (get-instance instanceOrId))
     (setq role (get-sealed-relation roleOrName :no-error-p t))
     (when (null instance)
       (return-from ,tweakFn
         (signal-tweak-value-error
          :missing-instance no-error-p instanceOrId nil ',tweakFn)))
     (when (null role)
       (return-from ,tweakFn
         (signal-tweak-value-error
          :missing-role no-error-p nil roleOrName ',tweakFn)))) )

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
            (t fillerOrId)))
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

(defmacro evaluate-tweak-type-inputs (tweakFn)
  `(progn
     (setq instance (get-instance instanceOrId))
     (setq concept (get-sealed-concept conceptOrName :no-error-p t))
     (when (null instance)
       (return-from ,tweakFn
         (signal-tweak-value-error
          :missing-instance no-error-p instanceOrId nil ',tweakFn)))
     (when (null concept)
       (return-from ,tweakFn
         (signal-tweak-value-error
          :missing-concept no-error-p nil conceptOrName ',tweakFn)))
     (when (member :read-only (attributes concept))
       (return-from ,tweakFn
         (signal-tweak-value-error
          :read-only-assertion no-error-p instance concept ',tweakFn)))) )

(defun signal-tweak-value-error
    (errorType noErrorP instanceOrValue roleOrConcept tweakFn)
  ;; Helping function for "get-value", "set-value", etc.;
  (if noErrorP
      (values nil errorType)
      (progn
	(format *error-output* "Error in function `~(~A~)'.  " tweakFn)
	(unless (eq *debug-io* *error-output*)
	  (format *debug-io* "Error in function `~(~A~)'.  " tweakFn))
	(ecase errorType
	  (:type-clash
	   (cerror "Skip this assignment."
                   "Type clash -- can't assign the value ~S to the role ~S~%~
                  because ~S cannot be of type ~S."
		   instanceOrValue (generate-external-reference roleOrConcept)
		   instanceOrValue (implied-range roleOrConcept)))
	  (:too-many-fillers
	   (cerror "Skip this assignment."
                   "Can't assign multiple fillers to the single-valued role ~S.~%~
                    Current value = ~S;  New value = ~S."
		   (generate-external-reference roleOrConcept)
		   (first instanceOrValue)
		   (second instanceOrValue)))
	  (:missing-instance
	   (cerror "Skip this function call."
                   "Can't find an instance with identifier ~S." instanceOrValue))
	  ((:missing-role :missing-concept)
	   (let ((metaConcept (case errorType
				(:missing-role "role")
				(otherwise "concept"))))
	     (if (null roleOrConcept)
		 (cerror "Skip this function call."
                         "Null role passed to ~(~A~) function." tweakFn)
		 (cerror "Skip this function call." 
                         "Can't find a ~A with name ~S." 
			 metaConcept roleOrConcept))))
          (:read-only-assertion
           (cerror "Skip this function call."
                   (if (typep roleOrConcept 'BINARY-RELATION)
                     "Not legal to assert a filler of the read-only relation ~A on ~A"
                     "Not legal to assert read-only concept ~A has member ~A")
                   roleOrConcept instanceOrValue)) ))) )

#+CLTL2 (declaim (inline help-get-value))
#-CLTL2 (proclaim '(inline help-get-value))
(defun help-get-value (instance role defaultModeP)
  ;; Helping function for "get-value" and "get-values";
  (if defaultModeP
      (execute-query
       (run-time-call-role
	role
	(get-temporally-offset-instance instance)
	t))
    (execute-strict-query
     (run-time-call-role
      role
      (get-temporally-offset-instance instance)
      t))) )

;;; IN-LINE THESE AGAIN AFTER WE STOP CHANGING DEFINITION OF "help-add-value":
;#+CLTL2 (declaim (inline help-add-value))
;#-CLTL2 (proclaim '(inline help-add-value))
(defun help-add-value (instance role filler)
  ;; Helping function for "set-value", "set-values", and "add-value";
  (let (*dontDetectTypeClashP*)
    (declare (special *dontDetectTypeClashP*))	; disable interior range check
    (assert-role-filler instance role filler :assertion))
  (when *automatically-advance-state-p*
    (new-time-point))
  filler )

(defun get-value (instanceOrId roleOrName
		  &key context kb asserted-p direct-p no-error-p no-defaults-p)
  "Return a filler for the single-valued role `roleOrName' on the instance
`instanceOrId'.  Signal an error if the role has multiple values, unless
`no-error-p' is set, in which case return a randomly-chosen value.  If either
the instance or role references are symbols, look for the corresponding objects
in the knowledge base `context', or in the current knowledge base."
  ;; TO DO: FIGURE OUT WHERE/HOW DUPLICATES GET REMOVED;
  (obsolete-argument get-value kb)
  (obsolete-argument get-value direct-p asserted-p)
  (obsolete-argument get-value context)
  (let (instance role fillers)
    (evaluate-tweak-value-inputs get-value)
    (ensure-visibility-of-updates)
    (setq fillers (if asserted-p
		      (get-asserted-role-fillers instance role) ; DGB 5/11/94
		      (help-get-value instance role (not no-defaults-p))))
    (cond
     ((or (null (rest fillers))
          no-error-p)
      (first fillers))
     ((role-is-single-valued-p role)
      (cerror "Return the first value."
              "The single-valued role ~S on instance ~S has multiple values."
              (generate-external-reference role)
              (or (identifier instance) instance))
      (first fillers))
     (t
      (cerror "Return the first value."
              "Illegal application of `get-value' to the multiple-valued
role ~S on instance ~S."
              (generate-external-reference role)
              (or (identifier instance) instance))
      (first fillers))) ))


(defun get-values (instanceOrId roleOrName 
		   &key qualificationOrName context kb 
			asserted-p direct-p no-error-p no-defaults-p)
  "Return list of fillers for the role `roleOrName' (qualified by
 `qualificationOrName') on the instance `instanceOrId'.  If either the
 instance or role references are symbols, look for the corresponding objects
 in the current context."
  ;; TO DO: FIGURE OUT WHERE/HOW DUPLICATES GET REMOVED;
  (obsolete-argument get-values kb)
  (obsolete-argument get-values direct-p asserted-p)
  (obsolete-argument get-values context)
  (let (instance role qualification)
    (evaluate-tweak-value-inputs get-values)
    (ensure-visibility-of-updates)
    (if asserted-p
	(get-asserted-role-fillers instance role)  ; DGB 5/11/94
	(help-get-value instance role (not no-defaults-p))) ))

(defun set-value (instanceOrId roleOrName fillerOrId 
		  &key qualificationOrName context kb no-error-p)
  "Replace the current value of the single-valued role `roleOrName' 
 (qualified by `qualificationOrName') on the instance `instanceOrId' by
`fillerOrId'.  If the new value clashes with the role's type (range), 
abort the update and when `no-error-p'is NIL signal an error." 
  (obsolete-argument set-value kb)
  (obsolete-argument set-value context)
  (let (instance role qualification filler)
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

(defun set-values (instanceOrId roleOrName fillersOrIds 
		   &key qualificationOrName context kb no-error-p)
  "Replace the current value of the role `roleOrName' (qualified by
`qualificationOrName') on the instance `instanceOrId' by the list
`fillersOrIds'.  If a new value clashes with the role's type (range),
abort the update and when `no-error-p' is NIL signal an error."
  (obsolete-argument set-values kb)
  (obsolete-argument set-values context)
  (let (instance role fillers)
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
            (push filler fillers)))
    (fclear-value instance role)
    (loop for f in fillers
          do (help-add-value instance role f))
    fillers ))        

(defun add-value (instanceOrId roleOrName fillerOrId 
		  &key qualificationOrName context kb no-error-p)
  "Add the filler `fillerOrId' to the role `roleOrName' (qualified by
`qualificationOrName') on the instance `instanceOrId'.  If the role is
single-valued and already has a filler, or if the new value clashes
with the role's type (range), abort the update and when `no-error-p' 
is NIL signal an error."
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

(defun remove-value (instanceOrId roleOrName fillerOrId 
		     &key qualificationOrName context kb no-error-p)
  "Remove the filler `fillerOrId' from the role `roleOrName' (qualified by
`qualificationOrName') on the instance `instanceOrId'."
  (obsolete-argument remove-value kb)
  (obsolete-argument remove-value context)
  (let (instance role filler)
    (evaluate-tweak-value-inputs remove-value)
    (evaluate-tweak-value-filler remove-value :skip-type-check-p t)
    (retract-role-filler instance role filler :retraction)
    filler ))

(defun get-inverse-values (instanceOrId roleOrName 
			   &key qualificationOrName context no-error-p)
  "Return a list of the instances which have role `roleOrName' (qualified by
 `qualifierOrName') filled by instance `instanceOrId'.  If either the instance
 or role references are symbols, look for the corresponding objects in the
 current context."
  (obsolete-argument get-inverse-values context)
  (let (instance role result)
    (labels ((collect-inverse-role-values (instance role)
	       (let ((inverseRole (inverse role))
		     phantomPair)
		 (if inverseRole
                   (prependf result (collect-all-role-fillers instance inverseRole))
                   (progn
                     (setq phantomPair (assoc (phantom-inverse-relation role)
                                              (dynamic-variables instance)))
                     (when phantomPair
                       (prependf result (cdr phantomPair)))
                     (loop for subRole in (sub-concepts role)
                          do (collect-inverse-role-values instance subRole)))))))
      (evaluate-tweak-value-inputs get-inverse-values)
      (when (or (not (primitive-p role))
		(subconcept-p (implied-range role) (loom-constant CONSTANT))
		(antecedents role))
	(warn "Function `get-inverse-values' or `all-inverse-role-values' may ~
               return~%  incorrect results because role ~S~%  ~
               is non-primitive or has a constant-valued range." role))
      (collect-inverse-role-values instance role)
      (fast-remove-duplicates result) )))

;; DGB 5/11/94:
(defmethod get-asserted-role-fillers ((self DB-INSTANCE) role)
  ;; Return the directly-asserted fillers of role "role" on instance "self";
  (let ((roleFillersRecord
	 (cdr (assoc role (role-fillers-table self)))))
    (if roleFillersRecord
	(asserted-fillers roleFillersRecord)
	(get-slot-values self role)) ))

;; DGB 5/11/94:
(defmethod get-asserted-role-fillers ((self CLOS-INSTANCE) role)
  ;; Return the directly-asserted fillers of role "role" on instance "self";
  (get-slot-values self role) )


  ;;
;;;;;; Faster versions of "get-value", "set-value", etc.
  ;;

(defmacro fget-value (?instance roleOrQuotedName)
  "Return a filler or fillers for the role `role' on the instance `?instance'.
Faster than `get-value' because there is NO error checking.  Even faster
if `role' is a quoted symbol, because query checks get compiled out."
  ;; TO DO: CONSIDER ADDING PARAMETER TO "all-role-values" TO 
  ;;    AVOID LISTIFICATION;
  ;; FIGURE OUT WHERE/HOW DUPLICATES GET REMOVED;
  (if (and (quoted-p roleOrQuotedName)
	   (symbolp (second roleOrQuotedName)))
      (let ((?role (get-sealed-relation (second roleOrQuotedName))))
	(if (role-is-single-valued-p ?role)
	    `(first (all-role-values ,?instance ,roleOrQuotedName))
	    `(all-role-values ,?instance ,roleOrQuotedName)))
      `(runtime-fget-value ,?instance ,roleOrQuotedName)) )
      
(defun runtime-fget-value (?instance roleOrName)
  ;; Helping function for "fget-value";
  ;; Return a filler or fillers for the role "roleOrName" on the instance "?instance";
  (let* ((?role (get-relation roleOrName))
	 (fillers (all-role-values ?instance ?role :role-is-object-p t)))
    (if (role-is-single-valued-p ?role)
	(first fillers)
	fillers) ))

(defun fset-value (instance roleOrName filler)
  "Replace the current value of the role `roleOrName' on the instance `instance'
 by `filler', which must represent the value of a single filler.
  Faster than `set-value' because there is NO error checking."
  (let ((role (if (symbolp roleOrName) (get-relation roleOrName) roleOrName))
	*dontDetectTypeClashP*)
    (declare (special *dontDetectTypeClashP*))	; disable interior range check    
    (cond
     ((null filler)				; fast exit if just clearing the fillers
      (fclear-value instance role))
     (t
      ;; clear old value if we can't rely on clipping to do it for us:
      (when (not (and (role-is-single-valued-p role)
                      (clipping-enabled-p role)))
        (fclear-value instance role))
      (assert-role-filler instance role filler :assertion)
      filler)
     ) ))

(defun fset-values (instance roleOrName fillers)
  "Replace the current value of the role `roleOrName' on the instance `instance' by
`fillers'.  Faster than `set-value' because there is NO error checking."
  (let ((role (get-relation roleOrName))
	*dontDetectTypeClashP*)
    (declare (special *dontDetectTypeClashP*))	; disable interior range check 
    (fclear-value instance role)
    (cond
     ((null fillers)				; fast exit if just clearing the fillers
      nil)
     (t ;; logic is borrowed from "assert-list-of-role-fillers":
      (loop for f in fillers
	    do (assert-role-filler instance role f :assertion))
      ;; insure that the order of fillers is preserved by clobbering
      ;;    the newly-asserted (but reversed) list of fillers:
      (set-slot-value instance role fillers))) ))

(defun fadd-value (instance roleOrName filler)
  "Add the filler `filler' to the role `roleOrName' on the instance `instance'." 
  (help-add-value instance
                  (if (symbolp roleOrName) (get-relation roleOrName) roleOrName)
                  filler) )

(defun fremove-value (instance roleOrName value)
  "Remove the filler `value' from the role `roleOrName' on the instance `instance'."
  (retract-role-filler instance (get-relation roleOrName) value :retraction)
  value )

(defmethod fclear-value ((self t) role)
  ;; Most general method for clearing out role fillers;
  ;; Note: "fclear-value" is not exported because "fset-value" does the
  ;;    same job;
  ;; Note: This is a method because some CLOS mixins have faster
  ;;    methods for clearing a slot
  (loop for f in (get-slot-values self role)
        do (retract-role-filler self role f :retraction)) )

(defun fadd-tuple (roleOrName tuple)
  "Add the tuple `tuple' to the n-ary role `roleOrName'." 
  (assert-tuple tuple
                (if (symbolp roleOrName) (get-relation roleOrName) roleOrName))
  tuple)

(defun fremove-tuple (roleOrName tuple)
  "Remove the tuple `tuple' from the n-ary role `roleOrName'."
  (retract-tuple tuple (get-relation roleOrName))
  tuple )

  ;;
;;;;;; "get-types", "add-type", "remove-type"
  ;;

(defun add-type (instanceOrId conceptOrName &key context kb no-error-p)
  "Assert that the instance `instanceOrId' satisfies the concept
`conceptOrName'."
  (obsolete-argument add-type kb)
  (obsolete-argument add-type context)
  (let (instance concept)
    (evaluate-tweak-type-inputs add-type)
    (assert-conjunct instance concept :assertion)
    concept ))

(defun remove-type (instanceOrId conceptOrName &key context kb no-error-p)
  "Retract that the instance `instanceOrId' satisfies the concept
`conceptOrName'."
  (obsolete-argument remove-type kb)
  (obsolete-argument remove-type context)
  (let (instance concept)
    (evaluate-tweak-type-inputs remove-type)
    (retract-conjunct instance concept :retraction)
    concept ))

(defun get-types (instanceOrName &key direct-p asserted-p raw-p)
  "Return a list of (named) concepts satisfied by the instance `instanceOrName'.
`direct-p' selects only the most specific concepts.  'asserted-p' selects
only concepts for which the concept membership was asserted.  If 'raw-p' is nil,
then only user-defined and named concepts are returned.  Otherwise internal Loom
concepts may also be returned."
  (let ((instance (get-instance instanceOrName :error-p t)))
    (ensure-visibility-of-updates)
    (if asserted-p
	(let ((concepts (get-asserted-types instance)))
	  (unless raw-p
	    (setq concepts 
	          (remove-if #'(lambda (x) (system-defined-name-p x)) concepts)))
	  (if direct-p
	      (most-specific-concepts concepts)
              concepts))
        (get-all-types instance direct-p raw-p))) )

(defun get-all-types (self mostSpecificP rawP)
  ;; Return a list of all named concepts satisfied by "instance";
  ;; If "mostSpecificP", just return the most specific named concepts;
  ;; If "rawP" is NIL then all concepts, including system-defined ones are
  ;;   returned.  Otherwise, only user-defined and named concepts are returned;
  (let ((concepts (get-all-satisfied-concepts self (not rawP))))
    (if mostSpecificP
	(if rawP
	    (most-specific-conjuncts (most-specific-concepts concepts))
	    (find-most-specific-named-super-concepts concepts))
      concepts) ))

(defmethod get-asserted-types ((self T))
  ;; Return a list of all asserted type of "self";
  ;; Default method returns NIL because constants and 
  ;;     other non-loom things can't have types asserted;
  #+:MCL (declare (ignore self))
  nil )

(defmethod get-asserted-types ((self DB-INSTANCE))
  (loop for (concept . justification) in (conjuncts-table self)
        when (assertion-p justification)
	unless (eq concept *thing*)
        collect concept) )

(defmethod get-asserted-types ((self CLOS-INSTANCE))
  (list (loom-concept self)) )

(defmethod get-asserted-types ((self INSTANCE-WITH-CONCEPTS))
  (remove *thing* (dynamically-asserted-conjuncts self)) )

(defun get-creation-type (instanceOrName)
  "Return the type of the instance `instanceOrName' asserted at the time
   it was created."
  (let ((instance (get-instance instanceOrName :error-p t)))
    (or (intrinsic-concept instance)
          *thing*) ))

(defun get-all-satisfied-concepts (self userDefinedOnlyP)
  ;; Return all user-defined concepts satisfied by "self";
  ;; Note: Because concepts that are both primitive and computed
  ;;    don't appear in the "search-nodes" slot, we are forced to
  ;;    search the entire tree (top-down);
  (let ((visibleContexts (context-precedence-list *context*))
	(alreadyVisitedConcepts nil)
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
			   (not (member (context rootConcept) visibleContexts))
                           (and (has-instance-p rootConcept self)
                                (push rootConcept result)))
                   (loop for subConcept
                         in (sub-concepts rootConcept)
                         do (collect-satisfied-concepts-in-subtree
                             subConcept))))))
      (collect-satisfied-concepts-in-subtree *thing*)
      result )))


  ;;
;;;;;; "get-instances"
  ;;

(defmethod asserted-instance-of-concept-p ((self T) concept)
  ;; Constants are asserted instances if they are in the local instances list;
  (in-local-instances-p self concept) )

(defmethod asserted-instance-of-concept-p ((self DB-INSTANCE) concept)
  ;; DB-INSTANCES are asserted instances if the justification in the
  ;;   conjuncts table indicates that they are;
  (let ((justification (cdr (assoc concept (conjuncts-table self)))))
    (and justification (assertion-p justification))))

(defmethod asserted-instance-of-concept-p ((self CLOS-INSTANCE) concept)
  ;; CLOS-INSTANCES are asserted instances if they were created as direct
  ;;   members of the concept;
  (eq concept (loom-concept self)))

(defmethod asserted-instance-of-concept-p ((self INSTANCE-WITH-CONCEPTS) concept)
  ;; INSTANCE-WITH-CONCEPTS are asserted instances if the concept appears
  ;;    in the list of dynamically asserted conjuncts;
  (member concept (dynamically-asserted-conjuncts self)) )

(defun get-instances (conceptOrName &key direct-p asserted-p)
  "Return a list of all instances that satisfy the concept indicated
by `conceptOrName'.  If `direct-p', return only those instances
that belong to the concept, but not to any of its subconcepts.  If
`asserted-p', then only return those instances directly asserted to
belong to the concept."
  (let* ((concept (get-sealed-concept conceptOrName))
         instances subConcepts)
    (when concept
      (ensure-visibility-of-updates)    ; TAR 5/22/95
      (setq instances (generate-instances concept))
      (when asserted-p
        (setq instances
              (delete-if-not #'(lambda (i)
                                 (asserted-instance-of-concept-p i concept))
                             instances)))
      (when direct-p
        (setq subConcepts (get-subrelations concept :direct-p t))
        (when subConcepts
          (setq instances
                (loop for i in instances
                      unless (loop for sub in subConcepts
                                   thereis (has-instance-p sub i))
                      collect i)))))
    instances ))



  ;;
;;;;;; Super & sub relation computations
  ;;

(defun collect-user-relations (relationList)
  ;; Return a list of relations of concepts with system-named relations
  ;;    filtered out
  (loop for relation in relationList
      unless (and (system-defined-name-p relation)
		  (system-defined-p relation))
        collect relation) )

(defun get-superrelations (relationOrName &key direct-p raw-p proper-p)
  "Return a list of relations (or concepts) that subsume the relation
indicated by `relationOrName'.  If `relationOrName' is a symbol, Loom
looks for a matching relation (of arity > 1) before it looks for a
matching concept.  If `direct-p', return only the most specific among
those relations that subsume the relation.    If `proper-p', then don't
include `relationOrName' itself.   Note that direct-p implies proper-p."
  (let ((relation (or (get-relation relationOrName :no-error-p t)
                      (get-concept relationOrName))))
    (if direct-p
	(if raw-p
	    (super-concepts relation)
	    (find-named-superconcepts-of-supers (super-concepts relation)))
        (if raw-p
	    (if proper-p 
		 (all-super-concepts relation)
	      (cons relation (all-super-concepts relation)))
	    (collect-user-relations
	     (if proper-p
		 (all-super-concepts relation)
	       (cons relation (all-super-concepts relation)))))) ))


(defun get-superconcepts (conceptOrName &key direct-p raw-p proper-p)
  "Return a list of concepts that subsume the concept indicated by 
`conceptOrName'.  If `direct-p', return only the most specific among
those relations that subsume the relation.  If `proper-p', then don't
include `conceptOrName' itself.  Note that direct-p implies proper-p."
  (let ((concept (get-concept conceptOrName)))
    (get-superrelations concept 
			:direct-p direct-p :raw-p raw-p :proper-p proper-p) ))

(defun get-subrelations (relationOrName &key direct-p raw-p proper-p)
  "Return a list of relations (or concepts) that specialize the relation
indicated by `relationOrName'.  If `relationOrName' is a symbol, Loom
looks for a matching relation (of arity > 1) before it looks for a
matching concept.  If `direct-p', return only the most general among
those relations that specialize the relation.  If `proper-p', then don't
include `relationOrName' itself.  Note that direct-p implies proper-p."
  ;; Note: We call "append-transitively" below rather than 
  ;;    "collect-transitively" because the latter would collect NILs
  ;;    whenever a system-defined concept was visited;
  (let ((relation (or (get-relation relationOrName :no-error-p t)
                      (get-concept relationOrName))))
    (if direct-p
	(if raw-p 
	    (sub-concepts relation)
	    (find-named-subconcepts-of-subs (sub-concepts relation)))
      (let ((properSubs (if raw-p
			    (append-transitively  
			     relation sub-concepts 
			     (lambda (self) 
			       (when (not (eq self relation))
				 (list self)))
			     :use-pass-counter t)
			  (append-transitively  
			   relation sub-concepts 
			   (lambda (self) 
			     (unless (or (eq self relation)
					 (and (system-defined-p self)
					      (system-defined-name-p self)))
			       (list self)))
			   :use-pass-counter t))))
	(if proper-p properSubs (cons relation properSubs)) )) ))

(defun get-subconcepts (conceptOrName &key direct-p raw-p proper-p)
  "Return a list of concepts that specialize the concept indicated by 
`conceptOrName'.  If `direct-p', return only the most general among
those relations that specialize the relation.  If `proper-p', then don't
include `conceptOrName' itself.  Note that direct-p implies proper-p."
  (let ((concept (get-concept conceptOrName)))
    (get-subrelations concept
		      :direct-p direct-p :raw-p raw-p :proper-p proper-p) ) )


  ;;
;;;;;; "test-type-p"
  ;;

;; TO DO: WE SHOULD HAVE TWO test-type-p PREDICATES -- ONE THAT TESTS
;;    THE CREATION TYPE, AND ONE THAT TESTS FOR ALL ASSERTIONS.
;; THE FUNCTIONS BELOW ARE CONFUSED AS TO WHICH KIND OF TEST WE HAVE
;; IN MIND.

;; TO DO: ADD test-not-type-p AND RELATED METHODS.

(defun test-type-p (instanceOrId typeOrName)
  "Return true if the instance `instanceOrId' satisfies the concept
`typeOrName'."
  (let ((instance (get-instance instanceOrId :error-p t))
        (concept (get-concept typeOrName)))
    (ftest-type-p instance concept) ))

(defmethod ftest-type-p ((self CLOS-INSTANCE) type)
  "Fast version of `test-type-p' that assumes that `self' and `type' are
objects.  Return true if `self' satisfies the concept `type'."
  (subconcept-p (loom-concept self) type) )

(defmethod ftest-type-p ((self INSTANCE-WITH-CONCEPTS) type)
  "Fast version of `test-type-p' that assumes that `self' and `type' are
objects.  Return true if `self' satisfies the concept `type'."
  (loop for c in (cached-types self)
        thereis (subconcept-p c type)) )

(defmethod ftest-type-p ((self DB-INSTANCE) type)
  "Fast version of `test-type-p' that assumes that `self' and `type' are
objects.  Return true if `self' satisfies the concept `type'."
  (if (consp (db-type self))
      (loop for c in (db-type self)
	    thereis (subconcept-p c type))
      (subconcept-p (db-type self) type)) )


;; SPEED TEST
#|
(creation-policy :clos-instance)
(clear-kb)
(defconcept A)
(defconcept B :is-primitive A)
(defconcept C :is-primitive B)
(let ((?i (create 'Fred 'C))
      (?c (get-concept 'A)))
  (time (loop for i from 1 to 1000        ; 25 mill   .0004 sec
      do
      (loom::ftest-type-p ?i ?c))))
|#
