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

public  abstract class TernaryFunction extends FixedArityFunctor implements CommonSymbols {
  
  //// Constructors
  
  protected TernaryFunction(SubLFunction func) {
    this.func = func;
    func.setTernaryFunction(this);
  }
  
  //// Public Area
  
  public static final TernaryFunction makeInstance(SubLSymbol symbol) {
    return makeInstance(symbol.getFunc());
  }
  
  public static final TernaryFunction makeInstance(SubLFunction function) {
    TernaryFunction result = function.getTernaryFunction();
    if (result == null) {
      //System.out.println("Creating slow TernaryFunction for: " + function);
      result = new TernaryFunction(function) {
        public final SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
          SubLObject[] args = null;
          Resourcer resourcer = Resourcer.getInstance();
          try {
            args = resourcer.acquireSubLObjectArray(3);
            args[0] = obj1;
            args[1] = obj2;
            args[2] = obj3;
            return func.funcall(args);
          } finally {
            resourcer.releaseSubLObjectArray(args);
          }
        }
      };
    }
    return result;
  }
  
  public abstract SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3);
  
  public final SubLFunction getFunction() { return func.getFunc(); }
  
  public static final void initialize() {} //this is for side effects of initializing statics
  
  //// Internal Rep
  
  protected SubLFunction func;
  
  private static final TernaryFunction SORT_TERNARY_FUNCTION = new SortTernaryFunction();
  private static final TernaryFunction VALUES_TERNARY_FUNCTION = new ValuesTernaryFunction();
  private static final TernaryFunction LIST_TERNARY_FUNCTION = new ListTernaryFunction();
  
  private static final class SortTernaryFunction extends TernaryFunction {
    public SortTernaryFunction() {
      super(SORT.getFunc());
    }
    public final SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
      return Sort.stable_sort(obj1, obj2, obj3);
    }
  };
  
  private static final class ValuesTernaryFunction extends TernaryFunction {
    public ValuesTernaryFunction() {
      super(VALUES.getFunc());
    }
    public final SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
      return Values.values(obj1, obj2, obj3);
    }
  };
  
  private static final class ListTernaryFunction extends TernaryFunction {
    public ListTernaryFunction() {
      super(LIST.getFunc());
    }
    public final SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
      return ConsesLow.list(obj1, obj2, obj3);
    }
  };
  
  private static final class ListSTernaryFunction extends TernaryFunction {
    public ListSTernaryFunction() {
      super(LISTS.getFunc());
    }
    public final SubLObject processItem(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
      return ConsesLow.listS(obj1, obj2, obj3);
    }
  };
  
    
}
