/*
 * SystemBuffer.java
 *
 * Copyright (C) 1998-2002 Peter Graves
 * $Id: SystemBuffer.java,v 1.1.1.1 2002-09-24 16:08:24 piso Exp $
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

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

// System buffers are NOT linked into the normal buffer ring.
public class SystemBuffer extends AbstractBuffer implements Constants
{
    protected boolean isLoaded;
    protected boolean readOnly;
    protected Mode mode;
    protected String lineSeparator;
    protected int lineCount;

    boolean forceReadOnly;

    private File file;
    private String loadEncoding;
    private Line lastLine;
    private View lastView;

    protected SystemBuffer()
    {
    }

    public SystemBuffer(File file)
    {
        this.file = file;
    }

    public final File getFile()
    {
        return file;
    }

    public final void setFile(File file)
    {
        this.file = file;
    }

    public final boolean isLoaded()
    {
        return isLoaded;
    }

    public final void setLoaded(boolean b)
    {
        isLoaded = b;
    }

    public final Mode getMode()
    {
        return mode;
    }

    public final int getModeId()
    {
        return mode == null ? 0 : mode.getId();
    }

    public final String getModeName()
    {
        return mode == null ? null : mode.toString();
    }

    public String getLineSeparator()
    {
        return lineSeparator;
    }

    public final View getLastView()
    {
        if (lastView != null)
            return (View) lastView.clone();
        else
            return null;
    }

    public final void setLastView(View view)
    {
        lastView = (View) view.clone();
    }

    public void saveView(Editor editor)
    {
        final View view = saveViewInternal(editor);
        editor.setView(this, view);
        setLastView(view);
    }

    protected View saveViewInternal(Editor editor)
    {
        final Display display = editor.getDisplay();
        View view = editor.getView(this);
        if (view == null)
            view = new View();
        final Position dot = editor.getDot();
        view.dot = dot == null ? null : new Position(dot);
        final Position mark = editor.getMark();
        view.mark = mark == null ? null : new Position(mark);
        view.selection = editor.getSelection();
        view.setColumnSelection(editor.isColumnSelection());
        view.topLine = editor.getTopLine();
        if (view.topLine != null)
            view.topLineNumber = view.topLine.lineNumber();
        view.pixelsAboveTopLine = display.getPixelsAboveTopLine();
        view.shift = display.shift;
        view.caretCol = display.caretCol;
        view.timestamp = System.currentTimeMillis();
        if (view.dot == null) {
            view.lineNumber = 0;
            view.offs = 0;
        } else {
            view.lineNumber = view.dot.lineNumber();
            view.offs = view.dot.getOffset();
        }
        return view;
    }

    public final String canonicalPath()
    {
        return file == null ? null : file.canonicalPath();
    }

    public final boolean contains(Line line)
    {
        Line l = getFirstLine();
        while (l != null) {
            if (l == line)
                return true;
            l = l.next();
        }
        return false;
    }

    public int load()
    {
        if (!isLoaded) {
            try {
                if (file.isFile()) {
                    InputStream in = file.getInputStream();
                    if (in != null) {
                        load(in, file.getEncoding());
                        in.close();
                    }
                }
                if (getFirstLine() == null) {
                    // New or 0-byte file.
                    appendLine("");
                    lineSeparator = System.getProperty("line.separator");
                }
            }
            catch (IOException e) {
                Log.error(e);
            }
            isLoaded = true;
        }
        return LOAD_COMPLETED;
    }

    public void load(InputStream istream, String encoding)
    {
        if (mode != null && mode.getId() == BINARY_MODE) {
            loadBinary(istream);
            return;
        }
        byte[] buf = new byte[4096];
        int totalBytes = 0;
        try {
            int bytesRead = istream.read(buf);
            loadProgress(totalBytes = totalBytes + bytesRead);
            // Detect Unicode.
            boolean isUnicode = false;
            boolean isLittleEndian = true;
            if (bytesRead >= 2) {
                byte byte1 = buf[0];
                byte byte2 = buf[1];
                if (byte1 == (byte) 0xfe && byte2 == (byte) 0xff) {
                    isUnicode = true;
                    isLittleEndian = false;
                    loadEncoding = "UnicodeBig";
                } else if (byte1 == (byte) 0xff && byte2 == (byte) 0xfe) {
                    isUnicode = true;
                    loadEncoding = "UnicodeLittle";
                }
            }
            boolean skipLF = false;
            if (isUnicode) {
                FastStringBuffer sb = new FastStringBuffer(256);
                int i = 2;
                while (bytesRead > 0) {
                    while (i < bytesRead - 1) {
                        char c;
                        final byte b1 = buf[i++];
                        final byte b2 = buf[i++];
                        if (isLittleEndian)
                            c = (char) ((b2 << 8) + (b1 & 0xff));
                        else
                            c = (char) ((b1 << 8) + (b2 & 0xff));
                        switch (c) {
                            case '\r':
                                appendLine(sb.toString());
                                sb.setLength(0);
                                skipLF = true;
                                break;
                            case '\n':
                                if (skipLF) {
                                    // LF after CR.
                                    if (lineSeparator == null)
                                        lineSeparator = "\r\n";
                                    skipLF = false;
                                } else {
                                    // LF without preceding CR.
                                    if (lineSeparator == null)
                                        lineSeparator = "\n";
                                    appendLine(sb.toString());
                                    sb.setLength(0);
                                }
                                break;
                            default:
                                // Normal char.
                                if (skipLF) {
                                    // Something other than LF after CR.  Must be a Mac...
                                    if (lineSeparator == null)
                                        lineSeparator = "\r";
                                    skipLF = false;
                                }
                                sb.append(c);
                                break;
                        }
                    }
                    bytesRead = istream.read(buf);
                    i = 0;
                }
                if (sb.length() > 0) {
                    // No line separator at end of file.
                    appendLine(sb.toString());
                } else {
                    // If there is a line separator at the end of the file, we
                    // need to append an empty line so the line separator will
                    // get written out when the file is saved.
                    appendLine("");
                }
            } else {
                // Not Unicode.
                if (encoding == null) {
                    encoding =
                        Editor.preferences().getStringProperty(Property.DEFAULT_ENCODING);
                }
                loadEncoding = encoding;
                ByteBuffer bb = new ByteBuffer(256);
                while (bytesRead > 0) {
                    for (int i = 0; i < bytesRead; i++) {
                        byte b = buf[i];
                        switch (b) {
                            case 13:
                                appendLine(new String(bb.getBytes(), 0, bb.length(), encoding));
                                bb.setLength(0);
                                skipLF = true;
                                break;
                            case 10:
                                if (skipLF) {
                                    // LF after CR.
                                    if (lineSeparator == null)
                                        lineSeparator = "\r\n";
                                    skipLF = false;
                                } else {
                                    // LF without preceding CR.
                                    if (lineSeparator == null)
                                        lineSeparator = "\n";
                                    appendLine(new String(bb.getBytes(), 0, bb.length(), encoding));
                                    bb.setLength(0);
                                }
                                break;
                            default:
                                // Normal char.
                                if (skipLF) {
                                    // Something other than LF after CR.  Must be a Mac...
                                    if (lineSeparator == null)
                                        lineSeparator = "\r";
                                    skipLF = false;
                                }
                                bb.append(b);
                                break;
                        }
                    }
                    bytesRead = istream.read(buf);
                    if (bytesRead > 0)
                        loadProgress(totalBytes = totalBytes + bytesRead);
                }
                if (bb.length() > 0) {
                    // No line separator at end of file.
                    appendLine(new String(bb.getBytes(), 0, bb.length(), encoding));
                } else {
                    // If there is a line separator at the end of the file, we
                    // need to append an empty line so the line separator will
                    // get written out when the file is saved.
                    appendLine("");
                }
            }
            isLoaded = true;
        }
        catch (Exception e) {
            Log.error(e);
        }
        loadFinished(isLoaded);
    }

    public final Line getLastLine()
    {
        return lastLine;
    }

    public final void setLastLine(Line line)
    {
        lastLine = line;
    }

    protected void appendLine(Line line)
    {
        line.setPrevious(lastLine);
        if (lastLine != null)
            lastLine.setNext(line);
        lastLine = line;
        if (getFirstLine() == null)
            setFirstLine(line);
    }

    public void appendLine(String s)
    {
        appendLine(new TextLine(s));
    }

    public void append(String s)
    {
        int begin = 0;
        int end = 0;
        boolean skipLF = false;
        final int limit = s.length();
        for (int i = 0; i < limit; i++) {
            switch (s.charAt(i)) {
                case '\r':
                    appendLine(s.substring(begin, end));
                    ++end;
                    begin = end;
                    skipLF = true;
                    break;
                case '\n':
                    if (skipLF) {
                        ++begin;
                        ++end;
                        skipLF = false;
                    } else {
                        appendLine(s.substring(begin, end));
                        ++end;
                        begin = end;
                    }
                    break;
                default:
                    skipLF = false;
                    ++end;
            }
        }
        if (begin < end)
            appendLine(s.substring(begin, end));
    }

    private void appendBinaryLine(int start, byte[] bytes, int numBytes)
    {
        appendLine(new BinaryLine(start, bytes, numBytes));
    }

    // Overridden by Buffer.renumber().
    public void renumber()
    {
        for (Line line = getFirstLine(); line != null; line = line.next())
            line.setLineNumber(lineCount++);
    }

    public void writeBuffer() throws SaveException
    {
        if (Platform.isPlatformWindows()) {
            // writeTempFile() throws a SaveException if an error occurs.
            File tempFile = writeTempFile();
            final int permissions = file.isFile() ? file.getPermissions() : 0;
            if (!Utilities.makeBackup(file, false)) {
                Log.error("backup failed");
                throw new SaveException(file,
                    "Unable to write backup file for " + file.canonicalPath());
            }
            if (!Utilities.deleteRename(tempFile, file)) {
                Log.error("unable to rename " + tempFile.canonicalPath() +
                    " to " + file.canonicalPath());
                throw new SaveException(file,
                    "Unable to rename temporary file");
            }
            if (permissions != 0)
                file.setPermissions(permissions);
        } else {
            // Save in place on Unix to preserve permissions and ownership of
            // file. Keep original (instead of renaming it) when making backup.
            if (!Utilities.makeBackup(file, true)) {
                Log.error("backup failed");
                throw new SaveException(file,
                    "Unable to write backup file for ".concat(
                        file.canonicalPath()));
            }
            // Write directly to original file.
            if (!writeFile(file)) {
                Log.error("writeFile failed");
                throw new SaveException(file,
                    "Unable to write ".concat(file.canonicalPath()));
            }
        }
    }

    public boolean writeFile(File outputFile)
    {
        try {
            BufferedOutputStream out = new BufferedOutputStream(outputFile.getOutputStream());
            if (lineSeparator == null)
                lineSeparator = System.getProperty("line.separator");
            String encoding = outputFile.getEncoding();
            if (encoding == null)
                encoding = getSaveEncoding();
            Line line = getFirstLine();
            if (line != null) {
                final byte[] byteOrderMark = getByteOrderMark(encoding);
                if (byteOrderMark != null)
                    out.write(byteOrderMark);
                out.write(line.getBytes(encoding));
                line = line.next();
                final byte[] sepBytes = getSeparatorBytes(encoding);
                while (line != null) {
                    out.write(sepBytes);
                    out.write(line.getBytes(encoding));
                    line = line.next();
                }
            }
            out.flush();
            out.close();
            return true;
        }
        catch (IOException e) {
            Log.error(e);
            return false;
        }
    }

    public String getSaveEncoding()
    {
        String encoding = file == null ? null : file.getEncoding();
        if (encoding == null) {
            encoding = loadEncoding;
            if (encoding == null)
                encoding = Editor.preferences().getStringProperty(
                    Property.DEFAULT_ENCODING);
        }
        if (encoding == null)
            Debug.bug();
        return encoding;
    }

    byte[] getByteOrderMark(String encoding) throws UnsupportedEncodingException
    {
        byte[] bytes = "test".getBytes(encoding);
        if ((bytes[0] == (byte) 0xfe && bytes[1] == (byte) 0xff) ||
            (bytes[0] == (byte) 0xff && bytes[1] == (byte) 0xfe)) {
            byte[] byteOrderMark = new byte[2];
            byteOrderMark[0] = bytes[0];
            byteOrderMark[1] = bytes[1];
            return byteOrderMark;
        }
        return null;
    }

    byte[] getSeparatorBytes(String encoding) throws UnsupportedEncodingException
    {
        byte[] bytes = lineSeparator.getBytes(encoding);
        if (bytes.length > 2) {
            if ((bytes[0] == (byte) 0xfe && bytes[1] == (byte) 0xff) ||
                (bytes[0] == (byte) 0xff && bytes[1] == (byte) 0xfe)) {
                byte[] sepBytes = new byte[bytes.length-2];
                for (int i = 0; i < sepBytes.length; i++)
                    sepBytes[i] = bytes[i+2];
                return sepBytes;
            }
        }
        return bytes;
    }

    protected void empty()
    {
        Line line = getFirstLine();
        while (line != null) {
            Line nextLine = line.next();
            line.setPrevious(null);
            line.setNext(null);
            line = nextLine;
        }

        setFirstLine(null);
        lastLine = null;
        isLoaded = false;

        setTags(null);

        // Invalidate any stored views that are referencing the old contents
        // of this buffer.
        if (lastView != null)
            lastView.invalidate();
        for (EditorIterator it = new EditorIterator(); it.hasNext();) {
            Editor ed = it.nextEditor();
            View view = ed.getView(this);
            if (view != null)
                view.invalidate();
            if (ed.getBuffer() == this) {
                ed.setDot(null);
                ed.setMark(null);
                ed.setTopLine(null);
            }
        }
    }

    protected void loadProgress(int totalBytesRead)
    {
        // Default behavior is to do nothing.
    }

    protected void loadFinished(boolean success)
    {
        // Default behavior is to do nothing.
    }

    private void loadBinary(InputStream istream)
    {
        byte[] array = readAllBytes(istream);
        if (array != null) {
            for (int start = 0; start < array.length; start += 16) {
                int bytesLeft = array.length - start;
                int count = bytesLeft >= 16 ? 16 : bytesLeft;
                appendBinaryLine(start, array, count);
            }
            isLoaded = true;
        }
        loadFinished(isLoaded);
    }

    private byte[] readAllBytes(InputStream in)
    {
        final int chunkSize = 0x8000;
        byte[] array = null;
        int totalBytes = 0;
        byte[] chunk = new byte[ chunkSize ];
        int bytesRead;
        try {
            while ((bytesRead = in.read(chunk, 0, chunk.length)) > 0) {
                if (array == null) {
                    array = new byte[bytesRead];
                    System.arraycopy(chunk, 0, array, 0, bytesRead);
                } else {
                    // Allocate new array big enough to hold all the bytes.
                    byte[] newArray = new byte[totalBytes + bytesRead];

                    // Copy old array into new array.
                    if (totalBytes > 0)
                        System.arraycopy(array, 0, newArray, 0, totalBytes);

                    // Append current chunk.
                    System.arraycopy(chunk, 0, newArray, totalBytes, bytesRead);

                    array = newArray;
                }
                totalBytes += bytesRead;
                Debug.assertTrue(array.length == totalBytes);
            }
        }
        catch (IOException e) {
            Log.error(e);
            array = null;
        }
        return array;
    }

    private File writeTempFile() throws SaveException
    {
        boolean succeeded = false;
        // First try to write out a temporary file in the current directory.
        File tempFile = Utilities.getTempFile(file.getParent());
        if (tempFile != null)
            succeeded = writeFile(tempFile);
        if (!succeeded) {
            // We were not able to write out the temporary file in the current
            // directory, possibly because the current directory is not
            // writable. Try again using j's temp directory.
            tempFile = Utilities.getTempFile();
            if (tempFile != null)
                succeeded = writeFile(tempFile);
        }
        if (!succeeded) {
            throw new SaveException(file,
                "Unable to write temporary file for ".concat(
                    file.canonicalPath()));
        }
        return tempFile;
    }
}
