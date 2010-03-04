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

//// Internal Imports
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import java.util.ArrayList;

public  class SubLInterpretedFunction extends AbstractSubLFunction implements SubLFunction {
  
  //// Constructors
  
  SubLInterpretedFunction(SubLCons form, SubLEnvironment env) {
    this(form, env, null);
  }
  
  /**
   * Creates a new instance of SubLInterpretedFunction.
   */
  SubLInterpretedFunction(SubLCons form, SubLEnvironment env, SubLSymbol functionSymbol) {
    super(functionSymbol);
    this.form = form;
    if (!isPossiblyLambdaExpression(form, functionSymbol == null)) {
      throw new InvalidSubLExpressionException("Got invalid interpreted function definition: " + form);
    }
    if (form.size() >= 2) {
      argDesc = new FunctionArgListDescription((SubLObject)form.get(1));
    } else {
      argDesc = new FunctionArgListDescription(NIL);
    }
    requiredArgCount = argDesc.getRequiredArgCount();
    optionalArgCount = argDesc.getOptionalArgCount();
    allowsRest = argDesc.allowsRest();
    if (form.size() >= 3) {
      body = form.cddr();
      if (!body.isCons()) {
        throw new InvalidSubLExpressionException("Got invalid body for interpreted function: " + body);
      }
      body = SubLObjectFactory.makeCons(PROGN, body);
    } else {
      body = NIL;
    }
    this.env = env;
    if (functionSymbol != null) { // don't crash on lambdas
      functionSymbol.setFunction(this);
    }
  }
  
  //// Public Area
  
  public String toString() {
    SubLSymbol functionSymbol = getFunctionSymbol();
    
    if (functionSymbol != null) {
      return "#<Interpreted Function " + functionSymbol + ">";
    } else {
      return super.toString();
    }
  }
  
  
  public final boolean isInterpreted() { return true; }
  
  public static final boolean isPossiblyLambdaExpression(SubLObject exp, boolean checkForLambda) {
    if (!exp.isCons()) { return false; }
    SubLCons cons = exp.toCons();
    int size = cons.size();
    if (size < 2) { return false; }
    if (!checkForLambda) { return true; }
    SubLObject possibleLamdaSymbol = (SubLObject)cons.get(0);
    return isLambdaSymbol(possibleLamdaSymbol);
  }
  
  public static final boolean isLambdaSymbol(SubLObject obj) {
    return (obj == CommonSymbols.LAMBDA_SYMBOL);
  }
  
  public final SubLObject apply(Object[] args) {
    SubLEnvironment oldEnv = SubLEnvironment.currentEnvironment();
    SubLEnvironment newEnv = env.extend();
    SubLObject result = NIL;
    ArrayList oldDynamicValues = null;
    try {
      oldDynamicValues = argDesc.expandArgBindings(args, newEnv);
      body.eval(newEnv);
    } catch (CatchableThrow ct) {
      result = Dynamic.handleCatchableThrow(ct, RETURN_TAG);   
    } finally {
      SubLSpecialOperatorDeclarations.possiblyRebindDynamics(oldDynamicValues);
      newEnv.unextend();
      SubLEnvironment.setCurrentEnvironment(oldEnv);
    }
    Values.setFirstMultipleValue(result);
    return result;
  }
  
  public final int applyArity() {
    return getRequiredArgCount() + getOptionalArgCount();
  }
  
  public final SubLObject eval(SubLEnvironment env)
  throws InvalidSubLExpressionException {
    return this;
  }
  
  public final static String LAMBDA_FUNCTION_TYPE_NAME = "INTERPRETED-FUNCTION";
  
  public final String toTypeName() {
    return LAMBDA_FUNCTION_TYPE_NAME;
  }
  
  public SubLList getArglist() {
    Errors.unimplementedMethod("SubLInterpretedFunction.getArglist()");
    return NIL;
  }
  
  public final boolean isSpecial() { return false; }
    
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return false; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return true; }
  public final boolean isFunctionSpec() { return true; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
//// Protected Area
  
//// Private Area
  
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return form.hashCode(currentDepth + 1);
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  
//// Internal Rep
  
  private SubLList form;
  
  private FunctionArgListDescription argDesc;
  
  private SubLObject body;
  
  private SubLEnvironment env;
  
//// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
  
}
