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

package  com.cyc.tool.subl.util;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import java.util.Comparator;

//// Internal Imports

//// External Imports

public  final class ComparatorIdentityKey<T> implements Comparator<T> {
  
  //// Constructors
  
  /**
   * Creates a new instance of ComparatorIdentityKey.
   */
  public ComparatorIdentityKey(BinaryFunction pred) {
    this.pred = pred;
  }
  
  //// Public Area
  
  public int compare(T o1, T o2) {
    SubLObject obj1 = (SubLObject)o1;
    SubLObject obj2 = (SubLObject)o2;
    if (pred.processItem(obj1, obj2) == SubLNil.NIL) {
      if (pred.processItem(obj2, obj1) == SubLNil.NIL) {
        return 0;
      }
      return 1;
    }
    return -1;
  }
  
  public String toString() {
    return "Comapartor: " + pred + " with key: IDENTITY";
  }
  
  public ComparatorIdentityKey init(BinaryFunction pred) {
    this.pred = pred;
    return this;
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private BinaryFunction pred;
  
  //// Main
  
}
