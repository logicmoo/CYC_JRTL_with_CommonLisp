
(in-package :CL-USER)

' (defpackage "COMMON-LISP-USER" (:nicknames "U" "USER" "CL-USER"))
(let ((*PACKAGE* *PACKAGE*))
  (cl:load "contrib-site/e2c/hash-dollar.lisp"))

;; (let ((*print-readably* t)) (prin1-to-string (find-class 'symbol)))
(defmethod print-object ((obj class) stream)
  (print1 "#." stream)
    (write `(find-class ',(class-name obj)) :stream stream :readably t))


 ;; (load "contrib-site/slime/start-swank.lisp")
 ;; Load swank.
 (load "contrib-site/slime/swank-loader.lisp")
 (swank-loader:init)
 (swank:create-server :port 4005
                       :style swank:*communication-style*
                       :dont-close t)


;; Starts AppdapterGUI
;; (UI-INSPECTOR)

;; Start the J IDE
;; (J-DESKTOP)

;; Starts BeanShell UI
;; (BSH-DESKTOP)

;; Starts of SWI-Prolog Telnet Server  (implictly already started)
;; (swipl-init-server)

(require :abcl-contrib)
;; (require :jss)


(pushnew :use-cyc *features*)
;; (pushnew :use-dd *features*)

;; Do ansi tests
(defun cyc-ansi ()
  (let ((*default-pathname-defaults*
    (merge-pathnames "../old-ansi-tests/"))) (load "doit.lsp")))


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


;; makes constant names slightly friendlier to prolog
;; #+CYC-EXTERNAL
;; (print (let ((*PACKAGE* *PACKAGE*))  (in-package :cyc) (sl:load "e2c/renames-fixed.lisp")))

;; uses com.cyc.cycjava.cycl.constants_low.lookup_constant_by_guid

#+CYC-HTML
(sl:csetq cyc::*CB-DEFAULT-INDEX-VIEW* :legacy)
(defparameter cyc::*CB-DEFAULT-INDEX-VIEW* :legacy)


'(ss)


(defun osim () (sl:load "e2c/osim.lisp"))

;; Loads Daydreamer
#+USE-DD
(cl:load "contrib-site/d")


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
   (cyc:init-cyc-server))


;; ABCL JSS:     (#"setText" my-label "The Larch")
;; ABCL JFLI:    (jlabel.settext my-label "The Larch")
;; Clojure:      (.setText my-label "The Larch")
;; JLinker:      (JCALL "aproposList" *PACKAGE* "QUIT-")

;; (prolog-eval-lobject 'rn)
;; (prolog-query-once "rn")

'(osim)




