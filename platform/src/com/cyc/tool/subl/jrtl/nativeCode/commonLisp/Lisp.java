/*
 * Lisp.java
 *
 * Copyright (C) 2002-2007 Peter Graves <peter@armedbear.org>
 * $Id: Lisp.java 12524 2010-03-11 15:49:05Z mevenson $
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
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
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

import static com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispObjectFactory.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Hashtable;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public final class Lisp {
	
	public static final boolean debug = true;

	public static boolean cold = true;

	public static boolean initialized;

	// Packages.
	public static final SubLPackage PACKAGE_CL = LispPackages.createPackage("COMMON-LISP", 1024);
	public static final SubLPackage PACKAGE_CL_USER = LispPackages.createPackage("COMMON-LISP-USER", 1024);
	public static final SubLPackage PACKAGE_KEYWORD = LispPackages.createPackage("KEYWORD", 1024);
	public static final SubLPackage PACKAGE_SYS = LispPackages.createPackage("SYSTEM");
	public static final SubLPackage PACKAGE_MOP = LispPackages.createPackage("MOP");
	public static final SubLPackage PACKAGE_TPL = LispPackages.createPackage("TOP-LEVEL");
	public static final SubLPackage PACKAGE_EXT = LispPackages.createPackage("EXTENSIONS");
	public static final SubLPackage PACKAGE_JVM = LispPackages.createPackage("JVM");
	public static final SubLPackage PACKAGE_LOOP = LispPackages.createPackage("LOOP");
	public static final SubLPackage PACKAGE_PROF = LispPackages.createPackage("PROFILER");
	public static final SubLPackage PACKAGE_JAVA = LispPackages.createPackage("JAVA");
	public static final SubLPackage PACKAGE_LISP = LispPackages.createPackage("LISP");
	public static final SubLPackage PACKAGE_THREADS = LispPackages.createPackage("THREADS");
	public static final SubLPackage PACKAGE_FORMAT = LispPackages.createPackage("FORMAT");
	public static final SubLPackage PACKAGE_XP = LispPackages.createPackage("XP");
	public static final SubLPackage PACKAGE_PRECOMPILER = LispPackages.createPackage("PRECOMPILER");
	public static final SubLPackage PACKAGE_SEQUENCE = LispPackages.createPackage("SEQUENCE");
	public static final SubLPackage PACKAGE_USER = LispPackages.createPackage("USER");

	// ### nil
	public static final SubLObject NIL = Nil.NIL;

	// We need NIL before we can call usePackage().
	static {
		PACKAGE_CL.addNickname("CL");
		//PACKAGE_CL_USER.addNickname("USER");
		PACKAGE_CL_USER.addNickname("CL-USER");
		PACKAGE_CL_USER.usePackage(PACKAGE_CL);
		PACKAGE_CL_USER.usePackage(PACKAGE_EXT);
		PACKAGE_CL_USER.usePackage(PACKAGE_JAVA);
		PACKAGE_SYS.addNickname("SYS");
		PACKAGE_SYS.usePackage(PACKAGE_CL);
		PACKAGE_SYS.usePackage(PACKAGE_EXT);
		PACKAGE_MOP.usePackage(PACKAGE_CL);
		PACKAGE_MOP.usePackage(PACKAGE_EXT);
		PACKAGE_MOP.usePackage(PACKAGE_SYS);
		PACKAGE_TPL.addNickname("TPL");
		PACKAGE_TPL.usePackage(PACKAGE_CL);
		PACKAGE_TPL.usePackage(PACKAGE_EXT);
		PACKAGE_EXT.addNickname("EXT");
		PACKAGE_EXT.usePackage(PACKAGE_CL);
		PACKAGE_EXT.usePackage(PACKAGE_THREADS);
		PACKAGE_JVM.usePackage(PACKAGE_CL);
		PACKAGE_JVM.usePackage(PACKAGE_EXT);
		PACKAGE_JVM.usePackage(PACKAGE_SYS);
		PACKAGE_LOOP.usePackage(PACKAGE_CL);
		PACKAGE_PROF.addNickname("PROF");
		PACKAGE_PROF.usePackage(PACKAGE_CL);
		PACKAGE_PROF.usePackage(PACKAGE_EXT);
		PACKAGE_JAVA.usePackage(PACKAGE_CL);
		PACKAGE_JAVA.usePackage(PACKAGE_EXT);
		PACKAGE_LISP.usePackage(PACKAGE_CL);
		PACKAGE_LISP.usePackage(PACKAGE_EXT);
		PACKAGE_LISP.usePackage(PACKAGE_SYS);
		PACKAGE_THREADS.usePackage(PACKAGE_CL);
		PACKAGE_THREADS.usePackage(PACKAGE_EXT);
		PACKAGE_THREADS.usePackage(PACKAGE_SYS);
		PACKAGE_FORMAT.usePackage(PACKAGE_CL);
		PACKAGE_FORMAT.usePackage(PACKAGE_EXT);
		PACKAGE_XP.usePackage(PACKAGE_CL);
		PACKAGE_PRECOMPILER.addNickname("PRE");
		PACKAGE_PRECOMPILER.usePackage(PACKAGE_CL);
		PACKAGE_PRECOMPILER.usePackage(PACKAGE_EXT);
		PACKAGE_PRECOMPILER.usePackage(PACKAGE_SYS);
		PACKAGE_SEQUENCE.usePackage(PACKAGE_CL);
		// :user package for backwards compat
		PACKAGE_USER.usePackage(PACKAGE_CL);
		PACKAGE_USER.usePackage(PACKAGE_EXT);
		PACKAGE_USER.usePackage(PACKAGE_JAVA);
		PACKAGE_USER.usePackage(PACKAGE_CL_USER);
		PACKAGE_USER.usePackage(PACKAGE_LISP);
		//PACKAGE_USER.usePackage(PACKAGE_SYS);
	}

	// End-of-file marker.
	public static final SubLObject EOF = new BlockLispObject();

	public static boolean profiling = true;

	public static boolean sampling = false;

	public static volatile boolean sampleNow;

	// args must not be null!
	public static final SubLObject funcall(SubLObject fun, SubLObject[] args, LispThread thread)

	{
		thread._values = null;

		// 26-07-2009: For some reason we cannot "just" call the array version;
		// it causes an error (Wrong number of arguments for LOOP-FOR-IN)
		// which is probably a sign of an issue in our design?
		switch (args.length) {
		case 0:
			return thread.execute(fun);
		case 1:
			return thread.execute(fun, args[0]);
		case 2:
			return thread.execute(fun, args[0], args[1]);
		case 3:
			return thread.execute(fun, args[0], args[1], args[2]);
		case 4:
			return thread.execute(fun, args[0], args[1], args[2], args[3]);
		case 5:
			return thread.execute(fun, args[0], args[1], args[2], args[3], args[4]);
		case 6:
			return thread.execute(fun, args[0], args[1], args[2], args[3], args[4], args[5]);
		case 7:
			return thread.execute(fun, args[0], args[1], args[2], args[3], args[4], args[5], args[6]);
		case 8:
			return thread.execute(fun, args[0], args[1], args[2], args[3], args[4], args[5], args[6], args[7]);
		default:
			return thread.execute(fun, args);
		}
	}

	public static final SubLObject macroexpand(SubLObject form, final Environment env, final LispThread thread)

	{
		SubLObject expanded = NIL;
		while (true) {
			form = macroexpand_1(form, env, thread);
			SubLObject[] values = thread._values;
			if (values[1] == NIL) {
				values[1] = expanded;
				return form;
			}
			expanded = T;
		}
	}

	public static final SubLObject macroexpand_1(final SubLObject form, final Environment env, final LispThread thread)

	{
		if (form instanceof SubLCons) {
			SubLObject car = ((SubLCons) form).first();
			if (car instanceof SubLSymbol) {
				SubLObject obj = env.lookupFunction(car);
				if (obj instanceof Autoload) {
					Autoload autoload = (Autoload) obj;
					autoload.load();
					obj = car.getSymbolFunction();
				}
				if (obj instanceof SpecialOperator) {
					obj = get(car, LispSymbols.MACROEXPAND_MACRO, null);
					if (obj instanceof Autoload) {
						Autoload autoload = (Autoload) obj;
						autoload.load();
						obj = get(car, LispSymbols.MACROEXPAND_MACRO, null);
					}
				}
				if (obj instanceof MacroObject) {
					SubLObject expander = ((MacroObject) obj).expander;
					if (profiling)
						if (!sampling) //let the macro track it (it adds to expander to(
							obj.incrementCallCount(form.cl_length() - 1);
					SubLObject hook = coerceToFunction(LispSymbols.MACROEXPAND_HOOK.symbolValue(thread));
					return thread.setValues(hook.execute(expander, form, env), T);
				}
			}
		} else if (form instanceof SubLSymbol) {
			SubLSymbol symbol = (SubLSymbol) form;
			SubLObject obj = null;
			if (symbol.isSpecialVariable())
				obj = thread.lookupSpecial(symbol);
			else
				obj = env.lookup(symbol);
			if (obj == null)
				obj = symbol.getSymbolValue();
			if (obj instanceof SymbolMacro)
				return thread.setValues(((SymbolMacro) obj).getExpansion(), T);
		}
		// Not a macro.
		return thread.setValues(form, NIL);
	}

	// ### interactive-eval
	private static final Primitive INTERACTIVE_EVAL = new JavaPrimitive("interactive-eval", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject object) {
			final LispThread thread = LispThread.currentThread();
			thread.setSpecialVariable(LispSymbols.MINUS, object);
			SubLObject result;
			try {
				result = thread.execute(LispSymbols.EVAL.getSymbolFunction(), object);
			} catch (OutOfMemoryError e) {
				return error(new LispError("Out of memory."));
			} catch (StackOverflowError e) {
				thread.setSpecialVariable(_SAVED_BACKTRACE_, thread.backtrace(0));
				return error(new StorageCondition("Stack overflow."));
			} catch (ControlTransfer c) {
				throw c;
			} catch (Throwable t) // ControlTransfer handled above
			{
				Debug.trace(t);
				thread.setSpecialVariable(_SAVED_BACKTRACE_, thread.backtrace(0));
				return error(new LispError("Caught " + t + "."));
			}
			Debug.assertTrue(result != null);
			thread.setSpecialVariable(LispSymbols.STAR_STAR_STAR, thread.safeSymbolValue(LispSymbols.STAR_STAR));
			thread.setSpecialVariable(LispSymbols.STAR_STAR, thread.safeSymbolValue(LispSymbols.STAR));
			thread.setSpecialVariable(LispSymbols.STAR, result);
			thread.setSpecialVariable(LispSymbols.PLUS_PLUS_PLUS, thread.safeSymbolValue(LispSymbols.PLUS_PLUS));
			thread.setSpecialVariable(LispSymbols.PLUS_PLUS, thread.safeSymbolValue(LispSymbols.PLUS));
			thread.setSpecialVariable(LispSymbols.PLUS, thread.safeSymbolValue(LispSymbols.MINUS));
			SubLObject[] values = thread._values;
			thread.setSpecialVariable(LispSymbols.SLASH_SLASH_SLASH, thread.safeSymbolValue(LispSymbols.SLASH_SLASH));
			thread.setSpecialVariable(LispSymbols.SLASH_SLASH, thread.safeSymbolValue(LispSymbols.SLASH));
			if (values != null) {
				SubLObject slash = NIL;
				for (int i = values.length; i-- > 0;)
					slash = makeCons(values[i], slash);
				thread.setSpecialVariable(LispSymbols.SLASH, slash);
			} else
				thread.setSpecialVariable(LispSymbols.SLASH, makeCons(result));
			return result;
		}
	};

	private static final void pushJavaStackFrames() {
		final LispThread thread = LispThread.currentThread();
		final StackTraceElement[] frames = thread.getJavaStackTrace();

		// Search for last Primitive in the StackTrace; that was the
		// last entry point from Lisp.
		int last = frames.length - 1;
		for (int i = 0; i <= last; i++) {
			//if (frames[i].getClassName().startsWith("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Primitive"))
			// last = i;
			if (frames[i].getClassName().startsWith("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Primitive"))
				last = i;
		}
		// Do not include the first three frames:
		//   Thread.getStackTrace, LispThread.getJavaStackTrace,
		//   Lisp.pushJavaStackFrames.
		while (last > 3) {
			thread.pushStackFrame(new JavaStackFrame(frames[last]));
			last--;
		}
	}

	public static final SubLObject error(SubLObject condition)

	{
		if (Site.isSubLisp) return Errors.error(condition.getParts().writeToString());
		pushJavaStackFrames();
		return LispSymbols.ERROR.execute(condition);
	}

	public static final SubLObject error(SubLObject condition, SubLObject message)

	{
		pushJavaStackFrames();
		return LispSymbols.ERROR.execute(condition, Keyword.FORMAT_CONTROL, message);
	}

	public static final SubLObject type_error(SubLObject datum, SubLObject expectedType)

	{
		return error(new TypeError(datum, expectedType));
	}

	public static volatile boolean interrupted;

	public static synchronized final void setInterrupted(boolean b) {
		interrupted = b;
	}

	public static final void handleInterrupt() {
		setInterrupted(false);
		LispSymbols.BREAK.getSymbolFunction().execute();
		setInterrupted(false);
	}

	// Used by the compiler.
	public static final SubLObject loadTimeValue(SubLObject obj)

	{
		final LispThread thread = LispThread.currentThread();
		if (LispSymbols.LOAD_TRUENAME.symbolValue(thread) != NIL)
			return eval(obj, new Environment(), thread);
		else
			return NIL;
	}

	public static final SubLObject eval(SubLObject obj)

	{
		return eval(obj, new Environment(), LispThread.currentThread());
	}

	public static final SubLObject eval(final SubLObject obj, final Environment env, final LispThread thread)

	{
		thread._values = null;
		if (interrupted)
			handleInterrupt();
		if (thread.isDestroyed())
			throw new ThreadDestroyed();
		if (obj instanceof SubLSymbol) {
			SubLSymbol symbol = (SubLSymbol) obj;
			SubLObject result;
			if (symbol.isSpecialVariable()) {
				if (symbol.constantp())
					return symbol.getSymbolValue();
				else
					result = thread.lookupSpecial(symbol);
			} else if (env.isDeclaredSpecial(symbol))
				result = thread.lookupSpecial(symbol);
			else
				result = env.lookup(symbol);
			if (result == null) {
				result = symbol.getSymbolValue();
				if (result == null)
					return error(new UnboundVariable(obj));
			}
			if (result instanceof SymbolMacro)
				return eval(((SymbolMacro) result).getExpansion(), env, thread);
			return result;
		} else if (obj instanceof SubLCons) {
			SubLCons cobj = (SubLCons) obj;
			SubLObject first = cobj.first();
			if (first instanceof SubLSymbol) {
				SubLObject fun = env.lookupFunction(first);
				if (fun instanceof SpecialOperator) {
					if (profiling)
						if (!sampling)
							fun.incrementCallCount(cobj.cl_length() - 1);
					// Don't eval args!
					return fun.execute(cobj.rest(), env);
				}
				if (fun instanceof MacroObject)
					return eval(macroexpand(obj, env, thread), env, thread);
				if (fun instanceof Autoload) {
					Autoload autoload = (Autoload) fun;
					autoload.load();
					return eval(obj, env, thread);
				}
				return evalCall(fun != null ? fun : first, cobj.rest(), env, thread);
			} else {
				if (first.first() == LispSymbols.LAMBDA) {
					Closure closure = new Closure(first, env);
					return evalCall(closure, ((SubLCons) obj).rest(), env, thread);
				} else
					return error(new ProgramError("Illegal function object: " + first.writeToString()));
			}
		} else
			return obj;
	}

	public static final int CALL_REGISTERS_MAX = 8;

	// Also used in JProxy.java.
	public static final SubLObject evalCall(SubLObject function, SubLObject args, Environment env, LispThread thread)

	{
		if (args == NIL)
			return thread.execute(function);
		SubLObject first = eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == NIL) {
			thread._values = null;
			return thread.execute(function, first);
		}
		SubLObject second = eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == NIL) {
			thread._values = null;
			return thread.execute(function, first, second);
		}
		SubLObject third = eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third);
		}
		SubLObject fourth = eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third, fourth);
		}
		SubLObject fifth = eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third, fourth, fifth);
		}
		SubLObject sixth = eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third, fourth, fifth, sixth);
		}
		SubLObject seventh = eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third, fourth, fifth, sixth, seventh);
		}
		SubLObject eighth = eval(args.first(), env, thread);
		args = ((SubLCons) args).rest();
		if (args == NIL) {
			thread._values = null;
			return thread.execute(function, first, second, third, fourth, fifth, sixth, seventh, eighth);
		}
		// More than CALL_REGISTERS_MAX arguments.
		final int length = args.cl_length() + CALL_REGISTERS_MAX;
		SubLObject[] array = makeLispObjectArray(length);
		array[0] = first;
		array[1] = second;
		array[2] = third;
		array[3] = fourth;
		array[4] = fifth;
		array[5] = sixth;
		array[6] = seventh;
		array[7] = eighth;
		for (int i = CALL_REGISTERS_MAX; i < length; i++) {
			array[i] = eval(args.first(), env, thread);
			args = args.rest();
		}
		thread._values = null;
		return thread.execute(function, array);
	}

	public static final SubLObject parseBody(SubLObject body, boolean documentationAllowed)

	{
		SubLObject decls = NIL;
		SubLObject doc = NIL;

		while (body != NIL) {
			SubLObject form = body.first();
			if (documentationAllowed && form instanceof SubLString && body.rest() != NIL) {
				doc = body.first();
				documentationAllowed = false;
			} else if (form instanceof SubLCons && form.first() == LispSymbols.DECLARE)
				decls = makeCons(form, decls);
			else
				break;

			body = body.rest();
		}
		return list(body, decls.nreverse(), doc);
	}

	public static final SubLObject parseSpecials(SubLObject forms)

	{
		SubLObject specials = NIL;
		while (forms != NIL) {
			SubLObject decls = forms.first();

			Debug.assertTrue(decls instanceof SubLCons);
			Debug.assertTrue(decls.first() == LispSymbols.DECLARE);
			decls = decls.rest();
			while (decls != NIL) {
				SubLObject decl = decls.first();

				if (decl instanceof SubLCons && decl.first() == LispSymbols.SPECIAL) {
					decl = decl.rest();
					while (decl != NIL) {
						specials = makeCons(checkSymbol(decl.first()), specials);
						decl = decl.rest();
					}
				}

				decls = decls.rest();
			}

			forms = forms.rest();
		}

		return specials;
	}

	public static final SubLObject progn(SubLObject body, Environment env, LispThread thread)

	{
		SubLObject result = NIL;
		while (body != NIL) {
			result = eval(body.first(), env, thread);
			body = ((SubLCons) body).rest();
		}
		return result;
	}

	public static final SubLObject preprocessTagBody(SubLObject body, Environment env)

	{
		SubLObject localTags = NIL; // Tags that are local to this TAGBODY.
		while (body != NIL) {
			SubLObject current = body.first();
			body = ((SubLCons) body).rest();
			if (current instanceof SubLCons)
				continue;
			// It's a tag.
			env.addTagBinding(current, body);
			localTags = makeCons(current, localTags);
		}
		return localTags;
	}

	/** Throws a Go exception to cause a non-local transfer
	 * of control event, after checking that the extent of
	 * the catching tagbody hasn't ended yet.
	 *
	 * This version is used by the compiler.
	 */
	public static final SubLObject nonLocalGo(SubLObject tagbody, SubLObject tag)

	{
		if (tagbody == null)
			return error(new ControlError("Unmatched tag " + tag.writeToString() + " for GO outside lexical extent."));

		throw new Go(tagbody, tag);
	}

	/** Throws a Go exception to cause a non-local transfer
	 * of control event, after checking that the extent of
	 * the catching tagbody hasn't ended yet.
	 *
	 * This version is used by the interpreter.
	 */
	public static final SubLObject nonLocalGo(Binding binding, SubLObject tag)

	{
		if (binding.env.inactive)
			return error(new ControlError("Unmatched tag " + binding.symbol.writeToString()
					+ " for GO outside of lexical extent."));

		throw new Go(binding.env, binding.symbol);
	}

	/** Throws a Return exception to cause a non-local transfer
	 * of control event, after checking that the extent of
	 * the catching block hasn't ended yet.
	 *
	 * This version is used by the compiler.
	 */
	public static final SubLObject nonLocalReturn(SubLObject blockId, SubLObject blockName, SubLObject result)

	{
		if (blockId == null)
			return error(new ControlError("Unmatched block " + blockName.writeToString() + " for "
					+ "RETURN-FROM outside lexical extent."));

		throw new Return(blockId, result);
	}

	/** Throws a Return exception to cause a non-local transfer
	 * of control event, after checking that the extent of
	 * the catching block hasn't ended yet.
	 *
	 * This version is used by the interpreter.
	 */
	public static final SubLObject nonLocalReturn(Binding binding, SubLSymbol block, SubLObject result)

	{
		if (binding == null) {
			return error(new LispError("No block named " + block.getJavaSymbolName() + " is currently visible."));
		}

		if (binding.env.inactive)
			return error(new ControlError("Unmatched block " + binding.symbol.writeToString() + " for RETURN-FROM outside of"
					+ " lexical extent."));

		throw new Return(binding.symbol, binding.value, result);
	}

	public static final SubLObject processTagBody(SubLObject body, SubLObject localTags, Environment env)

	{
		SubLObject remaining = body;
		LispThread thread = LispThread.currentThread();
		while (remaining != NIL) {
			SubLObject current = remaining.first();
			if (current instanceof SubLCons) {
				try {
					// Handle GO inline if possible.
					if (((SubLCons) current).first() == LispSymbols.GO) {
						if (interrupted)
							handleInterrupt();
						SubLObject tag = current.second();
						Binding binding = env.getTagBinding(tag);
						if (binding == null)
							return error(new ControlError("No tag named " + tag.writeToString() + " is currently visible."));
						else if (memql(tag, localTags)) {
							if (binding.value != null) {
								remaining = binding.value;
								continue;
							}
						}
						throw new Go(binding.env, tag);
					}
					eval(current, env, thread);
				} catch (Go go) {
					SubLObject tag;
					if (go.getTagBody() == env && memql(tag = go.getTag(), localTags)) {
						Binding binding = env.getTagBinding(tag);
						if (binding != null && binding.value != null) {
							remaining = binding.value;
							continue;
						}
					}
					throw go;
				}
			}
			remaining = ((SubLCons) remaining).rest();
		}
		thread._values = null;
		return NIL;
	}

	// Environment wrappers.
	private static final boolean isSpecial(SubLSymbol sym, SubLObject ownSpecials, Environment env)

	{
		if (ownSpecials != null) {
			if (sym.isSpecialVariable())
				return true;
			for (; ownSpecials != NIL; ownSpecials = ownSpecials.rest()) {
				if (sym == ownSpecials.first())
					return true;
			}
		}
		return false;
	}

	public static final void bindArg(SubLObject ownSpecials, SubLSymbol sym, SubLObject value, Environment env,
			LispThread thread)

	{
		if (isSpecial(sym, ownSpecials, env)) {
			env.declareSpecial(sym);
			thread.bindSpecial(sym, value);
		} else
			env.bindSymbolVoid(sym, value);
	}

	public static final SubLCons list(SubLObject obj1, SubLObject... remaining) {
		SubLCons theList = null;
		if (remaining.length > 0) {
			theList = makeCons(remaining[remaining.length - 1]);
			for (int i = remaining.length - 2; i >= 0; i--)
				theList = makeCons(remaining[i], theList);
		}
		return (theList == null) ? makeCons(obj1) : makeCons(obj1, theList);
	}

	@Deprecated
	public static final SubLCons list1(SubLObject obj1) {
		return makeCons(obj1);
	}

	@Deprecated
	public static final SubLCons list2(SubLObject obj1, SubLObject obj2) {
		return makeCons(obj1, makeCons(obj2));
	}

	@Deprecated
	public static final SubLCons list3(SubLObject obj1, SubLObject obj2, SubLObject obj3) {
		return makeCons(obj1, makeCons(obj2, makeCons(obj3)));
	}

	@Deprecated
	public static final SubLCons list4(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4) {
		return makeCons(obj1, makeCons(obj2, makeCons(obj3, makeCons(obj4))));
	}

	@Deprecated
	public static final SubLCons list5(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5) {
		return makeCons(obj1, makeCons(obj2, makeCons(obj3, makeCons(obj4, makeCons(obj5)))));
	}

	@Deprecated
	public static final SubLCons list6(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5,
			SubLObject obj6) {
		return makeCons(obj1, makeCons(obj2, makeCons(obj3, makeCons(obj4, makeCons(obj5, makeCons(obj6))))));
	}

	@Deprecated
	public static final SubLCons list7(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5,
			SubLObject obj6, SubLObject obj7) {
		return makeCons(obj1,
				makeCons(obj2, makeCons(obj3, makeCons(obj4, makeCons(obj5, makeCons(obj6, makeCons(obj7)))))));
	}

	@Deprecated
	public static final SubLCons list8(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5,
			SubLObject obj6, SubLObject obj7, SubLObject obj8) {
		return makeCons(obj1, makeCons(obj2, makeCons(obj3, makeCons(obj4, makeCons(obj5, makeCons(obj6, makeCons(obj7,
				makeCons(obj8))))))));
	}

	@Deprecated
	public static final SubLCons list9(SubLObject obj1, SubLObject obj2, SubLObject obj3, SubLObject obj4, SubLObject obj5,
			SubLObject obj6, SubLObject obj7, SubLObject obj8, SubLObject obj9) {
		return makeCons(obj1, makeCons(obj2, makeCons(obj3, makeCons(obj4, makeCons(obj5, makeCons(obj6, makeCons(obj7,
				makeCons(obj8, makeCons(obj9)))))))));
	}

	// Used by the compiler.
	public static final SubLObject multipleValueList(SubLObject result)

	{
		LispThread thread = LispThread.currentThread();
		SubLObject[] values = thread._values;
		if (values == null)
			return makeCons(result);
		thread._values = null;
		SubLObject list = NIL;
		for (int i = values.length; i-- > 0;)
			list = makeCons(values[i], list);
		return list;
	}

	// Used by the compiler for MULTIPLE-VALUE-CALLs with a single values form.
	public static final SubLObject multipleValueCall1(SubLObject result, SubLObject function, LispThread thread)

	{
		SubLObject[] values = thread._values;
		thread._values = null;
		if (values == null)
			return thread.execute(coerceToFunction(function), result);
		else
			return funcall(coerceToFunction(function), values, thread);
	}

	public static final void progvBindVars(SubLObject symbols, SubLObject values, LispThread thread)

	{
		for (SubLObject list = symbols; list != NIL; list = list.rest()) {
			SubLSymbol symbol = checkSymbol(list.first());
			SubLObject value;
			if (values != NIL) {
				value = values.first();
				values = values.rest();
			} else {
				// "If too few values are supplied, the remaining symbols are
				// bound and then made to have no value."
				value = null;
			}
			thread.bindSpecial(symbol, value);
		}
	}

	public static SubLSymbol checkSymbol(SubLObject obj) {
		if (obj instanceof SubLSymbol)
			return (SubLSymbol) obj;
		return (SubLSymbol) // Not reached.       
		type_error(obj, LispSymbols.SYMBOL);
	}

	public static final SubLObject checkList(SubLObject obj)

	{
		if (obj.isList())
			return obj;
		return type_error(obj, LispSymbols.LIST);
	}

	public static final AbstractArray checkArray(SubLObject obj)

	{
		if (obj instanceof AbstractArray)
			return (AbstractArray) obj;
		return (AbstractArray) // Not reached.       
		type_error(obj, LispSymbols.ARRAY);
	}

	public static final AbstractVector checkVector(SubLObject obj)

	{
		if (obj instanceof AbstractVector)
			return (AbstractVector) obj;
		return (AbstractVector) // Not reached.       
		type_error(obj, LispSymbols.VECTOR);
	}

	public static final DoubleFloat checkDoubleFloat(SubLObject obj)

	{
		if (obj instanceof DoubleFloat)
			return (DoubleFloat) obj;
		return (DoubleFloat) // Not reached.
		type_error(obj, LispSymbols.DOUBLE_FLOAT);
	}

	public static final SingleFloat checkSingleFloat(SubLObject obj)

	{
		if (obj instanceof SingleFloat)
			return (SingleFloat) obj;
		return (SingleFloat) // Not reached.
		type_error(obj, LispSymbols.SINGLE_FLOAT);
	}

	public static final StackFrame checkStackFrame(SubLObject obj)

	{
		if (obj instanceof StackFrame)
			return (StackFrame) obj;
		return (StackFrame) // Not reached.       
		type_error(obj, LispSymbols.STACK_FRAME);
	}

	static {
		// ### *gensym-counter*
		LispSymbols.GENSYM_COUNTER.initializeSpecial(Fixnum.ZERO);
	}

	public static final SubLSymbol gensym(LispThread thread)

	{
		return gensym("G", thread);
	}

	public static final SubLSymbol gensym(String prefix, LispThread thread)

	{
		StringBuilder sb = new StringBuilder(prefix);
		SpecialBinding binding = thread.getSpecialBinding(LispSymbols.GENSYM_COUNTER);
		final SubLObject oldValue;
		if (binding != null) {
			oldValue = binding.value;
			if (oldValue instanceof Fixnum || oldValue instanceof Bignum)
				binding.value = oldValue.inc();
			else {
				LispSymbols.GENSYM_COUNTER.setSymbolValue(Fixnum.ZERO);
				error(new TypeError("The value of *GENSYM-COUNTER* was not a nonnegative integer. Old value: "
						+ oldValue.writeToString() + " New value: 0"));
			}
		} else {
			// we're manipulating a global resource
			// make sure we operate thread-safely
			synchronized (LispSymbols.GENSYM_COUNTER) {
				oldValue = LispSymbols.GENSYM_COUNTER.getSymbolValue();
				if (oldValue instanceof Fixnum || oldValue instanceof Bignum)
					LispSymbols.GENSYM_COUNTER.setSymbolValue(oldValue.inc());
				else {
					LispSymbols.GENSYM_COUNTER.setSymbolValue(Fixnum.ZERO);
					error(new TypeError("The value of *GENSYM-COUNTER* was not a nonnegative integer. Old value: "
							+ oldValue.writeToString() + " New value: 0"));
				}
			}
		}

		// Decimal representation.
		if (oldValue instanceof Fixnum)
			sb.append(((Fixnum) oldValue).value);
		else if (oldValue instanceof Bignum)
			sb.append(((Bignum) oldValue).bigIntegerValue().toString());

		return makeSymbol(makeString(sb));
	}

	public static final String javaString(SubLObject arg)

	{
		if (arg instanceof SubLString)
			return arg.getString();
		if (arg instanceof SubLSymbol)
			return ((SubLSymbol) arg).getJavaSymbolName();
		if (arg instanceof LispCharacter)
			return String.valueOf(new char[] { ((LispCharacter) arg).value });
		type_error(arg, list(LispSymbols.OR, LispSymbols.STRING, LispSymbols.SYMBOL, LispSymbols.CHARACTER));
		// Not reached.
		return null;
	}

	public static final SubLObject number(long n) {
		if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
			return LispObjectFactory.makeInteger((int) n);
		else
			return LispObjectFactory.makeBignum(n);
	}

	private static final BigInteger INT_MIN = BigInteger.valueOf(Integer.MIN_VALUE);
	private static final BigInteger INT_MAX = BigInteger.valueOf(Integer.MAX_VALUE);

	public static final SubLObject number(BigInteger numerator, BigInteger denominator)

	{
		if (denominator.signum() == 0)
			error(new DivisionByZero());
		if (denominator.signum() < 0) {
			numerator = numerator.negate();
			denominator = denominator.negate();
		}
		BigInteger gcd = numerator.gcd(denominator);
		if (!gcd.equals(BigInteger.ONE)) {
			numerator = numerator.divide(gcd);
			denominator = denominator.divide(gcd);
		}
		if (denominator.equals(BigInteger.ONE))
			return number(numerator);
		else
			return new Ratio(numerator, denominator);
	}

	public static final SubLObject number(BigInteger n) {
		if (n.compareTo(INT_MIN) >= 0 && n.compareTo(INT_MAX) <= 0)
			return LispObjectFactory.makeInteger(n.intValue());
		else
			return LispObjectFactory.makeInteger(n);
	}

	public static final int mod(int number, int divisor)

	{
		final int r;
		try {
			r = number % divisor;
		} catch (ArithmeticException e) {
			error(new ArithmeticError("Division by zero."));
			// Not reached.
			return 0;
		}
		if (r == 0)
			return r;
		if (divisor < 0) {
			if (number > 0)
				return r + divisor;
		} else {
			if (number < 0)
				return r + divisor;
		}
		return r;
	}

	// Adapted from SBCL.
	public static final int mix(long x, long y) {
		long xy = x * 3 + y;
		return (int) (536870911L & (441516657L ^ xy ^ (xy >> 5)));
	}

	// Used by the compiler.
	public static final SubLObject readObjectFromString(String s) {
		return new StringInputStream(s).faslRead(true, NIL, false, LispThread.currentThread());
	}

	@Deprecated
	public static final SubLObject loadCompiledFunction(final String namestring) {
		Pathname name = new Pathname(namestring);
		byte[] bytes = readFunctionBytes(name);
		if (bytes != null)
			return loadClassBytes(bytes);

		return null;
	}

	public static final byte[] readFunctionBytes(final Pathname name) {
		final LispThread thread = LispThread.currentThread();
		Pathname load = null;
		SubLObject truenameFasl = LispSymbols.LOAD_TRUENAME_FASL.symbolValue(thread);
		SubLObject truename = LispSymbols.LOAD_TRUENAME.symbolValue(thread);
		Pathname fasl = null;
		if (truenameFasl instanceof Pathname) {
			load = Pathname.mergePathnames(name, (Pathname) truenameFasl, Keyword.NEWEST);
		} else if (truename instanceof Pathname) {
			load = Pathname.mergePathnames(name, (Pathname) truename, Keyword.NEWEST);
		} else {
          if (!Pathname.truename(name).equals(NIL)) {
              load = name;
          } else {
              load = null;
          }
      }
      InputStream input = null;
      if (load != null) {
          input = load.getInputStream();
      } else { 
          // Make a last-ditch attempt to load from the boot classpath XXX OSGi hack
          URL url = null;
          try {
              url = Lisp.class.getResource(name.getNamestring());
              input = url.openStream();
          } catch (IOException e) {
              error(new LispError("Failed to read class bytes from boot class " + url));
          }
		}
		byte[] bytes = new byte[4096];
		try {
			if (input == null) {
                  Debug.trace("Pathname: " + name);
                  Debug.trace("LOAD_TRUENAME_FASL: " + truenameFasl);
                  Debug.trace("LOAD_TRUENAME: " + truename);
                  Debug.assertTrue(input != null);
			}

			int n = 0;
			java.io.ByteArrayOutputStream baos = new java.io.ByteArrayOutputStream();
			try {
				while (n >= 0) {
					n = input.read(bytes, 0, 4096);
					if (n >= 0) {
						baos.write(bytes, 0, n);
					}
				}
			} catch (IOException e) {
				Debug.trace("Failed to read bytes from " + "'" + name.getNamestring() + "'");
				return null;
			}
			bytes = baos.toByteArray();
		} finally {
			try {
				input.close();
			} catch (IOException e) {
				Debug.trace("Failed to close InputStream: " + e);
			}
		}
		return bytes;
	}

	public static final Function makeCompiledFunctionFromClass(Class<?> c) {
		try {
			if (c != null) {
				Function obj = (Function) c.newInstance();
				return obj;
			} else {
				return null;
			}
		} catch (InstantiationException e) {
		} // ### FIXME
		catch (IllegalAccessException e) {
		} // ### FIXME

		return null;
	}

	public static final SubLObject loadCompiledFunction(InputStream in, int size) {
		byte[] bytes = readFunctionBytes(in, size);
		if (bytes != null)
			return loadClassBytes(bytes);
		else
			return error(new FileError("Can't read file off stream."));
	}

	private static final byte[] readFunctionBytes(InputStream in, int size) {
		try {
			byte[] bytes = new byte[size];
			int bytesRemaining = size;
			int bytesRead = 0;
			while (bytesRemaining > 0) {
				int n = in.read(bytes, bytesRead, bytesRemaining);
				if (n < 0)
					break;
				bytesRead += n;
				bytesRemaining -= n;
			}
			in.close();
			if (bytesRemaining > 0)
				Debug.trace("bytesRemaining = " + bytesRemaining);

			return bytes;
		} catch (IOException t) {
			Debug.trace(t); // FIXME: call error()?
		}
		return null;
	}

	public static final Function loadClassBytes(byte[] bytes) {
		return loadClassBytes(bytes, new JavaClassLoader());
	}

	public static final Function loadClassBytes(byte[] bytes, JavaClassLoader cl) {
		Class<?> c = cl.loadClassFromByteArray(null, bytes, 0, bytes.length);
		Function obj = makeCompiledFunctionFromClass(c);
		if (obj != null) {
			obj.setClassBytes(bytes);
		}
		return obj;
	}

	public static final SubLObject makeCompiledClosure(SubLObject template, ClosureBinding[] context)

	{
		return ((CompiledClosure) template).dup().setContext(context);
	}

	public static final String safeWriteToString(SubLObject obj) {
		try {
			return obj.writeToString();
		} catch (NullPointerException e) {
			Debug.trace(e);
			return "null";
		}
	}

	public static final boolean isValidSetfFunctionName(SubLObject obj) {
		if (obj instanceof SubLCons) {
			SubLCons cons = (SubLCons) obj;
			if (cons.first() == LispSymbols.SETF && cons.rest() instanceof SubLCons) {
				SubLCons cdr = (SubLCons) cons.rest();
				return (cdr.first() instanceof SubLSymbol && cdr.rest() == NIL);
			}
		}
		return false;
	}

	public static final boolean isValidMacroFunctionName(SubLObject obj) {
		if (obj instanceof SubLCons) {
			SubLCons cons = (SubLCons) obj;
			if (cons.first() == LispSymbols.MACRO_FUNCTION && cons.rest() instanceof SubLCons) {
				SubLCons cdr = (SubLCons) cons.rest();
				return (cdr.first() instanceof SubLSymbol && cdr.rest() == NIL);
			}
		}
		return false;
	}

	public static final SubLObject FUNCTION_NAME = list(LispSymbols.OR, LispSymbols.SYMBOL, list(LispSymbols.CONS, list(LispSymbols.EQL,
			LispSymbols.SETF), list(LispSymbols.CONS, LispSymbols.SYMBOL, LispSymbols.NULL)));

	public static final SubLObject UNSIGNED_BYTE_8 = list(LispSymbols.UNSIGNED_BYTE, Fixnum.constants[8]);

	public static final SubLObject UNSIGNED_BYTE_16 = list(LispSymbols.UNSIGNED_BYTE, Fixnum.constants[16]);

	public static final SubLObject UNSIGNED_BYTE_32 = list(LispSymbols.UNSIGNED_BYTE, Fixnum.constants[32]);

	public static final SubLObject UNSIGNED_BYTE_32_MAX_VALUE = LispObjectFactory.makeBignum(4294967296L);

	public static final SubLObject getUpgradedArrayElementType(SubLObject type)

	{
		if (type instanceof SubLSymbol) {
			if (type == LispSymbols.CHARACTER || type == LispSymbols.BASE_CHAR || type == LispSymbols.STANDARD_CHAR)
				return LispSymbols.CHARACTER;
			if (type == LispSymbols.BIT)
				return LispSymbols.BIT;
			if (type == NIL)
				return NIL;
		}
		if (type == BuiltInClass.CHARACTER)
			return LispSymbols.CHARACTER;
		if (type instanceof SubLCons) {
			if (type.equal(UNSIGNED_BYTE_8))
				return type;
			if (type.equal(UNSIGNED_BYTE_16))
				return type;
			if (type.equal(UNSIGNED_BYTE_32))
				return type;
			SubLObject car = type.first();
			if (car == LispSymbols.INTEGER) {
				SubLObject lower = type.second();
				SubLObject upper = type.rest().second();
				// Convert to inclusive bounds.
				if (lower instanceof SubLCons)
					lower = lower.first().inc();
				if (upper instanceof SubLCons)
					upper = upper.first().dec();
				if (lower.isInteger() && upper.isInteger()) {
					if (lower instanceof Fixnum && upper instanceof Fixnum) {
						int l = ((Fixnum) lower).value;
						if (l >= 0) {
							int u = ((Fixnum) upper).value;
							if (u <= 1)
								return LispSymbols.BIT;
							if (u <= 255)
								return UNSIGNED_BYTE_8;
							if (u <= 65535)
								return UNSIGNED_BYTE_16;
							return UNSIGNED_BYTE_32;
						}
					}
					if (lower.numGE(Fixnum.ZERO)) {
						if (lower.numL(UNSIGNED_BYTE_32_MAX_VALUE)) {
							if (upper.numL(UNSIGNED_BYTE_32_MAX_VALUE))
								return UNSIGNED_BYTE_32;
						}
					}
				}
			} else if (car == LispSymbols.EQL) {
				SubLObject obj = type.second();
				if (obj instanceof Fixnum) {
					int val = ((Fixnum) obj).value;
					if (val >= 0) {
						if (val <= 1)
							return LispSymbols.BIT;
						if (val <= 255)
							return UNSIGNED_BYTE_8;
						if (val <= 65535)
							return UNSIGNED_BYTE_16;
						return UNSIGNED_BYTE_32;
					}
				} else if (obj instanceof Bignum) {
					if (obj.numGE(Fixnum.ZERO)) {
						if (obj.numL(UNSIGNED_BYTE_32_MAX_VALUE))
							return UNSIGNED_BYTE_32;
					}
				}
			} else if (car == LispSymbols.MEMBER) {
				SubLObject rest = type.rest();
				while (rest != NIL) {
					SubLObject obj = rest.first();
					if (obj instanceof LispCharacter)
						rest = rest.rest();
					else
						return T;
				}
				return LispSymbols.CHARACTER;
			}
		}
		return T;
	}

	public static final byte coerceLispObjectToJavaByte(SubLObject obj)

	{
		return (byte) obj.intValue();
	}

	public static final SubLObject coerceJavaByteToLispObject(byte b) {
		return Fixnum.constants[((int) b) & 0xff];
	}

	public static final LispCharacter checkCharacter(SubLObject obj)

	{
		if (obj instanceof LispCharacter)
			return (LispCharacter) obj;
		return (LispCharacter) // Not reached.       
		type_error(obj, LispSymbols.CHARACTER);
	}

	public static final SubLPackage checkPackage(SubLObject obj)

	{
		if (obj instanceof SubLPackage)
			return (SubLPackage) obj;
		return (SubLPackage) // Not reached.       
		type_error(obj, LispSymbols.PACKAGE);
	}

	public static final Function checkFunction(SubLObject obj)

	{
		if (obj instanceof Function)
			return (Function) obj;
		return (Function) // Not reached.       
		type_error(obj, LispSymbols.FUNCTION);
	}

	public static final LispStream checkStream(SubLObject obj)

	{
		if (obj instanceof LispStream)
			return (LispStream) obj;
		return (LispStream) // Not reached.       
		type_error(obj, LispSymbols.STREAM);
	}

	public static final LispStream checkCharacterInputStream(SubLObject obj)

	{
		final LispStream stream = checkStream(obj);
		if (stream.isCharacterInputStream())
			return stream;
		return (LispStream) // Not reached.                      
		error(new TypeError("The value " + obj.writeToString() + " is not a character input stream."));
	}

	public static final LispStream checkCharacterOutputStream(SubLObject obj)

	{
		final LispStream stream = checkStream(obj);
		if (stream.isCharacterOutputStream())
			return stream;
		return (LispStream) // Not reached.
		error(new TypeError("The value " + obj.writeToString() + " is not a character output stream."));
	}

	public static final LispStream checkBinaryInputStream(SubLObject obj)

	{
		final LispStream stream = checkStream(obj);
		if (stream.isBinaryInputStream())
			return stream;
		return (LispStream) // Not reached.
		error(new TypeError("The value " + obj.writeToString() + " is not a binary input stream."));
	}

	public static final LispStream outSynonymOf(SubLObject obj)

	{
		if (obj instanceof LispStream)
			return (LispStream) obj;
		if (obj == T)
			return checkCharacterOutputStream(LispSymbols.TERMINAL_IO.symbolValue());
		if (obj == NIL)
			return checkCharacterOutputStream(LispSymbols.STANDARD_OUTPUT.symbolValue());
		return (LispStream) // Not reached.
		type_error(obj, LispSymbols.STREAM);
	}

	public static final LispStream inSynonymOf(SubLObject obj)

	{
		if (obj instanceof LispStream)
			return (LispStream) obj;
		if (obj == T)
			return checkCharacterInputStream(LispSymbols.TERMINAL_IO.symbolValue());
		if (obj == NIL)
			return checkCharacterInputStream(LispSymbols.STANDARD_INPUT.symbolValue());
		return (LispStream) // Not reached.
		type_error(obj, LispSymbols.STREAM);
	}

	public static final void writeByte(int n, SubLObject obj)

	{
		if (n < 0 || n > 255)
			type_error(LispObjectFactory.makeInteger(n), UNSIGNED_BYTE_8);
		checkStream(obj)._writeByte(n);
	}

	public static final Readtable checkReadtable(SubLObject obj)

	{
		if (obj instanceof Readtable)
			return (Readtable) obj;
		return (Readtable) // Not reached.       
		type_error(obj, LispSymbols.READTABLE);
	}

	public final static SubLString checkString(SubLObject obj)

	{
		if (obj instanceof SubLString)
			return (SubLString) obj;
		return (SubLString) // Not reached.               
		type_error(obj, LispSymbols.STRING);
	}

	public final static LispInteger checkInteger(SubLObject obj)

	{
		if (obj instanceof LispInteger)
			return (LispInteger) obj;
		return (LispInteger) // Not reached.               
		type_error(obj, LispSymbols.INTEGER);
	}

	public final static LispClass checkClass(SubLObject obj)

	{
		if (obj instanceof LispClass)
			return (LispClass) obj;
		return (LispClass) // Not reached.                    
		type_error(obj, LispSymbols.CLASS);
	}

	public final static Layout checkLayout(SubLObject obj)

	{
		if (obj instanceof Layout)
			return (Layout) obj;
		return (Layout) // Not reached.               
		type_error(obj, LispSymbols.LAYOUT);
	}

	public static final Readtable designator_readtable(SubLObject obj)

	{
		if (obj == NIL)
			obj = STANDARD_READTABLE.symbolValue();
		if (obj == null)
			throw new NullPointerException();
		return checkReadtable(obj);
	}

	public static final Environment checkEnvironment(SubLObject obj)

	{
		if (obj instanceof Environment)
			return (Environment) obj;
		return (Environment) // Not reached.       
		type_error(obj, LispSymbols.ENVIRONMENT);
	}

	public static final void checkBounds(int start, int end, int length)

	{
		if (start < 0 || end < 0 || start > end || end > length) {
			StringBuilder sb = new StringBuilder("The bounding indices ");
			sb.append(start);
			sb.append(" and ");
			sb.append(end);
			sb.append(" are bad for a sequence of length ");
			sb.append(length);
			sb.append('.');
			error(new TypeError(sb.toString()));
		}
	}

	public static final SubLObject coerceToFunction(SubLObject obj)

	{
		if (obj instanceof Function)
			return obj;
		if (obj instanceof StandardGenericFunction)
			return obj;
		if (obj instanceof SubLSymbol) {
			SubLObject fun = obj.getSymbolFunction();
			if (fun instanceof Function)
				return (Function) fun;
		} else if (obj instanceof SubLCons && obj.first() == LispSymbols.LAMBDA)
			return new Closure(obj, new Environment());
		error(new UndefinedFunction(obj));
		// Not reached.
		return null;
	}

	// Returns package or throws exception.
	public static final SubLPackage coerceToPackage(SubLObject obj)

	{
		if (obj instanceof SubLPackage)
			return (SubLPackage) obj;
		SubLPackage pkg = LispPackages.findPackage(javaString(obj));
		if (pkg != null)
			return pkg;
		error(new PackageError(obj.writeToString() + " is not the name of a package."));
		// Not reached.
		return null;
	}

	public static Pathname coerceToPathname(SubLObject arg)

	{
		if (arg instanceof Pathname)
			return (Pathname) arg;
		if (arg instanceof SubLString)
			return Pathname.parseNamestring((SubLString) arg);
		if (arg instanceof FileStream)
			return ((FileStream) arg).getPathname();
		type_error(arg, list(LispSymbols.OR, LispSymbols.PATHNAME, LispSymbols.STRING, LispSymbols.FILE_STREAM));
		// Not reached.
		return null;
	}

	public static SubLObject assq(SubLObject item, SubLObject alist)

	{
		while (alist instanceof SubLCons) {
			SubLObject entry = ((SubLCons) alist).first();
			if (entry instanceof SubLCons) {
				if (((SubLCons) entry).first() == item)
					return entry;
			} else if (entry != NIL)
				return type_error(entry, LispSymbols.LIST);
			alist = ((SubLCons) alist).rest();
		}
		if (alist != NIL)
			return type_error(alist, LispSymbols.LIST);
		return NIL;
	}

	public static final boolean memq(SubLObject item, SubLObject list)

	{
		while (list instanceof SubLCons) {
			if (item == ((SubLCons) list).first())
				return true;
			list = ((SubLCons) list).rest();
		}
		if (list != NIL)
			type_error(list, LispSymbols.LIST);
		return false;
	}

	public static final boolean memql(SubLObject item, SubLObject list)

	{
		while (list instanceof SubLCons) {
			if (item.eql(((SubLCons) list).first()))
				return true;
			list = ((SubLCons) list).rest();
		}
		if (list != NIL)
			type_error(list, LispSymbols.LIST);
		return false;
	}

	// Property lists.
	public static final SubLObject getf(SubLObject plist, SubLObject indicator, SubLObject defaultValue)

	{
		SubLObject list = plist;
		while (list != NIL) {
			if (list.first() == indicator)
				return list.second();
			if (list.rest() instanceof SubLCons)
				list = list.cddr();
			else
				return error(new TypeError("Malformed property list: " + plist.writeToString()));
		}
		return defaultValue;
	}

	public static final SubLObject get(SubLObject symbol, SubLObject indicator)

	{
		SubLObject list = checkSymbol(symbol).getPropertyList();
		while (list != NIL) {
			if (list.first() == indicator)
				return list.second();
			list = list.cddr();
		}
		return NIL;
	}

	public static final SubLObject get(SubLObject symbol, SubLObject indicator, SubLObject defaultValue)

	{
		SubLObject list = checkSymbol(symbol).getPropertyList();
		while (list != NIL) {
			if (list.first() == indicator)
				return list.second();
			list = list.cddr();
		}
		return defaultValue;
	}

	public static final SubLObject put(SubLSymbol symbol, SubLObject indicator, SubLObject value)

	{
		SubLObject list = symbol.getPropertyList();
		while (list != NIL) {
			if (list.first() == indicator) {
				// Found it!
				SubLObject rest = list.rest();
				rest.setCar(value);
				return value;
			}
			list = list.cddr();
		}
		// Not found.
		symbol.setPropertyList(makeCons(indicator, makeCons(value, symbol.getPropertyList())));
		return value;
	}

	public static final SubLObject putf(SubLObject plist, SubLObject indicator, SubLObject value)

	{
		SubLObject list = plist;
		while (list != NIL) {
			if (list.first() == indicator) {
				// Found it!
				SubLObject rest = list.rest();
				rest.setCar(value);
				return plist;
			}
			list = list.cddr();
		}
		// Not found.
		return makeCons(indicator, makeCons(value, plist));
	}

	public static final SubLObject remprop(SubLSymbol symbol, SubLObject indicator)

	{
		SubLObject list = checkList(symbol.getPropertyList());
		SubLObject prev = null;
		while (list != NIL) {
			if (!(list.rest() instanceof SubLCons))
				error(new ProgramError("The symbol " + symbol.writeToString()
						+ " has an odd number of items in its property list."));
			if (list.first() == indicator) {
				// Found it!
				if (prev != null)
					prev.setCdr(list.cddr());
				else
					symbol.setPropertyList(list.cddr());
				return T;
			}
			prev = list.rest();
			list = list.cddr();
		}
		// Not found.
		return NIL;
	}

	public static final String format(SubLObject formatControl, SubLObject formatArguments)

	{
		final LispThread thread = LispThread.currentThread();
		String control = formatControl.getString();
		SubLObject[] args = formatArguments.copyToArray();
		StringBuffer sb = new StringBuffer();
		if (control != null) {
			final int limit = control.length();
			int j = 0;
			final int NEUTRAL = 0;
			final int TILDE = 1;
			int state = NEUTRAL;
			for (int i = 0; i < limit; i++) {
				char c = control.charAt(i);
				if (state == NEUTRAL) {
					if (c == '~')
						state = TILDE;
					else
						sb.append(c);
				} else if (state == TILDE) {
					if (c == 'A' || c == 'a') {
						if (j < args.length) {
							SubLObject obj = args[j++];
							final SpecialBindingsMark mark = thread.markSpecialBindings();
							thread.bindSpecial(LispSymbols.PRINT_ESCAPE, NIL);
							thread.bindSpecial(LispSymbols.PRINT_READABLY, NIL);
							try {
								sb.append(obj.writeToString());
							} finally {
								thread.resetSpecialBindings(mark);
							}
						}
					} else if (c == 'S' || c == 's') {
						if (j < args.length) {
							SubLObject obj = args[j++];
							final SpecialBindingsMark mark = thread.markSpecialBindings();
							thread.bindSpecial(LispSymbols.PRINT_ESCAPE, T);
							try {
								sb.append(obj.writeToString());
							} finally {
								thread.resetSpecialBindings(mark);
							}
						}
					} else if (c == 'D' || c == 'd') {
						if (j < args.length) {
							SubLObject obj = args[j++];
							final SpecialBindingsMark mark = thread.markSpecialBindings();
							thread.bindSpecial(LispSymbols.PRINT_ESCAPE, NIL);
							thread.bindSpecial(LispSymbols.PRINT_RADIX, NIL);
							thread.bindSpecial(LispSymbols.PRINT_BASE, Fixnum.constants[10]);
							try {
								sb.append(obj.writeToString());
							} finally {
								thread.resetSpecialBindings(mark);
							}
						}
					} else if (c == 'X' || c == 'x') {
						if (j < args.length) {
							SubLObject obj = args[j++];
							final SpecialBindingsMark mark = thread.markSpecialBindings();
							thread.bindSpecial(LispSymbols.PRINT_ESCAPE, NIL);
							thread.bindSpecial(LispSymbols.PRINT_RADIX, NIL);
							thread.bindSpecial(LispSymbols.PRINT_BASE, Fixnum.constants[16]);
							try {
								sb.append(obj.writeToString());
							} finally {
								thread.resetSpecialBindings(mark);
							}
						}
					} else if (c == '%') {
						sb.append('\n');
					}
					state = NEUTRAL;
				} else {
					// There are no other valid states.
					Debug.assertTrue(false);
				}
			}
		}
		return sb.toString();
	}

	public static final SubLSymbol intern(String name, SubLPackage pkg) {
		return pkg.intern(name);
	}

	// Used by the compiler.
	public static final SubLSymbol internInPackage(String name, String packageName)

	{
		SubLPackage pkg = LispPackages.findPackage(packageName);
		if (pkg == null)
			error(new LispError(packageName + " is not the name of a package."));
		return pkg.intern(name);
	}

	public static final SubLSymbol internKeyword(String s) {
		return PACKAGE_KEYWORD.intern(s);
	}

	// The compiler's object table.
	static final Hashtable<String, SubLObject> objectTable = new Hashtable<String, SubLObject>();

	public static final SubLObject recall(String key) {
		return objectTable.remove(key);
	}

	public static final SubLObject recall(SubLString key) {
		return recall(key.getString());
	}

	// ### remember
	public static final Primitive REMEMBER = new JavaPrimitive("remember", PACKAGE_SYS, true) {
		@Override
		public SubLObject execute(SubLObject key, SubLObject value)

		{
			objectTable.put(key.STRING().getString(), value);
			return NIL;
		}
	};
	
	// ### recall
	public static final Primitive RECALL = new JavaPrimitive("recall", PACKAGE_SYS, true) {
		public SubLObject execute(SubLObject key) {
			return execute(key,NIL);
		}
		@Override
		public SubLObject execute(SubLObject key, SubLObject value)

		{
			String sk = key.STRING().getString();
			if (!objectTable.containsKey(sk)) return value;
			value = objectTable.get(sk);
			return value;
		}
	};


	public static final SubLSymbol internSpecial(String name, SubLPackage pkg, SubLObject value) {
		SubLSymbol symbol = pkg.intern(name);
		symbol.setSpecial(true);
		symbol.setSymbolValue(value);
		return symbol;
	}

	public static final SubLSymbol internConstant(String name, SubLPackage pkg, SubLObject value) {
		SubLSymbol symbol = pkg.intern(name);
		symbol.initializeConstant(value);
		return symbol;
	}

	public static final SubLSymbol exportSpecial(String name, SubLPackage pkg, SubLObject value) {
		SubLSymbol symbol = pkg.intern(name);
		pkg.export(symbol); // FIXME Inefficient!
		symbol.setSpecial(true);
		symbol.setSymbolValue(value);
		return symbol;
	}

	public static final SubLSymbol exportConstant(String name, SubLPackage pkg, SubLObject value) {
		SubLSymbol symbol = pkg.intern(name);
		pkg.export(symbol); // FIXME Inefficient!
		symbol.initializeConstant(value);
		return symbol;
	}

	static {
		String userDir = System.getProperty("user.dir");
		if (userDir != null && userDir.length() > 0) {
			if (userDir.charAt(userDir.length() - 1) != File.separatorChar)
				userDir = userDir.concat(File.separator);
		}
		// This string will be converted to a pathname when Pathname.java is loaded.
		LispSymbols.DEFAULT_PATHNAME_DEFAULTS.initializeSpecial(makeString(userDir));
	}

	static {
		LispSymbols._PACKAGE_.initializeSpecial(PACKAGE_CL_USER);
	}

	public static final SubLPackage getCurrentPackage() {
		return (SubLPackage) LispSymbols._PACKAGE_.symbolValueNoThrow();
	}

	public static final void resetIO(LispStream in, LispStream out) {
		stdin = in;
		stdout = out;
		LispSymbols.STANDARD_INPUT.setSymbolValue(stdin);
		LispSymbols.STANDARD_OUTPUT.setSymbolValue(stdout);
		LispSymbols.ERROR_OUTPUT.setSymbolValue(stdout);
		LispSymbols.TRACE_OUTPUT.setSymbolValue(stdout);
		LispSymbols.TERMINAL_IO.setSymbolValue(new TwoWayStream(stdin, stdout, true));
		LispSymbols.QUERY_IO.setSymbolValue(new TwoWayStream(stdin, stdout, true));
		LispSymbols.DEBUG_IO.setSymbolValue(new TwoWayStream(stdin, stdout, true));
	}

	// Used in org/armedbear/j/JLisp.java.
	public static final void resetIO() {
		resetIO(makeStream(LispSymbols.SYSTEM_STREAM, System.in, LispSymbols.CHARACTER, true), makeStream(LispSymbols.SYSTEM_STREAM,
				System.out, LispSymbols.CHARACTER, true));
	}

	public static final TwoWayStream getTerminalIO() {
		return (TwoWayStream) LispSymbols.TERMINAL_IO.symbolValueNoThrow();
	}

	public static final LispStream getStandardInput() {
		return (LispStream) LispSymbols.STANDARD_INPUT.symbolValueNoThrow();
	}

	public static final LispStream getStandardOutput() {
		return checkCharacterOutputStream(LispSymbols.STANDARD_OUTPUT.symbolValue());
	}

	static {
		LispSymbols.CURRENT_READTABLE.initializeSpecial(new Readtable());
	}

	// ### +standard-readtable+
	// internal symbol
	public static final SubLSymbol STANDARD_READTABLE = internConstant("+STANDARD-READTABLE+", PACKAGE_SYS, new Readtable());

	public static final Readtable currentReadtable() {
		return (Readtable) LispSymbols.CURRENT_READTABLE.symbolValue();
	}

	static {
		LispSymbols.READ_SUPPRESS.initializeSpecial(NIL);
		LispSymbols.DEBUGGER_HOOK.initializeSpecial(NIL);
	}

	static {
		LispSymbols.MOST_POSITIVE_FIXNUM.initializeConstant(LispObjectFactory.makeInteger(Integer.MAX_VALUE));
		LispSymbols.MOST_NEGATIVE_FIXNUM.initializeConstant(LispObjectFactory.makeInteger(Integer.MIN_VALUE));
		LispSymbols.MOST_POSITIVE_JAVA_LONG.initializeConstant(LispObjectFactory.makeBignum(Long.MAX_VALUE));
		LispSymbols.MOST_NEGATIVE_JAVA_LONG.initializeConstant(LispObjectFactory.makeBignum(Long.MIN_VALUE));
	}

	public static void exit(int status) {
		Interpreter interpreter = Interpreter.getInstance();
		if (interpreter != null)
			interpreter.kill(status);
	}

	// ### t
	public static final SubLSymbol T = LispSymbols.T;
	static {
		T.initializeConstant(T);
	}

	static {
		LispSymbols.READ_EVAL.initializeSpecial(T);
	}

	// ### *features*
	static {
		LispSymbols.FEATURES.initializeSpecial(NIL);
		String osName = System.getProperty("os.name");
		if (osName.startsWith("Linux")) {
			LispSymbols.FEATURES.setSymbolValue(list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP, Keyword.ANSI_CL,
					Keyword.UNIX, Keyword.LINUX, Keyword.CDR6));
		} else if (osName.startsWith("SunOS")) {
			LispSymbols.FEATURES.setSymbolValue(list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP, Keyword.ANSI_CL,
					Keyword.UNIX, Keyword.SUNOS, Keyword.CDR6));
		} else if (osName.startsWith("Mac OS X") || osName.startsWith("Darwin")) {
			LispSymbols.FEATURES.setSymbolValue(list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP, Keyword.ANSI_CL,
					Keyword.UNIX, Keyword.DARWIN, Keyword.CDR6));
		} else if (osName.startsWith("FreeBSD")) {
			LispSymbols.FEATURES.setSymbolValue(list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP, Keyword.ANSI_CL,
					Keyword.UNIX, Keyword.FREEBSD, Keyword.CDR6));
		} else if (osName.startsWith("OpenBSD")) {
			LispSymbols.FEATURES.setSymbolValue(list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP, Keyword.ANSI_CL,
					Keyword.UNIX, Keyword.OPENBSD, Keyword.CDR6));
		} else if (osName.startsWith("NetBSD")) {
			LispSymbols.FEATURES.setSymbolValue(list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP, Keyword.ANSI_CL,
					Keyword.UNIX, Keyword.NETBSD, Keyword.CDR6));
		} else if (osName.startsWith("Windows")) {
			LispSymbols.FEATURES.setSymbolValue(list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP, Keyword.ANSI_CL,
					Keyword.WINDOWS, Keyword.CDR6));
		} else {
			LispSymbols.FEATURES.setSymbolValue(list(Keyword.ARMEDBEAR, Keyword.ABCL, Keyword.COMMON_LISP, Keyword.ANSI_CL,
					Keyword.CDR6));
		}
	}
	static {
		final String version = System.getProperty("java.version");
		if (version.startsWith("1.5")) {
			LispSymbols.FEATURES.setSymbolValue(makeCons(Keyword.JAVA_1_5, LispSymbols.FEATURES.getSymbolValue()));
		} else if (version.startsWith("1.6")) {
			LispSymbols.FEATURES.setSymbolValue(makeCons(Keyword.JAVA_1_6, LispSymbols.FEATURES.getSymbolValue()));
		} else if (version.startsWith("1.7")) {
			LispSymbols.FEATURES.setSymbolValue(makeCons(Keyword.JAVA_1_7, LispSymbols.FEATURES.getSymbolValue()));
		}
	}
	static {
		String os_arch = System.getProperty("os.arch");
		if (os_arch != null) {
			if (os_arch.equals("amd64"))
				LispSymbols.FEATURES.setSymbolValue(makeCons(Keyword.X86_64, LispSymbols.FEATURES.getSymbolValue()));
			else if (os_arch.equals("x86"))
				LispSymbols.FEATURES.setSymbolValue(makeCons(Keyword.X86, LispSymbols.FEATURES.getSymbolValue()));
		}
	}

	static {
		LispSymbols.MODULES.initializeSpecial(NIL);
	}

	static {
		LispSymbols.LOAD_VERBOSE.initializeSpecial(NIL);
		LispSymbols.LOAD_PRINT.initializeSpecial(NIL);
		LispSymbols.LOAD_PATHNAME.initializeSpecial(NIL);
		LispSymbols.LOAD_TRUENAME.initializeSpecial(NIL);
		LispSymbols.LOAD_TRUENAME_FASL.initializeSpecial(NIL);
		LispSymbols.COMPILE_VERBOSE.initializeSpecial(T);
		LispSymbols.COMPILE_PRINT.initializeSpecial(T);
		LispSymbols._COMPILE_FILE_PATHNAME_.initializeSpecial(NIL);
		LispSymbols.COMPILE_FILE_TRUENAME.initializeSpecial(NIL);
	}

	// ### *double-colon-package-separators*
	// internal symbol
	public static final SubLSymbol DOUBLE_COLON_PACKAGE_SEPARATORS = internSpecial("*DOUBLE-COLON-PACKAGE-SEPARATORS*",
			PACKAGE_SYS, NIL);

	// ### *load-depth*
	// internal symbol
	public static final SubLSymbol _LOAD_DEPTH_ = internSpecial("*LOAD-DEPTH*", PACKAGE_SYS, Fixnum.ZERO);

	// ### *load-stream*
	// internal symbol
	public static final SubLSymbol _LOAD_STREAM_ = internSpecial("*LOAD-STREAM*", PACKAGE_SYS, NIL);

	// ### *source*
	// internal symbol
	public static final SubLSymbol _SOURCE_ = exportSpecial("*SOURCE*", PACKAGE_SYS, NIL);

	// ### *source-position*
	// internal symbol
	public static final SubLSymbol _SOURCE_POSITION_ = exportSpecial("*SOURCE-POSITION*", PACKAGE_SYS, NIL);

	// ### *autoload-verbose*
	// internal symbol
	public static final SubLSymbol _AUTOLOAD_VERBOSE_ = exportSpecial("*AUTOLOAD-VERBOSE*", PACKAGE_EXT, NIL);

	// ### *preloading-cache*
	public static final SubLSymbol AUTOLOADING_CACHE = internSpecial("*AUTOLOADING-CACHE*", PACKAGE_SYS, NIL);

	// ### *compile-file-type*
	public static final String COMPILE_FILE_TYPE = "abcl";
	public static final SubLSymbol _COMPILE_FILE_TYPE_ = internConstant("*COMPILE-FILE-TYPE*", PACKAGE_SYS, makeString(
			COMPILE_FILE_TYPE));

	// ### *compile-file-zip*
	public static final SubLSymbol _COMPILE_FILE_ZIP_ = exportSpecial("*COMPILE-FILE-ZIP*", PACKAGE_SYS, T);

	static {
		LispSymbols.MACROEXPAND_HOOK.initializeSpecial(LispSymbols.FUNCALL);
	}

	public static final int ARRAY_DIMENSION_MAX = Integer.MAX_VALUE;
	static {
		// ### array-dimension-limit
		LispSymbols.ARRAY_DIMENSION_LIMIT.initializeConstant(LispObjectFactory.makeInteger(ARRAY_DIMENSION_MAX));
	}

	// ### char-code-limit
	// "The upper exclusive bound on the value returned by the function CHAR-CODE."
	public static final int CHAR_MAX = Character.MAX_VALUE;
	static {
		LispSymbols.CHAR_CODE_LIMIT.initializeConstant(LispObjectFactory.makeInteger(CHAR_MAX + 1));
	}

	static {
		LispSymbols.READ_BASE.initializeSpecial(Fixnum.constants[10]);
	}

	static {
		LispSymbols.READ_DEFAULT_FLOAT_FORMAT.initializeSpecial(LispSymbols.SINGLE_FLOAT);
	}

	// Printer control variables.
	static {
		LispSymbols.PRINT_ARRAY.initializeSpecial(T);
		LispSymbols.PRINT_BASE.initializeSpecial(Fixnum.constants[10]);
		LispSymbols.PRINT_CASE.initializeSpecial(Keyword.UPCASE);
		LispSymbols.PRINT_CIRCLE.initializeSpecial(NIL);
		LispSymbols.PRINT_ESCAPE.initializeSpecial(T);
		LispSymbols.PRINT_GENSYM.initializeSpecial(T);
		LispSymbols.PRINT_LENGTH.initializeSpecial(NIL);
		LispSymbols.PRINT_LEVEL.initializeSpecial(NIL);
		LispSymbols.PRINT_LINES.initializeSpecial(NIL);
		LispSymbols.PRINT_MISER_WIDTH.initializeSpecial(NIL);
		LispSymbols.PRINT_PPRINT_DISPATCH.initializeSpecial(NIL);
		LispSymbols.PRINT_PRETTY.initializeSpecial(NIL);
		LispSymbols.PRINT_RADIX.initializeSpecial(NIL);
		LispSymbols.PRINT_READABLY.initializeSpecial(NIL);
		LispSymbols.PRINT_RIGHT_MARGIN.initializeSpecial(NIL);
	}

	public static final SubLSymbol _PRINT_STRUCTURE_ = exportSpecial("*PRINT-STRUCTURE*", PACKAGE_EXT, T);

	// ### *current-print-length*
	public static final SubLSymbol _CURRENT_PRINT_LENGTH_ = exportSpecial("*CURRENT-PRINT-LENGTH*", PACKAGE_SYS, Fixnum.ZERO);

	// ### *current-print-level*
	public static final SubLSymbol _CURRENT_PRINT_LEVEL_ = exportSpecial("*CURRENT-PRINT-LEVEL*", PACKAGE_SYS, Fixnum.ZERO);

	public static final SubLSymbol _PRINT_FASL_ = internSpecial("*PRINT-FASL*", PACKAGE_SYS, NIL);

	static {
		LispSymbols._RANDOM_STATE_.initializeSpecial(new RandomState());
	}

	static {
		LispSymbols.STAR.initializeSpecial(NIL);
		LispSymbols.STAR_STAR.initializeSpecial(NIL);
		LispSymbols.STAR_STAR_STAR.initializeSpecial(NIL);
		LispSymbols.MINUS.initializeSpecial(NIL);
		LispSymbols.PLUS.initializeSpecial(NIL);
		LispSymbols.PLUS_PLUS.initializeSpecial(NIL);
		LispSymbols.PLUS_PLUS_PLUS.initializeSpecial(NIL);
		LispSymbols.SLASH.initializeSpecial(NIL);
		LispSymbols.SLASH_SLASH.initializeSpecial(NIL);
		LispSymbols.SLASH_SLASH_SLASH.initializeSpecial(NIL);
	}

	// Floating point constants.
	static {
		LispSymbols.PI.initializeConstant(makeDouble(Math.PI));
		LispSymbols.SHORT_FLOAT_EPSILON.initializeConstant(makeSingle((float) 5.960465E-8));
		LispSymbols.SINGLE_FLOAT_EPSILON.initializeConstant(makeSingle((float) 5.960465E-8));
		LispSymbols.DOUBLE_FLOAT_EPSILON.initializeConstant(makeDouble((double) 1.1102230246251568E-16));
		LispSymbols.LONG_FLOAT_EPSILON.initializeConstant(makeDouble((double) 1.1102230246251568E-16));
		LispSymbols.SHORT_FLOAT_NEGATIVE_EPSILON.initializeConstant(makeSingle(2.9802326e-8f));
		LispSymbols.SINGLE_FLOAT_NEGATIVE_EPSILON.initializeConstant(makeSingle(2.9802326e-8f));
		LispSymbols.DOUBLE_FLOAT_NEGATIVE_EPSILON.initializeConstant(makeDouble((double) 5.551115123125784E-17));
		LispSymbols.LONG_FLOAT_NEGATIVE_EPSILON.initializeConstant(makeDouble((double) 5.551115123125784E-17));
		LispSymbols.MOST_POSITIVE_SHORT_FLOAT.initializeConstant(makeSingle(Float.MAX_VALUE));
		LispSymbols.MOST_POSITIVE_SINGLE_FLOAT.initializeConstant(makeSingle(Float.MAX_VALUE));
		LispSymbols.MOST_POSITIVE_DOUBLE_FLOAT.initializeConstant(makeDouble(Double.MAX_VALUE));
		LispSymbols.MOST_POSITIVE_LONG_FLOAT.initializeConstant(makeDouble(Double.MAX_VALUE));
		LispSymbols.LEAST_POSITIVE_SHORT_FLOAT.initializeConstant(makeSingle(Float.MIN_VALUE));
		LispSymbols.LEAST_POSITIVE_SINGLE_FLOAT.initializeConstant(makeSingle(Float.MIN_VALUE));
		LispSymbols.LEAST_POSITIVE_DOUBLE_FLOAT.initializeConstant(makeDouble(Double.MIN_VALUE));
		LispSymbols.LEAST_POSITIVE_LONG_FLOAT.initializeConstant(makeDouble(Double.MIN_VALUE));
		LispSymbols.LEAST_POSITIVE_NORMALIZED_SHORT_FLOAT.initializeConstant(makeSingle(1.17549435e-38f));
		LispSymbols.LEAST_POSITIVE_NORMALIZED_SINGLE_FLOAT.initializeConstant(makeSingle(1.17549435e-38f));
		LispSymbols.LEAST_POSITIVE_NORMALIZED_DOUBLE_FLOAT.initializeConstant(makeDouble(2.2250738585072014e-308d));
		LispSymbols.LEAST_POSITIVE_NORMALIZED_LONG_FLOAT.initializeConstant(makeDouble(2.2250738585072014e-308d));
		LispSymbols.MOST_NEGATIVE_SHORT_FLOAT.initializeConstant(makeSingle(-Float.MAX_VALUE));
		LispSymbols.MOST_NEGATIVE_SINGLE_FLOAT.initializeConstant(makeSingle(-Float.MAX_VALUE));
		LispSymbols.MOST_NEGATIVE_DOUBLE_FLOAT.initializeConstant(makeDouble(-Double.MAX_VALUE));
		LispSymbols.MOST_NEGATIVE_LONG_FLOAT.initializeConstant(makeDouble(-Double.MAX_VALUE));
		LispSymbols.LEAST_NEGATIVE_SHORT_FLOAT.initializeConstant(makeSingle(-Float.MIN_VALUE));
		LispSymbols.LEAST_NEGATIVE_SINGLE_FLOAT.initializeConstant(makeSingle(-Float.MIN_VALUE));
		LispSymbols.LEAST_NEGATIVE_DOUBLE_FLOAT.initializeConstant(makeDouble(-Double.MIN_VALUE));
		LispSymbols.LEAST_NEGATIVE_LONG_FLOAT.initializeConstant(makeDouble(-Double.MIN_VALUE));
		LispSymbols.LEAST_NEGATIVE_NORMALIZED_SHORT_FLOAT.initializeConstant(makeSingle(-1.17549435e-38f));
		LispSymbols.LEAST_NEGATIVE_NORMALIZED_SINGLE_FLOAT.initializeConstant(makeSingle(-1.17549435e-38f));
		LispSymbols.LEAST_NEGATIVE_NORMALIZED_DOUBLE_FLOAT.initializeConstant(makeDouble(-2.2250738585072014e-308d));
		LispSymbols.LEAST_NEGATIVE_NORMALIZED_LONG_FLOAT.initializeConstant(makeDouble(-2.2250738585072014e-308d));
	}

	static {
		LispSymbols.BOOLE_CLR.initializeConstant(Fixnum.ZERO);
		LispSymbols.BOOLE_SET.initializeConstant(Fixnum.ONE);
		LispSymbols.BOOLE_1.initializeConstant(Fixnum.TWO);
		LispSymbols.BOOLE_2.initializeConstant(Fixnum.constants[3]);
		LispSymbols.BOOLE_C1.initializeConstant(Fixnum.constants[4]);
		LispSymbols.BOOLE_C2.initializeConstant(Fixnum.constants[5]);
		LispSymbols.BOOLE_AND.initializeConstant(Fixnum.constants[6]);
		LispSymbols.BOOLE_IOR.initializeConstant(Fixnum.constants[7]);
		LispSymbols.BOOLE_XOR.initializeConstant(Fixnum.constants[8]);
		LispSymbols.BOOLE_EQV.initializeConstant(Fixnum.constants[9]);
		LispSymbols.BOOLE_NAND.initializeConstant(Fixnum.constants[10]);
		LispSymbols.BOOLE_NOR.initializeConstant(Fixnum.constants[11]);
		LispSymbols.BOOLE_ANDC1.initializeConstant(Fixnum.constants[12]);
		LispSymbols.BOOLE_ANDC2.initializeConstant(Fixnum.constants[13]);
		LispSymbols.BOOLE_ORC1.initializeConstant(Fixnum.constants[14]);
		LispSymbols.BOOLE_ORC2.initializeConstant(Fixnum.constants[15]);
	}

	static {
		// ### call-arguments-limit
		LispSymbols.CALL_ARGUMENTS_LIMIT.initializeConstant(Fixnum.constants[50]);
	}

	static {
		// ### lambda-parameters-limit
		LispSymbols.LAMBDA_PARAMETERS_LIMIT.initializeConstant(Fixnum.constants[50]);
	}

	static {
		// ### multiple-values-limit
		LispSymbols.MULTIPLE_VALUES_LIMIT.initializeConstant(Fixnum.constants[20]);
	}

	static {
		// ### internal-time-units-per-second
		LispSymbols.INTERNAL_TIME_UNITS_PER_SECOND.initializeConstant(LispObjectFactory.makeInteger(1000));
	}

	static {
		LispSymbols.LAMBDA_LIST_KEYWORDS.initializeConstant(list(LispSymbols.AND_OPTIONAL, LispSymbols.AND_REST, LispSymbols.AND_KEY,
				LispSymbols.AND_AUX, LispSymbols.AND_BODY, LispSymbols.AND_WHOLE, LispSymbols.AND_ALLOW_OTHER_KEYS, LispSymbols.AND_ENVIRONMENT));
	}

	// ### call-registers-limit
	public static final SubLSymbol CALL_REGISTERS_LIMIT = exportConstant("CALL-REGISTERS-LIMIT", PACKAGE_SYS,
			Fixnum.constants[CALL_REGISTERS_MAX]);

	// ### *warn-on-redefinition*
	public static final SubLSymbol _WARN_ON_REDEFINITION_ = exportSpecial("*WARN-ON-REDEFINITION*", PACKAGE_EXT, T);

	// ### *saved-backtrace*
	public static final SubLSymbol _SAVED_BACKTRACE_ = exportSpecial("*SAVED-BACKTRACE*", PACKAGE_EXT, NIL);

	// ### *command-line-argument-list*
	public static final SubLSymbol _COMMAND_LINE_ARGUMENT_LIST_ = exportSpecial("*COMMAND-LINE-ARGUMENT-LIST*", PACKAGE_EXT,
			NIL);

	// ### *batch-mode*
	public static final SubLSymbol _BATCH_MODE_ = exportSpecial("*BATCH-MODE*", PACKAGE_EXT, NIL);

	// ### *noinform*
	public static final SubLSymbol _NOINFORM_ = exportSpecial("*NOINFORM*", PACKAGE_SYS, NIL);

	// ### *disassembler*
	public static final SubLSymbol _DISASSEMBLER_ = exportSpecial("*DISASSEMBLER*", PACKAGE_EXT,
			makeString("jad -a -p")); // or "jad -dis -p"

	// ### *speed* compiler policy
	public static final SubLSymbol _SPEED_ = exportSpecial("*SPEED*", PACKAGE_SYS, Fixnum.TWO);

	// ### *space* compiler policy
	public static final SubLSymbol _SPACE_ = exportSpecial("*SPACE*", PACKAGE_SYS, Fixnum.ONE);

	// ### *safety* compiler policy
	public static final SubLSymbol _SAFETY_ = exportSpecial("*SAFETY*", PACKAGE_SYS, Fixnum.ONE);

	// ### *debug* compiler policy
	public static final SubLSymbol _DEBUG_ = exportSpecial("*DEBUG*", PACKAGE_SYS, Fixnum.ONE);

	// ### *explain* compiler policy
	public static final SubLSymbol _EXPLAIN_ = exportSpecial("*EXPLAIN*", PACKAGE_SYS, NIL);

	// ### *enable-inline-expansion*
	public static final SubLSymbol _ENABLE_INLINE_EXPANSION_ = exportSpecial("*ENABLE-INLINE-EXPANSION*", PACKAGE_EXT, T);

	// ### *require-stack-frame*
	public static final SubLSymbol _REQUIRE_STACK_FRAME_ = exportSpecial("*REQUIRE-STACK-FRAME*", PACKAGE_EXT, NIL);

	static {
		LispSymbols.SUPPRESS_COMPILER_WARNINGS.initializeSpecial(NIL);
	}

	public static final SubLSymbol _COMPILE_FILE_ENVIRONMENT_ = exportSpecial("*COMPILE-FILE-ENVIRONMENT*", PACKAGE_SYS, NIL);

	public static final SubLObject UNBOUND_VALUE = new unboundValue();

	static class unboundValue extends AbstractLispObject {
		@Override
		public String writeToString() {
			return "#<UNBOUND>";
		}
	}

	public static final SubLObject NULL_VALUE = new nullValue();

	static class nullValue extends AbstractLispObject {
		@Override
		public String writeToString() {
			return "null";
		}
	}

	public static final SubLSymbol _SLOT_UNBOUND_ = exportConstant("+SLOT-UNBOUND+", PACKAGE_SYS, UNBOUND_VALUE);

	public static final SubLSymbol _CL_PACKAGE_ = exportConstant("+CL-PACKAGE+", PACKAGE_SYS, PACKAGE_CL);

	public static final SubLSymbol _KEYWORD_PACKAGE_ = exportConstant("+KEYWORD-PACKAGE+", PACKAGE_SYS, PACKAGE_KEYWORD);

	// ### *backquote-count*
	public static final SubLSymbol _BACKQUOTE_COUNT_ = internSpecial("*BACKQUOTE-COUNT*", PACKAGE_SYS, Fixnum.ZERO);

	// ### *bq-vector-flag*
	public static final SubLSymbol _BQ_VECTOR_FLAG_ = internSpecial("*BQ-VECTOR-FLAG*", PACKAGE_SYS, list(makeSymbol("bqv")));

	// ### *traced-names*
	public static final SubLSymbol _TRACED_NAMES_ = exportSpecial("*TRACED-NAMES*", PACKAGE_SYS, NIL);

	// Floating point traps.
	protected static boolean TRAP_OVERFLOW = true;
	protected static boolean TRAP_UNDERFLOW = true;

	// Extentions
	static {
		LispSymbols._INSPECTOR_HOOK_.initializeSpecial(NIL);
	}

	private static final void loadClass(String className) {
		try {
			Class.forName(className);
		} catch (ClassNotFoundException e) {
			Debug.trace(e);
		}
	}

	static {
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Primitives");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.SpecialOperators");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.StreamFunctions");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.StringFunctions");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.ArrayFunctions");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.CharacterFunctions");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Extensions");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.CompiledClosure");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Autoload");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.AutoloadMacro");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.ConsFunctions");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Do");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Pathname");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.LispClass");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.BuiltInClass");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.StructureObject");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.MathFunctions");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.ConditionFunctions");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.function_info");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.JavaFunctions");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.PackageFunctions");
		loadClass("com.cyc.tool.subl.jrtl.nativeCode.commonLisp.Profiler");
		cold = false;
	}

	private static LispStream stdin = LispObjectFactory.makeStream(LispSymbols.SYSTEM_STREAM, System.in, LispSymbols.CHARACTER, true);

	private static LispStream stdout = makeStream(LispSymbols.SYSTEM_STREAM, System.out, LispSymbols.CHARACTER, true);

	static {
		LispSymbols.STANDARD_INPUT.initializeSpecial(stdin);
		LispSymbols.STANDARD_OUTPUT.initializeSpecial(stdout);
		LispSymbols.ERROR_OUTPUT.initializeSpecial(stdout);
		LispSymbols.TRACE_OUTPUT.initializeSpecial(stdout);
		LispSymbols.TERMINAL_IO.initializeSpecial(new TwoWayStream(stdin, stdout, true));
		LispSymbols.QUERY_IO.initializeSpecial(new TwoWayStream(stdin, stdout, true));
		LispSymbols.DEBUG_IO.initializeSpecial(new TwoWayStream(stdin, stdout, true));
	}
}
