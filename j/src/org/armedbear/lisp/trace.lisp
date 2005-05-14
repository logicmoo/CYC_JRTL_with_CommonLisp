;;; trace.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: trace.lisp,v 1.14 2005-05-14 15:35:55 piso Exp $
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

(in-package #:system)

(require 'format)

;; (defconstant *untraced-function* (make-symbol "untraced-function"))

;; (defvar *traced-functions* nil)
(defvar *trace-info-hashtable* (make-hash-table :test #'equal))

(defstruct trace-info name untraced-function breakp)

(defvar *trace-depth* 0)

(defun list-traced-functions ()
  (copy-list *traced-names*))

(defmacro trace (&rest args)
  (if args
;;       `(progn
;;         (setf *trace-depth* 0)
;;         (expand-trace ',args))
      (expand-trace args)
      `(list-traced-functions)))

(defun expand-trace (args)
  (let ((results ())
        (breakp nil))
    (let ((index (position :break args)))
      (when index
        (setf breakp (nth (1+ index) args))
        (setf args (append (subseq args 0 index) (subseq args (+ index 2))))))
    (dolist (arg args)
;;       (if (trace-1 arg breakp)
;;           (push arg results))
      (push `(trace-1 ',arg ,breakp) results)
      )
;;     results
    `(list ,@(nreverse results))
    ))

(defun trace-1 (name breakp)
  (unless (fboundp name)
    (error "~S is not the name of a function." name))
  (if (member name *traced-names* :test #'equal)
      (format t "~S is already being traced." name)
      (let* ((untraced-function (fdefinition name))
             (traced-function
              (lambda (&rest args)
                (with-standard-io-syntax
                  (let ((*print-readably* nil)
                        (*print-structure* nil))
                    (format *trace-output* (indent "~D: ~S~%") *trace-depth*
                            (cons name args))))
                (when breakp
                  (break))
                (incf *trace-depth*)
                (let ((r (multiple-value-list (apply untraced-function args))))
                  (decf *trace-depth*)
                  (with-standard-io-syntax
                    (let ((*print-readably* nil)
                          (*print-structure* nil))
                      (format *trace-output* (indent "~D: ~A returned") *trace-depth* name)
                      (dolist (val r)
                        (format *trace-output* " ~S" val))
                      (terpri *trace-output*)))
                  (values-list r)))))
        (let ((*warn-on-redefinition* nil))
;;           (setf (symbol-function name) traced-function))
          (setf (fdefinition name) traced-function))
;;         (setf (get name *untraced-function*) untraced-function)
        (setf (gethash name *trace-info-hashtable*)
              (make-trace-info :name name
                               :untraced-function untraced-function))
        (push name *traced-names*)
        name)))

(defun trace-redefined-update (name)
;;   (format t "traced function ~S was redefined~%" name)
  )

(defun indent (string)
  (concatenate 'string
               (make-string (* (1+ *trace-depth*) 2) :initial-element #\space)
               string))

(defmacro untrace (&rest args)
  (cond ((null args)
         `(progn
            (untrace-all)
            (setf *trace-depth* 0)
            t))
        (t
         `(progn
            (untrace-n ',args)
            (setf *trace-depth* 0)
            t))))

(defun untrace-all ()
  (dolist (arg *traced-names*)
    (untrace-1 arg)))

(defun untrace-n (args)
  (dolist (arg args)
    (if (member arg *traced-names* :test #'equal)
        (untrace-1 arg)
        (format t "~S is not being traced.~%" arg))))

(defun untrace-1 (name)
;;   (let ((untraced-function (get name *untraced-function*))
  (let* ((trace-info (gethash name *trace-info-hashtable*))
         (untraced-function (trace-info-untraced-function trace-info))
         (*warn-on-redefinition* nil))
;;     (setf (symbol-function symbol) untraced-function)
    (setf (fdefinition name) untraced-function)
;;     (remprop symbol *untraced-function*)
    (remhash name *trace-info-hashtable*)
    (setf *traced-names* (remove name *traced-names*))))

#+nil
(defun fset (name function &optional source-position arglist)
  (let ((trace-p (find name *traced-names* :test #'equal)))
    (cond ((symbolp name)
           (check-redefinition name)
           (record-source-information name nil source-position)
           (when arglist
             (%set-arglist function arglist))
           (%set-symbol-function name function))
          ((and (consp name) (eq (%car name) 'SETF))
           (check-redefinition name)
           (record-source-information name nil source-position)
           ;; FIXME arglist
           (setf (get (cadr name) 'setf-function) function))
          (t
           (error 'type-error "~S is not a valid function name." name)))
    (when (functionp function) ; FIXME Is this test needed?
      (%set-lambda-name function name))))
