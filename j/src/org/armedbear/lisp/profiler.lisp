;;; profiler.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: profiler.lisp,v 1.10 2004-08-22 01:11:52 piso Exp $
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

(in-package "PROFILER")

(defparameter *type* nil)

(defparameter *granularity* 1 "Sampling interval (in milliseconds).")

;; Returns list of all symbols with non-zero call counts.
(defun list-calls ()
  (let ((result nil))
    (dolist (pkg (list-all-packages))
      (dolist (sym (sys::package-symbols pkg))
        (when (fboundp sym)
          (let* ((f (fdefinition sym))
                 (n (sys::%call-count f)))
            (unless (zerop n)
              (setq result (cons sym result)))))))
    result))

(defun show-call-count-for-symbol (sym max-count)
  (let ((count (sys::%call-count (fdefinition sym))))
    (if max-count
        (format t "~A ~A ~A (~A%)~%"
                sym
                (if (compiled-function-p (fdefinition sym))
                    ""
                    "[interpreted function]")
                count
                (/ (round (/ (* count 10000.0) max-count)) 100.0))
        (format t "~A ~A~%" sym count))))

(defun show-call-counts ()
  (let ((syms (list-calls)))
    (setf syms (sort syms #'<
                     :key #'(lambda (x) (sys::%call-count (fdefinition x)))))
    (let ((max-count nil))
      (when (eq *type* :time)
        (let* ((last-sym (car (last syms))))
          (setf max-count (if last-sym
                              (sys::%call-count (fdefinition last-sym))
                              nil))
          (when (eql max-count 0)
            (setf max-count nil))))
      (dolist (sym syms)
        (show-call-count-for-symbol sym max-count))))
  (values))

(defun start-profiler (&key type)
  "Starts the profiler.
  :TYPE may be either :TIME (statistical sampling) or :COUNT-ONLY (exact call
  counts)."
  (unless type
    (setf type :time))
  (unless (memq type '(:time :count-only))
    (error ":TYPE must be :TIME or :COUNT-ONLY"))
  (setf *type* type)
  (%start-profiler type *granularity*))

(defmacro with-profiling ((&key type) &body body)
  `(unwind-protect (progn (start-profiler :type ,type) ,@body)
                   (stop-profiler)))
