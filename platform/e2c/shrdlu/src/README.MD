## Original README

~~~text
********************************************************************************
*       
*       This describes the files maintained on the directory SHRDLU which
*          go into making up the Natural Language Understanding system designed
*          by Terry Winograd (currently at Stanford University)
*
*       The files are ordered alphabeticly within the directory, but are
*          described here in related groups, and are listed by the printing
*          routine in similar groups
*
********************************************************************************



-- Files which support the BLOCKS micro-world


  BLOCKP >  Microplanner code for essentially all the functions of the
             BLOCKS world. - there are some supplementary materials at the
             end of the dictionary and data files

  BLOCKL >  LISP code to support the microplanner code of BLOCKS. In particular
             this includes the routine for finding space on an object and
             for maintaining the history list.

  DATA >    The initial contents (assertions) of the BLOCKS world's
             microplanner data base. Plus a few addittional function calls
             for initializing all other aspects of the micro-world.

  PLNR 180  This is a complete EXPR code version of MICROPLANNER. Calls to
             MICROPLANNER in SHRDLU are always done by calling the function
             THVAL2, contained in the semantics files, rather than the usual
             call to THVAL. PLNR 180 can be loaded independantly and run 
             as a toplevel MICROPLANNER if desired. A compiled version of
             the files is availlable as PLNR FASL on SHRDLU, and TS PLNR on
             SYS should point to a core dump of a toplevel MICROPLANNER

  THTRAC 18 This is a file of tracing routines designed for tracing opperations
             during the evaluation of MICROPLANNER code





--  Toplevel files for the language understanding system --


  SYSCOM >  Contains the toplevel function SHRDLU as well as usefull extentions
             to LISP, special printing functions, break functions, garbage
             collection functions etc.

  MORPHO >  Does all the morphological analysis required in the system via
             the function ETAOIN which is also the function called by SHRDLU
             to read in a user's sentence from the console.

  SHOW >    This is the "Show - Tell" user package developed for use at a
             workshop at CMU in 1972. It provides a convenient way for a 
             largely naieve user to interogate and change the data structures
             used in the system. Consult the MANUAL CMU for further details

  SETUP >   A loose ends file for setting global variables, initializing
             trace routines, and setting up the initial environment. It is
             intended to be the final file read into the system before 
             making a core dump.  



--  Files concerned with syntax


  PROGMR >  This file contains all the functions that comprise the programmar
             language fro writing grammars. It expects to be entered from a
             toplevel call to PARSE as done in SHRDLU, and executes grammar
             programs via an intermediary function, APPLY-GRAMMAR, to permit
             differing opperations in the cases of compiled and intrepreted
             code.

  GINTER >  "Grammar Interpreter" - Contains the calling sequence for use when
             running an uncompiled grammar. A precompiling pass is necessary
             on grammar functions to remove extra levels of function calls
             and to incorporate the calling program used in GINTER to eliminate
             GOTO's out of scope.

  GRAMAR >  The entire syntactic recognition grammar for the system. See
             A.I. MEMO 282 "Grammar for the People" for comprehensive flowcharts
             of the functions in this file.

  DICTIO >  Specifications and entrys for all of SHRDLU's vocabulary and 
             related atomic symbols. This file contains all aspects of their
             definitions: syntax, semantics, macro-expanders, etc.



-- Semantics files --


  SMSPEC >  "Semantic Specialists"  This contains all the functions which know
             how to interpret the syntactic forms that will be found by the
             grammar: noun groups, relative clauses, pronouns, etc.. All calls
             to these functions come from the syntactic routines through the 
             function SMCALL which is in PROGMR.

  SMUTIL >  Utility routines used by all the semantic functions for building
             nodes, evaluating definitions, marker checks, backreference maintanence,
             quantifier adjusting, building MIRCOPLANNER code.

  SMASS >   Access functions that are used by the two previous files to grovel
             through their data structures while retaining their perspicuity.



-- Answering --

  NEWANS >  "new answer" Code for finding the answers to questions, absorbing
             new information, and following commands, then fromulating the
             appropriate English answers. This code is extensively interfaced
             with MICROPLANNER.




-- Documentation --

  MANUAL CMU, MANNEW >, HELP DOC, MINIH DOC

            These files are unfortunately all the documentation availlable on the
             care and feeding of the system appart from Winograd's book (which is
             far and away the best reference to the details of its opperation).
             MANUAL CMU, as its name implys, was developed for the workshop at
             CMU and it the most through overall guide. HELP DOC and MINIH DOC  
             are essentially excerpts from it which were intended as online references.
             MANNEW is grossly incomplete, but it is also the most up to date, and
             covers initial ussage of hte system.


  .INDEX >  This is a through cross-reference for all the LISP code used in the system.
             It lists functions and variables alphabeticly with listings of their
             interactions with the rest of the code (functions called, variables
             bound ...). Also of interest is the file LISP >, which alphabeticly lists
             all MACLISP functions ever invoked in the code and the functions that they
             were invoked from.



