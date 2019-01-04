//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;

public class SubLVector extends AbstractSubLVector implements SubLSequence {
	public SubLVector(int length) {
		this(length, SubLNil.NIL);
	}

	public SubLVector(int length, SubLObject value) {
		size = 0;
		Arrays.fill(vect = new SubLObject[length], value);
		size = vect.length;
	}

	public SubLVector(List<SubLObject> list) {
		this(list.toArray(new SubLObject[list.size()]));
	}


	SubLVector(SubLObject[] vect) {
		size = 0;
		this.vect = vect;
		size = vect.length;
	}

	protected SubLObject[] vect;
	private int size;
	final private static int SXHASH_TYPE_SPEC_PRIME_VECTOR = 199;
	//final public static String VECTOR_TYPE_NAME = "VECTOR";
	final public static SubLVector EMPTY_VECTOR = new SubLVector(0);

	@Override
	public boolean canFastHash() {
		return false;
	}

	@Override
	public Object clone() {
		return makeCopy();
	}

	@Override
	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (endIndexExclusive <= startIndex)
			return this;
		int deleteCount = endIndexExclusive - startIndex;
		for (int i = endIndexExclusive, j = startIndex; i < size; ++i, ++j)
			vect[j] = AREF(i);
		for (int i = size - deleteCount; i < size; ++i)
			vect[i] = null;
		size -= deleteCount;
		return this;
	}

	@Override
	public SubLSequence fill(SubLObject item, int start, int end) {
		if (end < 0)
			return this;
		if (start < 0)
			start = 0;
		if (end > this.size())
			end = this.size();
		Arrays.fill(vect, start, end, item);
		return this;
	}


	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTY_THREE_INTEGER;
	}


	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}


	@Override
	public boolean isVector() {
		return true;
	}

	@Override
	public SubLObject makeCopy() {
		return new SubLVector((SubLObject[]) this.toArray(new SubLObject[size]));
	}

	@Override
	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLVector.makeDeepCopy()");
		return null;
	}


	@Override
	public void set(int i, SubLObject obj) {
		vect[i] = obj;
	}
	@Override
	public void shrink(int newSize)
	{ size = newSize;		
	}
	@Override
	public LispObject AREF(int i) {
		return (LispObject) vect[i];
	}
	@Override
	public int size() {
		return size;
	}

	@Override
	public int size(int max) {
		return size;
	}

	@Override
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		SubLVector result = isDestructive ? this : makeCopy().toVect();
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			Arrays.sort(result.vect, new ComparatorIdentityKey<Object>(pred));
		else
			Arrays.sort(result.vect, new ComparatorGenericKey<Object>(pred, key));
		return result;
	}

	@Override
	public Object[] toArray() {
		return vect;
	}

	@Override
	public SubLVector toVect() {
		return this;
	}
}
