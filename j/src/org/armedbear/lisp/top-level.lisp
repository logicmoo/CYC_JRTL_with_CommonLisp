;;; top-level.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: top-level.lisp,v 1.16 2003-12-08 02:59:08 piso Exp $
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

(defvar *break-level* 0)

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
  (when (> *break-level* 0)
    (%format stream "[~D] " *break-level*))
  (%format stream "~A(~D): " (prompt-package-name) *cmd-number*))

(defparameter *repl-prompt-fun* #'repl-prompt-fun)

(defun peek-char-non-whitespace (stream)
  (loop
    (let ((c (read-char stream nil)))
      (unless (eql c #\Space)
        (unread-char c stream)
        (return c)))))

(defun read-cmd (stream)
  (let ((c (peek-char-non-whitespace stream)))
    (if (eql c *command-char*)
        (read-line stream)
        (read stream nil))))

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

(defun continue-command (ignored)
  (if (> *break-level* 0)
      (throw 'continue-catcher nil)))

(defun describe-command (args)
  (let ((obj (eval (read-from-string args))))
    (describe obj)))

(defun inspect-command (args)
  (let ((obj (eval (read-from-string args))))
    (inspect obj)))

(defun macroexpand-command (args)
  (format t "~S~%" (macroexpand (read-from-string args)))
  (values))

(defun package-command (args)
  (cond ((null args)
         (format *standard-output* "The ~A package is current.~%"
                 (package-name *package*)))
        (t
         (when (and (plusp (length args)) (eql (char args 0) #\:))
           (setf args (subseq args 1)))
         (setf args (nstring-upcase args))
         (let ((pkg (find-package args)))
           (if pkg
               (setf *package* pkg)
               (format *standard-output* "Unknown package ~A.~%" args))))))

(defun reset-command (ignored)
  (throw 'top-level-catcher nil))

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
            (entry-help entry)
            ))
  (format t "~%Commands must be prefixed by the command character, which is '~A' by default.~%~%"
          *command-char*))

(defparameter *command-table*
  '(("apropos" 2 apropos-command "show apropos")
    ("bt" 2 backtrace-command "backtrace n stack frames (default all)")
    ("cd" 2 cd-command "change default directory")
    ("continue" 4 continue-command "return from break")
    ("describe" 2 describe-command "describe an object")
    ("exit" 2 exit-command "exit lisp")
    ("help" 2 help-command "print this help")
    ("inspect" 2 inspect-command "inspect an object")
    ("ld" 2 ld-command "load a file")
    ("macroexpand" 2 macroexpand-command "macroexpand an expression")
    ("package" 2 package-command "change current package")
    ("pwd" 3 pwd-command "print current directory")
    ("reset" 3 reset-command "return to top level")
    ))

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
  (when (and (stringp form) (> (length form) 1) (eql (char form 0) *command-char*))
    (let* ((pos (position #\Space form))
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

(defun repl-read-form-fun (in out)
  (loop
    (let ((form (read-cmd in)))
      (setf (charpos out) 0)
      (incf *cmd-number*)
      (cond ((process-cmd form)
             (funcall *repl-prompt-fun* *standard-output*)
             (finish-output *standard-output*))
            (t
             (return form))))))

(defparameter *repl-read-form-fun* #'repl-read-form-fun)

(defun repl ()
  (loop
    (funcall *repl-prompt-fun* *standard-output*)
    (finish-output *standard-output*)
    (let* ((form (funcall *repl-read-form-fun*
                          *standard-input*
                          *standard-output*))
           (results (multiple-value-list (sys::interactive-eval form))))
      (dolist (result results)
        (fresh-line)
        (prin1 result)))))

(defun top-level-loop ()
  (fresh-line)
  (%format t "Type :HELP for a list of top-level commands.~%")
  (loop
    (catch 'top-level-catcher
      (handler-case
          (repl)
        #+j (stream-error (c) (return-from top-level-loop)) ; FIXME
        (error (c) (%format t "Error: ~S.~%" c) (break) (throw 'top-level-catcher nil))))))
