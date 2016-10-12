/*
 * CompiledClosure.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: CompiledClosure.java 12398 2010-01-24 21:59:56Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class CompiledClosure extends Closure implements Cloneable {

	// ### load-compiled-function
	private static Primitive LOAD_COMPILED_FUNCTION = new JavaPrimitive("load-compiled-function", Lisp.PACKAGE_SYS,
			true, "source") {

		public SubLObject execute(SubLObject arg) {
			String namestring = null;
			if (arg instanceof Pathname)
				namestring = ((Pathname) arg).getNamestring();
			else if (arg instanceof SubLString)
				namestring = arg.getString();
			if (namestring != null)
				// Debug.trace("autoloading preloaded ... " + namestring);
				return AutoloadedFunctionProxy.loadPreloadedFunction(namestring);
			if (arg instanceof JavaObject)
				try {
					return Lisp.loadClassBytes((byte[]) arg.javaInstance(byte[].class));
				} catch (Throwable t) {
					Debug.trace(t);
					return Lisp.error(new LispError("Unable to load " + arg.writeToString()));
				}
			return Lisp.error(new LispError("Unable to load " + arg.writeToString()));
		}
	};

	// ### varlist
	private static Primitive VARLIST = new JavaPrimitive("varlist", Lisp.PACKAGE_SYS, false) {

		public SubLObject execute(SubLObject arg) {
			if (arg instanceof Closure)
				return ((Closure) arg).getVariableList();
			return Lisp.type_error(arg, LispSymbols.COMPILED_FUNCTION);
		}
	};

	public ClosureBinding[] ctx;

	public CompiledClosure(Parameter[] required, Parameter[] optional, Parameter[] keyword, SubLSymbol keys,
			SubLSymbol rest, SubLSymbol moreKeys) {
		super(required, optional, keyword, keys, rest, moreKeys);
	}

	public CompiledClosure(SubLObject lambdaList) {
		super(Lisp.list(LispSymbols.LAMBDA, lambdaList), null);
	}

	public CompiledClosure dup() {
		CompiledClosure result = null;
		try {
			result = (CompiledClosure) super.clone();
		} catch (Error e) {
			throw e;
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			if (e instanceof CloneNotSupportedException) {
			} else
				e.printStackTrace();
		}
		return result;
	}

	// Zero args.
	public SubLObject execute() {
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(0);
		return this.execute(args);
	}

	// One arg.
	public SubLObject execute(SubLObject first)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(1);
		args[0] = first;
		return this.execute(args);
	}

	// Two args.
	public SubLObject execute(SubLObject first, SubLObject second)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(2);
		args[0] = first;
		args[1] = second;
		return this.execute(args);
	}

	// Three args.
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(3);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		return this.execute(args);
	}

	// Four args.
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(4);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		args[3] = fourth;
		return this.execute(args);
	}

	// Five args.
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(5);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		args[3] = fourth;
		args[4] = fifth;
		return this.execute(args);
	}

	// Six args.
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(6);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		args[3] = fourth;
		args[4] = fifth;
		args[5] = sixth;
		return this.execute(args);
	}

	// Seven args.
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(7);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		args[3] = fourth;
		args[4] = fifth;
		args[5] = sixth;
		args[6] = seventh;
		return this.execute(args);
	}

	// Eight args.
	public SubLObject execute(SubLObject first, SubLObject second, SubLObject third, SubLObject fourth,
			SubLObject fifth, SubLObject sixth, SubLObject seventh, SubLObject eighth)

	{
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(8);
		args[0] = first;
		args[1] = second;
		args[2] = third;
		args[3] = fourth;
		args[4] = fifth;
		args[5] = sixth;
		args[6] = seventh;
		args[7] = eighth;
		return this.execute(args);
	}

	// Arg array.
	public SubLObject execute(SubLObject[] args)

	{
		return this.notImplemented();
	}

	private SubLObject notImplemented() {
		return Lisp.error(new WrongNumberOfArgumentsException(this));
	}

	public CompiledClosure setContext(ClosureBinding[] context) {
		this.ctx = context;
		return this;
	}

	public SubLObject typep(SubLObject typeSpecifier) {
		if (typeSpecifier == LispSymbols.COMPILED_FUNCTION)
			return Lisp.T;
		return super.typep(typeSpecifier);
	}
}
