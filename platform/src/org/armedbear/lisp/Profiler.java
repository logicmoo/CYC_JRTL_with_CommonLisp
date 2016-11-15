/*
 * Profiler.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: Profiler.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class Profiler {
	protected static class SymCounts implements Comparable<SymCounts> {
		public SubLSymbol lo;
		public int count;

		public SymCounts(SubLSymbol symbol, int total) {
			this.lo = symbol;
			this.count = total;
		}

		public int compareTo(SymCounts o) {
			if (o.equals(this))
				return 0;
			if (this.count == o.count)
				return this.lo.hashCodeLisp() > o.lo.hashCodeLisp() ? -1 : 1;
			return this.count > o.count ? -1 : 1;
		}

		public boolean equals(Object obj) {
			if (obj == this)
				return true;
			if (obj instanceof SymCounts)
				return ((SymCounts) obj).lo == this.lo;
			return false;
		}

		public int hashCode() {
			return this.lo.hashCodeLisp();
		}
	}

	static int sleep = 1;

	// ### %start-profiler
	// %start-profiler type granularity
	public static Primitive _START_PROFILER = new JavaPrimitive("%start-profiler", Lisp.PACKAGE_PROF, false) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			final LispThread thread = LispThread.currentThread();
			LispStream out = Lisp.getStandardOutput();
			out.freshLine();
			if (Lisp.profiling)
				out._writeLine("; Profiler already started.");
			else {
				if (first == Keyword.TIME)
					Lisp.sampling = true;
				else if (first == Keyword.COUNT_ONLY)
					Lisp.sampling = false;
				else
					return Lisp.error(new LispError("%START-PROFILER: argument must be either :TIME or :COUNT-ONLY"));
				SubLPackage[] packages = LispPackages.getAllPackages();
				for (int i = 0; i < packages.length; i++) {
					SubLPackage pkg = packages[i];
					SubLSymbol[] symbols = pkg.symbols();
					for (int j = 0; j < symbols.length; j++) {
						SubLSymbol symbol = symbols[j];
						SubLObject object = symbol.getSymbolFunction();
						if (object != null) {
							object.setCallCount(0);
							object.setHotCount(0);
							if (object instanceof StandardGenericFunction) {
								SubLObject methods = Lisp.PACKAGE_MOP.intern("GENERIC-FUNCTION-METHODS")
										.execute(object);
								while (methods != Lisp.NIL) {
									StandardMethod method = (StandardMethod) methods.first();
									method.getFunction().setCallCount(0);
									method.getFunction().setHotCount(0);
									methods = methods.rest();
								}
							}
						}
					}
				}
				if (Lisp.sampling) {
					Profiler.sleep = second.intValue();
					Runnable profilerRunnable = new Runnable() {
						public void run() {
							Lisp.profiling = true; // make sure we don't fall
													// through
													// on the first iteration
							while (Lisp.profiling)
								try {
									thread.incrementCallCounts();
									Thread.sleep(Profiler.sleep);
								}
								// ### FIXME exception
								catch (InterruptedException e) {
									Debug.trace(e);
								}
						}
					};
					Thread t = new Thread(profilerRunnable);
					// Maximum priority doesn't hurt:
					// we're sleeping all the time anyway
					t.setPriority(Thread.MAX_PRIORITY);
					new Thread(profilerRunnable).start();
				}
				out._writeLine("; Profiler started.");
			}
			return thread.nothing();
		}
	};

	// ### stop-profiler
	public static Primitive STOP_PROFILER = new JavaPrimitive("stop-profiler", Lisp.PACKAGE_PROF, true) {

		public SubLObject execute() {
			LispStream out = Lisp.getStandardOutput();
			out.freshLine();
			if (Lisp.profiling) {
				Lisp.profiling = false;
				out._writeLine("; Profiler stopped.");
			} else
				out._writeLine("; Profiler was not started.");
			out._finishOutput();
			return LispThread.currentThread().nothing();
		}
	};

	// ### call-count-arities
	public static Primitive CALL_COUNT_ARITIES = new JavaPrimitive("call-count-arities", Lisp.PACKAGE_PROF, true) {

		public SubLObject execute(SubLObject obj) {
			return obj.getCallCount();
		}
	};

	// (compile-system)
	// ### call-count-arities
	public static Primitive SHOW_CALL_COUNT_ARITIES = new JavaPrimitive("show-call-count-arities", Lisp.PACKAGE_PROF,
			true) {

		public SubLObject execute(SubLObject lo, SubLObject minToShow) {
			// (prof:show-call-count-arities 20 0)
			// (load "compileit.lsp")

			if (!lo.isInteger()) {
				this.showSymbol(lo, Profiler.getTotals(lo.getCallCount()));
				return lo;
			}
			int max = lo.intValue();
			int min = minToShow.isInteger() ? minToShow.intValue() : 1;
			SubLPackage[] packages = LispPackages.getAllPackages();
			List<SymCounts> allsyms = new ArrayList<SymCounts>(60000);
			for (int i = 0; i < packages.length; i++) {
				SubLObject syms = packages[i].getSymbols();
				while (syms != Lisp.NIL) {
					SubLSymbol symbol = (SubLSymbol) syms.first();
					syms = syms.rest();
					int total = Profiler.getTotals(symbol.getCallCount());
					if (total <= min)
						continue;
					allsyms.add(new SymCounts(symbol, total));
				}
			}
			Collections.sort(allsyms);
			for (Iterator iterator = allsyms.iterator(); iterator.hasNext();) {
				SymCounts symCounts = (SymCounts) iterator.next();
				max--;
				if (max < 0)
					return Lisp.T;
				this.showSymbol(symCounts.lo, symCounts.count);
			}
			return Lisp.NIL;
		}

		private void showSymbol(SubLObject lo, int i) {
			SubLObject printable = Profiler.getPrintable(lo.getCallCount());
			SubLObject fo = function_info.coerce_function(LispObjectFactory.makeCons(lo, Lisp.NIL), new Environment(),
					true);
			System.out
					.println(i + " " + lo.writeToString() + " " + printable.writeToString() + " " + fo.writeToString());
		}
	};

	public static SubLObject getPrintable(SubLObject arg) {
		if (arg.isInteger())
			return arg;
		if (arg == Lisp.NIL)
			return Lisp.NIL;
		int[] callCount = (int[]) arg.javaInstance(int[].class);
		SubLObject ret = Lisp.NIL;
		for (int i = 0; i < callCount.length; i++) {
			if (callCount[i] == 0)
				continue;
			SubLCons t = LispObjectFactory.makeCons(LispObjectFactory.makeInteger(callCount[i]),
					LispObjectFactory.makeInteger(i - 1));
			ret = LispObjectFactory.makeCons(t, ret);
		}
		return ret;
	}

	// (prof:show-call-count-arities #'EQL NIL)
	// (prof:show-call-count-arities #'MEMBER NIL)
	public static int getTotals(SubLObject arg) {
		if (arg.isInteger())
			return arg.intValue();
		if (arg == Lisp.NIL)
			return 0;
		int total = 0;
		int[] callCount = (int[]) arg.javaInstance(int[].class);
		for (int i = 0; i < callCount.length; i++)
			total += callCount[i];
		return total;
	}

	public static SubLObject makeCallCounts(int[] callCount) {
		if (true)
			return ABCLJavaObject.makeJavaObject(callCount);
		int total = 0;
		for (int i = 0; i < callCount.length; i++)
			total += callCount[i];
		return LispObjectFactory.makeInteger(total);
	}
}
