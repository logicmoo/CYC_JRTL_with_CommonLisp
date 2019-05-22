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

;;; RETE.LISP (ABOX)

;;; Functions that construct the Alpha node portion of a Rete match
;;;    network 

(in-package "LOOM")

;(export '())


(def-cs-struct (RETE-NODE (:conc-name rete-))
  kind-of-test			;; :anchor :feature, :primitive, :disjunction, or nil
  test-object			;; feature/concept/monitor/list of concepts (disjuncts)
  (subsequent-output-nodes nil :context-sensitive-p nil)
  (consequent-nodes nil :context-sensitive-p nil)  ;; node is not `totally primitive'
  instance/support-table                ;; Internally context-sensitive
  (if-added-cohorts nil :context-sensitive-p t)	; list of production cohorts
  (if-removed-cohorts nil :context-sensitive-p t)	;            ""
  )


(defmethod print-object((self RETE-NODE) stream)
  (if (discarded-p self)
    (format stream "|RETE|:discarded")
    (format stream "|RETE|~S" (if (or (find-rete-node-concept self)     ;  TAR 2/3/94
                                      (rete-test-object self))
                                (generate-rete-pattern self)
                                :???)) ))

(defstruct (RETE-ANCHOR-NODE (:include RETE-NODE) (:conc-name rete-))
  )

(def-cs-struct (RETE-COMBINATOR-NODE (:include RETE-NODE) (:conc-name rete-))
  (prior-input-nodes nil :context-sensitive-p nil) ; at least one rete node
  defined-concept                                ; optional concept or cohort
  )
(defmethod print-object((self RETE-COMBINATOR-NODE) stream)
  (if (and (rete-defined-concept self)
	   (typep (rete-defined-concept self) 'UNARY-CONCEPT)
	   (name (rete-defined-concept self)))
      (format stream "|RETE|~S=~S" 
	      (name (rete-defined-concept self))
	      (generate-rete-pattern self))
      (call-next-method)) )             ; print system-defined node (are there any?)

(defmethod discard-instance ((self RETE-NODE))
  (setf (rete-kind-of-test self) :discarded) )

(defmethod discarded-p ((self RETE-NODE))
  (eq (rete-kind-of-test self) :discarded) )

(defun discarded-rete-node-p (self)
  (eq (rete-kind-of-test self) :discarded) )

(defmacro rete-recognized-concept (node)
  ;; Return the concept for which "node" is caching instantiation
  ;;    relationships;
  ;; For anchor nodes, this is the test concept; for combinator
  ;;    nodes, this is the defined concept, or NIL if there is
  ;;    no corresponding recognized concept;
  `(case (rete-kind-of-test ,node)
     (:anchor (rete-test-object ,node))
     (otherwise (rete-defined-concept ,node))) )

(defmacro combinator-node-p (node)
  `(neq (rete-kind-of-test ,node) :anchor) )

(defmethod instance-in-rete-network-p ((self t))
  ;; Return t if "self" is an instance participating in the rete network;
  nil )
(defmethod instance-in-rete-network-p ((self DB-INSTANCE))
  ;; Return t if "self" is an instance participating in the rete network;
  t )
(defmethod instance-in-rete-network-p ((self INSTANCE-IN-MATCH-NETWORK))
  ;; Return t if "self" is an instance participating in the rete network;
  t )


  ;;
;;;;;; Translation of Concepts into Cascaded Rete Nodes
  ;;


(defun find-or-create-rete-cascade (concept monitorCohort)
  ;; Find or create a cascading sequence of rete nodes that
  ;;    match instantiations of "concept";
  ;; Return the last node in the sequence;
  ;; If "monitorCohort", create a monitor cascade for "monitorCohort" instead;
  ;; "secondary-cascade-p" indicates that "concept" is a disjunct of a
  ;;    disjunction concept -- in this case the cascade gets created for
  ;;    "concept" (anchored at "monitorCohort" if the latter is non-nil) but
  ;;    "concept" does not get linked to "monitorCohort";
  ;; Side-effect: Point "concept" at the node returned;
  (when (and (rete-node concept)
	     (null monitorCohort))
    (return-from find-or-create-rete-cascade (rete-node concept)))
  (let* ((monitor (and monitorCohort
		      (primary-production monitorCohort)))
         node
	(*displayReteChangesP*
	  (and (member :display-match-changes *loom-match-features*)
	       (not (member :suppress-diehard-output *loom-dialogue-features*))
	       :needs-header)))
    (declare (special *displayReteChangesP*))
    (setq node
          (extend-rete-cascade
           concept
           (when monitor
             (list (extend-rete-cascade monitor nil)))))
    (when monitor
      ;; link up the last node in the cascade to "concept":
      ;; tricky: assumes that two cohorts for the same monitor necessarily
      ;;    map to different rete nodes;
      (setf (rete-defined-concept node) monitorcohort))
    node ))
     
(defun extend-rete-cascade (object priorNodes)
  ;; Starting from the cascade(s) ending at "priorNodes", find or create
  ;;    a combinator node for "object", and return that node;
  (when (and (concept-p object)
             (not (primitive-p object)))
    (return-from extend-rete-cascade
      (extend-defined-rete-cascade object priorNodes)))
  ;; "object" is a monitor or a primitive concept -- find or create a cascade,
  ;;    and return it:
  (if (null priorNodes)
    ;; return anchor node:
    (or (rete-node object)
        (create-rete-anchor-node object))
    ;; "object" is a primitive concept or a feature, find or create a cascade
    ;;    built upon "priorNodes":
    (or (loop for successorNode in (rete-subsequent-output-nodes (first priorNodes))
             when (and (eq (rete-test-object successorNode) object)
                          (set-equal-p (rete-prior-input-nodes successorNode)
                                       priorNodes))
             return successorNode)
        (create-rete-combinator-node object priorNodes))) )



(defun assert-directly-supported-instances (node concept)
  ;;  Add direct support for non incoherent instances of "node" that were
  ;;     asserted to be of type "concept";
  (loop for prior in (rete-prior-input-nodes node)
        do (loop for i in (key-list-of-assoc 
                           (rete-instance/support-table prior))
                 when (and (types-specialize-type 
                            (get-cached-types i) concept)
                           (not (incoherent-instance-p i)))
                 do (assert-rete-direct-support i node))) )

(defun extend-defined-rete-cascade (concept priorNodes)
  ;; Called by "extend-rete-cascade";
  ;; Expand "concept" and build up a cascade based on "priorNodes";
  ;; Return the node assigned to "concept";
  (let ((expansion (compute-concept-expansion concept))
        (expansionConcepts nil)
        (nextPriorNodes nil)
        (negatedConcepts (negated-concepts concept))
        node)
    (loop for obj in expansion
         when (typep obj 'UNARY-CONCEPT)
         do
         (delf expansion obj)
         (push obj expansionConcepts))
    ;; create independent rete nodes for each of the concepts in the
    ;;    expansion of "concept":
    (loop for c in expansionConcepts
         do (pushnew (extend-rete-cascade c priorNodes) nextPriorNodes))
    (cond
     ((eq (defined-as concept) :disjunction)
      (integrity-check (null expansion))
      (setq node (create-rete-combinator-node concept nextPriorNodes)))
     (expansion ;; generate rete nodes for features in the definition of "concept":
      (loop for ftr in expansion
            do
            (setq nextPriorNodes
                  (list (extend-rete-cascade ftr nextPriorNodes))))
      (setq node (first nextPriorNodes)))
     (negatedConcepts                   ;  TAR 7/14/94
      ;; TO DO: (1) Do we need to do an instrumented query on the negations
      ;;      here to make sure we get re-evaluated properly?
      ;;        (2) do we need to modify "create-rete-combinator-node"
      ;;      to store a different type of test?
      (setq node (create-rete-combinator-node concept nextPriorNodes)) )
     (t ;; "concept" is a pure conjunction
      ;; create rete node representing the conjunction of the prior nodes
      (integrity-check (rest nextPriorNodes))
      (setq node (create-rete-combinator-node nil nextPriorNodes)))) 
    ;; link "concept" to "node" unless its rooted at a monitor node:
    (unless (find-prior-monitor-node node)
      (setf (rete-defined-concept node) concept)
      (setf (rete-node concept) node))
    (assert-directly-supported-instances node concept)          ;  TAR 2/4/94
    ;; if concept has defined antecedents, link them to "node":
    (link-from-antecedent-nodes node)
;; PUT THIS BACK ONLY WHEN WE HAVE BOMBS TRIGGERING OFF OF DEFINED NODES:
;    (when (eq (rete-kind-of-test node) :disjunction)
;      ;; if "node" monitors a disjunctive concept, create a cascade
;      ;;    for each disjunct:
;      (loop for disjunct in (rete-test-object node)
;           do (extend-rete-cascade disjunct priorNodes)))
    node ))


#+CLTL2 (declaim (inline has-defined-antecedents-p))
#-CLTL2 (proclaim '(inline has-defined-antecedents-p))
(defun has-defined-antecedents-p (concept)
  ;; Return t if concept has an antecedent that is not totally primitive;
  (not (loop for ant in (most-general-antecedents concept)
            always (totally-primitive-p ant))) )

(defun anchor-node-concept-p (concept)
  ;; Return t if "concept" maps to an anchor node (rather than a
  ;;    combinator node);
  (primitive-p concept) )

(defun create-rete-anchor-node (conceptOrMonitor)
  ;; Create and return a new anchor node for the primitive concept
  ;;    or monitor "conceptOrMonitor";
  ;; Link it to "conceptOrMonitor";
  (let ((anchorNode (make-RETE-ANCHOR-NODE)))
    (setf (rete-instance/support-table anchorNode) (make-hash-table :size 5))
    (setf (rete-test-object anchorNode) conceptOrMonitor)
    (setf (rete-kind-of-test anchorNode) :anchor)
    (setf (rete-node conceptOrMonitor) anchorNode)
    (when (not (typep conceptOrMonitor 'UNARY-CONCEPT))
      ;; we are done if we are anchoring a monitor;
      (return-from create-rete-anchor-node anchorNode))
    ;; fill node memory with instances having :direct support:
    (loop for i in (generate-instances 
                    conceptOrMonitor :cached-p t)
          do (assert-rete-direct-support i anchorNode))
    (unless (totally-primitive-p conceptOrMonitor)
      ;; fill node memory with instances having :indirect support:
      (loop for i in (generate-instances conceptOrMonitor)
            do (assert-rete-antecedent-support i anchorNode)))
    ;; if concept has defined antecedents, link them to the anchor node:
    (link-from-antecedent-nodes anchorNode)
    anchorNode ))

(defun create-rete-combinator-node (concept priorNodes)
  ;; Create and return a combinator node for the feature or concept
  ;;    "concept"; link "concept" to "priorNodes";
  (let ((newNode (make-RETE-COMBINATOR-NODE)))
    (setf (rete-instance/support-table newNode) (make-hash-table :size 5))
    (setf (rete-test-object newNode) concept)
    (setf (rete-kind-of-test newNode)
	  (typecase concept
	    (UNARY-CONCEPT
             (cond
              ((or (primitive-p concept)
                   (negated-concepts concept))          ;  TAR 7/15/94
               :primitive)
              ((eq (defined-as concept) :disjunction)
               (setf (rete-test-object newNode) (disjuncts concept))
               :disjunction)
              (t nil)))                  ; defined as conjunction of prior nodes
	    (FEATURE :feature)
	    (PRODUCTION-COHORT
             (setf (rete-defined-concept newNode) concept)
             :transition)
            (otherwise nil)))
    (setf (rete-prior-input-nodes newNode) priorNodes)
    ;; fill local memory:
    (loop for prior in priorNodes
          do 
          (push newNode (rete-subsequent-output-nodes prior))
          (loop for i in (key-list-of-assoc (rete-instance/support-table prior))
                unless (get-rete-node-support i newNode)
	        do (assert-rete-prior-support i newNode prior)))
    newNode ))


(defun link-from-antecedent-nodes (node)
  ;; If the "concept" for "node" has defined antecedents, link them to "node";
  (loop for ant in (most-general-antecedents
               (find-rete-node-concept node))
       unless (totally-primitive-p ant)
       do (push node 
                (rete-consequent-nodes
                 (find-or-create-rete-cascade 
                  ant (find-prior-monitor-node node))))) )

(defun find-prior-monitor-node (node)
  ;; Return a monitor node equal or prior to "node", or nil if there is none;
  (cond
   ((typep (rete-test-object node) 'MONITOR) node)
   ((eq (rete-kind-of-test node) :anchor) nil)
   (t (find-prior-monitor-node (first (rete-prior-input-nodes node))))) )

(defmethod compute-concept-expansion ((topConcept TBOX-CONCEPT))
  ;; Return a list of concepts and features whose conjunction defines
  ;;    "topConcept";
  ;; Other concepts and features represent primitiveness and/or features
  ;;    not present in the definition of that first primitive concept;
  ;; TO DO: REWRITE THIS TO USE "parsed-source-definitions" OR SOME SUCH;
  (let ((conjuncts (conjuncts topConcept))
        (inheritedFeatures nil)
        (localFeatures nil))
    (flet ((push-inherited-features
	     (features)
	     (loop for f in features do (pushnew f inheritedFeatures)))
	   (push-local-features
	     (features)
	     (loop for f in features 
		  unless (member f inheritedFeatures)
		  do (pushnew f localFeatures))))
      ;; primitive and implied concepts become anchor nodes:
      (when (primitive-p topConcept)
	(return-from compute-concept-expansion (list topConcept)))
      (loop for c in conjuncts
	   do
	   (push-inherited-features (restrictions c))
	   (push-inherited-features (comparisons c))
	   (push-inherited-features (computed-features c)))
      (push-local-features (restrictions topConcept))
      (push-local-features (comparisons topConcept))
      (push-local-features (computed-features topConcept))
      (append conjuncts localFeatures) )))

(defun generate-rete-pattern (node)
  ;; Return a list of concept names and feature sources that
  ;;    identifies the pattern tested by "node";
  (let ((concept (find-rete-node-concept node))
        (*forceNamingOfUnnamedConcepts* nil)
        (*dontSubstituteNamesP* nil))
    (declare (special *forceNamingOfUnnamedConcepts* *dontSubstituteNamesP*))
    (flet ((generate-expression (outputObject)
             (etypecase outputObject
               (TBOX-CONCEPT
                (if (eq (defined-as outputObject) :disjunction)
                  `(:or ,@(loop for d in (disjuncts outputObject)
                               collect
                               ;; WE DON'T YET GENERATE RETE NODES FOR DISJUNCTS:
                               ;(generate-rete-pattern (rete-node d))
                               (name d)
                               ))
                  (name outputObject)))
               (RESTRICTION-FEATURE 
		(feature-to-source-clause outputObject))
               (COMPARISON-FEATURE 
                (generate-comparison-clause outputObject))
               (COMPUTED-FEATURE
                (generate-computed-feature-clause outputObject))
               (MONITOR
                (format nil "MONITOR-~A" (name outputObject)))
               (PRODUCTION-COHORT
                (format nil "COHORT-~A~A"
	                (name (primary-production outputObject))
	                `(,(transition-indicator outputObject)
                          ,(cohort-predicate outputObject)))))))
      (if concept
        (if (eq (defined-as concept) :disjunction)
          (generate-expression concept)
          (sparse-append (loop for object in (negated-concepts concept)
                               collect `(:not ,(name object)))
                         (loop for object in (compute-concept-expansion concept)      ; concept or monitor
                               collect (generate-expression object))))
        (cons (generate-expression (rete-test-object node))
              (loop for prior in (rete-prior-input-nodes node) 
                   append (generate-rete-pattern prior)))) )))


