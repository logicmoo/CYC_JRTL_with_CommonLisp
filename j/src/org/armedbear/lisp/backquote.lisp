;;; backquote.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: backquote.lisp,v 1.5 2003-10-10 01:54:26 piso Exp $
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

(defconstant *comma* 'COMMA)
(defconstant *comma-atsign* 'COMMA-ATSIGN)
(defconstant *comma-dot* 'COMMA-DOT)
(defconstant *bq-list* (make-symbol "BQ-LIST"))
(defconstant *bq-append* (make-symbol "BQ-APPEND"))
(defconstant *bq-list** (make-symbol "BQ-LIST*"))
(defconstant *bq-nconc* (make-symbol "BQ-NCONC"))
(defconstant *bq-clobberable* (make-symbol "BQ-CLOBBERABLE"))
(defconstant *bq-quote* (make-symbol "BQ-QUOTE"))

(defmacro backquote (form)
  (bq-completely-process form))

(defun bq-completely-process (x)
  (let ((raw-result (bq-process x)))
    (bq-remove-tokens raw-result)))

(defun bq-process (x)
  (cond ((atom x)
         (list *bq-quote* x))
        ((eq (car x) 'backquote)
         (bq-process (bq-completely-process (cadr x))))
        ((eq (car x) *comma*) (cadr x))
        ((eq (car x) *comma-atsign*)
         (error ",@~S after `" (cadr x)))
        ((eq (car x) *comma-dot*)
         (error ",.~S after `" (cadr x)))
        (t (do ((p x (cdr p))
                (q '() (cons (bracket (car p)) q)))
             ((atom p)
              (cons *bq-append*
                    (nreconc q (list (list *bq-quote* p)))))
             (when (eq (car p) *comma*)
               (unless (null (cddr p)) (error "malformed ,~S" p))
               (return (cons *bq-append*
                             (nreconc q (list (cadr p))))))
             (when (eq (car p) *comma-atsign*)
               (error "dotted ,@~S" p))
             (when (eq (car p) *comma-dot*)
               (error "dotted ,.~S" p))))))

(defun bracket (x)
  (cond ((atom x)
         (list *bq-list* (bq-process x)))
        ((eq (car x) *comma*)
         (list *bq-list* (cadr x)))
        ((eq (car x) *comma-atsign*)
         (cadr x))
        ((eq (car x) *comma-dot*)
         (list *bq-clobberable* (cadr x)))
        (t (list *bq-list* (bq-process x)))))

;; (defun maptree (fn x)
;;   (if (atom x)
;;       (funcall fn x)
;;       (let ((a (funcall fn (car x)))
;;             (d (maptree fn (cdr x))))
;;         (if (and (eql a (car x)) (eql d (cdr x)))
;;             x
;;             (cons a d)))))

(defun bq-remove-tokens (x)
  (cond ((eq x *bq-list*) 'list)
        ((eq x *bq-append*) 'append)
        ((eq x *bq-nconc*) 'nconc)
        ((eq x *bq-list**) 'list*)
        ((eq x *bq-quote*) 'quote)
        ((atom x) x)
        ((eq (car x) *bq-clobberable*)
         (bq-remove-tokens (cadr x)))
        ((and (eq (car x) *bq-list**)
              (consp (cddr x))
              (null (cdddr x)))
         (cons 'cons (sys::maptree #'bq-remove-tokens (cdr x))))
        (t (sys::maptree #'bq-remove-tokens x))))
