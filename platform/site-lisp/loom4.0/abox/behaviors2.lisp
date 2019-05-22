;; -*- Mode: LISP; Syntax: Common-lisp; Package: LOOM; Base: 10. -*-

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1999, 2003 University of Southern California                 ;
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


;;; BEHAVIORS2 (ABOX)


;;; CONTAINS PIECES OF CODE FOR ADDING "deffilter" AND FOR
;;;    GENERATING METHOD SEQUENCES


;;; THIS CODE MAINLY RENAMES :missing-method TO :on-missing-method, ETC.

(setq *operator/option-table*
      '((:filters
	  (:overrides :most-specific :last-one
			:select-one :select-all :error :warning)
	  filters)
	(:on-missing-method
	  (:warning :no-op :error :suspend)
	  on-missing-method-option)
	;; THIS IS JUST A PLACE HOLDER:
	(:on-failed-method				; RMM 12/18/89
	  (:fail :retry)
	  on-failed-method-option)))

(setq *operator/default-option-table*
      '((:filters (:preferences :most-specific :last-one))
	(:on-missing-method :warning)))

(defmacro defoperator (name typesOfParameters
		       &key filters on-missing-method on-failed-method)
  #+TI `(TI-redefine-operator ',name ',typesOfParameters 
			      :filters ',filters :on-missing-method ',on-missing-method)
  #-TI `(redefine-operator ',name ',typesOfParameters 
			   :filters ',filters :on-missing-method ',on-missing-method)
  )

;----------------------------------------------------------------------------
  ;;
;;;;;; Filters
  ;;

;;; *filter-table* is an association list ...
(defparameter *filter-table* nil)

(eval-when (compile load eval)
  (defmacro deffilter (filterKeyword (methodsVariable) &body body)
    ;;
    `(define-filter ',filterKeyword ',`(lambda (,methodsVariable) ,@body)) )
  
  (defun define-filter (filterKeyword lambdaDefinition)
    ;;
    (let ((filtersEntry (assoc :filters *operator/option-table*)))
      (when (not (keywordp filterKeyword))
	(error "Illegal filter name `~S' -- the name of a filter must be a keyword."
	       filterKeyword))
      (pushnew filterKeyword (second filtersEntry))
      ;...
      ))
  ) ;; end eval-when

(deffilter :most-specific (methods)
  ;; Return the most-specific of the methods in "methods", determined
  ;;    by the specificity of their situation patterns;
  (for m in methods do (setf (marked-p m) nil))
  (for m in methods
       when (not (marked-p m))
       do
       (for reject in (less-specific-methods m)
	    do (setf (marked-p reject) t)))
  (for m in methods
       when (not (marked-p m))
       collect m) )


(deffilter :last-one
  :input-variable methods
  :
  (for m in (methods (operator (car methods)))
       when (member m methods)
       do (return (list m))) )



(deffilter :last-one (methods)
  ;; Return the method closest to the front of the list of
  ;;    methods attached the operator -- this was the most
  ;;    recently-defined method; 
  (for m in (methods (operator (car methods)))
       when (member m methods)
       do (return (list m))) )

(defun generate-methods (candidateMethods filters operator arguments &key generator-body)
  ;;
  ;; TO DO: CONSIDER ADDING PARAMETER TO PERFORM ALL SUCCESSFUL METHODS (ORDERED
  ;;    FROM BEST TO WORST) -- POSSIBLY THIS ISN'T OF ANY USE;
  (let ((level 0)
	(deepestLevel (length filters))
	(state (make-array 5))
	(more-to-come-p (make-array 5))
	methods)
    (flet ((apply-ith-filter
	     ()
	     (let (moreToComeP)
	       (multiple-value-setq (methods moreToComeP)
		 (funcall (nth level filters) methods state[level]))
	       (setf more-to-come-p[level] moreToComeP)))
	   (perform-one-method
	     ()
	     (multiple-value-bind (value successP)
		 (apply-operator operator arguments)
	       (when successP
		 (return-from generate-methods value))))
	   (backtrack
	     ()
	     (loop
	       (when (<= level 1)
		 (return-from generate-methods :fail))
	       (decf level)
	       (when more-to-come-p[level]	; successful backtrack
		 (apply-ith-filter)
		 (return)))))
      (setq methods candidateMethods)
      (loop
	(cond
	  ((null methods)
	   (backtrack))
	  ((and (cdr methods)
		(< level deepestLevel))
	   (incf level)
	   (integrity-check (setq state[level] nil))
	   (apply-ith-filter))
	  (t
	   (for m in methods
		do (perform-one-method))))))))


