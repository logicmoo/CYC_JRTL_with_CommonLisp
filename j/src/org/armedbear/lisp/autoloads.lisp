;;; autoloads.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: autoloads.lisp,v 1.41 2003-10-05 00:28:31 piso Exp $
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

(in-package "SYSTEM")

(autoload '(digit-char-p alphanumericp
            char/= char< char> char<= char>=
            char-not-equal)
          "chars.lisp")
(autoload '(string-upcase string-downcase string-capitalize
            nstring-upcase nstring-downcase nstring-capitalize
            string= string/= string-equal string-not-equal
            string< string>
            string<= string>=
            string-lessp string-greaterp
            string-not-lessp string-not-greaterp)
          "strings.lisp")
(autoload '(getf get-properties copy-symbol) "symbol.lisp")
(autoload '(open parse-integer))
(autoload '(sort merge) "sort.lisp")
(autoload 'tree-equal)
(autoload 'make-hash-table)
(autoload 'list-length)
(autoload 'copy-list)
(autoload 'revappend)
(autoload '(butlast nbutlast) "butlast.lisp")
(autoload 'ldiff)
(autoload '(subst subst-if subst-if-not nsubst nsubst-if nsubst-if-not)
          "subst.lisp")
(autoload '(sublis nsublis) "sublis.lisp")
(autoload '(member-if member-if-not) "member-if.lisp")
(autoload 'tailp)
(autoload 'adjoin)
(autoload '(union nunion
            intersection nintersection
            set-difference nset-difference
            set-exclusive-or nset-exclusive-or
            subsetp)
          "sets.lisp")
(autoload '(assoc assoc-if assoc-if-not rassoc rassoc-if rassoc-if-not
            acons pairlis copy-alist)
          "assoc.lisp")
(autoload '(mapc mapcan mapl maplist mapcon) "map1.lisp")
(autoload 'make-sequence)
(autoload '(copy-seq fill replace))
(autoload '(map map-into))
(autoload 'reduce)
(autoload '(delete delete-if delete-if-not) "delete.lisp")
(autoload '(remove remove-if remove-if-not) "remove.lisp")
(autoload '(remove-duplicates delete-duplicates))
(autoload '(substitute substitute-if substitute-if-not) "substitute.lisp")
(autoload '(nsubstitute nsubstitute-if nsubstitute-if-not) "nsubstitute.lisp")
(autoload '(position position-if position-if-not find find-if find-if-not)
          "find.lisp")
(autoload '(count count-if count-if-not) "count.lisp")
(autoload '(mismatch search))
(autoload 'make-string)
(autoload 'make-pathname)
(autoload '(signum floor ceiling round rem mod ftruncate ffloor fceiling fround
            rational rationalize gcd isqrt float-sign phase)
          "numbers.lisp")
(autoload 'boole)
(autoload '(byte byte-size byte-position ldb ldb-test dpb) "ldb.lisp")
(autoload 'lcm)
(autoload 'subtypep)
(autoload 'typep)
(autoload '(apropos apropos-list) "apropos.lisp")
(autoload '(write-string write-line) "write-string.lisp")
(autoload '(y-or-n-p yes-or-no-p) "query.lisp")
(autoload 'maphash)
(autoload 'write)
(autoload '(decode-universal-time get-decoded-time encode-universal-time)
          "time.lisp")

(autoload '(tpl::top-level-loop) "top-level.lisp")

(autoload-macro 'defstruct)
(autoload-macro 'with-hash-table-iterator)
(autoload-macro 'with-package-iterator)
(autoload-macro 'remf)
(autoload-macro 'define-condition)
(autoload-macro 'check-type)
(autoload-macro 'deftype)
(autoload-macro 'defclass)
(autoload-macro 'with-standard-io-syntax)

(autoload '(find-restart invoke-restart restart-name compute-restarts
            abort continue muffle-warning store-value use-value)
          "restart.lisp")
(autoload-macro '(with-simple-restart restart-bind restart-case
                  with-condition-restarts)
                "restart.lisp")
(autoload-macro 'do-all-symbols)
