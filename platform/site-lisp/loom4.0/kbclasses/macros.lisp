;;; -*- Mode:Common-Lisp; Package:KBCLASSES; Base:10 -*-

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
 

;;; MACROS.LISP (KBCLASSES)

;;; This file is the second of the KB-CLASSES files to be read.  It contains
;;;    macro definitions used by both the KBCLASSES and LOOM code.  It
;;;    is loaded up front to insure that the macro definitions precede
;;;    all references to them.

(in-package "KBCLASSES")

;; Export (to the LOOM package) symbols defined below:
(export
  '( *kbclasses-dialogue-features*
     get-names-of-supers get-names-of-slots get-names-of-direct-slots def-class
    list-of assoc-list-of list-of-assoc key-list-of-assoc
    set-equal-p addf-assoc delf-assoc removef-assoc
    addf delf removef remove-members removef-members
    add-link del-link add-link-or-value del-link-or-value    
    map-transitive-relation append-transitive-relation search-transitive-relation
    reparameterized-body-of-lambda-expr 
    map-slots-macro
    remove-suffix remove-keyword-colon prepend-keyword-colon
    normalized-3-valued-truth-value true false unknown yes no 3-valued-not
    get&remf separate-optional&key-arguments
    trace-values say
    with-speed
    generate-match-function
    def-bit-flags set-bit-flags clear-bit-flags test-bit-flags expand-bit-flags
    def-bit-accessor
    ))


  ;;
;;;;;;  Global Variable Definitions
  ;;


;; Look-up tables for KBCLASSES classes and slots:
(defparameter *kbclasses-class-table* nil)
(defparameter *kbclasses-slot-table* nil)

;;; Switches for controlling output
(defparameter *kbclasses-dialogue-features* (list :emit-warnings))


  ;;
;;;;;; List and Assoc-list conversion
  ;;

(defmacro list-of (self &key also-coerce-hash-table)
  ;; Coerce "self" into a list;
  (once-only (self)
    `(cond
      ((listp ,self) ,self)
      ,@(when also-coerce-hash-table
	    `(((hash-table-p ,self) (coerce-hash-table-to-value-list ,self))))
      (t (list ,self))) ))

(defun key-list-of-assoc (self)
  ;; Return the key (car) of each member of "self";
  (cond
    ((listp self)
     (loop for item in self collect (car item)))
    ((hash-table-p self)
     (coerce-hash-table-to-key-list self))) )

(defun assoc-list-of (self)
  ;; Coerce "self" into an assocation list:
  ;;    If "self" is a list, associate each member with its key;
  ;;    If "self" is a hash table, the association is that found in the table;
  (if (hash-table-p self)
      (coerce-hash-table-to-assoc-list self) 
      (loop for item in (list-of self) collect (cons (LOOM::key item) item))) )

(defun list-of-assoc (self)
  ;; Return the cdr of each member of "self";
  (cond
    ((listp self)
     (loop for item in self collect (cdr item)))
    ((hash-table-p self) (list-of self :also-coerce-hash-table t))) )

(defun coerce-hash-table-to-value-list (hashTable)
  (let (resultList)
    (maphash #'(lambda (key value)
		 (declare (ignore key))
		 (push value resultList))
	     hashTable)
    resultList ))

(defun coerce-hash-table-to-key-list (hashTable)
  (let (resultList)
    (maphash #'(lambda (key value)
		 (declare (ignore value))
		 (push key resultList))
	     hashTable)
    resultList ))

(defun coerce-hash-table-to-assoc-list (hashTable)
  (let (resultAssocList)
    (maphash #'(lambda (key value)
		 (push (cons key value) resultAssocList))
	     hashTable)
    resultAssocList ))


  ;;
;;;;;; KBCLASSES look-up functions
  ;;
  
(defun get-class (identifierOrClass)
  ;; Return the KBCLASSES class with name "identifierOrClass";
  (if (symbolp identifierOrClass)
      (cdr (assoc identifierOrClass *kbclasses-class-table*))
      identifierOrClass) )

(defun get-slot (identifierOrSlot)
  ;; Return the KBCLASSES slot with name "identifierOrSlot";
  ;; Note: Only the most general slots get placed in the index;
  (if (symbolp identifierOrSlot)
      (cdr (assoc identifierOrSlot *kbclasses-slot-table*))
      identifierOrSlot) )

(defun add-kbclasses-class-to-index (class)
  ;; Add (or replace) "class" into the table of KBCLASSES classes;
  (let* ((name (name class))
	 (oldEntry (assoc name *kbclasses-class-table*)))
    (if oldEntry
       (setf (cdr oldEntry) class)
       (push (cons name class) *kbclasses-class-table*)) ))

(defun remove-kbclasses-class-from-index (classOrName)
  ;; Remove the entry for the class with name "classOrName",
  ;;    or the entry containing the class "classOrName"
  (let* ((name (if (symbolp classOrName) classOrName (name classOrName)))
	(oldEntry (assoc name *kbclasses-class-table*)))
    (when (and oldEntry
	       (or (symbolp classOrName)
		   (eq classOrName (cdr oldEntry))))
      (setq *kbclasses-class-table*
	    (delete oldEntry *kbclasses-class-table*)))
    (cdr oldEntry) ))

(defun add-kbclasses-slot-to-index (slot)
  ;; Add (or replace) "slot" into the table of KBCLASSES slots;
  (let* ((name (name slot))
	 (oldEntry (assoc name *kbclasses-slot-table*)))
    (if oldEntry
       (setf (cdr oldEntry) slot)
       (push (cons name slot) *kbclasses-slot-table*)) ))

(defun remove-kbclasses-slot-from-index (slotOrName)
  ;; Remove the entry for the slot with name "slotOrName",
  ;;    or the entry containing the slot "slotOrName"
  (let* ((name (if (symbolp slotOrName) slotOrName (name slotOrName)))
	(oldEntry (assoc name *kbclasses-slot-table*)))
    (when (and oldEntry
	       (or (symbolp slotOrName)
		   (eq slotOrName (cdr oldEntry))))
      (setq *kbclasses-slot-table*
	    (delete oldEntry *kbclasses-slot-table*)))
    (cdr oldEntry) ))

