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

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import java.util.*;

public  interface SubLList extends SubLSequence, SubLObject {

  /** cdr */
  SubLObject rest();
  
  /** car */
  SubLObject first();
  SubLObject second();
  SubLObject third();
  SubLObject fourth();
  SubLObject fifth();
  SubLObject sixth();
  SubLObject seventh();
  SubLObject eighth();
  SubLObject ninth();
  SubLObject tenth();

  SubLObject caar();
  SubLObject cadr();
  SubLObject cdar();
  SubLObject cddr();
  SubLObject caddr();
  SubLObject cdddr();
  SubLObject cadddr();
  SubLObject cddddr();
  
  boolean isProper();
  
  SubLList addItem(SubLObject item);
  
  SubLObject mapcar(SubLFunction functionTyped);
  SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists);
  SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists, boolean returnConsedResults);
  
  SubLObject nthCdr(int index);
  SubLCons push(SubLObject item);
  SubLCons pushNew(SubLObject item);
  SubLCons pushNew(SubLObject item, BinaryFunction test);
  SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key);
  SubLObject pop();
  SubLObject last(int n);
  SubLList append(SubLList list, boolean isReverse);
  SubLList copyList();
  SubLList copyTree();
  SubLList treeEqual(SubLList tree1, SubLList tree2);
  SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test);
  SubLList concatenate(List list, boolean isDestructive, boolean isReverse);
  SubLList allElementsButLast(int howMany, boolean isDestructive);
  SubLList listPrefix(SubLList postFix);
  int listLength();
  
  // sustitutions
  SubLList substituteFromAList(SubLList alist, boolean isDestructive);
  SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test);
  SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key);
  
  // as sets
  SubLList member(SubLObject item); 
  SubLList member(SubLObject item, BinaryFunction test); 
  SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key);
  SubLList memberIf(BinaryFunction test);  
  SubLList memberIf(BinaryFunction test, UnaryFunction key);
  boolean isSubList(SubLList sublist);
  SubLList adjoin(SubLObject item); 
  SubLList adjoin(SubLObject item, BinaryFunction test); 
  SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key);
  SubLList union(SubLList item, boolean isDestructive); 
  SubLList union(SubLList item, boolean isDestructive, BinaryFunction test); 
  SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key);
  SubLList intersection(SubLList item, boolean isDestructive); 
  SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test); 
  SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key);
  SubLList setDifference(SubLList item, boolean isDestructive); 
  SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test); 
  SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key);
  SubLList setXor(SubLList item, boolean isDestructive); 
  SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test); 
  SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key);
  boolean isSubSet(SubLList list);
  SubLList assoc(SubLObject item, BinaryFunction test, UnaryFunction key);
  
  SubLObject getf(SubLObject indicator, SubLObject defaultValue);
  SubLList putf(SubLObject indicator, SubLObject value);
  SubLList remf(SubLObject indicator);
  
  // destructive modification primitives
  SubLCons setFirst(SubLObject first);
  SubLCons setRest(SubLObject rest);
  
  SubLObject setDottedElement(SubLObject dottedElement);
  SubLObject getDottedElement();
  
  SubLObject[] toSubLObjectArray();
  Object[] toArray(Object a[]);
  
  SubLList asConsList();
  SubLList asArrayList();
  boolean isArrayBased();
  
  public static final boolean ALLOW_REMOVE_DUPLICATES_FROM_END = true;
}
