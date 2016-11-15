/*
 * SimpleBitVector.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: SimpleBitVector.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

// "The type of a bit vector that is not displaced to another array, has no
// fill pointer, and is not expressly adjustable is a subtype of type SIMPLE-
// BIT-VECTOR."
public class SimpleBitVector extends AbstractBitVector {
	public SimpleBitVector(int capacity) {
		this.capacity = capacity;
		int size = capacity >>> 6; // 64 bits in a long
		// If the capacity is not an integral multiple of 64, we'll need one
		// more long.
		if ((capacity & AbstractBitVector.LONG_MASK) != 0)
			++size;
		this.bits = new long[size];
	}

	public SimpleBitVector(String s) {
		this(s.length());
		for (int i = this.capacity; i-- > 0;) {
			char c = s.charAt(i);
			if (c == '0') {
			} else if (c == '1')
				this.setBit(i);
			else
				Debug.assertTrue(false);
		}
	}

	public AbstractVector adjustArray(int newCapacity, AbstractArray displacedTo, int displacement)

	{
		return new ComplexBitVector(newCapacity, displacedTo, displacement);
	}

	public AbstractVector adjustArray(int newCapacity, SubLObject initialElement, SubLObject initialContents)

	{
		if (initialContents != null) {
			SimpleBitVector v = new SimpleBitVector(newCapacity);
			if (initialContents.isList()) {
				SubLObject list = initialContents;
				for (int i = 0; i < newCapacity; i++) {
					v.aset(i, list.first());
					list = list.rest();
				}
			} else if (initialContents.isVector())
				for (int i = 0; i < newCapacity; i++)
					v.aset(i, initialContents.elt(i));
			else
				Lisp.error(new TypeError(initialContents, LispSymbols.SEQUENCE));
			return v;
		}
		if (this.capacity != newCapacity) {
			SimpleBitVector v = new SimpleBitVector(newCapacity);
			int limit = Math.min(this.capacity, newCapacity);
			for (int i = limit; i-- > 0;)
				if (this.getBit(i) == 1)
					v.setBit(i);
				else
					v.clearBit(i);
			if (initialElement != null && this.capacity < newCapacity) {
				int n = initialElement.intValue();
				if (n == 1)
					for (int i = this.capacity; i < newCapacity; i++)
						v.setBit(i);
				else
					for (int i = this.capacity; i < newCapacity; i++)
						v.clearBit(i);
			}
			return v;
		}
		// No change.
		return this;
	}

	SimpleBitVector and(SimpleBitVector v, SimpleBitVector result) {
		if (result == null)
			result = new SimpleBitVector(this.capacity);
		for (int i = this.bits.length; i-- > 0;)
			result.bits[i] = this.bits[i] & v.bits[i];
		return result;
	}

	SimpleBitVector andc1(SimpleBitVector v, SimpleBitVector result) {
		if (result == null)
			result = new SimpleBitVector(this.capacity);
		for (int i = this.bits.length; i-- > 0;)
			result.bits[i] = ~this.bits[i] & v.bits[i];
		return result;
	}

	SimpleBitVector andc2(SimpleBitVector v, SimpleBitVector result) {
		if (result == null)
			result = new SimpleBitVector(this.capacity);
		for (int i = this.bits.length; i-- > 0;)
			result.bits[i] = this.bits[i] & ~v.bits[i];
		return result;
	}

	public SubLObject AREF(int index) {
		if (index < 0 || index >= this.capacity)
			this.badIndex(index, this.capacity);
		int offset = index >> 6;
		return (this.bits[offset] & 1L << (index & AbstractBitVector.LONG_MASK)) != 0 ? Fixnum.ONE : Fixnum.ZERO;
	}

	public void aset(int index, SubLObject newValue) {
		if (index < 0 || index >= this.capacity)
			this.badIndex(index, this.capacity);
		int offset = index >> 6;
		if (newValue instanceof Fixnum)
			switch (((Fixnum) newValue).value) {
			case 0:
				this.bits[offset] &= ~(1L << (index & AbstractBitVector.LONG_MASK));
				return;
			case 1:
				this.bits[offset] |= 1L << (index & AbstractBitVector.LONG_MASK);
				return;
			}
		// Fall through...
		Lisp.type_error(newValue, LispSymbols.BIT);
	}

	public int cl_length() {
		return this.capacity;
	}

	public SubLObject classOf() {
		return BuiltInClass.SIMPLE_BIT_VECTOR;
	}

	protected void clearBit(int index) {
		int offset = index >> 6;
		this.bits[offset] &= ~(1L << (index & AbstractBitVector.LONG_MASK));
	}

	public SubLObject elt(int index) {
		if (index < 0 || index >= this.cl_length())
			this.badIndex(index, this.cl_length());
		int offset = index >> 6; // Divide by 64.
		return (this.bits[offset] & 1L << (index & AbstractBitVector.LONG_MASK)) != 0 ? Fixnum.ONE : Fixnum.ZERO;
	}

	SimpleBitVector eqv(SimpleBitVector v, SimpleBitVector result) {
		if (result == null)
			result = new SimpleBitVector(this.capacity);
		for (int i = this.bits.length; i-- > 0;)
			result.bits[i] = ~(this.bits[i] ^ v.bits[i]);
		return result;
	}

	protected int getBit(int index) {
		int offset = index >> 6;
		return (this.bits[offset] & 1L << (index & AbstractBitVector.LONG_MASK)) != 0 ? 1 : 0;
	}

	public boolean hasFillPointer() {
		return false;
	}

	SimpleBitVector ior(SimpleBitVector v, SimpleBitVector result) {
		if (result == null)
			result = new SimpleBitVector(this.capacity);
		for (int i = this.bits.length; i-- > 0;)
			result.bits[i] = this.bits[i] | v.bits[i];
		return result;
	}

	public boolean isAdjustable() {
		return false;
	}

	public boolean isSimpleVector() {
		return true;
	}

	SimpleBitVector nand(SimpleBitVector v, SimpleBitVector result) {
		if (result == null)
			result = new SimpleBitVector(this.capacity);
		for (int i = this.bits.length; i-- > 0;)
			result.bits[i] = ~(this.bits[i] & v.bits[i]);
		return result;
	}

	SimpleBitVector nor(SimpleBitVector v, SimpleBitVector result) {
		if (result == null)
			result = new SimpleBitVector(this.capacity);
		for (int i = this.bits.length; i-- > 0;)
			result.bits[i] = ~(this.bits[i] | v.bits[i]);
		return result;
	}

	SimpleBitVector orc1(SimpleBitVector v, SimpleBitVector result) {
		if (result == null)
			result = new SimpleBitVector(this.capacity);
		for (int i = this.bits.length; i-- > 0;)
			result.bits[i] = ~this.bits[i] | v.bits[i];
		return result;
	}

	SimpleBitVector orc2(SimpleBitVector v, SimpleBitVector result) {
		if (result == null)
			result = new SimpleBitVector(this.capacity);
		for (int i = this.bits.length; i-- > 0;)
			result.bits[i] = this.bits[i] | ~v.bits[i];
		return result;
	}

	protected void setBit(int index) {
		int offset = index >> 6;
		this.bits[offset] |= 1L << (index & AbstractBitVector.LONG_MASK);
	}

	public void shrink(int n) {
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
		Lisp.error(new LispError());
	}

	public SubLObject typeOf() {
		return Lisp.list(LispSymbols.SIMPLE_BIT_VECTOR, LispObjectFactory.makeInteger(this.capacity));
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.SIMPLE_BIT_VECTOR)
			return Lisp.T;
		if (type == LispSymbols.SIMPLE_ARRAY)
			return Lisp.T;
		if (type == BuiltInClass.SIMPLE_BIT_VECTOR)
			return Lisp.T;
		if (type == BuiltInClass.SIMPLE_ARRAY)
			return Lisp.T;
		return super.typep(type);
	}

	SimpleBitVector xor(SimpleBitVector v, SimpleBitVector result) {
		if (result == null)
			result = new SimpleBitVector(this.capacity);
		for (int i = this.bits.length; i-- > 0;)
			result.bits[i] = this.bits[i] ^ v.bits[i];
		return result;
	}
}
