//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence.EQL_TEST;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence.IDENTITY_UNARY_FUNC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.armedbear.lisp.Cons;
import org.armedbear.lisp.Environment;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.SpecialOperator;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLInterpretedFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLMacro;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperatorFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.ComparatorGenericKey;
import com.cyc.tool.subl.util.ComparatorIdentityKey;

abstract public class SubLConsPair extends LispObject implements SubLCons, SubLList {
	// SubLConsPair(SubLObject car, SubLObject cdr) {
	// this.car = car;
	// this.cdr = cdr;
	// }

	// private SubLObject car;
	// private SubLObject cdr;
	private static int SXHASH_TYPE_SPEC_PRIME_CONS = 167;

	@Override
	public SubLList addItem(SubLObject item) {
		return last(1).setRest(item);
	}

	@Override
	public SubLList asArrayList() {
		ArrayList<SubLObject> buf = new ArrayList<SubLObject>();
		SubLObject cur = this;
		for (SubLObject temp = cur.rest(); temp.isCons(); temp = temp.rest()) {
			buf.add(cur.first());
			cur = temp;
		}
		buf.add(cur.first());
		SubLArrayList result = (SubLArrayList) SubLObjectFactory.makeList_Dangerous(buf);
		result.setDottedElement(cur.rest());
		return result;
	}

	@Override
	public SubLList asConsList() {
		return this;
	}

	@Override
	public boolean canFastHash() {
		return false;
	}

	@Override
	public LispObject cddr() {
		return (LispObject) rest().rest();
	}

	@Override
	public Object clone() {
		return makeCopy();
	}

	@Override
	public SubLSequence concatenate(SubLObject[] sequences) {
		int listCount = sequences.length;
		SubLObject result = makeCopy();
		SubLObject lastLast = result.last(1);
		for (int i = 0, size = sequences.length; i < size; ++i) {
			SubLObject cur = sequences[i];
			cur.enforceType(CommonSymbols.SEQUENCEP);
			if (cur.isCons()) {
				SubLObject curList = cur.asConsList().makeCopy();
				lastLast.setRest(curList);
				lastLast = curList.last(1);
			} else {
				SubLObject seq = cur;
				for (int j = 0, size2 = seq.size(); j < size2; ++j) {
					SubLConsPair newCons = new Cons((LispObject) seq.get(j), SubLNil.NIL);
					lastLast.setRest(newCons);
					lastLast = newCons;
				}
			}
		}
		return result.toList();
	}

	@Override
	public int consLength() {
		int count = 1;
		for (SubLObject cur = rest(); cur.isCons(); cur = cur.rest(), ++count) {
		}
		return count;
	}

	public boolean consp() {
		return true;
	}

