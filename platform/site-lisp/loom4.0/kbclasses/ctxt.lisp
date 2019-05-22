;;;-*- Mode: Lisp; Package: LOOM -*-
;;; SCCS Version: %W%
;;; Contains: A Context Mechanism
;;; Author: Jeff Dalton, based on a version by Ken Currie
;;; Created: Thu Jan 24 14:21:58 1991
;;; Updated: Mon May 10 (sometime) 1992
;;; Release Version: %Y%
;;; Copyright: (c) 1993, AIAI, University of Edinburgh
;;; This material may be reproduced by or for the U.S. Government pursuant
;;; to the copyright license under the clause at DFARS 252.227-7032
;;; (June 1975) -- Rights in Technical Data and Computer Software (Foreign).

;; *************************************************************************
;; *                                                                       *
;; *  CONTEXT.LSP  -  A Context Mechanism                                  *
;; *                                                                       *
;; *  This module has its origins in the work on Contexts in POP-2 by      *
;; *  Harry Barrow.                                                        *
;; *                                                                       *
;; *                                                                       *
;; *************************************************************************

;;; Simple context mechanism, a rational reconstruction of KWC's "obcontext".
;;; The algorithms are the same, but the code is completely new and "micro-
;;; optimized".  Written by Jeff Dalton.

;;; Common Lisp-ified and extended by Tom Russ

;;; There are two possible garbage collection strategies available:
;;; Discarded contexts can be removed from individual slots on reading
;;; or on writing. Although writing is presumably less frequent than
;;; reading, it also does not reach as high up the slot list, therefore
;;; limiting the depth of collection. Which item is chosen depends on
;;; the selection of one of the features :gc-on-read or :gc-on-write.
;;; If neither is selected, then no garbage collection will occur.

(in-package "LOOM")

(eval-when (load eval compile)
  (push :gc-on-read *features*))

(export '(;; Variables
	  *current-ctxt*
	  *global-ctxt*

	  ;; Functions
	  new-ctxt destroy-ctxt
	 ; safe-ctxt-parents safe-ctxt-children safe-ctxt-number
	  find-ctxt
;	  push-ctxt pop-ctxt
;          in-ctxt current-ctxt
	;  apply-in-ctxt
	;  access-in-ctxt update-in-ctxt
	  print-ctxt-tree
	  ;; Defining forms
          define-ctxt-accessor
          make-slots-context-sensitive
          def-cs-struct
          ;; utility function
          subctxt-p
	  ))


(defconstant *unbound-value* nil "Value to return if no context is found")
  ;; Was originally: :undef

;;; Macro to context layer functions
;;; /\/: The field accessor is (fun)called exactly once, to get the
;;; contents of the slot.  It might be better to call it here, in-line,
;;; instead of in access-in-ctxt.

