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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;


//// Internal Imports

//// External Imports

public  final class Semaphores extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Guids. */
  private Semaphores() {}
  public static final SubLFile me = new Semaphores();
  
  //// Public Area
 
  
  public static final SubLObject semaphore_p(SubLObject possibleSemaphore) {
    return possibleSemaphore.isSemaphore() ? (SubLObject)T : NIL;
  }
  
  public static final SubLObject new_semaphore(SubLObject name, SubLObject count) {
    if (count == UNPROVIDED) {
      count = ONE_INTEGER;
    }
    return SubLObjectFactory.makeSemaphore(name.toStr(), count.intValue());
  }
  
  public static final SubLObject semaphore_name(SubLObject semaphore) {
    return semaphore.toSemaphore().getSubLName();
  }
  
  public static final SubLObject semaphore_signal(SubLObject semaphore) {
    semaphore.toSemaphore().release(1);
    return semaphore;
  }
  
  public static final SubLObject semaphore_wait(SubLObject semaphore) {
    semaphore.toSemaphore().acquire(1);
    return semaphore;
  }
  
  public static final SubLObject semaphore_current_count(SubLObject semaphore) {
    return SubLNumberFactory.makeInteger(semaphore.toSemaphore().getCount());
  }

  public static final SubLObject semaphore_drain(SubLObject semaphore) {
    return SubLNumberFactory.makeInteger(semaphore.toSemaphore().drain());
  }

  public static final SubLObject semaphore_wait_with_timeout(SubLObject semaphore, SubLObject max_secs_to_wait) {
    return semaphore.toSemaphore().acquireWithTimeout(Math.round(max_secs_to_wait.doubleValue() * 1000.0)) ? RET_T : NIL;
  }
  
  //// Initializers
  
  public void declareFunctions() {
    try {
      SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
      SubLFiles.declareFunction(me, "semaphore_p", "SEMAPHORE-P", 1, 0, false);
      SubLFiles.declareFunction(me, "new_semaphore", "NEW-SEMAPHORE", 1, 1, false);
      SubLFiles.declareFunction(me, "semaphore_name", "SEMAPHORE-NAME", 1, 0, false);
      SubLFiles.declareFunction(me, "semaphore_signal", "SEMAPHORE-SIGNAL", 1, 0, false);
      SubLFiles.declareFunction(me, "semaphore_wait", "SEMAPHORE-WAIT", 1, 0, false);
      SubLFiles.declareFunction(me, "semaphore_drain", "SEMAPHORE-DRAIN", 1, 0, false);
      SubLFiles.declareFunction(me, "semaphore_wait_with_timeout", "SEMAPHORE-WAIT-WITH-TIMEOUT", 2, 0, false);
      SubLFiles.declareFunction(me, "semaphore_current_count", "SEMAPHORE-CURRENT-COUNT", 1, 0, false);
    } finally {
      SubLPackage.setCurrentPackage(SubLPackage.SUBLISP_PACKAGE);
    }
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
