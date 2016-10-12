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

import java.util.Collection;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;

//// Internal Imports

//// External Imports

public class SubLReadWriteLock extends AbstractSubLObject implements SubLObject {


	private class MyReentrantReadWriteLock extends ReentrantReadWriteLock {
		protected Thread myGetOwner() {
			return this.getOwner();
		}

		protected Collection<Thread> myGetQueuedThreads() {
			return this.getQueuedThreads();
		}
	}

	public static String READ_WRITE_LOCK_TYPE_NAME = "READ-WRITE-LOCK";

	//// Constructors

	public static SubLSymbol READ_WRITE_LOCK_TYPE_SYMBOL = SubLSymbolFactory
			.makeSymbol(SubLReadWriteLock.READ_WRITE_LOCK_TYPE_NAME, SubLPackage.SUBLISP_PACKAGE);

	//// Public Area

	private SubLString name;

	private MyReentrantReadWriteLock nativeReadWriteLock = new MyReentrantReadWriteLock();

	/** Creates a new instance of SubLLock. */
	SubLReadWriteLock(SubLString name) {
		this.nativeReadWriteLock = new MyReentrantReadWriteLock();
		this.name = name;
	}

	public boolean canFastHash() {
		return true;
	}

	public SubLString getName() {
		return this.name.toStr();
	}

	public SubLString getSubLName() {
		return this.name;
	}

	public SubLSymbol getType() {
		return SubLReadWriteLock.READ_WRITE_LOCK_TYPE_SYMBOL;
	}

	public SubLFixnum getTypeCode() {
		// @todo we need to define a *DTP* number for these objects
		Errors.unimplementedMethod("SubLReadWriteLock.getTypeCode()");
		return CommonSymbols.ZERO_INTEGER;
	}

	public SubLObject getWaiters() {
		SubLObject result = SubLNil.NIL;
		try {
			Collection<Thread> threads = this.nativeReadWriteLock.myGetQueuedThreads();
			for (Thread thread : threads)
				result = new SubLConsPair(((SubLThread) thread).getSubLProcess(), result);
		} catch (Exception ex) {
		}
		return result;
	}

	public SubLObject getWriter() {
		SubLObject result = SubLNil.NIL;
		try {
			Thread thread = this.nativeReadWriteLock.myGetOwner();
			result = ((SubLThread) thread).getSubLProcess();
		} catch (Exception ex) {
		}
		return result;
	}

	public int hashCode(int currentDepth) {
		if (currentDepth < SubLObject.MAX_HASH_DEPTH)
			return this.superHash();
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
		return true;
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

	public void releaseReadLock() {
		this.nativeReadWriteLock.readLock().unlock();
	}

	public void releaseWriteLock() {
		this.nativeReadWriteLock.writeLock().unlock();
	}

	public void seizeReadLock() {
		while (true)
			try {
				this.nativeReadWriteLock.readLock().lockInterruptibly();
				break;
			} catch (InterruptedException ie) {
				Threads.possiblyHandleInterrupts(false);
			}
	}

	public void seizeWriteLock() {
		while (true)
			try {
				this.nativeReadWriteLock.writeLock().lockInterruptibly();
				break;
			} catch (InterruptedException ie) {
				Threads.possiblyHandleInterrupts(false);
			}
	}

	/** Method created to avoid casting */
	public SubLReadWriteLock toReadWriteLock() { // SubLReadWriteLock
		return this;
	}

	public String toString() {
		return "#<" + this.toTypeName() + " " + this.getName() + " @ " + this.hashCode(0) + ">";
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	public String toTypeName() {
		return SubLReadWriteLock.READ_WRITE_LOCK_TYPE_NAME;
	}

	// common lisp additions

	public String writeToString() {
		// TODO Auto-generated method stub
		return this.toString();
	}

}
