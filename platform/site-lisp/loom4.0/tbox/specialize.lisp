;;; -*- mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

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

;;; SPECIALIZE.LISP (TBOX)

(in-package "LOOM")

;;; Contains methods and functions which supplement the classifier, and
;;;    which are specific to UNARY-CONCEPTs, BINARY-RELATIONs, N-ARY-RELATIONS,
;;;    RESTRICTIONs and COMPARISONs


  ;;
;;;;;; "compute-starting-points" Methods:
  ;;

(defmethod compute-starting-points ((self UNARY-CONCEPT))
  ;; Return a set of (unary) concept nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice
  ;; Strategy (with respect to primitiveness):  Include each 
  ;;    primitive concept, since the classification search never
  ;;    descends into a primitive node;
  (case (defined-as self)
    (:disjunction
     ;; we assume that conditioning has computed a valid msg
     ;;    w.r.t. all existing concepts:
     (super-concepts self))
    (otherwise
     (cons *Thing* (primitive-concepts self)))) )

(defmethod compute-starting-points ((self UNARY-RELATION))
  ;; Return a set of (unary) property nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice
  ;; Strategy (with respect to primitiveness):  Include each 
  ;;    primitive concept, since the classification search never
  ;;    descends into a primitive node;
  (case (defined-as self)
    (:disjunction
     ;; we assume that conditioning has computed a valid msg
     ;;    w.r.t. all existing concepts:
     (super-concepts self))
    (otherwise
     (cons (loom-constant UNARY-TUPLE) (primitive-concepts self)))) )


(defmethod compute-starting-points ((self MIN-RESTRICTION))
  ;; Return a set of restriction nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  ;; Strategy:  We already went for a quick classification when the
  ;;    lower-bound of "self" equaled 1;
  ;;    We return a list of all min-1 restrictions at and above
  ;;    self EXCEPT for BINARY-TUPLE;
  (let ((relation (relation self)))
    (cons (min-1-restriction relation)
	  (loop for super in (all-super-concepts relation)
	      unless (or (eq super *binary-tuple*)
			 (null (min-1-restriction super)))
	      collect (min-1-restriction super))) ))


(defmethod compute-starting-points ((self MAX-RESTRICTION))
  ;; Return a set of restriction nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  ;; Strategy:  We already went for a quick classification when the
  ;;    upper-bound of "self" equaled 1;
  ;;    We return a list of all null max restrictions at and BELOW
  ;;    self;
  ;; QUESTION: DO NULL MAX RESTRICTIONS HAVE SUBSUMPTION LINKS BETWEEN
  ;;    THEM, AND IF SO, WHY ISN'T JUST THE TOP-MOST NULL RESTRICTION
  ;;    A GOOD ENOUGH STARTING POINT;  IS THE PROBLEM PRIMITIVENESS??
  (let ((relation (relation self)))
    (if (null (sub-concepts relation))
	(list (null-max-restriction relation))
	(collect-transitively
	  relation sub-concepts
	  null-max-restriction)) ))

(defmethod compute-starting-points ((self VALUE-RESTRICTION))
  ;; Return a set of restriction nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  ;; Strategy: 
  ;;    We return a list of all null value restrictions at and BELOW
  ;;    self;
  ;; QUESTION: DO NULL VALUE RESTRICTIONS HAVE SUBSUMPTION LINKS BETWEEN
  ;;    THEM, AND IF SO, WHY ISN'T JUST THE TOP-MOST NULL RESTRICTION
  ;;    A GOOD ENOUGH STARTING POINT;  IS THE PROBLEM PRIMITIVENESS??
  (let ((relation (relation self)))
    (if (null (sub-concepts relation))
	(list (null-value-restriction relation))
	(collect-transitively
	  relation sub-concepts
	  null-value-restriction)) ))


(defmethod compute-starting-points ((self FILLED-BY-FEATURE))
  ;; Return a set of restriction nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  ;; Strategy: 
  ;;    We return a list of all null filled-by restrictions at and above
  ;;    "self" EXCEPT for BINARY-TUPLE;
  (let ((relation (relation self)))
    (cons (null-filled-by-restriction relation)
	  (loop for super in (all-super-concepts relation)
	      unless (or (eq super *binary-tuple*)
			 (null (null-filled-by-restriction super)))
	      collect (null-filled-by-restriction super))) ))


(defmethod compute-starting-points ((self NOT-FILLED-BY-FEATURE))
  ;; Return a set of restriction nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  ;; Strategy: 
  ;;    We return a list of all null not-filled-by restrictions at and above
  ;;    "self" EXCEPT for BINARY-TUPLE;
  (let ((relation (relation self)))
    (cons (null-not-filled-by-restriction relation)
	  (loop for super in (all-super-concepts relation)
	      unless (or (eq super *binary-tuple*)
			 (null (null-not-filled-by-restriction super)))
	      collect (null-not-filled-by-restriction super))) ))



