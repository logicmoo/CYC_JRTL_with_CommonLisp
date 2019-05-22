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

;;; INSTANCES.LISP (ABOX)

;;; Provides functions for creating, destroying, and finding instances

(in-package "LOOM")

(export '(create createm find-or-create-instance 
          create-skolem-instance))


(CLOS::defgeneric incoherent-instance-p (self))

(defun generate-unique-instance-identifier (prefix)
  ;; Return a symbol prefixed by "prefix" and suffixed by an integer
  ;;    which is unique within the ABox;
  ;; Note: Assumes that we are interning into the current knowledge
  ;;    base;  If this should be changed, see "generate-unique-concept-name"
  ;;    for code that permits a different context to be specified;
  (let (uniqueName)
    (loop
      do (setq uniqueName 
	       (symbol-append 
		 (prefix "-" (format nil "~v,'0D"
                                     *minimum-digits-for-instance-suffix*
                                     (incf *instance-identifier-counter*)))
		 *package*))
      until (null (eval-instance-id uniqueName)))
    uniqueName ))


  ;;
;;;;;; Mutable Heap macros
  ;;

;;; A mutable heap starts out as a list, and is converted to a hash table
;;;    if its size exceeds the value of *mutable-heap-cross-over*.
;;; These macros expand to forms that add and remove items from a heap,
;;;    test for heap membership, iterate across a heap, and copy a heap
;;;    into a list.

