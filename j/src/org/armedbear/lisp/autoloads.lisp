;;; autoloads.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: autoloads.lisp,v 1.103 2004-02-02 02:16:50 piso Exp $
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
            string-not-lessp string-not-greaterp
            string-left-trim string-right-trim string-trim)
          "strings.lisp")
(autoload 'copy-symbol)
(autoload '(open parse-integer))
(autoload '(sort stable-sort merge) "sort.lisp")
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
(autoload '(pathname-host pathname-device pathname-directory pathname-name
            pathname-type wild-pathname-p)
          "pathnames.lisp")
(autoload 'directory "directory.lisp")
(autoload '(signum floor ceiling round rem mod ftruncate ffloor fceiling fround
            rational rationalize gcd isqrt float-sign phase cis)
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
(autoload 'write-to-string)
(autoload '(decode-universal-time get-decoded-time encode-universal-time)
          "time.lisp")
(autoload 'gentemp)
(autoload '(bit-and bit-ior bit-xor bit-eqv bit-nand bit-nor bit-andc1
            bit-andc2 bit-orc1 bit-orc2 bit-not)
          "bit-array-ops.lisp")
(autoload 'deposit-field)
(autoload 'mask-field)
(autoload '(ensure-generic-function subclassp make-condition) "clos.lisp")
(autoload 'inspect)

(autoload '(tpl::top-level-loop) "top-level.lisp")

(autoload-macro 'defstruct)
(autoload-macro 'with-hash-table-iterator)
(autoload-macro 'with-package-iterator)
(autoload-macro 'remf)
(autoload-macro 'check-type)
(autoload-macro 'deftype)
(autoload-macro '(defclass defgeneric defmethod define-condition) "clos.lisp")
(autoload-macro 'with-standard-io-syntax)
(autoload-macro 'psetf)
(autoload-macro 'shiftf)
(autoload-macro 'formatter "format.lisp")

(autoload '(find-restart invoke-restart restart-name compute-restarts
            abort continue muffle-warning store-value use-value warn cerror)
          "restart.lisp")
(autoload-macro '(with-simple-restart restart-bind restart-case
                  with-condition-restarts)
                "restart.lisp")
(autoload-macro 'do-all-symbols)
(autoload-macro '(trace untrace) "trace.lisp")
(autoload-macro 'define-symbol-macro)
(autoload-macro 'with-slots)
(autoload-macro 'with-accessors)
(autoload-macro 'print-unreadable-object)
(autoload 'print-object)
(autoload-macro '(prog prog*) "prog.lisp")
(autoload 'concatenate)
(autoload 'parse-lambda-list)
(autoload-macro 'assert)
(autoload 'logical-pathname-translations)
(autoload-macro 'with-input-from-string)
(autoload-macro 'with-output-to-string)
(autoload 'ensure-directories-exist)
(autoload 'coerce)
(autoload 'read-sequence)
(autoload 'write-sequence)
(autoload 'make-load-form-saving-slots)
(autoload 'compile-file)
(autoload '(pprint pprint-logical-block) "pprint.lisp")
(autoload '(write-byte read-byte) "byte-io.lisp")
(autoload-macro 'with-open-file)

;; Java interface.
(in-package "JAVA")
(export 'jregister-handler "JAVA")
(autoload 'jregister-handler "java.lisp")
(export 'jclass-name "JAVA")
(autoload 'jclass-name "java.lisp")
(export 'jobject-class "JAVA")
(autoload 'jobject-class "java.lisp")
(export 'jclass-superclass "JAVA")
(autoload 'jclass-superclass "java.lisp")
(export 'jclass-interfaces "JAVA")
(autoload 'jclass-interfaces "java.lisp")
(export 'jclass-interface-p "JAVA")
(autoload 'jclass-interface-p "java.lisp")
(export 'jclass-superclass-p "JAVA")
(autoload 'jclass-superclass-p "java.lisp")
(export 'jclass-array-p "JAVA")
(autoload 'jclass-array-p "java.lisp")
(export 'jarray-component-type "JAVA")
(autoload 'jarray-component-type "java.lisp")
(export 'jnew-array-from-array "JAVA")
(autoload 'jnew-array-from-array "java.lisp")
(export 'jclass-constructors "JAVA")
(autoload 'jclass-constructors "java.lisp")
(export 'jconstructor-params "JAVA")
(autoload 'jconstructor-params "java.lisp")
(export 'jclass-fields "JAVA")
(autoload 'jclass-fields "java.lisp")
(export 'jfield-type "JAVA")
(autoload 'jfield-type "java.lisp")
(export 'jfield-name "JAVA")
(autoload 'jfield-name "java.lisp")
(export 'jclass-methods "JAVA")
(autoload 'jclass-methods "java.lisp")
(export 'jmethod-params "JAVA")
(autoload 'jmethod-params "java.lisp")
(export 'jmethod-return-type "JAVA")
(autoload 'jmethod-return-type "java.lisp")
(export 'jmethod-name "JAVA")
(autoload 'jmethod-name "java.lisp")
(export 'jinstance-of-p "JAVA")
(autoload 'jinstance-of-p "java.lisp")
(export 'jmember-static-p "JAVA")
(autoload 'jmember-static-p "java.lisp")
(export 'jmember-public-p "JAVA")
(autoload 'jmember-public-p "java.lisp")
(export 'jnew-runtime-class "JAVA")
(autoload 'jnew-runtime-class "runtime-class.lisp")
(export 'jredefine-method "JAVA")
(autoload 'jredefine-method "runtime-class.lisp")
(export 'jruntime-class-exists-p "JAVA")
(autoload 'jruntime-class-exists-p "runtime-class.lisp")

;; Profiler.
(in-package "PROFILER")
(export '(*granularity* show-call-counts with-profiling))
(autoload 'show-call-counts "profiler.lisp")
(autoload-macro 'with-profiling "profiler.lisp")

;; Extensions.
(in-package "EXTENSIONS")
(export 'simple-search)
(autoload 'simple-search "search.lisp")
(export 'run-shell-command)
(autoload 'run-shell-command)

;; JVM compiler.
(in-package "JVM")
(export '(jvm-compile jvm-compile-package))
(autoload '(jvm-compile jvm-compile-package) "jvm.lisp")
