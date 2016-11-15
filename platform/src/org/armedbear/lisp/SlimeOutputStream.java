/*
 * SlimeOutputStream.java
 *
 * Copyright (C) 2004-2005 Andras Simon, Peter Graves
 * $Id: SlimeOutputStream.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import java.io.StringWriter;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class SlimeOutputStream extends Stream {
	private StringWriter stringWriter;
	Function f;

	SlimeOutputStream(Function f) {
		super(LispSymbols.SLIME_OUTPUT_STREAM);
		this.elementType = LispSymbols.CHARACTER;
		this.isInputStream = false;
		this.isOutputStream = true;
		this.isCharacterStream = true;
		this.isBinaryStream = false;
		this.setWriter(this.stringWriter = new StringWriter());
		this.f = f;
	}

	public void _finishOutput() {
		super._finishOutput();
		if (this.stringWriter.getBuffer().length() > 0) {
			String s = this.stringWriter.toString();
			this.stringWriter.getBuffer().setLength(0);
			LispThread.currentThread().execute(this.f, LispObjectFactory.makeString(s));
		}
	}

	public long _getFilePosition() {
		if (this.elementType == Lisp.NIL)
			return 0;
		return this.stringWriter.toString().length();
	}

	public void _writeChar(char c) {
		if (this.elementType == Lisp.NIL)
			this.writeError();
		super._writeChar(c);
	}

	public void _writeChars(char[] chars, int start, int end)

	{
		if (this.elementType == Lisp.NIL)
			this.writeError();
		super._writeChars(chars, start, end);
	}

	public void _writeLine(String s) {
		if (this.elementType == Lisp.NIL)
			this.writeError();
		super._writeLine(s);
	}

	public void _writeString(String s) {
		if (this.elementType == Lisp.NIL)
			this.writeError();
		super._writeString(s);
	}

	public SubLObject classOf() {
		return BuiltInClass.SLIME_OUTPUT_STREAM;
	}

	public String toString() {
		return this.unreadableString("SLIME-OUTPUT-STREAM");
	}

	public SubLObject typeOf() {
		return LispSymbols.SLIME_OUTPUT_STREAM;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.SLIME_OUTPUT_STREAM)
			return Lisp.T;
		if (type == LispSymbols.STRING_STREAM)
			return Lisp.T;
		if (type == BuiltInClass.SLIME_OUTPUT_STREAM)
			return Lisp.T;
		if (type == BuiltInClass.STRING_STREAM)
			return Lisp.T;
		return super.typep(type);
	}

	private void writeError() {
		Lisp.error(new TypeError("Attempt to write to a string output stream of element type NIL."));
	}

}
