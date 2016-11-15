/*
 * BasicVector_UnsignedByte32.java
 *
 * Copyright (C) 2002-2006 Peter Graves
 * $Id: BasicVector_UnsignedByte32.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

// A basic vector is a specialized vector that is not displaced to another
// array, has no fill pointer, and is not expressly adjustable.
public class BasicVector_UnsignedByte32 extends AbstractSubLVector {
	private int capacity;

	private long[] elements;

	public BasicVector_UnsignedByte32(int capacity) {
		this.elements = new long[capacity];
		this.capacity = capacity;
	}

	public BasicVector_UnsignedByte32(SubLObject[] array)

	{
		this.capacity = array.length;
		this.elements = new long[this.capacity];
		for (int i = array.length; i-- > 0;)
			this.elements[i] = array[i].longValue();
	}

	public AbstractVector adjustArray(int newCapacity, AbstractArray displacedTo, int displacement) {
		return new ComplexVector(newCapacity, displacedTo, displacement);
	}

	public AbstractVector adjustArray(int newCapacity, SubLObject initialElement, SubLObject initialContents)

	{
		if (initialContents != null) {
			SubLObject[] newElements = LispObjectFactory.makeLispObjectArray(newCapacity);
			if (initialContents.isList()) {
				SubLObject list = initialContents;
				for (int i = 0; i < newCapacity; i++) {
					newElements[i] = list.first();
					list = list.rest();
				}
			} else if (initialContents.isVector())
				for (int i = 0; i < newCapacity; i++)
					newElements[i] = initialContents.elt(i);
			else
				Lisp.type_error(initialContents, LispSymbols.SEQUENCE);
			return new BasicVector_UnsignedByte32(newElements);
		}
		if (this.capacity != newCapacity) {
			SubLObject[] newElements = LispObjectFactory.makeLispObjectArray(newCapacity);
			System.arraycopy(this.elements, 0, newElements, 0, Math.min(this.capacity, newCapacity));
			if (initialElement != null)
				for (int i = this.capacity; i < newCapacity; i++)
					newElements[i] = initialElement;
			return new BasicVector_UnsignedByte32(newElements);
		}
		// No change.
		return this;
	}

	public int aref(int index) {
		try {
			return (int) this.elements[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.elements.length);
			return -1; // Not reached.
		}
	}

	public SubLObject AREF(int index) {
		try {
			return Lisp.number(this.elements[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.elements.length);
			return Lisp.NIL; // Not reached.
		}
	}

	public SubLObject AREF(SubLObject index) {
		int idx = index.intValue();
		try {
			return Lisp.number(this.elements[idx]);
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(idx, this.elements.length);
			return Lisp.NIL; // Not reached.
		}
	}

	public long aref_long(int index) {
		try {
			return this.elements[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.elements.length);
			return -1; // Not reached.
		}
	}

	public void aset(int index, SubLObject newValue) {
		try {
			this.elements[index] = newValue.longValue();
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.capacity);
		}
	}

	public int capacity() {
		return this.capacity;
	}

	public int cl_length() {
		return this.capacity;
	}

	public SubLObject classOf() {
		return BuiltInClass.VECTOR;
	}

	public SubLObject elt(int index) {
		try {
			return Lisp.number(this.elements[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.capacity);
			return Lisp.NIL; // Not reached.
		}
	}

	public void fillVoid(SubLObject obj) {
		for (int i = this.capacity; i-- > 0;)
			this.elements[i] = obj.longValue();
	}

	public SubLObject getElementType() {
		return Lisp.UNSIGNED_BYTE_32;
	}

	public boolean hasFillPointer() {
		return false;
	}

	public boolean isAdjustable() {
		return false;
	}

	public boolean isSimpleVector() {
		return false;
	}

	public SubLObject nreverse() {
		int i = 0;
		int j = this.capacity - 1;
		while (i < j) {
			long temp = this.elements[i];
			this.elements[i] = this.elements[j];
			this.elements[j] = temp;
			++i;
			--j;
		}
		return this;
	}

	public SubLObject reverse() {
		BasicVector_UnsignedByte32 result = new BasicVector_UnsignedByte32(this.capacity);
		int i, j;
		for (i = 0, j = this.capacity - 1; i < this.capacity; i++, j--)
			result.elements[i] = this.elements[j];
		return result;
	}

	public void shrink(int n) {
		if (n < this.capacity) {
			long[] newArray = new long[n];
			System.arraycopy(this.elements, 0, newArray, 0, n);
			this.elements = newArray;
			this.capacity = n;
			return;
		}
		if (n == this.capacity)
			return;
		Lisp.error(new LispError());
	}

	public SubLObject subseq(int start, int end) {
		BasicVector_UnsignedByte32 v = new BasicVector_UnsignedByte32(end - start);
		int i = start, j = 0;
		try {
			while (i < end)
				v.elements[j++] = this.elements[i++];
			return v;
		} catch (ArrayIndexOutOfBoundsException e) {
			// FIXME
			return Lisp.error(new TypeError("Array index out of bounds: " + i + "."));
		}
	}

	public SubLObject typeOf() {
		return Lisp.list(LispSymbols.SIMPLE_ARRAY, Lisp.UNSIGNED_BYTE_32,
				LispObjectFactory.makeCons(LispObjectFactory.makeInteger(this.capacity)));
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.SIMPLE_ARRAY)
			return Lisp.T;
		if (type == BuiltInClass.SIMPLE_ARRAY)
			return Lisp.T;
		return super.typep(type);
	}
}
