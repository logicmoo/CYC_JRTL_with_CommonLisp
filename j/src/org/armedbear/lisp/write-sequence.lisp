;;; write-sequence.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: write-sequence.lisp,v 1.1 2004-01-21 16:56:23 piso Exp $
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

(defun write-sequence (sequence stream &key (start 0) end)
  (require-type start '(integer 0))
  (if end
      (require-type end '(integer 0))
      (setf end (length sequence)))
  (let* ((element-type (stream-element-type stream))
         (write-function (if (eq element-type 'character)
                             #'write-char
                             #'write-byte)))
    (do ((i start (1+ i)))
        ((>= i end) sequence)
      (funcall write-function (elt sequence i) stream))))
