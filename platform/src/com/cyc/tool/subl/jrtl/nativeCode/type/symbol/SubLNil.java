//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.symbol;

import static com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence.EQL_TEST;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence.IDENTITY_UNARY_FUNC;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.armedbear.lisp.Lisp;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Nil;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperatorFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLInputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputBinaryStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputTextStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLStream;
import com.cyc.tool.subl.util.SubLFiles;


abstract public class SubLNil extends Symbol implements SubLList, SubLSymbol, SubLBoolean {

	final public static String NIL_SYMBOL_NAME = "NIL";
	final public static String NIL_TYPE_NAME = "NULL";
	final public static SubLString NIL_SYMBOL_NAME_SUBLSTRING = SubLObjectFactory.makeString("NIL");
	@SuppressWarnings("hiding")
	final public static SubLNil NIL = new Nil(Lisp.PACKAGE_CL);
	final private static SubLObject[] EMPTY_SUBL_OBJECT_ARRAY = new SubLObject[0];
	final private static List<SubLObject> EMPTY_LIST =  Collections.unmodifiableList(new ArrayList<SubLObject>());

	public SubLNil() {
		super("NIL",Lisp.PACKAGE_CL);
	}

	public static boolean toBool(SubLObject object) {
		return object != NIL;
	}

	@Override
	public SubLList addItem(SubLObject item) {
		return SubLObjectFactory.makeList(1, item);
	}

	@Override
	public SubLList asArrayList() {
		return this;
	}

	@Override
	public SubLList asConsList() {
		return this;
	}

	@Override
	public void bind(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Can't bind NIL.");
	}

	@Override
	public void bind(SubLObject newValue, SubLThread thread) {
		Errors.error("Can't bind NIL.");
	}

	@Override
	public boolean boundp() {
		return true;
	}

	@Override
	public Object clone() {
		return this;
	}

	@Override
	public SubLSequence concatenate(SubLObject[] sequences) {
		return AbstractSubLSequence.concatenate(this, sequences);
	}

	@Override
	public int count(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return 0;
	}

