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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLSequence;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.SubLFunction;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import java.util.ArrayList;

//// Internal Imports

//// External Imports

public  class Mapping extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Environment. */
  public Mapping() {}
  public static final SubLFile me = new Mapping();
  
  //// Public Area
  
  public static final SubLObject mapc(SubLObject function, SubLObject list, SubLObject[] moreLists) {
    return list.toList().mapcar(function.getFunc(), moreLists, false);
  }
  
  public static final SubLObject mapcan(SubLObject function, SubLObject list, SubLObject[] moreLists) {
    return Functions.apply(NCONC, mapcar(function, list, moreLists).toList(), Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
  }
  
  public static final SubLObject mapcar(SubLObject function, SubLObject list, SubLObject[] moreLists) {
    return list.toList().mapcar(function.getFunc(), moreLists, true);
  }
  
  public static final SubLObject mapcar(SubLObject functionSpec, SubLObject list) {
    return mapcar(functionSpec, list, Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
  }
  
  public static final SubLObject mapcon(SubLObject function, SubLObject list, SubLObject[] moreLists) {
    return Functions.apply(NCONC, maplist(function, list, moreLists).toList(), Resourcer.EMPTY_SUBL_OBJECT_ARRAY);
  }
  
  public static final SubLObject mapl(SubLObject function, SubLObject list, SubLObject[] moreLists) {
    return Errors.unimplementedMethod("Mapping.mapl()");
  }
  
  public static final SubLObject maplist(SubLObject function, SubLObject list, SubLObject[] moreLists) {
    return Errors.unimplementedMethod("Mapping.maplist()");
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "mapc", "MAPC", 2, 0, true);
    SubLFiles.declareFunction(me, "mapcan", "MAPCAN", 2, 0, true);
    SubLFiles.declareFunction(me, "mapcar", "MAPCAR", 2, 0, true);
    SubLFiles.declareFunction(me, "mapcon", "MAPCON", 2, 0, true);
    SubLFiles.declareFunction(me, "mapl", "MAPL", 2, 0, true);
    SubLFiles.declareFunction(me, "maplist", "MAPLIST", 2, 0, true);
  }
  
  public void initializeVariables() {
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
}
