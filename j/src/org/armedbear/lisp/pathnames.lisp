;;; pathnames.lisp
;;;
;;; Copyright (C) 2003-2005 Peter Graves
;;; $Id: pathnames.lisp,v 1.14 2005-09-12 23:31:34 piso Exp $
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

(defun component-match-p (thing wild ignore-case)
  (cond ((eq wild :wild)
         t)
        ((null wild)
         t)
        (ignore-case
         (equalp thing wild))
        (t
         (equal thing wild))))

(defun directory-match-components (thing wild ignore-case)
  (loop
    (cond ((endp thing)
           (return (endp wild)))
          ((endp wild)
           (return nil)))
    (let ((x (car thing))
          (y (car wild)))
      (when (eq y :wild-inferiors)
        (return t))
      (unless (component-match-p x y ignore-case)
        (return nil))
      (setf thing (cdr thing)
            wild  (cdr wild)))))

(defun directory-match-p (thing wild ignore-case)
  (cond ((eq wild :wild)
         t)
        ((null wild)
         t)
        ((and ignore-case (equalp thing wild))
         t)
        ((equal thing wild)
         t)
        ((and (consp thing) (consp wild))
         (if (eq (%car thing) (%car wild))
             (directory-match-components (%cdr thing) (%cdr wild) ignore-case)
             nil))
        (t
         nil)))

(defun pathname-match-p (pathname wildcard)
  (setf pathname (pathname pathname)
        wildcard (pathname wildcard))
  (unless (component-match-p (pathname-host pathname) (pathname-host wildcard) nil)
    (return-from pathname-match-p nil))
  (let* ((windows-p (featurep :windows))
         (ignore-case (or windows-p (typep pathname 'logical-pathname))))
    (cond ((and windows-p
                (not (component-match-p (pathname-device pathname)
                                        (pathname-device wildcard)
                                        ignore-case)))
           nil)
          ((not (directory-match-p (pathname-directory pathname)
                                   (pathname-directory wildcard)
                                   ignore-case))
           nil)
          ((not (component-match-p (pathname-name pathname)
                                   (pathname-name wildcard)
                                   ignore-case))
           nil)
          ((not (component-match-p (pathname-type pathname)
                                   (pathname-type wildcard)
                                   ignore-case))
           nil)
          (t
           t))))

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

(defun translate-directory (source from to)
  ;; FIXME The IGNORE-CASE argument to DIRECTORY-MATCH-P should not be nil on
  ;; Windows or if the source pathname is a logical pathname.
  (unless (directory-match-p source from nil)
    (error "~S and ~S do not match." source from))
  (translate-component source from to))

;; "The resulting pathname is TO-WILDCARD with each wildcard or missing field
;; replaced by a portion of SOURCE."
(defun translate-pathname (source from-wildcard to-wildcard &key)
  (let ((source (pathname source))
        (from   (pathname from-wildcard))
        (to     (pathname to-wildcard)))
    (make-pathname :host      (or (pathname-host to)
                                  (pathname-host source))
                   :device    (translate-component (pathname-device source)
                                                   (pathname-device from)
                                                   (pathname-device to))
                   :directory (translate-directory (pathname-directory source)
                                                   (pathname-directory from)
                                                   (pathname-directory to))
                   :name      (translate-component (pathname-name source)
                                                   (pathname-name from)
                                                   (pathname-name to))
                   :type      (translate-component (pathname-type source)
                                                   (pathname-type from)
                                                   (pathname-type to))
                   :version   (if (null (pathname-host from))
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

(defun logical-host-p (host)
  (multiple-value-bind (translations present)
      (gethash (canonicalize-logical-hostname host)
               *logical-pathname-translations*)
    (declare (ignore translations))
    present))

(defsetf logical-pathname-translations %set-logical-pathname-translations)

(defun translate-logical-pathname (pathname &key)
  (typecase pathname
    (logical-pathname
     (let* ((host (pathname-host pathname))
            (translations (logical-pathname-translations host)))
       (dolist (translation translations
                            (error 'file-error
                                   :pathname pathname
                                   :format-control "No translation for ~S"
                                   :format-arguments (list pathname)))
         (let ((from-wildcard (car translation))
               (to-wildcard (cadr translation)))
           (when (pathname-match-p pathname from-wildcard)
             (return (translate-logical-pathname
                      (translate-pathname pathname from-wildcard to-wildcard))))))))
    (pathname pathname)
    (t
     (translate-logical-pathname (pathname pathname)))))

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
  (declare (ignore default-pathname junk-allowed)) ; FIXME
  (when host
    (setf host (canonicalize-logical-hostname host)))
  (typecase thing
    (stream
     (values (pathname thing) start))
    (pathname
     (values thing start))
    (string
     (unless end
       (setf end (length thing)))
     (values (coerce-to-pathname thing host)
             end))
    (t
     (error 'type-error
            :format-control "~S cannot be converted to a pathname."
            :format-arguments (list thing)))))
