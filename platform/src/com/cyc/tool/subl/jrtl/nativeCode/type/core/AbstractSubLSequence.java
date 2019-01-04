//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.ArrayList;
import java.util.Arrays;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

public abstract class AbstractSubLSequence extends FromSubLisp implements SubLSequence {
	public static void calcOptimalDeleteDuplicatesCutoff() {
		int iterations = 100000;
		int maxSize = 1000;
		int type = 0;
		int start = 2;
		SubLSequence theSeq = null;
		if (type == 0)
			theSeq = SubLNil.NIL;
		System.out.println("Calculating optimal delete duplicates cutoff.");
		System.gc();
		double lastN2Time1 = 0.0;
		double lastN2Time2 = 0.0;
		double lastN2Time3 = 0.0;
		for (int i = start; i < maxSize; ++i) {
			System.out.println("Trying delete duplicates cutoff of: " + i + ".");
			if (type == 0)
				theSeq = SubLObjectFactory.makeCons(SubLObjectFactory.makeInteger(i + i % 2), theSeq);
			else if (type == 1) {
				theSeq = SubLObjectFactory.makeVector(i);
				for (int k = 0; k < i; ++k)
					theSeq.set(k, SubLObjectFactory.makeInteger(k + k % 2));
			}
			FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = i + 2;
			FAST_DELETE_DUPLICATES_CONS_CUTOFF = i + 2;
			long startTime = System.nanoTime();
			for (int j = 0; j < iterations; ++j)
				theSeq.removeDuplicates(false);
			System.gc();
			long endTime = System.nanoTime();
			lastN2Time3 = lastN2Time2;
			lastN2Time2 = lastN2Time1;
			lastN2Time1 = (endTime - startTime) / 1000.0;
			System.out.println("Got n^2 time of: " + lastN2Time1 + " seconds.");
			FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = 0;
			FAST_DELETE_DUPLICATES_CONS_CUTOFF = 0;
			startTime = System.nanoTime();
			for (int l = 0; l < iterations; ++l)
				theSeq.removeDuplicates(false);
			System.gc();
			endTime = System.nanoTime();
			double linearTime = (endTime - startTime) / 1000.0;
			System.out.println("Got linear time of: " + linearTime + " seconds.\n");
			if (linearTime < lastN2Time3 && linearTime < lastN2Time2 && linearTime < lastN2Time1) {
				FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = i - 2;
				if (FAST_DELETE_DUPLICATES_ARRAY_CUTOFF < 0) {
					FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = 0;
					FAST_DELETE_DUPLICATES_CONS_CUTOFF = 0;
				}
				System.out.println("Got delete duplicates cuttoff of: "
						+ FAST_DELETE_DUPLICATES_ARRAY_CUTOFF);
				break;
			}
		}
	}

	public static SubLSequence concatenate(SubLSequence seq, SubLObject[] sequences) {
		int size = sequences.length;
		if (size == 0)
			return seq.makeCopy().toSeq();
		int resultLength = seq.size();
		int result_estimate_size = resultLength * sequences.length;
		if (result_estimate_size < 256)
			result_estimate_size = 256;
		ArrayList<SubLObject> newBuf = new ArrayList<SubLObject>(result_estimate_size);
		for (int j = 0, size2 = resultLength; j < size2; ++j)
			newBuf.add(seq.get(j));
		for (int i = 0; i < size; ++i) {
			SubLSequence obj = sequences[i].toSeq();
			if (obj.isList() && !obj.isArrayBased())
				for (SubLObject cur = obj; cur != SubLNil.NIL; cur = cur.rest())
					newBuf.add(cur.first());
			else
				for (int k = 0, size3 = obj.size(); k < size3; ++k)
					newBuf.add(obj.get(k));
		}
		SubLSequence result = seq.makeSequenceFromJavaList(newBuf);
		return result;
	}

