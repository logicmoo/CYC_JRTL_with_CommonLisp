;;; fill.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: fill.lisp,v 1.1 2003-06-10 16:05:43 piso Exp $
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

(in-package "COMMON-LISP")

(export 'fill)

;;; From CMUCL.

(defmacro vector-fill (sequence item start end)
  `(do ((index ,start (1+ index)))
       ((= index ,end) ,sequence)
     (setf (aref ,sequence index) ,item)))

(defmacro list-fill (sequence item start end)
  `(do ((current (nthcdr ,start ,sequence) (cdr current))
        (index ,start (1+ index)))
       ((or (atom current) (and end (= index ,end)))
        sequence)
     (rplaca current ,item)))

(defun list-fill* (sequence item start end)
  (list-fill sequence item start end))

(defun vector-fill* (sequence item start end)
  (when (null end) (setq end (length sequence)))
  (vector-fill sequence item start end))

(defun fill (sequence item &key (start 0) end)
  (if (listp sequence)
      (list-fill* sequence item start end)
      (vector-fill* sequence item start end)))

