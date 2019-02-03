//
////
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import org.armedbear.lisp.Environment;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.SpecialOperator;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLSpecialOperatorImpl extends SpecialOperator implements SubLOperator {
	public SubLSpecialOperatorImpl(SubLCompiledFunction evaluationFunction, SubLSymbol functionSymbol) {
		super(null);
		setLambdaName((LispObject) functionSymbol);
		this.evaluationFunction = evaluationFunction;
		if(functionSymbol!=null) {
			functionSymbol.setFunction(this);
		}
	}

//	public SubLSpecialOperatorImpl(Symbol symbol) {
//		super(symbol);
//		this.evaluationFunction = null;
//	}


	public boolean isSubLispFunction() {
		return true;
	}
	
	@Override
	public boolean isSpecialRestOnly() {
		return false;
	}

	private final SubLCompiledFunction evaluationFunction;

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this; // special operators are self-evaluating
	}
	@Override
	public LispObject execute(LispObject args, Environment env) {
		SubLFunction fun = evaluationFunction;
		if(fun!=this) {
			return ((LispObject) fun).execute(args, env);
		}
		return (LispObject) apply((SubLCons) args, env);
	}

	@Override
	public SubLList getArglist() {
		if(evaluationFunction==null) return super.getArglist();
		return evaluationFunction.getArglist();
	}

	@Override
	public SubLFunction getEvaluationFunction() {
		if(evaluationFunction==null) {
			return null;
		}
		return evaluationFunction;
	}

	@Override
	public int hashCode(int currentDepth) {
		if(evaluationFunction==null) return super.hashCode(currentDepth);
		if (currentDepth < SubLObject.MAX_HASH_DEPTH) {
			return evaluationFunction.hashCode(currentDepth + 1) << 3;
		} else {
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
		}
	}

	@Override
	public boolean isSpecial() {
		return true;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public SubLSpecialOperator toSpecialOperator() {
		return this;
	}
//
//	@Override
//	public String toString() {
//		final SubLSymbol functionSymbol = getFunctionSymbol();
//		assert functionSymbol != null;
//		return "#<Special Operator " + functionSymbol + ">";
//	}
}
