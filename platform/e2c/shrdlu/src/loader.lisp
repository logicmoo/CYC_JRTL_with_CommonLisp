(make-package "SHRDLU" :use '("CL"))

(in-package :SHRDLU)
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
#+SOCKET 
  (load "remote.lisp")
#-SOCKET
  (load "local.lisp")


)

; Set either (DEBUGMODE) or (USERMODE) here.
(USERMODE)

#+ABCL
(when ext:*COMMAND-LINE-ARGUMENT-LIST* (DEBUGMODE))

#+ABCL
(print ext:*COMMAND-LINE-ARGUMENT-LIST*)

; Start the program
(INITIALSTUFF 'UMR-1.0 NIL)

