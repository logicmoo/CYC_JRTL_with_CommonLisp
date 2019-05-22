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

;;; DISJUNCTION.LISP (TBOX)

(in-package "LOOM")

;(export '())

;;; Routines for handling algebraic expressions, and specifically,
;;;    concepts defined using union and relative complement
;;;    (disjunction and negation) operators.

  ;;
;;;;;; Normal Form Derivation
  ;;

;;; The routines below produce normal-form equivalents for
;;;    algebraic concept expressions.
;;;
;;; There are two normal forms:
;;;    1. NORMALIZE-EXPRESSION keeps disjunctions
;;;       as small as possible.
;;;    2. DNF-EXPRESSION computes the disjunctive normal form.
;;;
;;; NORMALIZE-ALGEBRAIC-EXPRESSION uses NORMALIZE-EXPRESSION,
;;;    unless the value of *normalForm* has a non-nil value.

(defun normalize-algebraic-expression (expression &key invert-p normal-form)
  (declare (special *normalForm*))
  #L:trace-parse (trace-values "normalize-algebraic-expression" expression)
  (when (and (null normal-form)
	     (boundp '*normalForm*))
    (setq normal-form *normalForm*))
  (case normal-form
    (:dnf (dnf-expression expression invert-P))
    (otherwise (normalize-expression expression invert-P))))

(defun normalize-expression (expression invertP)
  ;; Return an expression in normal form which is
  ;;    equivalent to "expression";
  ;; If "invertP", return an expression representing the complement
  ;;    of "expression";
  (cond
    ((consp expression)
     (let ((normExpr
	     (case (car expression)
	       (:and (normalize-intersection expression invertP))
	       (:or (normalize-union expression invertP))
	       (:not (cond
		       ((eq (cadr expression) :primitive)
			(progn
			  (parsing-warning "(:not :primitive) is a meaningless expression")
			  nil))
		       (t
			(normalize-algebraic-expression
			  (cadr expression) :invert-p (not invertP)))))
	       (otherwise
		(cond
		  (invertP (invert-predication expression))
		  (t expression))))))
       (cond
	 ((consp normExpr)
	  (delete nil normExpr))
	 (t
	  normExpr))))
    (t
     (cond
       (invertP (invert-concept expression))
       (t expression)))) )

(defun normalize-union (unionExpr invertP)
  ;; "unionExpr" is a union-expression;
  ;; Return an equivalent expression in NF;
  ;; If "invertP", return a NF expression representing the complement
  ;;    of "unionExpr";
  (when (member :primitive unionExpr)
    (parsing-warning ":primitive is not allowed as a disjunct")
    (setq unionExpr (delete :primitive unionExpr)))
  (when invertP
    (return-from normalize-union
      (normalize-algebraic-expression
	`(:and ,@(loop for e in (cdr unionExpr)
		      collect
		      (normalize-algebraic-expression e :invert-p t))))))
  (let (listOfDisjuncts)
    ;; normalize each component
    (loop for disjunct in (cdr unionExpr)
	 do
	 (let ((normalizedDisjunct
		 (normalize-algebraic-expression disjunct)))
	   (cond
	     ((and (consp normalizedDisjunct)
		   (eq (car normalizedDisjunct) :or))
	      ;; lift nested :or's into main expression
	      (loop for subDisjunct in (cdr normalizedDisjunct)
		  do (pushnew subDisjunct listOfDisjuncts
			      :test #'filler-equal)))
	     (t (pushnew normalizedDisjunct listOfDisjuncts 
			 :test #'filler-equal)))))
    ;; absorption and common factors
    (dolist (disj1 listOfDisjuncts)
      (when (and (consp disj1)
		 (eq (car disj1) :and))
	(dolist (disj2 listofDisjuncts)
	  (when (not (eq disj1 disj2))
	    (cond ((member disj2 disj1 :test #'filler-equal)
		   (setq listOfDisjuncts 
		     (delete disj1 listOfDisjuncts :test #'eq))
		   (return disj2))
		  ((and (consp disj2)
			(eq (car disj2) :and))
		   (let ((commonExprs (intersection (cdr disj1) (cdr disj2)
						    :test #'filler-equal)))
		     (when commonExprs
		       (let ((rem1 (set-difference (cdr disj1) commonExprs
						   :test #'filler-equal))
			     (rem2 (set-difference (cdr disj2) commonExprs
						   :test #'filler-equal)))
			 (setq listOfDisjuncts 
			   (delete disj1 listOfDisjuncts :test #'eq))
			 (setq listOfDisjuncts
			   (delete disj2 listOfDisjuncts :test #'eq))
			 (push `(:and ,@commonExprs
				      (:or ,(cond
					      ((cdr rem1) `(:and ,@rem1))
					      (t (car rem1)))
					   ,(cond
					      ((cdr rem2) `(:and ,@rem2))
					      (t (car rem2)))))
			       listOfDisjuncts)
			 (return-from normalize-union
			   (normalize-algebraic-expression
			     `(:or ,@(nreverse listOfDisjuncts))))
			 )))))))))
    ;; collect results
    (cond
      ((cdr listOfDisjuncts)
       `(:or ,@(nreverse listOfDisjuncts)))
      (t (car listOfDisjuncts))) ))

(defun normalize-intersection (intersectionExpr invertP)
  ;; "intersectionExpr" is a intersection-expression;
  ;; Return an equivalent expression in NF;
  ;; If "invertP", return a NF expression representing the complement
  ;;    of "intersectionExpr";
  (when invertP
    (return-from normalize-intersection
      (cond
	((member :primitive intersectionExpr)
	 ;; Don't apply Demorgan's Law if intersectionExpr represents
	 ;; a primitive concept.
	 `(:not ,(normalize-intersection intersectionExpr nil)))
	(t
	 (normalize-algebraic-expression
	   `(:or ,@(loop for e in (cdr intersectionExpr)
			collect
			(normalize-algebraic-expression e :invert-p t))))))))
  (let (listOfConjuncts)
    ;; normalize each component, and collect results:
    (loop for conjunct in (cdr intersectionExpr)
	 do
	 (let ((normalizedConjunct
		 (normalize-algebraic-expression conjunct)))
	   (cond
	     ((and (consp normalizedConjunct)
		   (eq (car normalizedConjunct) :and))
	      ;; lift nested :and's into main expression
	      (loop for subConjunct in (cdr normalizedConjunct)
		  do (pushnew subConjunct listOfConjuncts 
			      :test #'filler-equal)))
	     (t (pushnew normalizedConjunct listOfConjuncts
			 :test #'filler-equal)))))
    ;; at this point all members of "listOfConjuncts" are normalized, and
    ;;    none of them are :and (intersection) expressions.
    ;; Rewrite: absorption and common factors
    (dolist (conj1 listOfConjuncts)
      (when (and (consp conj1)
		 (eq (car conj1) :or))
	(dolist (conj2 listofConjuncts)
	  (when (not (eq conj1 conj2))
	    (cond ((member conj2 conj1 :test #'filler-equal)
		   (setq listOfConjuncts (delete conj1 listOfConjuncts
						 :test #'eq))
		   (return conj2))
		  ((and (consp conj2)
			(eq (car conj2) :or))
		   (let ((commonExprs (intersection (cdr conj1) (cdr conj2)
						    :test #'filler-equal)))
		     (when commonExprs
		       (let ((rem1 (set-difference (cdr conj1) commonExprs
						   :test #'filler-equal))
			     (rem2 (set-difference (cdr conj2) commonExprs
						   :test #'filler-equal)))
			 (setq listOfConjuncts (delete conj1 listOfConjuncts :test #'eq))
			 (setq listOfConjuncts (delete conj2 listOfConjuncts :test #'eq))
			 (push `(:or ,@commonExprs
				     (:and ,(cond
					      ((cdr rem1) `(:or ,@rem1))
					      (t (car rem1)))
					   ,(cond
					      ((cdr rem2) `(:or ,@rem2))
					      (t (car rem2)))))
			       listOfConjuncts)
			 (return-from normalize-intersection
			   (normalize-algebraic-expression
			     `(:and ,@(nreverse listOfConjuncts))))
			 )))))))))
    ;; collect results
    (cond
      ((cdr listOfConjuncts)
       `(:and ,@(nreverse listOfConjuncts)))
      (t (car listOfConjuncts))) ))

(defun invert-predication (predication)
  ;; "predication" is an expression such as :at-least, :all, etc.,
  ;;     i.e., it is a CONS;
  ;; Return an expression representing the complement of the expression
  ;;    "predication";
  (case (car predication)
    ;; concept predications
    ((:at-least :at-most :exactly)
     (let ((normThird (normalize-algebraic-expression (third predication))))
       (case (car predication)
	 (:at-least
	  `(:at-most ,(- (second predication) 1) ,normThird))
	 (:at-most
	  `(:at-least ,(+ (second predication) 1) ,normThird))
	 (:exactly
	  `(:or (:at-most ,(- (second predication) 1) ,normThird)
		(:at-least ,(+ (second predication) 1) ,normThird))))))
    ((:all :some :the)
     (let ((normSecond (normalize-algebraic-expression (second predication))))
       (case (car predication)
	 (:all
	  `(:some ,normSecond
		  ,(normalize-algebraic-expression (third predication) :invert-p t)))
	 (:some
	  `(:all ,normSecond
		 ,(normalize-algebraic-expression (third predication) :invert-p t)))
	 (:the
	  `(:or (:at-most 0 ,normSecond)
		(:at-least 2 ,normSecond)
		(:some ,normSecond
		       ,(normalize-algebraic-expression (third predication) :invert-p t)))))))
    (:same-as
     `(:not-same-as ,@(loop for expr in (cdr predication)
			   collect (normalize-algebraic-expression expr))))
    (:not-same-as
     `(:same-as ,@(loop for expr in (cdr predication)
		       collect (normalize-algebraic-expression expr))))
    ;; relation predications
    (:domain
     `(:domain ,(normalize-algebraic-expression (second predication) :invert-p t)))
    (:range
     `(:range ,(normalize-algebraic-expression (second predication) :invert-p t)))
						; (:inverse) DON'T KNOW WHAT TO DO YET!
						; (:lambda) DON'T KNOW WHAT TO DO YET!
    (t `(:not ,predication))
    ) )

(defun invert-concept (concept)
  ;; "concept" is a TBOX-CONCEPT;
  ;; Return a concept representing the complement of "concept";
  ;; REWRITE THIS IF RESTRICTIONS GET PASSED INTO HERE;
  (if (symbolp concept)
    (if (eq concept :primitive)
       (progn
	 (parsing-warning "Attempt to negate :primitive")
	 nil)
      `(:not ,concept))
    ;; POSSIBLY TEMPORARY -- WHEN NEGATION IS IMPLEMENTED WE WILL FIND OUT;
    ;; WITHOUT THIS, NEGATIONS JUST EVAPORATE, CAUSING UNSOUND PARSE:
    `(:not ,concept)))

;(defun old-invert-concept (concept)
;  ;; Return a concept representing the complement of "concept";
;  ;; THIS FUNCTION MAY ONLY BE USED DURING CONDITIONING, IF AT ALL.
;  ;;    it normalizes negated expressions by propagating them down to
;  ;;    primitive concepts.
;  (integrity-check (typep concept 'TBOX-CONCEPT))
;  (cond
;    ((primitive-p concept) `(:not ,concept))	; THIS ENCODING MAY CHANGE
;    (t (normalize-algebraic-expression
;	 (generate-concept-expression concept) :invert-p t))) )

;(defun generate-concept-expression (concept)
;  ;; "concept" is a TBOX-CONCEPT;
;  ;; Return an algebraic expression for concept;
;  ;; THIS FUNCTION MAY ONLY BE USED DURING CONDITIONING, IF AT ALL,
;  ;; SINCE IT REQUIRES ALL SUB-EXPRESSIONS IN THE DEFINITION OF "concept"
;  ;; TO BE CLASSIFIED.
;  ;; TO DO: ADD IN STRUCTURE-RELATIONS;
;  (or (getf (parsed-expressions concept) :is)
;      `(:and
;	 ,@(loop for conjunct in (conjuncts concept)
;		collect
;		(generate-reference-definition conjunct))
;	 ,@(loop for res in (restrictions concept)
;		collect
;		(generate-restriction-clause res)))) )


;;; DNF NORMALIZATION FUNCTIONS:

(defun dnf-expression (expression invertP)
  ;; Return an expression in disjunctive normal form which is
  ;;    equivalent to "expression";
  ;; If "invertP", return an expression representing the complement
  ;;    of "expression";
  (cond
    ((consp expression)
     (case (car expression)
       (:and (dnf-intersection expression invertP))
       (:or (dnf-union expression invertP))
       (:not (dnf-expression
	       (cadr expression) (not invertP)))
       (otherwise
	(cond
	  (invertP (invert-predication expression))
	  (t expression)))))
    (t
     (cond
       (invertP (invert-concept expression))
       (t expression)))))


(defun dnf-union (unionExpr invertP)
  ;; "unionExpr" is a union-expression;
  ;; Return an equivalent expression in DNF;
  ;; If "invertP", return a DNF expression representing the complement
  ;;    of "unionExpr";
  (when invertP
      (return-from dnf-union
	(normalize-algebraic-expression
	  `(:and ,@(loop for e in (cdr unionExpr)
			collect
			(normalize-algebraic-expression e :invert-p t))))))
  (let (listOfDisjuncts)
    ;; normalize each component, and collect results:
    (loop for disjunct in (cdr unionExpr)
	 do
	 (let ((normalizedDisjunct
		 (normalize-algebraic-expression disjunct)))
	   (cond
	     ((and (consp normalizedDisjunct)
		   (eq (car normalizedDisjunct) :or))
	      ;; lift nested :or's into main expression
	      (loop for subDisjunct in (cdr normalizedDisjunct)
		  do (pushnew subDisjunct listOfDisjuncts
			      :test #'filler-equal)))
	     (t (pushnew normalizedDisjunct listOfDisjuncts 
			 :test #'filler-equal)))))
    (cond
      ((cdr listOfDisjuncts)
       `(:or ,@(nreverse listOfDisjuncts)))
      (t (car listOfDisjuncts))) ))

(defun dnf-intersection (intersectionExpr invertP)
  ;; "intersectionExpr" is a intersection-expression;
  ;; Return an equivalent expression in DNF;
  ;; If "invertP", return a DNF expression representing the complement
  ;;    of "intersectionExpr";
  (when invertP
    (return-from dnf-intersection
      (cond
	((member :primitive intersectionExpr)
	 ;; Don't apply Demorgan's Law if intersectionExpr represents
	 ;; a primitive concept.
	 `(:not ,(normalize-intersection intersectionExpr nil)))
	(t
	 (normalize-algebraic-expression
	   `(:or ,@(loop for e in (cdr intersectionExpr)
			collect
			(normalize-algebraic-expression e :invert-p t))))))))
  (let (listOfConjuncts)
    ;; normalize each component, and collect results:
    (loop for conjunct in (cdr intersectionExpr)
	 do
	 (let ((normalizedConjunct
		 (normalize-algebraic-expression conjunct)))
	   (cond
	     ((and (consp normalizedConjunct)
		   (eq (car normalizedConjunct) :and))
	      ;; lift nested :and's into main expression
	      (loop for subConjunct in (cdr normalizedConjunct)
		  do (pushnew subConjunct listOfConjuncts
			      :test #'filler-equal)))
	     (t (pushnew normalizedConjunct listOfConjuncts
			 :test #'filler-equal)))))
    ;; at this point all members of "listOfConjuncts" are normalized, and
    ;;    none of them are :and (intersection) expressions;
    ;; apply distributive law if an :or (union) exists in "listOfConjuncts":
    (let ((unionExpr
	    (loop for e in listOfConjuncts
		 when (and (consp e)
			      (eq (car e) :or))
                 return e)))
      (when unionExpr
	  (return-from dnf-intersection
	    (distribute-union-across-conjuncts unionExpr listOfConjuncts))))
    (cond
      ((cdr listOfConjuncts)
       `(:and ,@(nreverse listOfConjuncts)))
      (t (car listOfConjuncts))) ))

(defun distribute-union-across-conjuncts (unionExpr conjuncts)
  ;; "unionExpr" is a union-expression within the list "conjuncts",
  ;;    which represents a list of intersecting concept-expressions;
  ;; Return an expression in which "unionExpr" has been factored
  ;;    into the remaining members of "conjuncts";
  #L:trace-parse (trace-values "distribute-union-across-conjuncts" unionExpr conjuncts)
  (delf conjuncts unionExpr :test #'eq)
  (when (null conjuncts)
      (return-from distribute-union-across-conjuncts unionExpr))
  ;; first form the intersection of the first disjunct of "unionExpr"
  ;;    and the other conjuncts; then build up conjunctive expressions
  ;;    for the remaining disjuncts in "unionExpr":
  (let ((disjuncts
	  `((:and ,(cadr unionExpr) ,@conjuncts))))
    (loop for e in (cddr unionExpr)
	 do
	 (push `(:and ,e ,@(copy-list conjuncts)) disjuncts))
    (dnf-union
      `(:or ,@(nreverse disjuncts)) nil)) )


(defun renormalize-disjunctive-definition (self)
  ;; Self is marked for expansion to DNF, and *normalForm* is :dnf;
  ;; Replace (in the parsed definition of self)
  ;;    any concepts that are defined as disjunctions
  ;;    with their definitions, and renormalize the definition of self.
  ;; If disjunction is inherited by a conjunct,
  ;;    then add its definition to the list of conjuncts to be normalized;
  (let ((definition (getf (parsed-expressions self) :definition))
	conjuncts disjunctions expr size)
    (when (and (consp definition)
	       (eq (car definition) :and)
	       (not (primitive-p self)))	; BK 3/21/90
      (multiple-value-setq (conjuncts disjunctions)
	(extract-disjunctions (cdr definition)))
      (when disjunctions
	(setq disjunctions (most-specific-concepts disjunctions))
	(setq expr `(:and ,@conjuncts ,@(loop for d in disjunctions
					     collect
					     `(:or ,@(disjuncts d)))))
	(setq size (dnf-size expr))
	(if (> size *dnf-limit*)
	    (progn
	      (unless (member :suppress-diehard-output *loom-dialogue-features*)
		(warn "Concept ~S inhibited from expanding to DNF,~%~
                       because it would have ~S disjuncts." self size))
	      (delf (system-attributes self) :dnf)
	      (addf (system-attributes self) :not-dnf))
	    (record-parsed-expression
	      self :definition
	      (normalize-algebraic-expression expr)
	      :old-expression :replace))))) )

(defun extract-disjunctions (conjuncts)
  (let (newConjuncts disjunctions conjunctExpr)
    (loop for conjunct in conjuncts
	 do
	 (if (and (atom conjunct)
		  (typep conjunct 'TBOX-CONCEPT))
	     ;; conjunct is a concept object
	     (cond
	       ((eq (defined-as conjunct) :disjunction)
		(pushnew conjunct disjunctions))
	       ((or (primitive-p conjunct)
		    (null (disjunctive-features conjunct)))
		(push conjunct newConjuncts))
	       (t
		(let ((*parserContextStack* (list *loom-parse-graph*))
		      (*conceptBeingParsed* conjunct))
		  (declare (special *parserContextStack* *conceptBeingParsed*))
		  (setq conjunctExpr (initiate-parse-expression
				       (generate-concept-definition conjunct :definition-only-p t)
				       (concept-or-relation conjunct))))
		(if (and (consp conjunctExpr)
			 (eq (car conjunctExpr) :and))
		    (multiple-value-bind (embeddedConjuncts embeddedDisjunctions)
			(extract-disjunctions (cdr conjunctExpr))
		      (setq newConjuncts (nconc newConjuncts embeddedConjuncts))
		      (loop for d in embeddedDisjunctions
			   do (pushnew d disjunctions)))
		    (push conjunct newConjuncts))))
	     ;; conjunct is an embedded expression
	     (push conjunct newConjuncts)))
    (values newConjuncts disjunctions)) )


  ;;
;;;;;; DNF Expansion of Concept Definitions
  ;;

(defun expand-unclassified-concept (self)
  ;; expand the definition of "self" to DNF;
  ;; We have to explicitly mark "self" as unclassified,
  ;;    because this function is usually called during the classification of "self",
  ;;    and the "classified-p" slot is used for marking during classification;
  ;; It is an error to attempt to expand to DNF twice.
  (integrity-check (not (member :dnf (system-attributes self))))
  (when (dnf-too-large-p self)
    (return-from expand-unclassified-concept nil))
  #L:trace-build (trace-values "expanding unclassified concept to DNF:" self)
  (addf (system-attributes self) :dnf)
  (setf (classified-p self) nil)
  (revise-one-concept self)
  self)

(defun dnf-too-large-p (self)
  (let ((size (dnf-size (if (source-definitions self)
			    (or (getf (cdar (source-definitions self)) :is)
				(getf (cdar (source-definitions self)) :is-primitive))
			    (getf (parsed-expressions self) :definition))))
	(inheritedSize 1))
    (when (or (> size *dnf-limit*)
	      (progn
		(loop for dc in (disjunctive-features self)
		     when (eq (defined-as dc) :disjunction)
		     do (setq inheritedSize (* inheritedSize (length (disjuncts dc)))))
		(> inheritedSize *dnf-limit*)))
      (unless (member :suppress-diehard-output *loom-dialogue-features*)
	(warn "Concept ~S inhibited from expanding to DNF,~%~
                       because it would have ~S disjuncts." self (max size inheritedSize)))
      (addf (system-attributes self) :not-dnf)
      size)) )


;;; NULLIFIED VERSIONS OF OBSOLETE FUNCTIONS:
(defun expand-classified-concept (self &key dont-classify)
  (declare (ignore self dont-classify))
  nil)
(defun expanded-parent-is-identical-p (self parent)
  (declare (ignore self parent))
  nil)
(defun expanded-specializes-concept-p (concept1 concept2 &key unclassified)
  (declare (ignore concept1 concept2 unclassified))
  nil)


(defun expansion-is-possible-p (concept disjunctions)
  ;; Currently, expansion to DNF is not possible if all disjunctions are inherited
  ;; through primitive concepts;
  ;; Negative value of this predicate is cached using the :not-dnf system-attribute;
  (unless (member :not-dnf (system-attributes concept))
    ;; NOTE: we assume that the super-concepts slot has been filled in
    ;; by either conditioning or classification, since "concept" must be at least half classified
    ;; NOTE: expansion currently uses parsed-expressions of concept,
    ;; so a more restrictive predicate should examine (conjuncts concept) instead of (super-concepts concept)
    (let ((resultP (loop for s in (conjuncts concept)
		       thereis
		       (or (and (eq (defined-as s) :disjunction)
				(member s disjunctions))
			   (unless (primitive-p s)
			     (expansion-is-possible-p s disjunctions))))))
      (when (not resultP)
	(addf (system-attributes concept) :not-dnf))
      resultP)) )

(defun primitive-specialization-p (concept)
  ;; Predicate is true if concept is primitive,
  ;; and (CURRENTLY OMITTED: it is defined only by specializing a single conjunct);
;  (and (primitive-p concept)
;       (null (cdr (conjuncts concept))))
  (primitive-p concept) )


  ;;
;;;;;; Functions to estimate the size of expanding an expression to DNF
  ;;

(defun count-ors (expr)
  (let ((count 0))
    (when (consp expr)
      (when (eq (car expr) :or)
	(incf count))
      (when (member (car expr) '(:and :or :not))
	(loop for e in (cdr expr)
	     do (incf count (count-ors e)))))
    count) )

(defun dnf-size (expr)
  (let ((count 1))
    (when (consp expr)
      (case (car expr)
	(:or
	 (let ((disjuncts 0))
	   (loop for e in (cdr expr)
		do (incf disjuncts (dnf-size e)))
	   (setq count (* count disjuncts))))
	((:and :not)
	 (loop for e in (cdr expr)
	      do (setq count (* count (dnf-size e)))))))
    count) )
