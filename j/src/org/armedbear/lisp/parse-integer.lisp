;;; parse-integer.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: parse-integer.lisp,v 1.1 2003-06-06 17:05:37 piso Exp $
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

;;; From OpenMCL.

(defun parse-integer (string &key (start 0) end
                             (radix 10) junk-allowed)
  (when (null end)
    (setq end (length string)))
  (let ((index (do ((i start (1+ i)))
                   ((= i end)
                    (if junk-allowed
                        (return-from parse-integer (values nil end))
                        (error "not an integer string: ~S" string)))
                 (unless (whitespacep (char string i)) (return i))))
        (minusp nil)
        (found-digit nil)
        (result 0))
    (let ((char (char string index)))
      (cond ((char= char #\-)
             (setq minusp t)
             (setq index (1+ index)))
            ((char= char #\+)
             (setq index (1+ index)))))
    (loop
      (when (= index end) (return nil))
      (let* ((char (char string index))
             (weight (digit-char-p char radix)))
        (cond (weight
               (setq result (+ weight (* result radix))
                     found-digit t))
              (junk-allowed (return nil))
              ((whitespacep char)
               (until (eq (setq index (1+ index)) end)
                      (unless (whitespacep (char string index))
                        (error "not an integer string: ~S" string)))
               (return nil))
              (t
               (error "not an integer string: ~S" string))))
      (setq index (1+ index)))
    (values
     (if found-digit
         (if minusp (- result) result)
         (if junk-allowed
             nil
             (error "not an integer string: ~S" string)))
     index)))
