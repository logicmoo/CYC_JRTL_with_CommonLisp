;;; setf.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: setf.lisp,v 1.41 2004-06-15 11:21:29 piso Exp $
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

(defun get-setf-method-inverse (form inverse setf-function)
  (let ((new-var (gensym))
        (vars nil)
        (vals nil))
    (dolist (x (cdr form))
      (push (gensym) vars)
      (push x vals))
    (setq vals (nreverse vals))
    (values vars vals (list new-var)
            (if setf-function
                `(,@inverse ,new-var ,@vars)
                (if (functionp (car inverse))
                    `(funcall ,@inverse ,@vars ,new-var)
                    `(,@inverse ,@vars ,new-var)))
            `(,(car form) ,@vars))))

;;; If a macro, expand one level and try again.  If not, go for the
;;; SETF function.
(defun expand-or-get-setf-inverse (form environment)
  (multiple-value-bind
    (expansion expanded)
    (macroexpand-1 form environment)
    (if expanded
        (get-setf-expansion expansion environment)
        (get-setf-method-inverse form `(funcall #'(setf ,(car form)))
                                 t))))

(defun get-setf-expansion (form &optional environment)
  (let (temp)
    (cond ((symbolp form)
           (let ((new-var (gensym)))
             (values nil nil (list new-var)
                     `(setq ,form ,new-var) form)))
          ((setq temp (get (car form) 'setf-inverse))
           (get-setf-method-inverse form `(,temp) nil))
          ((setq temp (get (car form) 'setf-expander))
           (funcall temp form environment))
          (t
           (expand-or-get-setf-inverse form environment)))))

;;; ROTATEF (from GCL)
(defmacro rotatef (&rest rest)
  (do ((r rest (cdr r))
       (pairs nil)
       (stores nil)
       (store-forms nil)
       (access-forms nil))
      ((endp r)
       (setq stores (nreverse stores))
       (setq store-forms (nreverse store-forms))
       (setq access-forms (nreverse access-forms))
       `(let* ,(nconc pairs
                      (mapcar #'list stores (cdr access-forms))
                      (list (list (car (last stores)) (car access-forms))))
          ,@store-forms
          nil))
    (multiple-value-bind (vars vals stores1 store-form access-form)
      (get-setf-expansion (car r))
      (setq pairs (nconc pairs (mapcar #'list vars vals)))
      (setq stores (cons (car stores1) stores))
      (setq store-forms (cons store-form store-forms))
      (setq access-forms (cons access-form access-forms)))))

(defmacro setf (&rest args)
  (let ((count (length args)))
    (cond
     ((= count 2)
      (let ((place (first args))
            (value-form (second args)))
        (if (atom place)
            `(setq ,place ,value-form)
            (progn
              (when (symbolp (car place))
                (resolve (car place)))
              (multiple-value-bind (dummies vals store-vars setter getter)
                (get-setf-expansion place)
                (let ((inverse (get (car place) 'setf-inverse)))
                  (if (and inverse (eq inverse (car setter)))
                      (if (functionp inverse)
                          `(funcall ,inverse ,@(cdr place) ,value-form)
                          `(,inverse ,@(cdr place) ,value-form))
                      (if (cdr store-vars)
                          `(let* (,@(mapcar #'list dummies vals))
                             (multiple-value-bind ,store-vars ,value-form
                               ,setter))
                          `(let* (,@(mapcar #'list dummies vals)
                                    ,(list (car store-vars) value-form))
                               ,setter)))))))))
     ((oddp count)
      (error "odd number of args to SETF"))
     (t
      (do ((a args (cddr a)) (l nil))
          ((null a) `(progn ,@(nreverse l)))
        (setq l (cons (list 'setf (car a) (cadr a)) l)))))))

;;; Redefined in define-modify-macro.lisp.
(defmacro incf (place &optional (delta 1))
  `(setf ,place (+ ,place ,delta)))

;;; Redefined in define-modify-macro.lisp.
(defmacro decf (place &optional (delta 1))
  `(setf ,place (- ,place ,delta)))

(defun fdefinition (name)
  (cond ((symbolp name)
         (symbol-function name))
        ((and (consp name)
              (eq (car name) 'setf))
         (or (get (cadr name) 'setf-function)
             (error 'undefined-function :name name)))
        (t
         (error 'type-error))))

(defun %set-fdefinition (name function)
  (cond ((symbolp name)
         (fset name function))
        ((and (consp name) (eq (car name) 'setf))
         (%put (cadr name) 'setf-function function))
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

(defmacro defsetf (access-function update-function)
  `(%put ',access-function 'setf-inverse ',update-function))

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
(defsetf elt %set-elt)
(defsetf nth %set-nth)
(defsetf svref %svset)
(defsetf fill-pointer %set-fill-pointer)
(defsetf fdefinition %set-fdefinition)
(defsetf subseq %set-subseq)
(defsetf symbol-value set)
(defsetf symbol-function %set-symbol-function)
(defsetf symbol-plist %set-symbol-plist)
(defsetf get %put)
(defsetf gethash puthash)
(defsetf char %set-char)
(defsetf schar %set-schar)
(defsetf charpos %set-charpos)
(defsetf logical-pathname-translations %set-logical-pathname-translations)
(defsetf readtable-case %set-readtable-case)
