;;; defstruct.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: defstruct.lisp,v 1.38 2003-11-21 02:41:22 piso Exp $
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

(defmacro ds-name (x)           `(aref ,x  0))
(defmacro ds-conc-name (x)      `(aref ,x  1))
(defmacro ds-constructors (x)   `(aref ,x  2))
(defmacro ds-copier (x)         `(aref ,x  3))
(defmacro ds-include (x)        `(aref ,x  4))
(defmacro ds-type (x)           `(aref ,x  5))
(defmacro ds-named (x)          `(aref ,x  6))
(defmacro ds-initial-offset (x) `(aref ,x  7))
(defmacro ds-predicate (x)      `(aref ,x  8))
(defmacro ds-print-function (x) `(aref ,x  9))
(defmacro ds-direct-slots (x)   `(aref ,x 10))
(defmacro ds-slots (x)          `(aref ,x 11))

(defun make-defstruct-definition (&key name
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
  (let ((def (make-array 12)))
    (setf (ds-name def) name
          (ds-conc-name def) conc-name
          (ds-constructors def) constructors
          (ds-copier def) copier
          (ds-include def) include
          (ds-type def) type
          (ds-named def) named
          (ds-initial-offset def) initial-offset
          (ds-predicate def) predicate
          (ds-print-function def) print-function
          (ds-direct-slots def) direct-slots
          (ds-slots def) slots)
    def))

(defvar *ds-name*)
(defvar *ds-conc-name*)
(defvar *ds-constructors*)
(defvar *ds-copier*)
(defvar *ds-include*)
(defvar *ds-type*)
(defvar *ds-named*)
(defvar *ds-initial-offset*)
(defvar *ds-predicate*)
(defvar *ds-print-function*)
(defvar *ds-direct-slots*)
(defvar *ds-slots*)

(defun define-constructor (constructor)
  (let* ((constructor-name (intern (car constructor)))
         (keys ())
         (elements ()))
    (dolist (slot *ds-slots*)
      (let ((name (getf slot :name))
            (initform (getf slot :initform)))
        (push (list name initform) keys)
        (push name elements)))
    (setf keys (cons '&key (nreverse keys)))
    (setf elements (nreverse elements))
    (when *ds-named*
      (push (list 'quote *ds-name*) elements))
    (when *ds-initial-offset*
      (dotimes (i *ds-initial-offset*)
        (push nil elements)))
    (cond ((eq *ds-type* 'list)
           `((defun ,constructor-name ,keys
               (list ,@elements))))
          ((or (eq *ds-type* 'vector)
               (and (consp *ds-type*) (eq (car *ds-type*) 'vector)))
           (let ((element-type (if (consp *ds-type*) (cadr *ds-type*) t)))
             `((defun ,constructor-name ,keys
                 (make-array ,(length elements)
                             :element-type ',element-type
                             :initial-contents (list ,@elements))))))
          (t
           `((defun ,constructor-name ,keys
               (%make-structure ',*ds-name* (list ,@elements))))))))

(defun default-constructor-name ()
  (concatenate 'string "MAKE-" (symbol-name *ds-name*)))

(defun define-constructors ()
  (if *ds-constructors*
      (let ((results ()))
        (dolist (constructor *ds-constructors*)
          (when (car constructor)
            (setf results (nconc results (define-constructor constructor)))))
        results)
      (define-constructor (cons (default-constructor-name) nil))))

(defun define-predicate ()
  (when (and *ds-predicate*
             (or *ds-named* (null *ds-type*)))
    (let ((pred (intern *ds-predicate*)))
      (cond ((eq *ds-type* 'list)
             (if *ds-initial-offset*
                 `((defun ,pred (object)
                     (and (consp object)
                          (> (length object) ,*ds-initial-offset*)
                          (eq (elt object ,*ds-initial-offset*) ',*ds-name*))))
                 `((defun ,pred (object)
                     (and (consp object) (eq (car object) ',*ds-name*))))))
            ((or (eq *ds-type* 'vector)
                 (and (consp *ds-type*) (eq (car *ds-type*) 'vector)))
             (let ((index (or *ds-initial-offset* 0)))
               `((defun ,pred (object)
                   (and (vectorp object)
                        (> (length object) ,index)
                        (eq (aref object ,index) ',*ds-name*))))))
            (t
             `((defun ,pred (object)
                 (typep object ',*ds-name*))))))))

(defun get-slot-accessor (slot)
  (when *ds-initial-offset*
    (incf slot *ds-initial-offset*))
  (when *ds-named*
    (incf slot))
  (cond ((eq *ds-type* 'list)
         `(lambda (instance) (elt instance ,slot)))
        ((or (eq *ds-type* 'vector)
             (and (consp *ds-type*) (eq (car *ds-type*) 'vector)))
         `(lambda (instance) (aref instance ,slot)))
        (t
         (case slot
           (0 #'%structure-ref-0)
           (1 #'%structure-ref-1)
           (2 #'%structure-ref-2)
           (t
            `(lambda (instance) (%structure-ref instance ,slot)))))))

(defun get-slot-mutator (slot)
  (when *ds-initial-offset*
    (incf slot *ds-initial-offset*))
  (when *ds-named*
    (incf slot))
  (cond ((eq *ds-type* 'list)
         `(lambda (instance value) (%set-elt instance ,slot value)))
        ((or (eq *ds-type* 'vector)
             (and (consp *ds-type*) (eq (car *ds-type*) 'vector)))
         `(lambda (instance value) (%aset instance ,slot value)))
        (t
         (case slot
           (0 #'%structure-set-0)
           (1 #'%structure-set-1)
           (2 #'%structure-set-2)
           (t
            `(lambda (instance value) (%structure-set instance ,slot value)))))))

(defun define-access-function (slot-name index)
  (let ((accessor
         (if *ds-conc-name*
             (intern (concatenate 'string (symbol-name *ds-conc-name*) (symbol-name slot-name)))
             slot-name)))
    `((setf (symbol-function ',accessor) ,(get-slot-accessor index))
      (%put ',accessor 'setf-inverse ,(get-slot-mutator index )))))

(defun define-access-functions ()
  (let ((index 0)
        (result ()))
    (dolist (slot *ds-slots*)
      (let ((slot-name (getf slot :name)))
        (setf result (nconc result (define-access-function slot-name index))))
      (incf index))
    result))

(defun define-copier ()
  (when *ds-copier*
    (cond ((eq *ds-type* 'list)
           `((setf (fdefinition ',*ds-copier*) #'copy-list)))
          ((or (eq *ds-type* 'vector)
               (and (consp *ds-type*) (eq (car *ds-type*) 'vector)))
           `((setf (fdefinition ',*ds-copier*) #'copy-seq)))
          (t
           `((setf (fdefinition ',*ds-copier*) #'copy-structure))))))

(defun parse-1-option (option)
  (case (car option)
    (:conc-name
     (setf *ds-conc-name* (if (symbolp (cadr option))
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
          (push (list name arglist) *ds-constructors*))
         (1
          (if (null (car args))
              (setf name nil) ; No constructor.
              (setf name (symbol-name (car args))))
          (setf arglist nil)
          (push (list name arglist) *ds-constructors*))
         (2))))
    (:copier
     (let* ((args (cdr option))
            (numargs (length args)))
       (when (= numargs 1)
          (setf *ds-copier* (car args)))))
    (:include
     (setf *ds-include* (cdr option)))
    (:initial-offset
     (setf *ds-initial-offset* (cadr option)))
    (:predicate
     (when (= (length option) 2)
       (if (null (cadr option))
           (setf *ds-predicate* nil)
           (setf *ds-predicate* (symbol-name (cadr option))))))
    (:type
     (setf *ds-type* (cadr option)))
    (t
     (format t "unrecognized DEFSTRUCT option: ~S~%" (car option)))))

(defun parse-name-and-options (name-and-options)
  (setf *ds-name* (car name-and-options))
  (setf *ds-conc-name* (make-symbol (concatenate 'string (symbol-name *ds-name*) "-")))
  (setf *ds-copier* (intern (concatenate 'string "COPY-" (symbol-name *ds-name*))))
  (setf *ds-predicate* (concatenate 'string (symbol-name *ds-name*) "-P"))
  (let ((options (cdr name-and-options)))
    (dolist (option options)
      (cond ((consp option)
             (parse-1-option option))
            ((eq option :named)
             (setf *ds-named* t))
            ((member option '(:constructor :copier :predicate :named
                              :conc-name))
             (parse-1-option (list option)))
            (t
             (error "unrecognized DEFSTRUCT option: ~S" option))))))

(defmacro defstruct (name-and-options &rest slots)
  (let ((*ds-name* nil)
        (*ds-conc-name* nil)
        (*ds-constructors* nil)
        (*ds-copier* nil)
        (*ds-include* nil)
        (*ds-type* nil)
        (*ds-named* nil)
        (*ds-initial-offset* nil)
        (*ds-predicate* nil)
        (*ds-print-function* nil)
        (*ds-direct-slots* ())
        (*ds-slots* ()))
    (parse-name-and-options (if (atom name-and-options)
                                (list name-and-options)
                                name-and-options))
    (when (stringp (car slots))
      (setf (documentation *ds-name* 'structure) (pop slots)))
    (dolist (slot slots)
      (let ((slot-description (if (atom slot)
                                  (list :name slot :initform nil)
                                  (list :name (car slot) :initform (cadr slot)))))
        (push slot-description *ds-direct-slots*)))
    (setf *ds-direct-slots* (nreverse *ds-direct-slots*))
    (if *ds-include*
        (let* ((def (get (car *ds-include*) 'structure-definition))
               (included-slots (ds-slots def)))
          (setf *ds-slots* (append included-slots *ds-direct-slots*)))
        (setf *ds-slots* *ds-direct-slots*))
    `(progn
       (setf (get ',*ds-name* 'structure-definition)
             (make-defstruct-definition :name ',*ds-name*
                                        :conc-name ',*ds-conc-name*
                                        :constructors ',*ds-constructors*
                                        :copier ',*ds-copier*
                                        :include ',*ds-include*
                                        :type ',*ds-type*
                                        :named ,*ds-named*
                                        :initial-offset ,*ds-initial-offset*
                                        :predicate ,*ds-predicate*
                                        :print-function ,*ds-print-function*
                                        :direct-slots ',*ds-direct-slots*
                                        :slots ',*ds-slots*))
       (make-structure-class ',*ds-name* ',*ds-direct-slots* ',*ds-slots*)
       ,@(define-constructors)
       ,@(define-predicate)
       ,@(define-access-functions)
       ,@(define-copier)
       ',*ds-name*)))
