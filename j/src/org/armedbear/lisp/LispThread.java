/*
 * LispThread.java
 *
 * Copyright (C) 2003 Peter Graves
 * $Id: LispThread.java,v 1.26 2003-12-09 20:26:22 asimon Exp $
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
import java.util.Iterator;
import java.util.Stack;

public final class LispThread extends LispObject
{
    private static HashMap map = new HashMap();
    private static Object lock = new Object();

    public static final LispThread currentThread()
    {
        Thread t = Thread.currentThread();
        LispThread thread = get(t);
        if (thread == null) {
            thread = new LispThread(t);
            put(t, thread);
        }
        return thread;
    }

    private static void put(Thread t, LispThread thread)
    {
        synchronized (lock) {
            HashMap m = (HashMap) map.clone();
            m.put(t, thread);
            map = m;
        }
    }

    private static LispThread get(Thread t)
    {
        return (LispThread) map.get(t);
    }

    private static void remove(Thread t)
    {
        synchronized (lock) {
            HashMap m = (HashMap) map.clone();
            m.remove(t);
            map = m;
        }
    }

    private final Thread t;

    private LispThread(Thread t)
    {
        this.t = t;
    }

    private LispThread(final Function fun)
    {
        Runnable r = new Runnable() {
            public void run()
            {
                try {
                    funcall(fun, new LispObject[0], LispThread.this);
                }
                catch (Throwable t) {
                    t.printStackTrace();
                }
                finally {
                    remove(t);
                }
            }
        };
        t = new Thread(r);
        put(t, this);
        t.start();
    }

    private boolean destroyed;
    private Environment dynEnv;
    private LispObject[] _values;

    public final synchronized boolean isDestroyed()
    {
        return destroyed;
    }

    private final synchronized void setDestroyed(boolean b)
    {
        destroyed = b;
    }

    public final LispObject[] getValues()
    {
        return _values;
    }

    public final LispObject setValues()
    {
        _values = new LispObject[0];
        return NIL;
    }

    public final LispObject setValues(LispObject value1)
    {
        _values = null;
        return value1;
    }

    public final LispObject setValues(LispObject value1, LispObject value2)
    {
        _values = new LispObject[2];
        _values[0] = value1;
        _values[1] = value2;
        return value1;
    }

    public final LispObject setValues(LispObject value1, LispObject value2,
                                      LispObject value3)
    {
        _values = new LispObject[3];
        _values[0] = value1;
        _values[1] = value2;
        _values[2] = value3;
        return value1;
    }

    public final LispObject setValues(LispObject[] values)
    {
        if (values == null) {
            Debug.assertTrue(false);
            _values = null;
        } else {
            _values = new LispObject[values.length];
            for (int i = values.length; i-- > 0;)
                _values[i] = values[i];
        }
        return values.length > 0 ? values[0] : NIL;
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
        dynEnv = new Environment(dynEnv);
        dynEnv.bind(symbol, value);
    }

    public final LispObject lookupSpecial(LispObject symbol)
    {
        return dynEnv != null ? dynEnv.lookup(symbol) : null;
    }

    private Stack catchTags = new Stack();

    public void pushCatchTag(LispObject tag)
    {
        catchTags.push(tag);
    }

    public LispObject popCatchTag()
    {
        if (!catchTags.empty())
            return (LispObject) catchTags.pop();
        Debug.assertTrue(false);
        return null;
    }

    public boolean isValidCatchTag(LispObject tag)
    {
        for (int i = catchTags.size(); i-- > 0;) {
            if (catchTags.get(i) == tag)
                return true;
        }
        return false;
    }

    private static class StackFrame
    {
        private final LispObject functional;
        private final LispObject[] argv;

        public StackFrame(LispObject functional, LispObject[] argv)
        {
            this.functional = functional;
            this.argv = argv;
        }

        public LispObject getFunctional()
        {
            return functional;
        }

        public LispObject[] getArgumentVector()
        {
            return argv;
        }
    }

    private final Stack stack = new Stack();

    public void pushStackFrame(LispObject fun, LispObject[] args)
    {
        stack.push(new StackFrame(fun, args));
    }

    public void popStackFrame()
    {
        if (!stack.empty())
            stack.pop();
    }

    public int getStackDepth()
    {
        return stack.size();
    }

    public void setStackDepth(int depth)
    {
        stack.setSize(depth);
    }

    public void resetStack()
    {
        stack.clear();
    }

    public void checkStack() throws ConditionThrowable
    {
        if (stack.size() > 0) {
            getStandardOutput().writeLine("stack depth = " + stack.size());
            backtrace();
        }
    }

    public void backtrace()
    {
        backtrace(0);
    }

    public void backtrace(int limit)
    {
        if (stack.size() > 0) {
            CharacterOutputStream out = getTraceOutput();
            int count = 0;
            try {
                out.writeLine("Evaluation stack:");
                out.flushOutput();
                for (int i = stack.size(); i-- > 0;) {
                    out.writeString("  ");
                    out.writeString(String.valueOf(stack.size() - 1 - i));
                    out.writeString(": ");
                    StackFrame frame = (StackFrame) stack.get(i);
                    LispObject obj = NIL;
                    LispObject[] argv = frame.getArgumentVector();
                    for (int j = argv.length; j-- > 0;)
                        obj = new Cons(argv[j], obj);
                    LispObject functional = frame.getFunctional();
                    if (functional instanceof Functional &&
                        ((Functional)functional).getLambdaName() != null)
                        obj = new Cons(((Functional)functional).getLambdaName(), obj);
                    else
                        obj = new Cons(functional, obj);
                    pprint(obj, out.getCharPos(), out);
                    out.terpri();
                    out.flushOutput();
                    if (limit > 0 && ++count == limit)
                        break;
                }
            }
            catch (Throwable t) {
                t.printStackTrace();
            }
        }
    }

    public LispObject backtraceAsList(int limit) throws ConditionThrowable
    {
        LispObject result = NIL;
        if (stack.size() > 0) {
            int count = 0;
            try {
                for (int i = stack.size(); i-- > 0;) {
                    StackFrame frame = (StackFrame) stack.get(i);
                    if (frame != null) {
                        LispObject obj = NIL;
                        LispObject[] argv = frame.getArgumentVector();
                        for (int j = argv.length; j-- > 0;)
                            obj = new Cons(argv[j], obj);
                        LispObject functional = frame.getFunctional();
                        if (functional instanceof Functional &&
                            ((Functional)functional).getLambdaName() != null)
                            obj = new Cons(((Functional)functional).getLambdaName(), obj);
                        else
                            obj = new Cons(functional, obj);
                        result = new Cons(obj, result);
                        if (limit > 0 && ++count == limit)
                            break;
                    }
                }
            }
            catch (Throwable t) {
                t.printStackTrace();
            }
        }
        return Primitives.NREVERSE.execute(result);
    }

    public void saveBacktrace() throws ConditionThrowable
    {
        _SAVED_BACKTRACE_.setSymbolValue(backtraceAsList(0));
    }

    public void incrementCallCounts()
    {
        for (int i = stack.size(); i-- > 0;) {
            StackFrame frame = (StackFrame) stack.get(i);
            if (frame != null) {
                LispObject functional = frame.getFunctional();
                if (functional != null)
                    functional.incrementCallCount();
            }
        }
    }

    private static void pprint(LispObject obj, int indentBy,
        CharacterOutputStream stream) throws ConditionThrowable
    {
        if (stream.getCharPos() == 0) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < indentBy; i++)
                sb.append(' ');
            stream.writeString(sb.toString());
        }
        String raw = String.valueOf(obj);
        if (stream.getCharPos() + raw.length() < 80) {
            // It fits.
            stream.writeString(raw);
            return;
        }
        // Object doesn't fit.
        if (obj instanceof Cons) {
            try {
                boolean newlineBefore = false;
                LispObject[] array = obj.copyToArray();
                if (array.length > 0) {
                    LispObject first = array[0];
                    if (first == Symbol.LET) {
                        newlineBefore = true;
                    }
                }
                int charPos = stream.getCharPos();
                if (newlineBefore && charPos != indentBy) {
                    stream.terpri();
                    charPos = stream.getCharPos();
                }
                if (charPos < indentBy) {
                    StringBuffer sb = new StringBuffer();
                    for (int i = charPos; i < indentBy; i++)
                        sb.append(' ');
                    stream.writeString(sb.toString());
                }
                stream.print('(');
                for (int i = 0; i < array.length; i++) {
                    pprint(array[i], indentBy + 2, stream);
                    if (i < array.length - 1)
                        stream.print(' ');
                }
                stream.print(')');
            }
            catch (ConditionThrowable t) {
                Debug.trace(t);
            }
        } else {
            stream.terpri();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < indentBy; i++)
                sb.append(' ');
            stream.writeString(sb.toString());
            stream.writeString(raw);
            return;
        }
    }

    public String toString()
    {
        StringBuffer sb = new StringBuffer("#<THREAD @ #x");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(">");
        return sb.toString();
    }

    // ### make-thread
    private static final Primitive1 MAKE_THREAD =
        new Primitive1("make-thread", PACKAGE_EXT, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Function fun = checkFunction(arg);
            return new LispThread(fun);
        }
    };

    // ### sleep
    private static final Primitive1 SLEEP = new Primitive1("sleep","seconds") {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            double d =
                ((LispFloat)arg.multiplyBy(new LispFloat(1000))).getValue();
            if (d < 0)
                throw new ConditionThrowable(new TypeError(arg, "non-negative real"));
            long millis = d < Long.MAX_VALUE ? (long) d : Long.MAX_VALUE;
            try {
                Thread.currentThread().sleep(millis);
            }
            catch (InterruptedException e) {
                Debug.trace(e);
            }
            return NIL;
        }
    };

    // ### mapcar-threads
    private static final Primitive1 MAPCAR_THREADS =
        new Primitive1("mapcar-threads", PACKAGE_EXT, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            Function fun = checkFunction(arg);
            final LispThread thread = LispThread.currentThread();
            LispObject result = NIL;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                LispObject[] args = new LispObject[1];
                args[0] = (LispThread) it.next();
                result = new Cons(funcall(fun, args, thread), result);
            }
            return result;
        }
    };

    // ### destroy-thread
    private static final Primitive1 DESTROY_THREAD =
        new Primitive1("destroy-thread", PACKAGE_EXT, true) {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispThread) {
                LispThread thread = (LispThread) arg;
                thread.setDestroyed(true);
                return T;
            } else
                throw new ConditionThrowable(new TypeError(arg, "Lisp thread"));
        }
    };

    // ### current-thread
    private static final Primitive0 CURRENT_THREAD =
        new Primitive0("current-thread", PACKAGE_EXT, true) {
        public LispObject execute() throws ConditionThrowable
        {
            return currentThread();
        }
    };

    // ### backtrace
    private static final Primitive BACKTRACE =
        new Primitive("backtrace", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject[] args)
            throws ConditionThrowable
        {
            if (args.length > 1)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            int count = args.length > 0 ? Fixnum.getValue(args[0]) : 0;
            LispThread thread = currentThread();
            thread.backtrace(count);
            return thread.nothing();
        }
    };

    // ### backtrace-as-list
    private static final Primitive BACKTRACE_AS_LIST =
        new Primitive("backtrace-as-list", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject[] args)
            throws ConditionThrowable
        {
            if (args.length > 1)
                throw new ConditionThrowable(new WrongNumberOfArgumentsException(this));
            int count = args.length > 0 ? Fixnum.getValue(args[0]) : 0;
            LispThread thread = currentThread();
            return thread.backtraceAsList(count);
        }
    };
}
