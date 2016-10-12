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

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.FixedArityFunctor;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;

public abstract class UnaryFunction extends FixedArityFunctor implements CommonSymbols {

	//// Constructors

	private static class AtomUnaryFunction extends UnaryFunction {
		public AtomUnaryFunction() {
			super(CommonSymbols.ATOM.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isAtom() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isAtom()) { return T; }
			// return NIL;
		}
	}

	//// Public Area

	private static class BignumpUnaryFunction extends UnaryFunction {
		public BignumpUnaryFunction() {
			super(CommonSymbols.BIGNUMP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isBignum() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isBignum()) { return T; }
			// return NIL;
		}
	}

	private static class BooleanpUnaryFunction extends UnaryFunction {
		public BooleanpUnaryFunction() {
			super(CommonSymbols.BOOLEANP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isBoolean() ? CommonSymbols.RET_T : CommonSymbols.NIL;
		}
	}

	private static class CaarUnaryFunction extends UnaryFunction {
		public CaarUnaryFunction() {
			super(CommonSymbols.CAAR.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.toList().caar();
		}
	}

	private static class CadrUnaryFunction extends UnaryFunction {
		public CadrUnaryFunction() {
			super(CommonSymbols.CADR.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.toList().cadr();
		}
	}

	private static class CarUnaryFunction extends UnaryFunction {
		public CarUnaryFunction() {
			super(CommonSymbols.CAR.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.first();
		}
	}

	private static class CdrUnaryFunction extends UnaryFunction {
		public CdrUnaryFunction() {
			super(CommonSymbols.CDR.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.rest();
		}
	}

	private static class CharacterpUnaryFunction extends UnaryFunction {
		public CharacterpUnaryFunction() {
			super(CommonSymbols.CHARACTERP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isChar() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isChar()) { return T; }
			// return NIL;
		}
	}

	private static class CnotUnaryFunction extends UnaryFunction {
		public CnotUnaryFunction() {
			super(CommonSymbols.CNOT.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return SubLSpecialOperatorDeclarations.cnot(obj);
		}
	}

	private static class ConspUnaryFunction extends UnaryFunction {
		public ConspUnaryFunction() {
			super(CommonSymbols.CONSP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isCons() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isCons()) { return T; }
			// return NIL;
		}
	}

	private static class EvalUnaryFunction extends UnaryFunction {
		public EvalUnaryFunction() {
			super(CommonSymbols.EVAL.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			SubLEnvironment oldEnvironment = SubLEnvironment.currentEnvironment();
			SubLEnvironment.setCurrentEnvironment(SubLEnvironment.getDefaultEnvironment());
			SubLObject result = obj.eval(SubLEnvironment.getDefaultEnvironment());
			SubLEnvironment.setCurrentEnvironment(oldEnvironment);
			return result;
		}
	}

	private static class FirstUnaryFunction extends UnaryFunction {
		public FirstUnaryFunction() {
			super(CommonSymbols.FIRST.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.first();
		}
	}

	private static class FixnumpUnaryFunction extends UnaryFunction {
		public FixnumpUnaryFunction() {
			super(CommonSymbols.FIXNUMP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isFixnum() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isFixnum()) { return T; }
			// return NIL;
		}
	}

	private static class FloatpUnaryFunction extends UnaryFunction {
		public FloatpUnaryFunction() {
			super(CommonSymbols.FLOATP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isDouble() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isDouble()) { return T; }
			// return NIL;
		}
	}

	private static class FunctionpUnaryFunction extends UnaryFunction {
		public FunctionpUnaryFunction() {
			super(CommonSymbols.FUNCTIONP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isFunction() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isFunction()) { return T; }
			// return NIL;
		}
	}

	private static class FunctionspecpUnaryFunction extends UnaryFunction {
		public FunctionspecpUnaryFunction() {
			super(CommonSymbols.FUNCTION_SPEC_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isFunctionSpec() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isFunctionSpec()) { return T; }
			// return NIL;
		}
	}

	private static class GuidpUnaryFunction extends UnaryFunction {
		public GuidpUnaryFunction() {
			super(CommonSymbols.GUID_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			if (obj.isGuid())
				return CommonSymbols.T;
			return CommonSymbols.NIL;
		}
	}

