
################################################################

		BLOCKP >


    MICRO-PLANNER CODE FOR THE "BLOCKS" MICRO-WORLD 
################################################################


(DEFPROP TA-AT
	 (THANTE (X Y) (#AT $?X $?Y) (THRPLACA (CDR (ATAB $?X)) $?Y))
	 THEOREM)

(DEFPROP TA-CONTAIN
	 (THANTE (X Y Z)
		 (#AT $?X ?)
		 (THGOAL (#MANIP $?X))
		 (THGOAL (#SUPPORT $?Y $?X))
		 (THOR (THAND (THGOAL (#IS $?Y #BOX)) (THVSETQ $_Z $?Y))
		       (THGOAL (#CONTAIN $?Z $?Y)))
		 (THASSERT (#CONTAIN $?Z $?X)))
	 THEOREM)

(DEFPROP TA-EXISTS (THANTE (X) (#EXISTS $?X) (THSUCCEED)) THEOREM)

(DEFPROP TA-SUPP
	 (THANTE (X Y Z)
		 (#AT $?X $?Y)
		 (THCOND ((THVSETQ $_Z (SUPPORT $?Y (SIZE $?X) $?X))
			  (THCOND ((THGOAL (#MANIP $?Z))
				   (THGOAL (#SHAPE $?Z #RECTANGULAR)))
				  ((THSUCCEED)))
			  (THASSERT (#SUPPORT $?Z $?X))
			  (THCOND ((THGOAL (#CLEARTOP $?Z))
				   (THERASE (#CLEARTOP $?Z)))
				  ((THSUCCEED)))
			  (THCOND (NOSTACKS)
				  ((THNOT (THGOAL (#MANIP $?Z))))
				  ((THAND (THGOAL (#PART $?Z $_Y))
					  (THGOAL (#IS $?Y #STACK)))
				   (THASSERT (#PART $?X $?Y)))
				  ((THVSETQ $_Y (MAKESYM (QUOTE STACK)))
				   (THASSERT (#PART $?X $?Y))
				   (THASSERT (#PART $?Z $?Y))
				   (THASSERT (#IS $?Y #STACK))
				   (THASSERT (#EXISTS $?Y) (THUSE TA-EXISTS)))))
			 ((THGOAL (#GRASPING $?X)))
			 ((ERT TA-SUPP))))
	 THEOREM)

(DEFPROP TC-2
	 (THCONSE (X Y YY)
		  ($?X $?Y)
		  (THGOAL (#CHOOSE $?Y $_YY $E (GET $?X (QUOTE CHOOSE)))
			  (THUSE TC-CHOOSE))
		  (THGOAL ($?X $?YY) (THTBF THTRUE)))
	 THEOREM)

(DEFPROP TC-3
	 (THCONSE (X Y Z YY ZZ)
		  ($?X $?Y $?Z)
		  (THGOAL (#CHOOSE $?Y $_YY $E (GET $?X (QUOTE CHOOSE)))
			  (THUSE TC-CHOOSE))
		  (THGOAL (#CHOOSE $?Z $_ZZ $E (GET $?X (QUOTE CHOOSE2)))
			  (THUSE TC-CHOOSE))
		  (THGOAL ($?X $?YY $?ZZ) (THTBF THTRUE)))
	 THEOREM)
(DEFPROP TC-ASMUCH
	 (THCONSE (MEASURE X Y)
		  (#ASMUCH MEASURE $?X $?Y)
		  (THVSETQ $_MEASURE (GET $?MEASURE (QUOTE MEASFN)))
		  (NOT (LESSP ($?MEASURE $?X) ($?MEASURE $?Y))))
	 THEOREM)

(DEFPROP TC-BELONG
	 (THCONSE (X Y)
		  (#BELONG $?X $?Y)
		  (THAMONG $?Y (QUOTE (:SHRDLU)))
		  (THGOAL (#PHYSOB $?X) (THUSE TC-PHYSOB)))
	 THEOREM)

(DEFPROP TC-CALL
	 (THCONSE (X Y Z)
		  (#CALL $?X $?Y)
		  (THCOND ((THGOAL (#CALL $_Z $?Y))
			   (PRINT $?Y)
			   (NOT (PRINT (QUOTE NAME-ALREADY-USED))))
			  ((THASSERT (#CALL $?X $?Y))
			   (THASSERT (#IS $?Y #NAME))
			   (#PROPDEFINE $?Y)
			   (OR DOIT (SETQ PLAN (CONS T PLAN))))))
	 THEOREM)
(DEFPROP TC-CHOOSE
 (THCONSE
  (X Y Z W)
  (#CHOOSE $?X $?Y $?Z)
  (THCOND
   ((AND (THASVAL $?X) (NOT (OSS? $?X))) (THSETQ $_Y $?X))
   ((THASVAL $?X)
    (OR (NULL DISCOURSE)
	(THPUTPROP (VARIABLE? $?X) $?X (QUOTE NG)))
    (THSETQ $_Y (FINDCHOOSE $?X $?Z NIL)))
   ((THGOAL (#MANIP $?Y)) (THNOT (THGOAL (#SUPPORT $?Y ?))))))
 THEOREM)

(DEFPROP TC-CHOOSEPLACE
	 (THCONSE (X) (#CHOOSEPLACE $?X) (ERT CHOOSEPLACE UNDEFINED))
	 THEOREM)

(DEFPROP TC-CLEARTOP
	 (THCONSE (X Y (WHY (EV)) EV)
		  (#CLEARTOP $?X)
		  (ATOM $?X)
		  (THOR (THGOAL (#SUPPORT $?X ?))
			(THAND (THASSERT (#CLEARTOP $?X)) (THSUCCEED THEOREM)))
		  (MEMORY)
		  GO
		  (THCOND ((THGOAL (#SUPPORT $?X $_Y))
			   (THGOAL (#GET-RID-OF $?Y)
				   (THNODB)
				   (THUSE TC-GET-RID-OF))
			   (THGO GO))
			  ((THASSERT (#CLEARTOP $?X))
			   (MEMOREND (#CLEARTOP $?EV $?X))
			   (THSUCCEED THEOREM))))
	 THEOREM)

(DEFPROP TC-EXISTS (THCONSE (X) (#EXISTS $?X) (THSUCCEED)) THEOREM)
(DEFPROP TC-FINDSPACE
	 (THCONSE (SURF SIZE OBJ SPACE)
		  (#FINDSPACE $?SURF $?SIZE $?OBJ $?SPACE)
		  (THOR (AND (NOT (MEMQ $?SURF (QUOTE (:BOX :TABLE))))
			     (NOT (GET (QUOTE #NOCLEAR) (QUOTE THASSERTION)))
			     (THSETQ $_SPACE (FINDSPACE (QUOTE CENTER)
							$?SURF
							$?SIZE
							$?OBJ)))
			(AND (OR (EQ $?SURF (QUOTE :BOX))
				 (AND (NOT (EQ $?SURF (QUOTE :TABLE)))
				      (GET (QUOTE #NOCLEAR)
					   (QUOTE THASSERTION))))
			     (THSETQ $_SPACE (FINDSPACE (QUOTE PACK)
							$?SURF
							$?SIZE
							$?OBJ)))
			(THSETQ $_SPACE (FINDSPACE (QUOTE RANDOM)
						   $?SURF
						   $?SIZE
						   $?OBJ))))
	 THEOREM)

(DEFPROP TC-GET-RID-OF
	 (THCONSE (X Y (WHY (EV)) EV)
		  (#GET-RID-OF $?X)
		  (OR NOMEM (THVSETQ $_EV $?WHY))
		  UP
		  (THCOND ((NULL $?X))
			  ((ATOM $?X)
			   (MEMORY)
			   (THGOAL (#FINDSPACE :TABLE $E (SIZE $?X) $?X $_Y)
				   (THUSE TC-FINDSPACE))
			   (THGOAL (#PUT $?X $?Y) (THNODB) (THUSE TC-PUT))
			   (MEMOREND (#GET-RID-OF $?EV $?X)))
			  ((THGOAL (#GET-RID-OF $E (CAR $?X))
				   (THUSE TC-GET-RID-OF))
			   (OR (THSETQ $_X (CDR $?X)) (THSUCCEED THEOREM))
			   (THGO UP))))
	 THEOREM)
(DEFPROP TC-GRASP
	 (THCONSE (X Y (WHY (EV)) EV)
		  (#GRASP $?X)
		  (THCOND ((THGOAL (#GRASPING $?X)) (THSUCCEED THEOREM))
			  ((ATOM $?X)))
		  (MEMORY)
		  (THGOAL (#CLEARTOP $?X) (THUSE TC-CLEARTOP))
		  (THCOND ((THGOAL (#GRASPING $_Y))
			   (THOR (THGOAL (#UNGRASP) (THNODB) (THUSE TC-UNGRASP))
				 (THGOAL (#GET-RID-OF $?Y)
					 (THNODB)
					 (THUSE TC-GET-RID-OF))))
			  ((THSUCCEED)))
		  (THSETQ $_Y (TOPCENTER $?X))
		  (THGOAL (#MOVEHAND2 $?Y) (THNODB) (THUSE TC-MOVEHAND2))
		  (THASSERT (#GRASPING $?X))
		  (MEMOREND (#GRASP $?EV $?X))
		  (OR NOMEM
		      (THSETQ GRASPLIST (CONS (LIST THTIME $?X) GRASPLIST)))
		  (THCOND (DOIT (THOR (GRASP $?X) (AND (UNGRASP) NIL)))
			  ((THSETQ PLAN (CONS (LIST (QUOTE GRASP)
						    (LIST (QUOTE QUOTE) $?X))
					      PLAN)))))
	 THEOREM)

(DEFPROP TC-LOC
	 (THCONSE (X Y Z LOC)
		  ($?LOC $?X $?Y $?Z)
		  (THOR (THGOAL (#MANIP $?Y)) (THGOAL (#IS $?Y #BOX)))
		  (THOR (THGOAL (#MANIP $?Z)) (THGOAL (#IS $?Z #BOX)))
		  (NOT (EQ $?Y $?Z))
		  (LOCGREATER $?Y $?Z ((LAMBDA (X) (COND ((EQ X (QUOTE #RIGHT))
							  (QUOTE CAR))
							 ((EQ X (QUOTE #BEHIND))
							  (QUOTE CADR))
							 ((EQ X (QUOTE #ABOVE))
							  (QUOTE CADDR))
							 ((ERT TC-LOC))))
				       $?X)))
	 THEOREM)

(DEFPROP TC-MAKESPACE
	 (THCONSE (SURF SIZE OBJ SPACE X (WHY (EV)) EV)
		  (#FINDSPACE $?SURF $?SIZE $?OBJ $?SPACE)
		  (THNOT (THGOAL (#IS $?SURF #BOX)))
		  (MEMORY)
		  TAG
		  (THAND (THGOAL (#SUPPORT $?SURF $_X))
			 (THGOAL (#GET-RID-OF $?X) (THUSE TC-GET-RID-OF)))
		  (THOR (THGOAL (#FINDSPACE $?SURF $?SIZE $?OBJ $?SPACE)
				(THUSE TC-FINDSPACE))
			(THGO TAG))
		  (MEMOREND (#MAKESPACE $?EV $?SURF)))
	 THEOREM)
(DEFPROP TC-MORE
	 (THCONSE (MEASURE X Y)
		  (#MORE $?MEASURE $?X $?Y)
		  (THVSETQ $_MEASURE (GET $?MEASURE (QUOTE MEASFN)))
		  (GREATERP ($?MEASURE $?X) ($?MEASURE $?Y)))
	 THEOREM)

(DEFPROP TC-MOVEHAND
 (THCONSE
  (X Y W Z)
  (#MOVEHAND $?Y)
  (THCOND
   ((EQUAL HANDAT $?Y) (THSUCCEED THEOREM))
   ((THGOAL (#GRASPING $?X))
    (THVSETQ $_Z
	     (PROG (X Y)
		   (SETQ X (ATAB $?X))
		   (AND (CLEAR (SETQ Y (DIFF $?Y
					     (TCENT (QUOTE (0 0 0)) (CADDR X))))
			       (LIST (CAADDR X)
				     (CADADR (CDR X))
				     (DIFFERENCE 1000 (CADDR Y)))
			       (CAR X))
			(RETURN Y))))
    (THGOAL (#AT $?X $_W))
    (THERASE (#AT $?X $?W) (THUSE TE-SUPP TE-CONTAIN))
    (THASSERT (#AT $?X $?Z) (THUSE TA-AT TA-SUPP TA-CONTAIN))
    (THGOAL (#MOVEHAND2 $?Y) (THNODB) (THUSE TC-MOVEHAND2))
    (OR
     NOMEM
     (THPUTPROP $?X
		(CONS (LIST THTIME
			    $?Z
			    (CADAR (OR (THVAL (QUOTE (THGOAL (#SUPPORT $?Y
								       $?X)))
					      (CONS (LIST (QUOTE Y)
							  (QUOTE THUNASSIGNED))
						    THALIST))
				       (QUOTE ((NIL :HAND)))))
			    NIL)
		      (GET $?X (QUOTE HISTORY)))
		(QUOTE HISTORY))))
   ((THGOAL (#MOVEHAND2 $?Y) (THNODB) (THUSE TC-MOVEHAND2)))))
 THEOREM)
(DEFPROP TC-MOVEHAND2
	 (THCONSE (Y LOC)
		  (#MOVEHAND2 $?Y)
		  (COND ((EQUAL $?Y HANDAT) (THSUCCEED THEOREM))
			((AND (LESSP 37 (CAR $?Y) 1141)
			      (LESSP -1 (CADR $?Y) 1141)
			      (LESSP -1 (CADDR $?Y) 1001))))
		  (THVSETQ $_LOC HANDAT)
		  (THSETQ HANDAT $?Y)
		  (THSETQ THTIME (ADD1 THTIME))
		  (THCOND (DOIT (THOR (EVAL (CONS (QUOTE MOVETO) HANDAT))
				      (PROG (ADJUST) (EVAL (CONS (QUOTE MOVETO)
								 $?LOC)))))
			  ((THSETQ PLAN
				   (CONS (CONS (QUOTE MOVETO) $?Y) PLAN)))))
	 THEOREM)

(DEFPROP TC-NAME
	 (THCONSE (X)
		  (#NAME $?X)
		  (THVSETQ $_X (LISTIFY $?X))
		  (THVSETQ $_X (THFIND ALL
				       $?Y
				       (Y Z)
				       (THAMONG $?Z $?X)
				       (THOR (THGOAL (#CALL $?Z $?Y))
					     (THSETQ $_Y $?Z))))
		  (MAPC (QUOTE PRINT) $?X))
	 THEOREM)

(DEFPROP TC-NOTICE
	 (THCONSE (X)
		  (#NOTICE $?X)
		  (COND (DOIT (BLINK $?X) (THSUCCEED))
			((THSETQ PLAN (CONS (LIST (QUOTE BLINK)
						  (LIST (QUOTE QUOTE) $?X))
					    PLAN)))))
	 THEOREM)

(DEFPROP TC-ON
	 (THCONSE (X Y Z) (#ON $?X $?Y) (THOR (THGOAL (#SUPPORT $?Y $?X))
					      (THAND (THASVAL $?X)
						     (THGOAL (#SUPPORT $_Z $?X))
						     (THGOAL (#ON $?Z $?Y)
							     (THUSE TC-ON)))))
	 THEOREM)
(DEFPROP TC-PACK
	 (THCONSE (OBJ SURF BLOCKS PYR X Y)
		  (#PACK $?OBJ $?SURF)
		  (OR (THVSETQ $_BLOCKS (PACKO $?OBJ (QUOTE #BLOCK))) T)
		  (OR (THVSETQ $_PYR (PACKO $?OBJ (QUOTE #PYRAMID))) T)
		  GO
		  (THCOND ((NULL $?BLOCKS)
			   (THCOND ((NULL $?PYR) (THSUCCEED THEOREM))
				   ((THVSETQ $_Y (FINDSPACE (QUOTE PACK)
							    $?SURF
							    (SIZE (CAR $?PYR))
							    (CAR $?PYR)))
				    (THGOAL (#PUT $E (CAR $?PYR) $?Y)
					    (THUSE TC-PUT))
				    (OR (THSETQ $?PYR (CDR $?PYR)) T)
				    (THGO GO))))
			  ((THSETQ $_X (CAR $?BLOCKS))
			   (THVSETQ $?Y (FINDSPACE (QUOTE PACK)
						   $?SURF
						   (SIZE $?X)
						   $?X))
			   (THGOAL (#PUT $?X $?Y) (THUSE TC-PUT))
			   (OR (THSETQ $?BLOCKS (CDR $?BLOCKS)) T)
			   (THCOND ((THVSETQ $_Y (OR (PACKON $?X $?PYR)
						     (PACKON $?X $?BLOCKS)))
				    (THGOAL (#PUTON $?Y $?X) (THUSE TC-PUTON))
				    (COND ((MEMQ $?Y $?PYR)
					   (THSETQ $_PYR
						   (DELQ $?Y
							 (APPEND $?PYR NIL))))
					  ((THSETQ $_BLOCKS
						   (DELQ $?Y (APPEND $?BLOCKS
								     NIL))))))
				   ((THSUCCEED)))
			   (THGO GO))))
	 THEOREM)

(DEFPROP TC-PART
	 (THCONSE (X Y Z)
		  (#PART $?X $?Y)
		  (THGOAL (#IS $?Y #STACK))
		  (THGOAL (#CHOOSE $?X $_Z (QUOTE (((THGOAL (#PART $?* $?Y))))))
			  (THUSE TC-CHOOSE))
		  (OR (NOT (ATOM $?Z)) (THSETQ $_Z (LIST $?Z)))
		  GO
		  (THCOND ((NULL $?Z) (THSUCCEED))
			  ((THGOAL (#PART $E (CAR $?Z) $?Y))
			   (OR (THSETQ $_Z (CDR $?Z)) T)
			   (THGO GO))
			  ((THFAIL))))
	 THCONSE)

(DEFPROP TC-PHYSOB
	 (THCONSE (X)
		  (#PHYSOB $?X)
		  (THOR (THGOAL (#MANIP $?X))
			(THAMONG $?X (QUOTE (:BOX :TABLE :HAND)))))
	 THEOREM)
(DEFPROP TC-PICKUP
	 (THCONSE (X (WHY (EV)) EV)
		  (#PICKUP $?X)
		  (MEMORY)
		  (THGOAL (#GRASP $?X) (THUSE TC-GRASP))
		  (THGOAL (#RAISEHAND) (THNODB) (THUSE TC-RAISEHAND))
		  (MEMOREND (#PICKUP $?EV $?X)))
	 THEOREM)

(DEFPROP TC-REFERS
(THCONSE(X)
(#REFERS $?X)
(EVAL(LIST 'THSETQ (LIST 'THV $?X)(LIST 'QUOTE (ATOMIFY (GET $?X 'BIND))))))
THEOREM)

(DEFPROP TC-PUT
	 (THCONSE (X Y Z)
		  (#PUT $?X $?Y)
		  (THCOND ((THASVAL $?Y)
			   (THCOND ((ATOM $?Y) (THGOAL (#CHOOSEPLACE $?Y)
						       (THUSE TC-CHOOSEPLACE)))
				   ((THSUCCEED))))
			  ((THGOAL (#GET-RID-OF $?X)
				   (THNODB)
				   (THUSE TC-GET-RID-OF))
			   (THSUCCEED THEOREM)))
		  (CLEAR $?Y (SIZE $?X) $?X)
		  (SUPPORT $?Y (SIZE $?X) $?X)
		  (THGOAL (#GRASP $?X) (THUSE TC-GRASP))
		  (THSETQ $_Z (TCENT $?Y (SIZE $?X)))
		  (THGOAL (#MOVEHAND $?Z) (THNODB) (THUSE TC-MOVEHAND))
		  (THGOAL (#UNGRASP) (THNODB) (THUSE TC-UNGRASP)))
	 THEOREM)

(DEFPROP TC-PUTIN
	 (THCONSE (X Y Z (WHY (EV)) EV)
		  (#PUTIN $?X $?Y)
		  (MEMORY)
		  (THCOND ((THGOAL (#PUTON $?X $?Y) (THUSE TC-PUTON))
			   (MEMOREND (#PUTIN $?EV $?X $?Y))
			   (THSUCCEED THEOREM))
			  ((THSUCCEED)))
		  (THGOAL (#IS $?Y #BOX))
		  (THVSETQ $_Z
			   (UNION (LISTIFY $?X)
				  (THVAL (QUOTE (THFIND ALL
							$?W
							(W)
							(THGOAL (#ON $?W $?Y))))
					 THALIST)))
		  (THGOAL (#CLEARTOP $?Y) (THUSE TC-CLEARTOP))
		  (THGOAL (#PACK $?Z $?Y) (THUSE TC-PACK))
		  (MEMOREND (#PUTIN $?EV $?X $?Y)))
	 THEOREM)
(DEFPROP TC-PUTON
	 (THCONSE (X Y Z (WHY (EV)) EV)
		  (#PUTON $?X $?Y)
		  (ATOM $?Y)
		  (OR (CDR $?X) (THSETQ $_X (CAR $?X)))
		  (NOT (COND ((ATOM $?X) (EQ $?X $?Y)) ((MEMQ $?Y $?X))))
		  (MEMORY)
		  (THCOND ((ATOM $?X)
			   (THGOAL (#CLEARTOP $?X) (THUSE TC-CLEARTOP))
			   (THOR (THGOAL (#FINDSPACE $?Y $E (SIZE $?X) $?X $_Z)
					 (THUSE TC-FINDSPACE))
				 (AND (NULL (GET (QUOTE #NOCLEAR)
						 (QUOTE THASSERTION)))
				      (THGOAL (#FINDSPACE $?Y
							  $E
							  (SIZE $?X)
							  $?X
							  $_Z)
					      (THUSE TC-MAKESPACE))))
			   (THGOAL (#PUT $?X $?Z) (THNODB) (THUSE TC-PUT)))
			  ((THASSERT (#NOCLEAR))
			   (THPROG ((W $?X))
				   UP
				   (THOR (THGOAL (#PUTON $E (CAR $?W) $?Y)
						 (THUSE TC-PUTON))
					 (THFAIL THPROG))
				   (THOR (THSETQ $?W (CDR $?W)) (THRETURN T))
				   (THGO UP))
			   (THERASE (#NOCLEAR)))
			  ((THNOT (THGOAL (#IS $?Y #BOX)))
			   (THGOAL (#CLEARTOP $?Y) (THUSE TC-CLEARTOP))
			   (THGOAL (#PACK $?X $?Y) (THUSE TC-PACK))))
		  (MEMOREND (#PUTON $?EV $?X $?Y)))
	 THEOREM)

(DEFPROP TC-RAISEHAND
	 (THCONSE ((WHY (EV)) EV)
		  (#RAISEHAND)
		  (MEMORY)
		  (THGOAL (#MOVEHAND $E (LIST (CAR HANDAT) (CADR HANDAT) 1000))
			  (THNODB)
			  (THUSE TC-MOVEHAND))
		  (MEMOREND (#RAISEHAND $?EV)))
	 THEOREM)
(DEFPROP TC-STACK
	 (THCONSE (X Y)
		  (#IS $?X #STACK)
		  (NOT (THASVAL $?X))
		  (THGOAL (#MANIP $?Y))
		  (THGOAL (#SUPPORT $?Y ?))
		  (THNOT (THAND (THGOAL (#PART $?Y $_X))
				(THGOAL (#IS $?X #STACK))))
		  GO
		  (THGOAL (#SUPPORT $_X $?Y))
		  (THCOND ((MEMQ $?X (QUOTE (:TABLE :BOX))))
			  ((THSETQ $_Y $?X) (THGO GO)))
		  (THSETQ $_X (MAKESYM (QUOTE STACK)))
		  (THASSERT (#IS $?X #STACK))
		  (THASSERT (#EXISTS $?X))
		  (THFIND ALL
			  $?Z
			  (Z)
			  (THGOAL (#ON $?Z $?Y) (THUSE TC-ON))
			  (THAND (THASSERT (#PART $?Z $?X))
				 (THFINALIZE THAND))))
	 THEOREM)
(DEFPROP TC-STACKUP
 (THCONSE
  (X Y BLOCKS PYR (WHY (EV)) EV)
  (#STACKUP $?X)
  (OR (LESSP (APPLY (QUOTE PLUS)
		    (MAPCAR (QUOTE (LAMBDA (X) (CADDR (SIZE X)))) $?X))
	     1201)
      (NOT (DPRINT2 (QUOTE TOO/ HIGH/,))))
  (THCOND
   ((AND $?X (CDR $?X)))
   ((THSETQ
     $_X
     (APPEND $?X
	     (THVAL (LIST (QUOTE THFIND)
			  (COND ((NULL $?X) 3) (2))
			  (QUOTE $?Y)
			  (QUOTE (Y))
			  (QUOTE (THOR (THAND (THGOAL (#IS $?Y #BLOCK))
					      (THNOT (THGOAL (#SUPPORT $?Y ?))))
				       (THGOAL (#IS $?Y #BLOCK))))
			  (QUOTE (NOT (EQ $?X $?Y))))
		    THALIST)))))
  (COND ((THVSETQ $_PYR (PACKO $?X (QUOTE #PYRAMID))) (NULL (CDR $?PYR))) (T))
  (THVSETQ $_BLOCKS (CONS (QUOTE :TABLE) (PACKO $?X (QUOTE #BLOCK))))
  (MEMORY)
  GO
  (THCOND ((CDR $?BLOCKS) (THGOAL (#PUTON $E (CADR $?BLOCKS) $E (CAR $?BLOCKS))
				  (THUSE TC-PUTON))
			  (THSETQ $_BLOCKS (CDR $?BLOCKS))
			  (THGO GO))
	  ($?PYR (THGOAL (#PUTON $E (CAR $?PYR) $E (CAR $?BLOCKS))
			 (THUSE TC-PUTON)))
	  ((MEMOREND (#STACKUP $?EV $?X)))))
 THEOREM)

(DEFPROP TC-STARTEND3
	 (THCONSE (X Y EV TIME) ($?X $?EV $?TIME) (THGOAL ($?X $?Y $?EV $?TIME)
							  (THUSE TC-STARTEND4)))
	 THEOREM)
(DEFPROP TC-STARTEND4
	 (THCONSE (X NEWEV Z EV TIME)
		  ($?X $?NEWEV $?EV $?TIME)
		  (OR (AND (THASVAL $?X)
			   (THASVAL $?EV)
			   (THASVAL $?TIME)
			   (NOT (THASVAL $?NEWEV)))
		      (ERT TC-STARTEND4))
		  (THGOAL (#CHOOSE $?EV $_Z NIL) (THUSE TC-CHOOSE))
		  (OR (ATOM $?Z) (ERT TC-STARTEND4 ATOM))
		  (THSETQ $_NEWEV (MAKESYM (QUOTE EV)))
		  (PUTPROP $?NEWEV
			   (PUTPROP $?NEWEV
				    (GET $?Z (COND ((EQ $?X (QUOTE #START))
						    (QUOTE START))
						   ((EQ $?X (QUOTE #END))
						    (QUOTE END))
						   ((ERT TC-STARTEND (THV X)))))
				    (QUOTE START))
			   (QUOTE END))
		  (TIMECHK $?NEWEV $?TIME)
		  (PUTPROP $?NEWEV $?Z (QUOTE WHY))
		  (PUTPROP $?NEWEV (QUOTE #START) (QUOTE TYPE)))
	 THEOREM)

(DEFPROP TC-UNGRASP
	 (THCONSE (X OBJ (WHO (EV)) EV)
		  (#UNGRASP)

		  (THCOND ((THGOAL (#GRASPING $?X))
(MEMORY)
			   (THGOAL (#SUPPORT ? $?X))
			   (THERASE (#GRASPING $?X))
			   (MEMOREND (#UNGRASP $?EV $?X))
			   (THSETQ THTIME (ADD1 THTIME))
			   (THCOND (DOIT (THOR (UNGRASP) (AND (GRASP $?X) NIL)))
				   ((THSETQ PLAN
					    (CONS (QUOTE (UNGRASP)) PLAN)))))
			  ((THSUCCEED))))
	 THEOREM)

(DEFPROP TC-WANT4
	 (THCONSE (X EV TIME Y)
		  (#WANT $?X $?EV $?TIME)
		  (THGOAL (#WANT $?Y $?X $?EV $?TIME) (THUSE TC-WANT5)))
	 THEOREM)
(DEFPROP TC-WANT5
	 (THCONSE (X NEWEV EV TIME Z)
		  (#WANT $?NEWEV $?X $?EV $?TIME)
		  (OR (AND (THASVAL $?X) (THASVAL $?EV) (THASVAL $?TIME))
		      (ERT TC-WANT5 THASVAL))
		  (EQ $?X (QUOTE :FRIEND))
		  (EQ (GET $?EV (QUOTE WHY)) (QUOTE COMMAND))
		  (THSETQ $_NEWEV (MAKESYM (QUOTE EV)))
		  (PUTPROP $?NEWEV
			   (PUTPROP $?NEWEV
				    (GET $?EV (QUOTE START))
				    (QUOTE START))
			   (QUOTE END))
		  (TIMECHK $?NEWEV $?TIME)
		  (PUTPROP $?NEWEV (QUOTE #TELL) (QUOTE TYPE))
		  (PUTPROP $?NEWEV (QUOTE ESP) (QUOTE WHY)))
	 THEOREM)

(DEFPROP TCT-EXISTS (THCONSE NIL (#EXISTS ? ?) (THSUCCEED)) THEOREM)

(DEFPROP TCT-PICKUP
	 (THCONSE (X EV TIME)
		  (#PICKUP $?X $?TIME)
		  (THOR (THAND (THGOAL (#PICKUP$?EV $?X)) (TIMECHK $?EV $?TIME))
			(THGOAL (#PICKUP $?EV $?X $?TIME) (THUSE TCTE-PICKUP))))
	 THEOREM)

(DEFPROP TCT-PUT
	 (THCONSE (X EV TIME Y)
		  (#PUT $?X $?Y $?TIME)
		  (THGOAL (#PUT $?EV $?X $?Y $?TIME) (THUSE TCTE-PUT)))
	 THEOREM)

(DEFPROP TCT-AT
	 (THCONSE (X Y Z TIME W)
		  (#AT $?Y $?Z $?TIME)
		  (THOR (THGOAL (#MANIP $?Y)) (THAND (THGOAL (#IS $?Y #BOX))
						     (THGOAL (#AT $?Y $?Z))
						     (THSUCCEED THEOREM)))
		  (THSETQ $_X(TFIND $?Y $?TIME))
(THOR(THSETQ $_W(CAR $?X))
(THAND(THAMONG $?W (CDR $?X))
(OR		  (NOT (LESSP (CAR $?W) (OR (START? $?TIME) -1)))
(THFAIL THAND))
))

		  (THSETQ $?Z (CADR $?W)))
	 THEOREM)

(DEFPROP TCT-LOC
	 (THCONSE (YY ZZ X Y Z TIME)
		  (#LOC $?X $?Y $?Z $?TIME)
		  (THGOAL (#AT $?Y $?YY $?TIME) (THUSE TCT-AT))
		  (THGOAL (#AT $?Z $?ZZ $?TIME) (THUSE TCT-AT))
		  (THGOAL (#TLOC $?X $?Y $?Z) (THUSE TC-LOC)))
	 THEOREM)
(DEFPROP TCT-SUPPORT
	 (THCONSE (X Y Z TIME)
		  (#SUPPORT $?X $?Y $?TIME)
		  (THOR (THGOAL (#MANIP $?Y)) (THGOAL (#IS $?Y #BOX)))
		  (THAMONG $?Z (TFIND $?Y $?TIME))
		  (NOT (LESSP (CAR $?Z) (OR (START? $?TIME) -1)))
		  (THAMONG $?X (LIST (CADDR $?Z))))
	 THEOREM)

(DEFPROP TCT-2
	 (THCONSE (X EV TIME) ($?X $?TIME) (THGOAL ($?X $?EV $?TIME)
						   (THUSE TCTE-3)))
	 THEOREM)

(DEFPROP TCT-3
	 (THCONSE (X Y EV TIME) ($?X $?Y $?TIME) (THGOAL ($?X $?EV $?Y $?TIME)
							 (THUSE TCTE-4)))
	 THEOREM)

(DEFPROP TCT-4
	 (THCONSE (X Y Z EV TIME)
		  ($?X $?Y $?Z $?TIME)
		  (THGOAL ($?X $?EV $?Y $?Z $?TIME) (THUSE TCTE-5)))
	 THEOREM)

(DEFPROP TCTE-PICKUP
	 (THCONSE (X EV EVENT TIME)
		  (#PICKUP $?EV $?X $?TIME)
		  (THOR (THAND (THGOAL (#PICKUP $?EV $?X))
			       (TIMECHK $?EV $?TIME)
			       (THSUCCEED THEOREM))
			(THSUCCEED))
		  (THAMONG $?EVENT EVENTLIST)
		  (MEMQ (GET $?EVENT (QUOTE TYPE)) (QUOTE (#PUTON #GET-RID-OF)))
		  (TIMECHK $?EVENT $?TIME)
		  (THOR (THGOAL (#PUTON $?EVENT $?X ?))
			(THGOAL (#GET-RID-OF $?EVENT $?X)))
		  (THVSETQ $_EV (MAKESYM (QUOTE E)))
		  (AND (PUTPROP $?EV
				(PUTPROP $?EV
					 (GET $?EVENT (QUOTE END))
					 (QUOTE START))
				(QUOTE END))
		       (PUTPROP $?EV (QUOTE #PICKUP) (QUOTE TYPE))
		       (PUTPROP $?EV $?EVENT (QUOTE WHY))
		       (SETQ EVENTLIST (CONS $?EV EVENTLIST))
		       (THASSERT (#PICKUP $?EV $?X))))
	 THEOREM)
(DEFPROP TCTE-PUT
	 (THCONSE (X Y EV EVENT TIME Z)
		  (#PUT $?EV $?X $?Y $?TIME)
		  (THAMONG $?EVENT EVENTLIST)
		  (MEMQ (GET $?EVENT (QUOTE TYPE)) (QUOTE (#PICKUP #PUTON)))
		  (TIMECHK $?EVENT $?TIME)
		  (THOR (THGOAL (#PUTON $?EVENT $?X ?))
			(THGOAL (#PICKUP $?EVENT $?X)))
		  (OR (THVSETQ $_Z (SUB1 (ASSQ (GET $?EVENT (QUOTE END))
					       (GET $?X (QUOTE HISTORY)))))
		      (ERT TCTE-PUT WRONG))
		  (THAMONG $?Y (LIST (CADR $?Z)))
		  (THSETQ $_EV (MAKESYM (QUOTE E)))
		  (AND (PUTPROP $?EV
				(PUTPROP $?EV (CAR $?Z) (QUOTE START))
				(QUOTE END))
		       (PUTPROP $?EV $?EVENT (QUOTE WHY))
		       (PUTPROP $?EV (QUOTE #PUT) (QUOTE TYPE))
		       (SETQ EVENTLIST (CONS $?EV EVENTLIST))
		       (THASSERT (#PUT $?EV $?X $?Y))))
	 THEOREM)

(DEFPROP TCTE-3
	 (THCONSE (X EV TIME)
		  ($?X $?EV $?TIME)
		  (OR (THASVAL TIME) (ERT TCTE-3))
		  (THGOAL ($?X $?EV))
		  (TIMECHK $?EV $?TIME))
	 THEOREM)

(DEFPROP TCTE-4
	 (THCONSE (X Y EV TIME)
		  ($?X $?EV $?Y $?TIME)
		  (OR (THASVAL $?TIME) (ERT TCTE-4))
		  (THGOAL ($?X $?EV $?Y))
		  (TIMECHK $?EV $?TIME))
	 THEOREM)

(DEFPROP TCTE-5
	 (THCONSE (X Y Z EV TIME)
		  ($?X $?EV $?Y $?Z $?TIME)
		  (OR (THASVAL $?TIME) (ERT TCT-5))
		  (THGOAL ($?X $?EV $?Y $?Z))
		  (TIMECHK $?EV $?TIME))
	 THEOREM)

(DEFPROP TCT-GRASP
	 (THCONSE (X Z TIME)
		  (#GRASP $?X $?TIME)
		  (THVSETQ $_Z (ENDTIME GRASPLIST $?TIME))
		  UP
		  (THCOND ((OR (NULL $?Z) (STARTIME $?Z $?TIME)) (THFAIL))
			  ((OR (AND (NOT (THASVAL $?X))
				    (THSETQ $_X (CADAR $?Z)))
			       (EQ $?X (CADAR $?Z))))
			  ((THSETQ $_Z (CDR $?Z)) (THGO UP))
			  ((THFAIL))))
	 THEOREM)
(DEFPROP TE-CONTAIN
	 (THERASING (X Y)
		    (#AT $?X ?)
		    (THGOAL (#CONTAIN $_Y $?X))
		    (THERASE (#CONTAIN $?Y $?X)))
	 THEOREM)

(DEFPROP TE-EXISTS (THERASING (X) (#EXISTS $?X) (THSUCCEED)) THEOREM)

(DEFPROP TE-SUPP
	 (THERASING (X Y Z)
		    (#AT $?X ?)
		    (THCOND ((THGOAL (#SUPPORT $?X $_Y)) (ERT TE-SUPP))
			    ((THGOAL (#SUPPORT $_Y $?X))
			     (THERASE (#SUPPORT $?Y $?X))
			     (THCOND ((THGOAL (#PART $?X $_Y))
				      (THERASE (#PART $?X $?Y))
				      (THCOND ((THFIND 2
						       $?W
						       (W)
						       (THGOAL (#PART $?W $?Y)))
					       (THSUCCEED THEOREM))
					      ((THGOAL (#PART $_Z $?Y))
					       (THERASE (#PART $?Z $?Y)))
					      ((THSUCCEED)))
				      (THERASE (#EXISTS $?Y) (THUSE TE-EXISTS)))
				     ((THSUCCEED))))))
	 THEOREM)

(DEFUN TOPCENTER (X) ((LAMBDA (X) (TCENT (CADR X) (CADDR X))) (ATAB X)))

(SETQ DOIT NIL)

(SETQ NOSTACKS T)

(DEFUN SASSQ (X Y Z) (OR (ASSQ X Y) (APPLY Z NIL)))

(DEFPROP #CLEARTOP (((THGOAL (#SUPPORT $?* ?)))) CHOOSE)

(DEFPROP #GRASP
	 (((THNOT (THGOAL (#GRASPING $?*))) (THGOAL (#CLEARTOP $?*)))
	  ((THNOT (THGOAL (#GRASPING $?*)))))
	 CHOOSE)

(DEFPROP #PICKUP
	 (((THGOAL (#SUPPORT ? $?*)) (THGOAL (#CLEARTOP $?*)))
	  ((THGOAL (#SUPPORT ? $?*))))
	 CHOOSE)

(DEFPROP #PUTIN
	 (((THNOT (THGOAL (#CONTAIN :BOX $?*))) (THGOAL (#CLEARTOP $?*)))
	  ((THNOT (THGOAL (#CONTAIN :BOX $?*)))))
	 CHOOSE)

(DEFPROP #PUTIN (((THGOAL (#IS $?* #BOX)))) CHOOSE2)

(DEFPROP #PUTON (((THGOAL (#CLEARTOP $?*)))) CHOOSE)
(DEFPROP #PUTON
	 (((THGOAL (#CLEARTOP $?*)) (THNOT (THGOAL (#IS $?* #PYRAMID))))
	  ((THNOT (THGOAL (#IS $?* #PYRAMID)))))
	 CHOOSE2)

(DEFPROP #STACKUP
	 (((THGOAL (#CLEARTOP $?*)) (THNOT (THGOAL (#IS $?* #PYRAMID))))
	  ((THNOT (THGOAL (#IS $?* #PYRAMID)))))
	 CHOOSE)

(THDATA)

(TC-CALL)

(TC-CLEARTOP)

(TC-GET-RID-OF)

(TC-GRASP)

(TC-NAME)

(TC-NOTICE)

(TC-PACK)

(TC-PICKUP)

(TC-PUTIN)

(TC-PUTON)

(TC-RAISEHAND)

(TC-STACKUP)

(TC-UNGRASP)

(TC-ON)

(TC-PHYSOB)

NIL

(DEFUN UNION (A B) (PROG NIL
		    UP	 (COND ((NULL A) (RETURN B))
			       ((MEMQ (CAR A) B))
			       ((SETQ B (CONS (CAR A) B))))
			 (SETQ A (CDR A))
			 (GO UP)))

(IOC V)
(QUOTE (COMMANDS ARE:
		 #CLEARTOP
		 #GET-RID-OF
		 #GRASP
		 #PACK
		 #PICKUP
		 #PUTIN
		 #PUTON
		 #RAISEHAND
		 #STACKUP
		 #UNGRASP))

(QUOTE (PREDICATES ARE: #LOC #SUPPORT #ON #PHYSOB))
