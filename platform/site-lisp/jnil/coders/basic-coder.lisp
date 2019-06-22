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
;;; $Id: basic-coder.lisp,v 1.1.1.1 2006/04/23 17:11:45 tdias Exp $
;;;
;;; Description: Visitor for generation of basic pieces of code, common to all
;;; dialects.
;;;
;;; -- start of basic-coder.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

;;; visitor definition
(defvisitor basic-coder 10 (:linj :common-lisp))

(defcoder basic-coder (node character-literal)
  (literal-value node))

(defcoder basic-coder (node number-literal)
;;;;- Tue May 31 12:37:19 2005 by tiago - Note that it is safe to use "double" and
;;;;"long" explicitly, as they belong to the primitive types that may be associated with number
;;;;literals.

;;;;- Tue May 17 16:59:56 2005 by tiago - In Java, negative numbers can be represented in
;;;;Hexadecimal and Octal if they represent a number greater or equal to #x80000000, so we convert
;;;;them to their negative equivalent, but maintain the base and respective prefix to hint the
;;;;programmer's intentions (ex.: 0xffffffff => #x-1).

  (letv (((hex oct dec) (parse-java-int-from-string (literal-token node)))
	 (longp (string= (type-name node) "long"))
	 (*read-default-float-format* (if (string= (type-name node) "double")
                                          'double-float
					'single-float)))
    (cond (dec 
           (read-from-string dec))
          (hex
           (make-lisp-hex (coerce-java-int (read-from-string-radix hex 16) longp)))
          (t (make-lisp-octal (coerce-java-int (read-from-string-radix oct 8) longp))))))

(defcoder basic-coder (node string-literal)
  (literal-value node))

(defcoder basic-coder (node boolean-literal)
  (make-lisp-name (string-downcase (literal-value node))))

(defcoder basic-coder (node parenthesized-expression)
  (node-code (parenthesized-expression-expression node)))

(defcoder basic-coder (node cast-expression)
  (node-code (cast-expression-expression node)))

(defcoder basic-coder (node instanceof-expression)
  (make-lisp-typep (node-code (expression-left-operand node))
		   (java-to-lisp-type (type-qualified-name (expression-right-operand node)))))

(defcoder basic-coder (node prefix-expression)
  (make-lisp-sexp (case* (expression-operator node)
                    ("++" "incf") ("--" "decf") ("!" "not") ("~" "lognot")
                    (otherwise (expression-operator node)))
		  (node-code (expression-operand node))))

(defcoder (vis basic-coder) (node infix-expression)
  (let* ((right-operand (expression-right-operand node))
	 (left-operand (expression-left-operand node))
	 (operator (expression-operator node))
	 (arglist (append (list left-operand right-operand)
			  (when (extended-operands-p node)
                            (expression-extended-operands node))))
	 (expr-args (collect-code arglist)))
    (cond ((string-concatenation-p node)
           (make-format-code arglist))
	  ((and (string= "!=" operator) (not (primitive-number-p (type-name right-operand))))
	   (make-lisp-sexp "not" (make-lisp-sexp "eq" expr-args)))
	  ((string= ">>>" operator) 
	   (if (or (switchp vis :linj) (switchp vis :support-utils))
	       (make-lisp-sexp ">>>" expr-args)
	     (make-lisp->>> (node-code left-operand)
                            (node-code right-operand))))
	  ((string= ">>" operator)
	   (make-lisp-sexp "ash" (list (node-code left-operand)
                                       (make-lisp-sexp "-" (node-code right-operand)))))
	  (t (make-lisp-sexp (case* operator
                               ("%" "rem") ("&" "logand") ("|" "logior")
                               ("^" "logxor") ("<<" "ash") ("&&" "and") ("||" "or")
                               ("!=" "/=")
                               ("==" (if (primitive-number-p (type-name right-operand)) "=" "eq"))
                               (">" (if (char-arguments-p arglist) "char>" ">"))
                               (">=" (if (char-arguments-p arglist) "char>=" ">="))
                               ("<" (if (char-arguments-p arglist) "char<" "<"))
                               ("<=" (if (char-arguments-p arglist) "char<=" "<="))
                               (otherwise operator))
                             expr-args)))))

(defcoder (vis basic-coder) (node postfix-expression)
  (let ((operand-name (node-code (expression-operand node)))
	(operator (expression-operator node)))
    (cond ((expression-statement-p (node-parent node))
	   (make-lisp-sexp (case* operator ("++" "incf") ("--" "decf")) operand-name))
	  ((or (switchp vis :linj) (switchp vis :support-utils))
	   (make-lisp-sexp (case* operator ("++" "post-incf") ("--" "post-decf")) operand-name))
	  (t (make-lisp-postfix (case* operator ("++" "incf") ("--" "decf")) operand-name)))))

(defcoder (vis basic-coder) (node labeled-statement)
  (msg "Generating Lisp code code for labeled statement")
  (if (and (switchp vis :common-lisp) (an node :continue-in-body-p) (not (an node :break-in-body-p)))
      (node-code (statement-body node))
    (make-lisp-named-block (node-code (statement-label node)) 
                           (node-code (statement-body node)))))

(defcoder (vis basic-coder) (node assignment)
  (msg "Generating Lisp code code for assignment")
  (let* ((operator (assignment-operator node))
         (arglist (list (assignment-left-hand-side node) (assignment-right-hand-side node)))
	 (left-hand-side (node-code (assignment-left-hand-side node)))
	 (right-hand-side (node-code (assignment-right-hand-side node)))
	 (expr-args (list left-hand-side right-hand-side)))
    (case* operator
      ("=" (make-lisp-setf left-hand-side right-hand-side))
      ("+=" (if (string= (type-name node) "String")
                (make-lisp-setf left-hand-side (make-format-code arglist))
              (make-lisp-sexp "incf" expr-args)))
      ("-=" (make-lisp-sexp "decf" expr-args))
      (">>=" (make-lisp-setf left-hand-side
                             (make-lisp-sexp "ash"
                                             (list left-hand-side (list '- right-hand-side)))))
      (">>>=" (make-lisp-setf left-hand-side
                              (if (or (switchp vis :linj) (switchp vis :support-utils))
                                  (make-lisp-sexp ">>>" expr-args)
                                (make-lisp->>> left-hand-side right-hand-side))))
      (otherwise (make-lisp-setf left-hand-side
                                 (make-lisp-sexp (case* operator
                                                   ("*=" "*") ("/=" "/") ("&=" "logand")
                                                   ("|=" "logior") ("^=" "logxor")
                                                   ("%=" "rem") (">>>=" ">>>") ("<<=" "ash"))
                                                 expr-args))))))

(defcoder basic-coder (node field-declaration)
  (msg "Generating Lisp code for field declaration")
  (collect-code (declaration-fragments node)))

(defcoder basic-coder (node single-variable-declaration)
  (msg "Generating Lisp code for single variable declaration")
  (node-code (declaration-name node)))

(defcoder basic-coder (node return-statement)
  (msg "Generating Lisp code for return statement")
  (make-lisp-return-from (node-code (declaration-name (find-context node 'method-declaration)))
                         (node-code (statement-expression node))))

(defcoder basic-coder (node conditional-expression)
;;;;- Wed May 11 19:26:52 2005 by tiago - In order to be consistent with the
;;;;programmer's intentions we 'one-line' the IF form.

  (make-lisp-sexp "if" (list (node-code (expression-test node))
                             (node-code (expression-then node))
                             (node-code (expression-else node)))))

(defcoder basic-coder (node ifstatement)
  (msg "Generating Lisp code for if statement")
  (make-lisp-simple-cond (node-code (ifstatement-test node))
                         (node-code (ifstatement-then node))
                         (aif else (ifstatement-else node)
                              (node-code else))))

(defcoder (vis basic-coder) (node do-statement)
  (msg "Generating Lisp code for do statement")
  (make-lisp-do (node-code (statement-expression node))
		(let ((body (node-code (statement-body node))))
                  (aif continue-label (and (switchp vis :common-lisp) (an node :continue-label))
                       (make-lisp-named-block continue-label body)
                    body))))

(defcoder (vis basic-coder) (node for-statement)
;;;;- Thu Jun 30 12:02:14 2005 by tiago - Now generating simpler code when certain patterns are
;;;;encountered. Should probably try to place the optimizations in the lisp-guru pass at some later
;;;;time.
  
;;;;- Sun May  8 23:03:42 2005 by tiago - The initializer list is unitary
;;;;unless ASSIGNMENT-INITIALIZER-P.

  (msg "Generating Lisp code for for statement")
  (let ((initializers (statement-initializers node))
	(updaters (statement-updaters node))
        (body (node-code (statement-body node)))
        (continue-label (an node :continue-label)))
    (when (and (switchp vis :common-lisp) continue-label)
      (setf body (make-lisp-named-block continue-label body)))
    (if (and (singleton-p initializers) ; just one initializer
	     (variable-declaration-expression-p (first initializers)) ; new variable
	     (singleton-p (declaration-fragments (first initializers)))
	     (declaration-initializer (first (declaration-fragments (first initializers))))
	     (singleton-p updaters)
	     (or (postfix-expression-p (first updaters))
		 (prefix-expression-p (first updaters)))
	     (lisp-name= (node-code (expression-operand (first updaters)))
			 (node-code (declaration-name (first (declaration-fragments
                                                              (first initializers)))))))
        (make-lisp-simple-do 
         (node-code (declaration-name (first (declaration-fragments (first initializers)))))
         (node-code (declaration-initializer (first (declaration-fragments (first initializers)))))
         (if (string= (expression-operator (first updaters)) "++") '1+ '1-)
         (node-code (statement-expression node))
         body)
      (let* ((code (make-lisp-for (and (not (assignment-initializer-p node))
				       (node-code (first initializers)))
				  (node-code (statement-expression node))
				  (collect-code (statement-updaters node))
				  body)))
	(if (assignment-initializer-p node)
            (make-lisp-block (append (collect-code initializers) (list code)))
	  code)))))

(defcoder basic-coder (node empty-statement)
;;;;- Sun May  8 23:04:40 2005 by tiago - NIL code in a statement should be
;;;;ignored by the code formatting functions.

  nil)

(defcoder basic-coder (node variable-declaration-statement)
  (msg "Generating Lisp code for variable declaration statement")
  (make-lisp-let* (collect-code (declaration-fragments node))))

(defcoder basic-coder (node jblock)
  (msg "Generating Lisp code for Java block")
  (aif code (collect-code (jblock-statements node))
       (make-lisp-block code)))

(defcoder basic-coder (node expression-statement)
  (msg "Generating Lisp code for expression statement")
  (node-code (expression node)))

(defcoder basic-coder (node array-access)
  (make-lisp-sexp "aref"
		  (list (node-code (array-access-array node))
			(node-code (array-access-index node)))))

(defcoder (vis basic-coder) (node while-statement)
  (msg "Generating Lisp code for while statement")
  (let ((body (node-code (statement-body node))))
    (make-lisp-while (node-code (statement-expression node)) 
                     (aif continue-label (and (switchp vis :common-lisp) (an node :continue-label))
                          (make-lisp-named-block continue-label body)
                       body))))

(defcoder basic-coder (node switch-statement)
  (msg "Generating Lisp code for switch statement")
  (make-lisp-case
   (node-code (switch-expression node))
   (mapcar #'(lambda (clause)
	       (let ((clause-cases (mapcar #'case-expression (first clause))))
		 (make-lisp-case-statement (if (rest clause-cases) 
					       (collect-code clause-cases)
					     (aif expr (first clause-cases) 
						  (node-code expr)
                                               (make-lisp-name "t")))
					   (aif body (rest clause)
						(make-lisp-block (collect-code body))))))
	   (switch-case-statements node))))

(defcoder (vis basic-coder) ((node addit-knowledge-code) throw-statement)
  (or addit-knowledge-code
      (let ((code nil)) 
        (msg "Generating Lisp code for throw statement")
        (if (class-instance-creation-p (throw-expression node))
            (setf code (make-lisp-throw (node-code (instance-creation-name (throw-expression node)))
                                        (collect-code (instance-creation-args (throw-expression node)))))
          (setf code (make-lisp-sexp "error" (node-code (throw-expression node)))))
        (if (or (from-source-p (throw-expression node)) (switchp vis :linj))
            code
          (make-lisp-unreadable code)))))

(defcoder (vis basic-coder) ((node addit-knowledge-code) catch-clause)
  (or addit-knowledge-code
      (make-lisp-catch-clause
       (let* ((exception-type (type-name (declaration-type (clause-exception node))))
              (name (make-lisp-name (java-to-lisp-type exception-type))))
         (if (or (from-source-p (declaration-name (clause-exception node)))
                 (switchp vis :linj))
             name
           (make-lisp-unreadable name)))
       (node-code (declaration-name (clause-exception node)))
       (node-code (clause-body node)))))

(defcoder basic-coder (node try-statement)
  (if (try-finally node)
      (make-lisp-exception-finally
       (node-code (try-body node))
       (aif catch-clauses (collect-code (try-catch-clauses node))
	    (make-lisp-block catch-clauses))
       (node-code (try-finally node)))
    (make-lisp-exception
     (node-code (try-body node))
     (aif catch-clauses (collect-code (try-catch-clauses node))
	  (make-lisp-block catch-clauses)))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of basic-coder.lisp --
