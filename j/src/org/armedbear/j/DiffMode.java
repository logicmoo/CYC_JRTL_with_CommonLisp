/*
 * DiffMode.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: DiffMode.java,v 1.1.1.1 2002-09-24 16:08:14 piso Exp $
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

import java.awt.AWTEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public final class DiffMode extends AbstractMode implements Constants, Mode
{
    private static final DiffMode mode = new DiffMode();

    private DiffMode()
    {
        super(DIFF_MODE, DIFF_MODE_NAME);
        setProperty(Property.VERTICAL_RULE, 0);
        setProperty(Property.SHOW_LINE_NUMBERS, false);
    }

    public static final DiffMode getMode()
    {
        return mode;
    }

    protected void setKeyMapDefaults( KeyMap km )
    {
        km.mapKey(KeyEvent.VK_ENTER, 0, "diffGotoFile");
        km.mapKey(KeyEvent.VK_G, CTRL_MASK | SHIFT_MASK, "diffGotoFile");
        km.mapKey(VK_DOUBLE_MOUSE_1, 0, "diffGotoFile");
        km.mapKey(VK_MOUSE_2, 0, "diffGotoFile");
    }

    public static void gotoFile()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getDot() == null)
            return;
        final Buffer buffer = editor.getBuffer();
        if (!(buffer instanceof DiffOutputBuffer))
            return;

        // If this method is invoked via a mouse event mapping, move dot to
        // location of mouse click first.
        AWTEvent e = editor.getDispatcher().getLastEvent();
        if (e instanceof MouseEvent)
            editor.mouseMoveDotToPoint((MouseEvent) e);

        DiffOutputBuffer diffOutputBuffer = (DiffOutputBuffer) buffer;
        int vcType = diffOutputBuffer.getVCType();
        switch (vcType) {
            case VC_P4:
                p4GotoFile(editor, diffOutputBuffer);
                break;
            case VC_CVS:
            default:
                cvsGotoFile(editor, diffOutputBuffer);
                break;
        }
    }

    private static void cvsGotoFile(Editor editor, DiffOutputBuffer diffOutputBuffer)
    {
        final Line dotLine = editor.getDotLine();
        final int dotOffset = editor.getDotOffset();
        final String text = dotLine.getText();
        if (text.startsWith("? ") || text.startsWith("Index: ")) {
            String filename = text.substring(text.indexOf(' ')+1);
            File file = File.getInstance(diffOutputBuffer.getDirectory(),
                filename);
            Buffer buf = editor.getBuffer(file);
            if (buf != null) {
                if (editor.getOtherEditor() != null) {
                    editor.activateInOtherWindow(buf);
                } else {
                    editor.makeNext(buf);
                    editor.activate(buf);
                }
            }
            return;
        }
        int lineNumber = 0;
        int count = 0;
        Line line = dotLine;
        if (line.getText().startsWith("@@")) {
            lineNumber = parseLineNumber(line);
        } else {
            line = line.previous();
            while (line != null && !line.getText().startsWith("@@")) {
                if (!line.getText().startsWith("-"))
                    ++count;
                line = line.previous();
            }
            if (line == null)
                return;
            Debug.assertTrue(line.getText().startsWith("@@"));
            lineNumber = parseLineNumber(line);
        }
        // Our line numbers are zero-based.
        if (--lineNumber < 0)
            return;
        lineNumber += count;
        Buffer buf = diffOutputBuffer.getParentBuffer();
        if (buf == null) {
            line = line.previous();
            while (line != null && !line.getText().startsWith("Index: "))
                line = line.previous();
            if (line == null)
                return;
            Debug.assertTrue(line.getText().startsWith("Index: "));
            if (line.getText().startsWith("Index: ")) {
                String filename = line.getText().substring(7);
                File file =
                    File.getInstance(diffOutputBuffer.getDirectory(),
                        filename);
                buf = editor.getBuffer(file);
            }
        }
        gotoLocation(editor, buf, lineNumber, dotOffset > 0 ? dotOffset-1 : 0);
    }

    private static void p4GotoFile(Editor editor, DiffOutputBuffer diffOutputBuffer)
    {
        final Line dotLine = editor.getDotLine();
        final int dotOffset = editor.getDotOffset();
        final String text = dotLine.getText();
        int lineNumber = 0;
        int count = 0;
        Line line = dotLine;
        if (line.getText().startsWith("@@")) {
            lineNumber = parseLineNumber(line);
        } else {
            line = line.previous();
            while (line != null && !line.getText().startsWith("@@")) {
                if (!line.getText().startsWith("-"))
                    ++count;
                line = line.previous();
            }
            if (line == null)
                return;
            Debug.assertTrue(line.getText().startsWith("@@"));
            lineNumber = parseLineNumber(line);
        }
        // Our line numbers are zero-based.
        if (--lineNumber < 0)
            return;
        lineNumber += count;
        Buffer buf = diffOutputBuffer.getParentBuffer();
        if (buf == null) {
            line = line.previous();
            while (line != null && !line.getText().endsWith(" ===="))
                line = line.previous();
            if (line == null)
                return;
            String filename = null;
            int index = line.getText().lastIndexOf(" - ");
            if (index >= 0) {
                filename = line.getText().substring(index+3);
                if (filename.endsWith(" ===="))
                    filename = filename.substring(0, filename.length()-5);
            }
            if (filename != null) {
                File file =
                    File.getInstance(diffOutputBuffer.getDirectory(),
                        filename);
                buf = editor.getBuffer(file);
            }
        }
        gotoLocation(editor, buf, lineNumber, dotOffset > 0 ? dotOffset-1 : 0);
    }

    private static void gotoLocation(Editor editor, Buffer buf, int lineNumber,
        int offset)
    {
        if (buf != null) {
            Position pos = buf.findOriginal(lineNumber, offset);
            editor.makeNext(buf);
            Editor ed = editor.activateInOtherWindow(buf);
            ed.moveDotTo(pos);
            ed.setUpdateFlag(REFRAME);
            ed.updateDisplay();
        }
    }

    private static int parseLineNumber(Line line)
    {
        String s = line.getText();
        int index = s.indexOf('+');
        if (index < 0)
            return 0;
        try {
            return Utilities.parseInt(s.substring(index+1));
        }
        catch (NumberFormatException e) {
            Log.error(e);
            return 0;
        }
    }
}