(defmacro add-to-mutable-heap-index (item heapPlace)
  ;; Expand to a form that pushes "item" onto the heap index
  ;;    stored at "heapPlace";
  ;; Caution: We omitted wrapping a "once-only" around "item";
  (integrity-check (symbolp item))
  `(let ((heap ,heapPlace)
         (theItem ,item)
         oldHeap useEqualTestP)
     (if (listp heap)
       (if (> (length heap) *mutable-heap-cross-over*)
         (progn
           (setq oldHeap heap)
           (setq useEqualTestP
                 (loop for i in oldHeap
                       thereis (or (stringp i) (listp i))))
           (setq heap (make-hash-table 
                       :size (* 2 *mutable-heap-cross-over*)
                       :test (if useEqualTestP #'FILLER-EQUAL #'EQL)))
           (setf ,heapPlace heap)
           (loop for i in oldHeap
                 do (setf (gethash i heap) i))
           (setf (gethash theItem heap) theItem))
         (pushnew theItem ,heapPlace))
       (setf (gethash theItem heap) theItem)) ))

(defmacro remove-from-mutable-heap-index (item heapPlace)
  ;; Expand to a form that removes "item" from the heap index
  ;;    stored at "heapPlace";
  ;; Caution: We omitted wrapping a "once-only" around "item";
  `(let ((heap ,heapPlace))
     (if (listp heap)
       (delf ,heapPlace ,item :test #'FILLER-EQUAL)
       (remhash ,item heap)) ))

(defmacro in-mutable-heap-index-p (item heapPlace)
  ;; Expand to a form that returns t if "item" is in the heap index
  ;;    stored at "heapPlace";
  `(let ((heap ,heapPlace))
     (if (listp heap)
       (member ,item heap :test #'FILLER-EQUAL)
       (gethash ,item heap)) ))

(defmacro list-contents-of-mutable-heap-index (heapPlace)
  ;; Expand to a form that returns a list of instance in the heap
  ;;    at "heapPlace";
  `(list-of ,heapPlace :also-coerce-hash-table t) )

(defmacro do-mutable-heap-index (iterationVar heapPlace &body body)
  ;; Expand to a form that iterates over items in the heap at
  ;;    "heapPlace" and evaluates "body" for each item;
  `(let ((heap ,heapPlace))
     (if (listp heap)
	 (loop for ,iterationVar in heap
	      do ,@body)
	 (maphash
	   (function (lambda (dummyKey ,iterationVar)
		       (declare (ignore dummyKey))
		       ,@body))
	   heap)) ))


  ;;
;;;;;; Doubly-linked Heap macros
  ;;

;;; A doubly-linked heap is a list of items such that each item points
;;;    to the cons of the item preceding it in the list.  This kind of
;;;    heap has the very nice property that insertion and removal take
;;;    constant time.  A doubly-linked heap requires that each item
;;;    contains a slot (we use the slot "identifier") that is dedicated
;;;    to the heap that the item resides in.  We assume that each item
;;;    belongs to at most one doubly-linked heap.  The first member of
;;;    the list representing the heap is an empty cons.  The second cons
;;;    points at the first item, which itself points back at the empty
;;;    cons.

(defmacro add-to-doubly-linked-heap-index (item heapPlace)
  ;; Expand to a form that pushes "item" onto the heap index
  ;;    stored at "heapPlace";
  ;; Caution: We omitted wrapping a "once-only" around "item";
  `(let ((heap (or ,heapPlace (cons nil nil)))	; initial heap contains empty cons
	       newCons)
     (setf (car heap) ,item)
     (setq newCons (cons nil heap))
     (setf ,heapPlace newCons)
     (integrity-check (null (identifier ,item)))	; "item" is not interned elsewhere
     (setf (identifier ,item) newCons) ))

(defmacro remove-from-doubly-linked-heap-index (item)
  ;; Expand to a form that removes "item" from whatever heap it happens
  ;;    to be in;
  ;; Caution: We omitted wrapping a "once-only" around "item";
  `(let* ((beforeCons (identifier ,item))
	  (afterCons (cddr beforeCons)))
     ;; clip out the cons between "beforeCons" and "afterCons";
     (setf (cdr beforeCons) afterCons)
     (when afterCons
       (setf (identifier (car afterCons)) beforeCons))
     ;; indicate that "item" is no longer interned into the heap:
     (setf (identifier ,item) nil) ))

(defmacro in-doubly-linked-heap-index-p (item heapPlace)
  ;; Expand to a form that returns t if "item" is in the heap index
  ;;    stored at "heapPlace";
  ;; Note, because items in doubly-linked heaps must have slots,
  ;;    there won't be any constants in the heap, so an eq test suffices;
  `(member ,item ,heapPlace) )

(defmacro list-contents-of-doubly-linked-heap-index (heapPlace)
  ;; Expand to a form that returns a list of instance in the heap
  ;;    at "heapPlace";
  `(cdr ,heapPlace) )

(defmacro do-doubly-linked-heap-index (iterationVar heapPlace &body body)
  ;; Expand to a form that iterates over items in the heap at
  ;;    "heapPlace" and evaluates "body" for each item;
  `(loop for ,iterationVar in (cdr ,heapPlace)
	do ,@body) )


  ;;
;;;;;; Concept/Instance Indexing
  ;;

(defmethod current-local-instance-of-p ((instance T) concept)
  ;; Helping function for "do-time-sensitive-local-instances" tests
  ;;    *agent-time* membership of "instance" in "concept";
  ;; Optimization note:  This test is expected to succeed most of the 
  ;;    time, so we can afford to "or" in an extra test for literal instances;
  (setq instance (get-agent-time-offset-instance instance))
  (if (constant-p instance)
      (in-local-instances-p instance concept)
      (and (or (null (home-ctxt instance))
	       (subctxt-p (ctxt *context*) (home-ctxt instance)))
	   (not (discarded-p instance))
	   (loop for c in (get-cached-types instance)
		 thereis (subconcept-p c concept)))) )

(defmethod current-local-instance-of-p
           ((instance CONTEXT-SENSITIVE-MIXIN) concept)
  ;; Helping function for "do-time-sensitive-local-instances" tests
  ;;    *agent-time* membership of "instance" in "concept";
   ;; TO DO: IF WE DECIDE TO KEEP THIS LOGIC, DEFINE "in-current-context-p"
  ;;    REPLACE THE CODE BELOW WITH A CALL TO THAT TEST FUNCTION:
  (when (subctxt-p (ctxt *context*) (home-ctxt instance))
    (setq instance (get-agent-time-offset-instance instance))
    (and (not (discarded-p instance))
         (loop for c in (get-cached-types instance)
               thereis (subconcept-p c concept)))) )

(defun add-to-local-instances (concept instance)
  ;; Add "instance" to the local instances index for "self";
  (unless (property-p concept)
    (add-to-mutable-heap-index instance (local-instances concept)) ))

(defun remove-from-local-instances (concept instance)
  ;; Remove "instance" from the local instances index for "concept";
  ;; Presently, this is ONLY called by "clear-deleted-instances";
  (unless (property-p concept)
    (remove-from-mutable-heap-index instance (local-instances concept)) ))

(defun list-current-local-instances (concept)
  ;; Return a list of instances found in the local instances index for
  ;;   "concept" that are still current;
  (remove-if-not #'(lambda (i) (current-local-instance-of-p i concept))
                 (list-contents-of-mutable-heap-index
                  (local-instances concept))) )

(defun list-all-local-instances (concept)
  ;; Return a list of instances found in the local instances index for
  ;;   "concept";
  (list-contents-of-mutable-heap-index (local-instances concept)) )

(defmacro do-local-instances ((iterationVar concept) &body body)
  ;; Map the variable "iterationVar" across all local instances of
  ;;    "concept", and evaluate "body" for each binding of that variable;
  ;; TO DO: ADD AGENT TIME LOGIC:
  `(do-mutable-heap-index 
     ,iterationVar
     (local-instances ,concept)
     ,@body) )

(defun in-local-instances-p (instance concept)
  ;; Return t if "instance" belongs to the local instances of "concept";
  (do-local-instances (i concept)
    (when (filler-equal i instance)
      (return-from in-local-instances-p t)))
  nil )


  ;;
;;;;;; do-time-sensitive-local-instances
  ;;

(defmacro do-time-sensitive-local-instances ((iterationVar concept) &body body)
  ;; Map the variable "iterationVar" across all local instances (corrected for
  ;;    query time) of "concept", and evaluate "body" for each binding of that
  ;;    variable;
  (let ((conceptVar (gensym "CONCEPT-")))
    `(let ((,conceptVar ,concept))
       (if (temporal-p ,conceptVar)
         (do-local-instances (,iterationVar ,conceptVar)
           (when (and (time-map ,iterationVar)
                      (has-direct-slot-value (time-map ,iterationVar) :type
                                             ,conceptVar))
             ,@body))
         (do-local-instances (,iterationVar ,conceptVar)
           (when (current-local-instance-of-p ,iterationVar ,conceptVar)
             ,@body))) ) ))

