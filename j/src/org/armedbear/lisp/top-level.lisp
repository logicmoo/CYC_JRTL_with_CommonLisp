;;; top-level.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: top-level.lisp,v 1.25 2004-02-11 00:24:33 piso Exp $
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

;;; Adapted from SB-ACLREPL (originally written by Kevin Rosenberg).

(in-package "TOP-LEVEL")

(import 'sys::%format)

(defvar *null-cmd* (gensym))

(defparameter *command-char* #\:)

(defvar *cmd-number* 1
  "Number of the next command")

(defun prompt-package-name ()
  (let ((result (package-name *package*)))
    (dolist (nickname (package-nicknames *package*))
      (when (< (length nickname) (length result))
        (setf result nickname)))
    result))

(defun repl-prompt-fun (stream)
  (fresh-line stream)
  (when (> *debug-level* 0)
    (%format stream "[~D] " *debug-level*))
  (%format stream "~A(~D): " (prompt-package-name) *cmd-number*))

(defparameter *repl-prompt-fun* #'repl-prompt-fun)

(defun peek-char-non-whitespace (stream)
  (loop
    (let ((c (read-char stream nil)))
      (unless (eql c #\space)
        (unread-char c stream)
        (return c)))))

(defun apropos-command (args)
  (when args (apropos args)))

(defun backtrace-command (args)
  (let ((count (or (and args (ignore-errors (parse-integer args)))
                   most-positive-fixnum))
        (n 0))
    (dolist (frame *saved-backtrace*)
      (%format t "  ~D: ~S~%" n frame)
      (incf n)
      (when (>= n count)
        (return))))
  (values))

(defun continue-command (args)
  (when args
    (let ((n (read-from-string args)))
      (let ((restarts (compute-restarts)))
        (when (< -1 n (length restarts))
          (invoke-restart (nth n restarts)))))))

(defun describe-command (args)
  (let ((obj (eval (read-from-string args))))
    (describe obj)))

(defun error-command (args)
  (when *debug-condition*
    (let* ((s (%format nil "~A" *debug-condition*))
           (len (length s)))
      (when (plusp len)
        (setf (schar s 0) (char-upcase (schar s 0)))
        (unless (eql (schar s (1- len)) #\.)
          (setf s (concatenate 'string s "."))))
      (format *debug-io* "~A~%" s))
    (show-restarts (compute-restarts) *debug-io*)))

(defun inspect-command (args)
  (let ((obj (eval (read-from-string args))))
    (inspect obj)))

(defun macroexpand-command (args)
  (format t "~S~%" (macroexpand (read-from-string args)))
  (values))

(defvar *old-package* nil)

(defun package-command (args)
  (cond ((null args)
         (format *standard-output* "The ~A package is current.~%"
                 (package-name *package*)))
        ((and *old-package* (string= args "-") (null (find-package "-")))
         (rotatef *old-package* *package*))
        (t
         (when (and (plusp (length args)) (eql (char args 0) #\:))
           (setf args (subseq args 1)))
         (setf args (nstring-upcase args))
         (let ((pkg (find-package args)))
           (if pkg
               (setf *old-package* *package*
                     *package* pkg)
               (format *standard-output* "Unknown package ~A.~%" args))))))

(defun reset-command (ignored)
  (invoke-restart 'top-level))

(defun exit-command (ignored)
  (exit))

(defun cd-command (args)
  (cond ((or (null args) (string= args "~"))
         (setf args (namestring (user-homedir-pathname))))
        ((and (> (length args) 1) (string= (subseq args 0 2) "~/")
              (setf args (concatenate 'string
                                      (namestring (user-homedir-pathname))
                                      (subseq args 2))))))
  (let ((dir (probe-directory args)))
    (if dir
        (progn
          (setf *default-pathname-defaults* dir)
          (format t "~A" (namestring *default-pathname-defaults*)))
        (format t "Error: no such directory (~S).~%" args))))

(defun ls-command (args)
  (let ((args (if (stringp args) args "")))
    (run-shell-command (concatenate 'string "ls " args)
                       :directory *default-pathname-defaults*))
  (values))

(defvar *last-files-loaded* nil)

(defun tokenize (string)
  (do* ((res nil)
        (string (string-left-trim " " string)
                (string-left-trim " " (subseq string end)))
        (end (position #\Space string) (position #\Space string)))
       ((zerop (length string)) (nreverse res))
    (unless end
      (setf end (length string)))
    (push (subseq string 0 end) res)))

(defun ld-command (args)
  (let ((files (if args (tokenize args) *last-files-loaded*)))
    (setf *last-files-loaded* files)
    (dolist (file files)
      (load file))))

(defun pwd-command (ignored)
  (format t "~A~%" *default-pathname-defaults*))

(defconstant spaces (make-string 32 :initial-element #\space))

(defun pad (string width)
  (if (< (length string) width)
      (concatenate 'string string (subseq spaces 0 (- width (length string))))
      string))

(defun help-command (ignored)
  (format t "~%  COMMAND     ABBR DESCRIPTION~%")
  (dolist (entry *command-table*)
    (format t "  ~A~A~A~%"
            (pad (entry-name entry) 12)
            (pad (entry-abbr entry) 5)
            (entry-help entry)))
  (format t "~%Commands must be prefixed by the command character, which is '~A' by default.~%~%"
          *command-char*))

(defparameter *command-table*
  '(("apropos" 2 apropos-command "show apropos")
    ("bt" 2 backtrace-command "backtrace n stack frames (default all)")
    ("cd" 2 cd-command "change default directory")
    ("continue" 4 continue-command "invoke restart n")
    ("describe" 2 describe-command "describe an object")
    ("error" 3 error-command "print the current error message")
    ("exit" 2 exit-command "exit lisp")
    ("help" 2 help-command "print this help")
    ("inspect" 2 inspect-command "inspect an object")
    ("ld" 2 ld-command "load a file")
    ("ls" 2 ls-command "list directory")
    ("macroexpand" 2 macroexpand-command "macroexpand an expression")
    ("package" 2 package-command "change current package")
    ("pwd" 3 pwd-command "print current directory")
    ("reset" 3 reset-command "return to top level")))

(defun entry-name (entry)
  (first entry))

(defun entry-min-len (entry)
  (second entry))

(defun entry-abbr (entry)
  (if (< (entry-min-len entry) (length (entry-name entry)))
      (subseq (entry-name entry) 0 (entry-min-len entry))
      ""))

(defun entry-command (entry)
  (third entry))

(defun entry-help (entry)
  (fourth entry))

(defun find-command (string)
  (let ((len (length string)))
    (dolist (entry *command-table*)
      (let ((min-len (entry-min-len entry)))
        (when (and (>= len min-len)
                   (string-equal (entry-name entry) string :end1 len))
          (return (entry-command entry)))))))

(defun process-cmd (form)
  (when (eq form *null-cmd*)
    (return-from process-cmd t))
  (when (and (stringp form)
             (> (length form) 1)
             (eql (char form 0) *command-char*))
    (let* ((pos (position #\space form))
           (cmd (subseq form 1 pos))
           (args (if pos (subseq form (1+ pos)) nil)))
      (when args
        (setf args (string-trim " " args))
        (when (zerop (length args))
          (setf args nil)))
      (let ((fun (find-command cmd)))
        (if fun
            (funcall fun args)
            (%format t "Unknown top-level command ~S.~%" cmd)))
      (return-from process-cmd t)))
  nil)

(defun read-cmd (stream)
  (let ((c (peek-char-non-whitespace stream)))
    (cond ((eql c *command-char*)
           (read-line stream))
          ((eql c #\newline)
           (read-line stream)
           *null-cmd*)
          (t
           (read stream nil)))))

(defun repl-read-form-fun (in out)
  (loop
    (funcall *repl-prompt-fun* out)
    (finish-output out)
    (let ((form (read-cmd in)))
      (setf (charpos out) 0)
      (unless (eq form *null-cmd*)
        (incf *cmd-number*))
      (cond ((process-cmd form))
            ((and (> *debug-level* 0)
                  (fixnump form))
             (let ((n form)
                   (restarts (compute-restarts)))
               (if (< -1 n (length restarts))
                   (invoke-restart (nth n restarts))
                   (return form))))
            (t
             (return form))))))

(defparameter *repl-read-form-fun* #'repl-read-form-fun)

(defun repl ()
  (loop
    (let* ((form (funcall *repl-read-form-fun*
                          *standard-input*
                          *standard-output*))
           (results (multiple-value-list (sys::interactive-eval form)))
           (*print-length* 10))
      (dolist (result results)
        (fresh-line)
        (prin1 result)))))

(defun top-level-loop ()
  (fresh-line)
  (%format t "Type :HELP for a list of available commands.~%")
  (loop
      (with-simple-restart (top-level
                            "Return to top level.")
        #+j
        (handler-case
            (repl)
          (stream-error (c) (return-from top-level-loop)))
        #-j
        (repl))))