	public static int count(SubLSequence seq, SubLObject item, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		int result = 0;
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		for (int i = start; i < end; ++i) {
			SubLObject curItem = seq.get(i);
			if (SubLNil.NIL != test.processItem(item, key.processItem(curItem)))
				++result;
		}
		return result;
	}

	public static int countIf(SubLSequence seq, UnaryFunction test, UnaryFunction key, int start, int end) {
		int result = 0;
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		for (int i = start; i < end; ++i) {
			SubLObject curItem = seq.get(i);
			if (SubLNil.NIL != test.processItem(key.processItem(curItem)))
				++result;
		}
		return result;
	}

	public static SubLSequence deleteItems(SubLSequence seq, boolean[] itemsToDelete, int count) {
		if (count <= 0)
			return seq;
		if (seq == SubLNil.NIL)
			Errors.error("Nil is immutable.");
		if (count > 0)
			for (int i = seq.size() - 1; i >= 0; --i)
				if (itemsToDelete[i]) {
					int end = i + 1;
					while (i > 0 && itemsToDelete[i - 1])
						--i;
					seq = seq.delete(i, end);
				}
		return seq;
	}

	public static SubLSequence fill(SubLSequence seq, SubLObject item, int start, int end) {
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		for (int i = start; i < end; ++i)
			seq.set(i, item);
		return seq;
	}

	public static SubLObject find(SubLSequence seq, SubLObject item, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		for (int i = start; i < end; ++i) {
			SubLObject curObj = seq.get(i);
			if (SubLNil.NIL != test.processItem(item, key.processItem(curObj)))
				return curObj;
		}
		return SubLNil.NIL;
	}

	public static SubLObject findIf(SubLSequence seq, UnaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		for (int i = start; i < end; ++i) {
			SubLObject curObj = seq.get(i);
			if (SubLNil.NIL != test.processItem(key.processItem(curObj)))
				return curObj;
		}
		return SubLNil.NIL;
	}

	public static int indexOfMismatch(SubLSequence seq, SubLSequence otherSeq, BinaryFunction test, UnaryFunction key,
			int start1, int end1, int start2, int end2) {
		int size = seq.size();
		int size2 = otherSeq.size();
		start1 = start1 < 0 ? 0 : start1;
		start2 = start2 < 0 ? 0 : start2;
		end1 = end1 > size ? size : end1;
		end2 = end2 > size2 ? size2 : end2;
		int answer = -3;
		for (int j = start1, size3 = end1, k = start2, size4 = end2; j < size3 && k < size4; ++j, ++k) {
			SubLObject obj1 = seq.get(j);
			SubLObject obj2 = otherSeq.get(k);
			if (SubLNil.NIL == test.processItem(key.processItem(obj1), key.processItem(obj2))) {
				answer = j;
				break;
			}
		}
		if (end2 - start2 > end1 - start1 && answer < 0)
			answer = end1 - start1;
		return answer >= 0 ? answer + start1 : answer;
	}

	public static void init() {
		EQL_TEST = BinaryFunction.EQL_TEST;
		IDENTITY_UNARY_FUNC = UnaryFunction.IDENTITY_UNARY_FUNC;
		// calcOptimalDeleteDuplicatesCutoff();
	}

	public static int positionOf(SubLSequence seq, SubLObject item, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		for (int i = start; i < end; ++i) {
			SubLObject curObj = seq.get(i);
			if (SubLNil.NIL != test.processItem(item, key.processItem(curObj)))
				return i;
		}
		return -2;
	}

	public static int positionOfIf(SubLSequence seq, UnaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		for (int i = start; i < end; ++i) {
			SubLObject curObj = seq.get(i);
			if (SubLNil.NIL != test.processItem(key.processItem(curObj)))
				return i;
		}
		return -2;
	}

