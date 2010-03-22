/*
 * SynonymStream.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: SynonymStream.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public final class SynonymStream extends Stream
{
    final SubLSymbol symbol;

    SynonymStream(SubLSymbol symbol)
    {
        super(LispSymbols.SYNONYM_STREAM);
        this.symbol = symbol;
    }

    @Override
    public boolean isInputStream()
    {
        return checkStream(symbol.symbolValue()).isInputStream();
    }

    @Override
    public boolean isOutputStream()
    {
        return checkStream(symbol.symbolValue()).isOutputStream();
    }

    @Override
    public boolean isCharacterInputStream()
    {
        return checkStream(symbol.symbolValue()).isCharacterInputStream();
    }

    @Override
    public boolean isBinaryInputStream()
    {
        return checkStream(symbol.symbolValue()).isBinaryInputStream();
    }

    @Override
    public boolean isCharacterOutputStream()
    {
        return checkStream(symbol.symbolValue()).isCharacterOutputStream();
    }

    @Override
    public boolean isBinaryOutputStream()
    {
        return checkStream(symbol.symbolValue()).isBinaryOutputStream();
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.SYNONYM_STREAM;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.SYNONYM_STREAM;
    }

    @Override
    public SubLObject typep(SubLObject typeSpecifier)
    {
        if (typeSpecifier == LispSymbols.SYNONYM_STREAM)
            return T;
        if (typeSpecifier == BuiltInClass.SYNONYM_STREAM)
            return T;
        return super.typep(typeSpecifier);
    }

    @Override
    public SubLObject getElementType()
    {
        return checkStream(symbol.symbolValue()).getElementType();
    }

    @Override
    public SubLObject listen()
    {
        return checkStream(symbol.symbolValue()).listen();
    }

    @Override
    public SubLObject fileLength()
    {
        return checkStream(symbol.symbolValue()).fileLength();
    }

    @Override
    public SubLObject fileStringLength(SubLObject arg)
    {
        return checkStream(symbol.symbolValue()).fileStringLength(arg);
    }

    @Override
    public int _readChar() throws java.io.IOException
    {
        return checkStream(symbol.symbolValue())._readChar();
    }

    @Override
    public void _unreadChar(int n) throws java.io.IOException
    {
        checkStream(symbol.symbolValue())._unreadChar(n);
    }

    @Override
    public boolean _charReady() throws java.io.IOException
    {
        return checkStream(symbol.symbolValue())._charReady();
    }

    @Override
    public void _writeChar(char c)
    {
        checkStream(symbol.symbolValue())._writeChar(c);
    }

    @Override
    public void _writeChars(char[] chars, int start, int end)

    {
        checkStream(symbol.symbolValue())._writeChars(chars, start, end);
    }

    @Override
    public void _writeString(String s)
    {
        checkStream(symbol.symbolValue())._writeString(s);
    }

    @Override
    public void _writeLine(String s)
    {
        checkStream(symbol.symbolValue())._writeLine(s);
    }

    // Reads an 8-bit byte.
    @Override
    public int _readByte()
    {
        return checkStream(symbol.symbolValue())._readByte();
    }

    // Writes an 8-bit byte.
    @Override
    public void _writeByte(int n)
    {
        checkStream(symbol.symbolValue())._writeByte(n);
    }

    @Override
    public void _finishOutput()
    {
        checkStream(symbol.symbolValue())._finishOutput();
    }

    @Override
    public void _clearInput()
    {
        checkStream(symbol.symbolValue())._clearInput();
    }

    @Override
		public long _getFilePosition()
    {
        return checkStream(symbol.symbolValue())._getFilePosition();
    }

    @Override
		public boolean _setFilePosition(SubLObject arg)
    {
        return checkStream(symbol.symbolValue())._setFilePosition(arg);
    }

    @Override
    public void _close()
    {
        checkStream(symbol.symbolValue())._close();
    }

    @Override
    public String writeToString()
    {
        StringBuffer sb = new StringBuffer("SYNONYM-STREAM ");
        sb.append(symbol.writeToString());
        return unreadableString(sb.toString());
    }

}
