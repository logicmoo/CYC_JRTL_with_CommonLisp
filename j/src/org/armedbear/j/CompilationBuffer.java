/*
 * CompilationBuffer.java
 *
 * Copyright (C) 1998-2003 Peter Graves
 * $Id: CompilationBuffer.java,v 1.14 2003-06-05 17:30:55 piso Exp $
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
    private static CompilationBuffer lastCompilationBuffer;

    private String command;
    private String expandedCommand;
    private Position posEndOfBuffer;
    private File currentDir;
    private Process process;
    private int exitValue;
    private File exitValueFile;
    private CompilationError compilationError;

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
            compilationError = null;
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
            if (Platform.isPlatformWindows()) {
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
            } else {
                // Not Windows. Assume Unix.
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
            }
        }
        catch (Throwable t) {
            Log.error(t);
        }
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

    private CompilationError thisError(Line line)
    {
//         errorFileName = null;
//         errorLineNumber = 0;
//         errorOffset = 0;
        CompilationError ce = CompilationError.parseLineAsErrorMessage(line);
        if (ce != null) {
//             errorFileName = ce.getFileName();
//             errorLineNumber = ce.getLineNumber();
//             errorOffset = ce.getOffset();
//             message = ce.getMessage();
//             lastErrorLine = line;
        }
        return ce;
    }

    private CompilationError nextErrorInternal()
    {
        Line line;
        if (compilationError != null) {
            line = compilationError.getErrorLine();
            if (line != null)
                line = line.next();
        } else
            line = getFirstLine();
        while (line != null) {
            CompilationError ce =
                CompilationError.parseLineAsErrorMessage(line);
            if (ce != null) {
                compilationError = ce;
                return ce;
            }
            line = line.next();
        }
        return null;
    }

    private Buffer getSourceBuffer(String errorFileName)
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

    public CompilationError getCompilationError()
    {
        return compilationError;
    }

    public String getMessage()
    {
        String message = compilationError.getMessage();
        if (message != null)
            return message;

        // Message on following line.
        Line line = compilationError.getErrorLine();
        if (line != null && line.next() != null)
            return line.next().trim();

        return null;
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

        if (lastCompilationBuffer != null) {
            // Re-use existing compilation buffer.
            cb = lastCompilationBuffer;
            if (!Editor.getBufferList().contains(cb))
                cb.relink();
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
            lastCompilationBuffer = cb;
        }

        // Call initialize() before starting the thread so we can put the
        // expanded command in the location bar when the compilation buffer is
        // activated.
        cb.initialize();
        // Don't keep a reference to the parent buffer indefinitely!
        cb.setParentBuffer(null);
        new Thread(cb).start();
        if (!visible) {
            Editor otherEditor = editor.getOtherEditor();
            if (otherEditor != null) {
                cb.setUnsplitOnClose(otherEditor.getBuffer().unsplitOnClose());
                otherEditor.makeNext(cb);
            } else
                cb.setUnsplitOnClose(true);
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
        CompilationError ce = cb.thisError(editor.getDotLine());
        String errorFileName = ce.getFileName();
        int errorLineNumber = ce.getLineNumber();
        if (errorFileName != null && errorLineNumber != 0) {
            Buffer buf = cb.getSourceBuffer(errorFileName);
            if (buf == null)
                return;
            Editor otherEditor = editor.getOtherEditor();
            if (otherEditor != null)
                otherEditor.makeNext(buf);
            Editor ed = editor.activateInOtherWindow(buf);
            int lineNumber = errorLineNumber - 1;
            if (lineNumber < 0)
                lineNumber = 0;
            Position pos = buf.findOriginal(lineNumber, ce.getOffset());
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
        if (lastCompilationBuffer == null)
            return;
        final Editor editor = Editor.currentEditor();
        CompilationBuffer cb = lastCompilationBuffer;
        if (!Editor.getBufferList().contains(cb)) {
            cb.relink();
            Sidebar.setUpdateFlagInAllFrames(SIDEBAR_BUFFER_LIST_CHANGED);
        }
        CompilationError ce = cb.nextErrorInternal();
        if (ce == null) {
            editor.status("No more errors");
            return;
        }
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
        Line errorLine = ce.getErrorLine();
        if (errorLine != null) {
            Debug.assertTrue(ed.getBuffer() == cb);
            ed.addUndo(SimpleEdit.MOVE);
            ed.update(ed.getDotLine());
            ed.setDot(errorLine, 0);
            ed.update(ed.getDotLine());
            ed.moveCaretToDotCol();
            ed.getDisplay().setUpdateFlag(REFRAME);
            ed.updateDisplay();
        }
        String errorFileName = ce.getFileName();
        int errorLineNumber = ce.getLineNumber();
        if (errorFileName != null && errorLineNumber != 0) {
            // Find or create buffer for source file containing the error.
            Buffer buf = cb.getSourceBuffer(errorFileName);
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
            int lineNumber = errorLineNumber - 1;
            if (lineNumber < 0)
                lineNumber = 0;
            Position pos = buf.findOriginal(lineNumber, ce.getOffset());
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
