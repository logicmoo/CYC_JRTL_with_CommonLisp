;;;-*- Package: MEASURES; Syntax: Common-Lisp -*-

(in-package :measures)

;;;; ************************ Initialization ******************************

(ecase *read-measures*                 ; default is :integrated
       (:on-demand (install-dim-number-reader))
       (:dispatched (install-dim-number-reader :dispatch #\M))
       (:integrated (install-dim-number-reader :permanent t)))


#|  ; Commented out, because it causes problems leading to
    ; infinite loops in some Allegro implemenations, ie, SRI's.
;;;
;;; These are needed to preserve the changes to the readtable over
;;;  calls to the Allegro dumplisp function
;;;

#+(and :excl (not :allegro-v4.2) (not :allegro-v4.1))
(push #'(lambda () (ms:install-dim-number-reader :permanent t))
      excl::*restart-actions*)
#+(and :excl (or :allegro-v4.2 :allegro-v4.1))
(push (cons :eval (ms:install-dim-number-reader :permanent t))
      excl::*restart-actions*)

|#
