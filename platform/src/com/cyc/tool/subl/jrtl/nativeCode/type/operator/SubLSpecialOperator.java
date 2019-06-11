//
////
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import org.armedbear.lisp.Environment;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Operator;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;

public abstract class SubLSpecialOperator extends Operator implements SubLOperator {
	public SubLSpecialOperator(Symbol functionSymbol) {
		super((Symbol)functionSymbol);
	//	this.evaluationFunction = evaluationFunction;
	}

	//private final SubLCompiledFunction evaluationFunction;

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this; // special operators are self-evaluating
	}


	@Override
	public boolean isSpecialRestOnly() {
		return false;
	}

	@Override
	abstract public LispObject execute(LispObject args, Environment env);

	@Override
	public SubLList getArglist() {
		return getEvaluationFunction().getArglist();
	}

	abstract public SubLFunction getEvaluationFunction() ;
	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH) {
			return superHash();
		} else {
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
		}
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
	public boolean isSpecial() {
		return true;
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
