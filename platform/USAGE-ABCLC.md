
# Command line params

Language at First Console
````
--console=[prolog,cyc,cl,bsh] 
````

New Threads (thus protentially I/O and REPLs) launch normal or using J or Beanshell Desktop
````
--repl= [stdio,j,bshgui,awt,swing]  
````

System Enablement
````
--prolog        Enables 2-Way calling beteween Lisp and Prolog
--bsh           Allow use of BeanShell''s Ecosystem (+BSF)              
--subl          Load the Cycorp JRTL''s SubLisp system
--cyc           F-Logic Inference Engine
--prologsync    CYC''s KB is kept/managed from the Prolog VM instead of the JRTL (JavaRunTimeLibrary)
--trackstructs  F-Logic for CLOS/SubL Structures fullfiling the dreams of type-theory and OO. 
 
--nogui        Makes the JVM act headless disabling many GUI options

--j            J Desktop from ABCL   (Heavywieght Code Editing/REPLs)
--bshgui       BeanShell Desktop     (Lightwieght REPLs + User Widgets)
--bowl         BeanBowl UI           (Featherwieght Widget/Class Inspector)
--appdapter    AppdapterGUI          (UI that designs itself as your data mutaes)


--noXXX (such as --nogui)
 means the same things as: 
     --XXX=[false,f,no,n,0,off]

--XXX (such as --gui)
  means the same things as:
      --XXX=[true,t,yes,y,1,on]

````
JRTL/Cyc/Lisp-only
````

--help
    Displays the ABCL-Only message.
--noinform
    Suppresses the printing of startup information and banner.
--noinit
    Suppresses the loading of the '~/.abclrc' startup file.
--nosystem
    Suppresses loading the 'system.lisp' customization file.
--eval <FORM>
    Evaluates the <FORM> before initializing REPL.
--load <FILE>
    Loads the file <FILE> before initializing REPL.
--load-system-file <FILE>
    Loads the system file <FILE> before initializing REPL.
--batch
    The process evaluates forms specified by arguments and possibly by those
    by those in the intialization file '~/.abcl', and then exits.
````

The occurance of '--' copies the remaining arguments, unprocessed, into
the variable EXTENSIONS:*COMMAND-LINE-ARGUMENT-LIST*.


