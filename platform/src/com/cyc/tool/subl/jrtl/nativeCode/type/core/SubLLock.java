//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.concurrent.locks.ReentrantLock;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLLock extends FromSubLisp implements SubLObject
{
	public static class MyReentrantLock extends ReentrantLock
	{
		public Thread getLockOwner()
		{
			return getOwner();
		}
	}

	SubLLock(SubLString name)
	{
		lock = new MyReentrantLock();
		this.name = name;
	}

	private SubLString name;
	private MyReentrantLock lock;
	public static String LOCK_TYPE_NAME = "LOCK";
	private static boolean DO_LOCKING_CHECKS = false;

	@Override
	public boolean canFastHash()
	{
		return true;
	}

	public SubLProcess getLocker()
	{
		Object thread = lock.getLockOwner();
		if (thread == null) return null;
		if (!(SubLThread.isSubLThread(thread))) Errors.error("SubLLock " + toString() + " held by non-SubLThread " + thread);
		return ((SubLThread) thread).getSubLProcess();
	}

	public SubLString getName()
	{
		return name;
	}

	@Override
	public SubLSymbol getType()
	{
		return Types.$dtp_lock$;
	}

	@Override
	public SubLFixnum getTypeCode()
	{
		return CommonSymbols.FIFTEEN_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth)
	{
		if (currentDepth < 8) return lock.hashCode();
		return 0;
	}

	@Override
	public boolean isAlien()
	{
		return false;
	}

	@Override
	public boolean isAtom()
	{
		return true;
	}

	@Override
	public boolean isBigIntegerBignum()
	{
		return false;
	}

	@Override
	public boolean isBignum()
	{
		return false;
	}

	@Override
	public boolean isBoolean()
	{
		return false;
	}

	@Override
	public boolean isChar()
	{
		return false;
	}

	@Override
	public boolean isCons()
	{
		return false;
	}

	@Override
	public boolean isDouble()
	{
		return false;
	}

	@Override
	public boolean isEnvironment()
	{
		return false;
	}

	@Override
	public boolean isError()
	{
		return false;
	}

	@Override
	public boolean isFixnum()
	{
		return false;
	}

	@Override
	public boolean isFunction()
	{
		return false;
	}

	@Override
	public boolean isFunctionSpec()
	{
		return false;
	}

	@Override
	public boolean isGuid()
	{
		return false;
	}

	@Override
	public boolean isHashtable()
	{
		return false;
	}

	@Override
	public boolean isHashtableIterator()
	{
		return false;
	}

	public boolean isIdle()
	{
		return !lock.isLocked();
	}

	@Override
	public boolean isIntBignum()
	{
		return false;
	}

	@Override
	public boolean isInteger()
	{
		return false;
	}

	@Override
	public boolean isKeyhash()
	{
		return false;
	}

	@Override
	public boolean isKeyhashIterator()
	{
		return false;
	}

	@Override
	public boolean isKeyword()
	{
		return false;
	}

	@Override
	public boolean isList()
	{
		return false;
	}

	@Override
	public boolean isLock()
	{
		return true;
	}

	@Override
	public boolean isLongBignum()
	{
		return false;
	}

	@Override
	public boolean isMacroOperator()
	{
		return false;
	}

	@Override
	public boolean isNil()
	{
		return false;
	}

	@Override
	public boolean isNumber()
	{
		return false;
	}

	@Override
	public boolean isPackage()
	{
		return false;
	}

	@Override
	public boolean isPackageIterator()
	{
		return false;
	}

	@Override
	public boolean isProcess()
	{
		return false;
	}

	@Override
	public boolean isReadWriteLock()
	{
		return false;
	}

	@Override
	public boolean isRegexPattern()
	{
		return false;
	}

	@Override
	public boolean isSemaphore()
	{
		return false;
	}

	@Override
	public boolean isSequence()
	{
		return false;
	}

	@Override
	public boolean isStream()
	{
		return false;
	}

	@Override
	public boolean isString()
	{
		return false;
	}

	@Override
	public boolean isStructure()
	{
		return false;
	}

	@Override
	public boolean isSymbol()
	{
		return false;
	}

	@Override
	public boolean isVector()
	{
		return false;
	}

	public void releaseLock()
	{
		lock.unlock();
	}

	public void seizeLock()
	{
		while (true)
		{
			try
			{
				lock.lockInterruptibly();
			} catch (InterruptedException ie)
			{
				Threads.possiblyHandleInterrupts(false);
				continue;
			}
			break;
		}
	}

	@Override
	public SubLLock toLock()
	{
		return this;
	}

	@Override
	public String printObject()
	{
		return "#<LOCK " + getName() + " @ " + this.hashCode(0) + ">";
	}

	@Override
	public String toTypeName()
	{
		return "LOCK";
	}
}
