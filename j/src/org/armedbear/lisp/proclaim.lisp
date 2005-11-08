;;; proclaim.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: proclaim.lisp,v 1.10 2005-11-08 14:58:19 piso Exp $
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

(in-package #:system)

(export '(check-declaration-type proclaimed-ftype ftype-result-type))

(defmacro declaim (&rest decls)
`(eval-when (:compile-toplevel :load-toplevel :execute)
   ,@(mapcar (lambda (decl) `(proclaim ',decl))
             decls)))

(defun declaration-error (name)
  (error 'simple-error
         :format-control "The symbol ~S cannot be both the name of a type and the name of a declaration."
         :format-arguments (list name)))

(defvar *declaration-types* (make-hash-table :test 'eq))

;; "A symbol cannot be both the name of a type and the name of a declaration.
;; Defining a symbol as the name of a class, structure, condition, or type,
;; when the symbol has been declared as a declaration name, or vice versa,
;; signals an error."
(defun check-declaration-type (name)
  (when (gethash1 name (the hash-table *declaration-types*))
    (declaration-error name)))

(defun proclaim (declaration-specifier)
  (unless (symbolp (car declaration-specifier))
    (%type-error (car declaration-specifier) 'symbol))
  ;; (cdr declaration-specifier) must be a proper list.
  (unless (listp (cddr declaration-specifier))
    (%type-error (cddr declaration-specifier) 'list))
  (case (car declaration-specifier)
    (SPECIAL
     (dolist (name (cdr declaration-specifier))
       (%defvar name)))
    (OPTIMIZE
     (dolist (spec (cdr declaration-specifier))
       (let ((val 3)
             (quality spec))
         (when (consp spec)
           (setf quality (%car spec)
                 val (cadr spec)))
         (when (and (fixnump val)
                    (<= 0 val 3))
           (case quality
             (SPEED
              (setf *speed* val))
             (SPACE
              (setf *space* val))
             (SAFETY
              (setf *safety* val))
             (DEBUG
              (setf *debug* val)))))))
    (FTYPE
     (unless (cdr declaration-specifier)
       (error "No type specified in FTYPE declaration: ~S" declaration-specifier))
     (apply 'proclaim-ftype (cdr declaration-specifier)))
    ((INLINE NOTINLINE)
     (dolist (name (cdr declaration-specifier))
       (when (symbolp name) ; FIXME Need to support non-symbol function names.
         (setf (get name '%inline) (car declaration-specifier)))))
    (DECLARATION
     (dolist (name (cdr declaration-specifier))
       (when (or (get name 'deftype-definition)
                 (find-class name nil))
         (declaration-error name))
       (setf (gethash name (the hash-table *declaration-types*)) name)))
    (:explain
     (dolist (spec (cdr declaration-specifier))
       (let ((val t)
             (quality spec))
         (when (consp spec)
           (setf quality (%car spec))
           (when (= (length spec) 2)
             (setf val (%cadr spec))))
         (if val
             (pushnew quality *explain*)
             (setf *explain* (remove quality *explain*))))))))

(defvar *proclaimed-ftypes* (make-hash-table :test 'equal))

(defun proclaim-ftype (ftype &rest names)
  (dolist (name names)
    (if (symbolp name)
        (setf (get name 'proclaimed-ftype) ftype)
        (setf (gethash name (the hash-table *proclaimed-ftypes*)) ftype))))

(defun proclaimed-ftype (name)
  (if (symbolp name)
      (get name 'proclaimed-ftype)
      (gethash1 name (the hash-table *proclaimed-ftypes*))))

(defun ftype-result-type (ftype)
  (if (atom ftype)
      '*
      (let ((result-type (third ftype)))
        (if result-type
            result-type
            '*))))
