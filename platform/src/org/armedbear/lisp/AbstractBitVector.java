/*
 * AbstractBitVector.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: AbstractBitVector.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;

public abstract class AbstractBitVector extends AbstractSubLVector {
	protected static int LONG_MASK = 0x3f;

	protected int capacity;

	// For non-displaced bit-vectors.
	protected long[] bits;

	// Ignores fill pointer.

	public SubLObject AREF(SubLObject index) {
		return this.AREF(index.intValue());
	}

	public int capacity() {
		return this.capacity;
	}

	public SubLObject classOf() {
		return BuiltInClass.BIT_VECTOR;
	}

	protected abstract void clearBit(int index);

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof AbstractBitVector) {
			AbstractBitVector v = (AbstractBitVector) obj;
			if (this.cl_length() != v.cl_length())
				return false;
			for (int i = this.cl_length(); i-- > 0;)
				if (this.getBit(i) != v.getBit(i))
					return false;
			return true;
		}
		return false;
	}

	public boolean equalp(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj instanceof AbstractBitVector) {
			AbstractBitVector v = (AbstractBitVector) obj;
			if (this.cl_length() != v.cl_length())
				return false;
			for (int i = this.cl_length(); i-- > 0;)
				if (this.getBit(i) != v.getBit(i))
					return false;
			return true;
		}
		if (obj instanceof SubLString)
			return false;
		if (obj instanceof AbstractVector)
			return ((AbstractVector) obj).equalp(this);
		return false;
	}

	public void fillVoid(SubLObject obj) {
		if (obj instanceof Fixnum)
			switch (((Fixnum) obj).value) {
			case 0:
				if (this.bits != null)
					for (int i = this.bits.length; i-- > 0;)
						this.bits[i] = 0;
				else
					for (int i = this.capacity; i-- > 0;)
						this.clearBit(i);
				return;
			case 1:
				if (this.bits != null)
					for (int i = this.bits.length; i-- > 0;)
						this.bits[i] = -1L;
				else
					for (int i = this.capacity; i-- > 0;)
						this.setBit(i);
				return;
			}
		// Fall through...
		Lisp.error(new TypeError(obj, LispSymbols.BIT));
	}

	protected abstract int getBit(int index);

	public SubLObject getElementType() {
		return LispSymbols.BIT;
	}

	public int hashCodeLisp() {
		int hashCode = 1;
		// Consider first 64 bits only.
		int limit = Math.min(this.cl_length(), 64);
		for (int i = 0; i < limit; i++)
			hashCode = hashCode * 31 + this.getBit(i);
		return hashCode;
	}

	public SubLObject reverse() {
		int length = this.cl_length();
		SimpleBitVector result = new SimpleBitVector(length);
		int i, j;
		for (i = 0, j = length - 1; i < length; i++, j--)
			if (this.getBit(j) == 1)
				result.setBit(i);
			else
				result.clearBit(i);
		return result;
	}

	protected abstract void setBit(int index);

	public SubLObject subseq(int start, int end) {
		SimpleBitVector v = new SimpleBitVector(end - start);
		int i = start, j = 0;
		try {
			while (i < end)
				if (this.getBit(i++) == 0)
					v.clearBit(j++);
				else
					v.setBit(j++);
			return v;
		} catch (ArrayIndexOutOfBoundsException e) {
			return Lisp.error(new TypeError("Array index out of bounds: " + i + "."));
		}
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.BIT_VECTOR)
			return Lisp.T;
		if (type == BuiltInClass.BIT_VECTOR)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		LispThread thread = LispThread.currentThread();
		int length = this.cl_length();
		if (LispSymbols.PRINT_READABLY.symbolValue(thread) != Lisp.NIL
				|| LispSymbols.PRINT_ARRAY.symbolValue(thread) != Lisp.NIL) {
			StringBuilder sb = new StringBuilder(length + 2);
			sb.append("#*");
			for (int i = 0; i < length; i++)
				sb.append(this.getBit(i) == 1 ? '1' : '0');
			return sb.toString();
		} else {
			String str = "(%sBIT-VECTOR %d)";
			String pre = this instanceof SimpleBitVector ? "SIMPLE-" : "";
			return this.unreadableString(String.format(str, pre, length));
		}
	}
}
