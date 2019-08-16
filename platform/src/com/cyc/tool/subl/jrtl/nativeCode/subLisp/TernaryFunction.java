/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.FixedArityFunctor;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class TernaryFunction extends FixedArityFunctor {
	private static class ListSTernaryFunction extends TernaryFunction {
		public ListSTernaryFunction() {
			super(CommonSymbols.LISTS.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
			return ConsesLow.listS(obj1, obj2, obj3);
		}
	}

	private static class ListTernaryFunction extends TernaryFunction {
		public ListTernaryFunction() {
			super(CommonSymbols.LIST.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
			return ConsesLow.list(obj1, obj2, obj3);
		}
	}

	private static class SortTernaryFunction extends TernaryFunction {
		public SortTernaryFunction() {
			super(CommonSymbols.SORT.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
			return Sort.stable_sort(obj1, obj2, obj3);
		}
	}

	private static class ValuesTernaryFunction extends TernaryFunction {
		public ValuesTernaryFunction() {
			super(CommonSymbols.VALUES.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
			return Values.values(obj1, obj2, obj3);
		}
	}

	protected TernaryFunction(SubLFunction func) {
		(this.func = func).setTernaryFunction(this);
	}

	public static void initialize() {
	}

	public static TernaryFunction makeInstance(SubLFunction function) {
		TernaryFunction result = function.getTernaryFunction();
		if (result == null)
			result = new TernaryFunction(function) {
				@Override
				public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
					return func.funcallVA(obj1, obj2, obj3);
				}
			};
		return result;
	}

	public static TernaryFunction makeInstance(SubLSymbol symbol) {
		return makeInstance(symbol.getFunc());
	}

	protected SubLFunction func;
	private static TernaryFunction SORT_TERNARY_FUNCTION;
	private static TernaryFunction VALUES_TERNARY_FUNCTION;
	private static TernaryFunction LIST_TERNARY_FUNCTION;
	static {
		SORT_TERNARY_FUNCTION = new SortTernaryFunction();
		VALUES_TERNARY_FUNCTION = new ValuesTernaryFunction();
		LIST_TERNARY_FUNCTION = new ListTernaryFunction();
	}

	@Override
	public SubLFunction getFunction() {
		return func.getFunc();
	}

	public abstract SubLObject processItem(SubLObject p0, SubLObject p1, SubLObject p2);
}
