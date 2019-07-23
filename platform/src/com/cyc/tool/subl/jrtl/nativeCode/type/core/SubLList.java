/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;

public interface SubLList extends SubLSequence, SubLObject {
	public static boolean ALLOW_REMOVE_DUPLICATES_FROM_END = true;

	SubLList addItem(SubLObject p0);

	SubLList adjoin(SubLObject p0);

	SubLList adjoin(SubLObject p0, BinaryFunction p1);

	SubLList adjoin(SubLObject p0, BinaryFunction p1, UnaryFunction p2);

	SubLList allElementsButLast(int p0, boolean p1);

	SubLList append(SubLList p0, boolean p1);

	@Override
	SubLList asArrayList();

	@Override
	SubLList asConsList();

	SubLList assoc(SubLObject p0, BinaryFunction p1, UnaryFunction p2);

	SubLObject caar();

	SubLObject cadddr();

	SubLObject caddr();

	SubLObject cadr();

	SubLObject cdar();

	SubLObject cddddr();

	SubLObject cdddr();

	SubLObject cddr();

	SubLList concatenate(List p0, boolean p1, boolean p2);

	SubLList copyList();

	SubLList copyTree();

	@Override
	SubLObject eighth();

	@Override
	SubLObject fifth();

	@Override
	SubLObject first();

	@Override
	SubLObject fourth();

	SubLObject getDottedElement();

	SubLObject getf(SubLObject p0, SubLObject p1);

	SubLList intersection(SubLList p0, boolean p1);

	SubLList intersection(SubLList p0, boolean p1, BinaryFunction p2);

	SubLList intersection(SubLList p0, boolean p1, BinaryFunction p2, UnaryFunction p3);

	@Override
	boolean isArrayBased();

	boolean isProper();

	boolean isSubList(SubLList p0);

	boolean isSubSet(SubLList p0);

	@Override
	SubLObject last(int p0);

	int listLength();

	SubLList listPrefix(SubLList p0);

	SubLObject mapcar(SubLFunction p0);

	SubLObject mapcar(SubLFunction p0, SubLObject[] p1);

	SubLObject mapcar(SubLFunction p0, SubLObject[] p1, boolean p2);

	SubLList member(SubLObject p0);

	SubLList member(SubLObject p0, BinaryFunction p1);

	SubLList member(SubLObject p0, BinaryFunction p1, UnaryFunction p2);

	SubLList memberIf(BinaryFunction p0);

	SubLList memberIf(BinaryFunction p0, UnaryFunction p1);

	@Override
	SubLObject ninth();

	@Override
	SubLObject nthCdr(int p0);

	SubLObject pop();

	SubLCons push(SubLObject p0);

	SubLCons pushNew(SubLObject p0);

	SubLCons pushNew(SubLObject p0, BinaryFunction p1);

	SubLCons pushNew(SubLObject p0, BinaryFunction p1, UnaryFunction p2);

	SubLList putf(SubLObject p0, SubLObject p1);

	SubLList remf(SubLObject p0);

	@Override
	SubLObject rest();

	@Override
	SubLObject second();

	SubLList setDifference(SubLList p0, boolean p1);

	SubLList setDifference(SubLList p0, boolean p1, BinaryFunction p2);

	SubLList setDifference(SubLList p0, boolean p1, BinaryFunction p2, UnaryFunction p3);

	SubLObject setDottedElement(SubLObject p0);

	@Override
	SubLCons setFirst(SubLObject p0);

	@Override
	SubLCons setRest(SubLObject p0);

	SubLList setXor(SubLList p0, boolean p1);

	SubLList setXor(SubLList p0, boolean p1, BinaryFunction p2);

	SubLList setXor(SubLList p0, boolean p1, BinaryFunction p2, UnaryFunction p3);

	@Override
	SubLObject seventh();

	@Override
	SubLObject sixth();

	SubLList substituteFromAList(SubLList p0, boolean p1);

	SubLList substituteFromAList(SubLList p0, boolean p1, BinaryFunction p2);

	SubLList substituteFromAList(SubLList p0, boolean p1, BinaryFunction p2, UnaryFunction p3);

	@Override
	SubLObject tenth();

	@Override
	SubLObject third();

	Object[] toArray(Object[] p0);

	SubLObject[] toSubLObjectArray();

	SubLList treeEqual(SubLList p0, SubLList p1);

	SubLList treeEqual(SubLList p0, SubLList p1, BinaryFunction p2);

	SubLList union(SubLList p0, boolean p1);

	SubLList union(SubLList p0, boolean p1, BinaryFunction p2);

	SubLList union(SubLList p0, boolean p1, BinaryFunction p2, UnaryFunction p3);
}
