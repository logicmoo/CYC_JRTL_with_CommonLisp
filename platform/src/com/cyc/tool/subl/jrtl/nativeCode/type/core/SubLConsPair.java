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
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispConsPair;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;

public class SubLConsPair extends LispConsPair implements SubLCons, SubLList, CommonSymbols {

	//// Constructors

	private static int SXHASH_TYPE_SPEC_PRIME_CONS = 167;

	public SubLConsPair(SubLObject car) {
		super(car);
	}

	//// Public Area

	// SubLList methods

	/** Creates a new instance of SubLConsPair. */
	public SubLConsPair(SubLObject car, SubLObject cdr) {
		super(car, cdr);
	}

	public SubLList addItem(SubLObject item) {
		return this.last(1).setRest(item);
	}

	public SubLList asArrayList() {
		ArrayList<SubLObject> buf = new ArrayList<SubLObject>();
		SubLObject cur = this;
		for (SubLObject temp = cur.rest(); temp.isCons(); cur = temp, temp = temp.rest())
			buf.add(cur.first());
		buf.add(cur.first());
		SubLArrayList result = (SubLArrayList) SubLObjectFactory.makeList_Dangerous(buf);
		result.setDottedElement(cur.rest());
		return result;
	}

	public SubLList asConsList() {
		return this;
	}

	public boolean canFastHash() {
		return false;
	}

	public SubLObject cddr() {
		return this.rest().rest();
	}

	public Object clone() {
		return this.makeCopy();
	}

	public SubLSequence concatenate(SubLObject[] sequences) {
		// @todo if we support SubLArrayLists make one of those instead -- APB
		int listCount = sequences.length;
		SubLObject result = this.makeCopy();
		SubLObject cur;
		SubLObject lastLast = result.last(1), curList;
		for (int i = 0, size = sequences.length; i < size; i++) {
			cur = sequences[i];
			cur.enforceType(CommonSymbols.SEQUENCEP);
			if (cur.isCons()) {
				curList = cur.asConsList().makeCopy();
				lastLast.setRest(curList);
				lastLast = curList.last(1);
			} else {
				SubLObject seq = cur;
				for (int j = 0, size2 = seq.size(); j < size2; j++) {
					SubLConsPair newCons = new SubLConsPair(seq.get(j), SubLNil.NIL);
					lastLast.setRest(newCons);
					lastLast = newCons;
				}
			}
		}
		return result.toList();
	}

	public int consLength() {
		int count = 1;
		for (SubLObject cur = this.rest(); cur.isCons(); cur = cur.rest(), count++) {
		}
		return count;
	}

	/** Method created to avoid instanceof tests */
	public boolean consp() {
		return true;
	}

	// conses-high methods

