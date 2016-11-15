/*
 * function_info.java
 *
 * Copyright (C) 2004-2005 Peter Graves
 * $Id: function_info.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class function_info {
	static EqualHashTable FUNCTION_TABLE = new EqualHashTable(64, Lisp.NIL, Lisp.NIL);

	// ### function-info name
	private static Primitive FUNCTION_INFO = new JavaPrimitive("function-info", Lisp.PACKAGE_SYS, false) {

		public SubLObject execute(SubLObject arg) {
			SubLObject info = function_info.FUNCTION_TABLE.getHT(arg);
			return info != null ? info : Lisp.NIL;
		}
	};

	// ### %set-function-info name info
	private static Primitive _SET_FUNCTION_INFO = new JavaPrimitive("%set-function-info", Lisp.PACKAGE_SYS, false) {

		public SubLObject execute(SubLObject name, SubLObject info)

		{
			if (info == Lisp.NIL)
				function_info.FUNCTION_TABLE.remhash(name);
			else
				function_info.FUNCTION_TABLE.putVoid(name, info);
			return info;
		}
	};

	// ### get-function-info-value name indicator => value
	private static Primitive GET_FUNCTION_INFO_VALUE = new JavaPrimitive("get-function-info-value", Lisp.PACKAGE_SYS,
			true, "name indicator") {

		public SubLObject execute(SubLObject name, SubLObject indicator)

		{
			// info is an alist
			SubLObject info = function_info.FUNCTION_TABLE.getHT(name);
			if (info != null)
				while (info != Lisp.NIL) {
					SubLObject cons = info.first();
					if (cons instanceof SubLCons) {
						if (cons.first().eql(indicator))
							// Found it.
							return LispThread.currentThread().setValues(cons.rest(), Lisp.T);
					} else if (cons != Lisp.NIL)
						Lisp.error(new TypeError(cons, LispSymbols.LIST));
					info = info.rest();
				}
			return LispThread.currentThread().setValues(Lisp.NIL, Lisp.NIL);
		}
	};

	// ### set-function-info-value name indicator value => value
	private static Primitive SET_FUNCTION_INFO_VALUE = new JavaPrimitive("set-function-info-value", Lisp.PACKAGE_SYS,
			true, "name indicator value") {

		public SubLObject execute(SubLObject name, SubLObject indicator, SubLObject value)

		{
			// info is an alist
			SubLObject info = function_info.FUNCTION_TABLE.getHT(name);
			if (info == null)
				info = Lisp.NIL;
			SubLObject alist = info;
			while (alist != Lisp.NIL) {
				SubLObject cons = alist.first();
				if (cons instanceof SubLCons) {
					if (cons.first().eql(indicator)) {
						// Found it.
						cons.setCdr(value);
						return value;
					}
				} else if (cons != Lisp.NIL)
					Lisp.error(new TypeError(cons, LispSymbols.LIST));
				alist = alist.rest();
			}
			// Not found.
			function_info.FUNCTION_TABLE.putVoid(name, info.push(LispObjectFactory.makeCons(indicator, value)));
			return value;
		}
	};

	// ### arglist
	private static Primitive ARGLIST = new JavaPrimitive("arglist", Lisp.PACKAGE_EXT, true,
			"extended-function-designator") {

		public SubLObject execute(SubLObject arg) {
			LispThread thread = LispThread.currentThread();
			Operator operator = function_info.getOperator(arg);
			SubLObject arglist = null;
			if (operator != null)
				arglist = operator.getLambdaList();
			SubLObject value1, value2;
			if (arglist instanceof SubLString) {
				String s = arglist.getString();
				// Give the string list syntax.
				s = "(" + s + ")";
				// Bind *PACKAGE* so we use the EXT package if we need
				// to intern any symbols.
				SpecialBindingsMark mark = thread.markSpecialBindings();
				thread.bindSpecial(LispSymbols._PACKAGE_, Lisp.PACKAGE_EXT);
				try {
					arglist = Lisp.readObjectFromString(s);
				} finally {
					thread.resetSpecialBindings(mark);
				}
				operator.setLambdaList(arglist);
			}
			if (arglist != null) {
				value1 = arglist;
				value2 = Lisp.T;
			} else {
				value1 = Lisp.NIL;
				value2 = Lisp.NIL;
			}
			return thread.setValues(value1, value2);
		}
	};

	// ### %set-arglist
	private static Primitive _SET_ARGLIST = new JavaPrimitive("%set-arglist", Lisp.PACKAGE_SYS, false) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			Operator operator = null;
			if (first instanceof Operator)
				operator = (Operator) first;
			else if (first instanceof SubLSymbol) {
				SubLObject function = first.getSymbolFunction();
				if (function instanceof Operator)
					operator = (Operator) function;
			}
			if (operator != null)
				operator.setLambdaList(second);
			return second;
		}
	};

	public static SubLObject coerce_function(SubLObject args, Environment env, boolean noError) {
		final SubLObject arg = args.first();
		if (arg instanceof SubLSymbol) {
			SubLObject operator = env.lookupFunction(arg);
			if (operator instanceof Autoload) {
				Autoload autoload = (Autoload) operator;
				autoload.load();
				operator = autoload.getSymbol().getSymbolFunction();
			}
			if (operator instanceof Function)
				return operator;
			if (operator instanceof StandardGenericFunction)
				return operator;
			if (noError)
				return Lisp.NIL;
			return Lisp.error(new UndefinedFunction(arg));
		}
		if (arg instanceof SubLCons) {
			SubLObject car = ((SubLCons) arg).first();
			if (car == LispSymbols.SETF) {
				SubLObject f = env.lookupFunction(arg);
				if (f != null)
					return f;
				SubLSymbol symbol = Lisp.checkSymbol(arg.second());
				f = Lisp.get(symbol, LispSymbols.SETF_FUNCTION, null);
				if (f != null)
					return f;
				f = Lisp.get(symbol, LispSymbols.SETF_INVERSE, null);
				if (f != null)
					return f;
			}
			if (car == LispSymbols.LAMBDA)
				return new Closure(arg, env);
			if (car == LispSymbols.NAMED_LAMBDA) {
				SubLObject name = arg.second();
				if (name instanceof SubLSymbol || Lisp.isValidSetfFunctionName(name))
					return new Closure(name, LispObjectFactory.makeCons(LispSymbols.LAMBDA, arg.cddr()), env);
				if (noError)
					return Lisp.NIL;
				return Lisp.type_error(name, Lisp.FUNCTION_NAME);
			}
		}
		if (noError)
			return Lisp.NIL;
		return Lisp.error(new UndefinedFunction(Lisp.list(Keyword.NAME, arg)));
	}

	static Operator getOperator(SubLObject obj)

	{
		if (obj instanceof Operator)
			return (Operator) obj;
		if (obj instanceof SubLSymbol) {
			SubLObject function = obj.getSymbolFunction();
			if (function instanceof Autoload) {
				Autoload autoload = (Autoload) function;
				autoload.load();
				function = autoload.getSymbol().getSymbolFunction();
			}
			if (function instanceof Operator) {
				Operator operator = (Operator) function;
				if (operator.getLambdaList() != null)
					return operator;
				SubLObject other = Lisp.get(obj, LispSymbols.MACROEXPAND_MACRO, null);
				if (other != null)
					return function_info.getOperator(other);
				else
					return null;
			}
		} else if (obj instanceof SubLCons && obj.first() == LispSymbols.LAMBDA)
			return new Closure(obj, new Environment());
		return null;
	}
}
