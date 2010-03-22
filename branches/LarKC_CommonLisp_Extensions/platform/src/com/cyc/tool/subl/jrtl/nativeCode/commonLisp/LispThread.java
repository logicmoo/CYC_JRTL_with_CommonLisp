/*
 * LispThread.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: LispThread.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Lisp.*;
import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public final class LispThread extends AbstractLispObject implements UncaughtExceptionHandler
{
  static ArrayList<LispThread> threads = new ArrayList<LispThread>();
	public static LispThread firstThread = new LispThread(Thread.currentThread()); 

	public void uncaughtException(Thread t, Throwable e) {		
		bubbble.uncaughtException(t, e);		
	}
    static boolean use_fast_calls = false;

    // use a concurrent hashmap: we may want to add threads
    // while at the same time iterating the hash
//    final static ConcurrentHashMap<Thread,LispThread> map =
//       new ConcurrentHashMap<Thread,LispThread>();
//
//    private static ThreadLocal<LispThread> threads = new ThreadLocal<LispThread>(){
//        @Override
//        public LispThread initialValue() {
//            Thread thisThread = Thread.currentThread();
//            LispThread thread = LispThread.map.get(thisThread);
//            if (thread == null) {
//                thread = new LispThread(thisThread);
//                LispThread.map.put(thisThread,thread);
//            }
//            return thread;
//        }
//    };
    
    public static final LispThread currentThread()
    {
    	//if (true) return 
    	return (LispThread) Thread.currentThread().getUncaughtExceptionHandler();
//    	Thread jt = Thread.currentThread();
//    	UncaughtExceptionHandler eh  = jt.getUncaughtExceptionHandler();
//    	if (eh instanceof LispThread) return (LispThread)eh;
//    	Thread.dumpStack();
//    	return null;
        //return threads.get();
    }

    final Thread javaThread;
    private boolean destroyed;
    final SubLObject name;
    public SubLObject[] _values;
    private boolean threadInterrupted;
    private SubLObject pending = null;

		protected UncaughtExceptionHandler bubbble;

    LispThread(Thread javaThread)
    {
        this.javaThread = javaThread;
        threads.add(this);
        this.bubbble = javaThread.getUncaughtExceptionHandler();
        if (bubbble instanceof LispThread) {
        	System.err.println("Bubble is a lisp thread!");
        }
        javaThread.setUncaughtExceptionHandler(this);
        name = makeString(javaThread.getName());
    }

    LispThread(final Function fun, SubLObject name)
    {
        Runnable r = new Runnable() {
            public void run()
            {
                try {
                    funcall(fun, makeLispObjectArray(0), LispThread.this);
                }
                catch (ThreadDestroyed ignored) {
                      // Might happen.
                }
                catch (Throwable t) { // any error: process thread interrupts
                    if (isInterrupted()) {
                        processThreadInterrupts();
                    }
                }
                finally {
                    // make sure the thread is *always* removed from the hash again
                    //map.remove(Thread.currentThread());
                	Thread.currentThread().setUncaughtExceptionHandler(LispThread.this.bubbble);
                	threads.remove(LispThread.this);
                }
            }
        };
        javaThread = new Thread(r);
        this.bubbble = javaThread.getUncaughtExceptionHandler();
        if (bubbble instanceof LispThread) {
        	System.err.println("Bubble is a lisp thread!");
        }
        javaThread.setUncaughtExceptionHandler(this);
        this.add(this);
        this.name = name;
        //map.put(javaThread, this);
        if (name != NIL)
            javaThread.setName(name.getString());
        javaThread.setDaemon(true);
        javaThread.start();
    }

    public StackTraceElement[] getJavaStackTrace() {
        return javaThread.getStackTrace();
    }

    @Override
    public SubLObject typeOf()
    {
        return LispSymbols.THREAD;
    }

    @Override
    public SubLObject classOf()
    {
        return BuiltInClass.THREAD;
    }

    @Override
    public SubLObject typep(SubLObject typeSpecifier)
    {
        if (typeSpecifier == LispSymbols.THREAD)
            return T;
        if (typeSpecifier == BuiltInClass.THREAD)
            return T;
        return super.typep(typeSpecifier);
    }

    public final synchronized boolean isDestroyed()
    {
        return destroyed;
    }

    final synchronized boolean isInterrupted()
    {
        return threadInterrupted;
    }

    final synchronized void setDestroyed(boolean b)
    {
        destroyed = b;
    }

    final synchronized void interrupt(SubLObject function, SubLObject args)
    {
  		if (pending==null) pending = NIL;
        pending = makeCons(args, pending);
        pending = makeCons(function, pending);
        threadInterrupted = true;
        javaThread.interrupt();
    }

    final synchronized void processThreadInterrupts()

    {
  		if (pending==null) pending = NIL;
        while (pending != Nil.NIL) {
            SubLObject function = pending.first();
            SubLObject args = pending.second();
            pending = pending.cddr();
            Primitives.APPLY.execute(function, args);
        }
        threadInterrupted = false;
    }

    public final SubLObject[] getValues()
    {
        return _values;
    }

    public final SubLObject[] getValues(SubLObject result, int count)
    {
        if (_values == null) {
            SubLObject[] values = makeLispObjectArray(count);
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
        SubLObject[] values = makeLispObjectArray(count);
        for (int i = _values.length; i-- > 0;)
            values[i] = _values[i];
        for (int i = _values.length; i < count; i++)
            values[i] = NIL;
        return values;
    }

    // Used by the JVM compiler for MULTIPLE-VALUE-CALL.
    public final SubLObject[] accumulateValues(SubLObject result,
                                               SubLObject[] oldValues)
    {
        if (oldValues == null) {
            if (_values != null)
                return _values;
            SubLObject[] values = makeLispObjectArray(1);
            values[0] = result;
            return values;
        }
        if (_values != null) {
            if (_values.length == 0)
                return oldValues;
            final int totalLength = oldValues.length + _values.length;
            SubLObject[] values = makeLispObjectArray(totalLength);
            System.arraycopy(oldValues, 0,
                             values, 0,
                             oldValues.length);
            System.arraycopy(_values, 0,
                             values, oldValues.length,
                             _values.length);
            return values;
        }
        // _values is null.
        final int totalLength = oldValues.length + 1;
        SubLObject[] values = makeLispObjectArray(totalLength);
        System.arraycopy(oldValues, 0,
                         values, 0,
                         oldValues.length);
        values[totalLength - 1] = result;
        return values;
    }

    public final SubLObject setValues()
    {
        _values = makeLispObjectArray(0);
        return NIL;
    }

    public final SubLObject setValues(SubLObject value1)
    {
        _values = null;
        return value1;
    }

    public final SubLObject setValues(SubLObject value1, SubLObject value2)
    {
        _values = makeLispObjectArray(2);
        _values[0] = value1;
        _values[1] = value2;
        return value1;
    }

    public final SubLObject setValues(SubLObject value1, SubLObject value2,
                                      SubLObject value3)
    {
        _values = makeLispObjectArray(3);
        _values[0] = value1;
        _values[1] = value2;
        _values[2] = value3;
        return value1;
    }

    public final SubLObject setValues(SubLObject value1, SubLObject value2,
                                      SubLObject value3, SubLObject value4)
    {
        _values = makeLispObjectArray(4);
        _values[0] = value1;
        _values[1] = value2;
        _values[2] = value3;
        _values[3] = value4;
        return value1;
    }

    public final SubLObject setValues(SubLObject[] values)
    {
        switch (values.length) {
            case 0:
                _values = values;
                return NIL;
            case 1:
                _values = null;
                return values[0];
            default:
                _values = values;
                return values[0];
        }
    }

    public final void clearValues()
    {
        _values = null;
    }

    public final SubLObject nothing()
    {
        _values = makeLispObjectArray(0);
        return NIL;
    }

    // Forces a single value, for situations where multiple values should be
    // ignored.
    public final SubLObject value(SubLObject obj)
    {
        _values = null;
        return obj;
    }



    final static int UNASSIGNED_SPECIAL_INDEX = 0;

    /** Indicates the last special slot which has been assigned.
     * Symbols which don't have a special slot assigned use a slot
     * index of 0 for efficiency reasons: it eliminates the need to
     * check for index validity before accessing the specials array.
     *
     */
    final static AtomicInteger lastSpecial
        = new AtomicInteger(UNASSIGNED_SPECIAL_INDEX);

    /** This array stores the current special binding for every symbol
     * which has been globally or locally declared special.
     *
     * If the array element has a null value, this means there currently
     * is no active binding. If the array element contains a valid
     * SpecialBinding object, but the value field of it is null, that
     * indicates an "UNBOUND VARIABLE" situation.
     */
    final SpecialBinding[] specials = new SpecialBinding[4097];

    /** This array stores the symbols associated with the special
     * bindings slots.
     */
    final static SubLSymbol[] specialNames = new SubLSymbol[4097];

    /** This variable points to the head of a linked list of saved
     * special bindings. Its main purpose is to allow a mark/reset
     * interface to special binding and unbinding.
     */
    private SpecialBindingsMark savedSpecials = null;

    /** Marks the state of the special bindings,
     * for later rewinding by resetSpecialBindings().
     */
    public final SpecialBindingsMark markSpecialBindings() {
        return savedSpecials;
    }

    /** Restores the state of the special bindings to what
     * was captured in the marker 'mark' by a call to markSpecialBindings().
     */
    public final void resetSpecialBindings(SpecialBindingsMark mark) {
        SpecialBindingsMark c = savedSpecials;
        while (mark != c) {
            specials[c.idx] = c.binding;
            c = c.next;
        }
        savedSpecials = c;
    }

    /** Clears out all active special bindings including any marks
     * previously set. Invoking resetSpecialBindings() with marks
     * set before this call results in undefined behaviour.
     */
    // Package level access: only for Interpreter.run()
    final void clearSpecialBindings() {
        resetSpecialBindings(null);
    }

    /** Assigns a specials array index number to the symbol,
     * if it doesn't already have one.
     */
    private static final void assignSpecialIndex(SubLSymbol osym)
    {
    	SubLSymbol sym = (SubLSymbol)osym;
    	int specialIndex = sym.getSpecialIndex();
        if (specialIndex != 0)
            return;

        synchronized (sym) {
            // Don't use an atomic access: we'll be swapping values only once.
            if (specialIndex == 0) {
            	  int n = lastSpecial.incrementAndGet();
                sym.setSpecialIndex(n);
                specialNames[n] = sym;
            }
        }
    }

    public final SpecialBinding bindSpecial(SubLSymbol name, SubLObject value)
    {
        int idx;

        assignSpecialIndex(name);
        SpecialBinding binding = specials[idx = ((SubLSymbol)name).getSpecialIndex()];
        savedSpecials = new SpecialBindingsMark(idx, binding, savedSpecials);
        return specials[idx] = new SpecialBinding(idx, value);
    }

    public final SpecialBinding bindSpecialToCurrentValue(SubLSymbol name)
    {
        int idx;

        assignSpecialIndex(name);
        SpecialBinding binding = specials[idx = ((SubLSymbol)name).getSpecialIndex()];
        savedSpecials = new SpecialBindingsMark(idx, binding, savedSpecials);
        return specials[idx]
            = new SpecialBinding(idx,
                                 (binding == null) ?
                                 name.getSymbolValue() : binding.value);
    }

    /** Looks up the value of a special binding in the context of the
     * given thread.
     *
     * In order to find the value of a special variable (in general),
     * use {@link SubLSymbol#symbolValue}.
     *
     * @param name The name of the special variable, normally a symbol
     * @return The inner most binding of the special, or null if unbound
     *
     * @see SubLSymbol#symbolValue
     */
    public final SubLObject lookupSpecial(SubLSymbol name)
    {
        SpecialBinding binding = specials[((SubLSymbol)name).getSpecialIndex()];
        return (binding == null) ? null : binding.value;
    }

    public final SpecialBinding getSpecialBinding(SubLSymbol name)
    {
        return specials[((SubLSymbol)name).getSpecialIndex()];
    }

    public final SubLObject setSpecialVariable(SubLSymbol name, SubLObject value)
    {
        SpecialBinding binding = specials[((SubLSymbol)name).getSpecialIndex()];
        if (binding != null)
            return binding.value = value;

        name.setSymbolValue(value);
        return value;
    }

    public final SubLObject pushSpecial(SubLSymbol name, SubLObject thing)

    {
        SpecialBinding binding = specials[((SubLSymbol)name).getSpecialIndex()];
        if (binding != null)
            return binding.value = makeCons(thing, binding.value);

        SubLObject value = name.getSymbolValue();
        if (value != null) {
            SubLObject newValue = makeCons(thing, value);
            name.setSymbolValue(newValue);
            return newValue;
        } else
            return error(new UnboundVariable(name));
    }

    // Returns symbol value or NIL if unbound.
    public final SubLObject safeSymbolValue(SubLSymbol name)
    {
        SpecialBinding binding = specials[((SubLSymbol)name).getSpecialIndex()];
        if (binding != null)
            return binding.value;

        SubLObject value = name.getSymbolValue();
        return value != null ? value : NIL;
    }

    public final void rebindSpecial(SubLSymbol name, SubLObject value)
    {
        SpecialBinding binding = getSpecialBinding(name);
        binding.value = value;
    }

    private SubLObject catchTags = null;

    public void pushCatchTag(SubLObject tag)
    {
    	if (catchTags==null) catchTags = NIL;
        catchTags = makeCons(tag, catchTags);
    }

    public void popCatchTag()
    {
    	if (catchTags==null) catchTags = NIL;
        if (catchTags != NIL)
            catchTags = catchTags.rest();
        else
            Debug.assertTrue(false);
    }

    public void throwToTag(SubLObject tag, SubLObject result)

    {
    	if (catchTags==null) catchTags = NIL;
        SubLObject rest = catchTags;
        while (rest != NIL) {
            if (rest.first() == tag)
                throw new Throw(tag, result, this);
            rest = rest.rest();
        }
        error(new ControlError("Attempt to throw to the nonexistent tag " +
                                tag.writeToString() + "."));
    }


    private StackFrame stack = null;

    @Deprecated
    public SubLObject getStack()
    {
        return NIL;
    }

    @Deprecated
    public void setStack(SubLObject stack)
    {
    }

    public final void pushStackFrame(StackFrame frame)
    {
	frame.setNext(stack);
	stack = frame;
  if (profiling)
    if (!sampling)
    	frame.incrementCalls();
    }


    public final void popStackFrame()
    {
        if (stack != null)
            stack = stack.getNext();
    }

    public void resetStack()
    {
        stack = null;
    }

    @Override
    public SubLObject execute(SubLObject function)
    {
        if (use_fast_calls)
            return function.execute();

        pushStackFrame(new LispStackFrame(function));
        try {
            return function.execute();
        }
        finally {
            popStackFrame();
        }
    }

    @Override
    public SubLObject execute(SubLObject function, SubLObject arg)

    {
        if (use_fast_calls)
            return function.execute(arg);

        pushStackFrame(new LispStackFrame(function, arg));
        try {
            return function.execute(arg);
        }
        finally {
            popStackFrame();
        }
    }

    @Override
    public SubLObject execute(SubLObject function, SubLObject first,
                              SubLObject second)

    {
        if (use_fast_calls)
            return function.execute(first, second);

        pushStackFrame(new LispStackFrame(function, first, second));
        try {
            return function.execute(first, second);
        }
        finally {
            popStackFrame();
        }
    }

    @Override
    public SubLObject execute(SubLObject function, SubLObject first,
                              SubLObject second, SubLObject third)

    {
        if (use_fast_calls)
            return function.execute(first, second, third);

        pushStackFrame(new LispStackFrame(function, first, second, third));
        try {
            return function.execute(first, second, third);
        }
        finally {
            popStackFrame();
        }
    }

    @Override
    public SubLObject execute(SubLObject function, SubLObject first,
                              SubLObject second, SubLObject third,
                              SubLObject fourth)

    {
        if (use_fast_calls)
            return function.execute(first, second, third, fourth);

        pushStackFrame(new LispStackFrame(function, first, second, third, fourth));
        try {
            return function.execute(first, second, third, fourth);
        }
        finally {
            popStackFrame();
        }
    }

    @Override
    public SubLObject execute(SubLObject function, SubLObject first,
                              SubLObject second, SubLObject third,
                              SubLObject fourth, SubLObject fifth)

    {
        if (use_fast_calls)
            return function.execute(first, second, third, fourth, fifth);

        pushStackFrame(new LispStackFrame(function, first, second, third, fourth, fifth));
        try {
            return function.execute(first, second, third, fourth, fifth);
        }
        finally {
            popStackFrame();
        }
    }

    @Override
    public SubLObject execute(SubLObject function, SubLObject first,
                              SubLObject second, SubLObject third,
                              SubLObject fourth, SubLObject fifth,
                              SubLObject sixth)

    {
        if (use_fast_calls)
            return function.execute(first, second, third, fourth, fifth, sixth);

        pushStackFrame(new LispStackFrame(function, first, second, 
					  third, fourth, fifth, sixth));
        try {
            return function.execute(first, second, third, fourth, fifth, sixth);
        }
        finally {
            popStackFrame();
        }
    }

    @Override
    public SubLObject execute(SubLObject function, SubLObject first,
                              SubLObject second, SubLObject third,
                              SubLObject fourth, SubLObject fifth,
                              SubLObject sixth, SubLObject seventh)

    {
        if (use_fast_calls)
            return function.execute(first, second, third, fourth, fifth, sixth,
                                    seventh);

        pushStackFrame(new LispStackFrame(function, first, second, third, 
					  fourth, fifth, sixth, seventh));
        try {
            return function.execute(first, second, third, fourth, fifth, sixth,
                                    seventh);
        }
        finally {
            popStackFrame();
        }
    }

    public SubLObject execute(SubLObject function, SubLObject first,
                              SubLObject second, SubLObject third,
                              SubLObject fourth, SubLObject fifth,
                              SubLObject sixth, SubLObject seventh,
                              SubLObject eighth)

    {
        if (use_fast_calls)
            return function.execute(first, second, third, fourth, fifth, sixth,
                                    seventh, eighth);

        pushStackFrame(new LispStackFrame(function, first, second, third, 
					  fourth, fifth, sixth, seventh, eighth));
        try {
            return function.execute(first, second, third, fourth, fifth, sixth,
                                    seventh, eighth);
        }
        finally {
            popStackFrame();
        }
    }

    public SubLObject execute(SubLObject function, SubLObject[] args)

    {
        if (use_fast_calls)
            return function.execute(args);

        pushStackFrame(new LispStackFrame(function, args));
        try {
            return function.execute(args);
        }
        finally {
            popStackFrame();
        }
    }

    public void printBacktrace()
    {
        printBacktrace(0);
    }

    public void printBacktrace(int limit)
    {
        if (stack != null) {
            int count = 0;
            LispStream out =
                checkCharacterOutputStream(LispSymbols.TRACE_OUTPUT.symbolValue());
            out._writeLine("Evaluation stack:");
            out._finishOutput();

            StackFrame s = stack;
            while (s != null) {
                out._writeString("  ");
                out._writeString(String.valueOf(count));
                out._writeString(": ");

                pprint(s.toLispList(), out.getCharPos(), out);
                out.terpri();
                out._finishOutput();
                if (limit > 0 && ++count == limit)
                    break;
                s = s.next;
            }
        }
    }

    public SubLObject backtrace(int limit)
    {
        SubLObject result = NIL;
        if (stack != null) {
            int count = 0;
            StackFrame s = stack;
            while (s != null) {
                result = result.push(s);
                if (limit > 0 && ++count == limit)
                    break;
                s = s.getNext();
            }
        }
        return result.nreverse();
    }

    public void incrementCallCounts()
    {
		StackFrame s = stack;

		for (int i = 0; i < 8; i++) {
			if (s == null)
				break;
			if (s instanceof LispStackFrame) {
				LispStackFrame sf = ((LispStackFrame) s);
				SubLObject operator = sf.getOperator();
				if (operator != null) {
					operator.incrementHotCount();
					operator.incrementCallCount(sf.getArity());
				}
				s = s.getNext();
			}
		}

		while (s != null) {
			if (s instanceof LispStackFrame) {
				LispStackFrame sf = ((LispStackFrame) s);
				SubLObject operator = sf.getOperator();
				if (operator != null)
					operator.incrementCallCount(sf.getArity());
			}
			s = s.getNext();
		}
    }

    private static void pprint(SubLObject obj, int indentBy, LispStream stream)

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
        if (obj instanceof SubLCons) {
            boolean newlineBefore = false;
            SubLObject[] array = obj.copyToArray();
            if (array.length > 0) {
                SubLObject first = array[0];
                if (first == LispSymbols.LET) {
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

    @Override
    public String writeToString()
    {
        StringBuffer sb = new StringBuffer("THREAD");
        if (name != NIL) {
            sb.append(" \"");
            sb.append(name.getString());
            sb.append("\"");
        }
        return unreadableString(sb.toString());
    }

    // ### make-thread
    private static final Primitive MAKE_THREAD =
        new JavaPrimitive("make-thread", PACKAGE_THREADS, true, "function &optional &key name")
    {
        @Override
        public SubLObject execute(SubLObject[] args)
        {
            final int length = args.length;
            if (length == 0)
                error(new WrongNumberOfArgumentsException(this));
            SubLObject name = NIL;
            if (length > 1) {
                if ((length - 1) % 2 != 0)
                    error(new ProgramError("Odd number of keyword arguments."));
                if (length > 3)
                    error(new WrongNumberOfArgumentsException(this));
                if (args[1] == Keyword.NAME)
                    name = args[2].STRING();
                else
                    error(new ProgramError("Unrecognized keyword argument " +
                                            args[1].writeToString() + "."));
            }
            return new LispThread(checkFunction(args[0]), name);
        }
    };

    // ### threadp
    private static final Primitive THREADP =
        new JavaPrimitive("threadp", PACKAGE_THREADS, true, "object",
		      "Boolean predicate as whether OBJECT is a thread.")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            return arg instanceof LispThread ? T : NIL;
        }
    };

    // ### thread-alive-p
    private static final Primitive THREAD_ALIVE_P =
        new JavaPrimitive("thread-alive-p", PACKAGE_THREADS, true, "thread",
		      "Boolean predicate whether THREAD is alive.")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            final LispThread lispThread;
            if (arg instanceof LispThread) {
                lispThread = (LispThread) arg;
            }
            else {
                return type_error(arg, LispSymbols.THREAD);
            }
            return lispThread.javaThread.isAlive() ? T : NIL;
        }
    };

    // ### thread-name
    private static final Primitive THREAD_NAME =
        new JavaPrimitive("thread-name", PACKAGE_THREADS, true, "thread",
		      "Return the name of THREAD if it has one.")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
                if (arg instanceof LispThread) {
                return ((LispThread)arg).name;
            }
                 return type_error(arg, LispSymbols.THREAD);
        }
    };

    public static final long javaSleepInterval(SubLObject lispSleep)

    {
        double d =
            checkDoubleFloat(lispSleep.mult(makeDouble(1000))).doubleValue();
        if (d < 0)
            type_error(lispSleep, list(LispSymbols.REAL, Fixnum.ZERO));

        return (d < Long.MAX_VALUE ? (long) d : Long.MAX_VALUE);
    }

    // ### sleep
    private static final Primitive SLEEP = new JavaPrimitive("sleep", PACKAGE_CL, true, "seconds",
							 "Causes the invoking thread to sleep for SECONDS seconds.\nSECONDS may be a value between 0 1and 1.")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {

            try {
                Thread.sleep(javaSleepInterval(arg));
            }
            catch (InterruptedException e) {
                currentThread().processThreadInterrupts();
            }
            return NIL;
        }
    };

    // ### mapcar-threads
    private static final Primitive MAPCAR_THREADS =
        new JavaPrimitive("mapcar-threads", PACKAGE_THREADS, true, "function",
		      "Applies FUNCTION to all existing threads.")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            Function fun = checkFunction(arg);
            final LispThread thread = LispThread.currentThread();
            SubLObject result = NIL;
            Iterator it = threads.iterator();// map.values().iterator();
            while (it.hasNext()) {
                SubLObject[] args = makeLispObjectArray(1);
                args[0] = (LispThread) it.next();
                result = makeCons(funcall(fun, args, thread), result);
            }
            return result;
        }
    };

    // ### destroy-thread
    private static final Primitive DESTROY_THREAD =
        new JavaPrimitive("destroy-thread", PACKAGE_THREADS, true, "thread", 
		      "Mark THREAD as destroyed.")
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            final LispThread thread;
            if (arg instanceof LispThread) {
                thread = (LispThread) arg;
            }
            else {
                return type_error(arg, LispSymbols.THREAD);
            }
            thread.setDestroyed(true);
            return T;
        }
    };

    // ### interrupt-thread thread function &rest args => T
    // Interrupts thread and forces it to apply function to args. When the
    // function returns, the thread's original computation continues. If
    // multiple interrupts are queued for a thread, they are all run, but the
    // order is not guaranteed.
    private static final Primitive INTERRUPT_THREAD =
        new JavaPrimitive("interrupt-thread", PACKAGE_THREADS, true,
		      "thread function &rest args",
		      "Interrupts THREAD and forces it to apply FUNCTION to ARGS.\nWhen the function returns, the thread's original computation continues. If  multiple interrupts are queued for a thread, they are all run, but the order is not guaranteed.")
    {
        @Override
        public SubLObject execute(SubLObject[] args)
        {
            if (args.length < 2)
                return error(new WrongNumberOfArgumentsException(this));
            final LispThread thread;
            if (args[0] instanceof LispThread) {
                thread = (LispThread) args[0];
            }
            else {
                return type_error(args[0], LispSymbols.THREAD);
            }
            SubLObject fun = args[1];
            SubLObject funArgs = NIL;
            for (int i = args.length; i-- > 2;)
                funArgs = makeCons(args[i], funArgs);
            thread.interrupt(fun, funArgs);
            return T;
        }
    };

    // ### current-thread
    private static final Primitive CURRENT_THREAD =
        new JavaPrimitive("current-thread", PACKAGE_THREADS, true, "",
		      "Returns a reference to invoking thread.")
    {
        @Override
        public SubLObject execute()
        {
            return currentThread();
        }
    };

    // ### backtrace
    private static final Primitive BACKTRACE =
        new JavaPrimitive("backtrace", PACKAGE_SYS, true, "",
		      "Returns a backtrace of the invoking thread.")
    {
        @Override
        public SubLObject execute(SubLObject[] args)

        {
            if (args.length > 1)
                return error(new WrongNumberOfArgumentsException(this));
            int limit = args.length > 0 ? args[0].intValue() : 0;
            return currentThread().backtrace(limit);
        }
    };
    // ### frame-to-string
    private static final Primitive FRAME_TO_STRING =
        new JavaPrimitive("frame-to-string", PACKAGE_SYS, true, "frame")
    {
        @Override
        public SubLObject execute(SubLObject[] args)

        {
            if (args.length != 1)
                return error(new WrongNumberOfArgumentsException(this));
            
            return checkStackFrame(args[0]).toLispString();
        }
    };

    // ### frame-to-list
    private static final Primitive FRAME_TO_LIST =
        new JavaPrimitive("frame-to-list", PACKAGE_SYS, true, "frame")
    {
        @Override
        public SubLObject execute(SubLObject[] args)

        {
            if (args.length != 1)
                return error(new WrongNumberOfArgumentsException(this));

            return checkStackFrame(args[0]).toLispList();
        }
    };


    static {
        //FIXME: this block has been added for pre-0.16 compatibility
        // and can be removed the latest at release 0.22
        PACKAGE_EXT.export(intern("MAKE-THREAD", PACKAGE_THREADS));
        PACKAGE_EXT.export(intern("THREADP", PACKAGE_THREADS));
        PACKAGE_EXT.export(intern("THREAD-ALIVE-P", PACKAGE_THREADS));
        PACKAGE_EXT.export(intern("THREAD-NAME", PACKAGE_THREADS));
        PACKAGE_EXT.export(intern("MAPCAR-THREADS", PACKAGE_THREADS));
        PACKAGE_EXT.export(intern("DESTROY-THREAD", PACKAGE_THREADS));
        PACKAGE_EXT.export(intern("INTERRUPT-THREAD", PACKAGE_THREADS));
        PACKAGE_EXT.export(intern("CURRENT-THREAD", PACKAGE_THREADS));
    }

    // ### use-fast-calls
    private static final Primitive USE_FAST_CALLS =
        new JavaPrimitive("use-fast-calls", PACKAGE_SYS, true)
    {
        @Override
        public SubLObject execute(SubLObject arg)
        {
            use_fast_calls = (arg != NIL);
            return use_fast_calls ? T : NIL;
        }
    };

    // ### synchronized-on
    private static final SpecialOperator SYNCHRONIZED_ON =
        new SpecialOperator("synchronized-on", PACKAGE_THREADS, true,
                            "form &body body")
    {
        @Override
        public SubLObject execute(SubLObject args, Environment env)

        {
          if (args == NIL)
            return error(new WrongNumberOfArgumentsException(this));

          LispThread thread = LispThread.currentThread();
          synchronized (Lisp.eval(args.first(), env, thread).lockableInstance()) {
              return progn(args.rest(), env, thread);
          }
        }
    };

    // ### object-wait
    private static final Primitive OBJECT_WAIT =
        new JavaPrimitive("object-wait", PACKAGE_THREADS, true,
                      "object &optional timeout")
    {
        @Override
        public SubLObject execute(SubLObject object)

        {
            try {
                object.lockableInstance().wait();
            }
            catch (InterruptedException e) {
                currentThread().processThreadInterrupts();
            }
            catch (IllegalMonitorStateException e) {
                return error(new IllegalMonitorState());
            }
            return NIL;
        }

        @Override
        public SubLObject execute(SubLObject object, SubLObject timeout)

        {
            try {
                object.lockableInstance().wait(javaSleepInterval(timeout));
            }
            catch (InterruptedException e) {
                currentThread().processThreadInterrupts();
            }
            catch (IllegalMonitorStateException e) {
                return error(new IllegalMonitorState());
            }
            return NIL;
        }
    };

    // ### object-notify
    private static final Primitive OBJECT_NOTIFY =
        new JavaPrimitive("object-notify", PACKAGE_THREADS, true,
                      "object")
    {
        @Override
        public SubLObject execute(SubLObject object)

        {
            try {
                object.lockableInstance().notify();
            }
            catch (IllegalMonitorStateException e) {
                return error(new IllegalMonitorState());
            }
            return NIL;
        }
    };

    // ### object-notify-all
    private static final Primitive OBJECT_NOTIFY_ALL =
        new JavaPrimitive("object-notify-all", PACKAGE_THREADS, true,
                      "object")
    {
        @Override
        public SubLObject execute(SubLObject object)

        {
            try {
                object.lockableInstance().notifyAll();
            }
            catch (IllegalMonitorStateException e) {
                return error(new IllegalMonitorState());
            }
            return NIL;
        }
    };



}
