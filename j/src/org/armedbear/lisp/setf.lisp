;;; setf.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: setf.lisp,v 1.13 2003-06-02 16:57:03 piso Exp $
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

(defun %rplaca (x val) (rplaca x val) val)

(defun %rplacd (x val) (rplacd x val) val)

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

(%put 'car *setf-expander* '%rplaca)
(%put 'cdr *setf-expander* '%rplacd)
(%put 'rest *setf-expander* '%rplacd)
(%put 'nth *setf-expander* '%setnth)
(%put 'svref *setf-expander* '%svset)
(%put 'fill-pointer *setf-expander* '%set-fill-pointer)
(%put 'fdefinition *setf-expander* '%set-fdefinition)
(%put 'subseq *setf-expander* '%set-subseq)
(%put 'symbol-function *setf-expander* 'fset)
(%put 'symbol-plist *setf-expander* '%set-symbol-plist)
(%put 'get *setf-expander* '%put)
(%put 'gethash *setf-expander* 'puthash)
(%put 'documentation *setf-expander* '%set-documentation)
(%put 'char *setf-expander* '%set-char)
(%put 'schar *setf-expander* '%set-schar)

(defmacro defsetf (access-function update-function)
  `(%put ',access-function *setf-expander* ',update-function))

(defsetf elt %setelt)
