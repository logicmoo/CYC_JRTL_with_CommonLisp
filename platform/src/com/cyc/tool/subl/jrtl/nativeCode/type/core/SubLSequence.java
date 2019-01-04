//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface SubLSequence extends SubLObject, Cloneable {
	public static int ALL_OCCURRENCES = Integer.MAX_VALUE;
	public static int NOT_FOUND = -2;
	public static int MATCH_EVERYWHERE = -3;
	public static SubLSymbol NO_INIT_VALUE = SubLObjectFactory.makeKeyword("%NONE%");

	SubLSequence concatenate(SubLObject[] p0);

	SubLSequence concatenate(SubLSequence p0);

	int count(SubLObject p0);

	int count(SubLObject p0, BinaryFunction p1);

	int count(SubLObject p0, BinaryFunction p1, UnaryFunction p2);

	int count(SubLObject p0, BinaryFunction p1, UnaryFunction p2, int p3);

	int count(SubLObject p0, BinaryFunction p1, UnaryFunction p2, int p3, int p4);

	int countIf(UnaryFunction p0);

	int countIf(UnaryFunction p0, UnaryFunction p1);

	int countIf(UnaryFunction p0, UnaryFunction p1, int p2);

	int countIf(UnaryFunction p0, UnaryFunction p1, int p2, int p3);

	SubLSequence delete(int p0, int p1);

	SubLSequence deleteItems(boolean[] p0, int p1);

	SubLSequence fill(SubLObject p0);

	SubLSequence fill(SubLObject p0, int p1);

	SubLSequence fill(SubLObject p0, int p1, int p2);

	SubLObject find(SubLObject p0);

	SubLObject find(SubLObject p0, BinaryFunction p1);

	SubLObject find(SubLObject p0, BinaryFunction p1, UnaryFunction p2);

	SubLObject find(SubLObject p0, BinaryFunction p1, UnaryFunction p2, int p3);

	SubLObject find(SubLObject p0, BinaryFunction p1, UnaryFunction p2, int p3, int p4);

	SubLObject findIf(UnaryFunction p0);

	SubLObject findIf(UnaryFunction p0, UnaryFunction p1);

	SubLObject findIf(UnaryFunction p0, UnaryFunction p1, int p2);

	SubLObject findIf(UnaryFunction p0, UnaryFunction p1, int p2, int p3);

	@Override
	SubLObject get(int p0);

	int indexOfMismatch(SubLSequence p0);

	int indexOfMismatch(SubLSequence p0, BinaryFunction p1);

	int indexOfMismatch(SubLSequence p0, BinaryFunction p1, UnaryFunction p2);

	int indexOfMismatch(SubLSequence p0, BinaryFunction p1, UnaryFunction p2, int p3);

	int indexOfMismatch(SubLSequence p0, BinaryFunction p1, UnaryFunction p2, int p3, int p4);

	int indexOfMismatch(SubLSequence p0, BinaryFunction p1, UnaryFunction p2, int p3, int p4, int p5);

	int indexOfMismatch(SubLSequence p0, BinaryFunction p1, UnaryFunction p2, int p3, int p4, int p5, int p6);

	SubLSequence makeSequenceFromJavaList(List<SubLObject> p0);

	SubLSequence merge(SubLSequence p0, BinaryFunction p1);

	SubLSequence merge(SubLSequence p0, BinaryFunction p1, UnaryFunction p2);

	int positionOf(SubLObject p0);

	int positionOf(SubLObject p0, BinaryFunction p1);

	int positionOf(SubLObject p0, BinaryFunction p1, UnaryFunction p2);

	int positionOf(SubLObject p0, BinaryFunction p1, UnaryFunction p2, int p3);

	int positionOf(SubLObject p0, BinaryFunction p1, UnaryFunction p2, int p3, int p4);

	int positionOfIf(UnaryFunction p0);

	int positionOfIf(UnaryFunction p0, UnaryFunction p1);

	int positionOfIf(UnaryFunction p0, UnaryFunction p1, int p2);

	int positionOfIf(UnaryFunction p0, UnaryFunction p1, int p2, int p3);

	SubLObject reduce(BinaryFunction p0);

	SubLObject reduce(BinaryFunction p0, int p1);

	SubLObject reduce(BinaryFunction p0, int p1, int p2);

	SubLObject reduce(BinaryFunction p0, int p1, int p2, SubLObject p3);

	SubLSequence remove(SubLObject p0, boolean p1);

	SubLSequence remove(SubLObject p0, boolean p1, BinaryFunction p2);

	SubLSequence remove(SubLObject p0, boolean p1, BinaryFunction p2, UnaryFunction p3);

	SubLSequence remove(SubLObject p0, boolean p1, BinaryFunction p2, UnaryFunction p3, int p4);

	SubLSequence remove(SubLObject p0, boolean p1, BinaryFunction p2, UnaryFunction p3, int p4, int p5);

	SubLSequence remove(SubLObject p0, boolean p1, BinaryFunction p2, UnaryFunction p3, int p4, int p5, int p6);

	SubLSequence removeDuplicates(boolean p0);

	SubLSequence removeDuplicates(boolean p0, BinaryFunction p1);

	SubLSequence removeDuplicates(boolean p0, BinaryFunction p1, UnaryFunction p2);

	SubLSequence removeDuplicates(boolean p0, BinaryFunction p1, UnaryFunction p2, int p3);

	SubLSequence removeDuplicates(boolean p0, BinaryFunction p1, UnaryFunction p2, int p3, int p4);

	SubLSequence removeIf(UnaryFunction p0, boolean p1);

	SubLSequence removeIf(UnaryFunction p0, boolean p1, UnaryFunction p2);

	SubLSequence removeIf(UnaryFunction p0, boolean p1, UnaryFunction p2, int p3);

	SubLSequence removeIf(UnaryFunction p0, boolean p1, UnaryFunction p2, int p3, int p4, int p5);

	SubLSequence replace(SubLSequence p0);

	SubLSequence replace(SubLSequence p0, int p1);

	SubLSequence replace(SubLSequence p0, int p1, int p2);

	SubLSequence replace(SubLSequence p0, int p1, int p2, int p3);

	SubLSequence replace(SubLSequence p0, int p1, int p2, int p3, int p4);

	@Override
	SubLSequence reverse(boolean p0);

	int search(SubLSequence p0);

	int search(SubLSequence p0, BinaryFunction p1);

	int search(SubLSequence p0, BinaryFunction p1, UnaryFunction p2);

	int search(SubLSequence p0, BinaryFunction p1, UnaryFunction p2, int p3);

	int search(SubLSequence p0, BinaryFunction p1, UnaryFunction p2, int p3, int p4);

	int search(SubLSequence p0, BinaryFunction p1, UnaryFunction p2, int p3, int p4, int p5);

	int search(SubLSequence p0, BinaryFunction p1, UnaryFunction p2, int p3, int p4, int p5, int p6);

	@Override
	void set(int p0, SubLObject p1);

	@Override
	int size();

	SubLSequence sort(boolean p0, BinaryFunction p1);

	SubLSequence sort(boolean p0, BinaryFunction p1, UnaryFunction p2);

	SubLSequence subSeq(int p0);

	SubLSequence subSeq(int p0, int p1);

	SubLSequence substitute(SubLObject p0, SubLObject p1, boolean p2);

	SubLSequence substitute(SubLObject p0, SubLObject p1, boolean p2, BinaryFunction p3);

	SubLSequence substitute(SubLObject p0, SubLObject p1, boolean p2, BinaryFunction p3, UnaryFunction p4);

	SubLSequence substitute(SubLObject p0, SubLObject p1, boolean p2, BinaryFunction p3, UnaryFunction p4, int p5);

	SubLSequence substitute(SubLObject p0, SubLObject p1, boolean p2, BinaryFunction p3, UnaryFunction p4, int p5,
			int p6);

	SubLSequence substitute(SubLObject p0, SubLObject p1, boolean p2, BinaryFunction p3, UnaryFunction p4, int p5,
			int p6, int p7);

	SubLSequence substituteIf(SubLObject p0, UnaryFunction p1, boolean p2);

	SubLSequence substituteIf(SubLObject p0, UnaryFunction p1, boolean p2, UnaryFunction p3);

	SubLSequence substituteIf(SubLObject p0, UnaryFunction p1, boolean p2, UnaryFunction p3, int p4);

	SubLSequence substituteIf(SubLObject p0, UnaryFunction p1, boolean p2, UnaryFunction p3, int p4, int p5);

	SubLSequence substituteIf(SubLObject p0, UnaryFunction p1, boolean p2, UnaryFunction p3, int p4, int p5, int p6);
}