(defun find-rete-node-concept (node)
  ;; Return the concept associated with node, if there is one;
  (case (rete-kind-of-test node)
    (:anchor (rete-test-object node))
    (otherwise (rete-defined-concept node))) )


  ;;
;;;;;; Instance/Rete Node Support Tables
  ;;

;;; CONSIDER REPLACING THIS WITH MUTABLE TABLES THAT USE LISTS WHEN
;;;    THE TABLES ARE SMALL

;;; SUPPORT INDICATOR
;;;    If an instance is supported at a node, then support is
;;;       entered into the support table as :direct, or :indirect.
;;;    :direct indicates that support derives from a direct assertion --
;;;       if C is the concept that "node" represents, then an instance
;;;       has :direct support for "node" if it is asserted to belong
;;;       to C, or a subconcept of C, or a primitive antecedent of C.
;;;       Only anchors and combinators with a "defined-concept" filler
;;;       can have :direct support.
;;;    :indirect indicates that support exists, but the support is not
;;;       the result of a single direct assertion.  During retraction
;;;       indirect support must be ignored to avoid non-well-founded proofs;

;; TO DO: CONSIDER ELIMINATING THE :direct/:indirect DISTINCTION.

#+CLTL2 (declaim (inline get-rete-node-support))
#-CLTL2 (proclaim '(inline get-rete-node-support))
(defun get-rete-node-support (instance node)
  ;; Return :direct or :indirect if "instance" is a member of the
  ;;    instance table of "node";
  ;; Otherwise return NIL;
  (access-in-ctxt (gethash instance (rete-instance/support-table node))
                  nil nil) )

