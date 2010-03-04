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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import java.lang.reflect.Method;

//// Internal Imports

//// External Imports

public  class SubLOperatorFactory {
  
  //// Constructors
  
  /** Creates a new instance of SubLOperatorFactory. */
  private SubLOperatorFactory() {}
  
  //// Public Area
  
  public static SubLCompiledFunction makeCompiledFunction(Method method,
      SubLSymbol functionSymbol, int requiredArgCount,
      int optionalArgCount, boolean allowsRest) {
    return new SubLCompiledFunction(method, functionSymbol, requiredArgCount,
        optionalArgCount, allowsRest);
  }
  
  public static SubLCompiledFunction makeCompiledFunction(String methodClassStr, String methodName,
      Class[] methodParameters, Class returnType, SubLSymbol functionSymbol, int requiredArgCount,
      int optionalArgCount, boolean allowsRest) {
    return new SubLCompiledFunction(methodClassStr, methodName, methodParameters, 
      returnType, functionSymbol, requiredArgCount, optionalArgCount, allowsRest);
  }
  
  public static SubLInterpretedFunction makeInterpretedFunction(SubLCons form, SubLEnvironment env) {
    return new SubLInterpretedFunction(form, env);
  }

  public static SubLInterpretedFunction makeInterpretedFunction(SubLSymbol functionSymbol, SubLCons form, SubLEnvironment env) {
    return new SubLInterpretedFunction(form, env, functionSymbol);
  }
  
  public static SubLMacro makeMacro(SubLFunction macroExpander) {
    return new SubLMacro(macroExpander);
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  }
  
}
