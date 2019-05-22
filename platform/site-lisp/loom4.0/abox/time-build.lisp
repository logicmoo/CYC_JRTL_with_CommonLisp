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

;;; TIME-BUILD.LISP (ABOX)

(in-package "LOOM")

(defmacro transition-time (item) `(car ,item))
(defmacro transition-items (item) `(cdr ,item))
(defmacro transition-item-change (item) `(car ,item))
(defmacro transition-item-data (item) `(cadr ,item))
(defmacro transition-item-clippers (item) `(cddr ,item))
(defmacro make-transition-item (change slotType value)
  ``(,,change (,,slotType ,,value)))

(defun overlapping-transitions-p (transition1 transition2)
  (case transition1
    ((:becomes :persists-forward :clips-forward)
     (member transition2 '(:becomes :persists-forward :clips-forward)))
    ((:ceases :persists-backward :clips-backward)
     (member transition2 '(:ceases :persists-backward :clips-backward)))))

; TO DO: Add Cache of last temporal value (+/-) retrieved.

;  HISTORIES-MIXIN adds previous-instance slot.
(defclass TIME-MAP (HISTORIES-MIXIN)
  ((real-instance :initform nil :accessor real-instance)        ; Pointer to the main instance
   (transitions :initform nil :accessor transitions)	        ; Transitions List
   (interval-map :initform nil :accessor interval-map)	        ; State values of the instance
   ))

;; DO WE NEED TO HAVE THIS INHERIT FROM ONE OF THE HISTORY-INSTANCE
;; CLASSES FOR DOING SOME OF THE AUTOMATIC MAINTENANCE WITH HISTORY
;; LIMITS?
(defclass TIME-MAP-HISTORY (TIME-MAP)
  ((next-instance :initform nil :accessor next-instance)    ; Pointer next instance
   (added-transitions :initform nil :accessor added-transitions)	; Transitions Add List
   (removed-transitions :initform nil :accessor removed-transitions)	; Transitions Delete List
   (time-point :initform *agent-time* :accessor time-point)))

(defmethod print-object ((object TIME-MAP) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'TIME-MAP object))
  (if *print-pretty*
      (progn (format stream "TIME-MAP for ~A" (real-instance object))
	     (pp-interval-map (interval-map object) stream))
      (format stream "#<~A TIME-MAP>" (real-instance object))) )

(defmethod print-object ((object TIME-MAP-HISTORY) stream)
  #+:CLTL2(when *print-readably* (print-readably-error 'TIME-MAP-HISTORY object))
  (if *print-pretty*
      (progn (let ((*print-pretty* nil))
	       (format stream "TIME-MAP for ~A at ~A"
		       (real-instance object) (time-point object)))
	     (pp-interval-map (interval-map object) stream))
      (format stream "#<~A TIME-MAP@~A>" (real-instance object) (time-point object))) )

(defmethod time-map ((self TIME-MAP))
  ;; Situation:  We are trying to get the time map but have it already;
  ;; Action: Return self;
  ;; Note:  This can happen inside a predicate for :satisifies, which
  ;;    doesn't expect to get a time-map in for an instance.  This kludge
  ;;    allows that code to work without knowing if a concept is temporal
  ;;    or not;
  self )

(defun nadd-transition (time transition transitionList)
  (declare (special *needToSortP*))
  (let ((aitem (assoc time transitionList)))
    (if aitem
	(progn (push transition (cdr aitem))
	       transitionList)
	(progn (setf *needToSortP* t)
	       (acons time (list transition) transitionList))) ))

(defun nremove-transition (time transition transitionList)
  (let ((aitem (assoc time transitionList)))
    (if aitem
	(progn (setf (cdr aitem)
		     (delete transition (cdr aitem) :test #'equal))
	       (if (cdr aitem)
		   transitionList
		   (delete time transitionList :key #'car)))
	transitionList) ))

(defun get-valid-agent-time-transition-list (timeMap agentTime)
  ;; Build a valid transition list for "agentTime";
  ;; For past "agentTime", follow "previous-instance" links and 
  ;;   DESTRUCTIVELY modify the transitions from the current state.
  ;;   Note that since we are going backwards in time, the sense of add
  ;;   and remove flip when moving from the data structure to the function call;
  ;; TO DO:  DO WE NEED TO DETECT NON-EXISTANT INSTANCES?
  ;;         OR WILL THE RIGHT THINGS HAPPEN ANYWAY?
  (if (= agentTime *agent-time*)
      (transitions timeMap)
      (let ((transitions (loop for itemList in (transitions timeMap)
			       collect (copy-list itemList)))
	    (*needToSortP* nil))
	(declare (special *needToSortP*))
	(loop for previousMap = (previous-instance timeMap)
				then (previous-instance previousMap)
	      while previousMap	; Do we need error checking?
	      do (loop for (time . trans)
		           in (added-transitions previousMap)
		       do (setq transitions
				(nremove-transition time trans transitions)))
	         (loop for (time . trans)
		           in (removed-transitions previousMap)
		       do (setq transitions
				(nadd-transition time trans transitions)))
	      when (>= agentTime (time-point previousMap))
	        return (if *needToSortP*
			   (sort transitions #'< :key #'car)
			   transitions)) )) )

(defun generate-all-world-transitions (timeMap agentTime)
  (when timeMap
    (loop for transition in (get-valid-agent-time-transition-list timeMap agentTime)
	  collect (transition-time transition))))

(defun generate-typed-world-transitions (timeMap slotTypes agentTime alreadyVisited)
  (when (or (null timeMap) (member (real-instance timeMap) alreadyVisited))
    (return-from generate-typed-world-transitions nil))
  (push (real-instance timeMap) alreadyVisited)
  (let ((bareSlotTypes nil) (secondarySlotValues nil) (result nil))
    (loop for slotType in slotTypes
          when (consp slotType)
            do (pushnew (car slotType) bareSlotTypes)
               (pushnew slotType secondarySlotValues)
          else do (pushnew slotType bareSlotTypes))
    (when timeMap
      (setq result (loop for transition in (get-valid-agent-time-transition-list
                                            timeMap agentTime)
                         when (loop for item in (transition-items transition)
                                    thereis (member (first (transition-item-data item))
                                                    bareSlotTypes))
                         collect (transition-time transition)))
      (when secondarySlotValues         ; Gate with power-level?
        (setq result
              (fast-remove-duplicates
               (append (loop for filler in (all-temporal-slot-fillers timeMap agentTime)
                             unless (member filler alreadyVisited)
                             append (loop for (nil concept) in secondarySlotValues
                                          append (generate-typed-world-transitions
                                                  (time-map filler)
                                                  (temporal-depend-ons concept)
                                                  agentTime
                                                  alreadyVisited)))
                       result))))
      result) ))

(defun all-temporal-slot-fillers (timeMap agentTime)
  (fast-remove-duplicates
   (loop for transition in (get-valid-agent-time-transition-list timeMap agentTime)
         append (loop for item in (transition-items transition)
                      when (and (relation-p (first (transition-item-data item)))
                                (binary-p (first (transition-item-data item))))
                      append (cdr (transition-item-data item))))))

;(defun generate-typed-world-transitions (timeMap slotTypes agentTime)
;  (when timeMap
;    (if (cdr slotTypes)
;	(loop for transition in (get-valid-agent-time-transition-list timeMap agentTime)
;	      when (loop for item in (transition-items transition)
;			 thereis (member (first (transition-item-data item))
;					 slotTypes))
;	      collect (transition-time transition))
;	(progn (setq slotTypes (car slotTypes))
;	       (loop for transition in (get-valid-agent-time-transition-list timeMap agentTime)
;		     when (member slotTypes (transition-items transition)
;				  :key #'(lambda (x)
;					   (first (transition-item-data x))))
;		     collect (transition-time transition))))))


(defun generate-asserted-temporal-slots (timeMap)
  (loop for transition in (transitions timeMap)
	as assertions = (loop for item in (transition-items transition)
			      unless (member (transition-item-change item)
					     '(:clip-forward :clip-backward))
			      collect item)
	when assertions
	collect (cons (transition-time transition) assertions)) )


(defun generate-temporal-incoherent-transitions (timeMap agentTime)
  ;; Search the appropriate interval map of instance for transitions in
  ;;   the value of the concept TEMPORAL-INCOHERENT;
  (let ((incoherentP nil)
        (resultTimes nil))
    (setq timeMap (and timeMap 
                       (get-agent-time-offset-time-map timeMap agentTime)))
    (when timeMap
      (loop for (begin end . data) in (interval-map timeMap)
            do (if incoherentP
                 (unless (member (loom-constant TEMPORAL-INCOHERENT)
                                 (assoc :type data))
                   (unless (eql end '+INFINITY)
                     (push end resultTimes))
                   (setq incoherentP nil))
                 (when (member (loom-constant TEMPORAL-INCOHERENT)
                               (assoc :type data))
                   (unless (eql end '+INFINITY)
                     (push end resultTimes))
                   (setq incoherentP t)))
            finally (when (and incoherentP
                               (not (eql begin '-INFINITY)))
                      (push begin resultTimes))))
    resultTimes))

(defun up-to-date-time-map-p (timeMap)
  (or (interval-map timeMap)
      (null (transitions timeMap))))

(defun find-values+ (timeMap slot worldTime)
  (loop for (start end . items) in (interval-map timeMap)
	when (and (time>= worldTime start)
		  (time< worldTime end))
	return (cdr (assoc slot items))))

(defun find-values- (timeMap slot worldTime)
  (loop for (start end . items) in (interval-map timeMap)
	when (and (time> worldTime start)
		  (time<= worldTime end))
	return (cdr (assoc slot items))))

(defun get-agent-time-offset-time-map (timeMap agentTime)
  (if (= agentTime *agent-time*)
      timeMap
      (loop for previousMap = (previous-instance timeMap)
			        	then (previous-instance previousMap)
	      while previousMap	; Do we need error checking?
	      when (>= agentTime (time-point previousMap))
	        return previousMap)) )

(defun direct-slot-value (timeMap slot)
  (setq timeMap (and timeMap (get-agent-time-offset-time-map
			       timeMap *query-agent-time*)))
  (when timeMap
;  Currently done when agent time is advanced:
;    (unless (up-to-date-time-map-p timeMap)
;      (update-time-map (real-instance timeMap)))
    (ecase *query-world-time-suffix*
      (- (find-values- timeMap slot *query-world-time*))
      (+ (find-values+ timeMap slot *query-world-time*))
      (NONE (intersection (find-values+ timeMap slot *query-world-time*)
			  (find-values- timeMap slot *query-world-time*)
			  :test #'filler-equal)))) )

(defun has-direct-slot-value (timeMap slot value)
  (setq timeMap (and timeMap (get-agent-time-offset-time-map
			       timeMap *query-agent-time*)))
  (when timeMap
;  Currently done when agent time is advanced:
;    (unless (up-to-date-time-map-p timeMap)
;      (update-time-map (real-instance timeMap)))
    (ecase *query-world-time-suffix*
      (- (member value (find-values- timeMap slot  *query-world-time*)))
      (+ (member value (find-values+ timeMap slot *query-world-time*)))
      (NONE (and (member value
			 (find-values+ timeMap slot *query-world-time*))
		 (member value
			 (find-values- timeMap slot *query-world-time*)))))) )


(defun make-time-map-history-instance ()
  ;; TO DO:  ADD RECYCLING
  (make-instance 'time-map-history) )

(defmethod discard-instance ((instance TIME-MAP-HISTORY))
  ;; TO DO:  ADD RECYCLING
  (setf (previous-instance (next-instance instance)) nil) )

(defun create-time-map-history-instance (timeMap)
  ;; If needed, create an up-to-date newPreviousInstance instance for "timeMap";
  ;; The history instance is linked in to the previous and next instance 
  ;;   links, and the "interval-map" and "real-instance" pointers are copied.
  ;;   The "interval-map" in "timeMap" will be cleared by the calling routine;
  (unless (and (previous-instance timeMap)
	       (= (time-point (previous-instance timeMap))
		  *agent-time*))
    (let ((newPreviousInstance (make-time-map-history-instance))
	  (oldPreviousInstance (previous-instance timeMap)))
      (setf (real-instance newPreviousInstance) (real-instance timeMap)
	    (interval-map newPreviousInstance)  (interval-map timeMap))
      (link-in-new-history-instance
	timeMap newPreviousInstance oldPreviousInstance) )) )

(defun add-time-value-helper (instance transitionItem worldTime)
  ;; Add "transitionItem" at "worldTime" to the time map for "instance";
  ;; NOTE:  This clears the state map cache;
  (unless (time-map instance)
    (setf (time-map instance) (make-instance 'time-map)
	  (real-instance (time-map instance)) instance))
  (create-time-map-history-instance (time-map instance))
  (flet ((clip-item (clippingItem transitionItemList)
	  (let ((clippingRelation (car (transition-item-data clippingItem)))
		(clippingChange (transition-item-change clippingItem)))
	    (loop for candidate on transitionItemList
		  when (and (eq clippingRelation
				(car (transition-item-data (car candidate))))
			    (overlapping-transitions-p
			      clippingChange
			      (transition-item-change (car candidate))))
		    do (push (cons worldTime (car candidate))  ; RECORD HISTORY
			     (removed-transitions (previous-instance
						    (time-map instance))))
		       (setf (car candidate) nil))
	    (delete nil transitionItemList))))
    (let* ((timeMap (time-map instance))
	   (slot (car (transition-item-data transitionItem)))
	   (aitem (assoc worldTime (transitions timeMap))))
      (if aitem	; RECORD HISTORY STUFF HERE
	  (if (and (neq slot :type) (single-valued-p slot))
	      ;; If true, then possibly clip.
	      (progn (setf (cdr aitem) (clip-item transitionItem (cdr aitem)))
		     (push transitionItem (cdr aitem))
		     (push (cons worldTime transitionItem)  ; RECORD HISTORY
			   (added-transitions (previous-instance timeMap))))
	      (unless (member transitionItem (cdr aitem) :test #'filler-equal)
		  (push transitionItem (cdr aitem))
		  (push (cons worldTime transitionItem)  ; RECORD HISTORY
			(added-transitions (previous-instance timeMap)))))
	  ;; TO DO:  IS IT BETTER TO MAKE THIS INSERT IN ORDER, 
	  ;;    THUS ELIMINATING THE NEED TO SORT LATER?
	  (progn (push (list worldTime transitionItem) (transitions timeMap))
		 (push (cons worldTime transitionItem)  ; RECORD HISTORY
		       (added-transitions (previous-instance timeMap)))))
      (setf (interval-map timeMap) nil)	; Clear cache!
      (pushnew instance *queued-world-time-instance-list*) )))


(defmethod add-time-value
    ((instance TIME-MAP-MIXIN) slot value change worldTime)
  (declare (inline add-time-value-helper))
  (add-time-value-helper instance (make-transition-item change slot value) worldTime))


(defun delete-time-value-helper (instance transitionItem worldTime)
  ;; Delete "transitionItem" at "worldTime" from the time map of "instance";
  ;; If  "transitionItem" causes any clipping, then retract those clips as well;
  ;; NOTE:  This clears the state map cache;
  (let ((timeMap (time-map instance))) 
    (when timeMap		; Otherwise, don't bother!
      (create-time-map-history-instance timeMap)
      (let ((aitem (assoc worldTime (transitions timeMap))))
	(if (and aitem (member transitionItem (cdr aitem) :test #'filler-equal))
	    (progn (loop with otherInstance = (cadr (transition-item-data
						      transitionItem))
			 for item in (transition-item-clippers transitionItem)
			 do (delete-time-value-helper
			      otherInstance item worldTime))
		   (push (cons worldTime transitionItem)  ; RECORD HISTORY
			 (removed-transitions (previous-instance timeMap)))
		   (setf (cdr aitem)
		     (delete transitionItem (cdr aitem) :test #'filler-equal))
		   (setf (interval-map timeMap) nil)	; Clear cache!
		   (pushnew instance *queued-world-time-instance-list*))
	    ;; Error condition:  No such item in the time map!
	    (warn "~A is not in the time map."
		  (format-transition worldTime instance
				     (transition-item-data transitionItem)
				     (transition-item-change transitionItem)))) )) ))

(defmethod delete-time-value
    ((instance TIME-MAP-MIXIN) slot value change worldTime)
  (declare (inline delete-time-value-helper))
  (delete-time-value-helper instance (make-transition-item change slot value) worldTime))


(defun process-queued-world-time-changes ()
  ;; Uses "pop" here rather than iteration, because updating the time-map
  ;;   of an instance can result in temporal changes to other instances via
  ;;   a combination of clipping and inverse relations;
  (loop for instance = (pop *queued-world-time-instance-list*)
	while instance
	unless (discarded-p instance)	; TAR 3/15/93 Handle new instance deletion.
	do (update-time-map instance)))



(defmacro in-add-list-p (data addList &optional time)
  (if time
      `(member `(,,data . ,,time) ,addList :test #'filler-equal)
      `(member ,data ,addList :test #'filler-equal :key #'car)))


(defun format-transition (time instance data transition)
  (flet ((translate-change (change)		; tar 5/25/93
	    (cdr (assoc change '((:persists-forward . :holds-after)
				 (:persists-backward . :holds-before)
				 (:becomes . :begins-at)
				 (:ceases . :ends-at))))))
    (format nil "(~(~S~) ~S ~S)"
	    (translate-change transition)
	    (format-time time nil)
	    (if (eq (first data) :type)
		   (list (name (second data))
			 (generate-instance-identifier instance t))
		   (list (name (first data))
			 (generate-instance-identifier instance t)
			 (generate-filler (second data))))) ))

(defun error-check (time data transition addList backwardP)
  ;; Returns T if the form should be skipped.
  (declare (special *realInstance*))
  (flet ((translate-change (change)		; tar 5/25/93
	    (cdr (assoc change '((:persists-forward . :holds-after)
				 (:persists-backward . :holds-before)
				 (:becomes . :begins-at)
				 (:ceases . :ends-at))))))
    (case transition
      ((:becomes :ceases)
       (when (in-add-list-p data addList)
	 (cerror "Ignore this ~S"
		 "~*~A~%    conflicts with ~:[earlier~;later~] entry"
		 (translate-change transition)
		 (format-transition time *realInstance* data transition)
		 backwardP)
	 t))
      (otherwise nil)) ))

(defun consider-clip (time data transition addList backwardP)
  (let ((slot (car data)))
   (when (and (neq slot :type) (role-is-single-valued-p slot))
    (let* ((addItem (assoc slot addList :key #'car))
	   (needToClipP 
	    (and addItem
		 (if backwardP
		     (case transition
		       (:becomes	; Don't clip backward persistence from this time point!
			(not (eql (cdr addItem) time)))
		       (:persists-forward ; Don't clip backward persistence from this time point!
			(and (not (eql (cdr addItem) time))
			     (not (filler-equal data (car addItem)))))
		       ((:ceases :persists-backward)
			(if (eql (cdr addItem) time)
			    (progn (complain "~%Clipping: Shouldn't Happen!!") t)
			  t)))
		   (case transition
		     ((:becomes :persists-forward)
		      (< (cdr addItem) time)) ; <= ?
		     ((:ceases :persists-backward)
		      (< (cdr addItem) time)) ; Can't be equal or you risk clipping yourself.
		     ))))
	   (needToClipInverseP 
	    (and needToClipP
		 (inverse slot)
		 (not (role-is-single-valued-p (inverse slot)))
		 (not (filler-equal (cadr data) (cadar addItem))))))
      (values needToClipP needToClipInverseP) )) ))

(defun update-time-map-backward (transitionList)
  ;; TO DO:  ADD NEGATION TO :becomes AND :ceases
  (let ((reverseTransitionList nil)
	(addList nil)
	(clipList nil))
    (flet ((do-clip (time item inverseClipP)
	    (declare (special *realInstance*))
	    (let* ((data (transition-item-data item))
		   (aitem (assoc (car data) addList :key #'car)))
	      (when aitem
		(setq addList (delete aitem addList))
		(push (cons time aitem) clipList))
	      (when inverseClipP
		(let ((clipItem (make-transition-item :clip-backward
						      (inverse (car data))
						      *realInstance*)))
		  (unless (member clipItem (transition-item-clippers item)
				  :test #'filler-equal)
;		    (format *trace-output* "~%Need to clip (B) inverse role (~A ~A ~A) @ ~A"
;			    (inverse (car data)) (cadar aitem) *realInstance* time)
		    (push clipItem (transition-item-clippers item))
		    (add-time-value-helper (cadar aitem) clipItem time)) )))))
      (loop for transition in transitionList
	    as time = (transition-time transition)
	    do (push transition reverseTransitionList)
	    (loop for item in (transition-items transition)
		  as data = (transition-item-data item)
		  as change = (transition-item-change item)
		  do (multiple-value-bind (clipP clipInverseP)
			 (consider-clip time data change addList t)
		       (case change
			 (:ceases
			  (unless (error-check time data :ceases addList t)
			    (when clipP (do-clip time item clipInverseP))
			    (push (cons data time) addList)))
			 (:becomes
			  (when clipP (do-clip time item clipInverseP))
			  (setq addList (delete data addList
					    :test #'filler-equal :key #'car)))
			 (:persists-backward
			  (when clipP (do-clip time item clipInverseP))
			  (unless (in-add-list-p data addList)
			    (push (cons data time) addList)))
			 (:persists-forward
			  (when clipP (do-clip time item clipInverseP)))
			 (:clip-backward (do-clip time item nil))) )))
    (values addList reverseTransitionList clipList) )))

(defun update-time-map-forward (addListBackward transitionList clipList)
  ;; TO DO:  ADD NEGATION TO :becomes AND :ceases
  (let ((timeLine nil)
	(addListForward nil)
	(changeP t))
    (flet ((do-clip (time item clipInverseP)
	    (declare (special *realInstance*))
	    (let ((data (transition-item-data item)))
	      (when clipInverseP
		(let ((clipItem (make-transition-item :clip-forward
						      (inverse (car data))
						      *realInstance*))
		      (aitem (assoc (car data) addListForward :key #'car) ))
;		  (format *trace-output* "~%Need to clip (F) inverse role (~A ~A ~A) @ ~A"
;			  (inverse (car data)) (cadar aitem) *realInstance* time)
		  (add-time-value-helper (cadar aitem) clipItem time) ))
	      (setq addListForward (delete (car data) addListForward
					   :test #'filler-equal :key #'caar)) ))
	   (persistance-change-p (data) 
	     (find data addListForward
		   :test #'(lambda (x y) (and (eq (car x) (car y))
					      (not (eql (cadr x) (cadr y)))))
		   :key #'car))
	   (change-occurs-p (item addList)
	     ;; Returns T if the new item added doesn't change the values already
	     ;;   present in the addList;
	     ;; "item" = ((<slot> <value> ...) . time)
             ;; "addList" is a list of items.
	     (not (set-equal-p (cdar item)
			       (cdar (assoc (caar item) addList :key #'car))))))
      (loop for transition in transitionList
	    as lastTime = '-INFINITY then time
	    as time = (transition-time transition)
	    do (setq timeLine
		     (update-time-line timeLine time lastTime
				       addListBackward addListForward changeP))
  	       (setq changeP nil)
	       (loop while (eql time (caar clipList))
		     do (let ((item (cdr (pop clipList))))
			  (setq changeP
				(or changeP
				    (change-occurs-p item addListBackward)))
			  (push item addListBackward)))
	       (loop for item in (transition-items transition)
		     as data = (transition-item-data item)
		     as change = (transition-item-change item)
		     do (multiple-value-bind (clipP clipInverseP)
			    (consider-clip time data change addListForward nil)
			  (case change
			    (:becomes
			     (unless (error-check time data :becomes    ; TAR 9/14/93
                                                  addListForward nil)   ; Only check forward!
			     (when clipP (do-clip time item clipInverseP))
			     (push (cons data time) addListForward)
			     (setq changeP t)))
			  (:ceases	; No error should be possible here!
			   (when (in-add-list-p data addListBackward)
			     (when clipP (do-clip time item clipInverseP))
			     (setq addListBackward 
			       (delete data addListBackward
				       :test #'filler-equal :key #'car))
			     (setq changeP t))
			   (when (in-add-list-p data addListForward)
			     (setq addListForward 
			       (delete data addListForward
				       :test #'filler-equal :key #'car))
			     (setq changeP t)))
			  (:persists-forward
			     ;; TRICKY:  We never set "changeP" to NIL except
			     ;;           at the top of the loop;
			   (unless (or (in-add-list-p data addListForward)
				       (in-add-list-p data addListBackward))
			     (setq changeP t))
			   (when clipP
			     (when (persistance-change-p data) (setq changeP t))
			     (do-clip time item clipInverseP))
			   (unless (in-add-list-p data addListForward)
			     (push (cons data time) addListForward))
			   (when (in-add-list-p data addListBackward)
			     (setq addListBackward 
			       (delete data addListBackward
				       :test #'filler-equal :key #'car))))
			  (:persists-backward
			   (when (in-add-list-p data addListBackward time)
			     (when clipP
			       (when (persistance-change-p data)
				 (setq changeP t))
			       (do-clip time item clipInverseP))
			     (setq addListBackward
				   (delete data addListBackward
				     :test #'(lambda (x y)
					       (and (eql time (cdr y))
						    (filler-equal x (car y)))))))
			   (unless (or (in-add-list-p data addListForward)
				       (in-add-list-p data addListBackward))
			     (setq changeP t)))
			  (:clip-forward
			   (when (in-add-list-p data addListForward)
			     (do-clip time item nil)
			     (setq changeP t)))) ))
	       finally (setq timeLine
			     (update-time-line timeLine '+INFINITY time
			       addListBackward addListForward changeP)) )
      timeLine )))

(defun update-time-line
       (timeLine time lastTime addListBackward addListForward changeP)
  ;; Format of itemList:  ((<slotType1> <value11> ... <value1N>) ...)
  ;; Format of addList*:  (((<slotType1> <value11>) . <time>)
  ;;                       ((<slotType1> <value12>) . <time>)
  ;;                       ... )
  ;; NOTE:  Implements check for temporal incoherence that is caused by multiple
  ;;        different values for single-valued roles.
  (let ((itemList nil)
	(incoherentConcept (loom-constant TEMPORAL-INCOHERENT)))
    (flet ((construct-item-list (addList)
	     (loop for ((slotType value) . nil) in addList
		   as foundEntry = (find slotType itemList :key #'car)
		   do (if foundEntry
			  (unless (member value (cdr foundEntry) 
					  :test #'filler-equal)
                          (push value (cdr foundEntry))
                          (when (and (neq slotType :type)
                                     (role-is-single-valued-p slotType))
                            (setq foundEntry (find :type itemList :key #'car))
                            (if foundEntry
                              (pushnew incoherentConcept (cdr foundEntry))
                              (push (list :type incoherentConcept) itemList))))
                        ;This MUST be consed (for destructive modifcation:)
                        (push (list slotType value) itemList)))))
      (if changeP
        (progn (construct-item-list addListBackward)
               (construct-item-list addListForward)
               (cons `(,lastTime ,time ,@itemList)
                     timeLine))
        (progn (setf (cadar timeLine) time) timeLine)) )))

(defun update-time-map (instance)
  (let ((*realInstance* instance)
	(timeMap (time-map instance)))
    (declare (special *realInstance*))
    (setf (transitions timeMap)
	  (sort (transitions timeMap) #'> :key #'car))
    (setf (interval-map timeMap)
	  (multiple-value-bind (addList reverseTransitionsList clipList)
	      (update-time-map-backward (transitions timeMap))
	    (update-time-map-forward addList reverseTransitionsList clipList) )) ))


(defun pp-interval-map (intervalMap stream)
  (loop for interval in intervalMap
	initially (format stream "~%(")
	when (cddr interval)
	do (if (eql *format-time-style* :string)
	       (format stream "(~19@S  ~19@S"
		       (format-time (car interval) nil)
		       (format-time (cadr interval) nil))
	       (format stream "(~9@S  ~9@S "
		       (format-time (car interval) nil)
		       (format-time (cadr interval) nil)))
	   (loop for (slotType . values) in (cddr interval)
		 when (eq slotType :type)
		 do (format stream "  (~S ~{ ~A~})"
			    slotType
			    (sort (mapcar #'(lambda (x)
					      (format nil "~A" (name x)))
					  values)
				  #'string<))
		 else
		 do (format stream "  (~S ~{ ~A~})"
			    (name slotType)
			    (sort (mapcar #'(lambda (x)
					      (let ((filler (generate-filler x)))
						(if (quoted-p filler)
						  (format nil "'~A" (cadr filler))
						  (format nil "~A" filler))) )
					  values)
				  #'string<)))
	   (format stream ")~% ")
	finally (format stream ")~%")))

