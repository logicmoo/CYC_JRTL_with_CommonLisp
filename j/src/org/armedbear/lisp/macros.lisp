;;; macros.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: macros.lisp,v 1.25 2004-02-02 13:44:51 piso Exp $
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

(defmacro return (&optional (value nil))
  `(return-from nil ,value))

(defmacro prog1 (first-form &rest forms)
  (let ((result (gensym)))
    `(let ((,result ,first-form))
       ,@forms
       ,result)))

(defmacro prog2 (first-form second-form &rest forms)
  `(prog1 (progn ,first-form ,second-form) ,@forms))

;; Adapted from SBCL.
(defmacro push (item place)
  (if (and (symbolp place)
	   (eq place (macroexpand place)))
      `(setq ,place (cons ,item ,place))
      (multiple-value-bind (dummies vals newval setter getter)
        (get-setf-expansion place)
        (let ((g (gensym)))
          `(let* ((,g ,item)
                  ,@(mapcar #'list dummies vals)
                  (,(car newval) (cons ,g ,getter)))
             ,setter)))))

;; Adapted from SBCL.
(defmacro pushnew (item place &rest keys)
  (if (and (symbolp place)
	   (eq place (macroexpand place)))
      `(setq ,place (adjoin ,item ,place ,@keys))
      (multiple-value-bind (dummies vals newval setter getter)
        (get-setf-expansion place)
        (let ((g (gensym)))
          `(let* ((,g ,item)
                  ,@(mapcar #'list dummies vals)
                  (,(car newval) (adjoin ,g ,getter ,@keys)))
             ,setter)))))

;; Adapted from SBCL.
(defmacro pop (place)
  (if (and (symbolp place)
	   (eq place (macroexpand place)))
      `(prog1 (car ,place)
	      (setq ,place (cdr ,place)))
      (multiple-value-bind (dummies vals newval setter getter)
        (get-setf-expansion place)
        (do* ((d dummies (cdr d))
              (v vals (cdr v))
              (let-list nil))
             ((null d)
              (push (list (car newval) getter) let-list)
              `(let* ,(nreverse let-list)
                 (prog1 (car ,(car newval))
                        (setq ,(car newval) (cdr ,(car newval)))
                        ,setter)))
          (push (list (car d) (car v)) let-list)))))

(defmacro psetq (&rest args)
  (do ((l args (cddr l))
       (forms nil)
       (bindings nil))
    ((endp l) (list* 'let* (reverse bindings) (reverse (cons nil forms))))
    (let ((sym (gensym)))
      (push (list sym (cadr l)) bindings)
      (push (list 'setq (car l) sym) forms))))

(defmacro time (form)
  `(sys::%time #'(lambda () ,form)))

(defmacro with-open-stream (&rest args)
  (let ((var (caar args))
        (stream (cadar args))
        (forms (cdr args))
        (abortp (gensym)))
    `(let ((,var ,stream)
	   (,abortp t))
       (unwind-protect
        (multiple-value-prog1
         (progn ,@forms)
         (setq ,abortp nil))
        (when ,var
          (close ,var :abort ,abortp))))))


;;; From CMUCL.

(defun do-do-body (varlist endlist code bind step name block)
  (let* ((inits ())
	 (steps ())
	 (L1 (gensym))
	 (L2 (gensym)))
    ;; Check for illegal old-style do.
    (when (or (not (listp varlist)) (atom endlist))
      (error "Ill-formed ~S -- possibly illegal old style DO?" name))
    ;; Parse the varlist to get inits and steps.
    (dolist (v varlist)
      (cond ((symbolp v) (push v inits))
	    ((listp v)
	     (unless (symbolp (first v))
	       (error "~S step variable is not a symbol: ~S" name (first v)))
	     (case (length v)
	       (1 (push (first v) inits))
	       (2 (push v inits))
	       (3 (push (list (first v) (second v)) inits)
		  (setq steps (list* (third v) (first v) steps)))
	       (t (error "~S is an illegal form for a ~S varlist." v name))))
	    (t (error "~S is an illegal form for a ~S varlist." v name))))
    ;; And finally construct the new form.
    `(block ,block
            (,bind ,(nreverse inits)
                   (tagbody
                    (go ,L2)
                    ,L1
                    ,@code
                    (,step ,@(nreverse steps))
                    ,L2
                    (unless ,(car endlist) (go ,L1))
                    (return-from ,block (progn ,@(cdr endlist))))))))


(defmacro do (varlist endlist &rest body)
  (do-do-body varlist endlist body 'let 'psetq 'do nil))


(defmacro do* (varlist endlist &rest body)
  (do-do-body varlist endlist body 'let* 'setq 'do* nil))

(defun ansi-loop (exps)
  (require 'loop)
  (fmakunbound 'ansi-loop)
  `(loop ,@exps))

(defmacro loop (&rest exps)
  (dolist (exp exps)
    (when (atom exp)
      (return-from loop (ansi-loop exps))))
  (let ((tag (gensym)))
    `(block nil (tagbody ,tag ,@exps (go ,tag)))))