	@Override
	public int count(SubLObject item, BinaryFunction test) {
		int result = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(item, cur.first()))
				++result;
		return result;
	}

	@Override
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		int result = 0;
		if (start < 0)
			start = 0;
		if (end <= start)
			return 0;
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.count(item, test);
		SubLObject cur = start == 0 ? this : nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), ++count)
				if (SubLNil.NIL != test.processItem(item, cur.first()))
					++result;
		} else
			for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), ++count)
				if (SubLNil.NIL != test.processItem(item, key.processItem(cur.first())))
					++result;
		return result;
	}

	@Override
	public int countIf(UnaryFunction test) {
		int result = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(cur.first()))
				++result;
		return result;
	}

	@Override
	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		int result = 0;
		if (start < 0)
			start = 0;
		if (end <= start)
			return 0;
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.countIf(test);
		SubLObject cur = start == 0 ? this : nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), ++count)
				if (SubLNil.NIL != test.processItem(cur.first()))
					++result;
		} else
			for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), ++count)
				if (SubLNil.NIL != test.processItem(key.processItem(cur.first())))
					++result;
		return result;
	}

	@Override
	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (startIndex >= endIndexExclusive)
			return this;
		boolean didDeleteStart = startIndex == 0;
		SubLObject prevCdr = didDeleteStart ? SubLNil.NIL : nthCdr(startIndex - 1);
		SubLObject nextCdr = nthCdr(endIndexExclusive);
		if (prevCdr != SubLNil.NIL) {
			prevCdr.setRest(nextCdr);
			return this;
		}
		if (nextCdr == SubLNil.NIL)
			return SubLNil.NIL;
		return nextCdr.toSeq();
	}

	@Override
	public boolean equal(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!obj.isCons())
			return false;
		SubLObject cur1;
		for (cur1 = this; cur1.isCons() && obj.isCons(); cur1 = cur1.rest(), obj = obj.rest()) {
			final SubLObject e1 = cur1.first();
			final SubLObject e2 =  obj.first();
			if (!e1.equal(e2)) {
				return false;
			}
		}
		return !cur1.isCons() && !obj.isCons() && cur1.equal(obj);
	}

	@Override
	public boolean equalp(SubLObject obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!obj.isCons())
			return false;
		SubLObject cur1;
		for (cur1 = this; cur1.isCons() && obj.isCons(); cur1 = cur1.rest(), obj = obj.rest())
			if (!cur1.first().equalp(obj.first()))
				return false;
		return !cur1.isCons() && !obj.isCons() && cur1.equalp(obj);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SubLObject))
			return false;
		SubLObject sobj = (SubLObject) obj;
		if (!sobj.isCons())
			return false;
		SubLObject cur1;
		for (cur1 = this; cur1.isCons() && sobj.isCons(); cur1 = cur1.rest(), sobj = sobj.rest())
			if (!cur1.first().equals(sobj.first()))
				return false;
		return !cur1.isCons() && !sobj.isCons() && cur1.equals(sobj);
	}

	@Override
	public SubLSequence fill(SubLObject item, int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return this;
		SubLObject cur = start == 0 ? this : nthCdr(start);
		for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), ++count)
			cur.setFirst(item);
		return this;
	}

	@Override
	public SubLObject find(SubLObject item, BinaryFunction test) {
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(item, cur.first()))
				return cur.first();
		return SubLNil.NIL;
	}

	@Override
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return SubLNil.NIL;
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.find(item, test);
		SubLObject cur = start == 0 ? this : nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), ++index)
				if (SubLNil.NIL != test.processItem(item, cur.first()))
					return cur.first();
		} else
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), ++index)
				if (SubLNil.NIL != test.processItem(item, key.processItem(cur.first())))
					return cur.first();
		return SubLNil.NIL;
	}

	@Override
	public SubLObject findIf(UnaryFunction test) {
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(cur.first()))
				return cur.first();
		return SubLNil.NIL;
	}

	@Override
	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return SubLNil.NIL;
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.findIf(test);
		SubLObject cur = start == 0 ? this : nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), ++index)
				if (SubLNil.NIL != test.processItem(cur.first()))
					return cur.first();
		} else
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), ++index)
				if (SubLNil.NIL != test.processItem(key.processItem(cur.first())))
					return cur.first();
		return SubLNil.NIL;
	}

	@Override
	final public Cons toLispObject() {
		return (Cons) this;
	}

	@Override
	abstract public SubLObject first();

	@Override
	abstract public SubLObject rest();

	@Override
	public LispObject get(int index) {
		return (LispObject) nthCdr(index).first();
	}

	@Override
	public SubLObject getDottedElement() {
		return last(0);
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_cons$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.FOUR_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth >= 8)
			return 0;
		int compositeHash = 167;
		int compositeState = 4;
		SubLObject cur = this;
		for (int index = 0; index < 8 && cur.isCons(); cur = cur.rest(), ++index) {
			int partHash = cur.first().hashCode(currentDepth + 1);
			compositeState = Sxhash.updateCompositeState(compositeState);
			compositeHash = Sxhash.compositeUpdate(compositeHash, partHash, compositeState);
		}
		if (cur != SubLNil.NIL) {
			int partHash2 = cur.hashCode(currentDepth + 1);
			compositeState = Sxhash.updateCompositeState(compositeState);
			compositeHash = Sxhash.compositeUpdate(compositeHash, partHash2, compositeState);
		}
		return compositeHash;
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		int size = this.size();
		int size2 = otherSeq.size();
		start1 = start1 < 0 ? 0 : start1;
		start2 = start2 < 0 ? 0 : start2;
		end1 = end1 > size ? size : end1;
		end2 = end2 > size2 ? size2 : end2;
		int answer = -3;
		SubLListListIterator iter = null;
		SubLListListIterator iter2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(this, start1, end1);
			iter2 = resourcer.acquireSubLListListIterator(otherSeq.toList(), start2, end2);
			while (iter.hasNext() && iter2.hasNext()) {
				SubLObject obj1 = iter.nextSubLObject();
				SubLObject obj2 = iter2.nextSubLObject();
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

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isArrayBased() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return false;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return true;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return true;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return false;
	}

	@Override
	public boolean isSequence() {
		return true;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	@Override
	public SubLObject last(int n) {
		if (n == 1) {
			SubLObject cur = this;
			for (SubLObject temp = cur.rest(); temp.isCons(); temp = temp.rest())
				cur = temp;
			return cur;
		}
		if (n == 0) {
			SubLObject cur;
			for (cur = this; cur.isCons(); cur = cur.rest()) {
			}
			return cur;
		}
		return nthCdr(consLength() - n);
	}

	@Override
	public SubLObject makeCopy() {
		Cons thiz = toLispObject();
		final LispObject thizcdr = thiz.cdr;
		SubLConsPair cur = new Cons(thiz.car, thizcdr);
		if (!thizcdr.isCons())
			return cur;
		SubLObject prev = null;
		SubLObject old = thizcdr;
		SubLObject result = cur;
		while (old.rest().isCons()) {
			prev = cur;
			cur = new Cons(old.first(), SubLNil.NIL);
			prev.setRest(cur);
			old = old.rest();
		}
		prev = cur;
		cur = new Cons(old.first(), old.rest());
		prev.setRest(cur);
		return result;
	}

	@Override
	public SubLObject makeDeepCopy() {
		Errors.unimplementedMethod("SubLConsPair.makeDeepCopy()");
		return null;
	}

	@Override
	public SubLSequence makeSequenceFromJavaList(List newBuf) {
		SubLList result = SubLNil.NIL;
		SubLObject prev = null;
		for (int i = 0, size = newBuf.size(); i < size; ++i) {
			prev = result;
			result = new Cons((LispObject) newBuf.get(i), (LispObject) prev);
		}
		return result;
	}

	@Override
	public SubLList member(SubLObject item, BinaryFunction test) {
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			if (SubLNil.NIL != test.processItem(item, cur.first()))
				return cur.toList();
		return SubLNil.NIL;
	}

	@Override
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

	@Override
	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		if (otherSeq == SubLNil.NIL)
			return this;
		SubLSequence result = null;
		SubLSequence lastResultCons = null;
		SubLList curStartOfSeq1 = this;
		SubLList curStartOfSeq2 = otherSeq.toList();
		SubLObject key2 = null;
		SubLObject key3 = null;
		SubLCons workingConsCell = null;
		while (curStartOfSeq1 != SubLNil.NIL && curStartOfSeq2 != SubLNil.NIL) {
			if (key2 == null)
				key2 = key.processItem(curStartOfSeq1.first());
			if (key3 == null)
				key3 = key.processItem(curStartOfSeq2.first());
			if (test.processItem(key3, key2) != SubLNil.NIL) {
				key3 = null;
				workingConsCell = curStartOfSeq2.toCons();
				curStartOfSeq2 = curStartOfSeq2.rest().toList();
			} else {
				key2 = null;
				workingConsCell = curStartOfSeq1.toCons();
				curStartOfSeq1 = curStartOfSeq1.rest().toList();
			}
			if (result == null)
				result = workingConsCell;
			else
				lastResultCons.setRest(workingConsCell);
			lastResultCons = workingConsCell;
		}
		lastResultCons.setRest(curStartOfSeq1 != SubLNil.NIL ? curStartOfSeq1 : curStartOfSeq2);
		return result;
	}

	@Override
	public SubLObject nthCdr(int index) {
		SubLObject cur = this;
		int i = 0;
		while (i++ < index)
			cur = cur.rest();
		return cur;
	}

	@Override
	public SubLObject pop() {
		return rest();
	}

	@Override
	public int positionOf(SubLObject item, BinaryFunction test) {
		int count = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest(), ++count)
			if (SubLNil.NIL != test.processItem(item, cur.first()))
				return count;
		return -2;
	}

	@Override
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return -2;
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.positionOf(item, test);
		int count;
		SubLObject cur = (count = start) == 0 ? this : nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			while (cur != SubLNil.NIL && count < end) {
				if (SubLNil.NIL != test.processItem(item, cur.first()))
					return count;
				cur = cur.rest();
				++count;
			}
		else
			while (cur != SubLNil.NIL && count < end) {
				if (SubLNil.NIL != test.processItem(item, key.processItem(cur.first())))
					return count;
				cur = cur.rest();
				++count;
			}
		return -2;
	}

	@Override
	public int positionOfIf(UnaryFunction test) {
		int count = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest(), ++count)
			if (SubLNil.NIL != test.processItem(cur.first()))
				return count;
		return -2;
	}

	@Override
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return -2;
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return this.positionOfIf(test);
		int count;
		SubLObject cur = (count = start) == 0 ? this : nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			while (cur != SubLNil.NIL && count < end) {
				if (SubLNil.NIL != test.processItem(cur.first()))
					return count;
				cur = cur.rest();
				++count;
			}
		else
			while (cur != SubLNil.NIL && count < end) {
				if (SubLNil.NIL != test.processItem(key.processItem(cur.first())))
					return count;
				cur = cur.rest();
				++count;
			}
		return -2;
	}

	@Override
	public SubLCons push(SubLObject item) {
		return new Cons((LispObject) item, this);
	}

	@Override
	public SubLCons pushNew(SubLObject item) {
		if (this.positionOf(item) < 0)
			return push(item);
		return this;
	}

	@Override
	public SubLCons pushNew(SubLObject item, BinaryFunction test) {
		if (this.positionOf(item, test) < 0)
			return push(item);
		return this;
	}

	@Override
	public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
		if (this.positionOf(item, test, key) < 0)
			return push(item);
		return this;
	}

	@Override
	public SubLObject reduce(BinaryFunction func) {
		int start = 0;
		SubLObject result = first();
		for (SubLObject cur = rest(); cur != SubLNil.NIL; cur = cur.rest())
			result = func.processItem(result, cur.first());
		return result;
	}

	@Override
	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		if (start < 0)
			start = 0;
		if (end <= start) {
			if (initialValue != SubLSequence.NO_INIT_VALUE)
				return initialValue;
			return func.getFunction().apply(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
		} else {
			if (start == 0 && end == Integer.MAX_VALUE && initialValue == SubLSequence.NO_INIT_VALUE)
				return this.reduce(func);
			SubLObject result = initialValue == SubLSequence.NO_INIT_VALUE ? this.get(start++) : initialValue;
			int index = start;
			for (SubLObject cur = start == 0 ? this : nthCdr(start); cur != SubLNil.NIL
					&& index < end; cur = cur.rest(), ++index)
				result = func.processItem(result, cur.first());
			return result;
		}
	}

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test) {
		SubLSequence result = isDestructive ? this : makeCopy().toSeq();
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

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		SubLList result = isDestructive ? this : makeCopy().toList();
		if (start < 0)
			start = 0;
		if (end <= start || count < 0)
			return result;
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC
				&& count == Integer.MAX_VALUE)
			return result.remove(item, true, test);
		int index = start;
		int occurrences = 0;
		SubLObject cur = start == 0 ? result : result.nthCdr(start);
		SubLObject prev = start == 0 ? SubLNil.NIL : result.nthCdr(start - 1);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			while (cur != SubLNil.NIL && index < end && occurrences < count) {
				if (SubLNil.NIL != test.processItem(item, cur.first())) {
					++occurrences;
					if (prev == SubLNil.NIL)
						result = cur.rest().toList();
					else
						prev.setRest(cur.rest());
				} else
					prev = cur;
				cur = cur.rest();
				++index;
			}
		else
			while (cur != SubLNil.NIL && index < end && occurrences < count) {
				if (SubLNil.NIL != test.processItem(item, key.processItem(cur.first()))) {
					++occurrences;
					if (prev == SubLNil.NIL)
						result = cur.rest().toList();
					else
						prev.setRest(cur.rest());
				} else
					prev = cur;
				cur = cur.rest();
				++index;
			}
		return result;
	}

	@Override
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test) {
		SubLObject cur;
		SubLSequence result;
		for (result = (SubLSequence) (cur = isDestructive ? this : makeCopy().toSeq()); cur != SubLNil.NIL; cur = cur
				.rest())
			cur.setRest(cur.rest().toList().remove(cur.first(), true, test));
		return result;
	}

	@Override
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		SubLSequence result = isDestructive ? this : makeCopy().toSeq();
		if (start < 0)
			start = 0;
		if (end <= start)
			return result;
		if (key == UnaryFunction.IDENTITY_UNARY_FUNC && end == Integer.MAX_VALUE
				&& (test == BinaryFunction.EQL_TEST || test == BinaryFunction.EQ_TEST
						|| test == BinaryFunction.EQUAL_TEST || test == BinaryFunction.EQUALP_TEST)) {
			int size = this.size();
			if (size >= AbstractSubLSequence.FAST_DELETE_DUPLICATES_CONS_CUTOFF)
				return AbstractSubLSequence.removeDuplicatesFast(this, test, start, end);
		}
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return result.removeDuplicates(true, test);
		SubLObject cur = start == 0 ? result : result.nthCdr(start);
		int itemsRemoved = 0;
		for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), ++index) {
			SubLObject item = key.processItem(cur.first());
			SubLList restList = cur.rest().toList();
			int curEnd = end == Integer.MAX_VALUE ? end : end - itemsRemoved - index - 1;
			int count = restList.count(item, test, key, 0, curEnd);
			if (count > 0) {
				cur.setRest(restList.remove(item, true, test, key, 0, curEnd));
				itemsRemoved += count;
			}
		}
		return result;
	}

	@Override
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive) {
		SubLList result = isDestructive ? this : makeCopy().toList();
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

	@Override
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		SubLList result = isDestructive ? this : makeCopy().toList();
		if (start < 0)
			start = 0;
		if (end <= start || count < 0)
			return result;
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC
				&& count == Integer.MAX_VALUE)
			return result.removeIf(test, true);
		int index = start;
		int occurrences = 0;
		SubLObject cur = start == 0 ? result : result.nthCdr(start);
		SubLObject prev = start == 0 ? SubLNil.NIL : result.nthCdr(start - 1);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			while (cur != SubLNil.NIL && index < end && occurrences < count) {
				if (SubLNil.NIL != test.processItem(cur.first())) {
					++occurrences;
					if (prev == SubLNil.NIL)
						result = cur.rest().toList();
					else
						prev.setRest(cur.rest());
				} else
					prev = cur;
				cur = cur.rest();
				++index;
			}
			return result;
		}
		while (cur != SubLNil.NIL && index < end && occurrences < count) {
			if (SubLNil.NIL != test.processItem(key.processItem(cur.first()))) {
				++occurrences;
				if (prev == SubLNil.NIL)
					result = cur.rest().toList();
				else
					prev.setRest(cur.rest());
			} else
				prev = cur;
			cur = cur.rest();
			++index;
		}
		return result;
	}

	@Override
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
		SubLObject currentItem = null;
		SubLObject result = SubLNil.NIL;
		SubLListListIterator iter = null;
		SubLListListIterator iter2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(this, start1, end1);
			iter2 = resourcer.acquireSubLListListIterator(seq.toList(), start2, end2);
			while (iter.hasNext() && iter2.hasNext()) {
				currentItem = iter.nextSubLObject();
				SubLObject currentItem2 = iter2.nextSubLObject();
				iter.set(currentItem2);
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
			resourcer.releaseSubLListListIterator(iter2);
		}
		return this;
	}

	@Override
	public SubLSequence reverse(boolean isDestructive) {
		SubLObject top;
		SubLObject last;
		SubLList result = (SubLList) (last = top = isDestructive ? this : makeCopy().toList());
		for (SubLObject temp = result.rest(); SubLNil.NIL != temp; temp = last.rest()) {
			last.setRest(temp.rest());
			temp.setRest(top);
			top = temp;
		}
		return top.toSeq();
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		int size = this.size();
		int size2 = otherSeq.size();
		start1 = start1 < 0 ? 0 : start1;
		start2 = start2 < 0 ? 0 : start2;
		end1 = end1 > size ? size : end1;
		end2 = end2 > size2 ? size2 : end2;
		int answer = -2;
		boolean hasMatch = false;
		SubLListListIterator iter = null;
		SubLListListIterator iter2 = null;
		Resourcer resourcer = Resourcer.getInstance();
		SubLList list2 = otherSeq.toList();
		try {
			iter = resourcer.acquireSubLListListIterator(this);
			iter2 = resourcer.acquireSubLListListIterator(list2);
			for (int i = start2, size3 = end2 - (end1 - start1) + 1; i < size3; ++i) {
				hasMatch = true;
				answer = i;
				iter.reset();
				iter.init(this, start1, end1);
				iter2.reset();
				iter2.init(list2, i, end2);
				while (iter.hasNext() && iter2.hasNext()) {
					SubLObject obj1 = iter.nextSubLObject();
					SubLObject obj2 = iter2.nextSubLObject();
					if (SubLNil.NIL == test.processItem(key.processItem(obj1), key.processItem(obj2))) {
						hasMatch = false;
						break;
					}
				}
				if (hasMatch)
					break;
				answer = -2;
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
			resourcer.releaseSubLListListIterator(iter2);
		}
		return answer >= 0 ? answer + start1 : answer;
	}

	@Override
	public void set(int index, SubLObject item) {
		nthCdr(index).setFirst(item);
	}

	@Override
	public SubLObject setDottedElement(SubLObject dottedElement) {
		return last(1).setRest(dottedElement);
	}

	@Override
	public SubLCons setFirst(SubLObject first) {
		toLispObject().car = notNull(first);
		return this;
	}

	static public LispObject notNull(SubLObject first)
	{
		return first.toLispObject();
	}

	@Override
	public SubLCons setRest(SubLObject rest) {
		toLispObject().cdr = notNull(rest);
		return this;
	}

	@Override
	public int size() {
		int count;
		SubLObject cur;
		for (count = 1, cur = rest(); cur.isCons(); cur = cur.rest(), ++count) {
		}
		return cur == SubLNil.NIL ? count : count++;
	}

	@Override
	public int size(int max) {
		int count = 1;
		SubLObject cur;
		for (cur = rest(); cur.isCons(); cur = cur.rest())
			if (++count >= max)
				return max;
		return cur == SubLNil.NIL ? count : count++;
	}

	@Override
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		if (rest() == SubLNil.NIL) {
			if (isDestructive)
				return this;
			return (SubLSequence) makeCopy();
		} else {
			SubLObject[] seq = null;
			SubLThread thread = SubLProcess.currentSubLThread();
			Resourcer resourcer = thread.getResourcer();
			try {
				seq = resourcer.acquireSubLObjectArray(consLength());
				seq = (SubLObject[]) this.toArray(seq);
				if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
					Arrays.sort(seq, new ComparatorIdentityKey<Object>(pred));
				else
					Arrays.sort(seq, new ComparatorGenericKey<Object>(pred, key));
				if (isDestructive) {
					int i = 0;
					for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
						cur.setFirst(seq[i++]);
					return this;
				}
				return SubLObjectFactory.makeList(seq);
			} finally {
				resourcer.releaseSubLObjectArray(seq);
			}
		}
	}

	public List subList(int fromIndex, int toIndex) {
		Errors.unimplementedMethod("SubLConsPair.subList");
		return null;
	}

	@Override
	public SubLSequence subSeq(int start, int end) {
		if (start < 0)
			start = 0;
		if (end <= start)
			return SubLNil.NIL;
		SubLObject cur = start == 0 ? this : nthCdr(start);
		SubLSequence result = SubLNil.NIL;
		SubLSequence curResult = SubLNil.NIL;
		for (int count = start; cur != SubLNil.NIL && count < end; cur = cur.rest(), ++count) {
			SubLSequence prevResult = curResult;
			curResult = new Cons((LispObject) cur.first(), SubLNil.NIL);
			if (prevResult != SubLNil.NIL)
				prevResult.setRest(curResult);
			if (result == SubLNil.NIL)
				result = curResult;
		}
		return result;
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test) {
		SubLObject cur;
		SubLList result;
		for (result = (SubLList) (cur = isDestructive ? this : makeCopy().toList()); cur != SubLNil.NIL; cur = cur
				.rest())
			if (SubLNil.NIL != test.processItem(oldItem, cur.first()))
				cur.setFirst(newItem);
		return result;
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		SubLList result = isDestructive ? this : makeCopy().toList();
		if (start < 0)
			start = 0;
		if (end <= start)
			return result;
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return result.substitute(newItem, oldItem, true, test);
		SubLObject cur = start == 0 ? result : result.nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), ++index)
				if (SubLNil.NIL != test.processItem(oldItem, cur.first()))
					cur.setFirst(newItem);
		} else
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), ++index)
				if (SubLNil.NIL != test.processItem(oldItem, key.processItem(cur.first())))
					cur.setFirst(newItem);
		return result;
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive) {
		SubLObject cur;
		SubLList result;
		for (result = (SubLList) (cur = isDestructive ? this : makeCopy().toList()); cur != SubLNil.NIL; cur = cur
				.rest())
			if (SubLNil.NIL != test.processItem(cur.first()))
				cur.setFirst(newItem);
		return result;
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		SubLList result = isDestructive ? this : makeCopy().toList();
		if (start < 0)
			start = 0;
		if (end <= start)
			return result;
		if (start == 0 && end == Integer.MAX_VALUE && key == AbstractSubLSequence.IDENTITY_UNARY_FUNC)
			return result.substituteIf(newItem, test, true);
		SubLObject cur = start == 0 ? result : result.nthCdr(start);
		if (key == AbstractSubLSequence.IDENTITY_UNARY_FUNC) {
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), ++index)
				if (SubLNil.NIL != test.processItem(cur.first()))
					cur.setFirst(newItem);
		} else
			for (int index = start; cur != SubLNil.NIL && index < end; cur = cur.rest(), ++index)
				if (SubLNil.NIL != test.processItem(key.processItem(cur.first())))
					cur.setFirst(newItem);
		return result;
	}

	public Object[] toArray() {
		return this.toArray(new SubLObject[consLength()]);
	}

	@Override
	public Object[] toArray(Object[] array) {
		int i = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			array[i++] = cur.first();
		return array;
	}

	@Override
	public SubLCons toCons() {
		return this;
	}

	public String toStringSubL() {
		if (!PrintLow.shouldPrintAtCurrentLevel())
			return "( # )";
		SubLObject oldLevel = PrintLow.maybeIncreasePrintLevel();
		try {
			StringBuilder buf = new StringBuilder("(");
			boolean checkLength = PrintLow.controlPrintLength();
			int printLength;
			SubLObject cur;
			int counter;
			for (printLength = PrintLow.maxPrintLength(), cur = this, counter = 0; cur.rest().isCons()
					&& counter < printLength; cur = cur.rest(), ++counter) {
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

	@Override
	public SubLObject[] toSubLObjectArray() {
		int size = this.size();
		SubLObject[] result = new SubLObject[size];
		int i = 0;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest())
			result[i++] = cur.first();
		return result;
	}

	public void add(int param, Object obj) {
		Errors.unimplementedMethod("AbstractSubLList.add()");
	}

	public boolean addItem(Object obj) {
		Errors.unimplementedMethod("AbstractSubLList.add()");
		return false;
	}

	@Override
	public SubLList adjoin(SubLObject item) {
		Errors.unimplementedMethod("AbstractSubLList.adjoin()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList adjoin(SubLObject item, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.adjoin()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.adjoin()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList allElementsButLast(int howMany, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.allElementsButLast()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList append(SubLList list, boolean isReverse) {
		Errors.unimplementedMethod("AbstractSubLList.append()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList assoc(SubLObject item, BinaryFunction test, UnaryFunction key) {
		SubLObject currentItem = null;
		SubLList result = SubLNil.NIL;
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(this);
			while (iter.hasNext()) {
				SubLList curAssoc = iter.nextSubLObject().toList();
				if (SubLNil.NIL != test.processItem(item, key.processItem(curAssoc.first()))) {
					result = curAssoc;
					break;
				}
			}
		} finally {
			resourcer.releaseSubLListListIterator(iter);
		}
		return result;
	}

	@Override
	public SubLObject caar() {
		return first().first();
	}

	@Override
	public SubLObject cadddr() {
		return this.get(3);
	}

	@Override
	public LispObject caddr() {
		return this.get(2);
	}

	@Override
	public LispObject cadr() {
		return this.get(1);
	}

	@Override
	public SubLObject cdar() {
		return first().rest();
	}

	@Override
	public SubLObject cddddr() {
		return nthCdr(4);
	}

	@Override
	public SubLObject cdddr() {
		return nthCdr(3);
	}

	@Override
	public SubLList concatenate(List list, boolean isDestructive, boolean isReverse) {
		Errors.unimplementedMethod("AbstractSubLList.concatenate()");
		return SubLNil.NIL;
	}

	public boolean contains(Object obj) {
		Errors.unimplementedMethod("AbstractSubLList.contains()");
		return false;
	}

	public boolean containsAll(Collection collection) {
		Errors.unimplementedMethod("AbstractSubLList.containsAll()");
		return false;
	}

	@Override
	public SubLList copyList() {
		Errors.unimplementedMethod("AbstractSubLList.copyList()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList copyTree() {
		Errors.unimplementedMethod("AbstractSubLList.copyTree()");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject eval(SubLEnvironment env) {
		SubLCons cons = asConsList().toCons();
		while (true) {
			Values.resetMultipleValues();
			SubLObject operatorSymbol = cons.first();
			if (operatorSymbol.isSymbol()) {
				SubLOperator operator = operatorSymbol.toSymbol().getFunction();
				if (operator.isSpecial()) {
					SpecialOperator func = (SpecialOperator) operator.toSpecialOperator();
					SubLObject result = func.execute((LispObject) cons, (Environment) env);
					return result;
				} else if (operator.isMacroOperator()) {
					SubLMacro expander = operator.toMacro();
					SubLObject evalMe = expander.apply((SubLCons) cons, env);
					if (evalMe instanceof SubLCons) {
						cons = (SubLCons) evalMe;
						continue;
					}
					return evalMe.eval(env);
				} else if (operator.isFunction()) {
					SubLFunction f = operator.getFunc();
					SubLObject result = f.evalViaApply((SubLCons) cons, env);
					return result;
				}
				Errors.error(operatorSymbol + " does not have a function value.");
			} else if (SubLInterpretedFunction.isPossiblyLambdaExpression(operatorSymbol, true)) {
				SubLInterpretedFunction lambda = SubLOperatorFactory.makeInterpretedFunction(operatorSymbol.toCons(),
						env);
				SubLObject result = lambda.evalViaApply(cons, env);
				return result;
			}
			throw new InvalidSubLExpressionException(operatorSymbol + " is not an operator.");
		}
	}

	@Override
	public SubLObject getf(SubLObject indicator, SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = SubLNil.NIL;
		SubLObject next = SubLNil.NIL;
		SubLObject key = SubLNil.NIL;
		next = this;
		key = ConsesLow.car(next);
		while (SubLNil.NIL == Types.sublisp_null(next)) {
			if (indicator == key)
				return next.second();
			next = next.rest().rest();
			key = ConsesLow.car(next);
		}
		return v_default;
	}

	public SubLOperator getFunction() {
		if (!isCons()) {
			org.armedbear.lisp.Lisp.lisp_type_error(this, "STREAM");
			return null;
		}
		return SubLOperatorFactory.makeInterpretedFunction(toCons(), SubLEnvironment.currentEnvironment());
	}

	@Override
	public SubLList intersection(SubLList item, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.intersection()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.intersection()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.intersection()");
		return SubLNil.NIL;
	}

	@Override
	public boolean isProper() {
		return last(0) == SubLNil.NIL;
	}

	@Override
	public boolean isSubList(SubLList sublist) {
		Errors.unimplementedMethod("AbstractSubLList.isSubList()");
		return false;
	}

	@Override
	public boolean isSubSet(SubLList list) {
		Errors.unimplementedMethod("AbstractSubLList.isSubSet()");
		return false;
	}

	@Override
	public int listLength() {
		Errors.unimplementedMethod("AbstractSubLList.listLength()");
		return -1;
	}

	@Override
	public SubLList listPrefix(SubLList postFix) {
		Errors.unimplementedMethod("AbstractSubLList.listPrefix()");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject mapcar(SubLFunction functionTyped) {
		return this.mapcar(functionTyped, Resourcer.EMPTY_SUBL_OBJECT_ARRAY, true);
	}

	@Override
	public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists) {
		return this.mapcar(functionTyped, moreLists, true);
	}

	@Override
	public SubLObject mapcar(SubLFunction functionTyped, SubLObject[] moreLists, boolean returnConsedResults) {

		for (int i = 0, size = moreLists.length; i < size; ++i)
			if (moreLists[i] == SubLNil.NIL)
				return SubLNil.NIL;
		int mapArity = 1 + moreLists.length;
		if (mapArity == 1) {
			UnaryFunction func = UnaryFunction.makeInstance(functionTyped);
			return this.mapResult(func, returnConsedResults);
		}
		if (mapArity == 2) {
			BinaryFunction func2 = BinaryFunction.makeInstance(functionTyped);
			SubLList listTyped2 = moreLists[0].toList();
			return this.mapResult(func2, listTyped2, returnConsedResults);
		}
		return this.mapResult(functionTyped, moreLists, returnConsedResults);
	}

	private SubLList mapResult(BinaryFunction function, SubLList list2, boolean returnConsedResults) {
		SubLList result = SubLNil.NIL;
		for (SubLObject cur = this, cur2 = list2; cur != SubLNil.NIL
				&& cur2 != SubLNil.NIL; cur = cur.rest(), cur2 = cur2.rest()) {
			SubLObject curResult = function.processItem(cur.first(), cur2.first());
			if (returnConsedResults)
				result = SubLObjectFactory.makeCons(curResult, result);
		}
		if (returnConsedResults)
			return result.asConsList().reverse(true).toList();
		return this;
	}

	private SubLList mapResult(SubLFunction function, SubLObject[] moreLists, boolean returnConsedResults) {
		ArrayList<SubLObject> results = new ArrayList<SubLObject>();
		SubLListListIterator[] iterators = new SubLListListIterator[1 + moreLists.length];
		int iteratorCount = iterators.length;
		SubLObject[] args = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			args = resourcer.acquireSubLObjectArray(iteratorCount);
			iterators[0] = resourcer.acquireSubLListListIterator(this);
			for (int i = 0, size = moreLists.length; i < size; ++i)
				iterators[i + 1] = resourcer.acquireSubLListListIterator(moreLists[i].toList());
			SubLListListIterator iter = null;
			SubLObject curResult = null;
			Block_5: while (true) {
				for (int j = 0; j < iteratorCount; ++j) {
					iter = iterators[j];
					if (!iter.hasNext())
						break Block_5;
					if (iter.isNextImproperElement())
						Errors.error("Unexpected improper list: " + (j == 0 ? this : moreLists[j - 1]));
					args[j] = iter.nextSubLObject();
				}
				curResult = Functions.funcall(function, args);
				if (results != null)
					results.add(curResult);
			}
			if (returnConsedResults)
				return SubLObjectFactory.makeList(results);
			return this;
		} finally {
			resourcer.releaseSubLObjectArray(args);
			for (int k = 0, size2 = iterators.length; k < size2; ++k)
				resourcer.releaseSubLListListIterator(iterators[k]);
		}
	}

	private SubLList mapResult(UnaryFunction function, boolean returnConsedResults) {
		SubLList result = SubLNil.NIL;
		for (SubLObject cur = this; cur != SubLNil.NIL; cur = cur.rest()) {
			SubLObject curResult = function.processItem(cur.first());
			if (returnConsedResults)
				result = SubLObjectFactory.makeCons(curResult, result);
		}
		if (returnConsedResults)
			return result.asConsList().reverse(true).toList();
		return this;
	}

	@Override
	public SubLList member(SubLObject item) {
		return this.member(item, AbstractSubLSequence.EQL_TEST);
	}

	@Override
	public SubLList memberIf(BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.memberIf()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList memberIf(BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.memberIf()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList putf(SubLObject indicator, SubLObject value) {
		SubLObject back = SubLNil.NIL;
		SubLObject next = SubLNil.NIL;
		SubLObject key = SubLNil.NIL;
		back = SubLNil.NIL;
		next = this;
		key = ConsesLow.car(next);
		while (SubLNil.NIL == Types.sublisp_null(next)) {
			if (indicator == key) {
				ConsesLow.rplaca(ConsesLow.cdr(next), value);
				return this;
			}
			back = ConsesLow.cdr(next);
			next = next.rest().rest();
			key = ConsesLow.car(next);
		}
		if (SubLNil.NIL != back) {
			ConsesLow.rplacd(back, ConsesLow.list(indicator, value));
			return this;
		}
		return ConsesLow.listS(indicator, value, this);
	}

	@Override
	public SubLList remf(SubLObject indicator) {
		SubLObject back = SubLNil.NIL;
		SubLObject next = SubLNil.NIL;
		SubLObject key = SubLNil.NIL;
		back = SubLNil.NIL;
		next = this;
		key = ConsesLow.car(next);
		while (SubLNil.NIL == Types.sublisp_null(next))
			if (indicator == key) {
				if (SubLNil.NIL != back) {
					ConsesLow.rplacd(back, next.rest().rest());
					return this;
				}
				return next.rest().rest().toList();
			} else {
				back = ConsesLow.cdr(next);
				next = next.rest().rest();
				key = ConsesLow.car(next);
			}
		return this;
	}

	public Object remove(int param) {
		return Errors.unimplementedMethod("AbstractSubLList.remove()");
	}

	public boolean remove(Object obj) {
		Errors.unimplementedMethod("AbstractSubLList.remove()");
		return false;
	}

	public boolean removeAll(Collection collection) {
		Errors.unimplementedMethod("AbstractSubLList.removeAll()");
		return false;
	}

	public boolean retainAll(Collection collection) {
		Errors.unimplementedMethod("AbstractSubLList.retainAll()");
		return false;
	}

	@Override
	public SubLList setDifference(SubLList item, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.setDifference()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.setDifference()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.setDifference()");
		return SubLNil.NIL;
	}

	public SubLCons setNth(SubLObject item, int index) {
		Errors.unimplementedMethod("AbstractSubLList.setNth()");
		return null;
	}

	@Override
	public SubLList setXor(SubLList item, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.setXor()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.setXor()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.setXor()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.substituteFromAList()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.substituteFromAList()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.substituteFromAList()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList toList() {
		return this;
	}

	@Override
	public String toTypeName() {
		return AbstractSubLList.LIST_TYPE_NAME;
	}

	@Override
	public SubLList treeEqual(SubLList tree1, SubLList tree2) {
		Errors.unimplementedMethod("AbstractSubLList.treeEqual()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.treeEqual()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList union(SubLList item, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.union()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.union()");
		return SubLNil.NIL;
	}

	@Override
	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.union()");
		return SubLNil.NIL;
	}

	@Override
	public SubLSequence concatenate(SubLSequence seq1) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize1;
		args[0] = seq1;
		return this.concatenate(args);
	}

	@Override
	public int count(SubLObject item) {
		return this.count(item, EQL_TEST, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
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
	public int countIf(UnaryFunction test, UnaryFunction key) {
		return this.countIf(test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public int countIf(UnaryFunction test, UnaryFunction key, int start) {
		return this.countIf(test, key, start, Integer.MAX_VALUE);
	}

	public SubLSequence deleteItems(boolean[] itemsToDelete, int count) {
		return AbstractSubLList.deleteItems(this, itemsToDelete, count);
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
		return this.find(item, EQL_TEST, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
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
		return this.indexOfMismatch(otherSeq, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
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
	public int positionOf(SubLObject item) {
		return this.positionOf(item, EQL_TEST, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
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
	public int positionOfIf(UnaryFunction test, UnaryFunction key) {
		return this.positionOfIf(test, key, 0, Integer.MAX_VALUE);
	}

	@Override
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start) {
		return this.positionOfIf(test, key, start, Integer.MAX_VALUE);
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
		return this.remove(item, isDestructive, EQL_TEST, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
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
		return this.removeDuplicates(isDestructive, EQL_TEST, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE);
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
		return this.search(otherSeq, EQL_TEST, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test) {
		return this.search(otherSeq, test, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
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
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred) {
		return this.sort(isDestructive, pred, IDENTITY_UNARY_FUNC);
	}

	@Override
	public SubLSequence subSeq(int start) {
		return this.subSeq(start, Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive) {
		return this.substitute(newItem, oldItem, isDestructive, EQL_TEST, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE,
				Integer.MAX_VALUE);
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
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE,
				Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE,
				Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end) {
		return this.substituteIf(newItem, test, isDestructive, IDENTITY_UNARY_FUNC, 0, Integer.MAX_VALUE,
				Integer.MAX_VALUE);
	}

	@Override
	public SubLSequence toSeq() {
		return this;
	}

}