	public static SubLObject reduce(SubLSequence seq, BinaryFunction func, int start, int end,
			SubLObject initialValue) {
		int size = seq.size();
		if (start < 0)
			start = 0;
		if (end > size)
			end = size;
		if (size != 0) {
			SubLObject result = initialValue == SubLSequence.NO_INIT_VALUE ? seq.get(start++) : initialValue;
			for (int i = start; i < end; ++i)
				result = func.processItem(result, seq.get(i));
			return result;
		}
		if (initialValue != SubLSequence.NO_INIT_VALUE)
			return initialValue;
		return func.getFunction().apply(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
	}

	public static SubLSequence remove(SubLSequence seq, SubLObject item, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		int size = seq.size();
		SubLSequence result = isDestructive ? seq : seq.makeCopy().toSeq();
		if (start < 0)
			start = 0;
		if (end > size)
			end = size;
		if (count == Integer.MAX_VALUE)
			count = size;
		if (count <= 0 || end <= start)
			return result;
		boolean[] itemsToDelete = new boolean[size];
		Arrays.fill(itemsToDelete, start, end, false);
		int itemsToDeleteCount = 0;
		for (int i = start; i < end && count > 0; ++i) {
			SubLObject curItem = result.get(i);
			if (SubLNil.NIL != test.processItem(item, key.processItem(curItem))) {
				itemsToDelete[i] = true;
				--count;
				++itemsToDeleteCount;
			}
		}
		result = result.deleteItems(itemsToDelete, itemsToDeleteCount);
		itemsToDelete = null;
		return result;
	}

	public static SubLSequence removeDuplicates(SubLSequence seq, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end) {
		SubLSequence result = isDestructive ? seq : seq.makeCopy().toSeq();
		int size = result.size();
		if (key == UnaryFunction.IDENTITY_UNARY_FUNC && size >= FAST_DELETE_DUPLICATES_ARRAY_CUTOFF
				&& (test == BinaryFunction.EQL_TEST || test == BinaryFunction.EQ_TEST
						|| test == BinaryFunction.EQUAL_TEST || test == BinaryFunction.EQUALP_TEST))
			return removeDuplicatesFast(seq, test, start, end);
		if (start < 0)
			start = 0;
		if (end > result.size())
			end = result.size();
		SubLObject[] keyItems = new SubLObject[size];
		for (int i = start; i < end; ++i)
			keyItems[i] = key.processItem(result.get(i));
		for (int i = end - 2; i >= start; --i)
			for (int j = i + 1; j < end; ++j)
				if (SubLNil.NIL != test.processItem(keyItems[i], keyItems[j])) {
					result.delete(i, i + 1);
					break;
				}
		return result;
	}

	public static SubLSequence removeDuplicatesFast(SubLSequence seq, BinaryFunction test, int start, int end) {
		int size = seq.size();
		SubLHashtable cache = SubLObjectFactory.makeHashtable((int) (size * 1.25) + 2, test);
		if (start < 0)
			start = 0;
		if (end < start)
			return seq;
		if (end > size)
			end = size;
		if (!(seq instanceof SubLConsPair)) {
			if (!seq.isArrayBased())
				Errors.unimplementedMethod("Time to implement me!");
			boolean[] itemsToDelete = new boolean[size];
			Arrays.fill(itemsToDelete, start, end, false);
			SubLObject cur = null;
			int itemsToDeleteCount = 0;
			for (int i = end - 1; i >= start; --i) {
				cur = seq.get(i);
				if (cache.get(cur) != null) {
					itemsToDelete[i] = true;
					++itemsToDeleteCount;
				} else
					cache.put(cur, cur);
			}
			seq.deleteItems(itemsToDelete, itemsToDeleteCount);
			itemsToDelete = null;
		} else {
			SubLList curCons = start == 0 ? (SubLList) seq : (SubLList) ((SubLList) seq).nthCdr(start);
			SubLList prevCons = SubLNil.NIL;
			while (curCons != SubLNil.NIL) {
				SubLObject cur2 = curCons.first();
				if (cache.get(cur2) != null) {
					if (curCons == seq)
						seq = curCons;
					else if (prevCons != SubLNil.NIL)
						prevCons.setRest(curCons.rest());
					else
						Errors.error("We should never bet here");
				} else {
					cache.put(cur2, cur2);
					prevCons = curCons;
				}
				curCons = curCons.rest().toList();
			}
		}
		return seq;
	}

	public static SubLSequence removeIf(SubLSequence seq, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		int size = seq.size();
		SubLSequence result = isDestructive ? seq : seq.makeCopy().toSeq();
		if (start < 0)
			start = 0;
		if (end > size)
			end = size;
		if (count == Integer.MAX_VALUE)
			count = size;
		if (count <= 0 || end <= start)
			return result;
		boolean[] itemsToDelete = new boolean[size];
		Arrays.fill(itemsToDelete, start, end, false);
		int itemsToDeleteCount = 0;
		for (int i = start; i < end && count > 0; ++i) {
			SubLObject curItem = seq.get(i);
			if (SubLNil.NIL != test.processItem(key.processItem(curItem))) {
				itemsToDelete[i] = true;
				--count;
				++itemsToDeleteCount;
			}
		}
		result = result.deleteItems(itemsToDelete, itemsToDeleteCount);
		itemsToDelete = null;
		return result;
	}

	public static SubLSequence replace(SubLSequence theSeq, SubLSequence seq, int start1, int end1, int start2,
			int end2) {
		if (start1 < 0)
			start1 = 0;
		if (end1 > theSeq.size())
			end1 = theSeq.size();
		if (start2 < 0)
			start2 = 0;
		if (end2 > seq.size())
			end2 = seq.size();
		for (int i = start1, j = start2; i < end1 && j < end2; ++i, ++j)
			theSeq.set(i, seq.get(j));
		return theSeq;
	}

	public static SubLSequence reverse(SubLSequence seq, boolean isDestructive) {
		SubLSequence result = isDestructive ? seq : seq.makeCopy().toSeq();
		SubLObject temp = null;
		for (int a = 0, b = seq.size() - 1; a < b; ++a, --b) {
			temp = result.get(b);
			result.set(b, seq.get(a));
			result.set(a, temp);
		}
		return result;
	}

	public static int search(SubLSequence seq, SubLSequence otherSeq, BinaryFunction test, UnaryFunction key,
			int start1, int end1, int start2, int end2) {
		if (seq.size() == 0)
			return start2;
		int size = seq.size();
		int size2 = otherSeq.size();
		start1 = start1 < 0 ? 0 : start1;
		start2 = start2 < 0 ? 0 : start2;
		end1 = end1 > size ? size : end1;
		end2 = end2 > size2 ? size2 : end2;
		int answer = -2;
		boolean hasMatch = false;
		for (int i = start2, size3 = end2 - (end1 - start1) + 1; i < size3; ++i) {
			answer = i;
			int j = start1;
			int size4 = end1;
			for (int k = i; j < size4 && k < end2; ++j, ++k) {
				hasMatch = false;
				SubLObject obj1 = seq.get(j);
				SubLObject obj2 = otherSeq.get(k);
				if (SubLNil.NIL == test.processItem(key.processItem(obj1), key.processItem(obj2))) {
					hasMatch = false;
					break;
				}
				hasMatch = true;
			}
			if (hasMatch && j == size4)
				break;
			answer = -2;
		}
		return answer >= 0 ? answer + start1 : answer;
	}

	public static SubLSequence subSeq(SubLSequence seq, int start, int end) {
		int size = seq.size();
		start = start < 0 ? 0 : start;
		end = end > size ? size : end;
		end = end < start ? start : end;
		ArrayList<SubLObject> buf = new ArrayList<SubLObject>(end - start);
		for (int i = start; i < end; ++i)
			buf.add(seq.get(i));
		SubLSequence result = seq.makeSequenceFromJavaList(buf);
		return result;
	}

	public static SubLSequence substitute(SubLSequence seq, SubLObject newItem, SubLObject oldItem,
			boolean isDestructive, BinaryFunction test, UnaryFunction key, int start, int end, int count) {
		SubLSequence result = isDestructive ? seq : seq.makeCopy().toSeq();
		int size = seq.size();
		if (start < 0)
			start = 0;
		if (end > size)
			end = size;
		if (count == Integer.MAX_VALUE)
			count = size;
		for (int i = start; i < end && count > 0; ++i) {
			SubLObject curItem = result.get(i);
			if (SubLNil.NIL != test.processItem(oldItem, key.processItem(curItem))) {
				result.set(i, newItem);
				--count;
			}
		}
		return result;
	}

	public static SubLSequence substituteIf(SubLSequence seq, SubLObject newItem, UnaryFunction test,
			boolean isDestructive, UnaryFunction key, int start, int end, int count) {
		SubLSequence result = isDestructive ? seq : seq.makeCopy().toSeq();
		int size = seq.size();
		if (start < 0)
			start = 0;
		if (end > size)
			end = size;
		if (count == Integer.MAX_VALUE)
			count = size;
		for (int i = start; i < end && count > 0; ++i) {
			SubLObject curItem = result.get(i);
			if (SubLNil.NIL != test.processItem(key.processItem(curItem))) {
				result.set(i, newItem);
				--count;
			}
		}
		return result;
	}

	public static int FAST_DELETE_DUPLICATES_CONS_CUTOFF;
	public static int FAST_DELETE_DUPLICATES_ARRAY_CUTOFF;
	public static BinaryFunction EQL_TEST;
	public static UnaryFunction IDENTITY_UNARY_FUNC;
	static {
		FAST_DELETE_DUPLICATES_CONS_CUTOFF = 80;
		FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = 20;
	}

	@Override
	public Object clone() {
		Errors.unimplementedMethod("clone()");
		return null;
	}

	@Override
	public SubLSequence concatenate(SubLSequence seq1) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize1;
		args[0] = seq1;
		return this.concatenate(args);
	}

