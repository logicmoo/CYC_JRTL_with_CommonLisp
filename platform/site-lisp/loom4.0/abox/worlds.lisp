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
 
;;; WORLDS.LISP (ABOX)

;;; Functions for manipulating worlds

(in-package "LOOM")

(export '( change-world spawn-world join-worlds destroy-world 
	  find-world list-world
	  with-world))


  ;;
;;;;;; World-sensitive referencing of instances
  ;;


#+CLTL2 (declaim (inline intern-instance-in-world unintern-instance-in-world))
#-CLTL2(proclaim '(inline intern-instance-in-world unintern-instance-in-world))

(defun intern-instance-in-world (instance world)
  ;; Enter "instance" into the local name space of "world",
  ;;    keyed on its identifier;
  ;; Called by "create-loom-instance";
  (let ((ids (multiple-identifiers instance)))
    (if ids
	(loop for id in ids
	     do (setf (gethash id (local-instance-space world)) instance))
	(setf (gethash (identifier instance) (local-instance-space world))
	      instance))
    (clear-get-instance-cache) ))

  ;;   Forward references for 
;;;;;; World-sensitive evaluation of instance identifiers
  ;;

(defmacro get-instance-in-*world* (instance &key mergeable-instance-p-test)
  ;; Return the top-level version of "instance in the current world;
  (cond
    ((eq mergeable-instance-p-test t)
     `(get-mergeable-instance-in-world ,instance *world*))
    (mergeable-instance-p-test
     `(when mergeable-instance-p-test
	`(get-mergeable-instance-in-world ,instance *world*)))
    (t
     `(get-instance-in-world ,instance *world*))) )

#+CLTL2 (declaim (inline eval-instance-id-in-world
			 eval-instance-id-in-*world*))
#-CLTL2 (proclaim '(inline eval-instance-id-in-world
			   eval-instance-id-in-*world*))

(defun eval-instance-id-in-world (identifier world)
  ;; Search for the top-most instance matching "identifier", starting
  ;;    from world "world";
  (loop for table in (all-instance-spaces-of-world world)
       do
       (multiple-value-bind (matchingInstance entryExistsP)
	   (gethash identifier table)
	 (when entryExistsP
	   (return-from eval-instance-id-in-world matchingInstance)))) )

(defun eval-instance-id-in-*world* (identifier)
  ;; Searches for an instance matching "identifier", starting
  ;;    from the current world; 
  (loop for table in *current-instance-space-list*
       do
       (multiple-value-bind (matchingInstance entryExistsP)
	   (gethash identifier table)
	 (when entryExistsP
	   (return-from eval-instance-id-in-*world* matchingInstance)))) )
 
;; TO BE RENAMED "get-most-lifted-instance":
(defun get-instance-in-world (instance world)
  ;; Return the top-level version of "instance" in world "world";
  ;; CAUTION: Assumes "instance" belongs to "world", or to one of its
  ;;    ancestors, or to one of its descendants;
  ;; Short cut: "instance" is current for "world" if it is not shadowed,
  ;;    and if "world" has no children;
  ;; TO DO: FIGURE OUT IF THE ASSUMPTION THAT "instance" IS NOT DEFINED
  ;;    ONLY IN SIBLING WORLDS OF "world" IS VALID (THE ABOX QUERY SYNTAX
  ;;    SOMEWHAT ENFORCES THE PRESENT ASSUMPTION);
  (if (and (mergeable-instance-p instance)
	   (or (shadowed-p instance)
	       (child-worlds world)))
      (eval-instance-id-in-world (identifier instance) world)
      instance) )

#+CLTL2 (declaim (inline get-mergeable-instance-in-world))
#-CLTL2 (proclaim '(inline get-mergeable-instance-in-world))
(defun get-mergeable-instance-in-world (instance world)
  ;; Return the top-level version of "instance" in world "world";
  ;; Assumes that "instance" is mergeable (and hence avoids that check);
  ;; See "get-instance-in-world" for further comments;
  (if (and (or (shadowed-p instance)
	       (child-worlds world)))
      (eval-instance-id-in-world (identifier instance) world)
      instance) )

