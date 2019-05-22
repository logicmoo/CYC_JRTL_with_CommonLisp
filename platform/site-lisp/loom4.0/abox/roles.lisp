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
 

;;; ROLES.LISP (ABOX)

(in-package "LOOM")

(export '(get-role get-instance-role get-roles get-explicitly-declared-roles
          get-role-types get-role-min-cardinality get-role-max-cardinality 
          get-role-cardinality get-role-values 
          get-role-strict-values get-role-default-values      ; DGB 9/28/93
          get-keys get-indices))


  ;;
;;;;;; get-role
  ;;

(defmethod get-role ((objectOrName SYMBOL) relationOrName &key no-error-p)
  (let ((object (or (get-sealed-concept objectOrName :no-error-p t)
		    (get-instance objectOrName :error-p nil))))
    (cond (object
	   (get-role object relationOrName :no-error-p no-error-p))
	  (no-error-p nil)
	  (t (grumble "No concept or instance found for name ~A" objectOrName)
	     nil)) ))

(defmethod get-role ((object UNARY-ENTITY) relationOrName &key no-error-p)
  "Return a role for relation `relationOrName' on concept `conceptOrName', or
nil if no such role can exist.  Signals an error if no such role can exist
when `no-error-p' is NIL."
  ;; TO DO:  DECIDE IF THIS SHOULD CREATE A ROLE IF NONE ALREADY EXISTS?
  ;;   NOTE THAT ROLES ARE NORMALLY NOT CREATED UNTIL CALLED FOR BY GET-ROLES...
  (let ((concept (get-sealed-concept object))
        (relation (get-relation relationOrName)))
    (when (and concept relation)
      (if (subconcept-p (or (more-specific-consequent concept) concept)
			(implied-domain relation))
	  (or (loop for role in (role-cache concept)
		  when (eq (relation role) relation)
                  return role)
	      (let ((newRole (create-role)))
		(setf (concept newRole) concept)
		(setf (relation newRole) relation)
		(push newRole (role-cache concept))
		newRole))
	(progn
          (unless no-error-p
            (complain "~%Concept ~A doesn't specialize~%the domain ~A of relation ~A,~%so ~A cannot have a role ~A.~%"
                      concept (implied-domain relation)
                      relation concept relation))
	  nil))) ))

(defmethod get-role ((object TBOX-RELATION) relationOrName &key no-error-p)
  "Return a role for relation `relationOrName' on relation `object', or
nil if no such role can exist."
  ;; TO DO:  DECIDE IF THIS SHOULD CREATE A ROLE IF NONE ALREADY EXISTS?
  ;;   NOTE THAT ROLES ARE NORMALLY NOT CREATED UNTIL CALLED FOR BY GET-ROLES...
  (let ((concept (get-relation object :no-error-p no-error-p))
        (relation (get-relation relationOrName :no-error-p no-error-p)))
    (when (and concept relation)
      (get-instance-role concept relation)) ))

(defmethod get-role ((object CLOS-INSTANCE) relationOrName &key no-error-p)
  "Return a role for relation `relationOrName' on instance `conceptOrName', or
nil if no such role can exist."
  ;; TO DO:  DECIDE IF THIS SHOULD CREATE A ROLE IF NONE ALREADY EXISTS?
  ;;   NOTE THAT ROLES ARE NORMALLY NOT CREATED UNTIL CALLED FOR BY GET-ROLES...
  (declare (ignore relationOrName))
  (unless no-error-p
    (grumble "CLOS Instances cannot have role objects associated with them."))
  nil )

(defmethod get-role ((object INSTANCE-WITH-DYNAMIC-SLOTS) relationOrName 
		     &key no-error-p)
  "Return a role for relation `relationOrName' on instance `conceptOrName', or
nil if no such role can exist."
  ;; TO DO:  DECIDE IF THIS SHOULD CREATE A ROLE IF NONE ALREADY EXISTS?
  ;;   NOTE THAT ROLES ARE NORMALLY NOT CREATED UNTIL CALLED FOR BY GET-ROLES...
  (let ((relation (get-relation relationOrName :no-error-p no-error-p)))
    (when relation
      (get-instance-role object relation))))

(defmethod get-role ((object DB-INSTANCE) relationOrName &key no-error-p)
  "Return a role for relation `relationOrName' on instance `conceptOrName', or
nil if no such role can exist."
  ;; TO DO:  DECIDE IF THIS SHOULD CREATE A ROLE IF NONE ALREADY EXISTS?
  ;;   NOTE THAT ROLES ARE NORMALLY NOT CREATED UNTIL CALLED FOR BY GET-ROLES...
  (let ((relation (get-relation relationOrName :no-error-p no-error-p)))
    (when relation
      (get-instance-role object relation))))


