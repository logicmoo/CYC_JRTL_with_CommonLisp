/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.FixedArityFunctor;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class QuintaryFunction extends FixedArityFunctor {
	protected QuintaryFunction(SubLFunction func) {
		(this.func = func).setQuintaryFunction(this);
	}

	public static void initialize() {
	}

	public static QuintaryFunction makeInstance(SubLFunction function) {
		QuintaryFunction result = function.getQuintaryFunction();
		if (result == null)
			result = new QuintaryFunction(function) {
				@Override
				public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4,
						SubLObject obj5) {
					return func.funcallVA(function, obj1, obj2, obj3, obj4, obj5);
				}
			};
		return result;
	}

	public static QuintaryFunction makeInstance(SubLSymbol symbol) {
		return makeInstance(symbol.getFunc());
	}

	protected SubLFunction func;

	@Override
	public SubLFunction getFunction() {
		return func.getFunc();
	}

	public abstract SubLObject processItem(SubLObject p0, SubLObject p1, SubLObject p2, SubLObject p3, SubLObject p4);
}
