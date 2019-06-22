;;; -*- mode: lisp; package: jnil -*-
;;; Copyright (c) 2004-2005 Tiago Maduro-Dias. All Rights Reserved.
;;;
;;; This code is free software; you can redistribute it and/or
;;; modify it under the terms of the version 2.1 of
;;; the GNU Lesser General Public License as published by 
;;; the Free Software Foundation, as clarified by the preamble
;;; found in license-llgpl.txt.
;;;
;;; This code is distributed in the hope that it will be useful,
;;; but without any warranty; without even the implied warranty of
;;; merchantability or fitness for a particular purpose. See the GNU
;;; Lesser General Public License for more details.
;;;
;;; Version 2.1 of the GNU Lesser General Public License is in the file 
;;; license-lgpl.txt that was distributed with this file.
;;; If it is not present, you can access it from
;;; http://www.gnu.org/copyleft/lesser.txt (until superseded by a newer
;;; version) or write to the Free Software Foundation, Inc., 59 Temple Place, 
;;; Suite 330, Boston, MA  02111-1307  USA
;;;
;;; This code is free software; you can redistribute it and/or
;;; modify it under the terms of the version 2.1 of
;;; the GNU Lesser General Public License as published by 
;;; the Free Software Foundation, as clarified by the preamble
;;; found in license-llgpl.txt.
;;;
;;; This code is distributed in the hope that it will be useful,
;;; but without any warranty; without even the implied warranty of
;;; merchantability or fitness for a particular purpose. See the GNU
;;; Lesser General Public License for more details.
;;;
;;; Version 2.1 of the GNU Lesser General Public License is in the file 
;;; license-lgpl.txt that was distributed with this file.
;;; If it is not present, you can access it from
;;; http://www.gnu.org/copyleft/lesser.txt (until superseded by a newer
;;; version) or write to the Free Software Foundation, Inc., 59 Temple Place, 
;;; Suite 330, Boston, MA  02111-1307  USA
;;;
;;; $Id: common-knowledge.lisp,v 1.1.1.1 2006/04/23 17:11:46 tdias Exp $
;;;
;;; Description: Visitor for generation of basic pieces of code.
;;;
;;; -- start of common-knowledge.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defvisitor common-knowledge 5 (:common-lisp) (:translate-sdk-calls-to-native))

(defcoder (vis common-knowledge) (node class-instance-creation)
  (let ((addit-knowledge-coder (find-addit-knowledge-coder node)))
    (when addit-knowledge-coder
      (msg "Generating direct Java translation for class instance creation")
      (funcall addit-knowledge-coder 
               :visitor vis
               :node node
               :args (collect-code (instance-creation-args node))))))

(defcoder (vis common-knowledge) (node method-invocation)
  (let ((addit-knowledge-coder (find-addit-knowledge-coder node))
        (invocation-expr (invocation-expression node)))
    (when addit-knowledge-coder
      (msg "Generating direct Java translation for method invocation")
      (funcall addit-knowledge-coder
               :visitor vis
               :node node
               :args (append (mklist (and invocation-expr 
                                          (not (static-invocation-p node))
                                          (node-code invocation-expr)))
                             (collect-code (invocation-args node)))))))

;;;(defcoder (vis common-knowledge) (node throw-statement)
;;;  (let ((throw-expr (throw-expression node)))
;;;    (when (class-instance-creation-p throw-expr)
;;;      (let ((addit-knowledge-coder (find-addit-knowledge-coder node)))
;;;        (when addit-knowledge-coder
;;;          (msg "Generating direct Java translation for throw statement")
;;;          (funcall addit-knowledge-coder 
;;;                   :visitor vis
;;;                   :node node
;;;                   :args (cons (node-code throw-expr)
;;;                               (collect-code (instance-creation-args throw-expr)))))))))
;;;
;;;(defcoder (vis common-knowledge) (node catch-clause)
;;;  #+nil(let ((addit-knowledge-coder (find-addit-knowledge-coder node)))
;;;         (when addit-knowledge-coder
;;;           (msg "Generating direct Java translation for throw statement")
;;;           (funcall addit-knowledge-coder
;;;                    :visitor vis
;;;                    :node node
;;;                    :args (cons (node-code (invocation-expression node))
;;;                                (collect-code (invocation-args node)))))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of common-knowledge.lisp --
