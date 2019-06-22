/*
 * java
 *
 * Copyright (C) 2003-2007 Peter Graves
 * $Id: java 14465 2013-04-24 12:50:37Z rschlatte $
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

import static org.armedbear.lisp.Lisp.*;
import static org.armedbear.lisp.LispThread.*;

import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

import org.armedbear.lisp.ArgumentListProcessor.KeywordParam;
import org.armedbear.lisp.ArgumentListProcessor.OptionalParam;
import org.logicmoo.system.BeanShellCntrl;
import org.logicmoo.system.SystemCurrent;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CatchableThrowImpl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.util.SafeRunnable;
import com.cyc.tool.subl.util.SubLFiles;

public abstract class StackFrameArrayBased extends SLispObject implements StackFrameHolder {

	/* (non-Javadoc)
	 * @see org.armedbear.lisp.SLispObject#printObjectImpl()
	 */
	public String printObjectImpl() // throws IOException
	{
		return printUglyObjectImpl();
	}
	
	private static class StackMarker {

		final int numArgs;

		StackMarker(int numArgs) {
			this.numArgs = numArgs;
		}

		int getNumArgs() {
			return this.numArgs;
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @return printDepth
	 */
	@Override
	public int getDepth() {
		int fromTop = this.stackPtr;
		int depth = 0;
		while (--fromTop > 0) {
			if (this.stack[fromTop] instanceof StackFrame) {
				depth++;
			}
		}
		return depth;
	}

	// markers for args
	private final static StackMarker STACK_MARKER_0 = new StackMarker(0);
	private final static StackMarker STACK_MARKER_1 = new StackMarker(1);
	private final static StackMarker STACK_MARKER_2 = new StackMarker(2);
	private final static StackMarker STACK_MARKER_3 = new StackMarker(3);
	private final static StackMarker STACK_MARKER_4 = new StackMarker(4);
	private final static StackMarker STACK_MARKER_5 = new StackMarker(5);
	private final static StackMarker STACK_MARKER_6 = new StackMarker(6);
	private final static StackMarker STACK_MARKER_7 = new StackMarker(7);
	private final static StackMarker STACK_MARKER_8 = new StackMarker(8);

	private final int STACK_FRAME_EXTRA = 2;
	// a LispStackFrame with n arguments occupies n + STACK_FRAME_EXTRA elements
	// in {@code stack} array.
	// stack[framePos] == operation
	// stack[framePos + 1 + i] == arg[i]
	// stack[framePos + 1 + n] == initially SrackMarker(n)
	// LispStackFrame object may be lazily allocated later.
	// In this case it is stored in stack framePos + 1 + n]
	//
	// Java stack frame occupies 1 element
	// stack[framePos] == JavaStackFrame
	//
	// Stack consists of a list of StackSegments.
	// Top StackSegment is cached in variables stack and stackPtr.
	private StackSegment topStackSegment = new StackSegment(INITIAL_SEGMENT_SIZE, null);
	public Object[] stack = this.topStackSegment.stack;
	public int stackPtr = 0;
	private StackSegment spareStackSegment;

	private static class StackSegment implements org.armedbear.lisp.protocol.Inspectable {
		final Object[] stack;
		final StackSegment next;
		int stackPtr;

		StackSegment(int size, StackSegment next) {
			this.stack = new Object[size];
			this.next = next;
		}

		@Override
		public LispObject getParts() {
			final Cons result = new Cons(NIL);
			return result.push(new Symbol("INITIAL-SEGMENT-SIZE")).push(LispInteger.getInstance(INITIAL_SEGMENT_SIZE))
					.push(new Symbol("SEGMENT-SIZE")).push(LispInteger.getInstance(SEGMENT_SIZE)).nreverse();
		}
	}

	private void ensureStackCapacity(int itemsToPush) {
		if (skipStackFrame())
			return;
		if (this.stackPtr + (itemsToPush - 1) >= this.stack.length)
			this.grow(itemsToPush);
	}

	private static final int INITIAL_SEGMENT_SIZE = 1 << 10;
	private static final int SEGMENT_SIZE = (1 << 19) - 4; // 4 MiB page on x86_64

	private void grow(int numEntries) {
		if (skipStackFrame()) {
			return;
		}
		this.topStackSegment.stackPtr = this.stackPtr;
		if (this.spareStackSegment != null) {
			// Use spare segement if available
			if (this.stackPtr > 0 && this.spareStackSegment.stack.length >= numEntries) {
				this.topStackSegment = this.spareStackSegment;
				this.stack = this.topStackSegment.stack;
				this.spareStackSegment = null;
				this.stackPtr = 0;
				return;
			}
			this.spareStackSegment = null;
		}
		final int newSize = this.stackPtr + numEntries;
		if (this.topStackSegment.stack.length < SEGMENT_SIZE || this.stackPtr == 0) {
			// grow initial segment from initial size to standard size
			final int newLength = Math.max(newSize, Math.min(SEGMENT_SIZE, this.stack.length * 2));
			final StackSegment newSegment = new StackSegment(newLength, this.topStackSegment.next);
			System.arraycopy(this.stack, 0, newSegment.stack, 0, this.stackPtr);
			this.topStackSegment = newSegment;
			this.stack = this.topStackSegment.stack;
			return;
		}
		// Allocate new segment
		this.topStackSegment = new StackSegment(Math.max(SEGMENT_SIZE, numEntries), this.topStackSegment);
		this.stack = this.topStackSegment.stack;
		this.stackPtr = 0;
	}

	@Override
	public StackFrame getStackTop() {
		if (skipStackFrame()) {
			return null;
		}
		this.topStackSegment.stackPtr = this.stackPtr;
		if (this.stackPtr == 0) {
			assert this.topStackSegment.next == null;
			return null;
		}
		StackFrame prev = null;
		for (StackSegment segment = this.topStackSegment; segment != null; segment = segment.next) {
			final Object[] stk = segment.stack;
			int framePos = segment.stackPtr;
			while (framePos > 0) {
				final Object stackObj = stk[framePos - 1];
				if (stackObj instanceof StackFrame) {
					if (prev != null) {
						prev.setNext((StackFrame) stackObj);
					}
					return (StackFrame) this.stack[this.stackPtr - 1];
				}

				if (!(stackObj instanceof StackMarker)) {
					return null;
					// continue;
				}
				final StackMarker marker = (StackMarker) stackObj;
				final int numArgs = marker.getNumArgs();
				final LispStackFrame frame = new LispStackFrame(stk, framePos - numArgs - this.STACK_FRAME_EXTRA,
						numArgs);
				stk[framePos - 1] = frame;
				if (prev != null) {
					prev.setNext(frame);
				}
				prev = frame;
				framePos -= numArgs + this.STACK_FRAME_EXTRA;
			}
		}
		return (StackFrame) this.stack[this.stackPtr - 1];
	}

	@Override
	public void pushStackFrame(JavaStackFrame frame) {
		if (skipStackFrame())
			return;

		final StackFrame stackTop = this.getStackTop();
		if (stackTop != null) {
			frame.setNext(stackTop);
		}
		this.ensureStackCapacity(1);
		this.stack[this.stackPtr] = frame;
		this.stackPtr += 1;
	}

	private void pushedStackFrame(int numArgs) {
		if (this.trace_calls()) {
			this.printCurrentFrame(">>>", false);
		}
	}

	@Override
	public void popStackFrame(int numArgs) {
		if (skipStackFrame()) {
			return;
		}
		// Pop off intervening JavaFrames until we get back to a LispFrame
		Object stackObj = this.stack[this.stackPtr - 1];
		if (stackObj instanceof StackMarker) {
			assert numArgs == ((StackMarker) stackObj).getNumArgs();
		} else {
			while (stackObj instanceof JavaStackFrame) {
				this.stack[--this.stackPtr] = null;
				stackObj = this.stack[this.stackPtr - 1];
			}
			if (stackObj instanceof StackMarker) {
				assert numArgs == ((StackMarker) stackObj).getNumArgs();
			} else {
				assert numArgs == ((LispStackFrame) stackObj).getNumArgs();
			}
		}
		this.stackPtr -= numArgs + this.STACK_FRAME_EXTRA;
		for (int i = 0; i < numArgs + this.STACK_FRAME_EXTRA; i++) {
			this.stack[this.stackPtr + i] = null;
		}
		if (this.stackPtr == 0) {
			this.popStackSegment();
		}
	}

	private void popStackSegment() {
		if (skipStackFrame())
			return;

		this.topStackSegment.stackPtr = 0;
		if (this.topStackSegment.next != null) {
			this.spareStackSegment = this.topStackSegment;
			this.topStackSegment = this.topStackSegment.next;
			this.stack = this.topStackSegment.stack;
		}
		this.stackPtr = this.topStackSegment.stackPtr;
	}
//
//	public final Environment setEnv(Environment env) {
//		final StackFrame stackTop = this.getStackTop();
//		return (stackTop != null) ? stackTop.setEnv(env) : null;
//	}

	@Override
	public void resetStack() {
		if (skipStackFrame())
			return;
		this.topStackSegment = new StackSegment(INITIAL_SEGMENT_SIZE, null);
		this.stack = this.topStackSegment.stack;
		this.spareStackSegment = null;
		this.stackPtr = 0;
	}

	@Override
	public void pushLispStackFrame(LispObject function) {
		this.ensureStackCapacity(this.STACK_FRAME_EXTRA);
		this.stack[this.stackPtr] = function;
		this.stack[this.stackPtr + 1] = STACK_MARKER_0;
		this.stackPtr += this.STACK_FRAME_EXTRA;
		this.pushedStackFrame(0);
	}

	@Override
	public void pushLispStackFrame(LispObject function, LispObject arg) {
		this.ensureStackCapacity(1 + this.STACK_FRAME_EXTRA);
		this.stack[this.stackPtr] = function;
		this.stack[this.stackPtr + 1] = arg;
		this.stack[this.stackPtr + 2] = STACK_MARKER_1;
		this.stackPtr += 1 + this.STACK_FRAME_EXTRA;
		this.pushedStackFrame(1);
	}

	@Override
	public void pushLispStackFrame(LispObject function, LispObject first, LispObject second) {
		this.ensureStackCapacity(2 + this.STACK_FRAME_EXTRA);
		this.stack[this.stackPtr] = function;
		this.stack[this.stackPtr + 1] = first;
		this.stack[this.stackPtr + 2] = second;
		this.stack[this.stackPtr + 3] = STACK_MARKER_2;
		this.stackPtr += 2 + this.STACK_FRAME_EXTRA;
		this.pushedStackFrame(2);
	}

	@Override
	public void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third) {
		this.ensureStackCapacity(3 + this.STACK_FRAME_EXTRA);
		this.stack[this.stackPtr] = function;
		this.stack[this.stackPtr + 1] = first;
		this.stack[this.stackPtr + 2] = second;
		this.stack[this.stackPtr + 3] = third;
		this.stack[this.stackPtr + 4] = STACK_MARKER_3;
		this.stackPtr += 3 + this.STACK_FRAME_EXTRA;
		this.pushedStackFrame(3);
	}

	@Override
	public void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third,
			LispObject fourth) {
		this.ensureStackCapacity(4 + this.STACK_FRAME_EXTRA);
		this.stack[this.stackPtr] = function;
		this.stack[this.stackPtr + 1] = first;
		this.stack[this.stackPtr + 2] = second;
		this.stack[this.stackPtr + 3] = third;
		this.stack[this.stackPtr + 4] = fourth;
		this.stack[this.stackPtr + 5] = STACK_MARKER_4;
		this.stackPtr += 4 + this.STACK_FRAME_EXTRA;
		this.pushedStackFrame(4);
	}

	@Override
	public void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third,
			LispObject fourth, LispObject fifth) {

		this.ensureStackCapacity(5 + this.STACK_FRAME_EXTRA);
		this.stack[this.stackPtr] = function;
		this.stack[this.stackPtr + 1] = first;
		this.stack[this.stackPtr + 2] = second;
		this.stack[this.stackPtr + 3] = third;
		this.stack[this.stackPtr + 4] = fourth;
		this.stack[this.stackPtr + 5] = fifth;
		this.stack[this.stackPtr + 6] = STACK_MARKER_5;
		this.stackPtr += 5 + this.STACK_FRAME_EXTRA;
		this.pushedStackFrame(5);

	}

	@Override
	public void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third,
			LispObject fourth, LispObject fifth, LispObject sixth) {
		this.ensureStackCapacity(6 + this.STACK_FRAME_EXTRA);
		this.stack[this.stackPtr] = function;
		this.stack[this.stackPtr + 1] = first;
		this.stack[this.stackPtr + 2] = second;
		this.stack[this.stackPtr + 3] = third;
		this.stack[this.stackPtr + 4] = fourth;
		this.stack[this.stackPtr + 5] = fifth;
		this.stack[this.stackPtr + 6] = sixth;
		this.stack[this.stackPtr + 7] = STACK_MARKER_6;
		this.stackPtr += 6 + this.STACK_FRAME_EXTRA;
		this.pushedStackFrame(6);
	}

	@Override
	public void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third,
			LispObject fourth, LispObject fifth, LispObject sixth, LispObject seventh) {

		this.ensureStackCapacity(7 + this.STACK_FRAME_EXTRA);
		this.stack[this.stackPtr] = function;
		this.stack[this.stackPtr + 1] = first;
		this.stack[this.stackPtr + 2] = second;
		this.stack[this.stackPtr + 3] = third;
		this.stack[this.stackPtr + 4] = fourth;
		this.stack[this.stackPtr + 5] = fifth;
		this.stack[this.stackPtr + 6] = sixth;
		this.stack[this.stackPtr + 7] = seventh;
		this.stack[this.stackPtr + 8] = STACK_MARKER_7;
		this.stackPtr += 7 + this.STACK_FRAME_EXTRA;
		this.pushedStackFrame(7);
	}

	@Override
	public void pushLispStackFrame(LispObject function, LispObject first, LispObject second, LispObject third,
			LispObject fourth, LispObject fifth, LispObject sixth, LispObject seventh, LispObject eighth) {
		this.ensureStackCapacity(8 + this.STACK_FRAME_EXTRA);
		this.stack[this.stackPtr] = function;
		this.stack[this.stackPtr + 1] = first;
		this.stack[this.stackPtr + 2] = second;
		this.stack[this.stackPtr + 3] = third;
		this.stack[this.stackPtr + 4] = fourth;
		this.stack[this.stackPtr + 5] = fifth;
		this.stack[this.stackPtr + 6] = sixth;
		this.stack[this.stackPtr + 7] = seventh;
		this.stack[this.stackPtr + 8] = eighth;
		this.stack[this.stackPtr + 9] = STACK_MARKER_8;
		this.stackPtr += 8 + this.STACK_FRAME_EXTRA;
	}

	@Override
	public void pushLispStackFrame(LispObject function, LispObject[] args) {
		this.ensureStackCapacity(args.length + this.STACK_FRAME_EXTRA);
		this.stack[this.stackPtr] = function;
		System.arraycopy(args, 0, this.stack, this.stackPtr + 1, args.length);
		this.stack[this.stackPtr + args.length + 1] = new StackMarker(args.length);
		this.stackPtr += args.length + this.STACK_FRAME_EXTRA;
	}

