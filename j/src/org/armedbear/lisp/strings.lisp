;;; strings.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: strings.lisp,v 1.7 2004-08-15 11:25:36 piso Exp $
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

(defun string-upcase (string &key (start 0) end)
  (%string-upcase string start end))

(defun string-downcase (string &key (start 0) end)
  (%string-downcase string start end))

(defun string-capitalize (string &key (start 0) end)
  (%string-capitalize string start end))

(defun nstring-upcase (string &key (start 0) end)
  (%nstring-upcase string start end))

(defun nstring-downcase (string &key (start 0) end)
  (%nstring-downcase string start end))

(defun nstring-capitalize (string &key (start 0) end)
  (%nstring-capitalize string start end))

(defun string= (string1 string2 &key (start1 0) end1 (start2 0) end2)
  (%string= string1 string2 start1 end1 start2 end2))

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


;;; STRING-LEFT-TRIM, STRING-RIGHT-TRIM, STRING-TRIM (from OpenMCL)

(defun string-left-trim (char-bag string &aux end)
  "Given a set of characters (a list or string) and a string, returns
   a copy of the string with the characters in the set removed from the
   left end."
  (setq string (string string))
  (setq end (length string))
  (do ((index 0 (+ index 1)))
      ((or (= index end) (not (find (aref string index) char-bag)))
       (subseq string index end))))

(defun string-right-trim (char-bag string &aux end)
  "Given a set of characters (a list or string) and a string, returns
   a copy of the string with the characters in the set removed from the
   right end."
  (setq string (string string))
  (setq end (length string))
  (do ((index (- end 1) (- index 1)))
      ((or (< index 0) (not (find (aref string index) char-bag)))
       (subseq string 0 (+ index 1)))))

(defun string-trim (char-bag string &aux end)
  "Given a set of characters (a list or string) and a string, returns a
   copy of the string with the characters in the set removed from both
   ends."
  (setq string (string string))
  (setq end (length string))
  (let ((left-end) (right-end))
    (do ((index 0 (+ index 1)))
        ((or (= index end) (not (find (aref string index) char-bag)))
         (setq left-end index)))
    (do ((index (- end 1) (- index 1)))
        ((or (< index left-end) (not (find (aref string index) char-bag)))
         (setq right-end index)))
    (subseq string left-end (+ right-end 1))))
