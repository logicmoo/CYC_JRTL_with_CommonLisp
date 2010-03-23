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
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//// Internal Imports

//// External Imports

public  final class SubLReadWriteLock extends AbstractSubLObject implements SubLObject {
  
	// common lisp additions
	@Override
	public String writeToString() {
		// TODO Auto-generated method stub
		return toString();
	}

  //// Constructors
  
  /** Creates a new instance of SubLLock. */
  SubLReadWriteLock(SubLString name) {
    this.name = name;
  }
  
  //// Public Area
  
  /** Method created to avoid casting */
  public final SubLReadWriteLock toReadWriteLock() { // SubLReadWriteLock
    return this;
  }
  
  public int hashCode(int currentDepth) {
    if (currentDepth < MAX_HASH_DEPTH) {
      return superHash();
    } else {
      return DEFAULT_EXCEEDED_HASH_VALUE;
    }
  }
  
  public final boolean canFastHash() {
    return true;
  }
  
  public String toString() {
    return "#<" + toTypeName() + " " + getName() + " @ " + hashCode(0) + ">";
  }
  
  public static final String READ_WRITE_LOCK_TYPE_NAME = "READ-WRITE-LOCK";
  public static final SubLSymbol READ_WRITE_LOCK_TYPE_SYMBOL = 
    SubLSymbolFactory.makeSymbol(READ_WRITE_LOCK_TYPE_NAME, SubLPackage.SUBLISP_PACKAGE);
  
  public String toTypeName() {
    return READ_WRITE_LOCK_TYPE_NAME;
  }
  
  public SubLString getSubLName() {
    return name;
  }
  
  public SubLString getName() {
    return name.toStr();
  }
  
  public void seizeReadLock() {
    while (true) {
      try {
        nativeReadWriteLock.readLock().lockInterruptibly();
        break;
      } catch (InterruptedException ie) {
        Threads.possiblyHandleInterrupts(false);
      }
    }
  }
  
  public void releaseReadLock() {
    nativeReadWriteLock.readLock().unlock();
  }
  
  public void seizeWriteLock() {
    while (true) {
      try {
        nativeReadWriteLock.writeLock().lockInterruptibly();
        break;
      } catch (InterruptedException ie) {
        Threads.possiblyHandleInterrupts(false);
      }
    }
  }
  
  public void releaseWriteLock() {
    nativeReadWriteLock.writeLock().unlock();
  }
  
  public final SubLSymbol getType(){
    return READ_WRITE_LOCK_TYPE_SYMBOL;
  }
  
  public final SubLFixnum getTypeCode() {
    // @todo we need to define a *DTP* number for these objects
    Errors.unimplementedMethod("SubLReadWriteLock.getTypeCode()");
    return CommonSymbols.ZERO_INTEGER;
  }
  
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
  public final boolean isReadWriteLock() { return true; }
  public final boolean isStructure() { return false; }
  public final boolean isStream() { return false; }
  public final boolean isPackage() { return false; }
  public final boolean isError() { return false; }
  public final boolean isGuid() { return false; }
  public final boolean isSemaphore() { return false; }
  public final boolean isEnvironment() { return false; }
  public final boolean isHashtableIterator() { return false; }
  public final boolean isRegexPattern() { return false; }
  public final boolean isKeyhash() { return false; }
  public final boolean isKeyhashIterator() { return false; }
  
  //// Protected Area
  
  //// Private Area
  
  //// Internal Rep
  
  private SubLString name;
  private ReentrantReadWriteLock nativeReadWriteLock = new ReentrantReadWriteLock();
  
}