;; Anonymous  Instance Indexing

(defun intern-anonymous-instance (instance knowledgeBase)
  ;; Add "instance" to the index of anonymous instances interned
  ;;    into "knowledgeBase";
  (let ((partition (first (context-partitions knowledgeBase))))
    (add-to-doubly-linked-heap-index
      instance (anonymous-objects partition)) ))

(defun unintern-anonymous-instance (instance)
  ;; Remove "instance" from the index of anonymous instances interned
  ;;    into "knowledgeBase";
  (remove-from-doubly-linked-heap-index instance) )

#+CLTL2 (declaim (inline in-anonymous-instances-index-p))
#-CLTL2 (proclaim '(inline in-anonymous-instances-index-p))
(defun in-anonymous-instances-index-p (instance knowledgeBase)
  ;; Return t if "instance" is in the anonymous instances index for "knowledgeBase";  
  (let ((partition (first (context-partitions knowledgeBase))))
    (in-doubly-linked-heap-index-p instance (anonymous-objects partition)) ))

(defun list-anonymous-instances (knowledgeBase)
  ;; Return a list of instances found in the anonymous instances index for "knowledgeBase";
  (let ((partition (first (context-partitions knowledgeBase))))
    (list-contents-of-doubly-linked-heap-index (anonymous-objects partition)) ))

