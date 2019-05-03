;
; This file loads in all the needed files for SHRDLU.
;
(defpackage shrdlu
  (:use :common-lisp))
(in-package :shrdlu)

; This appears to be the width of the terminal
; No, it's not.  Not sure what it is....
(DEFCONSTANT CHRCT 76)

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

; Set either (DEBUGMODE) or (USERMODE) here.
(USERMODE)
(DEBUGMODE)

; Start the program
(INITIALSTUFF 'UMR-1.0 NIL)

