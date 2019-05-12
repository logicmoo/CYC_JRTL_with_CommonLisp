
;; Comments out code
(DEFMACRO NOP (&REST R) T)

(DEFMACRO IFDEBUGGING (R) R)
(DEFMACRO IFDEBUGGING (R) T)


(deFconstant *QUOTE_STR* (make-string 1 :initial-element #\U0022))
(deFconstant *QUOTE_SYM* (intern *QUOTE_STR*))

;; The code expects a random list in the prop (val1 val2 ...)
(setq *SHRDLU-DATA-EACH* `(SEMANTICS FEATURES B-SPECIAL COLOR ELIM TELLTREE THMLIST SPECIAL MOD))
;; The code expects a ordered list in the prop (val1 val2 ...)
(setq *SHRDLU-DATA-ORDERED-LIST* `(MARKERS= SYSTEMS= HISTORY REFER))
;; The code expects a structured list in the prop (val1 val2 ...)
(setq *SHRDLU-DATA-STRUCTURE* `(IRREGULAR THASSERTION THCONSE SHOW TELL THEOREM TELLINFO MEASFN))
;; The code expects a Atom
(setq *SHRDLU-DATA-ATOM* `(NOGOAL))
;; The code expects Text
(setq *SHRDLU-DATA-STRING* `(FIRSTWORD ROOT WORDAFTER))

;; Queries
(DEFMACRO THGET (SYM PRED) `(GET ,SYM ,PRED))

;; Asserts
(DEFMACRO THSETF ((GETTED SYM PRED) VAL)
   `(progn
      (NOP (print `(WAZ ,,PRED ,,SYM ,,VAL)))
      (IFDEBUGGING (if (atom ,VAL)
                    (print `(,,SYM -> ,,PRED -> ,,VAL))
                    (if
                      (memq ,PRED *SHRDLU-DATA-EACH*)
                      (dolist (e ,VAL) (print `(,,SYM -> ,,PRED -> ,e)))
                      (print `(,,SYM -> ,,PRED --> ,,VAL)))))
     (SETF (GET ,SYM ,PRED) ,VAL)))
