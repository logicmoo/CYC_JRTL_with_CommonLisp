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

;;; DISJOINTNESS.LISP (TBOX)

(in-package "LOOM")

;;; This file contains procedures which operate on coverings and
;;;    disjoint-coverings

  ;;
;;;;;; Creating and destroying coverings
  ;;

(defun form-name-of-covering (self)
  ;; Helping function for "define-covering" and "define-disjoint-covering";
  ;; Generate a new covering name for "self" with a suffix numbered
  ;;    one higher than the names of covers already possessed by "self";
  ;; If the name of "self" is FOO, then the covering name has the form
  ;;    "FOO-k"
  (let ((count (1+ (length (disjoint-coverings self))))
	(name (name self)))
    (symbol-append (name "-" (format nil "~S" count)) 
		   (symbol-package name)) ))

(defun compute-concept-from-cover-name (coverName referrer)
  ;; Return the concept identified by "coverName"
  (let ((conceptName (remove-suffix coverName)))
    (case (concept-or-relation referrer)
      (:relation
	(eval-relation-id conceptName))
      (otherwise
	(eval-concept-id conceptName))) ))



  ;;
;;;;;; Disjoint-covering
  ;;

(defun define-disjoint-covering (coveredConcept coverComponents)
  ;; Define a disjoint-covering stating that the concepts in "coverComponents"
  ;;    form an exhaustive partition of the concept "coveredConcept";
  ;; Use the same data structures as partitions;
  (let ((partitionName (form-partition-name coveredConcept)))
    (define-partition
      coveredConcept partitionName coverComponents :exhaustive-p t) ))

