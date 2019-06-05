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

    @Override
	public boolean isInputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isInputStream();
    }

    @Override
	public boolean isOutputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isOutputStream();
    }

    @Override
	public boolean isCharacterInputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isCharacterInputStream();
    }

    @Override
	public boolean isBinaryInputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isBinaryInputStream();
    }

    @Override
	public boolean isCharacterOutputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isCharacterOutputStream();
    }

    @Override
	public boolean isBinaryOutputStream()
    {
        return checkStream(streamSymbol.symbolValue()).isBinaryOutputStream();
    }

    @Override
	public LispObject typeOf()
    {
        return Symbol.SYNONYM_STREAM;
    }

    @Override
	public LispObject classOf()
    {
        return BuiltInClass.SYNONYM_STREAM;
    }

    @Override
	public LispObject typep(LispObject typeSpecifier)
    {
        if (typeSpecifier == Symbol.SYNONYM_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.SYNONYM_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    @Override
	public LispObject getStreamElementType()
    {
        return checkStream(streamSymbol.symbolValue()).getStreamElementType();
    }

    @Override
	public LispObject listen()
    {
        return checkStream(streamSymbol.symbolValue()).listen();
    }

    @Override
	public LispObject fileLength()
    {
        return checkStream(streamSymbol.symbolValue()).fileLength();
    }

    @Override
	public LispObject fileStringLength(LispObject arg)
    {
        return checkStream(streamSymbol.symbolValue()).fileStringLength(arg);
    }

    @Override
	protected int _readChar() throws java.io.IOException
    {
        return checkStream(streamSymbol.symbolValue())._readChar();
    }

    @Override
	protected void _unreadChar(int n) throws java.io.IOException
    {
        checkStream(streamSymbol.symbolValue())._unreadChar(n);
    }

    @Override
	protected boolean _charReady() throws java.io.IOException
    {
        return checkStream(streamSymbol.symbolValue())._charReady();
    }

    @Override
	public void _writeChar(char c)
    {
        checkStream(streamSymbol.symbolValue())._writeChar(c);
    }

    @Override
	public void _writeChars(char[] chars, int start, int end)

    {
        checkStream(streamSymbol.symbolValue())._writeChars(chars, start, end);
    }

    @Override
	public void _writeString(String s)
    {
        checkStream(streamSymbol.symbolValue())._writeString(s);
    }

    @Override
	public void _writeLine(String s)
    {
        checkStream(streamSymbol.symbolValue())._writeLine(s);
    }

    // Reads an 8-bit byte.
    @Override
	public int _readByte()
    {
        return checkStream(streamSymbol.symbolValue())._readByte();
    }

    // Writes an 8-bit byte.
    @Override
	public void _writeByte(int n)
    {
        checkStream(streamSymbol.symbolValue())._writeByte(n);
    }

    @Override
	public void _finishOutput()
    {
        checkStream(streamSymbol.symbolValue())._finishOutput();
    }

    @Override
	public void _clearInput()
    {
        checkStream(streamSymbol.symbolValue())._clearInput();
    }

    @Override
	protected long _getFilePosition()
    {
        return checkStream(streamSymbol.symbolValue())._getFilePosition();
    }

    @Override
	protected boolean _setFilePosition(LispObject arg)
    {
        return checkStream(streamSymbol.symbolValue())._setFilePosition(arg);
    }

    @Override
	public void _close()
    {
        checkStream(streamSymbol.symbolValue())._close();
    }

    @Override
	public String printObject()
    {
        StringBuffer sb = new StringBuffer("SYNONYM-STREAM ");
        sb.append(streamSymbol.printObject());
        return unreadableString(sb.toString());
    }

    // ### make-synonym-stream symbol => synonym-stream
    private static final Primitive MAKE_SYNONYM_STREAM =
        new Primitive("make-synonym-stream", "symbol")
    {
        @Override
		public LispObject execute(LispObject arg)
        {
            return new SynonymStream(checkSymbol(arg));
        }
    };

    // ### synonym-stream-symbol synonym-stream => symbol
    private static final Primitive SYNONYM_STREAM_STREAMS =
        new Primitive("synonym-stream-symbol", "synonym-stream")
    {
        @Override
		public LispObject execute(LispObject arg)
        {
            if (arg instanceof SynonymStream)
                return ((SynonymStream)arg).streamSymbol;
            return type_error(arg, Symbol.SYNONYM_STREAM);
        }
    };
}
