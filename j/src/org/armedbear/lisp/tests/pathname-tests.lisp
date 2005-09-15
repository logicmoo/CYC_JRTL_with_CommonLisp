;;; pathname-tests.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
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

(defmacro expect (test-form)
  `(unless (ignore-errors ,test-form)
     (format t "Expected ~S~%" ',test-form)))

(defmacro signals-error (form error-name)
  `(handler-case ,form
     (error (c) (typep c ,error-name))
     (:no-error (&rest ignored) (declare (ignore ignored)) nil)))

(defun check-physical-pathname (pathname expected-directory expected-name expected-type)
  (let* ((directory (pathname-directory pathname))
         (name (pathname-name pathname))
         (type (pathname-type pathname)))
    (unless (and (pathnamep pathname)
                 (not (typep pathname 'logical-pathname)))
      (format t "~S => ~S; expected ~S~%" pathname (type-of pathname) 'pathname))
    (unless (and (equal directory expected-directory)
                 (equal name      expected-name)
                 (equal type      expected-type))
      (format t "~S => ~S ~S ~S; expected ~S ~S ~S~%"
              pathname directory name type expected-directory expected-name expected-type))))

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
               #+allegro 'equalp))
    (unless (typep pathname 'logical-pathname)
      (format t "~S => ~S; expected ~S~%" pathname (type-of pathname) 'logical-pathname))
    ;; "The device component of a logical pathname is always :UNSPECIFIC..." 19.3.2.1
    #-allegro ;; Except on Allegro, where it's NIL.
    (unless (eq (pathname-device pathname) :unspecific)
      (format t "~S => device is ~S, not ~S~%"
              pathname (pathname-device pathname) :unspecific))
    (unless (and (or (not (stringp host))
                     (funcall test host expected-host))
                 (funcall test directory expected-directory)
                 (funcall test name expected-name)
                 (funcall test type expected-type)
                 (eql version expected-version))
      (format t "~S => ~S ~S ~S ~S ~S; expected ~S ~S ~S ~S ~S~%"
              pathname
              host directory name type version
              expected-host expected-directory expected-name expected-type
              expected-version))))

(check-physical-pathname #p"/" '(:absolute) nil nil)
(check-physical-pathname #p"/foo" '(:absolute) "foo" nil)
(check-physical-pathname #p"/foo." '(:absolute) "foo" "")
(check-physical-pathname #p"/foo.b" '(:absolute) "foo" "b")
(check-physical-pathname #p"/foo.bar." '(:absolute) "foo.bar" "")
(check-physical-pathname #p"/foo.bar.baz" '(:absolute) "foo.bar" "baz")
(check-physical-pathname #p"/foo/bar" '(:absolute "foo") "bar" nil)
(check-physical-pathname #p"/foo..bar" '(:absolute) "foo." "bar")
(check-physical-pathname #p"foo.bar" nil "foo" "bar")
(check-physical-pathname #p"foo.bar.baz" nil "foo.bar" "baz")
(check-physical-pathname #p"foo/" '(:relative "foo") nil nil)
(check-physical-pathname #p"foo/bar" '(:relative "foo") "bar" nil)
(check-physical-pathname #p"foo/bar/baz" '(:relative "foo" "bar") "baz" nil)
(check-physical-pathname #p"foo/bar/" '(:relative "foo" "bar") nil nil)
#+allegro
;; This reduction is wrong.
(check-physical-pathname #p"foo/bar/.." '(:relative "foo") nil nil)
#+allegro
(check-physical-pathname #p"/foo/../" '(:absolute) nil nil)
(check-physical-pathname #p".lisprc" nil ".lisprc" nil)
(check-physical-pathname #p"x.lisprc" nil "x" "lisprc")

;; #p"."
#+(or allegro abcl)
(check-physical-pathname #p"." '(:relative) nil nil)
#+(or sbcl cmu clisp)
;; No trailing separator character means it's a file.
(check-physical-pathname #p"." nil "." nil)

;; #p"./"
;; Trailing separator character means it's a directory.
#+(or allegro abcl clisp)
(check-physical-pathname #p"./" '(:relative) nil nil)
#+(or sbcl cmu)
;; Is this more exact?
(check-physical-pathname #p"./" '(:relative ".") nil nil)

;; #p".."
#+(or allegro abcl)
;; Allegro parses this as a directory, even though it lacks a trailing separator.
(check-physical-pathname #p".." '(:relative :back) nil nil)
;; Other implementations think it's a file.
#+(or)
;; If it's a file, to a human its name would be "..". No implementation gets
;; this right.
(check-physical-pathname #p".." nil ".." nil)
#+(or sbcl cmu clisp)
;; These implementations parse ".." as the name "." followed by another dot and
;; the type string "", which no human would do.
(check-physical-pathname #p".." nil "." "")

;; #p"../"
#+(or allegro abcl)
(check-physical-pathname #p"../" '(:relative :back) nil nil)
#+(or sbcl cmu clisp)
(check-physical-pathname #p"../" '(:relative :up) nil nil)

#+allegro
(check-physical-pathname #p"..." nil "..." nil)
(check-physical-pathname #p"foo.*" nil "foo" :wild)

;; If the prefix isn't a defined logical host, it's not a logical pathname.
#+allegro
;; Except in Allegro.
(check-logical-pathname #p"foo:bar.baz.42" "foo" nil "bar" "baz" nil)
#-(or allegro cmu)
;; CMUCL parses this as (:ABSOLUTE #<SEARCH-LIST foo>) "bar.baz" "42".
(check-physical-pathname #p"foo:bar.baz.42" nil "foo:bar.baz" "42")

;; Define a logical host.
(setf (logical-pathname-translations "effluvia")
      '(("**;*.*.*" "/usr/local/**/*.*")))

;; LOGICAL-PATHNAME-TRANSLATIONS
#+(or sbcl cmu)
(expect (equal (logical-pathname-translations "effluvia")
               '(("**;*.*.*" "/usr/local/**/*.*"))))
#+clisp
(expect (equal (logical-pathname-translations "effluvia")
               '((#p"EFFLUVIA:**;*.*.*" "/usr/local/**/*.*"))))
#+abcl
(expect (equal (logical-pathname-translations "effluvia")
               '((#p"EFFLUVIA:**;*.*.*" #p"/usr/local/**/*.*"))))

#+sbcl
;; Even though "effluvia" is defined as a logical host, "bop" is not a valid
;; logical pathname version, so this can't be a logical pathname.
(check-physical-pathname #p"effluvia:bar.baz.bop" nil "effluvia:bar.baz" "bop")

#-allegro
(progn
  (check-logical-pathname #p"effluvia:bar.baz.42" "EFFLUVIA" '(:absolute) "BAR" "BAZ" 42)
  (expect (string= (write-to-string #p"effluvia:bar.baz.42" :escape t)
                   "#P\"EFFLUVIA:BAR.BAZ.42\"")))
#+allegro
;; Allegro returns NIL for the device and directory and drops the version
;; entirely (even from the namestring).
(progn
  (check-logical-pathname #p"effluvia:bar.baz.42" "effluvia" nil "bar" "baz" nil)
  (expect (string= (write-to-string #p"effluvia:bar.baz" :escape t)
                   "#p\"effluvia:bar.baz\"")))

;; (setf *pathname* (parse-namestring "**;*.*.*" "effluvia"))
(expect (typep (parse-namestring "**;*.*.*" "effluvia") 'logical-pathname))
#-allegro
(expect (string= (namestring (parse-namestring "**;*.*.*" "effluvia")) "EFFLUVIA:**;*.*.*"))
#+allegro
;; Allegro preserves case and drops the version component.
(expect (string= (namestring (parse-namestring "**;*.*.*" "effluvia")) "effluvia:**;*.*"))

;; The version can be a bignum.
;; (setf *pathname* (pathname "effluvia:bar.baz.2147483648"))
#-allegro
(check-logical-pathname #p"effluvia:bar.baz.2147483648" "EFFLUVIA" '(:absolute) "BAR" "BAZ" 2147483648)
;;(expect (= (pathname-version #p"effluvia:bar.baz.2147483648") 2147483648))
#-(or sbcl allegro)
;; SBCL has a bug when the version is a bignum.
(expect (string= (namestring #p"effluvia:bar.baz.2147483648")
                 "EFFLUVIA:BAR.BAZ.2147483648"))

#-allegro
(check-logical-pathname #p"effluvia:foo.*" "EFFLUVIA" '(:absolute) "FOO" :wild nil)
#+allegro
(check-logical-pathname #p"effluvia:foo.*" "effluvia" nil "foo" :wild nil)

#-allegro
(check-logical-pathname #p"effluvia:*.lisp" "EFFLUVIA" '(:absolute) :wild "LISP" nil)
#+allegro
(check-logical-pathname #p"effluvia:*.lisp" "effluvia" nil :wild "lisp" nil)

#-allegro
(check-logical-pathname #p"effluvia:bar.baz.newest" "EFFLUVIA" '(:absolute) "BAR" "BAZ" :newest)
#+allegro
(check-logical-pathname #p"effluvia:bar.baz.newest" "effluvia" nil "bar" "baz" nil)

#-allegro
(check-logical-pathname #p"EFFLUVIA:BAR.BAZ.NEWEST" "EFFLUVIA" '(:absolute) "BAR" "BAZ" :newest)
#+allegro
(check-logical-pathname #p"EFFLUVIA:BAR.BAZ.NEWEST" "EFFLUVIA" nil "BAR" "BAZ" nil)

;; The directory component.
(check-logical-pathname #p"effluvia:foo;bar.baz" "EFFLUVIA" '(:absolute "FOO") "BAR" "BAZ" nil)
#-allegro
(expect (string= (namestring #p"effluvia:foo;bar.baz") "EFFLUVIA:FOO;BAR.BAZ"))
#+allegro
(expect (string= (namestring #p"effluvia:foo;bar.baz") "effluvia:foo;bar.baz"))

#-allegro
(progn
  (check-logical-pathname #p"effluvia:;bar.baz" "EFFLUVIA" '(:relative) "BAR" "BAZ" nil)
  (expect (string= (namestring #p"effluvia:;bar.baz") "EFFLUVIA:;BAR.BAZ")))
#+allegro
;; Allegro drops the directory component and removes the semicolon from the
;; namestring.
(progn
  (check-logical-pathname #p"effluvia:;bar.baz" "EFFLUVIA" nil "BAR" "BAZ" nil)
  (expect (string= (namestring #p"effluvia:;bar.baz") "effluvia:bar.baz")))

;; "If a relative-directory-marker precedes the directories, the directory
;; component parsed is as relative; otherwise, the directory component is
;; parsed as absolute."
#-allegro
(expect (equal (pathname-directory #p"effluvia:foo.baz") '(:absolute)))
#+allegro
(expect (equal (pathname-directory #p"effluvia:foo.baz") nil))

(expect (typep  #p"effluvia:" 'logical-pathname))
#-allegro
(expect (equal (pathname-directory #p"effluvia:") '(:absolute)))
#+allegro
(expect (equal (pathname-directory #p"effluvia:") nil))

;; PARSE-NAMESTRING
(expect (typep (parse-namestring "foo.bar" "effluvia") 'logical-pathname))
#-allegro
(expect (string= (namestring (parse-namestring "foo.bar" "effluvia")) "EFFLUVIA:FOO.BAR"))
#+allegro
(expect (string= (namestring (parse-namestring "foo.bar" "effluvia")) "effluvia:foo.bar"))

;; WILD-PATHNAME-P
(expect (wild-pathname-p #p"effluvia:;*.baz"))

;; PATHNAME-MATCH-P
(expect (pathname-match-p "/foo/bar/baz" "/*/*/baz"))
(expect (pathname-match-p "foo.bar" "/**/*.*"))
(expect (pathname-match-p "/usr/local/bin/foo.bar" "/**/foo.bar"))
(expect (not (pathname-match-p "/usr/local/bin/foo.bar" "**/foo.bar")))
(expect (pathname-match-p #p"effluvia:foo.bar" #p"effluvia:**;*.*.*"))

;; TRANSLATE-PATHNAME
#-clisp
(expect (equal (translate-pathname "foo" "*" "bar") #p"bar"))
(expect (equal (translate-pathname "foo" "*" "*")   #p"foo"))

#-abcl
;; ABCL doesn't implement this translation.
(expect (string= (pathname-name (translate-pathname "foobar" "*" "foo*")) "foofoobar"))

(expect (string= (namestring (translate-pathname "test.txt" "*.txt" "*.text"))
                 "test.text"))

(expect (string= (namestring (translate-pathname "foo/bar" "*/bar" "*/baz"))
                 "foo/baz"))
(expect (equal (translate-pathname "foo/bar" "*/bar" "*/baz") #p"foo/baz"))
(expect (string= (namestring (translate-pathname "foo.bar" "*.*" "/usr/local/*.*"))
                 "/usr/local/foo.bar"))
(expect (equal (translate-pathname "foo.bar" "*.*" "/usr/local/*.*") #p"/usr/local/foo.bar"))

#-clisp
(expect (equal (translate-pathname "foo.bar" "/**/*.*" "/usr/local/") #p"/usr/local/foo.bar"))

#+clisp
(expect (equal (translate-logical-pathname "effluvia:foo.bar") #p"/usr/local/foo.bar"))
#+(or sbcl cmu)
;; Device mismatch.
(progn
  (expect (eq (pathname-device (translate-logical-pathname "effluvia:foo.bar")) :unspecific))
  (expect (eq (pathname-device #p"/usr/local/foo/bar") nil)))
(check-physical-pathname (translate-logical-pathname "effluvia:foo.bar")
                         '(:absolute "usr" "local") "foo" "bar")

#-allegro
(check-logical-pathname #p"effluvia:Foo.Bar" "EFFLUVIA" '(:absolute) "FOO" "BAR" nil)
#+allegro
(check-logical-pathname #p"effluvia:Foo.Bar" "effluvia" nil "Foo" "Bar" nil)

;; "TRANSLATE-PATHNAME [and thus also TRANSLATE-LOGICAL-PATHNAME] maps
;; customary case in SOURCE into customary case in the output pathname."
#-allegro
(check-physical-pathname (translate-logical-pathname #p"effluvia:Foo.Bar")
                         '(:absolute "usr" "local") "foo" "bar")
#+allegro
;; Allegro preserves case.
(check-physical-pathname (translate-logical-pathname #p"effluvia:Foo.Bar")
                         '(:absolute "usr" "local") "Foo" "Bar")

#-allegro
(check-logical-pathname (merge-pathnames "effluvia:foo.bar")
                        "EFFLUVIA" '(:absolute) "FOO" "BAR" :newest)
#+allegro
;; Allegro's MERGE-PATHNAMES apparently calls TRANSLATE-LOGICAL-PATHNAME.
(check-physical-pathname (merge-pathnames "effluvia:foo.bar")
                         '(:absolute "usr" "local") "foo" "bar")
