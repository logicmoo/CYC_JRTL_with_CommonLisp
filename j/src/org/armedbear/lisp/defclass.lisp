;;; defclass.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: defclass.lisp,v 1.6 2003-10-11 00:16:55 piso Exp $
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
(defsetf class-direct-superclasses %set-class-direct-superclasses)
(defsetf class-direct-subclasses %set-class-direct-subclasses)
(defsetf class-direct-methods %set-class-direct-methods)
(defsetf class-direct-slots %set-class-direct-slots)
(defsetf class-precedence-list %set-class-precedence-list)
(defsetf class-slots %set-class-slots)

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

;;; finalize-inheritance

(defun std-finalize-inheritance (class)
  (setf (class-precedence-list class)
        (funcall (if (eq (class-of class) the-class-standard-class)
                     #'std-compute-class-precedence-list
                     #'compute-class-precedence-list)
                 class))
  (setf (class-slots class)
        (funcall (if (eq (class-of class) the-class-standard-class)
                     #'std-compute-slots
                     #'compute-slots)
                 class))
  (values))

;;; Class precedence lists

(defun std-compute-class-precedence-list (class)
  (let ((classes-to-order (collect-superclasses* class)))
    (topological-sort classes-to-order
                      (remove-duplicates
                       (mapappend #'local-precedence-ordering
                                  classes-to-order))
                      #'std-tie-breaker-rule)))

;;; topological-sort implements the standard algorithm for topologically
;;; sorting an arbitrary set of elements while honoring the precedence
;;; constraints given by a set of (X,Y) pairs that indicate that element
;;; X must precede element Y.  The tie-breaker procedure is called when it
;;; is necessary to choose from multiple minimal elements; both a list of
;;; candidates and the ordering so far are provided as arguments.

(defun topological-sort (elements constraints tie-breaker)
  (let ((remaining-constraints constraints)
        (remaining-elements elements)
        (result ()))
    (loop
      (let ((minimal-elements
             (remove-if
              #'(lambda (class)
                 (member class remaining-constraints
                         :key #'cadr))
              remaining-elements)))
        (when (null minimal-elements)
          (if (null remaining-elements)
              (return-from topological-sort result)
              (error "Inconsistent precedence graph.")))
        (let ((choice (if (null (cdr minimal-elements))
                          (car minimal-elements)
                          (funcall tie-breaker
                                   minimal-elements
                                   result))))
          (setq result (append result (list choice)))
          (setq remaining-elements
                (remove choice remaining-elements))
          (setq remaining-constraints
                (remove choice
                        remaining-constraints
                        :test #'member)))))))

;;; In the event of a tie while topologically sorting class precedence lists,
;;; the CLOS Specification says to "select the one that has a direct subclass
;;; rightmost in the class precedence list computed so far."  The same result
;;; is obtained by inspecting the partially constructed class precedence list
;;; from right to left, looking for the first minimal element to show up among
;;; the direct superclasses of the class precedence list constituent.
;;; (There's a lemma that shows that this rule yields a unique result.)

(defun std-tie-breaker-rule (minimal-elements cpl-so-far)
  (dolist (cpl-constituent (reverse cpl-so-far))
    (let* ((supers (class-direct-superclasses cpl-constituent))
           (common (intersection minimal-elements supers)))
      (when (not (null common))
        (return-from std-tie-breaker-rule (car common))))))

;;; This version of collect-superclasses* isn't bothered by cycles in the class
;;; hierarchy, which sometimes happen by accident.

(defun collect-superclasses* (class)
  (labels ((all-superclasses-loop (seen superclasses)
                                  (let ((to-be-processed
                                         (set-difference superclasses seen)))
                                    (if (null to-be-processed)
                                        superclasses
                                        (let ((class-to-process
                                               (car to-be-processed)))
                                          (all-superclasses-loop
                                           (cons class-to-process seen)
                                           (union (class-direct-superclasses
                                                   class-to-process)
                                                  superclasses)))))))
          (all-superclasses-loop () (list class))))

;;; The local precedence ordering of a class C with direct superclasses C_1,
;;; C_2, ..., C_n is the set ((C C_1) (C_1 C_2) ...(C_n-1 C_n)).

(defun local-precedence-ordering (class)
  (mapcar #'list
          (cons class
                (butlast (class-direct-superclasses class)))
          (class-direct-superclasses class)))

;;; Slot inheritance

(defun std-compute-slots (class)
  (let* ((all-slots (mapappend #'class-direct-slots
                               (class-precedence-list class)))
         (all-names (remove-duplicates
                     (mapcar #'slot-definition-name all-slots))))
    (mapcar #'(lambda (name)
               (funcall
                (if (eq (class-of class) the-class-standard-class)
                    #'std-compute-effective-slot-definition
                    #'compute-effective-slot-definition)
                class
                (remove name all-slots
                        :key #'slot-definition-name
                        :test-not #'eq)))
            all-names)))

(defun std-compute-effective-slot-definition (class direct-slots)
  (declare (ignore class))
  (let ((initer (find-if-not #'null direct-slots
                             :key #'slot-definition-initfunction)))
    (make-effective-slot-definition
     :name (slot-definition-name (car direct-slots))
     :initform (if initer
                   (slot-definition-initform initer)
                   nil)
     :initfunction (if initer
                       (slot-definition-initfunction initer)
                       nil)
     :initargs (remove-duplicates
                (mapappend #'slot-definition-initargs
                           direct-slots))
     :allocation (slot-definition-allocation (car direct-slots)))))

;;; Simple vectors are used for slot storage.

(defun allocate-slot-storage (size initial-value)
  (make-array size :initial-element initial-value))

;;; Standard instance slot access

;;; N.B. The location of the effective-slots slots in the class metaobject for
;;; standard-class must be determined without making any further slot
;;; references.

(defvar the-slots-of-standard-class) ;standard-class's class-slots
(defvar the-class-standard-class (find-class 'standard-class))

(defun slot-location (class slot-name)
  (if (and (eq slot-name 'effective-slots)
           (eq class the-class-standard-class))
      (position 'effective-slots the-slots-of-standard-class
                :key #'slot-definition-name)
      (let ((slot (find slot-name
                        (class-slots class)
                        :key #'slot-definition-name)))
        (if (null slot)
            (error "The slot ~S is missing from the class ~S."
                   slot-name class)
            (let ((pos (position slot
                                 (remove-if-not #'instance-slot-p
                                                (class-slots class)))))
              (if (null pos)
                  (error "The slot ~S is not an instance~@
                  slot in the class ~S."
                         slot-name class)
                  pos))))))

(defun slot-contents (slots location)
  (svref slots location))

(defun (setf slot-contents) (new-value slots location)
  (setf (svref slots location) new-value))

(defun std-slot-value (instance slot-name)
  (let* ((location (slot-location (class-of instance) slot-name))
         (slots (std-instance-slots instance))
         (val (slot-contents slots location)))
    (if (eq secret-unbound-value val)
        (error "The slot ~S is unbound in the object ~S."
               slot-name instance)
        val)))
(defun slot-value (object slot-name)
  (if (eq (class-of (class-of object)) the-class-standard-class)
      (std-slot-value object slot-name)
      (slot-value-using-class (class-of object) object slot-name)))

(defun (setf std-slot-value) (new-value instance slot-name)
  (let ((location (slot-location (class-of instance) slot-name))
        (slots (std-instance-slots instance)))
    (setf (slot-contents slots location) new-value)))
(defun (setf slot-value) (new-value object slot-name)
  (if (eq (class-of (class-of object)) the-class-standard-class)
      (setf (std-slot-value object slot-name) new-value)
      (setf-slot-value-using-class
       new-value (class-of object) object slot-name)))

(defun std-slot-boundp (instance slot-name)
  (let ((location (slot-location (class-of instance) slot-name))
        (slots (std-instance-slots instance)))
    (not (eq secret-unbound-value (slot-contents slots location)))))
(defun slot-boundp (object slot-name)
  (if (eq (class-of (class-of object)) the-class-standard-class)
      (std-slot-boundp object slot-name)
      (slot-boundp-using-class (class-of object) object slot-name)))

(defun std-slot-makunbound (instance slot-name)
  (let ((location (slot-location (class-of instance) slot-name))
        (slots (std-instance-slots instance)))
    (setf (slot-contents slots location) secret-unbound-value))
  instance)
(defun slot-makunbound (object slot-name)
  (if (eq (class-of (class-of object)) the-class-standard-class)
      (std-slot-makunbound object slot-name)
      (slot-makunbound-using-class (class-of object) object slot-name)))

(defun std-slot-exists-p (instance slot-name)
  (not (null (find slot-name (class-slots (class-of instance))
                   :key #'slot-definition-name))))
(defun slot-exists-p (object slot-name)
  (if (eq (class-of (class-of object)) the-class-standard-class)
      (std-slot-exists-p object slot-name)
      (slot-exists-p-using-class (class-of object) object slot-name)))

;;; Standard instance allocation

(defparameter secret-unbound-value (list "slot unbound"))

(defun instance-slot-p (slot)
  (eq (slot-definition-allocation slot) ':instance))

(defun std-allocate-instance (class)
  (allocate-std-instance
   class
   (allocate-slot-storage (count-if #'instance-slot-p (class-slots class))
                          secret-unbound-value)))

(defun allocate-instance (class)
  (std-allocate-instance class))

(defun make-instance-standard-class (metaclass &key name direct-superclasses direct-slots
                                               &allow-other-keys)
  (declare (ignore metaclass))
;;   (format t "name = ~S~%" name)
;;   (format t "direct-superclasses = ~S~%" direct-superclasses)
;;   (format t "direct-slots = ~S~%" direct-slots)
  (let ((class (std-allocate-instance (find-class 'standard-class))))
    (setf (class-name class) name)
    (setf (class-direct-subclasses class) ())
    (setf (class-direct-methods class) ())
    (std-after-initialization-for-classes class
                                          :direct-slots direct-slots
                                          :direct-superclasses direct-superclasses)
    class))

;; FIXME
(defun std-after-initialization-for-classes (class
                                             &key direct-superclasses direct-slots
                                             &allow-other-keys)
  (let ((supers
         (or direct-superclasses
             (list (find-class 'standard-object)))))
    (setf (class-direct-superclasses class) supers)
    (dolist (superclass supers)
      (push class (class-direct-subclasses superclass))))
  (let ((slots
         (mapcar #'(lambda (slot-properties)
                    (apply #'make-direct-slot-definition
                           slot-properties))
                 direct-slots)))
    (setf (class-direct-slots class) slots)
;;     (dolist (direct-slot slots)
;;       (dolist (reader (slot-definition-readers direct-slot))
;;         (add-reader-method
;;          class reader (slot-definition-name direct-slot)))
;;       (dolist (writer (slot-definition-writers direct-slot))
;;         (add-writer-method
;;          class writer (slot-definition-name direct-slot))))
    )
  (funcall (if (eq (class-of class) (find-class 'standard-class))
               #'std-finalize-inheritance
               #'finalize-inheritance)
           class)
  (values))

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
