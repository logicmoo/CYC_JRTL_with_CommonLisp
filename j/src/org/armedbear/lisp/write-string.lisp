;;; write-string.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: write-string.lisp,v 1.2 2004-06-07 02:08:29 piso Exp $
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

(defun write-string (string &optional stream &key start end)
  (unless start
    (setf start 0))
  (if end
      (setf end (min end (length string)))
      (setf end (length string)))
  (%write-string string stream start end))

(defun write-line (string &optional stream &key start end)
  (prog1 (write-string string stream :start start :end end)
         (%terpri stream)))
