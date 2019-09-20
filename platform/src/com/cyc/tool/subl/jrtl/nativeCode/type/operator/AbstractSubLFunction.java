/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuataryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuintaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLMain;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.TernaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

@SuppressWarnings("unused")
public abstract class AbstractSubLFunction extends AbstractSubLOperator implements SubLFunction {

	protected AbstractSubLFunction(SubLSymbol functionSymbol) {
		super(functionSymbol);
	}

	@Override
	abstract public boolean isFunction();

	@Override
	abstract public boolean isSubLispBased();

	protected AbstractSubLFunction(SubLSymbol functionSymbol, int requiredArgCount, int optionalArgCount,
			boolean allowsRest) {
		super(functionSymbol);
		assert requiredArgCount >= 0;
		assert optionalArgCount >= 0;
		this.requiredArgCount = requiredArgCount;
		this.optionalArgCount = optionalArgCount;
		this.allowsRest = allowsRest;
	}

	@Override
	public int applyArity() {
		return getOptionalArgCount() + getRequiredArgCount();
	}

	protected int requiredArgCount;
	protected int optionalArgCount;
	protected boolean allowsRest;
	private ZeroArityFunction zeroArityFunction;
	private UnaryFunction unaryFunction;
	private BinaryFunction binaryFunction;
	private TernaryFunction ternaryFunction;
	private QuataryFunction quaternaryFunction;
	private QuintaryFunction quintaryFunction;
	public static String FUNCTION_TYPE_NAME;
	static {
		AbstractSubLFunction.FUNCTION_TYPE_NAME = "FUNCTION";
	}

	@Override
	public boolean allowsRest() {
		return allowsRest;
	}

	@Override
	public SubLObject apply(SubLCons arg1, SubLEnvironment env) {
		return Functions.funcall(this, arg1, env);
	}

	@Override
	public SubLObject evalViaApply(SubLCons form, SubLEnvironment env) {
		int actualArity = form.rest().size();
		if (form.rest().last(0) != SubLNil.NIL)
			Errors.error(
					"Invalid attempt to dynamically evaluate an expression conatiaining an improper list: " + form);
		SubLObject curArg = form;
		if (actualArity < 6) {
			switch (actualArity) {
			case 0:
				return Functions.funcall(this);
			case 1:
				return Functions.funcall(this, (curArg = curArg.rest()).first().eval(env));
			case 2:
				return Functions.funcall(this, (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env));
			case 3:
				return Functions.funcall(this, (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env), (curArg = curArg.rest()).first().eval(env));
			case 4:
				return Functions.funcall(this, (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env), (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env));
			case 5:
				return Functions.funcall(this, (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env), (curArg = curArg.rest()).first().eval(env),
						(curArg = curArg.rest()).first().eval(env), (curArg = curArg.rest()).first().eval(env));
			}
		} else {
			final Resourcer resourcer = Resourcer.getInstance();
			SubLObject[] args = null;
			try {
				args = resourcer.acquireSubLObjectArray(actualArity);
				for (int i = 0, size = args.length; i < size; ++i) {
					args[i] = (curArg = curArg.rest()).first().eval(env);
				}
				return Functions.funcall(this, args);
			} finally {
				resourcer.releaseObjectArray(args);
			}
		}
		return null;
	}

	@Override
	final public SubLObject funcallVA(SubLObject... incomingArgs) {
		return funcall(incomingArgs);
	}

