;;; -*- mode: lisp; package: jnil.format -*-
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
;;; $Id: lisp-format.lisp,v 1.2 2006/05/23 22:09:31 tdias Exp $
;;;
;;; Description: Definition of the external represetation of basic lisp code
;;; (common to several dialects).
;;;
;;; -- start of lisp-format.lisp --

(in-package :jnil.format)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defcode lisp-unreadable (code))

(defmethod print-object ((obj lisp-unreadable) stream)
  (let ((unreadable-obj (lisp-unreadable-code obj)))
    (cond ((typep unreadable-obj 'lisp-unreadable) ; don't print recursive unreadability
           (format stream "~a" unreadable-obj))
          (t 
           (format stream "(")
           (print-unreadable-object (unreadable-obj stream)
             (format stream "~a ~w" (string (type-of unreadable-obj)) unreadable-obj))
           (format stream ")")))))

(defcode lisp-sexp (head rest)
  :format ("(~a~{ ~s~})" head rest)
  :constructor nil)

(defun make-lisp-sexp (head rest)
  (make-instance 'lisp-sexp :head head :rest (mklist rest)))

(defcode lisp-name (name)
  :format ("~a" name)
  :constructor nil)

(defun make-lisp-name (&rest args)
  (make-instance 'lisp-name :name (format nil "~{~a~}" args)))

(defmethod lisp-name= ((lisp-name-1 lisp-name) (lisp-name-2 lisp-name))
  (string= (slot-value lisp-name-1 'name) (slot-value lisp-name-2 'name)))

(defcode lisp-slot (name ?initform ?initarg ?type ?readers ?writers ?accessors ?allocation
                         ?documentation)
  :format ((concatenate 'string
             "(~a~:[ :initform ~w~;~*~]~@[ :initarg ~w~]~@[ :type ~w~]"
             "~{ :reader ~a~}~{ :writer ~a~}~{ :accessor ~a~}"
             "~@[ :allocation ~w~]~@[ :documentation ~w~])")
	   name (falsep initform) initform initarg type readers writers accessors
	   allocation documentation)
  :default-initargs (:initform false))

(defcode lisp-defclass (name supers slots body-decls)
  :format ("~:<defclass ~a (~{~a~^ ~})~1I~:@_(~2I~{~w~^~:@_~})~:>~:@_~{~:@_~w~^~&~}"
	   (list name supers slots) body-decls))

(defcode lisp-type (typespec var)
  :format ("(type ~w ~w)" typespec var))

(defcode lisp-declare (specifiers)
  :format ("(declare~{ ~w~})" specifiers))

(definline push-declare (declare-sexp lisp-declare)
  (push declare-sexp (lisp-declare-specifiers lisp-declare)))

(defcode lisp-defmethod (name class-spec varlist declares body)
  :format ((concatenate 'string 
             "~:<~:[defun~;defmethod~] ~a (~@[(this ~a)~:[~; ~]~-1*~]~{~a~^ ~})"
             "~1I~:[~*~;~:@_~w~]~@[~:@_~w~]~@[~:@_~w~]~:>")
           (list class-spec name class-spec varlist
                 (lisp-declare-specifiers declares) declares body)))

(defcode lisp-defsend (class name static-p varlist declares body)
  :format ((concatenate 'string 
             "~:<defsend ~a ~a~:[~; :static~] (~{~a~^ ~})~1I~:[~*~;~:@_~w~]~@[~:@_~w~]~@[~:@_~w~]~:>")
           (list class name static-p varlist (lisp-declare-specifiers declares) declares body)))

(defcode lisp-cond-clause (test body)
  :format ("~:<~w~:@_~w~:>" (list test body)))

(defcode lisp-cond-otherwise (body)
  :format ("(t ~w)" body)
  :extra-accessors (body lisp-cond-clause-body))

(defmethod lisp-cond-clause-body ((clause lisp-cond-otherwise))
  (lisp-cond-otherwise-body clause))

(defcode lisp-conditional)

(defcode lisp-cond (clauses)
  :format ("~:<cond ~5I~{~w~^~:@_~}~:>" (list clauses))
  :group lisp-conditional)

(defcode lisp-simple-cond (test then else)
  :format ("~:<cond (~w~5I~:@_~@[ ~w~])~@[~5I~:@_(t ~w)~]~:>" (list test then else))
  :group lisp-conditional)

(defcode lisp-if (test then else)
  :format ("~:<if ~w~3I~:@_~w~1I~:@_~w~:>" (list test then else))
  :group lisp-conditional)

(defcode lisp-when (test then)
  :format ("~:<when ~w~1I~@[~:@_~w~]~:>" (list test then))
  :group lisp-conditional)

(defcode lisp-setf (place newvalue)
  :format ("(setf ~s ~s)" place newvalue))

(defcode lisp-let* (bindings ?body)
  :format ("~:<let* (~6I~{~w~^~:@_~})~@[~1I~:@_~w~]~:>" (list bindings body)))

(defcode lisp-block (body)
  :format ("~<~{~w~^~:@_~}~:>" (list body)))

(defcode lisp-for-init (name val)
  :format ("~w = ~w" name val))

(defcode lisp-for (inits test updaters body)
  :format ((concatenate 'string
	     "~:<loop~@[ with~{ ~a~^ and~}~]~@[ while ~w~]~:[~;~3I~:@_do ~]~@[~w~:[~;~6I~:@_~:*~]~]"
	     "~@[~6I~{~w~^~:@_~}~]~:>")
	   (list inits test (or body updaters) body updaters)))

(defcode lisp-do (test body)
  :format ("~:<loop ~@[do ~w~3I~:@_~]while ~w~:>" (list body test)))

(defcode lisp-simple-do (var init incr test body)
  :format ("~:<do ((~w ~w (~a ~w)))~3I~:@_((not ~w))~1I~:@_~w~:>"
	   (list var init incr var test body)))

(defcode lisp-while (test body)
  :format ("~:<loop while ~w~@[~3I~:@_do ~w~]~:>" (list test body)))

(defcode lisp-case-statement (test body)
  :format ("~:<~w~@[ ~w~]~:>" (list test body)))

(defcode lisp-case (test statements)
  :format ("~:<case ~w~:@_~{~w~^~:@_~}~:>" (list test statements)))

(defcode lisp-slot-value (object slot-name)
  :format ("(slot-value ~a '~a)" object slot-name))

(defcode lisp-throw (exception args)
  :format ("(error '~w~{ ~s~})" exception args))

(defcode lisp-catch-clause (exception arg body)
  :format ("~:<~a (~a) ~1I~:@_~@[~w~]~:>" (list exception arg body)))

(defcode lisp-exception (try catch)
  :format ("~:<handler-case~4I~:@_(progn~5I~:@_~@[~w~])~3I~:@_~w~:>"
	   (list try catch)))

(defcode lisp-exception-finally (try catch finally)
  :format ("~:<unwind-protect~3I~:@_~:<handler-case~3I~:@_~w~1I~:@_~w~:>~1I~:@_~w~:>"
	   (list (list try catch) finally)))

(defcode lisp-array (literal-dim-p dim contents ?type)
  :format ((concatenate 'string
	     "(make-array ~:[(list ~;'(~]~{~w~^ ~})~@[ :element-type '~a~]"
	     "~@[ :initial-contents ~w~])")
           literal-dim-p dim type contents))

(defcode lisp-vector-matrix (literal-dim-p dim contents ?type)
  :format ((concatenate 'string
	     "(make-vector-matrix ~:[(list ~;'(~]~{~w~^ ~})~@[ :element-type '~a~]"
	     "~@[ :initial-contents ~w~])")
	   literal-dim-p dim type contents))

(defcode lisp-dotimes (var count-form body)
  :format ("~:<dotimes (~a ~w)~@[~1I~:@_~w~]~:>" (list var count-form body)))

(defcode lisp-hex (number)
  :format ("#x~x" number))

(defcode lisp-octal (number)
  :format ("#o~o" number))

(defcode lisp-the (type value)
  :format ("(the ~a~@[ ~s~])" type value))

(defcode lisp-postfix (type form)
  :format ("(prog1 ~s (~a ~s))" form type form))

(defcode lisp->>> (form shift)
  :format ("(mask-field (byte ~a 0) (ash ~a (- ~a)))"
	   (if (numberp shift) (- 32 shift) `(- 32 ,shift)) form shift))

(defcode lisp-package (name support-lib-p)
  :format ("~&(defpackage :~a~:[~;~2I~:@_(:use :common-lisp :jnil.lib)~:@_(:export)~0I~])~&(in-package :~a)"
           name support-lib-p name))

(defcode lisp-source (package imports types)
  :format ("~@[~w~&~%~]~@[~{~&;;;~w~}~&~%~]~{~w~&~^~%~}" 
           package imports types))

(defcode lisp-typep (obj type)
  :format ("(typep ~a '~a)" obj type))

(defcode lisp-named-block (name body)
  :format ("~:<block ~a~1I~:@_~w~:>" (list name body)))

(defcode lisp-tagbody (name body)
  :format ("~:<tagbody ~a~1I~:@_~{~w~^~:@_~}~:>" (list name body)))

(defcode lisp-concat (args)
  :format ("(format nil \"~~{~~a~~}\" (list~{ ~w~}))" args))

(defcode lisp-continue (label)
  :format ("(continue~@[ '~a~])" label))

(defcode lisp-return-from (name result)
  :format ("(return-from ~a~@[ ~w~])" name result))

(defcode lisp-princ (msg stream)
  :format ("(princ ~w~@[ ~a~])" msg stream))

(defcode lisp-quoted-form (form)
  :format ("'~w" form))

(defcode lisp-keyword (name)
  :format (":~a" name))

(defcode lisp-new (class initializer args)
  :format ("(make-initialized-instance '~a #'~a~{~^ ~w~})" class initializer args))

(defcode lisp-default-new (class)
  :format ("(make-instance '~a)" class))

(defcode lisp-send (receiver method-name args)
  :format ("(send ~w '~w~{ ~w~})" receiver method-name args))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export
   '(lisp-unreadable make-lisp-unreadable lisp-unreadable-code lisp-sexp
     make-lisp-sexp lisp-sexp-head lisp-sexp-rest lisp-name make-lisp-name lisp-name-name lisp-name=
     lisp-slot make-lisp-slot lisp-slot-name lisp-slot-writers lisp-slot-readers lisp-slot-initform
     lisp-slot-type lisp-defclass make-lisp-defclass lisp-type make-lisp-type lisp-declare
     make-lisp-declare push-declare lisp-defmethod make-lisp-defmethod lisp-defmethod-name
     lisp-defmethod-class-spec lisp-defmethod-varlist lisp-defmethod-declares
     lisp-defmethod-body lisp-defsend make-lisp-defsend lisp-defsend-name
     lisp-defsend-class lisp-defsend-varlist lisp-defsend-declares lisp-defsend-body
     lisp-simple-cond make-lisp-simple-cond lisp-simple-cond-test 
     lisp-simple-cond-then lisp-simple-cond-else lisp-cond-clause make-lisp-cond-clause
     lisp-cond-clause-test lisp-cond-clause-body lisp-cond-otherwise make-lisp-cond-otherwise
     lisp-cond-otherwise-body lisp-cond make-lisp-cond lisp-cond-clauses
     lisp-setf make-lisp-setf lisp-let* make-lisp-let* lisp-let*-bindings lisp-let*-body lisp-block
     make-lisp-block lisp-block-body lisp-for-init make-lisp-for-init lisp-for-init-name lisp-for
     make-lisp-for lisp-do make-lisp-do lisp-simple-do make-lisp-simple-do lisp-while
     make-lisp-while lisp-case make-lisp-case lisp-case-statements lisp-case-statement
     make-lisp-case-statement lisp-case-statement-body lisp-throw make-lisp-throw lisp-slot-value
     make-lisp-slot-value lisp-catch-clause make-lisp-catch-clause lisp-exception
     make-lisp-exception lisp-exception-finally make-lisp-exception-finally lisp-array
     make-lisp-array lisp-array-type lisp-vector-matrix make-lisp-vector-matrix
     lisp-array-vector-matrix lisp-when make-lisp-when lisp-when-test lisp-when-then lisp-if
     make-lisp-if lisp-if-test lisp-if-then lisp-if-else lisp-dotimes make-lisp-dotimes
     lisp-dotimes-var lisp-dotimes-count-form lisp-dotimes-body lisp-hex make-lisp-hex
     lisp-hex-number lisp-octal make-lisp-octal lisp-octal-number lisp-the make-lisp-the
     lisp-the-type lisp-the-value lisp-postfix make-lisp-postfix lisp-postfix-type lisp-postfix-form
     lisp->>> make-lisp->>> lisp->>>-form lisp->>>-shift lisp-package make-lisp-package
     lisp-package-name lisp-source make-lisp-source lisp-source-package lisp-source-imports
     lisp-source-types lisp-typep make-lisp-typep lisp-typep-obj lisp-typep-type lisp-named-block
     make-lisp-named-block lisp-named-block-name lisp-named-block-body lisp-tagbody
     make-lisp-tagbody lisp-tagbody-name lisp-tagbody-body lisp-concat make-lisp-concat
     lisp-concat-args lisp-continue make-lisp-continue lisp-continue-label lisp-return-from
     make-lisp-return-from lisp-return-from-name lisp-return-from-result lisp-conditional lisp-princ
     make-lisp-princ lisp-princ-msg lisp-princ-stream lisp-quoted-form make-lisp-quoted-form
     lisp-quoted-form-form lisp-keyword make-lisp-keyword lisp-keyword-name lisp-new make-lisp-new
     lisp-new-expand-macro-p lisp-new-class lisp-new-initializer lisp-new-args lisp-default-new
     make-lisp-default-new lisp-default-new-class lisp-send make-lisp-send lisp-send-receiver
     lisp-send-method-name lisp-send-args)
   'jnil.format))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of lisp-format.lisp --
