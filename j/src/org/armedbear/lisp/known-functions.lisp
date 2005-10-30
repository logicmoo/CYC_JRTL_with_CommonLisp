;;; known-functions.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: known-functions.lisp,v 1.27 2005-10-30 01:19:03 piso Exp $
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

(declaim (ftype (function * symbol) copy-symbol gensym))
(declaim (ftype (function * symbol) fdefinition-block-name))

(declaim (ftype (function (t t) t) gethash-2op-1ret))
(declaim (ftype (function (t) symbol) make-keyword))

(declaim (ftype (function * list)
                backq-list backq-list* backq-append backq-nconc
                class-precedence-list))

(declaim (ftype (function * cons) backq-cons))

(declaim (ftype (function (character) character) char-downcase char-upcase))

(declaim (ftype (function * t) finish-output force-output clear-output terpri fresh-line))

(declaim (ftype (function (symbol) string) symbol-name))

(declaim
 (ftype (function * string)
        get-output-stream-string
        nstring-capitalize
        nstring-downcase
        nstring-upcase
        string-capitalize
        string-downcase
        string-upcase
        write-line
        write-string
        ))

(declaim
 (ftype (function * t)
        %failed-aver
        %ldb
        %make-structure
        %method-function
        %put
        %set-cddr
        %set-schar
        %set-std-slot-value
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
        oddp
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
        second
        set
        setf-function-name-p
        seventh
        simple-condition-format-arguments
        simple-condition-format-control
        simple-search
        simple-typep
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
        zerop
        ))

(declaim
 (ftype (function * integer)
        deposit-field dpb logand logcount lognor
        mask-field
        numerator denominator
        boole
        array-dimension
        %dpb
        ))

(declaim (ftype (function (t) (integer 0 2147483647)) sxhash))

(declaim (ftype (function (character) (unsigned-byte 16)) char-code))

(declaim (ftype (function (simple-string index) character) schar))

(declaim (ftype (function * character) char write-char))

(declaim
 (ftype (function * t)
        char= char/= char< char> char<= char>= char-equal char-not-equal
        char-lessp char-greaterp char-not-greaterp char-not-lessp))

(declaim
 (ftype (function (real real) real)
        mod rem))

(declaim (ftype (function (number) rational) rational rationalize))

(declaim (ftype (function * bit) bit sbit))

(declaim (ftype (function * function) make-macro))

(declaim (ftype (function * t) %set-arglist))

(declaim (ftype (function * t) %type-error check-sequence-bounds))

(declaim (ftype (function * t) out-synonym-of))

(declaim
 (ftype (function * t)
        error
        compiler-style-warn
        compiler-warn
        compiler-error
        compiler-unsupported))

(declaim (ftype (function (symbol) function) resolve))

(declaim (ftype (function (symbol) t) boundp))

(declaim (ftype (function (string fixnum character) character) %set-char))

(declaim (ftype (function (t t t) t) set-function-info-value))

(declaim (ftype (function * hash-table) make-hash-table))

(defknown open * (or stream null))

(defknown make-string-input-stream * stream)

(provide '#:known-functions)
