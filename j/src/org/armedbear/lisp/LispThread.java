/*
 * LispThread.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LispThread.java,v 1.1 2003-04-27 16:07:13 piso Exp $
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

import java.util.HashMap;

public final class LispThread extends LispObject
{
  private static HashMap map = new HashMap();

  public static final LispThread currentThread()
  {
    Thread t = Thread.currentThread();
    synchronized (map)
      {
        LispThread thread = (LispThread) map.get(t);
        if (thread == null)
          {
            thread = new LispThread(t);
            map.put(t, thread);
          }
        return thread;
      }
  }

  private final Thread t;

  private LispThread(Thread t)
  {
    this.t = t;
  }

  private LispThread(final Function fun)
  {
    Runnable r = new Runnable()
    {
      public void run()
      {
        try
          {
            funcall(fun, null);
          }
        catch (Throwable t)
          {
            t.printStackTrace();
          }
      }
    };
    t = new Thread(r);
    t.start();
  }

  private Environment dynEnv;
  private LispObject[] _values;

  public final LispObject[] getValues()
  {
    return _values;
  }

  public final void setValues(LispObject[] array)
  {
    if (array == null)
      _values = null;
    else
      {
        _values = new LispObject[array.length];
        for (int i = array.length; i-- > 0;)
          _values[i] = array[i];
      }
  }

  public final void clearValues()
  {
    _values = null;
  }

  public final LispObject nothing()
  {
    _values = new LispObject[0];
    return NIL;
  }

  // Forces a single value, for situations where multiple values should be
  // ignored.
  public final LispObject value(LispObject obj)
  {
    _values = null;
    return obj;
  }

  public final Environment getDynamicEnvironment()
  {
    return dynEnv;
  }

  public final void setDynamicEnvironment(Environment env)
  {
    dynEnv = env;
  }

  public final void bindSpecial(Symbol symbol, LispObject value)
  {
    if (symbol.isSpecialVariable())
      {
        dynEnv = new Environment(dynEnv);
        dynEnv.bind(symbol, value);
      }
    else
        Debug.assertTrue(false);
  }

  public final LispObject lookupSpecial(LispObject symbol)
  {
    return dynEnv != null ? dynEnv.lookup(symbol) : null;
  }

  // ### make-thread
  private static final Primitive1 MAKE_THREAD = new Primitive1("make-thread")
  {
    public LispObject execute(LispObject arg) throws LispError
    {
      Function fun = checkFunction(arg);
      return new LispThread(fun);
    }
  };

  // ### sleep
  private static final Primitive1 SLEEP = new Primitive1("sleep")
  {
    public LispObject execute(LispObject arg) throws LispError
    {
      float f =
        ((LispFloat)arg.multiplyBy(new LispFloat((float)1000))).getValue();
      if (f < 0)
        throw new TypeError(arg, "non-negative real");
      long millis = f < Long.MAX_VALUE ? (long) f : Long.MAX_VALUE;
      try
        {
          Thread.currentThread().sleep(millis);
        }
      catch (InterruptedException e)
        {
          Debug.trace(e);
        }
      return NIL;
    }
  };
}