-- At the end of the directory, the files whose first names are "Z" are the origninal
    files of the system circa January 1971. They use the old list oriented data
    structures and are essentially uncommented. However they can often be of use
    when trying to see if alternate formulations of some algorithm were ever
    considered.

~~~


## RAN IN LARKC_CL 
~~~text
root@gitlab:/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform/e2c/shrdlu/src# ../../../abclc --lisp --load loader.lisp


BASEDIR=/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform
LCD=/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform/e2c/shrdlu/src
JARPREFIX=/tmp/lib-larkc-root
ln: failed to create symbolic link '/tmp/lib-larkc-root/lib': Operation not supported
LD_LIBRARY_PATH=/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/amd64/server:/usr/lib/jvm/java-8-openjdk-amd64/lib:/usr/lib/swi-prolog/lib/x86_64-linux:/usr/lib/guile/2.2/extensions:.
JAVA_HOME=/usr/lib/jvm/java-8-openjdk-amd64
LD_PRELOAD=/usr/lib/swi-prolog/lib/x86_64-linux/libswipl.so
LARKC_HOME=/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform
SWI_HOME=/usr/lib/swi-prolog
while sleep 1; do ./run-cyc-java.sh; done
true ; while [ 0 -ne 4 ]; do sleep 1 ; ./From_Prolog.sh ; done
JAVA_OPTS=
;
;;; toplevel:  /mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform/set_classpath.sh --lisp --load loader.lisp
;
;;; Running: java -cp $CLASSPATH -server -d64 -Xms5000m -Xmx8000m -XX:ReservedCodeCacheSize=96m  -XX:+DoEscapeAnalysis -XX:+UseCompressedOops -XX:+UseConcMarkSweepGC  -Dfile.lcd="/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform/e2c/shrdlu/src" -Dplatform.dir="/mnt/gggg/opt/CYC_JRTL_with_CommonLisp/platform" -Dlisp.jargv="--lisp--loadloader.lisp" -Dswi.home="/usr/lib/swi-prolog" -Djava.library.path=/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/amd64/server:/usr/lib/jvm/java-8-openjdk-amd64/lib:/usr/lib/swi-prolog/lib/x86_64-linux:/usr/lib/guile/2.2/extensions:.:.  -XshowSettings:vm  org.armedbear.lisp.Main --lisp --load loader.lisp

VM settings:
    Min. Heap Size: 4.88G
    Max. Heap Size: 7.81G
    Ergonomics Machine Class: server
    Using VM: OpenJDK 64-Bit Server VM

DEBUG: First SUBLFILE
Armed Bear Common Lisp 1.5.0-uabcl-dev (built Thu Apr 25 2019 10:17:52 PDT)
Java 1.8.0_191 Oracle Corporation
OpenJDK 64-Bit Server VM
Low-level initialization completed in 4.003 seconds.
Startup completed in 15.057 seconds.

"Done 0"
"Done"
NIL

SHRDLU version UMR-1.0
Loaded 5/6/2019 in Armed Bear Common Lisp 1.5.0-uabcl-dev



READY1
Pick up a big red block.
~MOVING HAND TO (100 340 500)~
~GRASPING BLOCK B7~
~MOVING HAND TO (150 900 200)~
~LETTING GO~
~MOVING HAND TO (100 450 300)~
~GRASPING BLOCK B6~
~MOVING HAND TO (100 450 1000)~
OK .


READY1
Grasp the pyramid.
I DON'T KNOW WHICH PYRAMID YOU MEAN.

READY1
Find a block which is taller than the one you are holding and put it into the box.
~CHOOSING BLOCK B10~
OK .


READY1
What does the box contain?
THE BLUE PYRAMID .


READY1
What is the pyramid supported by?
THE BOX .


READY1
How many blocks are not in the box?
FIVE OF THEM .
~~~             



## Wikipedia sez
             
