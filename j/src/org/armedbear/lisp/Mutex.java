/*
 * Mutex.java
 *
 * Copyright (C) 2004 Peter Graves
 * $Id: Mutex.java,v 1.1 2004-09-09 12:41:29 piso Exp $
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

public final class Mutex extends LispObject
{
    private Thread owner;
    private int count;

    private void acquire() throws ConditionThrowable, InterruptedException
    {
        Thread currentThread = Thread.currentThread();
        if (currentThread == owner) {
            ++count;
        } else {
            synchronized (this) {
                try {
                    while (owner != null)
                        wait();
                    owner = currentThread;
                    count = 1;
                }
                catch (InterruptedException e) {
                    notify();
                    throw e;
                }
            }
        }
    }

    private void release() throws ConditionThrowable
    {
        if (Thread.currentThread() != owner)
            signal(new LispError("Attempt to release mutex by a thread other than its current owner."));
        synchronized (this) {
            if (--count == 0) {
                owner = null;
                notify();
            }
        }
    }

    public String writeToString()
    {
        return unreadableString("MUTEX");
    }

    // ### make-mutex => mutex
    private static final Primitive MAKE_MUTEX =
        new Primitive("make-mutex", PACKAGE_EXT, true, "")
    {
        public LispObject execute() throws ConditionThrowable
        {
            return new Mutex();
        }
    };

    // ### get-mutex mutex => generalized-boolean
    private static final Primitive GET_MUTEX =
        new Primitive("get-mutex", PACKAGE_EXT, true, "mutex")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                ((Mutex)arg).acquire();
                return T;
            }
            catch (ClassCastException e) {
                return signal(new TypeError("The value " + arg.writeToString() +
                                            " is not a mutex."));
            }
            catch (InterruptedException e) {
                return signal(new LispError(
                    "The thread " + LispThread.currentThread().writeToString() +
                    " was interrupted."));
            }
        }
    };

    // ### release-mutex mutex
    private static final Primitive RELEASE_MUTEX =
        new Primitive("release-mutex", PACKAGE_EXT, true, "mutex")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                ((Mutex)arg).release();
                return T;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg.writeToString() + " is not a mutex."));
            }
        }
    };
}
