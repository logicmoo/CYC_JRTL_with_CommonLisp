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

;;; PARTITIONS.LISP (TBOX)

(in-package "LOOM")

;;; This file contains procedures which operate on partitions and
;;;    exhaustive-partitions

(defun install-partition-memberships (self)
  ;; Called by "post-classify-concept";
  ;; Parse the source definitions of "self", and build structures corresponding
  ;;    to "self"s partitions and partition memberships;
  ;; Inherit partition memberships from the parents of "self";
  ;; Determine whether "self" is incoherent, and if so, propagate the incoherence
  ;;    to the dependents of "self";
  (loop for def in (source-definitions self)
        do
        (loop for tail on (cdr def) by #'cddr
	      do
	      (let ((option (validate-keyword (first tail)))
		    (argument (second tail))
		    partition)
	        (when argument
		  (case option
		    (:disjoint-covering
		     (define-disjoint-covering
		       self (parse-covering-references argument self)))
		    ((:partitions :exhaustive-partitions)
		     (loop for p in (parse-partition-expression self argument)
			   do (define-partition self (car p) (cdr p)
			        :exhaustive-p (eq option :exhaustive-partitions))))
		    (:in-partition
		     (when (setq partition (find-partition-of-member self argument))
		       (define-partition-membership partition self))))))))
  ;; inherit memberships:
  (loop for super in (super-concepts self)
        do
        (loop for inheritedMembership in (partition-memberships super)
	      do 
	      (loop for member in (cdr inheritedMembership)
		    do (add-partition-membership
		        self (car inheritedMembership) member))))
  ;; detect incoherence:
  (let ((badMembership
         (loop for membership in (partition-memberships self)
	       when (cddr membership)
               return membership)))
    (when (and badMembership
	       (not (incoherent-p self)))
      (warn-of-incoherent-concept self badMembership)
      (mark-as-incoherent self))) )
  
(defun define-partition (self partitionName partitionMembers &key exhaustive-p)	; DGB 12/30/91
  ;; Define a partition named "partitionName" which is owned by "self"
  ;;    and contains "partitionMembers";
  ;; First, make sure that no partition named "partitionName" exists in
  ;;    any kb which is hierarchically related to "self"s kb;
  ;; Then, create the new partition and enter it in "*partition-table*";
  ;; Finally, define the members of the new partition;
  (let ((selfCxt (context self))
	(entry (gethash partitionName *partition-table*))
	newPartition)
    (loop for partition in entry
	 do
	 (let ((owner (partition-owner partition))
	       (partitionCxt (partition-context partition)))
	   (cond
	     ((eq owner self)
	      (return-from define-partition nil))
	     ((or (member selfCxt (context-precedence-list partitionCxt))
		  (member partitionCxt (context-precedence-list selfCxt)))
	      (parsing-error 
		"Partition ~S cannot be owned by concept ~S because it is~%  ~
                 already owned by concept ~S in knowledge base ~S" 
		partitionName self owner partitionCxt)))))
    (setq newPartition (create-partition partitionName self selfCxt exhaustive-p))
    (setf (gethash partitionName *partition-table*) 
	  (cons newPartition entry))
    (addf (partitions self) newPartition) 
    (loop for member in partitionMembers
	 do (define-partition-membership newPartition member)) ))

(defun define-partition-membership (partition member)	; DGB 12/30/91
  ;; Define "member" to be a member of the partition named "partition";
  ;; The membership has the form (<partition> <concept>+), where <partition> is
  ;;    a partition structure, and <concept> directly specializes the owner
  ;;    of the partition;
  (pushnew member (partition-members partition))
  (when (and (exhaustive-partition-p partition)
	     (cdr (partition-members partition)))
    (uncomplete-concept (partition-owner partition))
    (install-covering-concept (partition-owner partition)))
  (add-partition-membership member partition member) )

(defun create-partition (partitionName owner knowledgeBase exhaustiveP)
  ;; Create and initialize a new partition;
  ;; Members of the partition are computed by "install-partition-memberships" 
  ;;    during post-classification;
  (let ((newPartition (or (pop *recycled-partitions*)
			  (make-PARTITION))))
    (setf (partition-name newPartition) partitionName)
    (setf (partition-owner newPartition) owner)
    (setf (partition-context newPartition) knowledgeBase)
    (setf (exhaustive-partition-p newPartition) exhaustiveP)
    newPartition ))
  
