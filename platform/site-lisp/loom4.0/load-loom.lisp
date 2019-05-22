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
 

;;; LOAD-LOOM.LISP ()

;;; Load all files necessary to install the LOOM system.

(unless (find-package "COMMON-LISP")
  (rename-package (find-package "LISP") "LISP" '("COMMON-LISP" "CL")))
(unless (find-package "COMMON-LISP-USER")
  (rename-package (find-package "USER") "USER" '("COMMON-LISP-USER" "CL-USER")))

(in-package "COMMON-LISP-USER")

(push :use-units *features*)

;; Make a pathname pointing to the top of the Loom directories hierarchy:
;;
;;***************************************************************************
;;*                                                                         *
;;*  IMPORTANT NOTE:  NON-ISI USERS MUST CHANGE THE FOLLOWING DEFVAR!       *
;;*                                                                         *
;;***************************************************************************
;;
;; Use the following as a guide:
;;
;;(defvar *loom-pathname-default*
;;        (make-pathname :directory #<your top-level LOOM directory>
;;                       :defaults nil))
;;
;;  and delete the following definition:
;;
(defvar *loom-pathname-default*
    (make-pathname :name NIL :type NIL :defaults *load-truename*))

(defmacro truncate-name (name)
 ;; Support for brain-damaged DOS filenames
 #-:aclpc name
 #+:aclpc (let ((var (gensym)))
	    `(let ((,var ,name))
	       (if (> (length ,var) 8) (subseq ,var 0 8) ,var)))
 )

#-:aclpc(defvar *lisp-extension* "lisp")
#+:aclpc(defvar *lisp-extension* "lsp")

;;;; WITH-REDEFINITION-WARNINGS-SUPPRESSED

#+:MCL
(defmacro with-redefinition-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress redefinition warnings
  `(let ((CCL::*warn-if-redefine* nil))
     ,@forms ))

#+:EXCL
(defmacro with-redefinition-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress redefinition warnings
  `(let ((EXCL::*redefinition-warnings* nil))
     ,@forms ))

#+:ACLPC
(defmacro with-redefinition-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress redefinition warnings
  `(let ((top::*warn-on-redefinition* nil))
     ,@forms ))

#+:LUCID
(defmacro with-redefinition-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress redefinition warnings
  `(let ((USER::*redefinition-action* nil))
     ,@forms ))

#+:TI
(defmacro with-redefinition-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress redefinition warnings
  `(let ((TICL::inhibit-fdefine-warnings t))
     ,@forms ))

#-(or :MCL :EXCL :ACLPC :LUCID :TI)
(defmacro with-redefinition-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress redefinition warnings
  ;; Default: Do nothing:
  `(progn ,@forms ))

;;;; WITH-UNDEFINED-FUNCTION-WARNINGS-SUPPRESSED

#+:lispm
(defmacro with-undefined-function-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress undefined function warnings
  `(compiler:compiler-warnings-context-bind ,@forms))

#+:lucid
(defmacro with-undefined-function-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress undefined function warnings
  `(lucid-common-lisp:with-deferred-warnings ,@forms))

#+(or (and :CLTL2 (not :lucid) (not :allegro-v4.2)) (and :CMU :new-compiler))
(defmacro with-undefined-function-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress undefined function warnings
  `(with-compilation-unit () ,@forms))

#+:allegro-v4.2
(defmacro with-undefined-function-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress undefined function warnings
  `(handler-bind ((excl:compiler-undefined-functions-called-warning
		   #'(lambda (c) (declare (ignore c)) (muffle-warning))))
     ,@forms))

#-(or :lispm :lucid :CLTL2 (and :CMU :new-compiler) :allegro-v4.2)
(defmacro with-undefined-function-warnings-suppressed (&body forms)
  ;; Wrap form with code to suppress undefined function warnings
  ;; Default: Do nothing:
  `(progn ,@forms ))



;; load the file "pathnames.lisp":
    ;; THE ":CASE" OPTION FOR "MAKE-PATHNAME" ISN'T IMPLEMENTED IN TI CL:
(let ((path (make-pathname :name #-(and :TI :ISI) (truncate-name "pathnames")
			         #+(and :TI :ISI) "PATHNAMES"
			   :type #-(and :TI :ISI) *lisp-extension*
			         #+(and :TI :ISI) "LISP"
			   :defaults *loom-pathname-default*)))
  (load path))

;;; Now compile and load LOOM sources from three different directories:
;;; Setup implementation-specific variables and forms to:
;;;    1)  Inhibit function redefinition warnings.
;;;    2)  Do all compilation before warning about undefined functions.
(let (#+(and :EXCL (or :Allegro-V4.1 :Allegro-V4.2 :allegro-v4.3 :allegro-v5.0))
        (comp:*cltl1-compile-file-toplevel-compatibility-p* nil)
      #+(or :lispworks :Allegro-V4.1 :Allegro-V4.2 :allegro-v4.3 :allegro-v5.0)
      (*compile-print* nil))
  (with-redefinition-warnings-suppressed
      (with-undefined-function-warnings-suppressed
       (make:operate-on-system 'loom :load
			       :compile-during-load nil
			       :load-source-instead-of-binary nil))) )


(format t "~%Please call (LOOM:use-loom <pkg>) to import LOOM symbols into <pkg> and~%~
           create a context named <pkg>-THEORY, e.g., (LOOM:use-loom \"FOO\").~%~%")
