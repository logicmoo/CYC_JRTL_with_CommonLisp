;;; pathname-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: pathname-tests.lisp,v 1.32 2005-09-27 18:45:44 piso Exp $
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

;; Before loading this file, define "ansi-tests" as a logical pathname host
;; (your path may vary):
;;
;;   (setf (logical-pathname-translations "ansi-tests")
;;         '(("*.*.*" "/home/peter/gcl/ansi-tests/*.*")))

(unless (member "RT" *modules* :test #'string=)
  (unless (ignore-errors (logical-pathname-translations "ansi-tests"))
    (error "~S is not defined as a logical pathname host." "ansi-tests"))
  (load "ansi-tests:rt-package.lsp")
  (load #+abcl (compile-file-if-needed "ansi-tests:rt.lsp")
        ;; Force compilation to avoid fasl name conflict between SBCL and
        ;; Allegro.
        #-abcl (compile-file "ansi-tests:rt.lsp"))
  (provide "RT"))

(regression-test:rem-all-tests)

(let ((*package* (find-package '#:regression-test)))
  (export (find-symbol (string '#:*expected-failures*))))

(setf regression-test:*expected-failures* nil)

(unless (find-package '#:test)
  (defpackage #:test (:use #:cl #:regression-test)))

(in-package #:test)

(defmacro signals-error (form error-name)
  `(locally (declare (optimize safety))
     (handler-case ,form
     (error (c) (typep c ,error-name))
     (:no-error (&rest ignored) (declare (ignore ignored)) nil))))

(defun check-physical-pathname (pathname expected-directory expected-name expected-type)
  (let* ((directory (pathname-directory pathname))
         (name (pathname-name pathname))
         (type (pathname-type pathname))
         (ok t))
    (unless (and (pathnamep pathname)
                 (not (typep pathname 'logical-pathname)))
      (setf ok nil))
    (unless (and (equal directory expected-directory)
                 (equal name      expected-name)
                 (equal type      expected-type))
      (setf ok nil))
    ok))

(defun check-logical-pathname (pathname expected-host expected-directory
                                        expected-name expected-type
                                        expected-version)
  (let* ((host (pathname-host pathname))
         (directory (pathname-directory pathname))
         (name (pathname-name pathname))
         (type (pathname-type pathname))
         (version (pathname-version pathname))
         ;; Allegro's logical pathnames don't canonicalize their string
         ;; components to upper case.
         (test #-allegro 'equal
               #+allegro 'equalp)
         (ok t))
    (unless (typep pathname 'logical-pathname)
      (setf ok nil))
    ;; "The device component of a logical pathname is always :UNSPECIFIC..." 19.3.2.1
    #-allegro ;; Except on Allegro, where it's NIL.
    (unless (eq (pathname-device pathname) :unspecific)
      (setf ok nil))
    (unless (and (or (not (stringp host))
                     (funcall test host expected-host))
                 (funcall test directory expected-directory)
                 (funcall test name expected-name)
                 (funcall test type expected-type)
                 (eql version expected-version))
      (setf ok nil))
    ok))

(defun check-merge-pathnames (pathname default-pathname expected-result)
  (let* ((result (merge-pathnames pathname default-pathname))
         (test #-allegro 'equal
               #+allegro (if (typep result 'logical-pathname)
                             'equalp
                             'equal)))
    (and (funcall test (pathname-host result) (pathname-host expected-result))
         (funcall test (pathname-directory result) (pathname-directory expected-result))
         (funcall test (pathname-name result) (pathname-name expected-result))
         (funcall test (pathname-type result) (pathname-type expected-result)))))

(defun check-translate-pathname (args expected)
  (declare (optimize safety))
  (declare (type list args))
  (declare (type string expected))
  (let ((result (namestring (apply 'translate-pathname args))))
    (equal result
           #-windows expected
           #+windows (substitute #\\ #\/ expected))))

(defmacro check-readable (pathname)
  `(equal ,pathname (read-from-string (write-to-string ,pathname :readably t))))

(defun check-readable-or-signals-error (pathname)
  (handler-case
      (equal pathname (read-from-string (write-to-string pathname :readably t)))
    (print-not-readable () t)))

(defmacro check-namestring (pathname namestring)
  `(string= (namestring ,pathname)
            #+windows (substitute #\\ #\/ ,namestring)
            #-windows ,namestring))

(deftest equal.1
  (equal (make-pathname :name "foo" :type "bar")
         (make-pathname :name "foo" :type "bar"))
  t)

(deftest equal.2
  (equal (make-pathname :name "foo" :type "bar" :version nil)
         (make-pathname :name "foo" :type "bar" :version :newest))
  #+(or clisp cmu lispworks) nil
  #-(or clisp cmu lispworks) t)

(deftest sxhash.1
  (let* ((p (make-pathname :name "foo" :type "bar" :version nil))
         (s (sxhash p)))
    (values (typep s 'fixnum)
            (>= s 0)))
  t t)

;; "(equal x y) implies (= (sxhash x) (sxhash y))"
(deftest sxhash.2
  (let ((p1 (make-pathname :name "foo" :type "bar" :version nil))
        (p2 (make-pathname :name "foo" :type "bar" :version :newest)))
    (if (equal p1 p2)
        (= (sxhash p1) (sxhash p2))
        t))
  t)

;; It's suboptimal if all pathnames return the same SXHASH, but that happens
;; with SBCL.
(deftest sxhash.3
  (= (sxhash #p"/usr/local/bin/sbcl") (sxhash #p"") (sxhash #p"foo.bar"))
  #+sbcl t
  #-sbcl nil)

(deftest physical.1
  (check-physical-pathname #p"/" '(:absolute) nil nil)
  t)
(deftest physical.2
  (check-physical-pathname #p"/foo" '(:absolute) "foo" nil)
  t)
(deftest physical.3
  #-lispworks
  (check-physical-pathname #p"/foo." '(:absolute) "foo" "")
  #+lispworks
  (check-physical-pathname #p"/foo." '(:absolute) "foo." nil)
  t)
(deftest physical.4
  (check-physical-pathname #p"/foo.b" '(:absolute) "foo" "b")
  t)
(deftest physical.5
  #-lispworks
  (check-physical-pathname #p"/foo.bar." '(:absolute) "foo.bar" "")
  #+lispworks
  (check-physical-pathname #p"/foo.bar." '(:absolute) "foo.bar." nil)
  t)
(deftest physical.6
  (check-physical-pathname #p"/foo.bar.baz" '(:absolute) "foo.bar" "baz")
  t)
(deftest physical.7
  (check-physical-pathname #p"/foo/bar" '(:absolute "foo") "bar" nil)
  t)
(deftest physical.8
  (check-physical-pathname #p"/foo..bar" '(:absolute) "foo." "bar")
  t)
(deftest physical.9
  (check-physical-pathname #p"foo.bar" nil "foo" "bar")
  t)
(deftest physical.10
  (check-physical-pathname #p"foo.bar.baz" nil "foo.bar" "baz")
  t)
(deftest physical.11
  (check-physical-pathname #p"foo/" '(:relative "foo") nil nil)
  t)
(deftest physical.12
  (check-physical-pathname #p"foo/bar" '(:relative "foo") "bar" nil)
  t)
(deftest physical.13
  (check-physical-pathname #p"foo/bar/baz" '(:relative "foo" "bar") "baz" nil)
  t)
(deftest physical.14
  (check-physical-pathname #p"foo/bar/" '(:relative "foo" "bar") nil nil)
  t)
#+allegro
(deftest physical.15
  ;; This reduction is wrong.
  (check-physical-pathname #p"foo/bar/.." '(:relative "foo") nil nil)
  t)
#+allegro
(deftest physical.16
  (check-physical-pathname #p"/foo/../" '(:absolute) nil nil)
  t)
(deftest physical.17
  #-lispworks
  (check-physical-pathname #p".lisprc" nil ".lisprc" nil)
  #+lispworks
  (check-physical-pathname #p".lisprc" nil "" "lisprc")
  t)
(deftest physical.18
  (check-physical-pathname #p"x.lisprc" nil "x" "lisprc")
  t)

(deftest physical.19
  #-allegro
  (check-physical-pathname (make-pathname :name ".") nil "." nil)
  #+allegro
  (check-physical-pathname (make-pathname :name ".") '(:relative) nil nil)
  t)

(deftest physical.20
  (check-readable (make-pathname :name "."))
  t)
#+lispworks
(pushnew 'physical.20 *expected-failures*)

;; #p"."
(deftest physical.21
  #+(or allegro abcl cmu)
  (check-physical-pathname #p"." '(:relative) nil nil)
  #+(or sbcl clisp)
  ;; No trailing separator character means it's a file.
  (check-physical-pathname #p"." nil "." nil)
  t)
#+(or cmu lispworks)
(pushnew 'physical.21 *expected-failures*)

(deftest physical.21a
  (equal #p"." #p"")
  nil)
#+lispworks
(pushnew 'physical.21a *expected-failures*)

;; #p"./"
;; Trailing separator character means it's a directory.
(deftest physical.22
  #+(or allegro abcl clisp cmu)
  (check-physical-pathname #p"./" '(:relative) nil nil)
  #+(or sbcl)
  ;; Is this more exact?
  (check-physical-pathname #p"./" '(:relative ".") nil nil)
  t)
#+(or cmu lispworks)
(pushnew 'physical.22 *expected-failures*)

(deftest physical.22a
  (equal #p"./" #p"")
  nil)
#+lispworks
(pushnew 'physical.22a *expected-failures*)


(deftest physical.23
  #-allegro
  (check-physical-pathname (make-pathname :name "..") nil ".." nil)
  #+allegro
  (check-physical-pathname (make-pathname :name "..") '(:relative :back) nil nil)
  t)

#-(or sbcl)
(deftest physical.24
  (check-readable (make-pathname :name ".."))
  t)
#+(or clisp lispworks)
(pushnew 'physical.24 *expected-failures*)

;; #p".."
(deftest physical.25
  #+(or allegro)
  (check-physical-pathname #p".." '(:relative :back) nil nil)
  #+(or abcl cmu lispworks)
  (check-physical-pathname #p".." '(:relative :up) nil nil)
  ;; Other implementations think it's a file.
  #+(or)
  ;; If it's a file, to a human its name would be "..". No implementation gets
  ;; this right.
  (check-physical-pathname #p".." nil ".." nil)
  #+(or sbcl clisp)
  ;; These implementations parse ".." as the name "." followed by another dot and
  ;; the type string "", which no human would do.
  (check-physical-pathname #p".." nil "." "")
  t)
#+cmu
(pushnew 'physical.25 *expected-failures*)

;; #p"../"
(deftest physical.26
  #+allegro
  (check-physical-pathname #p"../" '(:relative :back) nil nil)
  #+(or abcl sbcl cmu clisp lispworks)
  (check-physical-pathname #p"../" '(:relative :up) nil nil)
  t)

;; Lots of dots.
#+(or allegro abcl cmu)
(deftest lots-of-dots.1
  (check-physical-pathname #p"..." nil "..." nil)
  t)
#+cmu
(pushnew 'lots-of-dots.1 *expected-failures*)
#+(or allegro abcl cmu)
(deftest lots-of-dots.2
  (check-physical-pathname #p"......" nil "......" nil)
  t)
#+cmu
(pushnew 'lots-of-dots.2 *expected-failures*)

(deftest physical.27
  (check-physical-pathname #p"foo.*" nil "foo" :wild)
  t)

#-sbcl
(deftest physical.28
  #-allegro
  (string= (namestring (make-pathname :name "..")) "..")
  #+allegro
  (string= (namestring (make-pathname :name "..")) "../")
  t)

(deftest physical.29
  (string= (namestring (make-pathname :directory '(:relative :up)))
           #+windows "..\\"
           #-windows "../")
  t)

;; Silly names.
#-(or allegro sbcl)
(deftest silly.1
  #+(or abcl clisp)
  (signals-error (make-pathname :name "abc/def") 'error)
  #-(or abcl clisp)
  (check-readable (make-pathname :name "abc/def"))
  t)
#+(or cmu lispworks)
(pushnew 'silly.1 *expected-failures*)

;; If the prefix isn't a defined logical host, it's not a logical pathname.
#-cmu
;; CMUCL parses this as (:ABSOLUTE #<SEARCH-LIST foo>) "bar.baz" "42".
(deftest logical.1
  #+allegro
  ;; Except in Allegro.
  (check-logical-pathname #p"foo:bar.baz.42" "foo" nil "bar" "baz" nil)
  #-allegro
  (check-physical-pathname #p"foo:bar.baz.42" nil "foo:bar.baz" "42")
  t)
#+lispworks
(pushnew 'logical.1 *expected-failures*)

;; Define a logical host.
(setf (logical-pathname-translations "effluvia")
      '(("**;*.*.*" "/usr/local/**/*.*")))

;; LOGICAL-PATHNAME-TRANSLATIONS
#-allegro
(deftest logical-pathname-translations.1
  #+(or sbcl cmu lispworks)
  (equal (logical-pathname-translations "effluvia")
         '(("**;*.*.*" "/usr/local/**/*.*")))
  #+clisp
  (equal (logical-pathname-translations "effluvia")
         '((#p"EFFLUVIA:**;*.*.*" "/usr/local/**/*.*")))
  #+abcl
  (equal (logical-pathname-translations "effluvia")
         '((#p"EFFLUVIA:**;*.*.*" #p"/usr/local/**/*.*")))
  t)

#+sbcl
(deftest physical.30
  ;; Even though "effluvia" is defined as a logical host, "bop" is not a valid
  ;; logical pathname version, so this can't be a logical pathname.
  (check-physical-pathname #p"effluvia:bar.baz.bop" nil "effluvia:bar.baz" "bop")
  t)

;; Parse error.
(deftest logical-pathname.1
  (signals-error (logical-pathname "effluvia::foo.bar")
                 #-(or allegro clisp) 'parse-error
                 #+(or allegro clisp) 'type-error)
  t)

#-allegro
(deftest logical.2
  (check-logical-pathname #p"effluvia:bar.baz.42" "EFFLUVIA" '(:absolute) "BAR" "BAZ" 42)
  t)
#-allegro
(deftest logical.3
  (string= (write-to-string #p"effluvia:bar.baz.42" :escape t)
           "#P\"EFFLUVIA:BAR.BAZ.42\"")
  t)

#+allegro
;; Allegro returns NIL for the device and directory and drops the version
;; entirely (even from the namestring).
(deftest logical.4
  (check-logical-pathname #p"effluvia:bar.baz.42" "effluvia" nil "bar" "baz" nil)
  t)

#+allegro
(deftest logical.5
  (string= (write-to-string #p"effluvia:bar.baz" :escape t)
           #+allegro-v6.2 "#p\"effluvia:bar.baz\""
           #+allegro-v7.0 "#P\"effluvia:bar.baz\"")
  t)

(deftest logical.6
  (typep (parse-namestring "**;*.*.*" "effluvia") 'logical-pathname)
  t)

(deftest logical.7
  (check-namestring (parse-namestring "**;*.*.*" "effluvia")
                    #-(or allegro lispworks)
                    "EFFLUVIA:**;*.*.*"
                    #+allegro
                    ;; Allegro preserves case and drops the version component.
                    "effluvia:**;*.*"
                    #+lispworks
                    "effluvia:**;*.*.*")
  t)

#-allegro
;; The version can be a bignum.
(deftest logical.8
  (check-logical-pathname #p"effluvia:bar.baz.2147483648" "EFFLUVIA" '(:absolute) "BAR" "BAZ" 2147483648)
  t)
#-(or sbcl allegro)
;; SBCL has a bug when the version is a bignum.
(deftest logical.9
  (check-namestring #p"effluvia:bar.baz.2147483648" "EFFLUVIA:BAR.BAZ.2147483648")
  t)

(deftest logical.10
  #-allegro
  (check-logical-pathname #p"effluvia:foo.*" "EFFLUVIA" '(:absolute) "FOO" :wild nil)
  #+allegro
  (check-logical-pathname #p"effluvia:foo.*" "effluvia" nil "foo" :wild nil)
  t)

(deftest logical.11
  #-allegro
  (check-logical-pathname #p"effluvia:*.lisp" "EFFLUVIA" '(:absolute) :wild "LISP" nil)
  #+allegro
  (check-logical-pathname #p"effluvia:*.lisp" "effluvia" nil :wild "lisp" nil)
  t)

(deftest logical.12
  #-allegro
  (check-logical-pathname #p"effluvia:bar.baz.newest" "EFFLUVIA" '(:absolute) "BAR" "BAZ" :newest)
  #+allegro
  (check-logical-pathname #p"effluvia:bar.baz.newest" "effluvia" nil "bar" "baz" nil)
  t)

(deftest logical.13
  #-allegro
  (check-logical-pathname #p"EFFLUVIA:BAR.BAZ.NEWEST" "EFFLUVIA" '(:absolute) "BAR" "BAZ" :newest)
  #+allegro
  (check-logical-pathname #p"EFFLUVIA:BAR.BAZ.NEWEST" "EFFLUVIA" nil "BAR" "BAZ" nil)
  t)

;; The directory component.
(deftest logical.14
  (check-logical-pathname #p"effluvia:foo;bar.baz" "EFFLUVIA" '(:absolute "FOO") "BAR" "BAZ" nil)
  t)

(deftest logical.15
  (check-namestring #p"effluvia:foo;bar.baz"
                    #-allegro "EFFLUVIA:FOO;BAR.BAZ"
                    #+allegro "effluvia:foo;bar.baz")
  t)

(deftest logical.16
  #-allegro
  (check-logical-pathname #p"effluvia:;bar.baz" "EFFLUVIA" '(:relative) "BAR" "BAZ" nil)
  #+allegro
  ;; Allegro drops the directory component and removes the semicolon from the
  ;; namestring.
  (check-logical-pathname #p"effluvia:;bar.baz" "EFFLUVIA" nil "BAR" "BAZ" nil)
  t)
(deftest logical.17
  (check-namestring #p"effluvia:;bar.baz"
                    #+allegro "effluvia:bar.baz"
                    #-allegro "EFFLUVIA:;BAR.BAZ")
  t)

;; "If a relative-directory-marker precedes the directories, the directory
;; component parsed is as relative; otherwise, the directory component is
;; parsed as absolute."
(deftest logical.18
  (equal (pathname-directory #p"effluvia:foo.baz")
         #-allegro '(:absolute)
         #+allegro nil)
  t)

(deftest logical.19
  (typep  #p"effluvia:" 'logical-pathname)
  t)

(deftest logical.20
  (equal (pathname-directory #p"effluvia:")
         #-allegro '(:absolute)
         #+allegro nil)
  t)

;; PARSE-NAMESTRING
(deftest parse-namestring.1
  (typep (parse-namestring "foo.bar" "effluvia") 'logical-pathname)
  t)

(deftest parse-namestring.2
  (check-namestring (parse-namestring "foo.bar" "effluvia")
                    #-(or allegro lispworks) "EFFLUVIA:FOO.BAR"
                    #+allegro "effluvia:foo.bar"
                    #+lispworks "effluvia:FOO.BAR")
  t)

;; WILD-PATHNAME-P
(deftest wild-pathname-p.1
  (wild-pathname-p #p"effluvia:;*.baz")
  #+(or cmu sbcl) (:wild :wild-inferiors)
  #-(or cmu sbcl) t)

;; PATHNAME-MATCH-P
(deftest pathname-match-p.1
  (pathname-match-p "/foo/bar/baz" "/*/*/baz")
  t)
(deftest pathname-match-p.2
  (pathname-match-p "/foo/bar/baz" "/**/baz")
  t)
(deftest pathname-match-p.3
  (pathname-match-p "/foo/bar/quux/baz" "/**/baz")
  t)
(deftest pathname-match-p.4
  (pathname-match-p "foo.bar" "/**/*.*")
  t)
(deftest pathname-match-p.5
  (pathname-match-p "/usr/local/bin/foo.bar" "/**/foo.bar")
  t)
(deftest pathname-match-p.6
  (pathname-match-p "/usr/local/bin/foo.bar" "**/foo.bar")
  nil)
(deftest pathname-match-p.7
  (pathname-match-p "/foo/bar.txt" "/**/*.*")
  t)
(deftest pathname-match-p.8
  (pathname-match-p "/foo/bar.txt" "**/*.*")
  nil)
(deftest pathname-match-p.9
  (pathname-match-p #p"effluvia:foo.bar" #p"effluvia:**;*.*.*")
  t)

;; TRANSLATE-PATHNAME
#-clisp
(deftest translate-pathname.1
  (equal (translate-pathname "foo" "*" "bar") #p"bar")
  t)
(deftest translate-pathname.2
  (equal (translate-pathname "foo" "*" "*")   #p"foo")
  t)

;; ABCL doesn't implement this translation.
(deftest translate-pathname.3
  #-abcl
  (string= (pathname-name (translate-pathname "foobar" "*" "foo*"))
           #-allegro-v7.0 "foofoobar"
           #+allegro-v7.0 "foo*")
  #+abcl
  (signals-error (translate-pathname "foobar" "*" "foo*") 'error)
  t)

;; ABCL doesn't implement this translation.
(deftest translate-pathname.4
  #-abcl
  (equal (translate-pathname "foobar" "foo*" "*baz")
         #-allegro-v7.0 #p"barbaz"
         #+allegro-v7.0 #p"*baz")
  #+abcl
  (signals-error (translate-pathname "foobar" "foo*" "*baz") 'error)
  t)

;; ABCL doesn't implement this translation.
(deftest translate-pathname.5a
  #-abcl
  (equal (translate-pathname "foobar" "foo*" "")
         #+(or allegro clisp) #p"bar"
         #+sbcl #p"foobar")
  #+abcl
  (signals-error (translate-pathname "foobar" "foo*" "") 'error)
  t)

(deftest translate-pathname.5
  (equal (translate-pathname "foo/bar" "*/bar" "*/baz") #p"foo/baz")
  t)

(deftest translate-pathname.6
  (equal (translate-pathname "bar/foo" "bar/*" "baz/*") #p"baz/foo")
  t)

(deftest translate-pathname.7
  (equal (translate-pathname "foo/bar" "*/bar" "*/baz") #p"foo/baz")
  t)

(deftest translate-pathname.8
  (string= (namestring (translate-pathname "test.txt" "*.txt" "*.text"))
           "test.text")
  t)

(deftest translate-pathname.9
  (equal (translate-pathname "foo" "foo.*" "bar") #p"bar")
  t)

(deftest translate-pathname.10
  (equal (translate-pathname "foo" "foo.*" "bar.*") #p"bar")
  t)

(deftest translate-pathname.11
  (string= (namestring (translate-pathname "foo.bar" "*.*" "/usr/local/*.*"))
           #-windows "/usr/local/foo.bar"
           #+windows "\\usr\\local\\foo.bar")
  t)

(deftest translate-pathname.12
  (equal (translate-pathname "foo.bar" "*.*" "/usr/local/*.*")
         #p"/usr/local/foo.bar")
  t)

(deftest translate-pathname.13
  (check-translate-pathname '("/foo/" "/*/" "/usr/local/*/") "/usr/local/foo/")
  t)

(deftest translate-pathname.14
  (check-translate-pathname '("/foo/baz/bar.txt" "/**/*.*" "/usr/local/**/*.*")
                            "/usr/local/foo/baz/bar.txt")
  t)

(deftest translate-pathname.15
  (equal (translate-pathname "/foo/" "/*/" "/usr/local/*/bar/") #p"/usr/local/foo/bar/")
  t)

(deftest translate-pathname.16
  (equal (translate-pathname "/foo/bar.txt" "/*/*.*" "/usr/local/*/*.*")
         #P"/usr/local/foo/bar.txt")
  t)

;; "TRANSLATE-PATHNAME translates SOURCE (that matches FROM-WILDCARD)..."
(deftest pathname-match-p.10
  (pathname-match-p "/foo/bar.txt" "**/*.*")
  nil)
;; Since (pathname-match-p "/foo/bar.txt" "**/*.*" ) => NIL...
(deftest translate-pathname.17
  #+(or clisp allegro abcl cmu lispworks)
  ;; This seems to be the correct behavior.
  (signals-error (translate-pathname "/foo/bar.txt" "**/*.*" "/usr/local/**/*.*") 'error)
  #+sbcl
  ;; This appears to be a bug, since SOURCE doesn't match FROM-WILDCARD.
  (equal (translate-pathname "/foo/bar.txt" "**/*.*" "/usr/local/**/*.*")
         #p"/usr/local/foo/bar.txt")
  t)

(deftest pathname-match-p.11
  (pathname-match-p "/foo/bar.txt" "/**/*.*")
  t)
(deftest translate-pathname.18
  (equal (translate-pathname "/foo/bar.txt" "/**/*.*" "/usr/local/**/*.*")
         #p"/usr/local/foo/bar.txt")
  t)

#-clisp
(deftest translate-pathname.19
  (equal (translate-pathname "foo.bar" "/**/*.*" "/usr/local/") #p"/usr/local/foo.bar")
  t)

;; TRANSLATE-LOGICAL-PATHNAME

;; "PATHNAME is first coerced to a pathname. If the coerced pathname is a
;; physical pathname, it is returned."
(deftest translate-logical-pathname.1
  (equal (translate-logical-pathname #p"/") #p"/")
  t)

#+(or abcl clisp)
(deftest translate-logical-pathname.2
  (equal (translate-logical-pathname "effluvia:foo.bar") #p"/usr/local/foo.bar")
  t)

#+(or sbcl cmu)
(deftest translate-logical-pathname.3
  ;; Device mismatch.
  (and (eq (pathname-device (translate-logical-pathname "effluvia:foo.bar"))
           :unspecific)
       (eq (pathname-device #p"/usr/local/foo/bar")
           nil))
  t)

(deftest translate-logical-pathname.4
  (check-namestring (translate-logical-pathname "effluvia:foo.bar")
                    "/usr/local/foo.bar")
  t)

(deftest translate-logical-pathname.5
  (check-namestring (translate-logical-pathname "effluvia:foo;bar.txt")
                    "/usr/local/foo/bar.txt")
  t)

(deftest translate-logical-pathname.6
  #-allegro
  (check-logical-pathname #p"effluvia:Foo.Bar" "EFFLUVIA" '(:absolute) "FOO" "BAR" nil)
  #+allegro
  ;; Allegro preserves case.
  (check-logical-pathname #p"effluvia:Foo.Bar" "effluvia" nil "Foo" "Bar" nil)
  t)

;; "TRANSLATE-PATHNAME [and thus also TRANSLATE-LOGICAL-PATHNAME] maps
;; customary case in SOURCE into customary case in the output pathname."
(deftest translate-logical-pathname.7
  #-allegro
  (check-physical-pathname (translate-logical-pathname #p"effluvia:Foo.Bar")
                           '(:absolute "usr" "local") "foo" "bar")
  #+allegro
  ;; Allegro preserves case.
  (check-physical-pathname (translate-logical-pathname #p"effluvia:Foo.Bar")
                           '(:absolute "usr" "local") "Foo" "Bar")
  t)

(deftest merge-pathnames.1
  #-allegro
  (check-logical-pathname (merge-pathnames "effluvia:foo.bar")
                          "EFFLUVIA" '(:absolute) "FOO" "BAR" :newest)
  #+allegro
  ;; Allegro's MERGE-PATHNAMES apparently calls TRANSLATE-LOGICAL-PATHNAME.
  (check-physical-pathname (merge-pathnames "effluvia:foo.bar")
                           '(:absolute "usr" "local") "foo" "bar")
  t)

;; The following tests are adapted from SBCL's pathnames.impure.lisp.
(setf (logical-pathname-translations "demo0")
      '(("**;*.*.*" "/tmp/")))
(deftest sbcl.1
  (pathname-match-p "demo0:file.lisp" (logical-pathname "demo0:tmp;**;*.*.*"))
  nil)

#-clisp
(deftest sbcl.2
  (check-namestring (translate-logical-pathname "demo0:file.lisp") "/tmp/file.lisp")
  t)

(setf (logical-pathname-translations "demo1")
      '(("**;*.*.*" "/tmp/**/*.*") (";**;*.*.*" "/tmp/rel/**/*.*")))
;; Remove "**" from the resulting pathname when the source directory is NIL.
(deftest sbcl.3
  (equal (namestring (translate-logical-pathname "demo1:foo.lisp"))
         #-windows "/tmp/**/foo.lisp"
         #+windows "\\tmp\\**\\foo.lisp")
  nil)
(deftest sbcl.4
  (check-namestring (translate-logical-pathname "demo1:foo.lisp") "/tmp/foo.lisp")
  t)
;;; Check for absolute/relative path confusion.
#-allegro
(deftest sbcl.5
  (pathname-match-p "demo1:;foo.lisp" "demo1:**;*.*.*")
  nil)
#+(or sbcl cmu)
;; BUG Pathnames should match if the following translation is to work.
(deftest sbcl.6
  (pathname-match-p "demo1:;foo.lisp" "demo1:;**;*.*.*")
  t)
#+clisp
(deftest sbcl.7
  (pathname-match-p "demo1:;foo.lisp" ";**;*.*.*")
  t)
(deftest sbcl.8
  (equal (namestring (translate-logical-pathname "demo1:;foo.lisp"))
         #+(and abcl windows) "\\tmp\\rel\\foo.lisp"
         #+(and abcl unix) "/tmp/rel/foo.lisp"
         #-(or allegro abcl) "/tmp/rel/foo.lisp"
         #+allegro "/tmp/foo.lisp")
  t)

(setf (logical-pathname-translations "demo2")
      '(("test;**;*.*" "/tmp/demo2/test")))
(deftest sbcl.9
  (equal (enough-namestring "demo2:test;foo.lisp")
         #+sbcl "DEMO2:;TEST;FOO.LISP"
         #+(or abcl cmu lispworks) "DEMO2:TEST;FOO.LISP"
         #+allegro-v7.0 "demo2:test;foo.lisp"
         #+allegro-v6.2 "/test/foo.lisp" ;; BUG
         #+clisp "TEST;FOO.LISP")
  t)

#-(or allegro clisp cmu)
(deftest sbcl.10
  (signals-error (make-pathname :host "EFFLUVIA" :directory "!bla" :name "bar")
                 'error)
  t)
#-(or allegro cmu)
(deftest sbcl.11
  (signals-error (make-pathname :host "EFFLUVIA" :directory "bla" :name "!bar")
                 'error)
  t)
#-(or allegro cmu)
(deftest sbcl.12
  (signals-error (make-pathname :host "EFFLUVIA" :directory "bla" :name "bar" :type "&baz")
                 'error)
  t)

(deftest sbcl.13
  (equal (namestring (parse-namestring "" "EFFLUVIA")) "EFFLUVIA:")
  t)

(deftest sbcl.14
  #-cmu
  (equal (namestring (parse-namestring "" :unspecific)) "")
  #+cmu
  ;; It seems reasonable to signal an error here, since the HOST argument to
  ;; PARSE-NAMESTRING is specified to be "a valid pathname host, a logical host,
  ;; or NIL".
  (signals-error (parse-namestring "" :unspecific) 'type-error)
  t)

(deftest sbcl.15
  (equal (namestring (parse-namestring ""
                                       (pathname-host
                                        (translate-logical-pathname
                                         "EFFLUVIA:"))))
         "")
  t)

;; PARSE-NAMESTRING host mismatch: "If HOST is supplied and not NIL, and THING
;; contains a manifest host name, an error of type ERROR is signaled if the
;; hosts do not match."
(deftest sbcl.16
  (signals-error (parse-namestring "effluvia:foo.bar" "demo2") 'error)
  t)

(setf (logical-pathname-translations "bazooka")
      '(("todemo;*.*.*" "demo0:*.*.*")))
(deftest sbcl.17
  #+allegro ;; BUG
  (equal (namestring (translate-logical-pathname "bazooka:todemo;x.y")) "/tmp/todemo/x.y")
  #+clisp ;; BUG
  (signals-error (translate-logical-pathname "bazooka:todemo;x.y") 'error)
  #-(or allegro clisp)
  (equal (namestring (translate-logical-pathname "bazooka:todemo;x.y"))
         #-windows "/tmp/x.y"
         #+windows "\\tmp\\x.y")
  t)
(deftest sbcl.18
  #+clisp ;; BUG
  (signals-error (translate-logical-pathname "demo0:x.y") 'error)
  #-clisp
  (equal (namestring (translate-logical-pathname "demo0:x.y"))
         #-windows "/tmp/x.y"
         #+windows "\\tmp\\x.y")
  t)
#-(or allegro clisp)
(deftest sbcl.19
  (equal (namestring (translate-logical-pathname "bazooka:todemo;x.y"))
         (namestring (translate-logical-pathname "demo0:x.y")))
  t)

;; "If HOST is incorrectly supplied, an error of type TYPE-ERROR is signaled."
(deftest sbcl.20
  (signals-error (logical-pathname-translations "unregistered-host")
                 #+(or clisp lispworks) 'error ;; BUG
                 #+cmu 'file-error ;; BUG
                 #-(or clisp lispworks cmu) 'type-error)
  t)

(deftest sbcl.21
  (string-equal (host-namestring (parse-namestring "OTHER-HOST:ILLEGAL/LPN")) "OTHER-HOST")
  nil)
#+lispworks
(pushnew 'sbcl.21 *expected-failures*)

(deftest sbcl.22
  (string= (pathname-name (parse-namestring "OTHER-HOST:ILLEGAL/LPN")) "LPN")
  t)

(setf (logical-pathname-translations "test0")
      '(("**;*.*.*"              "/library/foo/**/")))
(deftest sbcl.23
  (check-namestring (translate-logical-pathname "test0:foo;bar;baz;mum.quux")
                    "/library/foo/foo/bar/baz/mum.quux")
  t)
;; (setf (logical-pathname-translations "prog")
;;       '(("RELEASED;*.*.*"        "MY-UNIX:/sys/bin/my-prog/")
;;         ("RELEASED;*;*.*.*"      "MY-UNIX:/sys/bin/my-prog/*/")
;;         ("EXPERIMENTAL;*.*.*"    "MY-UNIX:/usr/Joe/development/prog/")
;;         ("EXPERIMENTAL;*;*.*.*"  "MY-UNIX:/usr/Joe/development/prog/*/")))
(setf (logical-pathname-translations "prog")
      '(("CODE;*.*.*"             "/lib/prog/")))
#-allegro
(deftest sbcl.24
  (check-namestring (translate-logical-pathname "prog:code;documentation.lisp")
                    "/lib/prog/documentation.lisp")
  t)
(setf (logical-pathname-translations "prog1")
      '(("CODE;DOCUMENTATION.*.*" "/lib/prog/docum.*")
        ("CODE;*.*.*"             "/lib/prog/")))
#-allegro
(deftest sbcl.25
  (check-namestring (translate-logical-pathname "prog1:code;documentation.lisp")
                    "/lib/prog/docum.lisp")
  t)

;; "ANSI section 19.3.1.1.5 specifies that translation to a filesystem which
;; doesn't have versions should ignore the version slot. CMU CL didn't ignore
;; this as it should, but we [i.e. SBCL] do."
;; "Some file systems do not have versions. Logical pathname translation to
;; such a file system ignores the version." 19.3.1.1.5
#-cmu
;; CMUCL supports emacs-style versions.
(deftest sbcl.26
  (check-namestring (translate-logical-pathname "test0:foo;bar;baz;mum.quux.3")
                    "/library/foo/foo/bar/baz/mum.quux")
  t)
#+lispworks
(pushnew 'sbcl.26 *expected-failures*)

(setf (logical-pathname-translations "scratch")
      '(("**;*.*.*" "/usr/local/doc/**/*")))

;; Trivial merge.
(deftest sbcl.27
  (check-merge-pathnames #p"foo" #p"/usr/local/doc/" #p"/usr/local/doc/foo")
  t)

;; If pathname does not specify a host, device, directory, name, or type, each
;; such component is copied from default-pathname.
;; 1) no name, no type
(deftest sbcl.28
  (check-merge-pathnames #p"/supplied-dir/" #p"/dir/name.type"
                         #p"/supplied-dir/name.type")
  t)
;; 2) no directory, no type
(deftest sbcl.29
  (check-merge-pathnames #p"supplied-name" #p"/dir/name.type"
                         #p"/dir/supplied-name.type")
  t)
;; 3) no name, no dir (must use make-pathname as ".foo" is parsed
;; as a name)
(deftest sbcl.30
  (check-merge-pathnames (make-pathname :type "supplied-type")
                         #p"/dir/name.type"
                         #p"/dir/name.supplied-type")
  t)
;; If (pathname-directory pathname) is a list whose car is
;; :relative, and (pathname-directory default-pathname) is a
;; list, then the merged directory is [...]
(deftest sbcl.31
  (check-merge-pathnames #p"qqq/www" #p"/aaa/bbb/ccc/ddd/eee"
                         #p"/aaa/bbb/ccc/ddd/qqq/www")
  t)
;; except that if the resulting list contains a string or
;; :wild immediately followed by :back, both of them are
;; removed.
(deftest sbcl.32
  (check-merge-pathnames
   ;; "../" in a namestring is parsed as :up not :back, so MAKE-PATHNAME.
   (make-pathname :directory '(:relative :back "blah"))
   #p"/aaa/bbb/ccc/ddd/eee" #P"/aaa/bbb/ccc/blah/eee")
  t)
;; If (pathname-directory default-pathname) is not a list or
;; (pathname-directory pathname) is not a list whose car is
;; :relative, the merged directory is (or (pathname-directory
;; pathname) (pathname-directory default-pathname))
(deftest sbcl.33
  (check-merge-pathnames #p"/absolute/path/name" #p"/dir/default-name.type"
                         #P"/absolute/path/name.type")
  t)
(deftest sbcl.34
  (check-merge-pathnames #p"scratch:;name2" #p"scratch:foo;"
                         #p"SCRATCH:FOO;NAME2")
  t)

(deftest sbcl.35
  (check-merge-pathnames #p"scratch:;foo" #p"/usr/local/doc/"
                         #-(or allegro clisp lispworks) #P"SCRATCH:USR;LOCAL;DOC;FOO"
                         #+allegro #p"/usr/local/doc/foo"
                         #+clisp #p"SCRATCH:;FOO"
                         #+lispworks #p"SCRATCH:FOO")
  t)

(deftest sbcl.36
  (check-merge-pathnames #p"scratch:supplied-dir;" #p"/dir/name.type"
                         #-clisp #p"SCRATCH:SUPPLIED-DIR;NAME.TYPE"
                         #+clisp
                         ;; #p"SCRATCH:SUPPLIED-DIR;name.type.NEWEST"
                         (make-pathname :host "SCRATCH"
                                        :directory '(:absolute "SUPPLIED-DIR")
                                        :name "name"
                                        :type "type"))
  t)

(deftest sbcl.37
  (check-merge-pathnames #p"scratch:;supplied-name" #p"/dir/name.type"
                         #-(or allegro clisp lispworks)
                         #p"SCRATCH:DIR;SUPPLIED-NAME.TYPE"
                         #+allegro
                         #p"/usr/local/doc/supplied-name.type"
                         #+clisp
                         ;; #P"SCRATCH:;SUPPLIED-NAME.type.NEWEST"
                         (make-pathname :host "SCRATCH"
                                        :directory '(:relative)
                                        :name "SUPPLIED-NAME"
                                        :type "type")
                         #+lispworks
                         ;; #P"SCRATCH:SUPPLIED-NAME.TYPE.NEWEST"
                         (make-pathname :host "SCRATCH"
                                        :directory '(:absolute)
                                        :name "SUPPLIED-NAME"
                                        :type "TYPE"))
  t)

(deftest sbcl.38
  (check-merge-pathnames (make-pathname :host "scratch" :type "supplied-type")
                         #p"/dir/name.type"
                         #-(or allegro clisp lispworks)
                         #p"SCRATCH:DIR;NAME.SUPPLIED-TYPE"
                         #+allegro
                         #p"/usr/local/doc/name.supplied-type"
                         #+clisp
                         ;; #P"SCRATCH:dir;name.supplied-type.NEWEST"
                         (make-pathname :host "SCRATCH"
                                        :directory '(:absolute "dir")
                                        :name "name"
                                        :type "supplied-type")
                         #+lispworks
                         ;; #P"SCRATCH:NAME.SUPPLIED-TYPE.NEWEST"
                         (make-pathname :host "SCRATCH"
                                        :directory '(:absolute)
                                        :name "NAME"
                                        :type "SUPPLIED-TYPE"))
  t)

(deftest sbcl.39
  #-allegro
  (check-merge-pathnames (make-pathname :host "scratch"
                                        :directory '(:relative "foo")
                                        :name "bar")
                         #p"/aaa/bbb/ccc/ddd/eee"
                         #-(or clisp lispworks)
                         #p"SCRATCH:AAA;BBB;CCC;DDD;FOO;BAR"
                         #+clisp
                         ;; #P"SCRATCH:;foo;bar"
                         (make-pathname :host "SCRATCH"
                                        :directory '(:relative "foo")
                                        :name "bar")
                         #+lispworks
                         #p"SCRATCH:FOO;BAR")
  #+allegro
  (signals-error (merge-pathnames (make-pathname :host "scratch"
                                                 :directory '(:relative "foo")
                                                 :name "bar")
                                  #p"/aaa/bbb/ccc/ddd/eee")
                 'error)
  t)

(deftest sbcl.40
  #-(or allegro lispworks)
  (check-merge-pathnames (make-pathname :host "scratch"
                                        :directory '(:relative :back "foo")
                                        :name "bar")
                         #p"/aaa/bbb/ccc/ddd/eee"
                         #-clisp #p"SCRATCH:AAA;BBB;CCC;FOO;BAR"
                         #+clisp
                         ;; #P"SCRATCH:;..;foo;bar.NEWEST"
                         (make-pathname :host "SCRATCH"
                                        :directory '(:relative :back "foo")
                                        :name "bar"))
  #+(or allegro lispworks)
  (signals-error (merge-pathnames (make-pathname :host "scratch"
                                                 :directory '(:relative :back "foo")
                                                 :name "bar")
                         #p"/aaa/bbb/ccc/ddd/eee")
                 'error)
  t)

(deftest sbcl.41
  (check-merge-pathnames #p"scratch:absolute;path;name"
                         #p"/dir/default-name.type"
                         #-clisp #p"SCRATCH:ABSOLUTE;PATH;NAME.TYPE"
                         #+clisp
                         ;; #P"SCRATCH:ABSOLUTE;PATH;NAME.type.NEWEST"
                         (make-pathname :host "SCRATCH"
                                        :directory '(:absolute "ABSOLUTE" "PATH")
                                        :name "NAME"
                                        :type "type"))
  t)

(deftest sbcl.42
  (check-namestring (parse-namestring "/foo" (host-namestring #p"/bar")) "/foo")
  t)
#+lispworks
(pushnew 'sbcl.42 *expected-failures*)

(deftest sbcl.43
  (string= (namestring (parse-namestring "FOO" (host-namestring #p"SCRATCH:BAR")))
           "SCRATCH:FOO")
  t)

#-(or allegro clisp cmu lispworks)
(deftest sbcl.44
  ;; "The null string, "", is not a valid value for any component of a logical
  ;; pathname." 19.3.2.2
  (signals-error (setf (logical-pathname-translations "")
                       (list '("**;*.*.*" "/**/*.*")))
                 'error)
  t)

#-clisp
(deftest sbcl.45
  (check-namestring (translate-logical-pathname "/") "/")
  t)

(deftest sbcl.46
  (signals-error (pathname (make-string-input-stream "FOO"))
                 #-(or allegro-v6.2 cmu) 'type-error
                 #+allegro-v6.2     'stream-error
                 #+cmu              'error)
  t)

(deftest sbcl.47
  (signals-error (merge-pathnames (make-string-output-stream))
                 #-allegro-v6.2 'type-error
                 #+allegro-v6.2 'stream-error)
  t)

(deftest sbcl.48
  (check-readable-or-signals-error (make-pathname :name "foo" :type "txt" :version :newest))
  t)
#+lispworks
(pushnew 'sbcl.48 *expected-failures*)

#-allegro
(deftest sbcl.49
  (check-readable-or-signals-error (make-pathname :name "foo" :type "txt" :version 1))
  t)
#+lispworks
(pushnew 'sbcl.49 *expected-failures*)

(deftest sbcl.50
  #-clisp
  (check-readable-or-signals-error (make-pathname :name "foo" :type ".txt"))
  #+clisp
  (signals-error (make-pathname :name "foo" :type ".txt") 'error)
  t)
#+(or allegro lispworks)
(pushnew 'sbcl.50 *expected-failures*)

(deftest sbcl.51
  (check-readable-or-signals-error (make-pathname :name "foo." :type "txt"))
  t)

(deftest sbcl.52
  (check-readable-or-signals-error (parse-namestring "SCRATCH:FOO.TXT.1"))
  t)

(deftest sbcl.53
  (check-readable-or-signals-error (parse-namestring "SCRATCH:FOO.TXT.NEWEST"))
  t)

(deftest sbcl.54
  (check-readable-or-signals-error (parse-namestring "SCRATCH:FOO.TXT"))
  t)

(deftest sbcl.55
  (equal (parse-namestring "foo" nil "/")
         (parse-namestring "foo" nil #p"/"))
  t)

#-allegro
(deftest sbcl.56
  (let ((test "parse-namestring-test.tmp"))
    (unwind-protect
        (with-open-file (f test :direction :output)
          ;; FIXME: This test is a bit flaky, since we only check that
          ;; no error is signalled. The dilemma here is "what is the
          ;; correct result when defaults is a _file_, not a
          ;; directory". Currently (0.8.10.73) we get #P"foo" here (as
          ;; opposed to eg. #P"/path/to/current/foo"), which is
          ;; possibly mildly surprising but probably conformant.
          (equal (parse-namestring "foo" nil f) #p"foo"))
      (when (probe-file test)
        (delete-file test))))
  t)

;;; ENOUGH-NAMESTRING should probably not fail when the namestring in
;;; question has a :RELATIVE pathname.
(deftest sbcl.57
  (equal (enough-namestring #p"foo" #p"./") "foo")
  t)

;;; bug reported by Artem V. Andreev: :WILD not handled in unparsing
;;; directory lists.
(deftest sbcl.58
  (check-namestring #p"/tmp/*/" "/tmp/*/")
  t)

#-allegro
(deftest sbcl.59
  (string= (with-standard-io-syntax (write-to-string #p"/foo"))
           #-windows "#P\"/foo\""
           #+windows "#P\"\\\\foo\"")
  t)

#-allegro
(deftest sbcl.60
  (string= (with-standard-io-syntax (write-to-string #p"/foo" :readably nil))
           #-windows "#P\"/foo\""
           #+windows "#P\"\\\\foo\"")
  t)

#-allegro
(deftest sbcl.61
  (string= (with-standard-io-syntax (write-to-string #p"/foo" :escape nil))
           #-windows "#P\"/foo\""
           #+windows "#P\"\\\\foo\"")
  t)

(deftest sbcl.62
  (string= (with-standard-io-syntax (write-to-string #p"/foo" :readably nil :escape nil))
           #-windows "/foo"
           #+windows "\\\\foo")
  t)

(do-tests)
