;;; dump-form.lisp
;;;
;;; Copyright (C) 2004-2005 Peter Graves
;;; $Id: dump-form.lisp,v 1.1 2005-07-18 13:41:41 piso Exp $
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

(export 'dump-form)

(declaim (ftype (function (t stream) t) dump-list))
(defun dump-list (object stream)
  (cond ((and (eq (car object) 'QUOTE) (null (cddr object)))
         (%stream-write-char #\' stream)
         (dump-object (%cadr object) stream))
        (t
         (%stream-write-char #\( stream)
         (loop
           (dump-object (car object) stream)
           (setf object (cdr object))
           (when (null object)
             (return))
           (when (> (charpos stream) 80)
             (%stream-terpri stream))
           (%stream-write-char #\space stream)
           (when (atom object)
             (%stream-write-char #\. stream)
             (%stream-write-char #\space stream)
             (dump-object object stream)
             (return)))
         (%stream-write-char #\) stream))))

(declaim (ftype (function (t stream) t) dump-vector))
(defun dump-vector (object stream)
  (write-string "#(" stream)
  (let ((length (length object)))
    (when (> length 0)
      (dotimes (i (1- length))
        (dump-object (aref object i) stream)
        (when (> (charpos stream) 80)
          (%stream-terpri stream))
        (%stream-write-char #\space stream))
      (dump-object (aref object (1- length)) stream))
    (%stream-write-char #\) stream)))

(declaim (ftype (function (t stream) t) dump-structure))
(defun dump-structure (object stream)
  (multiple-value-bind (creation-form initialization-form)
      (make-load-form object)
    (write-string "#." stream)
    (if initialization-form
        (let* ((instance (gensym))
               load-form)
          (setf initialization-form
                (subst instance object initialization-form))
          (setf initialization-form
                (subst instance (list 'quote instance) initialization-form
                       :test #'equal))
          (setf load-form `(progn
                             (let ((,instance ,creation-form))
                               ,initialization-form
                               ,instance)))
          (dump-object load-form stream))
        (dump-object creation-form stream))))

(declaim (ftype (function (t stream) t) dump-object))
(defun dump-object (object stream)
  (cond ((consp object)
         (dump-list object stream))
        ((stringp object)
         (write object :stream stream))
        ((bit-vector-p object)
         (write object :stream stream))
        ((vectorp object)
         (dump-vector object stream))
        ((structure-object-p object)
         (dump-structure object stream))
        (t
         (write object :stream stream))))

(declaim (ftype (function (t stream) t) dump-form))
(defun dump-form (form stream)
  (let ((*print-fasl* t)
        (*print-level* nil)
        (*print-length* nil)
        (*print-circle* nil)
        (*print-structure* t))
    (dump-object form stream)
    (%stream-terpri stream)))

(provide 'dump-form)
