/*
 * ConcatenatedStream.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: ConcatenatedStream.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

public class ConcatenatedStream extends Stream {
	SubLObject streams;

	private int unreadChar = -1;

	ConcatenatedStream(SubLObject streams) {
		super(LispSymbols.CONCATENATED_STREAM);
		this.streams = streams;
		this.isInputStream = true;
	}

	public boolean _charReady() throws java.io.IOException {
		if (this.unreadChar >= 0)
			return true;
		if (this.streams == Lisp.NIL)
			return false;
		LispStream stream = (LispStream) this.streams.first();
		if (stream._charReady())
			return true;
		SubLObject remainingStreams = this.streams.rest();
		while (remainingStreams != Lisp.NIL) {
			stream = (LispStream) remainingStreams.first();
			if (stream._charReady())
				return true;
			remainingStreams = remainingStreams.rest();
		}
		return false;
	}

	public void _clearInput() {
		// FIXME
	}

	public void _finishOutput() {
		this.outputStreamError();
	}

	// Reads an 8-bit byte.

	public int _readByte() {
		if (this.streams == Lisp.NIL)
			return -1;
		LispStream stream = (LispStream) this.streams.first();
		int n = stream._readByte();
		if (n >= 0)
			return n;
		this.streams = this.streams.rest();
		return this._readByte();
	}

	// Returns -1 at end of file.

	public int _readChar() throws java.io.IOException {
		int n;
		if (this.unreadChar >= 0) {
			n = this.unreadChar;
			this.unreadChar = -1;
			return n;
		}
		if (this.streams == Lisp.NIL)
			return -1;
		LispStream stream = (LispStream) this.streams.first();
		n = stream._readChar();
		if (n >= 0)
			return n;
		this.streams = this.streams.rest();
		return this._readChar();
	}

	public void _unreadChar(int n) {
		if (this.unreadChar >= 0)
			Lisp.error(new StreamError(this,
					"UNREAD-CHAR was invoked twice consecutively without an intervening call to READ-CHAR."));
		this.unreadChar = n;
	}

	// Writes an 8-bit byte.

	public void _writeByte(int n) {
		this.outputStreamError();
	}

	public void _writeChar(char c) {
		this.outputStreamError();
	}

	public void _writeChars(char[] chars, int start, int end)

	{
		this.outputStreamError();
	}

	public void _writeLine(String s) {
		this.outputStreamError();
	}

	public void _writeString(String s) {
		this.outputStreamError();
	}

	public SubLObject classOf() {
		return BuiltInClass.CONCATENATED_STREAM;
	}

	public SubLObject getElementType() {
		if (this.streams == Lisp.NIL)
			return Lisp.NIL;
		return ((LispStream) this.streams.first()).getElementType();
	}

	public boolean isBinaryInputStream() {
		if (this.streams == Lisp.NIL)
			return true;
		return ((LispStream) this.streams.first()).isBinaryInputStream();
	}

	public boolean isBinaryOutputStream() {
		return false;
	}

	public boolean isCharacterInputStream() {
		if (this.streams == Lisp.NIL)
			return true;
		return ((LispStream) this.streams.first()).isCharacterInputStream();
	}

	public boolean isCharacterOutputStream() {
		return false;
	}

	public SubLObject listen() {
		if (this.unreadChar >= 0)
			return Lisp.T;
		if (this.streams == Lisp.NIL)
			return Lisp.NIL;
		SubLObject obj = this.readCharNoHang(false, this);
		if (obj == this)
			return Lisp.NIL;
		this.unreadChar = ((LispCharacter) obj).charValue();
		return Lisp.T;
	}

	private void outputStreamError() {
		Lisp.error(new StreamError(this, String.valueOf(this) + " is not an output stream."));
	}

	public SubLObject readCharNoHang(boolean eofError, SubLObject eofValue)

	{
		if (this.streams == Lisp.NIL)
			if (eofError)
				return Lisp.error(new EndOfFile(this));
			else
				return eofValue;
		try {
			return this._charReady() ? this.readChar(eofError, eofValue) : Lisp.NIL;
		} catch (java.io.IOException e) {
			return Lisp.error(new StreamError(this, e));
		}
	}

	public SubLObject typeOf() {
		return LispSymbols.CONCATENATED_STREAM;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.CONCATENATED_STREAM)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.CONCATENATED_STREAM)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

}
