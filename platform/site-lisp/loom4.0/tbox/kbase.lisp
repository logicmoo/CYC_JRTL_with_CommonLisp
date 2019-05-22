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

;;; KBASE.LISP (TBOX)

;;; Knowledge Base functions

(in-package "LOOM")

(export '( find-kb defkb list-kb destroy-kb current-kb
           list-knowledge-bases export-knowledge-base-names
           in-kb change-kb clear-kb))


  ;;
;;;;;;  Knowledge-base/Name-space functions
  ;; 

#+CLTL2 (declaim (inline string-find-kb find-kb))
#-CLTL2 (proclaim '(inline string-find-kb find-kb))

(defun string-find-kb (knowledgeBaseStringName match)
  ;; Called by "find-kb" and "help-parse-extended-identifier";
  ;; Return the knowledge base whose name matches the
  ;;    string "knowledgeBaseStringName";
  (let* ((testFn (generate-match-function knowledgeBaseStringName match)))
    (loop for (name . kb) in *knowledge-base-table*
	when (funcall testFn name)
	collect kb) ))

(defun find-kb (knowledgeBaseOrName &key (match :case-insensitive))
  "Return the knowledge base whose name matches `knowledgeBaseOrName'.
Symbolic names are coerced to strings."
  (let ((kb (typecase knowledgeBaseOrName
	      (SYMBOL (string-find-kb (symbol-name knowledgeBaseOrName) match))
	      (STRING (string-find-kb knowledgeBaseOrName match))
	      (KNOWLEDGE-BASE knowledgeBaseOrName)
	      (otherwise (grumble "Argument ~A to `find-kb' must be a symbol, string, or
knowledge base" knowledgeBaseOrName)))))
    (cond ((atom kb) kb)
	  ((null (cdr kb)) (first kb))
	  (t kb)) ))

(defun get-context-from-kb (kb)
  (first (contexts kb)) )

(defun make-get-context-from-kb (kb)
  (if (symbolp kb)
      `(get-context-from-kb (find-kb ',kb))
      `(get-context-from-kb ,kb)))

  ;;
;;;;;; User-Friendly Knowledge Base Functions
  ;;

(defmacro defkb (name parentKbs &key pathname path-name package-name creation-policy
                       export-names-p)
   "Create a new knowledge base called `kbName' with parents `parentKbs'."
  `(define-kb ',name ',parentKbs
     :path-name ',(or pathname path-name) :package-name ',package-name
     :creation-policy ,creation-policy :export-names-p ,export-names-p) )

(defmacro list-kb (&rest arguments)
  "Return a list of objects in the specified `partitions' of the knowledge base
      named `knowledgeBase'.
   The :partitions keyword indicates what partitions are to be
       retrieved, while the optional parameter `knowledgeBase' indicates
       what knowledge base to use.
   Setting the keyword :sort-p to t causes the result to be sorted.  Setting
       :sort-p to :sort-each-partition causes individual partitions to be sorted."
  #+(or :lcl3.0 (and (not :lucid) (not :xerox)))
  (declare (arglist &optional knowledgeBase &key :partitions :sort-p))
  (multiple-value-bind (knowledgeBase options)
      (separate-optional&key-arguments arguments '(:partitions :sort-p) "list-kb")
    (setq knowledgeBase (car knowledgeBase))
    `(list-knowledge-base-objects
       ,(getf options :partitions)
       (coerce-to-knowledge-base ,knowledgeBase :dont-break-p t)
       ,(when (getf options :sort-p)
	    ''sort-each-partition)) ))

;; Helping function for finding a knowledge base:
(defun coerce-to-knowledge-base (knowledgeBaseOrNameOrNull &key dont-break-p)
  ;; Return a knowledge base corresponding to "knowledgeBaseOrNameOrNull";
  (let (kb (errorP nil))
    (setq kb
	  (cond
	    ((null knowledgeBaseOrNameOrNull)
             (loop for kb in (list-knowledge-bases)
                   when (eq (first (contexts kb)) *context*)
                     return kb
                   finally (if dont-break-p
		             (setq errorP t)
		             (error "Can't find a knowledge base associated with ~S" *context*))))
	    ((or (symbolp knowledgeBaseOrNameOrNull)
		 (stringp knowledgeBaseOrNameOrNull))
	     (or (find-kb knowledgeBaseOrNameOrNull)
		 (if dont-break-p
		     (setq errorP t)
		     (error "Non-existent knowledge base ~S" knowledgeBaseOrNameOrNull))))
	    (t
	     (when (not (typep knowledgeBaseOrNameOrNull 'KNOWLEDGE-BASE))
	       (if dont-break-p
		   (setq errorP t)
		   (error "The object ~S is not a knowledge base"
			  knowledgeBaseOrNameOrNull)))
	     knowledgeBaseOrNameOrNull)))
    (values kb errorP) ))


  ;;
;;;;;; Functions to create and destroy knowledge bases
  ;;

(defun define-kb (name parentKbs &key path-name package-name creation-policy
                       export-names-p)
  ;; Create a new knowledge base called "name";
  ;; Keyword options are ":path-name", ":package", and ":export-names-p."
  (setq name (validate-kb-name name))
  (let* ((oldKB (find-kb name))
         (identifier (intern name "LOOM"))
         (redefiningCurrentKBp (and oldKB
                                    (member *context* (contexts oldKB))))
         (homeContext (get-context 'BUILT-IN-THEORY))
	 (newKB (or oldKb
                    (create identifier 'KNOWLEDGE-BASE
                            :context homeContext
                            :clos-instance-p t))))
    (when export-names-p
      (grumble "The `export-names-p' option for knowledge bases is obsolete.
Call the function `export-knowledge-base-names' to export the names of
instances in all contexts of a knowledge base."))
    ;; destroy old knowledge base and its children recursively if
    ;;    an old knowledge base with the same name exists
    (when oldKB
      (destroy-kb oldKB)
    ;; Note that since we recycle an old destroyed KB, we need to rerun
    ;;   the initialization code to set things up properly;     ;tar 11/8/93
      (coerce&initialize-clos-instance newKB identifier homeContext))
    ;; assure that "parentKbs" is a list:
    (when (not (listp parentKbs))
      (setq parentKbs (list parentKbs)))
    
    (setf (name newKB) name)
    ;; record the package associated with this knowledge base
    (when package-name                                                     
      (setq package-name                                                
	    (if (symbolp package-name)
              (symbol-name package-name)   
              (string-upcase package-name))))                  
    (setf (kb-package-name newKB) (or package-name
                                      (package-name *package*)))
    ;; assign its parents (which are still symbols at this point)
    (setf (parent-kbs newKB) parentKbs)
    (setf (path-name newKB) path-name)
    (setf (kb-creation-policy newKb) creation-policy)
    ;; finish the initialization
    (initialize-knowledge-base newKb)
    (when redefiningCurrentKBp
      ; kb containing current context was destroyed, create a new context:
      (change-kb newKb))
    newKB ))

(defun validate-kb-name (name)
  ;; Return a knowledge base name corresponding to "name";
  (cond 
   ((stringp name)
    (string-upcase name))
   ((symbolp name)
    (symbol-name name))
   (t 
    (error "Funny knowledge base name ~A" name))) )

(defun initialize-knowledge-base (self)
  ;; Convert "parent-kbs" references to real pointers;
  ;; Insure value for "kb-package-name";
  ;; Add "self" to *knowledge-base-table*;
  (flet ((link-from-parent-kb (parentName)
           (let ((parent (find-kb parentName)))
             (if parent
               (push self (child-kbs parent))
               (progn
                 (complain "Can't inherit knowledge base ~S while defining knowledge
base ~S because ~S is undefined.  Abandoning definition of ~S." 
                           parentName (name self) parentName (name self))
                 (return-from initialize-knowledge-base nil)))
             parent)))
    (setf (child-kbs self) nil)			; tar 4/1/93
    (setf (parent-kbs self)
          (loop for parentName in (parent-kbs self)
               collect (link-from-parent-kb parentName)))
    ;; if "(kb-package-name self)" is nil, assign the name of the
    ;;    current package
    (unless (kb-package-name self)
      (setf (kb-package-name self) (package-name *package*)))
    ;; remove obsolete knowledge base object from *knowledge-base-table*
    (delf-assoc *knowledge-base-table* (name self) :test #'equal)
    ;; add new knowledge base object to *knowledge-base-table*
    (addf-assoc *knowledge-base-table* (name self) self :test #'equal)
    )) ;; end "initialize-knowledge-base"

(defun destroy-kb (kbOrName)
  "Destroy the knowledge base `kbOrName' and all kbs below it."
  (let ((kb (find-kb kbOrName)))
    (when (null kb)
      (complain "~%Can't destroy non-existent knowledge base ~S" kbOrName)
      (return-from destroy-kb nil))
    (loop for child in (child-kbs kb)
         do (destroy-kb child))
    (destroy-one-knowledge-base kb)
    kb ))

(defun destroy-one-knowledge-base (kbOrName)
  ;; Wipe out the knowledge base "kbOrName";
  (let ((kb (find-kb kbOrName)))
    (loop for cxt in (contexts kb)
          do (destroy-context cxt))
    (setq *knowledge-base-table*
          (delete kb *knowledge-base-table* :key #'cdr))
    (when (discarded-p kb)
      (return-from destroy-one-knowledge-base nil))
    (forget-instance&history kb)
    ;(forget-all-about kb)	; Done in previous call! tar 4/1/93
    ))

(defun destroy-all-knowledge-bases ()
  ;; Wipe out top-level access to knowledge bases;
  ;; Note: This is only called during reloading of
  ;;    the "coda.lisp" file;
  (loop for entry in *knowledge-base-table*
        do (destroy-one-knowledge-base (cdr entry))) )


  ;;
;;;;;; Knowledge Base manipulation functions
  ;;

(defun list-knowledge-bases ()
  ;; Return a list of all knowledge bases
  (list-of-assoc *knowledge-base-table*) )

(defun current-kb ()
  (obsolete current-kb current-context)
  (coerce-to-knowledge-base nil))

(defun reset-current-knowledge-base (knowledgeBase)
  ;; Retrofit of now obsolete functionality;
  ;; Call to "change-kb" is interpreted as call to "change-context", where
  ;;    the new context is interpreted to be the unique context belonging
  ;;    to the kb "knowledgeBase";
  (flet ((find-or-create-parent-contexts ()
           (if (null (parent-kbs knowledgeBase))
             (list (find-context 'BUILT-IN-THEORY))
             (progn                     ; RMM 4/1/94
               (loop for parentKB in (parent-kbs knowledgeBase)
                     collect
                     (progn
                       (reset-current-knowledge-base parentKB)
                       (first (contexts parentKB))))))))
    (when (rest (contexts knowledgeBase))
      (grumble "Can't reset the current context using `in-kb' or `change-kb' 
because the knowledge base ~S has two or more contexts." (name knowledgeBase))
      (return-from reset-current-knowledge-base nil))
    (when (null (contexts knowledgeBase))
      (let* ((kbName (name knowledgeBase))
             (suffixIndex (search "-KB" kbName))
             (cxtName kbName))
        (when (and suffixIndex
                   (= (+ suffixIndex 3) (length kbName)))
          (setq cxtName (subseq kbName 0 suffixIndex))    ; strip "-KB"
          (setq cxtName (string-append cxtName "-THEORY")))     ; add "-THEORY"
        (setq cxtName (intern cxtName (or (kb-package-name knowledgeBase)
                                          *package*)))
        (push
         (or (find-context cxtName)
             (define-context 
                 cxtName :theory
                 (find-or-create-parent-contexts)
                 :creation-policy (or (kb-creation-policy knowledgeBase)
                                      :lite-instance)))
         (contexts knowledgeBase))))
    (change-context (first (contexts knowledgeBase))) ))
      
(defmethod generate-object-definition ((self KNOWLEDGE-BASE) &key &allow-other-keys)
  ;; Generate a definition of the knowledge-base "self";
  ;; Note: The augmented definition is the same as the unaugmented (legal) one;
  `(defkb
     ,(name self)
     ,@(loop for parentKb in (parent-kbs self)
	     collect (name parentKb))
     :package ,(kb-package-name self)
     :path-name ,(path-name self)) )

(defun export-knowledge-base-names (knowledgeBaseOrName)
  "Place names of all objects belonging to `knowledgeBaseOrName' on package
export list(s)."
  (let ((kb (find-kb knowledgeBaseOrName)))
    (loop for cxt in (contexts kb)
          do (export-names-in-context cxt)) ))


  ;;
;;;;;; Generate list of knowledge base objects
  ;;

(defun list-knowledge-base-objects (partitionIds knowledgeBase sort)
  ;; Returns list of all instances in the contexts indicated by
  ;;    "partitionIds" in the knowledge base "knowledgeBase"
  ;; Possible values for "sort" are:
  ;;    nil  - unsorted
  ;;    t    - sort everything
  ;;    :sort-each-partition
  (setq knowledgeBase (find-a-kb knowledgeBase))
  (when (null knowledgeBase)
    (return-from list-knowledge-base-objects
      (list-context)))
  (flet ((list-kb-partition (partitionId sortP)
           (let ((result
                  (loop for cxt in (contexts knowledgeBase)
                       append (list-context-objects cxt partitionId nil))))
             (when sortP
               (setq result (sort result #'string-lessp :key #'object-name)))
             result)))
    (let ((partitions (collect-partitions 
                       (get-context 'BUILT-IN-THEORY) partitionIds))
          (sortPartitionP (eq sort :sort-each-partition))
          result)
      (setq partitionIds
            (loop for p in partitions collect (partition-identifier p)))
      (setq result
            (loop for id in partitionIds
                 append (list-kb-partition id sortPartitionP)))
      (when (and sort (not sortPartitionP))
        (setq result (sort result #'string-lessp :key #'object-name)))
      result )))


  ;;
;;;;;; 2.0 Compatibility functions
  ;;

;; THESE FUNCTIONS ARE NOW OBSOLETE, BUT ARE RETAINED FOR COMPATIBILITY
;;    WITH Loom2.0

(defmacro in-kb (kbName)
  "Now obsolete.  Reset the current context to the (unique) context belonging
  to `kbName'.  Unlike `change-kb', `in-kb' evaluates at compile and load time.
  It can only appear at top-level in a Lisp program."
  (when (quoted-p kbName)
    (setq kbName (second kbName)))
  (make-top-level-form
    `(in-kb ,kbName)
    '(compile load eval)
    `(change-kb ',kbName)) )

;; TO DO: CONSIDER MOVING "reset-current-knowledge-base" DOWN HERE AND
;;    POSSIBLY RENAMING IT:
(defun change-kb (kbName &key no-checking-p)				
  "Now obsolete.  Reset the current context to the (unique) context belonging
  to `kbName'."
  (when no-checking-p
    ;; assumes "kbName" is an object;
    (reset-current-knowledge-base kbName)
    (return-from change-kb kbName))
  (let ((newKnowledgeBase (coerce-to-knowledge-base kbName)))
    (reset-current-knowledge-base newKnowledgeBase)
    newKnowledgeBase ))

(defmacro clear-kb (&rest arguments)
  "Now obsolete.  Clear (obliterate) all objects in the specified `partitions'
  of the (unique) context belonging to the specified knowledge base."
  (multiple-value-bind 
    (kbRef options)
    (KBCLASSES::separate-optional&key-arguments 
     arguments '(:partitions :dont-reset-matcher-p :fast-p) "clear-kb")
    (setq kbRef (first kbRef))
    `(let* ((knowledgeBase (coerce-to-knowledge-base ,kbRef)))
       (when knowledgeBase
         (clear-context
          (first (contexts knowledgeBase))
          ,@options))
       *context*) ))

(defun define-shadowing-kb (kbName contextName &key path-name)
  ;; Called by "call-use-loom";
  ;; Define a kb named "kbName" and insert the context with name
  ;;    "contextName" in it and return the new kb;
  (let ((kb (or (find-kb kbName)
                (define-kb kbName nil :path-name path-name))))
    (pushnew (get-context contextName) (contexts kb))
    kb) )

(defun get-kb-with-context (context &key error-p)
  ;; Return a/the knowledge base that owns the context "context";
  (or (loop for kb in (list-knowledge-bases)
            when (member context (contexts kb))
            return kb)
      (progn
        (when error-p
          (complain "~%Can't find a knowledge base for the context ~S"
                    (name context)))
        nil)) )

(defun find-a-kb (nameOrNil)
  ;; Return the kb with name "nameOrNil", or the kb corresponding
  ;;    to the current context;
  (or (find-kb nameOrNil)
      (get-kb-with-context *context*)) )
      
        
      

;; TO DO:
#|
|#
