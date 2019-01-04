//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;

public abstract class AbstractSubLArraySequence extends AbstractSubLSequence implements SubLSequence {
	@Override
	public Object clone() {
		Errors.unimplementedMethod("AbstractSubLArraySequence.clone()");
		return null;
	}

	@Override
	public SubLSequence concatenate(SubLObject[] sequences) {
		return AbstractSubLSequence.concatenate(this, sequences);
	}

	@Override
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.count(this, item, test, key, start, end);
	}

	@Override
	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.countIf(this, test, key, start, end);
	}

	@Override
	public SubLSequence fill(SubLObject item, int start, int end) {
		return AbstractSubLSequence.fill(this, item, start, end);
	}

	@Override
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.find(this, item, test, key, start, end);
	}

	@Override
	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.findIf(this, test, key, start, end);
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		return AbstractSubLSequence.indexOfMismatch(this, otherSeq, test, key, start1, end1, start2, end2);
	}

	@Override
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.positionOf(this, item, test, key, start, end);
	}

	@Override
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return AbstractSubLSequence.positionOfIf(this, test, key, start, end);
	}

	@Override
	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		return AbstractSubLSequence.reduce(this, func, start, end, initialValue);
	}

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		return AbstractSubLSequence.remove(this, item, isDestructive, test, key, start, end, count);
	}

	@Override
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		return AbstractSubLSequence.removeDuplicates(this, isDestructive, test, key, start, end);
	}

	public SubLSequence removeDuplicatesFast(BinaryFunction test, int start, int end) {
		return AbstractSubLSequence.removeDuplicatesFast(this, test, start, end);
	}

	@Override
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		return AbstractSubLSequence.removeIf(this, test, isDestructive, key, start, end, count);
	}

	@Override
	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int end2) {
		return AbstractSubLSequence.replace(this, seq, start1, end1, start2, end2);
	}

	@Override
	public SubLSequence reverse(boolean isDestructive) {
		return AbstractSubLSequence.reverse(this, isDestructive);
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		return AbstractSubLSequence.search(this, otherSeq, test, key, start1, end1, start2, end2);
	}

	@Override
	public SubLSequence subSeq(int start, int end) {
		return AbstractSubLSequence.subSeq(this, start, end);
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		return AbstractSubLSequence.substitute(this, newItem, oldItem, isDestructive, test, key, start, end, count);
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		return AbstractSubLSequence.substituteIf(this, newItem, test, isDestructive, key, start, end, count);
	}
}
