/*
 * OpenFileTextFieldHandler.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: OpenFileTextFieldHandler.java,v 1.3 2002-11-29 16:41:32 piso Exp $
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

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.swing.SwingUtilities;

public final class OpenFileTextFieldHandler extends DefaultTextFieldHandler implements Constants
{
    private String title = "Open File";

    // Options.
    private boolean allowRemote = true;
    private boolean fileMustExist = false;
    private boolean checkBuffers = true;
    private boolean checkSourcePath = true;

    private boolean completionsIgnoreCase;
    private boolean filenamesIgnoreCase;

    private Object returned;
    private String encoding;

    public OpenFileTextFieldHandler(Editor editor, HistoryTextField textField)
    {
        super(editor, textField);
        if (Platform.isPlatformWindows()) {
            completionsIgnoreCase = true;
            filenamesIgnoreCase = true;
        } else {
            completionsIgnoreCase = Editor.preferences().getBooleanProperty(
                Property.FILENAME_COMPLETIONS_IGNORE_CASE);
            filenamesIgnoreCase = false;
        }
    }

    public final void setTitle(String s)
    {
        title = s;
    }

    public final void setAllowRemote(boolean b)
    {
        allowRemote = b;
    }

    public final void setFileMustExist(boolean b)
    {
        fileMustExist = b;
    }

    public final void setCheckBuffers(boolean b)
    {
        checkBuffers = b;
    }

    public final void setCheckSourcePath(boolean b)
    {
        checkSourcePath = b;
    }

    public void enter()
    {
        String entry = textField.getText();
        if (!entry.equals(editor.getBuffer().getFileNameForDisplay()))
            saveHistory();
        entry = preprocess(entry);
        if (encoding != null && !Utilities.isSupportedEncoding(encoding)) {
            FastStringBuffer sb =
                new FastStringBuffer("Unsupported encoding \"");
            sb.append(encoding);
            sb.append('"');
            error(sb.toString());
            return;
        }
        File currentDir = editor.getCurrentDirectory();
        Debug.assertTrue(currentDir != null);
        if (entry.length() == 0) {
            returned = currentDir;
            done();
            return;
        }
        // Aliases.
        String value = editor.getAlias(entry);
        if (value != null)
            entry = value;
        if (entry.startsWith("pop://") || entry.startsWith("{") ||
            entry.startsWith("mailbox:")) {
            openMailbox(editor, entry);
            editor.updateLocation();
            editor.ensureActive();
            editor.setFocusToDisplay();
            editor.updateDisplay();
            return;
        }
        File candidate = null;
        if (Utilities.isFilenameAbsolute(entry)) {
            candidate = File.getInstance(entry);
            if (candidate == null) {
                error("Invalid path");
                return;
            }
        } else if (entry.startsWith("./") || entry.startsWith(".\\")) {
            // Path specified is relative to current directory (even if remote).
            candidate = File.getInstance(currentDir, entry);
            if (candidate == null) {
                error("Invalid path");
                return;
            }
        }
        if (candidate != null) {
            if (candidate.isRemote()) {
                if (!allowRemote) {
                    error("File is remote");
                    return;
                }
            } else {
                // Not remote.
                if (!candidate.exists()) {
                    if (fileMustExist) {
                        error("File not found");
                        return;
                    }
                    if (!checkParentDirectory(candidate, title)) {
                        editor.updateLocation();
                        return;
                    }
                }
            }
            returned = candidate;
            done();
            return;
        }
        // Not absolute.  Look in current directory.
        if (!currentDir.isRemote()) {
            candidate = File.getInstance(currentDir, entry);
            if (candidate != null && candidate.exists()) {
                returned = candidate;
                done();
                return;
            }
        }
        // Not in current directory. Look for a match in one of the current
        // buffers.
        if (checkBuffers) {
            for (BufferIterator it = new BufferIterator(); it.hasNext();) {
                Buffer buf = it.nextBuffer();
                if (buf.getFile() == null)
                    continue;
                boolean found;
                if (filenamesIgnoreCase)
                    found = buf.getFile().getName().equalsIgnoreCase(entry);
                else
                    found = buf.getFile().getName().equals(entry);
                if (found) {
                    returned = buf;
                    done();
                    return;
                }
            }
        }
        // Not currently in a buffer. Look in source and include paths as
        // appropriate.
        if (checkSourcePath) {
            candidate = Utilities.findFile(editor, entry);
            if (candidate != null) {
                returned = candidate;
                done();
                return;
            }
        }
        // Not found in source or include path.
        if (allowRemote) {
            if (entry.startsWith("www.")) {
                returned = File.getInstance("http://".concat(entry));
                done();
                return;
            }
            if (entry.startsWith("ftp.")) {
                returned = File.getInstance("ftp://".concat(entry));
                done();
                return;
            }
        }
        // We failed. Use current directory.
        if (currentDir.isRemote())
            currentDir = Editor.getUserHomeDirectory();
        candidate = File.getInstance(currentDir, entry);
        if (candidate == null) {
            error("Invalid path");
            return;
        }
        if (fileMustExist && !candidate.exists()) {
            error("File not found");
            return;
        }
        if (!checkParentDirectory(candidate, title)) {
            editor.updateLocation();
            return;
        }
        returned = candidate;
        done();
    }

    private String preprocess(String s)
    {
        encoding = null;
        s = s.trim();
        if (s.startsWith("-e ")) {
            s = s.substring(3).trim();
            int index = s.indexOf(' ');
            encoding = s.substring(0, index);
            return s.substring(index+1).trim();
        }
        int index = s.indexOf(" -e ");
        if (index < 0)
            return s; // No encoding specified.
        encoding = s.substring(index+4).trim();
        return s.substring(0, index).trim();
    }

    private void openMailbox(Editor editor, String input)
    {
        try {
            Class c = Class.forName("org.armedbear.j.mail.MailCommands");
            Class[] parameterTypes = new Class[2];
            parameterTypes[0] = Class.forName("org.armedbear.j.Editor");
            parameterTypes[1] = Class.forName("java.lang.String");
            Method method = c.getMethod("openMailbox", parameterTypes);
            Object[] parameters = new Object[2];
            parameters[0] = editor;
            parameters[1] = input;
            method.invoke(null, parameters);
        }
        catch (Throwable t) {
            Log.error(t);
        }
    }

    private boolean checkParentDirectory(File file, String context)
    {
        File parentDir = file.getParentFile();
        if (parentDir != null && parentDir.isDirectory())
            return true;
        FastStringBuffer sb = new FastStringBuffer("Invalid path \"");
        sb.append(file.netPath());
        sb.append('"');
        MessageDialog.showMessageDialog(sb.toString(), context);
        return false;
    }

    private void done()
    {
        Object owner = textField.getOwner();
        if (owner instanceof OpenFileDialog) {
            OpenFileDialog dialog = (OpenFileDialog) owner;
            dialog.setResult(returned);
            dialog.ok();
            return;
        }
        Debug.assertTrue(editor != null);
        Buffer buf = null;
        if (returned instanceof Buffer) {
            buf = (Buffer) returned;
        } else if (returned instanceof File) {
            File file = (File) returned;
            file.setEncoding(encoding);
            if (file instanceof HttpFile) {
                if (Editor.getModeList().modeAccepts(IMAGE_MODE, file.getName())) {
                    buf = Editor.getBufferList().findBuffer(file);
                    if (buf == null)
                        buf = new RemoteBuffer(file);
                } else if (Editor.preferences().getBooleanProperty(Property.ENABLE_WEB)) {
                    if (editor.getMode() instanceof WebMode) {
                        // Current buffer is already a web buffer.
                        buf = editor.getBuffer();
                        Debug.assertTrue(buf instanceof WebBuffer);
                        ((WebBuffer)buf).saveHistory(buf.getFile(),
                            buf.getAbsoluteOffset(editor.getDot()),
                            ((WebBuffer)buf).getContentType());
                        // If we don't call setCache(null), go() will use the
                        // existing cache.
                        buf.setCache(null);
                        ((WebBuffer)buf).go(file, 0, null);
                    } else {
                        // Look for existing buffer.
                        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
                            Buffer b = it.nextBuffer();
                            if (b instanceof WebBuffer && b.getFile().equals(file)) {
                                buf = b;
                                break;
                            }
                        }
                        if (buf == null) {
                            // Existing buffer not found.
                            buf = WebBuffer.createWebBuffer(file, null, null);
                        }
                    }
                }
            }
            if (buf == null)
                buf = editor.openFile(file);
        }
        Editor.setCurrentEditor(editor);
        if (buf != null && buf != editor.getBuffer()) {
            editor.makeNext(buf);
            editor.switchToBuffer(buf);
        }
        if (Editor.getEditorList().contains(editor)) {
            editor.updateLocation();
            editor.ensureActive();
            editor.setFocusToDisplay();
            editor.updateDisplay();
        }
    }

    private void saveHistory()
    {
        final History history = textField.getHistory();
        if (history != null) {
            String entry = textField.getText().trim();
            if (entry.length() > 0) {
                history.append(entry);
                history.save();
            }
        }
    }

    public void escape()
    {
        Object owner = textField.getOwner();
        if (owner instanceof OpenFileDialog) {
            OpenFileDialog dialog = (OpenFileDialog) owner;
            dialog.cancel();
        } else {
            // Using location bar.
            editor.updateLocation();
            editor.ensureActive();
            editor.setFocusToDisplay();
        }
    }

    public boolean wantTab()
    {
        return true;
    }

    public void tab()
    {
        String entry = textField.getText();
        if (entry.startsWith("http:") || entry.startsWith("https:") ||
            entry.startsWith("ftp:"))
            return;
        File dir = editor.getCurrentDirectory();
        if (dir == null)
            return;
        String completion = null;
        if (dir.isLocal() &&
            (Utilities.isFilenameAbsolute(entry) || entry.startsWith(".."))) {
            File file = File.getInstance(dir, entry);
            if (file != null)
                completion = getCompletion(file.canonicalPath());
        } else
            completion = getCompletion(entry);
        if (completion != null && !completion.equals(entry)) {
            textField.setText(completion);
            textField.setCaretPosition(completion.length());
        }
    }

    public List getCompletions(String prefix)
    {
        ArrayList completions = new ArrayList();
        final File currentDirectory = editor.getCurrentDirectory();
        if (currentDirectory.isLocal()) {
            final String sourcePath = checkSourcePath ? getSourcePath() : null;
            prefix = File.normalize(prefix);
            FilenameCompletion completion =
                new FilenameCompletion(currentDirectory, prefix, sourcePath,
                    completionsIgnoreCase);
            List files = completion.listFiles();
            if (files != null) {
                final int limit = files.size();
                for (int i = 0; i < limit; i++) {
                    File file = (File) files.get(i);
                    // We don't want the file we're currently looking at.
                    if (file.equals(editor.getBuffer().getFile()))
                        continue;
                    String name;
                    if (currentDirectory.equals(file.getParentFile()))
                        name = file.getName();
                    else
                        name = file.canonicalPath();
                    if (file.isDirectory()) {
                        addCompletion(completions,
                            name.concat(LocalFile.getSeparator()));
                        continue;
                    }
                    if (isExcluded(name))
                        continue;
                    addCompletion(completions, name);
                }
            }
        }
        if (checkBuffers && !Utilities.isFilenameAbsolute(prefix) &&
            prefix.indexOf(LocalFile.getSeparatorChar()) < 0) {
            // Short name.
            addCompletionsFromBufferList(completions, prefix);
        }
        return completions;
    }

    private void addCompletionsFromBufferList(List list, String prefix)
    {
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer buf = it.nextBuffer();
            if (buf.getType() != Buffer.TYPE_NORMAL)
                continue;
            if (buf == editor.getBuffer())
                continue;
            if (buf.getFile() != null) {
                boolean isMatch = false;
                if (completionsIgnoreCase)
                    isMatch = buf.getFile().getName().regionMatches(true, 0,
                        prefix, 0, prefix.length());
                else
                    isMatch = buf.getFile().getName().startsWith(prefix);
                if (isMatch)
                    addCompletion(list, buf.getFile().getName());
            }
        }
    }

    // Add string to list if it's not already there.
    private void addCompletion(List list, String s)
    {
        if (s != null) {
            for (int i = list.size()-1; i >= 0; i--) {
                if (completionsIgnoreCase) {
                    if (s.equalsIgnoreCase((String)list.get(i)))
                        return;
                } else if (s.equals((String)list.get(i)))
                    return;
            }
            // Didn't find it.
            list.add(s);
        }
    }

    private boolean isExcluded(String pathname)
    {
        if (pathname.endsWith(".class") ||
            pathname.endsWith(".exe") ||
            pathname.endsWith(".obj") ||
            pathname.endsWith(".gz") ||
            pathname.endsWith("~")) {
            return true;
        }
        return false;
    }

    public String getSourcePath()
    {
        ArrayList dirs = new ArrayList();
        // We want to search the mode-specific source path first.
        String sourcePathForMode =
            editor.getBuffer().getStringProperty(Property.SOURCE_PATH);
        if (sourcePathForMode != null)
            dirs.addAll(Utilities.getDirectoriesInPath(sourcePathForMode));
        // Append any additional directories from the global source path.
        String globalSourcePath =
            Editor.preferences().getStringProperty(Property.SOURCE_PATH);
        if (globalSourcePath != null) {
            List list = Utilities.getDirectoriesInPath(globalSourcePath);
            for (int i = 0; i < list.size(); i++) {
                String s = (String) list.get(i);
                if (!dirs.contains(s))
                    dirs.add(s);
            }
        }
        // Reconstruct source path string.
        FastStringBuffer sb = new FastStringBuffer();
        for (int i = 0; i < dirs.size(); i++) {
            sb.append((String)dirs.get(i));
            sb.append(LocalFile.getPathSeparatorChar());
        }
        // Remove extra path separator at end of string.
        if (sb.length() > 0)
            sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    private final void error(String message)
    {
        MessageDialog.showMessageDialog(editor, message, title);
        editor.updateLocation();
    }
}
