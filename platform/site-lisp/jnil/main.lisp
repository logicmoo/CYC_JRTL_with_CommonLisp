;;; -*- mode: lisp; package: jnil -*-
;;; Copyright (c) 2004-2005 Tiago Maduro-Dias. All Rights Reserved.
;;;
;;; This code is free software; you can redistribute it and/or
;;; modify it under the terms of the version 2.1 of
;;; the GNU Lesser General Public License as published by 
;;; the Free Software Foundation, as clarified by the preamble
;;; found in license-llgpl.txt.
;;;
;;; This code is distributed in the hope that it will be useful,
;;; but without any warranty; without even the implied warranty of
;;; merchantability or fitness for a particular purpose. See the GNU
;;; Lesser General Public License for more details.
;;;
;;; Version 2.1 of the GNU Lesser General Public License is in the file 
;;; license-lgpl.txt that was distributed with this file.
;;; If it is not present, you can access it from
;;; http://www.gnu.org/copyleft/lesser.txt (until superseded by a newer
;;; version) or write to the Free Software Foundation, Inc., 59 Temple Place, 
;;; Suite 330, Boston, MA  02111-1307  USA
;;;
;;; $Id: main.lisp,v 1.3 2006/05/30 21:07:59 tdias Exp $
;;;
;;; Description: Definition of the project's user interface. All functions that
;;; are expected to be called directly by the user should go here. This is the
;;; entrance point of the project.
;;;
;;; -- start of main.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defmethod expand-switch (switch)
  (list switch))

(defmethod expand-switch ((switch (eql :translate-sdk-calls-without-unreadable)))
  (list :translate-sdk-calls-to-native
        switch))

(defmethod expand-switch ((switch (eql :optimize-1)))
  (list :sendable-methods :initialize-methods :initialized-instances))

(defmethod expand-switch ((switch (eql :optimize-2)))
  (append (list :translate-sdk-calls-to-native
                :support-utils)
          (expand-switch :optimize-1)))

(defmethod expand-switch ((switch (eql :optimize-3)))
  (append (expand-switch :optimize-2)
          (expand-switch :translate-sdk-calls-without-unreadable)))

(defun signal-translation-error (condition)
  (error "The following error occurred during translation. It may have been caused by unresolved bindings on the Eclipse project you're trying to translate. If you're sure everything is ok on the Eclipse side, please report the error to ~a:~:_~a"
         (asdf:system-author (asdf:find-system :jnil))
         condition))

(defun translate-java-unit (project-name qualified-unit-name output-folder dialect
                            &key compiler-switches (overwrite-existing-p t) verbose)
  (format t "~&; Reading unit ~a from Eclipse project ~a.~&; Output going to ~a."
          qualified-unit-name project-name output-folder)
  (let* ((switches (delete-duplicates (mapcan #'expand-switch (mklist compiler-switches))))
         (java-ast (parse-java-unit project-name qualified-unit-name))
         (rel-output-file (lisp-output-pathname qualified-unit-name dialect))
         (output-file (ensure-directories-exist (merge-pathnames rel-output-file output-folder))))
    (unwind-protect 
        (if (or (not (probe-file output-file)) overwrite-existing-p)
            (handler-case 
                (let ((lisp-code (jnil-generate-code java-ast dialect verbose switches)))
                  (with-open-file (s output-file :direction :output :if-exists :supersede)
                    (format t "~&; Writing code to file ~s.~%" (namestring output-file))
                    (let ((*print-pretty* t) (*print-circle* nil))
                      (write lisp-code :stream s))))
              (program-error (condition) (signal-translation-error condition)))
          (format t "~&; Skipping existing file ~a.~%" (namestring output-file)))))
  (values))

(defun translate-java-project (project-name output-folder &rest args)
  (let* ((output-folder (merge-pathnames (concatenate 'string project-name "/") output-folder))
         (unit-names (java-project-unit-names project-name))
         (unit-count (length unit-names))
         (i 0))
    (dolist (unit-name unit-names)
      (format t "~&;;; Processing unit ~a of ~a:" (incf i) unit-count)
      (apply #'translate-java-unit project-name unit-name output-folder args)))
  (values))

(defun jnil-end ()
  (and (javatools.jlinker:jlinker-end) t))

(defun run-test-suite (&key (jnil t) (common-lisp t))
  (declare (ignore common-lisp))
  (when jnil
    (let (*print-circle*)
      (map-over-directory #'load (merge-pathnames "tests/*.test" #.*compile-file-truename*))))
  (values))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '(translate-java-unit translate-java-project jnil-end run-test-suite)
          'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of main.lisp --
