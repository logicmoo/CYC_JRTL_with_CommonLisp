;;; chars.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: chars.lisp,v 1.13 2004-04-23 00:51:39 piso Exp $
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

;;; From CMUCL.

(defun alphanumericp (char)
  (or (digit-char-p char) (alpha-char-p char)))

(defun char/= (character &rest more-characters)
  (do* ((head character (car list))
	(list more-characters (cdr list)))
       ((atom list) T)
    (unless (do* ((l list (cdr l)))                  ;inner loop returns T
		 ((atom l) T)			     ; iff head /= rest.
	      (if (eql head (car l)) (return nil)))
      (return nil))))

(defun char< (character &rest more-characters)
  (do* ((c character (car list))
	(list more-characters (cdr list)))
       ((atom list) T)
    (unless (< (char-int c)
	       (char-int (car list)))
      (return nil))))

(defun char> (character &rest more-characters)
  (do* ((c character (car list))
	(list more-characters (cdr list)))
       ((atom list) T)
    (unless (> (char-int c)
	       (char-int (car list)))
      (return nil))))

(defun char>= (character &rest more-characters)
  (do* ((c character (car list))
	(list more-characters (cdr list)))
       ((atom list) T)
    (unless (>= (char-int c)
		(char-int (car list)))
      (return nil))))

(defmacro equal-char-code (character)
  `(let ((ch (char-code ,character)))
     (if (< 96 ch 123) (- ch 32) ch)))

(defun char-not-equal (character &rest more-characters)
  (do* ((head character (car list))
	(list more-characters (cdr list)))
       ((atom list) T)
    (unless (do* ((l list (cdr l)))
		 ((atom l) T)
	      (if (= (equal-char-code head)
		     (equal-char-code (car l)))
		  (return nil)))
      (return nil))))

(eval-when (:execute)
  (when (and (fboundp 'jvm::jvm-compile) (not (autoloadp 'jvm::jvm-compile)))
    (mapcar #'jvm::jvm-compile '(alphanumericp
                                 char/=
                                 char<
                                 char>
                                 char>=
                                 char-not-equal))))
