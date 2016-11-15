/*
 * AbstractVector.java
 *
 * Copyright (C) 2003-2006 Peter Graves
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

public abstract class AbstractSubLVector extends AbstractSubLArray implements AbstractVector {

	public abstract AbstractArray adjustArray(int size, AbstractArray displacedTo, int displacement);

	public abstract AbstractArray adjustArray(int size, SubLObject initialElement, SubLObject initialContents);

	public AbstractArray adjustArray(int[] dims, AbstractArray displacedTo, int displacement) {
		return this.adjustArray(dims[0], displacedTo, displacement);
	}

	public AbstractArray adjustArray(int[] dims, SubLObject initialElement, SubLObject initialContents) {
		return this.adjustArray(dims[0], initialElement, initialContents);
	}

	protected void badIndex(int index, int limit) {
		StringBuilder sb = new StringBuilder("Invalid array index ");
		sb.append(index);
		sb.append(" for ");
		sb.append(this.writeToString());
		if (limit > 0) {
			sb.append(" (should be >= 0 and < ");
			sb.append(limit);
			sb.append(").");
		}
		Lisp.error(new TypeError(sb.toString(), LispObjectFactory.makeInteger(index),
				Lisp.list(LispSymbols.INTEGER, Fixnum.ZERO, LispObjectFactory.makeInteger(limit - 1))));

	}

	public abstract int capacity();

	public int checkIndex(int index) {
		if (index < 0 || index >= this.capacity())
			this.badIndex(index, this.capacity());
		return index;
	}

	public SubLObject deleteEq(SubLObject item) {
		int limit = this.cl_length();
		int i = 0;
		int j = 0;
		while (i < limit) {
			SubLObject obj = this.AREF(i++);
			if (obj != item)
				this.aset(j++, obj);
		}
		int newLength = j;
		if (newLength < this.capacity())
			this.shrink(newLength);
		return this;
	}

	public SubLObject deleteEql(SubLObject item) {
		int limit = this.cl_length();
		int i = 0;
		int j = 0;
		while (i < limit) {
			SubLObject obj = this.AREF(i++);
			if (!obj.eql(item))
				this.aset(j++, obj);
		}
		int newLength = j;
		if (newLength < this.capacity())
			this.shrink(newLength);
		return this;
	}

	public boolean equalp(SubLObject obj) {
		if (obj instanceof AbstractVector) {
			if (this.cl_length() != obj.cl_length())
				return false;
			AbstractVector v = (AbstractVector) obj;
			for (int i = this.cl_length(); i-- > 0;)
				if (!this.AREF(i).equalp(v.AREF(i)))
					return false;
			return true;
		}
		return false;
	}

	public int getDimension(int n) {
		if (n != 0) {
			Lisp.error(new TypeError("bad dimension for vector"));
			// Not reached.
			return 0;
		}
		return this.capacity();
	}

	public SubLObject getDimensions() {
		return LispObjectFactory.makeCons(LispObjectFactory.makeInteger(this.capacity()));
	}

	public int getRank() {
		return 1;
	}

	public int getTotalSize() {
		return this.capacity();
	}

	public boolean isSimpleVector() {
		return false;
	}

	public boolean isVector() {
		return true;
	}

	public SubLObject nreverse() {
		int i = 0;
		int j = this.cl_length() - 1;
		while (i < j) {
			SubLObject temp = this.AREF(i);
			this.aset(i, this.AREF(j));
			this.aset(j, temp);
			++i;
			--j;
		}
		return this;
	}

	// For EQUALP hash tables.

	public int psxhash() {
		int length = this.cl_length();
		int limit = length < 4 ? length : 4;
		long result = 48920713; // Chosen at random.
		for (int i = 0; i < limit; i++)
			result = Lisp.mix(result, this.AREF(i).psxhash());
		return (int) (result & 0x7fffffff);
	}

	public abstract SubLObject reverse();

	public void setFillPointer(int n) {
		this.noFillPointer();
	}

	public void setFillPointer(SubLObject obj) {
		this.noFillPointer();
	}

	public abstract void shrink(int n);

	public abstract SubLObject subseq(int start, int end);

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.VECTOR)
			return Lisp.T;
		if (type == BuiltInClass.VECTOR)
			return Lisp.T;
		if (type == LispSymbols.SEQUENCE)
			return Lisp.T;
		if (type == BuiltInClass.SEQUENCE)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString() {
		LispThread thread = LispThread.currentThread();
		if (LispSymbols.PRINT_READABLY.symbolValue(thread) != Lisp.NIL) {
			StringBuilder sb = new StringBuilder("#(");
			int limit = this.cl_length();
			for (int i = 0; i < limit; i++) {
				if (i > 0)
					sb.append(' ');
				sb.append(this.AREF(i).writeToString());
			}
			sb.append(')');
			return sb.toString();
		} else if (LispSymbols.PRINT_ARRAY.symbolValue(thread) != Lisp.NIL) {
			int maxLevel = Integer.MAX_VALUE;
			SubLObject printLevel = LispSymbols.PRINT_LEVEL.symbolValue(thread);
			if (printLevel instanceof Fixnum)
				maxLevel = ((Fixnum) printLevel).value;
			SubLObject currentPrintLevel = Lisp._CURRENT_PRINT_LEVEL_.symbolValue(thread);
			int currentLevel = currentPrintLevel.intValue();
			if (currentLevel < maxLevel) {
				StringBuffer sb = new StringBuffer("#(");
				int maxLength = Integer.MAX_VALUE;
				SubLObject printLength = LispSymbols.PRINT_LENGTH.symbolValue(thread);
				if (printLength instanceof Fixnum)
					maxLength = ((Fixnum) printLength).value;
				int length = this.cl_length();
				int limit = Math.min(length, maxLength);
				SpecialBindingsMark mark = thread.markSpecialBindings();
				thread.bindSpecial(Lisp._CURRENT_PRINT_LEVEL_, currentPrintLevel.inc());
				try {
					for (int i = 0; i < limit; i++) {
						if (i > 0)
							sb.append(' ');
						sb.append(this.AREF(i).writeToString());
					}
				} finally {
					thread.resetSpecialBindings(mark);
				}
				if (limit < length)
					sb.append(limit > 0 ? " ..." : "...");
				sb.append(')');
				return sb.toString();
			} else
				return "#";
		} else {
			StringBuffer sb = new StringBuffer();
			sb.append(this.isSimpleVector() ? "SIMPLE-VECTOR " : "VECTOR ");
			sb.append(this.capacity());
			return this.unreadableString(sb.toString());
		}
	}
}
