/*
 * LispMode.java
 *
 * Copyright (C) 1998-2004 Peter Graves
 * $Id: LispMode.java,v 1.68 2004-08-03 21:36:04 piso Exp $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.j;

import java.awt.event.KeyEvent;
import java.util.HashMap;

public class LispMode extends AbstractMode implements Constants, Mode
{
    private static final LispMode mode = new LispMode();

    private LispMode()
    {
        super(LISP_MODE, LISP_MODE_NAME);
        keywords = new Keywords(this);
        setProperty(Property.INDENT_SIZE, 2);
        setProperty(Property.HIGHLIGHT_BRACKETS, true);
    }

    protected LispMode(int id, String displayName)
    {
        super(id, displayName);
    }

    public static Mode getMode()
    {
        return mode;
    }

    public String getCommentStart()
    {
        return ";; ";
    }

    public final SyntaxIterator getSyntaxIterator(Position pos)
    {
        return new LispSyntaxIterator(pos);
    }

    public Formatter getFormatter(Buffer buffer)
    {
        return new LispFormatter(buffer);
    }

    protected void setKeyMapDefaults(KeyMap km)
    {
        km.mapKey(KeyEvent.VK_TAB, 0, "tab");
        km.mapKey(KeyEvent.VK_TAB, CTRL_MASK, "insertTab");
        km.mapKey(KeyEvent.VK_F12, 0, "wrapComment");
        km.mapKey(KeyEvent.VK_ENTER, 0, "newlineAndIndent");
        km.mapKey(KeyEvent.VK_T, CTRL_MASK, "findTag");
        km.mapKey(KeyEvent.VK_PERIOD, ALT_MASK, "findTagAtDot");
        km.mapKey(KeyEvent.VK_COMMA, ALT_MASK, "listMatchingTagsAtDot");
        km.mapKey(KeyEvent.VK_PERIOD, CTRL_MASK | ALT_MASK, "findTagAtDotOtherWindow");
        km.mapKey(')', "closeParen");
        km.mapKey(KeyEvent.VK_F1, ALT_MASK, "hyperspec");
        km.mapKey(KeyEvent.VK_F, CTRL_MASK | ALT_MASK, "forwardSexp");
        km.mapKey(KeyEvent.VK_B, CTRL_MASK | ALT_MASK, "backwardSexp");
        km.mapKey(KeyEvent.VK_D, CTRL_MASK | ALT_MASK, "downList");
        km.mapKey(KeyEvent.VK_U, CTRL_MASK | ALT_MASK, "backwardUpList");
        km.mapKey(KeyEvent.VK_E, CTRL_MASK | ALT_MASK, "evalDefunLisp");
        km.mapKey(KeyEvent.VK_C, CTRL_MASK | ALT_MASK, "compileDefunLisp");
        km.mapKey(KeyEvent.VK_R, CTRL_MASK | ALT_MASK, "evalRegionLisp");
        km.mapKey(KeyEvent.VK_M, CTRL_MASK, "lispFindMatchingChar");
        km.mapKey(KeyEvent.VK_M, CTRL_MASK | SHIFT_MASK, "lispSelectSyntax");
        km.mapKey(KeyEvent.VK_9, CTRL_MASK | SHIFT_MASK, "insertParentheses");
        km.mapKey(KeyEvent.VK_0, CTRL_MASK | SHIFT_MASK, "movePastCloseAndReindent");
    }

    public void populateModeMenu(Editor editor, Menu menu)
    {
        boolean enabled = LispShell.findLisp(null) != null;
        menu.add(editor, "Eval Region", 'R', "evalRegionLisp", enabled);
        menu.add(editor, "Eval Defun", 'D', "evalDefunLisp", enabled);
        menu.add(editor, "Compile Defun", 'C', "compileDefunLisp", enabled);
    }

    public boolean isTaggable()
    {
        return true;
    }

    public Tagger getTagger(SystemBuffer buffer)
    {
        return new LispTagger(buffer);
    }

    private static final String validChars =
        "!$%&*+-./0123456789<=>?ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_abcdefghijklmnopqrstuvwxyz{}~";

    public final boolean isIdentifierStart(char c)
    {
        return validChars.indexOf(c) >= 0;
    }

    public final boolean isIdentifierPart(char c)
    {
        return validChars.indexOf(c) >= 0;
    }

    private static final HashMap definers = new HashMap();

    static {
        String[] strings = new String[] {
            "defclass", "defconstant", "defgeneric", "define-condition",
            "defmacro", "defmethod", "defparameter", "defstruct", "deftype",
            "defun", "defvar"
        };
        for (int i = strings.length; i-- > 0;)
            definers.put(strings[i], strings[i]);
        // SBCL
        definers.put("def!struct", "defstruct");
        definers.put("defmacro-mundanely", "defmacro");
    }

    public static final String translateDefiner(String s)
    {
        if (s.length() >= 5 && s.startsWith("def"))
            return (String) definers.get(s);
        return null;
    }

    public boolean isInQuote(Buffer buffer, Position pos)
    {
        // This implementation only considers the current line.
        final Line line = pos.getLine();
        final int offset = pos.getOffset();
        boolean inQuote = false;
        for (int i = 0; i < offset; i++) {
            char c = line.charAt(i);
            if (c == '\\') {
                // Escape.
                ++i;
            } else if (inQuote) {
                if (c == '"')
                    inQuote = false;
            } else if (c == '"') {
                inQuote = true;
            }
        }
        return inQuote;
    }

    public boolean canIndent()
    {
        return true;
    }

    private final String[] specials = new String[] {
        "block", "case", "catch", "do-all-symbols", "do-external-symbols",
        "do-symbols", "dolist", "dotimes", "ecase", "etypecase", "eval-when",
        "flet",  "handler-bind", "labels", "lambda", "let", "let*", "loop",
        "macrolet", "multiple-value-bind", "progn", "typecase", "unless", "when"
    };

    private final String[] elispSpecials = new String[] {
        "while"
    };

    private final String[] hemlockSpecials = new String[] {
        "frob", "with-mark"
    };

    public int getCorrectIndentation(Line line, Buffer buffer)
    {
        final Line model = findModel(line);
        if (model == null)
            return 0;
        final int modelIndent = buffer.getIndentation(model);
        final String modelTrim = model.trim();
        if (line.flags() == STATE_QUOTE) {
            if (modelTrim.length() > 0 && modelTrim.charAt(0) == '"')
                return modelIndent + 1;
            else
                return modelIndent;
        }
        if (modelTrim.length() == 0)
            return 0;
        if (modelTrim.charAt(0) == ';')
            return modelIndent;
        final int indentSize = buffer.getIndentSize();
        Position here = new Position(line, 0);
        Position pos = findContainingSexp(here);
        if (pos == null) // Top level.
            return 0;
        Debug.bugIfNot(pos.getChar() == '(');
        int offset = pos.getOffset();
        if (offset > 1) {
            if (new Position(pos.getLine(), offset - 2).lookingAt("'#("))
                return buffer.getCol(pos) + 1;
        }
        if (offset > 0) {
            if (pos.getLine().charAt(offset-1) == '\'')
                return buffer.getCol(pos) + 1;
        }
        Position posFirst = downList(pos);
        if (posFirst != null) {
            if (posFirst.equals(here))
                return buffer.getCol(pos) + 1;
            char firstChar = posFirst.getChar();
            if (firstChar == '(' || firstChar == ',') {
                // First element of containing sexp is a list or backquote
                // expansion.
                return buffer.getCol(posFirst);
            }
            // Otherwise...
            String token = gatherToken(posFirst);
            if (token.equals("do") || token.equals("do*")) {
                // Skip DO/DO*.
                Position p1 = forwardSexp(posFirst);
                if (p1 != null) {
                    // Skip whitespace to get to opening '(' of variable list.
                    p1.skipWhitespace();
                    // Skip past variable list.
                    Position p2 = forwardSexp(p1);
                    if (p2 != null) {
                        // Skip past end test form.
                        p2 = forwardSexp(p2);
                        // Make sure line numbers are right for isBefore().
                        if (buffer.needsRenumbering())
                            buffer.renumber();
                        if (p2 != null && here.isBefore(p2)) {
                            // This is the end test form. Indent it under the
                            // opening '(' of the variable list
                            return buffer.getCol(p1);
                        }
                    }
                }
                return buffer.getCol(pos) + indentSize;
            }
            if (token.equals("handler-case")) {
                Position p1 = forwardSexp(posFirst);
                if (p1 != null) {
                    // Skip whitespace to get to opening '(' of form to be
                    // evaluated.
                    p1.skipWhitespace();
                    // Make sure line numbers are right for isBefore().
                    if (buffer.needsRenumbering())
                        buffer.renumber();
                    if (here.isBefore(p1))
                        return buffer.getCol(pos) + indentSize * 2;
                }
                return buffer.getCol(pos) + indentSize;
            }
            if (token.startsWith("def") ||
                Utilities.isOneOf(token, specials) ||
                Utilities.isOneOf(token, elispSpecials) ||
                Utilities.isOneOf(token, hemlockSpecials) ||
                token.startsWith("with-"))
                return buffer.getCol(pos) + indentSize;
            // Not special. Indent under the second element of the containing
            // list, if the second element is on the same line as the first.
            Position posSecond = forwardSexp(posFirst);
            if (posSecond != null) {
                posSecond.skipWhitespace();
                if (posSecond.getChar() != ';')
                    if (posSecond.getLine() == pos.getLine())
                        return buffer.getCol(posSecond);
            }
        }
        return buffer.getCol(pos) + 1;
    }

    private static Line findModel(Line line)
    {
        Line model = line.previous();
        if (line.flags() == STATE_COMMENT) {
            // Any non-blank line is an acceptable model.
            while (model != null && model.isBlank())
                model = model.previous();
        } else {
            while (model != null) {
                if (isAcceptableModel(model))
                    break; // Found an acceptable model.
                else
                    model = model.previous();
            }
        }
        return model;
    }

    private static boolean isAcceptableModel(Line model)
    {
        String trim = model.trim();
        if (trim.length() == 0)
            return false;
        if (trim.charAt(0) == ';')
            return false;
        return true;
    }

    private String gatherToken(Position start)
    {
        Position pos = start.copy();
        FastStringBuffer sb = new FastStringBuffer();
        while (true) {
            char c = pos.getChar();
            if (Character.isWhitespace(c))
                break;
            sb.append(c);
            if (!pos.next())
                break;
        }
        return sb.toString();
    }

    private static Position findStartOfDefun(Position pos)
    {
        Line line = pos.getLine();
        while (true) {
            if (line.getText().startsWith("(def"))
                return new Position(line, 0);
            Line prev = line.previous();
            if (prev == null)
                return new Position(line, 0);
            line = prev;
        }
    }

    public static Position findContainingSexp(Position start)
    {
        LispSyntaxIterator it = new LispSyntaxIterator(start);
        int parenCount = 0;
        while (true) {
            switch (it.prevChar()) {
                case ')':
                    ++parenCount;
                    break;
                case '(':
                    if (parenCount == 0) {
                        // Found unmatched '('.
                        return it.getPosition();
                    }
                    --parenCount;
                    break;
                case SyntaxIterator.DONE:
                    return null;
                default:
                    break;
            }
        }
    }

    private Position downList(Position start)
    {
        if (start == null)
            return null;
        Position pos = start.copy();
        // Skip whitespace and comments.
        char c;
        while (true) {
            pos.skipWhitespace();
            c = pos.getChar();
            if (c == ';')
                skipComment(pos);
            else
                break;
        }
        // Reached non-whitespace char.
        while (true) {
            if (c == ')')
                return null; // "Containing expression ends prematurely."
            if (c == '(') {
                // List starting.
                if (!pos.next())
                    return null;
                // Skip whitespace and comments.
                while (true) {
                    pos.skipWhitespace();
                    c = pos.getChar();
                    if (c == ';')
                        skipComment(pos);
                    else
                        break;
                }
                if (pos.atEnd())
                    return null;
                return pos;
            }
            if (c == '"') {
                // Skip string.
                skipString(pos);
                if (pos.atEnd())
                    return null;
                continue;
            }
            if (c == ';') {
                skipComment(pos);
                if (pos.atEnd())
                    return null;
                continue;
            }
            if (!pos.next())
                return null;
            c = pos.getChar();
        }
    }

    public static void downList()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getMode() != mode)
            return;
        Position pos = mode.downList(editor.getDot());
        if (pos != null)
            editor.moveDotTo(pos);
    }

    public static void backwardUpList()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getMode() != mode)
            return;
        Position pos = findContainingSexp(editor.getDot());
        if (pos != null)
            editor.moveDotTo(pos);
    }

    private void skipString(Position pos)
    {
        while (true) {
            if (!pos.next())
                return;
            switch (pos.getChar()) {
                case '\\':
                    if (!pos.next())
                        return;
                    break;
                case '"':
                    pos.next();
                    return;
            }
        }
    }

    private Position forwardSexp(Position start)
    {
        if (start == null)
            return null;
        Position pos = start.copy();
        // Skip whitespace and comments.
        char c;
        while (true) {
            pos.skipWhitespace();
            c = pos.getChar();
            if (c == ';')
                skipComment(pos);
            else
                break;
        }
        // Reached non-whitespace char.
        if (c == ')')
            return null; // "Containing expression ends prematurely."
        if (c == '(') {
            // List starting.
            int parenCount = 1;
            while (true) {
                if (!pos.next())
                    return null;
                switch (pos.getChar()) {
                    case ';':
                        skipComment(pos);
                        break;
                    case ')':
                        --parenCount;
                        if (parenCount == 0) {
                            if (pos.next())
                                return pos;
                            else
                                return null;
                        }
                        break;
                    case '(':
                        ++parenCount;
                        break;
                    default:
                        break;
                }
            }
        }
        if (c == '"') {
            while (true) {
                if (!pos.next())
                    return null;
                switch (pos.getChar()) {
                    case '\\':
                        if (!pos.next())
                            return null;
                        break;
                    case '"':
                        if (!pos.next())
                            return null;
                        return pos;
                    default:
                        break;
                }
            }
        }
        // Otherwise...
        while (true) {
            if (!pos.next())
                return null;
            c = pos.getChar();
            if (Character.isWhitespace(c) || c == '(' || c == ')')
                return pos;
        }
    }

    private Position backwardSexp(Position start)
    {
        Position pos = findContainingSexp(start);
        if (pos == null) {
            // Top level.
            LispSyntaxIterator it = new LispSyntaxIterator(start);
            while (true) {
                char c = it.prevChar();
                if (c == SyntaxIterator.DONE)
                    return null;
                if (!Character.isWhitespace(c)) {
                    pos = it.getPosition();
                    break;
                }
            }
            if (pos.getChar() == ')')
                return findContainingSexp(pos);
            while (true) {
                if (!pos.prev())
                    return pos;
                if (Character.isWhitespace(pos.getChar())) {
                    pos.next();
                    return pos;
                }
            }
        }
        pos = downList(pos);
        if (pos == null)
            return null;
        while (true) {
            Position last = pos;
            pos = forwardSexp(pos);
            if (pos == null)
                return last;
            // Skip whitespace and comments.
            char c;
            while (true) {
                pos.skipWhitespace();
                c = pos.getChar();
                if (c == ';')
                    skipComment(pos);
                else
                    break;
            }
            if (c == ')')
                return last;
            if (pos.equals(start))
                return last;
            if (pos.isAfter(start))
                return last;
        }
    }

    // Advances pos to start of next line.
    private static void skipComment(Position pos)
    {
        Line nextLine = pos.getNextLine();
        if (nextLine != null)
            pos.moveTo(nextLine, 0);
    }

    public static void forwardSexp()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getMode() != mode)
            return;
        Position pos = mode.forwardSexp(editor.getDot());
        if (pos != null)
            editor.moveDotTo(pos);
    }

    public static void backwardSexp()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getMode() != mode)
            return;
        Position pos = mode.backwardSexp(editor.getDot());
        if (pos != null)
            editor.moveDotTo(pos);
    }

    public static void lispFindMatchingChar()
    {
        final Editor editor = Editor.currentEditor();
        Position dot = editor.getDotCopy();
        if (dot == null)
            return;
        Position pos = findDelimiterNear(dot);
        editor.setWaitCursor();
        Position match = editor.findMatchInternal(pos, 0);
        editor.setDefaultCursor();
        if (match != null) {
            // Move past closing parenthesis.
            if (match.getChar() == ')')
                match.next();
            editor.addUndo(SimpleEdit.MOVE);
            editor.unmark();
            editor.updateDotLine();
            editor.getDot().moveTo(match);
            editor.updateDotLine();
            editor.moveCaretToDotCol();
        } else
            editor.status("No match");
    }

    public static void lispSelectSyntax()
    {
        final Editor editor = Editor.currentEditor();
        Position dot = editor.getDotCopy();
        if (dot == null)
            return;
        Position pos;
        if (editor.getMark() != null) {
            pos = findContainingSexp(dot);
        } else {
            pos = findDelimiterNear(dot);
            if (pos == null)
                pos = findContainingSexp(dot);
        }
        if (pos == null)
            return;
        editor.setWaitCursor();
        Position match = editor.findMatchInternal(pos, 0);
        if (match != null) {
            if (pos.getChar() == ')')
                pos.next();
            else if (match.getChar() == ')')
                match.next();
            if (pos.getLine() != match.getLine()) {
                // Extend selection to full lines if possible.
                Region r = new Region(editor.getBuffer(), pos, match);
                Position begin = r.getBegin();
                if (begin.getLine().substring(0, begin.getOffset()).trim().length() == 0) {
                    Position end = r.getEnd();
                    String trim = end.getLine().substring(end.getOffset()).trim();
                    if (trim.length() == 0 || trim.charAt(0) == ';') {
                        // Extend selection to complete lines.
                        begin.setOffset(0);
                        if (end.getNextLine() != null)
                            end.moveTo(end.getNextLine(), 0);
                        else
                            end.setOffset(end.getLineLength());
                        if (pos.isBefore(match)) {
                            pos = begin;
                            match = end;
                        } else {
                            match = begin;
                            pos = end;
                        }
                    }
                }
            }
            editor.addUndo(SimpleEdit.MOVE);
            editor.unmark();
            editor.getDot().moveTo(pos);
            editor.setMarkAtDot();
            editor.updateDotLine();
            editor.getDot().moveTo(match);
            editor.updateDotLine();
            editor.moveCaretToDotCol();
            if (editor.getDotLine() != editor.getMarkLine())
                editor.setUpdateFlag(REPAINT);
        } else
            editor.status("No match");
        editor.setDefaultCursor();
    }

    private static Position findDelimiterNear(Position pos)
    {
        Position saved = pos.copy();
        if (pos.getChar() == '(')
            return pos;
        if (pos.getOffset() > 0) {
            pos.prev();
            if (pos.getChar() == ')')
                return pos;
        }
        // Go back to original starting point.
        pos.moveTo(saved);
        while (pos.getOffset() > 0) {
            // Look at previous char.
            pos.prev();
            char c = pos.getChar();
            if (c == '(' || c == ')')
                return pos;
        }
        // Go back to original starting point.
        pos.moveTo(saved);
        final int limit = pos.getLineLength() - 1;
        while (pos.getOffset() < limit) {
            // Look at next char.
            pos.next();
            char c = pos.getChar();
            if (c == '(' || c == ')')
                return pos;
            if (c == ';')
                return null; // The rest of the line is a comment.
        }
        return null;
    }

        // Look for Lisp shell.
    private static LispEd getLispEd (Editor editor) {
        Editor ed = editor.getOtherEditor();
        CommandInterpreter lisp = null;
        if (ed != null) {
            Buffer b = ed.getBuffer();
            if (b instanceof CommandInterpreter) {
                CommandInterpreter comint = (CommandInterpreter) b;
                if (comint.isLisp())
                    lisp = comint;
            }
        }
        if (lisp == null) {
            lisp = LispShell.findLisp(null);
            if (lisp == null) {
                MessageDialog.showMessageDialog("No Lisp shell is running",
                                                "Error");
                return null;
            }
            ed = findEditor(lisp);
            if (ed == null)
                ed = editor.displayInOtherWindow(lisp);
        }
        return new LispEd(lisp,ed);
    }

    // get current defun
    public static DefunString getCurrentDefun (Editor editor) {
        Position begin = findStartOfDefun(editor.getDot());
        if (begin != null && begin.lookingAt("(def")) {
            Position end = mode.forwardSexp(begin);
            if (end != null) {
                Region r = new Region(editor.getBuffer(), begin, end);
                String defunName = "";
                Position pos = mode.downList(begin);
                if (pos != null) {
                    pos = mode.forwardSexp(pos);
                    if (pos != null) {
                        pos.skipWhitespace();
                        defunName = pos.getIdentifier(mode);
                    }
                }
                return new DefunString(defunName,r.toString().trim());
            }
        }
        return null;
    }

    public static void evalDefunLisp()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getMode() != mode)
            return;
        LispEd le = getLispEd(editor);
        if (le == null) return;
        DefunString ds = getCurrentDefun(editor);
        if (ds != null) {
            Position bufEnd = le.lisp.getEnd();
                bufEnd.getLine().setFlags(STATE_INPUT);
            le.lisp.insertString(bufEnd,
                                 ";;; Evaluating defun " + ds.name + "\n");
            le.lisp.renumber();
            le.ed.eob();
            le.ed.getDotLine().setFlags(0);
            le.lisp.send(ds.defun);
            }
        }

    public static void compileDefunLisp()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getMode() != mode)
            return;
        LispEd le = getLispEd(editor);
        if (le == null) return;
        DefunString ds = getCurrentDefun(editor);
        if (ds != null) {
            Position bufEnd = le.lisp.getEnd();
            bufEnd.getLine().setFlags(STATE_INPUT);
            le.lisp.insertString(bufEnd,
                                 ";;; Compiling defun " + ds.name + "\n");
            le.lisp.renumber();
            le.ed.eob();
            le.ed.getDotLine().setFlags(0);
            le.lisp.send(ds.defun + "\n(CL:COMPILE '" + ds.name + ")\n");
        }
    }

    public static void evalRegionLisp()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getMode() != mode)
            return;
        if (editor.getMark() == null)
            return;
        if (editor.isColumnSelection()) {
            editor.notSupportedForColumnSelections();
            return;
        }
        LispEd le = getLispEd(editor);
        if (le == null) return;
        Position bufEnd = le.lisp.getEnd();
        bufEnd.getLine().setFlags(STATE_INPUT);
        le.lisp.insertString(bufEnd, ";;; Evaluating region\n");
        le.lisp.renumber();
        le.ed.eob();
        le.ed.getDotLine().setFlags(0);
        le.lisp.send(new Region(editor).toString().trim());
    }

    private static Editor findEditor(Buffer buf)
    {
        Editor ed = null;
        for (EditorIterator it = new EditorIterator(); it.hasNext();) {
            ed = it.nextEditor();
            if (ed.getBuffer() == buf)
                return ed;
        }
        return null;
    }

    private static HashMap map;

    public static void hyperspec()
    {
        hyperspec(null);
    }

    public static void hyperspec(String s)
    {
        final Editor editor = Editor.currentEditor();
        if (s == null) {
            if (editor.getDot() == null)
                return;
            char c = editor.getDotChar();
            if (c == ')' || Character.isWhitespace(c)) {
                final Line dotLine = editor.getDotLine();
                final String text = dotLine.getText();
                for (int offset = editor.getDotOffset(); offset-- > 0;) {
                    c = text.charAt(offset);
                    if (mode.isIdentifierPart(c)) {
                        s = mode.getIdentifier(dotLine, offset);
                        break;
                    }
                }
            } else
                s = mode.getIdentifier(editor.getDot());
            if (s == null)
                return;
        }
        if (s.length() == 0)
            return;
        final Buffer buffer = editor.getBuffer();
        String clhsRoot = buffer.getStringProperty(Property.CLHS_ROOT);
        File rootDir = File.getInstance(clhsRoot);
        if (rootDir == null || rootDir.isRemote() || !rootDir.isDirectory())
            return;
        if (map == null) {
            File file = File.getInstance(rootDir, "Data/Map_Sym.txt");
            if (!file.isFile())
                return;
            SystemBuffer buf = new SystemBuffer(file);
            buf.load();
            if (!buf.isLoaded())
                return;
            map = new HashMap();
            Line line = buf.getFirstLine();
            while (true) {
                String key = line.trim().toLowerCase();
                line = line.next();
                if (line == null)
                    break;
                if (line != null) {
                    String value = line.trim();
                    if (key.length() > 0 && value.length() > 0)
                        map.put(key, value);
                }
                line = line.next();
                if (line == null)
                    break;
            }
        }
        String filename = (String) map.get(s.toLowerCase());
        if (filename == null) {
            editor.status("No entry for \"" + s + '"');
            return;
        }
        String rootPath = rootDir.canonicalPath();
        File dataDir = File.getInstance(rootDir, "Data");
        File file = File.getInstance(dataDir, filename);
        WebBuffer buf = null;
        // Look for existing buffer.
        if (buffer instanceof WebBuffer) {
            if (buffer.getFile().canonicalPath().startsWith(rootPath))
                buf = (WebBuffer) buffer;
        }
        if (buf == null) {
            for (BufferIterator it = new BufferIterator(); it.hasNext();) {
                Buffer b = it.nextBuffer();
                if (b instanceof WebBuffer) {
                    if (b.getFile().canonicalPath().startsWith(rootPath)) {
                        buf = (WebBuffer) b;
                        break;
                    }
                }
            }
        }
        if (buf != null)
            buf.go(file, 0, "text/html");
        else {
            buf = WebBuffer.createWebBuffer(file, null, null);
            buf.setTransient(true);
        }
        if (editor.getBuffer() != buf) {
            Editor otherEditor = editor.getOtherEditor();
            if (otherEditor != null) {
                buf.setUnsplitOnClose(false);
                otherEditor.makeNext(buf);
            } else
                editor.makeNext(buf);
            editor.displayInOtherWindow(buf);
        }
    }
}

class DefunString {
    public String name;
    public String defun;
    public DefunString (String n, String d) {
        name = n;
        defun = d;
    }
}
class LispEd {
    public CommandInterpreter lisp;
    public Editor ed;
    public LispEd (CommandInterpreter l, Editor e) {
        lisp = l;
        ed = e;
    }
}
