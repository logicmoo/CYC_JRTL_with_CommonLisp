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

;;; UTILITY.LISP (ABOX)

;;; These functions provide knowledge base and context utilities
;;;    for loading and saving knowledge bases, and clearing a context.

(in-package "LOOM")

(export '(where-is-it save-kb save-context-items save-context 
          load-kb load-concepts 
          clear-context get-version-string get-version))

  ;;
;;;;;; "where-is-it"
  ;;

(defun where-is-it (input &key partitions)
  ;; Return a list of object/context/partition triples;
  ;; The search cuts across packages, finding any object whose name or
  ;;    identifier matches the "input" pattern;
  ;; If "partitions" are specified, only search those partitions;
  (cond
    ((null input) 
     (return-from where-is-it nil))
    ((not (or (symbolp input) (integerp input)))
     (let ((partitionId
	     (typecase input
	       (UNARY-ENTITY :concepts)
	       (TBOX-RELATION :relations)
	       (otherwise :instances))))
       (if (or (null partitions) (member partitionId partitions))
	   (return-from where-is-it
	     `((,input
		,(name (find-context-of-object input partitionId))
		,partitionId)))
	   (return-from where-is-it nil)) )))	; end "cond"
  (let ((symbolP (symbolp input))
	pattern wildcardPatternP positionOfStar substring substringLength
	cxtOrWorldId partitionName result)
    (labels ((collect-locations
	       (key self)
	       (let (matchesP matchString)
		 (setq matchesP
		       (if symbolP
			   (progn
			     (setq matchString (symbol-name key))
			     (or (string-equal pattern matchString)
				 (and wildcardPatternP
				      (case positionOfStar
					(:start 
					 (string-suffix-p 
					   substring matchString substringLength))
					(:end
					 (string-prefix-p 
					   substring matchString substringLength))
					(:both
					 (search substring matchString))))))
			   (eql pattern key))) ; pattern is an integer
		 (when matchesP
		   (when (numberp cxtOrWorldId)
		     (setq cxtOrWorldId
			   (string-append "world:" (format nil "~A" cxtOrWorldId))))
		   (push (list self cxtOrWorldId partitionName) result)))))
      (if symbolP
	  (progn
	    ;; initialize pattern variables:
	    (setq pattern (symbol-name input))
	    (setq wildcardPatternP (position #\* pattern))
	    (setq positionOfStar (string-position-of-star pattern))
	    (setq substring (remove #\* pattern))
	    (setq substringLength (length substring)))
	  (setq pattern input))			; pattern is an integer
      (loop for cxt in (list-contexts)
	   do
	   (setq cxtOrWorldId (name cxt))
	   (loop for part in (collect-partitions cxt partitions)
		do
		(setq partitionName (partition-identifier part))
		(do-context-partition
		  (key self part :skip-anonymous-instances-p t)
		  (collect-locations key self)))
;; OBSOLETE NOW THAT WORLDS ARE DISAPPEARING:
;	   (when (or (null partitions)
;		     (member :instances partitions))
;	     (setq partitionName :instances)
;	     (loop for w in (root-worlds cxt) 
;		  do (visit-worlds w)))
           )
      result )))


  ;;
;;;;;; Saving and loading knowledge bases
  ;;

(defun save-kb (&rest arguments)
  "(SAVE-KB [KnowledgeBase] :pathname aPathName :stream aStream :partitions aPartition :sort-P flag).
Write the definitions, rules, facts, etc. in `knowledgeBase' to the 
file associated with that knowledge base."
  ;; Tricky:  The ~(~S~) format directive with a constant argument is used
  ;;    to make the output robust in the face of weird package situations,
  ;;    specifically for packages that doesn't use the LOOM package.
  (obsolete save-kb save-context)
  (when (plusp *count-of-unclassified-concepts*)
    (grumble "Can't save knowledge base when unclassified concepts exist.")
    (return-from save-kb nil))
  (multiple-value-bind (knowledgeBase options)
      (KBCLASSES::separate-optional&key-arguments 
       arguments '(:partitions :path-name :pathname :stream :sort-p) "save-kb")
    (setq knowledgeBase (coerce-to-knowledge-base (first knowledgeBase)))
    (when (null knowledgeBase)
      (if (eql *context* (find-context 'BUILT-IN-THEORY))
	  (complain "~%BUILT-IN-THEORY cannot be saved by save-kb.  Perhaps you need to call~%~
           change-kb or change-context to select a valid knowledge base first?")
        (complain "~%Can't save a knowledge base because I can't find one."))
      (return-from save-kb nil))
    (let ((knowledgeBaseName (name knowledgeBase))
	  (currentContext *context*)
	  (pathName (or (getf options :pathname)
			(getf options :path-name) 
			(and (not (getf options :stream))
			     (path-name knowledgeBase))))
	  (sortP (if (member :sort-p options)
		     (getf options :sort-p)
		   t))
	  (partitions (getf options :partitions)) ;  TAR 8/2/94
	  (*print-level* nil)
	  (*print-length* nil)
	  #+:CLTL2(*print-readably* t)
	  (*print-array* t)
	  (*package* (find-package (kb-package-name knowledgeBase))) ; Print in proper package!
	  (*saving-to-a-file* t))
      (declare (special *saving-to-a-file*))
      (flet ((save-kb-to-stream (toStream)
	       (format toStream ";;; -*- Mode: LISP; Syntax: Common-Lisp; ~
               Package: ~A; Base: 10. -*-~%~%" (kb-package-name knowledgeBase))
	       (format toStream "(~(~S~) ~S)~%~%"
		       'in-package (kb-package-name knowledgeBase))
	       (format toStream ";;; Knowledge Base:   ~S~%"
		       knowledgeBaseName)
	       (format toStream ";;; Last Saved On:    ~A~%~%"
		       (current-time-string))
	       (format toStream "(~(~S~) savedContext ~(~S~))~%"
		       'defparameter '(current-context)) ; was '*context*  -TAR 4/6/93
	       (format toStream "(~(~S~) savedCreationPolicy ~(~S~))~2%"
		       'defparameter nil)
	       (format toStream "(~(~S~) ~S)~%" 'change-kb knowledgeBaseName) ; KLUDGE to create context -TAR 4/6/93
	       
	       (loop for cxt in (contexts knowledgeBase)
		   when partitions
		   do (save-one-context cxt nil nil toStream sortP partitions)
		   else do (save-one-context cxt nil nil toStream sortP))

	       (format toStream "~%(~(~S~) savedContext)~%" 'change-context))) ; KLUDGE was change-context -TAR 4/6/93

	(unless (or pathName (getf options :stream))
	  (grumble "No output file specified for saving knowledge base.")
	  (return-from save-kb nil))
	;; write concept, behavior, and instance definitions out to a file
	(unwind-protect			; To protect current Context setting!
	    (if pathName
		(with-open-file (outputStream pathName
				 :direction :output
				 :if-exists :new-version
				 :if-does-not-exist :create)
		  (save-kb-to-stream outputStream)
                  (truename pathName))
	      (progn (save-kb-to-stream (getf options :stream))
		     (getf options :stream)))
	  (change-context currentContext)) ))))

(defun save-context (&rest arguments)
  "(SAVE-CONTEXT [Context] :pathname aPathName :stream aStream :partitions aPartition 
              :rename newContextName :rename-package newPackageName
              :user userID :user-name userName :sort-p flag).
Write the definitions, rules, facts, etc. in `Context' to the specified
`pathname'."
  ;; Tricky:  The ~(~S~) format directive with a constant argument is used
  ;;    to make the output robust in the face of weird package situations,
  ;;    specifically for packages that doesn't use the LOOM package.
  (when (plusp *count-of-unclassified-concepts*)
    ; (grumble "Can't save context when unclassified concepts exist.")
    ; (return-from save-context nil)
    (grumble "Saving context even though unclassified concepts exist.")
    )
  (let ((context nil))
    (multiple-value-bind (contextList options)
	(KBCLASSES::separate-optional&key-arguments 
	 arguments '(:partitions :pathname :stream :rename :rename-package 
		     :user :user-name :sort-p)
	 "save-context")
      (setq context (if (first contextList)
			(find-context (first contextList) :error-p nil)
                      *context*))
      (when (null context)
        (complain "~%Can't save context ~A because I can't find it." )
        (return-from save-context nil))
      (let ((contextName (name context))
	    (currentContext *context*)
	    (pathName (getf options :pathname))
            (partitions (getf options :partitions))
	    (sortP (if (member :sort-p options)
		       (getf options :sort-p)
		     t))
	    (rename (getf options :rename))
	    (rename-package (getf options :rename-package))
	    (userID (getf options :user))
	    (userName (getf options :user-name))
	    
	    (*print-level* nil)
	    (*print-length* nil)
	    #+:CLTL2(*print-readably* t)
	    (*print-array* t)
	    (*saving-to-a-file* t)
	    (*package* 
	     (or (find-package (get-value context 'background-package-name))
		 *package*)))

        (declare (special *saving-to-a-file*))
        (flet ((save-context-to-stream (toStream)
	         (format toStream ";;; -*- Mode: LISP; Syntax: Common-Lisp; ~
                                   Package: ~A; Base: 10. -*-~%~%"
			 (or rename-package (package-name *package*)))
		 (pprint (make-defpackage-form *package* :rename rename-package) toStream)
	         (format toStream "~%~%(~(~S~) ~S)~%~%"
		         'in-package (or rename-package (package-name *package*)))
	         (format toStream ";;;       Context:   ~@[~S    derived from ~]~S~%"
			 rename contextName)
	         (format toStream ";;; Last Saved On:    ~A~%"
		         (current-time-string))
		 (format toStream
			 ";;;    Written By:    ~@[~A~]~@[~:*~:[~A~;    (~A)~]~]~%~%"
			 userID userName)
		 (format toStream "~&(~(~S~) #+:CLTL2 ~S~%~10T#-:CLTL2~S~%"
                       'eval-when
                       '(:execute :load-toplevel :compile-toplevel)
                       '(load eval compile))
	         (format toStream " (~(~S~) savedContext ~(~S~))~%"
		         'defparameter '(current-context)) ; was '*context*  -TAR 4/6/93
	         (format toStream " (~(~S~) savedCreationPolicy ~(~S~)))~%"
		         'defparameter nil)
		 (format toStream "#+(or :loom3 loom4) (~(~S~) savedAutoAdvance ~(~S~))~%"
			 'defparameter '*automatically-advance-state-p*)
		 (format toStream 
			 "(~(~S~) savedLoomFeatures (~S :dont-display-p ~S))~2%"
			 'defparameter 'list-features t)

		 (format toStream
			 "(~S :allow-duplicate-creates)~%"
			 'set-features)
		 (format toStream "~&(~(~S~) #+:CLTL2 ~S~%~10T#-:CLTL2~S~%"
                       'eval-when
                       '(:execute :load-toplevel :compile-toplevel)
                       '(load eval compile))
		 (format toStream " (~(~S~) ~:[~S~;~:*~A~*~] ~S ~S~%    ~
                        :open-closed-mode ~S~%   ~
                        :monotonic-p ~S ))~%"
			 'defcontext rename contextname (type-of-context context)
			 (mapcar #'name (parent-contexts context))
			 (open-closed-mode context)
			 (test-bit-flags (context-flag context) :context-flag 
					 :monotonic))
                 (if partitions
		     (save-one-context
		      context rename rename-package toStream sortP partitions)
		   (save-one-context context rename rename-package toStream sortP))
		 (format toStream "~&(~(~S~) #+:CLTL2 ~S~%~10T#-:CLTL2~S~%"
                       'eval-when
                       '(:execute :load-toplevel :compile-toplevel)
                       '(load eval compile))
                 (format toStream "~%(~(~S~) savedContext))~%" 'change-context)
                 (format toStream "~%#+(or :loom3 :loom4) (~(~S ~S~) savedAutoAdvance)~%"
			 'setq  '*automatically-advance-state-p*)
		 (format toStream "(~(~S~) #'~(~S~) savedLoomFeatures)~%"
			 'apply 'set-features)))
          
	  (unless (or pathName (getf options :stream))
	    (if (get-value context 'background-file-name)
		(setq pathName (get-value context 'background-file-name))
	      (progn (grumble "No output file specified for saving context.")
		     (return-from save-context nil))))
	  ;; write concept, behavior, and instance definitions out to a file
	  (unwind-protect		; To protect current Context setting!
	      (if pathName
		  (with-open-file (outputStream pathName
				   :direction :output
				   :if-exists :new-version
				   :if-does-not-exist :create)
		    (save-context-to-stream outputStream)
		    (truename pathName))
		(progn (save-context-to-stream (getf options :stream))
		       (getf options :stream)))
	    (change-context currentContext)) )))))

(defun save-context-items (context &key pathName stream path-name
					relations concepts behaviors instances
					rename rename-package user user-name)
  "Saves the selected items from `context' to a file names `:pathName' or to
the output stream `:stream'.  The items to be saved are passed as lists of 
objects of the proper type in the arguments `:relations', `:concepts',
`:behaviors' and `:instances'.  These lists may be NIL."

  (obsolete-argument save-context-items path-name pathName)
  (let ((savedContext *context*)
	(contextName (name context))
        (*print-level* nil)
        (*print-length* nil)
        #+:CLTL2 (*print-readably* t)
        (*print-array* t)
        (*saving-to-a-file* t))
    (declare (special *saving-to-a-file*))
    (flet ((save-items-to-stream (toStream)
             (format toStream ";;; -*- Mode: LISP; Syntax: Common-Lisp; ~
                               Package: ~A; Base: 10. -*-~%~%" 
                     (or rename-package (package-name *package*)))
             (format toStream "(~(~S~) ~S)~%~%"
                     'in-package (or rename-package (package-name *package*)))
	     (format toStream ";;;       Context:   ~@[~A    derived from ~]~S~%"
		     rename contextName)
             (format toStream ";;; Last Saved On:    ~A~%"
                     (current-time-string))
	     (format toStream
		     ";;;    Written By:    ~@[~A~]~@[~:*~:[~A~;    (~A)~]~]~%~%"
		     user user-name)
	     (format toStream "~&(~(~S~) #+:CLTL2 ~S~%~10T#-:CLTL2~S~%"
                       'eval-when
                       '(:execute :load-toplevel :compile-toplevel)
                       '(load eval compile))
             (format toStream " (~(~S~) savedContext ~(~S~)))~%"
                     'defparameter '(current-context))	; was '*context*  -TAR 4/6/93
             (format toStream "(~(~S~) savedCreationPolicy ~(~S~))~%"
                     'defparameter nil)
	     (format toStream 
		     "(~(~S~) savedLoomFeatures (~S :dont-display-p ~S))~2%"
		     'defparameter 'list-features t)
	     (format toStream "#+(or :loom3 :loom4) (~(~S~) savedAutoAdvance ~(~S~))~%"
		     'defparameter '*automatically-advance-state-p*)
             (format toStream "(~(~S~) savedCreateAction ~S)~2%"
                     'defparameter
		     (member :allow-duplicate-creates *loom-dialogue-features*))
	     (format toStream
		     "(~S :allow-duplicate-creates)~%" 
		     'set-features)
	     (format toStream "~&(~(~S~) #+:CLTL2 ~S~%~10T#-:CLTL2~S~%"
                       'eval-when
                       '(:execute :load-toplevel :compile-toplevel)
                       '(load eval compile))
	     (format toStream " (~(~S~) ~:[~S~;~:*~A~*~] ~S ~S))~%" 
		     'defcontext rename contextname (type-of-context context)
		     (mapcar #'name (parent-contexts context)))
             (help-save-one-context context rename rename-package toStream
				    relations concepts behaviors instances)
             (change-context savedContext)
	     (format toStream "~%(~(~S~) #+:CLTL2 ~S~%~10T#-:CLTL2~S~%"
		     'eval-when
		     '(:execute :load-toplevel :compile-toplevel)
		     '(load eval compile))
             (format toStream " (~(~S~) savedContext))~%" 'change-context)
	     (format toStream "~%#+(or :loom3 :loom4) (~(~S ~S~) savedContext)~%"
		     'setq  '*automatically-advance-state-p*)
	     (format toStream "(~(~S~) #'~(~S~) savedLoomFeatures)~%"
		     'apply 'set-features)))

      (cond (pathName
             (with-open-file (outputStream pathName :direction :output)
               (save-items-to-stream outputStream))
             (truename pathName))
            (stream
             (save-items-to-stream stream)
             stream)
	    ((get-value context 'background-file-name)
	     (with-open-file (outputStream (get-value context 'background-file-name)
			      :direction :output)
               (save-items-to-stream outputStream)))
            (t (grumble "No output file specified for saving context items")
               nil)) )))

(defun help-save-one-context (context rename rename-package outputStream
			      listOfRelations listOfConcepts
			      listOfBehaviors listOfInstances)
  ;; Write out the specified objects in "context" to "outputStream";
  (let ((conceptCount 0))               ; Limit size of eval-when to 100 items
    (labels ((write-source-definition (concept)
               #+:CLTL2(let ((*print-readably* nil))
                         (inform "~%~S" concept))
               #-:CLTL2(inform "~%~S" concept)
               (loop for def in (generate-source-definition
                                 concept :list-p t :source-context *context*)
                     do (print-concept-definition 
                         def :outputStream outputStream :newline t))
               (incf conceptCount)
               (when (zerop (mod conceptCount 100))     ;  TAR 12/20/93
                 #+:ISI (inform " \\")
                 (write-eval-when-ending (floor conceptCount 100))
                 (write-eval-when-beginning (1+ (floor conceptCount 100)))))
             (write-eval-when-beginning (n)     ;  TAR 12/20/93
               (format outputStream "~&(~(~S~) #+:CLTL2 ~S  ; EVAL-WHEN ~D~%~10T#-:CLTL2~S~%"
                       'eval-when
                       '(:execute :load-toplevel :compile-toplevel)
                       n
                       '(load eval compile)))
             (write-eval-when-ending (n)        ;  TAR 12/20/93
               (format outputStream "~%)    ; END EVAL-WHEN ~D~2%" n)))
      (change-context context) ;TAR 3/10/93  Original value preserved by caller
      (write-eval-when-beginning 0)
      (format outputStream "(~(~S~) '~:[~S~;~:*~A~*~])~%"
	      'change-context rename (name context))
      (format outputStream "(~(~S~) savedCreationPolicy ~(~S~))~%"
              'setf '(creation-policy))
      (format outputStream "(~(~S~) ~S)~2%" 'creation-policy (creation-policy))
      (write-eval-when-ending 0)
      (when (or listOfConcepts listOfRelations)
	(format outputStream ";;; Terminological Definitions:~2%")
        (write-eval-when-beginning 1)
	(loop for concept in listOfRelations
	    do (write-source-definition concept))
        (loop for concept in listOfConcepts
	    do (write-source-definition concept))
	(loop with defn
	    for instance in listOfInstances
	    when (typep instance 'proposition)
	    do (when (setq defn (generate-source-definition instance))
		 (pprint defn outputStream)))


        (format outputStream "~2%(~(~S~))"
                'finalize-definitions)
        (write-eval-when-ending (1+ (floor conceptCount 100))))
      (when listOfBehaviors
	(format outputStream ";;; Behaviors (Productions, Actions, Methods):~2%")
	(loop for behavior in listOfBehaviors
            do #+:CLTL2(let ((*print-readably* nil))
                         (inform "~%~S" behavior))
            #-:CLTL2(inform "~%~S" behavior)
            (pprint (generate-object-definition behavior) outputStream))
        (format outputStream "~2%"))
      (let ((*anonymousClosIdentifierAlist* nil)
            (*namedClosInstances* nil))
        (declare (special *anonymousClosIdentifierAlist*
                          *namedClosInstances*))
        (let ((tellForms (loop for instance in listOfInstances
			     unless (or (discarded-p instance)
					(typep instance 'proposition))
                               do #+:CLTL2(let ((*print-readably* nil))
                                            (inform "~%~S" instance))
                               #-:CLTL2(inform "~%~S" instance)
                               and collect (generate-instance-definition
                                            instance nil)
			     ;; and append (generate-role-filler-forms instance)
				 )))
	  (setq *namedClosInstances*
		(sort *namedClosInstances* #'string-lessp
		      :key #'(lambda (x) (symbol-name (cdr x)))))
	  (setq *anonymousClosIdentifierAlist*
		(sort *anonymousClosIdentifierAlist* #'string-lessp
		      :key #'(lambda (x) (symbol-name (cdr x)))))
	  (format outputStream ";;; Instance Creation:~2%")
          (loop for form in (generate-named-clos-instances)
                do (pprint form outputStream))
          (format outputStream "~2&;;; Instance Assertions:~%")
          (if *anonymousClosIdentifierAlist*
            (pprint `(let ,(generate-anonymous-clos-instances)
                       ,@(delete-if-not #'cdr tellForms)) ; Suppress empty TELLs
                    outputStream)
            (loop for form in tellForms
                  when (cdr form)       ; Suppress empty TELLs
                  do (pprint form outputStream))) )
        (when listOfInstances
          (format outputStream "~2%"))
        ;; Save concept and relation annotations:
        (loop for concept in listOfRelations
              as attributes = (generate-instance-attributes
                               concept
                               (generate-instance-identifier concept nil)
                               nil)
              when attributes
              do #+:CLTL2(let ((*print-readably* nil))
                           (inform "~%~S" concept))
              #-:CLTL2(inform "~%~S" concept)
              (pprint `(tell ,@attributes) outputStream))
	(loop for concept in listOfConcepts
              as attributes = (generate-instance-attributes
                               concept
                               (generate-instance-identifier concept nil)
                               nil)
              when attributes
              do #+:CLTL2(let ((*print-readably* nil))
                           (inform "~%~S" concept))
              #-:CLTL2(inform "~%~S" concept)
              (pprint `(tell ,@attributes) outputStream))
        ;; Save N-Ary relation values:
        (loop for relation in listOfRelations   ;  TAR 4/18/96
              when (> (arity relation) 2)
              do #+:CLTL2(let ((*print-readably* nil))
                           (inform "~%~S" relation))
                 #-:CLTL2(inform "~%~S" relation)
                 (loop with relationForm = (generate-filler relation)
                       for tuple in (list-tuples relation)
                       do (pprint `(fadd-tuple ,relationForm 
					       ,(generate-filler tuple))
                                 outputStream)))

	;; Save Role Facet Information:
	;;; TO DO: POSSIBLY ELIMINATE REDUNDANT FACETS
	
	;; Sometimes concepts and relations are listed together in
	;;  "listOfRelations", e.g., when sorted in :as-defined order!
	(format outputStream "~2%;;; Facet Assertions:~%")
	(loop for concept in listOfRelations
	    do (loop for role in (roles concept)
		   do (loop for form in (generate-role-filler-forms role)
			  do (pprint form outputStream))))
	
	(loop for concept in listOfConcepts
	    do (loop for role in (roles concept)
		   do (loop for form in (generate-role-filler-forms role)
			  do (pprint form outputStream))))
	

	;; Save this context annotations:  ; TAR 7/11/96
	#||  ;; THIS IS CODE TO USE IF CONTEXTS BECOME CONTEXT SENSITIVE:
	(loop for c in (list-contexts)
	      as cRef = (generate-filler c)
	      as dynamicConcepts = (dynamically-asserted-conjuncts c)
	      as roleFillers = (generate-role-filler-forms c)
	      when (or dynamicConcepts roleFillers)
	        do #+:CLTL2(let ((*print-readably* nil))
                              (inform "~%~S" c))
                   #-:CLTL2(inform "~%~S" c)
		   (loop for concept in dynamicConcepts
		         do (pprint `(add-type ,cRef ,(generate-filler concept))
			  	    outputStream))
	           (loop for f in roleFillers
			 do (pprint f outputStream)))
	||#
	;; ... in the meantime just save this context's annotations:
	#+:CLTL2(let ((*print-readably* nil)) (inform "~%~S" context))
	#-:CLTL2(inform "~%~S" context)
	(format outputStream "~2&;;; Context Assertions:~2%")
	(let ((cRef (generate-filler context)))
	  (when rename
	    (setq cRef (subst rename (name context) cRef)))
	  (loop for concept in (dynamically-asserted-conjuncts context)
	        do (pprint `(add-type ,cRef ,(generate-filler concept))
			   outputStream))
	  (loop for f in (generate-role-filler-forms context)
	      when rename
	      do (if (and rename-package 
			  (equal (third f) ''background-package-name))
		     (pprint `(set-value
			       ,cRef 'background-package-name ,rename-package)
			     outputStream)
		   (pprint `(,(first f) ,cRef ,@(cddr f)) outputStream))
	      else do (pprint f outputStream)) )
	  )
      (format outputStream "~2%;;;  END OF DATA~2%(~(~S~) savedCreationPolicy)~%"
              'creation-policy) )))

(defun save-one-context (context rename rename-package outputStream
			 &optional (sort-p t)
				   (partitions `(:relations :concepts
							    :behaviors :instances)))
  ;; Helping function for "save-kb";
  ;; Save all of the objects in "context" in the specified "partitions" to
  ;;   the file designated by "outputStream";
  (setq partitions (list-of partitions))
  (let* ((listOfRelations
          (when (member :relations partitions)
            (loop for relation in (list-context context :partitions :relations
						        :sort-p sort-p)
		  unless (or (system-defined-concept-p relation) 
			     (member :reified (attributes relation)))
		  collect relation)))
         (listOfConcepts
          (when (member :concepts partitions)
            (loop for concept in (list-context context :partitions :concepts
					               :sort-p sort-p)
		  unless (system-defined-concept-p concept)
		  collect concept)))
         (listOfBehaviors
          (when (member :behaviors partitions)
            (list-context context :partitions :behaviors :sort-p t)))
         (listOfInstances
          (when (member :instances partitions)
            (list-context context :partitions :instances :sort-p t))))
    (if (eq sort-p :as-defined)
	(help-save-one-context context rename rename-package outputStream
			       (merge 'list listOfRelations listOfConcepts
				      #'< :key #'loom::sequence-number)
			       nil listOfBehaviors listOfInstances)
	(help-save-one-context context rename rename-package outputStream
			       listOfRelations listOfConcepts
			       listOfBehaviors listOfInstances))))

(defun make-defpackage-form (packageOrName &key rename include-export-p sorted-p)
  ;; Creates a DEFPACKAGE form that will reconstruct "packageOrName" when
  ;;  it is executed.  If ":rename" is specified, then a defpackage form
  ;;  will be created to define a package with that name and all of the other
  ;;  attributes of "packageOrName".  This allows `cloning' of packages;
  ;;  If `include-export-p' then exported symbols will also appear in the
  ;;    DEFPACKAGE form.  If NIL (the default), this clause will not appear.;
  ;;  If `sorted-p' then the strings will be sorted alphabetically;
  (let ((pkg (find-package packageOrName)))
    (when pkg
      (let ((use (package-use-list pkg))
	    (nicknames (unless rename (package-nicknames pkg)))
	    export
	    import
	    shadow 
	    shadowingimport
	    aItem bItem)
	(when include-export-p
	  (do-external-symbols (s pkg)
	    (push (symbol-name s) export)))
	(loop for s in (package-shadowing-symbols pkg)
	      when (eql (symbol-package s) pkg)
	        do (push (symbol-name s) shadow)
	      else do (setq aItem (assoc (symbol-package s) shadowingimport))
	              (if aItem
			  (pushnew s (cdr aItem))
			  (push (list (symbol-package s) s) shadowingimport)))
	(do-symbols (s pkg)
	  (unless (or (eql (symbol-package s) pkg)
		      (member (symbol-package s) use))
	    (setq aItem  (assoc (symbol-package s) import))
	    (setq bItem  (assoc (symbol-package s) shadowingimport))
	    (unless (and bItem	      ; Don't import if already shadowing Importing
			 (member (symbol-name s) (cdr bItem) :test #'string=))
	      (if aItem
		  (pushnew s (cdr aItem))
	        (push (list (symbol-package s) s) import)))))

	(setq use (mapcar #'package-name use))
	(when sorted-p
	  (setq nicknames (sort nicknames #'string-lessp))
	  (setq use (sort use #'string-lessp))
	  (setq shadow (sort shadow #'string-lessp))
	  (setq shadowingimport
	    (loop for (pkg . syms) in shadowingimport
		collect (cons pkg (sort syms #'string-lessp))))
	  (setq import
	    (loop for (pkg . syms) in import
		collect (cons pkg (sort syms #'string-lessp))))
	  (setq export (sort export #'string-lessp)))
	
	`(defpackage ,(or rename (package-name pkg))
	   ,@(when nicknames `((:nicknames ,@nicknames)))
	   ,@(when use `((:use ,@use)))
	   ,@(when shadow `((:shadow ,@shadow)))
	   ,@(loop for (pkg . syms) in shadowingimport
		   collect `(:shadowing-import-from ,(package-name pkg)
						    ,@(mapcar #'symbol-name syms)))
	   ,@(loop for (pkg . syms) in import
		   collect `(:import-from ,(package-name pkg)
					  ,@(mapcar #'symbol-name syms)))
	   ,@(when export `((:export ,@export)))
	   ) )) ))
	   
	   
	   

(defun load-kb (knowledgeBase &key pathname path-name)
  ;; Read concept definitions from the file associated
  ;;   with "knowledgeBase"
  (setq knowledgeBase (coerce-to-knowledge-base knowledgeBase))
  (let* ((kbPathName (or pathname path-name (path-name knowledgeBase))))
    (load kbPathName)) )


  ;;
;;;;;; "clear-context"
  ;;

(defmacro clear-context (&rest arguments)
  "Clear (obliterate) all objects in the specified `partitions'
  of the specified context (or of the current context, if no context
  is specified)."
  ;; The keyword ":partitions" indicates what partitions are to be
  ;;    used, while the optional parameter "context" indicates
  ;;    what context to use;
  ;; The keyword ":fast-p" indicates that the objects are to be
  ;;    removed from the symbol table without taking the time to
  ;;    deleted pointers to them -- there are no guarantees of
  ;;    context consistency if this option is specified;
 #+(or (not :lucid) :lcl3.0)	
  (declare (arglist &optional context
		    &key :partitions :dont-reset-matcher-p :fast-p))
  (multiple-value-bind (context options)
      (KBCLASSES::separate-optional&key-arguments 
	arguments '(:partitions :dont-reset-matcher-p :fast-p) "clear-context")
    (setq context (first context))
    `(within-context *context*          ;  TAR 6/17/94 Preserve current value!
       (clear-context-sublattice
        ,context
        ',(getf options :partitions)
        :dont-reset-matcher-p ,(getf options :dont-reset-matcher-p)
        :fast-p ,(getf options :fast-p))) ))

(defun clear-context-sublattice
       (context partitionNames &key dont-reset-matcher-p fast-p)
  ;; Clear the name-spaces belonging to "context"; if
  ;;    "context" is nil, use *context*;
  ;; Recursively clear all children of "context";
  ;; Clear all partitions if "partitionNames" is NIL;
  ;;    otherwise, clear the indicated partitions;
  ;; The objects belonging to "context" are not destroyed,
  ;;    but they may be lost if nothing else points to them;
  ;; NOTE: CALLERS ARE RESPONSIBLE FOR PRESERVING THE VALUE OF *CONTEXT*!
  ;;    THIS IS A SPEED OPTIMIZATION, SINCE OTHERWISE THERE ARE TOO MANY
  ;;    RESTORE OPERATIONS WHEN DESCENDING THE CONTEXT TREE!!!
  (let (alreadyClearedContexts)
    (labels ((help-clear-contexts (context)
	       ;; Clear "context" and its children, recursively;
	       (push context alreadyClearedContexts)	      
	       (loop for childContext in (child-contexts context)
		     unless (or (eq partitionNames :instances)
				(member childContext alreadyClearedContexts)
                                (null (ctxt childContext)))
		     do (help-clear-contexts childContext))
	       (clear-one-context context partitionNames fast-p dont-reset-matcher-p) ))
      (setq context (coerce-to-context context))
      (delf *top-level-unclassified-concepts* 'CHOKE-ON-THIS)
;; ELIMINATE THE CHANGE BACK FOR EXTRA SPEED!
;      (unwind-protect (help-clear-contexts context) 
;        (change-context savedContext))
      (help-clear-contexts context)

;      (setq *list-of-uninterned-concepts*
;	    (delete-if #'garbage-concept-p *list-of-uninterned-concepts*))
      (when (intersection '(:concepts :relations) (list-of partitionNames))
	(setq *list-of-uninterned-concepts* nil))
      (when (or *top-level-unclassified-concepts* 
		(not (zerop *count-of-unclassified-concepts*)))
	(setq *top-level-unclassified-concepts* 
	      (delete-if #'garbage-concept-p *top-level-unclassified-concepts*))
	(setq *count-of-unclassified-concepts*
	      (length (list-unclassified-concepts))))
      (setq *top-level-uncompleted-concepts*
	    (delete-if #'garbage-concept-p *top-level-uncompleted-concepts*))
      (setq *top-level-unsealed-concepts*
	    (delete-if #'garbage-concept-p *top-level-unsealed-concepts*)) 
      (setq *modified-inherit-fillers-relations*    ; TAR 4/4/95
	(delete-if #'garbage-concept-p *modified-inherit-fillers-relations*))
      ;; clear out any dangling pointers to deleted instances
      (unless fast-p			; unless called by "initialize-network"
	(clear-deleted-instances))
;; NEW DISCARD TESTING SHOULD MAKE THIS UNNECESSARY:
;      (clear-discards-from-recognition-queues)
;      (clear-discards-in-rete&production-memory)
;      (clear-deleted-instances-from-rete-queue )
      (clear-discards-from-history-queues)
      (clear-get-instance-cache)
      context )))

(defun clear-deleted-instances ()
  ;; Helping function for "clear-context-sublattice";
  ;; Remove any deleted instances that still exist somewhere in a
  ;;   "local-instances" slot;
  (map-transitively
   (loom-constant Thing) sub-concepts
   (lambda (self)
     (let ((*current-ctxt* (or (home-ctxt self) *current-ctxt*)))
       (execute-in-contexts-depth-first
	(do-local-instances (i self)
	  (when (discarded-p i)		; RMM 5/10/94
	    (remove-from-local-instances self i))))))
   :pruning-test
   (lambda (self) (not (subconcept-p self (loom-constant CONSTANT))))
   :use-pass-counter t) )

(defun clear-discards-from-recognition-queues ()
  ;; Helping function for "clear-context-sublattice";
  ;; Eliminate any discarded concepts from the match queues;
  ;; Note: If things worked perfectly, we shouldn't need this, but they don't;
  (loop for i from 0 to 3
       do (setf (aref *match-queues* i) 
		(delete-if
		  #'(lambda (self)
		      (and (concept-p self)
			   (member :discarded (system-attributes self))))
		  (aref *match-queues* i)))) )

;; CALL THIS FROM "clear-context-sublattice" IF ITS NOT TOO SLOW:
;(defun clear-discards-in-rete&production-memory ()
;  ;; Clear out deleted instances from rete node memories;
;  ;; This is unnessary if "forget-all-about" does its job, but if
;  ;;    Loom is broken in the middle processing, this is needed to
;  ;;    fix things up;
;  (flet ((safe-discarded-p
;	   (self)
;	   (and (classified-instance-p self)
;		(discarded-p self))))
;    ;; prevent bootstrapping problems
;    (when (null *thing*)
;      (return-from clear-discards-in-rete&production-memory nil))
;    (do-concepts (concept)
;      (when (rete-node concept)
;	(let ((hashTable (rete-instance/support-table (rete-node concept)))
;	      (deletedInstances nil))
;	  ;; clear deleted instances from rete memory:
;	  (maphash #'(lambda (key value)
;		       (declare (ignore value))
;		       (when (safe-discarded-p key)
;			 (push key deletedInstances)))
;		   hashTable)
;	  (loop for instance in deletedInstances
;	       do (remhash instance hashTable)))
;	(loop for cohort in (rete-if-added-cohorts (rete-node concept))
;	     do
;	     (setf (stored-input-binding-sets cohort)
;		   (delete-if #'safe-discarded-p
;			      (stored-input-binding-sets cohort))))
;	(loop for cohort in (rete-if-removed-cohorts (rete-node concept))
;	     do
;	     (setf (stored-input-binding-sets cohort)
;		   (delete-if #'safe-discarded-p
;			      (stored-input-binding-sets cohort))))))
;    (loop for production in (list-productions)
;	 do
;	 (setf (output-binding-sets production)
;	       (delete-if #'(lambda (bindingSet)
;			      (loop for item in bindingSet
;				   thereis (safe-discarded-p item)))
;			  (output-binding-sets production)))) ))

;; THIS SHOULDN'T BE NEEDED IF "forget-all-about" DOES ITS JOB:
;(defun clear-deleted-instances-from-rete-queue ()
;  ;; Helping function for "clear-context-sublattice";
;  ;; Eliminate deleted instances from rete queue;
;  (setf *list-of-modified-rete-instances* 
;	(delete-if
;	  #'(lambda (self)
;	      (discarded-p self))
;	  *list-of-modified-rete-instances*)) )

(defun clear-one-context (context partitionNames fastP dont-reset-matcher-p)
  ;; Clear the name-spaces belonging to "context";
  ;; Clear all partitions if "partitionNames" is NIL;
  ;;    otherwise, clear the indicated partitions;
  ;; If "fastP" is NIL, some clear operations are very careful to
  ;;    avoid creating dangling pointers; Otherwise, objects are
  ;;    removed quickly from name spaces without checking;
  ;; The objects belonging to "context" are not destroyed,
  ;;    but they may be lost if nothing else points to them;
  ;; Caution: "fastP" is dangerous -- its called by "initialize-network", but
  ;;    nothing else should use it;
  (let* ((partitions (collect-partitions context partitionNames))
         (destroyTBoxConstantsP (find-partition :concepts partitions)))
    (when (and (eq (name context) 'BUILT-IN-THEORY)
               (not fastP))
      ;; don't clear the built-in theory (or Thing will disappear)
      ;;    unless we are called from "initialize-network"
      (return-from clear-one-context nil))
    ;; copy state history of current context (so that the times are legal):
    (save-history-state context)
    ;;    and then clobber most of the history information:
    (clear-history-state context)
    (change-context context)
    (if fastP
      (progn
        (when (find-partition :relations partitions)
          (loop for r in (list-context context :partitions :relations)
               do 
               (unseal-predicate-symbol r)
               (unbind-predicate-symbol r))
          (loop for c in (list-context context :partitions :concepts)
               do 
               (unbind-predicate-symbol c)
               (unlink-clos-class-from-concept c)))
        (loop for p in partitions do (clear-one-partition p))
        (fill *match-queues* nil))
      (progn
        ;; Note: The :instances partition is guaranteed to come first;
        (loop for p in partitions
             do
             (case (partition-identifier p)
               ((:concepts :relations)
                (detach-tbox-concepts p))
               (:instances
                (detach-database-instances 
                 p
                 :destroy-tbox-constants-p 
                 destroyTBoxConstantsP))
               (:behaviors                
                (detach-behavior-objects p)
		;; in a better world, this wouldn't be necessary:
                (setq *list-of-uncompiled-productions*
		  (delete context *list-of-uncompiled-productions* :key #'context))))
             (clear-one-partition
              p
              :preserve-tbox-constants-p
              (and (eq (partition-identifier p) :instances)
                   (not destroyTBoxConstantsP))))
        ;; get every last one of them:
        (loop for p in partitions
              when (member (partition-identifier p)
                         '(:concepts :relations))
              do (detach-tbox-concepts p))
        (unless dont-reset-matcher-p
          (reset-matchers)))) ))

(defun clear-one-partition (partition &key preserve-tbox-constants-p)
  ;; Remove identifiers from the name space of "partition", and
  ;;    zero-out the list of uninterned objects;
  ;; Note: This code takes advantage of the fact that clearing
  ;;    lists and a doubly-linked heap index is identical as long as
  ;;    we don't care about eliminating the links from instances back
  ;;    into the heap;
  (if preserve-tbox-constants-p	
      (let (tboxConstants)			; :instances partition
	(do-context-partition (nil self partition :skip-anonymous-instances-p t)
	  (when (or (typep self 'TBOX-CONCEPT)       ; RMM 12/10/92
                    (and (not (constant-p self))     ; constant merged w/skolem
			 ;; NEED TO UPGRADE:
;			 (member :tbox-constant (db-attributes self))
			 ))
	    (push self tboxConstants)))
	(clrhash (name-space partition))
	(loop for instance in tboxConstants
	     do (add-identifier-to-name-space 
		  (identifier instance) instance
		  (name-space partition))))
      (clrhash (name-space partition)))
  (setf (anonymous-objects partition) nil))

(defun detach-database-instances (instancesPartition &key destroy-tbox-constants-p)
  ;; Helping function for "clear-one-context";
  ;; For each database instance in "instancesPartition", forget all about it;
  ;; We are careful to step outside of the current world to do our
  ;;    forgetting;
  (do-context-partition (nil self instancesPartition)
    (when (and (not (meta-thing-p self))
               (not (constant-p self)))       ; constant merged w/skolem
      (forget-instance&history
       self :destroy-tbox-constant-p destroy-tbox-constants-p)))
  )

  ;;;
;;;;;;;  LOOM version information for debugging:
  ;;;

(defun get-version-string ()
  "Returns a string identifying the current LOOM implementation."
  (flet ((return-only-one-line (string)
	   (subseq string 0 (or (position #\Return string :test #'char=)
				(position #\Newline string :test #'char=)))))
    (let ((softwareVersion (return-only-one-line
			     (software-version #+TI nil)))
          (softwareType (software-type))
	  (lispVersion (return-only-one-line
			 (lisp-implementation-version #+TI nil))))
      (when (string= softwareVersion "") (setq softwareVersion "??"))
      (when (string= lispVersion "") (setq lispVersion "??"))
      (when (string= softwareType softwareVersion) (setq softwareType "")) ; Mac
      (format nil "LOOM ~A (~A), patch ~D (~A) [~A]  ~D ~A~:[~; Safe~]~:[~; Units~]~%~
                ~A ~:[version ~;~]~A~%~A ~:[version ~;~]~A~%~A"
	      *release-version*
	      *release-date*
	      *patch-level*
	      *patch-date*
	      *release-status*
              (vectorize-features)
              (power-level)
              (safe-mode)
	      #+:measures t #-:measures nil
	      (lisp-implementation-type)
	      (search "version" lispVersion :test #'char-equal)
	      lispVersion
	      softwareType
	      (search "version" softwareVersion :test #'char-equal)
	      softwareVersion
	      *copyright-notice*
	      ) )))
  
(defun get-version ()
  "Returns 4 values: (1) a float identifying the current LOOM version,
                  (2) an integer identifying the current LOOM patch level
                  (3) a symbol describing the release status {:released :alpha :beta :experimental}
                  (4) the year of copyright by University of Southern California."
  (values *release-version* *patch-level* *release-status* *copyright-year*) )
