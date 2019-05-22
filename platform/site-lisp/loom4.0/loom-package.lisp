;;; -*- Mode: LISP; Syntax: COMMON-LISP; Package: COMMON-LISP-USER; Base: 10. -*-

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                             ;
;  Copyright (c) 1988, 1995, 2003 University of Southern California           ;
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
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 

;;; LOOM-PACKAGE.LISP ()


;;; This file sets up the package structure for the LOOM system.
;;; NOTE: This file must be evaluated before it is compiled (and in fact
;;;    LOOM doesn't bother to compile it at all).

(in-package "COMMON-LISP-USER")


  ;;
;;;;;; "defpackage"
  ;;

;;; Create the macro "defpackage" if it is not implemented in the
;;;    host Common Lisp OR if it is implemented, but not according
;;;    CLtL II (e.g., the TI version violates the standard):
#+:TI (shadow 'DEFPACKAGE "COMMON-LISP-USER")

(unless (fboundp 'COMMON-LISP-USER::defpackage)
  (eval 
    '(defmacro defpackage (package-name &body alist-of-options)
       "Expand to code that simulates the behavior of `defpackage' as defined in
CLtL2.  Note, in order to make `defpackage' a top level form, this version
sacrifices the ability to return the new package object, i.e., it always
returns NIL."
       (make-top-level-form
	 `(defpackage ,package-name)
	 '(compile load eval)
	 (expand-defpackage package-name alist-of-options)))
    )) ;; end unless-eval

