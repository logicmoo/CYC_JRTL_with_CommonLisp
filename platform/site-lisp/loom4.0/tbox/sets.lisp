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

;;; SETS.LISP (TBOX)

;;; This file contains procedures specific to SETs

(in-package "LOOM")

(export '( INFINITY +INFINITY INF +INF -INFINITY -INF))


   ;;
  ;;;;
;;;;;;;; Sets
  ;;;;
   ;;



  ;;
;;;;;; Open & Closed Interval Representation:
  ;;

;;
;; The interval data structure is a simple vector of four elements:
;;
;;  < lower-exact lower-open upper-open upper-exact >
;;
;;  An element E is in the interval if it satisfies one of the
;;    following three tests:
;;    (1)  E = LOWER-EXACT
;;    (2)  E = UPPER-EXACT
;;    (3)  LOWER-OPEN < E < UPPER-OPEN
;;
;;  Open intervals are encoded by leaving the -EXACT entries NIL.
;;  Closed intervals have the same values for -EXACT and -OPEN entries.
;;
;;  This allows a simple membership test for numeric ranges, and provides
;;  a way to compute intersection and union without a lot of cases.
;;
;; Examples:
;;
;;    0 <  x <  100      #(nil 0 100 nil)
;;    0 <= x <  100      #(  0 0 100 nil)
;;    0 <  x <= 100      #(nil 0 100 100)
;;    0 <= x <= 100      #(  0 0 100 100)
;;

(defmacro lower-exact (a)
  `(aref ,a 0))
(defmacro lower-open (a)
  `(aref ,a 1))
(defmacro upper-open (a)
  `(aref ,a 2))
(defmacro upper-exact (a)
  `(aref ,a 3))

(defun make-interval (lower-exact lower-open upper-open upper-exact)
  (let ((a (make-array 4)))
    (setf (lower-exact a) lower-exact)
    (setf (lower-open a) lower-open)
    (setf (upper-open a) upper-open)
    (setf (upper-exact a) upper-exact)
    a))

(defmacro intervalp (a)
  `(arrayp ,a))

#|  Alternate Space-saving Implementation:

;;
;;  Conses:  (FLAGS . (LOWER . UPPER))
;;

(def-bit-flags :interval :lower-closed :upper-closed)

(defmacro lower-exact (a)
  `(and (test-bit-flags (car ,a) :interval :lower-closed)
	(lower-open ,a)))
(defmacro lower-open (a)
  `(cadr ,a 1))
(defmacro upper-open (a)
  `(cddr ,a 2))
(defmacro upper-exact (a)
  `(and (test-bit-flags (car ,a) :interval :upper-closed)
	(upper-open ,a)))

(defun make-interval (lower-exact lower-open upper-open upper-exact)
  (let ((a (cons 0 (cons lower-open upper-open))))
    (when lower-exact
      (set-bit-flags (first a) :interval :lower-closed))
    (when upper-exact
      (set-bit-flags (first a) :interval :upper-closed))
    a))

(defmacro intervalp (a)
  `(consp ,a))

|#


  ;;
;;;;;; Bootstrap of Set Features
  ;;

(defun make-infinite-interval-set ()
  (let ((newSet (make-loom-instance 'INTERVAL-FEATURE
		  :members (list (make-interval '-INFINITY '-INFINITY
						'+INFINITY '+INFINITY)))))
    (setf (classified-p newSet) 0)
    ;; return "newSet":
    (setf (base-set newSet) newSet)
    newSet))

(defun initialize-set-features ()
  ;; Helping function for "initialize-network";
  ;; Create set features for the concepts Constant, Quantity, Number,
  ;;    Rational, Integer, Symbol, and String;
  ;; Assign the value :infinite-set to the set features so that
  ;;    "condition-set-features" won't combine them with local set features;
  ;; Note: the allXxx sets are NOT marked as primitive (by assigning the
  ;;    slot "defining-concept") because that would prevent sets without
  ;;    base sets from classifying under them;
  (flet ((create-set (type members)
	   (let ((newSet (make-loom-instance type :members members)))
	     (setf (classified-p newSet) 0)
	     (when (null (members newSet))
	       (setf (members newSet) :infinite-set))
	     ;; return "newSet":
	     (setf (base-set newSet) newSet)))
	 (link-concept-to-defining-set-feature
	   (concept feature)
	   (setf (defined-set-feature concept) feature)
	   (setf (defining-concept feature) concept)))					       
    (define-constant-number&integer)
    (map-transitively
      (loom-constant CONSTANT) sub-concepts
      (lambda (concept)
	(loop for f in (computed-features concept)
	     do (seal-computed-feature f))))
    (let ((allConstants (create-set 'SET-FEATURE nil))
;	   (allQuantities (create-set 'SET-FEATURE nil))  ;; NEEDED?
;	   (allMeasures  (create-set 'SET-FEATURE nil))
	  (allQuantities (make-infinite-interval-set))
	  (allMeasures   (make-infinite-interval-set))
	  (allNumbers    (make-infinite-interval-set))
	  (allFloats     (make-infinite-interval-set))
	  (allRationals  (make-infinite-interval-set))
	  (allIntegers   (make-infinite-interval-set)))
      (setq *allThings* (create-set 'SET-FEATURE nil))
      ;; establish subsumption links between built-in set features, but
      ;;    DO NOT link "allConstants" below *allThings*
      (add-specializes-link allQuantities allConstants)
      (add-specializes-link allNumbers allQuantities)
      (add-specializes-link allMeasures allQuantities)
      (add-specializes-link allRationals allNumbers)
      (add-specializes-link allIntegers allRationals)
      ;; note: to save space (i.e., to avoid inheriting *allThings*),
      ;;    *allThings* points to |C|THING, but |C|THING doesn't point to
      ;;    *allThings*:
      (setf (defining-concept *allThings*) *thing*)
      (setq *built-in-set-alist*	; Store for later use.
	(list (cons (loom-constant CONSTANT) allConstants)
	      (cons (loom-constant QUANTITY) allQuantities)
	      (cons (loom-constant MEASURE) allMeasures)
	      (cons (loom-constant NUMBER) allNumbers)
	      (cons (loom-constant FLOATING-POINT-NUMBER) allFloats)
	      (cons (loom-constant RATIONAL-NUMBER) allRationals)
	      (cons (loom-constant INTEGER) allIntegers)))
      (loop for (concept . setFeature) in *built-in-set-alist*
	   do (link-concept-to-defining-set-feature concept setFeature))
      (loop for f in (list *allThings* allConstants allQuantities allMeasures
			   allNumbers allFloats allRationals allIntegers)
	   do
	   (setf (all-super-concepts f)
		 (nreverse (delete f (collect-transitively
				      f super-concepts (lambda (self) self))))))
;      (define-measure-types)  ;; Done later with DEFINE-MEASUREMENT-CONCEPTS
      (define-symbol-string&character) )))


(defun define-measure-types ()
  ;; Defines subconcepts of MEASURE based on the currently existing
  ;;  Measure types;
  #+:measures
  (loop for m in (measures::list-all-measures)
      do (loom:define-concept
	     (intern (format nil "~A-MEASURE" (measures::ms-name m)) "LOOM")
	     :is-primitive 'MEASURE
	     :predicate `((x) (and (measures:dim-number-p x)
				   (eql (measures::dim-prim-id x)
					,(measures::ms-prim-id m)))))) )

(defun fundamental-constant-p (member)
  ;; Return true if "member" is a LOOM non-list constant;
  (or (symbolp member) 
      (numberp member)
      (stringp member)
      (characterp member)
      #+:measures (measures:dim-number-p member)
      ))

(defun constant-p (member)
  ;; Return true if "member" is a LOOM constant;
  (declare (inline fundamental-constant-p))
  (or (fundamental-constant-p member)
      (listp member)))

(defun define-constant-number&integer ()
  ;; Helping function for "initialize-set-features"
  ;; Introduce the concepts "Non-LOOM-Thing", "Constant", "Quantity", "Measure",
  ;;     "Number", "Rational" and "Integer" and intern them as instances;
  ;; Classify them immediately, to avoid trying to condition the already
  ;;    conditioned "defined-set-feature" installed by
  ;;    "initialize-set-features";
  (let ((constantConcepts
	  (list
	   (defconcept Non-LOOM-Thing
	       :is-primitive OKBC-individual
	       :characteristics (:perfect :backward-chaining)
	       :predicate ((self) (not (or (typep self 'BASIC-INSTANCE)
					   (typep self 'CLOS-INSTANCE))))
	       :identifier Non-LOOM-Thing)
	    (defconcept Constant
	      :is-primitive Non-LOOM-Thing
              :partitions $CONSTANT-PARTITION$
	      :characteristics (:perfect :backward-chaining)
	      :predicate constant-p
	      :identifier Constant)
	    (defconcept Quantity
	      :is-primitive Constant
              :in-partition $CONSTANT-PARTITION$
	      :partitions $NUMERIC-PARTITION$
	      :characteristics (:perfect :non-exported)
	      :predicate extended-number-p
	      :identifier Quantity)
	    #+:measures
	    (defconcept Measure
	      :is-primitive Quantity
              :in-partition $NUMERIC-PARTITION$
	      :characteristics (:perfect :non-exported)
	      :predicate ms:dim-number-p
              :existing-class-name ms:dim-number
	      :identifier Measure)
	    #-:measures
	    (defconcept Measure
	      :is-primitive Quantity
              :in-partition $NUMERIC-PARTITION$
	      :characteristics (:non-exported)
	      :identifier Measure)
	    (defconcept Number
	      :is-primitive Quantity
              :in-partition $NUMERIC-PARTITION$
	      :partitions $NUMBER-PARTITION$
	      :characteristics (:perfect)
	      :predicate numberp
              :existing-class-name Number
	      :identifier Number)
	    (defconcept Floating-Point-Number
	      :is-primitive Number
              :in-partition $NUMBER-PARTITION$
	      :characteristics (:perfect)
	      :predicate floatp
              :existing-class-name Float
	      :identifier Floating-Point-Number)
	    (defconcept Rational-Number
	      :is-primitive Number
              :in-partition $NUMBER-PARTITION$
	      :characteristics (:perfect)
	      :predicate rationalp
              :existing-class-name Rational
	      :identifier Rational-Number)
	    (defconcept Integer
	      :is-primitive Rational-Number
	      :characteristics (:perfect)
	      :predicate integerp
              :existing-class-name Integer
	      :identifier Integer))))
    (loop for c in constantConcepts
	do (bind-identifier&predicate-symbol c :identifier (name c)))
    (loop for c in constantConcepts
	unless (eq (name c) 'non-loom-thing) ; TAR 12/13/94
	do (setf (defined-as c) :set)	; RMM 11/30/94
	do (condition&classify-subgraph c)
	   (post-uncompleted-concept c)
	   ;; because "c" was classified immediately, eliminate it
	   ;;    from *top-level-unclassified-concepts*:
	   (delf *top-level-unclassified-concepts* c)) ))

(defun define-symbol-string&character ()
  ;; Helping function for "initialize-set-features"
  ;; Define the built-in set concepts "Symbol", "String", and "Character";
  (let ((threeConcepts
         (list (defconcept Symbol
                 :is-primitive Constant
		 :in-partition $CONSTANT-PARTITION$
                 :characteristics (:monotonic :read-only)
                 :predicate symbolp
                 :existing-class-name Symbol
                 :identifier Symbol)
               (defconcept String
                 :is-primitive Constant
		 :in-partition $CONSTANT-PARTITION$
                 :characteristics (:monotonic :read-only)
                 :predicate stringp
                 :existing-class-name String
                 :identifier String)
               (defconcept Character
                 :is-primitive Constant
		 :in-partition $CONSTANT-PARTITION$
                 :characteristics (:monotonic :read-only)
                 :predicate characterp
                 :existing-class-name Character
                 :identifier Character))))
    ;; WHY "STRING" AND NOT THE OTHERS???:
    (loop for identifier in '(STRING)
          do (bind-identifier&predicate-symbol
	      (get-concept identifier)
	      :identifier identifier))
    (enable-classifier)				; classify and seal 
    (seal-network)				; built-in constant concepts
    (loop for c in threeConcepts      ; RMM 11/30/94
	  do (setf (defined-as c) :set))
    )
  (disable-classifier) )


  ;;
;;;;;; Set-specific generator methods
  ;;


(defmethod generate-set-definition ((self SET-FEATURE))
  ;; Generate the members of the set "self";
  ;; Note: "list-of" is applied to avoid breaking on the
  ;;    :infinite-set keyword;
  `(:one-of ,@(generate-instance-references (list-of (members self)))) )

(defmethod generate-set-definition ((self INTERVAL-FEATURE))
  ;; Generate expression representing an enumerated set or
  ;;    an interval with specific endpoints;
  ;; Note: "list-of" is applied to avoid breaking on the
  ;;    :infinite-set keyword;
  (let ((members (list-of (members self)))
	individuals intervals clauses)
    (when (and (eq self (base-set self))
	       (typep self 'SYMBOLIC-INTERVAL))
      (return-from generate-set-definition
	`(:the-ordered-set ,@(generate-instance-references (symbols self)))))
    (loop for i in members
	 do
	 (if (intervalp i)
	     (push (generate-set-member self i) intervals) 
	     (push (generate-set-member self i) individuals)))
    (setq clauses
	  (append
	    (when individuals
	      `((:one-of ,@individuals)))
	    intervals)) 
    (if (rest clauses)
	`(:or ,@clauses)
	(car clauses))) )

(defmethod generate-set-definition ((self CONS))
  ;; Situation: "self" belongs to a concept is not yet fully
  ;;    conditioned, and a trace routine is trying to print that concept;
  self )

(defun generate-set-definition-string (self briefP) ; tar 6/4/93
  ;; Generate a string which uses abbreviated quotes for quoted objects in
  ;;   the set definition of "self";
  (flet ((generate-the-string ()
	   (let ((definition (generate-set-definition self)))
	     (cond ((consp definition)
		    (if (equal definition '(:one-of ':infinite-set))
			""
		      (with-output-to-string (s) ; Use Short Quotes.
			(format s "(")
			(loop for form in definition
			    for first = t then nil
			    do (unless first (format s " "))
			       (if (quoted-p form)
				   (format s "'~S" (second form))
				 (format s "~S" form)))
			(format s ")"))))
		   ((quoted-p definition)
		    (format nil "'~S" (second definition)))
		   (t (format nil "~S" definition))) )))
    (if (consp self)			;; Not done processing yet!
	(generate-the-string)
      (case (name (defining-concept self))
	(QUANTITY (unless briefP "AllQuantities"))
	(MEASURE (unless briefP "AllMeasures"))
	(NUMBER (unless briefP "AllNumbers"))
	(FLOATING-POINT-NUMBER (unless briefP "AllFloats"))
	(RATIONAL-NUMBER (unless briefP "AllRationals"))
	(INTEGER (unless briefP "AllIntegers"))
	(otherwise (generate-the-string))))) )

(defmethod generate-set-member (set member)
  ;; Return "member" -- catches the case of +INFINITY and -INFINITY;
  (declare (ignore set))
  member )

(defmethod generate-set-member ((interval INTERVAL-FEATURE) (segment CONS))
  ;; Return an expression for the interval-segment "segment"
  ;;    of the interval-feature "interval";
  (break "Shouldn't execute this code.")
  `(:interval++
     ,(generate-set-member interval (lower-bnd segment))
     ,(generate-set-member interval (upper-bnd segment))) )

(defmethod generate-set-member ((interval INTERVAL-FEATURE) (segment ARRAY))
  ;; Return an expression for the interval-segment "segment"
  ;;    of the interval-feature "interval";
  `(,(if (lower-exact segment)
	 (if (upper-exact segment)
	     :interval++
	     :interval+-)
         (if (upper-exact segment)
	     :interval-+
	     :interval--))
    ,(generate-instance-reference (generate-set-member interval (lower-open segment)))
    ,(generate-instance-reference (generate-set-member interval (upper-open segment)))) )

(defmethod generate-set-member ((interval SYMBOLIC-INTERVAL) (member INTEGER))
  ;; Return the symbol of the object "member" of the symbolic interval
  ;;    "interval";
  (decode-set-member interval member) )


  ;;
;;;;;; Conditioning Set Features
  ;;

(defun condition-set-features (concept tbox/cbox)
  ;; Classify the set-features representing the definition or
  ;;    constraints on "concept", and store the result in the slot
  ;;    "defined-set-feature" or "implied-set-feature", depending on the value
  ;;    of "tbox/cbox";
  (when (typep (defined-set-feature concept) 'SET-FEATURE)
    ;; Already conditioned.  Sometimes happens when adding new supers
    ;;  above built-in set concepts
    (return-from condition-set-features nil))
  (let ((conjuncts (conjuncts concept))
        newSetFeature)
    (case tbox/cbox
      (:tbox 
       (setq newSetFeature
	     (compute-set-feature
	       (loop for c in conjuncts
                     as inheritedSetFeature = (defined-set-feature c)
		    when inheritedSetFeature
		    collect inheritedSetFeature)
	       (defined-set-feature concept)
	       concept))
       (when (null newSetFeature)
	 (return-from condition-set-features nil))
       (setf (defined-set-feature concept)
	     newSetFeature))
      (:cbox
       (setq newSetFeature
	     (compute-set-feature
	       (loop for c in conjuncts collect (implied-set-feature c))
	       (implied-set-feature concept)
	       nil))
       (when (null newSetFeature)
	 (return-from condition-set-features nil))
       (setf (implied-set-feature concept)
	     newSetFeature)))
    (when (null (members newSetFeature))
      (setf (incoherent-p concept) t)) ))

(defun compute-set-feature (classifiedFeatures sourceFeatures definingConcept)
  ;; Called by "condition-set-features" and "condition-set-value-restriction";
  ;; Return a classified set-feature representing the conjunction of "concepts",
  ;;    "classifiedFeatures" and "sourceFeatures";
  ;; The code is optimized for cases when simple set-intersections suffice
  ;;    for evaluating the result;
  (let (initialBaseSet newSet members)
    ;; Quick Escape when reconditioning a specially-built built-in set:
    (when (setq newSet (cdr (assoc definingConcept *built-in-set-alist*)))
      (return-from compute-set-feature newSet))
    (setq classifiedFeatures
	  (delete nil classifiedFeatures :test #'eq))
    (when (and (null classifiedFeatures) (null sourceFeatures))
      (return-from compute-set-feature nil))
    (when (rest classifiedFeatures)
      (setq classifiedFeatures (most-specific-concepts classifiedFeatures)))
    (setq initialBaseSet
	  (compute-initial-base-set classifiedFeatures sourceFeatures))
    (when (typep initialBaseSet 'SYMBOLIC-INTERVAL)
      ;; try to coerce other features into the format assumed by "initialBaseSet"
      (multiple-value-setq (classifiedFeatures sourceFeatures)
	(coerce-features-to-symbolic-interval
	  initialBaseSet classifiedFeatures sourceFeatures)))
    (cond
      (sourceFeatures
       (setq members (compute-set-intersection
	              (append
		       sourceFeatures
		       classifiedFeatures)
	              initialBaseSet
	              nil)))
      ;; no source features:
      ((and (null (rest classifiedFeatures))
	    ;; don't exit if there is a :base-set mark on "definingConcept":
	    definingConcept
	    (not (member :base-set (attributes definingConcept))))
       (return-from compute-set-feature (car classifiedFeatures)))
      (t
       (setq members (members (car classifiedFeatures)))
       (loop for f in (rest classifiedFeatures)
	     do (setq members (compute-intersection-of-lists 
		               initialBaseSet members (members f))))))
    (setq newSet
	  (create-set-feature initialBaseSet members definingConcept))
    ;; return classified set feature:
    (classify-one-concept newSet) ))

(defun coerce-features-to-symbolic-interval
       (baseSet classifiedFeatures sourceFeatures)
  ;; Helping function for "compute-set-feature";
  ;; If a symbolic interval base set different from "baseSet" is
  ;;    referenced within "classifiedFeatures", generate an error;
  ;; Otherwise, try to coerce other features into
  ;;    the format assumed by "baseSet";
  ;; TO DO: CONSIDER DISALLOWING "classifiedFeatures" HERE:
  (let (featuresToBeCoerced badOtherSymbolicBaseSet)
    (loop for f in  classifiedFeatures
	 when (neq (base-set f) baseSet)
	 do
	 (if (typep (base-set f) 'SYMBOLIC-INTERVAL)
	     (setq badOtherSymbolicBaseSet (base-set f))
	     (push f featuresToBeCoerced))) 
    (when badOtherSymbolicBaseSet
      (conditioning-warning "Incompatible base sets ~S and ~S"
			    baseSet (base-set badOtherSymbolicBaseSet)))
    (loop for f in featuresToBeCoerced 
	 do
	 (delf classifiedFeatures f)
	 (push (generate-set-definition f) sourceFeatures))
    (values classifiedFeatures sourceFeatures) ))

(defun create-set-feature (initialBaseSet members definingConcept)
  ;; Create a new set feature;
  ;; If "baseSet" is non-null, make a feature of the same type, and
  ;;    fill in its "members" and "base-set" slots;
  ;; Otherwise, compute the CLOS type of the new feature, create a
  ;;    feature, and fill in the above slots;
  (multiple-value-bind (baseSet classNameOfNewSet)
      (compute-intermediate-base-set initialBaseSet members definingConcept)
    (let ((newSet (make-instance classNameOfNewSet)))
      (when (null baseSet)
	(setq baseSet newSet)
	;; make "find-subsumees" happy:
	(setf (primitive-p newSet) t))
      (setf (base-set newSet) baseSet)
      (when (and definingConcept
		 (eq (base-set newSet) newSet))
	(add-link defining-concept newSet definingConcept
		  :link-is-new t :old-value-is-null t)
;; NOT ANY MORE:  RMM 2/24/92
;	;; make "definingConcept" primitive:
;	(setf (primitive-p definingConcept) t)
	(when (eq classNameOfNewSet 'SYMBOLIC-INTERVAL)
	  (setf (symbols newSet) members)
	  (setq members (list (make-interval-segment
			       0 0 (1- (length members)) (1- (length members)))))))
      (setf (members newSet)
	    (if (and (consp members)		; don't normalize :infinite-set
		     (rest members))
		(normalize-members-of-list baseSet members)
		members))
      newSet )))


  ;;
;;;;;; Computation of base sets
  ;;

;;; The slot "base-set" on a set feature "s" points to some set feature
;;; the same as or above "s" that defines the "domain" of that set.
;;; A base-set acts as a kind of PRIMITIVE set, in that the classifier
;;;    won't unify sets having different base sets, unless one of the
;;;    base sets subsumes the other.  A set feature which is its own base
;;;    set is therefore primitive.
;;; A set feature "s" IS a base set if
;;;   (1) "s" is a direct child of allSymbols, allStrings, allNumbers,
;;;       allIntegers, or allConstants; AND
;;;   (2) "s" has a defining concept.

(defun compute-initial-base-set (classifiedFeatures sourceFeatures)
  ;; Helping function for "compute-set-feature";
  ;; Look for a most-specific base set among "classifiedFeatures" and
  ;;    "sourceFeatures";
  ;; This base set will aid in evaluating "sourceFeatures";
  (let (baseSet systemBaseSets userBaseSets)
    (labels ((absorb-base-set (baseSet)
	       (when baseSet
		 (if (system-base-set-p baseSet)
                   (pushnew baseSet systemBaseSets) 
                   (pushnew baseSet userBaseSets))))
	     (winnow-base-sets (listOfBaseSets)
	       (when (rest listOfBaseSets)
		 (setq listOfBaseSets
		       (most-specific-concepts listOfBaseSets)))
	       (when (rest listOfBaseSets)
		 (conditioning-warning
                  "Intersecting multiple incompatible base sets belonging to the concepts~%   ~
                   ~S and ~S."
                  (defining-concept (first listOfBaseSets)) 
                  (defining-concept (second listOfBaseSets))))
	       (first listOfBaseSets)))
      (loop for f in classifiedFeatures
	    do (absorb-base-set (base-set f)))
      (when (setq baseSet (winnow-base-sets userBaseSets))
	(return-from compute-initial-base-set baseSet))
      ;; no user base sets found yet
      (loop for s in sourceFeatures
	    do (absorb-base-set (find-base-set-in-source-feature s)))
      (when (setq baseSet (winnow-base-sets userBaseSets))
	(return-from compute-initial-base-set baseSet))
      ;; still no user base sets found yet
      (winnow-base-sets systemBaseSets) )))


(defun find-base-set-in-source-feature (feature)
  ;; Helping function for "compute-base-set";
  ;; Return a base set for "feature" if one exists;
   (flet ((concept--base-set (concept)          	; tar 10/30/96
            (let ((definedSetFeature (defined-set-feature concept)))
	      (and definedSetFeature (base-set definedSetFeature)))))
    (let (baseSet)
      (if (atom feature)
	  (typecase feature
	    (NUMBER (concept--base-set (loom-constant NUMBER)))
	    #+:measures
	    (MS:DIM-NUMBER
	     (concept--base-set (loom-constant MEASURE)))
	    (SET-FEATURE (base-set feature))
	    (UNARY-CONCEPT (concept--base-set feature))
	    (otherwise (concept--base-set (intrinsic-concept feature))))
	  (case (first feature)
	    ((:through :interval++ :interval+- :interval-+ :interval--)
	     (cond ((or (numberp (second feature))
			(numberp (third feature)))
		    (concept--base-set (loom-constant NUMBER)))
		   #+:measures
		   ((or (ms:dim-number-p (second feature))
			(ms:dim-number-p (third feature)))
		    (concept--base-set (loom-constant MEASURE)))
		   (t nil)))
	    (:one-of
	     (let ((lcg (least-common-generalization 
			 (loop for item in (rest feature)
			     collect (intrinsic-concept item)))))
	       (when lcg
		 (concept--base-set lcg))))   ; Was: NIL  ; TAR 4/16/98
	    (:and
	     (loop for ftr in (rest feature)
		  while (null baseSet)
		  do (setq baseSet (find-base-set-in-source-feature ftr)))
	     baseSet)
	    (:or (least-common-generalization 
		  (loop for item in (rest feature)
		      when (find-base-set-in-source-feature item)
		      collect it)))
	    (:not
	     (find-base-set-in-source-feature (second feature))))) )))

(defun compute-intermediate-base-set (initialBaseSet members definingConcept)
  ;; Helping function for "create-set-feature";
  ;; Return two values:
  ;;    (1) The final value of the base set, or nil if the about-to-be-
  ;;        created set feature is its own base set;
  ;;    (2) The name of the class of the about-to-be-created set feature;
  ;; Side-effect: If not returning a nil base set, then remove :base-set
  ;;    attribute from "definingConcept", since it is not
  ;;    defining a pseudo-primitive set;
  ;; Note: Because the set of "members" has now been computed, this computation
  ;;    of a base set may determine a more specific base set than that
  ;;    computed by "compute-initial-base-set";
  ;; Note: The determination of the CLASS of the about-to-be-created
  ;;    set feature happens to be a by-product of the base set computations;
  ;;    otherwise we wouldn't do that here;
  (let (baseSetP orderedP constantP 
	quantitiesOnlyP numbersOnlyP integersOnlyP measuresOnlyP 
	symbolsOnlyP stringsOnlyP intermediateBaseSet)
    (flet ((compute-class-name ()
	     (cond (quantitiesOnlyP
		    'INTERVAL-FEATURE)
	           (orderedP			; must be symbolic interval
                    ;		(when (not symbolsOnlyP)
                    ;		  (conditioning-error "Illegal symbols in ordered set"))
		    'SYMBOLIC-INTERVAL)
	           (t				; only symbols or mixed set
		    'SET-FEATURE)))
	   (add-more-specific-conjunct
	     (concept conjunct)
	     (unless (loop for c in (conjuncts concept)
			  thereis (subconcept-p c conjunct))
	       (push conjunct (conjuncts concept))))	     )
      (when (and initialBaseSet
		 ;; set base-set equal to "initialBaseSet" if that one is
		 ;;    not a system-defined base set
		 (not (system-base-set-p initialBaseSet)))
	;; remove unwanted :base-set attributes from "definingConcept":
	(when (and definingConcept
		   (member :base-set (attributes definingConcept)))
	  (delf (attributes definingConcept) :base-set))
	(return-from compute-intermediate-base-set
	  (values
	    initialBaseSet
	    (CLOS::class-name (CLOS::class-of initialBaseSet))
	    nil)))
      (when (null members)
	(setq initialBaseSet (or initialBaseSet
				 (defined-set-feature (loom-constant CONSTANT))))
	(return-from compute-intermediate-base-set 
	  (values
	    initialBaseSet
	    (CLOS::class-name (CLOS::class-of initialBaseSet))
	    nil)))
      (cond
	((atom members))			; skip analysis if :infinite set
	((loop for m in members 
	     always (or (extended-number-p m)
			(and (intervalp m)
			     (or (extended-number-p (lower-open m))
				 (eq (lower-open m) '-INFINITY))
			     (or (extended-number-p (upper-open m))
				 (eq (upper-open m) '+INFINITY)))))
	 (setq quantitiesOnlyP t)
	 (setq numbersOnlyP t)   ; Temporary, may change in loop below
	 (setq measuresOnlyP t)  ; Temporary, may change in loop below
	 (loop for m in members
	     when (intervalp m)
	     do (cond ((eq (lower-open m) '-INFINITY) nil)
		      ((numberp (lower-open m)) (setq measuresOnlyP nil))
		      (t (setq numbersOnlyP nil)))
		(cond ((eq (upper-open m) 'INFINITY) nil)
		      ((numberp (upper-open m)) (setq measuresOnlyP nil))
		      (t (setq numbersOnlyP nil)))
	     else do (if (numberp m)
			 (setq measuresOnlyP nil)
		         (setq numbersOnlyP nil)))

	 (setq constantP t)
	 (setq orderedP t)
	 (when (loop for m in members always (integerP m))
	   (setq integersOnlyP t)))
	((loop for m in members always (or (symbolp m)
				      ;; MATCHES SYMBOLIC INTERVAL???:
					   (and (intervalp m)
						(symbolp (lower-bnd m))
						(symbolp (upper-bnd m)))))
	 (setq constantP t)
	 (setq symbolsOnlyP t))
	((loop for m in members always (stringp m))
	 (setq constantP t)
	 (setq stringsOnlyP t)))
      (when definingConcept
	(setq baseSetP (member :base-set (attributes definingConcept)))
	(unless orderedP
	  (setq orderedP (member :ordered (attributes definingConcept))))
	(unless constantP
	  (setq constantP
	    (or baseSetP 
		orderedP
		(loop for c in (conjuncts definingConcept)
		    thereis (subconcept-p c (loom-constant CONSTANT))))))
	(cond
	  (constantP
	   (cond
	     (symbolsOnlyP
	      (add-more-specific-conjunct definingConcept (loom-constant SYMBOL)))
             (integersOnlyP             ;  TAR 3/21/96
              (add-more-specific-conjunct definingConcept (loom-constant INTEGER)))
	     (numbersOnlyP
	      (add-more-specific-conjunct definingConcept (loom-constant NUMBER)))
	     (measuresOnlyP
	      (add-more-specific-conjunct definingConcept (loom-constant MEASURE)))
	     (quantitiesOnlyP
	      (add-more-specific-conjunct definingConcept (loom-constant QUANTITY)))
	     (stringsOnlyP
	      (add-more-specific-conjunct definingConcept (loom-constant STRING)))))
	  ((atom members) )		       ; skip analysis if :infinite set
	  ((loop for m in members always (constant-p m))
	   (add-more-specific-conjunct definingConcept (loom-constant CONSTANT))))
	(when baseSetP
	  (return-from compute-intermediate-base-set
	    (values
	      nil
	      (compute-class-name)))))
      ;; compute the intermediate base set:
      (setq intermediateBaseSet
            (cond
	     (integersOnlyP (defined-set-feature (loom-constant INTEGER)))
	     (numbersOnlyP (defined-set-feature (loom-constant NUMBER)))
	     (measuresOnlyP (defined-set-feature (loom-constant MEASURE)))
	     (quantitiesOnlyP (defined-set-feature (loom-constant QUANTITY)))
	     (symbolsOnlyP (defined-set-feature (loom-constant SYMBOL)))
	     (stringsOnlyP (defined-set-feature (loom-constant STRING)))
	     (constantP (defined-set-feature (loom-constant CONSTANT)))
	     (t *allThings*)))
      (values
	(if (and initialBaseSet 
                 (subconcept-p initialBaseSet intermediateBaseSet))
          initialBaseSet
          intermediateBaseSet)
	(compute-class-name)) )))

(defun system-base-set-p (baseSet)
  ;; Return t if "baseSet" is one of allConstants, allSymbols,
  ;;    allStrings, allNumbers, etc.
  (member (name (defining-concept baseSet))
	  '(SYMBOL INTEGER NUMBER STRING MEASURE RATIONAL QUANTITY CONSTANT)) )


  ;;
;;;;;; Classifying Set Features
  ;;

(defmethod pre-classify-concept ((self SET-FEATURE))
  ;; Fill in super-concepts for "self" to make the classifier happy;
  ;; Strategy: If "self" is not its own base set, then its base set
  ;;    is its super concept;  Otherwise, determine the most specific
  ;;    system base set that subsumes "self";
  (flet ((find-matching-conjunct
	   ()
	   ;; Return a most-specific conjunct in "self" with name
	   ;;    matching one of SYMBOL, INTEGER, NUMBER, STRING, or CONSTANT;
	   (let ((conjuncts (conjuncts (defining-concept self))))
	     (loop for name in '(SYMBOL INTEGER NUMBER STRING CONSTANT)
		  do
		  (loop for c in conjuncts
		       when (eq (name c) name)
		       do (return-from find-matching-conjunct c)))
	     (loom-constant THING))))
    (let ((baseSet (base-set self)))
      (setf (super-concepts self)
	    (list
	      (if (neq self baseSet)
		  baseSet
		  ;; because "definingConcept" is not yet classified,
		  ;;    we search its conjuncts for a super concept:
		  (or (defined-set-feature (find-matching-conjunct))
		      ;; THING doesn't point to its defined-set-feature:
		      *allThings*)))) )))

(defmethod compute-starting-points ((self SET-FEATURE))
  ;; Compute a set of nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  ;; Strategy: Return a list of ALL primitive super sets of "self", plus
  ;;    "allThings" if "self" is not a set of constants (otherwise, "allConstants"
  ;;    will be the most general primitive super set);
  ;; Tricky: Its important that "compute-starting-points" finds all possible
  ;;    primitive starting points, but the original list of parents is almost
  ;;    irrelevant;
  ;; TO DO: REWRITE SO THAT SUBSUMPTION OF SET FEATURES IS BACKWARD-CHAINING,
  ;;    SINCE THIS SEARCH CAN BE RATHER TIME-CONSUMING:
  (let* ((baseSet (base-set self))
	 (definingConcept (defining-concept baseSet)))
    (cond
     ((eq self baseSet)
      ;; "self" is its own base set, so we can't use "all-super-concepts",
      ;;     and "definingConcept" is being classified;
      (loop for super in (conjuncts definingConcept)
	    when (defined-set-feature super)
	    collect (defined-set-feature super)))
     ;; "definingConcept" IS classified:
     ((not (subconcept-p definingConcept (loom-constant CONSTANT)))
      (list *allThings*))
     (t 
      (cons baseSet (all-super-concepts baseSet)))) ))

(defmethod parent-is-identical-p ((self SET-FEATURE) parent dontExpandP)
  ;; Return "parent" if the definitions of "self" and "parent"
  ;;    are identical;
  (declare (ignore dontExpandP))
  (when
    (and (eq (base-set self) (base-set parent))
	 (neq (members parent) :infinite-set)
	 #-:measures
	 (set-equal-p (members self) (members parent) :test #'equalp)
	 #+:measures
	 (set-equal-p (members self) (members parent) :test #'ms:dim-equalp)
	 )
    parent) )

(defmethod parent-is-identical-p ((self INTERVAL-FEATURE) parent dontExpandP)
  ;; Return "parent" if the definitions of "self" and "parent"
  ;;    are identical;
  (declare (ignore dontExpandP))
  (when
    (and (eq (base-set self) (base-set parent))
	 (neq (members parent) :infinite-set)
	 #-:measures
	 (equalp (members self) (members parent))
	 #+:measures
	 (ms:dim-equalp (members self) (members parent))
	 )
    parent) )

(defmethod specializes-classified-concept-p
	   ((set1 SET-FEATURE) set2 checkForEqualityFlag dontCheckPrimsFlag)
  ;; Return 't' if "set1" specializes "set2", or :equal if they are
  ;;    equivalent;
  #L:trace-spec (trace-values "specializes-classified-concept-p:" set1 set2) 
  (let (isSubSetP)
    (when (or dontCheckPrimsFlag
	      (eql (concept-is-below-counter (base-set set2))
		   *concept-is-below-pass-counter*))
      (cond
       ((eq (members set2) :infinite-set)
        ;; everything specializes an infinite set:
        t)
       ((setq isSubSetP (subset-p (members set1) (members set2)))
        (return-t-or-equal
         (eq (base-set set1) (base-set set2))
         (eq isSubSetP :equal))))) ))

(defmethod specializes-unclassified-concept-p ((self SET-FEATURE) concept)
  ;; Helping function for "help-find-subsumees";
  ;; Returns 't' iff "self" specializes "concept";
  ;; Note:  In some cases (its safest to assume ALL) "self" must already
  ;;    be classified;
  (and (typep concept 'SET-FEATURE)
       (if (eq (members self) :infinite-set)
         nil
         (specializes-classified-concept-p self concept nil t))) )

(defmethod add-to-search-nodes ((superSet SET-FEATURE) subSet)
  ;; Add "subSet" to the "search-nodes" slot of "superSet" if
  ;;    the classifier should look for it after visiting "superSet";
  ;; Strategy: Don't point at "primitive" set features -- ones that
  ;;    are their own base sets;
  (unless (eq subSet (base-set subSet))
    (addf (search-nodes superSet) subSet)) )


;;
;;;;;; Computation of Algebraic Set Expressions
;;

(defun compute-algebraic-set-expression (algebraicExpression baseSet relativeMembers)
  ;; Return a list containing the members defined by the algebraic
  ;;    expression "algebraicExpression" in the context of the set
  ;;    "baseSet";
  ;; Ground terms within "algebraicExpression" may be literals, set
  ;;    features, or concepts;
  (if (consp algebraicExpression)
      (let ((operator (car algebraicExpression)))
	(ecase operator
	  (:and
	   (compute-set-intersection
	    (rest algebraicExpression) baseSet relativeMembers))
	  (:or (compute-set-union
		(rest algebraicExpression) baseSet relativeMembers))
	  (:not
	   (compute-set-complement
	    (cadr algebraicExpression) baseSet relativeMembers))
	  ((:one-of :the-ordered-set)
	   (normalize-members-of-list
	    baseSet
	    (loop for mem in (remove-duplicates (rest algebraicExpression) 
						:test #'filler-equal)
		collect (validate&encode-set-member baseSet mem
						    :cant-be-interval-p t))))
	  ((:interval++ :interval+- :interval-+ :interval-- :through)
	   (normalize-members-of-list
	    baseSet
	    (list (validate&encode-set-member
		   baseSet
		   (make-interval-segment 
		    (when (member operator '(:interval++ :interval+- :through))
		      (second algebraicExpression))
		    (second algebraicExpression) 
		    (third algebraicExpression)
		    (when (member operator '(:interval++ :interval-+ :through))
		      (third algebraicExpression)))))))) )
    (compute-set-reference algebraicExpression baseSet)) )

(defun compute-set-intersection (conjuncts baseSet relativeMembers)
  ;; Return a list representing the intersection of the expressions
  ;;    "conjuncts" in the context of the set "baseSet";
  ;; Note: The logic is complicated because we take great pains to
  ;;    defer the computation of negated expressions, in order to
  ;;    maximize the chance of generating a value for the "relativeMembers"
  ;;    argument;
  (let (negatedConjuncts positiveConjuncts members)
    (loop for conj in conjuncts
	  when (and (consp conj)
		    (eq (car conj) :not))
	  do (push conj negatedConjuncts))
    (setq positiveConjuncts
	  (if negatedConjuncts
            (loop for conj in conjuncts
                  when (not (member conj negatedConjuncts))
                  collect conj)
            conjuncts))
    (setq members
	  (cond
           (relativeMembers)
           (positiveConjuncts
            (compute-algebraic-set-expression
             (pop positiveConjuncts) baseSet relativeMembers))
           (negatedConjuncts
            (compute-algebraic-set-expression
             (pop negatedConjuncts) baseSet relativeMembers))
           (nil)))
    (loop for conj in positiveConjuncts
	  do
	  (setq members
	        (compute-intersection-of-lists 
		 baseSet
		 members 
		 (compute-algebraic-set-expression conj baseSet members))))
    (loop for conj in negatedConjuncts
	  do
	  (setq members
	        (compute-intersection-of-lists 
		 baseSet
		 members 
		 (compute-set-complement
                  (cadr conj) baseSet members))))
    members ))

(defun compute-set-union (disjuncts baseSet relativeMembers)
  ;; Return a list representing the union of the expressions
  ;;    "disjuncts" in the context of the set "baseSet";
  (let ((members (compute-algebraic-set-expression
		  (first disjuncts) baseSet relativeMembers)))
    (loop for disj in (rest disjuncts)
	  do (setq members (compute-union-of-lists 
		            baseSet
		            members
		            (compute-algebraic-set-expression 
		             disj baseSet relativeMembers))))
    members ))

(defun compute-set-complement (argument baseSet relativeMembers)
  ;; Return a list containing those elements of "baseSet" not belonging
  ;;    to the set represented by "argument";
  (compute-complement-of-lists
   baseSet
   relativeMembers
   (compute-algebraic-set-expression
    argument baseSet relativeMembers)) )


;;
;;;;;; "compute-set-reference" 
;;

;;; Methods to compute references to sets;  The result of calling
;;;    "compute-set-reference" is a list of set members (or interval segments).

(defmethod compute-set-reference (reference baseSet)
  ;; "reference" is not a concept or a set-feature;
  ;; Return a list containing the set represented by "reference" in the
  ;;    context of the set "baseSet";
  (when (not (has-instance-p baseSet reference))
    (conditioning-error "Reference '~S' does not specialize the base set '~S'~%"
			reference baseSet))
  (list reference) )

(defmethod compute-set-reference ((reference SET-FEATURE) baseSet)
  ;; "reference" has already been evaluated -- simply return its members;
  (declare (ignore baseSet))
  (integrity-check (classified-p reference))
  (members reference) )

(defmethod compute-set-reference ((reference UNARY-CONCEPT) baseSet)
  ;; "reference" is a concept whose definition is a set;
  (declare (ignore baseSet))
  (integrity-check (eq (defined-as reference) :set))
  (members (defined-set-feature reference)) )


;;
;;;;;; Local Set functions
;;

(defmethod normalize-members-of-list (baseSet members)
  ;; Return the original UNSORTED list of members;
  ;; Note: "baseSet" appears only because we need a discriminator;
  (declare (ignore baseSet))
  members )

(defmethod compute-intersection-of-lists (baseSet set1 set2)
  ;; Helping method for "compute-set-intersection";
  ;; This version computes the intersection of two finite sets;
  ;; The result is normalized (sorted) if set1 is;
  ;; Note: "baseSet" appears only because we need a discriminator;
  (declare (ignore baseSet))
  (cond
   ((eq set1 :infinite-set) set2)
   ((eq set2 :infinite-set) set1)
   (t (loop for m in set1
	    when (member m set2 :test #'filler-equal)
	    collect m))) )

(defmethod compute-union-of-lists (baseSet set1 set2)
  ;; Helping method for "compute-set-union";
  ;; This version computes the union of two finite sets;
  (declare (ignore baseSet))
  (cond
   ((eq set1 :infinite-set) set1)
   ((eq set2 :infinite-set) set2)
   (t (copy-list (union set1 set2 :test #'filler-equal)))) )

(defmethod compute-complement-of-lists (baseSet relativeMembers set)
  ;; Helping method for "compute-set-complement";
  ;; This version computes the complement of two finite sets;
  (when (and (null relativeMembers)
	     baseSet)
    (setq relativeMembers (members baseSet)))
  (when (eq relativeMembers :infinite-set)
    (conditioning-error "Can't compute the complement for ~S" set))
  (set-difference relativeMembers set :test #'filler-equal) )

(defun subset-p (set1 set2)
  ;; This is the main work-horse for comparing two sets --
  ;;    "set1" and "set2" are expected to be lists of objects;
  ;; Return t or :equal if "set1" specializes or is equivalent to "set2";
  (let ((length1 (length set1))
	(length2 (length set2)))
    (cond
     ((> length1 length2) nil)
     ((loop for i in set1 
	  always #-:measures (member i set2 :test #'equalp)
		 #+:measures (member i set2 :test #'ms:dim-equalp))
      (if (= length1 length2) :equal t))) ))


;;
;;;;;; Encode/decode functions and methods
;;

;;; "validate&encode-set-member" first verifies that a member belongs to
;;;    a set, and if so returns the (possibly encoded) member.
;;; "encode-set-member" is faster because it does no validation, and
;;;     doesn't handle +INFINITY or -INFINITY, or variations
;;;     thereof.

(defun validate&encode-set-member (baseSet member &key cant-be-interval-p)
  ;; Verify that "member" belongs to "baseSet";
  ;; If so, return "member" unencoded;
  (or (help-validate-set-member baseSet member :cant-be-interval-p cant-be-interval-p)
      (conditioning-error "Reference '~S' does not specialize the base set '~S'~%"
			member baseSet)) )

(defmethod help-validate-set-member
	   (baseSet member &key lower-bound upper-bound cant-be-interval-p)
  ;; Return "member" UNENCODED if it is an instance of "baseSet";
  (declare (ignore lower-bound upper-bound cant-be-interval-p))
  ;; Since LIST objects are now constants, this logic is flawed and therefore
  ;;   eliminated:  TAR 10/6/97
;  (when (and (null baseSet)
;	     (and (consp member)
;                  (or cant-be-interval-p
;		      (not (numberp (first member)))
;                      (not (numberp (second member))))))
;    (conditioning-error "Can't determine the type of one of the individuals ~S and ~S.
;The type must be a concept that specializes the concept CONSTANT.  Possibly,
;redefining an existing concept to specialize CONSTANT or one of its
;descendants will fix the problem."
;                        (first member)
;                        (second member)))
  (when (or (null baseSet)
	    (and (eq (members baseSet) :infinite-set)
		 (belongs-to-base-set-p member baseSet))	; TAR 1/14/98
	    (has-instance-p baseSet member))
    member) )

(defmethod help-validate-set-member
	   ((baseSet INTERVAL-FEATURE) member &key lower-bound upper-bound cant-be-interval-p)
  ;; Return "member" UNENCODED if it is an instance of "baseSet";
  ;; "member" is an integer or segment;
  (declare (ignore lower-bound upper-bound))
  (when (not (extended-number-p member))
    (if cant-be-interval-p
	(conditioning-error "Illegal set member: ~S can't be in ~S" member baseSet)
      (let ((lowerBound (lower-bnd member))
	    (upperBound (upper-bnd member)))
	(unless (or (extended-number-p lowerBound)
		    (eq lowerBound '-INFINITY))
	  (conditioning-error "Illegal lower bound ~S" lowerBound))
	(unless (or (extended-number-p upperBound)
		    (eq upperBound '+INFINITY))
	  (conditioning-error "Illegal upper bound ~S" upperBound))))
    ;; return interval even if it exceeds bounds of base set (since it
    ;;    will get truncated later on):
    (return-from help-validate-set-member member))
  (when (and (or (intervalp member)	; TAR 1/14/98
		 (belongs-to-base-set-p member baseSet))
	     (loop for segment in (members baseSet)
		   thereis (subsegment-p member segment)))
    member) )

(defmethod help-validate-set-member
	   ((baseSet INTERVAL-FEATURE) (member SYMBOL) &key lower-bound upper-bound cant-be-interval-p)
  ;; Situation: "baseSet" is a NON-SYMBOLIC interval, and "member" is a
  ;;    symbol which must represent either +INFINITY or -INFINITY;
  ;; If so, return either +INFINITY or -INFINITY;
  (declare (ignore cant-be-interval-p))
  (cond
    (lower-bound
     (when (member member '(-INFINITY -INF nil))
       '-INFINITY))
    (upper-bound
     (when (member member '(+INFINITY INFINITY +INF INF nil))
       '+INFINITY))) )

(defmethod help-validate-set-member
	   ((baseSet SYMBOLIC-INTERVAL) member &key lower-bound upper-bound)
  ;; Return the integer which corresponds to the position
  ;;    of "member" in the symbols of "baseSet",
  ;; OR, if "member" is a CONS, encode it's CAR and CDR;
  ;; Include check for bad end-point in interval-segment;
  (declare (ignore lower-bound upper-bound))
  (cond
    ((intervalp member)
     (unless
       (and 
	(setf (lower-open member)
	  (help-validate-set-member baseSet (lower-open member) :lower-bound t))
	(setf (upper-open member)
	    (help-validate-set-member baseSet (upper-open member) :upper-bound t)))
       (conditioning-error "End-point of interval `~S` not found in base set '~S'"
			   member baseSet))
     ;; If the intervals are closed, update the closed endpoints as well.
     ;; NOTE: We don't check if the open and exact values were the same, but
     ;;       since this is all generated internally by Loom code, it should
     ;;       never be incorrect.
     (when (lower-exact member)
       (setf (lower-exact member) (lower-open member)))
     (when (upper-exact member)
       (setf (upper-exact member) (upper-open member)))
     member)
    (t
     (position member (symbols baseSet)))) )

(defmethod encode-set-member (set member)
  ;; The default method just returns "member";
  (declare (ignore set))
  member )

(defmethod encode-set-member ((interval SYMBOLIC-INTERVAL) member)
  ;; Return the position of "member" in the list of symbols of
  ;;    the base set of "interval";
  (position member (symbols (base-set interval))) )

(defmethod decode-set-member (set member)
  ;; The default method just returns "member";
  (declare (ignore set))
  member )

(defmethod decode-set-member ((interval SYMBOLIC-INTERVAL) member)
  ;; Return the symbol in the base set of "interval" whose
  ;;    position is "member";
  (nth member (symbols (base-set interval))) )


   ;;
  ;;;;
;;;;;;;; Intervals
  ;;;;
   ;;

;;; The code below defines the functions which support reasoning and
;;;    classification over intervals.  Intervals are represented internally
;;;    as lists of "segments" -- a segment is an interval
;;;    all of whose members are contiguous (or continuous if its a real
;;;    interval;  Segments are represented by objects of type
;;;    NUMBER and CONS.   An integer k is considered to be a specialized
;;;    encoding of the (closed) segment [k,k].  A CONS
;;;    represents a segment by storing values for the lower-bound
;;;    and upper-bound in the CAR and CDR cells, respectively.
;;;  Note:  We use the test "extended-number-p" to determine when we
;;;     are seeing infinity or minus-infinity (i.e., the code doesn't care
;;;     whether infinity is the symbol INFINITY, INF, FOO, etc.
;;; Note:  At present, we can only represent and reason with CLOSED segments.


  ;;
;;;;;; External methods for Intervals
  ;;

(defmethod specializes-classified-concept-p ((interval1 INTERVAL-FEATURE) interval2 
					     checkForEqualityFlag dontCheckPrimsFlag)
  ;; Return 't' if "interval1" specializes "interval2", or :equal if
  ;;    they are equivalent;
 #L:trace-spec (trace-values "specializes-classified-concept-p:" interval1 interval2)
  (when (or dontCheckPrimsFlag 
	    (eq (concept-is-below-counter (base-set interval2))
		*concept-is-below-pass-counter*))
    (typecase interval2
      (INTERVAL-FEATURE
       (when (subinterval-p (members interval1) (members interval2))
	 (return-t-or-equal
	   (= (length (members interval1))
	      (length (members interval2)))
	   (eq (base-set interval1) (base-set interval2))
	   (equal-intervals-p (members interval1) (members interval2)))))
      (otherwise
       ;; see if "interval1" specializes a numeric subset of "interval2":
       ;; note: numeric intervals dont specialize "allStrings" or "allSymbols" --
       ;;    they DO specialize "allConstants", but that is marked as already
       ;;    visited???;
       (let (collectedNumbers2)
	 (and (neq (members interval2) :infinite-set)
	      (setq collectedNumbers2
		    (loop for i in (members interval2)
			 when (extended-number-p i)
			 collect i))
	      (subinterval-p
		(members interval1)
		(normalize-interval collectedNumbers2 
                                    (compute-quantum collectedNumbers2)))))))) )


;;; Entries for Intersection, Union, and Complement of Intervals

(defmethod normalize-members-of-list ((baseInterval INTERVAL-FEATURE) members)
  ;; Generate normalized form for the segment members of "self";
  (flet ((numeric-non-point-segment-p (segment)
	   ;; Return t if the lower and upper bounds of "segment" are
	   ;;    numbers, and if "segment" is not a number;
	   (and (not (extended-number-p segment))
	        (extended-number-p (lower-bnd segment))
	        (extended-number-p (upper-bnd segment)))))
    (let ((backwardSegment (loop for segment in members
			       when (and (numeric-non-point-segment-p segment)
					 #+:measures
					 (ms:dim> (lower-bnd segment) (upper-bnd segment))
					 #-:measures
					 (> (lower-bnd segment) (upper-bnd segment))
					 )
                                 return segment))
	  firstMember LastMember)
      (when backwardSegment
	(setq firstMember (lower-bnd (car (members baseInterval)))) 
	(setq lastMember (upper-bnd (car (last (members baseInterval)))))
	(cond
	  ((circular-p baseInterval)
	   ;; convert a backwards segment into two normal segments
	   (setq members
		 (loop for segment in members
		      append
		      (cond
		       ((or (not (numeric-non-point-segment-p segment))
			    #+:measures
			    (ms:dim<= (lower-bnd segment) (upper-bnd segment))
			    #-:measures
			    (<= (lower-bnd segment) (upper-bnd segment))
			    )
			 (list segment))
			(t
			 (list (make-interval firstMember firstMember
					      (upper-bnd segment) (upper-bnd segment))
			       (make-interval (lower-bnd segment) (lower-bnd segment)
					      lastMember lastMember)))))))
	  
	  (t
	   (conditioning-error "Lower bound exceeds upper bound in the interval '~S'"
			       backwardSegment)))) 
      (normalize-interval members       ;  TAR 3/21/96
                          (cond ((eq (defining-concept baseInterval)
                                     (loom-constant INTEGER))
                                 1)
                                ((eq (defining-concept baseInterval)
                                     (loom-constant NUMBER))
                                 0)
				((eq (defining-concept baseInterval)
                                     (loom-constant MEASURE))
                                 0)
				;; Symbolic intervals:
				((not (subconcept-p (defining-concept baseInterval)
						    (loom-constant QUANTITY)))
				 1)
                                (t (compute-quantum members)))) )))

(defmethod compute-intersection-of-lists 
	   ((baseInterval INTERVAL-FEATURE) interval1 interval2)
  ;; Helping method for "compute-set-intersection";
  ;; This version computes the intersection of two intervals;
  ;; Note: "baseInterval" appears only because we need a discriminator; 
  (cond ((eq interval2 :infinite-set) interval1)
        ((eq interval1 :infinite-set) interval2)
        (t (intersection--interval interval1 interval2))) )

(defun compute-quantum (list)
  ;; Situation: We are trying to combine interval values and need a quantum;
  ;;    If "list" contains only integers, then the quantum is 1 otherwise 0;
  (if (loop for item in list always (integerp item))
    1
    0))

(defmethod compute-union-of-lists
	   ((baseInterval INTERVAL-FEATURE) interval1 interval2)
  ;; Helping method for "compute-set-union";
  ;; This version computes the union of intervals (for real 
  ;;    numbers, "quantum" should be "zero", for integers "one");
  ;; Note: "baseInterval" appears only because we need a discriminator;
  ;; The first case should never happen.  The second case can occur
  ;;   when number is in a disjunction with other sets.
  (cond ; ((eq interval1 :infinite-set) interval1)
	((eq interval2 :infinite-set) interval2)
	(t (union--interval interval1 interval2 (* (compute-quantum interval1)
						   (compute-quantum interval2))))) )

(defmethod compute-complement-of-lists
	   ((baseInterval INTERVAL-FEATURE) relativeMembers interval)
  ;; Helping method for "compute-set-complement";
  ;; This version computes the complement of two intervals;
  (declare (ignore relativeMembers))
  (complement--interval (members baseInterval) interval) )


  ;;
;;;;;; Local Interval Functions
  ;;

;;; The following functions allow objects of type INTEGER, CONS, and 
;;;    OPEN-SEGMENT to be treated uniformly:

;(defmethod lower-bound ((i integer))
;  i )
;
;(defmethod upper-bound ((i integer))
;  i )
;
;(defmethod lower-bound ((i cons))
;  (car i) )
;
;(defmethod upper-bound ((i cons))
;  (cdr i) )

(defun lower-bnd (segment)
  ;; Compute the lower-bound of the segment "segment";
  ;; Note:  We use a function here because a method is too slow;
   (cond
     ((extended-number-p segment) segment)
     ((intervalp segment) (lower-open segment))
     ((symbolp segment) segment)
     (t (break) (car segment))) )

(defun upper-bnd (segment)
  ;; Compute the lower-bound of the segment "segment";
  ;; Note:  We use a function here because a method is too slow;
   (cond
     ((extended-number-p segment) segment)
     ((intervalp segment) (upper-open segment))
     ((symbolp segment) segment)
     (t (break) (cdr segment))) )

;;; Intersection, Union, and Complement

(defun compute-lower-exact (i1 i2 lbi1 lbi2)
  ;; Computes the lower exact value for overlapping intervals i1 and i2;
  ;;   lbi1 and lbi2 are cached lower bounds.
  ;; Helping function for "intersection--interval";
  (cond ((and (lower-exact i1) (lower-exact i2))
	 (max-lower-bound lbi1 lbi2))
	((lower-exact i1)
	 (when (and (extended-number-p lbi1)
		    (or (not (extended-number-p lbi2))
			#+:measures (ms:dim> lbi1 lbi2)
			#-:measures (> lbi1 lbi2)))
	   lbi1))
	((lower-exact i2)
	 (when (and (extended-number-p lbi2)
		    (or (not (extended-number-p lbi1))
			#+:measures (ms:dim> lbi2 lbi1)
			#-:measures (> lbi2 lbi1)))
	   lbi2))
	(t nil)))

(defun compute-upper-exact (i1 i2 ubi1 ubi2)
  ;; Computes the upper exact value for overlapping intervals i1 and i2;
  ;;   ubi1 and ubi2 are cached upper bounds.
  ;; Helping function for "intersection--interval";
  (cond ((and (upper-exact i1) (upper-exact i2))
	 (min-upper-bound ubi1 ubi2))
	((upper-exact i1)
	 (when (and (extended-number-p ubi1)
		    (or (not (extended-number-p ubi2))
			#+:measures (ms:dim< ubi1 ubi2)
			#-:measures (< ubi1 ubi2)))
	   ubi1))
	((upper-exact i2)
	 (when (and (extended-number-p ubi2)
		    (or (not (extended-number-p ubi1))
			#+:measures (ms:dim< ubi2 ubi1)
			#-:measures (< ubi2 ubi1)))
	   ubi2))
	(t nil)))

(defun i1-ends-after-i2-starts-p (i1 i2 ubi1 lbi2)
  ;; Computes whether i1 ends after i2 starts.  Also returns T
  ;;   if the two intervals meet in a common point.
  ;; NOTE:  i1 and i2 are not necessarily interval objects!
  (or (not (extended-number-p ubi1))
      (not (extended-number-p lbi2))
      #+:measures
      (ignore-errors (ms:dim> ubi1 lbi2))
      #-:measures
      (> ubi1 lbi2)
      (cond ((and (not (intervalp i1))
		  (not (intervalp i2)))
	     #+:measures
	     (ms:dim= i1 i2)
	     #-:measures
	     (= i1 i2))
	    ((not (intervalp i2))
	     (and (upper-exact i1)
		  (filler-equal (upper-exact i1) lbi2)))
	    ((not (intervalp i1))
	     (and (lower-exact i2)
		  (filler-equal (lower-exact i2) ubi1)))
	    (t (and (upper-exact i1)
		    ; (lower-exact i2)  ;; Subsumed by next test:
		    (filler-equal (upper-exact i1) (lower-exact i2)))))))

(defun intersection--interval (interval1 interval2)
  ;; Return an interval representing the intersection of "interval1"
  ;;    and "interval2";
  ;; "interval1" and "interval2" must be normalized;  The result is normalized;
  (prog (i1 i2 result)
   TOP-OF-LOOP
    (when (or (null interval1) (null interval2))
      (return (nreverse result)))
    (setq i1 (car interval1))
    (setq i2 (car interval2))
    (let ((lbi1 (lower-bnd i1))
	  (ubi1 (upper-bnd i1))
	  (lbi2 (lower-bnd i2))
	  (ubi2 (upper-bnd i2)))
; #(0 0 3 3)      #(NIL 3 6 NIL)  (3)               
      (when (and (i1-ends-after-i2-starts-p i1 i2 ubi1 lbi2)
		 (i1-ends-after-i2-starts-p i2 i1 ubi2 lbi1))
	;; "i1" and "i2" overlap; push their intersection
	(if (and (intervalp i1) (intervalp i2))
	    (push (make-interval-segment
		   (compute-lower-exact i1 i2 lbi1 lbi2)
		   (max-lower-bound lbi1 lbi2)
		   (min-upper-bound ubi1 ubi2)
		   (compute-upper-exact i1 i2 ubi1 ubi2))
		  result)
	  (push (if (intervalp i1) i2 i1) result))
	;; pop the lower of the two intervals (or both)
	(when (or (not (extended-number-p ubi2))
		  (and (extended-number-p ubi1)
		       #+:measures
		       (ignore-errors (ms:dim<= ubi1 ubi2))
		       #-:measures
		       (<= ubi1 ubi2)))
	  (pop interval1))
	(when (or (not (extended-number-p ubi1))
		  (and (extended-number-p ubi2)
		       #+:measures
		       (ignore-errors (ms:dim<= ubi2 ubi1))
		       #-:measures
		       (<= ubi2 ubi1)))
	  (pop interval2))
	(go TOP-OF-LOOP))
      ;; either "i1" is entirely below "i2" or "i2" is entirely below "i1" --
      ;;    pop one of them:
      (cond
       ((and (extended-number-p ubi1)
	     (extended-number-p lbi2)
	     #+:measures
	     (ignore-errors (ms:dim< ubi1 lbi2))
	     #-:measures
	     (< ubi1 lbi2))
	(pop interval1))
       (t
	(pop interval2)))) 
    (go TOP-OF-LOOP)))

#| Intersection Test:

(loop for j1 on '(#(0 0 6 6) #(NIL 0 6 NIL) #(0 0 3 3) #(NIL 0 3 NIL)
		  #(2 2 5 5) #(NIL 2 5 NIL) #(3 3 6 6) #(NIL 3 6 NIL))
    do (loop for j2 in (rest j1)
	   do (format t "~%~16A~16A~18A" 
		      (first j1) 
		      j2
		      (loom::intersection--interval (list (first j1)) (list j2)))))

 ==>

#(0 0 6 6)      #(NIL 0 6 NIL)  (#(NIL 0 6 NIL))  
#(0 0 6 6)      #(0 0 3 3)      (#(0 0 3 3))      
#(0 0 6 6)      #(NIL 0 3 NIL)  (#(NIL 0 3 NIL))  
#(0 0 6 6)      #(2 2 5 5)      (#(2 2 5 5))      
#(0 0 6 6)      #(NIL 2 5 NIL)  (#(NIL 2 5 NIL))  
#(0 0 6 6)      #(3 3 6 6)      (#(3 3 6 6))      
#(0 0 6 6)      #(NIL 3 6 NIL)  (#(NIL 3 6 NIL))  
#(NIL 0 6 NIL)  #(0 0 3 3)      (#(NIL 0 3 3))    
#(NIL 0 6 NIL)  #(NIL 0 3 NIL)  (#(NIL 0 3 NIL))  
#(NIL 0 6 NIL)  #(2 2 5 5)      (#(2 2 5 5))      
#(NIL 0 6 NIL)  #(NIL 2 5 NIL)  (#(NIL 2 5 NIL))  
#(NIL 0 6 NIL)  #(3 3 6 6)      (#(3 3 6 NIL))    
#(NIL 0 6 NIL)  #(NIL 3 6 NIL)  (#(NIL 3 6 NIL))  
#(0 0 3 3)      #(NIL 0 3 NIL)  (#(NIL 0 3 NIL))  
#(0 0 3 3)      #(2 2 5 5)      (#(2 2 3 3))      
#(0 0 3 3)      #(NIL 2 5 NIL)  (#(NIL 2 3 3))    
#(0 0 3 3)      #(3 3 6 6)      (3)               
#(0 0 3 3)      #(NIL 3 6 NIL)  NIL               
#(NIL 0 3 NIL)  #(2 2 5 5)      (#(2 2 3 NIL))    
#(NIL 0 3 NIL)  #(NIL 2 5 NIL)  (#(NIL 2 3 NIL))  
#(NIL 0 3 NIL)  #(3 3 6 6)      NIL               
#(NIL 0 3 NIL)  #(NIL 3 6 NIL)  NIL               
#(2 2 5 5)      #(NIL 2 5 NIL)  (#(NIL 2 5 NIL))  
#(2 2 5 5)      #(3 3 6 6)      (#(3 3 5 5))      
#(2 2 5 5)      #(NIL 3 6 NIL)  (#(NIL 3 5 5))    
#(NIL 2 5 NIL)  #(3 3 6 6)      (#(3 3 5 NIL))    
#(NIL 2 5 NIL)  #(NIL 3 6 NIL)  (#(NIL 3 5 NIL))  
#(3 3 6 6)      #(NIL 3 6 NIL)  (#(NIL 3 6 NIL))  

|#

(defun union--interval (interval1 interval2 quantum)
  ;; Return an interval representing the union of "interval1"
  ;;    and "interval2";
  (normalize-interval (append interval1 (copy-list interval2)) quantum) )

(defun complement--interval (baseInterval interval)
  ;; Return an interval representing the complement of "interval", i.e.,
  ;;    "baseInterval" minus "interval";
  ;; If "interval" is normalized, then the result will be normalized;
  ;; Note: Assumes that "baseInterval" contains "interval";
  (let ((baseSegment (car baseInterval))
	result nextSegment currentSegment)
    (setq nextSegment (car interval))
    (when (null nextSegment)
	(return-from complement--interval baseSegment))
    (unless (intervalp baseSegment)
      (return-from complement--interval 
	(if #+:measures (ms:dim-eql baseSegment nextSegment)
	    #-:measures (eql baseSegment nextSegment)
	  nil
	  baseSegment)))
    ;; At this point baseSegment is guaranteed to be an INTERVAL ARRAY:
    ;; Add a beginning segment if needed:
    (when (or (not #+:measures
		   (ms:dim-eql (lower-bnd nextSegment) 
			       (lower-bnd baseSegment))
		   #-:measures
		   (eql (lower-bnd nextSegment) 
			 (lower-bnd baseSegment)))
	      (and (intervalp nextSegment)
		   (not (lower-exact nextSegment))))
      (push (make-interval-segment
	     (lower-exact baseSegment)
	     (lower-bnd baseSegment)
	     (lower-bnd nextSegment)
	     (if (or (not (intervalp nextSegment))
		     (lower-exact nextSegment))
		 nil
	       (lower-bnd nextSegment)))
	    result))
    (loop for tail on interval
	while (rest tail)
	do (setq currentSegment nextSegment
		 nextSegment (cadr tail))
	   (push (make-interval-segment
		  (if (or (not (intervalp currentSegment))
			  (upper-exact currentSegment))
		      nil
		    (upper-bnd currentSegment))
		  (upper-bnd currentSegment)
		  (lower-bnd nextSegment)
		  (if (or (not (intervalp nextSegment))
			  (lower-exact nextSegment))
		      nil
		    (lower-bnd nextSegment)))
		 result))
    (when (or (not #+:measures (ms:dim-eql (upper-bnd nextSegment) 
					   (upper-bnd baseSegment))
		   #-:measures (eql (upper-bnd nextSegment) 
				     (upper-bnd baseSegment)))
	      (and (intervalp nextSegment)
		   (not (upper-exact nextSegment))))
      (push (make-interval-segment
	     (if (or (not (intervalp nextSegment))
		     (upper-exact nextSegment))
		 nil
	       (upper-bnd nextSegment))
	     (upper-bnd nextSegment)
	     (upper-bnd baseSegment)
	     (upper-exact baseSegment))
	    result))
    (nreverse result) ))

;;; Subsumption Test for Intervals:
;;; A subsumption test applied to two intervals returns
;;;    true if the first interval is a subinterval of the second.
;;;    This test is valid only for lists that have been put
;;;    into a canonical form: they must be sorted, and adjoining segments
;;;    must not overlap -- if they do overlap, they should be combined 
;;;    into a single wider segment.
;;; Note:  It may happen that multiple elements in the first list may all
;;;    specialize a single segment in the second list.    For example,
;;;    the number 5 specializes itself, and also the segment [3,5].  

;;; Helping functions for the method "specializes-classified-concept-p"
;;;    applied to INTERVAL-FEATURES:

(defun subinterval-p (interval1 interval2)
  ;; Determine whether the segments in the list "interval1"
  ;;    define a subset of the segments in the list "interval2";
  ;; Note: "interval1" and "interval2" are LISTS;
  ;; Note: This algorithm assumes that the segments have been
  ;;    sorted, and that they don't overlap, and that "adjacent"
  ;;    intervals have been combined;
  (loop for i in interval1 do
       ;; pop "interval2" while "i" can't specialize "(car interval2)"
       (loop
	    (when (null interval2)
		(return-from subinterval-p nil))
            (when (subsegment-p i (car interval2))
		(return))
	    ;; pop "interval2" while "i" can't specialize "(car interval2)"
	    (pop interval2)))
  t )

(defun equal-interval-p (interval1 interval2)
  ;; Situation:  "interval1" and "interval2" are both INTERVAL objects.
  ;; Return t iff "interval1" and "interval2" are equivalent.
  (declare (type (vector t 4) interval1 interval2)
	   (optimize (speed 3) (safety 0)))
  #+:measures
  (loop for i fixnum from 0 to 3
      always (ms:dim-eql (aref interval1 i) (aref interval2 i)))
  #-:measures
  (equalp interval1 interval2) )

;;; "subsegment-p":  This function compute subset predicates
;;;    for interval-objects, cons-intervals, and integers; the
;;;    methods "lower-bound" and "upper-bound" play games to make
;;;    the behavior of these different types of objects appear uniform


(defun subsegment-p (i j)
  ;; Computes subset relation for integers and cons-intervals;
  ;; Special logic handles the cases lower-bound = -INFINITY (minus infinity)
  ;;    and  upper-bound = INFINITY (plus infinity)
  ;; Note: This only works for objects to which the methods
  ;;    "lower-bound" and "upper-bound" apply
  (flet ((point-in-segment-p (pt segment)
	   (and (or (not (extended-number-p (lower-open segment))) ; lower-bound = -INFINITY?
		    (and (extended-number-p pt)
			 (or #+:measures
			     (and (ms:dim-same-units-p pt (lower-open segment))
				  (ms::sdim> pt (lower-open segment)))
			     #-:measures
			     (> pt (lower-open segment))
			     (and (lower-exact segment)
				  #+:measures
				  (and (ms:dim-same-units-p pt (lower-exact segment))
				       (ms::sdim= pt (lower-exact segment)))
				  #-:measures
				  (= pt (lower-exact i))))))
		(or (not (extended-number-p (upper-open segment))) ; upper-bound = +INFINITY?
		    (and (extended-number-p pt)
		    (or #+:measures
			(and (ms:dim-same-units-p pt (upper-open j))
			     (ms::sdim< pt (upper-open j)))
			#-:measures
			(< pt (upper-open j))
			(and (upper-exact segment)
			     #+:measures
			     (and (ms:dim-same-units-p pt (upper-exact segment))
				  (ms::sdim= pt (upper-exact segment)))
			     #-:measures
			     (= pt (upper-exact segment)))))))) )
    (cond ((and (intervalp i) (intervalp j))
	   (and (or (not (extended-number-p (lower-open j))) ; lower-bound = -INFINITY?
		    (and (extended-number-p (lower-open i))
			 (if (or (lower-exact j) (not (lower-exact i)))
			     #+:measures
			     (and (ms:dim-same-units-p (lower-open j) (lower-open i))
				  (ms::sdim<= (lower-open j) (lower-open i)))
			     #-:measures
			     (<= (lower-open j) (lower-open i))

			     #+:measures
			     (and (ms:dim-same-units-p (lower-open j) (lower-open i))
				  (ms::sdim< (lower-open j) (lower-open i)))
			     #-:measures
			     (< (lower-open j) (lower-open i)))))
		(or (not (extended-number-p (upper-open j))) ; upper-bound = +INFINITY?
		    (and (extended-number-p (upper-open i))
			 (if (or (upper-exact j) (not (upper-exact i)))
			     #+:measures
			     (and (ms:dim-same-units-p (upper-open j) (upper-open i))
				  (ms::sdim>= (upper-open j) (upper-open i)))
			     #-:measures
			     (>= (upper-open j) (upper-open i))

			     #+:measures
			     (and (ms:dim-same-units-p (upper-open j) (upper-open i))
				  (ms::sdim> (upper-open j) (upper-open i)))
			     #-:measures
			     (> (upper-open j) (upper-open i)))))))
	  ((intervalp i)
	   nil)
	  ((intervalp j)
	   (point-in-segment-p i j))
	  (t ;; Both i and j are point measures!
	   #+:measures (ms:dim-eql i j)
	   #-:measures (eql i j))) ))

(defun equal-intervals-p (interval1 interval2)
  ;; Return t iff "interval1" and "interval2" are equivalent (these
  ;;    are LISTs, not objects);
  (and (= (length interval1) (length interval2))
       (loop for i in interval1
	   as j in interval2
	   always #+:measures (if (and (intervalp i) (intervalp j))
				  (equal-interval-p i j)
				  (equal i j))
		  #-:measures (equalp i j))) )

;;; Converting interval into canonical form:

(defun normalize-interval (interval quantum)
  ;; Return an interval (a list) for which all segments
  ;;    are sorted, none of them overlap, and adjacent
  ;;    intervals (separated by "quantum") have been merged;
  (setq interval
	(sort interval 'less-than--interval-segment))
  (loop for tail on interval
      do
	(let ((segment (first tail))
	      (nextSegment (second tail)))
	 ;; test for overlapping or adjacent segments
	  (when (and (cdr tail)
		     (or (not (extended-number-p (upper-bnd segment)))     ;; +INFINITY
			 (not (extended-number-p (lower-bnd nextSegment))) ;; -INFINITY
			 ;; Check for strict overlap!
			 #+:measures
			 (and (ms:dim-same-units-p (upper-bnd segment)
						   (lower-bnd nextSegment))
			      (ms::sdim> (upper-bnd segment) (lower-bnd nextSegment)))
			 #-:measures
			 (> (upper-bnd segment) (lower-bnd nextSegment))
			 ;; Check for end point equality with quantum effects!
			 (and (or (not (intervalp segment))
				  (upper-exact segment)
				  (not (intervalp nextSegment))
				  (lower-exact nextSegment))
			      #+:measures
			      (ms:dim-eql (if (ms:dim-zerop quantum)
					      (upper-bnd segment)
					    (ms:dim+ (upper-bnd segment) quantum))
					  (lower-bnd nextSegment))
			      #-:measures
			      (= (+ (upper-bnd segment) quantum)
				 (lower-bnd nextSegment)))
			 ))
	    (setf (cadr tail)
	      (make-interval-segment
	       (if (intervalp segment)
		   (lower-exact segment)
		 (lower-bnd segment))  ;; If SEGMENT is not an interval, it's a constant
	       (lower-bnd segment)
	       (max-upper-bound
		(upper-bnd segment) (upper-bnd nextSegment))
	       (cond (#+:measures
		      (and (ms:dim-same-units-p (upper-bnd segment)
						(upper-bnd nextSegment))
			   (ms::sdim> (upper-bnd segment) (upper-bnd nextSegment)))
		      #-:measures
		      (> (upper-bnd segment) (upper-bnd nextSegment))
		      ;; Note, for this to be true, Segment must be intervalp!
		      (upper-exact segment))
		     (#+:measures
		      (and (ms:dim-same-units-p (upper-bnd segment)
						(upper-bnd nextSegment))
			   (ms::sdim< (upper-bnd segment) (upper-bnd nextSegment)))
		      #-:measures
		      (< (upper-bnd segment) (upper-bnd nextSegment))
		      ;; Note, for this to be true, nextSegment must be intervalp or quantum is > 0
		      (if (intervalp nextSegment)
			  (upper-exact nextSegment)
			  nextSegment))
		     ((and (intervalp segment) (intervalp nextSegment))
		      (or (upper-exact segment) (upper-exact nextSegment)))
		     (t ;; Bounds are equal, one is a constant
		      (upper-bnd segment)))
	       ))
	    (setf (car tail) nil))
	  ;; test for singleton segment
	  (when (and (intervalp segment)
		     (or (eql (lower-bnd segment) (upper-bnd segment))
			 (and (extended-number-p (lower-bnd segment))
			      (extended-number-p (upper-bnd segment))
			      #+:measures
			      (ms:dim-eql (lower-bnd segment) (upper-bnd segment))
			      #-:measures
			      (= (lower-bnd segment) (upper-bnd segment))))) 
	    (setf (car tail) 
	      (or (lower-exact segment) (upper-exact segment))))))
  (delete NIL interval) )
  
#|
;; Test cases:

(setq *tests* 
  (list (list (list (make-interval-segment 0 0 5 5) (make-interval-segment 5 5 10 10)) 0)
	(list (list (make-interval-segment 0 0 5 5) (make-interval-segment 6 6 10 10)) 1)
	(list (list (make-interval-segment 0 0 5 5) (make-interval-segment 6 6 10 10)) 0)
	(list (list 7 (make-interval-segment 7 7 10 10)) 1)
	(list (list 6 (make-interval-segment 7 7 10 10)) 0)
	(list (list 7 (make-interval-segment 7 7 10 10)) 0)
	(list (list 7 (make-interval-segment nil 7 10 10)) 0)
	(list (list (make-interval-segment 0 0 15 15) (make-interval-segment 6 6 10 10)) 1)
	(list (list (make-interval-segment 0 0 15 15) (make-interval-segment 6 6 10 NIL)) 1)
	(list (list (make-interval-segment 0 0 15 NIL) (make-interval-segment 6 6 10 10)) 1)
	(list (list (make-interval-segment 0 0 15 15) (make-interval-segment NIL 6 10 NIL)) 1)
	(list (list (make-interval-segment NIL 0 15 NIL) (make-interval-segment 0 0 10 10)) 1)
	(list (list (make-interval-segment NIL 0 15 NIL) (make-interval-segment NIL 0 10 10)) 1)
	(list (list (make-interval-segment NIL 0 15 NIL) (make-interval-segment 1 1 10 10)) 1)
	(list (list (make-interval-segment NIL 0 15 NIL) 3 4 (make-interval-segment 1 1 10 10)
		    (make-interval-segment 1 1 5 5) (make-interval-segment NIL 8 12 NIL)) 0)
	(list (list (make-interval-segment NIL 0 15 NIL) 3 4 (make-interval-segment 1 1 10 10)
		    (make-interval-segment 1 1 5 5) (make-interval-segment NIL 8 12 NIL)) 1)))

(loop for (ints quant) in *tests*
    do (print (normalize-interval ints quant)))

;; => ([0 0 10 10])
;; => ([0 0 10 10])
;; => ([0 0 5 5] [6 6 10 10])
;; => ([0 0 10 10])
;; => ([0 0 5 5] 6 [7 7 10 10])
;; => ([6 6 10 10])
;; => ([7 7 10 10])
;; => (6 [7 7 10 10])
;; => ([7 7 10 10])
;; => ([7 7 10 10])
;; => ([0 0 15 15])
;; => ([0 0 15 15])
;; => ([0 0 15 NIL])
;; => ([0 0 15 15])
;; => ([0 0 15 NIL])
;; => ([NIL 0 15 NIL])
;; => ([NIL 0 15 NIL])
;; => ([NIL 0 15 NIL])
;; => ([NIL 0 15 NIL])

|#


(defun less-than--interval-segment (i j)
  ;; Return true iff the lower bound of "i" is less than the lower
  ;;    bound of "j";
  (let ((lbi (lower-bnd i))
	(lbj (lower-bnd j)))
    (cond
      ((extended-number-p lbi)
       (and (extended-number-p lbj)
	    (or #+:measures (and (ms:dim-same-units-p lbi lbj)
				 (ms::sdim< lbi lbj))
		#-:measures (< lbi lbj)
		(and #+:measures (ms:dim-eql lbi lbj)
		     #-:measures (= lbi lbj)
		     (or (not (intervalp i))
			 (lower-exact i))))))
      (t 
       (extended-number-p lbj))) ))

(defun make-interval-segment (h i j k)
  ;; Return an integer or cons representing the segment from "i"
  ;;    "j";
  ;; Note:  Assumes that "i" <= "j";
  (cond
   ((eql i j) i)
   #+:measures
   ((and (ms:dim-number-p i) (ms:dim-number-p j) (ms:dim= i j)) i)
   (t (make-interval h i j k))) )

(defun max-lower-bound (i j)
  ;; Return the largest of the values "i" and "j", where they
  ;;    may be numbers, or represent -INFINITY;
  (cond
    ((not (extended-number-p i)) j)
    ((not (extended-number-p j)) i)
    (t #+:measures
       (ms:dim-max i j)
       #-:measures
       (max i j))) )

(defun min-upper-bound (i j)
  ;; Return the smallest of the values "i" and "j", where they
  ;;    may be numbers, or represent +INFINITY;
  (cond
    ((not (extended-number-p i)) j)
    ((not (extended-number-p j)) i)
    (t #+:measures
       (ms:dim-min i j)
       #-:measures
       (min i j))) )

(defun max-upper-bound (i j)
  ;; Return the largest of the values "i" and "j", where they
  ;;    may be numbers, or represent +INFINITY;
  (cond
    ((not (extended-number-p i)) i)
    ((not (extended-number-p j)) j)
    (t #+:measures
       (ms:dim-max i j)
       #-:measures
       (max i j))) )

  ;;
;;;;;; Externally-called utility functions
  ;;

#+CLTL2 (declaim (inline constant-concept-p))
#-CLTL2 (proclaim '(inline constant-concept-p))
(defun constant-concept-p (concept)
  ;; Return true if instances of "concept" are constants;
  ;; Called by "tell", "retrieve", and "detect-feature/fillers-conflict";
  (and (defined-set-feature concept)
       (subconcept-p concept (loom-constant CONSTANT))) )

#+CLTL2 (declaim (inline collection-concept-p))
#-CLTL2 (proclaim '(inline collection-concept-p))
(defun collection-concept-p (concept)
  ;; Return true if instances of "concept" are collections (e.g., sets);
  (subconcept-p concept (loom-constant COLLECTION)) )

(defmethod compute-interval-minimum ((baseInterval INTERVAL-FEATURE) encodedP)	; DGB 11/21/91
  ;; Return a symbol representing the maximum value of the interval
  ;;    "baseInterval";
  (if encodedP
      (lower-open (first (members baseInterval)))
      '-INFINITY) )

(defmethod compute-interval-maximum ((baseInterval INTERVAL-FEATURE) encodedP)
  ;; Return a symbol representing the maximum value of the interval
  ;;    "baseInterval";
  (if encodedP
      (upper-open (first (members baseInterval)))
      '+INFINITY) )

(defmethod compute-interval-minimum ((baseInterval SYMBOLIC-INTERVAL) encodedP)
  ;; Return a symbol representing the minimum value of the interval
  ;;    "baseInterval";
  (if encodedP
      (call-next-method)
      (first (symbols baseInterval))) )

(defmethod compute-interval-maximum ((baseInterval SYMBOLIC-INTERVAL) encodedP)
  ;; Return a symbol representing the minimum value of the interval
  ;;    "baseInterval";
  (if encodedP
      (call-next-method)
      (car (last (symbols baseInterval)))) )

#|
(defun compute-successor-in-interval (baseInterval member)
  ;; Return a symbol representing the successor of "member" within
  ;;    the interval "baseInterval";
  ;; If "member" has no successor, return nil.
  (let* ((position (encode-set-member baseInterval member))
	 (maximum (compute-interval-maximum baseInterval t))
         (successor
	  (cond ((not-a-real-interval-p baseInterval)
		 (1+ position))		; integer or symbolic range
		((numberp position)	; floating point
		 (if (zerop position)
		     LEAST-POSITIVE-DOUBLE-FLOAT
		   (* position #.(+ 1 DOUBLE-FLOAT-EPSILON))))
		#+:measures
		((ms:dim-number-p position)
		 (ms:make-dim-number 
		  :value (if (zerop (ms::%dim-value position))
			     LEAST-NEGATIVE-DOUBLE-FLOAT
			   (ms:dim* (ms::%dim-value position)
				    #.(+ 1 DOUBLE-FLOAT-EPSILON)))
		  :pid (ms::%dim-prim-id position)))
		(t (grumble "Loom Internal: ~S ~S unexpected arguments in~% ~
                    function COMPUTE-SUCCESSOR-IN-INTERVAL" baseInterval member)))))
    (when (or (not (extended-number-p maximum))		; no upper bound
              #+:measures
	      (ms:dim< position maximum)
	      #-:measures
	      (< position maximum))
      (decode-set-member baseInterval successor)) ))

(defun compute-predecessor-in-interval (baseInterval member)
  ;; Return a symbol representing the predecessor of "member" within
  ;;    the interval "baseInterval";
  ;; If "member" has no predecessor, return nil;
  (let* ((position (encode-set-member baseInterval member))
	 (minimum (compute-interval-minimum baseInterval t))
         (successor
	  (cond ((not-a-real-interval-p baseInterval)
		 (1- position))		; integer or symbolic range
		((numberp position)	; floating point
		 (if (zerop position)
		     LEAST-NEGATIVE-DOUBLE-FLOAT
		   (* position #.(- 1 DOUBLE-FLOAT-EPSILON))))
		#+:measures
		((ms:dim-number-p position)
		 (ms:make-dim-number 
		  :value (if (zerop (ms::%dim-value position))
			     LEAST-NEGATIVE-DOUBLE-FLOAT
			   (ms:dim* (ms::%dim-value position)
				    #.(- 1 DOUBLE-FLOAT-EPSILON)))
		  :pid (ms::%dim-prim-id position)))
		(t (grumble "Loom Internal: ~S ~S unexpected arguments in~% ~
                    function COMPUTE-PREDECESSOR-IN-INTERVAL" baseInterval member)))))
	  (when (or (not (extended-number-p minimum)) ; no lower bound
		    #+:measures
		    (ms:dim> position minimum)
		    #-:measures
		    (> position minimum))
	    (decode-set-member baseInterval successor)) ))
|#

(defun compute-successor-in-interval (baseInterval member)
  ;; Return a symbol representing the successor of "member" within
  ;;    the interval "baseInterval";
  ;; If "member" has no successor, return nil.
  (let* ((position (encode-set-member baseInterval member))
	 (maximum (compute-interval-maximum baseInterval t))
         (successor
	  (if (not-a-real-interval-p baseInterval)
	      (1+ position)		; integer or symbolic range
	      (return-from compute-successor-in-interval nil))))
    (when (or (not (extended-number-p maximum))		; no upper bound
	      (< position maximum))
      (decode-set-member baseInterval successor)) ))

(defun compute-predecessor-in-interval (baseInterval member)
  ;; Return a symbol representing the predecessor of "member" within
  ;;    the interval "baseInterval";
  ;; If "member" has no predecessor, return nil;
  (let* ((position (encode-set-member baseInterval member))
	 (minimum (compute-interval-minimum baseInterval t))
         (successor
	  (if (not-a-real-interval-p baseInterval)
	      (1- position)		; integer or symbolic range
	    (return-from compute-predecessor-in-interval nil))))
    (when (or (not (extended-number-p minimum)) ; no lower bound
	      (> position minimum))
      (decode-set-member baseInterval successor)) ))

(defun not-a-real-interval-p (baseInterval)
  ;; Helping function for "compute-xxx-in-interval";
  ;; Return t if "baseInterval" is either not below Number, or is
  ;;    below Integer;
  (let ((baseConcept (defining-concept baseInterval)))
    (or (subconcept-p baseConcept (loom-constant Integer))
   	(not (subconcept-p baseConcept (loom-constant Quantity)))) ))


  ;;
;;;;;; "has-instance-p" and "not-has-instance-p" methods
  ;;



(defun belongs-to-base-set-p (instance setFeature) ;  TAR 1/14/98
  ;; Returns NIL if "instance" does not belong to the baseSet of "setFeature";

  (let ((definingConcept (defining-concept setFeature)))
    (cond (definingConcept (has-instance-p definingConcept instance))
	  ((eq (base-set setFeature) setFeature) t)
	  (t (has-instance-p (base-set setFeature) instance))) ))

(defun belongs-not-to-base-set-p (instance setFeature) ;  TAR 1/14/98
  ;; Returns NIL if "instance" cannot be proven not to belong to the baseSet
  ;;   of "setFeature";

  (let ((definingConcept (defining-concept setFeature)))
    (cond (definingConcept (not-has-instance-p definingConcept instance))
	  ((eq (base-set setFeature) setFeature) nil)
	  (t (not-has-instance-p (base-set setFeature) instance))) ))


;;; Note: The original "has-instance-p" and "not-instance-of-p" methods
;;;    are in the file "backchain.lisp".

(defmethod has-instance-p ((self SET-FEATURE) instance)
  ;; Return t iff "instance" is a member of "self";
  (or (and (eq (members self) :infinite-set)
	   (belongs-to-base-set-p instance self)) ; TAR 1/14/98
      (member instance (members self) :test #'filler-equal)) )

;(defmethod has-instance-p ((self SET-FEATURE) (instance STRING))
;  ;; Return t iff "instance" is a member of "self";
;  (or (eq (members self) :infinite-set)
;      (member instance (members self) :test #'filler-equal)) )

;; METHOD IS NOW IDENTICAL TO THE DEFAULT METHOD:
;(defmethod has-instance-p ((self SET-FEATURE) (instance DB-INSTANCE))
;  ;; Return t iff "instance" is a member of "self";
;  (or (eq (members self) :infinite-set)
;      (member (identifier instance) (members self))) )

(defmethod has-instance-p ((self INTERVAL-FEATURE) instance)
  ;; Return t iff "instance" belongs to the interval "self";
  ;; TO DO: UPGRADE TO HANDLE +/-INFINITY, THEN REWRITE
  ;;    "help-validate-set-member";
  (and (extended-number-p instance)			; DGB 5/28/91
       (belongs-to-base-set-p instance self) ; TAR 1/14/98
       (loop for segment in (members self)
		thereis
		(subsegment-p instance segment))) )

(defmethod has-instance-p ((self SYMBOLIC-INTERVAL) instance)
  ;; Return t iff "instance" belongs to the interval "self";
  (let ((encodedInstance
	  (position instance (symbols (base-set self)))))
    (and (integerp encodedInstance)
	 (loop for segment in (members self)
	      thereis
	      (subsegment-p encodedInstance segment))) ))

(defmethod not-has-instance-p ((self SET-FEATURE) instance)
  ;; Return t iff "instance" is provably not an instance of "self";
  (if (eq (members self) :infinite-set) ; DGB 11/19/92
      (belongs-not-to-base-set-p instance self) ;  TAR 1/14/98
    (not (member instance (members self) :test #'filler-equal))) )

;(defmethod not-has-instance-p ((set SET-FEATURE) (instance STRING))
;  ;; Return t iff "instance" is provably not an instance of "set";
;  (not (member instance (members set) :test #'filler-equal)) )

;; METHOD IS NOW IDENTICAL TO THE DEFAULT METHOD:
;(defmethod not-has-instance-p ((self SET-FEATURE) (instance DB-INSTANCE))
;  ;; Return t iff "instance" is provably not an instance of "set";
;  (not (member (identifier instance) (members self) :test #'eq)) )

(defmethod not-has-instance-p ((self INTERVAL-FEATURE) instance)
  ;; Return t iff "instance" does not belong to the interval "self";
  (or (not (extended-number-p instance))          ; RMM 11/21/94
      (loop for segment in (members self)
            never (subsegment-p instance segment))
      (and (not (integerp instance))          ; RMM 11/21/94
           (subconcept-p (compute-defining-concept self) (loom-constant INTEGER)))
      (belongs-not-to-base-set-p instance self)	;  TAR 1/14/98
      ) )
      
(defmethod not-has-instance-p ((self SYMBOLIC-INTERVAL) instance)
  ;; Return t iff "instance" does not belong to the interval "self";
  (let ((encodedInstance
	  (position instance (symbols (base-set self)))))
    (or (not (integerp encodedInstance))
	(loop for segment in (members self)
	     never (subsegment-p encodedInstance segment))) ))

  ;;
;;;;;; "compute-defining-concept"
  ;;

(defmethod compute-defining-concept ((self SET-FEATURE))
  ;; Compute the most specific concept that represents the set "self";
  ;; Return the concept that is the defining concept for the
  ;;    base set of "self";
  (defining-concept (base-set self)) )

(defmethod compute-defining-concept (self)
  ;; Compute the most specific concept that represents the set "self";
  ;; Default method assumes that "self" is a unary concept;
  self )

(defmethod compute-defined-set-feature ((self SET-FEATURE))
  ;; Situation: In calling function "self" is a value restriction;
  ;; Return the defining set feature for "self";
  self )

(defmethod compute-defined-set-feature (self)
  ;; Situation: In calling function "self" is a value restriction;
  ;; Return the defining set feature for "self";
  ;; Default method assumes that "self" is a unary concept;
  (defined-set-feature self) )


  ;;
;;;;;; Helping functions for "propagate-set-restriction-to-fillers&upper-bound"
  ;;

(defmethod compute-set-cardinality ((self SET-FEATURE))
  ;; Return the number of members of the set "self";
  ;; If infinite, return nil;
  (let ((members (members self)))
    (if (consp members)           ; not :infinite-set  DGB 4/6/92
	(length members)
	nil) ))

(defmethod compute-set-cardinality ((self INTERVAL-FEATURE))
  ;; Return the number of members of the set "self";
  ;; If infinite, return nil;
  ;; Comment: The code below assumes that segments of type integer
  ;;    are necessarily either integers or intervals;
  ;; Note: For sets of type NUMBER we return NIL;
  (let ((sum 0))
    (cond
     ((subconcept-p (defining-concept (base-set self)) (loom-constant INTEGER))
      (loop for segment in (members self)
	    do
	    (if (intervalp segment)
              (progn
                (unless (and (extended-number-p (lower-open segment))
                             (extended-number-p (upper-open segment)))
                  ;; found +/- INFINITY:
                  (return-from compute-set-cardinality nil))
		(cond ((and (lower-exact segment) (upper-exact segment))
		       (incf sum
			     (1+ (- (upper-bnd segment) (lower-bnd segment)))))
		      ((or (lower-exact segment) (upper-exact segment))
		       (incf sum
			     (- (upper-bnd segment) (lower-bnd segment))))
		      (t 
		       (incf sum
			     (1- (- (upper-bnd segment) (lower-bnd segment)))))))
              (incf sum)))
      sum)
     ((subconcept-p (defining-concept (base-set self)) 
		    (loom-constant QUANTITY))
      ;; return cardinality only if all segments are numbers (not ranges):
      (loop for segment in (members self)
	    do
	    (if (intervalp segment)
              (return-from compute-set-cardinality nil)
              (incf sum)))
      sum)) ))

(defmethod compute-set-cardinality ((self SYMBOLIC-INTERVAL))
  ;; Return the number of members of the set "self";
  (let ((sum 0))
    (loop for segment in (members self)
	  do
	  (if (intervalp segment)
	      (cond ((and (lower-exact segment) (upper-exact segment))
		     (incf sum
			   (1+ (- (upper-bnd segment) (lower-bnd segment)))))
		    ((or (lower-exact segment) (upper-exact segment))
		     (incf sum
			   (- (upper-bnd segment) (lower-bnd segment))))
		    (t 
		     (incf sum
			   (1- (- (upper-bnd segment) (lower-bnd segment))))))
            (incf sum)))
    sum ) )


(defmethod generate-decoded-set-members ((self SET-FEATURE))
  ;; Return a list of (decoded) members of "self";
  (members self) )

(defmethod generate-decoded-set-members ((self INTERVAL-FEATURE))
  ;; Return a list of (decoded) members of "self";
  ;; CAUTION: Assumes that CALLING function has apriori determined
  ;;    that the set is finite;
  (let (result)
    (loop for segment in (members self)
	 do
	  (if (intervalp segment)
	      (loop for i from (or (lower-exact segment) (1+ (lower-bnd segment)))
		          to (or (upper-exact segment) (1- (upper-bnd segment)))
		  do (push i result))
	     (push segment result)))
    result ))

(defmethod generate-decoded-set-members ((self SYMBOLIC-INTERVAL))
  ;; Return a list of (decoded) members of "self";
  ;; CAUTION: Assumes that CALLING function has apriori determined
  ;;    that the set is finite;
  (let (result)
    (loop for segment in (members self)
	 do
	 (if (intervalp segment)
	      (loop for i from (or (lower-exact segment) (1+ (lower-bnd segment)))
		          to (or (upper-exact segment) (1- (upper-bnd segment)))
		  do (push (decode-set-member self i) result))
	     (push (decode-set-member self segment) result)))
    result ))


  ;;
;;;;;; Set member functions
  ;;

(CLOS::defgeneric compute-members-of-collection-instance (self) )

(defun subset-of-set-p (set1 set2)
  ;; Return t if all members of "set1" are also members of "set2";
  (subsetp (compute-members-of-instance set1)
	   (compute-members-of-instance set2)
	   :test #'filler-equal) )

(defun compute-members-of-instance (self)
  ;; Return a list of instances that are members of the instance "self";
  ;; "self" may be a list or an instance of COLLECTION;
  ;; In other words, coerce "self" to be a list if its not one already;
  (if (listp self)
      self
    (compute-members-of-collection-instance self)) )


  ;;
;;;;;; Numeric Min and Max Functions
  ;;

(defmethod min-value ((self UNARY-ENTITY))
  (when (eq (defined-as self) :set)
    (min-value (defined-set-feature self))))

(defmethod max-value ((self UNARY-ENTITY))
  (when (eq (defined-as self) :set)
    (max-value (defined-set-feature self))))

;; TO DO: DETERMINE IF THIS SHOULD RETURN SOMETHING FOR ORDERED SETS:
(defmethod min-value ((self SET-FEATURE))
  nil)

(defmethod max-value ((self SET-FEATURE))
  nil)

(defmethod min-value ((self INTERVAL-FEATURE))
  (let ((members (members self)))
    (when (consp members)
      (values (lower-open (first members))
	      (lower-exact (first members)))) ))

(defmethod max-value ((self INTERVAL-FEATURE))
  (let ((lastMember (and (consp (members self))
			 (first (last (members self))))))
    (when lastMember
      (values (upper-open lastMember)
	      (upper-exact lastMember))) ))


;; TO DO:
#|

UPGRADE TO ALLOW REAL NUMBERS IN INTERVALS

CONSIDER ADDING THE ATTRIBUTE :monotonic TO
PRIMITIVE SETS

|#

;; BUGS:
#|

|#
