;;; rt.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: rt.lisp,v 1.146 2003-12-20 15:22:33 piso Exp $
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

(export '(deftest my-aref))

(defvar *prefix* "/home/peter/gcl/ansi-tests/")

(defvar *compile-tests* t)

(defvar *passed* 0)
(defvar *failed* 0)

(defun my-aref (a &rest args)
  (apply #'aref a args))

(defun my-row-major-aref (a index)
  (row-major-aref a index))

(defun equalp-with-case (x y)
  (cond
   ((eq x y) t)
   ((consp x)
    (and (consp y)
	 (equalp-with-case (car x) (car y))
	 (equalp-with-case (cdr x) (cdr y))))
   ((and (typep x 'array)
	 (= (array-rank x) 0))
    (equalp-with-case (aref x) (aref y)))
   ((typep x 'vector)
    (and (typep y 'vector)
	 (let ((x-len (length x))
	       (y-len (length y)))
	   (and (eql x-len y-len)
		(loop
		 for e1 across x
		 for e2 across y
		 always (equalp-with-case e1 e2))))))
   ((and (typep x 'array)
	 (typep y 'array)
	 (not (equal (array-dimensions x)
		     (array-dimensions y))))
    nil)
   ((typep x 'array)
    (and (typep y 'array)
	 (let ((size (array-total-size x)))
	   (loop for i from 0 below size
		 always (equalp-with-case (row-major-aref x i)
					  (row-major-aref y i))))))
   (t (eql x y))))

(defmacro deftest (name &rest body)
  (format t "Test ~S~%" `,name)
  (finish-output)
  (let* ((p body)
	 (properties
	  (loop while (keywordp (first p))
            unless (cadr p)
            do (error "Poorly formed deftest: ~S~%"
                      (list* 'deftest name body))
            append (list (pop p) (pop p))))
	 (form (pop p))
	 (values p))
    (let* ((aborted nil)
           (r (handler-case (multiple-value-list
                             (cond (*compile-tests*
                                    (funcall (compile nil `(lambda () ,form))))
                                   (t
                                    (eval `,form))))
                            (error (c) (setf aborted t) (list c))))
           (passed (and (not aborted) (equalp-with-case r `,values))))
      (unless passed
        (format t "  Expected value: ~S~%"
                (if (= (length `,values) 1)
                    (car `,values)
                    `,values))
        (let ((r (if (= (length r) 1) (car r) r)))
          (format t "   Actual value: ~S" r)
          (when (typep r 'condition)
            (format t " [\"~A\"]" r))
          (terpri))
        (finish-output))
      (if passed (incf *passed*) (incf *failed*)))))

(in-package :cl-user)

(intern "==>" "CL-USER")

(defvar *compiled-and-loaded-files* nil)

(defun compile-and-load (filename &key force)
  (let* ((pathname (concatenate 'string rt::*prefix* filename))
         (former-data (assoc pathname *compiled-and-loaded-files*
			     :test #'equal))
	 (source-write-time (file-write-date pathname)))
    (unless (and (not force)
		 former-data
		 (>= (cadr former-data) source-write-time))
      (if former-data
	  (setf (cadr former-data) source-write-time)
          (push (list pathname source-write-time) *compiled-and-loaded-files*))
      (load pathname))))

(defpackage :cl-test
  (:use :cl :regression-test)
  (:nicknames)
  (:shadow #:handler-case #:handler-bind)
  (:import-from "COMMON-LISP-USER" #:compile-and-load "==>")
  (:export #:random-from-seq #:random-case #:coin #:random-permute))

(load (concatenate 'string rt::*prefix* "ansi-aux-macros.lsp"))

(defun do-tests (&rest args)
  (let ((rt::*passed* 0) (rt::*failed* 0)
        (suffix ".lsp")
        (tests (or args (list "abs"
                              "acons"
                              "adjoin"
                              "and"
                              "append"
                              "apply"
                              "aref"
                              "array"
                              "array-as-class"
                              "array-dimension"
                              "array-dimensions"
                              "array-displacement"
                              "array-in-bounds-p"
                              "array-misc"
                              "array-rank"
                              "array-row-major-index"
                              "array-t"
                              "array-total-size"
                              "arrayp"
                              "ash"
                              "assoc"
                              "assoc-if"
                              "assoc-if-not"
                              "atom"
                              "bit"
                              "bit-and"
                              "bit-andc1"
                              "bit-andc2"
                              "bit-eqv"
                              "bit-ior"
                              "bit-nand"
                              "bit-nor"
                              "bit-not"
                              "bit-orc1"
                              "bit-orc2"
                              "bit-vector"
                              "bit-vector-p"
                              "bit-xor"
                              "block"
                              "boole"
                              "boundp"
                              "butlast"
                              "byte"
                              "call-arguments-limit"
                              "case"
                              "catch"
                              "ccase"
                              "ceiling"
                              "cell-error-name"
                              "char-compare"
                              "char-schar"
                              "character"
                              "cl-symbols"
                              "coerce"
                              "complement"
                              "complex"
                              "complexp"
                              "concatenate"
                              "cond"
                              "condition"
                              "conjugate"
                              "cons"
                              "cons-test-01"
                              "cons-test-03"
                              "cons-test-05"
                              "consp"
                              "constantly"
                              "constantp"
                              "copy-alist"
                              "copy-list"
                              "copy-seq"
                              "copy-symbol"
                              "copy-tree"
                              "count"
                              "count-if"
                              "count-if-not"
                              "ctypecase"
                              "cxr"
                              "defconstant"
                              "define-modify-macro"
                              "defmacro"
                              "defparameter"
                              "defun"
                              "defvar"
                              "destructuring-bind"
                              "divide"
                              "dpb"
                              "ecase"
                              "elt"
                              "endp"
                              "epsilons"
                              "eql"
                              "equal"
                              "equalp"
                              "error"
                              "etypecase"
                              "eval"
                              "evenp"
                              "every"
                              "expt"
                              "fboundp"
                              "fceiling"
                              "fdefinition"
                              "ffloor"
                              "fill"
                              "fill-pointer"
                              "fill-strings"
                              "find"
                              "find-if"
                              "find-if-not"
                              "flet"
                              "float"
                              "floatp"
                              "floor"
                              "fmakunbound"
                              "fround"
                              "ftruncate"
                              "funcall"
                              "function"
                              "function-lambda-expression"
                              "functionp"
                              "gcd"
                              "gensym"
                              "get-properties"
                              "getf"
                              "handler-bind"
                              "handler-case"
                              "hash-table"
                              "identity"
                              "if"
                              "ignore-errors"
                              "imagpart"
                              "integer-length"
                              "integerp"
                              "intersection"
                              "invoke-debugger"
                              "isqrt"
                              "iteration"
                              "keywordp"
                              "labels"
                              "lambda"
                              "lambda-list-keywords"
                              "lambda-parameters-limit"
                              "last"
                              "lcm"
                              "ldb"
                              "ldiff"
                              "length"
                              "let"
                              "list"
                              "list-length"
                              "listp"
                              "load-structures"
                              "logand"
                              "logandc1"
                              "logandc2"
                              "logbitp"
                              "logeqv"
                              "logior"
                              "lognor"
                              "lognot"
                              "logorc1"
                              "logorc2"
                              "logxor"
                              "loop"
                              "loop1"
                              "loop2"
                              "loop3"
                              "loop4"
                              "loop5"
                              "loop6"
                              "loop7"
                              "loop8"
                              "loop9"
                              "loop10"
                              "loop11"
                              "loop12"
                              "loop13"
                              "loop14"
                              "loop15"
                              "loop16"
                              "loop17"
                              "make-array"
                              "make-list"
                              "make-sequence"
                              "make-string"
                              "make-symbol"
                              "map"
                              "map-into"
                              "mapc"
                              "mapcan"
                              "mapcar"
                              "mapcon"
                              "mapl"
                              "maplist"
                              "max"
                              "member"
                              "member-if"
                              "member-if-not"
                              "merge"
                              "min"
                              "minus"
                              "minusp"
                              "mismatch"
                              "multiple-value-bind"
                              "multiple-value-call"
                              "multiple-value-list"
                              "multiple-value-prog1"
                              "multiple-value-setq"
                              "nbutlast"
                              "nconc"
                              "nil"
                              "nintersection"
                              "not-and-null"
                              "notany"
                              "notevery"
                              "nreconc"
                              "nreverse"
                              "nset-difference"
                              "nset-exclusive-or"
                              "nstring-capitalize"
                              "nstring-downcase"
                              "nstring-upcase"
                              "nsublis"
                              "nsubst"
                              "nsubst-if"
                              "nsubst-if-not"
                              "nsubstitute"
                              "nsubstitute-if"
                              "nsubstitute-if-not"
                              "nth"
                              "nth-value"
                              "nthcdr"
                              "number-comparison"
                              "numerator-denominator"
                              "nunion"
                              "oddp"
                              "oneminus"
                              "oneplus"
                              "or"
                              "packages"
                              "pairlis"
                              "parse-integer"
                              "phase"
                              "places"
                              "plus"
                              "plusp"
                              "pop"
                              "position"
                              "position-if"
                              "position-if-not"
                              "prog"
                              "prog1"
                              "prog2"
                              "progn"
                              "progv"
                              "psetf"
                              "psetq"
                              "push"
                              "pushnew"
                              "random"
                              "rassoc"
                              "rassoc-if"
                              "rassoc-if-not"
                              "rational"
                              "rationalize"
                              "rationalp"
                              "realp"
                              "realpart"
                              "reduce"
                              "remf"
                              "remove"
                              "remove-duplicates"
                              "replace"
                              "rest"
                              "return"
                              "revappend"
                              "reverse"
                              "rotatef"
                              "round"
                              "row-major-aref"
                              "rplaca"
                              "rplacd"
                              "sbit"
                              "search-bitvector"
                              "search-list"
                              "search-string"
                              "search-vector"
                              "set-difference"
                              "set-exclusive-or"
                              "shiftf"
                              "signum"
                              "simple-array"
                              "simple-array-t"
                              "simple-bit-vector"
                              "simple-bit-vector-p"
                              "simple-vector-p"
                              "some"
                              "sort"
                              "special-operator-p"
                              "string"
                              "string-capitalize"
                              "string-comparisons"
                              "string-downcase"
                              "string-left-trim"
                              "string-right-trim"
                              "string-trim"
                              "string-upcase"
                              "sublis"
                              "subseq"
                              "subsetp"
                              "subst"
                              "subst-if"
                              "subst-if-not"
                              "substitute"
                              "substitute-if"
                              "substitute-if-not"
                              "subtypep"
                              "subtypep-cons"
                              "subtypep-eql"
                              "subtypep-float"
                              "subtypep-integer"
                              "subtypep-member"
                              "subtypep-rational"
                              "subtypep-real"
                              "svref"
                              "symbol-name"
                              "t"
                              "tagbody"
                              "tailp"
                              "times"
                              "tree-equal"
                              "truncate"
                              "typecase"
                              "union"
                              "unless"
                              "unwind-protect"
                              "values"
                              "values-list"
                              "vector"
                              "vector-pop"
                              "vector-push"
                              "vector-push-extend"
                              "vectorp"
                              "when"
                              "zerop"))))
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
    (time (do-tests))))

#+armedbear
(when (fboundp 'jvm::jvm-compile)
  (mapcar #'jvm::jvm-compile '(sys::list-remove-duplicates*
                               sys::vector-remove-duplicates*
                               remove-duplicates
                               union
                               nunion
                               intersection
                               nintersection
                               subsetp
                               copy-tree)))

(load (concatenate 'string rt::*prefix* "char-aux.lsp"))
(load (concatenate 'string rt::*prefix* "cl-symbols-aux.lsp"))
(load (concatenate 'string rt::*prefix* "cl-symbol-names.lsp"))
(load (concatenate 'string rt::*prefix* "universe.lsp"))
(load (concatenate 'string rt::*prefix* "ansi-aux.lsp"))
(load (concatenate 'string rt::*prefix* "array-aux.lsp"))
(load (concatenate 'string rt::*prefix* "subseq-aux.lsp"))
(load (concatenate 'string rt::*prefix* "cons-aux.lsp"))
(load (concatenate 'string rt::*prefix* "numbers-aux.lsp"))
(load (concatenate 'string rt::*prefix* "string-aux.lsp"))
(load (concatenate 'string rt::*prefix* "random-aux.lsp"))
(load (concatenate 'string rt::*prefix* "remove-aux.lsp"))

#+armedbear
(when (fboundp 'jvm::jvm-compile)
  (mapcar #'jvm::jvm-compile '(rt::equalp-with-case
                               cl-test::make-scaffold-copy
                               cl-test::check-scaffold-copy
                               cl-test::is-intersection)))
