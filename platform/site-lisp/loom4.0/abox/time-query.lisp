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

;;; TIME-QUERY.LISP (ABOX)

(in-package "LOOM")
  ;;
;;;;;; Generation functions for :becomes, :ceases, :detects & :undetects
  ;;

(defun generate-plausible-transitions (instance conceptOrRelation agentTime)
  ;; Returns all plausible times when "instance" could have had a change
  ;;   in "conceptOrRelation".  These times will need to be filtered to
  ;;   find actual transitions due to derived information;
  ;; Tricky:  Concept TEMPORAL-INCOHERENT must be handled as a special
  ;;   case since it is determined at a low level in the data structure;
  (declare (inline generate-typed-world-transitions))
  (cond ((eq conceptOrRelation (loom-constant TEMPORAL-INCOHERENT))
         (generate-temporal-incoherent-transitions instance agentTime))
        ((implied-computed-features conceptOrRelation)
         ;; Use this because we don't know how to derive more specific
         ;;   bounds for computed feature depend-ons; TAR 10/5/93
         (generate-all-world-transitions instance agentTime))
        (t
         (generate-typed-world-transitions instance
				      (temporal-depend-ons conceptOrRelation)
				      agentTime
                                      nil))) )

(defun generate-plausible-world-role-transitions (instance relation agentTime)
  (declare (inline generate-plausible-transitions))
  (generate-plausible-transitions instance relation agentTime))

(defun generate-becomes-concept (instance concept agentTime)
  ;; Generate all possible times!
  (declare (inline generate-plausible-transitions))
  (generate-plausible-transitions instance concept agentTime) )

(defun generate-ceases-concept (instance concept agentTime)
  ;; Generate all possible times!
  (declare (inline generate-plausible-transitions))
  (generate-plausible-transitions instance concept agentTime) )

(defun generate-becomes-relation (instance relation agentTime)
  ;; Generate all possible times!
  (declare (inline generate-plausible-transitions))
  (generate-plausible-transitions instance relation agentTime) )

(defun generate-ceases-relation (instance relation agentTime)
  ;; Generate all possible times!
  (declare (inline generate-plausible-transitions))
  (generate-plausible-transitions instance relation agentTime) )


  ;;
;;;;;; Methods specialized on TIME-MAP for temporal queries.
  ;;

;; GET-SLOT-VALUE, GET-SLOT-VALUES, HAS-INSTANCE-P and FIND-TYPE&RESIDUE-FEATURES


(defmethod has-instance-p ((concept UNARY-CONCEPT) (instance TIME-MAP))
  ;; Situation: *query-agent-time* and *query-world-time* must both be bound.
  ;; If "concept" is temporal, then we need to do a time map lookup to see
  ;;    if "instance" belongs to "concept".
  ;;    Otherwise, we need to pass the function on to the regular
  ;;      (non-temporal) version.
  (if (temporal-p concept)
      (or (has-direct-slot-value instance
				 :type concept) ;tar 4/22/93 
	  (has-bc-instance-p concept (real-instance instance)
			     nil nil))	;tar 1/8/93  
      (has-instance-p concept
		      (get-agent-time-offset-instance 
			(real-instance instance)))) )

(defmethod get-slot-value ((instance TIME-MAP) relation)
  ;; Situation: *query-agent-time* and *query-world-time* must both be bound.
  ;; We need to find the appropriate object for the slot (relation) and
  ;;    test to make sure it is temporal.  If it isn't, then we need
  ;;    to pass the function on to the regular (non-time map code)
  (if (temporal-p relation)
    (if (role-is-single-valued-p relation)	; tar 4/26/93
      (first (direct-slot-value instance relation))
      (direct-slot-value instance relation))	; tar 4/22/93
    (get-slot-value (get-agent-time-offset-instance 
                     (real-instance instance))
                    relation)) )
  
(defmethod get-slot-values ((instance TIME-MAP) relation)
  ;; Situation: *query-agent-time* and *query-world-time* must both be bound.
  ;; We need to find the appropriate object for the slot (relation) and
  ;;    test to make sure it is temporal.  If it isn't, then we need
  ;;    to pass the function on to the regular (non-time map code)
  (if (temporal-p relation)
    (direct-slot-value instance relation)	; tar 4/22/93
    (get-slot-values (get-agent-time-offset-instance 
                      (real-instance instance))
                     relation)) )

(defmethod find-type&residue-features ((self TIME-MAP))
  ;; Return two values for "self":
  ;;    (1) the unification of the asserted list of conjuncts, including
  ;;  the non-temporal ones;
  ;;    (2) any non-temporal residue features (temporal instances don't
  ;;   have attached features);
  (multiple-value-bind (atemporalType atemporalResidue)
      (find-type&residue-features (get-agent-time-offset-instance
				   (real-instance self)))
    (values
     (compute-unified-type
      (most-specific-conjuncts
       (most-specific-concepts
	(cons atemporalType
	      (mapcar #'find-concept (direct-slot-value self :type)))))
      (intrinsic-concept (real-instance self)))
     atemporalResidue) ))

(defmethod get-cached-types ((self TIME-MAP))
  ;; Return the cached types for "self", including the non-temporal ones;
  (let ((atemporalTypes
         (get-cached-types (get-agent-time-offset-instance
                            (real-instance self)))))
    (append (mapcar #'find-concept (direct-slot-value self :type))
            atemporalTypes) ))

