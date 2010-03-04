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
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// Internal Imports

//// External Imports

public  class Alien implements SubLFile {
  
  //// Constructors
  
  /** Creates a new instance of Alien. */
  public Alien() {}
  public static final SubLFile me = new Alien();
  
  //// Public Area
  
  public static final SubLObject alien_p(SubLObject object) {
    return Errors.unimplementedMethod("Alien.alien_p()");
  }
  
  public static final SubLObject alien_null_ptrP(SubLObject object, SubLObject representation) {
    return Errors.unimplementedMethod("Alien.alien_null_ptrP()");
  }
  
  public static final SubLObject alien_as_string(SubLObject alien) {
    return Errors.unimplementedMethod("Alien.alien_as_string()");
  }
  
  public static final SubLObject def_foreign_function 
      (SubLObject FOREIGN_SHARED_LIBRARY, SubLObject FOREIGN_NAME, SubLObject SYMBOL, SubLObject ARG_CONVERSION, SubLObject RET_TYPE, SubLObject CALLING_CONVENTION, SubLObject NULL_DEFAULT_RETURN) {
    return NIL;
  } 
  
  public static final SubLObject load_shared_object(SubLObject moniker, SubLObject pathname, SubLObject options) {
    return Errors.unimplementedMethod("Alien.load_shared_object()");
  }
  
  public static final SubLObject unload_shared_object(SubLObject pathname) {
    return Errors.unimplementedMethod("Alien.unload_shared_object()");
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "alien_p", "ALIEN-P", 1, 0, false);   
    SubLFiles.declareFunction(me, "alien_null_ptrP", "ALIEN-NULL-PTR?", 2, 0, false); 
    
    SubLFiles.declareFunction(me, "def_foreign_function", "DEF-FOREIGN-FUNCTION", 7, 0, false); 
    
    SubLFiles.declareFunction(me, "alien_as_string",      "ALIEN-AS-STRING",      1, 0, false);   
    SubLFiles.declareFunction(me, "load_shared_object",   "LOAD-SHARED-OBJECT",   3, 0, false);   
    SubLFiles.declareFunction(me, "unload_shared_object", "UNLOAD-SHARED-OBJECT", 1, 0, false);   
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
