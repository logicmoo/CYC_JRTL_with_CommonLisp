;;; defpackage.lisp
;;;
;;; Copyright (C) 2003-2007 Peter Graves
;;; $Id: defpackage.lisp,v 1.6 2007-02-26 11:10:30 piso Exp $
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
;;; Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

(in-package "SYSTEM")

;;; Adapted from CMUCL.

(defun designated-package-name (designator)
  (cond ((packagep designator)
         (package-name designator))
        (t
         (string designator))))

(defun stringify-names (names)
  (mapcar #'string names))

;; FIXME Better error reporting!
(defun check-disjoint (&rest args)
  (let ((rest-args args))
    (dolist (arg1 args)
      (setf rest-args (cdr rest-args))
      (dolist (arg2 rest-args)
        (when (remove-duplicates (intersection arg1 arg2 :test #'string=))
          (error 'program-error))))))

(defmacro defpackage (package &rest options)
  (let ((nicknames nil)
	(size nil)
	(shadows nil)
	(shadowing-imports nil)
	(use nil)
	(use-p nil)
	(imports nil)
	(interns nil)
	(exports nil)
	(doc nil))
    (dolist (option options)
      (unless (consp option)
	(error 'program-error "bad DEFPACKAGE option: ~S" option))
      (case (car option)
	(:nicknames
	 (setq nicknames (stringify-names (cdr option))))
	(:size
	 (cond (size
		(error 'program-error "can't specify :SIZE twice"))
	       ((and (consp (cdr option))
		     (typep (second option) 'unsigned-byte))
		(setq size (second option)))
	       (t
		(error 'program-error
		 "bad :SIZE, must be a positive integer: ~S"
		 (second option)))))
	(:shadow
	 (let ((new (stringify-names (cdr option))))
	   (setq shadows (append shadows new))))
	(:shadowing-import-from
	 (let ((package-name (designated-package-name (cadr option)))
	       (symbol-names (stringify-names (cddr option))))
	   (let ((assoc (assoc package-name shadowing-imports
			       :test #'string=)))
	     (if assoc
		 (setf (cdr assoc) (append (cdr assoc) symbol-names))
		 (setq shadowing-imports
		       (acons package-name symbol-names shadowing-imports))))))
	(:use
	 (let ((new (mapcar #'designated-package-name (cdr option))))
	   (setq use (delete-duplicates (nconc use new) :test #'string=))
	   (setq use-p t)))
	(:import-from
	 (let ((package-name (designated-package-name (cadr option)))
	       (symbol-names (stringify-names (cddr option))))
	   (let ((assoc (assoc package-name imports
			       :test #'string=)))
	     (if assoc
		 (setf (cdr assoc) (append (cdr assoc) symbol-names))
		 (setq imports (acons package-name symbol-names imports))))))
	(:intern
	 (let ((new (stringify-names (cdr option))))
	   (setq interns (append interns new))))
	(:export
	 (let ((new (stringify-names (cdr option))))
	   (setq exports (append exports new))))
	(:documentation
	 (when doc
	   (error 'program-error "can't specify :DOCUMENTATION twice"))
	 (setq doc (coerce (cadr option) 'simple-string)))
	(t
	 (error 'program-error "bad DEFPACKAGE option: ~S" option))))
    (check-disjoint `(:intern ,@interns) `(:export  ,@exports))
    (check-disjoint `(:intern ,@interns)
		    `(:import-from
		      ,@(apply #'append (mapcar #'rest imports)))
		    `(:shadow ,@shadows)
		    `(:shadowing-import-from
		      ,@(apply #'append (mapcar #'rest shadowing-imports))))
    `(%defpackage ,(string package) ',nicknames ',size
                  ',shadows ',shadowing-imports ',(if use-p use nil)
                  ',imports ',interns ',exports ',doc)))
