/*
 * BroadcastStream.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: BroadcastStream.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public final class BroadcastStream extends Stream
{
    final LispStream[] streams;

    BroadcastStream(LispStream[] streams)
    {
        super(LispSymbols.BROADCAST_STREAM);
        this.streams = streams;
        isOutputStream = true;
        if (streams.length == 0) {
            elementType = T;
            isBinaryStream = true;
            isCharacterStream = true;
        } else {
            elementType = streams[streams.length-1].getElementType();
            if (elementType == LispSymbols.CHARACTER || elementType == LispSymbols.BASE_CHAR)
                isCharacterStream = true;
            else
                isBinaryStream = true;
        }
    }

    public LispStream[] getStreams()
    {
        return streams;
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.BROADCAST_STREAM;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.BROADCAST_STREAM;
    }

    @Override
    public SubLObject typep(SubLObject typeSpecifier)
    {
        if (typeSpecifier == LispSymbols.BROADCAST_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.BROADCAST_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    @Override
    public SubLObject listen()
    {
        notSupported();
        // Not reached.
        return NIL;
    }

    @Override
    public SubLObject fileLength()
    {
        if (streams.length > 0)
            return streams[streams.length - 1].fileLength();
        else
            return Fixnum.ZERO;
    }

    @Override
    public SubLObject fileStringLength(SubLObject arg)
    {
        if (streams.length > 0)
            return streams[streams.length - 1].fileStringLength(arg);
        else
            return Fixnum.ONE;
    }

    // Returns -1 at end of file.
    @Override
		public int _readChar()
    {
        notSupported();
        // Not reached.
        return -1;
    }

    @Override
		public void _unreadChar(int n)
    {
        notSupported();
    }

    @Override
    public boolean _charReady()
    {
        notSupported();
        // Not reached.
        return false;
    }

    @Override
    public void _writeChar(char c)
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeChar(c);
    }

    @Override
    public void _writeChars(char[] chars, int start, int end)

    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeChars(chars, start, end);
    }

    @Override
    public void _writeString(String s)
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeString(s);
    }

    @Override
    public void _writeLine(String s)
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeLine(s);
    }

    // Reads an 8-bit byte.
    @Override
    public int _readByte()
    {
        notSupported();
        // Not reached.
        return -1;
    }

    // Writes an 8-bit byte.
    @Override
    public void _writeByte(int n)
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._writeByte(n);
    }

    @Override
    public void _finishOutput()
    {
        for (int i = 0; i < streams.length; i++)
            streams[i]._finishOutput();
    }

    @Override
    public void _clearInput()
    {
        notSupported();
    }

    @Override
    public long _getFilePosition()
    {
        if (streams.length == 0)
            return 0;
        else
            return streams[streams.length-1]._getFilePosition();
    }

    @Override
		public boolean _setFilePosition(SubLObject arg)
    {
        return false;
    }

    @Override
    public void _close()
    {
        setOpen(false);
    }

    private void notSupported()
    {
        error(new TypeError("Operation is not supported for streams of type BROADCAST-STREAM."));
    }

    @Override
    public String writeToString()
    {
        return unreadableString("BROADCAST-STREAM");
    }
}
