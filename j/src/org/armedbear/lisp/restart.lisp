;;; restart.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: restart.lisp,v 1.3 2003-12-15 14:07:22 piso Exp $
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

;;; Adapted from GCL.

(in-package "SYSTEM")

(defun read-evaluated-form ()
  (fresh-line *query-io*)
  (format *query-io* "Enter a form to be evaluated:~%")
  (list (eval (read *query-io*))))

(defvar *restart-clusters* ())

(defvar *condition-restarts* ())

(defstruct restart
  name
  function
  report-function
  interactive-function
  (test-function #'(lambda (c) t)))

(defmacro restart-bind (bindings &body forms)
  `(let ((*restart-clusters* (cons (list ,@(mapcar #'(lambda (binding)
                                                      `(make-restart
                                                        :name ',(car binding)
                                                        :function ,(cadr binding)
                                                        ,@(cddr binding)))
                                                   bindings))
                                   *restart-clusters*)))
     ,@forms))

(defun compute-restarts (&optional condition)
;;   (let ((res ()))
;;     (dolist (restart-cluster *restart-clusters*)
;;       (dolist (restart restart-cluster)
;;         (push restart res)))
;;     (nreverse res)))
  (let ((associated ())
	(other ()))
    (dolist (alist *condition-restarts*)
      (if (eq (car alist) condition)
	  (setq associated (cdr alist))
	  (setq other (append (cdr alist) other))))
;;     (collect ((res))
    (let ((res ()))
      (dolist (restart-cluster *restart-clusters*)
        (dolist (restart restart-cluster)
          (when (and (or (not condition)
                         (member restart associated)
                         (not (member restart other)))
                     (funcall (restart-test-function restart) condition))
;;             (res restart))))
            (push restart res))))
;;              (res))))
      (nreverse res))))

(defun find-restart (name &optional condition)
  (dolist (restart-cluster *restart-clusters*)
    (dolist (restart restart-cluster)
      (when (or (eq restart name) (eq (restart-name restart) name))
        (return-from find-restart restart)))))

(defun invoke-restart (restart &rest values)
  (let ((real-restart (or (find-restart restart)
                          (error "restart ~s is not active" restart))))
    (apply (restart-function real-restart) values)))

(defun parse-keyword-pairs (list keys)
  (do ((l list (cddr l))
       (k '() (list* (cadr l) (car l) k)))
      ((or (null l) (not (member (car l) keys)))
       (values (nreverse k) l))))

(defmacro with-keyword-pairs ((names expression &optional keywords-var) &body forms)
  (let ((temp (member '&rest names)))
    (unless (= (length temp) 2) (error "&REST keyword is ~:[missing~;misplaced~]." temp))
    (let ((key-vars (ldiff names temp))
          (key-var (or keywords-var (gensym)))
          (rest-var (cadr temp)))
      (let ((keywords (mapcar #'(lambda (x) (intern (string x) (find-package "KEYWORD")))
                              key-vars)))
        `(multiple-value-bind (,key-var ,rest-var)
           (parse-keyword-pairs ,expression ',keywords)
           (let ,(mapcar #'(lambda (var keyword) `(,var (getf ,key-var ,keyword)))
                         key-vars keywords)
             ,@forms))))))

(defun transform-keywords (&key report interactive)
  (let ((result ()))
    (when report
      (setq result (list* (if (stringp report)
                              `#'(lambda (stream)
                                  (write-string ,report stream))
                              `#',report)
                          :report-function
                          result)))
    (when interactive
      (setq result (list* `#',interactive
                          :interactive-function
                          result)))
    (nreverse result)))

(defmacro restart-case (expression &body clauses)
  (let ((block-tag (gensym))
        (temp-var (gensym))
        (data
         (mapcar #'(lambda (clause)
                    (with-keyword-pairs ((report interactive &rest forms)
                                         (cddr clause))
                      (list (car clause)
                            (gensym)
                            (transform-keywords :report report ;keywords=2
                                                :interactive interactive)
                            (cadr clause)
                            forms)))
                 clauses)))
    `(block ,block-tag
            (let ((,temp-var nil))
              (tagbody
               (restart-bind
                ,(mapcar #'(lambda (datum)
                            (let ((name (nth 0 datum))
                                  (tag  (nth 1 datum))
                                  (keys (nth 2 datum)))
                              `(,name #'(lambda (&rest temp)
                                         #+lispm (setq temp (copy-list temp))
                                         (setq ,temp-var temp)
                                         (go ,tag))
                                      ,@keys)))
                         data)
                (return-from ,block-tag ,expression))
               ,@(mapcan #'(lambda (datum)
                            (let ((tag  (nth 1 datum))
                                  (bvl  (nth 3 datum))
                                  (body (nth 4 datum)))
                              (list tag
                                    `(return-from ,block-tag
                                                  (apply #'(lambda ,bvl ,@body)
                                                         ,temp-var)))))
                         data))))))

(defmacro with-simple-restart ((restart-name format-string
                                             &rest format-arguments)
                               &body forms)
  `(restart-case (progn ,@forms)
                 (,restart-name ()
                                :report (lambda (stream)
                                          (format stream ,format-string ,@format-arguments))
                                (values nil t))))

;;; WITH-CONDITION-RESTARTS (from CMUCL)
(defmacro with-condition-restarts (condition-form restarts-form &body body)
  (let ((n-cond (gensym)))
    `(let ((*condition-restarts*
	    (cons (let ((,n-cond ,condition-form))
		    (cons ,n-cond
			  (append ,restarts-form
				  (cdr (assoc ,n-cond *condition-restarts*)))))
		  *condition-restarts*)))
       ,@body)))

(defun abort (&optional condition)
  (invoke-restart 'abort)
  (error 'abort-failure))

(defun continue (&optional condition)
  (invoke-restart 'continue))

(defun muffle-warning (&optional condition)
  (invoke-restart 'muffle-warning))

(defun store-value (value)
  (invoke-restart 'store-value value))

(defun use-value (value)
  (invoke-restart 'use-value value))

;;; Adapted from SBCL.
(defun warn (datum &rest arguments)
  (let ((condition (coerce-to-condition datum arguments 'simple-warning 'warn)))
    (require-type condition 'warning)
    (restart-case (signal condition)
                  (muffle-warning ()
                                  :report "Skip warning."
                                  (return-from warn nil)))
    (let ((badness (etypecase condition
                     (style-warning 'style-warning)
                     (warning 'warning))))
      (fresh-line *error-output*)
      (format *error-output* "~S: ~A~%" badness condition)))
  nil)
