//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.FixedArityFunctor;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class ZeroArityFunction extends FixedArityFunctor implements CommonSymbols {
	private static class NConcZeroArityFunction extends ZeroArityFunction {
		public NConcZeroArityFunction() {
			super(CommonSymbols.NCONC.getFunc());
		}

		@Override
		public SubLObject processItem() {
			return SubLNil.NIL;
		}
	}

	private static class VectorZeroArityFunction extends ZeroArityFunction {
		public VectorZeroArityFunction() {
			super(CommonSymbols.VECTOR.getFunc());
		}

		@Override
		public SubLObject processItem() {
			return Vectors.vector(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
		}
	}

	/**
         * 
         */
	protected ZeroArityFunction() {
            // TODO Auto-generated constructor stub
            if (true)
                throw new AbstractMethodError("ZeroArityFunction.ZeroArityFunction.");

        }
	protected ZeroArityFunction(SubLFunction func) {
		(this.func = func).setZeroArityFunction(this);
	}

	public static void initialize() {
	}

	public static ZeroArityFunction makeInstance(SubLFunction function) {
		ZeroArityFunction result = function.getZeroArityFunction();
		if (result == null)
			result = new ZeroArityFunction(function) {
				@Override
				public SubLObject processItem() {
					return func.funcall(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
				}
			};
		return result;
	}

	public static ZeroArityFunction makeInstance(SubLSymbol symbol) {
		return makeInstance(symbol.getFunc());
	}

	protected SubLFunction func;
	public static ZeroArityFunction NCONC_ZERO_ARITY_FUNC;
	public static ZeroArityFunction VECTOR_ZERO_ARITY_FUNC;
	static {
		NCONC_ZERO_ARITY_FUNC = new NConcZeroArityFunction();
		VECTOR_ZERO_ARITY_FUNC = new VectorZeroArityFunction();
	}

	@Override
	public SubLFunction getFunction() {
		return func;
	}

	public abstract SubLObject processItem();
}
