;;; defclass.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: defclass.lisp,v 1.2 2003-10-10 14:15:43 piso Exp $
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

;;; (SETF GETF*) is like (SETF GETF) except that it always changes the list,
;;; which must be non-nil.

(defun (setf getf*) (new-value plist key)
  (block body
    (do ((x plist (cddr x)))
        ((null x))
      (when (eq (car x) key)
        (setf (car (cdr x)) new-value)
        (return-from body new-value)))
    (push-on-end key plist)
    (push-on-end new-value plist)
    new-value))

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

(defsetf class-name %set-class-name)

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

;;; Slot definition metaobjects

;;; N.B. Quietly retain all unknown slot options (rather than signaling an
;;; error), so that it's easy to add new ones.

(defun make-direct-slot-definition
  (&rest properties
         &key name (initargs ()) (initform nil) (initfunction nil)
         (readers ()) (writers ()) (allocation :instance)
         &allow-other-keys)
  (let ((slot (copy-list properties))) ; Don't want to side effect &rest list
    (setf (getf* slot ':name) name)
    (setf (getf* slot ':initargs) initargs)
    (setf (getf* slot ':initform) initform)
    (setf (getf* slot ':initfunction) initfunction)
    (setf (getf* slot ':readers) readers)
    (setf (getf* slot ':writers) writers)
    (setf (getf* slot ':allocation) allocation)
    slot))

(defun make-effective-slot-definition
  (&rest properties
         &key name (initargs ()) (initform nil) (initfunction nil)
         (allocation :instance)
         &allow-other-keys)
  (let ((slot (copy-list properties)))  ; Don't want to side effect &rest list
    (setf (getf* slot ':name) name)
    (setf (getf* slot ':initargs) initargs)
    (setf (getf* slot ':initform) initform)
    (setf (getf* slot ':initfunction) initfunction)
    (setf (getf* slot ':allocation) allocation)
    slot))

(defun slot-definition-name (slot)
  (getf slot ':name))
(defun (setf slot-definition-name) (new-value slot)
  (setf (getf* slot ':name) new-value))

(defun slot-definition-initfunction (slot)
  (getf slot ':initfunction))
(defun (setf slot-definition-initfunction) (new-value slot)
  (setf (getf* slot ':initfunction) new-value))

(defun slot-definition-initform (slot)
  (getf slot ':initform))
(defun (setf slot-definition-initform) (new-value slot)
  (setf (getf* slot ':initform) new-value))

(defun slot-definition-initargs (slot)
  (getf slot ':initargs))
(defun (setf slot-definition-initargs) (new-value slot)
  (setf (getf* slot ':initargs) new-value))

(defun slot-definition-readers (slot)
  (getf slot ':readers))
(defun (setf slot-definition-readers) (new-value slot)
  (setf (getf* slot ':readers) new-value))

(defun slot-definition-writers (slot)
  (getf slot ':writers))
(defun (setf slot-definition-writers) (new-value slot)
  (setf (getf* slot ':writers) new-value))

(defun slot-definition-allocation (slot)
  (getf slot ':allocation))
(defun (setf slot-definition-allocation) (new-value slot)
  (setf (getf* slot ':allocation) new-value))

;;; Simple vectors are used for slot storage.

(defun allocate-slot-storage (size initial-value)
  (make-array size :initial-element initial-value))

;;; Standard instance allocation

(defparameter secret-unbound-value (list "slot unbound"))

(defun instance-slot-p (slot)
  (eq (slot-definition-allocation slot) ':instance))

(defun std-allocate-instance (class)
  (allocate-std-instance
   class
   (allocate-slot-storage (count-if #'instance-slot-p (class-slots class))
                          secret-unbound-value)))

(defun make-instance-standard-class
  (metaclass &key name direct-superclasses direct-slots
             &allow-other-keys)
  (declare (ignore metaclass))
  (let ((class (std-allocate-instance (find-class 'standard-class))))
    (setf (class-name class) name)
;;     (setf (class-direct-subclasses class) ())
;;     (setf (class-direct-methods class) ())
    (std-after-initialization-for-classes class
                                          :direct-slots direct-slots
                                          :direct-superclasses direct-superclasses)
    class))

;; FIXME
(defun std-after-initialization-for-classes (&rest args) )

(defun ensure-class (name &rest all-keys &allow-other-keys)
  (let ((class (find-class name nil)))
    (unless class
      (setf class (apply #'make-instance-standard-class (find-class 'standard-class) :name name all-keys))
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
