;;; file-system-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;;
;;; This program is free software; you can redistribute it and/or
;;; modify it under the terms of the GNU General Public License
;;; as published by the Free Software Foundation; either version 2
;;; of the License, or (at your option) any later version.
;;;
;;; This program is distributed in the hope that it will be useful,
;;; but WITHOUT ANY WARRANTY; without even the implied warranty of
;;; MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
;;; GNU General Public License for more details.
;;;
;;; You should have received a copy of the GNU General Public License
;;; along with this program; if not, write to the Free Software
;;; Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.

;; Before loading this file, define "ansi-tests" as a logical pathname host
;; (your path may vary):
;;
;;   (setf (logical-pathname-translations "ansi-tests")
;;         '(("*.*.*" "/home/peter/gcl/ansi-tests/*.*")))

#+:sbcl (require '#:sb-posix)

(unless (member "RT" *modules* :test #'string=)
  (unless (ignore-errors (logical-pathname-translations "ansi-tests"))
    (error "~S is not defined as a logical pathname host." "ansi-tests"))
  (load "ansi-tests:rt-package.lsp")
  (load #+abcl (compile-file-if-needed "ansi-tests:rt.lsp")
        ;; Force compilation to avoid fasl name conflict between SBCL and
        ;; Allegro.
        #-abcl (compile-file "ansi-tests:rt.lsp"))
  (provide "RT"))

(regression-test:rem-all-tests)

(let ((*package* (find-package '#:rt)))
  (export (find-symbol (string '#:*expected-failures*))))

(setf regression-test:*expected-failures* nil)

(unless (find-package '#:test)
  (defpackage #:test (:use #:cl #:regression-test
                           #+abcl #:extensions)))

(in-package #:test)

(export '(pathnames-equal-p run-shell-command copy-file make-symbolic-link))

(defparameter *this-file*
  (merge-pathnames (make-pathname :type "lisp")
                   *load-truename*))

(defparameter *this-directory*
  (make-pathname :host (pathname-host *load-truename*)
                 :device (pathname-device *load-truename*)
                 :directory (pathname-directory *load-truename*)))

(defun pathnames-equal-p (pathname1 pathname2)
  #-(or allegro cmu)
  (equal pathname1 pathname2)
  #+(or allegro cmu)
  (and (pathnamep pathname1)
       (pathnamep pathname2)
       (equal (pathname-host pathname1) (pathname-host pathname2))
       (equal (pathname-device pathname1) (pathname-device pathname2))
       (equal (pathname-directory pathname1) (pathname-directory pathname2))
       (equal (pathname-name pathname1) (pathname-name pathname2))
       (equal (pathname-type pathname1) (pathname-type pathname2))
       (or (equal (pathname-version pathname1) (pathname-version pathname2))
           (and (member (pathname-version pathname1) '(:newest nil))
                (member (pathname-version pathname2) '(:newest nil))
                t))))

#+allegro
(defun run-shell-command (command &key directory (output *standard-output*))
  (excl:run-shell-command command :directory directory :input nil :output output))

#+clisp
(defun run-shell-command (command &key directory (output *standard-output*))
  (declare (ignore output)) ;; FIXME
  (let (status old-directory)
    (when directory
      (setf old-directory (ext:cd))
      (ext:cd directory))
    (unwind-protect
        (setf status (ext:run-shell-command command))
      (when old-directory
        (ext:cd old-directory)))
    (cond ((numberp status)
           status)
          ((eq status t)
           0)
          (t
           -1))))

#+cmu
(defun run-shell-command (command &key directory (output *standard-output*))
  (when directory
    (setf command (concatenate 'string
                               "\\cd \""
                               (namestring (pathname directory))
                               "\" && "
                               command)))
  (ext:process-exit-code
   (ext:run-program
    "/bin/sh"
    (list  "-c" command)
    :input nil :output output)))

#+sbcl
(defun run-shell-command (command &key directory (output *standard-output*))
  (when directory
    (setf command (concatenate 'string
                               "\\cd \""
                               (namestring (pathname directory))
                               "\" && "
                               command)))
  (sb-ext:process-exit-code
   (sb-ext:run-program
    "/bin/sh"
    (list  "-c" command)
    :input nil :output output)))

(defun copy-file (from to)
  (let* ((from-namestring (namestring (pathname from)))
         (to-namestring (namestring (pathname to)))
         (command (concatenate 'string "cp " from-namestring " " to-namestring)))
    (zerop (run-shell-command command))))

(defun make-symbolic-link (from to)
  (let* ((from-namestring (namestring (pathname from)))
         (to-namestring (namestring (pathname to)))
         (command (concatenate 'string "ln -s " from-namestring " " to-namestring)))
    (zerop (run-shell-command command))))

;; This approach is race-prone, but it should be adequate for our limited
;; purposes here.
(defun make-temporary-filename (directory)
  (dotimes (i 10)
    (let ((pathname (merge-pathnames (make-pathname :name (symbol-name (gensym))
                                                    :type nil)
                                     directory)))
      (unless (probe-file pathname)
        (return-from make-temporary-filename pathname))))
   (error "Unable to create a temporary filename in ~S~%" directory))

#-(or allegro clisp windows)
(deftest run-shell-command.1
  (let* ((raw-string
          (with-output-to-string (s) (run-shell-command "pwd"
                                                        :directory *this-directory*
                                                        :output s)))
         (string
          (string-right-trim '(#\newline #\return) raw-string))
         (length (length string)))
    (when (> length 0)
      (unless (eql (char string (1- length)) #\/)
        (setf string (concatenate 'string string (string #\/)))))
    (string= string (directory-namestring *this-directory*)))
  t)

#-(or allegro clisp windows)
(deftest run-shell-command.2
  (let* ((directory
          (probe-file (merge-pathnames "../" *this-directory*)))
         (raw-string
          (with-output-to-string (s) (run-shell-command "pwd"
                                                        :directory directory
                                                        :output s)))
         (string
          (string-right-trim '(#\newline #\return) raw-string))
         (length (length string)))
    (when (> length 0)
      (unless (eql (char string (1- length)) #\/)
        (setf string (concatenate 'string string (string #\/)))))
    (string= string (directory-namestring directory)))
  t)

(deftest probe-file.1
  (pathnames-equal-p (probe-file *this-file*) *this-file*)
  t)

(deftest truename.1
  (pathnames-equal-p (truename *this-file*) *this-file*)
  t)

(deftest directory.1
  (let ((list (directory *this-file*)))
    (and
     (= (length list) 1)
     (pathnames-equal-p (car list) *this-file*)))
  t)

#-windows
(deftest symlink.1
  (let* ((tmp1 (make-temporary-filename *this-directory*))
         (tmp2 (make-temporary-filename *this-directory*)))
    (unwind-protect
        (values
         (unwind-protect
             (and
              ;; Copy this file to tmp1.
              (copy-file *this-file* tmp1)
              (pathnames-equal-p (probe-file tmp1) tmp1)
              ;; Create tmp2 as a symlink to tmp1.
              (make-symbolic-link tmp1 tmp2)
              ;; Verify that the symlink exists and points to the copy.
              (pathnames-equal-p (probe-file tmp2) tmp1)
              (pathnames-equal-p (truename tmp2) tmp1))
           ;; Delete the symlink.
           (when (probe-file tmp2)
             (delete-file tmp2)))
         ;; Copy should still exist after symlink is deleted.
         (pathnames-equal-p (probe-file tmp1) tmp1))
      (when (probe-file tmp1)
        (delete-file tmp1))))
  t t)
#+allegro
;; Allegro's PROBE-FILE doesn't follow the symlink.
(pushnew 'symlink.1 *expected-failures*)

#-windows
(deftest symlink.2
  (let* ((copy (make-temporary-filename *this-directory*))
         (link (make-temporary-filename *this-directory*))
         directory)
    (unwind-protect
        (and
         ;; Copy this file to copy.
         (copy-file *this-file* copy)
         ;; Verify that copy exists.
         (pathnames-equal-p (probe-file copy) copy)
         ;; Create link as a symlink to copy.
         (make-symbolic-link copy link)
         ;; Verify that the symlink appears in the directory listing.
         (setf directory (directory link))
         (= (length directory) 1)
         ;; The directory listing should contain the truename of the symlink.
         (pathnames-equal-p (car directory) (truename link)))
      (progn
        ;; Clean up.
        (when (probe-file link)
          (delete-file link))
        (when (probe-file copy)
          (delete-file copy)))))
  t)
#+allegro
(pushnew 'symlink.2 *expected-failures*)

(deftest ensure-directories-exist.1
  (let* ((tmp (make-temporary-filename *this-directory*))
         (directory-namestring (concatenate 'string (namestring tmp) "/"))
         (file-namestring (concatenate 'string directory-namestring "foo.bar")))
    (multiple-value-bind (path created)
        (ensure-directories-exist file-namestring)
      (values
       ;; 1. "The primary value is the given pathspec..."
       #+(or allegro clisp)
       (eq path file-namestring)
       #-(or allegro clisp)
       (pathnames-equal-p (pathname path) (pathname file-namestring))
       ;; 2. Verify that the directory was created.
       created
       ;; 3. Verify that the directory exists.
       #+clisp
       ;; CLISP's PROBE-DIRECTORY just returns T.
       (ext:probe-directory directory-namestring)
       #-clisp
       (pathnames-equal-p (probe-file directory-namestring)
                          (pathname directory-namestring))
       ;; 4. Delete the directory.
       #+allegro
       (when (excl:probe-directory directory-namestring)
         (excl:delete-directory directory-namestring))
       #+clisp
       (when (ext:probe-directory directory-namestring)
         (ext:delete-dir directory-namestring))
       #-(or allegro clisp)
       (when (probe-file directory-namestring)
         #-(or cmu sbcl) (delete-file directory-namestring)
         #+cmu (unix:unix-rmdir directory-namestring)
         #+sbcl (zerop (sb-posix:rmdir directory-namestring)))
       ;; 5. Verify that the directory is no longer there.
       #-clisp
       (probe-file directory-namestring)
       #+clisp
       (ext:probe-directory directory-namestring))))
  t t t t nil)

(do-tests)
