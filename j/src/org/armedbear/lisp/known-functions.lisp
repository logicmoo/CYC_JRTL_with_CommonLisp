;;; known-functions.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: known-functions.lisp,v 1.38 2005-12-17 00:47:24 piso Exp $
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

(require '#:compiler-types)

;; (declaim (ftype (function * symbol) copy-symbol gensym))
;; (declaim (ftype (function * symbol) fdefinition-block-name))
(defknown (copy-symbol gensym fdefinition-block-name) * symbol)

;; (declaim (ftype (function (t t) t) gethash1))
(defknown gethash1 (t t) t)
;; (declaim (ftype (function (t) symbol) make-keyword))
(defknown make-keyword (t) symbol)

;; (declaim (ftype (function * list)
;;                 backq-list backq-list* backq-append backq-nconc
;;                 %class-precedence-list))
(defknown (backq-list backq-list* backq-append backq-nconc %class-precedence-list)
  * list)

;; (declaim (ftype (function * cons) backq-cons))
(defknown backq-cons * cons)

;; (declaim (ftype (function (character) character) char-downcase char-upcase))
(defknown (char-downcase char-upcase) (character) character)

;; (declaim (ftype (function * t) finish-output force-output clear-output terpri fresh-line))
(defknown (finish-output force-output clear-output terpri fresh-line) * t)

;; (declaim (ftype (function (symbol) string) symbol-name))
(defknown symbol-name (symbol) string)

;; (declaim
;;  (ftype (function * string)
;;         get-output-stream-string
;;         nstring-capitalize
;;         nstring-downcase
;;         nstring-upcase
;;         string-capitalize
;;         string-downcase
;;         string-upcase
;;         write-line
;;         write-string
;;         ))
(defknown (get-output-stream-string
           nstring-capitalize
           nstring-downcase
           nstring-upcase
           string-capitalize
           string-downcase
           string-upcase
           write-line
           write-string) * string)

(defknown (%failed-aver
           %ldb
           %make-structure
           %method-function
           %put
           %set-cddr
           %set-schar
           %stream-terpri
           %stream-write-char
           alphanumericp
           array-has-fill-pointer-p
           aset
           bit-and
           bit-andc1
           bit-andc2
           bit-eqv
           bit-ior
           bit-nand
           bit-nor
           bit-not
           bit-orc1
           bit-orc2
           bit-xor
           both-case-p
           built-in-function-p
           caadr
           char-equal
           characterp
           charpos
           close
           coerce
           coerce-to-function
           compile-file-pathname
           complex
           conjugate
           count
           count-if
           count-if-not
           delete-file
           directory-namestring
           eighth
           enough-namestring
           every
           fifth
           file-directory-p
           file-namestring
           file-position
           fill
           first
           float
           fmakunbound
           fourth
           fset
           ftype-result-type
           get-internal-real-time
           getf
           hash-table-count
           hash-table-p
           host-namestring
           intersection
           ldb
           ldb-test
           list-all-packages
           load-compiled-function
           lower-case-p
           make-string-output-stream
           make-structure
           map
           merge-pathnames
           namestring
           neq
           nintersection
           ninth
           normalize-type
           nsubst
           nsubst-if
           nsubst-if-not
           nth
           pathname-type
           pathname-type
           pathnamep
           phase
           probe-file
           proclaimed-ftype
           random
           read
           read-char
           read-sequence
           reduce
           replace
           rest
           scale-float
           search
           second
           set
           set-std-slot-value
           setf-function-name-p
           seventh
           simple-condition-format-arguments
           simple-condition-format-control
           simple-search
           sixth
           some
           sort
           stable-sort
           std-slot-value
           stream-element-type
           stream-line-number
           string<=
           structure-ref
           structure-set
           subst
           subst-if
           subst-if-not
           svref
           svset
           tenth
           third
           truename
           upper-case-p
           vector
           vectorp
           write-byte
           write-sequence
           zerop)
  * t)

(defknown (deposit-field dpb logand logcount lognor
                         mask-field
                         numerator denominator
                         boole
                         array-dimension
                         %dpb)
  * integer)

;; (declaim (ftype (function (t) (integer 0 2147483647)) sxhash))
(defknown sxhash (t) (integer 0 2147483647))

;; (declaim (ftype (function (character) (unsigned-byte 16)) char-code))
(defknown char-code (character) (unsigned-byte 16))

;; (declaim (ftype (function (simple-string index) character) schar))
(defknown schar (simple-string index) character)

;; (declaim (ftype (function * character) char write-char))
(defknown (char write-char) * character)

(defknown (char= char/= char< char> char<= char>= char-equal char-not-equal
                 char-lessp char-greaterp char-not-greaterp char-not-lessp)
  * t)

;; (declaim
;;  (ftype (function (real real) real)
;;         mod rem))
(defknown (mod rem) (real real) real)

;; (declaim (ftype (function (number) rational) rational rationalize))
(defknown (rational rationalize) (number) rational)

;; (declaim (ftype (function * bit) bit sbit))
(defknown (bit sbit) * bit)

;; (declaim (ftype (function * function) make-macro))
(defknown make-macro * function)

;; (declaim (ftype (function * t) %set-arglist))
(defknown %set-arglist * t)

;; (declaim (ftype (function * t) %type-error check-sequence-bounds))
(defknown (%type-error check-sequence-bounds) * t)

;; (declaim (ftype (function * t) out-synonym-of))
(defknown out-synonym-of * t)

(defknown (error
           compiler-style-warn
           compiler-warn
           compiler-error
           compiler-unsupported)
  * t)

;; (declaim (ftype (function (symbol) function) resolve))
(defknown resolve (symbol) function)

;; (declaim (ftype (function (string fixnum character) character) %set-char))
(defknown %set-char (string index character) character)

;; (declaim (ftype (function (t t t) t) set-function-info-value))
(defknown set-function-info-value (t t t) t)

;; (declaim (ftype (function * hash-table) make-hash-table))
(defknown make-hash-table * hash-table)

(defknown %class-slots (class) t)
(defknown set-class-slots (class list) t)
(defknown %slot-definition-name * t)
(defknown %slot-definition-initargs * t)
(defknown %slot-definition-initfunction * t)
(defknown std-slot-boundp * t)
(defknown std-slot-value * t)
(defknown set-std-slot-value * t)
(defknown open * (or stream null))
(defknown make-string-input-stream * stream)

;; Boolean predicates that can return unboxed Java booleans.
(defknown (
           arrayp
           atom
           consp
           constantp
           endp
           evenp
           floatp
           integerp
           listp
           minusp
           numberp
           oddp
           packagep
           plusp
           rationalp
           readtablep
           realp
           simple-bit-vector-p
           simple-typep
           simple-vector-p
           stringp
           symbolp
           typep
           zerop
           ;; Internal symbols.
           sys::%typep
           )
  (t) boolean)

;; Boolean predicates that can not (currently) return unboxed Java booleans.
(defknown (
           bit-vector-p
           compiled-function-p
           complexp
           fboundp
           functionp
           keywordp
           simple-string-p
           typep
           )
  (t) t)

(defknown (boundp special-operator-p special-variable-p)
  (symbol) t)

;; Boolean comparison operators.
(defknown (
           /=
           <
           <=
           =
           >
           >=
           eq
           eql
           equal
           equalp
           )
  * boolean)

;; Moved here from jvm.lisp.
(defknown (+ - * /
             1+ 1-
             car cdr caar cadr cdar cddr cadar caddr cdddr cddddr
             first second third
             length
             list list*
             macro-function
             compiler-macro-function
             sys::%defun
             get
             fdefinition
             array-dimensions array-rank array-total-size
             array-element-type upgraded-array-element-type
             row-major-aref
             quote function
             mapcar
             find position
             append nconc subseq adjoin
             revappend nreconc
             copy-seq
             assoc assoc-if assoc-if-not acons assq assql
             code-char char-int digit-char-p
             member ext:memq
             remove remove-if remove-if-not delete delete-if delete-if-not
             symbol-function
             coerce
             reverse nreverse
             last
             cons rplaca rplacd
             sys::set-car sys::set-cdr
             copy-list copy-tree
             make-sequence make-list make-array make-package
             make-string
             find-package
             pathname make-pathname pathname-name directory
             package-used-by-list package-shadowing-symbols
             nthcdr
             aref elt
             not null concatenate
             format sys::%format
             prin1 princ print write
             compute-restarts find-restart restart-name
             string
             string=
             setq
             multiple-value-list push pop
             type-of class-of
             abs
             ash
             float-radix
             logand logandc1 logandc2 logeqv logior lognand
             lognot logorc1 logorc2 logxor
             logbitp
             slot-boundp slot-value slot-exists-p
             allocate-instance
             find-class
             class-name
             constantly
             exp expt log
             min max
             realpart imagpart
             integer-length
             sqrt isqrt gcd lcm signum
             open
             svref
             fill-pointer
             symbol-value symbol-package package-name
             fourth
             vector-push vector-push-extend
             union nunion
             remove-duplicates delete-duplicates
             read-byte
             fresh-line terpri
             lambda
             ext:classp
             ext:fixnump
             ext:memql
             sys:%generic-function-name
             sys::puthash
             precompiler::precompile1
             declare
             go
             inst
             emit
             label
             maybe-emit-clear-values
             single-valued-p
             sys:read-8-bits
             sys:write-8-bits
             sys::require-type
             sys::arg-count-error
             sys:subclassp
             ext:autoloadp)
  * t)

(defknown lookup-known-symbol (symbol) t)
(defknown %class-name (class) symbol)

(provide '#:known-functions)
