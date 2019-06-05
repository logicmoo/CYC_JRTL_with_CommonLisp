//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

abstract public class SubLDoubleFloat extends AbstractSubLFloat implements SubLFloat, SubLNumber, SubLObject {
//	protected SubLDoubleFloat(double value) {
//		this.dblvalue = value;
//	}
//
	protected SubLDoubleFloat(Number theDouble) {
		theNumber = theDouble;
		value = theDouble.doubleValue();
	}

	private Number theNumber;
	///public double value;
	public final double value;
	public static String NUMBER_TYPE_NAME;
	private static int SXHASH_TYPE_FLOAT = 89;
	static {
		SubLDoubleFloat.NUMBER_TYPE_NAME = "LONG-FLOAT";
	}

	@Override
	public SubLObject add(SubLObject num) {
		return SubLNumberFactory.makeDouble(value + num.doubleValue());
	}

	@Override
	public SubLObject dec() {
		return SubLNumberFactory.makeDouble(value - 1.0);
	}

	@Override
	public double doubleValue() {
		return value;
	}

	@Override
	public boolean eql(SubLObject obj) {
		return obj.isDouble() && value == obj.doubleValue();
	}

	@Override
	public boolean equal(SubLObject obj) {
		return obj.isDouble() && value == obj.doubleValue();
	}

	@Override
	public float floatValue() {
		return (float) value;
	}

	public Double getDouble() {
		return (Double) getNativeNumber();
	}

	@Override
	public Number getNativeNumber() {
		if (theNumber == null)
			theNumber = new Double(value);
		return theNumber;
	}

	@Override
	public int getNumSize() {
		return 3;
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_float$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.SEVEN_INTEGER;
	}

	@Override
	public boolean greaterThanInternal(SubLObject num) {
		return value > num.doubleValue();
	}

	@Override
	public boolean greaterThanOrEqualInternal(SubLObject num) {
		return value >= num.doubleValue();
	}

	@Override
	public SubLObject inc() {
		return SubLNumberFactory.makeDouble(value + 1.0);
	}

	@Override
	public int intValue() {
		return (int) value;
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
		return true;
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
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNegative() {
		return value < 0.0;
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
		return value > 0.0;
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
		return value == 0.0;
	}

	@Override
	public boolean lessThanInternal(SubLObject num) {
		return value < num.doubleValue();
	}

	@Override
	public boolean lessThanOrEqualInternal(SubLObject num) {
		return value <= num.doubleValue();
	}

	@Override
	public long longValue() {
		return (long) value;
	}

	@Override
	public SubLObject mult(SubLObject num) {
		return SubLNumberFactory.makeDouble(value * num.doubleValue());
	}

	@Override
	public boolean numericallyEqualInternal(SubLObject num) {
		return value == num.doubleValue();
	}

	@Override
	public SubLObject sub(SubLObject num) {
		return SubLNumberFactory.makeDouble(value - num.doubleValue());
	}

	@Override
	public SubLDoubleFloat toDouble() {
		return this;
	}

	@Override
	public SubLFixnum toFixnum() {
		org.armedbear.lisp.Lisp.lisp_type_error(this,"FIXNUM");
		return null;
	}

	@Override
	public String printObject() {
		return "" + value;
	}

	@Override
	public String toTypeName() {
		return SubLDoubleFloat.NUMBER_TYPE_NAME;
	}

	@Override
	public int hashCode() {
		return getNativeNumber().hashCode();
	}
}
