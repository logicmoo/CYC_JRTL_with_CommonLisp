;;; inspect.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: inspect.lisp,v 1.4 2004-05-22 17:29:12 piso Exp $
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

(require 'clos)

(defun inspect (obj)
  (format t "~A~%" (inspected-description obj))
  (cond ((typep obj 'standard-object)
         (do ((slots (class-slots (class-of obj)) (cdr slots))
              (i 0 (1+ i)))
             ((null slots))
           (let* ((slot (car slots))
                  (name (slot-definition-name slot)))
             (format t "   ~D ~A -> ~S~%" i name
                     (if (slot-boundp obj name) (slot-value obj name) +slot-unbound+)))))
        ((vectorp obj)
         (let ((limit (min (length obj) 25)))
           (dotimes (i limit)
             (format t "  ~D-> ~A~%" i (inspected-description (aref obj i))))))
        (t
         (let ((parts (inspected-parts obj))
               (i 0))
           (dolist (part parts)
             (format t "  ~D ~A -> ~S~%" i (car part) (cdr part))
             (incf i)))))
  (values))
