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

public  abstract class ZeroArityFunction extends FixedArityFunctor implements CommonSymbols {
    
  //// Constructors 
  
  protected ZeroArityFunction(SubLFunction func) {
    this.func = func;
    func.setZeroArityFunction(this);
  }
  
  //// Public Area
  
  public static final ZeroArityFunction makeInstance(SubLSymbol symbol) {
    return makeInstance(symbol.getFunc());
  }
  
  public static final ZeroArityFunction makeInstance(SubLFunction function) {
    ZeroArityFunction result = function.getZeroArityFunction();
    if (result == null) {
      //System.out.println("Creating slow UnaryFunction for: " + function);
      result = new ZeroArityFunction(function) {
        public final SubLObject processItem() {
          return func.funcall(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
        }
      };
    }
    return result;
  }
  
  public abstract SubLObject processItem();
  
  public final SubLFunction getFunction() { return func; }
  
  public static final ZeroArityFunction NCONC_ZERO_ARITY_FUNC = new NConcZeroArityFunction();
  public static final ZeroArityFunction VECTOR_ZERO_ARITY_FUNC = new VectorZeroArityFunction();
  
  public static final void initialize() {} //this is for side effects of initializing statics
  
  //// Internal Rep
   
  protected SubLFunction func;
          
  private static final class NConcZeroArityFunction extends ZeroArityFunction {
    public NConcZeroArityFunction() {
      super(NCONC.getFunc());
    }
    public final SubLObject processItem() {
      return NIL;
    }
  };    
  
  private static final class VectorZeroArityFunction extends ZeroArityFunction {
    public VectorZeroArityFunction() {
      super(VECTOR.getFunc());
    }
    public final SubLObject processItem() {
      return Vectors.vector(Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
    }
  };
  
 
}
