/*
 * OpenFileTextFieldHandler.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: OpenFileTextFieldHandler.java,v 1.15 2002-12-07 19:29:35 piso Exp $
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

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JList;
import javax.swing.JPopupMenu;
import javax.swing.JScrollPane;
import javax.swing.MenuElement;
import javax.swing.MenuSelectionManager;
import javax.swing.SwingUtilities;

public final class OpenFileTextFieldHandler extends DefaultTextFieldHandler
    implements Constants
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

    private JPopupMenu popup;
    private JList listbox;

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
        final Buffer buffer = editor.getBuffer();
        String entry = textField.getText();
        if (!entry.equals(buffer.getFileNameForDisplay()))
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
        File currentDir = buffer.getCompletionDirectory();
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
            candidate = File.getInstance(currentDir, entry);
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
        candidate = File.getInstance(currentDir, entry);
        if (candidate != null && candidate.exists()) {
            returned = candidate;
            done();
            return;
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
        if (popup != null) {
            Debug.bug();
            popup.setVisible(false);
            popup = null;
        }
        Object owner = textField.getOwner();
        if (owner instanceof OpenFileDialog) {
            OpenFileDialog dialog = (OpenFileDialog) owner;
            dialog.cancel();
        } else {
            // Using location bar.
            editor.updateLocation();
            editor.ensureActive();
            Editor.restoreFocus();
        }
    }

    public boolean wantTab()
    {
        return true;
    }

    private String originalText;

    public void tab()
    {
        final String entry = textField.getText();
        if (entry.startsWith("http:") || entry.startsWith("https:") ||
            entry.startsWith("ftp:"))
            return;
        final File dir = editor.getCompletionDirectory();
        if (dir == null)
            return;
        String prefix = null;
        if (dir.isLocal() &&
            (Utilities.isFilenameAbsolute(entry) || entry.startsWith(".."))) {
            File file = File.getInstance(dir, entry);
            if (file != null) {
                prefix = file.canonicalPath();
                if (entry.endsWith(LocalFile.getSeparator()))
                    prefix = prefix.concat(LocalFile.getSeparator());
            }
        } else
            prefix = entry;
        if (prefix == null)
            return;
        editor.setWaitCursor();
        final boolean showCompletionList;
        if (textField.getOwner() instanceof OpenFileDialog) {
            showCompletionList = false;
        } else {
            showCompletionList = Editor.preferences().getBooleanProperty(
                Property.SHOW_COMPLETION_LIST);
        }
        if (showCompletionList) {
            if (popup == null) {
                long start = System.currentTimeMillis();
                completions = getCompletions(prefix);
                long elapsed = System.currentTimeMillis() - start;
                Log.debug("getCompletions " + elapsed + " ms " +
                    completions.size() + " completions");
                index = 0;
                if (completions.size() == 1) {
                    String completion = (String) completions.get(0);
                    textField.setText(completion);
                    textField.setCaretPosition(completion.length());
                } else if (completions.size() > 1) {
                    showCompletionsPopup();
                    originalText = textField.getText();
                    String completion = (String) completions.get(0);
                    textField.setText(completion);
                }
            } else
                tabPopup(+1, true);
        } else {
            // No completion list.
            while (true) {
                String s = getCompletion(prefix);
                if (s == null)
                    break;
                if (s.equals(entry)) {
                    // Only one possible completion. Accept it and continue.
                    prefix = entry;
                    reset();
                    File file = File.getInstance(dir, entry);
                    if (file != null && file.isDirectory())
                        continue;
                    else
                        break;
                }
                // More than one possible completion. Present the current one
                // and let the user decide what to do next.
                textField.setText(s);
                textField.setCaretPosition(s.length());
                break;
            }
        }
        editor.setDefaultCursor();
    }

    public List getCompletions(String prefix)
    {
        final File dir = editor.getCompletionDirectory();
        ArrayList completions = new ArrayList();
        final String sourcePath = checkSourcePath ? getSourcePath() : null;
        prefix = File.normalize(prefix);
        long start = System.currentTimeMillis();
        FilenameCompletion completion =
            new FilenameCompletion(dir, prefix, sourcePath,
                completionsIgnoreCase);
        long elapsed = System.currentTimeMillis() - start;
        Log.debug("new FilenameCompletion " + elapsed + " ms");
        final File currentDirectory = getCurrentDirectory();
        final File currentFile = editor.getBuffer().getFile();
        List files = completion.listFiles();
        if (files != null) {
            final int limit = files.size();
            for (int i = 0; i < limit; i++) {
                File file = (File) files.get(i);
                String name;
                if (currentDirectory != null && currentDirectory.isLocal() &&
                    currentDirectory.equals(file.getParentFile())) {
                    name = file.getName();
                } else {
                    name = file.netPath();
                }
                if (file.isDirectory()) {
                    addCompletion(completions,
                        name.concat(file.getSeparator()));
                    continue;
                }
                if (isExcluded(name))
                    continue;
                addCompletion(completions, name);
            }
        }
        if (checkBuffers && !Utilities.isFilenameAbsolute(prefix) &&
            prefix.indexOf(LocalFile.getSeparatorChar()) < 0) {
            // Short name.
            addCompletionsFromBufferList(completions, prefix, currentDirectory);
        }
        return completions;
    }

    private void addCompletionsFromBufferList(List list, String prefix,
        File currentDirectory)
    {
        for (BufferIterator it = new BufferIterator(); it.hasNext();) {
            Buffer buf = it.nextBuffer();
            if (buf.getType() != Buffer.TYPE_NORMAL)
                continue;
            if (buf == editor.getBuffer())
                continue;
            File file = buf.getFile();
            if (file != null) {
                boolean isMatch = false;
                if (completionsIgnoreCase)
                    isMatch = file.getName().regionMatches(true, 0, prefix, 0,
                        prefix.length());
                else
                    isMatch = file.getName().startsWith(prefix);
                if (isMatch) {
                    String name;
                    if (currentDirectory != null &&
                        currentDirectory.equals(file.getParentFile())) {
                        name = file.getName();
                    } else {
                        name = file.canonicalPath();
                    }
                    addCompletion(list, name);
                }
            }
        }
    }

    // Add string to list if it's not already there.
    private void addCompletion(List list, String s)
    {
        if (s != null) {
            for (int i = list.size(); i-- > 0;) {
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

    // Returns null if there is no file associated with the current buffer.
    private File getCurrentDirectory()
    {
        File file = editor.getBuffer().getFile();
        if (file == null)
            return null;
        if (file.isDirectory())
            return file;
        return file.getParentFile();
    }

    private String getSourcePath()
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

    private void showCompletionsPopup()
    {
        String[] array = new String[completions.size()];
        completions.toArray(array);
        popup = new JPopupMenu();
        popup.add(new CompletionsList(array));
        popup.show(textField, 0, textField.getHeight());
    }

    private void tabPopup(int n, boolean wrap)
    {
        int count = listbox.getModel().getSize();
        if (count == 0) {
            Debug.bug();
            return;
        }
        int index = listbox.getSelectedIndex();
        int i = index + n;
        if (wrap) {
            if (i >= count)
                i = 0;
            else if (i < 0)
                i = count - 1;
        } else {
            if (i >= count || i < 0)
                i = index;
        }
        if (i != index) {
            listbox.setSelectedIndex(i);
            listbox.ensureIndexIsVisible(i);
            String s = (String) listbox.getSelectedValue();
            textField.setText(s);
        }
    }

    private void enterPopup()
    {
        popup.setVisible(false);
        popup = null;
        File file = File.getInstance(editor.getCompletionDirectory(),
            textField.getText());
        if (file == null || file.isDirectory()) {
            textField.requestFocus();
            end();
        } else {
            editor.repaintNow();
            enter();
        }
    }

    private void end()
    {
        Runnable r = new Runnable() {
            public void run()
            {
                textField.setCaretPosition(textField.getText().length());
            }
        };
        SwingUtilities.invokeLater(r);
    }

    protected void reset()
    {
        if (popup != null) {
            popup.setVisible(false);
            popup = null;
        }
        super.reset();
    }

    private class CompletionsList extends JScrollPane implements MenuElement
    {
        public CompletionsList(String[] completions)
        {
            super(listbox = new JList(completions));
            listbox.setFont(textField.getFont());
            if (completions.length < 8)
                listbox.setVisibleRowCount(completions.length);
            if (Platform.isJava14())
                Utilities.setFocusTraversalKeysEnabled(listbox, false);
            listbox.setSelectedIndex(0);
        }

        public void processMouseEvent(MouseEvent e, MenuElement[] path,
            MenuSelectionManager manager) {}

        public void processKeyEvent(KeyEvent e, MenuElement[] path,
            MenuSelectionManager manager)
        {
            final int keyCode = e.getKeyCode();
            final int modifiers = e.getModifiers();
            final int id = e.getID();
            if (id == KeyEvent.KEY_PRESSED) {
                switch (keyCode) {
                    case KeyEvent.VK_TAB:
                        if (modifiers == 0)
                            tabPopup(+1, true);
                        else if (modifiers == SHIFT_MASK)
                            tabPopup(-1, true);
                        e.consume();
                        return;
                    case KeyEvent.VK_ENTER: {
                        enterPopup();
                        e.consume();
                        return;
                    }
                    case KeyEvent.VK_ESCAPE: {
                        popup.setVisible(false);
                        popup = null;
                        textField.setText(originalText);
                        textField.requestFocus();
                        end();
                        e.consume();
                        return;
                    }
                    case KeyEvent.VK_UP:
                    case KeyEvent.VK_KP_UP:
                        tabPopup(-1, false);
                        e.consume();
                        break;
                    case KeyEvent.VK_DOWN:
                    case KeyEvent.VK_KP_DOWN:
                        tabPopup(+1, false);
                        e.consume();
                        break;
                    case KeyEvent.VK_END:
                    case KeyEvent.VK_RIGHT:
                    case KeyEvent.VK_KP_RIGHT: {
                        reset();
                        textField.requestFocus();
                        end();
                        e.consume();
                        return;
                    }
                    case KeyEvent.VK_SHIFT:
                        break;
                    default:
                        break;
                }
            } else if (id == KeyEvent.KEY_TYPED) {
                char c = e.getKeyChar();
                if (c >= ' ') {
                    popup.setVisible(false);
                    popup = null;
                    String text = textField.getText();
                    text += e.getKeyChar();
                    textField.setText(text);
                    textField.requestFocus();
                    end();
                    e.consume();
                    return;
                } else {
                    e.consume();
                    return;
                }
            }
            super.processKeyEvent(e);
        }

        public void menuSelectionChanged(boolean isIncluded) {}

        public MenuElement[] getSubElements()
        {
            return new MenuElement[0];
        }

        public Component getComponent()
        {
            return this;
        }
    }

    public void keyPressed(KeyEvent e)
    {
        if (popup != null) {
            int modifiers = e.getModifiers();
            switch (e.getKeyCode()) {
                case KeyEvent.VK_ENTER:
                    enterPopup();
                    e.consume();
                    return;
                case KeyEvent.VK_ESCAPE:
                    popup.setVisible(false);
                    popup = null;
                    textField.setText(originalText);
                    textField.requestFocus();
                    e.consume();
                    return;
                case KeyEvent.VK_TAB:
                    if (modifiers == 0)
                        tabPopup(+1, true);
                    else if (modifiers == SHIFT_MASK)
                        tabPopup(-1, true);
                    e.consume();
                    return;
                case KeyEvent.VK_UP:
                case KeyEvent.VK_KP_UP:
                    if (modifiers == 0) {
                        tabPopup(-1, false);
                        e.consume();
                        return;
                    }
                    break;
                case KeyEvent.VK_DOWN:
                case KeyEvent.VK_KP_DOWN:
                    if (modifiers == 0) {
                        tabPopup(+1, false);
                        e.consume();
                        return;
                    }
                    break;
                default:
                    break;
            }
        }
        super.keyPressed(e);
    }
}
