;;; signal.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: signal.lisp,v 1.10 2004-05-29 19:01:41 piso Exp $
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

;;; Adapted from SBCL.

(in-package "SYSTEM")

(defvar *maximum-error-depth* 10)

(defvar *current-error-depth* 0)

(defvar *handler-clusters* ())

(defvar *break-on-signals* nil)

(defun signal (datum &rest arguments)
  (let ((condition (coerce-to-condition datum arguments 'simple-condition 'signal))
	(*handler-clusters* *handler-clusters*))
    (let ((old-bos *break-on-signals*)
	  (*break-on-signals* nil))
      (when (typep condition old-bos)
        (let ((*saved-backtrace* (backtrace-as-list)))
          (break "~A~%BREAK called because of *BREAK-ON-SIGNALS* (now rebound to NIL)."
                 condition))))
    (loop
      (unless *handler-clusters*
	(return))
      (let ((cluster (pop *handler-clusters*)))
	(dolist (handler cluster)
	  (when (typep condition (car handler))
	    (funcall (cdr handler) condition)))))
    (when (typep condition 'serious-condition)
      (let ((*current-error-depth* (1+ *current-error-depth*)))
        (cond ((> *current-error-depth* *maximum-error-depth*)
               (%format t "~%Maximum error depth exceeded (~D nested errors).~%"
                        *current-error-depth*)
               (if (fboundp 'internal-debug)
                   (internal-debug)
                   (quit)))
              (t
               (let ((*saved-backtrace* (backtrace-as-list)))
                 (invoke-debugger condition))))))
    nil))

;; COERCE-TO-CONDITION is going to be redefined in clos.lisp, so we define it
;; in this file after SIGNAL so the call to it in SIGNAL is NOTINLINE. We could
;; use (DECLAIM (NOTINLINE COERCE-TO-CONDITON)) to achieve the same effect more
;; reliably if our compiler understood that kind of talk.
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
	 (%make-condition datum arguments))
	((or (stringp datum) (functionp datum))
	 (%make-condition default-type
                          (list :format-control datum
                                :format-arguments arguments)))
	(t
	 (error 'simple-type-error
		:datum datum
		:expected-type '(or symbol string)
		:format-control "Bad argument to ~S: ~S."
		:format-arguments (list fun-name datum)))))

(defmacro handler-bind (bindings &body forms)
  (dolist (binding bindings)
    (unless (and (consp binding) (= (length binding) 2))
      (error "ill-formed handler binding ~S" binding)))
  `(let ((*handler-clusters*
	  (cons (list ,@(mapcar (lambda (x) `(cons ',(car x) ,(cadr x)))
				bindings))
		*handler-clusters*)))
     (progn
       ,@forms)))

(defmacro handler-case (form &rest cases)
  (let ((no-error-clause (assoc ':no-error cases)))
    (if no-error-clause
	(let ((normal-return (make-symbol "normal-return"))
	      (error-return  (make-symbol "error-return")))
	  `(block ,error-return
	     (multiple-value-call (lambda ,@(cdr no-error-clause))
                                  (block ,normal-return
                                    (return-from ,error-return
                                                 (handler-case (return-from ,normal-return ,form)
                                                   ,@(remove no-error-clause cases)))))))
	(let ((tag (gensym))
	      (var (gensym))
	      (annotated-cases (mapcar (lambda (case) (cons (gensym) case))
				       cases)))
	  `(block ,tag
	     (let ((,var nil))
	       (declare (ignorable ,var))
	       (tagbody
		(handler-bind
                  ,(mapcar (lambda (annotated-case)
                             (list (cadr annotated-case)
                                   `(lambda (temp)
                                      ,(if (caddr annotated-case)
                                           `(setq ,var temp)
                                           '(declare (ignore temp)))
                                      (go ,(car annotated-case)))))
                           annotated-cases)
		  (return-from ,tag
                               ,form))
		,@(mapcan
		   (lambda (annotated-case)
		     (list (car annotated-case)
			   (let ((body (cdddr annotated-case)))
			     `(return-from
                               ,tag
                               ,(cond ((caddr annotated-case)
                                       `(let ((,(caaddr annotated-case)
						,var))
                                          ,@body))
                                      (t
                                       `(locally ,@body)))))))
		   annotated-cases))))))))
