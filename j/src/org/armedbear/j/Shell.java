/*
 * Shell.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: Shell.java,v 1.9 2002-10-14 23:38:32 piso Exp $
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
import java.util.List;
import java.util.StringTokenizer;
import javax.swing.Icon;
import javax.swing.SwingUtilities;
import javax.swing.undo.CompoundEdit;

public class Shell extends Buffer implements Constants
{
    protected static final String JPTY_NOT_FOUND =
        "Unable to start shell process (jpty not found in PATH)";

    private RE promptRE = new UncheckedRE(DEFAULT_SHELL_PROMPT_PATTERN);

    protected String shellCommand;

    protected OutputStreamWriter stdin;

    private Process process;

    protected ReaderThread stdoutThread;
    protected ReaderThread stderrThread;

    protected String input;

    private String command; // First token on command line.

    protected Position posEndOfBuffer;
    protected Position posEndOfOutput;

    private boolean promptIsStderr = true;

    protected boolean stripEcho = false;

    private File oldDir;
    private File currentDir;
    private File initialDir;

    protected History history;

    protected Shell()
    {
        initializeUndo();
        type = TYPE_SHELL;
        mode = Editor.getModeList().getMode(SHELL_MODE);
        formatter = mode.getFormatter(this);
        initializeHistory();
        setInitialized(true);
    }

    protected Shell(String shellCommand)
    {
        this();
        this.shellCommand = shellCommand;
        if (shellCommand.indexOf("tcsh") >= 0)
            promptIsStderr = false;
    }
    
    protected Shell(String shellCommand, Mode mode)
    {
        initializeUndo();
        type = TYPE_SHELL;
        this.shellCommand = shellCommand;
        this.mode = mode;
        formatter = mode.getFormatter(this);
        initializeHistory();
        setInitialized(true);
    }

    protected synchronized Process getProcess()
    {
        return process;
    }

    protected synchronized void setProcess(Process p)
    {
        process = p;
    }

    private static final String getDefaultShellCommand()
    {
        String s =
            Editor.preferences().getStringProperty(Property.SHELL_FILE_NAME);
        if (s != null)
            return s;
        return "bash -i";
    }

    public final RE getPromptRE()
    {
        return promptRE;
    }

    public final void setPromptRE(String pattern)
    {
        Debug.assertTrue(promptRE != null);
        try {
            promptRE = new RE(pattern);
        }
        catch (REException e) {
            Log.error(e);
        }
        Debug.assertTrue(promptRE != null);
    }

    // Derived classes override this method.
    protected void initializeHistory()
    {
        history = new History("shell.history", 30);
    }

    private static Shell createShell(String shellCommand)
    {
        Shell shell = new Shell(shellCommand);
        shell.startProcess();
        if (shell.getProcess() == null) {
            Editor.getBufferList().remove(shell);
            String message;
            if (Utilities.haveJpty())
                message = "Unable to start shell process \"" + shell.shellCommand + "\"";
            else
                message = JPTY_NOT_FOUND;
            MessageDialog.showMessageDialog(message, "Error");
            return null;
        }
        shell.needsRenumbering = true;
        return shell;
    }

    protected void startProcess()
    {
        // Only set initialDir the first time we run, so that if we restart
        // this shell, it will start up in the same directory each time.
        if (initialDir == null) {
            initialDir = Editor.currentEditor().getCurrentDirectory();
            if (initialDir == null || initialDir.isRemote())
                initialDir = Editor.getUserHomeDirectory();
        }

        // Shell command may contain a space (e.g. "bash -i").
        StringTokenizer st = new StringTokenizer(shellCommand);
        String[] cmdArray = new String[st.countTokens() + 3];
        int i = 0;
        cmdArray[i++] = "jpty";
        cmdArray[i++] = "-cd";
        cmdArray[i++] = initialDir.canonicalPath();
        while (st.hasMoreTokens())
            cmdArray[i++] = st.nextToken();

        Process p = null;
        try {
            p = Runtime.getRuntime().exec(cmdArray);
            setProcess(p);
        }
        catch (Throwable t) {
            setProcess(null);
            return;
        }

        currentDir = initialDir;
        startWatcherThread();

        // See if the process exits right away (meaning jpty couldn't launch
        // the shell command).
        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            Log.error(e);
        }
        // When the process exits, the watcher thread calls setProcess(null),
        // so check the value of getProcess() here.
        if (getProcess() == null)
            return; // Process exited.

        setPromptRE(Editor.preferences().getStringProperty(
            Property.SHELL_PROMPT_PATTERN));

        try {
            stdin  = new OutputStreamWriter(p.getOutputStream());
            stdoutThread = new StdoutThread(p.getInputStream());
            stderrThread = new StderrThread(p.getErrorStream());
            stdoutThread.start();
            stderrThread.start();
            readOnly = false;
        }
        catch (Throwable t) {
            Log.error(t);
        }
    }

    public void dispose()
    {
        Log.debug("Shell.dispose");
        if (!checkProcess()) {
            Log.debug("checkProcess returned false");
            return;
        }
        Runnable r = new Runnable() {
            public void run()
            {
                try {
                    Log.debug("stdin.write(3)");
                    stdin.write(3);
                    stdin.flush();
                    Log.debug("stdin.write(\"exit\\n\")");
                    stdin.write("exit\n");
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
                Log.debug("dispose thread exiting");
            }
        };
        new Thread(r).start();
    }

    private void home()
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getDotOffset() == 0)
            return;
        editor.addUndo(SimpleEdit.MOVE);
        editor.beginningOfBlock();
        int offset = 0;
        if (promptRE != null) {
            Line dotLine = editor.getDotLine();
            if (dotLine.next() == null || dotLine.flags() == ShellFormatter.STATE_INPUT) {
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

    private void backspace()
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

    private void getInputFromHistory(int direction)
    {
        final Editor editor = Editor.currentEditor();
        final Line dotLine = editor.getDotLine();
        if (dotLine.next() != null) {
            editor.status("Not at command line");
            return;
        }
        if (editor.getLastCommand() != COMMAND_HISTORY)
            history.reset();
        String currentInput = dotLine.getText();
        REMatch prompt = promptRE.getMatch(currentInput);
        // Actual input does not include prompt.
        if (prompt != null)
            currentInput = currentInput.substring(prompt.getEndIndex());
        String s;
        while (true) {
            s = direction < 0 ? history.getPrevious() : history.getNext();
            if (s == null)
                break;
            if (!s.equals(currentInput))
                break;
        }
        if (s != null) {
            CompoundEdit compoundEdit = beginCompoundEdit();
            editor.addUndo(SimpleEdit.LINE_EDIT);

            // Keep the prompt, if any, but replace whatever is after it.
            if (prompt != null)
                dotLine.setText(prompt.toString() + s);
            else
                dotLine.setText(s);

            editor.updateDotLine();
            editor.addUndo(SimpleEdit.MOVE);
            editor.getDot().setOffset(dotLine.length());
            editor.moveCaretToDotCol();
            endCompoundEdit(compoundEdit);
        }
        editor.setCurrentCommand(COMMAND_HISTORY);
    }

    private void previousInput()
    {
        getInputFromHistory(-1);
    }

    private void nextInput()
    {
        getInputFromHistory(1);
    }

    private void escape()
    {
        Editor editor = Editor.currentEditor();
        if (editor.getMark() != null || editor.getDotLine().next() != null) {
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

        String text = editor.getDotLine().getText();
        REMatch match = promptRE.getMatch(text);
        if (match == null)
            return;
        String prompt = match.toString();
        if (text.equals(prompt) && editor.getDotOffset() == prompt.length())
            return; // Nothing to do.

        CompoundEdit compoundEdit = beginCompoundEdit();
        if (!text.equals(prompt)) {
            editor.addUndo(SimpleEdit.LINE_EDIT);
            editor.getDotLine().setText(prompt);
            Editor.updateInAllEditors(editor.getDotLine());
        }
        if (editor.getDotOffset() != prompt.length()) {
            editor.addUndo(SimpleEdit.MOVE);
            editor.getDot().setOffset(prompt.length());
            editor.moveCaretToDotCol();
        }
        endCompoundEdit(compoundEdit);
    }

    private void enter()
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
        enter(input);
    }

    private void enter(final String s)
    {
        if (s.length() != 0) {
            history.append(s);
            history.save();
        }
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
        if (dotLine.flags() == 0)
            dotLine.setFlags(ShellFormatter.STATE_INPUT);
        editor.eol();
        editor.insertLineSeparator();
        if (needsRenumbering)
            renumber();
        editor.moveCaretToDotCol();
        editor.getDisplay().setReframe(-2);
        posEndOfBuffer = editor.getDotCopy();
        resetUndo();

        // If it's a local shell (i.e. not telnet or ssh), keep track of the
        // current directory.
        if (type == TYPE_SHELL) {
            ShellTokenizer st = new ShellTokenizer(s);
            String commandLine = s.trim();
            command = commandLine;
            String arg = null;
            if (st.hasMoreTokens()) {
                command = st.nextToken();
                if (st.hasMoreTokens())
                    arg = st.nextToken();
            }
            if (command.equals("cd")) {
                if (arg == null)
                    changeDirectory(Utilities.getUserHome());
                else if (arg.equals("-")) {
                    if (oldDir != null)
                        changeDirectory(oldDir.canonicalPath());
                } else
                    changeDirectory(arg);
            } else if (command.equals("pushd"))
                changeDirectory(arg);
        }

        stripEcho = true;

        try {
            stdin.write(s.concat("\n"));
            stdin.flush();
        }
        catch (IOException e) {
            Log.error(e);
        }
    }

    private boolean checkProcess()
    {
        Process p = getProcess();
        if (p == null)
            return false;
        if (Utilities.isProcessAlive(p))
            return true;
        // Not alive.
        setProcess(null);
        readOnly = true;
        resetUndo();
        return false;
    }

    protected void startWatcherThread()
    {
        Runnable r = new Runnable() {
            public void run()
            {
                try {
                    Process p = getProcess();
                    if (p != null)
                        p.waitFor();
                    Log.debug("watcher thread waitFor() returned");
                    setProcess(null);
                    if (stdoutThread != null)
                        stdoutThread.join();
                    if (stderrThread != null)
                        stderrThread.join();
                }
                catch (InterruptedException e) {
                    Log.error(e);
                }
                Runnable processExitedRunnable = new Runnable() {
                    public void run()
                    {
                        appendString("\nProcess exited\n");
                        updateDisplayInAllFrames();
                        posEndOfOutput = new Position(posEndOfBuffer);
                    }
                };
                if (stderrThread != null)
                    SwingUtilities.invokeLater(processExitedRunnable);
                Log.debug("watcher thread exiting");
            }
        };
        new Thread(r).start();
    }

    private String stripPrompt(String s)
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

    private void tab()
    {
        final Editor editor = Editor.currentEditor();
        final Line dotLine = editor.getDotLine();
        final String dotLineText = dotLine.getText();
        final REMatch match = promptRE.getMatch(dotLineText);
        if (match == null)
            return; // Not at prompt.
        final String prompt = match.toString();
        final String userInput  = dotLineText.substring(match.getEndIndex());
        if (userInput.length() == 0)
            return; // Nothing to complete.
        final ShellTokenizer st = new ShellTokenizer(userInput);
        final String prefix = st.lastToken();
        if (prefix == null)
            return; // Nothing to complete.
        final String toBeCompleted = unescape(prefix);
        final Completion completion = new Completion(currentDir, toBeCompleted);
        final String toBeInserted = completion.toString();
        if (!toBeInserted.equals(prefix)) {
            CompoundEdit compoundEdit = beginCompoundEdit();
            editor.addUndo(SimpleEdit.MOVE);
            editor.getDot().setOffset(dotLineText.lastIndexOf(prefix));
            // Remove prefix from line.
            final String head = dotLine.substring(0, editor.getDotOffset());
            final String tail = dotLine.substring(editor.getDotOffset() + prefix.length());
            editor.addUndo(SimpleEdit.LINE_EDIT);
            dotLine.setText(head.concat(tail));
            // Insert completion.
            editor.addUndo(SimpleEdit.INSERT_STRING);
            editor.insertStringInternal(toBeInserted);
            // Move dot past inserted string.
            editor.moveCaretToDotCol();
            endCompoundEdit(compoundEdit);
            Editor.updateInAllEditors(dotLine);
        } else {
            final List completions = completion.getCompletions();
            final int size = completions.size();
            if (size > 0) {
                dotLine.setFlags(ShellFormatter.STATE_INPUT);
                editor.insertLineSeparator();
                for (int i = 0; i < size; i++) {
                    String s = (String) completions.get(i);
                    s = unescape(s);
                    int index = s.lastIndexOf('/', s.length()-2);
                    if (index >= 0)
                        s = s.substring(index+1);
                    editor.insertStringInternal(s);
                    editor.insertLineSeparator();
                }
                if (prompt != null)
                    editor.insertStringInternal(prompt);
                editor.insertStringInternal(userInput);
                editor.eob();
                editor.getDisplay().setReframe(-2);
                resetUndo();
            }
        }
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
            posEndOfBuffer = new Position(getFirstLine(), 0);
        }
        finally {
            unlockWrite();
        }
        return LOAD_COMPLETED;
    }

    private void updateDirectory(String output)
    {
        if (command != null) {
            String s = output;
            int index = s.indexOf('\r');
            if (index >= 0)
                s = s.substring(0, index);
            index = s.indexOf('\n');
            if (index >= 0)
                s = s.substring(0, index);
            if (command.equals("pwd"))
                changeDirectory(s);
            else if (command.equals("popd")) {
                // BUG! Directory names with embedded spaces will not be
                // handled correctly!
                index = s.indexOf(' ');
                if (index >= 0)
                    s = s.substring(0, index);
                changeDirectory(s);
            }
        }
    }

    private void changeDirectory(String s)
    {
        if (s != null) {
            s = unescape(s).trim();
            if (s.length() > 0) {
                char c = s.charAt(0);
                if (c == '\'' || c == '"') {
                    s = s.substring(1);
                    final int length = s.length();
                    if (length > 0 && s.charAt(length-1) == c)
                        s = s.substring(0, length-1);
                }
            } else
                s = Utilities.getUserHome();
            if (Platform.isPlatformWindows()) {
                if (!s.startsWith(".."))
                    s = Utilities.uncygnify(s);
            }
            File dir = File.getInstance(currentDir, s);
            if (dir != null && dir.isDirectory()) {
                oldDir = currentDir;
                currentDir = dir;
                for (EditorIterator it = new EditorIterator(); it.hasNext();) {
                    Editor ed = it.nextEditor();
                    if (ed.getBuffer() == this)
                        ed.updateLocation();
                }
            }
        }
    }

    private static String unescape(String s)
    {
        FastStringBuffer sb = new FastStringBuffer(s.length());
        char quoteChar = 0;
        final int limit = s.length();
        for (int i = 0; i < limit; i++) {
            char c = s.charAt(i);
            if (quoteChar != 0) {
                if (c == quoteChar)
                    quoteChar = 0;
                else
                    sb.append(c);
            } else if (c == '\'' || c == '"') {
                quoteChar = c;
            } else if (c == '\\') {
                if (i < limit - 1)
                    sb.append(s.charAt(++i));
            } else
                sb.append(c);
        }
        return sb.toString();
    }

    private void sendChar(int c)
    {
        final Editor editor = Editor.currentEditor();
        if (editor.getDotLine().next() == null)
            editor.getDotLine().setFlags(ShellFormatter.STATE_INPUT);
        try {
            stdin.write(c);
            stdin.flush();
        }
        catch (IOException e) {
            Log.error(e);
        }
    }

    // For the buffer list.
    public String toString()
    {
        return shellCommand;
    }

    public Icon getIcon()
    {
        return Utilities.getIconFromFile("jpty.png");
    }

    public String getTitle()
    {
        String dir = currentDir.toString();

        // Upper case drive letter.
        if (Platform.isPlatformWindows() && dir.length() >= 2 && dir.charAt(1) == ':')
            dir = Character.toUpperCase(dir.charAt(0)) + dir.substring(1);

        return shellCommand + "   " + dir;
    }

    public File getCurrentDirectory()
    {
        return currentDir;
    }

    public boolean isModified()
    {
        return false;
    }

    protected void appendString(String s)
    {
        if (s.indexOf(0x1b) >= 0) {
            // Strip escape sequences used for ls colorization.
            int limit = s.length();
            FastStringBuffer sb = new FastStringBuffer(limit);
            int i = 0;
            while (i < limit) {
                char c = s.charAt(i++);
                if (c == 0x1b) {
                    // Skip escaped chars through 'm'.
                    while (i < limit && s.charAt(i++) != 'm')
                        ;
                } else
                    sb.append(c);
            }
            s = sb.toString();
        }
        try {
            lockWrite();
        }
        catch (InterruptedException e) {
            Log.error(e);
            return;
        }
        try {
            Position pos = posEndOfBuffer;
            insertString(pos, s);
            if (needsRenumbering)
                renumber();
            if (pos != posEndOfBuffer)
                posEndOfBuffer.moveTo(pos);
            enforceOutputLimit(Property.SHELL_OUTPUT_LIMIT);
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

    protected String stdOutFilter(String s)
    {
        return s;
    }

    protected void stdOutUpdate(final String s)
    {
        Runnable r = new Runnable() {
            public void run()
            {
                if (s.length() > 0) {
                    updateDirectory(s);
                    appendString(s);
                    posEndOfOutput = new Position(posEndOfBuffer);
                }
                updateLineFlags();
                updateDisplayInAllFrames();
                resetUndo();
                checkPasswordPrompt();
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

    private void stdErrUpdate(final String s)
    {
        if (promptIsStderr) {
            REMatch match = promptRE.getMatch(s);
            if (match != null) {
                // This looks like the prompt.
                // Give stdout a chance to finish.
                try {
                    Thread.sleep(100);
                }
                catch (InterruptedException e) {
                    Log.error(e);
                }
            }
        }
        Runnable r = new Runnable() {
            public void run()
            {
                appendString(s);
                posEndOfOutput = new Position(posEndOfBuffer);
                updateLineFlags();
                updateDisplayInAllFrames();
                resetUndo();
            }
        };
        SwingUtilities.invokeLater(r);
    }

    protected void updateLineFlags()
    {
        Debug.assertTrue(SwingUtilities.isEventDispatchThread());
        Debug.assertTrue(posEndOfOutput != null);
        final Line last = posEndOfOutput.getLine();
        if (isPasswordPrompt(last)) {
            last.setFlags(ShellFormatter.STATE_PASSWORD_PROMPT);
            return;
        }
        // Look at the next-to-last line.
        final Line nextToLast = last.previous();
        // For now, this is a hard-coded test for Mikol's prompt. It should
        // really use a configurable regexp.
        if (nextToLast != null && nextToLast.getText().startsWith("| ")) {
            // Next-to-last line looks like first line of 2-line prompt.
            // See if the last line looks like the second line of the prompt.
            REMatch match = promptRE.getMatch(last.getText());
            if (match != null)
                nextToLast.setFlags(ShellFormatter.STATE_PROMPT);
        }
    }

    private boolean isPasswordPrompt(Line line)
    {
        final String text = line.trim();
        if (text.startsWith("Enter passphrase") && text.endsWith(":"))
            return true;
        if (text.toLowerCase().endsWith("password:"))
            return true;
        return false;
    }

    protected void checkPasswordPrompt()
    {
        if (isPasswordPrompt(posEndOfOutput.getLine())) {
            String password = PasswordDialog.showPasswordDialog(Editor.currentEditor(), "Password:", "Password");
            if (password != null) {
                try {
                    stdin.write(password + "\n");
                    stdin.flush();
                    posEndOfOutput = new Position(posEndOfBuffer);
                }
                catch (IOException e) {
                    Log.error(e);
                }
            }
        }
    }

    public static void shell()
    {
        shell(getDefaultShellCommand());
    }

    public static void shell(String shellCommand)
    {
        if (!Editor.checkExperimental())
            return;
        // Look for existing shell buffer.
        Buffer buf = null;
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer b = it.nextBuffer();
            if (b instanceof Shell) {
                if (((Shell)b).shellCommand.equals(shellCommand)) {
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
            buf = createShell(shellCommand);
        if (buf != null) {
            final Editor editor = Editor.currentEditor();
            editor.makeNext(buf);
            editor.switchToBuffer(buf);
        }
    }

    public static void shellEscape()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof Shell)
            ((Shell)buffer).escape();
    }

    public static void shellHome()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof Shell)
            ((Shell)buffer).home();
    }

    public static void shellBackspace()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof Shell)
            ((Shell)buffer).backspace();
    }

    public static void shellPreviousInput()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof Shell)
            ((Shell)buffer).previousInput();
    }

    public static void shellNextInput()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof Shell)
            ((Shell)buffer).nextInput();
    }

    public static void shellEnter()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof Shell)
            ((Shell)buffer).enter();
    }

    public static void shellTab()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof Shell && !(buffer instanceof RemoteShell))
            ((Shell)buffer).tab();
    }

    public static void shellInterrupt()
    {
        final Buffer buffer = Editor.currentEditor().getBuffer();
        if (buffer instanceof Shell)
            ((Shell)buffer).sendChar(3);
    }

    protected class StdoutThread extends ReaderThread
    {
        // If this constructor is private, we run into jikes 1.15 bug #2256.
        StdoutThread(InputStream stdout)
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
        // If this constructor is private, we run into jikes 1.15 bug #2256.
        StderrThread(InputStream stderr)
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
}
