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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

public  final class ReadWriteLocks extends SubLTrampolineFile {
  
  //// Constructors
  
  /** Creates a new instance of Guids. */
  private ReadWriteLocks() {}
  public static final SubLFile me = new ReadWriteLocks();
  
  //// Public Area
  
  public static final SubLObject rw_lock_p(SubLObject possibleRWLock) {
    return possibleRWLock.isReadWriteLock() ? (SubLObject)T : NIL;
  }
  
  public static final SubLObject new_rw_lock(SubLObject name) {
    return SubLObjectFactory.makeReadWriteLock(name.toStr());
  }
  
  public static final SubLObject rw_lock_name(SubLObject rwLock) {
    return rwLock.toReadWriteLock().getSubLName();
  }
  
  public static final SubLObject rw_lock_seize_read_lock(SubLObject rwLock) {
    rwLock.toReadWriteLock().seizeReadLock();
    return rwLock; // this is necessary for macro to work...returns non-NIL if lock was successfully seized
  }
  
  public static final SubLObject rw_lock_seize_write_lock(SubLObject rwLock) {
    rwLock.toReadWriteLock().seizeWriteLock();
    return rwLock; // this is necessary for macro to work...returns non-NIL if lock was successfully seized
  }
  
  public static final SubLObject rw_lock_release_read_lock(SubLObject rwLock) {
    rwLock.toReadWriteLock().releaseReadLock();
    return rwLock;
  }
  
  public static final SubLObject rw_lock_release_write_lock(SubLObject rwLock) {
    rwLock.toReadWriteLock().releaseWriteLock();
    return rwLock;
  }
  
  //// Initializers
  
  public void declareFunctions() {
    try {
      SubLPackage.setCurrentPackage(SubLPackage.CYC_PACKAGE);
      SubLFiles.declareFunction(me, "rw_lock_p", "RW-LOCK-P", 1, 0, false);
      SubLFiles.declareFunction(me, "rw_lock_p", "READER-WRITER-LOCK-P", 1, 0, false);
      SubLFiles.declareFunction(me, "new_rw_lock", "NEW-RW-LOCK", 1, 0, false);
      SubLFiles.declareFunction(me, "new_rw_lock", "NEW-READER-WRITER-LOCK", 1, 0, false);
      SubLFiles.declareFunction(me, "rw_lock_name", "RW-LOCK-NAME", 1, 0, false);
      SubLFiles.declareFunction(me, "rw_lock_name", "READER-WRITER-LOCK-NAME", 1, 0, false);
      SubLFiles.declareFunction(me, "rw_lock_seize_read_lock", "RW-LOCK-SEIZE-READ-LOCK", 1, 0, false);
      SubLFiles.declareFunction(me, "rw_lock_seize_write_lock", "RW-LOCK-SEIZE-WRITE-LOCK", 1, 0, false);
      SubLFiles.declareFunction(me, "rw_lock_release_read_lock", "RW-LOCK-RELEASE-READ-LOCK", 1, 0, false);
      SubLFiles.declareFunction(me, "rw_lock_release_write_lock", "RW-LOCK-RELEASE-WRITE-LOCK", 1, 0, false);
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
