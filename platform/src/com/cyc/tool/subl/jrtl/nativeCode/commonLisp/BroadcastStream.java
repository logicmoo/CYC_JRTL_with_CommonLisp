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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class BroadcastStream extends Stream {
	LispStream[] streams;

	BroadcastStream(LispStream[] streams) {
		super(LispSymbols.BROADCAST_STREAM);
		this.streams = streams;
		this.isOutputStream = true;
		if (streams.length == 0) {
			this.elementType = Lisp.T;
			this.isBinaryStream = true;
			this.isCharacterStream = true;
		} else {
			this.elementType = streams[streams.length - 1].getElementType();
			if (this.elementType == LispSymbols.CHARACTER || this.elementType == LispSymbols.BASE_CHAR)
				this.isCharacterStream = true;
			else
				this.isBinaryStream = true;
		}
	}

	public boolean _charReady() {
		this.notSupported();
		// Not reached.
		return false;
	}

	public void _clearInput() {
		this.notSupported();
	}

	public void _close() {
		this.setOpen(false);
	}

	public void _finishOutput() {
		for (int i = 0; i < this.streams.length; i++)
			this.streams[i]._finishOutput();
	}

	public long _getFilePosition() {
		if (this.streams.length == 0)
			return 0;
		else
			return this.streams[this.streams.length - 1]._getFilePosition();
	}

	// Reads an 8-bit byte.

	public int _readByte() {
		this.notSupported();
		// Not reached.
		return -1;
	}

	// Returns -1 at end of file.

	public int _readChar() {
		this.notSupported();
		// Not reached.
		return -1;
	}

	public boolean _setFilePosition(SubLObject arg) {
		return false;
	}

	public void _unreadChar(int n) {
		this.notSupported();
	}

	// Writes an 8-bit byte.

	public void _writeByte(int n) {
		for (int i = 0; i < this.streams.length; i++)
			this.streams[i]._writeByte(n);
	}

	public void _writeChar(char c) {
		for (int i = 0; i < this.streams.length; i++)
			this.streams[i]._writeChar(c);
	}

	public void _writeChars(char[] chars, int start, int end)

	{
		for (int i = 0; i < this.streams.length; i++)
			this.streams[i]._writeChars(chars, start, end);
	}

	public void _writeLine(String s) {
		for (int i = 0; i < this.streams.length; i++)
			this.streams[i]._writeLine(s);
	}

	public void _writeString(String s) {
		for (int i = 0; i < this.streams.length; i++)
			this.streams[i]._writeString(s);
	}

	public SubLObject classOf() {
		return BuiltInClass.BROADCAST_STREAM;
	}

	public SubLObject fileLength() {
		if (this.streams.length > 0)
			return this.streams[this.streams.length - 1].fileLength();
		else
			return Fixnum.ZERO;
	}

	public SubLObject fileStringLength(SubLObject arg) {
		if (this.streams.length > 0)
			return this.streams[this.streams.length - 1].fileStringLength(arg);
		else
			return Fixnum.ONE;
	}

	public LispStream[] getStreams() {
		return this.streams;
	}

	public SubLObject listen() {
		this.notSupported();
		// Not reached.
		return Lisp.NIL;
	}

	private void notSupported() {
		Lisp.error(new TypeError("Operation is not supported for streams of type BROADCAST-STREAM."));
	}

	public SubLObject typeOf() {
		return LispSymbols.BROADCAST_STREAM;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.BROADCAST_STREAM)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.BROADCAST_STREAM)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

	public String writeToString() {
		return this.unreadableString("BROADCAST-STREAM");
	}
}
