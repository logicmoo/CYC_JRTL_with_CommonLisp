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

(unless (member "RT" *modules* :test #'string=)
  (unless (ignore-errors (logical-pathname-translations "ansi-tests"))
    (error "~S is not defined as a logical pathname host." "ansi-tests"))
  (load "ansi-tests:rt-package.lsp")
  (load #+abcl (compile-file-if-needed "ansi-tests:rt.lsp")
        ;; Force compilation to avoid fasl name conflict between SBCL and
        ;; Allegro.
        #-abcl (compile-file "ansi-tests:rt.lsp"))
  (provide "RT"))

(rt:rem-all-tests)

(let ((*package* (find-package '#:rt)))
  (export (find-symbol (string '#:*expected-failures*))))

(setf rt:*expected-failures* nil)

(defpackage #:file-system-tests (:use #:cl #:regression-test
                                        #+abcl #:ext))

(in-package #:file-system-tests)

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

#-windows
(deftest symlink.1
  (let* ((tmp1 (make-temporary-filename *this-directory*))
         (command1 (concatenate 'string "cp "
                                (namestring *this-file*)
                                " "
                                (namestring tmp1))))
    (unwind-protect
        (let* ((tmp2 (make-temporary-filename *this-directory*))
               (command2 (concatenate 'string "ln -sf "
                                      (namestring tmp1)
                                      " "
                                      (namestring tmp2))))
          (values
           (unwind-protect
               (and
                ;; Copy this file.
                (zerop (run-shell-command command1 :directory *this-directory*))
                (pathnames-equal-p (probe-file tmp1) tmp1)
                ;; Create a symlink to the copy.
                (zerop (run-shell-command command2 :directory *this-directory*))
                ;; Verify that the symlink exists and points to the copy.
                (pathnames-equal-p (probe-file tmp2) tmp1)
                (pathnames-equal-p (truename tmp2) tmp1))
             (when (probe-file tmp2)
               (delete-file tmp2)))
           ;; Copy should still exist after symlink is deleted.
           (pathnames-equal-p (probe-file tmp1) tmp1)))
      (when (probe-file tmp1)
        (delete-file tmp1))))
  t t)
#+allegro
;; Allegro's PROBE-FILE doesn't follow the symlink, which is a bug.
(pushnew 'symlink.1 *expected-failures*)

(do-tests)
