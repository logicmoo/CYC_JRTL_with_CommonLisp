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
;;; SLOTS.LISP (ABOX)

;;; Defines low-level slot access macros and functions
;;; Provides functions for copying instances

(in-package "LOOM")

(export '(copy-instance))

  ;;
;;;;;;  Dynamic slot macros and slot conversion macros
  ;;

(defmacro dynamic-slot-value (instance slotName)
  ;; Expands to a form which reads the value of a dynamic slot;
  `(cdr (assoc ,slotName (dynamic-variables ,instance))) )

(defmacro set-dynamic-slot-value (instance slotName newValue)
  ;; Expands to a form which writes into a dynamic variable;
  ;; If "newValue" is NIL, then remove an existing slot --NOT!;
  (once-only (instance slotName newValue)
    `(let ((oldEntry (assoc ,slotName (dynamic-variables ,instance))))  
       (if oldEntry
	 (setf (cdr oldEntry) ,newValue)
         (push (cons ,slotName ,newValue)
               (dynamic-variables ,instance))) )))

;; Proposed, new, improved version (w/key variable!)  ; TAR 1/13/94
;(defmacro set-dynamic-slot-value (instance slotName newValue &key storeNilP)
;  ;; Expands to a form which writes into a dynamic variable;
;  ;; If "newValue" is NIL, then remove an existing slot --NOT!;
;  (once-only (instance slotName newValue)
;    `(let ((oldEntry (assoc ,slotName (dynamic-variables ,instance))))  
;       (if oldEntry
;         ,(if storeNilP
;	    `(setf (cdr oldEntry) ,newValue)
;            `(if ,newValue
;	       (setf (cdr oldEntry) ,newValue)
;	       (setf (dynamic-variables ,instance)
;		     (delete oldEntry (dynamic-variables ,instance))))); TAR 11/3/93
;         ,(if storeNilP
;            `(push (cons ,slotName ,newValue)
;                   (dynamic-variables ,instance))
;            `(when ,newValue
;               (push (cons ,slotName ,newValue)
;                   (dynamic-variables ,instance))))) )))

(defmacro slot-value-to-values (slotValue role)
  ;; Helping macro for converting the value "slotValue" into a list of slot fillers,
  ;;    based on whether or not "slotName" refers to a single-valued role;
  (let ((value (gensym "VAL")))
    `(let ((,value ,slotValue))
       (cond
        ((null ,value) nil)
        ((or (atom ,value)
             (role-is-single-valued-p ,role))
         (list ,value))
        (t ,value))) ))