(defmacro define-ctxt-accessor 
          (name ordinary-accessor exactCtxt homeCtxt copyToChildrenP)
  `(progn
     (defun ,name (o)
       (access-in-ctxt (,ordinary-accessor o)
                       ,exactCtxt
                       ,(if homeCtxt
                          '(home-ctxt o)
                          nil)) )
     (defsetf ,name (o) (new-val)
       `(update-in-ctxt #'(lambda (o v)
			     (setf (,',ordinary-accessor o) v))
			 ,o
			 (,',ordinary-accessor ,o)
			 ,new-val
                         ,,copyToChildrenP))) )

;;; COMMENTARY:  The next function is used to add context-sensitivity to slot
;;;     accessors on CLOS classes without requiring that storage be allocated
;;;     to the slot.  This is convenient when the class is used as a potential
;;;     mixin, but interacts with other mixins.

(defmacro make-slots-context-sensitive (className &rest slotList)
  ;; Make the slots in "slotList" be context sensitive methods on "className";
  ;; Format of "slotList":  ((<slotName> <inheritP> <writeToChildP>) ...)
  ;;   <inheritP> is NIL if the slot should be context sensitive but not
  ;;   inheriting. 
  ;;   <writeToChildP> is T if writing to the slot forces a copy of the
  ;;   old value to child ctxts.
  ;;  As a convenience, just specifying <slotName> without
  ;;   putting it in a list implies <inheritP> = T, <writeToChildP> = T;
  `(progn 
     ,@(loop for slotItem in slotList
             as slotName = (if (consp slotItem) (car slotItem) slotItem)
             as dontInheritP = (and (consp slotItem)
                                    (cdr slotItem)
                                    (null (second slotItem)))
             as writeToChildP = (if (and (consp slotItem) (cddr slotItem))
                                  (third slotItem)
                                  t)
             collect `(defmethod ,slotName ((self ,className))
                        (access-in-ctxt (CLOS::slot-value self ',slotName)
                                        ,(when dontInheritP '(home-ctxt self))
                                        (home-ctxt self)))
             collect `(defmethod (setf ,slotName) (new-value (self ,className))
                        (update-slot-in-ctxt
                         self ',slotName new-value ,writeToChildP)))) )

(defmacro def-cs-struct (nameForm &rest slotDefs)
;;; Macro to declare context-sensitive struct slots.
  (let ((concName (and (consp nameForm)
                       (cadr (assoc :conc-name (rest nameForm)))))
        (cslotNames nil))
    (flet ((form-name (name) 
             (if concName (symbol-append (concName name) *package*) name))
           (form-internal-name (name)
             (if concName
               (symbol-append (concName 'internal- name) *package*)
               (symbol-append ('internal- name) *package*)))
           (reform-slot-definition (def)
             (let* ((contextSensitiveP (getf (cddr def) :context-sensitive-p))
                    (slotName (if contextSensitiveP 
                                (symbol-append ('internal- (first def)) *package*)
                                (first def))))
               (when contextSensitiveP 
                 (push (cons (first def) contextSensitiveP) cslotNames))
               `(,slotName
                 ,(second def)
                 ,@(loop for (key value) on (cddr def) by #'cddr
                         unless (eq key :context-sensitive-p)
                         collect key and collect value)))))
    `(progn (defstruct ,nameForm
              ,@(loop for def in slotDefs
                      when (atom def)
                      collect def
                      else when (member :context-sensitive-p (cddr def))
                      collect (reform-slot-definition def)
                      else collect def))

             ;; Meaning of contextSensitiveP values:
             ;;   t   (default)    Inherit, but copy to children on write;
             ;;   :virtual         Inherit and let children see inherited value;
             ;;   :non-inheriting  Don't inherit, so no need to copy on write;
       ,@(loop for (name . contextSensitiveP) in cslotNames
               collect `(define-ctxt-accessor 
                          ,(form-name name)
                          ,(form-internal-name name)
                          nil
                          nil
                          ,(eq contextSensitiveP t)))) )))

;; Records the ctxt in which an object is created (efficiency hack);

(CLOS::defgeneric home-ctxt (self))

  ;; NOTE: loom::defmethod is not yet defined!
(CLOS::defmethod home-ctxt (self) 
  (declare (ignore self))
  nil)

;;; Contexts
;;
;; Convention:  Active contexts have EVEN numbers,
;;              Discarded contexts have odd numbers;

