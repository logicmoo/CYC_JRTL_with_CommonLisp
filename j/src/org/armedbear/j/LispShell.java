/*
 * LispShell.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: LispShell.java,v 1.8 2002-11-23 19:26:57 piso Exp $
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

public final class LispShell extends Shell
{
    private static final String DEFAULT_PROMPT_PATTERN =
        "^[^>\\*\\]]*[>\\*\\]] *";

    private static final String CLISP_PROMPT_PATTERN =
        "^[^>\\*\\]]*\\[[0-9]+\\]> ";

    private static final String CMUCL_PROMPT_PATTERN =
        "^\\* |^[0-9]+\\] ";

    private LispShell(String shellCommand)
    {
        super(shellCommand, LispShellMode.getMode());
        formatter = mode.getFormatter(this);
    }

    private static Shell createLispShell(String shellCommand)
    {
        LispShell shell = new LispShell(shellCommand);
        shell.startProcess();
        if (shell.getProcess() == null) {
            Editor.getBufferList().remove(shell);
            String message;
            if (Utilities.haveJpty())
                message = "Unable to start process \"" + shell.shellCommand + "\"";
            else
                message = JPTY_NOT_FOUND;
            MessageDialog.showMessageDialog(message, "Error");
            return null;
        }
        if (shellCommand.equals("clisp") || shellCommand.equals("/usr/bin/clisp"))
            shell.setPromptRE(CLISP_PROMPT_PATTERN);
        else if (shellCommand.equals("/usr/bin/lisp"))
            shell.setPromptRE(CMUCL_PROMPT_PATTERN);
        else
            shell.setPromptRE(DEFAULT_PROMPT_PATTERN);
        shell.needsRenumbering = true;
        return shell;
    }

    protected void initializeHistory()
    {
        history = new History("lisp.history", 30);
    }

    private Position findContainingSexp(Position pos)
    {
        return ((LispMode)LispMode.getMode()).findContainingSexp(pos);
    }

    public void enter()
    {
        if (!checkProcess())
            return;
        final Editor editor = Editor.currentEditor();
        Position dot = editor.getDotCopy();
        if (dot == null)
            return;
        Line dotLine = dot.getLine();
        if (posEndOfOutput == null) {
            // Ignore input before first prompt is displayed.
            dotLine.setText("");
            return;
        }
        if (dot.isBefore(posEndOfOutput)) {
            editor.newlineAndIndent();
            return; // For now.
        }
        Position pos = findContainingSexp(editor.getDot());
        int flags = dotLine.flags();
        if (flags == 0 || flags == STATE_AUTOINDENT)
            dotLine.setFlags(STATE_INPUT);
        editor.eol();
        editor.insertLineSeparator();
        editor.getDotLine().setFlags(0);
        if (needsRenumbering)
            renumber();
        editor.moveCaretToDotCol();
        editor.getDisplay().setReframe(-2);
        resetUndo();
        stripEcho = true;
        if (pos == null) {
            // No containing sexp. Send input to lisp process.
            Position begin = posEndOfOutput;
            Position end = editor.getDotCopy();
            end.setOffset(end.getLineLength());
            String s = new Region(this, begin, end).toString();
            sendInputToLisp(s);
        } else
            indentLineAtDot(editor);
    }

    private void indentLineAtDot(Editor editor)
    {
        final Line dotLine = editor.getDotLine();
        if (dotLine.length() > 0)
            return;
        try {
            lockWrite();
        }
        catch (InterruptedException e) {
            Log.error(e);
            return;
        }
        try {
            getFormatter().parseBuffer();
            int indent = mode.getCorrectIndentation(dotLine, this);
            if (indent != getIndentation(dotLine)) {
                editor.addUndo(SimpleEdit.LINE_EDIT);
                setIndentation(dotLine, indent);
                dotLine.setFlags(STATE_AUTOINDENT);
                modified();
            }
            if (dotLine.length() > 0) {
                editor.moveDotToIndentation();
                editor.moveCaretToDotCol();
            } else {
                final Display display = editor.getDisplay();
                display.setCaretCol(indent - display.getShift());
                if (getBooleanProperty(Property.RESTRICT_CARET))
                    editor.fillToCaret();
            }
            resetUndo(); // Why?
        }
        finally {
            unlockWrite();
        }
    }

    private void sendInputToLisp(String input)
    {
        // Save history unless input is very short (e.g. ":q"). Ignore
        // whitespace at end of line.
        String trim = input.trim();
        if (trim.length() > 2) {
            history.append(trim);
            history.save();
        }
        send(input);
    }

    public static void lisp()
    {
        lisp("lisp");
    }

    public static void lisp(String shellCommand)
    {
        if (!Utilities.haveJpty()) {
            MessageDialog.showMessageDialog(JPTY_NOT_FOUND, "Error");
            return;
        }
        // Look for existing LispShell buffer.
        Buffer buf = null;
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer b = it.nextBuffer();
            if (b instanceof LispShell) {
                if (((LispShell)b).shellCommand.equals(shellCommand)) {
                    buf = b;
                    break;
                }
            }
        }
        if (buf != null) {
            Shell shell = (Shell) buf;
            if (shell.getProcess() == null)
                shell.startProcess();
        } else
            buf = createLispShell(shellCommand);
        if (buf != null) {
            final Editor editor = Editor.currentEditor();
            editor.makeNext(buf);
            editor.activateInOtherWindow(buf);
        }
    }
}
