;;; ldb.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: ldb.lisp,v 1.3 2004-02-28 18:40:08 piso Exp $
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

(defun byte (size position)
  (cons size position))

(defun byte-size (bytespec)
  (car bytespec))

(defun byte-position (bytespec)
  (cdr bytespec))

;; For the LDB compiler macro.
(defun %ldb (size position integer)
  (logand (ash integer (- position))
	  (1- (ash 1 size))))

(defun ldb (bytespec integer)
  (logand (ash integer (- (byte-position bytespec)))
          (1- (ash 1 (byte-size bytespec)))))

(defun ldb-test (bytespec integer)
  (not (zerop (ldb bytespec integer))))

(defun dpb (newbyte bytespec integer)
  (let* ((size (byte-size bytespec))
         (position (byte-position bytespec))
         (mask (1- (ash 1 size))))
    (logior (logand integer (lognot (ash mask position)))
	    (ash (logand newbyte mask) position))))
