;;; with-thread-lock.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: with-thread-lock.lisp,v 1.1 2004-06-03 21:33:46 asimon Exp $
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

(in-package "EXTENSIONS")

(defmacro with-thread-lock ((lock) &body body)
  (let ((glock (gensym)))
    `(let ((,glock ,lock))
       (unwind-protect 
        (progn 
          (thread-lock ,glock)
          ,@body)
	 (thread-unlock ,glock)))))