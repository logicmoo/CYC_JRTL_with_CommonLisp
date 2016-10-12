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

package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;

//// Internal Imports

//// External Imports

public class SubLSemaphore extends AbstractSubLObject implements SubLObject {

	public static String SEMAPHORE_TYPE_NAME = "SEMAPHORE";

	//// Constructors

	public static SubLSymbol SEMAPHORE_TYPE_SYMBOL = SubLSymbolFactory.makeSymbol(SubLSemaphore.SEMAPHORE_TYPE_NAME,
			SubLPackage.SUBLISP_PACKAGE);

	//// Private Area
	private Semaphore sem;

	//// Public Area

	private SubLString name;

	/** Creates a new instance of SubLSemaphore. */
	SubLSemaphore(SubLString name) {
		this(name, 1);
	}

	/** Creates a new instance of SubLSemaphore. */
	SubLSemaphore(SubLString name, int count) {
		this.sem = new Semaphore(count);
		this.name = name;
	}


	public static SubLSemaphore sleepSem;
	static {
		sleepSem = SubLObjectFactory.makeSemaphore(SubLObjectFactory.makeString("sleep semaphore"));
	}

	public void acquire() {
		this.acquire(1);
	}

	public void acquire(int count) {
		while (true)
			try {
				this.sem.acquire(count);
				break;
			} catch (InterruptedException e) {
				Threads.possiblyHandleInterrupts(false);
			}
	}

	public boolean acquireNonBlocking() {
		return this.acquireNonBlocking(1);
	}

	public boolean acquireNonBlocking(int count) {
		return this.sem.tryAcquire(count);
	}

	public boolean acquireWithTimeoutNanoSecs(int count, long nanosecs) {
		while (true) {
			long startNanos = System.nanoTime();
			try {
				return this.sem.tryAcquire(count, nanosecs, TimeUnit.NANOSECONDS);
			} catch (InterruptedException e) {
				Threads.possiblyHandleInterrupts(false);
				long nanoSecsWaited = System.nanoTime() - startNanos;
				if (nanoSecsWaited < nanosecs)
					nanosecs -= nanoSecsWaited;
				else
					nanosecs = 0L;
			}
			}
	}

	public boolean acquireWithTimeoutNanoSecs(long nanosecs) {
		return this.acquireWithTimeoutNanoSecs(1, nanosecs);
	}

	public boolean canFastHash() {
		return true;
	}

	public int drain() {
		return this.sem.drainPermits();
	}

	public int getCount() {
		return this.sem.availablePermits();
	}

	public String getName() {
		return this.name.getString();
	}

	public SubLString getSubLName() {
		return this.name;
	}

	public SubLSymbol getType() {
		return SubLSemaphore.SEMAPHORE_TYPE_SYMBOL;
	}

	public SubLFixnum getTypeCode() {
		// @todo we need to define a *DTP* number for these objects
		Errors.unimplementedMethod("SubLSemaphore.getTypeCode()");
		return CommonSymbols.ZERO_INTEGER;
	}

	public int hashCode(int depth) {
		return this.sem.hashCode();
	}

	public boolean isAlien() {
		return false;
	}

	public boolean isAtom() {
		return true;
	}

	public boolean isBigIntegerBignum() {
		return false;
	}

	public boolean isBignum() {
		return false;
	}

	public boolean isBoolean() {
		return false;
	}

	public boolean isChar() {
		return false;
	}

	public boolean isCons() {
		return false;
	}

	public boolean isDouble() {
		return false;
	}

	public boolean isEnvironment() {
		return false;
	}

	public boolean isError() {
		return false;
	}

	public boolean isFixnum() {
		return false;
	}

	public boolean isFunction() {
		return false;
	}

	public boolean isFunctionSpec() {
		return false;
	}

	public boolean isGuid() {
		return false;
	}

	public boolean isHashtable() {
		return false;
	}

	public boolean isHashtableIterator() {
		return false;
	}

	public boolean isIntBignum() {
		return false;
	}

	public boolean isInteger() {
		return false;
	}

	public boolean isKeyhash() {
		return false;
	}

	public boolean isKeyhashIterator() {
		return false;
	}

	public boolean isKeyword() {
		return false;
	}

	public boolean isList() {
		return false;
	}

	public boolean isLock() {
		return false;
	}

	public boolean isLongBignum() {
		return false;
	}

	public boolean isMacroOperator() {
		return false;
	}

	public boolean isNil() {
		return false;
	}

	public boolean isNumber() {
		return false;
	}

	public boolean isPackage() {
		return false;
	}

	public boolean isPackageIterator() {
		return false;
	}

	public boolean isProcess() {
		return false;
	}

	public boolean isReadWriteLock() {
		return false;
	}

	public boolean isRegexPattern() {
		return false;
	}

	public boolean isSemaphore() {
		return true;
	}

	public boolean isSequence() {
		return false;
	}

	public boolean isStream() {
		return false;
	}

	public boolean isString() {
		return false;
	}

	public boolean isStructure() {
		return false;
	}

	public boolean isSymbol() {
		return false;
	}

	public boolean isVector() {
		return false;
	}

	public void release() {
		this.release(1);
	}

	public void release(int count) {
		this.sem.release(count);
	}

	public SubLSemaphore toSemaphore() {
		return this;
	}

	public String toString() {
		return "#<" + this.toTypeName() + " \"" + this.getName() + "\" Permits(" + this.sem.availablePermits() + ") @ "
				+ this.hashCode(0) + ">";
	}

	//// Protected Area

	public String toTypeName() {
		return SubLSemaphore.SEMAPHORE_TYPE_NAME;
	}

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

	//// Internal Rep
}