//	private void printBacktrace() {
//		this.printBacktrace(0);
//	}

	@Override
	public void printBacktrace(int limit) {
		if (skipStackFrame())
			return;
		final StackFrame stackTop = this.getStackTop();
		if (stackTop != null) {
			int count = 0;
			final Stream out = checkCharacterOutputStream(Symbol.TRACE_OUTPUT.symbolValue());
			out._writeLine("Evaluation stack:");
			out._finishOutput();

			StackFrame s = stackTop;
			while (s != null) {
				out._writeString("  ");
				out._writeString(String.valueOf(count));
				out._writeString(": ");

				this.pprintCall(s.toLispList(), out.getCharPos(), out);
				out.terpri();
				out._finishOutput();
				if (limit > 0 && ++count == limit)
					break;
				s = s.next;
			}
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @param lispList
	 * @param charPos
	 * @param out
	 */
	protected abstract void pprintCall(LispObject lispList, int charPos, Stream out);

	private LispObject backtrace(int limit) {
		if (skipStackFrame())
			return NIL;
		final StackFrame stackTop = this.getStackTop();
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

	@Override
	public void incrementCallCounts() {
		if (skipStackFrame())
			return;
		this.topStackSegment.stackPtr = this.stackPtr;
		int depth = 0;
		for (StackSegment segment = this.topStackSegment; segment != null; segment = segment.next) {
			final Object[] stk = segment.stack;
			int framePos = segment.stackPtr;
			while (framePos > 0) {
				depth++;
				final Object stackObj = stk[framePos - 1];
				int numArgs;
				if (stackObj instanceof StackMarker) {
					numArgs = ((StackMarker) stackObj).getNumArgs();
				} else if (stackObj instanceof LispStackFrame) {
					numArgs = ((LispStackFrame) stackObj).getNumArgs();
				} else {
					assert stackObj instanceof JavaStackFrame;
					framePos--;
					continue;
				}
				// lisp stack frame
				framePos -= numArgs + this.STACK_FRAME_EXTRA;
				final LispObject operator = (LispObject) this.stack[framePos];
				if (operator != null) {
					if (depth <= 8) {
						operator.incrementHotCount();
					}
					operator.incrementCallCount();
				}
			}
		}
	}

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @param obj
	 * @return
	 */
	protected abstract String safePrintObject(LispObject obj);

//	/**
//	 * TODO (ext:trace-lisp t)
//	 */
//	PrintStream ps = System.err;
//	private LispObject prevRet;
//	protected Object insideSafePrintObject;

	abstract void printCurrentFrame(String why, boolean iSOut);

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @return
	 */
	protected abstract String getThreadName();

	/**
	 * TODO Describe the purpose of this method.
	 *
	 * @return
	 */
	abstract boolean trace_calls();

	/**
	 * Getter. Retrieves the noStackFrames.
	 * 
	 * @return the noStackFrames
	 */
	abstract public boolean skipStackFrame();
}
