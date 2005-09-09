;;; pathnames.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: pathnames.lisp,v 1.11 2005-09-09 02:40:08 piso Exp $
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

(defun pathname-host (pathname &key (case :local))
  (%pathname-host pathname case))

(defun pathname-device (pathname &key (case :local))
  (%pathname-device pathname case))

(defun pathname-directory (pathname &key (case :local))
  (%pathname-directory pathname case))

(defun pathname-name (pathname &key (case :local))
  (%pathname-name pathname case))

(defun pathname-type (pathname &key (case :local))
  (%pathname-type pathname case))

(defun wild-pathname-p (pathname &optional field-key)
  (%wild-pathname-p pathname field-key))

(defun wild-p (component)
  (or (eq component :wild)
      (and (stringp component)
           (position #\* component))))

(defun translate-component (source from to)
  (cond ((or (eq to :wild) (null to))
         ;; "If the piece in TO-WILDCARD is :WILD or NIL, the piece in source
         ;; is copied into the result."
         source)
        ((and to (not (wild-p to)))
        ;; "If the piece in TO-WILDCARD is present and not wild, it is copied
        ;; into the result."
         to)
        (t
         ;; "Otherwise, the piece in TO-WILDCARD might be a complex wildcard
         ;; such as "foo*bar" and the piece in FROM-WILDCARD should be wild;
         ;; the portion of the piece in SOURCE that matches the wildcard
         ;; portion of the piece in FROM-WILDCARD replaces the wildcard portion
         ;; of the piece in TO-WILDCARD and the value produced is used in the
         ;; result."
         ;; FIXME
         (error "Unsupported TO-WILDCARD pattern: ~S" to))))

;; "The resulting pathname is TO-WILDCARD with each wildcard or missing field
;; replaced by a portion of SOURCE."
(defun translate-pathname (source from-wildcard to-wildcard &key)
  (let ((source (pathname source))
        (from   (pathname from-wildcard))
        (to     (pathname to-wildcard)))
    (make-pathname :host     (or (pathname-host to)
                                 (pathname-host source))
                   :device   (translate-component (pathname-device source)
                                                  (pathname-device from)
                                                  (pathname-device to))
                   ;; FIXME directory
                   :name     (translate-component (pathname-name source)
                                                  (pathname-name from)
                                                  (pathname-name to))
                   :type     (translate-component (pathname-type source)
                                                  (pathname-type from)
                                                  (pathname-type to))
                   :version  (if (null (pathname-host from))
                                 (if (eq (pathname-version to) :wild)
                                     (pathname-version from)
                                     (pathname-version to))
                                 (translate-component (pathname-version source)
                                                      (pathname-version from)
                                                      (pathname-version to))))))

(defun canonicalize-logical-hostname (host)
  (string-upcase host))

(defun logical-pathname-translations (host)
  (gethash-2op-1ret (canonicalize-logical-hostname host)
                    *logical-pathname-translations*))

(defun %set-logical-pathname-translations (host new-translations)
  (setf (gethash (canonicalize-logical-hostname host)
                 *logical-pathname-translations*)
        new-translations))

(defsetf logical-pathname-translations %set-logical-pathname-translations)

(defun translate-logical-pathname (pathname &key)
  (typecase pathname
    (logical-pathname
     ;; FIXME
     nil)
    (pathname pathname)
    (t (translate-logical-pathname (pathname pathname)))))

(defun load-logical-pathname-translations (host)
  (declare (type string host))
  (multiple-value-bind (ignore found)
      (gethash (canonicalize-logical-hostname host)
               *logical-pathname-translations*)
    (declare (ignore ignore))
    (unless found
      (error "The logical host ~S was not found." host))))

(defun logical-pathname (pathspec)
  (typecase pathspec
    (logical-pathname pathspec)
    (string
     (%make-logical-pathname pathspec))
    (stream
     (let ((result (pathname pathspec)))
       (if (typep result 'logical-pathname)
           result
           (error 'simple-type-error
                  :datum result
                  :expected-type 'logical-pathname))))
    (t
     (error 'type-error
            :datum pathspec
            :expected-type '(or logical-pathname string stream)))))

(defun parse-namestring (thing
                         &optional host default-pathname
                         &key (start 0) end junk-allowed)
  (declare (ignore host default-pathname junk-allowed)) ; FIXME
  (typecase thing
    (stream
     (values (pathname thing) start))
    (pathname
     (values thing start))
    (string
     (unless end
       (setf end (length thing)))
     (values (pathname (subseq thing start end))
             end))
    (t
     (error 'type-error
            :format-control "~S cannot be converted to a pathname."
            :format-arguments (list thing)))))
