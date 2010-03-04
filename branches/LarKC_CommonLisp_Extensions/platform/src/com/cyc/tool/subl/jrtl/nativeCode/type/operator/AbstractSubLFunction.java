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

package  com.cyc.tool.subl.jrtl.nativeCode.type.operator;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuarternaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.QuintenaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Resourcer;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.TernaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public  abstract class AbstractSubLFunction extends AbstractSubLOperator implements SubLFunction, CommonSymbols {
  
  //// Constructors
  AbstractSubLFunction(SubLSymbol functionSymbol) {
    super(functionSymbol);
  }
  
  AbstractSubLFunction(SubLSymbol functionSymbol,
    int requiredArgCount, int optionalArgCount, boolean allowsRest) {
    super(functionSymbol);
    assert(requiredArgCount >= 0);
    assert(optionalArgCount >= 0);
    this.requiredArgCount = requiredArgCount;
    this.optionalArgCount = optionalArgCount;
    this.allowsRest = allowsRest;
  }
  
  //// Public Area
  
  public final SubLSymbol getType(){ 
    return Types.$dtp_function$;
  }
  
  public final SubLFixnum getTypeCode() {
    return CommonSymbols.FIVE_INTEGER;
  }
  
  public final SubLFunction getFunc() {
    return this;
  }
  
  public final SubLObject funcall(final SubLObject[] incomingArgs) {
    Object[] evaluatedArgs = null;
    SubLObject[] evaluatedRestArgs = null;
    final Resourcer resourcer = Resourcer.getInstance();
    try {
      final int actualArity = incomingArgs.length;
      final int applyArity = applyArity();
      final boolean allowsRest = allowsRest();
       // ensure arity is appropriate
      if (actualArity < getRequiredArgCount()) {
        Errors.error(this + " called with too few arguments: " + incomingArgs);
      }
      if ((actualArity > applyArity)  && (!allowsRest)) {
        Errors.error(this + " called with too many arguments: " + incomingArgs);
      }
      // deal with regular and rest args
      evaluatedArgs = resourcer.acquireObjectArray(applyArity + (allowsRest ? 1 : 0));
      evaluatedRestArgs = resourcer.acquireSubLObjectArray(actualArity - applyArity);
      int i = 0, argIndex = 0, restArgIndex = 0;
      for (; i < actualArity;i++) { 
        if (i < applyArity) {
          evaluatedArgs[argIndex++] = incomingArgs[i];
        } else {
          evaluatedRestArgs[restArgIndex++] = incomingArgs[i];
        }
      }
      // fill in unprovided optional args with UNPROVIDED
      for (; argIndex < applyArity; argIndex++) { evaluatedArgs[argIndex] = UNPROVIDED; }
      // don't forget to add the actual rest arg
      if (allowsRest) { evaluatedArgs[argIndex] = evaluatedRestArgs; }
      // call the function now
      return apply(evaluatedArgs); 
    } finally {
      resourcer.releaseObjectArray(evaluatedArgs);
      resourcer.releaseSubLObjectArray(evaluatedRestArgs);
    }
  }
  
  public String toString() {
    SubLSymbol functionSymbol = getFunctionSymbol();
    
    if (functionSymbol != null) {
      return "#<Function " + functionSymbol + ">";
    } else {
      return super.toString();
    }
  }
  
  public final int getRequiredArgCount() {
    return requiredArgCount;
  }
  
  public final int getOptionalArgCount() {
    return optionalArgCount;
  }
  
  public final boolean allowsRest() {
    return allowsRest;
  }
  
  public static String FUNCTION_TYPE_NAME = "FUNCTION";
  
  public String toTypeName() {
    return FUNCTION_TYPE_NAME;
  }
  
  /**
   * @param operator This is only passed in so that human-readable error
   * strings can be produced.
   */
  public final SubLObject evalViaApply(final SubLCons form, final SubLEnvironment env) {
    final int actualArity = form.rest().size();
    if (form.rest().last(0) != NIL) {
      Errors.error("Invalid attempt to dynamically evaluate an expression conatiaining an improper list: " + form);
    }
    //final SubLSymbol funcSym = form.first().toSymbol();
    SubLObject curArg = form;
    if (actualArity < 6) {
      switch (actualArity) {
        case 0:
          return Functions.funcall(this);
        case 1:
          return Functions.funcall(this, 
              (curArg = curArg.rest()).first().eval(env));
        case 2:
          return Functions.funcall(this, 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env));
        case 3:
          return Functions.funcall(this, 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env));
        case 4:
          return Functions.funcall(this, 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env),
              (curArg = curArg.rest()).first().eval(env),
              (curArg = curArg.rest()).first().eval(env));
        case 5:
          return Functions.funcall(this, 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env), 
              (curArg = curArg.rest()).first().eval(env),
              (curArg = curArg.rest()).first().eval(env));
      }
    } else {
      final Resourcer resourcer = Resourcer.getInstance();
      SubLObject[] args = null;
      try {
        args = resourcer.acquireSubLObjectArray(actualArity);
        for (int i = 0, size = args.length; i < size; i++) {
          args[i] = (curArg = curArg.rest()).first().eval(env);
        }
        return Functions.funcall(this, args);
      } finally {
        resourcer.releaseObjectArray(args);
      }
    }
    return null;
  }
  
  public final SubLObject apply(SubLCons arg1, SubLEnvironment env) {
    return Functions.funcall(this, arg1, env);
  }
  
  
  
  public final ZeroArityFunction getZeroArityFunction() {
    if ((zeroArityFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) {
      zeroArityFunction = FixedArityFunctor.makeInstanceDirect(0,ZeroArityFunction.class,this);
    }
    return zeroArityFunction;
  }
  
  public final void setZeroArityFunction(ZeroArityFunction f) {
    zeroArityFunction = f;
  }
  
  public final UnaryFunction getUnaryFunction() {
    if ((unaryFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) {
      unaryFunction = FixedArityFunctor.makeInstanceDirect(1,UnaryFunction.class,this);
    }
    return unaryFunction;
  }
  
  public final void setUnaryFunction(UnaryFunction f) {
    unaryFunction = f;
  }
  
  public final BinaryFunction getBinaryFunction() {
    if ((binaryFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) { 
      binaryFunction = FixedArityFunctor.makeInstanceDirect(2,BinaryFunction.class,this);
    }
    return binaryFunction;
  }
  
  public final void setBinaryFunction(BinaryFunction f) {
    binaryFunction = f;
  }
  
  public final TernaryFunction getTernaryFunction() {
    if ((ternaryFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) {
      return ternaryFunction = FixedArityFunctor.makeInstanceDirect(3,TernaryFunction.class,this);
    }
    return ternaryFunction;
  }
  
  public final void setTernaryFunction(TernaryFunction f) {
    ternaryFunction = f;
  }
  
  public final QuarternaryFunction getQuarternaryFunction() {
    if ((quarternaryFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) {
      quarternaryFunction = FixedArityFunctor.makeInstanceDirect(4,QuarternaryFunction.class,this);
    }
    return quarternaryFunction;
  }
  
  public final void setQuarternaryFunction(QuarternaryFunction f) {
    quarternaryFunction = f;
  }
  
  public final QuintenaryFunction getQuintenaryFunction() {
    if ((quintenaryFunction == null) && FixedArityFunctor.USE_FUNCTOR_GENERATOR) {
      quintenaryFunction = FixedArityFunctor.makeInstanceDirect(5,QuintenaryFunction.class,this);
    }
    return quintenaryFunction;
  }
  
  public final void setQuintenaryFunction(QuintenaryFunction f) {
    quintenaryFunction = f;
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  protected int requiredArgCount;
  protected int optionalArgCount;
  protected boolean allowsRest;
  private ZeroArityFunction zeroArityFunction;
  private UnaryFunction unaryFunction;
  private BinaryFunction binaryFunction;
  private TernaryFunction ternaryFunction;
  private QuarternaryFunction quarternaryFunction;
  private QuintenaryFunction quintenaryFunction;
  
}
