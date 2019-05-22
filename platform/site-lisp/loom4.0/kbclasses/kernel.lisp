;;; -*- Mode: LISP; Syntax: Common-lisp; Package: KBCLASSES; Base: 10. -*-

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
 
				    
;;; KERNEL.LISP (KBCLASSES)

;;; This code creates a shell of functions which can be used to construct
;;;    and manage a knowledge base.  The system is called "KBCLASSES".
;;; The basic functions add some meta-object protocol not available with CLOS,
;;;    specifically, some more options for classes and slots, together with
;;;    some macros and functions that utilize these options.

(in-package "KBCLASSES")

(export `( show show-all set-slot-visibility
	  ))


   ;;;;
   ;;;;
;;;;;;;;;; The functions below are used to construct the KBCLASSES kernel.
;;;;;;;;;;    CLOS versions of kernel classes are defined in "braidefs.lisp".
;;;;;;;;;;    Once these functions are defined, the bootstrap re-defines the kernel
;;;;;;;;;;     classes.
   ;;;;
   ;;;;

(defun kbclasses-warning (message &rest arguments)
  ;; Emit a warning message to the user;
  (when (member :emit-warnings *kbclasses-dialogue-features*)
    (format *error-output* "~%KbClasses Warning:   ~?" message arguments)) )


  ;;
;;;;;;  Class, Slot, and Object creation functions
  ;;

(defun create-class (name superClasses listsOfSlotAssignments)
  ;; Create a new KB-CLASS;
  ;; If the class already exists (usually the result of a forward reference)
  ;;    then redefine it;
  ;; NOTE: "create-class" is hard to call directly -- instead use the
  ;;    macro "defClass";
  (let (newClass)
    ;; make a new class, or redefine an existing class with the same name
    (setq newClass (find-or-create-class name))

    ;; if the class already existed and the definition has not changed,
    ;;    then exit
    (when (tree-equal
	    (definition newClass)
	    (cons superClasses listsOfSlotAssignments))
      (return-from create-class nil))
    ;; save the source definition
    (setf (definition newClass) (cons superClasses listsOfSlotAssignments))
    
    ;; if re-defining a class, uncomplete it (when necessary) and then
    ;;    erase most of its old attributes, and any
    ;;    side-effects on other classes; uncomplete the class
    (when (is-defined-p newClass)
      (uncomplete-class-sublattice newClass)
      (reinitialize-class newClass))
    
    (setf (super-classes newClass) (list-of superClasses))
    ;; create a slot corresponding to each item in "listsOfSlotAssignments", and
    ;;    assign a list of slots to "local-slots"
    ;; NOTE: This overwrites any previous assignment to "local-slots"   
    (when listsOfSlotAssignments
      (setf (local-slots newClass)
	    (loop for name&options in listsOfSlotAssignments
		 collect
		 (create-slot (car name&options) (cdr name&options)
			      :domain newClass))))
    
    ;; make LOOM-OBJECT the default if "super-classes" is nil
    (when (and (null (super-classes newClass))
	       (neq newClass (get-class 'LOOM::LOOM-OBJECT)))
      (setf (super-classes newClass) (list (get-class 'LOOM::LOOM-OBJECT))))
    
    (initialize-class newClass)
    (complete-class-slots newClass)
    
    ;; check whether or not it is possible to finalize "newClass", and if it is,
    ;;    do it:
    (maybe-finalize-class newClass)
    ))					; end "create-class"

(defun find-or-create-class (name)
  ;; Return a class with name "name";
  ;; If a class with matching name exists, return it;
  ;; Otherwise, make a new instance of KB-CLASS;
  (let ((class (get-class name))) 
    (when (null class)
      (when (not (symbolp name))
	(error "The class name ~S is not a symbol" name))
      (setq class (make-instance 'KB-CLASS))
      (setf (slot-value class 'name) name)
      (add-kbclasses-class-to-index class))
    class ) )

(defmethod initialize-class ((newClass KB-CLASS))
  ;; "initialize-class" is used to fill in initial values after all
  ;;    slot values have been filled in, i.e., when filling in an
  ;;    initial value here, other values can be examined.
  ;; Perform initialization of "newClass" relating to
  ;;   superClass-subClass attributes;
  
  ;; for the slot "super-classes", convert any symbols in that list into
  ;;    classes and point at them
  (setf (super-classes newClass)
	(loop for super in (super-classes newClass)
	     collect (satisfy-forward-class-ref super newClass)))
  ;; create subClass links from supers
  (loop for superClass in (super-classes newClass) do
       (when (not (member newClass (sub-classes superClass)))
	 (setf (sub-classes superClass)		
	       (push newClass (sub-classes superClass)))))
  (setf (is-defined-p newClass) t)
  ;; fix back-links from local slots to "newClass"
  (loop for slot in (local-slots newClass) do
       (setf (domain slot) newClass)) 
  newClass )

(defun create-slot (name optionValues &key domain)
  ;; Create a slot,initializing it with values from "optionValues";
  ;;    "name" indicates the name (name) of the slot.
  (let ((newSlot (make-instance 'KB-SLOT))
	(legalSlotOptions
	  `( :range :initform :allocation :accessor
	    :collection-p :inverse :one-way-inverse
	    :aliases :do-not-reinitialize :invisible-p
            :context-sensitive-p))      ;  TAR 2/8/94 (Need to do something with it?)
	facetName)
    ;; verify legality of "name" and assign it to "newSlot"
    (when (keywordp name)
      (setq name (remove-keyword-colon name :package-name 'KBCLASSES))) 
    (when (not (symbolp name))
      (error "Illegal slot name: ~S" name))
    (setf (name newSlot) name)
    (setf (domain newSlot) domain)
    ;; update from "optionValues":
    (loop for tail on optionValues by #'cddr
	 do
	 (setq facetName (car tail))
	 (when (not (member facetName legalSlotOptions))
	   (error "~S is not a valid facet for a KbClasses slot"
		  facetName))
	 (setq facetName
	       ;; note: ":inverse" and :accessor don't map
	       ;;    to a slot with the same name:
	       (case (car tail)
		 (:inverse 'inverse-slot)
		 (:accessor 'accessors)
		 (otherwise
		  (remove-keyword-colon (car tail) :package-name 'KBCLASSES))))
	 (setf (slot-value newSlot facetName) (cadr tail)))
    (initialize-slot newSlot)
    newSlot ))

(defun initialize-slot (slot)
  ;; Fill in initform facet values which can be computed only after
  ;;    "slot" has been initialized;
  
  ;; convert a symbol in the "range" facet into a class
  (setf (range slot)
	(satisfy-forward-class-ref (range slot) (domain slot)))

  ;; normalize values of a slot facets whose range is "3-VALUED-FLAG"
  ;; NOTE: only "invisible-p" is a 3-VALUED-FLAG, so thats all we handle
  ;;    right now:
  (setf (invisible-p slot)
	(normalized-3-valued-truth-value (invisible-p slot)))
  (when (allocation slot)
    (integrity-check (keywordp (allocation slot))))
  slot )

(defun satisfy-forward-class-ref (className referringClass)
  ;; "className" originates as a reference in the definition of "referringClass",
  ;;    and represents some type of class.
  ;; If a class matching "className" exists, return that object.  Otherwise
  ;;    create an instance of KB-CLASS, set its "name" slot to
  ;;    the value "className", and enter the mapping from "className" to
  ;;    the new class in the appropriate name space.
  ;; If "className" is not a symbol or a class, generate an error message.
  (when (null className) (return-from satisfy-forward-class-ref nil))
  (let ((class className))
    (cond ((symbolp className)		; if "className" is a symbol ...
	   (setq class (find-or-create-class className)))
	  ((typep className 'KB-CLASS) nil)	; if its a class, leave it alone
	  (t (error "The reference '~S' in the definition of~%the class ~S ~
                    is not a symbol.~%" className (name referringClass))))
    class ))

(defun reinitialize-class (class)
  ;; Clear all slots in "class" except for "name", "super-classes",
  ;;    and "sub-classes";
  ;; Remove sub-concept pointers from super classes that point at "class";
  (format *trace-output*		; Can't use INFORM in kbclasses code!
	  "~%Reinitializing the class ~S~%" (name class))
  (loop for super in (super-classes class)
       when (typep super 'KB-CLASS)	; protection from bad data
       do (delf (sub-classes super) class))
  (setf (precedence-list-cache class) nil)
  (setf (is-finalized-p class) nil)
  (setf (is-defined-p class) nil)
  (setf (local-slots class) nil)
  (setf (slots class) nil) )


  ;;
;;;;;; Class-completion and uncompletion
  ;;
  
;;;  Below we group together all of the methods used for completion of
;;;     classes.

(defun complete-class-slots (class)
  ;; Complete the facets of the local slots belonging to "class"
  ;; "completion" of a class takes place when all of the
  ;;    class's super-classes have been defined; at
  ;;    this point computations of the class's definition are 
  ;;    performed which were postponed until the super-classes
  ;;    were both created and completed;
  ;; Note: The order of operations is critical here
  ;; Perform slot inheritance -- complete local slots;
  ;; Fill in the value of "slots";
  ;; Define slot accessor methods;
  ;; Redefine instance storage -- extra logic is inserted to determine
  ;;    whether or not instance redefinition is necessary;
  
  ;; we defer completion of specializing slots until other local
  ;;    slots have been completed
  (loop for slot in (local-slots class)
       when (null (aliases slot))
       do (complete-slot slot))
  (loop for slot in (local-slots class)
       when (aliases slot)
       do (complete-slot slot))
  ;; computation of the slot "slots" must occur after slot-inheritance has occurred:
  (setf (slots class)
	(compute-list-of-slots class)) )

(defun complete-slot (slot) 
  ;; Inherit certain slot values; complete accessor
  ;;    definitions; realize slot specialization.
  ;; Note: Completion of inverse facets is deferred until all
  ;;    slots belonging to a particular class have been completed;
  (complete-slot-inheritance slot)
  
  (when (aliases slot)
    (complete-aliases-facet slot)) 
  
  ;; fill in initial and quasi-initial values for "allocation",
  ;;    and "initform" facets
  (when (null (allocation slot))
    (setf (allocation slot) :instance))
  
  ;; add slot-name to kernel name space
  (add-slot-to-index-if-topmost (name slot) slot) )

(defun complete-slot-inheritance (slot)
  ;; Inherit slot values from those slots not recogized by CLOS:
  ;;    Facets such as "range", "invisible-p", etc. are not
  ;;    propagated down by CLOS, so we must do it here;
  ;; We look for the first slot belonging to a super-class which has the same
  ;;    name and inherit its facets;
  ;; Note: The facets we DO NOT inherit here are:
  ;;    (name domain allocation initform aliases accessors)
  (let ((inheritingFacetNames
	  `( range collection-p inverse-slot one-way-inverse
	    aliasing-slots do-not-reinitialize invisible-p))
	superSlot)
    ;; find a super-slot without looking at any local slots:
    (loop for superClass in (cdr (precedence-list (domain slot)))
	 until (setq superSlot
		     (find (name slot) (local-slots superClass) :key #'name)))
    (when superSlot
      (loop for facetName in inheritingFacetNames
	   when (null (slot-value slot facetName))
	   do (setf (slot-value slot facetName)
		    (slot-value superSlot facetName)))) ))

(defun complete-aliases-facet (slot)
  ;; If "slot" aliases another (aliased) super-slot, see if the super-slot
  ;;    is local;  If not, duplicate it locally;
  ;; Add "slot" to the local aliased slot's list of aliasing slots;
  ;; Inherit facets from the super-slot into "slot";
  (let ((aliasedSlotName (aliases slot))
	superSlot aliasedSlot)
    (if (symbolp aliasedSlotName)
	;; find a slot with name "aliasedSlotName";
	(progn
	  (loop for superClass in (precedence-list (domain slot))
	       until (setq superSlot
			   (find aliasedSlotName (local-slots superClass) :key #'name))) 
	  (when (null superSlot)
	    (error "Cannot find a super-slot named ~S~%" (aliases slot)))
	  
	  (if (eq (domain superSlot) (domain slot))
	      ;; if "superSlot" is local, it becomes the aliased slot
	      (setq aliasedSlot superSlot)
	      ;; otherwise, make a local copy of "superSlot"
	      (progn
		(setq aliasedSlot (create-slot aliasedSlotName nil))	; fill in name
		(setf (domain aliasedSlot) (domain slot))	; fill in domain
		(setf (allocation aliasedSlot) (allocation superSlot))	; fill in allocation
		(setf (invisible-p aliasedSlot) (invisible-p superSlot))
		(push aliasedSlot (local-slots (domain slot)))))	; add new local slot
	  (setf (aliases slot) aliasedSlot))
	;; already pointing to the aliased slot:
	(setq  aliasedSlot aliasedSlotName))
    (when (eq (allocation aliasedSlot) :none)
	(error "Cannot alias slot ~S with allocation :none" (name aliasedSlot)))
    ;; add "slot" to list of aliasing slots
    (push slot (aliasing-slots aliasedSlot))
    ;; inherit range facet
    (when (null (range slot))
      (setf (range slot) (range aliasedSlot)))
    (setf (allocation slot) :none) ))

(defun compute-list-of-slots (class)
  ;; Return a list of all slots of "class", excepting those
  ;;    inherited slots redefined by a lower class
  (let (allSlots)
    (loop for class in (precedence-list class)
	 do
	 (loop for slot in (local-slots class)
	      do
	      (when (not (find (name slot) allSlots :key #'name))
		(push-last slot allSlots))))
    allSlots)
;    (loop for class in (precedence-list class)	; Substitute this? TAR 4/12/93
;	  nconc (loop for slot in (local-slots class)
;		      when (not (find (name slot) allSlots :key #'name))
;		      collect slot)
;	  into allSlots
;	  finally (return allSlots))
    )


(defun uncomplete-class-sublattice (class) 
  ;; Uncomplete sub-classes of "class" (recursively); then uncomplete
  ;;    "class";
  (loop for sub in (sub-classes class) do
       (uncomplete-class-sublattice sub))
  (uncomplete-class class) )

(defun uncomplete-class (class)
  ;; Undo (as much as possible) the effects of a "complete-class" applied to
  ;;    "class";
  ;; Nullify the "precedence-list" computation;
  ;; Undo slot completion;
  (setf (precedence-list class) nil)
  (setf (slots class) nil)
  (loop for slot in (local-slots class) do
       (uncomplete-slot slot))
  ;; mark "class" as unfinalized:
  (setf (is-finalized-p class) nil) )

(defun uncomplete-slot (slot)
  ;;  THIS IS NOT COMPLETE
  ;; Convert the value of the "aliases" facet back to a symbol
  (when (and (aliases slot) (not (symbolp (aliases slot))))
    (setf (aliases slot) (name (aliases slot))))
  (setf (aliasing-slots slot) nil)
  ;; Eliminate index to "(name slot)" if it points to "slot":
  (when (eq slot (get-slot (name slot)))
    (remove-kbclasses-slot-from-index slot)) )


  ;;
;;;;;; Slot-finalization methods and functions
  ;;

(defun maybe-finalize-class (class)
  ;; Finalize the class "class" if all of its super-classes have
  ;;    been completed, and all ranges of inverse slot references
  ;;    have been defined;
  ;; We also pass on supers if they correspond to already-defined CLOS classes;
  ;; Compute inverse slot information;
  ;; We defer finalization of inverse facets until after slot name
  ;;    are added to the knowledge base because inverses often reference
  ;;    other slots within the same class:
  (integrity-check (and (is-defined-p class) (not (is-finalized-p class))))
  (integrity-check (loop for super in (super-classes class)
			always 
                        (or (is-defined-p super)
                            (CLOS::find-class (name super)))))
  (when (and (loop for super in (super-classes class)
		  always (is-finalized-p super))
	     (loop for slot in (local-slots class)
		  always (or (null (range slot)) (is-defined-p (range slot)))))
    (finalize-slots class))
  ;; Try to finalize subclasses (recursively)
  (when (is-finalized-p class)
    (loop for sub in (sub-classes class)
	 do (maybe-finalize-class sub))) )

(defun finalize-slots (class &key force-p)
  ;; Compute inverse and one-way-inverse slot information;
  (loop for slot in (local-slots class) do 
       (cond
	 ((inverse-slot slot)
	  (finalize-inverse-facet
	    slot
	    :error-if-missing-inverse force-p))
	 ((one-way-inverse slot)
	  (finalize-inverse-facet slot :one-way-inverse t
				  :error-if-missing-inverse force-p))))
  ;; Mark "class" as finalized:
  (setf (is-finalized-p class) t) )

(defun finalize-inverse-facet (slot &key one-way-inverse error-if-missing-inverse)
  ;; Replace the symbol in the "one-way-inverse" facet of slot "slot"
  ;;    with a slot object; if not "one-way-inverse", do the same for
  ;;    the "inverse" facet, but use a different slot look-up algorithm;
  ;; If no slot exists matching "(inverse-slot slot)", and
  ;;    if "error-if-missing-inverse", then signal an error;
  ;; Note: "finalize-inverse" is called by "finalize-slot",
  ;;    where failure is permitted, since not all classes have been
  ;;    finalized, and by ???
  (let (inverseSlotName inverseSlot)
    (setq inverseSlotName
	  (if one-way-inverse (one-way-inverse slot) (inverse-slot slot)))
    ;; return if there is no inverse
    (when (null inverseSlotName)
      (return-from finalize-inverse-facet nil))
    (when (not (eq (get-slot (name slot)) slot))
      (error "Can't finalize the inverse facet of slot ~S because another ~
              slot with the same name already exists." slot))
    ;; we deliberately fail to use an already existing slot-object,
    ;;    because it may not belong to a class (when its owner was redefined):
    (when (typep inverseSlotName 'KB-SLOT)
      (setq inverseSlotName (name inverseSlotName)))
    (setq inverseSlot (get-slot inverseSlotName))
    (when (null inverseSlot)
      (if error-if-missing-inverse
	  (error "Completing slot `~S`:  Can't find an inverse slot~%   ~
               with name '~S'" slot inverseSlotName)
	  (return-from finalize-inverse-facet nil)))
    (setf (one-way-inverse slot) inverseSlot)
    (when (inverse-slot slot)
      (setf (one-way-inverse inverseSlot) slot))
    (when one-way-inverse
      (return-from finalize-inverse-facet slot))
    
    (when (and (range slot)
	       (is-finalized-p (range slot))
	       (is-finalized-p (domain inverseSlot))
	       (not (subclass-p (range slot) (domain inverseSlot))))
      (kbclasses-warning "The range '~S' of slot '~S'~%   ~
              is not a subclass of the domain `~S` of its inverse `~S'~%"
			 (name (range slot)) slot
			 (name (domain inverseSlot)) inverseSlot))
    ;; two-way inverse slots point to the slot residing locally at
    ;;    the class (range slot)
    (when (inverse-slot slot)
      (when (null (range slot))
	(error "Can't define an inverse on slot ~S because its range is NIL"
	       slot))
      (setq inverseSlot
	    (find inverseSlotName (local-slots (range slot)) :key #'name))
      (when (null inverseSlot)
	(kbclasses-warning "Inverse slot-name '~S' of slot '~S'~%   ~
                 does not match the name of any local slot of '~S'~%"
			   inverseSlotName slot (name (range slot)))
	
	(return-from finalize-inverse-facet nil))
      (setf (inverse-slot slot) inverseSlot) 
      (setf (inverse-slot inverseSlot) slot)) ))

;;; The necessity for "finalize-class-sublattice" is very unfortunate;
;;;    its called to complete inverse slots which couldn't get completed
;;;    earlier, because we haven't yet devised a scheme for doing this
;;;    incrementally, without generating spurious error messages.

(defun finalize-class-sublattice (class)
  ;; Perform operations on the classes in the sublattice rooted at "class"
  ;;    which can only be done after all of them have been defined
  ;;    (and finalized).
  ;; Currently, the only such operation is the completion of inverse
  ;;    (and one-way-inverse) slot facets;
  (let (alreadyVisitedClasses)
    (labels
      ((finalize-subgraph
	 (self)
	 (finalize-slots self :force-p t)
	 (push self alreadyVisitedClasses)
	 (loop for sub in (sub-classes self)
	      unless (member sub alreadyVisitedClasses)
	      do (finalize-subgraph sub))))
      (finalize-subgraph class))) )


  ;;
;;;;;;  Utility functions for Classes and Slots
  ;; 

(defun find-slot (class name)
  ;; Return a slot of "class" whose name matches "name";
  (loop for slot in (slots class)
       when (eq (name slot) name)
       return slot) )

(defun subclass-p (subC superC)
  ;; Return T iff "subC" is a subConcept of "superC";
  (cond 
    ((eq subC superC) t)
    ((null subC) nil)
    (t (loop for superConcept in (super-classes subC)
	    thereis (subclass-p superConcept superC)))) )

(defun add-slot-to-index-if-topmost (name uninternedSlot)
  ;; Add "name" to the slot-partition of the corresponding knowledge base;
  ;; If "name" already exists in the name-space, a test is made to
  ;;    see if the colliding slot is a super-slot (it can't be below
  ;;    "uninternedSlot", since completion of classes happens top-down)
  ;; This function is called during slot completion;
  (let (collidingSlot)
    (when (neq name (name uninternedSlot))
      (remove-kbclasses-slot-from-index (name uninternedSlot)))
    (when (null name)
      (return-from add-slot-to-index-if-topmost nil))
    (setq collidingSlot (get-slot name))
    (if collidingSlot
	(when (and (not (subclass-p (domain uninternedSlot)
				    (domain collidingSlot)))
		   (neq (allocation collidingSlot) 'class))
;; DISABLED FOR THE TIME BEING:    RMM 12/9/91	  
;	  (kbclasses-warning "Slots ~S and ~S don't share a common ancestor.~%"
;			     uninternedSlot collidingSlot)
	  )
	(add-kbclasses-slot-to-index uninternedSlot)) ))


;;; "show" methods

(defmethod show ((self t) &key (stream t))
  (format stream "~%~S" self) )

(defmethod show-all ((self t) &key (stream t))
  (format stream "~%~S" self) )

(defun show-visible-slots (self &key (stream t))
  ;; Print the visible slots of "self";
  (flet ((visible-slots 
	   (self)
	   ;; Determines which slots get displayed by "show";
	   ;; We display instance slots (when not marked "invisible"),
	   ;;    and other slots marked "not invisible"
	   (loop for slot in (slots (class-of self))
		when (or (eq (invisible-p slot) 'FALSE)
			 (and (neq (invisible-p slot) 'TRUE)
			      (or (eq (allocation slot) :instance)
				  (and (eq (allocation slot) :dynamic)
				       (get-dynamic-clos-slot self (name slot))))))
		collect (name slot)) ))
    (show-designated-slots self (visible-slots self) stream) ))

(defun show-all-slots (self &key (stream t))
  ;; Print all slots of "self";
  (show-designated-slots self
	      (loop for slot in (slots (class-of self)) collect (name slot))
	      stream) )

(defun show-designated-slots (self slotNames stream)
  ;; Print slot-values of "self" indicated by "slotNames"
  (format stream "~%")
  (loop for name in slotNames
       do (format stream ":~S~20,5T~S~%" name
		  (funcall name self))) )

(defun set-slot-visibility (slotName setting)
  ;; Make a slot visible or invisible with the "show" method;
  ;; Possible values for "setting" are TRUE, YES, FALSE, NO, UNKNOWN;
  (let ((slot (get-slot slotName)))
    (when (null slot)
      (warn "Slot named '~S' does not exist~%" slotName) ; Can't use complain in KBCLASSES.
      (return-from set-slot-visibility nil))
    (setf (slot-value slot 'invisible-p)
	  (3-valued-not (normalized-3-valued-truth-value setting)))
    (normalized-3-valued-truth-value setting) ))



;;BUGS:
#|
ALIASING BUG: THE "aliasing-slots" SLOT OF "name" HAS NON-OBJECTS
   IN IT;
|#

;; To Do:
#|
Make calls to "make-specializable" semi-automatic
  when slots are created; include a warning

KB-CLASS.reinitialize-class: nullify inverse links before slots
   are deleted

Fill-out "KB-CLASS.uncomplete-class" (this MAY be unimportant)
|#


;; DEBUGGING CODE FOR DYNAMIC SLOTS:
#|
(defclass foo ()
   (LOOM::dynamic-variables
    s1
    (s2 :allocation :dynamic)))

(complete-class (get-class 'LOOM::loom-object))
(complete-class (get-class 'foo))

(setq i (make-instance 'foo))

(LOOM::dynamic-variables j)
(setf (s1 i) 3)
(setf (s2 i) 5)
(s1 i)
(s2 i)
|#
