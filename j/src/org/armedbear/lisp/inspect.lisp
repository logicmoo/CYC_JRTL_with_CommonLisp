;;; inspect.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: inspect.lisp,v 1.5 2004-05-22 19:34:26 piso Exp $
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

(in-package "SYSTEM")

(require 'clos)

(require 'format)

(defun leader (name)
  (let ((size (max 0 (- 12 (length name)))))
    (concatenate 'string (make-string size :initial-element #\-) "->")))

(defun safe-length (x)
  (do ((n 0 (+ n 2))
       (fast x (cddr fast))
       (slow x (cdr slow)))
      (())
    (when (null fast)
      (return (values n :proper)))
    (when (atom fast)
      (return (values n :dotted)))
    (when (null (cdr fast))
      (return (values (+ n 1) :proper)))
    (when (atom (cdr fast))
      (return (values (+ n 1) :dotted)))
    (when (and (eq fast slow) (> n 0))
      (return (values nil :circular)))))

(defun inspect (obj)
  (cond ((typep obj 'standard-object)
         (format t "~A at #x~X~%" (inspected-description obj) (identity-hash-code obj))
         (do ((slots (class-slots (class-of obj)) (cdr slots))
              (i 0 (1+ i)))
             ((null slots))
           (let* ((slot (car slots))
                  (name (slot-definition-name slot)))
             (format t "~4D ~A -> ~S~%" i name
                     (if (slot-boundp obj name) (slot-value obj name) +slot-unbound+)))))
        ((vectorp obj)
         (format t "~A at #x~X~%" (inspected-description obj) (identity-hash-code obj))
         (let ((limit (min (length obj) 25)))
           (dotimes (i limit)
             (format t "~4D-> ~A~%" i (inspected-description (aref obj i))))))
        ((consp obj)
         (multiple-value-bind (len kind) (safe-length obj)
           (case kind
             (:proper
              (format t "A proper list with ~D elements at #x~X~%"
                      len
                      (identity-hash-code obj))
              (let ((i 0))
                (dolist (item obj)
                  (cond ((< i 25)
                         (format t "~4D-> ~A~%" i (inspected-description item)))
                        ((= i 25)
                         (format t "    ...~%"))
                        ((= i (1- len))
                         (format t "~4D-> ~A~%" i (inspected-description item))))
                  (incf i))))
             (:dotted
              (format t "A dotted list with ~D elements at #x~X~%"
                      len
                      (identity-hash-code obj))
              (let* ((rest obj)
                     (item (car rest))
                     (i 0))
                (loop
                  (cond ((< i 25)
                         (format t "~4D-> ~A~%" i (inspected-description item)))
                        ((= i 25)
                         (format t "    ...~%")))
                  (incf i)
                  (setf rest (cdr rest))
                  (when (atom rest)
                    (return))
                  (setf item (car rest)))
                (format t "tail-> ~A~%" (inspected-description rest))))
             (:circular
              (format t "A circular list at #x~X~%" (identity-hash-code obj))))))
        (t
         (format t "~A at #x~X~%" (inspected-description obj) (identity-hash-code obj))
         (let ((parts (inspected-parts obj))
               (i 0))
           (dolist (part parts)
             (let ((name (car part))
                   (value (cdr part)))
               (format t "~4D ~A ~A ~A~%" i
                       name
                       (leader name)
                       (inspected-description value))
               (incf i))))))
  (values))
