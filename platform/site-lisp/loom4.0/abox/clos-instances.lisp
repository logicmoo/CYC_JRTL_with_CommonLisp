;;; -*- Mode:Common-Lisp; Package:LOOM; Syntax:COMMON-LISP; Base:10 -*-

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

;;; CLOS-INSTANCES.LISP (ABOX)

(in-package "LOOM")

(export '(make-object unmake-object change-object
          loom-concept ))

;; File of functions and methods that allow CLOS instances to be entered
;;    into LOOM contexts


  ;;
;;;;;; "make-object" and "change-object"
  ;;

;; "make-object" is placed up front so that it can be called by "create":
(defmacro make-object (classOrName &body initargs)
  "Return an instance of `classOrName' with the slot initializations
   specified in `initargs'."
  (let ((identifier (get&remf initargs :identifier))
	(context (get&remf initargs :context)))
    `(make-object-initialization
       (CLOS::make-instance 
	 (LOOM::find-or-create-clos-class ,classOrName) ,@initargs)
       ,identifier ,context) ))

(defun make-object-initialization (self identifier context)
  ;; Function called by "make-object" to handle initialization;
  ;; This function takes care of some of the special work that
  ;;    "make-instance" does, such as asserting the conjunct;
  (when (coerce&initialize-clos-instance self identifier context)
    (assert-conjunct self (loom-concept self) :assertion)
    self))

