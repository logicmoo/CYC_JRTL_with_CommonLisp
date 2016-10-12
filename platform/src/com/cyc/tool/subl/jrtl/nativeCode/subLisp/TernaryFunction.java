/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.FixedArityFunctor;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class TernaryFunction extends FixedArityFunctor implements CommonSymbols {

	//// Constructors

	private static class ListSTernaryFunction extends TernaryFunction {
		public ListSTernaryFunction() {
			super(CommonSymbols.LISTS.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
			return ConsesLow.listS(obj1, obj2, obj3);
		}
	}

	//// Public Area

	private static class ListTernaryFunction extends TernaryFunction {
		public ListTernaryFunction() {
			super(CommonSymbols.LIST.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
			return ConsesLow.list(obj1, obj2, obj3);
		}
	}

	private static class SortTernaryFunction extends TernaryFunction {
		public SortTernaryFunction() {
			super(CommonSymbols.SORT.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
			return Sort.stable_sort(obj1, obj2, obj3);
		}
	}

	private static class ValuesTernaryFunction extends TernaryFunction {
		public ValuesTernaryFunction() {
			super(CommonSymbols.VALUES.getFunc());
		}

		public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
			return Values.values(obj1, obj2, obj3);
		}
	}

	private static TernaryFunction SORT_TERNARY_FUNCTION = new SortTernaryFunction();

	private static TernaryFunction VALUES_TERNARY_FUNCTION = new ValuesTernaryFunction();

	//// Internal Rep

	private static TernaryFunction LIST_TERNARY_FUNCTION = new ListTernaryFunction();

	public static void initialize() {
	} // this is for side effects of initializing statics

	public static TernaryFunction makeInstance(SubLFunction function) {
		TernaryFunction result = function.getTernaryFunction();
		if (result == null)
			// System.out.println("Creating slow TernaryFunction for: " +
			// function);
			result = new TernaryFunction(function) {
				public SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
					SubLObject[] args = null;
					Resourcer resourcer = Resourcer.getInstance();
					try {
						args = resourcer.acquireSubLObjectArray(3);
						args[0] = obj1;
						args[1] = obj2;
						args[2] = obj3;
						return this.func.funcall(args);
					} finally {
						resourcer.releaseSubLObjectArray(args);
					}
				}
			};
		return result;
	}

	public static TernaryFunction makeInstance(SubLSymbol symbol) {
		return TernaryFunction.makeInstance(symbol.getFunc());
	}

	protected SubLFunction func;;

	protected TernaryFunction(SubLFunction func) {
		this.func = func;
		func.setTernaryFunction(this);
	};

	public SubLFunction getFunction() {
		return this.func.getFunc();
	};

	public abstract SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3);;

}
