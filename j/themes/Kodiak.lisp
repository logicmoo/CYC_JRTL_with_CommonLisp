;;; -*- Mode: Lisp -*-
;;; Kodiak 4/14/2000-11/1/2000
;;; $Id: Kodiak.lisp,v 1.2 2003-04-01 02:19:20 piso Exp $

(use-package "J")

;;; Colors.
(defconstant black      "  0   0   0")
(defconstant red        "255   0   0")
(defconstant blue       "  0   0 255")

;;; Styles.
(defconstant plain      "0")
(defconstant bold       "1")
(defconstant italic     "2")

(set-global-property
 "color.text"                           black
 "color.background"                     "255 255 224"
 "color.currentLineBackground"          "235 235 204"
 "color.selectionBackground"            "153 204 255"
 "color.matchingBracketBackground"      "153 204 255"
 "color.caret"                          red

 "color.keyword"                        "  0   0 153"
 "color.string"                         "153  51   0"
 "color.comment"                        "  0 102   0"
 "color.function"                       black
 "color.operator"                       blue
 "color.brace"                          "  0 128 128"
 "color.number"                         "153 102  51"
 "color.preprocessor"                   red
 "color.disabled"                       "153 153 153"
 "color.verticalRule"                   "204 204 204"
 "color.lineNumber"                     "153 153 153"
 "color.gutterBorder"                   "153 153 153"
 "color.change"                         "255 164   0"
 "color.savedChange"                    "180 180 180"
 "color.delimiter"                      "  0 153 153"

 "CSSMode.color.selector"               black
 "CSSMode.style.selector"               bold
 "CSSMode.color.property"               "  0   0 204"
 "CSSMode.style.property"               plain

 "PerlMode.color.scalar"                " 51  51   0"
 "PerlMode.color.list"                  "  0  51  51"

 "LispMode.color.substitution"          "153   0 153"
 "LispMode.color.punctuation"           "102 102 102"
 "LispMode.color.parenthesis"           "102 102 102"
 "LispMode.color.secondaryKeyword"      "  0 102 153"

 "TclMode.color.brace"                  "153   0  51"
 "TclMode.style.brace"                  bold
 "TclMode.color.bracket"                "204 102   0"
 "TclMode.style.bracket"                bold

 "VHDLMode.color.type"                  blue

 "PHPMode.color.var"                    " 51  51   0"
 "PHPMode.color.tag"                    black
 "PHPMode.color.attribute"              "  0   0 128"
 "PHPMode.color.equals"                 "  0 153 153"

 "color.prompt"                         black
 "color.input"                          blue

 "XmlMode.color.attribute"              "0   0 128"
 "XmlMode.color.equals"                 "0 153 153"
 "XmlMode.color.namespace"              black
 "XmlMode.color.tag"                    black

 "HtmlMode.color.tag"                   "  0   0 204"
 "HtmlMode.color.image"                 "204 102   0"
 "HtmlMode.color.anchor"                " 51 153  51"
 "HtmlMode.color.table"                 "204   0   0"
 "HtmlMode.color.tableRow"              "153   0   0"
 "HtmlMode.color.tableData"             "153  51   0"
 "HtmlMode.color.comment"               "128 128 128"
 "HtmlMode.color.script"                blue

 "MakefileMode.color.target"            black

 "DiffMode.color.file"                  plain
 "DiffMode.style.file"                  bold
 "DiffMode.color.header"                "  0 102   0"
 "DiffMode.style.header"                italic
 "DiffMode.color.context"               black
 "DiffMode.color.inserted"              "153   0   0"
 "DiffMode.style.inserted"              plain
 "DiffMode.color.deleted"               "  0   0 153"
 "DiffMode.style.deleted"               plain

 "DirectoryMode.color.directory"        black
 "DirectoryMode.style.directory"        bold
 "DirectoryMode.color.symlink"          blue
 "DirectoryMode.color.marked"           "153   0   0"
 "DirectoryMode.style.marked"           bold

 "WebMode.color.link"                   blue
 "WebMode.style.link"                   plain

 "MailboxMode.color.date"               " 51  51  51"
 "MailboxMode.style.date"               plain
 "MailboxMode.color.from"               black
 "MailboxMode.style.from"               bold
 "MailboxMode.color.size"               "51   51  51"
 "MailboxMode.color.subject"            "51  102 102"
 "MailboxMode.style.subject"            bold

 "MailboxMode.color.flaggedTo"          "204  51   0"
 "MailboxMode.style.flaggedTo"          bold
 "MailboxMode.style.flaggedFlags"       plain
 "MailboxMode.style.flaggedDate"        plain
 "MailboxMode.color.flaggedFrom"        "204  51   0"
 "MailboxMode.style.flaggedFrom"        bold
 "MailboxMode.style.flaggedSize"        plain
 "MailboxMode.color.flaggedSubject"     "204  51   0"
 "MailboxMode.style.flaggedSubject"     bold

 "MailboxMode.color.marked"             "153   0   0"
 "MailboxMode.style.marked"             bold

 "MessageMode.color.headerValue"        " 51 102 102"
 "MessageMode.style.headerValue"        bold
 "MessageMode.color.signature"          "102 102 102"
 "MessageMode.color.string"             "  0 102   0"
 "MessageMode.style.string"             plain
 "MessageMode.color.comment"            "102 102 102"
 "MessageMode.style.comment"            plain

 "WebMode.color.headerValue"            " 51 102 102"
 "WebMode.style.headerValue"            bold

 "color.matchingText"                   "204 102   0"
 "style.matchingText"                   bold
 "color.status"                         "  0   0 153"
 "style.status"                         italic

 ;; Properties mode.
 "color.key"                            "  0   0 153"
 "style.key"                            plain
 "color.value"                          "128   0   0"
 "style.value"                          plain
 "color.section"                        "  0   0 153"
 "style.section"                        bold

 ;; List Registers mode
 "color.registerPrefix"                 "  0   0 153"
 "style.registerPrefix"                 bold
 "color.registerName"                   "204 102   0"
 "style.registerName"                   bold

 ;; Styles.
 "style.text"                           plain
 "style.keyword"                        bold
 "style.function"                       bold
 "style.prompt"                         bold
 "style.comment"                        italic
 "style.delimiter"                      bold
 "XmlMode.style.tag"                    bold
 "PHPMode.style.tag"                    bold
 "MakefileMode.style.target"            bold)
