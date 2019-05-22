;;; -*- Mode: LISP; Syntax: Common-lisp; Package: KBCLASSES; Base: 10. -*-

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
 
				    
;;; BRAIDEFS.LISP (KBCLASSES)

;;; This file contains the class definitions which define the kernel
;;;    for the KB-CLASSES system.


(in-package "KBCLASSES")

;(export '())


;;; This code defines the two classes that constitute the meta
;;;    objects for the KB-CLASSES system.


  ;;
;;;;;; KB-CLASS
  ;;

(def-class KB-CLASS ()
  ( name
   definition
   super-classes
   sub-classes
   precedence-list-cache
   local-slots
   slots
   is-defined-p
   is-finalized-p))

(defmethod CLOS-class ((self KB-CLASS))
  ;; Defines the slot-accessor "CLOS-class"
  (CLOS::find-class (name self)) )

;(defun instance-slot-names-of-class (kbClass)
;  ;; Return a list of instance-slot names
;  (let ((closClass (CLOS-class kbClass)))
;    (get-slot-names closClass) ))

;(defun instance-slots-of-class (kbClass)
;  ;; Return a list of instance slots
;  (loop for slotName in (instance-slot-names-of-class kbClass)
;       collect (find-slot kbClass slotName)) )

(defmethod print-object ((self KB-CLASS) stream)
  (format stream "#<KB-CLASS: ~S>" (name self)) )

(defmethod is-finalized-p (nonConcept)
  (error "The object ~S is not of type KB-CLASS" nonConcept) )

(defmethod (setf precedence-list) (newValue (self KB-CLASS))
  ;; Defines the slot-accessor "precedence-list"
  (setf (CLOS::slot-value self 'precedence-list-cache) newValue) )

(defmethod precedence-list ((self KB-CLASS))
  ;; Defines the slot-accessor "precedence-list"
  (or (CLOS::slot-value self 'precedence-list-cache)
      (setf (precedence-list self)
	    (compute-precedence-list self))) )

(defun compute-precedence-list (class)
  ;; Compute a breadth-first left-to-right list of "class" and its
  ;;    super-classes;  Assumes that the superClass class precedence
  ;;    lists have already been computed.
  (let ((classList (append (list class) (copy-list (super-classes class))))) 
    (loop for superClass in (super-classes class) do
	 (setq classList (right-union classList (precedence-list superClass))))
    classList ))

(defun right-union (list1 list2)
  ;; Return the union of "list1" and "list2", with left-most duplicates
  ;;    removed.  The operation destroys "list1", but leaves "list2" intact.
  (let ((result (copy-list list2)))
    (loop for item in (nreverse list1) when (not (member item list2)) do
	 (push item result))
    result ))


  ;;
;;;;;; KB-SLOT
  ;;

(def-class KB-SLOT ()
  ( name
   domain
   range
   initform
   allocation
   accessors
   collection-p
   inverse-slot
   one-way-inverse
   aliases
   aliasing-slots
   do-not-reinitialize
   invisible-p
   context-sensitive-p))

(defmethod print-object ((self KB-SLOT) stream)
  (format stream "~S.~S" (name (domain self)) (name self)) )

