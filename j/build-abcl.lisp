;;; build-abcl.lisp

(defconstant file-separator-char
  #+windows #\\
  #-windows #\/)

(defconstant path-separator-char
  #+windows #\;
  #-windows #\:)

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

#+sbcl
(defun probe-directory (pathspec)
  (let* ((truename (probe-file pathspec))
         (namestring (and truename (namestring truename))))
    (and namestring
         (> (length namestring) 0)
         (eql (char namestring (1- (length namestring))) file-separator-char)
         truename)))

(defparameter *jdk* nil)
(defparameter *java-compiler* nil)
(defparameter *javac-options* nil)
(defparameter *jikes-options* nil)

(defparameter *build-root*
  (make-pathname :device (pathname-device *load-truename*)
                 :directory (pathname-directory *load-truename*)))

(defparameter *customizations-file*
  (merge-pathnames "customizations.lisp" *build-root*))

(defparameter *abcl-dir*
  (merge-pathnames "src/org/armedbear/lisp/" *build-root*))

(defparameter *substitutions-alist*
  (acons "@LISP_HOME@"
         (let ((s (format nil "~S" (directory-namestring *abcl-dir*))))
           ;; Strip enclosing quotes.
           (subseq s 1 (1- (length s))))
         nil))

(defvar *classpath*)
(defvar *java-compiler-options*)
(defvar *java-compiler-command-line-prefix*)

(defun initialize-build ()
  (load *customizations-file*)
  (unless (probe-file (merge-pathnames #+windows "bin/java.exe"
                                       #-windows "bin/java"
                                       *jdk*))
    (error "Can't find Java executable."))
  (unless *java-compiler*
    (setf *java-compiler* (merge-pathnames #+windows "bin/javac.exe"
                                   #-windows "bin/javac"
                                   *jdk*)))
  (let ((classpath-components (list (merge-pathnames "src" *build-root*)
                                    (merge-pathnames "jre/lib/rt.jar" *jdk*))))
    (setf *classpath*
          (with-output-to-string (s)
            (do* ((components classpath-components (cdr components))
                  (component (car components) (car components)))
                 ((null components))
              (princ (namestring (truename component)) s)
              (unless (null (cdr components))
                (write-char path-separator-char s))))))
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

(defun substitute-in-string (string)
  (dolist (pair *substitutions-alist*)
    (let ((index (search (car pair) string :test #'string=)))
      (when index
        (setf string (concatenate 'string
                                  (subseq string 0 index)
                                  (cdr pair)
                                  (subseq string (+ index (length (car pair)))))))))
  string)

(defun copy-with-substitutions (source-file target-file)
  (with-open-file (in source-file :direction :input)
    (with-open-file (out target-file :direction :output :if-exists :supersede)
      (loop
        (let ((string (read-line in nil in)))
          (when (eq string in)
            (return))
          (write-line (substitute-in-string string) out))))))

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

(defun build-abcl (&key force (batch #+windows nil #-windows t))
  (let ((start (get-internal-real-time))
        (*default-pathname-defaults* *abcl-dir*)
        end)
    (initialize-build)
    (when (or force
              (null (probe-file "Site.java"))
              (>= (file-write-date "Site.java.in")
                  (file-write-date "Site.java")))
      (copy-with-substitutions "Site.java.in" "Site.java"))
    (let* ((source-files (append (directory "*.java")
                                 (directory "java/awt/*.java")))
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
      (when (null to-do)
        (format t "Nothing to do!~%")
        (return-from build-abcl t))
      (format t "JDK: ~A~%" *jdk*)
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
                    (result (run-shell-command cmdline :directory *abcl-dir*)))
               (unless (zerop result)
                 (format t "Build failed.~%")
                 (return-from build-abcl nil))))
            (t
             (dolist (source-file to-do)
               (unless (java-compile-file source-file)
                 (format t "Build failed.~%")
                 (return-from build-abcl nil)))))
      ;; Success!
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
    (zerop result)
    ))