(defmethod compute-starting-points ((self COMPARISON-FEATURE))
  ;; Return a set of comparison nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  ;; Strategy:  Return a list of all comparison features at and above
  ;;    "self" EXCEPT for BINARY-TUPLE;
  (let ((relationship (relationship self)))
    (cons (null-comparison relationship)
	  (loop for super in (super-concepts relationship)
	       when (and (super-concepts super)	; skip BINARY-TUPLE and N-ARY-TUPLE
			 (null-comparison super))
	       collect (null-comparison super))) ) )


(defmethod compute-starting-points ((self REIFIED-COMPARISON-FEATURE))
  ;; Return a set of comparison nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  ;; Strategy:  Return a list of all comparison features at and above
  ;;    self EXCEPT for BINARY-TUPLE;
  (let ((relationship (relationship self)))
    (cons (null-reified-comparison relationship)
	  (loop for super in (super-concepts relationship)
	       when (and (super-concepts super)	; skip BINARY-TUPLE and N-ARY-TUPLE
			 (null-reified-comparison super))
	      collect (null-reified-comparison super))) ) )
    
(defmethod compute-starting-points ((self BINARY-RELATION))
  ;; Return a set of binary-relation nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  ;; Strategy:  Mixed, depending on the value of the
  ;;    "defined-as" slot; If "self" is not defined, check under
  ;;    primitive relations in the usual way;  Return "BINARY-TUPLE"
  ;;    if nothing else is available;
  (or (if (defined-as self)
	  (case (defined-as self) 
	    (:inverse
	     (loop for inverseSuper in (super-concepts (inverse self))
		  when (inverse inverseSuper)
		  collect (inverse inverseSuper)))
	    (:composition nil)			; this is just an approximation 
	    )
	  (primitive-concepts self))
      (list (loom-constant BINARY-TUPLE))) )

(defmethod compute-starting-points ((self N-ARY-RELATION))
  ;; Return a set of n-ary-relation nodes which subsumes all possible
  ;;    locations of "self" in the taxonomic lattice;
  ;; Strategy:  Just return the top-level node "BINARY-TUPLE" is "self"
  ;;    is binary, or "N-ARY-TUPLE" if its not; 
  (list (loom-constant N-ARY-TUPLE)) )


  ;;
;;;;;; "add-to-search-nodes" methods:
  ;;

;;; These methods work in tandem with the "compute-starting-points" to search
;;;    as small a number of nodes as possible, and still not miss anything;
;;; If we can't find a more clever strategy, the default is to always add
;;;    the sub-object to the search node list of the super-object

(defmethod add-to-search-nodes ((superObject CLASSIFIABLE-OBJECT) subObject)
  ;; add "subObject" to the "search-nodes" slot of "superObject" if
  ;;    the classifier should look for it after visiting "superObject";
  ;; Strategy:  We haven't found a clever strategy, so we always do the addition;
  (push subObject (search-nodes superObject)) )

(defmethod add-to-search-nodes ((superConcept UNARY-ENTITY) subConcept)
  ;; Add "subConcept" to the "search-nodes" slot of "superConcept" if
  ;;    the classifier should look for it after visiting "superConcept";
  ;; Strategy:  We don't search for it if it's primitive or if it has
  ;;    no primitiveness whatsoever;
  (unless (or (primitive-p subConcept)
              (null (primitive-concepts subConcept)))
    (push subConcept (search-nodes superConcept))) )

(defmethod add-to-search-nodes ((superRelation TBOX-RELATION) subRelation)
  ;; Add "subRelation" to the "search-nodes" slot of "superRelation" if
  ;;    the classifier should look for it after visiting "superRelation";
  ;; Strategy:  We don't search for it if it's primitive;
  (unless (primitive-p subRelation)
    (push subRelation (search-nodes superRelation))) )


  ;;
;;;;;; "specializes-classified-concept-p" methods:
  ;;