(defun class-of (self)
  ;; Return the kbclasses class of which "self" is an instance;
  (let ((className (CLOS::class-name (CLOS::class-of self))))
    (or (get-class className)
	(error "Couldn't find KBClass for object ~S~%   Its CLOS class is named ~S"
	    self (CLOS::class-name (CLOS::class-of self)))) ))


  ;;
;;;;;; "get-names-of-supers" and "get-names-of-slots"
  ;;

;; TO DO: THIS WORKS FOR THE MAC -- SEE IF ITS WORKS FOR LUCID & PCL:
#-:cmu18
(defun get-names-of-supers (closClass)
  ;; Return a list of the names of direct superclasses of "closClass";
  (loop for c in (CLOS::class-direct-superclasses closClass)
      collect (CLOS::class-name c)) )

#+:cmu18
(defun get-names-of-supers (closClass)
   ;; Return a list of the names of direct superclasses of "closClass";
   (loop for c in (MOP:class-direct-superclasses closClass)
 	collect (MOP:class-name c)) )

#+(and :CCL-2 (not :openmcl-mop-2))
(progn
  (defun CLOS::class-slots (closClass)
    (append (CLOS::class-instance-slots closClass)
            (CLOS::class-class-slots closClass)))
  (defun CLOS::class-direct-slots (closClass)
    (append (CLOS::class-direct-instance-slots closClass)
            (CLOS::class-direct-class-slots closClass)))
  ;(defun CLOS::slot-definition-name (slot) (first slot))
  )
#+(and :PCL (not (and :CMU :new-compiler)) (not :lispworks))
(defun CLOS::slot-definition-name (slot) (CLOS::slotd-name slot))

#-:cmu18
(defun get-names-of-slots (closClass)
  ;; Return a list of the names of the local slots for "closClass";
  (when (symbolp closClass)
    (setq closClass (CLOS::find-class closClass)))
  (loop for closSlot in (CLOS::class-slots closClass)
      collect (CLOS::slot-definition-name closSlot)) )

#+:cmu18
(defun get-names-of-slots (closClass)
   ;; Return a list of the names of the local slots for "closClass";
   (when (symbolp closClass)
     (setq closClass (find-class closClass)))
   (loop for closSlot in (MOP:class-slots closClass)
         collect (MOP:slot-definition-name closSlot)) )


#-:cmu18
(defun get-names-of-direct-slots (closClass)
  ;; Return a list of the names of the local slots for "closClass";
  (when (symbolp closClass)
    (setq closClass (CLOS::find-class closClass)))
  (loop for closSlot in (CLOS::class-direct-slots closClass)
      collect (CLOS::slot-definition-name closSlot)) )

#+:cmu18
(defun get-names-of-direct-slots (closClass)
  ;; Return a list of the names of the local slots for "closClass";
  (when (symbolp closClass)
    (setq closClass (find-class closClass)))
  (loop for closSlot in (MOP:class-direct-slots closClass)
        collect (MOP:slot-definition-name closSlot)) )


  ;;
;;;;;;  "def-class" and "defclass"
  ;;

;;; "def-class" is a friendly version of "CLOS:defclass" that automatically
;;;    creates accessor functions, defaults :initform to nil, and
;;;    translates the :allocation :dynamic into :instance (until CLOS
;;;    supports :dynamic slots in a portable way).

(defmacro def-class (&rest definition)
  ;; Construct a CLOS equivalent definition and evaluate it;
  (expand-def-loom-class
    (car definition)
    (cadr definition)				; super-classes
    (caddr definition)) )			; slot definitions 

