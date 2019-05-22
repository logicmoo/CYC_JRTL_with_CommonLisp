;-*- Mode:Common-Lisp; Package:CL-USER; Base:10 -*-

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
 

;;; DEFSYS.LISP ()

(make:defsystem loom
  :source-pathname COMMON-LISP-USER::*loom-pathname-default*
  :source-extension #-(or TI :ACLPC) "lisp" #+TI "LISP" #+:ACLPC "lsp"
  #+TI :host
  #+TI(string (pathname-host COMMON-LISP-USER::*loom-pathname-default*))
  :binary-pathname *loom-binary-directory*
  :components
    ((:module kbclasses
         :source-pathname "kbclasses"
         :components ((:file "prep")
                      (:file "ctxt")
                      (:file "macros"   :depends-on ("prep" "ctxt"))
                      (:file "braidefs" :depends-on ("macros"))
                      (:file "kernel"   :depends-on ("braidefs")))
         )
     (:module measures
         :source-pathname "measures"
         :components ((:file "package")
                      (:file "measures" :depends-on ("package"))
                      (:file "measure-enhancements" :depends-on ("package" "measures")) 
                      (:file "unit-defs" :depends-on ("package" "measures" "measure-enhancements"))
                      (:file "reader-setup" :depends-on ("package" "measures")))
         )
     (:module tbox
         :source-pathname "tbox"
         :components
	    ((:file "globals"      :load-always t)
	     (:file "classdefs"    :depends-on ("globals"))
	     (:file "contexts"     :depends-on ("classdefs"))
	     (:file "kbase"        :depends-on ("contexts"))
	     (:file "html"         :depends-on ("classdefs"))
	     (:file "service"      :depends-on ("kbase" "classdefs"))
	     (:file "links"        :depends-on ("service"))
	     (:file "users"        :depends-on ("links"))
	     (:file "build"        :depends-on ("users"))
	     (:file "parse"        :depends-on ("build" "users"))
	     (:file "disjunction"  :depends-on ("parse" "users"))
	     (:file "generate"     :depends-on ("disjunction" "users"))
	     (:file "condition"    :depends-on ("generate" "users"))
	     (:file "features"     :depends-on ("condition" "users"))
	     (:file "specialize"   :depends-on ("features" "users"))
	     (:file "classify"     :depends-on ("specialize" "users"))
	     (:file "complete"     :depends-on ("classify" "users"))
	     (:file "disjointness" :depends-on ("complete" "users"))
	     (:file "partitions"   :depends-on ("disjointness" "users"))
	     (:file "sets"         :depends-on ("partitions" "users"))
	     (:file "reify"        :depends-on ("sets" "users"))
	     (:file "new-reify"    :depends-on ("sets" "users"))
	     (:file "frames"       :depends-on ("reify" "new-reify" "users"))
	     (:file "built-in"     :depends-on ("frames" "users"))
	     (:file "go"           :depends-on ("built-in" "users")))
	 :depends-on (kbclasses measures))

     (:module abox
         :source-pathname "abox"
         :components
	    ((:file "structures")
	     (:file "parse-time")
	     (:file "time-support")
	     (:file "slots"        :depends-on ("structures"))
	     (:file "instances"    :depends-on ("slots" "structures"))
	     (:file "histories"    :depends-on ("instances" "structures"))
	     (:file "query"        :depends-on ("instances" "structures"))
	     (:file "workspaces"   :depends-on ("instances" "structures"))
	     (:file "time-build"   :depends-on ("structures"))
	     (:file "time-query"   :depends-on ("structures"))
	     (:file "predicates"   :depends-on ("query" "time-query"))
	     (:file "optimize"     :depends-on ("query" "time-query"))
	     (:file "retrieve"     :depends-on ("optimize"))
	     (:file "tuples"       :depends-on ("retrieve" "predicates"
					     "histories" "structures"))
             (:file "modify"       :depends-on ("histories"))
	     (:file "probe"        :depends-on ("retrieve"))
	     (:file "bombs"        :depends-on ("probe" "modify" "tuples"
						"structures"))
	     (:file "types"        :depends-on ("bombs"))
	     (:file "queues"       :depends-on ("types"))
	     (:file "match"        :depends-on ("queues"))
	     (:file "tell"         :depends-on ("modify" "match"
						"parse-time" "time-build"))
             (:file "propositions" :depends-on ("tell"))
	     (:file "defaults"     :depends-on ("tell" "match"))
	     (:file "backchain"    :depends-on ("defaults"))
	     (:file "seal"         :depends-on ("types"))
	     (:file "why"          :depends-on ("types"))
	     (:file "patterns"     :depends-on ("types"))
	     (:file "tasks"        :depends-on ("seal"))
	     (:file "behaviors"    :depends-on ("tasks"))
	     (:file "rete"         :depends-on ("behaviors"))
	     (:file "productions"  :depends-on ("rete"))
	     (:file "monitors"     :depends-on ("rete"))
	     (:file "utility"      :depends-on ("modify"))
	     (:file "export"       :depends-on ("utility" "tasks"))
             (:file "get"          :depends-on ("export"))
             (:file "roles"        :depends-on ("get"))
	     (:file "meta"       :depends-on ("roles" "monitors" "productions"
					      "patterns" "why" "backchain"
					      "structures" "workspaces"))
	     (:file "clos-instances" :depends-on ("meta"))
	     (:file "penultimate"  :depends-on ("clos-instances")
		    :load-always t)
	     (:file "coda"       :depends-on ("export" "penultimate"
					      "structures")
		    :load-always t))
	 :depends-on (tbox kbclasses))
     (:module patch
	      :source-pathname "patch"
	      :components ((:file "loom3-X-patches"))
	      :depends-on (kbclasses abox tbox)) )
   :depends-on nil)


