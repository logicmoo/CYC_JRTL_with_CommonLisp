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

import java.util.ArrayList;
import java.util.Arrays;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

//// External Imports

public abstract class AbstractSubLSequence extends AbstractSubLObject implements SubLSequence {

	public static int FAST_DELETE_DUPLICATES_CONS_CUTOFF = 80;

	public static int FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = 20;

	public static BinaryFunction EQL_TEST;

	//// Constructors

	//// Public Area

	public static UnaryFunction IDENTITY_UNARY_FUNC;

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
		double lastN2Time1 = 0.0, lastN2Time2 = 0.0, lastN2Time3 = 0.0;
		for (int i = start; i < maxSize; i++) {
			System.out.println("Trying delete duplicates cutoff of: " + i + ".");
			if (type == 0)
				theSeq = SubLObjectFactory.makeCons(SubLObjectFactory.makeInteger(i + i % 2), theSeq);// assume
																										// half
																										// the
																										// items
																										// are
																										// dups
			else if (type == 1) {
				theSeq = SubLObjectFactory.makeVector(i);
				for (int k = 0; k < i; k++)
					theSeq.set(k, SubLObjectFactory.makeInteger(k + k % 2));
			}
			AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = i + 2;
			AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF = i + 2;
			long startTime = System.currentTimeMillis();
			for (int j = 0; j < iterations; j++)
				theSeq.removeDuplicates(false);
			System.gc();
			long endTime = System.currentTimeMillis();
			lastN2Time3 = lastN2Time2;
			lastN2Time2 = lastN2Time1;
			lastN2Time1 = (endTime - startTime) / 1000.0;
			System.out.println("Got n^2 time of: " + lastN2Time1 + " seconds.");

			AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = 0;
			AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF = 0;
			startTime = System.currentTimeMillis();
			for (int j = 0; j < iterations; j++)
				theSeq.removeDuplicates(false);
			System.gc();
			endTime = System.currentTimeMillis();
			double linearTime = (endTime - startTime) / 1000.0;
			System.out.println("Got linear time of: " + linearTime + " seconds.\n");

			if (linearTime < lastN2Time3 && linearTime < lastN2Time2 && linearTime < lastN2Time1) {
				AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = i - 2;
				if (AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF < 0) {
					AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF = 0;
					AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF = 0;
				}
				System.out.println("Got delete duplicates cuttoff of: "
						+ AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF);
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
		ArrayList<SubLObject> newBuf = new ArrayList<SubLObject>(result_estimate_size); // @todo
																						// resource
																						// this
		for (int j = 0, size1 = resultLength; j < size1; j++)
			newBuf.add(seq.get(j));
		for (int i = 0; i < size; i++) {
			SubLSequence obj = sequences[i].toSeq();
			if (obj.isList() && !obj.isArrayBased())
				for (SubLObject cur = obj; cur != SubLNil.NIL; cur = cur.rest())
					newBuf.add(cur.first());
			else
				for (int j = 0, size1 = obj.size(); j < size1; j++)
					newBuf.add(obj.get(j));
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
		SubLObject curItem;
		for (int i = start; i < end; i++) {
			curItem = seq.get(i);
			if (SubLNil.NIL != test.processItem(item, key.processItem(curItem)))
				result++;
		}
		return result;
	}

	public static int countIf(SubLSequence seq, UnaryFunction test, UnaryFunction key, int start, int end) {
		int result = 0;
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		SubLObject curItem;
		for (int i = start; i < end; i++) {
			curItem = seq.get(i);
			if (SubLNil.NIL != test.processItem(key.processItem(curItem)))
				result++;
		}
		return result;
	}

	public static SubLSequence deleteItems(SubLSequence seq, boolean[] itemsToDelete, int count) {
		if (count <= 0)
			return seq;
		if (seq == SubLNil.NIL)
			Errors.error("Nil is immutable.");
		if (count > 0)
			for (int i = seq.size() - 1; i >= 0; i--)
				if (itemsToDelete[i]) {
					int end = i + 1;
					while (i > 0 && itemsToDelete[i - 1])
						i--;
					seq = seq.delete(i, end);
				}
		return seq;
	}

	public static SubLSequence fill(SubLSequence seq, SubLObject item, int start, int end) {
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		for (int i = start; i < end; i++)
			seq.set(i, item);
		return seq;
	}

	public static SubLObject find(SubLSequence seq, SubLObject item, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		SubLObject curObj;
		for (int i = start; i < end; i++) {
			curObj = seq.get(i);
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
		SubLObject curObj;
		for (int i = start; i < end; i++) {
			curObj = seq.get(i);
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
		int answer = SubLSequence.MATCH_EVERYWHERE;
		SubLObject obj1, obj2;
		for (int j = start1, size3 = end1, k = start2, size4 = end2; j < size3 && k < size4; j++, k++) {
			obj1 = seq.get(j);
			obj2 = otherSeq.get(k);
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
		AbstractSubLSequence.EQL_TEST = BinaryFunction.EQL_TEST;
		AbstractSubLSequence.IDENTITY_UNARY_FUNC = UnaryFunction.IDENTITY_UNARY_FUNC;
		// calcOptimalDeleteDuplicatesCutoff();
	}

	public static int positionOf(SubLSequence seq, SubLObject item, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		SubLObject curObj;
		for (int i = start; i < end; i++) {
			curObj = seq.get(i);
			if (SubLNil.NIL != test.processItem(item, key.processItem(curObj)))
				return i;
		}
		return SubLSequence.NOT_FOUND;
	}

	public static int positionOfIf(SubLSequence seq, UnaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end > seq.size())
			end = seq.size();
		SubLObject curObj;
		for (int i = start; i < end; i++) {
			curObj = seq.get(i);
			if (SubLNil.NIL != test.processItem(key.processItem(curObj)))
				return i;
		}
		return SubLSequence.NOT_FOUND;
	}

	// @note why doesn't this function take a key like the vast majority of
	// other
	// sequence functions??? This definitely seems to diverge from the Lisp
	// hyperspec for no good reason...
	public static SubLObject reduce(SubLSequence seq, BinaryFunction func, int start, int end,
			SubLObject initialValue) {
		int size = seq.size();
		if (start < 0)
			start = 0;
		if (end > size)
			end = size;
		if (size == 0)
			if (initialValue != SubLSequence.NO_INIT_VALUE)
				return initialValue;
			else
				// @note the following line does not agree with C version but is
				// accurate according to the Lisp hyperspec
				return func.getFunction().apply(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
		SubLObject result = initialValue == SubLSequence.NO_INIT_VALUE ? seq.get(start++) : initialValue;
		for (int i = start; i < end; i++)
			result = func.processItem(result, seq.get(i));
		return result;
	}

	public static SubLSequence remove(SubLSequence seq, SubLObject item, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		int size = seq.size();
		SubLSequence result = isDestructive ? seq : seq.makeCopy().toSeq();
		if (start < 0)
			start = 0;
		if (end > size)
			end = size;
		if (count == SubLSequence.ALL_OCCURRENCES)
			count = size;
		if (count <= 0 || end <= start)
			return result;
		boolean[] itemsToDelete = new boolean[size];
		Arrays.fill(itemsToDelete, start, end, false);
		SubLObject curItem;
		int itemsToDeleteCount = 0;
		for (int i = start; i < end && count > 0; i++) {
			curItem = result.get(i);
			if (SubLNil.NIL != test.processItem(item, key.processItem(curItem))) {
				itemsToDelete[i] = true;
				count--;
				itemsToDeleteCount++;
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
		if (key == UnaryFunction.IDENTITY_UNARY_FUNC
				&& size >= AbstractSubLSequence.FAST_DELETE_DUPLICATES_ARRAY_CUTOFF)
			if (test == BinaryFunction.EQL_TEST || test == BinaryFunction.EQ_TEST || test == BinaryFunction.EQUAL_TEST
					|| test == BinaryFunction.EQUALP_TEST)
				return AbstractSubLSequence.removeDuplicatesFast(seq, test, start, end);
		if (start < 0)
			start = 0;
		if (end > result.size())
			end = result.size();
		SubLObject[] keyItems = new SubLObject[size];
		for (int i = start; i < end; i++)
			keyItems[i] = key.processItem(result.get(i));
		for (int i = end - 2; i >= start; i--)
			for (int j = i + 1; j < end; j++)
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
			for (int i = end - 1; i >= start; i--) {
				cur = seq.get(i);
				if (cache.get(cur) != null) {
					itemsToDelete[i] = true;
					itemsToDeleteCount++;
				} else
					cache.put(cur, cur);
			}
			seq.deleteItems(itemsToDelete, itemsToDeleteCount);
			itemsToDelete = null;
		} else if (SubLList.ALLOW_REMOVE_DUPLICATES_FROM_END) {
			SubLList curCons = start == 0 ? (SubLList) seq : (SubLList) ((SubLList) seq).nthCdr(start);
			SubLList prevCons = SubLNil.NIL;
			for (; curCons != SubLNil.NIL; curCons = curCons.rest().toList()) {
				SubLObject cur = curCons.first();
				if (cache.get(cur) != null) {
					if (curCons == seq)
						seq = curCons;
					else if (prevCons != SubLNil.NIL)
						prevCons.setRest(curCons.rest());
					else
						Errors.error("We should never bet here");
				} else {
					cache.put(cur, cur);
					prevCons = curCons;
				}
			}
		} else
			Errors.unimplementedMethod("Time to implement me.");
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
		if (count == SubLSequence.ALL_OCCURRENCES)
			count = size;
		if (count <= 0 || end <= start)
			return result;
		boolean[] itemsToDelete = new boolean[size];
		Arrays.fill(itemsToDelete, start, end, false);
		SubLObject curItem;
		int itemsToDeleteCount = 0;
		for (int i = start; i < end && count > 0; i++) {
			curItem = seq.get(i);
			if (SubLNil.NIL != test.processItem(key.processItem(curItem))) {
				itemsToDelete[i] = true;
				count--;
				itemsToDeleteCount++;
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
		for (int i = start1, j = start2; i < end1 && j < end2; i++, j++)
			theSeq.set(i, seq.get(j));
		return theSeq;
	}

	public static SubLSequence reverse(SubLSequence seq, boolean isDestructive) {
		SubLSequence result = isDestructive ? seq : seq.makeCopy().toSeq();
		SubLObject temp = null;
		for (int a = 0, b = seq.size() - 1; a < b; a++, b--) {
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
		int j, size4, k;
		start1 = start1 < 0 ? 0 : start1;
		start2 = start2 < 0 ? 0 : start2;
		end1 = end1 > size ? size : end1;
		end2 = end2 > size2 ? size2 : end2;
		int answer = SubLSequence.NOT_FOUND;
		SubLObject obj1, obj2;
		boolean hasMatch = false;
		for (int i = start2, size3 = end2 - (end1 - start1) + 1; i < size3; i++) {
			answer = i;
			for (j = start1, size4 = end1, k = i; j < size4 && k < end2; j++, k++) {
				hasMatch = false;
				obj1 = seq.get(j);
				obj2 = otherSeq.get(k);
				if (SubLNil.NIL == test.processItem(key.processItem(obj1), key.processItem(obj2))) {
					hasMatch = false;
					break;
				}
				hasMatch = true;
			}
			if (hasMatch && j == size4)
				break;
			answer = SubLSequence.NOT_FOUND;
		}
		return answer >= 0 ? answer + start1 : answer;
	}

	public static SubLSequence subSeq(SubLSequence seq, int start, int end) {
		int size = seq.size();
		start = start < 0 ? 0 : start;
		end = end > size ? size : end;
		end = end < start ? start : end;
		ArrayList<SubLObject> buf = new ArrayList<SubLObject>(end - start);
		for (int i = start; i < end; i++)
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
		if (count == SubLSequence.ALL_OCCURRENCES)
			count = size;
		SubLObject curItem;
		for (int i = start; i < end && count > 0; i++) {
			curItem = result.get(i);
			if (SubLNil.NIL != test.processItem(oldItem, key.processItem(curItem))) {
				result.set(i, newItem);
				count--;
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
		if (count == SubLSequence.ALL_OCCURRENCES)
			count = size;
		SubLObject curItem;
		for (int i = start; i < end && count > 0; i++) {
			curItem = result.get(i);
			if (SubLNil.NIL != test.processItem(key.processItem(curItem))) {
				result.set(i, newItem);
				count--;
			}
		}
		return result;
	}

	public Object clone() {
		Errors.unimplementedMethod("AbstractSubLSequence.clone()");
		return null;
	}

	public SubLSequence concatenate(SubLSequence seq1) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize1;
		args[0] = seq1;
		return this.concatenate(args);
	}

	public int count(SubLObject item) {
		return this.count(item, AbstractSubLSequence.EQL_TEST, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END);
	}

	public int count(SubLObject item, BinaryFunction test) {
		return this.count(item, test, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int count(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.count(item, test, key, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		return this.count(item, test, key, start, CommonSymbols.PROCESS_TO_END);
	}

	public int countIf(UnaryFunction test) {
		return this.countIf(test, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int countIf(UnaryFunction test, UnaryFunction key) {
		return this.countIf(test, key, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int countIf(UnaryFunction test, UnaryFunction key, int start) {
		return this.countIf(test, key, start, CommonSymbols.PROCESS_TO_END);
	}

	public SubLSequence deleteItems(boolean[] itemsToDelete, int count) {
		return AbstractSubLSequence.deleteItems(this, itemsToDelete, count);
	}

	public SubLSequence fill(SubLObject item) {
		return this.fill(item, 0, CommonSymbols.PROCESS_TO_END);
	}

	public SubLSequence fill(SubLObject item, int start) {
		return this.fill(item, start, CommonSymbols.PROCESS_TO_END);
	}

	public SubLObject find(SubLObject item) {
		return this.find(item, AbstractSubLSequence.EQL_TEST, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END);
	}

	public SubLObject find(SubLObject item, BinaryFunction test) {
		return this.find(item, test, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0, CommonSymbols.PROCESS_TO_END);
	}

	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.find(item, test, key, 0, CommonSymbols.PROCESS_TO_END);
	}

	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		return this.find(item, test, key, start, CommonSymbols.PROCESS_TO_END);
	}

	public SubLObject findIf(UnaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLSequence.findIf");
		return null;
	}

	public SubLObject findIf(UnaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLSequence.findIf");
		return null;
	}

	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start) {
		Errors.unimplementedMethod("AbstractSubLSequence.findIf");
		return null;
	}

	public int indexOfMismatch(SubLSequence otherSeq) {
		return this.indexOfMismatch(otherSeq, AbstractSubLSequence.EQL_TEST, AbstractSubLSequence.IDENTITY_UNARY_FUNC,
				0, CommonSymbols.PROCESS_TO_END, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test) {
		return this.indexOfMismatch(otherSeq, test, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return this.indexOfMismatch(otherSeq, test, key, 0, CommonSymbols.PROCESS_TO_END, 0,
				CommonSymbols.PROCESS_TO_END);
	}

	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1) {
		return this.indexOfMismatch(otherSeq, test, key, start1, CommonSymbols.PROCESS_TO_END, 0,
				CommonSymbols.PROCESS_TO_END);
	}

	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1) {
		return this.indexOfMismatch(otherSeq, test, key, start1, end1, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2) {
		return this.indexOfMismatch(otherSeq, test, key, start1, end1, start2, CommonSymbols.PROCESS_TO_END);
	}

	abstract public boolean isArrayBased();

	// currently true in all subclasses anyways

	public boolean isSequence() {
		return true;
	}

	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test) {
		return this.merge(otherSeq, test, UnaryFunction.IDENTITY_UNARY_FUNC);
	}

	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return (SubLSequence) Errors.unimplementedMethod("cmerge: on " + otherSeq.getType());
	}

	public int positionOf(SubLObject item) {
		return this.positionOf(item, AbstractSubLSequence.EQL_TEST, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END);
	}

	public int positionOf(SubLObject item, BinaryFunction test) {
		return this.positionOf(item, test, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this.positionOf(item, test, key, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start) {
		return this.positionOf(item, test, key, start, CommonSymbols.PROCESS_TO_END);
	}

	public int positionOfIf(UnaryFunction test) {
		return this.positionOfIf(test, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int positionOfIf(UnaryFunction test, UnaryFunction key) {
		return this.positionOfIf(test, key, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start) {
		return this.positionOfIf(test, key, start, CommonSymbols.PROCESS_TO_END);
	}

	public SubLObject reduce(BinaryFunction func) {
		return this.reduce(func, 0, CommonSymbols.PROCESS_TO_END, SubLSequence.NO_INIT_VALUE);
	}

	public SubLObject reduce(BinaryFunction func, int start) {
		return this.reduce(func, start, CommonSymbols.PROCESS_TO_END, SubLSequence.NO_INIT_VALUE);
	}

	public SubLObject reduce(BinaryFunction func, int start, int end) {
		return this.reduce(func, start, end, SubLSequence.NO_INIT_VALUE);
	}

	public SubLSequence remove(SubLObject item, boolean isDestructive) {
		return this.remove(item, isDestructive, AbstractSubLSequence.EQL_TEST, AbstractSubLSequence.IDENTITY_UNARY_FUNC,
				0, CommonSymbols.PROCESS_TO_END, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test) {
		return this.remove(item, isDestructive, test, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.remove(item, isDestructive, test, key, 0, CommonSymbols.PROCESS_TO_END,
				SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start) {
		return this.remove(item, isDestructive, test, key, start, CommonSymbols.PROCESS_TO_END,
				SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end) {
		return this.remove(item, isDestructive, test, key, start, end, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence removeDuplicates(boolean isDestructive) {
		return this.removeDuplicates(isDestructive, AbstractSubLSequence.EQL_TEST,
				AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0, CommonSymbols.PROCESS_TO_END);
	}

	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test) {
		return this.removeDuplicates(isDestructive, test, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END);
	}

	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		return this.removeDuplicates(isDestructive, test, key, 0, CommonSymbols.PROCESS_TO_END);
	}

	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start) {
		return this.removeDuplicates(isDestructive, test, key, start, CommonSymbols.PROCESS_TO_END);
	}

	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive) {
		return this.removeIf(test, isDestructive, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		return this.removeIf(test, isDestructive, key, 0, CommonSymbols.PROCESS_TO_END, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start) {
		return this.removeIf(test, isDestructive, key, start, CommonSymbols.PROCESS_TO_END,
				SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end) {
		return this.removeIf(test, isDestructive, key, start, end, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence replace(SubLSequence seq) {
		return this.replace(seq, 0, CommonSymbols.PROCESS_TO_END, 0, CommonSymbols.PROCESS_TO_END);
	}

	public SubLSequence replace(SubLSequence seq, int start1) {
		return this.replace(seq, start1, CommonSymbols.PROCESS_TO_END, 0, CommonSymbols.PROCESS_TO_END);
	}

	public SubLSequence replace(SubLSequence seq, int start1, int end1) {
		return this.replace(seq, start1, end1, 0, CommonSymbols.PROCESS_TO_END);
	}

	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2) {
		return this.replace(seq, start1, end1, start2, CommonSymbols.PROCESS_TO_END);
	}

	public int search(SubLSequence otherSeq) {
		return this.search(otherSeq, AbstractSubLSequence.EQL_TEST, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int search(SubLSequence otherSeq, BinaryFunction test) {
		return this.search(otherSeq, test, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0, CommonSymbols.PROCESS_TO_END, 0,
				CommonSymbols.PROCESS_TO_END);
	}

	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return this.search(otherSeq, test, key, 0, CommonSymbols.PROCESS_TO_END, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1) {
		return this.search(otherSeq, test, key, start1, CommonSymbols.PROCESS_TO_END, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1) {
		return this.search(otherSeq, test, key, start1, end1, 0, CommonSymbols.PROCESS_TO_END);
	}

	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2) {
		return this.search(otherSeq, test, key, start1, end1, start2, CommonSymbols.PROCESS_TO_END);
	}

	public abstract int size();

	public SubLSequence sort(boolean isDestructive, BinaryFunction pred) {
		return this.sort(isDestructive, pred, AbstractSubLSequence.IDENTITY_UNARY_FUNC);
	}

	public SubLSequence subSeq(int start) {
		return this.subSeq(start, CommonSymbols.PROCESS_TO_END);
	}

	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive) {
		return this.substitute(newItem, oldItem, isDestructive, AbstractSubLSequence.EQL_TEST,
				AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0, CommonSymbols.PROCESS_TO_END,
				SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test) {
		return this.substitute(newItem, oldItem, isDestructive, test, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key) {
		return this.substitute(newItem, oldItem, isDestructive, test, key, 0, CommonSymbols.PROCESS_TO_END,
				SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start) {
		return this.substitute(newItem, oldItem, isDestructive, test, key, start, CommonSymbols.PROCESS_TO_END,
				SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end) {
		return this.substitute(newItem, oldItem, isDestructive, test, key, start, end, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive) {
		return this.substituteIf(newItem, test, isDestructive, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		return this.substituteIf(newItem, test, isDestructive, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start) {
		return this.substituteIf(newItem, test, isDestructive, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END, SubLSequence.ALL_OCCURRENCES);
	}

	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end) {
		return this.substituteIf(newItem, test, isDestructive, AbstractSubLSequence.IDENTITY_UNARY_FUNC, 0,
				CommonSymbols.PROCESS_TO_END, SubLSequence.ALL_OCCURRENCES);
	}

	public Object[] toArray() {
		Errors.unimplementedMethod("AbstractSubLSequence.toArray()");
		return null;
	}

	public Object[] toArray(Object[] obj) {
		Errors.unimplementedMethod("AbstractSubLSequence.toArray()");
		return null;
	}

	//// Protected Area

	//// Private Area

	/** Method created to avoid casting */
	public SubLSequence toSeq() {
		return this;
	}

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	//// Internal Rep

	//// Main

}
