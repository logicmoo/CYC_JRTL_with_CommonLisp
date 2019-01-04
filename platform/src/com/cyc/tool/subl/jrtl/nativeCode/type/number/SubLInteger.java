//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public interface SubLInteger extends SubLNumber, SubLObject {
	SubLInteger and(SubLInteger p0);

	SubLInteger greatestCommonDivisor(SubLInteger p0);

	SubLInteger integerDivide(SubLInteger p0);

	SubLInteger integerLength();

	boolean isEven();

	boolean isOdd();

	SubLInteger leastCommonMultiple(SubLInteger p0);

	SubLInteger nand(SubLInteger p0);

	SubLInteger nor(SubLInteger p0);

	SubLInteger not(SubLInteger p0);

	SubLInteger or(SubLInteger p0);

	SubLInteger random();

	SubLInteger xnor(SubLInteger p0);

	SubLInteger xor(SubLInteger p0);

}
