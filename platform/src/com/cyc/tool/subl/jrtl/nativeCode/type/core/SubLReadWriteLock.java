//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Collection;
import java.util.concurrent.locks.ReentrantReadWriteLock;

import org.armedbear.lisp.Cons;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;

public class SubLReadWriteLock extends FromSubLisp implements SubLObject
{
	private class MyReentrantReadWriteLock extends ReentrantReadWriteLock
	{
		protected Thread myGetOwner()
		{
			return getOwner();
		}

		protected SubLThread mySubLGetOwner()
		{
			return SubLThread.intoSubLThread(myGetOwner());
		}

		protected Collection<Thread> myGetQueuedThreads()
		{
			return getQueuedThreads();
		}
	}

	SubLReadWriteLock(SubLString name)
	{
		nativeReadWriteLock = new MyReentrantReadWriteLock();
		this.name = name;
	}

	private SubLString name;
	private MyReentrantReadWriteLock nativeReadWriteLock;
	public static String READ_WRITE_LOCK_TYPE_NAME = "READ-WRITE-LOCK";
	public static SubLSymbol READ_WRITE_LOCK_TYPE_SYMBOL;
	static
	{
		READ_WRITE_LOCK_TYPE_SYMBOL = SubLSymbolFactory.makeSymbol("READ-WRITE-LOCK", SubLPackage.SUBLISP_PACKAGE);
	}

	@Override
	public boolean canFastHash()
	{
		return true;
	}

	public SubLString getName()
	{
		return name.toStr();
	}

	public SubLString getSubLName()
	{
		return name;
	}

	@Override
	public SubLSymbol getType()
	{
		return SubLReadWriteLock.READ_WRITE_LOCK_TYPE_SYMBOL;
	}

	@Override
	public SubLFixnum getTypeCode()
	{
		Errors.unimplementedMethod("SubLReadWriteLock.getTypeCode()");
		return CommonSymbols.ZERO_INTEGER;
	}

	public SubLObject getWaiters()
	{
		SubLObject result = SubLNil.NIL;
		try
		{
			Collection<Thread> threads = nativeReadWriteLock.myGetQueuedThreads();
			for (Thread thread : threads)
				result = new Cons(SubLThread.intoSubLThread(thread).getSubLProcess(), result);
		} catch (Exception ex)
		{
		}
		return result;
	}

	public SubLObject getWriter()
	{
		SubLObject result = SubLNil.NIL;
		try
		{
			Thread thread = nativeReadWriteLock.myGetOwner();
			result = SubLThread.intoSubLThread(thread).getSubLProcess();
		} catch (Exception ex)
		{
		}
		return result;
	}

	@Override
	public int hashCode(int currentDepth)
	{
		if (currentDepth < 8) return superHash();
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
		return false;
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
		return true;
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

	public void releaseReadLock()
	{
		nativeReadWriteLock.readLock().unlock();
	}

	public void releaseWriteLock()
	{
		nativeReadWriteLock.writeLock().unlock();
	}

	public void seizeReadLock()
	{
		while (true)
		{
			try
			{
				nativeReadWriteLock.readLock().lockInterruptibly();
			} catch (InterruptedException ie)
			{
				Threads.possiblyHandleInterrupts(false);
				continue;
			}
			break;
		}
	}

	public void seizeWriteLock()
	{
		while (true)
		{
			try
			{
				nativeReadWriteLock.writeLock().lockInterruptibly();
			} catch (InterruptedException ie)
			{
				Threads.possiblyHandleInterrupts(false);
				continue;
			}
			break;
		}
	}

	@Override
	public SubLReadWriteLock toReadWriteLock()
	{
		return this;
	}

	@Override
	public String printObjectImpl()
	{
		checkUnreadableOk();
		return "#<" + toTypeName() + " " + getName() + " @ " + this.hashCode(0) + ">";
	}

	@Override
	public String toTypeName()
	{
		return "READ-WRITE-LOCK";
	}
}
