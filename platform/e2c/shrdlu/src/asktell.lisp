
(DEFMACRO NOP (&REST R) T)

(DEFMACRO IFDEBUGGING (R) R)
;; (DEFMACRO IFDEBUGGING (R) T)

(DEFMACRO THGET (SYM PRED) `(GET ,SYM ,PRED))
;; (DEFMACRO THGET (&REST R) `(GET ,@R))

(DEFMACRO THSETF ((GETTED SYM PRED) VAL)
   `(progn
      (NOP (print `(WAZ ,,PRED ,,SYM ,,VAL)))
      (IFDEBUGGING (if (atom ,VAL)
         (print `(,,SYM -> ,,PRED -> ,,VAL))
         (if
           (memq ,PRED `(SEMANTICS FEATURES B-SPECIAL COLOR  ELIM TELLTREE THMLIST SPECIAL))
           (dolist (e ,VAL) (print `(,,SYM -> ,,PRED -> ,e)))
           (print `(,,SYM -> ,,PRED --> ,,VAL)))))
    (SETF (GET ,SYM ,PRED) ,VAL)))


#|       (if (atom VAL) (print `(THADD2 ,PROP ,SYM ,VAL))
            (dolist (e VAL) (print `(THADD3 ,PROP ,SYM ,e))))
|#

