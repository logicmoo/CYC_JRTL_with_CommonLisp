
# Command line params

Which REPL to start from
````
--repl=[prolog,cyc,cl,bsh] 
````


System Enablements
````
--nocyc         Do not load F-Logic CYC Inference Engine
--nolarkc       Do not load the LarKC Plugins and advanced SPARQL Services
--subl          Yet Still load the Cycorp JRTL''s SubLisp system to load LarKC/CYC later

--prolog        Enable 2-Way calling beteween Lisp and Prolog
--prologsync    CYC''s KB is kept/managed from the Prolog VM instead of the JRTL (JavaRunTimeLibrary)
--trackstructs  F-Logic for CLOS/SubL Structures fullfiling the dreams of type-theory and OO. 
--swish         Start SWISH and SWI-Prolog''s WebUIs (Not finished)

--nobsh         Do not allow use of BeanShell''s Ecosystem (Security-risk otherwise)
--nogui         Makes the JVM act headless disabling many GUI options

--j            J Desktop from ABCL   (Heavywieght Code Editing / REPLs)
--bshgui       BeanShell Desktop     (Lightwieght REPLs + User Widgets)
--bowl         BeanBowl UI           (Featherwieght Widget/Class Inspector)
--appdapter    AppdapterGUI          (The UI that redesigns itself to accomidate how your data is changing at runtime)

--jdwp=5005    Start the JVM Debug Server interface locally
--jdwp=10.0.0.122:5005  (supply a hostname to remotely connect to one)

--noXXX        (such as --nogui)  is equivalent to --XXX=[false,f,no,n,0,off]

--XXX          Is same as:  --XXX=[true,t,yes,y,1,on]

````


Worker Threads and extra REPLs commonly need I/O and thus launch into a console interface
````
--console=[stdio,telnet,bshgui,j,awt,swing]   

Special cases when this was unspecified:

--nogui   changes console to: telnet (Except for the first REPL)
--bshgui  changes console to: bshgui
--j       changes console to: j

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

The occurance of '--' copies the remaining arguments, unprocessed, into
the variable EXTENSIONS:*COMMAND-LINE-ARGUMENT-LIST*.

````


-D switches:
````
  -Dbaseport=3600          CYC/LarKC Base TCP Port
  -Dhostname=10.0.0.180    
````  



Examples:


./abclc   
