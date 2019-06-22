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
;;; $Id: annotator.lisp,v 1.3 2006/05/30 21:24:31 tdias Exp $
;;;
;;; Description: Visitor for additional AST annotation.
;;;
;;; -- start of annotator.lisp --

(in-package :jnil)

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbol definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(defvisitor annotator 0 (:linj :common-lisp))

(defvisit annotator (node variable-declaration-fragment)
  (let ((initializer (declaration-initializer node)))
    (when initializer
      (msg "Annotating variable declaration fragments")
      (setf (an initializer :declared-type) (type-name node)))))

(defvisit (vis annotator) (node method-declaration)
  (cond ((common-lisp-function-p (java-to-lisp-name (declaration-name node)))
         (msg "Annotating method declaration context")
         (setf (an node :sendable-method-p) t
               (an (unit-package (find-context node 'compilation-unit)) :jnil-lib-required-p) t))
        ((and (switchp vis :initialize-methods) (constructor-p node))
         (msg "Annotating method declaration context")
         (setf (an (unit-package (find-context node 'compilation-unit)) :jnil-lib-required-p) t))))

(defvisit (vis annotator) (node class-instance-creation)
  (when (and (not (instance-creation-anonymous-decl node))
             (and (switchp vis :translate-sdk-calls-to-native)
                  (not (find-addit-knowledge-coder node)))
             (switchp vis :initialize-methods)
             (switchp vis :initialized-instances)
             (from-source-p node))
    (msg "Annotating class instance creation context")
    (setf (an (unit-package (find-context node 'compilation-unit)) :jnil-lib-required-p) t)))

;;;;- Wed Sep  7 22:05:47 2005 by tiago - We're going to simplify things for now and assume that
;;;;continue and break statements can't occur mixed. (KLUDGE)
(defvisit (vis annotator) (node continue-statement)
  (when (switchp vis :common-lisp)
    (msg "Annotating continue statement context")
    (setf (an (find-context node '(or while-statement for-statement do-statement)) :continue-in-body-p)
      t)
    (aif labeled-stmt (find-context node 'labeled-statement)
         (setf (an labeled-stmt :continue-in-body-p) t))))

(defvisit (vis annotator) (node break-statement)
  (when (switchp vis :common-lisp) 
    (msg "Annotating break statement context")
    (aif iteration-statement (find-context node '(or while-statement for-statement do-statement))
         (setf (an iteration-statement :break-in-body-p) t))
    (aif labeled-stmt (find-context node 'labeled-statement)
         (setf (an labeled-stmt :break-in-body-p) t))))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; symbols are exported here ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

(eval-when (:compile-toplevel :load-toplevel :execute)
  (export '() 'jnil))

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;; other miscellaneous operations ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;;; -- end of annotator.lisp --
