;;; fill.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id$
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

;;; Adapted from CMUCL.

(defun list-fill (sequence item start end)
  (do ((current (nthcdr start sequence) (cdr current))
       (index start (1+ index)))
      ((or (atom current) (and end (= index end)))
       sequence)
    (rplaca current item)))

(defun vector-fill (sequence item start end)
  (unless end
    (setf end (length sequence)))
  (do ((index start (1+ index)))
      ((= index end) sequence)
    (setf (aref sequence index) item)))

(defun fill (sequence item &key (start 0) end)
  (cond ((listp sequence)
         (list-fill sequence item start end))
        ((and (stringp sequence)
              (zerop start)
              (null end))
         (simple-string-fill sequence item))
        (t
         (vector-fill sequence item start end))))
