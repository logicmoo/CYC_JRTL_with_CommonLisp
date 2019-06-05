//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import org.armedbear.lisp.Bignum;
import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.LispInteger;
import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;

public abstract class AbstractSubLIntegerBignum extends AbstractSubLInteger implements SubLNumber, SubLObject {
	 public AbstractSubLIntegerBignum(int value) {
		this.value = value;
	}

	@Override
	public Fixnum toLispObject() {
		return (Fixnum) this;
	}

	final public int value;

	LispInteger nextInt;

	@Override
	public LispInteger increment() {
		if (this.nextInt == null) {
			if(value == Integer.MAX_VALUE) {
				nextInt = Bignum.getInstance(1 + (long) value);
			} else {
				nextInt = Fixnum.getInstance(1 + value);
			}
		}
		return nextInt;
	}

	@Override
	public final LispObject incr() {
		return increment();
	}


	@Override
	public LispObject add(int n) {
		if (n == 0)
			return this;
		if (n == 1)
			return increment();
		return LispInteger.getInstance((long) value + n);
	}

	@Override
	public SubLNumber abs() {
		if (value == Integer.MIN_VALUE)
			return SubLObjectFactory.makeInteger(2147483648L);
		int result = Math.abs(value);
		return SubLObjectFactory.makeInteger(result);
	}

	@Override
	public SubLObject dec() {
		return SubLNumberFactory.makeInteger(value - (value == Integer.MIN_VALUE ? 1L : 1L));
	}

	@Override
	public double doubleValue() {
		return value;
	}

	@Override
	public float floatValue() {
		return value;
	}

	public Integer getInteger() {
		return new Integer(value);
	}

	@Override
	public Number getNativeNumber() {
		return getInteger();
	}


	@Override
	public final LispObject inc() {
		return increment();
	}


	public int integerDivide(int num) {
		int remainder = value % num;
		int quotient = (value - remainder) / num;
		return quotient;
	}

	@Override
	public SubLInteger integerDivide(SubLInteger num) {
		int numTyped = num.intValue();
		if(numTyped==1) {
			return this;
		}
		return SubLNumberFactory.makeInteger(this.integerDivide(numTyped));
	}

	@Override
	public int intValue() {
		return value;
	}

	@Override
	public boolean isEven() {
		return value % 2 == 0;
	}

	@Override
	public boolean isNegative() {
		return value < 0;
	}

	@Override
	public boolean isOdd() {
		return value % 2 != 0;
	}

	@Override
	public boolean isPositive() {
		return value > 0;
	}

	@Override
	public boolean isZero() {
		return value == 0;
	}

	@Override
	public long longValue() {
		return value;
	}

	@Override
	public SubLObject mult(SubLObject num) {
		if (num.getNumSize() > 0)
			return num.mult(this);
		return SubLNumberFactory.makeInteger((long) value * (long) num.intValue());
	}

	@Override
	public String printObject() {
		return "" + value;
	}
}