(defun discard-partition (partition)
  ;; Clear slots in "partition" and push onto recycle list;
  (progn
    (fill partition nil)
    (push partition *recycled-partitions*)
    ) )

(defun install-covering-concept (self)
  ;; Called by "install-partition-memberships";
  ;; If "self", the owner of the partition being installed, is already completed,
  ;;    then post it for recompletion;
  (when (completed-p self)
    (setq *list-of-recomplete-implies-concepts* 
	  (enqueue-for-recompletion 
	    self *list-of-recomplete-implies-concepts*))))
	
(defun find-partition-of-member (member partitionName)
  ;; Return the partition which is named "partitionName" and has 
  ;;    "member" as a member;
  ;; Issue a warning if such a partition cannot be found;
  (let ((entry (gethash partitionName *partition-table*))
	partition)
    (when (null entry) 
      (warn "Concept ~S was defined to be a member of partition ~S~%  ~
             but that partition does not exist." member partitionName)
      (return-from find-partition-of-member nil))
    (setq partition
	  (loop for part in entry
	        when (let ((owner (partition-owner part)))
		       (and (neq member owner)
		            (subconcept-p member owner)))
                return part))
    (when (null partition) 
      (warn "Concept ~S was defined to be a member of partition ~S~%  ~
             but ~S does not specialize the owner of that partition."
	    member partitionName member))
    partition ))

(defun add-partition-membership (self partition member)
  ;; If "self" has no local membership with the same partition
  ;;    as "partition", add "(list partition member)" to
  ;;    "self"s list of partition memberships;
  ;; Otherwise, add "member" to the matching local membership; 
  (let ((matchingMembership (assoc partition (partition-memberships self))))
    (if matchingMembership
	(pushnew member (cdr matchingMembership))
	(push (list partition member) (partition-memberships self))) ))

(defun merge-partition-components (mergingConcept intoConcept)  ; DGB 3/5/93
  ;; Move partition memberships from "mergingConcept" to "intoConcept";
  (let ((mergingMemberships (partition-memberships mergingConcept)))
    (loop for membership in mergingMemberships
	 do
	 (let* ((partition (first membership))
		(owner (partition-owner partition))
		(name (partition-name partition))
		(members (partition-members partition))
		(exhaustive-p (exhaustive-partition-p partition)))
	   (undefine-one-partition owner partition)
	   (define-partition owner name
	     (subst intoConcept mergingConcept members)
	     :exhaustive-p exhaustive-p))) ))

(defun undefine-partitions (self)
  ;; Remove the links between "self" and each partition that it owns;
  (loop for p in (partitions self)
       do (undefine-one-partition self p)) )

(defun undefine-one-partition (self partition)
  ;; Remove "partition" from "*partition-table*", and clear the
  ;;    hash entry for the partition's name if there are no other
  ;;    partitions having the same name (in other knowledge bases);
  (loop for mem in (partition-members partition)
       do (undefine-partition-memberships mem partition))
  (let* ((partitionName (partition-name partition))
	 (entry (gethash partitionName *partition-table*)))
    (if (cddr entry)
	(setf (gethash partitionName *partition-table*) 
	      (delf entry partition))
	(remhash partitionName *partition-table*)))
  (delf (partitions self) partition)
  (discard-partition partition) )

(defun clear-partition-memberships (self)
  ;; Remove the links between "self" and the partitions of which it
  ;;    is a member;
  (loop for (partition . nil) in (partition-memberships self)
        do (delf (partition-members partition) self))
  (setf (partition-memberships self) nil) )

(defun remove-partition-membership (self partition)
  ;; If "self" has a local membership in "partition", remove it.
  (let ((matchingMembership (assoc partition (partition-memberships self))))
    (when matchingMembership
      (delf (partition-memberships self) matchingMembership)) ))


(defun undefine-partition-memberships (self partition)
  ;; Remove the links between "self" and the "partition"
  (remove-partition-membership self partition)
  ;; Then undo the inheritance of the partition memberships!
  (loop for sc in (sub-concepts self)
      do (undefine-partition-memberships sc partition)) )

(defun form-partition-name (self)
  ;; Generate a new partition name for "self" using either "self"s name 
  ;;    or "P" suffixed with a number one higher than the current count;
  (symbol-append 
    ("$"
     (or (and (null (partitions self))
	      (name self))
	 (format nil "P~D" (incf *partition-name-counter*)))
     "$") 
    (symbol-package (name self))) )

