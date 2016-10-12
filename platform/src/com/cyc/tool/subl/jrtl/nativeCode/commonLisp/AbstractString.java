/*
 * AbstractString.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: AbstractString.java 12431 2010-02-08 08:05:15Z mevenson $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLArraySequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractString extends AbstractSubLArraySequence implements LispSequence {

	public SubLObject AREF(int index) {
		return this.CHAR(index);
	}

	public abstract char charAt(int index);

	public abstract void fill(char c);

	// TODO
	public SubLObject getElementType() {
		return LispSymbols.CHARACTER;
	}

	// TODO
	public boolean isSimpleVector() {
		return false;
	}

	public boolean isString() {
		return true;
	}

	public boolean isVector() {
		// TODO Auto-generated method stub
		return super.isVector();
	}

	public abstract void setChar(int index, char c);

	public SubLObject STRING() {
		return this;
	}

	public String toString() {
		int length = this.cl_length();
		if (length > 256)
			length = 256;
		String s = this.writeToString(0, length);
		Thread.dumpStack();
		Debug.trace("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!toString called on a string!: " + s);
		return s;
		// StringBuilder sb = new StringBuilder(length);
		// for(int i = 0; i < length; ++i) {
		// sb.append(charAt(i));
		// }
		// return sb.toString();
	}

	public SubLObject typep(SubLObject type) {
		if (type instanceof SubLSymbol) {
			if (type == LispSymbols.STRING)
				return Lisp.T;
			if (type == LispSymbols.BASE_STRING)
				return Lisp.T;
		}
		if (type == BuiltInClass.STRING)
			return Lisp.T;
		if (type == BuiltInClass.BASE_STRING)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		return this.writeToString(0, this.cl_length());
	}

	public String writeToString(int beginIndex, int endIndex)

	{
		if (beginIndex < 0)
			beginIndex = 0;
		int limit;
		limit = this.cl_length();
		if (endIndex > limit)
			endIndex = limit;
		LispThread thread = LispThread.currentThread();
		if (LispSymbols.PRINT_ESCAPE.symbolValue(thread) != Lisp.NIL
				|| LispSymbols.PRINT_READABLY.symbolValue(thread) != Lisp.NIL) {
			StringBuilder sb = new StringBuilder("\"");
			for (int i = beginIndex; i < endIndex; i++) {
				char c = this.charAt(i);
				if (c == '\"' || c == '\\')
					sb.append('\\');
				sb.append(c);
			}
			sb.append('"');
			return sb.toString();
		} else
			return this.getString().substring(beginIndex, endIndex);
	}

}
