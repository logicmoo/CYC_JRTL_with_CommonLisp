;;; -*- Mode: Lisp -*-
;;; Anokha Classic
;;; $Id: AnokhaClassic.lisp,v 1.3 2003-05-10 16:37:20 piso Exp $

(use-package "J")

;;; Colors.
(defconstant white      "255 255 255")
(defconstant black      "  0   0   0")
(defconstant red        "255   0   0")
(defconstant blue       "  0   0 255")

;;; Styles.
(defconstant plain      "0")
(defconstant bold       "1")
(defconstant italic     "2")

(set-global-property
 "color.text"                           white
 "color.background"                     "  0  51  51"
 "color.currentLineBackground"          "  0   0   0"
 "color.selectionBackground"            " 51 102 102"
 "color.matchingBracketBackground"      " 51 102 102"
 "color.caret"                          "204 255 204"

 "color.preprocessor"                   "255 255   0"
 "color.comment"                        "180 180 128"
 "color.keyword"                        "204 102   0"
 "color.brace"                          "255 255   0"
 "color.number"                         "255 153   0"
 "color.function"                       "255 153   0"
 "color.string"                         "153 204 153"
 "color.operator"                       "255 255   0"
 "color.disabled"                       "153 153 153"
 "color.verticalRule"                   " 96  96  72"
 "color.lineNumber"                     "128 128  96"
 "color.gutterBorder"                   " 96  96  72"
 "color.change"                         "255 164   0"
 "color.savedChange"                    "128  96   0"
 "color.delimiter"                      "255 255   0"

 "color.headerName"                     "204 102   0"
 "color.headerValue"                    "255 255 204"
 "color.matchingText"                   "255 153   0"
 "color.signature"                      "204 204 153"

 "MailboxMode.color.deleted"            "153 153 102"
 "MailboxMode.color.to"                 "255 255   0"
 "MailboxMode.color.flags"              "255 255 204"
 "MailboxMode.color.date"               "204 204 153"
 "MailboxMode.color.from"               "255 153   0"
 "MailboxMode.color.size"               "204 204 153"
 "MailboxMode.color.subject"            white
 "MailboxMode.style.subject"            bold

 "MailboxMode.color.flaggedTo"          "255 204   0"
 "MailboxMode.style.flaggedTo"          bold
 "MailboxMode.color.flaggedSubject"     "255 204   0"
 "MailboxMode.style.flaggedSubject"     bold
 "MailboxMode.color.flaggedFrom"        "255 204   0"
 "MailboxMode.style.flaggedFrom"        bold

 "PerlMode.color.scalar"                "255 255 204"
 "PerlMode.color.list"                  "204 204 153"

 "LispMode.color.substitution"          "255 204 102"
 "LispMode.color.parenthesis"           "153 153 102"
 "LispMode.color.punctuation"           "153 153 102"
 "LispMode.color.secondaryKeyword"      "153 102  51"

 "PHPMode.color.var"                    "255 255 204"
 "PHPMode.color.attribute"              "204 204 153"
 "PHPMode.color.equals"                 "255 255   0"
 "PHPMode.color.tag"                    "255 153   0"

 "color.prompt"                         "153 204 153"
 "color.input"                          "255 153   0"

 "XmlMode.color.attribute"              "204 204 153"
 "XmlMode.color.equals"                 "255 255   0"
 "XmlMode.color.namespace"              "255 204   0"
 "XmlMode.color.tag"                    "255 153   0"

 "HtmlMode.color.tag"                   "153 204 153"
 "HtmlMode.color.anchor"                "255 204   0"
 "HtmlMode.color.image"                 "255 153   0"
 "HtmlMode.color.table"                 "153 153 102"
 "HtmlMode.color.tableRow"              "204 204 153"
 "HtmlMode.color.tableData"             "255 255 204"
 "HtmlMode.color.comment"               "102 153 153"
 "HtmlMode.color.script"                "255   0   0"

 "MakefileMode.color.target"            "255 153   0"

 "PropertiesMode.color.key"             "255 153   0"
 "PropertiesMode.style.key"             plain
 "PropertiesMode.color.value"           white
 "PropertiesMode.style.value"           plain
 "PropertiesMode.color.section"         "255 153   0"
 "PropertiesMode.style.section"         bold

 "DirectoryMode.color.directory"        "255 153   0"
 "DirectoryMode.color.symlink"          "255 204   0"
 "color.marked"                         "255 255   0"

 "DiffMode.color.file"                  "255 255   0"
 "DiffMode.style.file"                  plain
 "DiffMode.color.header"                "180 180 128"
 "DiffMode.style.header"                plain
 "DiffMode.color.deleted"               "180 180 180"
 "DiffMode.color.inserted"              "255 153   0"
 "DiffMode.color.context"               white

 ;; List Registers mode
 "color.registerHeader"                 "255 153   0"
 "style.registerHeader"                 plain
 "color.registerName"                   "255 255   0"
 "style.registerName"                   plain

 "style.text"                           plain
 "style.keyword"                        plain
 "style.function"                       plain
 "DirectoryMode.style.directory"        plain
 "DirectoryMode.style.marked"           plain
 "style.prompt"                         plain
 "style.comment"                        plain
 "style.tag"                            plain
 "style.delimiter"                      plain)