;;; BEHAVIORS2 (ABOX)


;;; CONTAINS PIECES OF CODE FOR ADDING "deffilter" AND FOR
;;;    GENERATING METHOD SEQUENCES


;;; THIS CODE MAINLY RENAMES :missing-method TO :on-missing-method, ETC.

(setq *operator/option-table*
      '((:filters
	  (:overrides :most-specific :last-one
			:select-one :select-all :error :warning)
	  filters)
	(:on-missing-method
	  (:warning :no-op :error :suspend)
	  on-missing-method-option)
	;; THIS IS JUST A PLACE HOLDER:
	(:on-failed-method				; RMM 12/18/89
	  (:fail :retry)
	  on-failed-method-option)))

(setq *operator/default-option-table*
      '((:filters (:preferences :most-specific :last-one))
	(:on-missing-method :warning)))

(defmacro defoperator (name typesOfParameters
		       &key filters on-missing-method on-failed-method)
  #+TI `(TI-redefine-operator ',name ',typesOfParameters 
			      :filters ',filters :on-missing-method ',on-missing-method)
  #-TI `(redefine-operator ',name ',typesOfParameters 
			   :filters ',filters :on-missing-method ',on-missing-method)
  )

;----------------------------------------------------------------------------
  ;;
;;;;;; Filters
  ;;

;;; *filter-table* is an association list ...
(defparameter *filter-table* nil)

(eval-when (compile load eval)
  (defmacro deffilter (filterKeyword (methodsVariable) &body body)
    ;;
    `(define-filter ',filterKeyword ',`(lambda (,methodsVariable) ,@body)) )
  
  (defun define-filter (filterKeyword lambdaDefinition)
    ;;
    (let ((filtersEntry (assoc :filters *operator/option-table*)))
      (when (not (keywordp filterKeyword))
	(error "Illegal filter name `~S' -- the name of a filter must be a keyword."
	       filterKeyword))
      (pushnew filterKeyword (second filtersEntry))
      ;...
      ))
  ) ;; end eval-when

(deffilter :most-specific (methods)
  ;; Return the most-specific of the methods in "methods", determined
  ;;    by the specificity of their situation patterns;
  (for m in methods do (setf (marked-p m) nil))
  (for m in methods
       when (not (marked-p m))
       do
       (for reject in (less-specific-methods m)
	    do (setf (marked-p reject) t)))
  (for m in methods
       when (not (marked-p m))
       collect m) )


(deffilter :last-one
  :input-variable methods
  :
  (for m in (methods (operator (car methods)))
       when (member m methods)
       do (return (list m))) )



(deffilter :last-one (methods)
  ;; Return the method closest to the front of the list of
  ;;    methods attached the operator -- this was the most
  ;;    recently-defined method; 
  (for m in (methods (operator (car methods)))
       when (member m methods)
       do (return (list m))) )

(defun generate-methods (candidateMethods filters operator arguments &key generator-body)
  ;;
  ;; TO DO: CONSIDER ADDING PARAMETER TO PERFORM ALL SUCCESSFUL METHODS (ORDERED
  ;;    FROM BEST TO WORST) -- POSSIBLY THIS ISN'T OF ANY USE;
  (let ((level 0)
	(deepestLevel (length filters))
	(state (make-array 5))
	(more-to-come-p (make-array 5))
	methods)
    (flet ((apply-ith-filter
	     ()
	     (let (moreToComeP)
	       (multiple-value-setq (methods moreToComeP)
		 (funcall (nth level filters) methods state[level]))
	       (setf more-to-come-p[level] moreToComeP)))
	   (perform-one-method
	     ()
	     (multiple-value-bind (value successP)
		 (apply-operator operator arguments)
	       (when successP
		 (return-from generate-methods value))))
	   (backtrack
	     ()
	     (loop
	       (when (<= level 1)
		 (return-from generate-methods :fail))
	       (decf level)
	       (when more-to-come-p[level]	; successful backtrack
		 (apply-ith-filter)
		 (return)))))
      (setq methods candidateMethods)
      (loop
	(cond
	  ((null methods)
	   (backtrack))
	  ((and (cdr methods)
		(< level deepestLevel))
	   (incf level)
	   (integrity-check (setq state[level] nil))
	   (apply-ith-filter))
	  (t
	   (for m in methods
		do (perform-one-method))
	   ;; if we reach here, none of the methods succeeded
	   (when more-to-come-p[level]
	     (apply-ith-filter))))) )))

