;;; top-level.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: top-level.lisp,v 1.1 2003-09-25 18:19:04 piso Exp $
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

(defparameter *command-char* #\:)

(defvar *cmd-number* 1
  "Number of the next command")

(defun prompt-package-name ()
  (car (sort (append
              (package-nicknames cl:*package*)
              (list (package-name cl:*package*)))
             (lambda (a b) (< (length a) (length b))))))

(defun repl-prompt-fun (stream)
  (fresh-line stream)
  (write-string (prompt-package-name) stream)
  (write-string "(" stream)
  (princ *cmd-number* stream)
  (write-string "): " stream))

(defparameter *repl-prompt-fun* #'repl-prompt-fun)

(defvar *last-files-loaded* nil)

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

(defun tokenize (string)
  (do* ((res nil)
        (string (string-left-trim " " string)
                (string-left-trim " " (subseq string end)))
        (end (position #\Space string) (position #\Space string)))
       ((zerop (length string)) (nreverse res))
    (unless end
      (setf end (length string)))
    (push (subseq string 0 end) res)))

(defun process-cmd (form)
  (when (and (stringp form) (> (length form) 1) (eql (char form 0) *command-char*))
    (let* ((pos (position #\Space form))
           (cmd (subseq form 1 pos))
           (args (if pos (subseq form (1+ pos)) nil)))
      (when args
        (setf args (string-trim " " args))
        (when (zerop (length args))
          (setf args nil)))
      (cond ((string= cmd "ld")
             (let ((files (if args (tokenize args) *last-files-loaded*)))
               (setf *last-files-loaded* files)
               (dolist (file files)
                 (load file)))
             )
            ((string= cmd "de")
             (let ((obj (eval (read-from-string args))))
               (describe obj)))
            ((string= cmd "ap")
             (apropos args))
            ((string= cmd "pwd")
             (format t "~A~%" *default-pathname-defaults*))
            ((string= cmd "cd")
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
                     (format *standard-output* "~A" (namestring *default-pathname-defaults*)))
                   (format *standard-output* "Error: no such directory (~S).~%" args))))
            ((string= cmd "ex")
             (format t "Bye!~%")
             (exit))
            (t
             (format *standard-output* "Unknown top-level command ~S.~%" cmd)
             )))
    (return-from process-cmd t))
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

(defun interactive-eval (form)
  (setf - form)
  (let ((results
	 (multiple-value-list (eval form))))
    (setf /// //
	  // /
	  / results
	  *** **
	  ** *
	  * (car results)))
  (setf +++ ++
	++ +
	+ -)
  (values-list /))

(defun repl-fun ()
  (loop
    (funcall *repl-prompt-fun* *standard-output*)
    (finish-output *standard-output*)
    (let* ((form (funcall *repl-read-form-fun*
                          *standard-input*
                          *standard-output*))
           (results (multiple-value-list (interactive-eval form))))
      (dolist (result results)
        (fresh-line)
        (prin1 result)))))

(defvar *in-top-level-loop* nil)

(defun top-level-loop ()
  (setf *in-top-level-loop* t)
  (loop
    (catch 'top-level
      (handler-case
          (repl-fun)
        (error (c) (format t "Error: ~S.~%" c) (throw 'top-level nil))))))
