# CYC_JRTL_with_CommonLisp

Most Worked-on Feature set * Full compatibility with LarKC Platform http://larkc.eu * This library is a drop-in replacement to the subl.jar of OpenCyc

Un-Armed Bear Common Lisp for Java - LispSharp

A specialized re-implementation of Armed Bear Common Lisp.

(see http://common-lisp.net/project/armedbear)

Extra features * Passes additional CL ANSI-TESTS * Also Runs under .NET/Mono as an EXE and DLL * Requires no Java/JVM

This allows OpenCyc to use common-lisp * Generate .java files from lisp source files instead of .class files. This allows users to go back in and re-edit the generated .java files.

Licence: GPLv2 + Classpath Exception

Project Information

Labels: 
lisp java ikvm .net LispSharp lisp.net


Understanding Source Directories:
~~~~
  ./abcl/    Close to normal ABCL in order to make merging easier
  ./platform/src/org/armedbar/  Abnormal ABCL merged with LarKC
  ./platform/src/com/cyc/tool/  CYC JRTL initially from LarKC with CommonLisp
  ./platform/src/com/cyc/cycjava/  LarKC stripped down cyc.jar
~~~~

# Building


~~~~
root@gitlab:/opt# git clone https://github.com/TeamSPoon/CYC_JRTL_with_CommonLisp
Cloning into 'CYC_JRTL_with_CommonLisp'...
remote: Enumerating objects: 147, done.
remote: Counting objects: 100% (147/147), done.
remote: Compressing objects: 100% (138/138), done.
remote: Total 126930 (delta 14), reused 70 (delta 2), pack-reused 126783
Receiving objects: 100% (126930/126930), 208.24 MiB | 15.62 MiB/s, done.
Resolving deltas: 100% (65844/65844), done.
Checking out files: 100% (7790/7790), done.

root@gitlab:/opt# cd CYC_JRTL_with_CommonLisp/

root@gitlab:/opt/CYC_JRTL_with_CommonLisp# tar xfvz /mnt/gggg/researchcyc-4.0q.tgz
researchcyc-4.0q/
researchcyc-4.0q/server/
researchcyc-4.0q/server/cyc/
researchcyc-4.0q/server/cyc/run/
researchcyc-4.0q/server/cyc/run/plugins/
researchcyc-4.0q/server/cyc/run/units/
......
researchcyc-4.0q/doc/CycAdministratorHandbook.pdf
researchcyc-4.0q/README.txt
~~~~

~~~~
root@gitlab:/opt/CYC_JRTL_with_CommonLisp# rm -rf platform/
root@gitlab:/opt/CYC_JRTL_with_CommonLisp# mv researchcyc-4.0q/server/cyc/run/ platform
root@gitlab:/opt/CYC_JRTL_with_CommonLisp# git checkout platform/ -f
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform# . set_classpath.sh
~~~~

~~~~
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform# ant
Buildfile: /opt/CYC_JRTL_with_CommonLisp/platform/build.xml

abcl.clean.maybe:

abcl.copy.lisp:
     [copy] Copying 749 files to /opt/CYC_JRTL_with_CommonLisp/platform/build/classes

abcl.stage:
     [copy] Copying 1 file to /opt/CYC_JRTL_with_CommonLisp/platform/build/classes

abcl.init:
     [echo] java.version: 1.8.0_191

abcl.java.warning:

abcl.jsr-223.notice:

abcl.compile.java:
    [javac] Compiling 3402 source files to /opt/CYC_JRTL_with_CommonLisp/platform/build/classes
    [javac] warning: [options] bootstrap class path not set in conjunction with -source 1.6
.....
     [java] ;COMMON-LISP:REPLACE triggers autoloading of replace ...
     [java] ; Autoloaded replace (0.003 seconds)
     [java]
     [java] ; Compilation unit finished
     [java] ;   Caught 4 STYLE-WARNING conditions
     [java] ;   The following functions were used but not defined:
     [java] ;     SYSTEM::SOURCE
     [java]
     [java] 195.153 seconds real time
     [java] 245913029 cons cells

BUILD FAILED
/opt/CYC_JRTL_with_CommonLisp/platform/build.xml:294: The following error occurred while executing this line:
/opt/CYC_JRTL_with_CommonLisp/platform/build.xml:313: Java returned: 255

Total time: 5 minutes 11 seconds
~~~~


~~~~
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform# ant
Buildfile: /opt/CYC_JRTL_with_CommonLisp/platform/build.xml

abcl.clean.maybe:

abcl.copy.lisp:
     [copy] Copying 13 files to /opt/CYC_JRTL_with_CommonLisp/platform/build/classes

abcl.stage:

abcl.init:
     [echo] java.version: 1.8.0_191

abcl.java.warning:

abcl.jsr-223.notice:

abcl.compile.java:
    [javac] Compiling 2899 source files to /opt/CYC_JRTL_with_CommonLisp/platform/build/classes
    [javac] warning: [options] bootstrap class path not set in conjunction with -source 1.6
    [javac] Note: Some input files use or override a deprecated API.
    [javac] Note: Recompile with -Xlint:deprecation for details.
    [javac] Note: Some input files use unchecked or unsafe operations.
    [javac] Note: Recompile with -Xlint:unchecked for details.
    [javac] 1 warning

abcl.system.uptodate:

abcl.system.update.maybe:

abcl.fasls.uptodate:

abcl.compile.lisp:
     [echo]
     [echo] Compiling Lisp system
     [echo] from /opt/CYC_JRTL_with_CommonLisp/platform/src/org/armedbear/lisp
     [echo]  to  /opt/CYC_JRTL_with_CommonLisp/platform/build/classes/org/armedbear/lisp
     [java] The symbol CYC:INIT-CYC is already accessible in package SUBLISP.
     [java] The symbol CYC:INIT-CYC is already accessible in package CYC.
     [java] The symbol COMMON-LISP-USER:INIT-CYC is not accessible in package CYC.
     [java] The symbol CYC:INIT-CYC is already accessible in package EXTENSIONS.
     [java] The symbol CYC:INIT-KB is already accessible in package SUBLISP.
     [java] The symbol CYC:INIT-KB is already accessible in package CYC.
     [java] ;COMMON-LISP:FILL triggers autoloading of fill ...
     [java] ; Autoloaded fill (0.001 seconds)
     [java] ;COMMON-LISP:REPLACE triggers autoloading of replace ...
     [java] ; Autoloaded replace (0.004 seconds)

abcl.compile:
     [echo] Compiled ABCL with Java version: 1.8.0_191

abcl.version.src.0:

abcl.version.src.1:

abcl.version.src.2:

abcl.version.src.3:

abcl.version.src:

abcl.stamp.version.uptodate:

abcl.stamp.version.generate:

abcl.stamp.version.0:

abcl.stamp.version.1:

abcl.stamp.version.2:

abcl.stamp.version:
     [echo] ABCL implementation version: 1.5.0-uabcl-dev

abcl.stamp.hostname:
     [echo] abcl.hostname: gitlab

abcl.stamp:

abcl.jar.uptodate:

abcl.contrib:
      [jar] Building jar: /opt/CYC_JRTL_with_CommonLisp/platformabcl/dist/abcl-contrib.jar
     [echo]
     [echo] Packaged contribs in /opt/CYC_JRTL_with_CommonLisp/platformabcl/dist/abcl-contrib.jar. To use contribs, ensure that
     [echo] this file is in the same directory as 'abcl.jar', and then
     [echo]
     [echo]   CL-USER> (require 'abcl-contrib)
     [echo]
     [echo] will place all the contribs in the ASDF registry.
     [echo]
     [echo] To load a contrib, something like
     [echo]
     [echo]   CL-USER> (require 'jss)
     [echo]
     [echo] will compile (if necessary) and load JSS.

abcl-contrib.jar:

abcl.jar:
      [jar] Building jar: /opt/CYC_JRTL_with_CommonLisp/platformabcl/dist/abcl.jar

abcl.wrapper.unix:

abcl.wrapper.windows:

abcl.wrapper:
     [copy] Copying 1 file to /opt/CYC_JRTL_with_CommonLisp/platform
     [echo] Created executable ABCL wrapper in 'abcl'
     [echo] N.B. This wrapper requires '/opt/CYC_JRTL_with_CommonLisp/platformabcl/dist/abcl.jar' not be moved.

BUILD SUCCESSFUL
Total time: 2 minutes 17 seconds
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform#
~~~~


~~~~
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform# ant -f ec-build.xml
Buildfile: /opt/CYC_JRTL_with_CommonLisp/platform/ec-build.xml

build-subprojects:

init:
    [mkdir] Created dir: /opt/CYC_JRTL_with_CommonLisp/platform/target/classes
     [copy] Copying 236 files to /opt/CYC_JRTL_with_CommonLisp/platform/target/classes
     [copy] Copying 8516 files to /opt/CYC_JRTL_with_CommonLisp/platform/target/classes
     [copy] Copying 17 files to /opt/CYC_JRTL_with_CommonLisp/platform/target/classes
     [copy] Copying 166 files to /opt/CYC_JRTL_with_CommonLisp/platform/target/classes
     [copy] Copying 18 files to /opt/CYC_JRTL_with_CommonLisp/platform/target/classes
     [copy] Copying 376 files to /opt/CYC_JRTL_with_CommonLisp/platform/target/classes
     [copy] Copying 72 files to /opt/CYC_JRTL_with_CommonLisp/platform/target/classes
     [copy] Copying 3 files to /opt/CYC_JRTL_with_CommonLisp/platform/target/classes
     [copy] Copying 1 file to /opt/CYC_JRTL_with_CommonLisp/platform/target/classes
     [copy] Copying 18 files to /opt/CYC_JRTL_with_CommonLisp/platform/target/classes

build-project:
     [echo] platform: /opt/CYC_JRTL_with_CommonLisp/platform/ec-build.xml

build:

BUILD SUCCESSFUL
Total time: 5 seconds
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform# 
~~~~

~~~~
root@gitlab:/opt/CYC_JRTL_with_CommonLisp/platform# ./abcl
The symbol CYC:INIT-CYC is already accessible in package SUBLISP.
The symbol CYC:INIT-CYC is already accessible in package CYC.
The symbol COMMON-LISP-USER:INIT-CYC is not accessible in package CYC.
The symbol CYC:INIT-CYC is already accessible in package EXTENSIONS.
The symbol CYC:INIT-KB is already accessible in package SUBLISP.
The symbol CYC:INIT-KB is already accessible in package CYC.
The symbol COMMON-LISP-USER:INIT-KB is not accessible in package CYC.
The symbol CYC:INIT-KB is already accessible in package EXTENSIONS.
The symbol CYC:INIT-SUBL is already accessible in package SUBLISP.
The symbol CYC:INIT-SUBL is already accessible in package CYC.
The symbol COMMON-LISP-USER:INIT-SUBL is not accessible in package CYC.
The symbol CYC:INIT-SUBL is already accessible in package EXTENSIONS.
Trying to overwrite a non method function
Trying to overwrite a non method function
Trying to overwrite a non method function
DEBUG: First SUBLFILE
Armed Bear Common Lisp 1.5.0-uabcl-dev
Java 1.8.0_191 Oracle Corporation
OpenJDK 64-Bit Server VM
Low-level initialization completed in 0.663 seconds.
Startup completed in 3.104 seconds.
Type ":help" for a list of available commands.
CL-USER(1): 
~~~~

~~~~
CL-USER(1): (INIT-KB)
Warn: Redefining {dynamic special built-in-function CL:* -pf_multiply- ====> CL:NIL}
Warn: COMMON-LISP:* NOT redefining #<Primitive.pf_multiply CL:* "&rest numbers" {5CF8676A}> with #<SubLCompiledFunction CL:*  {388D14E}>
 Loading implementation classes ...
 ......... 10% ......... 20% ......... 30% ......... 40% ......... 50%
 ......... 60% ......... 70% ......... 80% ......... 90% ......... 100%
 Done.
Low memory situations will be triggered when post-gc usage exceeds 6900MB(90% of 7667MB) for Heap memory pool CMS Old Gen
Low memory situations will be triggered when post-gc usage exceeds 6900MB(90% of 7667MB) for Heap memory pool CMS Old Gen
;;; loading init/jrtl-release-init.lisp ...
;;; loading init/jrtl-init.lisp ...
Warning: No KB is loaded.  System KB initializations will not be run.
Initializing Cyc 10.152303 (ResearchCyc (custom))

;;; Loading KB from units/7166/ at 01/05/2019 12:22:03
Loading special objects ... DONE (0:00)
Initializing HL backing store caches from units/7166/.

;;; Loading essential KB at 01/05/2019 12:22:03
Freeing clause-strucs ... DONE (0:00)
Freeing KB HL supports ... DONE (0:00)
Freeing deductions ... DONE (0:00)
Freeing assertions ... DONE (0:00)
Freeing NARTs ... DONE (0:00)
Freeing constants ... DONE (0:00)
Determining maximum unrepresented-term SUID ... DONE (0:00)
Loading constant shells
...
~~~~

