;;; source-location.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $$
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

(defvar *symbols-defined-in-this-file* ()
  "Keeps track of symbols defined in the .abcl file during loading.")

(defstruct source-info kind path position snippet)

(defun new-source (symbol &key kind path position snippet) 
  (unless (symbolp symbol) 
    (setq symbol (cadr symbol)))
  (assert (symbolp symbol))
  (unless (member symbol *symbols-defined-in-this-file*)
    (setf (get symbol 'sys::sources)
          (delete-if (lambda (p) (string= p path))
                     (get symbol 'sys::sources)
                     :key #'source-info-path)))
  (push 
   (make-source-info :kind kind 
                     :path path 
                     :position position
                     :snippet snippet)
   (get symbol 'sys::sources))
  (push symbol *symbols-defined-in-this-file*))

(provide :source-location)