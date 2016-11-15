/*
 * SimpleVector.java
 *
 * Copyright (C) 2002-2007 Peter Graves
 * $Id: SimpleVector.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

// "The type of a vector that is not displaced to another array, has no fill
// pointer, is not expressly adjustable and is able to hold elements of any
// type is a subtype of type SIMPLE-VECTOR."
public class SimpleVector extends AbstractSubLVector {
	// ### svref
	// svref simple-vector index => element
	private static Primitive SVREF = new JavaPrimitive("svref", "simple-vector index") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			if (first instanceof SimpleVector) {
				SimpleVector sv = (SimpleVector) first;
				int index = second.intValue();
				try {
					return sv.data[index];
				} catch (ArrayIndexOutOfBoundsException e) {
					int capacity = sv.capacity;
					sv.badIndex(index, capacity);
					// Not reached.
					return Lisp.NIL;
				}
			}
			return Lisp.type_error(first, LispSymbols.SIMPLE_VECTOR);
		}
	};
	// ### svset simple-vector index new-value => new-value
	private static Primitive SVSET = new JavaPrimitive("svset", Lisp.PACKAGE_SYS, true,
			"simple-vector index new-value") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			if (first instanceof SimpleVector) {
				SimpleVector sv = (SimpleVector) first;
				int index = second.intValue();
				try {
					sv.data[index] = third;
					return third;
				} catch (ArrayIndexOutOfBoundsException e) {
					int capacity = sv.capacity;
					sv.badIndex(index, capacity);
					// Not reached.
					return Lisp.NIL;
				}
			}
			return Lisp.type_error(first, LispSymbols.SIMPLE_VECTOR);
		}
	};

	int capacity;

	SubLObject[] data;

	public SimpleVector(int capacity) {
		this.data = LispObjectFactory.makeLispObjectArray(capacity);
		for (int i = capacity; i-- > 0;)
			this.data[i] = Fixnum.ZERO;
		this.capacity = capacity;
	}

	public SimpleVector(SubLObject obj) {
		if (obj.isList()) {
			this.data = obj.copyToArray();
			this.capacity = this.data.length;
		} else if (obj instanceof AbstractVector) {
			this.capacity = obj.cl_length();
			this.data = LispObjectFactory.makeLispObjectArray(this.capacity);
			for (int i = 0; i < this.capacity; i++)
				this.data[i] = obj.elt(i);
		} else
			Debug.assertTrue(false);
	}

	public SimpleVector(SubLObject[] array) {
		this.data = array;
		this.capacity = array.length;
	}

	public AbstractVector adjustArray(int newCapacity, AbstractArray displacedTo, int displacement) {
		return new ComplexVector(newCapacity, displacedTo, displacement);
	}

	public AbstractVector adjustArray(int newCapacity, SubLObject initialElement, SubLObject initialContents)

	{
		if (initialContents != null) {
			SubLObject[] newData = LispObjectFactory.makeLispObjectArray(newCapacity);
			if (initialContents.isList()) {
				SubLObject list = initialContents;
				for (int i = 0; i < newCapacity; i++) {
					newData[i] = list.first();
					list = list.rest();
				}
			} else if (initialContents.isVector())
				for (int i = 0; i < newCapacity; i++)
					newData[i] = initialContents.elt(i);
			else
				Lisp.error(new TypeError(initialContents, LispSymbols.SEQUENCE));
			return LispObjectFactory.makeSimpleVector(newData);
		}
		if (this.capacity != newCapacity) {
			SubLObject[] newData = LispObjectFactory.makeLispObjectArray(newCapacity);
			System.arraycopy(this.data, 0, newData, 0, Math.min(this.capacity, newCapacity));
			if (initialElement != null)
				for (int i = this.capacity; i < newCapacity; i++)
					newData[i] = initialElement;
			return LispObjectFactory.makeSimpleVector(newData);
		}
		// No change.
		return this;
	}

	public SubLObject AREF(int index) {
		try {
			return this.data[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.data.length);
			return Lisp.NIL; // Not reached.
		}
	}

	public SubLObject AREF(SubLObject index) {
		int idx = index.intValue();
		try {
			return this.data[idx];
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(idx, this.data.length);
			return Lisp.NIL; // Not reached.
		}
	}

	public void aset(int index, SubLObject newValue) {
		try {
			this.data[index] = newValue;
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
		return BuiltInClass.SIMPLE_VECTOR;
	}

	public SubLObject deleteEq(SubLObject item) {
		int limit = this.capacity;
		int i = 0;
		int j = 0;
		while (i < limit) {
			SubLObject obj = this.data[i++];
			if (obj != item)
				this.data[j++] = obj;
		}
		if (j < limit)
			this.shrink(j);
		return this;
	}

	public SubLObject deleteEql(SubLObject item) {
		int limit = this.capacity;
		int i = 0;
		int j = 0;
		while (i < limit) {
			SubLObject obj = this.data[i++];
			if (!obj.eql(item))
				this.data[j++] = obj;
		}
		if (j < limit)
			this.shrink(j);
		return this;
	}

	public SubLObject elt(int index) {
		try {
			return this.data[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.capacity);
			return Lisp.NIL; // Not reached.
		}
	}

	public void fillVoid(SubLObject obj) {
		for (int i = this.capacity; i-- > 0;)
			this.data[i] = obj;
	}

	public SubLObject getDescription() {
		StringBuffer sb = new StringBuffer("A simple vector with ");
		sb.append(this.capacity);
		sb.append(" elements");
		return LispObjectFactory.makeString(sb);
	}

	public SubLObject getElementType() {
		return Lisp.T;
	}

	public boolean hasFillPointer() {
		return false;
	}

	public boolean isAdjustable() {
		return false;
	}

	public boolean isSimpleVector() {
		return true;
	}

	public SubLObject nreverse() {
		int i = 0;
		int j = this.capacity - 1;
		while (i < j) {
			SubLObject temp = this.data[i];
			this.data[i] = this.data[j];
			this.data[j] = temp;
			++i;
			--j;
		}
		return this;
	}

	public SubLObject reverse() {
		SimpleVector result = LispObjectFactory.makeSimpleVector(this.capacity);
		int i, j;
		for (i = 0, j = this.capacity - 1; i < this.capacity; i++, j--)
			result.data[i] = this.data[j];
		return result;
	}

	public void shrink(int n) {
		if (n < this.capacity) {
			SubLObject[] newData = LispObjectFactory.makeLispObjectArray(n);
			System.arraycopy(this.data, 0, newData, 0, n);
			this.data = newData;
			this.capacity = n;
			return;
		}
		if (n == this.capacity)
			return;
		Lisp.error(new LispError());
	}

	public SubLObject subseq(int start, int end) {
		SimpleVector v = LispObjectFactory.makeSimpleVector(end - start);
		int i = start, j = 0;
		try {
			while (i < end)
				v.data[j++] = this.data[i++];
			return v;
		} catch (ArrayIndexOutOfBoundsException e) {
			return Lisp.error(new TypeError("Array index out of bounds: " + i + "."));
		}
	}

	public SubLObject SVREF(int index) {
		try {
			return this.data[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.data.length);
			return Lisp.NIL; // Not reached.
		}
	}

	public void svset(int index, SubLObject newValue) {
		try {
			this.data[index] = newValue;
		} catch (ArrayIndexOutOfBoundsException e) {
			this.badIndex(index, this.capacity);
		}
	}

	public SubLObject typeOf() {
		return Lisp.list(LispSymbols.SIMPLE_VECTOR, LispObjectFactory.makeInteger(this.capacity));
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.SIMPLE_VECTOR)
			return Lisp.T;
		if (type == LispSymbols.SIMPLE_ARRAY)
			return Lisp.T;
		if (type == BuiltInClass.SIMPLE_VECTOR)
			return Lisp.T;
		if (type == BuiltInClass.SIMPLE_ARRAY)
			return Lisp.T;
		return super.typep(type);
	}
}