(defun create-clos-instance (identifier closClass context)
  ;; Internal version of "make-object" -- called by "create-instance";
  ;; Return an instance of the CLOS class "closClass";
  ;; "identifier" and "context" may be nil;
  (when (and identifier
             *safe-mode-p*
             (not (subtypep closClass 'INSTANCE-IN-CONTEXT)))
    (warn "Loom cannot intern the CLOS instance with identifier ~A into a 
context because the CLOS class ~A does not inherit the mixin 
class INSTANCE-IN-CONTEXT."
          identifier (CLOS::class-name closClass)))
  (coerce&initialize-clos-instance
   (CLOS::make-instance closClass) identifier context) )

(defun coerce&initialize-clos-instance (self identifier context)
  ;; Check to see if the link from "self" to a concept is valid;
  ;; If not, fix it, possibly redefining the CLOS class of "self";
  ;; Then, initialize "self";
  (let ((concept (loom-concept self)))
    (when (null concept)
      (setq concept (get-sealed-concept 
                     (CLOS::class-name (CLOS::class-of self))
                     :context context))
      (when (null concept)
        (return-from coerce&initialize-clos-instance nil))
        ;; the process of sealing "concept" has caused it
        ;;    it to become linked to the class of "self";
      (integrity-check (eq concept (loom-concept self))))
    (initialize-clos-instance self identifier context) ))
  

;; TO DO: REDESIGN/RETHINK THIS:
(defun change-object (self classOrName)
  "Change the CLOS class of `self' (using `change-class', and revise the
   corresponding LOOM data structures."
  ;; TO DO: UPGRADE THIS TO UNDERSTAND MORE KINDS OF INITIALIZATION;
  (CLOS::change-class self classOrName)
  (add-to-local-instances (loom-concept self) self)
  self)

(defun unmake-object (self)
  "Undo indexing between `self' and Loom data structures."
  (forget-all-about self) )

(defun find-or-create-clos-class (classOrName)
  ;; Called by "make-object", "create-instance"
  ;;    "ensure-shadow-classes" and "define-role-accessor";
  ;; If "classOrName" names a concept and a class with the same name
  ;;    exists return that class;
  ;; Otherwise (still assuming the concept exists) define a new CLOS class;
  ;;    Next, unseal and reseal any concepts below the concept, to insure
  ;;    that their CLOS classes inherit the new class;
  ;; If automatic clos class creation is disabled, then a class will not be
  ;;    created (unless the :clos-class property is attached to the concept);
  (if (symbolp classOrName)
    (let ((concept (get-sealed-concept classOrName :no-error-p t))
          (class (CLOS::find-class classOrName nil)))
      (when (null concept)
        ;; exit if matching concept doesn't exist
        (return-from find-or-create-clos-class nil))
      (when (not (sealed-p concept))
        ;; exit, returning a class only if it doesn't depend on the concept:
        (if (member :existing-class (system-attributes concept))
          (return-from find-or-create-clos-class
            (CLOS::find-class (clos-class-name concept) nil))
          (return-from find-or-create-clos-class nil)))
      (when class                       ; RMM 1/18/95
        (return-from find-or-create-clos-class class))
      ;; test if we have authority to create a new class:
      (when (not (shadowed-by-clos-class-p concept))
        ;; either we should not create a CLOS class, or we are
        ;;    creating a class for a non-primitive concept:
        (when (not (member :automatic-clos-classes *loom-features*))
          ;; give up trying to make a clos class:
          (return-from find-or-create-clos-class nil))
        ;; warn about creating a CLOS class for a non-primitive concept:
        (when (member :warn-on-nonprimitive-clos-classes
                      *loom-dialogue-features*)
          (grumble "Creating a CLOS class for the nonprimitive concept ~S."
                   concept)))
      ;; at this point, we have clearance to create a clos class --
      ;; first, unseal those subconcepts of "concept" that already have
      ;;    clos classes in order to force them to inherit the new class:
      (do-subconcepts (c concept)
        (when (CLOS::find-class (name c) nil)
          (unseal-one-concept c)))
      ;; define and return the new class:
      (define-clos-class concept))
    classOrName) )


  ;;
;;;;;; CLOS class shadowing
  ;;

(defun shadowed-by-clos-class-p (self)
  ;; Return t if the concept "self" is shadowed by a CLOS class:
  (and (not (virtual-p self))
       (or (and (primitive-p self)
                (not (read-only-p self))
                (member :automatic-clos-classes *loom-features*))
           (member :clos-class (attributes self))
           (member :existing-class (system-attributes self)))) )

(defun define-clos-class (concept)
  ;; Define or redefine a CLOS class corresponding to "concept" and return
  ;;    the class;
  ;; The class's direct supers are those computed for "concept"
  ;;    along with other specified non-shadowing classes;
  ;; The class's slots are those computed for "concept" along
  ;;    with a slot that points back to "concept";
  ;; Certain slots may have initforms which evaluate to the
  ;;    fillers of corresponding roles of "concept";
  (when (member :existing-class (system-attributes concept))
    ;; warn if the CLOS class "(clos-class-name concept)" does not exist;
    (let* ((className (clos-class-name concept))
           (class (find-class className nil)))
      (when (not class)
        (complain "~%The concept ~S specifies that a CLOS class with name~%
~S must already exist, but it doesn't."
                  (name concept) className))
      (return-from define-clos-class class)))
  (let (classDefinition class)
    (loop for c in (clos-shadowed-super-concepts concept)
         when (null (find-class (name c) nil))
         do (define-clos-class c))
    (setq classDefinition (form-class-definition concept))
    #L:trace-class (pprint classDefinition *trace-output*)
    (emit-classify-string "C")
    ;; define or redefine a CLOS class:
    (setq class (eval classDefinition))
    (setf (loom-concept (make-instance class)) concept) ; was CLOS::class-prototype TAR 12/15/92
    class ))

;(defun form-class-definition (concept)
;  ;; Helping function for "define-clos-class";
;  ;; Form a Clos definition with the same name as "concept", with
;  ;;    supers "supers" and slots "slots";
;  (let* ((roles (compute-class-slots concept))
;         (moreSlotDefs
;          (loop for slotDef in (mixin-slots concept)
;                as normalizedSlotDef = (list-of slotDef)
;                unless (member (first normalizedSlotDef) roles :key #'name)
;                collect normalizedSlotDef))
;         (className (or (clos-class-name concept)
;                        (name concept)))
;         (*slotInitializationAlist* nil) ;  RMM 5/13/94
;         )
;    (declare (special *slotInitializationAlist*))
;    `(prog1 
;       (CLOS::defclass 
;         ,className
;         ,(compute-names-of-class-supers concept)
;         ((loom-concept :allocation :class :initform nil)
;          ,@(loop for r in roles 
;                  collect
;                  (let ((slotName (name r)))
;                    (overlay-slot-mixin
;                     `(,slotName
;                       ,@(when (allocate-shared-slot-p concept r)
;                           '(:allocation :class))
;                       ;; create accessor if "slotName" won't clobber a function:
;                       ,@(unless (non-generic-function-p slotName)
;                           `(:accessor ,slotName))
;                       :initarg ,(intern (symbol-name slotName) 'KEYWORD)
;                       :initform ,(form-slot-initform concept r))
;                     concept)))
;          ,@moreSlotDefs))
;       (KBCLASSES::remove-existing-CLOS-init-function ',className)
;       ,@(when *slotInitializationAlist*        ;  TAR 1/6/94
;           `(,(KBCLASSES::form-CLOS-initialization-function
;               className *slotInitializationAlist*)))
;       ) ))

;(defun form-class-definition (concept)
;  ;; Helping function for "define-clos-class";
;  ;; Form a Clos definition with the same name as "concept", with
;  ;;    supers "supers" and slots "slots";
;  (let* ((roles (compute-class-slots concept))
;         (moreSlotDefs
;          (loop for slotDef in (mixin-slots concept)
;                as normalizedSlotDef = (list-of slotDef)
;                unless (member (first normalizedSlotDef) roles :key #'name)
;                collect normalizedSlotDef))
;         (className (or (clos-class-name concept)
;                        (name concept))))
;    
;    `(CLOS::defclass ,className
;       ,(compute-names-of-class-supers concept)
;       ((loom-concept :allocation :class :initform nil)
;        ,@(loop for r in roles 
;                collect
;                (let ((slotName (name r)))
;                  (overlay-slot-mixin
;                   `(,slotName
;                     ,@(when (allocate-shared-slot-p concept r)
;                         '(:allocation :class))
;                     ;; create accessor if "slotName" won't clobber a function:
;                     ,@(unless (non-generic-function-p slotName)
;                         `(:accessor ,slotName))
;                     :initarg ,(intern (symbol-name slotName) 'KEYWORD)
;                     :initform ,(form-slot-initform concept r))
;                   concept)))
;        ,@moreSlotDefs)) ))

;; Context-sensitive one:

(defun form-class-definition (concept)
  ;; Helping function for "define-clos-class";
  ;; Form a Clos definition with the same name as "concept", with
  ;;    supers "supers" and slots "slots";
  
  (let* ((roles (compute-class-slots concept))
         (moreSlotDefs
          (loop for slotDef in (mixin-slots concept)
                as normalizedSlotDef = (list-of slotDef)
                unless (member (first normalizedSlotDef) roles :key #'name)
                collect normalizedSlotDef))
         (className (or (clos-class-name concept)
                        (name concept))))
    (flet ((make-reader (methodName slotName)
             `(CLOS::defmethod ,methodName ((self ,className))
                (LOOM::get-slotName-value self ',slotName)) )
           (make-writer (methodName slotName)
             `(CLOS::defmethod ,methodName (newValue (self ,className))
                (LOOM::set-slotName-value
                     self ',slotName newValue)) ))      
      `(prog1 
         (CLOS::defclass ,className
           ,(compute-names-of-class-supers concept)
           ((loom-concept :allocation :class :initform nil)
            ;; Allocate slots for roles (without accessor functions)
            ,@(loop for r in roles 
                    as slotName = (name r)
                    collect
                    (overlay-slot-mixin
                     `(,slotName
                       ,@(when (allocate-shared-slot-p concept r)
                           '(:allocation :class))
                       :initarg ,(intern (symbol-name slotName) 'KEYWORD)
                       :initform ,(form-slot-initform concept r))
                     concept))
            ,@moreSlotDefs))
         ;; Create accessor functions that correctly indirect to handle 
         ;;    possible context sensitive slots:
         ,@(loop for r in roles 
                 as slotName = (name r)
                 unless (non-generic-function-p slotName)
                 collect (make-reader slotName slotName)
                 and collect (make-writer `(setf ,slotName) slotName)
                 nconc (loop for (key value) on (cdr (assoc slotName
                                                            (mixin-slots concept)))
                             when (and (eq key :accessor) (neq value slotName))
                               collect (make-reader value slotName)
                               and collect (make-writer `(setf ,value) slotName)
                             when (and (eq key :reader) (neq value slotName))
                               collect (make-reader value slotName)
                             when (and (eq key :writer) (neq value slotName))
                               collect (make-writer value slotName)
                             when (and (eq key :writer) (eq value slotName))
                               do (warn "Can't create writer named ~A for slot ~
                                         ~A~%on concept ~A because the name ~
                                         conflicts with the automatically~%~
                                         created accessor."
                                        value slotName concept)))
                 ) )))

(defun compute-names-of-class-supers (concept)
  ;; Return a list of names of CLOS classes that appear in the definition
  ;;    of the class that would or does shadow "concept";
  (let ((supers (clos-shadowed-super-concepts concept)))
    (remove-duplicates
       (cond                          ; construct list of names of super classes:
        ((null supers)                ; "concept" = THING
         ;; make sure that CLOS-INSTANCE gets inherited:
         (append (mixin-classes concept)
                 (list 'CLOS-INSTANCE)))
        ((and (equal supers *list-of-thing*)      ; THING is the only inherited class
              (null (mixin-classes concept))
              (equal (mixin-classes *thing*) '(CLOS-INSTANCE)))
         ;; inherit default mixin:
         '(THING INSTANCE-IN-CONTEXT))
        (t
         ;; make sure that super classes are listed ahead of any mixin classes:
         (append (loop for c in supers 
                       collect (name c))
                 (mixin-classes concept))))
       :from-end t) ))

(defun clos-shadowed-super-concepts (concept)
  ;; Return the most specific shadowed supers of "concept";
  ;; The names of these concepts are used to specify the direct
  ;;    superclasses of the class being defined;
  (most-specific-concepts
    (loop for c in (all-super-concepts concept)
	 when (shadowed-by-clos-class-p c)
	 collect c)) )

#|
Rules for allocating a slot R on a CLOS class C:
(0) If C is :virtual, then it has no slots.
(1) If R is :read-only, or if R is inherited from a superclass of C, then
    do not allocate a CLOS slot C.R.
(2) Excepting (1), if there exists a role for <C,R> or if C restricts R,
    then allocate C.R;
(3) Excepting (1), if the domain of R equals C then allocate C.R, except
    when C = Thing;
(4) If rules 1-3 specify a role D.R but there is no CLOS class for D, then if
    D specializes C and there is no CLOS class between D and C, then allocate C.R.

Currently, we implement only Rules 0,1,2, and 4.  If there is a demand for adding
Rule 3, we will add it.

Kludge:  Rule (5).  If C defines a default on the role R, then allocate C.R.
BUG: THE KLUDGE IS NOT APPLIED TO "belowRelations" IN THIS CODE:
|#

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

(defun compute-locally-inferrable-slot-relations (concept)
  ;; Helping function for "compute-class-slots";
  ;; Return a list of relations that ignore criterion 1 above,
  ;;    but meet Rule 2 (and optionally, Rule 3);
  ;; Caution: Calling "compute-role-relations" insures that
  ;;    "convert-roles-to-objects" is called before checking "role-cache";
  (let* ((allRelations (compute-role-relations concept))
         (outRelations
          (loop for role in (role-cache concept)
                when (or (getf (role-specification role) :function)
                         (virtual-p role))
                collect (relation role))))
    (set-difference allRelations outRelations) ))
 
(defun allocate-shared-slot-p (concept relation)
  ;; Return t if the :class allocation option can be specified for the
  ;;    slot corresponding to "relation";
  ;; This will be the case if the number of strict fillers of "relation"
  ;;    on "concept" equals the maximum number of fillers;
  (let (strictFillers upperBound)
    (loop for f in (implied-restrictions concept)
	  when (eq (relation f) relation)
	  do
	  (case (feature-type f)
	    (:role-fillers
	     (setq strictFillers (role-fillers f)))
	    (:max-restriction
	     (setq upperBound (upper-bound f)))))
    (eql (length strictFillers) upperBound) ))

(defun form-slot-initform (concept relation)
  ;; Return an expression for initializing the slot corresponding to "relation"
  ;;    on the class corresponding to "concept";
  ;; The expression evaluates to the strict and default filler(s) of "relation";
  ;; TO DO: FIGURE OUT HOW TO GENERATE INITFORMS THAT REFERENCE INDIVIDUALS
  ;;    OTHER THAN CONSTANTS;
  (declare (special *slotInitializationAlist*))
  (let ((fillers
	  (remove-duplicates
	    (loop for f in (append (implied-restrictions concept) 
			      (default-features concept))
		 when (and (eq (feature-type f) :filled-by)
			   (eq (relation f) relation))
		 append (role-fillers f)))))
    (when fillers
      (when (role-is-single-valued-p relation)
	(if (cdr fillers)
	    (error "Multiple fillers for single-valued relation ~S" relation)
	    (setq fillers (car fillers))))
      (setq fillers (if (or (symbolp fillers)
	                    (consp fillers))
	              `',fillers
	              fillers))
      ;; THIS CONDITIONAL HAS BEEN SHORT-CIRCUITED:  RMM 5/13/94
      (if (boundp '*slotInitializationAlist*)
        (progn (setf *slotInitializationAlist*
                     (acons (name relation) fillers *slotInitializationAlist*))
               NIL)                     ; Return NIL as the initform!
        fillers)) ))

;(defun overlay-slot-mixin (slotDefinition concept)
;  ;; Look for a slot mixin on "concept" that matches the slot in 
;  ;;    "slotDefinition", and if one is found, add the mixin into the slot,
;  ;;    clobbering any options in "slotDefinition" that share the
;  ;;    same keyword;
;  (let ((matchingMixin
;         (assoc (first slotDefinition) (mixin-slots concept))))
;    (when matchingMixin
;      (loop for tail on (rest matchingMixin) by #'cddr
;           do
;           (if (eq (first tail) ':accessor)
;             (push (cons (first tail) (second tail))
;                   slotDefinition)
;             (setf (getf slotDefinition (first tail))
;                   (second tail)))))
;    slotDefinition ))

;; Used in context sensitive call:

(defun overlay-slot-mixin (slotDefinition concept)
  ;; Look for a slot mixin on "concept" that matches the slot in 
  ;;    "slotDefinition", and if one is found, add the mixin into the slot,
  ;;    clobbering any options in "slotDefinition" that share the
  ;;    same keyword;
  (let ((matchingMixin
         (assoc (first slotDefinition) (mixin-slots concept))))
    (when matchingMixin
      (loop for tail on (rest matchingMixin) by #'cddr
           do
           (unless (member (first tail) '(:accessor :reader :writer))
             (setf (getf slotDefinition (first tail))
                   (second tail)))))
    slotDefinition ))
      
  
  ;;
;;;;;; Redefinition of CLOS classes
  ;;

(defun redefine&relink-clos-class (self)
  ;; Define a CLOS class for the concept "self", and update the link
  ;;    between "self" and a possibly pre-existing CLOS class;
  ;; BUG: IF "self" IS DESTROYED AND REDEFINED, BUT IS *NOT* SHADOWED,
  ;;    THEN CLOS OBJECTS MAY POINT TO DISCARDED CONCEPT VIA DYNAMIC TYPES;
  ;;    WE NEED TO PUT CLOS INSTANCES INTO CONTEXTS TO REMEDY THIS???
  (when (not (shadowed-by-clos-class-p self))
    (return-from redefine&relink-clos-class nil))
  (let* ((closClass (CLOS::find-class (name self) nil))
         closInstance oldConcept)
    (cond
      ((null closClass)
       ;; define a new CLOS class:
       (define-clos-class self))
      #+:TI((typep closClass 'built-in-class)
       ;; Don't redefine built-in CLOS classes on TI:
	    (return-from redefine&relink-clos-class nil))
      ;; clos class exists -- insure that the old CLOS class is compatible
      ;;     with the current concept definition:
      ((or (not (typep closClass 'CLOS::STANDARD-CLASS))
           (not (subtypep (CLOS::class-name closClass) 'CLOS-INSTANCE)))
       ;; avoid clobbering a CLOS class not created by Loom:
       ;; and also suppress warning if we are defining a new constant!
       (unless (or (member :existing-class (system-attributes self))
		   (subconcept-p self (loom-constant CONSTANT)))
         (warn "Concept ~S is supposed to have an associated CLOS class, but~%   ~
                the existing class with the same name is not a subclass of CLOS-INSTANCE.~%"
               (generate-external-reference self))))
      (t
       ;; redefine the CLOS class if its definition does not
       ;;    match the concept definition:
       (maybe-redefine-clos-class closClass self)      
       ;;    establish new "loom-concept" link, or replace old link:
 ;      (setq oldConcept (loom-concept (CLOS::class-prototype closClass)))	; TAR 12/14/92
       (setq oldConcept 
             (loom-concept (setq closInstance (make-instance closClass))))	; TAR 12/14/92
       (when (neq oldConcept self)
        ;; legal class exists, but "loom-concept" link is null, or is
        ;;    pointing to a concept other than "self";
        (when (and oldConcept
                   (not (obsolete-concept-p oldConcept)))
          (warn "Can't create a CLOS class for concept ~S in ~%   ~
                 context ~S because another concept in~%   ~
                 context ~S has the same name."
                (generate-external-reference self) (context self)
                (context oldConcept))
          ;; return without relinking the CLOS class:
          (return-from redefine&relink-clos-class nil))
 ;       (setf (loom-concept (CLOS::class-prototype closClass)) self)	; TAR 12/14/92
        (setf (loom-concept closInstance) self)	; TAR 12/14/92
	))) ))

(defun class-matches-concept-p (class concept)
  ;; Test whether the description of "class" matches the
  ;;   definition of "concept";
  (let ((classSupers (get-names-of-supers class))
        (classSlots (set-difference
                     (get-names-of-direct-slots class)
                     (list 'LOOM-CONCEPT)))
        (conceptSupers
          (compute-names-of-class-supers concept))
        (conceptSlots
         (remove-duplicates
          (append
           (loop for slotD in (mixin-slots concept)
                collect (first (list-of slotD)))
           (loop for r in (compute-class-slots concept)
                when (name r)
                collect (name r))))))
    (and (set-equal-p classSupers conceptSupers)
	 (set-equal-p classSlots conceptSlots)) ))

(defun maybe-redefine-clos-class (oldClass concept)
  ;; Redefine "oldClass" if its description does not match the
  ;;    definition of "concept";
  ;; QUESTION: SHOULD WE CARE IF SLOT ALLOCATION DOESN'T
  ;;    MATCH BETWEEN OLD AND NEW?
  (unless (class-matches-concept-p oldClass concept)
    (define-clos-class concept)) )

(defun obsolete-concept-p (concept)
  ;; Return t if "concept" was destroyed and can't be found in the
  ;;    current context hierarchy;
  (let ((context (context concept))
        replacementConcept)
    (or (not (member context (list-contexts)))
        (null (setq replacementConcept
                   (get-concept (name concept) :context context :no-error-p t)))
        (neq replacementConcept concept)) ))

(defun unlink-clos-class-from-concept (concept)
  ;; Situation: "concept" is being destroyed;
  ;; Clear the pointer from its class, if it has one, so that "concept" can
  ;;    be garbage collected;
  (let* ((name (name concept))
         (closClass (and (symbolp name)
                         (find-class (name concept) nil)))
	 closInstance)
   ; make-instance used to be CLOS::class-prototype.  TAR 12/15/92
    (when (and closClass
               #-:TI(CLOS::slot-exists-p closClass 'CLOS::class-prototype)
	       #+:TI(not (typep closClass 'built-in-class))	; INCOMPLETE
               (eq (loom-concept (setf closInstance (make-instance closClass))) 
                   concept))
      (setf (loom-concept closInstance) nil)) ))

(defmethod CLOS::update-instance-for-redefined-class :after
           ((instance INSTANCE-WITH-DYNAMIC-SLOTS) added-slots discarded-slots
            property-list &rest initargs)
  ;; Copies information from dynamic slots to new real slots and vice versa;
  ;;        OK on TI, lucid, allegro, MCL
  ;; BUGS?: Allegro & MCL: Also redefines LOOM-CONCEPT (shared slot!)
  ;;        MCL & lucid: Sometimes called when the instance isn't complete.  It
  ;;             is called again after completion and works fine.  Strategy
  ;;             to identify incompleteness:
  ;;                 test existence & boundp-ness of dynamic-variables slot.
  ;;
  (declare (ignore initargs))
  (unless (CLOS::slot-boundp instance 'dynamic-variables)
    (return-from clos::update-instance-for-redefined-class nil))
  (let (temp)
    (loop for slotName in added-slots
          when (setq temp
                     (assoc slotName (slot-value instance 'dynamic-variables)))
          do (setf (slot-value instance slotName) (cdr temp))
             (delf (slot-value instance 'dynamic-variables) temp))
    (loop for slotName in discarded-slots
          when #-(or EXCL MCL) (setq temp (getf property-list slotName))
	       #+(or EXCL MCL) (setq temp (and (not (CLOS::slot-exists-p instance slotName))
				               (getf property-list slotName)))
          do (push (cons slotName temp)
                   (slot-value instance 'dynamic-variables))) ))

(defmethod CLOS::update-instance-for-redefined-class :after
           ((instance INSTANCE-WITH-CONCEPTS) added-slots discarded-slots
            property-list &rest initargs)
  ;; If cached-types is on the added-slots list, copy information from
  ;;    loom-concept to cached-types;
  ;;        MCL&lucid: Sometimes called when the instance isn't complete.  It
  ;;             is called again after completion and works fine.  Strategy
  ;;             to identify incompleteness:
  ;;                 test existence & boundp-ness of dynamic-variables slot.
  ;;
  (declare (ignore discarded-slots property-list initargs))
  (unless (CLOS::slot-boundp instance 'loom-concept)	
    (return-from clos::update-instance-for-redefined-class nil))
  (when (member 'cached-types added-slots)
    (setf (dynamically-asserted-conjuncts instance)     ;  TAR 12/7/93
	  (list (slot-value instance 'loom-concept)))) )

(defmethod CLOS::update-instance-for-redefined-class
           ((instance CLOS-INSTANCE) added-slots discarded-slots
            property-list &rest initargs)
  ;; Situation: The class of "instance" has been changed.
  ;; Do some clean up to handle the cases where the new class of "instance"
  ;;   doesn't have as much Loom functionality as the old class;
  ;;   (1)  If we have lost INSTANCE-WITH-HISTORIES we need to fix up the
  ;;        the pointers from the history instance;
  ;;   (2)  If we have lost INSTANCE-IN-MATCH-NETWORK we need to remove the
  ;;        instance from the rete net without triggering concept bombs;
  #+(or :MCL :EXCL :CMU) (declare (ignore added-slots initargs))
  (when (member 'previous-instance discarded-slots)
    (let ((previous (getf property-list 'previous-instance)))
      (typecase previous
        (NON-EXISTENT-INSTANCE
         (removef (next-instance previous) instance))
        (REAL-HISTORY-INSTANCE
         (setf (next-instance previous) nil))) ))
  (when (member 'rete-role-bombs discarded-slots)
    (retract-discard-from-rete-network instance nil)
    (delf *list-of-modified-rete-instances* instance))
  (call-next-method) )

  ;;
;;;;;; "has-instance-p" for CLOS instances
  ;;

(defmethod has-instance-p ((concept UNARY-ENTITY) (instance CLOS-INSTANCE))
  (has-bc-instance-p concept instance nil nil) )

;; SO FAR WE ARE AVOIDING THE USE OF THE RETE NETE CACHE IN BACKCHAINING:
;(defmethod has-instance-p ((concept UNARY-ENTITY) (instance INSTANCE-IN-MATCH-NETWORK))
;  (has-bc-instance-p 
;   concept instance nil (use-rete-cache-p concept instance)) )

(defmethod not-has-instance-p ((concept UNARY-ENTITY) (instance CLOS-INSTANCE))
  ;; Return t iff "instance" is provably not an instance of "concept";
  ;; TO DO: ADD CYCLE CHECK IN BC MODE???
  (declare (special *collectedConceptTests*))
  (multiple-value-bind (currentType otherFeatures)
      (find-type&residue-features instance)
    (let ((resultP
	    (or (disjoint-concepts-p currentType concept)
		(and (probe-closed-concept-p concept)
		     (not (has-instance-p concept instance)))
		(and (not (subconcept-p currentType concept))
		     (instance-contradicts-features-p 
		       instance concept currentType otherFeatures)))))
      (when (and (boundp '*collectedConceptTests*)
		 (primitive-p concept))
	(push (list* instance `(:conflict ,concept) resultP)
	      *collectedConceptTests*))
      resultP )))


  ;;
;;;;;; CLOS-INSTANCE methods
  ;;

;;; Collectively, the methods below constitute LOOM's equivalent of a
;;;    meta-object protocol for objects of type CLOS-INSTANCE.  This
;;;    protocol addresses a set of behavioral issues that is largely
;;;    orthogonal to the kinds of functionality found in something like
;;;    CLOS's meta protocol.

;;; CLOS-INSTANCE Creation and Destruction:

(defmethod initialize-clos-instance ((self CLOS-INSTANCE) identifier context)
  ;; Called by "make-object" and "create-clos-instance":
  ;; Return "self";
  ;; This generic function exists to add "self" to the extension of the concept
  ;;    for "self".  However, in the default case, nothing happens;
  (declare (ignore identifier context))
  self )

(defmethod destroy-object ((self CLOS-INSTANCE))
  ;; Unintern instance;
  ;; Remove role fillers.
  (loop for (name . nil) in (list-role-names&values self)
        as role = (get-relation name)
        when role
          do (fclear-value self role)) )

(defmethod forget-all-about ((self CLOS-INSTANCE) &key dont-unintern-p
			      destroy-tbox-constant-p)
  ;; Retract all binary propositions that relate other instances to "self";
  ;; Remove "self" from the extensions of all concepts in its type;
  ;; If "dont-unintern-p", void the type and slot fillers of "self",
  ;;    otherwise unintern "self";
  (declare (ignore destroy-tbox-constant-p))
  (if dont-unintern-p
    ;; binding *dontUninternP* sends a signal to
    ;;    "INSTANCE-IN-CONTEXT.destroy-object":
    (let ((*dontUninternP* t))
      (declare (special *dontUninternP*))
      (destroy-object self))
    (progn
      (destroy-object self)
      (discard-instance self))) )


;;; CLOS-INSTANCE Slot Accessing

(defmethod get-slot-value ((self CLOS-INSTANCE) role)
  ;; Read slot accessor function for CLOS instances;
  (CLOS::slot-value self (name role)) )

(defmethod get-slotName-value ((self CLOS-INSTANCE) roleName)
  ;; Read slot accessor function for CLOS instances.  More efficient
  ;;   than GET-SLOT-VALUE because we avoid the NAME call;
  ;; This is used internally to allow normal and context sensitive
  ;;   access to slot values through accessor functions.
  (CLOS::slot-value self roleName) )

(defmethod get-slot-values ((self CLOS-INSTANCE) role)
  ;; Read slot accessor function for CLOS instances;
  (slot-value-to-values (CLOS::slot-value self (name role)) role) )

(defmethod CLOS::slot-missing (class (object CLOS-INSTANCE)
				     slot-name operation &optional new-value)
  ;; Return nil on non-existent slot, rather than falling into the
  ;;    debugger;
  (declare (ignore class new-value))
  (when (eq operation 'setf)
    (cerror "Ignore the assignment operation and continue Loom execution."
	    "Attempt to assign a value to non-existent slot ~A of ~A.~%~
You should either define a role ~A for the concept ~A~%~
or use the mixin INSTANCE-WITH-DYNAMIC-SLOTS."
	    slot-name object slot-name
            (CLOS::class-name (CLOS::class-of object)))) )

;; TI BUG: IF slot-value is called inside a method body, then SLOT-MISSING
;;  calls are not done properly for SETF forms.  The NEW-VALUE parameter is
;;  not passed.  This then causes Loom's dynamic-variables protocol (which
;;  relies on the SLOT-MISSING methods) to break.  The work around is have
;;  the TI call a separate function to set the slot value.
;;   -- TAR 5/24/93

#+:TI (defun set-clos-slot (self slotName newValue)
        (setf (CLOS::slot-value self slotName) newValue))

(defmethod set-slot-value ((self CLOS-INSTANCE) role newValue)
  ;; Write slot accessor function for CLOS instances;
  ;; Called by "set-value" and "add-value";
  ;; Note: When passed a CLOS instance, the "tell" code does not bottom out
  ;;    here, but instead calls "CLOS-INSTANCE.assert-role-filler";
  #+:TI(declare (notinline set-clos-slot))
  #+:TI(set-clos-slot self (name role) newValue)
  #-:TI(setf (CLOS::slot-value self (name role)) newValue)
  )

(defmethod set-slotName-value ((self CLOS-INSTANCE) roleName newValue)
  ;; Write slot accessor function for CLOS instances.  More efficient
  ;;   than GET-SLOT-VALUE because we avoid the NAME call;
  ;; This is used internally to allow normal and context sensitive
  ;;   access to slot values through accessor functions.
  #+:TI(declare (notinline set-clos-slot))
  #+:TI(set-clos-slot self role newValue)
  #-:TI(setf (CLOS::slot-value self roleName) newValue)
  )

(defmethod set-slot-values ((self CLOS-INSTANCE) role newValues)
  ;; Write slot accessor function for CLOS instances;
  ;; Called by "set-value" and "add-value";
  #+:TI(declare (notinline set-clos-slot))
  #+:TI(set-clos-slot self (name role) 
                      (slot-values-to-value newValues role))
  #-:TI(setf (CLOS::slot-value self (name role))
             (slot-values-to-value newValues role)) )

(defmethod fclear-value ((instance CLOS-INSTANCE) role)
  ;; Called by "set-value" and "fset-value";
  ;; Fast method for clearing out a role/slot;
  (setf (CLOS::slot-value instance (name role)) nil))

(defmethod assert-half-role-filler ((instance CLOS-INSTANCE)
                                    role filler oldValue justification)
  ;; Assert that "filler" is a filler of "role" of "instance";
  ;; Clip old filler if "role" is single-valued;
  ;; Note: Disabling clipping is NOT an option with CLOS instances;
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
    (update-query-indices instance role filler :assertion)) )

(defmethod retract-half-role-filler
           ((instance CLOS-INSTANCE) role filler oldValue justification)
  ;; Called by some "retract-role-filler" methods
  ;; NONDESTRUCTIVELY remove "filler" from "role" of "instance";
  (declare (ignore justification)
           (inline update-query-indices))
  (when (filler-matches-old-filler-p role filler oldValue)
    (set-slot-value instance role
                    (if (or (atom oldValue)
                            (role-is-single-valued-p role)
                            (null (rest oldValue)))
	              nil
	              (remove filler oldValue :test #'filler-equal)))
    (update-query-indices instance role filler :retraction)) )

(defmethod assert-inverse-half-role-filler
           ((filler CLOS-INSTANCE) role instance justification)
  ;; Assert the inverse role relationship, if one exists, that "instance" is
  ;;    a filler of the inverse of "role" in the instance "filler".
  ;;The top-level method does nothing, since clos instances don't have inverses.
  (declare (ignore role instance justification))
  nil )

;; Can Use default method:
(defmethod retract-inverse-half-role-filler
           ((filler CLOS-INSTANCE) role instance justification)
  ;; Retract the inverse role relationship, if one exists, that "instance" is
  ;;    a filler of the inverse of "role" in the instance "filler".
  ;;The top-level method does nothing, since clos instances don't have inverses.
  (declare (ignore role instance justification))
  nil )


;;; CLOS-INSTANCE Type Manipulation

(defmethod local-assert-conjunct ((instance CLOS-INSTANCE) conjunct justification)
  ;; General purpose assert one conjunct for all CLOS-INSTANCES.
  ;; Asserting and retracting conjuncts is not supported for instances of
  ;;    type CLOS-INSTANCE;
  (declare (ignore justification))
  (when (not (eq conjunct (loom-concept instance)))
    (warn "Type assertion is not supported for instance of type CLOS-INSTANCE.
Support for dynamically asserted types is obtained by including the
mixin class INSTANCE-WITH-CONCEPTS.")) )

(defmethod local-retract-conjunct ((instance CLOS-INSTANCE) conjunct justification)
  ;; General purpose retract one conjunct for all CLOS-INSTANCES.
  ;; Asserting and retracting conjuncts is not supported for instances of
  ;;    type CLOS-INSTANCE;
  (declare (ignore conjunct justification))
  (warn "Type retraction is not supported for instance of type CLOS-INSTANCE.
Support for dynamically asserted types is obtained by including the
mixin class INSTANCE-WITH-CONCEPTS.") )

(defmethod find-type&residue-features ((self CLOS-INSTANCE))
  ;; Return two values for "self":
  ;;    (1) the implied type of "self";
  ;;    (2) nil (CLOS instances don't have attached features);
  (values (loom-concept self) nil) )

(defmethod get-cached-types ((self CLOS-INSTANCE))
  ;; Return a list of all asserted or inferred types of "self";
  (list (loom-concept self)) )


  ;;
;;;;;; INSTANCE-IN-CONCEPT-EXTENSION
  ;;

;;; CAUTION: "INSTANCE-IN-CONCEPT-EXTENSION.initialize-clos-instance" does
;;;    not call "call-next-method" because (1), "CLOS-INSTANCE.initialize-clos-instance"
;;;    is a no-op, and (2), all other methods that call "initialize-clos-instance"
;;;    are attached to CLOS classes that specialize "INSTANCE-IN-CONCEPT-EXTENSION".
;;;    We have a bug if changes to the CLOS hierarchy invalidate these assumptions.
;;; The same holds for "destroy-object".

(defmethod initialize-clos-instance 
           ((self INSTANCE-IN-CONCEPT-EXTENSION) identifier context)
  ;; Called by "make-object" and "create-clos-instance";
  ;; Add "self" to the index of local instances for the LOOM
  ;;    concept indicated by "(loom-concept self)";
  ;; Return "self";
  (declare (ignore identifier context))
  (add-to-local-instances (loom-concept self) self)
  self )


  ;;
;;;;;; INSTANCE-WITH-CONCEPTS methods
  ;;

;;; INSTANCE-WITH-CONCEPTS Creation and Destruction:

;;; OBSOLETE: "create-instance" NOW CALLS "assert-conjunct":
;(defmethod initialize-clos-instance
;	   ((self INSTANCE-WITH-CONCEPTS) identifier context)
;  ;; "INSTANCE-IN-CONCEPT-EXTENSION.initialize-clos-instance" adds "self"
;  ;;    to the index of local instances for the LOOM concept shadowed by
;  ;;    the CLOS class "(loom-concept self)";
;  ;; Here we also push the same concept onto the slot
;  ;;    "(dynamically-asserted-conjuncts self)";
;  ;; Return "self";
;  #+(or :EXCL :MCL) (declare (ignore identifier context))
;  (call-next-method)
;  (unless (eq (loom-concept self) *thing*)
;    (pushnew (loom-concept self) (dynamically-asserted-conjuncts self)))        ; TAR 8/13/93
;  self )

(defmethod destroy-object ((self INSTANCE-WITH-CONCEPTS))
  ;; Unintern instance;
  ;; Retract concept assertions;
  (let ((intrinsicConcept (intrinsic-concept self))
        (loomConcept (loom-concept self)))
    (loop for c in (dynamically-asserted-conjuncts self)
          unless (or (eq c (loom-constant THING))
                     (eq c intrinsicConcept)
                     (eq c loomConcept))
          do (local-retract-conjunct self c :retraction)))
  (call-next-method) )

(defmethod local-assert-conjunct ((instance INSTANCE-WITH-CONCEPTS) conjunct justification)
  ;; Add "instance" to the index of local instances for the LOOM concept
  ;;    "conjunct" and push "conjunct" onto the list of dynamically asserted 
  ;;    conjuncts attached to "instance";
  ;; Clear the cache containing the type of "instance";
  ;; CONSIDER ADDING WARNING WHEN ASSERTING :perfect CONJUNCT;
  (when (and (not (member conjunct (dynamically-asserted-conjuncts instance)))
             (eq justification :assertion))
    (push conjunct (dynamically-asserted-conjuncts instance))
    (add-to-local-instances conjunct instance)
    ;: clear cached unification of conjuncts:
    (setf (cached-types instance) nil)) )

(defmethod local-retract-conjunct ((instance INSTANCE-WITH-CONCEPTS) conjunct justification)
  ;; Remove "conjunct" from the list of asserted conjuncts for "instance";
  ;; Clear the cache containing the type of "instance";
  (declare (ignore justification))
  (cond 
   ;; Disable warning and test since it interferes with recursive calls needed
   ;; by CONTEXT-SENSITIVE-INSTANCE;
   ;    ((not (member conjunct (dynamically-asserted-conjuncts instance)))
   ;     (warn "Can't retract concept ~S from instance ~S because the instance is not
   ;   asserted to be of that type.~%"
   ;	   (name conjunct) instance ))
   ((or (eq conjunct (loom-concept instance))
	(eq conjunct (intrinsic-concept instance)))
    (warn "Can't retract concept ~S from instance ~S because ~S
    matches the creation type or CLOS class of that instance.~%"
	  (name conjunct) instance (name conjunct)))
   ((monotonic-p conjunct)
    (warn "Can't retract concept ~S from instance ~S because
   the concept is marked :monotonic"
          (generate-external-reference conjunct) instance))
   ((member conjunct (dynamically-asserted-conjuncts instance))
    (removef (dynamically-asserted-conjuncts instance) conjunct)
    (setf (cached-types instance) nil))
   (t nil)) )

(defmethod find-type&residue-features ((self INSTANCE-WITH-CONCEPTS))
  ;; Return two values for "self":
  ;;    (1) the unification of the asserted list of conjuncts;
  ;;    (2) nil (CLOS instances don't have attached features);
  ;; TO DO:  FIGURE OUT IF DISCARDED ITEMS IN THE CACHE SHOULD BE HANDLED
  ;;         BY MAKING SURE THE CACHE IS CLEARED WHEN CONCEPTS ARE DISCARDED!
  (values
   (or (let ((types (cached-types self)))
         (and types
              (null (rest types))
              (not (discarded-p (first types)))         ;  TAR 6/6/96
              (first types)))
       (let ((types (help-compute-types self)))
         (cond                          ; RMM 10/10/94
          ((null types)                 ;  TAR 12/5/94
           (or (intrinsic-concept self) (loom-concept self) *thing*))
          ((null (rest types))
           (setf (cached-types self) types)
           (first types))
          ((member (loom-constant INCOHERENT) types)
           (setf (cached-types self) types))
          (t
           (first (setf (cached-types self)
                        (list (create-conjunction-concept types nil))))))))
   nil) )

(defmethod get-cached-types ((self INSTANCE-WITH-CONCEPTS))
  ;; Return a list of all asserted or inferred types of "self";
  ;; Note: We are careful here NOT to call "compute-unified-type".
  (or (cached-types self)
      (setf (cached-types self) (help-compute-types self))) )

(defun help-compute-types (self)
  ;; Helping function for "INSTANCE-WITH-CONCEPTS.find-type&residue-features"
  ;;    and "INSTANCE-WITH-CONCEPTS.get-cached-types";
  (let ((types
         (most-specific-conjuncts
          (most-specific-concepts
           (dynamically-asserted-conjuncts self)))))
    (when (and (rest types)
               (disjoint-set-of-concepts-p types))
      (setq types
            (compute-coherent-types types (intrinsic-concept self)))
      (push (loom-constant INCOHERENT) types))
    types ))


  ;;
;;;;;; INSTANCE-WITH-DYNAMIC-SLOTS
  ;;

(defmethod CLOS::slot-missing (class (object INSTANCE-WITH-DYNAMIC-SLOTS)
				     slot-name operation &optional new-value)
  ;; Turn a missing slot accesses into dynamic slot accesses for reading
  ;;    and writing;
  (declare (ignore class))
  (if (eq operation 'setf)
      (set-dynamic-slot-value object slot-name new-value)
      (dynamic-slot-value object slot-name)))


  ;;
;;;;;; INSTANCE-WITH-INVERSES
  ;;

(defmethod destroy-object ((self INSTANCE-WITH-INVERSES))
  ;; Using  inverse links, find instances that point at "self", and
  ;;    remove those links (pointers at "self" that don't have inverse
  ;;    links don't get removed);
  ;; BUG: IF "self" IS AN INSTANCE-WITH-HISTORIES AND HISTORIES HAVE
  ;;    BEEN :disabled FOR "self", THIS METHOD SHOULD NOT HAPPEN;
  (let ((slotNames (get-names-of-slots (CLOS::class-of self))))
    (when (member 'dynamic-variables slotNames)
      (loop for entry in (dynamic-variables self)
            do (push (car entry) slotNames)))
    (loop for slotName in slotNames
          as role = (get-relation slotName :no-error-p t)
	  when (and role
;; THIS LOOKS WRONG TO ME -- PROPERTIES ARE IN THE CONCEPT SPACE  RMM 3/24/93:
;                    (typep role 'BINARY-RELATION) ;; avoid matching a property
                    (arity role)        ; relation is not discarded
                    (binary-p role)
		    (inverse role))
	  do 
          (loop for filler in (get-slot-values self role)
                ;; SHOULD THIS USE THE HALF-ROLE-FILLER CALLS BECAUSE OF CONTEXTS?
                do (retract-role-filler self role filler :retraction)))
    (call-next-method) ))

(defmethod assert-inverse-half-role-filler
           ((filler INSTANCE-WITH-INVERSES) role instance justification)
  ;; Called by "assert-role-filler";
  ;; Assert the inverse role relationship, if one exists, that "instance" is
  ;;    a filler of the inverse of "role" in the instance "filler".
  (when (eq justification :assertion)
    (let ((inverseRole (inverse role)))
      (if inverseRole
        (assert-half-role-filler filler inverseRole instance 
                                 (get-slot-value filler inverseRole)
                                 :assertion)
        (when (and (classified-instance-p filler)
                   (neq (implied-range role) *Thing*))
          (assert-conjunct filler (implied-range role) :domain/range))) )) )

(defmethod retract-inverse-half-role-filler
           ((filler INSTANCE-WITH-INVERSES) role instance justification)
  ;; Called by "retract-role-filler";
  ;; Retract from the database that "filler" is a filler of "role" of "instance";
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
          (retract-conjunct filler (implied-range role) :domain/range))) )) )

(defmethod fclear-value ((instance INSTANCE-WITH-INVERSES) role)
  ;; Called by "set-value" and "fset-value";
  ;; Not-so-fast method for clearing out a role/slot;
  (let ((fillers (get-slot-value instance role)))
    (if (role-is-single-valued-p role)
	(retract-role-filler  instance role fillers :retraction) 
	(loop for f in fillers
	     do (retract-role-filler instance role f :retraction))) ))


  ;;
;;;;;; INSTANCE-IN-CONTEXT
  ;;

(defmethod initialize-clos-instance 
	   ((self INSTANCE-IN-CONTEXT) identifier context)
  ;; Intern "self" into the context "context" or the
  ;;    current context, with identifier "identifier";
  ;; If "identifier" is nil, make "self" an anonymous instance;
  ;; Return "self";
  (call-next-method)
  (setf (identifier self) (validate-instance-identifier identifier))
  (intern-object identifier self :instances context)
  self )

(defmethod destroy-object ((self INSTANCE-IN-CONTEXT))
  ;; Unintern instance;
  ;; Note: *internNonExistentInstanceP* is bound by
  ;;    "HISTORY-INSTANCE.destroy-object", while *dontUninternP* is bound by
  ;;    "CLOS-INSTANCE.forget-all-about";
  (when (boundp '*internNonExistentInstanceP*)
      ;; point a non-existent instance at "self" and intern it in place
      ;;    of "self";
    ;; TO DO: INTERN NON-EXISTENT INSTANCE IN PLACE OF "instance";
    "NOT YET IMPLEMENTED")
  (when (and (not (boundp '*dontUninternP*))
             (or (null (home-ctxt self))
                 (eq (home-ctxt self) *current-ctxt*)))
    (unintern-object self :instances nil))
  (call-next-method) )

(defmethod context-identifier ((self INSTANCE-IN-CONTEXT))
  ;; Return a pointer to the identifier used to identify "self" during
  ;;    context manipulations;
  ;; If "self" is anonymous, then return nil;
  ;; Called by "unintern-object" and "create-history-instance";
  ;; Note: Logic is borrowed from "DB-INSTANCE.context-identifier";
  (let ((identifier (identifier self)))
    (unless (consp identifier)
      identifier) ))


  ;;
;;;;;; INSTANCE-WITH-HISTORIES
  ;;

(defmethod assert-half-role-filler ((instance INSTANCE-WITH-HISTORIES) 
                                    role filler oldValue justification)
  ;; Insure that the value "oldValue" has been saved in a history instance;
  ;; Signal success to INSTANCE-IN-MATCH-NETWORK method by returning "t";
  #+(or :MCL :EXCL) (declare (ignore filler justification))
  (declare (inline save-now-role-fillers))
  (save-now-role-fillers instance role oldValue)
  (call-next-method) )

(defmethod retract-half-role-filler 
           ((instance INSTANCE-WITH-HISTORIES) role filler oldValue justification)
  ;; Insure that the value "oldValue" has been saved in a history instance;
  ;; Signal success to INSTANCE-IN-MATCH-NETWORK method by returning "t";
  #+(or :MCL :EXCL) (declare (ignore filler justification))
  (declare (inline save-now-role-fillers))
  (save-now-role-fillers instance role oldValue)
  (call-next-method) )

(defmethod local-assert-conjunct ((instance INSTANCE-WITH-HISTORIES) conjunct justification)
  ;; Insure that a history instance for "instance" has been generated 
  ;;    to cache its values for the previous time quantum;
  #+(or :MCL :EXCL) (declare (ignore conjunct justification))
  (find-or-create-history-instance instance)  
  (call-next-method) )

(defmethod local-retract-conjunct ((instance INSTANCE-WITH-HISTORIES) conjunct justification)
  ;; Insure that a history instance for "instance" has been generated 
  ;;    to cache its values for the previous time quantum;
  #+(or :MCL :EXCL) (declare (ignore conjunct justification))
  (find-or-create-history-instance instance)  
  (call-next-method) )

(defmethod initialize-clos-instance 
	   ((self INSTANCE-WITH-HISTORIES) identifier context)
  ;; Do normal initialization of "self" and point the previous instance
  ;;     of "self" to a non-existent instance;
  ;; Return "self";
  #+(or :EXCL :MCL) (declare (ignore identifier context))
  (call-next-method)
  (link-to-non-existent-instance self)
  self )

(defmethod help-get-now-instance ((self INSTANCE-WITH-HISTORIES))
  ;; Return the version of "self" with time point *agent-time*;
  ;; Helping function for "get-now-instance";
  (let ((previousInstance (previous-instance self)))
    (if (and previousInstance
	     (eql (time-point previousInstance) *agent-time*))
	previousInstance
	self) ))

(defmethod get-instance-at-time-point ((self INSTANCE-WITH-HISTORIES) timePoint)
  ;; Return "self" or a history version of it that corresponds to time
  ;;    "timePoint";
  (declare (inline get-instance-with-histories-at-time-point))
  (get-instance-with-histories-at-time-point self timePoint) )

(defmethod destroy-object ((self HISTORIES-MIXIN))
  ;; Fix up histories of "self" to reflect the future non-existence
  ;;    of "self";
  (find-or-create-history-instance self)
  (if (and (previous-instance self)
           (neq (identifier (previous-instance self)) :non-existent))
    (progn
      (let ((*internNonExistentInstanceP* t))
        (declare (special *internNonExistentInstanceP*))
        (call-next-method))
;; WE DON'T DO THIS ANYMORE  4/2/93
;      ;; clobber identifier of previous instance to notify
;      ;;    "HISTORY-INSTANCE.discard-instance" that "instance" should
;      ;;    be discarded:
;      (setf (identifier (previous-instance self))
;            :deleted-but-not-yet-uninterned)
      )
    ;; If the instance didn't exist before now, then we can safely
    ;; get rid of it without preserving the history.  This should only
    ;; happen if the TELL creating the instance and the FORGET-ALL-ABOUT
    ;; deleting it happen within the same agent time.
    (call-next-method)) )


  ;;
;;;;;; INSTANCE-IN-MATCH-NETWORK
  ;;

;;; OBSOLETE: "create-instance" NOW CALLS "assert-conjunct":
;(defmethod initialize-clos-instance 
;	   ((self INSTANCE-IN-MATCH-NETWORK) identifier context)
;  ;; Do normal initialization of "self" and then post "self" for matching
;  ;;    in the rete network;
;  #+(or :EXCL :MCL) (declare (ignore identifier context))
;  (call-next-method)
;  (post-modified-rete-instance self)
;  self )

(defmethod destroy-object ((self INSTANCE-IN-MATCH-NETWORK))
  ;; Post "self" to the modified rete instances queue before discarding
  ;;    so that it can be withdrawn from the rete node (if any) attached
  ;;    to its intrinsic concept (if any);
  (when (and (intrinsic-concept self)
             (rete-node (intrinsic-concept self)))
    (post-modified-rete-instance self))
  (call-next-method) )

(defmethod local-assert-conjunct ((self INSTANCE-IN-MATCH-NETWORK) conjunct justification)
  ;; Post "instance" (unless its already there) to a queue of instances
  ;;    whose types may change at the beginning of the next time step;
  ;; Also, execute normal "assert-conjunct" code;
  #+(or :MCL :EXCL) (declare (ignore conjunct justification))
  (post-modified-rete-instance self)
  (call-next-method) )

(defmethod local-retract-conjunct ((self INSTANCE-IN-MATCH-NETWORK) conjunct justification)
  ;; Post "instance" (unless its already there) to a queue of instances
  ;;    whose types may change at the beginning of the next time step;
  ;; Also, execute normal "retract-conjunct" code;
  #+(or :MCL :EXCL) (declare (ignore conjunct justification))
  (post-modified-rete-instance self)
  (call-next-method) )

(defmethod assert-half-role-filler ((instance INSTANCE-IN-MATCH-NETWORK)
                                    role filler oldValue justification)
  ;; Possibly add a role filler, possibly record a history entry, and possibly
  ;;    generate role cohorts and/or update rete net;
  #+(or :mcl :excl)(declare (ignore oldValue justification))
  (call-next-method)
  (react-to-role-modification-on-rete-instance instance role filler :assertion) )

(defmethod retract-half-role-filler
           ((instance INSTANCE-IN-MATCH-NETWORK) role filler oldValue justification)
  ;; Possibly remove a role filler, possibly record a history entry, and
  ;;    possibly generate role cohorts and/or update rete net;
  #+(or :mcl :excl)(declare (ignore oldValue justification))
  (call-next-method)
  (react-to-role-modification-on-rete-instance instance role filler :retraction) )

;; These two functions just get inline'd into
;;    "react-to-role-modification-on-rete-instance":
(defun scan-if-added-cohorts (role instance filler)
  (when (if-added-cohorts role)
    (distribute-binding-set-to-cohorts 
     (cons instance filler) (if-added-cohorts role)))
  (when (if-added-cohorts (loom-constant HOLDS-TRUE-3))
    (distribute-binding-set-to-cohorts
     (list role instance filler)
     (if-added-cohorts (loom-constant HOLDS-TRUE-3)))))
(defun scan-if-removed-cohorts (role instance filler)
  (when (if-removed-cohorts role)
    (distribute-binding-set-to-cohorts 
     (cons instance filler) (if-removed-cohorts role)))
  (when (if-removed-cohorts (loom-constant HOLDS-TRUE-3))
    (distribute-binding-set-to-cohorts
     (list role instance filler)
     (if-removed-cohorts (loom-constant HOLDS-TRUE-3)))))

(defun react-to-role-modification-on-rete-instance 
       (instance role filler assertion/retraction)
  ;; Update production rule and rete structures that react to role
  ;;    updates;
  ;; Look for cohorts that monitor changes to "role" and look for rete
  ;;    bombs attached to "instance" that monitor changes to "role";
  ;; QUESTION: THE LOGIC USED TO CALL "post-modified-rete-instance" ONLY
  ;;    FOR NON-DERIVED ASSERTIONS AND RETRACTIONS, AND CALLED
  ;;    "scan-role-cohorts" ALWAYS (INCLUDING FOR STRICT AND DEFAULT
  ;;    UPDATES TO "assert-half-role-filler").  NOW BOTH CALLS ARE
  ;;    CONDITIONALIZED.  HAVE WE IMPROVED OR WORSENED THE SITUATION???
  (declare (inline scan-if-added-cohorts scan-if-removed-cohorts))
  ;; store binding set in cohorts at or above "role":
  (case assertion/retraction
    (:assertion
     (scan-if-added-cohorts role instance filler)
     (when (rest (all-super-concepts role))
       ;; more ancestors than just "BINARY-TUPLE":
       (loop for super in (all-super-concepts role)
             do (scan-if-added-cohorts super instance filler))))
    (:retraction
     (scan-if-removed-cohorts role instance filler)
     (when (rest (all-super-concepts role))
       ;; more ancestors than just "BINARY-TUPLE":
       (loop for super in (all-super-concepts role)
             do (scan-if-removed-cohorts super instance filler)))))
  ;; post role-modified instance to rete net if feature bombs exist:
  (when (rete-role-bombs instance)
    (post-modified-rete-instance instance)) )


  ;;
;;;;;; INSTANCE-WITH-NEGATION
  ;;

(defmethod assert-half-role-filler ((instance NEGATION-MIXIN)
                                    role filler oldValue justification)
  ;; Possibly clip a not-filled-by feature asserted to "instance" after
  ;;    asserting the role filler "filler";
  #+(or :mcl :excl)(declare (ignore oldValue justification))
  (call-next-method)
  (clip-not-filled-by-features instance role filler) )

(defun clip-not-filled-by-features (instance role filler)
  ;; Called by "assert-half-role-filler" and 
  ;;    "BASIC-INSTANCE.assert-half-role-filler";
  ;; Clip any not-filled-by features that clash with the new filler "filler"
  ;;     and return a list of not-filled-by features that still clash;
  ;; Note, clashes will only occur if clipping is NOT done!
  (let ((notFilledByFtrs nil)
        (clippingEnabledP (clipping-enabled-p role)))
    (loop for ftr in (asserted-features instance)
          when (and (eq (feature-type ftr) :not-filled-by)
                    (eq (relation ftr) role)
                    (member filler (non-role-fillers ftr) :test #'filler-equal))
          do (if clippingEnabledP
               (retract-feature instance ftr)
               (push ftr notFilledByFtrs)))
    notFilledByFtrs) )

(defmethod local-assert-conjunct ((instance NEGATION-MIXIN) conjunct justification)
  ;; Clip any negated concepts and call next method;
  ;; TO DO: ADD INCOHERENCE DETECTION CODE;
  #+(or :MCL :EXCL) (declare (ignore justification))
  (when (member :clip-types *loom-match-features*)
    (retract-not-in instance conjunct))
  (call-next-method) )

(defmethod local-assert-not-in ((self INSTANCE-WITH-NEGATION) concept)
  ;; Assert that the instance "self" does not satisfy the concept "concept";
  (unless (member concept (asserted-negations self))
    (when (member concept (dynamically-asserted-conjuncts self))  ;  TAR 3/30/94
      (if (member :clip-types *loom-match-features*)
        (retract-conjunct self concept :retraction)
        ;; NOTE:  Following is not flagged in local-assert-conjunct for LITE instances:
        (grumble "Asserting (NOT ~A) about ~A is incoherent. -- NOT YET HANDLED BY LOOM!"
                 (name concept) self)))
    (push concept (asserted-negations self))) )         ; Or (call-next-method) ?

;; CAUTION: THIS IS DESIGNED TO DISPATCH ON LITE-INSTANCEs, BUT NOT ON
;;    BASIC- OR DB-INSTANCEs.
(defmethod find-type&residue-features ((self INSTANCE-WITH-NEGATION))
  ;; Return two values for "self":
  ;;    (1) the unification of the asserted list of conjuncts;
  ;;    (2) nil (CLOS instances don't have attached features);
  ;; Caution: The (call-next-method) assumes that "INSTANCE-WITH-NEGATION"
  ;;    inherits the mixin "INSTANCE-WITH-CONCEPTS";
  (values
   (call-next-method)
   (reclassify-instance-features self :asserted)) )

  ;;
;;;;;; CONTEXT-SENSITIVE-INSTANCE
  ;;

(defmethod initialize-clos-instance 
	   ((self CONTEXT-SENSITIVE-INSTANCE) identifier context)
  ;; Setup the proper ctxt value and then do normal initialization of "self";
  #+(or :EXCL :MCL) (declare (ignore identifier))
  (setf (home-ctxt self) (ctxt (or context *context*)))
  (let ((*do-in-subcontexts-p* t))   ;Force to happen at all levels ; TAR 6/19/96 
    (execute-in-contexts-depth-first (call-next-method)))
  self )

(defmethod destroy-object ((self CONTEXT-SENSITIVE-INSTANCE))
  ;; Unintern instance in all sub-contexts;
  (execute-in-contexts-depth-first (call-next-method)) )

(defmethod forget-all-about ((self CONTEXT-SENSITIVE-INSTANCE)
                             &key (dont-unintern-p (neq *current-ctxt* (home-ctxt self)))
			          destroy-tbox-constant-p)
  ;; Only allow a full forget-all-about if we are in the home context of "self";
  ;; The "dont-unintern-p" argument is only valid in the home context, 
  ;;     otherwise ignore it (and inform user);
  (declare (ignore destroy-tbox-constant-p))
  (if (eq *current-ctxt* (home-ctxt self))
    (call-next-method)
    (progn 
      (unless dont-unintern-p
        (inform "FORGET-ALL-ABOUT can only unintern instances in their home ~
                 context.~%The home context for ~A is ~A.~%The current~
                 context is ~A."
                self
                (loop with homeCtxt = (home-ctxt self)
                      for context in (list-contexts)
                      when (eq (ctxt context) homeCtxt)
                      return context)
                *context*))
      ;; Tricky:  We need to pass the value of "dont-unintern-p" explicitly
      ;;    because the default value will not be passed with a plain
      ;;    "(call-next-method)"
      (call-next-method self :dont-unintern-p t))) )


(defmethod get-slot-value ((self CONTEXT-SENSITIVE-INSTANCE) role)
  ;; Standard read slot accessor function;
  (access-in-ctxt (CLOS::slot-value self (name role)) nil (home-ctxt self)) )

(defmethod get-slotName-value ((self CONTEXT-SENSITIVE-INSTANCE) roleName)
  ;; Read slot accessor function for CLOS instances.  More efficient
  ;;   than GET-SLOT-VALUE because we avoid the NAME call;
  ;; This is used internally to allow normal and context sensitive
  ;;   access to slot values through accessor functions.
  (access-in-ctxt (CLOS::slot-value self roleName) nil (home-ctxt self)) )

(defmethod set-slot-value ((self CONTEXT-SENSITIVE-INSTANCE) role newValue)
  ;; Standard write slot accessor function;
  (update-slot-in-ctxt self (name role) newValue t) )

(defmethod set-slotName-value ((self CONTEXT-SENSITIVE-INSTANCE) roleName newValue)
  ;; Write slot accessor function for CLOS instances.  More efficient
  ;;   than GET-SLOT-VALUE because we avoid the NAME call;
  ;; This is used internally to allow normal and context sensitive
  ;;   access to slot values through accessor functions.
  (update-slot-in-ctxt self roleName newValue t) )

(defmethod get-slot-values ((self CONTEXT-SENSITIVE-INSTANCE) role)
  ;; Standard read slot accessor function;
  (slot-value-to-values 
   (access-in-ctxt (CLOS::slot-value self (name role)) nil (home-ctxt self))
   role) )

(defmethod set-slot-values ((self CONTEXT-SENSITIVE-INSTANCE) role newValues)
  ;; Standard write slot accessor function;
  (update-slot-in-ctxt self (name role) (slot-values-to-value newValues role) t) )

;(defmethod assert-half-role-filler ((instance CONTEXT-SENSITIVE-MIXIN) role 
;                                    filler oldValue justification)
;  ;; Possibly add a role filler, and recurse on all child contexts;
;  ;; Plan:  First see if there is a direct entry.  Otherwise, do the multiple
;  ;;     inheritance check.  This eliminates the need to do the multiple
;  ;;     inheritance check whenever we are in a multiple-inheriting context;
;  ;; TO DO: (1) INVESTIGATE WHETHER WE NEED TO CALL 
;  ;;      "execute-in-contexts-BREADTH-first" IN THIS CODE:
;  (if (eq justification :assertion)
;    (let ((roleName (name role))
;          (singleValuedP (role-is-single-valued-p role)))
;      (execute-in-contexts-depth-first
;       ;;  get and test direct value:
;       (unless (setq oldValue (access-in-ctxt (slot-value instance roleName) 
;                                              (home-ctxt instance)))
;         (calculate-multiple-parent-inheritance
;          instance roleName singleValuedP)
;         ;; get context sensitive inherited value:
;         (setq oldValue (get-slot-value instance role)))
;       (unless  (filler-matches-old-filler-p role filler oldValue)
;         (call-next-method instance role filler oldValue justification))))
;    ;; derived fillers happen in a single context:
;    (call-next-method)) )

;(defmethod retract-half-role-filler
;           ((instance CONTEXT-SENSITIVE-INSTANCE) role filler oldValue justification)
;                                              )
;  ;; Possibly remove a role filler, and recurse on all child contexts;
;  (let ((roleName (name role))
;        (singleValuedP (role-is-single-valued-p role)))
;    (unless (setq oldValue (access-in-ctxt (slot-value instance roleName)
;                                           (home-ctxt instance)))
;      (calculate-multiple-parent-inheritance instance roleName singleValuedP)
;      ; Get context sensitive inherited value:
;      (setq oldValue (get-slot-value instance role))) ; Get context sensitive value
;    (when  (filler-matches-old-filler-p role filler oldValue)
;      (call-next-method instance
;                        role
;                        filler
;                        oldValue
;                        justification
;                        )) ))

(defun calculate-multiple-parent-inheritance (instance roleName singleValuedP)
  ;; Situation:  Potential multiple inheritance going down the context tree;
  ;; Determine if multiple inheritance is an issue and update slot "roleName"
  ;;    on "instance".
  (multiple-value-bind (multipleP valueList)
                       (multiple-inheritance-p instance 
                                               roleName
                                               (parent-contexts *context*))
    (when multipleP
      (if singleValuedP
        (progn (cerror "Return an arbitrary value."
                       "Single-valued role ~S on ~S has multiple values ~{~S~^, ~}."
                       roleName instance valueList)
               (update-slot-in-ctxt instance roleName (car valueList) nil))
        (update-slot-in-ctxt 
	 instance roleName 
	 (reduce #'(lambda (x y) (union x y :test #'filler-equal)) valueList)
	 nil))) ))

;; ISSUES



#|

TO DO: MAKE "CLOS-INSTANCE.forget-all-about" UNDERSTAND "dont-unintern-p".

QUESTION: HOW DOES FORGET-ALL-ABOUT FIGURE OUT WHICH CONTEXT THE
  INSTANCE IS IN???

TEST OUT PERMORMANCE WHEN 100 INSTANCES ARE ADDED TO MUTABLE HEAP

|#
