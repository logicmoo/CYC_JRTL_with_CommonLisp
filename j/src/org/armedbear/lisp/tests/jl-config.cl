
;; $Id: jl-config.cl,v 1.1 2005-10-22 12:15:14 piso Exp $

(in-package :user)

;;;
;;; SAMPLE FILE with DUMMY values to be customized for each site
;;;
;;; The purpose of this file is to set some configuration variables
;;; used by jLinker.  These variables are required ONLY if Java is
;;; started from Lisp with a call to (jlinker-init [:start] ... ).
;;; If the Java application is started some other way, this file
;;; may be safely ignored.
;;;
;;;??? marks places that MUST be customized


;;;??? - Comment out the following statement in the customized
;;;       copy of this file.
;;(error "This file must be renamed and customized before it can be used")

(eval-when (compile load eval) (require :jlinker))

;; The variable javatools.jlinker:*jlinker-java-home* must be set to
;; the directory (folder) where Java is installed.
;;
;; Expected value of this symbol:
;;
;; string -> Path namestring of Java home directory
;;           jLinker will construct a suitable value for PATH
;;           and for CLASSPATH
;;
;; nil    -> jLinker makes no modifications to PATH or CLASSPATH
;;           User must make sure that the file jlinker.jar is
;;           visible to Java.

;;;??? - Modify the following expression to set an appropriate value.
;;       Use one (and only one) of case A or case B.
;; Case A: You are the only user of jLinker and jLinker will be only
;;         be used on one machine.
;;      Step A.1: Modify the string "???" to the path of the Java
;;                installation in your machine.
;;      Step A.2: Uncomment the next line.
(setf javatools.jlinker:*jlinker-java-home* "/home/peter/blackdown/j2sdk1.4.2")
;;      Step A.3: Skip forward to the line ;; Set *jlinker-run-java*



