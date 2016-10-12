/*
 * ComplexVector.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: ComplexVector.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

// A vector that is displaced to another array, has a fill pointer, and/or is
// expressly adjustable. It can hold elements of any type.
public class ComplexVector extends AbstractSubLVector {
	private int capacity;
	private int fillPointer = -1; // -1 indicates no fill pointer.
	private boolean isDisplaced;

	// For non-displaced arrays.
	private SubLObject[] elements;

	// For displaced arrays.
	private AbstractArray array;
	private int displacement;

	public ComplexVector(int capacity) {
		this.elements = LispObjectFactory.makeLispObjectArray(capacity);
		for (int i = capacity; i-- > 0;)
			this.elements[i] = Fixnum.ZERO;
		this.capacity = capacity;
	}

	public ComplexVector(int capacity, AbstractArray array, int displacement) {
		this.capacity = capacity;
		this.array = array;
		this.displacement = displacement;
		this.isDisplaced = true;
	}

	public AbstractVector adjustArray(int newCapacity, AbstractArray displacedTo, int displacement)

	{
		this.capacity = newCapacity;
		this.array = displacedTo;
		this.displacement = displacement;
		this.elements = null;
		this.isDisplaced = true;
		return this;
	}

	public AbstractVector adjustArray(int newCapacity, SubLObject initialElement, SubLObject initialContents)

	{
		if (initialContents != null) {
			// "If INITIAL-CONTENTS is supplied, it is treated as for MAKE-
			// ARRAY. In this case none of the original contents of array
			// appears in the resulting array."
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
				Lisp.error(new TypeError(initialContents, LispSymbols.SEQUENCE));
			this.elements = newElements;
		} else {
			if (this.elements == null) {
				// Displaced array. Copy existing elements.
				this.elements = LispObjectFactory.makeLispObjectArray(newCapacity);
				int limit = Math.min(this.capacity, newCapacity);
				for (int i = 0; i < limit; i++)
					this.elements[i] = this.array.AREF(this.displacement + i);
			} else if (this.capacity != newCapacity) {
				SubLObject[] newElements = LispObjectFactory.makeLispObjectArray(newCapacity);
				System.arraycopy(this.elements, 0, newElements, 0, Math.min(this.capacity, newCapacity));
				this.elements = newElements;
			}
			// Initialize new elements (if any).
			if (initialElement != null)
				for (int i = this.capacity; i < newCapacity; i++)
					this.elements[i] = initialElement;
		}
		this.capacity = newCapacity;
		this.array = null;
		this.displacement = 0;
		this.isDisplaced = false;
		return this;
	}

	// Ignores fill pointer.

	public SubLObject AREF(int index) {
		if (this.elements != null)
			try {
				return this.elements[index];
			} catch (ArrayIndexOutOfBoundsException e) {
				this.badIndex(index, this.elements.length);
				return Lisp.NIL; // Not reached.
			}
		else {
			// Displaced array.
			if (index < 0 || index >= this.capacity)
				this.badIndex(index, this.capacity);
			return this.array.AREF(index + this.displacement);
		}
	}

	// Ignores fill pointer.
	// FIXME inline

	public SubLObject AREF(SubLObject index) {
		return this.AREF(index.intValue());
	}

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
		if (this.elements != null)
			try {
				this.elements[index] = newValue;
			} catch (ArrayIndexOutOfBoundsException e) {
				this.badIndex(index, this.elements.length);
			}
		else // Displaced array.
		if (index < 0 || index >= this.capacity)
			this.badIndex(index, this.capacity);
		else
			this.array.aset(index + this.displacement, newValue);
	}

	public int capacity() {
		return this.capacity;
	}

	public int cl_length() {
		return this.fillPointer >= 0 ? this.fillPointer : this.capacity;
	}

	public SubLObject classOf() {
		return BuiltInClass.VECTOR;
	}

	public SubLObject elt(int index) {
		int limit = this.cl_length();
		if (index < 0 || index >= limit)
			this.badIndex(index, limit);
		return this.AREF(index);
	}

	private void ensureCapacity(int minCapacity) {
		if (this.elements != null) {
			if (this.capacity < minCapacity) {
				SubLObject[] newArray = LispObjectFactory.makeLispObjectArray(minCapacity);
				System.arraycopy(this.elements, 0, newArray, 0, this.capacity);
				this.elements = newArray;
				this.capacity = minCapacity;
			}
		} else {
			// Displaced array.
			Debug.assertTrue(this.array != null);
			if (this.capacity < minCapacity || this.array.getTotalSize() - this.displacement < minCapacity) {
				// Copy array.
				this.elements = LispObjectFactory.makeLispObjectArray(minCapacity);
				int limit = Math.min(this.capacity, this.array.getTotalSize() - this.displacement);
				for (int i = 0; i < limit; i++)
					this.elements[i] = this.array.AREF(this.displacement + i);
				this.capacity = minCapacity;
				this.array = null;
				this.displacement = 0;
				this.isDisplaced = false;
			}
		}
	}

	public void fillVoid(SubLObject obj) {
		for (int i = this.capacity; i-- > 0;)
			this.elements[i] = obj;
	}

	public SubLObject getElementType() {
		return Lisp.T;
	}

	public int getFillPointer() {
		return this.fillPointer;
	}

	public boolean hasFillPointer() {
		return this.fillPointer >= 0;
	}

	public boolean isDisplaced() {
		return this.isDisplaced;
	}

	public boolean isSimpleVector() {
		return false;
	}

	public SubLObject nreverse() {
		if (this.elements != null) {
			int i = 0;
			int j = this.cl_length() - 1;
			while (i < j) {
				SubLObject temp = this.elements[i];
				this.elements[i] = this.elements[j];
				this.elements[j] = temp;
				++i;
				--j;
			}
		} else {
			// Displaced array.
			int length = this.cl_length();
			SubLObject[] data = LispObjectFactory.makeLispObjectArray(length);
			int i, j;
			for (i = 0, j = length - 1; i < length; i++, j--)
				data[i] = this.AREF(j);
			this.elements = data;
			this.capacity = length;
			this.array = null;
			this.displacement = 0;
			this.isDisplaced = false;
			this.fillPointer = -1;
		}
		return this;
	}

	public SubLObject reverse() {
		int length = this.cl_length();
		SimpleVector result = LispObjectFactory.makeSimpleVector(length);
		int i, j;
		for (i = 0, j = length - 1; i < length; i++, j--)
			result.aset(i, this.AREF(j));
		return result;
	}

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

	public void shrink(int n) {
		if (this.elements != null) {
			if (n < this.elements.length) {
				SubLObject[] newArray = LispObjectFactory.makeLispObjectArray(n);
				System.arraycopy(this.elements, 0, newArray, 0, n);
				this.elements = newArray;
				this.capacity = n;
				return;
			}
			if (n == this.elements.length)
				return;
		}
		Lisp.error(new LispError());
	}

	public SubLObject subseq(int start, int end) {
		SimpleVector v = LispObjectFactory.makeSimpleVector(end - start);
		int i = start, j = 0;
		try {
			while (i < end)
				v.aset(j++, this.AREF(i++));
			return v;
		} catch (ArrayIndexOutOfBoundsException e) {
			return Lisp.error(new TypeError("Array index out of bounds: " + i + "."));
		}
	}

	public SubLObject typeOf() {
		return Lisp.list(LispSymbols.VECTOR, Lisp.T, LispObjectFactory.makeInteger(this.capacity));
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
		if (this.fillPointer >= this.capacity) {
			// Need to extend vector.
			ext = Math.max(ext, this.capacity + 1);
			this.ensureCapacity(this.capacity + ext);
		}
		this.aset(this.fillPointer, element);
		return LispObjectFactory.makeInteger(this.fillPointer++);
	}

	public void vectorPushExtend(SubLObject element)

	{
		if (this.fillPointer < 0)
			this.noFillPointer();
		if (this.fillPointer >= this.capacity)
			// Need to extend vector.
			this.ensureCapacity(this.capacity * 2 + 1);
		this.aset(this.fillPointer++, element);
	}
}