(defstruct (ctxt (:print-function print-ctxt))
  (number 0 :type fixnum)
  (parents nil)
  (inheritancelist nil)
  (children '()))

; The function oddp doesn't inline (in MCL).  In any case, it may not
; inline in a way that saves time;
;(defun ctxt-discarded-p (c)
;  (declare (inline oddp) (optimize (speed 3) (safety 0)))
;  (oddp (the fixnum (ctxt-number c))))

(defun ctxt-discarded-p (c)
  ;; A context "C" is discarded when it has an odd number;
  ;; Tricky:  The logbitp code is quicker than oddp;
  (declare (optimize (speed 3) (safety 0)))
  (logbitp 0 (the fixnum (ctxt-number c))))

#+akcl
(eval-when (compile)
  (si::freeze-defstruct 'ctxt))

(defvar *ctxt-count* 0)

;;; Context printing

(defvar *printed-ctxt-table* (make-hash-table :test #'eql))

(defun print-ctxt (ctxt stream depth)
  (declare (ignore depth))
  (unless (gethash (ctxt-number ctxt) *printed-ctxt-table*)
    (setf (gethash (ctxt-number ctxt) *printed-ctxt-table*)
	  ctxt))
  (format stream "#<~:[~;discarded ~]context ~D>" 
          (ctxt-discarded-p ctxt) (ctxt-number ctxt)))

(defun ctxt-numbered (n)
  "Given a context number of a context that has been printed,
   returns the context."
  (gethash n *printed-ctxt-table*))


;;; Make a new context
(defvar *root-ctxts* nil
  "List of contexts with no parent context.")

(defun new-ctxt (parents)
  (check-type *ctxt-count* fixnum)
  (let ((new-ctxt
	 (make-ctxt :number *ctxt-count*
		       :parents parents
		       :children nil)))
    (if parents
      (setf (ctxt-inheritancelist new-ctxt)
            (cons new-ctxt (merge-parent-lists 
                               (loop for p in parents
                                     do (push new-ctxt (ctxt-children p))
                                     collect (ctxt-inheritancelist p)))))
      (progn (setf (ctxt-inheritancelist new-ctxt) (list new-ctxt))
	     (push new-ctxt *root-ctxts*)))
;    (if parents
;      (loop for p in parents
;            do (push new-ctxt (ctxt-children p)))
;      (push new-ctxt *root-ctxts*))
    (incf *ctxt-count* 2)
    new-ctxt))

(defvar *global-ctxt* (new-ctxt nil)
  "The initial root context.")

(defvar *current-ctxt* *global-ctxt*
  "The current context.")

;;; Public accessors for parents, children, and context number

(defun safe-ctxt-parents (c)
  (and (ctxt-p c) (ctxt-parents c)))

(defun safe-ctxt-children (c)
  (and (ctxt-p c) (ctxt-children c)))

(defun safe-ctxt-number (c)
  (and (ctxt-p c) (ctxt-number c)))


;;; Return a context with a given number, n.

;;; The search is depth-first, left to right.  However, since a context
;;; always has a higher number than its parents, we do not need to search
;;; the descendents of any context with a number > n.  (The descendents
;;; will also have numbers > n.)  

(defun find-ctxt (n)
  (declare (fixnum n))
  (labels ((c-search (ctxts)
             (loop for c in ctxts
                   do (cond ((= (the fixnum (ctxt-number c)) n) 
                             (return-from find-ctxt c))
                            ((< (the fixnum (ctxt-number c)) n)
                             (c-search (ctxt-children c)))))))
    (c-search *root-ctxts*))
  (error "No context numbered ~D." n))


;;; Context push and pop
;
;(defun push-ctxt ()
;  (setq *current-ctxt* (new-ctxt (list *current-ctxt*))))
;
;(defun pop-ctxt ()
;  (when (and (ctxt-p *current-ctxt*)
;	     (not (null (ctxt-parents *current-ctxt*))))
;    (setq *current-ctxt* (car (ctxt-parents *current-ctxt*)))))
;
;(defun current-ctxt (&optional (ctxt nil supplied-p))
;  (if supplied-p
;    (when (ctxt-p ctxt)
;      (setq *current-ctxt* ctxt))
;   *current-ctxt*) )
;
;(defun in-ctxt (n)
;  (current-ctxt (find-ctxt n)))

;;; Apply in context

(defun apply-in-ctxt (c fn &rest args)
  #+(and akcl mcl) (declare (:dynamic-extent args))
  (let ((*current-ctxt* c))
    (apply fn args)))

;;; Destroy context

(defun destroy-ctxt (ctxt)
  ;; Destroy "ctxt" and all its children;
  ;; Also remove "ctxt" from all its children.  Mark "ctxt" as discarded
  ;;   by giving it an odd ctxt number;
  (when (eq ctxt *global-ctxt*)
    ;; complain uses a global variable not yet defined, so we use format;
    (format *error-output* "Can't destroy top-most (global) ctxt")
    (return-from destroy-ctxt nil))
  (when (eq ctxt *current-ctxt*)
    (setq *current-ctxt* *global-ctxt*))
  (loop for c in (ctxt-children ctxt)
        do (destroy-ctxt c))
  (if (ctxt-parents ctxt)
    (loop for p in (ctxt-parents ctxt)
          do (setf (ctxt-children p)
                   (delete ctxt (ctxt-children p))))
    (setf *root-ctxts*
          (delete ctxt *root-ctxts*)))
  (unless (ctxt-discarded-p ctxt)
    (decf (the fixnum (ctxt-number ctxt)))
    ;; Clear all slots except number!
    (setf (ctxt-children ctxt) nil
          (ctxt-parents ctxt) nil))
  (remhash (ctxt-number ctxt) *printed-ctxt-table*) )


(defun reset-ctxt-variables ()
  (setq *ctxt-count* 0)
  (setq *root-ctxts* nil)
  (setq *global-ctxt* (new-ctxt nil))
  (setq *current-ctxt* *global-ctxt*)
  (clrhash *printed-ctxt-table*))

;;; Access in context

;;; /\/: A cval could contain a 1-element cache for the value most
;;; recently looked-up.  This would win if lookups significantly
;;; outnumbered updates and context switches.  N.B.  It would cache
;;; the current context (and the value), not the context that
;;; established the value.

(defstruct cval
  "Context value.  Contains a sorted alist indexed by context.  The
   alist is never null.  Newer (higher numbered) contexts appear first."
;  cache-context
;  cache-value
  alist)

#+akcl
(eval-when (compile)
  (si::freeze-defstruct 'cval))

;;; We want the value for the current context or the nearest ancestor
;;; for which a value's been stored.

;;; Newer contexts have higher numbers.  A context is always newer
;;; than its parents.  In the cval alist, entries for newer contexts
;;; appear first.

(defun access-in-ctxt (value exactCtxt homeCtxt)
  ;; Return a value for "value" determined by the current context;
  ;; If "exactCtxt", use that context rather than the current one, and
  ;;    the match must be exact (we don't scan for inherited values);
  (declare (optimize (speed 3) (safety 0)))
  (if (not (cval-p value))
    ;; A value that isn't a cval doesn't depend on ctxt.
    (if (or (eq *current-ctxt* exactCtxt)
            (and (null exactCtxt)
                 (or (null homeCtxt)
                     (member homeCtxt (ctxt-inheritancelist *current-ctxt*)))))
      value
      nil)
    (let ((alist (cval-alist (the cval value))))
;      (when (eq (cval-cache-context value) *current-ctxt*)
;        (return-from access-in-ctxt (cval-cache-value value)))
      (loop for target in (ctxt-inheritancelist *current-ctxt*)
            as n fixnum = (the fixnum (ctxt-number target))
            do ;; Skip enties for contexts newer than the target.
            (loop while (and (consp alist) 
                             (< n (the fixnum 
                                    (ctxt-number (caar alist)))))
                  ;; Splice out discarded contexts:
                  do #+:gc-on-read (if (ctxt-discarded-p (caar alist))
                                     (if (cdr alist)
                                       (progn (setf (car alist) (cadr alist))
                                              (setf (cdr alist) (cddr alist)))
                                       (progn (setf (cval-alist value)
                                                    (nbutlast (cval-alist value)))
                                              (pop alist)))
                                     (pop alist))
                      #-:gc-on-read (pop alist)
                  )
            when (null alist) return *unbound-value*
            ;; NOTE:  TO IMPLEMENT A COPY ON NEW READ OR A COPY TO CACHE
            ;;    ON NEW READ, TEST TO SEE IF TARGET NEQ *CURRENT-CTXT*.
            ;;    IF NEQ, THEN DO THE COPY.  IF WE NEED TO SPLICE IT IN,
            ;;    THEN WE NEED TO KEEP A POINTER, OTHERWISE JUST A CACHE
            ;;    IN THE CVAL!
            ;; Note: If we get here, then the cache is not set!
;            when (eq target (caar alist))
;              do (let ((returnValue (cdar alist)))
;                   (return 
;                    (if (or (eq target *current-ctxt*)
;                            (not (consp returnValue)))
;                      (setf (cval-cache-context value) *current-ctxt*
;                            (cval-cache-value value) returnValue)
;                      (setf (cval-cache-context value) *current-ctxt*
;                            (cval-cache-value value) (copy-list returnValue)))) )
            when (eq target (caar alist)) return (cdar alist)
            when exactCtxt return *unbound-value*
            ;; Here, all remaining entries are older than the target
            ;; but perhaps not older than the target's parents, so iterate.
            
            finally (return *unbound-value*)) )) )

;;; Update in context

(defun update-a-cval-alist-helper (alist newValue target n overwriteP)
  ;; Situation: "alist" comes from a cval and needs "newValue" added
  ;;     as the value for "target" ctxt with number "n";
  ;; If "overwriteP", then replace an existing value;
  ;; Tricky: Relies on the destructive operations to update the contents of
  ;;    the underlying cval object;
  (declare (fixnum n)
           (optimize (speed 3) (safety 0)))
    ;; Look for the right place to add the value, removing discarded
    ;;  contexts in the process;
    ;; NOTE: REMOVAL DOESN'T WORK PROPERLY, BECAUSE WE WILL ALWAYS
    ;;       STOP LOOKING ONCE WE SEE A NUMBER > THE TARGET'S, THUS
    ;;       NOT CLEARING ANY OLDER CONTEXTS THAN THIS ONE!
    (loop do
          #+:gc-on-write(when (ctxt-discarded-p (caar alist))
                          (if (cdr alist)
                            ;; If more context values exist, splice out the value;
                            (progn (setf (car alist) (cadr alist))
                                   (setf (cdr alist) (cddr alist)))
                            ;; Otherwise, replace it with the new value;
                            (progn (setf (car alist) (cons target newValue))
                                   (return newValue))))
          (cond ((eq (caar alist) target)
                 (and overwriteP (setf (cdar alist) newValue))
                 (return newValue))
                ((< (the fixnum (ctxt-number (caar alist))) n)
                 (setf (cdr alist) (cons (car alist) (cdr alist)))
                 (setf (car alist) (cons target newValue))
                 (return newValue))
                ((null (cdr alist))
                 (setf (cdr alist) (list (cons target newValue)))
                 (return newValue))
                (t (setq alist (cdr alist))))) )

(defun update-a-cval-alist (alist newValue)
  ;; Situation: "alist" comes from a cval and needs to have "newValue" added
  ;;    as the value for the current context;
  (declare (optimize (speed 3) (safety 0))
           (inline update-a-cval-alist-helper))
  (update-a-cval-alist-helper alist
                              newValue 
                              *current-ctxt*
                              (the fixnum (ctxt-number *current-ctxt*))
                              t))

(defun update-slot-in-ctxt (object slot newValue copyToChildrenP)
  ;; If the current "slot" contents are not already context-dependent, then
  ;; make them context-dependent by adding the original value as the value
  ;; for some context;
  ;; If "value" isn't *unbound-value*, save it as the value in the global context.
  ;; Otherwise, just make it the value in the current context, and it
  ;; will be replaced by the function "update-a-cval-alist";
  (declare (optimize (speed 3) (safety 0)))
  (let ((value (CLOS::slot-value object slot))
        (homeCtxt (home-ctxt object)))
    (when (not (cval-p value))
      ;; LET VALUES BE NON-CONTEXT SENSITIVE IF THE CURRENT CONTEXT
      ;; IS THE SAME AS THE HOME CONTEXT OF "object";
      (if (and (eq homeCtxt *current-ctxt*)
               (or (not copyToChildrenP)
                   (not (ctxt-children *current-ctxt*))))
        (return-from update-slot-in-ctxt
          (setf (CLOS::slot-value object slot) newValue))
        (let ((ctxt (if (eq value *unbound-value*)
                      *current-ctxt*
                      (or homeCtxt *global-ctxt*))))
          (setf (CLOS::slot-value object slot)
                (setq value (make-cval :alist (list (cons ctxt value))))))))
    ;; After this point, "value" is guaranteed to be a CVAL,
    ;;    but it might have a NIL :alist because of garbage collection on read.
    (when (null (cval-alist (the cval value)))         ; TAR 1/26/96
      (setf (cval-alist (the cval value)) (list (cons *current-ctxt* newValue)))
      (return-from update-slot-in-ctxt newValue))
    (when copyToChildrenP 
      (copy-current-value-to-children value homeCtxt (null newValue)))
    (update-a-cval-alist (cval-alist (the cval value)) newValue) ))

(defun update-in-ctxt (updater object value newValue copyToChildrenP)
  ;; Update the value in a context-dependent way;
  ;; If the current "value" is not already context-dependent, then
  ;;   make it context-dependent by making it the value for some context.
  ;; If "value" isn't *unbound-value*, save it as the value in the global context.
  ;; Otherwise, just make it the value in the current context, and it
  ;;   will be replaced by "newValue" by the function "update-a-cval-alist";
  (declare (optimize (speed 3) (safety 0)))
  (let ((homeCtxt (home-ctxt object)))
    (when (not (cval-p value))
      ;; LET VALUES BE NON-CONTEXT SENSITIVE IF THE CURRENT CONTEXT
      ;; IS THE SAME AS THE HOME CONTEXT OF "object";
      (if (and (eq homeCtxt *current-ctxt*)
               (or (not copyToChildrenP)
                   (not (ctxt-children *current-ctxt*))))
        (return-from update-in-ctxt (funcall updater object newValue))
        (let ((ctxt (if (eq value *unbound-value*)
                      *current-ctxt*
                      (or homeCtxt *global-ctxt*))))
          (setq value (make-cval :alist (list (cons ctxt value))))
          (funcall updater object value))))
    ;; After this point, "value" is guaranteed to be a CVAL,
    ;;    but it might have a NIL :alist because of garbage collection on read.
    (when (null (cval-alist (the cval value)))         ; TAR 1/26/96
      (setf (cval-alist (the cval value)) (list (cons *current-ctxt* newValue)))
      (return-from update-in-ctxt newValue))
    (when copyToChildrenP 
      (copy-current-value-to-children value homeCtxt (null newValue)))
    (update-a-cval-alist (cval-alist (the cval value)) newValue) ))


(defun copy-current-value-to-children (value homeCtxt dontCopyNilP)
  ;; Then determine the value for each child context and copy that value to
  ;;    each child ctxt that doesn't already have a local value stored for it.
  ;;    If 'dontCopyNilP', then don't make a copy of a NIL value!
  ;; Tricky: Relies on the destructive operations to update the contents of
  ;;    the underlying cval object;
  ;; QUESTION:  DOES THE INLINED-FUNCTION NEED TO BE A MACRO SO THAT
  ;;   WE CAN REALLY EXPLOIT THE FACT THAT ctxt-children IS SORTED?  IN OTHER
  ;;   WORDS, DOES THE RESETTING OF ALIST IN THE BODY OF THE FUNCTION HELP
  ;;   US HERE?
  (declare (optimize (speed 3) (safety 0))
           (inline update-a-cval-alist-helper))
  (let ((cvalAList (cval-alist (the cval value))))
    (loop for *current-ctxt* in (ctxt-children *current-ctxt*)
          as currentValue = (access-in-ctxt value nil homeCtxt)
          unless (and dontCopyNilP (null currentValue))
          do (update-a-cval-alist-helper cvalAList 
                                         currentValue
                                         *current-ctxt*
                                         (the fixnum (ctxt-number *current-ctxt*))
                                         nil)) ))

;;; Print context tree

;;; May want parameters that specify a root and a depth limit.

(defun print-ctxt-tree ()
  (labels ((walk (ctxts level)
             (dolist (c (reverse ctxts))
               (format t "~&~vt~s~%" (* 3 level) (safe-ctxt-number c))
               (walk (ctxt-children c) (+ level 1)))))
    (walk *root-ctxts* 0)))


;;; New stuff to support multiple inheritance

(defun merge-parent-lists (listOflists)
  ;; Returns a sorted, merged list of parents with duplicates removed;
  (flet ((merge2 (list1 list2)
           (loop when (null list1) return (nconc result list2)
                 when (null list2) return (nconc result list1)
                 when (eq (car list1) (car list2))
                    collect (pop list1) into result
                    and do (pop list2)
                 else when (> (the fixnum (ctxt-number (car list1)))
                              (the fixnum (ctxt-number (car list2))))
                    collect (pop list1) into result
                 else collect (pop list2) into result)))
    (if (rest listOflists)
      (reduce #'merge2 listOflists)
      (car listOflists)) ))

;; QUESTION: CAN WE FINESSE (AVOID) ALL CALLS TO THIS FUNCTION?
(defun subctxt-p (ctxt1 ctxt2)
  (member ctxt2 (ctxt-inheritancelist ctxt1)) )



(eval-when (load eval compile)
  (setq *features* (remove :gc-on-read (remove :gc-on-write *features*))))

;;;; HISTORY:
;;
;;  2-Oct-89:  Converted to packages by KWC.
;;  5-Oct-89:  Complete re-write to be compatible with the POP package
;;             used in O-Plan1.
;;  7-Nov-89:  Included a Context Tree Printer, after much debugging.
;;    1991  :  Complete rewrite by JWD who wanted to understand how it
;;             worked and to try various micro-optimizations.
;;   May 93 :  New ('91) version adapted to O-Plan2 for release 2.0.
;;   Oct 93 :  Replace label with Common Lisp labels
;;   Nov 93 :  Added multiple inheritance, discarding and garbaage collection.
;;;;

;;; End
