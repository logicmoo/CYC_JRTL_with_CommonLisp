;;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1999, 2003 University of Southern California                 ;
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


;;; VIEWS.LISP (ABOX)

;;; Contains code for the view mechanism.

(in-package "LOOM")

(export '( get-views create-view
	  ))


;;; WE NEED THIS ONLY IF WE NEED TYPE DISPATCHING
;;;    TO DETECT VIEWS
(defclass LOOM-VIEW-INSTANCE (DB-INSTANCE)
   ((view-concept :range UNARY-CONCEPT)
    view-table
    (parent-view :range INSTANCE-WITH-VIEWS)
    ))

(defclass INSTANCE-WITH-VIEWS ()
   ((view-concept :range UNARY-CONCEPT)
    view-table					; assoc list
    (parent-view :range INSTANCE-WITH-VIEWS)
    ))



;; WAIT AND SEE WHO CALLS THIS; THEN REWRITE:

(defmethod get-views ((self DB-INSTANCE) viewConcept)
  "Return the list of view instances of `self' for the view
   concept `viewConcept'."
  (cdr (assoc viewConcept (view-table self))) )

(defmethod get-views ((self INSTANCE-WITH-VIEWS) viewConcept)
  ;; Return the list of view instances of "self" that match the view
  ;;    concept "viewConcept";
  (cdr (assoc viewConcept (view-table self))) )

(defmethod get-views ((self CLOS-INSTANCE) viewConcept)
  ;; Generate an error, since "self" cannot have views;
  (error "Cannot ask for views on the CLOS instance ~S because it does not
          inherit the mixin class INSTANCE-WITH-VIEWS" self))

(defun view-concept-p (concept)
  ;; Return t iff "concept" is a view of another concept;
  (view-of concept) )


  ;;
;;;;;; create-view
  ;;

(defun create-view-instance (self viewConcept)
  "Create and return a new view of the instance `self' for the view concept
   `viewConcept'."
  ;; Find the root view for "self";
  ;; If the root view does not yet have a view table, create one for it;
  ;; Create a new view instance;
  ;; If there exist view concepts above `viewConcept' in the hierarchy
  ;;    then create intermediate view instances;
  ;; Create "parent-view" links and new view table entries;
  (when (not (view-concept-p viewConcept))
    (warning "Cannot define a view for the concept ~S because ~S is not
                declared to be a view of any other concept"
	     viewConcept viewConcept)
    (return nil))
  (validate-viewable-instance self)
  (let* ((viewTable (view-table self))
	 rootInstance rootConcept)
    (flet ((create-chain-of-view-instances
	     (childViewConcept)
	     (if (eq childViewConcept rootConcept)
		 rootInstance 
		 (let* ((parentViewInstance
			  (create-chain-of-view-instances (view-of childViewConcept)))
			(childViewInstance (make-view-instance self)))
		   (setf (view-table childViewInstance) viewTable)
		   ;; add view table entry, but don't disturb the first entry:
		   (push (cons childViewConcept childViewInstance)
			 (rest viewTable))
		   (setf (parent-view childViewInstance) parentViewInstance)
		   childViewInstance))))
      (setq rootInstance
	(if viewTable
	    (second (first viewTable))
	  ;; else "self" is a root instance without a view table:
	  (progn
	    (push (cons *Thing* self) (view-table self))
	    self)))
      ;; compute the root concept:
      (loop
	(setq rootConcept (view-of viewConcept))
	(when (not (view-concept-p rootConcept))
	  (return nil)))
      (assert-conjunct rootInstance rootConcept :domain/range)
      (create-chain-of-view-instances viewConcept) )))

(defmethod make-view-instance ((self DB-INSTANCE))
  ;; Return a view instance appropriate to the type of "self";
  (make-instance 'DB-INSTANCE) )

(defmethod make-view-instance ((self CLOS-INSTANCE))
  ;; Return a view instance appropriate to the type of "self";
  (make-object (CLOS::class-of self)) )



(defmethod validate-viewable-instance ((self DB-INSTANCE))
  ;;
  t )

(defmethod validate-viewable-instance ((self INSTANCE-WITH-VIEWS))
  ;;
  t )

(defmethod validate-viewable-instance (self)
  ;;
  (error "System expects ~S to be an instance that can have
          attached views." self) )

(defmethod validate-viewable-instance ((self CLOS-INSTANCE))
  ;;
  (error "System expects ~S to be an instance that can have
          attached views, but it does not inherit the mixin
          class INSTANCE-WITH-VIEWS" self self) )


  ;;
;;;;;; View functions for evaluating domain arguments to predicates
  ;;


#|
The retrieval code distinguishes between relations that are attached
view concepts and those that aren't.  For the former, explicit coersion
code is generated, via a call to "get-relative-views".  That code
coerces whatever argument it is given into an appropriate (set of)
view instances.  For the latter, the dispatching for "db-slot-value'
is sensitive to the case when a non-view relation is applied to a
view instance.
|#

;;; WE MAY OR MAY NOT WITH TO DO THIS:
(defmethod db-slot-value ((self INSTANCE-WITH-VIEWS) extendedSlotName)
  ;;
  (if (null (parent-view self))
      (CLOS::call-next-method)
      (CLOS::call-next-method
	(second (first (view-table self)))
	extendedSlotName)) )

(defmethod get-relative-views (self targetConcept)
  ;; Return view instances related to `self' that match `targetConcept'.
  ;;    First consider instances above or below `self' in the view instance;
  ;;    Next, check for sibling instances if `targetConcept' is not
  ;;       above or below the view concept for `self';
  ;; `targetConcept' must be a view concept;
  (flet ((proper-descendant-p
	   (view)
	   (loop
	     (setq view (parent-view view))
	     (cond
	       ((null view) (return nil))
	       ((eq view self) (return t))))))	   
    (let ((selfConcept (view-concept self)))
      (cond
	((eq selfConcept targetConcept)
	 (list self))
	((subconcept-p selfConcept targetConcept)
	 ;; run up the parent links from "self" looking for a view
	 ;;    instance that matches "viewConcept" (it is
	 ;;    guaranteed that one exists):
	 (loop
	   (setq self (parent-view self))
	   (when (eq (view-concept self) targetConcept)
	     ;; exit loop:
	     (return (list self)))
	   ;; continue loop:
	   ))
	((subconcept-p targetConcept selfConcept)
	 (for v in (cdr (assoc targetConcept (view-table self)))
	      when (proper-descendant-p v)
	      collect v))
	(t
	 (cdr (assoc targetConcept (view-table self))))) )))



