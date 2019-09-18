
Had you read every AI Book published before 1995 (And read at least 100 important books on Psychology ) ...

This system is all the trivial things you might think you are required to create if wanted to create AI 
And Yet STILL you had no idea what to do!

But now you think you have a few ideas..

"If my AI could read every webpage it could become alive"  
Are you sure? Great! Well then this system will wake your AI up every morning and tube feed the internet down its throat.

"We only need to make a massive scale SHRDLU .. that move instead of blocks.. Concepts"  
Are you sure? Great! Well then this system will make all the concepts into moveable blocks 

"We need to make a plan-based hill-climbing version of ..."  
"I need SWALE/DAYDREAMER to have massive infinate memory..."
"We need to make X and Y ..."  
Or "We need to make ALL of the above."
"We need to make ALL of the above into a Multiagent system, integrated as in one mind"
"We need MUD to simulate the..."  

  
Enough is enough!  The code base below was designed that no mater what excuse you come up with next,
 you will only have _at most_ 3 components missing that you need to code yourself!
 (This codebase is supposed to be stuff that you might suddenly declare to yourself you needed
 (most of which you havent declared yet, but when you do, we already piping hot and pre-integrated for you!)) 
 



The platform as it stands has some "startup modes" Here are the reasons they get used
   
ABCL Common Lisp Interpreted Mode 
   -  Building the ABCL Common Lisp "Compiled" Mode    
   -  Confirm can Emulate anything that ABCL Common Lisp "Compiled" Mode can do but on non JVMs like GCJ
   -  ANSI Tests (IKVM, GCJ )
   
ABCL Common Lisp "Compiled" Mode  
   -  ANSI Tests (JVM-only)
   -  Running CL-BENCH
   -  App still works in *our* CL?
   -  REPL comfy for Common Lisp Hacker
   -  Optionally enable SubL System
   -  Default and most typical startup 
   -  Can load any runtime modules   

SubL Lisp Mode
   -  Confirming no need for Common Lisp Behaviours (Ensures System can be compiled fully to C/C++)
   -  Running Performance Tests
   -  SubL Junits
   -  SubL Translation/Compilation
   -  ANSI Tests (IKVM, GCJ )
   -  Running CL-BENCH (Is SubLisp faster than Common Lisp?!)
   -  Optionally enable CL
   -  then into a Run-Mode
   
JUNIT Mode  (Started automatically from IDE)   
   - Ensures the system passes thru the Above modes and ready for Unit tests
   - For running JUnit Tests
   
SWI-Prolog Mode  (Ran as: swipl -l from_swipl.pl)
   -  Embeds CYC Inferencing into SWI-Prolog
   -  Boots thru as if in JUNIT Mode and then onto a Run-Mode
   
   
   
Run-mode [Optional] Loading

  - ASDF Enabled 
  - QuickLisp Enabled
  - Running SWANK/CUSP Server (port 4005 stuff)  like when Developing from Emacs, Atom, or Eclipse
  - Common Lisp REPL
  - SubL (CYC's Lisp) REPL
  - CYC SubLisp OO System loaded 
  - CYC Peer/Client/Server (Port 3601 stuff)
  - CYC Natural Language Modules
  - CYC Semantic Knowledge Sources (SKSI) Modules
  - CYC Inference System Modules (Tacticians)
  - KB Content in CycL Language (aka as MELD)
  - SUMO/KIF Support Tools and Content
  - Open Connectivity Knowledge Base (OCKB)  ( P2P Ontology Edit/ Rule Engine control, ya know, Port 7777 Stuff)
  - LarKC Urban Computing  (EU's Large Knowledge Collider)
       (Plugins designed by the world leading data scientists already configured with access to over 35 pentabytes of 10,000s of metadata resources all over the world including live NASA metadata 
          - yes all in one interface))
  - SPARQL Services (port 8020)
  - PENGINES SWI-Prolog Services (port 3020 stuff)
  - SubLisp Webserver (port 3602 stuff)
  - JSP Webserver (port 8080 stuff from)
  - SUBL-CORBA
  - KRAKEN/FET
  - Hosting PrologMUD thru JNI (Port 4000 stuff)
  - Connected to IRC Bot or not (Port 3334 stuff)
  - JDWP Debugging (port 5005 stuff)
  - Armedbear J IDE (Very awesome Lisp/Multilanguage IDE)
  - CLOS/SubLOOP as KL-ONE Language (Like BABYLON but better)
  - SHOP/STRIPs Planner
 
 
 --- Way more stuff to be listed ... 
  Equivalent to already to All of "KnowledgeWorks Enterprise" and every Allegro Add-on Product all put into the perfect ecosystem with already REst/web/ORBS/Corba .. you name it.. whatever enabled
  If there was just one more trivial middleware/serverware tool a team had to be assembed to create.. this system already has it read for you!
  ---
    
  
  
  
 
   
 

root@gitlab:/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform# rm -rf site-lisp/.slime/fasl
root@gitlab:/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform# rm -rf site-lisp/.cache/common-lisp/
root@gitlab:/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform# rm -rf .cache/common-lisp/
root@gitlab:/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform# rm -rf .slime/fasl
root@gitlab:/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform# rm -rf ./site-lisp/daydreamer/HIDE
root@gitlab:/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform# find -name "*.abcl"
root@gitlab:/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform# find -name "*.cls"
 
rm -rf ./site-lisp/quicklisp/cache/asdf-fasls