	private static class HashtableIteratorpUnaryFunction extends UnaryFunction {
		public HashtableIteratorpUnaryFunction() {
			super(CommonSymbols.HASH_TABLE_ITERATOR_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			if (obj.isHashtableIterator())
				return CommonSymbols.T;
			return CommonSymbols.NIL;
		}
	}

	private static class HashtablepUnaryFunction extends UnaryFunction {
		public HashtablepUnaryFunction() {
			super(CommonSymbols.HASH_TABLE_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isHashtable() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isHashtable()) { return T; }
			// return NIL;
		}
	}

	private static class IdentityUnaryFunction extends UnaryFunction {
		public IdentityUnaryFunction() {
			super(CommonSymbols.IDENTITY.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj;
		}
	}

	private static class InputStreampUnaryFunction extends UnaryFunction {
		public InputStreampUnaryFunction() {
			super(CommonSymbols.INPUT_STREAM_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return streams_high.input_stream_p(obj);
		}
	}

	private static class IntegerpUnaryFunction extends UnaryFunction {
		public IntegerpUnaryFunction() {
			super(CommonSymbols.INTEGERP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isInteger() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isInteger()) { return T; }
			// return NIL;
		}
	}

	private static class KeywordpUnaryFunction extends UnaryFunction {
		public KeywordpUnaryFunction() {
			super(CommonSymbols.KEYWORDP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isKeyword() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isKeyword()) { return T; }
			// return NIL;
		}
	}

	private static class ListpUnaryFunction extends UnaryFunction {
		public ListpUnaryFunction() {
			super(CommonSymbols.LISTP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isList() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isList()) { return T; }
			// return NIL;
		}
	}

	private static class ListUnaryFunction extends UnaryFunction {
		public ListUnaryFunction() {
			super(CommonSymbols.LIST.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return ConsesLow.list(obj);
		}
	}

	private static class LockpUnaryFunction extends UnaryFunction {
		public LockpUnaryFunction() {
			super(CommonSymbols.LOCK_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isLock() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isLock()) { return T; }
			// return NIL;
		}
	}

	private static class LongBignumpUnaryFunction extends UnaryFunction {
		public LongBignumpUnaryFunction() {
			super(CommonSymbols.LONG_BIGNUM_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isBigIntegerBignum() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isBigIntegerBignum()) { return T; }
			// return NIL;
		}
	}

	private static class MediumBignumpUnaryFunction extends UnaryFunction {
		public MediumBignumpUnaryFunction() {
			super(CommonSymbols.MEDIUM_BIGNUM_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isLongBignum() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isLongBignum()) { return T; }
			// return NIL;
		}
	}

	private static class NconcUnaryFunction extends UnaryFunction {
		public NconcUnaryFunction() {
			super(CommonSymbols.NCONC.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj;
		}
	}

	private static class NReverseUnaryFunction extends UnaryFunction {
		public NReverseUnaryFunction() {
			super(CommonSymbols.NREVERSE.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.reverse(true);
		}
	}

	private static class NullUnaryFunction extends UnaryFunction {
		public NullUnaryFunction() {
			super(CommonSymbols.NULL.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj == CommonSymbols.NIL ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj == NIL) { return T; }
			// return NIL;
		}
	}

	private static class NumberpUnaryFunction extends UnaryFunction {
		public NumberpUnaryFunction() {
			super(CommonSymbols.NUMBERP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isNumber() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isNumber()) { return T; }
			// return NIL;
		}
	}

	private static class OutputStreampUnaryFunction extends UnaryFunction {
		public OutputStreampUnaryFunction() {
			super(CommonSymbols.OUTPUT_STREAM_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return streams_high.output_stream_p(obj);
		}
	}

	private static class PackageIteratorpUnaryFunction extends UnaryFunction {
		public PackageIteratorpUnaryFunction() {
			super(CommonSymbols.PACKAGE_ITERATOR_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			if (obj.isPackageIterator())
				return CommonSymbols.T;
			return CommonSymbols.NIL;
		}
	}

	private static class ProcesspUnaryFunction extends UnaryFunction {
		public ProcesspUnaryFunction() {
			super(CommonSymbols.PROCESSP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isProcess() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isProcess()) { return T; }
			// return NIL;
		}
	}

	private static class ReverseUnaryFunction extends UnaryFunction {
		public ReverseUnaryFunction() {
			super(CommonSymbols.REVERSE.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.reverse(false);
		}
	}

	private static class SecondUnaryFunction extends UnaryFunction {
		public SecondUnaryFunction() {
			super(CommonSymbols.SECOND.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.second();
		}
	}

