
(defpackage "COMMON-LISP-USER" (:nicknames "U" "USER" "CL-USER"))

(let ((*PACKAGE* *PACKAGE*))
  (cl:load "e2c/hash-dollar.lisp"))

;; (let ((*print-readably* t)) (prin1-to-string (find-class 'symbol)))
(defmethod print-object ((obj class) stream)
  (print1 "#." stream) 
    (write `(find-class ',(class-name obj)) :stream stream :readably t))



;; Starts AppdapterGUI
;; (UI-INSPECTOR)

; (J-DESKTOP)

;; Starts BeanShell UI
;; (BSH-DESKTOP)

;; Starts of SWI-Prolog Telnet Server
;; (swipl-init-server)

(require :abcl-contrib)
'(require :jss)

(pushnew :use-cyc *features*)
;; (pushnew :use-dd *features*)

;; Do ansi tests
(defun dat ()
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
     (cyc:init-server) ;; Starts All of CYC
 )

#+CYC-HTML
(sl:csetq cyc::*CB-DEFAULT-INDEX-VIEW* :legacy)

;; #+CYC-EXTERNAL
;; makes constant names slightly friendlier to prolog
;; (print (let ((*PACKAGE* *PACKAGE*))  (in-package :cyc) (sl:load "e2c/renames-fixed.lisp")))

;; uses com.cyc.cycjava.cycl.constants_low.lookup_constant_by_guid
(defun foc (str)
   (cyc::find-or-create-constant str))

;; CYC Server
(let ((*PACKAGE* *PACKAGE*))
   (cyc:init-cyc-server))


(cl-imports-cyc)
(cyc-imports-cl)


;; Loads Daydreamer
#+USE-DD
(cl:load "e2c/d")

'(ss)

;; Starts Daydreamer
(defun dd ()
  (Daydreamer)
  ;;(lisp-eval "(UI-INSPECT ^cx.3)")
  ;;(lisp-eval "(UI-INSPECT ^cx.30)")
  ;;(lisp-eval "(UI-INSPECT ^cx.50)")
  )

;; ABCL JSS:     (#"setText" my-label "The Larch")
;; ABCL JFLI:    (jlabel.settext my-label "The Larch")
;; Clojure:      (.setText my-label "The Larch")

;; (prolog-eval-lobject 'rn)

;; (prolog-query-once "rn")



