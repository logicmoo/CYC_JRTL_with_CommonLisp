;;; -*- mode: lisp; package: jnil -*-
;;; Copyright (c) 2004-2005 Tiago Maduro-Dias. All Rights Reserved.
;;;
;;; This code is free software; you can redistribute it and/or
;;; modify it under the terms of the version 2.1 of
;;; the GNU Lesser General Public License as published by 
;;; the Free Software Foundation, as clarified by the preamble
;;; found in license-llgpl.txt.
;;;
;;; This code is distributed in the hope that it will be useful,
;;; but without any warranty; without even the implied warranty of
;;; merchantability or fitness for a particular purpose. See the GNU
;;; Lesser General Public License for more details.
;;;
;;; Version 2.1 of the GNU Lesser General Public License is in the file 
;;; license-lgpl.txt that was distributed with this file.
;;; If it is not present, you can access it from
;;; http://www.gnu.org/copyleft/lesser.txt (until superseded by a newer
;;; version) or write to the Free Software Foundation, Inc., 59 Temple Place, 
;;; Suite 330, Boston, MA  02111-1307  USA
;;;
;;; $Id: jnil-utils.lisp,v 1.1.1.1 2006/04/23 17:11:36 tdias Exp $
;;;
;;; Description: Specific Jnil utilities that are shared by several coders.
;;;
;;; -- start of jnil-utils.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defvar *linj-keywords*
    '("with-slots" "make-hash-table" "gethash" "rationalp" "string-upcase"
      "string-downcase" "string-capitalize" "string-trim" "string="
      "string-equal" "string-replace" "concatenate" "qlet" "println" "print"
      "pprint" "princ" "prin1" "warn" "terpri" "fresh-line" "write-char"
      "write-string" "write-line" "write-byte" "read-line" "format"
      "with-open-file" "let" "let*" "prog1" "do-iter" "dotimes" "dolist" "psetq"
      "psetf" "not" "case" "make-array" "defmethod" "defmethod-0" "setf" "setq"
      "defnew" "defafternew" "defmain" "defslot" "defvar" "defconstant"
      "make-instance" "multiple-value-bind" "unwind-protect" "ignore-errors"
      "without-checked-exceptions" "fluid-let" "ecase" "typecase" "assert"
      "time" "list" "push" "doplist" "dolist2" "loop" "with-swing" "tabulators"
      "tabulator" "table" "tr" "td" "dovector" "array" "make-string" "send" "error"
      "vector"))