	private static class SequencepUnaryFunction extends UnaryFunction {
		public SequencepUnaryFunction() {
			super(CommonSymbols.SEQUENCEP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isSequence() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isSequence()) { return T; }
			// return NIL;
		}
	}

	private static class ShortBignumpUnaryFunction extends UnaryFunction {
		public ShortBignumpUnaryFunction() {
			super(CommonSymbols.SHORT_BIGNUM_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isIntBignum() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isIntBignum()) { return T; }
			// return NIL;
		}
	}

	private static class StreampUnaryFunction extends UnaryFunction {
		public StreampUnaryFunction() {
			super(CommonSymbols.STREAMP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isStream() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isStream()) { return T; }
			// return NIL;
		}
	}

	private static class StringpUnaryFunction extends UnaryFunction {
		public StringpUnaryFunction() {
			super(CommonSymbols.STRINGP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isString() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isString()) { return T; }
			// return NIL;
		}
	}

	private static class StructurepUnaryFunction extends UnaryFunction {
		public StructurepUnaryFunction() {
			super(CommonSymbols.STRUCTURE_P.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isStructure() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isStructure()) { return T; }
			// return NIL;
		}
	}

	private static class SymbolFunctionUnaryFunction extends UnaryFunction {
		public SymbolFunctionUnaryFunction() {
			super(CommonSymbols.SYMBOL_FUNCTION.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return Symbols.symbol_function(obj);
		}
	}

	private static class SymbolpUnaryFunction extends UnaryFunction {
		public SymbolpUnaryFunction() {
			super(CommonSymbols.SYMBOLP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isSymbol() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isSymbol()) { return T; }
			// return NIL;
		}
	}

	private static class TrueUnaryFunction extends UnaryFunction {
		public TrueUnaryFunction() {
			super(CommonSymbols.TRUE.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return CommonSymbols.T;
		}
	}

	private static class ValuesUnaryFunction extends UnaryFunction {
		public ValuesUnaryFunction() {
			super(CommonSymbols.VALUES.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return Values.values(obj);
		}
	}

	private static class VectorpUnaryFunction extends UnaryFunction {
		public VectorpUnaryFunction() {
			super(CommonSymbols.VECTORP.getFunc());
		}

		public SubLObject processItem(SubLObject obj) {
			return obj.isVector() ? (SubLBoolean) CommonSymbols.T : CommonSymbols.NIL;
			// if (obj.isVector()) { return T; }
			// return NIL;
		}
	}

	public static UnaryFunction IDENTITY_UNARY_FUNC = new IdentityUnaryFunction();
	public static UnaryFunction NULL_UNARY_FUNC = new NullUnaryFunction();
	public static UnaryFunction BOOLEANP_UNARY_FUNC = new BooleanpUnaryFunction();
	public static UnaryFunction SYMBOLP_UNARY_FUNC = new SymbolpUnaryFunction();
	public static UnaryFunction ATOM_UNARY_FUNC = new AtomUnaryFunction();

	public static UnaryFunction CONSP_UNARY_FUNC = new ConspUnaryFunction();

	//// Internal Rep

	public static UnaryFunction LISTP_UNARY_FUNC = new ListpUnaryFunction();

	public static UnaryFunction SEQUENCEP_UNARY_FUNC = new SequencepUnaryFunction();

	public static UnaryFunction NUMBERP_UNARY_FUNC = new NumberpUnaryFunction();;

	public static UnaryFunction FIXNUM_UNARY_FUNC = new FixnumpUnaryFunction();;

	public static UnaryFunction BIGNUM_UNARY_FUNC = new BignumpUnaryFunction();;

	public static UnaryFunction SHORT_BIGNUM_UNARY_FUNC = new ShortBignumpUnaryFunction();;

	public static UnaryFunction MEDIUM_BIGNUM_UNARY_FUNC = new MediumBignumpUnaryFunction();;

	public static UnaryFunction LONG_BIGNUM_UNARY_FUNC = new LongBignumpUnaryFunction();;

	public static UnaryFunction INTEGERP_UNARY_FUNC = new IntegerpUnaryFunction();;

	public static UnaryFunction FLOATP_UNARY_FUNC = new FloatpUnaryFunction();;

	public static UnaryFunction CHARACTERP_UNARY_FUNC = new CharacterpUnaryFunction();;

