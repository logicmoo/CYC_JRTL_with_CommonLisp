;;; known-symbols.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: known-symbols.lisp,v 1.1 2005-11-06 12:00:03 piso Exp $
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

(export 'lookup-known-symbol)

(let ((ht (make-hash-table :test 'eq :size 1024)))
  (defun initialize-known-symbols ()
    (clrhash ht)
    (let* ((symbol-class (java:jclass "org.armedbear.lisp.Symbol"))
           (fields (java:jclass-fields symbol-class :declared t :public t)))
      (dotimes (i (length fields))
        (let* ((field (aref fields i))
               (type (java:jfield-type field)))
          (when (equal type symbol-class)
            (let* ((name (java:jfield-name field))
                   (symbol (java:jfield symbol-class name)))
              (puthash symbol ht name))))))
    (hash-table-count ht))

  (initialize-known-symbols)

  (defun lookup-known-symbol (symbol)
    (gethash-2op-1ret symbol ht)))

(provide '#:known-symbols)
