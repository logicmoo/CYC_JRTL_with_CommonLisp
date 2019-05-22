;;; -*- Mode: Lisp; Package: LOOM; Syntax: COMMON-LISP; Base: 10 -*-

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

;;; CLASSDEFS.LISP (TBOX)

;;; This file contains all class definitions for the Loom TBox -- This
;;;    insures that the class definitions will be available up front.
;;;    It is compiled and loaded before any other files are processed.

(in-package "LOOM")


(export '(CLOS-INSTANCE INSTANCE-WITH-CONCEPTS INSTANCE-IN-CONTEXT
	  INSTANCE-WITH-INVERSES INSTANCE-WITH-HISTORIES INSTANCE-WITH-TIME
	  INSTANCE-IN-MATCH-NETWORK INSTANCE-WITH-DYNAMIC-SLOTS 
          CONTEXT-SENSITIVE-INSTANCE    ;  TAR 2/16/94
	  INSTANCE-WITH-EVERYTHING 
	  INSTANCE-IN-KNOWLEDGE-BASE	; TAR 3/10/93  backward compatibility
	  USER-DEFINED-P OPEN-CLOSED-MODE skolem-instance-p
	  kb-package-name instance))

;;; Destroy all previously-defined KB-CLASSES classes:
(eval-when (compile load eval)
  (setq KBCLASSES::*kbclasses-class-table* nil)
  (setq KBCLASSES::*kbclasses-slot-table* nil))

  ;;
;;;;;; Mixin Classes
  ;;

;;; These classes define behavior that is inherited by both Loom
;;;    and CLOS instances.  Because Loom instances favor dynamic slots,
;;;    some of these mixins do not include slot declarations.  Some are
;;;    only used for method dispatch purposes.

;  TAR 2/8/94 Changed from CLOS::defclass to support context sensitive option.
(defclass HISTORIES-MIXIN () 
  ((previous-instance :accessor previous-instance :initform nil
                      :context-sensitive-p t
		      :allocation :instance)
   )
  :suppress-kb-class-p t)

(CLOS::defclass NEGATION-MIXIN ()
  (;asserted-features
   ;asserted-negations
   ))

(CLOS::defclass TIME-MAP-MIXIN ()
  (;time-map
   ))
(defmethod time-map ((self T))
  ;; The default action is to return NIL, since top-level CLOS (& other) instances do
  ;;    not have time structures associated with them;
  nil )

(CLOS::defclass CONTEXT-SENSITIVE-MIXIN ()
  ((home-ctxt :initform nil :accessor home-ctxt)))


  ;;
;;;;;; CLOS instances
  ;;

;;; Define the top level class for CLOS instances `CLOS-INSTANCE', and define
;;;    mixins that support additional LOOM functionality.

;;; Notes on class slots:
;;;    The slot "loom-concept" must be redeclared in every CLOS class that (1)
;;;       specializes CLOS-INSTANCE and (2) is directly instantiated.  We include
;;;       its declaration within CLOS-INSTANCE only to define its accessor method.
;;;    The slot "previous-instance" is declared only in CLOS-INSTANCE (and outside of
;;;       the hierarchy in BASIC-INSTANCE).  Its purpose is to return nil whenever
;;;       the history of a CLOS instance is accessed.
(CLOS::defclass CLOS-INSTANCE ()
  ((loom-concept :allocation :class
                 :accessor loom-concept
		 #-:lucid :reader #-:lucid intrinsic-concept)
   #-:lucid
   (previous-instance :allocation :class :initform nil :reader previous-instance)
   (identifier :allocation :class :initform nil :reader identifier)
   (time-map :allocation :class :initform nil :reader time-map)
   ))

;; Safer to use a method, rather than defining a slot-accessor, since
;;   we redefine the identifier slot in some subclasses.
(defmethod name ((self CLOS-INSTANCE))
  (let ((id (identifier self)))
    (if (consp id) nil id) ))

;; READER SHOULD MAKE THIS UNNECESSARY, but Lucid compiler bug forces us
;;   to use this method rather than just adding the reader.  TAR 8/20/93
#+:lucid
(defmethod intrinsic-concept ((self CLOS-INSTANCE))
  (loom-concept self) )
;; A method rather than a class slot to fix Lucid bugs:
#+:lucid
(defmethod previous-instance ((self CLOS-INSTANCE)) nil)

;; CLASS SLOT SHOULD MAKE THIS UNNECESSARY:
;(defmethod time-map ((self CLOS-INSTANCE))
;  ;; Return the time-map slot value.
;  ;; Accessor method used for compatibility with Loom instances.
;  (slot-value self 'time-map))


(CLOS::defclass INSTANCE-IN-CONCEPT-EXTENSION (CLOS-INSTANCE)
  ())

;; Lucid CLOS bugs:

(CLOS::defclass INSTANCE-WITH-CONCEPTS (INSTANCE-IN-CONCEPT-EXTENSION)
  ((dynamically-asserted-conjuncts
    #-:lucid :accessor #-:lucid dynamically-asserted-conjuncts
    :initform nil)
   (cached-types #-:lucid :accessor #-:lucid cached-types :initform nil)
   ))

#+:lucid
(defmethod cached-types ((self INSTANCE-WITH-CONCEPTS))
  (slot-value self 'cached-types))
#+:lucid
(defmethod (setf cached-types) (newValue (self INSTANCE-WITH-CONCEPTS))
  (setf (slot-value self 'cached-types) newValue))
#+:lucid
(defmethod dynamically-asserted-conjuncts ((self INSTANCE-WITH-CONCEPTS))
  (slot-value self 'dynamically-asserted-conjuncts))
#+:lucid
(defmethod (setf dynamically-asserted-conjuncts) (newValue (self INSTANCE-WITH-CONCEPTS))
  (setf (slot-value self 'dynamically-asserted-conjuncts) newValue))



(CLOS::defclass INSTANCE-WITH-DYNAMIC-SLOTS (CLOS-INSTANCE)
  ((dynamic-variables :accessor dynamic-variables :initform nil)
   ))

;; Support dynamic role caches:
(defmethod instance-role-cache ((self INSTANCE-WITH-DYNAMIC-SLOTS))
  (slot-value self 'instance-role-cache))
(defmethod (setf instance-role-cache) (newValue (self INSTANCE-WITH-DYNAMIC-SLOTS))
  (setf (slot-value self 'instance-role-cache) newValue))



(CLOS::defclass INSTANCE-WITH-HISTORIES (HISTORIES-MIXIN INSTANCE-WITH-CONCEPTS)
  ())

(CLOS::defclass INSTANCE-WITH-TIME (TIME-MAP-MIXIN INSTANCE-WITH-HISTORIES)
  ((time-map :accessor time-map :initform nil
		      :allocation :instance)
   ))

(CLOS::defclass CONTEXT-SENSITIVE-INSTANCE (CONTEXT-SENSITIVE-MIXIN 
                                            CLOS-INSTANCE)
  ())

;; Needs to be done up front to avoid overly aggressive Lucid
;;   slot reader/writer optimizations in method bodies!

;; IMPORTANT DEPENDENCY:  If slots are added to this list, then
;;   they also need to be added to the UPDATE-INSTANCE-FOR-DIFFERENT-CLASS
;;   method below:

(make-slots-context-sensitive CONTEXT-SENSITIVE-INSTANCE
                              dynamically-asserted-conjuncts 
                              (cached-types nil)
                              asserted-features
                              asserted-negations
			      violated-features
                              rete-role-bombs
                              rete-concept-bombs
  ;; TO DO:  SHOULD THIS BE (instance-role-cache nil) ??
			      instance-role-cache)

(defmethod CLOS::update-instance-for-different-class :after
	   ((previous CONTEXT-SENSITIVE-INSTANCE) (current CONTEXT-SENSITIVE-INSTANCE)
	    &rest init-args)
  (declare (ignore init-args))
  nil)

(defmethod CLOS::update-instance-for-different-class :after
	   ((previous CONTEXT-SENSITIVE-INSTANCE) current &rest init-args)
  ;; When an instance gets changed from CONTEXT-SENSITIVE-INSTANCE to something that
  ;;   isn't one, we need to make sure that certain once context-sensitive slots
  ;;   get cleared so that they don't break on non-context sensitive accesses.
  ;; This will normally only occur when a system-defined instance (such as
  ;;   those introduced by set-constructing operators) is redefined as a
  ;;   different type of object (ie, by a subsequent defconcept)
  (declare (ignore init-args))
  (let ((homeContext (context previous)))
    (loop for s in '(dynamically-asserted-conjuncts cached-types
		     asserted-features asserted-negations violated-features
		     rete-role-bombs rete-concept-bombs)
	when (CLOS::slot-exists-p current s)
	do (setf (slot-value current s)
	     (access-in-ctxt (slot-value previous s) *context* homeContext))) ))


;; Lucid CLOS bug:
(CLOS::defclass INSTANCE-IN-MATCH-NETWORK (INSTANCE-WITH-HISTORIES)
  ((rete-concept-bombs #-:lucid :accessor #-:lucid rete-concept-bombs
		       :initform nil)
   (rete-role-bombs #-:lucid :accessor #-:lucid rete-role-bombs :initform nil)
  ))

#+:lucid
(defmethod rete-concept-bombs ((self INSTANCE-IN-MATCH-NETWORK))
  (slot-value self 'rete-concept-bombs))
#+:lucid
(defmethod (setf rete-concept-bombs) (newValue (self INSTANCE-IN-MATCH-NETWORK))
  (setf (slot-value self 'rete-concept-bombs) newValue))
#+:lucid
(defmethod rete-role-bombs ((self INSTANCE-IN-MATCH-NETWORK))
  (slot-value self 'rete-role-bombs))
#+:lucid
(defmethod (setf rete-role-bombs) (newValue (self INSTANCE-IN-MATCH-NETWORK))
  (setf (slot-value self 'rete-role-bombs) newValue))


(CLOS::defclass INSTANCE-IN-CONTEXT (INSTANCE-IN-CONCEPT-EXTENSION)
  ((identifier :accessor identifier :initform nil)
   ))

;; OBSOLETE: ALLOWS 2.0 APPLICATIONS TO CONTINUE THINKING THAT
;;    CONTEXTS DON'T EXIST:
(CLOS::defclass INSTANCE-IN-KNOWLEDGE-BASE (INSTANCE-IN-CONTEXT)
  ()
  (:documentation "OBSOLETE CLASS"))

(CLOS::defclass INSTANCE-WITH-INVERSES (CLOS-INSTANCE)
  ())

;; TO DO: FIGURE OUT HOW TO MAKE THIS SLOT DYNAMIC:
(CLOS::defclass INSTANCE-WITH-NEGATION (NEGATION-MIXIN
                                        INSTANCE-WITH-CONCEPTS CLOS-INSTANCE)
  ((asserted-features :initform nil
		      #-:lucid :accessor #-:lucid asserted-features)
   (asserted-negations :initform nil
		       #-:lucid :accessor #-:lucid asserted-negations)
   (violated-features :allocation :class
                      :initform nil
		      #-:lucid :accessor #-:lucid violated-features)
   ))

#+:lucid
(defmethod asserted-features ((self INSTANCE-WITH-NEGATION))
  (slot-value self 'asserted-features))
#+:lucid
(defmethod (setf asserted-features) (newValue (self INSTANCE-WITH-NEGATION))
  (setf (slot-value self 'asserted-features) newValue))
#+:lucid
(defmethod asserted-negations ((self INSTANCE-WITH-NEGATION))
  (slot-value self 'asserted-negations))
#+:lucid
(defmethod (setf asserted-negations) (newValue (self INSTANCE-WITH-NEGATION))
  (setf (slot-value self 'asserted-negations) newValue))
#+:lucid
(defmethod violated-features ((self INSTANCE-WITH-NEGATION))
  (slot-value self 'violated-features))
#+:lucid
(defmethod (setf violated-features) (newValue (self INSTANCE-WITH-NEGATION))
  (setf (slot-value self 'violated-features) newValue))


(CLOS::defclass INSTANCE-WITH-EVERYTHING
  (CONTEXT-SENSITIVE-INSTANCE INSTANCE-IN-CONTEXT INSTANCE-WITH-TIME
                              INSTANCE-IN-MATCH-NETWORK INSTANCE-WITH-INVERSES
                              INSTANCE-WITH-DYNAMIC-SLOTS INSTANCE-WITH-NEGATION)
  ())

(defmethod print-object ((self INSTANCE-IN-CONTEXT) stream)
  #+:CLTL2(when *print-readably*
	    (print-readably-error 'INSTANCE-IN-CONTEXT self))
  (if (or (not (CLOS::slot-boundp self 'identifier)) ;; no identifier
          (and (consp (identifier self)) ;; anonymous or :discarded
               (not (discarded-p self))))
    (call-next-method)                  ; default to Common Lisp printing
    (let ((identifier (identifier self)))
      (when (and (consp identifier)
                 (eq (cdr identifier) :discarded))
        (setq identifier (car identifier)))
      (if *html-print-p*
        (format stream "~A" (html-reference self))
        (format stream "|i|~S"
                (if (atom identifier)
                  (if (discarded-p self) `(,identifier :discarded) identifier)
                  :discarded))))) )

