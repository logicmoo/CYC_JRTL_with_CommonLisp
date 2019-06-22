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
;;; $Id: jnil-support.asd,v 1.1.1.1 2006/04/23 17:11:48 tdias Exp $
;;;
;;; Description: System definition for Jnil's support facilities.
;;;
;;; -- start of jnil-support.asd --

;;;;;;;;;;;;;;;;;;;;;;;;;
;;; system definition ;;;
;;;;;;;;;;;;;;;;;;;;;;;;;

(asdf:defsystem :jnil-support
    :description "Jnil's support utility library."
    :version "0.6"
    :author "Tiago Maduro-Dias <tmdias@ieee.org>"
    :components ((:file "utils")
                 (:file "foreigns" :depends-on ("utils"))))

;;; -- end of jnil-support.asd --
