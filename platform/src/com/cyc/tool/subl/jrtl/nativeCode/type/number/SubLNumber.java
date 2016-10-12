/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.type.number;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

//// Internal Imports

//// External Imports

public interface SubLNumber extends SubLObject, Comparable {

	public static int FOUR_BYTE_INTEGER = 0;

	public static int EIGHT_BYTE_INTEGER = 1;

	public static int BIGINT_INTEGER = 2;

	public static int FLOATING_POINT = 3;

	SubLNumber abs();

	SubLNumber add(SubLNumber num);

	SubLNumber arcCosine();

	SubLNumber arcSine();

	SubLNumber arcTangent();

	BigInteger bigIntegerValue();

	SubLInteger ceiling();

	SubLNumber cosine();

	SubLNumber decrement();

	SubLNumber decrement(SubLNumber decrementSize);

	SubLNumber divide(SubLNumber num);

	double doubleValue();

	SubLFloat fceiling();

	SubLFloat ffloor();

	float floatValue();

	SubLInteger floor();

	SubLFloat fround();

	SubLFloat ftruncate();

	Number getNativeNumber();

	int getNumSize();

	boolean greaterThanInternal(SubLObject num);

	boolean greaterThanOrEqualInternal(SubLObject num);

	SubLNumber hyperbolicArcCosine();

	SubLNumber hyperbolicArcSine();

	SubLNumber hyperbolicArcTangent();

	SubLNumber hyperbolicCosine();

	SubLNumber hyperbolicSine();

	SubLNumber hyperbolicTangent();

	SubLNumber increment();

	SubLNumber increment(SubLNumber incrementSize);

	int intValue();

	boolean isNegative();

	boolean isPositive();

	boolean isZero();

	boolean lessThanInternal(SubLObject num);

	boolean lessThanOrEqualInternal(SubLObject num);

	SubLNumber log();

	SubLNumber log(SubLNumber base);

	long longValue();

	SubLNumber max(SubLNumber num);

	SubLNumber min(SubLNumber min);

	SubLInteger mod(SubLNumber divisor);

	SubLNumber multiply(SubLNumber num);

	boolean numE(SubLObject num);

	boolean numericallyEqualInternal(SubLObject num);

	boolean numG(SubLObject num);

	boolean numGE(SubLObject num);

	boolean numL(SubLObject num);

	boolean numLE(SubLObject num);

	SubLNumber pow(SubLNumber power);

	SubLInteger remainder(SubLNumber divisor);

	SubLInteger round();

	SubLNumber sigNum();

	SubLNumber sine();

	SubLNumber sqrt(SubLNumber num);

	SubLNumber subtract(SubLNumber num);

	SubLNumber tangent();

	SubLInteger truncate();

}