(defun expand-def-loom-class (name superClasses slotDefinitions)
  ;; Return a form which evaluates to a call to "CLOS::defclass"; 
  ;;    with arguments which will construct the class named "name";
  ;; NOTE: WE WOULD CALL "CLOS::add-named-class", BUT THE GENERATION OF THE
  ;;    INITFUNCTION SLOT IS SO LOW-LEVEL THAT WE REGARD CALLING "CLOS::defclass"
  ;;    AS EQUALLY REASONABLE;
  `(CLOS::defclass 
     ,name ,superClasses
     ,(form-CLOS-slot-definitions 
	(normalize-slot-definitions slotDefinitions))) )

;(defun form-CLOS-slot-definitions (normalizedSlotDefs)
;  ;; Return a list of CLOS slot definitions that correspond to
;  ;;    the KBCLASSES list of slot definitions "kbclassesSlotDefs";
;  ;; Any non-NIL :initform options must be handled specially by "initialize-instance"
;  ;;    function because of different storage methods required for different
;  ;;    sets of Loom's CLOS mixins.  Here, all of the initforms will have NIL
;  ;;    entries.  This does not apply to "def-class" calls!   -- TAR 1/6/94
;  (declare (special *slotInitializationAlist*))
;  (let ((specialInitformHandlingP (boundp '*slotInitializationAlist*)))
;    (flet ((collect-legal-options (options legalOptions)
;	     (loop for tail on options by #'cddr
;		   when (member (car tail) legalOptions)
;		   collect (first tail) 
;		   and collect (second tail)))
;	   (special-slot-init-p (options)
;	     (and specialInitformHandlingP
;		  (eq (getf options :allocation) :context-sensitive))) )
;      (loop for (slotName . slotOptions) in normalizedSlotDefs
;            when (and (special-slot-init-p slotOptions)
;		      (getf slotOptions :initform))    ; non-null  TAR 1/6/94  
;            do (setf *slotInitializationAlist*
;                     (acons slotName (getf slotOptions :initform)
;                            *slotInitializationAlist*))
;	    unless (member (getf slotOptions :allocation) '(:dynamic :none))
;	    collect (progn 
;                      (unless (eql (getf slotOptions :accessor) slotName) ; TAR 11/5/93
;                        (setq slotOptions
;                              `(:accessor ,slotName ,@slotOptions)))
;                      `(,slotName :initform ,(if (special-slot-init-p slotOptions) ; TAR 1/11/94
;						 NIL
;						 (getf slotOptions :initform))
;                                  ,@(if (getf slotOptions :context-sensitive-p);  TAR 12/21/93
;                                      (collect-legal-options 
;				       slotOptions
;				       '(:allocation))
;                                      (collect-legal-options
;                                       slotOptions 
;				       '(:allocation :accessor :reader :writer)))))) )))

(defun form-CLOS-slot-definitions (normalizedSlotDefs)
  ;; Return a list of CLOS slot definitions that correspond to
  ;;    the KBCLASSES list of slot definitions "kbclassesSlotDefs";
  ;; Any non-NIL :initform options must be handled specially by "initialize-instance"
  ;;    function because of different storage methods required for different
  ;;    sets of Loom's CLOS mixins.  Here, all of the initforms will have NIL
  ;;    entries.  This does not apply to "def-class" calls!   -- TAR 1/6/94
  (flet ((collect-legal-options (options legalOptions)
           (loop for tail on options by #'cddr
                 when (member (car tail) legalOptions)
                 collect (first tail) 
                 and collect (second tail))))
    (loop for (slotName . slotOptions) in normalizedSlotDefs
          unless (member (getf slotOptions :allocation) '(:dynamic :none))
          collect (progn 
                    (unless (eql (getf slotOptions :accessor) slotName) ; TAR 11/5/93
                      (setq slotOptions
                            `(:accessor ,slotName ,@slotOptions)))
                    `(,slotName :initform ,(getf slotOptions :initform)
                                ,@(if (getf slotOptions :context-sensitive-p);  TAR 12/21/93
                                    (collect-legal-options 
                                     slotOptions
                                     '(:allocation))
                                    (collect-legal-options
                                     slotOptions 
                                     '(:allocation :accessor :reader :writer)))))) ))

(defun normalize-slot-definitions (slotDefinitions)
  ;; Return a list of slot definitions for which each definition
  ;;    is a list headed by a name, followed by a list of options;
  (loop for slotDef in slotDefinitions
	collect (list-of slotDef)) )

(defun form-CLOS-class (name superClasses kbclassesSlotDefs)
  ;; Return a CLOS definition corresponding to the
  ;;    KBCLASSES class defined by "class";
  (let* ((classDefinition
          `(CLOS::defclass ,name ,superClasses
             ,(form-CLOS-slot-definitions kbclassesSlotDefs))))
;    (pprint classDefinition)			; used for debugging class creation
    classDefinition
    ))

;;; TEMPORARILY REDEFINED BELOW DUE TO LUCID COMPILER WARNINGS
;;;    ABOUT "WITH-ACCESSORS";
;(defun get-dynamic-clos-slot (self slotName)
;  ;; Return the value of the dynamically-allocated slot "slotName";
;  (with-accessors ((dynamicSlots LOOM::dynamic-variables)) self
;     (cdr (assoc slotName dynamicSlots)) ))
;#+(or :ANSI-CL :CLTL2) (declaim (inline get-dynamic-clos-slot))
;#-(or :ANSI-CL :CLTL2) (proclaim '(inline get-dynamic-clos-slot))

#+(or :ANSI-CL :CLTL2) (declaim (inline get-dynamic-clos-slot))
#-(or :ANSI-CL :CLTL2) (proclaim '(inline get-dynamic-clos-slot))
(defun get-dynamic-clos-slot (self slotName)
  ;; Return the value of the dynamically-allocated slot "slotName";
  (cdr (assoc slotName (LOOM::dynamic-variables self))) )

(defun set-dynamic-clos-slot (self slotName newValue)
  ;; Set the value of the dynamically-allocated slot "slotName";
  ;; Optimization: Don't create a new entry if "newValue" is nil;
  (let ((entry (assoc slotName (LOOM::dynamic-variables self))))
    (if entry
	(setf (cdr entry) newValue)
	(when newValue
	  (push (cons slotName newValue) (LOOM::dynamic-variables self))
	  newValue)) ))



;;; "defclass" defines a KB-CLASSES class AND a CLOS class
;;; The KB-CLASSES class supports options that are not found in the
;;;    CLOS protocol.

;;; Implementing dynamic & context sensitive slot allocation for KB-CLASSES requires a
;;;    kludge since the only means of compiling new accessors is
;;;    to form the appropriate defmethod forms at top level.  Hence,
;;;    we cause the accessor declarations to appear in the expansion
;;;    of "defclass".

