(defpackage "SHRDLU" (:use "COMMON-LISP") ( :shadow ;; "REST" ;; "AND" "SPECIAL" "OR"
                                              ))
(setq *print-length* nil  *print-level* nil)

(in-package :SHRDLU)

; (defvar R3ST ())
;
; This file loads in all the needed files for SHRDLU.
;

;; (setq *DEFAULT-PATHNAME-DEFAULTS* #P"/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform/e2c/shrdlu/consoleshrdlu/")  (LOAD "loader.lisp")

;; (setq *DEFAULT-PATHNAME-DEFAULTS* #P"G:/opt/CYC_JRTL_with_CommonLisp/platform/e2c/shrdlu/consoleshrdlu/")
;; (setq *DEFAULT-PATHNAME-DEFAULTS* #P"/mnt/gggg/CYC_JRTL_with_CommonLisp/platform/e2c/shrdlu/consoleshrdlu/")

; This appears to be the width of the terminal
; No, it's not.  Not sure what it is....
(DEFCONSTANT CHRCT 76)

(let ((*DEFAULT-PATHNAME-DEFAULTS* (make-pathname :directory (pathname-directory *load-pathname* ))))

(load "asktell.lisp")
(load "fixes.lisp")
(load "progmr.lisp")
(load "cgram.lisp")
(load "syscom.lisp")
(load "smutil.lisp")
(load "smspec.lisp")
(load "smass.lisp")
(load "dictio.lisp")
(load "morpho.lisp")
(load "show.lisp")
(load "blockl.lisp")
(load "plnr.lisp")
(load "setup.lisp")
(load "thtrac.lisp")
(load "blockp.lisp")
(load "data.lisp")
(load "newans.lisp")
(load "mover.lisp")
(load "remote.lisp")

(setq *SHRDLU-PATHNAME* *DEFAULT-PATHNAME-DEFAULTS*)

)

; Set either (DEBUGMODE) or (USERMODE) here.
(USERMODE)

#+ABCL
(when (print ext::*COMMAND-LINE-ARGUMENT-LIST*) (DEBUGMODE)(COMMON-LISP-USER:lisp-repl))


; Start the program
(INITIALSTUFF 'UMR-1.0 NIL)

