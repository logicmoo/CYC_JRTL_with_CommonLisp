;;; replace.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: replace.lisp,v 1.2 2003-07-02 16:42:23 piso Exp $
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

(export 'replace)

;;; REPLACE (from ECL)

(defun bad-seq-limit (x &optional y)
  (error "bad sequence limit ~a" (if y (list x y) x)))

(defun the-end (x y)
  (cond ((sys:fixnump x)
	 (unless (<= x (length y))
	   (bad-seq-limit x))
	 x)
	((null x)
	 (length y))
	(t (bad-seq-limit x))))

(defun the-start (x)
  (cond ((sys:fixnump x)
	 (unless (>= x 0)
           (bad-seq-limit x))
	 x)
	((null x) 0)
	(t (bad-seq-limit x))))

(defmacro with-start-end (start end seq &body body)
  `(let* ((,start (if ,start (the-start ,start) 0))
          (,end (the-end ,end ,seq)))
     (unless (<= ,start ,end) (bad-seq-limit ,start ,end))
     ,@ body))

(defun replace (sequence1 sequence2
                          &key start1  end1
                          start2 end2 )
  (with-start-end start1 end1 sequence1
    (with-start-end start2 end2 sequence2
      (if (and (eq sequence1 sequence2)
               (> start1 start2))
          (do* ((i 0 (1+ i))
                (l (if (< (- end1 start1)
                          (- end2 start2))
                       (- end1 start1)
                       (- end2 start2)))
                (s1 (+ start1 (1- l)) (1- s1))
                (s2 (+ start2 (1- l)) (1- s2)))
               ((>= i l) sequence1)
            (setf (elt sequence1 s1) (elt sequence2 s2)))
          (do ((i 0 (1+ i))
               (l (if (< (- end1 start1)
                         (- end2 start2))
                      (- end1 start1)
                      (- end2 start2)))
               (s1 start1 (1+ s1))
               (s2 start2 (1+ s2)))
              ((>= i l) sequence1)
            (setf (elt sequence1 s1) (elt sequence2 s2)))))))
