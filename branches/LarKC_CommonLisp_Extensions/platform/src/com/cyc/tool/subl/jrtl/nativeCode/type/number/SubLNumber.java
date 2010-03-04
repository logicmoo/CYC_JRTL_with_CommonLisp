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

package  com.cyc.tool.subl.jrtl.nativeCode.type.number;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import java.math.BigInteger;

//// Internal Imports

//// External Imports

public  interface SubLNumber extends SubLObject, Comparable {
  
  double doubleValue();
  
  float floatValue();
  
  int intValue();
  
  long longValue();
  
  BigInteger bigIntegerValue();
  
  Number getNativeNumber();
  
  int getNumSize();
  
  public static final int FOUR_BYTE_INTEGER = 0;
  public static final int EIGHT_BYTE_INTEGER = 1;
  public static final int BIGINT_INTEGER = 2;
  public static final int FLOATING_POINT = 3;
  
  
  boolean numericallyEqualInternal(SubLObject num);
  boolean lessThanInternal(SubLObject num);
  boolean lessThanOrEqualInternal(SubLObject num);
  boolean greaterThanInternal(SubLObject num);
  boolean greaterThanOrEqualInternal(SubLObject num);
  
  boolean numE(SubLObject num);
  boolean numL(SubLObject num);
  boolean numLE(SubLObject num);
  boolean numG(SubLObject num);
  boolean numGE(SubLObject num);
  
  boolean isZero();
  
  boolean isPositive();
  
  boolean isNegative();
  
  SubLNumber max(SubLNumber num);
  
  SubLNumber min(SubLNumber min);
  
  SubLNumber add(SubLNumber num);
  
  SubLNumber subtract(SubLNumber num);
  
  SubLNumber multiply(SubLNumber num);
  
  SubLNumber divide(SubLNumber num);
  
  SubLNumber increment();
  
  SubLNumber increment(SubLNumber incrementSize);
  
  SubLNumber decrement();
  
  SubLNumber decrement(SubLNumber decrementSize);

  SubLNumber pow(SubLNumber power);
  
  SubLNumber log();
  
  SubLNumber log(SubLNumber base);
  
  SubLNumber sqrt(SubLNumber num);
  
  SubLNumber abs();
  
  SubLNumber sigNum();
  
  SubLNumber sine();
  
  SubLNumber cosine();
  
  SubLNumber tangent();
  
  SubLNumber arcSine();
  
  SubLNumber arcCosine();
  
  SubLNumber arcTangent();
  
  SubLNumber hyperbolicSine();
  
  SubLNumber hyperbolicCosine();
  
  SubLNumber hyperbolicTangent();
  
  SubLNumber hyperbolicArcSine();
  
  SubLNumber hyperbolicArcCosine();
  
  SubLNumber hyperbolicArcTangent();
  
  SubLInteger floor();
  
  SubLInteger ceiling();
  
  SubLInteger truncate();
  
  SubLInteger round();
  
  SubLFloat ffloor();
  
  SubLFloat fceiling();
  
  SubLFloat ftruncate();
  
  SubLFloat fround();
  
  SubLInteger mod(SubLNumber divisor);
  
  SubLInteger remainder(SubLNumber divisor);
  
}
