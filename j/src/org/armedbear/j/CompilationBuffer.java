/*
 * CompilationBuffer.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: CompilationBuffer.java,v 1.7 2003-01-02 17:08:45 piso Exp $
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
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.SwingUtilities;

public final class CompilationBuffer extends Buffer implements Runnable
{
    private String command;
    private String expandedCommand;

    private Line lastErrorLine;
    private String errorFileName;
    private int errorLineNumber;
    private int errorOffset;

    private String message;
    private Position posEndOfBuffer;
    private File currentDir;

    private Process process;
    private int exitValue;
    private File exitValueFile = null;

    private CompilationBuffer(String command, File directory)
    {
        setCommand(command);
        currentDir = directory;
        initializeUndo();
        type = TYPE_COMPILATION;
        mode = CompilationMode.getMode();
        formatter = new PlainTextFormatter(this);
        readOnly = true;
        setTransient(true);
        try {
            lockWrite();
        }
        catch (InterruptedException e) {
            Log.debug(e);
            return;
        }
        try {
            appendLine("");
            renumber();
        }
        finally {
            unlockWrite();
        }
        setLoaded(true);
        posEndOfBuffer = new Position(getFirstLine(), 0);
    }

    public synchronized final void initialize()
    {
        setTitle(expandedCommand = expandCommand(command));
        setInitialized(true);
    }

    public final void setCommand(String command)
    {
        this.command = command;
    }

    public final int getErrorLineNumber()
    {
        return errorLineNumber;
    }

    public final int getErrorOffset()
    {
        return errorOffset;
    }

    public final int exitValue()
    {
        return exitValue;
    }

    public void empty()
    {
        try {
            lockWrite();
        }
        catch (InterruptedException e) {
            Log.debug(e);
            return;
        }
        try {
            super.empty();
            appendLine("");
            renumber();
            setLoaded(true);
            posEndOfBuffer = new Position(getFirstLine(), 0);
            lastErrorLine = null;
        }
        finally {
            unlockWrite();
        }
        for (EditorIterator it = new EditorIterator(); it.hasNext();) {
            Editor ed = it.nextEditor();
            if (ed.getBuffer() == this) {
                ed.setDot(getFirstLine(), 0);
                ed.setTopLine(getFirstLine());
                ed.setMark(null);
            }
        }
    }

    public void run()
    {
        long start = System.currentTimeMillis();
        startProcess();
        if (process != null) {
            CompilationBufferReaderThread stdoutThread =
                new CompilationBufferReaderThread(process.getInputStream());
            stdoutThread.start();
            CompilationBufferReaderThread stderrThread =
                new CompilationBufferReaderThread(process.getErrorStream());
            stderrThread.start();
            try {
                exitValue = process.waitFor();
                if (exitValueFile != null && exitValueFile.isFile()) {
                    exitValue = getExitValueFromFile(exitValueFile);
                    exitValueFile.delete();
                    exitValueFile = null;
                }
                stdoutThread.join();
                stderrThread.join();
                long elapsed = System.currentTimeMillis() - start;
                FastStringBuffer sb = new FastStringBuffer();
                sb.append("\nCompilation ");
                if (exitValue == 0) {
                    sb.append("finished (");
                    sb.append(String.valueOf(elapsed));
                    sb.append(" milliseconds)");
                } else
                    sb.append("exited abnormally");
                sb.append("\n");
                appendLater(sb.toString());
            }
            catch (InterruptedException e) {
                Log.error(e);
            }
        } else
            appendLater("Unable to start compilation process\n");

        Editor.getTagFileManager().setEnabled(true);
    }

    private void startProcess()
    {
        process = null;
        exitValue = -1;
        try {
            if (Platform.isPlatformUnix()) {
                if (Utilities.haveJpty()) {
                    exitValueFile = Utilities.getTempFile();
                    FastStringBuffer sb = new FastStringBuffer();
                    sb.append("(\\cd \"");
                    sb.append(currentDir.canonicalPath());
                    sb.append("\" && ");
                    sb.append(expandedCommand);
                    sb.append("; echo $? > ");
                    sb.append(exitValueFile.canonicalPath());
                    sb.append(')');
                    final String cmd = sb.toString();
                    String[] cmdarray = {"jpty", "/bin/sh", "-c", cmd};
                    process = Runtime.getRuntime().exec(cmdarray);
                } else {
                    String cmd = "(\\cd \"" + currentDir.canonicalPath() + "\" && " + expandedCommand + ")";
                    String[] cmdarray = {"/bin/sh", "-c", cmd};
                    process = Runtime.getRuntime().exec(cmdarray);
                }
            } else if (Platform.isPlatformWindows()) {
                String cmd = "cd /d \"" + currentDir.canonicalPath() + "\" && " + expandedCommand;
                ArrayList list = new ArrayList();
                list.add("cmd.exe");
                list.add("/c");
                list.addAll(Utilities.tokenize(cmd));
                final int size = list.size();
                String[] cmdarray = new String[size];
                for (int i = 0; i < size; i++)
                    cmdarray[i] = (String) list.get(i);
                process = Runtime.getRuntime().exec(cmdarray);
            }
        }
        catch (IOException e) {}
    }

    private String expandCommand(String s)
    {
        int length = s.length();
        FastStringBuffer sb = new FastStringBuffer();
        boolean inQuote = false;
        for (int i = 0; i < length; i++) {
            char c = s.charAt(i);
            if (inQuote) {
                sb.append(c);
                if (c == '"')
                    inQuote = false;
            } else {
                // Not in quote.
                if (c == '"') {
                    sb.append(c);
                    inQuote = true;
                } else if (c == 'h') {
                    boolean replaced = false;
                    if (s.regionMatches(i, "here", 0, 4)) {
                        // "here" must be delimited by spaces.
                        if (i == 0 || s.charAt(i-1) == ' ') {
                            if (i+4 == length || s.charAt(i+4) == ' ') {
                                File file = parentBuffer.getFile();
                                if (file != null) {
                                    sb.append(file.canonicalPath());
                                    replaced = true;
                                }
                            }
                        }
                    }
                    if (replaced)
                        i += 3;
                    else
                        sb.append(c);
                } else
                    sb.append(c);
            }
        }
        return sb.toString();
    }

    private int getExitValueFromFile(File file)
    {
        int ret = -1;
        if (file != null) {
            try {
                InputStream inputStream = file.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                String s = reader.readLine();
                reader.close();
                try {
                    ret = Integer.parseInt(s);
                }
                catch (NumberFormatException e) {}
            }
            catch (IOException e) {}
        }
        return ret;
    }

    public static void killCompilation()
    {
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer buf = it.nextBuffer();
            if (buf instanceof CompilationBuffer) {
                ((CompilationBuffer)buf).killProcess();
                break;
            }
        }
    }

    private synchronized void killProcess()
    {
        if (process != null) {
            process.destroy();
            try {
                process.waitFor();
                process = null;
            }
            catch (InterruptedException e) {
                Log.error(e);
            }
        }
    }

    public void dispose()
    {
        killProcess();
    }

    private void thisError(Line line)
    {
        errorFileName = null;
        errorLineNumber = 0;
        errorOffset = 0;
        parseLineAsErrorMessage(line);
    }

    private void nextErrorInternal()
    {
        errorFileName = null;
        errorLineNumber = 0;
        errorOffset = 0;
        message = null;
        Line line = lastErrorLine != null ? lastErrorLine.next() : getFirstLine();
        while (line != null) {
            if (parseLineAsErrorMessage(line))
                break;
            else
                line = line.next();
        }
    }

    public Buffer getSourceBuffer()
    {
        File file = File.getInstance(currentDir, errorFileName);
        if (!file.isFile()) {
            // Strip path prefix.
            file = File.getInstance(errorFileName);
            String name = file.getName();

            // Look in current directory.
            file = File.getInstance(currentDir, name);
            if (!file.isFile())
                return null;
        }
        return Editor.getBuffer(file);
    }

    public String getMessage()
    {
        // Message on same line.
        if (message != null)
            return message;

        // Message on following line.
        if (lastErrorLine != null && lastErrorLine.next() != null)
            return lastErrorLine.next().trim();

        return null;
    }

    private boolean parseLineAsErrorMessage(Line line)
    {
        String text = line.trim();
        if (text.startsWith("[javac]")) {
            // Ant.
            text = text.substring(7).trim();
        }
        String lookFor = ") : error ";
        int index = text.indexOf(lookFor);
        if (index < 0) {
            lookFor = ") : warning ";
            index = text.indexOf(lookFor);
        }
        if (index >= 0) {
            // Microsoft C/C++.
            int end = text.indexOf('(');
            if (end >= 0) {
                String filename = text.substring(0, end);
                String s = text.substring(end + 1, index);
                int lineNumber = 0;
                try {
                    lineNumber = Integer.parseInt(s);
                }
                catch (NumberFormatException e) {
                    return false;
                }
                if (lineNumber > 0) {
                    // We have a winner.
                    lastErrorLine = line;
                    errorFileName = filename;
                    errorLineNumber = lineNumber;
                    // Look for error message on same line.
                    String remainder = text.substring(index + lookFor.length());
                    if ((index = remainder.indexOf(": ")) >= 0)
                        message = remainder.substring(index + 2).trim();
                    else
                        message = remainder.trim();
                    if (message.length() == 0)
                        message = null;
                    return true;
                }
            }
            return false;
        }
        index = text.indexOf(':');
        if (Platform.isPlatformWindows() && index == 1) {
            // The file name starts with a drive specifier ("c:").
            // We want the next ':', not this one.
            index = text.indexOf(':', 2);
        }
        if (index >= 0) {
            String filename = text.substring(0, index).trim();
            String remainder = text.substring(index + 1);
            index = remainder.indexOf(':');
            if (index >= 0) {
                String s = remainder.substring(0, index);
                int lineNumber = 0;
                try {
                    lineNumber = Integer.parseInt(s);
                }
                catch (NumberFormatException e) {
                    return false;
                }
                if (lineNumber > 0) {
                    // We have a winner.
                    lastErrorLine = line;
                    errorFileName = filename;
                    errorLineNumber = lineNumber;
                    // Maybe there's a column number too...
                    remainder = remainder.substring(index + 1);
                    index = remainder.indexOf(':');
                    if (index >= 0) {
                        // Found a colon.
                        s = remainder.substring(0, index);
                        try {
                            errorOffset = Integer.parseInt(s) - 1;
                        }
                        catch (NumberFormatException e) {
                            // No column number.
                        }
                    }
                    // Look for error message on same line.
                    if ((index = remainder.indexOf(": ")) >= 0)
                        message = remainder.substring(index + 2).trim();
                    else
                        message = remainder.trim();
                    if (message.length() == 0)
                        message = null;
                    return true;
                }
            }
        }
        return false;
    }

    public int load()
    {
        return LOAD_COMPLETED;
    }

    private void appendLater(final String s)
    {
        Runnable runnable = new Runnable() {
            public void run()
            {
                Position pos = posEndOfBuffer;
                insertString(pos, s);
                if (needsRenumbering())
                    renumber();
                for (EditorIterator it = new EditorIterator(); it.hasNext();) {
                    Editor ed = it.nextEditor();
                    if (ed.getBuffer() == CompilationBuffer.this) {
                        ed.eob();
                        ed.getDisplay().setReframe(-2);
                        ed.setUpdateFlag(REPAINT);
                        ed.updateDisplay();
                    }
                }
                resetUndo();
            }
        };
        SwingUtilities.invokeLater(runnable);
    }

    // For the buffer list.
    public String toString()
    {
        return command;
    }

    public String getFileNameForDisplay()
    {
        return getTitle();
    }

    // For the buffer list.
    public Icon getIcon()
    {
        return Utilities.getIconFromFile("jpty.png");
    }

    public File getCurrentDirectory()
    {
        return currentDir;
    }

    public void setCurrentDirectory(File directory)
    {
        currentDir = directory;
    }

    public boolean isModified()
    {
        return false;
    }

    private class CompilationBufferReaderThread extends ReaderThread
    {
        public CompilationBufferReaderThread(InputStream inputStream)
        {
            super(inputStream);
        }

        public void update(final String s)
        {
            appendLater(s);
        }
    }

    public static void recompile()
    {
        if (Platform.isPlatformWindows() && !Platform.isPlatformWindows5())
            return;
        final History history = new History("compile.command");
        final String command = history.getPrevious();
        if (command != null && command.length() > 0)
            compile(command, Editor.currentEditor());
        else
            compile();
    }

    public static void compile()
    {
        if (Platform.isPlatformWindows() && !Platform.isPlatformWindows5())
            return;
        final Editor editor = Editor.currentEditor();
        CompileDialog d = new CompileDialog(editor);
        editor.centerDialog(d);
        d.show();
        editor.repaintNow();
        final String command = d.getCommand();
        if (command != null && command.length() > 0)
            compile(command, editor);
    }

    public static void compile(String args)
    {
        if (Platform.isPlatformWindows() && !Platform.isPlatformWindows5())
            return;
        if (args != null && args.length() > 0) {
            History history = new History("compile.command");
            history.append(args);
            history.save();
            compile(args, Editor.currentEditor());
        }
    }

    private static void compile(final String command, final Editor editor)
    {
        IdleThread.killFollowContextTask();
        Editor.getTagFileManager().setEnabled(false);
        saveCompilableBuffers(editor);

        CompilationBuffer cb = null;
        boolean visible = false;

        // Look for existing compilation buffer.
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer buf = it.nextBuffer();
            if (buf.getType() == Buffer.TYPE_COMPILATION) {
                cb = (CompilationBuffer) buf;
                break;
            }
        }

        if (cb != null) {
            // Found existing compilation buffer.
            cb.empty();
            cb.setCommand(command);
            cb.setParentBuffer(editor.getBuffer());
            cb.setCurrentDirectory(editor.getCurrentDirectory());

            // Is it visible?
            EditorIterator it = new EditorIterator();
            while (it.hasNext()) {
                Editor ed = it.nextEditor();
                if (ed.getBuffer() == cb) {
                    ed.updateLocation();
                    ed.repaintNow();
                    visible = true;
                }
            }
        } else {
            cb = new CompilationBuffer(command, editor.getCurrentDirectory());
            cb.setParentBuffer(editor.getBuffer());
        }

        // Call initialize() before starting the thread so we can put the
        // expanded command in the location bar when the compilation buffer is
        // activated.
        cb.initialize();
        new Thread(cb).start();
        if (!visible) {
            Editor otherEditor = editor.getOtherEditor();
            if (otherEditor != null) {
                cb.setUnsplitOnClose(false);
                otherEditor.makeNext(cb);
            }
            editor.displayInOtherWindow(cb);
        }
    }

    private static void saveCompilableBuffers(Editor editor)
    {
        editor.setWaitCursor();
        int numModified = 0;
        int numErrors = 0;
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer buf = it.nextBuffer();
            if (!buf.isModified())
                continue;
            if (buf.isUntitled())
                continue;
            final int modeId = buf.getModeId();
            if (modeId == SEND_MAIL_MODE)
                continue;
            if (modeId == CHECKIN_MODE)
                continue;
            if (buf.getFile() != null && buf.getFile().isLocal()) {
                editor.status("Saving modified buffers...");
                ++numModified;
                if (buf.getBooleanProperty(Property.REMOVE_TRAILING_WHITESPACE))
                    buf.removeTrailingWhitespace();
                if (!buf.save())
                    ++numErrors;
            }
        }
        if (numModified == 0)
            ;
        else if (numErrors == 0)
            editor.status("Saving modified buffers...done");
        else {
            // User will already have seen detailed error information from Buffer.save().
            editor.status("Unable to save all compilable buffers");
        }
        editor.setDefaultCursor();
    }

    public static void thisError()
    {
        final Editor editor = Editor.currentEditor();
        final Buffer buffer = editor.getBuffer();
        if (!(buffer instanceof CompilationBuffer))
            return;

        // If this method is invoked via a mouse event mapping, move dot to
        // location of mouse click first.
        AWTEvent e = editor.getDispatcher().getLastEvent();
        if (e instanceof MouseEvent)
            editor.mouseMoveDotToPoint((MouseEvent)e);

        final CompilationBuffer cb = (CompilationBuffer) buffer;
        cb.thisError(editor.getDotLine());
        if (cb.errorFileName != null && cb.errorLineNumber != 0) {
            Buffer buf = cb.getSourceBuffer();
            if (buf == null)
                return;
            Editor otherEditor = editor.getOtherEditor();
            if (otherEditor != null)
                otherEditor.makeNext(buf);
            Editor ed = editor.activateInOtherWindow(buf);
            int lineNumber = cb.errorLineNumber - 1;
            if (lineNumber < 0)
                lineNumber = 0;
            Position pos = buf.findOriginal(lineNumber, cb.errorOffset);
            ed.moveDotTo(pos);
            ed.setUpdateFlag(REFRAME);
            ed.updateDisplay();
            Sidebar sidebar = editor.getSidebar();
            if (sidebar != null)
                sidebar.setUpdateFlag(SIDEBAR_BUFFER_LIST_ALL);
        }
    }

    public static void nextError()
    {
        final Editor editor = Editor.currentEditor();

        // Look for existing compilation buffer.
        CompilationBuffer cb = null;
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer buf = it.nextBuffer();
            if (buf.getType() == Buffer.TYPE_COMPILATION) {
                cb = (CompilationBuffer) buf;
                break;
            }
        }
        if (cb == null)
            return;

        cb.nextErrorInternal();

        if (cb.errorFileName != null && cb.errorLineNumber != 0) {
            boolean useOtherWindow = false;

            // Find editor displaying compilation buffer (if any).
            Editor ed = null;
            for (EditorIterator it = new EditorIterator(); it.hasNext();) {
                ed = it.nextEditor();
                if (ed.getBuffer() == cb)
                    break;
            }

            if (ed.getBuffer() != cb) {
                // The compilation buffer is not currently displayed.
                ed = editor.displayInOtherWindow(cb);
            } else if (ed == editor) {
                // This command was invoked from the window displaying the
                // compilation buffer.
                useOtherWindow = true;
            }

            // Move caret to relevant line of compilation buffer.
            if (cb.lastErrorLine != null) {
                Debug.assertTrue(ed.getBuffer() == cb);
                Line line = cb.lastErrorLine;
                ed.addUndo(SimpleEdit.MOVE);
                ed.update(ed.getDotLine());
                ed.setDot(line, 0);
                ed.update(ed.getDotLine());
                ed.moveCaretToDotCol();
                ed.getDisplay().setUpdateFlag(REFRAME);
                ed.updateDisplay();
            }

            // Find or create buffer for source file containing the error.
            Buffer buf = cb.getSourceBuffer();
            if (buf == null)
                return;
            Debug.assertTrue(ed.getBuffer() == cb);
            if (useOtherWindow) {
                Debug.assertTrue(ed == editor);
                Editor otherEditor = editor.getOtherEditor();
                if (otherEditor != null)
                    otherEditor.makeNext(buf);
                ed = editor.activateInOtherWindow(buf);
            } else {
                ed = editor;
                ed.makeNext(buf);
                ed.activate(buf);
            }

            int lineNumber = cb.errorLineNumber - 1;
            if (lineNumber < 0)
                lineNumber = 0;
            Position pos = buf.findOriginal(lineNumber, cb.errorOffset);
            ed.moveDotTo(pos);
            ed.setUpdateFlag(REFRAME);
            ed.updateDisplay();
            Sidebar sidebar = editor.getSidebar();
            if (sidebar != null)
                sidebar.setUpdateFlag(SIDEBAR_BUFFER_LIST_ALL);
        } else
            editor.status("No more errors");
    }
}
