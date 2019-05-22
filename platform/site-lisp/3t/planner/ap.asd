(in-package :cl-user)

;;; System definition for AP 

;;; Load this file and all you need do is 
;;;    (asdf:load-system 'ap :compile t) 

;;; If you modify this defsystem, make certain you also modify ap.system, and vice versa.

#+allegro
(setf excl:*enable-package-locked-errors* nil) ; this one is important

#+allegro
(setf *global-gc-behavior* :auto)	; default is :auto-and-warn

(defvar *ap-loc* (make-pathname 
		  #+mswindows :device #+mswindows (pathname-device *load-truename*)
		  :directory (pathname-directory *load-truename*))
  "set root to ~/planner/")

(setf (logical-pathname-translations "ap")
  `(("**;*.*" ,(merge-pathnames "**/*.*" *ap-loc*))))


(require :asdf)
(in-package :asdf-user)

(defsystem "ap"
    :serial t
    :components
    ((:module :system-basics
              :pathname "system"
              :serial t
              :components ((:file "packages")
			   (:file "global-variables")
			   (:file "lisp-extensions")
			   (:file "string-utilities")
			   (:file "metaobject")
			   (:file "patmatch")
			   (:file "unify")
			   (:file "stubs")
			   (:file "splay")
			   (:file "pathnames")
			   (:module "csp"
				    :serial t
				    :components ((:file "class-definitions")
						 (:file "create-csp")
						 (:file "solver")
						 (:file "api")))))
     (:module :user-globales
              :pathname "user"
              :components ((:file "global-variables")))
     (:module "representation"
              :serial t
              :components ((:file "APThing")
			   (:file "DomainObject")
			   (:file "subgoal")
			   (:file "PDDL_2_1")
			   (:file "PPDDL")
			   (:module "owl"
				    :serial t
				    :components ((:file "Ontology")
						 (:file "namespace")
						 (:file "Class")
						 (:file "Container")
						 (:file "AnonymousClass")
						 (:file "pddl-types")
						 (:file "subclasses")
						 (:file "supreclasses")
						 (:file "owl-time")))
			   (:file "pddl-support")
			   (:module "predicates"
				    :serial t
				    :components ((:file "ObjectProperty")
						 (:file "function")
						 (:file "inverseOf")
						 (:file "subPropertyOf")
						 (:file "propositions")
						 (:file "negation")
						 (:file "init")))
			   (:module "action"
				    :serial t
				    :components ((:file "action")
						 (:file "forall")
						 (:file "template")
						 (:file "expansion")
						 (:file "syntax-checks")
						 (:file "OPT")
						 (:file "define")
						 (:file "define-durative-action")))
			   (:module "situation"
				    :serial t
				    :components ((:file "situation")
						 (:file "domain-situation")
						 (:file "initial-situation")
						 (:file "planned-situation")
						 (:file "join")
						 (:file "get-propositions")
						 (:file "negation")))
			   (:module "axiom"
				    :serial t
				    :components ((:file "axiom")
						 (:file "axiom-effect")
						 (:file "syntax-checks")
						 (:file "detect-inverseOf")
						 (:file "define")
						 (:file "apply-axioms")
						 (:file "no-context")))
			   (:file "object")
			   (:file "resource")
			   (:file "designators")
			   (:module "problem"
				    :serial t
				    :components ((:file "error-checks")
						 (:file "goal")
						 (:file "problem")
						 (:file "define")))
			   (:module "assumption"
				    :serial t
				    :components ((:file "assumption")
						 (:file "assumed-resource")
						 (:file "pc-assumption")))
			   (:file "domain")))
     (:module :basic-io
	      :pathname "system/ui"
	      :serial t
	      :pathname "ui"
	      :components ((:file "print-prop")
			   (:file "pprint-props")
			   (:file "print-plan")
			   (:file "menus")))
     (:module "planning"
              :serial t
              :components ((:file "plan-access")
			   (:file "probability")
			   (:file "meu")
			   (:file "make-situations")
			   (:file "situation-order")
			   (:file "OPT")
			   (:file "create-expansion")
			   (:file "duration-methods")
			   (:file "dependencies")
			   (:file "duration")
			   (:file "rejected-values")
			   (:file "designators")
			   (:file "testing-constraints")
			   (:file "testing-preconditions")
			   (:file "backtracking")
			   (:file "find-new-ops")
			   (:file "a-star-search")
			   (:file "establish-subgoal")
			   (:file "combined-operation")
			   (:file "contingency")
			   (:file "generate-plan")))
     (:module "counterplanning"
	      :serial t
	      :components ((:file "CounterAction")
			   (:file "countergoal")
			   (:file "counterplan")))
     (:module "replanning"
	      :serial t
	      :components ((:file "repair-structure")
			   (:file "get-relevant-situation")
			   (:file "duration")
			   (:file "replace-chosen")
			   (:file "conflict")
			   (:file "easy-repairs")
			   (:file "replace-wedge")
			   (:file "replanner")))
    (:module "execution-monitor"
             :serial t
             :components ((:file "perceived-situation")
			  (:file "execution-status")
			  (:file "check-status")
			  (:file "contingency")
			  (:file "designators")
			  (:file "problem-detection")
			  (:file "time")
			  (:file "monitor")
			  (:file "api")
			  ;;(:file "add-new-subgoal")
			  ))
    (:module "plan-recognition"
             :serial t
             :components ((:file "pr-problem")
			  (:file "initialize-search")
			  (:file "search-upward")
			  (:file "match-anchor")
			  (:file "generate-plan")))
    (:module "user"
	     :serial t
	     :components ((:module "file-io"
				   :serial t
				   :components ((:file "get-files")
						(:file "write-to-file")
						(:module "pddl"
							 :serial t
							 :components ((:file "get-pddl-file")
								      (:file "pddl-files")
								      (:file "load-pddl")))
						(:module "ntriples"
							 :serial t
							 :components ((:file "write-ntriples")
								      (:file "domain-to-triples")
								      (:file "plan-to-triples")))
						;;(:file "read-file-socket")
						;;(:file "read-from-file")
						))			  
			  (:file "plan-access")
			  ;;(:file"problem") ; interactively make a new one
			  (:file "define-predicate")
			  (:file "objects")
			  (:file "situation-propositions")
			  (:file "domain")
			  (:file "edit-plan")
			  (:module "running"
				   :serial t
				   :components ((:file "run")
						(:file "execution-monitor")
						(:file "reset")
						(:file "save-state")
						(:file "simulate-execution")))))
    (:module :developer-tools
	     :pathname "user/developer-tools"
	     :serial t
	     :components ((:file "remove-axiom")
			  (:file "print-plan")
			  ;;(:file "plan")
			  (:file "action")
			  (:file "situation")
			  (:file "run-demos")
			  (:file "cause-replanning")))
    (:file "system/initializations")))

;;;=== add-on systems ===
(in-package :cl-user)

(load "ap:user;debug;debug.asd")
(load "ap:user;file-io;json;ap-json.asd")

#+allegro
(or (find-system 'ap-beliefs)
    (load "ap:belief-network;ap-beliefs.system"))

#+allegro
(or (find-system 'ap-AllegroGraph)
    (load "ap:AllegroGraph;ap-AllegroGraph.system"))
