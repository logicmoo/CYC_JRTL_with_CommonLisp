;;; compile-system.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: compile-system.lisp,v 1.15 2004-06-13 17:48:39 asimon Exp $
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

(require '#:loop)
(require '#:collect)
(require '#:format) ;; Replace the version of FORMAT from Primitives.java.
(require '#:jvm)

(defun compile-system ()
  (loop
    (cond ((and *lisp-home*
                (probe-directory (pathname *lisp-home*)))
           (return))
          (t
           (cerror "Continue"
                   "*LISP-HOME* is NIL or invalid.~%  Please set *LISP-HOME* to the full pathname of the directory containing the Lisp system files."))))
  (time
   (let ((*default-pathname-defaults* (pathname *lisp-home*)))
     (load (compile-file "precompiler.lisp" :record-source-location nil))
     (load (compile-file "opcodes.lisp" :record-source-location nil))
     (load (compile-file "jvm.lisp" :record-source-location nil))
     ;; Order matters for these files.
     (mapc #'(lambda (fn) (compile-file fn :record-source-location nil))
       '("collect.lisp"
                            "macros.lisp"
                            "loop.lisp"))
     ;; But not for these.
     (mapc #'(lambda (file-spec)
	       (destructuring-bind (fn record)
		 (if (consp file-spec)
		   file-spec
		   (list file-spec t))
		 (compile-file fn :record-source-location record)))

		       '("adjoin.lisp"
                            "and.lisp"
                            "apropos.lisp"
                            ("arrays.lisp" nil)
                            "asdf.lisp"
                            "assert.lisp"
                            "assoc.lisp"
                            "autoloads.lisp"
                            ("backquote.lisp" nil)
                            "bit-array-ops.lisp"
                            "boole.lisp"
                            "boot.lisp"
                            "butlast.lisp"
                            "byte-io.lisp"
                            "case.lisp"
                            "chars.lisp"
                            "check-type.lisp"
                            ;;"clos.lisp"
                            "coerce.lisp"
                            "compile-file.lisp"
                            ("compiler-macro.lisp" nil)
                            ("concatenate.lisp" nil)
                            "cond.lisp"
                            "copy-list.lisp"
                            "copy-seq.lisp"
                            "copy-symbol.lisp"
                            "count.lisp"
                            ("debug.lisp" nil)
                            ("define-modify-macro.lisp" nil)
                            "define-symbol-macro.lisp"
                            ("defpackage.lisp" nil)
                            ;;"defsetf.lisp"
                            ("defstruct.lisp" nil)
                            "deftype.lisp"
                            "delete-duplicates.lisp"
                            ("delete.lisp" nil)
                            "deposit-field.lisp"
                            ("destructuring-bind.lisp" nil)
                            "directory.lisp"
                            "do-all-symbols.lisp"
                            "do-external-symbols.lisp"
                            "do-symbols.lisp"
                            "do.lisp"
                            ("documentation.lisp" nil)
                            "dolist.lisp"
                            "dotimes.lisp"
                            "dribble.lisp"
                            "dump-class.lisp"
                            ("early-defuns.lisp" nil)
                            "enough-namestring.lisp"
                            "ensure-directories-exist.lisp"
                            ("error.lisp" nil)
                            "fill.lisp"
                            "find-all-symbols.lisp"
                            "find.lisp"
                            ("fixme.lisp" nil)
                            "format.lisp"
                            "gentemp.lisp"
                            "gray-streams.lisp"
                            "inspect.lisp"
                            ;;"j.lisp"
                            "java.lisp"
                            ("late-setf.lisp" nil)
                            "lcm.lisp"
                            "ldb.lisp"
                            ("ldiff.lisp" nil)
                            "list-length.lisp"
                            ("list.lisp" nil)
                            "load.lisp"
                            ("make-hash-table.lisp" nil)
                            "make-load-form-saving-slots.lisp"
                            ("make-sequence.lisp" nil)
                            "make-string-output-stream.lisp"
                            ("make-string.lisp" nil)
                            "map-into.lisp"
                            "map.lisp"
                            "map1.lisp"
                            "maphash.lisp"
                            "mask-field.lisp"
                            "member-if.lisp"
                            "mismatch.lisp"
                            "multiple-value-bind.lisp"
                            "multiple-value-list.lisp"
                            "multiple-value-setq.lisp"
                            "nsubstitute.lisp"
                            "nth-value.lisp"
                            "numbers.lisp"
                            "open.lisp"
                            "or.lisp"
                            "parse-integer.lisp"
                            "parse-lambda-list.lisp"
                            "parse-namestring.lisp"
                            "pathnames.lisp"
                            "pprint.lisp"
                            ("print.lisp" nil)
                            ;;"print-object.lisp"
                            "print-unreadable-object.lisp"
                            "profiler.lisp"
                            "prog.lisp"
                            "psetf.lisp"
                            "query.lisp"
                            "read-sequence.lisp"
                            "reduce.lisp"
                            "remf.lisp"
                            "remove-duplicates.lisp"
                            "remove.lisp"
                            "replace.lisp"
                            ("restart.lisp" nil)
                            "revappend.lisp"
                            ;;"rt.lisp"
                            ;;"run-benchmarks.lisp"
                            "run-shell-command.lisp"
                            ;;"runtime-class.lisp"
                            "search.lisp"
                            ("sequences.lisp" nil)
                            ("setf.lisp" nil)
                            "sets.lisp"
                            "shiftf.lisp"
                            ("signal.lisp" nil)
                            "socket.lisp"
                            "sort.lisp"
                            "step.lisp"
                            "strings.lisp"
                            "sublis.lisp"
                            "subst.lisp"
                            "substitute.lisp"
                            ;("subtypep.lisp" nil)
                            "tailp.lisp"
                            "time.lisp"
                            "top-level.lisp"
                            "trace.lisp"
                            "translate-logical-pathname.lisp"
                            "tree-equal.lisp"
                            ("typep.lisp" nil)
                            "upgraded-complex-part-type.lisp"
                            "with-accessors.lisp"
                            "with-hash-table-iterator.lisp"
                            "with-input-from-string.lisp"
                            "with-open-file.lisp"
                            "with-output-to-string.lisp"
                            "with-package-iterator.lisp"
                            "with-slots.lisp"
                            "with-standard-io-syntax.lisp"
                            "with-thread-lock.lisp"
                            "write-sequence.lisp"
                            "write-string.lisp"
                            "write-to-string.lisp"
                            "write.lisp"))
     t)))
