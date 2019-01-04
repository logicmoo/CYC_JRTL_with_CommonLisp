//
// For LarKC
//
package com.cyc.tool.subl.util;

import java.util.Comparator;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

public class ComparatorIdentityKey<T> implements Comparator<T> {
	public ComparatorIdentityKey(BinaryFunction pred) {
		this.pred = pred;
	}

	private BinaryFunction pred;

	@Override
	public int compare(T o1, T o2) {
		SubLObject obj1 = (SubLObject) o1;
		SubLObject obj2 = (SubLObject) o2;
		boolean val1 = this.pred.processItem(obj1, obj2) == SubLNil.NIL;
		boolean val2 = this.pred.processItem(obj2, obj1) == SubLNil.NIL;
		return val1 ? val2 ? 0 : 1 : val2 ? -1 : 0;
	}

	public ComparatorIdentityKey init(BinaryFunction pred) {
		this.pred = pred;
		return this;
	}

	@Override
	public String toString() {
		return "Comparator: " + this.pred + " with key: IDENTITY";
	}
}
