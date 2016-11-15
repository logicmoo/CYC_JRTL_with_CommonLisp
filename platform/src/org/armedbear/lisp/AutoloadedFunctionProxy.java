/*
 * AutoloadedFunctionProxy.java
 *
 * Copyright (C) 2009 Erik Huelsmann
 * $Id: AutoloadedFunctionProxy.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import java.util.Hashtable;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class AutoloadedFunctionProxy extends Function {

	private static class function_preload extends JavaPrimitive {
		function_preload() {
			super("function-preload", Lisp.PACKAGE_SYS, false, "name");
		}

		@SuppressWarnings("unchecked")

		public SubLObject execute(SubLObject name) {
			if (Site.useForNameLoader)
				return Lisp.T;
			String namestring = name.getString();
			LispThread thread = LispThread.currentThread();
			Hashtable cache = (Hashtable) Lisp.AUTOLOADING_CACHE.symbolValue(thread).javaInstance();

			Pathname pathname = new Pathname(namestring);
			byte[] bytes = Lisp.readFunctionBytes(pathname);
			cache.put(namestring, bytes);

			return Lisp.T;
		}
	};

	public enum FunctionType {
		NORMAL, SETF, MACRO
	}

	private static class proxy_preloaded_function extends JavaPrimitive {
		proxy_preloaded_function() {
			super("proxy-preloaded-function", Lisp.PACKAGE_SYS, false, "symbol name");
		}

		public SubLObject execute(SubLObject symbol, SubLObject name) {
			LispThread thread = LispThread.currentThread();
			SubLSymbol sym;
			Function fun;
			FunctionType fType = FunctionType.NORMAL;

			if (symbol instanceof SubLSymbol)
				sym = (SubLSymbol) symbol;
			else if (Lisp.isValidSetfFunctionName(symbol)) {
				sym = (SubLSymbol) symbol.second();
				fType = FunctionType.SETF;
			} else if (Lisp.isValidMacroFunctionName(symbol)) {
				sym = (SubLSymbol) symbol.second();
				fType = FunctionType.MACRO;
			} else {
				Lisp.checkSymbol(symbol); // generate an error
				return null; // not reached
			}

			SubLObject cache = Lisp.AUTOLOADING_CACHE.symbolValue(thread);
			if (cache instanceof Nil)
				// during EVAL-WHEN :compile-toplevel, this function will
				// be called without a caching environment; we'll need to
				// forward to the compiled function loader
				return Lisp.loadCompiledFunction(name.getString());
			else {
				SubLObject[] cachedSyms = new SubLObject[AutoloadedFunctionProxy.symsToSave.length];
				for (int i = 0; i < AutoloadedFunctionProxy.symsToSave.length; i++)
					cachedSyms[i] = AutoloadedFunctionProxy.symsToSave[i].symbolValue(thread);

				fun = new AutoloadedFunctionProxy(sym, name, cache, cachedSyms, fType);
				fun.setClassBytes((byte[]) ((Hashtable) cache.javaInstance()).get(name.getString()));
			}
			return fun;
		}
	}

	/**
	 * List of symbols that need to be saved upon instantiation of a proxy and
	 * restored while loading the actual function.
	 */
	static SubLSymbol[] symsToSave = new SubLSymbol[] { Lisp.AUTOLOADING_CACHE, // allow
			// loading
			// local
			// preloaded
			// functions
			Load._FASL_ANONYMOUS_PACKAGE_, // package for uninterned symbols
			LispSymbols._PACKAGE_, // current package
			LispSymbols.LOAD_TRUENAME // LOAD-TIME-VALUE depends on this
	};
	// ### proxy-preloaded-function symbol name => function
	private static Primitive PROXY_PRELOADED_FUNCTION = new proxy_preloaded_function();
	// ### function-preload name => success
	private static Primitive FUNCTION_PRELOAD = new function_preload();

	static private void installFunction(FunctionType fType, SubLSymbol sym, Function fun) {

		if (fType == FunctionType.SETF)
			Lisp.put(sym, LispSymbols.SETF_FUNCTION, fun);
		else if (fType == FunctionType.MACRO) {
			if (sym.getSymbolFunction() instanceof SpecialOperator)
				Lisp.put(sym, LispSymbols.MACROEXPAND_MACRO, new MacroObject(sym, fun));
			else
				sym.setSymbolFunction(new MacroObject(sym, fun));
		} else
			sym.setSymbolFunction(fun);
	}

	@SuppressWarnings("unchecked")
	public static SubLObject loadPreloadedFunction(String name) {

		LispThread thread = LispThread.currentThread();
		SubLObject value = Lisp.AUTOLOADING_CACHE.symbolValue(thread);

		if (value instanceof Nil) {
			byte[] bytes = Lisp.readFunctionBytes(new Pathname(name));
			return bytes == null ? null : Lisp.loadClassBytes(bytes);
		}

		Hashtable cache = (Hashtable) value.javaInstance();
		byte[] bytes = (byte[]) cache.get(name);
		if (bytes == null)
			return Lisp.error(new LispError("Function '" + name + "' not preloaded" + " while preloading requested."));
		try {
			return Lisp.loadClassBytes(bytes);
		} catch (VerifyError e) {
			return Lisp.error(new LispError("Class verification failed: " + e.getMessage()));
		} catch (Throwable t) {
			Debug.trace(t);
		}
		return Lisp.error(new FileError("Can't read file off stream."));
	}

	final static SubLObject makePreloadingContext() {
		return new ABCLJavaObject(new Hashtable());
	}

	private SubLSymbol symbol;

	private String name;

	private SubLObject cache;

	private SubLObject[] savedSyms;

	private FunctionType fType;

	Function fun = null;

	public AutoloadedFunctionProxy(SubLSymbol symbol, SubLObject name, SubLObject cache, SubLObject[] savedSyms,
			FunctionType ft) {
		super();
		this.symbol = symbol;
		this.name = name.getString();
		this.cache = cache;
		this.savedSyms = savedSyms;
		Debug.assertTrue(!(cache instanceof Nil));
		this.fType = ft;
	}

	public SubLObject classOf() {
		return this.resolve().classOf();
	}

	public boolean equal(SubLObject obj) {
		return super.equal(obj) || this.resolve().equal(obj);
	}

	public boolean equalp(SubLObject obj) {
		return super.equalp(obj) || this.resolve().equalp(obj);
	}

	public SubLObject execute() {
		return this.load().execute();
	}

	public SubLObject execute(SubLObject arg) {
		return this.load().execute(arg);
	}

	public SubLObject execute(SubLObject first, SubLObject second)

	{
		return this.load().execute(first, second);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		return this.load().execute(first, second, third);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		return this.load().execute(first, second, third, fourth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		return this.load().execute(first, second, third, fourth, fifth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		return this.load().execute(first, second, third, fourth, fifth, sixth);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		return this.load().execute(first, second, third, fourth, fifth, sixth, seventh);
	}

	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		return this.load().execute(first, second, third, fourth, fifth, sixth, seventh, eighth);
	}

	public SubLObject execute(SubLObject[] args) {
		return this.load().execute(args);
	}

	public SubLObject getCallCount() {
		if (this.fun != null)
			return this.fun.getCallCount();
		return super.getCallCount();
	}

	public void incrementCallCount(int arity) {
		if (arity > 10)
			arity = -1;
		this.callCount[arity + 1]++;
		if (this.fun != null)
			this.fun.incrementCallCount(arity);
		else
			super.incrementCallCount(arity);
	}

	private synchronized Function load() {
		if (this.fun != null)
			return this.fun;

		LispThread thread = LispThread.currentThread();
		SpecialBindingsMark mark = thread.markSpecialBindings();

		for (int i = 0; i < AutoloadedFunctionProxy.symsToSave.length; i++)
			thread.bindSpecial(AutoloadedFunctionProxy.symsToSave[i], this.savedSyms[i]);

		// set a specific reader environment, because we may be triggered in
		// any undefined dynamic environment; we want something predictable
		thread.bindSpecial(LispSymbols.READ_SUPPRESS, Lisp.NIL);
		thread.bindSpecial(LispSymbols.READ_EVAL, Lisp.T);
		thread.bindSpecial(LispSymbols.READ_BASE, LispObjectFactory.makeInteger(10));
		// don't need to bind *READ-DEFAULT-FLOAT-FORMAT*,
		// because DUMP-FORM sets it to NIL, forcing exponent markers everywhere

		try {
			if (Site.useForNameLoader) {
				SubLObject o = Lisp.loadCompiledFunction(this.name);
				if (o instanceof Function) {
					this.fun = (Function) o;
					if (this.symbol != null)
						AutoloadedFunctionProxy.installFunction(this.fType, this.symbol, this.fun);
					return this.fun;
				}
			}
			byte[] classbytes = (byte[]) ((Hashtable) this.cache.javaInstance()).get(this.name);
			this.fun = Lisp.loadClassBytes(classbytes);
		} catch (Throwable t) {
			Debug.trace(t);
		} // ### fixme
		finally {
			thread.resetSpecialBindings(mark);
		}

		if (this.symbol != null)
			AutoloadedFunctionProxy.installFunction(this.fType, this.symbol, this.fun);

		return this.fun;
	}

	/** Resolve this instance by returning the function we're proxy for */

	public SubLObject resolve() {
		return this.load();
	}

	public SubLObject typeOf() {
		return this.resolve().typeOf();
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		return super.typep(typeSpecifier) == Lisp.T ? Lisp.T : this.resolve().typep(typeSpecifier);
	}

	public String writeToString() {
		return this.resolve().writeToString();
	}
}
