//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLListListIterator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLInterpretedFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperator;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLOperatorFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

public abstract class AbstractSubLList extends AbstractSubLSequence implements SubLList, SubLSequence, SubLObject {
	public static String LIST_TYPE_NAME;
	static {
		AbstractSubLList.LIST_TYPE_NAME = "LIST";
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
		return (LispObject) this.get(2);
	}

	@Override
	public LispObject cadr() {
		return (LispObject) this.get(1);
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
	public LispObject cddr() {
		return (LispObject) nthCdr(2);
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
		Values.resetMultipleValues();
		SubLObject operatorSymbol = first();
		if (operatorSymbol.isSymbol()) {
			SubLOperator operator = operatorSymbol.toSymbol().getFunction();
			if (operator.isFunction())
				return operator.getFunc().evalViaApply(toCons(), env);
			if (operator.isSpecial()) {
				SubLFunction func = operator.toSpecialOperator().getEvaluationFunction();
				BinaryFunction binFunc = func.getBinaryFunction();
				if (binFunc != null)
					return binFunc.processItem(toCons(), env);
				return func.apply(toCons(), env);
			} else {
				if (operator.isMacroOperator())
					return operator.toMacro().getMacroExpander().apply(asConsList().toCons(), env).eval(env);
				Errors.error(operatorSymbol + " does not have a function value.");
			}
		} else if (SubLInterpretedFunction.isPossiblyLambdaExpression(operatorSymbol, true)) {
			SubLInterpretedFunction lambda = SubLOperatorFactory.makeInterpretedFunction(operatorSymbol.toCons(), env);
			return lambda.evalViaApply(toCons(), env);
		}
		throw new InvalidSubLExpressionException(operatorSymbol + " is not an operator.");
	}

	@Override
	public abstract SubLObject get(int p0);

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
			org.armedbear.lisp.Lisp.lisp_type_error(this,"STREAM");
			return null;
		}
		return SubLOperatorFactory.makeInterpretedFunction(toCons(), SubLEnvironment.currentEnvironment());
	}

	@Override
	public int hashCode(int currentDepth) {
		if (currentDepth < 8) {
			SubLListListIterator iter = null;
			Resourcer resourcer = Resourcer.getInstance();
			int hashCode = 0;
			try {
				int index;
				for (index = 0, iter = resourcer.acquireSubLListListIterator(this); iter.hasNext()
						&& !iter.isNextImproperElement() && index++ < 8; ++index)
					hashCode ^= iter.nextSubLObject().hashCode(currentDepth + 1);
				if (iter.isNextImproperElement())
					hashCode ^= iter.getDottedElement().hashCode(currentDepth + 1);
				return hashCode;
			} finally {
				resourcer.releaseSubLListListIterator(iter);
			}
		}
		return 0;
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
		//if (isNil()) return SubLNil.NIL;
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
	public SubLObject nthCdr(int index) {
		return Errors.unimplementedMethod("AbstractSubLList.nthCdr()");
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
	public abstract void set(int p0, SubLObject p1);

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

	@Override
	public SubLObject setDottedElement(SubLObject dottedElement) {
		return Errors.unimplementedMethod("AbstractSubLList.setDottedElement()");
	}

	@Override
	public SubLCons setFirst(SubLObject first) {
		Errors.unimplementedMethod("AbstractSubLList.setFirst()");
		return null;
	}

	public SubLCons setNth(SubLObject item, int index) {
		Errors.unimplementedMethod("AbstractSubLList.setNth()");
		return null;
	}

	@Override
	public SubLCons setRest(SubLObject rest) {
		Errors.unimplementedMethod("AbstractSubLList.setRest()");
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
	public String printObjectImpl() {
		if (PrintLow.shouldPrintAtCurrentLevel()) {
			SubLObject oldLevel = PrintLow.maybeIncreasePrintLevel();
			try {
				//if (this == SubLNil.NIL) return "NIL";
				SubLListListIterator iter = null;
				Resourcer resourcer = Resourcer.getInstance();
				try {
					StringBuilder buf = new StringBuilder("(");
					boolean checkLength = PrintLow.controlPrintLength();
					int printLength = PrintLow.maxPrintLength();
					int counter = 0;
					boolean terminatedEarly = false;
					iter = resourcer.acquireSubLListListIterator(this);
					while (iter.hasNext() && !iter.isNextImproperElement()) {
						buf.append(iter.next());
						if (checkLength && ++counter >= printLength) {
							buf.append(" ... ");
							terminatedEarly = true;
							break;
						}
						if (!iter.hasNext())
							continue;
						buf.append(" ");
					}
					if (!terminatedEarly && iter.isNextImproperElement())
						buf.append(" . ").append(iter.getDottedElement());
					buf.append(")");
					return buf.toString();
				} finally {
					resourcer.releaseSubLListListIterator(iter);
				}
			} finally {
				PrintLow.maybeDecreasePrintLevel(oldLevel);
			}
		}
		return "( # )";
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
}
