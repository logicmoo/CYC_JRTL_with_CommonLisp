;;; lcm.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id: lcm.lisp,v 1.1 2003-09-11 01:44:15 piso Exp $
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

(defun two-arg-lcm (n m)
  (cond ((zerop n) 0)
        ((zerop m) 0)
        (t
         (/ (abs (* n m)) (gcd n m)))))

(defun lcm (&rest numbers)
  (unless (every #'integerp numbers)
    (error 'type-error "arguments to LCM must be integers"))
  (case (length numbers)
    (0 1)
    (1 (abs (car numbers)))
    (2 (two-arg-lcm (car numbers) (cadr numbers)))
    (t
     (do ((result (car numbers) (two-arg-lcm result (car rest)))
          (rest (cdr numbers) (cdr rest)))
         ((null rest) result)))))
