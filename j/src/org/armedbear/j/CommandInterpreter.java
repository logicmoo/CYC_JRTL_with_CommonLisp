/*
 * CommmandInterpreter.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: CommandInterpreter.java,v 1.7 2002-11-24 05:05:30 piso Exp $
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

import gnu.regexp.RE;
import gnu.regexp.REException;
import gnu.regexp.REMatch;
import gnu.regexp.UncheckedRE;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import javax.swing.undo.CompoundEdit;

public class CommandInterpreter extends Buffer
{
    protected RE promptRE = new UncheckedRE(DEFAULT_SHELL_PROMPT_PATTERN);
    protected OutputStreamWriter stdin;
    protected ReaderThread stdoutThread;
    protected ReaderThread stderrThread;
    protected History history;
    protected Position posEndOfOutput;
    protected String input;
    protected boolean stripEcho;

    protected CommandInterpreter()
    {
        super();
        initializeUndo();
        initializeHistory();
    }

    public final boolean isModified()
    {
        return false;
    }

    protected void initializeHistory()
    {
        history = new History(null, 30);
    }

    public final RE getPromptRE()
    {
        return promptRE;
    }

    protected final void setPromptRE(String pattern)
    {
        try {
            promptRE = new RE(pattern);
        }
        catch (REException e) {
            Log.error(e);
        }
    }

    public Icon getIcon()
    {
        return Utilities.getIconFromFile("jpty.png");
    }

    public int load()
    {
        try {
            lockWrite();
        }
        catch (InterruptedException e) {
            Log.debug(e);
            return LOAD_FAILED; // Shouldn't happen.
        }
        try {
            appendLine("");
            setLoaded(true);
        }
        finally {
            unlockWrite();
        }
        return LOAD_COMPLETED;
    }

    // Returns true if underlying process is alive and well.
    protected boolean checkProcess()
    {
        return true;
    }

    protected void enter()
    {
        if (!checkProcess())
            return;
        final Editor editor = Editor.currentEditor();
        final Line dotLine = editor.getDotLine();
        if (posEndOfOutput == null) {
            // Ignore input before first prompt is displayed.
            dotLine.setText("");
            return;
        }
        if (posEndOfOutput.getLine() == dotLine) {
            if (posEndOfOutput.getOffset() < dotLine.length())
                input = dotLine.getText().substring(posEndOfOutput.getOffset());
            else
                input = "";
        } else {
            // We're not at the end of the buffer.
            input = stripPrompt(dotLine.getText());
        }
        if (input.length() != 0) {
            history.append(input);
            history.save();
        }
        enter(input);
    }

    protected void enter(final String s)
    {
        final Editor editor = Editor.currentEditor();
        Line dotLine = editor.getDotLine();
        if (dotLine.next() != null) {
            // Go to end of buffer (if we're not already there) to append input.
            editor.eob();
            dotLine = editor.getDotLine();

            // Keep the prompt, but throw away anything after it.
            final REMatch match = promptRE.getMatch(dotLine.getText());
            if (match != null)
                dotLine.setText(dotLine.substring(0, match.getEndIndex()));

            // Append s.
            dotLine.setText(dotLine.getText() + s);
        }
        int flags = dotLine.flags();
        if (flags == 0)
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
        send(s);
    }

    protected void send(final String s)
    {
        try {
            stdin.write(s.concat("\n"));
            stdin.flush();
        }
        catch (IOException e) {
            Log.error(e);
        }
    }

    protected String stripPrompt(String s)
    {
        if (promptRE != null) {
            REMatch match = promptRE.getMatch(s);
            if (match != null)
                return s.substring(match.getEndIndex());
        }
        // Look for login name or password prompt.
        RE re = new UncheckedRE(".*: ?");
        REMatch match = re.getMatch(s);
        if (match != null)
            return s.substring(match.getEndIndex());
        return s;
    }

    protected void escape()
    {
        Editor editor = Editor.currentEditor();
        if (editor.getMark() != null || editor.getDot().isBefore(posEndOfOutput)) {
            // There's a marked block, or we're not at the command line.
            editor.escape();
            return;
        }
        // Check for transient buffer in other editor in current frame.
        Editor ed = editor.getOtherEditor();
        if (ed != null && ed.getBuffer().isTransient()) {
            editor.unsplitWindow();
            editor.maybeKillBuffer(ed.getBuffer());
            return;
        }
        CompoundEdit compoundEdit = beginCompoundEdit();
        editor.addUndo(SimpleEdit.MOVE);
        editor.moveDotTo(posEndOfOutput);
        editor.moveCaretToDotCol();
        editor.setMark(getEnd());
        editor.deleteRegion();
        endCompoundEdit(compoundEdit);
        // BUG! Undo/redo delete region doesn't preserve markers correctly!
        // (posEndOfOutput!)
        resetUndo();
    }

    protected void home()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getDotOffset() == 0)
            return;
        editor.addUndo(SimpleEdit.MOVE);
        editor.beginningOfBlock();
        int offset = 0;
        if (promptRE != null) {
            Line dotLine = editor.getDotLine();
            if (dotLine.next() == null || dotLine.flags() == STATE_INPUT) {
                REMatch match = promptRE.getMatch(dotLine.getText());
                if (match != null)
                    offset = match.getEndIndex();
            }
        }
        // If we're already at the prompt or to the left of it, go to column 0.
        if (editor.getDotOffset() <= offset)
            offset = 0;
        editor.getDot().setOffset(offset);
        editor.getDisplay().moveCaretToDotCol();
    }

    protected void backspace()
    {
        boolean ok = true;
        final Editor editor = Editor.currentEditor();
        if (editor.getDotLine() == posEndOfOutput.getLine()) {
            if (editor.getDotOffset() <= posEndOfOutput.getOffset())
                ok = false;
        } else{
            String text = editor.getDotLine().getText();
            if (promptRE != null) {
                REMatch match = promptRE.getMatch(text);
                if (match != null) {
                    if (editor.getDotOffset() <= match.getEndIndex())
                        ok = false;
                }
            }
        }
        if (ok)
            editor.backspace();
    }

    protected void previousInput()
    {
        getInputFromHistory(-1);
    }

    protected void nextInput()
    {
        getInputFromHistory(1);
    }

    private void getInputFromHistory(int direction)
    {
        final Editor editor = Editor.currentEditor();
        final Line dotLine = editor.getDotLine();
        if (dotLine.next() != null) {
            editor.status("Not at command prompt");
            return;
        }
        if (editor.getLastCommand() != COMMAND_HISTORY)
            history.reset();

        Position begin = posEndOfOutput.copy();
        Position end = getEnd();
        Region r = new Region(editor.getBuffer(), begin, end);
        String currentInput = r.toString();
        String s;
        while (true) {
            s = direction < 0 ? history.getPrevious() : history.getNext();
            if (s == null)
                break;
            s = s.trim();
            if (!s.equals(currentInput))
                break;
        }
        if (s != null) {
            CompoundEdit compoundEdit = beginCompoundEdit();
            editor.addUndo(SimpleEdit.MOVE);
            editor.setDot(posEndOfOutput.copy());
            editor.setMark(getEnd());
            editor.deleteRegion();
            editor.addUndo(SimpleEdit.INSERT_STRING);
            editor.insertStringInternal(s);
            editor.moveCaretToDotCol();
            endCompoundEdit(compoundEdit);
            // BUG! Undo/redo delete region doesn't preserve markers correctly!
            // (posEndOfOutput!)
            resetUndo();
        }
        for (Line line = posEndOfOutput.getLine(); line != null; line = line.next())
            line.setFlags(STATE_INPUT);
        editor.setCurrentCommand(COMMAND_HISTORY);
    }

    protected void appendString(String s)
    {
        try {
            lockWrite();
        }
        catch (InterruptedException e) {
            Log.error(e);
            return;
        }
        try {
            Position pos = getEnd();
            final Line line = pos.getLine();
            insertString(pos, s);
            if (needsRenumbering())
                renumber();
            enforceOutputLimit(Property.SHELL_OUTPUT_LIMIT);
            posEndOfOutput = pos.copy();
        }
        finally {
            unlockWrite();
        }
    }

    protected void updateDisplayInAllFrames()
    {
        for (EditorIterator it = new EditorIterator(); it.hasNext();) {
            Editor ed = it.nextEditor();
            if (ed.getBuffer() == this) {
                ed.eob();
                ed.getDisplay().setReframe(-2);
                ed.setUpdateFlag(REPAINT);
                ed.updateDisplay();
            }
        }
    }

    protected void sendChar(int c)
    {
        final Editor editor = Editor.currentEditor();
        final Line dotLine = editor.getDotLine();
        if (dotLine.next() == null)
            dotLine.setFlags(STATE_INPUT);
        try {
            stdin.write(c);
            stdin.flush();
        }
        catch (IOException e) {
            Log.error(e);
        }
    }

    protected String stdOutFilter(String s)
    {
        return s;
    }

    protected void stdOutUpdate(final String s)
    {
        Runnable r = new Runnable() {
            public void run()
            {
                appendString(s);
                updateDisplayInAllFrames();
                resetUndo();
            }
        };
        SwingUtilities.invokeLater(r);
    }

    protected String stdErrFilter(String s)
    {
        if (stripEcho && input != null && s.startsWith(input)) {
            int begin = input.length();
            if (s.length() > begin && s.charAt(begin) == '\r')
                ++begin;
            if (s.length() > begin && s.charAt(begin) == '\n')
                ++begin;
            s = s.substring(begin);
            // Strip echo only once per command line.
            stripEcho = false;
        }
        return s;
    }

    protected void stdErrUpdate(final String s)
    {
        Runnable r = new Runnable() {
            public void run()
            {
                appendString(s);
                updateDisplayInAllFrames();
                resetUndo();
            }
        };
        SwingUtilities.invokeLater(r);
    }

    protected class StdoutThread extends ReaderThread
    {
        public StdoutThread(InputStream stdout)
        {
            super(stdout);
        }

        public String filter(String s)
        {
            return stdOutFilter(s);
        }

        public void update(String s)
        {
            stdOutUpdate(s);
        }
    }

    protected class StderrThread extends ReaderThread
    {
        public StderrThread(InputStream stderr)
        {
            super(stderr);
        }

        public String filter(String s)
        {
            return stdErrFilter(s);
        }

        public void update(String s)
        {
            stdErrUpdate(s);
        }
    }

    // Commands.
    public static void shellEnter()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof CommandInterpreter)
            ((CommandInterpreter)buffer).enter();
    }

    public static void shellEscape()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof CommandInterpreter)
            ((CommandInterpreter)buffer).escape();
    }

    public static void shellHome()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof CommandInterpreter)
            ((CommandInterpreter)buffer).home();
    }

    public static void shellBackspace()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof CommandInterpreter)
            ((CommandInterpreter)buffer).backspace();
    }

    public static void shellPreviousInput()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof CommandInterpreter)
            ((CommandInterpreter)buffer).previousInput();
    }

    public static void shellNextInput()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof CommandInterpreter)
            ((CommandInterpreter)buffer).nextInput();
    }
}
