/*
 * FileStream.java
 *
 * Copyright (C) 2004-2006 Peter Graves
 * $Id: FileStream.java,v 1.28 2006-05-03 16:13:09 piso Exp $
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

package org.armedbear.lisp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class FileStream extends Stream
{
    private static final int BUFSIZE = 4096;

    private final RandomAccessFile raf;
    private final RandomAccessFile in;
    private final RandomAccessFile out;
    private final Pathname pathname;
    private final int bytesPerUnit;
    private final byte[] inputBuffer;
    private final byte[] outputBuffer;

    private long inputBufferFilePosition;
    private int inputBufferOffset;
    private int inputBufferCount;
    private int outputBufferOffset;

    public FileStream(Pathname pathname, String namestring,
                      LispObject elementType, LispObject direction,
                      LispObject ifExists)
        throws IOException
    {
        final File file = new File(namestring);
        String mode = null;
        if (direction == Keyword.INPUT) {
            mode = "r";
            isInputStream = true;
        } else if (direction == Keyword.OUTPUT) {
            mode = "rw";
            isOutputStream = true;
        } else if (direction == Keyword.IO) {
            mode = "rw";
            isInputStream = true;
            isOutputStream = true;
        }
        Debug.assertTrue(mode != null);
        raf = new RandomAccessFile(file, mode);
        in = isInputStream ? raf : null;
        out = isOutputStream ? raf : null;
        // ifExists is ignored unless we have an output stream.
        if (isOutputStream) {
            final long length = file.isFile() ? file.length() : 0;
            if (length > 0) {
                if (ifExists == Keyword.OVERWRITE)
                    raf.seek(0);
                else if (ifExists == Keyword.APPEND)
                    raf.seek(raf.length());
                else
                    raf.setLength(0);
            }
        }
        this.pathname = pathname;
        this.elementType = elementType;
        if (elementType == Symbol.CHARACTER || elementType == Symbol.BASE_CHAR) {
            isCharacterStream = true;
            bytesPerUnit = 1;
        } else {
            isBinaryStream = true;
            int width;
            try {
                width = Fixnum.getValue(elementType.cadr());
            }
            catch (ConditionThrowable t) {
                width = 8;
            }
            bytesPerUnit = width / 8;
        }
        if (isBinaryStream && isInputStream && !isOutputStream && bytesPerUnit == 1)
            inputBuffer = new byte[BUFSIZE];
        else if (isCharacterStream && isInputStream && !isOutputStream)
            inputBuffer = new byte[BUFSIZE];
        else
            inputBuffer = null;
        if (isBinaryStream && isOutputStream && !isInputStream && bytesPerUnit == 1)
            outputBuffer = new byte[BUFSIZE];
        else if (isCharacterStream && isOutputStream && !isInputStream)
            outputBuffer = new byte[BUFSIZE];
        else
            outputBuffer = null;
    }

    public LispObject typeOf()
    {
        return Symbol.FILE_STREAM;
    }

    public LispObject classOf()
    {
        return BuiltInClass.FILE_STREAM;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.FILE_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.FILE_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    public Pathname getPathname()
    {
        return pathname;
    }

    public LispObject listen() throws ConditionThrowable
    {
        try {
            return in.getFilePointer() < in.length() ? T : NIL;
        }
        catch (NullPointerException e) {
            streamNotInputStream();
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
        // Not reached.
        return NIL;
    }

    public LispObject fileLength() throws ConditionThrowable
    {
        final long length;
        if (isOpen()) {
            try {
                length = raf.length();
            }
            catch (IOException e) {
                signal(new StreamError(this, e));
                // Not reached.
                return NIL;
            }
        } else {
            String namestring = pathname.getNamestring();
            if (namestring == null)
                return signal(new SimpleError("Pathname has no namestring: " +
                                              pathname.writeToString()));
            File file = new File(namestring);
            length = file.length(); // in 8-bit bytes
        }
        if (isCharacterStream)
            return number(length);
        // "For a binary file, the length is measured in units of the
        // element type of the stream."
        return number(length / bytesPerUnit);
    }

    public LispObject readLine(boolean eofError, LispObject eofValue)
        throws ConditionThrowable
    {
        if (inputBuffer != null) {
            final LispThread thread = LispThread.currentThread();
            final FastStringBuffer sb = new FastStringBuffer();
            while (true) {
                if (inputBufferOffset >= inputBufferCount) {
                    fillInputBuffer();
                    if (inputBufferCount < 0) {
                        // End of file.
                        if (sb.length() == 0) {
                            if (eofError)
                                return signal(new EndOfFile(this));
                            return thread.setValues(eofValue, T);
                        }
                        return thread.setValues(new SimpleString(sb), T);
                    }
                }
                char c = (char) (inputBuffer[inputBufferOffset++] & 0xff);
                if (c == '\n')
                    return thread.setValues(new SimpleString(sb), NIL);
                else
                    sb.append(c);
            }
        } else
            return super.readLine(eofError, eofValue);
    }

    // Returns -1 at end of file.
    protected int _readChar() throws ConditionThrowable
    {
        try {
            int c = _readByte();
            if (Utilities.isPlatformWindows) {
                if (c == '\r') {
                    int c2 = _readByte();
                    if (c2 == '\n') {
                        ++lineNumber;
                        return c2;
                    }
                    // '\r' was not followed by '\n'
                    if (inputBuffer != null && inputBufferOffset > 0) {
                        --inputBufferOffset;
                    } else {
                        clearInputBuffer();
                        long pos = in.getFilePointer();
                        if (pos > 0)
                            in.seek(pos - 1);
                    }
                }
                return c;
            }
            if (c == '\n') {
                ++lineNumber;
                return c;
            }
            return c;
        }
        catch (NullPointerException e) {
            streamNotInputStream();
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
        // Not reached.
        return -1;
    }

    protected void _unreadChar(int n) throws ConditionThrowable
    {
        if (inputBuffer != null && inputBufferOffset > 0) {
            --inputBufferOffset;
            if (n != '\n')
                return;
            --lineNumber;
            if (!Utilities.isPlatformWindows)
                return;
            // Check for preceding '\r'.
            if (inputBufferOffset > 0) {
                if (inputBuffer[--inputBufferOffset] != '\r')
                    ++inputBufferOffset;
                return;
            }
            // We can't go back far enough in the buffered input. Reset and
            // fall through...
            ++inputBufferOffset;
        }
        try {
            long pos;
            if (inputBuffer != null && inputBufferFilePosition >= 0)
                pos = inputBufferFilePosition + inputBufferOffset;
            else
                pos = in.getFilePointer();
            clearInputBuffer();
            if (pos > 0)
                in.seek(pos - 1);
            if (Utilities.isPlatformWindows && n == '\n') {
                // Check for preceding '\r'.
                pos = in.getFilePointer();
                if (pos > 0) {
                    in.seek(pos - 1);
                    n = in.read();
                    if (n == '\r')
                        in.seek(pos - 1);
                }
            }
        }
        catch (NullPointerException e) {
            streamNotInputStream();
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    protected boolean _charReady() throws ConditionThrowable
    {
        return true;
    }

    public void _writeChar(char c) throws ConditionThrowable
    {
        if (c == '\n') {
            if (Utilities.isPlatformWindows)
                _writeByte((byte)'\r');
            _writeByte((byte)c);
            charPos = 0;
        } else {
            _writeByte((byte)c);
            ++charPos;
        }
    }

    public void _writeChars(char[] chars, int start, int end)
        throws ConditionThrowable
    {
        if (Utilities.isPlatformWindows) {
            for (int i = start; i < end; i++) {
                char c = chars[i];
                if (c == '\n') {
                    _writeByte((byte)'\r');
                    _writeByte((byte)c);
                    charPos = 0;
                } else {
                    _writeByte((byte)c);
                    ++charPos;
                }
            }
        } else {
            // We're not on Windows, so no newline conversion is necessary.
            for (int i = start; i < end; i++) {
                char c = chars[i];
                _writeByte((byte)c);
                if (c == '\n')
                    charPos = 0;
                else
                    ++charPos;
            }
        }
    }

    public void _writeString(String s) throws ConditionThrowable
    {
        final int length = s.length();
        if (Utilities.isPlatformWindows) {
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                if (c == '\n') {
                    _writeByte((byte)'\r');
                    _writeByte((byte)c);
                    charPos = 0;
                } else {
                    _writeByte((byte)c);
                    ++charPos;
                }
            }
        } else {
            // We're not on Windows, so no newline conversion is necessary.
            for (int i = 0; i < length; i++) {
                char c = s.charAt(i);
                _writeByte((byte)c);
                if (c == '\n')
                    charPos = 0;
                else
                    ++charPos;
            }
        }
    }

    public void _writeLine(String s) throws ConditionThrowable
    {
        _writeString(s);
        if (Utilities.isPlatformWindows)
            _writeByte((byte)'\r');
        _writeByte((byte)'\n');
        charPos = 0;
    }

    // Reads an 8-bit byte.
    public int _readByte() throws ConditionThrowable
    {
        if (inputBuffer != null)
            return readByteFromBuffer();
        try {
            return in.read(); // Reads an 8-bit byte.
        }
        catch (NullPointerException e) {
            streamNotInputStream();
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
        // Not reached.
        return -1;
    }

    // Writes an 8-bit byte.
    public void _writeByte(int n) throws ConditionThrowable
    {
        if (outputBuffer != null) {
            writeByteToBuffer((byte)n);
        } else {
            try {
                out.write((byte)n); // Writes an 8-bit byte.
            }
            catch (NullPointerException e) {
                streamNotOutputStream();
            }
            catch (IOException e) {
                signal(new StreamError(this, e));
            }
        }
    }

    public void _finishOutput() throws ConditionThrowable
    {
        if (outputBuffer != null)
            flushOutputBuffer();
    }

    public void _clearInput() throws ConditionThrowable
    {
        try {
            in.seek(in.length());
            clearInputBuffer();
        }
        catch (NullPointerException e) {
            streamNotInputStream();
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    protected long _getFilePosition() throws ConditionThrowable
    {
        if (inputBuffer != null) {
            if (inputBufferFilePosition >= 0)
                return inputBufferFilePosition + inputBufferOffset;
        }
        if (outputBuffer != null)
            flushOutputBuffer();
        try {
            long pos = raf.getFilePointer();
            return pos / bytesPerUnit;
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
            // Not reached.
            return -1;
        }
    }

    protected boolean _setFilePosition(LispObject arg) throws ConditionThrowable
    {
        if (outputBuffer != null)
            flushOutputBuffer();
        if (inputBuffer != null)
            clearInputBuffer();
        try {
            long pos;
            if (arg == Keyword.START)
                pos = 0;
            else if (arg == Keyword.END)
                pos = raf.length();
            else {
                long n = Fixnum.getValue(arg); // FIXME arg might be a bignum
                pos = n * bytesPerUnit;
            }
            raf.seek(pos);
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
        return true;
    }

    public void _close() throws ConditionThrowable
    {
        if (outputBuffer != null)
            flushOutputBuffer();
        try {
            raf.close();
            setOpen(false);
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    private int readByteFromBuffer() throws ConditionThrowable
    {
        if (inputBufferOffset >= inputBufferCount) {
            fillInputBuffer();
            if (inputBufferCount < 0)
                return -1;
        }
        return inputBuffer[inputBufferOffset++] & 0xff;
    }

    private void fillInputBuffer() throws ConditionThrowable
    {
        try {
            inputBufferFilePosition = in.getFilePointer();
            inputBufferOffset = 0;
            inputBufferCount = in.read(inputBuffer, 0, BUFSIZE);
        }
        catch (NullPointerException e) {
            streamNotInputStream();
        }
        catch (IOException e) {
            signal(new StreamError(this, e));
        }
    }

    private void clearInputBuffer()
    {
        inputBufferFilePosition = -1;
        inputBufferOffset = 0;
        inputBufferCount = 0;
    }

    private void writeByteToBuffer(byte b) throws ConditionThrowable
    {
        if (outputBufferOffset == BUFSIZE)
            flushOutputBuffer();
        outputBuffer[outputBufferOffset++] = b;
    }

    private void flushOutputBuffer() throws ConditionThrowable
    {
        if (outputBufferOffset > 0) {
            try {
                out.write(outputBuffer, 0, outputBufferOffset);
                outputBufferOffset = 0;
            }
            catch (NullPointerException e) {
                streamNotOutputStream();
            }
            catch (IOException e) {
                signal(new StreamError(this, e));
            }
        }
    }

    public String writeToString() throws ConditionThrowable
    {
        return unreadableString(Symbol.FILE_STREAM);
    }

    // ### make-file-stream pathname element-type direction if-exists => stream
    private static final Primitive MAKE_FILE_STREAM =
        new Primitive("make-file-stream", PACKAGE_SYS, true,
                      "pathname namestring element-type direction if-exists")
    {
        public LispObject execute(LispObject first, LispObject second,
                                  LispObject third, LispObject fourth,
                                  LispObject fifth)
            throws ConditionThrowable
        {
            final Pathname pathname;
            try {
                pathname = (Pathname) first;
            }
            catch (ClassCastException e) {
                return signalTypeError(first, Symbol.PATHNAME);
            }
            final LispObject namestring;
            try {
                namestring = (AbstractString) second;
            }
            catch (ClassCastException e) {
                return signalTypeError(second, Symbol.STRING);
            }
            LispObject elementType = third;
            LispObject direction = fourth;
            LispObject ifExists = fifth;
            if (direction != Keyword.INPUT && direction != Keyword.OUTPUT &&
                direction != Keyword.IO)
                signal(new LispError("Direction must be :INPUT, :OUTPUT, or :IO."));
            try {
                return new FileStream(pathname, namestring.getStringValue(),
                                      elementType, direction, ifExists);
            }
            catch (FileNotFoundException e) {
                return NIL;
            }
            catch (IOException e) {
                return signal(new StreamError(null, e));
            }
        }
    };
}
