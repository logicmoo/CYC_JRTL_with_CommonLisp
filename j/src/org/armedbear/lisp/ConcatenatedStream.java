/*
 * ConcatenatedStream.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: ConcatenatedStream.java,v 1.1 2004-02-15 17:48:39 piso Exp $
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

public final class ConcatenatedStream extends Stream
{
    private LispObject streams;

    private ConcatenatedStream(LispObject streams) throws ConditionThrowable
    {
        this.streams = streams;
        isInputStream = true;
    }

    public boolean isCharacterStream() throws ConditionThrowable
    {
        if (streams == NIL)
            return true;
        return ((Stream)streams.car()).isCharacterStream();
    }

    public boolean isBinaryStream() throws ConditionThrowable
    {
        if (streams == NIL)
            return true;
        return ((Stream)streams.car()).isBinaryStream();
    }

    public LispObject typeOf()
    {
        return Symbol.CONCATENATED_STREAM;
    }

    public LispClass classOf()
    {
        return BuiltInClass.CONCATENATED_STREAM;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.CONCATENATED_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.CONCATENATED_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject getElementType() throws ConditionThrowable
    {
        if (streams == NIL)
            return NIL;
        return ((Stream)streams.car()).getElementType();
    }

    public LispObject readCharNoHang(boolean eofError, LispObject eofValue)
        throws ConditionThrowable
    {
        if (streams == NIL) {
            if (eofError)
                return signal(new EndOfFile());
            else
                return eofValue;
        }
        return _charReady() ? readChar(eofError, eofValue) : NIL;
    }

    public LispObject listen() throws ConditionThrowable
    {
        if (unreadChar >= 0)
            return T;
        if (streams == NIL)
            return NIL;
        Stream stream = (Stream) streams.car();
        LispObject obj = readCharNoHang(false, this);
        if (obj == this)
            return NIL;
        unreadChar = ((LispCharacter)obj).getValue();
        return T;
    }

    private int unreadChar = -1;

    // Returns -1 at end of file.
    protected int _readChar() throws ConditionThrowable
    {
        int n;
        if (unreadChar >= 0) {
            n = unreadChar;
            unreadChar = -1;
            return n;
        }
        if (streams == NIL)
            return -1;
        Stream stream = (Stream) streams.car();
        n = stream._readChar();
        if (n >= 0)
            return n;
        streams = streams.cdr();
        return _readChar();
    }

    protected void _unreadChar(int n) throws ConditionThrowable
    {
        if (unreadChar >= 0)
            signal(new StreamError("UNREAD-CHAR was invoked twice consecutively without an intervening call to READ-CHAR."));
        unreadChar = n;
    }

    protected boolean _charReady() throws ConditionThrowable
    {
        if (unreadChar >= 0)
            return true;
        if (streams == NIL)
            return false;
        Stream stream = (Stream) streams.car();
        if (stream._charReady())
            return true;
        LispObject remainingStreams = streams.cdr();
        while (remainingStreams != NIL) {
            stream = (Stream) remainingStreams.car();
            if (stream._charReady())
                return true;
            remainingStreams = remainingStreams.cdr();
        }
        return false;
    }

    public void _writeChar(char c) throws ConditionThrowable
    {
        outputStreamError();
    }

    public void _writeString(String s) throws ConditionThrowable
    {
        outputStreamError();
    }

    public void _writeLine(String s) throws ConditionThrowable
    {
        outputStreamError();
    }

    // Reads an 8-bit byte.
    public int _readByte() throws ConditionThrowable
    {
        if (streams == NIL)
            return -1;
        Stream stream = (Stream) streams.car();
        int n = stream._readByte();
        if (n >= 0)
            return n;
        streams = streams.cdr();
        return _readByte();
    }

    // Writes an 8-bit byte.
    public void _writeByte(int n) throws ConditionThrowable
    {
        outputStreamError();
    }

    public void _finishOutput() throws ConditionThrowable
    {
        outputStreamError();
    }

    public void _clearInput() throws ConditionThrowable
    {
        // FIXME
    }

    private void outputStreamError() throws ConditionThrowable
    {
        signal(new StreamError(String.valueOf(this) + " is not an output stream."));
    }

    // ### make-concatenated-stream &rest streams => concatenated-stream
    private static final Primitive MAKE_CONCATENATED_STREAM =
        new Primitive("make-concatenated-stream", "&rest streams")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            LispObject streams = NIL;
            for (int i = 0; i < args.length; i++) {
                if (args[i] instanceof Stream) {
                    Stream stream = (Stream) args[i];
                    if (stream.isInputStream()) {
                        //                         streams[i] = (Stream) args[i];
                        streams = new Cons(stream, streams);
                        continue;
                    }
                }
                signal(new TypeError(String.valueOf(args[i]) +
                                     " is not an input stream."));
            }
            return new ConcatenatedStream(streams.nreverse());
        }
    };

    // ### concatenated-stream-streams concatenated-stream => streams
    private static final Primitive1 CONCATENATED_STREAM_STREAMS =
        new Primitive1("concatenated-stream-streams", "concatenated-stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((ConcatenatedStream)arg).streams;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.CONCATENATED_STREAM));
            }
        }
    };
}
