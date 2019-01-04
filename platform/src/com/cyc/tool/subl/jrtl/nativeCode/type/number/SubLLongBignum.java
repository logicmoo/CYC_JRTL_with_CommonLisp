//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.math.BigInteger;

import org.armedbear.lisp.Bignum;
import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

final public class SubLLongBignum extends Bignum implements SubLBignum, SubLInteger, SubLNumber, SubLObject {
/* this fits into CL as a Bignum (haskish but it needs a 'long' type)*/
	protected SubLLongBignum(long l) {
		super(BigInteger.valueOf(l));
		longValue = l;
	}

	protected SubLLongBignum(Long theLong) {
		super(BigInteger.valueOf(theLong));
		nativeObject = theLong;
		longValue = theLong;
	}

	private long longValue;
	private Long nativeObject;
	public static String LONG_TYPE_NAME;
	static {
		SubLLongBignum.LONG_TYPE_NAME = "SOMEWHAT-BIG-BIGNUM";
	}

	@Override
	public SubLNumber abs() {
		if (longValue == Long.MIN_VALUE)
			return SubLObjectFactory.makeInteger(new BigInteger("-9223372036854775808").abs());
		long result = Math.abs(longValue);
		return SubLObjectFactory.makeInteger(result);
	}

	@Override
	public SubLObject add(SubLObject num) {
		if (num.getNumSize() > 1)
			return num.add(this);
		BigInteger a = bigIntegerValue();
		BigInteger b = num.bigIntegerValue();
		return SubLNumberFactory.makeInteger(a.add(b));
	}

	@Override
	public SubLObject dec() {
		if (longValue == Long.MIN_VALUE)
			return SubLNumberFactory.makeInteger(new BigInteger(longValue + "").subtract(BigInteger.ONE));
		return SubLNumberFactory.makeInteger(longValue - 1L);
	}

	@Override
	public double doubleValue() {
		return longValue;
	}

	@Override
	public boolean eql(SubLObject obj) {
		return obj.isLongBignum() && longValue == obj.longValue();
	}

	@Override
	public boolean equal(SubLObject obj) {
		return obj.isLongBignum() && longValue == obj.longValue();
	}

	@Override
	public float floatValue() {
		return longValue;
	}

	public synchronized Long getLong() {
		if (nativeObject == null)
			nativeObject = new Long(longValue);
		return nativeObject;
	}

	@Override
	public Number getNativeNumber() {
		return getLong();
	}

	@Override
	public int getNumSize() {
		return 1;
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
		return longValue > num.longValue();
	}

	@Override
	public boolean greaterThanOrEqualInternal(SubLObject num) {
		return longValue >= num.longValue();
	}

	@Override
	public SubLObject inc() {
		if (longValue == Long.MAX_VALUE)
			return SubLNumberFactory.makeInteger(new BigInteger(longValue + "").add(BigInteger.ONE));
		return SubLNumberFactory.makeInteger(longValue + 1L);
	}

	@Override
	public int intValue() {
		return (int) longValue;
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
		return false;
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
		return true;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNegative() {
		return longValue < 0L;
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
	public boolean isPositive() {
		return longValue > 0L;
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
	public boolean isZero() {
		return longValue == 0L;
	}

	@Override
	public boolean lessThanInternal(SubLObject num) {
		return longValue < num.longValue();
	}

	@Override
	public boolean lessThanOrEqualInternal(SubLObject num) {
		return longValue <= num.longValue();
	}

	@Override
	public long longValue() {
		return longValue;
	}

	@Override
	public SubLObject mult(SubLObject num) {
		if (num.getNumSize() > 1)
			return num.mult(this);
		BigInteger a = bigIntegerValue();
		BigInteger b = num.bigIntegerValue();
		return SubLNumberFactory.makeInteger(a.multiply(b));
	}

	@Override
	public boolean numericallyEqualInternal(SubLObject num) {
		return longValue == num.longValue();
	}

	@Override
	public SubLObject sub(SubLObject num) {
		if (num.getNumSize() > 1)
			return num.mult(CommonSymbols.MINUS_ONE_INTEGER).add(this);
		BigInteger a = bigIntegerValue();
		BigInteger b = num.bigIntegerValue();
		return SubLNumberFactory.makeInteger(a.subtract(b));
	}

	@Override
	public SubLFixnum toFixnum() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"FIXNUM");
		return null;
	}


	@Override
	public String toTypeName() {
		return SubLLongBignum.LONG_TYPE_NAME;
	}
}
