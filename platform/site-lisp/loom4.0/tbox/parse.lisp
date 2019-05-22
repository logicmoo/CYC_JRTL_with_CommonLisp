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

;;; PARSE.LISP (TBOX)

;;; This file contains code for parsing defconcepts, defrelations, etc.,
;;;    and also contains code for generating them from Loom objects

(in-package "LOOM")

  ;;
;;;;;; Loom Recursive Descent Parser
  ;;

;;; Set up the skeleton grammar, and define keyword abbreviations

(defun initialize-loom-parser ()
  ;; Set up the keyword look-up table and the parse graph;
  (extend-keyword-table))

(defun extend-keyword-table ()
  ;; Convert the table *loom-keyword-abbreviations* from an assoc list to
  ;;    a hash table, and extend it by adding keywords found in
  ;;    *loom-parse-graph*;
  (labels ((help-extend-keyword-table 
	     (subGraph)
	     ;; Recursively search "subGraph" for new keywords, a add each one
	     ;;    to *loom-keyword-lookup-table*
	     (cond
	       ((listp subGraph)
		(loop for item in subGraph
		     do (help-extend-keyword-table item)))
	       ((keywordp subGraph)
		(add-keyword-to-keyword-lookup-table subGraph subGraph))
	       (t nil)))
	   (add-keyword-to-keyword-lookup-table
	     (alias keyword)
	     ;; Add a table entry that associates the keyword "alias" with "keyword";
	     (setf (gethash alias *loom-keyword-lookup-table*) keyword) ))
    (let ((originalTable *loom-keyword-lookup-table*))
      (setq *loom-keyword-lookup-table*
	    (make-hash-table))
      (loop for pair in originalTable do
	   (add-keyword-to-keyword-lookup-table (car pair) (cdr pair)))
      (help-extend-keyword-table *loom-parse-graph*)
      (help-extend-keyword-table *loom-non-terminals*) )))

(defun dwimify-keywords-p ()
  ;; Return t if a symbol with the same name as a keyword gets
  ;;    replaced by the keyword by "validate-keyword".
  (not (member :dont-dwimmify-keywords *loom-features*)) )

