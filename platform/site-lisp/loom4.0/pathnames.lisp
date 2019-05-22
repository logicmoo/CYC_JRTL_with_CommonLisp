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
 

;;; PATHNAMES.LISP ()

;;; Initialize pathname variables that point to the various subdirectories
;;;    and files referenced during the compilation and/or load process.


(in-package "COMMON-LISP-USER")

(defun loom-pathname (&key name (type *lisp-extension*) (defaults *loom-pathname-default*) subDirectory)
  ;; Returns a pathname for the specified file, merging in LOOM defaults.
  ;; "subDirectory" is a string naming a subdirectory of the loom root directory.

  ;; THE ":CASE" OPTION FOR "MAKE-PATHNAME" ISN'T IMPLEMENTED IN TI CL:
  #+(and :TI :ISI) (setf name (and name (string-upcase name))
			 subDirectory (and subDirectory (if (string= subDirectory "XLD")
							    (string-downcase subDirectory)
							    (string-upcase subDirectory)))
			 type (if (stringp type) (string-upcase type) type))
  (when (stringp subdirectory)
    (setq subdirectory (list subdirectory)))
  (let ((path (make-pathname 
		:name (truncate-name name)
		:type type
		:defaults defaults
		:directory (if subDirectory
			       #-(and :cmu (not :new-compiler))
			         (append (pathname-directory defaults) 
					 subdirectory)
			       #+(and :cmu (not :new-compiler))
			         (coerce
				  (append (coerce (pathname-directory defaults)
						  'LIST) 
					  subDirectory)
				  'SIMPLE-VECTOR)
				 (pathname-directory defaults)))))

    path ))

#+(or :allegro-v4.2 :allegro-v4.3)(pushnew :CLTL2 *features*)
;; insure that :CLOS feature is present if CLOS is:
#+(or :CLTL2 :ANSI-CL)
(pushnew :CLOS *features*)

;;; Create KBCLASSES and LOOM packages:
(load (loom-pathname :name "loom-package"))

;;; Define defsystem functions.  Load a compiled version if possible.
#+(and :TI (not :MK-DEFSYSTEM))
(load (loom-pathname :name "defsystem" :type :unspecific))
#+(and (or :LUCID :MCL) (not :MK-DEFSYSTEM))
(load (loom-pathname :name "defsystem" :type nil))
#-(or :MCL :LUCID :TI :MK-DEFSYSTEM)
(load (loom-pathname :name "defsystem"))


(defun loom::load-loom-patches (&key (loom::compile-if-needed-p t)
                                     (loom::source-if-newer-p nil))
    "Loads the current set of patches for this Loom.
If `:source-if-newer-p' is T (default NIL), then source patches will be loaded
if they are newer than the binary.  If NIL, then only compiled patches will be
loaded.  If `:compile-if-needed-p' is T (default) then newer source patches
will be compiled before loading."
  (let* ((patchModule (find "patch" (make::component-components
				     (make::find-system 'loom))
			    :key #'make::component-name :test #'string-equal))
	 (patchFile (find "loom4-0-patches" (make::component-components
					  patchModule)
			    :key #'make::component-name :test #'string-equal))
	 (binaryFileName    (make::component-full-pathname patchFile :binary))
	 (sourceFileName    (make::component-full-pathname patchFile :source))
         (sourceExistsP (probe-file sourceFileName))
         (binaryExistsP (probe-file binaryFileName))
	 #+(and :EXCL :UNIX :ISI)
	 (umaskValue
	  (read-line (excl:run-shell-command "umask" :output :stream :wait nil)))
	 #+(or :Allegro-V4.1 :Allegro-V4.2 :Allegro-V4.3 :Allegro-v5.0)
	 (comp:*cltl1-compile-file-toplevel-compatibility-p* nil)
	 )
    #+(and :EXCL :UNIX :ISI) (excl:run-shell-command "umask 002" :wait t)
    (unwind-protect 
	(cl-user::with-redefinition-warnings-suppressed
	    (cond ((and sourceExistsP binaryExistsP)
		   (if (< (file-write-date binaryFileName)
			  (file-write-date sourceFileName))
		       (cond (loom::compile-if-needed-p
			      (cl-user::with-undefined-function-warnings-suppressed
				  (load (compile-file sourceFileName 
						      :output-file binaryFileName))))
			     (loom::source-if-newer-p
			      (load sourceFileName))
			     (t (load binaryFileName)))
		     (load binaryFileName)))
		  (binaryExistsP
		   (load binaryFileName))
		  (sourceExistsP
		   (if loom::compile-if-needed-p
		       (cl-user::with-undefined-function-warnings-suppressed
			   (load (compile-file sourceFileName :output-file binaryFileName)))
		     (load sourceFileName)))
		  (t (warn "Couldn't find a binary or a source file for Loom patches~%~
                    Binary Filename = ~A~%Source Filename = ~A" 
			   binaryFileName sourceFileName))))
      #+(and :EXCL :UNIX :ISI)
      (excl:run-shell-command (format nil "umask ~A" umaskValue) :wait t))
    ))

(export 'loom::load-loom-patches "LOOM")


;;; Determine the directory for storing and retrieving binaries
;;; for this LISP:
(defvar *loom-binary-directory*;; load time determination
  (or #+(and :ISI :MCL)
      (translate-logical-pathname  "CCL:Loom4.0 binaries;")
      (loom-pathname
       :type #-TI nil #+TI :unspecific
       #+TI :name #+TI ""
       :subdirectory
       (list "BIN"
	     (or
	      #+:MCL
	      "MCL"
	      #+:LUCID
	      (let* ((HOST #+:PA "HP" #-:PA "")
		     (LISP (cond ((member :LCL4.2 user::*features*) "LCL4.2")
				 ((member :LCL4.1 user::*features*) "LCL4.1")
				 ((member :LCL4.0 user::*features*) "LCL4.0")
				 ("LCLx.x"))))
		(concatenate 'string HOST LISP))
	      #+:ALLEGRO
	      (let* ((HEAD #+(and :UNIX :SPARC) "ACL"
			   #+(and :UNIX :LINUX) "LXACL"
			   #+(and :UNIX (not :SPARC) (not :LINUX)) "HPACL"
			   #-:UNIX "ACL")
		     (VERSION (cond #+:excl((boundp 'excl::*common-lisp-version-number*)
					    excl::*common-lisp-version-number*)
				    (t "x.x"))))
		(concatenate 'string HEAD VERSION))
	      #+:TI "XLD"
	      #+:CMU "CMUCL"
	      "MISC")))) )

(unless (probe-file *loom-binary-directory*)
  (let ((backup-binary-directory
	 (loom-pathname
	  :type #-TI nil #+TI :unspecific
	  #+TI :name #+TI ""
	  :subdirectory '("BIN" "MISC"))))
    (warn "Couldn't find directory ~S,    ~%switching to ~S"
	  *loom-binary-directory* backup-binary-directory)
    (setq *loom-binary-directory* backup-binary-directory)))

(load (loom-pathname :name "defsys"))