;; Case B: If jLinker must run on several different machines with different
;;         Java configurations, the following expression allows one
;;         jl-config.cl file to be used on all the machines.
;; If using Case B, comment out the following (#+...) line
#+ignore
(setf javatools.jlinker:*jlinker-java-home*
      (case

	  ;; normalize the machine name to a keyword
	  ;; in the current readtable case
	  (read-from-string
	     (concatenate 'string ":" (string-downcase (short-site-name))))

;;;???(Case B only)  Insert your own machine names here.

	(:proa       "c:\\Franz\\Java\\jdk150")
	(:foray     "/usr/java/j2sdk1.4.2_06")
	(:gazelle   "/usr/java/j2sdk1.4.2_06")
	(:edge      "/usr/j2sdk1.4.2_06")
	(:blade     "/usr/j2sdk1.4.2_06")
	(:hobart     "c:\\j2sdk1.4.2_04")
	(:corba      "/b/jdk1.1.6")      ;; pre 7.0
	(:spot       "/usr/j2se-1.3.1")  ;; pre 7.0
	(:cobweb     "/usr/java/jdk1.3.1")
	(:killer     "/usr/java/jdk1.3")  ;; pre 7.0

	;; The value "" implies that java is already in the path
	;;  the current directory will be added to CLASSPATH.
	;; The value NIL implies that both path and CLASSPATH
	;;  are preset correctly outside this script.
	(otherwise   "")
	)
      )



;; Set *jlinker-run-java*
;;
;; The variable javatools.jlinker:*jlinker-run-java* must be set to the
;; name of the function that will be used to start Java.  The default
;; setting suggested below should be adequate for most installations.
;;
;; Expected value of this symbol:
;;
;;  symbol -> The name of a function of at least five (5) optional arguments.
;;            The default value shown below is a function included
;;            with jLinker.  This value can also be replaced with
;;            the name of a suitable user-written function.
;;  other  -> Error
;;
;;;??? - Modify the following statement if the default function is not
;;;       suitable for running Java in your installation.
(setf javatools.jlinker:*jlinker-run-java* 'javatools.jlinker::run-java)



;; jLinker default settings
;;
;; The following variables have default values that may be changed
;; to suit special situations (such as heavy debugging).  The symbols
;; are described in more detail in the reference manual.
;;
;;(setf javatools.jlinker:*jlinker-error-p* t)            ;; default is nil
;;
;;(setf javatools.jlinker:*jlinker-verbose* t)            ;; default is nil
;;(setf javatools.jlinker:*jlinker-debug* t)              ;; default is nil
;;(setf javatools.jlinker:*jlinker-retry-number* 3)       ;; default is 3
;;(setf javatools.jlinker:*jlinker-retry-delay*  5)       ;; default is 5



;; The following variable is used only in Unix implementations.
;; When t, Java is started directly, without invoking a shell (and
;; shell profile).  In general, this is a good idea because it avoids user
;; shell profiles when we call Java (after setting up path and CLASSPATH).
;;(setf javatools.jlinker:*jlinker-unix-vector-p* t)        ;; default is t







;; The code for javatools.jlinker::run-java is included below as a
;; sample that can be renamed and  modified to satisfy the
;; requirements of a particular installation.
#|

(defun run-java (&optional debug lport lhost jport jhost &rest more)
  (let* ((op-val #+unix      "java"
		 #+mswindows
		 (if* (not debug)
		      then "javaw.exe"
		      elseif (excl::ms-win95-p)
		      then "command.com /c start /wait /b java.exe"
		      else "cmd.exe /c start /wait /b java.exe")
		 )
	 (*print-circle* nil) ;;; dont bother showing shared strings...
	 (*print-level* nil)
	 (*print-length* nil)
	 (class javatools.jlinker::*java-link-base-class*)
	 (cmdl (append (list op-val)
		       (and more (consp (first more))
			    (eq :options (first more))
			    (mapcar #'(lambda (m) (format nil "~A" m))(cdr (pop more))))
		       (list class)
		       (when lport (list "-lport" (format nil "~D" lport)))
		       (when lhost (list "-lhost" lhost))
		       (when jport (list "-jport" (format nil "~D" jport)))
		       (when jhost (list "-jhost" jhost))
		       (when debug (list "-debug"))
		       (mapcar #'(lambda (m) (format nil "~A" m)) more)
		       ))
	 (command
	  #+mswindows (format nil "~{~A ~}" cmdl)
	  #+unix
	  (if *jlinker-unix-vector-p*
	      (make-array (1+ (length cmdl))
			  :initial-contents (cons (car cmdl) cmdl))
	    (format nil "~{~A ~}" cmdl))
	  )
	 (log
	  #+mswindows (and debug (jlinker-slot :java-out)
			   (concatenate
			    'string (jlinker-slot :java-out) ".log"))
	  #+unix nil
	  )
	 (elog (when log
		 (concatenate 'string (jlinker-slot :java-out) "e.log")))
	 (show (if (and debug (null log)) :showna :hide))
	 )
    (set-java-paths)
    (when log (jlinker-slot :java-out :wrap))
    (jcollect-pid
	 command
	 :output log
	 :if-output-exists :supersede
	 :error-output elog
	 :if-error-output-exists :supersede
	 :show-window show
	 :wait nil)))

(defun jcollect-pid (&rest args)
  (multiple-value-bind (rc x pid)
      (apply #'run-shell-command args)
      (declare (ignore x))
      (if pid
	  (jlinker-slot :pid pid)
	rc)))

(defun set-java-paths ()
  (let* ((delim #+mswindows "\\" #+unix "/")
	 (break #+mswindows ";" #+unix ":")
	 (jhome *jlinker-java-home*)
	 #+ignore class
	 oldcp
	 path)
    (when (and jhome (file-directory-p jhome))
      (when (equal jhome "") (setf jhome "."))
      (setf (sys:getenv "JAVA_HOME") jhome)

      #+ignore (setf class (sys:getenv "CLASSPATH"))
      #+ignore (if (or (null class) (equal class ""))
		   (setf class "")
		 (setf class (concatenate 'string class break)))

      (setf oldcp (sys:getenv "CLASSPATH"))
      (when (or (null oldcp) (equal oldcp "")) (setf oldcp ""))
      #+mswindows (when (eql 0 (search "\"" oldcp))
		    (setf oldcp (subseq oldcp 1 (1- (length oldcp)))))
      (or (and oldcp (search "jlinker.jar" oldcp))
	  (setf (sys:getenv "CLASSPATH")
		(apply #'concatenate 'string
		       #+ignore class
		       "." delim break
		       "jlinker.jar"
		       ;;break jhome delim "lib"
		       (when oldcp (list break oldcp))
		       )))
      (or (and (setf path (sys:getenv "PATH"))
	       (search jhome path))
	  (setf (sys:getenv "PATH")
		(concatenate 'string jhome delim "bin" break path))))))

|#




