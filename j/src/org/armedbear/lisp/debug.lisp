;;; debug.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: debug.lisp,v 1.25 2004-08-25 17:47:10 piso Exp $
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

;;; Adapted from SBCL.

(in-package "EXTENSIONS")

(export '(*debug-condition* *debug-level* show-restarts))

(defvar *debug-condition* nil)

(defvar *debug-level* 0)

(in-package "SYSTEM")

(defun show-restarts (restarts stream)
  (when restarts
    (fresh-line stream)
    (%format stream "Restarts:~%")
    (let ((max-name-len 0))
      (dolist (restart restarts)
        (let ((name (restart-name restart)))
          (when name
            (let ((len (length (princ-to-string name))))
              (when (> len max-name-len)
                (setf max-name-len len))))))
      (let ((count 0))
        (dolist (restart restarts)
          (let ((name (restart-name restart))
                (report-function (restart-report-function restart)))
            (%format stream "  ~D: ~A" count name)
            (when (functionp report-function)
              (dotimes (i (1+ (- max-name-len (length (princ-to-string name)))))
                (write-char #\space stream))
              (funcall report-function stream))
            (terpri stream))
          (incf count))))))

(defun internal-debug ()
  (if (fboundp 'tpl::repl)
      (let ((in (two-way-stream-input-stream *debug-io*))
            (out (two-way-stream-output-stream *debug-io*)))
        (loop
          (tpl::repl in out)))
      (quit)))

(defun debug-loop ()
  (let ((*debug-level* (1+ *debug-level*)))
    (show-restarts (compute-restarts) *debug-io*)
    (internal-debug)))

(defun invoke-debugger-report-condition (condition)
  (when condition
    (fresh-line *debug-io*)
    (when (and *load-truename* (streamp *load-stream*))
      (%format *debug-io*
               "Error loading ~A at line ~D (offset ~D).~%"
               *load-truename*
               (stream-line-number *load-stream*)
               (stream-offset *load-stream*)))
    (%format *debug-io*
             (if (fboundp 'tpl::repl)
                 "Debugger invoked on condition of type ~A:~%"
                 "Unhandled condition of type ~A:~%")
             (type-of condition))
    (if (and (fboundp 'print-object)
             (not (autoloadp 'print-object)))
        (progn
          (write-string "  " *debug-io*)
          (let ((*print-escape* nil))
            (print-object condition *debug-io*))
          (terpri *debug-io*))
        (%format *debug-io* "  ~A~%" condition))))

(defun invoke-debugger (condition)
  (when *debugger-hook*
    (let ((hook-function *debugger-hook*)
          (*debugger-hook* nil))
      (funcall hook-function condition hook-function)))
  (invoke-debugger-report-condition condition)
  (unless (fboundp 'tpl::repl)
    (quit))
  (let ((original-package *package*))
    (with-standard-io-syntax
      (let ((*package* original-package)
            (*print-readably* nil) ;; Top-level default.
            (*debug-condition* condition)
            (level *debug-level*))
        (clear-input)
        (if (> level 0)
            (with-simple-restart (abort "Return to debug level ~D." level)
              (debug-loop))
            (debug-loop))))))

(defun break (&optional (format-control "BREAK called") &rest format-arguments)
  (let ((*debugger-hook* nil) ; Specifically required by ANSI.
        (*saved-backtrace* (backtrace-as-list)))
    (with-simple-restart (continue "Return from BREAK.")
      (invoke-debugger
       (%make-condition 'simple-condition
                        (list :format-control format-control
                              :format-arguments format-arguments))))
    nil))
