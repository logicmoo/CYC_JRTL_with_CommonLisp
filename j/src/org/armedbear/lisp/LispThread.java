/*
 * LispThread.java
 *
 * Copyright (C) 2003-2004 Peter Graves
 * $Id: LispThread.java,v 1.48 2004-07-08 18:01:37 piso Exp $
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
    private static final Object lock = new Object();

    private static HashMap map = new HashMap();

    public static final LispThread currentThread() throws ConditionThrowable
    {
        Thread currentJavaThread = Thread.currentThread();
        LispThread lispThread = get(currentJavaThread);
        if (lispThread == null) {
            lispThread = new LispThread(currentJavaThread);
            put(currentJavaThread, lispThread);
        }
        return lispThread;
    }

    private static void put(Thread javaThread, LispThread lispThread)
    {
        synchronized (lock) {
            HashMap m = (HashMap) map.clone();
            m.put(javaThread, lispThread);
            map = m;
        }
    }

    private static LispThread get(Thread javaThread)
    {
        return (LispThread) map.get(javaThread);
    }

    private static void remove(Thread javaThread)
    {
        synchronized (lock) {
            HashMap m = (HashMap) map.clone();
            m.remove(javaThread);
            map = m;
        }
    }

    private final Thread javaThread;
    private boolean destroyed;
    private String name = "Anonymous thread" ;
    public Environment dynEnv;
    public LispObject[] _values;
    private boolean threadInterrupted;
    private LispObject pending = NIL;

    private LispThread(Thread javaThread)
    {
        this.javaThread = javaThread;
    }

    private LispThread(final Function fun, String name)
    {
        Runnable r = new Runnable() {
            public void run()
            {
                try {
                    funcall(fun, new LispObject[0], LispThread.this);
                }
                catch (ThreadDestroyed ignored) {
                    ; // Might happen.
                }
                catch (Throwable t) {
                    if (isInterrupted()) {
                        try {
                            processThreadInterrupts();
                        }
                        catch (ConditionThrowable c) {
                            Debug.trace(c);
                        }
                    }
                }
                finally {
                    remove(javaThread);
                }
            }
        };
        javaThread = new Thread(r);
        put(javaThread, this);
        this.name = name;
        javaThread.start();
    }

    public final synchronized boolean isDestroyed()
    {
        return destroyed;
    }

    private final synchronized boolean isInterrupted()
    {
        return threadInterrupted;
    }

    private final synchronized void setDestroyed(boolean b)
    {
        destroyed = b;
    }

    private final synchronized void interrupt(LispObject function, LispObject args)
    {
        pending = new Cons(args, pending);
        pending = new Cons(function, pending);
        threadInterrupted = true;
        javaThread.interrupt();
    }

    private final synchronized void processThreadInterrupts()
        throws ConditionThrowable
    {
        while (pending != NIL) {
            LispObject function = pending.car();
            LispObject args = pending.cadr();
            pending = pending.cddr();
            Primitives.APPLY.execute(function, args);
        }
        threadInterrupted = false;
    }

    public final LispObject[] getValues()
    {
        return _values;
    }

    public final LispObject[] getValues(LispObject result, int count)
    {
        if (_values == null) {
            LispObject[] values = new LispObject[count];
            if (count > 0)
                values[0] = result;
            for (int i = 1; i < count; i++)
                values[i] = NIL;
            return values;
        }
        // If the caller doesn't want any extra values, just return the ones
        // we've got.
        if (count <= _values.length)
            return _values;
        // The caller wants more values than we have. Pad with NILs.
        LispObject[] values = new LispObject[count];
        for (int i = _values.length; i-- > 0;)
            values[i] = _values[i];
        for (int i = _values.length; i < count; i++)
            values[i] = NIL;
        return values;
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
        } else
            _values = values;
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

    private LispObject catchTags = NIL;

    public void pushCatchTag(LispObject tag) throws ConditionThrowable
    {
        catchTags = new Cons(tag, catchTags);
    }

    public void popCatchTag() throws ConditionThrowable
    {
        if (catchTags != NIL)
            catchTags = catchTags.cdr();
        else
            Debug.assertTrue(false);
    }

    public void throwToTag(LispObject tag, LispObject result)
        throws ConditionThrowable
    {
        LispObject rest = catchTags;
        while (rest != NIL) {
            if (rest.car() == tag)
                throw new Throw(tag, result, this);
            rest = rest.cdr();
        }
        signal(new ControlError("Attempt to throw to the nonexistent tag " +
                                tag.writeToString() + "."));
    }

    private static final class Context
    {
        public final LispObject[] data;
        public final Context parent;

        public Context(LispObject[] data, Context parent)
        {
            this.data = data;
            this.parent = parent;
        }
    }

    private Context _context;

    public void pushContext(LispObject[] data)
    {
        _context = new Context(data, _context);
    }

    public void popContext()
    {
        if (_context != null)
            _context = _context.parent;
        else
            Debug.assertTrue(false);
    }

    // FIXME Only writeToString() throws ConditionThrowable...
    public LispObject getVariableValue(int index) throws ConditionThrowable
    {
        LispObject value = _context.data[index];
        if (value == null) {
            Debug.trace("getVariableValue(): value at index " + index + " is null");
            for (int i = 0; i < _context.data.length; i++) {
                LispObject obj = _context.data[i];
                Debug.trace("data[" + i + "] = " + (obj == null ? "null" : obj.writeToString()));
            }
            Debug.assertTrue(false);
        }
        return value;
    }

    public void setVariableValue(LispObject value, int index)
    {
        Debug.assertTrue(value != null);
        Debug.assertTrue(_context != null);
        _context.data[index] = value;
    }

    public LispObject callLocalFunction(LispObject function, LispObject[] args)
        throws ConditionThrowable
    {
        try {
            Debug.assertTrue(function != null);
            Debug.assertTrue(args != null);
            return function.execute(args);
        }
        finally {
            popContext();
        }
    }

    private static class StackFrame
    {
        private final LispObject functional;
        private final LispObject[] argv;

        public StackFrame(LispObject functional, LispObject[] argv)
        {
            this.functional = functional;
            this.argv = new LispObject[argv.length];
            for (int i = 0; i < argv.length; i++) {
                if (argv[i] == null) {
                    Debug.trace("argv[" + i + "] is null");
                    Debug.assertTrue(false);
                }
                this.argv[i] = argv[i];
            }
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
            getStandardOutput()._writeLine("stack depth = " + stack.size());
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
            try {
                int count = 0;
                Stream out =
                    checkCharacterOutputStream(_TRACE_OUTPUT_.symbolValue());
                out._writeLine("Evaluation stack:");
                out._finishOutput();
                for (int i = stack.size(); i-- > 0;) {
                    out._writeString("  ");
                    out._writeString(String.valueOf(stack.size() - 1 - i));
                    out._writeString(": ");
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
                    out._finishOutput();
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
                        for (int j = argv.length; j-- > 0;) {
                            if (argv[j] != null)
                                obj = new Cons(argv[j], obj);
                        }
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
        return result.nreverse();
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

    private static void pprint(LispObject obj, int indentBy, Stream stream)
        throws ConditionThrowable
    {
        if (stream.getCharPos() == 0) {
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < indentBy; i++)
                sb.append(' ');
            stream._writeString(sb.toString());
        }
        String raw = obj.writeToString();
        if (stream.getCharPos() + raw.length() < 80) {
            // It fits.
            stream._writeString(raw);
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
                    stream._writeString(sb.toString());
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
            stream._writeString(sb.toString());
            stream._writeString(raw);
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
    private static final Primitive MAKE_THREAD =
        new Primitive("make-thread", PACKAGE_EXT, true, "function &key name")
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            final int length = args.length;
            if (length == 0)
                signal(new WrongNumberOfArgumentsException(this));
            String name = "Anonymous thread"; // Default.
            if (length > 1) {
                if ((length - 1) % 2 != 0)
                    signal(new ProgramError("Odd number of keyword arguments."));
                if (length > 3)
                    signal(new WrongNumberOfArgumentsException(this));
                if (args[1] == Keyword.NAME)
                    name = args[2].getStringValue();
                else
                    signal(new ProgramError("Unrecognized keyword argument " +
                                            args[1].writeToString() + "."));
            }
            return new LispThread(checkFunction(args[0]), name);
        }
    };

    // ### thread-alive-p
    private static final Primitive1 THREAD_ALIVE_P =
        new Primitive1("thread-alive-p", PACKAGE_EXT, true, "thread")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return ((LispThread)arg).javaThread.isAlive() ? T : NIL;
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "Lisp thread"));
            }
        }
    };

    // ### thread-name
    private static final Primitive1 THREAD_NAME =
        new Primitive1("thread-name", PACKAGE_EXT, true, "thread")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            try {
                return new SimpleString (((LispThread)arg).name);
            }
            catch (ClassCastException e) {
                return signal(new TypeError(arg, "Lisp thread"));
            }
        }
    };

    // ### sleep
    private static final Primitive1 SLEEP = new Primitive1("sleep", "seconds")
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            double d =
                ((LispFloat)arg.multiplyBy(new LispFloat(1000))).getValue();
            if (d < 0)
                return signal(new TypeError(arg, "non-negative real"));
            long millis = d < Long.MAX_VALUE ? (long) d : Long.MAX_VALUE;
            try {
                Thread.currentThread().sleep(millis);
            }
            catch (InterruptedException e) {
                currentThread().processThreadInterrupts();
            }
            return NIL;
        }
    };

    // ### mapcar-threads
    private static final Primitive1 MAPCAR_THREADS =
        new Primitive1("mapcar-threads", PACKAGE_EXT, true)
    {
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
        new Primitive1("destroy-thread", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject arg) throws ConditionThrowable
        {
            if (arg instanceof LispThread) {
                LispThread thread = (LispThread) arg;
                thread.setDestroyed(true);
                return T;
            } else
                return signal(new TypeError(arg, "Lisp thread"));
        }
    };

    // ### interrupt-thread thread function &rest args => T
    // Interrupts thread and forces it to apply function to args. When the
    // function returns, the thread's original computation continues. If
    // multiple interrupts are queued for a thread, they are all run, but the
    // order is not guaranteed.
    private static final Primitive INTERRUPT_THREAD =
        new Primitive("interrupt-thread", PACKAGE_EXT, true)
    {
        public LispObject execute(LispObject[] args) throws ConditionThrowable
        {
            if (args.length < 2)
                return signal(new WrongNumberOfArgumentsException(this));
            if (args[0] instanceof LispThread) {
                LispThread thread = (LispThread) args[0];
                LispObject fun = args[1];
                LispObject funArgs = NIL;
                for (int i = args.length; i-- > 2;)
                    funArgs = new Cons(args[i], funArgs);
                thread.interrupt(fun, funArgs);
                return T;
            } else
                return signal(new TypeError(args[0], "Lisp thread"));
        }
    };

    // ### current-thread
    private static final Primitive0 CURRENT_THREAD =
        new Primitive0("current-thread", PACKAGE_EXT, true)
    {
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
                return signal(new WrongNumberOfArgumentsException(this));
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
                return signal(new WrongNumberOfArgumentsException(this));
            int count = args.length > 0 ? Fixnum.getValue(args[0]) : 0;
            LispThread thread = currentThread();
            return thread.backtraceAsList(count);
        }
    };
}
