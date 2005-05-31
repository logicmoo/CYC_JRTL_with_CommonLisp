;;; customizations.lisp

;;; User customizations for the build.

;;; This file is LOADed by INITIALIZE-BUILD (in build-abcl.lisp).

;;; The variable *PLATFORM-IS-WINDOWS* should be true on Windows platforms. You
;;; can, of course, substitute your own test for this in the code below, or add
;;; a section for OS X, or Solaris, or whatever...

;;; You MUST set *JDK* to the location of the JDK you want to use.

;;; You don't really need to specify anything else. *JAVA-COMPILER* and *JAR*
;;; default to javac and jar, respectively, from the configured JDK.

;;; Directories should be specified with a trailing slash (or, on Windows, a
;;; trailing backslash).

(in-package #:build-abcl)

;; Standard options.
(setf *javac-options* "-g")
(setf *jikes-options*
      (if *platform-is-windows*
          "+Z0 +D -g" ;; +Z0 for jikes 1.21
          "+D -g"))

(cond (*platform-is-windows*
       (setf *jdk* "C:\\Program Files\\Java\\jdk1.5.0_02\\")
       (setf *java-compiler* "C:\\Program Files\\Java\\jdk1.5.0_02\\bin\\javac.exe"))
      (t ; Linux
       (setf *jdk* "/home/peter/blackdown/j2sdk1.4.2/")
       (setf *java-compiler* "/usr/bin/jikes")
       (setf *jar* "fastjar")))
