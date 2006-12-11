;;; swank-xcl.lisp
;;;
;;; Copyright (C) 2006 Peter Graves <peter@armedbear.org>
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
;;; Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.

;;; Adapted from SLIME, the "Superior Lisp Interaction Mode for Emacs",
;;; originally written by Eric Marsden, Luke Gorrie and Helmut Eller.

(in-package "SWANK")

(defun create-socket (host port)
  (ext:make-socket :connect :passive :local-port port :local-host host))

(defun local-port (socket)
  (ext:local-port socket))

(defun close-socket (socket)
  )

(defun accept-connection (socket)
  (ext:accept-connection socket))

(defun make-thread (function)
  (ext:make-thread function))

(defun arglist (function-name)
  :not-available)

(defun find-definitions (name)
  (when (ext:autoloadp name)
    (let ((*load-verbose* nil)
          (*load-print* nil)
          (ext:*autoload-verbose* nil))
      (ext:resolve name)))
  (let ((source (ext:source name)))
    (cond ((and source (not (eq source :top-level)))
           `((,(princ-to-string name)
              (:location
               (:file ,(namestring (ext:source-pathname name)))
               (:position ,(or (ext:source-file-position name) 0) t)
               (:function-name ,(symbol-name name))))))
          ((not (null ext:*xcl-home*))
           (let ((tagfile (merge-pathnames "tags" ext:*xcl-home*)))
             (when (and tagfile (probe-file tagfile))
               (with-open-file (s tagfile)
                 (loop
                   (let ((text (read-line s nil :eof)))
                     (cond ((eq text :eof)
                            (return))
                           ((string-equal name (string (read-from-string text nil nil)))
                            ;; Found it!
                            (with-input-from-string (string-stream text)
                              (let* ((symbol (read string-stream text nil nil)) ; Ignored.
                                     (file (read string-stream text nil nil)))
                                (declare (ignore symbol))
                                (return `((,(princ-to-string name)
                                           (:location
                                            (:file ,(namestring file))))))))))))))))

          (t
           nil))))

(defun swank-interrupt-lisp ()
  (sys:interrupt-lisp))
