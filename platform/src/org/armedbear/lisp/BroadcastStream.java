/*
 * BroadcastStream.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id$
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package org.armedbear.lisp;

import static org.armedbear.lisp.Lisp.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLBroadcastStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class BroadcastStream extends Stream
{
    protected Stream[] streams;

    protected BroadcastStream(Stream[] streams)
    {
        super(Symbol.BROADCAST_STREAM);
        this.streams = streams;
        isOutputStream = true;
        if (streams.length == 0) {
            setStreamElementType(T);
            isBinaryStream = true;
            isCharacterStream = true;
        } else {
            setStreamElementType(streams[streams.length-1].getStreamElementType());
            if (Lisp.isText(getStreamElementType()))
                isCharacterStream = true;
            else
                isBinaryStream = true;
        }
    }

	public BroadcastStream(String fileName, SubLSymbol elementType, SubLSymbol direction, SubLSymbol ifExists,
			SubLSymbol ifNotExists)
	{
		super(fileName,elementType,direction,ifExists,ifNotExists);
	}

	public Stream[] GET_STREAMS()
    {
        return streams;
    }

    public LispObject typeOf()
    {
        return Symbol.BROADCAST_STREAM;
    }

    public LispObject classOf()
    {
        return BuiltInClass.BROADCAST_STREAM;
    }

    public LispObject typep(LispObject typeSpecifier)
    {
        if (typeSpecifier == Symbol.BROADCAST_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.BROADCAST_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject listen()
    {
        notSupported();
        // Not reached.
        return NIL;
    }

    public LispObject fileLength()
    {
        if (streams.length > 0)
            return streams[streams.length - 1].fileLength();
        else
            return Fixnum.ZERO;
    }

    public LispObject fileStringLength(LispObject arg)
    {
        if (streams.length > 0)
            return streams[streams.length - 1].fileStringLength(arg);
        else
            return Fixnum.ONE;
    }

    // Returns -1 at end of file.
    protected int _readChar()
    {
        notSupported();
        // Not reached.
        return -1;
    }

    protected void _unreadChar(int n)
    {
        notSupported();
    }

    protected boolean _charReady()
    {
        notSupported();
        // Not reached.
        return false;
    }

    public void _writeChar(char c)
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeChar(c);
    }

    public void _writeChars(char[] chars, int start, int end)

    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeChars(chars, start, end);
    }

    public void _writeString(String s)
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeString(s);
    }

    public void _writeLine(String s)
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeLine(s);
    }

    // Reads an 8-bit byte.
    public int _readByte()
    {
        notSupported();
        // Not reached.
        return -1;
    }

    // Writes an 8-bit byte.
    public void _writeByte(int n)
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeByte(n);
    }

    public void _finishOutput()
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._finishOutput();
    }

    public void _clearInput()
    {
        notSupported();
    }

    protected long _getFilePosition()
    {
        if (streams.length == 0)
            return 0;
        else
            return streams[streams.length-1]._getFilePosition();
    }

    protected boolean _setFilePosition(LispObject arg)
    {
        return false;
    }

    public void _close()
    {
        setOpen(false);
    }

    private void notSupported()
    {
        error(new TypeError("Operation is not supported for streams of type BROADCAST-STREAM."));
    }

    public String printObjectImpl()
    {
        return unreadableString("BROADCAST-STREAM");
    }

    // ### make-broadcast-stream &rest streams => broadcast-stream
    private static final Primitive MAKE_BROADCAST_STREAM =
        new Primitive("make-broadcast-stream", "&rest streams")
    {
        public LispObject execute()
        {
            return new SubLBroadcastStream(new Stream[0]);
        }
        public LispObject execute(LispObject[] args)
        {
            Stream[] streams = new Stream[args.length];
            for (int i = 0; i < args.length; i++) {
                if (args[i] instanceof Stream) {
                    if (((Stream)args[i]).isOutputStream()) {
                        streams[i] = (Stream) args[i];
                        continue;
                    } else
                        return type_error(args[i],
                                          list(Symbol.SATISFIES, Symbol.OUTPUT_STREAM_P));
                } else
                    return type_error(args[i], Symbol.STREAM);
            }
            // All is well.
            return new SubLBroadcastStream((SubLOutputStream[]) streams);
        }
    };

    // ### broadcast-stream-streams broadcast-stream => streams
    private static final Primitive BROADCAST_STREAM_STREAMS =
        new Primitive("broadcast-stream-streams", "broadcast-stream")
    {
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof BroadcastStream) {
                BroadcastStream stream = (BroadcastStream) arg;
                Stream[] streams = stream.streams;
                LispObject result = NIL;
                for (int i = streams.length; i-- > 0;)
                    result = new Cons(streams[i], result);
                return result;
            }
            return type_error(arg, Symbol.BROADCAST_STREAM);
        }
    };
}
