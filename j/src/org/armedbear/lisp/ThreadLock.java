/*
 * ThreadLock.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: ThreadLock.java,v 1.1 2004-06-03 21:33:46 asimon Exp $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package org.armedbear.lisp;

public final class ThreadLock extends LispObject
{

    private LispThread thread;

    private void lock() throws ConditionThrowable 
    {
        LispThread currentThread = LispThread.currentThread();
        if (!currentThread.equals(thread)) {
            while (thread != null) {
                synchronized(this) {
                    try {
                        wait();
                    } catch(InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
            thread = currentThread;
        } 
    }


    private void unlock() throws ConditionThrowable 
    {
        if (thread.equals(LispThread.currentThread())) {
            synchronized(this) {
                thread = null;
                notifyAll();
            } 
        }
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<THREAD-LOCK @ #x");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(">");
        return sb.toString();
    }


    // ### make-thread-lock
    private static final Primitive0 MAKE_THREAD_LOCK =
        new Primitive0("make-thread-lock", PACKAGE_EXT, true)
    {
        public LispObject execute() throws ConditionThrowable
        {
            return new ThreadLock();
        }
    };

    // ### thread-lock lock
    private static final Primitive1 THREAD_LOCK =
        new Primitive1("thread-lock", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            ThreadLock threadLock = (ThreadLock) arg;
            threadLock.lock();
            return NIL;
        }
    };

    // ### thread-unlock lock
    private static final Primitive1 THREAD_UNLOCK =
        new Primitive1("thread-unlock", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            ThreadLock threadLock = (ThreadLock) arg;
            threadLock.unlock();
            return NIL;
        }
    };
}
