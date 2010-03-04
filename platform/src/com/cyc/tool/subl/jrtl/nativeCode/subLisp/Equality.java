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
import com.cyc.tool.subl.util.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public  final class Equality implements SubLFile {
  
  //// Constructors
  
  /** There should only ever be one instance of this */
  private Equality() {}
  public static final Equality me = new Equality();
  
  //// Public Area
  
  public static final SubLObject eq(SubLObject x, SubLObject y) {
    if (x == y) { return T; }
    return NIL;
  }
  
  public static final SubLObject eql(SubLObject x, SubLObject y) {
    if (x.eql(y)) { return T; }
    return NIL;
  }
  
  public static final SubLObject equal(SubLObject x, SubLObject y) {
    if (x.equal(y)) { return T; }
    return NIL;
  }
  
  public static final SubLObject equalp(SubLObject x, SubLObject y) {
    if (x.equalp(y)) { return T; }
    return NIL;
  }
  
  public static final SubLObject identity(SubLObject object) {
    return object;
  }
  
  public static final SubLObject pointer(SubLObject object) {
    // KMG the native hashCode method is the closest we have to a pointer
    return SubLObjectFactory.makeInteger(object.hashCode());
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "eq", "EQ", 2, 0, false);
    SubLFiles.declareFunction(me, "eql", "EQL", 2, 0, false);
    SubLFiles.declareFunction(me, "equal", "EQUAL", 2, 0, false);
    SubLFiles.declareFunction(me, "equalp", "EQUALP", 2, 0, false);
    SubLFiles.declareFunction(me, "identity", "IDENTITY", 1, 0, false);
    SubLFiles.declareFunction(me, "pointer", "POINTER", 1, 0, false);
  }
  
  public void initializeVariables() {
  }
  
  public void runTopLevelForms() {
  }
  
}
