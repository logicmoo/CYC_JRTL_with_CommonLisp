;;; dotimes.lisp
;;;
;;; Copyright (C) 2004 Peter Graves
;;; $Id: dotimes.lisp,v 1.3 2004-12-11 18:16:08 piso Exp $
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

(defmacro dotimes ((var count &optional (result nil)) &body body)
  (multiple-value-bind (forms decls) (parse-body body nil)
    (if (numberp count)
        (let ((top (gensym "TOP-"))
              (test (gensym "TEST-")))
          `(block nil
             (let ((,var 0))
               ,@decls
               (tagbody
                (go ,test)
                ,top
                ,@forms
                (setq ,var (1+ ,var))
                ,test
                (when (< ,var ,count)
                  (go ,top))
                (return-from nil (progn ,result))
                ))))
        (let ((limit (gensym "LIMIT-"))
              (top (gensym "TOP-"))
              (test (gensym "TEST-")))
          `(block nil
             (let ((,limit ,count)
                   (,var 0))
               ,@decls
               (tagbody
                (go ,test)
                ,top
                ,@forms
                (setq ,var (1+ ,var))
                ,test
                (when (< ,var ,limit)
                  (go ,top))
                (return-from nil (progn ,result))
                )))))))
