;;; compile-file.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: compile-file.lisp,v 1.2 2004-03-02 00:04:11 piso Exp $
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

(defun compile-file (input-file &key output-file verbose print external-format)
  (unless output-file
    (setf output-file (compile-file-pathname input-file)))
  (with-open-file (in input-file :direction :input)
    (with-open-file (out output-file :direction :output :if-exists :supersede)
      (loop
        (let ((line (read-line in nil :eof)))
          (when (eq line :eof)
            (return))
          (write-line line out)))))
  (values (truename output-file) nil nil))
