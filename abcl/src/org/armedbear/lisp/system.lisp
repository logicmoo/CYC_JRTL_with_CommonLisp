
(SETF (LOGICAL-PATHNAME-TRANSLATIONS "sys")
      '(("SYS:SRC;**;*.*"
         "../abcl/src/org/armedbear/lisp/**/*.*")
        ("SYS:JAVA;**;*.*"
         "../abcl/src/org/armedbear/lisp/../../../**/*.*")))