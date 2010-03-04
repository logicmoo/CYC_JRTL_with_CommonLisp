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

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;
import java.util.Arrays;
import java.util.List;

//// Internal Imports

//// External Imports

public  final class SubLVector extends AbstractSubLArraySequence implements SubLSequence, CommonSymbols {
  
  //// Constructors
  
  /** Creates a new instance of SubLVector. */
  public SubLVector(int length) {
    this(length, NIL);
  }
  
  public SubLVector(int length, SubLObject value) {
    vect = new SubLObject[length];
    Arrays.fill(vect, value);
    size = vect.length;
  }
  
  public SubLVector(List<SubLObject> list) {
    this((SubLObject[])list.toArray(new SubLObject[list.size()]));
  }
  
  SubLVector(SubLObject[] vect) {
    this.vect = vect;
    size = vect.length;
  }
  
  //// Public Area
  
  public final boolean isArrayBased() {
    return true;
  }
  
  public final SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
    return new SubLVector((SubLObject[])newBuf.toArray(new SubLObject[newBuf.size()]));
  }
  
  public String toString() {
    if (PrintLow.shouldPrintAtCurrentLevel()) {
      final SubLObject oldLevel = PrintLow.maybeIncreasePrintLevel();
      try {
        StringBuilder buf = new StringBuilder("#(");
        final boolean checkLength = PrintLow.controlPrintLength();
        final int printLength = PrintLow.maxPrintLength();
        int counter = 0;
        boolean terminatedEarly = false;
        for (int i = 0; i < size; i++) {
          buf.append(vect[i]);
          if (checkLength) {
            counter++;
            if (counter >= printLength) {
              buf.append(" ... ");
              terminatedEarly = true;
              break;
            }
          }
          if (i < (size - 1)) { buf.append(" "); }
        }
        buf.append(")");
        return buf.toString();
      } finally {
        PrintLow.maybeDecreasePrintLevel(oldLevel);
      }
    } else {
      return "#( # )";
    }
  }
  
  public boolean equals(Object obj) {
    if (obj == this) { return true; }
    if (obj == null) { return false; }
    if (!(obj instanceof SubLObject)) { return false; }
    SubLObject sublObj = (SubLObject)obj;
    if (!sublObj.isVector()) { return false; }
    SubLVector otherVect = sublObj.toVect();
    if (size != otherVect.size) { return false; }
    for (int i = 0; i < size; i++) {
      if (!(vect[i].equals(otherVect.vect[i]))) {
        return false;
      }
    }
    return true;
  }
  
  public boolean equalp(SubLObject obj) {
    if (obj == this) { return true; }
    if (obj == null) { return false; }
    if (!obj.isVector()) { return false; }
    SubLVector otherVect = obj.toVect();
    if (size != otherVect.size) { return false; }
    for (int i = 0; i < size; i++) {
      if (!(vect[i].equalp(otherVect.vect[i]))) {
        return false;
      }
    }
    return true;
  }
  
  private static final int SXHASH_TYPE_SPEC_PRIME_VECTOR = 199;
  
  public int hashCode(int currentDepth) {
    if (currentDepth >=  MAX_HASH_DEPTH) { return DEFAULT_EXCEEDED_HASH_VALUE; }
    int compositeHash  = SXHASH_TYPE_SPEC_PRIME_VECTOR;
    int compositeState = Sxhash.INITIAL_COMPOSITE_STATE;
    
    for (int i = 0; (i < size) && (i < MAX_HASH_LENGTH); i++) {
      int partHash = vect[i].hashCode(currentDepth + 1);
      compositeState = Sxhash.updateCompositeState(compositeState);
      compositeHash  = Sxhash.compositeUpdate(compositeHash, partHash, compositeState);
    }
    return compositeHash;
  }
  
  public int size() {
    return size;
  }
  
  public SubLObject get(int i) {
    return vect[i];
  }
  
  public void set(int i, SubLObject obj) {
    vect[i] = obj;
  }
  
  public boolean isEmpty() {
    return (size == 0);
  }
  
  /** @Note this is dangerous...returns internal guts...consider using clone() instead. */
  public Object[] toArray() {
    return vect;
  }
  
  public Object[] toArray(Object[] obj) {
    for (int i = 0, size1 = (obj.length < size) ? obj.length : size; i < size1; i++) {
      obj[i] = vect[i];
    }
    return obj;
  }
  
  public static String VECTOR_TYPE_NAME = "VECTOR";
  
  public String toTypeName() {
    return VECTOR_TYPE_NAME;
  }
  
  public SubLSequence sort(boolean isDestructive, final BinaryFunction pred,
      final UnaryFunction key) {
    SubLVector result = isDestructive ? this : makeCopy().toVect();
    if (key == IDENTITY_UNARY_FUNC) {
      Arrays.sort(result.vect, new ComparatorIdentityKey<SubLObject>(pred));  //@todo get rid of new
    } else {
      Arrays.sort(result.vect, new ComparatorGenericKey<SubLObject>(pred, key));  //@todo get rid of new
    }
    return result;
  }
  
  public final SubLSequence delete(int startIndex, int endIndexExclusive) {
    if (endIndexExclusive <= startIndex) { return this; }
    int deleteCount = endIndexExclusive - startIndex;
    for (int i = endIndexExclusive, j = startIndex; i < size; i++, j++) {
      vect[j] = vect[i];
    }
    for (int i = size - deleteCount; i < size; i++) {
      vect[i] = null;
    }
    size -= deleteCount;
    return this;
  }
  
  public final Object clone() {
    return makeCopy();
  }
  
  public final SubLObject makeCopy() {
    return new SubLVector((SubLObject[])toArray(new SubLObject[size]));
  }
  
  public final SubLObject makeDeepCopy() {
    Errors.unimplementedMethod("SubLVector.makeDeepCopy()");
    return null;
  }
  
  public final boolean canFastHash() {
    return false;
  }
  
  public final SubLSymbol getType(){
    return Types.$dtp_vector$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.THIRTY_THREE_INTEGER;
  }
  
  /** Method created to avoid casting */
  public final SubLVector toVect() { // SubLVector
    return this;
  }
  
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return true; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return true; }
  public final boolean isFunction() { return false; }
  public final boolean isFunctionSpec() { return false; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  public static final SubLVector EMPTY_VECTOR = new SubLVector(0);
  
//// Protected Area
  
//// Private Area
  
  
//// Internal Rep
  
  private SubLObject[] vect;
  private int size = 0;
  
//// Main
  
}