	@Override
	public int countIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return 0;
	}

	@Override
	public SubLObject currentBinding(SubLObject[] bindings) {
		return Errors.error("NIL does not have a dynamic binding.");
	}

	@Override
	public SubLObject currentBinding(SubLThread thread) {
		return Errors.error("NIL does not have a dynamic binding.");
	}

	@Override
	public SubLSequence delete(int startIndex, int endIndexExclusive) {
		if (startIndex == endIndexExclusive)
			return this;
		return Errors.error("NIL is immutable.").toSeq();
	}

	@Override
	public boolean equals(Object obj) {
		return obj == this;
	}

	@Override
	public SubLObject eval(SubLEnvironment env) throws InvalidSubLExpressionException {
		return this;
	}

	@Override
	public boolean fboundp() {
		return false;
	}

	@Override
	public SubLSequence fill(SubLObject item, int start, int end) {
		return Errors.error("NIL is immutable.").toSeq();
	}

	@Override
	public SubLObject find(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return this;
	}

	@Override
	public SubLObject findIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return this;
	}

	@Override
	public SubLObject first() {
		return this;
	}

	@Override
	public void forceGlobalValue(SubLObject newValue) {
		Errors.error("Nihil ex nihil; NIL is immutable.");
	}

	@Override
	public SubLObject get(int index) {
		return this;
	}

	@Override
	public int getBindingId() {
		return Integer.MIN_VALUE;
	}

	@Override
	public SubLObject getDottedElement() {
		return this;
	}

	@Override
	public SubLObject getDynamicValue() {
		return this;
	}

	@Override
	public SubLObject getDynamicValue(SubLObject[] bindings) {
		return this;
	}

	@Override
	public SubLObject getDynamicValue(SubLThread thread) {
		return this;
	}

	@Override
	public SubLObject getGlobalValue() {
		return this;
	}

	@Override
	public String getName() {
		return NIL_SYMBOL_NAME;
	}

	@Override
	public SubLPackage getPackage() {
		return SubLPackage.SUBLISP_PACKAGE.toPackage();
	}

	@Override
	public SubLList getPlist() {
		Errors.unimplementedMethod("SubLNil.getPlist");
		return null;
	}

	@Override
	public SubLObject getProperty(SubLObject indicator) {
		Errors.unimplementedMethod("SubLNil.getProperty");
		return null;
	}

	@Override
	public SubLStream getStream(boolean followSynonymStream) {
		return StreamsLow.$terminal_io$.getValue().getStream(true);
	}

	@Override
	public SubLString getSubLName() {
		return NIL_SYMBOL_NAME_SUBLSTRING;
	}

	@Override
	public SubLSymbol getType() {
		return Types.$dtp_symbol$;
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_INTEGER;
	}

	@Override
	public SubLObject getValue() {
		return this;
	}

	@Override
	public int indexOfMismatch(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1,
			int start2, int end2) {
		if (otherSeq == this)
			return -3;
		return 0;
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isArrayBased() {
		return true;
	}

	@Override
	public boolean isAtom() {
		return true;
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
		return true;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isConstantSymbol() {
		return true;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isDynamic() {
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
	public boolean isGlobal() {
		return true;
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
		return true;
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
		return true;
	}

	@Override
	public boolean isUndeclared() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	@Override
	public SubLObject last(int n) {
		if (n > 1)
			Errors.error("Can't take the last n items of NIL: " + n);
		return this;
	}

	@Override
	public SubLObject makeCopy() {
		return this;
	}

	@Override
	public SubLObject makeDeepCopy() {
		return this;
	}

	@Override
	public SubLSequence makeSequenceFromJavaList(List<SubLObject> newBuf) {
		int size = newBuf.size();
		ArrayList<SubLObject> theBuf = new ArrayList<SubLObject>(size);
		for (int i = 0; i < size; ++i)
			theBuf.add(newBuf.get(i));
		SubLSequence result = SubLObjectFactory.makeList_Dangerous(theBuf);
		return result;
	}

	@Override
	public SubLList member(SubLObject item, BinaryFunction test) {
		return this;
	}

	@Override
	public SubLList member(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return this;
	}

	@Override
	public SubLSequence merge(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key) {
		return otherSeq;
	}

	public int mismatch(SubLSequence seq2, int start1, int end1, int start2, int end2) {
		Errors.unimplementedMethod("SubLNil.mismatch()");
		return -1;
	}

	public SubLObject nth(int index) {
		return this;
	}

	@Override
	public LispObject nthCdr(int index) {
		return this;
	}

	@Override
	public SubLObject pop() {
		return Errors.error("Nihil ex nihil; NIL is immutable.");
	}

	@Override
	public int positionOf(SubLObject item, BinaryFunction test, UnaryFunction key, int start, int end) {
		return -2;
	}

	@Override
	public int positionOfIf(UnaryFunction test, UnaryFunction key, int start, int end) {
		return -2;
	}

	@Override
	public SubLCons push(SubLObject item) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	@Override
	public SubLCons pushNew(SubLObject item) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	@Override
	public SubLCons pushNew(SubLObject item, BinaryFunction test) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	@Override
	public SubLCons pushNew(SubLObject item, BinaryFunction test, UnaryFunction key) {
		return SubLObjectFactory.makeList(1, item).toCons();
	}

	@Override
	public void rebind(SubLObject oldValue, SubLObject[] bindings) {
		Errors.error("Can't rebind NIL.");
	}

	@Override
	public void rebind(SubLObject oldValue, SubLThread thread) {
		Errors.error("Can't rebind NIL.");
	}

	@Override
	public SubLObject reduce(BinaryFunction func, int start, int end, SubLObject initialValue) {
		return this;
	}

	@Override
	public SubLSequence remove(SubLObject item, boolean isDestructive, BinaryFunction test, UnaryFunction key,
			int start, int end, int count) {
		if (start != 0)
			Errors.error("Invalid start argument " + start);
		else if (end != Integer.MAX_VALUE && start != end)
			Errors.error("Invalid end argument " + end);
		return this;
	}

	@Override
	public SubLSequence removeDuplicates(boolean isDestructive, BinaryFunction test, UnaryFunction key, int start,
			int end) {
		return this;
	}

	@Override
	public SubLSequence removeIf(UnaryFunction test, boolean isDestructive, UnaryFunction key, int start, int end,
			int count) {
		return this;
	}

	@Override
	public void removeProperty(SubLObject indicator) {
		Errors.unimplementedMethod("SubLNil.removeProperty");
	}

	@Override
	public SubLSequence replace(SubLSequence seq, int start1, int end1, int start2, int count) {
		return Errors.error("NIL is immutable.").toSeq();
	}

	@Override
	public SubLObject rest() {
		return this;
	}

	@Override
	public SubLSequence reverse(boolean isDestructive) {
		return this;
	}

	@Override
	public int search(SubLSequence otherSeq, BinaryFunction test, UnaryFunction key, int start1, int end1, int start2,
			int end2) {
		return -2;
	}

	@Override
	public void set(int index, SubLObject item) {
		Errors.error("Nil is immutable.");
	}

	@Override
	public void setAccessMode(SubLFiles.VariableAccessMode accessMode) {
	}

	@Override
	public void setConstantValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	@Override
	public SubLObject setDottedElement(SubLObject dottedElement) {
		return Errors.error("NIL is immutable.");
	}

	@Override
	public void setDynamicValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	@Override
	public void setDynamicValue(SubLObject newValue, SubLObject[] bindings) {
		Errors.error("Can't change the value of NIL.");
	}

	@Override
	public void setDynamicValue(SubLObject newValue, SubLThread thread) {
		Errors.error("Can't change the value of NIL.");
	}

	@Override
	public SubLCons setFirst(SubLObject first) {
		return Errors.error("Nihil ex nihil; NIL is immutable.").toCons();
	}

	@Override
	public void setFunction(SubLOperator func) {
		Errors.error("Can't define a method for NIL.");
	}

	@Override
	public void setGlobalValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	@Override
	public void setPackage(SubLPackage thePackage) {
		Errors.error("Can't set package on NIL.");
	}

	@Override
	public void setProperty(SubLObject indicator, SubLObject value) {
		Errors.unimplementedMethod("SubLNil.setProperty");
	}

	@Override
	public SubLCons setRest(SubLObject rest) {
		return Errors.error("Nihil ex nihil; NIL is immutable.").toCons();
	}

	@Override
	public void setValue(SubLObject value) {
		Errors.error("Nihil ex nihil; can't set NIL.");
	}

	@Override
	public int size() {
		return 0;
	}

	@Override
	public int size(int max) {
		return 0;
	}

	@Override
	public SubLSequence sort(boolean isDestructive, BinaryFunction pred, UnaryFunction key) {
		return this;
	}

	@Override
	public SubLSequence subSeq(int start, int end) {
		return this;
	}

	@Override
	public SubLSequence substitute(SubLObject newItem, SubLObject oldItem, boolean isDestructive, BinaryFunction test,
			UnaryFunction key, int start, int end, int count) {
		return this;
	}

	@Override
	public SubLSequence substituteIf(SubLObject newItem, UnaryFunction test, boolean isDestructive, UnaryFunction key,
			int start, int end, int count) {
		return this;
	}

	//@Override
	public Object[] toArray() {
		return SubLNil.EMPTY_LIST.toArray();
	}

	@Override
	public Object[] toArray(Object[] a) {
		return a;
	}

	@Override
	public boolean toBoolean() {
		return false;
	}

	@Override
	public SubLInputBinaryStream toInputBinaryStream() {
		return StreamsLow.$standard_input$.getDynamicValue().toInputBinaryStream();
	}

	@Override
	public SubLInputStream toInputStream() {
		return StreamsLow.$standard_input$.getDynamicValue().toInputStream();
	}

	@Override
	public SubLInputTextStream toInputTextStream() {
		return StreamsLow.$standard_input$.getDynamicValue().toInputTextStream();
	}

	@Override
	public SubLOutputBinaryStream toOutputBinaryStream() {
		return StreamsLow.$standard_output$.getDynamicValue().toOutputBinaryStream();
	}

	@Override
	public SubLOutputStream toOutputStream() {
		return StreamsLow.$standard_output$.getDynamicValue().toOutputStream();
	}

	@Override
	public SubLOutputTextStream toOutputTextStream() {
		SubLObject dynvalue =  StreamsLow.$standard_output$.getDynamicValue();
		if(dynvalue==this) {
			dynvalue = StreamsLow.$standard_output$.toLispObject().getGlobalValue();
		}
		if(dynvalue==this) {
			Errors.error("No *STANDARD-OUTPUT* value!");
		}
		return dynvalue.toOutputTextStream();
	}


	@Override
	public SubLObject[] toSubLObjectArray() {
		return SubLNil.EMPTY_SUBL_OBJECT_ARRAY;
	}

	@Override
	public SubLSymbol toSymbol() {
		return this;
	}

	@Override
	public String toTypeName() {
		return NIL_TYPE_NAME;
	}

	private SubLList mapResult(BinaryFunction function, SubLList list2, boolean returnConsedResults) {
		SubLList result = this;
		for (SubLObject cur = this, cur2 = list2; cur != this
				&& cur2 != this; cur = cur.rest(), cur2 = cur2.rest()) {
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
		SubLList result = this;
		for (SubLObject cur = this; cur != this; cur = cur.rest()) {
			SubLObject curResult = function.processItem(cur.first());
			if (returnConsedResults)
				result = SubLObjectFactory.makeCons(curResult, result);
		}
		if (returnConsedResults)
			return result.asConsList().reverse(true).toList();
		return this;
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
		return this;
	}

	@Override
	public SubLList adjoin(SubLObject item, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.adjoin()");
		return this;
	}

	@Override
	public SubLList adjoin(SubLObject item, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.adjoin()");
		return this;
	}

	@Override
	public SubLList allElementsButLast(int howMany, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.allElementsButLast()");
		return this;
	}

	@Override
	public SubLList append(SubLList list, boolean isReverse) {
		Errors.unimplementedMethod("AbstractSubLList.append()");
		return this;
	}

	@Override
	public SubLList assoc(SubLObject item, BinaryFunction test, UnaryFunction key) {
		SubLObject currentItem = null;
		SubLList result = this;
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		try {
			iter = resourcer.acquireSubLListListIterator(this);
			while (iter.hasNext()) {
				SubLList curAssoc = iter.nextSubLObject().toList();
				if (this != test.processItem(item, key.processItem(curAssoc.first()))) {
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
		return this;
	}

	@Override
	public SubLObject cadddr() {
		return this;
	}

	@Override
	public LispObject caddr() {
		return this;
	}

	@Override
	public LispObject cadr() {
		return this;
	}

	@Override
	public SubLObject cdar() {
		return this;
	}

	@Override
	public SubLObject cddddr() {
		return this;
	}

	@Override
	public SubLObject cdddr() {
		return this;
	}

	@Override
	public LispObject cddr() {
		return this;
	}

	@Override
	public SubLList concatenate(List list, boolean isDestructive, boolean isReverse) {
		Errors.unimplementedMethod("AbstractSubLList.concatenate()");
		return this;
	}

	boolean contains(Object obj) {
		//Errors.unimplementedMethod("AbstractSubLList.contains()");
		return false;
	}

	boolean containsAll(Collection collection) {
		//Errors.unimplementedMethod("AbstractSubLList.containsAll()");
		return false;
	}

	@Override
	public SubLList copyList() {
		//Errors.unimplementedMethod("AbstractSubLList.copyList()");
		return this;
	}

	@Override
	public SubLList copyTree() {
		//Errors.unimplementedMethod("AbstractSubLList.copyTree()");
		return this;
	}

	@Override
	public SubLObject getf(SubLObject indicator, SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = this;
		SubLObject next = this;
		SubLObject key = this;
		next = this;
		key = ConsesLow.car(next);
		while (this == Types.sublisp_null(next)) {
			if (indicator == key)
				return next.second();
			next = next.rest().rest();
			key = ConsesLow.car(next);
		}
		return v_default;
	}

//	public SubLOperator getFunction() {
//		if (!isCons()) {
//			org.armedbear.lisp.Lisp.lisp_type_error(this,"STREAM");
//			return null;
//		}
//		return SubLOperatorFactory.makeInterpretedFunction(toCons(), SubLEnvironment.currentEnvironment());
//	}

	@Override
	public int hashCode(int currentDepth) {
		return NIL_SYMBOL_NAME_SUBLSTRING.hashCode(currentDepth);
	}


	@Override
	public SubLList intersection(SubLList item, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.intersection()");
		return this;
	}

	@Override
	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.intersection()");
		return this;
	}

	@Override
	public SubLList intersection(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.intersection()");
		return this;
	}

	@Override
	public boolean isProper() {
		return last(0) == this;
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
		return this;
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
		return this;
	}

	@Override
	public SubLList member(SubLObject item) {
		return this.member(item, AbstractSubLSequence.EQL_TEST);
	}

	@Override
	public SubLList memberIf(BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.memberIf()");
		return this;
	}

	@Override
	public SubLList memberIf(BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.memberIf()");
		return this;
	}

	@Override
	public SubLList putf(SubLObject indicator, SubLObject value) {
		SubLObject back = this;
		SubLObject next = this;
		SubLObject key = this;
		back = this;
		next = this;
		key = ConsesLow.car(next);
		while (this == Types.sublisp_null(next)) {
			if (indicator == key) {
				ConsesLow.rplaca(ConsesLow.cdr(next), value);
				return this;
			}
			back = ConsesLow.cdr(next);
			next = next.rest().rest();
			key = ConsesLow.car(next);
		}
		if (this != back) {
			ConsesLow.rplacd(back, ConsesLow.list(indicator, value));
			return this;
		}
		return ConsesLow.listS(indicator, value, this);
	}

	@Override
	public SubLList remf(SubLObject indicator) {
		SubLObject back = this;
		SubLObject next = this;
		SubLObject key = this;
		back = this;
		next = this;
		key = ConsesLow.car(next);
		while (this == Types.sublisp_null(next))
			if (indicator == key) {
				if (this != back) {
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
		return this;
	}

	@Override
	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.setDifference()");
		return this;
	}

	@Override
	public SubLList setDifference(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.setDifference()");
		return this;
	}

	public SubLCons setNth(SubLObject item, int index) {
		Errors.unimplementedMethod("AbstractSubLList.setNth()");
		return null;
	}

	@Override
	public SubLList setXor(SubLList item, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.setXor()");
		return this;
	}

	@Override
	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.setXor()");
		return this;
	}

	@Override
	public SubLList setXor(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.setXor()");
		return this;
	}

	@Override
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.substituteFromAList()");
		return this;
	}

	@Override
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.substituteFromAList()");
		return this;
	}

	@Override
	public SubLList substituteFromAList(SubLList alist, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.substituteFromAList()");
		return this;
	}

	@Override
	public SubLList toList() {
		return this;
	}


	@Override
	public SubLList treeEqual(SubLList tree1, SubLList tree2) {
		Errors.unimplementedMethod("AbstractSubLList.treeEqual()");
		return this;
	}

	@Override
	public SubLList treeEqual(SubLList tree1, SubLList tree2, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.treeEqual()");
		return this;
	}

	@Override
	public SubLList union(SubLList item, boolean isDestructive) {
		Errors.unimplementedMethod("AbstractSubLList.union()");
		return this;
	}

	@Override
	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test) {
		Errors.unimplementedMethod("AbstractSubLList.union()");
		return this;
	}

	@Override
	public SubLList union(SubLList item, boolean isDestructive, BinaryFunction test, UnaryFunction key) {
		Errors.unimplementedMethod("AbstractSubLList.union()");
		return this;
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

	@Override
	public SubLSequence toSeq() {
		return this;
	}

	@Override
	public CharSequence getPackageNamePrecise() {
		return "SL";
	}

	@Override
	public SubLLock toLock() {
		return SubLObjectFactory.makeLock(getSubLName());
	}

}
