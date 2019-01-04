//
// For LarKC
//
package com.cyc.tool.subl.util;

import java.util.Comparator;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

public class ComparatorGenericKey<T> implements Comparator<T> {
	public ComparatorGenericKey(BinaryFunction pred, UnaryFunction key) {
		this.pred = pred;
		this.key = key;
	}

	private BinaryFunction pred;
	private UnaryFunction key;

	@Override
	public int compare(T o1, T o2) {
		SubLObject obj1 = this.key.processItem((SubLObject) o1);
		SubLObject obj2 = this.key.processItem((SubLObject) o2);
		boolean val1 = this.pred.processItem(obj1, obj2) == SubLNil.NIL;
		boolean val2 = this.pred.processItem(obj2, obj1) == SubLNil.NIL;
		return val1 ? val2 ? 0 : 1 : val2 ? -1 : 0;
	}

	public ComparatorGenericKey init(BinaryFunction pred, UnaryFunction key) {
		this.pred = pred;
		this.key = key;
		return this;
	}

	@Override
	public String toString() {
		return "Comparator: " + this.pred + " with key: " + this.key;
	}
}
