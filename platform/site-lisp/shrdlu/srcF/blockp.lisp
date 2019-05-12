
;################################################################
;
;		BLOCKP >
;
;
;    MICRO-PLANNER CODE FOR THE "BLOCKS" MICRO-WORLD
;################################################################


(DEFS TA-AT THEOREM
   (THANTE (X Y) (\#AT (THV X) (THV Y)) (THRPLACA (CDR (ATAB (THV X))) (THV Y))))

(DEFS TA-CONTAIN THEOREM
   (THANTE (X Y Z)
		 (\#AT (THV X) ?)
		 (THGOAL (\#MANIP (THV X)))
		 (THGOAL (\#SUPPORT (THV Y) (THV X)))
		 (THOR (THAND (THGOAL (\#IS (THV Y) \#BOX)) (THVSETQ (THNV Z) (THV Y)))
		       (THGOAL (\#CONTAIN (THV Z) (THV Y))))
		 (THASSERT (\#CONTAIN (THV Z) (THV X)))))

(DEFS TA-EXISTS THEOREM
   (THANTE (X) (\#EXISTS (THV X)) (THSUCCEED)))

(DEFS TA-SUPP THEOREM
   (THANTE (X Y Z)
		 (\#AT (THV X) (THV Y))
		 (THCOND ((THVSETQ (THNV Z) (SUPPORT (THV Y) (SIZE (THV X)) (THV X)))
			  (THCOND ((THGOAL (\#MANIP (THV Z)))
				   (THGOAL (\#SHAPE (THV Z) \#RECTANGULAR)))
				  ((THSUCCEED)))
			  (THASSERT (\#SUPPORT (THV Z) (THV X)))
			  (THCOND ((THGOAL (\#CLEARTOP (THV Z)))
				   (THERASE (\#CLEARTOP (THV Z))))
				  ((THSUCCEED)))
			  (THCOND (NOSTACKS)
				  ((THNOT (THGOAL (\#MANIP (THV Z)))))
				  ((THAND (THGOAL (\#PART (THV Z) (THNV Y)))
					  (THGOAL (\#IS (THV Y) \#STACK)))
				   (THASSERT (\#PART (THV X) (THV Y))))
				  ((THVSETQ (THNV Y) (MAKESYM 'STACK))
				   (THASSERT (\#PART (THV X) (THV Y)))
				   (THASSERT (\#PART (THV Z) (THV Y)))
				   (THASSERT (\#IS (THV Y) \#STACK))
				   (THASSERT (\#EXISTS (THV Y)) (THUSE TA-EXISTS)))))
			 ((THGOAL (\#GRASPING (THV X))))
			 ((ERT TA-SUPP)))))

(DEFS TC-2 THEOREM
   (THCONSE (X Y YY)
		  ((THV X) (THV Y))
		  (THGOAL (\#CHOOSE (THV Y) (THNV YY) (THEV (THGET (THV X) 'CHOOSE)))
			  (THUSE TC-CHOOSE))
		  (THGOAL ((THV X) (THV YY)) (THTBF THTRUE))))

(DEFS TC-3 THEOREM
   (THCONSE (X Y Z YY ZZ)
		  ((THV X) (THV Y) (THV Z))
		  (THGOAL (\#CHOOSE (THV Y) (THNV YY) (THEV (THGET (THV X) 'CHOOSE)))
			  (THUSE TC-CHOOSE))
		  (THGOAL (\#CHOOSE (THV Z) (THNV ZZ) (THEV (THGET (THV X) 'CHOOSE2)))
			  (THUSE TC-CHOOSE))
		  (THGOAL ((THV X) (THV YY) (THV ZZ)) (THTBF THTRUE))))

(DEFS TC-ASMUCH THEOREM
   (THCONSE (MEASURE X Y)
		  (\#ASMUCH MEASURE (THV X) (THV Y))
		  (THVSETQ (THNV MEASURE) (THGET (THV MEASURE) 'MEASFN))
		  (NOT (<
                        (FUNCALL (EVAL (THV MEASURE)) (THV X))
                        (FUNCALL (EVAL (THV MEASURE)) (THV Y))))))

(DEFS TC-BELONG THEOREM
   (THCONSE (X Y)
		  (\#BELONG (THV X) (THV Y))
		  (THAMONG (THV Y) '(:SHRDLU))
		  (THGOAL (\#PHYSOB (THV X)) (THUSE TC-PHYSOB))))

(DEFS TC-CALL THEOREM
   (THCONSE (X Y Z)
		  (\#CALL (THV X) (THV Y))
		  (THCOND ((THGOAL (\#NAME (THNV Z) (THV Y)))
			   (PRINT (THV Y))
			   (NOT (PRINT 'NAME-ALREADY-USED)))
			  ((THASSERT (\#NAME (THV X) (THV Y)))
			   (THASSERT (\#IS (THV Y) \#NAME))
			   (\#PROPDEFINE (THV Y))
			   (OR DOIT (SETQ PLAN (CONS T PLAN)))))))

(DEFS TC-CHOOSE THEOREM
   (THCONSE
  (X Y Z W)
  (\#CHOOSE (THV X) (THV Y) (THV Z))
  (THCOND
   ((AND (THASVAL (THV X)) (NOT (OSS? (THV X)))) (THSETQ (THNV Y) (THV X)))
   ((THASVAL (THV X))
    (OR (NULL DISCOURSE)
	(THPUTPROP (VARIABLE? (THV X)) (THV X) 'NG))
    (THSETQ (THNV Y) (FINDCHOOSE (THV X) (THV Z) NIL)))
   ((THGOAL (\#MANIP (THV Y))) (THNOT (THGOAL (\#SUPPORT (THV Y) ?)))))))

(DEFS TC-CHOOSEPLACE THEOREM
   (THCONSE (X) (\#CHOOSEPLACE (THV X)) (ERT CHOOSEPLACE UNDEFINED)))

(DEFS TC-CLEARTOP THEOREM
   (THCONSE (X Y (WHY (EV)) EV)
		  (\#CLEARTOP (THV X))
		  (ATOM (THV X))
		  (THOR (THGOAL (\#SUPPORT (THV X) ?))
			(THAND (THASSERT (\#CLEARTOP (THV X))) (THSUCCEED THEOREM)))
		  (MEMORY)
		  GO
		  (THCOND ((THGOAL (\#SUPPORT (THV X) (THNV Y)))
			   (THGOAL (\#GET-RID-OF (THV Y))
				   (THNODB)
				   (THUSE TC-GET-RID-OF))
			   (THGO GO))
			  ((THASSERT (\#CLEARTOP (THV X)))
			   (MEMOREND (\#CLEARTOP (THV EV) (THV X)))
			   (THSUCCEED THEOREM)))))

(DEFS TC-EXISTS THEOREM
   (THCONSE (X) (\#EXISTS (THV X)) (THSUCCEED)))

(DEFS TC-FINDSPACE THEOREM
   (THCONSE (SURF SIZE OBJ SPACE)
		  (\#FINDSPACE (THV SURF) (THV SIZE) (THV OBJ) (THV SPACE))
		  (THOR (AND (NOT (MEMQ (THV SURF) '(:BOX :TABLE)))
			     (NOT (THGET '\#NOCLEAR 'THASSERTION))
			     (THSETQ (THNV SPACE) (FINDSPACE 'CENTER
							(THV SURF)
							(THV SIZE)
							(THV OBJ))))
			(AND (OR (EQ (THV SURF) ':BOX)
				 (AND (NOT (EQ (THV SURF) ':TABLE))
				      (THGET '\#NOCLEAR
					   'THASSERTION)))
			     (THSETQ (THNV SPACE) (FINDSPACE 'PACK
							(THV SURF)
							(THV SIZE)
							(THV OBJ))))
			(THSETQ (THNV SPACE) (FINDSPACE 'RANDOM
						   (THV SURF)
						   (THV SIZE)
						   (THV OBJ))))))

(DEFS TC-GET-RID-OF
     THEOREM
	 (THCONSE (X Y (WHY (EV)) EV)
		  (\#GET-RID-OF (THV X))
		  (OR NOMEM (THVSETQ (THNV EV) (THV WHY)))
		  UP
		  (THCOND ((NULL (THV X)))
			  ((ATOM (THV X))
			   (MEMORY)
			   (THGOAL (\#FINDSPACE :TABLE (THEV (SIZE (THV X))) (THV X) (THNV Y))
				   (THUSE TC-FINDSPACE))
			   (THGOAL (\#PUT (THV X) (THV Y)) (THNODB) (THUSE TC-PUT))
			   (MEMOREND (\#GET-RID-OF (THV EV) (THV X))))
			  ((THGOAL (\#GET-RID-OF (THEV (CAR (THV X))))
				   (THUSE TC-GET-RID-OF))
			   (OR (THSETQ (THNV X) (CDR (THV X))) (THSUCCEED THEOREM))
			   (THGO UP)))))

(DEFS TC-GRASP THEOREM
   (THCONSE (X Y (WHY (EV)) EV)
		  (\#GRASP (THV X))
		  (THCOND ((THGOAL (\#GRASPING (THV X))) (THSUCCEED THEOREM))
			  ((ATOM (THV X))))
		  (MEMORY)
		  (THGOAL (\#CLEARTOP (THV X)) (THUSE TC-CLEARTOP))
		  (THCOND ((THGOAL (\#GRASPING (THNV Y)))
			   (THOR (THGOAL (\#UNGRASP) (THNODB) (THUSE TC-UNGRASP))
				 (THGOAL (\#GET-RID-OF (THV Y))
					 (THNODB)
					 (THUSE TC-GET-RID-OF))))
			  ((THSUCCEED)))
		  (THSETQ (THNV Y) (TOPCENTER (THV X)))
		  (THGOAL (\#MOVEHAND2 (THV Y)) (THNODB) (THUSE TC-MOVEHAND2))
		  (THASSERT (\#GRASPING (THV X)))
		  (MEMOREND (\#GRASP (THV EV) (THV X)))
		  (OR NOMEM
		      (THSETQ GRASPLIST (CONS (LIST THTIME (THV X)) GRASPLIST)))
		  (THCOND (DOIT (THOR (GRASP (THV X)) (AND (UNGRASP) NIL)))
			  ((THSETQ PLAN (CONS (LIST 'GRASP
						    (LIST 'QUOTE (THV X)))
					      PLAN))))))

(DEFS TC-LOC THEOREM
   (THCONSE (X Y Z LOC)
		  ((THV LOC) (THV X) (THV Y) (THV Z))
		  (THOR (THGOAL (\#MANIP (THV Y))) (THGOAL (\#IS (THV Y) \#BOX)))
		  (THOR (THGOAL (\#MANIP (THV Z))) (THGOAL (\#IS (THV Z) \#BOX)))
		  (NOT (EQ (THV Y) (THV Z)))
		  (LOCGREATER (THV Y) (THV Z) ((LAMBDA (X) (COND ((EQ X '\#RIGHT)
							  'CAR)
							 ((EQ X '\#BEHIND)
							  'CADR)
							 ((EQ X '\#ABOVE)
							  'CADDR)
							 ((ERT TC-LOC))))
				       (THV X)))))

(DEFS TC-MAKESPACE THEOREM
   (THCONSE (SURF SIZE OBJ SPACE X (WHY (EV)) EV)
		  (\#FINDSPACE (THV SURF) (THV SIZE) (THV OBJ) (THV SPACE))
		  (THNOT (THGOAL (\#IS (THV SURF) \#BOX)))
		  (MEMORY)
		  TAG
		  (THAND (THGOAL (\#SUPPORT (THV SURF) (THNV X)))
			 (THGOAL (\#GET-RID-OF (THV X)) (THUSE TC-GET-RID-OF)))
		  (THOR (THGOAL (\#FINDSPACE (THV SURF) (THV SIZE) (THV OBJ) (THV SPACE))
				(THUSE TC-FINDSPACE))
			(THGO TAG))
		  (MEMOREND (\#MAKESPACE (THV EV) (THV SURF)))))

(DEFS TC-MORE THEOREM
   (THCONSE (MEASURE X Y)
		  (\#MORE (THV MEASURE) (THV X) (THV Y))
		  (THVSETQ (THNV MEASURE) (THGET (THV MEASURE) 'MEASFN))
		  (> (FUNCALL (EVAL (THV MEASURE)) (THV X))
                     (FUNCALL (EVAL (THV MEASURE)) (THV Y))
)))

(DEFS TC-MOVEHAND THEOREM
   (THCONSE
  (X Y W Z)
  (\#MOVEHAND (THV Y))
  (THCOND
   ((EQUAL HANDAT (THV Y)) (THSUCCEED THEOREM))
   ((THGOAL (\#GRASPING (THV X)))
    (THVSETQ (THNV Z)
	     (PROG (X Y)
		   (SETQ X (ATAB (THV X)))
		   (AND (CLEAR (SETQ Y (DIFF (THV Y)
					     (TCENT '(0 0 0) (CADDR X))))
			       (LIST (CAADDR X)
				     (CADADR (CDR X))
				     (- 1000 (CADDR Y)))
			       (CAR X))
			(RETURN Y))))
    (THGOAL (\#AT (THV X) (THNV W)))
    (THERASE (\#AT (THV X) (THV W)) (THUSE TE-SUPP TE-CONTAIN))
    (THASSERT (\#AT (THV X) (THV Z)) (THUSE TA-AT TA-SUPP TA-CONTAIN))
    (THGOAL (\#MOVEHAND2 (THV Y)) (THNODB) (THUSE TC-MOVEHAND2))
    (OR
     NOMEM
     (THPUTPROP (THV X)
		(CONS (LIST THTIME
			    (THV Z)
			    (CADAR (OR (THVAL '(THGOAL (\#SUPPORT (THV Y)
								       (THV X)))
					      (CONS (LIST 'Y
							  'THUNASSIGNED)
						    THALIST))
				       '((NIL :HAND))))
			    NIL)
		      (THGET (THV X) 'HISTORY))
		'HISTORY)))
   ((THGOAL (\#MOVEHAND2 (THV Y)) (THNODB) (THUSE TC-MOVEHAND2))))))

(DEFS TC-MOVEHAND2 THEOREM
   (THCONSE (Y LOC)
		  (\#MOVEHAND2 (THV Y))
		  (COND ((EQUAL (THV Y) HANDAT) (THSUCCEED THEOREM))
			((AND (< 37 (CAR (THV Y)) 1141)
			      (< -1 (CADR (THV Y)) 1141)
			      (< -1 (CADDR (THV Y)) 1001))))
		  (THVSETQ (THNV LOC) HANDAT)
		  (THSETQ HANDAT (THV Y))
		  (THSETQ THTIME (+ 1 THTIME))
		  (THCOND (DOIT (THOR (EVAL (CONS 'MOVETO HANDAT))
				      (PROG (ADJUST) (EVAL (CONS 'MOVETO
								 (THV LOC))))))
			  ((THSETQ PLAN
				   (CONS (CONS 'MOVETO (THV Y)) PLAN))))))

(DEFS TC-NAME THEOREM
   (THCONSE (X)
		  (\#NAME (THV X))
		  (THVSETQ (THNV X) (LISTIFY (THV X)))
		  (THVSETQ (THNV X) (THFIND ALL
				       (THV Y)
				       (Y Z)
				       (THAMONG (THV Z) (THV X))
				       (THOR (THGOAL (\#NAME (THV Z) (THV Y)))
					     (THSETQ (THNV Y) (THV Z)))))
		  (MAPC 'PRINT (THV X))))

(DEFS TC-NOTICE THEOREM
   (THCONSE (X)
		  (\#NOTICE (THV X))
		  (COND (DOIT (BLINK (THV X)) (THSUCCEED))
			((THSETQ PLAN (CONS (LIST 'BLINK
						  (LIST 'QUOTE (THV X)))
					    PLAN))))))

(DEFS TC-ON THEOREM
   (THCONSE (X Y Z) (\#ON (THV X) (THV Y)) (THOR (THGOAL (\#SUPPORT (THV Y) (THV X)))
					      (THAND (THASVAL (THV X))
						     (THGOAL (\#SUPPORT (THNV Z) (THV X)))
						     (THGOAL (\#ON (THV Z) (THV Y))
							     (THUSE TC-ON))))))

(DEFS TC-PACK THEOREM
   (THCONSE (OBJ SURF BLOCKS PYR X Y)
		  (\#PACK (THV OBJ) (THV SURF))
		  (OR (THVSETQ (THNV BLOCKS) (PACKO (THV OBJ) '\#BLOCK)) T)
		  (OR (THVSETQ (THNV PYR) (PACKO (THV OBJ) '\#PYRAMID)) T)
		  GO
		  (THCOND ((NULL (THV BLOCKS))
			   (THCOND ((NULL (THV PYR)) (THSUCCEED THEOREM))
				   ((THVSETQ (THNV Y) (FINDSPACE 'PACK
							    (THV SURF)
							    (SIZE (CAR (THV PYR)))
							    (CAR (THV PYR))))
				    (THGOAL (\#PUT (THEV (CAR (THV PYR))) (THV Y))
					    (THUSE TC-PUT))
				    (OR (THSETQ (THV PYR) (CDR (THV PYR))) T)
				    (THGO GO))))
			  ((THSETQ (THNV X) (CAR (THV BLOCKS)))
			   (THVSETQ (THV Y) (FINDSPACE 'PACK
						   (THV SURF)
						   (SIZE (THV X))
						   (THV X)))
			   (THGOAL (\#PUT (THV X) (THV Y)) (THUSE TC-PUT))
			   (OR (THSETQ (THV BLOCKS) (CDR (THV BLOCKS))) T)
			   (THCOND ((THVSETQ (THNV Y) (OR (PACKON (THV X) (THV PYR))
						     (PACKON (THV X) (THV BLOCKS))))
				    (THGOAL (\#PUTON (THV Y) (THV X)) (THUSE TC-PUTON))
				    (COND ((MEMQ (THV Y) (THV PYR))
					   (THSETQ (THNV PYR)
						   (DELETE (THV Y)
							   (APPEND (THV PYR) NIL))))
					  ((THSETQ (THNV BLOCKS)
						   (DELETE (THV Y) (APPEND (THV BLOCKS)
								     NIL))))))
				   ((THSUCCEED)))
			   (THGO GO)))))

(DEFS TC-PART THCONSE
	 '(THCONSE (X Y Z)
		  (\#PART (THV X) (THV Y))
		  (THGOAL (\#IS (THV Y) \#STACK))
		  (THGOAL (\#CHOOSE (THV X) (THNV Z) '(((THGOAL (\#PART (THV *) (THV Y))))))
			  (THUSE TC-CHOOSE))
		  (OR (NOT (ATOM (THV Z))) (THSETQ (THNV Z) (LIST (THV Z))))
		  GO
		  (THCOND ((NULL (THV Z)) (THSUCCEED))
			  ((THGOAL (\#PART (THEV (CAR (THV Z))) (THV Y)))
			   (OR (THSETQ (THNV Z) (CDR (THV Z))) T)
			   (THGO GO))
			  ((THFAIL)))))

(DEFS TC-PHYSOB THEOREM
   (THCONSE (X)
		  (\#PHYSOB (THV X))
		  (THOR (THGOAL (\#MANIP (THV X)))
			(THAMONG (THV X) '(:BOX :TABLE :HAND)))))

(DEFS TC-PICKUP THEOREM
   (THCONSE (X (WHY (EV)) EV)
		  (\#PICKUP (THV X))
		  (MEMORY)
		  (THGOAL (\#GRASP (THV X)) (THUSE TC-GRASP))
		  (THGOAL (\#RAISEHAND) (THNODB) (THUSE TC-RAISEHAND))
		  (MEMOREND (\#PICKUP (THV EV) (THV X)))))

(DEFS TC-REFERS THEOREM
   (THCONSE(X)
(\#REFERS (THV X))
(EVAL(LIST 'THSETQ (LIST 'THV (THV X))(LIST 'QUOTE (ATOMIFY (THGET (THV X) 'BIND)))))))

(DEFS TC-PUT THEOREM
   (THCONSE (X Y Z)
		  (\#PUT (THV X) (THV Y))
		  (THCOND ((THASVAL (THV Y))
			   (THCOND ((ATOM (THV Y)) (THGOAL (\#CHOOSEPLACE (THV Y))
						       (THUSE TC-CHOOSEPLACE)))
				   ((THSUCCEED))))
			  ((THGOAL (\#GET-RID-OF (THV X))
				   (THNODB)
				   (THUSE TC-GET-RID-OF))
			   (THSUCCEED THEOREM)))
		  (CLEAR (THV Y) (SIZE (THV X)) (THV X))
		  (SUPPORT (THV Y) (SIZE (THV X)) (THV X))
		  (THGOAL (\#GRASP (THV X)) (THUSE TC-GRASP))
		  (THSETQ (THNV Z) (TCENT (THV Y) (SIZE (THV X))))
		  (THGOAL (\#MOVEHAND (THV Z)) (THNODB) (THUSE TC-MOVEHAND))
		  (THGOAL (\#UNGRASP) (THNODB) (THUSE TC-UNGRASP))))

(DEFS TC-PUTIN THEOREM
   (THCONSE (X Y Z (WHY (EV)) EV)
		  (\#PUTIN (THV X) (THV Y))
		  (MEMORY)
		  (THCOND ((THGOAL (\#PUTON (THV X) (THV Y)) (THUSE TC-PUTON))
			   (MEMOREND (\#PUTIN (THV EV) (THV X) (THV Y)))
			   (THSUCCEED THEOREM))
			  ((THSUCCEED)))
		  (THGOAL (\#IS (THV Y) \#BOX))
		  (THVSETQ (THNV Z)
			   (SHRDLU-UNION (LISTIFY (THV X))
				  (THVAL '(THFIND ALL
							(THV W)
							(W)
							(THGOAL (\#ON (THV W) (THV Y))))
					 THALIST)))
		  (THGOAL (\#CLEARTOP (THV Y)) (THUSE TC-CLEARTOP))
		  (THGOAL (\#PACK (THV Z) (THV Y)) (THUSE TC-PACK))
		  (MEMOREND (\#PUTIN (THV EV) (THV X) (THV Y)))))

(DEFS TC-PUTON THEOREM
   (THCONSE (X Y Z (WHY (EV)) EV)
		  (\#PUTON (THV X) (THV Y))
		  (ATOM (THV Y))
		  (COND ((LISTP (THV X)) (OR (CDR (THV X)) (THSETQ (THNV X) (CAR (THV X)))))
		        (T))
		  (NOT (COND ((ATOM (THV X)) (EQ (THV X) (THV Y))) ((MEMQ (THV Y) (THV X)))))
		  (MEMORY)
		  (THCOND ((ATOM (THV X))
			   (THGOAL (\#CLEARTOP (THV X)) (THUSE TC-CLEARTOP))
			   (THOR (THGOAL (\#FINDSPACE (THV Y) (THEV (SIZE (THV X))) (THV X) (THNV Z))
					 (THUSE TC-FINDSPACE))
				 (AND (NULL (THGET '\#NOCLEAR
						 'THASSERTION))
				      (THGOAL (\#FINDSPACE (THV Y)
							  (THEV (SIZE (THV X)))
							  (THV X)
							  (THNV Z))
					      (THUSE TC-MAKESPACE))))
			   (THGOAL (\#PUT (THV X) (THV Z)) (THNODB) (THUSE TC-PUT)))
			  ((THASSERT (\#NOCLEAR))
			   (THPROG ((W (THV X)))
				   UP
				   (THOR (THGOAL (\#PUTON (THEV (CAR (THV W))) (THV Y))
						 (THUSE TC-PUTON))
					 (THFAIL THPROG))
				   (THOR (THSETQ (THV W) (CDR (THV W))) (THRETURN T))
				   (THGO UP))
			   (THERASE (\#NOCLEAR)))
			  ((THNOT (THGOAL (\#IS (THV Y) \#BOX)))
			   (THGOAL (\#CLEARTOP (THV Y)) (THUSE TC-CLEARTOP))
			   (THGOAL (\#PACK (THV X) (THV Y)) (THUSE TC-PACK))))
		  (MEMOREND (\#PUTON (THV EV) (THV X) (THV Y)))))

(DEFS TC-RAISEHAND THEOREM
   (THCONSE ((WHY (EV)) EV)
		  (\#RAISEHAND)
		  (MEMORY)
		  (THGOAL (\#MOVEHAND (THEV (LIST (CAR HANDAT) (CADR HANDAT) 1000)))
			  (THNODB)
			  (THUSE TC-MOVEHAND))
		  (MEMOREND (\#RAISEHAND (THV EV)))))

(DEFS TC-STACK THEOREM
   (THCONSE (X Y)
		  (\#IS (THV X) \#STACK)
		  (NOT (THASVAL (THV X)))
		  (THGOAL (\#MANIP (THV Y)))
		  (THGOAL (\#SUPPORT (THV Y) ?))
		  (THNOT (THAND (THGOAL (\#PART (THV Y) (THNV X)))
				(THGOAL (\#IS (THV X) \#STACK))))
		  GO
		  (THGOAL (\#SUPPORT (THNV X) (THV Y)))
		  (THCOND ((MEMQ (THV X) '(:TABLE :BOX)))
			  ((THSETQ (THNV Y) (THV X)) (THGO GO)))
		  (THSETQ (THNV X) (MAKESYM 'STACK))
		  (THASSERT (\#IS (THV X) \#STACK))
		  (THASSERT (\#EXISTS (THV X)))
		  (THFIND ALL
			  (THV Z)
			  (Z)
			  (THGOAL (\#ON (THV Z) (THV Y)) (THUSE TC-ON))
			  (THAND (THASSERT (\#PART (THV Z) (THV X)))
				 (THFINALIZE THAND)))))

(DEFS TC-STACKUP THEOREM
   (THCONSE
  (X Y BLOCKS PYR (WHY (EV)) EV)
  (\#STACKUP (THV X))
  (OR (< (APPLY #'+
		    (MAPCAR #'(LAMBDA (X) (CADDR (SIZE X))) (THV X)))
	     1201)
      (NOT (DPRINT2 'TOO\ HIGH\,)))
  (THCOND
   ((AND (THV X) (CDR (THV X))))
   ((THSETQ
     (THNV X)
     (APPEND (THV X)
	     (THVAL (LIST 'THFIND
			  (COND ((NULL (THV X)) 3) (2))
			  '(THV Y)
			  '(Y)
			  '(THOR (THAND (THGOAL (\#IS (THV Y) \#BLOCK))
					      (THNOT (THGOAL (\#SUPPORT (THV Y) ?))))
				       (THGOAL (\#IS (THV Y) \#BLOCK)))
			  '(NOT (EQ (THV X) (THV Y))))
		    THALIST)))))
  (COND ((THVSETQ (THNV PYR) (PACKO (THV X) '\#PYRAMID)) (NULL (CDR (THV PYR)))) (T))
  (THVSETQ (THNV BLOCKS) (CONS ':TABLE (PACKO (THV X) '\#BLOCK)))
  (MEMORY)
  GO
  (THCOND ((CDR (THV BLOCKS)) (THGOAL (\#PUTON (THEV (CADR (THV BLOCKS))) (THEV (CAR (THV BLOCKS))))
				  (THUSE TC-PUTON))
			  (THSETQ (THNV BLOCKS) (CDR (THV BLOCKS)))
			  (THGO GO))
	  ((THV PYR) (THGOAL (\#PUTON (THEV (CAR (THV PYR))) (THEV (CAR (THV BLOCKS))))
			 (THUSE TC-PUTON)))
	  ((MEMOREND (\#STACKUP (THV EV) (THV X)))))))

(DEFS TC-STARTEND3 THEOREM
   (THCONSE (X Y EV TIME) ((THV X) (THV EV) (THV TIME)) (THGOAL ((THV X) (THV Y) (THV EV) (THV TIME))
							  (THUSE TC-STARTEND4))))

(DEFS TC-STARTEND4 THEOREM
   (THCONSE (X NEWEV Z EV TIME)
		  ((THV X) (THV NEWEV) (THV EV) (THV TIME))
		  (OR (AND (THASVAL (THV X))
			   (THASVAL (THV EV))
			   (THASVAL (THV TIME))
			   (NOT (THASVAL (THV NEWEV))))
		      (ERT TC-STARTEND4))
		  (THGOAL (\#CHOOSE (THV EV) (THNV Z) NIL) (THUSE TC-CHOOSE))
		  (OR (ATOM (THV Z)) (ERT TC-STARTEND4 ATOM))
		  (THSETQ (THNV NEWEV) (MAKESYM 'EV))
		  (S3TF (THV NEWEV) 'END
			   (S3TF (THV NEWEV) 'START
				    (THGET (THV Z) (COND ((EQ (THV X) '\#START)
						    'START)
						   ((EQ (THV X) '\#END)
						    'END)
						   ((ERT TC-STARTEND (THV X)))))))
		  (TIMECHK (THV NEWEV) (THV TIME))
		  (S3TF (THV NEWEV) 'WHY (THV Z))
		  (S3TF (THV NEWEV) 'TYPE '\#START)))

(DEFS TC-UNGRASP THEOREM
   (THCONSE (X OBJ (WHO (EV)) EV)
		  (\#UNGRASP)

		  (THCOND ((THGOAL (\#GRASPING (THV X)))
(MEMORY)
			   (THGOAL (\#SUPPORT ? (THV X)))
			   (THERASE (\#GRASPING (THV X)))
			   (MEMOREND (\#UNGRASP (THV EV) (THV X)))
			   (THSETQ THTIME (+ 1 THTIME))
			   (THCOND (DOIT (THOR (UNGRASP) (AND (GRASP (THV X)) NIL)))
				   ((THSETQ PLAN
					    (CONS '(UNGRASP) PLAN)))))
			  ((THSUCCEED)))))

(DEFS TC-WANT4 THEOREM
   (THCONSE (X EV TIME Y)
		  (\#WANT (THV X) (THV EV) (THV TIME))
		  (THGOAL (\#WANT (THV Y) (THV X) (THV EV) (THV TIME)) (THUSE TC-WANT5))))

(DEFS TC-WANT5 THEOREM
   (THCONSE (X NEWEV EV TIME Z)
		  (\#WANT (THV NEWEV) (THV X) (THV EV) (THV TIME))
		  (OR (AND (THASVAL (THV X)) (THASVAL (THV EV)) (THASVAL (THV TIME)))
		      (ERT TC-WANT5 THASVAL))
		  (EQ (THV X) ':FRIEND)
		  (EQ (THGET (THV EV) 'WHY) 'COMMAND)
		  (THSETQ (THNV NEWEV) (MAKESYM 'EV))
		  (S3TF (THV NEWEV) 'END
			   (S3TF (THV NEWEV) 'START
				    (THGET (THV EV) 'START)))
		  (TIMECHK (THV NEWEV) (THV TIME))
		  (S3TF (THV NEWEV) 'TYPE '\#TELL)
		  (S3TF (THV NEWEV) 'WHY 'ESP)))

(DEFS TCT-EXISTS THEOREM
   (THCONSE NIL (\#EXISTS ? ?) (THSUCCEED)))

(DEFS TCT-PICKUP THEOREM
   (THCONSE (X EV TIME)
		  (\#PICKUP (THV X) (THV TIME))
		  (THOR (THAND (THGOAL (\#PICKUP(THV EV) (THV X))) (TIMECHK (THV EV) (THV TIME)))
			(THGOAL (\#PICKUP (THV EV) (THV X) (THV TIME)) (THUSE TCTE-PICKUP)))))

(DEFS TCT-PUT THEOREM
   (THCONSE (X EV TIME Y)
		  (\#PUT (THV X) (THV Y) (THV TIME))
		  (THGOAL (\#PUT (THV EV) (THV X) (THV Y) (THV TIME)) (THUSE TCTE-PUT))))

(DEFS TCT-AT THEOREM
   (THCONSE (X Y Z TIME W)
		  (\#AT (THV Y) (THV Z) (THV TIME))
		  (THOR (THGOAL (\#MANIP (THV Y))) (THAND (THGOAL (\#IS (THV Y) \#BOX))
						     (THGOAL (\#AT (THV Y) (THV Z)))
						     (THSUCCEED THEOREM)))
		  (THSETQ (THNV X)(TFIND (THV Y) (THV TIME)))
(THOR(THSETQ (THNV W)(CAR (THV X)))
(THAND(THAMONG (THV W) (CDR (THV X)))
(OR		  (NOT (< (CAR (THV W)) (OR (START? (THV TIME)) -1)))
(THFAIL THAND))
))

		  (THSETQ (THV Z) (CADR (THV W)))))

(DEFS TCT-LOC THEOREM
   (THCONSE (YY ZZ X Y Z TIME)
		  (\#LOC (THV X) (THV Y) (THV Z) (THV TIME))
		  (THGOAL (\#AT (THV Y) (THV YY) (THV TIME)) (THUSE TCT-AT))
		  (THGOAL (\#AT (THV Z) (THV ZZ) (THV TIME)) (THUSE TCT-AT))
		  (THGOAL (\#TLOC (THV X) (THV Y) (THV Z)) (THUSE TC-LOC))))

(DEFS TCT-SUPPORT THEOREM
   (THCONSE (X Y Z TIME)
		  (\#SUPPORT (THV X) (THV Y) (THV TIME))
		  (THOR (THGOAL (\#MANIP (THV Y))) (THGOAL (\#IS (THV Y) \#BOX)))
		  (THAMONG (THV Z) (TFIND (THV Y) (THV TIME)))
		  (NOT (< (CAR (THV Z)) (OR (START? (THV TIME)) -1)))
		  (THAMONG (THV X) (LIST (CADDR (THV Z))))))

(DEFS TCT-ON THEOREM
   (THCONSE (Y X Z TIME)
		  (\#SUPPORT (THV X) (THV Y) (THV TIME))
		  (THOR (THGOAL (\#MANIP (THV Y))) (THGOAL (\#IS (THV Y) \#BOX)))
		  (THAMONG (THV Z) (TFIND (THV Y) (THV TIME)))
		  (NOT (< (CAR (THV Z)) (OR (START? (THV TIME)) -1)))
		  (THAMONG (THV X) (LIST (CADDR (THV Z))))))


(DEFS TCT-2 THEOREM
   (THCONSE (X EV TIME) ((THV X) (THV TIME)) (THGOAL ((THV X) (THV EV) (THV TIME))
						   (THUSE TCTE-3))))

(DEFS TCT-3 THEOREM
   (THCONSE (X Y EV TIME) ((THV X) (THV Y) (THV TIME)) (THGOAL ((THV X) (THV EV) (THV Y) (THV TIME))
							 (THUSE TCTE-4))))

(DEFS TCT-4 THEOREM
   (THCONSE (X Y Z EV TIME)
		  ((THV X) (THV Y) (THV Z) (THV TIME))
		  (THGOAL ((THV X) (THV EV) (THV Y) (THV Z) (THV TIME)) (THUSE TCTE-5))))

(DEFS TCTE-PICKUP THEOREM
   (THCONSE (X EV EVENT TIME)
		  (\#PICKUP (THV EV) (THV X) (THV TIME))
		  (THOR (THAND (THGOAL (\#PICKUP (THV EV) (THV X)))
			       (TIMECHK (THV EV) (THV TIME))
			       (THSUCCEED THEOREM))
			(THSUCCEED))
		  (THAMONG (THV EVENT) EVENTLIST)
		  (MEMQ (THGET (THV EVENT) 'TYPE) '(\#PUTON \#GET-RID-OF))
		  (TIMECHK (THV EVENT) (THV TIME))
		  (THOR (THGOAL (\#PUTON (THV EVENT) (THV X) ?))
			(THGOAL (\#GET-RID-OF (THV EVENT) (THV X))))
		  (THVSETQ (THNV EV) (MAKESYM 'E))
		  (AND (S3TF (THV EV) 'END
				(S3TF (THV EV) 'START
					 (THGET (THV EVENT) 'END)))
		       (S3TF (THV EV) 'TYPE '\#PICKUP)
		       (S3TF (THV EV) 'WHY (THV EVENT))
		       (SETQ EVENTLIST (CONS (THV EV) EVENTLIST))
		       (THASSERT (\#PICKUP (THV EV) (THV X))))))

(DEFS TCTE-PUT THEOREM
   (THCONSE (X Y EV EVENT TIME Z)
		  (\#PUT (THV EV) (THV X) (THV Y) (THV TIME))
		  (THAMONG (THV EVENT) EVENTLIST)
		  (MEMQ (THGET (THV EVENT) 'TYPE) '(\#PICKUP \#PUTON))
		  (TIMECHK (THV EVENT) (THV TIME))
		  (THOR (THGOAL (\#PUTON (THV EVENT) (THV X) ?))
			(THGOAL (\#PICKUP (THV EVENT) (THV X))))
		  (OR (THVSETQ (THNV Z) (ASSQ (- (THGET (THV EVENT) 'END) 1)
					      (THGET (THV X) 'HISTORY)))
		      (ERT TCTE-PUT WRONG))
		  (THAMONG (THV Y) (LIST (CADR (THV Z))))
		  (THSETQ (THNV EV) (MAKESYM 'E))
		  (AND (S3TF (THV EV) 'END
				(S3TF (THV EV) 'START (CAR (THV Z))))
		       (S3TF (THV EV) 'WHY (THV EVENT))
		       (S3TF (THV EV) 'TYPE '\#PUT)
		       (SETQ EVENTLIST (CONS (THV EV) EVENTLIST))
		       (THASSERT (\#PUT (THV EV) (THV X) (THV Y))))))

(DEFS TCTE-3 THEOREM
   (THCONSE (X EV TIME)
		  ((THV X) (THV EV) (THV TIME))
		  (OR (THASVAL TIME) (ERT TCTE-3))
		  (THGOAL ((THV X) (THV EV)))
		  (TIMECHK (THV EV) (THV TIME))))

(DEFS TCTE-4 THEOREM
   (THCONSE (X Y EV TIME)
		  ((THV X) (THV EV) (THV Y) (THV TIME))
		  (OR (THASVAL (THV TIME)) (ERT TCTE-4))
		  (THGOAL ((THV X) (THV EV) (THV Y)))
		  (TIMECHK (THV EV) (THV TIME))))

(DEFS TCTE-5 THEOREM
   (THCONSE (X Y Z EV TIME)
		  ((THV X) (THV EV) (THV Y) (THV Z) (THV TIME))
		  (OR (THASVAL (THV TIME)) (ERT TCT-5))
		  (THGOAL ((THV X) (THV EV) (THV Y) (THV Z)))
		  (TIMECHK (THV EV) (THV TIME))))

(DEFS TCT-GRASP THEOREM
   (THCONSE (X Z TIME)
		  (\#GRASP (THV X) (THV TIME))
		  (THVSETQ (THNV Z) (ENDTIME GRASPLIST (THV TIME)))
		  UP
		  (THCOND ((OR (NULL (THV Z)) (STARTIME (THV Z) (THV TIME))) (THFAIL))
			  ((OR (AND (NOT (THASVAL (THV X)))
				    (THSETQ (THNV X) (CADAR (THV Z))))
			       (EQ (THV X) (CADAR (THV Z)))))
			  ((THSETQ (THNV Z) (CDR (THV Z))) (THGO UP))
			  ((THFAIL)))))

(DEFS TE-CONTAIN THEOREM
   (THERASING (X Y)
		    (\#AT (THV X) ?)
		    (THGOAL (\#CONTAIN (THNV Y) (THV X)))
		    (THERASE (\#CONTAIN (THV Y) (THV X)))))

(DEFS TE-EXISTS THEOREM
   (THERASING (X) (\#EXISTS (THV X)) (THSUCCEED)))

(DEFS TE-SUPP THEOREM
   (THERASING (X Y Z)
		    (\#AT (THV X) ?)
		    (THCOND ((THGOAL (\#SUPPORT (THV X) (THNV Y))) (ERT TE-SUPP))
			    ((THGOAL (\#SUPPORT (THNV Y) (THV X)))
			     (THERASE (\#SUPPORT (THV Y) (THV X)))
			     (THCOND ((THGOAL (\#PART (THV X) (THNV Y)))
				      (THERASE (\#PART (THV X) (THV Y)))
				      (THCOND ((THFIND 2
						       (THV W)
						       (W)
						       (THGOAL (\#PART (THV W) (THV Y))))
					       (THSUCCEED THEOREM))
					      ((THGOAL (\#PART (THNV Z) (THV Y)))
					       (THERASE (\#PART (THV Z) (THV Y))))
					      ((THSUCCEED)))
				      (THERASE (\#EXISTS (THV Y)) (THUSE TE-EXISTS)))
				     ((THSUCCEED)))))))

(DEFUN TOPCENTER (X) ((LAMBDA (X) (TCENT (CADR X) (CADDR X))) (ATAB X)))

(SETQ DOIT NIL)

(SETQ NOSTACKS T)

(DEFUN SASSQ (X Y Z) (OR (ASSQ X Y) (APPLY Z NIL)))

(DEFS \#CLEARTOP CHOOSE (((THGOAL (\#SUPPORT (THV *) ?)))))

(DEFS \#GRASP CHOOSE
	 (((THNOT (THGOAL (\#GRASPING (THV *)))) (THGOAL (\#CLEARTOP (THV *))))
	  ((THNOT (THGOAL (\#GRASPING (THV *)))))))

(DEFS \#PICKUP CHOOSE
	 (((THGOAL (\#SUPPORT ? (THV *))) (THGOAL (\#CLEARTOP (THV *))))
	  ((THGOAL (\#SUPPORT ? (THV *))))))

(DEFS \#PUTIN CHOOSE
	 (((THNOT (THGOAL (\#CONTAIN :BOX (THV *)))) (THGOAL (\#CLEARTOP (THV *))))
	  ((THNOT (THGOAL (\#CONTAIN :BOX (THV *)))))))

(DEFS \#PUTIN CHOOSE2 (((THGOAL (\#IS (THV *) \#BOX)))))

(DEFS \#PUTON CHOOSE (((THGOAL (\#CLEARTOP (THV *))))))
(DEFS \#PUTON CHOOSE2
	 (((THGOAL (\#CLEARTOP (THV *))) (THNOT (THGOAL (\#IS (THV *) \#PYRAMID))))
	  ((THNOT (THGOAL (\#IS (THV *) \#PYRAMID))))))

(DEFS \#STACKUP CHOOSE
	 (((THGOAL (\#CLEARTOP (THV *))) (THNOT (THGOAL (\#IS (THV *) \#PYRAMID))))
	  ((THNOT (THGOAL (\#IS (THV *) \#PYRAMID))))))

(THADD 'TC-CALL NIL)

(THADD 'TC-CLEARTOP NIL)

(THADD 'TC-GET-RID-OF NIL)

(THADD 'TC-GRASP NIL)

(THADD 'TC-NAME NIL)

(THADD 'TC-NOTICE NIL)

(THADD 'TC-PACK NIL)

(THADD 'TC-PICKUP NIL)

(THADD 'TC-PUTIN NIL)

(THADD 'TC-PUTON NIL)

(THADD 'TC-RAISEHAND NIL)

(THADD 'TC-STACKUP NIL)

(THADD 'TC-UNGRASP NIL)

(THADD 'TC-ON NIL)

(THADD 'TC-PHYSOB NIL)

; also defined in syscom.lisp -ts.
;(DEFUN SHRDLU-UNION (A B) (PROG NIL
;		    UP	 (COND ((NULL A) (RETURN B))
;			       ((MEMQ (CAR A) B))
;			       ((SETQ B (CONS (CAR A) B))))
;			 (SETQ A (CDR A))
;			 (GO UP)))

'(COMMANDS ARE\:
		 \#CLEARTOP
		 \#GET-RID-OF
		 \#GRASP
		 \#PACK
		 \#PICKUP
		 \#PUTIN
		 \#PUTON
		 \#RAISEHAND
		 \#STACKUP
		 \#UNGRASP)

'(PREDICATES ARE\: \#LOC \#SUPPORT \#ON \#PHYSOB)
