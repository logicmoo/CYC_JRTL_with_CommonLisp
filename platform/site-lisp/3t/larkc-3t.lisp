(in-package :CL-USER)

(defpackage "COMMON-LISP-USER" (:nicknames "USER" "CL-USER"))
(let ((*PACKAGE* *PACKAGE*))
  (cl:load "../e2c/hash-dollar.lisp"))

;; (let ((*print-readably* t)) (prin1-to-string (find-class 'symbol)))
(defmethod print-object ((obj class) stream)
  (print1 "#." stream)
    (write `(find-class ',(class-name obj)) :stream stream :readably t))


;; (pushnew :larkc *features*)
;; (pushnew :use-cyc *features*)
;; (pushnew :use-dd *features*)
(pushnew :use-3t *features*)


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


;; Do ansi tests
(defun cyc-ansi ()
  (let ((*default-pathname-defaults*
    (merge-pathnames "../old-ansi-tests/"))) (load "doit.lsp")))


(PRINT *features*)

(in-package :system)

(export 'command-line-arguments)

(defun command-line-arguments ()
  *command-line-argument-list*)

(export '("GETENV" . ext:getenv))

#+use-3t
(load "planner/ap.asd")

