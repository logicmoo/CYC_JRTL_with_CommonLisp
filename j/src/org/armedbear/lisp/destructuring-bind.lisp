;;; destructuring-bind.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: destructuring-bind.lisp,v 1.12 2004-04-28 18:53:07 piso Exp $
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

;;;; From CMUCL, via GCL.

(in-package "SYSTEM")

(defun parse-body (body &optional (doc-string-allowed t))
  (let ((decls ())
	(doc nil))
    (do ((tail body (cdr tail)))
	((endp tail)
	 (values tail (nreverse decls) doc))
      (let ((form (car tail)))
	(cond ((and (stringp form) (cdr tail))
	       (if doc-string-allowed
		   (setq doc form
			 ;; Only one doc string is allowed.
			 doc-string-allowed nil)
		   (return (values tail (nreverse decls) doc))))
	      ((not (and (consp form) (symbolp (car form))))
	       (return (values tail (nreverse decls) doc)))
	      ((eq (car form) 'declare)
	       (push form decls))
	      (t
	       (return (values tail (nreverse decls) doc))))))))

(defvar *arg-tests* ())

(defvar *system-lets* nil)

(defvar *user-lets* ())

(defvar *ignorable-vars*)

(defun do-arg-count-error (error-kind name arg lambda-list minimum maximum)
  (error 'program-error
         :format-control "Wrong number of arguments for ~S."
         :format-arguments (list name)))

(defun parse-defmacro (lambda-list arg-list-name code name error-kind
				   &key (anonymousp nil)
				   (doc-string-allowed t)
				   ((:environment env-arg-name))
				   (error-fun 'error))
  (multiple-value-bind (body declarations documentation)
		       (parse-body code doc-string-allowed)
    (let* ((*arg-tests* ())
	   (*user-lets* ())
	   (*system-lets* ())
	   (*ignorable-vars* ()))
      (multiple-value-bind
	  (env-arg-used minimum maximum)
	  (parse-defmacro-lambda-list lambda-list arg-list-name name
				      error-kind error-fun (not anonymousp)
				      nil env-arg-name)
	(values
	 `(let* ,(nreverse *system-lets*)
	   ,@(when *ignorable-vars*
	       `((declare (ignorable ,@*ignorable-vars*))))
	    ,@*arg-tests*
	    (let* ,(nreverse *user-lets*)
	      ,@declarations
	      ,@body))
	 `(,@(when (and env-arg-name (not env-arg-used))
	       `((declare (ignore ,env-arg-name)))))
	 documentation
	 minimum
	 maximum)))))

(defun make-keyword (symbol)
  "Takes a non-keyword symbol, symbol, and returns the corresponding keyword."
  (intern (symbol-name symbol) (find-package "KEYWORD")))

