;;; -*- Mode:Common-Lisp; Package:LOOM; Syntax:COMMON-LISP; Base:10 -*-

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

;;; CONTEXTS.LISP (TBOX)

;;; Context functions

(in-package "LOOM")

(export '( get-context find-context list-context list-contexts
           current-context context-stack
           in-context change-context within-context with-context
           cc push-context pop-context
           defcontext define-context destroy-context creation-policy
           export-names-in-context))


  ;;
;;;;;; Context Partition Cache Macros and Functions
  ;;

(defun make-ns-cache (instanceNS conceptNS relationNS behaviorNS)
  (cons (cons instanceNS conceptNS)
	(cons relationNS behaviorNS)))

(defmacro ns-cache-instances (x) `(caar ,x))
(defmacro ns-cache-concepts (x) `(cdar ,x))
(defmacro ns-cache-relations (x) `(cadr ,x))
(defmacro ns-cache-behaviors (x) `(cddr ,x))


  ;;
;;;;;; Exported Context Functions
  ;;

(defun get-context (contextOrName)
  "Return the context whose name matches `contextOrName'.  Assumes that a
non-symbol is a legal context."
  (if (symbolp contextOrName)
    (cdr (assoc contextOrName *context-table*))
    contextOrName) )

(defun find-context (contextOrName &key error-p (match :case-insensitive))
  "Return the context whose name matches `contextOrName'.
If `error-p', then generate an error if there is no such context.
Note: `get-context' is slightly faster, but can't handle strings and
eliminates type checking."
  (let ((context
         (typecase contextOrName
           (SYMBOL (case match
		     (:exact (get-context contextOrName))
		     (:case-insensitive
		      (or (get-context contextOrName))
		          (string-find-context (symbol-name contextOrName) 
					       match t))
		     (otherwise (string-find-context (symbol-name contextOrName) 
					       match nil))))
           (CONTEXT contextOrName)
           (STRING (string-find-context contextOrName 
					match
				       (member match '(:exact :case-insensitive))))
           (otherwise 
            (grumble "Argument ~A to `find-context' must be a symbol, string or a
context." contextOrName)
            (return-from find-context nil)))))
    (when (and (null context) error-p)
      (cerror "Return NIL" "No context matches the name ~S." contextOrName))
    (cond ((atom context) context)
	  ((null (cdr context)) (first context))
	  (t context)) ))

(defun string-find-context (contextStringName match singleValueP)
  ;; Called by "help-parse-extended-identifier";
  ;; Return the context whose name matches the string "contextStringName";
  (let* ((testFn (generate-match-function contextStringName match))
	 (contexts (loop for entry in *context-table*
		       when (funcall testFn (symbol-name (car entry)))
		       collect (cdr entry))))
    (cond ((null (cdr contexts))
	   (first contexts))
	  (singleValueP
	   (grumble "Can't disambiguate reference to the context named ~A because
the contexts ~{~S~^ and~} have the same symbol name."
		    contextStringName (mapcar #'name contexts)))
	  (t contexts)) ))

(defun current-context ()
  "Return the current context."
  *context* )

(defun context-stack ()
  "Return the current context stack."
  *context-stack* )

(defmacro defcontext (contextName typeOfContext parentContexts
                          &key creation-policy open-closed-mode monotonic-p)
   "Create a new context called `contextName' of type `typeOfContext' that
inherits the contexts `parentContexts'.  Legal types are :theory, :workspace,
:island, and :world.  `creation-policy' indicates the meta-class for
instances created in this context -- this establishes the inference policy
for the context.  Legal policies are `:classified-instance', `:lite-instance',
and :clos-instance.  The default policy creates CLOS instances for workspaces
and LITE instances for theories.
`open-closed-mode' indicates the default semantics assumption for this context.
Valid values are :open for open world semantics, :closed for closed world
semantics or NIL to inherit from the parents."
  `(define-context ',contextName ',typeOfContext ',parentContexts 
     :creation-policy ,creation-policy
     :open-closed-mode ,open-closed-mode
     :monotonic-p ,monotonic-p) )

(defmacro in-context (contextName)
  "Replace the top of the context stack with the context `contextName' and
reset the current context.  Unlike `change-context', `in-context' evaluates at compile and load time.
  It can only appear at top-level in a Lisp program."
  (when (quoted-p contextName)
    (setq contextName (second contextName)))
  (make-top-level-form
    `(in-context ,contextName)
    '(compile load eval)
    `(change-context ',contextName)) )

(defun change-context (contextOrName)			
  "Replace the top of the context stack with the context `contextOrName' and
reset the current context.  Return the new current context."
  (when (eq contextOrName *context*)
    (return-from change-context contextOrName))
  (let ((context (find-context contextOrName)))
    (when (eq context *context*)
      (return-from change-context contextOrName))
    (unless context (grumble "Context ~A not found." contextOrName))
    (reset-current-context context) ))

;(defmacro within-context (contextOrName &body body)
;  "Execute `body' with context temporarily set to `contextOrName'."
;  `(progn (push-context ,contextOrName)
;          (unwind-protect
;            (progn ,@body)
;            (pop-context))) )

;(defmacro within-context (contextOrName &body body)
;  "Execute `body' with context temporarily set to `contextOrName'."
;  (let ((contextVar (gensym "CONTEXT-"))
;	(savedContext (gensym "SAVED-")))
;    `(let ((,contextVar ,contextOrName)
;	   (,savedContext (cc)))
;       (unless (bottom-theory-p ,contextVar)
;         (change-context ,contextVar)
;         (unwind-protect
;           (progn ,@body)
;           (change-context ,savedContext))) ) ))

;; Make safer.  Don't do BODY if the requested context isn't defined!

(defmacro within-context (contextOrName &body body)
  "Execute `body' with context temporarily set to `contextOrName'."
  (let ((contextVar (gensym "CONTEXT-"))
	(contextNameVar (gensym "CONTEXT-"))
	(savedContext (gensym "SAVED-"))
	(errorP (gensym "ERROR-")))
    `(let ((,savedContext (cc))
	   (,contextNameVar ,contextOrName))
       (multiple-value-bind (,contextVar ,errorP)
	   (coerce-to-context ,contextNameVar :dont-break-p t)
	 (if ,errorP
	     (grumble
	      "There is no context ~A in WITHIN-CONTEXT form.~%Skipping body."
	      ,contextNameVar)
	     (unless (bottom-theory-p ,contextVar)
	       (change-context ,contextVar)
	       (unwind-protect
		   (progn ,@body)
		 (change-context ,savedContext)))) )) ))



(defmacro with-context ((contextOrName &key exit-on-incoherence-p) &body body)
  "Execute `body' with context temporarily set to `contextOrName'.
`exit-on-incoherence-p' forces an immediate exit if incoherence is detected,
returning two values, the offending instance and the keyword :incoherent."
  (let  ((resultVar (gensym "RESULT"))
         (contextVar (gensym "CONTEXT")))
    `(let ((,contextVar (get-context ,contextOrName))
           (*exitIncoherentWorldP* ,exit-on-incoherence-p)
           ,resultVar)
       (declare (special *exitIncoherentWorldP*))
       (setq ,resultVar
             (catch 'incoherent-world-catcher
               (within-context ,contextVar ,@body)))
       (case ,resultVar
         (:incoherent
          (destroy-context ,contextVar)
          (values *exitIncoherentWorldP* :incoherent))
         (otherwise ,resultVar)) )))

(defmacro cc (&optional contextName)
  "Change context, or if `contextName' is null, return the current context."
  (if contextName
    `(let* ((name ',(if (quoted-p contextName) (second contextName) contextName))
            (context (find-context name)))
       (when (null context)
	 (cond ((symbolp name)
		(setq context
		  (or (find-context (symbol-append (name "-THEORY")
						   (symbol-package name)))
		      (find-context (symbol-append (name "-CXT")
						   (symbol-package name))))))
	       ((stringp name)
		(setq context
		  (or (find-context (concatenate 'string name "-THEORY"))
		      (find-context (concatenate 'string name "-CXT")))))))
       (change-context (or context name)))
    '(current-context)) )

(defun push-context (contextOrName)
  "Push the context `contextOrName' onto the context stack, and make it
the current context.  Return the new current context."
  (let ((context (get-context contextOrName)))
    (if context
      (progn (push context *context-stack*)      ; "reset-current-context" may clobber this.
             (reset-current-context context))
      (grumble "No context named ~A found!" contextOrName))) )

(defun pop-context ()
  "Pop the current context from the context stack, and make the new top-most
context on the stack the current context.  Return the new current context."
  (if (rest *context-stack*)
    (progn
      (pop *context-stack*)
      (reset-current-context (first *context-stack*)))
    (progn
      (grumble "Can't pop the only remaining context")
      *context*)) )

(defmacro list-context (&rest arguments)
  "Return a list of objects in the specified `partitions' of the context
      named `context'.
   The :partitions keyword indicates what partitions are to be
       retrieved, while the optional parameter `context' indicates
       what context to use.
   Setting the keyword :sort-p to t causes the result to be sorted.  Setting
       :sort-p to :sort-each-partition causes individual partitions to be sorted.
       Setting it to :as-defined causes partitions to sort in order of definition."
  #+(or :lcl3.0 (and (not :lucid) (not :xerox)))
  (declare (arglist &optional context &key :partitions :sort-p))
  (multiple-value-bind (context options)
      (separate-optional&key-arguments arguments '(:partitions :sort-p) "list-context")
    (setq context (car context))
    `(list-context-objects
       (coerce-to-context ,context)
       ,(getf options :partitions)
       ,(getf options :sort-p)) ))

(defmacro do-context ((iterationVar context &key partitions) &body body)
  ;; Iterate over the partitions "partitions" of "context",
  ;;    and evaluate "body" for each object bound to "iterationVar";
  `(loop for p in (collect-partitions ,context ',partitions)
	    do (do-context-partition (nil ,iterationVar p) ,@body)) )

(defmacro do-context-partition 
	  ((key value partitionForm &key skip-anonymous-instances-p) &body body)
  ;; Iterate over all objects and anonymous objects in "partition",
  ;;    and evaluate "body" for each binding of an object to "value"
  ;;    and its key to "key";
  ;; "key" is always bound to nil for anonymous objects;
  ;; If "key" is nil upon input, generate code for dummy key;
  (let ((dummyVar (gensym "DUMMY-")))
    `(let ((partition ,partitionForm))
       ,(if key
	    `(maphash (function (lambda (,key ,value) ,@body))
		      (name-space partition))
	    `(maphash (function (lambda (,dummyVar ,value)
				  (declare (ignore ,dummyVar)) ,@body))
		      (name-space partition)))
       ,@(when (null skip-anonymous-instances-p)
	   `(,(if key
		  (unless skip-anonymous-instances-p 
		    `(let ((,key nil))
		       (do-anonymous-partition-objects (,value partition) ,@body)))
		(unless skip-anonymous-instances-p 
		  `(do-anonymous-partition-objects (,value partition) ,@body))))) )
    ))
  
(defmacro do-anonymous-partition-objects ((iterationVar partitionForm) &body body)
    ;; Helping macro for "do-context-partition";
    ;; Assumes that in a partition, anonymous objects are stored in a list
    ;;    except for the :instances partition, which uses a doubly-linked heap;
  (let ((heap (gensym "HEAP-")))
    `(let ((,heap (if (eq (partition-identifier ,partitionForm) :instances)
		      (rest (anonymous-objects ,partitionForm))
		      (anonymous-objects ,partitionForm))))
       (loop for ,iterationVar in ,heap do ,@body)) ))

;; Helping function for finding a context:
(defun coerce-to-context (contextOrNameOrNull &key dont-break-p)
  ;; Return a context corresponding to "contextOrNameOrNull";
  (let ((errorP nil) cxt)
    (setq cxt
	  (cond
	    ((null contextOrNameOrNull) *context*)
	    ((or (symbolp contextOrNameOrNull)
		 (stringp contextOrNameOrNull))
	     (or (find-context contextOrNameOrNull)
		 (if dont-break-p
		     (setq errorP t)
		     (progn (cerror "Return current context"          ;  TAR 12/9/93
                                    "Non-existent context ~S"
                                    contextOrNameOrNull)
                            (current-context)))))
            ((quoted-p contextOrNameOrNull)     ; RMM 4/13/93
             (coerce-to-context (second contextOrNameOrNull)))
            ((not (typep contextOrNameOrNull 'CONTEXT))
             (if dont-break-p
		   (progn (setq errorP t) contextOrNameOrNull)
                   (progn (cerror "Return current context"
                                  "The object ~S is not a context"
			          contextOrNameOrNull)
                          (current-context))))
	    (t 
	     contextOrNameOrNull)))
    (values cxt errorP) ))

(defun creation-policy (&optional contextOrpolicy policy)
  "(creation-policy [context] [policy])
Set the creation policy of the current or specified `context' to `policy'.
Legal values are :classified-instance, :lite-instance, or :clos-instance.
If `policy' is null or invalid return the creation policy of `context' or
the current context."
  (let ((legalPolicies '(:classified-instance :lite-instance :clos-instance))
	context newPolicy)
    (typecase contextOrPolicy
      (CONTEXT (setq context contextOrPolicy))
      (NULL nil)
      (SYMBOL (cond ((member contextOrPolicy legalPolicies)
		     (setq newPolicy contextOrPolicy))
		    ((setq context (get-context contextOrPolicy)))
		    (t (complain "~%The first argument to CREATION-POLICY ~S is neither a context name~%nor a valid creation policy.  The legal policies are ~{~S~^, ~}"
				 contextOrPolicy legalPolicies))))
      (otherwise (complain "~%The first argument to CREATION-POLICY ~S is neither a context,~%context name nor a valid creation policy."
			   contextOrPolicy)))
    (when policy
      (if (member policy legalPolicies)
	  (if (and newPolicy (neq policy newPolicy))
	      (complain "~%Two different policies specified in CREATION-POLICY: ~S and ~S.  Picking ~S." newPolicy policy newPolicy)
	    (setq newPolicy policy))
	(complain "~%The second argument to CREATION-POLICY ~S is not a valid creation policy nor NIL.~%The legal policies are ~{~S~^, ~}"
		  policy legalPolicies)))
	      
    (unless context (setq context *context*))
    (if newPolicy
	(progn (setf (instantiation-class context)
		 (compute-instantiation-class context newPolicy))
	       newPolicy)
      (compute-instantiation-policy (instantiation-class context))) ))


  ;;
;;;;;; Context tree iteration functions
  ;;


(defun generate-context-subtree (context)
  ;; Generate a list of subcontexts of "context" that all have ctxt fillers;
  (let ((result (list context)))
    (labels ((help-generate-context-subtree (cont)
               (loop for c in (child-contexts cont)
                     when (and (ctxt c)      ; Make sure a ctxt exists
                               (not (member c result)))
                     do (push c result)
                        (help-generate-context-subtree c))))
      (help-generate-context-subtree context)
      result )))

(defun generate-ctxt-subtree (ctxt)
  ;; Generate a list of subctxts of "ctxt";
  (let ((result (list ctxt)))
    (labels ((help-generate-context-subtree (cont)
               (loop for c in (ctxt-children cont)
                     unless (member c result)
                     do (push c result)
                        (help-generate-context-subtree c))))
      (help-generate-context-subtree ctxt)
      result )))


;; The breadth first update wants to visit parents in order.  This is
;;    accomplished by going down the list in a depth first fashion and
;;    only executing if all parents are already visited, or if they are
;;    not on the update path.  This allows proper handling of the following
;;    context structure for an update to "C1" where "C2" is not affected:
;;
;;                C1    C2        
;;               /  \  /
;;             C3    C4
;;              |    |
;;              |    C5
;;               \  /
;;                C6
;;

(defmacro do-in-subcontexts-p ()
  ;; Test to see if we should repeat the form in subcontexts;
  ;; This variable is only rebound within a "let" statement-- this insures that
  ;;    its binding are always popped off of the stack when exited;
  `(and *do-in-subcontexts-p*
        (ctxt-children *current-ctxt*)) )

(eval-when (load eval compile)
  (defun create-breadth-first-iterator (candidateGenerator parentFunction
                                                           childrenFunction
                                                           iterationTest
                                                           contextBindingFunction
                                                           executionForms
                                                           iterationStart
                                                           cleanUpForm)
    (let ((visited (gensym "VISITED"))
          (toVisit (gensym "TOVISIT"))
          (start (gensym "START"))
          (functionName (gensym "F"))
          (context (gensym "C"))
          (i (gensym "C")))
      `(if (do-in-subcontexts-p)
         (let ((,visited nil)
               (,start ,iterationStart)
               (,toVisit (,candidateGenerator ,iterationStart)))
           (labels ((,functionName (,context) 
                      (when (loop for p in (,parentFunction ,context)
                                  always (or (member p ,visited)
                                             (not (member p ,toVisit))))
                        ,(funcall contextBindingFunction context executionForms)
                        (push ,context ,visited)
                        (loop for ,i in (,childrenFunction ,context)
                              ,@(when iterationTest
                                  `(when (,iterationTest ,i)))
                              do (,functionName ,i)))))
             ,(if cleanUpForm
                `(unwind-protect (,functionName ,start)
                   (,cleanUpForm ,start))
                `(,functionName ,start) )))
         (progn ,@executionForms)) ))

  (defun create-depth-first-iterator (candidateGenerator parentFunction
                                                         childrenFunction
                                                         iterationTest
                                                         contextBindingFunction
                                                         executionForms
                                                         iterationStart
                                                         cleanUpForm)
    (declare (ignore parentFunction candidateGenerator))
    (let ((visited (gensym "VISITED"))
          (functionName (gensym "F"))
          (start (gensym "START"))
          (context (gensym "C"))
          (i (gensym "C")))
      `(if (do-in-subcontexts-p)
         (let ((,visited nil)
               (,start ,iterationStart))
           (labels ((,functionName (,context) 
                      (loop for ,i in (,childrenFunction ,context)
                            ,@(when iterationTest
                                `(when (,iterationTest ,i)))
                            do (unless (member ,i ,visited)
                                 (,functionName ,i)))
                      (prog1 
                        ,(funcall contextBindingFunction context executionForms)
                        (push ,context ,visited))))
             ,(if cleanUpForm
                `(unwind-protect (,functionName ,start)
                   (,cleanUpForm ,start))
                `(,functionName ,start) ) ))
         (progn ,@executionForms)) ))
  )  ; End EVAL-WHEN
       


(defmacro execute-in-contexts-breadth-first (&rest forms)
  (create-breadth-first-iterator 'generate-context-subtree
                                 'parent-contexts
                                 'child-contexts
                                 'ctxt
                                 #'(lambda (context forms) 
                                     `(progn (change-context ,context)
                                             ,@forms))
                                 forms
                                 '*context*
                                 'change-context) )

(defmacro execute-in-ctxts-breadth-first (&rest forms)
  (create-breadth-first-iterator 'generate-ctxt-subtree
                                 'ctxt-parents
                                 'ctxt-children
                                 nil
                                 #'(lambda (context forms) 
                                     `(let ((*current-ctxt* ,context))
                                        ,@forms))
                                 forms
                                 '*current-ctxt*
                                 nil) )

(defmacro execute-in-contexts-depth-first (&rest forms)
  (create-depth-first-iterator 'generate-context-subtree
                                 'parent-contexts
                                 'child-contexts
                                 'ctxt
                                 #'(lambda (context forms) 
                                     `(progn (change-context ,context)
                                             ,@forms))
                                 forms
                                 '*context*
                                 'change-context) )

(defmacro execute-in-ctxts-depth-first (&rest forms)
  (create-depth-first-iterator 'generate-ctxt-subtree
                                 'ctxt-parents
                                 'ctxt-children
                                 nil
                                 #'(lambda (context forms) 
                                     `(let ((*current-ctxt* ,context))
                                        ,@forms))
                                 forms
                                 '*current-ctxt*
                                 nil) )


  ;;
;;;;;; Namespace Inlines
  ;;

#-:CLTL2(proclaim '(inline find-partition))
#+:CLTL2(declaim (inline find-partition))

(defun find-partition (partitionId listOfPartitions)
  ;; Return the partition in "listOfPartitions" that matches
  ;;    "partitionId";
  ;; Assumes that the instances partition is the first partition;
  (find partitionId listOfPartitions :key #'partition-identifier) )

  ;;
;;;;;; Multiple inheritance functions
  ;;


(defun multiple-inheritance-p (object slotName contextList)
  ;; Returns T or NIL as the first value depending on whether there is
  ;;    multiple inheritance or not;
  ;; The second value will be a LIST of applicable slot values;
  (let ((slotValue (slot-value object slotName))
        (homeCtxt (home-ctxt object)))
    (if (cdr contextList)
      (let ((valueList 
             (within-context *context*
               (fast-remove-equal-duplicates
                (loop for c in contextList
                      do (change-context c)
                      when (access-in-ctxt slotValue nil homeCtxt)
                      collect it)))))
        (values (cdr valueList) (or valueList '(nil))) )
      (values nil (list (within-context (car contextList)
                          (access-in-ctxt slotValue nil homeCtxt))))) ))

(defun find-all-visible-items (startContext alreadyVisited)
  (let ((visibleInstances nil)
        (visibleConcepts nil)
        (visibleRelations nil)
        (visibleBehaviors nil))
    (labels ((visible-item-p (item) (declare (ignore item)) t) ;; <== ** FIX THIS **
             (find-all-visible-items-helper (c)
               (when (member c alreadyVisited)
                 (return-from find-all-visible-items-helper nil))
               (push c alreadyVisited)
               (do-context-partition (nil instance (find-partition 
                                                    :instances
                                                    (context-partitions c)))
                 (when (and (not (meta-thing-p instance))
                            (visible-item-p instance))
                   (push instance visibleInstances)))
               (do-context-partition (nil concept (find-partition
                                                    :concepts
                                                    (context-partitions c)))
                 (when (and (user-defined-concept-p concept)
                            (visible-item-p concept))
                   (push concept visibleConcepts)))
               (do-context-partition (nil relation (find-partition
                                                    :relations
                                                    (context-partitions c)))
                 (when (and (user-defined-concept-p relation)
                            (visible-item-p relation))
                   (push relation visibleRelations)))
               (do-context-partition (nil behavior (find-partition
                                                    :behaviors
                                                    (context-partitions c)))
                 (when (visible-item-p behavior)
                   (push behavior visibleBehaviors)))
               (loop for parent in (parent-contexts c)
                     do (find-all-visible-items-helper parent))))
      (find-all-visible-items-helper startContext)
      ;; TO DO: FIGURE OUT IF THE ANSWERS ARE GUARANTEED TO BE DUPLICATE FREE!
      (values  (fast-remove-duplicates visibleInstances)
               (fast-remove-duplicates visibleConcepts)
               (fast-remove-duplicates visibleRelations)
               (fast-remove-duplicates visibleBehaviors)
               alreadyVisited) )))

(defun find-name-conflicts (rawList)
  ;; Situation: "rawList" is a DUPLICATE-FREE list of objects;
  ;; Detects multiple items in the "rawList" with the same name and returns
  ;;   a list of the names of the duplicates;
  ;; Tricky:  Since non-named objects get NIL as the value of the 
  ;;     unique-identifier function, and since NIL is deleted from the
  ;;     list of test names "nameList", only named objects are checked 
  ;;     for duplication;
  (flet ((unique-identifier (object)
           ;; The unique identifier is a name for named objects, otherwise
           ;;   NIL.
           (typecase object
             (BASIC-INSTANCE (identifier object))
	     (LOOM-OBJECT (name object))
             (CLOS-INSTANCE (let ((id (identifier object)))
                              (if (listp id)
                                nil
                                id) ))
             (T (name object))) ))
    (let* ((combinedList (delete NIL (mapcar #'unique-identifier rawList)))
           (nameList (fast-remove-duplicates combinedList)))
      (unless (eql (length combinedList) (length nameList))
        (loop for n in nameList
              when (> (count n combinedList) 1)
              collect n)) )))

(defun find-conflicts-helper (instanceList conceptList relationList behaviorList)
  ;; Return conflicts for instances, concepts, relations and behaviors by examining
  ;;   their respective lists;
    (values (find-name-conflicts instanceList)
            (find-name-conflicts conceptList)
            (find-name-conflicts relationList)
            (find-name-conflicts behaviorList)) )

(defun find-all-visible-items-in-contexts (contextList ignoredContextList)
  ;; Find items visible in the combination of all contexts in "contextList";
  ;; Don't search in contexts in "ignoredContextList";
  (let ((instanceList nil)
        (conceptList nil)
        (relationList nil)
        (behaviorList nil)
        instances concepts relations behaviors)
    (loop for context in contextList
          do
          (multiple-value-setq (instances concepts relations behaviors ignoredContextList) ; RMM 3/95
            (find-all-visible-items context ignoredContextList))
          (setq instanceList (nconc instances instanceList))
          (setq conceptList (nconc concepts conceptList))
          (setq relationList (nconc relations relationList))
          (setq behaviorList (nconc behaviors behaviorList)))
    (values instanceList conceptList relationList behaviorList) ))


(defun find-conflicts (contextList ignoredContextList)
  ;; Return conflicts for instances, concepts, relations and behaviors;
  (declare (inline find-conflicts-helper find-all-visible-items-in-contexts))
  (multiple-value-bind (instanceList conceptList relationList behaviorList)
                       (find-all-visible-items-in-contexts contextList ignoredContextList)
    (find-conflicts-helper instanceList conceptList relationList behaviorList) ))

(defun find-new-instance-conflict (instanceName)
  (unless (find-instance instanceName :no-warning-p t)
    (let ((conflictP nil))
      (execute-in-contexts-breadth-first
       (when (find-instance instanceName :no-warning-p t)
         (setq conflictP t)))
      conflictP )) )

(defun find-new-concept-conflict (conceptName)
  (unless (find-concept conceptName :no-warning-p t)
    (let ((conflictP nil))
      (execute-in-contexts-breadth-first
       (when (find-concept conceptName :no-warning-p t)
         (setq conflictP t)))
      conflictP )) )

(defun find-new-relation-conflict (relationName)
  (unless (find-relation relationName :no-warning-p t)
    (let ((conflictP nil))
      (execute-in-contexts-breadth-first
       (when (find-relation relationName :no-warning-p t)
         (setq conflictP t)))
      conflictP )) )

(defun find-new-behavior-conflict (behaviorName)
  (unless (find-behavior behaviorName nil :no-warning-p t)
    (let ((conflictP nil))
      (execute-in-contexts-breadth-first
       (when (find-behavior behaviorName nil :no-warning-p t)
         (setq conflictP t)))
      conflictP )) )

(defun check-for-conflicts-p (newContextName parentList instanceList
                                       conceptList relationList behaviorList)
  ;; Check "instanceList", "conceptList", "relationList" and "behaviorList" for
  ;;    different objects with the same name.  If found, then print a warning
  ;;    message about "newContextName" and "parentList";
  (declare (inline find-conflicts-helper))
  (multiple-value-bind (instances concepts relations behaviors)
                       (find-conflicts-helper
                        instanceList conceptList relationList behaviorList)
    (when (or instances concepts relations behaviors)
      (grumble "Inheriting from all of ~{~A~^, ~} causes~
                ~@[~%instance conflicts for ~{~A~^, ~}~]~
                ~@[~%concept conflicts for ~{~A~^, ~}~]~
                ~@[~%relation conflicts for ~{~A~^, ~}~]~
                ~@[~%behavior conflicts for ~{~A~^, ~}~].~%~
                Abandoning definition of context ~A."
               (mapcar #'name parentList)
               instances
               concepts
               relations
               behaviors
               newContextName)
      t) ))


  ;;
;;;;;; Look-up function.
  ;;

;; Change note:  Specific compiled lookup-functions have been removed
;;   from this version of Loom.  Instead, the search is done inside
;;   generic lookup functions.  It is expected that this will greatly
;;   speed up the creation of new contexts (most of the time is spent
;;   compiling new functions using ACL 4.3) and shouldn't affect the
;;   lookup time very much, since the functions that are computed are
;;   both very simple and also quite uniform.
;;     -- TAR 8/31/98

;;; Define macros which look up identifiers in the appropriate partition.
;;;    Lookup of identifer in *context* finds the matching partition in
;;;          the association list
;;;       *current-evaluate-id-fns*, and applys that function to
;;;       the identifier;
;;;    Lookup of identifier in a fixed context expands to
;;;       a function call of the appropriate lookup function.

#-:CLTL2(proclaim '(inline evaluate-identifier-locally))
#+:CLTL2(declaim (inline evaluate-identifier-locally))

(eval-when (compile load eval)
  (defun evaluate-identifier-locally (identifier partitionId context)
    ;; Return the object which corresponds to "identifier" in the
    ;;    context defined by "partition" and "contextName",
    ;;    where the search is confined to the context
    ;;    "contextName", i.e., we don't visit its parents;
    (let ((nameSpace (get-name-space-in-context partitionId context)))
      (when nameSpace
	(gethash identifier nameSpace)) ))

  (defun expand-eval-id (identifier partitionName contextName)
    ;; Helping function for "eval-instance-id", "eval-concept-id", etc.
    (when (not (symbolp contextName))
      (error "Expected a symbol in 'expand-eval-id'.  Probably you~%~
              quoted ~S when you shouldn't have inside of an 'eval-...-id'"
	     contextName))
    (let ((generationForm (if contextName 
			      `(context-precedence-list (get-context ',contextName))
			    '(context-precedence-list *context*))))
      (case partitionName
	(:instances
	 `(loop for ctx in ,generationForm
	      as ns = (ns-cache-instances (namespace-cache ctx))
	      as obj = (when ns (gethash ,identifier ns))
	      when obj return obj))
	(:concepts
	 `(loop for ctx in ,generationForm
	      as ns = (ns-cache-concepts (namespace-cache ctx))
	      as obj = (when ns (gethash ,identifier ns))
	      when obj return obj))
	(:relations
	 `(loop for ctx in ,generationForm
	      as ns = (ns-cache-relations (namespace-cache ctx))
	      as obj = (when ns (gethash ,identifier ns))
	      when obj return obj))
	(:behaviors
	 `(loop for ctx in ,generationForm
	      as ns = (ns-cache-behaviors (namespace-cache ctx))
	      as obj = (when ns (gethash ,identifier ns))
	      when obj return obj))
	(otherwise
	  `(loop for ctx in ,generationForm
	       when (evaluate-identifier-locally ,identifier ,partitionName ctx)
	       return it))) ))
  )


;;; These are top-level access functions for use in user code:

(defmacro eval-instance-id (identifier &optional contextName)
  ;; Lookup "identifier" in the indicated context;
  ;;    Return the object having a matching id (when one exists)
  ;; If "contextName" is nil, the expansion uses the current context;
  (expand-eval-id identifier :instances contextName))

(defmacro eval-concept-id (identifier &optional contextName)
  ;; Like "eval-instance-id" but looks in the :concepts partition
  (expand-eval-id identifier :concepts contextName))

(defmacro eval-relation-id (identifier &optional contextName) 
  ;; Like "eval-instance-id" but looks in the :relations partition
  (expand-eval-id identifier :relations contextName))

;;; Evaluate-identifier with a partition argument:

(defmacro evaluate-identifier-in-context (identifier partitionName context)
  ;; Return the object which corresponds to "identifier" in the
  ;;    context defined by "partition" and "context"
  `(loop for ctx in (context-precedence-list ,context)
       when (evaluate-identifier-locally ,identifier ,partitionName ctx)
       return it) )

(defun evaluate-identifier (identifier partitionId context)
  ;; Return the object which corresponds to "identifier" in the
  ;;    context defined by "partition" and "contextName"
  ;; If "context" is a symbol, find the context object;
  ;; If "context" is nil, use *current-evaluate-id-fns*
  (cond ((null context)
	 (when *context*
	   (evaluate-identifier-in-context identifier partitionId *context*)))
	((symbolp context)
	 (setq context
	   (or (find-context context)
	       (error "Non-existent context ~S" context)))
	 (evaluate-identifier-in-context identifier partitionId context))
	(t (evaluate-identifier-in-context identifier partitionId context))) )

;;; Next, we define lower-level context access functions:
(defmacro get-name-space (partitionId &optional context)
  ;; Return the name-space matching "partitionId" and "context";
  ;;    If "context" is nil, use the current context.
  (if context
      `(get-name-space-in-context ,partitionId ,context) 
      `(get-name-space-in-context ,partitionId *context*)) )

(defun loom::get-name-space-in-context (partitionId context)
  ;; Return the name-space matching "partitionId" and "context";
  (unless context (setq context *context*))
  (ecase partitionId
    (:instances (ns-cache-instances (namespace-cache context)))
    (:concepts (ns-cache-concepts (namespace-cache context)))
    (:relations (ns-cache-relations (namespace-cache context)))
    (:behaviors (ns-cache-behaviors (namespace-cache context)))) )

(defun is-in-name-space (object nameSpace)
  ;; Return t if "object" resides in "nameSpace";
  (maphash
   #'(lambda (key item)
       (declare (ignore key))
       (when (eq item object)
         (return-from is-in-name-space t)))
   nameSpace)
  nil)

;;; Here we define some context-related functions which are
;;;    needed during bootstrapping.

(defun add-identifier-to-name-space (identifier object nameSpace)
  ;; Add the mapping from "identifier" to "object" to "nameSpace";
  ;;    No check is made to see if "identifier" already maps to
  ;;    another object
  (when identifier
    (setf (gethash identifier nameSpace) object)) )

(defun delete-identifier-from-name-space (identifier nameSpace)
  ;; Remove the mapping from "identifier" to something in "nameSpace";
  (remhash identifier nameSpace) )


  ;;
;;;;;; Extended identifiers and context look-up functions
  ;;

;;; These functions facilitate looking for objects in contexts
;;;    when (1) the package name is unknown, or (2) the object resides in a
;;;    context not visible from the current context;

;;; An extended identifier consists of a context name 
;;;    and identifier concatenated with the symbol "^".  

#+CLTL2 (declaim (inline extended-identifier-p))
#-CLTL2 (proclaim '(inline extended-identifier-p))
(defun extended-identifier-p (identifier)
  ;; Return t if "identifier" references a specific context;
  (find #\^ (symbol-name identifier) :test #'eq) )

#+CLTL2 (declaim (inline extended-identifier-string-p))
#-CLTL2 (proclaim '(inline extended-identifier-string-p))
(defun extended-identifier-string-p (identifier)
  ;; Return t if "identifier" references a specific context;
  (find #\^ identifier :test #'eq) )

#+CLTL2 (declaim (inline parse-extended-identifier))
#-CLTL2 (proclaim '(inline parse-extended-identifier))
(defun parse-extended-identifier (extendedId &key no-error-p)
  ;; Split an identifier of the form 'foo-cxt^id' into two parts:
  ;; Return two values, the non-extended identifier, and either the
  ;;    context object or nil if its not extended;
  ;; Note1: A package prefix may not appear after the "^";
  ;;    Instead, LOOM will figure out what the proper prefix is;
  ;; Note2: Identifiers of the form '^id' look for a symbol
  ;;    in the current context using the package for
  ;;    that context;
  (if (extended-identifier-p extendedId)
      (help-parse-extended-identifier extendedId no-error-p) 
      (values extendedId nil)) )

(defun help-parse-extended-identifier-string (IdString noErrorP)
  ;; Helping function for "parse-extended-identifier-string";
  (let* ((^position (position #\^ idString :test #'char=))
	 (cxtStringName (subseq idString 0 ^position))
	 context)
    (when (plusp ^position)
      (setq context (string-find-context cxtStringName :exact t))
      (when (null context)		; Retrofit obsolete use of KBs:
        (setq context
	  (let ((kb (string-find-kb cxtStringName :exact)))
	    (cond (kb (first (contexts kb)))
		  ((string-equal cxtStringName "UPPER-STRUCTURE-KB")
		   (get-context 'BUILT-IN-THEORY))))))
      (when (null context)
	(if noErrorP
	    (return-from help-parse-extended-identifier-string
	      (values nil nil))
	    (error "Tried to reference non-existent context ~S"
		   cxtStringName))))
    ;; at this point "context" contains a valid context
    (values
      (subseq idString (1+ ^position))
      context) ))

(defun help-parse-extended-identifier (extendedId noErrorP)
  ;; Helping function for "parse-extended-identifier" (to make it
  ;;    smaller for use in-line);
  (declare (inline help-parse-extended-identifier-string))
  (multiple-value-bind (idString context)
      (help-parse-extended-identifier-string (symbol-name extendedId) noErrorP)
    (values (intern idString (symbol-package extendedId)) context) ))

(defun generate-extended-identifier (identifier context)
  ;; Generate an identifier of the form 'foo-cxt^id';
  (symbol-append ((name context) "^" identifier)
                 (package-of-symbol identifier)) )

(defun evaluate-extended-identifier (extendedIdentifier partitionId)
  ;; Return the object that corresponds to "extendedIdentifier" in the partition
  ;;    "partition".  The context will be that indicated in 
  ;;    "extendedIdentifier" or *context* if the identifier is not extended;
  (multiple-value-bind (identifier context)
      (parse-extended-identifier extendedIdentifier)
    (evaluate-identifier identifier partitionId context) ))



  ;;
;;;;;; Context Searches
  ;;

(CLOS::defmethod context ((self T))
  ;; Return the home (definition) context for "self";
  ;; The default case is global, non-context specific, ie, NIL;
  nil)

(CLOS::defmethod context ((self CONTEXT-SENSITIVE-MIXIN))
  ;; Return the home (definition) context for "self";
  ;; This is the context object corresponding to the home-ctxt ctx object;
  ;; Tricky:  We try to short-circuit the loop by seeing if "self" is defined
  ;;     in the current context;
   (let ((homeCtxt (home-ctxt self)))
     (cond ((eq homeCtxt *current-ctxt*) *context*)
	   ((loop for context in (context-precedence-list *context*)
		when (eq homeCtxt (ctxt context))
		return context))
	   (t (loop for (nil . ctx) in *context-table*
		  when (eq homeCtxt (ctxt ctx))
		  return ctx))) ))



(defun find-context-of-object (loomObject partitionId)
  ;; Return the context of "loomObject";  first search the current context,
  ;;    then search the context table;
  (or (context loomObject)
      (help-find-context-of-object loomObject partitionId *context*)
      (loop for entry in *context-table*
	  as foundContext = (unless (eq (cdr entry) *context*)
			      (help-find-context-of-object
			       loomObject partitionId (cdr entry)))
	  when foundContext return foundContext)) )

(defun help-find-context-of-object (loomObject partitionId context)
  ;; Helping function for "find-context-of-object"
  (let ((objectPartition 
	 (find-partition partitionId (context-partitions context)))
	(objectName (name loomObject)))
    (when (or (and objectName 
		   (symbolp objectName)
		   (gethash objectName (name-space objectPartition)))
	      (is-in-name-space loomObject (name-space objectPartition))
	      (case partitionId
		(:instances 
		 (in-anonymous-instances-index-p loomObject context))
		(otherwise
		 (member loomObject (anonymous-objects objectPartition)))))
      context) ))


  ;;
;;;;;; Functions to create and destroy contexts
  ;;

(defun define-context (name typeOfContext parentContexts 
		       &key creation-policy
			    open-closed-mode
			    monotonic-p)
  "Create a new context called `contextName' of type `typeOfContext' that
inherits the contexts `parentContexts'.  Legal types are :theory, :workspace,
:island, and :world.  `creation-policy' indicates the meta-class for
instances created in `context' -- this establishes the inference policy
for the context.  Legal policies are `:classified-instance', `:lite-instance',
and :clos-instance.  The default policy creates CLOS instances for workspaces
and LITE instances for theories."
  (when (and (null parentContexts)
             (not (eq name 'BUILT-IN-THEORY))) ; avoid bootstrap problem
    ;; (make "BUILT-IN-THEORY" the default parent):
    (setq parentContexts '(BUILT-IN-THEORY)))
  (when (null typeOfContext)
    (setq typeOfContext :workspace))
  (let (newCxt				; TAR 3/10/97  Moved value setting down.
	(allParentsClosedP t))
    (setq parentContexts		;  TAR 3/1/94
      (loop for parentName in parentContexts
	  as parent = (find-context parentName)
	  when parent
	  collect parent
	  and do (when (test-bit-flags (context-flag parent)
				       :context-flag :open-world)
		   (setq allParentsClosedP nil))
	      (within-context parent	; TAR 6/16/99
		(new-time-point))
	  else do 
	       (grumble "Can't inherit context ~S while defining context ~S~%~
                             because ~S is undefined.  Abandoning definition of ~S."
			parentName name parentName name)
	       (return-from define-context nil)))
    (setq newCxt (or (find-preexisting-but-compatible-context
                      name typeOfContext parentContexts)
                     (make-instance 
			 (ecase typeOfContext
			   (:theory 'THEORY-CONTEXT)
			   (:island 'ISLAND-CONTEXT)
			   ((:workspace :world) 'WORKSPACE-CONTEXT)
			   (:bottom 'BOTTOM-CONTEXT)))))
    (cond
     ((eq newCxt :exit)
      (return-from define-context nil))
     ((not (symbolp name))
      (grumble "Illegal context name ~A.  Context names must be symbols." name)
      (return-from define-context nil)))
    (cond ((null open-closed-mode)
           (setq open-closed-mode
	     (if parentContexts
		 (if allParentsClosedP :closed :open)
	       (if *global-closed-world-p* :closed :open))))
          ((not (or (eq open-closed-mode :closed) (eq open-closed-mode :open)))
           (complain "~%OPEN-CLOSED-MODE should be one of NIL, :OPEN or :CLOSED.~%~
                      Setting it to ~A in context ~A"
                     name (setq open-closed-mode 
			    (if parentContexts
				(if allParentsClosedP :closed :open)
			      (if *global-closed-world-p* :closed :open))))))

    ;; assign parameters common to defining and REdefining a context:
    (setf (type-of-context newCxt) typeOfContext)
    ;; Type-of-context influences the default instantiation class!
    (setf (instantiation-class newCxt)
      (compute-instantiation-class newCxt creation-policy))
    (setf (open-closed-mode newCxt) open-closed-mode)
    (with-speed
	(if monotonic-p
	    (set-bit-flags (context-flag newCxt) :context-flag :monotonic)
	  (clear-bit-flags (context-flag newCxt) :context-flag :monotonic)))
    ;; exit if its a preexisting context:
    (when (test-bit-flags (context-flag newCxt) :context-flag :initialized)
      (return-from define-context newCxt))
    (setf (name newCxt) name)
    ;; assign its parents (which have been turned into contexts at this point)
    (setf (parent-contexts newCxt) parentContexts)
    ;; THIS IS MESSED UP -- IT APPARENTLY WAS NEVER EXECUTED IN 2.0:
					;    (when (eval-concept-id 'CONTEXT)       ; add to the extension of "Context";
					;      ;; note: conditionalized here to assist bootstrapping
					;      (add-to-local-instances (eval-concept-id 'CONTEXT) newCxt))       
    ;; finish the initialization
    (unless (initialize-context newCxt)
      (destroy-context newCxt)
      (return-from define-context nil))
    (when (theory-p newCxt)
      (relink-bottom-theory))
    newCxt ))

(defun find-preexisting-but-compatible-context (name typeOfContext newParents)
  ;; Helping function for "define-context";
  ;; If a preexisting context with the same name exists, check to
  ;;    see if its type and parents are the same;
  ;; If so, return the old context for reuse;
  ;; Otherwise, ask the user if its ok to destroy the old context;
  ;; If not, return :exit;
  (let ((oldCxt (find-context name)))
    (when (setq oldCxt (find-context name))
      (when (and (eq (type-of-context oldCxt) typeOfContext)
                 (loop for oldParent in (parent-contexts oldCxt)
                       always (member oldParent newParents))
                 (= (length newParents) (length (parent-contexts oldCxt))))
        (return-from find-preexisting-but-compatible-context oldCxt))
      (grumble "Can't define a context named ~A because another context with
the same name and different definition already exists." name)
      (if (yes-or-no-p "Destroy old context ~A and all contexts below it?"
                       (name oldCxt))
        ;; if yes, destroy old context and its children, and return nil;
        (progn
          (destroy-context oldCxt)
          nil)
        ;; signal abandonment of new context definition:
        :exit)) ))

(defun compute-instantiation-policy (instanceClassName)
  ;; Return the name of the policy needed to create an instance of type-of
  ;; "instanceClassName";
  (case instanceClassName
    (LITE-INSTANCE :lite-instance)
    (DB-INSTANCE :classified-instance)
    (ISLAND-INSTANCE :special)
    (CLOS-INSTANCE :clos-instance)
    (otherwise :clos-instance)))

(defun compute-instantiation-class (context creationPolicy)
  ;; Return the name of the class defining the creation policy for "context";
  ;; We override "creationPolicy" in certain special types of contexts;
  ;; A nil creation policy specifies the use of CLOS instances;
  (let ((policyClass
	 (case creationPolicy
	   (:classified-instance 'DB-INSTANCE)
	   (:lite-instance 'LITE-INSTANCE)
	   (:clos-instance nil)
	   (otherwise
	    (when creationPolicy
	      (grumble "Illegal creation policy ~S.  Legal policies are
:classified-instance, :lite-instance, and :clos-instance." creationPolicy))
	    nil))))
    (with-speed
	(cond ((test-bit-flags (context-flag context) :context-flag
			       :or :theory :workspace)
	       ;; default policy is LITE-INSTANCE
	       (if creationPolicy policyClass 'LITE-INSTANCE))
	      ((test-bit-flags (context-flag context) :context-flag :island)
	       'ISLAND-INSTANCE)
	      ((test-bit-flags (context-flag context) :context-flag :world)
	       "NOT YET IMPLEMENTED")
	      (t policyClass))) ))

(defun relink-bottom-theory ()
  ;; Find or create BOTTOM-THEORY, and relink it so that it is below all
  ;;    other :theory contexts;
  ;; DISABLE THIS FUNCTION.  DUMP BOTTOM-THEORY!!  ; TAR 7/31/98
  (return-from relink-bottom-theory nil)
  (let ((bottomCxt (find-or-create-BOTTOM-THEORY)))
    (labels ((collect-leaf-theories ()
	       (loop for (nil . cxt) in *context-table*
		    when (and (theory-p cxt)
                              (loop for child in (child-contexts cxt)
                                   never (theory-p child)))
		    collect cxt)))
      (loop for parentCxt in (parent-contexts bottomCxt)
	   do (delf (child-contexts parentCxt) bottomCxt))
      (setf (parent-contexts bottomCxt) (collect-leaf-theories))
      (setf (context-precedence-list bottomCxt) nil)
      (initialize-context bottomCxt) ))
  )

(defun bottom-theory-p (contextOrName)
  ;; Situation: "contextOrName" is either a symbol or a context object;
  ;; Return T if "contextOrName" refers to the bottom theory;
  (if (symbolp contextOrName)
    (eq contextOrName 'BOTTOM-THEORY)
    (bottom-p contextOrName)))

(defun find-or-create-BOTTOM-THEORY ()
  ;; Return BOTTOM-THEORY, the theory that inherits all other theories;
  (or (get-context 'BOTTOM-THEORY)
      (define-context 'BOTTOM-THEORY :bottom '(BUILT-IN-THEORY))) )

(defun destroy-context (contextOrName)
  "Destroy the context `context' and all contexts below it."
  (let ((context (find-context contextOrName)))
    (when (null context)
      (complain "~%Can't destroy non-existent context ~S" contextOrName)
      (return-from destroy-context nil))
    (when (eq (name context) 'BUILT-IN-THEORY)
      (return-from destroy-context nil))
    (loop for child in (child-contexts context)
         do (destroy-context child))
    (destroy-one-context context)       ;  TAR 5/17/96
    (relink-bottom-theory)
    context ))

(defun destroy-one-context (context)
  ;; Called by "destroy-context";
  ;; Destroy all links to "context";
  (loop for parent in (parent-contexts context)
        do (delf (child-contexts parent) context))
  ;; delete the entry for "context" from *context-table*:
  ;; Note: For speed, we avoid using "delete", which would always scan the 
  ;;   entire list.  Tricky: assumes BUILT-IN-THEORY is at the tail end of the 
  ;;   list.
  (loop for tail on *context-table*
        as entry = (first tail)
        when (eq (cdr entry) context)
        do
        (setf (first tail) (first (rest tail)))
        (setf (rest tail) (rest (rest tail))))
  ;; remove "context" from kb-to-context index:
  (when (theory-p context)
    (loop for kb in (list-knowledge-bases)
          when (member context (contexts kb))
          do (delf (contexts kb) context)))
  ;; remove "context" from all positions within the stack:
  (setq *context-stack*
        (delete context *context-stack*))
  ;; if "context" was the current context, push it on the stack
  ;;    just long enough to pop it off:
  (when (eq *context* context)
    (push context *context-stack*)
    (if (rest *context-stack*)
      (pop-context)
      (change-context
       (let ((parentContext (first (parent-contexts context))))
         (if (and parentContext
                  (not (discarded-p parentContext)))
           parentContext
           (get-context 'BUILT-IN-THEORY)))))
    (inform "Destroying current context, resetting current context to ~A."
            (name *context*)))
  (when (ctxt context)
    (destroy-ctxt (ctxt context))) )

(defun destroy-all-contexts ()
  ;; Wipe out top-level access to contexts;
  ;; Note: This is only called during reloading of the "coda.lisp" file;
  (loop for entry in *context-table*
        do (destroy-context (cdr entry)))
  ;; eliminate BUILT-IN-THEORY, which is hard to kill:
  (setq *context-table* nil) )


;;; Code which initializes new contexts

(defun initialize-context (context)
  ;; Allocate and initialize partitions;
  ;; If "exported-partitions" is NIL, inherit its value;
  ;; Insure value for "kb-package-name";
  ;; Add "context" to *context-table*;
  ;; TO DO: FIGURE OUT IF WE CAN SPEED THIS UP FOR WORKSPACE CONTEXTS
  (let ((parents (parent-contexts context)))
    (loop for parent in parents
          do (push context (child-contexts parent)))
    (case (name context)		; TAR 10/13/94
      (BOTTOM-THEORY nil)          ;  TAR 11/22/93
      (BUILT-IN-THEORY (setf (ctxt context) *global-ctxt*))
      (otherwise (setf (ctxt context) 
		       (new-ctxt (mapcar #'ctxt parents)))))
    (compute-context-precedence-list context)
    (create-all-context-partitions context)
    (if (and parents       ;  TAR 2/10/94 initial setup.
             (neq context *context*))
      (progn (when *context* (save-history-state *context*))
             (restore-history-state (car parents))
             (save-history-state context)
             (when *context* (restore-history-state *context*)))
      (save-history-state context))
    ;; add new context object to *context-table*
    (addf-assoc *context-table* (name context) context :test #'equal)
    (set-bit-flags (context-flag context) :context-flag :initialized)
    (if (and (cdr parents) (neq (name context) 'bottom-theory))
      (initialize-multiple-parent-context context parents)
      t) ))

(defun initialize-multiple-parent-context (context parents)
  ;;  Do additional initialization for multiple inheritance;
  ;;  TO DO:  MAKE THIS MORE EFFICIENT, SINCE IT CALLS THE LISTING FUNCTION TWICE;
  ;;          ** ALSO, MAKE IT JUST ADJUST THE NAMESPACE LOOKUP FOR TBOX ITEMS **
  (let ((instanceAList nil) found)
    (multiple-value-bind (instanceList conceptList relationList behaviorList)
                         (find-all-visible-items-in-contexts 
                          parents (list (find-context 'built-in-theory)))
      (when (check-for-conflicts-p (name context) parents instanceList conceptList relationList behaviorList)
	(clear-bit-flags (context-flag context) :context-flag :initialized)
	(return-from initialize-multiple-parent-context nil))
      (loop for c in parents
            do 
            (within-context c
              (loop for i in instanceList
		  do (when (or (listp (identifier i))         ; Anonymous
			       (get-instance (identifier i))) ; Visible
                         (setq found (assoc i instanceAList))
                         (if found
                           (setf (cdr found) 
                                 (combine-role-values i 
                                                      (list-role-names&values i)
                                                      (cdr found)))
                           (push (cons i (list-role-names&values i)) instanceAList))))))
            ; (setq instanceList (union instances instanceList))
      (within-context context
        ;; Loop through concepts and relations & define the ones we can't see;
        (loop for c in conceptList
              unless (eq c (get-concept (name c)))
              do (loop for defn in (source-definitions c)
                       do (redefine-concept defn :concept)))
        (loop for r in relationList
              unless (eq r (get-relation (name r)))
              do (loop for defn in (source-definitions r)
                       do (redefine-concept defn :relation)))
        ;; Add behaviors here!
        ;; Go through the role values and make sure that they are visible.
        (loop for (instance . data) in instanceAList
              when data
              do (loop for (roleName . values) in data
                       do
                       (loop for v in values
                             do (assert-role-filler instance 
                                                    (get-relation roleName)
                                                    v :assertion)))
              (multiple-value-bind (multipleP conjunctListofLists)
                                   (multiple-inheritance-p instance 
                                                           'dynamically-asserted-conjuncts
                                                           parents)
                (when multipleP
                  (loop for conjunctList in conjunctListofLists
                        do (loop for conjunct in conjunctList
                                 do (assert-conjunct instance conjunct :assertion)))) )))
  t )))

(defun combine-role-values (instance currentRoleValues otherRoleValues)
  ;; Situation: "currentRoleValues" must be combined with "otherRoleValues";
  (loop for (roleName . values) in currentRoleValues
        as found = (assoc roleName otherRoleValues)
        do (cond ((null found)
                  (push (cons roleName values) otherRoleValues))
                 ((eq (cdr found) values)
                  nil) ; Do Nothing
                 ((role-is-single-valued-p (find-relation roleName))
;                  (cerror "Return an arbitrary value."
;                          "Single-valued role ~S on ~S has multiple values ~S and ~S."
;                          roleName instance (car values) (cadr found))
                  (unless (filler-equal (car values) (cadr found))
                    (grumble "Multiple inheritance error:~%~
                              Arbitrarily picking value ~S for single-valued role ~S~%~
                              on instance ~S.  Discarding value ~S."
                             (cadr found) roleName instance (car values)))
                  ;; This doesn't work because we are in the wrong ctxt:
                  ;(update-slot-in-ctxt instance roleName (car values))
                  )
                 (t
                  (setf (cdr found) 
		    (union values (cdr found) :test #'filler-equal)))))
  otherRoleValues)

;(defun compute-context-precedence-list (context)
;  ;; Compute a breadth-first left-to-right list of "context" and its
;  ;;    parent-contexts;  Assumes that the parent context precedence
;  ;;    lists have already been computed.
;  (let ((contextList (append (list context) (copy-list (parent-contexts context))))) 
;    (loop for parentCxt in (parent-contexts context)
;          do
;          (setq contextList (KBCLASSES::right-union
;                             contextList (context-precedence-list parentCxt))))
;    (setf (context-precedence-list context) contextList) ))

(defun compute-context-precedence-list (context)
  ;; Compute the precedence list for "context" in a way compatible with
  ;;   the method used for the low-level "ctxt" structures.
  (let ((contextList nil))
    (loop for parentCxt in (parent-contexts context)
          do (loop for context in (context-precedence-list parentCxt)
                   do (pushnew context contextList)))
    (setf (context-precedence-list context)
          (cons context (sort-context-list contextList))) ))

(defun sort-context-list (contextList)
  ;; Sorts "contextList" in a way compatible with the low-level "ctxt" structs.
  (sort contextList #'> :key #'(lambda (x) (ctxt-number (ctxt x)))) )

;;; Code which creates and initializes partitions within a context

(defun create-all-context-partitions (context)
  ;; Helping function for "initialize-context";
  ;; Create one of each kind of partition, unless "context" is
  ;;    a world, in which case only an :instances partition is created;
  ;; Note: :instances MUST be the first partition;
  (if (world-p context)
      (let ((part (create-context-partition :instances context)))
	(setf (namespace-cache context) 
	  (make-ns-cache (name-space part) nil nil nil)))
    (setf (namespace-cache context)
      (apply #'make-ns-cache
	     (loop for id in *legal-context-partition-identifiers*
		 collect (name-space (create-context-partition id context)))) )) )

(defun create-context-partition (partitionId context)
  ;; Return a partition object containing an empty hash table and
  ;;    a look-up function tailored for its position within the 
  ;;    context hierarchy;
  (let ((newPartition (make-instance 'CONTEXT-PARTITION)))
    (setf (partition-identifier newPartition) partitionId)
    (setf (name-space newPartition) (make-hash-table :size 5))
    ;; add new partition to end of list of partitions, except that :instances
    ;;    partition goes first:
    (if (or (null (context-partitions context))
            (eq partitionId :instances))
      (push newPartition (context-partitions context))
      (nconc (context-partitions context) (list newPartition)))
    newPartition ))

  ;;
;;;;;; context manipulation functions
  ;;

(defun list-contexts ()
  "Return a list of all contexts"
  (list-of-assoc *context-table*) )

(defun reset-current-context (context)
  ;; Reset *context* to access "context".  Return the current context;
  ;; Save current history variables and setup with the next ones;
  (when (or (eq context *context*)
            (null context))
    (return-from reset-current-context *context*))
  #L:trace-context (format *trace-output* "~&>>> Entering ~S~%" context)
  (when *context* (save-history-state *context*))       ;  TAR 2/10/94
  (clear-get-instance-cache)
  (with-speed
      (setq *monotonic-mode-p* 
	(test-bit-flags (context-flag context) :context-flag :monotonic)))
  ;; replace top of stack:    ;; PUSH IS A BOOTSTRAP KLUDGE
  (if (null *context-stack*)
      (push context *context-stack*)
      (setf (first *context-stack*) context))
  (restore-history-state context)
  (setq *current-ctxt* (ctxt context))          ; TAR 11/19/93
  (setq *context* context) )

(defmethod generate-object-definition ((self CONTEXT) &key &allow-other-keys)
  ;; Generate a definition of the context "self";
  ;; Note: The augmented definition is the same as the unaugmented (legal) one;
  `(defcontext
     ,(name self)
     ,(type-of-context self)
     ,@(loop for parentCxt in (parent-contexts self)
	    collect (name parentCxt))
     ,@(when (test-bit-flags (context-flag self) :context-flag :monotonic)
         '(:monotonic-p t))) )

;; TO DO:  MAKE THESE VALUES STORED BY POSITION IN A VECTOR SO THAT
;;    LESS SPACE IS TAKEN UP.  RIGHT NOW LEAVE AS AN ALIST FOR DEBUGGING
;;    PURPOSES.
(defun save-history-state (context)
  ;; Situation:  We are leaving "context";
  ;; Record the values of history state variables in "context";
  (setf (saved-history-variables context)
        `((*agent-time* . ,*agent-time*)
          (*previously* .  ,*previously*)
          (*query-agent-time* . ,*query-agent-time*)
          (*generating-histories-p* . ,*generating-histories-p*)
          (*history-limit* . ,*history-limit*)
          (*non-existent-*agent-time*-instance* . ,*non-existent-*agent-time*-instance*)
          (*list-of-*agent-time*-histories* . ,*list-of-*agent-time*-histories*)
          (*list-of-*agent-time-1*-histories* . ,*list-of-*agent-time-1*-histories*)
          (*list-of-oldest-histories* . ,*list-of-oldest-histories*)
          (*list-of-*agent-time*-indices* . ,*list-of-*agent-time*-indices*)
          (*list-of-*agent-time-1*-indices* . ,*list-of-*agent-time-1*-indices*)
          (*list-of-oldest-indices* . ,*list-of-oldest-indices*)
          (*list-of-modified-rete-instances* . ,*list-of-modified-rete-instances*)
          (*activated-cohort-queue* . ,*activated-cohort-queue*)
          (*match-is-pending-p* . ,*match-is-pending-p*)
          (*match-queues* . ,(copy-seq *match-queues*))
          (*queued-world-time-instance-list* . ,*queued-world-time-instance-list*)
          )) )

(defun clear-history-state (context)
  ;; Clear out the non-numeric history information for "context";
  ;; Note: We save the numeric information because setting it to nil
  ;;    or zero might cause problems;
  (loop for entry in (saved-history-variables context)
        as value = (cdr entry)
        do (typecase value
             (CONS   (setf (cdr entry) nil))
             (VECTOR (loop for i below (length value)
                           do (setf (aref value i) nil)))
             )) )

(defun restore-history-state (context)
  ;; Situation:  We are entering "context";
  ;; Restore the values of history state variables from "context";
  (loop for (var . value) in (saved-history-variables context)
        do (COMMON-LISP:set var value)) )


  ;;
;;;;;; Functions for adding-to and deleting-from contexts
  ;;

(defun intern-object (identifier object partitionId context)
  ;; Add the object "object" to the partition "partitionId" in either
  ;;    the current context or the one indicated by "context";
  ;; If "identifier" is nil, add it to the slot "anonymous-objects" in
  ;;    the appropriate partition;
  (when (null context)
    (setq context *context*))
  (cond
    (identifier
     (add-identifier-to-context identifier object partitionId context)
     (clear-get-instance-cache))
    ((eq partitionId :instances)
     (intern-anonymous-instance object context))
    (t ;; role or concept or relation with no identifier
     ;; THIS LOOKS TOO SLOW:
     (let ((p (find-partition partitionId (context-partitions context))))
	    (setf (anonymous-objects p)
		  (push object (anonymous-objects p))))))
  object )

(defun unintern-object (identifierOrObject partitionId context)
  ;; Remove the object keyed on "identifier" in the partition "partitionId"
  ;;    from either the current context or the one indicated by
  ;;    "context";
  ;; CAUTION: "unintern-object" assumes that if "identifierOrObject" is an
  ;;    object, then its identifier is found by evaluating
  ;;    "(context-identifier identifierOrObject)" --
  ;;    hence, TBOX-CONCEPTs must supply the identifier (not the object)
  ;;;      if "partitionId" equals :instances;
  (let (identifier object)
    (when (null context)
      (setq context *context*))
    (setq identifier
	  (if (symbolp identifierOrObject)
	      identifierOrObject
	      (context-identifier identifierOrObject)))
    (cond
      (identifier
       (setq object (delete-identifier-from-context
		      identifier partitionId context))
       (clear-get-instance-cache)
       (when (null object)
	 (warn "Can't unintern identifier ~S because can't find it in partition ~S~%   ~
                     in context ~S" identifier partitionId context)))
      ((eq partitionId :instances)
       (when (identifier identifierOrObject)	; protect from double uninterning
	 (unintern-anonymous-instance identifierOrObject)))
      (t ;; concept or relation with no identifier (NEVER HAPPENS???):
       (let ((p (find-partition partitionId (context-partitions context))))
	 (setf (anonymous-objects p)
	       (delete identifierOrObject (anonymous-objects p)))))) ))

(defun add-identifier-to-context (identifier object partitionId &optional context)
  ;; Insert "identifier" into the partition indicated by "partitionId"
  ;;    and "context", mapping it to "object";
  (when (null context)
    (setq context *context*))
  (let ((nameSpace (get-name-space-in-context partitionId context))
        newPartition)
    (when (null nameSpace)
      ;; create partition on the fly:
      (setq newPartition (create-context-partition partitionId context))
      (setq nameSpace (name-space newPartition)))
    (add-identifier-to-name-space identifier object nameSpace)) )

(defmethod tbox-concept-p (self)
  ;; Default method;
  (declare (ignore self))
  nil )

(defmethod tbox-concept-p ((self TBOX-CONCEPT))
  ;; Return t if the type of "self" is TBOX-CONCEPT;
  t )

(defun delete-identifier-from-context (identifier partition context)
  ;; Remove the entry mapping "identifier" to some object in the context
  ;;   "context" or one of its ancestors;
  ;; Return non-nil if a matching object was found (i.e., if something got deleted);
  (let (nameSpace matchingObject)
    (flet ((find-matching-object (context)
	     (when (setq nameSpace (get-name-space-in-context partition context))
	       (setq matchingObject (gethash identifier nameSpace)))))
        ;; (1) Look in the current context
      (find-matching-object context)
        ;; (2) If that fails, Look in all visible contexts
      (when (null matchingObject)
	(loop for cxt in (rest (context-precedence-list context))
	      do (find-matching-object cxt)
	    until matchingObject))
        ;; (3) If that fails, Look in ALL contexts.  Note: This should only
        ;;     occur for CLOS instances that have INSTANCE-IN-CONTEXT but not
        ;;     CONTEXT-SENSITIVE-INSTANCE-MIXIN.
      (when (null matchingObject)
	(loop for (nil . cxt) in *context-table*
	      do (find-matching-object cxt)
              until matchingObject))
      (if matchingObject
	  (delete-identifier-from-name-space identifier nameSpace)
	(grumble "Tried to unintern object named ~S but couldn't find it!" identifier))
      matchingObject )))

(defun export-names-in-context (contextOrName)
  "Place names of all objects belonging to `contextOrName' on package export
list(s)."
  ;; Note: We don't export names of system defined concepts, except when
  ;;    they are relations having corresponding roles;
  (let ((context (find-context contextOrName :error-p t)))
    (loop for obj in (list-context-objects context nil nil)
          as name = (object-name obj)
          unless (or (null name)
		     (typep obj 'KNOWLEDGE-BASE)
                     (and (tbox-concept-p obj)
                          (or (member :non-exported (attributes obj))
                              (and (system-defined-concept-p obj)
                                   (not (member :referenced-by-role
                                                (system-attributes obj)))))))
          do (export-object-name name)) ))

(defun export-object-name (name)
  ;; Place "identifier" on the package export list unless it is interned
  ;;    in the COMMON LISP package;
  (let ((package (symbol-package name)))
    (unless (eq package (symbol-package 'CONS))
      (export name package)) ))


  ;;
;;;;;; Generate list of context objects
  ;;

(defun list-context-objects (context partitionIds sortP)
  ;; Returns list of all instances in the partitions indicated by
  ;;    "partitionIds" in the context "context"
  ;; Possible values for "sortP" are:
  ;;    nil  - unsorted
  ;;    t    - sort everything
  ;;    :sort-each-partition   - sort partitions separately
  ;;    :as-defined            - sort in definition order
  (when (null context)
    (setq context *context*))
  (flet ((safe-numeric-lessp (x y)
	   (cond ((null x) (not y))
		 ((null y) x)
		 (t (< x y)))))
    (let* ((contextPartitions (collect-partitions context partitionIds)) 
	   result partitionInstances) 
      (loop for part in contextPartitions
	  do
	    (setq partitionInstances nil)
	    (if (eq (partition-identifier part) :instances)
		(do-context-partition (nil self part)
		  (unless (meta-thing-p self)
		    (push self partitionInstances)))
	      (do-context-partition (nil self part)
		(push self partitionInstances)))
	    (setq partitionInstances (fast-remove-duplicates partitionInstances))
	    (when (eq sortP :sort-each-partition)
	      (setq partitionInstances (sort partitionInstances #'string-lessp
					     :key #'object-name)))
	    (setq result (nconc partitionInstances result)))
      (when (and sortP (neq sortP :sort-each-partition))
	(if (eq sortP :as-defined)
	    (setq result 
	      (sort result #'safe-numeric-lessp :key #'sequence-number))
	  (setq result (sort result #'string-lessp :key #'object-name))))
      result )))

(defun collect-partitions (context partitionIds)
  ;; Check that each member of "partitionIds" names a valid partition
  ;;    of the context "context";
  ;; If "partitionIds" is nil, generate a list of all partition names;
  ;; Return a list of partitions, or nil if one or more is invalid;
  (when (null partitionIds)
    (setq partitionIds *legal-context-partition-identifiers*))
  (setq partitionIds
    (if (quoted-p partitionIds)
	(list partitionIds)
        (list-of partitionIds)))
  (loop for pId in partitionIds
        as p = (find-partition pId (context-partitions context))
        when p collect p) )

  ;;
;;;;;; Trapping incoherence
  ;;

;; TO DO: REWRITE THESE TO WORK WITH CONTEXTS (INSTEAD OF WORLDS):

(defmacro trapping-incoherence-p ()
  ;; Return t if occurrences of incoherence are being trapped
  ;;    (presumably by a "with-world");
  `(and (boundp '*exitIncoherentWorldP*)
        *exitIncoherentWorldP*) )

(defun throw-if-incoherent-world (instance)
  ;; Quickly abort the computation within incoherent world;
  (declare (special *exitIncoherentWorldP*))
  (when (trapping-incoherence-p)
    (setq *exitIncoherentWorldP* instance)
    #L:trace-merge (trace-values "incoherent world" instance *context*)
    (throw 'incoherent-world-catcher :incoherent)) )


