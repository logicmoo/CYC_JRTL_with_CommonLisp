;;; shiftf.lisp
;;;
;;; Copyright (C) 2003-2004 Peter Graves
;;; $Id: shiftf.lisp,v 1.2 2004-04-02 18:05:27 piso Exp $
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

(in-package "SYSTEM")

(require '#:collect)

(defmacro shiftf (&rest args &environment env)
  "One or more SETF-style place expressions, followed by a single
   value expression.  Evaluates all of the expressions in turn, then
   assigns the value of each expression to the place on its left,
   returning the value of the leftmost."
  (when args
    (collect ((let*-bindings) (mv-bindings) (setters) (getters))
             ;; The last arg isn't necessarily a place, so we have to handle
             ;; that separately.
             (dolist (arg (butlast args))
               (multiple-value-bind
                 (temps subforms store-vars setter getter)
                 (get-setf-expansion arg env)
                 (loop
                   for temp in temps
                   for subform in subforms
                   do (let*-bindings `(,temp ,subform)))
                 (mv-bindings store-vars)
                 (setters setter)
                 (getters getter)))
             ;; Handle the last arg specially here.  Just put something to
             ;; force the setter so the setter for the previous var gets set,
             ;; and the getter is just the last arg itself.
             (setters nil)
             (getters (car (last args)))

             (labels ((thunk (mv-bindings getters)
                             (if mv-bindings
                                 `((multiple-value-bind
                                     ,(car mv-bindings)
                                     ,(car getters)
                                     ,@(thunk (cdr mv-bindings) (cdr getters))))
                                 `(,@(butlast (setters))))))
                     `(let* ,(let*-bindings)
                        (multiple-value-bind ,(car (mv-bindings))
                          ,(car (getters))
                          ,@(thunk (mv-bindings) (cdr (getters)))
                          (values ,@(car (mv-bindings)))))))))
