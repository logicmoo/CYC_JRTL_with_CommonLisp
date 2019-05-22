;;-*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

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

;;; PROPOSITIONS.LISP (TBOX)

(in-package "LOOM")

(export '())


  ;;
;;;;;; "create-proposition"
  ;;    

(defun create-proposition (name &key wff operator arguments truth-value)
  ;; Create a proposition and fill in its slots;
  ;; Assert the truth value "truth-value" and propagate any side-effects
  ;;    of this assertion;
  (let ((proposition (create name 'Proposition :creation-policy :clos-instance)))
    (setf (wff proposition) wff)
    (setf (proposition-operator proposition) operator)
    (setf (proposition-arguments proposition) arguments)
    (when truth-value
      (finalize-definitions)		; Needs to happen before truth value assertion.
      (assert-truth-value proposition truth-value))
    proposition ))


  ;;
;;;;;; "assert-truth-value"
  ;;

(defun assert-truth-value (proposition truthValue)
  ;; Assert that "proposition" has truth value "truthValue";
  ;; Propagate any side-effects that accompany this assertion;
  (let ((oldTruthValue (proposition-truth-value proposition)))
    (when (eq truthValue oldTruthValue)
      (return-from assert-truth-value proposition))
    (when oldTruthValue
      (retract-truth-value proposition truthValue))
    (setf (proposition-truth-value proposition) truthValue)
    (case (proposition-operator proposition)
      (IMPLIES (assert-implies-proposition proposition))
;      (OR (assert-or-proposition proposition))
;      (NOT (assert-not-proposition proposition))
;     (AND (assert-and-proposition proposition))
;     (otherwise (assert-literal-proposition proposition))
      )
    proposition ))

(defun assert-implies-proposition (proposition)
  ;; Install an implication rule into the concept or relation hierarchy;
  (let ((antecedent (first (proposition-arguments proposition)))
        (consequent (second (proposition-arguments proposition))))
    (cond
     ((or (concept-p antecedent)
          (concept-p consequent))
      (define-concept
        :is (if (concept-p antecedent) antecedent `(and ,antecedent))
        :implies consequent
        :characteristics :system-defined))
     ((relation-p consequent)
      (define-relation
        :is consequent
        :antecedents antecedent
        :characteristics :system-defined))
     (t
      (define-relation
        :is antecedent
        :implies consequent
        :characteristics :system-defined))) ))


  ;;
;;;;;; "retract-truth-value"
  ;;

(defun retract-truth-value (proposition truthValue)
  ;; Assert that "proposition" has truth value "truthValue";
  ;; Propagate any side-effects that accompany this assertion;
  (let ((oldTruthValue (proposition-truth-value proposition)))
    (when (eq truthValue oldTruthValue)
      (return-from retract-truth-value proposition))
;    (case (proposition-operator proposition)
;      (IMPLIES (retract-implies-proposition proposition))
;      (OR (retract-or-proposition proposition))
;      (NOT (retract-not-proposition proposition))
;     (AND (retract-and-proposition proposition))
;     (otherwise (retract-literal-proposition proposition))
;      )
    proposition ))
