;;; compile-system.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: compile-system.lisp,v 1.35 2004-10-17 19:34:39 piso Exp $
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

(require '#:loop)
(require '#:collect)
(require '#:jvm)

(defun check-lisp-home ()
  (loop
    (cond ((and *lisp-home*
                (probe-directory (pathname *lisp-home*)))
           (return))
          (t
           (cerror "Continue"
                   "*LISP-HOME* is NIL or invalid.~%  Please set *LISP-HOME* to the full pathname of the directory containing the Lisp system files.")))))

(defun grovel-java-definitions-in-file (file out)
  (with-open-file (in file)
    (let ((system-package (find-package "SYSTEM"))
          (line-number 1))
      (loop
        (let ((text (read-line in nil in))
              position)
          (cond ((eq text in)
                 (return))
                ((setf position (search "###" text))
                 ;; The following code is based on the assumption that all the
                 ;; Java builtins are accessible in the SYSTEM package (which
                 ;; uses CL and EXT).
                 (let* ((name (string (read-from-string (subseq text (+ position 3)))))
                        (symbol (find-symbol name system-package)))
                   (when symbol
                     ;; Force the symbol's package prefix to be written out.
                     (let ((*package* *keyword-package*))
                       (format out "~S ~S ~S~%" symbol file line-number))))))
          (incf line-number))))))

(defun grovel-java-definitions ()
  (check-lisp-home)
  (time
   (let ((files (directory (merge-pathnames "*.java" *lisp-home*))))
     (with-open-file (stream (merge-pathnames "tags" *lisp-home*)
                             :direction :output :if-exists :supersede)
       (dolist (file files)
         (grovel-java-definitions-in-file file stream))))))

(defun maybe-compile-file (source-file &key force)
  (if force
      (compile-file source-file)
      (let* ((source-write-time (file-write-date source-file))
             (target-file (compile-file-pathname source-file))
             (target-write-time (and (probe-file target-file)
                                     (file-write-date target-file))))
        (if (or (null target-write-time)
                (<= target-write-time source-write-time))
            (compile-file source-file)
            target-file))))

(defun compile-system ()
  (check-lisp-home)
  (time
   (let ((*default-pathname-defaults* (pathname *lisp-home*)))
     (load (maybe-compile-file "precompiler.lisp"))
     (load (maybe-compile-file "source-transform.lisp"))
     (load (maybe-compile-file "opcodes.lisp"))
     (load (maybe-compile-file "jvm.lisp"))
     (load (maybe-compile-file "compile-file.lisp"))
     ;; FIXME We need to load clos.lisp before we can compile clos.lisp.
     (load "clos.lisp")
     ;; Order matters for these files.
     (mapc #'maybe-compile-file '("collect.lisp"
                                  "macros.lisp"
                                  "loop.lisp"))
;;      (mapc #'maybe-compile-file '("pprint.lisp"
;;                                   "format.lisp"))
     (load (maybe-compile-file "typep.lisp"))
     (load (maybe-compile-file "print.lisp"))
     (load (maybe-compile-file "pprint-dispatch.lisp"))
     (load (maybe-compile-file "pprint.lisp"))
     (load (maybe-compile-file "format.lisp"))
     (load (maybe-compile-file "delete.lisp"))
     (load (maybe-compile-file "coerce.lisp"))
     (load (maybe-compile-file "concatenate.lisp"))
     (load (maybe-compile-file "make-sequence.lisp"))
     ;; But not for these.
     (mapc #'maybe-compile-file '("adjoin.lisp"
                                  "and.lisp"
                                  "apropos.lisp"
                                  "arrays.lisp"
                                  "asdf.lisp"
                                  "assert.lisp"
                                  "assoc.lisp"
                                  "autoloads.lisp"
                                  "aver.lisp"
                                  "backquote.lisp"
                                  "bit-array-ops.lisp"
                                  "boole.lisp"
                                  ;;"boot.lisp"
                                  "butlast.lisp"
                                  "byte-io.lisp"
                                  "case.lisp"
                                  "chars.lisp"
                                  "check-type.lisp"
                                  "clos.lisp"
                                  ;;"coerce.lisp"
                                  ;;"compile-file.lisp"
                                  "compile-file-pathname.lisp"
                                  "compiler-macro.lisp"
                                  ;;"concatenate.lisp"
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
                                  ;;"delete.lisp"
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
                                  "dump-class.lisp"
                                  "early-defuns.lisp"
                                  "ed.lisp"
                                  "enough-namestring.lisp"
                                  "ensure-directories-exist.lisp"
                                  "error.lisp"
                                  "fill.lisp"
                                  "find-all-symbols.lisp"
                                  "find.lisp"
                                  "fixme.lisp"
                                  "gentemp.lisp"
                                  "gray-streams.lisp"
                                  "inspect.lisp"
                                  ;;"j.lisp"
                                  "java.lisp"
                                  "late-setf.lisp"
                                  "lcm.lisp"
                                  "ldb.lisp"
                                  "ldiff.lisp"
                                  "list-length.lisp"
                                  "list.lisp"
                                  "load.lisp"
                                  "make-hash-table.lisp"
                                  "make-load-form-saving-slots.lisp"
                                  ;;"make-sequence.lisp"
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
                                  ;;"print.lisp"
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
                                  "rotatef.lisp"
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
                                  "socket.lisp"
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
                                  ;;"typep.lisp"
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
                                  "write-sequence.lisp"))
     (mapc #'maybe-compile-file '("swank-protocol.lisp"
                                  "slime.lisp"
                                  "swank-abcl.lisp"
                                  "swank.lisp"))
     t)))
