;;; defstruct.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: defstruct.lisp,v 1.41 2003-11-22 02:49:10 piso Exp $
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

;;; DEFSTRUCT-DESCRIPTION

(defmacro dd-name (x)           `(aref ,x  0))
(defmacro dd-conc-name (x)      `(aref ,x  1))
(defmacro dd-constructors (x)   `(aref ,x  2))
(defmacro dd-copier (x)         `(aref ,x  3))
(defmacro dd-include (x)        `(aref ,x  4))
(defmacro dd-type (x)           `(aref ,x  5))
(defmacro dd-named (x)          `(aref ,x  6))
(defmacro dd-initial-offset (x) `(aref ,x  7))
(defmacro dd-predicate (x)      `(aref ,x  8))
(defmacro dd-print-function (x) `(aref ,x  9))
(defmacro dd-direct-slots (x)   `(aref ,x 10))
(defmacro dd-slots (x)          `(aref ,x 11))

(defun make-defstruct-description (&key name
                                        conc-name
                                        constructors
                                        copier
                                        include
                                        type
                                        named
                                        initial-offset
                                        predicate
                                        print-function
                                        direct-slots
                                        slots)
  (let ((dd (make-array 13)))
    (setf (dd-name dd) name
          (dd-conc-name dd) conc-name
          (dd-constructors dd) constructors
          (dd-copier dd) copier
          (dd-include dd) include
          (dd-type dd) type
          (dd-named dd) named
          (dd-initial-offset dd) initial-offset
          (dd-predicate dd) predicate
          (dd-print-function dd) print-function
          (dd-direct-slots dd) direct-slots
          (dd-slots dd) slots)
    dd))

;;; DEFSTRUCT-SLOT-DESCRIPTION

(defmacro dsd-name (x)      `(aref ,x 1))
(defmacro dsd-index (x)     `(aref ,x 2))
(defmacro dsd-reader (x)    `(aref ,x 3))
(defmacro dsd-initform (x)  `(aref ,x 4))
(defmacro dsd-type (x)      `(aref ,x 5))
(defmacro dsd-read-only (x) `(aref ,x 6))

(defun make-defstruct-slot-description (&key name
                                             index
                                             reader
                                             initform
                                             (type t)
                                             read-only)
  (let ((dsd (make-array 7)))
    (setf (aref dsd 0) 'defstruct-slot-description
          (dsd-name dsd) name
          (dsd-index dsd) index
          (dsd-reader dsd) reader
          (dsd-initform dsd) initform
          (dsd-type dsd) type
          (dsd-read-only dsd) read-only)
    dsd))

(defvar *dd-name*)
(defvar *dd-conc-name*)
(defvar *dd-constructors*)
(defvar *dd-copier*)
(defvar *dd-include*)
(defvar *dd-type*)
(defvar *dd-named*)
(defvar *dd-initial-offset*)
(defvar *dd-predicate*)
(defvar *dd-print-function*)
(defvar *dd-direct-slots*)
(defvar *dd-slots*)