(defun validate-keyword (keyword &key query-p non-keywords no-error-p)
  ;; Add a ":" prefix if needed; translate keyword aliases;
  ;; Return valid keyword;
  ;; If "keyword" is a symbol, then if it matches a valid keyword 
  ;;    or keyword alias, return the translated keyword;
  ;;    Otherwise, if no-error-p, return the original symbol;
  ;;    Otherwise, generate an error;
  ;; Pass through if it "keyword" matches "non-keywords";
  (flet ((form-unknown-keyword-error ()
           (if no-error-p
             keyword                    ; return bad, unvalidated keyword
	     (if query-p                       ; report bad keyword
	       (form-query-error "Unknown keyword: ~S" keyword)
	       (parsing-error "Unknown keyword: ~S" keyword)))))
    (let (testKeyword canonicalKeyword)
      (cond
	((keywordp keyword)
	 (setq canonicalKeyword
	       (gethash keyword *loom-keyword-lookup-table*))
         (or canonicalKeyword
             (form-unknown-keyword-error)))
	((member keyword non-keywords)
	 keyword)
        ;; "=" is equivalenced to :same-as in queries:
	((and (eq keyword '=)
              query-p)
         :same-as)
        ((symbolp keyword)
	 (setq testKeyword 
               (find-symbol (string-upcase (symbol-name keyword)) 'KEYWORD))
	 ;; note: "gethash" converts alias to real name:
	 (or (and (dwimify-keywords-p)
                  (gethash testKeyword *loom-keyword-lookup-table*))
             ;; try converting prefixed non-keyword into non-prefixed non-keyword:
             (when (extended-identifier-p keyword)
               (let ((nonExtendedKeyword
                      (values (parse-extended-identifier keyword :no-error-p t))))
                 (when (member nonExtendedKeyword non-keywords)
                   nonExtendedKeyword)))
	     (form-unknown-keyword-error)))
        (no-error-p
         ;; we discovered an error, but can't report it:
         keyword)
	(t					; not a symbol
	 (if query-p
	     (form-query-error "Illegal keyword: ~S" keyword)
	     (parsing-error"Illegal keyword: ~S" keyword)))) )))


;; NOT YET FUNCTIONING IN NEW PARSER:
(defun push-parser-context (keyword)
  ;; Verify that "keyword" is valid in the current parsing
  ;;    context by inspecting the parse-graph;
  ;; Check whether "keyword" is associated with a clause or
  ;;    should appear as a singleton keyword;
  ;; If all is ok, push the new context onto *parserContextStack*
  (declare (ignore keyword)) ;; <= ELIMINATE WHEN IMPLEMENTED
  (declare (special *parserContextStack* *conceptBeingParsed*))
  "NOT YET IMPLEMENTED"
  )

(defun pop-parser-context ()
  ;; Pop the parser context stack
  (declare (special *parserContextStack*))
  (pop *parserContextStack*) )

;; NOT YET FUNCTIONING IN NEW PARSER:
(defun find-keyword-in-stack (depth)
  ;; Return the keyword corresponding to the context at the
  ;;    indicated depth, where "depth" = 0 is the top of the stack
  (declare (special *parserContextStack*))
  (car (nth depth *parserContextStack*)) )

(defun parsing-warning (message &rest arguments)
  ;; Broadcast a warning message, and then resume parsing;
  (declare (special *conceptBeingParsed*))
  (when (member :warn-about-syntax-corrections *loom-dialogue-features*)
    (complain "~%Syntax Warning:   ~?." message arguments)
;    (apply #'format t message (quote-symbols arguments))
    (complain "~%Warning occurred in the definition:~%   ~S~%"
	      (generate-source-definition *conceptBeingParsed*))) )

(defun parsing-error (message &rest arguments)
  ;; Send an error message, and pop out of "defconcept";
  (declare (special *conceptBeingParsed*))
  (complain "~%Syntax Error:   ~?." message arguments)
  (complain "~%Error occurred in the definition:~%   ~S~%"
	    (generate-source-definition *conceptBeingParsed*))
  (throw 'parse-concept-definition-catcher nil))

(defun quote-symbols (arguments)
  ;; Helping function for "parsing-warning" and "parsing-error";
  ;; Return a list with all symbols in arguments quoted;
  (loop for arg in arguments
       collect
       (if (and (symbolp arg)
		(not (keywordp arg)))
	   `',arg
	   arg)) )


(setq *loom-non-terminals*
      '((C-EXPR :primitive
		SYMBOL
		C-AND C-OR C-NOT
		(:at-least) (:at-most) (:exactly)
		(:all) (:the) (:some) (:filled-by) (:not-filled-by)
		(:same-as) (:subset) (:contains) (:not-same-as)
		(:relates) (:exists (:coref) (:includes-coref) (:within-coref))
		(:not-relates) (:not-exists)
		(:one-of) (:the-ordered-set)
		(:satisfies QUERY) (:predicate))
	(C-AND (:and C-EXPR))
	(C-OR (:or C-EXPR))
	(C-NOT (:not C-EXPR))

	(VALUE-RESTRICTION C-EXPR (:through)
	 (:interval++) (:interval+-) (:interval-+) (:interval--))

	(R-EXPR :primitive
		R-AND R-OR R-NOT
		(:range C-EXPR) (:domain C-EXPR)
		(:inverse R-EXPR) (:composition R-EXPR)
		; (:transitive-closure R-EXPR)
		(:predicate) (:function) (:satisfies QUERY))
	(R-AND (:and R-EXPR))
	(R-OR (:or R-EXPR))
	(R-NOT (:not R-EXPR))
 
	(INT-EXPR INT-AND INT-OR INT-NOT
	 (:one-of) (:the-ordered-set) (:through)
	 (:interval++) (:interval+-) (:interval-+) (:interval--))
	(QUERY (:and) (:or) (:not) (:fail) (:provable)
	       (:exists) (:forall) (:one-of) (:implies) 
	       (:about) (:filled-by-list)
	       (:set-of) (:collect) (:predcall) (:funcall)
	       (:within-context) (:within-theory) (:within-world)  ; Within-context obsolete!
	       (:previously) (:at-agent-time)
	       (:at-world-time) (:at-world-time+) (:at-world-time-) 
	       (:becomes) (:ceases)  (:persists-forward) (:persists-backward)
	       (:detects) (:undetects) (:changes)
               (:create)
	       (:equivalent-roles)    ; DGB 12/9/93
	       )

	(SYSTEM-ATTRIBUTES
	  (:system-characteristics :definition-only :dont-set-inverse-link
			      :being-classified :system-generated-name
			      :recursive :directly-recursive
			      :temporary))
	))

(setq *loom-parse-graph*
      '((:defconcept (:is C-EXPR) (:is-primitive C-EXPR)
	  (:implies C-EXPR)
	  (:characteristics :base-set :incoherent   ;  :individual
                       :monotonic :perfect
		       :clos-class
		       :predicate-specializes-parents         ; OBSOLETE
		       :closed-world :open-world
		       :forward-chaining :backward-chaining
                       :non-exported
		       :temporal
		       :system-defined :undefined)
	  (:defaults C-EXPR)
	  (:disjoint-covering)
	  (:partitions :exhaustive-partitions)
	  (:in-partition)
	  (:annotations)
          (:keys)
          (:indices)
	  SYSTEM-ATTRIBUTES
	  (:identifier) 
	  (:context)
	  (:mixin-classes)
          (:reifies :defrelation)
          (:class-name) (:existing-class-name)
          (:mixin-slots))
	(:defrelation (:is R-EXPR) (:is-primitive R-EXPR)
	  (:implies R-EXPR)
	  (:characteristics :single-valued :multiple-valued
		       :ordered
		       :symmetric :commutative ; :transitive
                       :total           ; PROLOG
		       :closed-world :open-world :clip-roles
		       :monotonic :perfect :closed-on-constants
		       :predicate-specializes-parents         ; OBSOLETE
                       :cache-computation
		       :read-only :read-write
		       :forward-chaining :backward-chaining
                       :non-exported :hash-on-domains
		       :temporal
		       :system-defined :undefined :reified)
	  (:domain) (:domains) (:range)
	  (:arity) (:inverse)
	  (:antecedents R-EXPR)
	  (:disjoint-covering)
          (:case-roles)
	  (:partitions :exhaustive-partitions)
	  (:in-partition)
          (:roles)
          ((:properties :predicate))
	  (:annotations)
	  (:inheritance-link)
	  (:inheritance-method :union :nearest-neighbor)
	  SYSTEM-ATTRIBUTES
	  (:identifier) (:context))
	;; the following just contains some additional keywords that are necessary
	(:defreified-relation :concept :relation :from :to)
	))

(setq *loom-keyword-lookup-table*
      '((:constraint  . :implies)
        (:constraints . :implies)
        (:default     . :defaults) 
	(:characteristic . :characteristics)
	(:attribute   . :characteristics)
	(:attributes  . :characteristics)
	(:antecedent  . :antecedents)
	(:disjoint-cover . :disjoint-covering)
;	(:trans-closure  . :transitive-closure)
	(:compose     . :composition)
	(:components  . :composition)
	(:sameas      . :same-as)
	(:sub-set     . :subset)
	(:co-ref      . :coref)
        (:fillers     . :filled-by)
;	(:has         . :filled-by)
;	(:has-list-elements . :filled-by-list)
;	(:has-expression . :filled-by-expression)
	(:the-set     . :one-of)
	(:partition   . :partitions)
	(:exhaustive-partition	  . :exhaustive-partitions)
        (:key         . :keys)
        (:index       . :indices)
        (:indexes     . :indices)
        (:atleast     . :at-least)
        (:atmost      . :at-most)
	(:forsome     . :exists)
        (:for-some    . :exists)
	(:for-all     . :forall)
	(:at          . :at-world-time)
	(:at-time     . :at-world-time)
	(:attime      . :at-world-time)
	(:atworldtime . :at-world-time)
	(:at-         . :at-world-time-)
	(:at-time-    . :at-world-time-)
	(:attime-     . :at-world-time-)
	(:atworldtime-	. :at-world-time-)
	(:at+         . :at-world-time+)
	(:at-time+    . :at-world-time+)
	(:attime+     . :at-world-time+)
	(:atworldtime+	. :at-world-time+)
	(:atagenttime . :at-agent-time)
	(:became      . :becomes)
	(:ceased      . :ceases)
	(:detected    . :detects)
	(:undetected  . :undetects)
	(:un-detects  . :undetects)
	(:un-detected . :undetects)
	(:changed     . :changes)
	(:previous    . :previously)
	))

;(pprint (assoc-list-of *loom-keyword-lookup-table* ))

(initialize-loom-parser)


;;; Top-level entry into the parser

(defun parse-source-definitions (self &key revising-p)
  ;; Initialize the parsing context, using the special variable
  ;;    *parserContextStack*;
  ;; Parse the definition found in the slot "source-definitions"
  ;; Mark as BAD-DEFINITION if the parse was bad;
  (declare (ignore revising-p))  ; tar 6/15/93
 #L:trace-parse (trace-values "parse-concept-definition:" self (source-definitions self)  (attributes self))
  (let ((*parserContextStack* (list *loom-parse-graph*))
	(*conceptBeingParsed* self)
	(context (context self))
	savedContext)
    (declare (special *parserContextStack* *conceptBeingParsed*))
    (integrity-check (and (null (primitive-p self))
			  (not (system-defined-concept-p  self))
			  (null (cdr (source-definitions self)))))
    ;;  parse the definition in "source-definitions"
    (push-parser-context (concept-or-relation self))
    (catch 'parse-concept-definition-catcher
      (let* ((definition (cdar (source-definitions self)))
	     (isDefn (or (getf definition :is)
			 (getf definition :is-primitive))))
	;; reified relations require special handling to create both
	;;    concept and relation:
	(when (and (consp isDefn)
		   (eq (first isDefn) :reification))
	  (setq definition (distribute-reified-relation self)))
	(unwind-protect
	    (progn
	      ;; change context if necessary:
	      (when (and context
			 (neq context *context*))
;; THIS GETS CHECKED EARLIER, AND IS WRONG HERE IS CONTEXT IS SET BY :context  RMM 4/19/93
;		(when (not revising-p)
;		  ;; THIS SHOULD NEVER HAPPEN???
;		  (redefining-in-different-context-error
;		    self context *context* isDefn))
		(setq savedContext *context*)
		(change-context context))
	      ;; do the parse:
	      (parse-source-clauses self definition))
	  (when savedContext
	    (change-context savedContext)))
	(return-from parse-source-definitions self)))	; good parse
    (mark-as-bad-definition self)	; bad parse
    self ))


  ;;
;;;;;; Top-level Expression Parsing
  ;;


(defun parse-source-clauses (self options&arguments &key skip-tbox-definition)
  ;; Parse "options&arguments", converting symbolic concept references into
  ;;    pointers to actual concepts;
  ;; Store definitional, constraint, and default expressions in the slot
  ;;    "parsed-expressions";
  ;; Incorporate other clauses into the appropriate slots within "self";
  ;; "options&arguments" contains a list of alternating keyword options
  ;;     and values;
  ;; If "skip-tbox-definition" then parse only the non-tbox part of the source 
  ;;    definition;
  (let (option argument)
    (when (and (name self)
	       (not (evenp (length options&arguments))))
      (parsing-error "Missing keyword or keyword argument"))
    (loop for tail on options&arguments by #'cddr
	 when (setq argument (cadr tail))
	 do
	 (setq option (validate-keyword (car tail)))
	 (case option
	   ((:is :is-primitive)
	    (unless skip-tbox-definition
	      (parse-top-level-expression self argument :definition)
	      (when (eq option :is-primitive)
		(mark-primitive-concept self :definition))))
	   (:implies
	    (parse-top-level-expression self argument :implies))
	   (:defaults 
	    (parse-top-level-expression self argument :defaults))
	   (:characteristics
	    (unless skip-tbox-definition
	      (loop for a in (list-of argument)
		   do (pushnew (validate-keyword a) (attributes self)))))
	   ((:domain :range)
	    (parse-top-level-expression self `(,option ,argument) :implies))
	   (:domains
	    (parse-top-level-expression
	      self `(:domains ,@(list-of argument)) :implies))
	   (:arity
            ;; relation with arity 1 gets turned into a concept, in which case
            ;;    we avoid setting a non-existent slot
            (unless (typep self 'UNARY-ENTITY)
	      (setf (arity self) argument)))
	   (:antecedents (parse-top-level-expression self argument :antecedents))
	   ((:disjoint-covering :partitions :exhaustive-partitions :in-partition) nil)
	   (:system-characteristics 
	    (setf (system-attributes self)
		  (loop for a in (list-of argument)
		       collect (validate-keyword a))))
	   (:mixin-classes
	    (setf (mixin-classes self) (list-of argument))
	    (pushnew :clos-class (attributes self)))
           (:class-name
            (setf (clos-class-name self) argument))
           (:existing-class-name
            (setf (clos-class-name self) argument)
            (pushnew :existing-class (system-attributes self))
            (when (and (neq argument (name self))
                       (null (auxiliary-lambda-predicate self)))
              (setf (auxiliary-lambda-predicate self)   ; compute membership test
                    `((?self) (typep ?self ',argument)))))
           (:mixin-slots
	    (setf (mixin-slots self) (list-of argument))
	    (pushnew :clos-class (attributes self)))
	   (:annotations (validate-annotations argument)) ;; leave annotations on the source defn
           (:keys
            (setf (keys self)
                  (loop for key in (list-of argument)
                        collect
                        (loop for role in (list-of key)
                              collect
                              (evaluate-symbolic-reference role :relation)))))
           (:indices
            (setf (query-index-roles self)
                  (loop for key in (list-of argument)
                        collect
                        (loop for role in (list-of key)
                              collect
                              (evaluate-symbolic-reference role :relation)))))
	   (:inverse
	    (setf (non-definitional-inverse self) 
		  (initiate-parse-expression argument :relation)))
	   (:function
	    (setf (auxiliary-lambda-function self)
		  (validate-lambda-expression option argument self)))	;
	   (:predicate
	    (setf (auxiliary-lambda-predicate self)
		  (validate-lambda-expression option argument self)))
           ((:roles :properties)
            (parse-role-declarations option (list-of argument) self))
           (:case-roles                 ; REIFIES TAR 6/20/95
            (loop for entry in argument
                  do (parse-one-role-declaration
                       :roles (copy-list (list-of entry)) self)))
           (:reifies                    ; REIFIES  TAR 6/5/95
            nil)
	   (:inheritance-link
	    (setf (inheritance-link self) 
		  (evaluate-symbolic-reference argument :relation)))
	   (:inheritance-method
	    (setf (inheritance-method self) 
		  (validate-keyword argument)))
	   (:identifier nil)			; leave identifier on the source defn
	   (:context nil) ;; already processed by "compute-context-from-source-options"
	   (otherwise
	    (parsing-error "Illegal keyword: ~S" option)))) ))


(defun parse-top-level-expression (self expression option)
  ;; Situation: "expression" defines a concept or relation, or defines
  ;;     constraints or defaults;
  ;; Parse "expression" so that symbolic references have been
  ;;    replaced by pointers to actual concepts;
  ;; Store the result in the slot "parsed-expressions";
  ;; Also, check for the presence of :or or :not subexpressions, and
  ;;    set expressions;
  ;; Establish dependency links;
  (declare (special *uncompletingP*))
  (when (and (eq option :antecedents)
             (consp expression)
             (eq (first expression) :or))
    ;; kludge to avoid breaking on disjunctive antecedent:   RMM 1/25/94
    (loop for antecedent in (rest expression)
          do (parse-top-level-expression self antecedent option))
    (return-from parse-top-level-expression nil))
  (let (algebraicP normalizedExpr parsedExpression)
    ;; transform concept references into objects:
    (multiple-value-setq (parsedExpression algebraicP)
      (initiate-parse-expression expression (concept-or-relation self)))
    ;; Detect primitiveness, and eliminate :primitive from expression,
    ;;    so that it will not be manipulated during normalization  BK 3/7/90
    ;; NOTE: THE :is-primitive OPTION MAKES :primitive OBSOLETE -- THIS
    ;;    ELIMINATION LOGIC SHOULD BE REMOVED WHEN :primitive GOES AWAY;
    (cond
      ((eq parsedExpression :primitive)
       (mark-primitive-concept self option))
      ((and (consp parsedExpression)
	    (eq (first parsedExpression) :and)
	    (member :primitive parsedExpression))
       (mark-primitive-concept self option)
       (setq parsedExpression (remove :primitive parsedExpression))
       (when (null (cddr parsedExpression))
	 (setq parsedExpression (second parsedExpression)))))
    (when (and (neq option :definition)
               (search-tree-list-p '(:predicate :function) parsedExpression))
      (parsing-error
       "Illegal :predicate or :function expression in ~S clause:~%    ~S"
       option expression))
    ;; fill parsed-expressions slot of "self" with appropriate values:
    (record-parsed-expression
      self option
      (if algebraicP
	 ;; Perform syntactic normalization
	 ;; for algebraic expressions containing :OR or :NOT
	 (setq normalizedExpr (normalize-algebraic-expression parsedExpression))
	 parsedExpression)
      :old-expression (case option
			(:definition nil)
			((:implies :defaults) :conjoin)
			(:antecedents :disjoin)
			(otherwise nil)))
    (when (and (eq option :defaults)
	       (not (boundp '*uncompletingP*))   ; Don't warn if UNcompleting!
	       (search-tree-p :not parsedExpression))
      (parsing-warning
       "Negated defaults are not supported.  Negations in~%    ~S~%  will be ignored"
       expression))
    ;; compute depend-on/dependent links:
    (let (*dependOns*)
      (declare (special *dependOns*))
      (collect-depend-ons-in-expression
	(or normalizedExpr parsedExpression))
      (case option
	(:definition
	 (loop for dep in *dependOns*
	      do (add-link depend-ons self dep)))
	(otherwise
	 (loop for dep in *dependOns*
	      do (add-link non-tbox-depend-ons self dep))))) ))

(defun record-parsed-expression (concept option expression &key old-expression)
  ;; Adds an expression defining option "option" to "(parsed-expressions CONCEPT)";
  ;; If "old-expression" is conjoin,
  ;;    then conjoin any existing expression with "expression";
  ;; If "old-expression" is replace,
  ;;    then replace any existing expression with "expression";
  ;; Otherwise, warn if an old property was erased;
  (let ((oldExpr (getf (parsed-expressions concept) option)))
    (when oldExpr
      (case old-expression
	(:conjoin
	 (setq expression (normalize-algebraic-expression
			    `(:and ,oldExpr ,expression))))
	(:replace)
	(:disjoin				; "option" = :antecedents
	 (setq expression (normalize-algebraic-expression
			    `(:or ,oldExpr ,expression))))
	(otherwise
	 (parsing-warning "Setting the property ~S cannot be defined twice"
			  option))))
    (setf (getf (parsed-expressions concept) option) expression)) )

(defun collect-depend-ons-in-expression (expression)
  ;; Helping function for "parse-top-level-expression";
  ;; Situation: "expression" contains embedded concept objects
  ;;    (and possibly embedded :satisfies references)
  ;;    which represent "depend-ons" for the current concept;
  ;; Return a list of all depend-ons, with duplicates removed;
  (declare (special *dependOns*))		
  (cond
    ((listp expression)
     (case (first expression)
       ((:filled-by :not-filled-by)
	(collect-depend-ons-in-expression (second expression)))
       (:satisfies nil)
       (otherwise
	(loop for item in expression
	     do (collect-depend-ons-in-expression item)))))
    ((typep expression 'TBOX-CONCEPT)
     (pushnew expression *dependOns*))) )

(defun mark-primitive-concept (self option)
  ;; Mark "self" as a primitive concept,
  ;; Signal error if "option" is not :definition
  (when (neq option :definition)
    (parsing-error ":primitive mark cannot appear in a constraint or ~%   ~
                           default expression"))
  (setf (primitive-p self) t) )


  ;;
;;;;;; parsing a single expression
  ;;

(defun initiate-parse-expression (expression type)
  ;; Parse "expression" and return two values:
  ;;    (1) An equivalent expression wherein concept references have been
  ;;        replaced by classifiable objects;
  ;;    (2) A flag indicating whether or not one of the keywords
  ;;        :or or :not  occurred inside of "expression";
  ;; Side-effect: Change the CLOS type of *conceptBeingParsed* if necessary to
  ;;    agree with its definition;
  ;; During parsing, validate the syntax of "expression";
  (let (*algebraicP*)
    (declare (special *algebraicP*))
    (push-parser-context type)
    (setq expression (parse-expression expression type))
    (pop-parser-context)
    (values expression *algebraicP*) ))

(defun parse-expression (expression metaType)
  ;; Parse "expression" and return an expression wherein concept references
  ;;    have been replaced by classifiable objects;
  ;; Validate the syntax of "expression", and de-alias keywords;
  ;; Abort parsing if "expression" is found to be illegal;
  (declare (special *conceptBeingParsed*))
  (let (keyword)
    (cond
     ((consp expression)
      (if (quoted-p expression)        ; RMM 3/12/93
        `(:one-of ,expression)         ; quoted constant
        (progn
          (setq keyword (validate-keyword (car expression)
                                          :non-keywords '(= < <= > >= /=)))
          (push-parser-context keyword)
          (setq expression (parse-clause keyword (cdr expression) metaType))
          (pop-parser-context)
          expression)))
     ((keywordp expression)
      (validate-keyword expression))
     ((symbolp expression)			; assumed to be a conjunct
      (evaluate-symbolic-reference expression metaType))
     ((or (typep expression 'TBOX-CONCEPT)
          (typep expression 'FEATURE))          ; RMM 1/28/94
      expression)
     (t					; constant, e.g., integer
      `(:one-of ,expression))) ))

    
  ;;
;;;;;; "parse-clause" and friends
  ;;

(defun parse-clause (keyword arguments metaType)
  ;; Validate the arguments to the option "keyword";
  ;; Return an expression in which all concept references have been
  ;;    replaced by pointers to concept objects;
  (declare (special *algebraicP*))
    (case keyword
      ((:and :or)
       (when (eq keyword :or)
         (setq *algebraicP* t)
         (when (eq metaType :relation)    ; RMM 4/5/93
           (parsing-error
            "Disjunction is supported for concept but not for relations.")))
       (when (null arguments)
	   (parsing-error "Keyword ~S must have at least one argument" keyword))
       `(,keyword
	  ,@(loop for term in arguments
		 collect (parse-expression term metaType))))
      (:not
       (setq *algebraicP* t)
       (when (/= (length arguments) 1)
	   (parsing-error "Wrong number of arguments to :not keyword"))
       `(:not ,(parse-expression (first arguments) metaType)))

      ;; (unary) concept-specific clauses:
      ((:at-least :at-most :exactly)
       (parse-restriction keyword arguments t))
      ((:all :the :some)
       (parse-restriction keyword arguments nil))
      ((:filled-by :not-filled-by)
       (parse-filled-by-restriction keyword arguments))
      
      ;; relation-specific clauses:
      ((:domain :range)
       `(,keyword ,(parse-list-with-one-expression arguments :concept)))
      (:domains
       `(:domains ,@(parse-list-of-expressions arguments :concept)))
      (:inverse					; INVERSES MAY BE REDONE 
       `(:inverse ,(parse-list-with-one-expression arguments :relation)))
      (:satisfies
       (parse-satisfies-feature arguments))
      ((:predicate :function)
       (convert-computed-feature-to-auxiliary-lambda-expression 
        keyword arguments))
      (:composition
       `(:composition ,@(parse-list-of-expressions arguments :relation))) 
      
      ;; set-specific clauses:
      (:through
       (parsing-warning 
	"The keyword :THROUGH is now deprecated.  Use :INTERVAL++ instead.")
       (parse-enumerated-set keyword arguments))
      ((:one-of  :the-ordered-set
	:interval++ :interval+- :interval-+ :interval--)
       (parse-enumerated-set keyword arguments))
      
      ;; other clauses:
      ((:relates :not-relates)
       (parse-relates keyword (first arguments) (rest arguments)))
      ((:same-as :subset)
       (parse-relates
	 :relates
	 (case keyword
	   (:same-as 'same-as)
	   (:subset 'subset))
	 arguments))
      ((:exists :not-exists)
       (parse-exists keyword (first arguments) (rest arguments)))
      (QUOTE
       (when (or (cdr arguments)
		 (not (constant-p (car arguments))))
	 (parsing-error "Illegal quoted expression"))
       (when (symbolp (car arguments))
	 (setq arguments `(',@arguments)))
       (parse-enumerated-set :one-of arguments))
      (otherwise
       ;; must be a comparison
       (integrity-check (not (keywordp keyword)))	; >,<,=, etc.
       (parse-relates :relates keyword arguments))) )

(defun parse-list-of-expressions (references metaType)
  ;; Return a list of parsed references;
  (loop for r in references
       collect (parse-expression r metaType)) )

(defun parse-list-with-one-expression (references metaType)
  ;; Parse reference after checking that there is only one
  (when (cdr references)
      (parsing-error "Too many arguments to the keyword ~S"
		     (find-keyword-in-stack 0)))
  (parse-expression (car references) metaType) )

(defun parse-enumerated-set (keyword arguments)
  ;; Validate "arguments" of a set expression;
  (let (foundInstanceP)
    (declare (ignore foundInstanceP))
    (loop for item in arguments
	 do
	 (cond
;	   ((consp item)       ; RMM 2/11/93
;	    (when (not (eq (car item) 'QUOTE))
;	      (parsing-error "All members of a ~S clause must be atoms" keyword)))
	   ((not (constant-p item))
	    (if (individual-p item)
		t ; (setq foundInstanceP t)
		(parsing-error "Illegal object ~S in a ~S clause" item keyword)))))
    (when (and (member keyword 
		       '(:through :interval++ :interval+- :interval-+ :interval--))
	       (/= (length arguments) 2))
      (parsing-error "The ~S keyword takes exactly two arguments" keyword))
;; THIS APPEARS TO BE A BAD IDEA IN 2.0.  IF THINGS GO BAD, RECONSIDER:  RMM 4/27/92
;    (when foundInstanceP
;      (setq arguments
;	    (loop for item in arguments
;		 collect
;		 (if (constant-p item)
;		     item
;		     (identifier item)))))
    `(,keyword ,@arguments) ))

(defun parse-restriction (keyword arguments numberRestrictionP)
  ;; Verify that "(keyword ,@arguments)" is a legal restriction, and replace
  ;;    concept and relation references by objects;
  ;; "(keyword ,@arguments)" should have the form 
  ;;     "(<keyword> <integer> <relation> [<qualification>])" for number restrictions
  ;;     or "(<keyword> <relation> <concept> [<qualification>])" otherwise;
  ;; Exception:  :SOME restrictions don't take qualifiers.
  (when (or (< (length arguments) 2)
	    (> (length arguments) (if (eq keyword :some) 2 3)))
      (parsing-error "Wrong number of arguments in restriction ~S"
		     `(,keyword ,@arguments)))
  (let ((fourth (third arguments))
	second third)
    (if numberRestrictionP
	(progn
	  (setq second (first arguments))
	  (cond
	    ((member second `(+INFINITY INFINITY))
	     (setq second '+INFINITY))
	    ((or (not (integerp second)) (minusp second))
	     (parsing-error "Expected a non-negative integer instead of ~S in~%   ~
                          the restriction ~S"
			    second `(,keyword ,@arguments))))
	  (setq third (initiate-parse-expression (second arguments) :relation)))
	(progn
	  (setq second (initiate-parse-expression (first arguments) :relation))
	  (setq third (initiate-parse-expression (second arguments) :concept))))
    (if fourth
	`(,keyword ,second ,third
	  ,(initiate-parse-expression fourth :concept))
	`(,keyword ,second ,third)) ))

(defun parse-filled-by-restriction (keyword arguments)
  ;; Verify that "(keyword ,@arguments)" is a legal filled-by restriction;
  ;; "(keyword ,@arguments)" should have the form
  ;; "(<keyword> <relation> <filler1> ...)";
  (let ((second (initiate-parse-expression (first arguments) :relation))
	(fillers (rest arguments)))
    ;; Do this for side effects:
    (loop for f in fillers do (verify-filler f))
    `(,keyword ,second ,@fillers) ))

(defun verify-filler (fillerForm)
  ;; Verify that "fillerForm" is a valid filler argument.  It is valid if
  ;;   it is either a constant, a quoted item, or a cons starting with either
  ;;   :the-list or :the-list*
  (cond ((fundamental-constant-p fillerForm) t)
	((quoted-p fillerForm) t)
	((consp fillerForm) 
	 (case (first fillerForm)
	   ((:the-list :the-list*)
	    (loop for f in (rest fillerForm)
		do (verify-filler f)))
	   ((the-context the-instance)
	    (unless (and (null (cddr fillerForm))
			 (quoted-p (second fillerForm)))
	      (parsing-error
	       "Illegal filler ~S~%    ~S requires a quoted symbol as its only argument"
	       fillerForm (first fillerForm))))
	   (the-relation
	    (unless (and (null (cdddr fillerForm))
			 (quoted-p (second fillerForm))
			 (integerp (third fillerForm)))
	      (parsing-error
	       "Illegal filler ~S~%    ~
                ~S requires a quoted symbol and an arity (integer) as its only arguments"
	       fillerForm (first fillerForm))))
	   ((the-role the-instance-role)
	    (unless (and (null (cdddr fillerForm))
			 (quoted-p (second fillerForm))
			 (quoted-p (third fillerForm)))
	      (parsing-error
	       "Illegal filler ~S~%    ~
                ~S requires two quoted symbols as its only arguments"
	       fillerForm (first fillerForm))))
	   (otherwise (parsing-error
		       "Illegal filler ~S~%    filler must be a constant or (:the-list ...)"
		       fillerForm))))
	(t (parsing-error "Illegal filler ~S~%    filler must be a constant or (:the-list ...)"
			  fillerForm))) )

(defun parse-relates (keyword relationship arguments)
  ;; Substitute relation objects for "relationship" and the role
  ;;    references in "arguments" (except where they represent
  ;;    constant expressions such as :self);
  ;; Verify that the number of arguments matches the arity of "relationship";
  ;; TO DO: ADD CODE FOR :not-relates;
  ;; TO DO: REWRITE TO ALLOW :one-of EXPRESSIONS???;
  (when (null (rest arguments))
    (parsing-error "The relationship ~S has only one role" (name relationship)))
  (let ((roles (loop for role in arguments	  ;; evaluate role-chain references
	             collect
	             (if (or (extended-number-p role) ; numeric or :self constant
		             (eq role :self))
			 role
                         (initiate-parse-expression role :relation)))))
    (setq relationship (initiate-parse-expression relationship :relation))
    (when (and (arity relationship) 
	       (not (eql (length roles) (arity relationship))))
      (parsing-error "Wrong number of arguments to ~S relationship"
		     (name relationship)))
    `(,keyword ,relationship ,@roles) ))


(defun parse-exists (keyword relationship arguments)
  ;; Substitute a concept object for "relationship", and relation objects
  ;;    for the role references within arguments;
  ;; Verify the legality of co-reference keywords;
  (let ((coreferences
	  (loop for coref in arguments
	       collect
	       (let ((keyword (first coref))
		     (caseRole (second coref))
		     (selfRole (third coref)))
		 (when (not (member keyword '(:coref :includes-coref :within-coref)))
		   (parsing-error "Illegal coreference keyword ~S in :exists clause.~%~   ~
                                   Legal keywords are :coref, :includes-coref, :within-coref"
				  keyword))
		 (setq caseRole (initiate-parse-expression caseRole :relation))
		 (setq selfRole (initiate-parse-expression selfRole :relation))
		 `(,keyword ,caseRole ,selfRole)))))
    `(,keyword					; :exists or :not-exists
       ,(initiate-parse-expression relationship :concept)
       ,@coreferences) ))

(defun parse-satisfies-feature (parameters&body)
  ;; Make a few simple syntactic checks before returning :satisfies feature;
  (let ((length (length parameters&body)))
    (cond
      ((> length 2)
       (parsing-error "Too many arguments in :satisfies clause"))
      ((< length 2) 
       (parsing-error "Not enough arguments in :satisfies clause")))
    `(:satisfies ,@parameters&body) ))

(defun convert-computed-feature-to-auxiliary-lambda-expression
       (keyword parameters&body)
  ;; Copy computed feature into an auxiliary lambda slot (unless the slot
  ;;    is already occupied);
  ;; Mark the concept being parsed as primitive, and return the concept
  ;;    at the top of the hierarchy in place of the computed feature;
  (declare (special *conceptBeingParsed*))
  (flet ((too-many-features ()
           (parsing-error 
            "A concept/relation can contain only one ~S expression" keyword))
         (top-level-concept ()
           ;; Note: "top-of-hierarchy" is supposed to work here, but its too
           ;;    early during processing for that to happen;
           (let* ((length  (length (first parameters&body)))
                  (arity (case keyword
                           (:predicate length)
                           (:function (1+ length)))))
             (case arity
               (1 *thing*)
               (2 *binary-tuple*)
               (otherwise (loom-constant N-ARY-TUPLE))))))
    (let* ((self *conceptBeingParsed*)
           (validatedExpression
            (validate-lambda-expression keyword parameters&body self)))
      (mark-primitive-concept self :definition)
      (case keyword
        (:function
         (when (auxiliary-lambda-function self)
           (too-many-features))
         (setf (auxiliary-lambda-function self) validatedExpression))
        (:predicate
         (when (auxiliary-lambda-predicate self)
           (too-many-features))
         (setf (auxiliary-lambda-predicate self) validatedExpression)))
      (top-level-concept) )))

(defun validate-annotations (annotations)
  ;; Verify correct syntax for "annotations";
  ;; Return validated list of annotations or facets;
  (when (not (consp annotations))
    (parsing-error ":annotations or :facets must be a list"))
  (loop for item in annotations
        when (not (or (symbolp item)
		      (and (consp item)
			   (symbolp (car item)))))
        do (parsing-error "Illegal annotation: ~S" item))
  annotations )

(defun validate-lambda-expression (keyword parameters&body self)
  ;; Check number of arguments for auxiliary lambda function or
  ;;    predicate;
  ;; Note: We cannot be sure of the arity of "self" this early in parsing.  The
  ;;    check below eliminates the possibility of using :predicate and
  ;;    :function on n-ary relations.  This should be changed when if descriptions
  ;;    get tightened up in this regard (or when we have time to change it);
  (when (symbolp parameters&body)
    (return-from validate-lambda-expression parameters&body))
  (when (or (not (consp parameters&body))
            (not (listp (first parameters&body))))
    (parsing-error "The argument to a ~S expression should be a list containing
      a parameter list followed by one or more Lisp forms, or the name of a
      Lisp function.  The problematic argument to ~S is
      ~S" keyword keyword parameters&body))
  (when (< (length parameters&body) 2)
    (parsing-error "Not enough parameters to a ~S expression" keyword))
  (let* ((length (length (first parameters&body)))
         (lambdaArity (case keyword (:predicate length) (:function (1+ length))))
	 (arity (or (arity self) 2)))
    (when (not (eql lambdaArity arity))
      (cond
       ((and (eql lambdaArity 1)
             (eql arity 2)
             (not (classified-p self)))
        (coerce-binary-relation-to-unary-relation self))
       ((classified-p self)
        ;; check the number of arguments only if "self" is classified, because
        ;;    early on, n-ary relations are stored in binary objects: 
        (case keyword
          (:predicate
           (parsing-error "Expected ~A parameter~:P in :predicate expression" arity))
          (:function
           (parsing-error "Expected ~A parameter~:P in :function expression" (1- arity)))))))
    parameters&body ))

(defun parse-role-declarations (option roles self)
  ;; Turn singleton role or property declarations into lists, validate attached
  ;;    function declarations, verify that "self" is binary,
  ;;    replace symbolic references by relation objects;
  (when (not (concept-p self))
    (parsing-error "The :roles option applies only to concepts.~%   ~
                    ~S is not a concept" (generate-external-reference self)))
  (let ((roleEntries (loop for entry in roles
                           collect 
                           (parse-one-role-declaration
                            option (copy-list (list-of entry)) self))))
    (ecase option
      (:roles (setf (role-cache self) roleEntries))
      (:properties (setf (characteristics self) roleEntries))) ))

(defun make-undefined-roles-single-valued-p ()
  (member :make-roles-single-valued *loom-features*) )

(defun parse-one-role-declaration (option roleEntry self)
  ;; Check "roleEntry" for errors, and return a specification where a relation
  ;;    object is substituted for the relation name, and keywords
  ;;    have been dealiased;
  ;; Note: We destructively modify "roleEntry";
  (let ((legalCharacteristics '(:virtual))
        (relation (evaluate-symbolic-reference 
                   (first roleEntry)
                   (ecase option
                     (:roles :relation)
                     (:properties :property)))))
    ;; allow the referenced relation to be classified:
    (delf (attributes relation) :undefined)
    (pushnew :referenced-by-role (system-attributes relation))
    ;; BURSTEIN SAYS NO, BUT I AM CHOOSING TO OVERRIDE   RMM 5/16/95
    ;;    ALSO: see below under :function
    ;; by default, a role-introduced relation is single-valued:
    (when (and (member :system-defined (attributes relation))
               (not (member :multiple-valued (attributes relation)))
               (make-undefined-roles-single-valued-p))
      (pushnew :single-valued (attributes relation)))
    ;; validate the role definition
    (setf (first roleEntry) relation)
    (setf (rest roleEntry)
          (loop for tail on (rest roleEntry) by #'cddr
               as keyword = (first tail)
               as value = (second tail)
               append
               `(,keyword
                 ,(case keyword
                    ((:min :max :type :value)
                     (parse-top-level-expression
                      self
                      (case keyword
                        (:min `(:at-least ,value ,(name relation)))
                        (:max `(:at-most ,value ,(name relation)))
                        (:type `(:all ,(name relation) ,value))
                        (:value `(:filled-by ,(name relation) ,value)))
                      :implies)
                     value)
                    (:default
                      (parse-top-level-expression
                      self `(:filled-by ,(name relation) ,value) :defaults))
                    ((:function :predicate)
                     (when (null value)
                       (parsing-error "Illegal ~S specification in :roles declaration"
                                      keyword))
                     (validate-lambda-expression keyword value relation)
		     (pushnew :read-only (attributes relation)) ; TAR 10/27/93
		     ;; By default, this will mean the role is single-valued;
		     (pushnew :role-with-method (system-attributes relation))
                     value)
                    (:facets            ; leave annotations on the source defn
                     (validate-annotations value))
                    (:characteristics
                     (loop for p in (list-of value)
                          collect
                          (progn
                            (setq p (validate-keyword p))
                            (when (not (member p legalCharacteristics))
                              (parsing-error "Illegal role characteristic ~S.  Legal characteristics for~%   ~
                                              roles are: ~S" p legalCharacteristics))
                            p)))
                    (otherwise
                     (parsing-error "Illegal keyword ~S in :roles declaration"
                                    keyword))))))
    roleEntry ))


  ;;
;;;;;; Incorporation functions
  ;;

;;; These functions interpret an already-parsed expression, and fill
;;;    in the parameter "self" with the appropriate values, i.e., they
;;;    fill in specific concept slots.  They are the first step of the
;;;    conditioning phase.

(defun incorporate-parsed-expressions (self &key context)
  ;; Incorporate expressions representing the definition, constraints,
  ;;    and defaults for "self";
  ;; If "self" has no definition, mark it as primitive;
  (if context
      (let ((expression (getf (parsed-expressions self) context)))
	(when expression
	  ;; KLUDGE FOR "defset":
;	  (when (member :base-set (attributes self))
;	    (setf expression
;		  `(:and ,(loom-constant CONSTANT) ,expression)))
	  (incorporate-expression self expression :context context)))
      (loop for tail on (parsed-expressions self) by #'cddr
	   do
	   (setq context (first tail))
	   (let ((expression (second tail)))
	     (case context
	       (:antecedents
		(incorporate-antecedents-expression self expression))
	       (otherwise
		(incorporate-expression self expression :context context))))))
  (when (not (getf (parsed-expressions self) :definition))
    (setf (primitive-p self) t)
    (setf (getf (parsed-expressions self) :definition) :primitive)) )

(defun incorporate-non-tbox-expressions (concept)
  ;; Called by "complete-one-concept";
  ;; Incorporate constraints, attributes, defaults, etc.;
  (cond
    ((loop for dep in (non-tbox-depend-ons concept)
	   always (classified-p dep))
     (loop for tail on (parsed-expressions concept) by #'cddr
	   do
	  (let ((context (first tail))
		(expression (second tail)))
	    (case context
	      (:definition nil)			; definition is already incorporated
	      (:antecedents
	       (incorporate-antecedents-expression concept expression))
	      (otherwise
	       (incorporate-expression concept expression :context context)))))
     (delf (system-attributes concept) :non-tbox-unincorporated))
    (t
     (warn "~&incorporate-non-tbox-expressions (~s): some expression not classified.~%"
	   concept)
     (pushnew :non-tbox-unincorporated (system-attributes concept)))) )

(defun incorporate-expression
       (self expression &key (context :definition) conjunct-p)
  ;; Make "expression" (part of) the definition for the concept or relation "self";
  ;; "expression" is the keyword :primitive, a concept, or a list of the form
  ;;    "(<keyword> <arguments>)";
  ;; "conjunct-p" indicates that we have called "incorporate-expression"
  ;;    recursively, that "self" is defined as a conjunction, and that embedded
  ;;    :or or :not operators have to generate sub-concepts;
  #L:trace-parse (trace-values "incorporate-expression" self expression context conjunct-p)
  (cond
    ((keywordp expression)
     (ecase expression
       ((:primitive)
	(when (neq context :definition)
	    (conditioning-error ":primitive mark cannot appear in a constraint or ~%   ~
                           default expression"))
	(setf (primitive-p self) t))))
    ((atom expression)
     (incorporate-conjunct self expression context))
    (t ;; "expression" is a list
     (case (first expression)
       (:and
	(incorporate-anded-expression self expression context))
       (:or				; TAR 6/17/96
        (cond
         ((set-expression-p expression :non-primitive-concepts-only-p t)
          ;; disjunctive set expressions get incorporated without evaluation:
          (incorporate-feature self expression context))
         ((or conjunct-p
              (neq context :definition)
              (primitive-p self))
          (incorporate-conjunct
           self
           (evaluate-expression expression (concept-or-relation self))
           context))
         (t
          ;; TO DO:  FIND A WAY TO INCORPORATE NON-PRIMITIVE SETS INTO
          ;;         THIS AS WELL!
          (incorporate-disjunction self expression nil)
          (when (set-expression-p expression :non-primitive-concepts-only-p NIL)
            (incorporate-feature self expression context)))))
       (:not
        (cond
         ((set-expression-p expression)
          ;; complemented set expressions get incorporated without evaluation:
          (incorporate-feature self expression context))
         ((or (neq context :definition)
              (primitive-p self))
          (incorporate-conjunct
           self
           (evaluate-expression expression (concept-or-relation self))
           context))
         (t
          (incorporate-negation self expression))))
       ((:inverse :composition)
	(if (or conjunct-p (neq context :definition)
		(primitive-p self))
	    (incorporate-expression
	      self
	      (evaluate-expression expression :relation)
	      :context context) 
	    (incorporate-defined-as-relation self expression)))
       (otherwise  ;; must be a feature
	(incorporate-feature self expression context))))) )

(defun incorporate-anded-expression (self expression context)
  ;; Situation: "expression" is a conjunction that may contain embedded 
  ;;    disjunctions;
  ;; When this is the case, collect all conjunctively inherited primitive
  ;;    concepts in the expression, and produce disjunctions that
  ;;    inherit these primitive concepts;
  ;; For the case of definitional expressions with all primitive conjuncts and
  ;;    a single disjunction, e.g., (:and A B (:or C D)), the
  ;;    terms are incorporated into "self"; otherwise, separate concepts
  ;;    are generated and those are conjoined with "self";
  (if (or (loop for term in (rest expression)
	        never (and (consp term)
			   (eq (first term) :or)))
	  (set-expression-p expression :non-primitive-concepts-only-p t)       ;  TAR 6/14/96
	  (null (cddr expression)))		; singleton :and
    (loop for term in (rest expression)
          do (incorporate-expression
              self term :context context :conjunct-p t))
    (progn
      (multiple-value-bind (primitiveConjuncts orClauses otherClauses)
	                   (extract-primitive-conjuncts expression)
        (if (and orClauses
                 (null (rest orClauses))
                 (null otherClauses)
                 (eq context :definition))
          ;; single "or" conjoined with only primitive concepts:
          (incorporate-disjunction self (first orClauses) primitiveConjuncts)
          (progn
            (loop for term in primitiveConjuncts
                  do (incorporate-conjunct self term context))
            (loop for term in otherClauses
                  do (incorporate-expression self term :context context :conjunct-p t))
            (loop for term in orClauses
                  do (incorporate-conjunct
                      self
                      (evaluate-expression
                       `(:and ,@primitiveConjuncts ,term) (concept-or-relation self))
                      context))))))) )

(defun extract-primitive-conjuncts (expression)
  ;; Specialized helping function for "incorporate-anded-expression";
  ;; Situation: "expression" is a conjunction that may be arbitrarily
  ;;    complex;
  ;; Extract the primitive conjuncts implicit in "expression" and partition
  ;;    the conjuncts into three classes --
  ;; Return three values:
  ;;    (1) A list of primitive concepts;
  ;;    (2) A list of disjunctive or negated clauses;
  ;;    (3) A list of other clauses (the residue);
  (let (primitiveConjuncts orClauses otherClauses)
    (loop for arg in (rest expression)
	 do
	 (cond
	   ((consp arg)
	    (case (first arg)
	      (:or (push arg orClauses))
	      (otherwise (push arg otherClauses)))) 
	   ((primitive-p arg) ;; "arg" is a primitive concept or relation:
	    (pushnew arg primitiveConjuncts))
	   (t                    ;; "arg" is a non-primitive concept or relation:
	    (loop for pc in (primitive-concepts arg)
		 do (pushnew pc primitiveConjuncts))
	    (push arg otherClauses))))
    (values primitiveConjuncts orClauses otherClauses) ))

(defun incorporate-conjunct (self expression context)
  ;; "expression" is an atomic term that is to be conjoined to "self"
  ;;    (or implied if "context" is other than :definition);
  ;; Incorporate "expression" into the appropriate slot;
  (when (and (neq context :definition)
	     (typep self 'TBOX-RELATION))
    (case context
      (:implies
       (conditioning-error "Constraints on relations cannot include other relations~%   ~
                            Use the 'implies' construct instead"))
      (:defaults
        (conditioning-error "Defaults cannot be specified for relations"))))
  (ecase context
    (:definition
      (typecase expression              ; RMM 1/28/94
	;; Made next line more specific.  Added Error case.  ; TAR 6/7/99
        (COMPUTED-FEATURE (pushnew expression (computed-features self)))
	(FEATURE (break "Bug? (INCORPORATE-CONJUNCT ~S ~S ~S)" self expression context))
        (otherwise
         (pushnew expression (conjuncts self)))))
    (:implies
       (pushnew expression (consequents self))
       ;; add inverse slot link:
       (pushnew self (antecedents expression)))
    (:defaults
      (pushnew expression (default-concepts self)))) )

(defun incorporate-disjunction (self orExpression primitiveConjuncts)
  ;; Situation: "orExpression" is a disjunction that defines "self";
  ;;    "primitiveConjuncts" lists concepts that "self" specializes;
  ;; Incorporate the disjunction definition into "self";
  ;; The primitive component(s) of the relative conjuncts get anded into
  ;;    each of the disjuncts of a disjunction;
  (let ((disjunctionP (eq (first orExpression) :or))
	relativeConjunct arguments)
    (setq relativeConjunct 
	  (touch-conjunction-concept 
           (most-specific-conjuncts
            (most-specific-concepts primitiveConjuncts))))
    ;; recursively evaluate each argument, conjoining in the relative 
    ;;   conjunct in the case of a disjunction:
    (setq arguments
	  (loop for arg in (rest orExpression)
	        collect (evaluate-expression
                         (if disjunctionP
                           `(:and ,arg ,relativeConjunct)
                           arg)
                         (concept-or-relation self)
                         :disjunct-p disjunctionP)))
    (setf (defined-as self) :disjunction)
    (setf (disjuncts self) arguments)) )

(defun incorporate-negation (self notExpression)
  ;; Incorporate the negation definition "notExpression" into "self";
  (pushnew (evaluate-expression 
            (second notExpression) (concept-or-relation self))
           (negated-concepts self)) )

(defun set-expression-p (expression &key non-primitive-concepts-only-p)
  ;; Helping function for "incorporate-expression";
  ;; Return t iff "expression" represents a set expression;
  ;;   If "non-primitive-concepts-only-p", return T only if there is
  ;;   no primitiveness beyond that in the base type of the set.
  (if (consp expression)
      (case (car expression)
	((:and :or :not)
	 (loop for term in (cdr expression)
	      always (set-expression-p term 
                                       :non-primitive-concepts-only-p
                                       non-primitive-concepts-only-p)))
	((:one-of :through :interval++ :interval+- :interval-+ :interval--
	  :the-ordered-set QUOTE) t)	; RMM 3/12/93
	(otherwise nil))
      (typecase expression
	(UNARY-CONCEPT
         (and (or (subconcept-p expression (loom-constant CONSTANT))
                  (eq (defined-as expression) :set))
              (or (not non-primitive-concepts-only-p)   ;  TAR 6/14/96
                  (loop with setBaseConcept 
                        = (defining-concept
                            (base-set (defined-set-feature expression)))
                        for c in (primitive-concepts expression)
                        always (subconcept-p setBaseConcept c)))))
	(NUMBER t)
	(STRING t)
	(otherwise nil))) )
     
(defmethod incorporate-feature ((self UNARY-ENTITY) oldFeature context)
  ;; Possibly transform "oldFeature", and then add it to "self" as
  ;;    determined by "context";
  (flet ((evaluate-instance-refs-in-feature (oldFeature)
	   ;; kludge to detect coersion when instances must be quoted:
	   (if (loop for c in (conjuncts self)
		   thereis (subconcept-p c (loom-constant CONSTANT)))
	       (let ((*domainOfInstances* (loom-constant CONSTANT)))
		 (declare (special *domainOfInstances*))
		 (evaluate-instance-references-in-set-expression oldFeature))
	     (evaluate-instance-references-in-set-expression oldFeature)))
	 (term-or-conjunction-of-terms (newDomain oldDomains)
	   (cond
            ((null oldDomains)
             newDomain)
            ((atom oldDomains)
             (if (eq oldDomains *thing*) newDomain `(:and ,newDomain ,oldDomains)))
	    ((eq (first oldDomains) :and)
	     `(:and ,newDomain ,@(rest oldDomains)))
            (t ;; "oldDomains" is an :and'ed list of domains
	     `(:and ,newDomain ,oldDomains)))) )
  (let (newFeature)
    (case (first oldFeature)
      ((:relates :not-relates)
       (setq newFeature (evaluate-comparison-subexpressions oldFeature self context))
       (ecase context
	 (:definition
	  (addf (comparisons self) newFeature))
	 (:implies
	  (addf (implied-comparisons self) newFeature))
	 (:defaults
	     (addf (default-features self) newFeature))))
      ((:exists :not-exists)
       (setq newFeature (evaluate-comparison-subexpressions oldFeature self context))
       (ecase context
	 (:definition
	  (addf (comparisons self) newFeature))
	 (:implies
	  (addf (implied-comparisons self) newFeature))
	 (:defaults
	  (addf (default-features self) newFeature))))
      ((:satisfies :predicate)
       (setq newFeature oldFeature)
       (ecase context
	 (:definition
	  (addf (computed-features self) newFeature))
	 (:implies
	  (addf (implied-computed-features self) newFeature))))
      (:function
       (conditioning-error "Concept expression may not contain :function clause~%   ~
                            Use a set expression instead"))
      ((:one-of :through :interval++ :interval+- :interval-+ :interval-- :or :not)
       (setq newFeature (evaluate-instance-refs-in-feature oldFeature))
       (ecase context
	 (:definition
	  (push newFeature (defined-set-feature self)))
	 (:implies
	  (push newFeature (implied-set-feature self)))))
      (:the-ordered-set
       (setq newFeature (evaluate-instance-refs-in-feature oldFeature))
       (setq newFeature `(:one-of ,@(cdr newFeature)))
       (ecase context 
	 (:definition
	  (pushnew :ordered (attributes self))
          (pushnew :base-set (attributes self))         ; RMM 4/5/93
	  (push newFeature (defined-set-feature self)))
	 (:implies
	  (parsing-warning 
	    "Changing keyword :the-ordered-set to :one-of because~%   ~
                the :the-ordered-set keyword can only appear within a definition")
	  (push newFeature (implied-set-feature self)))))
      (:domain                          ; "self" is a property
       (when (rest (rest oldFeature))
         (conditioning-error "A :domain clause can have only one argument"))
       (when (concept-p self)
         (conditioning-error "A concept cannot have a :domain clause"))
       (case context
	 (:definition			; TAR 7/6/99
	     (setf (defined-domain self) 
	       (term-or-conjunction-of-terms (second oldFeature)
					     (defined-domain self))))
	 (:implies 
	  (setf (implied-domain self) 
	    (term-or-conjunction-of-terms (second oldFeature)
					  (defined-domain self))))))
      (t  ;; "feature" is a restriction
       (setq newFeature (evaluate-restriction-subexpressions oldFeature self context))
       (ecase context
	 (:definition
	  (addf (restrictions self) newFeature))
	 (:implies
	  (addf (implied-restrictions self) newFeature))
	 (:defaults                                   
	  (addf (default-features self) newFeature))
	 ))) )))

(defmethod incorporate-feature ((self TBOX-RELATION) feature context)
  ;; Add the feature "feature" to "self" as determined by "context";
  ;; Caution: We DON'T evaluate any concept references since the proper
  ;;    context for such evaluations occurs during domain and range
  ;;    conditioning;
  (flet ((term-or-conjunction-of-terms (newDomain oldDomains)
	   (cond
            ((null oldDomains)
             newDomain)
            ((atom oldDomains)
             (if (eq oldDomains *thing*) newDomain `(:and ,newDomain ,oldDomains)))
	    ((eq (first oldDomains) :and)
	     `(:and ,newDomain ,@(rest oldDomains)))
            (t ;; "oldDomains" is an :and'ed list of domains
	     `(:and ,newDomain ,oldDomains)))))
    (let* ((keyword (first feature))
           (arguments (rest feature)))
      (case keyword
	((:satisfies :predicate :function)
	 (ecase context
	   (:definition
	     (addf (computed-features self) feature))
	   (:implies
	    (addf (implied-computed-features self) feature))))
	(:range
         (when (rest arguments)
           (conditioning-error "A :range clause can have only one argument"))
         (case context
           (:definition
             (setf (defined-range self)
                   (term-or-conjunction-of-terms (first arguments) (defined-range self))))
           (:implies
            (setf (implied-range self)
                  (term-or-conjunction-of-terms (first arguments) (implied-range self))))))
        ((:domain :domains)
         (case context
           (:definition
             ;; can't tell arity yet, so can't tell  whether one or several arguments is legal: 
             (setf (defined-domain self) 
                   (if (cdr arguments)
                     arguments		; <== BUG HERE;
                     (term-or-conjunction-of-terms (first arguments) (defined-domain self)))))
           (:implies
            (cond
             ((binary-p self)
              (when (cdr arguments)
                (conditioning-error
                 "Can't assign multiple domains to a binary relation"))
              (setf (implied-domain self) 
                    (term-or-conjunction-of-terms (first arguments) (implied-domain self))))
             (t				; n-ary relation
              (setf (implied-domain self) arguments))))))
        (otherwise
         (grumble "Illegal keyword constructor ~S in description of relation ~S"
                  (if (eq keyword :relates) (first arguments) keyword)
                  (name self)))) )))


(defun incorporate-defined-as-relation (self expression)
  ;; Situation: "expression" defines a relation, and has the keyword
  ;;    :inverse, or :composition;
  ;; Fill in "self" with the appropriate values;
  (ecase (first expression)
    (:inverse
     (setf (defined-as self) :inverse)
     (setf (inverse self) (evaluate-expression (cadr expression) :relation)))
    (:composition
     (setf (defined-as self) :composition)
     (setf (components self)
	   (loop for expr in (cdr expression)
		collect (evaluate-expression expr :relation))))) )

(defun incorporate-antecedents-expression (relation expression)
  ;; Situation: "expression" defines a computed feature or relation
  ;;    that implies "relation";
  ;; Generate a computed feature or relation representing "expression", and
  ;;    add it to "(antecedents relation)";
  ;; Push each new antecedent onto the END of the list, so that the
  ;;    original order of definitions will be preserved;
  (cond
    ((or (atom expression)
	 (member (first expression) '(:satisfies :predicate :function))) 
     (push-last expression (antecedents relation)))
    ((eq (first expression) :or)
     (loop for disjunct in (cdr expression)
	  do (incorporate-antecedents-expression relation disjunct)))
    (t
     (push-last
       (evaluate-expression expression :relation)
       (antecedents relation)))) )

(defun evaluate-instance-references-in-set-expression (expression)
  ;; Helping function for "incorporate-feature" and 
  ;;    "evaluate-restriction-subexpressions";
  ;; Replace unquoted symbols by instances inside of :one-of expressions:
  ;; If "domain" specializes CONSTANT, don't coerce symbols to instances,
  ;;    but generate a warning message;
  (cond
    ((atom expression) expression)
    ((member (first expression) '(:one-of :through :interval++ :interval+-
				  :interval-+ :interval-- :the-ordered-set))
     `(,(first expression) ,@(evaluate-instance-references (rest expression))))
    (t
     (loop for term in expression
	  collect (evaluate-instance-references-in-set-expression term)))) )

(defun evaluate-instance-references (instanceReferences)
  ;; Helping function for "evaluate-instance-references-in-set-expression";
  ;; Return a list for which symbolic references to instances have
  ;;    been replaced by instance objects;
  ;; If *domainOfInstances* specializes CONSTANT, don't coerce symbols to instances,
  ;;    but generate a warning message;
  ;; Note: *domainOfInstances* is bound inside of "evaluate-restriction-subexpressions";
  (declare (special *domainOfInstances*))
  (let ((constantP (and (boundp '*domainOfInstances*)
			(subconcept-p *domainOfInstances* (loom-constant CONSTANT))))
	instance)
    (labels ((find-or-create-system-defined-instance (name)
	       (or (get-instance name)
		   (get-concept name :no-error-p t)
		   (get-relation name :no-error-p t)
		   (if (extended-identifier-p name)
		       (parsing-error "Can't find set member named ~S" name)
		     (let ((i (create-instance name nil *context* nil)))
		       (mark-instance-as-system-defined i t)
		       i))))
	     (evaluate-instance-reference (ref)
	       (cond
		((quoted-p ref) (second ref))
		((keywordp ref) ref)
		((symbolp ref)
		 ;; TRANSPOSED FIRST TWO CLAUSES TO PREVENT WARNING ABOUT "+INFINITY"
		 ;;    WHEN PARSING SYSTEM-GENERATED SET EXPRESSIONS  ; DGB 3/25/92
		 (cond ((member ref '(+INFINITY -INFINITY))
			ref)
		       (constantP
			(conditioning-warning 
			 "Coercing unquoted symbol ~S to a quoted symbol" ref)
			ref)
		       (t
			(setq instance (find-or-create-system-defined-instance ref))
		       ;; insure that the reference instance can't be deleted:
		       ;; NOW THAT CONSTANTS CAN BE LITE-INSTANCES, WE NEED AN
		       ;;    ALTERNATIVE MEANS FOR MARKING THIS:
;	       (pushnew :tbox-constant (db-attributes instance))
			instance)))
		((consp ref)
		 (case (first ref)
		   (:the-list (evaluate-instance-references (rest ref)))  ;; Returns a list.
		   (:the-list* (apply #'list* (evaluate-instance-references (rest ref))))
		   ((the-instance the-relation the-context)
		    (let ((name (second ref))
			  arity)
		      (if (quoted-p name)
			  (setq name (second name))
			(conditioning-warning
			 "Coercing unquoted name ~S to a quoted name in ~S"
			 (second ref) ref))
		      (ecase (first ref)
			(the-instance
			 (evaluate-instance-reference name))
			(the-context
			 (or (get-context name)
			     (define-context name :theory nil)))
			(the-relation
			 (setq arity (third ref))
			 (when (null arity)
			   (conditioning-error "~S form requires a third arity argument"
					       ref))
			 (if (eql arity 1)
			     (or (get-concept name :no-error-p t)
				 (define-concept name :characteristics :system-defined))
			   (or (get-relation name :no-error-p t)
			       (define-relation name :arity arity
						:characteristics :system-defined))))) ))
		   (otherwise
		    (conditioning-warning
		       "Coercing unquoted list ~S to a quoted list" ref)
		      ref)))
		(t ref)) ))
      (loop for ref in instanceReferences
	  collect (evaluate-instance-reference ref)) )))
	 


  ;;
;;;;;; Feature Evaluation functions
  ;;

;;; These functions evaluate an expression and return new feature whose
;;;    subexpressions have been evaluated;

(defun evaluate-restriction-subexpressions (expression definingConcept context)
  ;; Return a source restriction for which references to the relation
  ;;    and to instances have been evaluated;
  ;; If a new relation is generated, link it in as a depend-on of
  ;;    "definingConcept";
  ;; Caution: We DON'T evaluate any concept references, since the
  ;;    proper context for such evaluations occurs as late as possible
  ;;    during restriction conditioning;
  (let ((first (first expression))
	(second (second expression))
	(third (third expression))
	(tail (cdddr expression))
	evaluatedRelation)
    (ecase first
      ((:at-least :at-most :exactly)
       (when (consp third)
	 (setq evaluatedRelation (evaluate-expression third :relation))
	 (setq third evaluatedRelation)))
      ((:all :the :some)
       (when (consp second)
	 (setq evaluatedRelation (evaluate-expression second :relation))
	 (setq second evaluatedRelation))
       ;; evaluate instances in :one-of expressions:
       (when (consp third)
         (if (search-tree-list-p
	      '(:one-of :through :interval++ :interval+- :interval-+ :interval--)
	      third)
           ;; Overly tricky: avoid generating concept for nested :one-of
           ;;    or :interval:
	   (let ((*domainOfInstances*
                  (or (non-forcing-compute-range-of-relation second) ; RMM 2/8/93
                      (loom-constant THING))))
	     (declare (special *domainOfInstances*))
	     (setq third (evaluate-instance-references-in-set-expression third)))
           (progn             ; RMM 11/14/94
             (setq evaluatedRelation (evaluate-expression third :concept))
             (setq third evaluatedRelation)))))
      ((:filled-by :not-filled-by)
       (when (consp second)
	 (setq evaluatedRelation (evaluate-expression second :relation))
	 (setq second evaluatedRelation))
       ;; evaluate instance fillers:
       (let ((*domainOfInstances*
	      (or (non-forcing-compute-range-of-relation second) ; DGB 9/2/93
                    (loom-constant THING)))
	     fillers)
	 (declare (special *domainOfInstances*))
	 (when third				; avoid null list of fillers
	   (setq fillers (evaluate-instance-references (cons third tail)))
	   (setq third (first fillers))
	   (setq tail (rest fillers))))))
    (when evaluatedRelation
      (case context
	(:definition
	 (add-link depend-ons definingConcept evaluatedRelation))
	(otherwise
	 (add-link non-tbox-depend-ons definingConcept evaluatedRelation))))
    (cond
     ((null third)
      `(,first ,second))
     (tail
      `(,first ,second ,third ,@tail))
     (t
      `(,first ,second ,third))) ))

(defun evaluate-comparison-subexpressions (expression definingConcept context)
  ;; Return a source comparison for which the references to
  ;;    relations representing role-chain components have been evaluated;
  ;; If new relations are generated, link them in as depend-ons of
  ;;    "definingConcept";
  (flet ((evaluate-role-expression
	   (roleExpression)
	   (cond
	    ((eq roleExpression :self) 'identity)
	    ((atom roleExpression) roleExpression)
	    ((member (first roleExpression) '(:the-constant :one-of))
	     (error ":the-constant and :one-of not yet implemented ~
                          for comparisons"))
	    (t
	     (let ((relation (evaluate-expression roleExpression :relation)))
	       (case context
		 (:definition
		     (add-link depend-ons definingConcept relation))
		 (otherwise
		  (add-link non-tbox-depend-ons definingConcept relation)))
	       relation)))))
  (ecase (first expression)
    ((:relates :not-relates)
     (let ((roles (loop for role in (cddr expression)
		        collect (evaluate-role-expression role))))
       `(,(first expression) ,(second expression) ,@roles)))
    ((:exists :not-exists)
     (let ((coreferences
	     (loop for coref in (cddr expression) 
		  collect
		  (if (or (consp (second coref))
			  (consp (third coref)))
		      `(,(first coref)
			,(evaluate-role-expression (second coref))
			,(evaluate-role-expression (third coref)))
		      coref))))
       `(,(first expression) ,(second expression) ,@coreferences)))) ))

;;; Implementation note:  Symbols which appear inside of a value restriction
;;;    on a relation whose range is a set do not get evaluated at parse
;;;    time, i.e., they don't get turned into system-defined concepts.  Instead,
;;;    they are evaluated when the concept is conditioned.  This is safe (as
;;;    regards maintenance of dependency pointers) because no cycles are possible
;;;    (because the set can't point back at a concept), and because there is
;;;    a direct or indirect dependency between the concept being parsed and the
;;;    base set of the set which is the range of the restricted relation.
;;; The above behavior is designed to reduce frequency of generation of
;;;    system-defined concepts which later turn out to be references to members
;;;    of base-sets.  


  ;;
;;;;;; "evaluate-expression" and friends
  ;;

(defun evaluate-expression (expression type &key disjunct-p)
  ;; Return a concept or relation (indicated by "type") defined by
  ;;    "expression";
  ;; "type" belongs to '(:concept :relation);
  ;; TO DO: TRY TO AVOID REPARSING ALREADY-PARSED EXPRESSIONS;
  (declare (special *conceptBeingConditioned*))
  (cond
    ((symbolp expression)
     (evaluate-symbolic-reference expression type))
    ((atom expression)                  ; literal or object blows through
     expression)
    ((let ((conjuncts (rest expression)))       ; RMM 6/24/94
       (and (eq (first expression) :and)
            (member *thing* conjuncts)
            (= (length conjuncts) 2)
            (evaluate-expression 
             (if (eq (second conjuncts) *thing*)
               (first conjuncts)
               (second conjuncts))
             type))))
    (t
 #L:trace-parse (trace-values "evaluate-expression" expression type)
     (let* ((newConcept (create-concept nil type nil))
	    (*parserContextStack* (list *loom-parse-graph*))
	    (*conceptBeingParsed*
	      (if (boundp '*conceptBeingConditioned*)
		  *conceptBeingConditioned*
		  newConcept)))
       (declare (special *parserContextStack* *conceptBeingParsed*))
       (parse-top-level-expression newConcept expression :definition)
       (setf (attributes newConcept) '(:system-defined))
       (setf (system-attributes newConcept) '(:definition-only))
       (when disjunct-p
	 (push :disjunct (system-attributes newConcept)))
       ;; Need to fill in "(source-definitions newConcept)"
       ;;    pin case it gets revised during classification
       (setq newConcept (condition&classify-subgraph newConcept))
       (integrity-check (classified-p newConcept))
       (post-uncompleted-concept newConcept)
       newConcept))) )

(defun evaluate-symbolic-reference (reference type &key specialize-this-concept)
  ;; Evaluate "reference" and check that the result matches the type
  ;;    specified by "type";
  ;; An ordinary symbol is interpreted as some type of Loom concept --
  ;;    a search is made for a concept matching that name;  if the
  ;;    search fails, a concept of the appropriate type is created;
  (declare (special *conceptBeingParsed*))
  (let (object)
    (cond
     ((null reference)
      (parsing-error "Illegal expression NIL"))
     ;; insure that reference is a symbol:
     ((not (symbolp reference))
      (parsing-error "Illegal expression ~S where symbol expected" reference))
     ;; Find existing object matching "reference"
     ((ecase type
	(:concept (get-concept reference :no-error-p t))
	(:relation (get-relation reference :no-error-p t))))
     ((extended-identifier-p reference)
      (parsing-error "Can't find concept named ~S" reference))
     ((setq object (find-concept-or-relation-in-context-sublattice reference
								   type
								   *context*))
      (cerror "Continue using reference to ~:(~A~) ~S in context ~S."
	      "There is no ~:(~A~) ~S visible in context ~A,~%~
               but there is one in lower context ~S.~%~
               Error occurred in the definition:~%   ~S~%"
	      type reference *context* (context object) 
	      (generate-source-definition *conceptBeingParsed*)
	      type reference (context object))
      object)
      ;; or create a new one
      (t
       ;; create a new undefined concept or relation
       (touch-undefined-concept
	reference type :specialize-this-concept specialize-this-concept))) ))

(defun eval-list-of-expressions (references type)
  ;; Return a list of evaluated references;
  (loop for r in references
       collect (evaluate-expression r type)) )

(defun eval-list-with-one-expression (references type)
  ;; Evaluate reference after checking that there is only one
  (when (/= (length references) 1)
      (conditioning-error "Too many arguments to the keyword ~S"
		   (find-keyword-in-stack 0)))
  (evaluate-expression (first references) type) )


  ;;
;;;;;; "parse-covering-references" and "parse-partition-expression"
  ;;


(defun parse-covering-references (references concept)
  ;; Return a list of concepts or relations (depending on the
  ;;    type of "concept");
  ;; If they are system-defined, they must specialize "concept";
  ;;    This is accomplished by communicating with
  ;;    "touch-undefined-concept" via the keyword parameter
  ;;    ":specialize-this-concept";
  (loop for r in references
       collect
       (evaluate-symbolic-reference r (concept-or-relation concept)
		       :specialize-this-concept concept)) )

(defun parse-partition-expression (concept partitionExpr)
  ;; Return a normalized expression of the form ((<part> <mem>*)+)
  ;;    where <part> is a partition name and <mem> is the name of a
  ;;    partition member;
  ;; If a member is system-defined, it must specialize "concept"; this
  ;;    is accomplished by communicating with "touch-undefined-concept" 
  ;;    via the keyword parameter ":specialize-this-concept";
  (let ((*conceptBeingParsed* concept))
    (declare (special *conceptBeingParsed*))
    (setq partitionExpr (list-of partitionExpr))
    ;; special case: "(<part> (<mem>+))" rather than "((<part> (<mem>+)))"
    (when (and (atom (first partitionExpr))
	       (consp (second partitionExpr))
	       (loop for term in (second partitionExpr)
		    always (atom term)))
      (parsing-warning 
	"Adding outer parentheses to the expression: ~S" partitionExpr)
      (setq partitionExpr (list partitionExpr)))
    (loop for term in partitionExpr
          do (setq term (list-of term))
	     ;; special case: "(<part> <mem>+)" rather than "(<part> (<mem>+))"  ; DGB 11/15/91
	     (when (and (rest term)
		        (atom (second term)))
	       (parsing-warning "Adding inner parentheses to the term: ~S" term)
	       (setq term `(,(first term) ,(rest term))))
	  collect (cons (first term) 
                        (loop for ref in (second term)
                              collect (evaluate-symbolic-reference 
                                       ref (concept-or-relation concept) 
                                       :specialize-this-concept concept)))) ))


  ;;
;;;;;; parsing Non-TBox Knowledge
  ;;

;;; "parse-non-tbox-knowledge" is used for uncompleting a concept, and
;;;    (indirectly) for merging concepts;

(defun parse-non-tbox-knowledge (self)
  ;; Run the non-definitional parts of "(source-definitions self)"
  ;;    through the parser, filling "parsed-expressions";
  (let ((*parserContextStack* (list *loom-parse-graph*))
	(*conceptBeingParsed* self)
	(tboxDefinition (getf (parsed-expressions self) :definition))
	(reifiedRelationP (typep self 'REIFIED-RELATION))
	(context (context self))  
	savedContext sourceClauses)
    (declare (special *parserContextStack* *conceptBeingParsed*))
    ;;  parse the definition in "source-definitions" 
    (push-parser-context (concept-or-relation self))
    ;; eliminate all but :definition from "parsed-expressions" slot:
    (setf (parsed-expressions self) nil)
    (setf (getf (parsed-expressions self) :definition) tboxDefinition)
    (catch 'parse-concept-definition-catcher
      (loop for sourceDefn in (source-definitions self)
	   do
	   (if reifiedRelationP
	       (setq sourceClauses
		     (filter-reified-source-clauses self (cdr sourceDefn)
						    :skip-tbox-definition t))
	       (setq sourceClauses (cdr sourceDefn)))
	   ;; this code is copied from "parse-source-definitions":
	   (unwind-protect
	       (progn
		 ;; change context if necessary:
		 (when (and context
			    (neq context *context*))
		   (setq savedContext *context*)
		   (change-context context))
		 ;; do the parse:
		 (parse-source-clauses self sourceClauses :skip-tbox-definition t))
	     (when savedContext
	       (change-context savedContext))))
      (return-from parse-non-tbox-knowledge self))	; good parse
    (unless (member :newly-redefined (system-attributes self))
      (error "parse-non-tbox-knowledge encountered bad syntax"))	; bad parse
    ))



;;; TO DO:
#|

IN "TBOX-RELATION.incorporate-feature", FIX IT SO SET FEATURES ARE LEGAL RANGES;

IN "evaluate-expression": TRY TO AVOID REPARSING ALREADY-PARSED EXPRESSIONS;

IN "find-or-create-concepts-in-query":  FIX :all, :some, :the, :at-least, ... SO THAT
   THEY ALLOW ARBITRARY EXPRESSIONS AS ARGUMENTS INSTEAD OF JUST SYMBOLIC REFS;

|#
