;;; clos.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: clos.lisp,v 1.93 2004-03-01 17:28:42 piso Exp $
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

;;; Adapted from Closette.

;;; Closette Version 1.0 (February 10, 1991)
;;;
;;; Copyright (c) 1990, 1991 Xerox Corporation.
;;; All rights reserved.
;;;
;;; Use and copying of this software and preparation of derivative works
;;; based upon this software are permitted.  Any distribution of this
;;; software or derivative works must comply with all applicable United
;;; States export control laws.
;;;
;;; This software is made available AS IS, and Xerox Corporation makes no
;;; warranty about the software, its performance or its conformity to any
;;; specification.
;;;
;;; Closette is an implementation of a subset of CLOS with a metaobject
;;; protocol as described in "The Art of The Metaobject Protocol",
;;; MIT Press, 1991.

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

(defsetf class-layout %set-class-layout)
(defsetf class-direct-superclasses %set-class-direct-superclasses)
(defsetf class-direct-subclasses %set-class-direct-subclasses)
(defsetf class-direct-methods %set-class-direct-methods)
(defsetf class-direct-slots %set-class-direct-slots)
(defsetf class-slots %set-class-slots)
(defsetf class-direct-default-initargs %set-class-direct-default-initargs)
(defsetf class-default-initargs %set-class-default-initargs)
(defsetf class-precedence-list %set-class-precedence-list)
(defsetf std-instance-layout %set-std-instance-layout)
(defsetf std-instance-slots %set-std-instance-slots)
(defsetf instance-ref %set-instance-ref)

(defun (setf find-class) (new-value symbol &optional errorp environment)
  (%set-find-class symbol new-value))