(defmacro get-set-in-*world* (set)
  ;; Return a copy of "set" for which all members are in the
  ;;    current world;
  `(get-set-in-world ,set *world*) )

(defun get-set-in-world (set world)
  ;; Scan "set" to see if some of its members are shadowed
  ;;    from the vantage point of "world";
  ;; If so, return a list of the top-most instances;
  ;; If not, return the original set (to save CONSes);
  ;; CAUTION: Breaks if db-instances and literals both occur in "set";
  (when (and set (mergeable-instance-p (first set)))
    (let ((mightBelongToChildWorldP (child-worlds world)))
      (if (null (rest set))
	  (let ((member (first set))
		shadowingMember)
	    (when (or mightBelongToChildWorldP 
		      (shadowed-p member))
	      (setq shadowingMember
		    (eval-instance-id-in-world (identifier member) world))
	      ;; note: forgotten member sets "set" to be nil: 
	      (setq set (when shadowingMember (list shadowingMember)))))
	  (when (loop for member in set thereis (shadowed-p member))
	    ;; compute set of top-most fillers
	    (setq set
		  (loop for member in set
		       collect
		       (if (or mightBelongToChildWorldP
			       (shadowed-p member))
			   (eval-instance-id-in-world (identifier member) world)
			   member)))
	    (when (member nil set)		; detect case when filler has been forgotten;
	      (delf set nil))))))
  set )

(defun copy-set-in-*world* (set)
  ;; Called by "retract-role-filler";
  ;; Return a copy of "set" with any shadowed instances replaced by
  ;;    top-level instances in the current world; 
  ;; CAUTION: Breaks if db-instances and literals both occur in "set";
  (if (not (typep (car set) 'DB-INSTANCE))
      (copy-list set)
      (progn
	(setq set
	      (loop for member in set
		   collect
		   (cond
		     ((shadowed-p member) 
		      (eval-instance-id-in-*world* (identifier member)))
		     (t member))))
	(when (member nil set)			; detect case when filler has been forgotten;
	  (delf set nil))
	set)) )

  ;;
;;;;;;  More up-front world macros
  ;;

(defmacro map-world (mappingFunction world)
  ;; Iterate over instances in "world", and apply "mappingFunction"
  ;;    to each one;
  (let ((body
	  (reparameterized-body-of-lambda-expr 
	    mappingFunction 'key 'value)))
  `(flet ((mappingFn 
		(key value)
		(declare (ignore key))
		,@body))
     (maphash (function mappingFn) (local-instance-space ,world))) ))


