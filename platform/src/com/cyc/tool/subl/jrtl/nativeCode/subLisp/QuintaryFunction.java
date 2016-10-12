//
//
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.FixedArityFunctor;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class QuintaryFunction extends FixedArityFunctor implements CommonSymbols {
	public static void initialize() {
	}

	public static QuintaryFunction makeInstance(SubLFunction function) {
		QuintaryFunction result = function.getQuintaryFunction();
		if (result == null)
			result = new QuintaryFunction(function) {

				public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4,
						SubLObject obj5) {
					SubLObject[] args = null;
					Resourcer resourcer = Resourcer.getInstance();
					try {
						args = resourcer.acquireSubLObjectArray(5);
						args[0] = obj1;
						args[1] = obj2;
						args[2] = obj3;
						args[3] = obj4;
						args[4] = obj5;
						return this.func.funcall(args);
					} finally {
						resourcer.releaseSubLObjectArray(args);
					}
				}
			};
		return result;
	}

	public static QuintaryFunction makeInstance(SubLSymbol symbol) {
		return QuintaryFunction.makeInstance(symbol.getFunc());
	}

	protected SubLFunction func;

	protected QuintaryFunction(SubLFunction func) {
		(this.func = func).setQuintaryFunction(this);
	}

	public SubLFunction getFunction() {
		return this.func.getFunc();
	}

	public abstract SubLObject processItem(SubLObject p0, SubLObject p1, SubLObject p2, SubLObject p3, SubLObject p4);
}
