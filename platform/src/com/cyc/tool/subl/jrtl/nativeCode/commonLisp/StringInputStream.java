/*
 * StringInputStream.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: StringInputStream.java 12362 2010-01-11 20:03:29Z vvoutilainen $
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

import java.io.StringReader;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class StringInputStream extends Stream {
	private StringReader stringReader;
	private int start;

	public StringInputStream(String s) {
		this(s, 0, s.length());
	}

	public StringInputStream(String s, int start) {
		this(s, start, s.length());
	}

	public StringInputStream(String s, int start, int end) {
		super(LispSymbols.STRING_INPUT_STREAM);
		this.elementType = LispSymbols.CHARACTER;
		this.setExternalFormat(Stream.keywordDefault);
		this.eolStyle = EolStyle.RAW;

		this.start = start;

		this.stringReader = new StringReader(s.substring(start, end));
		this.initAsCharacterInputStream(this.stringReader);
	}

	public SubLObject classOf() {
		return BuiltInClass.STRING_INPUT_STREAM;
	}

	public int getOffset() {
		return this.start + super.getOffset();
	}

	public String toString() {
		return this.unreadableString("STRING-INPUT-STREAM");
	}

	public SubLObject typeOf() {
		return LispSymbols.STRING_INPUT_STREAM;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.STRING_INPUT_STREAM)
			return Lisp.T;
		if (type == LispSymbols.STRING_STREAM)
			return Lisp.T;
		if (type == BuiltInClass.STRING_INPUT_STREAM)
			return Lisp.T;
		if (type == BuiltInClass.STRING_STREAM)
			return Lisp.T;
		return super.typep(type);
	}

}
