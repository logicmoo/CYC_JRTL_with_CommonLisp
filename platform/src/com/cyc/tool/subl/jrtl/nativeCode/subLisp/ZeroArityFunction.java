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

public abstract class ZeroArityFunction extends FixedArityFunctor implements CommonSymbols {

	//// Constructors

	private static class NConcZeroArityFunction extends ZeroArityFunction {
		public NConcZeroArityFunction() {
			super(CommonSymbols.NCONC.getFunc());
		}

		public SubLObject processItem() {
			return CommonSymbols.NIL;
		}
	}

	//// Public Area

	private static class VectorZeroArityFunction extends ZeroArityFunction {
		public VectorZeroArityFunction() {
			super(CommonSymbols.VECTOR.getFunc());
		}

		public SubLObject processItem() {
			return Vectors.vector(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
		}
	}

	public static ZeroArityFunction NCONC_ZERO_ARITY_FUNC = new NConcZeroArityFunction();

	public static ZeroArityFunction VECTOR_ZERO_ARITY_FUNC = new VectorZeroArityFunction();

	public static void initialize() {
	} // this is for side effects of initializing statics

	public static ZeroArityFunction makeInstance(SubLFunction function) {
		ZeroArityFunction result = function.getZeroArityFunction();
		if (result == null)
			// System.out.println("Creating slow UnaryFunction for: " +
			// function);
			result = new ZeroArityFunction(function) {
				public SubLObject processItem() {
					return this.func.funcall(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
				}
			};
		return result;
	}

	public static ZeroArityFunction makeInstance(SubLSymbol symbol) {
		return ZeroArityFunction.makeInstance(symbol.getFunc());
	}

	protected SubLFunction func;

	//// Internal Rep

	protected ZeroArityFunction(SubLFunction func) {
		this.func = func;
		func.setZeroArityFunction(this);
	}

	public SubLFunction getFunction() {
		return this.func;
	};

	public abstract SubLObject processItem();;

}
