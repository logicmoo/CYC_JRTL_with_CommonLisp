;;; defclass.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: defclass.lisp,v 1.1 2003-09-28 18:34:45 piso Exp $
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

(defmacro push-on-end (value location)
  `(setf ,location (nconc ,location (list ,value))))

(defun mapappend (fun &rest args)
  (if (some #'null args)
      ()
      (append (apply fun (mapcar #'car args))
              (apply #'mapappend fun (mapcar #'cdr args)))))

(defun mapplist (fun x)
  (if (null x)
      ()
      (cons (funcall fun (car x) (cadr x))
            (mapplist fun (cddr x)))))

(defun canonicalize-direct-slots (direct-slots)
  `(list ,@(mapcar #'canonicalize-direct-slot direct-slots)))

(defun canonicalize-direct-slot (spec)
  (if (symbolp spec)
      `(list :name ',spec)
      (let ((name (car spec))
            (initfunction nil)
            (initform nil)
            (initargs ())
            (readers ())
            (writers ())
            (other-options ()))
        (do ((olist (cdr spec) (cddr olist)))
            ((null olist))
          (case (car olist)
            (:initform
             (setq initfunction
                   `(function (lambda () ,(cadr olist))))
             (setq initform `',(cadr olist)))
            (:initarg
             (push-on-end (cadr olist) initargs))
            (:reader
             (push-on-end (cadr olist) readers))
            (:writer
             (push-on-end (cadr olist) writers))
            (:accessor
             (push-on-end (cadr olist) readers)
             (push-on-end `(setf ,(cadr olist)) writers))
            (otherwise
             (push-on-end `',(car olist) other-options)
             (push-on-end `',(cadr olist) other-options))))
        `(list
          :name ',name
          ,@(when initfunction
              `(:initform ,initform
                          :initfunction ,initfunction))
          ,@(when initargs `(:initargs ',initargs))
          ,@(when readers `(:readers ',readers))
          ,@(when writers `(:writers ',writers))
          ,@other-options))))

(defun canonicalize-direct-superclasses (direct-superclasses)
  `(list ,@(mapcar #'canonicalize-direct-superclass direct-superclasses)))

(defun canonicalize-direct-superclass (class-name)
  `(find-class ',class-name))

(defun canonicalize-defclass-options (options)
  (mapappend #'canonicalize-defclass-option options))

(defun canonicalize-defclass-option (option)
  (case (car option)
    (:metaclass
     (list ':metaclass
           `(find-class ',(cadr option))))
    (:default-initargs
     (list
      ':direct-default-initargs
      `(list ,@(mapappend
                #'(lambda (x) x)
                (mapplist
                 #'(lambda (key value)
                    `(',key ,value))
                 (cdr option))))))
    (t (list `',(car option) `',(cadr option)))))

(defun ensure-class (name &rest all-keys &allow-other-keys)
  (let ((class (find-class name nil)))
    (unless class
      (setf class (make-instance-standard-class name all-keys))
      (add-class class))
    class))

(defmacro defclass (name direct-superclasses direct-slots
                         &rest options)
  `(ensure-class ',name
                 :direct-superclasses
                 ,(canonicalize-direct-superclasses direct-superclasses)
                 :direct-slots
                 ,(canonicalize-direct-slots direct-slots)
                 ,@(canonicalize-defclass-options options)))
