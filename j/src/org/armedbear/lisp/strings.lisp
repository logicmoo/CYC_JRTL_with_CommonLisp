;;; strings.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: strings.lisp,v 1.3 2003-04-25 02:04:13 piso Exp $
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

(export '(string-upcase string-downcase
          nstring-upcase nstring-downcase
          string= string/= string-equal string-not-equal
          string< string>
          string<= string>=
          string-lessp string-greaterp
          string-not-lessp string-not-greaterp))

(defun string-upcase (string &key (start 0) end)
  (%string-upcase string start end))

(defun string-downcase (string &key (start 0) end)
  (%string-downcase string start end))

(defun nstring-upcase (string &key (start 0) end)
  (%nstring-upcase string start end))

(defun nstring-downcase (string &key (start 0) end)
  (%nstring-downcase string start end))

(defun string= (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string= string1 string2 start1 end1 start2 end2)))

(defun string/= (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string/= string1 string2 start1 end1 start2 end2)))

(defun string-equal (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string-equal string1 string2 start1 end1 start2 end2)))

(defun string-not-equal (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string-not-equal string1 string2 start1 end1 start2 end2)))

(defun string< (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string< string1 string2 start1 end1 start2 end2)))

(defun string> (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string> string1 string2 start1 end1 start2 end2)))

(defun string<= (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string<= string1 string2 start1 end1 start2 end2)))

(defun string>= (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string>= string1 string2 start1 end1 start2 end2)))

(defun string-lessp (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string-lessp string1 string2 start1 end1 start2 end2)))

(defun string-greaterp (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string-greaterp string1 string2 start1 end1 start2 end2)))

(defun string-not-lessp (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string-not-lessp string1 string2 start1 end1 start2 end2)))

(defun string-not-greaterp (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (let* ((string1 (string string1))
         (string2 (string string2))
         (end1 (or end1 (length string1)))
         (end2 (or end2 (length string2))))
    (%string-not-greaterp string1 string2 start1 end1 start2 end2)))