(defun define-constructor (constructor)
  (let* ((constructor-name (intern (car constructor)))
         (keys ())
         (elements ()))
    (dolist (slot *dd-slots*)
      (let ((name (dsd-name slot))
            (initform (dsd-initform slot)))
        (when name
          (push (list name initform) keys))))
    (setf keys (cons '&key (nreverse keys)))
    (dolist (dsd *dd-slots*)
      (let ((name (dsd-name dsd))
            (initform (dsd-initform dsd)))
        (if name
            (push name elements)
            (push initform elements))))
    (setf elements (nreverse elements))
    (cond ((eq *dd-type* 'list)
           `((defun ,constructor-name ,keys
               (list ,@elements))))
          ((or (eq *dd-type* 'vector)
               (and (consp *dd-type*) (eq (car *dd-type*) 'vector)))
           (let ((element-type (if (consp *dd-type*) (cadr *dd-type*) t)))
             `((defun ,constructor-name ,keys
                 (make-array ,(length elements)
                             :element-type ',element-type
                             :initial-contents (list ,@elements))))))
          (t
           `((defun ,constructor-name ,keys
               (%make-structure ',*dd-name* (list ,@elements))))))))

(defun default-constructor-name ()
  (concatenate 'string "MAKE-" (symbol-name *dd-name*)))

(defun define-constructors ()
  (if *dd-constructors*
      (let ((results ()))
        (dolist (constructor *dd-constructors*)
          (when (car constructor)
            (setf results (nconc results (define-constructor constructor)))))
        results)
      (define-constructor (cons (default-constructor-name) nil))))

(defun name-index ()
  (dolist (dsd *dd-slots*)
    (let ((name (dsd-name dsd))
          (initform (dsd-initform dsd)))
      (when (and (null name)
                 (equal initform (list 'quote *dd-name*)))
        (return-from name-index (dsd-index dsd)))))
  ;; We shouldn't get here.
  nil)

(defun define-predicate ()
  (when (and *dd-predicate*
             (or *dd-named* (null *dd-type*)))
    (let ((pred (intern *dd-predicate*)))
      (cond ((eq *dd-type* 'list)
             (let ((index (name-index)))
               `((defun ,pred (object)
                   (and (consp object)
                        (> (length object) ,index)
                        (eq (nth ,index object) ',*dd-name*))))))
            ((or (eq *dd-type* 'vector)
                 (and (consp *dd-type*) (eq (car *dd-type*) 'vector)))
             (let ((index (name-index)))
               `((defun ,pred (object)
                   (and (vectorp object)
                        (> (length object) ,index)
                        (eq (aref object ,index) ',*dd-name*))))))
            (t
             `((defun ,pred (object)
                 (typep object ',*dd-name*))))))))

(defun get-slot-accessor (index)
  (cond ((eq *dd-type* 'list)
         `(lambda (instance) (elt instance ,index)))
        ((or (eq *dd-type* 'vector)
             (and (consp *dd-type*) (eq (car *dd-type*) 'vector)))
         `(lambda (instance) (aref instance ,index)))
        (t
         (case index
           (0 #'%structure-ref-0)
           (1 #'%structure-ref-1)
           (2 #'%structure-ref-2)
           (t
            `(lambda (instance) (%structure-ref instance ,index)))))))

(defun get-slot-mutator (index)
  (cond ((eq *dd-type* 'list)
         `(lambda (instance value) (%set-elt instance ,index value)))
        ((or (eq *dd-type* 'vector)
             (and (consp *dd-type*) (eq (car *dd-type*) 'vector)))
         `(lambda (instance value) (%aset instance ,index value)))
        (t
         (case index
           (0 #'%structure-set-0)
           (1 #'%structure-set-1)
           (2 #'%structure-set-2)
           (t
            `(lambda (instance value) (%structure-set instance ,index value)))))))

(defun define-access-function (slot-name index)
  (let ((accessor
         (if *dd-conc-name*
             (intern (concatenate 'string (symbol-name *dd-conc-name*) (symbol-name slot-name)))
             slot-name)))
    `((setf (symbol-function ',accessor) ,(get-slot-accessor index))
      (%put ',accessor 'setf-inverse ,(get-slot-mutator index )))))

(defun define-access-functions ()
  (let ((index 0)
        (result ()))
    (dolist (slot *dd-slots*)
      (let ((slot-name (dsd-name slot))
            (expected (dsd-index slot)))
        (setf result (nconc result (define-access-function slot-name expected))))
      (incf index))
    result))

(defun define-copier ()
  (when *dd-copier*
    (cond ((eq *dd-type* 'list)
           `((setf (fdefinition ',*dd-copier*) #'copy-list)))
          ((or (eq *dd-type* 'vector)
               (and (consp *dd-type*) (eq (car *dd-type*) 'vector)))
           `((setf (fdefinition ',*dd-copier*) #'copy-seq)))
          (t
           `((setf (fdefinition ',*dd-copier*) #'copy-structure))))))

(defun parse-1-option (option)
  (case (car option)
    (:conc-name
     (setf *dd-conc-name* (if (symbolp (cadr option))
                              (cadr option)
                              (make-symbol (string (cadr option))))))
    (:constructor
     (let* ((args (cdr option))
            (numargs (length args))
            name arglist)
       (case numargs
         (0 ; Use default name.
          (setf name (default-constructor-name))
          (setf arglist nil)
          (push (list name arglist) *dd-constructors*))
         (1
          (if (null (car args))
              (setf name nil) ; No constructor.
              (setf name (symbol-name (car args))))
          (setf arglist nil)
          (push (list name arglist) *dd-constructors*))
         (2))))
    (:copier
     (let* ((args (cdr option))
            (numargs (length args)))
       (when (= numargs 1)
          (setf *dd-copier* (car args)))))
    (:include
     (setf *dd-include* (cdr option)))
    (:initial-offset
     (setf *dd-initial-offset* (cadr option)))
    (:predicate
     (when (= (length option) 2)
       (if (null (cadr option))
           (setf *dd-predicate* nil)
           (setf *dd-predicate* (symbol-name (cadr option))))))
    (:type
     (setf *dd-type* (cadr option)))
    (t
     (format t "unrecognized DEFSTRUCT option: ~S~%" (car option)))))

(defun parse-name-and-options (name-and-options)
  (setf *dd-name* (car name-and-options))
  (setf *dd-conc-name* (make-symbol (concatenate 'string (symbol-name *dd-name*) "-")))
  (setf *dd-copier* (intern (concatenate 'string "COPY-" (symbol-name *dd-name*))))
  (setf *dd-predicate* (concatenate 'string (symbol-name *dd-name*) "-P"))
  (let ((options (cdr name-and-options)))
    (dolist (option options)
      (cond ((consp option)
             (parse-1-option option))
            ((eq option :named)
             (setf *dd-named* t))
            ((member option '(:constructor :copier :predicate :named
                              :conc-name))
             (parse-1-option (list option)))
            (t
             (error "unrecognized DEFSTRUCT option: ~S" option))))))

(defmacro defstruct (name-and-options &rest slots)
  (let ((*dd-name* nil)
        (*dd-conc-name* nil)
        (*dd-constructors* nil)
        (*dd-copier* nil)
        (*dd-include* nil)
        (*dd-type* nil)
        (*dd-named* nil)
        (*dd-initial-offset* nil)
        (*dd-predicate* nil)
        (*dd-print-function* nil)
        (*dd-direct-slots* ())
        (*dd-slots* ()))
    (parse-name-and-options (if (atom name-and-options)
                                (list name-and-options)
                                name-and-options))
    (when (stringp (car slots))
      (setf (documentation *dd-name* 'structure) (pop slots)))
    (dolist (slot slots)
      (let* ((name (if (atom slot) slot (car slot)))
             (reader (if *dd-conc-name*
                         (intern (concatenate 'string
                                              (symbol-name *dd-conc-name*)
                                              (symbol-name name)))
                         name))
             (initform (if (atom slot) nil (cadr slot)))
             (dsd (make-defstruct-slot-description :name name
                                                   :reader reader
                                                   :initform initform)))
        (push dsd *dd-direct-slots*)))
    (setf *dd-direct-slots* (nreverse *dd-direct-slots*))
    (let ((index 0))
      (when *dd-include*
        (let* ((dd (get (car *dd-include*) 'structure-definition))
               (included-slots (dd-slots dd)))
          (dolist (dsd included-slots)
            (setf (dsd-index dsd) index)
            (push dsd *dd-slots*)
            (incf index))))
      (when *dd-initial-offset*
        (dotimes (i *dd-initial-offset*)
          (push (make-defstruct-slot-description :name nil
                                                 :index index
                                                 :reader nil
                                                 :initform nil
                                                 :type t
                                                 :read-only t)
                *dd-slots*)
          (incf index)))
      (when *dd-named*
        (push (make-defstruct-slot-description :name nil
                                               :index index
                                               :reader nil
                                               :initform (list 'quote *dd-name*)
                                               :type t
                                               :read-only t)
              *dd-slots*)
        (incf index))
      (dolist (dsd *dd-direct-slots*)
        (setf (dsd-index dsd) index)
        (push dsd *dd-slots*)
        (incf index)))
    (setf *dd-slots* (nreverse *dd-slots*))
    `(progn
       (setf (get ',*dd-name* 'structure-definition)
             (make-defstruct-description :name ',*dd-name*
                                         :conc-name ',*dd-conc-name*
                                         :constructors ',*dd-constructors*
                                         :copier ',*dd-copier*
                                         :include ',*dd-include*
                                         :type ',*dd-type*
                                         :named ,*dd-named*
                                         :initial-offset ,*dd-initial-offset*
                                         :predicate ,*dd-predicate*
                                         :print-function ,*dd-print-function*
                                         :direct-slots ',*dd-direct-slots*
                                         :slots ',*dd-slots*))
       (make-structure-class ',*dd-name* ',*dd-direct-slots* ',*dd-slots*)
       ,@(define-constructors)
       ,@(define-predicate)
       ,@(define-access-functions)
       ,@(define-copier)
       ',*dd-name*)))
