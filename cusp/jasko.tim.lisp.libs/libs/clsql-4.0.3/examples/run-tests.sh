#!/bin/bash

REPORT_FILE=/tmp/clsql-test-report.txt
SEXP_REPORT_FILE=/tmp/clsql-test-report.sexp
LISP_CMD_FILE=/tmp/clsql-test.lisp

CMD="
(setq *print-readably* nil)
(let ((boot-file
       (merge-pathnames
        (parse-namestring #+allegro \".clinit.cl\"
                          #+cmu \".cmucl-init.lisp\"
                          #+lispworks \".lispworks\"
                          #+openmcl \"openmcl-init.lisp\"
                          #+sbcl \".sbclrc\"
                          #+scl \".scl-init.lisp\"
                          )
        (user-homedir-pathname))))
  (if (probe-file boot-file)
    (load boot-file)
    (warn \"Unable to load boot file ~A.\" boot-file)))

  (asdf:operate 'asdf:load-op 'clsql-tests)
  (clsql-tests:run-tests-append-report-file \"${REPORT_FILE}\")

  #+allegro (excl:exit)
  #+clisp (#+lisp=cl ext:quit #-lisp=cl lisp:quit)
  #+cmu (ext:quit)
  #+lispworks (lw:quit)
  #+openmcl (ccl:quit)
  #+sbcl (sb-ext:quit)
  #+scl (ext:quit)"

SUMMARY_CMD="
(asdf:operate 'asdf:load-op 'clsql-tests)
(clsql-tests:summarize-test-report \"${SEXP_REPORT_FILE}\")

#+allegro (excl:exit :quiet t)
#+clisp (#+lisp=cl ext:quit #-lisp=cl lisp:quit)
#+cmu (ext:quit)
#+lispworks (lw:quit)
#+openmcl (ccl:quit)
#+sbcl (sb-ext:quit))
#+scl (ext:quit)"

rm -rf $REPORT_FILE $SEXP_REPORT_FILE $LISP_CMD_FILE
echo $CMD > $LISP_CMD_FILE

ALLEGRO=mlisp
if [ "`which $ALLEGRO`" ]; then
  $ALLEGRO -q -L $LISP_CMD_FILE
fi

CMUCL=lisp
if [ "`which $CMUCL`" ]; then
  $CMUCL -init $LISP_CMD_FILE
fi

LISPWORKS=lw-console
#if [ "`which $LISPWORKS`" ]; then
 $LISPWORKS -init $LISP_CMD_FILE
#fi

OPENCML=openmcl
#if [ "`which $OPENMCL`" ]; then
  $OPENMCL -init $LISP_CMD_FILE
#fi

SBCL=sbcl
if [ "`which $SBCL`" ]; then
  $SBCL --noinform --disable-debugger --userinit $LISP_CMD_FILE
fi

if [ -s $SEXP_REPORT_FILE ]; then
    echo "$SUMMARY_CMD" | $SBCL
fi

#rm -rf $LISP_CMD_FILE