(defun canonicalize-direct-slots (direct-slots)
  `(list ,@(mapcar #'canonicalize-direct-slot direct-slots)))

(defun canonicalize-direct-slot (spec)
  (if (symbolp spec)
      `(list :name ',spec)
      (let ((name (car spec))
            (initfunction nil)
            (initform nil)
            (initargs ())
            (type nil)
            (allocation nil)
            (documentation nil)
            (readers ())
            (writers ())
            (other-options ()))
        (do ((olist (cdr spec) (cddr olist)))
            ((null olist))
          (case (car olist)
            (:initform
             (when initform
               (error 'program-error
                      "duplicate slot option :INITFORM for slot named ~S"
                      name))
             (setq initfunction
                   `(function (lambda () ,(cadr olist))))
             (setq initform `',(cadr olist)))
            (:initarg
             (push-on-end (cadr olist) initargs))
            (:allocation
             (when allocation
               (error 'program-error
                      "duplicate slot option :ALLOCATION for slot named ~S"
                      name))
             (setf allocation (cadr olist))
             (push-on-end (car olist) other-options)
             (push-on-end (cadr olist) other-options))
            (:type
             (when type
               (error 'program-error
                      "duplicate slot option :TYPE for slot named ~S"
                      name))
             (setf type (cadr olist))) ;; FIXME type is ignored
            (:documentation
             (when documentation
               (error 'program-error
                      "duplicate slot option :DOCUMENTATION for slot named ~S"
                      name))
             (setf documentation (cadr olist))) ;; FIXME documentation is ignored
            (:reader
             (push-on-end (cadr olist) readers))
            (:writer
             (push-on-end (cadr olist) writers))
            (:accessor
             (push-on-end (cadr olist) readers)
             (push-on-end `(setf ,(cadr olist)) writers))
            (t
             (error 'program-error
                    "invalid initialization argument ~S for slot named ~S"
                    (car olist) name))))
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
                    `(',key ,(make-initfunction value)))
                 (cdr option))))))
    ((:documentation :report)
     (list (car option) `',(cadr option)))
    (t
     (error 'program-error
            :format-control "invalid DEFCLASS option ~S"
            :format-arguments (list (car option))))))

(defun make-initfunction (initform)
  `(function (lambda () ,initform)))

(defconstant +slot-unbound+ (make-symbol "SLOT-UNBOUND"))

;;; Slot definition metaobjects

(defstruct slot-definition
  name
  initfunction
  initform
  initargs
  readers
  writers
  allocation
  allocation-class
  (location nil))

(defun make-direct-slot-definition (class &rest properties
                                          &key name
                                          (initargs ())
                                          (initform nil)
                                          (initfunction nil)
                                          (readers ())
                                          (writers ())
                                          (allocation :instance)
                                          &allow-other-keys)
  (let ((slot (make-slot-definition)))
    (setf (slot-definition-name slot) name)
    (setf (slot-definition-initargs slot) initargs)
    (setf (slot-definition-initform slot) initform)
    (setf (slot-definition-initfunction slot) initfunction)
    (setf (slot-definition-readers slot) readers)
    (setf (slot-definition-writers slot) writers)
    (setf (slot-definition-allocation slot) allocation)
    (setf (slot-definition-allocation-class slot) class)
    slot))

(defun make-effective-slot-definition (&rest properties
                                             &key name
                                             (initargs ())
                                             (initform nil)
                                             (initfunction nil)
                                             (allocation :instance)
                                             (allocation-class nil)
                                             &allow-other-keys)
  (let ((slot (make-slot-definition)))
    (setf (slot-definition-name slot) name)
    (setf (slot-definition-initargs slot) initargs)
    (setf (slot-definition-initform slot) initform)
    (setf (slot-definition-initfunction slot) initfunction)
    (setf (slot-definition-allocation slot) allocation)
    (setf (slot-definition-allocation-class slot) allocation-class)
    slot))

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
  (let ((length 0)
        (instance-slots ()))
    (dolist (slot (class-slots class))
      (case (slot-definition-allocation slot)
        (:instance
         (setf (slot-definition-location slot) length)
         (incf length)
         (push (slot-definition-name slot) instance-slots))
        (:class
         (unless (slot-definition-location slot)
           (let ((allocation-class (slot-definition-allocation-class slot)))
             (setf (slot-definition-location slot)
                   (if (eq class allocation-class)
                       (cons (slot-definition-name slot) +slot-unbound+)
                       (slot-location allocation-class (slot-definition-name slot)))))))))
    (setf (class-layout class)
          (make-layout class length (nreverse instance-slots))))
  (setf (class-default-initargs class)
        (compute-class-default-initargs class)))

(defun compute-class-default-initargs (class)
  (mapappend #'class-direct-default-initargs
             (class-precedence-list class)))

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
     :allocation (slot-definition-allocation (car direct-slots))
     :allocation-class (slot-definition-allocation-class (car direct-slots)))))

;;; Standard instance slot access

;;; N.B. The location of the effective-slots slots in the class metaobject for
;;; standard-class must be determined without making any further slot
;;; references.

(defvar the-slots-of-standard-class) ;standard-class's class-slots
(defvar the-class-standard-class (find-class 'standard-class))

(defun find-slot-definition (class slot-name)
  (dolist (slot (class-slots class) nil)
    (when (eq slot-name (slot-definition-name slot))
      (return slot))))

(defun slot-location (class slot-name)
  (let ((slot (find-slot-definition class slot-name)))
    (if slot
        (slot-definition-location slot)
        nil)))

(defun instance-slot-location (instance slot-name)
  (let* ((layout (std-instance-layout instance))
         (location (and layout (instance-slot-index layout slot-name))))
    (if location
        location
        (slot-location (class-of instance) slot-name))))

(defun std-slot-value (instance slot-name)
  (let* ((location (instance-slot-location instance slot-name))
         (value (cond ((fixnump location)
                       (instance-ref instance location))
                      ((consp location)
                       (cdr location))
                      (t
                       (slot-missing (class-of instance) instance slot-name 'slot-value)))))
    (if (eq +slot-unbound+ value)
        (slot-unbound (class-of instance) instance slot-name)
        value)))

(defun slot-value (object slot-name)
  (if (eq (class-of (class-of object)) the-class-standard-class)
      (std-slot-value object slot-name)
      (slot-value-using-class (class-of object) object slot-name)))

(defun %set-std-slot-value (instance slot-name new-value)
  (let ((location (instance-slot-location instance slot-name)))
    (cond ((fixnump location)
           (setf (instance-ref instance location) new-value))
          ((consp location)
           (setf (cdr location) new-value))
          (t
           (slot-missing (class-of instance) instance slot-name 'setf new-value))))
  new-value)

(defsetf std-slot-value %set-std-slot-value)

(defun (setf slot-value) (new-value object slot-name)
  (if (eq (class-of (class-of object)) the-class-standard-class)
      (setf (std-slot-value object slot-name) new-value)
      (setf-slot-value-using-class
       new-value (class-of object) object slot-name)))

(defun std-slot-boundp (instance slot-name)
  (let ((location (instance-slot-location instance slot-name)))
    (cond ((fixnump location)
           (neq +slot-unbound+ (instance-ref instance location)))
          ((consp location)
           (neq +slot-unbound+ (cdr location)))
          (t
           (not (null (slot-missing (class-of instance) instance slot-name 'slot-boundp)))))))

(defun slot-boundp (object slot-name)
  (if (eq (class-of (class-of object)) the-class-standard-class)
      (std-slot-boundp object slot-name)
      (slot-boundp-using-class (class-of object) object slot-name)))

(defun std-slot-makunbound (instance slot-name)
  (let ((location (instance-slot-location instance slot-name)))
    (cond ((fixnump location)
           (setf (instance-ref instance location) +slot-unbound+))
          ((consp location)
           (setf (cdr location) +slot-unbound+))
          (t
           (slot-missing (class-of instance) instance slot-name 'slot-makunbound))))
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

(defun instance-slot-p (slot)
  (eq (slot-definition-allocation slot) :instance))

(defun std-allocate-instance (class)
  (let* ((layout (class-layout class))
         (length (and layout (layout-length layout))))
    (unless layout
      (format t "no layout for class ~S~%" class)
      (backtrace))
    (unless length
      (format t "no layout length for class ~S~%" class)
      (setf length (count-if #'instance-slot-p (class-slots class))))
    (allocate-std-instance class
                           (allocate-slot-storage length +slot-unbound+))))

(defun make-instance-standard-class (metaclass
                                     &key name direct-superclasses direct-slots
                                     direct-default-initargs
                                     documentation
                                     &allow-other-keys)
  (declare (ignore metaclass))
  (let ((class (std-allocate-instance (find-class 'standard-class))))
    (%set-class-name class name)
    (setf (class-direct-subclasses class) ())
    (setf (class-direct-methods class) ())
    (%set-class-documentation class documentation)
    (std-after-initialization-for-classes class
                                          :direct-superclasses direct-superclasses
                                          :direct-slots direct-slots
                                          :direct-default-initargs direct-default-initargs)
    class))

(defun std-after-initialization-for-classes (class
                                             &key direct-superclasses direct-slots
                                             direct-default-initargs
                                             &allow-other-keys)
  (let ((supers (or direct-superclasses
                    (list (find-class 'standard-object)))))
    (setf (class-direct-superclasses class) supers)
    (dolist (superclass supers)
      (push class (class-direct-subclasses superclass))))
  (let ((slots (mapcar #'(lambda (slot-properties)
                          (apply #'make-direct-slot-definition class slot-properties))
                       direct-slots)))
    (setf (class-direct-slots class) slots)
    (dolist (direct-slot slots)
      (dolist (reader (slot-definition-readers direct-slot))
        (add-reader-method
         class reader (slot-definition-name direct-slot)))
      (dolist (writer (slot-definition-writers direct-slot))
        (add-writer-method
         class writer (slot-definition-name direct-slot)))))
  (setf (class-direct-default-initargs class) direct-default-initargs)
  (funcall (if (eq (class-of class) (find-class 'standard-class))
               #'std-finalize-inheritance
               #'finalize-inheritance)
           class)
  (values))

(defun canonical-slot-name (canonical-slot)
  (getf canonical-slot :name))

(defun ensure-class (name &rest all-keys &allow-other-keys)
  ;; Check for duplicate slots.
  (let ((slots (getf all-keys :direct-slots)))
    (dolist (s1 slots)
      (let ((name1 (canonical-slot-name s1)))
        (dolist (s2 (cdr (memq s1 slots)))
	  (when (eq name1 (canonical-slot-name s2))
            (error 'program-error "duplicate slot ~S" name1))))))
  ;; Check for duplicate argument names in :DEFAULT-INITARGS.
  (let ((names ()))
    (do* ((initargs (getf all-keys :direct-default-initargs) (cddr initargs))
          (name (car initargs) (car initargs)))
         ((null initargs))
      (push name names))
    (do* ((names names (cdr names))
          (name (car names) (car names)))
         ((null names))
      (when (memq name (cdr names))
        (error 'program-error
               :format-control "Duplicate initialization argument name ~S in :DEFAULT-INITARGS."
               :format-arguments (list name)))))
  (let ((class (find-class name nil)))
    (unless class
      (setf class (apply #'make-instance-standard-class (find-class 'standard-class)
                         :name name all-keys))
      (%set-find-class name class))
    class))

(defmacro defclass (&whole form name direct-superclasses direct-slots &rest options)
  (unless (>= (length form) 3)
    (error 'program-error "Wrong number of arguments for DEFCLASS."))
  `(ensure-class ',name
                 :direct-superclasses
                 ,(canonicalize-direct-superclasses direct-superclasses)
                 :direct-slots
                 ,(canonicalize-direct-slots direct-slots)
                 ,@(canonicalize-defclass-options options)))

(defstruct method-combination
  name
  operator
  identity-with-one-argument
  documentation)

(defmacro define-method-combination (&whole form &rest args)
  (declare (ignore args))
  (if (and (cddr form)
           (listp (caddr form)))
      (expand-long-defcombin form)
      (expand-short-defcombin form)))

(defun expand-short-defcombin (whole)
  (let* ((name (cadr whole))
	 (documentation
          (getf (cddr whole) :documentation ""))
	 (identity-with-one-arg
          (getf (cddr whole) :identity-with-one-argument nil))
	 (operator
          (getf (cddr whole) :operator name)))
    `(progn
       (setf (get ',name 'method-combination-object)
             (make-method-combination :name ',name
                                      :operator ',operator
                                      :identity-with-one-argument ',identity-with-one-arg
                                      :documentation ',documentation))
       ',name)))

(defun expand-long-defcombin (whole)
  (error "The long form of DEFINE-METHOD-COMBINATION is not yet supported."))

(define-method-combination +      :identity-with-one-argument t)
(define-method-combination and    :identity-with-one-argument t)
(define-method-combination append :identity-with-one-argument nil)
(define-method-combination list   :identity-with-one-argument nil)
(define-method-combination max    :identity-with-one-argument t)
(define-method-combination min    :identity-with-one-argument t)
(define-method-combination nconc  :identity-with-one-argument t)
(define-method-combination or     :identity-with-one-argument t)
(define-method-combination progn  :identity-with-one-argument t)

(defstruct eql-specializer
  object)

(defparameter *eql-specializer-table* (make-hash-table :test 'eql))

(defun intern-eql-specializer (object)
  (or (gethash object *eql-specializer-table*)
      (setf (gethash object *eql-specializer-table*)
	    (make-eql-specializer :object object))))

(defclass standard-generic-function (generic-function)
  ((name :initarg :name)      ; :accessor generic-function-name
   (lambda-list               ; :accessor generic-function-lambda-list
    :initarg :lambda-list)
   (documentation
    :initarg :documentation)  ; :accessor generic-function-documentation
   (methods :initform ())     ; :accessor generic-function-methods
   (method-class              ; :accessor generic-function-method-class
    :initarg :method-class)
   ;; The method-combination slot contains either the name of the method
   ;; combination type or a list whose car is the name of the method
   ;; combination type and whose cdr is a list of options.
   (method-combination
    :initarg :method-combination)
   (argument-precedence-order
    :initarg :argument-precedence-order)
   (classes-to-emf-table      ; :accessor classes-to-emf-table
    :initform (make-hash-table :test #'equal))
   (required-args :initform ())))

(defvar the-class-standard-gf (find-class 'standard-generic-function))

(defvar *sgf-required-args-index*
  (slot-location the-class-standard-gf 'required-args))

(defvar *sgf-classes-to-emf-table-index*
  (slot-location the-class-standard-gf 'classes-to-emf-table))

(defun generic-function-name (gf)
  (slot-value gf 'name))
(defun (setf generic-function-name) (new-value gf)
  (setf (slot-value gf 'name) new-value))

(defun generic-function-lambda-list (gf)
  (slot-value gf 'lambda-list))
(defun (setf generic-function-lambda-list) (new-value gf)
  (setf (slot-value gf 'lambda-list) new-value))

(defun generic-function-documentation (gf)
  (slot-value gf 'documentation))
(defun (setf generic-function-documentation) (new-value gf)
  (setf (slot-value gf 'documentation) new-value))

(defun generic-function-methods (gf)
  (slot-value gf 'methods))
(defun (setf generic-function-methods) (new-value gf)
  (setf (slot-value gf 'methods) new-value))

(defsetf generic-function-discriminating-function
  %set-generic-function-discriminating-function)

(defun generic-function-method-class (gf)
  (slot-value gf 'method-class))
(defun (setf generic-function-method-class) (new-value gf)
  (setf (slot-value gf 'method-class) new-value))

(defun generic-function-method-combination (gf)
  (slot-value gf 'method-combination))
(defun (setf generic-function-method-combination) (new-value gf)
  (setf (slot-value gf 'method-combination) new-value))

(defun generic-function-argument-precedence-order (gf)
  (slot-value gf 'argument-precedence-order))
(defun (setf generic-function-argument-precedence-order) (new-value gf)
  (setf (slot-value gf 'argument-precedence-order) new-value))

;;; Internal accessor for effective method function table

(defun classes-to-emf-table (gf)
  (instance-ref gf *sgf-classes-to-emf-table-index*))

(defun (setf classes-to-emf-table) (new-value gf)
  (setf (slot-value gf 'classes-to-emf-table) new-value))

;;; Method metaobjects and standard-method

(defclass standard-method (method)
  ((lambda-list :initarg :lambda-list)     ; :accessor method-lambda-list
   (qualifiers :initarg :qualifiers)       ; :accessor method-qualifiers
   (specializers :initarg :specializers)   ; :accessor method-specializers
   (declarations :initarg :declarations)   ; :accessir method-declarations
   (body :initarg :body)                   ; :accessor method-body
   (environment :initarg :environment)     ; :accessor method-environment
   (generic-function :initform nil)        ; :accessor method-generic-function
   (function)                              ; :accessor method-function
   (documentation)))                       ; :accessor method-documentation

(defvar the-class-standard-method (find-class 'standard-method))

(defvar *sm-function-index*
  (slot-location the-class-standard-method 'function))

(defun method-lambda-list (method) (slot-value method 'lambda-list))
(defun (setf method-lambda-list) (new-value method)
  (setf (slot-value method 'lambda-list) new-value))

(defun method-qualifiers (method) (slot-value method 'qualifiers))
(defun (setf method-qualifiers) (new-value method)
  (setf (slot-value method 'qualifiers) new-value))

(defun method-specializers (method) (slot-value method 'specializers))
(defun (setf method-specializers) (new-value method)
  (setf (slot-value method 'specializers) new-value))

(defun method-declarations (method) (slot-value method 'declarations))
(defun (setf method-declarations) (new-value method)
  (setf (slot-value method 'declarations) new-value))

(defun method-body (method) (slot-value method 'body))
(defun (setf method-body) (new-value method)
  (setf (slot-value method 'body) new-value))

(defun method-environment (method) (slot-value method 'environment))
(defun (setf method-environment) (new-value method)
  (setf (slot-value method 'environment) new-value))

(defun method-generic-function (method)
  (slot-value method 'generic-function))
(defun (setf method-generic-function) (new-value method)
  (setf (slot-value method 'generic-function) new-value))

(defun method-function (method)
  (instance-ref method *sm-function-index*))

(defun (setf method-function) (new-value method)
  (setf (slot-value method 'function) new-value))

(defun method-documentation (method)
  (slot-value method 'documentation))

(defun (setf method-documentation) (new-value method)
  (setf (slot-value method 'documentation) new-value))

;;; defgeneric

(defmacro defgeneric (function-name lambda-list
                                    &rest options-and-method-descriptions)
  (let ((options ())
        (methods ())
        (documentation nil))
    (dolist (item options-and-method-descriptions)
      (case (car item)
        (declare) ; FIXME
        (:documentation
         (when documentation
           (error 'program-error
                  :format-control "Documentation option was specified twice for generic function ~S."
                  :format-arguments (list function-name)))
         (setf documentation t)
         (push item options))
        (:method
         (push `(defmethod ,function-name ,@(cdr item)) methods))
        (t
         (push item options))))
    (setf options (nreverse options)
          methods (nreverse methods))
    `(prog1
       (ensure-generic-function
        ',function-name
        :lambda-list ',lambda-list
        ,@(canonicalize-defgeneric-options options))
       ,@methods)))

(defun canonicalize-defgeneric-options (options)
  (mapappend #'canonicalize-defgeneric-option options))

(defun canonicalize-defgeneric-option (option)
  (case (car option)
    (:generic-function-class
     (list :generic-function-class `(find-class ',(cadr option))))
    (:method-class
     (list :method-class `(find-class ',(cadr option))))
    (:method-combination
     (list :method-combination `',(cdr option)))
    (:argument-precedence-order
     (list :argument-precedence-order `',(cdr option)))
    (t
     (list `',(car option) `',(cadr option)))))

;; From OpenMCL.
(defun canonicalize-argument-precedence-order (apo req)
  (cond ((equal apo req) nil)
        ((not (eql (length apo) (length req)))
         (error 'program-error
                :format-control "Specified argument precedence order ~S does not match lambda list."
                :format-arguments (list apo)))
        (t (let ((res nil))
             (dolist (arg apo (nreverse res))
               (let ((index (position arg req)))
                 (if (or (null index) (memq index res))
                     (error 'program-error
                            :format-control "Specified argument precedence order ~S does not match lambda list."
                            :format-arguments (list apo)))
                 (push index res)))))))

(defparameter generic-function-table (make-hash-table :test #'equal))

;; FIXME Do we still need this?
(defun find-generic-function (symbol &optional (errorp t))
  (let ((gf (gethash symbol generic-function-table nil)))
    (if (and (null gf) errorp)
        (error "no generic function named ~S" symbol)
        gf)))

(defun (setf find-generic-function) (new-value symbol)
  (setf (gethash symbol generic-function-table) new-value))

(defun lambda-lists-congruent-p (lambda-list1 lambda-list2)
  (let* ((plist1 (analyze-lambda-list lambda-list1))
         (args1 (getf plist1 :required-args))
         (plist2 (analyze-lambda-list lambda-list2))
         (args2 (getf plist2 :required-args)))
    (= (length args1) (length args2))))

(defun ensure-generic-function (function-name
                                &rest all-keys
                                &key
                                lambda-list
                                (generic-function-class the-class-standard-gf)
                                (method-class the-class-standard-method)
                                (method-combination 'standard)
                                documentation
                                &allow-other-keys)
  (when (autoloadp function-name)
    (resolve function-name))
  (let ((gf (find-generic-function function-name nil)))
    (if gf
        (progn
          (unless (or (null (generic-function-methods gf))
                      (lambda-lists-congruent-p lambda-list (generic-function-lambda-list gf)))
            (error 'simple-error
                   :format-control "The lambda list ~S is incompatible with the existing methods of ~S."
                   :format-arguments (list lambda-list gf)))
          (setf (generic-function-lambda-list gf) lambda-list)
          (setf (generic-function-documentation gf) documentation)
          gf)
        (progn
          (when (fboundp function-name)
            (error 'program-error
                   :format-control "~A already names an ordinary function, macro, or special operator."
                   :format-arguments (list function-name)))
          (setf gf (apply (if (eq generic-function-class the-class-standard-gf)
                              #'make-instance-standard-generic-function
                              #'make-instance)
                          generic-function-class
                          :name function-name
                          :method-class method-class
                          :method-combination method-combination
                          all-keys))
          (setf (find-generic-function function-name) gf)
          gf))))

(defun finalize-generic-function (gf)
  (setf (generic-function-discriminating-function gf)
        (funcall (if (eq (class-of gf) the-class-standard-gf)
                     #'std-compute-discriminating-function
                     #'compute-discriminating-function)
                 gf))
  (setf (fdefinition (generic-function-name gf)) gf)
  (clrhash (classes-to-emf-table gf))
  (values))

(defun gf-required-args (gf)
  (instance-ref gf *sgf-required-args-index*))

(defun make-instance-standard-generic-function (generic-function-class
                                                &key name lambda-list
                                                method-class
                                                method-combination
                                                argument-precedence-order
                                                documentation)
  (declare (ignore generic-function-class))
  (let ((gf (std-allocate-instance the-class-standard-gf)))
    (setf (generic-function-name gf) name)
    (setf (generic-function-lambda-list gf) lambda-list)
    (setf (generic-function-methods gf) ())
    (setf (generic-function-method-class gf) method-class)
    (setf (generic-function-method-combination gf) method-combination)
    (setf (generic-function-documentation gf) documentation)
    (setf (classes-to-emf-table gf) (make-hash-table :test #'equal))
    (let* ((plist (analyze-lambda-list (generic-function-lambda-list gf)))
           (required-args (getf plist ':required-args)))
      (setf (slot-value gf 'required-args) required-args)
      (setf (slot-value gf 'argument-precedence-order)
            (if argument-precedence-order
                (canonicalize-argument-precedence-order argument-precedence-order
                                                        required-args)
                nil)))
    (finalize-generic-function gf)
    gf))

(defun top-level-environment ()
  nil)

(defun compile-in-lexical-environment (env lambda-expr)
  (make-closure lambda-expr env))

(defmacro defmethod (&rest args &environment environment)
  (multiple-value-bind
    (function-name qualifiers lambda-list specializers documentation declarations body)
    (parse-defmethod args)
    `(progn
       (unless (find-generic-function ',function-name nil)
         (ensure-generic-function
          ',function-name
          :lambda-list ',lambda-list))
       (ensure-method (find-generic-function ',function-name)
                      :lambda-list ',lambda-list
                      :qualifiers ',qualifiers
                      :specializers ',specializers
                      :documentation ,documentation
                      :declarations ',declarations
                      :body ',body
                      :environment ,environment))))

(defun canonicalize-specializers (specializers)
  (mapcar #'canonicalize-specializer specializers))

(defun canonicalize-specializer (specializer)
  (cond ((classp specializer)
         specializer)
        ((eql-specializer-p specializer)
         specializer)
        ((symbolp specializer)
         (find-class specializer))
        ((and (consp specializer)
              (eq (car specializer) 'eql))
         (let ((object (cadr specializer)))
           (when (and (consp object)
                      (eq (car object) 'quote))
             (setf object (cadr object)))
           (intern-eql-specializer object)))
        (t
         (error "Unknown specializer: ~S~%." specializer))))

(defun parse-defmethod (args)
  (let ((function-name (car args))
        (qualifiers ())
        (specialized-lambda-list ())
        (specializers ())
        (body ())
        (parse-state :qualifiers))
    (dolist (arg (cdr args))
      (ecase parse-state
        (:qualifiers
         (if (and (atom arg) (not (null arg)))
             (push-on-end arg qualifiers)
             (progn (setf specialized-lambda-list arg)
               (setf parse-state :body))))
        (:body (push-on-end arg body))))
    (setf specializers
          (canonicalize-specializers (extract-specializers specialized-lambda-list)))
    (multiple-value-bind (real-body declarations documentation)
      (parse-body body)
        (values function-name
                qualifiers
                (extract-lambda-list specialized-lambda-list)
                specializers
                documentation
                declarations
                (list* 'block
                         (if (consp function-name)
                             (cadr function-name)
                             function-name)
                         real-body)))))

(defun required-portion (gf args)
  (let ((number-required (length (gf-required-args gf))))
    (when (< (length args) number-required)
      (error 'program-error
             :format-control "Not enough arguments for generic function ~S."
             :format-arguments (list (generic-function-name gf))))
    (subseq args 0 number-required)))

(defun extract-lambda-list (specialized-lambda-list)
  (let* ((plist (analyze-lambda-list specialized-lambda-list))
         (requireds (getf plist :required-names))
         (rv (getf plist :rest-var))
         (ks (getf plist :key-args))
         (keysp (getf plist :keysp))
         (aok (getf plist :allow-other-keys))
         (opts (getf plist :optional-args))
         (auxs (getf plist :auxiliary-args)))
    `(,@requireds
      ,@(if rv `(&rest ,rv) ())
      ,@(if (or ks keysp aok) `(&key ,@ks) ())
      ,@(if aok '(&allow-other-keys) ())
      ,@(if opts `(&optional ,@opts) ())
      ,@(if auxs `(&aux ,@auxs) ()))))

(defun extract-specializers (specialized-lambda-list)
  (let ((plist (analyze-lambda-list specialized-lambda-list)))
    (getf plist ':specializers)))

(defun analyze-lambda-list (lambda-list)
  (labels ((make-keyword (symbol)
                         (intern (symbol-name symbol)
                                 (find-package 'keyword)))
           (get-keyword-from-arg (arg)
                                 (if (listp arg)
                                     (if (listp (car arg))
                                         (caar arg)
                                         (make-keyword (car arg)))
                                     (make-keyword arg))))
          (let ((keys ())           ; Just the keywords
                (key-args ())       ; Keywords argument specs
                (keysp nil)         ;
                (required-names ()) ; Just the variable names
                (required-args ())  ; Variable names & specializers
                (specializers ())   ; Just the specializers
                (rest-var nil)
                (optionals ())
                (auxs ())
                (allow-other-keys nil)
                (state :parsing-required))
            (dolist (arg lambda-list)
              (if (member arg lambda-list-keywords)
                  (ecase arg
                    (&optional
                     (setq state :parsing-optional))
                    (&rest
                     (setq state :parsing-rest))
                    (&key
                     (setq keysp t)
                     (setq state :parsing-key))
                    (&allow-other-keys
                     (setq allow-other-keys 't))
                    (&aux
                     (setq state :parsing-aux)))
                  (case state
                    (:parsing-required
                     (push-on-end arg required-args)
                     (if (listp arg)
                         (progn (push-on-end (car arg) required-names)
                           (push-on-end (cadr arg) specializers))
                         (progn (push-on-end arg required-names)
                           (push-on-end 't specializers))))
                    (:parsing-optional (push-on-end arg optionals))
                    (:parsing-rest (setq rest-var arg))
                    (:parsing-key
                     (push-on-end (get-keyword-from-arg arg) keys)
                     (push-on-end arg key-args))
                    (:parsing-aux (push-on-end arg auxs)))))
            (list  :required-names required-names
                   :required-args required-args
                   :specializers specializers
                   :rest-var rest-var
                   :keywords keys
                   :key-args key-args
                   :keysp keysp
                   :auxiliary-args auxs
                   :optional-args optionals
                   :allow-other-keys allow-other-keys))))

#+nil
(defun check-method-arg-info (gf arg-info method)
  (multiple-value-bind (nreq nopt keysp restp allow-other-keys-p keywords)
    (analyze-lambda-list (if (consp method)
                             (early-method-lambda-list method)
                             (method-lambda-list method)))
    (flet ((lose (string &rest args)
                 (error 'simple-program-error
                        :format-control "~@<attempt to add the method~2I~_~S~I~_~
                        to the generic function~2I~_~S;~I~_~
                        but ~?~:>"
                        :format-arguments (list method gf string args)))
	   (comparison-description (x y)
                                   (if (> x y) "more" "fewer")))
      (let ((gf-nreq (arg-info-number-required arg-info))
	    (gf-nopt (arg-info-number-optional arg-info))
	    (gf-key/rest-p (arg-info-key/rest-p arg-info))
	    (gf-keywords (arg-info-keys arg-info)))
	(unless (= nreq gf-nreq)
	  (lose
	   "the method has ~A required arguments than the generic function."
	   (comparison-description nreq gf-nreq)))
	(unless (= nopt gf-nopt)
	  (lose
	   "the method has ~A optional arguments than the generic function."
	   (comparison-description nopt gf-nopt)))
	(unless (eq (or keysp restp) gf-key/rest-p)
	  (lose
	   "the method and generic function differ in whether they accept~_~
	    &REST or &KEY arguments."))
	(when (consp gf-keywords)
	  (unless (or (and restp (not keysp))
		      allow-other-keys-p
		      (every (lambda (k) (memq k keywords)) gf-keywords))
	    (lose "the method does not accept each of the &KEY arguments~2I~_~
            ~S."
		  gf-keywords)))))))

(defun check-method-lambda-list (method-lambda-list gf-lambda-list)
  (let* ((gf-restp (not (null (memq '&rest gf-lambda-list))))
         (gf-plist (analyze-lambda-list gf-lambda-list))
         (gf-keysp (getf gf-plist :keysp))
         (gf-keywords (getf gf-plist :keywords))
         (method-plist (analyze-lambda-list method-lambda-list))
         (method-restp (not (null (memq '&rest method-lambda-list))))
         (method-keysp (getf method-plist :keysp))
         (method-keywords (getf method-plist :keywords))
         (method-allow-other-keys-p (getf method-plist :allow-other-keys)))
    (unless (= (length (getf gf-plist :required-args))
               (length (getf method-plist :required-args)))
      (error "The method has the wrong number of required arguments for the generic function."))
    (unless (= (length (getf gf-plist :optional-args))
               (length (getf method-plist :optional-args)))
      (error "The method has the wrong number of optional arguments for the generic function."))
    (unless (eq (or gf-restp gf-keysp) (or method-restp method-keysp))
      (error "The method and the generic function differ in whether they accept &REST or &KEY arguments."))
    (when (consp gf-keywords)
      (unless (or (and method-restp (not method-keysp))
                  method-allow-other-keys-p
                  (every (lambda (k) (memq k method-keywords)) gf-keywords))
        (error "The method does not accept all of the keyword arguments defined for the generic function.")))))

(defun ensure-method (gf &rest all-keys)
  (let ((method-lambda-list (getf all-keys :lambda-list))
        (gf-lambda-list (generic-function-lambda-list gf)))
    (check-method-lambda-list method-lambda-list gf-lambda-list))
  (let ((method
         (apply
          (if (eq (generic-function-method-class gf) the-class-standard-method)
              #'make-instance-standard-method
              #'make-instance)
          (generic-function-method-class gf)
          all-keys)))
    (%add-method gf method)
    method))

(defun make-instance-standard-method (method-class
                                      &key
                                      lambda-list qualifiers specializers
                                      documentation declarations body
                                      environment)
  (declare (ignore method-class))
  (let ((method (std-allocate-instance the-class-standard-method)))
    (setf (method-lambda-list method) lambda-list)
    (setf (method-qualifiers method) qualifiers)
    (setf (method-specializers method) specializers)
    (setf (method-documentation method) documentation)
    (setf (method-declarations method) declarations)
    (setf (method-body method) (precompile-form body nil))
    (setf (method-environment method) environment)
    (setf (method-generic-function method) nil)
    (setf (method-function method) (std-compute-method-function method))
    method))

(defun add-method (gf method)
  (let ((method-lambda-list (method-lambda-list method))
        (gf-lambda-list (generic-function-lambda-list gf)))
    (check-method-lambda-list method-lambda-list gf-lambda-list))
  (%add-method gf method))

(defun %add-method (gf method)
  (when (method-generic-function method)
    (error 'simple-error
           :format-control "ADD-METHOD: ~S is a method of ~S."
           :format-arguments (list method (method-generic-function method))))
  ;; Remove existing method with same qualifiers and specializers (if any).
  (let ((old-method (find-method gf (method-qualifiers method)
                                 (method-specializers method) nil)))
    (when old-method
      (remove-method gf old-method)))
  (setf (method-generic-function method) gf)
  (push method (generic-function-methods gf))
  (dolist (specializer (method-specializers method))
    (when (typep specializer 'class) ;; FIXME What about EQL specializer objects?
      (pushnew method (class-direct-methods specializer))))
  (finalize-generic-function gf)
  gf)

(defun remove-method (gf method)
  (setf (generic-function-methods gf)
        (remove method (generic-function-methods gf)))
  (setf (method-generic-function method) nil)
  (dolist (specializer (method-specializers method))
    (when (typep specializer 'class) ;; FIXME What about EQL specializer objects?
      (setf (class-direct-methods specializer)
            (remove method (class-direct-methods specializer)))))
  (finalize-generic-function gf)
  gf)

(defun find-method (gf qualifiers specializers &optional (errorp t))
  (let* ((canonical-specializers (canonicalize-specializers specializers))
         (method
          (find-if #'(lambda (method)
                      (and (equal qualifiers
                                  (method-qualifiers method))
                           (equal canonical-specializers
                                  (method-specializers method))))
                   (generic-function-methods gf))))
    (if (and (null method) errorp)
        (error "No such method for ~S." (generic-function-name gf))
        method)))

;;; Reader and writer methods

(defun add-reader-method (class fn-name slot-name)
  (ensure-method
   (ensure-generic-function fn-name :lambda-list '(object))
   :lambda-list '(object)
   :qualifiers ()
   :specializers (list class)
   :body `(slot-value object ',slot-name)
   :environment (top-level-environment))
  (values))

(defun add-writer-method (class fn-name slot-name)
  (ensure-method
   (ensure-generic-function
    fn-name :lambda-list '(new-value object))
   :lambda-list '(new-value object)
   :qualifiers ()
   :specializers (list (find-class 't) class)
   :body `(setf (slot-value object ',slot-name)
                new-value)
   :environment (top-level-environment))
  (values))

(defun subclassp (c1 c2)
  (not (null (find c2 (class-precedence-list c1)))))

(defun methods-contain-eql-specializer-p (methods)
  (dolist (method methods nil)
    (when (dolist (spec (method-specializers method) nil)
            (when (eql-specializer-p spec) (return t)))
      (return t))))

(defun std-compute-discriminating-function (gf)
  (let ((code
         (if (methods-contain-eql-specializer-p (generic-function-methods gf))
             (make-closure `(lambda (&rest args)
                              (slow-method-lookup ,gf args nil))
                           nil)
             (let ((emf-table (classes-to-emf-table gf))
                   (number-required (length (gf-required-args gf))))
               (make-closure
                `(lambda (&rest args)
                   (when (< (length args) ,number-required)
                     (error 'program-error
                            :format-control "Not enough arguments for generic function ~S."
                            :format-arguments (list (generic-function-name ,gf))))
                   (let* ((classes (mapcar #'class-of (subseq args 0 ,number-required)))
                          (emfun (gethash classes ,emf-table)))
                     (if emfun
                         (funcall emfun args)
                         (slow-method-lookup ,gf args classes))))
                nil)))))
    (when (and (fboundp 'jvm:jvm-compile)
               (not (autoloadp 'jvm:jvm-compile)))
      (setf code (jvm:jvm-compile nil code)))
    code))

(defun method-applicable-p (method args)
  (do* ((specializers (method-specializers method) (cdr specializers))
        (args args (cdr args)))
       ((null specializers) t)
    (let ((specializer (car specializers)))
      (if (typep specializer 'eql-specializer)
          (unless (eql (car args) (eql-specializer-object specializer))
            (return nil))
          (unless (subclassp (class-of (car args)) specializer)
            (return nil))))))

(defun %compute-applicable-methods (gf args)
  (let ((required-classes (mapcar #'class-of (required-portion gf args)))
        (methods ()))
    (dolist (method (generic-function-methods gf))
      (when (method-applicable-p method args)
        (push method methods)))
    (sort methods
          (if (eq (class-of gf) the-class-standard-gf)
              #'(lambda (m1 m2)
                 (std-method-more-specific-p m1 m2 required-classes
                                             (generic-function-argument-precedence-order gf)))
              #'(lambda (m1 m2)
                 (method-more-specific-p gf m1 m2 required-classes))))))

(defun slow-method-lookup (gf args classes)
  (let ((applicable-methods (%compute-applicable-methods gf args)))
    (if applicable-methods
        (let ((emfun (funcall (if (eq (class-of gf) the-class-standard-gf)
                                  #'std-compute-effective-method-function
                                  #'compute-effective-method-function)
                              gf applicable-methods)))
          (when classes
            (setf (gethash classes (classes-to-emf-table gf)) emfun))
          (funcall emfun args))
        (error "No applicable methods for generic function ~A with arguments ~S of classes ~S."
               (generic-function-name gf) args classes))))

(defun sub-specializer-p (c1 c2 c-arg)
  (find c2 (cdr (memq c1 (class-precedence-list c-arg)))))

(defun std-method-more-specific-p (method1 method2 required-classes argument-precedence-order)
  (if argument-precedence-order
      (let ((specializers-1 (method-specializers method1))
            (specializers-2 (method-specializers method2)))
        (dolist (index argument-precedence-order)
          (let ((spec1 (nth index specializers-1))
                (spec2 (nth index specializers-2)))
            (unless (eq spec1 spec2)
              (cond ((eql-specializer-p spec1)
                     (return t))
                    ((eql-specializer-p spec2)
                     (return nil))
                    (t
                     (return (sub-specializer-p spec1 spec2
                                                (nth index required-classes)))))))))
      (do ((specializers-1 (method-specializers method1) (cdr specializers-1))
           (specializers-2 (method-specializers method2) (cdr specializers-2))
           (classes required-classes (cdr classes)))
          ((null specializers-1) nil)
        (let ((spec1 (car specializers-1))
              (spec2 (car specializers-2)))
          (unless (eq spec1 spec2)
            (cond ((eql-specializer-p spec1)
                   (return t))
                  ((eql-specializer-p spec2)
                   (return nil))
                  (t
                   (return (sub-specializer-p spec1 spec2 (car classes))))))))))

(defun primary-method-p (method)
  (null (intersection '(:before :after :around) (method-qualifiers method))))

(defun before-method-p (method)
  (equal '(:before) (method-qualifiers method)))

(defun after-method-p (method)
  (equal '(:after) (method-qualifiers method)))

(defun around-method-p (method)
  (equal '(:around) (method-qualifiers method)))

(defun std-compute-effective-method-function (gf methods)
  (let* ((mc (generic-function-method-combination gf))
         (mc-name (if (atom mc) mc (car mc)))
         (options (if (atom mc) () (cdr mc)))
         (order (car options))
         (primaries ())
         (arounds ())
         around)
    (dolist (m methods)
      (let ((qualifiers (method-qualifiers m)))
        (cond ((null qualifiers)
               (if (eq mc-name 'standard)
                   (push m primaries)
                   (error "Method combination type mismatch.")))
              ((cdr qualifiers)
               (error "Invalid method qualifiers."))
              ((eq (car qualifiers) :around)
               (push m arounds))
              ((eq (car qualifiers) mc-name)
               (push m primaries))
              ((memq (car qualifiers) '(:before :after)))
              (t
               (error "Invalid method qualifiers.")))))
    (unless (eq order :most-specific-last)
      (setf primaries (nreverse primaries)))
    (setf arounds (nreverse arounds))
    (setf around (car arounds))
    (when (null primaries)
      (error "No primary methods for the generic function ~S." gf))
    (cond (around
           (let ((next-emfun
                  (funcall
                   (if (eq (class-of gf) the-class-standard-gf)
                       #'std-compute-effective-method-function
                       #'compute-effective-method-function)
                   gf (remove around methods))))
             #'(lambda (args)
                (funcall (method-function around) args next-emfun))))
          ((eq mc-name 'standard)
           (let* ((next-emfun (compute-primary-emfun (cdr primaries)))
                  (befores (remove-if-not #'before-method-p methods))
                  (reverse-afters
                   (reverse (remove-if-not #'after-method-p methods)))
                  (code
                   (make-closure
                    (if (and (null befores) (null reverse-afters))
                        `(lambda (args)
                           (funcall ,(method-function (car primaries)) args ,next-emfun))
                        `(lambda (args)
                           (dolist (before ',befores)
                             (funcall (method-function before) args nil))
                           (multiple-value-prog1
                            (funcall (method-function ,(car primaries)) args ,next-emfun)
                            (dolist (after ',reverse-afters)
                              (funcall (method-function after) args nil)))))
                    nil)))
             code))
          (t
           (let ((mc-obj (get mc-name 'method-combination-object)))
             (unless mc-obj
               (error "Unsupported method combination type ~A." mc-name))
             (let* ((operator (method-combination-operator mc-obj))
                    (ioa (method-combination-identity-with-one-argument mc-obj))
                    (form
                     (if (and (null (cdr primaries))
                              (not (null ioa)))
                         `(lambda (args)
                            (funcall ,(method-function (car primaries)) args nil))
                         `(lambda (args)
                            (,operator ,@(mapcar
                                          (lambda (primary)
                                            `(funcall ,(method-function primary) args nil))
                                          primaries))))))
               (coerce-to-function form)))))))

;;; compute an effective method function from a list of primary methods:

(defun compute-primary-emfun (methods)
  (if (null methods)
      nil
      (let ((next-emfun (compute-primary-emfun (cdr methods))))
        #'(lambda (args)
           (funcall (method-function (car methods)) args next-emfun)))))

(defvar *call-next-method-p*)
(defvar *next-method-p-p*)

(defun walk-form (form)
  (cond ((atom form)
         (cond ((eq form 'call-next-method)
                (setf *call-next-method-p* t))
               ((eq form 'next-method-p)
                (setf *next-method-p-p* t))))
        (t
         (walk-form (car form))
         (walk-form (cdr form)))))

(defun std-compute-method-function (method)
  (let ((body (method-body method))
        (declarations (method-declarations method))
        (lambda-list (kludge-arglist (method-lambda-list method)))
        (*call-next-method-p* nil)
        (*next-method-p-p* nil))
    (walk-form body)
    (compile-in-lexical-environment
     (method-environment method)
     (if (or *call-next-method-p* *next-method-p-p*)
         `(lambda (args next-emfun)
            (flet ((call-next-method (&rest cnm-args)
                                     (if (null next-emfun)
                                         (error "No next method for generic function ~S."
                                                (method-generic-function ',method))
                                         (funcall next-emfun (or cnm-args args))))
                   (next-method-p ()
                                  (not (null next-emfun))))
              (apply #'(lambda ,lambda-list ,@declarations ,body) args)))
         (let ((code (make-closure `(lambda ,lambda-list ,@declarations ,body)
                                   (method-environment method))))
           (when (and (fboundp 'jvm:jvm-compile)
                      (not (autoloadp 'jvm:jvm-compile)))
             (setf code (jvm:jvm-compile nil code)))
           `(lambda (args next-emfun) (apply ,code args)))))))

;;; N.B. The function kludge-arglist is used to pave over the differences
;;; between argument keyword compatibility for regular functions versus
;;; generic functions.

;; FIXME
;; From CLHS section 7.6.5:
;; "When a generic function or any of its methods mentions &key in a lambda
;; list, the specific set of keyword arguments accepted by the generic function
;; varies according to the applicable methods. The set of keyword arguments
;; accepted by the generic function for a particular call is the union of the
;; keyword arguments accepted by all applicable methods and the keyword
;; arguments mentioned after &key in the generic function definition, if any."

(defun kludge-arglist (lambda-list)
  (if (and (member '&key lambda-list)
           (not (member '&allow-other-keys lambda-list)))
      (append lambda-list '(&allow-other-keys))
      (if (and (not (member '&rest lambda-list))
               (not (member '&key lambda-list)))
          (append lambda-list '(&key &allow-other-keys))
          lambda-list)))

(fmakunbound 'class-name)

(defgeneric class-name (class))

(defmethod class-name ((class class))
  (%class-name class))

(defgeneric (setf class-name) (new-value class))

(defmethod (setf class-name) (new-value (class class))
  (%set-class-name class new-value))

(fmakunbound 'documentation)

(defgeneric documentation (x doc-type))

(defgeneric (setf documentation) (new-value x doc-type))

(defmethod documentation ((x symbol) doc-type)
  (case doc-type
    (FUNCTION
     (get x '%function-documentation))
    (VARIABLE
     (get x '%variable-documentation))
    (STRUCTURE
     (get x '%structure-documentation))))

(defmethod (setf documentation) (new-value (x symbol) doc-type)
  (case doc-type
    (FUNCTION
     (setf (get x '%function-documentation) docstring))
    (VARIABLE
     (setf (get x '%variable-documentation) docstring))
    (STRUCTURE
     (setf (get x '%structure-documentation) docstring))))

(defmethod documentation ((x standard-class) (doc-type (eql 't)))
  (class-documentation x))

(defmethod documentation ((x standard-class) (doc-type (eql 'type)))
  (class-documentation x))

(defmethod (setf documentation) (new-value (x standard-class) (doc-type (eql 't)))
  (%set-class-documentation x new-value))

(defmethod (setf documentation) (new-value (x standard-class) (doc-type (eql 'type)))
  (%set-class-documentation x new-value))

(defmethod documentation ((x standard-generic-function) (doc-type (eql 't)))
  (generic-function-documentation x))

(defmethod (setf documentation) (new-value (x standard-generic-function) (doc-type (eql 't)))
  (setf (generic-function-documentation x) new-value))

(defmethod documentation ((x standard-generic-function) (doc-type (eql 'function)))
  (generic-function-documentation x))

(defmethod (setf documentation) (new-value (x standard-generic-function) (doc-type (eql 'function)))
  (setf (generic-function-documentation x) new-value))

(defmethod documentation ((x standard-method) (doc-type (eql 't)))
  (method-documentation x))

(defmethod (setf documentation) (new-value (x standard-method) (doc-type (eql 't)))
  (setf (method-documentation x) new-value))

;; FIXME
(defmethod documentation ((x package) (doc-type (eql 't)))
  nil)

;; FIXME
(defmethod (setf documentation) (new-value (x package) (doc-type (eql 't)))
  new-value)

;;; Slot access

(defun setf-slot-value-using-class (new-value class instance slot-name)
  (setf (std-slot-value instance slot-name) new-value))

(defgeneric slot-value-using-class (class instance slot-name))

(defmethod slot-value-using-class ((class standard-class) instance slot-name)
  (std-slot-value instance slot-name))

(defgeneric (setf slot-value-using-class) (new-value class instance slot-name))
(defmethod (setf slot-value-using-class)
  (new-value (class standard-class) instance slot-name)
  (setf (std-slot-value instance slot-name) new-value))

(defgeneric slot-exists-p-using-class (class instance slot-name))

(defmethod slot-exists-p-using-class (class instance slot-name)
  nil)

(defmethod slot-exists-p-using-class ((class standard-class) instance slot-name)
  (std-slot-exists-p instance slot-name))

(defmethod slot-exists-p-using-class ((class structure-class) instance slot-name)
  (dolist (dsd (class-slots class))
    (when (eq (dsd-name dsd) slot-name)
      (return-from slot-exists-p-using-class t)))
  nil)

(defgeneric slot-boundp-using-class (class instance slot-name))
(defmethod slot-boundp-using-class
  ((class standard-class) instance slot-name)
  (std-slot-boundp instance slot-name))

(defgeneric slot-makunbound-using-class (class instance slot-name))
(defmethod slot-makunbound-using-class
  ((class standard-class) instance slot-name)
  (std-slot-makunbound instance slot-name))

(defgeneric slot-missing (class instance slot-name operation &optional new-value))

(defmethod slot-missing ((class t) instance slot-name operation &optional new-value)
  (error "The slot ~S is missing from the class ~S." slot-name class))

(defgeneric slot-unbound (class instance slot-name))

(defmethod slot-unbound ((class t) instance slot-name)
  (error 'unbound-slot :instance instance :name slot-name))

;;; Instance creation and initialization

(defgeneric allocate-instance (class &rest initargs &key &allow-other-keys))

(defmethod allocate-instance ((class standard-class) &rest initargs)
  (std-allocate-instance class))

(defmethod allocate-instance ((class structure-class) &rest initargs)
  (%make-structure (%class-name class)
                   (make-list (length (class-slots class))
                              :initial-element +slot-unbound+)))

(defgeneric make-instance (class &key))

(defmethod make-instance ((class standard-class) &rest initargs)
  (when (oddp (length initargs))
    (error 'program-error
           :format-control "Odd number of keyword arguments."))
  (let ((class-default-initargs (class-default-initargs class)))
    (when class-default-initargs
      (let ((default-initargs ()))
        (do* ((list class-default-initargs (cddr list))
              (key (car list) (car list))
              (fn (cadr list) (cadr list)))
             ((null list))
          (when (eq (getf initargs key 'not-found) 'not-found)
            (setf default-initargs (append default-initargs (list key (funcall fn))))))
        (setf initargs (append initargs default-initargs)))))
  (let ((instance (std-allocate-instance class)))
    (apply #'initialize-instance instance initargs)
    instance))

(defmethod make-instance ((class symbol) &rest initargs)
  (apply #'make-instance (find-class class) initargs))

(defgeneric initialize-instance (instance &key))

(defmethod initialize-instance ((instance standard-object) &rest initargs)
  (apply #'shared-initialize instance t initargs))

(defgeneric reinitialize-instance (instance &key))

(defmethod reinitialize-instance
  ((instance standard-object) &rest initargs)
  (apply #'shared-initialize instance () initargs))

(defun std-shared-initialize (instance slot-names all-keys)
  (dolist (slot (class-slots (class-of instance)))
    (let ((slot-name (slot-definition-name slot)))
      (multiple-value-bind (init-key init-value foundp)
        (get-properties all-keys (slot-definition-initargs slot))
        (if foundp
            (setf (std-slot-value instance slot-name) init-value)
            (when (and (not (std-slot-boundp instance slot-name))
                       (slot-definition-initfunction slot)
                       (or (eq slot-names t)
                           (member slot-name slot-names)))
              (setf (std-slot-value instance slot-name)
                    (funcall (slot-definition-initfunction slot))))))))
  instance)

(defgeneric shared-initialize (instance slot-names &key))

(defmethod shared-initialize ((instance standard-object)
                              slot-names &rest all-keys)
  (std-shared-initialize instance slot-names all-keys))

;;; change-class

(defgeneric change-class (instance new-class &key))

(defmethod change-class ((old-instance standard-object) (new-class standard-class)
                         &rest initargs)
  (let ((new-instance (allocate-instance new-class)))
    (dolist (slot-name (mapcar #'slot-definition-name
                               (class-slots new-class)))
      (when (and (slot-exists-p old-instance slot-name)
                 (slot-boundp old-instance slot-name))
        (setf (slot-value new-instance slot-name)
              (slot-value old-instance slot-name))))
    (rotatef (std-instance-slots new-instance)
             (std-instance-slots old-instance))
    (rotatef (std-instance-layout new-instance)
             (std-instance-layout old-instance))
    (apply #'update-instance-for-different-class
           new-instance old-instance initargs)
    old-instance))

(defmethod change-class ((instance standard-object) (new-class symbol) &rest initargs)
  (apply #'change-class instance (find-class new-class) initargs))

(defgeneric update-instance-for-different-class (old new &key))

(defmethod update-instance-for-different-class
  ((old standard-object) (new standard-object) &rest initargs)
  (let ((added-slots
         (remove-if #'(lambda (slot-name)
                       (slot-exists-p old slot-name))
                    (mapcar #'slot-definition-name
                            (class-slots (class-of new))))))
    (apply #'shared-initialize new added-slots initargs)))

;;;  Methods having to do with class metaobjects.

(defmethod initialize-instance :after ((class standard-class) &rest args)
  (apply #'std-after-initialization-for-classes class args))

;;; Finalize inheritance

(defgeneric finalize-inheritance (class))

(defmethod finalize-inheritance ((class standard-class))
  (std-finalize-inheritance class))

;;; Class precedence lists

(defgeneric compute-class-precedence-list (class))
(defmethod compute-class-precedence-list ((class standard-class))
  (std-compute-class-precedence-list class))

;;; Slot inheritance

(defgeneric compute-slots (class))
(defmethod compute-slots ((class standard-class))
  (std-compute-slots class))

(defgeneric compute-effective-slot-definition (class direct-slots))
(defmethod compute-effective-slot-definition
  ((class standard-class) direct-slots)
  (std-compute-effective-slot-definition class direct-slots))

;;; Methods having to do with generic function metaobjects.

(defmethod initialize-instance :after ((gf standard-generic-function) &key)
  (finalize-generic-function gf))

;;; Methods having to do with generic function invocation.

(defgeneric compute-discriminating-function (gf))
(defmethod compute-discriminating-function ((gf standard-generic-function))
  (std-compute-discriminating-function gf))

(defgeneric method-more-specific-p (gf method1 method2 required-classes))

(defmethod method-more-specific-p ((gf standard-generic-function)
                                   method1 method2 required-classes)
  (std-method-more-specific-p method1 method2 required-classes
                              (generic-function-argument-precedence-order gf)))

(defgeneric compute-effective-method-function (gf methods))
(defmethod compute-effective-method-function ((gf standard-generic-function) methods)
  (std-compute-effective-method-function gf methods))

(defgeneric compute-applicable-methods (gf args))
(defmethod compute-applicable-methods ((gf standard-generic-function) args)
  (%compute-applicable-methods gf args))

;;; Conditions.

(defmacro define-condition (name (&rest parent-types) (&rest slot-specs)
				 &body options)
  (let ((parent-types (or parent-types '(condition)))
        (report nil))
    (dolist (option options)
      (when (eq (car option) :report)
        (let ((arg (cadr option)))
          (setf report
                (if (stringp arg)
                    `#'(lambda (condition stream)
                        (declare (ignore condition))
                        (write-string ,arg stream))
                    `#'(lambda (condition stream)
                        (funcall #',arg condition stream)))))))
    `(progn
       (defclass ,name ,parent-types ,slot-specs ,@options)
       (defmethod print-object ((condition ,name) stream)
         (if *print-escape*
             (call-next-method)
             (funcall ,report condition stream)))
       ',name)))

(defun make-condition (type &rest initargs)
  (or (%make-condition type initargs)
      (apply #'make-instance (find-class type) initargs)))

;; Adapted from SBCL.
;; Originally defined in signal.lisp. Redefined here now that we have MAKE-CONDITION.
(defun coerce-to-condition (datum arguments default-type fun-name)
  (cond ((typep datum 'condition)
	 (when arguments
           (error 'simple-type-error
                  :datum arguments
                  :expected-type 'null
                  :format-control "You may not supply additional arguments when giving ~S to ~S."
                  :format-arguments (list datum fun-name)))
	 datum)
	((symbolp datum)
	 (apply #'make-condition datum arguments))
	((or (stringp datum) (functionp datum))
	 (make-condition default-type
                         :format-control datum
                         :format-arguments arguments))
	(t
	 (error 'simple-type-error
		:datum datum
		:expected-type '(or symbol string)
		:format-control "Bad argument to ~S: ~S."
		:format-arguments (list fun-name datum)))))

;; Originally defined in Primitives.java. Redefined here to support arbitrary
;; conditions.
(defun error (datum &rest arguments)
  (let ((condition (coerce-to-condition datum arguments 'simple-error 'error)))
    (signal condition)
    (invoke-debugger condition)))

(defgeneric make-load-form (object &optional environment))

(defmethod make-load-form ((object t) &optional environment)
  (error 'simple-error
         :format-control "No applicable method for MAKE-LOAD-FORM."))

(defmethod make-load-form ((class class) &optional environment)
  (let ((name (class-name class)))
    (unless (and name (eq (find-class name nil) class))
      (error 'simple-type-error
             :format-control "Can't use anonymous or undefined class as a constant: ~S."
             :format-arguments (list class)))
    `(find-class ',name)))

(provide 'clos)