(defmacro do-anonymous-instances ((iterationVar knowledgeBase) &body body)
  ;;Map the variable "iterationVar" across all anonymous instances instances of
  ;;   "knowledgeBase", and evaluate "body" for each binding of that variable;
  `(let ((partition (first (context-partitions ,knowledgeBase))))
    (do-doubly-linked-heap-index ,iterationVar (anonymous-objects partition)
				 ,@body) ))


  ;;
;;;;;; "default-mode-p" and other macros
  ;;

;;; THIS SHOULD BE OBSOLETE NOW THAT THE DISCARD POLICY HAS CHANGED:
;(defun erase-instance-from-recognition-queues (instance)
;  ;; Insure that "instance" does not belong to any of the
;  ;;    queues used by the matcher while performing reason maintenance;
;  ;; Called by "destroy-world" and "forget-all-about";
;  ;; Note: We can't just eliminate the modification summary and leave
;  ;;    the instances on the queues, because the instances may be recycled;
;  (when (modification-summary instance)
;    (loop for i from 0 to $ACT-ON-Q$
;	 do (setf (aref *match-queues* i)
;		  (delete instance (aref *match-queues* i) :test #'eq)))) )

;;; These macros are placed here because they are macros that are needed
;;;    early on:

(defmacro inside-of-transaction-p ()
  `(boundp '*transactionTag*) )

(defmacro ensure-sealed-concept (concept)
  ;; Seal "concept" if it isn't already sealed;
  `(when (not (test-bit-flags (tbox-flag ,concept) :tbox-flag :sealed))
     (catch :couldnt-seal		; TAR 1/14/98
       (to-seal-or-not-to-seal ,concept))) )

(defmacro ensure-sealed-relation (relation)
  ;; Seal "relation" if it isn't already sealed;
  `(when (not (test-bit-flags (tbox-flag ,relation) :tbox-flag :sealed))
     (catch :couldnt-seal		; TAR 1/14/98
       (to-seal-or-not-to-seal ,relation))) )


  ;;
;;;;;; Instance Creation
  ;;

(defun validate-instance-identifier (identifier)
  ;;
  (cond
   ((symbolp identifier)
    (when (keywordp identifier)
      (error "Illegal instance identifier ~S." identifier))
    identifier)
   ((stringp identifier)
    (intern (string-upcase identifier) *package*))
   (t
    (error "Illegal instance identifier ~S." identifier))) )

(defun create (identifier concept &key context kb creation-policy
                          add-suffix-p suffix-p clos-instance-p)
  "Create a new instance of `concept' and assign it the identifier `identifier'.
The type of instance created is determined by the creation policy of the indicated
or current context, unless overridden explictly by the keyword `creation-policy'.
If the policy :clos-instance is indicated but no appropriate CLOS class exists, a
:lite-instance will be created, and a warning issued.
If `add-suffix-p', then add a suffix if necessary to assure that the identifier 
is unique."
  ;; Note: keyword identifiers are disallowed because Loom can't distinguish
  ;;    between an unquoted keyword intended as a constant, and an unquoted keyword
  ;;    intended as the name of an instance;
  (obsolete-argument create kb context #'get-context-from-kb)
  (setq identifier (validate-instance-identifier identifier))
  (when (or suffix-p add-suffix-p)
    (setq identifier (generate-unique-instance-identifier identifier)))
  (prog1
    (create-instance-safely identifier concept context
			    (or creation-policy
			        (and clos-instance-p :clos-instance)))
    (when *automatically-advance-state-p*
      (new-time-point))) )

(defmacro createm (identifier concept &key context kb creation-policy
                          add-suffix-p clos-instance-p)
"Create a new instance of `concept' and assign it the identifier `identifier'.
The type of instance created is determined by the creation policy of the indicated
or current context, unless overridden explictly by the keyword `creation-policy'.
If the policy :clos-instance is indicated but no appropriate CLOS class exists, a
:classified-instance or :lite-instance will be created, and a warning issued.
If `add-suffix-p', then add a suffix if necessary to assure that the identifier 
is unique.  After instance creation, invoke the recognizer."
  (obsolete-argument createm kb context #'make-get-context-from-kb)
  `(prog1
     (create ,identifier ,concept :context ,context
             :creation-policy ,creation-policy
             :add-suffix-p ,add-suffix-p
             :clos-instance-p ,clos-instance-p)
     (new-time-point)) )

(defun create-instance-safely (identifier concept context creationPolicy)
  ;; Calls "create-instance" after making sure no instance with identifier
  ;;   "identifier" already exists.;
  ;; When an instance with the same name (idenfitier) already exists, two
  ;;    actions are possible, depending on whether or not the existing
  ;;    instance is local or inherited.  In the former case, the old
  ;;    instance is destroyed (unless the user commands an exit).  If the
  ;;    old instance is inherited, it is destroyed if its in a theory, and
  ;;    shadowed otherwise;
  (if (null context)
      (setq context *context*)
      (setq context (find-context context :error-p t :match :exact)))
  (let ((instance  (get-instance identifier :context context)))
    (cond ((null instance)
	   (within-context context
	      (if (find-new-instance-conflict identifier)
		  (warn "An instance with the name ~A is visible in one of the~%~
                        sub-contexts below ~A.  The creation of a new instance~%~
                        has been aborted." identifier context)
		  (create-instance identifier concept context creationPolicy))))
	  ((system-defined-instance-p instance)
	   (change-class instance
			 (compute-instance-creation-class 
			  identifier concept context creationPolicy))
	   ;; DO WE NEED TO CHECK FOR HIGHER CONTEXT???
	   ;; DO WE NEED TO COPY OVER ASSERTIONS/ROLE FILLERS???
	   ;; BUG:  IF THIS BECOMES A CLASSIFIED INSTANCE AND IT WASN'T ALREADY ONE,
	   ;;       THERE IS INITIALIZATION STUFF TO DO.
	   (mark-instance-as-system-defined instance nil)
	   (if concept
	       (create-existing-instance instance concept)
	     instance))
	  ((member :allow-duplicate-creates *loom-dialogue-features*)
	   (if (null concept)
	       instance
	       (create-existing-instance instance concept)))
	  ((and (or (theory-p context)
		    (workspace-has-instance-p context instance))
		(not (y-or-n-p
	     "~&Warning: Attempting to create another instance named ~S.~%~9T~
            (Y) Create new instance and destroy the existing instance, or~%~9T~
            (N) Proceed, ignoring request to create new instance.  "
	     identifier)))
	   instance)
	  (t (destroy instance)
	     (create-instance identifier concept context creationPolicy))) ))

(defun create-existing-instance (instance concept)
  (let ((sealedConcept (get-sealed-concept concept :no-error-p t)))
    (cond ((null sealedConcept) 
	   (grumble
	    "Can't create an instance of `~A' because it hasn't been defined yet."
	    concept))
	  ((and (not (sealed-p sealedConcept))
		(not (member :existing-class (system-attributes sealedConcept))))
	   (grumble "Can't create an instance of `~A' because its not sealed yet,~%~
                     probably because it references another undefined concept."
		    concept))
	  ((temporal-p sealedConcept)
	   (grumble "Cannot create instance ~A of temporal concept ~A.~%~
                Temporal concepts cannot have instances directly created for them."
		    instance (name sealedConcept)))
	  ((null (intrinsic-concept instance))
	   (setf (intrinsic-concept instance) sealedConcept)
	   (assert-conjunct instance sealedConcept :assertion))
	  ((eq (intrinsic-concept instance) sealedConcept) nil)
	  (t (grumble "Can't make ~A have creation type ~A~%~
                      because ~A has already been created with type ~A.~%~
                      Asserting the concept instead"
		      instance concept instance (intrinsic-concept instance))
	     (assert-conjunct instance sealedConcept :assertion)))
    instance ))

