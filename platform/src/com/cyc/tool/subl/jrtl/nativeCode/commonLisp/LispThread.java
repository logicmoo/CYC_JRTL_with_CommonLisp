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

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class LispThread extends AbstractLispObject implements UncaughtExceptionHandler {
	static ArrayList<LispThread> threads = new ArrayList<LispThread>();
	public static LispThread firstThread = new LispThread(Thread.currentThread());

	static boolean use_fast_calls = false;

	static int UNASSIGNED_SPECIAL_INDEX = 0;

	// use a concurrent hashmap: we may want to add threads
	// while at the same time iterating the hash
	// static ConcurrentHashMap<Thread,LispThread> map =
	// new ConcurrentHashMap<Thread,LispThread>();
	//
	// private static ThreadLocal<LispThread> threads = new
	// ThreadLocal<LispThread>(){
	//
	// public LispThread initialValue() {
	// Thread thisThread = Thread.currentThread();
	// LispThread thread = LispThread.map.get(thisThread);
	// if (thread == null) {
	// thread = new LispThread(thisThread);
	// LispThread.map.put(thisThread,thread);
	// }
	// return thread;
	// }
	// };

	/**
	 * Indicates the last special slot which has been assigned. Symbols which
	 * don't have a special slot assigned use a slot index of 0 for efficiency
	 * reasons: it eliminates the need to check for index validity before
	 * accessing the specials array.
	 *
	 */
	static AtomicInteger lastSpecial = new AtomicInteger(LispThread.UNASSIGNED_SPECIAL_INDEX);

	/**
	 * This array stores the symbols associated with the special bindings slots.
	 */
	static SubLSymbol[] specialNames = new SubLSymbol[4097];
	// ### make-thread
	private static Primitive MAKE_THREAD = new JavaPrimitive("make-thread", Lisp.PACKAGE_THREADS, true,
			"function &optional &key name") {

		public SubLObject execute(SubLObject[] args) {
			int length = args.length;
			if (length == 0)
				Lisp.error(new WrongNumberOfArgumentsException(this));
			SubLObject name = Lisp.NIL;
			if (length > 1) {
				if ((length - 1) % 2 != 0)
					Lisp.error(new ProgramError("Odd number of keyword arguments."));
				if (length > 3)
					Lisp.error(new WrongNumberOfArgumentsException(this));
				if (args[1] == Keyword.NAME)
					name = args[2].STRING();
				else
					Lisp.error(new ProgramError("Unrecognized keyword argument " + args[1].writeToString() + "."));
			}
			return new LispThread(Lisp.checkFunction(args[0]), name);
		}
	};
	// ### threadp
	private static Primitive THREADP = new JavaPrimitive("threadp", Lisp.PACKAGE_THREADS, true, "object",
			"Boolean predicate as whether OBJECT is a thread.") {

		public SubLObject execute(SubLObject arg) {
			return arg instanceof LispThread ? Lisp.T : Lisp.NIL;
		}
	};
	// ### thread-alive-p
	private static Primitive THREAD_ALIVE_P = new JavaPrimitive("thread-alive-p", Lisp.PACKAGE_THREADS, true, "thread",
			"Boolean predicate whether THREAD is alive.") {

		public SubLObject execute(SubLObject arg) {
			LispThread lispThread;
			if (arg instanceof LispThread)
				lispThread = (LispThread) arg;
			else
				return Lisp.type_error(arg, LispSymbols.THREAD);
			return lispThread.javaThread.isAlive() ? Lisp.T : Lisp.NIL;
		}
	};
	// ### thread-name
	private static Primitive THREAD_NAME = new JavaPrimitive("thread-name", Lisp.PACKAGE_THREADS, true, "thread",
			"Return the name of THREAD if it has one.") {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof LispThread)
				return ((LispThread) arg).name;
			return Lisp.type_error(arg, LispSymbols.THREAD);
		}
	};
	// ### sleep
	private static Primitive SLEEP = new JavaPrimitive("sleep", Lisp.PACKAGE_CL, true, "seconds",
			"Causes the invoking thread to sleep for SECONDS seconds.\nSECONDS may be a value between 0 1and 1.") {

		public SubLObject execute(SubLObject arg) {

			try {
				Thread.sleep(LispThread.javaSleepInterval(arg));
			} catch (InterruptedException e) {
				LispThread.currentThread().processThreadInterrupts();
			}
			return Lisp.NIL;
		}
	};

	// ### mapcar-threads
	private static Primitive MAPCAR_THREADS = new JavaPrimitive("mapcar-threads", Lisp.PACKAGE_THREADS, true,
			"function", "Applies FUNCTION to all existing threads.") {

		public SubLObject execute(SubLObject arg) {
			Function fun = Lisp.checkFunction(arg);
			LispThread thread = LispThread.currentThread();
			SubLObject result = Lisp.NIL;
			Iterator it = LispThread.threads.iterator();// map.values().iterator();
			while (it.hasNext()) {
				SubLObject[] args = LispObjectFactory.makeLispObjectArray(1);
				args[0] = (LispThread) it.next();
				result = LispObjectFactory.makeCons(Lisp.funcall(fun, args, thread), result);
			}
			return result;
		}
	};

	// ### destroy-thread
	private static Primitive DESTROY_THREAD = new JavaPrimitive("destroy-thread", Lisp.PACKAGE_THREADS, true, "thread",
			"Mark THREAD as destroyed.") {

		public SubLObject execute(SubLObject arg) {
			LispThread thread;
			if (arg instanceof LispThread)
				thread = (LispThread) arg;
			else
				return Lisp.type_error(arg, LispSymbols.THREAD);
			thread.setDestroyed(true);
			return Lisp.T;
		}
	};

	// ### interrupt-thread thread function &rest args => T
	// Interrupts thread and forces it to apply function to args. When the
	// function returns, the thread's original computation continues. If
	// multiple interrupts are queued for a thread, they are all run, but the
	// order is not guaranteed.
	private static Primitive INTERRUPT_THREAD = new JavaPrimitive("interrupt-thread", Lisp.PACKAGE_THREADS, true,
			"thread function &rest args",
			"Interrupts THREAD and forces it to apply FUNCTION to ARGS.\nWhen the function returns, the thread's original computation continues. If  multiple interrupts are queued for a thread, they are all run, but the order is not guaranteed.") {

		public SubLObject execute(SubLObject[] args) {
			if (args.length < 2)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			LispThread thread;
			if (args[0] instanceof LispThread)
				thread = (LispThread) args[0];
			else
				return Lisp.type_error(args[0], LispSymbols.THREAD);
			SubLObject fun = args[1];
			SubLObject funArgs = Lisp.NIL;
			for (int i = args.length; i-- > 2;)
				funArgs = LispObjectFactory.makeCons(args[i], funArgs);
			thread.interrupt(fun, funArgs);
			return Lisp.T;
		}
	};

	// ### current-thread
	private static Primitive CURRENT_THREAD = new JavaPrimitive("current-thread", Lisp.PACKAGE_THREADS, true, "",
			"Returns a reference to invoking thread.") {

		public SubLObject execute() {
			return LispThread.currentThread();
		}
	};

	// ### backtrace
	private static Primitive BACKTRACE = new JavaPrimitive("backtrace", Lisp.PACKAGE_SYS, true, "",
			"Returns a backtrace of the invoking thread.") {

		public SubLObject execute(SubLObject[] args)

		{
			if (args.length > 1)
				return Lisp.error(new WrongNumberOfArgumentsException(this));
			int limit = args.length > 0 ? args[0].intValue() : 0;
			return LispThread.currentThread().backtrace(limit);
		}
	};

	// ### frame-to-string
	private static Primitive FRAME_TO_STRING = new JavaPrimitive("frame-to-string", Lisp.PACKAGE_SYS, true, "frame") {

		public SubLObject execute(SubLObject[] args)

		{
			if (args.length != 1)
				return Lisp.error(new WrongNumberOfArgumentsException(this));

			return Lisp.checkStackFrame(args[0]).toLispString();
		}
	};

	// ### frame-to-list
	private static Primitive FRAME_TO_LIST = new JavaPrimitive("frame-to-list", Lisp.PACKAGE_SYS, true, "frame") {

		public SubLObject execute(SubLObject[] args)

		{
			if (args.length != 1)
				return Lisp.error(new WrongNumberOfArgumentsException(this));

			return Lisp.checkStackFrame(args[0]).toLispList();
		}
	};

	static {
		// FIXME: this block has been added for pre-0.16 compatibility
		// and can be removed the latest at release 0.22
		Lisp.PACKAGE_EXT.export(Lisp.intern("MAKE-THREAD", Lisp.PACKAGE_THREADS));
		Lisp.PACKAGE_EXT.export(Lisp.intern("THREADP", Lisp.PACKAGE_THREADS));
		Lisp.PACKAGE_EXT.export(Lisp.intern("THREAD-ALIVE-P", Lisp.PACKAGE_THREADS));
		Lisp.PACKAGE_EXT.export(Lisp.intern("THREAD-NAME", Lisp.PACKAGE_THREADS));
		Lisp.PACKAGE_EXT.export(Lisp.intern("MAPCAR-THREADS", Lisp.PACKAGE_THREADS));
		Lisp.PACKAGE_EXT.export(Lisp.intern("DESTROY-THREAD", Lisp.PACKAGE_THREADS));
		Lisp.PACKAGE_EXT.export(Lisp.intern("INTERRUPT-THREAD", Lisp.PACKAGE_THREADS));
		Lisp.PACKAGE_EXT.export(Lisp.intern("CURRENT-THREAD", Lisp.PACKAGE_THREADS));
	}

	// ### use-fast-calls
	private static Primitive USE_FAST_CALLS = new JavaPrimitive("use-fast-calls", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			LispThread.use_fast_calls = arg != Lisp.NIL;
			return LispThread.use_fast_calls ? Lisp.T : Lisp.NIL;
		}
	};

	// ### synchronized-on
	private static SpecialOperator SYNCHRONIZED_ON = new SpecialOperator("synchronized-on", Lisp.PACKAGE_THREADS, true,
			"form &body body") {

		public SubLObject execute(SubLObject args, Environment env)

		{
			if (args == Lisp.NIL)
				return Lisp.error(new WrongNumberOfArgumentsException(this));

			LispThread thread = LispThread.currentThread();
			synchronized (Lisp.eval(args.first(), env, thread).lockableInstance()) {
				return Lisp.progn(args.rest(), env, thread);
			}
		}
	};

	// ### object-wait
	private static Primitive OBJECT_WAIT = new JavaPrimitive("object-wait", Lisp.PACKAGE_THREADS, true,
			"object &optional timeout") {

		public SubLObject execute(SubLObject object)

		{
			try {
				object.lockableInstance().wait();
			} catch (InterruptedException e) {
				LispThread.currentThread().processThreadInterrupts();
			} catch (IllegalMonitorStateException e) {
				return Lisp.error(new IllegalMonitorState());
			}
			return Lisp.NIL;
		}

		public SubLObject execute(SubLObject object, SubLObject timeout)

		{
			try {
				object.lockableInstance().wait(LispThread.javaSleepInterval(timeout));
			} catch (InterruptedException e) {
				LispThread.currentThread().processThreadInterrupts();
			} catch (IllegalMonitorStateException e) {
				return Lisp.error(new IllegalMonitorState());
			}
			return Lisp.NIL;
		}
	};

	// ### object-notify
	private static Primitive OBJECT_NOTIFY = new JavaPrimitive("object-notify", Lisp.PACKAGE_THREADS, true, "object") {

		public SubLObject execute(SubLObject object)

		{
			try {
				object.lockableInstance().notify();
			} catch (IllegalMonitorStateException e) {
				return Lisp.error(new IllegalMonitorState());
			}
			return Lisp.NIL;
		}
	};

	// ### object-notify-all
	private static Primitive OBJECT_NOTIFY_ALL = new JavaPrimitive("object-notify-all", Lisp.PACKAGE_THREADS, true,
			"object") {

		public SubLObject execute(SubLObject object)

		{
			try {
				object.lockableInstance().notifyAll();
			} catch (IllegalMonitorStateException e) {
				return Lisp.error(new IllegalMonitorState());
			}
			return Lisp.NIL;
		}
	};

	/**
	 * Assigns a specials array index number to the symbol, if it doesn't
	 * already have one.
	 */
	private static void assignSpecialIndex(SubLSymbol osym) {
		SubLSymbol sym = osym;
		int specialIndex = sym.getSpecialIndex();
		if (specialIndex != 0)
			return;

		synchronized (sym) {
			// Don't use an atomic access: we'll be swapping values only once.
			if (specialIndex == 0) {
				int n = LispThread.lastSpecial.incrementAndGet();
				sym.setSpecialIndex(n);
				LispThread.specialNames[n] = sym;
			}
		}
	}

	public static LispThread currentThread() {
		// if (true) return
		return (LispThread) Thread.currentThread().getUncaughtExceptionHandler();
		// Thread jt = Thread.currentThread();
		// UncaughtExceptionHandler eh = jt.getUncaughtExceptionHandler();
		// if (eh instanceof LispThread) return (LispThread)eh;
		// Thread.dumpStack();
		// return null;
		// return threads.get();
	}

	public static long javaSleepInterval(SubLObject lispSleep)

	{
		double d = Lisp.checkDoubleFloat(lispSleep.mult(LispObjectFactory.makeDouble(1000))).doubleValue();
		if (d < 0)
			Lisp.type_error(lispSleep, Lisp.list(LispSymbols.REAL, Fixnum.ZERO));

		return d < Long.MAX_VALUE ? (long) d : Long.MAX_VALUE;
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
				if (first == LispSymbols.LET)
					newlineBefore = true;
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
				LispThread.pprint(array[i], indentBy + 2, stream);
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

	Thread javaThread;

	private boolean destroyed;

	SubLObject name;

	public SubLObject[] _values;

	private boolean threadInterrupted;

	private SubLObject pending = null;

	protected UncaughtExceptionHandler bubbble;

	/**
	 * This array stores the current special binding for every symbol which has
	 * been globally or locally declared special.
	 *
	 * If the array element has a null value, this means there currently is no
	 * active binding. If the array element contains a valid SpecialBinding
	 * object, but the value field of it is null, that indicates an "UNBOUND
	 * VARIABLE" situation.
	 */
	SpecialBinding[] specials = new SpecialBinding[4097];

	/**
	 * This variable points to the head of a linked list of saved special
	 * bindings. Its main purpose is to allow a mark/reset interface to special
	 * binding and unbinding.
	 */
	private SpecialBindingsMark savedSpecials = null;

	private SubLObject catchTags = null;

	private StackFrame stack = null;

	LispThread(final Function fun, SubLObject name) {
		Runnable r = new Runnable() {
			public void run() {
				try {
					Lisp.funcall(fun, LispObjectFactory.makeLispObjectArray(0), LispThread.this);
				} catch (ThreadDestroyed ignored) {
					// Might happen.
				} catch (Throwable t) { // any error: process thread interrupts
					if (LispThread.this.isInterrupted())
						LispThread.this.processThreadInterrupts();
				} finally {
					// make sure the thread is *always* removed from the hash
					// again
					// map.remove(Thread.currentThread());
					Thread.currentThread().setUncaughtExceptionHandler(LispThread.this.bubbble);
					LispThread.threads.remove(LispThread.this);
				}
			}
		};
		this.javaThread = new Thread(r);
		this.bubbble = this.javaThread.getUncaughtExceptionHandler();
		if (this.bubbble instanceof LispThread)
			System.err.println("Bubble is a lisp thread!");
		this.javaThread.setUncaughtExceptionHandler(this);
		this.add(this);
		this.name = name;
		// map.put(javaThread, this);
		if (name != Lisp.NIL)
			this.javaThread.setName(name.getString());
		this.javaThread.setDaemon(true);
		this.javaThread.start();
	}

	LispThread(Thread javaThread) {
		this.javaThread = javaThread;
		LispThread.threads.add(this);
		this.bubbble = javaThread.getUncaughtExceptionHandler();
		if (this.bubbble instanceof LispThread)
			System.err.println("Bubble is a lisp thread!");
		javaThread.setUncaughtExceptionHandler(this);
		this.name = LispObjectFactory.makeString(javaThread.getName());
	}

	// Used by the JVM compiler for MULTIPLE-VALUE-CALL.
	public SubLObject[] accumulateValues(SubLObject result, SubLObject[] oldValues) {
		if (oldValues == null) {
			if (this._values != null)
				return this._values;
			SubLObject[] values = LispObjectFactory.makeLispObjectArray(1);
			values[0] = result;
			return values;
		}
		if (this._values != null) {
			if (this._values.length == 0)
				return oldValues;
			int totalLength = oldValues.length + this._values.length;
			SubLObject[] values = LispObjectFactory.makeLispObjectArray(totalLength);
			System.arraycopy(oldValues, 0, values, 0, oldValues.length);
			System.arraycopy(this._values, 0, values, oldValues.length, this._values.length);
			return values;
		}
		// _values is null.
		int totalLength = oldValues.length + 1;
		SubLObject[] values = LispObjectFactory.makeLispObjectArray(totalLength);
		System.arraycopy(oldValues, 0, values, 0, oldValues.length);
		values[totalLength - 1] = result;
		return values;
	}

	public SubLObject backtrace(int limit) {
		SubLObject result = Lisp.NIL;
		if (this.stack != null) {
			int count = 0;
			StackFrame s = this.stack;
			while (s != null) {
				result = result.push(s);
				if (limit > 0 && ++count == limit)
					break;
				s = s.getNext();
			}
		}
		return result.nreverse();
	}

	public SpecialBinding bindSpecial(SubLSymbol name, SubLObject value) {
		int idx;

		LispThread.assignSpecialIndex(name);
		SpecialBinding binding = this.specials[idx = name.getSpecialIndex()];
		this.savedSpecials = new SpecialBindingsMark(idx, binding, this.savedSpecials);
		return this.specials[idx] = new SpecialBinding(idx, value);
	}

	public SpecialBinding bindSpecialToCurrentValue(SubLSymbol name) {
		int idx;

		LispThread.assignSpecialIndex(name);
		SpecialBinding binding = this.specials[idx = name.getSpecialIndex()];
		this.savedSpecials = new SpecialBindingsMark(idx, binding, this.savedSpecials);
		return this.specials[idx] = new SpecialBinding(idx, binding == null ? name.getSymbolValue() : binding.value);
	}

	public SubLObject classOf() {
		return BuiltInClass.THREAD;
	}

	/**
	 * Clears out all active special bindings including any marks previously
	 * set. Invoking resetSpecialBindings() with marks set before this call
	 * results in undefined behaviour.
	 */
	// Package level access: only for Interpreter.run()
	void clearSpecialBindings() {
		this.resetSpecialBindings(null);
	}

	public void clearValues() {
		this._values = null;
	}

	public SubLObject execute(SubLObject function) {
		if (LispThread.use_fast_calls)
			return function.execute();

		this.pushStackFrame(new LispStackFrame(function));
		try {
			return function.execute();
		} finally {
			this.popStackFrame();
		}
	}

	public SubLObject execute(SubLObject function, SubLObject arg)

	{
		if (LispThread.use_fast_calls)
			return function.execute(arg);

		this.pushStackFrame(new LispStackFrame(function, arg));
		try {
			return function.execute(arg);
		} finally {
			this.popStackFrame();
		}
	}

	public SubLObject execute(SubLObject function, SubLObject first, SubLObject second)

	{
		if (LispThread.use_fast_calls)
			return function.execute(first, second);

		this.pushStackFrame(new LispStackFrame(function, first, second));
		try {
			return function.execute(first, second);
		} finally {
			this.popStackFrame();
		}
	}

	public SubLObject execute(SubLObject function, SubLObject first, SubLObject second, SubLObject third)

	{
		if (LispThread.use_fast_calls)
			return function.execute(first, second, third);

		this.pushStackFrame(new LispStackFrame(function, first, second, third));
		try {
			return function.execute(first, second, third);
		} finally {
			this.popStackFrame();
		}
	}

	public SubLObject execute(SubLObject function, SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth)

	{
		if (LispThread.use_fast_calls)
			return function.execute(first, second, third, fourth);

		this.pushStackFrame(new LispStackFrame(function, first, second, third, fourth));
		try {
			return function.execute(first, second, third, fourth);
		} finally {
			this.popStackFrame();
		}
	}

	public SubLObject execute(SubLObject function, SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth, SubLObject fifth)

	{
		if (LispThread.use_fast_calls)
			return function.execute(first, second, third, fourth, fifth);

		this.pushStackFrame(new LispStackFrame(function, first, second, third, fourth, fifth));
		try {
			return function.execute(first, second, third, fourth, fifth);
		} finally {
			this.popStackFrame();
		}
	}

	public SubLObject execute(SubLObject function, SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth, SubLObject fifth, SubLObject sixth)

	{
		if (LispThread.use_fast_calls)
			return function.execute(first, second, third, fourth, fifth, sixth);

		this.pushStackFrame(new LispStackFrame(function, first, second, third, fourth, fifth, sixth));
		try {
			return function.execute(first, second, third, fourth, fifth, sixth);
		} finally {
			this.popStackFrame();
		}
	}

	public SubLObject execute(SubLObject function, SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth, SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		if (LispThread.use_fast_calls)
			return function.execute(first, second, third, fourth, fifth, sixth, seventh);

		this.pushStackFrame(new LispStackFrame(function, first, second, third, fourth, fifth, sixth, seventh));
		try {
			return function.execute(first, second, third, fourth, fifth, sixth, seventh);
		} finally {
			this.popStackFrame();
		}
	}

	public SubLObject execute(SubLObject function, SubLObject first, SubLObject second, SubLObject third,
			SubLObject fourth, SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		if (LispThread.use_fast_calls)
			return function.execute(first, second, third, fourth, fifth, sixth, seventh, eighth);

		this.pushStackFrame(new LispStackFrame(function, first, second, third, fourth, fifth, sixth, seventh, eighth));
		try {
			return function.execute(first, second, third, fourth, fifth, sixth, seventh, eighth);
		} finally {
			this.popStackFrame();
		}
	}

	public SubLObject execute(SubLObject function, SubLObject[] args)

	{
		if (LispThread.use_fast_calls)
			return function.execute(args);

		this.pushStackFrame(new LispStackFrame(function, args));
		try {
			return function.execute(args);
		} finally {
			this.popStackFrame();
		}
	}

	public StackTraceElement[] getJavaStackTrace() {
		return this.javaThread.getStackTrace();
	}

	public SpecialBinding getSpecialBinding(SubLSymbol name) {
		return this.specials[name.getSpecialIndex()];
	}

	@Deprecated
	public SubLObject getStack() {
		return Lisp.NIL;
	}

	public SubLObject[] getValues() {
		return this._values;
	}

	public SubLObject[] getValues(SubLObject result, int count) {
		if (this._values == null) {
			SubLObject[] values = LispObjectFactory.makeLispObjectArray(count);
			if (count > 0)
				values[0] = result;
			for (int i = 1; i < count; i++)
				values[i] = Lisp.NIL;
			return values;
		}
		// If the caller doesn't want any extra values, just return the ones
		// we've got.
		if (count <= this._values.length)
			return this._values;
		// The caller wants more values than we have. Pad with NILs.
		SubLObject[] values = LispObjectFactory.makeLispObjectArray(count);
		for (int i = this._values.length; i-- > 0;)
			values[i] = this._values[i];
		for (int i = this._values.length; i < count; i++)
			values[i] = Lisp.NIL;
		return values;
	}

	public void incrementCallCounts() {
		StackFrame s = this.stack;

		for (int i = 0; i < 8; i++) {
			if (s == null)
				break;
			if (s instanceof LispStackFrame) {
				LispStackFrame sf = (LispStackFrame) s;
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
				LispStackFrame sf = (LispStackFrame) s;
				SubLObject operator = sf.getOperator();
				if (operator != null)
					operator.incrementCallCount(sf.getArity());
			}
			s = s.getNext();
		}
	}

	synchronized void interrupt(SubLObject function, SubLObject args) {
		if (this.pending == null)
			this.pending = Lisp.NIL;
		this.pending = LispObjectFactory.makeCons(args, this.pending);
		this.pending = LispObjectFactory.makeCons(function, this.pending);
		this.threadInterrupted = true;
		this.javaThread.interrupt();
	}

	public synchronized boolean isDestroyed() {
		return this.destroyed;
	}

	synchronized boolean isInterrupted() {
		return this.threadInterrupted;
	}

	/**
	 * Looks up the value of a special binding in the context of the given
	 * thread.
	 *
	 * In order to find the value of a special variable (in general), use
	 * {@link SubLSymbol#symbolValue}.
	 *
	 * @param name
	 *            The name of the special variable, normally a symbol
	 * @return The inner most binding of the special, or null if unbound
	 *
	 * @see SubLSymbol#symbolValue
	 */
	public SubLObject lookupSpecial(SubLSymbol name) {
		SpecialBinding binding = this.specials[name.getSpecialIndex()];
		return binding == null ? null : binding.value;
	}

	/**
	 * Marks the state of the special bindings, for later rewinding by
	 * resetSpecialBindings().
	 */
	public SpecialBindingsMark markSpecialBindings() {
		return this.savedSpecials;
	}

	public SubLObject nothing() {
		this._values = LispObjectFactory.makeLispObjectArray(0);
		return Lisp.NIL;
	}

	public void popCatchTag() {
		if (this.catchTags == null)
			this.catchTags = Lisp.NIL;
		if (this.catchTags != Lisp.NIL)
			this.catchTags = this.catchTags.rest();
		else
			Debug.assertTrue(false);
	}

	public void popStackFrame() {
		if (this.stack != null)
			this.stack = this.stack.getNext();
	}

	public void printBacktrace() {
		this.printBacktrace(0);
	}

	public void printBacktrace(int limit) {
		if (this.stack != null) {
			int count = 0;
			LispStream out = Lisp.checkCharacterOutputStream(LispSymbols.TRACE_OUTPUT.symbolValue());
			out._writeLine("Evaluation stack:");
			out._finishOutput();

			StackFrame s = this.stack;
			while (s != null) {
				out._writeString("  ");
				out._writeString(String.valueOf(count));
				out._writeString(": ");

				LispThread.pprint(s.toLispList(), out.getCharPos(), out);
				out.terpri();
				out._finishOutput();
				if (limit > 0 && ++count == limit)
					break;
				s = s.next;
			}
		}
	}

	synchronized void processThreadInterrupts()

	{
		if (this.pending == null)
			this.pending = Lisp.NIL;
		while (this.pending != Nil.NIL) {
			SubLObject function = this.pending.first();
			SubLObject args = this.pending.second();
			this.pending = this.pending.cddr();
			Primitives.APPLY.execute(function, args);
		}
		this.threadInterrupted = false;
	}

	public void pushCatchTag(SubLObject tag) {
		if (this.catchTags == null)
			this.catchTags = Lisp.NIL;
		this.catchTags = LispObjectFactory.makeCons(tag, this.catchTags);
	}

	public SubLObject pushSpecial(SubLSymbol name, SubLObject thing)

	{
		SpecialBinding binding = this.specials[name.getSpecialIndex()];
		if (binding != null)
			return binding.value = LispObjectFactory.makeCons(thing, binding.value);

		SubLObject value = name.getSymbolValue();
		if (value != null) {
			SubLObject newValue = LispObjectFactory.makeCons(thing, value);
			name.setSymbolValue(newValue);
			return newValue;
		} else
			return Lisp.error(new UnboundVariable(name));
	}

	public void pushStackFrame(StackFrame frame) {
		frame.setNext(this.stack);
		this.stack = frame;
		if (Lisp.profiling)
			if (!Lisp.sampling)
				frame.incrementCalls();
	}

	public void rebindSpecial(SubLSymbol name, SubLObject value) {
		SpecialBinding binding = this.getSpecialBinding(name);
		binding.value = value;
	}

	/**
	 * Restores the state of the special bindings to what was captured in the
	 * marker 'mark' by a call to markSpecialBindings().
	 */
	public void resetSpecialBindings(SpecialBindingsMark mark) {
		SpecialBindingsMark c = this.savedSpecials;
		while (mark != c) {
			this.specials[c.idx] = c.binding;
			c = c.next;
		}
		this.savedSpecials = c;
	}

	public void resetStack() {
		this.stack = null;
	}

	// Returns symbol value or NIL if unbound.
	public SubLObject safeSymbolValue(SubLSymbol name) {
		SpecialBinding binding = this.specials[name.getSpecialIndex()];
		if (binding != null)
			return binding.value;

		SubLObject value = name.getSymbolValue();
		return value != null ? value : Lisp.NIL;
	}

	synchronized void setDestroyed(boolean b) {
		this.destroyed = b;
	}

	public SubLObject setSpecialVariable(SubLSymbol name, SubLObject value) {
		SpecialBinding binding = this.specials[name.getSpecialIndex()];
		if (binding != null)
			return binding.value = value;

		name.setSymbolValue(value);
		return value;
	}

	@Deprecated
	public void setStack(SubLObject stack) {
	}

	public SubLObject setValues() {
		this._values = LispObjectFactory.makeLispObjectArray(0);
		return Lisp.NIL;
	}

	public SubLObject setValues(SubLObject value1) {
		this._values = null;
		return value1;
	}

	public SubLObject setValues(SubLObject value1, SubLObject value2) {
		this._values = LispObjectFactory.makeLispObjectArray(2);
		this._values[0] = value1;
		this._values[1] = value2;
		return value1;
	}

	public SubLObject setValues(SubLObject value1, SubLObject value2, SubLObject value3) {
		this._values = LispObjectFactory.makeLispObjectArray(3);
		this._values[0] = value1;
		this._values[1] = value2;
		this._values[2] = value3;
		return value1;
	}

	public SubLObject setValues(SubLObject value1, SubLObject value2, SubLObject value3, SubLObject value4) {
		this._values = LispObjectFactory.makeLispObjectArray(4);
		this._values[0] = value1;
		this._values[1] = value2;
		this._values[2] = value3;
		this._values[3] = value4;
		return value1;
	}

	public SubLObject setValues(SubLObject[] values) {
		switch (values.length) {
		case 0:
			this._values = values;
			return Lisp.NIL;
		case 1:
			this._values = null;
			return values[0];
		default:
			this._values = values;
			return values[0];
		}
	}

	public void throwToTag(SubLObject tag, SubLObject result)

	{
		if (this.catchTags == null)
			this.catchTags = Lisp.NIL;
		SubLObject rest = this.catchTags;
		while (rest != Lisp.NIL) {
			if (rest.first() == tag)
				throw new Throw(tag, result, this);
			rest = rest.rest();
		}
		Lisp.error(new ControlError("Attempt to throw to the nonexistent tag " + tag.writeToString() + "."));
	}

	public SubLObject typeOf() {
		return LispSymbols.THREAD;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.THREAD)
			return Lisp.T;
		if (typeSpecifier == BuiltInClass.THREAD)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}

	public void uncaughtException(Thread t, Throwable e) {
		this.bubbble.uncaughtException(t, e);
	}

	// Forces a single value, for situations where multiple values should be
	// ignored.
	public SubLObject value(SubLObject obj) {
		this._values = null;
		return obj;
	}

	public String writeToString() {
		StringBuffer sb = new StringBuffer("THREAD");
		if (this.name != Lisp.NIL) {
			sb.append(" \"");
			sb.append(this.name.getString());
			sb.append("\"");
		}
		return this.unreadableString(sb.toString());
	}

}
