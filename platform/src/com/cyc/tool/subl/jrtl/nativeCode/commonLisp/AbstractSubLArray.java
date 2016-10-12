/*
 * AbstractArray.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: AbstractArray.java 12298 2009-12-18 21:50:54Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public abstract class AbstractSubLArray extends AbstractSubLSequence implements AbstractArray {

	// FIXME Detect overflow!
	protected static int computeTotalSize(int[] dimensions) {
		int size = 1;
		for (int i = dimensions.length; i-- > 0;)
			size *= dimensions[i];
		return size;
	}

	/**
	 *
	 * @param dims
	 * @param displacedTo
	 * @param displacement
	 * @return
	 */
	public abstract AbstractArray adjustArray(int[] dims, AbstractArray displacedTo, int displacement);

	/**
	 * Returns a newly allocated array or the current array with adjusted
	 * dimensions.
	 *
	 * @param dims
	 * @param initialElement
	 * @c null if none
	 * @param initialContents
	 * @c null if none
	 * @return @c this or a new array
	 */
	public abstract AbstractArray adjustArray(int[] dims, SubLObject initialElement, SubLObject initialContents);

	// Helper for writeToString().
	private void appendContents(int[] dimensions, int index, StringBuilder sb, LispThread thread)

	{
		if (dimensions.length == 0) {
			if (LispSymbols.PRINT_CIRCLE.symbolValue(thread) != Lisp.NIL) {
				StringOutputStream stream = new StringOutputStream();
				thread.execute(LispSymbols.OUTPUT_OBJECT.getSymbolFunction(), this.AREF(index), stream);
				sb.append(stream.getOutputString().getString());
			} else
				sb.append(this.AREF(index).writeToString());
		} else {
			SubLObject printReadably = LispSymbols.PRINT_READABLY.symbolValue(thread);
			int maxLength = Integer.MAX_VALUE;
			int maxLevel = Integer.MAX_VALUE;
			if (printReadably == Lisp.NIL) {
				SubLObject printLength = LispSymbols.PRINT_LENGTH.symbolValue(thread);
				if (printLength instanceof Fixnum)
					maxLength = ((Fixnum) printLength).value;
				SubLObject printLevel = LispSymbols.PRINT_LEVEL.symbolValue(thread);
				if (printLevel instanceof Fixnum)
					maxLevel = ((Fixnum) printLevel).value;
			}
			SubLObject currentPrintLevel = Lisp._CURRENT_PRINT_LEVEL_.symbolValue(thread);
			int currentLevel = currentPrintLevel.intValue();
			if (currentLevel < maxLevel) {
				SpecialBindingsMark mark = thread.markSpecialBindings();
				thread.bindSpecial(Lisp._CURRENT_PRINT_LEVEL_, currentPrintLevel.inc());
				try {
					sb.append('(');
					int[] dims = new int[dimensions.length - 1];
					for (int i = 1; i < dimensions.length; i++)
						dims[i - 1] = dimensions[i];
					int count = 1;
					for (int i = 0; i < dims.length; i++)
						count *= dims[i];
					int length = dimensions[0];
					int limit = Math.min(length, maxLength);
					for (int i = 0; i < limit; i++) {
						this.appendContents(dims, index, sb, thread);
						if (i < limit - 1 || limit < length)
							sb.append(' ');
						index += count;
					}
					if (limit < length)
						sb.append("...");
					sb.append(')');
				} finally {
					thread.resetSpecialBindings(mark);
				}
			} else
				sb.append('#');
		}
	}

	public SubLObject arrayDisplacement() {
		return LispThread.currentThread().setValues(Lisp.NIL, Fixnum.ZERO);
	}

	public abstract void aset(int index, SubLObject newValue);

	public boolean equalp(SubLObject obj) {
		if (obj instanceof AbstractArray) {
			AbstractArray a = (AbstractArray) obj;
			if (this.getRank() != a.getRank())
				return false;
			for (int i = this.getRank(); i-- > 0;)
				if (this.getDimension(i) != a.getDimension(i))
					return false;
			for (int i = this.getTotalSize(); i-- > 0;)
				if (!this.AREF(i).equalp(a.AREF(i)))
					return false;
			return true;
		}
		return false;
	}

	public abstract void fillVoid(SubLObject obj);

	public SubLObject get(int[] subscripts) {
		return this.AREF(this.getRowMajorIndex(subscripts));
	}

	public abstract int getDimension(int n);

	public abstract SubLObject getDimensions();

	public abstract SubLObject getElementType();

	public int getFillPointer() {
		this.noFillPointer();
		return -1; // Not reached.
	}

	public abstract int getRank();

	public int getRowMajorIndex(int[] subscripts) {
		int rank = this.getRank();
		if (rank != subscripts.length) {
			// ### i18n
			String errorMsg = "Wrong number of subscripts (%d) for array of rank %d.";
			Lisp.error(new ProgramError(String.format(errorMsg, subscripts.length, rank)));
		}
		int sum = 0;
		int size = 1;
		for (int i = rank; i-- > 0;) {
			int dim = this.getDimension(i);
			int lastSize = size;
			size *= dim;
			int n = subscripts[i];
			if (n < 0 || n >= dim) {
				// ### i18n
				String errorMsg = "Invalid index %d for array %s.";
				Lisp.error(new ProgramError(String.format(errorMsg, n, this.writeToString())));
			}
			sum += n * lastSize;
		}
		return sum;
	}

	public int getRowMajorIndex(SubLObject[] subscripts)

	{
		int[] subs = new int[subscripts.length];
		for (int i = 0; i < subscripts.length; i++) {
			SubLObject subscript = subscripts[i];
			if (subscript instanceof Fixnum)
				subs[i] = ((Fixnum) subscript).value;
			else
				Lisp.type_error(subscript, LispSymbols.FIXNUM);
		}
		return this.getRowMajorIndex(subs);
	}

	public abstract int getTotalSize();

	public boolean hasFillPointer() {
		return false;
	}

	public boolean isAdjustable() {
		return true;
	}

	public boolean isArrayBased() {
		return true;
	}

	public boolean isDisplaced() {
		return false;
	}

	// For EQUALP hash tables.

	public int psxhash() {
		long result = 128387; // Chosen at random.
		int rank = this.getRank();
		int limit = rank < 4 ? rank : 4;
		for (int i = 0; i < limit; i++)
			result = Lisp.mix(result, this.getDimension(i));
		int length = this.getTotalSize();
		limit = length < 4 ? length : 4;
		for (int i = 0; i < length; i++)
			result = Lisp.mix(result, this.AREF(i).psxhash());
		return (int) (result & 0x7fffffff);
	}

	public void set(int[] subscripts, SubLObject newValue)

	{
		this.aset(this.getRowMajorIndex(subscripts), newValue);
	}

	public void setFillPointer(int fillPointer) {
		this.noFillPointer();
	}

	public void setFillPointer(SubLObject fillPointer) {
		this.setFillPointer(fillPointer.intValue());
	}

	public int size() {
		return this.cl_length();
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.ARRAY)
			return Lisp.T;
		if (type == BuiltInClass.ARRAY)
			return Lisp.T;
		return super.typep(type);
	}

	public String writeToString(int[] dimv) {
		StringBuilder sb = new StringBuilder();
		LispThread thread = LispThread.currentThread();
		SubLObject printReadably = LispSymbols.PRINT_READABLY.symbolValue(thread);
		if (printReadably != Lisp.NIL || LispSymbols.PRINT_ARRAY.symbolValue(thread) != Lisp.NIL) {
			int maxLevel = Integer.MAX_VALUE;
			if (printReadably != Lisp.NIL) {
				for (int i = 0; i < dimv.length - 1; i++)
					if (dimv[i] == 0)
						for (int j = i + 1; j < dimv.length; j++)
							if (dimv[j] != 0) {
								Lisp.error(new PrintNotReadable(Lisp.list(Keyword.OBJECT, this)));
								return null; // Not reached.
							}
			} else {
				SubLObject printLevel = LispSymbols.PRINT_LEVEL.symbolValue(thread);
				if (printLevel instanceof Fixnum)
					maxLevel = ((Fixnum) printLevel).value;
			}
			SubLObject currentPrintLevel = Lisp._CURRENT_PRINT_LEVEL_.symbolValue(thread);
			int currentLevel = currentPrintLevel.intValue();
			if (currentLevel >= maxLevel)
				return "#";
			sb.append('#');
			sb.append(dimv.length);
			sb.append('A');
			this.appendContents(dimv, 0, sb, thread);
			return sb.toString();
		}
		sb.append('(');
		if (this instanceof SimpleArray_T)
			sb.append("SIMPLE-");
		sb.append("ARRAY " + this.getElementType().writeToString() + " (");
		for (int i = 0; i < dimv.length; i++) {
			sb.append(dimv[i]);
			if (i < dimv.length - 1)
				sb.append(' ');
		}
		sb.append("))");
		return this.unreadableString(sb.toString());
	}
}