	public static UnaryFunction STRINGP_UNARY_FUNC = new StringpUnaryFunction();;

	public static UnaryFunction VECTORP_UNARY_FUNC = new VectorpUnaryFunction();;

	public static UnaryFunction FUNCTIONP_UNARY_FUNC = new FunctionpUnaryFunction();;

	public static UnaryFunction FUNCTION_SPEC_P_UNARY_FUNC = new FunctionspecpUnaryFunction();;

	public static UnaryFunction PROCESSP_UNARY_FUNC = new ProcesspUnaryFunction();;

	public static UnaryFunction LOCK_P_UNARY_FUNC = new LockpUnaryFunction();;

	public static UnaryFunction HASH_TABLE_P_UNARY_FUNC = new HashtablepUnaryFunction();;

	public static UnaryFunction STRUCTURE_P_UNARY_FUNC = new StructurepUnaryFunction();;

	public static UnaryFunction HASH_TABLE_ITERATOR_P_UNARY_FUNC = new HashtableIteratorpUnaryFunction();;

	public static UnaryFunction STREAM_P_UNARY_FUNC = new StreampUnaryFunction();;

	public static UnaryFunction INPUT_STREAM_P_UNARY_FUNC = new InputStreampUnaryFunction();;

	public static UnaryFunction OUTPUT_STREAM_P_UNARY_FUNC = new OutputStreampUnaryFunction();;

	public static UnaryFunction CAR_UNARY_FUNC = new CarUnaryFunction();

	public static UnaryFunction CDR_UNARY_FUNC = new CdrUnaryFunction();;

	public static UnaryFunction FIRST_UNARY_FUNC = new FirstUnaryFunction();;

	public static UnaryFunction SECOND_UNARY_FUNC = new SecondUnaryFunction();;

	public static UnaryFunction GUID_P_UNARY_FUNC = new GuidpUnaryFunction();;

	public static UnaryFunction KEYWORDP_UNARY_FUNC = new KeywordpUnaryFunction();;

	public static UnaryFunction REVERSE_UNARY_FUNC = new ReverseUnaryFunction();;

	public static UnaryFunction NREVERSE_UNARY_FUNC = new NReverseUnaryFunction();;

	public static UnaryFunction EVAL_UNARY_FUNC = new EvalUnaryFunction();;

	public static UnaryFunction NCONC_UNARY_FUNC = new NconcUnaryFunction();;

	public static UnaryFunction CAAR_UNARY_FUNC = new CaarUnaryFunction();;

	public static UnaryFunction CADR_UNARY_FUNC = new CadrUnaryFunction();;

	public static UnaryFunction VALUES_UNARY_FUNC = new ValuesUnaryFunction();;

	public static UnaryFunction TRUE_UNARY_FUNC = new TrueUnaryFunction();;

	public static UnaryFunction SYMBOL_FUNCTION_UNARY_FUNC = new SymbolFunctionUnaryFunction();;

	public static UnaryFunction LIST_UNARY_FUNC = new ListUnaryFunction();;

	public static UnaryFunction CNOT_UNARY_FUNC = new CnotUnaryFunction();;

	private static SubLObject[] EMPTY_SUBL_OBJECT_ARRAY = Resourcer.getInstance().EMPTY_SUBL_OBJECT_ARRAY;;

	public static void initialize() {
	} // this is for side effects of initializing statics;

	public static UnaryFunction makeInstance(SubLFunction function) {
		UnaryFunction result = function.getUnaryFunction();
		if (result == null)
			// System.out.println("Creating slow UnaryFunction for: " +
			// function);
			result = new UnaryFunction(function) {
				public SubLObject processItem(SubLObject obj) {
					SubLObject[] args = null;
					Resourcer resourcer = Resourcer.getInstance();
					try {
						args = resourcer.acquireSubLObjectArray(1);
						args[0] = obj;
						return this.func.funcall(args);
					} finally {
						resourcer.releaseSubLObjectArray(args);
					}
				}
			};
		return result;
	};

	public static UnaryFunction makeInstance(SubLSymbol symbol) {
		return UnaryFunction.makeInstance(symbol.getFunc());
	};

	protected SubLFunction func;;

	protected UnaryFunction(SubLFunction func) {
		this.func = func;
		func.setUnaryFunction(this);
	};

	public SubLFunction getFunction() {
		return this.func;
	};

	public abstract SubLObject processItem(SubLObject obj);;
}
