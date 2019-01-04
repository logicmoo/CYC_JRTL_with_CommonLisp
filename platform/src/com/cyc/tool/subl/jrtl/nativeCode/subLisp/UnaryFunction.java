//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.FixedArityFunctor;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;

public abstract class UnaryFunction extends FixedArityFunctor implements CommonSymbols {
	private static class AtomUnaryFunction extends UnaryFunction {
		public AtomUnaryFunction() {
			super(CommonSymbols.ATOM.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isAtom() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class BignumpUnaryFunction extends UnaryFunction {
		public BignumpUnaryFunction() {
			super(CommonSymbols.BIGNUMP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isBignum() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class BooleanpUnaryFunction extends UnaryFunction {
		public BooleanpUnaryFunction() {
			super(CommonSymbols.BOOLEANP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isBoolean() ? CommonSymbols.RET_T : SubLNil.NIL;
		}
	}

	private static class CaarUnaryFunction extends UnaryFunction {
		public CaarUnaryFunction() {
			super(CommonSymbols.CAAR.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.toList().caar();
		}
	}

	private static class CadrUnaryFunction extends UnaryFunction {
		public CadrUnaryFunction() {
			super(CommonSymbols.CADR.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.toList().cadr();
		}
	}

	private static class CarUnaryFunction extends UnaryFunction {
		public CarUnaryFunction() {
			super(CommonSymbols.CAR.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.first();
		}
	}

	private static class CdrUnaryFunction extends UnaryFunction {
		public CdrUnaryFunction() {
			super(CommonSymbols.CDR.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.rest();
		}
	}

	private static class CharacterpUnaryFunction extends UnaryFunction {
		public CharacterpUnaryFunction() {
			super(CommonSymbols.CHARACTERP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isChar() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class CnotUnaryFunction extends UnaryFunction {
		public CnotUnaryFunction() {
			super(CommonSymbols.CNOT.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return SubLSpecialOperatorDeclarations.cnot(obj);
		}
	}

	private static class ConspUnaryFunction extends UnaryFunction {
		public ConspUnaryFunction() {
			super(CommonSymbols.CONSP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isCons() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class EvalUnaryFunction extends UnaryFunction {
		public EvalUnaryFunction() {
			super(CommonSymbols.EVAL.getFunc());
		}

		@Override
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

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.first();
		}
	}

	private static class FixnumpUnaryFunction extends UnaryFunction {
		public FixnumpUnaryFunction() {
			super(CommonSymbols.FIXNUMP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isFixnum() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class FloatpUnaryFunction extends UnaryFunction {
		public FloatpUnaryFunction() {
			super(CommonSymbols.FLOATP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isDouble() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class FunctionpUnaryFunction extends UnaryFunction {
		public FunctionpUnaryFunction() {
			super(CommonSymbols.FUNCTIONP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isFunction() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class FunctionspecpUnaryFunction extends UnaryFunction {
		public FunctionspecpUnaryFunction() {
			super(CommonSymbols.FUNCTION_SPEC_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isFunctionSpec() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class GuidpUnaryFunction extends UnaryFunction {
		public GuidpUnaryFunction() {
			super(CommonSymbols.GUID_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			if (obj.isGuid())
				return CommonSymbols.T;
			return SubLNil.NIL;
		}
	}

	private static class HashtableIteratorpUnaryFunction extends UnaryFunction {
		public HashtableIteratorpUnaryFunction() {
			super(CommonSymbols.HASH_TABLE_ITERATOR_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			if (obj.isHashtableIterator())
				return CommonSymbols.T;
			return SubLNil.NIL;
		}
	}

	private static class HashtablepUnaryFunction extends UnaryFunction {
		public HashtablepUnaryFunction() {
			super(CommonSymbols.HASH_TABLE_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isHashtable() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class IdentityUnaryFunction extends UnaryFunction {
		public IdentityUnaryFunction() {
			super(CommonSymbols.IDENTITY.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj;
		}
	}

	private static class InputStreampUnaryFunction extends UnaryFunction {
		public InputStreampUnaryFunction() {
			super(CommonSymbols.INPUT_STREAM_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return streams_high.input_stream_p(obj);
		}
	}

	private static class IntegerpUnaryFunction extends UnaryFunction {
		public IntegerpUnaryFunction() {
			super(CommonSymbols.INTEGERP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isInteger() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class KeywordpUnaryFunction extends UnaryFunction {
		public KeywordpUnaryFunction() {
			super(CommonSymbols.KEYWORDP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isKeyword() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class ListpUnaryFunction extends UnaryFunction {
		public ListpUnaryFunction() {
			super(CommonSymbols.LISTP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isList() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class ListUnaryFunction extends UnaryFunction {
		public ListUnaryFunction() {
			super(CommonSymbols.LIST.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return ConsesLow.list(obj);
		}
	}

	private static class LockpUnaryFunction extends UnaryFunction {
		public LockpUnaryFunction() {
			super(CommonSymbols.LOCK_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isLock() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class LongBignumpUnaryFunction extends UnaryFunction {
		public LongBignumpUnaryFunction() {
			super(CommonSymbols.LONG_BIGNUM_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isBigIntegerBignum() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class MediumBignumpUnaryFunction extends UnaryFunction {
		public MediumBignumpUnaryFunction() {
			super(CommonSymbols.MEDIUM_BIGNUM_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isLongBignum() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class NconcUnaryFunction extends UnaryFunction {
		public NconcUnaryFunction() {
			super(CommonSymbols.NCONC.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj;
		}
	}

	private static class NReverseUnaryFunction extends UnaryFunction {
		public NReverseUnaryFunction() {
			super(CommonSymbols.NREVERSE.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.reverse(true);
		}
	}

	private static class NullUnaryFunction extends UnaryFunction {
		public NullUnaryFunction() {
			super(CommonSymbols.NULL.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj == SubLNil.NIL ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class NumberpUnaryFunction extends UnaryFunction {
		public NumberpUnaryFunction() {
			super(CommonSymbols.NUMBERP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isNumber() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class OutputStreampUnaryFunction extends UnaryFunction {
		public OutputStreampUnaryFunction() {
			super(CommonSymbols.OUTPUT_STREAM_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return streams_high.output_stream_p(obj);
		}
	}

	private static class PackageIteratorpUnaryFunction extends UnaryFunction {
		public PackageIteratorpUnaryFunction() {
			super(CommonSymbols.PACKAGE_ITERATOR_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			if (obj.isPackageIterator())
				return CommonSymbols.T;
			return SubLNil.NIL;
		}
	}

	private static class ProcesspUnaryFunction extends UnaryFunction {
		public ProcesspUnaryFunction() {
			super(CommonSymbols.PROCESSP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isProcess() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class ReverseUnaryFunction extends UnaryFunction {
		public ReverseUnaryFunction() {
			super(CommonSymbols.REVERSE.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.reverse(false);
		}
	}

	private static class SecondUnaryFunction extends UnaryFunction {
		public SecondUnaryFunction() {
			super(CommonSymbols.SECOND.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.second();
		}
	}

	private static class SequencepUnaryFunction extends UnaryFunction {
		public SequencepUnaryFunction() {
			super(CommonSymbols.SEQUENCEP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isSequence() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class ShortBignumpUnaryFunction extends UnaryFunction {
		public ShortBignumpUnaryFunction() {
			super(CommonSymbols.SHORT_BIGNUM_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isIntBignum() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class StreampUnaryFunction extends UnaryFunction {
		public StreampUnaryFunction() {
			super(CommonSymbols.STREAMP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isStream() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class StringpUnaryFunction extends UnaryFunction {
		public StringpUnaryFunction() {
			super(CommonSymbols.STRINGP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isString() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class StructurepUnaryFunction extends UnaryFunction {
		public StructurepUnaryFunction() {
			super(CommonSymbols.STRUCTURE_P.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isStructure() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class SymbolFunctionUnaryFunction extends UnaryFunction {
		public SymbolFunctionUnaryFunction() {
			super(CommonSymbols.SYMBOL_FUNCTION.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return Symbols.symbol_function(obj);
		}
	}

	private static class SymbolpUnaryFunction extends UnaryFunction {
		public SymbolpUnaryFunction() {
			super(CommonSymbols.SYMBOLP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isSymbol() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	private static class TrueUnaryFunction extends UnaryFunction {
		public TrueUnaryFunction() {
			super(CommonSymbols.TRUE.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return CommonSymbols.T;
		}
	}

	private static class ValuesUnaryFunction extends UnaryFunction {
		public ValuesUnaryFunction() {
			super(CommonSymbols.VALUES.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return Values.values(obj);
		}
	}

	private static class VectorpUnaryFunction extends UnaryFunction {
		public VectorpUnaryFunction() {
			super(CommonSymbols.VECTORP.getFunc());
		}

		@Override
		public SubLObject processItem(SubLObject obj) {
			return obj.isVector() ? CommonSymbols.T : SubLNil.NIL;
		}
	}

	protected UnaryFunction(SubLFunction func) {
		(this.func = func).setUnaryFunction(this);
	}

	public static void initialize() {
	}

	public static UnaryFunction makeInstance(SubLFunction function) {
		UnaryFunction result = function.getUnaryFunction();
		if (result == null)
			result = new UnaryFunction(function) {
				@Override
				public SubLObject processItem(SubLObject obj) {
					SubLObject[] args = null;
					Resourcer resourcer = Resourcer.getInstance();
					try {
						args = resourcer.acquireSubLObjectArray(1);
						args[0] = obj;
						return func.funcall(args);
					} finally {
						resourcer.releaseSubLObjectArray(args);
					}
				}
			};
		return result;
	}

	public static UnaryFunction makeInstance(SubLSymbol symbol) {
		return makeInstance(symbol.getFunc());
	}

	protected SubLFunction func;
	public static UnaryFunction IDENTITY_UNARY_FUNC;
	public static UnaryFunction NULL_UNARY_FUNC;
	public static UnaryFunction BOOLEANP_UNARY_FUNC;
	public static UnaryFunction SYMBOLP_UNARY_FUNC;
	public static UnaryFunction ATOM_UNARY_FUNC;
	public static UnaryFunction CONSP_UNARY_FUNC;
	public static UnaryFunction LISTP_UNARY_FUNC;
	public static UnaryFunction SEQUENCEP_UNARY_FUNC;
	public static UnaryFunction NUMBERP_UNARY_FUNC;
	public static UnaryFunction FIXNUM_UNARY_FUNC;
	public static UnaryFunction BIGNUM_UNARY_FUNC;
	public static UnaryFunction SHORT_BIGNUM_UNARY_FUNC;
	public static UnaryFunction MEDIUM_BIGNUM_UNARY_FUNC;
	public static UnaryFunction LONG_BIGNUM_UNARY_FUNC;
	public static UnaryFunction INTEGERP_UNARY_FUNC;
	public static UnaryFunction FLOATP_UNARY_FUNC;
	public static UnaryFunction CHARACTERP_UNARY_FUNC;
	public static UnaryFunction STRINGP_UNARY_FUNC;
	public static UnaryFunction VECTORP_UNARY_FUNC;
	public static UnaryFunction FUNCTIONP_UNARY_FUNC;
	public static UnaryFunction FUNCTION_SPEC_P_UNARY_FUNC;
	public static UnaryFunction PROCESSP_UNARY_FUNC;
	public static UnaryFunction LOCK_P_UNARY_FUNC;
	public static UnaryFunction HASH_TABLE_P_UNARY_FUNC;
	public static UnaryFunction STRUCTURE_P_UNARY_FUNC;
	public static UnaryFunction HASH_TABLE_ITERATOR_P_UNARY_FUNC;
	public static UnaryFunction STREAM_P_UNARY_FUNC;
	public static UnaryFunction INPUT_STREAM_P_UNARY_FUNC;
	public static UnaryFunction OUTPUT_STREAM_P_UNARY_FUNC;
	public static UnaryFunction CAR_UNARY_FUNC;
	public static UnaryFunction CDR_UNARY_FUNC;
	public static UnaryFunction FIRST_UNARY_FUNC;
	public static UnaryFunction SECOND_UNARY_FUNC;
	public static UnaryFunction GUID_P_UNARY_FUNC;
	public static UnaryFunction KEYWORDP_UNARY_FUNC;
	public static UnaryFunction REVERSE_UNARY_FUNC;
	public static UnaryFunction NREVERSE_UNARY_FUNC;
	public static UnaryFunction EVAL_UNARY_FUNC;
	public static UnaryFunction NCONC_UNARY_FUNC;
	public static UnaryFunction CAAR_UNARY_FUNC;
	public static UnaryFunction CADR_UNARY_FUNC;
	public static UnaryFunction VALUES_UNARY_FUNC;
	public static UnaryFunction TRUE_UNARY_FUNC;
	public static UnaryFunction SYMBOL_FUNCTION_UNARY_FUNC;
	public static UnaryFunction LIST_UNARY_FUNC;
	public static UnaryFunction CNOT_UNARY_FUNC;
	private static SubLObject[] EMPTY_SUBL_OBJECT_ARRAY;
	static {
		IDENTITY_UNARY_FUNC = new IdentityUnaryFunction();
		NULL_UNARY_FUNC = new NullUnaryFunction();
		BOOLEANP_UNARY_FUNC = new BooleanpUnaryFunction();
		SYMBOLP_UNARY_FUNC = new SymbolpUnaryFunction();
		ATOM_UNARY_FUNC = new AtomUnaryFunction();
		CONSP_UNARY_FUNC = new ConspUnaryFunction();
		LISTP_UNARY_FUNC = new ListpUnaryFunction();
		SEQUENCEP_UNARY_FUNC = new SequencepUnaryFunction();
		NUMBERP_UNARY_FUNC = new NumberpUnaryFunction();
		FIXNUM_UNARY_FUNC = new FixnumpUnaryFunction();
		BIGNUM_UNARY_FUNC = new BignumpUnaryFunction();
		SHORT_BIGNUM_UNARY_FUNC = new ShortBignumpUnaryFunction();
		MEDIUM_BIGNUM_UNARY_FUNC = new MediumBignumpUnaryFunction();
		LONG_BIGNUM_UNARY_FUNC = new LongBignumpUnaryFunction();
		INTEGERP_UNARY_FUNC = new IntegerpUnaryFunction();
		FLOATP_UNARY_FUNC = new FloatpUnaryFunction();
		CHARACTERP_UNARY_FUNC = new CharacterpUnaryFunction();
		STRINGP_UNARY_FUNC = new StringpUnaryFunction();
		VECTORP_UNARY_FUNC = new VectorpUnaryFunction();
		FUNCTIONP_UNARY_FUNC = new FunctionpUnaryFunction();
		FUNCTION_SPEC_P_UNARY_FUNC = new FunctionspecpUnaryFunction();
		PROCESSP_UNARY_FUNC = new ProcesspUnaryFunction();
		LOCK_P_UNARY_FUNC = new LockpUnaryFunction();
		HASH_TABLE_P_UNARY_FUNC = new HashtablepUnaryFunction();
		STRUCTURE_P_UNARY_FUNC = new StructurepUnaryFunction();
		HASH_TABLE_ITERATOR_P_UNARY_FUNC = new HashtableIteratorpUnaryFunction();
		STREAM_P_UNARY_FUNC = new StreampUnaryFunction();
		INPUT_STREAM_P_UNARY_FUNC = new InputStreampUnaryFunction();
		OUTPUT_STREAM_P_UNARY_FUNC = new OutputStreampUnaryFunction();
		CAR_UNARY_FUNC = new CarUnaryFunction();
		CDR_UNARY_FUNC = new CdrUnaryFunction();
		FIRST_UNARY_FUNC = new FirstUnaryFunction();
		SECOND_UNARY_FUNC = new SecondUnaryFunction();
		GUID_P_UNARY_FUNC = new GuidpUnaryFunction();
		KEYWORDP_UNARY_FUNC = new KeywordpUnaryFunction();
		REVERSE_UNARY_FUNC = new ReverseUnaryFunction();
		NREVERSE_UNARY_FUNC = new NReverseUnaryFunction();
		EVAL_UNARY_FUNC = new EvalUnaryFunction();
		NCONC_UNARY_FUNC = new NconcUnaryFunction();
		CAAR_UNARY_FUNC = new CaarUnaryFunction();
		CADR_UNARY_FUNC = new CadrUnaryFunction();
		VALUES_UNARY_FUNC = new ValuesUnaryFunction();
		TRUE_UNARY_FUNC = new TrueUnaryFunction();
		SYMBOL_FUNCTION_UNARY_FUNC = new SymbolFunctionUnaryFunction();
		LIST_UNARY_FUNC = new ListUnaryFunction();
		CNOT_UNARY_FUNC = new CnotUnaryFunction();
		Resourcer.getInstance();
		EMPTY_SUBL_OBJECT_ARRAY = Resourcer.EMPTY_SUBL_OBJECT_ARRAY;
	}

	@Override
	public SubLFunction getFunction() {
		return func;
	}

	public abstract SubLObject processItem(SubLObject p0);
}