(defun get-instance-role (instance relation)
  "Return an instance role for relation `relation' on `instance'.  This is similar
the function `GET-ROLE', but returns a role specifically for this instance."
  (when relation
    (or (loop for role in (instance-role-cache instance)
	    when (eq (relation role) relation)
	    return role)
	(let ((newRole (create-role)))
	  (setf (instance newRole) instance)
	  (setf (relation newRole) relation)
	  (push newRole (instance-role-cache instance))
	  newRole))) )

(defun get-roles (conceptOrInstanceOrName &key instance-role-on-concept-p)
  "Return a list of roles for the concept or instance `conceptOrInstanceOrName'."
  (let ((object (if (symbolp conceptOrInstanceOrName)
                    (or (get-sealed-concept conceptOrInstanceOrName
                                            :no-error-p t)
                        (get-instance conceptOrInstanceOrName
                                      :error-p nil))
                  conceptOrInstanceOrName)))
    (cond
      ((concept-p object)
       (if instance-role-on-concept-p
	   (loop for r in (compute-instance-role-relations object)
	     when (get-instance-role object r) collect it)
	 (loop for r in (compute-role-relations object)
	       when (get-role object r) collect it)))
      ((instance-p object)
       (loop for r in (compute-instance-role-relations object)
	   when (get-role object r) collect it))
      (t (grumble "~A is not a concept or instance" conceptOrInstanceOrName))) ))

