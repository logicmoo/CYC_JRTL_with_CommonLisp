;;; rt.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: rt.lisp,v 1.58 2003-03-13 03:07:29 piso Exp $
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

;;; Adapted from rt.lsp and ansi-aux.lsp in the GCL ANSI test suite.

(unless (find-package :regression-test)
  (make-package :regression-test :nicknames '(:rt))
  (use-package :cl :rt))

(in-package :rt)

(export '(deftest))

(defvar *prefix* "/home/peter/gcl/ansi-tests/")

(defvar *compile-tests* nil)

(defvar *passed* 0)
(defvar *failed* 0)

(defun equalp-with-case (x y)
  (cond
   ((consp x)
    (and (consp y)
	 (equalp-with-case (car x) (car y))
	 (equalp-with-case (cdr x) (cdr y))))
   ((vectorp x)
    (and (vectorp y)
	 (let ((x-len (length x))
	       (y-len (length y)))
	   (and (eql x-len y-len)
                (progn
                  (dotimes (i x-len)
                    (unless (equalp-with-case (aref x i) (aref y i))
                      (return nil)))
                  t)))))
   (t (eql x y))))

(defmacro deftest (name form &rest values)
  (format t "Test ~s~%" `,name)
  (finish-output)
  (let* ((aborted nil)
        (r (handler-case (multiple-value-list
                          (if *compile-tests*
                              (funcall (compile nil `(lambda () ,form)))
                              (eval `,form)))
                         (error (c) (setf aborted t) (list c))))
        (passed (and (not aborted) (equalp-with-case r `,values))))
    (unless passed
      (format t "  Expected value: ~s~%"
              (if (= (length `,values) 1)
                  (car `,values)
                  `,values))
      (format t "    Actual value: ~s~%"
              (if (= (length r) 1)
                  (car r)
                  r))
      (finish-output))
    (if passed (incf *passed*) (incf *failed*))))

(unless (find-package :cl-test)
  (make-package :cl-test)
  (use-package "COMMON-LISP" :cl-test))

(in-package :cl-test)
(use-package :rt)

(defun notnot (x) (not (not x)))

(defmacro notnot-mv (form)
  `(notnot-mv-fn (multiple-value-list ,form)))

(defun notnot-mv-fn (results)
  (if (null results)
      (values)
      (apply #'values
             (not (not (first results)))
             (rest results))))

(defmacro not-mv (form)
  `(not-mv-fn (multiple-value-list ,form)))

(defun not-mv-fn (results)
  (if (null results)
      (values)
      (apply #'values
             (not (first results))
             (rest results))))

;;; Macro to check that a function is returning a specified number of values
;;; (defaults to 1)
(defmacro check-values (form &optional (num 1))
  (let ((v (gensym))
	(n (gensym)))
    `(let ((,v (multiple-value-list ,form))
           (,n ,num))
       (check-values-length ,v ,n ',form)
       (car ,v))))

(defun check-values-length (results expected-number form)
  (let ((n expected-number))
    (dolist (e results)
      (decf n))
    (unless (= n 0)
      (error "Expected ~A results from ~A, got ~A results instead.~%"
             expected-number form n))))

(defun eqt (x y)
  "Like EQ, but guaranteed to return T for true."
  (apply #'values (mapcar #'notnot (multiple-value-list (eq x y)))))

(defun eqlt (x y)
  "Like EQL, but guaranteed to return T for true."
  (apply #'values (mapcar #'notnot (multiple-value-list (eql x y)))))

(defun equalt (x y)
  "Like EQUAL, but guaranteed to return T for true."
  (apply #'values (mapcar #'notnot (multiple-value-list (equal x y)))))

(defun equalpt (x y)
  "Like EQUALP, but guaranteed to return T for true."
  (apply #'values (mapcar #'notnot (multiple-value-list (equalp x y)))))

(defun make-int-list (n)
  (do ((result nil)
       (i (1- n) (1- i)))
    ((< i 0) result)
    (setq result (cons i result))))

(defun make-int-array (n &optional (fn #'make-array))
  (let ((a (funcall fn n)))
    (dotimes (i n)
      (setf (aref a i) i))
    a))

(defmacro catch-type-error (form)
  "Evaluate form in safe mode, returning its value if there is no error.
   If an error does occur, return type-error on TYPE-ERRORs, or the error
   condition itself on other errors."
  `(locally (declare (optimize (safety 3)))
            (handler-case ,form
                          (type-error () 'type-error)
                          (error (c) c))))

(defmacro classify-error* (form)
  "Evaluate form in safe mode, returning its value if there is no error.
   If an error does occur, return a symbol classify the error, or allow
   the condition to go uncaught if it cannot be classified."
  `(handler-case ,form
                (undefined-function () 'undefined-function)
                (program-error () 'program-error)
                (package-error () 'package-error)
                (type-error    () 'type-error)
                (control-error () 'control-error)
                ))

(defmacro classify-error (form)
  `(classify-error* (eval ,form)))

(defstruct scaffold
  node
  car
  cdr)

(defun make-scaffold-copy (x)
  "Make a tree that will be used to check if a tree has been changed."
  (if
   (consp x)
   (make-scaffold :node x
                  :car (make-scaffold-copy (car x))
                  :cdr (make-scaffold-copy (cdr x)))
   (make-scaffold :node x
                  :car nil
                  :cdr nil)))

(defun check-scaffold-copy (x xcopy)
  "Return t if xcopy were produced from x by make-scaffold-copy,
   and none of the cons cells in the tree rooted at x have been
   changed."
  (and (eq x (scaffold-node xcopy))
       (or
	(not (consp x))
	(and
	 (check-scaffold-copy (car x) (scaffold-car xcopy))
	 (check-scaffold-copy (cdr x) (scaffold-cdr xcopy))))))

(defun create-c*r-test (n)
  (cond
   ((<= n 0) 'none)
   (t
    (cons (create-c*r-test (1- n))
	  (create-c*r-test (1- n))))))

;;;
;;; The function SUBTYPEP should return two generalized booleans.
;;; This auxiliary function returns booleans instead
;;; (which makes it easier to write tests).
;;;
(defun subtypep* (type1 type2)
  (apply #'values
	 (mapcar #'notnot
		 (multiple-value-list (subtypep type1 type2)))))

(defun subtypep*-or-fail (type1 type2)
  (let ((results (multiple-value-list (subtypep type1 type2))))
    (and (= (length results) 2)
	 (or (not (second results))
	     (notnot (first results))))))

(defun subtypep*-not-or-fail (type1 type2)
  (let ((results (multiple-value-list (subtypep type1 type2))))
    (and (= (length results) 2)
	 (or (not (second results))
	     (not (first results))))))

(defun compose (&rest fns)
  (let ((rfns (reverse fns)))
    #'(lambda (x) (loop for f in rfns do (setf x (funcall f x))) x)))

(defun evendigitp (c)
  (notnot (find c "02468")))

(defun odddigitp (c)
  (notnot (find c "13579")))

(defun nextdigit (c)
  (cadr (member c '(#\0 #\1 #\2 #\3 #\4 #\5 #\6 #\7 #\8 #\9))))

(defun is-eq-p (x) #'(lambda (y) (eqt x y)))
(defun is-not-eq-p (x) #'(lambda (y) (not (eqt x y))))

(defun is-eql-p (x) #'(lambda (y) (eqlt x y)))
(defun is-not-eql-p (x) #'(lambda (y) (not (eqlt x y))))

(defun onep (x) (eql x 1))

(defparameter +standard-chars+
  "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^&*()_+|\\=-`{}[]:\";'<>?,./")

(defparameter
  +base-chars+ #.(concatenate 'string
			      "abcdefghijklmnopqrstuvwxyz"
			      "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
			      "0123456789"
			      "<,>.?/\"':;[{]}~`!@#$%^&*()_-+= \\|"))

(defparameter +num-base-chars+ (length +base-chars+))

(defparameter +alpha-chars+ (subseq +standard-chars+ 0 52))
(defparameter +lower-case-chars+ (subseq +alpha-chars+ 0 26))
(defparameter +upper-case-chars+ (subseq +alpha-chars+ 26 52))
(defparameter +alphanumeric-chars+ (subseq +standard-chars+ 0 62))
(defparameter +digit-chars+ "0123456789")
(defparameter +extended-digit-chars+ "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ")
(defparameter +code-chars+
  (coerce (loop for i from 0 below 256
            for c = (code-char i)
            when c collect c)
	  'string))
(defparameter +rev-code-chars+ (reverse +code-chars+))

(defun check-sublis (a al &key (key 'no-key) test test-not)
  "Apply sublis al a with various keys.  Check that
   the arguments are not themselves changed.  Return nil
   if the arguments do get changed."
  (setf a (copy-tree a))
  (setf al (copy-tree al))
  (let ((acopy (make-scaffold-copy a))
	(alcopy (make-scaffold-copy al)))
    (let ((as
	   (apply #'sublis al a
		  `(,@(when test `(:test ,test))
                      ,@(when test-not `(:test-not ,test-not))
                      ,@(unless (eqt key 'no-key) `(:key ,key))))))
      (and
       (check-scaffold-copy a acopy)
       (check-scaffold-copy al alcopy)
       as))))

(defun check-nsublis (a al &key (key 'no-key) test test-not)
  "Apply nsublis al a, copying these arguments first."
  (setf a (copy-tree a))
  (setf al (copy-tree al))
  (let ((as
	 (apply #'sublis (copy-tree al) (copy-tree a)
		`(,@(when test `(:test ,test))
		    ,@(when test-not `(:test-not ,test-not))
		    ,@(unless (eqt key 'no-key) `(:key ,key))))))
    as))

(defun check-subst (new old tree &key (key 'no-key) test test-not)
  "Call subst new old tree, with keyword arguments if present.
   Check that the arguments are not changed."
  (setf new (copy-tree new))
  (setf old (copy-tree old))
  (setf tree (copy-tree tree))
  (let ((newcopy (make-scaffold-copy new))
	(oldcopy (make-scaffold-copy old))
	(treecopy (make-scaffold-copy tree)))
    (let ((result
	   (apply #'subst new old tree
		  `(,@(unless (eqt key 'no-key) `(:key ,key))
                      ,@(when test `(:test ,test))
                      ,@(when test-not `(:test-not ,test-not))))))
      (and (check-scaffold-copy new newcopy)
	   (check-scaffold-copy old oldcopy)
	   (check-scaffold-copy tree treecopy)
	   result))))


(defun check-subst-if (new pred tree &key (key 'no-key))
  "Call subst-if new pred tree, with various keyword arguments
   if present.  Check that the arguments are not changed."
  (setf new (copy-tree new))
  (setf tree (copy-tree tree))
  (let ((newcopy (make-scaffold-copy new))
	(predcopy (make-scaffold-copy pred))
	(treecopy (make-scaffold-copy tree)))
    (let ((result
	   (apply #'subst-if new pred tree
		  (unless (eqt key 'no-key) `(:key ,key)))))
      (and (check-scaffold-copy new newcopy)
	   (check-scaffold-copy pred predcopy)
	   (check-scaffold-copy tree treecopy)
	   result))))

(defun check-subst-if-not (new pred tree &key (key 'no-key))
  "Call subst-if-not new pred tree, with various keyword arguments
   if present.  Check that the arguments are not changed."
  (setf new (copy-tree new))
  (setf tree (copy-tree tree))
  (let ((newcopy (make-scaffold-copy new))
	(predcopy (make-scaffold-copy pred))
	(treecopy (make-scaffold-copy tree)))
    (let ((result
	   (apply #'subst-if-not new pred tree
		  (unless (eqt key 'no-key) `(:key ,key)))))
      (and (check-scaffold-copy new newcopy)
	   (check-scaffold-copy pred predcopy)
	   (check-scaffold-copy tree treecopy)
	   result))))

(defun check-nsubst (new old tree &key (key 'no-key) test test-not)
  "Call nsubst new old tree, with keyword arguments if present."
  (setf new (copy-tree new))
  (setf old (copy-tree old))
  (setf tree (copy-tree tree))
  (apply #'nsubst new old tree
	 `(,@(unless (eqt key 'no-key) `(:key ,key))
	     ,@(when test `(:test ,test))
	     ,@(when test-not `(:test-not ,test-not)))))

(defun check-nsubst-if (new pred tree &key (key 'no-key))
  "Call nsubst-if new pred tree, with keyword arguments if present."
  (setf new (copy-tree new))
  (setf tree (copy-tree tree))
  (apply #'nsubst-if new pred tree
	 (unless (eqt key 'no-key) `(:key ,key))))

(defun check-nsubst-if-not (new pred tree &key (key 'no-key))
  "Call nsubst-if-not new pred tree, with keyword arguments if present."
  (setf new (copy-tree new))
  (setf tree (copy-tree tree))
  (apply #'nsubst-if-not new pred tree
         (unless (eqt key 'no-key) `(:key ,key))))

(defun check-copy-list-copy (x y)
  "Check that y is a copy of the list x."
  (if
   (consp x)
   (and (consp y)
        (not (eqt x y))
        (eqt (car x) (car y))
        (check-copy-list-copy (cdr x) (cdr y)))
   (and (eqt x y) t)))

(defun check-copy-list (x)
  "Apply copy-list, checking that it properly copies,
   and checking that it does not change its argument."
  (let ((xcopy (make-scaffold-copy x)))
    (let ((y (copy-list x)))
      (and
       (check-scaffold-copy x xcopy)
       (check-copy-list-copy x y)
       y))))

(defun nintersection-with-check (x y &key test)
  (let ((ycopy (make-scaffold-copy y)))
    (let ((result (if test
		      (nintersection x y :test test)
                      (nintersection x y))))
      (if (check-scaffold-copy y ycopy)
	  result
          'failed))))

(defun union-with-check (x y &key test test-not)
  (let ((xcopy (make-scaffold-copy x))
	(ycopy (make-scaffold-copy y)))
    (let ((result (cond
		   (test (union x y :test test))
		   (test-not (union x y :test-not test-not))
		   (t (union x y)))))
      (if (and (check-scaffold-copy x xcopy)
	       (check-scaffold-copy y ycopy))
	  result
          'failed))))

(defun union-with-check-and-key (x y key &key test test-not)
  (let ((xcopy (make-scaffold-copy x))
	(ycopy (make-scaffold-copy y)))
    (let ((result  (cond
                    (test (union x y :key key :test test))
                    (test-not (union x y :key key :test-not test-not))
                    (t (union x y :key key)))))
      (if (and (check-scaffold-copy x xcopy)
	       (check-scaffold-copy y ycopy))
	  result
          'failed))))

(defun check-union (x y z)
  (and (listp x)
       (listp y)
       (listp z)
       (loop for e in z always (or (member e x) (member e y)))
       (loop for e in x always (member e z))
       (loop for e in y always (member e z))
       t))

(defun nunion-with-copy (x y &key test test-not)
  (setf x (copy-list x))
  (setf y (copy-list y))
  (cond
   (test (nunion x y :test test))
   (test-not (nunion x y :test-not test-not))
   (t (nunion x y))))

(defun nunion-with-copy-and-key (x y key &key test test-not)
  (setf x (copy-list x))
  (setf y (copy-list y))
  (cond
   (test (nunion x y :key key :test test))
   (test-not (nunion x y :key key :test-not test-not))
   (t (nunion x y :key key))))

(defun do-random-nset-differences (size niters &optional (maxelem (* 2 size)))
  (let ((state (make-random-state)))
    (loop
      for i from 1 to niters do
      (let ((x (shuffle (loop for j from 1 to size collect
                          (random maxelem state))))
            (y (shuffle (loop for j from 1 to size collect
                          (random maxelem state)))))
        (let ((z (nset-difference-with-check x y)))
          (let ((is-good (check-nset-difference x y z)))
            (unless is-good (return (values x y z)))))))
    nil))

(defun set-difference-with-check (x y &key (key 'no-key)
                                    test test-not)
  (setf x (copy-list x))
  (setf y (copy-list y))
  (let ((xcopy (make-scaffold-copy x))
	(ycopy (make-scaffold-copy y)))
    (let ((result (apply #'set-difference
			 x y
			 `(,@(unless (eqt key 'no-key) `(:key ,key))
                             ,@(when test `(:test ,test))
                             ,@(when test-not `(:test-not ,test-not))))))
      (cond
       ((and (check-scaffold-copy x xcopy)
	     (check-scaffold-copy y ycopy))
	result)
       (t
	'failed)))))

(defun check-set-difference (x y z &key (key #'identity)
                               (test #'eql))
  (and
   ;; (not (eqt 'failed z))
   (listp x)
   (listp y)
   (listp z)
   (loop for e in z always (member e x :key key :test test))
   (loop for e in x always (or (member e y :key key :test test)
			       (member e z :key key :test test)))
   (loop for e in y never  (member e z :key key :test test))
   t))

(defun nset-difference-with-check (x y &key (key 'no-key)
				     test test-not)
  (setf x (copy-list x))
  (setf y (copy-list y))
  (apply #'nset-difference
	 x y
	 `(,@(unless (eqt key 'no-key) `(:key ,key))
	     ,@(when test `(:test ,test))
	     ,@(when test-not `(:test-not ,test-not)))))

(defun check-nset-difference (x y z &key (key #'identity)
				(test #'eql))
  (and
   (listp x)
   (listp y)
   (listp z)
   (loop for e in z always (member e x :key key :test test))
   (loop for e in x always (or (member e y :key key :test test)
			       (member e z :key key :test test)))
   (loop for e in y never  (member e z :key key :test test))
   t))

(defun set-exclusive-or-with-check (x y &key (key 'no-key)
				      test test-not)
  (setf x (copy-list x))
  (setf y (copy-list y))
  (let ((xcopy (make-scaffold-copy x))
	(ycopy (make-scaffold-copy y)))
    (let ((result (apply #'set-exclusive-or
			 x y
			 `(,@(unless (eqt key 'no-key) `(:key ,key))
			     ,@(when test `(:test ,test))
			     ,@(when test-not `(:test-not ,test-not))))))
      (cond
       ((and (check-scaffold-copy x xcopy)
	     (check-scaffold-copy y ycopy))
	result)
       (t
	'failed)))))

(defun check-set-exclusive-or (x y z &key (key #'identity)
				 (test #'eql))
  (and
   ;; (not (eqt 'failed z))
   (listp x)
   (listp y)
   (listp z)
   (loop for e in z always (or (member e x :key key :test test)
			       (member e y :key key :test test)))
   (loop for e in x always (if (member e y :key key :test test)
			       (not (member e z :key key :test test))
                               (member e z :key key :test test)))
   (loop for e in y always (if (member e x :key key :test test)
			       (not (member e z :key key :test test))
                               (member e z :key key :test test)))
   t))

(defun nset-exclusive-or-with-check (x y &key (key 'no-key)
				       test test-not)
  (setf x (copy-list x))
  (setf y (copy-list y))
  (apply #'nset-exclusive-or
	 x y
	 `(,@(unless (eqt key 'no-key) `(:key ,key))
	     ,@(when test `(:test ,test))
	     ,@(when test-not `(:test-not ,test-not)))))

(defun subsetp-with-check (x y &key (key 'no-key) test test-not)
  (let ((xcopy (make-scaffold-copy x))
	(ycopy (make-scaffold-copy y)))
    (let ((result
	   (apply #'subsetp x y
		  `(,@(unless (eqt key 'no-key)
			`(:key ,key))
		      ,@(when test `(:test ,test))
		      ,@(when test-not `(:test-not ,test-not))))))
      (cond
       ((and (check-scaffold-copy x xcopy)
	     (check-scaffold-copy y ycopy))
	(not (not result)))
       (t 'failed)))))

(defun safe-elt (x n)
  (classify-error* (elt x n)))

(in-package :cl-user)

(defun do-tests (&rest args)
  (let ((rt::*passed* 0) (rt::*failed* 0)
        (suffix ".lsp")
        (tests (or args (list "and"
                              "apply"
                              "aref"
                              "bit-vector"
                              "bit-vector-p"
                              "block"
                              "boundp"
                              "call-arguments-limit"
                              "case"
                              "catch"
                              "char-compare"
                              "character"
                              "cl-symbols"
                              "concatenate"
                              "cond"
                              "cons-test-01"
                              "cons-test-02"
                              "cons-test-03"
                              "cons-test-04"
                              "cons-test-06"
                              "cons-test-07"
                              "cons-test-08"
                              "cons-test-09"
                              "cons-test-10"
                              "cons-test-11"
                              "cons-test-12"
                              "cons-test-13"
                              "cons-test-14"
                              "cons-test-15"
                              "cons-test-16"
                              "cons-test-17"
                              "cons-test-18"
                              "cons-test-19"
                              "cons-test-20"
                              "cons-test-21"
                              "cons-test-22"
                              "cons-test-23"
                              "cons-test-24"
                              "constantly"
                              "constantp"
                              "copy-seq"
                              "count"
                              "count-if"
                              "count-if-not"
                              "defparameter"
                              "defvar"
                              "elt"
                              "equal"
                              "equalp"
                              "eql"
                              "eval"
                              "every"
                              "fboundp"
                              "fdefinition"
                              "fill"
                              "fill-pointer"
                              "find"
                              "find-if"
                              "find-if-not"
                              "flet"
                              "fmakunbound"
                              "funcall"
                              "function"
                              "function-lambda-expression"
                              "functionp"
                              "handler-bind"
                              "identity"
                              "if"
                              "iteration"
                              "labels"
                              "lambda"
                              "lambda-parameters-limit"
                              "length"
                              "let"
                              "loop"
                              "loop1"
                              "loop2"
                              "loop3"
                              "loop4"
                              "loop5"
                              "loop8"
                              "loop9"
                              "make-sequence"
                              "make-string"
                              "map"
                              "merge"
                              "multiple-value-bind"
                              "multiple-value-call"
                              "multiple-value-list"
                              "nil"
                              "not-and-null"
                              "notany"
                              "notevery"
                              "nreverse"
                              "nsubstitute"
                              "nsubstitute-if"
                              "nsubstitute-if-not"
                              "or"
                              "position"
                              "position-if"
                              "position-if-not"
                              "prog1"
                              "prog2"
                              "progn"
                              "reduce"
                              "remove"
                              "remove-duplicates"
                              "reverse"
                              "simple-bit-vector"
                              "simple-bit-vector-p"
                              "simple-vector-p"
                              "some"
                              "sort"
                              "string"
                              "string-downcase"
                              "string-upcase"
                              "substitute"
                              "substitute-if"
                              "substitute-if-not"
                              "subtypep"
                              "svref"
                              "t"
                              "tagbody"
                              "unless"
                              "unwind-protect"
                              "values"
                              "values-list"
                              "vector"
                              "vector-pop"
                              "vector-push"
                              "vectorp"
                              "when"))))
    (dolist (test tests)
             (load (concatenate 'string rt::*prefix* test suffix)))
    (format t "~A tests: ~A passed, ~A failed~%"
            (+ rt::*passed* rt::*failed*)
            rt::*passed*
            rt::*failed*)
    (format t "*compile-tests* was ~A~%" rt::*compile-tests*))
  (values))

(defun do-all-tests (&optional (compile-tests t))
  (let ((rt::*compile-tests* compile-tests))
    (nodebug)
    (time (do-tests))
    (debug)))

(nodebug)
(load (concatenate 'string rt::*prefix* "char-aux.lsp"))
(load (concatenate 'string rt::*prefix* "cl-symbols-aux.lsp"))
(load (concatenate 'string rt::*prefix* "cl-symbol-names.lsp"))
(debug)
