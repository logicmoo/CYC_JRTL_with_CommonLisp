/*
 * AbstractString.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: AbstractString.java 12494 2010-02-21 14:33:12Z vvoutilainen $
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

import java.util.Arrays;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public class SimpleString extends SubLString {
	// private int size;
	// private char[] buf;

	public SimpleString(char c) {
		this.buf = new char[1];
		this.buf[0] = c;
		this.size = 1;
	}

	public SimpleString(char[] chars) {
		super(chars);
		// this.buf = chars;
		// size = chars.length;
	}

	public SimpleString(char[] charArray, int start, int end) {
		super(charArray, start, end);
	}

	public SimpleString(int capacity) {
		this.size = capacity;
		this.buf = new char[capacity];
	}

	public SimpleString(int size, char defaultChar) {
		super(size, defaultChar);
	}

	public SimpleString(LispCharacter c) {
		this.buf = new char[1];
		this.buf[0] = c.value;
		this.size = 1;
	}

	public SimpleString(String s) {
		super(s);
		// size = s.length();
		// buf = s.toCharArray();
	}

	public SimpleString(StringBuffer sb) {
		this.buf = new char[this.size = sb.length()];
		sb.getChars(0, this.size, this.buf, 0);
	}

	public SimpleString(StringBuilder sb) {
		this.buf = sb.toString().toCharArray();
		this.size = this.buf.length;
	}

	public AbstractVector adjustArray(int newCapacity, AbstractArray displacedTo, int displacement)

	{
		return new ComplexString(newCapacity, displacedTo, displacement);
	}

	public AbstractVector adjustArray(int newCapacity, SubLObject initialElement, SubLObject initialContents)

	{
		if (initialContents != null) {
			char[] newChars = new char[newCapacity];
			if (initialContents.isList()) {
				SubLObject list = initialContents;
				for (int i = 0; i < newCapacity; i++) {
					newChars[i] = list.first().charValue();
					list = list.rest();
				}
			} else if (initialContents.isVector())
				for (int i = 0; i < newCapacity; i++)
					newChars[i] = initialContents.elt(i).charValue();
			else
				Lisp.type_error(initialContents, LispSymbols.SEQUENCE);
			return LispObjectFactory.makeString(newChars);
		}
		if (this.size != newCapacity) {
			char[] newChars = new char[newCapacity];
			System.arraycopy(this.buf, 0, newChars, 0, Math.min(newCapacity, this.size));
			if (initialElement != null && this.size < newCapacity) {
				char c = initialElement.charValue();
				for (int i = this.size; i < newCapacity; i++)
					newChars[i] = c;
			}
			return LispObjectFactory.makeString(newChars);
		}
		// No change.
		return this;
	}

	public SubLObject AREF(int index) {
		try {
			return LispCharacter.makeChar(this.buf[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.size);
			return Lisp.NIL; // Not reached.
		}
	}

	public SubLObject AREF(SubLObject index) {
		try {
			return LispCharacter.makeChar(this.buf[index.intValue()]);
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(((Fixnum) index).value, this.size);
			return Lisp.NIL; // Not reached.
		}
	}

	public void aset(int index, SubLObject obj) {
		try {
			this.buf[index] = obj.charValue();
			this.setMutated();
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.size);
		}
	}

	public int capacity() {
		return this.size;
	}

	public SubLObject CHAR(int index) {
		try {
			return LispCharacter.makeChar(this.buf[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.size);
			return Lisp.NIL; // Not reached.
		}
	}

	public char charAt(int index) {
		try {
			return this.buf[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.size);
			return 0; // Not reached.
		}
	}

	public char[] charsOld() {
		return this.buf;
	}

	public int cl_length() {
		return this.size;
	}

	public SubLObject classOf() {
		return BuiltInClass.SIMPLE_BASE_STRING;
	}

	public SubLObject elt(int index) {
		try {
			return LispCharacter.makeChar(this.buf[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.size);
			return Lisp.NIL; // Not reached.
		}
	}

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof SimpleString) {
			SimpleString string = (SimpleString) obj;
			if (string.size != this.size)
				return false;
			for (int i = this.size; i-- > 0;)
				if (string.buf[i] != this.buf[i])
					return false;
			return true;
		}
		if (obj instanceof SubLString) {
			SubLString string = (SubLString) obj;
			if (string.cl_length() != this.size)
				return false;
			for (int i = this.cl_length(); i-- > 0;)
				if (string.charAt(i) != this.buf[i])
					return false;
			return true;
		}
		if (obj instanceof NilVector)
			return obj.equal(this);
		return false;
	}

	public boolean equalp(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof SimpleString) {
			SimpleString string = (SimpleString) obj;
			if (string.size != this.size)
				return false;
			for (int i = this.size; i-- > 0;)
				if (string.buf[i] != this.buf[i])
					if (CharacterFunctions.toLowerCase(string.buf[i]) != CharacterFunctions.toLowerCase(this.buf[i]))
						return false;
			return true;
		}
		if (obj instanceof SubLString) {
			SubLString string = (SubLString) obj;
			if (string.cl_length() != this.size)
				return false;
			for (int i = this.cl_length(); i-- > 0;)
				if (string.charAt(i) != this.buf[i])
					if (CharacterFunctions.toLowerCase(string.charAt(i)) != CharacterFunctions.toLowerCase(this.buf[i]))
						return false;
			return true;
		}
		if (obj instanceof AbstractBitVector)
			return false;
		if (obj instanceof AbstractArray)
			return obj.equalp(this);
		return false;
	}

	public void fill(char c) {
		if (this.size != this.buf.length)
			Debug.dumpStack("capacity!=chars.length " + this.writeToString());
		this.setMutated();
		Arrays.fill(this.buf, c);
	}

	public void fillVoid(SubLObject obj) {
		this.fill(obj.charValue());
	}

	public SubLObject getDescription() {
		StringBuilder sb = new StringBuilder("A simple-string (");
		sb.append(this.size);
		sb.append(") \"");
		sb.append(this.buf);
		sb.append('"');
		return LispObjectFactory.makeString(sb);
	}

	public char[] getStringChars() {
		return this.buf;
	}

	public boolean hasFillPointer() {
		return false;
	}

	//
	// public String getString()
	// {
	// return String.valueOf(buf);
	// }

	public boolean isAdjustable() {
		return false;
	}

	public Object javaInstance() {
		return this.getString();
	}

	public Object javaInstance(Class c) {
		return this.javaInstance();
	}

	public SubLObject nreverse() {
		int i = 0;
		int j = this.size - 1;
		while (i < j) {
			char temp = this.buf[i];
			this.buf[i] = this.buf[j];
			this.buf[j] = temp;
			++i;
			--j;
		}
		this.setMutated();
		return this;
	}

	// For EQUALP hash tables.

	public int psxhash() {
		int hashCode = 0;
		for (int i = 0; i < this.size; i++) {
			hashCode += Character.toUpperCase(this.buf[i]);
			hashCode += hashCode << 10;
			hashCode ^= hashCode >> 6;
		}
		hashCode += hashCode << 3;
		hashCode ^= hashCode >> 11;
		hashCode += hashCode << 15;
		return hashCode & 0x7fffffff;
	}

	public SubLObject reverse() {
		SimpleString result = (SimpleString) LispObjectFactory.makeString(this.size);
		int i, j;
		for (i = 0, j = this.size - 1; i < this.size; i++, j--)
			result.buf[i] = this.buf[j];
		this.setMutated();
		return result;
	}

	public SubLObject SCHAR(int index) {
		try {
			return LispCharacter.makeChar(this.buf[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.size);
			return Lisp.NIL; // Not reached.
		}
	}

	public void setChar(int index, char c) {
		try {
			this.buf[index] = c;
			this.setMutated();
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.size);
		}
	}

	public void shrink(int n) {
		if (n < this.size) {
			char[] newArray = new char[n];
			System.arraycopy(this.buf, 0, newArray, 0, n);
			this.buf = newArray;
			this.size = n;
			this.setMutated();
			return;
		}
		if (n == this.size)
			return;
		Lisp.error(new LispError());
	}

	public SubLObject SIMPLE_STRING_P() {
		return Lisp.T;
	}

	public SubLObject subseq(int start, int end) {
		return this.substring(start, end);
	}

	public SubLString substring(int start) {
		return this.substring(start, this.size);
	}

	public SubLString substring(int start, int end)

	{
		SimpleString s = (SimpleString) LispObjectFactory.makeString(end - start);
		int i = start, j = 0;
		try {
			while (i < end)
				s.buf[j++] = this.buf[i++];
			return s;
		} catch (ArrayIndexOutOfBoundsException e) {
			Lisp.error(new TypeError("Array index out of bounds: " + i));
			// Not reached.
			return null;
		}
	}

	public int sxhash() {
		int hashCode = 0;
		for (int i = 0; i < this.size; i++) {
			hashCode += this.buf[i];
			hashCode += hashCode << 10;
			hashCode ^= hashCode >> 6;
		}
		hashCode += hashCode << 3;
		hashCode ^= hashCode >> 11;
		hashCode += hashCode << 15;
		return hashCode & 0x7fffffff;
	}

	public SubLObject typeOf() {
		return Lisp.list(LispSymbols.SIMPLE_BASE_STRING, LispObjectFactory.makeInteger(this.size));
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.SIMPLE_STRING)
			return Lisp.T;
		if (type == LispSymbols.SIMPLE_ARRAY)
			return Lisp.T;
		if (type == LispSymbols.SIMPLE_BASE_STRING)
			return Lisp.T;
		if (type == BuiltInClass.SIMPLE_STRING)
			return Lisp.T;
		if (type == BuiltInClass.SIMPLE_ARRAY)
			return Lisp.T;
		if (type == BuiltInClass.SIMPLE_BASE_STRING)
			return Lisp.T;
		return super.typep(type);
	}
}
