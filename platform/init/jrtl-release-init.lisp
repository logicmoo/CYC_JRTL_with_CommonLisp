;;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-

;;; -*- Mode: LISP; Package: CYC; Syntax: ANSI-Common-Lisp -*-

(in-package "CYC")

(cvs-id "$Id: jrtl-release-init.lisp 129137 2009-11-05 03:40:25Z rck $")

(csetq *master-license-key* "de47-29ff-c13b-ac5e-b750")

(pwhen-feature :Cyc-ResearchCyc
  (pwhen-feature :SL2Java
    (csetq *master-license-key* "de47-29ff-c13b-ac5e-b750")))
(pwhen-feature :Cyc-ResearchCyc
  (pwhen-feature :SL2Java
    (csetq *master-license-key* "e36a-89e7-56ca-0426-0193")))

#+Ignore
(cunwind-protect
  (format t "Starting Named Entity Recognizer.~%")
  (csetq *stanford-ner-host* "localhost")
  (csetq *stanford-ner-port* 6666)
  (run-external-process
   "java"
   `("-server" "-Xmx1024m"
               "-XX:MaxPermSize=512m"
               "-cp" "data/stanford-ner-cyc-2006-09-18/stanford-ner.jar"
               "edu.stanford.nlp.ie.NERServer"
               "-loadClassifier" "data/stanford-ner-cyc-2006-09-18/classifiers/ner-eng-ie.crf-7-muc-distsim.ser.gz"
               ,(to-string *stanford-ner-port*)) *NULL-INPUT* *NULL-OUTPUT* *ERROR-OUTPUT*)
  (sleep 20)
  (progn))

(load "init/jrtl-init.lisp")

(load "init/release-specific-init.lisp")



