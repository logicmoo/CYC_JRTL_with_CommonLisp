/*
 * LispShell.java
 *
 * Copyright (C) 2002 Peter Graves
 * $Id: LispShell.java,v 1.19 2002-12-29 16:29:13 piso Exp $
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

import gnu.regexp.REMatch;
import java.io.IOException;
import javax.swing.SwingUtilities;

public final class LispShell extends Shell
{
    private static final String DEFAULT_PROMPT_PATTERN =
        "^[^>\\*\\]]*[>\\*\\]] *";

    private static final String ALLEGRO_PROMPT_PATTERN =
        "^(\\[[0-9+]\\] )?[-a-zA-z]+\\([0-9]+\\): ";

    private static final String CLISP_PROMPT_PATTERN =
        "^[^>\\*\\]]*\\[[0-9]+\\]> ";

    private static final String CMUCL_PROMPT_PATTERN =
        "^\\* |^[0-9]+\\] ";

    private String resetCommand = null;
    private String exitCommand = "(exit)";

    private LispShell(String shellCommand)
    {
        super(shellCommand, LispShellMode.getMode());
        formatter = mode.getFormatter(this);
    }

    public final boolean isLisp()
    {
        return true;
    }

    private void setResetCommand(String s)
    {
        resetCommand = s;
    }

    private void setExitCommand(String s)
    {
        exitCommand = s;
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
        if (shellCommand.equals("alisp") || shellCommand.equals("/usr/bin/alisp")) {
            shell.setPromptRE(ALLEGRO_PROMPT_PATTERN);
            shell.setResetCommand(":reset");
        } else if (shellCommand.indexOf("clisp") >= 0) {
            // clisp -I
            shell.setPromptRE(CLISP_PROMPT_PATTERN);
            shell.setResetCommand("(sys::debug-unwind)");
        } else if (shellCommand.equals("/usr/bin/lisp")) {
            shell.setPromptRE(CMUCL_PROMPT_PATTERN);
            shell.setResetCommand(":q");
            shell.setExitCommand("(quit)");
        } else if (shellCommand.equals("sbcl") || shellCommand.equals("/usr/bin/sbcl")) {
            shell.setPromptRE(CMUCL_PROMPT_PATTERN);
            shell.setResetCommand(":r toplevel");
        } else {
            shell.setPromptRE(DEFAULT_PROMPT_PATTERN);
            if (shellCommand.equals("rep") || shellCommand.equals("/usr/bin/rep"))
                shell.setExitCommand(",quit");
        }
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
        final Line dotLine = dot.getLine();
        if (posEndOfOutput == null) {
            // Ignore input before first prompt is displayed.
            dotLine.setText("");
            return;
        }
        if (dot.isBefore(posEndOfOutput)) {
            editor.newlineAndIndent();
            return; // For now.
        }
        dotLine.setFlags(STATE_INPUT);
        Position end = editor.getBuffer().getEnd();
        Position pos = findContainingSexp(end);
        boolean isComplete = (pos == null || pos.isBefore(posEndOfOutput));
        if (isComplete) {
            // Complete sexp.
            editor.eob();
            editor.insertLineSeparator();
            editor.getDotLine().setFlags(0);
        } else
            editor.insertLineSeparator();
        if (needsRenumbering)
            renumber();
        editor.moveCaretToDotCol();
        editor.getDisplay().setReframe(-2);
        resetUndo();
        stripEcho = true;
        if (isComplete) {
            // No containing sexp. Send input to lisp process.
            Position begin = posEndOfOutput;
            end = editor.getDotCopy();
            end.setOffset(end.getLineLength());
            String s = new Region(this, begin, end).toString();
            sendInputToLisp(s);
        } else
            indentLineAtDot(editor);
    }

    public void resetLisp()
    {
        if (resetCommand != null) {
            Editor.currentEditor().getDotLine().setFlags(STATE_INPUT);
            appendString(resetCommand.concat("\n"));
            send(resetCommand);
        }
    }

    protected void stdOutUpdate(final String s)
    {
        String prompt;
        int index = s.lastIndexOf('\n');
        if (index >= 0)
            prompt = s.substring(index+1);
        else
            prompt = s;
        REMatch match = promptRE.getMatch(prompt);
        if (match != null) {
            // Last line of output looks like a prompt.
            String m = match.toString();
            if (prompt.startsWith(m)) {
                if (prompt.substring(m.length()).startsWith(m)) {
                    // Double prompt. Remove one of them.
                    prompt = prompt.substring(m.length());
                }
            }
        }
        final String output;
        if (index >= 0)
            output = s.substring(0, index+1) + prompt;
        else
            output = prompt;
        Runnable r = new Runnable() {
            public void run()
            {
                if (output.length() > 0)
                    appendString(output);
                updateDisplayInAllFrames();
                resetUndo();
            }
        };
        SwingUtilities.invokeLater(r);
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
                dotLine.setFlags(STATE_INPUT);
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

    protected void updateLineFlags()
    {
        // Nothing to do.
    }

    public void dispose()
    {
        if (!checkProcess()) {
            Log.debug("checkProcess returned false");
            return;
        }
        Thread t = new Thread("LispShell dispose") {
            public void run()
            {
                try {
                    stdin.write(3);
                    stdin.flush();
                    stdin.write(exitCommand);
                    stdin.write("\n");
                    stdin.flush();
                    stdin.close();
                    final Process p = getProcess();
                    if (p != null) {
                        p.destroy();
                        p.waitFor();
                    }
                }
                catch (IOException e) {
                    Log.error(e);
                }
                catch (InterruptedException e) {
                    Log.error(e);
                }
            }
        };
        t.setDaemon(true);
        t.start();
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
        // Look for an existing LispShell buffer with the same shell command.
        Buffer buf = findLisp(shellCommand);
        if (buf != null) {
            Shell shell = (Shell) buf;
            if (shell.getProcess() == null)
                shell.startProcess();
        } else
            buf = createLispShell(shellCommand);
        if (buf != null) {
            final Editor editor = Editor.currentEditor();
            editor.makeNext(buf);
            Buffer b = editor.getBuffer();
            if (b != null && b.isPaired())
                editor.switchToBuffer(buf);
            else
                editor.activateInOtherWindow(buf);
        }
    }

    public static CommandInterpreter findLisp(String shellCommand)
    {
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer b = it.nextBuffer();
            if (b instanceof CommandInterpreter) {
                CommandInterpreter comint = (CommandInterpreter) b;
                if (comint.isLisp()) {
                    if (shellCommand == null ||
                        shellCommand.equals(comint.getShellCommand()))
                        return comint;
                }
            }
        }
        return null;
    }
}
