/*
 * LispShellMode.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: LispShellMode.java,v 1.3 2002-10-19 15:29:01 piso Exp $
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
        km.mapKey(KeyEvent.VK_ENTER, 0, "LispShellMode.enter");
        km.mapKey(KeyEvent.VK_TAB, 0, "indentLineOrRegion");
        km.mapKey(KeyEvent.VK_C, CTRL_MASK | ALT_MASK, "shellInterrupt");
        km.mapKey(KeyEvent.VK_T, CTRL_MASK, "findTag");
        km.mapKey(KeyEvent.VK_F9, CTRL_MASK, "recompile");
        km.mapKey(')', "closeParen");
    }

    public static void enter()
    {
        CommandInterpreter.shellEnter();

        final Editor editor = Editor.currentEditor();
        final Display display = editor.getDisplay();
        final Buffer buffer = editor.getBuffer();
        final Mode mode = buffer.getMode();
        if (mode != getMode()) {
            Debug.bug();
            return;
        }

        Line dotLine = editor.getDotLine();
        if (dotLine.length() > 0)
            return;

        try {
            buffer.lockWrite();
        }
        catch (InterruptedException e) {
            Log.error(e);
            return;
        }
        try {
            buffer.getFormatter().parseBuffer();
            int indent = LispMode.getMode().getCorrectIndentation(dotLine, buffer);
            if (indent != buffer.getIndentation(dotLine)) {
                editor.addUndo(SimpleEdit.LINE_EDIT);
                buffer.setIndentation(dotLine, indent);
                dotLine.setFlags(STATE_AUTOINDENT);
                buffer.modified();
            }
            if (dotLine.length() > 0) {
                editor.moveDotToIndentation();
                editor.moveCaretToDotCol();
            } else {
                display.setCaretCol(indent - display.getShift());
                if (buffer.getBooleanProperty(Property.RESTRICT_CARET))
                    editor.fillToCaret();
            }
            buffer.resetUndo();
        }
        finally {
            buffer.unlockWrite();
        }
    }
}
