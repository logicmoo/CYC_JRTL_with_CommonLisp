/*
 * FindInFiles.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: FindInFiles.java,v 1.2 2002-10-11 14:07:31 piso Exp $
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
import gnu.regexp.REMatch;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.SwingUtilities;
import javax.swing.undo.CompoundEdit;

public class FindInFiles extends Replacement implements Constants, BackgroundProcess
{
    private static FindInFiles findInFiles;

    private final Frame frame;
    private String files;

    private boolean includeSubdirs;
    private boolean searchFilesInMemory = true;
    private ListOccurrencesInFiles outputBuffer;
    private boolean listEachOccurrence;

    private Vector results = new Vector();

    private boolean cancelled;

    private int numFilesExamined;
    private int numFilesModified;

    private List filters;

    private SaveException saveException;
    private ConfirmReplacementDialog confirmDialog;

    private final String encoding;

    public FindInFiles(Editor editor)
    {
        super(editor);
        this.frame = editor.getFrame();
        encoding = Editor.preferences().getStringProperty(Property.DEFAULT_ENCODING);
    }

    public final boolean getIncludeSubdirs()
    {
        return includeSubdirs;
    }

    public final void setIncludeSubdirs(boolean b)
    {
        includeSubdirs = b;
    }

    public final boolean getSearchFilesInMemory()
    {
        return searchFilesInMemory;
    }

    public final void setSearchFilesInMemory(boolean b)
    {
        searchFilesInMemory = b;
    }

    public final ListOccurrencesInFiles getOutputBuffer()
    {
        return outputBuffer;
    }

    public final void setOutputBuffer(ListOccurrencesInFiles buf)
    {
        outputBuffer = buf;
    }

    public final boolean getListEachOccurrence()
    {
        return listEachOccurrence;
    }

    public final void setListEachOccurrence(boolean b)
    {
        listEachOccurrence = b;
    }

    public void listFiles(Editor editor)
    {
        if (outputBuffer != null && editor.getBuffer() != outputBuffer) {
            Buffer buf = null;
            for (BufferIterator it = new BufferIterator(); it.hasNext();) {
                Buffer b = it.nextBuffer();
                if (b == outputBuffer) {
                    buf = b;
                    break;
                }
            }
            if (buf == null) {
                // Output buffer was closed.
                outputBuffer.relink();
            }
            Editor ed = editor.activateInOtherWindow(outputBuffer);
            if (buf == null) {
                // Need to restore dot pos.
                ed.setDot(outputBuffer.getLastDotPos());
                ed.moveCaretToDotCol();
                ed.setUpdateFlag(REFRAME);
                ed.updateDisplay();
            }
        }
    }

    public final String getFiles()
    {
        return files;
    }

    public void setFiles(String files) throws Exception
    {
        ArrayList list = new ArrayList();
        StringTokenizer st = new StringTokenizer(files, ";");
        // We start in the editor's current directory.
        File currentDir = getEditor().getCurrentDirectory();
        if (currentDir == null || currentDir.isRemote())
            throw new Exception("Operation not supported for remote files");
        while (st.hasMoreTokens()) {
            String token = st.nextToken().trim();
            File file = File.getInstance(currentDir, token);
            if (file == null) {
                String message = "Invalid path \"" + token + '"';
                throw new Exception(message);
            }
            File parent = file.getParentFile();
            // Verify that the parent directory actually exists.
            if (parent == null || !parent.isDirectory()) {
                String message = "Invalid path \"" + token + '"';
                throw new Exception(message);
            }
            // Parent is our new current directory.
            currentDir = parent;
            String canonicalPath = file.canonicalPath();
            // This will throw an exception if canonicalPath isn't an
            // acceptable wildcard pattern.
            try {
                list.add(new Filter(canonicalPath));
            }
            catch (Exception e) {
                String message = "Unsupported wild card pattern";
                throw new Exception(message);
            }
        }
        // Success.
        this.files = files;
        filters = list;
    }

    public final void run()
    {
        if (outputBuffer != null) {
            outputBuffer.setBusy(true);
            outputBuffer.setBackgroundProcess(this);
        }
        runInternal();
        if (outputBuffer != null) {
            outputBuffer.setBackgroundProcess(null);
            outputBuffer.setBusy(false);
        }
    }

    private void runInternal()
    {
        frame.setWaitCursor();
        for (Iterator it = filters.iterator(); it.hasNext();) {
            Filter filter = (Filter) it.next();
            File dir = null;
            File spec = File.getInstance(filter.getPattern());
            if (spec != null) {
                File parent = spec.getParentFile();
                if (parent != null)
                    dir = parent;
            }
            if (dir == null)
                dir = getEditor().getCurrentDirectory();
            searchDirectory(dir, filter);
            // Did the user cancel?
            if (cancelled)
                break;
        }
        if (getReplaceWith() == null) {
            // Find in files, not replace in files.
            Runnable runnable = new Runnable() {
                public void run()
                {
                    frame.setDefaultCursor();
                    if (outputBuffer != null) {
                        if (cancelled)
                            getEditor().status("Search cancelled");
                        else
                            getEditor().status("Search completed");
                        FastStringBuffer sb =
                            new FastStringBuffer("Pattern found in ");
                        sb.append(results.size());
                        sb.append(" of ");
                        sb.append(numFilesExamined);
                        sb.append(" files examined");
                        if (cancelled)
                            sb.append(" (search cancelled by user)");
                        outputBuffer.appendStatusLine(sb.toString());
                        outputBuffer.renumber();
                        outputBuffer.setBusy(false);
                        EditorIterator iter = new EditorIterator();
                        while (iter.hasNext()) {
                            Editor ed = iter.nextEditor();
                            if (ed.getBuffer() == outputBuffer) {
                                ed.setTopLine(outputBuffer.getFirstLine());
                                ed.setDot(outputBuffer.getInitialDotPos());
                                ed.moveCaretToDotCol();
                                ed.setUpdateFlag(REPAINT);
                                ed.updateDisplay();
                            }
                        }
                    }
                }
            };
            SwingUtilities.invokeLater(runnable);
            // Nothing more to do if we're not doing replace in files.
            return;
        } else
            SwingUtilities.invokeLater(updateDisplayRunnable);

        if (!cancelled) {
            // Replace in files.
            Editor.getTagFileManager().setEnabled(false);
            replaceInAllFiles();
            Editor.getTagFileManager().setEnabled(true);
        }
    }

    public final void cancel()
    {
        cancelled = true;
    }

    private void searchDirectory(File dir, Filter filter)
    {
        String[] files = dir.list();
        if (files == null)
            return;
        for (int i = 0; i < files.length; i++) {
            if (cancelled)
                return;
            File file = File.getInstance(dir, files[i]);
            if (file.isDirectory()) {
                if (includeSubdirs)
                    searchDirectory(file, filter); // Recurse!
                continue;
            }
            if (!filter.accepts(files[i]))
                continue;
            if (isBinaryFile(file))
                continue;
            if (searchFilesInMemory) {
                Buffer buf = Editor.getBufferList().findBuffer(file);
                if (buf != null && buf.isLoaded()) {
                    Position pos = findInBuffer(buf);
                    if (pos != null) {
                        results.add(file);
                        if (outputBuffer != null)
                            processFile(file, buf.getMode(), pos);
                    }
                    ++numFilesExamined;
                    continue;
                }
                // No buffer found, fall through...
            }
            try {
                if (outputBuffer != null)
                    processFile(file);
                else if (containsPattern(file)) // Might throw CheckFileException.
                    results.add(file);
                ++numFilesExamined;
            }
            catch (CheckFileException e) {
                handleCheckFileException(e);
            }
        }
    }

    private void processFile(File file)
    {
        try {
            BufferedReader reader =
                new BufferedReader(new InputStreamReader(file.getInputStream(),
                    encoding));
            int lineNumber = 0;
            int matches = 0;
            String s;
            while ((s = reader.readLine()) != null) {
                ++lineNumber;
                if (find(s)) {
                    try {
                        outputBuffer.lockWrite();
                    }
                    catch (InterruptedException e) {
                        Log.error(e);
                        return;
                    }
                    try {
                        if (matches == 0) {
                            // First match in this file.
                            if (!listEachOccurrence && results.size() == 0)
                                outputBuffer.appendLine("Found in:");
                            outputBuffer.appendFileLine(file,
                                listEachOccurrence);
                            results.add(file);
                        }
                        ++matches;
                        if (listEachOccurrence)
                            outputBuffer.appendOccurrenceLine(s, lineNumber);
                        else
                            break;
                    }
                    finally {
                        outputBuffer.renumber();
                        outputBuffer.unlockWrite();
                    }
                    // Update display once per file found.
                    SwingUtilities.invokeLater(updateDisplayRunnable);
                }
            }
        }
        catch (IOException e) {
            Log.error(e);
        }
    }

    // BUG!! Unicode files are treated as binary.
    private static boolean isBinaryFile(File file)
    {
        try {
            InputStream in = file.getInputStream();
            byte[] bytes = new byte[4096];
            int bytesRead = in.read(bytes);
            in.close();
            for (int i = 0; i < bytesRead; i++) {
                if (bytes[i] == 0)
                    return true;
            }
            return false;
        }
        catch (IOException e) {
            Log.error(e);
            return true;
        }
    }

    private void processFile(File file, Mode mode, Position pos)
    {
        try {
            outputBuffer.lockWrite();
        }
        catch (InterruptedException e) {
            Log.error(e);
            return;
        }
        try {
            processFileInternal(file, mode, pos);
            outputBuffer.renumber();
        }
        finally {
            outputBuffer.unlockWrite();
        }
        // Update display once per file found.
        SwingUtilities.invokeLater(updateDisplayRunnable);
    }

    private final Runnable updateDisplayRunnable = new Runnable() {
        public void run()
        {
            Position end = null;
            EditorIterator iter = new EditorIterator();
            while (iter.hasNext()) {
                Editor ed = iter.nextEditor();
                if (ed.getBuffer() == outputBuffer) {
                    if (end == null)
                        end = outputBuffer.getEnd();
                    ed.moveDotTo(end);
                    ed.setUpdateFlag(REPAINT);
                    ed.updateDisplay();
                }
            }
        }
    };

    private void processFileInternal(File file, Mode mode, Position pos)
    {
        if (!listEachOccurrence && results.size() == 1)
            outputBuffer.appendLine("Found in:");
        outputBuffer.appendFileLine(file, listEachOccurrence);
        if (listEachOccurrence) {
            outputBuffer.appendOccurrenceLine(pos.getLine());
            while (pos.getLine().next() != null) {
                pos.moveTo(pos.getLine().next(), 0);
                if ((pos = find(mode, pos)) != null)
                    outputBuffer.appendOccurrenceLine(pos.getLine());
                else
                    break;
            }
        }
    }

    private boolean containsPattern(File file) throws CheckFileException
    {
        try {
            long size = file.length();
            if (size > Integer.MAX_VALUE) {
                Log.error("file too big");
                return false;
            }
            if (size == 0)
                return false;

            // Read all the bytes of the file into a single string.
            byte[] bytes = new byte[(int) size];
            InputStream in = file.getInputStream();
            if (in.read(bytes) != size) {
                Log.error("read error");
                return false;
            }
            in.close();
            String s = new String(bytes);
            int index = 0;
            if (isRegularExpression()) {
                RE re = getRE();
                Debug.assertTrue(re != null);
                while (true) {
                    REMatch match = re.getMatch(s, index);

                    if (match == null)
                        return false;

                    // We did find the pattern.
                    if (!wholeWordsOnly())
                        return true;

                    index = match.getStartIndex();

                    // Check character preceding pattern.
                    int before = index - 1;

                    if (before >= 0 && Character.isJavaIdentifierPart(s.charAt(before))) {
                        // No good, keep trying.
                        ++index;
                        continue;
                    }

                    // Check character following pattern.
                    int after = index + match.toString().length();

                    if (after < s.length() && Character.isJavaIdentifierPart(s.charAt(after))) {
                        // No good, keep trying.
                        ++index;
                        continue;
                    }

                    return true;
                }
            } else {
                // Not a regular expression.
                while (true) {
                    if (ignoreCase())
                        index = s.toLowerCase().indexOf(getLowerCasePattern(), index);
                    else
                        index = s.indexOf(getPattern(), index);

                    if (index < 0)
                        return false;

                    // We did find the pattern.
                    if (!wholeWordsOnly())
                        return true;

                    // Check character preceding pattern.
                    int before = index - 1;
                    if (before >= 0 && Character.isJavaIdentifierPart(s.charAt(before))) {
                        // No good, keep trying.
                        ++index;
                        continue;
                    }

                    // Check character following pattern.
                    int after = index + getPatternLength();
                    if (after < s.length() && Character.isJavaIdentifierPart(s.charAt(after))) {
                        // No good, keep trying.
                        ++index;
                        continue;
                    }

                    return true;
                }
            }
        }
        catch (Exception e) {
            checkFile(file);
            Log.error(e);
            return false;
        }
    }

    private void replaceInAllFiles()
    {
        final Editor editor = getEditor();
        final Buffer oldBuffer = editor.getBuffer();
        for (int i = 0; i < results.size(); i++) {
            File file = (File) results.get(i);
            try {
                replaceInFile(file);
            }
            catch (CheckFileException e) {
                handleCheckFileException(e);
            }
            catch (SaveException e) {
                handleSaveException(e);
            }
            if (cancelled)
                break;
        }

        // Restore state and display completion message.
        Runnable runnable = new Runnable() {
            public void run()
            {
                editor.activate(oldBuffer);
                editor.setUpdateFlag(REPAINT);
                frame.setDefaultCursor();
                editor.updateDisplay();
                completed();
            }
        };
        if (SwingUtilities.isEventDispatchThread())
            runnable.run();
        else
            SwingUtilities.invokeLater(runnable);
    }

    private void handleCheckFileException(final CheckFileException e)
    {
        Runnable runnable = new Runnable() {
            public void run()
            {
                String title = "Replace In Files";
                String message = e.getMessage();
                if (message == null)
                    message = "Error.";
                message += " Continue?";
                cancelled = !getEditor().confirm(title, message);
            }
        };

        if (SwingUtilities.isEventDispatchThread()) {
            runnable.run();
        } else {
            try {
                SwingUtilities.invokeAndWait(runnable);
            }
            catch (Exception ex) {
                Log.error(ex);
            }
        }
    }

    private void handleSaveException(final SaveException e)
    {
        Runnable runnable = new Runnable() {
            public void run()
            {
                String title = "Replace In Files";
                String message = e.getMessage();

                // Tell user exactly what error occurred.
                if (message != null)
                    MessageDialog.showMessageDialog(Editor.currentEditor(),
                        message, title);

                // Display summary message.
                message = "Unable to save " + e.getFile().canonicalPath();
                MessageDialog.showMessageDialog(Editor.currentEditor(),
                    message, title);

                message = "Continue anyway?";
                cancelled = !getEditor().confirm(title, message);
            }
        };

        if (SwingUtilities.isEventDispatchThread()) {
            runnable.run();
        } else {
            try {
                SwingUtilities.invokeAndWait(runnable);
            }
            catch (Exception ex) {
                Log.error(ex);
            }
        }
    }

    private void replaceInFile(final File file) throws CheckFileException, SaveException
    {
        checkFile(file);

        if (confirmChanges()) {
            if (SwingUtilities.isEventDispatchThread()) {
                frame.setDefaultCursor();
                replaceInFileConfirm(file);
                frame.setWaitCursor();
            } else {
                Runnable runnable = new Runnable() {
                    public void run()
                    {
                        frame.setDefaultCursor();
                        try {
                            replaceInFileConfirm(file);
                        }
                        catch (SaveException e) {
                            FindInFiles.this.saveException = e;
                        }
                        frame.setWaitCursor();
                    }
                };
                try {
                    SwingUtilities.invokeAndWait(runnable);
                }
                catch (Exception e) {
                    Log.error(e);
                }
                if (FindInFiles.this.saveException != null)
                    throw FindInFiles.this.saveException;
            }
        } else
            replaceInFileNoConfirm(file);
    }

    private void replaceInFileNoConfirm(File file) throws SaveException
    {
        Buffer buffer = Editor.getBufferList().findBuffer(file);
        if (buffer != null) {
            // Found existing buffer. It may or may not be loaded at this
            // point.
            if (!buffer.isLoaded()) {
                if (!buffer.initialized())
                    buffer.initialize();
                buffer.load();
                if (!buffer.isLoaded())
                    return; // Error handling?
            }
            final boolean wasModified = buffer.isModified();
            int oldReplacementCount = getReplacementCount();
            CompoundEdit compoundEdit = new CompoundEdit();
            Position pos = new Position(buffer.getFirstLine(), 0);
            while ((pos = find(buffer, pos)) != null) {
                compoundEdit.addEdit(new UndoLineEdit(buffer, pos.getLine()));
                replaceOccurrence(pos);
                buffer.incrementModCount();
            }
            compoundEdit.end();
            buffer.addEdit(compoundEdit);
            if (buffer.isModified() != wasModified)
                Sidebar.setUpdateFlagInAllFrames(SIDEBAR_REPAINT_BUFFER_LIST);
            if (getReplacementCount() > oldReplacementCount)
                ++numFilesModified;
            for (EditorIterator it = new EditorIterator(); it.hasNext();) {
                Editor ed = it.nextEditor();
                if (ed.getBuffer() == buffer) {
                    if (ed.getDotOffset() > ed.getDotLine().length()) {
                        ed.getDot().setOffset(ed.getDotLine().length());
                        ed.moveCaretToDotCol();
                        ed.updateDotLine();
                        ed.updateDisplay();
                    }
                }
            }
        } else {
            // There was no buffer for the file in question prior to this operation.
            SystemBuffer buf = new SystemBuffer(file);
            if (buf == null)
                return; // Error handling?
            buf.load();
            if (!buf.isLoaded())
                return; // Error handling?
            boolean modified = false;
            Position pos = new Position(buf.getFirstLine(), 0);
            while ((pos = find((Mode)null, pos)) != null) {
                if (cancelled)
                    break;
                replaceOccurrence(pos);
                modified = true;
            }
            if (modified)
                buf.writeBuffer(); // Throws SaveException if there's an error.
            if (modified)
                ++numFilesModified;
        }
        replacedInFile(file);
    }

    private void replaceInFileConfirm(File file) throws SaveException
    {
        final Editor editor = getEditor();
        boolean close = false;
        Buffer buffer = Editor.getBufferList().findBuffer(file);
        if (buffer == null) {
            buffer = Buffer.createBuffer(file);
            if (buffer == null)
                return; // Error handling?

            // We created the buffer for this operation, so we should close it
            // when we're done.
            close = true;
        }
        editor.activate(buffer);
        int oldReplacementCount = getReplacementCount();
        Position saved = new Position(editor.getDot());
        CompoundEdit compoundEdit = buffer.beginCompoundEdit();
        editor.moveDotTo(buffer.getFirstLine(), 0);
        Position pos = find(buffer, editor.getDot());
        if (pos == null) {
            // Not found.
            buffer.endCompoundEdit(compoundEdit);
            editor.undo();
            return;
        }
        final boolean wasModified = buffer.isModified();
        editor.moveDotTo(pos);
        editor.markFoundPattern(this);
        editor.updateDisplay();
        confirmDialog = new ConfirmReplacementDialog(this, true);
        confirmDialog.setTitle(file.netPath());

        // This is modal: carry out all replacements in this file.
        confirmDialog.show();

        if (confirmDialog.cancelled())
            cancelled = true;
        editor.moveDotTo(saved);
        buffer.endCompoundEdit(compoundEdit);
        if (close) {
            if (buffer.isModified()) {
                buffer.writeBuffer(); // Will throw SaveException if there's any error.
                buffer.saved();
                buffer.setLastModified(buffer.getFile().lastModified());
            }
            if (!buffer.isModified())
                editor.killBuffer();
        } else {
            // We're keeping the buffer open. Make sure the sidebar shows the
            // modified status for the file correctly.
            if (buffer.isModified() != wasModified) {
                // The file was just modified for the fist time. The buffer
                // lists need to be updated.
                Sidebar.setUpdateFlagInAllFrames(SIDEBAR_REPAINT_BUFFER_LIST);
            }
        }

        if (getReplacementCount() > oldReplacementCount) {
            ++numFilesModified;
            replacedInFile(file);
        }
    }

    private void replacedInFile(File file)
    {
        if (outputBuffer != null) {
            try {
                outputBuffer.lockWrite();
            }
            catch (InterruptedException e) {
                Log.error(e);
                return;
            }
            try {
                if (numFilesModified == 1)
                    outputBuffer.appendLine("Replaced in:");
                outputBuffer.appendFileLine(file, false);
            }
            finally {
                outputBuffer.renumber();
                outputBuffer.unlockWrite();
            }
            // Update display once per file found.
            SwingUtilities.invokeLater(updateDisplayRunnable);
        }
    }

    private void checkFile(File file) throws CheckFileException
    {
        if (file.isRemote())
            checkFileError(file, "file is not local");
        if (file.isDirectory())
            checkFileError(file, "file is a directory");
        if (!file.isFile())
            checkFileError(file, "file not found");
        if (!file.canRead())
            checkFileError(file, "file is not readable");
        boolean writable = file.canWrite();
        if (!writable &&
            Editor.preferences().getBooleanProperty(Property.P4_AUTO_EDIT)) {
            if (P4.autoEdit(file))
                writable = file.canWrite();
        }
        if (!writable)
            checkFileError(file, "file is read only");
    }

    private void checkFileError(File file, String reason) throws CheckFileException
    {
        FastStringBuffer sb = new FastStringBuffer("Can't process ");
        sb.append(file.netPath());
        sb.append(" (");
        sb.append(reason);
        sb.append(')');
        throw new CheckFileException(sb.toString());

    }

    // Completion message for replace in files only.
    private void completed()
    {
        FastStringBuffer sb = new FastStringBuffer();
        int replacementCount = getReplacementCount();
        if (replacementCount == 0) {
            sb.append("No occurrences replaced");
        } else {
            sb.append("Replaced ");
            sb.append(replacementCount);
            sb.append(" occurrence");
            if (replacementCount > 1)
                sb.append('s');
            sb.append(" in ");
            sb.append(numFilesModified);
            sb.append(" file");
            if (numFilesModified > 1)
                sb.append('s');
        }
        if (cancelled)
            sb.append(" (operation cancelled)");
        else
            sb.append(" (" + numFilesExamined + " files examined)");
        if (outputBuffer != null) {
            outputBuffer.appendStatusLine(sb.toString());
            outputBuffer.renumber();
            for (EditorIterator it = new EditorIterator(); it.hasNext();) {
                Editor ed = it.nextEditor();
                if (ed.getBuffer() == outputBuffer) {
                    ed.setTopLine(outputBuffer.getFirstLine());
                    ed.setDot(outputBuffer.getEnd());
                    ed.moveCaretToDotCol();
                    ed.setUpdateFlag(REPAINT);
                    ed.updateDisplay();
                }
            }
        } else
            MessageDialog.showMessageDialog(getEditor(), sb.toString(),
                "ReplaceInFiles");
    }

    public static void findInFiles()
    {
        final Editor editor = Editor.currentEditor();
        final File dir = editor.getCurrentDirectory();
        if (dir != null && !dir.isRemote())
            findOrReplaceInFiles(editor, false);
    }

    public static void replaceInFiles()
    {
        final Editor editor = Editor.currentEditor();
        final File dir = editor.getCurrentDirectory();
        if (dir != null && !dir.isRemote())
            findOrReplaceInFiles(editor, true);
    }

    private static void findOrReplaceInFiles(Editor editor, boolean replace)
    {
        FindInFilesDialog d = new FindInFilesDialog(editor, replace);
        editor.centerDialog(d);
        d.show();
        editor.repaintNow();
        if (d.findInFiles == null)
            return;
        if (findInFiles != null) {
            // Kill old output buffer.
            Buffer buf = findInFiles.getOutputBuffer();
            if (Editor.getBufferList().contains(buf))
                buf.kill();
        }
        findInFiles = d.findInFiles;
        findInFiles.setOutputBuffer(new ListOccurrencesInFiles(findInFiles));
        new Thread(findInFiles).start();
        Buffer outputBuffer = findInFiles.getOutputBuffer();
        if (outputBuffer != null)
            editor.activateInOtherWindow(outputBuffer);
        editor.status("Press Escape to cancel search");
    }

    public static void listFiles()
    {
        if (findInFiles != null)
            findInFiles.listFiles(Editor.currentEditor());
    }

    private static final class Filter
    {
        private final String pattern;

        private String prefix;
        private String suffix;
        private String substring;
        private boolean ignoreCase;

        Filter(String pattern) throws Exception
        {
            this.pattern = pattern;
            File file = File.getInstance(pattern);
            // BUG! Error handling!
            if (!processFilter(file.getName()))
                throw new Exception("process pattern failed");
            if (Platform.isPlatformWindows()) {
                ignoreCase = true;
                if (prefix != null)
                    prefix = prefix.toLowerCase();
                if (suffix != null)
                    suffix = suffix.toLowerCase();
                if (substring != null)
                    substring = substring.toLowerCase();
            }
        }

        String getPattern()
        {
            return pattern;
        }

        private boolean processFilter(String s)
        {
            if (s.indexOf("*") < 0)
                return false;
            if (s.startsWith("*")) {
                suffix = s.substring(1);
                if (suffix.endsWith("*")) {
                    substring = suffix.substring(0, suffix.length()-1);
                    suffix = null;
                    if (substring.indexOf("*") >= 0)
                        return false;
                }
                return true;
            }
            if (s.endsWith("*")) {
                prefix = s.substring(0, s.length()-1);
                if (prefix.indexOf("*") >= 0)
                    return false;
            }
            int index = s.indexOf("*");
            prefix = s.substring(0, index);
            suffix = s.substring(index+1, s.length());
            if (suffix.indexOf("*") >= 0)
                return false;
            return true;
        }

        // Returns true if name meets pattern criteria (dir is ignored).
        public boolean accepts(String name)
        {
            if (ignoreCase)
                name = name.toLowerCase();
            if (prefix != null)
                if (!name.startsWith(prefix))
                    return false;
            if (suffix != null)
                if (!name.endsWith(suffix))
                    return false;
            if (substring != null)
                if (name.indexOf(substring) >= 0)
                    return false;
            return true;
        }
    }

    private static final class CheckFileException extends Exception
    {
        CheckFileException(String message)
        {
            super(message);
        }
    }
}
