;;; mismatch.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: mismatch.lisp,v 1.1 2003-06-10 16:22:45 piso Exp $
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
;;; MISMATCH (from ECL)

(in-package "COMMON-LISP")

(export 'mismatch)

;;; From ECL.

(defun call-test (test test-not item keyx)
  (cond (test (funcall test item keyx))
        (test-not (not (funcall test-not item keyx)))
        (t (eql item keyx))))

(defun test-error()
  (error "both test and test are supplied"))

(defun mismatch (sequence1 sequence2 &key from-end test test-not
                           (key #'identity) start1 start2 end1 end2)
  (and test test-not (test-error))
  (with-start-end
    start1 end1 sequence1
    (with-start-end
      start2 end2 sequence2
      (if (not from-end)
          (do ((i1 start1 (1+ i1))
               (i2 start2 (1+ i2)))
              ((or (>= i1 end1) (>= i2 end2))
               (if (and (>= i1 end1) (>= i2 end2)) nil i1))
            (unless (call-test test test-not
                               (funcall key (elt sequence1 i1))
                               (funcall key (elt sequence2 i2)))
              (return i1)))
          (do ((i1 (1- end1) (1- i1))
               (i2 (1- end2)  (1- i2)))
              ((or (< i1 start1) (< i2 start2))
               (if (and (< i1 start1) (< i2 start2)) nil (1+ i1)))
            (unless (call-test test test-not
                               (funcall key (elt sequence1 i1))
                               (funcall key (elt sequence2 i2)))
              (return (1+ i1))))))))
