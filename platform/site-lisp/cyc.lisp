(in-package :CL-USER)

;; Changes larkc's homedir to ~/
;; so this only loads once as it changed the homedir
(let ((file (merge-pathnames "larkc-home.lisp"
                     #.(directory-namestring *load-truename*))))
 (when (probe-file file)
  (cl:load file)))

(defpackage "COMMON-LISP-USER" (:nicknames "USER" "CL-USER"))
(let ((*PACKAGE* *PACKAGE*))
  (cl:load "e2c/hash-dollar.lisp"))


;; (pushnew :larkc *features*)
(pushnew :use-cyc *features*)
;; (pushnew :use-dd *features*)

;; (user::init-cyc) ;; Loads CYC code (without a KB)
;; (user::setup-kb-tables 0)

;; Starts AppdapterGUI
;; (UI-INSPECTOR)

;; Start the J IDE
;; (J-DESKTOP)

;; Starts BeanShell UI
;; (BSH-DESKTOP)

;; Starts of SWI-Prolog Telnet Server  (implictly already started)
;; (swipl-init-server)

;; (require :abcl-contrib)
;; (require :jss)


;; Do ansi tests
(defun cyc-ansi ()
  (let ((cl:*default-pathname-defaults*
    (cl:merge-pathnames "../old-ansi-tests/" #.(cl:directory-namestring cl:*load-truename*)))) 
    (cl:load "doit.lsp")))


(PRINT *features*)
;;(cl:load "./slime/start-swank.lisp")
(cl:load "slime/swank-loader.lisp")

(swank-loader:init
 :delete nil         ; delete any existing SWANK packages
 :reload nil         ; reload SWANK, even if the SWANK package already exists
 :load-contribs nil) ; load all contribs

(swank:create-server :port 4005
                     ;; if non-nil the connection won't be closed
                     ;; after connecting
                     :dont-close t)

(PRINT *features*)

(cl:load "cusp/cusp-loader.lisp")

(cusp-loader:init
 :delete nil         ; delete any existing SWANK packages
 :reload nil         ; reload SWANK, even if the SWANK package already exists
 :load-contribs nil) ; load all contribs

(cusp:create-server :port 3005
                     ;; if non-nil the connection won't be closed
                     ;; after connecting
                     :dont-close t)

(PRINT *features*)


;; Do Load KB and rename things
(defun ss ()
     (cyc:init-cyc-server)
     (cyc::safely-rename-now))


'(dat)

;; Starts CYC RTL
(let ((*PACKAGE* *PACKAGE*)) (cyc:init-subl))


#+USE-CYC
(let
  ((*PACKAGE* *PACKAGE*))
     (cyc:init-cyc) ;; Loads CYC code (without a KB)
     '(cyc::setup-kb-tables 0)
     (cyc:init-kb) ;; Loads CYC's KB (a server without TCP services)
 )


(setf (symbol-plist 'SUBLISP::CSETQ) (symbol-plist 'cl::setq)) 

;; makes constant names slightly friendlier to prolog
;; #+CYC-EXTERNAL
;; (print (let ((*PACKAGE* *PACKAGE*))  (in-package :cyc) (sl:load "e2c/renames-fixed.lisp")))

;; uses com.cyc.cycjava.cycl.constants_low.lookup_constant_by_guid


#+CYC-HTML
(sl:csetq cyc::*CB-DEFAULT-INDEX-VIEW* :legacy)
(defparameter cyc::*CB-DEFAULT-INDEX-VIEW* :legacy)



'(ss)

(defun shrdlu () (cl:load "shrdlu/osim.lisp"))

(defun osim () (sl:load "e2c/osim.lisp"))

;; Loads Daydreamer
#+USE-DD
(cl:load "d")


;; Starts Daydreamer
(defun dd ()
  (Daydreamer)
  ;;(lisp-eval "(UI-INSPECT ^cx.3)")
  ;;(lisp-eval "(UI-INSPECT ^cx.30)")
  ;;(lisp-eval "(UI-INSPECT ^cx.50)")
  )

(defun cyc::foc (str)
   (cyc::find-or-create-constant str))

(import 'cyc::foc (find-package :cl-user))



(cl-imports-cyc)
(cyc-imports-cl)

;;#+USE-CYC
;;(let ((*PACKAGE* (find-package :CYC))) (sl:load "e2c/larkc_prolog.lisp"))

;; Starts rest of CYC
#+USE-CYC
(let ((*PACKAGE* *PACKAGE*))
   (user:init-cyc-server))


;; ABCL JSS:     (#"setText" my-label "The Larch")
;; ABCL JFLI:    (jlabel.settext my-label "The Larch")
;; Clojure:      (.setText my-label "The Larch")
;; JLinker:      (JCALL "aproposList" *PACKAGE* "QUIT-")

;; (prolog-eval-lobject 'rn)
;; (prolog-query-once "rn")

;; '(osim)

;;;{{{DOC
;;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-
;;
;; Copyright (c) 2000 - 2006 Cycorp, Inc.  All rights reserved.
;;
;; @module planner-test
;;
;; Features : <list of file-level code features>
;;
;; @owner bfraser
;;
;; 2001/11/14
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; description of purpose of file
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; External interface:
;;
;; list of the public functions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; File organization:
;; 
;; outline of file contents
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;;}}}EDOC

(in-package "CYC")

(cvs-id "$Id: shop-generic-test.lisp 126640 2008-12-04 13:39:36Z builder $")


(defmacro-private create-constant-from-symbol (symbol)
  (ret `(csetq ,symbol (print-create ,(symbol-name symbol) ,symbol)))) 
		   

(define-inference-test :shop-generic-test  
    (:comment
     ""
     :owner "cyndy"
     :creator "bfraser"
     :kb :full)
  (with-test-constants t
      ((model-mt #$Microtheory)
       (agent #$IntelligentAgent)
       (reified-func1 #$ReifiableFunction)
       ((col1 col2) #$Collection)
       ((object1 object2 object3) #$Thing)
       ((complex1 complex2 complex3) #$BinaryPredicate)
       ((simple1 simple2) #$BinaryPredicate)       
       ((precond1 precond2)  #$BinaryPredicate)
       ((complex-precond1 complex-precond2 complex-precond3) #$BinaryPredicate)
       ((scond1 scond2)  #$BinaryPredicate)
       (precond3 #$BinaryPredicate))
       
    ;; make test model mt

    (print-assert
     `((#$isa ,model-mt #$PlanningDomainMicrotheory)
       (#$isa ,model-mt #$PlanDynamicSituationMicrotheory)
       (#$genlMt ,model-mt #$NetworkAnalysisDomainVocabularyMt))
     #$BaseKB :monotonic :forward)

    ;; arg constraints. add as needed
      
    (print-assert
     `((#$isa ,reified-func1 #$FixedArityRelation)
       (#$arity ,reified-func1 1)
       (#$argIsa ,reified-func1 1 ,col1)
       (#$resultIsa ,reified-func1 ,col2)
       (#$argIsa ,complex1 1 ,col1)
       (#$argIsa ,complex1 2 ,col2)
       (#$isa ,object1 ,col2)
       (#$isa ,object2 ,col2)
       (#$isa ,object3 ,col1))
     model-mt :monotonic :forward)

;;;       (print-assert
;;;	`((#$isa (,reified-func1 ,object3) ,col2))
;;;	model-mt :monotonic :forward)
	
    (print-assert
     `((#$isa ,complex1 #$ComplexActionPredicate)
       (#$isa ,complex2 #$ComplexActionPredicate))
     model-mt :monotonic :forward)
      
    (print-assert
     `((#$isa ,simple1 #$SimpleActionPredicate)
       (#$isa ,simple2 #$SimpleActionPredicate))
     model-mt :monotonic :forward)
    
    (print-assert
     `((#$preconditionFor-Props (,precond1 ?X ?Y) (,simple1 ?X ?Y))
       (#$preconditionFor-Props (,precond2 ?X ?Y) (,simple2 ?X ?Y)))
     model-mt :monotonic :forward)
      
    (print-assert
     `((#$sufficientFor-Props (,scond1 ?X ?Y) (,complex1 ?X ?Y))
       (#$sufficientFor-Props (,scond2 ?X ?Y) (,complex2 ?X ?Y)))
     model-mt :monotonic :forward)
      
    (print-assert
     `((#$implies (,complex-precond1 ?X ?Y) 
		  (#$methodForAction 
		   (,complex1 ?X ?Y)
		   (#$actionSequence 
		    (#$TheList
		     (,simple1 ?X ?Y)
		     (,simple2 ?X ?Y))))))
     model-mt :monotonic :forward)

    (print-assert
     `((#$implies (,complex-precond2 ?X ?Y) 
		  (#$methodForAction 
		   (,complex2 ?X ?Y)
		   (#$actionSequence 
		    (#$TheList
		     (,simple2 ?X ?Y)
		     (,simple1 ?X ?Y))))))
     model-mt :monotonic :forward)
      
    (print-assert
     `((#$implies (,complex-precond3 ?X ?Y) 
		  (#$methodForAction 
		   (,complex3 ?X ?Y)
		   (#$actionSequence 
		    (#$TheList
		     (,complex1 ?X ?Y)
		     (,complex2 ?X ?Y))))))
     model-mt :monotonic :forward)

    ;; initial state
      
    (print-assert 
     `((,precond1 ,agent ,object1)
       (,precond2 ,agent ,object1)
       (,precond1 ,agent ,object2)
       (,precond2 ,agent ,object2)
       (,complex-precond1 ,agent ,object1)
       (,scond2 ,agent ,object2)
       (,complex-precond1 ,agent ,object2)
       (,complex-precond3 ,agent ,object2)
	 
       (,precond1 ,agent (,reified-func1 ,object3))
       (,precond2 ,agent (,reified-func1 ,object3))
       (,complex-precond1 ,agent (,reified-func1 ,object3))
       (,complex-precond2 ,agent (,reified-func1 ,object3))
       (,complex-precond3 ,agent (,reified-func1 ,object3))
	 
	 
       )
       
     model-mt :monotonic :forward)
      
    ;; basic preliminary tests
    (clet ((task1 `(,complex1 ,agent ,object1))
	   (result1 `(((,simple1 ,agent ,object1) (,simple2 ,agent ,object1))))
	     
	   ;;testing #$sufficientFor-Props functionality
	   (task2 `(,complex2 ,agent ,object2))
	   (result2 `(nil))
	     
	   (task3 `(,complex3 ,agent ,object2))
	   (result3 `(((,simple1 ,agent ,object2) (,simple2 ,agent ,object2))))

	   ;;testing multibinding functionality
	   (task4 `(,complex1 ,agent ?OBJECT))
	   (result4 `(((,simple1 ,agent ,object1) (,simple2 ,agent ,object1))
		      ((,simple1 ,agent ,object2) (,simple2 ,agent ,object2))
		      ((,simple1 ,agent (,reified-func1 ,object3)) (,simple2 ,agent (,reified-func1 ,object3)))))

	   (task5 `(,complex2 ,agent (,reified-func1 ,object3)))
	   (result5 `(((,simple2 ,agent (,reified-func1 ,object3))
		       (,simple1 ,agent (,reified-func1 ,object3))))))
									

      (format t "Test Model Mt: ~s~%" model-mt)
      (form-verify 'eq t `(planner-test ',result1 ',task1 ,model-mt))
      (form-verify 'eq t `(planner-test ',result2 ',task2 ,model-mt))
      (form-verify 'eq t `(planner-test ',result3 ',task3 ,model-mt))
      (form-verify 'eq t `(planner-test ',result4 ',task4 ,model-mt))
      (form-verify 'eq t `(planner-test ',result5 ',task5 ,model-mt))
      )					; end clet
    ))


(define-private planner-test (result task mt)
  "@param RESULT  listp         ;; list of expected plans in cycl.
   @param TASK    el-formula-p
   @param MT      hlmt-p
   @return booleanp"
  
  (clet ((plans (shop-find-plans task mt 7))
	 (cycl-plans nil))
    (cdolist (cur-plan plans)
      (csetq cycl-plans (append (funcall-instance-method cur-plan 'ground-forms) cycl-plans)))
    (ntransform cycl-plans 'nart-p 'nart-el-formula)
    (print cycl-plans) (terpri)
    (ret (equivalent-plan-lists result cycl-plans))))


(define-private equivalent-plan-lists (list1 list2)
  (ret (cand (subsetp list1 list2 #'equal)
	     (subsetp list2 list1 #'equal))))



#|
 (ql:QUICKLOAD "shop3") (ql:QUICKLOAD "fiveam") 
  (ql:QUICKLOAD "pddl-utils") (ql:QUICKLOAD "openstacks-problem-translator")
   (ql:QUICKLOAD "shop3-thmpr-api") (ql:QUICKLOAD "shop3/test")

;; (time (fiveam:run-all-tests))

;; (fiveam:run-all-tests)
|#
