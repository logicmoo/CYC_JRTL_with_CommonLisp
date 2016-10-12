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

import java.util.concurrent.locks.ReentrantLock;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

//// Internal Imports

//// External Imports

public class SubLLock extends AbstractSubLObject implements SubLObject {

	public static class MyReentrantLock extends ReentrantLock {
		public Thread getLockOwner() {
			return this.getOwner();
		};
	}

	//// Constructors

	public static String LOCK_TYPE_NAME = "LOCK";

	//// Public Area

	private static boolean DO_LOCKING_CHECKS = false;

	private SubLString name;

	private MyReentrantLock lock = new MyReentrantLock();

	/** Creates a new instance of SubLLock. */
	SubLLock(SubLString name) {
		this.name = name;
	}

	public boolean canFastHash() {
		return true;
	}

	public SubLProcess getLocker() {
		Thread thread = this.lock.getLockOwner();
		if (thread == null)
			return null;
		if (!(thread instanceof SubLThread))
			Errors.error("SubLLock " + this.toString() + " held by non-SubLThread " + thread);
		return ((SubLThread) thread).getSubLProcess();
	}

	public SubLString getName() {
		return this.name;
	}

	public SubLSymbol getType() {
		return Types.$dtp_lock$;
	}

	public SubLFixnum getTypeCode() {
		return CommonSymbols.FIFTEEN_INTEGER;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return this.lock.hashCode();
		else
			return SubLObject.DEFAULT_EXCEEDED_HASH_VALUE;
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

	public boolean isIdle() {
		return !this.lock.isLocked();
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
		return true;
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
		return false;
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

	public void releaseLock() {
		this.lock.unlock();
	}

	public void seizeLock() {
		while (true)
			try {
				this.lock.lockInterruptibly();
				break;
			} catch (InterruptedException ie) {
				Threads.possiblyHandleInterrupts(false);
			}
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	/** Method created to avoid casting */
	public SubLLock toLock() { // SubLLock
		return this;
	}

	public String toString() {
		return "#<" + SubLLock.LOCK_TYPE_NAME + " " + this.getName() + " @ " + this.hashCode(0) + ">";
	}

	public String toTypeName() {
		return SubLLock.LOCK_TYPE_NAME;
	}

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

}
