;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

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

;;; BUILT-IN.LISP (TBOX)

(in-package "LOOM")

(export '(LOOM-THING define-measurement-concept))    ; Override non-export of :system-defined concepts

(defun load-built-in-concepts ()
  ;; Define set concepts and operators that populate the Loom built-in
  ;;    context;
  (change-context 'BUILT-IN-THEORY)

  (load-arithmetic)

  (defrelation name :domain Thing
    :characteristics (:non-exported :single-valued :read-only))
  (defrelation okbc-pretty-name :range string
	       :characteristics (:single-valued))
  (defrelation concept-name :domain Meta-Thing
    :characteristics (:non-exported :single-valued :read-only))
  (defrelation relation-name :domain Meta-Thing
     :characteristics (:non-exported :single-valued :read-only))
  (defrelation background-package-name :domain context :range string
	       :characteristics (:single-valued))
  (defrelation background-file-name :domain context :range string
	       :characteristics (:single-valued))
  (defrelation parents :characteristics (:non-exported :multiple-valued))
  (defrelation arity :characteristics (:single-valued :read-only)
	       :function arity)
  (defrelation roles :characteristics (:multiple-valued :read-only))
  (defrelation characteristics :characteristics (:multiple-valued :read-only))
  (defrelation documentation "Documentation string for Loom objects."
	       :domain Thing
	       :range string)
  (defrelation built-in-documentation "Lisp built-in documentation"
	       :is-primitive documentation
	       :domain Meta-Thing
	       :function ((c) (typecase c
				(SYMBOL (documentation c 'variable))
				(TBOX-RELATION (documentation (name c) 'variable))
				(TBOX-CONCEPT (documentation (name c) 'type))
				(t nil))))
	       

  (defconcept CONS-OR-NULL
    :is-primitive Constant
    :predicate listp)

  ;; Knowledge Bases and Contexts:

  (defconcept Knowledge-Base
    :roles ((name :function name)
            (parents :function parent-kbs))
    :implies (:and (:the name Symbol)
                       (:all parents Knowledge-Base))
    :existing-class-name Knowledge-Base)

  (defconcept Context
    :roles ((name :function name)
            (parents :function parent-contexts))
    :implies (:and (:the name Symbol)
                       (:all parents Context))
    :existing-class-name Context
    :function list-contexts)

  (defrelation parent-context :domain context :range context
               :function parent-contexts
	       :characteristics :multiple-valued)
  (defrelation child-context :domain context :range context
               :function ((context) (loop for c in (child-contexts context)
                                          when (ctxt c)         ; Don't return BOTTOM-THEORY!
					collect c))
	       :characteristics :multiple-valued)
  (defrelation ancestor-context :domain context :range context
               :function ((context) (cdr (context-precedence-list context)))
	       :characteristics :multiple-valued)
  (defrelation descendant-context :domain context :range context
               :function generate-context-subtree
	       :characteristics :multiple-valued)
  (defrelation home-context :range Context :function context)

  ;; Collections, and Sets:

  (defrelation members
    :domain Collection
    :characteristics (:multiple-valued :read-write :closed-on-constants))

  (defconcept Collection
    :roles (members 
            count))

  (defconcept Set
    :is-primitive Collection
    :roles (members
            member-type
            (cardinality :function ((?self) (length (members ?self))))
;; CAN'T GENERATE ROLE ACCESSOR HERE:
;            (count :function ((?self) (length (members ?self))))
            )
    :mixin-classes CLOS-INSTANCE )

  (defconcept List
    :is (:and Cons-Or-Null Collection)
    :roles (members
;; CAN'T GENERATE ROLE ACCESSOR HERE:
;            (count :function length)
;            (length :function length) ; Can't make this a method!!
            ;; this is for Loom's use only:
	    (cardinality :function length))
    :existing-class-name LIST
    :predicate listp)

  (defrelation list-members 
      :domain list
      :is (:and members (:domain list))
      :function ((x) (when (listp x) (identity x)))
      :characteristics (:non-exported :multiple-valued))

  (defrelation member-of
    :is (:inverse members)
    :range Collection
    :predicate ((?item ?collection)
                (member ?item (compute-members-of-instance ?collection)
                        :test #'filler-equal)))

  (defrelation cardinality
    :domain (:or Collection Role) :range Integer
    :characteristics (:read-only :single-valued :closed-on-constants)) ; TAR 10/26/93

  (defrelation subset
    :domain Set :range Set
    :predicate ((set1 set2) (subset-of-set-p set1 set2)))
  (defrelation same-as
    :is-primitive subset
    :characteristics (:symmetric :perfect :read-only)
    :function ((arg1) arg1)
    :predicate ((arg1 arg2) (same-as-p arg1 arg2)))

  ;; Asserted within "detect-incoherence-p":
  ;; TO DO: MAKE THIS A PROPERTY:
  (defconcept Incoherent
    :function (() (list-current-local-instances (loom-constant Incoherent)))    ; TAR 8/13/93
    :predicate ((?self) (let ((types (find-type&residue-features ?self)))
                          (and (consp types)
			       (member (loom-constant INCOHERENT) types)) )) )
  ;; Asserted within "update-time-line":
  (defconcept Temporal-Incoherent	; TAR 8/18/93
      :characteristics (:temporal :read-only)) ;Does :read-only do anything here?
  (defrelation incoherence-reason "This relation is used to hold strings describing why a concept or classified instance became incoherent.")
  
  (defproperty Badly-Defined            ;  TAR 7/19/94
    :function (() (remove :bad-definition 
                          (generate-instances (loom-constant Meta-Thing))
                          :key #'system-attributes :test-not #'member))
    :predicate bad-definition-p
    :domain Meta-Thing)

  ;; Old Style Reified Relations

  (defconcept A-Reified-Relation
     :implies (:and (:at-least 1 domain)
                    (:at-least 1 range)))
  (defrelation domain)
  (defrelation range)

  ;; New Style Reified Relations
  
  (defconcept reification)
  
  (defrelation target-role :characteristics :single-valued)
  (defrelation source-role :characteristics :single-valued)
  (defrelation target-case :characteristics (:single-valued :perfect))
  (defrelation source-case :characteristics (:single-valued :perfect))
  
  (defrelation reifies)
  (defrelation reified-by :is (:inverse reifies)
	       :characteristics :single-valued)
  (defrelation link-object :characteristics :non-exported)
  
  (defrelation link :arity 4 :function get-link)

  );; end "load-built-in-concepts"


(defun load-type-conversions ()

  ;; Type conversion relations
  (defrelation rational-float
      "Relates a rational number to its floating point approximation"
    :domain rational-number
    :range floating-point-number
    :function float)
  (defrelation float-rational 
      "Relates a floating point number to its best rational value"
    :is (:inverse rational-float)
    :domain floating-point-number
    :range rational-number
    :function rationalize)

  ;; Rounding functions
  (defrelation numeric-ceiling
      "Relates a number to the next highest integer (including itself)"
    :domain number
    :range integer
    :function ceiling)
  (defrelation numeric-floor
      "Relates a number to next lowest integer (including itself)"
    :domain number
    :range integer
    :function floor)
  (defrelation numeric-round
      "Relates a floating point number to its best rational value"
    :domain number
    :range integer
    :function round)
  )


#-:measures
(defun load-arithmetic ()
    ;; Lattice of Numeric-comparison Operators

;; TO DO: REWRITE THESE TO WORK WITH SYMBOLIC-SCALARS ALSO:
;;        THEN MODIFY THEIR DOMAINS!
  
  (defrelation >= 
    :domain Number :range Number
    :characteristics (:perfect :read-only)
    :predicate >= )
  (defrelation <= :is (:inverse >=)
    :domain Number :range Number
    :predicate <=)
  ;; "/=" is defined to work with everything, not just scalars:
  (defrelation /=
    :characteristics (:symmetric :perfect)
    :predicate ((arg1 arg2) (not (filler-equal arg1 arg2))) )
  (defrelation <> :is /=)
  (defrelation >
    :domain Number :range Number
    :is (:and /= >=)
    :predicate >
    :characteristics (:perfect :read-only))
  (defrelation < :is (:inverse >)
    :domain Number :range Number
    :predicate <)
  ;; "=" is defined to work with everything, not just scalars:
  (defrelation =
    :is (:and >= <=)
    :function ((arg1) arg1)
    :predicate filler-equal
    :characteristics (:symmetric :perfect :read-only))
  
  ;; Arithmetic
  
  (defrelation +
    :arity 3
    :domains (Number Number) :range Number
    :characteristics (:commutative :perfect)
    :function +)
  (defrelation -
    :arity 3
    :domains (Number Number) :range Number
    :characteristics :perfect
    :function -)
  (defrelation *
    :arity 3
    :domains (Number Number) :range Number
    :characteristics (:commutative :perfect)
    :function *)
  (defrelation /
    :arity 3
    :domains (Number Number) :range Number
    :characteristics (:perfect)
    :function /)
  (defrelation max
    :domain Collection :range Number
    :function ((?numbers) (and ?numbers (apply (function max) ?numbers))))
  (defrelation min
    :domain Collection :range Number
    :function ((?numbers) (and ?numbers (apply (function min) ?numbers))))

  (defrelation sum
    :domain Collection  :range Number
    :function ((?numbers) (and ?numbers (loop for i in ?numbers sum i))))
  (defrelation count
    :domain Collection  :range Number
;; REMOVE THIS WHEN WE RESOLVE THE PACKAGE PROBLEM WHEN count ROLES
    ;;    DEFINE THEIR OWN LOCAL PREDICATES (METHODS):     RMM 8/13/93
    :function ((?set) (first (retrieve ?r (cardinality ?set ?r))))
    :characteristics :closed-on-constants
    )
  ) ;; End load-arithmetic


;; TO DO:  CREATE SET-FEATURES OF -INFINTY..INFINITY AND LINK THEM
;;  IN PROPERLY, SIMILAR TO THE CODE IN tbox/sets.lisp.
#+:measures
(defun define-one-measurement-concept (name primId measureObject)
  ;; Helping function for 'define-measurement-concepts' 
  ;;   and 'define-measurement-concept';
  ;; Defines a concept named "name" which matches measurements with
  ;;   primitive ID "primId".  Corresponds to internal measure object
  ;;   "measureObject", which may be NIL.
  (define-concept name
      :is-primitive 'MEASURE
      :predicate `((x) (and (ms:dim-number-p x)
			    (eql (ms::dim-prim-id x) ,primId)))
      :characteristics '(:perfect :monotonic)
      :annotations `(measurement-concept
		     ,@(when measureObject
			 `((measure-object ',measureObject)))))
	    )

#+:measures
(defun define-measurement-concepts ()
  ;; Define measurement concepts for all measures in the system and
  ;;   link them to their underlying implementation object.
  (loop for m in (ms::list-all-measures)
      do (define-one-measurement-concept 
	     (intern (format nil "~A-MEASURE" (MS::ms-name m)) "LOOM")
	     (ms::ms-prim-id m)
	     m)) )

#+:measures
(defun define-measurement-concept (name example &key dont-define-synonym-p)
  "Define a measurement concept named `name' based on an example of
a dimensioned quantity `example'.  If there is an existing measurement
concept that includes `example', then a synonym for that concept is defined
unless `:dont-define-synonym-p' is non-NIL.  The default is to define a synonym.
Returns the measurement concept for `example'."
  ;; Returns:
  ;;  If "example" is not a dimensioned quantity, then a warning is printed and NIL
  ;;    is returned.  In all other cases, a measurement concept is returned --  either
  ;;    the existing one or a new one.
  ;;  Note that if a synonym is defined, it will eventually be merged
  ;;  with the existing measurement concept.
  (if (ms:dim-number-p example)
      (progn 
	(loop for sc in (get-subconcepts (loom::loom-constant MEASURE)
					 :proper-p t)
	    when (has-instance-p sc example)
	    return (if dont-define-synonym-p
		       sc
		     (define-concept name :is sc)))
	(define-one-measurement-concept name (ms::dim-prim-id example) nil))
    (progn 
      (grumble "Example ~A needs to be a dimensioned quantity for this to work" example)
      nil)) )

#+:measures
(defun load-arithmetic ()

  ;; Lattice of Numeric-comparison Operators

;; TO DO: REWRITE THESE TO WORK WITH SYMBOLIC-SCALARS ALSO:
;;        THEN MODIFY THEIR DOMAINS!
  
  (defrelation >= 
    :domain Number :range Number
    :characteristics (:perfect :read-only)
    :predicate ms:dim>= )
  (defrelation <= :is (:inverse >=)
    :domain Number :range Number
    :predicate ms:dim<=)
  ;; "/=" is defined to work with everything, not just scalars:
  (defrelation /=
    :characteristics (:symmetric :perfect)
    :predicate ((arg1 arg2) (not (filler-equal arg1 arg2))) )
  (defrelation <> :is /=)
  (defrelation >
    :domain Number :range Number
    :is (:and /= >=)
    :predicate ms:dim>
    :characteristics (:perfect :read-only))
  (defrelation < :is (:inverse >)
    :domain Number :range Number
    :predicate ms:dim<)
  ;; "=" is defined to work with everything, not just scalars:
  (defrelation =
    :is (:and >= <=)
    :function ((arg1) arg1)
    :predicate filler-equal
    :characteristics (:symmetric :perfect :read-only))
  
  ;; Arithmetic
  
  (defrelation +
    :arity 3
    :domains (Number Number) :range Number
    :characteristics (:commutative :perfect)
    :function ms:dim+)
  (defrelation -
    :arity 3
    :domains (Number Number) :range Number
    :characteristics :perfect
    :function ms:dim-)
  (defrelation *
    :arity 3
    :domains (Number Number) :range Number
    :characteristics (:commutative :perfect)
    :function ms:dim*)
  (defrelation /
    :arity 3
    :domains (Number Number) :range Number
    :characteristics (:perfect)
    :function ms:dim/)
  (defrelation max
    :domain Collection :range Number
    :function ((?numbers) (and ?numbers (apply (function ms:dim-max) ?numbers))))
  (defrelation min
    :domain Collection :range Number
    :function ((?numbers) (and ?numbers (apply (function ms:dim-min) ?numbers))))

  (defrelation sum
    :domain Collection  :range Number
    :function ((?numbers) (and ?numbers (apply (function ms:dim+) ?numbers))))
  (defrelation count
    :domain Collection  :range Number
;; REMOVE THIS WHEN WE RESOLVE THE PACKAGE PROBLEM WHEN count ROLES
;;    DEFINE THEIR OWN LOCAL PREDICATES (METHODS):     RMM 8/13/93
    :function ((?set) (first (retrieve ?r (cardinality ?set ?r)))))
  
  (defrelation unit-unit
      :domain MEASURE
      :range STRING
      :function unit-unit
      :characteristics (:single-valued))
  
  (defrelation unit-magnitude
      :domain MEASURE
      :function unit-magnitude
      :characteristics (:single-valued))

  (defrelation unit-magnitude-as
      "(unit-value-as Measure UnitString Number) Relates a Measure to its magnitude in the given unit
as long as `Measure' and `UnitString' are compatible."
      :arity 3
      :domains (MEASURE STRING)
      :range Number
      :function unit-value-as)
  
  (defrelation dimensioned-number
	"(dimensioned-number Quantity UnitString Measure) Relates a Measure to a `Quantity' in the given unit
as long as `Quantity' is either a Number, or it and `UnitString' are compatible."
      :arity 3
      :domains (Quantity String)
      :range MEASURE
      :function dimensioned-number)
  
  (defrelation measure-object
      :domain MEASUREMENT-CONCEPT
      :characteristics (:single-valued :non-exported))

  (defrelation units
      :domain MEASUREMENT-CONCEPT
      :range STRING
      :function units
      :characteristics (:multiple-valued))
  
  (defrelation base-unit
      :domain MEASUREMENT-CONCEPT
      :range STRING
      :function base-unit
      :characteristics (:single-valued))
    
    ;; Define <x>-MEASURE concepts for all defined Units...
  (define-measurement-concepts)
  ) ;; End load-arithmetic (Measures Version)

(defun load-meta-things ()
  ;; Define meta-things that populate the Loom built-in context; 
  (change-context 'BUILT-IN-THEORY)

  ;; THIS SHOULD BE A PROPERTY, BUT PROPERTIES CAN'T HAVE ROLES!!!
  ;; BUG: COMPUTED ROLES DON'T WORK IF THERE IS NO SHADOW CLASS:
  (defconcept Loom-Thing
    :roles ((xidentifier :function identifier)
            (xtype :function find-type&residue-features)
;; REDEFINE "types", "asserted-concepts", and "cached-concepts" AS RELATIONS,
;;    NOT AS ROLES!!!:
;            (types
;             :function ((?self) (find-named-superconcepts-of-supers
;                                 (execute-query
;                                  (compute-more-specific-type ?self :backward-chaining-p t)))))
;            (asserted-concepts 
;             :function ((?self) (find-named-superconcepts-of-supers
;			         (loop for entry in (conjuncts-table ?self)
;			              when (assertion-p (cdr entry))
;			              collect (car entry)))))
;            (cached-concepts :function ((?self) (find-named-superconcepts-of-supers 
;			                         (db-type ?self))))
            )
    :implies (:and (:the xidentifier Symbol)
                       (:the xtype Concept)
;                       (:all types Concept)
;                       (:all asserted-concepts Concept)
;                       (:all cached-concepts Concept)
                       )
    :characteristics :system-defined
    :predicate ((?self) (typep ?self '(or BASIC-INSTANCE CLOS-INSTANCE))) )

  ;; THIS REDEFINES A CONCEPT DEFINED IN "sets.lisp" AND CAUSES EVERYTHING TO BREAK:
;  (defproperty Non-Loom-Thing :is (not Loom-Thing))
  
  ;; the-relation

  (defrelation the-relation
    :arity 3
    :domains (THING INTEGER) :range Meta-Thing
    :function the-relation )
  
  (defrelation the-context
    :domain THING :range Context
    :function the-context )

  (defrelation the-instance
    :domain THING
    :function the-instance )

  ;; TO DO: REDEFINE THIS TO INCLUDE ROLES (BUT THEN THERE WOULD BE NO ASSOCIATED CLOS
  ;;    CLASS, AND THE ROLES DEFINED BELOW WOULD NOT BE APPROPRIATE):
  ;; VERY BAD: DEFINING "name" WITH :function OPTION EFFECTIVELY BARS
  ;;    OTHER CONCEPTS FROM USING THAT ROLE NAME:
  (defconcept Meta-Thing
    :roles (;(name :function name)  ;; RMM 5/2/95
            (concept-name :function name)
            (relation-name :function name)
            (arity :function arity)
            (characteristics :function ((?self) (attributes ?self))))
    :implies (:and (:all roles Role)
                   (:the name Symbol)
                   (:all properties Symbol))
    :predicate ((x) (typep x 'TBOX-CONCEPT))
    :function (() (let ((result nil))
		    (loop for ctxt in (context-precedence-list *context*)
			do (do-context (c ctxt :partitions (:concepts :relations))
			     (push c result)))
		    result))
    :existing-class-name TBOX-CONCEPT
    :partitions $META-PARTITION$ )
  
  (defconcept Concept-or-Property
    :is (:or Concept Property)
    :roles (properties
;            (restrictions :function restrictions)
;            (components :function ((?self) 
;                                   (append (restrictions ?self)
;                                           (comparisons ?self)
;                                           (computed-features ?self))))
            )
;    :implies (:all restrictions Restriction)
    )

  (defconcept Concept
    :is-primitive Meta-Thing
    :roles ((roles :function get-roles)
	    (restrictions :function restrictions)
            (instances :function
	               ((?self)
	                (let ((set (defined-set-feature ?self)))
	                  (if set
		            (typecase set
		              (SYMBOLIC-INTERVAL (symbols set))
		              (SET-FEATURE (members set)))
		            (generate-instances ?self))))))
    :annotations ((archetype THING))
    :existing-class-name UNARY-CONCEPT
    :predicate concept-p
    :function (() (let ((result nil))
		    (loop for ctxt in (context-precedence-list *context*)
			do (do-context (c ctxt :partitions :concepts)
			     (unless (property-p c)
			       (push c result))))
		    result))
    :in-partition $META-PARTITION$)
  
    (defrelation instances :characteristics :multiple-valued) ;; override :single-valued inference

    (defrelation restrictions :domain thing
		 :function restrictions
		 :characteristics :multiple-valued)

    (defconcept Restriction
      :roles ((relation :function relation)
	      (qualification :function qualification)
              (value-type :function ((?self) (when (typep ?self 'VALUE-RESTRICTION)
					       (value-restriction ?self))))
              (min-cardinality :function ((?self) (when (typep ?self 'MIN-RESTRICTION)
						    (lower-bound ?self))))
              (max-cardinality :function ((?self) (when (typep ?self 'MAX-RESTRICTION)
						    (upper-bound ?self))))
              (direct-dependents
	       :function ((?self) 
			  (let ((result nil))
			    (loop for dep in (dependents ?self)
				when (concept-p dep) do (push dep result))
			    (loop for dep in (non-tbox-dependents ?self)
				when (concept-p dep) do (push dep result))
			    result))) )
      :implies (:and (:the relation Relation)
                         (:the value-type Concept)
                         (:the min-cardinality Integer)
                         (:the max-cardinality Integer)
                         (:all direct-dependents Concept))
      :existing-class-name RESTRICTION-FEATURE
      :predicate ((?self) (typep ?self 'RESTRICTION-FEATURE)) )
    
      (defrelation min-cardinality 
	  :characteristics (:single-valued))
      (defrelation max-cardinality
	  :characteristics (:single-valued))
      (defrelation qualification
	  :characteristics (:non-exported :single-valued))

    (defrelation direct-dependents :characteristics :multiple-valued) ;; override :single-valued inference


  (defconcept value-restriction
    :is-primitive restriction
    :characteristics :perfect
    :existing-class-name Value-Restriction
    :predicate ((?r) (typep ?r 'VALUE-RESTRICTION)) )
  (defconcept min-restriction
    :is-primitive restriction
    :characteristics :perfect
    :existing-class-name Min-Restriction
    :predicate ((?r) (typep ?r 'MIN-RESTRICTION)) )
  (defconcept max-restriction
    :is-primitive restriction
    :characteristics :perfect
    :existing-class-name Max-Restriction
    :predicate ((?r) (typep ?r 'MAX-RESTRICTION)) )



  #+:measures
  (defconcept measurement-concept :is-primitive concept
    :constraints (:exactly 1 measure-object))

  (defconcept Meta-Concept
    :roles ((archetype :type CONCEPT)))

  (defrelation archetype :domain Meta-Concept :range Concept)

  ;; BUG: (ask (Property Non-Loom-Thing)) RETURNS NIL:
  (defconcept Property
    :is-primitive Meta-Thing
    :roles ((domain :function implied-domain))
    :implies (:the domain Concept)
    :existing-class-name UNARY-RELATION
    :predicate property-p
    :function (() (let ((result nil))
		    (loop for ctxt in (context-precedence-list *context*)
			do (do-context (c ctxt :partitions :concepts)
			     (when (property-p c)
			       (push c result))))
		    result))
    :in-partition $META-PARTITION$)

  (defconcept Relation
    :is-primitive Meta-Thing
    :roles ((domain :function implied-domain)
            (range :function implied-range)
            (inverse :function ((?self) (when (typep ?self 'BINARY-RELATION)
                                          (inverse ?self)))))
    :implies (:and (:the domain Concept)
		   (:the range Concept))
    :existing-class-name TBOX-RELATION
    :predicate relation-p
    :function (() (let ((result nil))
		    (loop for ctxt in (context-precedence-list *context*)
			do (do-context (c ctxt :partitions :relations)
			     (push c result)))
		    result))
    :in-partition $META-PARTITION$)

   ;; Note:  The direct-{sub/super}relations do not have a predicate form because
   ;;    we would need to check for the named attribute anyway.  Otherwise the predicate
   ;;    would exclude items returned by the function.  For the non-direct cases, the
   ;;    predicate allows more in than would be returned by the function, but that is
   ;;    considered acceptable behavior.
 (defrelation direct-subrelations
    :characteristics (:multiple-valued :read-only)
    :domain Meta-Thing :range Meta-Thing
    :function ((?self)
	       (find-named-subconcepts-of-subs (sub-concepts ?self))))
  (defrelation direct-superrelations
    :is (:inverse direct-subrelations)
    :characteristics (:multiple-valued :read-only)
    :function ((?self)
	       (find-named-superconcepts-of-supers (super-concepts ?self))))
  (defrelation subrelations
      :characteristics (:multiple-valued :read-only)
      :domain Meta-Thing :range Meta-Thing
      :function get-subrelations)
  
  (defrelation superrelations
      :is (:inverse subrelations)
      :characteristics (:multiple-valued :read-only)
      :domain Meta-Thing :range Meta-Thing
      :function get-superrelations)

  (defrelation proper-subrelations
    :characteristics (:multiple-valued :read-only)
    :domain Meta-Thing :range Meta-Thing
    :function ((?self) (let ((visibleContexts (context-precedence-list *context*)))
                         (append-transitively 
			  ?self sub-concepts 
			  (lambda (sub) 
			    (unless (or (eq sub ?self)
					(system-defined-name-p sub)
                                        (not (member (context sub)    ;  TAR 1/9/95
                                                     visibleContexts)))
			      (list sub)))
			  :use-pass-counter t)))
    :predicate ((super sub) (member super (all-super-concepts sub))))    
  (defrelation proper-superrelations
    :is (:inverse proper-subrelations)
    :characteristics (:multiple-valued :read-only)
    :function ((?self) (remove-system-named-concepts (all-super-concepts ?self)))
    :predicate ((sub super) (member super (all-super-concepts sub))))

  (defrelation most-specific-concepts
    :domain Set
    :characteristics :multiple-valued
    :function ((?self) (most-specific-concepts ?self)) )

;  (defrelation supers--named-super-concepts
;    :domain Set :range Concept
;    :characteristics :multiple-valued
;    :function ((?supers) (find-named-superconcepts-of-supers ?supers)) )
; 
; (defrelation subs--named-sub-concepts
;    :domain Set :range Concept
;    :characteristics :multiple-valued
;    :function ((?subs) (find-named-subconcepts-of-subs ?subs)) )

  (defrelation instance-of
    :is (:inverse instances)
    :range Concept
    :predicate ((?instance ?concept) (has-instance-p ?concept ?instance))
 ;; ADD THIS?
 ;  :function  get-types
 ;;   but why does instance--concepts do it this way:
 ;      :function ((?i) (if (symbolp ?i)
 ;			    (get-types `',?i)                    ; TAR 12/22/93
 ;			    (get-types ?i)))
    :characteristics :multiple-valued
    )

  (defrelation isa
    :range Concept
    :predicate ((?object ?concept) 
                (typecase ?object
                  (TBOX-CONCEPT 
                   (subconcept-p ?object ?concept))
                  ((OR DB-INSTANCE CLOS-INSTANCE)       ; TAR 8/12/93
                   (has-instance-p ?concept ?object)))) )

  (defproperty user-defined
    :domain Thing
    :predicate ((?c) (not (system-defined-p ?c))) )
  (defproperty primitive
    :domain Meta-Thing
    :predicate ((?self) (primitive-p ?self)) )
  (defproperty incoherent-concept
    :domain Meta-Thing
    :predicate ((?self) (member :incoherent (attributes ?self))) )
  (defproperty single-valued
    :domain Relation
    :predicate relation-is-single-valued-p
    ;; Was: ((?self) (member :single-valued (attributes ?self)))
    )
  (defrelation okbc-slot-collection-type
    :domain Relation
    :function ((x) (if (relation-is-single-valued-p x) nil :set)))
  (defproperty closed
    :domain Meta-Thing
    :predicate ((?r) (concept-is-closed-p ?r)) )
  ;; Temporal properties of numbers:
  (defproperty temporal
      :domain Meta-Thing
      :predicate ((x) (member :temporal (attributes x))))
  (defproperty past
    :domain Number
    :predicate ((?self) (if (eql *query-world-time-suffix* '+)
                          (<= ?self *query-world-time*)
                          (< ?self *query-world-time*))))
  (defproperty future
    :domain Number
    :predicate ((?self) (if (eql *query-world-time-suffix* '-)
                          (>= ?self *query-world-time*)
                          (> ?self *query-world-time*))))
    
  (defconcept Binary-Relation
      :roles ((min-cardinality :function ((?self) (get-role-min-cardinality
						   (domain ?self) ?self)))
	      (max-cardinality :function ((?self) (get-role-max-cardinality
						   (domain ?self) ?self)))
	      (min-value :function ((?self) (get-role-min-value
					     (domain ?self) ?self)))
	      (max-value :function ((?self) (get-role-max-value
					     (domain ?self) ?self)))
	      (cardinality :function ((?self) (get-role-cardinality
					       (domain ?self) ?self)))
	      (all-values :function ((?self) (get-role-values
					      (domain ?self) ?self)))
	      (strict-values :function ((?self) (get-role-strict-values
						 (domain ?self) ?self)))
	      (default-values :function ((?self) (get-role-default-values
						  (domain ?self) ?self))))
    :is (:and Relation (:the arity 2)))
  (defconcept Unary-Function
    :is-primitive Binary-Relation
    :predicate ((?r) (and (typep ?r 'BINARY-RELATION)   ; TAR 9/28/93
                          (role-is-single-valued-p ?r))) )

  (defrelation holds-true-2
    :domain Meta-Thing :range Thing
    :predicate concept-holds-true-p)

  (defrelation holds-true-3
    :arity 3
    :domains (Relation Thing) :range Thing
    :predicate binary-relation-holds-true-p)

  (defrelation holds-true-4
    :arity 4
    :domains (Relation Thing Thing) :range Thing
    :predicate ternary-relation-holds-true-p)

  (defrelation implies
    :function ((?c) (remove-system-named-concepts 
			  (let ((consequentConcept (consequent-concept ?c)))
			    (cons consequentConcept
				  (all-super-concepts consequentConcept)))))
    :domain Concept :range Concept
    :characteristics :multiple-valued)
  
  (defrelation disjoint
      "This relation holds if concepts are disjoint."
    :predicate disjoint-concepts-p
    :domain Concept :range Concept
    :characteristics :multiple-valued)

  (defrelation term-implies
    :characteristics :multiple-valued
    :function ((?self)
               (remove-system-named-concepts
                (remove-duplicates
                 (typecase ?self
                   (UNARY-CONCEPT
                    (let ((consequentConcept (consequent-concept ?self)))
                      (cons consequentConcept
                            (all-super-concepts consequentConcept))))
                   (CLASSIFIABLE-OBJECT ; was otherwise ; TAR 10/18/93
                    (let ((consequentRelations
                           (loop for dep in (non-tbox-dependents ?self)
                                when (and (meta-thing-p dep)
                                          (member ?self (antecedents dep)))
                                collect dep)))
                      (cons ?self
                            (append (all-super-concepts ?self)
                                    consequentRelations
                                    (loop for rel in consequentRelations
                                         append (all-super-concepts rel)))))))))) )


  ;;
;;;;;; Propositions
  ;;

  (defconcept Proposition
      :existing-class-name Proposition)
  (defrelation proposition-operator :domain proposition
    :function proposition-operator)
  (defrelation proposition-truth-value :domain proposition 
	       :function proposition-truth-value)
  (defrelation proposition-arguments 
      :domain proposition :function proposition-arguments)


  ;;
;;;;;; Roles
  ;;

  (defconcept Role
    :roles ((concept :function concept)
            (relation :function relation)
            (name :function ((?self) (name (relation ?self))))
            (types 
	     :function ((?self) (get-role-types
				 (concept ?self) (relation ?self) :raw-p t)))
            (min-cardinality 
	     :function ((?self) (get-role-min-cardinality
				 (concept ?self) (relation ?self))))
            (max-cardinality 
	     :function ((?self) (get-role-max-cardinality
				 (concept ?self) (relation ?self))))
	    (min-value 
	     :function ((?self) (get-role-min-value
				 (concept ?self) (relation ?self))))
	    (max-value 
	     :function ((?self) (get-role-max-value
				 (concept ?self) (relation ?self))))
            (cardinality 
	     :function ((?self) (get-role-cardinality
				 (concept ?self) (relation ?self))))
	    (all-values 
	     :function ((?self) (get-role-values
				 (concept ?self) (relation ?self))))
	    (strict-values 
	     :function ((?self) (get-role-strict-values
				 (concept ?self) (relation ?self))))
	    (default-values
		:function ((?self) (get-role-default-values
				    (concept ?self) (relation ?self))))
	    (characteristics :function ((?self) (attributes ?self))))
    :implies (:and (:the concept Concept)
		   (:the relation Relation)
		   (:the min-cardinality Integer)
		   (:the cardinality Integer))
    :existing-class-name Role)

  (defrelation the-role
      :arity 3
      :range Role
      :function ((?concept ?relation) (get-role ?concept ?relation)) )
  
  (defrelation the-instance-role
      :arity 3
      :range Role
      :function ((?concept ?relation) (get-instance-role ?concept ?relation)) )

  (defrelation types :characteristics :multiple-valued) ;; override :single-valued inference
  (defrelation all-values :characteristics :multiple-valued)
  (defrelation strict-values :is-primitive all-values
	       :characteristics :multiple-valued)
  (defrelation default-values :is-primitive all-values
	       :characteristics :multiple-valued)



  ;;
;;;;;; relations that have ONTOLINGUA counterparts with similar names:
  ;;

  (defrelation role-values
    "Given an instance or concept and a relation, return the fillers of the
     corresponding role."
    :domains (Thing Relation)
    :characteristics :multiple-valued
    :function ((?concept ?relation) (get-role-values ?concept ?relation)) )
  (defrelation strict-role-values
    "Given a concept and a relation, return the strict fillers of the
     corresponding role."
    :domains (Concept Relation)
    :characteristics :multiple-valued
    :function ((?concept ?relation) (get-role-strict-values ?concept ?relation)))
  (defrelation default-role-values
    "Given a concept and a relation, return the default fillers of the
     corresponding role."
    :domains (Concept Relation)
    :characteristics :multiple-valued
    :function ((?concept ?relation) (get-role-default-values ?concept ?relation)))
  (defrelation role-types
      "Given a concept and a relation, return the type restriction(s) for that relation.
If multiple values are returned, then the true type restriction is the conjunctions of
the returned types."
    :domains (Concept Relation) :range Concept
    :characteristics :multiple-valued
    :function ((?concept ?relation) (get-role-types ?concept ?relation :raw-p t)))
  (defrelation role-cardinality
    "Given a concept and a relation, return the cardinality of the corresponding role.
     Note that cardinality only exists if the min and max are the same."
    :domains (Concept Relation) :range Integer
    :is (:and role-min-cardinality role-max-cardinality)
    :function ((?concept ?relation)
               (let ((min (get-role-min-cardinality ?concept ?relation)))
                 (when (eql min (get-role-max-cardinality ?concept ?relation))
                   min))))
  (defrelation role-min-cardinality
    "Given a concept and a relation, return the minimum cardinality of the corresponding role."
    :domains (Concept Relation) :range Integer
    :function ((?concept ?relation) (get-role-min-cardinality ?concept ?relation)) )
  (defrelation role-max-cardinality
    "Given a concept and a relation, return the maximum cardinality of the corresponding role."
    :domains (Concept Relation) :range Integer
    :function ((?concept ?relation) (get-role-max-cardinality ?concept ?relation)) )
  (defrelation role-min-value
    "Given a concept and a relation, return the minimum numeric value of the corresponding role."
    :domains (Concept Relation) :range QUANTITY
    :function ((?concept ?relation) (get-role-min-value ?concept ?relation)) )
  (defrelation role-max-value
    "Given a concept and a relation, return the maximum numeric value of the corresponding role."
    :domains (Concept Relation) :range QUANTITY
    :function ((?concept ?relation) (get-role-max-value ?concept ?relation)) )

  
  ;;
;;;;;; versions of above with qualified relations
  ;;

  (defrelation qualified-role-values
      "Given an instance or concept, a relation and a qualifier,
 return the fillers of the corresponding role."
    :domains (Thing Relation Concept)
    :characteristics :multiple-valued
    :function ((?concept ?relation ?qualification)
	       (get-role-values ?concept ?relation :qualification ?qualification)) )
  (defrelation strict-qualified-role-values
      "Given a concept, a relation and a qualifier,
 return the strict fillers of the corresponding role."
    :domains (Concept Relation Concept)
    :characteristics :multiple-valued
    :function ((?concept ?relation ?qualification)
	       (get-role-strict-values ?concept ?relation :qualification ?qualification)))
  (defrelation default-qualified-role-values
      "Given a concept, a relation and a qualifier,
 return the default fillers of the corresponding role."
    :domains (Concept Relation Concept)
    :characteristics :multiple-valued
    :function ((?concept ?relation ?qualification)
	       (get-role-default-values ?concept ?relation :qualification ?qualification)))
  (defrelation qualified-role-types
      "Given a concept, a relation and a qualifier,
 return the type restriction for that relation."
    :domains (Concept Relation Concept) :range Concept
    :characteristics :multiple-valued
    :function ((?concept ?relation ?qualification)
	       (get-role-types ?concept ?relation :qualification ?qualification :raw-p t)))
  (defrelation qualified-role-cardinality
      "Given a concept, a relation and a qualifier,
 return the cardinality of the corresponding role.
 Note that cardinality only exists if the min and max are the same."
    :domains (Concept Relation Concept) :range Integer
    :is (:and qualified-role-min-cardinality qualified-role-max-cardinality)
    :function ((?concept ?relation ?qualification)
	       (get-role-cardinality ?concept ?relation :qualification ?qualification)))
  (defrelation qualified-role-min-cardinality
      "Given a concept, a relation and a qualifier,
 return the minimum cardinality of the corresponding role."
    :domains (Concept Relation Concept) :range Integer
    :function ((?concept ?relation ?qualification) 
	       (get-role-min-cardinality ?concept ?relation :qualification ?qualification)) )
  (defrelation qualified-role-max-cardinality
      "Given a concept, a relation and a qualifier,
 return the maximum cardinality of the corresponding role."
    :domains (Concept Relation Concept) :range Integer
    :function ((?concept ?relation ?qualification) 
	       (get-role-max-cardinality ?concept ?relation :qualification ?qualification)) )
  (defrelation qualified-role-min-value
      "Given a concept, a relation and a qualifier,
 return the minimum numeric value of the corresponding role."
    :domains (Concept Relation Concept) :range QUANTITY
    :function ((?concept ?relation ?qualification)
	       (get-role-min-value ?concept ?relation :qualification ?qualification)) )
  (defrelation qualified-role-max-value
      "Given a concept, a relation and a qualifier,
 return the maximum numeric value of the corresponding role."
    :domains (Concept Relation Concept) :range QUANTITY
    :function ((?concept ?relation ?qualification)
	       (get-role-max-value ?concept ?relation :qualification ?qualification)) )


  ;;
;;;;;; Other non-Ontolingua relations
  ;;
  
  (defrelation predecessor
    :domains (Concept Constant) :range Constant
    :function ((set member)
               (let ((feature (defined-set-feature (get-concept set))))
	         (when feature 
	           (compute-predecessor-in-interval feature member)))) )

  (defrelation successor
    :domains (Concept Constant) :range Constant
    :function ((set member)
               (let ((feature (defined-set-feature (get-concept set))))
	         (when feature 
	           (compute-successor-in-interval feature member)))) )

  (defrelation identity 
   :function ((self) self)
   :characteristics (:symmetric :single-valued))
  ) ;; end "load-meta-things"

  ;;
;;;;;; Obsolete concept and relation definitions
  ;;

;; THESE WILL EVENTUALLY BE OBLITERATED FROM LOOM:
(defun load-obsolete-concepts ()
  ;; Compatibility function;
  (within-context 'BUILT-IN-THEORY

  (defrelation concept--name
    :function ((?concept) (name ?concept))
    :domain Concept :range Symbol)
  (defrelation relation--name
    :function ((?relation) (name ?relation))
    :domain Relation :range Symbol)

  (defrelation relation--domain :is domain)
  (defrelation relation--range :is range)
  (defrelation concept--instances :is instances)

  (defrelation subconcepts :is subrelations)    
  (defrelation direct-subconcepts :is direct-subrelations)
  (defrelation subconcept* :is subrelations)
  (defrelation subconcept+ :is proper-subrelations)
  (defrelation superconcepts :is superrelations)
  (defrelation direct-superconcepts :is direct-superrelations) 
  (defrelation superconcept+ :is proper-superrelations)
  (defrelation superconcept* :is superrelations)

  (defrelation concept--characteristics :is characteristics)
  (defrelation concept--attributes :is characteristics)
  (defconcept named-p :is user-defined)
  (defrelation instance--type :is instance-of)
   ;; Was:     :function ((?i) (values (find-type&residue-features ?i)))
  (defrelation instance--identifier :is name)
  (defrelation instance--value-restriction :is role-types)
  (defrelation instance--min-restriction :is role-min-cardinality)
  (defrelation instance--max-restriction :is role-max-cardinality)
  (defrelation instance--concepts :is instance-of)
;;    :function ((?i) (if (symbolp ?i)
;;                    	    (get-types `',?i)   ; TAR 12/22/93 (Outwit dwimming)
;;			    (get-types ?i)))
  (defrelation instance--asserted-concepts
    :function ((?i) (get-types ?i :asserted-p t))
    :characteristics :multiple-valued)
  (defrelation instance--cached-concepts
    :function ((?i) (get-types ?i :direct-p t))
    :characteristics :multiple-valued)
  (defrelation instance--forward-chaining-type
    :function ((?i) (and (typep ?i 'LOOM::BASIC-INSTANCE)    ; TAR 9/27/93
                             (find-named-superconcepts-of-supers 
			      (list-of	; DGB 8/13/93
			       (db-type ?i)))))
    :characteristics :multiple-valued)

  ;;
;;;;;; Restriction predicates
  ;; 


  (defrelation concept--restrictions :is restrictions)
  (defrelation restriction--concepts
    :is (:inverse concept--restrictions)
    :range Concept :domain restriction-p
    :characteristics :multiple-valued
    :function ((?self) 
	       (let ((result nil))
		 (loop for dep in (dependents ?self)
		     when (concept-p dep) do (push dep result))
		 (loop for dep in (non-tbox-dependents ?self)
		     when (concept-p dep) do (push dep result))
		 result)))
  (defrelation restriction--relation :is relation)
  (defrelation relation--restrictions :is restrictions)
   ;; Was    :is (:inverse restriction--relation)
  (defrelation restriction--value-restriction :is value-type)
  (defrelation restriction--qualification :is qualification)
  (defrelation restriction--min :is min-cardinality)
  (defrelation restriction--max :is max-cardinality)
  (defconcept restriction-p :is restriction)
  (defconcept value-restriction-p :is value-restriction)
  (defconcept min-restriction-p :is min-restriction)
  (defconcept max-restriction-p :is max-restriction)

;; THESE "role" PREDICATES ARE NOW OBSOLETE BECAUSE WE HAVE RE-INVENTED ROLES:
  (defconcept Old-Role
    :is-primitive Meta-Thing
    :implies (:and (:exactly 1 role--relation)
                       (:exactly 1 role--instance)))	; RMM 5/20/92

  (defrelation has-role
    :domain Meta-Thing)
  (defrelation role--relation
    :domain Old-Role :range Relation
    :characteristics :single-valued)
  (defrelation role--instance
    :domain Old-Role
    :characteristics :single-valued)
  (defrelation role--concept
    :is (:and role--instance
              (:range Concept))
    :characteristics :single-valued)
  (defrelation role--value
    :is (:satisfies (?role ?value) 
		    (role-values
		      (role--instance ?role)
		      (role--relation ?role)
		      ?value))
    :domain Role
    :characteristics :single-valued)

  ;;
;;;;;; More Renaming
  ;; 


  (defproperty primitive-p :is primitive)
  (defproperty single-valued-p :is single-valued)
  (defproperty user-defined-p :is user-defined)

  (defrelation direct-subconcept :is direct-subconcepts)
  (defrelation direct-superconcept :is direct-superconcepts)
  (defrelation instance-of-p :is instance-of)
  (defrelation isa-p :is isa)
  (defrelation instance--asserted-type :is instance--asserted-concepts
    :characteristics :multiple-valued)

  )) ;; end "load-obsolete-concepts"

  ;;
;;;;;; Support concepts and relations for the CL-HTTP Browser
  ;;

(defun load-cl-http-concepts ()
  (within-context 'built-in-theory
    (defrelation html-image
	:annotations ((documentation 
		       "Pointer to an HTML-displayable URL of an image.")))
    (defrelation image-used-by :is (:inverse html-image))
    (defconcept html-image "This is an instance describing an image to
be displayed in-line in html viewers."
      :roles (html-image-url html-image-width html-image-height
			     html-image-alt-text html-image-border))
    
    (defrelation html-image-url :domain html-image :range string
		 :characteristics :single-valued)
    (defrelation html-image-width :domain html-image :range integer
		 :characteristics :single-valued)
    (defrelation html-image-height :domain html-image :range integer
		 :characteristics :single-valued)
    (defrelation html-image-border :domain html-image :range integer
		 :characteristics :single-valued)
    (defrelation html-image-alternative-text :domain html-image :range string
		 :characteristics :single-valued)

    (defrelation value-format-string
	"Format string to use for prettier printing of role values in a browser."
      :domain Relation
      :range string
      :characteristics (:single-valued))
    (defrelation output-unit
	"Unit to use for prettier printing of role values in a browser.  Useful values are:

\"<unitName>\" as a string.  Shorthand for the following LIST:

'(:unit <unitString> [<precision>]) for output in a particular unit with optional
                                    precision (number of decimal places).

'(:best-fit <unitString1> ... <unitStringN> [precision]) for output with the unit that
                                                         best fits the value from the
                                                         given choices. Precision as above.

'(:step <unitString1> ... <unitStringN> [precision]) for output with multiple units, where
                                                     the largest units have integer values
                       and smaller units are used for the remainder. The optional precision
                       argument is applied only to the smallest unit actually used.
                       ** Note that this format cannot be read back in ** "
      :domain Relation
      :range (:or string symbol)
      :characteristics (:single-valued))
    
    (defconcept see-also-link "This is an instance describing an html link
to other relevant information.  The other information can be linked through
any legal URL."
      :roles (qv-url qv-display-text
		     qv-display-leading-image
		     qv-display-trailing-image
		     qv-image-border))

    (defrelation qv-url :domain see-also-link :range string
		 :characteristics :single-valued)
    (defrelation qv-display-text :domain see-also-link :range string 
		 :characteristics :single-valued)
    (defrelation qv-display-leading-image :domain see-also-link :range string)
    (defrelation qv-display-trailing-image :domain see-also-link :range string)
    (defrelation qv-image-border :domain see-also-link :range integer
		 :characteristics :single-valued)

    (defrelation see-also :range see-also-link)
    (defrelation seen-from :is (:Inverse see-also))
    (export-names-in-context 'BUILT-IN-THEORY)
    ) )

(push 'load-cl-http-concepts *initialize-network-functions*)

  ;;
;;;;;; Generic Functions for Roles to Eliminate Undefined Function Warnings
  ;;

(CLOS::defgeneric cardinality (self))
(CLOS::defgeneric direct-dependents (self))
(CLOS::defgeneric domain (self))
(CLOS::defgeneric instances (self))
(CLOS::defgeneric max-cardinality (self))
(CLOS::defgeneric min-cardinality (self))
(CLOS::defgeneric parents (self))
(CLOS::defgeneric range (self))
(CLOS::defgeneric types (self))
(CLOS::defgeneric value-type (self))
(CLOS::defgeneric xidentifier (self))
(CLOS::defgeneric xtype (self))

  ;;
;;;;;; Dummy Functions to Eliminate Undefined Function Warnings
  ;;

;;; These functions cannot be defined for real until after the TBox
;;; is constructed in abox/coda.lisp.


(defun concept-holds-true-p (?c ?i)
  (declare (ignore ?c ?i))
  nil )

(defun binary-relation-holds-true-p (?r ?i ?f)
  (declare (ignore ?r ?i ?f))
  nil)

(defun ternary-relation-holds-true-p (?r ?v1 ?v2 ?v3)
  (declare (ignore ?r ?v1 ?v2 ?v3))
  nil )

#|
|#