(defun compute-role-relations (concept)
  ;; Return a list of binary relations that correspond to roles of "concept";
  (let ((relations nil)
	(nonRoleRelations nil)		; Used to filter out :at-most 0 entries
	(domainImpliesRoleP (member :domain-implies-role *loom-features*))
	(testConcept (or (more-specific-consequent concept) concept)))
    (labels ((collect-transitively (rel)
	       (unless (or (member rel relations)
			   (member rel nonRoleRelations))
	         (when (or (user-defined-concept-p rel)
			   (member :referenced-by-role (system-attributes rel)))
                   (push rel relations))
                 (loop for r in (sub-concepts rel)
	             when (subconcept-p testConcept (implied-domain r))
		     do (collect-transitively r))))
	     (collect-relations (c)
	       (loop for role in (role-cache c)
		     do (collect-transitively (relation role)))
	     ;; Rule 3 of the slot inheritance rules:
	       (when (and domainImpliesRoleP (neq c *thing*))
		 ;; Note: This is expensive, but is disabled by default:
;               (do-subconcepts (?r *binary-tuple*)
;                 (when (and (neq (implied-domain ?r) *thing*)
;                            (subconcept-p concept (implied-domain ?r)))
;                   (pushnew ?r relations)))
	       ;; Faster method:  ; TAR 3/28/96
		 (loop for dep in (non-tbox-dependents c)
		       when (and (typep dep 'BINARY-RELATION)
				 (user-defined-concept-p dep))
		       do (if (eq c (implied-domain dep))
			      (collect-transitively dep)
			      (when (and (inverse dep)
					 (eq c (implied-range dep)))
				(collect-transitively (inverse dep)))))
		 (loop for dep in (dependents c)
		     when (and (typep dep 'BINARY-RELATION)
			       (user-defined-concept-p dep))
		     do (if (eq c (implied-domain dep))
			      (collect-transitively dep)
			      (when (and (inverse dep)
					 (eq c (implied-range dep)))
				(collect-transitively (inverse dep)))))
		 )
             ;; Rule 2 of the slot inheritance rules:
	       (loop for ftr in (implied-restrictions c)
				;; Max 0 restrictions mean NOT a role.
		   when (and (eq (feature-type ftr) :max-restriction)
			     (eql (upper-bound ftr) 0))
		   do (push (relation ftr) nonRoleRelations)
		      (setf relations (delete (relation ftr) relations))
		      ;; Not filled-by doesn't imply a role.
		   else unless (eq (feature-type ftr) :not-filled-by)
		   do (collect-transitively (relation ftr)))
	       (loop for ftr in (default-features c)
				;; Default value can never stop something
				;; from being a role, but :max 0 doesn't
				;; imply being a role.
		   unless (or (and (eq (feature-type ftr) :max-restriction)
				   (eql (upper-bound ftr) 0))
			      (eq (feature-type ftr) :not-filled-by))
		   do (collect-transitively (relation ftr)))))
      (convert-roles-to-objects concept)
      (collect-relations testConcept)
      (loop for super in (all-super-concepts testConcept)
	    unless (property-p super)
	    do (collect-relations super))
      relations )))

(defmethod compute-instance-role-relations ((instance t))
  nil)

(defmethod compute-instance-role-relations ((instance CLOS-INSTANCE))
  (let ((result (when (intrinsic-concept instance)
		  (collect-declared-role-relations 
                   (intrinsic-concept instance) nil))))
    (loop for slotName in (get-names-of-slots (CLOS::class-of instance))
	as relation = (get-relation slotName :no-error-p t)
	when relation
	do (pushnew relation result))
    result))

(defmethod compute-instance-role-relations ((instance INSTANCE-WITH-DYNAMIC-SLOTS))
  (union (call-next-method)
	 (get-dynamic-slot-relations instance)))

(defmethod compute-instance-role-relations ((instance DB-INSTANCE))
  (union (get-non-zero-restriction-relations (asserted-features instance))
	 (get-dynamic-slot-relations instance)))

(defmethod compute-instance-role-relations ((instance INSTANCE-WITH-NEGATION))
  (union (get-non-zero-restriction-relations (asserted-features instance))
	 (call-next-method)))

;; helping functions for "compute-instance-role-relations":

(defun get-dynamic-slot-relations (self)
  ;; Called by "DB-INSTANCE.compute-instance-role-relations" and
  ;;    "INSTANCE-WITH-DYNAMIC-SLOTS.compute-instance-role-relations";
  ;; Return a list of relations retrieved from dynamically allocated slots
  ;;    of "self"				;
  (loop for (slotName . nil) in (dynamic-variables self)
      as role = (get-relation slotName :no-error-p t)
      when (and role
		(symbolp slotName))	; avoid phantom inverse
      collect role) )

(defun get-non-zero-restriction-relations (featureList)
  ;; Return the relations referenced in featureList which do
  ;;  not have an :at-most 0 restriction;
  (let ((relations nil)
	(nonRoleRelations nil))
    (loop for ftr in featureList
	when (and (eq (feature-type ftr) :max-restriction)
		  (eql (upper-bound ftr) 0))
	do (push (relation ftr) nonRoleRelations)
	   (setf relations (delete (relation ftr) relations))
	else unless (or (member ftr nonRoleRelations)
			(eq (feature-type ftr) :not-filled-by))
	do (push (relation ftr) relations))
    relations))

(defun collect-declared-role-relations (concept direct-p)
  ;; Helping function for "get-explicitly-declared-roles" and 
  ;;   "compute-instance-role-relations";
  (let ((roleRelations nil))
    (flet ((%collect-declared-role-relations (concept)
	     ;; NOTE:  Any changes made here need to be reflected in the function
	     ;;   COLLECT-DECLARED-ROLE-RELATIONS as well.  This is done to 
	     ;;   reduce consing here.
	     (loop for defn in (source-definitions concept)
		 do (loop for roleForm in (list-of (getf (cdr defn) :roles))
			when (symbolp roleForm)
			do (push (get-relation roleForm) roleRelations)
			else collect (push (get-relation (first roleForm))
					   roleRelations)))))
      
      (when concept
	(%collect-declared-role-relations concept)
	(unless direct-p
	  (loop for super in (all-super-concepts concept)
	      do (%collect-declared-role-relations super))))
      ;; Note: The duplicate role removal logic use here is somewhat arbitrary;
      (fast-remove-duplicates roleRelations) )))


(defun get-explicitly-declared-roles (conceptOrName &key direct-p)
  "Return a list of explicitly-declared roles (including inherited roles unless
`direct-p' is non-NIL) for the concept `conceptOrName'.  A role is explicitly
declared if it appears in a :roles clause."
  (let ((concept (get-concept conceptOrName)))
    (loop for relation in (collect-declared-role-relations concept direct-p)
      when (get-role concept relation) collect it) ))


  ;;
;;;;;; Role construction functions (called during sealing)
  ;;

(defmethod convert-roles-to-objects ((self UNARY-RELATION))
  ;; Properties don't have roles -- do nothing;
  nil )

(defmethod convert-roles-to-objects ((self UNARY-CONCEPT))
  ;; Called by "UNARY-ENTITY.help-seal-one-concept";
  ;; Create a role object for each entry in "(role-cache self)" if a previous
  ;;    call has not already done so;
  ;; If the entry contains a :facets attribute, assert the facets
  ;;    on the new role object;
  ;; If the entry contains a :function attribute, store the source
  ;;    for the function on the role object;
  (when (or (null (role-cache self))
            ;; exit if roles have already been converted to objects
            (not (consp (first (role-cache self)))))
    (return-from convert-roles-to-objects nil))
  (let ((roles nil))
    (loop for entry in (role-cache self)
          as newRole = (create-role)
          do
          (setf (concept newRole) self)
          (setf (relation newRole) (first entry))
          (setf (role-specification newRole) (rest entry))
          (loop for tail on (rest entry) by #'cddr
                do
                (case (first tail)
                  (:facets              ; make actual facet assertions:
                   (assert-annotations newRole))
                  (:characteristics
                   (setf (characteristics newRole)
                         (second tail)))
                  (otherwise            ; do nothing here
                   nil)))
          (push newRole roles))
    (setf (role-cache self) roles) ))

(defun create-role ()
  ;; Create a new role instance;
  ;; We DO NOT intern role into a knowledge base;
  ;; NOTE: If we change our mind, and decide to intern roles, then
  ;;    functions that scan relations may break (e.g., "detach-tbox-concepts"
  ;;    will break);
  ;; NOTE: We use "create-clos-instance" here in order to circumvent any problems
  ;;    with not having the Loom concept ROLE sealed, since this function is called
  ;;    during the sealing of concepts!
  (let ((newRole (create-clos-instance nil 'ROLE *context*)))
    newRole ))


  ;;
;;;;;; Compiling role accessors
  ;;

(defun define-role-accessor-function (role)
  ;; Define a Lisp method with name "(name (relation role))" on the
  ;;    class shadowed by "(concept role)";
  ;; Also, install an accessor function on the relation "(relation role)"
  ;;    that invokes this method inside of a query, and define a method
  ;;    that enables Loom instances to call this role accessor;
  (let* ((source (getf (role-specification role) :function))
         (lambdaExpression (if (consp source)
                             `(lambda ,@source)
                             ;; "source" is the name of a function:
                             (unless (eq source (name (relation role)))
                               `(lambda (self) (,source self)))))
         (relation (relation role))
         (functionCalledByRelation (auxiliary-lambda-function relation))
         (roleName (name relation))
         method)
    (when (and functionCalledByRelation
               (neq functionCalledByRelation roleName))
      (complain "~&Can't define an accessor for the role ~S on concept ~S~%   ~
                 because another accessor has been defined for the relation ~S."
                roleName (name (concept role)) roleName)
      (return-from define-role-accessor-function nil))
    ;; surgically define an access function for the global relation:
    (setf (auxiliary-lambda-function relation) roleName)
    ;; insure that the role's relation's accessor function is recomputed:
    (when (sealed-p relation)
      (seal-predicate-symbol relation))
    (when (non-generic-function-p roleName)
      (unless (eq source roleName)
        (complain "~&Can't define an accessor for the role ~S on concept ~S~%   "
                  roleName (name (concept role)))
        (if (common-lisp-symbol-p roleName)
          (complain "because the name of that role belongs to the Common Lisp package.")
          (complain "because a (non-generic) function with the same name has ~
                     already been defined.")))
      (return-from define-role-accessor-function nil))
    ;; insure that a method for Loom objects on the role "role"
    ;;    exists, and that a generic function named "roleName" exists:
    (add-unary-method
     roleName T ; 'BASIC-INSTANCE  ; TAR 10/8/93  Build a default catcher.
     `(lambda (self)
        (apply-most-specific-role-accessor ',roleName self)))
    ;; define a Lisp method that invokes the accessor function (unless
    ;;    they have the same name, in which case the accessor already exists):
    (when lambdaExpression
      (if (shadowed-by-clos-class-p (concept role))
        (let ((className (or (clos-class-name (concept role))
                             (name (concept role)))))
          (find-or-create-clos-class className)
          (warn-if-redefining-method roleName className lambdaExpression)
          (setq method
                (add-unary-method roleName className lambdaExpression))
          ;; save compiled accessor for use by Loom instances:
          (setf (compiled-accessor-function role)
                (slot-value method 'CLOS::function)))
        ;; compile accessor for use by Loom instances:
        (setf (compiled-accessor-function role)
              (compile nil lambdaExpression)) )) ))

(defun warn-if-redefining-method (methodName className lambdaExpression)
  ;; Helping function for "define-role-accessor-function";
  #-:TI
  (let* ((method (CLOS::find-method
                  (symbol-function methodName) nil
                  (list (CLOS::find-class className)) nil))
         (oldFunction
          (and method
               (slot-value method 'CLOS::function)))
         (oldLambdaExpression
          (and oldFunction
               (fboundp 'function-lambda-expression)    ; check CLTL2 compliance
               (function-lambda-expression oldFunction))))
    (when (and method
               oldLambdaExpression      ; Make less alarmist  TAR 8/13/93
               (not (filler-equal lambdaExpression oldLambdaExpression)))
      (inform "~%Redefining a role accessor for the role ~S on class ~S."
              methodName className)) ))

(defun apply-most-specific-role-accessor (roleName self)
  ;; Apply a role accessor function corresponding to "roleName"
  ;;    to "self";
  ;; TO DO:  MAKE THIS DO SOMETHING REASONABLE WITH ALL INPUTS.  THIS IS
  ;;         NOW CALLED IN THE DEFAULT (T) METHOD OF ROLE CODE.  IT NEEDS
  ;;         TO HANDLE LOOM, LITE AND CLOS INSTANCES PROPERLY AND RETURN
  ;;         nil IN OTHER CASES;
  (declare (ignore roleName self))
  ; (print "ROLE ACCESSORS FOR LOOM INSTANCES NOT YET IMPLEMENTED")
  nil )

(defun non-generic-function-p (name)
  ;; Used to determine if its not save to create a generic function
  ;;    with name "name";
  ;; Return true if "name" is bound to a non-generic function, or
  ;;    return true if "name" is interned into the  CommonLisp package
  ;;    and "name" is not bound to a generic function (e.g., "name" is
  ;;    not fbound at all);
  (or (and (fboundp name)
           (not (typep (symbol-function name) 'CLOS::GENERIC-FUNCTION)))
      (or (and (eq (symbol-package name) (symbol-package 'CONS))
               (not (fboundp name))))) )


#-(or :lucid :ti :mcl :aclpc :cmu18)
;; NEW, Meta-Object Protocol compliant:
(defun add-unary-method (methodName className lambdaExpression)
  ;; Create a method with name "methodName" for the class named "className",
  ;;    where "lambdaExpression" defines its parameter and body;
  ;; "lambdaExpression" may be the name of a Lisp function;
  (CLOS::ensure-generic-function methodName :lambda-list '(self))
  (let ((newMethod (make-instance 'CLOS::STANDARD-METHOD
                     :lambda-list (cadr lambdaExpression)
                     :specializers (list (CLOS::find-class className))
                     :function (compile nil lambdaExpression))))
    (CLOS::add-method (symbol-function methodName) newMethod)
    newMethod ))

#+(or :MCL :lucid)
;; Works in MCL 2.0, Lucid 4.0, ?
(defun add-unary-method (methodName className lambdaExpression)
  ;; Create a method with name "methodName" for the class named "className",
  ;;    where "lambdaExpression" defines its parameter and body;
  ;; "lambdaExpression" may be the name of a Lisp function;
  (CLOS::ensure-generic-function methodName :lambda-list '(self))
  (let ((newMethod (make-instance 'CLOS::STANDARD-METHOD)))
    (setf (slot-value newMethod 'CLOS::specializers) 
          (list (CLOS::find-class className)))
    (setf (slot-value newMethod 'CLOS::function)
          (compile nil lambdaExpression))
    #-:MCL (setf (slot-value newMethod 'CLOS::lambda-list)
		 (second lambdaExpression))
    #+:MCL (setf (slot-value newMethod 'CLOS::name) methodName)
    (CLOS::add-method (symbol-function methodName) newMethod)
    newMethod ))

#+:ACLPC
(defun add-unary-method (methodName className lambdaExpression)
  ;; Create a method with name "methodName" for the class named "className",
  ;;    where "lambdaExpression" defines its parameter and body;
  ;; "lambdaExpression" may be the name of a Lisp function;
   (eval `(defmethod ,methodName ((,(caadr lambdaExpression) ,className))
             ,@(cddr lambdaExpression))))

#+:TI
(defun add-unary-method (methodName className lambdaExpression)
  ;; Create a method with name "methodName" for the class named
  ;;    "className", where "lambdaExpression" defines its
  ;;    parameter and body;
  ;; "lambdaExpression" may be the name of a Lisp function;
  (CLOS::ensure-generic-function methodName :lambda-list '(self))
  (let ((newMethod (make-instance 'CLOS::STANDARD-METHOD)))
    (setf (slot-value newMethod 'CLOS::parameter-specializers) 
          (list (CLOS::find-class className)))
    (setf (slot-value newMethod 'TICLOS::qualifiers) nil)
    (setf (slot-value newMethod 'TICLOS::arglist-description) '(1 0))
    (setf (slot-value newMethod 'CLOS::function)
          (compile nil lambdaExpression))
    (CLOS::add-method (symbol-function methodName) newMethod)
    newMethod ))

 ;; Should this be :cmu17 ?
#+:cmu18
(defun add-unary-method (methodName className lambdaExpression)
  ;; Create a method with name "methodName" for the class named "className",
  ;;    where "lambdaExpression" defines its parameter and body;
  ;; "lambdaExpression" may be the name of a Lisp function?;
  ;; Note: current MOP functions work on PCL's version of the class
  ;; system, not lisp' parallel versions.
  ;; The :function arg to make-instance is a function of two args,
  ;;     the first arg is a list of the args to pass to the function,
  ;;     the second arg is a list of next-methods. MAKE-METHOD-LAMBDA
  ;;     is MOP's way of generating such a function that works.
  (ensure-generic-function methodName :lambda-list '(self))
  (let* ((proto-gf (symbol-function methodName))
	 (proto-me (MOP:class-prototype (find-class 'standard-method)))
	 (class-sp (MOP:class-of (MOP:class-prototype (find-class className))))
	 (method-function-lambda
	  (MOP:make-method-lambda proto-gf proto-me lambdaExpression nil))
	 (newMethod (make-instance (MOP:class-of proto-me) ; s-g-f
		      :lambda-list (cadr lambdaExpression)
		      :specializers (list class-sp)
		      :function (compile nil method-function-lambda))))
    (add-method (symbol-function methodName) newMethod)
    newMethod ))

  ;;
;;;;;; Functions for computing values of role facets
  ;;


(defmethod get-role-types ((self T) relation &key qualification raw-p)
  (declare (ignore relation qualification raw-p))
  nil)
(defmethod get-role-types ((self LOOM-OBJECT) relation &key qualification raw-p)
  (compute-role-types-for-instance self relation qualification raw-p) )
(defmethod get-role-types ((self CLOS-INSTANCE) relation &key qualification raw-p)
  (compute-role-types-for-instance self relation qualification raw-p) )
(defmethod get-role-types ((self UNARY-CONCEPT) relation &key qualification raw-p)
  (compute-role-types-for-concept self relation qualification raw-p) )

(defmethod get-role-min-cardinality ((self T) relation &key qualification)
  (declare (ignore relation qualification))
  nil)
(defmethod get-role-min-cardinality ((self LOOM-OBJECT) relation &key qualification)
  (compute-minimum-role-cardinality-for-instance self relation qualification) )
(defmethod get-role-min-cardinality ((self CLOS-INSTANCE) relation &key qualification)
  (compute-minimum-role-cardinality-for-instance self relation qualification) )
(defmethod get-role-min-cardinality ((self UNARY-CONCEPT) relation &key qualification)
  (compute-minimum-role-cardinality-for-concept self relation qualification) )

(defmethod get-role-max-cardinality ((self T) relation &key qualification)
  (declare (ignore relation qualification))
  nil)
(defmethod get-role-max-cardinality ((self LOOM-OBJECT) relation &key qualification)
  (compute-maximum-role-cardinality-for-instance self relation qualification) )    ; DGB 9/28/93
(defmethod get-role-max-cardinality ((self CLOS-INSTANCE) relation &key qualification)
  (compute-maximum-role-cardinality-for-instance self relation qualification) )
(defmethod get-role-max-cardinality ((self UNARY-CONCEPT) relation &key qualification)
  (compute-maximum-role-cardinality-for-concept self relation qualification) )     ; DGB 9/28/93
(defun get-role-cardinality (self relation &key qualification)
  (let ((minCard (get-role-min-cardinality self relation :qualification qualification)))
    (when (eql minCard (get-role-max-cardinality self relation :qualification qualification))
      minCard) ))

;;; These may be hard to do with qualifications!
(defmethod get-role-values ((self T) relation &key qualification)
  (declare (ignore relation qualification))
  nil)
(defmethod get-role-values ((self LOOM-OBJECT) relation &key qualification)
  (if qualification
      (loop for filler in (get-values self relation)
	  when (has-instance-p qualification filler)
	  collect filler)
      (get-values self relation)) )
(defmethod get-role-values ((self CLOS-INSTANCE) relation &key qualification)
  (if qualification
      (loop for filler in (get-values self relation)
	  when (has-instance-p qualification filler)
	  collect filler)
    (get-values self relation)) )
(defmethod get-role-values ((self UNARY-CONCEPT) relation &key qualification)
  (union (get-role-strict-values self relation :qualification qualification)
         (get-role-default-values self relation :qualification qualification)
         :test #'filler-equal))
(defun get-role-strict-values (concept relation &key qualification)
  (compute-strict-role-members-for-concept concept relation qualification) )
(defun get-role-default-values (concept relation &key qualification)                        ; DGB 9/28/93
  (compute-default-role-members-for-concept concept relation qualification) )

(defun get-role-min-value (self relation &key qualification)
  ;; Returns the highest Lower bound.
  (flet ((compute-max (v1 v2 e1 e2)
	   (cond ((null v1) (values v2 e2))
		 ((symbolp v1) (values v2 e2))	; V1 is -INFINITY!
		 ((symbolp v2) (values v1 e1))	; V2 is -INFINITY!
		 #+:measures
		 ((ms:dim< v1 v2) (values v2 e2))
		 #-:measures
		 ((< v1 v2) (values v2 e2))
		 #+:measures
		 ((ms:dim= v1 v2) (values v1 (and e1 e2)))
		 #-:measures
		 ((= v1 v2) (values v1 (and e1 e2)))
		 (t (values v1 e1)))))
    (let ((types (get-role-types self relation :qualification qualification :raw-p t))
	  (minValue nil)
	  (minExactP nil))
      (ignore-errors			; Handle mismatch in numeric types!
       (loop with thisMin = nil and thisExactP = nil
	   for type in types
	   do (multiple-value-setQ (thisMin ThisExactP) (min-value type))
	   when thisMin
	   do (cond ((null minValue) (setq minValue thisMin minExactP thisExactP))
		    (thisMin (setq minValue (compute-max thisMin minValue thisExactP minExactP)))))
       (values minValue minExactP)) )))

(defun get-role-max-value (self relation &key qualification)
  ;; Returns the lowest Upper bound.
  (flet ((compute-min (v1 v2 e1 e2)
	   (cond ((null v1) (values v2 e2))
		 ((symbolp v1) (values v2 e2))	; V1 is -INFINITY!
		 ((symbolp v2) (values v1 e1))	; V2 is -INFINITY!
		 #+:measures
		 ((ms:dim> v1 v2) (values v2 e2))
		 #-:measures
		 ((> v1 v2) (values v2 e2))
		 #+:measures
		 ((ms:dim= v1 v2) (values v1 (and e1 e2)))
		 #-:measures
		 ((= v1 v2) (values v1 (and e1 e2)))
		 (t (values v1 e1)))))
    (let ((types (get-role-types self relation :qualification qualification :raw-p t))
	  (maxValue nil)
	  (maxExactP nil))
      (ignore-errors			; Handle mismatch in numeric types!
       (loop with thisMax = nil and thisExactP = nil
	   for type in types
	   do (multiple-value-setQ (thisMax ThisExactP) (max-value type))
	   when thisMax
	   do (cond ((null maxValue) (setq maxValue thisMax maxExactP thisExactP))
		    (thisMax (setq maxValue (compute-min thisMax maxValue thisExactP maxExactP)))))
       (values maxValue maxExactP)) )))


;; UNCOMMENT THIS WHEN WE IMPLEMENT :set-of FOR RETRIEVE:
;(defmethod get-role-all-members ((?self LOOM-OBJECT) ?relation)
;  (retrieve ?member (members (:set-of ?filler (?relation ?self ?filler))
;                             ?member))))

(defmethod value-type ((self ROLE))
  (get-role-types (concept self) (relation self)) )

;; Begin 8/15/96 change -- TAR  [More-specific-consequent code added]
(defun compute-role-types-for-concept (concept relation qualification rawP)
  ;; Return the type (value-restriction) of the role on "concept" and 
  ;;    "relation";
  ;; Added Qualification test ; TAR 11/9/98
  (let ((types nil) localrelation)
    (declare (ignorable localrelation))
    (multiple-value-setq (localrelation qualification)
      (compute-local-relation&qualification relation qualification))
    (loop for res in (implied-restrictions (or (more-specific-consequent concept)
						concept))
          when (and (eq (feature-type res) :value-restriction)
                    (subconcept-p relation (relation res))     ; TAR 3/23/95
		    (or (null (qualification res))
			(and qualification
			     (subconcept-p qualification (qualification res)))))
          do (pushnew (value-restriction res) types))
    (or (if rawP
	    (most-specific-conjuncts (most-specific-concepts types))
	  (find-most-specific-named-super-concepts types))
        (list-of (implied-range relation)))) )          ;  TAR 10/22/96

(defun compute-minimum-role-cardinality-for-concept (concept relation qualification)
  ;; Return the minimum cardinality of the role on "concept" and "relation";
  (largest-asserted-min relation
			qualification
			(implied-restrictions (or (more-specific-consequent concept)
						  concept))) )

(defun compute-maximum-role-cardinality-for-concept (concept relation qualification)
  ;; Return the maximum cardinality of the role on "concept" and "relation";
  (smallest-asserted-max relation
			 qualification
			 (implied-restrictions (or (more-specific-consequent concept)
						   concept))) )

(defun compute-strict-role-members-for-concept (concept relation qualification)
  ;; Return the fillers of the role on "concept" and "relation";
  (let ((fillers nil))    
    (loop for res in (specializing-restrictions
                      relation 
		      qualification
		      (implied-restrictions (or (more-specific-consequent concept)
						  concept))
		      :filled-by)
          do (setq fillers (union fillers (role-fillers res) :test #'filler-equal)))
    fillers ))

(defun compute-default-role-members-for-concept (concept relation qualification)
  ;; Return the fillers of the role on "concept" and "relation";
  (let ((fillers nil))    
    (loop for res in (specializing-restrictions
                      relation 
		      qualification
		      (default-features (or (more-specific-consequent concept)
					    concept))
		      :filled-by)
	  do (setq fillers (union fillers (role-fillers res) :test #'filler-equal)))
    fillers ))
;; End 8/15/96 change


(defun compute-role-types-for-instance (instance relation qualification rawP)
  ;; Return the concept representing the value restriction that
  ;;    applies to "instance" for the binary relation "relation";
  ;; Note: Assumes that the type of "instance" has been computed;
  (let ((computedTypes (nconc (loop for c in (list-of (find-type&residue-features instance))
		       ;; Code commented out doesn't return SET-INTERVALs.  But the substitute
                       ;;   code may break if FIND-TYPE&RESIDUE-FEATURES returns > 1  value!
		       ;                    nconc (compute-value-restriction c relation 
                       ;                                                    :return-a-list-p t)
				  nconc (compute-role-types-for-concept
					 c relation qualification rawP))
			      (compute-local-role-type-for-instance
			       instance relation qualification :return-a-list-p t))))
    (or (if rawP
	    (most-specific-conjuncts (most-specific-concepts computedTypes))
	  (find-most-specific-named-super-concepts computedTypes))
	(list-of qualification)
	(list-of (implied-range relation))) )) ;  TAR 10/22/96


(defun compute-local-role-type-for-instance (instance relation qualification
					     &key return-a-list-p)
  ;; Return the value restriction asserted for the relation "relation"
  ;;    on "instance";
  ;; REWRITE THIS WHEN RESTRICTIONS ARE RE-IMPLEMENTED;
  (let ((valueRestrictions (list (range relation))))
    (when (and qualification
	       (not (subconcept-p (range relation) qualification)))
      (pushnew qualification valueRestrictions))
    (loop for f in (asserted-features instance)
	 when (and (eq (feature-type f) :value-restriction) ; DGB 9/20/90
                   (suBconcept-p relation (relation f))
		   (value-restriction f))
	 do
	 (push (consequent-concept (value-restriction f))
	       valueRestrictions))
    (cond
      (return-a-list-p
       valueRestrictions)
      ((cdr valueRestrictions)
       (consequent-concept (compute-conjunction-concept valueRestrictions)))
      (t					; zero or one restriction found
       (car valueRestrictions))) ))		; DGB 9/21/90

(defun compute-minimum-role-cardinality-for-instance 
       (instance relation qualification &key super-concepts)
  ;; Return the minimum number restriction that applies to "instance" 
  ;;    for the relation "relation";
  ;; If "super-concepts", then use them rather than "(db-type instance)" to
  ;;    locate inherited restrictions;
  ;; Note: In the absence of "super-concepts", assumes that the type of
  ;;    "instance" has been computed;
  (max (largest-asserted-min relation qualification (asserted-features instance))
       (loop for c in (or super-concepts      ; vv TAR 10/20/93
                          (list-of (find-type&residue-features instance)))
	   maximize (largest-asserted-min
		     relation qualification (implied-restrictions c)))) )

(defun compute-maximum-role-cardinality-for-instance
    (instance relation qualification &key super-concepts)
  ;; Return the maximum number restriction that applies to "instance" 
  ;;    for the relation "relation";
  ;; If "super-concepts", then use them rather than "(db-type instance)" to
  ;;    locate inherited restrictions;
  ;; Note: In the absence of "super-concepts", assumes that the type of
  ;;    "instance" has been computed;
  (let ((conjuncts (or super-concepts       ; vv TAR 10/20/93
                       (list-of (find-type&residue-features instance))))
        (lowestMaximum
         (smallest-asserted-max relation qualification (asserted-features instance))))
    (loop for c in conjuncts
          do
          (setq lowestMaximum
                (compute-minimum-upper-bound
                 lowestMaximum
                 (smallest-asserted-max 
		  relation qualification (implied-restrictions c)))))
    lowestMaximum ))

(defun compute-minimum-upper-bound (bound1 bound2)
  ;; Helping function for "compute-maximum-role-cardinality-for-instance";
  ;; Return a number or 'INFINITY representing the smaller
  ;;    of "bound1" and "bound2";
  (if (numberp bound2)
      (if (numberp bound1)
	  (min bound2 bound1)
	  bound2)
      bound1) )


  ;;
;;;;;; Keys and indices
  ;;

;; Note: We had to put this code somewhere:

(defun check-for-unfilled-keys (instance key)
  ;; Complain of one of the roles in "key" on "instance" is not filled;
  (loop for role in key
        when (null (fget-value instance role))
        do (complain "~&Instance ~S has a null value for the role ~S belonging
to the key ~S." instance role key)) )

(defun get-keys (conceptOrName &key direct-p)
  "Return a list of keys (a list of lists) on `conceptOrName'
If ':direct-p' then return only the keys directly attached to `conceptOrName',
otherwise include inherited keys as well."
  (let ((startingConcept (get-concept conceptOrName))
        (keys nil))
    (flet ((push-local-keys (concept)
             (loop for key in (reverse (keys concept))
                   do (push key keys))))
      (when (keyed-concept-p startingConcept)
        (push-local-keys startingConcept)
        (unless direct-p
          (loop for super in (all-super-concepts startingConcept)
                when (keyed-concept-p super)
                do (push-local-keys super)))
        keys) )))

(defun get-indices (conceptOrName &key direct-p)
  "Return a list of indices (a list of lists) on `conceptOrName'
If ':direct-p' then return only the indices directly attached to `conceptOrName',
otherwise include inherited indices as well."
  (let ((startingConcept (get-concept conceptOrName))
        (indices nil))
    (flet ((push-local-indices (concept)
             (loop for index in (reverse (query-index-roles concept))
                   do (push index indices))))
      (push-local-indices startingConcept)
      (unless direct-p
        (loop for super in (all-super-concepts startingConcept)
              do (push-local-indices super)))
      indices )))

(defun update-query-index (index instance role newFiller assertion/retraction)
  ;; Add an index entry for "instance" if all roles of index are filled;
  ;; Also, if the index has a unique key, flag an attempt to insert a second
  ;;    index entry on the same key;
  ;; BUG:  THIS WILL FAIL FOR INDEX VALUES THAT ARE DIM NUMBERS BECAUSE
  ;;       HASH-TABLES DON'T SUPPORT THEM!
  (let* ((roles (index-roles index))
         (key (if (null (rest roles))
                newFiller
                (loop for r in roles
                      collect
                      (if (eq r role)
                        newFiller
                        (or (get-slot-value instance r) ; was (first (probe-local-role-fillers instance r));tar 7/1/93
                            (return-from update-query-index nil)))))))
    (if (unique-key-p index)
      (case assertion/retraction
        (:assertion
         (if (gethash key (index-hash-table index))
           (grumble "Key violation:  Instances ~S and ~S have identical keys
on the role~P ~{~S~^, ~}.  Violation occured while updating the role ~S."
                    instance (gethash key (index-hash-table index))
                    (length roles) roles role)
           (setf (gethash key (index-hash-table index)) instance)))
        (otherwise                      ; retraction
         (setf (gethash key (index-hash-table index)) nil)))
      (case assertion/retraction
        (:assertion
         (push instance (gethash key (index-hash-table index))))
        (otherwise                      ; retraction
         (setf (gethash key (index-hash-table index))
               (delete instance 
                       (gethash key (index-hash-table index))
                       :test #'filler-equal))))) ))
