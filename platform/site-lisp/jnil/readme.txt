-*- outline -*-

JNIL

* PACKAGE CONTENTS

Jnil is currently divided into two modules: An Eclipse plug-in and an ASDF Lisp
system. Both of them should be present in this package, in the following directories:

eclipse/org.sourceforge.eclisp_1.2.0/ (Eclipse plug-in)
lisp/jnil/ (Jnil)

Besides these, the package also contains the following files:
- readme.txt
- license-llgpl.txt
- license-lgpl.txt

* DEPENDENCIES

Jnil currently depends on Eclipse 3.x for parsing Java files/projects. You will always have to have
the project's source as an Eclipse project before translating it. Please make sure the
Eclipse project has no unresolved bindings or the translation may abort with an error!

In order to communicate with Eclipse, Jnil relies on ACL's jLinker. At this point no other Lisp
environment is supported, although the default translation output should be ANSI, when the
target is Common Lisp.

* INSTALLATION

Copy the directory "org.sourceforge.eclisp_1_2_0" to the Eclipse plugins folder. Copy the file
"jlinker.jar" from "$ACL_HOME/jlinker/" to "org.sourceforge.eclisp_1_2_0/lib/".

Copy the directory "jnil" somewhere in your hard drive and add the directory
"$YOUR_DEV_SITE/jnil/code/" to your ASDF central registry.

Example of clinit.cl:
(setq asdf:*central-registry*
  '(*default-pathname-defaults*
    #p"/Users/tiago/Documents/dev/lisp/jnil/code/"))

You may also navigate to the directory using top-level commands such as "cd", as shown in the
example below. See 'http://www.cliki.net/asdf' for more information and alternative ways of
configuring your site.

* LICENSE

The Jnil source code is licensed under the terms of the Lisp Lesser GNU Public License, known
as the LLGPL. The LLGPL consists of a preamble and the LGPL. Where these conflict, the preamble
takes precedence. Jnil is referenced in the preamble as the LIBRARY.

* EXAMPLE

The following lines show an interaction with the Lisp top-level. Comments indicate what is
happening at each step.

CL-USER(2): :dir
/Users/tiago/Documents/dev/lisp/
CL-USER(3): :cd jnil/code
/Users/tiago/Documents/dev/lisp/jnil/code/
CL-USER(4): (asdf:operate 'asdf:load-op :jnil)
; loading system definition from /Users/tiago/Documents/dev/lisp/jnil/code/jnil.asd into
; #<The ASDF50 package>
; Loading /Users/tiago/Documents/dev/lisp/jnil/code/jnil.asd
; registering #<SYSTEM :JNIL @ #x10ca72da> as JNIL
; Fast loading /Users/tiago/Documents/dev/lisp/jnil/bin/cl-utils.fasl
[...]
; Fast loading /Users/tiago/Documents/dev/lisp/jnil/bin/main.fasl
NIL
CL-USER(5): ;;; start the eclisp server at about now
;;; we assume a project called "JnilTests" exists and contains the "lvl1.Arrays" unit
;;; translate a single java unit; no compiler switches
(jnil:translate-java-unit "JnilTests" "lvl1.Arrays" "~/Desktop/" :common-lisp) 

; Reading unit lvl1.Arrays from Eclipse project JnilTests.
; Output going to ~/Desktop/.
; Fast loading /Users/tiago/local/lib/acl80b/code/acldns.001
;;; Installing acldns patch, version 1
; Writing code to file "/Users/tiago/Desktop/lvl1/arrays.lisp".
[...]
CL-USER(6): ;;; translating a whole project without compiler switches
(time (jnil:translate-java-project "JnilTests" "~/Desktop/" :common-lisp :overwrite-existing-p t))
;;; Processing unit 1 of 18:
; Reading unit lvl1.Iter from Eclipse project JnilTests.
; Output going to /Users/tiago/Desktop/JnilTests/.
; Writing code to file "/Users/tiago/Desktop/JnilTests/lvl1/iter.lisp".
;;; Processing unit 2 of 18:
[...]
;;; Processing unit 18 of 18:
; Reading unit lvl3.Almanac from Eclipse project JnilTests.
; Output going to /Users/tiago/Desktop/JnilTests/.
; Writing code to file "/Users/tiago/Desktop/JnilTests/lvl3/almanac.lisp".
; cpu time (non-gc) 12,190 msec user, 4,070 msec system
; cpu time (gc)     400 msec user, 10 msec system
; cpu time (total)  12,590 msec user, 4,080 msec system
; real time  47,360 msec
; space allocation:
;  2,286,496 cons cells, 32,834,392 other bytes, 0 static bytes
NIL
CL-USER(7): ;;; explicitly close the connection to the eclisp server to free resources
(jnil:jnil-end)
T
CL-USER(8): ;;; that's it!

* CUSTOM BEHAVIOUR

Jnil was built with the goal of being useful. In this case, being useful mostly means being
trustworthy. By default, Jnil will translate Java into code that it knows is correct. Whenever
Jnil isn't completely sure of how to translate something, it will generate unREADable code
(between #< >). This means that, after a translation, all you really need to do is to try to
compile each file and correct each instance of code that the compiler can't read. You can
safely assume the remaining code is correct.

Jnil does have some extra smartness built-in, which will typically allow for the automatic
translation of more Java constructs. However, the risk of generating code that doesn't preserve
Java's semantics increases. This smartness may also imply the use of non-standard calls, whose
definitions are provided in the "jnil-support.asd" system (see lisp/jnil/support/).

You may activate this extra smartness by using the :compiler-switches keyword argument when
calling either jnil:translate-java-project or jnil:translate-java-unit. There are several
compiler switches, but these are nicely packed into the three groups, described below:
1. :optimize-1
   - Generate non-ANSI code for method and function definitions that conflict with Common Lisp
   function names;
   - Generate non-ANSI code for class constructors and instance creation (that uses the
   constructors).
2. :optimize-2
   - All of :optimize-1;
   - Translates some calls to non-ANSI code that hopefully makes hairy translations more
   readable while preserving the semantics of Java;
   - Translates Java SDK calls to native, based on the additional knowledge framework, but
   marks them as unREADable, to force human review.
3. :optimize-3
   - All of :optimize-3 but doesn't mark additional knowledge calls as unREADable.

Typically, :optimize-2 provides a good compromise between translation power and reliability.

An example of the usage of these keywords:

CL-USER(8): ;;; using compiler-switches
(jnil:translate-java-project "JnilTests" "~/Desktop/" :common-lisp :compiler-switches '(:optimize-2))