	@Override
	public int count(SubLObject item) {
		return this.count(item, EQL_TEST, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public int count(SubLObject item, BinaryFunction test) {
		return this.count(item, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.count(item, test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		return this.count(item, test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public int countIf(UnaryFunction test) {
		return this.countIf(test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public int countIf(UnaryFunction test, UnaryFunction key) {
		return this.countIf(test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public int countIf(UnaryFunction test, UnaryFunction key, int start) {
		return this.countIf(test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence deleteItems(boolean[] itemsToDelete, int count) {
		return deleteItems(this, itemsToDelete, count);
	}

	@Override
	public SubLSequence fill(SubLObject item) {
		return this.fill(item, 0, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence fill(SubLObject item, int start) {
		return this.fill(item, start, Integer.MAX_VALUE);
	}

	@Override
	public SubLObject find(SubLObject item) {
		return this.find(item, EQL_TEST, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public SubLObject find(SubLObject item, BinaryFunction test) {
		return this.find(item, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.find(item, test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		return this.find(item, test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public SubLObject findIf(UnaryFunction test) {
		Errors.unimplementedMethod("findIf");
		return null;
	}

	@Override
	public SubLObject findIf(UnaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("findIf");
		return null;
	}

	@Override
	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start) {
		Errors.unimplementedMethod("findIf");
		return null;
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq) {
		return this.indexOfMismatch(otherSeq, EQL_TEST, IDENTITY_UNARY_FUNC,
				0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test) {
		return this.indexOfMismatch(otherSeq, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return this.indexOfMismatch(otherSeq, test, key, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1) {
		return this.indexOfMismatch(otherSeq, test, key, start1, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1) {
		return this.indexOfMismatch(otherSeq, test, key, start1, end1, 0, Integer.MAX_VALUE);
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2) {
		return this.indexOfMismatch(otherSeq, test, key, start1, end1, start2, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test) {
		return this.merge(otherSeq, test, UnaryFunction.IDENTITY_UNARY_FUNC);
	}

	@Override
	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return (SubLSequence) Errors.unimplementedMethod("cmerge: on " + otherSeq.getType());
	}

	@Override
	public int positionOf(SubLObject item) {
		return this.positionOf(item, EQL_TEST, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public int positionOf(SubLObject item, BinaryFunction test) {
		return this.positionOf(item, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.positionOf(item, test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		return this.positionOf(item, test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public int positionOfIf(UnaryFunction test) {
		return this.positionOfIf(test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public int positionOfIf(UnaryFunction test, UnaryFunction key) {
		return this.positionOfIf(test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start) {
		return this.positionOfIf(test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public SubLObject reduce(BinaryFunction func) {
		return this.reduce(func, 0, Integer.MAX_VALUE, SubLSequence.NO_INIT_VALUE);
	}

	@Override
	public SubLObject reduce(BinaryFunction func, int start) {
		return this.reduce(func, start, Integer.MAX_VALUE, SubLSequence.NO_INIT_VALUE);
	}

	@Override
	public SubLObject reduce(BinaryFunction func, int start, int end) {
		return this.reduce(func, start, end, SubLSequence.NO_INIT_VALUE);
	}

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive) {
		return this.remove(item, isDestructive, EQL_TEST, IDENTITY_UNARY_FUNC,
				0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test) {
		return this.remove(item, isDestructive, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE,
				Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.remove(item, isDestructive, test, key, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start) {
		return this.remove(item, isDestructive, test, key, start, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end) {
		return this.remove(item, isDestructive, test, key, start, end, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence removeDuplicates(boolean isDestructive) {
		return this.removeDuplicates(isDestructive, EQL_TEST,
				IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test) {
		return this.removeDuplicates(isDestructive, test, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.removeDuplicates(isDestructive, test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start) {
		return this.removeDuplicates(isDestructive, test, key, start, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive) {
		return this.removeIf(test, isDestructive, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE,
				Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		return this.removeIf(test, isDestructive, key, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start) {
		return this.removeIf(test, isDestructive, key, start, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end) {
		return this.removeIf(test, isDestructive, key, start, end, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence replace(SubLSequence seq) {
		return this.replace(seq, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence replace(SubLSequence seq, int start1) {
		return this.replace(seq, start1, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence replace(SubLSequence seq, int start1, int end1) {
		return this.replace(seq, start1, end1, 0, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2) {
		return this.replace(seq, start1, end1, start2, Integer.MAX_VALUE);
	}

	@Override
	public int search(SubLSequence otherSeq) {
		return this.search(otherSeq, EQL_TEST, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test) {
		return this.search(otherSeq, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE, 0,
				Integer.MAX_VALUE);
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return this.search(otherSeq, test, key, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1) {
		return this.search(otherSeq, test, key, start1, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1) {
		return this.search(otherSeq, test, key, start1, end1, 0, Integer.MAX_VALUE);
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2) {
		return this.search(otherSeq, test, key, start1, end1, start2, Integer.MAX_VALUE);
	}

	@Override
	public abstract int size();

	@Override
	public abstract int size(int p0);

	@Override
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred) {
		return this.sort(isDestructive, pred, IDENTITY_UNARY_FUNC);
	}

	@Override
	public SubLSequence subSeq(int start) {
		return this.subSeq(start, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive) {
		return this.substitute(newItem, oldItem, isDestructive, EQL_TEST,
				IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test) {
		return this.substitute(newItem, oldItem, isDestructive, test, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key) {
		return this.substitute(newItem, oldItem, isDestructive, test, key, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start) {
		return this.substitute(newItem, oldItem, isDestructive, test, key, start, Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end) {
		return this.substitute(newItem, oldItem, isDestructive, test, key, start, end, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0,
				Integer.MAX_VALUE, Integer.MAX_VALUE);
	}

	public Object[] toArray() {
		Errors.unimplementedMethod("toArray()");
		return null;
	}

	public Object[] toArray(Object[] obj) {
		Errors.unimplementedMethod("toArray()");
		return null;
	}

	@Override
	public SubLSequence toSeq() {
		return this;
	}
}
