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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.*;

public  abstract class QuintenaryFunction extends FixedArityFunctor implements CommonSymbols {
  
  //// Constructors
  
  protected QuintenaryFunction(SubLFunction func) {
    this.func = func;
    func.setQuintenaryFunction(this);
  }
  
  //// Public Area
  
  public static final QuintenaryFunction makeInstance(SubLSymbol symbol) {
    return makeInstance(symbol.getFunc());
  }
  
  public static final QuintenaryFunction makeInstance(SubLFunction function) {
    QuintenaryFunction result = function.getQuintenaryFunction();
    if (result == null) {
      //System.out.println("Creating slow QuintenaryFunction for: " + function);
      result = new QuintenaryFunction(function) {
        public final SubLObject processItem(SubLObject obj1, SubLObject obj2, 
            SubLObject obj3, SubLObject obj4, SubLObject obj5) {
          SubLObject[] args = null;
          Resourcer resourcer = Resourcer.getInstance();
          try {
            args = resourcer.acquireSubLObjectArray(5);
            args[0] = obj1;
            args[1] = obj2;
            args[2] = obj3;
            args[3] = obj4;
            args[4] = obj5;
            return func.funcall(args);
          } finally {
            resourcer.releaseSubLObjectArray(args);
          }
        }
      };
    }
    return result;
  }
  
  public abstract SubLObject processItem(SubLObject obj1, SubLObject obj2, 
      SubLObject obj3, SubLObject obj4, SubLObject obj5);
  
  public final SubLFunction getFunction() { return func.getFunc(); }
  
  public static final void initialize() {} //this is for side effects of initializing statics
  
  //// Internal Rep
  
  protected SubLFunction func;
    
}
