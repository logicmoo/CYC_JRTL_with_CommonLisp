/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import org.armedbear.lisp.Fixnum;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLIntegerBignum extends Fixnum implements SubLBignum, SubLNumber, SubLObject {
	SubLIntegerBignum(int theInteger) {
		super(theInteger);
	}

	SubLIntegerBignum(Integer theInteger) {
		super((int)theInteger);
	}

	public static String INTEGER_TYPE_NAME = "MARGINALLY-BIG-BIGNUM";

	@Override
	public SubLObject add(SubLObject num) {
		if (num.getNumSize() <= 0)
			return SubLNumberFactory.makeInteger((long) value + (long) num.intValue());
		return num.add(this);
	}

	@Override
	public boolean eql(SubLObject obj) {
		return obj.isIntBignum() && value == obj.intValue();
	}

	@Override
	public boolean equal(SubLObject obj) {
		return obj.isIntBignum() && value == obj.intValue();
	}

	@Override
	public int getNumSize() {
		return 0;
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_bignum$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.THIRTY_FOUR_INTEGER;
	}

	@Override
	public boolean greaterThanInternal(SubLObject num) {
		return value > num.intValue();
	}

	@Override
	public boolean greaterThanOrEqualInternal(SubLObject num) {
		return value >= num.intValue();
	}

	@Override
	public int hashCode(int currentDepth) {
		return value;
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return true;
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
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
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
		return true;
	}

	@Override
	public boolean isInteger() {
		return true;
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
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return true;
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

	@Override
	public boolean lessThanInternal(SubLObject num) {
		return value < num.intValue();
	}

	@Override
	public boolean lessThanOrEqualInternal(SubLObject num) {
		return value <= num.intValue();
	}

	@Override
	public boolean numericallyEqualInternal(SubLObject num) {
		return value == num.intValue();
	}

	@Override
	public SubLObject sub(SubLObject num) {
		if (num.getNumSize() <= 0)
			return SubLNumberFactory.makeInteger((long) value - (long) num.intValue());
		return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
	}

	@Override
	public SubLFixnum toFixnum() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"FIXNUM");
		return null;
	}

	@Override
	public String toTypeName() {
		return "MARGINALLY-BIG-BIGNUM";
	}
}