(defun create-instance (identifier concept context creationPolicy)
  ;; Create and return a new instance with identifier "identifier";
  ;; Assert that it belongs to the concept "concept";
  ;; Allocation an instance of the class named "(instantiation-class context)"
  ;;    if it is non-nil and "closInstanceP" is not set;
  ;; Otherwise allocate a CLOS instance if the CLOS class corresponding
  ;;    to "concept" exists;
  ;; Otherwise, allocate a lite instance;
  ;; If "closInstanceP" equals :no-warning, don't generate a warning if Loom
  ;;    must allocate a lite instance instead of a CLOS instance;
  (let (instantiationClass instance extIdCxt)
    (multiple-value-setq (identifier extIdCxt)  ; DGB 10/20/93
      (parse-extended-identifier identifier))
    (when extIdCxt (setq context extIdCxt))
    (when concept
      (let ((conceptName concept))
        (setq concept (get-sealed-concept concept :no-error-p t))
        (when (null concept)            ; RMM 12/6/94
          (grumble 
	   "Can't create an instance of `~A' because it hasn't been defined yet."
	   conceptName)
	  (return-from create-instance nil)) ; TAR 5/13/96
        (when (and (not (sealed-p concept))
                   (not (member :existing-class (system-attributes concept))))
          (grumble "Can't create an instance of `~A' because its not sealed yet,~%~
                   probably because it references another undefined concept."
		   conceptName)
	  (return-from create-instance nil))))
    (when (and concept (temporal-p concept))
      (grumble "Cannot create instance ~A of temporal concept ~A.~%~
                Temporal concepts cannot have instances directly created for them."
	       identifier (name concept))
      (return-from create-instance nil)) ; TAR 5/13/96
    (setq instantiationClass (compute-instance-creation-class 
			      identifier concept context creationPolicy))
    (case instantiationClass
      (LITE-INSTANCE
       (let ((*defaultModeP* nil))
	 ;; make sure we aren't in default mode for the benefit of "assert-conjunct";
	 (declare (special *defaultModeP*))
	 (setq instance (create-workspace-instance
			 identifier instantiationClass concept context))
	 (setf (intrinsic-concept instance) concept)
	 ;; TAR 8/20/93 ; lucid compiler bug??:
	 #+:lucid (integrity-check (eq (intrinsic-concept instance) concept))
	 (assert-conjunct instance (or concept *Thing*) :assertion) ))
      (DB-INSTANCE
       (let ((*defaultModeP* nil))
	 ;; make sure we aren't in default mode for the benefit of "assert-conjunct";
	 (declare (special *defaultModeP*))
	 (setq instance (create-classified-instance identifier concept context))
	 (setf (intrinsic-concept instance) concept)
	 ;; TAR 8/20/93 ; lucid compiler bug??:
	 #+:lucid (integrity-check (eq (intrinsic-concept instance) concept))
	 (assert-conjunct instance (or concept *Thing*) :assertion) ))
      (t
       (setq instance
	     (create-clos-instance identifier instantiationClass context))))
    (when (and concept ;; post a check for unfilled keys
               (keyed-concept-p concept))
      (loop for key in (get-keys concept)
            do (push (cons instance key) *instances-with-unfilled-keys*)))
    instance ))

