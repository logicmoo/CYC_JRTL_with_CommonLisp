/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public interface SubLNumber extends SubLObject, Comparable {
	public static int FOUR_BYTE_INTEGER = 0;
	public static int EIGHT_BYTE_INTEGER = 1;
	public static int BIGINT_INTEGER = 2;
	public static int FLOATING_POINT = 3;

	SubLNumber abs();

	SubLNumber add(SubLNumber p0);

	SubLNumber arcCosine();

	SubLNumber arcSine();

	SubLNumber arcTangent();

	@Override
	BigInteger bigIntegerValue();

	SubLInteger ceiling();

	SubLNumber cosine();

	SubLNumber decrement();

	SubLNumber decrement(SubLNumber p0);

	SubLNumber divide(SubLNumber p0);

	@Override
	double doubleValue();

	SubLFloat fceiling();

	SubLFloat ffloor();

	float floatValue();

	SubLInteger floor();

	SubLFloat fround();

	SubLFloat ftruncate();

	Number getNativeNumber();

	@Override
	int getNumSize();

	boolean greaterThanInternal(SubLObject p0);

	boolean greaterThanOrEqualInternal(SubLObject p0);

	SubLNumber hyperbolicArcCosine();

	SubLNumber hyperbolicArcSine();

	SubLNumber hyperbolicArcTangent();

	SubLNumber hyperbolicCosine();

	SubLNumber hyperbolicSine();

	SubLNumber hyperbolicTangent();

	SubLNumber increment();

	SubLNumber increment(SubLNumber p0);

	@Override
	int intValue();

	@Override
	boolean isNegative();

	@Override
	boolean isPositive();

	@Override
	boolean isZero();

	boolean lessThanInternal(SubLObject p0);

	boolean lessThanOrEqualInternal(SubLObject p0);

	SubLNumber log();

	SubLNumber log(SubLNumber p0);

	@Override
	long longValue();

	SubLNumber max(SubLNumber p0);

	SubLNumber min(SubLNumber p0);

	SubLInteger mod(SubLNumber p0);

	SubLNumber multiply(SubLNumber p0);

	@Override
	boolean numE(SubLObject p0);

	boolean numericallyEqualInternal(SubLObject p0);

	@Override
	boolean numG(SubLObject p0);

	@Override
	boolean numGE(SubLObject p0);

	@Override
	boolean numL(SubLObject p0);

	@Override
	boolean numLE(SubLObject p0);

	SubLNumber pow(SubLNumber p0);

	SubLInteger remainder(SubLNumber p0);

	SubLInteger round();

	SubLNumber sigNum();

	SubLNumber sine();

	SubLNumber sqrt(SubLNumber p0);

	SubLNumber subtract(SubLNumber p0);

	SubLNumber tangent();

	SubLInteger truncate();
}
