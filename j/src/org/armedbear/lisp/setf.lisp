;;; setf.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: setf.lisp,v 1.16 2003-06-21 19:55:47 piso Exp $
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

(export '(setf incf decf fdefinition defsetf))

(defmacro setf (&rest args)
  (let ((n-args (length args)))
    (cond
     ((= n-args 2)
      (let ((place (first args))
            (value (second args)))
        (cond
         ((symbolp place)
          `(setq ,place ,value))
         ((consp place)
          (let ((expander (get (car place) *setf-expander*)))
            (cond ((null expander)
                   (error "no SETF expansion for ~A" place))
                  ((symbolp expander)
                   `(,expander ,@(cdr place) ,value))
                  ((functionp expander)
                   `(funcall ,expander ,@(cdr place) value))
                  (t
                   (error "SETF: unhandled case")))))
         (t nil))))
     ((oddp n-args)
      (error "odd number of args to SETF"))
     (t
      (do ((a args (cddr a)) (l nil))
          ((null a) `(progn ,@(nreverse l)))
	(setq l (cons (list 'setf (car a) (cadr a)) l)))))))

(defmacro incf (place &optional (delta 1))
  `(setf ,place (+ ,place ,delta)))

(defmacro decf (place &optional (delta 1))
  `(setf ,place (- ,place ,delta)))

(defun fdefinition (name)
  (cond ((symbolp name)
         (symbol-function name))
        ((and (consp name) (eq (car name) 'setf))
         (or (get *setf-expander* (cadr name)) (error 'undefined-function)))
        (t (error 'type-error))))

(defun %set-fdefinition (name function)
  (cond ((symbolp name)
         (fset name function))
        ((and (consp name) (eq (car name) 'setf))
         (%put (cadr name) *setf-expander* function))
        (t (error 'type-error))))

;; (defsetf subseq (sequence start &optional (end nil)) (v)
;;   `(progn (replace ,sequence ,v :start1 ,start :end1 ,end)
;;      ,v))
(defun %set-subseq (sequence start &rest rest)
  (let ((end nil) v)
    (ecase (length rest)
      (1
       (setq v (car rest)))
      (2
       (setq end (car rest)
             v (cadr rest))))
    (progn
      (replace sequence v :start1 start :end1 end)
      v)))

(defconstant *setf-expander* (make-symbol "SETF-EXPANDER"))

(defmacro defsetf (access-function update-function)
  `(%put ',access-function *setf-expander* ',update-function))

(defun %set-caar (x v) (%rplaca (car x) v))
(defun %set-cadr (x v) (%rplaca (cdr x) v))
(defun %set-cdar (x v) (%rplacd (car x) v))
(defun %set-cddr (x v) (%rplacd (cdr x) v))
(defun %set-caaar (x v) (%rplaca (caar x) v))
(defun %set-cadar (x v) (%rplaca (cdar x) v))
(defun %set-cdaar (x v) (%rplacd (caar x) v))
(defun %set-cddar (x v) (%rplacd (cdar x) v))
(defun %set-caadr (x v) (%rplaca (cadr x) v))
(defun %set-caddr (x v) (%rplaca (cddr x) v))
(defun %set-cdadr (x v) (%rplacd (cadr x) v))
(defun %set-cdddr (x v) (%rplacd (cddr x) v))
(defun %set-caaaar (x v) (%rplaca (caaar x) v))
(defun %set-cadaar (x v) (%rplaca (cdaar x) v))
(defun %set-cdaaar (x v) (%rplacd (caaar x) v))
(defun %set-cddaar (x v) (%rplacd (cdaar x) v))
(defun %set-caadar (x v) (%rplaca (cadar x) v))
(defun %set-caddar (x v) (%rplaca (cddar x) v))
(defun %set-cdadar (x v) (%rplacd (cadar x) v))
(defun %set-cdddar (x v) (%rplacd (cddar x) v))
(defun %set-caaadr (x v) (%rplaca (caadr x) v))
(defun %set-cadadr (x v) (%rplaca (cdadr x) v))
(defun %set-cdaadr (x v) (%rplacd (caadr x) v))
(defun %set-cddadr (x v) (%rplacd (cdadr x) v))
(defun %set-caaddr (x v) (%rplaca (caddr x) v))
(defun %set-cadddr (x v) (%rplaca (cdddr x) v))
(defun %set-cdaddr (x v) (%rplacd (caddr x) v))
(defun %set-cddddr (x v) (%rplacd (cdddr x) v))

(defsetf car %rplaca)
(defsetf cdr %rplacd)
(defsetf caar %set-caar)
(defsetf cadr %set-cadr)
(defsetf cdar %set-cdar)
(defsetf cddr %set-cddr)
(defsetf caaar %set-caaar)
(defsetf cadar %set-cadar)
(defsetf cdaar %set-cdaar)
(defsetf cddar %set-cddar)
(defsetf caadr %set-caadr)
(defsetf caddr %set-caddr)
(defsetf cdadr %set-cdadr)
(defsetf cdddr %set-cdddr)
(defsetf caaaar %set-caaaar)
(defsetf cadaar %set-cadaar)
(defsetf cdaaar %set-cdaaar)
(defsetf cddaar %set-cddaar)
(defsetf caadar %set-caadar)
(defsetf caddar %set-caddar)
(defsetf cdadar %set-cdadar)
(defsetf cdddar %set-cdddar)
(defsetf caaadr %set-caaadr)
(defsetf cadadr %set-cadadr)
(defsetf cdaadr %set-cdaadr)
(defsetf cddadr %set-cddadr)
(defsetf caaddr %set-caaddr)
(defsetf cadddr %set-cadddr)
(defsetf cdaddr %set-cdaddr)
(defsetf cddddr %set-cddddr)

(defsetf first %rplaca)
(defsetf second %set-cadr)
(defsetf third %set-caddr)
(defsetf fourth %set-cadddr)
(defun %set-fifth (x v) (%rplaca (cddddr x) v))
(defsetf fifth %set-fifth)
(defun %set-sixth (x v) (%rplaca (cdr (cddddr x)) v))
(defsetf sixth %set-sixth)
(defun %set-seventh (x v) (%rplaca (cddr (cddddr x)) v))
(defsetf seventh %set-seventh)
(defun %set-eighth (x v) (%rplaca (cdddr (cddddr x)) v))
(defsetf eighth %set-eighth)
(defun %set-ninth (x v) (%rplaca (cddddr (cddddr x)) v))
(defsetf ninth %set-ninth)
(defun %set-tenth (x v) (%rplaca (cdr (cddddr (cddddr x))) v))
(defsetf tenth %set-tenth)

(defsetf rest %rplacd)
(defsetf elt %setelt)
(defsetf nth %setnth)
(defsetf svref %svset)
(defsetf fill-pointer %set-fill-pointer)
(defsetf fdefinition %set-fdefinition)
(defsetf subseq %set-subseq)
(defsetf symbol-function fset)
(defsetf symbol-plist %set-symbol-plist)
(defsetf get %put)
(defsetf gethash puthash)
(defsetf char %set-char)
(defsetf schar %set-schar)