	public int count(SubLObject item, BinaryFunction test) {
		int result = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(item, cur.first()))
				result++;
		return result;
	}

	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		int result = 0;
		if (start < 0)
			start = 0;
		if (end <= start)
			return 0;
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.count(item, test);
		SubLObject curItem;
		SubLObject cur = start == 0 ? this : this.nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), count++)
				if (SubLNil.NIL != test.processItem(item, cur.first()))
					result++;
		} else
			for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), count++)
				if (SubLNil.NIL != test.processItem(item, key.processItem(cur.first())))
					result++;
		return result;
	}

	public int countIf(UnaryFunction test) {
		int result = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(cur.first()))
				result++;
		return result;
	}

	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		int result = 0;
		if (start < 0)
			start = 0;
		if (end <= start)
			return 0;
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.countIf(test);
		SubLObject curItem;
		SubLObject cur = start == 0 ? this : this.nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), count++)
				if (SubLNil.NIL != test.processItem(cur.first()))
					result++;
		} else
			for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), count++)
				if (SubLNil.NIL != test.processItem(key.processItem(cur.first())))
					result++;
		return result;
	}

	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (startIndex >= endIndexExclusive)
			return this;
		boolean didDeleteStart = startIndex == 0;
		SubLObject prevCdr = !didDeleteStart ? this.nthCdr(startIndex - 1) : SubLNil.NIL;
		SubLObject nextCdr = this.nthCdr(endIndexExclusive);
		if (prevCdr == SubLNil.NIL) {
			if (nextCdr == SubLNil.NIL)
				return SubLNil.NIL;
			return nextCdr.toSeq();
		}
		prevCdr.setRest(nextCdr);
		return this;
	}

	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!obj.isCons())
			return false;
		if (obj.isArrayBased())
			return super.equal(obj);
		SubLObject cur1 = this;
		for (; cur1.isCons() && obj.isCons(); cur1 = cur1.rest(), obj = obj.rest())
			if (!cur1.first().equal(obj.first()))
				return false;
		if (cur1.isCons() || obj.isCons())
			return false;
		if (!cur1.equal(obj))
			return false;
		return true;
	}

	public boolean equalp(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!obj.isCons())
			return false;
		if (obj.isArrayBased())
			return super.equalp(obj);
		SubLObject cur1 = this;
		for (; cur1.isCons() && obj.isCons(); cur1 = cur1.rest(), obj = obj.rest())
			if (!cur1.first().equalp(obj.first()))
				return false;
		if (cur1.isCons() || obj.isCons())
			return false;
		if (!cur1.equalp(obj))
			return false;
		return true;
	}

	public boolean equals(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!obj.isCons())
			return false;
		if (obj.isArrayBased())
			return super.equals(obj);
		SubLObject cur1 = this;
		for (; cur1.isCons() && obj.isCons(); cur1 = cur1.rest(), obj = obj.rest())
			if (!cur1.first().equals(obj.first()))
				return false;
		if (cur1.isCons() || obj.isCons())
			return false;
		if (!cur1.equals(obj))
			return false;
		return true;
	}

	public SubLSequence fill(SubLObject item, int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return this;
		SubLObject cur = start == 0 ? this : this.nthCdr(start);
		for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), count++)
			cur.setFirst(item);
		return this;
	}

	public SubLObject find(SubLObject item, BinaryFunction test) {
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(item, cur.first()))
				return cur.first();
		return SubLNil.NIL;
	}

	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return SubLNil.NIL;
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.find(item, test);
		SubLObject cur = start == 0 ? this : this.nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(item, cur.first()))
					return cur.first();
		} else
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(item, key.processItem(cur.first())))
					return cur.first();
		return SubLNil.NIL;
	}

	public SubLObject findIf(UnaryFunction test) {
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(cur.first()))
				return cur.first();
		return SubLNil.NIL;
	}

	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return SubLNil.NIL;
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.findIf(test);
		SubLObject cur = start == 0 ? this : this.nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(cur.first()))
					return cur.first();
		} else
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(key.processItem(cur.first())))
					return cur.first();
		return SubLNil.NIL;
	}

	public SubLObject first() {
		return this.car;
	}

	public SubLObject get(int index) {
		return this.nthCdr(index).first();
	}

	public SubLObject getDottedElement() {
		return this.last(0);
	}

	public SubLSymbol getType() {
		return Types.$dtp_cons$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.FOUR_INTEGER;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth >= SubLObject.MAX_HASH_DEPTH)
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
		int compositeHash = SubLConsPair.SXHASH_TYPE_SPEC_PRIME_CONS;
		int compositeState = Sxhash.INITIAL_COMPOSITE_STATE;
		SubLObject cur = this;
		for (int index = 0; index < SubLObject.MAX_HASH_LENGTH && cur.isCons(); cur = cur.rest(), index++) {
			int partHash = cur.first().hashCode(currentDepth + 1);
			compositeState = Sxhash.updateCompositeState(compositeState);
			compositeHash = Sxhash.compositeUpdate(compositeHash, partHash, compositeState);
		}
		if (cur != CommonSymbols.NIL) {
			int partHash = cur.hashCode(currentDepth + 1);
			compositeState = Sxhash.updateCompositeState(compositeState);
			compositeHash = Sxhash.compositeUpdate(compositeHash, partHash, compositeState);
		}
		return compositeHash;
	}

	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		int size = this.size();
		int size2 = otherSeq.size();
		start1 = start1 < 0 ? 0 : start1;
		start2 = start2 < 0 ? 0 : start2;
		end1 = end1 > size ? size : end1;
		end2 = end2 > size2 ? size2 : end2;
		int answer = SubLSequence.MATCH_EVERYWHERE;
		SubLObject obj1, obj2;
		SubLListListIterator iter = null;
		SubLListListIterator iter2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(this, start1, end1);
			iter2 = resourcer.acquireSubLListListIterator(otherSeq.toList(), start2, end2);
			while (iter.hasNext() && iter2.hasNext()) {
				obj1 = iter.nextSubLObject();
				obj2 = iter2.nextSubLObject();
				if (SubLNil.NIL == test.processItem(key.processItem(obj1), key.processItem(obj2))) {
					answer = iter.nextIndex() - 1;
					break;
				}
			}
			if (iter.hasNext() && answer < 0)
				answer = end2 - start2;
			if (iter2.hasNext() && answer < 0)
				answer = end1 - start1;
		} finally {
			resourcer.releaseSubLListListIterator(iter);
			resourcer.releaseSubLListListIterator(iter2);
		}
		return answer >= 0 ? answer + start1 : answer;
	}

	//// SEQUENCES SECTION

	public boolean isArrayBased() {
		return false;
	}

	public boolean isAtom() {
		return false;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return true;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return true;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return false;
	}

	public boolean isSequence() {
		return true;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public SubLObject last(int n) {
		if (n == 1) {
			SubLObject cur = this;
			for (SubLObject temp = cur.rest(); temp.isCons(); cur = temp, temp = temp.rest()) {
			}
			return cur;
		}
		if (n == 0) {
			SubLObject cur = this;
			for (; cur.isCons(); cur = cur.rest()) {
			}
			return cur;
		}
		return this.nthCdr(this.consLength() - n);
	}

	public SubLObject makeCopy() {
		SubLConsPair cur = new SubLConsPair(this.car, this.cdr);
		if (!this.cdr.isCons())
			return cur;
		SubLObject prev = null, old = this.cdr, result = cur;
		for (; old.rest().isCons(); old = old.rest()) {
			prev = cur;
			cur = new SubLConsPair(old.first(), SubLNil.NIL);
			prev.setRest(cur);
		}
		prev = cur;
		cur = new SubLConsPair(old.first(), old.rest());
		prev.setRest(cur);
		return result;
	}

	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLConsPair.makeDeepCopy()");
		return null;
	}

	public SubLSequence makeSequenceFromJavaList(List newBuf) {
		SubLList result = SubLNil.NIL;
		SubLObject prev = null;
		for (int i = 0, size = newBuf.size(); i < size; i++) {
			prev = result;
			result = new SubLConsPair((SubLObject) newBuf.get(i), prev);
		}
		return result;
	}

	public SubLList member(SubLObject item, BinaryFunction test) {
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(item, cur.first()))
				return cur.toList();
		return SubLNil.NIL;
	}

	public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
				if (SubLNil.NIL != test.processItem(item, cur.first()))
					return cur.toList();
		} else
			for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
				if (SubLNil.NIL != test.processItem(item, key.processItem(cur.first())))
					return cur.toList();
		return SubLNil.NIL;
	}

	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		if (otherSeq == SubLNil.NIL)
			return this;
		SubLSequence result = null, lastResultCons = null;
		SubLList curStartOfSeq1 = this, curStartOfSeq2 = otherSeq.toList();
		SubLObject key1 = null, key2 = null;
		SubLCons workingConsCell = null;
		while (curStartOfSeq1 != CommonSymbols.NIL && curStartOfSeq2 != CommonSymbols.NIL) {
			if (key1 == null)
				key1 = key.processItem(curStartOfSeq1.first());
			if (key2 == null)
				key2 = key.processItem(curStartOfSeq2.first());
			if (test.processItem(key2, key1) != CommonSymbols.NIL) {
				key2 = null;
				workingConsCell = curStartOfSeq2.toCons();
				curStartOfSeq2 = curStartOfSeq2.rest().toList();
			} else {
				key1 = null;
				workingConsCell = curStartOfSeq1.toCons();
				curStartOfSeq1 = curStartOfSeq1.rest().toList();
			}
			if (result == null)
				result = workingConsCell;
			else
				lastResultCons.setRest(workingConsCell);
			lastResultCons = workingConsCell;
		}
		lastResultCons.setRest(curStartOfSeq1 != CommonSymbols.NIL ? curStartOfSeq1 : curStartOfSeq2);
		return result;
	}

	public SubLObject nthCdr(int index) {
		SubLObject cur = this;
		for (int i = 0; i++ < index;)
			cur = cur.rest();
		return cur;
	}

	public SubLObject pop() {
		return this.rest();
	}

	public int positionOf(SubLObject item, BinaryFunction test) {
		int count = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest(), count++)
			if (SubLNil.NIL != test.processItem(item, cur.first()))
				return count;
		return SubLSequence.NOT_FOUND;
	}

	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return SubLSequence.NOT_FOUND;
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.positionOf(item, test);
		int count = start;
		SubLObject cur = start == 0 ? this : this.nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (; cur != SubLNil.NIL && count < end; cur = cur.rest(), count++)
				if (SubLNil.NIL != test.processItem(item, cur.first()))
					return count;
		} else
			for (; cur != SubLNil.NIL && count < end; cur = cur.rest(), count++)
				if (SubLNil.NIL != test.processItem(item, key.processItem(cur.first())))
					return count;
		return SubLSequence.NOT_FOUND;
	}

	public int positionOfIf(UnaryFunction test) {
		int count = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest(), count++)
			if (SubLNil.NIL != test.processItem(cur.first()))
				return count;
		return SubLSequence.NOT_FOUND;
	}

	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return SubLSequence.NOT_FOUND;
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.positionOfIf(test);
		int count = start;
		SubLObject cur = start == 0 ? this : this.nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (; cur != SubLNil.NIL && count < end; cur = cur.rest(), count++)
				if (SubLNil.NIL != test.processItem(cur.first()))
					return count;
		} else
			for (; cur != SubLNil.NIL && count < end; cur = cur.rest(), count++)
				if (SubLNil.NIL != test.processItem(key.processItem(cur.first())))
					return count;
		return SubLSequence.NOT_FOUND;
	}

	public SubLCons push(SubLObject item) {
		return new SubLConsPair(item, this);
	}

	public SubLCons pushNew(SubLObject item) {
		if (this.positionOf(item) < 0)
			return this.push(item);
		return this;
	}

	public SubLCons pushNew(SubLObject item, BinaryFunction test) {
		if (this.positionOf(item, test) < 0)
			return this.push(item);
		return this;
	}

	public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
		if (this.positionOf(item, test, key) < 0)
			return this.push(item);
		return this;
	}

	public SubLObject reduce(BinaryFunction func) {
		int start = 0;
		SubLObject result = this.first();
		for (SubLObject cur = this.rest(); cur != SubLNil.NIL; cur = cur.rest())
			result = func.processItem(result, cur.first());
		return result;
	}

	// @note why doesn't this function take a key like the vast majority of
	// other
	// sequence functions??? This definitely seems to diverge from the Lisp
	// hyperspec for no good reason...
	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		if (start < 0)
			start = 0;
		if (end <= start)
			if (initialValue != SubLSequence.NO_INIT_VALUE)
				return initialValue;
			else
				// @note the following line does not agree with C version but is
				// accurate according to the Lisp hyperspec
				return func.getFunction().apply(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && initialValue == SubLSequence.NO_INIT_VALUE)
			return this.reduce(func);
		SubLObject result = initialValue == SubLSequence.NO_INIT_VALUE ? this.get(start++) : initialValue;
		int index = start;
		for (SubLObject cur = start == 0 ? this : this.nthCdr(start); cur != SubLNil.NIL
				&& index < end; cur = cur.rest(), index++)
			result = func.processItem(result, cur.first());
		return result;
	}

	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test) {
		SubLSequence result = isDestructive ? this : this.makeCopy().toSeq();
		SubLObject prev = SubLNil.NIL;
		for (SubLObject cur = result; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(item, cur.first())) {
				if (prev == SubLNil.NIL)
					result = cur.rest().toSeq();
				else
					prev.setRest(cur.rest());
			} else
				prev = cur;
		return result;
	}

	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		SubLList result = isDestructive ? this : this.makeCopy().toList();
		if (start < 0)
			start = 0;
		if (end <= start || count < 0)
			return result;
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC
				&& count == SubLSequence.ALL_OCCURRENCES)
			return result.remove(item, true, test);
		int index = start, occurrences = 0;
		SubLObject cur = start == 0 ? result : result.nthCdr(start);
		SubLObject prev = start == 0 ? SubLNil.NIL : result.nthCdr(start - 1);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (; cur != SubLNil.NIL && index < end && occurrences < count; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(item, cur.first())) {
					occurrences++;
					if (prev == SubLNil.NIL)
						result = cur.rest().toList();
					else
						prev.setRest(cur.rest());
				} else
					prev = cur;
		} else
			for (; cur != SubLNil.NIL && index < end && occurrences < count; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(item, key.processItem(cur.first()))) {
					occurrences++;
					if (prev == SubLNil.NIL)
						result = cur.rest().toList();
					else
						prev.setRest(cur.rest());
				} else
					prev = cur;
		return result;
	}

	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test) {
		SubLSequence result = isDestructive ? this : this.makeCopy().toSeq();
		for (SubLObject cur = result; cur != SubLNil.NIL; cur = cur.rest())
			cur.setRest(cur.rest().toList().remove(cur.first(), true, test));
		return result;
	}

	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		SubLSequence result = isDestructive ? this : this.makeCopy().toSeq();
		if (start < 0)
			start = 0;
		if (end <= start)
			return result;
		if (key == UnaryFunction.IDENTITY_UNARY_FUNC && end == CommonSymbols.PROCESS_TO_END)
			if (test == BinaryFunction.EQL_TEST || test == BinaryFunction.EQ_TEST || test == BinaryFunction.EQUAL_TEST
					|| test == BinaryFunction.EQUALP_TEST) {
				int size = this.size();
				if (size >= AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF)
					return AbstractSubLSequence.removeDuplicatesFast(this, test, start, end);
			}
		if (SubLList.ALLOW_REMOVE_DUPLICATES_FROM_END && start == 0 && end == CommonSymbols.PROCESS_TO_END
				&& key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return result.removeDuplicates(true, test);
		if (SubLList.ALLOW_REMOVE_DUPLICATES_FROM_END) {
			SubLObject cur = start == 0 ? result : result.nthCdr(start);
			int itemsRemoved = 0;
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), index++) {
				SubLObject item = key.processItem(cur.first());
				SubLList restList = cur.rest().toList();
				int curEnd = end == CommonSymbols.PROCESS_TO_END ? end : end - itemsRemoved - index - 1;
				int count = restList.count(item, test, key, 0, curEnd);
				if (count > 0) {
					cur.setRest(restList.remove(item, true, test, key, 0, curEnd));
					itemsRemoved += count;
				}
			}
			return result;
		} else {
			int curLoc = start;
			SubLObject curList = result.nthCdr(start);
			SubLObject prevList = start > 0 ? result.nthCdr(start - 1) : SubLNil.NIL;
			int localEnd = end - start;
			int itemsRemoved = 0;
			if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
				while (curLoc++ < end && curList != SubLNil.NIL) {
					if (result.count(curList.first(), test, key, start, end - itemsRemoved) > 1) {
						itemsRemoved++;
						if (prevList == SubLNil.NIL)
							result = curList.rest().toSeq();
						else
							prevList.setRest(curList.rest());
					} else
						prevList = curList;
					curList = curList.rest();
				}
			else
				while (curLoc++ < end && curList != SubLNil.NIL) {
					if (result.count(key.processItem(curList.first()), test, key, start, end - itemsRemoved) > 1) {
						itemsRemoved++;
						if (prevList == SubLNil.NIL)
							result = curList.rest().toSeq();
						else
							prevList.setRest(curList.rest());
					} else
						prevList = curList;
					curList = curList.rest();
				}
			return result;
		}
	}

	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive) {
		SubLList result = isDestructive ? this : this.makeCopy().toList();
		SubLObject prev = SubLNil.NIL;
		for (SubLObject cur = result; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(cur.first())) {
				if (prev == SubLNil.NIL)
					result = cur.rest().toList();
				else
					prev.setRest(cur.rest());
			} else
				prev = cur;
		return result;
	}

	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		SubLList result = isDestructive ? this : this.makeCopy().toList();
		if (start < 0)
			start = 0;
		if (end <= start || count < 0)
			return result;
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC
				&& count == SubLSequence.ALL_OCCURRENCES)
			return result.removeIf(test, true);
		int index = start, occurrences = 0;
		SubLObject cur = start == 0 ? result : result.nthCdr(start);
		SubLObject prev = start == 0 ? SubLNil.NIL : result.nthCdr(start - 1);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (; cur != SubLNil.NIL && index < end && occurrences < count; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(cur.first())) {
					occurrences++;
					if (prev == SubLNil.NIL)
						result = cur.rest().toList();
					else
						prev.setRest(cur.rest());
				} else
					prev = cur;
			return result;
		} else
			for (; cur != SubLNil.NIL && index < end && occurrences < count; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(key.processItem(cur.first()))) {
					occurrences++;
					if (prev == SubLNil.NIL)
						result = cur.rest().toList();
					else
						prev.setRest(cur.rest());
				} else
					prev = cur;
		return result;
	}

	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int end2) {
		if (start1 < 0)
			start1 = 0;
		int size = this.size();
		int size2 = seq.size();
		if (end1 > size)
			end1 = size;
		if (start2 < 0)
			start2 = 0;
		if (end2 > size2)
			end2 = size2;
		SubLObject currentItem = null, result = SubLNil.NIL, currentItem2;
		SubLListListIterator iter = null;
		SubLListListIterator iter2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(this, start1, end1);
			iter2 = resourcer.acquireSubLListListIterator(seq.toList(), start2, end2);
			while (iter.hasNext() && iter2.hasNext()) {
				currentItem = iter.nextSubLObject();
				currentItem2 = iter2.nextSubLObject();
				iter.set(currentItem2);
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
			resourcer.releaseSubLListListIterator(iter2);
		}
		return this; // @this is wrong...need to deal with nil!!!!!!!
	}

	public SubLObject rest() {
		return this.cdr;
	}

	public SubLSequence reverse(boolean isDestructive) {
		SubLList result = isDestructive ? this : this.makeCopy().toList();
		SubLObject top = result;
		SubLObject last = result;
		SubLObject temp = result.rest();
		while (SubLNil.NIL != temp) {
			last.setRest(temp.rest());
			temp.setRest(top);
			top = temp;
			temp = last.rest();
		}
		return top.toSeq();
	}

	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		int size = this.size();
		int size2 = otherSeq.size();
		start1 = start1 < 0 ? 0 : start1;
		start2 = start2 < 0 ? 0 : start2;
		end1 = end1 > size ? size : end1;
		end2 = end2 > size2 ? size2 : end2;
		int answer = SubLSequence.NOT_FOUND;
		SubLObject obj1, obj2;
		boolean hasMatch = false;
		SubLListListIterator iter = null;
		SubLListListIterator iter2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		SubLList list1 = this, list2 = otherSeq.toList();
		try {
			iter = resourcer.acquireSubLListListIterator(list1);
			iter2 = resourcer.acquireSubLListListIterator(list2);
			for (int i = start2, size3 = end2 - (end1 - start1) + 1; i < size3; i++) {
				hasMatch = true;
				answer = i;
				iter.reset();
				iter.init(list1, start1, end1);
				iter2.reset();
				iter2.init(list2, i, size3);
				while (iter.hasNext() && iter2.hasNext()) {
					obj1 = iter.nextSubLObject();
					obj2 = iter2.nextSubLObject();
					if (SubLNil.NIL == test.processItem(key.processItem(obj1), key.processItem(obj2))) {
						hasMatch = false;
						break;
					}
				}
				if (hasMatch)
					break;
				answer = SubLSequence.NOT_FOUND;
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
			resourcer.releaseSubLListListIterator(iter2);
		}
		return answer >= 0 ? answer + start1 : answer;
	}

	public void set(int index, SubLObject item) {
		this.nthCdr(index).setFirst(item);
	}

	public SubLObject setDottedElement(SubLObject dottedElement) {
		return this.last(1).setRest(dottedElement);
	}

	public SubLCons setFirst(SubLObject first) {
		if (SubLObjectFactory.USE_ARRAY_LISTS)
			// compile this code out
			// when appropriate
			if (first.isCons() && first.isArrayBased())
			first = first.asConsList(); // @hack
		this.car = first;
		return this;
	}

	public SubLCons setRest(SubLObject rest) {
		if (SubLObjectFactory.USE_ARRAY_LISTS)
			// compile this code out
			// when appropriate
			if (rest.isCons() && rest.isArrayBased())
			rest = rest.asConsList(); // not a hack
		this.cdr = rest;
		return this;
	}

	public int size() {
		int count = 1;
		SubLObject cur = this.rest();
		for (; cur.isCons(); cur = cur.rest(), count++) {
		}
		return cur == SubLNil.NIL ? count : count++;
	}

	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		if (this.rest() == CommonSymbols.NIL) {
			if (isDestructive)
				return this;
			return (SubLSequence) this.makeCopy();
		}
		SubLObject[] seq = null;
		SubLThread thread = SubLProcess.currentSubLThread();
		Resourcer resourcer = thread.getResourcer();
		try {
			seq = resourcer.acquireSubLObjectArray(this.consLength());
			seq = (SubLObject[]) this.toArray(seq);
			if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
				Arrays.sort(seq, new ComparatorIdentityKey<SubLObject>(pred)); // @todo
																				// resource
																				// this
			else
				Arrays.sort(seq, new ComparatorGenericKey<SubLObject>(pred, key)); // @todo
																					// resource
																					// this
			if (isDestructive) {
				int i = 0;
				for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
					cur.setFirst(seq[i++]);
				return this;
			} else
				return SubLObjectFactory.makeList(seq);
		} finally {
			resourcer.releaseSubLObjectArray(seq);
		}
	}

	public java.util.List subList(int fromIndex, int toIndex) {
		Errors.unimplementedMethod("SubLConsPair.subList");
		return null;
	}

	public SubLSequence subSeq(int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return SubLNil.NIL;
		SubLObject cur = start == 0 ? this : this.nthCdr(start);
		SubLSequence result = SubLNil.NIL, curResult = SubLNil.NIL, prevResult;
		for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), count++) {
			prevResult = curResult;
			curResult = new SubLConsPair(cur.first(), SubLNil.NIL);
			if (prevResult != SubLNil.NIL)
				prevResult.setRest(curResult);
			if (result == SubLNil.NIL)
				result = curResult;
		}
		return result;
	}

	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test) {
		SubLList result = isDestructive ? this : this.makeCopy().toList();
		for (SubLObject cur = result; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(oldItem, cur.first()))
				cur.setFirst(newItem);
		return result;
	}

	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		SubLList result = isDestructive ? this : this.makeCopy().toList();
		if (start < 0)
			start = 0;
		if (end <= start)
			return result;
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return result.substitute(newItem, oldItem, true, test);
		SubLObject cur = start == 0 ? result : result.nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(oldItem, cur.first()))
					cur.setFirst(newItem);
		} else
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(oldItem, key.processItem(cur.first())))
					cur.setFirst(newItem);
		return result;
	}

	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive) {
		SubLList result = isDestructive ? this : this.makeCopy().toList();
		for (SubLObject cur = result; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(cur.first()))
				cur.setFirst(newItem);
		return result;
	}

	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		SubLList result = isDestructive ? this : this.makeCopy().toList();
		if (start < 0)
			start = 0;
		if (end <= start)
			return result;
		if (start == 0 && end == CommonSymbols.PROCESS_TO_END && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return result.substituteIf(newItem, test, true);
		SubLObject cur = start == 0 ? result : result.nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(cur.first()))
					cur.setFirst(newItem);
		} else
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), index++)
				if (SubLNil.NIL != test.processItem(key.processItem(cur.first())))
					cur.setFirst(newItem);
		return result;
	}

	public Object[] toArray() {
		return this.toArray(new SubLObject[this.consLength()]);
	}

	public Object[] toArray(Object[] array) {
		int i = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			array[i++] = cur.first();
		return array;
	}

	/** Method created to avoid casting */
	public SubLCons toCons() { // SubLCons
		return this;
	}

	public String toString() {
		if (!PrintLow.shouldPrintAtCurrentLevel())
			return "( # )";
		SubLObject oldLevel = PrintLow.maybeIncreasePrintLevel();
		try {
			StringBuilder buf = new StringBuilder("(");
			boolean checkLength = PrintLow.controlPrintLength();
			int printLength = PrintLow.maxPrintLength();
			SubLObject cur = this;
			int counter = 0;
			for (; cur.rest().isCons() && counter < printLength; cur = cur.rest(), counter++) {
				buf.append(cur.first());
				if (cur.rest().isCons())
					buf.append(" ");
			}
			if (counter >= printLength)
				buf.append(" ... ");
			else
				buf.append(cur.first());
			if (counter < printLength && !cur.rest().isList())
				buf.append(" . ").append(cur.rest());
			buf.append(")");
			return buf.toString();
		} finally {
			PrintLow.maybeDecreasePrintLevel(oldLevel);
		}
	}

	public SubLObject[] toSubLObjectArray() {
		int size = this.size();
		SubLObject[] result = new SubLObject[size];
		int i = 0;
		for (SubLObject cur = this; cur != CommonSymbols.NIL; cur = cur.rest())
			result[i++] = cur.first();
		return result;
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	// private SubLObject car;
	// private SubLObject cdr;

}