(defvar *lisp-primitive-types* '("list" "cons" "fixnum" "integer" "bignum"))

(defvar *common-lisp-keywords* '("t" "nil" "pi"))
(defvar *common-lisp-keywords-append* "~")

(defun jnil-generate-code (java-ast dialect verbose compiler-switches)
  (let ((*verbose-output* verbose)
	(visitors (dialect-visitors dialect compiler-switches)))
    (when *verbose-output* (stdout "~&; Compilation switches: ~w" compiler-switches))
    (if visitors
	(dolist (visitor visitors)
	  (when *verbose-output* (stdout "~&;;; Running visitor: ~w~%" visitor))
	  (visit visitor java-ast))
      (error "No coders found for the chosen dialect: ~a" dialect))
    (node-code java-ast)))

(definline lisp-output-pathname (qualified-unit-name dialect)
  (let ((split-qualified-name (split-re "\\." qualified-unit-name)))
    (make-pathname
     :type (case dialect (:linj "linj") (otherwise "lisp"))
     :name (java-to-lisp-type (lastelt split-qualified-name))
     :defaults (format nil "~{~a~^/~}" split-qualified-name))))

(definline msg (string &optional warnp)
  (when warnp (warn (concatenate 'string string "...")))
  (when *verbose-output* (format t "~&;~4T~a..." string)))

(defun find-slot-named (name lisp-slots)
  (or (find name lisp-slots
	    :test #'string= :key #'(lambda (slot)
				     (lisp-name-name (lisp-slot-name slot))))
      (error "Couldn't find slot for accessor ~a" name)))

(defmacro push-accessors (accessors lisp-slots push-key-fn)
  `(dolist (accessor ,accessors)
     (push (node-code (declaration-name (cdr accessor)))
           (funcall ,push-key-fn 
                    (find-slot-named (java-to-lisp-name (car accessor)) ,lisp-slots)))))

(defun push-readers-and-writers (lisp-slots getters setters)
  (push-accessors getters lisp-slots #'lisp-slot-readers)
  (push-accessors setters lisp-slots #'lisp-slot-writers)
  lisp-slots)

(defun append-parameter-types (name parameter-type-names &key java-syntax-p)
  (format nil "~a~:[~{-~a~}~;(~{~a~^ ~})~]"
          name 
          java-syntax-p
          (mapcar #'(lambda (param) 
                      (if java-syntax-p
                          param
                        (java-to-lisp-type param)))
                  parameter-type-names)))

(defun name-string-with-appended-parameter-types (bound-method-name &rest args)
  (apply #'append-parameter-types
         (name-string bound-method-name)
         (method-parameter-type-names bound-method-name)
         args))

(defun constant-style-name-p (name)
  (every #'(lambda (char)
	     (or (and (alphanumericp char) (or (not (both-case-p char)) (upper-case-p char)))
		 (char= char #\_))) name))

(defmethod java-to-lisp-name ((name node) &optional constant-p)
  (java-to-lisp-name (name-string name) constant-p))

(defmethod java-to-lisp-name (name &optional constant-p)
  (let ((safe-name (if (member name *common-lisp-keywords* :test #'string-equal)
		       (concatenate 'string name *common-lisp-keywords-append*)
		     name)))
    (cond ((mixed-case-p safe-name)
	   (string-downcase (insert-char #'upper-case-p #\- safe-name 1)))
	  ((and constant-p (constant-style-name-p safe-name))
	   (concatenate 'string "+" (string-downcase (substitute #\- #\_ safe-name)) "+"))
	  (t safe-name))))

(defmethod java-to-lisp-type ((name node))
  (java-to-lisp-type (name-string name)))

(defmethod java-to-lisp-type ((qualified-name string))
;;;;- Wed Jun  1 00:39:49 2005 by tiago - Linj requires that the type
;;;;java.lang.Integer/Long/Double/Float is treated as Integer/Long/Double/Float to differentiate
;;;;from other types (Integer is pre-defined in Linj and the others would conflict with the Java
;;;;primitive types of the same name).

  (let ((name (lastelt (split-re "\\." qualified-name))))
    (cond ((member qualified-name
		   '("java.lang.Integer" "java.lang.Long" "java.lang.Double" "java.lang.Float")
		   :test #'string=)
	   name)
	  ((find-if #'(lambda (lisp-type) (string-equal name lisp-type)) *lisp-primitive-types*)
	   name)
          ((mixed-case-p name)
           (string-downcase (insert-char #'upper-case-p #\- name 1)))
	  (t name))))

(defun collect-code (node-list)
  (mapcar #'(lambda (node) (node-code node)) node-list))

(defun slots-and-others (fields)
  (let ((slots (list))
	(statics (list)))
    (dolist (field fields (values (nreverse slots) (nreverse statics)))
      (if (static-p field) (push field statics) (push field slots)))))

(definline primitive-number-p (type-name)
  (member type-name '("byte" "short" "int" "long" "float" "double") :test #'string-equal))

(definline char-arguments-p (args)
  (every #'(lambda (arg) 
	     (string= (type-name arg) "char"))
	 args))

(definline common-lisp-function-p (name)
;;;;- Sun Aug 28 23:51:47 2005 by tiago - We use read-from-string for compatibility with
;;;;case-sensitive modes. This shouldn'be be a bottleneck but the option may be reviewed at a later
;;;;stage.
  
  (let ((symb (read-from-string name)))
    (multiple-value-bind (symbol status)
        (find-symbol (string symb) 'common-lisp)
      (and symbol (eq status :external) (fboundp symbol)))))

(definline linj-keyword-p (name)
  (member name *linj-keywords* :test #'string-equal))

(definline read-from-string-radix (string radix)
  (read-from-string (format nil "#~ar~a" radix string)))

(defun parse-java-int-from-string (token)
;;;;- Mon May 30 00:08:21 2005 by tiago - We assume TOKEN is in valid Java number notation in
;;;;order to simplify the regular expressions.

  (re-let "(0\x([^lL]*))|(0([^lLfFdD\\.]+))|(([^dDfFlL]*)[dDfFlL]?)" token
	  ((hex 2) (oct 4) (dec 6))
	  (values hex oct dec)))

(defun coerce-java-int (number &optional longp)
  (let ((most-positive (if longp #x7fffffffffffffff #x7fffffff))
	(unsigned-most-positive (if longp #xffffffffffffffff #xffffffff)))
    (if (> number most-positive)
	(- (+ (- unsigned-most-positive number) 1))
      number)))

(defun string-concatenation-p (node)
  (and (infix-expression-p node)
       (string= (expression-operator node) "+")
       (string= (type-name node) "String")))

(defun protect-tildes (str)
  (if (find #\~ str)
      (with-output-to-string (s)
        (loop for c across str
	    if (char= c #\~)
	    do (princ "~~" s)
	    else do (princ c s)))
    str))

(defun format-string-and-args (args newline-p)
  (cons (apply #'concatenate 'string (nconc (mapcar #'(lambda (arg)
                                                        (if (string-literal-p arg)
                                                            (protect-tildes (literal-value arg))
                                                          "~a"))
                                                    args)
                                            (and newline-p (list "~%"))))
	(mapcan #'(lambda (arg)
		    (if (string-literal-p arg)
                        ()
		      (list (node-code arg))))
		args)))

(defun make-format-code (args &optional (stream "nil") newline-p)
  (make-lisp-sexp "format"
                  (cons (make-lisp-name stream)
                        (if (singleton-p args)
                            args
                          (format-string-and-args args newline-p)))))

;;; Right now the chosen array implementation mimics Java's semantics closely. In the future we may
;;; want to treat certain cases in a more lispy way. These functions may become useful then.
(defun array-dimensions-from-list (lst)
  (cond ((consp (first lst)) (cons (length lst) (array-dimensions-from-list (first lst))))
        ((consp lst) (list (length lst)))))

(defun literal-p (elt)
  (and (atom elt) (not (typep elt 'code))))

(defun literal-tree-p (tree)
  (let ((first (first tree)))
    (if (endp tree)
        t
      (and (if (atom first) (literal-p first) (literal-tree-p first))
           (literal-tree-p (rest tree))))))

(defun list-to-array-initializer (contents)
  (cond ((atom contents) contents)
        ((every #'literal-p contents) (make-lisp-quoted-form contents))
        (t (let ((subtree (mapcar #'list-to-array-initializer contents)))
             (if (every #'(lambda (elt) (or (literal-p elt) (typep elt 'lisp-quoted-form))) subtree)
                 (make-lisp-quoted-form (mapcar #'(lambda (elt)
                                                    (if (typep elt 'lisp-quoted-form)
                                                        (lisp-quoted-form-form elt)
                                                      elt)) 
                                                subtree))
               (make-lisp-sexp "list" subtree))))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of jnil-utils.lisp --