(CLOS::defclass LITE-INSTANCE (INSTANCE-WITH-EVERYTHING)
  ((intrinsic-concept :initform nil :accessor intrinsic-concept)
   ))


  ;;
;;;;;; LOOM-OBJECT and NAMED-OBJECT
  ;;

;;; This defines the top level class in the LOOM object hierarchy.
;;;    (it corresponds to CLOS::OBJECT)
;;; LOOM-OBJECT defines default behavior for how objects print themselves.
;;; LOOM classes are defined using the KBCLASSES system, which adds a few
;;;    features missing from CLOS -- notably, a metaprotocol that allows us
;;;    to find the names of slots of classes, inverses of slots, and aliases
;;;    for slots.

#+:CLTL2
(defun print-readably-error (type object)
  (let ((*print-readably* nil))
    (error "Can't print ~A ~S readably" type object)))

(defclass LOOM-OBJECT ()
  (dynamic-variables
   ))

(defmethod print-object ((self LOOM-OBJECT) stream)
  ;; Carefully constructed to avoid recursion;
  #+:CLTL2(when *print-readably* (print-readably-error 'loom-object self))
  (format stream "#<~S: ~S>"
	  (CLOS::class-name (CLOS::class-of self))
	  (cond
	    ((neq (context-identifier self) self)
	     (context-identifier self))
	    ((neq (key self) self)
	     (key self))
	    (t :UNPRINTABLE))) )

(defmethod show ((self LOOM-OBJECT) &key (stream t))
  ;; Print the most important slots of "self"
  (KBCLASSES::show-visible-slots self :stream stream) )

(defmethod show-all ((self LOOM-OBJECT) &key (stream t))
  ;; Print all slots of "self"
  (KBCLASSES::show-all-slots self :stream stream) )


(defclass NAMED-OBJECT (LOOM-OBJECT)
  (name
   ))
(defmethod key ((self NAMED-OBJECT))
  (name self) )
(defmethod context-identifier ((self NAMED-OBJECT))
  (name self) )


;;; define T.name so that "name" doesn't break on constants...
(defmethod name (self) self)
;;Redundant now: (defmethod name ((self SYMBOL)) self)
(defmethod name ((self PHANTOM-INVERSE-RELATION))
  ;; Make "name" work for second argument in calls to "get-slot-value"
  ;;    and "set-slot-value"
  self )

;;; Within LOOM, the slots "key" and "identifier" are defined for
;;;    most classes;  Here we define their default methods for non-kbclass
;;;    objects;
(defmethod key (self) self)
(defmethod context-identifier (self) (declare (ignore self)) nil)



  ;;
;;;;;; Instances
  ;;

;;; The class "BASIC-INSTANCE" provides the minimal number of slots to statically
;;;    record a fully-general database instance.  (It inherits the dynamic slots
;;;    slot from LOOM-OBJECT).

(defclass BASIC-INSTANCE (LOOM-OBJECT HISTORIES-MIXIN)
  ((identifier)					; SYMBOL or INTEGER
   (db-type :range TBOX-CONCEPT :collection-p t :context-sensitive-p t)
   (residue-features :range FEATURE :collection-p t :allocation :dynamic
                     :context-sensitive-p t)
   ;; HISTORIES-MIXIN-SLOT:
   (previous-instance :range HISTORY-INSTANCE :context-sensitive-p t)
   ))

(defmethod name ((self BASIC-INSTANCE)) (identifier self))

;;; The class "DB-INSTANCE" provides the standard implementation of
;;;    a LOOM instance.

(def-bit-flags :db-instance 
    :skolem :incoherent :user-defined-name 
    :instance-being-replaced :instance-being-merged :abandoned-by-merge :recompute-features)

