;;; profiler.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: profiler.lisp,v 1.7 2003-11-12 21:26:59 piso Exp $
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

;; SHOW-CALL-COUNTS and PROFILE are exported in Lisp.java.

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
        (format t "~A ~A (~A%)~%" sym count
                (/ (round (/ (* count 10000.0) max-count)) 100.0))
        (format t "~A ~A~%" sym count))))

(defun show-call-counts ()
  (let ((syms (list-calls)))
    (setf syms (sort syms #'<
                     :key #'(lambda (x) (sys::%call-count (fdefinition x)))))
    (let* ((last-sym (car (last syms)))
           (max-count (if last-sym
                          (sys::%call-count (fdefinition last-sym))
                          nil)))
      (when (zerop max-count)
        (setf max-count nil))
      (dolist (sym syms)
        (show-call-count-for-symbol sym max-count))))
  (values))

(defmacro profile (&rest forms)
  `(progn (start-profiler) ,@forms (stop-profiler)))
