;;; mask-field.lisp
;;;
;;; Copyright (C) 2003 Peter Graves
;;; $Id$
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

;;; From CMUCL.

(defun mask-field (bytespec integer)
  (let ((size (byte-size bytespec))
        (pos (byte-position bytespec)))
    (logand integer (ash (1- (ash 1 size)) pos))))

(define-setf-expander mask-field (bytespec place &environment env)
  (multiple-value-bind (dummies vals newval setter getter)
    (get-setf-expansion place env)
    (let ((btemp (gensym))
	  (gnuval (gensym)))
      (values (cons btemp dummies)
	      (cons bytespec vals)
	      (list gnuval)
	      `(let ((,(car newval) (deposit-field ,gnuval ,btemp ,getter)))
		 ,setter
		 ,gnuval)
	      `(mask-field ,btemp ,getter)))))
