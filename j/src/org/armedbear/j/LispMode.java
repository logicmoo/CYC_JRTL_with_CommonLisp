/*
 * LispMode.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: LispMode.java,v 1.19 2002-12-15 02:54:43 piso Exp $
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
        km.mapKey(KeyEvent.VK_ENTER, 0, "newlineAndIndent");
        km.mapKey(KeyEvent.VK_T, CTRL_MASK, "findTag");
        km.mapKey(KeyEvent.VK_PERIOD, ALT_MASK, "findTagAtDot");
        km.mapKey(KeyEvent.VK_L, CTRL_MASK | SHIFT_MASK, "listTags");
        km.mapKey(')', "closeParen");
        km.mapKey(KeyEvent.VK_F1, ALT_MASK, "hyperspec");
        km.mapKey(KeyEvent.VK_F, CTRL_MASK | ALT_MASK, "forwardSexp");
        km.mapKey(KeyEvent.VK_D, CTRL_MASK | ALT_MASK, "downList");
        km.mapKey(KeyEvent.VK_U, CTRL_MASK | ALT_MASK, "upList");
        km.mapKey(KeyEvent.VK_E, CTRL_MASK | ALT_MASK, "evalDefunLisp");
        km.mapKey(KeyEvent.VK_R, CTRL_MASK | ALT_MASK, "evalRegionLisp");
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
        "!$%&*+-./0123456789:<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[]^_abcdefghijklmnopqrstuvwxyz{}~";

    public final boolean isIdentifierStart(char c)
    {
        return validChars.indexOf(c) >= 0;
    }

    public final boolean isIdentifierPart(char c)
    {
        return validChars.indexOf(c) >= 0;
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
        "case", "ecase", "do", "do*", "dolist", "dotimes", "flet", "lambda",
        "let", "let*", "loop", "progn", "typecase", "unless", "when"
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
        Position pos = findContainingSexp(new Position(line, 0));
        if (pos == null) // Top level.
            return 0;
        Debug.bugIfNot(pos.getChar() == '(');
        Position posFirst = downList(pos);
        if (posFirst != null) {
            if (posFirst.getChar() == '(') {
                // First element of containing sexp is a list. Indent
                // under that list.
                return buffer.getCol(posFirst);
            }
            // Otherwise...
            String token = gatherToken(posFirst);
            if (token.startsWith("def") ||
                Utilities.isOneOf(token, specials) ||
                Utilities.isOneOf(token, elispSpecials) ||
                Utilities.isOneOf(token, hemlockSpecials))
                return buffer.getCol(pos) + indentSize;
            // Not special. Indent under the second element of the containing
            // list, if the second element is on the same line as the first.
            Position posSecond = forwardSexp(posFirst);
            if (posSecond != null) {
                posSecond.skipWhitespace();
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

    public Position findContainingSexp(Position start)
    {
        SyntaxIterator it = getSyntaxIterator(start);
        int parenCount = 0;
        while (true) {
            switch (it.prevChar()) {
                case ')':
                    ++parenCount;
                    break;
                case '(':
                    if (parenCount == 0)
                        return it.getPosition(); // Found unmatched '('.
                    if (it.getPosition().getOffset() == 0)
                        return null;
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

    public static void upList()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getMode() != mode)
            return;
        Position pos = mode.findContainingSexp(editor.getDot());
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

    // Advances pos to start of next line.
    private void skipComment(Position pos)
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

    public static void evalDefunLisp()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getMode() != mode)
            return;
        // Look for Lisp shell.
        CommandInterpreter lisp = LispShell.findLisp(null);
        if (lisp == null) {
            MessageDialog.showMessageDialog("No Lisp shell is running", "Error");
            return;
        }
        Editor ed = findEditor(lisp);
        if (ed == null)
            ed = editor.displayInOtherWindow(lisp);
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
                Position bufEnd = lisp.getEnd();
                bufEnd.getLine().setFlags(STATE_INPUT);
                lisp.insertString(bufEnd,
                    ";;; Evaluating defun " + defunName + "\n");
                lisp.renumber();
                lisp.send(r.toString().trim());
            }
        }
        ed.eob();
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
        // Look for Lisp shell.
        CommandInterpreter lisp = LispShell.findLisp(null);
        if (lisp == null) {
            MessageDialog.showMessageDialog("No Lisp shell is running",
                "Error");
            return;
        }
        Editor ed = findEditor(lisp);
        if (ed == null)
            ed = editor.displayInOtherWindow(lisp);
        Position bufEnd = lisp.getEnd();
        bufEnd.getLine().setFlags(STATE_INPUT);
        lisp.insertString(bufEnd, ";;; Evaluating region\n");
        lisp.renumber();
        lisp.send(new Region(editor).toString().trim());
        ed.eob();
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
        if (editor.getDot() == null)
            return;
        if (s == null)
            s = mode.getIdentifier(editor.getDot());
        if (s == null || s.length() == 0)
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
        File dataDir = File.getInstance(rootDir, "Data");
        File file = File.getInstance(dataDir, filename);
        Buffer buf = null;
        // Look for existing buffer.
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer b = it.nextBuffer();
            if (b instanceof WebBuffer && b.getFile().equals(file)) {
                buf = b;
                break;
            }
        }
        if (buf == null) {
            buf = WebBuffer.createWebBuffer(file, null, null);
            buf.setTransient(true);
        }
        if (editor.getBuffer() != buf) {
            editor.makeNext(buf);
            editor.activateInOtherWindow(buf);
        }
    }
}
