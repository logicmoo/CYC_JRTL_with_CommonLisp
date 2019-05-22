;; -*- Mode: Lisp; Package: LOOM; Syntax: COMMON-LISP; Base: 10 -*-

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

;;; GLOBALS.LISP (TBOX)

;;; This file contains all global variables for the LOOM TBox and ABox code.

(in-package "LOOM")


(export '(*format-time-smallest-unit* *format-time-style*
	  *format-time-include-date-p* *format-time-long-date-p*
	  *format-time-4-digit-year-p*
	  *minimum-digits-for-concept-suffix*
	  *minimum-digits-for-instance-suffix*
          *loom-default-features* *copyright-notice* *copyright-year*
	  *knowledge-base* *world*))	;TAR 3/10/93 for backward compatibility


  ;;
;;;;;; Compatiblity with Lisp & shadowing symbols.
  ;;

(defconstant pi COMMON-LISP:pi)		;TAR 3/24/93

  ;;
;;;;;; Global variables for the Loom TBox
  ;;

  ;;
;;;;;;  LOOM Dialogue switches
  ;; 

;;; "reset-features" sets the initial values of the dialogue switches
;;;    and other features.

;; Used to set the default features for Loom.  This variable is defined
;;  in the CL-USER package using DEFVAR rather than DEFPARAMETER in order to
;;  easily allow for site customization of the value.

(defvar cl-user::*loom-default-features*
    '(:open-world
      :emit-classify-dots
      :warn-about-syntax-corrections
      :automatic-clos-classes :warn-on-nonprimitive-clos-classes
      :make-roles-single-valued		; RMM 5/6/95
;     :load-obsolete-concepts           ; RMM 5/16/95
      :automatically-advance-state	; TAR 6/21/99 -- Now that this is a feature.
      :emit-match-stars :warn-on-slot-overflow :clip-roles
      :display-match-changes)
  "Set of default features.  Used by WITH-DEFAULT-FEATURES and RESET-FEATURES.")

;; Used to control behaviour of the Loom system;
;; Possible members are:
;;    :trace-foo  (where "foo.lisp" is the name of a Loom file)
;;    :disable-classifier
;;    :classify-undefined-concepts
;;    :disable-completion
;;    :disable-hyper-classifier
;;    :disable-recognizer
;;    :push-down-primitive-restrictions
;;    :auto-redefine
(defparameter *loom-features* nil)

;; Used to control the amount of dialogue the system has with a user
;; Possible members are:
;;      :emit-classify-dots
;;      :ask-about-conjuction-concepts
;;      :ask-about-redefinitions
;;      :ask-for-concept-names
;;      :ask-for-names-immediately
;;      :dont-name-system-defined-concepts
;;      :warn-about-syntax-corrections
;;      :suppress-diehard-output
;; These features control dialogue with the pattern-matcher:
;;      :emit-match-stars
;;      :warn-on-slot-overflow
(defparameter *loom-dialogue-features* nil)

;; Used to control behavior of the pattern matcher;
;; Possible members are:
;;      :clip-roles
;;      :clip-types
;;      :display-match-changes
(defparameter *loom-match-features* (list :clip-roles :display-match-changes))

;; Used to control the level of inferential power; Values
;;    are 3, 2, and 1, representing :high, :medium, and :low:
(defparameter *power-level* 3)

