;;; known-functions.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: known-functions.lisp,v 1.6 2005-05-16 01:51:56 piso Exp $
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

(declaim (ftype (function (t t) t) gethash-2op-1ret))
(declaim (ftype (function (t) symbol) make-keyword))

(declaim (ftype (function * list)
                backq-list backq-list* backq-append backq-nconc
                class-precedence-list))

(declaim (ftype (function * cons) backq-cons))

(declaim
 (ftype (function * t)
        replace simple-search fill nstring-upcase random
        ldb-test
        complex conjugate
        reduce
        vector
        aset
        oddp
        bit-and bit-andc1 bit-andc2 bit-eqv bit-ior bit-nand bit-nor
        bit-not bit-orc1 bit-orc2 bit-xor
        array-has-fill-pointer-p
        phase
        scale-float
        char-equal
        string<=
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

(declaim
 (ftype (function (real real) real)
        mod rem))

(declaim (ftype (function number rational) rational rationalize))

(declaim (ftype (function * bit) bit sbit))

(provide '#:known-functions)
