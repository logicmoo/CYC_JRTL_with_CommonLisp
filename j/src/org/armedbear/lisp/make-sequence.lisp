;;; make-sequence.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: make-sequence.lisp,v 1.7 2004-01-17 17:28:44 piso Exp $
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

;;; Adapted from ECL.

(defun size-mismatch-error (type size)
  (error 'simple-type-error
         :format-control "The requested length (~D) does not match the specified type ~A."
         :format-arguments (list size type)))

(defun make-sequence (type size	&key (initial-element nil iesp))
  (let (element-type sequence)
    (setf type (normalize-type type))
    (if (atom type)
        (cond ((memq type '(LIST CONS))
               (when (zerop size)
                 (if (eq type 'CONS)
                     (size-mismatch-error type size)
                     (return-from make-sequence nil)))
               (return-from make-sequence
                            (if iesp
                                (make-list size :initial-element initial-element)
                                (make-list size))))
              ((memq type '(STRING SIMPLE-STRING BASE-STRING SIMPLE-BASE-STRING))
               (return-from make-sequence
                            (if iesp
                                (make-string size :initial-element initial-element)
                                (make-string size))))
              ((eq type 'NULL)
               (if (zerop size)
                   (return-from make-sequence nil)
                   (size-mismatch-error type size)))
              (t
               (when (classp type)
                 (setf type (class-name type)))
               (setq element-type
                     (cond ((memq type '(BIT-VECTOR SIMPLE-BIT-VECTOR)) 'BIT)
                           ((memq type '(VECTOR SIMPLE-VECTOR)) t)
                           (t
                            (error 'simple-type-error
                                   :format-control "~S is not a sequence type."
                                   :format-arguments (list type)))))))
        (let ((name (car type))
              (args (cdr type)))
          (when (eq name 'LIST)
            (return-from make-sequence
                         (if iesp
                             (make-list size :initial-element initial-element)
                             (make-list size))))
          (when (eq name 'CONS)
            (unless (plusp size)
              (size-mismatch-error name size))
            (return-from make-sequence
                         (if iesp
                             (make-list size :initial-element initial-element)
                             (make-list size))))
          (unless (memq name '(ARRAY VECTOR SIMPLE-VECTOR BIT-VECTOR
                               SIMPLE-BIT-VECTOR STRING SIMPLE-STRING
                               BASE-STRING SIMPLE-BASE-STRING))
            (error 'simple-type-error
                   :format-control "~S is not a sequence type."
                   :format-arguments (list type)))
          (let ((len nil))
            (cond ((memq name '(STRING SIMPLE-STRING BASE-STRING SIMPLE-BASE-STRING))
                   (setq element-type 'character
                         len (car args)))
                  (t
                   (setq element-type (or (car args) t)
                         len (cadr args))))
            (unless (or (null len) (eq len '*) (equal len '(*)))
              (when (/= size len)
                (size-mismatch-error type size))))))
    (setq sequence
          (if iesp
              (make-array size :element-type element-type :initial-element initial-element)
              (make-array size :element-type element-type)))
    sequence))
