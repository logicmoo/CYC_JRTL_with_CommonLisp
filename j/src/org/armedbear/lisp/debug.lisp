;;; debug.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: debug.lisp,v 1.11 2003-12-14 17:16:04 piso Exp $
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

(in-package "EXTENSIONS")

(export '*debug-condition*)

(defvar *debug-condition* nil)

(in-package "SYSTEM")

(defun debug-loop ()
  (let ((tpl::*break-level* (1+ tpl::*break-level*)))
  (fresh-line *debug-io*)
  (%format *debug-io* "Type :CONTINUE to return from break or :RESET to return to top level.~%")
    (loop
      (catch 'debug-loop-catcher
        (handler-case
            (tpl::repl)
          (error (c) (%format t "Error: ~S.~%" c) (break) (throw 'debug-loop-catcher nil)))))))

(defun invoke-debugger (condition)
  (when *debugger-hook*
    (let ((hook-function *debugger-hook*)
          (*debugger-hook* nil))
      (funcall hook-function condition hook-function)))
  (setf *debug-condition* condition)
  (when condition
    (fresh-line *debug-io*)
    (%format *debug-io* "Debugger invoked on condition of type ~A:~%" (type-of condition))
    (%format *debug-io* "  ~A~%" condition))
  (catch 'tpl::continue-catcher
    (clear-input)
    (debug-loop)))

(defun break (&optional format-control &rest format-arguments)
  (fresh-line *debug-io*)
  (%format *debug-io* "BREAK called.~%")
  (if format-control
      (apply #'%format *debug-io* format-control format-arguments))
  (invoke-debugger nil))
