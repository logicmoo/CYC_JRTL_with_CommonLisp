//
// For LarKC
//
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

public class SubLSemaphore extends FromSubLisp implements SubLObject {
	SubLSemaphore(SubLString name) {
		this(name, 1);
	}

	SubLSemaphore(SubLString name, int count) {
		sem = new Semaphore(count);
		this.name = name;
	}

	private Semaphore sem;
	private SubLString name;
	public static String SEMAPHORE_TYPE_NAME = "SEMAPHORE";
	public static SubLSymbol SEMAPHORE_TYPE_SYMBOL;
	public static SubLSemaphore sleepSem;
	static {
		SEMAPHORE_TYPE_SYMBOL = SubLSymbolFactory.makeSymbol("SEMAPHORE", SubLPackage.SUBLISP_PACKAGE.toPackage());
		sleepSem = SubLObjectFactory.makeSemaphore(SubLObjectFactory.makeString("sleep semaphore"));
	}

	public void acquire() {
		this.acquire(1);
	}

	public void acquire(int count) {
		while (true) {
			try {
				sem.acquire(count);
			} catch (InterruptedException e) {
				Threads.possiblyHandleInterrupts(false);
				continue;
			}
			break;
		}
	}

	public boolean acquireNonBlocking() {
		return this.acquireNonBlocking(1);
	}

	public boolean acquireNonBlocking(int count) {
		return sem.tryAcquire(count);
	}

	public boolean acquireWithTimeoutNanoSecs(int count, long nanosecs) {
		while (true) {
			long startNanos = System.nanoTime();
			try {
				return sem.tryAcquire(count, nanosecs, TimeUnit.NANOSECONDS);
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

	@Override
	public boolean canFastHash() {
		return true;
	}

	public int drain() {
		return sem.drainPermits();
	}

	public int getCount() {
		return sem.availablePermits();
	}

	public String getName() {
		return name.getStringValue();
	}

	public SubLString getSubLName() {
		return name;
	}

	@Override
	public SubLSymbol getType() {
		return SubLSemaphore.SEMAPHORE_TYPE_SYMBOL;
	}

	@Override
	public SubLFixnum getTypeCode() {
		Errors.unimplementedMethod("SubLSemaphore.getTypeCode()");
		return CommonSymbols.ZERO_INTEGER;
	}

	@Override
	public int hashCode(int depth) {
		return sem.hashCode();
	}

	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isBigIntegerBignum() {
		return false;
	}

	@Override
	public boolean isBignum() {
		return false;
	}

	@Override
	public boolean isBoolean() {
		return false;
	}

	@Override
	public boolean isChar() {
		return false;
	}

	@Override
	public boolean isCons() {
		return false;
	}

	@Override
	public boolean isDouble() {
		return false;
	}

	@Override
	public boolean isEnvironment() {
		return false;
	}

	@Override
	public boolean isError() {
		return false;
	}

	@Override
	public boolean isFixnum() {
		return false;
	}

	@Override
	public boolean isFunction() {
		return false;
	}

	@Override
	public boolean isFunctionSpec() {
		return false;
	}

	@Override
	public boolean isGuid() {
		return false;
	}

	@Override
	public boolean isHashtable() {
		return false;
	}

	@Override
	public boolean isHashtableIterator() {
		return false;
	}

	@Override
	public boolean isIntBignum() {
		return false;
	}

	@Override
	public boolean isInteger() {
		return false;
	}

	@Override
	public boolean isKeyhash() {
		return false;
	}

	@Override
	public boolean isKeyhashIterator() {
		return false;
	}

	@Override
	public boolean isKeyword() {
		return false;
	}

	@Override
	public boolean isList() {
		return false;
	}

	@Override
	public boolean isLock() {
		return false;
	}

	@Override
	public boolean isLongBignum() {
		return false;
	}

	@Override
	public boolean isMacroOperator() {
		return false;
	}

	@Override
	public boolean isNil() {
		return false;
	}

	@Override
	public boolean isNumber() {
		return false;
	}

	@Override
	public boolean isPackage() {
		return false;
	}

	@Override
	public boolean isPackageIterator() {
		return false;
	}

	@Override
	public boolean isProcess() {
		return false;
	}

	@Override
	public boolean isReadWriteLock() {
		return false;
	}

	@Override
	public boolean isRegexPattern() {
		return false;
	}

	@Override
	public boolean isSemaphore() {
		return true;
	}

	@Override
	public boolean isSequence() {
		return false;
	}

	@Override
	public boolean isStream() {
		return false;
	}

	@Override
	public boolean isString() {
		return false;
	}

	@Override
	public boolean isStructure() {
		return false;
	}

	@Override
	public boolean isSymbol() {
		return false;
	}

	@Override
	public boolean isVector() {
		return false;
	}

	public void release() {
		this.release(1);
	}

	public void release(int count) {
		sem.release(count);
	}

	@Override
	public SubLSemaphore toSemaphore() {
		return this;
	}

	@Override
	public String printObject() {
		return "#<" + toTypeName() + " \"" + getName() + "\" Permits(" + sem.availablePermits() + ") @ "
				+ this.hashCode(0) + ">";
	}

	@Override
	public String toTypeName() {
		return "SEMAPHORE";
	}
}