(defclass DB-INSTANCE (BASIC-INSTANCE CONTEXT-SENSITIVE-MIXIN
                                      TIME-MAP-MIXIN NEGATION-MIXIN) 
  ((db-attributes :range INTEGER :initform 0 :collection-p t :context-sensitive-p t)
;  (db-attributes :range KEYWORD :collection-p t :context-sensitive-p t)
   
   (intrinsic-concept :range UNARY-CONCEPT)
   (conjuncts-table :collection-p t :context-sensitive-p #| nil |# t)  ; CTXXX
   (role-fillers-table :collection-p t) ; Internally context-sensitive ; TAR 2/11/98
   (modification-summary :context-sensitive-p :non-inheriting)
   (if-added-bombs :collection-p t :context-sensitive-p t)
   (if-removed-bombs :collection-p t :context-sensitive-p t)
   (remote-type-bombs :collection-p t :allocation :dynamic
                      :context-sensitive-p t :invisible-p yes)
   (bomb-removal-index :collection-p t :allocation :dynamic
                       :context-sensitive-p t :invisible-p yes)
   (strict-db-type :range TBOX-CONCEPT :collection-p t :context-sensitive-p t)
   (cumulative-value-restrictions :range VALUE-RESTRICTION :collection-p t
				  :invisible-p yes :context-sensitive-p t)
   (strict-cumulative-value-restrictions :range VALUE-RESTRICTION :collection-p t
					 :invisible-p yes :context-sensitive-p t)
   (strict-max-restrictions :range MAX-RESTRICTION :collection-p t
			    :allocation :dynamic :context-sensitive-p t)
   (violated-features :allocation :dynamic :context-sensitive-p t)
   (multiple-definitions :collection-p t :allocation :dynamic :context-sensitive-p t)
   (merged-into-instance :range DB-INSTANCE :allocation :dynamic :context-sensitive-p t)
   (rete-concept-bombs :collection-p t :allocation :dynamic
                       :context-sensitive-p t :invisible-p yes)
   (rete-role-bombs :collection-p t :allocation :dynamic
                    :context-sensitive-p t :invisible-p yes)
   (instance-role-cache :range ROLE :allocation :dynamic)
   ;; ASSERTED-FEATURES-MIXIN SLOT:
   (asserted-features :allocation :dynamic :context-sensitive-p t)
   ;; NEGATION-MIXIN SLOT:
   (asserted-negations :allocation :dynamic :context-sensitive-p t)
   ;; TIME-MAP-MIXIN SLOT:
   (time-map :allocation :dynamic)
   ))

(defmethod key ((self DB-INSTANCE))
  (or (identifier self) self))

(defmethod relative-name ((self DB-INSTANCE))
  (let* ((instanceId (identifier self))
	 (referenceObject (get-instance instanceId)))
    (if (eq self referenceObject)
	instanceId
	(generate-extended-identifier instanceId *context*)) ))

(defmethod context-identifier ((self DB-INSTANCE))
  ;; Called by "unintern-object" and "create-history-instance";
  (let ((identifier (identifier self)))
    (unless (consp identifier)
      identifier) ))


(defmacro instance-identifier-p (sexp)
  `(symbolp ,sexp) )

(defmacro skolem-instance-p (instance)
  `(and (classified-instance-p ,instance)
	(test-bit-flags (db-attributes ,instance) :db-instance :skolem)) )


(defmethod print-object ((self DB-INSTANCE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'DB-INSTANCE self))
  (let* ((dbType (db-type self))
	 (iOrSk (if (skolem-instance-p self) "SK" "I"))
	 (printedType
	   (cond
	     ((not (member :long-print-names *loom-dialogue-features*))
	      nil)
	     ((or (discarded-p self)
		  (eq dbType :abandoned-by-merge))
	      `(,(object-name self) :discarded))
	     (dbType
	      (loop for conjunct 
                    in (find-named-superconcepts-of-supers (list-of dbType))
		   collect (name conjunct)))
	     (t
	      '(:UNTYPED)))))
    (if *html-print-p*
	(format stream "~A" (html-reference self))
      (format stream "|~A|~A~@[~A~]" iOrSk (identifier self) printedType))) )

(defclass HISTORY-INSTANCE (BASIC-INSTANCE)
  ((time-point :range INTEGER)
   (next-instance :range BASIC-INSTANCE :one-way-inverse previous-instance
                  :context-sensitive-p t)
   ))

(defmethod print-object ((self HISTORY-INSTANCE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'HISTORY-INSTANCE self))
  (let ((id (identifier self)))
    (format stream "|H|~S_at_~S"		; tar 1/7/92
	    (if id id (when (loom::db-type self)
			(or (identifier (loom::db-type self))
			    (loom::db-type self))))
	    (time-point self)) ))

(defclass REAL-HISTORY-INSTANCE (HISTORY-INSTANCE CONTEXT-SENSITIVE-MIXIN)
  ())

(defclass NON-EXISTENT-INSTANCE (HISTORY-INSTANCE)
  ())

(defclass UNELABORATED-INSTANCE ()
  ((parent-instance :range DB-INSTANCE)))

(defmethod print-object ((self UNELABORATED-INSTANCE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'loom-object self))
  (format stream "#<UNELABORATED-INSTANCE: ~S>"
	  (parent-instance self)) )


(defclass SURROGATE-INSTANCE (INSTANCE-WITH-EVERYTHING)
  ((real-instance)			; :accessor real-instance TAR 1/29/93 (done automatically by defclass)
   (context :range CONTEXT)
   ))

(defclass CACHING-SURROGATE (SURROGATE-INSTANCE)
  ())
	      
(defclass HISTORY-INDEX ()
  ((time-point :range INTEGER)
   (previous-index :range HISTORY-INDEX)
   (next-index :one-way-inverse previous-index :context-sensitive-p t)
   (added-next-time-quantum :collection-p t)
   (removed-next-time-quantum :collection-p t)
   ))

(defmethod print-object ((self HISTORY-INDEX) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'HISTORY-INDEX self))
  (format stream "|X|~S_at_~S"
	  (let ((rootIndex (root-concept-of-index self)))
	    (and rootIndex
		 (name rootIndex)))
	  (time-point self)) )

;;; REMOVED  ; DGB 4/14/92
;#-(or TI Symbolics)
;  (progn
;    ;; WORKAROUND FOR ALIASED-SLOT PROBLEM IN PCL UNDER LUCID;
;    ;; When a new PCL is released, try writing and reading these slots
;    ;;    to see if this patch is still necessary;
;    (defmethod (setf already-visited-counter) (newValue (self CLASSIFIABLE-OBJECT))
;      (setf (slot-value self 'classified-p) newValue) )
;    (defmethod (setf feature-is-below-counter) (newValue (self CLASSIFIABLE-OBJECT))
;      (setf (slot-value self 'concept-is-below-counter) newValue) )
;    (defmethod (setf already-revised-counter) (newValue (self CLASSIFIABLE-OBJECT))
;      (setf (slot-value self 'concept-is-below-counter) newValue) )
;    )


  ;;
;;;;;; Declarations of CLASSIFIABLE-OBJECTs
  ;;

;;; The LOOM TBox is constructed of classifiable objects -- objects that
;;;    can be organized into lattices ordered as specified by their super-concepts
;;;    and sub-concepts slots;

(def-bit-flags :tbox-flag
    :primitive				; Replaces primitive-p
    :discarded				; Replaces overload of primitive-p slot.

  :completed :sealed :conditioned-defaults ; Replaces completed-p in TBOX-CONCEPT
  :about-to-seal			; Added flag to improve sealing efficiency
					;     in tangled hierarchies
  :instrument				; Replaces instrument-p in FEATURE
  :circular				; Replaces circular-p in INTERVAL-FEATURE
  :predicate-variable			; Added flag for COMPUTE-FEATURE with variable in
					;   a predicate position.
   ;; in TBOX-RELATION:
  :single-valued			; Replaces role-is-single-valued-p
  :value-restricted			; Replaces role-is-value-restricted-p
  :equivalence-restriction	 ; Replaces role-in-equivalence-restriction-p
  :computed-restriction		 ; Replaces role-in-computed-restricted-p

  :backward-chaining                    ; Replaces backward-chaining-p in UNARY-CONCEPT
  )


(defclass CLASSIFIABLE-OBJECT ()
  ((name :do-not-reinitialize t :accessor feature-type)
   (super-concepts :range CLASSIFIABLE-OBJECT :collection-p t :inverse sub-concepts)
   (sub-concepts :range CLASSIFIABLE-OBJECT :collection-p t :do-not-reinitialize t)
   (tbox-flag :range INTEGER :initform 0)
   (classified-p :accessor already-visited-counter)
   (already-visited-counter :allocation :none :aliases classified-p)
   (concept-is-below-counter :range INTEGER :do-not-reinitialize t :invisible-p yes
			     :accessor feature-is-below-counter
			     :accessor already-revised-counter)
   (feature-is-below-counter :allocation :none :aliases concept-is-below-counter)
   (already-revised-counter :allocation :none :aliases concept-is-below-counter)
   (all-super-concepts :collection-p t :invisible-p yes)

   (search-nodes :range CLASSIFIABLE-OBJECT :collection-p t :invisible-p yes)
   (dependents :range CLASSIFIABLE-OBJECT :collection-p t :do-not-reinitialize t)
   (non-tbox-dependents :range CLASSIFIABLE-OBJECT
			:collection-p t :do-not-reinitialize t)
   ))

(def-bit-accessor primitive-p tbox-flag :tbox-flag :primitive)

;; 10/28/92:  OLD DEFINITION OF TBOX-CONCEPT STARTED LIKE THIS:
;; (defclass TBOX-CONCEPT (CLASSIFIABLE-OBJECT DB-INSTANCE)...)
;; CONSIDER ELIMINATING THE IDENTIFIER SLOT?:

(defclass TBOX-CONCEPT (CLASSIFIABLE-OBJECT 
                        INSTANCE-IN-CONTEXT INSTANCE-WITH-INVERSES 
                        INSTANCE-WITH-DYNAMIC-SLOTS INSTANCE-WITH-NEGATION
			INSTANCE-WITH-CONCEPTS)
  ((context :range CONTEXT :do-not-reinitialize t)
   (top-of-hierarchy :allocation :class :initform 'MISSING-TOP-OF-SUBLATTICE)
;   (primitive-p :range FLAG :allocation :instance) ;; from super
   (source-definitions :range S-EXPR :do-not-reinitialize t)
   (parsed-expressions :range S-EXPR)
   (query-definition :range S-EXPR)
   (conjuncts :allocation :instance :collection-p t)
   (defined-as :range SYMBOL)
;;; THE NEXT TWO SLOTS WILL BE COMBINED INTO AN ALGEBRAIC FEATURES SLOT???
   (disjunctive-features :range TBOX-CONCEPT :collection-p t :allocation :dynamic)
   (disjuncts :range TBOX-CONCEPT :collection-p t :allocation :dynamic)
   (negated-concepts :range TBOX-CONCEPT :collection-p t :allocation :dynamic)
   (most-specific-atemporal-monotonic-super-concepts :range TBOX-CONCEPT
				      :collection-p t :allocation :dynamic)
   (computed-features :range COMPUTED-FEATURE :collection-p t :allocation :dynamic)
   (implied-computed-features :range COMPUTED-FEATURE :collection-p t :allocation :dynamic)
   (antecedents :range TBOX-CONCEPT :allocation :dynamic)
   (consequents :range TBOX-CONCEPT :allocation :dynamic)
   (disjoint-coverings :allocation :dynamic)
   (disjoint-covering-memberships :allocation :dynamic :do-not-reinitialize t)
   (partitions :collection-p t :allocation :dynamic)
   (partition-memberships :collection-p t :allocation :dynamic :do-not-reinitialize t)
   (covering-concepts :range TBOX-CONCEPT :collection-p t :allocation :dynamic)
   (auxiliary-lambda-function :allocation :dynamic)
   (auxiliary-lambda-predicate :allocation :dynamic)
   (attributes :range KEYWORD :collection-p t)
   (system-attributes :range KEYWORD :collection-p t)
;;   (completed-p :range FLAG) ;; & :range KEYWORD !  ;; in tbox-flag
   (pure-conjunction-p :range CONCEPT :collection-p t :allocation :dynamic)
   (primitive-concepts :range TBOX-CONCEPT :collection-p t
		       :accessor merged-into-concept)
   (predicate-symbol :range SYMBOL)
   (sequence-number :range NUMBER :initform (incf *concept-sequence-counter*))
   (depend-ons :range TBOX-CONCEPT :collection-p t :one-way-inverse dependents)
   (temporal-depend-ons :range TBOX-CONCEPT :collection-p t
			:allocation :dynamic)
   (non-tbox-depend-ons :range TBOX-CONCEPT :collection-p t
			:one-way-inverse non-tbox-dependents)
   (dependent-instances :range DB-INSTANCE :collection-p t
			:allocation :dynamic :do-not-reinitialize t)
   (merged-into-concept :allocation :none :aliases primitive-concepts)
   (instance-role-cache :range ROLE :allocation :dynamic)
   ))


(defmacro completed-p (self)
  #+:cltl2
  `(locally (declare (optimize (speed 3) (safety 0) (space 0) (debug 0)))
     (test-bit-flags (tbox-flag ,self) :tbox-flag :or :completed :sealed :conditioned-defaults))
  #-:cltl2
  `(test-bit-flags (tbox-flag ,self) :tbox-flag :or :completed :sealed :conditioned-defaults)
  )

(defsetf completed-p (self) (newValue)
  #+:cltl2
  `(locally (declare (optimize (speed 3) (safety 0) (space 0) (debug 0)))
     (clear-bit-flags (tbox-flag ,self) :tbox-flag :completed :sealed :conditioned-defaults)
     (cond ((eq ,newValue :sealed)
	    (set-bit-flags (tbox-flag ,self) :tbox-flag :sealed))
	   ((eq ,newValue :conditioned-defaults)
	    (set-bit-flags (tbox-flag ,self) :tbox-flag :conditioned-defaults))
	   (,newValue
	    (set-bit-flags (tbox-flag ,self) :tbox-flag :completed)))
     ,newValue)
  #-:cltl2
  `(progn
     (clear-bit-flags (tbox-flag ,self) :tbox-flag :completed :sealed :conditioned-defaults)
     (cond ((eq ,newValue :sealed)
	    (set-bit-flags (tbox-flag ,self) :tbox-flag :sealed))
	   ((eq ,newValue :conditioned-defaults)
	    (set-bit-flags (tbox-flag ,self) :tbox-flag :conditioned-defaults))
	   (,newValue
	    (set-bit-flags (tbox-flag ,self) :tbox-flag :completed)))
     ,newValue)
  )

(defmethod sequence-number ((self T)) ; default method
  nil)

(defmethod key ((self TBOX-CONCEPT))
  (name self))
(defmethod incoherent-p ((self TBOX-CONCEPT))
  (member :incoherent (attributes self)))
(defmethod (setf incoherent-p) (tOrNil (self TBOX-CONCEPT))
  (if tOrNil
      (pushnew :incoherent (attributes self) :test #'eq)
      (delf (attributes self) :incoherent :test #'eq)) )

(defmethod relative-name ((self TBOX-CONCEPT))
  (let* ((conceptName (name self))
	 (referenceObject 
	   (evaluate-identifier conceptName :concepts nil)))
    (if (eq self referenceObject)
	conceptName
      (generate-extended-identifier conceptName *context*)) ))
(defmethod home-ctxt ((self TBOX-CONCEPT))
  (let ((context (context self)))
    (and context (ctxt context)) ))

(defmacro consequent-concept (concept)
  (once-only (concept)
    `(or (more-specific-consequent ,concept) ,concept) ))
(defmacro undefined-p (self)
  `(member :undefined (attributes ,self)) )
(defmacro temporal-p (self)
  `(member :temporal (attributes ,self)) )

(defmacro system-defined-concept-p (self)
  `(member :system-defined (attributes ,self)) )
(defmacro system-defined-instance-p (instance)
  `(gethash ,instance *system-defined-instances-table*))
(defmacro mark-instance-as-system-defined (instance mark)
  `(if ,mark
       (setf (gethash ,instance *system-defined-instances-table*) t)
       (remhash ,instance *system-defined-instances-table*)) )

(defmacro user-defined-p (self)
  `(not (system-defined-p ,self)) )
(defmacro user-defined-concept-p (self)
  `(not (system-defined-concept-p ,self)) )
(defmacro user-defined-instance-p (self)
  `(not (system-defined-instance-p ,self)) )


(defmacro system-defined-name-p (self)
  `(member :system-generated-name (system-attributes ,self)) )
(defmacro sealed-p (self)
  `(test-bit-flags (tbox-flag ,self) :tbox-flag :sealed))
(defun garbage-concept-p (self)
  (member :garbage-concept (system-attributes self)) )

(defun mark-as-bad-definition (metaConcept)
  (pushnew :bad-definition (system-attributes metaConcept)))
(defun clear-bad-definition (metaConcept)
  (setf (system-attributes metaConcept)
        (delete :bad-definition (system-attributes metaConcept))))
(defun bad-definition-p (metaConcept)
  (member :bad-definition (system-attributes metaConcept)))


;; These need to be defined after the macros above:

(defmethod system-defined-p ((instance T))
  T )
(defmethod system-defined-p ((instance CLOS-INSTANCE))
  (system-defined-instance-p instance) )
(defmethod system-defined-p ((instance DB-INSTANCE))
  (system-defined-instance-p instance) )
(defmethod system-defined-p ((concept TBOX-CONCEPT))
  (system-defined-concept-p concept))




#+CLTL2 (declaim (inline monotonic-p perfect-p recursive-p read-only-p))
#-CLTL2 (proclaim '(inline monotonic-p perfect-p recursive-p read-only-p))  

(defun monotonic-p (self)
  (member :monotonic (attributes self)))

(defsetf monotonic-p (self) (setting)
  `(if ,setting
       (pushnew :monotonic (attributes ,self))
       (progn
	 (delf (attributes ,self) :monotonic)
	 nil)) )

(defun perfect-p (self)
  (member :perfect (attributes self)))

(defsetf perfect-p (self) (setting)
  `(if ,setting
       (pushnew :perfect (attributes ,self))
       (progn
	 (delf (attributes ,self) :perfect)
	 nil)) )

(defun recursive-p (self)
  (member :recursive (attributes self)) )

(defsetf recursive-p (self) (setting)
  `(if ,setting
       (pushnew :recursive (attributes ,self))
       (progn
	 (delf (attributes ,self) :recursive)
	 nil)) )

(defun read-only-p (self)
  (member :read-only (attributes self)) )

(defclass UNARY-ENTITY (TBOX-CONCEPT)
  ((loom-concept :allocation :class :initform nil)
   (top-of-hierarchy :allocation :class :initform 'Unary-Tuple)
   (arity :allocation :class :initform 1)
   (restrictions :range FEATURE :collection-p t)
   (comparisons :range COMPARISON-FEATURE :collection-p t :allocation :dynamic)
   (defined-set-feature :range SET-FEATURE :allocation :dynamic)
   (implied-restrictions :range FEATURE :collection-p t)
   (implied-comparisons :range COMPARISON-FEATURE :collection-p t :allocation :dynamic)
   (implied-set-feature :range SET-FEATURE :allocation :dynamic)
   (more-specific-consequent :range UNARY-ENTITY :allocation :dynamic)
   (most-general-antecedents :range UNARY-ENTITY :allocation :dynamic)
   (backward-chaining-complexity :range SYMBOL)
   (default-concepts :range UNARY-ENTITY :collection-p t :allocation :dynamic)
   (default-features :range FEATURE :collection-p t :allocation :dynamic)
   (null-reified-comparison :range REIFIED-COMPARISON-FEATURE :allocation :dynamic)
   (disjoint-concepts-cache :range UNARY-ENTITY :collection-p t)
   (non-disjoint-concepts-cache :range UNARY-ENTITY :collection-p t)
   (most-specific-forward-chaining-super-concepts :range UNARY-ENTITY :collection-p t)
 ;   (backward-chaining-p :range FLAG :allocation :class :initform t) ; Lucid can't hack this!
   (rete-node :range RETE-ANCHOR-NODE :do-not-reinitialize t
              :allocation :dynamic
              :context-sensitive-p nil)
   ))
;; PATCH FOR BUGGY Lucid COMPILER:
#+:Lucid (defmethod arity ((self UNARY-ENTITY)) (slot-value self 'arity))

;; A method rather than a class slot to fix Lucid bugs:
(defmethod backward-chaining-p ((self UNARY-ENTITY)) t)

;; Allows asking non-Property supers of a property for their domain:
(defmethod defined-domain ((self UNARY-ENTITY)) nil)		; TAR 7/6/99

(defclass UNARY-RELATION (UNARY-ENTITY)
  ((concept-or-relation :allocation :class :initform :property)	;was :concept TAR 7/6/99
   (implied-domain :range UNARY-ENTITY)
   (defined-domain :range UNARY-ENTITY :allocation :dynamic)    ; TAR 7/6/99
   (more-restrictive-defined-domain :range UNARY-ENTITY :allocation :dynamic); TAR 7/6/99
   ))

(defmethod print-object ((self UNARY-RELATION) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'UNARY-RELATION self))
  (if *html-print-p*
      (format stream "~A" (html-reference self))
      (format stream "|P|~S" (name self))) )

(defclass UNARY-CONCEPT (UNARY-ENTITY)
  ((loom-concept :allocation :class :initform nil)
   (top-of-hierarchy :allocation :class :initform 'Thing)
   (concept-or-relation :allocation :class :initform :concept)
   (local-instances :collection-p t)
;   (backward-chaining-p :range FLAG :allocation :dynamic)
   (role-cache :range ROLE :allocation :dynamic)
   (keys :collection-p t :allocation :dynamic)
   (query-index-roles :collection-p t :allocation :dynamic)
   (mixin-classes :range SYMBOL :collection-p t :allocation :dynamic)
   (clos-class-name :range SYMBOL :allocation :dynamic)
   (mixin-slots :range LIST :collection-p t :allocation :dynamic)
   ))

(defmethod backward-chaining-p ((self UNARY-CONCEPT))
  (test-bit-flags (tbox-flag self) :tbox-flag :backward-chaining))

(defmethod (setf backward-chaining-p) (newValue (self UNARY-CONCEPT))
  (declare (optimize (speed 3) (safety 0) (debug 0) (space 0)))
  (if newValue
      (set-bit-flags (tbox-flag self) :tbox-flag :backward-chaining)
      (clear-bit-flags (tbox-flag self) :tbox-flag :backward-chaining))
  newValue)

(defun concept-is-closed-p (self)
  (member :closed-world (system-attributes self)))
(defsetf concept-is-closed-p (self) (setting)
  `(if ,setting
       (pushnew :closed-world (system-attributes ,self))
       (progn
	 (delf (system-attributes ,self) :closed-world)
	 nil)) )

(defun keyed-concept-p (concept)
  (member :keyed (system-attributes concept)) )


;;; SHOULD WE APPEND THE "shortDef" EVEN IF "self" IS SYSTEM-DEFINED AND
;;;    WE ARE THEREFORE PRINTING ITS DEFINITION RATHER THAN ITS NAME?

(defmethod print-object ((self UNARY-CONCEPT) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'UNARY-CONCEPT self))
  (let* ((definedSetP (and (eq (defined-as self) :set)
			   (defined-set-feature self)))
	 (name
	   (cond
	     ((not (member :long-print-names *loom-dialogue-features*))
	      (or (name self) :UNNAMED)) 
	     ((and (system-defined-name-p self)
		   (not definedSetP))
	      (let ((*expandSystemDefinedConceptsP* t))
		(declare (special *expandSystemDefinedConceptsP*))
		(generate-concept-definition self :definition-only-p t)))
	     (t
	      (or (name self)
		  (getf (cdar (source-definitions self)) :is)
		  (getf (cdar (source-definitions self)) :is-primitive)
		  (let ((conceptRef (getf (parsed-expressions self) :definition)))
		    (when conceptRef
		      (if (concept-p conceptRef) (name conceptRef) conceptRef)))
		  :UNNAMED))))
	 (shortDef
	   (when (and (symbolp name) definedSetP)
	     (generate-set-definition-string (defined-set-feature self) t))))
    (if *html-print-p*
      (if (name self)
	  (format stream "~A~@[~A~]"
		  (html-reference self)
		  (and (system-defined-name-p self) shortDef))
        (format stream "~S~@[~A~]" name shortDef))
      #+:CLTL2
      (if (eq name :unnamed)
	  (print-unreadable-object (self stream :identity t)
	    (format stream "|C|~S~@[~A~]" name shortDef))
	(format stream "|C|~S~@[~A~]" name shortDef))
      #-:CLTL2
      (format stream "|C|~S~@[~A~]" name shortDef)) ))


(defclass REIFIED-RELATION (UNARY-CONCEPT)
  ((relation-of :range TBOX-RELATION)))

(defclass INSTANCES-INDEX ()
  ((local-instances :range DB-INSTANCE)
   (retracted-local-instances :range DB-INSTANCE) ; REMOVE EVENTUALLY
   (context :range CONTEXT)
   (local-copy-p :range FLAG)
   ))

;; The concept ROLE is defined in BUILT-IN-THEORY.  It references this class
;;    as a built-in class.  We introduce it here to make it possible to compile
;;    code before the network is up.
(defclass ROLE (INSTANCE-WITH-DYNAMIC-SLOTS INSTANCE-WITH-INVERSES)
  ((loom-concept :allocation :class)
   relation
   concept
   role-specification
   (attributes :allocation :dynamic)
   (compiled-accessor-function :allocation :dynamic)) )

;; Define synonym accessor for instance/concept

(defmethod instance ((self ROLE))
  (concept self))
(defmethod (setf instance) (newValue (self ROLE))
  (setf (concept self) newValue))


;; Does this need to be moved after the definition of the class SET-FEATURE?
(defmethod print-object ((self ROLE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'ROLE self))
  (if (and (concept self) (relation self))
    (let ((valueType (first (value-type self))))
      (format stream "|ROLE|(~A ~D ~D ~A)"
	      (name self)
	      (min-cardinality self)
	      (max-cardinality self)
              (cond ((typep valueType 'SET-FEATURE)
                     (or (generate-set-feature-description valueType)
			 "SomeSet"))
                    ((name valueType))
                    (t valueType))) )
    (format stream "|ROLE|(* * * *)")) )

;; VIRTUAL-P IS NOT CURRENTLY USED (BUT CODE *DOES* REFERENCE IT):
(defmethod virtual-p ((self T))
  nil )
(defmethod virtual-p ((self ROLE))
  (member :virtual (attributes self)) )
(defmethod virtual-p ((self UNARY-CONCEPT))
  (member :virtual (attributes self)) )




  ;;
;;;;;; Feature Objects
  ;;

(defclass FEATURE (CLASSIFIABLE-OBJECT)
  ((feature-type :range KEYWORD :allocation :none :aliases name)
   ;(instrument-p :range FLAG)  ;; in tbox-flag
   ))

(def-bit-accessor instrument-p tbox-flag :tbox-flag :instrument)

(defclass RESTRICTION-FEATURE (FEATURE)
  ((relation :range BINARY-RELATION)
   (qualification :range UNARY-ENTITY :one-way-inverse dependents)
   ))

(defclass MIN-RESTRICTION (RESTRICTION-FEATURE)
  ((lower-bound :range INTEGER :initform 0) 
   ))

(defclass MAX-RESTRICTION (RESTRICTION-FEATURE)
  ((upper-bound :range INTEGER :initform 'INFINITY)
   ))

(defclass VALUE-RESTRICTION (RESTRICTION-FEATURE)
  ((value-restriction :range UNARY-ENTITY :one-way-inverse dependents)
   ))

(defclass FILLED-BY-FEATURE (RESTRICTION-FEATURE)
  ((role-fillers :collection-p t)
   ))

(defclass NOT-FILLED-BY-FEATURE (RESTRICTION-FEATURE)
  ((non-role-fillers :collection-p t)
   ))

(defclass SET-FEATURE (FEATURE)
  (
   ;(primitive-p :range FLAG :allocation :instance) ;; FROM super.
   (members :range INTEGER :collection-p t)
   (base-set :range SET-FEATURE)
   (defining-concept :one-way-inverse dependents :allocation :dynamic)
   ))

(defun generate-set-feature-description (setFeature)
  (if (eq (members setFeature) :infinite-set)
    (case (name (defining-concept setFeature))
      (THING "AllThings")
      (CONSTANT "AllConstants")
      (SYMBOL "AllSymbols")
      (STRING "AllStrings")
      ((NIL) "All???")
      (otherwise 
       (format nil "All~:(~A~)" (name (defining-concept setFeature)))))
    (generate-set-definition-string setFeature nil)) )

(defmethod incoherent-p ((self SET-FEATURE)) 
  (null (members self)) )
(defmethod system-attributes ((self SET-FEATURE))
  nil)

(defclass INTERVAL-FEATURE (SET-FEATURE)
  (
   ;(circular-p :range FLAG)  ;; in tbox-flag
   ))

(def-bit-accessor circular-p tbox-flag :tbox-flag :circular)

(defclass SYMBOLIC-INTERVAL (INTERVAL-FEATURE)
  ((symbols :collection-p t)
   ))


(defmethod print-object ((self MIN-RESTRICTION) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'MIN-RESTRICTION self))
  (format stream "~:[|FTR|~;~](:at-least ~S ~S~@[ ~A~])"
	  *html-print-p*
	  (lower-bound self)
	  (and (relation self) (or (name (relation self)) :UNNAMED))
	  (generate-external-reference (qualification self))))

(defmethod print-object ((self MAX-RESTRICTION) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'MAX-RESTRICTION self))
  (format stream "~:[|FTR|~;~](:at-most ~A ~S~@[ ~A~])"
	  *html-print-p*
	  (if (integerp (upper-bound self))
	      (upper-bound self)
	    "+INF")
	  (and (relation self) (or (name (relation self)) :UNNAMED))
	  (generate-external-reference (qualification self))) )

(defmethod print-object ((self VALUE-RESTRICTION) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'VALUE-RESTRICTION self))
  (format stream "~:[|FTR|~;~](:all ~S ~A~@[ ~A~])"
	  *html-print-p*
	  (and (relation self) (or (name (relation self)) :UNNAMED))
	  (typecase (value-restriction self)
		(NUMBER (format nil "~S" (value-restriction self)))
		(SET-FEATURE (generate-set-definition-string
			      (value-restriction self) nil))
		(LIST (format nil "~S" (value-restriction self)))
		(otherwise (or (name (value-restriction self)) 
			       ":UNNAMED")))
	  (generate-external-reference (qualification self))) )

(defmethod print-object ((self FILLED-BY-FEATURE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'FILLED-BY-FEATURE self))
  (format stream "~:[|FTR|~;~](:filled-by ~S~{ ~S~})"
	  *html-print-p*
	  (and (relation self) (or (name (relation self)) :UNNAMED))
	  (role-fillers self)) )
(defmethod print-object ((self NOT-FILLED-BY-FEATURE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'NOT-FILLED-BY-FEATURE self))
  (format stream "~:[|FTR|~;~](:not-filled-by ~S~{ ~S~})"
	  *html-print-p*
	  (and (relation self) (or (name (relation self)) :UNNAMED))
	  (non-role-fillers self)) )
(defmethod print-object ((self SET-FEATURE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'SET-FEATURE self))
  (format stream "~:[|FTR|~;~]~A"
	  *html-print-p*
	  (or (generate-set-feature-description self) "???")) )


;;; TO DO: ATTACH :one-way-inverse "dependents" TO THE SLOT "roles":
;;; BUG???: IF COMPARISON-FEATURE IS RECLAIMED, DEPEND-ONS MAY STILL
;;;    POINT TO IT???
(defclass COMPARISON-FEATURE (FEATURE)
  ((relationship :range TBOX-RELATION)
   (roles :range RELATION :collection-p t)
   ))
(defmethod print-object ((self COMPARISON-FEATURE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'COMPARISON-FEATURE self))
  (if (eq (feature-type self) :same-as)
      (format stream "~:[|FTR|~;~](:same-as~{ ~S~})"
	      *html-print-p*
	      (loop for role in (roles self) collect (name role)))
      (format stream "~:[|FTR|~;~](:relates ~S~{ ~S~})"
	      *html-print-p*
	      (name (relationship self))
	      (loop for role in (roles self)
		  collect (if (relation-p role) (name role) role)))) )
(defmacro equivalence-feature-p (self)
  `(eq (feature-type ,self) :same-as) )

(defclass REIFIED-COMPARISON-FEATURE (FEATURE)
  ((relationship :range UNARY-ENTITY)
   (co-references :collection-p t)))
(defmethod print-object ((self REIFIED-COMPARISON-FEATURE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'REIFIED-COMPARISON-FEATURE self))
  (format stream "~:[|FTR|~;~](:exists ~S~{ ~S~})"
	  *html-print-p*
	  (name (relationship self))
	  (loop for coref in (co-references self)
	       collect
	       (list (first coref)
		     (name (second coref))
		     (name (third coref))))) )

(defclass DISJUNCTION-FEATURE (FEATURE)
  ((base-concept :range UNARY-ENTITY)
;; TAKE THE "x" OUT WHEN THIS FEATURE REPLACES THE SLOT "disjuncts":
   (xdisjuncts :range UNARY-ENTITY)))

(defclass COMPUTED-FEATURE (FEATURE)
  ((parameters&body)
   (source-predicate :range LAMBDA-EXPR)
   (source-function :range LAMBDA-EXPR)
   (compiled-predicate :range COMPILED-LAMBDA-EXPR)
   (context-of-feature :range CONTEXT)
   (concept-references :range TBOX-CONCEPT :collection-p t)
   (consequents-of-feature :range TBOX-CONCEPT :collection-p t
			   :one-way-inverse antecedents :allocation :dynamic)
   ))

;; Set if there is a variable in the predicate position, since that means
;;   that the feature is potentially recursive.  Used to determine if recursive
;;   code needs to be generated.
(def-bit-accessor predicate-variable-p tbox-flag :tbox-flag :predicate-variable)

(defmethod print-object ((self COMPUTED-FEATURE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'COMPUTED-FEATURE self))
  (format stream "~:[|FTR|~;~]~S"
	  *html-print-p*
	  `(,(feature-type self) ,@(parameters&body self))) )


  ;;
;;;;;; Relation Concepts
  ;;

(defclass TBOX-RELATION (TBOX-CONCEPT)
  ((concept-or-relation :allocation :class :initform :relation)
   (implied-domain :range UNARY-ENTITY :accessor implied-domains)
   (implied-domains :allocation :none :aliases implied-domain :collection-p t)
   (implied-range :range UNARY-ENTITY)
   (arity :range INTEGER)
   (tuple-index :range LIST :collection-p t
		:context-sensitive-p t)	; TAR 8/25/97
   (if-added-cohorts :range PRODUCTION-COHORT :collection-p t
                     :context-sensitive-p t)
   (if-removed-cohorts :range PRODUCTION-COHORT :collection-p t
                       :context-sensitive-p t)
   ))
(defmethod relative-name ((self TBOX-RELATION))
  (let* ((relationName (name self))
	 (referenceObject (evaluate-identifier relationName :concepts nil)))
    (if (eq self referenceObject)
	relationName
	(generate-extended-identifier relationName *context*)) ))


(defmethod print-object ((self TBOX-RELATION) stream)
           #+:CLTL2(when *print-readably* (print-readably-error 'TBOX-RELATION self))
           (let ((name (if (system-defined-name-p self)
	                 (let ((*expandSystemDefinedConceptsP* t))
		           (declare (special *expandSystemDefinedConceptsP*))
		           (generate-concept-definition self :definition-only-p t))
	                 (or (name self)
		             (getf (cdar (source-definitions self)) :is)
		             (getf (cdar (source-definitions self)) :is-primitive)
		             (let ((relationRef (getf (parsed-expressions self) :definition)))  ; DGB 9/17/91
		               (when relationRef
		                 (if (relation-p relationRef) (name relationRef) relationRef)))
		             :UNNAMED))))
             (if *html-print-p*
               (if (name self)
                 (format stream "~A" (html-reference self))
                 (format stream "~S" name))
	       #+:CLTL2
	       (if (eq name :unnamed)
		   (print-unreadable-object (self stream :identity t)
		     (format stream "|R|~S" name))
		   (format stream "|R|~S" name))
	       #-:CLTL2
               (format stream "|R|~S" name)) ))

(defmacro binary-p (self)
  `(eql (arity ,self) 2) )
(defun computed-p (self)
  (or (auxiliary-lambda-function self)
      (auxiliary-lambda-predicate self)) )

(defclass BINARY-RELATION (TBOX-RELATION) 
  ((loom-concept :allocation :class :initform nil)
   (top-of-hierarchy :allocation :class :initform 'binary-tuple)
   (defined-domain :range UNARY-ENTITY :allocation :dynamic)
   (defined-range :range UNARY-ENTITY :allocation :dynamic)
   (inverse :range BINARY-RELATION :inverse inverse)
   (non-definitional-inverse :allocation :dynamic)
   (components :range BINARY-RELATION :collection-p t :allocation :dynamic)
   (base-relations :range BINARY-RELATION :collection-p t)
   (min-1-restriction :range MIN-RESTRICTION)
   (max-1-restriction :range MAX-RESTRICTION)
   (null-max-restriction :range MAX-RESTRICTION :do-not-reinitialize t)
   (null-value-restriction :range VALUE-RESTRICTION :do-not-reinitialize t)
   (null-filled-by-restriction :range FILLED-BY-FEATURE :do-not-reinitialize t)
   (null-not-filled-by-restriction :range FILLED-BY-FEATURE
				   :allocation :dynamic :do-not-reinitialize t)
   (null-comparison :range COMPARISON-FEATURE
		    :allocation :dynamic :do-not-reinitialize t)
   (phantom-inverse-relation :range PHANTOM-INVERSE-RELATION)
   (roles :allocation :dynamic)
   ;; ABox slots:
;   (role-is-single-valued-p :range FLAG)
;   (role-is-value-restricted-p :range FLAG)
   (more-restrictive-defined-domain :range UNARY-ENTITY :allocation :dynamic)
   (more-restrictive-defined-range :range UNARY-ENTITY :allocation :dynamic)
   (strict-fillers-table :allocation :dynamic :do-not-reinitialize t)
   (default-fillers-table :allocation :dynamic :do-not-reinitialize t)
   (inheritance-link :range BINARY-RELATION :allocation :dynamic)
   (inheritance-method :range SYMBOL :allocation :dynamic)
   (query-indices :collection-p t :allocation :dynamic)
   ))

(def-bit-accessor role-is-single-valued-p tbox-flag :tbox-flag
		  :single-valued)
(def-bit-accessor role-is-value-restricted-p tbox-flag :tbox-flag
		  :value-restricted)
(def-bit-accessor relation-in-computed-restriction-p tbox-flag :tbox-flag 
		  :computed-restriction)
(def-bit-accessor relation-in-equivalence-restriction-p tbox-flag :tbox-flag
		  :equivalence-restriction)

(defmethod restrictions ((self T)) nil)
(defmethod restrictions ((self BINARY-RELATION))
  (let ((result nil))
    (loop for dep in (dependents self)
	  when (typep dep 'RESTRICTION-FEATURE)
	  do (push dep result))
    (loop for dep in (non-tbox-dependents self)
	  when (typep dep 'RESTRICTION-FEATURE)
	  do (pushnew dep result)) 
    result))
(defmethod restrictions ((self DB-INSTANCE))
  (asserted-features self))
(defmethod restrictions ((self INSTANCE-WITH-NEGATION))
  (asserted-features self))

(defmacro single-valued-p (self)
  `(member :single-valued (attributes ,self)) )
(defun referenced-by-role-p (self)
  (member :referenced-by-role (system-attributes self)) )
(defun total-p (self)                   ; PROLOG
  (member :total (attributes self)) )
(defun clipping-enabled-p (self)
  (or (member :clip-roles *loom-match-features*)
      (member :clip-roles (attributes self))) )

(defclass N-ARY-RELATION (TBOX-RELATION)
  ((loom-concept :allocation :class :initform nil)
   (top-of-hierarchy :allocation :class :initform 'n-ary-tuple)
   (key-matches-tuple-p-fn :range COMPILED-LAMBDA-EXPR)
   (merge-updated :allocation :dynamic)
   (previous-index :range HISTORY-INDEX :context-sensitive-p t)
   (null-comparison :range COMPARISON-FEATURE      ; TAR 7/17/98
		    :allocation :dynamic :do-not-reinitialize t)
   ))
(defmacro hashed-relation-p (self)
  `(member :hash-on-domains (attributes ,self)) )


  ;;
;;;;;; Propositions
  ;;

(defclass PROPOSITION (INSTANCE-IN-CONTEXT)
  ((loom-concept :allocation :class)
   (wff :range S-EXPR)
   proposition-operator
   (proposition-arguments :collection-p t)
   (proposition-truth-value :range SYMBOL)
   (depend-ons :collection-p t)
   ))

(defmethod print-object ((self PROPOSITION) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'PROPOSITION self))
  (if (wff self)
    (format stream "|Prop|~S" (wff self))
    (format stream "|Prop|~:[??~*~;~:*(~S~{ ~S~})~]"
            (proposition-operator self) (proposition-arguments self))))


  ;;
;;;;;; Action Classes
  ;;

;; FLAG to bit flags from here?

(defclass ACTION (NAMED-OBJECT)
  ((parameters :range CONCEPT :collection-p t)
   (filters :range SYMBOL :collection-p t)
   (missing-method-option :range SYMBOL)
   (methods :range LOOM-METHOD :collection-p t)
   (methods-can-fail :range FLAG)
   (dependent-productions :range PRODUCTION :collection-p t)
   (pre-conditions :range PATTERN)
   (post-conditions :range PATTERN)
   (trace-enabled-p :range FLAG)
   (context :range CONTEXT :do-not-reinitialize t)
   )) 
(defmethod print-object ((self ACTION) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'ACTION self))
  (format stream "|ACTION|~S" (or (name self) :UNNAMED)) )	; DGB 11/26/90

(defclass TACTIC ()
  ((action :range ACTION)
   (title :range STRING)
   (situation-pattern :range PATTERN :one-way-inverse dependents)
   (compiled-situation-test :range COMPILED-LAMBDA-EXPR)
   (less-specific-methods :range TACTIC :collection-p t)
   (less-preferred-methods :range TACTIC :collection-p t)
   (marked-p :range FLAG)
   (overrides :range TACTIC :collection-p t :inverse overridden-by)
   (overridden-by :range TACTIC :collection-p t)
   (context :range CONTEXT :do-not-reinitialize t)
   ))
(defclass LOOM-METHOD (TACTIC)
  ((lambda-expression :range LAMBDA-EXPR)
   (compiled-method :range COMPILED-LAMBDA-EXPR)
   ))

(defclass PLAN (TACTIC)
  ()) 
 
(defmethod print-object ((self TACTIC) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'TACTIC self))
  (format stream "|~A|~S-~S"
	  (typecase self
	    (LOOM-METHOD "METHOD")
	    (PLAN "PLAN"))
	  (name (action self))
	  (or (title self) :UNTITLED)) )


  ;;
;;;;;; Production Classes
  ;;

(defclass PRODUCTION (NAMED-OBJECT)
  ((source-query :range S-EXPR)
   (action-verb :range SYMBOL)
   (action :range ACTION)
   (action-parameters :range S-EXPR)
   (production-cohorts :range PRODUCTION-COHORT :inverse primary-production
		       :collection-p t)
   (priority :range SYMBOL)
   (compiled-do-action :range COMPILED-LISP-EXPR)
   (output-binding-sets :range LIST :collection-p t 
                        :context-sensitive-p :non-inheriting)
   (context :range CONTEXT :do-not-reinitialize t)
   ))
(defmethod print-object ((self PRODUCTION) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'PRODUCTION self))
  (format stream "|PRODUCTION|~S" 
	  (name self)) )

(defclass PRODUCTION-COHORT ()
  ((primary-production :range PRODUCTION)
   (cohort-predicate :range TBOX-CONCEPT)
   (transition-indicator :range SYMBOL)
   (cohort-query :range S-EXPR)			; FOR DEBUGGING ONLY
   (compiled-cohort-query :range COMPILED-LAMBDA-EXPR)
   (stored-input-binding-sets :collection-p t 
                              :context-sensitive-p :non-inheriting)
   ))
(defmethod print-object ((self PRODUCTION-COHORT) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'PRODUCTION-COHORT self))
  (format stream "|COHORT|~S~S"
	  (name (primary-production self))
	  `(,(transition-indicator self) ,(cohort-predicate self))))

(defclass MONITOR (PRODUCTION)
  ((rete-node :range RETE-ANCHOR-NODE
	      :do-not-reinitialize t
              :allocation :dynamic
              :context-sensitive-p nil)
   ))
(defmethod print-object ((self MONITOR) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'MONITOR self))
  (format stream "|MONITOR|~S" 
	  (name self)) )


  ;;
;;;;;; Pattern classes
  ;;

(defclass PATTERN (CLASSIFIABLE-OBJECT)
  ((source-query :range S-EXPR)
   (input-variables :range S-EXPR)
   (normalized-query :range S-EXPR)
   (pattern-variables :range PATTERN-VARIABLE :collection-p t)
   (pattern-residue :range S-EXPR)
   (compiled-query :range COMPILED-LAMBDA-EXPR)
   (concept-references :range TBOX-CONCEPT :collection-p t)
   ))
(defmethod print-object ((self PATTERN) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'PATTERN self))
  (format stream "|PATTERN|~S" 
	  (source-query self)) )

(defclass GOAL (PATTERN)
  ())


  ;;
;;;;;; Tasks
  ;;

(defclass TASK ()
  ((action :range ACTION)
   (arguments)
   (goal-predicate :range GOAL-PATTERN)
   (value)
   (success-p :range FLAG)
   (undoable-p :range FLAG)
   (status :range SYMBOL)			; :pending :suspended :completed :killed
   (priority :range SYMBOL)			; :high :low
   (super-task :range TASK :inverse sub-tasks)
   (sub-tasks :range TASK :collection-p t)
;   (non-suspendable-p :range FLAG)  ;; THIS IS JUST AN IDEA
   ))
(defmethod print-object ((self TASK) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'TASK self))
  (format stream "|TASK|~S"
	  (if (action self)
	      `(,(name (action self)) ,@(arguments self))
	      `(,(goal-predicate self) ,@(arguments self)))) )



;;; Now that all KBCLASSES classes have been defined, complete any uncompleted
;;;    classes:
(KBCLASSES::finalize-class-sublattice (KBCLASSES::get-class 'LOOM-OBJECT))


  ;;
;;;;;; LOOM Knowledge Bases, Contexts, and Worlds
  ;;

(def-class KNOWLEDGE-BASE (NAMED-OBJECT INSTANCE-IN-CONTEXT)
  ((loom-concept :allocation :class :initform nil) 
   parent-kbs
   child-kbs
   kb-package-name
;   export-names-p   OBSOLETE
   path-name
   contexts
   kb-creation-policy
   ))
(defmethod print-object ((self KNOWLEDGE-BASE) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'KNOWLEDGE-BASE self))
  (format stream "|K|~S" (identifier self)) )

(defmethod object-name  ((self KNOWLEDGE-BASE))
  (identifier self))




(def-bit-flags :context-flag
    :monotonic				; Replaces monotonic-mode-p
  :theory				; Replaces 5 Types in type-of-context
  :workspace
  :world
  :island
  :bottom
  :locked				; Replaces locked-p (not used)
  :open-world				; Replaces open-closed-mode
  :initialized				; Replaces overloaded use of type slot for 
					;  detecting preexisting contexts.
  )

;; What about INSTANCE-IN-MATCH-NETWORK, CONTEXT-SENSITIVE-INSTANCE ??
(def-class CONTEXT (NAMED-OBJECT INSTANCE-WITH-INVERSES INSTANCE-WITH-DYNAMIC-SLOTS
				 INSTANCE-WITH-CONCEPTS)
  ((loom-concept :allocation :class :initform nil)
   ctxt                                 ; low level ctxt object ;TAR 11/19/93
   (context-flag :initform 0)
   parent-contexts
   child-contexts
   context-precedence-list
   context-partitions
   namespace-cache
   instantiation-class
   saved-history-variables              ; Holds history variables while this
                                        ; ... is not the current context.
   ))

(defmethod monotonic-mode-p ((self CONTEXT))
  (with-speed
      (test-bit-flags (context-flag self) :context-flag :monotonic)))

(defmethod open-closed-mode ((self CONTEXT))
  (with-speed
      (if (test-bit-flags (context-flag self) :context-flag :open-world)
	  :open
	:closed)))

(defmethod (setf open-closed-mode) (newValue (self CONTEXT))
  (declare (optimize (speed 3) (safety 0) (debug 0) (space 0)))
  (case newValue
    (:open (set-bit-flags (context-flag self) :context-flag :open-world))
    (:closed (clear-bit-flags (context-flag self) :context-flag :open-world))
    (t (grumble "OPEN-CLOSED-MODE values should only be :OPEN or :CLOSED: ~S~%
Leaving value as ~S"
		newValue
		(open-closed-mode self))))
  newValue)

(defmethod type-of-context ((self CONTEXT))
  (declare (optimize (speed 3) (safety 0) (debug 0) (space 0)))
  (cond ((test-bit-flags (context-flag self) :context-flag :theory)
	 :theory)
	((test-bit-flags (context-flag self) :context-flag :workspace)
	 :workspace)
	((test-bit-flags (context-flag self) :context-flag :world)
	 :world)
	((test-bit-flags (context-flag self) :context-flag :island)
	 :island)
	((test-bit-flags (context-flag self) :context-flag :bottom)
	 :island)
	(t nil)))

(defmethod (setf type-of-context) (newValue (self CONTEXT))
  (declare (optimize (speed 3) (safety 0) (debug 0) (space 0)))
  (case newValue
    (:theory
     (clear-bit-flags (context-flag self) :context-flag 
		      :theory :workspace :world :island :bottom)
     (set-bit-flags (context-flag self) :context-flag :theory))
    (:workspace
     (clear-bit-flags (context-flag self) :context-flag 
		      :theory :workspace :world :island :bottom)
     (set-bit-flags (context-flag self) :context-flag :workspace))
    (:world
     (clear-bit-flags (context-flag self) :context-flag 
		      :theory :workspace :world :island :bottom)
     (set-bit-flags (context-flag self) :context-flag :world))
    (:island
     (clear-bit-flags (context-flag self) :context-flag 
		      :theory :workspace :world :island :bottom)
     (set-bit-flags (context-flag self) :context-flag :island))
    (:bottom
     (clear-bit-flags (context-flag self) :context-flag 
		      :theory :workspace :world :island :bottom)
     (set-bit-flags (context-flag self) :context-flag :bottom))
    (t (grumble "TYPE-OF-CONTEXT values should only be :THEORY, :WORKSPACE, :WORLD or :ISLAND: ~S~%Leaving value as ~S"
		newValue
		(type-of-context self)))
    )
  newValue)

(def-bit-accessor locked-p context-flag :context-flag :locked)

(defmethod context-identifier ((self CONTEXT))
  (name self) )
(defmethod print-object ((self CONTEXT) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'CONTEXT self))
  (if *html-print-p*
    (format stream "~A" (html-reference self))
    (progn 
      (format stream 
              (case (type-of-context self)
                (:theory "|TH|~S")
                (:workspace "|WS|~S")
                (otherwise "|CXT|~S"))
          (name self))
      #+:ISI(when *print-escape*            ; Internal use for debugging!
              (format stream "_[~D]" (safe-ctxt-number (ctxt self)))))) )
#-(or TI Symbolics)
(defmethod (setf name) (newValue (self CONTEXT))
  ;; WORKAROUND FOR ALIASED-SLOT PROBLEM IN PCL UNDER LUCID;
  ;; When a new PCL is released, try writing and reading the "name"
  ;;    slot to see if this patch is still necessary;
  (setf (slot-value self 'name) newValue) )
(defun theory-p (context)
  (with-speed
      (test-bit-flags (context-flag context) :context-flag :theory)) )
(defun workspace-p (context)
  (with-speed
      (test-bit-flags (context-flag context) :context-flag 
		      :or :workspace :world :island)) )
(defun world-p (context)
  (with-speed
      (test-bit-flags (context-flag context) :context-flag :world)) )
(defun bottom-p (context)
  (with-speed
      (test-bit-flags (context-flag context) :context-flag :bottom)) )
    
(defclass THEORY-CONTEXT (CONTEXT)
  ())
(defclass WORKSPACE-CONTEXT (CONTEXT)
  ())
(defclass ISLAND-CONTEXT (WORKSPACE-CONTEXT)
  ())
(defclass BOTTOM-CONTEXT (CONTEXT)
  ())

(def-class CONTEXT-PARTITION ()
  ((partition-identifier :accessor key)
   name-space
   anonymous-objects
   ))


;;;; TI COMPATIBILITY HACK:
;;;;   This is needed to avoid some trips to the debugger when TI class
;;;;   slots are not properly available yet:

#+TI(defmethod loom-concept ((self T)) nil)

  ;;
;;;;;; "loom-constant"
  ;;
  
;;; Macro for defining global variables containing pointer to objects
;;;    at or above BUILT-IN-CXT.  Used within LOOM code to point
;;;    at system-defined constant objects.
  
(defmacro loom-constant (identifier)
  ;; Expand to a variable pointing to the object bound to
  ;;    BUILT-IN-CXT^<identifier>;
  (let ((symbol (symbol-append ("BUILT-IN-THEORY^" identifier) "LOOM")))
    (proclaim `(special ,symbol))
    symbol ))

