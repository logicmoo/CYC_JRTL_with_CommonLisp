;;;===========================================================
;;;
;;;                         WORDS
;;;
;;;===========================================================

(DEFS \, FEATURES (SPECIAL) SPECIAL (COMMA))

;;; Less confusion
#.(READ-FROM-STRING "(DEFS |\"| FEATURES (B-SPECIAL RELWRD) B-SPECIAL (DOUBLEQUOTER))")

(DEFS A SEMANTICS ((DET T)) FEATURES (DET NS INDEF))

(DEFS ABOVE SEMANTICS ((PREP (\#LOC \#ABOVE T))) FEATURES (PREP PLACE))

(DEFS AFTER SEMANTICS ((BINDER (SMBINDER END NIL))) FEATURES (BINDER TIME))

(DEFS ALL
      SEMANTICS
      ((DET (COND ((CQ OF) 'ALL)
             ((MEET '(NUM DEF) FE) 'DEF)
             ('NDET))))
      FEATURES
      (DET NPL QNTFR))

(DEFS AN IRREGULAR (A NIL NIL))

(DEFS AND FEATURES (SPECIAL) SEMANTICS T SPECIAL (CONJ))

(DEFS ANY SEMANTICS ((DET 'INDEF)) FEATURES (DET ANY NS NPL QNTFR))

(DEFS ANYTHING SEMANTICS ((TPRON 'INDEF)) FEATURES (TPRON ANY NS))

(DEFS ARE IRREGULAR (BE (VPL PRESENT) (INF)))

(DEFS AS SEMANTICS ((NULL T)) FEATURES (AS))

(DEFS ASK
      SEMANTICS
      ((VB
        ((TRANS (RELATION
                 (RESTRICTIONS\: (((\#ANIMATE))
                                  ((\#EVENT)))
                        MARKERS\:
                        (\#EVENT)
                        PROCEDURE\:
                        ((\#WANT \#1 \#2 *TIME))))))))
      FEATURES
      (VB TRANS INF SUBTOB))

(DEFS AT SEMANTICS ((NUMD T)) FEATURES (AT))

(DEFS AWAY SEMANTICS ((PRT T)) FEATURES (PRT))

(DEFS BACK SEMANTICS ((PREP2 T) (NOUN T)) FEATURES (NOUN NS PREP2))

(DEFS BALL
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#MANIP \#ROUND)
                     PROCEDURE\:
                     ((\#IS *** \#BALL))))))
      FEATURES
      (NOUN NS))

(DEFS BE
      FEATURES
      (INT AUX VB BE INF)
      SEMANTICS
      ((VB
        ((THERE (\#BETHERE))
         (INT (\#BEINT))))))

(DEFUN \#BETHERE  NIL
      (RELATION
       (RESTRICTIONS\: (((\#THING)
                         (EQ (QUANTIFIER? SMSUB)
                             'INDEF)))
            PROCEDURE\:
            NIL)))


(DEFUN \#BEINT  NIL
      (COND
       ((RELATION
         (RESTRICTIONS\: (((\#PHYSOB))
                          (SMCOMP (\#PROPERTY)))
           PROCEDURE\:
           (\#EVAL
               (PROG (PROPERTY)
                     (COND
                          ((SETQ
                                 PROPERTY
                                (MEET (G3T '\#PROPERTY
                                               'SYSTEM)
                                      (MARKERS? SMCOMP)))
                           (RETURN
                                 (LIST (LIST  (CAR PROPERTY)
                                        '\#1
                                        '\#2))))
                          ((RETURN (LIST '(\#2 \#1))))))))
         (RESTRICTIONS\: (((\#THING))
                          (SMCOMP
                                     (\#SYSTEMS)
                                     (AND (NOT (REFER? SMCOMP))
                                         (EQ  (REL? SMCOMP)
                                             SMSUB))))
           PROCEDURE\:
           (\#EVAL (RELATIONS? SMCOMP)))
         (RESTRICTIONS\: (((\#THING))
                          (SMCOMP (\#THING)
                                 (REFER? SMCOMP)))
           PROCEDURE\:
           ((\#EVAL
                (LIST  'THAMONG
                     '\#1
                     (LIST 'QUOTE
                                 (REFER? \#2))))))))
       (T
         (ERTERR "SORRY I DON'T UNDERSTAND  THE VERB BE WHEN YOU USE IT LIKE THAT"))))

(DEFS BEFORE SEMANTICS ((BINDER (SMBINDER NIL START))) FEATURES (BINDER TIME))

(DEFS BEGIN
      SEMANTICS
      ((VB
        ((TRANS (RELATION
                 (RESTRICTIONS\: (((\#ANIMATE)) ((\#EVENT)))
                        MARKERS\:
                        (\#EVENT)
                        PROCEDURE\:
                        ((\#START \#2 *TIME)))))
         (ITRNS
           (RELATION
                    (RESTRICTIONS\: (((\#ANIMATE)))
                           MARKERS\:
                           (\#EVENT)
                           PROCEDURE\:
                           ((\#START EE *TIME))))))))
      FEATURES
      (VB TRANS INF TOOB INGOB ITRNS))

(DEFS BEGAN IRREGULAR (BEGIN (PAST) (INF)))

(DEFS BEHIND
      SEMANTICS
      ((PREP (\#LOC \#BEHIND T)))
      FEATURES
      (PREP PLACE))

(DEFS BELOW
      SEMANTICS
      ((PREP (\#LOC \#ABOVE NIL)))
      FEATURES
      (PREP PLACE))

(DEFS BENEATH
      SEMANTICS
      ((PREP (\#LOC \#ABOVE NIL)))
      FEATURES
      (PREP PLACE))

(DEFS BESIDE
      SEMANTICS
      ((PREP (RELATION
              (RESTRICTIONS\: (((\#PHYSOB)) ((\#PHYSOB)))
                    PROCEDURE\:
                    ((\#NEXTO \#1 \#2 *TIME))))))
      FEATURES
      (PREP PLACE))

(DEFS BIG
      SEMANTICS
      ((MEASURE  (MEASURE DIMENSION\:
                  \#SIZE
                  RESTRICTIONS\:
                  (\#PHYSOB)
                  DIRECTION\:
                  T))
       (ADJ (OBJECT
             (MARKERS\: (\#PHYSOB \#BIG)
              PROCEDURE\:
              ((\#MORE \#SIZE
                     ***
                     (128. 128.
                          128.)))))))

      FEATURES
      (ADJ))

(DEFS BLACK SEMANTICS ((ADJ (\#COLOR \#BLACK))) FEATURES (ADJ))

(DEFS BLOCK
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#MANIP \#RECTANGULAR)
                     PROCEDURE\:
                     ((\#IS *** \#BLOCK))))))
      FEATURES
      (NOUN NS))

(DEFS BLUE SEMANTICS ((ADJ (\#COLOR \#BLUE))) FEATURES (ADJ))

(DEFS BOTH
      SEMANTICS
      ((DET 'DEF))
      FEATURES
      (B-SPECIAL QNTFR DET DEF NPL BOTH)
      B-SPECIAL
      (BOTH AND)
      FEXPR
      (LAMBDA (A)
       (DECLARE (SPECIAL A))
       (PROG (END)
        (DECLARE (SPECIAL END))
        (SETQ END CUT)
        (RETURN (PROG  (CUT NBB BOTH)
                 (SETQ NBB N)
                 (AND (FLUSHME)
                      (MOVE-PTW N
                              NW
                              (EQ (WORD PTW) (CAR A))
                              NW)
                      (CUT END)
                      (SETQ BOTH PTW)
                      (SETQ RE
                         (COND ((MEMQ (CAR R3ST)
                                      '(PREP ADV))
                                (PARSE3 R3ST T))
                               ((MEMQ (CAR R3ST)
                                      '(NG
                                               PREPG
                                               ADJG
                                               CLAUSE))
                                (PARSE2 R3ST T))))
                      (< (LENGTH N) (LENGTH BOTH))
                      (RETURN (SETQ SPECIAL 'SKIP)))
                 (SETQ RE NIL)
                 (SETQ N NBB)
                 (RETURN NIL))))))

(DEFS BOX
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#BOX)
                     PROCEDURE\:
                     ((\#IS *** \#BOX))))))
      FEATURES
      (NOUN NS))

(DEFS BRICK FEATURES (NOUN NS))

(DEFS BUILD
      SEMANTICS
      ((VB ((TRANS (\#BUILD)))))
      FEATURES
      (VB INF TRANS))

(DEFS BUT FEATURES (SPECIAL) SEMANTICS T SPECIAL (CONJ))

(DEFS BY
      SEMANTICS
      ((PREP (RELATION
              (RESTRICTIONS\: (((\#PHYSOB)) ((\#PHYSOB)))
                    PROCEDURE\:
                    ((\#NEXTO \#1 \#2 *TIME))))))
      FEATURES
      (PREP))

(DEFS CALL
      SEMANTICS
      ((VB
        ((TRANS2
          (RELATION
            (RESTRICTIONS\: (((\#ANIMATE)) ((\#THING))
                             ((\#NAME)))
                   PROCEDURE\:
                   ((\#CALL \#2 \#3 *TIME))))))))
      FEATURES
      (VB INF TRANS2))

(DEFS CAN SEMANTICS ((VB T)) FEATURES (V3PS VFS VPL VB MODAL AUX))

(DEFS CHOOSE
      SEMANTICS
      ((VB ((TRANS (\#NOTICE)))))
      FEATURES
      (VB INF TRANS))

(DEFS CLEAN SEMANTICS ((VB T)) FEATURES (VB INF VPRT TRANS))

(DEFS CLEAN-OFF
      ROOT
      (CLEAN OFF)
      SEMANTICS
      ((TRANS (\#CLEANOFF)))
      FEATURES
      (COMBINATION TRANS))

(DEFS CLEAN-OUT
      ROOT
      (CLEAN OUT)
      SEMANTICS
      ((TRANS (\#CLEANOFF)))
      FEATURES
      (COMBINATION TRANS))

(DEFS CLEAN-UP
      ROOT
      (CLEAN UP)
      SEMANTICS
      ((TRANS (\#CLEANOFF)))
      FEATURES
      (COMBINATION TRANS))

(DEFS CLEAR SEMANTICS ((VB T)) FEATURES (VB INF VPRT TRANS))

(DEFS CLEAR-OFF
      ROOT
      (CLEAR OFF)
      SEMANTICS
      ((TRANS (\#CLEANOFF)))
      FEATURES
      (COMBINATION TRANS))

(DEFS CLEAR-OUT
      ROOT
      (CLEAR OUT)
      SEMANTICS
      ((TRANS (\#CLEANOFF)))
      FEATURES
      (COMBINATION TRANS))

(DEFS COLOR
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#COLOR)
                     PROCEDURE\:
                     ((\#IS *** \#COLOR))))))
      FEATURES
      (NOUN NS))

(DEFS CONSTRUCT
      SEMANTICS
      ((VB ((TRANS (\#BUILD)))))
      FEATURES
      (VB INF TRANS))

(DEFS CONTAIN
      SEMANTICS
      ((VB
        ((TRANS (RELATION
                 (RESTRICTIONS\: (((\#BOX)) ((\#PHYSOB)))
                        PROCEDURE\:
                        ((\#CONTAIN \#1 \#2 *TIME)))
                 (RESTRICTIONS\: (((\#CONSTRUCT))
                                  ((\#THING)))
                        PROCEDURE\:
                        ((\#PART \#2 \#1 *TIME))))))))
      FEATURES
      (VB INF TRANS))

(DEFS CONTAINER
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#BOX)
                     PROCEDURE\:
                     ((\#IS *** \#BOX))))))
      FEATURES
      (NOUN NS))

(DEFS CORNER FEATURES (NOUN NS))

(DEFS CUBE
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#MANIP \#RECTANGULAR)
                     PROCEDURE\:
                     ((\#IS *** \#BLOCK) (\#EQDIM ***))))))

      FEATURES
      (NOUN NS))

(DEFS DID IRREGULAR (DO (PAST V3PS) (INF PRESENT)))

(DEFS DO
      SEMANTICS
      ((VB
        ((TRANS
          (RELATION
            (RESTRICTIONS\: RESTRICTIONS\:
                   PROCEDURE\:
                   ((((\#ANIMATE)) ((\#EVENT))))
                   MARKERS\:
                   PROCEDURE\:
                   PLAUSIBILITY\:
                   (\#EVAL (OR (G3T MAP2 'REFER)
                              (ERT DO
                                   DEFINITION)))))))))

      FEATURES
      (TRANS VFS PRESENT VPL VB AUX DO INF))

(DEFS DOES IRREGULAR (DO (V3PS) (VFS VPL INF)))

(DEFS DOWN SEMANTICS ((PRT T)) FEATURES (PRT))

(DEFS DROP
      SEMANTICS
      ((VB
        ((TRANSL
          (RELATION
            (RESTRICTIONS\: (((\#ANIMATE))
                             ((\#MANIP))
                             (SMOBL (\#PLACE *TIME)))
                   PROCEDURE\:
                   ((\#DROP \#1 \#2 \#3))
                   MARKERS\:
                   (\#MOTION))))
         (TRANS (RELATION
                 (RESTRICTIONS\:  (((\#ANIMATE))
                                   ((\#PHYSOB)))
                         MARKERS\:
                         (\#EVENT)
                         PROCEDURE\:
                         ((\#DROP \#1
                                  \#2
                                  ?
                                  *TIME))))))))
      FEATURES
      (TRANSL TRANSL2 VB INF TRANS))

(DEFS EACH SEMANTICS ((DET 'ALL)) FEATURES (DET NS QNTFR))

(DEFS EITHER FEATURES (B-SPECIAL) SEMANTICS T B-SPECIAL (BOTH OR))

(DEFS EVERY SEMANTICS ((DET 'ALL)) FEATURES (DET NS QNTFR))

(DEFS EVERYTHING SEMANTICS ((TPRON 'ALL)) FEATURES (TPRON NS))

(DEFS EXACTLY
      SEMANTICS
      ((NUMD (LIST 'EXACTLY NUM)))
      FEATURES
      (NUMD NUMDALONE))

(DEFS FEW
      SEMANTICS
      ((NUMD (LIST '< (+ 1 NUM))))
      FEATURES
      (NUMD NUMDAS))

(DEFS FEWER
      SEMANTICS
      ((NUMD (LIST '< NUM)))
      FEATURES
      (NUMD NUMDAN))

(DEFS FIND
      SEMANTICS
      ((VB ((TRANS (\#NOTICE)))))
      FEATURES
      (VB INF TRANS))

(DEFS FINISH
      SEMANTICS
      ((VB
        ((TRANS (RELATION
                 (RESTRICTIONS\: (((\#ANIMATE))
                                  ((\#EVENT)))
                        MARKERS\:
                        (\#EVENT)
                        PROCEDURE\:
                        ((\#END \#2 *TIME))))))))
      FEATURES
      (VB INF TRANS INFOB))

(DEFS FIVE SEMANTICS ((NUM 5.)) FEATURES (NUM))

(DEFS FOUR SEMANTICS ((NUM 4.)) FEATURES (NUM))

(DEFS FRIEND REFER \:FRIEND FEATURES (NOUN NS))

(DEFS FROM FEATURES (PREP))

(DEFS FRONT SEMANTICS ((NOUN T) (PREP2 T)) FEATURES (NOUN NS PREP2))

(DEFS GAVE IRREGULAR (GIVE (PAST) (INF)))

(DEFS GIVE
      SEMANTICS
      ((VB
        ((TRANS2
          (RELATION
            (RESTRICTIONS\: (((\#ANIMATE)) ((\#ANIMATE))
                             ((\#PHYSOB)))
                   MARKERS\:
                   (\#EVENT)
                   PROCEDURE\:
                   ((\#GIVE \#1 \#2 \#3 *TIME))))))))
      FEATURES
      (VB INF TRANS2))

(DEFS GO FEATURES (ITRNS VB INF))

(DEFS GOING FEATURES (VB ITRNS ING))

(DEFS GRAB
      SEMANTICS
      ((VB ((TRANS (\#GRASP)))))
      FEATURES
      (VB TRANS INF))

(DEFS GRASP
      SEMANTICS
      ((VB ((TRANS (\#GRASP)))))
      FEATURES
      (VB TRANS INF))

(DEFS GREATER
      SEMANTICS
      ((NUMD (LIST '> NUM)))
      FEATURES
      (NUMD NUMDAN))

(DEFS GREEN SEMANTICS ((ADJ (\#COLOR \#GREEN))) FEATURES (ADJ))

(DEFS HAD IRREGULAR (HAVE (PAST) (INF)))

(DEFS HAND
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#HAND)
                     PROCEDURE\:
                     ((\#IS *** \#HAND))))))
      FEATURES
      (NOUN NS))

(DEFS HANDLE
      SEMANTICS
      ((VB ((TRANS (\#GRASP)))))
      FEATURES
      (VB INF TRANS))

(DEFS HAS IRREGULAR (HAVE (V3PS PRESENT) (INF)))

(DEFS HAVE
      SEMANTICS
      ((VB ((TRANS (\#HAVE)))))
      FEATURES
      (HAVE VB AUX INF TRANS))

(DEFS HIGH
      SEMANTICS
      ((MEASURE  (MEASURE DIMENSION\:
                  \#HEIGHT
                  RESTRICTIONS\:
                  (\#PHYSOB)
                  DIRECTION\:
                  T))
       (ADJ (OBJECT
             (MARKERS\: (\#PHYSOB)
              PROCEDURE\:
              ((\#HIGH ***))))))
      FEATURES
      (ADJ))

(DEFS HOLD
      SEMANTICS
      ((VB
        ((TRANS
          (RELATION
            (RESTRICTIONS\: (((\#HAND)) ((\#MANIP)))
                   PROCEDURE\:
                   ((\#GRASPING \#2 *TIME)))
            (RESTRICTIONS\: (((\#ANIMATE)) ((\#MANIP)))
                   PROCEDURE\:
                   ((\#GRASPING \#2 *TIME))))))))
      FEATURES
      (VB INF TRANS))

(DEFS HE FEATURES (PRON NS SUBJ))

(DEFS HER IRREGULAR (SHE (OBJ POSS) (SUBJ)))

(DEFS HIM IRREGULAR (HE (OBJ) (SUBJ)))

(DEFS HIS FEATURES (PRON POSS))

(DEFS HOW SEMANTICS ((QADJ T)) FEATURES (QADJ))

(DEFS HOWEVER FEATURES (PRON EVERPRON))

(DEFS I
      SEMANTICS
      ((PRON (SMSET (LIST (NEWCOPY 'FRIEND-OSS)))))
      FEATURES
      (SUBJ PRON NFS))

(DEFS IF FEATURES (BINDER))

(DEFS IN SEMANTICS ((PREP (\#IN))) FEATURES (ADV PLACE PREP PLACE))

(DEFS IN-BACK-OF
      ROOT
      (IN BACK OF)
      SEMANTICS
      (\#LOC \#BEHIND T)
      FEATURES
      (PREP COMBINATION))

(DEFS IN-FRONT-OF
      ROOT
      (IN FRONT OF)
      SEMANTICS
      (\#LOC \#BEHIND NIL)
      FEATURES
      (PREP COMBINATION))

(DEFS INSIDE SEMANTICS ((PREP (\#IN))) FEATURES (PREP PLACE))

(DEFS INSIDE-OF
      ROOT
      (INSIDE OF)
      SEMANTICS
      (\#IN)
      FEATURES
      (PREP COMBINATION))

(DEFS INTO SEMANTICS ((PREP (\#IN))) FEATURES (PREP PLACE))

(DEFS IS IRREGULAR (BE (V3PS PRESENT) (INF)))

(DEFS IT
      SEMANTICS
      ((PRON (SMIT 'IT)))
      FEATURES
      (PRON NS SUBJ OBJ))

(DEFS ITS IRREGULAR (IT (POSS) NIL))

(DEFS KNOW FEATURES (VB INF TRANS REPOB))

(DEFS LARGE
      SEMANTICS
      ((MEASURE  (MEASURE DIMENSION\:
                  \#SIZE
                  RESTRICTIONS\:
                  (\#PHYSOB)
                  DIRECTION\:
                  T))
       (ADJ (OBJECT
             (MARKERS\: (\#PHYSOB \#BIG)
              PROCEDURE\:
              ((\#MORE \#SIZE
                     ***
                     (128. 128.
                          128.)))))))

      FEATURES
      (ADJ))

(DEFS LEAST
      SEMANTICS
      ((NUMD (LIST '> (- NUM 1))))
      FEATURES
      (NUMD NUMDAT))

(DEFS LEFT
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#DIRECTION)
                     PROCEDURE\:
                     ((\#DIRECTION \#RIGHT NIL))))))
      FEATURES
      (NOUN NS))

(DEFS LESS
      SEMANTICS
      ((NUMD (LIST '< NUM)))
      FEATURES
      (NUMD NUMDAN))

(DEFS LIKE
      SEMANTICS
      ((VB ((TRANS (RELATION
                    (RESTRICTIONS\: (((\#ANIMATE))
                                     ((\#THING)))
                           PROCEDURE\:
                           ((\#LIKE \#1 \#2))))))))
      FEATURES
      (VB INF TRANS))

(DEFS LIST SEMANTICS ((VB ((TRANS (\#NAME))))) FEATURES (VB VO TRANS))

(DEFS LITTLE
      SEMANTICS
      ((MEASURE  (MEASURE DIMENSION\:
                  \#SIZE
                  RESTRICTIONS\:
                  (\#PHYSOB)
                  DIRECTION\:
                  NIL))
       (ADJ (OBJECT
             (MARKERS\: (\#PHYSOB \#LITTLE)
              PROCEDURE\:
              ((\#MORE \#SIZE
                     (128. 128. 128.)
                     ***))))))
      FEATURES
      (ADJ))

(DEFS LONG
      SEMANTICS
      ((MEASURE  (MEASURE DIMENSION\:
                  \#LENGTH
                  RESTRICTIONS\:
                  (\#PHYSOB)
                  DIRECTION\:
                  T))
       (ADJ (OBJECT
             (MARKERS\: (\#PHYSOB)
              PROCEDURE\:
              ((\#MORE \#LENGTH
                     ***
                     (128. 128. 128.)))))))
      FEATURES
      (ADJ))

(DEFS MAKE
      SEMANTICS
      ((VB ((TRANS (\#BUILD)))))
      FEATURES
      (VB INF TRANS))

(DEFS MANY
      SEMANTICS
      ((NUMD (LIST '> (- NUM 1))) (DET T))
      FEATURES
      (DET QNTFR NPL NONUM NUMD NUMDAS))

(DEFS ME IRREGULAR (I (OBJ) (SUBJ)))

(DEFS MORE
      SEMANTICS
      ((NUMD (LIST '> NUM)))
      FEATURES
      (NUMD NUMDAN))

(DEFS MOST
      SEMANTICS
      ((NUMD (LIST '< (+ 1 NUM))))
      FEATURES
      (NUMD NUMDAT DET QNTFR NPL NONUM))

(DEFS MOVE
      SEMANTICS
      ((VB ((TRANS (RELATION
                    (RESTRICTIONS\: (((\#ANIMATE))
                                     ((\#PHYSOB)))
                           PROCEDURE\:
                           ((\#PUT \#2 ? *TIME))
                           MARKERS\:
                           (\#MOTION)))))))
      FEATURES
      (VB INF TRANS))

(DEFS MY IRREGULAR (I (POSS) (SUBJ)))

(DEFS NAME
      SEMANTICS
      ((NOUN (OBJECT
              ((\#NAME \#ROLE) ((IS *** \#NAME)
                                (\#CALL ? ***)
                                (\#ROLE (\#THING)
                                       (\#CALL \#2 \#1))))))
       (VB ((TRANS (\#NAME)))))
      FEATURES
      (NOUN NS VB INF TRANS))

(DEFS NARROW
      SEMANTICS
      ((ADJ (OBJECT
             (MARKERS\: (\#PHYSOB)
                    PROCEDURE\:
                    ((\#MORE \#WIDTH (128. 0. 0.) ***)))))

       (MEASURE (MEASURE DIMENSION\:
                 \#WIDTH
                 RESTRICTIONS\:
                 (\#PHSYOB)
                 DIRECTION\:
                 NIL)))
      FEATURES
      (ADJ))

(DEFS NEITHER FEATURES (B-SPECIAL) SEMANTICS T B-SPECIAL (BOTH NOR))

(DEFS NICE
      SEMANTICS
      ((ADJ (OBJECT
             (MARKERS\: (\#THING)
                    PROCEDURE\:
                    ((\#LIKE \:FRIEND ***))))))
      FEATURES
      (ADJ))

(DEFS NO SEMANTICS ((DET 'NO)) FEATURES (DET QNTFR NS NPL))

(DEFS NONE
      SEMANTICS
      ((DET 'NO))
      FEATURES
      (DET QNTFR NPL NS NONUM))

(DEFS NOR FEATURES (SPECIAL) SEMANTICS T SPECIAL (CONJ))

(DEFS NOT SEMANTICS ((ADV T)) FEATURES (ADV NEG))

(DEFS NOTHING SEMANTICS ((TPRON 'NO)) FEATURES (TPRON NEG NS))

(DEFS NOW
      SEMANTICS
      ((ADV (OR  (EQ (CADR (ASSQ 'TIME FE)) ":NOW")
             (ERT NOW DEFINITION))))
      FEATURES
      (ADV TIMW))

(DEFS OBJECT
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#PHYSOB \#VAGUE)
                     PROCEDURE\:
                     ((\#PHYSOB ***))))))
      FEATURES
      (NOUN NS))

(DEFS OF
      SEMANTICS
      ((PREP
        (AND
         (CQ NG)
         (RELATION
           (RESTRICTIONS\: (((\#DIRECTION)) ((\#PHYSOB)))
                  PROCEDURE\:
                  ((\#EVAL
                        (LIST
                                    '\#DIRECTION
                                    (CADR
                                          (SETQ
                                                 XX
                                                      (OR
                                                              (ASSQ '\#DIRECTION
                                                                       (CDDAAR (INTERP MAP1)))
                                                              (ERT OF DEFINITION))))
                                    (COND ((CADDR XX) '*OF)
                                          ('\#2))
                                    (COND ((CADDR XX) '\#2)
                                          ('*OF))
                                    '*TIME)))))))
       (PREP2 T))
      FEATURES
      (PREP PREP2 OF))

(DEFS OFF SEMANTICS ((PRT T)) FEATURES (PRT))

(DEFS ON SEMANTICS ((PREP (\#ON))) FEATURES (PREP PLACE))

(DEFS ON-TOP-OF
      ROOT
      (ON TOP OF)
      SEMANTICS
      (\#ON)
      FEATURES
      (PREP COMBINATION))

(DEFS ONE SEMANTICS ((NOUN (SMONE)) (NUM 1.)) FEATURES (NUM NOUN NS))

(DEFS ONLY
      SEMANTICS
      ((NUMD (LIST 'EXACTLY NUM)))
      FEATURES
      (NUMD NUMDALONE))

(DEFS ONTO SEMANTICS ((PREP (\#ON))) FEATURES (PREP PLACE))

(DEFS OR FEATURES (SPECIAL) SEMANTICS T SPECIAL (CONJ))

(DEFS OUT SEMANTICS ((PRT T)) FEATURES (PRT))

(DEFS OUT-OF
      ROOT
      (OUT OF)
      SEMANTICS
      (\#OUTOF)
      FEATURES
      (PREP COMBINATION))

(DEFS OVER SEMANTICS ((PREP (\#LOC \#ABOVE T))) FEATURES (PREP PLACE))

(DEFS PICK
      SEMANTICS
      ((VB ((TRANS (\#NOTICE)))))
      FEATURES
      (VPRT VB INF TRANS))

(DEFS PICK-UP
      ROOT
      (PICK UP)
      SEMANTICS
      ((TRANS
        (RELATION
         (RESTRICTIONS\: (((\#ANIMATE)) ((\#MANIP)))
           MARKERS\:
           (\#EVENT)
           PROCEDURE\:
           ((\#EVAL (COND ((MEMQ (NUMBER? SMOB1)
                            '(1. NS))
                           '(\#PICKUP \#2 *TIME))
                     ('(\#PUTIN
                              \#2
                              \:BOX
                              *TIME)))))))))
      FEATURES
      (COMBINATION TRANS))

(DEFS PLEASE FEATURES (B-SPECIAL) SEMANTICS T B-SPECIAL (FLUSHME))

(DEFS POINTED
      SEMANTICS
      ((ADJ (OBJECT
             (MARKERS\: (\#PHYSOB \#POINTED)
                    PROCEDURE\:
                    ((\#SHAPE *** \#POINTED))))))
      FEATURES
      (ADJ))

(DEFS PUT
      PAST
      PUT
      SEMANTICS
      ((VB
        ((TRANSL
          (RELATION
            (RESTRICTIONS\: (((\#ANIMATE))
                             ((\#PHYSOB))
                             (SMOBL (\#PLACE)))
                   MARKERS\:
                   (\#EVENT)
                   PROCEDURE\:
                   (\#EVAL
                        (MAPCAR
                                    #'(LAMBDA (%PLNRPHRASE)
                                           (COND ((EQ  (CAR %PLNRPHRASE)
                                                   '\#ON)
                                                  (LIST '\#PUTON
                                                          '\#2
                                                          (CADR %PLNRPHRASE)
                                                          '*TIME))
                                                 ((EQ  (CAR %PLNRPHRASE)
                                                       '\#IN)
                                                  (LIST '\#PUTIN
                                                          '\#2
                                                          (CADR %PLNRPHRASE)
                                                          '*TIME))
                                                 ((ERT PUT DEFINITION))))
                                    (RELATIONS? SMOBL)))))))))
      FEATURES
      (INF PAST VB TRANSL VPRT))

(DEFS PUT-AWAY
      ROOT
      (PUT AWAY)
      SEMANTICS
      ((TRANS (RELATION
               (RESTRICTIONS\: (((\#ANIMATE)) ((\#MANIP)))
                     MARKERS\:
                     (\#EVENT)
                     PROCEDURE\:
                     ((\#PUTIN \#2 \:BOX *TIME))))))
      FEATURES
      (COMBINATION TRANS))

(DEFS PUT-DOWN
      ROOT
      (PUT DOWN)
      SEMANTICS
      ((TRANS (RELATION
               (RESTRICTIONS\: (((\#ANIMATE)) ((\#MANIP)))
                     MARKERS\:
                     (\#EVENT)
                     PROCEDURE\:
                     ((\#PUTON \#2 :TABLE *TIME))))))
      FEATURES
      (COMBINATION TRANS))

(DEFS PUT-TOGETHER
      ROOT
      (PUT TOGETHER)
      SEMANTICS
      ((TRANS (\#BUILD)))
      FEATURES
      (COMBINATION TRANS))

(DEFS PYRAMID
      FEATURES
      (NOUN NS)
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#PHYSOB \#POINTED)
                     PROCEDURE\:
                     ((\#IS *** \#PYRAMID)))))))

(DEFS RED SEMANTICS ((ADJ (\#COLOR \#RED))) FEATURES (ADJ))

(DEFS RELEASE FEATURES (VB TRANS INF))

(DEFS RIGHT
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#DIRECTION)
                     PROCEDURE\:
                     ((\#DIRECTION \#RIGHT T))))))
      FEATURES
      (NOUN NS))

(DEFS ROUND
      SEMANTICS
      ((ADJ (OBJECT
             (MARKERS\: (\#PHYSOB \#ROUND)
                    PROCEDURE\:
                    ((\#SHAPE *** \#ROUND))))))
      FEATURES
      (ADJ))

(DEFS SAW IRREGULAR (SEE (PAST) (INF)))

(DEFS SEE FEATURES (VB INF TRANS))

(DEFS SET SEMANTICS ((VB T)) FEATURES (VB INF))

(DEFS SET-DOWN
      ROOT
      (SET DOWN)
      SEMANTICS
      ((TRANS (RELATION
               (RESTRICTIONS\: (((\#ANIMATE)) ((\#MANIP)))
                     MARKERS\:
                     (\#EVENT)
                     PROCEDURE\:
                     ((\#PUTON \#2 :TABLE *TIME))))))
      FEATURES
      (COMBINATION TRANS))

(DEFS SHAPE
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#SHAPE)
                     PROCEDURE\:
                     ((\#IS *** \#SHAPE))))))
      FEATURES
      (NOUN NS))

(DEFS SHE FEATURES (PRON SUBJ NS))

(DEFS SHORT
      SEMANTICS
      ((MEASURE  (MEASURE DIMENSION\:
                  \#HEIGHT
                  RESTRICTIONS\:
                  (\#PHYSOB)
                  DIRECTION\:
                  NIL))
       (ADJ (OBJECT
             (MARKERS\: (\#PHYSOB)
              PROCEDURE\:
              ((\#MORE \#HEIGHT
                     (128. 0. 0.)
                     ***))))))
      FEATURES
      (ADJ))

(DEFS SHRDLU REFER \:SHRDLU)

(DEFS SINCE SEMANTICS ((BINDER (SMBINDER END NIL))) FEATURES (BINDER TIME))

(DEFS SIT
      SEMANTICS
      ((VB
        ((ITRNSL
          (RELATION
            (RESTRICTIONS\: (((\#PHYSOB))
                             (SMOBL (\#PLACE)))
                   PROCEDURE\:
                   (\#EVAL
                        (MAPCAR
                                    #'(LAMBDA (%PLNRPHRASE)
                                           (COND ((MEMQ (CAR %PLNRPHRASE)
                                                   '(\#ON \#IN))
                                                  (LIST '\#SUPPORT
                                                          (CADR %PLNRPHRASE)
                                                          '\#1
                                                          '*TIME))
                                                 ((ERT SIT DEFINITION))))
                                    (RELATIONS? SMOBL)))))))))
      FEATURES
      (VB INF ITRNSL))

(DEFS SIZE
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#SIZE)
                     PROCEDURE\:
                     ((\#IS *** \#SIZE))))))
      FEATURES
      (NOUN NS))

(DEFS SMALL
      SEMANTICS
      ((MEASURE  (MEASURE DIMENSION\:
                  \#SIZE
                  RESTRICTIONS\:
                  (\#PHYSOB)
                  DIRECTION\:
                  NIL))
       (ADJ (OBJECT
             (MARKERS\: (\#PHYSOB \#LITTLE)
              PROCEDURE\:
              ((\#MORE \#SIZE
                     (128. 128. 128.)
                     ***))))))
      FEATURES
      (ADJ))

(DEFS SOME
      SEMANTICS
      ((DET 'INDEF))
      FEATURES
      (DET QNTFR NS NPL NONUM))

(DEFS SOMETHING SEMANTICS ((TPRON 'INDEF)) FEATURES (TPRON NS))

(DEFS SPHERE FEATURES (NOUN NS))

(DEFS SQUARE
      SEMANTICS
      ((ADJ (OBJECT
             (MARKERS\: (\#PHYSOB \#RECTANGULAR)
                    PROCEDURE\:
                    ((\#SHAPE ** \#RECTANGULAR))))))
      FEATURES
      (ADJ))

(DEFS STACK
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#STACK)
                     PROCEDURE\:
                     ((\#IS *** \#STACK)))))
       (VB ((TRANS (\#STACKUP)))))
      FEATURES
      (NOUN NS VB INF VPRT TRANS))

(DEFS STACK-UP
      ROOT
      (STACK UP)
      SEMANTICS
      ((TRANS (\#STACKUP)))
      FEATURES
      (COMBINATION TRANS))

(DEFS START
      SEMANTICS
      ((VB
        ((TRANS
          (RELATION
            (RESTRICTIONS\: (((\#ANIMATE)) ((\#EVENT)))
                   MARKERS\:
                   (\#EVENT)
                   PROCEDURE\:
                   ((\#START \#2 *TIME))))))))
      FEATURES
      (VB INF TRANS INGOB1 TOOB1))

(DEFS SUPPORT
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#PHYSOB \#ROLE)
                     PROCEDURE\:
                     ((\#SUPPORT *** ?)
                      (\#ROLE (\#PHYSOB)
                            (\#SUPPORT \#1 \#2))))))
       (VB
        ((TRANS
           (RELATION
                    (RESTRICTIONS\: (((\#PHYSOB)) ((\#MANIP)))
                           PROCEDURE\:
                           ((\#SUPPORT \#1 \#2 *TIME))))))))
      FEATURES
      (VB INF TRANS IMPERF NOUN NS))

(DEFS TABLE
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#TABLE)
                     PROCEDURE\:
                     ((\#IS *** \#TABLE))))))
      FEATURES
      (NOUN NS))

(DEFS TAKE FEATURES (VB INF TRANSL TRANS))

(DEFS TALL
      SEMANTICS
      ((MEASURE  (MEASURE DIMENSION\:
                  \#HEIGHT
                  RESTRICTIONS\:
                  (\#PHYSOB)
                  DIRECTION\:
                  T))
       (ADJ (OBJECT
             (MARKERS\: (\#PHYSOB)
              PROCEDURE\:
              ((\#MORE \#HEIGHT
                     ***
                     (128. 0.
                          0.)))))))

      FEATURES
      (ADJ))

(DEFS TELL
      SEMANTICS
      ((VB
        ((TRANS (RELATION
                 (RESTRICTIONS\: (((\#ANIMATE))
                                  ((\#EVENT)))
                        MARKERS\:
                        (\#EVENT)
                        PROCEDURE\:
                        ((\#WANT \#1 \#2 *TIME))))))))
      FEATURES
      (VB INF TRANS2 TOOB2))

(DEFS THAN SEMANTICS ((NULL T)) FEATURES (THAN))

(DEFS THANK FEATURES (B-SPECIAL) SEMANTICS (THANK) B-SPECIAL (THANK))

(DEFUN THANK  NIL
      (COND ((EQ (CADR N) 'YOU)
             (SETQ GLOBAL-MESSAGE "YOU'RE WELCOME")
             (FLUSHME)
             (FLUSHME)
             (OR NN (SETQ SPECIAL 'DONE)))))

(DEFS THAT
      SEMANTICS
      ((PRONREL T) (DET (SMTHAT)) (NULL T))
      FEATURES
      (NS THAT DET DEM DEF PRONREL INCOM))

(DEFS THE SEMANTICS ((DET T)) FEATURES (DET NPL NS DEF))

(DEFS THEIR IRREGULAR (THEY (POSS) NIL))

(DEFS THEM IRREGULAR (THEY (OBJ) (SUBJ)))

(DEFS THEN
      SEMANTICS
      ((ADV
        (AND LASTIME
         (RPLACD (CDDADR (OR (AND (SETQ XX (ASSQ 'TIME
                                            FE))
                              (NOT (ATOM (CADR XX)))
                              XX)
                          '(TIME (\#TIME (PAST) NIL))))
             (LIST  (OR (CADDDR LASTIME)
                     (CAR (CDDDDR LASTIME)))
                (OR (CAR (CDDDDR LASTIME))
                    (CADDDR LASTIME)))))))
      FEATURES
      (ADV TIMW))

(DEFS THERE SEMANTICS ((ADV T)) FEATURES (ADV PLACE))

(DEFS THEY
      SEMANTICS
      ((PRON (SMIT 'THEY)))
      FEATURES
      (PRON SUBJ NPL))

(DEFS THICK
      SEMANTICS
      ((ADJ (OBJECT
             (MARKERS\: (\#PHYSOB)
                    PROCEDURE\:
                    ((\#MORE \#THICKNESS
                          ***
                          (0. 128.
                            0.))))))

       (MEASURE (MEASURE DIMENSION\:
                 \#THICKNESS
                 RESTRICTIONS\:
                 (\#PHYSOB)
                 DIRECTION\:
                 T)))
      FEATURES
      (ADJ))

(DEFS THIN
      SEMANTICS
      ((ADJ (OBJECT
             (MARKERS\: (\#PHYSOB)
                    PROCEDURE\:
                    ((\#MORE \#THICKNESS
                          (0. 128. 0.)
                          ***)))))
       (MEASURE (MEASURE DIMENSION\:
                 \#THICKNESS
                 RESTRICTIONS\:
                 (\#PHYSOB)
                 DIRECTION\:
                 NIL)))
      FEATURES
      (ADJ))

(DEFS THING
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#THING \#VAGUE \#PHYSOB)
                     PROCEDURE\:
                     ((\#PHYSOB ***))))))
      FEATURES
      (NOUN NS))

(DEFS THIS FEATURES (NS DET DEM DEF))

(DEFS THREE SEMANTICS ((NUM 3.)) FEATURES (NUM))

(DEFS TIME FEATURES (NOUN NS TIM1))

(DEFS TO
      SEMANTICS
      ((PREP
        (RELATION
         (RESTRICTIONS\: (((\#PHYSOB)) ((\#DIRECTION)))
           PROCEDURE\:
           ((\#EVAL
                (SUBST '\#1
                      '*OF
                      (REFER? SMOB1))))))))
      FEATURES
      (PREP))

(DEFS TOGETHER SEMANTICS ((PRT T)) FEATURES (PRT))

(DEFS TOLD IRREGULAR (TELL (PAST) (INF)))

(DEFS TOP SEMANTICS ((PREP2 T)) FEATURES (PREP2))

(DEFS TOUCH
      SEMANTICS
      ((VB ((TRANS (\#GRASP)))))
      FEATURES
      (VB INF TRANS))

(DEFS TOY
      SEMANTICS
      ((NOUN (OBJECT
              (MARKERS\: (\#PHYSOB)
                     PROCEDURE\:
                     ((\#MANIP ***))))))
      FEATURES
      (NOUN NS))

(DEFS TWO SEMANTICS ((NUM 2.)) FEATURES (NUM))

(DEFS UNDER
      SEMANTICS
      ((PREP (\#LOC \#ABOVE NIL)))
      FEATURES
      (PREP PLACE))

(DEFS UNDERNEATH
      SEMANTICS
      ((PREP ((\#LOC \#ABOVE NIL))))
      FEATURES
      (PREP PLACE))

(DEFS UP SEMANTICS ((PRT T)) FEATURES (PRT))

(DEFS US IRREGULAR (WE (OBJ) (SUBJ)))

(DEFS WANT
      SEMANTICS
      ((VB
        ((TRANS (RELATION
                 (RESTRICTIONS\: (((\#ANIMATE))
                                  ((\#EVENT)))
                        MARKERS\:
                        (\#EVENT)
                        PROCEDURE\:
                        ((\#WANT \#1 \#2 *TIME))))))))
      FEATURES
      (VB INF TRANS TOOB SUBTOB))

(DEFS WAS IRREGULAR (BE (V3PS VFS PAST) (INF)))

(DEFS WE
      SEMANTICS
      ((PRON (SMSET (LIST (NEWCOPY 'WE-OSS)))))
      FEATURES
      (PRON NPL SUBJ))

(DEFS WERE IRREGULAR (BE (VPL PAST) (INF)))

(DEFS WHAT
      SEMANTICS
      ((DET T) (PRON (SMSET (LIST (NEWCOPY 'UNKNOWN-OSS)))))
      FEATURES
      (QDET DET NPL PRON QPRON NS))

(DEFS WHATEVER FEATURES (PRON EVERPRON NS))

(DEFS WE REFER (\:SHRDLU \:FRIEND))

(DEFS WHERE SEMANTICS ((QADJ (FQ WHERE))) FEATURES (QADJ PLACE))

(DEFS WHEREVER FEATURES (PRON EVERPRON NS))

(DEFS WHEN
      SEMANTICS
      ((BINDER (SMBINDER START END)) (QADJ (FQ WHEN)))
      FEATURES
      (QADJ BINDER TIME))

(DEFS WHENEVER FEATURES (BINDER))

(DEFS WHICH
      SEMANTICS
      ((PRONREL T) (DET T))
      FEATURES
      (QDET DET PRONREL NS NPL))

(DEFS WHICHEVER FEATURES (DET RSQDET NS NPL))

(DEFS WHILE SEMANTICS ((BINDER (SMBINDER START END))) FEATURES (BINDER TIME))

(DEFS WHITE SEMANTICS ((ADJ (\#COLOR \#WHITE))) FEATURES (ADJ))

(DEFS WHO
      SEMANTICS
      ((PRONREL T)
       (PRON (SMSET (LIST (NEWCOPY ANIMATE-OSS)))))
      FEATURES
      (PRONREL QPRON PRON NS))

(DEFS WHOEVER FEATURES (PRON EVERPRON NS))

(DEFS WHOSE FEATURES (DET QDET NPL NS))

(DEFS WHY SEMANTICS ((QADJ (FQ WHY))) FEATURES (QADJ))

(DEFS WHYEVER FEATURES (PRON EVERPRON NS))

(DEFS WIDE
      SEMANTICS
      ((ADJ (OBJECT
             (MARKERS\: (\#PHYSOB)
                    PROCEDURE\:
                    ((\#MORE \#WIDTH *** (0. 128. 0.))))))

       (MEASURE (MEASURE DIMENSION\:
                 \#WIDTH
                 RESTRICTIONS\:
                 (\#PHYSOB)
                 DIRECTION\:
                 T)))
      FEATURES
      (ADJ))

(DEFS WILL SEMANTICS ((VB T)) FEATURES (VB AUX WILL MODAL V3PS VFS VPL))

(DEFS WITH FEATURES (PREP))

(DEFS WOULD SEMANTICS ((VB T)) FEATURES (VB AUX MODAL))

(DEFS YOU
      SEMANTICS
      ((PRON (SMSET (LIST (NEWCOPY 'SHRDLU-OSS)))))
      FEATURES
      (PRON NPL NS SUBJ OBJ))

(DEFS YOUR IRREGULAR (YOU (POSS) NIL))



;;;============================================================
;;;
;;;                         #WORDS
;;;
;;;============================================================

(DEFS \#ANIMATE SYSTEM (\#ROBOT \#PERSON) SYS (\#THING))

(DEFS \#ASMUCH THMLIST ((4. '((THUSE TC-ASMUCH)))))

(DEFS \#BELONG THMLIST ((3. '((THUSE TC-BELONG)))))

(DEFS \#BLACK SYS (\#SPECTRUM))

(DEFS \#BLUE SYS (\#SPECTRUM))

(DEFS \#BLUEPRINT
      EXPR
      (LAMBDA (X)
       (PROG (PARTS)
        (COND  ((G3T X 'REFER) (RETURN '\#2))
          ((NULL (SETQ X (CDDAAR (INTERP X))))
           (GO DONE)))
        LOOP
        (COND  ((NOT (EQ (CAAR X) 'THGOAL))
                (ERT BLUEPRINT THGOAL))
          ((EQ (CAADAR X) '\#IS))
          ((EQ (CAADAR X) '\#PART)
           (SETQ PARTS
                   (CONS (CADR (CADAR X)) PARTS)))
          ((ERT \#BLUEPRINT)))
        (AND (SETQ X (CDR X)) (GO LOOP))
        DONE
        (AND PARTS
               (G3T (CAR PARTS) 'REFER)
               (RETURN (G3T (CAR PARTS) 'REFER)))
        (S3TF 'BLUEPRINT 'SM
            (COND  ((NULL PARTS)
                    (G3T  'STACKPARTS
                         'SM))
               ((CDR PARTS)
                (ERT \#BLUEPRINT PARTS))
               ((G3T (CAR PARTS) 'SM))))
        (RETURN 'BLUEPRINT))))

(DEFS \#BOX SYS (\#PHYSOB))

(DEFS \#BUILD
      EXPR
      (LAMBDA NIL
       (RELATION
        (RESTRICTIONS\: (((\#ANIMATE)) ((\#STACK)))
          MARKERS\:
          (\#EVENT)
          PROCEDURE\:
          ((\#EVAL (LIST '\#STACKUP
                    (\#BLUEPRINT SMOB1)
                    '*TIME)))))))

(DEFS \#CALL THMLIST ((3. '((THUSE TC-3)))))

(DEFS \#COLOR
      FEXPR
      (LAMBDA (A)
       (EVAL (SUBST (CAR A)
              'COLOR
              '(OBJECT
                   (MARKERS\:
                       (\#PHYSOB COLOR)
                       PROCEDURE\:
                       ((\#COLOR *** COLOR)))))))
      PRIORITY
      192.
      SYS
      (\#PROPERTY))

(DEFS \#CONSTRUCT SYSTEM (\#STACK \#ROW) SYS (\#PHYSOB))

(DEFS \#CONTAIN PRIORITY -1.)

(DEFS \#CLEANOFF
      EXPR
      (LAMBDA NIL
       (RELATION
        (RESTRICTIONS\: (((\#ANIMATE)) ((\#PHYSOB)))
          MARKERS\:
          (\#EVENT)
          PROCEDURE\:
          ((\#CLEARTOP \#2 *TIME))))))

(DEFS \#CLEARTOP
      NAMEVENT
      (I3 (CONS  (VBFIX 'CLEAN NIL)
           (PRTPUT 'OFF OBJ1)))
      THMLIST
      ((2. '((THUSE TC-2))) (3. '((THUSE TCT-3)))
          (4. '((THUSE TCTE-4)))))

(DEFS \#DEFINE
      EXPR
      (LAMBDA (X Y)
       (LIST '\#DEFINITION
        (CADADR (CDAAR (INTERP X)))
        (PROG  (X)
          (S3TF (SETQ X (MAKESYM 'ATM)) 'NEWWORD
               (INTERP Y))
          (RETURN X)))))

(DEFS \#DEFINITION
      FEXPR
      (LAMBDA (A)
       (S3TF (CADAR A) 'WORD '(NOUN NS))
       (S3TF (CADAR A) 'SMNTC
        (SUBST (SUBST '***
                (CADDR (G3T (CADR A) 'NEWWORD))
                (CAR (G3T (CADR A) 'NEWWORD)))
           'NG
           '((NOUN
                 (SETQ
                     LIST2
                     (LIST
                      (SUBST
                           (SUBST
                                (CADDAR LIST1)
                                '***
                                'NG)
                           (CAAR LIST1)
                           (CAR LIST1)))))))))
      NOGOAL
      T)

(DEFS \#DIRECTION
      ;; FEXPR (LAMBDA (A B) NIL)
      FEXPR
      (LAMBDA (A) NIL)
      ;; fixed, was (A B), but that's not FEXPR-ish.
      NOGOAL
      T)

(DEFS \#END
      THMLIST
      ((3. '((THUSE TC-STARTEND3)))
       (4. '((THUSE TC-STARTEND4)))))

(DEFS \#EQDIM
      EXPR
      (LAMBDA (X)
       (SETQ X (SIZE X))
       (AND (EQ (CAR X) (CADR X)) (EQ (CAR X) (CADDR X))))
      NOGOAL
      T)

(DEFS \#EQUIV PRIORITY 512.)

(DEFS \#EVENT SYS (\#SYSTEMS))

(DEFS \#EXISTS
      THMLIST
      ((2. '((THUSE TC-EXISTS)))
       (3. '((THUSE TCT-EXISTS)))))

(DEFS \#GET-RID-OF
      THMLIST
      ((2. '((THUSE TCT-EXISTS)))
       (3. '((THUSE THUSE TCT-3)))
       (4. '((THUSE TCTE-4))))
      NAMEVENT
      (I3 (APPEND (LIST (VBFIX 'GET T) 'RID 'OF)
           OBJ1)))

(DEFS \#GRASP
      EXPR
      (LAMBDA NIL
       (RELATION
        (RESTRICTIONS\: (((\#ANIMATE)) ((\#MANIP)))
          MARKERS\:
          (\#EVENT)
          PROCEDURE\:
          ((\#EVAL (COND ((IMPERF)
                          '(\#GRASPING \#2 *TIME))
                    ('(\#GRASP \#2 *TIME))))))))
      NAMEVENT
      (I3 (CONS (VBFIX 'GRASP NIL) OBJ1))
      THMLIST
      ((2. '((THUSE TC-2))) (3. '((THUSE TCT-3)))
          (4. '((THUSE TCTE-4)))))

(DEFS \#GRASPING THMLIST ((3. '((THUSE TCT-GRASPING)))))

(DEFS \#GREEN SYS (\#SPECTRUM))

(DEFS \#HAND SYS (\#PHYSOB))

(DEFS \#HAVE
      EXPR
      (LAMBDA NIL
       (RELATION
        (RESTRICTIONS\: (((\#THING))
                         ((\#THING)
                          (AND
                               (MEMQ '\#ROLE (MARKERS? SMOB1))
                               (CHECK
                                     (CADR  (ASSOC '\#ROLE
                                                    (RELATIONS? SMOB1)))
                                     (MARKERS? SMSUB)
                                     (SYSTEMS? SMSUB)))))
          PROCEDURE\:
          ((\#SUBST \#1 ?)))
        (RESTRICTIONS\: (((\#ANIMATE)) ((\#PHYSOB)))
          PROCEDURE\:
          ((\#BELONG \#2 \#1))))))

(DEFS \#HEIGHT MEASFN (LAMBDA (X) (CADDR (SIZE X))))

(DEFS \#IN
      EXPR
      (LAMBDA ()
       (COND ((CQ LOBJ)
              (RELATION
                (RESTRICTIONS\: (((\#THING)) ((\#BOX)))
                       MARKERS\:
                       (\#PLACE)
                       PROCEDURE\:
                       ((\#IN \#2)))))
        ((RELATION
           (RESTRICTIONS\: (((\#MANIP)) ((\#BOX)))
                  PROCEDURE\:
                  ((\#CONTAIN \#2 \#1 *TIME)))
           (RESTRICTIONS\: (((\#MANIP)) ((\#HAND)))
                  PROCEDURE\:
                  ((\#GRASPING \#1 *TIME)))
           (RESTRICTIONS\: (((\#PLACE)) ((\#BOX)))
                  PROCEDURE\:
                  ((\#IN \#1 \#2)))
           (RESTRICTIONS\: (((\#MANIP))
                            ((\#CONSTRUCT)))
                  PROCEDURE\:
                  ((\#PART \#1 \#2 *TIME))))))))

(DEFS \#IS PRIORITY 64.)

(DEFS \#LIKE TELLABLE T THMLIST ((3. '((THTBF THTRUE)))))

(DEFS \#LOC
      THMLIST
      ((4. '((THUSE TC-LOC))) (5. '((THUSE TCT-LOC))))
      FEXPR
      (LAMBDA (A) (\#LOC2 (CAR A) (CADR A))))

(DEFS \#LOC2
      EXPR
      (LAMBDA (LOCTYPE \#LOC)
       (DECLARE (SPECIAL LOCTYPE \#LOC))
       (COND
        ((CQ LOBJ)
         (RELATION
           (RESTRICTIONS\: (((\#THING)) (LOBJ (\#PHYSOB)))
                  MARKERS\:
                  (\#PLACE)
                  PROCEDURE\:
                  ((\#EVAL (LIST  '\#LOC
                            LOCTYPE
                            \#LOC
                            \#2))))))
        ((RELATION
           (RESTRICTIONS\: (((\#PHYSOB)) ((\#PHYSOB)))
                  PROCEDURE\:
                  ((\#EVAL (LIST  '\#LOC
                            LOCTYPE
                            (COND (\#LOC '\#1)
                                  ('\#2))
                            (COND (\#LOC '\#2)
                                  ('\#1))
                            '*TIME)))))))))

(DEFS \#MANIP SYS (\#PHYSOB))

(DEFS \#MORE THMLIST ((4. '((THUSE TC-MORE)))))

(DEFS \#NAME
      THMLIST
      ((2. '((THUSE TC-2))))
      EXPR
      (LAMBDA NIL
       (RELATION
        (RESTRICTIONS\: (((\#ANIMATE)) ((\#PHYSOB)))
          MARKERS\:
          (\#EVENT)
          PROCEDURE\:
          ((\#NAME \#2)))))
      SYS
      (\#SYSTEMS))

(DEFS \#NEWWORD SYS (\#THING))

(DEFS \#NOTICE
      THMLIST
      ((2. '((THUSE TC-2))))
      EXPR
      (LAMBDA NIL
       (RELATION
        (RESTRICTIONS\: (((\#ANIMATE)) ((\#PHYSOB)))
          MARKERS\:
          (\#EVENT)
          PROCEDURE\:
          ((\#NOTICE \#2 *TIME))))))

(DEFS \#ON
      THMLIST
      ((3. '((THUSE TC-ON))) (4. '((THUSE TCT-ON))))
      EXPR
      (LAMBDA NIL
       (COND ((CQ LOBJ)
              (RELATION
                (RESTRICTIONS\: (((\#THING)) ((\#PHYSOB)))
                       MARKERS\:
                       (\#PLACE)
                       PROCEDURE\:
                       ((\#ON \#2)))))
        ((RELATION
           (RESTRICTIONS\: (((\#PHYSOB))
                            ((\#PHYSOB)))
                  PARAPHRASE\:
                  (ANYWHERE ON TOP OF)
                  PROCEDURE\:
                  ((\#ON \#1 \#2 *TIME)))
           (RESTRICTIONS\: (((\#PHYSOB)) ((\#MANIP)))
                  PARAPHRASE\:
                  (DIRECTLY ON THE SURFACE)
                  PROCEDURE\:
                  ((\#SUPPORT \#2 \#1 *TIME)))
           (RESTRICTIONS\: (((\#PLACE)) ((\#PHYSOB)))
                  PROCEDURE\:
                  ((\#ON \#1 \#2))))))))

(DEFS \#PACK THMLIST ((3. '((THUSE TC-3)))))

(DEFS \#PART THMLIST ((3. '((THUSE TC-PART))))) ;PERFORMED ON GRADUATION DAY, JUNE 2, 1972 BY JMH


(DEFS \#PERSON SYS (\#ANIMATE))

(DEFS \#PICKUP
      THMLIST
      ((2. '((THUSE TC-2))) (3. '((THUSE TCT-PICKUP)))
          (4. '((THUSE TCTE-PICKUP))))
      NAMEVENT
      (I3 (CONS  (VBFIX 'PICK NIL)
           (PRTPUT 'UP OBJ1))))

(DEFS \#PLACE SYS (\#SYSTEMS))

(DEFS \#PUT
      THMLIST
      ((3. '((THUSE TCT-3)))
       (4. '((THUSE TCT-PUT)))
       (5. '((THUSE TCTE-PUT)))))

(DEFS \#PUTIN
      THMLIST
      ((3. '((THUSE TC-3))) (4. '((THUSE TCT-4)))
          (5. '((THUSE TCT-5)))))

(DEFS \#PUTON
      NAMEVENT
      (I4 (CONS  (VBFIX 'PUT T)
           (APPEND OBJ1 '(ON) OBJ2)))
      THMLIST
      ((3. '((THUSE TC-3))) (4. '((THUSE TCT-4))) (5. '((THUSE TCTE-5)))))


(DEFS \#RAISE THMLIST ((1. '((THUSE TC-RAISE)))))

(DEFS \#RECTANGULAR SYS (\#SHAPES))

(DEFS \#REFERS THMLIST ((2 '((THUSE TC-REFERS)))))

(DEFS \#ROLE FEXPR (LAMBDA (A) T) NOGOAL T)

(DEFS \#PHYSOB
      SYSTEM
      (\#BOX \#CONSTRUCT \#HAND \#MANIP \#TABLE)
      SYS
      (\#THING)
      THMLIST
      ((2. '((THUSE TC-PHYSOB)))))

(DEFS \#PROPDEFINE
      EXPR
      (LAMBDA (X)
       (S3TF X 'FEATURES '(PROPN NS)) ;CHANGED TO FEATURES FROM 'WORD' IN THE OLD
       (S3TF X 'SEMANTICS '((PROPN T))))) ;DICTIONARY

(DEFS \#PROPERTY SYSTEM (\#COLOR \#SIZE \#SHAPE) SYS (\#THING))

(DEFS \#POINTED SYS (\#SHAPES))

(DEFS \#RED SYS (\#SPECTRUM))

(DEFS \#RELATION SYS (\#SYSTEMS))

(DEFS \#ROLE FEXPR (LAMBDA (A) T) NOGOAL T)

(DEFS \#ROUND SYS (\#SHAPES))

(DEFS \#ROW SYS (\#CONSTRUCT))

(DEFS \#ROBOT SYS (\#ANIMATE))

(DEFS \#SIZE
      MEASFN
      (LAMBDA (X) (APPLY '+ (SIZE X)))
      SYS
      (\#PROPERTY))

(DEFS \#SHAPE PRIORITY 128. SYS (\#PROPERTY))

(DEFS \#STACK SYS (\#CONSTRUCT))

(DEFS \#STACKUP
      THMLIST
      ((2. '((THUSE TC-2))))
      EXPR
      (LAMBDA NIL
       (RELATION
        (RESTRICTIONS\: (((\#ANIMATE)) ((\#MANIP)))
          MARKERS\:
          (\#EVENT)
          PROCEDURE\:
          ((\#STACKUP \#2 *TIME)))))
      NAMEVENT
      (I3 (CONS  (VBFIX 'STACK NIL)
           (PRTPUT 'UP OBJ1))))

(DEFS \#START
      THMLIST
      ((3. '((THUSE TC-STARTEND3)))
       (4. '((THUSE TC-STARTEND4)))))

(DEFS \#SUBST NOGOAL T)

(DEFS \#SUPPORT
      PRIORITY
      256.
      THMLIST
      ((3. NIL) (4. '((THUSE TCT-SUPPORT)))))

(DEFS \#SYSTEMS SYSTEM (\#THING \#EVENT \#NAME \#RELATION \#PLACE))

(DEFS \#TABLE SYS (\#PHYSOB))

(DEFS \#THICKNESS MEASFN (LAMBDA (X) (CADR (SIZE X))))

(DEFS \#THING SYS (\#SYSTEMS) SYSTEM (\#ANIMATE \#NAME \#PHYSOB \#PROPERTY))

(DEFS \#UNGRASP
      THMLIST
      ((1. '((THUSE TC-UNGRASP))))
      NAMEVENT
      (I3 (APPEND (LIST (VBFIX 'LET T) 'GO 'OF)
           OBJ1)))

(DEFS \#WANT
      THMLIST
      ((4. '((THUSE TC-WANT4))) (5. '((THUSE TC-WANT5)))))

(DEFS \#WHITE SYS (\#SPECTRUM))

(DEFS \#WIDTH MEASFN (LAMBDA (X) (CAR (SIZE X))))



;;;=============================================================
;;;
;;;                    PARTS OF SPEECH
;;;
;;;============================================================

(DEFS ADJ ELIM (ADJ SUP COMPAR))

(DEFS ADV ELIM (ADV PREPADV TIMW TIM2 ADVADV VBAD PLACE LOBJ))

(DEFS BINDER ELIM (BINDER TIME))

(DEFS CLASF ELIM (CLASF))

(DEFS DET
      ELIM
      (DET NPL NS PART DEF INDEF NEG DEM INCOM OFD QNTFR NONUM QDET))

(DEFS NOUN ELIM (NOUN POSS MASS NPL NS TIM1 TIME MONTH))

(DEFS NUM ELIM (NUM NPL NS))

(DEFS NUMD ELIM (NUMD NUMDAN NUMDAT NUMDALONE))

(DEFS ORD ELIM (ORD TIMORD))

(DEFS POSS ELIM (NOUN NPL NS MASS NFS PRON))

(DEFS PREP ELIM (PREP MOTOR PLACE NEED2))

(DEFS PREP2 ELIM (PREP2))

(DEFS PRON
      ELIM
      (PRON QPRON EVERPRON POSS SUBJ OBJ NS NPL NFS NEG DEFPOSS))

(DEFS PRT ELIM (PRT))

(DEFS QADJ ELIM (PLACE QADJ))

(DEFS PROPN ELIM (PROPN POSS NS NPL))

(DEFS TPRON ELIM (TPRON NS NPL NEG ANY))

(DEFS VB
      ELIM
      (VB MVB AUX QAUX MODAL WILL BE DO  HAVE ING EN INF  V3PS QUOTING VFS VPL PAST PRESENT NEG ITRNS TRANS TRANSL TRANS2  TRANSL2  INT ITRNSL INGOB TOOB SUBTOB REPOB INGOB2 TOOB2  SUBTOB2  REPOB2 VPRT TO2
       TRANSINT TOOB1 INGOB1  REPOB1))




;;;============================================================
;;;
;;;                    I'M NOT QUITE SURE WHAT TO
;;;                    DO WITH THIS RANDOM STUFF
;;;
;;;============================================================

(DEFS D MOD ((PAST EN) (INF MODAL AUX)))

(DEFS G MOD ((ING) (INF)))

(DEFS R MOD ((COMPAR) NIL))

(DEFS T MOD ((SUP) NIL))

(DEFS N MOD ((EN) (INF)))

(DEFS S MOD ((PRESENT V3PS NPL) (NS INF MODAL AUS MAS)))

(DEFS * MOD ((NEG) (NIL)))

(DEFS THAMONG NOGOAL T)

(DEFS THSETQ NOGOAL T)

(DEFS THGOAL NOGOAL T)

(DEFS THOR NOGOAL T)

(DEFS THNOT NOGOAL T)

(DEFS THAND NOGOAL T)

(DEFS THPROG NOGOAL T)

(DEFS THFIND NOGOAL T)



;;;============================================================
;;;
;;;                    PRE-BUILT OSS'S
;;;
;;;============================================================

(DEFS ANIMATE-OSS
      OSSNODE=
      ANIMATE-OSS
      MARKERS=
      (\#ANIMATE \#THING \#SYSTEMS)
      RELATIONS=
      ((\#IS (THV ANIM) ?))
      SYSTEMS=
      (\#THING \#SYSTEMS)
      DETERMINER=
      (SG-PL INDEF WHICH)
      VARIABLE=
      ANIM)

(DEFS FAKE-AGENT
      FEATURES
      (NG INDEF SG-PL)
      SEMANTICS
      (UNKNOWN-OSS-BY)
      PARENT
      (FAKE-BY-PHRASE))


(DEFS FAKE-BY-PHRASE
      FEATURES
      (PREPG AGENT)
      FIRSTWORD
      (BY)
      DAUGHTERS
      (FAKE-AGENT FAKE-BY))


(DEFS FAKE-BY
      FEATURES
      (PREP BY)
      FIRSTWORD
      (BY)
      DAUGHTERS
      WORD)


(DEFS FINDEVENTS-OSS
      OSSNODE=
      FINDEVENTS-OSS
      MARKERS=
      (\#EVENT \#SYSTEMS)
      SYSTEMS=
      (\#SYSTEMS)
      DETERMINER=
      (SG-PL INDEF NIL)
      VARIABLE=
      FINDEVENTS)

(DEFS FRIEND-OSS
      OSSNODE=
      FRIEND-OSS
      MARKERS=
      (\#PERSON \#ANIMATE \#THING \#SYSTEMS)
      SYSTEMS=
      (\#ANIMATE \#THING \#SYSTEMS)
      REFER=
      (\:FRIEND)
      DETERMINER=
      (1. DEF NIL))

(DEFS NAME-OSS
      OSSNODE=
      NAME-OSS
      MARKERS=
      (\#NAME \#THING \#SYSTEMS)
      SYSTEMS=
      (\#THING \#SYSTEMS)
      DETERMINER=
      (1. DEF NIL))

(DEFS PLACE-OSS
      OSSNODE=
      PLACE-OSS
      MARKERS=
      (\#PLACE \#SYSTEMS)
      SYSTEMS=
      (\#SYSTEMS)
      DETERMINER=
      (SG-PL INDEF WHICH)
      VARIABLE=
      PLACE)

(DEFS SHRDLU-OSS
      OSSNODE=
      SHRDLU-OSS
      MARKERS=
      (\#ROBOT \#ANIMATE \#THING \#SYSTEMS)
      SYSTEMS=
      (\#ANIMATE \#THING \#SYSTEMS)
      REFER=
      (\:SHRDLU)
      DETERMINER=
      (1. DEF NIL))

(DEFS STACKPARTS-OSS
      OSSNODE=
      STACKPARTS-OSS
      MARKERS=
      (\#THING \#PHYSOB \#MANIP \#SYSTEMS)
      SYSTEMS=
      (\#THING \#PHYSOB \#SYSTEMS)
      DETERMINER=
      (3. INDEF NIL)
      VARIABLE=
      PART)

(DEFS UNKNOWN-OSS
      OSSNODE=
      UNKNOWN-OSS
      MARKERS=
      (\#THING \#SYSTEMS \#PHYSOB \#VAGUE)
      SYSTEMS=
      (\#THING \#SYSTEMS)
      DETERMINER=
      (SG-PL INDEF WHICH)
      VARIABLE=
      UNKNOWN)

(DEFS UNKNOWN-OSS-BY
      OSSNODE=
      UNKNOWN-OSS-BY
      RELATIONS=
      ((\#IS (THV UNKNOWN) ?))
      MARKERS=
      (\#THING \#SYSTEMS \#PHYSOB \#VAGUE)
      SYSTEMS=
      (\#THING \#SYSTEMS)
      DETERMINER=
      (SG-PL INDEF NIL)
      PARSENODE=
      (FAKE-AGENT)
      VARIABLE=
      UNKNOWN)

(DEFS UNKNOWNSG-OSS
      OSSNODE=
      UNKNOWNSG-OSS
      MARKERS=
      (\#THING \#SYSTEMS \#PHYSOB \#VAGUE)
      RELATIONS=
      ((\#IS (THV UNKNOWN) ?))
      SYSTEMS=
      (\#THING \#SYSTEMS)
      DETERMINER=
      (NS INDEF WHICH)
      VARIABLE=
      UNKNOWN)

(DEFS WE-OSS
      OSSNODE=
      WE-OSS
      MARKERS=
      (\#ANIMATE \#THING \#SYSTEMS)
      SYSTEMS=
      (\#ANIMATE \#THING \#SYSTEMS)
      REFER=
      (\:SHRDLU \:FRIEND)
      AND=
      (FRIEND-OSS SHRDLU-OSS))



;;;=======>>> TEMPORARY PLACE FOR OSS-PROPERTY DEFS - MOVE WHEN APPROVED

(DEFS ANIMATE OSS ANIMATE-OSS)

(DEFS FINDEVENTS OSS FINDEVENTS-OSS)

(DEFS FRIEND OSS FRIEND-OSS)

(DEFS NAME OSS NAME-OSS)

(DEFS PLACE OSS PLACE-OSS)

(DEFS SHRDLU OSS SHRDLU-OSS)

(DEFS STACKPARTS OSS STACKPARTS-OSS)

(DEFS UNKNOWN OSS UNKNOWN-OSS)

(DEFS UNKNOWNSG OSS UNKNOWNSG-OSS)

(DEFS WE OSS WE-OSS)

(DEFLIST CONTRAST
   (RED \#COLOR)
   (BLUE \#COLOR)
   (GREEN \#COLOR)
   (WHITE \#COLOR)
   (BLACK \#COLOR)
   (BIG \#SIZE)
   (LITTLE \#SIZE)
   (LARGE \#SIZE)
   (SMALL \#SIZE)
   (WIDE \#WIDTH)
   (NARROW \#WIDTH)
   (TALL \#HEIGHT)
   (SHORT \#HEIGHT)
   (THICK \#THICKNESS)
   (THIN \#THICKNESS))

;|�Visual LISP� Format Options�
;(200 6 1 0 T "end of " 100 20 0 0 1 T T nil T)
;*** DO NOT add text below the comment! ***|;
