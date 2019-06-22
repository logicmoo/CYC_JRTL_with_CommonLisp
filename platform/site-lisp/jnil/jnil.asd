;;; -*- mode: lisp; package: cl-user -*-
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
;;; $Id: jnil.asd,v 1.2 2006/05/23 22:13:55 tdias Exp $
;;;
;;; Description: System definition for the Jnil application.
;;;
;;; -- start of jnil.asd --

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; system definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(require 'asdf)

(asdf:defsystem :jnil
    :description "Jnil, Java to Lisp translator."
    :version "0.6.1"
    :author "Tiago Maduro Dias <tmdias@ieee.org>"
    :components ((:file "cl-utils")
                 (:module "ast"
                          :depends-on ("cl-utils")
                          :components ((:file "package")
                                       (:file "modifier" :depends-on ("package"))
                                       (:file "binding" :depends-on ("package"))
                                       (:file "type-binding" :depends-on ("binding"))
                                       (:file "variable-binding" :depends-on ("binding"))
                                       (:file "package-binding" :depends-on ("binding"))
                                       (:file "method-binding" :depends-on ("binding"))
                                       (:file "node" :depends-on ("package"))
                                       (:file "anonymous-class-declaration" :depends-on ("node"))
                                       (:file "body-declaration" :depends-on ("node"))
                                       (:file "abstract-type-declaration" :depends-on ("body-declaration"))
                                       (:file "type-declaration" :depends-on ("body-declaration"))
                                       (:file "field-declaration" :depends-on ("body-declaration"))
                                       (:file "initializer" :depends-on ("body-declaration"))
                                       (:file "method-declaration" :depends-on ("body-declaration"))
                                       (:file "catch-clause" :depends-on ("node"))
                                       (:file "compilation-unit" :depends-on ("node"))
                                       (:file "expression" :depends-on ("node"))
                                       (:file "expression-statement" :depends-on ("expression"))
                                       (:file "array-access" :depends-on ("expression"))
                                       (:file "array-creation" :depends-on ("expression"))
                                       (:file "array-initializer" :depends-on ("expression"))
                                       (:file "assignment" :depends-on ("expression"))
                                       (:file "boolean-literal" :depends-on ("expression"))
                                       (:file "cast-expression" :depends-on ("expression"))
                                       (:file "character-literal" :depends-on ("expression"))
                                       (:file "class-instance-creation" :depends-on ("expression"))
                                       (:file "conditional-expression" :depends-on ("expression"))
                                       (:file "field-access" :depends-on ("expression"))
                                       (:file "infix-expression" :depends-on ("expression"))
                                       (:file "instanceof-expression" :depends-on ("expression"))
                                       (:file "method-invocation" :depends-on ("expression"))
                                       (:file "name" :depends-on ("expression"))
                                       (:file "simple-name" :depends-on ("expression"))
                                       (:file "qualified-name" :depends-on ("expression"))
                                       (:file "null-literal" :depends-on ("expression"))
                                       (:file "number-literal" :depends-on ("expression"))
                                       (:file "parenthesized-expression" :depends-on ("expression"))
                                       (:file "postfix-expression" :depends-on ("expression"))
                                       (:file "prefix-expression" :depends-on ("expression"))
                                       (:file "string-literal" :depends-on ("expression"))
                                       (:file "super-field-access" :depends-on ("expression"))
                                       (:file "super-method-invocation" :depends-on ("expression"))
                                       (:file "this-expression" :depends-on ("expression"))
                                       (:file "type-literal" :depends-on ("expression"))
                                       (:file "variable-declaration-expression" :depends-on ("expression"))
                                       (:file "import-declaration" :depends-on ("node"))
                                       (:file "package-declaration" :depends-on ("node"))
                                       (:file "statement" :depends-on ("node"))
                                       (:file "super-constructor-invocation" :depends-on ("statement"))
                                       (:file "jblock" :depends-on ("statement"))
                                       (:file "ifstatement" :depends-on ("statement"))
                                       (:file "return-statement" :depends-on ("statement"))
                                       (:file "while-statement" :depends-on ("statement"))
                                       (:file "for-statement" :depends-on ("statement"))
                                       (:file "do-statement" :depends-on ("statement"))
                                       (:file "empty-statement" :depends-on ("statement"))
                                       (:file "switch-statement" :depends-on ("statement"))
                                       (:file "labeled-statement" :depends-on ("statement"))
                                       (:file "continue-statement" :depends-on ("statement"))
                                       (:file "break-statement" :depends-on ("statement"))
                                       (:file "try-statement" :depends-on ("statement"))
                                       (:file "throw-statement" :depends-on ("statement"))
                                       (:file "switch-case" :depends-on ("statement"))
                                       (:file "variable-declaration-statement" :depends-on ("statement"))
                                       (:file "variable-declaration" :depends-on ("node"))
                                       (:file "variable-declaration-fragment"
                                              :depends-on ("variable-declaration"))
                                       (:file "single-variable-declaration"
                                              :depends-on ("variable-declaration"))
                                       (:file "jtype" :depends-on ("node"))
                                       (:file "primitive-type" :depends-on ("jtype"))
                                       (:file "simple-type" :depends-on ("jtype"))
                                       (:file "array-type" :depends-on ("jtype"))
                                       (:file "visitor" :depends-on ("node"))
                                       (:file "caching-layer" :depends-on ("node"))
                                       (:file "utils" :depends-on ("node"))))
                 (:module "format"
                          :depends-on ("cl-utils")
                          :components ((:file "package")
                                       (:file "utils" :depends-on ("package"))
                                       (:file "lisp-format" :depends-on ("utils"))
                                       (:file "linj-format" :depends-on ("utils"))))
                 (:file "package" :depends-on ("ast" "format"))
                 (:file "jnil-utils" :depends-on ("package"))
                 (:module "addit-knowledge"
                          :depends-on ("jnil-utils")
                          :components ((:file "addit-knowledge-framework")))
                 (:module "coders"
                          :depends-on ("addit-knowledge")
                          :components ((:file "annotator")
                                       (:file "common-knowledge")
                                       (:file "basic-coder")
                                       (:file "common-coder")
                                       (:file "common-typer")
                                       (:file "linj-coder")
                                       (:file "linj-typer")
                                       (:file "lisp-guru")))
                 (:file "main" :depends-on ("addit-knowledge"))))

;;; -- end of jnil.asd --
