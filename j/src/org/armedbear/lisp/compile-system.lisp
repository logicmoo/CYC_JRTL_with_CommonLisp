;;; compile-system.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: compile-system.lisp,v 1.4 2004-04-18 18:45:48 piso Exp $
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
     (unless (compiled-function-p 'precompile)
       (jvm:jvm-compile-package "PRECOMPILER"))
     ;; Order matters for these files.
     (mapc #'compile-file '("collect.lisp"
                            "macros.lisp"
                            "loop.lisp"))
     ;; But not for these.
     (mapc #'compile-file '("adjoin.lisp"
                            "and.lisp"
                            "apropos.lisp"
                            "arrays.lisp"
                            "asdf.lisp"
                            "assert.lisp"
                            "assoc.lisp"
                            "autoloads.lisp"
                            "backquote.lisp"
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
                            "compiler-macro.lisp"
                            "concatenate.lisp"
                            "cond.lisp"
                            "copy-list.lisp"
                            "copy-seq.lisp"
                            "copy-symbol.lisp"
                            "count.lisp"
                            "debug.lisp"
                            "define-modify-macro.lisp"
                            "define-symbol-macro.lisp"
                            "defpackage.lisp"
                            ;;"defsetf.lisp"
                            "defstruct.lisp"
                            "deftype.lisp"
                            "delete-duplicates.lisp"
                            "delete.lisp"
                            "deposit-field.lisp"
                            "destructuring-bind.lisp"
                            "directory.lisp"
                            "do-all-symbols.lisp"
                            "do-external-symbols.lisp"
                            "do-symbols.lisp"
                            "do.lisp"
                            "documentation.lisp"
                            "dolist.lisp"
                            "dotimes.lisp"
                            "dribble.lisp"
                            "early-defuns.lisp"
                            "enough-namestring.lisp"
                            "ensure-directories-exist.lisp"
                            "error.lisp"
                            "fill.lisp"
                            "find-all-symbols.lisp"
                            "find.lisp"
                            "fixme.lisp"
                            ;;"format.lisp"
                            "gentemp.lisp"
                            "inspect.lisp"
                            ;;"j.lisp"
                            "java.lisp"
                            "jvm.lisp"
                            "late-setf.lisp"
                            "lcm.lisp"
                            "ldb.lisp"
                            "ldiff.lisp"
                            "list-length.lisp"
                            "list.lisp"
                            "load.lisp"
                            "make-hash-table.lisp"
                            "make-load-form-saving-slots.lisp"
                            "make-sequence.lisp"
                            "make-socket.lisp"
                            "make-string-output-stream.lisp"
                            "make-string.lisp"
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
                            ;;"pprint.lisp"
                            "precompiler.lisp"
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
                            "restart.lisp"
                            "revappend.lisp"
                            ;;"rt.lisp"
                            ;;"run-benchmarks.lisp"
                            "run-shell-command.lisp"
                            ;;"runtime-class.lisp"
                            "search.lisp"
                            "sequences.lisp"
                            "setf.lisp"
                            "sets.lisp"
                            "shiftf.lisp"
                            "signal.lisp"
                            "sort.lisp"
                            "step.lisp"
                            "strings.lisp"
                            "sublis.lisp"
                            "subst.lisp"
                            "substitute.lisp"
                            "subtypep.lisp"
                            "tailp.lisp"
                            "time.lisp"
                            "top-level.lisp"
                            "trace.lisp"
                            "translate-logical-pathname.lisp"
                            "tree-equal.lisp"
                            "typep.lisp"
                            "upgraded-complex-part-type.lisp"
                            "with-accessors.lisp"
                            "with-hash-table-iterator.lisp"
                            "with-input-from-string.lisp"
                            "with-open-file.lisp"
                            "with-output-to-string.lisp"
                            "with-package-iterator.lisp"
                            "with-slots.lisp"
                            "with-standard-io-syntax.lisp"
                            "write-sequence.lisp"
                            "write-string.lisp"
                            "write-to-string.lisp"
                            "write.lisp"))
     t)))
