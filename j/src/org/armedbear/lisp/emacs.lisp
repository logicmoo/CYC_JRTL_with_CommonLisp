;;; emacs.lisp
;;;
;;; Copyright (C) 2005 Peter Graves
;;; $Id: emacs.lisp,v 1.8 2005-03-06 04:38:25 piso Exp $
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

(in-package #:j)

(export '(java-mode-map lisp-mode-map))

(defpackage #:emacs
  (:use #:cl #:ext #:j))

(in-package #:emacs)

(defun set-mark-command ()
  (setf (buffer-mark (current-buffer)) (current-point))
  (status "Mark set"))

(defun define-keys (map mappings)
  (dolist (mapping mappings)
    (define-key map (first mapping) (second mapping))))

(defparameter *global-map* (make-keymap))
(defparameter *esc-map* (make-keymap))
(defparameter *control-x-map* (make-keymap))
(defparameter *help-map* (make-keymap))
(defparameter *java-mode-map* (make-keymap))
(defparameter *lisp-mode-map* (make-keymap))

(define-key *global-map* "Escape" *esc-map*)
(define-key *global-map* "Ctrl X" *control-x-map*)
(define-key *global-map* "Ctrl H" *help-map*)

;; // File menu.
;; mapKey(KeyEvent.VK_O, CTRL_MASK, "openFile");
(define-key *control-x-map* "Ctrl F" "openFile")
;; mapKey(KeyEvent.VK_O, CTRL_MASK | ALT_MASK, "openFileInOtherWindow");
;; mapKey(KeyEvent.VK_O, CTRL_MASK | SHIFT_MASK, "openFileInOtherFrame");
;; mapKey(KeyEvent.VK_N, CTRL_MASK, "newBuffer");
;; mapKey(KeyEvent.VK_R, ALT_MASK, "recentFiles");
;; mapKey(KeyEvent.VK_S, CTRL_MASK, "save");
(define-key *control-x-map* "Ctrl S" "save")
;; mapKey(KeyEvent.VK_S, CTRL_MASK | SHIFT_MASK, "saveAs");
;; mapKey(KeyEvent.VK_S, CTRL_MASK | ALT_MASK, "saveCopy");
;; mapKey(KeyEvent.VK_F2, 0, "saveAll");
;; mapKey(KeyEvent.VK_F4, CTRL_MASK, "killBuffer");
;; mapKey(KeyEvent.VK_W, CTRL_MASK, "killBuffer");
(define-key *control-x-map* "k" "killBuffer")
;; mapKey(KeyEvent.VK_P, ALT_MASK, "properties");
;; mapKey(KeyEvent.VK_N, CTRL_MASK | SHIFT_MASK, "newFrame");
;; mapKey(KeyEvent.VK_X, ALT_MASK, "executeCommand");
(define-key *global-map* "Alt X" "executeCommand")
(define-key *esc-map* #\x "executecommand")
;; mapKey(KeyEvent.VK_P, CTRL_MASK, "print");
;; mapKey(KeyEvent.VK_Q, CTRL_MASK | SHIFT_MASK, "saveAllExit");
(define-key *control-x-map* "Ctrl C" "saveAllExit")
;; mapKey(KeyEvent.VK_Q, CTRL_MASK, "quit");

;; // Edit menu.
(define-key *global-map* "Ctrl Space" #'set-mark-command)
;; mapKey(KeyEvent.VK_BACK_SPACE, ALT_MASK, "undo");
;; mapKey(KeyEvent.VK_Z, CTRL_MASK, "undo");
(define-key *control-x-map* "u" "undo")
;; mapKey(KeyEvent.VK_Y, CTRL_MASK, "redo");
;; mapKey(KeyEvent.VK_DELETE, SHIFT_MASK, "killRegion");
;; mapKey(KeyEvent.VK_X, CTRL_MASK, "killRegion");
(define-key *global-map* "Ctrl W" "killRegion")
;; mapKey(KeyEvent.VK_X, CTRL_MASK | SHIFT_MASK, "killAppend");
;; mapKey(KeyEvent.VK_C, CTRL_MASK, "copyRegion");
(define-key *global-map* "Alt W" "copyRegion")
;; mapKey(KeyEvent.VK_C, CTRL_MASK | SHIFT_MASK, "copyAppend");
;; mapKey(KeyEvent.VK_V, CTRL_MASK, "paste");
(define-key *global-map* "Ctrl Y" "paste")
;; mapKey(KeyEvent.VK_V, CTRL_MASK | SHIFT_MASK, "cyclePaste");
(define-key *global-map* "Alt Y" "cyclePaste")
(define-key *esc-map* #\y "cyclePaste")
;; mapKey(KeyEvent.VK_T, ALT_MASK, "cycleTabWidth");

;; // Goto menu.
;; mapKey(KeyEvent.VK_J, CTRL_MASK, "jumpToLine");
;; mapKey(KeyEvent.VK_J, CTRL_MASK | SHIFT_MASK, "jumpToColumn");
;; mapKey(KeyEvent.VK_M, CTRL_MASK, "findMatchingChar");
;; mapKey(KeyEvent.VK_M, CTRL_MASK | SHIFT_MASK, "selectSyntax");
;; mapKey(KeyEvent.VK_UP, CTRL_MASK | ALT_MASK, "findFirstOccurrence");
(define-key *global-map* "Ctrl Alt Up" "findFirstOccurrence")
;; mapKey(KeyEvent.VK_KP_UP, CTRL_MASK | ALT_MASK, "findFirstOccurrence");
(define-key *global-map* "Ctrl Alt NumPad Up" "findFirstOccurrence")
;; mapKey(KeyEvent.VK_UP, ALT_MASK, "findPrevWord");
(define-key *global-map* "Alt Up" "findPrevWord")
;; mapKey(KeyEvent.VK_KP_UP, ALT_MASK, "findPrevWord");
(define-key *global-map* "Alt NumPad Up" "findPrevWord")
;; mapKey(KeyEvent.VK_DOWN, ALT_MASK, "findNextWord");
(define-key *global-map* "Alt Down" "findNextWord")
;; mapKey(KeyEvent.VK_KP_DOWN, ALT_MASK, "findNextWord");
(define-key *global-map* "Alt NumPad Down" "findNextWord")
;; mapKey(KeyEvent.VK_N, CTRL_MASK | ALT_MASK, "nextChange");
;; mapKey(KeyEvent.VK_P, CTRL_MASK | ALT_MASK, "previousChange");
;; mapKey(KeyEvent.VK_F5, 0, "pushPosition");
(define-key *global-map* "F5" "pushPosition")
;; mapKey(KeyEvent.VK_F5, SHIFT_MASK, "popPosition");
(define-key *global-map* "Shift F5" "popPosition")

;; // Search menu.
;; if (Editor.preferences().getBooleanProperty(Property.USE_INCREMENTAL_FIND))
;; mapKey(KeyEvent.VK_F, CTRL_MASK, "incrementalFind");
(define-key *global-map* "Ctrl S" "incrementalFind")
;; else
;; mapKey(KeyEvent.VK_F, CTRL_MASK, "find");
(define-key *global-map* "Alt F3" "find")

;; Emacs uses Ctrl Alt L for reposition-window
;; XEmacs uses Ctrl Alt L for switch-to-other-buffer
(define-key *global-map* "Ctrl Alt L" "listOccurrencesOfPatternAtDot")

(define-key *global-map* "F3" "findNext")
(define-key *global-map* "Shift F3" "findPrev")
(define-key *global-map* "F6" "findInFiles")
(define-key *global-map* "Ctrl Shift F" "findInFiles")
(define-key *global-map* "Ctrl F3" "listOccurrences")
(define-key *global-map* "Ctrl Shift L" "listFiles")
(define-key *global-map* "Shift Alt 5" "replace") ; M-%
(define-key *global-map* "Ctrl Shift R" "replaceInFiles")

;; mapKey(KeyEvent.VK_K, CTRL_MASK, "killLine");
(define-key *global-map* "Ctrl K" "killLine")
;; mapKey(KeyEvent.VK_DELETE, CTRL_MASK, "deleteWordRight");
(define-key *global-map* "Ctrl Delete" "deleteWordRight")

(define-keys *global-map*
  '(("Home"                     "home")
    ("Ctrl A"                   "home")
    ("End"                      "end");
    ("Ctrl E"                   "end");
    ("Shift Home"               "selectHome")
    ("Shift End"                "selectEnd")
    ("Ctrl Home"                "bob")
    ("Ctrl Shift Home"          "selectBob")
    ("Ctrl End"                 "eob")
    ("Ctrl Shift End"           "selectEob")
    ("Ctrl P"                   "up")
    ("Up"                       "up")
    ("NumPad Up"                "up")
    ("Ctrl N"                   "down")
    ("Down"                     "down")
    ("NumPad Down"              "down")
    ("Shift Up"                 "selectUp")
    ("Shift NumPad Up"          "selectUp")
    ("Shift Down"               "selectDown")
    ("Shift NumPad Down"        "selectDown")
    ("Ctrl B"                   "left")
    ("Left"                     "left")
    ("NumPad Left"              "left")
    ("Ctrl F"                   "right")
    ("Right"                    "right")
    ("NumPad Right"             "right")
    ("Shift Left"               "selectLeft")
    ("Shift NumPad Left"        "selectLeft")
    ("Shift Right"              "selectRight")
    ("Shift NumPad Right"       "selectRight")
    ("Alt B"                    "wordLeft")
    ("Ctrl Left"                "wordLeft")
    ("Ctrl NumPad Left"         "wordLeft")
    ("Ctrl Right"               "wordRight")
    ("Ctrl NumPad Right"        "wordRight")
    ("Ctrl Shift Left"          "selectWordLeft")
    ("Ctrl Shift NumPad Left"   "selectWordLeft")
    ("Ctrl Shift Right"         "selectWordRight")
    ("Ctrl Shift NumPad Right"  "selectWordRight")
    ("Alt V"                    "pageUp")
    ("Page Up"                  "pageUp")
    ("Ctrl V"                   "pageDown")
    ("Page Down"                "pageDown")))

(define-keys *esc-map*
  '((#\< "bob")
    (#\> "eob")
    (#\. "findTagAtDot")
    (#\% "replace")
    ))

;; Emacs uses Ctrl Up for backward-paragraph, which j doesn't have.
(define-keys *global-map*
  '(("Ctrl Up"          "windowUp")
    ("Ctrl NumPad Up"   "windowUp")))
;; Emacs uses Ctrl Down for forward-paragraph, which j doesn't have.
(define-keys *global-map*
  '(("Ctrl Down"        "windowDown")
    ("Ctrl NumPad Down" "windowDown")))

;; Emacs uses Alt Left for backward-word, which is also on Alt B and Ctrl Left.
(define-keys *global-map*
  '(("Alt Left" "prevBuffer")
    ("Alt NumPad Left" "prevBuffer")))
;; Emacs uses Alt Right for forward-word, which is also on Alt F and Ctrl Right.
(define-keys *global-map*
  '(("Alt Right" "nextBuffer")
    ("Alt NumPad Right" "nextBuffer")))

;; mapKey(KeyEvent.VK_PAGE_UP, ALT_MASK, "pageUpOtherWindow");
;; mapKey(KeyEvent.VK_PAGE_UP, SHIFT_MASK, "selectPageUp");
;; mapKey(KeyEvent.VK_PAGE_DOWN, ALT_MASK, "pageDownOtherWindow");
;; mapKey(KeyEvent.VK_PAGE_DOWN, SHIFT_MASK, "selectPageDown");
;; mapKey(KeyEvent.VK_PAGE_UP, CTRL_MASK, "top");
;; mapKey(KeyEvent.VK_PAGE_DOWN, CTRL_MASK, "bottom");
;; mapKey(KeyEvent.VK_DELETE, 0, "delete");
(define-key *global-map* "Delete" "delete")
(define-key *global-map* "Ctrl D" "delete")
;; mapKey(KeyEvent.VK_BACK_SPACE, 0, "backspace");
(define-key *global-map* "Backspace" "backspace")
;; mapKey(KeyEvent.VK_BACK_SPACE, SHIFT_MASK, "backspace");
(define-key *global-map* "Shift Backspace" "backspace")
;; mapKey(KeyEvent.VK_BACK_SPACE, CTRL_MASK, "deleteWordLeft");
(define-key *global-map* "Ctrl Backspace" "deleteWordLeft")
;; mapKey(KeyEvent.VK_ENTER, 0, "newline");
(define-key *global-map* "Enter" "newline")
(define-key *global-map* "Ctrl M" "newline")
(define-key *global-map* "Ctrl J" "newlineAndIndent")

;; mapKey(KeyEvent.VK_ESCAPE, 0, "escape");
(define-key *global-map* "Ctrl G" "escape")

;; mapKey(KeyEvent.VK_G, CTRL_MASK | SHIFT_MASK, "gotoFile");
;; mapKey(KeyEvent.VK_B, CTRL_MASK | SHIFT_MASK, "browseFileAtDot");

;; mapKey(KeyEvent.VK_D, CTRL_MASK, "dir");

;; mapKey(KeyEvent.VK_F2, SHIFT_MASK, "stamp");

;; mapKey(KeyEvent.VK_A, CTRL_MASK, "selectAll");

;; mapKey(KeyEvent.VK_OPEN_BRACKET, ALT_MASK, "slideOut");
;; mapKey(KeyEvent.VK_CLOSE_BRACKET, ALT_MASK, "slideIn");

;; // Bookmarks MUST be mapped like this!
;; mapKey(KeyEvent.VK_0, ALT_MASK, "dropBookmark");
;; mapKey(KeyEvent.VK_1, ALT_MASK, "dropBookmark");
;; mapKey(KeyEvent.VK_2, ALT_MASK, "dropBookmark");
;; mapKey(KeyEvent.VK_3, ALT_MASK, "dropBookmark");
;; mapKey(KeyEvent.VK_4, ALT_MASK, "dropBookmark");
;; mapKey(KeyEvent.VK_5, ALT_MASK, "dropBookmark");
;; mapKey(KeyEvent.VK_6, ALT_MASK, "dropBookmark");
;; mapKey(KeyEvent.VK_7, ALT_MASK, "dropBookmark");
;; mapKey(KeyEvent.VK_8, ALT_MASK, "dropBookmark");
;; mapKey(KeyEvent.VK_9, ALT_MASK, "dropBookmark");
;; mapKey(KeyEvent.VK_0, CTRL_MASK, "gotoBookmark");
;; mapKey(KeyEvent.VK_1, CTRL_MASK, "gotoBookmark");
;; mapKey(KeyEvent.VK_2, CTRL_MASK, "gotoBookmark");
;; mapKey(KeyEvent.VK_3, CTRL_MASK, "gotoBookmark");
;; mapKey(KeyEvent.VK_4, CTRL_MASK, "gotoBookmark");
;; mapKey(KeyEvent.VK_5, CTRL_MASK, "gotoBookmark");
;; mapKey(KeyEvent.VK_6, CTRL_MASK, "gotoBookmark");
;; mapKey(KeyEvent.VK_7, CTRL_MASK, "gotoBookmark");
;; mapKey(KeyEvent.VK_8, CTRL_MASK, "gotoBookmark");
;; mapKey(KeyEvent.VK_9, CTRL_MASK, "gotoBookmark");

;; // Temporary marker commands.
;; mapKey(KeyEvent.VK_BACK_SLASH, ALT_MASK, "dropTemporaryMarker");
;; mapKey(KeyEvent.VK_BACK_SLASH, CTRL_MASK, "gotoTemporaryMarker");
;; mapKey(KeyEvent.VK_BACK_SLASH, CTRL_MASK | SHIFT_MASK, "selectToTemporaryMarker");

;; mapKey(KeyEvent.VK_F11, 0, "commentRegion");
(define-key *global-map* "F11" "commentRegion")
;; mapKey(KeyEvent.VK_F11, SHIFT_MASK, "uncommentRegion");
(define-key *global-map* "Shift F11" "uncommentRegion")

;; // Duplicate mappings to support IBM 1.3 for Linux.
;; mapKey(0xffc8, 0, "commentRegion");
;; mapKey(0xffc8, SHIFT_MASK, "uncommentRegion");

;; mapKey(KeyEvent.VK_F12, 0, "wrapParagraph");
(define-key *global-map* "F12" "wrapParagraph")
;; mapKey(KeyEvent.VK_F12, SHIFT_MASK, "unwrapParagraph");
(define-key *global-map* "Shift F12" "unwrapParagraph")
;; mapKey(KeyEvent.VK_F12, CTRL_MASK, "toggleWrap");
(define-key *global-map* "Ctrl F12" "toggleWrap")

;; // Duplicate mappings to support IBM 1.3 for Linux.
;; mapKey(0xffc9, 0, "wrapParagraph"); // F12
;; mapKey(0xffc9, SHIFT_MASK, "unwrapParagraph"); // Shift F12
;; mapKey(0xffc9, CTRL_MASK, "toggleWrap"); // Ctrl F12

;; mapKey(KeyEvent.VK_T, CTRL_MASK | ALT_MASK, "visibleTabs");

;; mapKey(KeyEvent.VK_SLASH, ALT_MASK, "expand");
(define-key *global-map* "Alt /" "expand")

;; // On Windows, Alt Space drops down the window menu.
;; if (!Platform.isPlatformWindows())
;; mapKey(KeyEvent.VK_SPACE, ALT_MASK, "expand");

;; mapKey(KeyEvent.VK_N, ALT_MASK, "nextFrame");

;; mapKey(KeyEvent.VK_W, ALT_MASK, "selectWord");

;; mapKey(VK_MOUSE_1, 0, "mouseMoveDotToPoint");
(define-key *global-map* "Mouse-1" "mouseMoveDotToPoint")
;; mapKey(VK_MOUSE_1, SHIFT_MASK, "mouseSelect");
;; mapKey(VK_MOUSE_1, CTRL_MASK | SHIFT_MASK, "mouseSelectColumn");
;; mapKey(VK_DOUBLE_MOUSE_1, 0, "selectWord");
(define-key *global-map* "Double Mouse-1" "selectWord")

;; if (Platform.isPlatformUnix()) {
;; mapKey(VK_MOUSE_2, 0, "pastePrimarySelection");
;; mapKey(KeyEvent.VK_INSERT, SHIFT_MASK, "pastePrimarySelection");
;; }

;; mapKey(VK_MOUSE_3, 0, "mouseShowContextMenu");

;; mapKey(KeyEvent.VK_F7, 0, "recordMacro");
;; mapKey(KeyEvent.VK_F8, 0, "playbackMacro");

;; mapKey(KeyEvent.VK_W, CTRL_MASK | SHIFT_MASK, "killFrame");

;; // Sidebar.
;; mapKey(KeyEvent.VK_EQUALS, ALT_MASK, "toggleSidebar");
;; mapKey(KeyEvent.VK_B, ALT_MASK, "sidebarListBuffers");
;; mapKey(KeyEvent.VK_T, CTRL_MASK | SHIFT_MASK, "sidebarListTags");

;; mapKey(KeyEvent.VK_F10, 0, "splitWindow");
(define-key *control-x-map* "2" "splitWindow")
;; mapKey(KeyEvent.VK_F10, SHIFT_MASK, "unsplitWindow");
(define-key *control-x-map*  "1" "unsplitwindow")
;; mapKey(KeyEvent.VK_F10, CTRL_MASK | SHIFT_MASK, "killWindow");
(define-key *control-x-map* "0" "killWindow")
;; mapKey(KeyEvent.VK_O, ALT_MASK, "otherWindow");
(define-key *control-x-map*  "o" "otherwindow")

;; if (Editor.preferences().getBooleanProperty(Property.ENABLE_EXPERIMENTAL_FEATURES))
;; mapKey(KeyEvent.VK_F9, ALT_MASK, "shell");

;; // Map these globally so they're available in the compilation buffer too.
;; mapKey(KeyEvent.VK_F4, 0, "nextError");
(define-key *control-x-map* "`" "nextError")
(define-key *global-map* "F4" "nextError")
;; mapKey(KeyEvent.VK_F4, SHIFT_MASK, "previousError");
(define-key *global-map* "Shift F4" "previousError")
;; mapKey(KeyEvent.VK_M, CTRL_MASK | ALT_MASK, "showMessage");
(define-key *global-map* "Ctrl Alt M" "showMessage")

;; // Windows VM seems to need this mapping for the tab key to work properly.
;; // There's also code in Dispatcher.dispatchKeyTyped to handle the tab key.
;; mapKey(KeyEvent.VK_TAB, 0, "insertTab");

;; if (Platform.isPlatformLinux()) {
;; // These mappings work with Blackdown 1.2.2 (and 1.2 pre-release v2).
;; mapKey(0x2d, CTRL_MASK, "toCenter"); // Ctrl -
;; mapKey(0x5f, CTRL_MASK | SHIFT_MASK, "toTop"); // Ctrl Shift -

;; // IBM 1.3, Sun 1.4.0 beta 2.
;; mapKey(0x2d, CTRL_MASK | SHIFT_MASK, "toTop"); // Ctrl Shift -
;; } else if (Platform.isPlatformWindows()) {
;; mapKey(0x2d, CTRL_MASK, "toCenter"); // Ctrl -
;; mapKey(0x2d, CTRL_MASK | SHIFT_MASK, "toTop"); // Ctrl Shift -
;; }

(define-key *global-map* "Alt ." "findTagAtDot")

;; Help.
(define-keys *help-map*
  '(("a"                        "apropos")
    ("b"                        "listBindings")
    ("i"                        "help")
    ("k"                        "describeKey")))

;; Java mode.
(define-key *java-mode-map* "{" "electricOpenBrace")
(define-key *java-mode-map* "}" "electricCloseBrace")
(define-key *java-mode-map* "Tab" "tab")
(define-key *java-mode-map* "Ctrl Tab" "insertTab")
(define-key *java-mode-map* "';'" "electricSemi")
;;                km.mapKey(':', "electricColon");
(define-key *java-mode-map* #\: "electricColon")
;;                km.mapKey('*', "electricStar");
;;                km.mapKey(KeyEvent.VK_T, CTRL_MASK, "findTag");
;;                km.mapKey(KeyEvent.VK_PERIOD, ALT_MASK, "findTagAtDot");
;;                km.mapKey(KeyEvent.VK_COMMA, ALT_MASK, "listMatchingTagsAtDot");
;;                km.mapKey(KeyEvent.VK_PERIOD, CTRL_MASK | ALT_MASK, "findTagAtDotOtherWindow");
;;                km.mapKey(')', "closeParen");
;; km.mapKey(KeyEvent.VK_I, ALT_MASK, "cycleIndentSize");

;; km.mapKey(KeyEvent.VK_9, CTRL_MASK | SHIFT_MASK, "insertParentheses");
;; km.mapKey(KeyEvent.VK_0, CTRL_MASK | SHIFT_MASK, "movePastCloseAndReindent");

;; km.mapKey(KeyEvent.VK_OPEN_BRACKET, CTRL_MASK | SHIFT_MASK, "insertBraces");
(define-key *java-mode-map* "Ctrl Shift [" "insertBraces")
;; // Duplicate mapping for 1.4.
;; km.mapKey(KeyEvent.VK_BRACELEFT, CTRL_MASK | SHIFT_MASK, "insertBraces");

;; km.mapKey(KeyEvent.VK_F12, 0, "wrapComment");

;; // Duplicate mapping to support IBM 1.3 for Linux.
;; km.mapKey(0xffc9, 0, "wrapComment"); // F12

;; km.mapKey(KeyEvent.VK_OPEN_BRACKET, CTRL_MASK, "fold");
;; km.mapKey(KeyEvent.VK_CLOSE_BRACKET, CTRL_MASK, "unfold");

;; km.mapKey(KeyEvent.VK_F9, 0, "compile");
(define-key *java-mode-map* "F9" "compile")
;; km.mapKey(KeyEvent.VK_F9, CTRL_MASK, "recompile");
(define-key *java-mode-map* "Ctrl F9" "recompile")
;; km.mapKey(KeyEvent.VK_F1, ALT_MASK, "jdkHelp");
;; km.mapKey(KeyEvent.VK_F1, CTRL_MASK, "source");

;; // This is the "normal" mapping.
;; km.mapKey(KeyEvent.VK_COMMA,  CTRL_MASK | SHIFT_MASK, "htmlInsertTag");
;; // The "normal" mapping doesn't work for Linux, but this does.
;; km.mapKey(0x7c, CTRL_MASK | SHIFT_MASK, "htmlInsertTag");

;; if (Editor.checkExperimental()) {
;; km.mapKey(KeyEvent.VK_SEMICOLON, ALT_MASK, "JavaMode.insertComment");
;; km.mapKey(KeyEvent.VK_ENTER, ALT_MASK, "JavaMode.newlineAndIndentForComment");
;; }

;; if (Platform.isPlatformLinux()) {
;; // Blackdown 1.1.7v3, 1.2pre2, IBM 1.1.8.
;; // Duplicate mappings needed for VK_9, VK_0 and VK_OPEN_BRACKET.
;; km.mapKey(0x68, CTRL_MASK | SHIFT_MASK, "insertParentheses");
;; km.mapKey(0x69, CTRL_MASK | SHIFT_MASK, "movePastCloseAndReindent");
;; km.mapKey(0xbb, CTRL_MASK | SHIFT_MASK, "insertBraces");
;; }


(defun emacs ()
  (use-global-map *global-map*)
  ;; FIXME This is the right idea (so mappings like Alt F will be possible),
  ;; but it doesn't quite work.
  (set-global-property "useMenuMnemonics" "false")
  (j::%execute-command "reloadKeyMaps"))

(defun java-mode-map ()
  *java-mode-map*)

;; km.mapKey(KeyEvent.VK_TAB, 0, "tab");
(define-key *lisp-mode-map* "Tab" "tab")
;; km.mapKey(KeyEvent.VK_TAB, CTRL_MASK, "insertTab");
(define-key *lisp-mode-map* "Ctrl Tab" "insertTab")
;; km.mapKey(KeyEvent.VK_F12, 0, "wrapComment");
(define-key *lisp-mode-map* "F12" "wrapComment")
;; km.mapKey(KeyEvent.VK_T, CTRL_MASK, "findTag");
;; km.mapKey(KeyEvent.VK_COMMA, ALT_MASK, "listMatchingTagsAtDot");
;; km.mapKey(KeyEvent.VK_PERIOD, CTRL_MASK | ALT_MASK, "findTagAtDotOtherWindow");
(define-key *lisp-mode-map* #\) "closeParen")
;; km.mapKey(KeyEvent.VK_F1, ALT_MASK, "hyperspec");
(define-key *lisp-mode-map* "Alt F1" "hyperspec")
;; km.mapKey(KeyEvent.VK_F, CTRL_MASK | ALT_MASK, "forwardSexp");
(define-key *lisp-mode-map* "Ctrl Alt F" "forwardSexp")
;; km.mapKey(KeyEvent.VK_B, CTRL_MASK | ALT_MASK, "backwardSexp");
(define-key *lisp-mode-map* "Ctrl Alt B" "backwardSexp")
(define-key *lisp-mode-map* "Ctrl Alt Space" "markSexp")
;; km.mapKey(KeyEvent.VK_D, CTRL_MASK | ALT_MASK, "downList");
(define-key *lisp-mode-map* "Ctrl Alt D" "downList")
;; km.mapKey(KeyEvent.VK_U, CTRL_MASK | ALT_MASK, "backwardUpList");
(define-key *lisp-mode-map* "Ctrl Alt U" "backwardUpList")
;; km.mapKey(KeyEvent.VK_X, CTRL_MASK | ALT_MASK, "evalDefunLisp");
;; km.mapKey(KeyEvent.VK_C, CTRL_MASK | ALT_MASK, "compileDefunLisp");
;; km.mapKey(KeyEvent.VK_R, CTRL_MASK | ALT_MASK, "evalRegionLisp");
;; km.mapKey(KeyEvent.VK_M, CTRL_MASK, "lispFindMatchingChar");
;; km.mapKey(KeyEvent.VK_M, CTRL_MASK | SHIFT_MASK, "lispSelectSyntax");
;; km.mapKey(KeyEvent.VK_9, CTRL_MASK | SHIFT_MASK, "insertParentheses");
;; km.mapKey(KeyEvent.VK_0, CTRL_MASK | SHIFT_MASK, "movePastCloseAndReindent");

(defun lisp-mode-map ()
  (format t "lisp-mode-map called~%")
  *lisp-mode-map*)

(provide 'emacs)
