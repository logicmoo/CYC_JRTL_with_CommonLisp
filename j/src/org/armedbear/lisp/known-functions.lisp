;;; known-functions.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: known-functions.lisp,v 1.16 2005-07-10 15:18:39 piso Exp $
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

(declaim (ftype (function * symbol) copy-symbol gensym))
(declaim (ftype (function * symbol) fdefinition-block-name))

(declaim (ftype (function (t t) t) gethash-2op-1ret))
(declaim (ftype (function (t) symbol) make-keyword))

(declaim (ftype (function * list)
                backq-list backq-list* backq-append backq-nconc
                class-precedence-list))

(declaim (ftype (function * cons) backq-cons))

(declaim (ftype (function * string) write-string))

(declaim (ftype (function (symbol) string) symbol-name))

(declaim (ftype (function (character) character) char-downcase char-upcase))

(declaim (ftype (function * t) finish-output terpri fresh-line))

(declaim
 (ftype (function * t)
        %failed-aver
        %make-structure
        %set-cddr
        %stream-terpri
        %stream-write-char
        %structure-ref
        %structure-set
        %svset
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
        caadr
        char-equal
        characterp
        charpos
        close
        coerce
        coerce-to-function
        compile-file-pathname
        complex conjugate
        directory-namestring
        enough-namestring
        every
        file-directory-p
        file-namestring
        file-position
        fill
        fmakunbound
        get-internal-real-time
        getf
        hash-table-p
        host-namestring
        intersection
        ldb-test
        load-compiled-function
        merge-pathnames
        namestring
        namestring
        neq
        nintersection
        nstring-upcase
        nsubst
        nsubst-if
        nsubst-if-not
        oddp
        pathname-type
        pathname-type
        pathnamep
        phase
        probe-file
        random
        read
        reduce
        replace
        scale-float
        set
        simple-search
        simple-typep
        some
        stream-line-number
        string<=
        subst
        subst-if
        subst-if-not
        truename
        vector
        vectorp
        ))

(declaim
 (ftype (function * integer)
        deposit-field dpb logand logcount lognor
        mask-field
        numerator denominator
        boole
        array-dimension
        char-code
        %dpb
        ))

(declaim (ftype (function (character) (unsigned-byte 16)) char-code))

(declaim (ftype (function * character) char schar))

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

(provide '#:known-functions)
