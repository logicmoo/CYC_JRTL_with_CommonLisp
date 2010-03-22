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

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractSubLArray;
import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AbstractSubLVector;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;

//// External Imports

 
public  abstract class AbstractSubLArraySequence extends AbstractSubLVector implements SubLSequence {
  
  //// Constructors
  
  //// Public Area
  
  public Object clone() {
    Errors.unimplementedMethod("AbstractSubLArraySequence.clone()");
    return null;
  }
  
  public SubLSequence subSeq(int start, int end) {
    return subSeq(this, start, end);
  }
  
  public final SubLSequence reverse(boolean isDestructive) {
    return reverse(this, isDestructive);
  }
  
  public final SubLSequence concatenate(SubLObject[] sequences) {
    return concatenate(this, sequences);
  }
  
  public final int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
    return positionOf(this, item, test, key, start, end);
  }
  
  public final int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
    return positionOfIf(this, test, key, start, end);
  }
  
  public final SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
    return find(this, item, test, key, start, end);
  }
  
  public final SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
    return findIf(this, test, key, start, end);
  }
  
  public final SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int end2) {
    return replace(this, seq, start1, end1, start2, end2);
  }
  
  public final SubLSequence fill(SubLObject item, int start, int end) {
    return fill(this, item, start, end);
  }
  
  public final SubLSequence removeDuplicates(boolean isDestructive, 
      BinaryFunction test, UnaryFunction key, int start, int end) {
    return removeDuplicates(this, isDestructive, test, key, start, end);
  }
  
  public final SubLSequence removeDuplicatesFast(BinaryFunction test, int start, int end) {
    return removeDuplicatesFast(this, test, start, end);
  }
  
  public final SubLSequence remove(SubLObject item, boolean isDestructive,
      BinaryFunction test, UnaryFunction key, int start, int end, int count) {
    return remove(this, item, isDestructive, test, key, start, end, count);
  }
  
  public final SubLSequence removeIf(UnaryFunction test, boolean isDestructive,
      UnaryFunction key, int start, int end, int count) {
    return removeIf(this, test, isDestructive, key, start, end, count);
  }
  
  public final SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
    return reduce(this, func, start, end, initialValue);
  }
  
  public final SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive,
      BinaryFunction test, UnaryFunction key, int start, int end, int count) {
    return substitute(this, newItem, oldItem, isDestructive, test, key, start, end, count);
  }
  
  public final SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive,
      UnaryFunction key, int start, int end, int count) {
    return substituteIf(this, newItem, test, isDestructive, key, start, end, count);
  }
  
  public final int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
    return count(this, item, test, key, start, end);
  }
  
  public final int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
    return countIf(this, test, key, start, end);
  }
  
  public final int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test,
      UnaryFunction key, int start1, int end1, int start2, int end2) {
    return indexOfMismatch(this, otherSeq, test, key, start1, end1, start2, end2);
  }
  
  public final int search(SubLSequence otherSeq, BinaryFunction test,
      UnaryFunction key, int start1, int end1, int start2, int end2) {
    return search(this, otherSeq, test, key, start1, end1, start2, end2);
  }
  
  //// Internal Rep
  
  //// Main
  
}
