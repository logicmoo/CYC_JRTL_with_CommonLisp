;;; autoloads.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: autoloads.lisp,v 1.135 2004-04-04 00:29:43 piso Exp $
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

(autoload '(digit-char-p alphanumericp char/= char< char> char>= char-not-equal)
          "chars")
(autoload '(string-upcase string-downcase string-capitalize
            nstring-upcase nstring-downcase nstring-capitalize
            string= string/= string-equal string-not-equal
            string< string>
            string<= string>=
            string-lessp string-greaterp
            string-not-lessp string-not-greaterp
            string-left-trim string-right-trim string-trim)
          "strings")
(autoload 'copy-symbol)
(autoload '(open parse-integer))
(autoload '(sort stable-sort merge) "sort")
(autoload 'tree-equal)
(autoload 'make-hash-table)
(autoload 'list-length)
(autoload 'copy-list)
(autoload 'revappend)
(autoload '(butlast nbutlast) "butlast")
(autoload 'ldiff)
(autoload '(subst subst-if subst-if-not nsubst nsubst-if nsubst-if-not)
          "subst")
(autoload '(sublis nsublis) "sublis")
(autoload '(member-if member-if-not) "member-if")
(autoload 'tailp)
(autoload 'adjoin)
(autoload '(union nunion
            intersection nintersection
            set-difference nset-difference
            set-exclusive-or nset-exclusive-or
            subsetp)
          "sets")
(autoload '(assoc assoc-if assoc-if-not rassoc rassoc-if rassoc-if-not
            acons pairlis copy-alist)
          "assoc")
(autoload '(mapc mapcan mapl maplist mapcon) "map1")
(autoload 'make-sequence)
(autoload '(copy-seq fill replace))
(autoload '(map map-into))
(autoload 'reduce)
(autoload '(delete delete-if delete-if-not) "delete")
(autoload '(remove remove-if remove-if-not) "remove")
(autoload '(remove-duplicates delete-duplicates))
(autoload '(substitute substitute-if substitute-if-not) "substitute")
(autoload '(nsubstitute nsubstitute-if nsubstitute-if-not) "nsubstitute")
(autoload '(position position-if position-if-not find find-if find-if-not)
          "find")
(autoload '(count count-if count-if-not) "count")
(autoload '(mismatch search))
(autoload 'make-string)
(autoload '(pathname-host pathname-device pathname-directory pathname-name
            pathname-type wild-pathname-p)
          "pathnames")
(autoload 'directory "directory")
(autoload '(signum ceiling round ffloor fceiling fround rational rationalize
            gcd isqrt float-precision float-sign decode-float conjugate phase cis)
          "numbers")
(autoload 'boole)
(autoload '(byte byte-size byte-position %ldb ldb ldb-test dpb) "ldb")
(autoload 'lcm)
(autoload '(apropos apropos-list) "apropos")
(autoload '(write-string write-line) "write-string")
(autoload '(y-or-n-p yes-or-no-p) "query")
(autoload 'maphash)
(autoload 'write)
(autoload 'write-to-string)
(autoload '(decode-universal-time get-decoded-time encode-universal-time)
          "time")
(autoload 'gentemp)
(autoload '(bit-and bit-ior bit-xor bit-eqv bit-nand bit-nor bit-andc1
            bit-andc2 bit-orc1 bit-orc2 bit-not)
          "bit-array-ops")
(autoload 'deposit-field)
(autoload 'mask-field)
(autoload '(ensure-generic-function subclassp make-condition
            define-method-combination)
          "clos")
(autoload 'inspect)
(autoload 'enough-namestring)
(autoload 'upgraded-complex-part-type)

(autoload '(tpl::top-level-loop) "top-level")

(autoload-macro 'defstruct)
(autoload-macro 'with-hash-table-iterator)
(autoload-macro 'with-package-iterator)
(autoload-macro 'remf)
(autoload-macro 'check-type)
(autoload-macro 'deftype)
(autoload-macro '(defclass defgeneric defmethod define-condition) "clos")
(autoload-macro 'with-standard-io-syntax)
(autoload-macro 'psetf)
(autoload-macro 'shiftf)
(autoload-macro 'formatter "format")

(autoload '(find-restart invoke-restart restart-name compute-restarts
            abort continue muffle-warning store-value use-value warn cerror)
          "restart")
(autoload-macro '(with-simple-restart restart-bind restart-case
                  with-condition-restarts)
                "restart")
(autoload-macro 'do-all-symbols)
(autoload-macro '(trace untrace) "trace")
(autoload-macro 'define-symbol-macro)
(autoload-macro 'with-slots)
(autoload-macro 'with-accessors)
(autoload-macro 'print-unreadable-object)
(autoload 'print-object)
(autoload-macro '(prog prog*) "prog")
(autoload 'concatenate)
(autoload 'parse-lambda-list)
(autoload-macro 'assert)
(autoload-macro 'with-input-from-string)
(autoload-macro 'with-output-to-string)
(autoload 'ensure-directories-exist)
(autoload 'coerce)
(autoload 'read-sequence)
(autoload 'write-sequence)
(autoload 'make-load-form-saving-slots)
(autoload '(compile-file compile-file-pathname) "compile-file")
(autoload '(pprint pprint-logical-block copy-pprint-dispatch) "pprint")
(autoload '(write-byte read-byte) "byte-io")
(autoload-macro 'with-open-file)
(autoload 'translate-logical-pathname)
(autoload 'parse-namestring)
(autoload 'make-string-output-stream)
(autoload 'find-all-symbols)
(autoload 'dribble)
(autoload-macro 'step)
(autoload 'load)

(autoload-macro '(case ccase ecase typecase ctypecase etypecase) "case")
(autoload-macro '(and cond dolist dotimes
                  do-symbols do-external-symbols
                  multiple-value-bind multiple-value-list multiple-value-setq
                  nth-value
                  or))

;; Java interface.
(in-package "JAVA")
(export 'jregister-handler "JAVA")
(autoload 'jregister-handler "java")
(export 'jclass-name "JAVA")
(autoload 'jclass-name "java")
(export 'jobject-class "JAVA")
(autoload 'jobject-class "java")
(export 'jclass-superclass "JAVA")
(autoload 'jclass-superclass "java")
(export 'jclass-interfaces "JAVA")
(autoload 'jclass-interfaces "java")
(export 'jclass-interface-p "JAVA")
(autoload 'jclass-interface-p "java")
(export 'jclass-superclass-p "JAVA")
(autoload 'jclass-superclass-p "java")
(export 'jclass-array-p "JAVA")
(autoload 'jclass-array-p "java")
(export 'jarray-component-type "JAVA")
(autoload 'jarray-component-type "java")
(export 'jnew-array-from-array "JAVA")
(autoload 'jnew-array-from-array "java")
(export 'jclass-constructors "JAVA")
(autoload 'jclass-constructors "java")
(export 'jconstructor-params "JAVA")
(autoload 'jconstructor-params "java")
(export 'jclass-fields "JAVA")
(autoload 'jclass-fields "java")
(export 'jfield-type "JAVA")
(autoload 'jfield-type "java")
(export 'jfield-name "JAVA")
(autoload 'jfield-name "java")
(export 'jclass-methods "JAVA")
(autoload 'jclass-methods "java")
(export 'jmethod-params "JAVA")
(autoload 'jmethod-params "java")
(export 'jmethod-return-type "JAVA")
(autoload 'jmethod-return-type "java")
(export 'jmethod-name "JAVA")
(autoload 'jmethod-name "java")
(export 'jinstance-of-p "JAVA")
(autoload 'jinstance-of-p "java")
(export 'jmember-static-p "JAVA")
(autoload 'jmember-static-p "java")
(export 'jmember-public-p "JAVA")
(autoload 'jmember-public-p "java")
(export 'jnew-runtime-class "JAVA")
(autoload 'jnew-runtime-class "runtime-class")
(export 'jredefine-method "JAVA")
(autoload 'jredefine-method "runtime-class")
(export 'jruntime-class-exists-p "JAVA")
(autoload 'jruntime-class-exists-p "runtime-class")

;; Profiler.
(in-package "PROFILER")
(export '(*granularity* show-call-counts with-profiling))
(autoload 'show-call-counts "profiler")
(autoload-macro 'with-profiling "profiler")

;; Extensions.
(in-package "EXTENSIONS")
(export 'simple-search)
(autoload 'simple-search "search")
(export 'run-shell-command)
(autoload 'run-shell-command)
(export 'make-socket)
(autoload 'make-socket)

;; JVM compiler.
(in-package "JVM")
(export '(jvm-compile jvm-compile-package))
;; (autoload '(jvm-compile jvm-compile-package) "jvm")
