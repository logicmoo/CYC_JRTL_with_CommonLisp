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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;

//// External Imports

public  abstract class AbstractSubLIntegerBignum extends AbstractSubLInteger implements SubLNumber, SubLObject {
  
  //// Constructors
  
  AbstractSubLIntegerBignum(int value) {
    this.value = value;
  }
  
  //// Public Area
  
   public final SubLObject inc() {
    return SubLNumberFactory.makeInteger(value + ((value == Integer.MAX_VALUE) ? 1L : 1));
  }

  public final SubLObject dec() {
    return SubLNumberFactory.makeInteger(value - ((value == Integer.MIN_VALUE) ? 1L : 1));
  }
  
  public final SubLObject mult(SubLObject num) {
    if (num.getNumSize() > FOUR_BYTE_INTEGER) {
      return num.mult(this);
    }
    return SubLNumberFactory.makeInteger((long)value * (long)num.intValue());
  }
  
  public final String toString() {
    return "" + value;
  }
  
  public final boolean isPositive() { // SubLNumber
    return value > 0;
  }
  
  public final boolean isNegative() {
    return value < 0;
  }
  
  public final boolean isZero() {
    return value == 0;
  }
  
  public final SubLNumber abs() {
    if (value == Integer.MIN_VALUE) {
      return SubLObjectFactory.makeInteger(-(long)Integer.MIN_VALUE);
    }
    int result = Math.abs(value);
    return SubLObjectFactory.makeInteger(result);
  }
  
  public final Number getNativeNumber() {
    return getInteger();
  }
  
  public final Integer getInteger() {
    return new Integer(value);
  }
  
  public final double doubleValue() {
    return (double)value;
  }
  
  public final float floatValue() {
    return (float)value;
  }
  
  public final int intValue() {
    return value;
  }
  
  public final long longValue() {
    return (long)value;
  }
  
  public final boolean isEven() {
    return (value % 2) == 0;
  }
  
  public final boolean isOdd() {
    return (value % 2) != 0;
  }
  
  public final SubLInteger integerDivide(SubLInteger num) {
    int numTyped = num.intValue();
    return SubLNumberFactory.makeInteger(this.integerDivide(numTyped));
  }
  
  public final int integerDivide(int num) {
    int remainder = value % num;
    int quotient = (value - remainder) / num;
    return quotient;
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  final protected int value;
  
}
