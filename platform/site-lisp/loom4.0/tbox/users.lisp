;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

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

;;; USERS.LISP (TBOX)

(in-package "LOOM")

;;; Top-level entry points for users of the Loom system


(export
  '( defconcept defproperty defrelation defset definterval
    implies default
    undefconcept undefrelation
    define-concept define-relation define-property define-interval
    set-concept-name
    classify-concept unclassify-concept uncomplete-concept
    get-concept get-relation get-property
    fc fr find-concept find-relation find-objects
    pc pr po pprint-object object-name
    print-classifier-summary print-network-summary print-diagnostics
    set-features unset-features reset-features list-features 
    set-feature unset-feature
    with-features with-feature-changes with-default-features
    power-level safe-mode
    enable-classifier disable-classifier
    enable-completion disable-completion 
    classify-all
    list-merged-concepts list-badly-concepts
    list-undefined-concepts list-system-defined-concepts
    list-unclassified-concepts destroy-unclassified-concepts
    list-dependents list-depend-ons find-tbox-cycles
    find-subsumers&subsumees
    find-role-facets
    show-progress show-agent-time
    ordered-set-p context-p
    classified-instance-p lite-instance-p clos-instance-p
    ))


  ;;
;;;;;; DEFCONCEPT, DEFRELATION, DEFSET, DEFINTERVAL ...
  ;;