#+CLTL2 (declaim (inline set-rete-node-support))
#-CLTL2 (proclaim '(inline set-rete-node-support))
(defun set-rete-node-support (instance node supportIndicator)
  ;; Set the support table entry for "instance" at the rete node "node"
  ;;    equal to "support";
  (let* ((hashtable (rete-instance/support-table node))
         (value (gethash instance hashtable)))
    (update-in-ctxt #'(lambda (x y) (setf (gethash x hashtable) y))
                    instance
                    value
                    supportIndicator
                    t)
    supportIndicator))



  ;;
;;;;;; Rete Network Propagation Functions
  ;;

#|

ANCHOR AND COMBINATOR NODES

Primitive concepts and monitors are tied to anchor nodes, while other
concepts are tied to combinator nodes. The combinator node pointed to
by a (defined) concept represents the last in a series (cascade) of
nodes that collectively builds up the conjunctive definition. The
prior input nodes for a disjunctive combinator node represents the
conjunctive part of the disjunctive definitions, while the test
concept tests each of the disjuncts that define the concept.

Support for an instance at an anchor node can be due to a direct
assertion of membership in "test-object" or one of its subconcepts
or a primitive antecedent.  This is recorded in the
instance/support table as :direct support.  Otherwise, support
is :indirect, and derives from a non totally primitive antecedent.
:direct support is preferable, because it eliminates
the possibility of circular support.

Support for an instance at a combinator node is a combination of
support for that "instance" at "prior-input-nodes" and support for
"test-object".  "test-object" is a primitive concept, a feature or a 
disjunction concept, or nil if the node represents a pure conjunction 
of other concepts.

ANTECEDENTS

