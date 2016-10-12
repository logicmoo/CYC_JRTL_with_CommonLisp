/*
 * ComplexString.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: ComplexString.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public class ComplexString extends SubLString {
	// private int size;
	private int fillPointer = -1; // -1 indicates no fill pointer.
	private boolean isDisplaced;

	// For non-displaced arrays.
	// private char[] buf;

	// For displaced arrays.
	private AbstractArray array;
	private int displacement;

	public ComplexString(int capacity) {
		this.size = capacity;
		this.buf = new char[capacity];
		this.isDisplaced = false;
	}

	public ComplexString(int capacity, AbstractArray array, int displacement) {
		this.size = capacity;
		this.array = array;
		this.displacement = displacement;
		this.isDisplaced = true;
	}

	public AbstractVector adjustArray(int newCapacity, AbstractArray displacedTo, int displacement)

	{
		this.size = newCapacity;
		this.array = displacedTo;
		this.displacement = displacement;
		this.buf = null;
		this.isDisplaced = true;
		return this;
	}

	public AbstractVector adjustArray(int newCapacity, SubLObject initialElement, SubLObject initialContents)

	{
		if (initialContents != null) {
			// "If INITIAL-CONTENTS is supplied, it is treated as for MAKE-
			// ARRAY. In this case none of the original contents of array
			// appears in the resulting array."
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
			this.buf = newChars;
		} else {
			if (this.buf == null) {
				// Displaced array. Copy existing characters.
				this.buf = new char[newCapacity];
				int limit = Math.min(this.size, newCapacity);
				if (this.array instanceof SubLString) {
					SubLString string = (SubLString) this.array;
					for (int i = 0; i < limit; i++)
						this.buf[i] = string.charAt(this.displacement + i);
				} else
					for (int i = 0; i < limit; i++) {
						LispCharacter character = (LispCharacter) this.array.AREF(this.displacement + i);
						this.buf[i] = character.value;
					}
			} else if (this.size != newCapacity) {
				char[] newElements = new char[newCapacity];
				System.arraycopy(this.buf, 0, newElements, 0, Math.min(this.size, newCapacity));
				this.buf = newElements;
			}
			if (initialElement != null && this.size < newCapacity) {
				// Initialize new elements.
				char c = initialElement.charValue();
				for (int i = this.size; i < newCapacity; i++)
					this.buf[i] = c;
			}
		}
		this.size = newCapacity;
		this.array = null;
		this.displacement = 0;
		this.isDisplaced = false;
		return this;
	}

	// Ignores fill pointer.

	public SubLObject AREF(int index) {
		return LispCharacter.makeChar(this.charAt(index));
	}

	// Ignores fill pointer.

	public SubLObject AREF(SubLObject index) {
		return LispCharacter.makeChar(this.charAt(index.intValue()));
	}

	// TODO
	public SubLObject arrayDisplacement() {
		SubLObject value1, value2;
		if (this.array != null) {
			value1 = this.array;
			value2 = LispObjectFactory.makeInteger(this.displacement);
		} else {
			value1 = Lisp.NIL;
			value2 = Fixnum.ZERO;
		}
		return LispThread.currentThread().setValues(value1, value2);
	}

	public void aset(int index, SubLObject newValue) {
		this.setChar(index, newValue.charValue());
	}

	// TODO
	public int capacity() {
		return this.size;
	}

	// Ignores fill pointer.

	public SubLObject CHAR(int index) {
		return LispCharacter.makeChar(this.charAt(index));
	}

	public char charAt(int index) {
		if (this.buf != null)
			try {
				return this.buf[index];
			} catch (ArrayIndexOutOfBoundsException e) {
				this.badIndex(index, this.size);
				return 0; // Not reached.
			}
		else
			return this.array.AREF(index + this.displacement).charValue();
	}

	public char[] charsOld() {
		if (this.buf != null)
			return this.buf;
		Debug.assertTrue(this.array != null);
		char[] copy = new char[this.size];
		if (this.array instanceof SubLString)
			System.arraycopy(this.array.charsOld(), this.displacement, copy, 0, this.size);
		else if (this.array.getElementType() == LispSymbols.CHARACTER)
			for (int i = 0; i < this.size; i++) {
				SubLObject obj = this.array.AREF(this.displacement + i);
				copy[i] = obj.charValue();
			}
		else
			Lisp.type_error(this.array, LispSymbols.STRING);
		return copy;
	}

	public int cl_length() {
		return this.fillPointer >= 0 ? this.fillPointer : this.size;
	}

	public SubLObject classOf() {
		return BuiltInClass.STRING;
	}

	public SubLObject elt(int index) {
		int limit = this.cl_length();
		if (index < 0 || index >= limit)
			this.badIndex(index, limit);
		return LispCharacter.makeChar(this.charAt(index));
	}

	public void ensureCapacity(int minCapacity) {
		if (this.buf != null) {
			if (this.size < minCapacity) {
				char[] newArray = new char[minCapacity];
				System.arraycopy(this.buf, 0, newArray, 0, this.size);
				this.buf = newArray;
				this.size = minCapacity;
			}
		} else {
			Debug.assertTrue(this.array != null);
			if (this.size < minCapacity || this.array.getTotalSize() - this.displacement < minCapacity) {
				// Copy array.
				this.buf = new char[minCapacity];
				int limit = Math.min(this.size, this.array.getTotalSize() - this.displacement);
				if (this.array instanceof SubLString) {
					SubLString string = (SubLString) this.array;
					for (int i = 0; i < limit; i++)
						this.buf[i] = string.charAt(this.displacement + i);
				} else
					for (int i = 0; i < limit; i++) {
						LispCharacter character = (LispCharacter) this.array.AREF(this.displacement + i);
						this.buf[i] = character.value;
					}
				this.size = minCapacity;
				this.array = null;
				this.displacement = 0;
				this.isDisplaced = false;
			}
		}
	}

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof SubLString) {
			SubLString string = (SubLString) obj;
			if (string.cl_length() != this.cl_length())
				return false;
			for (int i = this.cl_length(); i-- > 0;)
				if (string.charAt(i) != this.charAt(i))
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
		if (obj instanceof SubLString) {
			SubLString string = (SubLString) obj;
			if (string.cl_length() != this.cl_length())
				return false;
			for (int i = this.cl_length(); i-- > 0;)
				if (string.charAt(i) != this.charAt(i))
					if (CharacterFunctions.toLowerCase(string.charAt(i)) != CharacterFunctions
							.toLowerCase(this.charAt(i)))
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
		for (int i = this.cl_length(); i-- > 0;)
			this.setChar(i, c);
	}

	// TODO
	public void fillVoid(SubLObject obj) {
		this.fill(obj.charValue());
	}

	// TODO
	public int getFillPointer() {
		return this.fillPointer;
	}

	public String getString() {
		if (this.fillPointer >= 0)
			return new String(this.charsOld(), 0, this.fillPointer);
		else
			return new String(this.charsOld());
	}

	public char[] getStringChars() {
		if (this.fillPointer < 0)
			return this.charsOld();
		char[] ret = new char[this.fillPointer];
		System.arraycopy(this.charsOld(), 0, ret, 0, this.fillPointer);
		return ret;
	}

	// TODO
	public boolean hasFillPointer() {
		return this.fillPointer >= 0;
	}

	// TODO
	public boolean isDisplaced() {
		return this.isDisplaced;
	}

	public Object javaInstance() {
		return new String(this.charsOld());
	}

	public Object javaInstance(Class c) {
		return this.javaInstance();
	}

	public SubLObject nreverse() {
		int i = 0;
		int j = this.cl_length() - 1;
		while (i < j) {
			char temp = this.charAt(i);
			this.setChar(i, this.charAt(j));
			this.setChar(j, temp);
			++i;
			--j;
		}
		return this;
	}

	// For EQUALP hash tables.

	public int psxhash() {
		int hashCode = 0;
		int limit = this.cl_length();
		for (int i = 0; i < limit; i++) {
			hashCode += Character.toUpperCase(this.charAt(i));
			hashCode += hashCode << 10;
			hashCode ^= hashCode >> 6;
		}
		hashCode += hashCode << 3;
		hashCode ^= hashCode >> 11;
		hashCode += hashCode << 15;
		return hashCode & 0x7fffffff;
	}

	public SubLObject reverse() {
		int length = this.cl_length();
		SubLString result = LispObjectFactory.makeString(length);
		int i, j;
		for (i = 0, j = length - 1; i < length; i++, j--)
			result.setChar(i, this.charAt(j));
		return result;
	}

	public void setChar(int index, char c) {
		if (this.buf != null)
			try {
				this.buf[index] = c;
			} catch (ArrayIndexOutOfBoundsException e) {
				this.badIndex(index, this.size);
			}
		else
			this.array.aset(index + this.displacement, LispCharacter.makeChar(c));
	}

	// TODO
	public void setFillPointer(int n) {
		this.fillPointer = n;
	}

	public void setFillPointer(SubLObject obj) {
		if (obj == Lisp.T)
			this.fillPointer = this.capacity();
		else {
			int n = obj.intValue();
			if (n > this.capacity()) {
				StringBuffer sb = new StringBuffer("The new fill pointer (");
				sb.append(n);
				sb.append(") exceeds the capacity of the vector (");
				sb.append(this.capacity());
				sb.append(").");
				Lisp.error(new LispError(sb.toString()));
			} else if (n < 0) {
				StringBuffer sb = new StringBuffer("The new fill pointer (");
				sb.append(n);
				sb.append(") is negative.");
				Lisp.error(new LispError(sb.toString()));
			} else
				this.fillPointer = n;
		}
	}

	// TODO
	public void shrink(int n) {
		if (this.buf != null) {
			if (n < this.size) {
				char[] newArray = new char[n];
				System.arraycopy(this.buf, 0, newArray, 0, n);
				this.buf = newArray;
				this.size = n;
				this.fillPointer = -1;
				return;
			}
			if (n == this.size)
				return;
		}
		Debug.assertTrue(this.buf == null);
		// Displaced array. Copy existing characters.
		this.buf = new char[n];
		if (this.array instanceof SubLString) {
			SubLString string = (SubLString) this.array;
			for (int i = 0; i < n; i++)
				this.buf[i] = string.charAt(this.displacement + i);
		} else
			for (int i = 0; i < n; i++) {
				LispCharacter character = (LispCharacter) this.array.AREF(this.displacement + i);
				this.buf[i] = character.value;
			}
		this.size = n;
		this.array = null;
		this.displacement = 0;
		this.isDisplaced = false;
		this.fillPointer = -1;
	}

	// TODO
	public SubLObject subseq(int start, int end) {
		SubLString s = LispObjectFactory.makeString(end - start);
		int i = start, j = 0;
		while (i < end)
			s.setChar(j++, this.charAt(i++));
		return s;
	}

	public int sxhash() {
		int hashCode = 0;
		int limit = this.cl_length();
		for (int i = 0; i < limit; i++) {
			hashCode += this.charAt(i);
			hashCode += hashCode << 10;
			hashCode ^= hashCode >> 6;
		}
		hashCode += hashCode << 3;
		hashCode ^= hashCode >> 11;
		hashCode += hashCode << 15;
		return hashCode & 0x7fffffff;
	}

	public SubLObject typeOf() {
		return Lisp.list(LispSymbols.STRING, Lisp.number(this.capacity()));
	}

	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element)

	{
		this.vectorPushExtend(element);
		return LispObjectFactory.makeInteger(this.fillPointer - 1);
	}

	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element, SubLObject extension)

	{
		int ext = extension.intValue();
		if (this.fillPointer < 0)
			this.noFillPointer();
		if (this.fillPointer >= this.size) {
			// Need to extend vector.
			ext = Math.max(ext, this.size + 1);
			this.ensureCapacity(this.size + ext);
		}
		if (this.buf != null)
			this.buf[this.fillPointer] = element.charValue();
		else
			this.array.aset(this.fillPointer + this.displacement, element);
		return LispObjectFactory.makeInteger(this.fillPointer++);
	}

	public void vectorPushExtend(SubLObject element)

	{
		if (this.fillPointer < 0)
			this.noFillPointer();
		if (this.fillPointer >= this.size)
			// Need to extend vector.
			this.ensureCapacity(this.size * 2 + 1);
		if (this.buf != null)
			this.buf[this.fillPointer] = element.charValue();
		else
			this.array.aset(this.fillPointer + this.displacement, element);
		++this.fillPointer;
	}
}
