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

;;; PROBE.LISP (ABOX)

(in-package "LOOM")

;;; Contains functions used to "probe" ABox objects;
;;; Also, a few TBox predicates appear here;
;;; The pattern matcher calls "probe" functions to get answers about
;;;    various database queries -- these answers are specific to the
;;;    needs of the pattern matcher, and do not provide general-purpose
;;;    access to the database.
;;; The specific top-level functions implement assert and retract
;;;    unary and binary predicates.


  ;;
;;;;;; ABox Interrogation Functions
  ;;

(defun collect-all-role-fillers (instance role &optional qualification)
  ;; Return the set of fillers of "role" and its "subOrSuper" roles
  ;;    in "instance", with duplicates removed;
  ;; TO DO: TRY TO PLACE THE "list-of" CALL INSIDE OF "form-n-ary-generator";
  ;; QUESTION: SHOULD THIS FUNCTION CALL "get-set-in-*world*"???;
  (let ((fillers (if (default-mode-p)                  ; RMM 3/9/93
                   (get-temporally-offset-set-of-instances
                    (run-time-call-role role instance t))
                   (execute-query
                    (run-time-call-role role instance t)))))
    (if qualification
      (loop for f in fillers
            when (has-instance-p qualification f)
            collect f)
      fillers) ))

(defun collect-all-role-fillers-with-duplicates (instance role)
  ;; Return the set of fillers of "role" and its "subOrSuper" roles
  ;;    in "instance", WITHOUT removing duplicates;
  ;; QUESTION: SHOULD THIS FUNCTION CALL "get-set-in-*world*"???
  (if (default-mode-p)                  ; RMM 3/9/93
      (get-temporally-offset-set-of-instances
       (run-time-call-role role instance nil))
      (execute-query
       (run-time-call-role role instance nil))))

