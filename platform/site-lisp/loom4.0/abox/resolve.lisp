;; -*- Mode: Lisp; Package: LOOM; Syntax: COMMON-LISP; Base: 10 -*-

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

;;; RESOLVE.LISP (ABOX)

;;; Procedures for computing resolvents within a context.

(in-package "LOOM")

(export '(resolve))

;;; THIS IS A VERY CRUDE INITIAL VERSION.
;;;    TO DO: AVOID SCANNING *ALL* CONCEPTS, JUST SCAN THOSE VISIBLE
;;;       IN THE CURRENT CONTEXT.
;;;    QUESTION: WHAT IS THE SCOPE OF INSTANCES THAT WE SHOULD CONSIDER?

;;; LOW PRIORITY TO DO: FIGURE OUT HOW WE MIGHT TRUTH-MAINTAIN INFERENCES BASED
;;;    ON RESOLUTION (E.G., BY RECORDING CONFLICT BOMBS?).

(defun resolve ()
  ;; Augment the knowledge base with facts obtained by resolving
  ;;    disjunctive propositions;
  ;; Currently, we only handle disjunctive types;
  (let ((disjunctionConcepts
         (loop for c in (list-concepts)
               when (and (eq (defined-as c) :disjunction)
                         (not (subconcept-p c (loom-constant META-THING))))
               collect c))
        resolvedSomethingP)
    (loop
      do
      (setq resolvedSomethingP nil)
      (loop for dc in disjunctionConcepts
            do
            (loop for i in (generate-instances dc)
                  when (resolve-concept&instance-p dc i)
                  do (setq resolvedSomethingP t)))
      while resolvedSomethingP) ))

(defun list-concepts (&key local-p all-p)
  ;; Return a list of all concepts visible from the current context;
  ;; "local-p" returns only concepts defined in the current context;
  ;; "all-p" returns all concepts;
  ;; BUG: RIGHT NOW "all-p" IS STUCK ON;
  (retrieve ?c (concept ?c)) )

(defun resolve-concept&instance-p (disjunctionConcept ?instance)
  ;; Helping function for "resolve";
  ;; "?instance" satisfies the disjunctive concept "disjunctionConcept";
  ;; Try to prove that only one of the disjuncts in "disjunctionConcept"
  ;;    is compatible with "?instance".  If we succeed, assert that
  ;;    "?instance" satisfies that disjunct;
  (let ((compatibleDisjuncts nil)
        ?resolventConcept)
    ;; return failure if "?instance" belongs to one of the disjuncts:
    (when (loop for ?dc in (disjuncts disjunctionConcept)
                thereis (ask (?dc ?instance)))
      (return-from resolve-concept&instance-p nil))
    (loop for tail on (disjuncts disjunctionConcept)
          as ?dc = (car tail)
          do
          ;; *assume* the "?instance" satisfies "?dc" and see what happens:
          (tellm (?dc ?instance))
          (when (not (ask (incoherent ?instance)))
            (when (and (null (rest tail))
                       (null compatibleDisjuncts))
              ;; we got lucky -- the last disjunct was the first and only
              ;;    compatible disjunct -- return success (before retracting
              ;;    the last assumption):
              (return-from resolve-concept&instance-p t))
            (push ?dc compatibleDisjuncts))
          (forgetm (?dc ?instance))
          ;; return failure if "?instance" is compatible with at least
          ;;    two of the disjuncts:
          (when (rest compatibleDisjuncts)
            (return-from resolve-concept&instance-p nil)))
    (setq ?resolventConcept (first compatibleDisjuncts))
    ;; return t if "?instance" is compatible with exactly one disjunct:
    (when ?resolventConcept
      (tellm (?resolventConcept ?instance))
      t) ))