(defmacro slot-values-to-value (slotValues role)
  ;; Helping macro for converting the value "slotValues" into an atomic filler
  ;;    or a list of of slot fillers, based on whether or not "slotName" refers
  ;;    to a single-valued role;
  (let ((values (gensym "VAL")))
    `(let ((,values ,slotValues))
       (cond
        ((null ,values) nil)
        ((role-is-single-valued-p ,role)
         (first ,values))
        (t ,values))) ))

;;; Lowest level slot accessor methods for classified instances

;;; Slot read accessor default methods:
(defmethod get-slot-value (self role)
  ;; Read slot accessor function for non-Loom objects;
  (declare (ignore self role))
  nil )
(defmethod get-slot-values (self role)
  ;; Read slot accessor function for non-Loom objects;
  (declare (ignore self role))
  nil )

;;; The slot accessor methods are currently configured to store values
;;;    for single-valued slots as singleton lists.  This is easy to reverse
;;;    by redefining the following four methods.


(defun get-strict-and-asserted-slot-values (instance role)
  ;; Helping function for BASIC-INSTANCE.get-slot-value[s].
  ;; Uses the role fillers table to retrieve just the non-default slot values;
  (let ((roleFillersRecord (cdr (assoc role (role-fillers-table instance)))))
    (if roleFillersRecord
	(union (asserted-fillers roleFillersRecord)
	       (strict-fillers roleFillersRecord))
      (access-in-ctxt (dynamic-slot-value instance (name role))
		      nil (home-ctxt instance))) ))

(defmethod get-slot-value ((self BASIC-INSTANCE) role)
  ;; Standard read slot accessor function;
  (if (default-mode-p)
      (slot-values-to-value 
       (access-in-ctxt (dynamic-slot-value self (name role)) nil (home-ctxt self))
       role)
    (slot-values-to-value
     (get-strict-and-asserted-slot-values self role)
     role)))

(defmethod set-slot-value ((self BASIC-INSTANCE) role newValue)
  ;; Standard write slot accessor function;
  (let ((roleName (name role)))
    (update-in-ctxt #'(lambda (x y) (set-dynamic-slot-value x roleName y))
                    self
                    (dynamic-slot-value self roleName)
                    (slot-value-to-values newValue role)
                    t) ))

(defmethod get-slot-values ((self BASIC-INSTANCE) role)
  ;; Standard read slot accessor function;
  (if (default-mode-p)
      (access-in-ctxt (dynamic-slot-value self (name role)) nil (home-ctxt self))
    (get-strict-and-asserted-slot-values self role)
    ))

(defmethod set-slot-values ((self BASIC-INSTANCE) role newValue)
  ;; Standard write slot accessor function;
  (let ((roleName (name role)))
    (update-in-ctxt #'(lambda (x y) (set-dynamic-slot-value x roleName y))
                    self
                    (dynamic-slot-value self roleName)
                    newValue
                    t) ))


;;; Slot accessor method for previous instances:

;;; Note: Timings on TICLOS indicated that adding an optional or
;;;    keyword argument to a method can double the method access
;;;    time.  Hence, we use a special variable below to effect a
;;;    parameter pass that would have been much cleaner using a
;;;    keyword or optional variable.

;(defun get-history-instance-slot-values (self role)
;  ;; Helping function for "HISTORY-INSTANCE.get-slot-valuex";
;  ;; IF table entry for slot exists
;  ;;    THEN return its value
;  ;;    ELSE scan forward for non-null slot entry, and return the
;  ;;         value of the first entry found, caching that entry
;  ;;         in "self" at the same time;
;  ;; This helping function stores singleton fillers as a singleton list;
;  (let* ((slotName (name role))
;         (entry (assoc slotName (dynamic-variables self))))
;    (if entry
;	(cdr entry)
;	(let ((fillers 
;		(let ((*dontCacheSlotValueP* t))
;		  (declare (special *dontCacheSlotValueP*))
;		  (get-slot-values (next-instance self) role))))
;	  (unless (boundp '*dontCacheSlotValueP*)
;	    ;; code borrowed from "set-dynamic-slot-value":
;	    (push (cons slotName fillers) (dynamic-variables self)))
;	  fillers)) ))

(defun get-history-instance-slot-values (self role)
  ;; Helping function for "HISTORY-INSTANCE.get-slot-valuex";
  ;; IF table entry for slot exists
  ;;    THEN return its value
  ;;    ELSE scan forward for non-null slot entry, and return the
  ;;         value of the first entry found, caching that entry
  ;;         in "self" at the same time;
  ;; This helping function stores singleton fillers as a singleton list;
  (let* ((slotName (name role))
         (entry (assoc slotName (dynamic-variables self))))
    (if entry
	(access-in-ctxt (cdr entry) nil nil)   ; Histories don't have home-ctxt
	(let ((fillers 
		(let ((*dontCacheSlotValueP* t))
		  (declare (special *dontCacheSlotValueP*))
		  (get-slot-values (next-instance self) role))))
          ;; IS THIS CACHEING SAFE WITH CONTEXTS??  SINCE WE CHECK TO
          ;;   SEE IF THERE IS A RECORD AT ALL, THIS MAY NOT BE SAFE
          ;;   ANYMORE:
	  (unless t ; (boundp '*dontCacheSlotValueP*)  ;; TAR 6/21/94
	    ;; code borrowed from "set-slot-value":
            (update-in-ctxt #'(lambda (x y)
                                (push (cons slotName y) (dynamic-variables x)))
                    self
                    nil
                    fillers
                    t))
	  fillers)) ))

(defmethod get-slot-value ((self HISTORY-INSTANCE) role)
  ;; Read slot accessor for history instance;
  (slot-values-to-value (get-history-instance-slot-values self role) role) )

(defmethod get-slot-values ((self HISTORY-INSTANCE) role)
  ;; Read slot accessor for history instance;
  (get-history-instance-slot-values self role) )


  ;;
;;;;;; Specialized slot-copying and slot-clearing functions
  ;;

(eval-when (compile load eval)
  (defmacro copy-eq-slots (fromInstance toInstance listOfSlots)
    ;; Expand into code that copies the contents of slots listed
    ;;    in "listOfSlots" from "fromInstance" into "toInstance";
    `(progn
       ,@(loop for slot in listOfSlots
	      collect
	      `(setf (,slot ,toInstance) 
		     (,slot ,fromInstance)))) )
  
  (defmacro clear-slots (instance listOfSlots)
    ;; Expand into code that clears the contents of slots listed
    ;;    in "listOfSlots" for "instance";
    `(progn
       ,@(loop for slot in listOfSlots
	      collect `(setf (,slot ,instance) nil))) )
  
  ) ;; end eval-when


(defun copy-db-instance-slots (fromInstance toInstance)
  ;; Copy the slot values defined in the class DB-INSTANCE from 
  ;;    "fromInstance" into "toInstance";
  ;; Called by "compute-more-specific-type" and "has-instance-p";
  ;; Note: We can't use "copy-instance" because if "fromInstance" 
  ;;    was defined by a subclass of DB-INSTANCE (e.g., an instance of
  ;;    TBOX-CONCEPT), it might have slots that should not be copied;
  (copy-eq-slots fromInstance toInstance
		 ( identifier			; TO HELP DEBUGGING??
		  db-type
		  dynamic-variables ; phantom-inverse-slot-values
		  residue-features
		  previous-instance
		  ))
  (copy-eq-slots fromInstance toInstance
		 (db-attributes conjuncts-table role-fillers-table
		  modification-summary if-added-bombs if-removed-bombs
		  home-ctxt
		  strict-db-type asserted-features
		  cumulative-value-restrictions strict-cumulative-value-restrictions
		  ;; DONT'T COPY: remote-type-bombs bomb-removal-index
		  strict-max-restrictions
		  multiple-definitions merged-into-instance
		  )) )

(defmethod clear-instance-slots ((instance BASIC-INSTANCE))
  ;; Clear the slot values defined for the class BASIC-INSTANCE attached
  ;;    to "instance";
  (clear-slots instance
	       ( identifier db-type
		dynamic-variables previous-instance)) )

(defmethod clear-instance-slots ((instance DB-INSTANCE))
  ;; Clear the slot values defined for the class DB-INSTANCE attached
  ;;    to "instance";

  ;; inherited slots:
  (clear-slots instance
	       ( identifier db-type
		dynamic-variables previous-instance))
  ;; local slots:
  (clear-slots instance
	       (conjuncts-table role-fillers-table
		modification-summary if-added-bombs if-removed-bombs
		home-ctxt
		strict-db-type asserted-features
		cumulative-value-restrictions strict-cumulative-value-restrictions
		remote-type-bombs bomb-removal-index strict-max-restrictions
		multiple-definitions merged-into-instance
		))
  (setf (db-attributes instance) 0)
  )

(defmethod clear-instance-slots ((instance HISTORY-INSTANCE))
  ;; Clear the slot values defined for the class HISTORY-INSTANCE attached
  ;;    to "instance";

  ;; inherited slots:
  (clear-slots instance
	       ( db-type ; identifier 
		dynamic-variables previous-instance))
  ;; local slots:
  (clear-slots instance
	       ( time-point next-instance)) )

;; IF AND WHEN THE CLOS IMPLEMENTATION OF "slot-value" GETS OPTIMIZED,
;;    REPLACE THE ABOVE DEFINITION OF "clear-instance-slots" BY THIS ONE:
;;    AT PRESENT, THIS ONE IS MORE THAN TWICE AS SLOW ON A TI:
;(defun clear-instance-slots (instance)
;  ;; Clear the slot values defined for the class DB-INSTANCE attached
;  ;;    to "instance";
;  (loop for slot in (CLOS::class-slots (CLOS::find-class 'DB-INSTANCE))
;       do (setf (CLOS::slot-value instance (TICLOS::slot-name slot)) nil)) )


  ;;
;;;;;; "copy-role-fillers"
  ;;

;;; We handle four different cases of instance copying:
;;;   (1) lifting an instance;
;;;   (2) merging two instances;
;;;   (3) lifting an instance from two different worlds;
;;;   (4) merging a skolem into a constant.

;;;   For case (1), we copy all non-inverse roles (asserted, strict, and
;;;   default) and we copy phantom fillers, but we do not assert inverse 
;;;   roles or inverses of phantom roles (to avoid lifting adjacent instances).
;;; 
;;;   For case (2), we copy all asserted and strict non-inverse roles, but
;;;   don't copy default non-inverse roles.  We also assert all
;;;   inverse and inverse-of-phantom roles (asserted, strict, and default)
;;;   because all pointers to the discarded instance must be redirected.
;;;   Because we assert the inverses of phantom roles, we don't bother to copy
;;;   phantom fillers.

;;;   For case (3), we emulate case (1), except that we do not copy default
;;;   fillers.  This is because the new instance is merging information,
;;;   and hence needs to be rematched (causing any copied defaults to be
;;;   discarded).

;;;   For case (4), we copy all inverses of phantom roles, but nothing else.

;;; Reality check: Case (3) is implemented by performing a lift of an
;;;    instance followed by a merge.  Therefore, what actually happens
;;;    resembles a mix of cases (1) and (2) -- ALL role fillers (including
;;;    defaults) are copied/lifted from the "first" instance, while only
;;;    asserted and strict fillers are copied/lifted for the second instance,
;;;    BUT because it invokes "assert-role-filler", inverse roles DO get copied.

;;; Kasper on copying instances:

;;;    When lifting an instance into a world, I copy all role fillers, because
;;;    we don't know in general what other instances might support the strict
;;;    or default roles.  We can't assume that the supporting instances also
;;;    get lifted, but we can assume that all inferences (including defaults)
;;;    that held in the parent world will initially hold in the child world.

;;;    It is in merge-instances that things get more subtle.  When X is merged
;;;    into Y, I found that it is necessary to copy all strict role-fillers of
;;;    X, because they might have been inferred from a composition, and then
;;;    wouldn't be derived when Y is matched (unlike other strict
;;;    role-fillers).  It still seems that defaults need to be recomputed after
;;;    a merge (and therefore defaults are not copied when merging), because we
;;;    don't know whether the merged knowledge will override any of them.

;;;    In merging it is clear that we should re-assert ALL fillers (including
;;;    defaults) of phantom-inverse-roles, because we don't know when (if ever)
;;;    the instance having the real default role will get rematched, and we want
;;;    to make sure that all pointers to the instance being discarded by merge
;;;    are redirected.  But no such complications exist when lifting instances
;;;    to a world.

(defun copy-role-fillers (fromInstance intoInstance asserted&strictP phantomsOption)
  ;; Copy all role fillers for "fromInstance" into "intoInstance";
  ;; "asserted&strictP" determines whether both asserted and strict fillers
  ;;    are copied, or only asserted fillers;
  ;; "phantomsOption" determines whether inverses of phantom roles are
  ;;    asserted, or phantom fillers only are copied, or phantoms are just ignored;
  ;; Note: Default role fillers don't get copied;
  ;; Note: User invocation of "copy-instance" causes only asserted role fillers
  ;;    to be copied, and phantoms are ignored;
  (multiple-value-bind (realFillerPairs phantomFillerPairs)
      (collect-roles&fillers fromInstance :asserted-only-p (not asserted&strictP))
    (if asserted&strictP 
	(loop for pair in realFillerPairs do ; copy both strict and asserted roles
	      (let* ((role (car pair))
		     (support (cdr (assoc role (role-fillers-table fromInstance)))))
		(loop for filler in (if support
					(asserted-fillers support)
				      (cdr pair))
		    do (assert-role-filler IntoInstance role filler :assertion))
		(when support
		  (loop for filler in (strict-fillers support)
		      do (assert-role-filler IntoInstance role filler :strict)))))
      (loop for pair in realFillerPairs	; copy only asserted roles 
	  do
	    (loop for filler in (cdr pair)
		do (assert-role-filler intoInstance (car pair) filler :assertion))))
    (case phantomsOption
      (:phantoms
       (copy-phantom-fillers phantomFillerPairs intoInstance))
      (:inverses-of-phantoms
       (copy-inverses-of-phantom-fillers 
	phantomFillerPairs fromInstance intoInstance))) ))

(defun copy-phantom-fillers (phantomFillerPairs intoInstance)
  ;; Helping function for "copy-role-fillers";
  ;; Situation: phantom fillers for "fromInstance" must be copied to "intoInstance"
  ;;    BUT we don't want cause the phantom fillers to be lifted into the current
  ;;    world;
  ;; Copy phantom filler entries for "fromInstance" into "intoInstance";
  ;; Note: "copy-inverses-of-phantom-fillers" has a similar function, except that
  ;;    it DOES cause the phantom fillers to be lifted into the current world;
  (let ((intoRoles&Fillers (dynamic-variables intoInstance)))
    (loop for pair in phantomFillerPairs 
	 do
	 (if (assoc (car pair) intoRoles&Fillers)
	     (loop for filler in (cdr pair)
		  do
		  (assert-phantom-inverse-role-filler
		    (inverse-of-phantom (car pair)) filler intoInstance))
	     (push (cons (car pair) (cdr pair))
		   (dynamic-variables intoInstance)))) ))

(defun copy-inverses-of-phantom-fillers (phantomFillerPairs fromInstance intoInstance)
  ;; Helping function for "copy-role-fillers";
  ;; For each entry in "phantomFillerPairs", when a corresponding filler
  ;;    points to "fromInstance" (in the current world), assert that
  ;;    "intoInstance" is a filler of the inverse role;
  ;; Called by "replace-skolem-by-constant" and "copy-role-fillers";
  (let ((*do-in-subcontexts-p* nil))	; TAR 7/9/99
    (loop for (phantomInverse . fillers) in phantomFillerPairs
	as mainRole = (inverse-of-phantom phantomInverse)
	do (loop for filler in fillers
	       as supportRec = (when (classified-instance-p filler)
				 (cdr (assoc mainRole (role-fillers-table filler))))
	       when supportRec
	       do (when (member fromInstance (asserted-fillers supportRec))
		    (assert-role-filler filler mainRole intoInstance :assertion))
		  (when (member fromInstance (strict-fillers supportRec))
		    (assert-role-filler filler mainRole intoInstance :strict))
		  (when (member fromInstance (default-fillers supportRec))
		    (assert-role-filler filler mainRole intoInstance :default))
	       else
	       do (assert-role-filler filler mainRole intoInstance :assertion))) ))



  ;;
;;;;;; Role filler collecting 
  ;;

(defun collect-roles&fillers (instance &key asserted-only-p)
  ;; Return two values:
  ;;    (1) an assoc list of roles and fillers of "instance";
  ;;    (2) an assoc list of phantom inverse roles and fillers of "instance";
  ;; Possibly too tricky: "boundp" test determines whether or not a
  ;;    relation is bound to alist key, or it if names a dynamic CLOS slot;
  ;; TO DO: CONSIDER IMPLEMENTING MARK AND SWEEP ALGORITHM FOR COMPUTING
  ;;    WHEN "asserted-only-p" IS SET;
  (let ((homeCtxt (home-ctxt instance))
        rolePairs phantomRolePairs role roleFillersRecord)
    (loop for (roleName . fillerCtxtRecord) in (dynamic-variables instance)
          as fillers = (access-in-ctxt fillerCtxtRecord nil homeCtxt)
	  do
	  (if (symbolp roleName)
            ;; "real" role fillers:
            (when (and (setq role (get-relation roleName :no-error-p t))
                       fillers)
              (when (and asserted-only-p
                         (setq roleFillersRecord 
                               (cdr (assoc role (role-fillers-table instance)))))
                (setq fillers (asserted-fillers roleFillersRecord)))
              (push (cons role fillers) rolePairs))
            ;; phantom role fillers:
            (push (cons roleName fillers) phantomRolePairs)))
    (values rolePairs phantomRolePairs) ))

(defun collect-phantom-roles&fillers (instance)
  ;; Return an assoc list of phantom inverse roles and fillers of "instance";
  (let ((homeCtxt (home-ctxt instance)))
    (loop for (roleName . fillerCtxtRecord) in (dynamic-variables instance)
          when (not (symbolp roleName))
          collect (cons roleName (access-in-ctxt fillerCtxtRecord nil homeCtxt))) ))



