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
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// Internal Imports

//// External Imports

public  class Storage implements SubLFile {
  
  //// Constructors
  
  /** Creates a new instance of Storage. */
  public Storage() {}
  public static final SubLFile me = new Storage();
  
  //// Public Area
  
  public static final SubLObject gc_ephemeral() {
    Runtime.getRuntime().gc();
    return NIL;
  }
  
  public static final SubLObject gc_dynamic() {
    return gc_ephemeral();
  }
  
  public static final SubLObject gc_full() {
    return gc_dynamic();
  }
  
  public static final SubLObject gc(SubLObject level) {
    // level ignored
    return gc_dynamic();
  }
     
  public static final SubLObject room(SubLObject x) {
    gc_dynamic();
    Runtime rt = Runtime.getRuntime();
    long totalMemory = rt.totalMemory();
    long freeMemory = rt.freeMemory();
    double oneMB = 1024.0 * 1024.0;
    System.out.println("Total memory allocated to VM: " + (int)(totalMemory/oneMB) + "MB.");
    System.out.println("Memory currently used: " + (int)((totalMemory - freeMemory)/oneMB) + "MB.");
    System.out.println("Memory currently available: " + (int)(freeMemory/oneMB) + "MB.");
    return NIL;
  }

  public static SubLSymbol $current_area$;
  
  public static final SubLObject get_static_area() {
    return NIL;
  }
  
  public static final SubLObject get_thread_private_area() {
    return NIL;
  }
  
  public static final SubLObject get_working_area() {
    return NIL;
  }
  
  public static final SubLObject register_low_memory_callback(SubLObject func) {
    SubLMain.registerLowMemoryCallback(func.getFunc());
    return NIL;
  }
  
  //// Initializations
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "gc_dynamic",   "GC-DYNAMIC",    0, 0, false);
    SubLFiles.declareFunction(me, "gc_ephemeral", "GC-EPHEMERAL",  0, 0, false);
    SubLFiles.declareFunction(me, "gc_full",      "GC-FULL",       0, 0, false);
    SubLFiles.declareFunction(me, "gc",           "GC",            0, 1, false);
    
    SubLFiles.declareFunction(me, "room", "ROOM", 0, 1, false);
    
    SubLFiles.declareFunction(me, "register_low_memory_callback", "REGISTER-LOW-MEMORY-CALLBACK", 1, 0, false);
    
    SubLFiles.declareFunction(me, "get_static_area",         "GET-STATIC-AREA",         0, 0, false);
    SubLFiles.declareFunction(me, "get_thread_private_area", "GET-THREAD-PRIVATE-AREA", 0, 0, false);
    SubLFiles.declareFunction(me, "get_working_area",        "GET-WORKING-AREA",        0, 0, false);
  }
  
  public void initializeVariables() {
    $current_area$ = SubLFiles.defvar(me, "*CURRENT-AREA*", NIL);
  }
  
  public void runTopLevelForms() {
  }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  //// Main
  
  
}
