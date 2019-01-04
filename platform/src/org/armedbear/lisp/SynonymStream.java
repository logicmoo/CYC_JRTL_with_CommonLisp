/*
 * SynonymStream.java
 *
 * Copyright (C) 2004 Peter Graves
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLSynonymStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SynonymStream extends Stream
{




    public Symbol streamSymbol;

    SynonymStream(Symbol symbol)
    {
    	super(Symbol.SYNONYM_STREAM, checkStream(symbol.symbolValue()).getDirection());
        this.streamSymbol = symbol;
    }

    public SynonymStream(SubLSymbol textKeyword, SubLSymbol direction, SubLSymbol errorKeyword,
			SubLSymbol errorKeyword2) {
    	super(Symbol.SYNONYM_STREAM, direction);
		//super(textKeyword,direction,errorKeyword,errorKeyword2);

	}

    public boolean isInputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isInputStream();
    }

    public boolean isOutputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isOutputStream();
    }

    public boolean isCharacterInputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isCharacterInputStream();
    }

    public boolean isBinaryInputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isBinaryInputStream();
    }

    public boolean isCharacterOutputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isCharacterOutputStream();
    }

    public boolean isBinaryOutputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isBinaryOutputStream();
    }

    public LispObject typeOf()
    {
        return Symbol.SYNONYM_STREAM;
    }

    public LispObject classOf()
    {
        return BuiltInClass.SYNONYM_STREAM;
    }

    public LispObject typep(LispObject typeSpecifier)
    {
        if (typeSpecifier == Symbol.SYNONYM_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.SYNONYM_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    public LispObject getStreamElementType()
    {
        return checkStream(streamSymbol.symbolValue()).getStreamElementType();
    }

    public LispObject listen()
    {
        return checkStream(streamSymbol.symbolValue()).listen();
    }

    public LispObject fileLength()
    {
        return checkStream(streamSymbol.symbolValue()).fileLength();
    }

    public LispObject fileStringLength(LispObject arg)
    {
        return checkStream(streamSymbol.symbolValue()).fileStringLength(arg);
    }

    protected int _readChar() throws java.io.IOException
    {
        return checkStream(streamSymbol.symbolValue())._readChar();
    }

    protected void _unreadChar(int n) throws java.io.IOException
    {
        checkStream(streamSymbol.symbolValue())._unreadChar(n);
    }

    protected boolean _charReady() throws java.io.IOException
    {
        return checkStream(streamSymbol.symbolValue())._charReady();
    }

    public void _writeChar(char c)
    {
        checkStream(streamSymbol.symbolValue())._writeChar(c);
    }

    public void _writeChars(char[] chars, int start, int end)

    {
        checkStream(streamSymbol.symbolValue())._writeChars(chars, start, end);
    }

    public void _writeString(String s)
    {
        checkStream(streamSymbol.symbolValue())._writeString(s);
    }

    public void _writeLine(String s)
    {
        checkStream(streamSymbol.symbolValue())._writeLine(s);
    }

    // Reads an 8-bit byte.
    public int _readByte()
    {
        return checkStream(streamSymbol.symbolValue())._readByte();
    }

    // Writes an 8-bit byte.
    public void _writeByte(int n)
    {
        checkStream(streamSymbol.symbolValue())._writeByte(n);
    }

    public void _finishOutput()
    {
        checkStream(streamSymbol.symbolValue())._finishOutput();
    }

    public void _clearInput()
    {
        checkStream(streamSymbol.symbolValue())._clearInput();
    }

    protected long _getFilePosition()
    {
        return checkStream(streamSymbol.symbolValue())._getFilePosition();
    }

    protected boolean _setFilePosition(LispObject arg)
    {
        return checkStream(streamSymbol.symbolValue())._setFilePosition(arg);
    }

    public void _close()
    {
        checkStream(streamSymbol.symbolValue())._close();
    }

    public String printObjectImpl()
    {
        StringBuffer sb = new StringBuffer("SYNONYM-STREAM ");
        sb.append(streamSymbol.printObject());
        return unreadableString(sb.toString());
    }

    // ### make-synonym-stream symbol => synonym-stream
    private static final Primitive MAKE_SYNONYM_STREAM =
        new Primitive("make-synonym-stream", "symbol")
    {
        public LispObject execute(LispObject arg)
        {
            return new SynonymStream(checkSymbol(arg));
        }
    };

    // ### synonym-stream-symbol synonym-stream => symbol
    private static final Primitive SYNONYM_STREAM_STREAMS =
        new Primitive("synonym-stream-symbol", "synonym-stream")
    {
        public LispObject execute(LispObject arg)
        {
            if (arg instanceof SynonymStream)
                return ((SynonymStream)arg).streamSymbol;
            return type_error(arg, Symbol.SYNONYM_STREAM);
        }
    };
}
