;;; swank-allegro.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
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

;;; Adapted from SLIME, the "Superior Lisp Interaction Mode for Emacs",
;;; originally written by Eric Marsden, Luke Gorrie and Helmut Eller.

(eval-when (:compile-toplevel :load-toplevel :execute)
  (require :sock)
  (require :process))

(in-package #:swank)

(defun create-socket (host port)
  (socket:make-socket :connect :passive :local-port port
                      :local-host host :reuse-address t))

(defun local-port (socket)
  (socket:local-port socket))

(defun close-socket (socket)
  (close socket))

(defun accept-connection (socket)
  (socket:accept-connection socket :wait t))

(defun make-thread (function)
  (mp:process-run-function nil function))

(defun arglist (function-name)
  (multiple-value-bind (arglist known-p) (excl:arglist function-name)
    (if known-p
        arglist
        :not-available))))

(defun find-definitions (name)
  (declare (ignore name)))