;;; Used to choose between safe mode (with more error checking) and `not
;;;  quite so safe mode' (with less error checking)
(defparameter *safe-mode-p* nil)

;;; During parsing, convert symbols with the same name as existing keywords
;;;    into keywords (e.g., 'AND becomes :AND):
(defparameter *dwimify-keywords-p* t)

;;; List of some of the unclassified concepts;  An unclassified concept
;;;    not on this list depends on another concept ON this list
(defparameter *top-level-unclassified-concepts* nil)

;;; List of some of the uncompleted concepts;  An uncompleted concept
;;;    not on this list is a sub-concept of some other concept ON this list
(defparameter *top-level-uncompleted-concepts* nil)

;;; List of some concepts needing default conditioning;  An unconditioned
;;;    concept not on this list is a sub-concept of some other 
;;;    unconditioned concept ON this list
(defparameter *top-level-unconditioned-defaults-concepts* nil)

;;; List of some unsealed concepts.  Concepts below concepts
;;;    on this list are also unsealed
(defparameter *top-level-unsealed-concepts* nil)

;;; List of relations whose cached fillers need to be recomputed:
(defparameter *modified-inherit-fillers-relations* nil)    ; ALERT-PATCH

;;; List of concepts whose CBox value restrictions must be recomputed
(defparameter *list-of-recomplete-value-restrictions-concepts* nil)

;;; List of concepts whose implies slot must be recomputed
(defparameter *list-of-recomplete-implies-concepts* nil)

;;; List of relations whose implied-range must be recomputed
(defparameter *list-of-recomplete-range-relations* nil)

;;; List of system-defined concepts which haven't received names, or
;;;    been declared to have the name NIL, and which aren't yet entered
;;;    into a context:
(defparameter *list-of-uninterned-concepts* nil)

;;; Hash Table of system-defined instances, created during parsing of
;;;    concept and set definitions:
(defparameter *system-defined-instances-table* (make-hash-table))

;;; List of (concept) objects that have been discarded during merging,
;;;    but must be preserved until classification is complete before
;;;    being fully reclaimed (so that the merged-into pointer in
;;;    "primitive-concepts" remains valid
(defparameter *list-of-discarded-by-merge-concepts* nil)

;;; Time stamp for the last agent time an instance was merged.  This is
;;;     used by code to do lazy updating of merged instance pointers.
(defparameter *last-merged-instance-agent-time* -1)

;;; Counter indicating the total number of interned concepts which are
;;;    unclassified:
(defparameter *count-of-unclassified-concepts* 0)

;;; Pass counter used by the classification routines:
;;;    (this counter is always incremented)
(defvar *classify-concept-pass-counter* 1)

;;; Additional pass counter used by the classification routines:
;;;    (this counter is always incremented)
(defparameter *concept-is-below-pass-counter* 1)

;;; Pass counter used by the "revise-subgraph" routines:
;;;    (this counter is always decremented)
(defparameter *revise-subgraph-pass-counter* -1)

;;; Counters for various classifier actions
(defparameter *number-of-classifications* 0)
(defparameter *number-of-unclassifications* 0)
(defparameter *number-of-revisions* 0)
(defparameter *number-of-revision-discards* 0)
(defparameter *number-of-merges* 0)
;;; Counters for disjunction
(defparameter *number-of-disjunctions-checked* 0)
(defparameter *number-of-disjunctions-eliminated* 0)
(defparameter *number-of-disjuncts-specialized* 0)
(defparameter *emit-dot-counter* 0)
(defvar *dot-counter-line-length* 79 "Line Length for breaking Dots")

;; Counter used to generate sequence numbers for concepts and relations
;;    to allow preservation of the definition order.
;;    (referenced by "redefine-concept");
(defvar *concept-sequence-counter* 0)		; tar 9/11/95

;; Counter used to generate unique names for concepts and relations
;;    (referenced by "generate-unique-concept-name");
(defvar *concept-name-counter* 0)		; tar 11/18/92
(defvar *minimum-digits-for-concept-suffix* 4
  "Minimum number of digits used in automatically generated concept suffix.
For example, 4 => C_0001.")

;; Counter used to generate unique names for partitions
;;    (referenced by "form-partition-name");
(defvar *partition-name-counter* 0)     ;  TAR 7/14/95


;;; Flag indicating whether the network is sealed or unsealed:
(defparameter *network-is-sealed-p* nil)
;;; Flag indicating whether or not the network might need resealing:
(defparameter *reseal-network-p* nil)

;;; ABox variable: 
;; If true, advance the logical state of the system whenever a production
;;    rule has triggered (in response to an update) but not yet fired:
(defparameter *automatically-advance-state-p* t)

;;; ABox variable: assumes open-role semantics as the default case:
(defparameter *global-closed-world-p* nil)

;;; ABox variable:  Create CLOS instances rather than loom instances:
(defparameter *prefer-clos-instances-p* nil)

;;; ABox variable: retraction is legal in the default case:
(defparameter *monotonic-mode-p* nil)

;;; ABox flag: indicates whether or not there exist one or more
;;;    unimplemented concepts exist:
(defparameter *unimplemented-concepts-exist* nil)

;;; Pointer to Thing and Binary-tuple (avoids using "*Thing*" everywhere):
(defparameter *thing* nil)
(defparameter *binary-tuple* nil)

;;; Frequently used list containing the concept Thing (avoids a few extra conses):
(defparameter *list-of-Thing* nil)

;;; Pointer to the set containing all instances (the extension of Thing
;;;    minus any constants):
(defparameter *allThings* nil)

;;; AList associating built-in set concepts with their respective set
;;;    features.  This is needed in case revision of the built-in concepts
;;;    occurs -- perhaps due to deletion of user-defined concepts that
;;;    merged with one of the built-in concepts.  Setup in initialize-network.
(defparameter *built-in-set-alist* nil)

;;; Limit on nesting of disjointness tests:
(defparameter *disjoint-concepts-p-max-depth* 2)

;;; Parameters to limit work done on disjunctive definitions:
;;; Limit number of disjuncts that can result from
;;;    from expansion of concept definitions to disjunctive normal form
(defparameter *dnf-limit* 64)
;;; Limit depth of recursion in "cancel-disjuncts"
(defparameter *cancel-disjuncts-max-depth* 3)
;;; Counter: how many times *cancel-disjuncts-max-depth* exceeded
(defparameter *number-of-cancel-disjuncts-cutoff* 0)

;;; Pointer to the most general patterns:
(defparameter *unary-pattern* nil)
(defparameter *binary-pattern* nil)
(defparameter *n-ary-pattern* nil)

;;; Default mode indicator (CAUTION: Never use setq on it)
(defparameter *defaultModeP* nil)
;;; Allows determination of whether we are in a query or not.
(defparameter *InsideQueryP* nil)

;;; TBox recycling lists:
(defparameter *recycled-local-restrictions* nil)
(defparameter *recycled-phantom-inverse-relations* nil)
(defparameter *recycled-partitions* nil)

;;; File = "service":
;;; Hash tables of various sizes used in removing duplicates:
(defvar *remove-duplicates-table-200* (make-hash-table :rehash-size 200))
(defvar *remove-duplicates-table-600* (make-hash-table :rehash-size 600))
(defvar *remove-duplicates-table-2000* (make-hash-table :rehash-size 2000))
(defvar *remove-duplicates-table-8000* (make-hash-table :rehash-size 8000))
(defvar *remove-duplicates-table-unlimited*
    (make-hash-table :rehash-size 16000))

(defvar *remove-dim-duplicates-table* 
    (make-hash-table :rehash-size 200 :test #'equal))
(defvar *remove-list-duplicates-table* (make-hash-table :size 8000))


;;; File = "html":
;;; Tables which contain the forms used in filling-in and emptying-out
;;;    slots in unclassified concepts:
(defparameter *html-print-p* nil)
(defparameter *html-link-to-built-in-p* t)

;;;  Support for the CL-HTTP server in the html-printing routines:
(defparameter *html-url-path* "/loom/")
(defparameter *html-url-function* "show")
(defparameter *html-url-type* nil)
(defparameter *html-url-tag* nil)
(defparameter *html-url-target* nil)
(defparameter *html-url-parameters* nil)
(defparameter *html-url-color-tag-p* nil "Show color tag if available")
(defvar *html-dont-use-these-packages* (list (find-package "COMMON-LISP")
					     (find-package "KEYWORD")
					     (find-package "LOOM")))


;;; File = "links":
;;; Tables which contain the forms used in filling-in and emptying-out
;;;    slots in unclassified concepts:
(defvar *empty-concept-forms* nil)

;;; File = "parse":
;;; Global variables containing the LOOM parse tables and parse graphs:
(defvar *loom-keyword-lookup-table* nil)	; tar 11/18/92
(defvar *loom-parse-graph* nil)
(defvar *loom-non-terminals* nil)

;;; File = "partitions":
(defparameter *partition-table*  (make-hash-table))

;;; File = "instances":
;;; Determines at what point a list heap becomes a hash table heap:
(defparameter *mutable-heap-cross-over* 30)

;;; recently created instances with key roles that may not be filled in yet:
(defparameter *instances-with-unfilled-keys* nil)

;;; File = "optimize" & "predicates"
;;; Holds a dummy function to make recursive generator compilation happy
(defun dont-call-function (&rest args)
  (declare (ignore args))
  (print "Don't call me"))

(defparameter *dont-call-function* (symbol-function 'dont-call-function))

;;; File = "seal" (really "tuples"):
;;; Create storage for functions generated by "find-or-create-key-matches-tuple-fn":
(defparameter *key-matches-tuple-fn-table* (make-hash-table :test #'equal))

(defparameter *recursive-p-hash-table* (make-hash-table :size 200))

  ;;
;;;;;; Knowledge bases, contexts, and worlds variables
  ;;

;;; Association list of partition names and current name-spaces (hash tables)
(defparameter *current-name-spaces* nil)

;;; Association list of partition names and current lookup functions:
(defparameter *current-evaluate-id-fns* nil)

;;; List of legal context partitions (:instances must be first)
;;; NOTE:  IF THIS IS CHANGED, then the Namespace Cacheing in tbox/contexts.lisp
;;;        Needs to be changed as well, and "create-all-context-partitions".
(defparameter *legal-context-partition-identifiers*
  '(:instances :concepts :relations :behaviors))

;;; Association list of knowledge bases indexed by their names:
(defparameter *knowledge-base-table* nil)

;;; Association list of contexts indexed by their (package specific) names:
(defparameter *context-table* nil)

;;; List of functions to execute at end of (initialize-network):
(defvar *initialize-network-functions* nil)

;;; Pointer to current context, and stack of contexts:
(defparameter *context* nil)
(defparameter *context-stack* nil)
(defparameter *knowledge-base* nil "OBSOLETE") ;for backward compatibility

;;; Flag to control whether actions are done in subcontexts:
(defparameter *do-in-subcontexts-p* t)

;;; Pointer to the current world (nil if not in a world):
(defparameter *world* nil "OBSOLETE")

;;; ordered list of instance spaces; active only if *world* is set:
(defparameter *current-instance-space-list* nil)

;;; counter used to number worlds:
(defparameter *world-counter* 0)

;; Flag indicating whether or not incoherent worlds are destroyed or saved --
;;    setting this variable to NIL allows incoherent worlds to be saved for
;;    debugging or explanation.
(defvar *destroy-incoherent-worlds-p* t)


  ;;
;;;;;; Global Variables and constants used in the ABox
  ;;


;;; Queues used to computed instance types:

(defparameter *match-queues* (make-array 5 :initial-element nil))       ;  TAR 7/11/95

(defconstant $STRICT-RETRACTION-Q$ 0)
(defconstant $STRICT-ASSERTION-Q$ 1)
(defconstant $DEFAULT-RETRACTION-Q$ 2)
(defconstant $DEFAULT-ASSERTION-Q$ 3)
(defconstant $ACT-ON-Q$ 4)

;;; Recycling lists:
(defparameter *recycled-loom-instances* nil)
(defparameter *recycled-world-instances* nil)
(defparameter *recycled-worlds* nil)
(defparameter *recycled-trigger-role-records* nil)
(defparameter *recycled-remote-bombs* nil)
(defparameter *recycled-equivalence-bombs* nil)
(defparameter *recycled-modification-summaries* nil)
(defparameter *recycled-inherit-fillers-records* nil)
(defparameter *recycled-pattern-variables* nil)
(defparameter *recycled-query-goals* nil)
(defparameter *recycled-variable/generators-records* nil)
(defparameter *recycled-generator-entries* nil)
(defparameter *recycled-rete-bombs* nil)
(defparameter *recycled-rete-remote-bombs* nil)

;;; Enable/disable recycling of instances:
(defparameter *recycle-instances-p* nil)

;;; Variables monitored by "new-time-point":
(defparameter *match-is-pending-p* nil)
(defparameter *higher-priority-task-is-pending-p* nil)

;;; Counter used to construct unique instance identifiers:
(defparameter *instance-identifier-counter* 0)
(defvar *minimum-digits-for-instance-suffix* 5
  "Minimum number of digits used in automatically generated instance suffix.
For example, 4 => I-00001.")

;;; Flag indicating whether tracing of all productions and methods is
;;;    enabled:
(defparameter *trace-all-p* nil)

;;; Hold names of relations and methods currently being traced;
(defparameter *traced-relation-specs* nil)
(defparameter *traced-method-specs* nil)

  ;;
;;;;;; Caching Variables
  ;;

;;; caching variables to accelerate "get-instance":
(defparameter *get-instance-cached-instance* nil)
(defparameter *get-instance-cached-value* nil)

;;; holds last instance, type, and pass counter for marking features:
(defparameter *mark-feature-flags-cache* (list nil nil nil))


;;; File = "histories"

;;; Time point variables
(defparameter *agent-time* 0)
(defparameter *query-agent-time* 0)
(defparameter *previously* -1)
(defparameter *history-limit* nil)

;;; Indicates if history maintenance is on or off:
(defparameter *generating-histories-p* nil)

;;; Lists of histories and history indices:
(defparameter *list-of-*agent-time*-histories* nil)
(defparameter *list-of-*agent-time-1*-histories* nil)
(defparameter *list-of-oldest-histories* nil)
(defparameter *list-of-*agent-time*-indices* nil)
(defparameter *list-of-*agent-time-1*-indices* nil)
(defparameter *list-of-oldest-indices* nil)

(defparameter *non-existent-*agent-time*-instance* nil)

;;; *time-point-table* maps time labels onto integers (times);
(defparameter *time-point-table* (make-hash-table :test #'equal))
;;; *inverse-time-point-table* is a partial function mapping times onto time labels
(defparameter *inverse-time-point-table* (make-hash-table :test #'eql))

;;; WORLD TIME STUFF

(defvar *query-world-time*)		; Deliberately unbound
(defvar *query-world-time-suffix*)	; Deliberately unbound

;;; TIME FORMATTING DEFAULTS

(defvar *format-time-smallest-unit* :second
  "One of :second, :minute, :hour, :day, :month, :year")
(defvar *format-time-style* :string
  "One of :string, :krsl, nil.  Nil means no formatting.")
(defvar *format-time-include-date-p* t "Whether the date is included.")
(defvar *format-time-long-date-p* nil "t => February 22, 1958; :medium => 22-Feb-1958;  nil => 2/22/58")
(defvar *format-time-4-digit-year-p* t "t => Force 4 digit year; nil => Allow 2 digit year if w/i 45 years of current year")

;;; File = "time-build":

(defparameter *queued-world-time-instance-list* nil)

;;; File = "optimize":

;;; CARDINALITY CONSTANTS

;;;  These constants are used to record relative expected sizes of the number
;;;     of members generated by a generator in a query;  The actual numeric
;;;     values are irrelevant -- only the sizes of these constants relative
;;;     to each other matters.
;;;  Powers of two are used to facilitate later division by 2.

(defconstant $CARDINALITY-ONE$ 1)      ;; functional generator	
(defconstant $CARDINALITY-SMALL$ 4)    ;; role generator, equivalence generator
(defconstant $CARDINALITY-MEDIUM$ 8)   ;; tuple generator, user designated, temporal role
(defconstant $CARDINALITY-LARGE$ 32)   ;; concept/domain generator
(defconstant $CARDINALITY-X-LARGE$ 128)   ;; temporal concept
(defconstant $CARDINALITY-HUGE$ 1024)  ;; THING generator
(defconstant $CARDINALITY-INFINITE$ 9999)  ;; non-generator

;;; File = "queues"
(defparameter *the-unelaborated-instance* nil)


  ;;
;;;;;; Global variables used by the behavior modelling functions
  ;;


;;; File = "tasks":
;;; list containing each of the legal values of priorities specifiable 
;;;    for an operator:
(defparameter *task-priorities* nil)
;;; indicates the default priority value;
(defparameter *default-task-priority* nil)
;;; "initialize-tasks" must be called after modifying *task-priorities*:
(setq *task-priorities* (list :high :low))
(setq *default-task-priority* :high)

(defparameter *task-queue-table* nil)
(defparameter *current-task* nil)

(defparameter *undo-log* nil)
(defparameter *task-log* nil)


;;; File = "behaviors":
(defparameter *operator/option-table* nil)
(defparameter *operator/default-option-table* nil)
(defparameter *random-method-position* 0)


;;; File = "productions":
(defparameter *list-of-uncompiled-productions* nil)
(defparameter *activated-production-queue* nil)
(defparameter *activated-cohort-queue* nil)
(defparameter *suspended-by-transaction-queue* nil)


;;; File = "rete":
(defparameter *list-of-modified-rete-instances* nil)


;;; File = "utility" 
(defparameter *copyright-notice*
    "Loom Software Copyright University of Southern California, 1999.  All rights reserved.")
(defparameter *copyright-year* 1999)
(defparameter *release-version* 4.0 "Version of LOOM.")
(defparameter *release-date* "12-Jul-1999" "Date this version was released.")
(defparameter *release-status* :released "One of {:released :alpha :beta :experimental}")
(defparameter *patch-level* 0 "Ordinal number of most recent patch.")
(defparameter *patch-date* "" "Date of most recent patch.")

  ;;
;;;;;; defstructs for the TBox
  ;;

(defstruct (LOCAL-RESTRICTION (:conc-name nil) #-ti (:type VECTOR))
  local-relation
  local-qualification
  local-lower-bound
  local-upper-bound
  local-value-restrictions
  local-role-fillers
  local-non-role-fillers
  local-augmented-p
  local-subrestrictions
  classified-min-restriction
  classified-max-restriction
  classified-value-restriction
  classified-filled-by
  classified-not-filled-by
  )

(defstruct (PHANTOM-INVERSE-RELATION 
	     (:conc-name nil)
	     (:print-function print-phantom-inverse-relation))
  inverse-of-phantom )
(defun print-phantom-inverse-relation (self stream depth)
  ;; Print "self" to "stream";
  ;; Note: We can't just place a lambda expression inside of the struct
  ;;    PHANTOM-INVERSE-RELATION  because the slot "inverse-of-phantom"
  ;;    must be defined BEFORE the function is defined;
  (declare (ignore depth))
  (format stream "<inverse-of ~S>" (name (inverse-of-phantom self))) )

(defstruct (PARTITION (:conc-name nil) #-:TI (:type VECTOR))
           (partition-name nil)
	   (partition-owner nil)
	   (partition-members nil)
	   (partition-context nil)
	   (exhaustive-partition-p nil)
	   )

  ;;
;;;;;; defmetaclass
  ;;

;; FIGURE OUT IF A LITE-INSTANCE OR SURROGATE CAN HAVE ITS OWN INTRINSIC
;;    CONCEPT DIFFERENT FROM "THING":
#|
(defmacro defmetaclass (name (&rest superClasses) (&rest slotDefinitions)
                             &key intrinsic-concept)
  "Define a CLOS class that Loom will use to instantiate instances
having different intrinsic concepts."
  "NOT YET IMPLEMENTED")
|#

  ;;
;;;;;; Early utility macros, needed before service.lisp:
  ;;

(defmacro without-redefinition-warnings (&body forms)
  ;; Wrap "forms" with variable bindings that suppress compiler
  ;;   redefinition warnings;
  `(let (#+MCL     (CCL::*warn-if-redefine* nil)
         #+:EXCL   (EXCL::*redefinition-warnings* nil)
         #+(and :EXCL (or :Allegro-V4.1 :Allegro-V4.2)) (*compile-print* nil)
         #+:LUCID  (USER::*redefinition-action* nil)
         #+TI      (TICL::inhibit-fdefine-warnings t))
     ,@forms ))

