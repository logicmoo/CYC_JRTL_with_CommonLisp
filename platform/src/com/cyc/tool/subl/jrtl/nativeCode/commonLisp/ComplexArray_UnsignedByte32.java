/*
 * ComplexArray_UnsignedByte32.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: ComplexArray_UnsignedByte32.java 12288 2009-11-29 22:00:12Z vvoutilainen $
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

public class ComplexArray_UnsignedByte32 extends AbstractComplexArray {
	private int[] dimv;
	private int totalSize;

	// For non-displaced arrays.
	// FIXME We should really use an array of unboxed values!
	private SubLObject[] data;

	// For displaced arrays.
	private AbstractArray array;
	private int displacement;

	public ComplexArray_UnsignedByte32(int[] dimv) {
		this.dimv = dimv;
		this.totalSize = AbstractSubLArray.computeTotalSize(dimv);
		this.data = LispObjectFactory.makeLispObjectArray(this.totalSize);
		for (int i = this.totalSize; i-- > 0;)
			this.data[i] = Lisp.NIL;
	}

	public ComplexArray_UnsignedByte32(int[] dimv, AbstractArray array, int displacement) {
		this.dimv = dimv;
		this.array = array;
		this.displacement = displacement;
		this.totalSize = AbstractSubLArray.computeTotalSize(dimv);
	}

	public ComplexArray_UnsignedByte32(int[] dimv, SubLObject initialContents)

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

	public AbstractArray adjustArray(int[] dims, AbstractArray displacedTo, int displacement) {
		if (this.isAdjustable()) {
			for (int i = 0; i < dims.length; i++)
				this.dimv[i] = dims[i];

			this.data = null;
			this.array = displacedTo;
			this.displacement = displacement;
			this.totalSize = AbstractSubLArray.computeTotalSize(dims);

			return this;
		} else {
			ComplexArray_UnsignedByte32 a = new ComplexArray_UnsignedByte32(dims, displacedTo, displacement);

			return a;
		}
	}

	public AbstractArray adjustArray(int[] dims, SubLObject initialElement, SubLObject initialContents) {
		if (this.isAdjustable()) {
			if (initialContents != null)
				this.setInitialContents(0, dims, initialContents, 0);
			else {
				// ### FIXME Take the easy way out: we don't want to reorganize
				// all of the array code yet
				SimpleArray_UnsignedByte32 tempArray = new SimpleArray_UnsignedByte32(dims);
				if (initialElement != null)
					tempArray.fillVoid(initialElement);
				SimpleArray_UnsignedByte32.copyArray(this, tempArray);
				this.data = tempArray.data;

				for (int i = 0; i < dims.length; i++)
					this.dimv[i] = dims[i];
			}
			return this;
		} else if (initialContents != null)
			return new ComplexArray_UnsignedByte32(dims, initialContents);
		else {
			ComplexArray_UnsignedByte32 newArray = new ComplexArray_UnsignedByte32(dims);
			if (initialElement != null)
				newArray.fillVoid(initialElement);
			return newArray;
		}
	}

	public SubLObject AREF(int index) {
		if (this.data != null)
			try {
				return this.data[index];
			} catch (ArrayIndexOutOfBoundsException e) {
				return Lisp.error(new TypeError("Bad row major index " + index + "."));
			}
		else
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
		if (this.data != null)
			try {
				this.data[index] = newValue;
			} catch (ArrayIndexOutOfBoundsException e) {
				Lisp.error(new TypeError("Bad row major index " + index + "."));
			}
		else
			this.array.aset(index + this.displacement, newValue);
	}

	public SubLObject classOf() {
		return BuiltInClass.ARRAY;
	}

	public void fillVoid(SubLObject obj) {
		if (this.data != null)
			for (int i = this.data.length; i-- > 0;)
				this.data[i] = obj;
		else
			for (int i = this.totalSize; i-- > 0;)
				this.aset(i, obj);
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

	public int getTotalSize() {
		return this.totalSize;
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
		return Lisp.list(LispSymbols.ARRAY, Lisp.UNSIGNED_BYTE_32, this.getDimensions());
	}

	public String writeToString() {
		return this.writeToString(this.dimv);
	}
}