(defmacro womp&coerce-to-*world* (instance &key mergeable-instance-p-test)
  ;; Helping macro for "with-world" and "retract-role-filler";
  ;; Verify that instance is a real Loom instance, and make sure that merge
  ;;    pointers have been followed;
  ;; Then, return the current copy of that instance in *world*;
  ;; CAUTION: "instance" may be evaluated multiple times by this macro;
  (let ((body `(let ((newInstance
		       (womp-merge-pointers ,instance :mergeable-instance-p-test t)))
		 (if (and *world*
			  ;; test for possiblitity that merge replaced (mergeable)
			  ;;    skolem with (unmergeable) constant:
			  (or (eq ,instance newInstance)
			      (mergeable-instance-p newInstance)))
		     (get-instance-in-*world* 
		       newInstance :mergeable-instance-p-test t)
		     newInstance))))
    (if (eq mergeable-instance-p-test t)
	body
	`(when ,(or mergeable-instance-p-test
		    `(mergeable-instance-p ,instance))
	   ,body)) ))


  ;;
;;;;;; "with-world"
  ;;

(defun destroy-world (world)
  ;; Dummy Function
  (declare (ignore world))
  (grumble "Calling obsolete function DESTROY-WORLD") 
  nil)

(eval-when (load eval compile) ; (:compile-toplevel :load-toplevel :execute)
  (defun conditionally-destroy-incoherent-world (catchResult world)
    ;; Helping function for "with-world" macro;
    ;; If the world "world" has become incoherent and *destroy-incoherent-worlds-p*
    ;;    is non-nil, then destroy it;
    (when (and (eq catchResult :incoherent)
	       *destroy-incoherent-worlds-p*)
      (case *destroy-incoherent-worlds-p*
	(:break
	 (trace-values "ABOUT TO DESTROY WORLD" world)
	 (destroy-world world))
	(otherwise
	 ;; destroying the world also removes all of its instances from match queues
	 (destroy-world world)))) ))

(defmacro with-world (world vars &body code)
  "Switch the current world to `world', reevaluate the bindings for `vars'
to point to instances in that world, evaluate `code' with that world,
possibly destroy `world' if it becomes incoherent, and then return to 
the previous world."
  (once-only (world)
    `(let ((savedWorld *world*)
	   catchResult)
       (change-world ,world)
       (let (,@(loop for var in vars
		    collect `(,var (LOOM::womp&coerce-to-*world* ,var)))
	     *exitIncoherentWorldP*)
	 (declare (special *exitIncoherentWorldP*))
	 (setq catchResult 
	       (catch 'incoherent-world-catcher ,@code))
	 (conditionally-destroy-incoherent-world catchResult ,world))
       (change-world savedWorld)
       catchResult) ))

;;; Top-level world functions

(defun change-world (world)
  ;; Reset the variables *current-name-spaces*, *current-evaluate-id-fns*,
  ;;    *world*, and (possibly) *context* to access the
  ;;    world "world";
  ;; If "world" equals NIL, reset look-up functions to operate from
  ;;    the current context;
  (when (eq *world* world)
    (return-from change-world nil))
  (when (neq (context-of-world world) *context*)
    (change-context (context-of-world world)))
  (integrity-check (eq (caar *current-name-spaces*) :instances))
  (setf (cdar *current-name-spaces*) (local-instance-space world))
  (setf *current-instance-space-list* (all-instance-spaces-of-world world))
  (when (null *world*)
    (setf (cdar *current-evaluate-id-fns*) #'lookup-instance-in-*world*))
  (clear-get-instance-cache)
  (with-speed
      (setq *monotonic-mode-p* 
	(test-bit-flags (context-flag world) :context-flag :monotonic)))
  (setq *world* world) )

(defmethod spawn-world ((parentWorld WORLD) &key monotonic-p)
  ;; Create a new world with parent "parentWorld";
  ;; Link the new world to "parentWorld";
  ;; Initialize its look-up function;
  ;; TO DO: RECYCLE WORLDS:
  (let ((newWorld (help-spawn-world parentWorld nil)))
    (initialize-world newWorld)
    (with-speed
	(if (or (test-bit-flags (context-flag parentWorld) :context-flag
				:monotonic)
		monotonic-p)
	    (set-bit-flags (context-flag newWorld) :context-flag :monotonic)
	    (clear-bit-flags (context-flag newWorld) :context-flag :monotonic)))
    newWorld ))

(defun join-worlds (world1 world2 &key skip-topology-checks-p)
  "Create and return a new world that has `world1' and `world2' as its
parents.  `skip-topology-checks-p' eliminates checks that the worlds
belong to a common context and that neither world is an
ancestor of the other.  Return NIL if joined world contains an incoherent
instance."      
  ;; Search for any instances with identical identifiers that are
  ;;    represented by different objects in "world1" and "world2", and
  ;;    for each one, lift a copy into the new world, and merge facts
  ;;    from the previous world copies into the new copy;
  ;; Semi-tricky: A breadth-first search for instances to be joined relies
  ;;    on the breadth-firstness of the slot "all-instance-spaces", i.e., we
  ;;    always find top-level versions of instances before finding shadowed ones;
  ;; POSSIBLE BUG: WHAT HAPPENS IF WE COPY AN INSTANCE THAT HASN'T BEEN
  ;;    MATCHED?
  (let ((savedWorld *world*)
	joinWorld visitedIdentifiers result)
    (labels ((has-as-ancestor-world-p
	       (w1 w2)
	       (member (local-instance-space w2)
		     (all-instance-spaces-of-world w1)))
	     (lift&join
	       (identifier instance2)
	       (let ((instance1 (eval-instance-id-in-world identifier world1))
		     joinInstance)
	       #L:trace-worlds (trace-values "join-worlds:" joinWorld instance1 instance2)
		 (when (and instance1 
			    (neq instance1 instance2)
			    (world instance1)
			    (not (has-as-ancestor-world-p
				   (world instance2) (world instance1))))
		   (setq joinInstance instance1)
		   (copy-instance instance2 :copy-into joinInstance :join-worlds-p t)))))
      (unless skip-topology-checks-p
	(when (neq (context-of-world world1) (context-of-world world2))
	  (warn "Can't join worlds from different contexts")
	  (return-from join-worlds nil))
	(when (has-as-ancestor-world-p world1 world2)
	  (return-from join-worlds world1))
	(when (has-as-ancestor-world-p world2 world1)
	  (return-from join-worlds world2)))
      (setq joinWorld (help-spawn-world world1 world2))
      (initialize-world joinWorld)
      (change-world joinWorld)
      (setq result
	    (with-world joinWorld ()
	      (loop for space2 in (all-instance-spaces-of-world world2)
		   unless (member space2 (all-instance-spaces-of-world world1))
		   do
		   (maphash #'(lambda (identifier instance2) 
				(unless (member identifier visitedIdentifiers)
				  (push identifier visitedIdentifiers)
				  (lift&join identifier instance2)))
			    space2))))
      (change-world savedWorld)
      ;; Handle situation where an incoherent world is detected here.
      (and (neq result :incoherent)
	   joinWorld))))

;(defun destroy-world (world)
;  ;; Destroy world "world" together with all of its descendant
;  ;;    worlds;
;  (loop for child in (child-worlds world)
;       do (destroy-world child))
;  (destroy-one-world world) )

;(defun destroy-one-world (world)
;  ;; Helping function for "destroy-world";
;  ;; Detach "world" from its parent; 
;  ;; Change the current world to "world", and destroy all instances in "world";
;  ;; Reset the current world;
;  ;; Note: Lifting of skolems that merge with constants can introduce
;  ;;    constants into a world's symbol tables.  The "mergeable-instance-p"
;  ;;    test below guard's against this possibility;
;  ;; TO DO: WHEN WE ADD CONCEPT INDICES FOR WORLDS, ADD CODE TO RECYCLE THESE
;  ;;    INDICES;
;  (flet ((smashed-instance-p
;	   (instance)
;	   (eq (db-type instance) :smashed)))
;    (let ((savedWorld *world*)
;	  (parents (parent-worlds world))
;	  smashedInstances)
;      ;; change the current world, and destroy world instances:
;      (change-world world)
;      (map-world		;; mark instances as :smashed
;	(lambda (key self)
;	  (when (mergeable-instance-p self)
;	    (destroy-world-instance self)
;	    (setf (db-type self) :smashed)
;	    (push self smashedInstances)))
;	world)
;      (loop for i from 0 to $ACT-ON-Q$	;; eliminate smashed instances from match queues
;	   do
;	   (setf (aref *match-queues* i)
;		 (delete-if
;		   (function smashed-instance-p)
;		   (aref *match-queues* i))))
;      ;; note: can't discard instances until after :smashed marks serve their function
;      (loop for i in smashedInstances
;	   do (discard-instance i))		; erased :smashed mark
;      ;; now eliminate the world:
;      (if (null parents)
;	  ;; unlink world from context
;	  (delf (root-worlds (context-of-world world)) world)
;	  ;; unlink world from parents
;	  (loop for p in parents
;	       do (delf (child-worlds p) world)))
;      (discard-world world)
;      ;; reset current world:
;      (change-world 
;	(if (eq world savedWorld) NIL savedWorld)) )))

;(defun destroy-worlds-of-context (&optional context)
;  ;; Destroy all worlds in "context";
;  (loop for w in (root-worlds (or context *context*))
;       do (destroy-world w))
;  (change-world nil))

;(defun find-world (number &key context)
;  ;; Return the world identified by "number";
;  ;; If "context" is supplied, search that context; otherwise
;  ;;    search all contexts, beginning with the current one;
;  (let (result)
;    (labels ((search-worlds
;	       (context)
;	       (loop for rootWorld in (root-worlds context)
;		    when (search-child-worlds rootWorld)
;                   return rootWorld))
;	     (search-child-worlds
;	       (world)
;	       (if (= (world-number world) number)
;		   (setq result world)
;		   (loop for childWorld in (child-worlds world)
;			when (search-child-worlds childWorld)
;                       return childWorld))))
;      (if context
;	  (search-worlds context)
;	  (or (search-worlds *context*)
;	      (loop for cxt in (list-contexts)
;		   unless (eq cxt *context*)
;		   do (search-worlds cxt))))
;      result )))

(defun list-world (&optional (world *world*))
  ;; Return a list of the instances in "world";
  ;; If "world" is nil, list the instances in the current
  ;;    context;
  (if world
      (delete nil (list-of (local-instance-space world)
			   :also-coerce-hash-table t))
      (list-context :partitions :instances)) )


(defun change-to-world-of-instance (instance)
  ;; Insure that the current world matches the world that "instance"
  ;;    belongs to
  (declare (ignore instance)) 
 ; Make a NO-OP
 ;  (let ((worldOfInstance (world-for-updating (modification-summary instance))))
 ;    (when (neq *world* worldOfInstance)
 ;      (change-world worldOfInstance)) )
  )
	    

  ;;
;;;;;; Low-level world functions
  ;;

(defun create-world ()
  ;; Return a brand new world;
  (or (pop *recycled-worlds*)
      (make-instance 'WORLD)) )

(defun discard-world (world)
  ;; Clear "world" and recycle it;
  (clrhash (local-instance-space world))	; help garbage collector a bit
  (clear-slots world
	       ( parent-worlds primary-parent child-worlds context-of-world 
		local-instance-space all-instance-spaces-of-world
		world-number world-is-incoherent-p))
  (push world *recycled-worlds*) )

(defun create-world-instance ()
  ;; Return a brand new world;
  (or (pop *recycled-world-instances*)
      (make-instance 'WORLD-INSTANCE)) )

(defmethod discard-instance ((instance WORLD-INSTANCE))
  ;; Clear slots in "instance" and recycle it;
  (clear-instance-slots instance)
  (setf (world instance) nil)
  (setf (primary-parent-instance instance) nil)
  (push instance *recycled-world-instances*) )


  ;;
;;;;;; World-sensitive evaluation of instance identifiers
  ;;

(defun lookup-instance-in-*world* (identifier)
  ;; Non-inline version of "eval-instance-id-in-*world*";
  ;; Called by "change-world";
  (eval-instance-id-in-*world* identifier) )

(defmacro eval-in-world (world &body body)
  ;; Perform world-sensitive evaluation of the forms in "body";
  `(let ((savedContext *context*)
	 (savedWorld *world*))
     (change-world ,world)
     ,@body
     (if savedWorld
	 (change-world savedWorld)
	 (change-context savedContext))) )


  ;;
;;;;;; world creation and initialization functions
  ;;

(defun help-spawn-world (primaryParent otherParent)
  ;; Helping function for by "WORLD.spawn-world" and "join-worlds";
  ;; Create a new world with primary parent "primaryParent", and
  ;;    optionally, with a second parent "otherParent";
  (let ((newWorld (create-world)))
    (addf (child-worlds primaryParent) newWorld)
    (if otherParent
	(progn
	  (addf (child-worlds otherParent) newWorld)
	  (setf (parent-worlds newWorld)
		(list primaryParent otherParent)))
	(setf (parent-worlds newWorld)
	      (list primaryParent)))
    (setf (primary-parent newWorld) primaryParent)
    (setf (context-of-world newWorld)
	  (context-of-world primaryParent))
    newWorld ))

;; STUB TO REPLACE COMMENTED OUT VERSION:
(defun initialize-world (world)
  (declare (ignore world)))

;(defun initialize-world (world)
;  ;; Number "world", and compute the list of instance-spaces for
;  ;;    the world "world";
;  ;; Called by "XXX.spawn-world" and "join-worlds";
;  (setf (world-number world) (incf *world-counter*))
;  (setf (all-instance-spaces-of-world world)
;	(if (null (parent-worlds world))
;	    (cons (local-instance-space world)
;		  (all-instance-spaces
;		    (context-of-world world)))
;	    (compute-all-instance-spaces world))) )

(defun compute-all-instance-spaces (world)
  ;; Computation of "all-instance-spaces" when "world" has multiple parents;
  ;; Compute a breadth-first left-to-right list of instance spaces for "world"
  ;;    and its ancestor worlds;  Assumes that the "all-instance-spaces"
  ;;    for the parent worlds have already been computed;
  ;; Note: This algorithm was inspire by that used in "compute-precedence-list"
  ;;    in the KBCLASSES files;
  (flet ((right-prepend
	   (list1 list2)
	   (let (reversedList1Survivors)
	     (loop for item in list1
		  when (not (member item list2))
		  do (push item reversedList1Survivors))
	     (loop for item in reversedList1Survivors
		  do (push item list2))
	     list2)))
    (let* ((parents (parent-worlds world))
	   (spaceList (all-instance-spaces-of-world (car (last parents)))))
      (when (cdr parents)
	(loop for tail on parents
	     while (cdr tail)
	     do
	     (setq spaceList
		   (right-prepend
		     (all-instance-spaces-of-world (car tail))
		     spaceList))))
      (cons (local-instance-space world) spaceList) )))

(defun unintern-instance-in-world (instance world)
  ;; Enter a nil entry into the local name space of "world",
  ;;    keyed on the identifier of "instance";
  ;; Called by "forget-all-about";
  (let ((multipleIds (multiple-identifiers instance)))
    (if multipleIds
	(loop for id in multipleIds
	     do (setf (gethash id (local-instance-space world)) nil))
	(setf (gethash (identifier instance) (local-instance-space world))
	      nil))
    (clear-get-instance-cache) ))


(defmacro trapping-incoherence-p ()
  ;; Return t if occurrences of incoherence are being trapped
  ;;    (presumably by a "with-world");
  `(and *world*
	(boundp '*exitIncoherentWorldP*)))

(defun throw-if-incoherent-world (instance)
  ;; Quickly abort the computation within incoherent world;
  (declare (special *exitIncoherentWorldP*))
  (when (trapping-incoherence-p)
    (setq *exitIncoherentWorldP* instance)
    #L:trace-merge (trace-values "incoherent world" instance *world*)
    (throw 'incoherent-world-catcher :incoherent)) )



#|
TO DO:

DIFFERENTIAL ROLE FILLERS FOR WORLDS:
   WRITE "WORLD.db-slot-value" CODE
   FILL IN SLOT "primary-parent-instance"

CHANGE "shadowed-p" LOGIC SO INSTANCE CAN BE SHADOWED FROM ABOVE
   OR BELOW
|#
