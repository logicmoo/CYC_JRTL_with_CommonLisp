;;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-

(in-package "CYC")

(cvs-id "$Id: jrtl-init.lisp 132325 2010-09-28 16:53:34Z rck $")

(load-system-parameters)
(system-code-initializations)



#+MAIN-TINYKB
(clet ((units-directory "ext/cyc-tiny/"))
  (pif (fboundp 'cyc-load-kb)
       (cyc-load-kb units-directory)
       (progn
         (load-kb units-directory)
         (system-code-initializations))))

;; OpenCYC
#+MAIN-OPENCYC
(clet ((units-directory "units/5022/"))
  (pif (fboundp 'cyc-load-kb)
       (cyc-load-kb units-directory)
       (progn
         (load-kb units-directory)
         (system-code-initializations))))


;; #-CYC-STORYTELLING
'(clet ((units-directory "units/0988/"))
  (pif (fboundp 'cyc-load-kb)
       (cyc-load-kb units-directory)
       (progn
         (load-kb units-directory)
         (system-code-initializations))))

;; LarKC
;; #-MAIN-OPENCYC
;; #+CYC-STORYTELLING
(clet ((units-directory "units/7166/"))
  (pif (fboundp 'cyc-load-kb)
       (cyc-load-kb units-directory)
       (progn
         (load-kb units-directory)
         (system-code-initializations))))

#+MAIN-IGNORE
(clet ((units-directory "units/7133/"))
  (pif (fboundp 'cyc-load-kb)
       (cyc-load-kb units-directory)
       (progn
         (load-kb units-directory)
         (system-code-initializations))))

;; (common-lisp:defpackage "COMMON-LISP-USER" (:nicknames "U" "USER" "CL-USER"))

(pwhen (fboundp 'cl-imports-cyc) (cl-imports-cyc))

(pwhen (fboundp 'cyc-imports-cl) (cyc-imports-cl))


