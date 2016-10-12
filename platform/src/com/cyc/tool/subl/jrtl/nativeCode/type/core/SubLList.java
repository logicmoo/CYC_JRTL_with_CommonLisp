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

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.List;

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;

public interface SubLList extends SubLSequence, SubLObject {

	public static boolean ALLOW_REMOVE_DUPLICATES_FROM_END = true;

	SubLList addItem(SubLObject item);

	SubLList adjoin(SubLObject item);

	SubLList adjoin(SubLObject item, BinaryFunction test);

	SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key);

	SubLList allElementsButLast(int howMany, boolean isDestructive);

	SubLList append(SubLList list, boolean isReverse);

	SubLList asArrayList();

	SubLList asConsList();

	SubLList assoc(SubLObject item, BinaryFunction test, UnaryFunction key);

	SubLObject caar();

	SubLObject cadddr();

	SubLObject caddr();

	SubLObject cadr();

	SubLObject cdar();

	SubLObject cddddr();

	SubLObject cdddr();

	SubLObject cddr();

	SubLList concatenate(List list, boolean isDestructive, boolean isReverse);

	SubLList copyList();

	SubLList copyTree();

	SubLObject eighth();

	SubLObject fifth();

	/** car */
	SubLObject first();

	SubLObject fourth();

	SubLObject getDottedElement();

	SubLObject getf(SubLObject indicator, SubLObject defaultValue);

	SubLList intersection(SubLList item, boolean isDestructive);

	SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test);

	SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key);

	boolean isArrayBased();

	boolean isProper();

	boolean isSubList(SubLList sublist);

	boolean isSubSet(SubLList list);

	SubLObject last(int n);

	int listLength();

	SubLList listPrefix(SubLList postFix);

	SubLObject mapcar(SubLFunction functionTyped);

	SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists);

	SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists, boolean returnConsedResults);

	// as sets
	SubLList member(SubLObject item);

	SubLList member(SubLObject item, BinaryFunction test);

	SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key);

	SubLList memberIf(BinaryFunction test);

	SubLList memberIf(BinaryFunction test, UnaryFunction key);

	SubLObject ninth();

	SubLObject nthCdr(int index);

	SubLObject pop();

	SubLCons push(SubLObject item);

	SubLCons pushNew(SubLObject item);

	SubLCons pushNew(SubLObject item, BinaryFunction test);

	SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key);

	SubLList putf(SubLObject indicator, SubLObject value);

	SubLList remf(SubLObject indicator);

	/** cdr */
	SubLObject rest();

	SubLObject second();

	SubLList setDifference(SubLList item, boolean isDestructive);

	SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test);

	SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key);

	SubLObject setDottedElement(SubLObject dottedElement);

	// destructive modification primitives
	SubLCons setFirst(SubLObject first);

	SubLCons setRest(SubLObject rest);

	SubLList setXor(SubLList item, boolean isDestructive);

	SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test);

	SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key);

	SubLObject seventh();

	SubLObject sixth();

	// sustitutions
	SubLList substituteFromAList(SubLList alist, boolean isDestructive);

	SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test);

	SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key);

	SubLObject tenth();

	SubLObject third();

	Object[] toArray(Object a[]);

	SubLObject[] toSubLObjectArray();

	SubLList treeEqual(SubLList tree1, SubLList tree2);

	SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test);

	SubLList union(SubLList item, boolean isDestructive);

	SubLList union(SubLList item, boolean isDestructive, BinaryFunction test);

	SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key);
}