(defun expand-defpackage (packageName options)
  ;; Helping function for "defpackage";
  ;; Expands to form that mimics the real "defpackage";
  (let (useList nickNames shadowList shadowImportListList
	importListList internList exportList)
    (when (symbolp packageName)
      (setq packageName (symbol-name packageName)))
    (dolist (entry options)
      (ecase (first entry)
	(:use
	 (setq useList
	       (append useList (rest entry))))
	(:nicknames
	 (setq nickNames
	       (append nickNames (rest entry))))
	(:shadow
	 (setq shadowList
	       (append shadowList (rest entry))))
	(:shadowing-import-from
	 (setq shadowImportListList
	       (append shadowImportListList
		       (list (rest entry)))))
	(:import-from
	 (setq importListList
	       (append importListList (list (rest entry)))))
	(:intern
	 (setq internList (append internList (rest entry))))
	(:export
	 (setq exportList (append exportList (rest entry))))))
    `(let* ((savePackage *package*)
	    (newPackage (in-package ,packageName :use NIL)))
       ,@(when shadowList
	   `((shadow (symbol-names-to-symbols ',shadowList newPackage)
		     newPackage)))
       ,@(let (result)
	   (dolist (entry shadowImportListList)
	     (push
	       `(shadowing-import 
		  (symbol-names-to-symbols ',(rest entry) ',(first entry)
					   :cerror-p t)
		  newPackage)
	       result))
	   (reverse result))
       ,@(when useList
	   `((use-package ',useList newPackage)))
       ,@(when nickNames
	   `((in-package ,packageName :nicknames ',nickNames)))
       ,@(let (result)
	   (dolist (entry importListList)
	     (push
	       `(import 
		  (symbol-names-to-symbols ',(rest entry) ',(first entry)
					   :cerror-p t)
		  newPackage)
	       result))
	   (reverse result))
       ,@(let (result)
	   (dolist (string internList)
	     (push
	       `(intern ,string ,packageName)
	       result))
	   (reverse result))
       ,@(when exportList
	   `((export (symbol-names-to-symbols ',exportList newPackage)
		     newPackage)))
       (in-package (package-name savePackage))	; DGB 6/17/91
       newPackage) ))

(defun symbol-names-to-symbols (symbolNameList withPackage &key cerror-p)
  ;; Helping function for "expand-defpackage";
  ;; For each item in "symbolNameList", it its a symbol, return it;
  ;; Otherwise, assume its a string, and return a symbol with the
  ;;    same name that is visible from "withPackage";
  ;; New symbols are created when necessary;
  (let (result)
    (dolist (symbolName symbolNameList)
      (push
	(etypecase symbolName
	  (SYMBOL symbolName)
	  (STRING
	   (let ((symbol (find-symbol symbolName withPackage)))
	     (when (null symbol)
	       (when cerror-p
		 (cerror "Intern ~S into the package ~S and continue with `defpackage'."
			 "Error while importing: Symbol ~S not found in the package ~S."
			 symbolName withPackage symbolName withPackage))
	       (setq symbol (intern symbolName withPackage)))
	     symbol)))
	result))
    (reverse result) ))

;;; "make-top-level-form" is borrowed from PCL sources;  It is used
;;;    to permit definition of macros that evaluate at compile themselves
;;;    at compile time, i.e., you don't have to wrap eval-when's around
;;;    them.
;(defun make-top-level-form (name times form)
;  (progn
;    name
;    (make-progn
;      `(eval-when ,times ,form)
;      #-(or GCLisp :coral)
;      '(eval-when ()))))

(defun make-top-level-form (name situations form)
  #-:allegro-v4.1
  (progn
    name
    (make-progn
      `(eval-when ,situations ,form)
      #-(or GCLisp :coral)
      '(eval-when ())))
  #+:allegro-v4.1
  (declare (ignore name))
  #+:allegro-v4.1
  (let (newSituations)
    (loop for sit in situations
	  do
	  (push 
	    (case sit
	      ((:compile-toplevel :load-toplevel :execute)
	       sit)
	      (compile :compile-toplevel)
	      (load :load-toplevel)
	      (eval :execute))
	    newSituations))
    `(eval-when ,newSituations ,form)
    ))

(defun make-progn (&rest forms)
  (let ((progn-form nil))
    (labels ((collect-forms 
	       (forms)
	       (unless (null forms)
		 (collect-forms (cdr forms))
		 (if (and (listp (car forms))
			  (eq (caar forms) 'progn))
		     (collect-forms (cdar forms))
		     (push (car forms) progn-form)))))
      (collect-forms forms)
      (cons 'progn progn-form))))


;;; Package renaming:


;;; MCL and ACLPC don't have a separate CLOS package, since CLOS is built-in.
;;; In MCL add the nickname to CCL, because we need clos::class-prototype
#+:MCL(rename-package "CCL"  "CCL" (cons "CLOS" (package-nicknames "CCL")))

#+(or :ACLPC :CMU17)
(rename-package "COMMON-LISP"  "COMMON-LISP"
		(cons "CLOS" (package-nicknames "COMMON-LISP")))

;;; If using PCL instead of CLOS, add CLOS nickname, etc.
(when (and (not (find-package "CLOS"))  (find-package "PCL"))
  (rename-package (find-package "PCL") "PCL"
                  (cons "CLOS" (package-nicknames "PCL"))))
#+(and :PCL (not :CMU17)) (setq CLOS::*inhibit-with-slots-warning* t)


;;; Note: The exported symbols listed within the defpackage for KBCLASSES
;;;    are defined within the file "macros.lisp".  Some of the symbols are 
;;;    CLOS functions that we redefine, while others are commonly-implemented
;;;    extensions to Lisp. Additional shadowing may be necessary to protect
;;;    from non-standard Lisps that export some of the latter symbols.

;;; Note: Both the KBCLASSES and LOOM files export many symbols not listed
;;;    here.  Export lists appear at the top of the files containing the
;;;    definitions for exported functions, methods, and variables.  The
;;;    partial export list defined for KBCLASSES is placed up front to catch
;;;    conflicts with non-standard Lisps early on.

(defpackage "KBCLASSES" (:use "COMMON-LISP")
  (:shadow "IF" "DEFCLASS" "CLASS-OF" #+:lispworks "TYPES")
  (:import-from "COMMON-LISP-USER" "MAKE-TOP-LEVEL-FORM")
  (:export 			; defined in "kbclasses/prep.lisp":
    "NEQ" "ASSQ" "DELQ"
    "INTEGRITY-CHECK"
    "ONCE-ONLY"
    "STRING-APPEND" "SYMBOL-APPEND" "QUOTED-P" "FUNCTION-P" "PUSH-LAST")
  #+(and :Genera :rel8) 
    (:shadowing-import-from "CLOS" "SETF")
  #+(and :CMU :PCL (not :ANSI-CL))
    (:import-from "PCL" "CALL-NEXT-METHOD" "PRINT-OBJECT" "SLOT-VALUE" "FIND-CLASS" 
		  "SLOT-MISSING" "CHANGE-CLASS" "MAKE-INSTANCE" "DEFMETHOD")	; DGB 4/14/92
  #+(or :lcl3.0 :lcl4.0)
    (:import-from "CLOS" "CALL-NEXT-METHOD" "PRINT-OBJECT" "SLOT-VALUE" "FIND-CLASS"
		  "SLOT-MISSING" "CHANGE-CLASS" "MAKE-INSTANCE" "DEFMETHOD")	; DGB 4/14/92
  )

(defpackage "LOOM" (:use "COMMON-LISP" "KBCLASSES") 
  (:shadowing-import-from "KBCLASSES"      ; defined in "kbclasses/prep.lisp":
			  "IF" "DEFCLASS" "CLASS-OF"
			   #+:lispworks "TYPES")
  (:import-from "COMMON-LISP-USER"
		"MAKE-TOP-LEVEL-FORM" CL-USER::*LOOM-DEFAULT-FEATURES*)
  #+(and :Genera :rel8)
    (:shadowing-import-from "CLOS" "SETF")
  #+(and :CMU :PCL (not :ANSI-CL))
    (:import-from "PCL" "CALL-NEXT-METHOD" "PRINT-OBJECT" "SLOT-VALUE" 
		  "FIND-CLASS" "SLOT-MISSING" "CHANGE-CLASS" "MAKE-INSTANCE")
  #+(or :lcl3.0 :lcl4.0)
    (:import-from "CLOS" "CALL-NEXT-METHOD" "PRINT-OBJECT" "SLOT-VALUE"
		  "FIND-CLASS" "SLOT-MISSING" "CHANGE-CLASS" "MAKE-INSTANCE")
  #+(or :LCL4.0 :LCL4.1)
    (:import-from "LCL" "HASH-TABLE-TEST" "HASH-TABLE-SIZE"
		  "HASH-TABLE-REHASH-SIZE" "HASH-TABLE-REHASH-THRESHOLD")
    #+:LCL5.0
    (:import-from "LCL" "HASH-TABLE-TEST" "HASH-TABLE-SIZE" 
		  "HASH-TABLE-REHASH-SIZE" "HASH-TABLE-REHASH-THRESHOLD"
		  "IGNORE-ERRORS" "READTABLE-CASE")
  #+:ACLPC
    (:import-from "ACL" "HASH-TABLE-TEST" "HASH-TABLE-SIZE"
		  "HASH-TABLE-REHASH-SIZE" "HASH-TABLE-REHASH-THRESHOLD")
  (:shadow "TRACE" "UNTRACE" "DEFMETHOD" "INITIALIZE-INSTANCES" "FIND-METHOD" 
	   "PI" "SET")
  )

(pushnew :LOOM *features*)
(pushnew :LOOM4 *features*)
(pushnew :LOOM4.0 *features*)

;;; TI has both CLOS and TICLOS packages.  We need to import some of the TICLOS symbols
;;; into the 

#+:TI (import '(TICLOS::parameter-specializers) "CLOS")

;;; Stop declaration warnings for non-standard declarations:
#+(or :MCL (and :EXCL (or :DRAFT-ANSI-CL-2 :CLTL2)))
  (declaim (declaration loom::arglist))
#+(or :lucid :aclpc :clisp :cmu) (proclaim `(declaration loom::arglist))
#+:aclpc (proclaim '(declaration loom::dynamic-extent))