	@Override
	public SubLObject funcall(SubLObject[] incomingArgs) {
		Object[] evaluatedArgs = null;
		SubLObject[] evaluatedRestArgs = null;
		final Resourcer resourcer = Resourcer.getInstance();
		try {
			final boolean subLispBased = isSubLispBased();
			if (!subLispBased) {
				final LispObject[] asLispObjectArray = asLispObjectArray(incomingArgs);
				return dispatch(asLispObjectArray);
			}
			final int actualArity = incomingArgs.length;
			final int applyArity = applyArity();
			final boolean allowsRest = allowsRest();
			if (actualArity < getRequiredArgCount()) {
				Errors.error(this + " called with too few arguments: " + incomingArgs);
			}
			if ((actualArity > applyArity) && !allowsRest) {
				if (!SubLMain.OPENCYC)
					Errors.error(this + " called with too many arguments: " + incomingArgs);
			}
			evaluatedArgs = resourcer.acquireObjectArray(applyArity + (allowsRest ? 1 : 0));
			evaluatedRestArgs = resourcer.acquireSubLObjectArray(actualArity - applyArity);
			int i = 0;
			int argIndex = 0;
			int restArgIndex = 0;
			while (i < actualArity) {
				if (i < applyArity) {
					evaluatedArgs[argIndex++] = incomingArgs[i];
				} else {
					evaluatedRestArgs[restArgIndex++] = incomingArgs[i];
				}
				++i;
			}
			while (argIndex < applyArity) {
				evaluatedArgs[argIndex] = CommonSymbols.UNPROVIDED;
				++argIndex;
			}
			if (allowsRest) {
				evaluatedArgs[argIndex] = evaluatedRestArgs;
			}
			return this.apply(evaluatedArgs);
		} finally {
			resourcer.releaseObjectArray(evaluatedArgs);
			resourcer.releaseSubLObjectArray(evaluatedRestArgs);
		}
	}

	@Override
	public BinaryFunction getBinaryFunction() {
		if (binaryFunction == null) {
			binaryFunction = FixedArityFunctor.makeInstanceDirect(2, BinaryFunction.class, this);
		}
		return binaryFunction;
	}

	@Override
	public SubLFunction getFunc() {
		return this;
	}

	@Override
	public int getOptionalArgCount() {
		if (!isSubLispBased()) {
			if (requiredArgCount == 0) {
				if (false)
					Errors.error(this + " unknown argument count. ");
			}
		}
		return optionalArgCount;
	}

	@Override
	public QuataryFunction getQuataryFunction() {
		if (quaternaryFunction == null) {
			quaternaryFunction = FixedArityFunctor.makeInstanceDirect(4, QuataryFunction.class, this);
		}
		return quaternaryFunction;
	}

	@Override
	public QuintaryFunction getQuintaryFunction() {
		if (quintaryFunction == null) {
			quintaryFunction = FixedArityFunctor.makeInstanceDirect(5, QuintaryFunction.class, this);
		}
		return quintaryFunction;
	}

	@Override
	public int getRequiredArgCount() {
		return requiredArgCount;
	}

	@Override
	public TernaryFunction getTernaryFunction() {
		if (ternaryFunction == null) {
			return ternaryFunction = FixedArityFunctor.makeInstanceDirect(3, TernaryFunction.class, this);
		}
		return ternaryFunction;
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_function$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.FIVE_INTEGER;
	}

	@Override
	public UnaryFunction getUnaryFunction() {
		if (unaryFunction == null) {
			unaryFunction = FixedArityFunctor.makeInstanceDirect(1, UnaryFunction.class, this);
		}
		return unaryFunction;
	}

	@Override
	public ZeroArityFunction getZeroArityFunction() {
		if (zeroArityFunction == null) {
			zeroArityFunction = FixedArityFunctor.makeInstanceDirect(0, ZeroArityFunction.class, this);
		}
		return zeroArityFunction;
	}

	@Override
	public void setBinaryFunction(BinaryFunction f) {
		binaryFunction = f;
	}

	@Override
	public void setQuataryFunction(QuataryFunction f) {
		quaternaryFunction = f;
	}

	@Override
	public void setQuintaryFunction(QuintaryFunction f) {
		quintaryFunction = f;
	}

	@Override
	public void setTernaryFunction(TernaryFunction f) {
		ternaryFunction = f;
	}

	@Override
	public void setUnaryFunction(UnaryFunction f) {
		unaryFunction = f;
	}

	@Override
	public void setZeroArityFunction(ZeroArityFunction f) {
		zeroArityFunction = f;
	}

	// @Override
	// public String toString() {
	// final SubLSymbol functionSymbol = getFunctionSymbol();
	// if (functionSymbol != null) {
	// return "#<Function " + functionSymbol + ">";
	// }
	// return super.toString();
	// }

	@Override
	public String toTypeName() {
		return AbstractSubLFunction.FUNCTION_TYPE_NAME;
	}
}
