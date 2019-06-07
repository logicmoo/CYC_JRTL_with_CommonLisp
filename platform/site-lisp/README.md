##neuroscience #whatwg #linguistics ###nlp #languagengine #symbo1ics #freelifeplanner #planningparty #tensorflow ##machinelearning ##AGI #lispgames #swig #ros #robotics #opencog #nltk #nars #minikanren #lojban #json-ld #Genifer  #gameai #aichallenge #ai ##nlp ##mud #intfiction ##logic ##narrative-ai ##prolog #eulergui #logicmoo #wikidata




Loading org.armedbear.lisp.Main
Staring main...
changing value of {special CL:*DEFAULT-PATHNAME-DEFAULTS* ====> javaNULL} to G:\opt\CYC_JRTL_with_CommonLisp\platform\site-lisp\
changing value of {special CL:*PACKAGE* ====> javaNULL} to #<PACKAGE COMMON-LISP-USER>
changing value of {special CL:*DEFAULT-PATHNAME-DEFAULTS* ====> "G:\\opt\\CYC_JRTL_with_CommonLisp\\platform\\site-lisp\\"} to #P"G:/opt/CYC_JRTL_with_CommonLisp/platform/site-lisp/"
DEBUG: First SUBLFILE
changing value of {special CL:*ERROR-OUTPUT* ====> javaNULL} to #<STREAM CHARACTER CHARACTER :OUTPUT OPEN TTY {1360657223}>
Armed Bear Common Lisp 1.6.0-uabcl (built Wed Jun 05 2019 22:58:08 UTC)
Java 1.8.0_162 Oracle Corporation
Java HotSpot(TM) 64-Bit Server VM
Low-level initialization completed in 1.137 seconds.
Startup completed in 4.221 seconds.
Type ":help" for a list of available commands.
CL-USER(1):  (asdf:load-system "shop3")

#<THREAD "main" {7674A051}>: Debugger invoked on condition of type READER-ERROR
  The package "ASDF" can't be found.
Restarts:
  0: TOP-LEVEL Return to top level.
[1] CL-USER(1): 0
CL-USER(2): (let ((quicklisp-init (merge-pathnames "quicklisp/setup.lisp" (user-homedir-pathname))))
  (when (probe-file quicklisp-init)
    (load quicklisp-init)))

(require :abcl-contrib)
(require :asdf)

(asdf:initialize-source-registry
     '(:source-registry (:tree "/opt/CYC_JRTL_with_CommonLisp/platform/site-lisp/quicklisp/local-projects/fiveam-asdf/") 
      :inherit-configuration))
(asdf:initialize-source-registry
     '(:source-registry (:tree "/opt/CYC_JRTL_with_CommonLisp/platform/site-lisp/quicklisp/local-projects/shop3/") 
      :inherit-configuration))

T
CL-USER(3): CL-USER(3): ("ABCL-CONTRIB")
CL-USER(4): NIL
CL-USER(5): CL-USER(5): CL-USER(6): CL-USER(7): CL-USER(7):  (asdf:load-system "shop3")
Error loading G:/opt/CYC_JRTL_with_CommonLisp/platform/site-lisp/quicklisp/local-projects/shop3/shop3/shop3.asd at line 191 (offset 7665)
#<THREAD "main" {7674A051}>: Debugger invoked on condition of type MISSING-COMPONENT
  Component "fiveam-asdf" not found
Restarts:
  0: RETRY                         Retry ASDF operation.
  1: CLEAR-CONFIGURATION-AND-RETRY Retry ASDF operation after resetting the configuration.
  2: TOP-LEVEL                     Return to top level.
[1] SHOP-ASD(8): 2
CL-USER(9):  (asdf:load-system "fiveam-asdf")
#<THREAD "main" {7674A051}>: Debugger invoked on condition of type MISSING-COMPONENT
  Component "fiveam-asdf" not found
Restarts:
  0: RETRY                         Retry ASDF operation.
  1: CLEAR-CONFIGURATION-AND-RETRY Retry ASDF operation after resetting the configuration.
  2: TOP-LEVEL                     Return to top level.
[1] CL-USER(10): 2
CL-USER(11): (already-loaded-systems)
#<THREAD "main" {7674A051}>: Debugger invoked on condition of type UNDEFINED-FUNCTION
  The function ALREADY-LOADED-SYSTEMS is undefined.
Restarts:
  0: CONTINUE     Try again.
  1: USE-VALUE    Specify a function to call instead.
  2: RETURN-VALUE Return one or more values from the call to ALREADY-LOADED-SYSTEMS.
  3: TOP-LEVEL    Return to top level.
[1] CL-USER(12): 0
#<THREAD "main" {7674A051}>: Debugger invoked on condition of type UNDEFINED-FUNCTION
  The function ALREADY-LOADED-SYSTEMS is undefined.
Restarts:
  0: CONTINUE     Try again.
  1: USE-VALUE    Specify a function to call instead.
  2: RETURN-VALUE Return one or more values from the call to ALREADY-LOADED-SYSTEMS.
  3: TOP-LEVEL    Return to top level.
[1] CL-USER(13): 3
CL-USER(14): (ql:quickload "shop3")
To load "shop3":
  Load 1 ASDF system:
    shop3
; Loading "shop3"
To load "iterate":
  Load 1 ASDF system:
    asdf
  Install 1 Quicklisp release:
    iterate
; Fetching #<QL-HTTP:URL "http://beta.quicklisp.org/archive/iterate/2018-02-28/iterate-20180228-git.tgz">
; 325.97KB
==================================================
333,795 bytes in 0.42 seconds (781.71KB/sec)
; Loading "iterate"
[package iterate]......
; Loading "shop3"
To load "trivial-garbage":
  Load 1 ASDF system:
    asdf
  Install 1 Quicklisp release:
    trivial-garbage
; Fetching #<QL-HTTP:URL "http://beta.quicklisp.org/archive/trivial-garbage/2019-05-21/trivial-garbage-20190521-git.tgz">
; 10.19KB
==================================================
10,438 bytes in 0.0 seconds (1132.60KB/sec)
; Loading "trivial-garbage"
[package trivial-garbage]
; Loading "shop3"
To load "alexandria":
  Load 1 ASDF system:
    asdf
  Install 1 Quicklisp release:
    alexandria
; Fetching #<QL-HTTP:URL "http://beta.quicklisp.org/archive/alexandria/2018-12-10/alexandria-20181210-git.tgz">
; 50.00KB
==================================================
51,197 bytes in 0.06 seconds (877.14KB/sec)
; Loading "alexandria"
[package alexandria.0.dev].....
; Loading "shop3"
[package shop3.unifier]...........................
[package shop3.common]............................
[package shop3.theorem-prover]....................
[package shop3]...................................
[package shop3-user]..............................
[package shop3-pprint]............................
[package plan-tree]...............................
[package shop3-minimal-subtree].

SHOP3 version 3.0.0
Copyright (C) 2004-2019 SIFT, LLC.

Original SHOP2 code Copyright (C) 2002  University of Maryland.

This software is distributed on an "AS IS" basis, WITHOUT WARRANTY OF ANY
KIND, either express or implied.  This software is distributed under an
MPL/GPL/LGPL triple license.  For details, see the software source file.

; Compilation unit finished
;   The following functions were used but not defined:
;     CALL-NEXT-METHOD


("shop3")
CL-USER(15): (user-homedir-pathname)
#P"C:/Users/Administrator/"
CL-USER(16): (asdf:load-system "shop3")
T
CL-USER(17): (asdf:load-system "shop3")
T
CL-USER(18): 