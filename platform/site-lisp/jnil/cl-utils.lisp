;;; -*- mode: lisp; package: cl-utils -*-
;;; Copyright (c) 2004-2005 Tiago Maduro-Dias. All Rights Reserved.
;;;
;;; This code is free software; you can redistribute it and/or
;;; modify it under the terms of the version 2.1 of
;;; the GNU Lesser General Public License as published by 
;;; the Free Software Foundation, as clarified by the preamble
;;; found in license-llgpl.txt.
;;;
;;; This code is distributed in the hope that it will be useful,
;;; but without any warranty; without even the implied warranty of
;;; merchantability or fitness for a particular purpose. See the GNU
;;; Lesser General Public License for more details.
;;;
;;; Version 2.1 of the GNU Lesser General Public License is in the file 
;;; license-lgpl.txt that was distributed with this file.
;;; If it is not present, you can access it from
;;; http://www.gnu.org/copyleft/lesser.txt (until superseded by a newer
;;; version) or write to the Free Software Foundation, Inc., 59 Temple Place, 
;;; Suite 330, Boston, MA  02111-1307  USA
;;;
;;; $Id: cl-utils.lisp,v 1.1.1.1 2006/04/23 17:11:35 tdias Exp $
;;;
;;; Description: General CL extensions, accessible by the whole application.
;;;
;;; -- start of cl-utils.lisp --

(defpackage :cl-utils)

(in-package :cl-utils)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defmacro aif (binding test-form then-form &optional else-form)
  `(let ((,binding ,test-form))
     (if ,binding ,then-form ,else-form)))

(defun keywrd (&rest args)
  (intern (apply #'mkstr args) :keyword))

(defmacro definline (name lambda-list &body body)
  `(progn
     (declaim (inline ,name))
     (defun ,name ,lambda-list
       ,@body)))

(defvar false '#:false)

(definline falsep (form)
  (eq false form))

(defmacro letv ((&rest extended-bindings) &body body)
  (labels ((expand-letv (bindings)
             (let ((cur (first bindings)))
               (cond ((endp bindings) `(progn ,@body))
                     ((or (symbolp cur) (symbolp (first cur)))
                      `(let (,cur) ,(expand-letv (rest bindings))))
                     (t
                      `(multiple-value-bind ,(first cur)
                           ,(second cur)
                         ,(expand-letv (rest bindings))))))))
    (expand-letv extended-bindings)))

(defmacro with-gensyms (syms &body body)
  `(let ,(mapcar #'(lambda (s) 
		     `(,s (gensym))) syms)
     ,@body))

(defmacro case* (keyform &rest clauses)
  (with-gensyms (test)
    (let ((clause-collection (list)))
      (loop for (key . forms) in clauses
          do (cond ((member key '(otherwise t))
                    (push`(t ,@forms) clause-collection)
                    (return))
                   (t 
                    (push `((equalp ,test ,key) ,@forms) clause-collection))))
      `(let ((,test ,keyform))
         (declare (ignorable ,test))
         (cond ,@(nreverse clause-collection))))))

(defun insert-char (test char string &optional (start 0))
  (let* ((string-size (length string))
         (new-string (make-array (+ string-size (count-if test string :start start))
                                 :element-type 'character :fill-pointer 0)))
    (dotimes (i start)
      (vector-push (char string i) new-string))
    (loop for i from start upto (1- string-size)
        do (let ((cur-char (char string i)))
             (when (funcall test cur-char) (vector-push char new-string))
             (vector-push cur-char new-string)))
    new-string))

(defun mixed-case-p (string)
  (let ((len (length string)))
    (labels ((mixed-case-p-rec (i previous-char-upper-p)
               (unless (>= i len)
                 (let ((current-char (char string i)))
                   (cond ((and (both-case-p current-char) previous-char-upper-p)
                          (if (upper-case-p current-char)
                              (mixed-case-p-rec (1+ i) t)
                            t))
                         ((lower-case-p current-char) 
                          t)
                         (t 
                          (mixed-case-p-rec (1+ i) nil)))))))
      (unless (<= len 1) 
        (mixed-case-p-rec 2 (upper-case-p (char string 1)))))))

(definline lastelt (lst)
  (car (last lst)))

(definline stdout (&rest args)
  (apply #'format t args))

(defun mkstr (&rest args)
  (with-output-to-string (s)
    (dolist (a args)
      (princ a s))))

(defun symb (&rest args)
  (intern (apply #'mkstr args)))

(defun mklist (obj)
  (if (listp obj) 
      obj
    (list obj)))

(defmethod longer ((sequence list) (sequence-or-number list))
  (and (consp sequence)
       (or (null sequence-or-number)
           (longer (rest sequence) (rest sequence-or-number)))))

(defmethod longer ((sequence list) (sequence-or-number number))
  (and (consp sequence)
       (or (zerop sequence-or-number) (longer (rest sequence) (1- sequence-or-number)))))

(defmethod longer ((sequence sequence) (sequence-or-number sequence))
  (> (length sequence) (length sequence-or-number)))

(definline collect-if (test list &optional until-case)
  (loop for elt in list when (funcall test elt) collect elt
      until (and until-case (funcall until-case elt))))

(defun singleton-p (l)
  (and (not (endp l)) (endp (rest l))))

(defmacro delay (form)
  (with-gensyms (mem)
    `(let (,mem)
       #'(lambda ()
           (if ,mem ,mem (setq ,mem ,form))))))

(definline force (promise)
  (funcall promise))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(mkstr symb with-gensyms aif keywrd definline false falsep letv case* mklist
            insert-char mixed-case-p lastelt stdout longer collect-if singleton-p delay force)
          'cl-utils))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of cl-utils.lisp --
