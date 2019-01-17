//
////
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLOperator extends LispObject implements SubLOperator {
	AbstractSubLOperator() {
		this(null);
	}
	
	AbstractSubLOperator(SubLSymbol functionSymbol) {
		setFunctionSymbol(functionSymbol);
		if (functionSymbol != null) {
			functionSymbol.setFunction(this);
		}
	}

	public LispObject lambdaName;
	public static String SPECIAL_OPERATOR_NAME;
	static {
		AbstractSubLOperator.SPECIAL_OPERATOR_NAME = "SPECIAL-OPERATOR";
	}

	@Override
	public boolean canFastHash() {
		return true;
	}

	@Override
	public SubLSymbol getFunctionSymbol() {
		return (SubLSymbol) lambdaName;
	}

	@Override
	public SubLSpecialOperator toSpecialOperator() {
		if(this instanceof SubLSpecialOperator) return (SubLSpecialOperator) this;
		org.armedbear.lisp.Lisp.lisp_type_error(this,"SPECIAL-OPERATOR");
		return null;
	}

	@Override
	public String toTypeName() {
		return AbstractSubLOperator.SPECIAL_OPERATOR_NAME;
	}

	private void setFunctionSymbol(SubLSymbol functionSymbol) {
		this.lambdaName = (LispObject) functionSymbol;
	}


	public boolean isAlien() {
		return false;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

}