;;; The following "guarded" versions of "collect-all-role-fillers" is designed
;;;    to avoid breaking when constants appear in the middle of
;;;    role chains (presumably a by-product of the merge of a skolem
;;    and a constant;

(defun guardedly-collect-role-filler (instance role)
  ;; Situation: "role" is single-valued (or equivalenced to something
  ;;    single-valued), and the intermediate fillers (if "role" is
  ;;    a composition) may not satisfy the intermediate type contraints;
  ;; Return the filler of "role" or its "subOrSuper" roles;
  ;; If a type clash occurs, or if more than one value is encountered,
  ;;    call "throw-if-incoherent";
  ;; Called by "apply-one-equivalence";
  ;; NOTE: Code assumes that the type of "instance" is compatible with
  ;;    the domain of "role"; IF THATS NOT THE CASE, ELIMINATE THE "notFirstComponent"
  ;;    TEST AND ADD A TEST FOR THE NON-COMPOSITION CASE;
  (if (eq (defined-as role) :composition)
      (let ((leftFiller instance) 
	    rightFillers notFirstComponentP)
	(loop for nextComponent in (components role)
	     do
	     (when (and notFirstComponentP
			(not-has-instance-p (implied-domain nextComponent) leftFiller))
	       ;; detect incoherence, if type clash is encountered in middle of chain
	       (post-incoherent-instance 
		instance
		(format nil "A type clash between ~A and the domain (~A) of relation ~A has been found.  Relation ~A occurs in the role chain ~A of ~A"
		    leftFiller (implied-domain NextComponent) nextComponent 
		    nextComponent (components role) role))
	       (return-from guardedly-collect-role-filler nil))
	     (setq rightFillers
		   (collect-all-role-fillers leftFiller nextComponent))
	     (when (null rightFillers)
	       (return-from guardedly-collect-role-filler nil))
	     (when (rest rightFillers)
	       (post-incoherent-instance 
		instance
		(format nil "The role chain ~A of ~A should be single-valued, but multiple values ~A were detected for relation ~A on ~A"
			(components role) role rightFillers nextComponent leftFiller))
	       (return-from guardedly-collect-role-filler nil))
	     (setq notFirstComponentP t)
	     (setq leftFiller (first rightFillers)))
	leftFiller)
      (let ((fillers (collect-all-role-fillers instance role)))
	(when (rest fillers)
	  (post-incoherent-instance 
	   instance
	   (format nil "Multiple values ~A were found for single-valued role ~A"
		   fillers role))
	  (return-from guardedly-collect-role-filler nil))
	(first fillers))) )

(defun guardedly-collect-all-role-fillers (instance role)
  ;; Situation: The intermediate fillers of a composed "role" may not
  ;;    satisfy the intermediate type contraints;
  ;; Return the filler of "role" and its "subOrSuper" roles;
  ;; If a type clash occurs, call "throw-if-incoherent";
  ;; Called by "apply-one-equivalence";
  (if (eq (defined-as role) :composition)
      (let ((leftFillers (list instance))
	    rightFillers notFirstComponentP errorMessage)
	(loop for nextComponent in (components role)
	     do
	     (when (and notFirstComponentP
			(loop for filler in leftFillers
			    when (not-has-instance-p (implied-domain nextComponent) filler)
			    do (setq errorMessage
				 (format nil "A type clash between ~A and the domain (~A) of relation ~A has been found.  Relation ~A occurs in the role chain ~A of ~A"
					 filler (implied-domain NextComponent) nextComponent 
					 nextComponent (components role) role))
			       (return t)))
	       ;; detect incoherence, if type clash is encountered in middle of chain
	       (post-incoherent-instance instance errorMessage)
	       (return-from guardedly-collect-all-role-fillers nil))
	     (loop for filler in leftFillers
		  do (prependf rightFillers
			       (collect-all-role-fillers filler nextComponent)))
	     (setq notFirstComponentP t)
	     (setq leftFillers rightFillers)
	     (setq rightFillers nil))
	leftFillers)
      ;; permit duplicates, since "apply-one-equivalence" will eliminate them:
      (collect-all-role-fillers-with-duplicates instance role)) )

(defmacro probe-instance-of-p (instance concept)
  ;; Probe (normally from the classifier) to test if "instance"
  ;;    satisfies "concept";
  ;; In normal classification mode, i.e., matching only against forward
  ;;    chaining concepts, "concept" is necessarily forward chaining also,
  ;;    and hence this is a quick test;
  `(has-instance-p ,concept (get-temporally-offset-instance ,instance)) ) ; TAR 8/31/93

;;;;;; Primary Classifier/ABox Connections

;;; The four predicates below are called by the classifier to aid its
;;;    type computations;  Each predicate returns two values:
;;;    t or nil, indicating success or failure of the predicate,
;;;    AND a list of instances reflecting the support, or lack of
;;;    support for the truth computation;

(defun probe-at-least-p (instance role integer qualification)
  ;; Return t if there are at least "integer" fillers of the role "role"
  ;;    of "instance";
  ;; If *collectedTriggerInstances* is bound and "qualification" is non-null,
  ;;    set *collectedTriggerInstances* to be a list of instances that 
  ;;    satisfied the qualification;
  ;; Note: Asserted features are tested inside of "MIN-RESTRICTION.feature-is-satisfied-p";
  (declare (special *collectedTriggerInstances* *testConcept*)
	   (fixnum integer))
  (integrity-check (null (more-restrictive-defined-range role))) 
  (if (null qualification)
      (if (= integer 1)
	  (collect-all-role-fillers-with-duplicates instance role)
	  (>= (length (collect-all-role-fillers instance role)) integer))
      ;; if "role" is qualified, we do a lot more work:
      (let* ((fillers (collect-all-role-fillers instance role))
	     (goodFillerCount 0) (nonClassifiedGoodFillerCount 0)
	     goodFillers badFillers 
	     nonClassifiedGoodFillers nonClassifiedBadFillers)
	(declare (fixnum goodFillercount nonClassifiedGoodFillerCount))
	(loop for i in fillers
	     do
	     (if (probe-instance-of-p i qualification)
		 (progn
		   (cond ((monotonic-p qualification) ; LITEBUG
			  (incf goodFillerCount))
			 ((classified-instance-p i)
			  (incf goodFillerCount)
			  (push i goodFillers))
			 (t (incf nonClassifiedGoodFillerCount)
			    (push i nonClassifiedGoodFillers)))
		   (when (= integer goodFillerCount)
		     ;; exit with success:
		     (when (boundp '*collectedTriggerInstances*)
		       (setq *collectedTriggerInstances* goodFillers))
		     (return-from probe-at-least-p t)))
;		 (when (individual-p i)
;		   (push i badFillers))
	       (cond ((perfect-p qualification) nil)
		     ((classified-instance-p i)
		      (push i badFillers))
		     (t (push i nonClassifiedBadFillers)))))
	(when (boundp '*testConcept*) ; LITEBUG
	  (cond ((>= (+ goodFillerCount nonClassifiedGoodFillerCount) integer)
		 (inform "~%Missed Inference:~%  ~
                     ~@[While testing for membership in concept ~A,~%  ~]~
                     ~A has at least ~D ~A filler~P~@[of type ~A~],~%  ~
             but Loom cannot monitor this condition because filler~P ~{~A~^, ~}~%  ~
              ~:[is not a classified instance~;are not classified instances~], ~
              so Loom must disregard the match.~%"
			 (and (boundp '*testConcept*) *testConcept*)
			 instance integer role integer qualification
			 (length nonClassifiedGoodFillers) nonClassifiedGoodFillers
			 (rest nonClassifiedGoodFillers))
		 (throw :mixed-instances nil))
		(nonClassifiedBadFillers ; LITEBUG
		 (inform "~%Possible Missed Inference:~%  ~
                     ~@[While testing for membership in concept ~A,~%  ~]~
                     ~A does not have at least ~D ~A filler~P~@[of type ~A~],~%  ~
              but Loom cannot monitor this condition because filler~P ~{~A~^, ~}~%  ~
              ~:[is not a classified instance~;are not classified instances~].~%"
			 (and (boundp '*testConcept*) *testConcept*)
			 instance integer role integer qualification
			 (length nonClassifiedBadFillers) nonClassifiedBadFillers
			 (rest nonClassifiedBadFillers)))))
	(when (boundp '*collectedTriggerInstances*)
	  (setq *collectedTriggerInstances* badFillers))
	(>= (+ goodFillerCount nonClassifiedGoodFillerCount) integer) )) ) ;; exit with result.

(defun probe-at-most-p (instance role integer qualification)
  ;; Return t if there are at most "integer" fillers of the role "role" of 
  ;;     "instance"
  ;; Strategy:  Return t if
  ;;    "role" is single-valued and "integer" >= 1, OR
  ;;    an upper-bound has been inferred <= "integer", OR
  ;;    "role" is closed and has <= integer fillers;
  ;; Assumption: If "role" and its inverse are not primitive, then assume that
  ;;    it is a persistent computed role.  Seal-one-relation marks such roles
  ;;    as closed iff their defining roles are closed;
  ;;    Hence, if "role" is closed, it suffices to count fillers AT AND BELOW
  ;;       "role", and if its open, we can safely assume that it really IS open.
  (or (and (role-is-single-valued-p role)
	     (plusp integer))
	(prove-at-most-k-p 
	  instance role integer
	  (collect-all-role-fillers instance role)
	  qualification)) )

(defun probe-all-p (instance role concept qualification)
  ;; Return t if all fillers of the role "role" of "instance" are
  ;;     instances of "concept";
  ;; Very obscure bug: IF "roleClosedByDefaultP" AND there are no fillers
  ;;    AND a default filler is inferred in a LATER cycle whose type
  ;;    conflicts with "concept", THEN we have an error; The computational
  ;;    overhead to catch this seems too high (unless users complain);
  (multiple-value-bind (closedSetP setOfFillers)
      (collect-subsuming-set-of-fillers-p instance role qualification)
    (and closedSetP
	 (or (null setOfFillers)
	     (probe-all-fillers-in-concept-p concept instance role setOfFillers))) )) ; LITEBUG

(defun collect-subsuming-set-of-fillers-p (instance role qualification)
  ;; Helping function for "probe-all-p";
  ;; Compute a set of fillers of the role "role" on "instance" that
  ;;    equals or includes the set of all fillers that satisfy
  ;;    "qualification";
  ;; Return two values:
  ;;   (1) Whether or not a closed set of fillers was found;
  ;;   (2) The closed set of fillers -- these must be tested against
  ;;       the value restriction;
  ;; Assumption: If "role" and its inverse are not primitive, then assume that
  ;;    it is a persistent computed role.  Seal-one-relation marks such roles
  ;;    as closed iff their defining roles are closed;
  ;;    Hence, if "role" is closed, it suffices to collect fillers AT AND BELOW
  ;;       "role", and if its open, we can safely assume that it really IS open.
  ;; Comment: Checks the restrictions of concepts in the type of "instance"
  ;;    for a maximum that equals the number of fillers of "role";
  (let ((subsumingSetOfFillers (collect-all-role-fillers instance role)))
    ;; Changed to return fillers even if not closed ; TAR 9/11/97
    (when qualification
      (setq subsumingSetOfFillers
	(loop for f in subsumingSetOfFillers
	    unless (not-has-instance-p qualification f)
	    collect f)))
    (if (or (and (role-is-single-valued-p role)
		 subsumingSetOfFillers)
	    (prove-at-most-k-p instance role (length subsumingSetOfFillers)
			       subsumingSetOfFillers qualification))
	(values t subsumingSetOfFillers)
        (values nil subsumingSetOfFillers)) ))
        
(defun prove-at-most-k-p (instance role integer fillers qualification)
  ;; Return t if there is a restriction on relation "role" attached to
  ;;    "instance" with upper bound <= "integer";
  ;; Called by "probe-at-most-p" and "collect-subsuming-set-of-fillers-p";
  ;; CAUTION: Assumes a test that "role" is single-valued has already
  ;;    been applied before calling "prove-at-most-k-p";
  ;; TO DO: SPEED THIS UP BY:
  ;;    (1) CONVERTING MAX 1's IN DOMAIN TO SINGLE-VALUED RELATIONS; AND
  ;;    (2) ADDING role-has-max-restriction SLOT TO RELATIONS;
  (let ((fillerCount (length fillers))
	lowerBound qualifiedLowerBound)
    (flet ((at-most-k-qualified-p ()
	     (let ((qualifiedFillerCount
		    (if (probe-closed-concept-p qualification)
			;; count all fillers that satisfy qualification:
			(loop for f in fillers
			    when (has-instance-p qualification f)
			    count f)
		      ;; count all fillers that can not be proven not to
		      ;;   satisfy the qualification:
		      (loop for f in fillers
			  unless (not-has-instance-p qualification f)
			  count f))))
	       (<= qualifiedFillerCount integer)))
	   (satisficing-max-restriction-p ()
	     (loop for res in (probe-accumulated-restrictions instance)
		 thereis (and (eq (feature-type res) :max-restriction)
			      (subconcept-p role (relation res)) ;; RMM 10/7/91 (WAS BACKWARDS!!!)
			      (or (null (qualification res))
				  (and qualification
				       (subconcept-p qualification (qualification res))))
			      (<= (upper-bound res) integer)))))
      (or (and (probe-closed-role-p role instance) ; role is closed?
	       (progn
		 (multiple-value-setq (lowerBound qualifiedLowerBound)
		   (compute-role-lower-bound instance role qualification))
		 (<= lowerBound fillerCount)) ; role really is closed? 
	       (or (<= fillerCount integer)
		   (and qualification
			(<= qualifiedLowerBound integer) 
			(at-most-k-qualified-p))))
	  (satisficing-max-restriction-p)) )))


(defun probe-closed-concept-p (self)
  ;; Return t iff the set of fillers of "self" is closed;
  ;; Note:  Roles can only be closed during default mode;
  (or (perfect-p self)			; TAR 7/16/97
      (and (default-mode-p)
	   (concept-is-closed-p self))) )

(defun probe-closed-role-p (self instance)
  ;; Return t iff the set of fillers of "self" is closed;
  ;; Note:  Roles can only be closed during default mode;
  (or (probe-closed-concept-p self)
      (and (member :closed-on-constants (attributes self))
	   (has-instance-p (loom-constant CONSTANT) instance))) )

(defun probe-accumulated-restrictions (self)
  ;; Return a list of restrictions that apply to the instance "self";
  ;; TO DO: CONSIDER CACHING THE RESULT IF RESIDUE FEATURES EXIST;
  (multiple-value-bind (type residueFeatures)
      (find-type&residue-features self)
    (when (consp type)				; catch incoherent instance
      (return-from probe-accumulated-restrictions nil))
    (let ((restrictions (implied-restrictions type)))
      (if residueFeatures
	  (bag-append residueFeatures restrictions)
	  restrictions) )))

(defun compute-role-lower-bound (instance role qualification)
  ;; Helping function for "probe-at-most-p" and "collect-subsuming-set-of-fillers-p";
  ;; Return the lower bound inferred for the role "role" on instance
  ;;    "instance";
  ;; If "qualification", return as a second value the qualified lower bound;
  (let ((lowerBound 0)
	(qualifiedLowerBound 0))
    (loop for res in (probe-accumulated-restrictions instance)
	 when (and (eq (feature-type res) :min-restriction)
		   (subconcept-p (relation res) role))
	 do
	 (when (> (lower-bound res) lowerBound)
	   (setq lowerBound (lower-bound res)))
	 (when (and qualification
		    (qualification res)
		    (subconcept-p (qualification res) qualification)
		    (> (lower-bound res) qualifiedLowerBound))
	   (setq qualifiedLowerBound (lower-bound res))))	       
    (values lowerBound qualifiedLowerBound) ))

#|
(defmethod probe-all-fillers-in-concept-p ((self UNARY-CONCEPT) instance role setOfFillers)
  ;; Helping method for "probe-all-p";
  ;; Return t if all members of "fillers" are instances of "self";
  ;; If *collectedTriggerInstances* is bound, then set it to
  ;;     IF t result THEN all fillers (or NIL if "self" is :monotonic)
  ;;     ELSEIF nil result THEN one filler whose type does not include concept
  ;;        (unless that filler is a constant);
  (declare (special *collectedTriggerInstances*))
  (let ((badFiller
	  (loop for filler in setOfFillers
	       when (not (probe-instance-of-p filler self))
               return filler))
	(triggerInstances nil))
    (prog1
      (cond
	(badFiller
	 (when (individual-p badFiller)
	   (setq triggerInstances (list badFiller)))
	 nil)					; miss, zero or one trigger instances
	((monotonic-p self)
	 t)					; hit, no trigger instances
	(t
	 (setq triggerInstances setOfFillers)	; hit, set of trigger instances
	 t))
      (when (boundp '*collectedTriggerInstances*)
	(setq *collectedTriggerInstances* triggerInstances))) ))
|#
  
(defmethod probe-all-fillers-in-concept-p ((self UNARY-CONCEPT) instance role setOfFillers) ;LITEBUG
  ;; Helping method for "probe-all-p";
  ;; Return t if all members of "fillers" are instances of "self";
  ;; If *collectedTriggerInstances* is bound, then set it to
  ;;     IF t result THEN all fillers (or NIL if "self" is :monotonic)
  ;;     ELSEIF nil result THEN one filler whose type does not include concept
  ;;        (unless that filler is a constant);
  (declare (special *collectedTriggerInstances* *testConcept*))
  (let (badFiller nonClassifiedFillers)
    (loop for filler in setOfFillers
	unless (classified-instance-p filler)
	do (push filler nonClassifiedFillers)
	when (not (probe-instance-of-p filler self))
	     do (setq badFiller filler) and return nil)
    (cond (badFiller
	   (cond ((perfect-p self) nil)
		 (;(boundp '*collectedTriggerInstances*)
		  (boundp '*testConcept*)
		  (unless (classified-instance-p badFiller)
		    (inform "~%Possible Missed Inference:~%  ~
                     ~@[While testing for membership in concept ~A,~%  ~]~
                     ~A does not have all ~A fillers of type ~A,~%  ~
              but Loom cannot monitor this condition because filler ~A~%  ~
              is not a classified instance.~%"
			(and (boundp '*testConcept*) *testConcept*)
			instance role self badFiller)
		    (throw :mixed-instances nil))
		  (when (boundp '*collectedTriggerInstances*)
		    (setq *collectedTriggerInstances* (list badFiller)))
		  nil)
		 (t (when (boundp '*collectedTriggerInstances*)
		      (setq *collectedTriggerInstances* (list badFiller)))
		    nil)))
	  ((monotonic-p self)
	   t)				; hit, no trigger instances
	  (t
	   (when (and (boundp '*testConcept*) nonClassifiedFillers)
	     ;(boundp '*collectedTriggerInstances*)
	     (inform "~%Missed Inference:~%  ~
                     ~@[While testing for membership in concept ~A,~%  ~]~
                     ~A has all ~A fillers of type ~A,~%  ~
             but Loom cannot monitor this condition because filler~P ~{~A~^, ~}~%  ~
              ~:[is not a classified instance~;are not classified instances~], ~
              so Loom must disregard the match.~%"
		     (and (boundp '*testConcept*) *testConcept*)
		     instance role self
		     (length nonClassifiedFillers) nonClassifiedFillers
		     (rest nonClassifiedFillers))
	     (throw :mixed-instances nil))
	   ;; hit, set of trigger instances
	   (when (boundp '*collectedTriggerInstances*)
	     (setq *collectedTriggerInstances* setOfFillers))
	   t)) ))

(defmethod probe-all-fillers-in-concept-p ((self SET-FEATURE) instance role setOfFillers)
  ;; Helping method for "probe-all-p";
  ;; Return t if all members of "fillers" are instances of "self";
  (declare (ignore instance role))
  (loop for filler in setOfFillers
	 always (has-instance-p self filler)) )

(defmethod probe-all-fillers-in-concept-p ((self INTERVAL-FEATURE) instance role setOfFillers)
  ;; Helping method for "probe-all-p";
  ;; Return t if all members of "fillers" are instances of "self";
  ;; Note: Logic borrowed from "INTERVAL-FEATURE.has-instance-p";
  ;; BUG: WE DON'T HANDLE REAL NUMBERS YET; - FIXED
  (declare (ignore instance role))
  (let ((intervals (members self))) 
    (loop for filler in setOfFillers
	 always
	 (and (numberp filler)                 ;  TAR 3/11/96 ; was integerp
	      (loop for segment in intervals
		   thereis
		   (subsegment-p filler segment)))) ))

(defmethod probe-all-fillers-in-concept-p ((self SYMBOLIC-INTERVAL) instance role setOfFillers)
  ;; Helping method for "probe-all-p";
  ;; Return t if all members of "fillers" are instances of "self";
  (declare (ignore instance role))
  (loop for filler in setOfFillers
       always (has-instance-p self filler)) )

(defun probe-filled-by-p (instance role fillers)
  ;; Return true if the set of fillers of the role "(role instance)"
  ;;    includes "fillers";
  ;; Note: Binds and discards *collectedTriggerInstances* to avoid spurious
  ;;       trigger bindings when collect-all-role-fillers makes calls.
  (let* ((*collectedTriggerInstances* nil)        ; TAR 7/10/97
	 (queryFillers (collect-all-role-fillers instance role)))
    (declare (special *collectedTriggerInstances*))
    (loop for i in fillers
	 always (member i queryFillers :test #'filler-equal)) ))

(defun probe-not-filled-by-p (instance role nonFillers qualification)
  ;; Return true if the set of fillers of the role "(relation instance)"
  ;;    includes "fillers";
  ;; Note: Binds and discards *collectedTriggerInstances* to avoid spurious
  ;;       trigger bindings when collect-subsuming-set-of-fillers-p makes calls.
  (let ((*collectedTriggerInstances* nil))        ; TAR 7/10/97
    (declare (special *collectedTriggerInstances*))
    (multiple-value-bind (closedSetP queryFillers)
	(collect-subsuming-set-of-fillers-p instance role qualification)
      (and closedSetP
	   (loop for i in nonFillers 
	       never (member i queryFillers :test #'filler-equal))) )))

;; THIS VERSION IS PERHAPS FASTER, BUT ASSUMES THAT THE QUALIFICATION MUST
;;    BE NIL:
;(defun probe-not-filled-by-p (instance relation nonFillers)
;  ;; Return true if the set of fillers of the role "(relation instance)"
;  ;;    includes "fillers";
;  (let ((queryFillers (collect-all-role-fillers instance relation)))
;    (or (and (role-is-single-valued-p role)
;	       fillers
;	       (not (filler-equal (first fillers) (first nonFillers))))
;	  (and
;	    (prove-at-most-k-p 
;	      instance relation (length queryFillers)
;	      queryFillers
;	      nil)
;	    (loop for i in nonFillers never (member i queryFillers :test #'filler-equal)))) ))


;; OBSOLETE???
;;;; Helping methods for "probe-filled-by-p":
;;;;    They return the symbolic form of "self" used by TBox role fillers:
;(defmethod identifier-of-instance (self)
;  self)
;(defmethod identifier-of-instance ((self BASIC-INSTANCE))
;  (identifier self) )

(defun probe-binary-tuple-p (instance relationship role1 role2)
  ;; Return true if "relationship" is satisfied by the fillers of roles
  ;;    "role1" and "role2" attached to "instance";
  (let (fillers1 fillers2 closedSetP)
    (multiple-value-setq (closedSetP fillers1)
      (apply-rolechain-role-to-instance role1 instance))
    (when closedSetP
      (multiple-value-setq (closedSetP fillers2)
	(apply-rolechain-role-to-instance role2 instance))
      (when closedSetP
	(unless (collection-concept-p (implied-domain relationship))
	  (when (null (setq fillers1 (first fillers1)))
	    (return-from probe-binary-tuple-p nil)))
	(unless (collection-concept-p (implied-range relationship))
	  (when (null (setq fillers2 (first fillers2)))
	    (return-from probe-binary-tuple-p nil)))
	(run-time-apply-role-predicate relationship fillers1 fillers2))) ))

(defun probe-n-ary-tuple-p (instance relationship roles)
  ;; Return true if "relationship" is satisfied by the fillers of roles
  ;;    in "roles" attached to "instance";
  (let ((rangeIndex (1- (length roles)))
	fillers  listOfFillerSets closedSetP)
    (setq  listOfFillerSets
      (loop for r in roles
	  as i from 0
	  do  (multiple-value-setq (closedSetP fillers)
		(apply-rolechain-role-to-instance r instance))
	      (when (not closedSetP)
		(return-from probe-n-ary-tuple-p nil))
	      (unless (collection-concept-p 
		       (if (= i rangeIndex)
			   (implied-range relationship)
			 (nth i (implied-domains relationship))))
		(when (null (setq fillers (first fillers)))
		  (return-from probe-n-ary-tuple-p nil)))
	  collect fillers))
    (run-time-apply-predicate relationship listOfFillerSets) ))

(defun probe-exists-p (instance relationship coreferences)
  ;; Return true is there exists an instance of the concept "relationship"
  ;;    that satisfies the coreferences in "coreferences";
  ;; Strategy: Cycle through the coreferences, using each as a generator
  ;;    of paraindividuals.  For each paraindividual, check to see if
  ;;    it satisfies ALL coreference constraints;
  ;; Optimization: If a coreference yields a closed set of
  ;;    paraindividuals, then cut off search if all of those individuals
  ;;    fail to pass the constraint check;
  (let ((previouslyScannedClosedGeneratorP nil)
	caseFillers selfFillers closedCaseFillersP closedSelfFillersP)
    (flet ((find-paraindividuals (generatorCoref)
	     (let ((paraIndividuals nil)
		   selfRole inverseCaseRole)
	       (setq inverseCaseRole
		 (inverse (second generatorCoref)))
	       (setq selfRole (third generatorCoref))
	       (when (null inverseCaseRole)
		 (return-from find-paraindividuals nil))
	       (loop for halfwayInstance in (collect-all-role-fillers 
					     instance selfRole)
		   do (loop for paraIndiv in (collect-all-role-fillers 
					      halfwayInstance inverseCaseRole)
			  do (pushnew paraIndiv paraIndividuals)))
	       (setq previouslyScannedClosedGeneratorP
		 (and paraIndividuals 
		      (member (first generatorCoref) '(:coref :within-coref))
		      (or (role-is-single-valued-p inverseCaseRole)
			  (probe-closed-concept-p inverseCaseRole))
		      (or (role-is-single-valued-p selfRole)
			  (probe-closed-concept-p selfRole))))
	       paraIndividuals)))	       
      (loop for generatorCoref in coreferences 
	  while (not previouslyScannedClosedGeneratorP)
	  do
	    (loop for paraIndividual in (find-paraindividuals generatorCoref)
		do
		  (when 
		      (and 
		       (has-instance-p relationship paraIndividual)
		       (loop for coref in coreferences
			   always
			     (progn
			       (multiple-value-setq (closedCaseFillersP caseFillers)
				 (collect-closed-set-of-fillers-p paraIndividual (second coref)))
			       (multiple-value-setq (closedSelfFillersP selfFillers)
				 (collect-closed-set-of-fillers-p instance (third coref)))
			       (case (first coref)
				 (:coref 
				  (and closedCaseFillersP closedSelfFillersP 
				       (set-equal-p caseFillers selfFillers
						    :test #'filler-equal)))
				 (:includes-coref 
				  (and closedSelfFillersP 
				       (subset-p selfFillers caseFillers)))
				 (:within-coref 
				  (and closedCaseFillersP 
				       (subset-p caseFillers selfFillers)))))))
		    (return-from probe-exists-p t)))) )))

;;; The remaining predicate only returns one value

(defun probe-exactly-p (instance role integer qualification)
  ;; Return true if there are exactly "integer" fillers of the
  ;;    role "role" of "instance";
  (and (probe-at-least-p instance role integer qualification)
       (probe-at-most-p instance role integer qualification)) )

;; OBSOLETE:
;(defun probe-local-role-fillers (instance role &key dont-coerce-p)
;  ;; Evaluate the slot in "instance" corresponding to "role";
;  ;; Return a list containing the members of this slot;
;  (declare (ignore dont-coerce-p))
;  ;; "list-of" ELIMINATED.  SAVE COMMENTED CODE FOR WHEN WORLDS CODE IS RESTORED:
;  ;  (if (and *world* (not dont-coerce-p))
;  ;      (let ((slotValue (get-slot-value (get-instance-in-*world* instance)
;  ;				      role)))
;  ;	(if (listp slotValue)
;  ;	    (get-set-in-*world* slotValue)
;  ;	    (list-of (get-instance-in-*world* slotValue))))
;  ;      (list-of (get-slot-value instance role))) 
;  (list-of (get-slot-value instance role)) )


  ;;
;;;;;; ABox Support Functions
  ;;

(defun specializing-restrictions (relation qualification restrictions resType)
  ;; Return the restrictions of type "resType" among "restrictions" that
  ;;    specialize "relation";
  (multiple-value-setq (relation qualification)
    (compute-local-relation&qualification relation qualification))
  (loop for res in restrictions
      when (and (eq (feature-type res) resType)
		(subconcept-p (relation res) relation)
		(or (null qualification)
		    (and (qualification res) ; TAR 11/9/98
			 (subconcept-p (qualification res) qualification))))
      collect res) )

(defun largest-asserted-min (relation qualification restrictions)
  ;; Return the largest minimum asserted in the restrictions 
  ;;    on "role" and its subroles;
  (loop for res 
      in (specializing-restrictions 
	  relation qualification restrictions :min-restriction)
      maximize (lower-bound res)) )

(defun smallest-asserted-max (role qualification restrictions)
  ;; Return the smallest maximum asserted in the restrictions
  ;;    on "role" and its superroles;
  (let ((max (when (relation-is-single-valued-p role) 1)))
    (multiple-value-setq (role qualification)
      (compute-local-relation&qualification role qualification))
    (loop for res in restrictions
	 when (and (eq (feature-type res) :max-restriction)
		   (subconcept-p role (relation res))
                   (or (null (qualification res))
                       (and qualification
                            (subconcept-p qualification (qualification res)))))
	 do
	 (setq max
	       (if max
		   (min max (upper-bound res))
		   (upper-bound res))))
    max ))

(defmethod apply-rolechain-role-to-instance ((role TBOX-RELATION) instance)
  ;; Helping method for "probe-xxxary-tuple-p" and
  ;; Return two values:
  ;;   (1) Whether or not a closed set of fillers was found;
  ;;   (2)  a list of the fillers of the role "role" attached
  ;;        to "instance";
  (collect-closed-set-of-fillers-p instance role) )

(defmethod apply-rolechain-role-to-instance (role instance)
  ;; Helping method for "probe-xxxary-tuple-p" ;
  ;; "role" is assumed to be a constant or the keyword :self;
  ;; Return two values, (1) t, indicating that a closed set of fillers
  ;;    was found, and (2) the constant or "instance";
  (values
    t
    (list (if (eq role :self) instance role))) )

(defun collect-closed-set-of-fillers-p (instance role)
  ;; Helping function for "apply-rolechain-role-to-instance";
  ;; Also used by the query formation routines;
  ;; Compute the complete set of fillers of the role "role" on "instance",
  ;;    but only if a complete/closed set is derivable;
  ;; Return two values:
  ;;   (1) Whether or not a closed set of fillers was found;
  ;;   (2) The closed set of fillers -- these must be tested against
  ;;       the value restriction;
  (let ((fillers (collect-all-role-fillers instance role)))
    (cond
      ((and (role-is-single-valued-p role)
	    fillers)
       (values t fillers))
      ((more-restrictive-defined-range role)
       (let ((range (more-restrictive-defined-range role))
	     (baseRelation (first (base-relations role)))
	     (qualifiedFillers fillers))       
	 (when (rest (base-relations role))
	   (error "LOOM BUG: MULTIPLE BASE RELATIONS ON RANGE-RESTRICTED RELATION"))
	 (setq fillers (collect-all-role-fillers instance baseRelation))
	 (if (prove-at-most-k-p instance role (length qualifiedFillers) fillers range)
	     (values t qualifiedFillers)
	     (values nil nil))))       
      ((prove-at-most-k-p instance role (length fillers) fillers nil)
       (values t fillers))
      (t
       (values nil nil))) ))



  ;;
;;;;;; Probes used during queries
  ;;

;;; These functions are called by the query code
;;;    (instead of by the classifier);  They can't rely on data structures
;;;    present during classification/matching to assist the computations;

(defun query-at-least-p (instance role integer qualification)
  ;; Return t if we can prove that the role "(role instance)" has
  ;;    at least "integer" fillers;
  ;; Note: "probe-at-least-p" doesn't need to call "probe-accumulated-restrictions"
  ;;    because the classifier already made the check;  In backward chaining,
  ;;    the check must be explicit;
  ;;TO DO: UPGRADE TO GENERATE RESTRICTIONS FROM MORE THAN JUST FC CONCEPTS???;
  (multiple-value-setq (role qualification)
      (compute-local-relation&qualification role qualification))
  (or (probe-at-least-p instance role integer qualification) 
      (loop for res in (probe-accumulated-restrictions instance)
	   thereis
	   (and (eq (feature-type res) :min-restriction)
		(subconcept-p (relation res) role)
		(or (null qualification)
		    (and (qualification res)
			 (subconcept-p (qualification res) qualification)))
		(>= (lower-bound res) integer)))) )

(defun query-at-most-p (instance role integer qualification)
  ;; Return t if we can prove that the role "(role instance)" has
  ;;    at most "integer" fillers;
  ;; TO DO: UPGRADE TO GENERATE RESTRICTIONS FROM MORE THAN JUST FC CONCEPTS???
  (probe-at-most-p instance role integer qualification) )

(defun query-prove-at-most-k-p (instance role integer fillers qualification)
  ;; Return t if we can prove that the role "(role instance)" has
  ;;    at most "integer" fillers;
  ;; TO DO: UPGRADE TO GENERATE RESTRICTIONS FROM MORE THAN JUST FC CONCEPTS???
  (prove-at-most-k-p instance role integer fillers qualification) )

(defun query-exactly-p (instance role integer qualification)
  ;; Return t if we can prove that the role "(role instance)" has
  ;;    exactly "integer" fillers;
  (and (query-at-least-p instance role integer qualification)
       (probe-at-most-p instance role integer qualification)) )

(defun query-all-p (instance role concept qualification)
  ;; Return t if we can prove that all fillers of "(role instance)"
  ;;    are instances of "concept";
  ;; Note: "probe-all-p" doesn't need to call "probe-accumulated-restrictions"
  ;;    because the classifier already made the check;  In backward chaining,
  ;;    the check must be explicit;
  (or (probe-all-p instance role concept qualification)
      (loop for res in (probe-accumulated-restrictions instance)
	     thereis
	     (and (eq (feature-type res) :value-restriction)
		  (subconcept-p role (relation res))
		  (or (null (qualification res))
		      (and qualification
			   (subconcept-p qualification (qualification res))))
		  (subconcept-p (value-restriction res) concept)))) )

(defun query-some-p (instance role concept)	  ; tar 6/8/93
  ;; Just call the definition of ":some";
  (query-at-least-p instance role 1 concept))

;; This doesn't seem to be needed:
;(defun query-some-p (instance role concept qualification)
;  ;; Return two values:
;  ;; (1) IF at least one filler of the role "role" of "instance" is an 
;  ;;     instance of "concept" THEN t ELSE nil;
;  ;; (2) IF t result THEN one of the accepted fillers;
;  ;;     ELSEIF nil result THEN all of the rejected fillers;
;  ;; BUGS: Assume that role RR specializes R, 
;  ;;    and that i(R.C) is the set of fillers of R which are of type C,
;  ;;    and that i(RR.C) are the fillers of RR which are of type C,
;  ;;    and that i(RR) are the fillers of RR which are not of type C;
;  ;;    (1) IF t result, instances moving from i(RR.C) to i(RR) will not be detected,
;  ;;    (2) IF nil result, instances moving from i(R.C) to i(RR.C) will not be detected;
;  ;;    These bugs will go away when VRDIFFS are eliminated in favor of implication;
;  ;; SOMEDAY: WE WILL BE ABLE TO ASSUME
;  ;;    (1) THAT "role" IS EFFECTIVELY PRIMITIVE (modulo multiple base relations) SO THAT
;  ;;    (2) WE CAN ELIMINATE THE rangeRestriction TEST;
;  (when (cdr (base-relations role))		; PUT THIS INTO THE TBOX!!!
;      (warn "Multiple base relations on ~S may cause incorrect result" role))
;  (let* ((allFillers (all-role-values instance 
;				      (or (car (base-relations role)) role)
;				      :dont-remove-duplicates-p t
;				      :role-is-object-p t))
;	 (acceptedFiller (loop for f in allFillers
;			      thereis
;			      (if qualification
;				  (and (has-instance-p concept f)
;				       (has-instance-p qualification f))
;				  (has-instance-p concept f)))))
;    (if acceptedFiller 
;	(values t acceptedFiller)
;	(values nil allFillers)) ))

(defun query-the-p (instance role concept qualification)
  ;; Return two values:
  ;; (1) IF exactly one filler of the role "role" of "instance" is an 
  ;;     instance of "concept" THEN t ELSE nil;
  ;; (2) IF t result THEN the accepted filler;
  ;;     ELSEIF nil result and a filler was rejected because it was
  ;;        not an instance of "concept" THEN the rejected filler;
  ;;     ELSE nil;
  (multiple-value-setq (role qualification)
    (compute-local-relation&qualification role qualification))
  (if (probe-at-most-p instance role 1 qualification)
      (let ((fillers (all-role-values instance role
				      :dont-remove-duplicates-p t
				      :role-is-object-p t)))
	(if qualification
	    (loop for f in fillers
		when (and (has-instance-p qualification f)
			  (has-instance-p concept f))
		do (return-from query-the-p (values t f)))
	  (loop for f in fillers
		when (has-instance-p concept f)
	      do (return-from query-the-p (values t f))))
	(values nil nil))
    (values nil nil)) )


;; TO DO:

#|

REWRITE "probe-some-p" and "probe-the-p" after Horn logic works;


SPEED UP prove-at-most-k-p BY:
   (1) CONVERTING MAX 1's IN DOMAIN TO SINGLE-VALUED RELATIONS; AND
   (2) ADDING role-has-max-restriction SLOT TO RELATIONS;

|#
