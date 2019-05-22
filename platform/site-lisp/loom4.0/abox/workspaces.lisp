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
 
;;; WORKSPACES.LISP (ABOX)

;;; Functions for manipulating workspaces

(in-package "LOOM")

(export '())



  ;;
;;;;;; Surrogates
  ;;

(defmethod CLOS::slot-missing 
           (class (object DB-INSTANCE) slotName operation &optional newValue)
  ;; Turn a missing slot accesses into dynamic slot accesses for reading
  ;;    and writing;
  (declare (ignore class))
  (if (eq operation 'setf)
      (set-dynamic-slot-value object slotName newValue)
      (dynamic-slot-value object slotName)) )

(defmethod CLOS::slot-missing
           (class (object SURROGATE-INSTANCE) slotName operation &optional newValue)
  ;; Turn a missing slot accesses into dynamic slot accesses for reading.
  ;; If there is no dynamic slot value, then retry up the real-instance link.
  ;; TO DO:  DECIDE WHAT TO DO FOR SETF.
  (declare (ignore class))
  (let (entry)
;    (trace-values "SI slot-missing" object slotName operation)
    (if (eq operation 'setf)
	(set-dynamic-slot-value object slotName newValue)	; ??
	(if (setq entry (assoc slotName (slot-value object 'dynamic-variables)))
	    (cdr entry)
	    (slot-value (real-instance object) slotName))) ))

(defmethod CLOS::slot-missing (class (object CACHING-SURROGATE)
				     slotName operation &optional newValue)
  ;; Turn a missing slot accesses into dynamic slot accesses for reading.
  ;; If there is no dynamic slot value, then retry up the real-instance link
  ;;    and cache the result.
  ;; TO DO:  DECIDE WHAT TO DO FOR SETF.
  (declare (ignore class))
  (let (entry)
    (if (eq operation 'setf)
	(set-dynamic-slot-value object slotName newValue)	; ??
	(if (setq entry (assoc slotName (slot-value object 'dynamic-variables)))
	    (cdr entry)
	    (prog1 (setq entry (slot-value (real-instance object) slotName))
		   (set-dynamic-slot-value object slotName entry)))) ))

(defmethod CLOS::slot-unbound (class (instance SURROGATE-INSTANCE) slotName)
  ;; Turn a missing slot access into a retry up the real-instance link.
  (declare (ignore class))
  (slot-value (real-instance instance) slotName))

(defmethod CLOS::slot-unbound (class (instance CACHING-SURROGATE) slotName)
  ;; Turn a missing slot access into a retry up the real-instance link and
  ;;    cache the value locally.
  (declare (ignore class))
  (setf (slot-value instance slotName)
	(slot-value (real-instance instance) slotName))) 


(let (#+:lispworks (ccl::*handle-warn-on-redefinition* t))
  (defmethod CLOS::no-applicable-method :around (genericFunction &rest arguments)
	     ;; Checks to see if the first argument is of type
	     ;; SURROGATE-INSTANCE, and if it is, calls the generic
	     ;; function on the next instance up the real-instance link.
	     ;; TO DO: MAYBE ADD CODE TO CACHE THE RESULTS FOR
	     ;; caching-surrogate INSTANCES?
	     (if (typep (first arguments) 'SURROGATE-INSTANCE)
		 (progn
		   (warn "No Applicable Method for ~A, Passing up real ~
                          instance link" genericFunction)
		   (apply genericFunction (real-instance (first arguments))
			                  (cdr arguments)))
		 (call-next-method)))
)


(defmethod db-slot-value ((self SURROGATE-INSTANCE) slotName)
  ;; Read slot accessor function for SURROGATE instances;
; (trace-values "SI db-slot-value" self slotName)
  (list-of (CLOS::slot-value self slotName)) )

(defmethod set-db-slot-value ((self SURROGATE-INSTANCE) slotName newValue)
  ;; Write slot accessor function for SURROGATE instances;
  ;; Called by "set-value" and "add-value";
; (trace-values "SI set-db-slot-value" self slotName newValue)
  (setf (CLOS::slot-value self slotName) newValue) )


  ;;
;;;;;; Islands
  ;;

;; TO DO: THE TEST TO SEE IF INSTANCE IS LOCAL TO THE ISLAND IS ATROCIOUS -- FIX
;;    IT:
;; THIS METHOD IS OBSOLETE:
(defmethod initialize-local-instances-index ((self ISLAND-CONTEXT) index concept)
  ;; Scan instances in concept, and "keep" only 
  ;;    those visible on the island;
  (within-context self            ; RMM 5/11/94
    (do-local-instances (i concept)
      (unless (workspace-has-instance-p self i)
        (remove-type i concept))))
  index )

;; CONSIDER MAKING THIS INHERIT "CACHING-SURROGATE":
(defclass ISLAND-INSTANCE (SURROGATE-INSTANCE)
  ((loom-concept :allocation :class :initform nil)
   (intrinsic-concept :initform nil :accessor intrinsic-concept)
   ))

;; KLUDGE -- FIGURE OUT WHERE TO MAKE THIS HAPPEN:
;;   TAR: This most likely needs to be done in the coda.  Otherwise THING
;;        doesn't exist.  Added to DEFINE-BUILT-IN-CONCEPTS, which is called
;;        by INITIALIZE-NETWORK.  1/29/93
;(setf (loom-concept (make-instance 'ISLAND-INSTANCE)) (loom-constant THING))

(defun workspace-has-instance-p (context instance)
  ;; Return t if "instance" is locally indexed into the workspace "context";
  ;; BUG: THIS IS WRONG FOR LOOM INSTANCES, BECAUSE THEY DON'T CURRENTLY
  ;;    HAVE THE SLOT "context".  HOWEVER, FOR ISLANDS, IT WORKS FINE, SINCE
  ;;    ALL MEMBERS OF THE ISLAND WILL BE SURROGATES;
  (and (CLOS::slot-exists-p instance 'context)
       (eq (context instance) context)) )

(defmethod initialize-clos-instance ((self ISLAND-INSTANCE) identifier context)
  ;; Link the island instance "self" to its real instance BEFORE "self" has
  ;;    been interned into "context";
  (setf (real-instance self) (get-instance identifier))
  (setf (context self) context)
  (call-next-method) )  

(defmethod db-slot-value ((self ISLAND-INSTANCE) slotName)
  ;; Return a list of those slot fillers that belong to the current context
  ;;    (island);
  ;; TO DO: REPLACE CALL TO "get-instance" BY CALL TO "get-most-lifted-instance";
  ;; TO DO: CONSIDER CACHING FILLERS (BOTH LOCAL AND NON-LOCAL) SO AS TO
  ;;    AVOID REPEATEDLY LIFTING INSTANCES;  CONSIDER PLACING THE LIFTING IN
  ;;    "SURROGATE-INSTANCE.db-slot-value";
  #+(or :MCL :ALLEGRO) (declare (ignore slotName))
  (let ((fillers (call-next-method))
        (result nil))
    (declare (special *offIslandAccesses*))
    (loop for f in fillers
          do
          ;; coerce to most-lifted version of "f":
          (setq f (get-instance (identifier f)))
          (if (workspace-has-instance-p *context* f)
            (push f result)
            (when (boundp '*offIslandAccesses*)
              (push f *offIslandAccesses*))))
    result ))

(defmacro island-retrieve (outputVariables query &key context)
  "Perform a retrieve that ignores instances outside of "context" or the
current context.  Return two values, the retrieved objects or tuples, and a
list of instances outside of the island context that were referenced during 
the query."
  `(let ((*offIslandAccesses* nil))
     (declare (special *offIslandAccesses*))
     (values (retrieve ,outputVariables ,query :context ,context)
             *offIslandAccesses*)) )

(defmacro island-ask (query &key context)
  "Perform an ask that ignores instances outside of "context" or the
current context.  Return two values, the answer, and a list of 
instances outside of the island context that were referenced during the
query."
  `(let ((*offIslandAccesses* nil))
     (declare (special *offIslandAccesses*))
     (values (ask ,query :context ,context)
             *offIslandAccesses*)) )



#|
;(loom::use-loom "CL-USER")
(initialize-network)
(creation-policy :lite-instance)
(clear-context 'CL-USER-THEORY)
(change-context 'CL-USER-THEORY)
(defconcept a)
(defrelation r)
(tellm (a Fred) (r Fred Joe) (R Fred Mary) (a Joe))

(defcontext ISLE :island (CL-USER-THEORY))
(clear-context 'ISLE)
(change-context 'ISLE)
(list-context)
(create 'Fred nil)
(create 'Mary nil)
(retrieve ?x (r Fred ?x))
(island-retrieve ?x (r Fred ?x))
(retrieve ?x (A ?x))
(island-retrieve ?x (A ?x))
;; BUG: :context IS NEEDED BOTH AT MACRO EXPAND TIME AND AT RUN TIME:
(retrieve ?x (A ?x) :context 'CL-USER::CL-USER-THEORY)
(retrieve ?x (A ?x) :context (find-context 'CL-USER-THEORY))


(list-context)
(get-context 'ISLE)

(tellm)
(tellm (A Mary))
(forgetm (A Mary))

(list-current-local-instances (fc a))
(clear-context)
(get-concept 'A)
(get-instance 'Fred)
(get-instance 'Joe)

(clear-context)
(defconcept a)
(defconcept b)
(defconcept c)
(defrelation r)
(defrelation s)

(tellm (:about i a b (r 1) (s 2) (s 3)))

(setq ?i (fi i)
      ?si1 (make-instance 'loom::surrogate-instance :real-instance ?i)
      ?si2 (make-instance 'loom::surrogate-instance :real-instance ?si1)
      ?ci (make-instance 'loom::caching-surrogate :real-instance ?si2))


(ask (S ?i 3))				; ==> T
(ask (S ?ci 3))				; ==> T (should be)

(defparameter foo (make-instance 'instance-in-context))
(time (loop for i from 1 to 5000 do
            (progn (get-instance 'foo) (get-instance 'bar))))
(time (loop for i from 1 to 10000 do (typep foo 'ISLAND-INSTANCE)))
(time (loop for i from 1 to 10000 do (CLOS::slot-exists-p foo 'context)))
(time (loop for i from 1 to 10000 do (CLOS::slot-exists-p foo 'identifier)))
(time (loop for i from 1 to 10000 do (identifier foo)))

|#

;;  Currently fails because of the change from DB-SLOT-VALUE to
;;  SLOT-VALUE, which then fails for Loom instances.

;; Test with CLOS-INSTANCE inheritance still to be done.
