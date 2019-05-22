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

;;; TASKS (ABOX)

(in-package "LOOM")

(export '( perform fail perform-task
	  schedule schedule-task scheduled-p 
	  undo-task kill-task
	  initialize-tasks list-tasks
;	  perform-all
	  ))

;;; Functions which implement the LOOM task facility


  ;;
;;;;;; "perform", "perform-task", "fail"
  ;;

;;; The perform functions define the heart of the task performance
;;;    mechanism; "meta-rule" reasoning used to select which
;;;    operator-method to execute occurs here.

(defmacro perform ((actionName &rest arguments) &key (returnType :value) undoable-p)
  ;; Apply action named "actionName" to the arguments "arguments";
  ;; Return either a value, a success predicate, or a task object, depending
  ;;    on whether "returnType" is :value, :success-p, or :task;
  ;; If "returnType" equals :task, or if "undoable-p" is set, create a task
  ;;    object representing the task to be performed;
  ;; If "undoable-p", start an undo log if one is not already started;
  (cond
    ((or undoable-p (eq returnType :task)) 
     `(perform-task
	(make-loom-instance 'TASK		; DGB 8/29/90
			    :action (get-action ',actionName :no-error-p nil)
			    :arguments (list ,@arguments))
	,returnType))
    ((eq returnType :success-p)
     `(multiple-value-bind (value successP)
	  (apply-action
;	    (get-action ',actionName :no-error-p nil)	; rmm 6/8/89
	    ',actionName			;  dgb 6/13/89 (quote)
	    (list ,@arguments))
        (declare (ignore value))
	successP))
    (t						; (eq returnType :value)
     `(apply-action
	',actionName				; rmm 6/8/89, dgb 6/13/89 (quote)
	(list ,@arguments)))) )

(defmacro fail (&optional result)
  ;; Expand into a throw to the tag "failed-method-catcher";
  ;; Called from within a method when it can't succeeed;
  ;; Return "result" as the value of the failed method;
  `(throw 'failed-method-catcher ,result) )

(defun perform-task (task returnOption)
  ;; Perform task "task";
  ;; "returnOption" takes values :value, :success-p, or :task,
  ;;    and indicates what sort of value the task should return;
  (when *current-task*
      (add-link super-task task *current-task*))
  (setf *current-task* task)
  ;; push "task" onto undo log if it is undoable;
  (when (undoable-p task)
      (push task *undo-log*))
  (multiple-value-bind (value successP)
      (apply-action (action task) (arguments task))
    (setf (value task) value)
    (setf (success-p task) successP)
    (setf (status task) :completed)
    (setq *current-task* (super-task task))	; nil if no super task
    (ecase returnOption
      (:success-p successP)
      (:task task)
      (:value value))) )


  ;;
;;;;;; task priority queues
  ;;

;;; These are low-level routines for manipulating the entries in
;;;    the task priority queues.

(defun initialize-tasks ()
  ;; Clear task queues and current task variable;
  (setq *task-queue-table*
	(loop for p in *task-priorities* collect (list p)))
  (setq *current-task* nil) )

#+CLTL2 (declaim (inline create-task enqueue-task select-next-task
			 where-is-task delete-task))
#-CLTL2 (proclaim '(inline create-task enqueue-task select-next-task
			   where-is-task delete-task))

(defun create-task (arguments action goalPredicate priority &key undoable-p)
  ;; Create and fill-in a (pending) task;
  (make-loom-instance				; DGB 8/29/90
    'TASK
    :arguments arguments
    :action action
    :goal-predicate goalPredicate
    :priority priority
    :undoable-p undoable-p
    :status :pending) )

(defun enqueue-task (task priority)
  ;; Place "task" on the queue indicated by "priority";
  ;; An individual queue is a list containing a priority symbol and
  ;;    zero or move task instantiations;
  ;; The current methodBody places new tasks at the ends of queues;
  ;;    A more sophisticated methodBody will make this behavior
  ;;    optional;
  ;; TO DO: IF DUPLICATE EXISTS, REMOVE IT (LOGICALLY, OR PHYSICALLY
  ;;     IF IT HAS DIFFERENT PRIORITY)
  (let ((queue (assoc (or priority *default-task-priority*)
		      *task-queue-table*)))
    (setf (cdr (last queue))
	  (list task)) ) )
    
(defun select-next-task ()
  ;; Return the task having highest priority;
  ;; Currently, this the task at the front of the highest priority
  ;;    non-empty queue;
  ;; Return nil if *current-task* has higher priority than anything
  ;;    else on the queue;
  ;; TO DO: IMPLEMENT MEANS FOR SUSPENDING TASK AND WAKING IT UP WHEN
  ;;    SUBTASKS COMPLETE.  MEANWHILE, WE DON'T RUN SUBTASKS UNTIL
  ;;    SUPER TASK FINISHES;
  (when *current-task*
    ;; WE DON'T HANDLE RECURSIVE SCHEDULING YET:
    (return-from select-next-task nil))
  (let (nextTask)
    (loop for queue in *task-queue-table*
	 do
	 (when (setq nextTask (pop (cdr queue)))
	     (return nextTask))) ))

(defun list-tasks (&key priorities)
  "Return a list of the task queues having the specified `priorites',
or all task queues if `priorites' is not supplied.  Each task queue
is a list of the form (<priority> <task>*), where priority is currently
either :high or :low."
  (setq priorities (list-of priorities))
  (if priorities
      (loop for queue in *task-queue-table*
	    when (member (first queue) priorities)
	    collect queue)
      *task-queue-table*) )

(defun where-is-task (task)
  ;; Return the queue containing "task", or nil if its not scheduled;
  (loop for queue in *task-queue-table*
       when (member task queue)
       return queue) )
       
(defun delete-task (task)
  ;; Find "task" and remove it;
  ;; Return "task" if deletion actually occurred;
  (loop for queue on *task-queue-table* by #'cdr
      when (member task (car queue))
      do (delf (car queue) task)
      and return task) )


  ;;
;;;;;; "schedule", "schedule-task", "perform-all", "kill-task"
  ;;

;;; These routines are called to create and schedule tasks
;;;    onto the task priority queues, and to perform them.

(defmacro schedule ((actionName &rest arguments) &key undoable-p priority)
  ;; Create and schedule a task which will apply the action named
  ;;    "actionName" to the arguments "arguments";
  ;; Return the new task object;
  ;; Set the task's priority to "priority";
  ;; If "undoable-p", start an undo log if one is not already started;
  `(schedule-task
     (create-task
       (list ,@arguments)
       (get-action ',actionName)
       nil					; no goal predicate
       ,(cond     ; ensure that a non-nil priority is passed on to "create-task":
	 ((null priority) `',*default-task-priority*)
	 ((member priority *task-priorities*) `',priority)
	 (t priority))				; assume "priority" is a variable
       :undoable-p ,undoable-p)) )

(defun schedule-task (task)
  ;; Place "task" on the appropriate queue, and return it;
  (enqueue-task task (priority task))
  (when (or (null *current-task*)
	    nil ; (higher-priority-p task *current-task*) <= IMPLEMENT OR REMOVE
	    )
    (setq *higher-priority-task-is-pending-p* t
          *match-is-pending-p* t))      ;  TAR 8/8/94 ; Make sure we advance time & run task
  task )

(defun scheduled-p (task)
  ;; Return t if "task" is still scheduled;
  (where-is-task task) )

(defun kill-task (task)
  ;; Remove "task" from a task queue, if its still there;
  ;; Return "task" if deletion actually occurred;
  (when (delete-task task)
    (setf (status task) :killed)
    task) )

;; THIS HAS BEEN REPLACED BY "match&perform-all":
;(defun perform-all ()
;  ;; Perform all tasks on all task queues;
;  ;; Note: new tasks may be scheduled during this process -- these get
;  ;;    performed as well;
;  (let (nextTask)
;    (loop
;       (setq nextTask (select-next-task))
;       (when (null nextTask)
;	   (return nil))				; exit loop
;       ;; found a task to perform
;       (perform-task nextTask :success-p)	; :success-p makes "perform-task" happy
;       ) ; end loop
;    (setq *current-task* nil) ))


  ;;
;;;;;; "undo-task"
  ;;

;;; The undo operation is performed by restoring database instances
;;;    to have values indicated in the *undo-log*;  The undo log is rolled
;;;    back to the point where a specific task object was positioned;

;;; An undo log entry is either a task, or a list with one of the following forms:
;;;    (:old-fillers instance role fillers)
;;;    (:new-link instance role filler)
;;;    (:old-link instance role filler)
;;;    (:old-conjuncts instance conjuncts)
;;;    (:old-features instance features)
;;;    (:interned instance)
;;;    (:uninterned instance)

(defun undo-task (task)
  ;; Undo the database modifications that occurred during the
  ;;    execution of "task", and rerun the matcher;
  ;; (1) Verify that task is not shadowed within the task log;
  ;; (2) Roll back log entries until "task" is found;
  ;; (3) Remove "task" from the task log;
  (let (undoneInstances)
    ;; NOT YET IMPLEMENTED: VALIDATE CHOICE OF TASK
;    (loop for tail on *undo-log*
;       do
;       (let ((entry (car tail)))
;	 (cond
;	   ((consp entry)			; undo a log entry
;	    (pushnew (apply-undo entry) undoneInstances))
;	   ((eq entry task)			; found "task" in log
;	    (setq *undo-log* (cdr tail))	; remove "task" from log
;	    (return nil)))			; exit loop
;	 ))
    (loop for i in undoneInstances
	 when i
	 do
	 (post-non-analyzable-modified-instance i :retraction nil))
    (rerecognize-instances)					; CONSIDER DISABLING RULES
    ;; remove task from *task-log*
    (cond
      ((super-task task)
       (del-link super-task task (super-task task)))
      (t					; "task" is top-level in task log
       (setq *task-log* nil))) ))

;(defun undo-log-entry (logEntry)
;  ;; Restore the database as indicated in "logEntry";
;  ;; Return an instance whose values where modified (or nil if an
;  ;;    instance that was created is now being destroyed;
;  ;; "logEntry" is a list whose first value is a keyword indicating
;  ;;    what kind of update was logged;
;  (let ((instance (second logEntry)))
;    (ecase (car logEntry)
;      (:fillers					; role with no inverse
;       (set-slot-value instance (third logEntry) (fourth logEntry))
;       instance)
;      (:new-link
;       "NOT YET IMPLEMENTED")
;      (:old-link
;       "NOT YET IMPLEMENTED")
;      (:old-conjuncts
;       ;; THIS IS PROBABLY BOGUS:
;       (setf (conjuncts-table instance) (third logEntry))
;       instance)
;      (:old-features				; MAYBE FEATURES NEED TO BE CLASSFIED???
;       (setf (asserted-features instance) (third logEntry))
;       instance)
;      (:interned
;       ;; destroy previously-created object
;       (unintern-object instance :instances *context*)
;       nil)
;      (:uninterned
;       ;; recreate previously-destroyed object
;       (intern-object (name instance) instance :instances *context*)
;       instance)) ))


;;; TO DO:

#|

IMPLEMENT MEANS FOR SUSPENDING TASK AND WAKING IT UP WHEN
   SUBTASKS COMPLETE.  MEANWHILE, WE DON'T RUN SUBTASKS UNTIL
   SUPER TASK FINISHES;

|#