(defun define-slot-accessors (className slotName slotOptions dynamicP contextSensitiveP)
  ;; Create methods for slot accessors, readers and writers that properly
  ;;   handle the "dynamicP" and "contextSensitiveP" flags;
  (let ((result nil)
        (updateFunction `(function (lambda (object value)
                                     (set-dynamic-clos-slot
                                      object ',slotName value)))))
    (flet ((make-reader (methodName)
             (let ((slotReader (if dynamicP
                                 `(get-dynamic-clos-slot self ',slotName)
                                 `(CLOS::slot-value self ',slotName))))
               `(defmethod ,methodName ((self ,className))
                  ,(if contextSensitiveP
                     `(loom::access-in-ctxt ,slotReader
                                            ,(when (eq contextSensitiveP :non-inheriting)
                                               '(LOOM::home-ctxt self))
                                            (LOOM::home-ctxt self))
                     slotReader)) ))
           (make-writer (methodName)
             `(defmethod ,methodName (newValue (self ,className))
                ,(cond ((and dynamicP contextSensitiveP) 
                        `(loom::update-in-ctxt  ,updateFunction
                                                self
                                                (get-dynamic-clos-slot self ',slotName)
                                                newValue
                                                ,(eq contextSensitiveP t)))
                       (dynamicP
                        `(set-dynamic-clos-slot self ',slotName newValue))
                       (contextSensitiveP
                        ;; Meaning of :context-sensitive-p values:
                        ;;   t   (default)    Inherit, but copy to children on write;
                        ;;   :virtual         Inherit and let children see inherited value;
                        ;;   :non-inheriting  Don't inherit, so no need to copy on write;
                        `(loom::update-slot-in-ctxt self ',slotName newValue 
                                                    ,(eq contextSensitiveP t)))
                       (t               ; Shouldn't hit this code.
                        `(setf (CLOS::slot-value self ',slotName) newValue)))) ))
      (push (make-reader slotName) result)
      (push (make-writer `(setf ,slotName)) result)
      (loop for (key value) on slotOptions by #'cddr
            unless (eq value slotName)
            do (case key
                 (:accessor 
                  (push (make-reader value) result)
                  (push (make-writer `(setf ,value)) result))
                 (:reader 
                  (push (make-reader value) result))
                 (:writer
                  (push (make-writer value) result))
                 (otherwise nil))
            else when (eq key :writer)
            do (warn "Name ~A for ~A slot :writer conflicts with automatically~%~
                      generated accessor in class ~A" value slotName className))
      result )))

;; THIS CODE WAS USED TO CREATE CONTEXT-SENSITIVE INITIAL VALUES.  IT IS NO LONGER
;;  NEEDED BECAUSE:
;;    o  ALL INSTANCES ARE CREATED IN A HOME-CTXT
;;    o  VALUES STORED IN THE HOME-CTXT ARE JUST STORED AS RAW VALUES
;;    o  THEREFORE THE NORMAL CLOS INITFORM MECHANISM WILL WORK FINE.
;;
;(eval-when (load eval compile)
;  (defun form-CLOS-initialization-function (name alist)
;    `(defmethod LOOM::initialize-clos-instance ((self ,name) identifier context)
;       #+(or :MCL :EXCL) (declare (ignore identifier context))
;       (call-next-method)
;       ,@(loop for (slotName . initform) in alist
;               collect `(when (CLOS::slot-exists-p self ',slotName)
;                          (loom::set-slot-value self 
;                                                (loom::find-relation ',slotName)
;                                                ,initform)))
;       self))
;  (defun remove-existing-CLOS-init-function (className)
;    (let ((method (CLOS::find-method #'LOOM::initialize-clos-instance
;                                     nil
;                                     (list (CLOS::find-class className nil)
;                                           (CLOS::find-class 't)
;                                           (CLOS::find-class 't))
;                                     nil)))
;      (when method
;        (CLOS::remove-method #'LOOM::initialize-clos-instance method)) ))
; )

(defmacro defclass (name (&rest superClasses) (&rest slotDefinitions) &key suppress-kb-class-p)
  ;; Create a new class, initializing it with values from "keywordOptions";
  ;;    "name" is the name of the class; "superClasses" is a list
  ;;    of (names of) super (include) classes;
  ;; The values "name", "superClasses", and values for each "keywordOption"
  ;;    are implicitly quoted;
  ;; Uses special variable "*slotInitializationAlist*" to handle non-NIL :initform
  ;;    for slots.  These must be handled via an "initialize-instance" method
  ;;    to assure proper slot storage in the newly created class.
  (let ((normalizedSlotDefs (normalize-slot-definitions slotDefinitions))
;        (*slotInitializationAlist* nil)
        )
;    (declare (special *slotInitializationAlist*))
    `(progn
       ,(form-CLOS-class name (or superClasses          ;  TAR 2/8/94
		                  (if (or (eq name 'LOOM::LOOM-OBJECT)
                                          suppress-kb-class-p)
			            '()
			            '(LOOM::LOOM-OBJECT)))
                         normalizedSlotDefs)
       ,@(unless suppress-kb-class-p
           `((create-class ',name ',superClasses ',normalizedSlotDefs) ))
       ,@(loop for (slotName . slotOptions) in normalizedSlotDefs
               as dynamicP = (eq (getf slotOptions :allocation) :dynamic)
               and contextSensitiveP = (getf slotOptions :context-sensitive-p)
               when (or dynamicP contextSensitiveP)
               nconc (define-slot-accessors name slotName slotOptions
				      dynamicP contextSensitiveP)) ; nreverse?
;       (remove-existing-CLOS-init-function ',name)
;       ,@(when *slotInitializationAlist*        ;  TAR 1/6/94
;           `(,(form-CLOS-initialization-function name *slotInitializationAlist*)))
       ) ))


  ;;
;;;;;; "set-equal-p", "addf-assoc", "delf-assoc"
  ;;

#+(or :CLTL2 :ANSI-CL) (declaim (inline set-equal-p))
#-(or :CLTL2 :ANSI-CL) (proclaim '(inline set-equal-p))
(defun set-equal-p (set1 set2 &key (test #'eql))
  ;; Return T iff lists "set1" and "set2" contain the same members;
  ;; Note:  Assumes that the sets do not contain duplicates;
  (and (= (length set1) (length set2))
       (loop for item in set1
	     always (member item set2 :test test))) )

(defmacro addf-assoc (place key newMember &key (test '(function eql)))
  (once-only (key newMember)
    `(let ((oldCons (assoc ,key ,place :test ,test)))
       (cond 
	 (oldCons (setf (cdr oldCons) ,newMember))
	 (t (push (cons ,key ,newMember) ,place)))
       ,place )))

(defmacro delf-assoc (place key &key (test '(function eql)))
  `(setf ,place (delete ,key ,place :key #'car :test ,test)) )

(defmacro removef-assoc (place key &key (test '(function eql)))
  `(setf ,place (remove ,key ,place :key #'car :test ,test)) )


  ;;
;;;;;;  Slot-Accessor Macros
  ;;
 
(defmacro addf (place newMember)
  ;; Generalized "add to".
  `(push ,newMember ,place) )

(defmacro delf (place oldMember &key test key count)
  ;; Generalized "delete-from";
  `(setf ,place
	 (delete ,oldMember ,place
		 ,@(when test `(:test ,test))
		 ,@(when key `(:key ,key))
                 ,@(when count `(:count ,count)))) )

(defmacro removef (place oldMember &key test key)
  ;; Generalized "remove".
  `(setf ,place
	 (remove ,oldMember ,place
		 ,@(when test `(:test ,test))
		 ,@(when key `(:key ,key)))) )

(defmacro remove-members (members list &key test key)
  ;; Return "list" with members matching something in "members" removed;
  `(remove-if (function (lambda (self)
                          (member self ,members ,@(when test `(:test ,test)))))
              ,list
              ,@(when key `(:key ,key))) )


(defmacro removef-members (place members &key test key)
  ;; Generalized "remove members".
  (once-only (members)
    `(when ,members
       (setf ,place
	     (remove-members ,members ,place
                             ,@(when test `(:test ,test))
                             ,@(when key `(:key ,key))))) ))


  ;;
;;;;;; "add-link" and "del-link"
  ;;

(defmacro add-link-or-value (slotName self value &key old-value-is-null)
  ;; Expand into a form which places a link (a double-pair of pointers)
  ;;   between "self" and "value" or a single pointer (depending on
  ;;   whether a one-way-inverse of "slotName" exists),
  ;;   by filling in values of the 
  ;;   slots named "name" and (one-way-inverse "name")
  (let* ((slot (forcing-get-slot slotName))
	 (inverseSlot (one-way-inverse slot))) 
    (if inverseSlot
	(form-add-link self value slotName (name inverseSlot)
		       (single-or-collection-valued slot)
		       (single-or-collection-valued inverseSlot)
		       :old-value-is-null old-value-is-null)
	(form-add-half-link self value slotName nil
			    (single-or-collection-valued slot) nil
			    :old-value-is-null 'DONT-CONSIDER-INVERSE-SLOT)) ))

(defmacro add-link (slotName self value &key old-value-is-null link-is-new)
  ;; Expand into a form which places a link (double-pair of pointers)
  ;;   between "self" and "value", by filling in values of the 
  ;;   slots named "name" and (one-way-inverse "name")
  (when old-value-is-null
    (setq link-is-new t))
  (let* ((slot (forcing-get-slot slotName))
	 (inverseSlot (forcing-one-way-inverse slot)))
    (once-only (self value)
      (form-add-link self value slotName (name inverseSlot)
		     (single-or-collection-valued slot)
		     (single-or-collection-valued inverseSlot)
		     :old-value-is-null old-value-is-null
		     :link-is-new link-is-new) )))

(defun forcing-get-slot (name)
  ;; Helping function for "add-link" and "del-link";
  ;; Return the slot with name "name";
  (or (get-slot name)
      (error "addf, delf, add-link or del-link:~%   ~
              Can't find a slot named '~S'" name)) )

(defun forcing-one-way-inverse (slot)
  ;; Helping function for "add-link" and "del-link";
  ;; Return the one-way-inverse of the slot "slot"
  (or (one-way-inverse slot)
      (error "add-link or del-link: Can't find a one-way-inverse of~%   ~
                the slot named '~S'" (name slot))) )

(defun single-or-collection-valued (slot)
  ;; Return 'single-valued or 'collection-valued
  (if (collection-p slot) 'collection-valued 'single-valued) )

(defun form-add-link
       (self value slotName inverseSlotName arity inverseArity &key old-value-is-null link-is-new)
  ;; Return a form which if evaluated places a link between "self"
  ;;    and "value" using slots "slotName" and "inverseSlotName"
  ;; If "old-value-is-null", don't generate code to delete a dangling pointer
  ;;    IN THE FORWARD DIRECTION;
  `(,@(cond
	(link-is-new
	 '(progn))
	((eq arity 'single-valued)
	 `(when (neq ,value (,slotName ,self))))	; RMM 4/18/90
	(t
	 `(when (not (member ,value (,slotName ,self))))))
    ,(form-add-half-link self value slotName inverseSlotName
			 arity inverseArity :old-value-is-null old-value-is-null)
    ,(form-add-half-link value self inverseSlotName slotName
			 inverseArity arity)) )

(defun form-add-half-link
       (self value slotName inverseSlotName arity inverseArity &key old-value-is-null)
  ;; Return a form which if evaluated adds "value" to the slot
  ;;    of "self" named "slotName"; a matching form is needed
  ;;    to take care of adding the other half of the link
  ;; If "old-value-is-null", don't generate code to delete a dangling pointer;
  (ecase arity
    (collection-valued
      `(addf (,slotName ,self) ,value))
    (single-valued
     (cond (old-value-is-null
	     `(setf (,slotName ,self) ,value))
	    (t
	     `(let (oldValue)
		;; note: "and" used because using "when" expands to illegal "if":
		(and (setq oldValue (,slotName ,self))
		    ,(ecase inverseArity
		       (collection-valued
			 `(delf (,inverseSlotName oldValue) ,self))
		       (single-valued
			 `(setf (,inverseSlotName oldValue) nil))))
		(setf (,slotName ,self) ,value)))))) )

(defmacro del-link-or-value (slotName self value)
  ;; Expand into a form which removes a link (a double-pair of pointers)
  ;;   between "self" and "value" or a single pointer (depending on
  ;;   whether a one-way-inverse of "slotName" exists),
  ;;   by removing values from the 
  ;;   slots named "name" and (one-way-inverse "name")
  (let* ((slot (forcing-get-slot slotName))
	 (inverseSlot (one-way-inverse slot)))
    (cond
      (inverseSlot
       (form-delete-link self value slotName (name inverseSlot)
			 (single-or-collection-valued slot)
			 (single-or-collection-valued inverseSlot)))
      (t
       (form-delete-half-link self value slotName 
			      (single-or-collection-valued slot)))) ))

(defmacro del-link (slotName self value)
  ;; Expand into a form which removes a link (double-pair of pointers)
  ;;   between "self" and "value", by removing values from the 
  ;;   slots named "name" and (one-way-inverse "name")
  (let* ((slot (forcing-get-slot slotName))
	 (inverseSlot (forcing-one-way-inverse slot)))
    (once-only (self value)
      (form-delete-link self value slotName (name inverseSlot)
			(single-or-collection-valued slot)
			(single-or-collection-valued inverseSlot)) )))

(defun form-delete-link
       (self value slotName inverseSlotName arity inverseArity)
  ;; Return a form which if evaluated removes a link between "self"
  ;;    and "value" using slots "slotName" and "inverseSlotName"
  `(progn
     ,(form-delete-half-link value self inverseSlotName inverseArity)
     ,(form-delete-half-link self value slotName arity)) )

(defun form-delete-half-link
       (self value slotName arity)
  ;; Return a form which if evaluated removes "value" from the slot
  ;;    of "self" named "slotName"; a matching form is needed
  ;;    to take care of removing the other half of the link
  (ecase arity
    (collection-valued
      `(delf (,slotName ,self) ,value))
    (single-valued
      `(setf (,slotName ,self) nil))) )


  ;;
;;;;;; Macros for mapping across sub-graphs of objects
  ;;

(defmacro map-transitive-relation (self slotName mappingFn
				   &key non-reflexive)
  ;; Apply the function "mappingFn" to each object in a sub-graph
  ;;    rooted at "self", and spanning all objects reachable via the
  ;;    link indicated by "slotName".
  ;; Visit each object only once;
  ;; Visit "self" unless "non-reflexive" is set;
  ;; The variable "classesVisited" is used to keep track of which
  ;;    classes have already been visited.  To save garbage collection, we
  ;;    reuse the hash tables for each call to "map-transitive-relation", retaining
  ;;    a list of unused hash tables in *free-hash-tables*
  ;; NOTE: a faster version of "map-transitive-relation" would define a new function
  ;;    for each macro-expansion, rather than calling
  ;;    "help-map-transitive-relation-slowly";
  ;;    we haven't yet written a fast version, though.
  ;; NOTE: We don't yet compile the mapping function.
  (let ((closedMappingFn
	  (cond
	    ((and (consp mappingFn)
		  (eq (car mappingFn) 'lambda))
	     `(function ,mappingFn))
	    (t mappingFn))))
  `(let (*classesVisited*)
     (declare (special *classesVisited*))
     ,@(unless non-reflexive
	 `((funcall ,closedMappingFn ,self)
	   (push ,self *classesVisited*)))
     (loop for neighbor in (,slotName ,self)
	   do (help-map-transitive-relation-slowly
		neighbor ',slotName ,closedMappingFn))
     nil) ))

(defun help-map-transitive-relation-slowly (self slotName mappingFn)
  ;; Helping function for "map-transitive-relation"
  ;; CHANGE THIS FROM "funcall" TO SLOT-VALUE WHEN METHODS GO AWAY
  (declare (special *classesVisited*))
  (when (member self *classesVisited*)
      (return-from help-map-transitive-relation-slowly nil))	; "self" was already visited
  (push self *classesVisited*)			; mark "self" as having been visited
  (funcall mappingFn self)
  (loop for neighbor in (funcall slotName self)
	do (help-map-transitive-relation-slowly
	     neighbor slotName mappingFn)) )

(defmacro append-transitive-relation (self slotName testFn
				       &key non-reflexive)
  ;; Join the results of applying the function "mappingFn" to each object
  ;;    in a sub-graph rooted at "self", and spanning all objects reachable
  ;;    via the link indicated by "slotName".  Unless "non-reflexive" is set
  ;;    include in the collection the result of applying "mappingFn" to "self"
  ;; Nodes in the sub-graph are visited once only.
  (let* ((testFnBody (reparameterized-body-of-lambda-expr
		       testFn 'self)) 
	 (mappingFn
	   `(function (lambda (self)
	     (setq collectionVariable
		   (append (progn ,@testFnBody) collectionVariable))))))
    `(let (collectionVariable)
       (map-transitive-relation ,self ,slotName ,mappingFn 
				:non-reflexive ,non-reflexive)
       collectionVariable) ))

(defmacro search-transitive-relation (self slotName searchFn
				      &key non-reflexive)
  ;; Return the result of a successful application of "searchFn" to the objects
  ;;    found in a sub-graph rooted at "self", and spanning all objects reachable
  ;;    via the link indicated by "slotName".  Unless "non-reflexive" is set
  ;;    include in the search the result of applying "searchFn" to "self".
  (let* ((tag (gensym))
	 (searchFnBody (reparameterized-body-of-lambda-expr
			 searchFn 'self))
	 (mappingFn `(lambda (self)
		       (let ((result ,(cond ((cdr searchFnBody)
					     `(progn ,@searchFnBody))
					    (t (car searchFnBody)))))
			 (when result
			     (throw ',tag result))))))
    `(catch ',tag
       (map-transitive-relation ,self ,slotName ,mappingFn 
				:non-reflexive ,non-reflexive)) ))

(defun reparameterized-body-of-lambda-expr (lambdaExpr &rest newParameters)
  ;; Replace references to parameters in the body of "lambdaExpr" by
  ;;    parameters in "newParameters", and return a LIST containing
  ;;    the body of the (modified) copy of "lambdaExpr"
  (when (or (not (consp lambdaExpr))
	  (neq (car lambdaExpr) 'lambda))
      (return-from reparameterized-body-of-lambda-expr
	`(,(copy-tree lambdaExpr))))
  (let* ((oldParameters (cadr lambdaExpr))
	(body (nsubst (pop newParameters)
		     (pop oldParameters)
		     (copy-tree (cddr lambdaExpr)))))
    (loop for parameter in newParameters
	  do (nsubst parameter (pop oldParameters) body))
    body ))


  ;;
;;;;;; Macros for mapping across slot fillers
  ;;

(defmacro map-slots-macro (selfName slotNames mappingFn)
  ;; Expand into a series of for loops which apply "mappingFn"
  ;;    to each member of the indicated slots
  ;; Note: The expression returned evaluates slot accessors
  ;;    applied to the variable "selfName" 
  (let ((action (reparameterized-body-of-lambda-expr
		  mappingFn 'filler)))
  `(progn
     ,@(loop for name in slotNames
	     collect (cond ((collection-p (forcing-get-slot name))
			    `(loop for filler in (,name ,selfName) do ,@action))
			   (t `(progn 
				 ,@(reparameterized-body-of-lambda-expr
				     mappingFn `(,name ,selfName))))))) ))



  ;;
;;;;;; Symbol conversion macros and functions
  ;;

(defun remove-suffix (symbol &key package-name)
  ;; Return a symbol equivalent to "symbol" except that the last
  ;;    hyphen and the characters after that hyphen have been eliminated;
  (let ((string (symbol-name symbol))
	(symbolPackage (or package-name (symbol-package symbol))))
    (values (intern (subseq string
			    0
			    (position #\- string :from-end t))
		    symbolPackage)) ))

;;; Macros for adding and removing leading colons:

(defun remove-keyword-colon (keyword &key package-name)
  ;; Convert a keyword into a symbol without a leading colon
  (values (intern (symbol-name keyword) 
		  (or package-name (package-name *package*)))) )
  
(defun prepend-keyword-colon (symbol)
  ;; Return a symbol with a colon prepended onto it
  (values (intern (symbol-name symbol) 'KEYWORD)) )


  ;;
;;;;;; Generally useful macros/functions
  ;;

(defmacro is-instance-of (object class)
  ;; Return t iff "object" is an instance of "class"
  `(typep ,object (name ,class)) )

(defun normalized-3-valued-truth-value (value)
  ;; Return TRUE, FALSE, or UNKNOWN;
  ;; If "value" does not belong to '(TRUE T YES Y FALSE F NO N UNKNOWN U NIL)
  ;;    then return the ILLEGAL value NIL;
  (cond ((eq value nil) 'UNKNOWN) 
	(t (case value
	     ((true t yes y :yes) 'true)
	     ((false f no n :no) 'false)
	     ((unknown u) 'unknown)
	     (otherwise
	       (error "Illegal 3-valued value ~S" value))))) )

(defun 3-valued-not (argument)
  ;; Return the 3-valued NOT of "argument";
  (ecase argument
    (true 'false)
    (unknown 'unknown)
    (false 'true)) )

(defmacro get&remf (place indicator)
  ;; Useful for extracting keyword arguments inside of macros;
  `(prog1 (getf ,place ,indicator)
	  (remf ,place ,indicator)))

;;; Function which allows optional and keyword arguments to be mixed
;;;    within a function call:
(defun separate-optional&key-arguments (arguments legalKeys callingFnName)
  ;; Return two lists, one with all arguments in "arguments"
  ;;    up to the first keyword, and the second containing
  ;;    a property list of the remaining key/value pairs;
  (let ((optionals (loop for arg in arguments
			 until (keywordp arg)
			 collect (pop arguments))))
    (loop for key in arguments by #'cddr
	  when (not (member key legalKeys))
	  do (error "Illegal key argument '~S' passed to ~S~%   ~
                    Legal keys are:  ~S" key callingFnName legalKeys))
    (values optionals arguments) ))

(defmacro with-speed (&rest body)
  #+(or :CLTL2 :ANSI-CL)
  `(locally (declare (optimize (speed 3) (safety 0) (space 0) (debug 0)))
     ,@body)
  #-(or :CLTL2 :ANSI-CL)
  (if (cdr body)
      `(progn ,@body)
    (first body)))


  ;;
;;;;;;  Bit Flags Definitions
  ;;


(eval-when (compile eval load) 
  (defparameter *bit-marker-alist* nil)

  (defun calculate-bit-position (metatype marker)
    (let ((pos (position marker (cdr (assoc metatype *bit-marker-alist*)))))
      (if pos
        pos
        (error "~S is not a valid flag for ~S" marker metatype))))

  (defun calculate-bit-values (metatype markers)
    (let ((result 0))
      (declare (fixnum result))
      (loop for marker in markers
            do (setf result 
                     (the fixnum 
                       (logior 
                        result
                        (the fixnum 
                          (ash 1 (calculate-bit-position metatype marker)))))))
      result) )
  )                                     ; END EVAL-WHEN

(defmacro def-bit-flags (metatype &rest markers)
  (if (> (length markers)
         (integer-length most-positive-fixnum))
    (error "Can't fit ~D ~S markers into a fixnum" (length markers) metatype)
    `(eval-when (compile eval load) 
       (push (cons ,metatype ',(copy-list markers)) *bit-marker-alist*))) )

(defmacro set-bit-flags (location metatype &rest flags)
  `(setf ,location (the fixnum (logior (the fixnum ,location)
                                       (the fixnum ,(calculate-bit-values
                                                     metatype flags))))) )

(defmacro clear-bit-flags (location metatype &rest flags)
  `(setf ,location (the fixnum (logandc2 (the fixnum ,location)
                                         (the fixnum ,(calculate-bit-values
                                                       metatype flags))))) )
(defmacro test-bit-flags (location metatype &rest flags)
  ;; If the first of flags is :or, then do an or test, otherwise do an
  ;;    and test;
  (when (eql (first flags) :and) (pop flags))
  (cond ((eql (first flags) :or)  ;; Faster than logtest:
         `(not (= 0 (the fixnum (logand (the fixnum ,(calculate-bit-values metatype (cdr flags)))
                                        (the fixnum ,location))))))
        ((cdr flags)
         (let ((flagValue (calculate-bit-values metatype flags)))
           `(= (the fixnum (logand (the fixnum ,flagValue) (the fixnum ,location)))
               (the fixnum ,flagValue)) ))
        (t `(logbitp (the fixnum ,(calculate-bit-position metatype (car flags)))
                     (the fixnum ,location)))) )

(defun expand-bit-flags (encodedFlags metatype)
  (loop for symbol in (cdr (assoc metatype *bit-marker-alist*))
        for position upfrom 0
        when (logbitp (the fixnum position) (the fixnum encodedFlags))
      collect symbol))

(defmacro def-bit-accessor (name accessorName type &rest flags)
  (let ((var (gensym "I")) 
	(val (gensym "V")))
    `(progn
       (defmacro ,name (,var)
	 `(with-speed
	      (test-bit-flags (,',accessorName ,,var) ,',type ,',@flags)))
       
       (defsetf ,name (,var) (,val)
	 ;; NOTE:  IT LOOKS LIKE THIS OPTIMIZATION, AT LEAST IN ALLEGRO, DOESN'T
	 ;;  DO ANYTHING, BECAUSE OF CARE THAT defsetf TAKES TO RECAST THE EXPANSION
	 ;;  INTO A FORM THAT DOESN'T ALLOW EVALUATION OF THE ARGUMENTS AT MACRO
	 ;;  EXPANSION TIME.  MUST RELY ON THE COMPILER TO OPTIMIZE THE CONSTANT
	 ;;  IN THE TEST POSITION AWAY.
 	 (cond ((eq ,val t)
		`(with-speed
		   (set-bit-flags (,',accessorName ,,var) ,',type ,',@flags)
		   T))
	       ((eq ,val nil)
		`(with-speed
		   (clear-bit-flags (,',accessorName ,,var) ,',type ,',@flags)
		   nil))
	       (t 
		`(with-speed
		   (if ,,val
		     (set-bit-flags (,',accessorName ,,var) ,',type ,',@flags)
		     (clear-bit-flags (,',accessorName ,,var) ,',type ,',@flags))
		   ,,val))))
       ) ))

     

#|
;; Test code for bit flags:

(def-bit-flags :instance
  :skolem :user-defined-name :incoherent :discarded :abandoned-by-merge)


;; Macroexpand to test these:
(test-bit-flags (flags instance) :instance :or :skolem :discarded)
(test-bit-flags (flags instance) :instance :skolem :discarded)

(expand-bit-flags  9 :instance)  ; => '(:skolem :discarded)
(expand-bit-flags 16 :instance)  ; => '(:abandoned-by-merge)
(expand-bit-flags 31 :instance)  
    ; => '(skolem :user-defined-name :incoherent :discarded :abandoned-by-merge)
(expand-bit-flags 32 :instance)  ; => NIL

(defvar *test* 0)

(set-bit-flags *test* :instance :incoherent :user-defined-name) ; => 6
(test-bit-flags *test* :instance :incoherent)          ; => T
(test-bit-flags *test* :instance :incoherent :skolem)  ; => NIL
(test-bit-flags *test* :instance :and :incoherent :skolem)  ; => NIL
(test-bit-flags *test* :instance :or :incoherent :skolem)   ; => T
(test-bit-flags *test* :instance :incoherent :user-defined-name) ; => T
(test-bit-flags *test* :instance :and :incoherent :user-defined-name) ; => T
(test-bit-flags *test* :instance :incoherent :user-defined-name :discarded)
               ; => NIL

|#

  ;;
;;;;;;  Debugging Macros
  ;;


;;; Debugging macro for tracing values inside of functions:


(defmacro trace-values (&rest sExpressions)
  ;; Expand to a format statement which prints out the form and value
  ;;    of each s-expression in "sExpressions";
  ;; Any s-expression which is a string, is output verbatim;
   `(format *trace-output*
	    ,(with-output-to-string (formatString)
                (format formatString "~~&")
                (dolist (sexp sExpressions)
                   (if (stringp sexp)
		       (format formatString "~~A " sexp)
		       (format formatString "~S= ~~S   " sexp)))
                (format formatString "~~%"))
	    ,@sExpressions) )

(defmacro trace-values (&rest sExpressions)
  ;; Expand to a format statement which prints out the form and value
  ;;    of each s-expression in "sExpressions";
  ;; If the first s-expression is a string, it is prepended to the
  ;;    remaining s-expression values;
  (let ((formatString "~%")
	(initialString "~&"))
    (when (stringp (car sExpressions))
      (setq initialString (string-append initialString (pop sExpressions))))
    (loop for sexp in (reverse sExpressions)
	  do (if (stringp sexp)
		 (setq formatString (string-append sexp "~*" formatString))
		 (setq formatString
		       (string-append (format nil "~S" sexp) "= ~S   " formatString))))
    (setq formatString
	  (string-append initialString "   " formatString))
	; Changed stream from "t" to "*trace-output*" - tar 7/1/92
    `(format *trace-output* ,formatString ,@sExpressions) ))

(defmacro say (&rest strings&forms)
  ;; Expand to a format statement which includes "~S" characters
  ;;    wherever a variable appears, and ends with a newline;
  (let (strings forms)
    (setq strings
	  (loop for item in strings&forms
		collect
		(cond
		  ((stringp item)
		   item)
		  (t
		   (push item forms)
		   " ~S "))))
    `(format *standard-output* ,(apply #'concatenate 'string
				       (append strings (list "~%")))
	     ,@(nreverse forms)) ))

(defmacro generate-match-function (testString match)
  (let ((var (gensym "X")))
    `(case ,match
       (:exact #'(lambda (,var) (string= ,var ,testString)))
       (:case-insensitive #'(lambda (,var) (string-equal ,var ,testString)))

       (:substring-exact #'(lambda (,var) (search ,testString ,var :test #'char=)))
       (:substring #'(lambda (,var) (search ,testString ,var :test #'char-equal)))
       
       (:wildcard-exact (let ((regex:*regex-case-sensitive-p* t))
			  (compile nil (regex:wildcard-compile ,testString))))
       (:wildcard (let ((regex:*regex-case-sensitive-p* nil))
			(compile nil (regex:wildcard-compile ,testString))))

       (:regex-exact (let ((regex:*regex-case-sensitive-p* t))
		       (compile nil (regex:regex-compile ,testString))))
       (:regex (let ((regex:*regex-case-sensitive-p* nil))
		 (compile nil (regex:regex-compile ,testString))))

       (otherwise (cerror "Return a null matching function" 
			  "Illegal match option ~A" ,match)
		  #'(lambda (,var) (declare (ignore ,var)) nil))) ))

#|

|#
