;;; fdefinition.lisp
;;;
;;; Copyright (C) 2005-2006 Peter Graves
;;; $Id: fdefinition.lisp,v 1.17 2006-03-17 01:33:42 piso Exp $
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

(export '(record-source-information untraced-function))

(defun check-redefinition (name)
  (when (and *warn-on-redefinition* (fboundp name) (not (autoloadp name)))
    (cond ((symbolp name)
           (let ((old-source (source-pathname name))
                 (current-source (or *source* :top-level)))
             (cond ((equal old-source current-source)) ; OK
                   (t
                    (if (eq current-source :top-level)
                        (style-warn "redefining ~S at top level" name)
                        (let ((*package* +cl-package+))
                          (if (eq old-source :top-level)
                              (style-warn "redefining ~S in ~S (previously defined at top level)"
                                          name current-source)
                              (style-warn "redefining ~S in ~S (previously defined in ~S)"
                                          name current-source old-source)))))))))))

(defun record-source-information (name &optional source-pathname source-position)
  (unless source-pathname
    (setf source-pathname (or *source* :top-level)))
  (unless source-position
    (setf source-position *source-position*))
  (let ((source (if source-position
                    (cons source-pathname source-position)
                    source-pathname)))
    (cond ((symbolp name)
           (put name '%source source)))))

;; Redefined in trace.lisp.
(defun trace-redefined-update (&rest args)
  (declare (ignore args))
  )

;; Redefined in trace.lisp.
(defun untraced-function (name)
  (declare (ignore name))
  nil)

(defun fset (name function &optional source-position arglist documentation)
  (cond ((symbolp name)
         (check-redefinition name)
         (record-source-information name nil source-position)
         (when arglist
           (%set-arglist function arglist))
         (%set-documentation function 'function documentation)
         (%set-symbol-function name function))
        ((setf-function-name-p name)
         (check-redefinition name)
         (record-source-information name nil source-position)
         ;; FIXME arglist documentation
         (setf (get (%cadr name) 'setf-function) function))
        (t
         (require-type name '(or symbol (cons (eql setf) (cons symbol null))))))
  (when (functionp function) ; FIXME Is this test needed?
    (%set-lambda-name function name))
  (trace-redefined-update name function)
  function)

(defun fdefinition (name)
  (cond ((symbolp name)
         (symbol-function name))
        ((setf-function-name-p name)
         (or (get (%cadr name) 'setf-function)
             (error 'undefined-function :name name)))
        (t
         (require-type name '(or symbol (cons (eql setf) (cons symbol null)))))))

(defun %set-fdefinition (name function)
  (fset name function))

(defsetf fdefinition %set-fdefinition)
