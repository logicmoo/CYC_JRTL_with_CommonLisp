;;; known-symbols.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: known-symbols.lisp,v 1.3 2005-12-04 13:35:16 piso Exp $
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

(export '(lookup-known-symbol lookup-known-keyword))

(let ((symbols (make-hash-table :test 'eq :size 1024))
      (keywords (make-hash-table :test 'eq :size 128)))
  (defun initialize-known-symbols (source ht)
    (clrhash ht)
    (let* ((source-class (java:jclass source))
           (symbol-class (java:jclass "org.armedbear.lisp.Symbol"))
           (fields (java:jclass-fields source-class :declared t :public t)))
      (dotimes (i (length fields))
        (let* ((field (aref fields i))
               (type (java:jfield-type field)))
          (when (equal type symbol-class)
            (let* ((name (java:jfield-name field))
                   (symbol (java:jfield source-class name)))
              (puthash symbol ht name))))))
    (hash-table-count ht))

  (initialize-known-symbols "org.armedbear.lisp.Symbol" symbols)
  (initialize-known-symbols "org.armedbear.lisp.Keyword" keywords)

  (defun lookup-known-symbol (symbol)
    (gethash1 symbol symbols))

  (defun lookup-known-keyword (keyword)
    (gethash1 keyword keywords)))

(provide '#:known-symbols)
