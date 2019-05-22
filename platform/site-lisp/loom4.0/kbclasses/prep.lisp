;;; -*- Mode: LISP; Syntax: Common-lisp; Package: KBCLASSES; Base: 10. -*-

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
 
;;; PREP.LISP (KBCLASSES)

;;; This file is the first of the KB-CLASSES files to be read --
;;;    it is compiled and loaded before any other files are processed.
;;; It defines some macros that are conceptually best considered as extensions
;;;    to Common Lisp.

(in-package "KBCLASSES")

(export '(grumble complain inform obsolete obsolete-argument))


  ;;
;;;;;; Convenient utility macros:
  ;;

(defmacro neq (x y) `(not (eq ,x ,y)) )

;;; Requiring the use of "if" to mean "if-then-else":
(defmacro if (test then &rest elseList)
  (when (null elseList)
    ;; if "elseList" is missing, warn against use unless we detect
    ;;    code indicating that some sort of macro expansion has
    ;;    generated the use of the "if":
     (unless (or (and (listp then)
		      (member (car then) '(let progn)))
		 (and (listp test)
		      (member (car test) '(progn))))
       (warn "LOOM requires the 'if' form to have an 'else' clause")))
  (when (cdr elseList)
    (error "LOOM requires the else part of an 'if' form to be a single form"))
  `(COMMON-LISP:if ,test ,then ,@elseList) )


  ;;
;;;;;; "integrity-check"
  ;;

(defmacro integrity-check (assertion &key message)
  ;; Generate an error if "assertion" is not true;
  ;; Replace this with a null body when speed becomes essential:
  `(or ,assertion
       (emit-integrity-check-warning
	 ',assertion ,message)) )

(defun emit-integrity-check-warning (assertion message)
  ;; Helping function for "integrity-check";
  ;; Generate an error message warning of an integrity check violation;
  (if message
      (cerror "Continue running LOOM""~S" message)
      (cerror "Continue running LOOM" "Integrity check violated -- not true that:~
                       ~%   ~S" assertion)) )

  ;;
;;;;;; For Loops
  ;;

;(defmacro for (&rest bodyOfFor)
;  (let ((keyword 
;	  (loop for k in '(collect append thereis)
;		thereis (find k bodyOfFor :test #'eq))))
;    (case keyword
;      ((collect append)
;       ;; code depends on "collect" or "append" being the last keyword
;       (setq bodyOfFor
;	     (loop for tail on bodyOfFor
;		   append
;		   (COMMON-LISP:if (eq (car tail) keyword)
;			  (prog1 `(,keyword (progn ,@(cdr tail)))
;			    (setq tail nil))
;			  (list (car tail))))))
;      (thereis
;       ;; code depends on "thereis" being the last keyword AND on the
;       ;;    iteration variable immediately succeeding the initial "for"
;       (setq bodyOfFor
;	     (loop for tail on bodyOfFor
;		   append
;		   (COMMON-LISP:if (eq (car tail) keyword)
;			  (prog1 `(,keyword (when (progn ,@(cdr tail))
;					      (return ,(car bodyOfFor))))
;			    (setq tail nil))
;			  (list (car tail)))))))
;    `(loop for ,@bodyOfFor) ))


  ;;
;;;;;; "once-only", "make-top-level-form"
  ;;

;;; "once-only" is borrowed from PCL, which borrowed it from Zeta-lisp
(defmacro once-only (arguments &body body)
  ;; Used to prevent multiple side-effects when an argument to a
  ;;    macro is evaluated;
  ;; For each argument in "arguments", if it is not atomic, wrap
  ;;    a "let" form around "body", assign the argument to a gensym
  ;;    variable, and substitute the gensym inside of "body"
  (let ((gensymVariable (gensym))
	(runTimeArgs (gensym))
	(runTimeValues (gensym))
	(expandTimeValueForms nil))
    (loop for var in arguments
	  do
	  (push
	    `(if (or (symbolp ,var)
		     (numberp ,var)
		     (and (listp ,var)
			  (member (car ,var) '(quote function))))
		 ,var 
		 (let ((,gensymVariable (gensym)))
		   (push ,gensymVariable ,runTimeArgs)
		   (push ,var ,runTimeValues)
		   ,gensymVariable))
	    expandTimeValueForms))
    `(let* (,runTimeArgs
	    ,runTimeValues
	    (wrappedBody
	      (let ,(loop for arg in arguments
			  as form in (reverse expandTimeValueForms)
			  collect (list arg form))
		,@body)))
       (if (loop for value in ,runTimeValues
		 always (or (symbolp value) (numberp value)))
	   ,@body
	   `(let ,(loop for arg in (reverse ,runTimeArgs)
			as value in (reverse ,runTimeValues)
			collect (list arg value))
	      ,wrappedBody))) ))


  ;;
;;;;;; Useful utility functions
  ;;

(defun string-append (&rest strings&symbols)
  ;; Return a string consisting of the concatenation of the members
  ;;    of "strings&symbols", where each member is coerced into a string
  (apply #'concatenate 'string
	 (loop for s in strings&symbols collect (string s))) )

(defmacro symbol-append ((&rest strings&symbols) packageName)
  ;; Return a symbol which is the concatenation of the atoms in
  ;;    "strings&symbols"
  (if (stringp packageName)
      `(intern (string-upcase (string-append ,@strings&symbols)) 
	       ,packageName)
      `(intern (string-upcase (string-append ,@strings&symbols)) 
	       (or ,packageName (package-name *package*)))))

#+(or :CLTL2 :ANSI-CL) (declaim (inline quoted-p))
#-(or :CLTL2 :ANSI-CL) (proclaim '(inline quoted-p))
(defun quoted-p (lispForm)
  ;; Return t iff "lispForm" is quoted;
  (and (consp lispForm)
       (eq (first lispForm) 'quote)) )

#+(or :CLTL2 :ANSI-CL) (declaim (inline function-p))
#-(or :CLTL2 :ANSI-CL) (proclaim '(inline function-p))
(defun function-p (lispForm)
  ;; Return t iff "lispForm" is a function expression;
  (or (typep lispForm 'FUNCTION)
      (and (consp lispForm)
	   (eq (first lispForm) 'function))) )

(defmacro push-last (item place)
  ;; Append "item" to the end of the list "place"
  `(setf ,place (nconc ,place (list ,item))) )

  ;;
;;;;;; Communication with users in unusual situations.
  ;;


(defmacro grumble (message &rest formatArgs)
  "Macro for producing formatted warning and error output using `WARN'."
  `(or (member :suppress-diehard-output LOOM::*loom-dialogue-features*)
       (warn ,message ,@formatArgs)) )

(defmacro complain (message &rest formatArgs)
  "Macro for producing formatted warning and error output."
  `(or (member :suppress-diehard-output LOOM::*loom-dialogue-features*)
       #+:cltl2(let ((*print-readably* nil))
		 (format *error-output* ,message ,@formatArgs))
       #-:cltl2(format *error-output* ,message ,@formatArgs)) )

(defmacro inform (message &rest formatArgs)
  "Macro for producing formatted information and trace output."
  `(or (member :suppress-diehard-output LOOM::*loom-dialogue-features*)
       #+:cltl2(let ((*print-readably* nil))
		 (format *trace-output* ,message ,@formatArgs))
       #-:cltl2(format *error-output* ,message ,@formatArgs)) )

(defmacro obsolete (name &optional newName)
  ;; Warns of obsolete usage;
  `(when (member :warn-about-syntax-corrections LOOM::*loom-dialogue-features*)
     (inform "~%~A is obsolete.~@[  Use ~A instead.~]"
             ',name ',newName)) )

(defmacro obsolete-argument (functionName oldArgument &optional newArgument
								transformFunction )
  ;; Warns of obsolete argument usage and performs a transformation to
  ;;   the new argument;
  `(when ,oldArgument
     (when (member :warn-about-syntax-corrections LOOM::*loom-dialogue-features*)
       (inform "~%Argument ~A to ~A is obsolete.~@[  Use ~A instead.~]"
               ',oldArgument ',functionName ',newArgument))
     ,@(when newArgument
         `((unless ,newArgument
             (setq ,newArgument
	       ,(if transformFunction
		    `(funcall ,transformFunction ,oldArgument)
		  oldArgument)))))) )