(defun defmacro-error (problem name)
  (error 'type-error "~S is not of type ~S~%" problem name))

(defun verify-keywords (key-list valid-keys allow-other-keys)
  (do ((already-processed nil)
       (unknown-keyword nil)
       (remaining key-list (cddr remaining)))
      ((null remaining)
       (if (and unknown-keyword
		(not allow-other-keys)
		(not (lookup-keyword :allow-other-keys key-list)))
	   (values :unknown-keyword (list unknown-keyword valid-keys))
	   (values nil nil)))
    (cond ((not (and (consp remaining) (listp (cdr remaining))))
	   (return (values :dotted-list key-list)))
	  ((null (cdr remaining))
	   (return (values :odd-length key-list)))
	  #+nil ;; Not ANSI compliant to disallow duplicate keywords.
	  ((memql (car remaining) already-processed)
	   (return (values :duplicate (car remaining))))
	  ((or (eq (car remaining) :allow-other-keys)
	       (memql (car remaining) valid-keys))
	   (push (car remaining) already-processed))
	  (t
	   (setf unknown-keyword (car remaining))))))

(defun lookup-keyword (keyword key-list)
  (do ((remaining key-list (cddr remaining)))
      ((endp remaining))
    (when (eq keyword (car remaining))
      (return (cadr remaining)))))

(defun keyword-supplied-p (keyword key-list)
  (do ((remaining key-list (cddr remaining)))
      ((endp remaining))
    (when (eq keyword (car remaining))
      (return t))))


(defun parse-defmacro-lambda-list
       (lambda-list arg-list-name name error-kind error-fun
		    &optional top-level env-illegal env-arg-name)
  (let ((path (if top-level `(cdr ,arg-list-name) arg-list-name))
	(now-processing :required)
	(maximum 0)
	(minimum 0)
	(keys ())
	rest-name restp allow-other-keys-p env-arg-used)
    ;; This really strange way to test for '&whole is neccessary because member
    ;; does not have to work on dotted lists, and dotted lists are legal
    ;; in lambda-lists.
    (when (and (do ((list lambda-list (cdr list)))
		   ((atom list) nil)
		 (when (eq (car list) '&whole) (return t)))
	       (not (eq (car lambda-list) '&whole)))
      (error "&Whole must appear first in ~S lambda-list." error-kind))
    (do ((rest-of-args lambda-list (cdr rest-of-args)))
	((atom rest-of-args)
	 (cond ((null rest-of-args) nil)
	       ;; Varlist is dotted, treat as &rest arg and exit.
	       (t (push-let-binding rest-of-args path nil)
		  (setf restp t))))
      (let ((var (car rest-of-args)))
	(cond ((eq var '&whole)
	       (cond ((and (cdr rest-of-args) (symbolp (cadr rest-of-args)))
		      (setf rest-of-args (cdr rest-of-args))
		      (push-let-binding (car rest-of-args) arg-list-name nil))
		     ((and (cdr rest-of-args) (consp (cadr rest-of-args)))
		      (pop rest-of-args)
		      (let* ((destructuring-lambda-list (car rest-of-args))
			     (sub (gensym "WHOLE-SUBLIST")))
			(push-sub-list-binding
			 sub arg-list-name destructuring-lambda-list
			 name error-kind error-fun)
			(parse-defmacro-lambda-list
			 destructuring-lambda-list sub name error-kind error-fun)))
		     (t
		      (defmacro-error "&WHOLE" name))))
	      ((eq var '&environment)
	       (cond (env-illegal
		      (error "&ENVIRONMENT not valid with ~S" error-kind))
		     ((not top-level)
		      (error "&ENVIRONMENT only valid at top level of lambda list")))
	       (cond ((and (cdr rest-of-args) (symbolp (cadr rest-of-args)))
		      (setf rest-of-args (cdr rest-of-args))
		      (push-let-binding (car rest-of-args) env-arg-name nil)
		      (setf env-arg-used t))
		     (t
		      (defmacro-error "&ENVIRONMENT" error-kind name))))
	      ((or (eq var '&rest) (eq var '&body))
	       (cond ((and (cdr rest-of-args) (symbolp (cadr rest-of-args)))
		      (setf rest-of-args (cdr rest-of-args))
		      (setf restp t)
		      (push-let-binding (car rest-of-args) path nil))
		     ((and (cdr rest-of-args) (consp (cadr rest-of-args)))
		      (pop rest-of-args)
		      (setf restp t)
		      (let* ((destructuring-lambda-list (car rest-of-args))
			     (sub (gensym "REST-SUBLIST")))
			(push-sub-list-binding sub path destructuring-lambda-list
                                               name error-kind error-fun)
			(parse-defmacro-lambda-list
			 destructuring-lambda-list sub name error-kind error-fun)))
		     (t
		      (defmacro-error (symbol-name var) error-kind name))))
	      ((eq var '&optional)
	       (setf now-processing :optionals))
	      ((eq var '&key)
	       (setf now-processing :keywords)
	       (setf rest-name (gensym "KEYWORDS-"))
	       (push rest-name *ignorable-vars*)
	       (setf restp t)
	       (push-let-binding rest-name path t))
	      ((eq var '&allow-other-keys)
	       (setf allow-other-keys-p t))
	      ((eq var '&aux)
	       (setf now-processing :auxs))
	      ((listp var)
	       (case now-processing
		 (:required
		  (let ((sub-list-name (gensym "SUBLIST-")))
		    (push-sub-list-binding sub-list-name `(car ,path) var
					   name error-kind error-fun)
		    (parse-defmacro-lambda-list var sub-list-name name
						error-kind error-fun))
		  (setf path `(cdr ,path))
		  (incf minimum)
		  (incf maximum))
		 (:optionals
		  (when (> (length var) 3)
		    (error "more than variable, initform, and suppliedp in &optional binding ~S"
                           var))
		  (push-optional-binding (car var) (cadr var) (caddr var)
					 `(not (null ,path)) `(car ,path)
					 name error-kind error-fun)
		  (setf path `(cdr ,path))
		  (incf maximum))
		 (:keywords
		  (let* ((keyword-given (consp (car var)))
			 (variable (if keyword-given
				       (cadar var)
				       (car var)))
			 (keyword (if keyword-given
				      (caar var)
				      (make-keyword variable)))
			 (supplied-p (caddr var)))
		    (push-optional-binding variable (cadr var) supplied-p
					   `(keyword-supplied-p ',keyword
								,rest-name)
					   `(lookup-keyword ',keyword
							    ,rest-name)
					   name error-kind error-fun)
		    (push keyword keys)))
		 (:auxs (push-let-binding (car var) (cadr var) nil))))
	      ((symbolp var)
	       (case now-processing
		 (:required
		  (incf minimum)
		  (incf maximum)
		  (push-let-binding var `(car ,path) nil)
		  (setf path `(cdr ,path)))
		 (:optionals
		  (incf maximum)
		  (push-let-binding var `(car ,path) nil `(not (null ,path)))
		  (setf path `(cdr ,path)))
		 (:keywords
		  (let ((key (make-keyword var)))
		    (push-let-binding var `(lookup-keyword ,key ,rest-name)
				      nil)
		    (push key keys)))
		 (:auxs
		  (push-let-binding var nil nil))))
	      (t
	       (error "non-symbol in lambda-list: ~S" var)))))
    ;; Generate code to check the number of arguments, unless dotted
    ;; in which case length will not work.
    (unless restp
       (push `(unless (<= ,minimum
			  (length (the list ,(if top-level
						 `(cdr ,arg-list-name)
					       arg-list-name)))
			  ,@(unless restp
				    (list maximum)))
		      ,(let ((arg (if top-level
				      `(cdr ,arg-list-name)
				    arg-list-name)))
			 (if (eq error-fun 'error)
			     `(do-arg-count-error ',error-kind ',name ,arg
						  ',lambda-list ,minimum
						  ,(unless restp maximum))
                             `(,error-fun 'defmacro-ll-arg-count-error
				 :kind ',error-kind
				 ,@(when name `(:name ',name))
				 :argument ,arg
				 :lambda-list ',lambda-list
				 :minimum ,minimum
				 ,@(unless restp `(:maximum ,maximum))))))
	     *arg-tests*))
    (if keys
	(let ((problem (gensym "KEY-PROBLEM-"))
	      (info (gensym "INFO-")))
	  (push `(multiple-value-bind
		     (,problem ,info)
		     (verify-keywords ,rest-name ',keys ',allow-other-keys-p)
		   (when ,problem
		     (,error-fun
		      'defmacro-ll-broken-key-list-error
		      :kind ',error-kind
		      ,@(when name `(:name ',name))
		      :problem ,problem
		      :info ,info)))
		*arg-tests*)))
    (values env-arg-used minimum (if (null restp) maximum nil))))


(defun push-sub-list-binding (variable path object name error-kind error-fun)
  (let ((var (gensym "TEMP-")))
    (push `(,variable
	    (let ((,var ,path))
	      (if (listp ,var)
		  ,var
		  (,error-fun 'defmacro-bogus-sublist-error
			      :kind ',error-kind
			      ,@(when name `(:name ',name))
			      :object ,var
			      :lambda-list ',object))))
	  *system-lets*)))

(defun push-let-binding (variable path systemp &optional condition
				  (init-form nil))
  (let ((let-form (if condition
		      `(,variable (if ,condition ,path ,init-form))
		      `(,variable ,path))))
    (if systemp
	(push let-form *system-lets*)
	(push let-form *user-lets*))))

(defun push-optional-binding (value-var init-form supplied-var condition path
					name error-kind error-fun)
  (unless supplied-var
    (setf supplied-var (gensym "SUPPLIEDP-")))
  (push-let-binding supplied-var condition t)
  (cond ((consp value-var)
	 (let ((whole-thing (gensym "OPTIONAL-SUBLIST-")))
	   (push-sub-list-binding whole-thing
				  `(if ,supplied-var ,path ,init-form)
				  value-var name error-kind error-fun)
	   (parse-defmacro-lambda-list value-var whole-thing name
				       error-kind error-fun)))
	((symbolp value-var)
	 (push-let-binding value-var path nil supplied-var init-form))
	(t
	 (error "Illegal optional variable name: ~S" value-var))))

(defmacro destructuring-bind (lambda-list arg-list &rest body)
  (let* ((arg-list-name (gensym "ARG-LIST-")))
    (multiple-value-bind
	(body local-decls)
	(parse-defmacro lambda-list arg-list-name body nil 'destructuring-bind
			:anonymousp t :doc-string-allowed nil)
      `(let ((,arg-list-name ,arg-list))
	 ,@local-decls
	 ,body))))
