/*
 * SimpleArray_UnsignedByte32.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: SimpleArray_UnsignedByte32.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

public class SimpleArray_UnsignedByte32 extends AbstractSimpleArray {
	// Copy a1 to a2 for index tuples that are valid for both arrays.
	static void copyArray(AbstractArray a1, AbstractArray a2)

	{
		Debug.assertTrue(a1.getRank() == a2.getRank());
		int[] subscripts = new int[a1.getRank()];
		int axis = 0;
		SimpleArray_UnsignedByte32.copySubArray(a1, a2, subscripts, axis);
	}

	private static void copySubArray(AbstractArray a1, AbstractArray a2, int[] subscripts, int axis)

	{
		if (axis < subscripts.length) {
			int limit = Math.min(a1.getDimension(axis), a2.getDimension(axis));
			for (int i = 0; i < limit; i++) {
				subscripts[axis] = i;
				SimpleArray_UnsignedByte32.copySubArray(a1, a2, subscripts, axis + 1);
			}
		} else {
			int i1 = a1.getRowMajorIndex(subscripts);
			int i2 = a2.getRowMajorIndex(subscripts);
			a2.aset(i2, a1.AREF(i1));
		}
	}

	private int[] dimv;

	private int totalSize;

	// FIXME We should really use an array of unboxed values!
	SubLObject[] data;

	public SimpleArray_UnsignedByte32(int rank, SubLObject initialContents)

	{
		if (rank < 2)
			Debug.assertTrue(false);
		this.dimv = new int[rank];
		SubLObject rest = initialContents;
		for (int i = 0; i < rank; i++) {
			this.dimv[i] = rest.cl_length();
			if (rest == Lisp.NIL || rest.cl_length() == 0)
				break;
			rest = rest.elt(0);
		}
		this.totalSize = AbstractSubLArray.computeTotalSize(this.dimv);
		this.data = LispObjectFactory.makeLispObjectArray(this.totalSize);
		this.setInitialContents(0, this.dimv, initialContents, 0);
	}

	public SimpleArray_UnsignedByte32(int[] dimv) {
		this.dimv = dimv;
		this.totalSize = AbstractSubLArray.computeTotalSize(dimv);
		this.data = LispObjectFactory.makeLispObjectArray(this.totalSize);
		for (int i = this.totalSize; i-- > 0;)
			this.data[i] = Fixnum.ZERO;
	}

	public SimpleArray_UnsignedByte32(int[] dimv, SubLObject initialContents)

	{
		this.dimv = dimv;
		int rank = dimv.length;
		SubLObject rest = initialContents;
		for (int i = 0; i < rank; i++) {
			dimv[i] = rest.cl_length();
			rest = rest.elt(0);
		}
		this.totalSize = AbstractSubLArray.computeTotalSize(dimv);
		this.data = LispObjectFactory.makeLispObjectArray(this.totalSize);
		this.setInitialContents(0, dimv, initialContents, 0);
	}

	public AbstractArray adjustArray(int[] dimv, AbstractArray displacedTo, int displacement) {
		return new ComplexArray(dimv, displacedTo, displacement);
	}

	public AbstractArray adjustArray(int[] dimv, SubLObject initialElement, SubLObject initialContents)

	{
		if (initialContents != null)
			return new SimpleArray_UnsignedByte32(dimv, initialContents);
		for (int i = 0; i < dimv.length; i++)
			if (dimv[i] != this.dimv[i]) {
				SimpleArray_UnsignedByte32 newArray = new SimpleArray_UnsignedByte32(dimv);
				if (initialElement != null)
					newArray.fillVoid(initialElement);
				SimpleArray_UnsignedByte32.copyArray(this, newArray);
				return newArray;
			}
		// New dimensions are identical to old dimensions.
		return this;
	}

	public SubLObject AREF(int index) {
		try {
			return this.data[index];
		} catch (ArrayIndexOutOfBoundsException e) {
			return Lisp.error(new TypeError("Bad row major index " + index + "."));
		}
	}

	public void aset(int index, SubLObject newValue) {
		try {
			this.data[index] = newValue;
		} catch (ArrayIndexOutOfBoundsException e) {
			Lisp.error(new TypeError("Bad row major index " + index + "."));
		}
	}

	public SubLObject classOf() {
		return BuiltInClass.SIMPLE_ARRAY;
	}

	public void fillVoid(SubLObject obj) {
		for (int i = this.totalSize; i-- > 0;)
			this.data[i] = obj;
	}

	public SubLObject get(int[] subscripts) {
		try {
			return this.data[this.getRowMajorIndex(subscripts)];
		} catch (ArrayIndexOutOfBoundsException e) {
			return Lisp.error(new TypeError("Bad row major index " + this.getRowMajorIndex(subscripts) + "."));
		}
	}

	public int getDimension(int n) {
		try {
			return this.dimv[n];
		} catch (ArrayIndexOutOfBoundsException e) {
			Lisp.error(new TypeError("Bad array dimension " + n + "."));
			return -1;
		}
	}

	public SubLObject getDimensions() {
		SubLObject result = Lisp.NIL;
		for (int i = this.dimv.length; i-- > 0;)
			result = LispObjectFactory.makeCons(LispObjectFactory.makeInteger(this.dimv[i]), result);
		return result;
	}

	public SubLObject getElementType() {
		return Lisp.UNSIGNED_BYTE_32;
	}

	public int getRank() {
		return this.dimv.length;
	}

	public int getRowMajorIndex(int[] subscripts) {
		int rank = this.dimv.length;
		if (rank != subscripts.length) {
			StringBuffer sb = new StringBuffer("Wrong number of subscripts (");
			sb.append(subscripts.length);
			sb.append(") for array of rank ");
			sb.append(rank);
			sb.append('.');
			Lisp.error(new ProgramError(sb.toString()));
		}
		int sum = 0;
		int size = 1;
		for (int i = rank; i-- > 0;) {
			int dim = this.dimv[i];
			int lastSize = size;
			size *= dim;
			int n = subscripts[i];
			if (n < 0 || n >= dim) {
				StringBuffer sb = new StringBuffer("Invalid index ");
				sb.append(n);
				sb.append(" for array ");
				sb.append(this);
				sb.append('.');
				Lisp.error(new ProgramError(sb.toString()));
			}
			sum += n * lastSize;
		}
		return sum;
	}

	public int getTotalSize() {
		return this.totalSize;
	}

	public boolean isAdjustable() {
		return false;
	}

	public void set(int[] subscripts, SubLObject newValue)

	{
		try {
			this.data[this.getRowMajorIndex(subscripts)] = newValue;
		} catch (ArrayIndexOutOfBoundsException e) {
			Lisp.error(new TypeError("Bad row major index " + this.getRowMajorIndex(subscripts) + "."));
		}
	}

	private int setInitialContents(int axis, int[] dims, SubLObject contents, int index)

	{
		if (dims.length == 0) {
			try {
				this.data[index] = contents;
			} catch (ArrayIndexOutOfBoundsException e) {
				Lisp.error(new LispError("Bad initial contents for array."));
				return -1;
			}
			++index;
		} else {
			int dim = dims[0];
			if (dim != contents.cl_length()) {
				Lisp.error(new LispError("Bad initial contents for array."));
				return -1;
			}
			int[] newDims = new int[dims.length - 1];
			for (int i = 1; i < dims.length; i++)
				newDims[i - 1] = dims[i];
			if (contents.isList())
				for (int i = contents.cl_length(); i-- > 0;) {
					SubLObject content = contents.first();
					index = this.setInitialContents(axis + 1, newDims, content, index);
					contents = contents.rest();
				}
			else {
				AbstractVector v = Lisp.checkVector(contents);
				int length = v.cl_length();
				for (int i = 0; i < length; i++) {
					SubLObject content = v.AREF(i);
					index = this.setInitialContents(axis + 1, newDims, content, index);
				}
			}
		}
		return index;
	}

	public SubLObject typeOf() {
		return Lisp.list(LispSymbols.SIMPLE_ARRAY, Lisp.UNSIGNED_BYTE_32, this.getDimensions());
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.SIMPLE_ARRAY)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.SIMPLE_ARRAY)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

	public String writeToString() {
		if (LispSymbols.PRINT_READABLY.symbolValue() != Lisp.NIL) {
			Lisp.error(new PrintNotReadable(Lisp.list(Keyword.OBJECT, this)));
			// Not reached.
			return null;
		}
		return this.writeToString(this.dimv);
	}
}
