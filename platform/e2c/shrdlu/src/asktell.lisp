
(DEFMACRO NOP (&REST R) T)

(DEFMACRO IFDEBUGGING (R) R)
(DEFMACRO IFDEBUGGING (R) T)

(DEFMACRO THGET (SYM PRED) `(GET ,SYM ,PRED))
;; (DEFMACRO THGET (&REST R) `(GET ,@R))

(DEFMACRO THSETF ((GETTED SYM PRED) VAL)
   `(progn
      (NOP (print `(WAZ ,,PRED ,,SYM ,,VAL)))
      (IFDEBUGGING (if (atom ,VAL)
         (print `(THADD1 ,,PRED ,,SYM ,,VAL))
         (if
           (memq ,PRED `(SEMANTICS FEATURES B-SPECIAL COLOR  ELIM TELLTREE))
           (dolist (e ,VAL) (print `(THADD2 ,,PRED ,,SYM ,e)))
           (print `(THADD3 ,,PRED ,,SYM ,,VAL)))))
    (SETF (GET ,SYM ,PRED) ,VAL)))


#|       (if (atom VAL) (print `(THADD2 ,PROP ,SYM ,VAL))
            (dolist (e VAL) (print `(THADD3 ,PROP ,SYM ,e))))
|#

