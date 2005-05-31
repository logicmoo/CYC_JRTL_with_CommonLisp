;;; build-abcl.lisp

(defpackage build-abcl
  (:use "COMMON-LISP")
  (:export #:build-abcl)
  #+abcl (:import-from #:extensions #:run-shell-command #:probe-directory)
  #+allegro (:import-from #:excl #:probe-directory)
  )

(in-package #:build-abcl)

(defparameter *platform-is-windows*
  (let ((software-type (software-type)))
    (if (and (stringp software-type)
             (>= (length software-type) 7)
             (string-equal (subseq software-type 0 7) "Windows"))
        t
        nil)))

(defparameter *file-separator-char*
  (if *platform-is-windows* #\\ #\/))

(defparameter *path-separator-char*
  (if *platform-is-windows* #\; #\:))

#+armedbear
(require 'format)

#+sbcl
(defun run-shell-command (command &key directory (output *standard-output*))
  (when directory
    (setf command (concatenate 'string
                               "\\cd \""
                               (namestring (pathname directory))
                               "\" && "
                               command)))
  (sb-impl::process-exit-code
   (sb-ext:run-program
    "/bin/sh"
    (list  "-c" command)
    :input nil :output output)))

#+cmu
(defun run-shell-command (command &key directory (output *standard-output*))
  (when directory
    (setf command (concatenate 'string
                               "\\cd \""
                               (namestring (pathname directory))
                               "\" && "
                               command)))
  (ext::process-exit-code
   (ext:run-program
    "/bin/sh"
    (list  "-c" command)
    :input nil :output output)))

#+lispworks
(defun run-shell-command (command &key directory (output *standard-output*))
  (cond (*platform-is-windows*
         (if directory
             (system:call-system-showing-output
              command
              :current-directory (namestring (pathname directory))
              :output-stream output)
             (system:call-system-showing-output
              command
              :output-stream output)))
        (t
         (when directory
           (setf command (concatenate 'string
                                      "\\cd \""
                                      (namestring (pathname directory))
                                      "\" && "
                                      command)))
         (system:call-system-showing-output
          command
          :shell-type "/bin/sh"
          :output-stream output))))


#+allegro
(defun run-shell-command (command &key directory (output *standard-output*))
  (excl:run-shell-command command :directory directory :input nil :output output))

#+(or sbcl cmu)
(defun probe-directory (pathspec)
  (let* ((truename (probe-file pathspec))
         (namestring (and truename (namestring truename))))
    (and namestring
         (> (length namestring) 0)
         (eql (char namestring (1- (length namestring))) *file-separator-char*)
         truename)))

(defparameter *jdk* nil)
(defparameter *java-compiler* nil)
(defparameter *javac-options* nil)
(defparameter *jikes-options* nil)
(defparameter *jar* nil)

(defparameter *build-root*
  (make-pathname :device (pathname-device *load-truename*)
                 :directory (pathname-directory *load-truename*)))

(defparameter *customizations-file*
  (merge-pathnames "customizations.lisp" *build-root*))

(defparameter *abcl-dir*
  (merge-pathnames "src/org/armedbear/lisp/" *build-root*))

(defparameter *substitutions-alist* nil)

(defvar *classpath*)
(defvar *java*)
(defvar *java-compiler-options*)
(defvar *java-compiler-command-line-prefix*)

(defun initialize-build ()
  (load *customizations-file*)
  (setf *java* (probe-file (merge-pathnames (if *platform-is-windows*
                                                "bin/java.exe"
                                                "bin/java")
                                            *jdk*)))
  (unless *java*
    (error "Can't find Java executable."))
  (unless *java-compiler*
    (setf *java-compiler* (merge-pathnames (if *platform-is-windows*
                                               "bin/javac.exe"
                                               "bin/javac")
                                           *jdk*)))
  (unless *jar*
    (setf *jar* (merge-pathnames (if *platform-is-windows*
                                     "bin/jar.exe"
                                     "bin/jar")
                                 *jdk*)))
  (let ((classpath-components (list (merge-pathnames "src" *build-root*)
                                    (merge-pathnames "jre/lib/rt.jar" *jdk*))))
    (setf *classpath*
          (with-output-to-string (s)
            (do* ((components classpath-components (cdr components))
                  (component (car components) (car components)))
                 ((null components))
              (princ #\" s)
              (princ (namestring component) s)
              (princ #\" s)
              (unless (null (cdr components))
                (write-char *path-separator-char* s))))))
  (let ((prefix (concatenate 'string
                             (namestring *java-compiler*)
                             " -classpath " *classpath*)))
    (setf *java-compiler-options*
          (if (string-equal (pathname-name (pathname *java-compiler*)) "jikes")
              *jikes-options*
              *javac-options*))
    (setf prefix
          (if *java-compiler-options*
              (concatenate 'string prefix " " *java-compiler-options* " ")
              (concatenate 'string prefix " ")))
    (setf *java-compiler-command-line-prefix* prefix)))

(defun substitute-in-string (string substitutions-alist)
  (dolist (entry substitutions-alist)
    (let ((index (search (car entry) string :test #'string=)))
      (when index
        (setf string (concatenate 'string
                                  (subseq string 0 index)
                                  (cdr entry)
                                  (subseq string (+ index (length (car entry)))))))))
  string)

(defun copy-with-substitutions (source-file target-file substitutions-alist)
  (with-open-file (in source-file :direction :input)
    (with-open-file (out target-file :direction :output :if-exists :supersede)
      (loop
        (let ((string (read-line in nil)))
          (when (null string)
            (return))
          (write-line (substitute-in-string string substitutions-alist) out))))))

(defun build-stamp ()
  (multiple-value-bind
    (second minute hour date month year day daylight-p zone)
    (decode-universal-time (get-universal-time))
    (declare (ignore daylight-p))
    (setf day (nth day '("Mon" "Tue" "Wed" "Thu" "Fri" "Sat" "Sun")))
    (setf month (nth (1- month) '("Jan" "Feb" "Mar" "Apr" "May" "Jun"
                                  "Jul" "Aug" "Sep" "Oct" "Nov" "Dec")))
    (setf zone (* zone 100)) ;; FIXME
    (format nil "~A ~A ~D ~D ~2,'0D:~2,'0D:~2,'0D -~4,'0D"
            day month date year hour minute second zone)))

(defun build-javac-command-line (source-file)
  (concatenate 'string
               *java-compiler-command-line-prefix*
               (namestring source-file)))

(defun java-compile-file (source-file)
  (let ((cmdline (build-javac-command-line source-file)))
    (zerop (run-shell-command cmdline :directory *abcl-dir*))))

(defun make-jar ()
  (let ((*default-pathname-defaults* *build-root*)
        (jar-namestring (namestring *jar*)))
    (when (position #\space jar-namestring)
      (setf jar-namestring (concatenate 'string "\"" jar-namestring "\"")))
    (let ((substitutions-alist (acons "@JAR@" jar-namestring nil))
          (source-file (if *platform-is-windows* "make-jar.bat.in" "make-jar.in"))
          (target-file (if *platform-is-windows* "make-jar.bat" "make-jar"))
          (command (if *platform-is-windows* "make-jar.bat" "sh make-jar")))
      (copy-with-substitutions source-file target-file substitutions-alist)
      (let ((status (run-shell-command command :directory *build-root*)))
        (unless (zerop status)
          (format t "~A returned ~S~%" command status))
        status))))

(defun delete-files (pathnames)
  (dolist (pathname pathnames)
    ;; SBCL signals an error if the file doesn't exist.
    (when (probe-file pathname)
      (delete-file pathname))))

(defun clean ()
  (let ((*default-pathname-defaults* *abcl-dir*))
    (delete-files (directory "*.class"))
    (delete-files (directory "*.abcl"))
    (delete-files (directory "*.cls"))
    (delete-files '("native.h" "libabcl.so" "build")))
  (let ((*default-pathname-defaults* (merge-pathnames "java/awt/" *abcl-dir*)))
    (delete-files (directory "*.class"))))

(defun safe-namestring (pathname)
  (let ((string (namestring pathname)))
    (when (position #\space string)
      (setf string (concatenate 'string "\"" string "\"")))
    string))

(defun build-abcl (&key force
                        (batch (if *platform-is-windows* nil t))
                        compile-system
                        jar
                        clean
                        libabcl
                        full)
  #+lispworks (setf batch nil)
  (let ((start (get-internal-real-time))
        end)
    (initialize-build)
    (when clean
      (clean))
    (let* ((source-files (append (let ((*default-pathname-defaults* *abcl-dir*))
                                   (directory "*.java"))
                                 (let ((*default-pathname-defaults*
                                        (merge-pathnames "java/awt/" *abcl-dir*)))
                                   (directory "*.java"))))
           (to-do ()))
      (if force
          (setf to-do source-files)
          (dolist (source-file source-files)
            (let ((class-file (merge-pathnames (make-pathname :type "class"
                                                              :defaults source-file))))
              (when (or (null (probe-file class-file))
                        (>= (file-write-date source-file)
                            (file-write-date class-file)))
                (push source-file to-do)))))
      (cond ((null to-do)
             (format t "~&Classes are up to date.~%"))
            (t
             (format t "~&JDK: ~A~%" *jdk*)
             (format t "Java compiler: ~A~%" *java-compiler*)
             (format t "Options: ~A~%" (if *java-compiler-options* *java-compiler-options* ""))
             (cond (batch
                    (let* ((dir (pathname-directory *abcl-dir*))
                           (cmdline (with-output-to-string (s)
                                      (princ *java-compiler-command-line-prefix* s)
                                      (dolist (source-file to-do)
                                        (princ
                                         (if (equal (pathname-directory source-file) dir)
                                             (file-namestring source-file)
                                             (namestring source-file))
                                         s)
                                        (princ #\space s))))
                           (status (run-shell-command cmdline :directory *abcl-dir*)))
                      (unless (zerop status)
                        (format t "Build failed.~%")
                        (return-from build-abcl nil))))
                   (t
                    (dolist (source-file to-do)
                      (unless (java-compile-file source-file)
                        (format t "Build failed.~%")
                        (return-from build-abcl nil)))))))
      (when (or compile-system full)
        (let* ((java-namestring (safe-namestring *java*))
               status)
          (cond (*platform-is-windows*
                 (with-open-file (stream
                                  (merge-pathnames "compile-system.bat" *build-root*)
                                  :direction :output
                                  :if-exists :supersede)
                   (princ java-namestring stream)
                   (write-string " -cp " stream)
                   (princ "src" stream)
                   (write-char #\space stream)
                   (write-string "org.armedbear.lisp.Main --eval \"(compile-system :quit t)\"" stream))
                 (setf status
                       (run-shell-command "compile-system.bat"
                                          :directory *build-root*)))
                (t ; Linux
                 (let ((cmdline
                        (with-output-to-string (s)
                          (princ java-namestring s)
                          (write-string " -cp " s)
                          (princ "src" s)
                          (write-char #\space s)
                          (write-string "org.armedbear.lisp.Main --eval \"(compile-system :quit t)\"" s))))
                   (setf status
                         (run-shell-command cmdline
                                            :directory *build-root*)))))
          (unless (zerop status)
            (format t "Build failed.~%")
            (return-from build-abcl nil))))

      (when (or jar full)
        (let ((status (make-jar)))
          (unless (zerop status)
            (format t "Build failed.~%")
            (return-from build-abcl nil))))

      (when (and (or full libabcl)
                 (or (string= (software-type) "Linux")
                     (string= (software-type) "SunOS")))
        (and (let* ((javah-namestring (namestring (probe-file (merge-pathnames "bin/javah" *jdk*))))
                    (command
                     (format nil "~A -o org/armedbear/lisp/native.h org.armedbear.lisp.Native"
                             javah-namestring))
                    (status
                     (run-shell-command command :directory (merge-pathnames "src/" *build-root*))))
               (unless (zerop status)
                 (format t "~A returned ~S~%" command status))
               (zerop status))
             (let* ((jdk-namestring (namestring *jdk*))
                    (command
                     (format nil "gcc -shared -o libabcl.so -O -D_REENTRANT -fpic -I~Ainclude -I~Ainclude/~A native.c"
                             jdk-namestring jdk-namestring
                             (cond ((string= (software-type) "Linux")
                                    "linux")
                                   ((string= (software-type) "SunOS")
                                    "solaris"))))
                    (status
                     (run-shell-command command :directory *abcl-dir*)))
               (unless (zerop status)
                 (format t "~A returned ~S~%" command status))
               (zerop status))))
      ;; Success!

      ;; abcl/abcl.bat
      (cond (*platform-is-windows*
             (with-open-file (s
                              (merge-pathnames "abcl.bat" *build-root*)
                              :direction :output
                              :if-exists :supersede)
               (format s "~A -cp ~A;~A org.armedbear.lisp.Main %1 %2 %3 %4 %5 %6 %7 %8 %9~%"
                       (safe-namestring *java*)
                       (safe-namestring (merge-pathnames "src" *build-root*))
                       (safe-namestring (merge-pathnames "abcl.jar" *build-root*)))))
            (t
             (let ((pathname (merge-pathnames "abcl" *build-root*)))
               (with-open-file (s pathname :direction :output :if-exists :supersede)
                 (if (string= (software-type) "Linux")
                     (format s "#!/bin/sh~%exec ~A -Xrs -Djava.library.path=~A -cp ~A:~A org.armedbear.lisp.Main \"$@\"~%"
                             (safe-namestring *java*)
                             (safe-namestring *abcl-dir*)
                             (safe-namestring (merge-pathnames "src" *build-root*))
                             (safe-namestring (merge-pathnames "abcl.jar" *build-root*)))
                     ;; Not Linux.
                     (format s "#!/bin/sh~%exec ~A -cp ~A:~A org.armedbear.lisp.Main \"$@\"~%"
                             (safe-namestring *java*)
                             (safe-namestring (merge-pathnames "src" *build-root*))
                             (safe-namestring (merge-pathnames "abcl.jar" *build-root*)))))
               (run-shell-command (format nil "chmod +x ~A" (safe-namestring pathname))
                                  :directory *build-root*))))

      (with-open-file (s
                       (merge-pathnames (make-pathname :name "build"
                                                       :defaults *abcl-dir*))
                       :direction :output
                       :if-exists :supersede)
        (format s "~A" (build-stamp)))
      (setf end (get-internal-real-time))
      (format t "Build completed successfully in ~A seconds.~%"
              (/ (float (- end start)) internal-time-units-per-second))
      t)))

(defun build-abcl-executable ()
  (let* ((*default-pathname-defaults* *abcl-dir*)
         (source-files (directory "*.java"))
         (cmdline (with-output-to-string (s)
                    (princ "gcj -O2 " s)
                    (dolist (source-file source-files)
                      (unless (string= (pathname-name source-file) "ControlC")
                        (princ (pathname-name source-file) s)
                        (princ ".java" s)
                        (princ #\space s)))
                    (princ "--main=org.armedbear.lisp.Main -o lisp" s)))
         (result (run-shell-command cmdline :directory *abcl-dir*))
         )
    (zerop result)))

(defvar *copy-verbose* nil)

(defun copy-file (source target)
  (when *copy-verbose*
    (format t "~A -> ~A~%" source target))
  (let ((buffer (make-array 4096 :element-type '(unsigned-byte 8))))
    (with-open-file (in source :direction :input :element-type '(unsigned-byte 8))
      (with-open-file (out target :direction :output :element-type '(unsigned-byte 8)
                           :if-exists :supersede)
        (loop
          (let ((end (read-sequence buffer in)))
            (when (zerop end)
              (return))
            (write-sequence buffer out :end end)))))))

(defun copy-files (files source-dir target-dir)
  (dolist (file files)
    (copy-file (merge-pathnames file source-dir)
               (merge-pathnames file target-dir))))

(defun make-dist-dir (version-string)
  (unless (string= (software-type) "Linux")
    (error "MAKE-DIST is only supported on Linux."))
  (let ((target-root (pathname (concatenate 'string "/var/tmp/" version-string "/"))))
    (when (probe-directory target-root)
      (error "Target directory ~S already exists." target-root))
    (ensure-directories-exist
     (merge-pathnames "src/org/armedbear/lisp/java/awt/" target-root))
    (let* ((source-dir *build-root*)
           (target-dir target-root)
           (files (list "README"
                        "COPYING"
                        "build-abcl.lisp"
                        "customizations.lisp"
                        "make-jar.bat.in"
                        "make-jar.in")))
      (copy-files files source-dir target-dir))
    (let* ((source-dir (merge-pathnames "src/" *build-root*))
           (target-dir (merge-pathnames "src/" target-root))
           (files (list "manifest-abcl")))
      (copy-files files source-dir target-dir))
    (let* ((source-dir *abcl-dir*)
           (target-dir (merge-pathnames "src/org/armedbear/lisp/" target-root))
           (*default-pathname-defaults* source-dir)
           (files (mapcar #'file-namestring
                          (append (directory "*.java") (directory "*.lisp") (list "LICENSE" "native.c")))))
      (copy-files files source-dir target-dir))
    (let* ((source-dir (merge-pathnames "java/awt/" *abcl-dir*))
           (target-dir (merge-pathnames "src/org/armedbear/lisp/java/awt/" target-root))
           (*default-pathname-defaults* source-dir)
           (files (mapcar #'file-namestring (directory "*.java"))))
      (copy-files files source-dir target-dir))
    target-root))

(defun make-dist (version-string)
  (let* ((dist-dir (make-dist-dir version-string))
         (parent-dir (merge-pathnames (make-pathname :directory '(:relative :back))
                                      dist-dir)))
    (let* ((command (format nil "tar czf ~A~A.tar.gz ~A"
                            (namestring parent-dir)
                            version-string version-string))
           (status (run-shell-command command :directory parent-dir)))
      (unless (zerop status)
        (format t "~A returned ~S~%" command status)))
    (let* ((command (format nil "zip -q -r ~A~A.zip ~A"
                            (namestring parent-dir)
                            version-string version-string))
           (status (run-shell-command command :directory parent-dir)))
      (unless (zerop status)
        (format t "~A returned ~S~%" command status)))))
