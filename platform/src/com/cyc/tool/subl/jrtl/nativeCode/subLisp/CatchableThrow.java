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

//// External Imports
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.Unhandleable;

public  class CatchableThrow extends RuntimeException implements CommonSymbols {
  
  //// Constructors
  
  /** Creates a new instance of SubLThrow. */
  private CatchableThrow(SubLObject target, SubLObject result) {
    this.target = target;
    this.result = result;
  }
  
  
  //// Public Area
 
  public String getMessage() {
    return "Attempt to throw to the non-existent tag " + target;
  }
  
  public SubLObject getTarget() {
    return target;
  }
  
  public SubLObject getResult() {
    return result;
  }
  
  public static void throwToCatch(SubLObject target, SubLObject result) throws CatchableThrow {
    throw new CatchableThrow(target, result);
  }
  public static void throwToCatch(SubLObject target) throws CatchableThrow {
    throwToCatch(target, NIL);
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private SubLObject target;
  
  private SubLObject result;
}
