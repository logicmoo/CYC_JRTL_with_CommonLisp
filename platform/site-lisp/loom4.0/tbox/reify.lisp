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

;;; REIFY.LISP (TBOX)

;;; This file contains code for parsing defreified-relation, etc.

(in-package "LOOM")

(export '(defreified-relation))


(defmacro defreified-relation (name &rest definition)
  (if name
      (progn
	;; (form-reified-relation `,name `,definition))
	(form-reified-concept-definition `,name `,definition)) 
      `(complain "~%Syntax Error: Unnamed Reified Relation: ~S~%" ',definition)) )

(defun form-reified-concept-definition (name definition)
  (let* ((documentationString   ; DGB 2/4/93
	  (when (stringp (first definition))
	    (list (pop definition))))
	 (keyword
	  (or (find :is-primitive definition) 
	      :is))
	 (isDef
	  (or (get&remf definition keyword)
	      :primitive)))
    `(defconcept
      ,name
      ,@documentationString
      ,keyword (:reification ,isDef)
      ,@definition) ))

(defun distribute-reified-relation (concept)
  ;; Extract relation and concept definitions from the definition of concept
  ;; Create the resulting relation
  ;; Return the definition to be used for concept.
  (let ((name (caar (source-definitions concept)))
	conceptDef relationDef)
    ;; extract concept and relation definitions
    (multiple-value-setq (conceptDef relationDef)
      (filter-reified-source-clauses concept (cdar (source-definitions concept))))
    ;; Define relation, then return concept definition
    (let ((relation (eval-relation-id name))
	  (classifierEnabledP (not (member :disable-classifier *loom-features*))))
      ;; only redefine "relation" if "concept" is being redefined
      ;; i.e. if we are not parsing as a result of revision
      (when (not (member :being-revised (system-attributes concept)))
	(unwind-protect				; RMM 5/18/92
	    (progn
	      (pushnew :disable-classifier *loom-features*)
	      (setq relation (redefine-concept `(,name ,@relationDef) :relation)))
	  (when classifierEnabledP
	    (delf *loom-features* :disable-classifier))))
      (when relation                    ; RMM 3/29/95
        ;; during revision, the relation may disappear:
        (add-link depend-ons concept relation)
        (change-class concept 'REIFIED-RELATION)
        (setf (relation-of concept) relation))
      conceptDef) ))

(defun filter-reified-source-clauses (self options&arguments &key skip-tbox-definition)
  ;; Extract relation and concept clauses from "options&arguments"
  ;; "options&arguments" contains a list of alternating keyword options
  ;;     and values;
  ;; If "skip-tbox-definition" then extract only the non-tbox concept components
  ;;    of the source definition;
  ;; REWRITE THIS ENTIRE FUNCTION -- THIS IS HORRIBLE CODE!!!:
  (let (option argument
	conceptDef relationDef filteredDef attributesProcessedP)
    (when (and (name self)
	       (not (evenp (length options&arguments))))
      (parsing-error "Missing keyword or keyword argument"))
    (loop for tail on options&arguments by #'cddr
	 when (setq argument (cadr tail))
	 do
	 (setq option (validate-keyword (car tail)))
	 (case option
	   ((:is :is-primitive)     ; DGB 2/4/93
	    (unless skip-tbox-definition
	      (when (eq (first argument) :reification)
		(setq argument (second argument)))
	      (setq filteredDef (filter-reified-expression argument :concept-is))
	      (setq conceptDef (nconc
				 `(,option ,(add-expression 'a-reified-relation filteredDef))
				 conceptDef))
	      (setq filteredDef (filter-reified-expression argument :relation))
	      (when filteredDef
		(setq relationDef (nconc `(,option ,filteredDef) relationDef)))))
	   (:implies 
	    (setq filteredDef (filter-reified-expression argument :concept))
	    (when filteredDef
	      (setq conceptDef (nconc `(:implies ,filteredDef) conceptDef)))
	    (setq filteredDef (filter-reified-expression argument :relation))
	    (when filteredDef
	      (setq relationDef (nconc `(:implies ,filteredDef) relationDef))))
	   (:defaults 
	    (setq filteredDef (filter-reified-expression argument :concept))
	    (when filteredDef
	      (setq conceptDef (nconc `(:defaults ,filteredDef) conceptDef))))
	   (:characteristics
	    (unless skip-tbox-definition
	      (setq attributesProcessedP t)
	      ;; add :reified attribute to both relation and concept
	      (setq argument (list-of argument))
	      (pushnew :reified argument)
	      (setq conceptDef (nconc `(:characteristics ,argument) conceptDef))
	      (setq relationDef (nconc `(:characteristics ,argument) relationDef))))
	   ((:domain :range)
	    (setq conceptDef (nconc `(:implies (:all ,(if (eq option :domain)
							      'domain
							      'range)
							 ,argument)) conceptDef))
	    (setq relationDef (nconc `(,option ,argument) relationDef)))
	   (:domains
	    (setq relationDef (nconc `(,option ,argument) relationDef)))
	   (:antecedents  ;; NOTE: we assume that :antecedents is only used for relations
	    (setq relationDef (nconc `(,option ,argument) relationDef)))
	   (:disjoint-covering
	    (setq conceptDef (nconc `(,option ,argument) conceptDef)))
	   ((:partitions :exhaustive-partitions)  ; DGB 3/30/93
	    (setq conceptDef (nconc `(,option ,argument) conceptDef)))
	   (:in-partition
	    (setq conceptDef (nconc `(,option ,argument) conceptDef)))
	   (:system-characteristics
	    (setq conceptDef (nconc `(,option ,argument) conceptDef))
	    (setq relationDef (nconc `(,option ,argument) relationDef)))
	   ;; (:identifier nil)		;; leave identifier on the source defn
	   (:kb
	    (setq conceptDef (nconc `(,option ,argument) conceptDef))
	    (setq relationDef (nconc `(,option ,argument) relationDef)))
	   ((:from :to)
	    (unless skip-tbox-definition
	      ;; make domain or range alias
;; THIS IS BOGUS; THE RELATIONS "domain-alias" AND "range-alias" MUST
;;    BE DEFINED BEFORE THEY CAN BE ASSERTED:
;	      (set-db-slot self (if (eq option :from)
;				    'domain-alias
;				    'range-alias)
;			   argument)
;; THIS WILL BREAK UNTIL KASPER GETS AROUND TO FIXING IT:       RMM 7/2/90
	      (assert-role-filler self nil argument :assertion)))
	   (otherwise
	    (parsing-error "Illegal keyword: ~S" option))))
    (unless (or skip-tbox-definition attributesProcessedP)
      ;; add :reified attribute to both relation and concept
      (setq conceptDef (nconc (list :characteristics :reified) conceptDef))
      (setq relationDef (nconc (list :characteristics :reified) relationDef)))
    (values conceptDef relationDef)) )


(defun add-expression (addExpr oldExpr)
  (cond
    ((null oldExpr)
     addExpr)
    ((and (consp oldExpr)
	  (eq (car oldExpr) :and))
     `(:and ,addExpr ,@(cdr oldExpr)))
    (t
     `(:and ,addExpr ,oldExpr))) )

(defun filter-reified-expression (expr type)
  ;; type may be one of: :RELATION, :CONCEPT, :CONCEPT-IS
  (if (atom expr)
      expr
      (let ((keyword (if (keywordp (car expr))
			 (validate-keyword (car expr))
			 (car expr))))
	(case keyword
	  ((:and :or :not)
	   (let ((newCdr (delete nil
			       (loop for subExpr in (cdr expr)
				    collect (filter-reified-expression subExpr type)))))
	     (when newCdr
	       (cons (car expr) newCdr))))
	  ((:at-least :at-most :exactly :all :some :the :same-as :subset)
	   (when (eq type :concept)
	     expr))
	  (:domain
	   (cond
	     ((eq type :relation) expr)
	     (t `(:all domain ,(second expr)))))
	  (:range
	   (cond
	     ((eq type :relation) expr)
	     (t `(:all range ,(second expr)))))
	  (:inverse
	   (cond
	     ((eq type :relation) expr)
	     ;; inverse for concept definitions handled indirectly
	     ;; by using the subsumption test for the corresponding relations.
	     (t nil)))
	  (:composition
	   (cond
	     ((eq type :relation) expr)
	     ;; INCOMPLETE: composition for concept definitions currently handled indirectly
	     ;; by using the subsumption test for the corresponding relations.
	     (t nil)))
	  (:concept
	   (when (member type '(:concept :concept-is))
	     (if (cddr expr)
		 `(:and ,@(cdr expr))
		 (second expr))))
	  (:relation
	   (when (eq type :relation)
	     (if (cddr expr)
		 `(:and ,@(cdr expr))
		 (second expr))))
	  ((:lambda :function)
	   (cond
	     ((eq type :relation) expr)
	     (t :primitive)))
	  ((:satisfies :predicate)
	   (case type
	     (:relation
	      (if (and (consp (second expr))
		       (cdr (second expr)))
		  expr
		  :primitive))
	     (t
	      (if (or (atom (second expr))
		      (null (cdr (second expr))))
		  expr
		  :primitive))))
	  (otherwise  ;; expr is a relation/operator
	   (when (eq type :concept)
	     expr))))) )


(defmethod specializes-classified-concept-p
	   ((concept1 REIFIED-RELATION) concept2 checkForEqualityFlag dontCheckPrimsFlag)
  ;;
  (cond
    ((typep concept2 'REIFIED-RELATION)
     (let ((relation1 (relation-of concept1))
	   (relation2 (relation-of concept2)))
       (and relation1 relation2
	    (specializes-classified-concept-p relation1 relation2
					      checkForEqualityFlag dontCheckPrimsFlag)
	    (call-next-method))))
    (t
     (call-next-method))) )

(defun find-named-relation (name concepts)
  (find-if #'(lambda (concept)
	       (and (typep concept 'TBOX-RELATION)
		    (eql name (name concept))))
	   concepts))


(defmethod parent-is-identical-p ((self REIFIED-RELATION) parent dontExpandP)
  ;; Helping function for "classify-below";
  ;; Return "parent" iff "self", which is known to specialize "parent", is
  ;;    identical to it;
  ;; For reified-relations, this can't happen;
  (declare (ignore parent dontExpandP))
  nil )
