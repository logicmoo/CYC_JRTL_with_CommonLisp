;;; dotimes.lisp
;;;
;;; Copyright (C) 2004-2005 Peter Graves
;;; $Id: dotimes.lisp,v 1.8 2005-11-14 16:03:08 piso Exp $
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

(in-package #:system)

(defmacro dotimes ((var count &optional (result nil)) &body body)
  (multiple-value-bind (forms decls) (parse-body body nil)
    (if (numberp count)
        (let ((counter (gensym "COUNTER-"))
              (top     (gensym "TOP-"))
              (test    (gensym "TEST-")))
          `(block nil
             (let ((,var 0)
                   (,counter 0))
               (declare (type (integer 0 ,count) ,counter))
               (declare (ignorable ,var))
               ,@decls
               (tagbody
                (go ,test)
                ,top
                ,@forms
                (setq ,counter (1+ ,counter))
                (setq ,var ,counter)
                ,test
                (when (< ,counter ,count)
                  (go ,top))
                (return-from nil (progn ,result))))))
        (let ((limit   (gensym "LIMIT-"))
              (counter (gensym "COUNTER-"))
              (top     (gensym "TOP-")))
          `(block nil
             (let ((,var 0)
                   (,limit ,count)
                   (,counter 0))
               (declare (ignorable ,var))
               ,@decls
               (when (> ,limit 0)
                 (tagbody
                  ,top
                  ,@forms
                  (setq ,counter (1+ ,counter))
                  (setq ,var ,counter)
                  (when (< ,counter ,limit)
                    (go ,top))))
               (return-from nil (progn ,result))))))))