(defmacro defconcept (name &body definition)
  "Define or redefine a concept with name `name'.  `Definition' specifies
a new concept definition, new constraints, new defaults, etc."
  ;; Create a concept, parse "definition", fill-in definitional
  ;;    slots, and compute dependents;
  ;; If *classify-concepts-immediately* is set, then
  ;;    do model-building, complete, and classify concept
  ;; If the concept already exists, redefine it and its
  ;;    dependents
;;; THIS DECLARE SEEMS NOT TO BE FUNCTIONING ANY LONGER:
  #+(or :lcl3.0 (and (not :lucid) (not :xerox)))
  (declare (arglist name 
		    &key is is-primitive constraints defaults attributes
		    annotations mixin-classes mixin-slots context))
  `(redefine-concept '(,name ,@definition) :concept) )

(defmacro defrelation (name &body definition)
  "Define or redefine a relation with name `name'.  `Definition' specifies
a new concept definition, new domain and range, new properties, etc."
  ;; Create or redefine a relation (see "defconcept");
  `(redefine-concept '(,name ,@definition) :relation))

;; OBSOLETE:
;(defmacro defrelation (name &body definition)
;  "Define or redefine a relation with name `name'.  `Definition' specifies
;a new concept definition, new domain and range, new properties, etc."
;  ;; Create or redefine a relation (see "defconcept");
;  (let ((realDefinition (if (stringp (first definition))
;			    ;; skip over documentation string:
;			    (rest definition)
;			    definition)))
;    (if (eql (getf realDefinition :arity) 1)
;	(progn
;	  (push :relation (getf realDefinition :properties))
;	  `(redefine-concept '(,name ,@definition) :concept))
;	`(redefine-concept '(,name ,@definition) :relation)) ))

(defmacro defproperty (name &body definition)
  "Define or redefine a property with name `name'.  `Definition' specifies
a new property definition, new domain, etc."
  ;; Create or redefine a relation (see "defconcept");
    `(redefine-concept '(,name ,@definition) :property) )

;(defmacro deffeature (name &body definition)
;  "Define or redefine a feature (a single-valued role) with name `name'.
;Implicitly defines a binary relation (multiple features can map to the same
;relation).  Redefinition occurs (only) when the :domain specification matches
;the domain of an existing role of the same name."
;  ;; Create or redefine a feature and a relation;
;  `(redefine-role '(,name ,@definition) :single-valued-p t) )

(defmacro defset (name &body definition)
  "Define or redefine a set concept with name `name'.  `Definition' specifies
a new set definition, new attributes, etc."
   ;; Create or redefine a set;
  (let* ((defBody (copy-list definition))
         (characteristics (get&remf defBody :characteristics)))
    (unless (listp characteristics)
      (setq characteristics (list characteristics)))
    (pushnew :base-set characteristics)
  
    `(redefine-concept
      '(,name :characteristics ,characteristics ,@defBody)
      :concept) ))

(defmacro definterval (name &body definition)
  ;; Create or redefine an interval;
  (warn "`definterval' is now obsolete -- please use `defconcept' or `defset'")
  (let* ((defBody (copy-list definition))
         (characteristics (get&remf defBody :characteristics)))
    (unless (listp characteristics)
      (setq characteristics (list characteristics)))
    (pushnew :base-set characteristics)
    (pushnew :ordered characteristics)

    `(redefine-concept
      '(,name :characteristics ,characteristics ,@defBody)
      :concept) ))

(defmacro implies (antecedent consequent)
   "Define a material implication between `antecedent' and `consequent'."
  `(define-implication ',antecedent ',consequent) )

(defmacro default (antecedent consequent)
   "Define a default rule between `antecedent' and `consequent'."
  `(define-default-implication ',antecedent ',consequent) )

(defmacro undefconcept (&rest definition)
  ;; Delete the concept indicated by "definition":
  ;;    If "definition" is a single name, delete that concept;
  ;;    Otherwise, "definition" is a defconcept without a name --
  ;;      we find that concept and delete it.
  `(udnefine-concept ',definition :concept) )

(defmacro undefrelation (&rest definition)
  ;; Delete the relation indicated by "definition":
  ;;    If "definition" is a single name, delete that relation;
  ;;    Otherwise, "definition" is a defrelation without a name --
  ;;      we find that relation and delete it.
  `(undefine-concept ',definition :relation) )


  ;;
;;;;;; New Procedural Interface
  ;;

(defun define-concept (&rest options) 
  ;; Define a concept procedurally;
  #+(or :lcl3.0 (and (not :lucid) (not :xerox)))
  (declare (arglist &key name is constraints attributes type classify-immediately
		    &allow-other-keys))
  (setq options (copy-list options))
  (let ((name (unless (keywordp (car options))
		(pop options))))
    (define-concept--internal
      (or (get&remf options :type)
	  :concept)
      (or (get&remf options :name)
	  name)
      options) ))

(defun define-property (&rest options) 
  ;; Define a concept procedurally;
  #+(or :lcl3.0 (and (not :lucid) (not :xerox)))
  (declare (arglist &key name is constraints attributes type classify-immediately
		    &allow-other-keys))
  (setq options (copy-list options))
  (let ((name (unless (keywordp (car options))
		(pop options))))
    (define-concept--internal
      (or (get&remf options :type)
	  :property)
      (or (get&remf options :name)
	  name)
      options) ))

(defun define-relation (&rest options)
  ;; Define a relation procedurally;
  #+(or :lcl3.0 (and (not :lucid) (not :xerox)))
  (declare (arglist &key name is constraints domain range attributes
		    antecedents classify-immediately &allow-other-keys)) 
  (setq options (copy-list options))
  (let ((name (unless (keywordp (car options))
		(pop options))))
    (define-concept--internal
      :relation
      (or (get&remf options :name) 
	  name)
      options) ))

(defun define-interval (&rest options)
  ;; Define an interval procedurally;
  #+(or :lcl3.0 (and (not :lucid) (not :xerox)))
  (declare (arglist &key name is constraints attributes
		    classify-immediately &allow-other-keys)) 
  (obsolete define-interval define-concept)
  (setq options (copy-list options))
  (let ((name (unless (keywordp (car options))
		(pop options))))
    (define-concept--internal
      :concept
      (or (get&remf options :name)
	  name)
      options) ))

(defun define-concept--internal (type name options)
  ;; Helping function for "define-concept" and "define-relation";
  ;; ??? BUG: CAN'T CLASSIFY IMMEDIATELY IF THERE IS AN EMBEDDED EXPRESSION:
  (let* ((classifyImmediatelyP (get&remf options :classify-immediately))
	 (sourceOptions options)
	 (*parserContextStack* (list *loom-parse-graph*))
	 *conceptBeingParsed* newConcept)
    (declare (special *parserContextStack* *conceptBeingParsed*))
    (when name
      (setq name (validate-concept-name name))
;; This is redundant code and never gets executed.  An earlier error aborts
;;  the processing:
;      (when (ecase type
;              ((:concept :property) (find-new-concept-conflict name))
;              (:relation (find-new-relation-conflict name)))
;        (warn "Cannot create a new ~(~A~) named ~A because that name~%~
;               is used for a ~(~A~) in some context below ~A." 
;              type name *context* type)
;        (return-from define-concept--internal nil))
      (when (not classifyImmediatelyP) 
	(return-from define-concept--internal
	  ;; BUG: need to replace objects in "sourceOptions" with names or expressions
          ;;   Fixed by the "generate-dereferenced-expression" call?  TAR 12/13/93
	  (redefine-concept
           `(,name ,@(generate-dereferenced-expression sourceOptions)) ;  TAR 12/13/93
           type))))
    ;; if name is nil, or "classify-immediately", we assume we are creating
    ;;    a new concept, so we skip some of the checks
    (setq newConcept
	  (create-concept
	    name type (compute-context-from-source-options sourceOptions)
	    :dont-list-as-uninterned
	    (member :temporary (getf options :system-characteristics))))
    (setq *network-is-sealed-p* nil)
    (setq *reseal-network-p* t)
    (setq *conceptBeingParsed* newConcept)
    (catch 'parse-concept-definition-catcher
      (parse-source-clauses newConcept sourceOptions)
      ;; NOTE: For unnamed concepts, we delay installation of source until
      ;;    revision is necessary, because the source may be big for unnamed concepts:
      (when (name newConcept)
	(install-source-definition newConcept))
      (case (normalized-3-valued-truth-value classifyImmediatelyP)
	(true
	 (setq newConcept (condition&classify-subgraph newConcept))
	 (cond
	   ((classified-p newConcept)
	    (post-uncompleted-concept newConcept))
	   ((not (bad-definition-p newConcept))
	    (parsing-error "Can't immediately classify concept ~S" newConcept))))
	(false
	 (post-unclassified-concept newConcept))
	(otherwise
	 (post-unclassified-concept newConcept)
	 (when (not (member :disable-classifier *loom-features*))
	   (classify&complete-all-concepts)
	   (when (member :discarded-by-merge (system-attributes newConcept))
	     (setq newConcept
		   (prog1 
		     (merged-into-concept newConcept) 
		     (setf (merged-into-concept newConcept) nil))))))))
    newConcept ))


  ;;
;;;;;; "set-concept-name"
  ;;

(defun set-concept-name (concept name)
  ;; Assign a name to a nil concept "concept";
  ;; Note: We make lots of checks here to insure consistency -- a faster
  ;;    but less safe function "intern-concept" is used internally;
  (let ((partitionId
	  (typecase concept
	    (UNARY-ENTITY :concepts)
	    (TBOX-RELATION :relations)
	    (otherwise
	     (warn "~S is not a concept" concept)
	     (return-from set-concept-name nil))))
	context)
    (when (name concept)
      (warn "Call 'rename-concept' to change the name of a concept~%")
      (return-from set-concept-name nil))
    (setq context (find-context-of-object concept partitionId))
    (intern-concept concept name context)
    (delf (anonymous-objects 
	    (find-partition :concepts (context-partitions context)))
	  concept) ))


  ;;
;;;;;; User-controlled Classification
  ;;

(defun classify-concept (conceptOrName &key type)
  ;; Condition, classify, and complete all concepts which "self"
  ;;    depends on (recursively), and then do the same for "self"
  (let ((concept (coerce-to-concept conceptOrName :concept-or-relation type)))
    (when concept
      (prog1
	(help-classify-concept concept)
	(complete-all-concepts))) ))

(defun help-classify-concept (self)
  ;; Helping function for "classify-concept"; Classify depend-ons
  ;;    and then classify self;
  (cond
    ((classified-p self)
     self)
    ((or (member self (list-dependents self))
	 (loop for dependOn in (depend-ons self)
	      thereis (null (help-classify-concept dependOn))))
     nil)
    (t 
     (condition-one-concept self)
     (prog1
       (classify-one-concept self)
       (delf *top-level-unclassified-concepts* self)
       (decf *count-of-unclassified-concepts*)
       (post-uncompleted-concept self)))) )

(defun unclassify-concept (conceptOrName &key type)
  ;; Return a concept matching "conceptOrName" in unclassified form;
  ;; Returns a list of concepts if concept contained multiple
  ;;    definitions;
  (coerce-to-concept conceptOrName
		     :concept-or-relation type
		     :unmerge-concept-p t
		     :revise-concept-p t) )

;;; REDEFINED BELOW  ; DGB 7/9/90
;(defun uncomplete-concept (conceptOrName &key type)
;  ;; Uncomplete the object referenced by "conceptOrName";
;  (let ((concept (ecase type
;		   (concept (find-concept conceptOrName))
;		   (relation (find-relation conceptOrName)))))
;    (when concept
;      (initiate-uncomplete-sublattice concept)) ))

(defun uncomplete-concept (conceptOrName &key type)
  ;; Uncomplete the object referenced by "conceptOrName";
  (let ((concept (coerce-to-concept conceptOrName :concept-or-relation type)))
    (when concept
      (initiate-uncomplete-sublattice concept)) ))


  ;;
;;;;;; Get classifiable-object macros
  ;;

;;; "get-xxx" are relatively fast functions for locating network objects;
;;; "find-xxx" functions tend to be more flexible, slower, and do more
;;;     error checking;

(defun get-concept (conceptOrName &key context kb no-error-p)
  "Return the concept named `conceptOrName', or `conceptOrName' itself if its
not a symbol.  Search looks in `context' (or the current context) and its
super contexts.  If no such concept exists, return nil if `no-error-p' is set;
otherwise, generate an error."
  (when (not (symbolp conceptOrName))
    (return-from get-concept conceptOrName))
  (obsolete-argument get-concept kb context #'get-context-from-kb)
  (or (evaluate-identifier conceptOrName :concepts context)
      (and (extended-identifier-p conceptOrName)
           (evaluate-extended-identifier conceptOrName :concepts))
      (if no-error-p
        nil
        (cerror "Return the value NIL" 
                "There is no concept named `~S'" conceptOrName))) )

;(defun get-property (propertyOrName &key no-error-p context)
;  "Return the property named `propertyOrName', or `propertyOrName' itself if its
;not a symbol.  If no such property exists, return nil if `no-error-p' is set;
;otherwise, generate an error."
;  (get-relation propertyOrName :no-error-p no-error-p :context context) )

(defun get-relation (relationOrName &key context kb arity no-error-p)
  "Return the relation named `relationOrName', or `relationOrName' itself if its
not a symbol.  Search looks in `context' (or the current context) and its
super contexts.  If no such relation exists, return nil if `no-error-p' is set;
otherwise, generate an error."
  (when (not (symbolp relationOrName))
    (return-from get-relation relationOrName))
  (obsolete-argument get-relation kb context #'get-context-from-kb)
  (when (eql arity 1)
    (return-from get-relation
      (get-concept relationOrName :context context :no-error-p no-error-p)))
  (let ((rel (or (evaluate-identifier relationOrName :relations context)
		 (and (extended-identifier-p relationOrName)
		      (evaluate-extended-identifier
		       relationOrName :relations)))))
    (when (and arity (not (eql arity (arity rel))))
      (setq rel nil))
    (cond (rel rel)
	  (no-error-p nil)
	  (t (cerror "Return the value NIL" 
		     "There is no relation named `~S'~@[ with arity ~D~]"
		     relationOrName arity))) ))

(defmethod the-relation ((self SYMBOL) arity &key (no-error-p t))
  ;; Return the concept or relation with name "self";
  (get-relation self :arity arity :no-error-p no-error-p) )

(defmethod the-relation ((self T) arity &key (no-error-p t))
  ;; Return the concept or relation with name matching the
  ;;    identifier of "self";
  (get-relation (object-name self) :arity arity :no-error-p no-error-p) )



(defmethod the-context ((self SYMBOL) &key (no-error-p t))
  ;; Return the context with name "self";
  (find-context self :error-p (not no-error-p)) )

(defmethod the-context ((self T) &key (no-error-p t))
  ;; Return the context with name matching the object-name of "self";
  (find-context (object-name self) :error-p (not no-error-p)) )

(defmethod the-context ((self CONTEXT) &key (no-error-p t))
  ;; Return context "self";
  (declare (ignore no-error-p))
  self )

(defmethod the-instance ((self SYMBOL) &key (no-error-p t))
  ;; Return the instance with name "self";
  (get-instance self :error-p (not no-error-p)) )

(defmethod the-instance ((self T) &key (no-error-p t))
  ;; Return the instance with name matching the object-name of "self";
  (get-instance (object-name self) :error-p (not no-error-p)) )


(defmethod the-role ((object SYMBOL) (relation SYMBOL))
  ;; Return the instance with name "self";
  (get-role object relation) )

(defmethod the-role ((object SYMBOL) (relation T))
  ;; Return the instance with name matching the object-name of "self";
  (get-role object (object-name relation)) )

(defmethod the-role ((object T) (relation SYMBOL))
  ;; Return the instance with name matching the object-name of "self";
  (get-role (object-name object) relation) )

(defmethod the-role ((object T) (relation T))
  ;; Return the instance with name "self";
  (get-role (object-name object) (object-name relation)) )

(defmethod the-instance-role ((object SYMBOL) (relation SYMBOL))
  ;; Return the instance with name "self";
  (get-instance-role object relation) )

(defmethod the-instance-role ((object SYMBOL) (relation T))
  ;; Return the instance with name matching the object-name of "self";
  (get-instance-role object (object-name relation)) )

(defmethod the-instance-role ((object T) (relation SYMBOL))
  ;; Return the instance with name matching the object-name of "self";
  (get-instance-role (object-name object) relation) )

(defmethod the-instance-role ((object T) (relation T))
  ;; Return the instance with name "self";
  (get-instance-role (object-name object) (object-name relation)) )



  ;;
;;;;;; Find classifiable-object macros
  ;;

(defun find-or-evaluate-and-find (input partition &key context)
  ;; Helping function for fc, fr, fi, pc, pr, pi;
  ;; Search "partition" for "input", or if that fails,
  ;;    evaluate "self";
  ;; Return two values: (1) the found object (or nil), and
  ;;    (2) the context it was found in;
  (when (and context
	     (or (listp context)
		 (and (symbolp context) (boundp context))))
    (setq context (eval context)))
  (multiple-value-bind (object context)
      (help-find-object input partition context t nil)
    (cond
      ((and object
	    (not (listp object))) ;not an unevaluated Lisp form 
       (values object context))
      ((or (listp input)
	   (and (symbolp input) (boundp input)))
       (setq input (eval input))
       (multiple-value-bind (object context)
	   (help-find-object input partition context t nil)
	 (cond
	   (object
	    (values object context))
	   ((symbolp input)
	    (values nil nil))
	   (t
	    (values input nil)))))
      (t
       (values nil nil)))) )

(defun help-find-objects (searchString partitionName context match errorP localP)
  ;; Helping function for  "find-concept", "find-relation" and "find-instance"
  ;;   when using string input and matching options.
  ;; Returns a list of objects;
  (let ((testFn (generate-match-function (string searchString) match))
	(results nil))
    (unless (or (null context) (context-p context))
      (setq context (find-context context :error-p errorP)))
    (when (null context)
      (setq context *context*))
    (if localP
	(do-context-partition 
	    (key value (find-partition partitionName (context-partitions context))
		 :skip-anonymous-instances-p t)
	  (when (and (funcall testFn (string key))
		     (not (discarded-p value)))
	    (push value results)))
        (loop for ctx in (context-precedence-list context)
	    as partition = (find-partition partitionName (context-partitions ctx))
	    when partition
	    do (do-context-partition (key value partition :skip-anonymous-instances-p t)
		 (when (and (funcall testFn (string key))
			    (not (discarded-p value)))
		   (push value results)))))
    results) )

(defun help-find-objects-by-role-value (searchString role partitionName context match errorP localP)
  ;; Helping function for more general searches when using string input and matching options.
  ;; Returns a list of objects;
  (let ((testFn (generate-match-function (string searchString) match))
	(results nil))
    (unless (or (null context) (context-p context))
      (setq context (find-context context :error-p errorP)))
    (when (null context)
      (setq context *context*))
    (if localP
	(do-context-partition 
	    (nil value (find-partition partitionName (context-partitions context))
		 :skip-anonymous-instances-p t)
	  (when (and (not (discarded-p value))
		     (loop for v in (get-values value role)
			 thereis (funcall testFn (string v))))
	    (push value results)))
        (loop for ctx in (context-precedence-list context)
	    as partition = (find-partition partitionName (context-partitions ctx))
	    when partition
	    do (do-context-partition (nil value partition :skip-anonymous-instances-p t)
		 (when (and (not (discarded-p value))
			    (loop for v in (get-values value role)
				thereis (funcall testFn (string v))))
		   (push value results)))))
    results) )

(defun help-find-object (input partitionName context noErrorP localP)
  ;; Helping function for "find-or-evaluate-and-find", "find-concept", "find-relation"
  ;;   and "find-instance";
  ;; Return two values: (1) the found object (or nil), and
  ;;    (2) the context it was found in;
  (let (extendedIdCxt resultCxt resultObject)
    (when (not (instance-identifier-p input))
      (return-from help-find-object 
	(if (individual-p input)
            (values input nil)
	    (values nil nil))))
    (when (symbolp context)
      (setq context (find-context context)))
    (multiple-value-setq (input extendedIdCxt)
      (parse-extended-identifier input :no-error-p noErrorP))
    (setq context (or context extendedIdCxt *context*))
    (if localP
	(when (and (find-partition partitionName (context-partitions context))
		   (setq resultObject 
		     (evaluate-identifier-locally input partitionName context)))
	  (setq resultCxt context))
	(loop for ctx in (context-precedence-list context)
	    when (and (find-partition partitionName (context-partitions ctx))
		      (setq resultObject 
			(evaluate-identifier-locally input partitionName ctx))
		      (not (discarded-p resultObject))
		      (setq resultCxt ctx))
	    return t))
      
    (when (discarded-p resultObject)
      (setq resultObject nil))
    (values resultObject resultCxt) ))

;;
;; Old version.  This supported the old wildcard finding.  New wildcard finding
;;   has been introduced.
;;
;(defun help-find-object (input partitionName noErrorP context)
;  ;; Helping function for "find-or-evaluate-and-find";
;  ;; Return two values: (1) the found object (or nil), and
;  ;;    (2) the context it was found in;
;  (let (pattern wildcardPatternP positionOfStar substring substringLength 
;	        extendedIdCxt cxtsToSearch resultCxt resultObject)
;    (labels ((get-pattern-location (context)
;	       (catch 'maphash-catcher
;		 (do-context-partition
; 		   ( key self 
;		         (find-partition 
;		          partitionName (context-partitions context))
;		         :skip-anonymous-instances-p t)
;		   (when (key-matches-pattern-p key)
;		     (throw 'maphash-catcher self)))
;		 nil))
;	     (key-matches-pattern-p (key)
;	       (if (and (symbolp key)
;			(stringp pattern))
;                 (let ((string (symbol-name key)))
;                   (or (string-equal pattern string)
;                       (and wildcardPatternP
;                            (case positionOfStar
;                              (:start 
;                               (string-suffix-p 
;                                substring string substringLength))
;                              (:end
;                               (string-prefix-p 
;                                substring string substringLength))
;                              (:both
;                               (search substring string))))))
;                 (eql pattern key))))		; pattern is an integer
;      (when (not (instance-identifier-p input))
;	(return-from help-find-object 
;	  (if (individual-p input)
;            (values input nil)
;            (values nil nil))))
;      (when (symbolp context)
;	(setq context (find-context context)))
;      (if (symbolp input)
;        (progn
;          (multiple-value-setq (input extendedIdCxt)
;            (parse-extended-identifier input :no-error-p noErrorP))
;          (setq pattern (symbol-name input))
;          (setq wildcardPatternP (position #\* pattern))
;          (setq positionOfStar (string-position-of-star pattern))
;          (setq substring (remove #\* pattern))
;          (setq substringLength (length substring)))
;        (setq pattern input))			; pattern is an integer
;      (setq cxtsToSearch
;            (loop for context in (context-precedence-list
;                                  (or context extendedIdCxt *context*))
;                  when (find-partition
;                        partitionName (context-partitions context))
;                  collect context))
;      (or (loop for cxt in cxtsToSearch
;                thereis
;                (and (setq resultCxt cxt)
;                     (setq resultObject 
;                           (evaluate-identifier-locally input partitionName cxt))))
;          (loop for context in cxtsToSearch
;                thereis
;                (and (setq resultCxt context)
;                     (setq resultObject (get-pattern-location context)))))
;      (values resultObject (when resultObject resultCxt)) )))


(defmacro fc (conceptName &key context kb)
  (obsolete-argument fc kb context #'make-get-context-from-kb)
  `(find-or-evaluate-and-find ',conceptName :concepts :context ',context) )

(defmacro fr (relationName &key context kb)
  (obsolete-argument fr kb context #'make-get-context-from-kb)
  `(find-or-evaluate-and-find ',relationName :relations :context ',context) )


;;; "get-xxx" are relatively fast functions for locating network objects;
;;; "find-xxx" functions tend to be more flexible, slower, and do more
;;;     error checking;

(defun find-objects (objectOrName &key (type :any) local-p
				       no-warning-p ignore-package-p context
				       (match :case-insensitive))
  ;; Find objects.  TYPE is one of :concepts :relations :instances :any
  ;; MATCH is one of :exact :case-insensitive :substring-exact :substring
  ;;                 :wildcard-exact :wildcard :regex-exact :regex
  ;; Returns a list of objects.
  (let ((permitWarning (not no-warning-p))
	objects
	extendedIdCxt)
    (when (and ignore-package-p (symbolp objectOrName))
      (setq objectOrName (symbol-name objectOrName)))
    (cond
     ((null objectOrName)
      (when permitWarning
	(warn "Can't find ~A named NIL~%"
	      (case type
		(:concepts "concept")
		(:relations "relation")
		(:instances "instance")
		(:any "any object"))))
      (return-from find-objects nil))
     ((stringp objectOrName)
      (when (extended-identifier-string-p objectOrName)
	(multiple-value-setq (objectOrName extendedIdCxt)
	  (help-parse-extended-identifier-string objectOrName nil)))
      (setq objects
	(if (eq type :any)
	    (loop for part in '(:concepts :relations :instances)
		as result = (help-find-objects objectOrName part
					       (or context extendedIdCxt) match t local-p)
		when (listp result) nconc result
		else collect result)
	  (help-find-objects objectOrName type (or context extendedIdCxt)
			     match t local-p))))
     ((symbolp objectOrName)
      (multiple-value-setq (objectOrName extendedIdCxt)
	(parse-extended-identifier objectOrName))
      (setq objects
	(if (eq match :exact)
	    (if (eq type :any)
		(loop for part in '(:concepts :relations :instances)
		    collect (evaluate-identifier objectOrName part
						 (or context extendedIdCxt)))
	      (evaluate-identifier objectOrName type
				   (or context extendedIdCxt)))
	  (if (eq type :any)
	      (loop for part in '(:concepts :relations :instances)
		  as results = (help-find-objects objectOrName part
						  (or context extendedIdCxt) match t local-p)
		  when (listp results) nconc results
		  else collect results)
	    (help-find-objects objectOrName type (or context extendedIdCxt)
			       match t local-p)))))
     ((case type
	(:concepts (concept-p objectOrName))
	(:relations (relation-p objectOrName))
	(:instances (instance-p objectOrName))
	(:any (or (concept-p objectOrName)
		  (relation-p objectOrName)
		  (instance-p objectOrName)))
	(otherwise nil))
      (setq objects objectOrName) )
     (permitWarning			; "objectOrName" has illegal type
      (warn "'~S' is not ~A"
	    objectOrName
	    (case type
		(:concepts "a concept")
		(:relations "a relation")
		(:instances "an instance")
		(:any "a concept, relation or instance")))
      (return-from find-objects nil)))

      (when (and (null objects) permitWarning)
	(warn "No ~A with the name ~S exists in the current context~%"
	      (case type
		(:concepts "concept")
		(:relations "relation")
		(:instances "instance")
		(:any "object"))
	      objectOrName))
      (if (listp objects)
	  (fast-remove-duplicates objects)
	(list objects)) ))
  
    
(defun find-concept (conceptOrName &key no-warning-p ignore-package-p context kb
					(match (if (symbolp conceptOrName) 
						   :exact
						 :case-insensitive)))
  ;; Return the concept corresponding to "conceptOrName";
  ;; Return NIL if no concept is found, a single concept if unique, otherwise a list of concepts
  (obsolete-argument find-concept kb context #'get-context-from-kb)
  (let ((objects (find-objects conceptOrName :type :concepts
			       :no-warning-p no-warning-p
			       :ignore-package-p ignore-package-p
			       :context context
			       :match match)))
    (cond ((atom objects) objects)
	  ((null (cdr objects)) (first objects))
	  (t objects)) ))

 
(defun find-relation (relationOrName &key no-warning-p ignore-package-p context kb
					  (match (if (symbolp relationOrName) 
						     :exact
						   :case-insensitive)))
  ;; Return the relation corresponding to "relationOrName";
  ;; Return NIL if no relation is found, a single relation if unique, otherwise a list of relations
  (obsolete-argument find-relation kb context #'get-context-from-kb)
  (let ((objects (find-objects relationOrName :type :relations
			       :no-warning-p no-warning-p
			       :ignore-package-p ignore-package-p
			       :context context
			       :match match)))
    (cond ((atom objects) objects)
	  ((null (cdr objects)) (first objects))
	  (t objects)) ))

  ;;
;;;;;; Low-level Predicates
  ;;

(defmethod meta-thing-p ((self TBOX-CONCEPT))
  ;; Return t iff "self" is a concept or a relation;
  t)

(defmethod meta-thing-p (self)
  ;; Return t iff "self" is a concept or a relation;
  (declare (ignore self))
  nil)
  
(defun concept-p (self)
  ;; Return t iff "self" is a unary concept;
  (typep self 'UNARY-CONCEPT) )

(defun ordered-set-p (concept)
  ;; Return t iff "self" is an ordered set concept;
  (let (setFeature)
    (and (concept-p concept)
	 (eq (defined-as concept) :set)
	 (setf setFeature (defined-set-feature concept))
	 (eq setFeature (base-set setFeature))
	 (typep setFeature 'SYMBOLIC-INTERVAL)) ))

(defun property-p (self)
  ;; Return t iff "self" is a property;
  (typep self 'UNARY-RELATION) )

(defun relation-p (self)
  ;; Return t iff "self" is a relation;
  (typep self 'TBOX-RELATION) )

(defmethod individual-p ((self BASIC-INSTANCE))
  ;; Return t iff "self" is a role-bearing instance;
  t )

(defmethod individual-p ((self CLOS-INSTANCE))
  ;; Return t iff "self" is a role-bearing instance;
  t )

(defmethod individual-p (self)
  ;; Return nil, because "self" is not a role-bearing instance;
  (declare (ignore self))
  nil )

(defun context-p (self)
  ;; Return t iff "self" is a context;
  (typep self 'CONTEXT) )

;;; THESE THREE WILL PROBABLY BE PHASED OUT IN PLACE OF "individual-p":
(defmethod instance-p ((self BASIC-INSTANCE))
  ;; Return t iff "self" is a role-bearing instance;
  t )
(defmethod instance-p ((self CLOS-INSTANCE))
  ;; Return t iff "self" is a role-bearing instance;
  t )
(defmethod instance-p (self)
  ;; Return nil, because "self" is not a role-bearing instance;
  (declare (ignore self))
  nil )

;; Test for classified instance:
(defmethod classified-instance-p ((self T))
  nil )
(defmethod classified-instance-p ((self DB-INSTANCE))
  t )

(defmethod lite-instance-p ((self T))
  "Returns T if `self' is a lite instance."
  nil)
(defmethod lite-instance-p ((self LITE-INSTANCE))
  "Returns T if `self' is a lite instance."
  t )

(defmethod clos-instance-p ((self T))
  "Returns T if `instance' is a CLOS instance.  Note that all lite instances
are also CLOS instances!"
  nil )
(defmethod clos-instance-p ((self CLOS-INSTANCE))
  "Returns T if `instance' is a CLOS instance.  Note that all lite instances
are also CLOS instances!"
  t )


  ;;
;;;;;; Pretty-printing and Graph functions
  ;;

(defmacro pc (conceptName)
  ;; Print concept definition;
  (let ((concept (find-or-evaluate-and-find conceptName :concepts)))
    (when concept
      `(let ((*expandSystemDefinedConceptsP* t))
	 (declare (special *expandSystemDefinedConceptsP*))
	 (print-concept-definition
	   (generate-object-definition
	     ,(form-constant-form concept :very-slow-p t) :augment-p t)
	   :newline t))) ))

(defmacro pr (relationName)
  ;; Print relation definition;
  (let ((relation (find-or-evaluate-and-find relationName :relations)))
    (when relation
      `(let ((*expandSystemDefinedConceptsP* t))
	 (declare (special *expandSystemDefinedConceptsP*))
	 (print-concept-definition
	   (generate-object-definition 
	     ,(form-constant-form relation :very-slow-p t) :augment-p t)
	   :newline t))) ))

(defun po (object)
  ;; Print definition of arbitrary object;
  (let ((*expandSystemDefinedConceptsP* t))
    (declare (special *expandSystemDefinedConceptsP*))
    (when object
      (pprint (generate-object-definition object :augment-p t))) ))	   

(defun pprint-object (loomObject &optional (stream t))
  "Pretty print a definition for `loomObject' to `stream', and return NIL.
The default stream is *standard-output*.  If `stream' is set to NIL, then
nothing is printed, and an s-expression representing the object's definition
is returned."
  (let* ((*expandSystemDefinedConceptsP* t))
    (declare (special *expandSystemDefinedConceptsP*))
    (if stream
      (format stream "~&~A" (generate-pprint-definition loomObject))
      (generate-object-definition loomObject)) ))

(defmethod generate-pprint-definition ((self LOOM-OBJECT))
  ;; Helping method for "pprint-object";
  ;; Return a string that defines "loomObject";
  (format nil "~S" (generate-object-definition self)) )

(defmethod generate-pprint-definition ((self TBOX-CONCEPT))
  ;; Helping method for "pprint-object";
  ;; Return a string that defines "loomObject";
  (format-concept-definition
   (generate-object-definition self)) )


;; QUESTION:  SHOULD THIS BE "INSTANCE-IN-CONTEXT" INSTEAD?
(defmethod generate-pprint-definition ((self CLOS-INSTANCE))
  ;; Helping method for "pprint-object";
  ;; Return a string that defines "loomObject";
  (format nil "~S" (generate-object-definition self)) )

(defmethod generate-pprint-definition (self)
  ;; Helping method for "pprint-object";
  ;; "self" is not a Loom object -- return it as is;
  ;; NOT YET IMPLEMENTED!!!:
  self )


  ;;
;;;;;; "object-name"
  ;;

(clos::defgeneric object-name (self) 
  (:documentation "Return a name or identifier for the Loom object `self'."))

(defmethod object-name ((self NAMED-OBJECT)) (name self) )
(defmethod object-name ((self DB-INSTANCE)) (identifier self) )
(defmethod object-name ((self TBOX-CONCEPT)) (name self) )
(defmethod object-name ((self INSTANCE-IN-CONTEXT))
  (if (consp (identifier self)) nil (identifier self)) )
(defmethod object-name (self)
  ;; Default method returns nil;
  (declare (ignore self))
  nil )


  ;;
;;;;;; Feature manipulation
  ;;


(defun set-features (&rest features)
  ;; Enable the features listed in "features";
  (declare (dynamic-extent features))
  (loop for f in features
       do
       (case f
	 ;; these features are controlled by other variables or functions:
	 (:disable-classifier (disable-classifier))
	 (:disable-completion (disable-completion))
         (:prefer-clos-instances (setq *prefer-clos-instances-p* t))
	 (:closed-world (setq *global-closed-world-p* t))
	 (:open-world (setq *global-closed-world-p* nil))
         (:automatically-advance-state
	  (setq *automatically-advance-state-p* t))
	 (:approximate-open-intervals 
	  (obsolete-argument 'set-features :approximate-open-intervals))
	 ;; *loom-features*
	 (( :automatic-clos-classes
            :make-roles-single-valued
	   :push-down-primitive-restrictions
	   :domain-implies-role
           :load-obsolete-concepts
           :dont-dwimmify-keywords
           :compile-predicates-on-demand)
	  (pushnew f *loom-features*))
	 ;; *loom-dialogue-features*:
	 ((:emit-classify-dots :ask-about-conjuction-concepts
	   :long-print-names :allow-duplicate-creates
	   :ask-for-concept-names :ask-for-names-immediately
	   :dont-name-system-defined-concepts :warn-about-syntax-corrections
           :warn-on-nonprimitive-clos-classes :warn-on-redefinition
	   :suppress-diehard-output
	   :emit-match-stars :warn-on-slot-overflow)
	  (pushnew f *loom-dialogue-features*))
	 ;; *loom-match-features*:
	 (( :clip-roles :clip-types :display-match-changes)
	  (pushnew f *loom-match-features*))
	 (otherwise
	  (if (search "TRACE-" (symbol-name f))
	      (pushnew f *loom-features*) 
	      (complain "~%Ignoring unknown feature ~S~%" f)))))
  (list-features :dont-display-p t) )

(defun unset-features (&rest features)
  ;; Disable the features listed in "features";
  (declare (dynamic-extent features))
  (loop for f in features
       do
       (case f
	 ;; these features are controlled by other variables or functions:
	 (:disable-classifier (enable-classifier))
	 (:disable-completion (enable-completion)) 
         (:prefer-clos-instances (setq *prefer-clos-instances-p* nil))
	 (:closed-world (setq *global-closed-world-p* nil))
	 (:open-world (setq *global-closed-world-p* t))
         (:automatically-advance-state
	  (setq *automatically-advance-state-p* nil))
	 (:approximate-open-intervals
	  (obsolete-argument 'unset-features :approximate-open-intervals))
	 ;; *loom-features*:
	 (( :automatic-clos-classes
            :make-roles-single-valued
            :push-down-primitive-restrictions
	   :domain-implies-role :load-obsolete-concepts :dont-dwimmify-keywords
           :compile-predicates-on-demand)
	  (delf *loom-features* f))
	 ;; *loom-dialogue-features*:
	 (( :emit-classify-dots :ask-about-conjuction-concepts
	   :long-print-names :allow-duplicate-creates
	   :ask-for-concept-names :ask-for-names-immediately
	   :dont-name-system-defined-concepts :warn-about-syntax-corrections
           :warn-on-nonprimitive-clos-classes :warn-on-redefinition
	   :suppress-diehard-output
	   :emit-match-stars :warn-on-slot-overflow)
	  (delf *loom-dialogue-features* f))
	 ;; *loom-match-features*:
	 (( :clip-roles :clip-types :display-match-changes)
	  (delf *loom-match-features* f))
	 (otherwise
	  (if (search "TRACE-" (symbol-name f))
	      (delf *loom-features* f)
	      (complain "~%Ignoring unknown feature ~S~%" f)))))
  (list-features :dont-display-p t) )

(defun compute-bindable-features (operation featureList formName)
  ;; Situation:  "with-features" and friends will be setting "featureList";
  ;; Returns only those features in "featureList" which can be legally bound
  ;;    by "formName", complaining about illegal ones;
  (let* ((bannedFeatures '(:disable-classifier :disable-completion 
                           :closed-world :open-world))
         (illegalFeatures (intersection bannedFeatures featureList)))
    (if illegalFeatures
      (progn (complain "~ACan't ~A the feature~P ~{~S~^, ~} inside ~A"
                  operation (length illegalFeatures) illegalFeatures formName)
             (set-difference featureList illegalFeatures))
      featureList) ))

(defmacro with-feature-changes ((&key set unset) &body body)
  "Set `:set' and unset `:unset' features only for the execution of `body'."
  (if (or set unset)
    `(let ((*prefer-clos-instances-p* *prefer-clos-instances-p*)
           (*global-closed-world-p* *global-closed-world-p*)
           (*loom-features* *loom-features*)
           (*loom-dialogue-features* *loom-dialogue-features*)
           (*loom-match-features* *loom-match-features*))
       ,@(when set
           `((apply #'set-features (compute-bindable-features 
                                    "SET" ,set "with-feature-changes"))))
       ,@(when unset
           `((apply #'unset-features (compute-bindable-features
                                      "UNSET" ,unset "with-feature-changes"))))
       ,@body)
    `(progn ,@body)) )

(defmacro with-features ((&rest features) &body body)
  "Set only `features' for the execution of `body'."
  `(let ((*prefer-clos-instances-p* nil)
         (*global-closed-world-p* nil)
         (*loom-features* nil)
         (*loom-dialogue-features* nil)
         (*loom-match-features* nil))
     ,@(when features
           `((apply #'set-features (compute-bindable-features
                                    "SET" ',features "with-features"))))
     ,@body) )

(defmacro with-default-features (&body body)
  "Set the default features for the execution of `body'."
  `(let ((*prefer-clos-instances-p* nil)
         (*global-closed-world-p* nil)
         (*loom-features* nil)
         (*loom-dialogue-features* nil)
         (*loom-match-features* nil)
	 (*automatically-advance-state-p* nil))
     (reset-features)
     ,@body) )


#|
(with-feature-changes (:set l :unset u)
  (do-this)
  (do-that))

(with-feature-changes (:set '(a b c))
  (do-this)
  (do-that))

(with-features (a b c)
  (do-this)
  (do-that))

(with-default-features
  (do-this)
  (do-that))
|#


(defun reset-features ()
  ;; Enable default LOOM features only;
  (apply #'unset-features (list-features :dont-display-p t))
  (apply #'set-features cl-user::*loom-default-features*)
  (list-features :dont-display-p t) )

;;
;;  Features grouped by function.  Sort this list and insert it as a constant
;; in the LIST-FEATURES function:
;;

(defparameter *possible-features*
    (sort (list :open-world :closed-world
		:prefer-clos-instances
		:disable-classifier :disable-completion
		:automatically-advance-state
	     ;; *loom-dialogue-features*:
		:emit-classify-dots :ask-about-conjuction-concepts
		:long-print-names :allow-duplicate-creates
		:ask-for-concept-names :ask-for-names-immediately
		:dont-name-system-defined-concepts :warn-about-syntax-corrections
		:warn-on-nonprimitive-clos-classes :warn-on-redefinition
		:suppress-diehard-output
		:emit-match-stars :warn-on-slot-overflow
	    ;; *loom-features*:
		:automatic-clos-classes
		:push-down-primitive-restrictions
		:domain-implies-role :load-obsolete-concepts
		:dont-dwimmify-keywords :compile-predicates-on-demand
            ;; *loom-match-features*
		:clip-roles :clip-types :display-match-changes
		)
	  #'string< :key #'symbol-name))       ; TAR 10/11/95

(defun list-features (&key dont-display-p return-possible-features-p)
  ;; Display a list of features currently enabled (set), and another
  ;;    list of all possible features;
  ;; Return a list of currently enabled features (and optionally also
  ;;    a list of all possible features);
  (let ((features (sort (nconc
			 (when *prefer-clos-instances-p*
			   (list :prefer-clos-instances)) ;;RMM 8/12/92
			 (if *global-closed-world-p*
			     (list :closed-world)
			     (list :open-world))
			 (when *automatically-advance-state-p*
			   (list :automatically-advance-state))
			 (copy-list *loom-dialogue-features*)
			 (copy-list *loom-match-features*)
			 (copy-list *loom-features*))
			#'string< :key #'symbol-name)))
    (unless dont-display-p
      (inform "~%Possible features:")
      (pprint *possible-features* *trace-output*)
      (inform "~%Current features:"))
    (if return-possible-features-p
      (values features *possible-features*)       ; 10/11/95  tar
      features) ))

(defun set-feature (&rest features)
  (obsolete set-feature set-features)
  (apply #'set-features features))
(defun unset-feature (&rest features)
  (obsolete unset-feature unset-features)
  (apply #'unset-features features))

(defun vectorize-features ()
  ;; Returns an integer encoding of the settings of loom features;
  (let ((bitVector 0))
    (multiple-value-bind (features possibleFeatures)
	(list-features :dont-display-p t :return-possible-features-p t)
      (loop for feature in features
	  as pos = (position feature possibleFeatures) ; No trace features!
	  when pos
	    do (setf bitVector (dpb 1 (byte 1 pos) bitVector)))
      bitVector )))

(defun unvectorize-features (bitVector)
  ;; Takes an integer encoding of the settings of loom features in "bitVector"
  ;;   and returns a list of the features which are set;
  (multiple-value-bind (features possibleFeatures)
        (list-features :dont-display-p t :return-possible-features-p t)
    (declare (ignore features))
    (assert (<= (integer-length bitVector) (length possibleFeatures)))
    (loop for i from 0 to (integer-length bitVector)
	  as ftr in possibleFeatures
          when (logbitp i bitVector)
          collect ftr) ))

(defun set-features-from-vector (bitVector)
  ;; Sets loom features to reflect the settings encoded in "bitVector";
  (loop for f in (list-features :dont-display-p t)
       do (unset-features f))
  (apply #'set-features (unvectorize-features bitVector)) )

(defun power-level (&optional level)
  "Setting `level' to :high yields maximum inferencing; setting it to
   sacrifices some inference power and maximizes speed; setting it to
   :medium falls in between."
  (when level
    (setq *power-level*
	  (ecase level
	    (:high 3)
	    (:medium 2)
	    (:low 1))))
  (case *power-level*
    (3 :high)
    (2 :medium)
    (1 :low)) )

(defun safe-mode (&optional (setting nil setting-p))
  (if setting-p
    (setq *safe-mode-p* setting)
    *safe-mode-p*) )


  ;;
;;;;;; Environment functions
  ;;

(defun enable-classifier ()
  ;; Turn on the classify-immediately flag, and classify
  ;;    any concepts that aren't already classified;
  ;; For efficiency, we defer completion of concepts until all
  ;;    concepts have been classified;
  ;; Reset all statistics-gathering counters;
  (when (or (member :disable-classifier *loom-features*)
	    *top-level-unclassified-concepts*
	    *top-level-uncompleted-concepts*)
    (reset-classification-counters)
    (delf *loom-features* :disable-classifier)
    (classify&complete-all-concepts)
    (when (and (plusp *number-of-classifications*)
	       (member :emit-classify-dots *loom-dialogue-features*))
      (print-classifier-summary))) )

(defun reset-classification-counters ()
  ;; Set all counters that track number of classifications, etc.
  ;;    to zero;
  (setq *number-of-classifications* 0)
  (setq *number-of-unclassifications* 0)
  (setq *number-of-revisions* 0)
  (setq *number-of-merges* 0) )

(defun disable-classifier ()
  ;; Set "disable-classifier" indicator;
  (pushnew :disable-classifier *loom-features*) )

(defun enable-completion ()
  ;; Unset any "disable-completion" indicator;
  ;; If all concepts are already classified, then complete all concepts
  ;;    immediately;  otherwise, they will be completed upon classification
  ;;    of the last unclassified concept;
  (delf *loom-features* :disable-completion)
  (complete-all-concepts) )

(defun disable-completion ()
  ;; Set "disable-completion" indicator;
  (pushnew :disable-completion *loom-features*) )

(defun classify-all (&key suppress-statistics)
  ;; Temporarily enable the classifier, or reenable it;
  ;; No summary is generated;
  ;; Note: "classify-all" also does completion, (when completion is
  ;;    enabled, although the this function's name doesn't indicate that);
  (warn "The `classify-all' function is obsolete;~% ~
         Please explicitly define all concepts and relations.")
  (reset-classification-counters)
  (classify&complete-all-concepts)
  (when (and (not (zerop *count-of-unclassified-concepts*))
	     (null (list-unclassified-concepts)))
    ;; sometimes the counter *count-of-unclassified-concepts* is wrong
    ;;    because of a break inside of LOOM; here we fix a broken counter
    ;;    and retry classifying all concepts:
    (setq *count-of-unclassified-concepts* 0)
    (classify&complete-all-concepts))
  (when (not suppress-statistics)
    (print-classifier-summary)) )


  ;;
;;;;;; Classification Statistics and Status
  ;;

(defun print-classifier-summary ()
  ;; Print the total number of classifications, unclassifications,
  ;;    revisions, and merges performed since the classifier was
  ;;    last enabled;
  (let ((numberOfUndefinedConcepts (length (list-undefined-concepts))))
    (inform "~%#classifications = ~S~%" *number-of-classifications*)
    (when (plusp *number-of-merges*)
      (inform "#merges = ~S~%" *number-of-merges*))
    (when (plusp numberOfUndefinedConcepts)
      (inform "#undefined concepts = ~S~%" numberOfUndefinedConcepts))
    (when (plusp *count-of-unclassified-concepts*)
      (inform "#unclassified concepts = ~S~%" *count-of-unclassified-concepts*))) )

(defun print-network-summary ()
  ;; Print the total number of concepts in the current context,
  ;;    and also the number of system-defined and unclassified concepts;
  (let ((totalNumberOfConcepts 0)
	(numberOfUndefinedConcepts 0)
	(numberOfUnclassifiedConcepts 0)
	(numberOfIncoherentConcepts 0))
    (flet ((bump-variables
	     (concept)
	     (incf totalNumberOfConcepts)
	     (when (member :undefined (attributes concept))
	       (incf numberOfUndefinedConcepts))
	     (when (null (classified-p concept))
	       (incf numberOfUnclassifiedConcepts))
	     (when (incoherent-p concept)
	       (incf numberOfIncoherentConcepts)))) 
      (do-context (c *context* :partitions (:concepts :relations))
	(bump-variables c))
      (inform "~%#concepts = ~S~%" totalNumberOfConcepts)
      (when (plusp numberOfUndefinedConcepts)
	(inform "#undefined concepts = ~S~%" numberOfUndefinedConcepts))
      (when (plusp numberOfUnclassifiedConcepts)
	(inform "#unclassified concepts = ~S~%" numberOfUnclassifiedConcepts))
      (when (plusp numberOfIncoherentConcepts)
	(inform "#incoherent concepts = ~S~%" numberOfIncoherentConcepts)) )))

(defun list-merged-concepts (&optional context)
  ;; Return a list of the (named) concepts which have merged;
  (remove-duplicates
    (loop for context in (or (list-of context) (list-contexts))
	 append
	 (loop for c in (list-context context :partitions '(:concepts :relations))
	      when (cdr (source-definitions c))
	      collect c))) )

(defun undefined-concept-p (conceptOrRelation)
  (member :undefined (attributes conceptOrRelation)))
  
(defun list-undefined-concepts (&optional context)
  "Return a list of the undefined concepts in all contexts,
   or in the context `context'"
  (remove-duplicates
    (loop for context in (or (list-of context) (list-contexts))
	 nconc
	 (loop for c in (list-context context :partitions '(:concepts :relations))
	      when (undefined-concept-p c)
	      collect c))) )

(defun list-system-defined-concepts (&optional context)
  "Return a list of the system-defined concepts in all contexts,
   or in the context `context'"
  (loop for context in (or (list-of context) (list-contexts))
       nconc
       (loop for c in (list-context context :partitions '(:concepts :relations))
	    when (system-defined-concept-p c)
	   collect c)) )

(defun list-badly-defined-concepts (&optional context)
  "Return a list of the system-defined concepts in all contexts,
   or in the context `context'"
  (loop for context in (or (list-of context) (list-contexts))
       nconc
       (loop for c in (list-context context :partitions '(:concepts :relations))
	    when (bad-definition-p c)
	    collect c)) )

(defun list-unclassified-concepts ()
  ;; Return a list of the unclassified concepts;
  ;; Side-effect: If the value of *count-of-unclassified-concepts*
  ;;    got screwed up, fix it;
  (let (result)
    (unless (zerop *count-of-unclassified-concepts*)
      (setq result
	    (remove-duplicates
	      (loop for context in (list-contexts)
		   append
		   (loop for c in (list-context context :partitions '(:concepts :relations))
			when (null (classified-p c))
			collect c))))
      (setq *count-of-unclassified-concepts* (length result))
      result) ))

(defun destroy-unclassified-concepts ()
  "Destroy all unclassified concepts.  Recursively destroy all dependents
   of any destroyed concepts.  Return a list of names of all destroyed
   concepts."
  (unless (zerop *count-of-unclassified-concepts*)
    (loop for context in (list-contexts)
	 append
	 (loop for c in (list-context context :partitions '(:concepts :relations))
	      when (null (classified-p c))
	      append (destroy-concept c)))) )

(defun list-dependents (concept &key all-p)
  "Return a list of all concepts which referenced in the definition of `concept'.
If `all-p', also include non-definitional dependents."
  ;; Use the pass-counter to avoid cyclical paths in the network;
  (let (result)
    (labels ((help-list-dependents
	       (self)
	       (when (neq (already-revised-counter self) 
			  *revise-subgraph-pass-counter*)
		 (setf (already-revised-counter self) 
		       *revise-subgraph-pass-counter*)
		 (when (typep self 'TBOX-CONCEPT)
		   (push self result))
		 (loop for dep in (dependents self)
		       do (help-list-dependents dep))
		 (when all-p
		   (loop for dep in (non-tbox-dependents self)
			 do (help-list-dependents dep))))))
      (decf *revise-subgraph-pass-counter*)
      (help-list-dependents concept)
      (setq result (remove concept result))
      ;; redefinition may have caused some dangling references --
      ;;    filter out erroneous dependencies:
      (loop for c in result
            when (member concept (list-depend-ons c :all-p t))
            collect c) )))

(defun list-depend-ons (concept &key all-p)
  "Return a list of all concepts that refer to `concept' in their definitions.
If `all-p', also concepts that refer to `concept' in a non-definitional
expression (e.g., within a constraint)."
  ;; Return a list of all concepts which are tbox depend-ons of "concept";
  ;; If "all-p", also include non-tbox depend-ons;
  ;; Use the pass-counter to avoid cyclical paths in the network;
  (let (result)
    (labels ((help-list-depend-ons
	         (self)
	       (when (neq (already-revised-counter self) 
			  *revise-subgraph-pass-counter*)
		 (setf (already-revised-counter self) 
		       *revise-subgraph-pass-counter*)
		 (when (typep self 'TBOX-CONCEPT)
                   (push self result)
                   (loop for ftr in (computed-features self)
                         when (eq (feature-type ftr) :satisfies)
                         do (loop for dep in (concept-references ftr)
                                  do (help-list-depend-ons dep))))
                 (loop for dep in (depend-ons self)
                       do (help-list-depend-ons dep))
                 (when all-p
                   (loop for dep in (non-tbox-depend-ons self)
                         do (help-list-depend-ons dep))
                   (loop for ftr in (implied-computed-features self)
                         when (eq (feature-type ftr) :satisfies)
                         do (loop for dep in (concept-references ftr)
                                  do (help-list-depend-ons dep)))))))
      (decf *revise-subgraph-pass-counter*)
      (help-list-depend-ons concept)
      (remove concept result) )))

(defun find-tbox-cycles ()
  "Return a list of cycles of concepts that circularly depend on each
other's definitions."
  (let (listOfCycles)
    (labels ((find-a-cycle (node stack)
	       (let (pos)
		 (cond
		  ((loop for cycle in listOfCycles
		       thereis (member node cycle))
		   nil)
		  ((setq pos (position node stack))
		   ;; trim non-cyclic end of stack  DGB 8/10/93
		   (push (cons node (subseq stack 0 (1+ pos)))
			 listOfCycles)
		   t)			; indicate end of search
		  (t
		   (setq stack (cons node stack))
		   (loop for dep in (depend-ons node)
		       when (and (typep node 'TBOX-CONCEPT)
				 (find-a-cycle dep stack))
		       return dep))))))
      (loop for c in (list-unclassified-concepts)
	    do (find-a-cycle c nil))
      listOfCycles )))


  ;;
;;;;;; Helping function for BACKBORD:
  ;;

(defun find-subsumers&subsumees (expression &optional context)
  ;; Return three values
  ;;   (1) a list of concepts that subsume "expression";
  ;;   (2) a list of concepts subsumed by "expression";
  ;;   (3) a concept equivalent to "expression", or nil if none exists;\
  ;; Restructured for unwind-protect ; TAR 12/13/96
  (let (testConcept unclassifiedDependOn  msg mergeP currentContext
	(supers nil) (subs nil) (equivalentConcept nil))
    (unwind-protect			; To make sure we kill temporary concepts
	(progn
	  (setq testConcept
		(define-concept
		  :is expression :system-characteristics '(:temporary)
		  :classify-immediately 'no))
	  (setq unclassifiedDependOn
		(loop for dep in (depend-ons testConcept)
		      when (not (classified-p dep))
		      collect dep))
	  (if unclassifiedDependOn
	      (warn "The expression ~S refers to the unclassified concept~P ~{~S~^, ~}."
		    expression (length unclassifiedDependOn) unclassifiedDependOn)
	    (progn
	      (when (and context
			 (neq context *context*))
		(check-type context CONTEXT)
		(setq currentContext *context*)
		(setq *context* context))
	      (multiple-value-setq (msg mergeP)
		(compute-msg testConcept :dont-copy-concept t))
	      (if mergeP
		  (setq equivalentConcept (car msg)
			supers (find-named-superconcepts-of-supers
				(super-concepts equivalentConcept))
			subs (find-named-subconcepts-of-subs
			      (sub-concepts equivalentConcept)))
		(progn
		  ;; temporarily link "testConcept" to its super concepts
		  (loop for super in msg
			do (addf (sub-concepts super) testConcept))
		  (setf (super-concepts testConcept) msg)
		  (setq supers (find-named-superconcepts-of-supers msg)
			subs (find-named-subconcepts-of-subs
			      (find-subsumees testConcept))))))))
      
      (if equivalentConcept
	  (delete-concept testConcept)
	(progn
	  (loop for super in msg
		do (delf (sub-concepts super) testConcept))
          (loop for dep in (depend-ons testConcept)
		do (delf (dependents dep) testConcept :test #'eq))
          ;; borrowed from "delete-concept":
          (delf *top-level-unclassified-concepts* testConcept :test #'eq) 
          (delf *list-of-uninterned-concepts* testConcept :test #'eq)))
      (when currentContext
	(setq *context* currentContext)))
    (values supers subs equivalentConcept) ))

  ;;
;;;;;; "find-role-facets"
  ;;

;;; PERHAPS THIS FUNCTION SHOULD BE RENAMED AND/OR MOVED  ; dgb 2/6/91
(defun find-role-facets (concept relation keywords)
  ;; Return a list of values corresponding to the frame keywords
  ;;    "keywords" for the role indicated by the pair "concept"
  ;;    and "relation";
  (let ((restrictions (implied-restrictions concept)))
    (labels 
      ((get-facet-value
	 (keyword)
	 (case keyword
	   (:all
	    (let (type)
	      (loop for res in restrictions
		   when (and (eq (feature-type res) :value-restriction)
			     (subconcept-p (relation res) relation))
		   do (when (or (null type)
				(subconcept-p (value-restriction res) type))
			(setq type (value-restriction res))))
	      (maybe-substitute-set-members type)))
	   (:the
	    (when (eql (get-facet-value :exactly) 1)
	      (get-facet-value :all)))
	   (:some
	    (maybe-prepend-conjunction-operator
	      (append
		(list-of (get-facet-value :all))
		(let ((type 
			(loop for res in restrictions
			     when (and (eq (feature-type res) :min-restriction)
				       (= (lower-bound res) 1)
				       (subconcept-p (relation res) relation)
				       (more-restrictive-defined-range (relation res)))
			     collect (more-restrictive-defined-range (relation res)))))
		  (loop for c in (most-specific-concepts type)
		       collect (maybe-substitute-set-members c))))))
	   (:at-least
	    (let (minimum)
	      (loop for res in restrictions
		   when (and (eq (feature-type res) :min-restriction)
			     (subconcept-p (relation res) relation))
		   do (setq minimum 
			    (if minimum 
				(max minimum (lower-bound res))
				(lower-bound res))))
	      minimum))
	   (:at-most
	    (let (maximum)
	      (loop for res in restrictions
		   when (and (eq (feature-type res) :max-restriction)
			     (subconcept-p relation (relation res)))
		   do (setq maximum 
			    (if maximum 
				(min maximum (upper-bound res))
				(upper-bound res))))
	      maximum))
	   (:exactly
	    (let ((lowerBound (get-facet-value :at-least)))
	      (when (and lowerBound
			 (eql lowerBound (get-facet-value :at-most)))
		lowerBound)))))
       (maybe-substitute-set-members
	 (self)
	 (cond
	   ((typep self 'SET-FEATURE)
	    (generate-set-definition self))
	   ((and (typep self 'UNARY-ENTITY)
		 (system-defined-concept-p self)
		 (defined-set-feature self))
	    (generate-set-definition (defined-set-feature self)))
	   (t 
	    self)))
       (maybe-prepend-conjunction-operator
	 (list)
	 (cond
	   ((keywordp (car list))
	    list)
	   ((cdr list)
	    `(:and ,@list))
	   (t
	    (car list)))))
      (if (consp keywords)
	  (loop for key in keywords
	       collect (get-facet-value key))
	  (get-facet-value keywords)) )))

;; HOOK for USER INTERFACES:
;;  By redefining this function, other forms of progress indication can 
;; be added to the built-in Loom method of printing information.
;; QUESTION:  SHOULD THIS ROUTINE TAKE AN ARGUMENT?

(defun show-progress (activityType)
 "This function is called by `emit-classify-string' if classify dots are
being printed.  It can be redefined by applications to indicate progress
during classification"
  ;; The argument "activityType" indicates the type of LOOM activity in progress.
  ;;  valid values are:  :classify :match
  (declare (ignore activityType))
  t)

(defun show-agent-time ()
 "This function is called by `advance-time-clock' after advancing the
agent time.  It can be redefined by applications to display the current
agent time."
  t)


;;
;;  Support functions for Units
;;

#+:measures
(progn
  (export '(unit-unit unit-value unit-value-as dimensioned-number
	    units base-unit))
  
  (defun unit-unit(m)
    "Returns the unit of the measure as a string"
    (let ((unit (or (and (ms::xdim-number-p m)
			 (ms::%dim-pref-unit m))
		    (and (ms::dim-measure m)
			 (ms::ms-base-unit (ms::dim-measure m)))
		    (and (ms::dim-number-p m)
			 (ms::prim-id-to-unit (ms::%dim-prim-id m))))))
      (when unit (string unit)) ))
  
  (defun unit-magnitude (m)
    "Returns the magnitude of the measure as a number in the units returned by
the `unit-unit' function."
    (if (ms::xdim-number-p m)
	(if (ms::%dim-pref-unit m)
	    (ms::dim-value m (ms::%dim-pref-unit m))
	    (ms::%dim-value m))
        m) )

  (defun unit-value-as (meas unit)
      "(unit-value-as Measure UnitString) => Number. Returns magnitude of a Measure
 in the given unit as long as `Measure' and `UnitString' are compatible.  Can
 be used to extract the value in a desired unit."
      (let ((dimNumber (ms::unit-to-dim-number unit :error-p nil)))
	(when (eql (ms::dim-prim-id meas) 
		   (ms::dim-prim-id dimNumber))
	  (ms:dim-value meas unit)) ))
  
  (defun dimensioned-number (quant unit)
      "(dimensioned-number Quantity UnitString) => Measure.  Creates a Measure
for `Quantity' in the given unit as long as `Quantity' is either a Number, or it
and `UnitString' are compatible.  This can be used to convert from measures in
one unit to another."
      (typecase quant
	(NUMBER (ms::unit-to-dim-number unit :value quant :error-p nil))
	(MS::DIM-NUMBER 
	 (let ((dimNumber (ms::unit-to-dim-number unit :error-p nil)))
	   (when (eql (ms::dim-prim-id quant)
		      (ms::dim-prim-id dimNumber))
	     (ms::unit-to-dim-number unit :value (ms::dim-value quant unit)
				     :error-p nil))))
	(t nil)) )

  (defun get-measure-object (measure)
    (get-slot-value measure (loom-constant MEASURE-OBJECT)))

  (defun units (measure)
    "Returns the units that are defined for the concept `measure'"
    (let ((mObject (get-measure-object measure)))
      (when mObject
	(mapcar #'(lambda (x) (string (first x)))
		(ms::ms-scale mObject))) ))
  
  (defun base-unit (measure)
      "Returns the base unit that is defined for the concept `measure'"
      (let ((mObject (get-measure-object measure)))
	(when mObject
	  (string (ms::ms-base-unit mObject))) ))
  
)
