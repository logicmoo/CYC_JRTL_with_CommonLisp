;;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1995, 1999, 2003 University of Southern California           ;
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

;;; NEW-REIFY.LISP (TBOX)

;;; This file contains code for the :reifies option and links
;;; This is a different reification method than that used for defreified-relation


(in-package "LOOM")

(defun store-link (relation source sink link)
  (declare (ignore relation))
  (fadd-value source 'link-object link)
  (when (or (typep sink 'loom::BASIC-INSTANCE)
	    (typep sink 'loom::INSTANCE-WITH-DYNAMIC-SLOTS))  ; CLOS-INSTANCE?
    (fadd-value sink 'link-object link)) )

;;

(defun filter-new-reified-expression (expr inverseP)
  ;; Returns the appropriate definition items for a new-style reified relation;
  (flet ((find-reification-relation (concept)
           (if (eq concept :primitive)
             nil
             (let ((reifiesClause (getf (rest (first (source-definitions concept)))
                                       :reifies))
                   inverseClause)
               (if inverseP
                 (progn 
                   (setq inverseClause (and (consp reifiesClause)
                                            (getf (rest reifiesClause) :inverse)))
                   (if (atom inverseClause)
                     inverseClause    ; NIL or a name
                     (first inverseClause)))                     
                 (if (atom reifiesClause)
                   reifiesClause
                   (first reifiesClause)))) )))
    (if (atom expr)
      (find-reification-relation expr)
      (let ((keyword (if (keywordp (car expr))
			 (validate-keyword (car expr))
			 (car expr))))
	(case keyword
	  ((:and :or :not)
	   (let ((newCdr (delete nil
			       (loop for subExpr in (cdr expr)
				    collect (filter-new-reified-expression subExpr inverseP)))))
	     (when newCdr
	       (cons (car expr) newCdr))))
          (:all
           (cond ((eq (second expr) (loom-constant DOMAIN))
                  `(,(if inverseP :range :domain) ,(name (third expr))))
                 ((eq (second expr) (loom-constant RANGE))
                  `(,(if inverseP :domain :range) ,(name (third expr))))))
	  ((:lambda :function :satisfies :predicate)
           :primitive)) )) ))

(defun create-reified-relation-definition (reificationConcept inverseP)
  ;; Situation:  "reificationConcept" is defined to reify a relation;
  ;; Returns:  An appropriate definition for the relation that
  ;;    "reificationConcept" reifies;
  ;; TO DO:  FIGURE OUT WHETHER THE RETURNED DEFINITION NEEDS TO BE
  ;;    PRIMITIVE OR NOT!   HOW CAN THIS BE DONE?
  (let ((parsedDefinition (getf (parsed-expressions reificationConcept) :definition)))
    (if (eq parsedDefinition :primitive)
      parsedDefinition
      (filter-new-reified-expression parsedDefinition inverseP)) ))

(defun generate-reified-concept-constraints (reificationConcept)
  ;; Situation:  "reificationConcept" is defined to reify a relation;
  ;; Returns:  Appropriate constraints for the "reificationConcept" that
  ;;    are generated from :domain and :range options in :reifies.;
  ;; TO DO:  FIGURE OUT WHETHER THE RETURNED DEFINITION NEEDS TO BE
  ;;    PRIMITIVE OR NOT!   HOW CAN THIS BE DONE?
  (let* ((reifiesClause (getf (rest (first (source-definitions reificationConcept)))
                              :reifies))
         (inverseClause (and (consp reifiesClause) 
                             (getf (rest reifiesClause) :inverse))))
    (declare (ignore inverseClause))
    (warn "NOT IMPLEMENTED YET")
    (return-from generate-reified-concept-constraints nil)
;    (if (eq parsedDefinition :primitive)
;      parsedDefinition
;      (filter-new-reified-expression parsedDefinition nil))
    ))

(defun generate-concept-reification-annotations (reificationConcept)
  (let* ((reifiesClause (getf (rest (first (source-definitions reificationConcept)))
                              :reifies))
         (inverseClause (and (consp reifiesClause) 
                             (getf (rest reifiesClause) :inverse))))
    (cond ((atom reifiesClause)
           `((reifies (the-relation ,reifiesClause 2))))
          ((null inverseClause)
           `((reifies (the-relation ,(car reifiesClause) 2))))
          ((atom inverseClause)
           `((reifies (the-relation ,(car reifiesClause) 2) 
                      (the-relation ,inverseClause 2))))
          (t
           `((reifies (the-relation ,(car reifiesClause) 2) 
                      (the-relation ,(car inverseClause) 2))))) ))

(defun generate-relation-reification-annotations (reificationConcept)
  ;; Returns: (1) Annotations for the relation clause
  ;;          (2) Annotations for the inverse relation clause
  ;; TO DO:  SHOULD CASE-ROLE NAMES INHERIT FROM SUPERS?
  (let* ((reifiesClause (getf (rest (first (source-definitions reificationConcept)))
                              :reifies))
         (caseRoles (or (and (consp reifiesClause)
                             (getf (rest reifiesClause) :case-roles))
                        '(source-case target-case)))
         (inverseClause (and (consp reifiesClause) 
                             (getf (rest reifiesClause) :inverse)))
         (inverseCaseRoles (and inverseClause
                                (or (and (consp inverseClause)
                                         (getf (rest inverseClause) :case-roles))
                                    '(target-case source-case))))
         (*conceptBeingParsed* reificationConcept))
    (declare (special *conceptBeingParsed*))

    (when (and inverseClause
               (or (neq (first caseRoles) (second inverseCaseRoles))
                   (neq (second caseRoles) (first inverseCaseRoles))))
      (parsing-error   ;; ZZZ IS THIS A DIFFERENT KIND OF ERROR?
       "Inverse :CASE-ROLES must be the opposite of forward relation :CASE-ROLES"))
    (values `((reified-by (the-relation ,(name reificationConcept) 1))
              (source-role (the-relation ,(first caseRoles) 2))
              (target-role (the-relation ,(second caseRoles) 2)))
            (and inverseClause
                 `((reified-by (the-relation ,(name reificationConcept) 1))
                   (source-role (the-relation ,(first inverseCaseRoles) 2))
                   (target-role (the-relation ,(second inverseCaseRoles) 2))))
            ) ))



;;;
;;;  Linking in new definition:
;;;

(defun concept-is-new-style-reification-p (concept)
  ;; TO DO:  USE A BETTER MARKER THAN THIS:
  (getf (rest (first (source-definitions concept))) :reifies) )

(defun define-associated-reified-relations (concept)
  ;; TO DO: HANDLE ANNOTATIONS THAT ARE IN THE :REIFIES CLAUSE AS WELL!
  (let* ((reifiesClause (getf (rest (first (source-definitions concept)))
                             :reifies))
        (inverseClause (and (consp reifiesClause) 
                            (getf (rest reifiesClause) :inverse)))
        relation)
    (multiple-value-bind (annotations inverseAnnotations)
                         (generate-relation-reification-annotations concept)
      (setq relation 
            (apply #'define-relation (if (consp reifiesClause)
                                       (first reifiesClause)
                                       reifiesClause)
                   :is (create-reified-relation-definition concept nil)
                   :annotations annotations
                   (and (consp reifiesClause) (rest reifiesClause))))
      (pushnew :reified (attributes relation))
      (when inverseClause
        (setq relation 
              (apply #'define-relation (if (consp inverseClause)
                                         (first inverseClause)
                                         inverseClause)
                     :is (create-reified-relation-definition concept t)
                     :annotations inverseAnnotations
                     (and (consp inverseClause) (rest inverseClause))))
        (pushnew :reified (attributes relation))) )))