(defun compute-instance-creation-class (identifier concept context creationPolicy)
  (let ((instantiationClass
	 (if creationPolicy
	     (compute-instantiation-class context creationPolicy)
	     (instantiation-class context)))
	closClass)
    (when (null instantiationClass)     ; try to allocate :clos-instance
      (when concept
        (setq closClass (find-or-create-clos-class (name concept))))
      (when (null closClass)
	(grumble "Created a LITE instance instead of a CLOS instance~
                 ~@[ for the instance ~A~]~%~
                 ~:[because no creation concept was specified for that instance.~*~;~
                    because there is no CLOS class for the concept ~A.~]"
		 identifier concept (name concept))))
    (or closClass instantiationClass 'LOOM::LITE-INSTANCE) ))

(defun create-workspace-instance (identifier class concept context)
  ;; Create and initialize an instance of the class "class" with identifier
  ;;    "identifier"; Index it into the context "context";
  ;; Generate an artificial identifier if "identifier" is nil;
  (when (null identifier)
    (setf identifier ; (incf *instance-identifier-counter*) ; TAR 3/24/93
	  (generate-unique-instance-identifier
           (cond ((eq class 'lite-instance)
                  (if concept ; TAR 8/17/93
                    (name concept)
                    'thing))
                 (class
                  (name class))
                 (t 
                  '|wi|)))))
  (create-clos-instance identifier class context) )

(defun find-or-create-instance (instanceOrId concept)
  ;; If "instanceOrId" is a name, return the existing or newly-created 
  ;;    instance having that name;
  ;; Otherwise, return "instanceOrId" itself;
  ;; If "concept" is nil, implementation of new instance defaults to THING;
  (cond 
    ((null instanceOrId)
     (error "Reference to null instance"))
    ((and (symbolp instanceOrId)
	  (not (keywordp instanceOrId)))
     (or (let ((i (get-instance instanceOrId)))
	   ;; Note, this only gets called from user code, so as soon as
	   ;;  a user references the instance by name, it is no longer
	   ;;  considered system-defined!
	   (when (and i (system-defined-instance-p i))
	     (mark-instance-as-system-defined i nil))
	   i)
         ;; look for concept or relation that hasn't been interned yet:
         ;; Mildly tricky: If network is sealed, then the corresponding
         ;;    concept or relation has been interned as an instance, so that
         ;;    "get-instance" would be adequate to find it:
	 (and (not *network-is-sealed-p*)
	      (or (get-relation instanceOrId :no-error-p t)
	          (get-concept instanceOrId :no-error-p t)))
         ; its ok if "concept" is nil:
         (and (not (find-new-instance-conflict instanceOrId))
	      (create-instance instanceOrId concept *context* nil))
         (warn "An instance with the name ~A is visible in one of the~%~
                sub-contexts below ~A.  The creation of a new instance~%~
                has been aborted.  This will likely cause further warnings.~%"
               instanceOrId *context*)))
    (t instanceOrId)) )

;;; "create-classified-instance" creates a new classifiable instance, assigns it an
;;;    identifier, and interns it into the appropriate context.

(defun create-classified-instance (identifier concept context)
  ;; Create a new LOOM instance, allocating storage and slot accessors
  ;;    as determined by the class named "className";
  ;; Assign it the identifier "identifier", and intern it into
  ;;    "context" or the current context;
  ;; Set its TYPE to "THING", and place it in the local extension of "THING";
  ;; Post it on the retraction queue;
  (let ((newInstance (make-instance 'DB-INSTANCE))
        (userDefinedNameP nil))
    (if (null identifier)
      (setq identifier
            (generate-unique-instance-identifier  ; TAR 3/24/93
             (if concept (name concept) 'Thing)))
      (setq userDefinedNameP t))
    (unless context (setq context *context*))
    (setf (identifier newInstance) identifier)          ; non-context-sensitive
    (intern-object identifier newInstance :instances context)
    (when (null concept)                ; RMM 5/10/94
      (add-to-local-instances *Thing* newInstance))
    ;; first establish the home context to minimize storage allocation, and
    ;;    then initialize context-sensitive slots:
    (setf (home-ctxt newInstance) (ctxt context))
    ;; make a non existent instance the previous instance for "newInstance":
    ;; point the previous instance of "newInstance" to a non-existent instance:
    (link-to-non-existent-instance newInstance)
    (let ((*do-in-subcontexts-p* t))     ; Force even during production rules!  ;  TAR 6/19/96
      (execute-in-contexts-depth-first
       (setf (db-type newInstance) *thing*)
       (when userDefinedNameP
	 (set-bit-flags (db-attributes newInstance) :db-instance :user-defined-name))
       ;; post "newInstance" for classification in multiple contexts:
       (post-non-analyzable-modified-instance newInstance :retraction nil)
       (setf (never-before-matched-p (modification-summary newInstance)) t)) )
    newInstance ))

(defmethod CLOS::update-instance-for-different-class :after
	   ((previous DB-INSTANCE) (current DB-INSTANCE) &rest init-args)
  (declare (ignore init-args))
  nil)

(defmethod CLOS::update-instance-for-different-class :after
	   ((previous DB-INSTANCE) current &rest init-args)
  ;; When an instance gets changed from DB-INSTANCE, we need to clear
  ;;   it from the match queues or else it can cause processing to break.
  ;; This will normally only occur when a system-defined instance (such as
  ;;   those introduced by set-constructing operators) is redefined as a
  ;;   different type of object (ie, by a subsequent defconcept)
  (declare (ignore init-args))
  (let ((*do-in-subcontexts-p* t))
    (execute-in-contexts-depth-first
     (when (modification-summary previous)
       (loop for i from 0 to $ACT-ON-Q$
	   do (setf (aref *match-queues* i)
		;; I think just deleting CURRENT will work, but this is safer:
		(delete-if #'(lambda (x) (or (eq x current)
					     (eq x previous)))
			   (aref *match-queues* i)))))) ))

(defmethod CLOS::update-instance-for-different-class :after
	   (previous (current DB-INSTANCE) &rest init-args)
  ;; When an instance gets changed to DB-INSTANCE, we need to make sure
  ;;   that DB-TYPE is properly initialized, as well as marking the it
  ;;   as having an identifier.
  ;; This will normally only occur when a system-defined instance (such as
  ;;   those introduced by set-constructing operators) is redefined as a
  ;;   different type of object (ie, by a create)
  (declare (ignore init-args previous))
  (let ((*do-in-subcontexts-p* t))	; Force even during production rules!  ;  TAR 6/19/96
      (execute-in-contexts-depth-first
       (setf (db-type current) *thing*)
       (set-bit-flags (db-attributes current) :db-instance :user-defined-name)
       ;; post "current" for classification in multiple contexts:
       (post-non-analyzable-modified-instance current :retraction nil)
       (setf (never-before-matched-p (modification-summary current)) t)) ))

  ;;
;;;;;; Destruction of instances
  ;;

;;; The primary function of "discard-instance" methods is to mark instances
;;;    as discarded, so that routines can (rapidly) skip past them when
;;;    they appear in the net.  Because there is no single slot shared by
;;;    all kinds of instances, we place multiple :discarded markers on
;;;    instances, and use multiple "discarded-p" tests.

(defmethod discard-instance ((self CLOS-INSTANCE))
  ;; At present, we don't do anything while discarding CLOS instances;
  self )

(defmethod discard-instance ((self INSTANCE-WITH-CONCEPTS))
  ;; Mark "self" as :discarded (for debugging);
  ;; At present, we don't do anything while discarding CLOS instances;
  (setf (cached-types self) :discarded)
  self )

(defmethod discard-instance ((self INSTANCE-IN-CONTEXT))
  ;; Mark "self" as :discarded (for debugging);
  ;; At present, we don't do anything while discarding CLOS instances;
  (setf (identifier self)
        (cons (identifier self) :discarded))
  self )

;; ELIMINATE THIS IN FAVOR OF THE FOLLOWING WHEN "HISORY-MIXIN" IS ELIMINATED:
(defmethod discard-instance ((self HISTORIES-MIXIN))
  ; (setf (previous-instance self) :discarded)  ; TAR 2/9/94 ; Can't discard this way with contexts.
  (setf (previous-instance self) :discarded)    ;  TAR 4/14/94 ; Maybe we can
  self )

(defmethod discard-instance ((self INSTANCE-WITH-HISTORIES))
  (setf (previous-instance self) :discarded)
  self )

;; RESTORE THIS IF WE DECIDE TO RECYCLE INSTANCES AFTER ALL:
;(defmethod discard-instance ((self DB-INSTANCE))
;  ;; Clear slots in "instance" and recycle it,
;  ;;    EXCEPT when "self" is abandoned by a merge, in which
;  ;;    case we need to save the values of the slots
;  ;;    "merged-into-instance" and "shadowed-p";
;  (call-next-method)
;  (when (and *recycle-instances-p*
;	     (not (member :abandoned-by-merge self)))
;    (clear-instance-slots self)
;    (push self *recycled-loom-instances*)) )

(defmethod discarded-p ((self INSTANCE-WITH-CONCEPTS))
  (eq (cached-types self) :discarded) )

(defmethod discarded-p ((self INSTANCE-IN-CONTEXT))
  (and (consp (identifier self))
       (eq (cdr (identifier self)) :discarded)) )

;; ELIMINATE THIS IN FAVOR OF THE FOLLOWING WHEN "HISORY-MIXIN" IS ELIMINATED:
(defmethod discarded-p ((self HISTORIES-MIXIN))
  (eq (previous-instance self) :discarded) )

(defmethod discarded-p ((self INSTANCE-WITH-HISTORIES))
  (eq (previous-instance self) :discarded) )

(defmethod discarded-p ((self T))
  nil )


;; This provides a speedier alternative for testing if an instance
;;    with histories has been discarded:
;(declaim (inline discarded-instance-with-histories-p))
(defun discarded-instance-with-histories-p (self)
  (eq (previous-instance self) :discarded) )


  ;;
;;;;;; Skolem instances
  ;;

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
	(setf (intrinsic-type skolem) (get-sealed-concept type))))
    (when type
      (assert-conjunct skolem (get-sealed-concept type) :assertion))
    (execute-in-ctxts-depth-first
     (set-bit-flags (db-attributes skolem) :db-instance :skolem))
    skolem) )


  ;;
;;;;;; "get-instance"
  ;;

;;; "get-instance" finds database instances, given an instance identifier
;;;    or instance; 
;;; The definition of "get-instance" appears here because it must succeed
;;;    the definition of the "get-...-world" macros and in-line functions.

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
        *get-instance-cached-value*
        (progn
          (setq *get-instance-cached-instance* self)
          (setq *get-instance-cached-value* (help-get-instance))))
      (help-get-instance)) ))

(defun clear-get-instance-cache ()
  ;; Called by "reset-current-context" and ...
  (setq *get-instance-cached-instance* nil)
  (setq *get-instance-cached-value* nil) )



;;; BUGS:
#|
|#

;;; TO DO:
#|
|#
