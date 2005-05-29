;;; customizations.lisp

;;; User customizations.

(setf *javac-options* "-g")
(setf *jikes-options*
      (if *platform-is-windows*
          "+Z0 +D -g" ;; +Z0 for jikes 1.21
          "+D -g"))

(cond (*platform-is-windows*
       (setf *jdk* "C:\\Program Files\\Java\\jdk1.5.0_02\\")
;;        (setf *java-compiler* "C:\\jikes-1.21\\bin\\jikes.exe")
       (setf *java-compiler* "C:\\Program Files\\Java\\jdk1.5.0_02\\bin\\javac.exe"))
      (t ; Linux
       (setf *jdk* "/home/peter/blackdown/j2sdk1.4.2/")
       (setf *java-compiler* "jikes")
;;        (setf *java-compiler* "/home/peter/blackdown/j2sdk1.4.2/bin/javac")
       ))
