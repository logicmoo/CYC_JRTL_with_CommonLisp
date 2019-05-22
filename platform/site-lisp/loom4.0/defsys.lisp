;-*- Mode:Common-Lisp; Package:CL-USER; Base:10 -*-

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;                                                                          ;
;  COPYRIGHT (C) UNIVERSITY OF SOUTHERN CALIFORNIA, 1988, 1995             ; 
;  University of Southern California, Information Sciences Institute       ;
;  4676 Admiralty Way                                                      ;
;  Marina Del Rey, California 90292                                        ;
;                                                                          ;
;  This software was developed under the terms and conditions of Contract  ;
;  No. MDA903 81 C 0335 between the Defense Advanced Research Projects     ;
;  Agency and the University of Southern California, Information Sciences  ; 
;  Institute.  Use and distribution of this software is further subject    ;
;  to the provisions of that contract and any other agreements developed   ;
;  between the user of the software and the University of Southern         ;
;  California, Information Sciences Institute.  It is supplied "AS IS",    ;
;  without any warranties of any kind.  It is furnished only on the basis  ;
;  that any party who receives it indemnifies and holds harmless the       ;
;  parties who furnish and originate it against any claims, demands, or    ;
;  liabilities connected with using it, furnishing it to others or         ;
;  providing it to a third party.  THIS NOTICE MUST NOT BE REMOVED FROM    ;
;  THE SOFTWARE, AND IN THE EVENT THAT THE SOFTWARE IS DIVIDED, IT SHOULD  ;
;  BE ATTACHED TO EVERY PART.                                              ;
;                                                                          ;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
 

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
		      (:file "regex")
                      (:file "macros"   :depends-on ("prep" "ctxt" "regex"))
                      (:file "braidefs" :depends-on ("macros"))
                      (:file "kernel"   :depends-on ("braidefs")))
         )
     #+:use-units
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
	 :depends-on (kbclasses #+:use-units measures))

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
	      :components ((:file "loom4-0-patches"))
	      :depends-on (kbclasses abox tbox)) )
   :depends-on nil)


