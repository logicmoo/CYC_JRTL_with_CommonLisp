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

;;; TIME-SUPPORT.LISP (ABOX)

(in-package "LOOM")

(export '(TIME-P TIME= TIME< TIME> TIME<= TIME>=
	  TIME-MAX TIME-MIN TIME-ADD TIME-SUB))


  ;;
;;;;;; General Time Interface for non-temporal routines.
  ;;

(defmethod add-time-value (instance slotType value change worldTime)
  (declare (ignore slotType value change worldTime))
  (grumble "Can't make a temporal assertion about instance ~A.~%~
Maybe you need the INSTANCE-WITH-TIME mixin?" instance) )

(defmethod delete-time-value (instance slotType value change worldTime)
  (declare (ignore slotType value change worldTime))
  (grumble "Can't make a temporal assertion about instance ~A.~%~
Maybe you need the INSTANCE-WITH-TIME mixin?" instance) )

  ;;
;;;;;; General Time functions
  ;;

(defun time-p (x)
  (or (numberp x)
      (member x '(INFINITY -INFINITY))))

  ;;
;;;;;; Time comparison functions
  ;;

(defun time= (x y) (eql x y))

(defun time< (x y)
  (cond ((and (numberp y) (numberp x)) (< x y))
	((eql x y) nil)
	((eq x '-INFINITY) t)
	((eq y '+INFINITY)  t)
	((eq x '+INFINITY) nil)
	((eq y '-INFINITY) nil)) )

(defun time> (x y)
  (cond ((and (numberp y) (numberp x)) (> x y))
	((eql x y) nil)
	((eq x '-INFINITY) nil)
	((eq y '+INFINITY) nil)
	((eq x '+INFINITY) t)
	((eq y '-INFINITY) t)) )

(defun time<= (x y)
  (declare (inline time<))
  (or (eql x y)
      (time< x y)) )

(defun time>= (x y)
  (declare (inline time>))
  (or (eql x y)
      (time> x y)) )

(defun time-max (x y)
  (declare (inline time>))
  (if (time> x y) x y))

(defun time-min (x y)
  (declare (inline time<))
  (if (time< x y) x y))

  ;;
;;;;;; Time arithmetic
  ;;

(defun time-sub (x y)
  (cond ((and (numberp x) (numberp y)) (- x y))
	((eq x '-INFINITY) '-INFINITY)
	((eq x '+INFINITY) '+INFINITY)
	((eq y '-INFINITY) '+INFINITY)
	((eq y '+INFINITY) '-INFINITY)
	(t (- x y))) )

(defun time-add (x y)
  (cond ((and (numberp x) (numberp y)) (- x y))
	((eq x '-INFINITY) '-INFINITY)
	((eq x '+INFINITY) '+INFINITY)
	((eq y '-INFINITY) '-INFINITY)
	((eq y '+INFINITY) '+INFINITY)
	(t (+ x y))) )


;; SHOULD THIS BE IN A MORE GENERAL UTILITY FILE?

  ;;
;;;;;; Multiple Choice CError Signaler & Handlers
  ;;


(defun break-into-lines (string)
  ;; Breaks "string" into a list of lines.  Lines are delimited in the
  ;;   string by either "~%" or #\Return;
  (let ((start 0)
	(end nil)
	(delta nil)
	(length (length string)))
    (loop for tildePercentPosition = (search "~%" (subseq string start))
	  as returnPosition = (position #\Return (subseq string start))
	  do (cond ((and tildePercentPosition returnPosition)
		    (if (< tildePercentPosition returnPosition)
			(setq end tildePercentPosition
			      delta 2)
			(setq end returnPosition
			      delta 1)))
		   (tildePercentPosition
		    (setq end tildePercentPosition
			  delta 2))
		   (returnPosition
		    (setq end returnPosition
			  delta 1))
		   (t (setq end nil)))
	  collect (subseq string start (and end (+ start end)))
	  until (null end)
	  do (incf start (+ end delta))
	  until (>= start length))))

(defun pad-return-characters-in-format-string (string padLength)
  ;; Adds "padLength" space characters after every return (~%) string
  ;;   in "string".  Also handles the #\Return character;
  (format nil (format nil "~~{~~A~~^~~~~%~v@T~~}" padLength) (break-into-lines string)))

(defun multiple-choice-read (choiceList)
  (let ((n (length choiceList))
	(choice nil))
    (loop do (format *debug-io* "~%Choose an item from this list (by number):")
	     (format *debug-io* "~% 0: Enter the Debugger")
	     (loop for i upfrom 1
		   for item in choiceList
		   do (format *debug-io* "~%~2D: " i)
		      (if (consp item)
			  (apply #'format *debug-io*
				 (if (stringp (car item))
				     (pad-return-characters-in-format-string (car item) 4)
				     (car item))
				 (cdr item))
			  (format *debug-io* "~A" (if (stringp item)
						      (pad-return-characters-in-format-string item 4)
						      item))))
	     (format *debug-io* "~%==> ")
	     (setf choice (read *debug-io*))
       until (and (integerp choice) (<= 0 choice n))
	  do (format *debug-io* "~2&~D is not between 0 and ~D.  Pick again."
		     choice n))
    choice))

(defun multiple-choice-cerror (choiceList errorMessage &rest formatArgs)
  (let ((choice 0))
    (loop while (zerop choice)
	  do (format *debug-io* "~%Error: ~?" errorMessage formatArgs)
	     (setf choice (multiple-choice-read choiceList))
	     (when (zerop choice)
	       (apply #'cerror "Choose a repair action from the list of options."
		      errorMessage formatArgs))
	     )
    choice))