No special machinery is needed to account for primitive antecedents
of a concept, because the update machinery already propagates a direct
assertion to all of its consequents.  This is NOT the case for
defined antecedents (ones that are non-primitive or have their own
antecedents.  In this case, we establish a "consequent-nodes" link
between the antecedent node and the consequent node (always an anchor
node).  Whenever an instance gains support at the antecedent
node, its support is recomputed at the consequent.  However, because
instances monitor themselves, consequents don't need to be informed 
when antecedent support is lost.

Defined antecedents get special treatment because they can introduce
new instances into the rete network.  By contrast, concept generators
within :satisfies features and disjuncts within a disjunctive combinator
are "well-behaved" in that they always have a single instance as a dependent.

BOMB TRIGGERING

Rete concept bombs only trigger on direct assertions and retractions,
never on derivations of defined concepts.  If a defined concept C
is referenced within a feature (or disjunction), the backchainer 
ultimately grounds its proof in direct assertions, which will have
bombs attached.  If a defined concept is a part of the definition of
a concept attached to a rete node, then its definitional expansion is evaluated
by the rete network.

This leaves only the case of defined antecedents.
These are also evaluated by network cascades.  The expansion of defined
concepts is an optimization -- the net could have been made to function
using only anchor nodes.  As noted under "ANTECEDENTS" the only kind of
concept generators needed are ones that support a single instance (i.e.,
there is no need to add support for concept generators that introduce
multiple instances into the network.

|#

(defun assert-rete-direct-support (instance node)
  ;; Situation: "instance" has been asserted to belong to the concept
  ;;    (or one of its subconcepts or primitive antecedents) that
  ;;    "node" represents;
  ;; If full support for "instance" at "node" is absent, add that support;
  ;; Called by "update-type-modified-rete-instance";
  (if (get-rete-node-support instance node)
    (set-rete-node-support instance node :direct)  ;; possibly upgrade existing support
    (assert-rete-full-support instance node :direct)))

(defun assert-rete-antecedent-support (instance anchorNode)
  ;; Situation: "instance" has been inferred to belong to one of its defined
  ;;    antecedents of the concept that "anchorNode" represents;
  ;; If support for "instance" at "anchorNode" does not already exist,
  ;;    add :indirect support and establish any rete bombs needed to
  ;;    monitor the support;
  ;; Called by "create-rete-anchor-node" and "assert-rete-full-support";
  (unless (get-rete-node-support instance anchorNode)
    (assert-rete-full-support instance anchorNode :indirect)
    (monitor-non-totally-primitive-concept-p anchorNode instance)) )

(defun assert-rete-prior-support (instance node priorNode)
  ;; Situation: "node" is a combinator node with new prior support
  ;;    for "instance";
  ;; Check for support of the test concept;
  ;; If it exists, act on the newly recognized full support and
  ;;    install an if-removed monitor on "instance";
  ;; Otherwise, install if-added type and/or feature bombs on "instance"
  ;;    to detect future support for the test concept;
  (integrity-check (rete-prior-input-nodes node))
  (unless (loop for prior in (rete-prior-input-nodes node)
                always (or (eq prior priorNode)
                           (get-rete-node-support instance prior)))
    ;; exit of some prior support is still missing:
    (return-from assert-rete-prior-support nil))
  ;; BUG:??? THIS MAY NOT RESPOND CORRECTLY WHEN ANTECEDENT SUPPORT
  ;;    EXISTS:
  (when (eq (rete-kind-of-test node) :transition)
    (recognize&monitor-transition instance node)
    (return-from assert-rete-prior-support nil))
  (when (check-test-concept/feature-support-p instance node)
    (assert-rete-full-support instance node :indirect)) )


(defun assert-rete-full-support (instance node supportIndicator)
  ;; Situation: "instance" is newly supported at "node";
  ;; Record the support, with support type indicated by "supportIndicator";
  ;; Act on any triggers attached to "instance" or to concept
  ;;    recognized by "node" (if there is one);
  ;; Propagate prior support to nodes "(subsequent-output-nodes node)";
  (set-rete-node-support instance node supportIndicator)
  (act-on-rete-monitored-instance instance node nil)
  (loop for n in (rete-subsequent-output-nodes node)
       unless (get-rete-node-support instance n)
       do (assert-rete-prior-support instance n node))
  (loop for n in (rete-consequent-nodes node)
       do (assert-rete-antecedent-support instance n)) )

(defun check-test-concept/feature-support-p (instance node)
  ;; Check for support of the test concept or test feature;
  ;; Return t iff support for the test object exists;
  ;; If it exists install an if-removed rete bomb on "instance";
  ;; Otherwise, install if-added concept or feature bomb(s) on
  ;;    "instance" to detect future support for the test concept;
  (case (rete-kind-of-test node)
    (:primitive
     (if (totally-primitive-p (rete-test-object node))
       (monitor-rete-primitive-concept-p node instance)
       (monitor-non-totally-primitive-concept-p node instance)))
    (:feature
     (monitor-rete-feature-p node instance))
    (:disjunction
     (monitor-rete-feature-p node instance :disjunction-p t))
    (otherwise
     (integrity-check (null (rete-kind-of-test node)))
     t)) )

(defun retract-rete-direct-support (instance node)
  ;; Situation: An assertion of direct support that "instance" belongs to the
  ;;    concept (or one of its subconcepts or primitive antecedents) that
  ;;    "node" represents has been withdrawn;
  ;; Look for indirect support, and revise the support
  ;;    indicator for "instance" at "node" accordingly;
  ;; Called by "update-type-modified-rete-instance";
  (case (rete-kind-of-test node)
    (:anchor
     (if (and (not (totally-primitive-p (rete-test-object node)))
              (monitor-non-totally-primitive-concept-p node instance))
       (set-rete-node-support instance node :indirect)
       (retract-rete-full-support instance node)))
    (otherwise                          ;  TAR 3/2/94
     (cond ((and (loop for prior in (rete-prior-input-nodes node)
                       always (get-rete-node-support instance prior))
                 (check-test-concept/feature-support-p instance node))
            (set-rete-node-support instance node :indirect))
           ((and (rete-defined-concept node)
                 (most-general-antecedents (rete-defined-concept node))
                 (monitor-non-totally-primitive-concept-p node instance))
            (set-rete-node-support instance node :indirect))
           (t 
            (retract-rete-full-support instance node))))) )

(defun retract-rete-antecedent-support (instance node)
  ;; Situation: Indirect support that "instance" belongs to the concept
  ;;    (or one of its subconcepts or primitive antecedents) that
  ;;    "node" defines has been withdrawn;
  ;; Look for alternate support, and place rete monitors to monitor the
  ;;    resulting support or lack of it;
  ;; Called by "retract-rete-full-support";
  (let ((support (get-rete-node-support instance node)))
    (and support
         (or (eq (get-rete-node-support instance node) :direct)
             (monitor-non-totally-primitive-concept-p node instance)
             (retract-rete-full-support instance node))) ))

(defun retract-rete-prior-support (instance node)
  ;; Situation: "node" is a combinator node which has lost prior support
  ;;    for "instance" and has no :direct support;
  ;; Check if antecedent support exists -- if not, retract full support;
  (let ((definedConcept (rete-defined-concept node)))
      ;; tricky: "instance" has lost prior support at "node", and any bombs
      ;;    associated with the test object are now irrelevant.  We can
      ;;    eliminate them without remonitoring:
    (delete-orphaned-bombs instance node)
    ;; tricky: there are no concept bombs needed for antecedents:
    ;; TO DO: FIGURE OUT IF ANTECEDENTS ARE GENERATING BOMBS THAT WE
    ;;    FAIL TO DELETE HERE:
    (unless (and definedConcept
                 (most-general-antecedents definedConcept)
                 (monitor-non-totally-primitive-concept-p node instance))
      (retract-rete-full-support instance node)) ))

(defun retract-rete-full-support (instance node)
  ;; Situation: "instance" is now unsupported at rete node "node";
  ;; Mark it as unsupported, inform concept cohorts, and recursively retract
  ;;    full support from successors;
  ;; Tricky: If a successor of "node" only has :indirect support, then
  ;;    we can retract its support without looking for alternate support;
  (when (null (get-rete-node-support instance node))
    ;; incoherent instances retract support redundantly -- we break here
    ;;    if a non-incoherent instance has no support at "node":
    (integrity-check (incoherent-instance-p instance))
    (return-from retract-rete-full-support nil))
  (set-rete-node-support instance node nil)
  (act-on-rete-monitored-instance instance node t)
  (loop for n in (rete-subsequent-output-nodes node)
       do
       ;; retract support from successors unless they have :direct
       ;;    support or no support:
       (when (eq (get-rete-node-support instance n) :indirect)
         (retract-rete-prior-support instance n)))
;  (loop for n in (rete-consequent-nodes node)   ;  TAR 3/2/94
;       do (retract-rete-antecedent-support instance n))
 )

(defun delete-orphaned-bombs (instance node)
  ;; Helping function for "retract-rete-prior-support";
  ;; Situation:  "instance" has lost its support;
  ;; Discard each bomb on "instance" associated with the
  ;;    rete node "node", and remove it
  ;;    from the lists of bombs attached to "instance";
  ;; Note: leaves the rete network in the same state as before the
  ;;    assertion which caused the bomb to be added;
  (removef-members
   (rete-concept-bombs instance)
   (loop for bomb in (rete-concept-bombs instance)
         when (eq (rete-bomb-dependent-node bomb) node)
         collect bomb))
  (removef-members
   (rete-role-bombs instance)
   (loop for bomb in (rete-role-bombs instance)
         when (eq (rete-bomb-dependent-node bomb) node)
         collect bomb)) )


  ;;
;;;;;; Rete network satisfaction test functions
  ;;

#|

During rete net computations, tests are made to see if instances
satisfy individual features and concepts. Because the rete net cannot
be everywhere consistent during these tests, and because of the need
to avoid cyclic dependencies, we distinguish between tests that
reference network node caches and those that don't. Caches are valid
during propagation of assertions, but are not valid during retraction.
The special variable *reteRetractionModeP* controls (inside of
"has-instance-p") whether or not rete caches are accessed during a
proof.

Tricky:  As noted previously, monitoring of instances triggers only
in response to direct assertions and retractions.  Therefore, the
entrance of "retraction mode" can be isolated to a single entry --
the function "retract-rete-direct-support".  Within that function,
we signal the mode by binding the special variable *reteRetractionModeP*.
That variable is monitored by "has-instance-p", which avoids using
rete cache memory during retraction mode.

|#

;; THIS FUNCTION IS NOT CURRENTLY USED, BUT WILL BE IF CALLS TO "has-instance-p"
;;    NEED A WRAPPER:
(defun rete-has-instance-p (concept instance)
  ;; Return t if "concept" is satisfied by "instance";
  (execute-query
    (has-instance-p concept instance)) )

;; "rete-feature-is-satisfied-p" IS HERE IN CASE AN "execute-query" WRAPPER
;;     IS NEEDED.  IF THATS NOT THE CASE, REPLACE CALLS TO IT BY CALLS TO
;;     "feature-is-satisfied-p":
(defun rete-feature-is-satisfied-p (feature instance)
  ;; Return t if "feature" is inherited by "instance" or a probe
  ;;    proves that it is satisfied;
  (execute-query
     (feature-is-satisfied-p feature instance)) )

(defun rete-test-object-is-satisfied-p (node instance)
  ;; Return t if the test object for "node" is satisfied by "instance";
  (let ((testObject (rete-test-object node)))
    (case (rete-kind-of-test node)
      (:feature (rete-feature-is-satisfied-p testObject instance))
      (:disjunction
       (loop for c in testObject thereis (rete-has-instance-p c instance)))  ; DGB 3/12/93
      ((:anchor :primitive) (rete-has-instance-p testObject instance))
      (otherwise
       (integrity-check (null (rete-kind-of-test node)))
       t)) ))
    

  ;;
;;;;;; Planting rete bombs/monitors
  ;;

;;; When the type of an instance becomes more specific, its more
;;;    specific consequent is computed, and all super concepts are
;;;    scanned for attached rete nodes.  Any such nodes are checked for
;;;    new full support.  Any rete bombs attached to the instance were
;;;    placed by dependent combinator nodes or complex anchor nodes that
;;;    are monitoring support for their test concepts.

;;; For both concepts and features we implement quick and slow methods
;;;    for planting bombs.  For  primitive concepts quick means avoiding
;;;    instrumentation.

(defun monitor-rete-primitive-concept-p (node instance)
  ;; Attach a rete concept bomb to "instance" to inform "node" of
  ;;    change in support wrt "concept";
  ;; Return t if "instance" satisfies the totally primitive concept tested
  ;;    by "node";
  (let* ((concept (rete-test-object node))
	 satisfiedP)
    (setq satisfiedP (has-instance-p concept instance))
    (plant-rete-concept-bomb instance node concept satisfiedP nil nil)
    satisfiedP ))

(defun monitor-non-totally-primitive-concept-p (node instance)
  ;; Situation: "concept" is a complex anchored concept;
  ;; Set up instrumentation, perform the query, install bombs, and
  ;;    return query result;
  (let ((*collectedRoleGenerators* nil)
	(*collectedConceptTests* nil)
	(*collectedConceptGenerators* nil)
	satisfiedP)		       
    (declare (special *collectedRoleGenerators* *collectedConceptTests*
		      *collectedConceptGenerators*))
    (setq satisfiedP (has-instance-p (rete-test-object node) instance))
    (monitor-rete-instrumented-test 
      node instance satisfiedP *collectedRoleGenerators*
      *collectedConceptTests* *collectedConceptGenerators*)
    satisfiedP ) )

(defun monitor-rete-feature-p (node instance &key disjunction-p)
  ;; Plant rete bombs on "instance" to monitor the feature
  ;;    "(rete-test-object node)" and inform "node" if the feature 
  ;;    status changes wrt "instance";
  ;; Return t if "instance" satisfies the test feature on "node";
  ;; Note: Some callers of this function have already performed a
  ;;    feature probe, and don't make use of the returned value;
  (let ((feature (rete-test-object node))
	satisfiedP)
    (if (or disjunction-p
	    (instrument-p feature)
 ;; THIS SHORT-CIRCUIT MAY BECOME PERMANENT:
            t)
	(let ((*collectedRoleGenerators* nil)
	      (*collectedConceptTests* nil)
	      (*collectedConceptGenerators* nil))		       
	  (declare (special *collectedRoleGenerators* *collectedConceptTests*
			    *collectedConceptGenerators*))
	  (setq satisfiedP 
		(if disjunction-p
		    (loop for c in feature
			 thereis (has-instance-p c instance))
		    (rete-feature-is-satisfied-p feature instance)))
	  (monitor-rete-instrumented-test 
	    node instance satisfiedP *collectedRoleGenerators*
            *collectedConceptTests* *collectedConceptGenerators*))
	(let ((*collectedTriggerInstances* nil))
	  (declare (special *collectedTriggerInstances*))
	  (setq satisfiedP (rete-feature-is-satisfied-p feature instance))
	  (monitor-rete-simple-feature feature node instance satisfiedP
					    *collectedTriggerInstances*)))
    satisfiedP ))

(defmethod monitor-rete-simple-feature 
	   ((feature RESTRICTION-FEATURE) node instance satisfiedP triggerInstances)
  ;; Helping function for "monitor-rete-feature-p";
  ;; Plant a rete feature bomb on "instance" to monitor the feature "feature"
  ;;    depended on by "node";
  ;; If "triggerInstances", then "feature" has a value restriction or
  ;;    qualification (but not both).  Plant remote rete concept bombs on
  ;;    each of "triggerInstances";
  ;; Tricky: Bombs on trigger instances necessarily have the same value for
  ;;    their "satisfied-p" and "trigger-concept-was-satisfied-p" slots;
  (plant-rete-role-bomb instance node (relation feature) satisfiedP nil)
  (loop for tin in triggerInstances
       do
       (plant-rete-concept-bomb
	 instance node				; dependent instance
	 (case (feature-type feature)		; trigger concept
	   (:value-restriction (value-restriction feature))
	   ;; qualified :min-restriction:
	   (otherwise (qualification feature))) 
	 satisfiedP				; dependent was satisfied
	 tin					; trigger instance
	 satisfiedP)) )				; trigger concept was satisfied

(defmethod monitor-rete-simple-feature 
	   ((feature COMPARISON-FEATURE) node instance satisfiedP triggerInstances)
  ;; Helping function for "monitor-rete-feature-p";
  ;; For each role in "feature", plant a rete feature bomb on "instance"
  ;;    to monitor the feature "feature" depended on by "node";
  (declare (ignore triggerInstances))
  (loop for r in (roles feature)
       do (plant-rete-role-bomb instance node r satisfiedP nil)))

(defun monitor-rete-instrumented-test 
       (node instance satisfiedP roleGenerators conceptTests conceptGenerators)
  ;; Helping function for "monitor-rete-feature-p";
  ;; Situation: The outcome "satisfiedP" of evaluating "feature" on
  ;;    "instance" depends on tests collected into the three lists
  ;;    "roleGenerators", "conceptTests" and "conceptGenerators";
  ;; Plant local and/or remote rete bombs on appropriate instances to detect
  ;;    possible changes in support for this computation;
  (loop for entry in roleGenerators	; role generators
	 do
	 (plant-rete-role-bomb 
	   instance node			; dependent instance
	   (cdr entry)				; trigger role
	   satisfiedP
	   (car entry)))			; trigger instance
  (loop for (triggerInstance triggerConcept . conceptSatisfiedP) in conceptTests
        do
        (if (consp triggerConcept)
          (plant-rete-conflict-bomb
           instance node			; dependent instance
           (second triggerConcept)      	; actual concept
           satisfiedP
           triggerInstance			; trigger instance
           conceptSatisfiedP)			; concept-was-satisfied-p
          (plant-rete-concept-bomb
           instance node			; dependent instance
           triggerConcept satisfiedP
           triggerInstance			; trigger instance
           conceptSatisfiedP)))			; concept-was-satisfied-p
    (loop for type in conceptGenerators
	 do 
	 (plant-rete-concept-generator-bomb type instance node satisfiedP)) )

(defun remonitor-rete-test-object (node instance)
  ;; Called by "detonate-rete-concept-bombs" and "detonate-rete-role-bombs";
  ;; Situation:  A role bomb for "node" on "instance" has failed to detonate
  ;;    on, but the logical support or lack of it may have changed.
  ;; Plant new bomb(s);
  (ecase (rete-kind-of-test node)
    (:feature ;       
     (monitor-rete-feature-p node instance))
    (:disjunction
     (monitor-rete-feature-p node instance :disjunction-p t))
    ((:anchor :primitive)
     (if (totally-primitive-p (rete-test-object node))
       (monitor-rete-primitive-concept-p node instance)
       (monitor-non-totally-primitive-concept-p node instance)))) )

(defun plant-rete-role-bomb 
       (dependentInstance node triggerRole satisfiedP triggerInstance)
  ;; Create a rete feature bomb to monitor the role "triggerRole",
  ;;    and push it onto the feature bombs for "instance";
  ;; If "triggerInstance" is set and doesn't match "instance", then
  ;;    create a remote bomb instead of a local one;
  ;; Note: Bombs don't record which instance they are monitoring;
  (flet ((matches-local-bomb-attributes-p (bomb type)                     
           (and (eq (rete-bomb-dependent-node bomb) node)
                (eq (rete-bomb-trigger-object bomb) triggerRole)
                (eq (rete-bomb-type bomb) type))))
    (let (duplicateBomb)           
      (if (or (null triggerInstance)
	      (eq triggerInstance dependentInstance))
        ;; local bomb -- trigger instance = dependent instance:
        (if (setq duplicateBomb
                  (loop for bomb in (rete-role-bombs dependentInstance)
                       when (matches-local-bomb-attributes-p bomb :local)
                       return bomb))
          (setf (rete-bomb-test-object-was-satisfied-p duplicateBomb) satisfiedP)
          (push
	   (create-rete-bomb :local node triggerRole satisfiedP)
	   (rete-role-bombs dependentInstance)))
        ;; remote bomb:
        (if (setq duplicateBomb
                  (loop for bomb in (rete-role-bombs triggerInstance)
                       when (and (matches-local-bomb-attributes-p bomb :remote)
                                    (eq (rete-bomb-dependent-instance bomb)
                                        dependentInstance))
                       return bomb))
          (setf (rete-bomb-test-object-was-satisfied-p duplicateBomb) satisfiedP)
          (push
	   (create-rete-remote-bomb
	    :remote node triggerRole satisfiedP dependentInstance nil)
	   (rete-role-bombs triggerInstance)))) )))

(defun plant-rete-concept-bomb
       (dependentInstance node triggerConcept satisfiedP
	                  triggerInstance conceptWasSatisfiedP)
  ;; Create a rete concept bomb to monitor the concept "triggerConcept", and
  ;;    push it onto the concept bombs for "triggerInstance" ;
  ;; If "triggerInstance" is set and doesn't match "instance", then
  ;;    create a remote bomb instead of a local one;
  (flet ((matches-local-bomb-attributes-p (bomb type)                     
           (and (eq (rete-bomb-dependent-node bomb) node)
                (eq (rete-bomb-trigger-object bomb) triggerConcept)
                (eq (rete-bomb-type bomb) type))))
    (let (duplicateBomb)           
      (if (or (null triggerInstance)
	      (eq triggerInstance dependentInstance))
        ;; local bomb --trigger instance = dependent instance:
        (if (setq duplicateBomb
                  (loop for bomb in (rete-concept-bombs dependentInstance)
                       when (matches-local-bomb-attributes-p bomb :local)
                       return bomb))
          ;; reuse duplicate local bomb:
          (setf (rete-bomb-test-object-was-satisfied-p duplicateBomb) satisfiedP)
          (push                         ; create new local bomb
           (create-rete-bomb :local node triggerConcept satisfiedP)
           (rete-concept-bombs dependentInstance)))
        (if (setq duplicateBomb
                  (loop for bomb in (rete-concept-bombs triggerInstance)
                       when (and (matches-local-bomb-attributes-p bomb :remote)
                                    (eq (rete-bomb-dependent-instance bomb)
                                        dependentInstance))
                       return bomb))
          (progn                        ; reuse duplicate remote bomb
            (setf (rete-bomb-test-object-was-satisfied-p duplicateBomb) satisfiedP)
            (setf (rete-bomb-trigger-concept-was-satisfied-p duplicateBomb)
                  conceptWasSatisfiedP))
          (push                         ; create new remote bomb
           (create-rete-remote-bomb
            :remote node triggerConcept satisfiedP dependentInstance conceptWasSatisfiedP)
           (rete-concept-bombs triggerInstance)))) )))

(defun plant-rete-conflict-bomb
       (dependentInstance node triggerConcept satisfiedP
	triggerInstance conceptWasSatisfiedP)
  ;; Create a remote rete :conflict bomb to monitor the concept "triggerConcept", 
  ;;    and push it onto the concept bombs for "triggerInstance";
  ;; We always use remote bombs to store conflicts because the bomb
  ;;    data structure does not provide a means for distinguishing between
  ;;    local and remote conflicts;
  ;; TO DO: UPGRADE TO REUSE DUPLICATE BOMBS;
  (push
    (create-rete-remote-bomb
      :conflict node triggerConcept satisfiedP dependentInstance conceptWasSatisfiedP)
    (rete-concept-bombs triggerInstance)) )

(defun plant-rete-concept-generator-bomb (concept instance node satisfiedP)
  ;; 
  (declare (ignore concept instance node satisfiedP))
  (cerror """NOT YET IMPLEMENTED")
  )


  ;;
;;;;;; Triggering match network recomputation
  ;;

;;; TRIGGER INPUT LOCATIONS

;;; Activity in the match network is initiated either when a conjunct
;;;    or role filler is asserted/retraced to/from an instance, or when
;;;    a defined network node is matched, and rete bombs are attached
;;;    (WHERE ARE THEY ATTACHED???).  Determination of where rematching
;;;    should take place is made by scanning the concept hierarchy
;;;    (super concepts) for attached rete nodes, and by scanning rete
;;;    type and feature bombs attached to instances.

(defun post-modified-rete-instance (instance)
  ;; Post "instance" (unless its already there) to a queue of instances
  ;;    whose types may change at the beginning of the next time step;
  ;; TO DO: UPGRADE TO HASH TABLE, OR USE SLOT ON "instance" TO AVOID
  ;;    CHECKING FOR DUPLICATES HERE:
  (pushnew instance *list-of-modified-rete-instances*) )

(defun update-rete-match-network ()
  ;; *list-of-modified-rete-instances* lists instances that need to be
  ;;    rematched within the rete network, because their types
  ;;    have changed, and/or because the a slot update triggered
  ;;    a rete role bomb;
  ;; Note: When displaying changes to the rete match network, we defer
  ;;    printing a header until we are sure that at least one match has changed;
  ;; Kludge: We punt in the case that instances are incoherent -- they
  ;;    become unmatched everywhere in the net;
  (let ((*displayReteChangesP*
         (and (member :display-match-changes *loom-match-features*)
              (not (member :suppress-diehard-output *loom-dialogue-features*))
              :needs-header)))
    (declare (special *displayReteChangesP*))
    (loop for i in *list-of-modified-rete-instances*
	  do 
          (if (discarded-p i)           ; RMM 1/20/95
            (retract-discard-from-rete-network i t)
	    (let ((previousInstance (previous-instance i)))
              (when previousInstance    ; Handle pathological case via change-class
                (let ((oldTypes (list-of (db-type previousInstance)))
		      ;; DOES THIS ALREADY FIND THE CONSEQUENT CONCEPT:???
		      (newTypes (values (get-cached-types i))))
	          (when (not (set-equal-p oldTypes newTypes))
	            (update-type-modified-rete-instance i oldTypes newTypes t))
	          (when (rete-role-bombs i)
	            (detonate-rete-role-bombs i previousInstance)) )) )))
    (setq *list-of-modified-rete-instances* nil) ))

(defun scan-holds-true-cohorts (instance oldTypes newTypes)
  ;;  If a production exists that is monitoring additions or removals of
  ;;     instances from concepts, compute which types are logically newly
  ;;     present, or logically newly absent, and inform the production
  ;;     cohorts of the change.
  (when (if-removed-cohorts (loom-constant HOLDS-TRUE-2))
    (loop for oldC in oldTypes
          unless (or (member oldC newTypes)
                     (loop for newC in newTypes
                           thereis (subconcept-p newC oldC)))
          do (distribute-binding-set-to-cohorts
              (cons oldC instance)
              (if-removed-cohorts (loom-constant HOLDS-TRUE-2)))))
  (when (if-added-cohorts (loom-constant HOLDS-TRUE-2))
    (loop for newC in newTypes
          unless (or (member newC oldTypes)
                     (loop for oldC in oldTypes
                           thereis (subconcept-p oldC newC)))
          do (distribute-binding-set-to-cohorts
              (cons newC instance)
              (if-added-cohorts (loom-constant HOLDS-TRUE-2))))) )

(defun update-type-modified-rete-instance (instance oldTypes newTypes detonateP)
  ;; Situation: The type of "instance" has changed from "oldTypes" to "newTypes"
  ;;    Note: Both are assumed to be LISTS!!!.
  ;; Identify entry and exit concepts for "instance" that have rete nodes 
  ;;    attached, and for each assert or retract direct support;
  ;; Detonate any rete concept bombs that match entry or exit concepts;
  ;; Tricky strategy for computing entry and exit concepts:
  ;;    Mark all "old" concepts (at or above "oldTypes") with pass counter A.
  ;;    Mark all "new" concepts (at or above "newTypes") with pass counter B, AND
  ;;       simultaneously process each concept marked "new" but not marked "old";
  ;;    Rescan all "old" concepts, and process each concept marked "old" but not
  ;;       marked "new";
  (declare (inline scan-holds-true-cohorts))
  (let ((oldPassCounter (decf *revise-subgraph-pass-counter*))	; already-revised-counter
	(newPassCounter (incf *classify-concept-pass-counter*)))	; already-visited-counter
    (scan-holds-true-cohorts instance oldTypes newTypes)
    (loop for oldC in oldTypes
          do 
          (setf (already-revised-counter oldC) oldPassCounter)	; mark as old
          (loop for super in (all-super-concepts oldC)	               ;; mark supers as old 
                when (rete-node super)
                do (setf (already-revised-counter super) oldPassCounter)))
    (loop for newC in newTypes
          do
          (setf (already-visited-counter newC) newPassCounter)	; mark as new
          (when (and (rete-node newC)
                     (not (eql (already-revised-counter newC) oldPassCounter)))       ;  not old?
            (assert-rete-direct-support instance (rete-node newC)))
          (loop for super in (all-super-concepts newC)	               ;; mark supers as new
	        when (rete-node super)
	        do
	        (setf (already-visited-counter super) newPassCounter)
	        (when (not (eql (already-revised-counter super) oldPassCounter))	; not old?
	          (assert-rete-direct-support instance (rete-node super)))))
    (loop for oldC in oldTypes
          do
          (when (and (rete-node oldC)
                     (not (eql (already-visited-counter oldC) newPassCounter)))       ; not new?
            (retract-rete-direct-support instance (rete-node oldC)))
          (loop for super in (all-super-concepts oldC)
	        when (rete-node super)
	        do
	        (when (not (eql (already-visited-counter super) newPassCounter))	; not new?
	          (retract-rete-direct-support instance (rete-node super)))))
    ;; now that all concepts are marked, scan rete concept bombs on "instance":
    (when detonateP                     ; TAR 10/20/93
      (detonate-rete-concept-bombs instance oldPassCounter newPassCounter)) ))

;;; The function "retract-discard-from-rete-network" removes discarded
;;;    objects from Rete nodes.  However, discards DO NOT trigger productions,
;;;    so this is simply clean-up code:

(defun retract-discard-from-rete-network (self detonateP)
  ;; Situation:  "self" has been discarded;
  ;; Eliminate it from the rete net;
  (let ((oldTypes (list-of (or (get-cached-types self)
                               (intrinsic-concept self)
                               *thing*))))
    (update-type-modified-rete-instance self oldTypes *list-of-thing* detonateP))
  nil )

#+CLTL2 (declaim (inline trigger-concept-has-been-triggered-p))
#-CLTL2 (proclaim '(inline trigger-concept-has-been-triggered-p))
(defun trigger-concept-has-been-triggered-p 
       (triggerConcept wasSatisfiedP oldPassCounter newPassCounter)
  ;; Helping function for "detonate-rete-concept-bombs";
  (if wasSatisfiedP
      ;; newly unsatisfied?:
      (and (eql (already-revised-counter triggerConcept) oldPassCounter)
	   (not (eql (already-visited-counter triggerConcept) newPassCounter)))
      ;; newly satisfied?:
      (and (eql (already-visited-counter triggerConcept) newPassCounter)
	   (not (eql (already-revised-counter triggerConcept) oldPassCounter)))) )

(defun detonate-rete-concept-bombs (instance oldPassCounter newPassCounter)
  ;; Helping function for "update-type-modified-rete-instance";
  ;; Scan :local and :remote concept bombs, as well as :conflict bombs,
  ;;    and detonate those that trigger a change in the rete net;
  ;; The concept hierarchy has been doubly marked, recording all concepts
  ;;    that "instance" now matches, and all that it previously matched;
  (let ((triggeredBombs
         (loop for bomb in (rete-concept-bombs instance)
              when
              (case (rete-bomb-type bomb)
                (:conflict
                 (logically-equal-p
                  (not (rete-bomb-test-object-was-satisfied-p bomb))
                  (types-conflict-with-type
                   (get-cached-types instance)
                   (rete-bomb-trigger-object bomb))))
                (otherwise
                 (trigger-concept-has-been-triggered-p
                  (rete-bomb-trigger-object bomb)
                  (rete-bomb-test-object-was-satisfied-p bomb)
                  oldPassCounter newPassCounter)))
              collect bomb)))
    ;; tricky: we first built a list of triggered bombs, because subsequent queries
    ;;    may step on the markers produced in "update-type-modified-rete-instance".
    ;; now we consider detonating individual bombs:
    (loop for bomb in triggeredBombs
	 do
	 (ecase (rete-bomb-type bomb)
	   (:local	; local concept bomb
	    (detonate-one-rete-bomb instance bomb))
	   (:remote	; remote concept bomb
            (if (neq (rete-test-object-is-satisfied-p
                      (rete-bomb-dependent-node bomb)
                      (rete-bomb-dependent-instance bomb))
                     (rete-bomb-test-object-was-satisfied-p bomb))
              (detonate-one-rete-bomb
               (rete-bomb-dependent-instance bomb) bomb)
              (remonitor-rete-test-object 
               (rete-bomb-dependent-node bomb)
               (rete-bomb-dependent-instance bomb))))
	   (:conflict
            (if (neq (rete-feature-is-satisfied-p
                      (rete-test-object (rete-bomb-dependent-node bomb))
                      (rete-bomb-dependent-instance bomb))
                     (rete-bomb-test-object-was-satisfied-p bomb))
              (detonate-one-rete-bomb
               (rete-bomb-dependent-instance bomb) bomb)
              ;; TO DO: THIS PROBABLY IS THE WRONG MONITORING CALL:
              (remonitor-rete-test-object
               (rete-bomb-dependent-node bomb) (rete-bomb-dependent-instance bomb)))))) ))

(defun detonate-rete-role-bombs (instance previousInstance)
  ;; Called by "update-rete-match-network";
  ;; Situation: "modifiedSlotEntries" contains pairs whose first entries
  ;;    name roles whose fillers have been modified at "instance";
  ;; Scan rete role bombs attached to "instance", and detonate any of
  ;;    them affected by the changes in filler sets;
  ;; Note: If a bomb is monitoring a test object whose satisfiability
  ;;    never flips, the bombs stays even if the node satisfaction
  ;;    that it is monitoring evaporates;
  ;; QUESTION: HOW TO WE GET RID OF BOMBS ON DISCARDED NODES???
  (let ((passCounter (decf *revise-subgraph-pass-counter*))
	(modifiedSlotEntries (dynamic-variables previousInstance))
	role triggeredBombs)
    ;; first, mark all roles and super roles whose fillers were modified
    ;;    during the last time quantum:
    (loop for slotEntry in modifiedSlotEntries
	  when (setq role (get-relation (car slotEntry) :no-error-p t))
	  do
	  (setf (already-revised-counter role) passCounter)
	  (when (rest (all-super-concepts role))
	    (loop for super in (all-super-concepts role)
		  do (setf (already-revised-counter super) passCounter))))
    (when (null modifiedSlotEntries)
      (return-from detonate-rete-role-bombs nil))
    ;; next, collect all bombs that have triggered (this must precede
    ;;    any bomb detonations to insure that markers don't get stepped on):
    (setq triggeredBombs
          (loop for bomb in (rete-role-bombs instance)
		when (eql (already-revised-counter 
			   (rete-bomb-trigger-object bomb)) ; trigger role
			  passCounter)
		collect bomb))
    ;; finally, detonate or remonitor the bombs that have triggered:
    (loop for bomb in triggeredBombs
          as node = (rete-bomb-dependent-node bomb)
          unless (discarded-rete-node-p node)
	  do
	  (let (dependentInstance)
	    (case (rete-bomb-type bomb)
	      (:transition		; (placed by monitor)
	       (recognize&act-on-transition instance node))
	      (otherwise		; local or remote role bomb:
               (setq dependentInstance
                     (case (rete-bomb-type bomb)
                       (:local instance)
                       (otherwise (rete-bomb-dependent-instance bomb))))
	       (if (neq (rete-test-object-is-satisfied-p node dependentInstance) 
                        (rete-bomb-test-object-was-satisfied-p bomb))
		   (detonate-one-rete-bomb dependentInstance bomb)
		   (remonitor-rete-test-object node dependentInstance)))))) ))

(defun detonate-one-rete-bomb (instance bomb)
  ;; Situation: The rete bomb "bomb" has detonated,
  ;;    indicating that "instance" may now have (or fail to have)
  ;;    full support at the node "(rete-bomb-dependent-node bomb)";
  ;; Act on the support, if it signals a change at that node;
  ;; If the node is an anchor, then the support derives (or fails to
  ;;    derive) from non-primitive antecedents;
  ;; If the node is a combinator, then the support (or lack of it) is
  ;;    for its test object;
  ;; Replant a bomb on "instance" unless the support (or lack of it)
  ;;    is old news;
  (let ((node (rete-bomb-dependent-node bomb))
	(wasSatisfiedP (rete-bomb-test-object-was-satisfied-p bomb))
        nowSatisfiedP)
    (if wasSatisfiedP
	(progn
	  ;; react unless the lack of indirect support is old news or is
	  ;;    superceded by :direct support:
	  (when (eq (get-rete-node-support instance node) :indirect)
	    (case (rete-kind-of-test node)
	      (:anchor
	       (integrity-check (has-defined-antecedents-p (rete-test-object node)))
	       (setq nowSatisfiedP
		     (monitor-non-totally-primitive-concept-p node instance)))
	      (otherwise
	       (setq nowSatisfiedP
		 (verify-retracted-test-object-support-p instance node))))
	    (when (not nowSatisfiedP)
	      (retract-rete-full-support instance node))))
	;; was not satisfied:
	(progn
	  ;; check to see if the support is old news:
	  (unless (get-rete-node-support instance node)
	    (case (rete-kind-of-test node)
	      (:anchor
	       (integrity-check (has-defined-antecedents-p (rete-test-object node)))
	       (setq nowSatisfiedP
		     (monitor-non-totally-primitive-concept-p node instance)))
	      (otherwise
	       (setq nowSatisfiedP
		 (verify-asserted-test-object-support-p instance node))))
	    (when nowSatisfiedP
	      (assert-rete-full-support instance node :indirect))))) ))

(defun verify-asserted-test-object-support-p (instance node)
  ;; Called by "detonate-one-rete-bomb";
  ;; Situation: A rete bomb has detonated, and "node" is a combinator
  ;;    node that has acquired support for its test concept or test
  ;;    feature, and there is no :direct support;
  ;; If necessary, reevaluate the test with monitoring enabled, so
  ;;    that new bombs can get planted;
  ;; Return t if "node" is now supported;
  ;; Note: Don't retry the test if prior support has been lost;
  (and (loop for prior in (rete-prior-input-nodes node)
            always (get-rete-node-support instance prior))
       (ecase (rete-kind-of-test node)
	 (:primitive
          (if (not (has-defined-antecedents-p (rete-test-object node)))
            ;; always returns t:
            (monitor-rete-primitive-concept-p node instance)
            (monitor-non-totally-primitive-concept-p node instance)))
	 (:feature
	  (monitor-rete-feature-p node instance))
	 (:disjunction
	  (monitor-rete-feature-p node instance :disjunction-p t)))) )

(defun verify-retracted-test-object-support-p (instance node)
  ;; Called by "detonate-one-rete-bomb";
  ;; Situation: A rete bomb has detonated, and "node" is a combinator
  ;;    node that has lost some support for its test concept or test
  ;;    feature, and there is no :direct support;  However, there is
  ;;    still prior support;
  ;; Re-evaluate support for the test object;
  ;; Return t if support still exists;
  (case (rete-kind-of-test node)
    (:primitive
     (if (has-defined-antecedents-p (rete-test-object node))
       (monitor-non-totally-primitive-concept-p node instance)
       ;; always returns nil:
       (monitor-rete-primitive-concept-p node instance)))
    (:feature
      (monitor-rete-feature-p node instance))
    (:disjunction
     (monitor-rete-feature-p node instance :disjunction-p t))) )


  ;;
;;;;;; Triggering production rules, and cascaded rete matching
  ;;

(defun act-on-rete-monitored-instance (instance node wasSatisfiedP)
  ;; Situation: The rete net has detected that "instance" newly matches
  ;;    or newly fails to match the concept recognized by "node";
  ;; Trigger any if-added/removed cohorts attached to the concept;
  ;; TO DO: VERIFY THAT WE DON'T NEED TO DETONATE BOMBS MONITORING
  ;;    SUPERS OF the recognized concept;
  (declare (special *displayReteChangesP*))
  (let ((concept (rete-recognized-concept node)))
    (cond
      ((null concept)
       ;; quick exit if there is no concept or monitor associated with "node":
       (return-from act-on-rete-monitored-instance nil))
      ((typep concept 'PRODUCTION-COHORT)
       ;; "node" recognizes a monitor's cohort:
       (when (case (transition-indicator concept)
	       (:detects (not wasSatisfiedP))
	       (otherwise wasSatisfiedP))
	 (distribute-binding-set-to-one-cohort instance concept))
       (return-from act-on-rete-monitored-instance nil)))
    (when *displayReteChangesP*
      (when (eq *displayReteChangesP* :needs-header)
	(reset-dot-counter)
	(inform "~%Rete match changes for state ~D in context ~A:~%"
                *agent-time* (name *context*))
	(setq *displayReteChangesP* t))
      (inform "~:[>   entry~;<    exit~]:  ~S~20,5T~S~%"
	      wasSatisfiedP instance concept))
    (if wasSatisfiedP
	;; "instance" has ceased to satisfy "concept":
	(when (rete-if-removed-cohorts node)
	  (distribute-binding-set-to-cohorts
	    instance (rete-if-removed-cohorts node)))
	;; "instance" newly satisfies "concept":
	(when (rete-if-added-cohorts node)
	  (distribute-binding-set-to-cohorts
	    instance (rete-if-added-cohorts node)))) ))


  ;;
;;;;;; Reset functions
  ;;

(defun clear-rete-network ()
  ;; Eliminate all matches stored in the network;
  #+:isi (inform "Clearing rete support at all levels!")
  (labels ((clear-node&subsequents (node)
	     (when (rete-instance/support-table node)
	       (clrhash (rete-instance/support-table node)))
	     (loop for sub in (rete-subsequent-output-nodes node)
		   do (clear-node&subsequents sub))))
    
    (execute-in-contexts-depth-first 
     (setq *list-of-modified-rete-instances* nil)
     (map-transitively
      (loom-constant Thing) sub-concepts
      (lambda (self)
	(let ((node (rete-node self)))
	  (when (and node (eq (rete-kind-of-test node) :anchor))
	    (clear-node&subsequents node))))
      :pruning-test
      (lambda (self) (not (subconcept-p self (loom-constant CONSTANT))))
      :use-pass-counter t)
     (loop for k in (list-contexts)
           do (loop for m in (list-context k :partitions :behaviors)
	            when (typep m 'MONITOR)
	            do (clear-node&subsequents (rete-node m))))) ))


;; TO DO:
#|

FIGURE OUT HOW WE SHOULD HANDLE BINARY PREDICATES
WITH CONSTANTS, E.G.,
   :when (and (A ?x) (R ?x 5))

HANDLE ANCHOR NODES WITH ANTECEDENTS

|#
