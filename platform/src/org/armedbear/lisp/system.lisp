
(SETF (LOGICAL-PATHNAME-TRANSLATIONS "sys")
      '(("SYS:SRC;**;*.*"
         "./src/org/armedbear/lisp/**/*.*")
        ("SYS:JAVA;**;*.*"
         "./src/org/armedbear/lisp/../../../**/*.*")))