;; Interface routine:

(defmacro with-time-consuming-operation (&rest body)
  ;; Show a time-consuming operation signal to the user while "body" executes;
  #+(and :MCL (not :OPENMCL))  `(CCL::with-cursor CCL:*WATCH-CURSOR* ,@body)
  #+:ACLPC `(COMMON-GRAPHICS::with-hourglass ,@body)
  #-(or (and :MCL (not :OPENMCL)) :ACLPC) `(progn ,@body))

  ;;
;;;;;; Preliminary defmethod
  ;;

;;; LOOM defines and exports its own "defmethod" macro.  However, the
;;;   it cannot be defined until relatively late in the load sequence.
;;;   Hence, we define this "dummy" version up front, thereby allowing
;;;   LOOM code to invoke "defmethod".  If we instead chose to import
;;;   the CLOS version of "defmethod" into LOOM, we would be unable to
;;;   define LOOM's own version at the appropriate time.
(defmacro defmethod (name  &body body)
  `(CLOS::defmethod ,name  ,@body) )

  ;;
;;;;;; Debugging aid
  ;;

;;; Set up the reader for conditional evaluation of debugging forms
;;; When #L"feature" is read, the next form is evaluated if 
;;;    *loom-features* contains "feature" 

(eval-when (eval compile load) 
  (defun trace-char-reader (stream subchar arg)
    (declare (ignore subchar arg))
    `(when (member ,(read stream t nil t) *loom-features*)
       ,(read stream t nil t)) )
  (set-dispatch-macro-character #\# #\L #'trace-char-reader)
  ) ;; end eval-when


;; Import this and then export it.

