;;; make-sequence.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: make-sequence.lisp,v 1.2 2003-06-11 00:22:18 piso Exp $
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

(in-package "COMMON-LISP")

(export 'make-sequence)

;;; MAKE-SEQUENCE (from ECL)

;;; Returns two values:
;;;  VALUE-1 = normalized type name or object
;;;  VALUE-2 = normalized type arguments or nil
(defun normalize-type (type)
  (let (tp i fd)
    (cond ((symbolp type)
           (values type nil))
          ((consp type)
           (setq tp (car type) i (cdr type))
           (if (and (eq tp 'INTEGER) (consp (cadr i)))
               (values tp (list (car i) (1- (caadr i))))
               (values tp i)))
          (t
           (error "normalize-type: bogus type specifier ~A" type)))))


(defun make-sequence (type size	&key (initial-element nil iesp))
  (let (element-type sequence)
    (if (atom type)
        (cond ((memq type '(LIST CONS))
               (when (zerop size)
                 (if (eq type 'CONS)
                     (error 'type-error
                            "the requested length (0) does not match the specified type CONS")
                     (return-from make-sequence nil)))
               (return-from make-sequence
                            (if iesp
                                (make-list size :initial-element initial-element)
                                (make-list size))))
              ((memq type '(STRING SIMPLE-STRING))
               (return-from make-sequence
                            (if iesp
                                (make-string size :initial-element initial-element)
                                (make-string size))))
              ((eq type 'NULL)
               (if (zerop size)
                   (return-from make-sequence nil)
                   (error 'type-error
                          "the requested length (~A) does not match the specified type NULL"
                          size)))
              (t
               (setq element-type
                     (cond ((memq type '(BIT-VECTOR SIMPLE-BIT-VECTOR)) 'BIT)
                           ((memq type '(VECTOR SIMPLE-VECTOR)) t)
                           (t
                            (error 'type-error "~S is not a sequence type" type))))))
        (multiple-value-bind (name args) (normalize-type type)
          (when (memq name '(LIST CONS))
            (return-from make-sequence
                         (if iesp
                             (make-list size :initial-element initial-element)
                             (make-list size))))
          (unless (memq name '(ARRAY VECTOR SIMPLE-VECTOR BIT-VECTOR
                               SIMPLE-BIT-VECTOR STRING SIMPLE-STRING))
            (error 'type-error "~S is not a sequence type" type))
          (let ((len nil))
            (cond ((memq name '(STRING SIMPLE-STRING))
                   (setq element-type 'character
                         len (car args)))
                  (t
                   (setq element-type (or (car args) t)
                         len (cadr args))))
            (unless (or (null len) (eq len '*))
              (when (/= size len)
                (error 'type-error
                       "the requested length (~A) does not match the specified type ~A"
                       size type))))))
    (setq sequence
          (if iesp
              (make-array size :element-type element-type :initial-element initial-element)
              (make-array size :element-type element-type)))
    sequence))
