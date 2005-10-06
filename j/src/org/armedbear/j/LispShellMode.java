/*
 * LispShellMode.java
 *
 * Copyright (C) 2002-2005 Peter Graves
 * $Id: LispShellMode.java,v 1.17 2005-10-06 12:28:37 piso Exp $
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

public final class LispShellMode extends LispMode implements Constants, Mode
{
    private static final LispShellMode mode = new LispShellMode();

    protected LispShellMode()
    {
        super(LISP_SHELL_MODE, LISP_SHELL_MODE_NAME);
        setProperty(Property.VERTICAL_RULE, 0);
        setProperty(Property.SHOW_LINE_NUMBERS, false);
        setProperty(Property.SHOW_CHANGE_MARKS, false);
        setProperty(Property.HIGHLIGHT_BRACKETS, true);
        setProperty(Property.INDENT_SIZE, 2);
    }

    public static final Mode getMode()
    {
        return mode;
    }

    public Formatter getFormatter(Buffer buffer)
    {
        return new LispShellFormatter(buffer);
    }

    protected void setKeyMapDefaults(KeyMap km)
    {
        km.mapKey(KeyEvent.VK_HOME, 0, "shellHome");
        km.mapKey(KeyEvent.VK_BACK_SPACE, 0, "shellBackspace");
        km.mapKey(KeyEvent.VK_ESCAPE, 0, "shellEscape");
        km.mapKey(KeyEvent.VK_P, CTRL_MASK, "shellPreviousInput");
        km.mapKey(KeyEvent.VK_N, CTRL_MASK, "shellNextInput");
        km.mapKey(KeyEvent.VK_P, CTRL_MASK | ALT_MASK, "shellPreviousPrompt");
        km.mapKey(KeyEvent.VK_N, CTRL_MASK | ALT_MASK, "shellNextPrompt");
        km.mapKey(KeyEvent.VK_ENTER, 0, "LispShellMode.enter");
        km.mapKey(KeyEvent.VK_ENTER, ALT_MASK, "newlineAndIndent");
        km.mapKey(KeyEvent.VK_R, CTRL_MASK, "resetLisp");
        km.mapKey(KeyEvent.VK_TAB, 0, "indentLineOrRegion");
        km.mapKey(KeyEvent.VK_C, CTRL_MASK | ALT_MASK, "shellInterrupt");
        km.mapKey(KeyEvent.VK_T, CTRL_MASK, "findTag");
        km.mapKey(KeyEvent.VK_F9, CTRL_MASK, "recompile");
        km.mapKey(KeyEvent.VK_F1, ALT_MASK, "hyperspec");
        km.mapKey(KeyEvent.VK_M, CTRL_MASK, "lispFindMatchingChar");
        km.mapKey(KeyEvent.VK_M, CTRL_MASK | SHIFT_MASK, "lispSelectSyntax");
        km.mapKey(KeyEvent.VK_D, CTRL_MASK | ALT_MASK, "describe");
    }

    public void populateModeMenu(Editor editor, Menu menu)
    {
        menu.add(editor, "Reset Lisp", 'L', "resetLisp", true);
        menu.addSeparator();
        menu.add(editor, "Previous Input", 'P', "shellPreviousInput", true);
        menu.add(editor, "Next Input", 'N', "shellNextInput", true);
        menu.add(editor, "Goto Previous Prompt", 'R', "shellPreviousPrompt", true);
        menu.add(editor, "Goto Next Prompt", 'T', "shellNextPrompt", true);
    }

    public boolean isTaggable()
    {
        return false;
    }

    public Tagger getTagger(SystemBuffer buffer)
    {
        return null;
    }

    public boolean acceptsLinePaste(Editor editor)
    {
        if (editor.getBuffer() instanceof LispShell) {
            Position pos = ((LispShell)editor.getBuffer()).getEndOfOutput();
            if (pos != null)
                pos.getLine().setFlags(STATE_INPUT);
        }
        return false;
    }

    public static void enter()
    {
        final Editor editor = Editor.currentEditor();
        final Buffer buffer = editor.getBuffer();
        if (buffer.getMode() != mode) {
            Debug.bug();
            return;
        }
        if (buffer instanceof LispShell)
            ((LispShell)buffer).enter();
        else
            Debug.bug();
    }

    public static void electricCloseParen()
    {
        final Editor editor = Editor.currentEditor();
        final Buffer buffer = editor.getBuffer();
        if (buffer.getMode() != mode) {
            Debug.bug();
            return;
        }
        if (buffer instanceof LispShell)
            ((LispShell)buffer).electricCloseParen();
        else
            Debug.bug();
    }

    public static void resetLisp()
    {
        final Editor editor = Editor.currentEditor();
        final Buffer buffer = editor.getBuffer();
        if (buffer.getMode() != mode) {
            Debug.bug();
            return;
        }
        if (buffer instanceof LispShell)
            ((LispShell)buffer).resetLisp();
        else
            Debug.bug();
    }

    public static void describe()
    {
        describe(null);
    }

    public static void describe(String s)
    {
        final Editor editor = Editor.currentEditor();

        final Buffer buffer = editor.getBuffer();
        if (buffer.getMode() != mode) {
            Debug.bug();
            return;
        }
        if (!(buffer instanceof LispShell)) {
            Debug.bug();
            return;
        }
        if (s == null) {
            if (editor.getDot() == null)
                return;
            s = editor.getSelectionOnCurrentLine();
            if (s == null) {
                s = getArgumentForDescribe(editor.getDot());
                if (s == null) {
                    if (editor.getDot().equals(buffer.getEnd()))
                        s = "*";
                }
            }
        }
        if (s == null || s.length() == 0)
            return;
        ((LispShell)buffer).describe(s);
    }

    public static String getArgumentForDescribe(Position pos)
    {
        final Line line = pos.getLine();
        int offset = pos.getOffset();
        final int limit = line.length();
        if (limit == 0)
            return null;
        if (offset == limit)
            --offset;
        while (line.charAt(offset) == ' ') {
            if (offset > 0)
                --offset;
            else
                break;
        }
        char c = line.charAt(offset);
        if (c == '(' || c == ')')
            return null;
        if (c != ' ') {
            // Backtrack to find start of token.
            while (offset > 0) {
                --offset;
                c = line.charAt(offset);
                if (c == '(' || c == ')')
                    return null;
                if (c == ' ') {
                    ++offset;
                    break;
                }
            }
        }
        // Now we're looking at the first character of the token, if there
        // is one.
        c = line.charAt(offset);
        if (c == ' ')
            return null;
        FastStringBuffer sb = new FastStringBuffer(c);
        while (++offset < limit) {
            c = line.charAt(offset);
            if (c == '(' || c == ')')
                return null;
            if (c != ' ')
                sb.append(c);
            else
                break;
        }
        return sb.toString();
    }
}
