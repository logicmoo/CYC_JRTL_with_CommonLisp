/*
 * ComplexBitVector.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: ComplexBitVector.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

public class ComplexBitVector extends AbstractBitVector {
	private int fillPointer = -1; // -1 indicates no fill pointer.
	private boolean isDisplaced;

	// For displaced bit vectors.
	private AbstractArray array;
	private int displacement;

	public ComplexBitVector(int capacity) {
		this.capacity = capacity;
		int size = capacity >>> 6;
		if ((capacity & AbstractBitVector.LONG_MASK) != 0)
			++size;
		this.bits = new long[size];
	}

	public ComplexBitVector(int capacity, AbstractArray array, int displacement) {
		this.capacity = capacity;
		this.array = array;
		this.displacement = displacement;
		this.isDisplaced = true;
	}

	public AbstractVector adjustArray(int size, AbstractArray displacedTo, int displacement)

	{
		this.capacity = size;
		this.array = displacedTo;
		this.displacement = displacement;
		this.bits = null;
		this.isDisplaced = true;
		return this;
	}

	public AbstractVector adjustArray(int newCapacity, SubLObject initialElement, SubLObject initialContents)

	{
		if (this.bits == null) {
			// Copy array.
			int size = this.capacity >>> 6;
			if ((this.capacity & AbstractBitVector.LONG_MASK) != 0)
				++size;
			this.bits = new long[size];
			for (int i = 0; i < this.capacity; i++) {
				int n = this.array.AREF(this.displacement + i).intValue();
				if (n == 1)
					this.setBit(i);
				else
					this.clearBit(i);
			}
			this.array = null;
			this.displacement = 0;
			this.isDisplaced = false;
		}
		if (this.capacity != newCapacity) {
			int size = newCapacity >>> 6;
			if ((newCapacity & AbstractBitVector.LONG_MASK) != 0)
				++size;
			if (initialContents != null) {
				this.bits = new long[size];
				this.capacity = newCapacity;
				if (initialContents.isList()) {
					SubLObject list = initialContents;
					for (int i = 0; i < newCapacity; i++) {
						this.aset(i, list.first());
						list = list.rest();
					}
				} else if (initialContents.isVector())
					for (int i = 0; i < newCapacity; i++)
						this.aset(i, initialContents.elt(i));
				else
					Lisp.type_error(initialContents, LispSymbols.SEQUENCE);
			} else {
				long[] newBits = new long[size];
				System.arraycopy(this.bits, 0, newBits, 0, Math.min(this.bits.length, newBits.length));
				this.bits = newBits;
				if (newCapacity > this.capacity && initialElement != null) {
					int n = initialElement.intValue();
					if (n == 1)
						for (int i = this.capacity; i < newCapacity; i++)
							this.setBit(i);
					else
						for (int i = this.capacity; i < newCapacity; i++)
							this.clearBit(i);
				}
			}
			this.capacity = newCapacity;
		}
		return this;
	}

	public SubLObject AREF(int index) {
		if (index < 0 || index >= this.capacity)
			this.badIndex(index, this.capacity);
		if (this.bits != null) {
			int offset = index >> 6;
			return (this.bits[offset] & 1L << index) != 0 ? Fixnum.ONE : Fixnum.ZERO;
		} else
			// Displaced bit vector.
			return this.array.AREF(index + this.displacement);
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
		if (index < 0 || index >= this.capacity)
			this.badIndex(index, this.capacity);
		if (newValue instanceof Fixnum)
			switch (((Fixnum) newValue).value) {
			case 0:
				if (this.bits != null) {
					int offset = index >> 6;
					this.bits[offset] &= ~(1L << index);
				} else
					this.clearBit(index);
				return;
			case 1:
				if (this.bits != null) {
					int offset = index >> 6;
					this.bits[offset] |= 1L << index;
				} else
					this.setBit(index);
				return;
			}
		// Fall through...
		Lisp.type_error(newValue, LispSymbols.BIT);
	}

	public int cl_length() {
		return this.fillPointer >= 0 ? this.fillPointer : this.capacity;
	}

	protected void clearBit(int index) {
		if (this.bits != null) {
			int offset = index >> 6;
			this.bits[offset] &= ~(1L << index);
		} else
			this.array.aset(index + this.displacement, Fixnum.ZERO);
	}

	public SubLObject elt(int index) {
		if (index >= this.cl_length())
			this.badIndex(index, this.cl_length());
		return this.AREF(index);
	}

	private void ensureCapacity(int minCapacity) {
		if (this.bits != null) {
			if (this.capacity < minCapacity) {
				int size = minCapacity >>> 6;
				if ((minCapacity & AbstractBitVector.LONG_MASK) != 0)
					++size;
				long[] newBits = new long[size];
				System.arraycopy(this.bits, 0, newBits, 0, this.bits.length);
				this.bits = newBits;
				this.capacity = minCapacity;
			}
		} else {
			Debug.assertTrue(this.array != null);
			if (this.capacity < minCapacity || this.array.getTotalSize() - this.displacement < minCapacity) {
				// Copy array.
				int size = minCapacity >>> 6;
				if ((minCapacity & AbstractBitVector.LONG_MASK) != 0)
					++size;
				this.bits = new long[size];
				int limit = Math.min(this.capacity, this.array.getTotalSize() - this.displacement);
				for (int i = 0; i < limit; i++) {
					int n = this.array.AREF(this.displacement + i).intValue();
					if (n == 1)
						this.setBit(i);
					else
						this.clearBit(i);
				}
				this.capacity = minCapacity;
				this.array = null;
				this.displacement = 0;
				this.isDisplaced = false;
			}
		}
	}

	protected int getBit(int index) {
		if (this.bits != null) {
			int offset = index >> 6;
			return (this.bits[offset] & 1L << index) != 0 ? 1 : 0;
		} else
			return this.array.AREF(index + this.displacement).intValue();
		// if (obj instanceof Fixnum) return ((Fixnum)obj).value;
		// type_error(obj, LispSymbols.FIXNUM);
		// // Not reached.
		// return 0;
	}

	public int getFillPointer() {
		return this.fillPointer;
	}

	public boolean hasFillPointer() {
		return this.fillPointer >= 0;
	}

	public boolean isSimpleVector() {
		return false;
	}

	protected void setBit(int index) {
		if (this.bits != null) {
			int offset = index >> 6;
			this.bits[offset] |= 1L << index;
		} else
			this.array.aset(index + this.displacement, Fixnum.ONE);
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
		if (this.bits != null) {
			if (n < this.capacity) {
				int size = n >>> 6;
				if ((n & AbstractBitVector.LONG_MASK) != 0)
					++size;
				if (size < this.bits.length) {
					long[] newbits = new long[size];
					System.arraycopy(this.bits, 0, newbits, 0, size);
					this.bits = newbits;
				}
				this.capacity = n;
				return;
			}
			if (n == this.capacity)
				return;
		}
		Lisp.error(new LispError());
	}

	public SubLObject typeOf() {
		return Lisp.list(LispSymbols.BIT_VECTOR, LispObjectFactory.makeInteger(this.capacity));
	}

	// FIXME

	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element)

	{
		this.vectorPushExtend(element);
		return LispObjectFactory.makeInteger(this.getFillPointer() - 1);
	}

	// FIXME

	public SubLObject VECTOR_PUSH_EXTEND(SubLObject element, SubLObject extension)

	{
		int ext = extension.intValue();
		int fp = this.getFillPointer();
		if (fp < 0)
			this.noFillPointer();
		if (fp >= this.capacity()) {
			// Need to extend vector.
			ext = Math.max(ext, this.capacity() + 1);
			this.ensureCapacity(this.capacity() + ext);
		}
		this.aset(fp, element);
		this.setFillPointer(fp + 1);
		return LispObjectFactory.makeInteger(fp);
	}

	// FIXME

	public void vectorPushExtend(SubLObject element) {
		int fp = this.getFillPointer();
		if (fp < 0)
			this.noFillPointer();
		if (fp >= this.capacity())
			// Need to extend vector.
			this.ensureCapacity(this.capacity() * 2 + 1);
		this.aset(fp, element);
		this.setFillPointer(fp + 1);
	}
}
