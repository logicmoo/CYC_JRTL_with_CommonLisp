;;; customizations.lisp

;;; User customizations.

(setf *javac-options* "-g")
(setf *jikes-options*
      #+windows "+Z0 +D -g" ;; +Z0 for jikes 1.21
      #+linux "+D -g")

#+windows
(progn
  (setf *jdk* "C:\\jdk1.5.0\\")
  (setf *java-compiler* "C:\\jikes-1.21\\bin\\jikes.exe")
;;   (setf *java-compiler* "C:\\j2sdk1.5.0\\bin\\javac.exe")
  )

#+linux
(progn
  (setf *jdk* "/home/peter/blackdown/j2sdk1.4.2/")
  (setf *java-compiler* "jikes"))
