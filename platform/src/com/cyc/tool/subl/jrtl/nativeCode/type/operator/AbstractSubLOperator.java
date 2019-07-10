//
////
//
package com.cyc.tool.subl.jrtl.nativeCode.type.operator;

import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLOperator extends LispObject implements SubLOperator {
	AbstractSubLOperator() {
		this(null);
	}
	
    /* (non-Javadoc)
     * @see org.armedbear.lisp.LispObject#lispEquals(java.lang.Object)
     */
    @Override
    public boolean lispEquals(Object obj) {
    	return obj == this;
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


	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return false;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

}
