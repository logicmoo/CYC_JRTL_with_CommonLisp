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

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.util.List;

public  interface SubLSequence extends SubLObject, Cloneable {
  
  public static final int ALL_OCCURRENCES = Integer.MAX_VALUE;
  public static final int NOT_FOUND = -2;
  public static final int MATCH_EVERYWHERE = -3;
  public static final SubLSymbol NO_INIT_VALUE = SubLObjectFactory.makeKeyword("%NONE%");
  
  int size();
  
  SubLObject get(int index);
  void set(int index, SubLObject newVal);
  
  SubLSequence subSeq(int start);
  SubLSequence subSeq(int start, int end);
  
  SubLSequence reverse(boolean isDestructive);
  
  SubLSequence concatenate(SubLSequence seq1);
  SubLSequence concatenate(SubLObject[] sequences);
  
  SubLObject reduce(BinaryFunction func);
  SubLObject reduce(BinaryFunction func, int start);
  SubLObject reduce(BinaryFunction func, int start, int end);
  SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue);
  
  SubLSequence fill(SubLObject item);
  SubLSequence fill(SubLObject item, int start);
  SubLSequence fill(SubLObject item, int start, int end);
  
  SubLSequence remove(SubLObject item, boolean isDestructive);
  SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test);
  SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test,
    UnaryFunction key);
  SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test,
    UnaryFunction key, int start);
  SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test,
    UnaryFunction key, int start, int end);
  SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test,
    UnaryFunction key, int start, int end, int count);
  
  SubLSequence removeIf(UnaryFunction test, boolean isDestructive);
  SubLSequence removeIf(UnaryFunction test, boolean isDestructive,
    UnaryFunction key);
  SubLSequence removeIf(UnaryFunction test, boolean isDestructive,
    UnaryFunction key, int start);
  SubLSequence removeIf(UnaryFunction test, boolean isDestructive,
    UnaryFunction key, int start, int end, int count);
  
  SubLSequence removeDuplicates(boolean isDestructive);
  SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test);
  SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test,
    UnaryFunction key);
  SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test,
    UnaryFunction key, int start);
  SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test,
    UnaryFunction key, int start, int end);
  
  SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive);
  SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive,
    BinaryFunction test);
  SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive,
    BinaryFunction test, UnaryFunction key);
  SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive,
    BinaryFunction test, UnaryFunction key, int start);
  SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive,
    BinaryFunction test, UnaryFunction key, int start, int end);
  SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive,
    BinaryFunction test, UnaryFunction key, int start, int end, int count);
  
  SubLSequence substituteIf(SubLObject newItem, UnaryFunction test,
    boolean isDestructive);
  SubLSequence substituteIf(SubLObject newItem, UnaryFunction test,
    boolean isDestructive, UnaryFunction key);
  SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, 
    boolean isDestructive, UnaryFunction key, int start);
  SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, 
    boolean isDestructive, UnaryFunction key, int start, int end);
  SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, 
    boolean isDestructive, UnaryFunction key, int start, int end, int count);
  
  SubLObject find(SubLObject item);
  SubLObject find(SubLObject item, BinaryFunction test);
  SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key);
  SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, 
    int start);
  SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, 
    int start, int end);
  
  SubLObject findIf(UnaryFunction test);
  SubLObject findIf(UnaryFunction test, UnaryFunction key);
  SubLObject findIf(UnaryFunction test, UnaryFunction key, int start);
  SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end);
    
  SubLSequence merge(SubLSequence otherSeq, BinaryFunction test);
  SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key);
  
  int positionOf(SubLObject item);
  int positionOf(SubLObject item, BinaryFunction test);
  int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key);
  int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start);
  int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end);
  
  int positionOfIf(UnaryFunction test);
  int positionOfIf(UnaryFunction test, UnaryFunction key);
  int positionOfIf(UnaryFunction test, UnaryFunction key, int start);
  int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end);
  
  int count(SubLObject item);
  int count(SubLObject item, BinaryFunction test);
  int count(SubLObject item, BinaryFunction test, UnaryFunction key);
  int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start);
  int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end);
  
  int countIf(UnaryFunction test);
  int countIf(UnaryFunction test, UnaryFunction key);
  int countIf(UnaryFunction test, UnaryFunction key, int start);
  int countIf(UnaryFunction test, UnaryFunction key, int start, int end);
  
  int indexOfMismatch(SubLSequence otherSeq);
  int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test);
  int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key);
  int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1);
  int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1, int end1);
  int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1, int end1, int start2);
  int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1, int end1, int start2, int end2);
  
  int search(SubLSequence otherSeq);
  int search(SubLSequence otherSeq, BinaryFunction test);
  int search(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key);
  int search(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1);
  int search(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1, int end1);
  int search(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1, int end1, int start2);
  int search(SubLSequence otherSeq, BinaryFunction test,
    UnaryFunction key, int start1, int end1, int start2, int end2);
  
  SubLSequence replace(SubLSequence seq);
  SubLSequence replace(SubLSequence seq, int start1);
  SubLSequence replace(SubLSequence seq, int start1, int end1);
  SubLSequence replace(SubLSequence seq, int start1, int end1, int start2);
  SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int end2);
  
  SubLSequence sort(boolean isDestructive, BinaryFunction pred);
  SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key);
  
  SubLSequence deleteItems(boolean[] itemsToDelete, int count);
  SubLSequence delete(int startIndex, int endIndexExclusive);
  
  SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf);
}
