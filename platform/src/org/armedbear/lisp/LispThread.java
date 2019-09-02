/*
 * LispThread.java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: LispThread.java 14465 2013-04-24 12:50:37Z rschlatte $
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

package org.armedbear.lisp;

import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.text.MessageFormat;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrowImpl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SafeRunnable;
import com.cyc.tool.subl.util.SubLFiles;

public abstract class LispThread extends SLispObject {
	public LispObject initialBindings = NIL;

	// use a concurrent hashmap: we may want to add threads
	// while at the same time iterating the hash
	final static public ConcurrentHashMap<Thread, LispThread> map = new ConcurrentHashMap<Thread, LispThread>();

	LispObject threadValue = NIL;
	static Thread oneOnlyJT;
	static LispThread oneOnlyLT;

	static public class LispThreadImpl extends LispThread {

		LispThreadImpl(Function fun, LispObject name, LispObject initialBindings0, long cstack, long vstack) {
			super(fun, name, initialBindings0, cstack, vstack, true);
		}

		protected LispThreadImpl(Thread javaThread) {
			super(javaThread);
		}
		//		protected LispThreadImpl() {
		//			super(Thread.currentThread());
		//		}
	}

	private static ThreadLocal<LispThread> threads = new ThreadLocal<LispThread>() {
		@Override
		public LispThread initialValue() {
			Thread thisThread = Thread.currentThread();
			LispThread thread = LispThread.map.get(thisThread);
			if (thread == null) {
				thread = new LispThreadImpl(thisThread);
				oneOnlyJT = thisThread;
				oneOnlyLT = thread;
				LispThread.map.put(thisThread, thread);
			}
			return thread;
		}
	};

	public static final LispThread currentThread() {
		synchronized (threads) {
			if (Thread.currentThread() == oneOnlyJT)
				return oneOnlyLT;
			return threads.get();
		}
	}

	final String creator;
	Thread javaThread;
	private boolean destroyed;
	final LispObject name;
	public LispObject[] _values;
	private boolean threadInterrupted;
	private LispObject pending = NIL;
	private Symbol wrapper = PACKAGE_THREADS.intern("THREAD-FUNCTION-WRAPPER");

	protected LispThread(Thread javaThread) {
		this.javaThread = javaThread;
		if (javaThread instanceof SubLThread) {
			((SubLThread) javaThread).lispThread = this;
		}
		name = new SimpleString(javaThread.getName());
		creator = BeanShellCntrl.getStackTraceString(new Throwable());
	}

	protected LispThread(Function fun, LispObject name, LispObject initialBindings0, long cstack, long vstack, boolean daemon) {

		creator = BeanShellCntrl.getStackTraceString(new Throwable());
		this.name = name;
		SafeRunnable r = new SafeRunnable() {
			@Override
			public void safeRun() {
				Throwable problem = null;
				registerThread(Thread.currentThread());
				try {
					initInitialBindings();
					threadValue = funcall(wrapper, new LispObject[] { fun }, LispThread.this);
				} catch (ThreadDestroyed ignored) {
					problem = ignored;
					// Might happen.
				} catch (ProcessingTerminated e) {
					problem = e;
					Lisp.exit(e.getStatus());
				} catch (Throwable t) { // any error: process thread interrupts
					if (isInterrupted()) {
						processThreadInterrupts();
					}
					problem = t;
					String msg = MessageFormat.format("Ignoring uncaught exception {0}.", t.toString());
					Debug.warn(msg);
				} finally {
					if (problem != null)
						problem.printStackTrace(SystemCurrent.originalSystemErr);
					// make sure the thread is *always* removed from the hash again
					map.remove(Thread.currentThread());
				}
			}
		};

		// use SubL's MAKE-PROCESS
		if (true) {
			SubLObjectFactory.makeProcess((SubLString) name.STRING(), r);
		} else {
			Thread javaThread = new Thread(r);
			this.registerThread(javaThread);
			javaThread.setDaemon(daemon);
			javaThread.start();
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	protected void registerThread(Thread thr) {
		javaThread = thr;
		map.put(javaThread, this);
		if (name != NIL)
			javaThread.setName(name.getStringValue());
		//      javaThread.setDaemon(daemon);
		//      javaThread.start();
	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	public void initInitialBindings() {
		LispObject[] pairs = initialBindings.copyToArray();
		for (int i = 0; i < pairs.length; i++) {
			final LispObject lispObject = pairs[i];
			if (lispObject.isCons()) {
				Cons cons = (Cons) lispObject;
				LispObject var = cons.car();
				LispObject val = cons.cdr();
				var.toSymbol().toLispObject().setDynamicValue(val);
			} else {
				Symbol symbol = (Symbol) lispObject;
				symbol.setDynamicValue(symbol.value);
			}
		}
	}

	public StackTraceElement[] getJavaStackTrace() {
		return javaThread.getStackTrace();
	}

	@Override
	public LispObject typeOf() {
		return Symbol.THREAD;
	}

	@Override
	public LispObject classOf() {
		return BuiltInClass.THREAD;
	}

	@Override
	public LispObject typep(LispObject typeSpecifier) {
		if (typeSpecifier == Symbol.THREAD)
			return T;
		if (typeSpecifier == BuiltInClass.THREAD)
			return T;
		return super.typep(typeSpecifier);
	}

	public final synchronized boolean isDestroyed() {
		return destroyed;
	}

	final synchronized boolean isInterrupted() {
		return threadInterrupted;
	}

	final synchronized void setDestroyed(boolean b) {
		destroyed = b;
	}

	final synchronized void interrupt(LispObject function, LispObject args) {
		pending = new Cons(args, pending);
		pending = new Cons(function, pending);
		threadInterrupted = true;
		javaThread.interrupt();
	}

	final synchronized void processThreadInterrupts()

	{
		while (pending != NIL) {
			LispObject function = pending.car();
			LispObject args = pending.cadr();
			pending = pending.cddr();
			Primitives.APPLY.execute(function, args);
		}
		threadInterrupted = false;
	}

	public final LispObject[] getValues() {
		return _values;
	}

	public final LispObject[] getValues(LispObject result, int count) {
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

	/** Used by the JVM compiler for MULTIPLE-VALUE-CALL. */
	public final LispObject[] accumulateValues(LispObject result, LispObject[] oldValues) {
		if (oldValues == null) {
			if (_values != null)
				return _values;
			LispObject[] values = new LispObject[1];
			values[0] = result;
			return values;
		}
		if (_values != null) {
			if (_values.length == 0)
				return oldValues;
			final int totalLength = oldValues.length + _values.length;
			LispObject[] values = new LispObject[totalLength];
			System.arraycopy(oldValues, 0, values, 0, oldValues.length);
			System.arraycopy(_values, 0, values, oldValues.length, _values.length);
			return values;
		}
		// _values is null.
		final int totalLength = oldValues.length + 1;
		LispObject[] values = new LispObject[totalLength];
		System.arraycopy(oldValues, 0, values, 0, oldValues.length);
		values[totalLength - 1] = result;
		return values;
	}

	public final LispObject setValues() {
		_values = new LispObject[0];
		return NIL;
	}

	public final LispObject setValues(LispObject value1) {
		_values = null;
		return value1;
	}

	public final LispObject setValues(LispObject value1, LispObject value2) {
		_values = new LispObject[2];
		_values[0] = value1;
		_values[1] = value2;
		return value1;
	}

	public final LispObject setValues(LispObject value1, LispObject value2, LispObject value3) {
		_values = new LispObject[3];
		_values[0] = value1;
		_values[1] = value2;
		_values[2] = value3;
		return value1;
	}

	public final LispObject setValues(LispObject value1, LispObject value2, LispObject value3, LispObject value4) {
		_values = new LispObject[4];
		_values[0] = value1;
		_values[1] = value2;
		_values[2] = value3;
		_values[3] = value4;
		return value1;
	}

	public final LispObject setValues(LispObject[] values) {
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

	public final void clearValues() {
		_values = null;
	}

	public final LispObject nothing() {
		_values = new LispObject[0];
		return NIL;
	}

	/**
	 * Force a single value, for situations where multiple values should be ignored.
	 */
	public final LispObject value(LispObject obj) {
		_values = null;
		return obj;
	}

	final static int UNASSIGNED_SPECIAL_INDEX = 0;

	/**
	 * Indicates the last special slot which has been assigned. Symbols which don't
	 * have a special slot assigned use a slot index of 0 for efficiency reasons: it
	 * eliminates the need to check for index validity before accessing the specials
	 * array.
	 *
	 */
	final static AtomicInteger lastSpecial = new AtomicInteger(UNASSIGNED_SPECIAL_INDEX);

	/**
	 * A list of indices which can be (re)used for symbols to be assigned a special
	 * slot index.
	 */
	final static ConcurrentLinkedQueue<Integer> freeSpecialIndices = new ConcurrentLinkedQueue<Integer>();

	final static int specialsInitialSize = Integer.valueOf(System.getProperty("abcl.specials.initialSize", "4096"));

	/**
	 * This array stores the current special binding for every symbol which has been
	 * globally or locally declared special.
	 *
	 * If the array element has a null value, this means there currently is no
	 * active binding. If the array element contains a valid SpecialBinding object,
	 * but the value field of it is null, that indicates an "UNBOUND VARIABLE"
	 * situation.
	 */
	SpecialBinding[] specials = new SpecialBinding[specialsInitialSize + 1];

	final static ConcurrentHashMap<Integer, WeakReference<Symbol>> specialNames = new ConcurrentHashMap<Integer, WeakReference<Symbol>>();

	/**
	 * The number of slots to grow the specials table in case of insufficient
	 * storage.
	 */
	final static int specialsDelta = Integer.valueOf(System.getProperty("abcl.specials.grow.delta", "1024"));

	/**
	 * This variable points to the head of a linked list of saved special bindings.
	 * Its main purpose is to allow a mark/reset interface to special binding and
	 * unbinding.
	 */
	private SpecialBindingsMark savedSpecials = null;

	/**
	 * Marks the state of the special bindings, for later rewinding by
	 * resetSpecialBindings().
	 */
	public final SpecialBindingsMark markSpecialBindings() {
		return savedSpecials;
	}

	/**
	 * Restores the state of the special bindings to what was captured in the marker
	 * 'mark' by a call to markSpecialBindings().
	 */
	public final void resetSpecialBindings(SpecialBindingsMark mark) {
		SpecialBindingsMark c = savedSpecials;
		while (mark != c) {
			specials[c.idx] = c.binding;
			c = c.next;
		}
		savedSpecials = c;
	}

	/**
	 * Clears out all active special bindings including any marks previously set.
	 * Invoking resetSpecialBindings() with marks set before this call results in
	 * undefined behaviour.
	 */
	// Package level access: only for Interpreter.run()
	final void clearSpecialBindings() {
		resetSpecialBindings(null);
	}

	/**
	 * Assigns a specials array index number to the symbol, if it doesn't already
	 * have one.
	 */
	private void assignSpecialIndex(Symbol sym) {
		if (sym.specialIndex != UNASSIGNED_SPECIAL_INDEX)
			return;

		synchronized (Symbol.class) {
			synchronized (sym) {

				// Don't use an atomic access: we'll be swapping values only once.
				if (sym.specialIndex == UNASSIGNED_SPECIAL_INDEX) {
					Integer next = freeSpecialIndices.poll();
					if (next == null && specials.length < lastSpecial.get() && null == System.getProperty("abcl.specials.grow.slowly")) {
						// free slots are exhausted; in the middle and at the end.
						System.gc();
						next = freeSpecialIndices.poll();
					}
					if (next == null)
						sym.specialIndex = lastSpecial.incrementAndGet();
					else
						sym.specialIndex = next.intValue();
				}
			}

		}

	}

	/**
	 * Frees up an index previously assigned to a symbol for re-assignment to
	 * another symbol. Returns without effect if the symbol has the default
	 * UNASSIGNED_SPECIAL_INDEX special index.
	 */
	protected static void releaseSpecialIndex(Symbol sym) {
		int index = sym.specialIndex;
		if (index != UNASSIGNED_SPECIAL_INDEX) {
			// clear out the values in the
			Iterator<LispThread> it = map.values().iterator();
			while (it.hasNext()) {
				LispThread thread = it.next();

				// clear out the values in the saved specials list
				SpecialBindingsMark savedSpecial = thread.savedSpecials;
				while (savedSpecial != null) {
					if (savedSpecial.idx == index) {
						savedSpecial.idx = 0;
						savedSpecial.binding = null;
					}
					savedSpecial = savedSpecial.next;
				}

				thread.specials[index] = null;
			}

			freeSpecialIndices.add(new Integer(index));
		}
	}

	private void growSpecials() {
		SpecialBinding[] newSpecials = new SpecialBinding[specials.length + specialsDelta];
		System.arraycopy(specials, 0, newSpecials, 0, specials.length);
		specials = newSpecials;
	}

	private SpecialBinding ensureSpecialBinding(int idx) {
		SpecialBinding binding;
		boolean assigned;
		do {
			try {
				binding = specials[idx];
				assigned = true;
			} catch (ArrayIndexOutOfBoundsException e) {
				assigned = false;
				binding = null; // suppresses 'unassigned' error
				growSpecials();
			}
		} while (!assigned);
		return binding;
	}

	public final SpecialBinding bindSpecial(Symbol name, LispObject value) {
		int idx;

		assignSpecialIndex(name);
		idx = name.specialIndex;
		SpecialBinding binding = ensureSpecialBinding(idx);
		savedSpecials = new SpecialBindingsMark(idx, binding, savedSpecials);
		return specials[idx] = new SpecialBinding(idx, value);
	}

	public final SpecialBinding bindSpecialToCurrentValue(Symbol name) {
		int idx;

		assignSpecialIndex(name);
		SpecialBinding binding = ensureSpecialBinding(idx = name.specialIndex);
		savedSpecials = new SpecialBindingsMark(idx, binding, savedSpecials);
		return specials[idx] = new SpecialBinding(idx, (binding == null) ? name.getSymbolValue() : binding.value);
	}

	/**
	 * Looks up the value of a special binding in the context of the given thread.
	 *
	 * In order to find the value of a special variable (in general), use
	 * {@link Symbol#symbolValue}.
	 *
	 * @param name The name of the special variable, normally a symbol
	 * @return The inner most binding of the special, or null if unbound
	 *
	 * @see Symbol#symbolValue
	 */
	public final LispObject lookupSpecial(Symbol name) {
		SpecialBinding binding = ensureSpecialBinding(name.specialIndex);
		return (binding == null) ? null : binding.value;
	}

	public final SpecialBinding getSpecialBinding(Symbol name) {
		return ensureSpecialBinding(name.specialIndex);
	}

	public final LispObject setSpecialVariable(Symbol name, LispObject value) {
		SpecialBinding binding = ensureSpecialBinding(name.specialIndex);
		if (binding != null)
			return binding.value = value;

		name.setSymbolValue(value);
		return value;
	}

	public final LispObject pushSpecial(Symbol name, LispObject thing)

	{
		SpecialBinding binding = ensureSpecialBinding(name.specialIndex);
		if (binding != null)
			return binding.value = new Cons(thing, binding.value);

		LispObject value = name.getSymbolValue();
		if (value != null) {
			LispObject newValue = new Cons(thing, value);
			name.setSymbolValue(newValue);
			return newValue;
		} else
			return error(new UnboundVariable(name));
	}

	// Returns symbol value or NIL if unbound.
	public final LispObject safeSymbolValue(Symbol name) {
		SpecialBinding binding = ensureSpecialBinding(name.specialIndex);
		if (binding != null)
			return binding.value;

		LispObject value = name.getSymbolValue();
		return value != null ? value : NIL;
	}

	public final void rebindSpecial(Symbol name, LispObject value) {
		SpecialBinding binding = getSpecialBinding(name);
		binding.value = value;
	}

	private LispObject catchTags = NIL;

	public void pushCatchTag(LispObject tag) {
		catchTags = new Cons(tag, catchTags);
	}

	public void popCatchTag() {
		if (catchTags != NIL)
			catchTags = catchTags.cdr();
		else
			Debug.assertTrue(false);
	}

	public void throwToTag(LispObject tag, LispObject result)

	{
		LispObject rest = catchTags;
		while (rest != NIL) {
			if (rest.car() == tag)
				throw new CatchableThrowImpl(tag, result, this);
			rest = rest.cdr();
		}
		boolean b = Lisp.debug;
		error(new ControlError("Attempt to throw to the nonexistent tag " + tag.princToString() + "."));
	}

	public boolean NO_STACK_FRAMES = System.getProperty("lisp.noframes", "false").equals("true");

	//	/**
	//	 * TODO Describe the purpose of this method.
	//	 * 
	//	 * @param function
	//	 * @param args
	//	 */
	//	private void arrayStack.pushLispStackFrame(LispObject function, LispObject... args) {
	//		final int argslen = args.length;
	//		final int itemsToPush = argslen + STACK_FRAME_EXTRA;
	//		ensureStackCapacity(itemsToPush);
	//		stack[stackPtr] = function;
	//		final int nxtPtr = stackPtr + 1;
	//		System.arraycopy(args, 0, stack, nxtPtr, argslen);
	//		stack[nxtPtr + argslen] = new StackMarker(argslen);
	//		stackPtr += itemsToPush;
	//		pushedStackFrame(argslen);
	//	}
	//
	//	private void pushedStackFrame(int numArgs) {
	//		if (trace_calls()) {
	//			printCurrentFrame(">>>", false);
	//		}
	//	}

	final StackFrameArrayBased arrayStack = new StackFrameArrayBased() {

		public boolean skipStackFrame() {
			return NO_STACK_FRAMES;
		}

		@Override
		void printCurrentFrame(String why, boolean iSOut) {
			LispThread.this.printCurrentFrame(why, iSOut);
		}

		@Override
		boolean trace_calls() {
			return LispThread.this.trace_calls();
		}

		@Override
		protected String safePrintObject(LispObject obj) {
			return LispThread.this.safePrintObject(obj);
		}

		@Override
		protected String getThreadName() {
			return "" + LispThread.this.name;
		}

		protected void pprintCall(LispObject lispList, int charPos, Stream out) {
			pprint(lispList, charPos, out);
		};
	};

	protected void popStackFrame(int numArgs) {
		if (NO_STACK_FRAMES)
			return;
		if (trace_calls()) {
			printCurrentFrame("<<<", true);
		}
		arrayStack.popStackFrame(numArgs);
	}

	//	public final Environment setEnv(Environment env) {
	//		StackFrame stackTop = getStackTop();
	//		return (stackTop != null) ? stackTop.setEnv(env) : null;
	//	}

	@Override
	public LispObject execute(LispObject function) {
		if (NO_STACK_FRAMES)
			return retVal(function.execute());
		try {
			arrayStack.pushLispStackFrame(function);
			return retVal(function.execute());
		} finally {
			popStackFrame(0);
		}
	}

	@Override
	public LispObject execute(LispObject function, LispObject arg) {
		if (NO_STACK_FRAMES)
			return retVal(function.execute(arg));
		try {
			arrayStack.pushLispStackFrame(function, arg);
			return retVal(function.execute(arg));
		} finally {
			popStackFrame(1);
		}
	}

	@Override
	public LispObject execute(LispObject function, LispObject first, LispObject second) {
		if (NO_STACK_FRAMES)
			return retVal(function.execute(first, second));
		try {
			arrayStack.pushLispStackFrame(function, first, second);
			final LispObject execute = function.execute(first, second);
			return retVal(execute);
		} finally {
			popStackFrame(2);
		}
	}

	@Override
	public LispObject execute(LispObject function, LispObject first, LispObject second, LispObject third) {
		if (NO_STACK_FRAMES)
			return retVal(function.execute(first, second, third));
		try {
			arrayStack.pushLispStackFrame(function, first, second, third);
			return retVal(function.execute(first, second, third));
		} finally {
			popStackFrame(3);
		}
	}

	@Override
	public LispObject execute(LispObject function, LispObject first, LispObject second, LispObject third, LispObject fourth) {
		if (NO_STACK_FRAMES)
			return retVal(function.execute(first, second, third, fourth));
		try {
			arrayStack.pushLispStackFrame(function, first, second, third, fourth);
			return retVal(function.execute(first, second, third, fourth));
		} finally {
			popStackFrame(4);
		}
	}

	@Override
	public LispObject execute(LispObject function, LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth) {
		if (NO_STACK_FRAMES)
			return retVal(function.execute(first, second, third, fourth, fifth));
		try {
			arrayStack.pushLispStackFrame(function, first, second, third, fourth, fifth);
			return retVal(function.execute(first, second, third, fourth, fifth));
		} finally {
			popStackFrame(5);
		}
	}

	@Override
	public LispObject execute(LispObject function, LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth, LispObject sixth) {
		if (NO_STACK_FRAMES)
			return retVal(function.execute(first, second, third, fourth, fifth, sixth));
		try {
			arrayStack.pushLispStackFrame(function, first, second, third, fourth, fifth, sixth);
			return retVal(function.execute(first, second, third, fourth, fifth, sixth));
		} finally {
			popStackFrame(6);
		}
	}

	@Override
	public LispObject execute(LispObject function, LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth, LispObject sixth, LispObject seventh) {
		if (NO_STACK_FRAMES)
			return function.execute(first, second, third, fourth, fifth, sixth, seventh);
		try {
			arrayStack.pushLispStackFrame(function, first, second, third, fourth, fifth, sixth, seventh);
			return retVal(function.execute(first, second, third, fourth, fifth, sixth, seventh));
		} finally {
			popStackFrame(7);
		}
	}

	public LispObject execute(LispObject function, LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth, LispObject sixth, LispObject seventh, LispObject eighth) {
		if (NO_STACK_FRAMES)
			return function.execute(first, second, third, fourth, fifth, sixth, seventh, eighth);

		try {
			arrayStack.pushLispStackFrame(function, first, second, third, fourth, fifth, sixth, seventh, eighth);
			return retVal(function.execute(first, second, third, fourth, fifth, sixth, seventh, eighth));
		} finally {
			popStackFrame(8);
		}
	}

	public LispObject execute(LispObject function, LispObject[] args) {
		if (NO_STACK_FRAMES)
			return function.execute(args);
		arrayStack.pushLispStackFrame(function, args);
		try {
			return retVal(function.execute(args));
		} finally {
			popStackFrame(args.length);
		}
	}

	public void printBacktrace() {
		arrayStack.printBacktrace(0);
	}

	//
	//	public void printBacktrace(int limit) {
	//		StackFrame stackTop = getStackTop();
	//		if (stackTop != null) {
	//			int count = 0;
	//			Stream out = checkCharacterOutputStream(Symbol.TRACE_OUTPUT.symbolValue());
	//			out._writeLine("Evaluation stack:");
	//			out._finishOutput();
	//
	//			StackFrame s = stackTop;
	//			while (s != null) {
	//				out._writeString("  ");
	//				out._writeString(String.valueOf(count));
	//				out._writeString(": ");
	//
	//				pprint(s.toLispList(), out.getCharPos(), out);
	//				out.terpri();
	//				out._finishOutput();
	//				if (limit > 0 && ++count == limit)
	//					break;
	//				s = s.next;
	//			}
	//		}
	//	}
	//
	public LispObject backtrace(int limit) {
		if (NO_STACK_FRAMES)
			return NIL;
		StackFrame stackTop = arrayStack.getStackTop();
		LispObject result = NIL;
		if (stackTop != null) {
			int count = 0;
			StackFrame s = stackTop;
			while (s != null) {
				result = result.push(s);
				if (limit > 0 && ++count == limit)
					break;
				s = s.getNext();
			}
		}
		return result.nreverse();
	}

	public void incrementCallCounts() {
		arrayStack.incrementCallCounts();
	}

	private void pprint(LispObject obj, int indentBy, Stream stream)

	{
		if (stream.getCharPos() == 0) {
			StringBuffer sb = new StringBuffer();
			for (int i = 0; i < indentBy; i++)
				sb.append(' ');
			stream._writeString(sb.toString());
		}
		String raw = safePrintObject(obj);
		if (stream.getCharPos() + raw.length() < 80) {
			// It fits.
			stream._writeString(raw);
			return;
		}
		// Object doesn't fit.
		if (obj instanceof Cons) {
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
	public String printObjectImpl() {
		StringBuffer sb = new StringBuffer("THREAD");
		if (name != NIL) {
			sb.append(" \"");
			sb.append(name.getStringValue());
			sb.append("\"");
		}
		return unreadableString(sb.toString());
	}

	int lastDepth = 0;
	Object[] lastFrameAt = new Object[15];
	Object lastFrame;

	/**
	 * TODO (ext:trace-lisp t)
	 */
	PrintStream ps = System.err;
	private LispObject prevRet;

	private int hideChilds;

	private Object childHider;

	public void printCurrentFrame(String why, boolean iSOut) {
		if (insideSafePrintObject != null)
			return;
		System.out.flush();
		Object sf = backtrace(1).car();
		int depth = arrayStack.getDepth();
		int indent = depth % 15;
		boolean retFrame = false;
		if (!(sf instanceof StackFrame))
			return;

		insideSafePrintObject = null;

		if (lastFrame == sf) {
			retFrame = true;
		} else {
			if (indent != lastDepth) {

			}
		}
		if (retFrame) {
			lastFrameAt[indent] = null;
			lastFrame = null;
		} else {
			if (lastFrameAt[indent] == null) {
				lastFrameAt[indent] = sf;
			}
			lastFrame = sf;
		}
		lastDepth = indent;
		insideSafePrintObject = null;
		final LispObject lispList = ((StackFrame) sf).toLispList();
		LispObject first = lispList;
		if (lispList.isCons()) {
			first = lispList.car();
		}
		String TRACE_TYPE = traceType(first);
		if (childHider != null) {
			if (hideChilds < lastDepth) {
				return;
			}
			if (first == childHider) {
				childHider = null;
			} else {
				// BeanShellCntrl.bp();
			}
		}
		if (TRACE_TYPE.equals("HIDE-THIS")) {
			return;
		}
		if (TRACE_TYPE.equals("HIDE-CHILDS")) {
			hideChilds = lastDepth;
			childHider = first;
		}

		sf = ("" + safePrintObject(lispList)).substring(0, 1023);

		insideSafePrintObject = null;
		indent = indent * 2;

		try {
			if (Thread.currentThread() != mainThread)
				ps.print("<" + name + "> ");

			while (indent-- > 0)
				ps.print(" ");
			ps.print("(" + depth + ") " + why + " ");

			if (retFrame) {
				ps.print(" +++ ");
				final String substring = ("" + safePrintObject(prevRet)).substring(0, 1023);
				ps.print(substring);
				return;
			} else {
				ps.print(sf);
				if (iSOut) {
					ps.print(" +++ ");
					final String substring = ("" + safePrintObject(prevRet)).substring(0, 1023);
					ps.print(substring);
				}
				return;
			}
		} finally {
			ps.println();
			try {
				Thread.sleep(LispThread.pauseTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void printCurrentFrameOld(String why, boolean iSOut) {
		if (insideSafePrintObject != null)
			return;
		System.out.flush();
		Object sf = backtrace(1).car();
		Object[] stack = arrayStack.stack;
		int fromTop = arrayStack.stackPtr;
		int depth = 0;
		while (--fromTop > 0) {
			if (stack[fromTop] instanceof StackFrame) {
				depth++;
			}
		}
		int indent = depth % 15;
		boolean retFrame = false;

		if (sf instanceof StackFrame) {
			if (lastFrame == sf) {
				retFrame = true;
			} else {
				if (indent != lastDepth) {

				}
			}
			if (retFrame) {
				lastFrameAt[indent] = null;
				lastFrame = null;
			} else {
				if (lastFrameAt[indent] == null) {
					lastFrameAt[indent] = sf;
				}
				lastFrame = sf;
			}
			lastDepth = indent;
			sf = safePrintObject(((StackFrame) sf).toLispList());
			insideSafePrintObject = null;
		}

		indent = indent * 2;
		try {
			if (Thread.currentThread() != mainThread)
				ps.print("<" + name + "> ");

			while (indent-- > 0)
				ps.print(" ");
			ps.print("(" + depth + ") " + why + " ");

			if (retFrame) {
				ps.print(" +++ ");
				ps.print(safePrintObject(prevRet));
			} else {
				ps.print(sf);
				if (iSOut) {
					ps.print(" +++ ");
					ps.print(safePrintObject(prevRet));
				}
				return;
			}

		} finally {
			ps.println();
			try {
				Thread.sleep(LispThread.pauseTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param first
	 * @return
	 */
	private String traceType(LispObject first) {
		if (true)
			return "";
		if (first instanceof Symbol) {
			final Symbol symbol = (Symbol) first;
			LispObject lispObject = get(symbol, _TRACE_LISP_, null);
			if (lispObject != null && lispObject != NIL) {
				if (lispObject.isCons()) {
					lispObject = lispObject.car();
				}
				return lispObject.princToString();
			}
			String s = (String) symbol.getPackageNamePrecise();
			if (s.startsWith("TOP-"))
				return "HIDE-CHILDS";
			s = symbol.cl_symbol_name();
			if (s.contains("%"))
				return "HIDE-THIS";
			if (s.startsWith("PRIN"))
				return "HIDE-CHILDS";
		}
		return "";
	}

	public Object insideSafePrintObject = null;

	/**
	 * @param obj
	 * @return
	 */
	public String safePrintObject(LispObject obj) {
		final LispThread thread = LispThread.currentThread();
		if (obj == null)
			return "#<@JNULL>";
		Object wasInErr = insideSafePrintObject;
		try {
			if (wasInErr != null) {
				if (wasInErr == obj) {
					return "#<LOOPED " + obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj)) + ">";

				} else {
					return "#<wasInErr " + obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj)) + ">";
				}
			}
			insideSafePrintObject = obj;
			final SpecialBindingsMark mark = thread.markSpecialBindings();
			// thread.bindSpecial(Symbol.PRINT_ESCAPE, NIL);
			thread.bindSpecial(Symbol.PRINT_READABLY, NIL);
			thread.bindSpecial(Symbol.PRINT_LENGTH, Fixnum.constants[10]);
			try {
				return obj.printObject();
			} finally {
				thread.resetSpecialBindings(mark);
			}
		} catch (StackOverflowError e) {
			wasInErr = e;
			return "#<StackOverflowError " + e + obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj)) + ">";

		} catch (Throwable e) {
			e.printStackTrace();
			return "#<safePrintObject " + e + obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj)) + ">";
		} finally {
			insideSafePrintObject = wasInErr;
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @return
	 */

	boolean trace_calls() {
		disableTrace = true;
		if (disableTrace)
			return false;
		if (enableTraceAll)
			return true;
		if (_TRACE_LISP_ != null) {
			pauseTime = 1;
			return _TRACE_LISP_.symbolValue(this).getBooleanValue();
		}
		return false;
	}

	static long pauseTime;

	static final class signal_2 extends Primitive {
		static final LispInteger INT283202;
		static final Symbol SYM283201;
		static final Symbol SYM283200;
		static final Symbol SYM283199;
		static final Symbol SYM283198;
		static final Symbol SYM283195;
		static final AbstractString STR283194;
		static final Symbol SYM283193;
		static final Symbol SYM283192;
		static final Symbol SYM283191;
		static final Symbol CURRENT_ERROR_DEPTH;

		static final Symbol SYM283184 = Lisp.internInPackage("COERCE-TO-CONDITION", "SYSTEM");

		@Override
		public final LispObject execute(LispObject[] var1) {
			LispThread thread = LispThread.currentThread();
			LispObject v3 = NIL;
			if (var1.length > 1)
				v3 = var1[1];
			LispObject var3 = thread.execute(SYM283184, var1[0], v3, Symbol.SIMPLE_ERROR, Symbol.ERROR);
			thread._values = null;
			thread.execute(Symbol.SIGNAL, var3);
			thread._values = null;
			SpecialBindingsMark var4 = thread.markSpecialBindings();
			SpecialBinding var5 = thread.bindSpecial(CURRENT_ERROR_DEPTH, CURRENT_ERROR_DEPTH.symbolValue(thread).incr());
			LispObject var10000;
			if (var5.value.isGreaterThan(SYM283191.symbolValue(thread))) {
				thread.execute(SYM283192, SYM283193.symbolValue(thread), STR283194, var5.value, var3);
				thread.execute(SYM283195, Symbol.ERROR, Lisp.T);
				thread._values = null;
				var10000 = thread.execute(SYM283198, SYM283199) != Lisp.NIL ? thread.execute(SYM283199) : thread.execute(SYM283200, SYM283201, INT283202);
			} else {
				var10000 = thread.execute(Symbol.INVOKE_DEBUGGER, var3);
			}

			thread.resetSpecialBindings(var4);
			return var10000;
		}

		public signal_2() {
			super(Symbol.ERROR, "datum &rest arguments");
		}

		static {

			CURRENT_ERROR_DEPTH = Lisp.internInPackage("*CURRENT-ERROR-DEPTH*", "SYSTEM");
			SYM283191 = Lisp.internInPackage("*MAXIMUM-ERROR-DEPTH*", "SYSTEM");
			SYM283192 = Lisp.internInPackage("%FORMAT", "SYSTEM");
			SYM283193 = Symbol.DEBUG_IO;
			STR283194 = new SimpleString("~%Maximum error depth exceeded (~D nested errors) with '~A'.~%");
			SYM283195 = Lisp.internInPackage("TRACE-LISP", "EXTENSIONS");
			SYM283198 = Symbol.FBOUNDP;
			SYM283199 = Lisp.internInPackage("INTERNAL-DEBUG", "SYSTEM");
			SYM283200 = Lisp.internInPackage("QUIT", "EXTENSIONS");
			SYM283201 = Keyword.STATUS;
			INT283202 = Fixnum.constants[89];
			// new signal_2();
		}
	}

	/*
	 * DECOMPILATION REPORT
	 * 
	 * Decompiled from:
	 * G:\opt\CYC_JRTL_with_CommonLisp\platform\lib\subl.jar\org\armedbear\lisp\
	 * signal_2.class Total time: 20 ms
	 * 
	 * Decompiled with FernFlower.
	 */

	final static Thread mainThread = Thread.currentThread();

	final static Object yourthead = new Object() { /*
													 * (non-Javadoc)
													 * 
													 * @see org.armedbear.lisp.LispObject#toString()
													 */
		@Override
		public String toString() {
			return Thread.currentThread().getName();
		}
	};
	private boolean enableTraceAll = false;
	private boolean disableTrace = true;
	private boolean traceSome = false;

	@DocString(name = "trace-lisp", args = "value &optional function")
	private static final Primitive TRACE_LISP = new Primitive("trace-lisp", PACKAGE_EXT, true, "value &optional function") {
		@Override
		public LispObject execute(LispObject[] args) {
			LispThread thread = currentThread();
			if (args == null || args.length == 0) {
				if (thread.disableTrace) {
					thread.disableTrace = false;
				}
				if (thread.traceSome)
					args = new LispObject[] { T };
			}
			final LispObject arg0 = args[0];
			PrintStream ps = thread.ps;
			_TRACE_LISP_.setSymbolValue(arg0);
			final boolean traceOn = !arg0.isNil();
			thread.disableTrace = !traceOn;
			if (traceOn) {
				thread.enableTraceAll = arg0 == T;
				if (!thread.enableTraceAll) {
					thread.traceSome = true;
				}
			}

			// if (traceOn)
			// new Throwable("FAKE TRACE_LISP: ").printStackTrace(ps);
			LispThread olt = map.get(mainThread);

			if (Packages.findPackage("SWANK") != null) {
				Symbol sym = Symbol.PRINT_PPRINT_DISPATCH;
				Symbol symb = (Symbol) Lisp.readObjectFromString("swank::*backtrace-pprint-dispatch-table*".toUpperCase());
				ps.println(olt + " " + symb + "=" + symb.symbolValue(olt));
				ps.println(thread + " " + symb + "=" + symb.symbolValue(thread));
				ps.println(olt + " " + sym + "=" + symb.symbolValue(olt));
				ps.println(thread + " " + sym + "=" + symb.symbolValue(thread));
			}

			// Symbol.ERROR.setSymbolFunction(new signal_2());

			return NIL;
		}
	};
	static Symbol _TRACE_LISP_ = (Symbol) TRACE_LISP.getLambdaName();

	static {
		_TRACE_LISP_.setProcessScope(true);
		_TRACE_LISP_.initializeSpecial(NIL);
		Symbol.PRINT_PPRINT_DISPATCH.setProcessScope(false);
	}
	static Symbol INITIAL_BINDING = internKeyword("INITIAL-BINDING"), //
			CSTACK_SIZE = internKeyword("CSTACK-SIZE"), //
			VSTACK_SIZE = internKeyword("VSTACK-SIZE");

	@DocString(name = "make-thread", args = "function &key name :INITIAL-BINDINGS :CSTACK-SIZE :VSTACK-SIZE")
	private static final Primitive MAKE_THREAD = new Primitive("make-thread", PACKAGE_THREADS, true, "function &key name :INITIAL-BINDINGS :CSTACK-SIZE :VSTACK-SIZE") {
		@Override
		public LispObject execute(LispObject[] args) {
			final int length = args.length;
			if (length == 0)
				error(new WrongNumberOfArgumentsException(this, 1, -1));
			if (length > 1) {
				if ((length - 1) % 2 != 0)
					program_error("Odd number of keyword arguments.");
			}
			long cstack = 0;
			long vstack = 0;
			LispObject name = SubLFiles.findKeyword(1, args, Keyword.NAME, () -> NIL);
			if (name != NIL) {
				name = name.STRING();
			}
			LispObject initialBindings = SubLFiles.findKeyword(1, args, INITIAL_BINDING, () -> Symbol._DEFAULT_SPECIAL_BINDINGS_.symbolValue());
			// else
			// program_error("Unrecognized keyword argument "
			// + args[1].princToString() + ".");
			return new LispThreadImpl(checkFunction(args[0]), name, initialBindings, vstack, cstack);
		}
	};

	@DocString(name = "threadp", args = "object", doc = "Boolean predicate testing if OBJECT is a thread.")
	private static final Primitive THREADP = new Primitive("threadp", PACKAGE_THREADS, true) {
		@Override
		public LispObject execute(LispObject arg) {
			return arg instanceof LispThread ? T : NIL;
		}
	};

	@DocString(name = "thread-alive-p", args = "thread", doc = "Returns T if THREAD is alive.")
	private static final Primitive THREAD_ALIVE_P = new Primitive("thread-alive-p", PACKAGE_THREADS, true, "thread", "Boolean predicate whether THREAD is alive.") {
		@Override
		public LispObject execute(LispObject arg) {
			final LispThread lispThread;
			if (arg instanceof LispThread) {
				lispThread = (LispThread) arg;
			} else {
				return type_error(arg, Symbol.THREAD);
			}
			return lispThread.javaThread.isAlive() ? T : NIL;
		}
	};

	@DocString(name = "thread-active-p", args = "thread", doc = "Returns T if THREAD is alive.")
	private static final Primitive THREAD_ACTIVE_P = new Primitive("thread-alive-p", PACKAGE_THREADS, true, "thread", "Boolean predicate whether THREAD is already terminated.") {
		@Override
		public LispObject execute(LispObject arg) {
			final LispThread lispThread;
			if (arg instanceof LispThread) {
				lispThread = (LispThread) arg;
			} else {
				return type_error(arg, Symbol.THREAD);
			}
			return lispThread.javaThread.isAlive() ? T : NIL;
		}
	};

	@DocString(name = "thread-name", args = "thread", doc = "Return the name of THREAD, if it has one.")
	private static final Primitive THREAD_NAME = new Primitive("thread-name", PACKAGE_THREADS, true) {
		@Override
		public LispObject execute(LispObject arg) {
			if (arg instanceof LispThread) {
				return ((LispThread) arg).name;
			}
			return type_error(arg, Symbol.THREAD);
		}
	};

	private static final Primitive THREAD_JOIN = new Primitive("thread-join", PACKAGE_THREADS, true, "thread", "Waits for thread to finish.") {
		@Override
		public LispObject execute(LispObject arg) {
			// join the thread, and returns it's value. The second return
			// value is T if the thread finishes normally, NIL if its
			// interrupted.
			if (arg instanceof LispThread) {
				final LispThread joinedThread = (LispThread) arg;
				final LispThread waitingThread = currentThread();
				try {
					joinedThread.javaThread.join();
					return waitingThread.setValues(joinedThread.threadValue, T);
				} catch (InterruptedException e) {
					waitingThread.processThreadInterrupts();
					return waitingThread.setValues(joinedThread.threadValue, NIL);
				}
			} else {
				return type_error(arg, Symbol.THREAD);
			}
		}
	};

	final static DoubleFloat THOUSAND = new DoubleFloat(1000);

	static final long sleepMillisPart(LispObject seconds) {
		double d = checkDoubleFloat(seconds.multiplyBy(THOUSAND)).getValue();
		if (d < 0) {
			type_error(seconds, list(Symbol.REAL, Fixnum.ZERO));
		}
		return (d < Long.MAX_VALUE ? (long) d : Long.MAX_VALUE);
	}

	static final int sleepNanosPart(LispObject seconds) {
		double d // d contains millis
				= checkDoubleFloat(seconds.multiplyBy(THOUSAND)).getValue();
		double n = d * 1000000; // sleep interval in nanoseconds
		d = 1.0e6 * ((long) d); // sleep interval to millisecond precision
		n = n - d;

		return (n < Integer.MAX_VALUE ? (int) n : Integer.MAX_VALUE);
	}

	@DocString(name = "sleep", args = "seconds", doc = "Causes the invoking thread to sleep for an interveral expressed in SECONDS.\n" + "SECONDS may be specified as a fraction of a second, with intervals\n" + "less than or equal to a nanosecond resulting in a yield of execution\n" + "to other waiting threads rather than an actual sleep.\n" + "A zero value of SECONDS *may* result in the JVM sleeping indefinitely,\n"
			+ "depending on the implementation.")
	private static final Primitive SLEEP = new Primitive("sleep", PACKAGE_CL, true) {
		@Override
		public LispObject execute(LispObject arg) {
			long millis = sleepMillisPart(arg);
			int nanos = sleepNanosPart(arg);
			boolean zeroArgP = arg.ZEROP() != NIL;

			try {
				if (millis == 0 && nanos == 0) {
					if (zeroArgP) {
						Thread.sleep(0, 0);
					} else {
						Thread.sleep(0, 1);
					}
				} else {
					Thread.sleep(millis, nanos);
				}
			} catch (InterruptedException e) {
				currentThread().processThreadInterrupts();
			}
			return NIL;
		}
	};

	@DocString(name = "mapcar-threads", args = "function", doc = "Applies FUNCTION to all existing threads.")
	private static final Primitive MAPCAR_THREADS = new Primitive("mapcar-threads", PACKAGE_THREADS, true) {
		@Override
		public LispObject execute(LispObject arg) {
			Function fun = checkFunction(arg);
			final LispThread thread = LispThread.currentThread();
			LispObject result = NIL;
			Iterator it = map.values().iterator();
			while (it.hasNext()) {
				LispObject[] args = new LispObject[1];
				args[0] = (LispThread) it.next();
				result = new Cons(Lisp.funcall(fun, args, thread), result);
			}
			return result;
		}
	};

	@DocString(name = "destroy-thread", args = "thread", doc = "Mark THREAD as destroyed")
	private static final Primitive DESTROY_THREAD = new Primitive("destroy-thread", PACKAGE_THREADS, true) {
		@Override
		public LispObject execute(LispObject arg) {
			final LispThread thread;
			if (arg instanceof LispThread) {
				thread = (LispThread) arg;
			} else {
				return type_error(arg, Symbol.THREAD);
			}
			thread.setDestroyed(true);
			return T;
		}
	};

	// => T
	@DocString(name = "interrupt-thread", args = "thread function &rest args", doc = "Interrupts thread and forces it to apply function to args. When the\n" + "function returns, the thread's original computation continues. If\n" + "multiple interrupts are queued for a thread, they are all run, but the\n" + "order is not guaranteed.")
	private static final Primitive INTERRUPT_THREAD = new Primitive("interrupt-thread", PACKAGE_THREADS, true, "thread function &rest args", "Interrupts THREAD and forces it to apply FUNCTION to ARGS.\nWhen the function returns, the thread's original computation continues. If  multiple interrupts are queued for a thread, they are all run, but the order is not guaranteed.") {
		@Override
		public LispObject execute(LispObject[] args) {
			if (args.length < 2)
				return error(new WrongNumberOfArgumentsException(this, 2, -1));
			final LispThread thread;
			if (args[0] instanceof LispThread) {
				thread = (LispThread) args[0];
			} else {
				return type_error(args[0], Symbol.THREAD);
			}
			LispObject fun = args[1];
			LispObject funArgs = NIL;
			for (int i = args.length; i-- > 2;)
				funArgs = new Cons(args[i], funArgs);
			thread.interrupt(fun, funArgs);
			return T;
		}
	};

	public static final Primitive CURRENT_THREAD = new pf_current_thread();

	@DocString(name = "current-thread", doc = "Returns a reference to invoking thread.")
	private static final class pf_current_thread extends Primitive {
		pf_current_thread() {
			super("current-thread", PACKAGE_THREADS, true);
		}

		@Override
		public LispObject execute() {
			return currentThread();
		}
	};

	public static final Primitive BACKTRACE = new pf_backtrace();

	@DocString(name = "backtrace", doc = "Returns a Java backtrace of the invoking thread.")
	private static final class pf_backtrace extends Primitive {
		pf_backtrace() {
			super("backtrace", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject[] args) {
			if (args.length > 1)
				return error(new WrongNumberOfArgumentsException(this, -1, 1));
			int limit = args.length > 0 ? Fixnum.getValue(args[0]) : 0;
			return currentThread().backtrace(limit);
		}
	};

	public static final Primitive FRAME_TO_STRING = new pf_frame_to_string();

	@DocString(name = "frame-to-string", args = "frame", doc = "Convert stack FRAME to a (potentially) readable string.")
	private static final class pf_frame_to_string extends Primitive {
		pf_frame_to_string() {
			super("frame-to-string", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject[] args) {
			if (args.length != 1)
				return error(new WrongNumberOfArgumentsException(this, 1));
			return checkStackFrame(args[0]).toLispString();
		}
	};

	public static final Primitive FRAME_TO_LIST = new pf_frame_to_list();

	@DocString(name = "frame-to-list", args = "frame")
	private static final class pf_frame_to_list extends Primitive {
		pf_frame_to_list() {
			super("frame-to-list", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject[] args) {
			if (args.length != 1)
				return error(new WrongNumberOfArgumentsException(this, 1));

			return checkStackFrame(args[0]).toLispList();
		}
	};

	public static final SpecialOperator SYNCHRONIZED_ON = new so_synchronized_on();

	@DocString(name = "synchronized-on", args = "form &body body")
	private static final class so_synchronized_on extends SpecialOperator {
		so_synchronized_on() {
			super("synchronized-on", PACKAGE_THREADS, true, "form &body body");
		}

		@Override
		public LispObject execute(LispObject args, Environment env) {
			if (args == NIL)
				return error(new WrongNumberOfArgumentsException(this, 1));

			LispThread thread = LispThread.currentThread();
			synchronized (eval(args.car(), env, thread).lockableInstance()) {
				return progn(args.cdr(), env, thread);
			}
		}
	};

	public static final Primitive OBJECT_WAIT = new pf_object_wait();

	@DocString(name = "object-wait", args = "object &optional timeout", doc = "Causes the current thread to block until object-notify or object-notify-all is called on OBJECT.\n" + "Optionally unblock execution after TIMEOUT seconds.  A TIMEOUT of zero\n" + "means to wait indefinitely.\n" + "A non-zero TIMEOUT of less than a nanosecond is interpolated as a nanosecond wait." + "\n"
			+ "See the documentation of java.lang.Object.wait() for further\n" + "information.\n")
	private static final class pf_object_wait extends Primitive {
		pf_object_wait() {
			super("object-wait", PACKAGE_THREADS, true);
		}

		@Override
		public LispObject execute(LispObject object) {
			try {
				object.lockableInstance().wait();
			} catch (InterruptedException e) {
				currentThread().processThreadInterrupts();
			} catch (IllegalMonitorStateException e) {
				return error(new IllegalMonitorState(e.getMessage()));
			}
			return NIL;
		}

		@Override
		public LispObject execute(LispObject object, LispObject timeout) {
			long millis = sleepMillisPart(timeout);
			int nanos = sleepNanosPart(timeout);
			boolean zeroArgP = timeout.ZEROP() != NIL;

			try {
				if (millis == 0 && nanos == 0) {
					if (zeroArgP) {
						object.lockableInstance().wait(0, 0);
					} else {
						object.lockableInstance().wait(0, 1);
					}
				} else {
					object.lockableInstance().wait(millis, nanos);
				}
			} catch (InterruptedException e) {
				currentThread().processThreadInterrupts();
			} catch (IllegalMonitorStateException e) {
				return error(new IllegalMonitorState(e.getMessage()));
			}
			return NIL;
		}
	};

	public static final Primitive OBJECT_NOTIFY = new pf_object_notify();

	@DocString(name = "object-notify", args = "object", doc = "Wakes up a single thread that is waiting on OBJECT's monitor." + "\nIf any threads are waiting on this object, one of them is chosen to be" + " awakened. The choice is arbitrary and occurs at the discretion of the" + " implementation. A thread waits on an object's monitor by calling one" + " of the wait methods.")
	private static final class pf_object_notify extends Primitive {
		pf_object_notify() {
			super("object-notify", PACKAGE_THREADS, true, "object");
		}

		@Override
		public LispObject execute(LispObject object) {
			try {
				object.lockableInstance().notify();
			} catch (IllegalMonitorStateException e) {
				return error(new IllegalMonitorState(e.getMessage()));
			}
			return NIL;
		}
	};

	public static final Primitive OBJECT_NOTIFY_ALL = new pf_object_notify_all();

	@DocString(name = "object-notify-all", args = "object", doc = "Wakes up all threads that are waiting on this OBJECT's monitor." + "\nA thread waits on an object's monitor by calling one of the wait methods.")
	private static final class pf_object_notify_all extends Primitive {
		pf_object_notify_all() {
			super("object-notify-all", PACKAGE_THREADS, true);
		}

		@Override
		public LispObject execute(LispObject object) {
			try {
				object.lockableInstance().notifyAll();
			} catch (IllegalMonitorStateException e) {
				return error(new IllegalMonitorState(e.getMessage()));
			}
			return NIL;
		}
	}

	// for J
	public static void remove(Thread currentThread) {
		synchronized (map) {
			LispThread lt = map.get(currentThread);
			if (lt != null) {
				lt.processThreadInterrupts();
				lt.destroyed = true;
				map.remove(currentThread);
			}
		}
	}

	public SubLThread currentSubLThread() {
		//		Object o  = javaThread;
		//		if(o instanceof  SubLThread){
		//			return (SubLThread) o;
		//		}
		return SubLProcess.currentSubLThread();
	}

	/**
	 * Setter. Sets or updates the prevRet to the passed value.
	 * 
	 * @param prevRet the prevRet to set
	 */
	private LispObject retVal(LispObject prevRet) {
		this.prevRet = prevRet;
		return prevRet;
	}

	/**
	 * TODO Describe the purpose of this method.
	 * 
	 * @param javaStackFrame
	 */
	public void pushStackFrame(JavaStackFrame javaStackFrame) {
		arrayStack.pushStackFrame(javaStackFrame);

	}

	/**
	 * TODO Describe the purpose of this method.
	 */
	protected void resetStack() {
		arrayStack.resetStack();
	}
}