(defmethod specializes-classified-concept-p
    ((concept1 UNARY-ENTITY) concept2 checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on unary concepts "concept1" and "concept2";
  ;; Returns t or :equal if "concept1" specializes or is equivalent to
  ;;    "concept2";
  ;; The algorithm depends on prior placement of "feature-is-below" flags 
  ;;    on restrictions and structure-predicates inherited by "concept1"
  ;; REDUNDANCY: CODE HERE AND IN "parent-is-identical-p"
  #L:trace-spec (trace-values "specializes-classified-concept-p:" concept1 concept2)
  (let ((passCounter *concept-is-below-pass-counter*)
	definedSetFeature1)
    ;; Test to see if each of the primitive concepts, restrictions and
    ;;    comparisons inherited by "concept2" is flagged, indicating it
    ;;    is also inherited by "concept1"
    (integrity-check (if (eq dontCheckPrimsFlag 'unclassified)
			 (not (classified-p concept2))
		       (not (classified-p concept1))))
    (when (and (or dontCheckPrimsFlag 
		   (subconcept-wrt-primitiveness-p concept2))
	       (loop for res2 in (restrictions concept2)
		   always (= (feature-is-below-counter res2) passCounter))
	       (loop for cmp2 in (comparisons concept2)
		   always (= (feature-is-below-counter cmp2) passCounter))
	       (loop for ftr2 in (computed-features concept2)
		   always
		     (or (= (feature-is-below-counter ftr2) passCounter)
			 (and (setq definedSetFeature1 (defined-set-feature concept1))
			      (consp definedSetFeature1) ; not :infinite-set
			      (loop for m in (members definedSetFeature1)
				  always (feature-is-satisfied-p ftr2 m)))))
               (loop for neg2 in (negated-concepts concept2)
		   always (disjoint-concepts-p concept1 neg2))
               (or (null (defined-set-feature concept2))
		   (= (feature-is-below-counter
		       (defined-set-feature concept2))
		      passCounter))
	       (cond
		((disjunctive-features concept2)
		 (or (subconcept-wrt-defined-concepts-p concept1 concept2)
		     ;; Check whether expansion to DNF is necessary
		     ;;(when (neq dontCheckPrimsFlag 'unclassified)...)
		     ;; Don't expand if this is really a "specializes-unclassified-concept-p" test
		     (expanded-specializes-concept-p
		      concept1 concept2
		      :unclassified (eq dontCheckPrimsFlag 'unclassified))))
		((defined-as concept1)
		 (ecase (defined-as concept1)
		   (:disjunction
		    (loop for d1 in (disjuncts concept1)
			always		;  (subconcept-p d1 concept2)  ; Can't use this here! ;  TAR 6/17/96
			  (specializes-classified-concept-p
			   d1 concept2 checkForEqualityFlag dontCheckPrimsFlag)))
		   (:set t)))
		(t t))
               ;; Test only really used for properties:   ; TAR 7/6/99
	       (or (null (defined-domain concept2))
		   (and (defined-domain concept1)
			(subconcept-p (defined-domain concept1)
				      (defined-domain concept2)))))
      
      ;; "concept1" specializes "concept2"; now, check for equivalence
      ;; TO DO: DETERMINE WHETHER EXPANSION TO DNF IS EVER NECESSARY TO FIND EQUIVALENCE.
      ;;        IT SEEMS THAT CONDITIONING ALWAYS FINDS A UNIQUE PARENT WHEN
      ;;        THERE MIGHT BE AN EQUIVALENT CONCEPT, AND THAT CASE IS HANDLED
      ;;        BY "parent-is-identical-p"
      (or (not checkForEqualityFlag)
	  (case (defined-as concept1)
	    (:disjunction
	     (return-t-or-equal
	      (set-equal-p (disjuncts concept1) (disjuncts concept2))))
	    (otherwise
	     (return-t-or-equal
	      (= (length (primitive-concepts concept1))
		 (length (primitive-concepts concept2)))
	      (set-equal-p (restrictions concept1) (restrictions concept2))
	      (set-equal-p (comparisons concept1) (comparisons concept2))
	      (set-equal-p (computed-features concept1)
			   (computed-features concept2))
	      (eql (defined-set-feature concept1) (defined-set-feature concept2))
	      (loop for neg1 in (negated-concepts concept1)
		  always (disjoint-concepts-p concept2 neg1))
	      (set-equal-p (disjunctive-features concept1)
			   (disjunctive-features concept2))))))) ))

(defun subconcept-wrt-primitiveness-p (concept2)
  ;; Perform a subsumption test on the primitive-concepts belonging
  ;;    to "concept1" and "concept2";
  ;; Returns t if "concept1" specializes or is equivalent to
  ;;    "concept2" with respect to primitiveness
  ;; The algorithm depends on prior placement of "concept-is-below-counter" flags 
  ;;    on primitive concepts inherited by "concept1";
  (let ((passCounter *concept-is-below-pass-counter*))
    ;; See if each of the primitive concepts inherited by "concept2"
    ;;    is flagged, indicating it is also inherited by "concept1"
    (loop for p in (primitive-concepts concept2)
	 always 
	 (= (concept-is-below-counter p) passCounter)) ))

(defun subconcept-wrt-defined-concepts-p (concept1 concept2)
  ;; Returns t if "concept1" specializes or is equivalent to
  ;;    "concept2" with respect to defined concepts;
  ;; The algorithm depends on prior placement of "concept-is-below-counter"
  ;;    flags on defined concepts inherited by "concept1";
  (let ((passCounter *concept-is-below-pass-counter*))
    (loop for dc in (disjunctive-features concept2)
	 always 
	 (or
	   ;; See if each of the defined concepts inherited by "concept2"
	   ;;    is flagged, indicating it is also inherited by "concept1"
	   (eql (concept-is-below-counter dc) passCounter)
	   ;; If not flagged, check whether "concept1" satisfies the definition of dc
	   (ecase (defined-as dc)
	     (:disjunction
	      #L:trace-spec (trace-values "subconcept-wrt-defined-concepts-p:" dc "is a disjunction!")
	      (satisfies-disjunction-p concept1 dc))))) ))

(defun subconcept-wrt-conjuncts-p (concept2) ; TAR 2/10/99
  ;; Returns t if "concept1" specializes or is equivalent to
  ;;    "concept2" with respect to conjuncts in concepts;
  ;; The algorithm depends on prior placement of "concept-is-below-counter"
  ;;    flags on defined concepts inherited by "concept1";
  (let ((passCounter *concept-is-below-pass-counter*))
    (loop for dc in (conjuncts concept2)
	 always 
	  ;; See if each of the defined concepts inherited by "concept2"
	  ;;    is flagged, indicating it is also inherited by "concept1"
	  (eql (concept-is-below-counter dc) passCounter)) ))

(defmethod satisfies-disjunction-p ((self UNARY-ENTITY) concept)
  ;; Determine whether "self" satisfies "concept",
  ;; which is known to be defined as a disjunction.
  ;; Called by subconcept-wrt-defined-concepts-p.
  (case (defined-as self)
    (:disjunction
     (loop for d1 in (disjuncts self)
	  always (loop for d2 in (disjuncts concept)
		      ;; Here we assume that d1 and d2 are already classified,
		      ;; because self and concept depend on them.
		      thereis (subconcept-p d1 d2))))
    (otherwise
     ;; NOTE: this test should never be called if "self" is conjunctive and
     ;; it contains a disjunction which specializes "concept".
     ;; The concept-is-below flags should catch that case.
     (if (classified-p concept)
	 ;; WE CHECK WHETHER ANY OF THE DISJUNCTS OF concept
	 ;; SUBSUME self.  BY RECURSIVELY CALLING "help-find-subsumers"
	 ;; WE ONLY NEED TO VISIT THE CHILDREN OF concept ONCE.
	 ;; THIS WILL ONLY WORK WHEN CLASSIFIER IS LOOKING FOR SUBSUMERS;
	 ;; IT WILL NOT WORK IF THIS IS CALLED WHEN LOOKING FOR SUBSUMEES.
	 (if (classified-p self)
	     ;; both "self" and "concept" are already classified:
	     (subconcept-p self concept)
	     ;; "self" is not classified, so we are looking for subsumers:
	     (loop for d2 in (disjuncts concept)
		  thereis (help-find-subsumers self d2)))
	 ;; if "concept" is not classified, then the classifier is looking for
	 ;; subsumees of "concept", and the parent links of "self" have 
	 ;;    already been installed:
	 (or (loop for d2 in (disjuncts concept)
		  thereis (subconcept-p self d2))
	     (loop for d1 in (disjunctive-features self)
		  thereis (and (eq (defined-as d1) :disjunction)
			       (satisfies-disjunction-p d1 concept))))))) )

(eval-when (compile load eval)
  (defmacro qualification-specializes-qualification-p (restriction1 restriction2)
    ;; Helping macro for "xxx-RESTRICTION.specializes-classified-concept-p";
    ;; Return t if the qualification on "restriction1" specializes the
    ;;    qualification on "restriction2";
    `(or (null (qualification ,restriction2))
	 (and (qualification ,restriction1)
	      (vr-specializes-vr-p (qualification ,restriction1)
				   (qualification ,restriction2)))) )
  )

(defmethod specializes-classified-concept-p
       ((restriction1 VALUE-RESTRICTION) restriction2 checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on value restrictions "restriction1"
  ;;    and "restriction2";
  ;; Returns t or :equal if "restriction1" specializes or is equivalent to
  ;;    "restriction2";
  (declare (ignore dontCheckPrimsFlag))
  (when (and (subconcept-p (relation restriction2) (relation restriction1))
	     (or (vr-specializes-vr-p (value-restriction restriction1)
				  (value-restriction restriction2))
		 (eq (value-restriction restriction1) (loom-constant INCOHERENT)))
	     (qualification-specializes-qualification-p restriction2 restriction1))
    (return-t-or-equal
      (eq (relation restriction1) (relation restriction2))
      (eq (value-restriction restriction1) (value-restriction restriction2))
      (eq (qualification restriction1) (qualification restriction2)))) )

(defmethod vr-specializes-vr-p (vr1 vr2)
  ;; Helping method for "xxx-RESTRICTION.specializes-classified-concept-p":
  ;; Return t if "vr1" specializes "vr2";
  ;; These methods are needed to test for subsumption between pairs
  ;;    of set features or concepts;
  ;; Situation: "vr1" and "vr2" are either both concepts, or both
  ;;    set features;
  (subconcept-p vr1 vr2) )

(defmethod vr-specializes-vr-p ((vr1 SET-FEATURE) (vr2 UNARY-ENTITY))
  (let ((definedSetFeature2 (defined-set-feature vr2)))
    (and definedSetFeature2
	 (subconcept-p vr1 definedSetFeature2)) ))

(defmethod vr-specializes-vr-p ((vr1 UNARY-ENTITY) (vr2 SET-FEATURE))
  ;; Return t if "vr1" is a pure set concept, and it specializes "vr2";
  (and (eq (defined-as vr1) :set)
       (subconcept-p (defined-set-feature vr1) vr2)) )

(defmethod specializes-classified-concept-p
	   ((restriction1 MIN-RESTRICTION) restriction2 checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on lower bound restrictions "restriction1"
  ;;    and "restriction2";
  ;; Returns t or :equal if "restriction1" specializes or is equivalent to
  ;;    "restriction2";
  (declare (ignore dontCheckPrimsFlag))
  (when (and (subconcept-p (relation restriction1) (relation restriction2))
	     (qualification-specializes-qualification-p restriction1 restriction2)
	     (>= (lower-bound restriction1) (lower-bound restriction2)))
    (return-t-or-equal
      (eq (relation restriction1) (relation restriction2))
      (eq (qualification restriction1) (qualification restriction2))
      (= (lower-bound restriction1) (lower-bound restriction2)))) )

(defmethod specializes-classified-concept-p
	   ((restriction1 MAX-RESTRICTION) restriction2 checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on upper bound restrictions "restriction1"
  ;;    and "restriction2";
  ;; Returns t or :equal if "restriction1" specializes or is equivalent to
  ;;    "restriction2";
  ;; Note: Because of the presence of null max restrictions, we have to include
  ;;    a "integer-p" test on the slot "upper-bound";
  (declare (ignore dontCheckPrimsFlag))
  (let ((upperBound2 (upper-bound restriction2)))
    (when (and (subconcept-p (relation restriction2) (relation restriction1))
	       (qualification-specializes-qualification-p restriction2 restriction1)
	       (and (integerp (upper-bound restriction1))
		    (or (not (integerp upperBound2))
			(<= (upper-bound restriction1) upperBound2))))
      (return-t-or-equal
	(eq (relation restriction1) (relation restriction2))
	(eq (qualification restriction1) (qualification restriction2))
	(eql (upper-bound restriction1) (upper-bound restriction2)))) ))

(defmethod specializes-classified-concept-p
	   ((feature1 FILLED-BY-FEATURE) feature2
	    checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on filled-by restrictions "feature1"
  ;;    and "feature2";
  ;; Returns t or :equal if "feature1" specializes or is equivalent to
  ;;    "feature2";
  (declare (ignore dontCheckPrimsFlag))
  (let (superSetP)
    (when (and (subconcept-p (relation feature1) (relation feature2))
;; QUALIFICATIONS SHOULD ALWAYS BE NIL:
;	       (qualification-specializes-qualification-p feature1 feature2)
	       (setq superSetP (subset-p (role-fillers feature2)
					 (role-fillers feature1))))
      (return-t-or-equal
	(eq (relation feature1) (relation feature2))
	(eq (qualification feature1) (qualification feature2))
	(eq superSetP :equal))) ))

(defmethod specializes-classified-concept-p
	   ((feature1 NOT-FILLED-BY-FEATURE) feature2 
	    checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on not-filled-by restrictions "feature1"
  ;;    and "feature2";
  ;; Returns t or :equal if "feature1" specializes or is equivalent to
  ;;    "feature2";
  (declare (ignore dontCheckPrimsFlag))
  (let (superSetP)
    (when (and (subconcept-p (relation feature2) (relation feature1))
;; QUALIFICATIONS SHOULD ALWAYS BE NIL:
;	       (qualification-specializes-qualification-p feature2 feature1)
	       (setq superSetP (subset-p (non-role-fillers feature2)
					 (non-role-fillers feature1))))
      (return-t-or-equal
	(eq (relation feature1) (relation feature2))
	(eq (qualification feature1) (qualification feature2))
	(eq superSetP :equal))) ))

(defmethod specializes-classified-concept-p
	   ((cmp1 COMPARISON-FEATURE) cmp2 checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on "cmp1" and "cmp2";
  ;; Returns t or :equal if "cmp1" specializes or is equivalent to "cmp2";
  ;; Case 1:  ":same-as vs. :same-as"
  ;;          cmp1 <= cmp2 IF roles2 is-subset-of roles1;
  ;; Case 2:  ":subset vs. :subset" OR ":same-as vs. :subset":
  ;;          cmp1 <= cmp2 IF role11 >= role21 and role12 <= role22;
  ;; Case 3:  "op1 <= op2":
  ;;          cmp1 <= cmp2 IF role1 = role2 (symmetry adds another possiblity here);
  (declare (ignore dontCheckPrimsFlag))
  (let ((relationship1 (relationship cmp1))
	(relationship2 (relationship cmp2))
	(roles1 (roles cmp1))
	(roles2 (roles cmp2)))
    (cond
      ((and (eq (feature-type cmp1) :same-as)
	    (eq (feature-type cmp2) :same-as))
       (when (subsetp roles2 roles1)
	 (return-t-or-equal
	   (set-equal-p roles1 roles2))))
      ((and (eq (name relationship2) 'subset)
	    ;; (member relationship1 (list (loom-constant SAME-AS) (loom-constant SUBSET)))
	    ;; ":same-as vs. :subset" NOT IMPLEMENTED
	    (eq (name relationship1) 'subset))
       (when (and (subconcept-p (first roles2) (first roles1))
		  (subconcept-p (second roles1) (second roles2)))
	 (return-t-or-equal
	   ;; (eq relationship1 relationship2)
	   (equal roles1 roles2))))
      (t
       (when (subconcept-p relationship1 relationship2)
	 (let ((arity1 (arity relationship1))
	       (arity2 (arity relationship2)))
	   (when (and (= arity1 arity2)
		      (or (equal roles1 roles2)
			  (if (= arity1 2)
			      (and (member :symmetric (attributes relationship1))
				   (eq (first roles1) (second roles2))
				   (eq (second roles1) (first roles2)))
			      (and (member :commutative (attributes relationship1))
				   (loop for role1 in (butlast roles1)
					always
					(loop for role2 in (butlast roles2)
					     thereis (eq role1 role2)))))))
	     (return-t-or-equal
	       (eq relationship1 relationship2))))))) ))



;;; "TBOX-RELATION.specializes-classified-concept-p" is actually a
;;;    collection of subsumption tests, corresponding to the variety
;;;    ways to define relations;

(defmethod specializes-classified-concept-p
	   ((relation1 BINARY-RELATION) relation2 checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on the relations "relation1" and "relation2";
  ;; Returns t or :equal if "relation1" specializes or is equivalent to
  ;;    "relation2";
 #L:trace-spec (trace-values "specializes-classified-concept-p:" relation1 relation2) 
  (cond
    ((defined-as relation1)
     (case (defined-as relation1)
       (:inverse
	(when (and (inverse relation2)
		   (subconcept-p (inverse relation1) (inverse relation2)))
	  (return-t-or-equal
	    (eq (inverse relation1) (inverse relation2)))))
       (:composition
	(when (and (components relation2)
		   (= (length (components relation1)) (length (components relation2)))
		   (loop for component1 in (components relation1)
			as component2 in (components relation2)
			always (subconcept-p component1 component2)))
	  (return-t-or-equal
	    (equal (components relation1) (components relation2)))))))
    ((defined-as relation2)
     (case (defined-as relation2)
       (:inverse
	(when (and (inverse relation1)
		   (subconcept-p (inverse relation1) (inverse relation2)))
	  (return-t-or-equal
	    (eq (inverse relation1) (inverse relation2)))))
       (:composition
	(integrity-check (null (components relation1)))
	nil
;	(when (and (components relation1)
;		   (= (length (components relation1)) (length (components relation2)))
;		   (loop for component1 in (components relation1)
;			as component2 in (components relation2)
;			always (subconcept-p component1 component2)))
;	  (return-t-or-equal
;	    (equal (components relation2) (components relation1))))
	)))
    (t
     (let ((passCounter *concept-is-below-pass-counter*))
       (when (and
	       (or dontCheckPrimsFlag 
		   (subconcept-wrt-primitiveness-p relation2))
	       (subconcept-wrt-defined-concepts-p relation1 relation2)
	       (subconcept-wrt-conjuncts-p relation2) ; TAR 2/10/99
	       (loop for ftr2 in (computed-features relation2)
		    always (= (feature-is-below-counter ftr2) passCounter))
	       (or (null (defined-range relation2))
		   (and (defined-range relation1)
			(subconcept-p (defined-range relation1)
				      (defined-range relation2))))
	       (or (null (defined-domain relation2))
		   (and (defined-domain relation1)
			(subconcept-p (defined-domain relation1)
				      (defined-domain relation2))))
               (loop for neg2 in (negated-concepts relation2)
                    always (disjoint-concepts-p relation1 neg2)))
	 (return-t-or-equal
	   (= (length (primitive-concepts relation1))
	      (length (primitive-concepts relation2)))
	   (eq (defined-range relation1) (defined-range relation2))
	   (eq (defined-domain relation1) (defined-domain relation2))
	   (set-equal-p (computed-features relation1)
			(computed-features relation2))
           (loop for neg1 in (negated-concepts relation1)
                    always (disjoint-concepts-p relation2 neg1))
	   (set-equal-p (disjunctive-features relation1)
			(disjunctive-features relation2))))))) ) 


(defmethod specializes-classified-concept-p
	   ((relation1 N-ARY-RELATION) relation2 checkForEqualityFlag dontCheckPrimsFlag)
  ;; Perform a subsumption test on the relations "relation1" and "relation2";
  ;; Returns t or :equal if "relation1" specializes or is equivalent to
  ;;    "relation2";
 #L:trace-spec (trace-values "specializes-classified-concept-p:" relation1 relation2) 
  (let ((passCounter *concept-is-below-pass-counter*))
    (when (and (or dontCheckPrimsFlag 
		   (subconcept-wrt-primitiveness-p relation2))
	       (loop for ftr2 in (computed-features relation2)
		    always (= (feature-is-below-counter ftr2) passCounter)))
      (return-t-or-equal
	(= (length (primitive-concepts relation1))
	   (length (primitive-concepts relation2)))
	(set-equal-p (computed-features relation1)
		     (computed-features relation2)))) ))


  ;;
;;;;;; "specializes-unclassified-concept-p"
  ;;

;;;  "specializes-unclassified-concept-p" is used to test whether a node
;;;      is a possible child of the concept being classified.  This routine
;;;      is less general than it sounds, because (1) it assumes that the
;;;      possible child IS classified, and (2), because it omits checks
;;;      for equality and primitiveness (because "help-find-subsumees" doesn't
;;;      need those tests

(defmethod specializes-unclassified-concept-p ((self CLASSIFIABLE-OBJECT) concept)
  ;; Helping function for "help-find-subsumees";
  ;; Returns 't' iff "self" specializes "concept";
  ;; Note:  In some cases (its safest to assume ALL) "self" must already
  ;;    be classified
  (let ((result
	  (specializes-classified-concept-p self concept nil 'unclassified)))
#L:trace-spec (trace-values "specializes-unclassified-concept-p yields: " result)
     result ))

(defmethod specializes-unclassified-concept-p ((self TBOX-CONCEPT) concept2)
  ;; Instances of TBOX-CONCEPT get a special method here not to
  ;;    do the subsumption test, but to do the initialization which preceeds
  ;;    their particular subsumption test;
  ;; Note: We can safely bump the counter *concept-is-below-pass-counter*
  ;;    once per specializes test here because the classifier is no longer
  ;;    using *concept-is-below-pass-counter* by the time it's testing
  ;;    for subsumees;
  ;; "concept" is passed as an implicit argument to "call-next-method", but
  ;;    never used explicitly:
  #+(or :EXCL :MCL) (declare (ignore concept2))
  (set-up-classification-flags self nil)
  (call-next-method) )


  ;;
;;;;;; "parent-is-identical-p" methods
  ;;

;;; These methods allow a faster than normal subsumption test between 
;;;    a concept and its original parents;  If no clever speed-up
;;;    can be found, then we just call the usual subsumption test.
;;; CAUTION: In general, the "parent-is-identical-p" methods need not
;;;    be infallible (i.e., they can do a less thorough job than
;;;    "specializes-classified-concept-p".  HOWEVER, they must perform
;;;    correctly when the argument "parent" is primitive.

(defmethod parent-is-identical-p ((self TBOX-CONCEPT) parent dontExpandP)
  ;; Helping function for "classify-below";
  ;; Return "parent" iff "self", which is known to specialize "parent", is
  ;;    identical to it;
  (declare (ignore dontExpandP))
  (let ((result (specializes-classified-concept-p self parent t nil)))
 #L:trace-spec (trace-values "parent-is-identical-p yields:" (eq result :equal))
    (when (eq result :equal)
      parent) ))

(defmethod parent-is-identical-p ((self UNARY-ENTITY) parent dontExpandP)
  ;; Helping function for "classify-below";
  ;; Return "parent" iff "self", which is known to specialize "parent", is
  ;;    identical to it;
  (let ((result
	  (case (defined-as self)
	    (:disjunction
	     (or (set-equal-p (disjuncts self) (disjuncts parent))
		 ;; does a throw or returns nil:
		 (and (not dontExpandP)
		      (expanded-parent-is-identical-p self parent))))
	    (otherwise
	     (and
	       (= (length (primitive-concepts self))
		  (length (primitive-concepts parent)))
	       (set-equal-p (restrictions self) (restrictions parent))
	       (set-equal-p (comparisons self) (comparisons parent))
	       (set-equal-p (computed-features self) (computed-features parent))
	       (eql (defined-set-feature self) (defined-set-feature parent))
               (set-equal-p (negated-concepts self) (negated-concepts parent))
	       (set-equal-p (disjunctive-features self)
			    (disjunctive-features parent))
	       (eql (defined-domain self) (defined-domain parent)) ;  TAR 7/6/99
	       )))))
 #L:trace-spec (trace-values "parent-is-identical-p" self parent result)
    (when result
      parent) ))

(defmethod parent-is-identical-p ((self FEATURE) parent dontExpandP)
  ;; The parent of a restriction or comparison is a null-restriction or
  ;;    null/comparison, which should never be identical to "self";
  (declare (ignore parent dontExpandP))
  nil )

(defmethod parent-is-identical-p ((self BINARY-RELATION) parent dontExpandP)
  ;; Helping function for "classify-below";
  ;; Return "parent" iff "self", which is known to specialize "parent", is
  ;;    identical to it;
  ;; Strategy: Check to see if "self" has NO features except the conjunct
  ;;    "parent", and features inherited from "parent"  If so, return
  ;;    success;  Otherwise, return failure and let the normal mechanism find
  ;;    a merge, if one exists;
  ;; Note: This procedure catches a special case (when "(defined-as self)" is
  ;;    null, and "(defined-as parent)" is non-nil) that is missed by the
  ;;    regular subsumption test;
  (declare (ignore dontExpandP))
  (let ((result
	  (and (not (primitive-p self))
	       (= (length (primitive-concepts self))
		  (length (primitive-concepts parent)))
	       (null (defined-as self))
	       (eq (defined-domain self) (defined-domain parent))
	       (eq (defined-range self) (defined-range parent))
	       (set-equal-p (disjunctive-features self)
			    (disjunctive-features parent))
	       (set-equal-p (computed-features self)
			    (computed-features parent)))))
 #L:trace-spec (trace-values "parent-is-identical-p yields:" result)
    (when result
      parent) ))

  ;;
;;;;;; "compute-already-known-children"
  ;;

(defmethod compute-already-known-children (self)
  ;; Called by "find-subsumees";
  ;; Return a set of concepts known to be subsumed by "self";
  ;; The default method returns the empty list;
  (declare (ignore self))
  nil )

(defmethod compute-already-known-children ((self TBOX-CONCEPT))
  ;; Called by "find-subsumees";
  ;; Return a set of concepts known to be subsumed by "self";
  ;; If "self" is a disjunction, then return the list of its disjuncts;
  (disjuncts self) )


  ;;
;;;;;; "merge-with-classified-concept" methods
  ;;

(defmethod merge-with-classified-concept ((mergingConcept FEATURE)
					  intoConcept)
  ;; Merge "mergingConcept" into (the already-classified) concept
  ;;    "intoConcept";
  ;; For features, no actual merge occurs -- we just return
  ;;    "intoConcept";
  (integrity-check (null (dependents mergingConcept)))
  intoConcept )

(defmethod merge-with-classified-concept ((mergingConcept TBOX-CONCEPT)
					  intoConcept)
  ;; Merge "mergingConcept" into (the already-classified) concept
  ;;    "intoConcept";
  ;; This is accomplished by revising both concepts, placing
  ;;    both of their definitions into "(source-definitions intoConcept)",
  ;;    and then rebuilding "intoConcept";
  (merge-concepts mergingConcept intoConcept) )