~~~text
Person: Pick up a big red block.
Computer: OK.
Person: Grasp the pyramid.
Computer: I DON'T UNDERSTAND WHICH PYRAMID YOU MEAN.
Person (changing their mind): Find a block which is taller than the one you are holding and put it into the box.
Computer: BY "IT", I ASSUME YOU MEAN THE BLOCK WHICH IS TALLER THAN THE ONE I AM HOLDING.
Computer: OK.
Person: What does the box contain?
Computer: THE BLUE PYRAMID AND THE BLUE BLOCK.
Person: What is the pyramid supported by?
Computer: THE BOX.
Person: How many blocks are not in the box?
Computer: FOUR OF THEM.
Person: Is at least one of them narrower than the one which i told you to pick up?
Computer: YES, THE RED CUBE.
Person: Is it supported?
Computer: YES, BY THE TABLE.
Person: Can the table pick up blocks?
Computer: NO.
Person: Can a pyramid be supported by a block?
Computer: YES.
Person: Can a pyramid support a pyramid?
Computer: I DON'T KNOW.
Person: Stack up two pyramids.
Computer: I CAN'T.
Person: Will you please stack up both of the red blocks and either a green cube or a pyramid?
Computer: OK.
Person: Which cube is sitting on the table?
Computer: THE LARGE GREEN ONE WHICH SUPPORTS THE RED PYRAMID.
Person: Is there a large block behind a pyramid?
Computer: YES, THREE OF THEM: A LARGE RED ONE, A LARGE GREEN CUBE, AND THE BLUE ONE.
Person: Put a small one onto the green cube which supports a pyramid.
Computer: OK.
Person: Put the littlest pyramid on top of it.
Computer: OK.
Person: Does the shortest thing the tallest pyramid's support supports support anything green?
Computer: YES, THE GREEN PYRAMID.
Person: What color is it?
Computer: BY "IT", I ASSUME YOU MEAN THE SHORTEST THING THE TALLEST PYRAMID'S SUPPORT SUPPORTS.
Computer: RED
Person: How many things are on top of green cubes?
Computer: I'M NOT SURE WHAT YOU MEAN BY "ON TOP OF "IN THE PHRASE "ON TOP OF GREEN CUBES " .
DO YOU MEAN:
1 - DIRECTLY ON THE SURFACE
2 - ANWHERE ON TOP OF ?
Person: 2
Computer: THREE OF THEM.
Person: Had you touched any pyramid before you put the green one on the little cube?
Computer: YES, THE GREEN ONE.
Person: When did you pick it up?
Computer: WHILE I WAS STACKING UP THE RED CUBE, A LARGE RED BLOCK AND A LARGE GREEN CUBE.
Person: Why?
Computer: TO GET RID OF IT.
Person: Why did you do that?
Computer: TO CLEAN OFF THE RED CUBE.
Person: Why did you clear off that cube?
Computer: TO PUT IT ON A LARGE GREEN CUBE.
Person: Why did you do that?
Computer: TO STACK UP THE RED CUBE , A LARGE RED BLOCK AND A LARGE GREEN CUBE.
Person: Why did you do that?
Computer: BECAUSE YOU ASKED ME TO.
Person: How did you do it?
Computer: BY PUTTING A LARGE RED BLOCK ON THE TABLE ; THEN LETTING GO OF IT ; THEN PUTTING A LARGE GREEN CUBE ON IT ; THEN LETTING GO OF THAT CUBE ; THEN PUTTING THE RED CUBE ON THAT CUBE; THEN LETTING GO OF THAT CUBE.
Person: How many objects did you touch while you were doing it?
Computer: FOUR OF THEM.
Person: What did the red cube support before you started to clean it off?
Computer: THE GREEN PYRAMID.
Person: There were five blocks to the left of the box then.
Computer: NO, ONLY FOUR OF THEM: THE RED CUBE, TWO LARGE GREEN CUBES AND A LARGE RED BLOCK.
Person: Put the blue pyramid on the block in the box.
Computer: OK.
Person: Is there anything which is bigger than every pyramid but is not as wide as the thing that supports it?
Computer: YES, THE BLUE BLOCK.
Person: Does a steeple
Computer (interrupting): SORRY, I DON'T KNOW THE WORD "STEEPLE".
Person: A "steeple" is a stack which contains two green cubes and a pyramid.
Computer: I UNDERSTAND.
Person: Are there any steeples now?
Computer: NO.
Person: Build one.
Computer: OK.
Person: Call the biggest block "superblock".
Computer: OK.
Person: Have you picked superblock up since we began?
Computer: YES.
Person: Why did you drop it?
Computer: BY "IT", I ASSUME YOU MEAN THE SUPERBLOCK.
I CAN'T EXPLAIN A NON-EXISTENT EVENT.
Person: Is there anything to the right of the red pyramid?
Computer: YES, FOUR THINGS: THE BOX , THE RED CUBE, THE BLUE PYRAMID AND THE BLOCK NAMED SUPERBLOCK
Person: Thank you.
Computer: YOU'RE WELCOME!
~~~
