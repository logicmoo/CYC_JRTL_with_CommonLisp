/*
 * Help.java
 *
 * Copyright (C) 1998-2003 Peter Graves
 * $Id: Help.java,v 1.4 2003-05-18 16:01:18 piso Exp $
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

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;

public final class Help
{
    public static final void help()
    {
        help(null);
    }

    public static void help(String arg)
    {
        final Editor editor = Editor.currentEditor();
        final Frame frame = editor.getFrame();
        frame.setWaitCursor();
        String fileName, commandName;
        if (arg == null || arg.length() == 0) {
            fileName = "contents.html";
            commandName = null;
        } else if (arg.endsWith(".html")) {
            fileName = arg;
            commandName = null;
        } else {
            fileName = "commands.html";
            commandName = arg;
        }
        if (commandName != null) {
            Command command = CommandTable.getCommand(commandName);
            if (command != null)
                commandName = command.getName();
        }
        try {
            File dir = getDocumentationDirectory();
            if (dir == null)
                return;
            File file = File.getInstance(dir, fileName);
            if (file == null)
                return;
            Buffer buf = null;
            // Look for existing help buffer.
            for (BufferIterator it = new BufferIterator(); it.hasNext();) {
                Buffer b = it.nextBuffer();
                if (isHelpBuffer(b)) {
                    buf = b;
                    break;
                }
            }
            if (buf != null) {
                // Found existing help buffer.
                // Save history.
                int offset = 0;
                if (editor.getBuffer() == buf) {
                    offset = buf.getAbsoluteOffset(editor.getDot());
                } else {
                    View view = buf.getLastView();
                    if (view != null) {
                        Position dot = view.getDot();
                        if (dot != null)
                            offset = buf.getAbsoluteOffset(dot);
                    }
                }
                ((WebBuffer)buf).saveHistory(buf.getFile(), offset,
                    ((WebBuffer)buf).getContentType());
                if (!buf.getFile().equals(file)) {
                    // Existing buffer is not looking at the right file.
                    ((WebBuffer)buf).go(file, 0, null);
                }
                Position pos = ((WebBuffer) buf).findRef(commandName);
                if (editor.getBuffer() == buf) {
                    if (pos != null)
                        editor.moveDotTo(pos);
                } else {
                    editor.makeNext(buf);
                    Editor ed = editor.activateInOtherWindow(buf);
                    if (pos != null) {
                        ed.moveDotTo(pos);
                        ed.updateDisplay();
                    }
                }
            } else {
                buf = WebBuffer.createWebBuffer(file, null, commandName);
                Editor otherEditor = editor.getOtherEditor();
                if (otherEditor != null) {
                    buf.setUnsplitOnClose(otherEditor.getBuffer().unsplitOnClose());
                    otherEditor.makeNext(buf);
                } else {
                    buf.setUnsplitOnClose(true);
                    editor.makeNext(buf);
                }
                Editor ed = editor.activateInOtherWindow(buf);
                ed.updateDisplay();
            }
        }
        finally {
            frame.setDefaultCursor();
        }
    }

    private static boolean isHelpBuffer(Buffer buffer)
    {
        if (!(buffer instanceof WebBuffer))
            return false;
        File file = buffer.getFile();
        if (file != null) {
            File dir = file.getParentFile();
            if (dir != null && dir.equals(getDocumentationDirectory()))
                return true;
        }
        return false;
    }

    public static final File getBindingsFile()
    {
        return File.getInstance(Editor.getTempDirectory(), "bindings.html");
    }

    public static void listBindings()
    {
        final Editor editor = Editor.currentEditor();
        final Frame frame = editor.getFrame();
        frame.setWaitCursor();
        try {
            File file = getBindingsFile();
            BufferedWriter writer =
                new BufferedWriter(new OutputStreamWriter(file.getOutputStream()));
            writer.write("<html>\n<head>\n<title>Keyboard Bindings</title>\n</head>\n<body>\n");
            File docDir = getDocumentationDirectory();
            writer.write("<b>");
            writer.write("Local Bindings (");
            writer.write(editor.getMode().toString());
            writer.write(" mode)");
            writer.write("</b><br><br>");
            addBindingsFromKeyMap(editor.getBuffer().getKeyMapForMode(), docDir,
                writer);
            writer.write("<br>");
            writer.write("<b>");
            writer.write("Global Bindings");
            writer.write("</b><br><br>");
            addBindingsFromKeyMap(KeyMap.getGlobalKeyMap(), docDir, writer);
            writer.write("</body>\n</html>\n");
            writer.flush();
            writer.close();
            if (isListBindingsBuffer(editor.getBuffer())) {
                ((WebBuffer)editor.getBuffer()).go(file, 0, "text/html");
            } else {
                Buffer buf = null;
                for (BufferIterator it = new BufferIterator(); it.hasNext();) {
                    Buffer b = it.nextBuffer();
                    if (isListBindingsBuffer(b)) {
                        buf = b;
                        break;
                    }
                }
                if (buf != null)
                    ((WebBuffer)buf).go(file, 0, "text/html");
                else
                    buf = WebBuffer.createWebBuffer(file, null, null);
                Editor otherEditor = editor.getOtherEditor();
                if (otherEditor != null) {
                    buf.setUnsplitOnClose(otherEditor.getBuffer().unsplitOnClose());
                    otherEditor.makeNext(buf);
                } else {
                    buf.setUnsplitOnClose(true);
                    editor.makeNext(buf);
                }
                editor.activateInOtherWindow(buf);
            }
        }
        catch (IOException e) {
            Log.error(e);
        }
        finally {
            frame.setDefaultCursor();
        }
    }

    private static void addBindingsFromKeyMap(KeyMap keyMap, File docDir,
        Writer writer) throws IOException
    {
        KeyMapping[] globalMappings = keyMap.getMappings();
        int count = globalMappings.length;
        if (count == 0) {
            writer.write("[No local bindings]<br>\n");
            return;
        }
        for (int i = 0; i < count; i++) {
            KeyMapping mapping = globalMappings[i];
            FastStringBuffer sb = new FastStringBuffer(64);
            sb.append(mapping.getKeyText());
            String command = mapping.getCommand();
            if (command != null) {
                int spaces = 32 - sb.length();
                for (int j = spaces - 1; j >= 0; j--)
                    sb.append("&nbsp;");
                if (docDir != null) {
                    sb.append("<a href=\"");
                    sb.append(docDir.canonicalPath());
                    sb.append(LocalFile.getSeparatorChar());
                    sb.append("commands.html#");
                    sb.append(command);
                    sb.append("\">");
                    sb.append(command);
                    sb.append("</a>");
                } else
                    sb.append(command);
                sb.append("<br>\n");
            }
            writer.write(sb.toString());
        }
    }

    private static boolean isListBindingsBuffer(Buffer buffer)
    {
        if (!(buffer instanceof WebBuffer))
            return false;
        return buffer.getFile().equals(getBindingsFile());
    }

    public static File getDocumentationDirectory()
    {
        String s = Editor.preferences().getStringProperty(Property.DOC_PATH);
        if (s != null) {
            Path path = new Path(s);
            String[] array = path.list();
            if (array != null) {
                for (int i = 0; i < array.length; i++) {
                    File dir = File.getInstance(array[i]);
                    if (isDocDir(dir))
                        return dir;
                }
            }
        }
        s = System.getProperty("java.class.path");
        if (s != null) {
            final File userDir =
                File.getInstance(System.getProperty("user.dir"));
            Path path = new Path(s);
            String[] array = path.list();
            if (array != null) {
                for (int i = 0; i < array.length; i++) {
                    String filename = array[i];
                    if (filename.toLowerCase().endsWith("j.jar")) {
                        File jarFile = File.getInstance(userDir, filename);
                        if (jarFile != null && jarFile.isFile()) {
                            File jarDir = jarFile.getParentFile();
                            if (jarDir != null && jarDir.isDirectory()) {
                                File docDir = File.getInstance(jarDir, "doc");
                                if (isDocDir(docDir))
                                    return docDir;
                            }
                        }
                    } else if (filename.toLowerCase().endsWith("src")) {
                        // "~/j/src"
                        File srcDir = File.getInstance(userDir, filename);
                        if (srcDir != null && srcDir.isDirectory()) {
                            File parentDir = srcDir.getParentFile(); // "~/j"
                            if (parentDir != null && parentDir.isDirectory()) {
                                File docDir = File.getInstance(parentDir, "doc"); // "~/j/doc"
                                if (isDocDir(docDir))
                                    return docDir;
                            }
                        }
                    } else {
                        String suffix = LocalFile.getSeparator() + "j" + LocalFile.getSeparator() + "j.jar";
                        if (filename.endsWith(suffix)) {
                            // "/usr/local/share/j/j.jar"
                            File dataDir = File.getInstance(filename.substring(0, filename.length() - suffix.length())); // "/usr/local/share"
                            File docDir = File.getInstance(dataDir, "doc" + LocalFile.getSeparator() + "j"); // "/usr/local/share/doc/j"
                            if (isDocDir(docDir))
                                 return docDir;
                        }
                    }
                }
            }
        }
        // As a last resort, a couple of hard-coded possibilities...
        if (Platform.isPlatformUnix()) {
            File dir = File.getInstance("/usr/local/share/doc/j");
            if (isDocDir(dir))
                return dir;
            dir = File.getInstance("/usr/share/doc/j");
            if (isDocDir(dir))
                return dir;
        } else if (Platform.isPlatformWindows()) {
            String dirname = cygpath("/usr/local/share/doc/j");
            if (dirname != null) {
                File dir = File.getInstance(dirname);
                if (isDocDir(dir))
                    return dir;
            }
        }
        return null;
    }

    private static String cygpath(String s)
    {
        String[] cmdarray = {"cygpath", "-w", s};
        try {
            Process process = Runtime.getRuntime().exec(cmdarray);
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            return reader.readLine();
        }
        catch (Throwable t) {
            return null;
        }
    }

    // Return true if dir seems to contain j's documentation.
    private static boolean isDocDir(File dir)
    {
        if (dir == null ||!dir.isDirectory())
            return false;
        File check = File.getInstance(dir, "commands.html");
        if (check == null || !check.isFile())
            return false;
        return true;
    }
}
