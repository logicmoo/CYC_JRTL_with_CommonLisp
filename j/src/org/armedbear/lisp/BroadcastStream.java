/*
 * BroadcastStream.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: BroadcastStream.java,v 1.7 2004-03-10 01:54:45 piso Exp $
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

public final class BroadcastStream extends Stream
{
    private final Stream[] streams;

    private BroadcastStream(Stream[] streams) throws ConditionThrowable
    {
        this.streams = streams;
        isOutputStream = true;
        if (streams.length == 0) {
            elementType = T;
            isBinaryStream = true;
            isCharacterStream = true;
        } else {
            elementType = streams[streams.length-1].getElementType();
            if (elementType == Symbol.CHARACTER || elementType == Symbol.BASE_CHAR)
                isCharacterStream = true;
            else
                isBinaryStream = true;
        }
    }

    public Stream[] getStreams()
    {
        return streams;
    }

    public LispObject typeOf()
    {
        return Symbol.BROADCAST_STREAM;
    }

    public LispClass classOf()
    {
        return BuiltInClass.BROADCAST_STREAM;
    }

    public LispObject typep(LispObject typeSpecifier) throws ConditionThrowable
    {
        if (typeSpecifier == Symbol.BROADCAST_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.BROADCAST_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject listen() throws ConditionThrowable
    {
        notSupported();
        // Not reached.
        return NIL;
    }

    public LispObject fileLength() throws ConditionThrowable
    {
        if (streams.length > 0)
            return streams[streams.length - 1].fileLength();
        else
            return Fixnum.ZERO;
    }

    public LispObject fileStringLength(LispObject arg) throws ConditionThrowable
    {
        if (streams.length > 0)
            return streams[streams.length - 1].fileStringLength(arg);
        else
            return Fixnum.ONE;
    }

    // Returns -1 at end of file.
    protected int _readChar() throws ConditionThrowable
    {
        notSupported();
        // Not reached.
        return -1;
    }

    protected void _unreadChar(int n) throws ConditionThrowable
    {
        notSupported();
    }

    protected boolean _charReady() throws ConditionThrowable
    {
        notSupported();
        // Not reached.
        return false;
    }

    public void _writeChar(char c) throws ConditionThrowable
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeChar(c);
    }

    public void _writeChars(char[] chars, int start, int end)
        throws ConditionThrowable
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeChars(chars, start, end);
    }

    public void _writeString(String s) throws ConditionThrowable
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeString(s);
    }

    public void _writeLine(String s) throws ConditionThrowable
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeLine(s);
    }

    // Reads an 8-bit byte.
    public int _readByte() throws ConditionThrowable
    {
        notSupported();
        // Not reached.
        return -1;
    }

    // Writes an 8-bit byte.
    public void _writeByte(int n) throws ConditionThrowable
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeByte(n);
    }

    public void _finishOutput() throws ConditionThrowable
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._finishOutput();
    }

    public void _clearInput() throws ConditionThrowable
    {
        notSupported();
    }

    protected long _getFilePosition() throws ConditionThrowable
    {
        if (streams.length == 0)
            return 0;
        else
            return streams[streams.length-1]._getFilePosition();
    }

    protected boolean _setFilePosition(LispObject arg) throws ConditionThrowable
    {
        return false;
    }

    public void _close() throws ConditionThrowable
    {
        setOpen(false);
    }

    private void notSupported() throws ConditionThrowable
    {
        signal(new TypeError("Operation is not supported for streams of type BROADCAST-STREAM."));
    }

    // ### make-broadcast-stream &rest streams => broadcast-stream
    private static final Primitive MAKE_BROADCAST_STREAM =
        new Primitive("make-broadcast-stream", "&rest streams")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            Stream[] streams = new Stream[args.length];
            for (int i = 0; i < args.length; i++) {
                if (args[i] instanceof Stream) {
                    if (((Stream)args[i]).isOutputStream()) {
                        streams[i] = (Stream) args[i];
                        continue;
                    }
                }
                signal(new TypeError(String.valueOf(args[i]) +
                                     " is not an output stream."));
            }
            // All is well.
            return new BroadcastStream(streams);
        }
    };

    // ### broadcast-stream-streams broadcast-stream => streams
    private static final Primitive1 BROADCAST_STREAM_STREAMS =
        new Primitive1("broadcast-stream-streams", "broadcast-stream")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                BroadcastStream stream = (BroadcastStream) arg;
                Stream[] streams = stream.streams;
                LispObject result = NIL;
                for (int i = streams.length; i-- > 0;)
                    result = new Cons(streams[i], result);
                return result;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, Symbol.BROADCAST_STREAM));
            }
        }
    };
}
