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

;;; BEHAVIORS (ABOX)

(in-package "LOOM")

(export '( defaction fb pb
	  find-action get-action
	  find-method get-method list-methods print-methods
	  delete-method delete-all-methods
;	   trace untrace 
	  trace-all untrace-all
	  ))


;;; *action/option-table* lists each of the options specifiable
;;;    for an action, the legal values for that option, and
;;;    the name of the slot containing an option value.
;;; *action/default-option-table* lists the default values
;;;    for each action option.
(defparameter *action/option-table*
	      '((:filters
		  (:overrides :most-specific :last-one
			      :select-one :select-all :error :warning)
		  filters)
		(:missing-method
		  (:warning :no-op :error :suspend)
		  missing-method-option)))
(defparameter *action/default-option-table*
	      '((:filters (:most-specific :last-one))
		(:missing-method :warning)))


  ;;
;;;;;; Behavior Partition Functions
  ;;

(defmacro eval-behavior-id (identifier &optional contextName)
  ;; Like "eval-id" but looks in the :behaviors partition
  (expand-eval-id identifier :behaviors contextName))

(defmacro fb (behaviorName &optional (title nil titleSuppliedP))
  ;; Return the action, tactic, or production named "behaviorName";
  (cond
    (titleSuppliedP
     `(find-method ',behaviorName ',title :no-error-p t))
    ((not (stringp behaviorName))
     `(find-or-evaluate-and-find ',behaviorName :behaviors))
    (t
     `(find-method-with-title ',behaviorName :no-error-p t))) )

(defmacro pb (behaviorName &optional (title nil titleSuppliedP))
  ;; Return the action, tactic, or production named "behaviorName";
  ;; Note: The redundancy in the code below avoids embedding pointers
  ;;    into the macro expansions;
  `(let ((behavior ,(if titleSuppliedP
			`(fb ,behaviorName ,title)
			`(fb ,behaviorName))))
     (when behavior
       (pprint (generate-object-definition behavior :augment t))) ))

(defun find-behavior (behaviorOrName behaviorType &key no-warning-p)
  ;; Return the behavior corresponding to "behaviorOrName";
  ;; Helping function for "find-action" and "find-production";
  ;; Return NIL if no object is found;
  (let ((permitWarning (not no-warning-p))
	behavior)
    (cond
      ((null behaviorOrName)
       (when permitWarning
	   (warn "Can't find a behavior named NIL~%"))
       (return-from find-behavior nil))
      ((symbolp behaviorOrName)
       (setq behavior (eval-behavior-id behaviorOrName))
       (when (and (null behavior) permitWarning)
	   (warn "No ~A with the name ~S exists in the current context~%"
		 (string-downcase behaviorType) behaviorOrName)))
      ((typep behaviorOrName behaviorType)
       (setq behavior behaviorOrName) )
      (permitWarning				; "behaviorOrName" has illegal type
       (warn "'~S' is not a behavior" behaviorOrName)))
    behavior ))
  

  ;;
;;;;;; Error handling
  ;;

(defun behavior-parsing-error (message &rest arguments)
  ;; Send an error message, and pop out of "defconcept";
  ;; The special variable *behaviorBeingParsed* contains either
  ;;    the object being parsed or compiled, or a symbol from the
  ;;    set (ACTION LOOM-METHOD PRODUCTION) indicating the type of object
  ;;    experiencing the error;
  (declare (special *behaviorBeingParsed*))
  (let (object objectType objectName objectTitle)
    (cond
      ((typep *behaviorBeingParsed* 'LOOM-OBJECT)
       (setq object *behaviorBeingParsed*)
       (typecase object
	 (ACTION
	   (setq objectType 'ACTION)
	   (setq objectName (name object)))
	 (LOOM-METHOD
	   (setq objectType 'METHOD)
	   (setq objectName (name (action object)))
	   (setq objectTitle (title object)))
	 (PRODUCTION
	   (setq objectType 'PRODUCTION)
	   (setq objectName (name object))
	   (setq objectTitle (name object)))))
      (t					; else is a property list
       (setq objectType (getf *behaviorBeingParsed* :type))
       (setq objectName (getf *behaviorBeingParsed* :name))
       (setq objectTitle (getf *behaviorBeingParsed* :title))))
    (complain "~%Syntax Error:   ~?.~%" message arguments)	; tar 7/2/92
    (when object
	(complain "Error occurred in the definition:~%   ~S~%~%"
		  (generate-object-definition object)))
    (case objectType
      (ACTION
	(complain "Skipping definition of action ~S.~%" objectName))
      (PRODUCTION
	(complain "Skipping definition of production ~S.~%" objectName))
      (LOOM-METHOD
       (complain "Skipping definition of method")
       (when objectName
	   (complain " for action ~S.~%" objectName))
       (if objectTitle
	   (complain " with title ~S.~%" objectTitle)
	   (complain ".~%"))))
    (throw 'parse-behavior-catcher nil) ))

(defun behavior-parsing-warning (message &rest arguments)
  ;; Send an error message, and pop out of "defconcept";
  ;; The special variable *behaviorBeingParsed* contains either
  ;;    the object being parsed or compiled, or a symbol from the
  ;;    set (ACTION LOOM-METHOD PRODUCTION) indicating the type of object
  ;;    experiencing the error;
  (declare (special *behaviorBeingParsed*))
  (complain "~%Syntax Warning:   ~?.~%" message arguments)
  (when (typep *behaviorBeingParsed* 'LOOM-OBJECT)
    (complain "Warning occurred for the definition:~%   ~S~%~%"
	      (generate-object-definition *behaviorBeingParsed*))) )


  ;;
;;;;;; Action Functions
  ;;

(defmacro defaction (name typesOfParameters &key filters missing-method)
  `(redefine-action ',name ',typesOfParameters 
			   :filters ',filters :missing-method ',missing-method) )

(defun get-actual-keyword (keywordSpecifier)
  ;; Does CL parsing of "keywordSpecifier" to extract actual keyword;
  (if (consp keywordSpecifier)          ; Parse keyword syntax
    (if (consp (car keywordSpecifier))
      (caar keywordSpecifier)
      (car keywordSpecifier))
    keywordSpecifier) )

(defun redefine-action (name parameters
			  &key filters missing-method (metaclass 'ACTION))
  ;; Redefine or create an action named "name" in the current context;
  ;; Fill in its slot values; Mark as uncompiled;
  ;; TO DO: ADD CODE TO RECORD "goal";
  (let ((newAction (eval-behavior-id name))
        (fixParamListP nil)
	*behaviorBeingParsed*)
    (declare (special *behaviorBeingParsed*))
    (catch 'parse-behavior-catcher
      (setq *behaviorBeingParsed* `(:type ACTION :name ,name))
      (cond
	((null newAction)
	 (setq newAction (make-loom-instance metaclass :name name))
	 (intern-behavior name newAction))
	((not (typep newAction 'ACTION))
	 (behavior-parsing-error
	   "Another object of type ~S already has the name ~S"
	   (name (class-of newAction)) name)))
      (loop for param in parameters
            when (consp param)
            do (complain 
		"~&~:[Keywords to actions cannot have default values or ~
                      other options.~%~5TProblem occurred in action ~A,~%~5T~
                      p~;~*P~]arameter specified as ~S.~%" 
                      fixParamListP name param)
               (setq fixParamListP t))
      (setf (parameters newAction) 
            (if fixParamListP
              (loop for param in parameters
		    collect (get-actual-keyword param))
              parameters))
      (setf (filters newAction)
	    (validate-action-option :filters (list-of filters)))
      (setf (missing-method-option newAction)
	    (validate-action-option :missing-method missing-method))
      (return-from redefine-action newAction))	; successful parse 
    nil						; bad parse
    ))

(defun validate-action-option (option value)
  ;; Verify that "value" is a legal value or list of values for the
  ;;    action option "option";
  ;; If "value" is nil, return the default value;
  ;; If "value" is illegal, generate a parse error;
  (let ((legalValues (cadr (assoc option *action/option-table*)))
	badValue) 
    (cond
      ((null value)
       (cadr (assoc option *action/default-option-table*)))
      ((setq badValue
	     (loop for v in (list-of value)
		  when (not (member v legalValues))
                  return v))
       (behavior-parsing-error
	 "Illegal ~S action-option: ~S.~%   Legal values are ~S"
	 option badValue legalValues))
      (t
       value)) ))

(defun find-or-create-action (name parameters &key keywords)
  ;; Return an action named "name";
  ;; If none exists, create one with suitable defaults;
  ;; If the actions parameters haven't been filled in, then
  ;;    fill them in from "parameters" and "keywords";
  ;; TO DO: ADD SLOT TO HOLD KEYWORDS, AND ADD VALIDATION THAT FORCES
  ;;    ALL METHODS TO HAVE THE SAME SET OF KEYWORDS;
  (flet ((fixup-parameters ()
	      ;; Changes the keywords of the parameter list for defaction;
	    (if keywords   
	      (append parameters
		      (cons '&key
			    (loop for key in keywords
				  collect (get-actual-keyword key))))
	      parameters)))
    (let ((action (eval-behavior-id name)))
      (if action
	(progn
	  (when (null (parameters action))
	    (setf (parameters action) (fixup-parameters)))
	  action)
	(redefine-action name (fixup-parameters))) )))

(defun get-action (actionOrName &key no-error-p)
  ;; Return the action named "actionOrName", or "actionOrName"
  ;;    itself if its not a symbol;
  ;; If there is none, return nil if "no-error-p" is set, or else
  ;;    generate an error;
  (if (symbolp actionOrName)
      (or (eval-behavior-id actionOrName)
	  (unless no-error-p
	    (error "There is no action named '~S'" actionOrName)))
      actionOrName) )

(defun find-action (actionOrName &key no-warning-p)
  ;; Get action and verify its type;
  (find-behavior actionOrName 'ACTION :no-warning-p no-warning-p) )

(defmethod generate-object-definition ((self ACTION) &key augment)
  ;; Generate a definition of the action "self";
  `(defaction ,(name self) ,(parameters self)
     ,@(loop for entry in *action/option-table*
	    append 
	    (generate-action-option-clause
	      self (first entry) (third entry) :augment augment))) ) 

(defun generate-action-option-clause (self option slotName &key augment)
  ;; Return a form pairing "option" with its value
  ;;    in "self", except return nil when not "augment" and the value
  ;;    equals the default value found in *action/option-table*;
  (let ((value (slot-value self slotName))
	(default (cadr (assoc option *action/default-option-table*))))
    (when (or augment
	      (not (equal value default)))
      `(,option ,value)) ))

;;; NOTHING CALLS THIS!!! FIND A CALLER OR ELIMINATE:
(defun recompile-action (action)
  ;; If concept definitions have changed, "recompile-action" can be
  ;;    called to recompute its tactics;
  (loop for method in (methods action)
       do
       (uncompile-method method)
       (condition&classify-pattern (situation-pattern method))) 
  (loop for method in (methods action) do (compile-method method)) )


  ;;
;;;;;; Tactic Functions
  ;;

;;; These function implement procedures for parsing and compiling new or redefined
;;;    tactics

(defmacro def-loom-method (actionName actionParameters
			   &key title situation with overrides response
			   ;; OBSOLETE:
			   action provided)
  ;; Define or re-define a method;
  ;; The macro "defmethod" expands to a call to "def-loom-method" when
  ;;    either of the keywords :situation or :response are detected
  ;;    within the body of a "defmethod" form;
  (when action (setq response action))		; accomodate obsolete syntax
  (when provided (setq with provided))		; accomodate obsolete syntax
  (if (null response)
      (error "Method ~S has no :response clause" actionName)
      `(redefine-method
	 'LOOM-METHOD
	 ',actionName ',actionParameters ',title ',situation
	 ',with ',overrides ',response)) )

;;; TO DO: CONSIDER PULLING OUT SOME OF THE LOGIC IN "redefine-method" TO
;;;    IMPLEMENT "redefine-tactic".

(defun redefine-method
       (methodType actionName parameterList title situation with overrides methodBody)
  ;; Search for a behavior for action "actionName" which matches either 
  ;;    "situation" or "title";
  ;; If none is found, create a new method;
  (multiple-value-bind (ordinaryParameters keywordParameters)
      (separate-parameters&keywords parameterList)
    (let ((action (find-or-create-action
		      actionName ordinaryParameters :keywords keywordParameters))
	  newMethod pattern 
	  *behaviorBeingParsed*)
      (declare (special *behaviorBeingParsed*))
      (catch 'parse-behavior-catcher
	(setq *behaviorBeingParsed* `(:type METHOD :name ,actionName :title ,title))
	;; create a pattern, classify it, and use it to search for
	;;    a pre-existing method with the same defining (situation
	;;    or event) pattern:
	(when situation
	  (setq pattern
		(condition&classify-pattern
		  (create-pattern situation ordinaryParameters))))
	(setq newMethod (get-matching-method action :title title :pattern pattern))
	(if (null newMethod)
	    (progn
	      (setq newMethod (make-instance methodType))
	      (intern-behavior nil newMethod)
	      (setf (action newMethod) action)
	      (addf (methods action) newMethod)) 
	    (uncompile-method newMethod))	; uncompile pre-existing method 
	(setf (title newMethod) title)
	(when pattern
	  (add-link situation-pattern newMethod pattern))
	(setf (lambda-expression newMethod)
	      (form-method-expression parameterList with methodBody))
	(loop for method in (overrides newMethod)
	     do (del-link overrides newMethod method))
	(loop for method in (validate-overrides action overrides)
	     do (add-link overrides newMethod method))
	;; now that "newMethod" has been initialized, set special variable
	(setq *behaviorBeingParsed* newMethod)
	(validate-method-parameters newMethod action)
	(when (set-difference (collect-free-variables situation :validate-keyword-p t) 
			      ordinaryParameters)
	  (behavior-parsing-error "Situation ~S contains free variable" situation))
	(compile-method newMethod)
	(return-from redefine-method newMethod))	; successful parse
      (delete-method :method newMethod)
      nil					; bad parse
      )))

(defun separate-parameters&keywords (parameterList)
  ;; Helping function for "redefine-method";
  ;; Return two values, a list of ordinary parameters, and a list of
  ;;    keyword parameters;
  (let  ((andKeyPosition (position '&key parameterList)))
    (cond
      (andKeyPosition
       (values (subseq parameterList 0 andKeyPosition)
	       (subseq parameterList (1+ andKeyPosition))))
      (t
       (values parameterList nil))) ))

(defun validate-method-parameters (method action)
  ;; Look for badly matched parameters between "method" and "action";
  (let (methodParameters methodKeywords actionParameters actionKeywords)
    (multiple-value-setq (methodParameters methodKeywords)
      (separate-parameters&keywords (second (lambda-expression method))))
    (multiple-value-setq (actionParameters actionKeywords)
      (separate-parameters&keywords (parameters action)))
    (when (not (= (length methodParameters) (length actionParameters)))
      (behavior-parsing-error "Method and action have different number of parameters"))
    (loop for keyword in methodKeywords
          as realKeyword = (get-actual-keyword keyword)
	  unless (member realKeyword actionKeywords)
	  do
	  (behavior-parsing-error "Method keyword ~S is not declared in action"
				  realKeyword)) ))

(defun get-matching-method (action &key title pattern)
  ;; Helping function for "redefine-method";
  ;; Seach for method belonging to action "action";
  ;; If "title" is set, look for one with a matching title;
  ;; Otherwise, look for a method with an identical situation;
  ;; Generate a parsing error if "title" is nil and "pattern" 
  ;;    matches two existing methods;
  ;; CAUTION: Assumes that "pattern" has already been classified;
  (let ((methods (methods action))
	matchingMethod)
    (when title
      (loop for b in methods
	   when (equal (title b) title)
	   do (return-from get-matching-method b)))
    ;; if we reach here, there was no matching title;
    (when (null title)
      (loop for b in methods
	   do
	   (when (eq (situation-pattern b) pattern)
	     (when matchingMethod 
	       (behavior-parsing-error
		 "Action ~S has two methods that match the pattern ~S;~%   ~
	     	      A title must be specified to disambiguate the redefined method."
		 (name action) (source-query pattern)))
	     (setq matchingMethod b))))
    matchingMethod ))

(defun form-method-expression (parameterList withClause methodBody)
  ;; Return a lambda-expression which evaluates the "methodBody" specified in the
  ;;    :response clause of the current method definition;
  ;; If the "withClause" contains free variables not found in the method's
  ;;    "parameterList", the "methodBody" is executed once for each binding of
  ;;    the free variables;
  ;; If there is a "withClause" but it contains no free variables, the
  ;;    "methodBody" is executed if the "withClause" is satisfied;
  ;; If there is no "withClause" the "methodBody" is executed unconditionally;
  (let* ((withClauseFreeVariables (collect-free-variables withClause))
	 (freeVariables 
	   (set-difference withClauseFreeVariables parameterList))
	 (ignoreVariables
	   (set-difference 
	     (collect-free-variables parameterList)
	     (union withClauseFreeVariables (collect-free-variables methodBody))))
	 (ignoreForm (when ignoreVariables 
		       `((declare (#+:MCL ignorable #-:MCL ignore
                                   ,@ignoreVariables)))))
	 (withQuery
	   (when withClause
	     (wrap-with-query-clean-up-instances-code
	       (form-query freeVariables withClause)))))
    (cond
      (freeVariables 
       `(lambda ,parameterList ,@ignoreForm
		(loop for tuple in ,withQuery
		     do
		     (let ,(loop for var in freeVariables
				as i from 0
				collect `(,var (nth ,i tuple)))
		       ,@methodBody))))
      (withClause
       `(lambda ,parameterList ,@ignoreForm
		(when ,withQuery 
		  ,@methodBody)))
      (t
       `(lambda ,parameterList ,@ignoreForm
		,@methodBody))) ))

(defmethod compile-method ((self TACTIC))
  ;; Compute and compile a situation condition for "self";
  ;; If the action of "self" includes a :most-specific filter,
  ;;    compute the set of less-specific methods;
  ;; Note: A generic test for the null pattern is used because
  ;;    we don't generate a null patterns for each different number
  ;;    of input variables;
  (let ((pattern (situation-pattern self))
	(action (action self)))
    (setf (compiled-situation-test self)
	  (if (null pattern)
	      #'null-pattern-test-p
	      (progn
		(seal-pattern pattern)
		(compiled-query pattern))))
    (when (member :most-specific (filters action)) 
      (install-less-specific-links self (methods action)))
    ;; if method can fail, change class of action to FALLIBLE-ACTION:
    (when (method-can-fail-p self)
      (setf (methods-can-fail (action self)) t)) ))

(defun validate-overrides (action methodTitles)
  ;; Verify that all of the "methodTitles" identify methods which have
  ;;    already been defined;
  ;; Return a list of the overridden methods having those titles;
  (loop for title in (list-of methodTitles)
       collect
       (let ((overriddenMethod (get-method action title :no-error-p t)))
	 (when (null overriddenMethod)
	   (behavior-parsing-error
	     "The overridden method with title ~S is undefined" title))
	 overriddenMethod)) )

(defun install-less-specific-links (self otherMethods)
  ;; Helping function for "compile-method";
  ;; Compare the situation pattern for "self" with those for the
  ;;    members of "otherMethods";
  ;; Place "less-specific" links between all pairs of methods where
  ;;    a less-specific subsumption relationship exists between their
  ;;    patterns;
  ;; Note: Assumes that "self" may belong to "otherMethods";
  (let ((pattern (situation-pattern self))
	otherPattern)
    (loop for other in otherMethods
	 when (neq other self)
	 do
	 (setq otherPattern (situation-pattern other))
	 (when (neq otherPattern pattern)
	   (cond
	     ((null otherPattern)
	      (addf (less-specific-methods self) other))
	     ((null pattern)
	      (addf (less-specific-methods other) self))
	     ((subconcept-p pattern otherPattern)
	      (addf (less-specific-methods self) other))
	     ((subconcept-p otherPattern pattern)
	      (addf (less-specific-methods other) self))))) ))

(defmethod uncompile-method ((self TACTIC))
  ;; Called by "redefine-method" and "delete-method";
  ;; Remove any less-specific links between "self" and other methods;
  ;; Render method inoperable, but reusable;
  (setf (less-specific-methods self) nil)
  (loop for otherMethod in (methods (action self))
       when (neq otherMethod self)
       do (delf (less-specific-methods otherMethod) self))
  (setf (compiled-situation-test self) nil) )

(defun delete-method (&key action title method error-p)
  ;; Delete the method indicated either with :action and :title,
  ;;    or with :method; 
  (cond
    ((and action title)
     (setq method (get-method action title :no-error-p t)))
    ((null method)
     (error "'delete-method' requires either :action AND :title or :method")))
  (cond
    (method
     (uncompile-method method)
     (delf (methods (action method)) method)
     (delf *traced-method-specs* (name (action method)))  ; DGB 11/24/92
     (unintern-behavior method)		; TAR 4/14/98
     method)
    (error-p
     (error "Can't delete non-existent method: ~S~%" title))) )

(defun delete-all-methods (action)
  ;; Delete all methods belonging to "action";
  (loop for method in (methods action)
       do (delete-method :method method)) )

(defun get-method (action title &key no-error-p)
  ;; Return the method with action "action" and title "title";
  ;; Note: "get-method" is MUCH faster than "find-method" and should
  ;;    be used everywhere internally;
  (setq action (get-action action :no-error-p no-error-p))
  (or (and action
	   (loop for b in (methods action)
		when (equal (title b) title)
                return b))
      (unless no-error-p
	  (error "There is no method with action ~S and title ~S"
		 action title))) )

(defmacro find-method (actionOrTitle &optional (title :unsupplied) &rest no-error-p)
  "Return the method with action `action' and title `title';
   If no method is found and no title is specified, then also look
   for any method at all with a title matching `actionOrTitle'"
  (when (eq title :no-error-p)
    (setq title :unsupplied)
    (push :no-error-p no-error-p))
  (setq no-error-p (second no-error-p))
  (if (eq title :unsupplied)
      `(find-method-with-title ,actionOrTitle :no-error-p ,no-error-p)
      `(or (unbreakable-get-method ,actionOrTitle ,title :no-error-p t)
	   (find-method-with-title , title :no-error-p ,no-error-p))) )

(defun unbreakable-get-method (action title &key no-error-p)
  ;; Helping function for "find-method";
  (and (or (symbolp action)
	   (typep action 'ACTION))
       (get-method action title :no-error-p no-error-p)) )

(defun find-method-with-title (title &key no-error-p)
  ;; Scan all actions looking for a method with title "title",
  ;;   or look for an action matching "title" having a single method;
  ;; For strings, upcase before comparing;
  (flet ((maybe-upcase
	   (title)
	   (typecase title
	     (string (string-upcase title))
	     (otherwise title))))
    (let (matchingMethod)
      (loop for object in (list-context :partitions :behaviors)
	   when (typep object 'ACTION)
	   do
	   (when
	     (setq matchingMethod
		   (loop for m in (methods object)
			when (equal (maybe-upcase (title m))
				       (maybe-upcase title))
                        return m))
	     (return-from find-method-with-title matchingMethod))))
    ;; this catches case of 1 method and slightly funny input:
    (let ((matchingAction (find-action title)))
      (when (and matchingAction
		 (methods matchingAction)
		 (null (rest (methods matchingAction))))
	(return-from find-method-with-title (first (methods matchingAction)))))      
    (unless no-error-p
      (error "Can't find a method with title ~S" title)) ))

(defun list-methods (action)
  ;; Return a list of the methods belonging to "action";
  (methods action) )

(defun print-methods (action)
  ;; Print definitions of all methods belonging to "action";
  (loop for method in (methods action)
       do (pprint (generate-object-definition method :augment-p t))) )


  ;;
;;;;;; Method Functions
  ;;

;;; The bodies of methods are specified by Lisp code.

(defmethod parse-method-body ((self LOOM-METHOD) parameterList methodBody)
  ;; Combine "parameterList" and (the Lisp forms list) "methodBody" into
  ;;    a lambda expression, and store it into "self";
  (setf (lambda-expression self)
	`(lambda ,parameterList ,@methodBody)) )

(defmethod compile-method ((self LOOM-METHOD))
  ;; Compile the lamda expression for "self";
  ;; Compile situation condition, and install less-specific links;
  #L:trace-tasks (trace-values (lambda-expression self))
  (setf (compiled-method self)
	(compile nil (lambda-expression self)))
  (call-next-method) )

(defmethod method-can-fail-p ((self LOOM-METHOD))
  ;; Helping function for "compile-method";
  ;; Return t if the body of "self" contains the form "(fail)";
  (method-body-can-fail-p (lambda-expression self)) )

(defun method-body-can-fail-p (methodBody)
  ;; Helping function for "LOOM-METHOD.method-can-fail-p";
  ;; Return t if the "methodBody" contains the form "(fail)";
  (cond
    ((atom methodBody) nil)
    ((cdr methodBody)
     (loop for item in methodBody thereis (method-body-can-fail-p item)))
    (t
     (eq (car methodBody) 'fail))) )

(defmethod uncompile-method ((self LOOM-METHOD))
  ;; Remove effects of "compile-method";
  (setf (compiled-method self) nil)
  (call-next-method) )
 
(defmethod generate-object-definition ((self LOOM-METHOD) &key augment)
  ;; Generate a definition of the method "self";
  `(defmethod ,(name (action self)) ,(cadr (lambda-expression self))
     ,@(when (title self)
	 `(:title ,(title self)))
     ,@(when (situation-pattern self)		; TAR 10/24/91
	 `(:situation ,(source-query (situation-pattern self))))
     ,@(when (overrides self)
	 `(:overrides ,(loop for m in (overrides self) 
			    collect (title m))))
     ,@(when (and augment (overridden-by self))
	 `(:overridden-by ,(loop for m in (overridden-by self) 
				collect (title m))))
     :response ,(cddr (lambda-expression self))) )


  ;;
;;;;;; Plans
  ;;

;;; NOT YET IMPLEMENTED.



  ;;
;;;;;; "apply-action"
  ;;

(defun apply-action (action arguments)
  ;; Apply action "action" to arguments "arguments";
  ;; Return two values: the result of the last method applied,
  ;;    and a flag indicating success or failure of that method;
  ;; Procedure:
  ;;    (1) Select a method or methods, and filter the candidate methods;
  ;;    (2) Apply each surviving method to "arguments";
  (declare (inline get-action))
  (setq action (get-action action :no-error-p nil))
  (let* ((parameters (parameters action))
	 (numberOfOrdinaryParameters (position '&key parameters))
	 (ordinaryArguments
	   (if numberOfOrdinaryParameters
	       (subseq arguments 0 numberOfOrdinaryParameters)
	       arguments))
	 (methods
	   ;; find all methods which satisfy their situation conditions 
	   (loop for m in (methods action)
		when (apply (compiled-situation-test m) ordinaryArguments)
		collect m))
	 result)
    (cond
      ((null methods)				; act on failure if no methods
       (return-from apply-action
	 (perform-missing-tactic-method action arguments "No applicable method")))
      ((null (cdr methods))			; quick exit if exactly one method
       (setq result
	     (catch 'failed-method-catcher
	       (setq result (apply-compiled-method action (car methods) arguments))
	       (return-from apply-action (values result t))))	; return success
       (return-from apply-action (values result nil))))	; return failure
    
    ;; situation: two or more candidate methods found; apply filters
    (setq methods (filter-methods action methods ordinaryArguments)) 
    ;; execute all surviving methods, rechecking their situation
    ;;    conditions;
    (setq result
	  (catch 'failed-method-catcher
	    (setq result
		  (apply-compiled-method action (car methods) arguments))
	    (loop for m in (cdr methods)
		 when (apply (compiled-situation-test m) ordinaryArguments)
		 do 
		 (setq result (apply-compiled-method action m arguments)))
	    (return-from apply-action (values result t))))	; return success
    (values result nil)	))			                ; return failure


(defun apply-compiled-method (action method arguments)
  ;; Apply the compiled method associated with "method" to "arguments";
  ;; Output trace information if tracing is enabled for "action";
  (flet ((apply-with-method-tracing (method arguments) ; tar 6/25/93
	    ;; Wraps tracing calls around applying "method" to "arguments";
	   (let (results)
	     (trace-method-entry method arguments)
	     (let (#+TI        (SYS::trace-level     (1+ SYS::trace-level))
		   #+Symbolics (SI::trace-level      (1+ SI::trace-level))
		   #+Lucid     (LUCID::*trace-level* (1+ LUCID::*trace-level*))
		   #+MCL       (CCL::*trace-level*   (1+ CCL::*trace-level*))
		   #+EXCL      (EXCL::trace-level    (1+ (or EXCL::trace-level
							     0))))
	       (setq results   ; Handle multiple value methods:
		     (multiple-value-list
		      (apply (compiled-method method) arguments))) )
	     (trace-method-exit method results)
	     (values-list results)) ))

    (if (trace-enabled-p action)
      (apply-with-method-tracing method arguments)
      (apply (compiled-method method) arguments)) ))

(defun perform-missing-tactic-method (action arguments reason)
  ;; Situation: No method was found to successfully perform the action "action";
  ;; Perform the failure-handling method;
  (case (missing-method-option action)
    (:no-op (values nil t))			; return nil and success
    (:error
     (error "Failed to apply action ~S to arguments ~S because ~A."
	    (name action) arguments reason))
    (:warning
     (warn "Failed to apply action ~S to arguments ~S because ~A."
	   (name action) arguments reason)
     (values nil nil))				; return nil and failure
    ) )


  ;;
;;;;;; Filter functions
  ;;

(defun filter-methods (action methods ordinaryArguments)
  ;; Called by "perform-task";
  ;; Apply filters for "action" to reduce the number of candidate
  ;;    methods, starting with the set "methods";
  ;; Return the set of filtered methods;
  (loop for filter in (filters action)
       do
       (setq methods
	     (case filter
	       (:overrides (filter-using-override methods))	; dgb 2/12/90
	       (:most-specific (filter-using-specificity methods))
	       (:last-one (filter-using-last-defined methods))
	       (:select-one (filter-using-random-choice methods))
	       (:select-all methods)
	       (:error (error "In performing action ~S on arguments ~S:~%   ~
                                 Cannot select among methods ~S."
			      (name action) ordinaryArguments methods))
	       (:warning
		(warn "In performing action ~S on arguments ~S:~%   ~
                          Cannot select among methods ~S."
		      (name action) ordinaryArguments methods)
		methods)))
       (when (null (cdr methods))		; exit loop if only one method left
	 (return nil)))				; end for
  methods )

;;; REPLACED BY OVERRIDES
;(defun filter-using-preferences (methods arguments)
;  ;; Retrieve preferences which may eliminate some members of "methods";
;  ;; Preferences may be FIXED, or they may be CONDITIONAL, meaning that
;  ;;    their applicability depends on the world state and "arguments";
;  ;; Return the most-preferred methods;
;  (declare (ignore arguments))
;  "NOT YET IMPLEMENTED"
;  methods )

(defun filter-using-override (methods)
  ;; Return the methods in "methods" which are not overridden;
  (loop for m in methods do (setf (marked-p m) nil))
  (loop for m in methods
       do
       (loop for reject in (overrides m)
	    do (setf (marked-p reject) t)))
  (loop for m in methods
       when (not (marked-p m))
       collect m) )

(defun filter-using-specificity (methods)
  ;; Return the most-specific of the methods in "methods", determined
  ;;    by the specificity of their situation conditions;
  (loop for m in methods do (setf (marked-p m) nil))
  (loop for m in methods
       when (not (marked-p m))
       do
       (loop for reject in (less-specific-methods m)
	    do (setf (marked-p reject) t)))
  (loop for m in methods
       when (not (marked-p m))
       collect m) )

(defun filter-using-last-defined (methods)
  ;; Return the method closest to the from of the list of
  ;;    methods attached the action -- this was the most
  ;;    recently-defined method; 
  (loop for m in (methods (action (car methods)))
       when (member m methods)
       do (return (list m))) )

(defun filter-using-random-choice (methods)
  ;; Return one of "methods";
  (let ((position (incf *random-method-position*)))
    (when (>= position (length methods))
      (setq position 0)
      (setq *random-method-position* 0))
    (list (nth position methods)) ))


  ;;
;;;;;; Preferences (NOT YET THOUGHT OUT)
  ;;

(defmacro prefer (preferredMethod &key to when)
  `(define-preference ',preferredMethod ',to ',when))

(defun add-unconditional-preference (preferredMethod lessPreferredMethod)
  ;; Define a preference link between "preferredMethod" and "lessPreferredMethod";
  (addf (less-preferred-methods preferredMethod) lessPreferredMethod) )
  
(defun delete-unconditional-preference (preferredMethod lessPreferredMethod)
  ;; Remove a preference link between "preferredMethod" and "lessPreferredMethod";
  (delf (less-preferred-methods preferredMethod) lessPreferredMethod) )


  ;;
;;;;;; Tracing of Methods
  ;;


;;; MOVED TO TBOX/GLOBALS.LISP  ; DGB 12/2/92
;(defparameter *traced-relation-specs* nil)
;(defparameter *traced-method-specs* nil)

(defmacro trace (&body specifications)
  ;; Enable tracing of the functions specified in "specifications"; these
  ;;    may be LOOM methods, as well as PCL methods and LISP functions;
  (let (tracedRelations tracedMethods tracedFunctions)
    (if (null specifications)
	`(append *traced-relation-specs* *traced-method-specs* (COMMON-LISP:trace))
	(progn
	  (loop for spec in specifications
	       do (cond
		    ((find-relation spec :no-warning-p t)
		     (push spec tracedRelations))
		    ((find-action spec :no-warning-p t)
		     (push spec tracedMethods))
		    (t
		     (push spec tracedFunctions))))
	  
	  `(append
	     ,@(when tracedRelations `((trace-relations ',tracedRelations)))
	     ,@(when tracedMethods `((trace-methods ',tracedMethods)))
	     ,@(when tracedFunctions `((COMMON-LISP:trace ,@tracedFunctions)))))) ))

(defun trace-methods (specifications)
  ;; Helping function for "LOOM::trace";
  (loop for spec in specifications
       do (let ((action (find-action spec)))
	    (setf (trace-enabled-p action) t)
	    (pushnew spec *traced-method-specs*))) 
  specifications )

(defun trace-relations (specifications)
  ;; Helping function for "LOOM::trace";
  (within-context *context*             ; Needed for seal-predicate-symbol
    (loop for spec in specifications
          do 
          (let ((relation (find-relation spec)))
	    (if (sealed-p relation)
	      (let ((*tracePredicateP* t))
	        (declare (special *tracePredicateP*))
	        (seal-predicate-symbol relation)
	        (pushnew spec *traced-relation-specs*))
	      (complain "~%Can't trace unsealed relation ~S" relation))))
    specifications ))

(defmacro untrace (&body specifications)
  ;; Disable tracing of the functions specified in "specifications"; these
  ;;    may be LOOM methods, as well as PCL methods and LISP functions;
  (let (tracedRelations tracedMethods tracedFunctions)
    (if (null specifications)
	`(append (untrace-relations *traced-relation-specs*)
		 (untrace-methods *traced-method-specs*) 
		 (COMMON-LISP:untrace))
	(progn
	  (loop for spec in specifications
	       do (cond
		    ((find-relation spec :no-warning-p t)
		     (push spec tracedRelations))
		    ((find-action spec :no-warning-p t)
		     (push spec tracedMethods))
		    (t
		     (push spec tracedFunctions))))
	  `(append
	     ,@(when tracedRelations `((untrace-relations ',tracedRelations)))
	     ,@(when tracedMethods `((untrace-methods ',tracedMethods)))
	     ,@(when tracedFunctions `((COMMON-LISP:untrace ,@tracedFunctions)))))) ))

(defun untrace-methods (specifications)
  ;; Helping function for "LOOM::untrace";
  (loop for spec in specifications
       do (setf (trace-enabled-p (find-action spec)) nil))
  (setq *traced-method-specs*
	(set-difference *traced-method-specs* specifications)) 
  specifications )

(defun untrace-relations (specifications)
  ;; Helping function for "LOOM::untrace";
  (within-context *context*             ; Needed for seal-predicate-symbol
    (loop for spec in specifications
          do 
          (let ((relation (find-relation spec)))
	    (if (sealed-p relation)
	      (seal-predicate-symbol relation)
	      (complain "~%Can't untrace unsealed relation ~S" relation))))
    (setq *traced-relation-specs*
	  (set-difference *traced-relation-specs* specifications)) 
    specifications ))

(defun trace-method-entry (method arguments)
  ;; Print a message indicating that LOOM method "method" has been
  ;;    entered with arguments "arguments";
  ;; Try to integrate smoothly with LISP function tracing by
  ;;    following standard formatting conventions;
  ;; TO DO: Extend this to other LISPs;
  (let (pattern)
				; Changed format statement ;tar 6/25/93
    (format *trace-output* "~%~v,0T(1 ENTER ~S-~S~@[:~{ ~S~}~])"
	    (* 2 #+TI        SYS::trace-level
	         #+Symbolics SI::trace-level
		 #+Lucid     LUCID::*trace-level*
		 #+MCL       CCL::*trace-level*
		 #+EXCL      (or EXCL::trace-level 0)  ; sometimes NIL!
		 #-(or TI Symbolics Lucid MCL EXCL) 0)
	    (name (action method))
	    (or (title method)
		(and (setq pattern (situation-pattern method))
		     (source-query pattern))
		:UNTITLED)
	    arguments) ))

(defun trace-method-exit (method results)
  ;; Print a message indicating that LOOM method "method" has 
  ;;    exited with (multiple-) value "results";
  ;; TO DO: Extend this to other LISPs;
  (let (pattern)
				 ; Changed format statement ;tar 6/25/93
    (format *trace-output* "~%~v,0T(1 EXIT ~S-~S~@[:~{ ~S~}~])" 
	    (* 2 #+TI        SYS::trace-level
	         #+Symbolics SI::trace-level
		 #+Lucid     LUCID::*trace-level*
		 #+MCL       CCL::*trace-level*
		 #+EXCL      (or EXCL::trace-level 0) ; Sometimes NIL!
		 #-(or TI Symbolics Lucid MCL EXCL) 0)
	    (name (action method))
	    (or (title method)
		(and (setq pattern (situation-pattern method))
		     (source-query pattern))
		:UNTITLED)
	    results) ))

(defun trace-all ()
  "Enable global tracing of productions and transactions"
  (setq *trace-all-p* t) )

(defun untrace-all ()
  "Disable global tracing of productions and transactions"
  (setq *trace-all-p* nil) )


  ;;
;;;;;; Housekeeping functions
  ;;


(defun intern-behavior (identifier object &key context)
  ;; Intern the behavior "object" into the context "context" or
  ;;    *context*, indexed on "identifier";
  ;; Set "(context object)" to the context;
  (let ((context (or context *context*)))
    (setf (context object) context)
    (intern-object identifier object :behaviors context) ))

(defun unintern-behavior (object)
  ;; Unintern the behavior "object" from its context
  (when (context object)
    (unintern-object object :behaviors (context object))))


(defun detach-behavior-objects (partition)
  ;; Helping function for "clear-one-context";
  ;; Delete all methods and productions attached to each action;
  (do-context-partition
    (nil behavior partition)
    (detach-one-behavior behavior)) )

(defmethod detach-one-behavior ((self ACTION))
  ;; Helping method for "detach-behavior-objects";
  ;; Delete "self" and all dependent methods and productions;
  ;; BUG: WE DON'T YET DELETE ACTIONS;
;; THESE SHOULD BE UNNECESSARY, SINCE PRODUCTIONS AND METHODS DELETE THEMSELVES
;  (loop for m in (methods self)
;        do (delete-method :method m))
;  (loop for r in (dependent-productions self)
;        do (delete-production r))
  )

(defmethod detach-one-behavior ((self LOOM-METHOD))
  ;; Helping method for "detach-behavior-objects";
  ;; Delete the method "self";
  (delete-method :method self) )

(defmethod detach-one-behavior ((self PRODUCTION))
  ;; Helping method for "detach-behavior-objects";
  ;; Delete the production "self";
  (delete-production self) )
  
  
;;; TO DO
  
#|

CONSIDER MAKING "defaction" NULLIFY PREVIOUSLY-DEFINED
METHODS

Finish keyword argument handling, to check for different keyword options
   and make "subseq" call in "perform-task" conditional;

Handle case when event or situation pattern's concept
is deleted;

Write WHO-CALLS-IT

|#
  



