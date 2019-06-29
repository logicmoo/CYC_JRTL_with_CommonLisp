

------------------------------------------------------------------

To try jLinker from an installation:

 - copy jlinker/jl-config.cl to the current directory
   customize as described in the comments

 - copy jlinker/jlinker.jar to the current directory

 - start ACL
   (require :jlinker)
   (use-package :net.jlinker)
   (load "jl-config.cl")   ;;; not needed on Windows
   (jlinker-init)
   (jclass "int")  =>  <remote class ref>
   ...             ;; continue with random calls to Java
   (jlinker-end)   ;; to shutdown Java


To try the timecard example:

 - copy customized jl-config.cl to examples/jlinker/timecard/
 - copy jlinker/jlinker.jar to examples/jlinker/timecard/

 - start ACL in examples/jlinker/timecard/
   :pa :cl-user
   (require :jlinker)
   (use-package :net.jlinker)
   :ld jl-config.cl   ;;; not needed on Windows
   :cl main
   (main)      ;; window appears after several seconds




-----------------------------------------------------------------------

	CONFIGURATION and STARTUP ISSUES

	In ACL:
	(require :jlinker)           ;; to load jLinker functions
	(use-package :net.jlinker) ;; (optional) to avoid long package prefix


CASE 1: The Java application runs in a browser or a seaparately
	started Java VM.

	The only information needed in Lisp is how to advertise
	the Lisp server or how to find the Java server.  This
	information consists of a shared file name or a 
	pre-determined host/port combination.  Details are
	in jlinker.htm in the description of jlinker-init.

	The Java application will need access to the file jlinker.jar
	as well as the file or host/port information.


CASE 2: Lisp will start the Java VM and/or the Java application

	Lisp must know how to start Java and how to set the
	Java CLASSPATH environment variable.  The details are in 
	file jl-config.cl.

	The assumption there is that the file jlinker.jar is in
	the current directory.




