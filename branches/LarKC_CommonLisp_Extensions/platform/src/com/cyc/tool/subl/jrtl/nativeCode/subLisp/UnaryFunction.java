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

package  com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.stream.SubLOutputStream;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;

public  abstract class UnaryFunction extends FixedArityFunctor implements CommonSymbols {
    
  //// Constructors 
  
  protected UnaryFunction(SubLFunction func) {
    this.func = func;
    func.setUnaryFunction(this);
  }
  
  //// Public Area
  
  public static final UnaryFunction makeInstance(SubLSymbol symbol) {
    return makeInstance(symbol.getFunc());
  }
  
  public static final UnaryFunction makeInstance(SubLFunction function) {
    UnaryFunction result = function.getUnaryFunction();
    if (result == null) {
      //System.out.println("Creating slow UnaryFunction for: " + function);
      result = new UnaryFunction(function) {
        public final SubLObject processItem(SubLObject obj) {
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
    }
    return result;
  }
  
  public abstract SubLObject processItem(SubLObject obj);
  
  public final SubLFunction getFunction() { return func; }
  
  public static final UnaryFunction IDENTITY_UNARY_FUNC = new IdentityUnaryFunction();
  public static final UnaryFunction NULL_UNARY_FUNC = new NullUnaryFunction();
  public static final UnaryFunction BOOLEANP_UNARY_FUNC = new BooleanpUnaryFunction();
  public static final UnaryFunction SYMBOLP_UNARY_FUNC = new SymbolpUnaryFunction();
  public static final UnaryFunction ATOM_UNARY_FUNC = new AtomUnaryFunction();
  public static final UnaryFunction CONSP_UNARY_FUNC = new ConspUnaryFunction();
  public static final UnaryFunction LISTP_UNARY_FUNC = new ListpUnaryFunction();
  public static final UnaryFunction SEQUENCEP_UNARY_FUNC = new SequencepUnaryFunction();
  public static final UnaryFunction NUMBERP_UNARY_FUNC = new NumberpUnaryFunction();
  public static final UnaryFunction FIXNUM_UNARY_FUNC = new FixnumpUnaryFunction();
  public static final UnaryFunction BIGNUM_UNARY_FUNC = new BignumpUnaryFunction();
  public static final UnaryFunction SHORT_BIGNUM_UNARY_FUNC = new ShortBignumpUnaryFunction();
  public static final UnaryFunction MEDIUM_BIGNUM_UNARY_FUNC = new MediumBignumpUnaryFunction();
  public static final UnaryFunction LONG_BIGNUM_UNARY_FUNC = new LongBignumpUnaryFunction();
  public static final UnaryFunction INTEGERP_UNARY_FUNC = new IntegerpUnaryFunction();
  public static final UnaryFunction FLOATP_UNARY_FUNC = new FloatpUnaryFunction();
  public static final UnaryFunction CHARACTERP_UNARY_FUNC = new CharacterpUnaryFunction();
  public static final UnaryFunction STRINGP_UNARY_FUNC = new StringpUnaryFunction();
  public static final UnaryFunction VECTORP_UNARY_FUNC = new VectorpUnaryFunction();
  public static final UnaryFunction FUNCTIONP_UNARY_FUNC = new FunctionpUnaryFunction();
  public static final UnaryFunction FUNCTION_SPEC_P_UNARY_FUNC = new FunctionspecpUnaryFunction();
  public static final UnaryFunction PROCESSP_UNARY_FUNC = new ProcesspUnaryFunction();
  public static final UnaryFunction LOCK_P_UNARY_FUNC = new LockpUnaryFunction();
  public static final UnaryFunction HASH_TABLE_P_UNARY_FUNC = new HashtablepUnaryFunction();
  public static final UnaryFunction STRUCTURE_P_UNARY_FUNC = new StructurepUnaryFunction();
  public static final UnaryFunction HASH_TABLE_ITERATOR_P_UNARY_FUNC = new HashtableIteratorpUnaryFunction();
  public static final UnaryFunction STREAM_P_UNARY_FUNC = new StreampUnaryFunction();
  public static final UnaryFunction INPUT_STREAM_P_UNARY_FUNC = new InputStreampUnaryFunction();
  public static final UnaryFunction OUTPUT_STREAM_P_UNARY_FUNC = new OutputStreampUnaryFunction();
  public static final UnaryFunction CAR_UNARY_FUNC = new CarUnaryFunction();
  public static final UnaryFunction CDR_UNARY_FUNC = new CdrUnaryFunction();
  public static final UnaryFunction FIRST_UNARY_FUNC = new FirstUnaryFunction();
  public static final UnaryFunction SECOND_UNARY_FUNC = new SecondUnaryFunction();
  public static final UnaryFunction GUID_P_UNARY_FUNC = new GuidpUnaryFunction();
  public static final UnaryFunction KEYWORDP_UNARY_FUNC = new KeywordpUnaryFunction();
  public static final UnaryFunction REVERSE_UNARY_FUNC = new ReverseUnaryFunction();
  public static final UnaryFunction NREVERSE_UNARY_FUNC = new NReverseUnaryFunction();
  public static final UnaryFunction EVAL_UNARY_FUNC = new EvalUnaryFunction();
  public static final UnaryFunction NCONC_UNARY_FUNC = new NconcUnaryFunction();
  public static final UnaryFunction CAAR_UNARY_FUNC = new CaarUnaryFunction();
  public static final UnaryFunction CADR_UNARY_FUNC = new CadrUnaryFunction();
  public static final UnaryFunction VALUES_UNARY_FUNC = new ValuesUnaryFunction();
  public static final UnaryFunction TRUE_UNARY_FUNC = new TrueUnaryFunction();
  public static final UnaryFunction SYMBOL_FUNCTION_UNARY_FUNC = new SymbolFunctionUnaryFunction();
  public static final UnaryFunction LIST_UNARY_FUNC = new ListUnaryFunction();
  public static final UnaryFunction CNOT_UNARY_FUNC = new CnotUnaryFunction();
  
  public static final void initialize() {} //this is for side effects of initializing statics
  
  //// Internal Rep
  
  private static final SubLObject[] EMPTY_SUBL_OBJECT_ARRAY = Resourcer.getInstance().EMPTY_SUBL_OBJECT_ARRAY;
  
  protected SubLFunction func;
          
  private static final class IdentityUnaryFunction extends UnaryFunction {
    public IdentityUnaryFunction() {
      super(IDENTITY.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj;
    }
  };
  
  private static final class NullUnaryFunction extends UnaryFunction {
    public NullUnaryFunction() {
      super(NULL.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return (obj == NIL) ? (SubLBoolean)T : NIL;
//      if (obj == NIL) { return T; }
//      return NIL;
    }
  };
  
  private static final class BooleanpUnaryFunction extends UnaryFunction {
    public BooleanpUnaryFunction() {
      super(BOOLEANP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isBoolean() ? RET_T : NIL;
    }
  };
  
  private static final class SymbolpUnaryFunction extends UnaryFunction {
    public SymbolpUnaryFunction() {
      super(SYMBOLP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isSymbol() ? (SubLBoolean)T : NIL;
//      if (obj.isSymbol()) { return T; }
//      return NIL;
    }
  };
  
  private static final class KeywordpUnaryFunction extends UnaryFunction {
    public KeywordpUnaryFunction() {
      super(KEYWORDP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isKeyword() ? (SubLBoolean)T : NIL;
//      if (obj.isKeyword()) { return T; }
//      return NIL;
    }
  };
  
  private static final class AtomUnaryFunction extends UnaryFunction {
    public AtomUnaryFunction() {
      super(ATOM.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isAtom() ? (SubLBoolean)T : NIL;
//      if (obj.isAtom()) { return T; }
//      return NIL;
    }
  };
  
  private static final class ConspUnaryFunction extends UnaryFunction {
    public ConspUnaryFunction() {
      super(CONSP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isCons() ? (SubLBoolean)T : NIL;
//      if (obj.isCons()) { return T; }
//      return NIL;
    }
  };
  
  private static final class ListpUnaryFunction extends UnaryFunction {
    public ListpUnaryFunction() {
      super(LISTP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isList() ? (SubLBoolean)T : NIL;
//      if (obj.isList()) { return T; }
//      return NIL;
    }
  };
  
  private static final class SequencepUnaryFunction extends UnaryFunction {
    public SequencepUnaryFunction() {
      super(SEQUENCEP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isSequence() ? (SubLBoolean)T : NIL;
//      if (obj.isSequence()) { return T; }
//      return NIL;
    }
  };
  
  private static final class NumberpUnaryFunction extends UnaryFunction {
    public NumberpUnaryFunction() {
      super(NUMBERP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isNumber() ? (SubLBoolean)T : NIL;
//      if (obj.isNumber()) { return T; }
//      return NIL;
    }
  };
  
  private static final class FixnumpUnaryFunction extends UnaryFunction {
    public FixnumpUnaryFunction() {
      super(FIXNUMP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isFixnum() ? (SubLBoolean)T : NIL;
//      if (obj.isFixnum()) { return T; }
//      return NIL;
    }
  };
  
  private static final class BignumpUnaryFunction extends UnaryFunction {
    public BignumpUnaryFunction() {
      super(BIGNUMP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isBignum() ? (SubLBoolean)T : NIL;
//      if (obj.isBignum()) { return T; }
//      return NIL;
    }
  };
  
  private static final class ShortBignumpUnaryFunction extends UnaryFunction {
    public ShortBignumpUnaryFunction() {
      super(SHORT_BIGNUM_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isIntBignum() ? (SubLBoolean)T : NIL;
//      if (obj.isIntBignum()) { return T; }
//      return NIL;
    }
  };
  
  private static final class MediumBignumpUnaryFunction extends UnaryFunction {
    public MediumBignumpUnaryFunction() {
      super(MEDIUM_BIGNUM_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isLongBignum() ? (SubLBoolean)T : NIL;
//      if (obj.isLongBignum()) { return T; }
//      return NIL;
    }
  };
  
  private static final class LongBignumpUnaryFunction extends UnaryFunction {
    public LongBignumpUnaryFunction() {
      super(LONG_BIGNUM_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isBigIntegerBignum() ? (SubLBoolean)T : NIL;
//      if (obj.isBigIntegerBignum()) { return T; }
//      return NIL;
    }
  };
  
  private static final class IntegerpUnaryFunction extends UnaryFunction {
    public IntegerpUnaryFunction() {
      super(INTEGERP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isInteger() ? (SubLBoolean)T : NIL;
//      if (obj.isInteger()) { return T; }
//      return NIL;
    }
  };
  
  private static final class FloatpUnaryFunction extends UnaryFunction {
    public FloatpUnaryFunction() {
      super(FLOATP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isDouble() ? (SubLBoolean)T : NIL;
//      if (obj.isDouble()) { return T; }
//      return NIL;
    }
  };
  
  private static final class CharacterpUnaryFunction extends UnaryFunction {
    public CharacterpUnaryFunction() {
      super(CHARACTERP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isChar() ? (SubLBoolean)T : NIL;
//      if (obj.isChar()) { return T; }
//      return NIL;
    }
  };
  
  private static final class StringpUnaryFunction extends UnaryFunction {
    public StringpUnaryFunction() {
      super(STRINGP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isString() ? (SubLBoolean)T : NIL;
//      if (obj.isString()) { return T; }
//      return NIL;
    }
  };
  
  private static final class VectorpUnaryFunction extends UnaryFunction {
    public VectorpUnaryFunction() {
      super(VECTORP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isVector() ? (SubLBoolean)T : NIL;
//      if (obj.isVector()) { return T; }
//      return NIL;
    }
  };
  
  private static final class FunctionpUnaryFunction extends UnaryFunction {
    public FunctionpUnaryFunction() {
      super(FUNCTIONP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isFunction() ? (SubLBoolean)T : NIL;
//      if (obj.isFunction()) { return T; }
//      return NIL;
    }
  };
  
  private static final class FunctionspecpUnaryFunction extends UnaryFunction {
    public FunctionspecpUnaryFunction() {
      super(FUNCTION_SPEC_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isFunctionSpec() ? (SubLBoolean)T : NIL;
//      if (obj.isFunctionSpec()) { return T; }
//      return NIL;
    }
  }
  
  private static final class HashtablepUnaryFunction extends UnaryFunction {
    public HashtablepUnaryFunction() {
      super(HASH_TABLE_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isHashtable() ? (SubLBoolean)T : NIL;
//      if (obj.isHashtable()) { return T; }
//      return NIL;
    }
  };
  
  private static final class ProcesspUnaryFunction extends UnaryFunction {
    public ProcesspUnaryFunction() {
      super(PROCESSP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isProcess() ? (SubLBoolean)T : NIL;
//      if (obj.isProcess()) { return T; }
//      return NIL;
    }
  };
  
  private static final class LockpUnaryFunction extends UnaryFunction {
    public LockpUnaryFunction() {
      super(LOCK_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isLock() ? (SubLBoolean)T : NIL;
//      if (obj.isLock()) { return T; }
//      return NIL;
    }
  };
  
  private static final class HashtableIteratorpUnaryFunction extends UnaryFunction {
    public HashtableIteratorpUnaryFunction() {
      super(HASH_TABLE_ITERATOR_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      if (obj.isHashtableIterator()) { return T; }
      return NIL;
    }
  };
  
  private static final class StructurepUnaryFunction extends UnaryFunction {
    public StructurepUnaryFunction() {
      super(STRUCTURE_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isStructure() ? (SubLBoolean)T : NIL;
//      if (obj.isStructure()) { return T; }
//      return NIL;
    }
  };
  
  private static final class StreampUnaryFunction extends UnaryFunction {
    public StreampUnaryFunction() {
      super(STREAMP.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.isStream() ? (SubLBoolean)T : NIL;
//      if (obj.isStream()) { return T; }
//      return NIL;
    }
  };
  
  private static final class InputStreampUnaryFunction extends UnaryFunction {
    public InputStreampUnaryFunction() {
      super(INPUT_STREAM_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return streams_high.input_stream_p(obj);
    }
  };
  
  private static final class OutputStreampUnaryFunction extends UnaryFunction {
    public OutputStreampUnaryFunction() {
      super(OUTPUT_STREAM_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return streams_high.output_stream_p(obj);
    }
  };
  
  private static final class CarUnaryFunction extends UnaryFunction {
    public CarUnaryFunction() {
      super(CAR.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.first();
    }
  };
  
  private static final class CdrUnaryFunction extends UnaryFunction {
    public CdrUnaryFunction() {
      super(CDR.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.rest();
    }
  };
  
  private static final class FirstUnaryFunction extends UnaryFunction {
    public FirstUnaryFunction() {
      super(FIRST.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.first();
    }
  };
  
  private static final class SecondUnaryFunction extends UnaryFunction {
    public SecondUnaryFunction() {
      super(SECOND.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.second();
    }
  };
  
  private static final class GuidpUnaryFunction extends UnaryFunction {
    public GuidpUnaryFunction() {
      super(GUID_P.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      if (obj.isGuid()) { return T; }
      return NIL;
    }
  };
  
  private static final class ReverseUnaryFunction extends UnaryFunction {
    public ReverseUnaryFunction() {
      super(REVERSE.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.reverse(false);
    }
  };
  
  private static final class NReverseUnaryFunction extends UnaryFunction {
    public NReverseUnaryFunction() {
      super(NREVERSE.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.reverse(true);
    }
  };
  
  private static final class EvalUnaryFunction extends UnaryFunction {
    public EvalUnaryFunction() {
      super(EVAL.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.eval(SubLEnvironment.currentEnvironment());
    }
  };
  
  private static final class NconcUnaryFunction extends UnaryFunction {
    public NconcUnaryFunction() {
      super(NCONC.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj;
    }
  };
  
  private static final class CaarUnaryFunction extends UnaryFunction {
    public CaarUnaryFunction() {
      super(CAAR.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.toList().caar();
    }
  };
  
  private static final class CadrUnaryFunction extends UnaryFunction {
    public CadrUnaryFunction() {
      super(CADR.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return obj.toList().cadr();
    }
  };
  
  private static final class ValuesUnaryFunction extends UnaryFunction {
    public ValuesUnaryFunction() {
      super(VALUES.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return Values.values(obj);
    }
  };
  
  private static final class TrueUnaryFunction extends UnaryFunction {
    public TrueUnaryFunction() {
      super(TRUE.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return T;
    }
  };
  
  private static final class SymbolFunctionUnaryFunction extends UnaryFunction {
    public SymbolFunctionUnaryFunction() {
      super(SYMBOL_FUNCTION.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return Symbols.symbol_function(obj);
    }
  };
  
  private static final class ListUnaryFunction extends UnaryFunction {
    public ListUnaryFunction() {
      super(LIST.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return ConsesLow.list(obj);
    }
  };
  
  private static final class CnotUnaryFunction extends UnaryFunction {
    public CnotUnaryFunction() {
      super(CNOT.getFunc());
    }
    public final SubLObject processItem(SubLObject obj) {
      return SubLSpecialOperatorDeclarations.cnot(obj);
    }
  };
}
