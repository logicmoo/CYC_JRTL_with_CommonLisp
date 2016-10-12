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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SynonymStream extends Stream {
	SubLSymbol symbol;

	SynonymStream(SubLSymbol symbol) {
		super(LispSymbols.SYNONYM_STREAM);
		this.symbol = symbol;
	}

	public boolean _charReady() throws java.io.IOException {
		return Lisp.checkStream(this.symbol.symbolValue())._charReady();
	}

	public void _clearInput() {
		Lisp.checkStream(this.symbol.symbolValue())._clearInput();
	}

	public void _close() {
		Lisp.checkStream(this.symbol.symbolValue())._close();
	}

	public void _finishOutput() {
		Lisp.checkStream(this.symbol.symbolValue())._finishOutput();
	}

	public long _getFilePosition() {
		return Lisp.checkStream(this.symbol.symbolValue())._getFilePosition();
	}

	// Reads an 8-bit byte.

	public int _readByte() {
		return Lisp.checkStream(this.symbol.symbolValue())._readByte();
	}

	public int _readChar() throws java.io.IOException {
		return Lisp.checkStream(this.symbol.symbolValue())._readChar();
	}

	public boolean _setFilePosition(SubLObject arg) {
		return Lisp.checkStream(this.symbol.symbolValue())._setFilePosition(arg);
	}

	public void _unreadChar(int n) throws java.io.IOException {
		Lisp.checkStream(this.symbol.symbolValue())._unreadChar(n);
	}

	// Writes an 8-bit byte.

	public void _writeByte(int n) {
		Lisp.checkStream(this.symbol.symbolValue())._writeByte(n);
	}

	public void _writeChar(char c) {
		Lisp.checkStream(this.symbol.symbolValue())._writeChar(c);
	}

	public void _writeChars(char[] chars, int start, int end)

	{
		Lisp.checkStream(this.symbol.symbolValue())._writeChars(chars, start, end);
	}

	public void _writeLine(String s) {
		Lisp.checkStream(this.symbol.symbolValue())._writeLine(s);
	}

	public void _writeString(String s) {
		Lisp.checkStream(this.symbol.symbolValue())._writeString(s);
	}

	public SubLObject classOf() {
		return BuiltInClass.SYNONYM_STREAM;
	}

	public SubLObject fileLength() {
		return Lisp.checkStream(this.symbol.symbolValue()).fileLength();
	}

	public SubLObject fileStringLength(SubLObject arg) {
		return Lisp.checkStream(this.symbol.symbolValue()).fileStringLength(arg);
	}

	public SubLObject getElementType() {
		return Lisp.checkStream(this.symbol.symbolValue()).getElementType();
	}

	public boolean isBinaryInputStream() {
		return Lisp.checkStream(this.symbol.symbolValue()).isBinaryInputStream();
	}

	public boolean isBinaryOutputStream() {
		return Lisp.checkStream(this.symbol.symbolValue()).isBinaryOutputStream();
	}

	public boolean isCharacterInputStream() {
		return Lisp.checkStream(this.symbol.symbolValue()).isCharacterInputStream();
	}

	public boolean isCharacterOutputStream() {
		return Lisp.checkStream(this.symbol.symbolValue()).isCharacterOutputStream();
	}

	public boolean isInputStream() {
		return Lisp.checkStream(this.symbol.symbolValue()).isInputStream();
	}

	public boolean isOutputStream() {
		return Lisp.checkStream(this.symbol.symbolValue()).isOutputStream();
	}

	public SubLObject listen() {
		return Lisp.checkStream(this.symbol.symbolValue()).listen();
	}

	public SubLObject typeOf() {
		return LispSymbols.SYNONYM_STREAM;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.SYNONYM_STREAM)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.SYNONYM_STREAM)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

	public String writeToString() {
		StringBuffer sb = new StringBuffer("SYNONYM-STREAM ");
		sb.append(this.symbol.writeToString());
		return this.unreadableString(sb.toString());
	}

}