(defun undefine-disjoint-covering (coveredConcept coverName)
  ;; Remove the disjoint-covering "coverName" owned by "coveredConcept"
  ;;    from the slot "(disjoint-coverings coveredConcept)", and
  ;;    also remove a record of membership in the covering with each
  ;;    component concept;
  ;; TO DO: FIX "delf" FOR ASSOCIATION LISTS;
  (let ((membership (assoc coverName (disjoint-coverings coveredConcept))))
    (loop for component in (cdr membership)
	 do
	 (delete-disjoint-covering-link coverName coveredConcept component))
;    (delf (disjoint-coverings coveredConcept) coverName)
    (setf (disjoint-coverings coveredConcept)
	  (delete membership (disjoint-coverings coveredConcept) :test #'eq)) ))

(defun add-disjoint-covering-link (coverName coveredConcept component)
  ;; Add the component "component" to the disjoint covering with name
  ;;    "coverName" at the concept "coveredConcept" (when necessary,
  ;;    create the new covering list);
  ;; Also, create a disjoint-covering-membership for the
  ;;    covering "coverName" at the concept "component", and establish a
  ;;    dependency on "coveredConcept";
#L:trace-cover (trace-values "add-disjoint-covering-link:" coverName component)
  (let ((matchingMembership
	  (assoc coverName (disjoint-coverings coveredConcept))))
    (cond
      (matchingMembership
       (setf (cdr matchingMembership)
	     (pushnew component (cdr matchingMembership))))
      (t
       (addf (disjoint-coverings coveredConcept)
	     (list coverName component))))
    (add-disjoint-covering-membership-component
      component coverName component) ))

(defun add-disjoint-covering-membership-component (self coverName component)
  ;; If "self" has no local membership with the same cover-name as
  ;;    "coverName", add "(list coverName component)" to
  ;;    "self"s list of disjoint covering memberships;
  ;; Otherwise, add "component" to the matching local membership 
  (let ((matchingLocalMembership
	  (assoc coverName (disjoint-covering-memberships self))))
    (cond
      (matchingLocalMembership
       (setf (cdr matchingLocalMembership)
	     (pushnew component (cdr matchingLocalMembership))))
      (t
       (addf (disjoint-covering-memberships self)
	     (list coverName component)))) ))

(defun delete-disjoint-covering-link (coverName coveredConcept component)
  ;; Remove a disjoint-covering component from the covering "coverName"
  ;;    belonging to "coveredConcept", remove "component" from the
  ;;    disjoint-covering membership at "component", and eliminate
  ;;    the dependency of "component" on "coveredConcept";
  (let ((membership (assoc coverName (disjoint-coverings coveredConcept))))
    (setf (cdr membership)
	  (delete component (cdr membership)))
    (when (null (cdr membership))
	(delf (disjoint-coverings coveredConcept) coverName))
    (delete-disjoint-covering-membership-component
      component coverName component) ))

(defun delete-disjoint-covering-membership-component (self coverName component)
  ;; Remove "component" from the disjoint-covering membership named
  ;;    "coverName" at "self";
  ;; If its the last component, remove the membership;
  (let ((membership (assoc coverName
			   (disjoint-covering-memberships self))))
    (when membership
      (setf (cdr membership)
	    (delete component (cdr membership)))
      (when (null (cdr membership))
	(delf (disjoint-covering-memberships self) coverName))) ))

(defun delete-inherited-covering-membership-components (self)
  ;; Remove all components from disjoint-covering-memberships
  ;;    belonging to "self" except components equal to "self"
  (loop for tail on (disjoint-covering-memberships self)
       do
       (let ((covering (car tail)))
	 (cond
	   ((member self (cdr covering))
	    (setf (cdr covering) (list self)))
	   (t
	    (setf (car tail) nil)))))
  (setf (disjoint-covering-memberships self)
	(delete nil (disjoint-covering-memberships self))) )

  ;;
;;;;;; Completion of coverings
  ;;


;; Not called from anywhere.
(defun install-disjoint-covering-memberships (self)
  ;; Verify that the covering-memberships directly defined for "self"
  ;;    have owners which subsume self;
  ;; Inherit covering-memberships from the parents of "self";
  ;; Detect if "self" is incoherent, and if so, propagate the incoherence
  ;;    to the dependents of "self";
  (loop for membership in (disjoint-covering-memberships self)
       do
       (let ((coveredConcept
	       (compute-concept-from-cover-name 
		 (car membership) self)))
	 (unless (and (neq self coveredConcept)
		      (subconcept-p self coveredConcept))
	   (warn "Concept ~S belonging to the disjoint-covering ~S does not~%~
                   specialize the covered concept ~S~%"
		 self (car membership) coveredConcept))))
  ;; inherit disjoint-covering-memberships:
  (loop for super in (super-concepts self)
       do
       (loop for inheritedMembership in (disjoint-covering-memberships super)
	    do 
	    (loop for component in (cdr inheritedMembership)
		 do (add-disjoint-covering-membership-component
		      self (car inheritedMembership) component))))
  ;; detect incoherence:
  (let ((badMembership
	  (loop for membership in (disjoint-covering-memberships self)
	       when (cddr membership)
               return membership)))
    (when (and badMembership
	       (not (incoherent-p self)))
      (warn-of-incoherent-concept self badMembership)
      (mark-as-incoherent self))) )


#|
 
(initialize-network)
(defconcept a :p
  (:axioms (:disjoint-covering b c) (:disjoint-covering b g)))

(defconcept b (:s a) :p)
(defconcept c (:s a) :p)
(defconcept d (:s b c))
(defconcept e (:res r (:vr d)))
(incoherent-p (fc e))

(defconcept f :p
  (:axioms (:res r (:vr d))))
(incoherent-p (fc f))

|#


#|

IDEAS FOR DISJOINTNESS SYNTAX:

(defprimc Animal)
(define-disjoint-primitive-c Dog (Animal-Species) Animal)

(defconcept Animal
  :partition (Male-Animal Female-Animal)
  :disjointness-index Animal-Species)
(defconcept Horse
  :is-primitive (:and Animal (:disjoint-member Animal-Species)))
		      
|#
