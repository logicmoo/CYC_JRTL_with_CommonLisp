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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLLock;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;

//// Internal Imports

//// External Imports

public  class Locks implements SubLFile {
  
  //// Constructors
  
  /** Creates a new instance of Locks. */
  public Locks() {}
  public static final SubLFile me = new Locks();
  
  //// Public Area
  
  public static final SubLObject make_lock(SubLObject name) {
    return SubLObjectFactory.makeLock(name.toStr());
  }
  
  public static final SubLObject lock_name(SubLObject lock) {
    return lock.toLock().getName();
  }
  
  public static final SubLObject lock_idle_p(SubLObject lock) {
    if (lock.toLock().isIdle()) { return T; }
    return NIL;
  }
  
  public static final SubLObject lock_locker(SubLObject lock) {
    SubLObject locker = lock.toLock().getLocker();
    if (locker == null) { return NIL; }
    return locker;
  }
  
  public static final SubLObject seize_lock(SubLObject lock) {
    lock.toLock().seizeLock();
    return lock;
  }
  
  public static final SubLObject release_lock(SubLObject lock) {
    lock.toLock().releaseLock();
    return lock;
  }
  
  //// Initializers
  
  public void declareFunctions() {
    SubLFiles.declareFunction(me, "make_lock",    "MAKE-LOCK",     1, 0, false);
    SubLFiles.declareFunction(me, "lock_name",    "LOCK-NAME",     1, 0, false);
    SubLFiles.declareFunction(me, "lock_locker",  "LOCK-LOCKER",   1, 0, false);
    SubLFiles.declareFunction(me, "lock_idle_p",  "LOCK-IDLE-P",   1, 0, false);
    SubLFiles.declareFunction(me, "seize_lock",   "SEIZE-LOCK",    1, 0, false);
    SubLFiles.declareFunction(me, "release_lock", "RELEASE-LOCK",  1, 0, false);
    
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
