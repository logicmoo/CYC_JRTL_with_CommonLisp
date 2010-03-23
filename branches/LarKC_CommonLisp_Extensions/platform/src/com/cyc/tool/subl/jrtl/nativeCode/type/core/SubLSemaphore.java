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

package  com.cyc.tool.subl.jrtl.nativeCode.type.core;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

//// Internal Imports

//// External Imports

public  final class SubLSemaphore extends AbstractSubLObject implements SubLObject {
  
	// common lisp additions
	@Override
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}

  //// Constructors
  
  /** Creates a new instance of SubLSemaphore. */
  SubLSemaphore(SubLString name) {
    this(name, 1);
  }
  
  /** Creates a new instance of SubLSemaphore. */
  SubLSemaphore(SubLString name, int count) {
    sem = new Semaphore(count);
    this.name = name;
  }
  
  //// Public Area
  
  public boolean canFastHash() {
    return true;
  }
  
  public int hashCode(int depth) {
    return sem.hashCode();
  }
  
  public static final String SEMAPHORE_TYPE_NAME = "SEMAPHORE";
  public static final SubLSymbol SEMAPHORE_TYPE_SYMBOL = 
    SubLSymbolFactory.makeSymbol(SEMAPHORE_TYPE_NAME, SubLPackage.SUBLISP_PACKAGE);
  
  public String toTypeName() {
    return SEMAPHORE_TYPE_NAME;
  }
  
  public final SubLSymbol getType(){
    return SEMAPHORE_TYPE_SYMBOL;
  }
  
  public final SubLFixnum getTypeCode() {
    // @todo we need to define a *DTP* number for these objects
    Errors.unimplementedMethod("SubLSemaphore.getTypeCode()");
    return CommonSymbols.ZERO_INTEGER;
  }
  
  public String toString() {
    return "#<" + toTypeName() + " \"" + getName() + "\" Permits(" + sem.availablePermits() + ") @ " + hashCode(0) + ">";
  }
  
  public String getName() {
    return name.getString();
  }
  
  public SubLString getSubLName() {
    return name;
  }
 
  public int getCount() {
    return sem.availablePermits();
  }
  
  public void acquire() {
    acquire(1);
  }
  
  public void acquire(int count) {
    while (true) {
      try {
        sem.acquire(count);
        break;
      } catch (InterruptedException e) {
        Threads.possiblyHandleInterrupts(false);
      }
    }
  }

  public boolean acquireWithTimeout(long msecs) {
    return acquireWithTimeout(1, msecs);
  }

  public boolean acquireWithTimeout(int count, long msecs) {
    while (true) {
      try {
        return sem.tryAcquire(count, msecs, TimeUnit.MILLISECONDS);
      } catch (InterruptedException e) {
        Threads.possiblyHandleInterrupts(false);
      }
    }
  }
  
  public boolean acquireNonBlocking() {
    return acquireNonBlocking(1);
  }
  
  public boolean acquireNonBlocking(int count) {
    return sem.tryAcquire(count);
  }

  public int drain() {
    return sem.drainPermits();
  }
  
  public void release() {
    release(1);
  }
  
  public void release(int count) {
    sem.release(count);
  }
  
  public final SubLSemaphore toSemaphore() { return this; }
 
  public final boolean isNil() { return false; }
  public final boolean isBoolean() { return false; }
  public final boolean isSymbol() { return false; }
  public final boolean isKeyword() { return false; }
  public final boolean isAtom() { return true; }
  public final boolean isCons() { return false; }
  public final boolean isList() { return false; }
  public final boolean isSequence() { return false; }
  public final boolean isNumber() { return false; }
  public final boolean isFixnum() { return false; }
  public final boolean isBignum() { return false; }
  public final boolean isIntBignum() { return false; }
  public final boolean isLongBignum() { return false; }
  public final boolean isBigIntegerBignum() { return false; }
  public final boolean isInteger() { return false; }
  public final boolean isDouble() { return false; }
  public final boolean isChar() { return false; }
  public final boolean isString() { return false; }
  public final boolean isVector() { return false; }
  public final boolean isFunction() { return false; }
  public final boolean isFunctionSpec() { return false; }
  public final boolean isMacroOperator() { return false; }
  public final boolean isHashtable() { return false; }
  public final boolean isProcess() { return false; }
  public final boolean isLock() { return false; }
  public final boolean isReadWriteLock() { return false; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return true; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  
  //// Private Area
  private final Semaphore sem;
  private final SubLString name;

  //// Internal Rep
}
